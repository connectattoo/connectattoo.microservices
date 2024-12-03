package com.connectattoo.template.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RotaController {
    
    @GetMapping("/rota")
    public String hello() {
        return "Hello World!";
    }
}
