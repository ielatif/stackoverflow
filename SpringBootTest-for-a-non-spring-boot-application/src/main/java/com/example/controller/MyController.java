package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by issam on 05/10/2016.
 */
@RestController
public class MyController {

    @GetMapping("/")
    public String hello() {
        System.out.println("Hello called");
        return "Hello";
    }

}
