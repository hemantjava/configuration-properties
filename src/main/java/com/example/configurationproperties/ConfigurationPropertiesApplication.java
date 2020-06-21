package com.example.configurationproperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigurationPropertiesApplication implements CommandLineRunner {

    @Autowired
    private ConfigProperties configProperties;

    @Autowired
    private Item item;

    public static void main (String[] args) {
        SpringApplication.run(ConfigurationPropertiesApplication.class, args);
    }

    @Override
    public void run (String... args) throws Exception {

        System.out.println("---------------complete-------------------------------");
        System.out.println(configProperties);


        System.out.println("----------------------------------------------");


        for (String hob : configProperties.getHobby()) {
            System.out.println(hob);
        }


        System.out.println("----------------------------------------------");
        configProperties.getAdditionalHeaders().forEach((x, y) ->
                System.out.println(x + "   " + y)
        );
        System.out.println("----------------------------------------------");

        configProperties.getDefaultRecipients().forEach(x ->
                System.out.println(x)
        );
        System.out.println("----------------------------------------------");

        System.out.println(configProperties.getCredentials());

        System.out.println("----------------------------------------------");

        System.out.println(item);
    }
}
