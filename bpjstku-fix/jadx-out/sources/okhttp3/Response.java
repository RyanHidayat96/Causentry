package okhttp3;

import defpackage.RotationProvider1;
import defpackage.RotationProviderListenerWrapper;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http.HttpHeaders;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001:\u0001bB}\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010\u001f\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0007¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\bH\u0007¢\u0006\u0004\b(\u0010)J\u0011\u0010*\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b*\u0010+J%\u0010,\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00062\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\fH\u0007¢\u0006\u0004\b.\u0010/J\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020\u00060!2\u0006\u0010\u0003\u001a\u00020\u0006H\u0007¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0006H\u0007¢\u0006\u0004\b2\u00103J\u0011\u00104\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b4\u0010 J\u000f\u00106\u001a\u000205H\u0007¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0013H\u0007¢\u0006\u0004\b8\u00109J\u0011\u0010:\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b:\u0010 J\u000f\u0010;\u001a\u00020\u0004H\u0007¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0013H\u0007¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0002H\u0007¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u0013H\u0007¢\u0006\u0004\bA\u0010>J\u000f\u0010B\u001a\u00020\u0006H\u0017¢\u0006\u0004\bB\u00103J\u000f\u0010C\u001a\u00020\fH\u0007¢\u0006\u0004\bC\u0010/R\u0019\u0010D\u001a\u0004\u0018\u00010\u000e8\u0007¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bD\u0010\u001bR\u0011\u0010F\u001a\u00020\u001c8G¢\u0006\u0006\u001a\u0004\bF\u0010\u001eR\u001c\u0010G\u001a\u0004\u0018\u00010\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bG\u0010 R\u001a\u0010I\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bI\u0010)R\u001c\u0010K\u001a\u0004\u0018\u00010\u00168\u0001X\u0081\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bK\u0010MR\u001c\u0010N\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bN\u0010+R\u001a\u00100\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010P\u001a\u0004\b0\u0010/R\u0011\u0010R\u001a\u00020Q8G¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0011\u0010T\u001a\u00020Q8G¢\u0006\u0006\u001a\u0004\bT\u0010SR\u0018\u0010U\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u001a\u0010W\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bW\u00103R\u001c\u0010Y\u001a\u0004\u0018\u00010\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\bY\u0010H\u001a\u0004\bY\u0010 R\u001c\u0010Z\u001a\u0004\u0018\u00010\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010H\u001a\u0004\bZ\u0010 R\u001a\u0010[\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b[\u0010<R\u001a\u0010]\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b]\u0010>R\u001a\u0010_\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\b_\u0010@R\u001a\u0010a\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\ba\u0010^\u001a\u0004\ba\u0010>"}, d2 = {"Lokhttp3/Response;", "Ljava/io/Closeable;", "Lokhttp3/Request;", "p0", "Lokhttp3/Protocol;", "p1", "", "p2", "", "p3", "Lokhttp3/Handshake;", "p4", "Lokhttp3/Headers;", "p5", "Lokhttp3/ResponseBody;", "p6", "p7", "p8", "p9", "", "p10", "p11", "Lokhttp3/internal/connection/Exchange;", "p12", "<init>", "(Lokhttp3/Request;Lokhttp3/Protocol;Ljava/lang/String;ILokhttp3/Handshake;Lokhttp3/Headers;Lokhttp3/ResponseBody;Lokhttp3/Response;Lokhttp3/Response;Lokhttp3/Response;JJLokhttp3/internal/connection/Exchange;)V", "-deprecated_body", "()Lokhttp3/ResponseBody;", "Lokhttp3/CacheControl;", "-deprecated_cacheControl", "()Lokhttp3/CacheControl;", "-deprecated_cacheResponse", "()Lokhttp3/Response;", "", "Lokhttp3/Challenge;", "challenges", "()Ljava/util/List;", "", "close", "()V", "-deprecated_code", "()I", "-deprecated_handshake", "()Lokhttp3/Handshake;", "header", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "-deprecated_headers", "()Lokhttp3/Headers;", "headers", "(Ljava/lang/String;)Ljava/util/List;", "-deprecated_message", "()Ljava/lang/String;", "-deprecated_networkResponse", "Lokhttp3/Response$Builder;", "newBuilder", "()Lokhttp3/Response$Builder;", "peekBody", "(J)Lokhttp3/ResponseBody;", "-deprecated_priorResponse", "-deprecated_protocol", "()Lokhttp3/Protocol;", "-deprecated_receivedResponseAtMillis", "()J", "-deprecated_request", "()Lokhttp3/Request;", "-deprecated_sentRequestAtMillis", "toString", "trailers", "body", "Lokhttp3/ResponseBody;", "cacheControl", "cacheResponse", "Lokhttp3/Response;", "code", "I", "exchange", "Lokhttp3/internal/connection/Exchange;", "()Lokhttp3/internal/connection/Exchange;", "handshake", "Lokhttp3/Handshake;", "Lokhttp3/Headers;", "", "isRedirect", "()Z", "isSuccessful", "lazyCacheControl", "Lokhttp3/CacheControl;", "message", "Ljava/lang/String;", "networkResponse", "priorResponse", "protocol", "Lokhttp3/Protocol;", "receivedResponseAtMillis", "J", "request", "Lokhttp3/Request;", "sentRequestAtMillis", "Builder"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Response implements Closeable {
    private final ResponseBody body;
    private final Response cacheResponse;
    private final int code;
    private final Exchange exchange;
    private final Handshake handshake;
    private final Headers headers;
    private CacheControl lazyCacheControl;
    private final String message;
    private final Response networkResponse;
    private final Response priorResponse;
    private final Protocol protocol;
    private final long receivedResponseAtMillis;
    private final Request request;
    private final long sentRequestAtMillis;

    public Response(Request request, Protocol protocol, String str, int i, Handshake handshake, Headers headers, ResponseBody responseBody, Response response, Response response2, Response response3, long j, long j2, Exchange exchange) {
        Intrinsics.checkNotNullParameter(request, "");
        Intrinsics.checkNotNullParameter(protocol, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(headers, "");
        this.request = request;
        this.protocol = protocol;
        this.message = str;
        this.code = i;
        this.handshake = handshake;
        this.headers = headers;
        this.body = responseBody;
        this.networkResponse = response;
        this.cacheResponse = response2;
        this.priorResponse = response3;
        this.sentRequestAtMillis = j;
        this.receivedResponseAtMillis = j2;
        this.exchange = exchange;
    }

    public final Request request() {
        return this.request;
    }

    public final Protocol protocol() {
        return this.protocol;
    }

    public final String message() {
        return this.message;
    }

    public final int code() {
        return this.code;
    }

    public final Handshake handshake() {
        return this.handshake;
    }

    public final Headers headers() {
        return this.headers;
    }

    public final ResponseBody body() {
        return this.body;
    }

    public final Response networkResponse() {
        return this.networkResponse;
    }

    public final Response cacheResponse() {
        return this.cacheResponse;
    }

    public final Response priorResponse() {
        return this.priorResponse;
    }

    public final long sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    public final long receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    /* JADX INFO: renamed from: exchange, reason: from getter */
    public final Exchange getExchange() {
        return this.exchange;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "request", imports = {}))
    /* JADX INFO: renamed from: -deprecated_request, reason: not valid java name and from getter */
    public final Request getRequest() {
        return this.request;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "protocol", imports = {}))
    /* JADX INFO: renamed from: -deprecated_protocol, reason: not valid java name and from getter */
    public final Protocol getProtocol() {
        return this.protocol;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "code", imports = {}))
    /* JADX INFO: renamed from: -deprecated_code, reason: not valid java name and from getter */
    public final int getCode() {
        return this.code;
    }

    public final boolean isSuccessful() {
        int i = this.code;
        return 200 <= i && i < 300;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "message", imports = {}))
    /* JADX INFO: renamed from: -deprecated_message, reason: not valid java name and from getter */
    public final String getMessage() {
        return this.message;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "handshake", imports = {}))
    /* JADX INFO: renamed from: -deprecated_handshake, reason: not valid java name and from getter */
    public final Handshake getHandshake() {
        return this.handshake;
    }

    public final List<String> headers(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.headers.values(p0);
    }

    public static /* synthetic */ String header$default(Response response, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return response.header(str, str2);
    }

    public final String header(String p0, String p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        String str = this.headers.get(p0);
        return str == null ? p1 : str;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "headers", imports = {}))
    /* JADX INFO: renamed from: -deprecated_headers, reason: not valid java name and from getter */
    public final Headers getHeaders() {
        return this.headers;
    }

    public final Headers trailers() throws IOException {
        Exchange exchange = this.exchange;
        if (exchange != null) {
            return exchange.trailers();
        }
        throw new IllegalStateException("trailers not available".toString());
    }

    public final ResponseBody peekBody(long p0) throws IOException {
        ResponseBody responseBody = this.body;
        Intrinsics.checkNotNull(responseBody);
        RotationProvider1 rotationProvider1G = responseBody.source().g();
        RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
        rotationProvider1G.asBinder(p0);
        RotationProvider1 rotationProvider1 = rotationProvider1G;
        long jMin = Math.min(p0, rotationProvider1G.asInterface().size);
        Intrinsics.checkNotNullParameter(rotationProvider1, "");
        while (jMin > 0) {
            long j = rotationProvider1.read(rotationProviderListenerWrapper, jMin);
            if (j == -1) {
                throw new EOFException();
            }
            jMin -= j;
        }
        return ResponseBody.INSTANCE.create(rotationProviderListenerWrapper, this.body.contentType(), rotationProviderListenerWrapper.size);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "body", imports = {}))
    /* JADX INFO: renamed from: -deprecated_body, reason: not valid java name and from getter */
    public final ResponseBody getBody() {
        return this.body;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public final boolean isRedirect() {
        int i = this.code;
        if (i == 307 || i == 308) {
            return true;
        }
        switch (i) {
            case 300:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "networkResponse", imports = {}))
    /* JADX INFO: renamed from: -deprecated_networkResponse, reason: not valid java name and from getter */
    public final Response getNetworkResponse() {
        return this.networkResponse;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "cacheResponse", imports = {}))
    /* JADX INFO: renamed from: -deprecated_cacheResponse, reason: not valid java name and from getter */
    public final Response getCacheResponse() {
        return this.cacheResponse;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "priorResponse", imports = {}))
    /* JADX INFO: renamed from: -deprecated_priorResponse, reason: not valid java name and from getter */
    public final Response getPriorResponse() {
        return this.priorResponse;
    }

    public final List<Challenge> challenges() {
        String str;
        Headers headers = this.headers;
        int i = this.code;
        if (i == 401) {
            str = "WWW-Authenticate";
        } else if (i == 407) {
            str = "Proxy-Authenticate";
        } else {
            return CollectionsKt.emptyList();
        }
        return HttpHeaders.parseChallenges(headers, str);
    }

    public final CacheControl cacheControl() {
        CacheControl cacheControl = this.lazyCacheControl;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl cacheControl2 = CacheControl.INSTANCE.parse(this.headers);
        this.lazyCacheControl = cacheControl2;
        return cacheControl2;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "cacheControl", imports = {}))
    /* JADX INFO: renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final CacheControl m9634deprecated_cacheControl() {
        return cacheControl();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "sentRequestAtMillis", imports = {}))
    /* JADX INFO: renamed from: -deprecated_sentRequestAtMillis, reason: not valid java name and from getter */
    public final long getSentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "receivedResponseAtMillis", imports = {}))
    /* JADX INFO: renamed from: -deprecated_receivedResponseAtMillis, reason: not valid java name and from getter */
    public final long getReceivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ResponseBody responseBody = this.body;
        if (responseBody == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        responseBody.close();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response{protocol=");
        sb.append(this.protocol);
        sb.append(", code=");
        sb.append(this.code);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", url=");
        sb.append(this.request.url());
        sb.append('}');
        return sb.toString();
    }

    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0017\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u000bH\u0017¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0006J!\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0019H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\u001c\u0010\nJ\u0017\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u001dH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020 H\u0000¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0007H\u0017¢\u0006\u0004\b#\u0010$J\u0019\u0010%\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b%\u0010\u0011J\u0019\u0010&\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b&\u0010\u0011J\u0017\u0010(\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020'H\u0017¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020*H\u0017¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0007H\u0017¢\u0006\u0004\b-\u0010$J\u0017\u0010/\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020.H\u0017¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020*H\u0017¢\u0006\u0004\b1\u0010,R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\f\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0010\u00107\u001a\u0004\b8\u0010\u000f\"\u0004\b9\u0010\u0006R\"\u0010\u0017\u001a\u00020\u00168\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010?\u001a\u0004\u0018\u00010 8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010\"R$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010\u001e\u001a\u00020I8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010#\u001a\u0004\u0018\u00010\u00078\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b#\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR$\u0010%\u001a\u0004\u0018\u00010\u00048\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b%\u00107\u001a\u0004\bT\u0010\u000f\"\u0004\bU\u0010\u0006R$\u0010&\u001a\u0004\u0018\u00010\u00048\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b&\u00107\u001a\u0004\bV\u0010\u000f\"\u0004\bW\u0010\u0006R$\u0010(\u001a\u0004\u0018\u00010'8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b(\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010+\u001a\u00020*8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b+\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR$\u0010/\u001a\u0004\u0018\u00010.8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b/\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u00101\u001a\u00020*8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b1\u0010]\u001a\u0004\bg\u0010_\"\u0004\bh\u0010a"}, d2 = {"Lokhttp3/Response$Builder;", "", "<init>", "()V", "Lokhttp3/Response;", "p0", "(Lokhttp3/Response;)V", "", "p1", "addHeader", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Response$Builder;", "Lokhttp3/ResponseBody;", "body", "(Lokhttp3/ResponseBody;)Lokhttp3/Response$Builder;", "build", "()Lokhttp3/Response;", "cacheResponse", "(Lokhttp3/Response;)Lokhttp3/Response$Builder;", "", "checkPriorResponse", "checkSupportResponse", "(Ljava/lang/String;Lokhttp3/Response;)V", "", "code", "(I)Lokhttp3/Response$Builder;", "Lokhttp3/Handshake;", "handshake", "(Lokhttp3/Handshake;)Lokhttp3/Response$Builder;", "header", "Lokhttp3/Headers;", "headers", "(Lokhttp3/Headers;)Lokhttp3/Response$Builder;", "Lokhttp3/internal/connection/Exchange;", "initExchange$okhttp", "(Lokhttp3/internal/connection/Exchange;)V", "message", "(Ljava/lang/String;)Lokhttp3/Response$Builder;", "networkResponse", "priorResponse", "Lokhttp3/Protocol;", "protocol", "(Lokhttp3/Protocol;)Lokhttp3/Response$Builder;", "", "receivedResponseAtMillis", "(J)Lokhttp3/Response$Builder;", "removeHeader", "Lokhttp3/Request;", "request", "(Lokhttp3/Request;)Lokhttp3/Response$Builder;", "sentRequestAtMillis", "Lokhttp3/ResponseBody;", "getBody$okhttp", "()Lokhttp3/ResponseBody;", "setBody$okhttp", "(Lokhttp3/ResponseBody;)V", "Lokhttp3/Response;", "getCacheResponse$okhttp", "setCacheResponse$okhttp", "I", "getCode$okhttp", "()I", "setCode$okhttp", "(I)V", "exchange", "Lokhttp3/internal/connection/Exchange;", "getExchange$okhttp", "()Lokhttp3/internal/connection/Exchange;", "setExchange$okhttp", "Lokhttp3/Handshake;", "getHandshake$okhttp", "()Lokhttp3/Handshake;", "setHandshake$okhttp", "(Lokhttp3/Handshake;)V", "Lokhttp3/Headers$Builder;", "Lokhttp3/Headers$Builder;", "getHeaders$okhttp", "()Lokhttp3/Headers$Builder;", "setHeaders$okhttp", "(Lokhttp3/Headers$Builder;)V", "Ljava/lang/String;", "getMessage$okhttp", "()Ljava/lang/String;", "setMessage$okhttp", "(Ljava/lang/String;)V", "getNetworkResponse$okhttp", "setNetworkResponse$okhttp", "getPriorResponse$okhttp", "setPriorResponse$okhttp", "Lokhttp3/Protocol;", "getProtocol$okhttp", "()Lokhttp3/Protocol;", "setProtocol$okhttp", "(Lokhttp3/Protocol;)V", "J", "getReceivedResponseAtMillis$okhttp", "()J", "setReceivedResponseAtMillis$okhttp", "(J)V", "Lokhttp3/Request;", "getRequest$okhttp", "()Lokhttp3/Request;", "setRequest$okhttp", "(Lokhttp3/Request;)V", "getSentRequestAtMillis$okhttp", "setSentRequestAtMillis$okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class Builder {
        private ResponseBody body;
        private Response cacheResponse;
        private int code;
        private Exchange exchange;
        private Handshake handshake;
        private Headers.Builder headers;
        private String message;
        private Response networkResponse;
        private Response priorResponse;
        private Protocol protocol;
        private long receivedResponseAtMillis;
        private Request request;
        private long sentRequestAtMillis;

        /* JADX INFO: renamed from: getRequest$okhttp, reason: from getter */
        public final Request getRequest() {
            return this.request;
        }

        public final void setRequest$okhttp(Request request) {
            this.request = request;
        }

        /* JADX INFO: renamed from: getProtocol$okhttp, reason: from getter */
        public final Protocol getProtocol() {
            return this.protocol;
        }

        public final void setProtocol$okhttp(Protocol protocol) {
            this.protocol = protocol;
        }

        /* JADX INFO: renamed from: getCode$okhttp, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        public final void setCode$okhttp(int i) {
            this.code = i;
        }

        /* JADX INFO: renamed from: getMessage$okhttp, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final void setMessage$okhttp(String str) {
            this.message = str;
        }

        /* JADX INFO: renamed from: getHandshake$okhttp, reason: from getter */
        public final Handshake getHandshake() {
            return this.handshake;
        }

        public final void setHandshake$okhttp(Handshake handshake) {
            this.handshake = handshake;
        }

        /* JADX INFO: renamed from: getHeaders$okhttp, reason: from getter */
        public final Headers.Builder getHeaders() {
            return this.headers;
        }

        public final void setHeaders$okhttp(Headers.Builder builder) {
            Intrinsics.checkNotNullParameter(builder, "");
            this.headers = builder;
        }

        /* JADX INFO: renamed from: getBody$okhttp, reason: from getter */
        public final ResponseBody getBody() {
            return this.body;
        }

        public final void setBody$okhttp(ResponseBody responseBody) {
            this.body = responseBody;
        }

        /* JADX INFO: renamed from: getNetworkResponse$okhttp, reason: from getter */
        public final Response getNetworkResponse() {
            return this.networkResponse;
        }

        public final void setNetworkResponse$okhttp(Response response) {
            this.networkResponse = response;
        }

        /* JADX INFO: renamed from: getCacheResponse$okhttp, reason: from getter */
        public final Response getCacheResponse() {
            return this.cacheResponse;
        }

        public final void setCacheResponse$okhttp(Response response) {
            this.cacheResponse = response;
        }

        /* JADX INFO: renamed from: getPriorResponse$okhttp, reason: from getter */
        public final Response getPriorResponse() {
            return this.priorResponse;
        }

        public final void setPriorResponse$okhttp(Response response) {
            this.priorResponse = response;
        }

        /* JADX INFO: renamed from: getSentRequestAtMillis$okhttp, reason: from getter */
        public final long getSentRequestAtMillis() {
            return this.sentRequestAtMillis;
        }

        public final void setSentRequestAtMillis$okhttp(long j) {
            this.sentRequestAtMillis = j;
        }

        /* JADX INFO: renamed from: getReceivedResponseAtMillis$okhttp, reason: from getter */
        public final long getReceivedResponseAtMillis() {
            return this.receivedResponseAtMillis;
        }

        public final void setReceivedResponseAtMillis$okhttp(long j) {
            this.receivedResponseAtMillis = j;
        }

        /* JADX INFO: renamed from: getExchange$okhttp, reason: from getter */
        public final Exchange getExchange() {
            return this.exchange;
        }

        public final void setExchange$okhttp(Exchange exchange) {
            this.exchange = exchange;
        }

        public Builder() {
            this.code = -1;
            this.headers = new Headers.Builder();
        }

        public Builder(Response response) {
            Intrinsics.checkNotNullParameter(response, "");
            this.code = -1;
            this.request = response.request();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.handshake = response.handshake();
            this.headers = response.headers().newBuilder();
            this.body = response.body();
            this.networkResponse = response.networkResponse();
            this.cacheResponse = response.cacheResponse();
            this.priorResponse = response.priorResponse();
            this.sentRequestAtMillis = response.sentRequestAtMillis();
            this.receivedResponseAtMillis = response.receivedResponseAtMillis();
            this.exchange = response.getExchange();
        }

        public Builder request(Request p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.request = p0;
            return this;
        }

        public Builder protocol(Protocol p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.protocol = p0;
            return this;
        }

        public Builder code(int p0) {
            this.code = p0;
            return this;
        }

        public Builder message(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.message = p0;
            return this;
        }

        public Builder handshake(Handshake p0) {
            this.handshake = p0;
            return this;
        }

        public Builder header(String p0, String p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            this.headers.set(p0, p1);
            return this;
        }

        public Builder addHeader(String p0, String p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            this.headers.add(p0, p1);
            return this;
        }

        public Builder removeHeader(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.headers.removeAll(p0);
            return this;
        }

        public Builder headers(Headers p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.headers = p0.newBuilder();
            return this;
        }

        public Builder body(ResponseBody p0) {
            this.body = p0;
            return this;
        }

        public Builder networkResponse(Response p0) {
            checkSupportResponse("networkResponse", p0);
            this.networkResponse = p0;
            return this;
        }

        public Builder cacheResponse(Response p0) {
            checkSupportResponse("cacheResponse", p0);
            this.cacheResponse = p0;
            return this;
        }

        private final void checkSupportResponse(String p0, Response p1) {
            if (p1 != null) {
                if (p1.body() != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(p0);
                    sb.append(".body != null");
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                if (p1.networkResponse() != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(p0);
                    sb2.append(".networkResponse != null");
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
                if (p1.cacheResponse() != null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(p0);
                    sb3.append(".cacheResponse != null");
                    throw new IllegalArgumentException(sb3.toString().toString());
                }
                if (p1.priorResponse() == null) {
                    return;
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append(p0);
                sb4.append(".priorResponse != null");
                throw new IllegalArgumentException(sb4.toString().toString());
            }
        }

        public Builder priorResponse(Response p0) {
            checkPriorResponse(p0);
            this.priorResponse = p0;
            return this;
        }

        private final void checkPriorResponse(Response p0) {
            if (p0 != null && p0.body() != null) {
                throw new IllegalArgumentException("priorResponse.body != null".toString());
            }
        }

        public Builder sentRequestAtMillis(long p0) {
            this.sentRequestAtMillis = p0;
            return this;
        }

        public Builder receivedResponseAtMillis(long p0) {
            this.receivedResponseAtMillis = p0;
            return this;
        }

        public final void initExchange$okhttp(Exchange p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.exchange = p0;
        }

        public Response build() {
            int i = this.code;
            if (i < 0) {
                StringBuilder sb = new StringBuilder("code < 0: ");
                sb.append(this.code);
                throw new IllegalStateException(sb.toString().toString());
            }
            Request request = this.request;
            if (request == null) {
                throw new IllegalStateException("request == null".toString());
            }
            Protocol protocol = this.protocol;
            if (protocol == null) {
                throw new IllegalStateException("protocol == null".toString());
            }
            String str = this.message;
            if (str != null) {
                return new Response(request, protocol, str, i, this.handshake, this.headers.build(), this.body, this.networkResponse, this.cacheResponse, this.priorResponse, this.sentRequestAtMillis, this.receivedResponseAtMillis, this.exchange);
            }
            throw new IllegalStateException("message == null".toString());
        }
    }

    public final String header(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return header$default(this, str, null, 2, null);
    }
}
