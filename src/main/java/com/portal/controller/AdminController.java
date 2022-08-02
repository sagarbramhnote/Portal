package com.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

	@GetMapping("/changepassword")
	public String get()
	{
		return "admin/changepassword";
	}
	
}
