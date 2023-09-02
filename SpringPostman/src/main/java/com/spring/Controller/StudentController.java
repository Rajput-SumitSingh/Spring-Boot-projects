package com.spring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Entity.StudentEntity;
import com.spring.Service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService service;
	
	@PostMapping("/addStudent")
	public StudentEntity postDetails(@RequestBody StudentEntity e) {
		return service.saveData(e);
	}
}
