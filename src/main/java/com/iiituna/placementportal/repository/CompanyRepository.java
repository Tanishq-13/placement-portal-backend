package com.iiituna.placementportal.repository;

import com.iiituna.placementportal.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}