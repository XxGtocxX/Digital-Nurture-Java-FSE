package com.debanuj.countrycrud.controller;

import com.debanuj.countrycrud.model.Country;
import com.debanuj.countrycrud.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    @PostMapping("/countries")
    public Country addCountry(@jakarta.validation.Valid
                              @RequestBody Country country) {
        return countryService.addCountry(country);
    }

    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }

    @PutMapping("/countries/{code}")
    public Country updateCountry(@PathVariable String code,
                                 @RequestBody Country country) {
        return countryService.updateCountry(code, country);
    }

    @DeleteMapping("/countries/{code}")
    public String deleteCountry(@PathVariable String code) {
        return countryService.deleteCountry(code);
    }
}