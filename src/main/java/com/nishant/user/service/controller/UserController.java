package com.nishant.user.service.controller;

import com.nishant.user.service.modal.User;
import com.nishant.user.service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/api/users")
    public User createUser(User user){
        return userRepository.save(user);
    }
    @GetMapping("/api/users")
    public User getUser() {
        User user = new User();
        user.setEmail("nishant@gmail.com");
        user.setFullName("Nishant Gaur");
        user.setPhone("+91 9098765678");
        user.setRole("Customer");
        return user;
    }
}