package com.myapp.demo.service;

import com.myapp.demo.model.Role;

import java.util.Set;

public interface RoleService {
    Set<Role> getAllRoles();
    Role getRoleByName(String name);
    Role save(Role role);
}