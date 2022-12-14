package com.neo.docker.api.command;

import com.github.dockerjava.api.command.DockerCmdSyncExec;
import com.github.dockerjava.api.command.SyncDockerCmd;
import com.github.dockerjava.api.model.SwarmNodeSpec;

import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 * Update swarmNode spec
 *
 * @since {@link RemoteApiVersion#VERSION_1_24}
 */
public interface UpdateSwarmNodeCmd extends SyncDockerCmd<Void> {

    @CheckForNull
    String getSwarmNodeId();

    UpdateSwarmNodeCmd withSwarmNodeId(@Nonnull String swarmNodeId);

    @CheckForNull
    SwarmNodeSpec getSwarmNodeSpec();

    UpdateSwarmNodeCmd withSwarmNodeSpec(SwarmNodeSpec swarmNodeSpec);

    UpdateSwarmNodeCmd withVersion(@Nonnull Long versionId);

    @CheckForNull
    Long getVersion();

    interface Exec extends DockerCmdSyncExec<UpdateSwarmNodeCmd, Void> {
    }
}
