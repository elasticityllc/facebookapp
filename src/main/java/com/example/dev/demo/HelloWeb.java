package com.example.dev.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWeb {

	@GetMapping("/web")
	public String index() {
		return "Hello this is a draft Web App!";
	}

}