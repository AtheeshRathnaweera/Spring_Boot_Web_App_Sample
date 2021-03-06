package com.atheesh.vehiclestore.services.impl;

import com.atheesh.vehiclestore.models.User;
import com.atheesh.vehiclestore.services.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Service
public class UsersService implements UsersServiceImpl {
    @Autowired
    WebClient webClient;

    @Override
    public Flux<User> getAll() {
        return webClient.get()
                .uri("/users")
                .retrieve()
                .bodyToFlux(User.class)
                .timeout(Duration.ofMillis(10_000));
    }

    @Override
    public Mono<User> getById(long id) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/users/{id}")
                        .build(id))
                .retrieve()
                .bodyToMono(User.class)
                .timeout(Duration.ofMillis(10_000));
    }
}
