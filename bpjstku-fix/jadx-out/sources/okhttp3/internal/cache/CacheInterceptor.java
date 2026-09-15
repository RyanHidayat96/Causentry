package okhttp3.internal.cache;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.android.volley.toolbox.HttpHeaderParser;
import defpackage.RotationProvider1;
import defpackage.RotationProviderListener;
import defpackage.RotationProviderListenerWrapper;
import defpackage.SurfaceViewImplementation;
import defpackage.SurfaceViewImplementationApi24Impl;
import defpackage.cancelPreviousRequest;
import defpackage.tryToComplete;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.RealResponseBody;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lokhttp3/internal/cache/CacheInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/Cache;", "p0", "<init>", "(Lokhttp3/Cache;)V", "Lokhttp3/internal/cache/CacheRequest;", "Lokhttp3/Response;", "p1", "cacheWritingResponse", "(Lokhttp3/internal/cache/CacheRequest;Lokhttp3/Response;)Lokhttp3/Response;", "Lokhttp3/Interceptor$Chain;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "cache", "Lokhttp3/Cache;", "getCache$okhttp", "()Lokhttp3/Cache;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CacheInterceptor implements Interceptor {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Cache cache;

    public CacheInterceptor(Cache cache) {
        this.cache = cache;
    }

    /* JADX INFO: renamed from: getCache$okhttp, reason: from getter */
    public final Cache getCache() {
        return this.cache;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain p0) throws IOException {
        EventListener eventListener;
        ResponseBody responseBodyBody;
        ResponseBody responseBodyBody2;
        ResponseBody responseBodyBody3;
        Intrinsics.checkNotNullParameter(p0, "");
        Call call = p0.call();
        Cache cache = this.cache;
        Response response = cache != null ? cache.get$okhttp(p0.request()) : null;
        CacheStrategy cacheStrategyCompute = new CacheStrategy.Factory(System.currentTimeMillis(), p0.request(), response).compute();
        Request networkRequest = cacheStrategyCompute.getNetworkRequest();
        Response cacheResponse = cacheStrategyCompute.getCacheResponse();
        Cache cache2 = this.cache;
        if (cache2 != null) {
            cache2.trackResponse$okhttp(cacheStrategyCompute);
        }
        RealCall realCall = call instanceof RealCall ? (RealCall) call : null;
        if (realCall == null || (eventListener = realCall.getEventListener()) == null) {
            eventListener = EventListener.NONE;
        }
        if (response != null && cacheResponse == null && (responseBodyBody3 = response.body()) != null) {
            Util.closeQuietly(responseBodyBody3);
        }
        if (networkRequest == null && cacheResponse == null) {
            Response responseBuild = new Response.Builder().request(p0.request()).protocol(Protocol.HTTP_1_1).code(TypedValues.PositionType.TYPE_PERCENT_HEIGHT).message("Unsatisfiable Request (only-if-cached)").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1L).receivedResponseAtMillis(System.currentTimeMillis()).build();
            eventListener.satisfactionFailure(call, responseBuild);
            return responseBuild;
        }
        if (networkRequest == null) {
            Intrinsics.checkNotNull(cacheResponse);
            Response responseBuild2 = cacheResponse.newBuilder().cacheResponse(INSTANCE.stripBody(cacheResponse)).build();
            eventListener.cacheHit(call, responseBuild2);
            return responseBuild2;
        }
        if (cacheResponse != null) {
            eventListener.cacheConditionalHit(call, cacheResponse);
        } else if (this.cache != null) {
            eventListener.cacheMiss(call);
        }
        try {
            Response responseProceed = p0.proceed(networkRequest);
            if (responseProceed == null && response != null && (responseBodyBody2 = response.body()) != null) {
                Util.closeQuietly(responseBodyBody2);
            }
            if (cacheResponse != null) {
                if (responseProceed != null && responseProceed.code() == 304) {
                    Response.Builder builderNewBuilder = cacheResponse.newBuilder();
                    Companion companion = INSTANCE;
                    Response responseBuild3 = builderNewBuilder.headers(companion.combine(cacheResponse.headers(), responseProceed.headers())).sentRequestAtMillis(responseProceed.sentRequestAtMillis()).receivedResponseAtMillis(responseProceed.receivedResponseAtMillis()).cacheResponse(companion.stripBody(cacheResponse)).networkResponse(companion.stripBody(responseProceed)).build();
                    ResponseBody responseBodyBody4 = responseProceed.body();
                    Intrinsics.checkNotNull(responseBodyBody4);
                    responseBodyBody4.close();
                    Cache cache3 = this.cache;
                    Intrinsics.checkNotNull(cache3);
                    cache3.trackConditionalCacheHit$okhttp();
                    this.cache.update$okhttp(cacheResponse, responseBuild3);
                    eventListener.cacheHit(call, responseBuild3);
                    return responseBuild3;
                }
                ResponseBody responseBodyBody5 = cacheResponse.body();
                if (responseBodyBody5 != null) {
                    Util.closeQuietly(responseBodyBody5);
                }
            }
            Intrinsics.checkNotNull(responseProceed);
            Response.Builder builderNewBuilder2 = responseProceed.newBuilder();
            Companion companion2 = INSTANCE;
            Response responseBuild4 = builderNewBuilder2.cacheResponse(companion2.stripBody(cacheResponse)).networkResponse(companion2.stripBody(responseProceed)).build();
            if (this.cache != null) {
                if (HttpHeaders.promisesBody(responseBuild4) && CacheStrategy.INSTANCE.isCacheable(responseBuild4, networkRequest)) {
                    Response responseCacheWritingResponse = cacheWritingResponse(this.cache.put$okhttp(responseBuild4), responseBuild4);
                    if (cacheResponse != null) {
                        eventListener.cacheMiss(call);
                    }
                    return responseCacheWritingResponse;
                }
                if (HttpMethod.INSTANCE.invalidatesCache(networkRequest.method())) {
                    try {
                        this.cache.remove$okhttp(networkRequest);
                    } catch (IOException unused) {
                    }
                }
            }
            return responseBuild4;
        } catch (Throwable th) {
            if (response != null && (responseBodyBody = response.body()) != null) {
                Util.closeQuietly(responseBodyBody);
            }
            throw th;
        }
    }

    private final Response cacheWritingResponse(final CacheRequest p0, Response p1) throws IOException {
        if (p0 == null) {
            return p1;
        }
        SurfaceViewImplementationApi24Impl body = p0.getBody();
        ResponseBody responseBodyBody = p1.body();
        Intrinsics.checkNotNull(responseBodyBody);
        final RotationProvider1 source = responseBodyBody.getBodySource();
        final RotationProviderListener rotationProviderListenerTuitionPaymentFragmentbindingInflater1 = SurfaceViewImplementation.TuitionPaymentFragmentbindingInflater1(body);
        tryToComplete trytocomplete = new tryToComplete() { // from class: okhttp3.internal.cache.CacheInterceptor$cacheWritingResponse$cacheWritingSource$1
            private boolean cacheRequestClosed;

            @Override // defpackage.tryToComplete
            public final long read(RotationProviderListenerWrapper p2, long p3) throws IOException {
                Intrinsics.checkNotNullParameter(p2, "");
                try {
                    long j = source.read(p2, p3);
                    if (j == -1) {
                        if (!this.cacheRequestClosed) {
                            this.cacheRequestClosed = true;
                            rotationProviderListenerTuitionPaymentFragmentbindingInflater1.close();
                        }
                        return -1L;
                    }
                    p2.b(rotationProviderListenerTuitionPaymentFragmentbindingInflater1.asInterface(), p2.size - j, j);
                    rotationProviderListenerTuitionPaymentFragmentbindingInflater1.b();
                    return j;
                } catch (IOException e2) {
                    if (!this.cacheRequestClosed) {
                        this.cacheRequestClosed = true;
                        p0.abort();
                    }
                    throw e2;
                }
            }

            @Override // defpackage.tryToComplete
            /* JADX INFO: renamed from: timeout */
            public final cancelPreviousRequest getTimeout() {
                return source.getTimeout();
            }

            @Override // defpackage.tryToComplete, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
                if (!this.cacheRequestClosed && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    this.cacheRequestClosed = true;
                    p0.abort();
                }
                source.close();
            }
        };
        return p1.newBuilder().body(new RealResponseBody(Response.header$default(p1, HttpHeaderParser.HEADER_CONTENT_TYPE, null, 2, null), p1.body().getContentLength(), SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(trytocomplete))).build();
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\fJ\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lokhttp3/internal/cache/CacheInterceptor$Companion;", "", "<init>", "()V", "Lokhttp3/Headers;", "p0", "p1", "combine", "(Lokhttp3/Headers;Lokhttp3/Headers;)Lokhttp3/Headers;", "", "", "isContentSpecificHeader", "(Ljava/lang/String;)Z", "isEndToEnd", "Lokhttp3/Response;", "stripBody", "(Lokhttp3/Response;)Lokhttp3/Response;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Response stripBody(Response p0) {
            return (p0 != null ? p0.body() : null) != null ? p0.newBuilder().body(null).build() : p0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Headers combine(Headers p0, Headers p1) {
            Headers.Builder builder = new Headers.Builder();
            int size = p0.size();
            for (int i = 0; i < size; i++) {
                String strName = p0.name(i);
                String strValue = p0.value(i);
                if ((!StringsKt.equals("Warning", strName, true) || !StringsKt.startsWith$default(strValue, "1", false, 2, (Object) null)) && (isContentSpecificHeader(strName) || !isEndToEnd(strName) || p1.get(strName) == null)) {
                    builder.addLenient$okhttp(strName, strValue);
                }
            }
            int size2 = p1.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String strName2 = p1.name(i2);
                if (!isContentSpecificHeader(strName2) && isEndToEnd(strName2)) {
                    builder.addLenient$okhttp(strName2, p1.value(i2));
                }
            }
            return builder.build();
        }

        private final boolean isEndToEnd(String p0) {
            return (StringsKt.equals("Connection", p0, true) || StringsKt.equals("Keep-Alive", p0, true) || StringsKt.equals("Proxy-Authenticate", p0, true) || StringsKt.equals("Proxy-Authorization", p0, true) || StringsKt.equals("TE", p0, true) || StringsKt.equals("Trailers", p0, true) || StringsKt.equals("Transfer-Encoding", p0, true) || StringsKt.equals("Upgrade", p0, true)) ? false : true;
        }

        private final boolean isContentSpecificHeader(String p0) {
            return StringsKt.equals("Content-Length", p0, true) || StringsKt.equals("Content-Encoding", p0, true) || StringsKt.equals(HttpHeaderParser.HEADER_CONTENT_TYPE, p0, true);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
