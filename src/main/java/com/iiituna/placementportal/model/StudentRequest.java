package com.iiituna.placementportal.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "student_requests")
public class StudentRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rollNo;

    private String studentName;

    private String type;

    private String subject;

    @Column(length = 5000)
    private String description;

    private String status;

    private String date;
}