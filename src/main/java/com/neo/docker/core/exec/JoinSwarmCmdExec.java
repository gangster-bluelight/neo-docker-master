package com.neo.docker.core.exec;


import com.github.dockerjava.api.command.JoinSwarmCmd;
import com.github.dockerjava.core.DockerClientConfig;
import com.github.dockerjava.core.MediaType;
import com.github.dockerjava.core.WebTarget;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class JoinSwarmCmdExec extends AbstrSyncDockerCmdExec<JoinSwarmCmd, Void>
        implements JoinSwarmCmd.Exec {

    private static final Logger LOGGER = LoggerFactory.getLogger(InitializeSwarmCmdExec.class);

    public JoinSwarmCmdExec(WebTarget baseResource, DockerClientConfig dockerClientConfig) {
        super(baseResource, dockerClientConfig);
    }

    @Override
    protected Void execute(JoinSwarmCmd command) {
        WebTarget webResource = getBaseResource().path("/swarm/join");

        LOGGER.trace("POST: {} ", webResource);
        try {
            webResource.request().accept(MediaType.APPLICATION_JSON).post(command).close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
