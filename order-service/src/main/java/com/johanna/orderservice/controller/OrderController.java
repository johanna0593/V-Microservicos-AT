package com.johanna.orderservice.controller;

import com.johanna.orderservice.service.UserClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class OrderController {

    private final UserClientService userClientService;

    public OrderController(UserClientService userClientService) {
        this.userClientService = userClientService;
    }

    @GetMapping("/orders/{userId}")
    public Mono<String> getOrderWithUser(@PathVariable Long userId) {
        return userClientService.getUserById(userId)
                .map(user -> "Pedido do usuário: " + user.getName());
    }
}
