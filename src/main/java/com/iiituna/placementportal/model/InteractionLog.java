package com.iiituna.placementportal.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "interaction_logs")
public class InteractionLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cdcrName;

    private String companyName;

    @Column(length = 5000)
    private String callResult;

    private String interactionDate;

    private String hrContactNumber;

    private String hrEmail;

    private String hrLinkedin;

    private String dedicatedRecruiter;
}