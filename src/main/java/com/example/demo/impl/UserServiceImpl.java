package com.example.demo.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dtos.UserDto;
import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;
import com.example.demo.services.UserService;


@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public UserDto saveUser(UserDto user) {
		// TODO Auto-generated method stub
//		return user;
	 User user2	= this.userRepository.save(this.modelMapper.map(user, User.class));
		return this.modelMapper.map(user2, UserDto.class);
	}

	@Override
	public List<UserDto> getAllUsers() {
		// TODO Auto-generated method stub
	  List <UserDto>	userDtos= this.userRepository.findAll().stream().map(user-> this.modelMapper.map(user, UserDto.class)).collect(Collectors.toList());
	  
		return userDtos;
	}

}
