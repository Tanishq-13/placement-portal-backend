package com.iiituna.placementportal.dto;

import lombok.Data;

@Data
public class StudentRequestDto {

    private String rollNumber;

    private String studentName;

    private String branch;

    private String remark;

    private String companyName;

    private Double payPackage;

    private String designation;

    private String campusType;

    private String multipleOffers;

    private String additionalCompanies;

    private Double additionalPayPackage;
}