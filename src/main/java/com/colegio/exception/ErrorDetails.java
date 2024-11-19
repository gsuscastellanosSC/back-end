package com.colegio.exception;

import lombok.Builder;

@Builder
public class ErrorDetails {
    private int statusCode;
    private String message;
    private String details;
}
