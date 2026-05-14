package com.iiituna.placementportal.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "companies")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String companyName;

    private String role;

    private Double ctc;

    private Double minCgpa;

    private String location;

    private String jobType;

    private String description;

    private Boolean active = true;
}
