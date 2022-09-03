package com.neo.docker.api.model;

import com.github.dockerjava.api.model.GenericResource;

import java.io.Serializable;

/**
 * @since {@link RemoteApiVersion#VERSION_1_24}
 */
@Deprecated
public class NamedResourceSpec extends GenericResource<Integer> implements Serializable {
    private static final long serialVersionUID = 1L;
}
