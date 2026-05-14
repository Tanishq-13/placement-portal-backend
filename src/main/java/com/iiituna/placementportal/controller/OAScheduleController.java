package com.iiituna.placementportal.controller;

import com.iiituna.placementportal.dto.OAScheduleRequestDto;
import com.iiituna.placementportal.model.OASchedule;
import com.iiituna.placementportal.service.OAScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/oa-schedules")
@RequiredArgsConstructor
public class OAScheduleController {

    private final OAScheduleService oaScheduleService;

    @PostMapping
    public OASchedule createSchedule(@RequestBody OAScheduleRequestDto dto) {
        return oaScheduleService.createSchedule(dto);
    }
}