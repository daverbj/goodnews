package com.goodnews.app.ws.goodnews.controllers;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.goodnews.app.ws.goodnews.models.requests.UserDetailsRequestBody;
import com.goodnews.app.ws.goodnews.models.responses.UserDetailsResponse;
import com.goodnews.app.ws.goodnews.services.UserService;
import com.goodnews.app.ws.goodnews.shared.dtos.UserDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "${urlPrefix}/users")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping
    public String getUser(){
        return "User";
    }

    @PostMapping
    public UserDetailsResponse createUser(@RequestBody UserDetailsRequestBody userDetailsRequestBody) {
        UserDetailsResponse response = new UserDetailsResponse();
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(userDetailsRequestBody, userDTO);

        UserDTO createdUser = userService.createUser(userDTO);

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
