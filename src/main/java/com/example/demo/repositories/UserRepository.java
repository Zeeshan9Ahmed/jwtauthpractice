package com.example.demo.repositories;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;

@Service
public interface UserRepository extends JpaRepository <User, Integer> {

	Optional<User> findByEmail(String email);
}
