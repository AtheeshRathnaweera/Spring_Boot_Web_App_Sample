package com.atheesh.vehiclestore.services;

import com.atheesh.vehiclestore.models.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UsersServiceImpl {
    Flux<User> getAll();

    Mono<User> getById(long id);
}
