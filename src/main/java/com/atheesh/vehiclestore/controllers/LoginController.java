package com.atheesh.vehiclestore.controllers;

import com.atheesh.vehiclestore.models.LoginRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String showLogin(Model model) {
        System.out.println("login called");
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setPassword(null);

        model.addAttribute("loginRequest", loginRequest);
        return "login";
    }
}
