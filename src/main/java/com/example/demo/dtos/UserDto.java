package com.example.demo.dtos;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
	private int id;
	private String name;
	
	private List<PostDto> post;
}
