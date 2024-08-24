package com.example.auth.controller;

import com.example.auth.utils.JwtUtil;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController("/test")
public class RoleTestController {
    @Autowired
    private JwtUtil jwt;

    @GetMapping("/user")
    public String user() {
        return "you are user";
    }

    @GetMapping("/moderator")
    public String moderator() {
        return "you are moderator";
    }

    @GetMapping("/admin")
    public String admin() {
        return "you are admin";
    }
}
