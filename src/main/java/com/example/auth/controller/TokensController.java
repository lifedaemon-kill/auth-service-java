package com.example.auth.controller;

import com.example.auth.service.AuthService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tokens")
@Log4j2
public final class TokensController {
    @Autowired
    private AuthService authService;

    @PostMapping("/{userId}")
    public ResponseEntity<?> getAccessToken(@PathVariable String userId, HttpServletRequest request) {
        String ipAddress = request.getRemoteAddr();
        log.info(ipAddress);
        return null;
    }

    @PostMapping("/refresh")
    public ResponseEntity<?> refresh() {
        return null;
    }
}
