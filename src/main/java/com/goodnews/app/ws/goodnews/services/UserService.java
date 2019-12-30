package com.goodnews.app.ws.goodnews.services;

import com.goodnews.app.ws.goodnews.shared.dtos.UserDTO;

public interface UserService {
    UserDTO createUser(UserDTO userDTO);
}
