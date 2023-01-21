package com.cache.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cache.example.model.User;
import com.cache.example.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	

	@Autowired
	UserService userService;

	@GetMapping("/users")
	public List<User> getAllUser(){
		
		return userService.getAllUser();
	}
	
	@GetMapping("/hacker-news")
	public String getData() {
		return userService.getResponse();
	}
}
