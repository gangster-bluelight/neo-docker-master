package com.neo.docker.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.dockerjava.api.model.DockerObject;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @since {@link RemoteApiVersion#VERSION_1_24}
 * The version number of the object such as node, service, etc. This is needed to avoid conflicting writes.
 * The client must send the version number along with the modified specification when updating these objects.
 * This approach ensures safe concurrency and determinism in that the change on the object may not be applied
 * if the version number has changed from the last read. In other words, if two update requests specify the
 * same base version, only one of the requests can succeed. As a result, two separate update requests that
 * happen at the same time will not unintentionally overwrite each other.
 */
@EqualsAndHashCode
public class ObjectVersion extends DockerObject implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("Index")
    private Long index = null;

    public Long getIndex() {
        return index;
    }

    public ObjectVersion withIndex(Long index) {
        this.index = index;
        return this;
    }

    @Override
    public String toString() {
        return String.valueOf(index);
    }
}
