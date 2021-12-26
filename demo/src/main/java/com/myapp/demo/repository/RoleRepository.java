package com.myapp.demo.repository;

import com.myapp.demo.model.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
    Role getRoleByName(String name);
    Role save(Role role);
}