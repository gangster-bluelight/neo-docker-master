package com.neo.docker.api.command;

import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

import com.github.dockerjava.api.command.DockerCmdSyncExec;
import com.github.dockerjava.api.command.InspectContainerResponse;
import com.github.dockerjava.api.command.SyncDockerCmd;
import com.github.dockerjava.api.exception.NotFoundException;

public interface InspectContainerCmd extends SyncDockerCmd<InspectContainerResponse> {

    @CheckForNull
    String getContainerId();

    InspectContainerCmd withContainerId(@Nonnull String containerId);

    InspectContainerCmd withSize(Boolean showSize);

    Boolean getSize();

    /**
     * @throws NotFoundException
     *             No such container
     */
    @Override
    InspectContainerResponse exec() throws NotFoundException;

    interface Exec extends DockerCmdSyncExec<InspectContainerCmd, InspectContainerResponse> {
    }
}
