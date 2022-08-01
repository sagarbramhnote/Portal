package com.portal;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.portal.entity.Role;
import com.portal.entity.User;
import com.portal.entity.UserRole;
import com.portal.services.UserService;

@SpringBootApplication
public class PortalApplication implements CommandLineRunner{

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(PortalApplication.class, args);
		
		
		System.out.println("start...");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("starting code");
//		
//		User user=new User();
//		
//		user.setFirstName("Sagar");
//		user.setLastName("Bramhnote");
//		user.setUsername("sagar2006");
//		user.setPassword("abc");
//		user.setEmail("sagar@gmail.com");
//		user.setProfile("default.png");
//		
//		Role role1=new Role();
//		role1.setRoleId(11L);
//		role1.setRoleName("ADMIN");
//		
//		Set<UserRole> userRoleSet=new HashSet<>();
//		UserRole userRole = new UserRole();
//		userRole.setRole(role1);
//		userRole.setUser(user);
//		
//		userRoleSet.add(userRole);
//		
//		User user1 = this.userService.createUser(user, userRoleSet);
//		System.out.println(user1.getUsername());
	}

}
