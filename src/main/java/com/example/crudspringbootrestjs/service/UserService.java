package com.example.crudspringbootrestjs.service;

import com.example.crudspringbootrestjs.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUser(long id);

    User findUserByName(String name);

    void addUser(User user);

    void deleteUser(long id);

    void updateUser(User newUser);
}