package com.me.llmservice.controller;

import com.me.llmservice.dto.ChatRequestDto;
import com.me.llmservice.dto.ChatResponseDto;
import com.me.llmservice.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chat")
public class ChatController {

    @Autowired
    private ChatService chatService;

    @PostMapping("/blocking")
    public ResponseEntity<ChatResponseDto> chat(@RequestBody ChatRequestDto chatRequestDto) {
        chatRequestDto.setStream(false);
        return new ResponseEntity<>(chatService.chat(chatRequestDto), HttpStatus.OK);
    }
}
