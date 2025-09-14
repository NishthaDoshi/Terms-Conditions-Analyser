package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                String frontendUrl = System.getenv("FRONTEND_URL");
                if (frontendUrl != null) {
                    registry.addMapping("/**").allowedOrigins(frontendUrl);
                } else {
                    // This is for local development only
                    registry.addMapping("/**").allowedOrigins("http://localhost:5173");
                }
            }
        };
    }
}