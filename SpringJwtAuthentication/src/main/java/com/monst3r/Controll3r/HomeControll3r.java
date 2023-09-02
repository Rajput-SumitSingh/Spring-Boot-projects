package com.monst3r.Controll3r;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monst3r.Entity.User;
import com.monst3r.Service.UserService;

@RestController
@RequestMapping("/home")
public class HomeControll3r {
	
	@Autowired
	private UserService service;
	
	@GetMapping("/test")
	public List<User> test() {
		return service.getAllUser();
		
	}

}
