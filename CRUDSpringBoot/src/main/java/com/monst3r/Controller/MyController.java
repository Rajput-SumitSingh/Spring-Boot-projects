package com.monst3r.Controller;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

import com.monst3r.CrudSpringBootApplication;
import com.monst3r.Entity.UserEntity;
import com.monst3r.Repository.UserRepository;

@Controller
public class MyController {
	CrudSpringBootApplication crdApplication =new CrudSpringBootApplication();
	ApplicationContext context;
	UserEntity userEntity;
	
	
	public MyController(ApplicationContext cntxt) {
		// TODO Auto-generated constructor stub
		this.context = cntxt;
	}
	
	public void MyControl() {
			UserRepository repository = context.getBean(UserRepository.class);
			
//			UserEntity user = repository.save(userEntity);
//			System.out.println(user);
			
			
			
			
			
			
	}
	
}
