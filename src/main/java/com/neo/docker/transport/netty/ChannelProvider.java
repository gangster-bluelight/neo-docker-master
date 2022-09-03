package com.neo.docker.transport.netty;

import io.netty.channel.socket.DuplexChannel;

public interface ChannelProvider {
    DuplexChannel getChannel();
}
