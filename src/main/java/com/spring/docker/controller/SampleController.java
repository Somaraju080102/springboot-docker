package com.spring.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	
	@GetMapping("/")
	public String message() {
		
		return "Hello Somaraju Welcome to the Docker Application";
		
	}
	
	
	@GetMapping("/hello")
	public String greetings() {
		
		return " Hello Somaraju";
		
	}

}
