package com.cache.example.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cache.example.repository.UserRepository;

import jakarta.annotation.PostConstruct;

@Component
public class DataLoader {

	@Autowired
	private UserRepository userRepository;

	@PostConstruct
	public void load() {
		List<User> usersList = getList();
		userRepository.saveAll(usersList);
	}

	public List<User> getList() {
		List<User> usersList = new ArrayList<>();
		usersList.add(new User("Yasas", 25, "Galle"));
		usersList.add(new User("Kamal", 42, "Kandy"));
		usersList.add(new User("Sahani", 24, "Colombo"));
		return usersList;
	}

}
