package com.example.auth.controller;

import com.example.auth.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public final class AuthController {
    @Autowired
    private AuthService authService;

    @PostMapping("/tokens/{userId}")
    public ResponseEntity<?> auth(@PathVariable String userId) {
        return null;
    }

    @PostMapping("/refresh")
    public ResponseEntity<?> refresh() {
        return null;
    }
}
