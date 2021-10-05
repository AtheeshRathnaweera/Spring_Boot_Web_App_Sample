package com.atheesh.vehiclestore.services;

import com.atheesh.vehiclestore.models.UserRole;
import reactor.core.publisher.Flux;

public interface UserRolesServiceImpl {
    Flux<UserRole> getAll();
}
