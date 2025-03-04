package org.example.demosecuspringapplication.dao;

import org.example.demosecuspringapplication.entity.UserEntity;
import org.example.demosecuspringapplication.service.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Stream;

@Repository
public class JdbcUserDao implements UserDao {
    private final JdbcTemplate jdbcTemplate;

    public JdbcUserDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public Stream<UserEntity> findAll() {
        return Stream.empty();
    }

    @Override
    public Optional<UserEntity> findById(UUID userId) {
        return Optional.empty();
    }

    @Override
    public User upsert(User user) {
        return null;
    }

    @Override
    public UserEntity upsert(UserEntity user) {
        return null;
    }

    @Override
    public void delete(UUID userId) {

    }
}
