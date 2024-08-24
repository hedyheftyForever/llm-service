package com.me.llmservice.service;

import com.me.llmservice.dto.ChatRequestDto;
import com.me.llmservice.dto.ChatResponseDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ChatService {

    private static final String OLLAMA_HOST = "http://127.0.0.1:11434";

    private WebClient webClient;

    public ChatService() {
        webClient = WebClient.builder().baseUrl(OLLAMA_HOST).build();
    }

    public ChatResponseDto chat(ChatRequestDto chatRequestDto) {
        return webClient
                .post()
                .uri("/api/chat")
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                //.bodyValue("{\"model\": \"llama3.1\", \"messages\": [{\"role\": \"user\", \"content\": \"why is the sky blue?\"}], \"stream\": false}")
                .body(Mono.just(chatRequestDto), ChatRequestDto.class)
                .retrieve()
                .bodyToMono(ChatResponseDto.class)
                .block();
    }
}
