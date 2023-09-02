package com.monst3r;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.monst3r.Controller.MyController;

@SpringBootApplication
public class CrudSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(CrudSpringBootApplication.class, args);
		new MyController(context);

	}

}
