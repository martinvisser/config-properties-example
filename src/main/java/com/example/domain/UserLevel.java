package com.example.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@RequiredArgsConstructor
public enum UserLevel {
    LEVEL_0(0),
    LEVEL_1(1),
    LEVEL_2(2),
    LEVEL_3(3);

    private final int value;

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static UserLevel fromValue(final String value) {
        if (value == null) {
            return null;
        }

        if (value.startsWith("LEVEL_")) {
            return Arrays.stream(values())
                    .filter(userLevel -> userLevel.name().equalsIgnoreCase(value))
                    .findAny()
                    .orElse(null);
        }
        return fromValue(Integer.valueOf(value));
    }

    public static UserLevel fromValue(final Integer value) {
        if (value == null) {
            return null;
        }
        return Arrays.stream(values())
                .filter(userLevel -> userLevel.value == value)
                .findAny()
                .orElse(null);
    }
}
