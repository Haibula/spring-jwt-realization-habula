package com.example.demoauth.controllers.authController;

import com.example.demoauth.pojo.LoginRequest;
import com.example.demoauth.pojo.SignupRequest;
import com.example.demoauth.service.userService.AuthControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/auth")
@CrossOrigin(origins = "*", maxAge = 3600)
public class AuthController {

    @Autowired
    AuthControllerService authControllerService;

    @GetMapping("signin")
    String getLogin(){
        return "authorization";
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