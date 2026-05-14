package com.iiituna.placementportal.controller;

import com.iiituna.placementportal.model.User;
import com.iiituna.placementportal.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor
public class StudentAuthController {

    private final UserRepository userRepository;

    @PostMapping("/signup")
    public User signup(@RequestBody User user) {

        if(!user.getEmail().endsWith("@iiitu.ac.in")) {
            throw new RuntimeException("Use institute email only");
        }

        user.setRole("STUDENT");

        return userRepository.save(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody User body) {

        User user = userRepository.findByEmail(body.getEmail())
                .orElseThrow(() -> new RuntimeException("User not found"));

        if(!user.getPassword().equals(body.getPassword())) {
            throw new RuntimeException("Invalid Password");
        }

        return "Student Login Successful";
    }
}