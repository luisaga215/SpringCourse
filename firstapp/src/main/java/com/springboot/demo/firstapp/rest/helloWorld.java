package com.springboot.demo.firstapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorld {
    //Expose '/' that will return "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }
}
