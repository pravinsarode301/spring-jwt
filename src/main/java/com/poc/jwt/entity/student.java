package com.poc.jwt.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class student {
    private String firstName;
    private String LastName;
}

