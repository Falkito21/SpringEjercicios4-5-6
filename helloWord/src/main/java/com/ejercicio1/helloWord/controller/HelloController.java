package com.ejercicio1.helloWord.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/saludo")
    public String saludo(){
        return "Hola buenas tardes mi nombres es Juan Falco";
    }
}
