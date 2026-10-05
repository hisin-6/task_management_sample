package com.example.taskmanagement.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.taskmanagement.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    // ログイン時にユーザー名で探す
    Optional<User> findByUsername(String username);
}
