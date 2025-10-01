package com.nishant.user.service.controller;

import com.nishant.user.service.modal.User;
import com.nishant.user.service.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor

@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

//    public UserController(UserService userService) {
//        this.userService = userService;
//    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody @Valid User user) {
        User createdUser = userService.createUser(user);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<User>> getUsers() {
        List<User> users = userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) throws Exception {
        User user = userService.getUserById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@RequestBody @Valid User user, @PathVariable Long id) throws Exception {
        User updatedUser = userService.updateUser(id, user);
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUserById(@PathVariable Long id) throws Exception {
        userService.deleteUser(id);
        return new ResponseEntity<>("User deleted", HttpStatus.ACCEPTED); // ✅ fixed
    }
}
