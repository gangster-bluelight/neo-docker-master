package com.neo.docker.api.command;

import com.github.dockerjava.api.async.ResultCallback;
import com.github.dockerjava.api.command.DockerCmd;

public interface DockerCmdAsyncExec<CMD_T extends DockerCmd<Void>, A_RES_T> {

    Void exec(CMD_T command, ResultCallback<A_RES_T> resultCallback);

}
