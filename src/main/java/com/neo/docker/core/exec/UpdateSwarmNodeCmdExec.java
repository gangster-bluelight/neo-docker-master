package com.neo.docker.core.exec;


import com.github.dockerjava.api.command.UpdateSwarmNodeCmd;
import com.github.dockerjava.core.DockerClientConfig;
import com.github.dockerjava.core.MediaType;
import com.github.dockerjava.core.WebTarget;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Update swarmNode spec
 */
public class UpdateSwarmNodeCmdExec extends AbstrSyncDockerCmdExec<UpdateSwarmNodeCmd, Void>
        implements UpdateSwarmNodeCmd.Exec {

    private static final Logger LOGGER = LoggerFactory.getLogger(UpdateSwarmNodeCmdExec.class);

    public UpdateSwarmNodeCmdExec(WebTarget baseResource, DockerClientConfig dockerClientConfig) {
        super(baseResource, dockerClientConfig);
    }

    @Override
    protected Void execute(UpdateSwarmNodeCmd command) {
        WebTarget webResource = getBaseResource().path("/nodes/{id}/update")
                .resolveTemplate("id", command.getSwarmNodeId())
                .queryParam("version", command.getVersion());

        LOGGER.trace("POST: {}", webResource);
        try {
            webResource.request().accept(MediaType.APPLICATION_JSON).post(command.getSwarmNodeSpec()).close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
