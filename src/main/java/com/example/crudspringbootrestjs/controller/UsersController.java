package com.example.crudspringbootrestjs.controller;

import com.example.crudspringbootrestjs.model.Role;
import com.example.crudspringbootrestjs.model.User;
import com.example.crudspringbootrestjs.service.RoleService;
import com.example.crudspringbootrestjs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashSet;
import java.util.Set;


@Controller
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @GetMapping
    public String printUserInfo(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        model.addAttribute("user", userService.findUserByName(auth.getName()));
        return "userpage";
    }

    /*@GetMapping("/{id}")
    public String getUser(@PathVariable("id") long id, Model model) {
        model.addAttribute("user", userService.getUser(id));
        return "users/userpage";
    }

    @PostMapping("/{id}")
    public String updateUser(@ModelAttribute("user") @Valid User user, BindingResult bindingResult, @PathVariable("id") long id) {
        if (bindingResult.hasErrors()) {
            return "admin";
        }
        userService.updateUser(id, user);
        return "redirect:/admin";
    }

    @GetMapping("/index")
    public String allUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "users/index";
    }

    @PostMapping("/new")
    public String createUser(@RequestParam(value = "name") String name,
                             @RequestParam(value = "last_name") String last_name,
                             @RequestParam(value = "age") Integer age,
                             @RequestParam(value = "email") String email,
                             @RequestParam(value = "password") String password,
                             @RequestParam(value = "roles") Long[] role) {
        Set<Role> roleSet = new HashSet<>();
        for (Long roles : role) {
            roleSet.add(roleService.findRoleById(roles));
        }
        userService.addUser(new User(name, last_name, age, email, password, roleSet));
        return "redirect:/admin";
    }*/
}

