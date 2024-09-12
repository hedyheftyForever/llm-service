package com.me.llmservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LLMApplication {
    public static void main(String[] args) {
        SpringApplication.run(LLMApplication.class,args);
    }
}
