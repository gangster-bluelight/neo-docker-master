package com.neo.docker.api.command;


import com.github.dockerjava.api.command.DockerCmdSyncExec;
import com.github.dockerjava.api.command.SyncDockerCmd;

import javax.annotation.CheckForNull;
import java.util.List;

public interface JoinSwarmCmd extends SyncDockerCmd<Void> {

    @CheckForNull
    String getListenAddr();

    JoinSwarmCmd withListenAddr(String listenAddr);

    @CheckForNull
    String getAdvertiseAddr();

    JoinSwarmCmd withAdvertiseAddr(String advertiseAddr);

    @CheckForNull
    List<String> getRemoteAddrs();

    JoinSwarmCmd withRemoteAddrs(List<String> remoteAddrs);

    @CheckForNull
    String getJoinToken();

    JoinSwarmCmd withJoinToken(String joinToken);

    @Override
    Void exec();

    interface Exec extends DockerCmdSyncExec<JoinSwarmCmd, Void> {
    }
}
