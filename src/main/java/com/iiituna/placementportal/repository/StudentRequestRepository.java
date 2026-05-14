package com.iiituna.placementportal.repository;

import com.iiituna.placementportal.model.StudentRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRequestRepository extends JpaRepository<StudentRequest, Long> {
}