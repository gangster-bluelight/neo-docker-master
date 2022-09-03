package com.neo.docker.core;

public interface DockerClientConfigAware {

    void init(DockerClientConfig dockerClientConfig);
}
