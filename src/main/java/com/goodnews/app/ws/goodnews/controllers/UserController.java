package com.goodnews.app.ws.goodnews.controllers;

import com.goodnews.app.ws.goodnews.models.requests.UserDetailsRequestBody;
import com.goodnews.app.ws.goodnews.models.responses.UserDetailsResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "${urlPrefix}/users")
public class UserController {

    @GetMapping
    public String getUser(){
        return "User";
    }

    @PostMapping
    public UserDetailsResponse createUser(@RequestBody UserDetailsRequestBody userDetails) {
        return null;
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
