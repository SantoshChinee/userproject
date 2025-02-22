package com.UserProject.TestProject.controller;

import com.UserProject.TestProject.entity.User;
import com.UserProject.TestProject.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@Tag(name = "User API", description = "APIs to fetch users")
public class UserController {

    @Autowired
    private UserService userService;

    @Operation(summary = "Get all users", description = "Returns a list of all users in the system")
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @Operation(summary = "Get users by role", description = "Filters users by their role")
    @GetMapping("/role/{role}")
    public List<User> getUsersByRole(@PathVariable String role) {
        return userService.getUsersByRole(role);
    }

    @Operation(summary = "Get users sorted by age", description = "Sort users by age in ascending or descending order")
    @GetMapping("/sorted")
    public List<User> getUsersSortedByAge(@RequestParam boolean ascending) {
        return userService.getUsersSortedByAge(ascending);
    }

    @Operation(summary = "Find user by ID", description = "Fetches a user by their ID")
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        return userService.getUserById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
