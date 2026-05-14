package com.iiituna.placementportal.model;

import com.iiituna.placementportal.enums.Role;
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

    private String name;

    private String password;

    @Column(unique = true)
    private String email;

    private String rollNumber;

    private String branch;

    private Double cgpa;

    private Integer graduationYear;

    private String phoneNumber;

    private Boolean placed = false;

    @Enumerated(EnumType.STRING)
    private Role role = Role.STUDENT;
}