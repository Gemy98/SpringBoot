package com.spring.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
//localhost:8080/api
public class TestingController {
    @Value("${admin.name}")
    private String name ;

    //localhost:8080/api/name
    @GetMapping("/name")
    public String getHome(){

        return "i am  :"+name;
    }

    //localhost:8080/api/age
    @GetMapping("/age")
    public String getAge(){

        return "25";
    }

    //localhost:8080/api/address
    @GetMapping("/address")
    public String getAddress(){

        return "Cairo";
    }

    //localhost:8080/api/phone
    @GetMapping("/phone")
    public String getPhone(){

        return "01068440098";
    }

}
