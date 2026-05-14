package com.iiituna.placementportal.controller;

import com.iiituna.placementportal.model.DriveSchedule;
import com.iiituna.placementportal.service.DriveScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/drive-schedules")
@RequiredArgsConstructor
public class DriveScheduleController {

    private final DriveScheduleService driveScheduleService;

    @PostMapping
    public DriveSchedule createSchedule(@RequestBody DriveSchedule schedule) {
        return driveScheduleService.createSchedule(schedule);
    }

    @GetMapping
    public List<DriveSchedule> getAllSchedules() {
        return driveScheduleService.getAllSchedules();
    }
}