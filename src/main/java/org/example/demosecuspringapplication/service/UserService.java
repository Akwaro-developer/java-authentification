package org.example.demosecuspringapplication.service;

import org.example.demosecuspringapplication.entity.UserEntity;

import java.util.Optional;
import java.util.UUID;

public interface UserService {
    User createUser(String email, String password);
    Optional<UserEntity> getUser(UUID userId);
}
