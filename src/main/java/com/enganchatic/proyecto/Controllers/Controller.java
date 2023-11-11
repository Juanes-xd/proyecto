package com.enganchatic.proyecto.Controllers;

import com.enganchatic.proyecto.Entities.User;
import com.enganchatic.proyecto.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Controller {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String sayHello() {
        return "Hello world";
    }

    @GetMapping("/users")
    public List<User> AllUser() {
        return userService.getAllUser();
    }

    @PostMapping("/user")
    public User postUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

    @PutMapping("/update-user/{id}")
    public Optional<User> updateUser(@PathVariable Long id, @RequestBody User user) {
        return userService.updateUser(id, user);

    }
}
