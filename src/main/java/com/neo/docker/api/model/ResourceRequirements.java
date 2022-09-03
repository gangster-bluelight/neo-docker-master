package com.neo.docker.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.dockerjava.api.model.DockerObject;
import com.github.dockerjava.api.model.ResourceSpecs;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.annotation.CheckForNull;
import java.io.Serializable;

/**
 * @since {@link RemoteApiVersion#VERSION_1_24}
 */
@EqualsAndHashCode
@ToString
public class ResourceRequirements extends DockerObject implements Serializable {
    public static final long serialVersionUID = 1L;

    /**
     * @since 1.24
     */
    @JsonProperty("Limits")
    private com.github.dockerjava.api.model.ResourceSpecs limits;

    /**
     * @since 1.24
     */
    @JsonProperty("Reservations")
    private com.github.dockerjava.api.model.ResourceSpecs reservations;

    /**
     * @see #limits
     */
    @CheckForNull
    public com.github.dockerjava.api.model.ResourceSpecs getLimits() {
        return limits;
    }

    /**
     * @see #limits
     */
    public ResourceRequirements withLimits(com.github.dockerjava.api.model.ResourceSpecs limits) {
        this.limits = limits;
        return this;
    }

    /**
     * @see #reservations
     */
    @CheckForNull
    public com.github.dockerjava.api.model.ResourceSpecs getReservations() {
        return reservations;
    }

    /**
     * @see #reservations
     */
    public ResourceRequirements withReservations(ResourceSpecs reservations) {
        this.reservations = reservations;
        return this;
    }
}
