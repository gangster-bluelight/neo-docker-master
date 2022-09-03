package com.neo.docker.api.model;

import java.io.Serializable;
import java.util.stream.Stream;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.github.dockerjava.api.model.Bind;

public class Binds implements Serializable {
    private static final long serialVersionUID = 1L;

    private com.github.dockerjava.api.model.Bind[] binds;

    public Binds(com.github.dockerjava.api.model.Bind... binds) {
        this.binds = binds;
    }

    public com.github.dockerjava.api.model.Bind[] getBinds() {
        return binds;
    }

    @JsonValue
    public String[] toPrimitive() {
        return Stream.of(binds).map(com.github.dockerjava.api.model.Bind::toString).toArray(String[]::new);
    }

    @JsonCreator
    public static Binds fromPrimitive(String[] binds) {
        return new Binds(
                Stream.of(binds).map(com.github.dockerjava.api.model.Bind::parse).toArray(Bind[]::new)
        );
    }

}
