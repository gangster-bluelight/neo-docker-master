package com.neo.docker.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.dockerjava.api.model.DockerObject;
import com.github.dockerjava.api.model.ExternalCA;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.annotation.CheckForNull;
import java.io.Serializable;
import java.util.List;

/**
 * @since {@link RemoteApiVersion#VERSION_1_24}
 */
@EqualsAndHashCode
@ToString
public class SwarmCAConfig extends DockerObject implements Serializable {

    public static final long serialVersionUID = 1L;

    /**
     * @since 1.24
     */
    @JsonProperty("NodeCertExpiry")
    private Long nodeCertExpiry;

    /**
     * @since 1.24
     */
    @JsonProperty("ExternalCAs")
    private List<com.github.dockerjava.api.model.ExternalCA> externalCA;

    /**
     * @see #nodeCertExpiry
     */
    @CheckForNull
    public Long getNodeCertExpiry() {
        return nodeCertExpiry;
    }

    /**
     * @see #nodeCertExpiry
     */
    public SwarmCAConfig withNodeCertExpiry(Long nodeCertExpiry) {
        this.nodeCertExpiry = nodeCertExpiry;
        return this;
    }

    /**
     * @see #externalCA
     */
    @CheckForNull
    public List<com.github.dockerjava.api.model.ExternalCA> getExternalCA() {
        return externalCA;
    }

    /**
     * @see #externalCA
     */
    public SwarmCAConfig withExternalCA(List<ExternalCA> externalCA) {
        this.externalCA = externalCA;
        return this;
    }
}
