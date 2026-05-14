package com.iiituna.placementportal.dto;

import lombok.Data;

@Data
public class CompanyRequestDto {

    private String companyName;
    private String role;
    private Double ctc;
    private Double minCgpa;
    private String location;
    private String jobType;
    private String description;
}