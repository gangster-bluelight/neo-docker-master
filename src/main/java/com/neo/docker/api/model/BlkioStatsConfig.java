package com.neo.docker.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.dockerjava.api.model.BlkioStatEntry;
import com.github.dockerjava.api.model.DockerObject;
import com.github.dockerjava.api.model.Statistics;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.annotation.CheckForNull;
import java.io.Serializable;
import java.util.List;

/**
 * Used in {@link Statistics}
 *
 * @author Yuting Liu
 */
@EqualsAndHashCode
@ToString
public class BlkioStatsConfig extends DockerObject implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("io_service_bytes_recursive")
    private List<com.github.dockerjava.api.model.BlkioStatEntry> ioServiceBytesRecursive;

    @JsonProperty("io_serviced_recursive")
    private List<com.github.dockerjava.api.model.BlkioStatEntry> ioServicedRecursive;

    @JsonProperty("io_queue_recursive")
    private List<com.github.dockerjava.api.model.BlkioStatEntry> ioQueueRecursive;

    @JsonProperty("io_service_time_recursive")
    private List<com.github.dockerjava.api.model.BlkioStatEntry> ioServiceTimeRecursive;

    @JsonProperty("io_wait_time_recursive")
    private List<com.github.dockerjava.api.model.BlkioStatEntry> ioWaitTimeRecursive;

    @JsonProperty("io_merged_recursive")
    private List<com.github.dockerjava.api.model.BlkioStatEntry> ioMergedRecursive;

    @JsonProperty("io_time_recursive")
    private List<com.github.dockerjava.api.model.BlkioStatEntry> ioTimeRecursive;

    @JsonProperty("sectors_recursive")
    private List<com.github.dockerjava.api.model.BlkioStatEntry> sectorsRecursive;

    /**
     * @see #ioServiceBytesRecursive
     */
    @CheckForNull
    public List<com.github.dockerjava.api.model.BlkioStatEntry> getIoServiceBytesRecursive() {
        return ioServiceBytesRecursive;
    }

    /**
     * @see #ioServicedRecursive
     */
    @CheckForNull
    public List<com.github.dockerjava.api.model.BlkioStatEntry> getIoServicedRecursive() {
        return ioServicedRecursive;
    }

    /**
     * @see #ioQueueRecursive
     */
    @CheckForNull
    public List<com.github.dockerjava.api.model.BlkioStatEntry> getIoQueueRecursive() {
        return ioQueueRecursive;
    }

    /**
     * @see #ioServiceTimeRecursive
     */
    @CheckForNull
    public List<com.github.dockerjava.api.model.BlkioStatEntry> getIoServiceTimeRecursive() {
        return ioServiceTimeRecursive;
    }

    /**
     * @see #ioWaitTimeRecursive
     */
    @CheckForNull
    public List<com.github.dockerjava.api.model.BlkioStatEntry> getIoWaitTimeRecursive() {
        return ioWaitTimeRecursive;
    }

    /**
     * @see #ioMergedRecursive
     */
    @CheckForNull
    public List<com.github.dockerjava.api.model.BlkioStatEntry> getIoMergedRecursive() {
        return ioMergedRecursive;
    }

    /**
     * @see #ioTimeRecursive
     */
    @CheckForNull
    public List<com.github.dockerjava.api.model.BlkioStatEntry> getIoTimeRecursive() {
        return ioTimeRecursive;
    }

    /**
     * @see #sectorsRecursive
     */
    @CheckForNull
    public List<BlkioStatEntry> getSectorsRecursive() {
        return sectorsRecursive;
    }
}
