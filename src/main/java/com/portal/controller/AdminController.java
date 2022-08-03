package com.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
	
@GetMapping("pages/candidate/cand")
public String candidate() {
		
		return "admin/pages/candidate/cand";
	}

@GetMapping("pages/employee/emp")
public String employee() {
		
		return "admin/pages/employee/emp";
	}

@GetMapping("pages/pannel/pannel")
public String pannel() {
		
		return "admin/pages/pannel/pannel";
	}
	
	
	
}
