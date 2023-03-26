package com.example.demoauth.controllers;

import com.example.demoauth.service.AuthControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.demoauth.pojo.LoginRequest;
import com.example.demoauth.pojo.SignupRequest;
import com.example.demoauth.repository.UserRepository;

@Controller
@RequestMapping("/api/auth")
@CrossOrigin(origins = "*", maxAge = 3600)
public class AuthController {

    @Autowired
    AuthControllerService authControllerService;

    @GetMapping("signin")
    String getLogin(){
        return "index";
    }


    @PostMapping("/signin")
    public ResponseEntity<?> authUser(@RequestBody LoginRequest loginRequest) {

        return authControllerService.authUser(loginRequest);
    }
    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@RequestBody SignupRequest signupRequest) {
        return authControllerService.registerUser(signupRequest);
    }
}
