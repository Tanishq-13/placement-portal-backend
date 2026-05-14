package com.iiituna.placementportal.controller;

import com.iiituna.placementportal.model.InteractionLog;
import com.iiituna.placementportal.service.InteractionLogService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/interactions")
@RequiredArgsConstructor
public class InteractionLogController {

    private final InteractionLogService interactionLogService;

    @PostMapping
    public InteractionLog createInteraction(@RequestBody InteractionLog interactionLog) {
        return interactionLogService.createInteraction(interactionLog);
    }

    @GetMapping
    public List<InteractionLog> getAllInteractions() {
        return interactionLogService.getAllInteractions();
    }
}