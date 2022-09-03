package com.neo.docker.api.command;

import com.github.dockerjava.api.command.DockerCmdSyncExec;
import com.github.dockerjava.api.command.SyncDockerCmd;
import com.github.dockerjava.api.model.Info;

public interface InfoCmd extends SyncDockerCmd<Info> {

    interface Exec extends DockerCmdSyncExec<InfoCmd, Info> {
    }

}
