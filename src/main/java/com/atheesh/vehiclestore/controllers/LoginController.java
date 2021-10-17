package com.atheesh.vehiclestore.controllers;

import com.atheesh.vehiclestore.models.LoginRequest;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String showLogin(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        if (auth.getPrincipal() instanceof UserDetails) {
            System.out.println("already logged in !");
            return "redirect:/home";
        } else {
            System.out.println("login called");
            LoginRequest loginRequest = new LoginRequest();
            loginRequest.setPassword(null);

            model.addAttribute("loginRequest", loginRequest);
            return "login";
        }
    }
}
