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

    public List<Student> createStudents(List<StudentRequestDto> dtos) {

        List<Student> students = dtos.stream()
                .map(dto -> Student.builder()
                        .rollNumber(dto.getRollNumber())
                        .studentName(dto.getStudentName())
                        .branch(dto.getBranch())
                        .remark(dto.getRemark())
                        .companyName(dto.getCompanyName())
                        .payPackage(dto.getPayPackage())
                        .designation(dto.getDesignation())
                        .campusType(dto.getCampusType())
                        .multipleOffers(dto.getMultipleOffers())
                        .additionalCompanies(dto.getAdditionalCompanies())
                        .additionalPayPackage(dto.getAdditionalPayPackage())
                        .build())
                .toList();

        return studentRepository.saveAll(students);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}