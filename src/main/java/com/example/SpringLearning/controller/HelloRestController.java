package com.example.SpringLearning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello from Bridgelabz!";
    }
}
