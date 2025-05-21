package com.jwt.demo.user;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	private List<User> users = new ArrayList<>();
	
	public UserService() {
		users.add(new User(UUID.randomUUID().toString(), "Radhe Shyam", "radheshy56@gmail.com"));
		users.add(new User(UUID.randomUUID().toString(), "Hari Om", "hariom56@gmail.com"));
		users.add(new User(UUID.randomUUID().toString(), "Satyam", "satyam12@gmail.com"));
	}

	public List<User> getAllUsers(){
		return users;
	}
}
