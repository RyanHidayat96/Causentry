package com.squareup.okhttp.internal.http;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.collection.SieveCacheKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.android.gms.measurement.internal.zznf;
import com.squareup.okhttp.Address;
import com.squareup.okhttp.CertificatePinner;
import com.squareup.okhttp.Connection;
import com.squareup.okhttp.Headers;
import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import com.squareup.okhttp.Route;
import com.squareup.okhttp.internal.Internal;
import com.squareup.okhttp.internal.InternalCache;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.Version;
import com.squareup.okhttp.internal.io.RealConnection;
import defpackage.RotationProvider1;
import defpackage.RotationProviderListener;
import defpackage.RotationProviderListenerWrapper;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.SurfaceViewImplementation;
import defpackage.SurfaceViewImplementationApi24Impl;
import defpackage.cancelPreviousRequest;
import defpackage.getVisibilityRampUpAnimationDurationMillis;
import defpackage.initSession;
import defpackage.setOrVerifyExpectFrameRateRange;
import defpackage.tryToComplete;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.CookieHandler;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes7.dex */
public final class HttpEngine {
    private static final ResponseBody EMPTY_BODY = new ResponseBody() { // from class: com.squareup.okhttp.internal.http.HttpEngine.1
        @Override // com.squareup.okhttp.ResponseBody
        public final long contentLength() {
            return 0L;
        }

        @Override // com.squareup.okhttp.ResponseBody
        public final MediaType contentType() {
            return null;
        }

        @Override // com.squareup.okhttp.ResponseBody
        public final RotationProvider1 source() {
            return new RotationProviderListenerWrapper();
        }
    };
    public static final int MAX_FOLLOW_UPS = 20;
    public final boolean bufferRequestBody;
    private RotationProviderListener bufferedRequestBody;
    private Response cacheResponse;
    private CacheStrategy cacheStrategy;
    private final boolean callerWritesRequestBody;
    final OkHttpClient client;
    private final boolean forWebSocket;
    private HttpStream httpStream;
    private Request networkRequest;
    private final Response priorResponse;
    private SurfaceViewImplementationApi24Impl requestBodyOut;
    long sentRequestMillis = -1;
    private CacheRequest storeRequest;
    public final StreamAllocation streamAllocation;
    private boolean transparentGzip;
    private final Request userRequest;
    private Response userResponse;

    public HttpEngine(OkHttpClient okHttpClient, Request request, boolean z, boolean z2, boolean z3, StreamAllocation streamAllocation, RetryableSink retryableSink, Response response) {
        this.client = okHttpClient;
        this.userRequest = request;
        this.bufferRequestBody = z;
        this.callerWritesRequestBody = z2;
        this.forWebSocket = z3;
        this.streamAllocation = streamAllocation == null ? new StreamAllocation(okHttpClient.getConnectionPool(), createAddress(okHttpClient, request)) : streamAllocation;
        this.requestBodyOut = retryableSink;
        this.priorResponse = response;
    }

    public final void sendRequest() throws RouteException, IOException, RequestException {
        if (this.cacheStrategy == null) {
            if (this.httpStream != null) {
                throw new IllegalStateException();
            }
            Request requestNetworkRequest = networkRequest(this.userRequest);
            InternalCache internalCache = Internal.instance.internalCache(this.client);
            Response response = internalCache != null ? internalCache.get(requestNetworkRequest) : null;
            CacheStrategy cacheStrategy = new CacheStrategy.Factory(System.currentTimeMillis(), requestNetworkRequest, response).get();
            this.cacheStrategy = cacheStrategy;
            this.networkRequest = cacheStrategy.networkRequest;
            this.cacheResponse = this.cacheStrategy.cacheResponse;
            if (internalCache != null) {
                internalCache.trackResponse(this.cacheStrategy);
            }
            if (response != null && this.cacheResponse == null) {
                Util.closeQuietly(response.body());
            }
            if (this.networkRequest != null) {
                HttpStream httpStreamConnect = connect();
                this.httpStream = httpStreamConnect;
                httpStreamConnect.setHttpEngine(this);
                if (this.callerWritesRequestBody && permitsRequestBody(this.networkRequest) && this.requestBodyOut == null) {
                    long jContentLength = OkHeaders.contentLength(requestNetworkRequest);
                    if (!this.bufferRequestBody) {
                        this.httpStream.writeRequestHeaders(this.networkRequest);
                        this.requestBodyOut = this.httpStream.createRequestBody(this.networkRequest, jContentLength);
                        return;
                    } else {
                        if (jContentLength > SieveCacheKt.NodeLinkMask) {
                            throw new IllegalStateException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2 GiB.");
                        }
                        if (jContentLength != -1) {
                            this.httpStream.writeRequestHeaders(this.networkRequest);
                            this.requestBodyOut = new RetryableSink((int) jContentLength);
                            return;
                        } else {
                            this.requestBodyOut = new RetryableSink();
                            return;
                        }
                    }
                }
                return;
            }
            Response response2 = this.cacheResponse;
            if (response2 != null) {
                this.userResponse = response2.newBuilder().request(this.userRequest).priorResponse(stripBody(this.priorResponse)).cacheResponse(stripBody(this.cacheResponse)).build();
            } else {
                this.userResponse = new Response.Builder().request(this.userRequest).priorResponse(stripBody(this.priorResponse)).protocol(Protocol.HTTP_1_1).code(TypedValues.PositionType.TYPE_PERCENT_HEIGHT).message("Unsatisfiable Request (only-if-cached)").body(EMPTY_BODY).build();
            }
            this.userResponse = unzip(this.userResponse);
        }
    }

    private HttpStream connect() throws RouteException, RequestException, IOException {
        return this.streamAllocation.newStream(this.client.getConnectTimeout(), this.client.getReadTimeout(), this.client.getWriteTimeout(), this.client.getRetryOnConnectionFailure(), !this.networkRequest.method().equals(ShareTarget.METHOD_GET));
    }

    private static Response stripBody(Response response) {
        return (response == null || response.body() == null) ? response : response.newBuilder().body(null).build();
    }

    public final void writingRequestHeaders() {
        if (this.sentRequestMillis != -1) {
            throw new IllegalStateException();
        }
        this.sentRequestMillis = System.currentTimeMillis();
    }

    final boolean permitsRequestBody(Request request) {
        return HttpMethod.permitsRequestBody(request.method());
    }

    public final SurfaceViewImplementationApi24Impl getRequestBody() {
        if (this.cacheStrategy == null) {
            throw new IllegalStateException();
        }
        return this.requestBodyOut;
    }

    public final RotationProviderListener getBufferedRequestBody() {
        RotationProviderListener rotationProviderListener = this.bufferedRequestBody;
        if (rotationProviderListener != null) {
            return rotationProviderListener;
        }
        SurfaceViewImplementationApi24Impl requestBody = getRequestBody();
        if (requestBody == null) {
            return null;
        }
        RotationProviderListener rotationProviderListenerTuitionPaymentFragmentbindingInflater1 = SurfaceViewImplementation.TuitionPaymentFragmentbindingInflater1(requestBody);
        this.bufferedRequestBody = rotationProviderListenerTuitionPaymentFragmentbindingInflater1;
        return rotationProviderListenerTuitionPaymentFragmentbindingInflater1;
    }

    public final boolean hasResponse() {
        return this.userResponse != null;
    }

    public final Request getRequest() {
        return this.userRequest;
    }

    public final Response getResponse() {
        Response response = this.userResponse;
        if (response != null) {
            return response;
        }
        throw new IllegalStateException();
    }

    public final Connection getConnection() {
        return this.streamAllocation.connection();
    }

    public final HttpEngine recover(RouteException routeException) {
        if (!this.streamAllocation.recover(routeException) || !this.client.getRetryOnConnectionFailure()) {
            return null;
        }
        return new HttpEngine(this.client, this.userRequest, this.bufferRequestBody, this.callerWritesRequestBody, this.forWebSocket, close(), (RetryableSink) this.requestBodyOut, this.priorResponse);
    }

    public final HttpEngine recover(IOException iOException, SurfaceViewImplementationApi24Impl surfaceViewImplementationApi24Impl) {
        if (!this.streamAllocation.recover(iOException, surfaceViewImplementationApi24Impl) || !this.client.getRetryOnConnectionFailure()) {
            return null;
        }
        return new HttpEngine(this.client, this.userRequest, this.bufferRequestBody, this.callerWritesRequestBody, this.forWebSocket, close(), (RetryableSink) surfaceViewImplementationApi24Impl, this.priorResponse);
    }

    public final HttpEngine recover(IOException iOException) {
        return recover(iOException, this.requestBodyOut);
    }

    private void maybeCache() throws IOException {
        InternalCache internalCache = Internal.instance.internalCache(this.client);
        if (internalCache != null) {
            if (!CacheStrategy.isCacheable(this.userResponse, this.networkRequest)) {
                if (HttpMethod.invalidatesCache(this.networkRequest.method())) {
                    try {
                        internalCache.remove(this.networkRequest);
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
                return;
            }
            this.storeRequest = internalCache.put(stripBody(this.userResponse));
        }
    }

    public final void releaseStreamAllocation() throws IOException {
        this.streamAllocation.release();
    }

    public final void cancel() {
        this.streamAllocation.cancel();
    }

    public final StreamAllocation close() {
        RotationProviderListener rotationProviderListener = this.bufferedRequestBody;
        if (rotationProviderListener != null) {
            Util.closeQuietly(rotationProviderListener);
        } else {
            SurfaceViewImplementationApi24Impl surfaceViewImplementationApi24Impl = this.requestBodyOut;
            if (surfaceViewImplementationApi24Impl != null) {
                Util.closeQuietly(surfaceViewImplementationApi24Impl);
            }
        }
        Response response = this.userResponse;
        if (response != null) {
            Util.closeQuietly(response.body());
        } else {
            this.streamAllocation.connectionFailed();
        }
        return this.streamAllocation;
    }

    private Response unzip(Response response) throws IOException {
        if (!this.transparentGzip || !"gzip".equalsIgnoreCase(this.userResponse.header("Content-Encoding")) || response.body() == null) {
            return response;
        }
        getVisibilityRampUpAnimationDurationMillis getvisibilityrampupanimationdurationmillis = new getVisibilityRampUpAnimationDurationMillis(response.body().source());
        Headers headersBuild = response.headers().newBuilder().removeAll("Content-Encoding").removeAll("Content-Length").build();
        return response.newBuilder().headers(headersBuild).body(new RealResponseBody(headersBuild, SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getvisibilityrampupanimationdurationmillis))).build();
    }

    public static boolean hasBody(Response response) {
        if (response.request().method().equals("HEAD")) {
            return false;
        }
        int iCode = response.code();
        return (((iCode >= 100 && iCode < 200) || iCode == 204 || iCode == 304) && OkHeaders.contentLength(response) == -1 && !"chunked".equalsIgnoreCase(response.header("Transfer-Encoding"))) ? false : true;
    }

    private Request networkRequest(Request request) throws IOException {
        Request.Builder builderNewBuilder = request.newBuilder();
        if (request.header("Host") == null) {
            builderNewBuilder.header("Host", Util.hostHeader(request.httpUrl()));
        }
        if (request.header("Connection") == null) {
            builderNewBuilder.header("Connection", "Keep-Alive");
        }
        if (request.header("Accept-Encoding") == null) {
            this.transparentGzip = true;
            builderNewBuilder.header("Accept-Encoding", "gzip");
        }
        CookieHandler cookieHandler = this.client.getCookieHandler();
        if (cookieHandler != null) {
            OkHeaders.addCookies(builderNewBuilder, cookieHandler.get(request.uri(), OkHeaders.toMultimap(builderNewBuilder.build().headers(), null)));
        }
        if (request.header("User-Agent") == null) {
            builderNewBuilder.header("User-Agent", Version.userAgent());
        }
        return builderNewBuilder.build();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:47:0x011f  */
    /* JADX WARN: Code duplicated, block: B:50:0x015a  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    public final void readResponse() throws IOException {
        Response responseProceed;
        Response response;
        Response responseBuild;
        if (this.userResponse == null) {
            Request request = this.networkRequest;
            if (request == null && this.cacheResponse == null) {
                throw new IllegalStateException("call sendRequest() first!");
            }
            if (request != null) {
                if (this.forWebSocket) {
                    this.httpStream.writeRequestHeaders(request);
                } else {
                    if (!this.callerWritesRequestBody) {
                        responseProceed = new NetworkInterceptorChain(0, this.networkRequest).proceed(this.networkRequest);
                    } else {
                        RotationProviderListener rotationProviderListener = this.bufferedRequestBody;
                        if (rotationProviderListener != null && rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault2().size > 0) {
                            this.bufferedRequestBody.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        }
                        if (this.sentRequestMillis == -1) {
                            if (OkHeaders.contentLength(this.networkRequest) == -1) {
                                SurfaceViewImplementationApi24Impl surfaceViewImplementationApi24Impl = this.requestBodyOut;
                                if (surfaceViewImplementationApi24Impl instanceof RetryableSink) {
                                    this.networkRequest = this.networkRequest.newBuilder().header("Content-Length", Long.toString(((RetryableSink) surfaceViewImplementationApi24Impl).contentLength())).build();
                                }
                            }
                            this.httpStream.writeRequestHeaders(this.networkRequest);
                        }
                        SurfaceViewImplementationApi24Impl surfaceViewImplementationApi24Impl2 = this.requestBodyOut;
                        if (surfaceViewImplementationApi24Impl2 != null) {
                            RotationProviderListener rotationProviderListener2 = this.bufferedRequestBody;
                            if (rotationProviderListener2 != null) {
                                rotationProviderListener2.close();
                            } else {
                                surfaceViewImplementationApi24Impl2.close();
                            }
                            SurfaceViewImplementationApi24Impl surfaceViewImplementationApi24Impl3 = this.requestBodyOut;
                            if (surfaceViewImplementationApi24Impl3 instanceof RetryableSink) {
                                this.httpStream.writeRequestBody((RetryableSink) surfaceViewImplementationApi24Impl3);
                            }
                        }
                    }
                    receiveHeaders(responseProceed.headers());
                    response = this.cacheResponse;
                    if (response != null) {
                        if (validate(response, responseProceed)) {
                            this.userResponse = this.cacheResponse.newBuilder().request(this.userRequest).priorResponse(stripBody(this.priorResponse)).headers(combine(this.cacheResponse.headers(), responseProceed.headers())).cacheResponse(stripBody(this.cacheResponse)).networkResponse(stripBody(responseProceed)).build();
                            responseProceed.body().close();
                            releaseStreamAllocation();
                            InternalCache internalCache = Internal.instance.internalCache(this.client);
                            internalCache.trackConditionalCacheHit();
                            internalCache.update(this.cacheResponse, stripBody(this.userResponse));
                            this.userResponse = unzip(this.userResponse);
                            return;
                        }
                        Util.closeQuietly(this.cacheResponse.body());
                    }
                    responseBuild = responseProceed.newBuilder().request(this.userRequest).priorResponse(stripBody(this.priorResponse)).cacheResponse(stripBody(this.cacheResponse)).networkResponse(stripBody(responseProceed)).build();
                    this.userResponse = responseBuild;
                    if (hasBody(responseBuild)) {
                        maybeCache();
                        this.userResponse = unzip(cacheWritingResponse(this.storeRequest, this.userResponse));
                    }
                }
                responseProceed = readNetworkResponse();
                receiveHeaders(responseProceed.headers());
                response = this.cacheResponse;
                if (response != null) {
                    if (validate(response, responseProceed)) {
                        this.userResponse = this.cacheResponse.newBuilder().request(this.userRequest).priorResponse(stripBody(this.priorResponse)).headers(combine(this.cacheResponse.headers(), responseProceed.headers())).cacheResponse(stripBody(this.cacheResponse)).networkResponse(stripBody(responseProceed)).build();
                        responseProceed.body().close();
                        releaseStreamAllocation();
                        InternalCache internalCache2 = Internal.instance.internalCache(this.client);
                        internalCache2.trackConditionalCacheHit();
                        internalCache2.update(this.cacheResponse, stripBody(this.userResponse));
                        this.userResponse = unzip(this.userResponse);
                        return;
                    }
                    Util.closeQuietly(this.cacheResponse.body());
                }
                responseBuild = responseProceed.newBuilder().request(this.userRequest).priorResponse(stripBody(this.priorResponse)).cacheResponse(stripBody(this.cacheResponse)).networkResponse(stripBody(responseProceed)).build();
                this.userResponse = responseBuild;
                if (hasBody(responseBuild)) {
                    maybeCache();
                    this.userResponse = unzip(cacheWritingResponse(this.storeRequest, this.userResponse));
                }
            }
        }
    }

    class NetworkInterceptorChain implements Interceptor.Chain {
        private int calls;
        private final int index;
        private final Request request;

        NetworkInterceptorChain(int i, Request request) {
            this.index = i;
            this.request = request;
        }

        @Override // com.squareup.okhttp.Interceptor.Chain
        public Connection connection() {
            return HttpEngine.this.streamAllocation.connection();
        }

        @Override // com.squareup.okhttp.Interceptor.Chain
        public Request request() {
            return this.request;
        }

        @Override // com.squareup.okhttp.Interceptor.Chain
        public Response proceed(Request request) throws IOException {
            this.calls++;
            if (this.index > 0) {
                Interceptor interceptor = HttpEngine.this.client.networkInterceptors().get(this.index - 1);
                Address address = connection().getRoute().getAddress();
                if (!request.httpUrl().host().equals(address.getUriHost()) || request.httpUrl().port() != address.getUriPort()) {
                    StringBuilder sb = new StringBuilder("network interceptor ");
                    sb.append(interceptor);
                    sb.append(" must retain the same host and port");
                    throw new IllegalStateException(sb.toString());
                }
                if (this.calls > 1) {
                    StringBuilder sb2 = new StringBuilder("network interceptor ");
                    sb2.append(interceptor);
                    sb2.append(" must call proceed() exactly once");
                    throw new IllegalStateException(sb2.toString());
                }
            }
            if (this.index >= HttpEngine.this.client.networkInterceptors().size()) {
                HttpEngine.this.httpStream.writeRequestHeaders(request);
                HttpEngine.this.networkRequest = request;
                if (HttpEngine.this.permitsRequestBody(request) && request.body() != null) {
                    RotationProviderListener rotationProviderListenerTuitionPaymentFragmentbindingInflater1 = SurfaceViewImplementation.TuitionPaymentFragmentbindingInflater1(HttpEngine.this.httpStream.createRequestBody(request, request.body().contentLength()));
                    request.body().writeTo(rotationProviderListenerTuitionPaymentFragmentbindingInflater1);
                    rotationProviderListenerTuitionPaymentFragmentbindingInflater1.close();
                }
                Response networkResponse = HttpEngine.this.readNetworkResponse();
                int iCode = networkResponse.code();
                if ((iCode != 204 && iCode != 205) || networkResponse.body().contentLength() <= 0) {
                    return networkResponse;
                }
                StringBuilder sb3 = new StringBuilder("HTTP ");
                sb3.append(iCode);
                sb3.append(" had non-zero Content-Length: ");
                sb3.append(networkResponse.body().contentLength());
                throw new ProtocolException(sb3.toString());
            }
            NetworkInterceptorChain networkInterceptorChain = HttpEngine.this.new NetworkInterceptorChain(this.index + 1, request);
            Interceptor interceptor2 = HttpEngine.this.client.networkInterceptors().get(this.index);
            Response responseIntercept = interceptor2.intercept(networkInterceptorChain);
            if (networkInterceptorChain.calls != 1) {
                StringBuilder sb4 = new StringBuilder("network interceptor ");
                sb4.append(interceptor2);
                sb4.append(" must call proceed() exactly once");
                throw new IllegalStateException(sb4.toString());
            }
            if (responseIntercept != null) {
                return responseIntercept;
            }
            StringBuilder sb5 = new StringBuilder("network interceptor ");
            sb5.append(interceptor2);
            sb5.append(" returned null");
            throw new NullPointerException(sb5.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Response readNetworkResponse() throws IOException {
        this.httpStream.finishRequest();
        Response responseBuild = this.httpStream.readResponseHeaders().request(this.networkRequest).handshake(this.streamAllocation.connection().getHandshake()).header(OkHeaders.SENT_MILLIS, Long.toString(this.sentRequestMillis)).header(OkHeaders.RECEIVED_MILLIS, Long.toString(System.currentTimeMillis())).build();
        if (!this.forWebSocket) {
            responseBuild = responseBuild.newBuilder().body(this.httpStream.openResponseBody(responseBuild)).build();
        }
        if (!"close".equalsIgnoreCase(responseBuild.request().header("Connection")) && !"close".equalsIgnoreCase(responseBuild.header("Connection"))) {
            return responseBuild;
        }
        this.streamAllocation.noNewStreams();
        return responseBuild;
    }

    private Response cacheWritingResponse(final CacheRequest cacheRequest, Response response) throws IOException {
        SurfaceViewImplementationApi24Impl surfaceViewImplementationApi24ImplBody;
        if (cacheRequest == null || (surfaceViewImplementationApi24ImplBody = cacheRequest.body()) == null) {
            return response;
        }
        final RotationProvider1 rotationProvider1Source = response.body().source();
        final RotationProviderListener rotationProviderListenerTuitionPaymentFragmentbindingInflater1 = SurfaceViewImplementation.TuitionPaymentFragmentbindingInflater1(surfaceViewImplementationApi24ImplBody);
        return response.newBuilder().body(new RealResponseBody(response.headers(), SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new tryToComplete() { // from class: com.squareup.okhttp.internal.http.HttpEngine.2
            boolean cacheRequestClosed;
            private static final byte[] $$c = {57, -50, -56, -93};
            private static final int $$f = 156;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {29, 88, -118, 32, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55};
            private static final int $$e = 63;
            private static final byte[] $$a = {32, 1, 70, -122, 15, -8, 16, -1, -4, -3, -52, 55, 14, 1, 8, -13, 11, 8, -68, 68, -1, -61, 21, 49, 2, -2, -1, -4, 0, 21, -9, 8, 1, -35, 39, -6, 11, -1, 21, -17, -27, 39, 11, -7, 23, -19, -49, 64, -9, 15, -5, -55, 40, 22, 12, -11, -2, 5, 3, -17, 19, 4, -5, -5, 2, 13, 7, -4, 7};
            private static final int $$b = 2;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            private static int b = 1;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -83722421;
            private static int[] TuitionPaymentFragmentbindingInflater1 = {-1045190956, -1417365551, -70777898, 881866475, -331741300, 544409112, 1060540331, -937142115, 1292147450, -820401941, -1235131331, -776903512, 770351271, 1091823478, -573409957, 1578386910, -437189387, 104269018};

            /* JADX WARN: Code duplicated, block: B:10:0x0023  */
            /* JADX WARN: Code duplicated, block: B:8:0x001b  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(byte r6, short r7, byte r8, java.lang.Object[] r9) {
                /*
                    int r8 = r8 * 3
                    int r8 = r8 + 97
                    byte[] r0 = com.squareup.okhttp.internal.http.HttpEngine.AnonymousClass2.$$a
                    int r7 = r7 + 4
                    int r1 = r6 + 4
                    byte[] r1 = new byte[r1]
                    int r6 = r6 + 3
                    r2 = 0
                    if (r0 != 0) goto L15
                    r3 = r6
                    r8 = r7
                    r4 = r2
                    goto L2c
                L15:
                    r3 = r2
                L16:
                    byte r4 = (byte) r8
                    r1[r3] = r4
                    if (r3 != r6) goto L23
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L23:
                    int r3 = r3 + 1
                    r4 = r0[r7]
                    r5 = r8
                    r8 = r7
                    r7 = r4
                    r4 = r3
                    r3 = r5
                L2c:
                    int r3 = r3 + r7
                    int r7 = r8 + 1
                    int r8 = r3 + (-2)
                    r3 = r4
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.http.HttpEngine.AnonymousClass2.d(byte, short, byte, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0025  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void e(int r6, byte r7, int r8, java.lang.Object[] r9) {
                /*
                    int r8 = r8 * 52
                    int r0 = r8 + 1
                    int r7 = r7 * 52
                    int r7 = 56 - r7
                    int r6 = r6 + 84
                    byte[] r1 = com.squareup.okhttp.internal.http.HttpEngine.AnonymousClass2.$$d
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    if (r1 != 0) goto L15
                    r3 = r7
                    r7 = r8
                    r4 = r2
                    goto L2b
                L15:
                    r3 = r2
                L16:
                    byte r4 = (byte) r6
                    r0[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r8) goto L25
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    r9[r2] = r6
                    return
                L25:
                    r3 = r1[r7]
                    r5 = r7
                    r7 = r6
                    r6 = r3
                    r3 = r5
                L2b:
                    int r3 = r3 + 1
                    int r6 = -r6
                    int r7 = r7 + r6
                    int r6 = r7 + (-10)
                    r7 = r3
                    r3 = r4
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.http.HttpEngine.AnonymousClass2.e(int, byte, int, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:34:0x016d  */
            /* JADX WARN: Code duplicated, block: B:35:0x016e  */
            private static void a(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
                int i4;
                char c;
                Throwable cause;
                int i5 = 2 % 2;
                setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
                char[] cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (true) {
                    i4 = 29209604;
                    c = '0';
                    if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i2) {
                        break;
                    }
                    int i6 = $11 + 49;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    int i8 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), ExpandableListView.getPackedPositionGroup(0L) + 3291, 30 - TextUtils.lastIndexOf("", '0', 0), 1199271174, false, $$g(b2, b3, (byte) (b3 | 54)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr2[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 651 - (ViewConfiguration.getTapTimeout() >> 16), 45 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -450685997, false, $$g(b4, b5, (byte) (b5 | 53)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    } catch (Throwable th) {
                        cause = th.getCause();
                        if (cause != null) {
                            throw th;
                        }
                        throw cause;
                    }
                    cause = th.getCause();
                    if (cause != null) {
                        throw th;
                    }
                    throw cause;
                }
                if (i3 > 0) {
                    setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
                    char[] cArr3 = new char[i2];
                    System.arraycopy(cArr2, 0, cArr3, 0, i2);
                    System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                    System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                }
                if (!(!z)) {
                    char[] cArr4 = new char[i2];
                    setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                    while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                        cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                        Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 650 - TextUtils.lastIndexOf("", c), Color.blue(0) + 44, -450685997, false, $$g(b6, b7, (byte) (b7 | 53)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        int i9 = $11 + 3;
                        $10 = i9 % 128;
                        int i10 = i9 % 2;
                        i4 = 29209604;
                        c = '0';
                    }
                    cArr2 = cArr4;
                }
                objArr[0] = new String(cArr2);
            }

            private static void c(int[] iArr, int i, Object[] objArr) throws Throwable {
                int i2;
                int length;
                int[] iArr2;
                int i3 = 2;
                int i4 = 2 % 2;
                SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr3 = TuitionPaymentFragmentbindingInflater1;
                int i5 = -1870535734;
                char c = '0';
                int i6 = 1;
                int i7 = 0;
                if (iArr3 != null) {
                    int i8 = $10 + 81;
                    $11 = i8 % 128;
                    if (i8 % 2 == 0) {
                        length = iArr3.length;
                        iArr2 = new int[length];
                    } else {
                        length = iArr3.length;
                        iArr2 = new int[length];
                    }
                    int i9 = 0;
                    while (i9 < length) {
                        int i10 = $11 + 65;
                        $10 = i10 % 128;
                        int i11 = i10 % i3;
                        try {
                            Object[] objArr2 = new Object[1];
                            objArr2[i7] = Integer.valueOf(iArr3[i9]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b2 = (byte) i7;
                                byte b3 = b2;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.getTrimmedLength(""), 3339 - AndroidCharacter.getMirror(c), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 30, 1948206109, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            iArr2[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                            i9++;
                            i3 = 2;
                            i5 = -1870535734;
                            c = '0';
                            i7 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    iArr3 = iArr2;
                }
                int length2 = iArr3.length;
                int[] iArr4 = new int[length2];
                int[] iArr5 = TuitionPaymentFragmentbindingInflater1;
                float f = 0.0f;
                if (iArr5 != null) {
                    int length3 = iArr5.length;
                    int[] iArr6 = new int[length3];
                    int i12 = $11 + 19;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    int i14 = 0;
                    while (i14 < length3) {
                        Object[] objArr3 = new Object[i6];
                        objArr3[0] = Integer.valueOf(iArr5[i14]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 3292 - (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)), View.MeasureSpec.getMode(0) + 31, 1948206109, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                        }
                        iArr6[i14] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                        i14++;
                        iArr5 = iArr5;
                        f = 0.0f;
                        i6 = 1;
                    }
                    int i15 = $11 + 19;
                    $10 = i15 % 128;
                    i2 = 2;
                    int i16 = i15 % 2;
                    iArr5 = iArr6;
                } else {
                    i2 = 2;
                }
                System.arraycopy(iArr5, 0, iArr4, 0, length2);
                sessionConfigValidatingBuilder.b = i2;
                int i17 = $10 + 103;
                $11 = i17 % 128;
                int i18 = i17 % i2;
                while (sessionConfigValidatingBuilder.b < iArr.length) {
                    cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
                    cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
                    cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
                    cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
                    int i19 = 17;
                    for (int i20 = 1; i19 > i20; i20 = 1) {
                        int i21 = $10 + 25;
                        $11 = i21 % 128;
                        if (i21 % 2 == 0) {
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i19];
                            Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b6 = (byte) 0;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getTouchSlop() >> 8), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2559, View.MeasureSpec.getMode(0) + 29, 683220507, false, $$g(b6, b6, (byte) (-$$c[2])), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                            i19 += 23;
                        } else {
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i19];
                            Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b7 = (byte) 0;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2559, 28 - ImageFormat.getBitsPerPixel(0), 683220507, false, $$g(b7, b7, (byte) (-$$c[2])), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                            }
                            int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue2;
                            i19--;
                        }
                    }
                    int i22 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i22;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                    int i23 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    Object[] objArr6 = {sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (28878 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 348 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 24 - Process.getGidForName(""), -30507727, false, "G", new Class[]{Object.class});
                    }
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i23 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()];
                    cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
                    cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                    cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
                    cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
                    sessionConfigValidatingBuilder.b += 2;
                }
                objArr[0] = new String(cArr2, 0, i);
            }

            /* JADX WARN: Code duplicated, block: B:13:0x0028  */
            @Override // defpackage.tryToComplete
            public long read(RotationProviderListenerWrapper rotationProviderListenerWrapper, long j) throws IOException {
                int i = 2 % 2;
                try {
                    long j2 = rotationProvider1Source.read(rotationProviderListenerWrapper, j);
                    if (j2 != -1) {
                        rotationProviderListenerWrapper.b(rotationProviderListenerTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), rotationProviderListenerWrapper.size - j2, j2);
                        rotationProviderListenerTuitionPaymentFragmentbindingInflater1.b();
                        int i2 = b + 87;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                        int i3 = i2 % 2;
                        return j2;
                    }
                    int i4 = b;
                    int i5 = i4 + 101;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 90 / 0;
                        if (!this.cacheRequestClosed) {
                            int i7 = i4 + 53;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                            int i8 = i7 % 2;
                            this.cacheRequestClosed = true;
                            rotationProviderListenerTuitionPaymentFragmentbindingInflater1.close();
                        }
                    } else if (!this.cacheRequestClosed) {
                        int i9 = i4 + 53;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
                        int i10 = i9 % 2;
                        this.cacheRequestClosed = true;
                        rotationProviderListenerTuitionPaymentFragmentbindingInflater1.close();
                    }
                    return -1L;
                } catch (IOException e2) {
                    if (!this.cacheRequestClosed) {
                        this.cacheRequestClosed = true;
                        cacheRequest.abort();
                    }
                    throw e2;
                }
            }

            @Override // defpackage.tryToComplete
            public cancelPreviousRequest timeout() {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
                b = i2 % 128;
                int i3 = i2 % 2;
                cancelPreviousRequest cancelpreviousrequestTimeout = rotationProvider1Source.timeout();
                int i4 = b + 29;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                int i5 = i4 % 2;
                return cancelpreviousrequestTimeout;
            }

            @Override // defpackage.tryToComplete, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                int i = 2 % 2;
                if (!this.cacheRequestClosed) {
                    int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
                    b = i2 % 128;
                    if (i2 % 2 != 0 ? (!Util.discard(this, 100, TimeUnit.MILLISECONDS)) : !Util.discard(this, 104, TimeUnit.MILLISECONDS)) {
                        int i3 = b + 19;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
                        if (i3 % 2 != 0) {
                            this.cacheRequestClosed = true;
                            cacheRequest.abort();
                        } else {
                            this.cacheRequestClosed = true;
                            cacheRequest.abort();
                        }
                    }
                }
                rotationProvider1Source.close();
            }

            /* JADX WARN: Code duplicated, block: B:131:0x0a50 A[Catch: IOException -> 0x0d29, Exception -> 0x0df9, all -> 0x0ec0, TryCatch #14 {all -> 0x0ec0, blocks: (B:216:0x0dbd, B:218:0x0dc3, B:219:0x0dc4, B:128:0x0a3f, B:129:0x0a42, B:131:0x0a50, B:132:0x0a91, B:134:0x0aa7, B:135:0x0ae1, B:137:0x0af3, B:139:0x0bba, B:141:0x0c62, B:144:0x0c9f, B:146:0x0cc0, B:148:0x0cf1, B:150:0x0cfb, B:235:0x0dfa, B:236:0x0ebf, B:189:0x0d61, B:190:0x0d64, B:199:0x0d8d, B:201:0x0d97, B:202:0x0d98, B:210:0x0da6, B:212:0x0db0, B:213:0x0db1, B:227:0x0de5, B:229:0x0deb, B:230:0x0dec), top: B:348:0x0a3f }] */
            /* JADX WARN: Code duplicated, block: B:134:0x0aa7 A[Catch: IOException -> 0x0d29, Exception -> 0x0df9, all -> 0x0ec0, TryCatch #14 {all -> 0x0ec0, blocks: (B:216:0x0dbd, B:218:0x0dc3, B:219:0x0dc4, B:128:0x0a3f, B:129:0x0a42, B:131:0x0a50, B:132:0x0a91, B:134:0x0aa7, B:135:0x0ae1, B:137:0x0af3, B:139:0x0bba, B:141:0x0c62, B:144:0x0c9f, B:146:0x0cc0, B:148:0x0cf1, B:150:0x0cfb, B:235:0x0dfa, B:236:0x0ebf, B:189:0x0d61, B:190:0x0d64, B:199:0x0d8d, B:201:0x0d97, B:202:0x0d98, B:210:0x0da6, B:212:0x0db0, B:213:0x0db1, B:227:0x0de5, B:229:0x0deb, B:230:0x0dec), top: B:348:0x0a3f }] */
            /* JADX WARN: Code duplicated, block: B:139:0x0bba A[Catch: IOException -> 0x0d29, all -> 0x0ec0, TryCatch #14 {all -> 0x0ec0, blocks: (B:216:0x0dbd, B:218:0x0dc3, B:219:0x0dc4, B:128:0x0a3f, B:129:0x0a42, B:131:0x0a50, B:132:0x0a91, B:134:0x0aa7, B:135:0x0ae1, B:137:0x0af3, B:139:0x0bba, B:141:0x0c62, B:144:0x0c9f, B:146:0x0cc0, B:148:0x0cf1, B:150:0x0cfb, B:235:0x0dfa, B:236:0x0ebf, B:189:0x0d61, B:190:0x0d64, B:199:0x0d8d, B:201:0x0d97, B:202:0x0d98, B:210:0x0da6, B:212:0x0db0, B:213:0x0db1, B:227:0x0de5, B:229:0x0deb, B:230:0x0dec), top: B:348:0x0a3f }] */
            /* JADX WARN: Code duplicated, block: B:141:0x0c62 A[Catch: IOException -> 0x0d29, all -> 0x0ec0, TRY_LEAVE, TryCatch #14 {all -> 0x0ec0, blocks: (B:216:0x0dbd, B:218:0x0dc3, B:219:0x0dc4, B:128:0x0a3f, B:129:0x0a42, B:131:0x0a50, B:132:0x0a91, B:134:0x0aa7, B:135:0x0ae1, B:137:0x0af3, B:139:0x0bba, B:141:0x0c62, B:144:0x0c9f, B:146:0x0cc0, B:148:0x0cf1, B:150:0x0cfb, B:235:0x0dfa, B:236:0x0ebf, B:189:0x0d61, B:190:0x0d64, B:199:0x0d8d, B:201:0x0d97, B:202:0x0d98, B:210:0x0da6, B:212:0x0db0, B:213:0x0db1, B:227:0x0de5, B:229:0x0deb, B:230:0x0dec), top: B:348:0x0a3f }] */
            /* JADX WARN: Code duplicated, block: B:143:0x0c9e  */
            /* JADX WARN: Code duplicated, block: B:146:0x0cc0 A[Catch: all -> 0x0ec0, IOException -> 0x0ed3, TryCatch #14 {all -> 0x0ec0, blocks: (B:216:0x0dbd, B:218:0x0dc3, B:219:0x0dc4, B:128:0x0a3f, B:129:0x0a42, B:131:0x0a50, B:132:0x0a91, B:134:0x0aa7, B:135:0x0ae1, B:137:0x0af3, B:139:0x0bba, B:141:0x0c62, B:144:0x0c9f, B:146:0x0cc0, B:148:0x0cf1, B:150:0x0cfb, B:235:0x0dfa, B:236:0x0ebf, B:189:0x0d61, B:190:0x0d64, B:199:0x0d8d, B:201:0x0d97, B:202:0x0d98, B:210:0x0da6, B:212:0x0db0, B:213:0x0db1, B:227:0x0de5, B:229:0x0deb, B:230:0x0dec), top: B:348:0x0a3f }] */
            /* JADX WARN: Code duplicated, block: B:148:0x0cf1 A[Catch: all -> 0x0ec0, IOException -> 0x0ed3, TRY_LEAVE, TryCatch #14 {all -> 0x0ec0, blocks: (B:216:0x0dbd, B:218:0x0dc3, B:219:0x0dc4, B:128:0x0a3f, B:129:0x0a42, B:131:0x0a50, B:132:0x0a91, B:134:0x0aa7, B:135:0x0ae1, B:137:0x0af3, B:139:0x0bba, B:141:0x0c62, B:144:0x0c9f, B:146:0x0cc0, B:148:0x0cf1, B:150:0x0cfb, B:235:0x0dfa, B:236:0x0ebf, B:189:0x0d61, B:190:0x0d64, B:199:0x0d8d, B:201:0x0d97, B:202:0x0d98, B:210:0x0da6, B:212:0x0db0, B:213:0x0db1, B:227:0x0de5, B:229:0x0deb, B:230:0x0dec), top: B:348:0x0a3f }] */
            /* JADX WARN: Code duplicated, block: B:152:0x0d16  */
            /* JADX WARN: Code duplicated, block: B:153:0x0d19  */
            /* JADX WARN: Code duplicated, block: B:212:0x0db0 A[Catch: Exception -> 0x0dfa, all -> 0x0ec0, IOException -> 0x0ed3, TryCatch #14 {all -> 0x0ec0, blocks: (B:216:0x0dbd, B:218:0x0dc3, B:219:0x0dc4, B:128:0x0a3f, B:129:0x0a42, B:131:0x0a50, B:132:0x0a91, B:134:0x0aa7, B:135:0x0ae1, B:137:0x0af3, B:139:0x0bba, B:141:0x0c62, B:144:0x0c9f, B:146:0x0cc0, B:148:0x0cf1, B:150:0x0cfb, B:235:0x0dfa, B:236:0x0ebf, B:189:0x0d61, B:190:0x0d64, B:199:0x0d8d, B:201:0x0d97, B:202:0x0d98, B:210:0x0da6, B:212:0x0db0, B:213:0x0db1, B:227:0x0de5, B:229:0x0deb, B:230:0x0dec), top: B:348:0x0a3f }] */
            /* JADX WARN: Code duplicated, block: B:213:0x0db1 A[Catch: Exception -> 0x0dfa, all -> 0x0ec0, IOException -> 0x0ed3, TryCatch #14 {all -> 0x0ec0, blocks: (B:216:0x0dbd, B:218:0x0dc3, B:219:0x0dc4, B:128:0x0a3f, B:129:0x0a42, B:131:0x0a50, B:132:0x0a91, B:134:0x0aa7, B:135:0x0ae1, B:137:0x0af3, B:139:0x0bba, B:141:0x0c62, B:144:0x0c9f, B:146:0x0cc0, B:148:0x0cf1, B:150:0x0cfb, B:235:0x0dfa, B:236:0x0ebf, B:189:0x0d61, B:190:0x0d64, B:199:0x0d8d, B:201:0x0d97, B:202:0x0d98, B:210:0x0da6, B:212:0x0db0, B:213:0x0db1, B:227:0x0de5, B:229:0x0deb, B:230:0x0dec), top: B:348:0x0a3f }] */
            /* JADX WARN: Code duplicated, block: B:229:0x0deb A[Catch: Exception -> 0x0dfa, all -> 0x0ec0, IOException -> 0x0ed3, TryCatch #14 {all -> 0x0ec0, blocks: (B:216:0x0dbd, B:218:0x0dc3, B:219:0x0dc4, B:128:0x0a3f, B:129:0x0a42, B:131:0x0a50, B:132:0x0a91, B:134:0x0aa7, B:135:0x0ae1, B:137:0x0af3, B:139:0x0bba, B:141:0x0c62, B:144:0x0c9f, B:146:0x0cc0, B:148:0x0cf1, B:150:0x0cfb, B:235:0x0dfa, B:236:0x0ebf, B:189:0x0d61, B:190:0x0d64, B:199:0x0d8d, B:201:0x0d97, B:202:0x0d98, B:210:0x0da6, B:212:0x0db0, B:213:0x0db1, B:227:0x0de5, B:229:0x0deb, B:230:0x0dec), top: B:348:0x0a3f }] */
            /* JADX WARN: Code duplicated, block: B:230:0x0dec A[Catch: Exception -> 0x0dfa, all -> 0x0ec0, IOException -> 0x0ed3, TRY_LEAVE, TryCatch #14 {all -> 0x0ec0, blocks: (B:216:0x0dbd, B:218:0x0dc3, B:219:0x0dc4, B:128:0x0a3f, B:129:0x0a42, B:131:0x0a50, B:132:0x0a91, B:134:0x0aa7, B:135:0x0ae1, B:137:0x0af3, B:139:0x0bba, B:141:0x0c62, B:144:0x0c9f, B:146:0x0cc0, B:148:0x0cf1, B:150:0x0cfb, B:235:0x0dfa, B:236:0x0ebf, B:189:0x0d61, B:190:0x0d64, B:199:0x0d8d, B:201:0x0d97, B:202:0x0d98, B:210:0x0da6, B:212:0x0db0, B:213:0x0db1, B:227:0x0de5, B:229:0x0deb, B:230:0x0dec), top: B:348:0x0a3f }] */
            /* JADX WARN: Code duplicated, block: B:248:0x0ed5  */
            /* JADX WARN: Code duplicated, block: B:24:0x0418  */
            /* JADX WARN: Code duplicated, block: B:26:0x041b  */
            /* JADX WARN: Code duplicated, block: B:280:0x14e6 A[EDGE_INSN: B:280:0x14e6->B:281:0x14eb BREAK  A[LOOP:5: B:261:0x11a7->B:279:0x14d4], PHI: r1 r2 r4
  0x14e6: PHI (r1v51 int) = (r1v47 int), (r1v47 int), (r1v54 int) binds: [B:257:0x1078, B:259:0x11a1, B:415:0x14e6] A[DONT_GENERATE, DONT_INLINE]
  0x14e6: PHI (r2v40 int) = (r2v0 int), (r2v0 int), (r2v46 int) binds: [B:257:0x1078, B:259:0x11a1, B:415:0x14e6] A[DONT_GENERATE, DONT_INLINE]
  0x14e6: PHI (r4v94 java.lang.String[]) = (r4v93 java.lang.String[]), (r4v93 java.lang.String[]), (r4v102 java.lang.String[]) binds: [B:257:0x1078, B:259:0x11a1, B:415:0x14e6] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:29:0x043d A[Catch: all -> 0x1cb7, TryCatch #8 {all -> 0x1cb7, blocks: (B:13:0x023b, B:15:0x0251, B:16:0x02a0, B:27:0x0426, B:29:0x043d, B:31:0x049a, B:271:0x1393, B:273:0x13aa, B:274:0x13fa, B:296:0x15cf, B:298:0x15dc, B:299:0x1628, B:301:0x1758, B:303:0x1765, B:304:0x17af, B:306:0x1899, B:308:0x18a6, B:309:0x18f4, B:311:0x19c8, B:313:0x19d5, B:314:0x1a22, B:316:0x1b03, B:318:0x1b10, B:319:0x1b56), top: B:344:0x023b }] */
            /* JADX WARN: Code duplicated, block: B:30:0x0496  */
            /* JADX WARN: Code duplicated, block: B:35:0x0547 A[LOOP:1: B:25:0x0419->B:35:0x0547, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:368:0x06bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:36:0x0559 A[EDGE_INSN: B:36:0x0559->B:37:0x0560 BREAK  A[LOOP:1: B:25:0x0419->B:35:0x0547], PHI: r3 r4 r6
  0x0559: PHI (r3v129 int) = (r3v128 int), (r3v205 int) binds: [B:23:0x0416, B:405:0x0559] A[DONT_GENERATE, DONT_INLINE]
  0x0559: PHI (r4v141 int) = (r4v140 int), (r4v223 int) binds: [B:23:0x0416, B:405:0x0559] A[DONT_GENERATE, DONT_INLINE]
  0x0559: PHI (r6v256 java.lang.Object) = (r6v255 java.lang.Object), (r6v324 java.lang.Object) binds: [B:23:0x0416, B:405:0x0559] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:39:0x05f4  */
            /* JADX WARN: Code duplicated, block: B:404:0x0545 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:405:0x0559 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:410:0x0d29 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:411:0x0cfb A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:413:0x0d1c A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:41:0x061e  */
            /* JADX WARN: Code duplicated, block: B:43:0x063d  */
            /* JADX WARN: Code duplicated, block: B:57:0x0709  */
            /* JADX WARN: Code duplicated, block: B:62:0x0724  */
            /* JADX WARN: Multi-variable type inference failed */
            public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context, int i, int i2, int i3) throws Throwable {
                int i4;
                String[] strArr;
                Object obj;
                int i5;
                String[] strArr2;
                int i6;
                int i7;
                int i8;
                Object obj2;
                int i9;
                int i10;
                int i11;
                Object obj3;
                String str;
                int i12;
                int i13;
                int i14;
                int i15;
                int i16;
                Object obj4;
                int i17;
                Object obj5;
                String[] strArrSplit;
                int length;
                int i18;
                String str2;
                Object[] objArr;
                int i19;
                int i20;
                Class cls;
                Process processExec;
                Throwable th;
                Throwable cause;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Throwable th2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                Throwable th3;
                Throwable cause2;
                String str3;
                int i21;
                Throwable th4;
                InterruptedException interruptedException;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                String[] strArrSplit2;
                int length2;
                int i22;
                String str4;
                Object[] objArr2;
                String str5;
                Object[] objArr3;
                Object[] objArr4;
                String[] strArrSplit3;
                int i23;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                int i24;
                int i25;
                int i26;
                int i27 = i;
                int i28 = 1;
                int i29 = 0;
                if (context != null) {
                    try {
                        int threadPriority = Process.getThreadPriority(0);
                        int i30 = -AndroidCharacter.getMirror('0');
                        int i31 = (i30 & 71) + (i30 | 71);
                        int i32 = -View.resolveSize(0, 0);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        int i33 = i32 * 615;
                        int i34 = (i33 & (-613)) + (i33 | (-613));
                        int i35 = ~i32;
                        int i36 = ~((i35 ^ 1) | (i35 & 1));
                        int i37 = i34 + (((iTuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ i36) | (i36 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (~(((-2) ^ i32) | ((-2) & i32)))) * 614);
                        int i38 = ~i32;
                        int i39 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i40 = ~((i38 ^ i39) | (i38 & i39));
                        int i41 = ~((i38 ^ 1) | (i38 & 1));
                        int i42 = (i40 & i41) | (i40 ^ i41);
                        int i43 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | 1);
                        int i44 = i37 + (((i42 & i43) | (i42 ^ i43)) * (-1228));
                        int i45 = (i39 ^ i32) | (i39 & i32);
                        int i46 = ((~(i38 | (-2) | i39)) | (~((i45 & 1) | (i45 ^ 1)))) * 614;
                        Object[] objArr5 = new Object[1];
                        a(false, ((((threadPriority | 20) << 1) - (threadPriority ^ 20)) >> 6) + 142, i31, (i44 & i46) + (i46 | i44), new char[]{15, 65532, '\t', 65535, '\r', '\n', 4, 65535, 65481, 65534, '\n', '\t', 15, 0, '\t', 15, 65481, 65502, '\n', '\t', 15, 0, 19}, objArr5);
                        Class<?> cls2 = Class.forName((String) objArr5[0]);
                        Object[] objArr6 = new Object[1];
                        c(new int[]{163002240, 1592451654, 332990300, 1804793062, -986565181, 1766716953, -242565647, 2046590119, -2044520438, 143812730}, 13 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr6);
                        String str6 = (String) cls2.getMethod((String) objArr6[0], null).invoke(context, null);
                        int i47 = -(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                        int i48 = (i47 & 143) + (i47 | 143);
                        int i49 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int i50 = ((i49 | 23) << 1) - (i49 ^ 23);
                        int i51 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                        Object[] objArr7 = new Object[1];
                        a(false, i48, i50, (i51 & 1) + (i51 | 1), new char[]{15, 65532, '\t', 65535, '\r', '\n', 4, 65535, 65481, 65534, '\n', '\t', 15, 0, '\t', 15, 65481, 65502, '\n', '\t', 15, 0, 19}, objArr7);
                        Class<?> cls3 = Class.forName((String) objArr7[0]);
                        int longPressTimeout = ViewConfiguration.getLongPressTimeout() >> 16;
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        int i52 = longPressTimeout * (-419);
                        int i53 = (i52 & 60624) + (i52 | 60624);
                        int i54 = (~((iTuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ 144) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & 144))) * TypedValues.CycleType.TYPE_EASING;
                        int i55 = ~longPressTimeout;
                        int i56 = (((i53 ^ i54) + ((i54 & i53) << 1)) - (~(-(-(((i55 ^ 144) | (i55 & 144)) * (-420)))))) - 1;
                        int i57 = ~((i55 & (-145)) | (i55 ^ (-145)));
                        int i58 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i59 = ~((i58 & 144) | (i58 ^ 144));
                        int i60 = -(-(((i57 & i59) | (i57 ^ i59)) * TypedValues.CycleType.TYPE_EASING));
                        int i61 = (i56 ^ i60) + ((i60 & i56) << 1);
                        int i62 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int i63 = (i62 ^ 18) + ((i62 & 18) << 1);
                        int i64 = -TextUtils.getOffsetBefore("", 0);
                        Object[] objArr8 = new Object[1];
                        a(true, i61, i63, (i64 & 18) + (i64 | 18), new char[]{'\b', 65535, 7, 65506, 7, '\b', 2, '\r', 65530, 65532, 2, 5, '\t', '\t', 65498, '\r', 65534, 0}, objArr8);
                        Object objInvoke = cls3.getMethod((String) objArr8[0], null).invoke(context, null);
                        int i65 = $$b;
                        byte[] bArr = $$a;
                        byte b2 = bArr[28];
                        Object[] objArr9 = new Object[1];
                        d((byte) (i65 | 28), b2, b2, objArr9);
                        Class<?> cls4 = Class.forName((String) objArr9[0]);
                        Object[] objArr10 = new Object[1];
                        d(bArr[58], (byte) (bArr[0] + 1), bArr[1], objArr10);
                        int iIndexOf = ((String) cls4.getField((String) objArr10[0]).get(objInvoke)).indexOf(str6);
                        if (iIndexOf > 0) {
                            byte b3 = bArr[28];
                            Object[] objArr11 = new Object[1];
                            d((byte) (i65 | 28), b3, b3, objArr11);
                            Class<?> cls5 = Class.forName((String) objArr11[0]);
                            Object[] objArr12 = new Object[1];
                            d(bArr[58], (byte) (bArr[0] + 1), bArr[1], objArr12);
                            String str7 = (String) cls5.getField((String) objArr12[0]).get(objInvoke);
                            int length3 = str7.length() - 16;
                            if (length3 >= 0) {
                                int i66 = 0;
                                while (true) {
                                    if (i66 > length3) {
                                        i8 = iIndexOf;
                                        obj2 = objInvoke;
                                        i9 = 0;
                                        break;
                                    }
                                    int i67 = (i66 * 334) - 4979;
                                    int i68 = -(-(((~((~i27) | (-17))) | (~(i66 | i27))) * 333));
                                    int i69 = (i67 & i68) + (i67 | i68);
                                    int i70 = ~(((-17) & i27) | ((-17) ^ i27));
                                    int i71 = ~i27;
                                    int i72 = ~((i71 & i66) | (i71 ^ i66));
                                    String strSubstring = str7.substring(i66, i69 + (((i70 & i72) | (i70 ^ i72)) * 333));
                                    try {
                                        Object[] objArr13 = new Object[2];
                                        objArr13[i28] = 931995;
                                        objArr13[i29] = strSubstring;
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                            char threadPriority2 = (char) ((Process.getThreadPriority(i29) + 20) >> 6);
                                            int iArgb = Color.argb(i29, i29, i29, i29) + 3393;
                                            int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', i29) + 10;
                                            byte b4 = (byte) ($$e & 14);
                                            byte b5 = $$d[7];
                                            Object[] objArr14 = new Object[i28];
                                            e(b4, b5, (byte) (b5 - 1), objArr14);
                                            String str8 = (String) objArr14[0];
                                            Class[] clsArr = new Class[2];
                                            clsArr[0] = String.class;
                                            clsArr[i28] = Integer.TYPE;
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(threadPriority2, iArgb, iIndexOf2, 1203525406, false, str8, clsArr);
                                        }
                                        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr13)).longValue();
                                        long j = 759984272;
                                        String str9 = str7;
                                        int i73 = length3;
                                        obj2 = objInvoke;
                                        long j2 = 765;
                                        i8 = iIndexOf;
                                        long j3 = -1;
                                        long j4 = j ^ j3;
                                        long j5 = jLongValue ^ j3;
                                        long j6 = j4 | j5;
                                        long jUptimeMillis = (int) SystemClock.uptimeMillis();
                                        long j7 = jUptimeMillis ^ j3;
                                        long j8 = (((long) (-1529)) * j) + (((long) (-764)) * jLongValue) + ((((j6 | j7) ^ j3) | (((j4 | jLongValue) | jUptimeMillis) ^ j3) | (((j5 | j) | jUptimeMillis) ^ j3)) * j2) + (((long) 1530) * ((j6 ^ j3) | ((j4 | j7) ^ j3))) + (j2 * (((j4 | jUptimeMillis) ^ j3) | (((j5 | j7) | j) ^ j3))) + ((long) (-762054149));
                                        int i74 = ((int) (j8 >> 32)) & (1187647427 + (((~((-1002574707) | i27)) | 1855166178) * (-465)) + (((-1002574707) | (~(1855166178 | i27))) * 930) + (((-289407249) | i27) * 465));
                                        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                                        int i75 = ((int) j8) & ((-542366602) + (((~((~elapsedCpuTime) | 886126968)) | (-551099442)) * (-235)) + (((~(886126968 | elapsedCpuTime)) | (-551099442)) * (-470)) + (((~(elapsedCpuTime | (-525314))) | 335552840) * 235));
                                        if (((i75 & i74) | (i74 ^ i75)) == -725904754) {
                                            i9 = 1;
                                            break;
                                        }
                                        i66 = ((i66 ^ 21) + ((i66 & 21) << 1)) - 20;
                                        str7 = str9;
                                        objInvoke = obj2;
                                        length3 = i73;
                                        iIndexOf = i8;
                                        i29 = 0;
                                        i28 = 1;
                                    } catch (Throwable th5) {
                                        Throwable cause3 = th5.getCause();
                                        if (cause3 != null) {
                                            throw cause3;
                                        }
                                        throw th5;
                                    }
                                }
                                i10 = i27 ^ 20;
                                int i76 = -i9;
                                int i77 = ((i9 & i76) | (i9 ^ i76)) >> 31;
                                int i78 = (~i77) & i27;
                                int i79 = i77 & i10;
                                i11 = (i79 & i78) | (i78 ^ i79);
                                byte b6 = (byte) ($$b | 28);
                                byte[] bArr2 = $$a;
                                byte b7 = bArr2[28];
                                Object[] objArr15 = new Object[1];
                                d(b6, b7, b7, objArr15);
                                Class<?> cls6 = Class.forName((String) objArr15[0]);
                                Object[] objArr16 = new Object[1];
                                d(bArr2[58], (byte) (bArr2[0] + 1), bArr2[1], objArr16);
                                obj3 = obj2;
                                str = (String) cls6.getField((String) objArr16[0]).get(obj3);
                                int length4 = str.length();
                                int i80 = (~length4) | 5;
                                i12 = ~i27;
                                int i81 = ~((i80 & i12) | (i80 ^ i12));
                                int i82 = ~((-6) | length4 | i27);
                                int i83 = (((-1638) + (length4 * (-271))) - (~(-(-(((i81 & i82) | (i81 ^ i82)) * (-272)))))) - 1;
                                int i84 = ~((5 ^ length4) | (5 & length4));
                                int i85 = ~((5 ^ i27) | (5 & i27));
                                int i86 = ((i84 & i85) | (i84 ^ i85)) * (-272);
                                int i87 = ((i83 | i86) << 1) - (i86 ^ i83);
                                int i88 = ~((-6) | i27);
                                int i89 = i87 - (~(((length4 & i88) | (length4 ^ i88)) * 272));
                                i13 = 1;
                                i14 = i89 - 1;
                                if (i14 >= 0) {
                                    i15 = i11;
                                    i16 = i10;
                                    obj4 = obj3;
                                    i17 = 0;
                                    break;
                                }
                                i23 = 0;
                                while (true) {
                                    if (i23 <= i14) {
                                        i15 = i11;
                                        i16 = i10;
                                        obj4 = obj3;
                                        i17 = 0;
                                        break;
                                    }
                                    String strSubstring2 = str.substring(i23, ((i23 | 6) << i13) - (i23 ^ 6));
                                    Object[] objArr17 = new Object[2];
                                    objArr17[i13] = 931995;
                                    objArr17[0] = strSubstring2;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                        char c = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 3393;
                                        int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0', 0) + 10;
                                        byte b8 = (byte) ($$e & 14);
                                        byte b9 = $$d[7];
                                        Object[] objArr18 = new Object[1];
                                        e(b8, b9, (byte) (b9 - 1), objArr18);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, touchSlop, iIndexOf3, 1203525406, false, (String) objArr18[0], new Class[]{String.class, Integer.TYPE});
                                    }
                                    long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr17)).longValue();
                                    long j9 = 800869393;
                                    long j10 = (((long) (-589)) * j9) + (((long) 591) * jLongValue2);
                                    long j11 = 590;
                                    i15 = i11;
                                    i16 = i10;
                                    long j12 = -1;
                                    long j13 = jLongValue2 ^ j12;
                                    obj4 = obj3;
                                    i24 = i23;
                                    long j14 = i27;
                                    long j15 = j14 ^ j12;
                                    long j16 = ((j13 | j15) ^ j12) | ((j13 | j9) ^ j12) | ((j15 | j9) ^ j12);
                                    long j17 = j9 ^ j12;
                                    long j18 = j10 + ((j16 | (((j17 | jLongValue2) | j14) ^ j12)) * j11) + (((long) (-1180)) * j16) + (j11 * ((j12 ^ (j15 | jLongValue2)) | ((j17 | j15) ^ j12))) + ((long) (-802939270));
                                    int i90 = ~i27;
                                    i25 = ((int) (j18 >> 32)) & (635053406 + (((~((-1473093688) | i90)) | (~(35867276 | i27))) * (-370)) + (((~(i90 | 35867276)) | (~((-1473093688) | i27)) | 2247304) * (-370)) + 831502480);
                                    int i91 = ~((~((int) Process.getStartElapsedRealtime())) | (-1254528421));
                                    i26 = ((int) j18) & (((2179073 | i91) * (-374)) + 1234914383 + ((i91 | (-1256707494)) * 374));
                                    if (((i25 & i26) | (i25 ^ i26)) == -2096167706) {
                                        i17 = 1;
                                        break;
                                    }
                                    i23 = i24 + 1;
                                    str = str;
                                    i14 = i14;
                                    i10 = i16;
                                    i11 = i15;
                                    obj3 = obj4;
                                    i13 = 1;
                                }
                                int i92 = -i17;
                                int i93 = ((i17 & i92) | (i17 ^ i92)) >> 31;
                                int i94 = (~i93) & i27;
                                int i95 = i16 & i93;
                                int i96 = (i95 & i94) | (i94 ^ i95);
                                int i97 = i27 ^ i15;
                                int i98 = -i97;
                                int i99 = ((i97 & i98) | (i97 ^ i98)) >> 31;
                                int i100 = i96 & (~i99);
                                int i101 = i15 & i99;
                                i5 = (i100 & i101) | (i100 ^ i101);
                                byte b10 = (byte) ($$b | 28);
                                byte[] bArr3 = $$a;
                                byte b11 = bArr3[28];
                                Object[] objArr19 = new Object[1];
                                d(b10, b11, b11, objArr19);
                                Class<?> cls7 = Class.forName((String) objArr19[0]);
                                Object[] objArr20 = new Object[1];
                                d(bArr3[58], (byte) (bArr3[0] + 1), bArr3[1], objArr20);
                                Field field = cls7.getField((String) objArr20[0]);
                                obj5 = obj4;
                                int i102 = i8 ^ (-1);
                                int i103 = -i102;
                                String strSubstring3 = ((String) field.get(obj5)).substring(0, i8 & (((i102 & i103) | (i102 ^ i103)) >> 31));
                                Object[] objArr21 = new Object[1];
                                c(new int[]{433081423, 1518344654, 635466386, 531098248}, View.resolveSizeAndState(0, 0, 0) + 1, objArr21);
                                strArrSplit = strSubstring3.split((String) objArr21[0]);
                                length = strArrSplit.length;
                                i18 = 0;
                                while (i18 < length) {
                                    str2 = strArrSplit[i18];
                                    objArr = new Object[1];
                                    c(new int[]{1605383420, -1365102120, 473917954, -2113939256}, Color.alpha(0) + 3, objArr);
                                    if (str2.split((String) objArr[0]).length > 1) {
                                        cls = (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ExpandableListView.getPackedPositionType(0L), 2267 - TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getTapTimeout() >> 16) + 33);
                                        synchronized (cls) {
                                            try {
                                                try {
                                                    Object[] objArr22 = new Object[1];
                                                    a(true, 138 - (ViewConfiguration.getEdgeSlop() >> 16), 17 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 13 - (~(-(-TextUtils.getOffsetBefore("", 0)))), new char[]{6, 0, '\n', 2, 0, 15, 65471, 19, 18, '\b', 11, 65471, '\f', 15, 18, 4}, objArr22);
                                                    String str10 = (String) objArr22[0];
                                                    try {
                                                        try {
                                                            Runtime runtime = Runtime.getRuntime();
                                                            int i104 = -(-TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                                                            int i105 = (i104 ^ 3) + ((i104 & 3) << 1);
                                                            Object[] objArr23 = new Object[1];
                                                            c(new int[]{-447374343, 1495396943, 1821958054, -852443680}, i105, objArr23);
                                                            processExec = runtime.exec((String) objArr23[0], (String[]) null, (File) null);
                                                            try {
                                                                Object[] objArr24 = {processExec.getInputStream()};
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                                    try {
                                                                        try {
                                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), ExpandableListView.getPackedPositionGroup(0L) + 2142, TextUtils.lastIndexOf("", '0', 0, 0) + 46, -1020714777, false, null, new Class[]{InputStream.class});
                                                                        } catch (Throwable th6) {
                                                                            th = th6;
                                                                            th = th;
                                                                            cause = th.getCause();
                                                                            if (cause != null) {
                                                                                throw cause;
                                                                            }
                                                                            throw th;
                                                                        }
                                                                    } catch (Throwable th7) {
                                                                        th = th7;
                                                                    }
                                                                }
                                                                try {
                                                                    Object objNewInstance = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr24);
                                                                    try {
                                                                        try {
                                                                            Object[] objArr25 = {processExec.getErrorStream()};
                                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                                                try {
                                                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) View.getDefaultSize(0, 0), 2143 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 45 - (ViewConfiguration.getLongPressTimeout() >> 16), -1020714777, false, null, new Class[]{InputStream.class});
                                                                                } catch (Throwable th8) {
                                                                                    th2 = th8;
                                                                                    Throwable cause4 = th2.getCause();
                                                                                    if (cause4 != null) {
                                                                                        throw cause4;
                                                                                    }
                                                                                    throw th2;
                                                                                }
                                                                            }
                                                                            Object objNewInstance2 = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr25);
                                                                            DataOutputStream dataOutputStream = new DataOutputStream(processExec.getOutputStream());
                                                                            try {
                                                                                byte[] bArr4 = $$a;
                                                                                obj5 = obj5;
                                                                                try {
                                                                                    i5 = i5;
                                                                                    i19 = i18;
                                                                                    try {
                                                                                        Object[] objArr26 = new Object[1];
                                                                                        d(bArr4[54], bArr4[34], bArr4[58], objArr26);
                                                                                        Class<?> cls8 = Class.forName((String) objArr26[0]);
                                                                                        byte b12 = bArr4[1];
                                                                                        int i106 = $$b;
                                                                                        str3 = str2;
                                                                                        Object[] objArr27 = new Object[1];
                                                                                        d(b12, (byte) (i106 | 52), (byte) (-bArr4[35]), objArr27);
                                                                                        cls8.getMethod((String) objArr27[0], null).invoke(objNewInstance, null);
                                                                                        try {
                                                                                            Object[] objArr28 = new Object[1];
                                                                                            d(bArr4[54], bArr4[34], bArr4[58], objArr28);
                                                                                            Class<?> cls9 = Class.forName((String) objArr28[0]);
                                                                                            byte b13 = (byte) (-bArr4[35]);
                                                                                            Object[] objArr29 = new Object[1];
                                                                                            d(bArr4[1], (byte) (i106 | 52), b13, objArr29);
                                                                                            cls9.getMethod((String) objArr29[0], null).invoke(objNewInstance2, null);
                                                                                            try {
                                                                                                StringBuilder sb = new StringBuilder();
                                                                                                sb.append(str10);
                                                                                                int size = View.MeasureSpec.getSize(0);
                                                                                                int i107 = (size & 51) + (size | 51);
                                                                                                int i108 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                                                                int i109 = (i12 ^ i108) | (i12 & i108);
                                                                                                int i110 = (i108 * (-405)) + 407 + (((~((-2) | i27)) | (~((i109 & 1) | (i109 ^ 1)))) * (-406));
                                                                                                int i111 = (-2) | i12;
                                                                                                int i112 = (~((i111 & i108) | (i111 ^ i108))) * (-406);
                                                                                                int i113 = (i110 & i112) + (i110 | i112);
                                                                                                int i114 = ~i108;
                                                                                                int i115 = ~((i114 & i27) | (i114 ^ i27));
                                                                                                i21 = ~i27;
                                                                                                Object[] objArr30 = new Object[1];
                                                                                                a(false, i107, i113 + ((i115 | (~((i21 ^ 1) | (i21 & 1)))) * 406), 0 - (~(-(ViewConfiguration.getScrollDefaultDelay() >> 16))), new char[]{0}, objArr30);
                                                                                                sb.append((String) objArr30[0]);
                                                                                                String string = sb.toString();
                                                                                                try {
                                                                                                    Object[] objArr31 = new Object[1];
                                                                                                    c(new int[]{150012101, 276173431, 485838910, 475009858, -48982897, 356022084}, ExpandableListView.getPackedPositionGroup(0L) + 5, objArr31);
                                                                                                    dataOutputStream.write(string.getBytes((String) objArr31[0]));
                                                                                                    dataOutputStream.flush();
                                                                                                    try {
                                                                                                        int[] iArr = {-441113053, 2039563173, 737613754, 824401335, 1373277312, -253298360};
                                                                                                        int i116 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                                                                        int i117 = ((i116 | 5) << 1) - (i116 ^ 5);
                                                                                                        Object[] objArr32 = new Object[1];
                                                                                                        c(iArr, i117, objArr32);
                                                                                                        String str11 = (String) objArr32[0];
                                                                                                        try {
                                                                                                            try {
                                                                                                                Object[] objArr33 = new Object[1];
                                                                                                                c(new int[]{150012101, 276173431, 485838910, 475009858, -48982897, 356022084}, 4 - (~(-(-((Process.getThreadPriority(0) + 20) >> 6)))), objArr33);
                                                                                                                dataOutputStream.write(str11.getBytes((String) objArr33[0]));
                                                                                                                dataOutputStream.flush();
                                                                                                                try {
                                                                                                                    long jNanoTime = System.nanoTime();
                                                                                                                    i20 = i12;
                                                                                                                    try {
                                                                                                                        long nanos = TimeUnit.MILLISECONDS.toNanos(2000L);
                                                                                                                        while (true) {
                                                                                                                            try {
                                                                                                                                processExec.exitValue();
                                                                                                                                i21 = i21;
                                                                                                                                cls = cls;
                                                                                                                                break;
                                                                                                                            } catch (IllegalThreadStateException unused) {
                                                                                                                                if (nanos > 0) {
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            Object[] objArr34 = {Long.valueOf(Math.min(TimeUnit.NANOSECONDS.toMillis(nanos) + 1, 3L))};
                                                                                                                                            byte[] bArr5 = $$a;
                                                                                                                                            Object[] objArr35 = new Object[1];
                                                                                                                                            d(bArr5[54], bArr5[34], bArr5[58], objArr35);
                                                                                                                                            Class<?> cls10 = Class.forName((String) objArr35[0]);
                                                                                                                                            Object[] objArr36 = new Object[1];
                                                                                                                                            d(bArr5[1], (byte) ($$b | 56), (byte) (-bArr5[35]), objArr36);
                                                                                                                                            cls10.getMethod((String) objArr36[0], Long.TYPE).invoke(null, objArr34);
                                                                                                                                        } catch (Throwable th9) {
                                                                                                                                            Throwable cause5 = th9.getCause();
                                                                                                                                            if (cause5 != null) {
                                                                                                                                                throw cause5;
                                                                                                                                            }
                                                                                                                                            throw th9;
                                                                                                                                        }
                                                                                                                                    } catch (InterruptedException e2) {
                                                                                                                                        e = e2;
                                                                                                                                        interruptedException = e;
                                                                                                                                        throw interruptedException;
                                                                                                                                    } catch (Throwable th10) {
                                                                                                                                        th = th10;
                                                                                                                                        th4 = th;
                                                                                                                                        try {
                                                                                                                                            processExec.destroy();
                                                                                                                                            throw th4;
                                                                                                                                        } catch (Exception unused2) {
                                                                                                                                            throw th4;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                try {
                                                                                                                                    nanos = TimeUnit.MILLISECONDS.toNanos(2000L) - (System.nanoTime() - jNanoTime);
                                                                                                                                    if (nanos <= 0) {
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    cls = cls;
                                                                                                                                    i21 = i21;
                                                                                                                                } catch (InterruptedException e3) {
                                                                                                                                    e = e3;
                                                                                                                                    throw e;
                                                                                                                                } catch (Throwable th11) {
                                                                                                                                    th = th11;
                                                                                                                                    th4 = th;
                                                                                                                                    processExec.destroy();
                                                                                                                                    throw th4;
                                                                                                                                }
                                                                                                                            } catch (InterruptedException e4) {
                                                                                                                                interruptedException = e4;
                                                                                                                                throw interruptedException;
                                                                                                                            } catch (Throwable th12) {
                                                                                                                                th4 = th12;
                                                                                                                                processExec.destroy();
                                                                                                                                throw th4;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                dataOutputStream.close();
                                                                                                                            } catch (IOException unused3) {
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    byte[] bArr6 = $$a;
                                                                                                                                    Object[] objArr37 = new Object[1];
                                                                                                                                    d(bArr6[54], bArr6[34], bArr6[58], objArr37);
                                                                                                                                    Class<?> cls11 = Class.forName((String) objArr37[0]);
                                                                                                                                    byte b14 = bArr6[28];
                                                                                                                                    Object[] objArr38 = new Object[1];
                                                                                                                                    d(b14, (byte) (b14 | 62), bArr6[58], objArr38);
                                                                                                                                    cls11.getMethod((String) objArr38[0], Long.TYPE).invoke(objNewInstance, 100L);
                                                                                                                                    try {
                                                                                                                                        Object[] objArr39 = new Object[1];
                                                                                                                                        d(bArr6[54], bArr6[34], bArr6[58], objArr39);
                                                                                                                                        Class<?> cls12 = Class.forName((String) objArr39[0]);
                                                                                                                                        byte b15 = bArr6[28];
                                                                                                                                        Object[] objArr40 = new Object[1];
                                                                                                                                        d(b15, (byte) (b15 | 62), bArr6[58], objArr40);
                                                                                                                                        cls12.getMethod((String) objArr40[0], Long.TYPE).invoke(objNewInstance2, 10L);
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    try {
                                                                                                                                                        processExec.destroy();
                                                                                                                                                        while (true) {
                                                                                                                                                            if (i22 < length2) {
                                                                                                                                                                str4 = strArrSplit2[i22];
                                                                                                                                                                int i118 = -TextUtils.indexOf("", "", 0, 0);
                                                                                                                                                                int i119 = ~(((-137) & i21) | ((-137) ^ i21));
                                                                                                                                                                int i120 = ~(((-137) ^ i118) | ((-137) & i118));
                                                                                                                                                                int i121 = i119 | i120;
                                                                                                                                                                int i122 = ~((i21 ^ i118) | (i21 & i118));
                                                                                                                                                                int i123 = (i121 & i122) | (i121 ^ i122);
                                                                                                                                                                int i124 = ~i118;
                                                                                                                                                                int i125 = (i124 & 136) | (i124 ^ 136);
                                                                                                                                                                int i126 = ~((i125 & i27) | (i125 ^ i27));
                                                                                                                                                                int i127 = (i118 * (-589)) + 80376 + (((i126 & i123) | (i123 ^ i126)) * 590);
                                                                                                                                                                int i128 = ~(((-137) ^ i21) | ((-137) & i21));
                                                                                                                                                                int i129 = (i128 & i120) | (i128 ^ i120);
                                                                                                                                                                int i130 = ~((i118 & i20) | (i20 ^ i118));
                                                                                                                                                                int i131 = -(-(((i129 & i130) | (i129 ^ i130)) * (-1180)));
                                                                                                                                                                int i132 = ((i127 | i131) << 1) - (i131 ^ i127);
                                                                                                                                                                int i133 = ~((i124 ^ i20) | (i124 & i20));
                                                                                                                                                                int i134 = ~((i20 ^ 136) | (i20 & 136));
                                                                                                                                                                int i135 = i132 + (((i133 & i134) | (i133 ^ i134)) * 590);
                                                                                                                                                                int i136 = -TextUtils.getOffsetAfter("", 0);
                                                                                                                                                                int i137 = ((i136 | 19) << 1) - (i136 ^ 19);
                                                                                                                                                                int i138 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                                                                                                                                                objArr2 = new Object[1];
                                                                                                                                                                a(false, i135, i137, (i138 ^ 3) + ((i138 & 3) << 1), new char[]{'\r', 6, 65487, 17, 2, 4, '\f', 2, '\b', 6, 65499, 4, 16, 14, 65487, '\b', 16, 16, '\b'}, objArr2);
                                                                                                                                                                if (str4.startsWith((String) objArr2[0])) {
                                                                                                                                                                    str5 = str3;
                                                                                                                                                                } else {
                                                                                                                                                                    objArr3 = new Object[1];
                                                                                                                                                                    a(false, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 137, 19 - (~(-(ViewConfiguration.getScrollDefaultDelay() >> 16))), 4 - (~(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))), new char[]{18, 15, '\t', 4, 65486, 16, 1, 3, 11, 1, 7, 5, 65498, 3, 15, '\r', 65486, 1, 14, 4}, objArr3);
                                                                                                                                                                    if (str4.startsWith((String) objArr3[0])) {
                                                                                                                                                                        str5 = str3;
                                                                                                                                                                    } else {
                                                                                                                                                                        try {
                                                                                                                                                                            int i139 = -(-Color.argb(0, 0, 0, 0));
                                                                                                                                                                            objArr4 = new Object[1];
                                                                                                                                                                            c(new int[]{738774753, 1289176970, -1359309921, -153858812, 1667367508, 149950335}, (i139 & 8) + (i139 | 8), objArr4);
                                                                                                                                                                            if (str4.startsWith((String) objArr4[0])) {
                                                                                                                                                                                int i140 = -(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                                                                                                                                                                int i141 = (i140 & 1) + (i140 | 1);
                                                                                                                                                                                Object[] objArr41 = new Object[1];
                                                                                                                                                                                c(new int[]{1117358631, -212050713, -1160910769, 307695443}, i141, objArr41);
                                                                                                                                                                                strArrSplit3 = str4.split((String) objArr41[0]);
                                                                                                                                                                                if (strArrSplit3.length > 1) {
                                                                                                                                                                                    str5 = str3;
                                                                                                                                                                                    if (strArrSplit3[1].equalsIgnoreCase(str5)) {
                                                                                                                                                                                        int i142 = i27 ^ i5;
                                                                                                                                                                                        int i143 = -i142;
                                                                                                                                                                                        int i144 = ((i142 & i143) | (i142 ^ i143)) >> 31;
                                                                                                                                                                                        int i145 = ((i27 & (-21)) | ((~i27) & 20)) & (~i144);
                                                                                                                                                                                        int i146 = i5 & i144;
                                                                                                                                                                                        i5 = (i145 & i146) | (i145 ^ i146);
                                                                                                                                                                                    }
                                                                                                                                                                                } else {
                                                                                                                                                                                    str5 = str3;
                                                                                                                                                                                }
                                                                                                                                                                            } else {
                                                                                                                                                                                str5 = str3;
                                                                                                                                                                            }
                                                                                                                                                                        } catch (IOException unused4) {
                                                                                                                                                                            i5 = i5;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                i22 = (i22 ^ (-53)) + ((i22 & (-53)) << 1) + 54;
                                                                                                                                                                str3 = str5;
                                                                                                                                                            }
                                                                                                                                                            i18 = (i19 & (-101)) + (i19 | (-101)) + 102;
                                                                                                                                                            i12 = i20;
                                                                                                                                                            strArrSplit = strArrSplit;
                                                                                                                                                            length = length;
                                                                                                                                                            obj5 = obj5;
                                                                                                                                                        }
                                                                                                                                                    } catch (Throwable th13) {
                                                                                                                                                        th = th13;
                                                                                                                                                        Throwable th14 = th;
                                                                                                                                                        throw th14;
                                                                                                                                                    }
                                                                                                                                                } catch (IOException unused5) {
                                                                                                                                                }
                                                                                                                                            } catch (Exception unused6) {
                                                                                                                                            }
                                                                                                                                            StringBuilder sb2 = new StringBuilder();
                                                                                                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                                                                                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                                                                                                                char c2 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                                                                                                                int i147 = 2143 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                                                                                                                int offsetBefore = 45 - TextUtils.getOffsetBefore("", 0);
                                                                                                                                                byte b16 = $$d[7];
                                                                                                                                                byte b17 = (byte) (b16 - 1);
                                                                                                                                                byte b18 = b16;
                                                                                                                                                Object[] objArr42 = new Object[1];
                                                                                                                                                e(b17, b18, b18, objArr42);
                                                                                                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, i147, offsetBefore, 399405187, false, (String) objArr42[0], null);
                                                                                                                                            }
                                                                                                                                            sb2.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(objNewInstance).toString());
                                                                                                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                                                                                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                                                                                                                char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                                                                                                                                                int iIndexOf4 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2143;
                                                                                                                                                int i148 = 46 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                                                                                                                byte b19 = $$d[7];
                                                                                                                                                byte b20 = (byte) (b19 - 1);
                                                                                                                                                byte b21 = b19;
                                                                                                                                                Object[] objArr43 = new Object[1];
                                                                                                                                                e(b20, b21, b21, objArr43);
                                                                                                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(bitsPerPixel, iIndexOf4, i148, 399405187, false, (String) objArr43[0], null);
                                                                                                                                            }
                                                                                                                                            sb2.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(objNewInstance2).toString());
                                                                                                                                            String string2 = sb2.toString();
                                                                                                                                            int iIndexOf5 = TextUtils.indexOf("", "", 0);
                                                                                                                                            int i149 = iIndexOf5 * (-523);
                                                                                                                                            int i150 = (i149 ^ 13413) + ((i149 & 13413) << 1);
                                                                                                                                            int i151 = ~iIndexOf5;
                                                                                                                                            int i152 = ~((i151 ^ 51) | (i151 & 51));
                                                                                                                                            int i153 = ((-52) ^ iIndexOf5) | ((-52) & iIndexOf5);
                                                                                                                                            int i154 = ~i153;
                                                                                                                                            int i155 = (i152 & i154) | (i152 ^ i154);
                                                                                                                                            int i156 = ~(((-52) ^ i27) | ((-52) & i27));
                                                                                                                                            int i157 = -(-(((i155 & i156) | (i155 ^ i156)) * 262));
                                                                                                                                            int i158 = (i150 ^ i157) + ((i150 & i157) << 1);
                                                                                                                                            int i159 = -(-((~i153) * (-786)));
                                                                                                                                            int i160 = (i158 & i159) + (i159 | i158);
                                                                                                                                            int i161 = ~(((-52) ^ i20) | ((-52) & i20));
                                                                                                                                            int i162 = ~(i151 | 51);
                                                                                                                                            int i163 = (i162 & i161) | (i161 ^ i162);
                                                                                                                                            int i164 = ~((iIndexOf5 & (-52)) | ((-52) ^ iIndexOf5));
                                                                                                                                            int i165 = ((i164 & i163) | (i163 ^ i164)) * 262;
                                                                                                                                            int i166 = ((i160 | i165) << 1) - (i165 ^ i160);
                                                                                                                                            int capsMode = TextUtils.getCapsMode("", 0, 0);
                                                                                                                                            int i167 = capsMode * (-755);
                                                                                                                                            int i168 = (i167 ^ (-755)) + ((i167 & (-755)) << 1);
                                                                                                                                            int i169 = (~((~capsMode) | (-2))) * 1512;
                                                                                                                                            int i170 = (i168 ^ i169) + ((i169 & i168) << 1);
                                                                                                                                            int i171 = ~capsMode;
                                                                                                                                            int i172 = ~((i171 & (-2)) | (i171 ^ (-2)));
                                                                                                                                            int i173 = (capsMode & 1) | (capsMode ^ 1);
                                                                                                                                            int i174 = ~((i173 ^ i27) | (i173 & i27));
                                                                                                                                            int i175 = (i170 - (~(-(-(((i172 & i174) | (i172 ^ i174)) * (-756)))))) - 1;
                                                                                                                                            int i176 = -(-(((i173 & i20) | (i173 ^ i20)) * 756));
                                                                                                                                            Object[] objArr44 = new Object[1];
                                                                                                                                            a(false, i166, (i176 | i175) + (i175 & i176), (ViewConfiguration.getScrollBarSize() >> 8) + 1, new char[]{0}, objArr44);
                                                                                                                                            strArrSplit2 = string2.split((String) objArr44[0]);
                                                                                                                                            length2 = strArrSplit2.length;
                                                                                                                                            i22 = 0;
                                                                                                                                        } catch (Exception unused7) {
                                                                                                                                            int i177 = -Color.argb(0, 0, 0, 0);
                                                                                                                                            int i178 = -(ViewConfiguration.getScrollBarSize() >> 8);
                                                                                                                                            int i179 = ~i27;
                                                                                                                                            int i180 = (i179 & (-28)) | ((-28) ^ i179);
                                                                                                                                            int i181 = ((((i178 * (-129)) + 3537) - (~(-(-((~((i180 & i178) | (i180 ^ i178))) * 130))))) - 1) + ((~(((-28) ^ i178) | ((-28) & i178))) * (-260));
                                                                                                                                            int i182 = ~i178;
                                                                                                                                            int i183 = ~((i182 & 27) | (i182 ^ 27));
                                                                                                                                            int i184 = i178 | (-28);
                                                                                                                                            int i185 = ~((i184 & i27) | (i184 ^ i27));
                                                                                                                                            int i186 = (i181 - (~(-(-(((i185 & i183) | (i183 ^ i185)) * 130))))) - 1;
                                                                                                                                            int i187 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                                                                                                                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                                                                                                                            int i188 = i187 * (-949);
                                                                                                                                            int i189 = (i188 & (-25623)) + (i188 | (-25623));
                                                                                                                                            int i190 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                                                                                                                            int i191 = ~((i190 & (-28)) | ((-28) ^ i190));
                                                                                                                                            int i192 = ~((~i187) | iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                                                                                                                                            int i193 = -(-(((i191 & i192) | (i191 ^ i192)) * 1900));
                                                                                                                                            int i194 = ((i189 | i193) << 1) - (i193 ^ i189);
                                                                                                                                            int i195 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                                                                                                                            int i196 = ~((i195 ^ i187) | (i195 & i187));
                                                                                                                                            int i197 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault4 ^ 27) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault4 & 27));
                                                                                                                                            int i198 = -(-(((i196 & i197) | (i196 ^ i197)) * (-950)));
                                                                                                                                            int i199 = (i194 ^ i198) + ((i198 & i194) << 1);
                                                                                                                                            int i200 = ~((i195 & 27) | (i195 ^ 27));
                                                                                                                                            int i201 = ~((i187 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i187 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                                                                                                                            Object[] objArr45 = new Object[1];
                                                                                                                                            a(true, ((i177 & 132) << 1) + (i177 ^ 132), i186, i199 + (((i201 & i200) | (i200 ^ i201)) * 950), new char[]{65491, 24, 24, '\n', '\b', 20, 23, 21, 65477, 6, 65477, '\n', 25, 6, '\n', 23, '\b', 65477, 20, 25, 65477, '\t', '\n', 17, 14, 6, 65515}, objArr45);
                                                                                                                                            throw new IOException((String) objArr45[0]);
                                                                                                                                        }
                                                                                                                                    } catch (Throwable th15) {
                                                                                                                                        Throwable cause6 = th15.getCause();
                                                                                                                                        if (cause6 != null) {
                                                                                                                                            throw cause6;
                                                                                                                                        }
                                                                                                                                        throw th15;
                                                                                                                                    }
                                                                                                                                } catch (Throwable th16) {
                                                                                                                                    Throwable cause7 = th16.getCause();
                                                                                                                                    if (cause7 != null) {
                                                                                                                                        throw cause7;
                                                                                                                                    }
                                                                                                                                    throw th16;
                                                                                                                                }
                                                                                                                            } catch (InterruptedException e5) {
                                                                                                                                e = e5;
                                                                                                                                throw e;
                                                                                                                            }
                                                                                                                        } catch (InterruptedException e6) {
                                                                                                                            e = e6;
                                                                                                                            interruptedException = e;
                                                                                                                            throw interruptedException;
                                                                                                                        } catch (Throwable th17) {
                                                                                                                            th = th17;
                                                                                                                            th4 = th;
                                                                                                                            processExec.destroy();
                                                                                                                            throw th4;
                                                                                                                        }
                                                                                                                    } catch (InterruptedException e7) {
                                                                                                                        e = e7;
                                                                                                                    } catch (Throwable th18) {
                                                                                                                        th = th18;
                                                                                                                    }
                                                                                                                } catch (InterruptedException e8) {
                                                                                                                    e = e8;
                                                                                                                } catch (Throwable th19) {
                                                                                                                    th = th19;
                                                                                                                }
                                                                                                            } catch (Throwable th20) {
                                                                                                                th = th20;
                                                                                                            }
                                                                                                        } catch (IOException unused8) {
                                                                                                            cls = cls;
                                                                                                            i20 = i12;
                                                                                                        } catch (Exception unused9) {
                                                                                                            int i1710 = -Color.argb(0, 0, 0, 0);
                                                                                                            int i1711 = -(ViewConfiguration.getScrollBarSize() >> 8);
                                                                                                            int i1712 = ~i27;
                                                                                                            int i1810 = (i1712 & (-28)) | ((-28) ^ i1712);
                                                                                                            int i1811 = ((((i1711 * (-129)) + 3537) - (~(-(-((~((i1810 & i1711) | (i1810 ^ i1711))) * 130))))) - 1) + ((~(((-28) ^ i1711) | ((-28) & i1711))) * (-260));
                                                                                                            int i1812 = ~i1711;
                                                                                                            int i1813 = ~((i1812 & 27) | (i1812 ^ 27));
                                                                                                            int i1814 = i1711 | (-28);
                                                                                                            int i1815 = ~((i1814 & i27) | (i1814 ^ i27));
                                                                                                            int i1816 = (i1811 - (~(-(-(((i1815 & i1813) | (i1813 ^ i1815)) * 130))))) - 1;
                                                                                                            int i1817 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                                                                                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                                                                                            int i1818 = i1817 * (-949);
                                                                                                            int i1819 = (i1818 & (-25623)) + (i1818 | (-25623));
                                                                                                            int i1910 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                                                                                            int i1911 = ~((i1910 & (-28)) | ((-28) ^ i1910));
                                                                                                            int i1912 = ~((~i1817) | iTuitionPaymentFragmentspecialinlinedviewModeldefault5);
                                                                                                            int i1913 = -(-(((i1911 & i1912) | (i1911 ^ i1912)) * 1900));
                                                                                                            int i1914 = ((i1819 | i1913) << 1) - (i1913 ^ i1819);
                                                                                                            int i1915 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                                                                                            int i1916 = ~((i1915 ^ i1817) | (i1915 & i1817));
                                                                                                            int i1917 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault5 ^ 27) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault5 & 27));
                                                                                                            int i1918 = -(-(((i1916 & i1917) | (i1916 ^ i1917)) * (-950)));
                                                                                                            int i1919 = (i1914 ^ i1918) + ((i1918 & i1914) << 1);
                                                                                                            int i202 = ~((i1915 & 27) | (i1915 ^ 27));
                                                                                                            int i203 = ~((i1817 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i1817 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                                                                                                            Object[] objArr46 = new Object[1];
                                                                                                            a(true, ((i1710 & 132) << 1) + (i1710 ^ 132), i1816, i1919 + (((i203 & i202) | (i202 ^ i203)) * 950), new char[]{65491, 24, 24, '\n', '\b', 20, 23, 21, 65477, 6, 65477, '\n', 25, 6, '\n', 23, '\b', 65477, 20, 25, 65477, '\t', '\n', 17, 14, 6, 65515}, objArr46);
                                                                                                            throw new IOException((String) objArr46[0]);
                                                                                                        }
                                                                                                    } catch (IOException unused10) {
                                                                                                        i20 = i12;
                                                                                                        cls = cls;
                                                                                                    } catch (Exception unused11) {
                                                                                                    }
                                                                                                } catch (IOException unused12) {
                                                                                                    cls = cls;
                                                                                                    i20 = i12;
                                                                                                } catch (Exception unused13) {
                                                                                                }
                                                                                            } catch (IOException unused14) {
                                                                                                cls = cls;
                                                                                                i20 = i12;
                                                                                            } catch (Exception unused15) {
                                                                                                int i1713 = -Color.argb(0, 0, 0, 0);
                                                                                                int i1714 = -(ViewConfiguration.getScrollBarSize() >> 8);
                                                                                                int i1715 = ~i27;
                                                                                                int i18110 = (i1715 & (-28)) | ((-28) ^ i1715);
                                                                                                int i18111 = ((((i1714 * (-129)) + 3537) - (~(-(-((~((i18110 & i1714) | (i18110 ^ i1714))) * 130))))) - 1) + ((~(((-28) ^ i1714) | ((-28) & i1714))) * (-260));
                                                                                                int i18112 = ~i1714;
                                                                                                int i18113 = ~((i18112 & 27) | (i18112 ^ 27));
                                                                                                int i18114 = i1714 | (-28);
                                                                                                int i18115 = ~((i18114 & i27) | (i18114 ^ i27));
                                                                                                int i18116 = (i18111 - (~(-(-(((i18115 & i18113) | (i18113 ^ i18115)) * 130))))) - 1;
                                                                                                int i18117 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                                                                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                                                                                int i18118 = i18117 * (-949);
                                                                                                int i18119 = (i18118 & (-25623)) + (i18118 | (-25623));
                                                                                                int i19110 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                                                                                int i19111 = ~((i19110 & (-28)) | ((-28) ^ i19110));
                                                                                                int i19112 = ~((~i18117) | iTuitionPaymentFragmentspecialinlinedviewModeldefault6);
                                                                                                int i19113 = -(-(((i19111 & i19112) | (i19111 ^ i19112)) * 1900));
                                                                                                int i19114 = ((i18119 | i19113) << 1) - (i19113 ^ i18119);
                                                                                                int i19115 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                                                                                int i19116 = ~((i19115 ^ i18117) | (i19115 & i18117));
                                                                                                int i19117 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault6 ^ 27) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault6 & 27));
                                                                                                int i19118 = -(-(((i19116 & i19117) | (i19116 ^ i19117)) * (-950)));
                                                                                                int i19119 = (i19114 ^ i19118) + ((i19118 & i19114) << 1);
                                                                                                int i204 = ~((i19115 & 27) | (i19115 ^ 27));
                                                                                                int i205 = ~((i18117 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i18117 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                                                                                                Object[] objArr47 = new Object[1];
                                                                                                a(true, ((i1713 & 132) << 1) + (i1713 ^ 132), i18116, i19119 + (((i205 & i204) | (i204 ^ i205)) * 950), new char[]{65491, 24, 24, '\n', '\b', 20, 23, 21, 65477, 6, 65477, '\n', 25, 6, '\n', 23, '\b', 65477, 20, 25, 65477, '\t', '\n', 17, 14, 6, 65515}, objArr47);
                                                                                                throw new IOException((String) objArr47[0]);
                                                                                            }
                                                                                        } catch (Throwable th21) {
                                                                                            Throwable cause8 = th21.getCause();
                                                                                            if (cause8 != null) {
                                                                                                throw cause8;
                                                                                            }
                                                                                            throw th21;
                                                                                        }
                                                                                    } catch (Throwable th22) {
                                                                                        th = th22;
                                                                                        th3 = th;
                                                                                        cause2 = th3.getCause();
                                                                                        if (cause2 != null) {
                                                                                            throw cause2;
                                                                                        }
                                                                                        throw th3;
                                                                                    }
                                                                                } catch (Throwable th23) {
                                                                                    th = th23;
                                                                                    th3 = th;
                                                                                    cause2 = th3.getCause();
                                                                                    if (cause2 != null) {
                                                                                        throw cause2;
                                                                                    }
                                                                                    throw th3;
                                                                                }
                                                                            } catch (Throwable th24) {
                                                                                th = th24;
                                                                            }
                                                                        } catch (Throwable th25) {
                                                                            th2 = th25;
                                                                        }
                                                                    } catch (IOException unused16) {
                                                                        i19 = i18;
                                                                        cls = cls;
                                                                        i20 = i12;
                                                                        i5 = i5;
                                                                        i18 = (i19 & (-101)) + (i19 | (-101)) + 102;
                                                                        i12 = i20;
                                                                        strArrSplit = strArrSplit;
                                                                        length = length;
                                                                        obj5 = obj5;
                                                                    } catch (Exception unused17) {
                                                                        int i1716 = -Color.argb(0, 0, 0, 0);
                                                                        int i1717 = -(ViewConfiguration.getScrollBarSize() >> 8);
                                                                        int i1718 = ~i27;
                                                                        int i181110 = (i1718 & (-28)) | ((-28) ^ i1718);
                                                                        int i181111 = ((((i1717 * (-129)) + 3537) - (~(-(-((~((i181110 & i1717) | (i181110 ^ i1717))) * 130))))) - 1) + ((~(((-28) ^ i1717) | ((-28) & i1717))) * (-260));
                                                                        int i181112 = ~i1717;
                                                                        int i181113 = ~((i181112 & 27) | (i181112 ^ 27));
                                                                        int i181114 = i1717 | (-28);
                                                                        int i181115 = ~((i181114 & i27) | (i181114 ^ i27));
                                                                        int i181116 = (i181111 - (~(-(-(((i181115 & i181113) | (i181113 ^ i181115)) * 130))))) - 1;
                                                                        int i181117 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                                                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                                                        int i181118 = i181117 * (-949);
                                                                        int i181119 = (i181118 & (-25623)) + (i181118 | (-25623));
                                                                        int i191110 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                                                                        int i191111 = ~((i191110 & (-28)) | ((-28) ^ i191110));
                                                                        int i191112 = ~((~i181117) | iTuitionPaymentFragmentspecialinlinedviewModeldefault7);
                                                                        int i191113 = -(-(((i191111 & i191112) | (i191111 ^ i191112)) * 1900));
                                                                        int i191114 = ((i181119 | i191113) << 1) - (i191113 ^ i181119);
                                                                        int i191115 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                                                                        int i191116 = ~((i191115 ^ i181117) | (i191115 & i181117));
                                                                        int i191117 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault7 ^ 27) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault7 & 27));
                                                                        int i191118 = -(-(((i191116 & i191117) | (i191116 ^ i191117)) * (-950)));
                                                                        int i191119 = (i191114 ^ i191118) + ((i191118 & i191114) << 1);
                                                                        int i206 = ~((i191115 & 27) | (i191115 ^ 27));
                                                                        int i207 = ~((i181117 & iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | (i181117 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
                                                                        Object[] objArr48 = new Object[1];
                                                                        a(true, ((i1716 & 132) << 1) + (i1716 ^ 132), i181116, i191119 + (((i207 & i206) | (i206 ^ i207)) * 950), new char[]{65491, 24, 24, '\n', '\b', 20, 23, 21, 65477, 6, 65477, '\n', 25, 6, '\n', 23, '\b', 65477, 20, 25, 65477, '\t', '\n', 17, 14, 6, 65515}, objArr48);
                                                                        throw new IOException((String) objArr48[0]);
                                                                    }
                                                                } catch (Throwable th26) {
                                                                    th = th26;
                                                                    th = th;
                                                                    cause = th.getCause();
                                                                    if (cause != null) {
                                                                        throw cause;
                                                                    }
                                                                    throw th;
                                                                }
                                                            } catch (Throwable th27) {
                                                                th = th27;
                                                            }
                                                        } catch (Exception unused18) {
                                                        }
                                                    } catch (Exception unused19) {
                                                    }
                                                } catch (Throwable th28) {
                                                    th = th28;
                                                    cls = cls;
                                                }
                                            } catch (IOException unused20) {
                                                strArrSplit = strArrSplit;
                                                length = length;
                                            }
                                        }
                                    } else {
                                        i5 = i5;
                                        strArrSplit = strArrSplit;
                                        obj5 = obj5;
                                        length = length;
                                        i19 = i18;
                                        i20 = i12;
                                    }
                                    i5 = i5;
                                    i18 = (i19 & (-101)) + (i19 | (-101)) + 102;
                                    i12 = i20;
                                    strArrSplit = strArrSplit;
                                    length = length;
                                    obj5 = obj5;
                                }
                                obj = obj5;
                            } else {
                                i8 = iIndexOf;
                                obj2 = objInvoke;
                                i9 = 0;
                                i10 = i27 ^ 20;
                                int i710 = -i9;
                                int i711 = ((i9 & i710) | (i9 ^ i710)) >> 31;
                                int i712 = (~i711) & i27;
                                int i713 = i711 & i10;
                                i11 = (i713 & i712) | (i712 ^ i713);
                                byte b22 = (byte) ($$b | 28);
                                byte[] bArr7 = $$a;
                                byte b23 = bArr7[28];
                                Object[] objArr110 = new Object[1];
                                d(b22, b23, b23, objArr110);
                                Class<?> cls13 = Class.forName((String) objArr110[0]);
                                Object[] objArr111 = new Object[1];
                                d(bArr7[58], (byte) (bArr7[0] + 1), bArr7[1], objArr111);
                                obj3 = obj2;
                                str = (String) cls13.getField((String) objArr111[0]).get(obj3);
                                int length5 = str.length();
                                int i810 = (~length5) | 5;
                                i12 = ~i27;
                                int i811 = ~((i810 & i12) | (i810 ^ i12));
                                int i812 = ~((-6) | length5 | i27);
                                int i813 = (((-1638) + (length5 * (-271))) - (~(-(-(((i811 & i812) | (i811 ^ i812)) * (-272)))))) - 1;
                                int i814 = ~((5 ^ length5) | (5 & length5));
                                int i815 = ~((5 ^ i27) | (5 & i27));
                                int i816 = ((i814 & i815) | (i814 ^ i815)) * (-272);
                                int i817 = ((i813 | i816) << 1) - (i816 ^ i813);
                                int i818 = ~((-6) | i27);
                                int i819 = i817 - (~(((length5 & i818) | (length5 ^ i818)) * 272));
                                i13 = 1;
                                i14 = i819 - 1;
                                if (i14 >= 0) {
                                    i15 = i11;
                                    i16 = i10;
                                    obj4 = obj3;
                                    i17 = 0;
                                    break;
                                }
                                i23 = 0;
                                while (true) {
                                    if (i23 <= i14) {
                                        i15 = i11;
                                        i16 = i10;
                                        obj4 = obj3;
                                        i17 = 0;
                                        break;
                                    }
                                    String strSubstring4 = str.substring(i23, ((i23 | 6) << i13) - (i23 ^ 6));
                                    Object[] objArr112 = new Object[2];
                                    objArr112[i13] = 931995;
                                    objArr112[0] = strSubstring4;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                        char c3 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                        int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 3393;
                                        int iIndexOf6 = TextUtils.indexOf((CharSequence) "", '0', 0) + 10;
                                        byte b24 = (byte) ($$e & 14);
                                        byte b25 = $$d[7];
                                        Object[] objArr113 = new Object[1];
                                        e(b24, b25, (byte) (b25 - 1), objArr113);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c3, touchSlop2, iIndexOf6, 1203525406, false, (String) objArr113[0], new Class[]{String.class, Integer.TYPE});
                                    }
                                    long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr112)).longValue();
                                    long j19 = 800869393;
                                    long j110 = (((long) (-589)) * j19) + (((long) 591) * jLongValue3);
                                    long j111 = 590;
                                    i15 = i11;
                                    i16 = i10;
                                    long j112 = -1;
                                    long j113 = jLongValue3 ^ j112;
                                    obj4 = obj3;
                                    i24 = i23;
                                    long j114 = i27;
                                    long j115 = j114 ^ j112;
                                    long j116 = ((j113 | j115) ^ j112) | ((j113 | j19) ^ j112) | ((j115 | j19) ^ j112);
                                    long j117 = j19 ^ j112;
                                    long j118 = j110 + ((j116 | (((j117 | jLongValue3) | j114) ^ j112)) * j111) + (((long) (-1180)) * j116) + (j111 * ((j112 ^ (j115 | jLongValue3)) | ((j117 | j115) ^ j112))) + ((long) (-802939270));
                                    int i910 = ~i27;
                                    i25 = ((int) (j118 >> 32)) & (635053406 + (((~((-1473093688) | i910)) | (~(35867276 | i27))) * (-370)) + (((~(i910 | 35867276)) | (~((-1473093688) | i27)) | 2247304) * (-370)) + 831502480);
                                    int i911 = ~((~((int) Process.getStartElapsedRealtime())) | (-1254528421));
                                    i26 = ((int) j118) & (((2179073 | i911) * (-374)) + 1234914383 + ((i911 | (-1256707494)) * 374));
                                    if (((i25 & i26) | (i25 ^ i26)) == -2096167706) {
                                        i17 = 1;
                                        break;
                                    }
                                    i23 = i24 + 1;
                                    str = str;
                                    i14 = i14;
                                    i10 = i16;
                                    i11 = i15;
                                    obj3 = obj4;
                                    i13 = 1;
                                }
                                int i912 = -i17;
                                int i913 = ((i17 & i912) | (i17 ^ i912)) >> 31;
                                int i914 = (~i913) & i27;
                                int i915 = i16 & i913;
                                int i916 = (i915 & i914) | (i914 ^ i915);
                                int i917 = i27 ^ i15;
                                int i918 = -i917;
                                int i919 = ((i917 & i918) | (i917 ^ i918)) >> 31;
                                int i1010 = i916 & (~i919);
                                int i1011 = i15 & i919;
                                i5 = (i1010 & i1011) | (i1010 ^ i1011);
                                byte b110 = (byte) ($$b | 28);
                                byte[] bArr8 = $$a;
                                byte b111 = bArr8[28];
                                Object[] objArr114 = new Object[1];
                                d(b110, b111, b111, objArr114);
                                Class<?> cls14 = Class.forName((String) objArr114[0]);
                                Object[] objArr210 = new Object[1];
                                d(bArr8[58], (byte) (bArr8[0] + 1), bArr8[1], objArr210);
                                Field field2 = cls14.getField((String) objArr210[0]);
                                obj5 = obj4;
                                int i1012 = i8 ^ (-1);
                                int i1013 = -i1012;
                                String strSubstring5 = ((String) field2.get(obj5)).substring(0, i8 & (((i1012 & i1013) | (i1012 ^ i1013)) >> 31));
                                Object[] objArr211 = new Object[1];
                                c(new int[]{433081423, 1518344654, 635466386, 531098248}, View.resolveSizeAndState(0, 0, 0) + 1, objArr211);
                                strArrSplit = strSubstring5.split((String) objArr211[0]);
                                length = strArrSplit.length;
                                i18 = 0;
                                while (i18 < length) {
                                    str2 = strArrSplit[i18];
                                    objArr = new Object[1];
                                    c(new int[]{1605383420, -1365102120, 473917954, -2113939256}, Color.alpha(0) + 3, objArr);
                                    if (str2.split((String) objArr[0]).length > 1) {
                                        cls = (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ExpandableListView.getPackedPositionType(0L), 2267 - TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getTapTimeout() >> 16) + 33);
                                        synchronized (cls) {
                                            Object[] objArr212 = new Object[1];
                                            a(true, 138 - (ViewConfiguration.getEdgeSlop() >> 16), 17 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 13 - (~(-(-TextUtils.getOffsetBefore("", 0)))), new char[]{6, 0, '\n', 2, 0, 15, 65471, 19, 18, '\b', 11, 65471, '\f', 15, 18, 4}, objArr212);
                                            String str12 = (String) objArr212[0];
                                            Runtime runtime2 = Runtime.getRuntime();
                                            int i1014 = -(-TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                                            int i1015 = (i1014 ^ 3) + ((i1014 & 3) << 1);
                                            Object[] objArr213 = new Object[1];
                                            c(new int[]{-447374343, 1495396943, 1821958054, -852443680}, i1015, objArr213);
                                            processExec = runtime2.exec((String) objArr213[0], (String[]) null, (File) null);
                                            Object[] objArr214 = {processExec.getInputStream()};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), ExpandableListView.getPackedPositionGroup(0L) + 2142, TextUtils.lastIndexOf("", '0', 0, 0) + 46, -1020714777, false, null, new Class[]{InputStream.class});
                                            }
                                            Object objNewInstance3 = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr214);
                                            Object[] objArr215 = {processExec.getErrorStream()};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) View.getDefaultSize(0, 0), 2143 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 45 - (ViewConfiguration.getLongPressTimeout() >> 16), -1020714777, false, null, new Class[]{InputStream.class});
                                            }
                                            Object objNewInstance4 = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr215);
                                            DataOutputStream dataOutputStream2 = new DataOutputStream(processExec.getOutputStream());
                                            byte[] bArr9 = $$a;
                                            obj5 = obj5;
                                            i5 = i5;
                                            i19 = i18;
                                            Object[] objArr216 = new Object[1];
                                            d(bArr9[54], bArr9[34], bArr9[58], objArr216);
                                            Class<?> cls15 = Class.forName((String) objArr216[0]);
                                            byte b112 = bArr9[1];
                                            int i1016 = $$b;
                                            str3 = str2;
                                            Object[] objArr217 = new Object[1];
                                            d(b112, (byte) (i1016 | 52), (byte) (-bArr9[35]), objArr217);
                                            cls15.getMethod((String) objArr217[0], null).invoke(objNewInstance3, null);
                                            Object[] objArr218 = new Object[1];
                                            d(bArr9[54], bArr9[34], bArr9[58], objArr218);
                                            Class<?> cls16 = Class.forName((String) objArr218[0]);
                                            byte b113 = (byte) (-bArr9[35]);
                                            Object[] objArr219 = new Object[1];
                                            d(bArr9[1], (byte) (i1016 | 52), b113, objArr219);
                                            cls16.getMethod((String) objArr219[0], null).invoke(objNewInstance4, null);
                                            StringBuilder sb3 = new StringBuilder();
                                            sb3.append(str12);
                                            int size2 = View.MeasureSpec.getSize(0);
                                            int i1017 = (size2 & 51) + (size2 | 51);
                                            int i1018 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                            int i1019 = (i12 ^ i1018) | (i12 & i1018);
                                            int i1110 = (i1018 * (-405)) + 407 + (((~((-2) | i27)) | (~((i1019 & 1) | (i1019 ^ 1)))) * (-406));
                                            int i1111 = (-2) | i12;
                                            int i1112 = (~((i1111 & i1018) | (i1111 ^ i1018))) * (-406);
                                            int i1113 = (i1110 & i1112) + (i1110 | i1112);
                                            int i1114 = ~i1018;
                                            int i1115 = ~((i1114 & i27) | (i1114 ^ i27));
                                            i21 = ~i27;
                                            Object[] objArr310 = new Object[1];
                                            a(false, i1017, i1113 + ((i1115 | (~((i21 ^ 1) | (i21 & 1)))) * 406), 0 - (~(-(ViewConfiguration.getScrollDefaultDelay() >> 16))), new char[]{0}, objArr310);
                                            sb3.append((String) objArr310[0]);
                                            String string3 = sb3.toString();
                                            Object[] objArr311 = new Object[1];
                                            c(new int[]{150012101, 276173431, 485838910, 475009858, -48982897, 356022084}, ExpandableListView.getPackedPositionGroup(0L) + 5, objArr311);
                                            dataOutputStream2.write(string3.getBytes((String) objArr311[0]));
                                            dataOutputStream2.flush();
                                            int[] iArr2 = {-441113053, 2039563173, 737613754, 824401335, 1373277312, -253298360};
                                            int i1116 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                            int i1117 = ((i1116 | 5) << 1) - (i1116 ^ 5);
                                            Object[] objArr312 = new Object[1];
                                            c(iArr2, i1117, objArr312);
                                            String str13 = (String) objArr312[0];
                                            Object[] objArr313 = new Object[1];
                                            c(new int[]{150012101, 276173431, 485838910, 475009858, -48982897, 356022084}, 4 - (~(-(-((Process.getThreadPriority(0) + 20) >> 6)))), objArr313);
                                            dataOutputStream2.write(str13.getBytes((String) objArr313[0]));
                                            dataOutputStream2.flush();
                                            long jNanoTime2 = System.nanoTime();
                                            i20 = i12;
                                            long nanos2 = TimeUnit.MILLISECONDS.toNanos(2000L);
                                            while (true) {
                                                processExec.exitValue();
                                                i21 = i21;
                                                cls = cls;
                                                break;
                                            }
                                            dataOutputStream2.close();
                                            byte[] bArr10 = $$a;
                                            Object[] objArr314 = new Object[1];
                                            d(bArr10[54], bArr10[34], bArr10[58], objArr314);
                                            Class<?> cls17 = Class.forName((String) objArr314[0]);
                                            byte b114 = bArr10[28];
                                            Object[] objArr315 = new Object[1];
                                            d(b114, (byte) (b114 | 62), bArr10[58], objArr315);
                                            cls17.getMethod((String) objArr315[0], Long.TYPE).invoke(objNewInstance3, 100L);
                                            Object[] objArr316 = new Object[1];
                                            d(bArr10[54], bArr10[34], bArr10[58], objArr316);
                                            Class<?> cls18 = Class.forName((String) objArr316[0]);
                                            byte b115 = bArr10[28];
                                            Object[] objArr49 = new Object[1];
                                            d(b115, (byte) (b115 | 62), bArr10[58], objArr49);
                                            cls18.getMethod((String) objArr49[0], Long.TYPE).invoke(objNewInstance4, 10L);
                                            processExec.destroy();
                                            StringBuilder sb4 = new StringBuilder();
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char c4 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                int i1410 = 2143 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                int offsetBefore2 = 45 - TextUtils.getOffsetBefore("", 0);
                                                byte b116 = $$d[7];
                                                byte b117 = (byte) (b116 - 1);
                                                byte b118 = b116;
                                                Object[] objArr410 = new Object[1];
                                                e(b117, b118, b118, objArr410);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c4, i1410, offsetBefore2, 399405187, false, (String) objArr410[0], null);
                                            }
                                            sb4.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(objNewInstance3).toString());
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                char bitsPerPixel2 = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                                                int iIndexOf7 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2143;
                                                int i1411 = 46 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                byte b119 = $$d[7];
                                                byte b26 = (byte) (b119 - 1);
                                                byte b27 = b119;
                                                Object[] objArr411 = new Object[1];
                                                e(b26, b27, b27, objArr411);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(bitsPerPixel2, iIndexOf7, i1411, 399405187, false, (String) objArr411[0], null);
                                            }
                                            sb4.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(objNewInstance4).toString());
                                            String string4 = sb4.toString();
                                            int iIndexOf8 = TextUtils.indexOf("", "", 0);
                                            int i1412 = iIndexOf8 * (-523);
                                            int i1510 = (i1412 ^ 13413) + ((i1412 & 13413) << 1);
                                            int i1511 = ~iIndexOf8;
                                            int i1512 = ~((i1511 ^ 51) | (i1511 & 51));
                                            int i1513 = ((-52) ^ iIndexOf8) | ((-52) & iIndexOf8);
                                            int i1514 = ~i1513;
                                            int i1515 = (i1512 & i1514) | (i1512 ^ i1514);
                                            int i1516 = ~(((-52) ^ i27) | ((-52) & i27));
                                            int i1517 = -(-(((i1515 & i1516) | (i1515 ^ i1516)) * 262));
                                            int i1518 = (i1510 ^ i1517) + ((i1510 & i1517) << 1);
                                            int i1519 = -(-((~i1513) * (-786)));
                                            int i1610 = (i1518 & i1519) + (i1519 | i1518);
                                            int i1611 = ~(((-52) ^ i20) | ((-52) & i20));
                                            int i1612 = ~(i1511 | 51);
                                            int i1613 = (i1612 & i1611) | (i1611 ^ i1612);
                                            int i1614 = ~((iIndexOf8 & (-52)) | ((-52) ^ iIndexOf8));
                                            int i1615 = ((i1614 & i1613) | (i1613 ^ i1614)) * 262;
                                            int i1616 = ((i1610 | i1615) << 1) - (i1615 ^ i1610);
                                            int capsMode2 = TextUtils.getCapsMode("", 0, 0);
                                            int i1617 = capsMode2 * (-755);
                                            int i1618 = (i1617 ^ (-755)) + ((i1617 & (-755)) << 1);
                                            int i1619 = (~((~capsMode2) | (-2))) * 1512;
                                            int i1719 = (i1618 ^ i1619) + ((i1619 & i1618) << 1);
                                            int i1720 = ~capsMode2;
                                            int i1721 = ~((i1720 & (-2)) | (i1720 ^ (-2)));
                                            int i1722 = (capsMode2 & 1) | (capsMode2 ^ 1);
                                            int i1723 = ~((i1722 ^ i27) | (i1722 & i27));
                                            int i1724 = (i1719 - (~(-(-(((i1721 & i1723) | (i1721 ^ i1723)) * (-756)))))) - 1;
                                            int i1725 = -(-(((i1722 & i20) | (i1722 ^ i20)) * 756));
                                            Object[] objArr412 = new Object[1];
                                            a(false, i1616, (i1725 | i1724) + (i1724 & i1725), (ViewConfiguration.getScrollBarSize() >> 8) + 1, new char[]{0}, objArr412);
                                            strArrSplit2 = string4.split((String) objArr412[0]);
                                            length2 = strArrSplit2.length;
                                            i22 = 0;
                                            while (true) {
                                                if (i22 < length2) {
                                                    str4 = strArrSplit2[i22];
                                                    int i1118 = -TextUtils.indexOf("", "", 0, 0);
                                                    int i1119 = ~(((-137) & i21) | ((-137) ^ i21));
                                                    int i1210 = ~(((-137) ^ i1118) | ((-137) & i1118));
                                                    int i1211 = i1119 | i1210;
                                                    int i1212 = ~((i21 ^ i1118) | (i21 & i1118));
                                                    int i1213 = (i1211 & i1212) | (i1211 ^ i1212);
                                                    int i1214 = ~i1118;
                                                    int i1215 = (i1214 & 136) | (i1214 ^ 136);
                                                    int i1216 = ~((i1215 & i27) | (i1215 ^ i27));
                                                    int i1217 = (i1118 * (-589)) + 80376 + (((i1216 & i1213) | (i1213 ^ i1216)) * 590);
                                                    int i1218 = ~(((-137) ^ i21) | ((-137) & i21));
                                                    int i1219 = (i1218 & i1210) | (i1218 ^ i1210);
                                                    int i1310 = ~((i1118 & i20) | (i20 ^ i1118));
                                                    int i1311 = -(-(((i1219 & i1310) | (i1219 ^ i1310)) * (-1180)));
                                                    int i1312 = ((i1217 | i1311) << 1) - (i1311 ^ i1217);
                                                    int i1313 = ~((i1214 ^ i20) | (i1214 & i20));
                                                    int i1314 = ~((i20 ^ 136) | (i20 & 136));
                                                    int i1315 = i1312 + (((i1313 & i1314) | (i1313 ^ i1314)) * 590);
                                                    int i1316 = -TextUtils.getOffsetAfter("", 0);
                                                    int i1317 = ((i1316 | 19) << 1) - (i1316 ^ 19);
                                                    int i1318 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                                    objArr2 = new Object[1];
                                                    a(false, i1315, i1317, (i1318 ^ 3) + ((i1318 & 3) << 1), new char[]{'\r', 6, 65487, 17, 2, 4, '\f', 2, '\b', 6, 65499, 4, 16, 14, 65487, '\b', 16, 16, '\b'}, objArr2);
                                                    if (str4.startsWith((String) objArr2[0])) {
                                                        objArr3 = new Object[1];
                                                        a(false, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 137, 19 - (~(-(ViewConfiguration.getScrollDefaultDelay() >> 16))), 4 - (~(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))), new char[]{18, 15, '\t', 4, 65486, 16, 1, 3, 11, 1, 7, 5, 65498, 3, 15, '\r', 65486, 1, 14, 4}, objArr3);
                                                        if (str4.startsWith((String) objArr3[0])) {
                                                            int i1319 = -(-Color.argb(0, 0, 0, 0));
                                                            objArr4 = new Object[1];
                                                            c(new int[]{738774753, 1289176970, -1359309921, -153858812, 1667367508, 149950335}, (i1319 & 8) + (i1319 | 8), objArr4);
                                                            if (str4.startsWith((String) objArr4[0])) {
                                                                int i1413 = -(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                                                int i1414 = (i1413 & 1) + (i1413 | 1);
                                                                Object[] objArr413 = new Object[1];
                                                                c(new int[]{1117358631, -212050713, -1160910769, 307695443}, i1414, objArr413);
                                                                strArrSplit3 = str4.split((String) objArr413[0]);
                                                                if (strArrSplit3.length > 1) {
                                                                    str5 = str3;
                                                                    if (strArrSplit3[1].equalsIgnoreCase(str5)) {
                                                                        int i1415 = i27 ^ i5;
                                                                        int i1416 = -i1415;
                                                                        int i1417 = ((i1415 & i1416) | (i1415 ^ i1416)) >> 31;
                                                                        int i1418 = ((i27 & (-21)) | ((~i27) & 20)) & (~i1417);
                                                                        int i1419 = i5 & i1417;
                                                                        i5 = (i1418 & i1419) | (i1418 ^ i1419);
                                                                    }
                                                                } else {
                                                                    str5 = str3;
                                                                }
                                                            } else {
                                                                str5 = str3;
                                                            }
                                                        } else {
                                                            str5 = str3;
                                                        }
                                                    } else {
                                                        str5 = str3;
                                                    }
                                                    i22 = (i22 ^ (-53)) + ((i22 & (-53)) << 1) + 54;
                                                    str3 = str5;
                                                }
                                                i18 = (i19 & (-101)) + (i19 | (-101)) + 102;
                                                i12 = i20;
                                                strArrSplit = strArrSplit;
                                                length = length;
                                                obj5 = obj5;
                                            }
                                        }
                                    } else {
                                        i5 = i5;
                                        strArrSplit = strArrSplit;
                                        obj5 = obj5;
                                        length = length;
                                        i19 = i18;
                                        i20 = i12;
                                    }
                                    i5 = i5;
                                    i18 = (i19 & (-101)) + (i19 | (-101)) + 102;
                                    i12 = i20;
                                    strArrSplit = strArrSplit;
                                    length = length;
                                    obj5 = obj5;
                                }
                                obj = obj5;
                            }
                        } else {
                            obj = objInvoke;
                            i5 = i27;
                        }
                        byte b28 = (byte) ($$b | 28);
                        byte[] bArr11 = $$a;
                        byte b29 = bArr11[28];
                        Object[] objArr50 = new Object[1];
                        d(b28, b29, b29, objArr50);
                        Class<?> cls19 = Class.forName((String) objArr50[0]);
                        Object[] objArr51 = new Object[1];
                        d(bArr11[58], (byte) (bArr11[0] + 1), bArr11[1], objArr51);
                        String[] strArr3 = {cls19.getField((String) objArr51[0]).get(obj)};
                        Object obj6 = new Object[]{new int[1], strArr3}[0];
                        ((int[]) obj6)[0] = i5;
                        int i208 = ((int[]) obj6)[0];
                        String[] strArr4 = strArr3;
                        if ((i2 & 1) == 0) {
                            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 146;
                            int i209 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            int i210 = (i209 & 12) + (i209 | 12);
                            int gidForName = Process.getGidForName("");
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            int i211 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                            int i212 = ~((-10) | i211);
                            int i213 = ~((-10) | gidForName);
                            int i214 = (i212 & i213) | (i212 ^ i213);
                            int i215 = ~((i211 ^ gidForName) | (i211 & gidForName));
                            int i216 = (i214 & i215) | (i214 ^ i215);
                            int i217 = (~gidForName) | 9;
                            int i218 = ~((i217 & iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (i217 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                            int i219 = (gidForName * (-589)) + 5319 + (((i216 & i218) | (i216 ^ i218)) * 590);
                            int i220 = (~(((-10) & gidForName) | ((-10) ^ gidForName))) | (~(((-10) ^ i211) | ((-10) & i211)));
                            int i221 = ~(i211 | gidForName);
                            int i222 = i219 + (((i220 & i221) | (i220 ^ i221)) * (-1180));
                            int i223 = ~gidForName;
                            int i224 = ~((i223 & i211) | (i223 ^ i211));
                            int i225 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                            int i226 = (i224 | (~((i225 & 9) | (i225 ^ 9)))) * 590;
                            Object[] objArr52 = new Object[1];
                            a(false, pressedStateDuration, i210, ((i222 | i226) << 1) - (i226 ^ i222), new char[]{65532, 65526, 7, 6, 3, 0, 65530, 16, 65531, 65532, '\r', 0, 65530}, objArr52);
                            try {
                                Object[] objArr53 = {(String) objArr52[0]};
                                int i227 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                int iLastIndexOf = TextUtils.lastIndexOf("", '0');
                                int i228 = -Color.rgb(0, 0, 0);
                                Object[] objArr54 = new Object[1];
                                a(false, (i227 | 141) + (i227 & 141), (iLastIndexOf | 24) + (iLastIndexOf & 24), ((i228 & (-16777215)) << 1) + (i228 ^ (-16777215)), new char[]{15, 65532, '\t', 65535, '\r', '\n', 4, 65535, 65481, 65534, '\n', '\t', 15, 0, '\t', 15, 65481, 65502, '\n', '\t', 15, 0, 19}, objArr54);
                                Class<?> cls20 = Class.forName((String) objArr54[0]);
                                int defaultSize = View.getDefaultSize(0, 0);
                                int i229 = 17 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                int i230 = -Drawable.resolveOpacity(0, 0);
                                Object[] objArr55 = new Object[1];
                                a(false, ((defaultSize | 146) << 1) - (defaultSize ^ 146), i229, ((i230 | 13) << 1) - (i230 ^ 13), new char[]{65514, 16, '\n', 11, 65532, 4, 65514, 65532, '\t', '\r', 0, 65530, 65532, 65534, 65532, 11}, objArr55);
                                Object objInvoke2 = cls20.getMethod((String) objArr55[0], String.class).invoke(context, objArr53);
                                if (objInvoke2 == null) {
                                    i6 = i208;
                                    i4 = i27;
                                    strArr2 = strArr4;
                                    i7 = i4;
                                    break;
                                }
                                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                int i231 = iLastIndexOf2 * 569;
                                int i232 = (i231 & 79660) + (i231 | 79660);
                                int i233 = ~iLastIndexOf2;
                                int i234 = ~((i233 ^ (-141)) | (i233 & (-141)));
                                int i235 = ~iLastIndexOf2;
                                int i236 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                                int i237 = i234 | (~((i235 ^ i236) | (i235 & i236)));
                                int i238 = ~(((-141) & i236) | ((-141) ^ i236));
                                int i239 = -(-(((i237 & i238) | (i237 ^ i238)) * (-1136)));
                                int i240 = ((i232 | i239) << 1) - (i239 ^ i232);
                                int i241 = ~((i235 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9) | (i235 & iTuitionPaymentFragmentspecialinlinedviewModeldefault9));
                                int i242 = ~(((-141) & iTuitionPaymentFragmentspecialinlinedviewModeldefault9) | ((-141) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9));
                                int i243 = (i241 & i242) | (i241 ^ i242);
                                int i244 = ~((i236 ^ iLastIndexOf2) | (i236 & iLastIndexOf2) | 140);
                                int i245 = (i240 - (~(-(-(((i243 & i244) | (i243 ^ i244)) * (-568)))))) - 1;
                                int i246 = ~((iLastIndexOf2 & i236) | (i236 ^ iLastIndexOf2));
                                int i247 = ~((i236 ^ 140) | (i236 & 140));
                                int i248 = (i233 & (-141)) | (i233 ^ (-141));
                                int i249 = -(-(((i246 & i247) | (i246 ^ i247) | (~((iTuitionPaymentFragmentspecialinlinedviewModeldefault9 & i248) | (i248 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9)))) * 568));
                                int i250 = -View.resolveSize(0, 0);
                                int i251 = -KeyEvent.normalizeMetaState(0);
                                Object[] objArr56 = new Object[1];
                                a(false, ((i245 | i249) << 1) - (i249 ^ i245), (i250 ^ 37) + ((i250 & 37) << 1), (i251 & 17) + (i251 | 17), new char[]{20, 7, 1, 3, 65518, '\r', '\n', 7, 1, 23, 65515, 65535, '\f', 65535, 5, 3, 16, 65535, '\f', 2, 16, '\r', 7, 2, 65484, 65535, 14, 14, 65484, 65535, 2, 11, 7, '\f', 65484, 65506, 3}, objArr56);
                                Class<?> cls21 = Class.forName((String) objArr56[0]);
                                int iResolveSize = View.resolveSize(0, 0);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault10 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                int i252 = ~iResolveSize;
                                int i253 = ((iResolveSize * 319) - 4755) + (((~((i252 & iTuitionPaymentFragmentspecialinlinedviewModeldefault10) | (i252 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault10))) | (-16)) * (-318));
                                int i254 = ~(((-16) & iTuitionPaymentFragmentspecialinlinedviewModeldefault10) | ((-16) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault10));
                                int i255 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                                int i256 = (i255 & iResolveSize) | (i255 ^ iResolveSize);
                                int i257 = ~((i256 & 15) | (i256 ^ 15));
                                int i258 = -(-(((i254 & i257) | (i254 ^ i257)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
                                int i259 = ((i253 | i258) << 1) - (i253 ^ i258);
                                int i260 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                                int i261 = (i260 & (-16)) | ((-16) ^ i260);
                                int i262 = ~((i261 & iResolveSize) | (i261 ^ iResolveSize));
                                int i263 = iResolveSize | 15;
                                int i264 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault10 & i263) | (i263 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault10));
                                Object[] objArr57 = new Object[1];
                                c(new int[]{919994583, -196644328, -894489867, 840763096, -1743664607, 631663422, -779445391, -1380968608, 903743213, -697068348}, i259 + (((i264 & i262) | (i262 ^ i264)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET), objArr57);
                                List list = (List) cls21.getMethod((String) objArr57[0], null).invoke(objInvoke2, null);
                                if (list == null) {
                                    i6 = i208;
                                    i4 = i27;
                                    strArr2 = strArr4;
                                    i7 = i4;
                                    break;
                                }
                                Iterator it = list.iterator();
                                loop5: while (true) {
                                    if (!it.hasNext()) {
                                        i6 = i208;
                                        i4 = i27;
                                        strArr2 = strArr4;
                                        i7 = i4;
                                        break;
                                    }
                                    Object next = it.next();
                                    int i265 = -Color.green(0);
                                    int i266 = (i265 ^ 29) + ((i265 & 29) << 1);
                                    Object[] objArr58 = new Object[1];
                                    c(new int[]{1954667763, 1980279590, -1903240715, -404009128, -801325110, 1590855096, -775617344, 885017115, -295827798, 545321488, -992299053, -1656171198, -1615774433, -470877050, -278263368, -314376247, -386718269, -1051755787}, i266, objArr58);
                                    Class<?> cls22 = Class.forName((String) objArr58[0]);
                                    int iBlue = Color.blue(0);
                                    int i267 = iBlue * 714;
                                    int i268 = (i267 ^ (-9968)) + ((i267 & (-9968)) << 1);
                                    int i269 = ~iBlue;
                                    int i270 = ~i27;
                                    int i271 = ~((i270 & i269) | (i269 ^ i270));
                                    int i272 = ~((i269 & 14) | (i269 ^ 14));
                                    int i273 = (i272 & i271) | (i271 ^ i272);
                                    int i274 = (iBlue & (-15)) | ((-15) ^ iBlue);
                                    int i275 = ~((i274 ^ i27) | (i274 & i27));
                                    int i276 = (i268 - (~(-(-(((i273 & i275) | (i273 ^ i275)) * (-713)))))) - 1;
                                    int i277 = -(-((~(i274 | i27)) * 1426));
                                    int i278 = (i276 & i277) + (i277 | i276);
                                    int i279 = (~((-15) | (~i27))) * 713;
                                    int i280 = (i278 ^ i279) + ((i279 & i278) << 1);
                                    Object[] objArr59 = new Object[1];
                                    c(new int[]{163002240, 1592451654, 332990300, 1804793062, -986565181, 1766716953, -242565647, 2046590119, -2044520438, 143812730}, i280, objArr59);
                                    String str14 = (String) cls22.getMethod((String) objArr59[0], null).invoke(next, null);
                                    int iAlpha = Color.alpha(0) + 139;
                                    int i281 = -TextUtils.getCapsMode("", 0, 0);
                                    Object[] objArr60 = new Object[1];
                                    a(false, iAlpha, ((i281 | 37) << 1) - (i281 ^ 37), 17 - KeyEvent.keyCodeFromString(""), new char[]{20, 7, 1, 3, 65518, '\r', '\n', 7, 1, 23, 65515, 65535, '\f', 65535, 5, 3, 16, 65535, '\f', 2, 16, '\r', 7, 2, 65484, 65535, 14, 14, 65484, 65535, 2, 11, 7, '\f', 65484, 65506, 3}, objArr60);
                                    Class<?> cls23 = Class.forName((String) objArr60[0]);
                                    int iIndexOf9 = TextUtils.indexOf((CharSequence) "", '0');
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault11 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                    int i282 = iIndexOf9 * (-721);
                                    int i283 = (i282 & (-104545)) + (i282 | (-104545));
                                    int i284 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault11;
                                    int i285 = ~iIndexOf9;
                                    int i286 = ~(i285 | (-146));
                                    int i287 = (i284 ^ i286) | (i286 & i284);
                                    int i288 = ~((iIndexOf9 & 145) | (iIndexOf9 ^ 145));
                                    int i289 = -(-(((i287 & i288) | (i287 ^ i288)) * 1444));
                                    int i290 = ((i283 | i289) << 1) - (i289 ^ i283);
                                    int i291 = ~((iIndexOf9 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault11) | (iIndexOf9 & iTuitionPaymentFragmentspecialinlinedviewModeldefault11));
                                    int i292 = (i291 & i288) | (i288 ^ i291);
                                    int i293 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault11 & 145) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault11 ^ 145));
                                    int i294 = (i290 - (~(((i292 & i293) | (i292 ^ i293)) * (-1444)))) - 1;
                                    int i295 = ((~((i285 ^ 145) | (i285 & 145))) | (~((iIndexOf9 & (-146)) | ((-146) ^ iIndexOf9)))) * 722;
                                    int i296 = (i294 ^ i295) + ((i295 & i294) << 1);
                                    int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 17;
                                    byte modifierMetaStateMask = (byte) KeyEvent.getModifierMetaStateMask();
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault12 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                    int i297 = modifierMetaStateMask * (-496);
                                    int i298 = ((i297 | (-4464)) << 1) - (i297 ^ (-4464));
                                    int i299 = ~modifierMetaStateMask;
                                    int i300 = i298 + ((~((i299 ^ (-10)) | (i299 & (-10)))) * 497);
                                    int i301 = ~modifierMetaStateMask;
                                    int i302 = (i301 ^ (-10)) | (i301 & (-10));
                                    int i303 = ~((i302 & iTuitionPaymentFragmentspecialinlinedviewModeldefault12) | (i302 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault12));
                                    int i304 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault12;
                                    int i305 = ((-10) ^ i304) | ((-10) & i304);
                                    strArr2 = strArr4;
                                    int i306 = ~((i305 ^ modifierMetaStateMask) | (i305 & modifierMetaStateMask));
                                    int i307 = i300 + (((i303 ^ i306) | (i306 & i303)) * 497);
                                    int i308 = ~((i299 ^ i304) | (i299 & i304));
                                    int i309 = ~((i301 ^ 9) | (i301 & 9));
                                    Object[] objArr61 = new Object[1];
                                    a(false, i296, windowTouchSlop, (i307 - (~((((i308 & i309) | (i308 ^ i309)) | (~(((modifierMetaStateMask & (-10)) | ((-10) ^ modifierMetaStateMask)) | iTuitionPaymentFragmentspecialinlinedviewModeldefault12))) * 497))) - 1, new char[]{65512, 16, 7, 65534, 11, 65498, '\t', '\t', 2, '\f', 65513, 11, '\b', 65535, 2, 5, 65534}, objArr61);
                                    if (((Boolean) cls23.getMethod((String) objArr61[0], String.class).invoke(objInvoke2, str14)).booleanValue()) {
                                        int length6 = str14.length();
                                        int i310 = (length6 & (-20)) + (length6 | (-20));
                                        if (i310 >= 0) {
                                            int i311 = 0;
                                            while (i311 <= i310) {
                                                Object[] objArr62 = {str14.substring(i311, ((i311 | 20) << 1) - (i311 ^ 20)), 931995};
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                                    char c5 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                                                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 3393;
                                                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 9;
                                                    byte b30 = (byte) ($$e & 14);
                                                    byte b31 = $$d[7];
                                                    Object[] objArr63 = new Object[1];
                                                    e(b30, b31, (byte) (b31 - 1), objArr63);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c5, iKeyCodeFromString, iResolveOpacity, 1203525406, false, (String) objArr63[0], new Class[]{String.class, Integer.TYPE});
                                                }
                                                long jLongValue4 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr62)).longValue();
                                                long j20 = 1235356100;
                                                Iterator it2 = it;
                                                String str15 = str14;
                                                Object obj7 = objInvoke2;
                                                int i312 = i311;
                                                long j21 = -1;
                                                long j22 = jLongValue4 ^ j21;
                                                i6 = i208;
                                                long jFreeMemory = ((long) ((int) Runtime.getRuntime().freeMemory())) ^ j21;
                                                long j23 = 933;
                                                long j24 = (((long) 934) * j20) + (((long) (-932)) * jLongValue4) + (((long) (-933)) * (j22 | (((j20 ^ j21) | jFreeMemory) ^ j21))) + ((((j22 | jFreeMemory) ^ j21) | ((j22 | j20) ^ j21)) * j23) + (j23 * ((j20 | jLongValue4) ^ j21)) + ((long) (-1237425977));
                                                int iMyUid = Process.myUid();
                                                int i313 = ~iMyUid;
                                                int i314 = ((int) (j24 >> 32)) & ((((~((-294126977) | i313)) | (~((-744931930) | iMyUid))) * 988) + 1445354686 + (((~(iMyUid | 1818681979)) | (-2112808956) | (~(i313 | (-744931930)))) * 988));
                                                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                                                int i315 = ~((-1375450340) | (~startElapsedRealtime));
                                                int i316 = ((int) j24) & (((134234384 | i315 | (~(1375450339 | startElapsedRealtime))) * (-338)) + 984322421 + (((~(startElapsedRealtime | 1509684723)) | i315) * 338));
                                                if (((i314 & i316) | (i314 ^ i316)) == 1245577864) {
                                                    i4 = i;
                                                    i7 = (~(i4 & 70)) & (i4 | 70);
                                                    break loop5;
                                                }
                                                int i317 = (i312 ^ (-47)) + ((i312 & (-47)) << 1);
                                                i311 = ((i317 | 48) << 1) - (i317 ^ 48);
                                                it = it2;
                                                i27 = i;
                                                i208 = i6;
                                                str14 = str15;
                                                objInvoke2 = obj7;
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                    it = it;
                                    i27 = i27;
                                    i208 = i208;
                                    objInvoke2 = objInvoke2;
                                    strArr4 = strArr2;
                                }
                                int i318 = i6;
                                int i319 = ((~i318) & i4) | ((~i4) & i318);
                                int i320 = -i319;
                                int i321 = ((i319 & i320) | (i319 ^ i320)) >> 31;
                                int i322 = i7 & (~i321);
                                int i323 = i318 & i321;
                                i27 = (i322 & i323) | (i322 ^ i323);
                            } catch (Throwable th29) {
                                Throwable cause9 = th29.getCause();
                                if (cause9 != null) {
                                    throw cause9;
                                }
                                throw th29;
                            }
                        } else {
                            i4 = i27;
                            strArr2 = strArr4;
                            i27 = i208;
                        }
                        strArr = strArr2;
                    } catch (Throwable th30) {
                        Throwable cause10 = th30.getCause();
                        if (cause10 != null) {
                            throw cause10;
                        }
                        throw th30;
                    }
                } else {
                    i4 = i27;
                    strArr = null;
                }
                int i324 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                int i325 = (i324 * (-183)) + 25160;
                int i326 = ~i324;
                int i327 = -(-(((i326 ^ 136) | (i326 & 136)) * (-368)));
                int i328 = ((i325 | i327) << 1) - (i325 ^ i327);
                int i329 = (i324 ^ (-137)) | (i324 & (-137));
                int i330 = ~i4;
                int i331 = ((i329 & i330) | (i329 ^ i330)) * 184;
                int i332 = (i328 ^ i331) + ((i331 & i328) << 1);
                int i333 = ~((i326 ^ (-137)) | (i326 & (-137)));
                int i334 = ~i4;
                int i335 = ~((i334 ^ i324) | (i334 & i324));
                int i336 = ((~((i324 & 136) | (i324 ^ 136))) | (i333 & i335) | (i333 ^ i335)) * 184;
                int i337 = ((i336 & i332) << 1) + (i332 ^ i336);
                int iAlpha2 = Color.alpha(0);
                int i338 = (iAlpha2 ^ 12) + ((iAlpha2 & 12) << 1);
                byte modifierMetaStateMask2 = (byte) KeyEvent.getModifierMetaStateMask();
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault13 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                int i339 = (modifierMetaStateMask2 * (-501)) + 6539;
                int i340 = ~((-14) | iTuitionPaymentFragmentspecialinlinedviewModeldefault13);
                int i341 = ~((modifierMetaStateMask2 ^ 13) | (modifierMetaStateMask2 & 13));
                int i342 = ((i340 & i341) | (i340 ^ i341)) * (-502);
                int i343 = (i339 ^ i342) + ((i339 & i342) << 1);
                int i344 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault13;
                int i345 = (i343 - (~((~(((i344 & (-14)) | ((-14) ^ i344)) | modifierMetaStateMask2)) * (-502)))) - 1;
                int i346 = ~((~modifierMetaStateMask2) | iTuitionPaymentFragmentspecialinlinedviewModeldefault13);
                int i347 = ((i346 & (-14)) | ((-14) ^ i346)) * TypedValues.PositionType.TYPE_DRAWPATH;
                Object[] objArr64 = new Object[1];
                a(true, i337, i338, (i347 | i345) + (i345 & i347), new char[]{15, 6, 14, 65513, 65523, 65519, 20, 19, 5, 21, 7, 65487}, objArr64);
                Object[] objArr65 = {(String) objArr64[0]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                    char c6 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                    int iMyPid = 993 - (Process.myPid() >> 22);
                    int i348 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 7;
                    byte[] bArr12 = $$d;
                    byte b32 = (byte) (-bArr12[15]);
                    byte b33 = (byte) (bArr12[7] - 1);
                    Object[] objArr66 = new Object[1];
                    e(b32, b33, b33, objArr66);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c6, iMyPid, i348, -545305915, false, (String) objArr66[0], new Class[]{String.class});
                }
                long jLongValue5 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr65)).longValue();
                long j25 = -642780542;
                long j26 = -754;
                long j27 = -1;
                long j28 = j25 ^ j27;
                long j29 = j28 | jLongValue5;
                int i349 = i27;
                String[] strArr5 = strArr;
                long j30 = i4;
                long j31 = j30 ^ j27;
                long j32 = (((long) 755) * j25) + (((long) (-753)) * jLongValue5) + (((j29 ^ j27) | ((j28 | j30) ^ j27) | ((jLongValue5 | j30) ^ j27)) * j26) + (j26 * (((j29 | j30) ^ j27) | ((jLongValue5 | (j31 | j25)) ^ j27))) + (((long) 754) * (j28 | j31)) + ((long) 1263239826);
                int i350 = ((int) (j32 >> 32)) & (((1342044230 + (((~((-1991400844) | i334)) | 554174432) * (-933))) + (((~(554174432 | i334)) | (-2008702956)) * 933)) - 1036998688);
                int iMyPid2 = Process.myPid();
                int i351 = ((int) j32) & ((((~(1475074042 | iMyPid2)) * 521) - 2024827560) + (((~((~iMyPid2) | 1475074042)) | 33554512) * 521));
                int i352 = (i350 & i351) | (i350 ^ i351);
                int i353 = (~(i4 & 50)) & (i4 | 50);
                int i354 = (i352 | (-i352)) >> 31;
                int i355 = (~i354) & i4;
                int i356 = i354 & i353;
                int i357 = (i356 & i355) | (i355 ^ i356);
                int i358 = (~(i4 & i349)) & (i4 | i349);
                int i359 = -i358;
                int i360 = ((i358 & i359) | (i358 ^ i359)) >> 31;
                int i361 = i357 & (~i360);
                int i362 = i349 & i360;
                int i363 = (i361 & i362) | (i361 ^ i362);
                int i364 = -(Process.myPid() >> 22);
                int i365 = (i364 & 143) + (i364 | 143);
                int iArgb2 = Color.argb(0, 0, 0, 0);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault14 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                int i366 = (iArgb2 * (-464)) - 18580;
                int i367 = ~iArgb2;
                int i368 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault14 ^ 20) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault14 & 20);
                int i369 = ~i368;
                int i370 = -(-(((i369 & i367) | (i367 ^ i369)) * (-465)));
                int i371 = (i366 ^ i370) + ((i366 & i370) << 1);
                int i372 = -(-(((~(iTuitionPaymentFragmentspecialinlinedviewModeldefault14 | (~iArgb2))) | 20) * 930));
                int i373 = ((i371 | i372) << 1) - (i372 ^ i371);
                int i374 = -(-((i368 | i367) * 465));
                int i375 = ((i373 | i374) << 1) - (i374 ^ i373);
                int i376 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                Object[] objArr67 = new Object[1];
                a(true, i365, i375, (i376 ^ 17) + ((i376 & 17) << 1), new char[]{'\r', 65529, 65535, '\b', '\t', 2, '\n', 16, 65481, 7, 65535, 14, '\r', 19, '\r', 65481, 65535, 65533, 65531, '\n'}, objArr67);
                Object[] objArr68 = {(String) objArr67[0]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                    char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 993;
                    int i377 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 7;
                    byte[] bArr13 = $$d;
                    byte b34 = (byte) (-bArr13[15]);
                    byte b35 = (byte) (bArr13[7] - 1);
                    Object[] objArr69 = new Object[1];
                    e(b34, b35, b35, objArr69);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(maximumDrawingCacheSize, keyRepeatTimeout, i377, -545305915, false, (String) objArr69[0], new Class[]{String.class});
                }
                long jLongValue6 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr68)).longValue();
                long j33 = -252570711;
                long j34 = -272;
                long j35 = j33 ^ j27;
                long j36 = (((long) 273) * j33) + (((long) (-271)) * jLongValue6) + (((((j35 | (jLongValue6 ^ j27)) | j31) ^ j27) | (((j33 | jLongValue6) | j30) ^ j27)) * j34) + (j34 * (((j35 | jLongValue6) ^ j27) | ((j35 | j30) ^ j27))) + (((long) 272) * (jLongValue6 | ((j33 | j30) ^ j27))) + ((long) 873029995);
                int i378 = ~((int) Process.getStartElapsedRealtime());
                int i379 = ((int) (j36 >> 32)) & ((-884948235) + ((~((-339820545) | i378)) * (-783)) + (((~(i378 | 1094620070)) | (-342606341)) * 783));
                int i380 = ((int) j36) & (1171060335 + (((~((-399782109) | i4)) | 33558544) * (-140)) + ((~((-366223565) | i4)) * 70) + (((~((-1037444302) | i4)) | 704779281) * 70));
                int i381 = (i379 & i380) | (i379 ^ i380);
                int i382 = -i381;
                int i383 = ((i381 & i382) | (i381 ^ i382)) >> 31;
                int i384 = i4 ^ i363;
                int i385 = -i384;
                int i386 = ((i384 & i385) | (i384 ^ i385)) >> 31;
                int i387 = ((i383 & (~(i4 & 60)) & (i4 | 60)) | ((~i383) & i4)) & (~i386);
                int i388 = i363 & i386;
                int i389 = (i388 & i387) | (i387 ^ i388);
                Object[] objArr70 = new Object[1];
                a(false, 136 - (ViewConfiguration.getPressedStateDuration() >> 16), 36 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 4 - (~View.combineMeasuredStates(0, 0)), new char[]{0, 5, 2, 21, 2, 65488, 5, 2, 21, 2, 65488, 5, 2, 21, 2, 65488, 4, 16, 14, 65487, '\b', 3, 16, 25, 65487, 2, 15, 5, 19, 16, '\n', 5, 65488, 23, 7, 20}, objArr70);
                Object[] objArr71 = {(String) objArr70[0]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                    char c7 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                    int i390 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 992;
                    int offsetAfter = 8 - TextUtils.getOffsetAfter("", 0);
                    byte b36 = (byte) ($$e & 13);
                    byte b37 = (byte) ($$d[7] - 1);
                    Object[] objArr72 = new Object[1];
                    e(b36, b37, b37, objArr72);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c7, i390, offsetAfter, 349342683, false, (String) objArr72[0], new Class[]{String.class});
                }
                long jLongValue7 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr71)).longValue();
                long j37 = -552431755;
                long j38 = 164;
                long j39 = jLongValue7 ^ j27;
                long j40 = (((long) 165) * j37) + (((long) (-163)) * jLongValue7) + (((long) (-328)) * (j37 | ((j31 | jLongValue7) ^ j27))) + ((j37 | j30) * j38) + (j38 * ((((j37 ^ j27) | j39) ^ j27) | ((j39 | j30) ^ j27) | ((jLongValue7 | (j31 | j37)) ^ j27))) + ((long) (-294646850));
                int i391 = ((int) (j40 >> 32)) & (2139268182 + (((~(1610569693 | i334)) | (~((-18481430) | i4))) * (-302)) + ((~(1610569693 | i4)) * (-604)) + (((~(1592088264 | i4)) | 136380424) * 302));
                int i392 = ((int) j40) & (2006479072 + (((~((-848971529) | i334)) | (-2008769358)) * (-983)) + (((~((-2008769358) | i334)) | 1159798853) * 983));
                int i393 = (i391 & i392) | (i391 ^ i392);
                int i394 = (~(i4 & 80)) & (i4 | 80);
                int i395 = (i393 | (-i393)) >> 31;
                int i396 = (~i395) & i4;
                int i397 = i395 & i394;
                int i398 = (i397 & i396) | (i396 ^ i397);
                int i399 = i4 ^ i389;
                int i400 = -i399;
                int i401 = ((i399 & i400) | (i399 ^ i400)) >> 31;
                int i402 = i398 & (~i401);
                int i403 = i389 & i401;
                int i404 = (i403 & i402) | (i402 ^ i403);
                int keyRepeatTimeout2 = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                int i405 = (keyRepeatTimeout2 ^ 42) + ((keyRepeatTimeout2 & 42) << 1);
                Object[] objArr73 = new Object[1];
                c(new int[]{1533707029, -909824361, 1487284458, 307463244, 1300437912, -293947408, -1930135567, 1078072441, -1429201618, -1302138774, -1640158604, -1301463008, 2097220913, -437418980, 491417249, -1595391496, -1438982302, -1699883780, 554672150, -1844863737, -1995480720, 380410742, 1905193412, 869957058}, i405, objArr73);
                Object[] objArr74 = {(String) objArr73[0]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                    int offsetAfter2 = TextUtils.getOffsetAfter("", 0) + 993;
                    int i406 = 8 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    byte b38 = (byte) ($$e & 13);
                    byte b39 = (byte) ($$d[7] - 1);
                    Object[] objArr75 = new Object[1];
                    e(b38, b39, b39, objArr75);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cLastIndexOf, offsetAfter2, i406, 349342683, false, (String) objArr75[0], new Class[]{String.class});
                }
                long jLongValue8 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr74)).longValue();
                long j41 = 766879230;
                long j42 = 530;
                long j43 = ((long) 1058) + (j42 * j41) + (j42 * jLongValue8);
                long j44 = 529;
                long j45 = j43 + ((((j31 | j41) ^ j27) | ((j41 | jLongValue8) ^ j27)) * j44) + (j44 * (((j30 | j41) ^ j27) | (jLongValue8 ^ j27))) + ((long) (-1613957835));
                int i407 = ((int) (j45 >> 32)) & (1972008040 + (((~((-1139961335) | i334)) | (~((-297265077) | i334))) * (-867)) + (((~((-1139961335) | i4)) | 28468660 | (~((-297265077) | i4))) * (-1734)) + (((~((-28468661) | i334)) | (~((-1111492675) | i4)) | (~((-268796417) | i4))) * 867));
                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                int i408 = ((int) j45) & (1771465493 + (((~(1263130918 | iFreeMemory)) | (-1265237416)) * 576) + (((~((~iFreeMemory) | (-2106498))) | 1091141924) * 576) + 1367688704);
                int i409 = (i407 & i408) | (i407 ^ i408);
                int i410 = -i409;
                int i411 = ((i409 & i410) | (i409 ^ i410)) >> 31;
                int i412 = (~i411) & i4;
                int i413 = i411 & (i4 ^ 90);
                int i414 = (i413 & i412) | (i412 ^ i413);
                int i415 = (~(i4 & i404)) & (i4 | i404);
                int i416 = -i415;
                int i417 = ((i415 & i416) | (i415 ^ i416)) >> 31;
                int i418 = i414 & (~i417);
                int i419 = i417 & i404;
                int i420 = (i418 & i419) | (i418 ^ i419);
                int iResolveSize2 = View.resolveSize(0, 0);
                Object[] objArr76 = new Object[1];
                c(new int[]{-1748203822, 555493141, 1903560568, 654629552, 1011103253, -1889753269, 842398591, -2018764997, 674531619, -282503043, -1001646761, -1816475039}, (iResolveSize2 & 18) + (iResolveSize2 | 18), objArr76);
                Object[] objArr77 = {(String) objArr76[0]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                    char c8 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                    int iMyTid = 993 - (Process.myTid() >> 22);
                    int minimumFlingVelocity = 8 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    byte b40 = (byte) ($$e & 13);
                    byte b41 = (byte) ($$d[7] - 1);
                    Object[] objArr78 = new Object[1];
                    e(b40, b41, b41, objArr78);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c8, iMyTid, minimumFlingVelocity, 349342683, false, (String) objArr78[0], new Class[]{String.class});
                }
                long jLongValue9 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr77)).longValue();
                long j46 = -797034778;
                long j47 = jLongValue9 ^ j27;
                long jMyUid = Process.myUid();
                long j48 = TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                long j49 = jMyUid ^ j27;
                long j50 = (((long) 319) * j46) + (((long) (-317)) * jLongValue9) + (((long) (-318)) * (j47 | (((j46 ^ j27) | jMyUid) ^ j27))) + ((((j47 | jMyUid) ^ j27) | (((j49 | j46) | jLongValue9) ^ j27)) * j48) + (j48 * ((((j47 | j49) | j46) ^ j27) | ((jMyUid | (jLongValue9 | j46)) ^ j27))) + ((long) (-50043827));
                int i421 = ~((-797205480) | i334);
                int i422 = ((int) (j50 >> 32)) & ((-405516038) + ((84156802 | i421) * (-712)) + (((~((-84156803) | i334)) | (~((-713048678) | i))) * (-712)) + ((i421 | 2060535405) * 712));
                int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                int i423 = ~elapsedCpuTime2;
                int i424 = ((int) j50) & ((-1738041619) + (((~((-954050780) | i423)) | 811073626 | (~((-1903690107) | i423))) * (-1136)) + (((~((-954050780) | elapsedCpuTime2)) | (~((-1903690107) | elapsedCpuTime2)) | (~(2046667259 | i423))) * (-568)) + (((~(elapsedCpuTime2 | (-811073627))) | (~(i423 | 1903690106)) | (~(954050779 | i423))) * 568));
                int i425 = (i422 & i424) | (i422 ^ i424);
                int i426 = (i425 | (-i425)) >> 31;
                int i427 = (i426 & (i ^ 100)) | (i & (~i426));
                int i428 = (i & (~i420)) | (i420 & i334);
                int i429 = -i428;
                int i430 = ((i428 & i429) | (i428 ^ i429)) >> 31;
                int i431 = i427 & (~i430);
                int i432 = i420 & i430;
                int i433 = (i431 & i432) | (i431 ^ i432);
                int[] iArr3 = new int[1];
                Object[] objArr79 = {new int[]{i}, strArr5, iArr3, new int[]{i433}};
                int i434 = i ^ i433;
                int i435 = -i434;
                int i436 = (((i434 & i435) | (i434 ^ i435)) >> 31) & 16;
                int i437 = ~((-723319067) | i334);
                int i438 = ~((-85394250) | i);
                int i439 = (-344974842) + ((i437 | i438) * 1150) + (((~(85394249 | i334)) | i438) * (-575)) + (((~((-723319067) | i)) | (~(723319066 | i334))) * 575);
                int i440 = -(-i436);
                int i441 = (i3 - (~(-(-((i439 & i440) + (i440 | i439)))))) - 1;
                int i442 = i441 ^ (i441 << 13);
                int i443 = i442 >>> 17;
                int i444 = ((~i442) & i443) | ((~i443) & i442);
                int i445 = i444 << 5;
                iArr3[0] = ((~i444) & i445) | ((~i445) & i444);
                return objArr79;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0021  */
            /* JADX WARN: Code duplicated, block: B:8:0x001b  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(short r5, byte r6, int r7) {
                /*
                    byte[] r0 = com.squareup.okhttp.internal.http.HttpEngine.AnonymousClass2.$$c
                    int r6 = r6 * 4
                    int r1 = r6 + 1
                    int r7 = r7 + 66
                    int r5 = r5 * 3
                    int r5 = 4 - r5
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    if (r0 != 0) goto L15
                    r4 = r7
                    r3 = r2
                    r7 = r6
                    goto L25
                L15:
                    r3 = r2
                L16:
                    byte r4 = (byte) r7
                    r1[r3] = r4
                    if (r3 != r6) goto L21
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    return r5
                L21:
                    int r3 = r3 + 1
                    r4 = r0[r5]
                L25:
                    int r5 = r5 + 1
                    int r7 = r7 + r4
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.http.HttpEngine.AnonymousClass2.$$g(short, byte, int):java.lang.String");
            }
        }))).build();
    }

    private static boolean validate(Response response, Response response2) {
        Date date;
        if (response2.code() == 304) {
            return true;
        }
        Date date2 = response.headers().getDate("Last-Modified");
        return (date2 == null || (date = response2.headers().getDate("Last-Modified")) == null || date.getTime() >= date2.getTime()) ? false : true;
    }

    private static Headers combine(Headers headers, Headers headers2) throws IOException {
        Headers.Builder builder = new Headers.Builder();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            String strName = headers.name(i);
            String strValue = headers.value(i);
            if ((!"Warning".equalsIgnoreCase(strName) || !strValue.startsWith("1")) && (!OkHeaders.isEndToEnd(strName) || headers2.get(strName) == null)) {
                builder.add(strName, strValue);
            }
        }
        int size2 = headers2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            String strName2 = headers2.name(i2);
            if (!"Content-Length".equalsIgnoreCase(strName2) && OkHeaders.isEndToEnd(strName2)) {
                builder.add(strName2, headers2.value(i2));
            }
        }
        return builder.build();
    }

    public final void receiveHeaders(Headers headers) throws IOException {
        CookieHandler cookieHandler = this.client.getCookieHandler();
        if (cookieHandler != null) {
            cookieHandler.put(this.userRequest.uri(), OkHeaders.toMultimap(headers, null));
        }
    }

    public final Request followUpRequest() throws IOException {
        Proxy proxy;
        String strHeader;
        HttpUrl httpUrlResolve;
        if (this.userResponse == null) {
            throw new IllegalStateException();
        }
        RealConnection realConnectionConnection = this.streamAllocation.connection();
        Route route = realConnectionConnection != null ? realConnectionConnection.getRoute() : null;
        if (route != null) {
            proxy = route.getProxy();
        } else {
            proxy = this.client.getProxy();
        }
        int iCode = this.userResponse.code();
        String strMethod = this.userRequest.method();
        if (iCode != 307 && iCode != 308) {
            if (iCode != 401) {
                if (iCode != 407) {
                    switch (iCode) {
                        case 300:
                        case 301:
                        case 302:
                        case 303:
                            break;
                        default:
                            return null;
                    }
                } else if (proxy.type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
            }
            return OkHeaders.processAuthHeader(this.client.getAuthenticator(), this.userResponse, proxy);
        }
        if (!strMethod.equals(ShareTarget.METHOD_GET) && !strMethod.equals("HEAD")) {
            return null;
        }
        if (!this.client.getFollowRedirects() || (strHeader = this.userResponse.header("Location")) == null || (httpUrlResolve = this.userRequest.httpUrl().resolve(strHeader)) == null) {
            return null;
        }
        if (!httpUrlResolve.scheme().equals(this.userRequest.httpUrl().scheme()) && !this.client.getFollowSslRedirects()) {
            return null;
        }
        Request.Builder builderNewBuilder = this.userRequest.newBuilder();
        if (HttpMethod.permitsRequestBody(strMethod)) {
            if (HttpMethod.redirectsToGet(strMethod)) {
                builderNewBuilder.method(ShareTarget.METHOD_GET, null);
            } else {
                builderNewBuilder.method(strMethod, null);
            }
            builderNewBuilder.removeHeader("Transfer-Encoding");
            builderNewBuilder.removeHeader("Content-Length");
            builderNewBuilder.removeHeader(HttpHeaderParser.HEADER_CONTENT_TYPE);
        }
        if (!sameConnection(httpUrlResolve)) {
            builderNewBuilder.removeHeader("Authorization");
        }
        return builderNewBuilder.url(httpUrlResolve).build();
    }

    public final boolean sameConnection(HttpUrl httpUrl) {
        HttpUrl httpUrl2 = this.userRequest.httpUrl();
        return httpUrl2.host().equals(httpUrl.host()) && httpUrl2.port() == httpUrl.port() && httpUrl2.scheme().equals(httpUrl.scheme());
    }

    private static Address createAddress(OkHttpClient okHttpClient, Request request) {
        SSLSocketFactory sslSocketFactory;
        HostnameVerifier hostnameVerifier;
        CertificatePinner certificatePinner;
        if (request.isHttps()) {
            sslSocketFactory = okHttpClient.getSslSocketFactory();
            hostnameVerifier = okHttpClient.getHostnameVerifier();
            certificatePinner = okHttpClient.getCertificatePinner();
        } else {
            sslSocketFactory = null;
            hostnameVerifier = null;
            certificatePinner = null;
        }
        return new Address(request.httpUrl().host(), request.httpUrl().port(), okHttpClient.getDns(), okHttpClient.getSocketFactory(), sslSocketFactory, hostnameVerifier, certificatePinner, okHttpClient.getAuthenticator(), okHttpClient.getProxy(), okHttpClient.getProtocols(), okHttpClient.getConnectionSpecs(), okHttpClient.getProxySelector());
    }
}
