package com.iiituna.placementportal.service;

import com.iiituna.placementportal.dto.JobDriveRequestDto;
import com.iiituna.placementportal.model.Company;
import com.iiituna.placementportal.model.JobDrive;
import com.iiituna.placementportal.repository.CompanyRepository;
import com.iiituna.placementportal.repository.JobDriveRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JobDriveService {

    private final JobDriveRepository jobDriveRepository;
    private final CompanyRepository companyRepository;

    public JobDrive createDrive(JobDriveRequestDto dto) {

        Company company = companyRepository.findById(dto.getCompanyId())
                .orElseThrow(() -> new RuntimeException("Company not found"));

        JobDrive drive = JobDrive.builder()
                .role(dto.getRole())
                .ctc(dto.getCtc())
                .minCgpa(dto.getMinCgpa())
                .deadline(dto.getDeadline())
                .description(dto.getDescription())
                .status(dto.getStatus())
                .company(company)
                .build();

        return jobDriveRepository.save(drive);
    }

    public List<JobDrive> getAllDrives() {
        return jobDriveRepository.findAll();
    }
}