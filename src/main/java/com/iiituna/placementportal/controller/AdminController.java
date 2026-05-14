package com.iiituna.placementportal.controller;

import com.iiituna.placementportal.model.User;
import com.iiituna.placementportal.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/admin")
@RequiredArgsConstructor
public class AdminController {

    private final UserRepository userRepository;

    @PostMapping("/login")
    public String login(@RequestBody Map<String, String> body) {

        String username = body.get("username");
        String password = body.get("password");

        if(username.equals("admin") && password.equals("admin123")) {
            return "Admin Login Successful";
        }

        throw new RuntimeException("Invalid Credentials");
    }

    @PostMapping("/add-cdcr")
    public User addCdcr(@RequestBody User user) {

        user.setRole("CDCR");

        return userRepository.save(user);
    }

    @GetMapping("/cdcrs")
    public List<User> getAllCdcrs() {

        return userRepository.findAll()
                .stream()
                .filter(user -> "CDCR".equals(user.getRole()))
                .toList();
    }
}