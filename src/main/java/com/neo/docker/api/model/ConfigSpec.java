package com.neo.docker.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.dockerjava.api.model.DockerObject;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

/**
 * @since {@link RemoteApiVersion#VERSION_1_30}
 */
@EqualsAndHashCode
@ToString
public class ConfigSpec extends DockerObject implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("Name")
    private String name;

    public String getName() {
        return name;
    }
}
