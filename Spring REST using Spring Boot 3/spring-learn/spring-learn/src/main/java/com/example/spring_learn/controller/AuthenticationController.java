package com.example.spring_learn.controller;

import com.example.spring_learn.model.AuthenticationRequest;
import com.example.spring_learn.model.AuthenticationResponse;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthenticationController {

    @PostMapping("/authenticate")
    public AuthenticationResponse createAuthenticationToken(
            @RequestBody AuthenticationRequest request) {

        System.out.println("START - Authentication");

        System.out.println("Username : " + request.getUsername());
        System.out.println("Password : " + request.getPassword());

        System.out.println("END - Authentication");

        // Dummy token for now
        return new AuthenticationResponse("dummy-jwt-token");
    }
}