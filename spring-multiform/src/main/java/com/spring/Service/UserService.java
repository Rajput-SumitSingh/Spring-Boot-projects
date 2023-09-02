package com.spring.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.Entity.UserEntity;
import com.spring.Repository.UserRepo;

@Service
public class UserService {
	@Autowired
	private UserRepo repo;
	
	public void addUser(UserEntity entity) {
		repo.save(entity);
	}
}
