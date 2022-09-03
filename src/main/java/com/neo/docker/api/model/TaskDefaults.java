package com.neo.docker.api.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.dockerjava.api.model.DockerObject;
import com.github.dockerjava.api.model.Driver;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.annotation.CheckForNull;
import java.io.Serializable;

/**
 * @since {@link RemoteApiVersion#VERSION_1_24}
 */
@EqualsAndHashCode
@ToString
public class TaskDefaults extends DockerObject implements Serializable {

    public static final long serialVersionUID = 1L;

    /**
     * @since 1.24
     */
    @JsonProperty("LogDriver")
    private com.github.dockerjava.api.model.Driver logDriver;

    /**
     * @see #logDriver
     */
    @CheckForNull
    public com.github.dockerjava.api.model.Driver getLogDriver() {
        return logDriver;
    }

    /**
     * @see #logDriver
     */
    public TaskDefaults withLogDriver(Driver logDriver) {
        this.logDriver = logDriver;
        return this;
    }
}
