package com.spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.Entity.StudentEntity;

@Repository
public interface StudentRepo extends JpaRepository<StudentEntity, Integer>{

}
