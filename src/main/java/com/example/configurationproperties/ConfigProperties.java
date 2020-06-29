package com.example.configurationproperties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;
import java.util.Map;

@Data
@Configuration
@PropertySource("classpath:sonu.properties")
@ConfigurationProperties(prefix = "mail")
public class ConfigProperties {//sarita
    private String hostName;
    private int port;
    private String from;
    private String[] hobby;
    private List<String> defaultRecipients;
    private Map<String, String> additionalHeaders;
    private Credentials credentials;

    @Bean
    @ConfigurationProperties(prefix = "item")
    public Item getItem ( ) {
        return new Item();
    }

}