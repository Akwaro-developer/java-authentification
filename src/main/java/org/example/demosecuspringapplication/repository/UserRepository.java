package org.example.demosecuspringapplication.repository;

import org.example.demosecuspringapplication.entity.UserEntity;
import org.example.demosecuspringapplication.service.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<UserEntity, UUID> {
    Optional<UserEntity> findByUsername(String username);

}
