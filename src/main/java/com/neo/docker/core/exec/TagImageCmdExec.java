package com.neo.docker.core.exec;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.dockerjava.api.command.TagImageCmd;
import com.github.dockerjava.core.DockerClientConfig;
import com.github.dockerjava.core.WebTarget;

import java.io.IOException;

public class TagImageCmdExec extends AbstrSyncDockerCmdExec<TagImageCmd, Void> implements TagImageCmd.Exec {

    private static final Logger LOGGER = LoggerFactory.getLogger(TagImageCmdExec.class);

    public TagImageCmdExec(WebTarget baseResource, DockerClientConfig dockerClientConfig) {
        super(baseResource, dockerClientConfig);
    }

    @Override
    protected Void execute(TagImageCmd command) {
        WebTarget webTarget = getBaseResource().path("/images/" + command.getImageId() + "/tag")
                .queryParam("repo", command.getRepository()).queryParam("tag", command.getTag());

        webTarget = booleanQueryParam(webTarget, "force", command.hasForceEnabled());

        LOGGER.trace("POST: {}", webTarget);
        try {
            webTarget.request().post(null).close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

}
