package com.example.auth.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public record UserSignInRequest(
        String login,
        String password
) {
}
