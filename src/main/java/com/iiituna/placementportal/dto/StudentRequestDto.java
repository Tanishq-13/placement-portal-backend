package com.iiituna.placementportal.dto;

import lombok.Data;

@Data
public class StudentRequestDto {

    private String name;
    private String email;
    private String rollNumber;
    private String branch;
    private Double cgpa;
    private Integer graduationYear;
    private String phoneNumber;
}