package com.neo.docker.api.command;

import com.github.dockerjava.api.command.DockerCmdSyncExec;
import com.github.dockerjava.api.command.SyncDockerCmd;
import com.github.dockerjava.api.exception.NotFoundException;
import com.github.dockerjava.api.model.Task;

import javax.annotation.CheckForNull;

public interface InspectTaskCmd extends SyncDockerCmd<Task> {
    @CheckForNull
    String getTaskId();

    InspectTaskCmd withTaskId();

    @Override
    Task exec() throws NotFoundException;

    interface Exec extends DockerCmdSyncExec<InspectTaskCmd, Task> {
    }
}
