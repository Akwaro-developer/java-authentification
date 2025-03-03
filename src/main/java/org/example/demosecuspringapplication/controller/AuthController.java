package org.example.demosecuspringapplication.controller;

import org.example.demosecuspringapplication.dto.UserCredentialsDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @PostMapping("/signup")
    public String signup(@RequestBody UserCredentialsDto userCredentialsDto) {
        return "success";
    }
    @PostMapping("/login")
    public String login(@RequestBody UserCredentialsDto userCredentialsDto) {
        return "success";
    }
}
