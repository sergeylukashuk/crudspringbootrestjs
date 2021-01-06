package com.example.crudspringbootrestjs.controller;

import com.example.crudspringbootrestjs.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/admin")
public class AdminController {

   private final UserService userService;

    public AdminController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String allUsers (Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "index";
    }

    @GetMapping("/new")
    public String newUser() {
        return "new";
    }

    @GetMapping("/{id}")
    public String getUser() {
        return "userpage";
    }
}
