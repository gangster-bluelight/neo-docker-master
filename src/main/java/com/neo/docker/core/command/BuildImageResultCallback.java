/*
 * Created on 21.07.2015
 */
package com.neo.docker.core.command;

import com.github.dockerjava.api.exception.DockerClientException;
import com.github.dockerjava.api.model.BuildResponseItem;
import com.github.dockerjava.core.async.ResultCallbackTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author Marcus Linke
 *
 * @deprecated use {@link com.github.dockerjava.api.command.BuildImageResultCallback}
 */
@Deprecated
public class BuildImageResultCallback extends ResultCallbackTemplate<BuildImageResultCallback, BuildResponseItem> {

    private static final Logger LOGGER = LoggerFactory.getLogger(BuildImageResultCallback.class);

    private String imageId;

    private String error;

    @Override
    public void onNext(BuildResponseItem item) {
        if (item.isBuildSuccessIndicated()) {
            this.imageId = item.getImageId();
        } else if (item.isErrorIndicated()) {
            this.error = item.getError();
        }
        LOGGER.debug(item.toString());
    }

    /**
     * Awaits the image id from the response stream.
     *
     * @throws DockerClientException
     *             if the build fails.
     */
    public String awaitImageId() {
        try {
            awaitCompletion();
        } catch (InterruptedException e) {
            throw new DockerClientException("", e);
        }

        return getImageId();
    }

    /**
     * Awaits the image id from the response stream.
     *
     * @throws DockerClientException
     *             if the build fails or the timeout occurs.
     */
    public String awaitImageId(long timeout, TimeUnit timeUnit) {
        try {
            awaitCompletion(timeout, timeUnit);
        } catch (InterruptedException e) {
            throw new DockerClientException("Awaiting image id interrupted: ", e);
        }

        return getImageId();
    }

    private String getImageId() {
        if (imageId != null) {
            return imageId;
        }

        if (error == null) {
            throw new DockerClientException("Could not build image");
        }

        throw new DockerClientException("Could not build image: " + error);
    }
}
