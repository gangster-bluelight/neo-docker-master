package com.neo.docker.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.dockerjava.api.model.DockerObject;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.annotation.CheckForNull;
import java.io.Serializable;

/**
 * @since {@link RemoteApiVersion#VERSION_1_24}
 */
@EqualsAndHashCode
@ToString
public class SwarmVersion extends DockerObject implements Serializable {

    public static final long serialVersionUID = 1L;

    /**
     * @since 1.24
     */
    @JsonProperty("Index")
    private long index;

    /**
     * @see #index
     */
    @CheckForNull
    public long getIndex() {
        return index;
    }

    /**
     * @see #index
     */
    public SwarmVersion withIndex(long index) {
        this.index = index;
        return this;
    }
}
