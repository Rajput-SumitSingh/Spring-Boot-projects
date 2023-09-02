package com.spring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.Entity.Form_Entity;
import com.spring.Service.Form_Service;

import jakarta.servlet.http.HttpSession;

@Controller
public class Form_controller {
	@Autowired
	private Form_Service service;
	
	@GetMapping("/")
	public String home() {
		return "login";
	}
	
	@PostMapping("/register")
	public String register(@ModelAttribute Form_Entity e, HttpSession session) {
		service.addemp(e);
		session.setAttribute("msg", "User Register Successfully ....");
		return "redirect:/";
	}
}
