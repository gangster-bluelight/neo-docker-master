package com.neo.docker.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.dockerjava.api.model.DockerObject;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

@EqualsAndHashCode
@ToString
public class ErrorDetail extends DockerObject implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty
    private String message;

    public String getMessage() {
        return message;
    }
}
