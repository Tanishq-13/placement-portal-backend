package com.iiituna.placementportal.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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