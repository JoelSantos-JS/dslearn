package com.devsuperior.dslearnbds.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dslearnbds.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
