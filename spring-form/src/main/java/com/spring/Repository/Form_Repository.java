package com.spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.Entity.Form_Entity;

@Repository
public interface Form_Repository extends JpaRepository<Form_Entity, Integer>{
	
}
