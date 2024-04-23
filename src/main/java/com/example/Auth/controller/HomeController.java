package com.example.Auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "Hello World";
    }
    @GetMapping("/Secured")
    public String secured(){
        return "Hello World Secured";
    }
}
