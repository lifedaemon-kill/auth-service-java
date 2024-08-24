package com.example.auth.controller;

import com.example.auth.dto.UserSignInRequest;
import com.example.auth.dto.UserSignUpRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.EntityResponse;

@RestController("/auth")
public class AuthController {

    @PostMapping("/sing-in")
    EntityResponse<?> signIn(@RequestBody UserSignInRequest user) {
        return null;
    }

    @PostMapping("/sing-up")
    EntityResponse<?> signUp(@RequestBody UserSignUpRequest user) {
        return null;
    }

}
