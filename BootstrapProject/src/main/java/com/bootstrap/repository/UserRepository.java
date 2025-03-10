package com.bootstrap.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.bootstrap.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
