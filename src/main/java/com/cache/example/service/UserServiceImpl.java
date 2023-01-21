package com.cache.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cache.example.model.User;
import com.cache.example.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepo;
		
	@Override
//    @Cacheable(value = "usersCache", key = "#name",condition="#p0!=null")
    @Cacheable(value = "usersCache")
	public List<User> getAllUser() {
		
		System.out.println("Getting All the users from DB!");
		List<User> users = userRepo.findAll();
		System.out.println(users);
		return users;
	}
	
	@Override
    @Cacheable(value = "hackernews")	
	public String getResponse() {
		System.out.println("Inside getResponse method of service");
		String uri="https://hacker-news.firebaseio.com/v0/item/8863.json?print=pretty";
		RestTemplate restTemplate=new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);
		System.out.println("Response from hacker news: "+result);		
		return result;
	}

	
}
