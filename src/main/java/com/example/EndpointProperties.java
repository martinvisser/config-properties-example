package com.example;

import com.example.domain.EndpointMapping;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@ConfigurationProperties("app.endpoint")
public class EndpointProperties {
    private String internalBaseUrlPattern;
    private final List<EndpointMapping> mappings = new ArrayList<>();
}
