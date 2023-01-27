package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.dtos.UserDto;
import com.example.demo.entities.User;

@Component
public interface UserService {
	
	UserDto saveUser(UserDto user);
	
	List <UserDto> getAllUsers();
}
