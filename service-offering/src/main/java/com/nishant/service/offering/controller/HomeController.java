package com.nishant.service.offering;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping
    public String HomeControllerHandler(){
        return "service offering microservices for salon booking system";
    }
}