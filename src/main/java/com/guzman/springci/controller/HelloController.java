package com.guzman.springci.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Hello world";
    }

    @GetMapping("/hellos")
    public ArrayList<String> getHellos() {
        var hellos = new ArrayList<String>();

        hellos.add("hello");
        hellos.add("Hello");

        return hellos;
    }
}
