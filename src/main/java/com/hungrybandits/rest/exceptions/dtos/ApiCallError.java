package com.hungrybandits.rest.exceptions.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiCallError {
    private int statusCode;
    private String URI;
    private String message;
    private LocalDateTime timestamp;
    private List<String> details;

    public ApiCallError(int statusCode, String message, List<String> details) {
        this.statusCode = statusCode;
        this.message = message;
        this.details = details;
    }
}
