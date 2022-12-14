package com.neo.docker.api.command;


import com.github.dockerjava.api.command.DockerCmdSyncExec;
import com.github.dockerjava.api.command.SyncDockerCmd;
import com.github.dockerjava.api.exception.NotFoundException;
import com.github.dockerjava.api.model.SwarmNode;

import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 * Inspect a swarmNode.
 *
 * @since {@link RemoteApiVersion#VERSION_1_24}
 */
public interface InspectSwarmNodeCmd extends SyncDockerCmd<SwarmNode> {

    @CheckForNull
    String getSwarmNodeId();

    InspectSwarmNodeCmd withSwarmNodeId(@Nonnull String swarmNodeId);

    /**
     * @throws NotFoundException No such swarmNode
     */
    @Override
    SwarmNode exec() throws NotFoundException;

    interface Exec extends DockerCmdSyncExec<InspectSwarmNodeCmd, SwarmNode> {
    }
}
