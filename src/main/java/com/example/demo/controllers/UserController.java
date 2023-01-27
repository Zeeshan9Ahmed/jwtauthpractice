package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dtos.UserDto;
import com.example.demo.entities.User;
import com.example.demo.services.UserService;

@RestController
@RequestMapping("/api/")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("user")
	public UserDto SaveUser(@RequestBody UserDto user) {
		UserDto savedUser = this.userService.saveUser(user);
		return savedUser;
	}
	
	@GetMapping("user")
	public List<UserDto> getAllUsers() {
	List<UserDto> users	= this.userService.getAllUsers();
		return users;
	}
}
