package com.spring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.Entity.UserEntity;
import com.spring.Service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService service;
	
	@GetMapping("/")
	public String signup() {
		return "signup";
	}
	@PostMapping("/register")
	public String register(@ModelAttribute UserEntity e) {
		service.addUser(e);
		System.out.println(e);
		return "redirect:/";
	}
	
	public String login() {
		return "home";
	}
}
