package com.iiituna.placementportal.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "oa_schedules")
public class OASchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate oaDate;

    private LocalTime oaTime;

    private String platform;

    private String meetingLink;

    private String instructions;

    @OneToOne
    @JoinColumn(name = "job_drive_id")
    private JobDrive jobDrive;
}