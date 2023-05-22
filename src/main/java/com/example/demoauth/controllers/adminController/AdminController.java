package com.example.demoauth.controllers.adminController;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

// Сделай отдельную страницу для практик, диф зачет, курсовых и экзаменов
@Controller
@RequestMapping("/api/moderator")
@CrossOrigin(origins = "*", maxAge = 3600)
public class AdminController {

    @GetMapping("/admin/{month}")
    @PreAuthorize("hasRole('ADMIN')")
    public String admin() {

        return "admin";
    }
}
