package com.spring.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.Entity.StudentEntity;
import com.spring.Repository.StudentRepo;

@Service
public class StudentService {
	@Autowired
	private StudentRepo repo;
	
	public StudentEntity saveData(StudentEntity e) {
		return repo.save(e);
	}
}
