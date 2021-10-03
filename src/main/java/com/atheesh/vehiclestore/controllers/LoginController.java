package com.atheesh.vehiclestore.controllers;

import com.atheesh.vehiclestore.models.LoginRequest;
import com.sun.net.httpserver.Authenticator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @PostMapping("/login/process")
    public String actionLogin(Model model, @ModelAttribute("loginRequest") LoginRequest loginRequest) {
        System.out.println("login post called " + loginRequest.toString());
//        Notification notification = new Notification();
//
//        notification.setMessage("Login failed.");
//        notification.setType("error");
//        model.addAttribute("notification", notification);
        return "login";
    }
}
