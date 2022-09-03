package com.neo.docker.api.model;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Stream;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.github.dockerjava.api.model.Link;

public class Links implements Serializable {
    private static final long serialVersionUID = 1L;

    private final com.github.dockerjava.api.model.Link[] links;

    public Links(final com.github.dockerjava.api.model.Link... links) {
        this.links = links;
    }

    public Links(final List<com.github.dockerjava.api.model.Link> links) {
        this.links = links.toArray(new com.github.dockerjava.api.model.Link[links.size()]);
    }

    public com.github.dockerjava.api.model.Link[] getLinks() {
        return links;
    }

    @JsonCreator
    public static Links fromPrimitive(String[] links) {
        return new Links(
                Stream.of(links).map(com.github.dockerjava.api.model.Link::parse).toArray(com.github.dockerjava.api.model.Link[]::new)
        );
    }

    @JsonValue
    public String[] toPrimitive() {
        return Stream.of(links).map(Link::toString).toArray(String[]::new);
    }
}
