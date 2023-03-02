package com.example.demoauth.controllers;

import org.hibernate.annotations.CollectionId;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/api/test")
@CrossOrigin(origins = "*", maxAge = 3600)
public class TestController {
	@GetMapping("/all")
	public String allAccess() {
		return "all";
	}
	@GetMapping("/user")
	@PreAuthorize("hasRole('USER')")
	public String userAccess() {
		return "user";
	}
	
	@GetMapping("/mod")
	@PreAuthorize("hasRole('MODERATOR') or hasRole('ADMIN')")
	public String moderatorAccess() {
		return "moderator API";
	}
	
	@GetMapping("/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public String adminAccess() {
		return "admin API";
	}
}
