package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcome {

    @RequestMapping(path="/api")
    public String sayHi()
    {
        return  "Div";
    }
}
