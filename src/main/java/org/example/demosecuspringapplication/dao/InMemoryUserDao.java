package org.example.demosecuspringapplication.dao;

import org.example.demosecuspringapplication.entity.UserEntity;
import org.example.demosecuspringapplication.service.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Stream;

@Repository
public class InMemoryUserDao implements UserDao {
    private final Map<UUID, UserEntity> users = new HashMap<>(); // Store users in memory

    @Override
    public Stream<UserEntity> findAll() {
        return users.values().stream(); // Return all users as a Stream
    }

    @Override
    public Optional<UserEntity> findById(UUID userId) {
        return Optional.ofNullable(users.get(userId)); // Fetch user by ID
    }

    @Override
    public User upsert(User user) {
        return user;
    }

    @Override
    public UserEntity upsert(UserEntity user) {
        if (user.getId() == null) {
            user.setId(UUID.randomUUID()); // Generate UUID if new user
        }
        users.put(user.getId(), user); // Store or update user
        return user;
    }



    @Override
    public void delete(UUID userId) {
        users.remove(userId); // Remove user by ID
    }
}
