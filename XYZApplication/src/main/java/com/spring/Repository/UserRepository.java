package com.spring.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.spring.Entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Integer>{
	public List<UserEntity> findByName(String name);	
}
