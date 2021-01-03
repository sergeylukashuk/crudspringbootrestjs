package com.example.crudspringbootrestjs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
public class UsersController {

    @GetMapping
    public String printUserInfo(Model model) {
        return "userpage";
    }
}

