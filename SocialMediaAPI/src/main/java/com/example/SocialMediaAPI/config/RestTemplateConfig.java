package com.example.SocialMediaAPI.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    public static RestTemplate restTemplate;

    @Bean
    private static void getRestTemplate() {
       restTemplate = new RestTemplate();
    }
}
