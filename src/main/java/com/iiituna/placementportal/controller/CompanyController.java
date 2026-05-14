package com.iiituna.placementportal.controller;

import com.iiituna.placementportal.dto.CompanyRequestDto;
import com.iiituna.placementportal.model.Company;
import com.iiituna.placementportal.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/companies")
@RequiredArgsConstructor
public class CompanyController {

    private final CompanyService companyService;

    @PostMapping
    public Company createCompany(@RequestBody CompanyRequestDto dto) {
        return companyService.createCompany(dto);
    }

    @GetMapping
    public List<Company> getAllCompanies() {
        return companyService.getAllCompanies();
    }
}