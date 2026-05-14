package com.iiituna.placementportal.controller;

import com.iiituna.placementportal.model.StudentRequest;
import com.iiituna.placementportal.service.StudentRequestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student-requests")
@RequiredArgsConstructor
public class StudentRequestController {

    private final StudentRequestService studentRequestService;

    @PostMapping
    public StudentRequest createRequest(@RequestBody StudentRequest request) {
        return studentRequestService.createRequest(request);
    }

    @GetMapping
    public List<StudentRequest> getAllRequests() {
        return studentRequestService.getAllRequests();
    }
}