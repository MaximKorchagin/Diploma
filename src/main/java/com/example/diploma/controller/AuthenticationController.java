package com.example.diploma.controller;

import com.example.diploma.service.AuthenticationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AuthenticationController {

    public AuthenticationService authenticationService;
    @PostMapping("/login")
    public String authenticationLogin() {
        return "auth-token";
    }

    @PostMapping("/logout")
    public void logout() {

    }
}
