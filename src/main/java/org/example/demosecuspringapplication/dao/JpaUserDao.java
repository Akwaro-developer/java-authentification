package org.example.demosecuspringapplication.dao;


import org.example.demosecuspringapplication.entity.UserEntity;
import org.example.demosecuspringapplication.repository.UserRepository;
import org.example.demosecuspringapplication.service.User;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Stream;

@Repository
@Primary
public class JpaUserDao  implements UserDao {
    private final UserRepository repository;

    public JpaUserDao(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public Stream<UserEntity> findAll() {
        List<UserEntity> users = repository.findAll();
        return users.stream();
    }

    @Override
    public Optional<UserEntity> findById(UUID userId) {
        return repository.findById(userId);
    }

    @Override
    public User upsert(User user) {
        return null;
    }

    @Override
    public UserEntity upsert(UserEntity user) {
        return repository.save(user);
    }

    @Override
    public void delete(UUID userId) {
        repository.deleteById(userId);
    }
}
