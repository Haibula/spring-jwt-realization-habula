package com.example.demoauth.controllers;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.example.demoauth.service.AuthControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.demoauth.configs.jwt.JwtUtils;
import com.example.demoauth.models.ERole;
import com.example.demoauth.models.Role;
import com.example.demoauth.models.User;
import com.example.demoauth.pojo.JwtResponse;
import com.example.demoauth.pojo.LoginRequest;
import com.example.demoauth.pojo.MessageResponse;
import com.example.demoauth.pojo.SignupRequest;
import com.example.demoauth.repository.RoleRepository;
import com.example.demoauth.repository.UserRepository;
import com.example.demoauth.service.UserDetailsImpl;

@Controller
@RequestMapping("/api/auth")
@CrossOrigin(origins = "*", maxAge = 3600)
public class AuthController {

    @Autowired
    AuthControllerService authControllerService;
    @Autowired
    private UserRepository userRepository;

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
