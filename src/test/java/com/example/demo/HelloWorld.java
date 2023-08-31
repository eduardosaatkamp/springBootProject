package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// Informamos ao Spring que essa classe é um controller
@Controller
public class HelloWorld {
    // Não funciona no opera
    // Configuramos esse método para ser executado quando
    // o usuário acessar localhost:8080.
    // Esse endereço é padrão.
    @GetMapping
    @ResponseBody
    public String hello() {
        return "Hello world!";
    }
}