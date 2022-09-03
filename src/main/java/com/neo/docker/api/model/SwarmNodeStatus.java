package com.neo.docker.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.dockerjava.api.model.DockerObject;
import com.github.dockerjava.api.model.SwarmNodeState;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.annotation.CheckForNull;
import java.io.Serializable;


/**
 * @since {@link RemoteApiVersion#VERSION_1_24}
 */
@EqualsAndHashCode
@ToString
public class SwarmNodeStatus extends DockerObject implements Serializable {
    public static final long serialVersionUID = 1L;

    /**
     * @since 1.24
     */
    @JsonProperty("State")
    private com.github.dockerjava.api.model.SwarmNodeState state;

    /**
     * @since 1.25
     */
    @JsonProperty("Addr")
    private String address;

    /**
     * @see #state
     */
    @CheckForNull
    public com.github.dockerjava.api.model.SwarmNodeState getState() {
        return state;
    }

    /**
     * @see #state
     */
    public SwarmNodeStatus withState(SwarmNodeState state) {
        this.state = state;
        return this;
    }

    /**
     * @see #address
     */
    @CheckForNull
    public String getAddress() {
        return address;
    }

    /**
     * @see #address
     */
    public SwarmNodeStatus withAddress(String address) {
        this.address = address;
        return this;
    }
}
