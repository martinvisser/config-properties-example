package com.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class ConfigurationPropertiesApplication {

    public static void main(final String[] args) {
        SpringApplication.run(ConfigurationPropertiesApplication.class, args);
    }

    @Configuration
    @EnableConfigurationProperties(EndpointProperties.class)
    @Slf4j
    static class AppConfig {
        private final EndpointProperties endpointProperties;

        AppConfig(final EndpointProperties endpointProperties) {
            this.endpointProperties = endpointProperties;
        }

        @PostConstruct
        void init() {
            log.info("EndpointProperties loaded containing {} mappings", endpointProperties.getMappings().size());
        }
    }
}

