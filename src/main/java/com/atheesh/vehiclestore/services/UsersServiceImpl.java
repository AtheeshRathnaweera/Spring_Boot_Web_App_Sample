package com.atheesh.vehiclestore.services;

import com.atheesh.vehiclestore.models.User;
import reactor.core.publisher.Flux;

public interface UsersServiceImpl {
    Flux<User> getAll();
}
