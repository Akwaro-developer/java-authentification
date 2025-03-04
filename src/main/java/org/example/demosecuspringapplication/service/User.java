package org.example.demosecuspringapplication.service;

import java.util.UUID;

public class User {
    private UUID id;
    private String email;
    private String password;

    // Default constructor
    public User() {
    }

    // Parameterized constructor
    public User(UUID id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }

    // Getter for id
    public UUID getId() {
        return id;
    }

    // Setter for id
    public void setId(UUID id) {
        this.id = id;
    }

    // Getter for email
    public String getEmail() {
        return email;
    }

    // Setter for email
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter for password
    public String getPassword() {
        return password;
    }

    // Setter for password
    public void setPassword(String password) {
        this.password = password;
    }
}
