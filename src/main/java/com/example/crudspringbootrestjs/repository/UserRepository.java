package com.example.crudspringbootrestjs.repository;

import com.example.crudspringbootrestjs.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByEmail(String email);
    User findUserByName(String name);
}