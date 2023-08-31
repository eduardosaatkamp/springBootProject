package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class HelloSpringApplication {
	// método main
	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
	}
}
// não alterou aqui
// as anotações fazem um pré processamento;