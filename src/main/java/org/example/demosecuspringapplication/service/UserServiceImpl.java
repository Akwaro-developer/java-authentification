package org.example.demosecuspringapplication.service;

import org.example.demosecuspringapplication.dao.UserDao;
import org.example.demosecuspringapplication.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User createUser(String email, String password) {
        User user = new User(UUID.randomUUID(), email, password);
        return userDao.upsert(user);
    }

    @Override
    public Optional<UserEntity> getUser(UUID userId) {
        return userDao.findById(userId);
    }
}
