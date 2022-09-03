package com.neo.docker.api.command;

import com.github.dockerjava.api.async.ResultCallback;
import com.github.dockerjava.api.async.ResultCallbackTemplate;
import com.github.dockerjava.api.command.DockerCmd;

/**
 *
 *
 * @author neo-w7
 *
 */
public interface AsyncDockerCmd<CMD_T extends AsyncDockerCmd<CMD_T, A_RES_T>, A_RES_T> extends DockerCmd<Void> {

    <T extends ResultCallback<A_RES_T>> T exec(T resultCallback);

    default ResultCallbackTemplate<?, A_RES_T> start() {
        return exec(new ResultCallback.Adapter<>());
    }
}
