package com.iiituna.placementportal.service;

import com.iiituna.placementportal.model.InteractionLog;
import com.iiituna.placementportal.repository.InteractionLogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InteractionLogService {

    private final InteractionLogRepository interactionLogRepository;

    public InteractionLog createInteraction(InteractionLog interactionLog) {
        return interactionLogRepository.save(interactionLog);
    }

    public List<InteractionLog> getAllInteractions() {
        return interactionLogRepository.findAll();
    }
}