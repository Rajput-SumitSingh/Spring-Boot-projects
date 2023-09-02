package com.monst3r.Controll3r;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClassController {
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("name", "Sumit singh");
		model.addAttribute("currentDate", new Date());
		
		String[] list = {"Anmol", "Ankit", "Anubhav", "Anand"};
		model.addAttribute("list", list);
		
		
		List<String>  lists = List.of("Anmol", "Ankit", "Anubhav", "Anand");
		model.addAttribute("lists", lists);
		
		
		
		
		model.addAttribute("isActive", false);
		
		
		
		return "index";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}
	
	@GetMapping("/service")
	public String service() {
		return "service";
	}
	
}
