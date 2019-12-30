package com.goodnews.app.ws.goodnews.services.impl;

import com.goodnews.app.ws.goodnews.io.entity.UserEntity;
import com.goodnews.app.ws.goodnews.repository.UserRepository;
import com.goodnews.app.ws.goodnews.services.UserService;
import com.goodnews.app.ws.goodnews.shared.dtos.UserDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public UserDTO createUser(UserDTO userDTO) {
        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(userDTO, userEntity);
        userEntity.setUserId(UUID.randomUUID().toString());
        UserEntity insertedUser =  userRepository.save(userEntity);
        UserDTO userResponse = new UserDTO();
        BeanUtils.copyProperties(insertedUser, userResponse);
        return userResponse;
    }
}
