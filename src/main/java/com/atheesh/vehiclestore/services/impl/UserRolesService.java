package com.atheesh.vehiclestore.services.impl;

import com.atheesh.vehiclestore.models.User;
import com.atheesh.vehiclestore.models.UserRole;
import com.atheesh.vehiclestore.services.UserRolesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.time.Duration;

@Service
public class UserRolesService implements UserRolesServiceImpl {
    @Autowired
    WebClient webClient;

    @Override
    public Flux<UserRole> getAll() {
        return webClient.get()
                .uri("/userroles")
                .retrieve()
                .bodyToFlux(UserRole.class)
                .timeout(Duration.ofMillis(10_000));
    }
}
