package com.neo.docker.api.command;

import com.github.dockerjava.api.command.DockerCmdSyncExec;
import com.github.dockerjava.api.command.SyncDockerCmd;

/**
 * Ping the Docker server
 *
 */
public interface PingCmd extends SyncDockerCmd<Void> {

    interface Exec extends DockerCmdSyncExec<PingCmd, Void> {
    }

}
