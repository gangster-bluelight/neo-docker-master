package com.neo.docker.api.command;

import com.github.dockerjava.api.command.DockerCmdSyncExec;
import com.github.dockerjava.api.command.SyncDockerCmd;

import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 * Disconnects a container from a network.
 *
 * @since {@link RemoteApiVersion#VERSION_1_21}
 */
public interface DisconnectFromNetworkCmd extends SyncDockerCmd<Void> {

    @CheckForNull
    String getNetworkId();

    @CheckForNull
    String getContainerId();

    @CheckForNull
    Boolean getForce();

    DisconnectFromNetworkCmd withNetworkId(@Nonnull String networkId);

    DisconnectFromNetworkCmd withContainerId(@Nonnull String containerId);

    DisconnectFromNetworkCmd withForce(@Nonnull Boolean force);

    interface Exec extends DockerCmdSyncExec<DisconnectFromNetworkCmd, Void> {
    }
}
