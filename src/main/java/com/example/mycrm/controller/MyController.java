package com.example.mycrm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping()
    public String homePage(){
        return "Home";
    }
}
