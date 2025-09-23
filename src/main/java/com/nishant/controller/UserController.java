package com.nishant.controller;

import com.nishant.modal.User;   // ✅ Capitalized class name

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/api/users")
    public User getUser() {
        User user = new User();
        user.setEmail("nishant@gmail.com");
        user.setFullName("Nishant Gaur");
        user.setPhone("+91 9098765678");
        user.setRole("customer");
        return user;
    }
}
