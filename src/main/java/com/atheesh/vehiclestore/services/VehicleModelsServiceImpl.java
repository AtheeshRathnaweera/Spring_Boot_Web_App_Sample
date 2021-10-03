package com.atheesh.vehiclestore.services;

import com.atheesh.vehiclestore.models.VehicleModel;
import reactor.core.publisher.Flux;

public interface VehicleModelsServiceImpl {
    Flux<VehicleModel> findAll();
}
