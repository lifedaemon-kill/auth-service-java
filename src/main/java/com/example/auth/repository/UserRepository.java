package com.example.auth.repository;


import com.example.auth.model.User;

import java.util.List;
import java.util.UUID;

public interface UserRepository {
    void createUser(String login, String password);

    void updateUser(User user);

    void deleteUser(Long id);

    User getUser(Long id);

    List<User> getUsers();
}
