package com.johanna.orderservice.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class UserClientService {

    private final WebClient webClient;

    public UserClientService(WebClient webClient) {
        this.webClient = webClient;
    }

    public Mono<String> getUserById(Long id) {
        return webClient.get()
                .uri("/users/{id}", id)
                .retrieve()
                .bodyToMono(String.class);
    }
}
