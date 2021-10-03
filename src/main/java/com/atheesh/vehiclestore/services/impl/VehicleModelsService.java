package com.atheesh.vehiclestore.services.impl;

import com.atheesh.vehiclestore.models.VehicleModel;
import com.atheesh.vehiclestore.services.VehicleModelsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.time.Duration;

@Service
public class VehicleModelsService implements VehicleModelsServiceImpl {

    @Autowired
    WebClient webClient;

    @Override
    public Flux<VehicleModel> findAll() {
        return webClient.get()
                .uri("/vehiclemodels")
                .retrieve()
                .bodyToFlux(VehicleModel.class)
                .timeout(Duration.ofMillis(10_000));
    }
}
