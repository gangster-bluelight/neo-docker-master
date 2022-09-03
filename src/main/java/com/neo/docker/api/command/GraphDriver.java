package com.neo.docker.api.command;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.dockerjava.api.command.GraphData;
import com.github.dockerjava.api.command.InspectContainerResponse;
import com.github.dockerjava.api.command.InspectImageResponse;
import com.github.dockerjava.api.model.DockerObject;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.annotation.CheckForNull;

/**
 * Part of {@link InspectImageResponse} and {@link InspectContainerResponse}
 *
 * @author Kanstantsin Shautsou
 * @since {@link com.github.dockerjava.core.RemoteApiVersion#VERSION_1_21}
 */
@EqualsAndHashCode
@ToString
public class GraphDriver extends DockerObject {
    /**
     * @since {@link com.github.dockerjava.core.RemoteApiVersion#VERSION_1_21}
     */
    @JsonProperty("Name")
    private String name;

    /**
     * @since {@link com.github.dockerjava.core.RemoteApiVersion#VERSION_1_21}
     */
    @JsonProperty("Data")
    private com.github.dockerjava.api.command.GraphData data;


    /**
     * @see #data
     */
    @CheckForNull
    public com.github.dockerjava.api.command.GraphData getData() {
        return data;
    }

    /**
     * @see #data
     */
    public GraphDriver withData(GraphData data) {
        this.data = data;
        return this;
    }

    /**
     * @see #name
     */
    @CheckForNull
    public String getName() {
        return name;
    }

    /**
     * @see #name
     */
    public GraphDriver withName(String name) {
        this.name = name;
        return this;
    }
}
