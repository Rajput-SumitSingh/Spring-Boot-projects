package com.monst3r.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.monst3r.Entity.User;

@Service
public class UserService {
	public static List<User> users = new ArrayList<>();
	
	static {
		users.add(new User(UUID.randomUUID().toString(), "Sumit Kumar", "kumarsumit@Gmail.com"));
		users.add(new User(UUID.randomUUID().toString(), "Sumit singh", "sumit@Gmail.com"));
		users.add(new User(UUID.randomUUID().toString(), "Rahul Kumar", "arahul@Gmail.com"));
		users.add(new User(UUID.randomUUID().toString(), "Abhishek gupta", "asingh@Gmail.com"));
	}

	public List<User> getAllUser(){
		return users;
	}
}
