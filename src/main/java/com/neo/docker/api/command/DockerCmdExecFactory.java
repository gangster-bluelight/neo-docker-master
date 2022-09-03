package com.neo.docker.api.command;

import com.github.dockerjava.api.command.*;
import com.github.dockerjava.api.command.AttachContainerCmd;
import com.github.dockerjava.api.command.AuthCmd;
import com.github.dockerjava.api.command.BuildImageCmd;
import com.github.dockerjava.api.command.CommitCmd;
import com.github.dockerjava.api.command.ConnectToNetworkCmd;
import com.github.dockerjava.api.command.ContainerDiffCmd;
import com.github.dockerjava.api.command.CreateConfigCmd;
import com.github.dockerjava.api.command.CreateContainerCmd;
import com.github.dockerjava.api.command.CreateImageCmd;
import com.github.dockerjava.api.command.CreateNetworkCmd;
import com.github.dockerjava.api.command.CreateSecretCmd;
import com.github.dockerjava.api.command.CreateServiceCmd;
import com.github.dockerjava.api.command.CreateVolumeCmd;
import com.github.dockerjava.api.command.EventsCmd;
import com.github.dockerjava.api.command.ExecCreateCmd;
import com.github.dockerjava.api.command.ExecStartCmd;
import com.github.dockerjava.api.command.InfoCmd;
import com.github.dockerjava.api.command.InitializeSwarmCmd;
import com.github.dockerjava.api.command.InspectConfigCmd;
import com.github.dockerjava.api.command.InspectContainerCmd;
import com.github.dockerjava.api.command.InspectExecCmd;
import com.github.dockerjava.api.command.InspectImageCmd;
import com.github.dockerjava.api.command.InspectNetworkCmd;
import com.github.dockerjava.api.command.InspectServiceCmd;
import com.github.dockerjava.api.command.InspectSwarmCmd;
import com.github.dockerjava.api.command.InspectSwarmNodeCmd;
import com.github.dockerjava.api.command.InspectVolumeCmd;
import com.github.dockerjava.api.command.JoinSwarmCmd;
import com.github.dockerjava.api.command.KillContainerCmd;
import com.github.dockerjava.api.command.LeaveSwarmCmd;
import com.github.dockerjava.api.command.ListConfigsCmd;
import com.github.dockerjava.api.command.ListContainersCmd;
import com.github.dockerjava.api.command.ListImagesCmd;
import com.github.dockerjava.api.command.ListNetworksCmd;
import com.github.dockerjava.api.command.ListSecretsCmd;
import com.github.dockerjava.api.command.ListServicesCmd;
import com.github.dockerjava.api.command.ListSwarmNodesCmd;
import com.github.dockerjava.api.command.ListTasksCmd;
import com.github.dockerjava.api.command.ListVolumesCmd;
import com.github.dockerjava.api.command.LoadImageCmd;
import com.github.dockerjava.api.command.LogContainerCmd;
import com.github.dockerjava.api.command.LogSwarmObjectCmd;
import com.github.dockerjava.api.command.PauseContainerCmd;
import com.github.dockerjava.api.command.PingCmd;
import com.github.dockerjava.api.command.PruneCmd;
import com.github.dockerjava.api.command.PullImageCmd;
import com.github.dockerjava.api.command.PushImageCmd;
import com.github.dockerjava.api.command.RemoveConfigCmd;
import com.github.dockerjava.api.command.RemoveContainerCmd;
import com.github.dockerjava.api.command.RemoveImageCmd;
import com.github.dockerjava.api.command.RemoveNetworkCmd;
import com.github.dockerjava.api.command.RemoveSecretCmd;
import com.github.dockerjava.api.command.RemoveServiceCmd;
import com.github.dockerjava.api.command.RemoveSwarmNodeCmd;
import com.github.dockerjava.api.command.RemoveVolumeCmd;
import com.github.dockerjava.api.command.RenameContainerCmd;
import com.github.dockerjava.api.command.ResizeContainerCmd;
import com.github.dockerjava.api.command.ResizeExecCmd;
import com.github.dockerjava.api.command.RestartContainerCmd;
import com.github.dockerjava.api.command.SaveImageCmd;
import com.github.dockerjava.api.command.SaveImagesCmd;
import com.github.dockerjava.api.command.SearchImagesCmd;
import com.github.dockerjava.api.command.StartContainerCmd;
import com.github.dockerjava.api.command.StatsCmd;
import com.github.dockerjava.api.command.StopContainerCmd;
import com.github.dockerjava.api.command.TagImageCmd;
import com.github.dockerjava.api.command.TopContainerCmd;
import com.github.dockerjava.api.command.UnpauseContainerCmd;
import com.github.dockerjava.api.command.UpdateContainerCmd;
import com.github.dockerjava.api.command.UpdateServiceCmd;
import com.github.dockerjava.api.command.UpdateSwarmCmd;
import com.github.dockerjava.api.command.UpdateSwarmNodeCmd;
import com.github.dockerjava.api.command.VersionCmd;
import com.github.dockerjava.api.command.WaitContainerCmd;

import java.io.Closeable;
import java.io.IOException;

public interface DockerCmdExecFactory extends Closeable {

    AuthCmd.Exec createAuthCmdExec();

    InfoCmd.Exec createInfoCmdExec();

    PingCmd.Exec createPingCmdExec();

    ExecCreateCmd.Exec createExecCmdExec();

    VersionCmd.Exec createVersionCmdExec();

    PullImageCmd.Exec createPullImageCmdExec();

    PushImageCmd.Exec createPushImageCmdExec();

    SaveImageCmd.Exec createSaveImageCmdExec();

    SaveImagesCmd.Exec createSaveImagesCmdExec();

    CreateImageCmd.Exec createCreateImageCmdExec();

    LoadImageCmd.Exec createLoadImageCmdExec();

    SearchImagesCmd.Exec createSearchImagesCmdExec();

    RemoveImageCmd.Exec createRemoveImageCmdExec();

    ListImagesCmd.Exec createListImagesCmdExec();

    InspectImageCmd.Exec createInspectImageCmdExec();

    ListContainersCmd.Exec createListContainersCmdExec();

    CreateContainerCmd.Exec createCreateContainerCmdExec();

    StartContainerCmd.Exec createStartContainerCmdExec();

    InspectContainerCmd.Exec createInspectContainerCmdExec();

    RemoveContainerCmd.Exec createRemoveContainerCmdExec();

    WaitContainerCmd.Exec createWaitContainerCmdExec();

    AttachContainerCmd.Exec createAttachContainerCmdExec();

    ResizeContainerCmd.Exec createResizeContainerCmdExec();

    ExecStartCmd.Exec createExecStartCmdExec();

    ResizeExecCmd.Exec createResizeExecCmdExec();

    InspectExecCmd.Exec createInspectExecCmdExec();

    LogContainerCmd.Exec createLogContainerCmdExec();

    CopyFileFromContainerCmd.Exec createCopyFileFromContainerCmdExec();

    CopyArchiveFromContainerCmd.Exec createCopyArchiveFromContainerCmdExec();

    CopyArchiveToContainerCmd.Exec createCopyArchiveToContainerCmdExec();

    StopContainerCmd.Exec createStopContainerCmdExec();

    ContainerDiffCmd.Exec createContainerDiffCmdExec();

    KillContainerCmd.Exec createKillContainerCmdExec();

    UpdateContainerCmd.Exec createUpdateContainerCmdExec();

    /**
     * Rename container.
     *
     * @since {@link RemoteApiVersion#VERSION_1_17}
     */
    RenameContainerCmd.Exec createRenameContainerCmdExec();

    RestartContainerCmd.Exec createRestartContainerCmdExec();

    CommitCmd.Exec createCommitCmdExec();

    BuildImageCmd.Exec createBuildImageCmdExec();

    TopContainerCmd.Exec createTopContainerCmdExec();

    TagImageCmd.Exec createTagImageCmdExec();

    PauseContainerCmd.Exec createPauseContainerCmdExec();

    UnpauseContainerCmd.Exec createUnpauseContainerCmdExec();

    EventsCmd.Exec createEventsCmdExec();

    StatsCmd.Exec createStatsCmdExec();

    CreateVolumeCmd.Exec createCreateVolumeCmdExec();

    InspectVolumeCmd.Exec createInspectVolumeCmdExec();

    RemoveVolumeCmd.Exec createRemoveVolumeCmdExec();

    ListVolumesCmd.Exec createListVolumesCmdExec();

    ListNetworksCmd.Exec createListNetworksCmdExec();

    InspectNetworkCmd.Exec createInspectNetworkCmdExec();

    CreateNetworkCmd.Exec createCreateNetworkCmdExec();

    RemoveNetworkCmd.Exec createRemoveNetworkCmdExec();

    ConnectToNetworkCmd.Exec createConnectToNetworkCmdExec();

    DisconnectFromNetworkCmd.Exec createDisconnectFromNetworkCmdExec();

    // swarm
    InitializeSwarmCmd.Exec createInitializeSwarmCmdExec();

    InspectSwarmCmd.Exec createInspectSwarmCmdExec();

    JoinSwarmCmd.Exec createJoinSwarmCmdExec();

    LeaveSwarmCmd.Exec createLeaveSwarmCmdExec();

    UpdateSwarmCmd.Exec createUpdateSwarmCmdExec();

    /**
     * Command to list all services in a docker swarm. Only applicable if docker runs in swarm mode.
     *
     * @since {@link RemoteApiVersion#VERSION_1_24}
     */
    ListServicesCmd.Exec createListServicesCmdExec();

    /**
     * Command to create a new service in a docker swarm. Only applicable if docker runs in swarm mode.
     *
     * @since {@link RemoteApiVersion#VERSION_1_24}
     */
    CreateServiceCmd.Exec createCreateServiceCmdExec();

    /**
     * Command to inspect a service in a docker swarm. Only applicable if docker runs in swarm mode.
     *
     * @since {@link RemoteApiVersion#VERSION_1_24}
     */
    InspectServiceCmd.Exec createInspectServiceCmdExec();

    /**
     * Command to update a service specification in a docker swarm. Only applicable if docker runs in swarm mode.
     *
     * @since {@link RemoteApiVersion#VERSION_1_24}
     */
    UpdateServiceCmd.Exec createUpdateServiceCmdExec();

    /**
     * Command to remove a service in a docker swarm. Only applicable if docker runs in swarm mode.
     *
     * @since {@link RemoteApiVersion#VERSION_1_24}
     */
    RemoveServiceCmd.Exec createRemoveServiceCmdExec();

    /**
     * @param endpoint endpoint name to tail logs
     * @return
     * @since {@link RemoteApiVersion#VERSION_1_29}
     */
    LogSwarmObjectCmd.Exec logSwarmObjectExec(String endpoint);

    // nodes

    /**
     * List all nodes. Node operations require the engine to be part of a swarm
     *
     * @since {@link RemoteApiVersion#VERSION_1_24}
     */
    ListSwarmNodesCmd.Exec listSwarmNodeCmdExec();

    /**
     * Return low-level information on the node. Node operations require the engine to be part of a swarm
     *
     * @since {@link RemoteApiVersion#VERSION_1_24}
     */
    InspectSwarmNodeCmd.Exec inspectSwarmNodeCmdExec();

    /**
     * Remove a node from the swarm. Node operations require the engine to be part of a swarm
     *
     * @since {@link RemoteApiVersion#VERSION_1_24}
     */
    RemoveSwarmNodeCmd.Exec removeSwarmNodeCmdExec();

    /**
     * Update a node. Node operations require the engine to be part of a swarm
     *
     * @since {@link RemoteApiVersion#VERSION_1_24}
     */
    UpdateSwarmNodeCmd.Exec updateSwarmNodeCmdExec();

    /**
     * Update a node. Node operations require the engine to be part of a swarm
     *
     * @since {@link RemoteApiVersion#VERSION_1_24}
     */
    ListTasksCmd.Exec listTasksCmdExec();

    /**
     * Delete unused content (containers, images, volumes, networks, build relicts)
     *
     * @since {@link RemoteApiVersion#VERSION_1_25}
     */
    PruneCmd.Exec pruneCmdExec();

    /**
     * Command to list all secrets.
     *
     * @since {@link RemoteApiVersion#VERSION_1_25}
     */
    ListSecretsCmd.Exec createListSecretsCmdExec();

    /**
     * Command to create a new secret in a docker swarm. Only applicable if docker runs in swarm mode.
     *
     * @since {@link RemoteApiVersion#VERSION_1_25}
     */
    CreateSecretCmd.Exec createCreateSecretCmdExec();

    /**
     * Command to remove a secret in a docker swarm. Only applicable if docker runs in swarm mode.
     *
     * @since {@link RemoteApiVersion#VERSION_1_25}
     */
    RemoveSecretCmd.Exec createRemoveSecretCmdExec();

    /**
     * Command to list all configs.
     *
     * @since {@link RemoteApiVersion#VERSION_1_30}
     */
    ListConfigsCmd.Exec createListConfigsCmdExec();

    /**
     * Command to inspect a config in a docker swarm. Only applicable if docker runs in swarm mode.
     *
     * @since {@link RemoteApiVersion#VERSION_1_30}
     */
    InspectConfigCmd.Exec createInspectConfigCmdExec();

    /**
     * Command to create a new config in a docker swarm. Only applicable if docker runs in swarm mode.
     *
     * @since {@link RemoteApiVersion#VERSION_1_30}
     */
    CreateConfigCmd.Exec createCreateConfigCmdExec();

    /**
     * Command to remove a config in a docker swarm. Only applicable if docker runs in swarm mode.
     *
     * @since {@link RemoteApiVersion#VERSION_1_30}
     */
    RemoveConfigCmd.Exec createRemoveConfigCmdExec();


    @Override
    void close() throws IOException;

}
