package com.johanna.orderservice.client;

import com.johanna.orderservice.dto.UserDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class UserClient {

    private final WebClient webClient;

    public UserClient(WebClient userWebClient) {
        this.webClient = userWebClient;
    }

    public Mono<UserDTO> getUserById(Long id) {
        return webClient.get()
                .uri("/users/{id}", id)
                .retrieve()
                .bodyToMono(UserDTO.class);
    }
}
