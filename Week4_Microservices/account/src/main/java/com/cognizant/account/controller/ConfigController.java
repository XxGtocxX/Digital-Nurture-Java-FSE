package com.cognizant.account.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Value("${account.message}")
    private String message;

    @Value("${account.owner}")
    private String owner;

    @GetMapping("/config")
    public String getConfiguration() {

        return """
                Message : %s
                
                Owner : %s
                """.formatted(message, owner);
    }
}