package com.neo.docker.api.command;


import com.github.dockerjava.api.command.DockerCmdSyncExec;
import com.github.dockerjava.api.command.SyncDockerCmd;
import com.github.dockerjava.api.model.Swarm;

/**
 * Inspect a swarm.
 */
public interface InspectSwarmCmd extends SyncDockerCmd<Swarm> {

    @Override
    Swarm exec();

    interface Exec extends DockerCmdSyncExec<InspectSwarmCmd, Swarm> {
    }


}
