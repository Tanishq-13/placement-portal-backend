package com.iiituna.placementportal.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "job_drives")
public class JobDrive {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String role;

    private Double ctc;

    private Double minCgpa;

    private LocalDate deadline;

    private String description;

    private String status;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;
}