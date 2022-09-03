package com.neo.docker.api.model;

import java.io.Serializable;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.github.dockerjava.api.model.AccessMode;
import com.github.dockerjava.api.model.Volume;
import com.github.dockerjava.api.model.VolumeRW;
import lombok.ToString;

// This is not going to be serialized
@ToString
public class VolumesRW implements Serializable {
    private static final long serialVersionUID = 1L;

    private final com.github.dockerjava.api.model.VolumeRW[] volumesRW;

    public VolumesRW(com.github.dockerjava.api.model.VolumeRW... binds) {
        this.volumesRW = binds;
    }

    public com.github.dockerjava.api.model.VolumeRW[] getVolumesRW() {
        return volumesRW;
    }

    @JsonCreator
    public static VolumesRW fromPrimitive(Map<String, Boolean> map) {
        return new VolumesRW(
                map.entrySet().stream()
                    .map(entry -> new com.github.dockerjava.api.model.VolumeRW(new Volume(entry.getKey()), AccessMode.fromBoolean(entry.getValue())))
                    .toArray(VolumeRW[]::new)
        );
    }

    @JsonValue
    public Map<String, Boolean> toPrimitive() {
        return Stream.of(volumesRW).collect(Collectors.toMap(
                it -> it.getVolume().getPath(),
                it -> it.getAccessMode().toBoolean()
        ));
    }
}
