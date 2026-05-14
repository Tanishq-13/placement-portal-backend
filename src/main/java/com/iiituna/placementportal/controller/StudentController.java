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

    @PostMapping
    public Student createStudent(@RequestBody StudentRequestDto dto) {
        return studentService.createStudent(dto);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
}