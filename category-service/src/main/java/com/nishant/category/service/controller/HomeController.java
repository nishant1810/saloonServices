package com.nishant.category.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String HmeControllerHander(){
        return "Category Service for salon booking service";
    }
}
