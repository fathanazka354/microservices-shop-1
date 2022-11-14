package com.springmicroservice.orderservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebClientConfig {
    @Bean
    public WebClient webClient(){
        return org.springframework.web.reactive.function.client.WebClient.builder().build();
    }
}
