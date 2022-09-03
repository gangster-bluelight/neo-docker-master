package com.neo.docker.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.github.dockerjava.api.model.ExposedPort;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@ToString
public class ExposedPorts implements Serializable {
    private static final long serialVersionUID = 1L;

    private com.github.dockerjava.api.model.ExposedPort[] exposedPorts;

    public ExposedPorts(com.github.dockerjava.api.model.ExposedPort... exposedPorts) {
        this.exposedPorts = exposedPorts;
    }

    public ExposedPorts(List<com.github.dockerjava.api.model.ExposedPort> exposedPorts) {
        this.exposedPorts = exposedPorts.toArray(new com.github.dockerjava.api.model.ExposedPort[exposedPorts.size()]);
    }

    public com.github.dockerjava.api.model.ExposedPort[] getExposedPorts() {
        return exposedPorts;
    }

    @JsonCreator
    public static ExposedPorts fromPrimitive(Map<String, Object> object) {
        return new ExposedPorts(
                object.keySet().stream().map(com.github.dockerjava.api.model.ExposedPort::parse).toArray(com.github.dockerjava.api.model.ExposedPort[]::new)
        );
    }

    @JsonValue
    public Map<String, Object> toPrimitive() {
        return Stream.of(exposedPorts).collect(Collectors.toMap(
            ExposedPort::toString,
            __ -> new Object(),
            (a, b) -> a
        ));
    }

}
