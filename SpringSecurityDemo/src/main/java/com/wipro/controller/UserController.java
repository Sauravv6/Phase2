package com.wipro.controller;

import org.springframework.web.bind.annotation.*;

import com.wipro.model.User;
import com.wipro.service.CustomUserDetailsService;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final CustomUserDetailsService userDetailsService;

    public UserController(CustomUserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    @PostMapping("/register")
    public String registerUser(@RequestBody User user) {
        userDetailsService.saveUser(user);
        return "User registered successfully!";
    }
}
