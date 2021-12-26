package com.myapp.demo.service;

import com.myapp.demo.model.User;

import java.util.Optional;

public interface UserService {
    void createNewUser(User user);
    void deleteUser(long id);
    void updateUser(User user);
    Optional<User> findUserById(Long id);
    Iterable<User> getAllUsers();
}
