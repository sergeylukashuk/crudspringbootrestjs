package com.example.crudspringbootrestjs.controller;

import com.example.crudspringbootrestjs.model.User;
import com.example.crudspringbootrestjs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest/")
public class RestController {

    @Autowired
    private UserService userService;

    @GetMapping("admin")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("admin/{id}")
    public User getUserById(@PathVariable("id") long id) {
        return userService.getUser(id);
    }

    @PostMapping("admin/new")
    public ResponseEntity<User> createUser(@RequestBody User user){
        userService.addUser(user);
        return ResponseEntity.ok().body(user);
    }

    @PutMapping("admin/edit")
    public ResponseEntity<User> editUser(@RequestBody User user){
        userService.updateUser(user);
        return ResponseEntity.ok().body(user);
    }

    @DeleteMapping("admin/delete/{id}")
    public void deleteUserById(@PathVariable("id") long id) {
       userService.deleteUser(id);
    }
}
  //  fetch('/rest/edit',
//  {
//      method: 'PUT',
//      headers: {'Content-Type': 'application/json'},
//      body: JSON.stringify({email: 'qw@q.e', password:'qqq', name:'zzz', last_name:'xxx', age:'5'})
//   })
//      .then(result => console.log(result))