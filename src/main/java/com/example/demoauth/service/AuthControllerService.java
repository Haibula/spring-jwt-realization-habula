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
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

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
        if (signupRequest.getGroup().isEmpty()) {
            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse("Error: UserGroup is Null"));

        }

        User user = new User(signupRequest.getUsername(),
                signupRequest.getGroup(),
                passwordEncoder.encode(signupRequest.getPassword()));

        Set<String> reqRole = signupRequest.getRoles();

        reqRole.add(user.getGroups());

        Set<Role> roles = new HashSet<>();

        reqRole.forEach(r -> {

            if (r.contains("admin")) {
                Role adminRole = roleRepository
                        .findByName(ERole.ROLE_ADMIN)
                        .orElseThrow(() -> new RuntimeException("Error, Role ADMIN is not found"));
                roles.add(adminRole);

            } else if (r.contains("moderator_is_1_1")) {
                Role mod_is_1_1_Role = roleRepository
                        .findByName(ERole.ROLE_MODERATOR_IS_1_1)
                        .orElseThrow(() -> new RuntimeException("Error, Role ROLE_MODERATOR_IS_1_1 is not found"));
                roles.add(mod_is_1_1_Role);
            } else if (r.contains("moderator_is_1_2")) {
                Role mod_is_1_2_Role = roleRepository
                        .findByName(ERole.ROLE_MODERATOR_IS_1_2)
                        .orElseThrow(() -> new RuntimeException("Error, Role ROLE_MODERATOR_IS_1_2 is not found"));
                roles.add(mod_is_1_2_Role);
            } else if (r.contains("moderator_is_1_3")) {
                Role mod_is_1_3_Role = roleRepository
                        .findByName(ERole.ROLE_MODERATOR_IS_1_3)
                        .orElseThrow(() -> new RuntimeException("Error, Role ROLE_MODERATOR_IS_1_3 is not found"));
                roles.add(mod_is_1_3_Role);
            } else if (r.contains("is_1_1")) {
                Role is_1_1_Role = roleRepository
                        .findByName(ERole.ROLE_IS_1_1)
                        .orElseThrow(() -> new RuntimeException("Error, Role ROLE_IS_1_1 is not found"));
                roles.add(is_1_1_Role);
            } else if (r.contains("is_1_2")) {
                Role is_1_2_Role = roleRepository
                        .findByName(ERole.ROLE_IS_1_2)
                        .orElseThrow(() -> new RuntimeException("Error, Role ROLE_IS_1_2 is not found"));
                roles.add(is_1_2_Role);
            } else if (r.contains("is_1_3")) {
                Role is_1_3_Role = roleRepository
                        .findByName(ERole.ROLE_IS_1_3)
                        .orElseThrow(() -> new RuntimeException("Error, Role ROLE_IS_1_3 is not found"));
                roles.add(is_1_3_Role);
            }
        });

        user.setRoles(roles);
        userRespository.save(user);
        return ResponseEntity.ok(new MessageResponse("User CREATED"));
    }
}