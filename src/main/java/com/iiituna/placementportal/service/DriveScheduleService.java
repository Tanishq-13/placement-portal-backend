package com.iiituna.placementportal.service;

import com.iiituna.placementportal.model.DriveSchedule;
import com.iiituna.placementportal.repository.DriveScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DriveScheduleService {

    private final DriveScheduleRepository driveScheduleRepository;

    public DriveSchedule createSchedule(DriveSchedule schedule) {
        return driveScheduleRepository.save(schedule);
    }

    public List<DriveSchedule> getAllSchedules() {
        return driveScheduleRepository.findAll();
    }
}