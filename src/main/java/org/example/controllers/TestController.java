package org.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/hello-world")

    public String getHelloWorld()
    {
        return "Hello world from project two";
    }
}
