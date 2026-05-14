package com.iiituna.placementportal.repository;

import com.iiituna.placementportal.model.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application, Long> {
}