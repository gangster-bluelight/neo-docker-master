package com.neo.docker.api.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.github.dockerjava.api.model.DockerObjectAccessor;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @see DockerObjectAccessor
 */
public abstract class DockerObject {

    HashMap<String, Object> rawValues = new HashMap<>();

    @JsonAnyGetter
    public Map<String, Object> getRawValues() {
        return Collections.unmodifiableMap(this.rawValues);
    }
}
