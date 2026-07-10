package com.debanuj.countrycrud.service;

import com.debanuj.countrycrud.model.Country;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class CountryService {

    private final List<Country> countryList = new ArrayList<>();

    public Country addCountry(Country country) {
        countryList.add(country);
        return country;
    }

    public List<Country> getAllCountries() {
        return countryList;
    }

    public Country updateCountry(String code, Country updatedCountry) {

        for (Country country : countryList) {

            if (country.getCode().equalsIgnoreCase(code)) {

                country.setName(updatedCountry.getName());

                return country;

            }

        }

        return null;

    }

    public String deleteCountry(String code) {

        Iterator<Country> iterator = countryList.iterator();

        while (iterator.hasNext()) {

            Country country = iterator.next();

            if (country.getCode().equalsIgnoreCase(code)) {

                iterator.remove();

                return "Country deleted successfully";

            }

        }

        return "Country not found";

    }

}