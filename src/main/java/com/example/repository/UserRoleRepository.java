package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.UserRole;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
    UserRole findByRole(String role);
}