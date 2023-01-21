package com.cache.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cache.example.model.User;

@Service
public interface UserService {
	
	public List<User> getAllUser();

	String getResponse();

}
