package com.codingdojo.helloHuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloHumanController {
	@RequestMapping("/")
	public String human(
			@RequestParam(value="firstName", required=false) String firstName, 
			@RequestParam(value="lastName", required=false) String lastName, 
			@RequestParam(value="times", required=false) Integer times ) {
		
		if (firstName == null) {
			return "Hello Human";
		}
		else if (lastName == null) {
			return "Hello " + firstName;
		}
		
		else if (times != null) {
			String str = "Hello " + firstName + " ";
			return str.repeat(times);
		}
			
		else {
			return "Hello " + firstName + " " + lastName;
		}
		
	}
	}
			
	
	
	
