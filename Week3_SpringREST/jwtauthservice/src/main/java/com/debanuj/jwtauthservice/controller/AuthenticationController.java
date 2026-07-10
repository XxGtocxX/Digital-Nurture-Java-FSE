package com.debanuj.jwtauthservice.controller;

import com.debanuj.jwtauthservice.dto.LoginResponse;
import com.debanuj.jwtauthservice.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    @Autowired
    private JwtService jwtService;

    @GetMapping("/authenticate")
    public LoginResponse authenticate(
            @RequestHeader("Authorization") String authHeader) {

        System.out.println("Authorization Header: " + authHeader);

        String token = jwtService.generateToken("admin");

        return new LoginResponse(token);
    }
}