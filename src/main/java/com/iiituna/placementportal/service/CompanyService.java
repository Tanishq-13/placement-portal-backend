package com.iiituna.placementportal.service;

import com.iiituna.placementportal.dto.CompanyRequestDto;
import com.iiituna.placementportal.model.Company;
import com.iiituna.placementportal.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyRepository companyRepository;

    public Company createCompany(CompanyRequestDto dto) {

        Company company = Company.builder()
                .companyName(dto.getCompanyName())
                .role(dto.getRole())
                .ctc(dto.getCtc())
                .minCgpa(dto.getMinCgpa())
                .location(dto.getLocation())
                .jobType(dto.getJobType())
                .description(dto.getDescription())
                .build();

        return companyRepository.save(company);
    }

    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }
}