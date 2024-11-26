package com.atividadeHelloWorld.atividade_hello_world.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/bsm")
    public String getBSMs() {
        return "Orientação ao detalhe, Responsabilidade pessoal, Mentalidade de Crescimento e Persistência";
    }

    @GetMapping("/objetivos")
    public String getObjetivos() {
        return "Aprender Spring Boot, fazer exercícios de fixação em Java";
    }
}
