package com.example.SimpleWebApp.controller;

import com.example.SimpleWebApp.model.Users;
import com.example.SimpleWebApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Users addUser(@RequestBody Users user){
        return userService.addUser(user);
    }

    @PostMapping("/login")
    public String loginUser(@RequestBody Users user){
        System.out.println("login user");
        return userService.verify(user);
    }

}
