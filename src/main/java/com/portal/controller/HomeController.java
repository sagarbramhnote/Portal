package com.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String index() {
		
		return "index";
	}
	
	@GetMapping("/job")
	public String job() {
		
		return "job";
	}
	
	@GetMapping("/login")
	public String login() {
		
		return "login";
	}
	
	@GetMapping("/adminhome")
	public String get()
	{
		return "admin/index";
	}
	
	@GetMapping("/forms")
	public String forms()
	{
		return "admin/pages/forms/addcandidate";
	}
	
	@GetMapping("/signup")
	public String signup()
	{
		return "signup";
	}
	
	@GetMapping("/forgotpass")
	public String forgot()
	{
		return "forgotpassword";
	}
	
	@GetMapping("/candidatelogin")
	public String candidatelogin()
	{
		return "job";
	}

}
