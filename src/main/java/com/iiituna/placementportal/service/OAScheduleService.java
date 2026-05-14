package com.iiituna.placementportal.service;

import com.iiituna.placementportal.dto.OAScheduleRequestDto;
import com.iiituna.placementportal.model.JobDrive;
import com.iiituna.placementportal.model.OASchedule;
import com.iiituna.placementportal.repository.JobDriveRepository;
import com.iiituna.placementportal.repository.OAScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OAScheduleService {

    private final OAScheduleRepository oaScheduleRepository;
    private final JobDriveRepository jobDriveRepository;

    public OASchedule createSchedule(OAScheduleRequestDto dto) {

        JobDrive drive = jobDriveRepository.findById(dto.getJobDriveId())
                .orElseThrow(() -> new RuntimeException("Drive not found"));

        OASchedule schedule = OASchedule.builder()
                .oaDate(dto.getOaDate())
                .oaTime(dto.getOaTime())
                .platform(dto.getPlatform())
                .meetingLink(dto.getMeetingLink())
                .instructions(dto.getInstructions())
                .jobDrive(drive)
                .build();

        return oaScheduleRepository.save(schedule);
    }
}