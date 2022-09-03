package com.neo.docker.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.dockerjava.api.model.DockerObject;
import com.github.dockerjava.api.model.EndpointSpec;
import com.github.dockerjava.api.model.EndpointVirtualIP;
import com.github.dockerjava.api.model.PortConfig;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.annotation.CheckForNull;
import java.io.Serializable;

/**
 * @since {@link RemoteApiVersion#VERSION_1_24}
 */
@EqualsAndHashCode
@ToString
public class Endpoint extends DockerObject implements Serializable {
    public static final long serialVersionUID = 1L;

    /**
     * @since 1.24
     */
    @JsonProperty("Spec")
    private EndpointSpec spec;

    /**
     * @since 1.24
     */
    @JsonProperty("Ports")
    private PortConfig[] ports;

    /**
     * @since 1.24
     */
    @JsonProperty("VirtualIPs")
    private EndpointVirtualIP[] virtualIPs;

    /**
     * @see #spec
     */
    @CheckForNull
    public EndpointSpec getSpec() {
        return spec;
    }

    /**
     * @see #spec
     */
    public Endpoint withSpec(EndpointSpec spec) {
        this.spec = spec;
        return this;
    }

    /**
     * @see #ports
     */
    @CheckForNull
    public PortConfig[] getPorts() {
        return ports;
    }

    /**
     * @see #ports
     */
    public Endpoint withPorts(PortConfig[] ports) {
        this.ports = ports;
        return this;
    }

    /**
     * @see #virtualIPs
     */
    @CheckForNull
    public EndpointVirtualIP[] getVirtualIPs() {
        return virtualIPs;
    }

    /**
     * @see #virtualIPs
     */
    public Endpoint withVirtualIPs(EndpointVirtualIP[] virtualIPs) {
        this.virtualIPs = virtualIPs;
        return this;
    }
}
