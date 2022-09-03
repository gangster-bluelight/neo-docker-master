package com.neo.docker.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.dockerjava.api.model.Container;
import com.github.dockerjava.api.model.ContainerNetwork;
import com.github.dockerjava.api.model.DockerObject;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;
import java.util.Map;

/**
 * Sub-object in {@link com.github.dockerjava.api.model.Container}
 *
 * @see Container
 * @since {@link RemoteApiVersion#VERSION_1_22}
 */
@EqualsAndHashCode
@ToString
public class ContainerNetworkSettings extends DockerObject implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * @since {@link RemoteApiVersion#VERSION_1_22}
     */
    @JsonProperty("Networks")
    private Map<String, com.github.dockerjava.api.model.ContainerNetwork> networks;

    /**
     * @see #networks
     */
    public Map<String, com.github.dockerjava.api.model.ContainerNetwork> getNetworks() {
        return networks;
    }

    /**
     * @see #networks
     */
    public ContainerNetworkSettings withNetworks(Map<String, ContainerNetwork> networks) {
        this.networks = networks;
        return this;
    }
}
