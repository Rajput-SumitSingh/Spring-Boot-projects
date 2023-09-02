package com.spring;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.Entity.UserEntity;
import com.spring.Repository.UserRepository;

@SpringBootApplication
public class XyzApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(XyzApplication.class, args);
		UserRepository repository = context.getBean(UserRepository.class);

//		UserEntity user = new UserEntity();
//		user.setName("Sumit");
//		user.setCity("Ludhiana");
//		user.setStatus("java programmer");
//		repository.save(user);

// <<<<<<<<<<<<<<<    CREATE USER    >>>>>>>>>>>>>>>>>>>>>>>>		

//		UserEntity user1 = new UserEntity("Rahul", "ludhiana", "Programmer");
//		UserEntity user2 = new UserEntity("Rohit", "UP", "Chhakka");
//						
//		ArrayList<UserEntity> users = new ArrayList<>();
//		users.add(user2);
//		users.add(user1);
//		
//		repository.saveAll(users);

// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<    READ USER    >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

		Iterable<UserEntity> iterable = repository.findAll();

		Iterator<UserEntity> itr = iterable.iterator();

//		while(itr.hasNext()) {
//			UserEntity userEntity = itr.next();
//			System.out.println(userEntity);
//		}

//		iterable.forEach(user -> {
//			System.out.println(user);
//		});

// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<    UPDATE USER    >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

//		Optional<UserEntity> optional = repository.findById(2);
//
//		UserEntity user = optional.get();
//
//		user.setStatus("Programmer");
//		repository.save(user);

// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<    DELETE USER    >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//		try {
//			repository.deleteById(30);
//			System.out.println("User Deleted ....");
//			
//		} catch (IllegalArgumentException e) {
//			System.out.println("Empty User ");
//		}
		
		List<UserEntity> user = repository.findByName("anand ranjan");
		user.forEach(u ->{
			System.out.println(u);
		});
	}

}
