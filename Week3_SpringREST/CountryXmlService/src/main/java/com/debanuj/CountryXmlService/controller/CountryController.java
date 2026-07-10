package com.debanuj.CountryXmlService.controller;

import com.debanuj.CountryXmlService.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @Autowired
    private Country country;

    @GetMapping("/country")
    public Country getCountry() {
        return country;
    }

}