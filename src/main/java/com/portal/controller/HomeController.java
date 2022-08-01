package com.portal.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.portal.entity.Role;
import com.portal.entity.User;
import com.portal.entity.UserRole;
import com.portal.services.UserService;

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
	
	@GetMapping("/admin/home")
	public String adminindex() {
		
		return "admin/index";
	}
	

	
}
