package com.neo.docker.core.command;

import com.github.dockerjava.api.command.PingCmd;

/**
 * Ping the Docker server
 */
public class PingCmdImpl extends AbstrDockerCmd<PingCmd, Void> implements PingCmd {

    public PingCmdImpl(PingCmd.Exec exec) {
        super(exec);
    }
}
