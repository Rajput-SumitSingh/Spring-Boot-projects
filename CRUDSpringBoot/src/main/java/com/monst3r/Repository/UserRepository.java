package com.monst3r.Repository;

import org.springframework.data.repository.CrudRepository;

import com.monst3r.Entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Integer>{

}
