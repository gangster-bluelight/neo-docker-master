package com.neo.docker.api.command;

import com.github.dockerjava.api.command.DockerCmd;

public interface DockerCmdSyncExec<CMD_T extends DockerCmd<RES_T>, RES_T> {

    RES_T exec(CMD_T command);

}
