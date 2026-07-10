package com.debanuj.countryservice.controller;

import com.debanuj.countryservice.model.Country;
import com.debanuj.countryservice.service.CountryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {

    private final CountryService service;

    public CountryController(CountryService service) {
        this.service = service;
    }

    @GetMapping
    public List<Country> getCountries() {
        return service.getAllCountries();
    }

    @GetMapping("/{code}")
    public Country getCountry(@PathVariable String code) {
        return service.getCountry(code);
    }

}