package com.neo.docker.core.exec;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.dockerjava.api.command.StartContainerCmd;
import com.github.dockerjava.core.DockerClientConfig;
import com.github.dockerjava.core.MediaType;
import com.github.dockerjava.core.WebTarget;

import java.io.IOException;

public class StartContainerCmdExec extends AbstrSyncDockerCmdExec<StartContainerCmd, Void> implements
        StartContainerCmd.Exec {

    private static final Logger LOGGER = LoggerFactory.getLogger(StartContainerCmdExec.class);

    public StartContainerCmdExec(WebTarget baseResource, DockerClientConfig dockerClientConfig) {
        super(baseResource, dockerClientConfig);
    }

    @Override
    protected Void execute(StartContainerCmd command) {
        WebTarget webResource = getBaseResource().path("/containers/{id}/start").resolveTemplate("id",
                command.getContainerId());

        LOGGER.trace("POST: {}", webResource);
        try {
            webResource.request()
                    .accept(MediaType.APPLICATION_JSON)
                    .post(null)
                    .close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return null;
    }

}
