package com.example.auth.repository;

import com.example.auth.model.User;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class JpaUserRepository implements UserRepository {
    private final EntityManager em;

    public JpaUserRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public void createUser(String login, String password) {
        User user = new User();
        user.setLogin(login);
        user.setPassword(password);
        em.persist(user);
    }

    @Override
    public void updateUser(User updUser) {
        em.persist(updUser);
    }

    @Override
    public void deleteUser(Long id) {
        em.remove(em.find(User.class, id));
    }

    @Override
    public User getUser(Long id) {
        return em.find(User.class, id);
    }

    @Override
    public List<User> getUsers() {
        return em.createQuery("select u from User u", User.class).getResultList();
    }
}
