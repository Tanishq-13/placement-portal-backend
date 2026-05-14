package com.iiituna.placementportal.dto;

import lombok.Data;

@Data
public class SignupRequestDto {

    private String email;
    private String password;
    private String confirmPassword;
}