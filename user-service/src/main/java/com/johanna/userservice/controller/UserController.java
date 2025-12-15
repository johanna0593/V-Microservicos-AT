package com.johanna.userservice.controller;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/{id}")
    public Mono<String> getUser(@PathVariable Long id) {
        return Mono.just("Usuário ID: " + id);
    }
}
