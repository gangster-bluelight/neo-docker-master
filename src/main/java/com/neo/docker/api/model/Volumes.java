package com.neo.docker.api.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.github.dockerjava.api.model.Volume;
import lombok.ToString;

@ToString
public class Volumes implements Serializable {
    private static final long serialVersionUID = 1L;

    private com.github.dockerjava.api.model.Volume[] volumes;

    public Volumes(com.github.dockerjava.api.model.Volume... volumes) {
        this.volumes = volumes;
    }

    public Volumes(List<com.github.dockerjava.api.model.Volume> volumes) {
        this.volumes = volumes.toArray(new com.github.dockerjava.api.model.Volume[volumes.size()]);
    }

    public com.github.dockerjava.api.model.Volume[] getVolumes() {
        return volumes;
    }

    @JsonCreator
    public static Volumes fromPrimitive(Map<String, Object> map) {
        return new Volumes(
                map.keySet().stream().map(com.github.dockerjava.api.model.Volume::new).toArray(com.github.dockerjava.api.model.Volume[]::new)
        );
    }

    @JsonValue
    public Map<String, Object> toPrimitive() {
        return Stream.of(volumes).collect(Collectors.toMap(
                Volume::getPath,
                __ -> new Object()
        ));
    }

}
