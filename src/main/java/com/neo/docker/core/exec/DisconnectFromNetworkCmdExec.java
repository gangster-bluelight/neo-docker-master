package com.neo.docker.core.exec;

import com.github.dockerjava.api.command.DisconnectFromNetworkCmd;
import com.github.dockerjava.core.DockerClientConfig;
import com.github.dockerjava.core.WebTarget;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class DisconnectFromNetworkCmdExec extends AbstrSyncDockerCmdExec<DisconnectFromNetworkCmd, Void>
        implements DisconnectFromNetworkCmd.Exec {

    private static final Logger LOGGER = LoggerFactory.getLogger(DisconnectFromNetworkCmdExec.class);

    public DisconnectFromNetworkCmdExec(WebTarget baseResource, DockerClientConfig dockerClientConfig) {
        super(baseResource, dockerClientConfig);
    }

    @Override
    protected Void execute(DisconnectFromNetworkCmd command) {

        WebTarget webTarget = getBaseResource().path("/networks/" + command.getNetworkId() + "/disconnect");

        LOGGER.trace("POST: {}", webTarget);
        try {
            webTarget.request().post(command).close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return null;
    }
}
