package org.example.demosecuspringapplication.controller;

import org.example.demosecuspringapplication.dto.TokenDto;
import org.example.demosecuspringapplication.dto.UserCredentialsDto;
import org.example.demosecuspringapplication.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private AuthenticationManager authenticationManager;
    private final JwtUtil jwtUtil = new JwtUtil();

    @PostMapping("/signup")
    public String signup(@RequestBody UserCredentialsDto userCredentialsDto) {
        return "success";
    }
    @PostMapping("/login")
    public TokenDto login(@RequestBody UserCredentialsDto userCredentialsDto) {
        final Authentication authenticate = authenticationManager
                .authenticate(
                        new UsernamePasswordAuthenticationToken(
                                userCredentialsDto.username(), userCredentialsDto.password()
                        )
                );
        String token = jwtUtil.generateToken(userCredentialsDto.username());
        return new TokenDto(token, userCredentialsDto.username());
    }
}
