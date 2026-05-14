package com.iiituna.placementportal.service;

import com.iiituna.placementportal.dto.LoginRequestDto;
import com.iiituna.placementportal.dto.SignupRequestDto;
import com.iiituna.placementportal.model.Student;
import com.iiituna.placementportal.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final StudentRepository studentRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public String signup(SignupRequestDto dto) {

        if (!dto.getPassword().equals(dto.getConfirmPassword())) {
            throw new RuntimeException("Passwords do not match");
        }

        if (studentRepository.findByEmail(dto.getEmail()).isPresent()) {
            throw new RuntimeException("Email already exists");
        }

        Student student = Student.builder()
                .email(dto.getEmail())
                .password(passwordEncoder.encode(dto.getPassword()))
                .build();

        studentRepository.save(student);

        return "Signup Successful";
    }

    public String login(LoginRequestDto dto) {

        Student student = studentRepository.findByEmail(dto.getEmail())
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (!passwordEncoder.matches(dto.getPassword(), student.getPassword())) {
            throw new RuntimeException("Invalid password");
        }

        return "Login Successful";
    }
}