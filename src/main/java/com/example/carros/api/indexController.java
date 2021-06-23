package com.example.carros.api;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class indexController {

	@GetMapping
	public String consultaCarroGet() {
		return "Get spring boot";
	}
	
	@PostMapping
	public String carroPost() {
		return "Post Spring boot";
	}
	
	@PutMapping
	public String atualizaCarro() {
		return "Put spring boot";
	}
	
	@DeleteMapping
	public String deletaCarro() {
		return "Delete spring boot";
	}
}
