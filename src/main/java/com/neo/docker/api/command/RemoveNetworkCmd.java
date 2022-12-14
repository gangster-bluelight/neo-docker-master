package com.neo.docker.api.command;

import com.github.dockerjava.api.command.DockerCmdSyncExec;
import com.github.dockerjava.api.command.SyncDockerCmd;
import com.github.dockerjava.api.exception.NotFoundException;

import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 * Remove a network.
 *
 * @since {@link RemoteApiVersion#VERSION_1_21}
 */
public interface RemoveNetworkCmd extends SyncDockerCmd<Void> {

    @CheckForNull
    String getNetworkId();

    RemoveNetworkCmd withNetworkId(@Nonnull String networkId);

    /**
     * @throws NotFoundException
     *             No such network
     */
    @Override
    Void exec() throws NotFoundException;

    interface Exec extends DockerCmdSyncExec<RemoveNetworkCmd, Void> {
    }
}
