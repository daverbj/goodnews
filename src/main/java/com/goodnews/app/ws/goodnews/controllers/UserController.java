package com.goodnews.app.ws.goodnews.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

    @GetMapping
    public String getUser(){
        return "User";
    }

    @PostMapping
    public String createUser() {
        return "Create user";
    }

    @PutMapping
    public String updateUser() {
        return "Create user";
    }

    @DeleteMapping
    public String deleteUser() {
        return "Create user";
    }


}
