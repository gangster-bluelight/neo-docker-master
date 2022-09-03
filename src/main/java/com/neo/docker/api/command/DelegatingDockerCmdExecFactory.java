package com.neo.docker.api.command;

import com.github.dockerjava.api.command.AttachContainerCmd;
import com.github.dockerjava.api.command.AuthCmd;
import com.github.dockerjava.api.command.BuildImageCmd;
import com.github.dockerjava.api.command.CommitCmd;
import com.github.dockerjava.api.command.ConnectToNetworkCmd;
import com.github.dockerjava.api.command.ContainerDiffCmd;
import com.github.dockerjava.api.command.CopyArchiveFromContainerCmd;
import com.github.dockerjava.api.command.CopyArchiveToContainerCmd;
import com.github.dockerjava.api.command.CopyFileFromContainerCmd;
import com.github.dockerjava.api.command.CreateConfigCmd;
import com.github.dockerjava.api.command.CreateContainerCmd;
import com.github.dockerjava.api.command.CreateImageCmd;
import com.github.dockerjava.api.command.CreateNetworkCmd;
import com.github.dockerjava.api.command.CreateSecretCmd;
import com.github.dockerjava.api.command.CreateServiceCmd;
import com.github.dockerjava.api.command.CreateVolumeCmd;
import com.github.dockerjava.api.command.DisconnectFromNetworkCmd;
import com.github.dockerjava.api.command.DockerCmdExecFactory;
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

import java.io.IOException;

public class DelegatingDockerCmdExecFactory implements com.github.dockerjava.api.command.DockerCmdExecFactory {

    // We're not using abstract class because we want
    // the compiler to force us to implement new DockerCmdExecFactory when added
    public DockerCmdExecFactory getDockerCmdExecFactory() {
        throw new IllegalStateException("Implement me!");
    }

    @Override
    public AuthCmd.Exec createAuthCmdExec() {
        return getDockerCmdExecFactory().createAuthCmdExec();
    }

    @Override
    public InfoCmd.Exec createInfoCmdExec() {
        return getDockerCmdExecFactory().createInfoCmdExec();
    }

    @Override
    public PingCmd.Exec createPingCmdExec() {
        return getDockerCmdExecFactory().createPingCmdExec();
    }

    @Override
    public ResizeContainerCmd.Exec createResizeContainerCmdExec() {
        return getDockerCmdExecFactory().createResizeContainerCmdExec();
    }

    @Override
    public ExecCreateCmd.Exec createExecCmdExec() {
        return getDockerCmdExecFactory().createExecCmdExec();
    }

    @Override
    public ResizeExecCmd.Exec createResizeExecCmdExec() {
        return getDockerCmdExecFactory().createResizeExecCmdExec();
    }

    @Override
    public VersionCmd.Exec createVersionCmdExec() {
        return getDockerCmdExecFactory().createVersionCmdExec();
    }

    @Override
    public PullImageCmd.Exec createPullImageCmdExec() {
        return getDockerCmdExecFactory().createPullImageCmdExec();
    }

    @Override
    public PushImageCmd.Exec createPushImageCmdExec() {
        return getDockerCmdExecFactory().createPushImageCmdExec();
    }

    @Override
    public SaveImageCmd.Exec createSaveImageCmdExec() {
        return getDockerCmdExecFactory().createSaveImageCmdExec();
    }

    @Override
    public SaveImagesCmd.Exec createSaveImagesCmdExec() {
        return getDockerCmdExecFactory().createSaveImagesCmdExec();
    }

    @Override
    public CreateImageCmd.Exec createCreateImageCmdExec() {
        return getDockerCmdExecFactory().createCreateImageCmdExec();
    }

    @Override
    public LoadImageCmd.Exec createLoadImageCmdExec() {
        return getDockerCmdExecFactory().createLoadImageCmdExec();
    }

    @Override
    public SearchImagesCmd.Exec createSearchImagesCmdExec() {
        return getDockerCmdExecFactory().createSearchImagesCmdExec();
    }

    @Override
    public RemoveImageCmd.Exec createRemoveImageCmdExec() {
        return getDockerCmdExecFactory().createRemoveImageCmdExec();
    }

    @Override
    public ListImagesCmd.Exec createListImagesCmdExec() {
        return getDockerCmdExecFactory().createListImagesCmdExec();
    }

    @Override
    public InspectImageCmd.Exec createInspectImageCmdExec() {
        return getDockerCmdExecFactory().createInspectImageCmdExec();
    }

    @Override
    public ListContainersCmd.Exec createListContainersCmdExec() {
        return getDockerCmdExecFactory().createListContainersCmdExec();
    }

    @Override
    public CreateContainerCmd.Exec createCreateContainerCmdExec() {
        return getDockerCmdExecFactory().createCreateContainerCmdExec();
    }

    @Override
    public StartContainerCmd.Exec createStartContainerCmdExec() {
        return getDockerCmdExecFactory().createStartContainerCmdExec();
    }

    @Override
    public InspectContainerCmd.Exec createInspectContainerCmdExec() {
        return getDockerCmdExecFactory().createInspectContainerCmdExec();
    }

    @Override
    public RemoveContainerCmd.Exec createRemoveContainerCmdExec() {
        return getDockerCmdExecFactory().createRemoveContainerCmdExec();
    }

    @Override
    public WaitContainerCmd.Exec createWaitContainerCmdExec() {
        return getDockerCmdExecFactory().createWaitContainerCmdExec();
    }

    @Override
    public AttachContainerCmd.Exec createAttachContainerCmdExec() {
        return getDockerCmdExecFactory().createAttachContainerCmdExec();
    }

    @Override
    public ExecStartCmd.Exec createExecStartCmdExec() {
        return getDockerCmdExecFactory().createExecStartCmdExec();
    }

    @Override
    public InspectExecCmd.Exec createInspectExecCmdExec() {
        return getDockerCmdExecFactory().createInspectExecCmdExec();
    }

    @Override
    public LogContainerCmd.Exec createLogContainerCmdExec() {
        return getDockerCmdExecFactory().createLogContainerCmdExec();
    }

    @Override
    public CopyFileFromContainerCmd.Exec createCopyFileFromContainerCmdExec() {
        return getDockerCmdExecFactory().createCopyFileFromContainerCmdExec();
    }

    @Override
    public CopyArchiveFromContainerCmd.Exec createCopyArchiveFromContainerCmdExec() {
        return getDockerCmdExecFactory().createCopyArchiveFromContainerCmdExec();
    }

    @Override
    public CopyArchiveToContainerCmd.Exec createCopyArchiveToContainerCmdExec() {
        return getDockerCmdExecFactory().createCopyArchiveToContainerCmdExec();
    }

    @Override
    public StopContainerCmd.Exec createStopContainerCmdExec() {
        return getDockerCmdExecFactory().createStopContainerCmdExec();
    }

    @Override
    public ContainerDiffCmd.Exec createContainerDiffCmdExec() {
        return getDockerCmdExecFactory().createContainerDiffCmdExec();
    }

    @Override
    public KillContainerCmd.Exec createKillContainerCmdExec() {
        return getDockerCmdExecFactory().createKillContainerCmdExec();
    }

    @Override
    public UpdateContainerCmd.Exec createUpdateContainerCmdExec() {
        return getDockerCmdExecFactory().createUpdateContainerCmdExec();
    }

    @Override
    public RenameContainerCmd.Exec createRenameContainerCmdExec() {
        return getDockerCmdExecFactory().createRenameContainerCmdExec();
    }

    @Override
    public RestartContainerCmd.Exec createRestartContainerCmdExec() {
        return getDockerCmdExecFactory().createRestartContainerCmdExec();
    }

    @Override
    public CommitCmd.Exec createCommitCmdExec() {
        return getDockerCmdExecFactory().createCommitCmdExec();
    }

    @Override
    public BuildImageCmd.Exec createBuildImageCmdExec() {
        return getDockerCmdExecFactory().createBuildImageCmdExec();
    }

    @Override
    public TopContainerCmd.Exec createTopContainerCmdExec() {
        return getDockerCmdExecFactory().createTopContainerCmdExec();
    }

    @Override
    public TagImageCmd.Exec createTagImageCmdExec() {
        return getDockerCmdExecFactory().createTagImageCmdExec();
    }

    @Override
    public PauseContainerCmd.Exec createPauseContainerCmdExec() {
        return getDockerCmdExecFactory().createPauseContainerCmdExec();
    }

    @Override
    public UnpauseContainerCmd.Exec createUnpauseContainerCmdExec() {
        return getDockerCmdExecFactory().createUnpauseContainerCmdExec();
    }

    @Override
    public EventsCmd.Exec createEventsCmdExec() {
        return getDockerCmdExecFactory().createEventsCmdExec();
    }

    @Override
    public StatsCmd.Exec createStatsCmdExec() {
        return getDockerCmdExecFactory().createStatsCmdExec();
    }

    @Override
    public CreateVolumeCmd.Exec createCreateVolumeCmdExec() {
        return getDockerCmdExecFactory().createCreateVolumeCmdExec();
    }

    @Override
    public InspectVolumeCmd.Exec createInspectVolumeCmdExec() {
        return getDockerCmdExecFactory().createInspectVolumeCmdExec();
    }

    @Override
    public RemoveVolumeCmd.Exec createRemoveVolumeCmdExec() {
        return getDockerCmdExecFactory().createRemoveVolumeCmdExec();
    }

    @Override
    public ListVolumesCmd.Exec createListVolumesCmdExec() {
        return getDockerCmdExecFactory().createListVolumesCmdExec();
    }

    @Override
    public ListNetworksCmd.Exec createListNetworksCmdExec() {
        return getDockerCmdExecFactory().createListNetworksCmdExec();
    }

    @Override
    public InspectNetworkCmd.Exec createInspectNetworkCmdExec() {
        return getDockerCmdExecFactory().createInspectNetworkCmdExec();
    }

    @Override
    public CreateNetworkCmd.Exec createCreateNetworkCmdExec() {
        return getDockerCmdExecFactory().createCreateNetworkCmdExec();
    }

    @Override
    public RemoveNetworkCmd.Exec createRemoveNetworkCmdExec() {
        return getDockerCmdExecFactory().createRemoveNetworkCmdExec();
    }

    @Override
    public ConnectToNetworkCmd.Exec createConnectToNetworkCmdExec() {
        return getDockerCmdExecFactory().createConnectToNetworkCmdExec();
    }

    @Override
    public DisconnectFromNetworkCmd.Exec createDisconnectFromNetworkCmdExec() {
        return getDockerCmdExecFactory().createDisconnectFromNetworkCmdExec();
    }

    @Override
    public InitializeSwarmCmd.Exec createInitializeSwarmCmdExec() {
        return getDockerCmdExecFactory().createInitializeSwarmCmdExec();
    }

    @Override
    public InspectSwarmCmd.Exec createInspectSwarmCmdExec() {
        return getDockerCmdExecFactory().createInspectSwarmCmdExec();
    }

    @Override
    public JoinSwarmCmd.Exec createJoinSwarmCmdExec() {
        return getDockerCmdExecFactory().createJoinSwarmCmdExec();
    }

    @Override
    public LeaveSwarmCmd.Exec createLeaveSwarmCmdExec() {
        return getDockerCmdExecFactory().createLeaveSwarmCmdExec();
    }

    @Override
    public UpdateSwarmCmd.Exec createUpdateSwarmCmdExec() {
        return getDockerCmdExecFactory().createUpdateSwarmCmdExec();
    }

    @Override
    public ListServicesCmd.Exec createListServicesCmdExec() {
        return getDockerCmdExecFactory().createListServicesCmdExec();
    }

    @Override
    public CreateServiceCmd.Exec createCreateServiceCmdExec() {
        return getDockerCmdExecFactory().createCreateServiceCmdExec();
    }

    @Override
    public InspectServiceCmd.Exec createInspectServiceCmdExec() {
        return getDockerCmdExecFactory().createInspectServiceCmdExec();
    }

    @Override
    public UpdateServiceCmd.Exec createUpdateServiceCmdExec() {
        return getDockerCmdExecFactory().createUpdateServiceCmdExec();
    }

    @Override
    public RemoveServiceCmd.Exec createRemoveServiceCmdExec() {
        return getDockerCmdExecFactory().createRemoveServiceCmdExec();
    }

    @Override
    public LogSwarmObjectCmd.Exec logSwarmObjectExec(String endpoint) {
        return getDockerCmdExecFactory().logSwarmObjectExec(endpoint);
    }

    @Override
    public ListSwarmNodesCmd.Exec listSwarmNodeCmdExec() {
        return getDockerCmdExecFactory().listSwarmNodeCmdExec();
    }

    @Override
    public InspectSwarmNodeCmd.Exec inspectSwarmNodeCmdExec() {
        return getDockerCmdExecFactory().inspectSwarmNodeCmdExec();
    }

    @Override
    public RemoveSwarmNodeCmd.Exec removeSwarmNodeCmdExec() {
        return getDockerCmdExecFactory().removeSwarmNodeCmdExec();
    }

    @Override
    public UpdateSwarmNodeCmd.Exec updateSwarmNodeCmdExec() {
        return getDockerCmdExecFactory().updateSwarmNodeCmdExec();
    }

    @Override
    public ListTasksCmd.Exec listTasksCmdExec() {
        return getDockerCmdExecFactory().listTasksCmdExec();
    }

    @Override
    public PruneCmd.Exec pruneCmdExec() {
        return getDockerCmdExecFactory().pruneCmdExec();
    }

    @Override
    public ListSecretsCmd.Exec createListSecretsCmdExec() {
        return getDockerCmdExecFactory().createListSecretsCmdExec();
    }

    @Override
    public CreateSecretCmd.Exec createCreateSecretCmdExec() {
        return getDockerCmdExecFactory().createCreateSecretCmdExec();
    }

    @Override
    public RemoveSecretCmd.Exec createRemoveSecretCmdExec() {
        return getDockerCmdExecFactory().createRemoveSecretCmdExec();
    }

    @Override
    public ListConfigsCmd.Exec createListConfigsCmdExec() {
        return getDockerCmdExecFactory().createListConfigsCmdExec();
    }

    @Override
    public CreateConfigCmd.Exec createCreateConfigCmdExec() {
        return getDockerCmdExecFactory().createCreateConfigCmdExec();
    }

    @Override
    public InspectConfigCmd.Exec createInspectConfigCmdExec() {
        return getDockerCmdExecFactory().createInspectConfigCmdExec();
    }

    @Override
    public RemoveConfigCmd.Exec createRemoveConfigCmdExec() {
        return getDockerCmdExecFactory().createRemoveConfigCmdExec();
    }

    @Override
    public void close() throws IOException {
        getDockerCmdExecFactory().close();
    }
}
