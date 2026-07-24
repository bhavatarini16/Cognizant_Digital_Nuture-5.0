package com.example.spring_learn.controller;

import com.example.spring_learn.Country;
import com.example.spring_learn.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {

        System.out.println("START - getCountry()");

        Country country = countryService.getCountry(code);

        System.out.println("END - getCountry()");

        return country;
    }

}