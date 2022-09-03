package com.neo.docker.api.model;

import com.github.dockerjava.api.model.GenericResource;

import java.io.Serializable;

@Deprecated
public class DiscreteResourceSpec extends GenericResource<String> implements Serializable {
    private static final long serialVersionUID = 1L;
}
