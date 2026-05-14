package com.iiituna.placementportal.controller;

import com.iiituna.placementportal.dto.JobDriveRequestDto;
import com.iiituna.placementportal.model.JobDrive;
import com.iiituna.placementportal.service.JobDriveService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/drives")
@RequiredArgsConstructor
public class JobDriveController {

    private final JobDriveService jobDriveService;

    @PostMapping
    public JobDrive createDrive(@RequestBody JobDriveRequestDto dto) {
        return jobDriveService.createDrive(dto);
    }

    @GetMapping
    public List<JobDrive> getAllDrives() {
        return jobDriveService.getAllDrives();
    }
}