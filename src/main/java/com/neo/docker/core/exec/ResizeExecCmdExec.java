package com.neo.docker.core.exec;

import com.github.dockerjava.api.command.ResizeExecCmd;
import com.github.dockerjava.core.DockerClientConfig;
import com.github.dockerjava.core.MediaType;
import com.github.dockerjava.core.WebTarget;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;


public class ResizeExecCmdExec extends AbstrSyncDockerCmdExec<ResizeExecCmd, Void> implements ResizeExecCmd.Exec {

    private static final Logger LOGGER = LoggerFactory.getLogger(ResizeExecCmdExec.class);

    public ResizeExecCmdExec(WebTarget baseResource, DockerClientConfig dockerClientConfig) {
        super(baseResource, dockerClientConfig);
    }

    @Override
    protected Void execute(ResizeExecCmd command) {
        WebTarget webResource = getBaseResource().path("/exec/{id}/resize")
            .resolveTemplate("id", command.getExecId()).queryParam("h", command.getHeight()).queryParam("w", command.getWidth());

        LOGGER.trace("POST: {}", webResource);

        try {
            webResource.request().accept(MediaType.APPLICATION_JSON).post(null).close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return null;
    }

}
