package com.lilbecedary.ws.ui.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/media") //Http://localhost:8080/lilbecedary/api/media
public class MediaController {
	
	@GetMapping
	public String getMedias() {
		return "Soon this will send several social media accounts.";
	}
	
	@GetMapping(path = "/{publicId}")
	public String getMedia() {
		return "Soon this will a specific social media account.";
	}
}
