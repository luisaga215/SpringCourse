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

    //Expose new endpoint
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    //Expose new endpoint
    @GetMapping("/helloagain")
    public String sayHelloAgain() {
        return "Hellouu world again!";
    }
}
