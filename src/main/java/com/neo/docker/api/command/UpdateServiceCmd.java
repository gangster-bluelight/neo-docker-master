package com.neo.docker.api.command;

import com.github.dockerjava.api.command.DockerCmdSyncExec;
import com.github.dockerjava.api.command.SyncDockerCmd;
import com.github.dockerjava.api.model.ServiceSpec;

import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 * @since {@link RemoteApiVersion#VERSION_1_24}
 */
public interface UpdateServiceCmd extends SyncDockerCmd<Void> {
    @CheckForNull
    String getServiceId();

    UpdateServiceCmd withServiceId(@Nonnull String serviceId);

    @CheckForNull
    ServiceSpec getServiceSpec();

    UpdateServiceCmd withServiceSpec(ServiceSpec serviceSpec);

    @CheckForNull
    Long getVersion();

    UpdateServiceCmd withVersion(Long version);

    interface Exec extends DockerCmdSyncExec<UpdateServiceCmd, Void> {
    }
}
