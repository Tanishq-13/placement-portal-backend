package com.iiituna.placementportal.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class JobDriveRequestDto {

    private String role;
    private Double ctc;
    private Double minCgpa;
    private LocalDate deadline;
    private String description;
    private String status;
    private Long companyId;
}