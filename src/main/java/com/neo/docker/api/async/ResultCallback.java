package com.neo.docker.api.async;

import com.github.dockerjava.api.async.ResultCallbackTemplate;

import java.io.Closeable;

/**
 * Result callback
 * @author neo-w7
 */
public interface ResultCallback<A_RES_T> extends Closeable {

    class Adapter<A_RES_T> extends ResultCallbackTemplate<Adapter<A_RES_T>, A_RES_T> {
        @Override
        public void onNext(A_RES_T object) {

        }
    }

    /**
     * Called when the async processing starts respectively when the response arrives from the server. The passed {@link Closeable} can be
     * used to close/interrupt the processing.
     */
    void onStart(Closeable closeable);

    /** Called when an async result event occurs */
    void onNext(A_RES_T object);

    /** Called when an exception occurs while processing */
    void onError(Throwable throwable);

    /** Called when processing was finished either by reaching the end or by aborting it */
    void onComplete();
}
