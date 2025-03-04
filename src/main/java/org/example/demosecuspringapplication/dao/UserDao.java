package org.example.demosecuspringapplication.dao;

import org.example.demosecuspringapplication.entity.UserEntity;
import org.example.demosecuspringapplication.service.User;

import java.util.Optional;
import java.util.UUID;
import java.util.stream.Stream;

public interface UserDao {
    Stream<UserEntity> findAll();
    Optional<UserEntity> findById(UUID userId);
    User upsert(User user);

    UserEntity upsert(UserEntity user);

    void delete(UUID userId);
}
