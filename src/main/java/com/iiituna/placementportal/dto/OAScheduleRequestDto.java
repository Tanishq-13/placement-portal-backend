package com.iiituna.placementportal.dto;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class OAScheduleRequestDto {

    private LocalDate oaDate;
    private LocalTime oaTime;
    private String platform;
    private String meetingLink;
    private String instructions;
    private Long jobDriveId;
}