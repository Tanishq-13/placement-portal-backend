package com.iiituna.placementportal.service;

import com.iiituna.placementportal.dto.StudentRequestDto;
import com.iiituna.placementportal.model.Student;
import com.iiituna.placementportal.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public Student createStudent(StudentRequestDto dto) {

        Student student = Student.builder()
                .name(dto.getName())
                .email(dto.getEmail())
                .rollNumber(dto.getRollNumber())
                .branch(dto.getBranch())
                .cgpa(dto.getCgpa())
                .graduationYear(dto.getGraduationYear())
                .phoneNumber(dto.getPhoneNumber())
                .build();

        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}