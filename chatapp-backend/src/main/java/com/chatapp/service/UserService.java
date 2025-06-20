package com.chatapp.service;

import org.springframework.stereotype.Service;
import com.chatapp.model.User;

@Service
public class UserService {

    public String register(User user) {
        // Save user logic (mock)
        return "User registered successfully.";
    }

    public String login(User user) {
        // Authenticate user logic (mock)
        return "User logged in successfully.";
    }
}
