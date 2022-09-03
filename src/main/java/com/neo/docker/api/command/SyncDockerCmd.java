package com.neo.docker.api.command;

import com.github.dockerjava.api.command.DockerCmd;

public interface SyncDockerCmd<RES_T> extends DockerCmd<RES_T> {

    RES_T exec();

}
