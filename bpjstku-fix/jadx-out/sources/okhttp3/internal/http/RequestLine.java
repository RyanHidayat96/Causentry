package okhttp3.internal.http;

import java.net.Proxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.Request;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lokhttp3/internal/http/RequestLine;", "", "<init>", "()V", "Lokhttp3/Request;", "p0", "Ljava/net/Proxy$Type;", "p1", "", "get", "(Lokhttp3/Request;Ljava/net/Proxy$Type;)Ljava/lang/String;", "", "includeAuthorityInRequestLine", "(Lokhttp3/Request;Ljava/net/Proxy$Type;)Z", "Lokhttp3/HttpUrl;", "requestPath", "(Lokhttp3/HttpUrl;)Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RequestLine {
    public static final RequestLine INSTANCE = new RequestLine();

    private RequestLine() {
    }

    public final String get(Request p0, Proxy.Type p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        StringBuilder sb = new StringBuilder();
        sb.append(p0.method());
        sb.append(' ');
        RequestLine requestLine = INSTANCE;
        if (requestLine.includeAuthorityInRequestLine(p0, p1)) {
            sb.append(p0.url());
        } else {
            sb.append(requestLine.requestPath(p0.url()));
        }
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    private final boolean includeAuthorityInRequestLine(Request p0, Proxy.Type p1) {
        return !p0.isHttps() && p1 == Proxy.Type.HTTP;
    }

    public final String requestPath(HttpUrl p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        String strEncodedPath = p0.encodedPath();
        String strEncodedQuery = p0.encodedQuery();
        if (strEncodedQuery == null) {
            return strEncodedPath;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(strEncodedPath);
        sb.append('?');
        sb.append(strEncodedQuery);
        return sb.toString();
    }
}
