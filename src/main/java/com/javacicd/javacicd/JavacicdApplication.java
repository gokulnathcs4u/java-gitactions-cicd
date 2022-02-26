package com.javacicd.javacicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavacicdApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavacicdApplication.class, args);
	}

	@GetMapping("/welcome")
	public String welcome() {
		return "Hello World";
	}

	// echo "# java-gitactions-cicd" >> README.md
	// git init
	// git add README.md
	// git commit -m "first commit"
	// git branch -M main
	// git remote add origin
	// https://github.com/gokulnathcs4u/java-gitactions-cicd.git
	// git push -u origin main

}
