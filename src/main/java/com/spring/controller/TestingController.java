package com.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
//localhost:8080/api
public class TestingController {

    //localhost:8080/api/name
    @GetMapping("/name")
    public String getHome(){

        return "i am Gemy";
    }

}
