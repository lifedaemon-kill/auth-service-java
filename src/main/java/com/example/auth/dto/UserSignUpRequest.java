package com.example.auth.dto;

public record UserSignUpRequest(
        String login,
        String password,
        String email
) {
}
