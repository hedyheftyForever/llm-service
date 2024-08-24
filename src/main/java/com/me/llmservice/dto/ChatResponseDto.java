package com.me.llmservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class ChatResponseDto {
    private String model;

    @JsonProperty("created_at")
    private ZonedDateTime createdAt;

    private MessageDto message;

    private Boolean done;

    @JsonProperty("total_duration")
    private Long totalDuration;

    @JsonProperty("load_duration")
    private Long loadDuration;

    @JsonProperty("prompt_eval_count")
    private Long promptEvalCount;

    @JsonProperty("prompt_eval_duration")
    private Long promptEvalDuration;

    @JsonProperty("eval_count")
    private Long evalCount;

    @JsonProperty("eval_duration")
    private Long evalDuration;
}
