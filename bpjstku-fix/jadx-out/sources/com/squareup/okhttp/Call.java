package com.squareup.okhttp;

import androidx.core.app.NotificationCompat;
import com.android.volley.toolbox.HttpHeaderParser;
import com.squareup.okhttp.internal.Internal;
import com.squareup.okhttp.internal.NamedRunnable;
import com.squareup.okhttp.internal.http.HttpEngine;
import com.squareup.okhttp.internal.http.RequestException;
import com.squareup.okhttp.internal.http.RouteException;
import com.squareup.okhttp.internal.http.StreamAllocation;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes6.dex */
public class Call {
    volatile boolean canceled;
    private final OkHttpClient client;
    HttpEngine engine;
    private boolean executed;
    Request originalRequest;

    protected Call(OkHttpClient okHttpClient, Request request) {
        this.client = okHttpClient.copyWithDefaults();
        this.originalRequest = request;
    }

    public Response execute() throws IOException {
        synchronized (this) {
            if (this.executed) {
                throw new IllegalStateException("Already Executed");
            }
            this.executed = true;
        }
        try {
            this.client.getDispatcher().executed(this);
            Response responseWithInterceptorChain = getResponseWithInterceptorChain(false);
            if (responseWithInterceptorChain == null) {
                throw new IOException("Canceled");
            }
            this.client.getDispatcher().finished(this);
            return responseWithInterceptorChain;
        } catch (Throwable th) {
            this.client.getDispatcher().finished(this);
            throw th;
        }
    }

    Object tag() {
        return this.originalRequest.tag();
    }

    public void enqueue(Callback callback) {
        enqueue(callback, false);
    }

    void enqueue(Callback callback, boolean z) {
        synchronized (this) {
            if (this.executed) {
                throw new IllegalStateException("Already Executed");
            }
            this.executed = true;
        }
        this.client.getDispatcher().enqueue(new AsyncCall(callback, z));
    }

    public void cancel() {
        this.canceled = true;
        HttpEngine httpEngine = this.engine;
        if (httpEngine != null) {
            httpEngine.cancel();
        }
    }

    public boolean isExecuted() {
        boolean z;
        synchronized (this) {
            z = this.executed;
        }
        return z;
    }

    public boolean isCanceled() {
        return this.canceled;
    }

    final class AsyncCall extends NamedRunnable {
        private final boolean forWebSocket;
        private final Callback responseCallback;

        private AsyncCall(Callback callback, boolean z) {
            super("OkHttp %s", Call.this.originalRequest.urlString());
            this.responseCallback = callback;
            this.forWebSocket = z;
        }

        final String host() {
            return Call.this.originalRequest.httpUrl().host();
        }

        final Request request() {
            return Call.this.originalRequest;
        }

        final Object tag() {
            return Call.this.originalRequest.tag();
        }

        final void cancel() {
            Call.this.cancel();
        }

        final Call get() {
            return Call.this;
        }

        @Override // com.squareup.okhttp.internal.NamedRunnable
        public final void execute() {
            boolean z;
            try {
                try {
                    Response responseWithInterceptorChain = Call.this.getResponseWithInterceptorChain(this.forWebSocket);
                    try {
                        if (Call.this.canceled) {
                            this.responseCallback.onFailure(Call.this.originalRequest, new IOException("Canceled"));
                        } else {
                            this.responseCallback.onResponse(responseWithInterceptorChain);
                        }
                    } catch (IOException e2) {
                        e = e2;
                        z = true;
                        if (z) {
                            Logger logger = Internal.logger;
                            Level level = Level.INFO;
                            StringBuilder sb = new StringBuilder("Callback failure for ");
                            sb.append(Call.this.toLoggableString());
                            logger.log(level, sb.toString(), (Throwable) e);
                        } else {
                            this.responseCallback.onFailure(Call.this.engine == null ? Call.this.originalRequest : Call.this.engine.getRequest(), e);
                        }
                    }
                } catch (IOException e3) {
                    e = e3;
                    z = false;
                }
            } finally {
                Call.this.client.getDispatcher().finished(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String toLoggableString() {
        String str = this.canceled ? "canceled call" : NotificationCompat.CATEGORY_CALL;
        HttpUrl httpUrlResolve = this.originalRequest.httpUrl().resolve("/...");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" to ");
        sb.append(httpUrlResolve);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Response getResponseWithInterceptorChain(boolean z) throws IOException {
        return new ApplicationInterceptorChain(0, this.originalRequest, z).proceed(this.originalRequest);
    }

    class ApplicationInterceptorChain implements Interceptor.Chain {
        private final boolean forWebSocket;
        private final int index;
        private final Request request;

        @Override // com.squareup.okhttp.Interceptor.Chain
        public Connection connection() {
            return null;
        }

        ApplicationInterceptorChain(int i, Request request, boolean z) {
            this.index = i;
            this.request = request;
            this.forWebSocket = z;
        }

        @Override // com.squareup.okhttp.Interceptor.Chain
        public Request request() {
            return this.request;
        }

        @Override // com.squareup.okhttp.Interceptor.Chain
        public Response proceed(Request request) throws IOException {
            if (this.index < Call.this.client.interceptors().size()) {
                ApplicationInterceptorChain applicationInterceptorChain = Call.this.new ApplicationInterceptorChain(this.index + 1, request, this.forWebSocket);
                Interceptor interceptor = Call.this.client.interceptors().get(this.index);
                Response responseIntercept = interceptor.intercept(applicationInterceptorChain);
                if (responseIntercept != null) {
                    return responseIntercept;
                }
                StringBuilder sb = new StringBuilder("application interceptor ");
                sb.append(interceptor);
                sb.append(" returned null");
                throw new NullPointerException(sb.toString());
            }
            return Call.this.getResponse(request, this.forWebSocket);
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00e4  */
    Response getResponse(Request request, boolean z) throws Throwable {
        StreamAllocation streamAllocation;
        RequestBody requestBodyBody = request.body();
        if (requestBodyBody != null) {
            Request.Builder builderNewBuilder = request.newBuilder();
            MediaType mediaTypeContentType = requestBodyBody.contentType();
            if (mediaTypeContentType != null) {
                builderNewBuilder.header(HttpHeaderParser.HEADER_CONTENT_TYPE, mediaTypeContentType.toString());
            }
            long jContentLength = requestBodyBody.contentLength();
            if (jContentLength != -1) {
                builderNewBuilder.header("Content-Length", Long.toString(jContentLength));
                builderNewBuilder.removeHeader("Transfer-Encoding");
            } else {
                builderNewBuilder.header("Transfer-Encoding", "chunked");
                builderNewBuilder.removeHeader("Content-Length");
            }
            request = builderNewBuilder.build();
        }
        this.engine = new HttpEngine(this.client, request, false, false, z, null, null, null);
        boolean z2 = false;
        int i = 0;
        while (!this.canceled) {
            try {
                try {
                    try {
                        this.engine.sendRequest();
                        this.engine.readResponse();
                        Response response = this.engine.getResponse();
                        Request requestFollowUpRequest = this.engine.followUpRequest();
                        if (requestFollowUpRequest == null) {
                            if (!z) {
                                this.engine.releaseStreamAllocation();
                            }
                            return response;
                        }
                        StreamAllocation streamAllocationClose = this.engine.close();
                        i++;
                        if (i > 20) {
                            streamAllocationClose.release();
                            throw new ProtocolException("Too many follow-up requests: ".concat(String.valueOf(i)));
                        }
                        if (this.engine.sameConnection(requestFollowUpRequest.httpUrl())) {
                            streamAllocation = streamAllocationClose;
                        } else {
                            streamAllocationClose.release();
                            streamAllocation = null;
                        }
                        this.engine = new HttpEngine(this.client, requestFollowUpRequest, false, false, z, streamAllocation, null, response);
                    } catch (Throwable th) {
                        th = th;
                        z2 = true;
                        if (z2) {
                            this.engine.close().release();
                        }
                        throw th;
                    }
                } catch (RouteException e2) {
                    HttpEngine httpEngineRecover = this.engine.recover(e2);
                    if (httpEngineRecover != null) {
                        this.engine = httpEngineRecover;
                    } else {
                        throw e2.getLastConnectException();
                    }
                }
            } catch (RequestException e3) {
                throw e3.getCause();
            } catch (IOException e4) {
                HttpEngine httpEngineRecover2 = this.engine.recover(e4, null);
                if (httpEngineRecover2 != null) {
                    try {
                        this.engine = httpEngineRecover2;
                    } catch (Throwable th2) {
                        th = th2;
                        if (z2) {
                            this.engine.close().release();
                        }
                        throw th;
                    }
                } else {
                    throw e4;
                }
            }
        }
        this.engine.releaseStreamAllocation();
        throw new IOException("Canceled");
    }
}
