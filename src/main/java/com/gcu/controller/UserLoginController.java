package com.gcu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class UserLoginController {
	
	@GetMapping(value = "/login")
	public String displayLogin(Model model)
	{
		model.addAttribute("title", "Login Form");
		return "login";
	}
}
