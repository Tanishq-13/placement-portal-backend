package com.iiituna.placementportal.repository;

import com.iiituna.placementportal.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    Optional<User> findByRollNo(String rollNo);
}