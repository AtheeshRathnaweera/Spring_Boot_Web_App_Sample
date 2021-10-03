package com.atheesh.vehiclestore.controllers;

import com.atheesh.vehiclestore.models.User;
import com.atheesh.vehiclestore.services.impl.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Flux;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping
    public String show(Model model) {
        Flux<User> userFlux = usersService.getAll();
        List<User> userList = userFlux.collectList().block();

        model.addAttribute("users", userList);
        return "users";
    }
}
