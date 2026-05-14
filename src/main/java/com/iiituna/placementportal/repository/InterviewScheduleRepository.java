package com.iiituna.placementportal.repository;

import com.iiituna.placementportal.model.InterviewSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterviewScheduleRepository extends JpaRepository<InterviewSchedule, Long> {
}