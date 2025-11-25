package com.rahul;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rahul.model.User;

@Controller
public class MyController {
	
	@RequestMapping("/create")
	public String createAccount() {
		
		return "createPage";
	}
	
	@GetMapping("/create-success")
	public String createSuccess(@ModelAttribute("user") User user, Model model) {
		model.addAttribute("user", user);
		return "welcome";
	}
}
