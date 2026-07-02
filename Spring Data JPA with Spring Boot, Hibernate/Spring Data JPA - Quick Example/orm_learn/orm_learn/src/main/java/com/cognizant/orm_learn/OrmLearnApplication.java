package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

	@Autowired
	private CountryService service;

	public static void main(String[] args) {
		SpringApplication.run(OrmLearnApplication.class, args);
	}

	@Override
	public void run(String... args) {

		service.saveCountry(new Country("IN", "India"));
		service.saveCountry(new Country("US", "United States"));
		service.saveCountry(new Country("JP", "Japan"));

		System.out.println(service.getAllCountries());

		System.out.println(service.getCountry("IN"));
	}
}