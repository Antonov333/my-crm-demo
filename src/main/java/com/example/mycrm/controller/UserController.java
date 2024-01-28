package com.example.mycrm.controller;

import com.example.mycrm.model.Person;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Controller for CRUD operations with Person entity models users of the applications and other people they negotiate with, attaching and detaching persons from companies (BusinessEntity)
 */
@RestController
@RequestMapping("/user")
@Tag(name = "User Controller", description = "Controller for CRUD operations with Person entity models users of the applications and other people they negotiate with, attaching and detaching persons from companies (BusinessEntity)")
public class UserController {
    @GetMapping()
    ResponseEntity<List<Person>> viewUsers() {
        return new ResponseEntity<>(new ArrayList<>(), HttpStatusCode.valueOf(200));
    }
}
