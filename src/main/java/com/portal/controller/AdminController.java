package com.portal.controller;

import java.net.http.HttpHeaders;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.http.parser.Cookie;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
	 HttpServletRequest request;
	
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
@GetMapping("pages/adduser/user")
public String user() {
		
		return "admin/pages/adduser/user";
	}

/*@GetMapping("admin/singout")
private String getCookie(HttpServletRequest request) {
	String cookie = request.getHeader(HttpHeaders.COOKIE);
	
	for (Cookie cookie : req.getCookies()) {
        if (cookie.getName().equals("some_cookie"))
            return cookie.getValue();
    }*/
    
	
	
	
}
