package com.kipper.emailservice;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Olá {
    @GetMapping("/")
    public String getMethodName(@RequestParam String param) {
        return "Deu certo";
    }
    
}
