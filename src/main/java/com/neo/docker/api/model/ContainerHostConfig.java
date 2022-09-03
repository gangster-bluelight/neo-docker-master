package com.neo.docker.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.dockerjava.api.model.Container;
import com.github.dockerjava.api.model.DockerObject;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

/**
 * Used in {@link com.github.dockerjava.api.model.Container}
 *
 * @see Container
 * @author Kanstantsin Shautsou
 */
@EqualsAndHashCode
@ToString
public class ContainerHostConfig extends DockerObject implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("NetworkMode")
    private String networkMode;

    public String getNetworkMode() {
        return networkMode;
    }

    /**
     * @see #networkMode
     */
    public ContainerHostConfig withNetworkMode(String networkMode) {
        this.networkMode = networkMode;
        return this;
    }
}
