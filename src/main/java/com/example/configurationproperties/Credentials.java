package com.example.configurationproperties;

import lombok.Data;

import java.util.Map;

@Data
public class Credentials {
    private String authMethod;
    private String username;
    private String password;
    private Map<String, String> additionalCredentials;

}
