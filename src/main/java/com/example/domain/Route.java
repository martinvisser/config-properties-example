package com.example.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Route {
    private String targetHost;
    private final List<String> externalHosts = new ArrayList<>();
}
