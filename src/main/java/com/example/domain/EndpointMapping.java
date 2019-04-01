package com.example.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class EndpointMapping {
    private String id;
    private Type type;
    private final List<Route> routes = new ArrayList<>();
    private final List<ServiceContextPattern> serviceContextPatterns = new ArrayList<>();
    private final List<UserMapping> allowedUsers = new ArrayList<>();
    private Auth auth;
    private Integer readTimeout;
}
