package com.iiituna.placementportal.controller;

import com.iiituna.placementportal.model.User;
import com.iiituna.placementportal.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cdcr")
@RequiredArgsConstructor
public class CdcrAuthController {

    private final UserRepository userRepository;

    @PostMapping("/login")
    public String login(@RequestBody User body) {

        User user = userRepository.findByRollNo(body.getRollNo())
                .orElseThrow(() -> new RuntimeException("CDCR not found"));

        if(!user.getRole().equals("CDCR")) {
            throw new RuntimeException("Not authorized as CDCR");
        }

        if(!user.getPassword().equals(body.getPassword())) {
            throw new RuntimeException("Invalid Password");
        }

        return "CDCR Login Successful";
    }
}