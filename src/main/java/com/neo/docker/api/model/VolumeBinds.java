package com.neo.docker.api.model;

import java.io.Serializable;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.github.dockerjava.api.model.VolumeBind;
import lombok.ToString;

@ToString
public class VolumeBinds implements Serializable {
    private static final long serialVersionUID = 1L;

    private final com.github.dockerjava.api.model.VolumeBind[] binds;

    public VolumeBinds(com.github.dockerjava.api.model.VolumeBind... binds) {
        this.binds = binds;
    }

    public com.github.dockerjava.api.model.VolumeBind[] getBinds() {
        return binds;
    }

    @JsonCreator
    public static VolumeBinds fromPrimitive(Map<String, String> primitive) {
        return new VolumeBinds(
                primitive.entrySet().stream()
                .map(it -> new com.github.dockerjava.api.model.VolumeBind(it.getValue(), it.getKey()))
                .toArray(com.github.dockerjava.api.model.VolumeBind[]::new)
        );
    }

    @JsonValue
    public Map<String, String> toPrimitive() {
        return Stream.of(binds).collect(Collectors.toMap(
                com.github.dockerjava.api.model.VolumeBind::getContainerPath,
                VolumeBind::getHostPath
        ));
    }

}
