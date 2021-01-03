package com.example.crudspringbootrestjs.repository;

import com.example.crudspringbootrestjs.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository <Role, Long>{
    Role findRoleById(Long id);
}