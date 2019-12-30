package com.goodnews.app.ws.goodnews.repository;

import com.goodnews.app.ws.goodnews.io.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
}
