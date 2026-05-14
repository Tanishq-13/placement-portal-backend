package com.iiituna.placementportal.controller;

import com.iiituna.placementportal.dto.StudentRequestDto;
import com.iiituna.placementportal.model.Student;
import com.iiituna.placementportal.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping("/bulk")
    public List<Student> createStudents(@RequestBody List<StudentRequestDto> dtos) {
        return studentService.createStudents(dtos);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
}