package com.neon;

import com.azure.spring.data.cosmos.repository.config.EnableCosmosRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class DevBuddyApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevBuddyApplication.class, args);
    }

}
