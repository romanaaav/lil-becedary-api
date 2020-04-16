package com.lilbecedary.ws.ui.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cities") //Http://localhost:8080/lilbecedary/api/cities
public class CityController {
	
	@GetMapping //This has to accept all cities query strings.
	public String getCities() {
		return "This will return several cities very soon.";
	}
	
	@GetMapping(path = "/{publicId}") //This has to accept all city query strings.
	public String getCity() {
		return "This will return a city very soon.";
	}
}
