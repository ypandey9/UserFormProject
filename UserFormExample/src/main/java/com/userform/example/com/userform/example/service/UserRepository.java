package com.userform.example.com.userform.example.service;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.userform.example.com.userform.example.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}