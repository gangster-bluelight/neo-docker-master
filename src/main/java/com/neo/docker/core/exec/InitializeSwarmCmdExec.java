package com.neo.docker.core.exec;


import com.github.dockerjava.api.command.InitializeSwarmCmd;
import com.github.dockerjava.core.DockerClientConfig;
import com.github.dockerjava.core.MediaType;
import com.github.dockerjava.core.WebTarget;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class InitializeSwarmCmdExec extends AbstrSyncDockerCmdExec<InitializeSwarmCmd, Void>
        implements InitializeSwarmCmd.Exec {

    private static final Logger LOGGER = LoggerFactory.getLogger(InitializeSwarmCmdExec.class);

    public InitializeSwarmCmdExec(WebTarget baseResource, DockerClientConfig dockerClientConfig) {
        super(baseResource, dockerClientConfig);
    }

    @Override
    protected Void execute(InitializeSwarmCmd command) {
        WebTarget webResource = getBaseResource().path("/swarm/init");

        LOGGER.trace("POST: {} ", webResource);
        try {
            webResource.request().accept(MediaType.APPLICATION_JSON).post(command).close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
