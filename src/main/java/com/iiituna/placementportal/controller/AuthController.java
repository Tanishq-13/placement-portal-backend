//package com.iiituna.placementportal.controller;
//
//import com.iiituna.placementportal.dto.LoginRequestDto;
//import com.iiituna.placementportal.dto.SignupRequestDto;
//import com.iiituna.placementportal.service.AuthService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/auth")
//@RequiredArgsConstructor
//public class AuthController {
//
//    private final AuthService authService;
//
//    @PostMapping("/signup")
//    public String signup(@RequestBody SignupRequestDto dto) {
//        return authService.signup(dto);
//    }
//
//    @PostMapping("/login")
//    public String login(@RequestBody LoginRequestDto dto) {
//        return authService.login(dto);
//    }
//}