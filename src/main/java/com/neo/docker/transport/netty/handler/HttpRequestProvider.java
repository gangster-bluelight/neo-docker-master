package com.neo.docker.transport.netty.handler;

import io.netty.handler.codec.http.HttpRequest;

public interface HttpRequestProvider {

    HttpRequest getHttpRequest(String uri);
}
