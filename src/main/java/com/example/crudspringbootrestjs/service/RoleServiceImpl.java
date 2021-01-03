package com.example.crudspringbootrestjs.service;

import com.example.crudspringbootrestjs.model.Role;
import com.example.crudspringbootrestjs.repository.RoleRepository;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    private final
    RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Role findRoleById(Long id) {
        return roleRepository.findRoleById(id);
    }
}
