package com.neo.docker.api.command;

import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

import com.github.dockerjava.api.command.DockerCmdSyncExec;
import com.github.dockerjava.api.command.InspectImageResponse;
import com.github.dockerjava.api.command.SyncDockerCmd;
import com.github.dockerjava.api.exception.NotFoundException;

/**
 * Inspect the details of an image.
 */
public interface InspectImageCmd extends SyncDockerCmd<InspectImageResponse> {

    @CheckForNull
    String getImageId();

    InspectImageCmd withImageId(@Nonnull String imageId);

    /**
     * @throws NotFoundException
     *             No such image
     */
    @Override
    InspectImageResponse exec() throws NotFoundException;

    interface Exec extends DockerCmdSyncExec<InspectImageCmd, InspectImageResponse> {
    }

}
