package com.example.configurationproperties.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student {
    private String fname;
    private String mname;
    private String lname;
}
