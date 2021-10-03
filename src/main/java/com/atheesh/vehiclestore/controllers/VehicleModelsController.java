package com.atheesh.vehiclestore.controllers;

import com.atheesh.vehiclestore.models.VehicleModel;
import com.atheesh.vehiclestore.services.impl.VehicleModelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Flux;

import java.util.List;

@Controller
@RequestMapping("/vehicle-model")
public class VehicleModelsController {
    @Autowired
    private VehicleModelsService vehicleModelsService;

    @GetMapping
    public String show(Model model) {
        Flux<VehicleModel> vehicleModelFlux = vehicleModelsService.findAll();
        List<VehicleModel> vehicleModelList = vehicleModelFlux.collectList().block();

        model.addAttribute("vehicleModels", vehicleModelList);
        return "vehicle-models";
    }
}
