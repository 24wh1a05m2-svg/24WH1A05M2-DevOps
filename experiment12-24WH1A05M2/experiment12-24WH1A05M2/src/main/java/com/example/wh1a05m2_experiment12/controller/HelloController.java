package com.example.wh1a05m2_experiment12.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        System.out.println("Hello SpringBoot - Experiment 12");
        return "Hello SpringBoot - Experiment 12";
    }
}
