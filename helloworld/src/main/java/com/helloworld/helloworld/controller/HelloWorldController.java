package com.helloworld.helloworld.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
@GetMapping
public String helloWorld() {
	return "Hello World!!!";
}


@GetMapping("/bsm")
public List<String> bsm(){
	return Arrays.asList("proatividade",
					"Trabalho em equipe",
					"Comunicação",
					"Mentalidade de Crescimento",
					"Orientação ao futuro",
					"Responsabilidade pessoal",
					"Persistencia",
					"atenção aos detalhes");
}
@GetMapping("/objetivos")
public List<String> objetivos(){
	return Arrays.asList(
			"Aprender Spring Boot",
			"Entender APIs RESTful",
			"Desenvolver Blog Pessoal",
			"Denvolver H- Tecnica",
			"Desenvolver projeto integrador");
}
}