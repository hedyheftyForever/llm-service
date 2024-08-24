package com.me.llmservice.dto;

import lombok.Data;

import java.util.List;

@Data
public class ChatRequestDto {
    private String model;

    private List<MessageDto> messages;

    private boolean stream;
}
