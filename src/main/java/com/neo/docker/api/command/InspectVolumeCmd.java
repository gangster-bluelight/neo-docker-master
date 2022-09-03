package com.neo.docker.api.command;

import com.github.dockerjava.api.command.DockerCmdSyncExec;
import com.github.dockerjava.api.command.InspectVolumeResponse;
import com.github.dockerjava.api.command.SyncDockerCmd;

import javax.annotation.Nonnull;

/**
 * Inspect the details of a volume.
 *
 * @author Marcus Linke
 *
 */
public interface InspectVolumeCmd extends SyncDockerCmd<InspectVolumeResponse> {

    String getName();

    /**
     * @param name
     *            - The volume’s name.
     */
    InspectVolumeCmd withName(@Nonnull String name);

    interface Exec extends DockerCmdSyncExec<InspectVolumeCmd, InspectVolumeResponse> {
    }
}
