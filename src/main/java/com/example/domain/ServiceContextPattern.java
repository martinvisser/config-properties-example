package com.example.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ServiceContextPattern {
    private String externalContextPattern;
    private String internalContextPattern; // optional
    private final List<HttpMethod> allowedMethods = new ArrayList<>();
}
