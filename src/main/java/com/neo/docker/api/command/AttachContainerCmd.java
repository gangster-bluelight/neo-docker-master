package com.neo.docker.api.command;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.command.AsyncDockerCmd;
import com.github.dockerjava.api.command.DockerCmdAsyncExec;
import com.github.dockerjava.api.model.Frame;

import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import java.io.InputStream;

/**
 * Attach to container
 *
 * @author neo-w7
 */
public interface AttachContainerCmd extends AsyncDockerCmd<AttachContainerCmd, Frame> {

    @CheckForNull
    String getContainerId();

    @CheckForNull
    Boolean hasLogsEnabled();

    @CheckForNull
    Boolean hasFollowStreamEnabled();

    @CheckForNull
    Boolean hasTimestampsEnabled();

    @CheckForNull
    Boolean hasStdoutEnabled();

    @CheckForNull
    Boolean hasStderrEnabled();

    @CheckForNull
    InputStream getStdin();

    AttachContainerCmd withContainerId(@Nonnull String containerId);

    /**
     * Following the stream means the resulting {@link InputStream} returned by {@link #exec()} reads infinitely. So a
     * {@link InputStream#read()} MAY BLOCK FOREVER as long as no data is streamed from the docker host to {@link DockerClient}!
     */
    AttachContainerCmd withFollowStream(Boolean followStream);

    AttachContainerCmd withTimestamps(Boolean timestamps);

    AttachContainerCmd withStdOut(Boolean stdout);

    AttachContainerCmd withStdErr(Boolean stderr);

    AttachContainerCmd withStdIn(InputStream stdin);

    AttachContainerCmd withLogs(Boolean logs);

    interface Exec extends DockerCmdAsyncExec<AttachContainerCmd, Frame> {
    }

}
