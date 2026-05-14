package com.iiituna.placementportal.service;

import com.iiituna.placementportal.model.StudentRequest;
import com.iiituna.placementportal.repository.StudentRequestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentRequestService {

    private final StudentRequestRepository studentRequestRepository;

    public StudentRequest createRequest(StudentRequest request) {
        return studentRequestRepository.save(request);
    }

    public List<StudentRequest> getAllRequests() {
        return studentRequestRepository.findAll();
    }
}