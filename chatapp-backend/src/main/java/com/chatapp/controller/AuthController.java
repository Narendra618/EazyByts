package com.chatapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.chatapp.model.User;
import com.chatapp.service.UserService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String registerUser(@RequestBody User user) {
        return userService.register(user);
    }

    @PostMapping("/login")
    public String loginUser(@RequestBody User user) {
        return userService.login(user);
    }
}
