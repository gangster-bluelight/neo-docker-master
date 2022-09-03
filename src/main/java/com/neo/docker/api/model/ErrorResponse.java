package com.neo.docker.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.dockerjava.api.model.ErrorDetail;

import java.io.Serializable;

@Deprecated
public class ErrorResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty
    private com.github.dockerjava.api.model.ErrorDetail errorDetail;

    @JsonProperty
    private String error;

    public ErrorDetail getErrorDetail() {
        return errorDetail;
    }

    public String getError() {
        return error;
    }
}
