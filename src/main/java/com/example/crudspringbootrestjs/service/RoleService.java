package com.example.crudspringbootrestjs.service;

import com.example.crudspringbootrestjs.model.Role;

public interface RoleService {
    Role findRoleById(Long id);
}