package com.iiituna.placementportal.repository;

import com.iiituna.placementportal.model.InteractionLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InteractionLogRepository extends JpaRepository<InteractionLog, Long> {
}