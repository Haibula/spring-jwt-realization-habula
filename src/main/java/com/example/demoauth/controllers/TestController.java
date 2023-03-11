package com.example.demoauth.controllers;

import com.example.demoauth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/test")
@CrossOrigin(origins = "*", maxAge = 3600)
public class TestController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/41ks")
    @PreAuthorize("hasRole('41KS')")
    public String userAccess() {

       return "progress";
    }

	@GetMapping("/moder")
	@PreAuthorize("hasRole('41KS')")
	public String moderResurs() {

		return "moderator";
	}


	@GetMapping("/42ks")
	@PreAuthorize("hasRole('42KS') or hasRole('ADMIN')")
	public String moderatorAccess() {
		return "ks42";
	}

	@GetMapping("/43ks")
	@PreAuthorize("hasRole('43KS')")
	public String adminAccess() {
		return "ks43";
	}
}
