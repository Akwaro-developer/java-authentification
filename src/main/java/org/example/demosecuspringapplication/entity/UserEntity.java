package org.example.demosecuspringapplication.entity;



import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // Use AUTO for UUID
    private UUID id; //  UUID

    @Column(unique = true)
    private String username;

    private String password;
    private String role;

    // Default constructor
    public UserEntity() {}

    // Parameterized constructor
    public UserEntity(String username, String password, String role) {
        this.id = UUID.randomUUID(); // Generate UUID manually if needed
        this.username = username;
        this.password = password;
        this.role = role;
    }

    // Getters and Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

