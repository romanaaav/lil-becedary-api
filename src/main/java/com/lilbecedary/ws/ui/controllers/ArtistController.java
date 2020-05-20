package com.lilbecedary.ws.ui.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/artists") //Http://localhost:8080/lilbecedary/api/artists
public class ArtistController {
	
	@GetMapping	// This has to accept all the artists query strings
	public String getArtists() { 
		return "This will return a collection of artist very soon.";
	}
	
	@GetMapping(path = "/{publicId}") 
	public String getArtist() {
		return "This will return an artist very soon.";
	}
	
	
}
