package okhttp3.internal.http;

import androidx.browser.trusted.sharing.ShareTarget;
import com.android.volley.toolbox.HttpHeaderParser;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!"}, d2 = {"Lokhttp3/internal/http/RetryAndFollowUpInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/OkHttpClient;", "p0", "<init>", "(Lokhttp3/OkHttpClient;)V", "Lokhttp3/Response;", "", "p1", "Lokhttp3/Request;", "buildRedirectRequest", "(Lokhttp3/Response;Ljava/lang/String;)Lokhttp3/Request;", "Lokhttp3/internal/connection/Exchange;", "followUpRequest", "(Lokhttp3/Response;Lokhttp3/internal/connection/Exchange;)Lokhttp3/Request;", "Lokhttp3/Interceptor$Chain;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "Ljava/io/IOException;", "", "isRecoverable", "(Ljava/io/IOException;Z)Z", "Lokhttp3/internal/connection/RealCall;", "p2", "p3", "recover", "(Ljava/io/IOException;Lokhttp3/internal/connection/RealCall;Lokhttp3/Request;Z)Z", "requestIsOneShot", "(Ljava/io/IOException;Lokhttp3/Request;)Z", "", "retryAfter", "(Lokhttp3/Response;I)I", "client", "Lokhttp3/OkHttpClient;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RetryAndFollowUpInterceptor implements Interceptor {
    private static final int MAX_FOLLOW_UPS = 20;
    private final OkHttpClient client;

    public RetryAndFollowUpInterceptor(OkHttpClient okHttpClient) {
        Intrinsics.checkNotNullParameter(okHttpClient, "");
        this.client = okHttpClient;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain p0) throws IOException {
        Response responseProceed;
        Intrinsics.checkNotNullParameter(p0, "");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) p0;
        Request request$okhttp = realInterceptorChain.getRequest$okhttp();
        RealCall call$okhttp = realInterceptorChain.getCall$okhttp();
        List listEmptyList = CollectionsKt.emptyList();
        int i = 0;
        Response response = null;
        while (true) {
            boolean z = true;
            while (true) {
                call$okhttp.enterNetworkInterceptorExchange(request$okhttp, z);
                try {
                    if (call$okhttp.getCanceled()) {
                        throw new IOException("Canceled");
                    }
                    try {
                        responseProceed = realInterceptorChain.proceed(request$okhttp);
                    } catch (IOException e2) {
                        if (!recover(e2, call$okhttp, request$okhttp, !(e2 instanceof ConnectionShutdownException))) {
                            throw Util.withSuppressed(e2, listEmptyList);
                        }
                        listEmptyList = CollectionsKt.plus((Collection<? extends IOException>) listEmptyList, e2);
                        call$okhttp.exitNetworkInterceptorExchange$okhttp(true);
                        z = false;
                    } catch (RouteException e3) {
                        if (!recover(e3.getLastConnectException(), call$okhttp, request$okhttp, false)) {
                            throw Util.withSuppressed(e3.getFirstConnectException(), listEmptyList);
                        }
                        listEmptyList = CollectionsKt.plus((Collection<? extends IOException>) listEmptyList, e3.getFirstConnectException());
                        call$okhttp.exitNetworkInterceptorExchange$okhttp(true);
                        z = false;
                    }
                    call$okhttp.exitNetworkInterceptorExchange$okhttp(true);
                    z = false;
                } catch (Throwable th) {
                    call$okhttp.exitNetworkInterceptorExchange$okhttp(true);
                    throw th;
                }
            }
            if (response != null) {
                responseProceed = responseProceed.newBuilder().priorResponse(response.newBuilder().body(null).build()).build();
            }
            response = responseProceed;
            Exchange interceptorScopedExchange = call$okhttp.getInterceptorScopedExchange();
            Request requestFollowUpRequest = followUpRequest(response, interceptorScopedExchange);
            if (requestFollowUpRequest == null) {
                if (interceptorScopedExchange != null && interceptorScopedExchange.isDuplex$okhttp()) {
                    call$okhttp.timeoutEarlyExit();
                }
                call$okhttp.exitNetworkInterceptorExchange$okhttp(false);
                return response;
            }
            RequestBody requestBodyBody = requestFollowUpRequest.body();
            if (requestBodyBody != null && requestBodyBody.isOneShot()) {
                call$okhttp.exitNetworkInterceptorExchange$okhttp(false);
                return response;
            }
            ResponseBody responseBodyBody = response.body();
            if (responseBodyBody != null) {
                Util.closeQuietly(responseBodyBody);
            }
            i++;
            if (i > 20) {
                StringBuilder sb = new StringBuilder();
                sb.append("Too many follow-up requests: ");
                sb.append(i);
                throw new ProtocolException(sb.toString());
            }
            call$okhttp.exitNetworkInterceptorExchange$okhttp(true);
            request$okhttp = requestFollowUpRequest;
        }
    }

    private final boolean recover(IOException p0, RealCall p1, Request p2, boolean p3) {
        if (this.client.retryOnConnectionFailure()) {
            return !(p3 && requestIsOneShot(p0, p2)) && isRecoverable(p0, p3) && p1.retryAfterFailure();
        }
        return false;
    }

    private final boolean requestIsOneShot(IOException p0, Request p1) {
        RequestBody requestBodyBody = p1.body();
        return (requestBodyBody != null && requestBodyBody.isOneShot()) || (p0 instanceof FileNotFoundException);
    }

    private final boolean isRecoverable(IOException p0, boolean p1) {
        if (p0 instanceof ProtocolException) {
            return false;
        }
        if (p0 instanceof InterruptedIOException) {
            return (p0 instanceof SocketTimeoutException) && !p1;
        }
        return (((p0 instanceof SSLHandshakeException) && (p0.getCause() instanceof CertificateException)) || (p0 instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private final Request followUpRequest(Response p0, Exchange p1) throws IOException {
        RealConnection connection$okhttp;
        Route route = (p1 == null || (connection$okhttp = p1.getConnection$okhttp()) == null) ? null : connection$okhttp.route();
        int iCode = p0.code();
        String strMethod = p0.request().method();
        if (iCode != 307 && iCode != 308) {
            if (iCode == 401) {
                return this.client.authenticator().authenticate(route, p0);
            }
            if (iCode == 421) {
                RequestBody requestBodyBody = p0.request().body();
                if ((requestBodyBody != null && requestBodyBody.isOneShot()) || p1 == null || !p1.isCoalescedConnection$okhttp()) {
                    return null;
                }
                p1.getConnection$okhttp().noCoalescedConnections$okhttp();
                return p0.request();
            }
            if (iCode == 503) {
                Response responsePriorResponse = p0.priorResponse();
                if ((responsePriorResponse == null || responsePriorResponse.code() != 503) && retryAfter(p0, Integer.MAX_VALUE) == 0) {
                    return p0.request();
                }
                return null;
            }
            if (iCode == 407) {
                Intrinsics.checkNotNull(route);
                if (route.proxy().type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                return this.client.proxyAuthenticator().authenticate(route, p0);
            }
            if (iCode == 408) {
                if (!this.client.retryOnConnectionFailure()) {
                    return null;
                }
                RequestBody requestBodyBody2 = p0.request().body();
                if (requestBodyBody2 != null && requestBodyBody2.isOneShot()) {
                    return null;
                }
                Response responsePriorResponse2 = p0.priorResponse();
                if ((responsePriorResponse2 == null || responsePriorResponse2.code() != 408) && retryAfter(p0, 0) <= 0) {
                    return p0.request();
                }
                return null;
            }
            switch (iCode) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return buildRedirectRequest(p0, strMethod);
    }

    private final Request buildRedirectRequest(Response p0, String p1) {
        String strHeader$default;
        HttpUrl httpUrlResolve;
        if (!this.client.followRedirects() || (strHeader$default = Response.header$default(p0, "Location", null, 2, null)) == null || (httpUrlResolve = p0.request().url().resolve(strHeader$default)) == null) {
            return null;
        }
        if (!Intrinsics.areEqual(httpUrlResolve.scheme(), p0.request().url().scheme()) && !this.client.followSslRedirects()) {
            return null;
        }
        Request.Builder builderNewBuilder = p0.request().newBuilder();
        if (HttpMethod.permitsRequestBody(p1)) {
            int iCode = p0.code();
            boolean z = HttpMethod.INSTANCE.redirectsWithBody(p1) || iCode == 308 || iCode == 307;
            if (HttpMethod.INSTANCE.redirectsToGet(p1) && iCode != 308 && iCode != 307) {
                builderNewBuilder.method(ShareTarget.METHOD_GET, null);
            } else {
                builderNewBuilder.method(p1, z ? p0.request().body() : null);
            }
            if (!z) {
                builderNewBuilder.removeHeader("Transfer-Encoding");
                builderNewBuilder.removeHeader("Content-Length");
                builderNewBuilder.removeHeader(HttpHeaderParser.HEADER_CONTENT_TYPE);
            }
        }
        if (!Util.canReuseConnectionFor(p0.request().url(), httpUrlResolve)) {
            builderNewBuilder.removeHeader("Authorization");
        }
        return builderNewBuilder.url(httpUrlResolve).build();
    }

    private final int retryAfter(Response p0, int p1) {
        String strHeader$default = Response.header$default(p0, "Retry-After", null, 2, null);
        if (strHeader$default == null) {
            return p1;
        }
        if (!new Regex("\\d+").matches(strHeader$default)) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strHeader$default);
        Intrinsics.checkNotNullExpressionValue(numValueOf, "");
        return numValueOf.intValue();
    }
}
