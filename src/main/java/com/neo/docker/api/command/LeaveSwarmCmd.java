package com.neo.docker.api.command;


import com.github.dockerjava.api.command.DockerCmdSyncExec;
import com.github.dockerjava.api.command.SyncDockerCmd;

import javax.annotation.CheckForNull;

public interface LeaveSwarmCmd extends SyncDockerCmd<Void> {

    @CheckForNull
    Boolean hasForceEnabled();

    LeaveSwarmCmd withForceEnabled(Boolean force);

    @Override
    Void exec();

    interface Exec extends DockerCmdSyncExec<LeaveSwarmCmd, Void> {
    }
}
