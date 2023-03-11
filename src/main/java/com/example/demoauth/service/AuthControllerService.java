package com.example.demoauth.service;

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
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class AuthControllerService {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UserRepository userRespository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    JwtUtils jwtUtils;

    public ResponseEntity<?> authUser(@NotNull LoginRequest loginRequest) {

        Authentication authentication = authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(
                        loginRequest.getUsername(),
                        loginRequest.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtUtils.generateJwtToken(authentication);

        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
        List<String> roles = userDetails.getAuthorities().stream()
                .map(item -> item.getAuthority())
                .collect(Collectors.toList());
        return ResponseEntity.ok(new JwtResponse(jwt,
                userDetails.getId(),
                userDetails.getUsername(),
                userDetails.getGroups(),
                roles));
    }

    public ResponseEntity<?> registerUser(@NotNull SignupRequest signupRequest) {

        if (userRespository.existsByUsername(signupRequest.getUsername())) {
            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse("Error: Username is exist"));
        }
        if (signupRequest.getGroups().isEmpty()) {
            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse("Error: UserGroup is Null"));

        }

        User user = new User(signupRequest.getUsername(),
                signupRequest.getGroups(),
                passwordEncoder.encode(signupRequest.getPassword()));

        Set<String> reqRoles = signupRequest.getRoles();

        reqRoles.add(user.getGroups());

        Set<Role> roles = new HashSet<>();

        reqRoles.forEach(r -> {
            if (r == null || r.equals("user")) {
                Role userRole = roleRepository
                        .findByName(ERole.ROLE_USER)
                        .orElseThrow(() -> new RuntimeException("Error, Role USER is not found"));
                roles.add(userRole);
            }
            if (r.contains("admin") && r.contains("moderator")) {
                Role adminRole = roleRepository
                        .findByName(ERole.ROLE_ADMIN)
                        .orElseThrow(() -> new RuntimeException("Error, Role ADMIN is not found"));
                Role modRole = roleRepository
                        .findByName(ERole.ROLE_MODERATOR)
                        .orElseThrow(() -> new RuntimeException("Error, Role MODERATOR is not found"));
                roles.add(adminRole);
                roles.add(modRole);

            } else if (r.contains("admin")) {
                Role adminRole = roleRepository
                        .findByName(ERole.ROLE_ADMIN)
                        .orElseThrow(() -> new RuntimeException("Error, Role ADMIN is not found"));
                roles.add(adminRole);

            } else if (r.contains("moderator")) {
                Role modRole = roleRepository
                        .findByName(ERole.ROLE_MODERATOR)
                        .orElseThrow(() -> new RuntimeException("Error, Role MODERATOR is not found"));
                roles.add(modRole);
            } else if (r.contains("41ks")) {
                Role modRole = roleRepository
                        .findByName(ERole.ROLE_41KS)
                        .orElseThrow(() -> new RuntimeException("Error, Role MODERATOR is not found"));
                roles.add(modRole);
            } else if (r.contains("42ks")) {
                Role modRole = roleRepository
                        .findByName(ERole.ROLE_42KS)
                        .orElseThrow(() -> new RuntimeException("Error, Role MODERATOR is not found"));
                roles.add(modRole);
            } else if (r.contains("43ks")) {
                Role modRole = roleRepository
                        .findByName(ERole.ROLE_43KS)
                        .orElseThrow(() -> new RuntimeException("Error, Role MODERATOR is not found"));
                roles.add(modRole);
            }
        });

        user.setRoles(roles);
        userRespository.save(user);
        return ResponseEntity.ok(new MessageResponse("User CREATED"));
    }
}