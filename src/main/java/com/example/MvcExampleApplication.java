package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
@SpringBootApplication
public class MvcExampleApplication {
	@GetMapping("/")
	public String he(){
		System.out.println("**Hello****");
		return "hello";
	}

	public static void main(String[] args) {
		SpringApplication.run(MvcExampleApplication.class, args);
	}
}
