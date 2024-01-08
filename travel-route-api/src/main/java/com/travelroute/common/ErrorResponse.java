package com.travelroute.common;

import java.time.LocalDateTime;

public record ErrorResponse(LocalDateTime dateTime, String code, String message) {

    public ErrorResponse(String code, String message) {
        this(LocalDateTime.now(), code, message);
    }
}
