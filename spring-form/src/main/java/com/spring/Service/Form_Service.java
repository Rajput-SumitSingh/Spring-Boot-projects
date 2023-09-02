package com.spring.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.Entity.Form_Entity;
import com.spring.Repository.Form_Repository;

@Service
public class Form_Service {
	@Autowired
	private Form_Repository repo;

	public void addemp(Form_Entity entity) {
		repo.save(entity);
}
}
