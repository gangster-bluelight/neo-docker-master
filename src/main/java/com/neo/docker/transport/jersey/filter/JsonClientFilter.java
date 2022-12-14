package com.neo.docker.transport.jersey.filter;

import java.io.IOException;

import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientResponseContext;
import javax.ws.rs.client.ClientResponseFilter;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Konstantin Pelykh (kpelykh@gmail.com)
 *
 */
@Deprecated
public class JsonClientFilter implements ClientResponseFilter {

    @Override
    public void filter(ClientRequestContext requestContext, ClientResponseContext responseContext) throws IOException {
        if (responseContext.getMediaType() != null
                && responseContext.getMediaType().isCompatible(MediaType.TEXT_PLAIN_TYPE)) {
            String newContentType = "application/json" + responseContext.getMediaType().toString().substring(10);
            responseContext.getHeaders().putSingle("Content-Type", newContentType);
        }
    }
}
