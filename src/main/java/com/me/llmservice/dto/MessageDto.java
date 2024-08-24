package com.me.llmservice.dto;

import lombok.Data;

@Data
public class MessageDto {
    private String role;

    private String content;
}
