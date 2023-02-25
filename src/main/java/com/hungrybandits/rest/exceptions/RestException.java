package com.hungrybandits.rest.exceptions;

import com.hungrybandits.rest.exceptions.dtos.ApiCallError;
import lombok.Getter;

@Getter
public class RestException extends RuntimeException{
    private final ApiCallError apiCallError;

    public RestException(ApiCallError apiCallError) {
        super(apiCallError.getMessage());
        this.apiCallError = apiCallError;
    }
}
