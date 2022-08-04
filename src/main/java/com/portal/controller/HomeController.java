package com.portal.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.portal.entity.User;
import com.portal.repository.UserRepository;

@Controller
public class HomeController {
	
	@Autowired
	UserRepository uR;

	@GetMapping("/")
	public String index() {
		
		return "index";
	}
	
	@GetMapping("/job")
	public String job() {
		
		return "job";
	}
	
	@PostMapping("/user")
	public void createUser(@RequestBody User user) {
		
		uR.save(user);
		
//		return local ;
		
	}
	@GetMapping("/login")
	public String login() {
		
		return "login";
	}
	@RequestMapping(path = "/adminhome" , method = RequestMethod.POST)
	public String get(Model model, HttpServletRequest request)
	{
//		@RequestParam ("username") String username , @RequestParam ("password") String password , 
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user = uR.findByUsername(username);
		System.out.println(user +" "+ username + " " + password);
		if(user != null)
		{
			if (user.getPassword().equals(password)) {
				return "admin/index";
			}
			model.addAttribute("message", "Incorrect password");
		}
		return "admin/index";
	}

}
