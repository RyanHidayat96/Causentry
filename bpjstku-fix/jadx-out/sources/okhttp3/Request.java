package okhttp3;

import androidx.browser.trusted.sharing.ShareTarget;
import androidx.exifinterface.media.ExifInterface;
import com.android.volley.toolbox.HttpClientStack;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u00018BC\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0016\u0010\f\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00182\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b \u0010!J%\u0010 \u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\"2\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000b¢\u0006\u0004\b \u0010#J\u000f\u0010$\u001a\u00020\u0004H\u0017¢\u0006\u0004\b$\u0010\u001cJ\u000f\u0010%\u001a\u00020\u0002H\u0007¢\u0006\u0004\b%\u0010&R\u0019\u0010'\u001a\u0004\u0018\u00010\b8\u0007¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010\u0010R\u0011\u0010)\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b)\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010*\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010,\u001a\u00020+8G¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0018\u0010.\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00100\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b0\u0010\u001cR*\u00102\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u0004\u0012\u00020\u00010\n8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001a\u00106\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b6\u0010&"}, d2 = {"Lokhttp3/Request;", "", "Lokhttp3/HttpUrl;", "p0", "", "p1", "Lokhttp3/Headers;", "p2", "Lokhttp3/RequestBody;", "p3", "", "Ljava/lang/Class;", "p4", "<init>", "(Lokhttp3/HttpUrl;Ljava/lang/String;Lokhttp3/Headers;Lokhttp3/RequestBody;Ljava/util/Map;)V", "-deprecated_body", "()Lokhttp3/RequestBody;", "Lokhttp3/CacheControl;", "-deprecated_cacheControl", "()Lokhttp3/CacheControl;", "header", "(Ljava/lang/String;)Ljava/lang/String;", "-deprecated_headers", "()Lokhttp3/Headers;", "", "headers", "(Ljava/lang/String;)Ljava/util/List;", "-deprecated_method", "()Ljava/lang/String;", "Lokhttp3/Request$Builder;", "newBuilder", "()Lokhttp3/Request$Builder;", "tag", "()Ljava/lang/Object;", ExifInterface.GPS_DIRECTION_TRUE, "(Ljava/lang/Class;)Ljava/lang/Object;", "toString", "-deprecated_url", "()Lokhttp3/HttpUrl;", "body", "Lokhttp3/RequestBody;", "cacheControl", "Lokhttp3/Headers;", "", "isHttps", "()Z", "lazyCacheControl", "Lokhttp3/CacheControl;", FirebaseAnalytics.Param.METHOD, "Ljava/lang/String;", "tags", "Ljava/util/Map;", "getTags$okhttp", "()Ljava/util/Map;", ImagesContract.URL, "Lokhttp3/HttpUrl;", "Builder"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Request {
    private final RequestBody body;
    private final Headers headers;
    private CacheControl lazyCacheControl;
    private final String method;
    private final Map<Class<?>, Object> tags;
    private final HttpUrl url;

    public Request(HttpUrl httpUrl, String str, Headers headers, RequestBody requestBody, Map<Class<?>, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(httpUrl, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(headers, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.url = httpUrl;
        this.method = str;
        this.headers = headers;
        this.body = requestBody;
        this.tags = map;
    }

    public final HttpUrl url() {
        return this.url;
    }

    public final String method() {
        return this.method;
    }

    public final Headers headers() {
        return this.headers;
    }

    public final RequestBody body() {
        return this.body;
    }

    public final Map<Class<?>, Object> getTags$okhttp() {
        return this.tags;
    }

    public final boolean isHttps() {
        return this.url.getIsHttps();
    }

    public final String header(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.headers.get(p0);
    }

    public final List<String> headers(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.headers.values(p0);
    }

    public final Object tag() {
        return tag(Object.class);
    }

    public final <T> T tag(Class<? extends T> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return p0.cast(this.tags.get(p0));
    }

    public final Builder newBuilder() {
        return new Builder(this);
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

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = ImagesContract.URL, imports = {}))
    /* JADX INFO: renamed from: -deprecated_url, reason: not valid java name and from getter */
    public final HttpUrl getUrl() {
        return this.url;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = FirebaseAnalytics.Param.METHOD, imports = {}))
    /* JADX INFO: renamed from: -deprecated_method, reason: not valid java name and from getter */
    public final String getMethod() {
        return this.method;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "headers", imports = {}))
    /* JADX INFO: renamed from: -deprecated_headers, reason: not valid java name and from getter */
    public final Headers getHeaders() {
        return this.headers;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "body", imports = {}))
    /* JADX INFO: renamed from: -deprecated_body, reason: not valid java name and from getter */
    public final RequestBody getBody() {
        return this.body;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "cacheControl", imports = {}))
    /* JADX INFO: renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final CacheControl m9629deprecated_cacheControl() {
        return cacheControl();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.method);
        sb.append(", url=");
        sb.append(this.url);
        if (this.headers.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Pair<? extends String, ? extends String> pair : this.headers) {
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Pair<? extends String, ? extends String> pair2 = pair;
                String strComponent1 = pair2.component1();
                String strComponent2 = pair2.component2();
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(strComponent1);
                sb.append(':');
                sb.append(strComponent2);
                i++;
            }
            sb.append(']');
        }
        if (!this.tags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u000b\b\u0017\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\rH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0010H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0000H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0000H\u0017¢\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\u0016\u0010\nJ\u0017\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0010H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u001c\u0010\u0012J\u0017\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u001d\u0010\u0012J\u0017\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u001e\u0010\u0012J\u0017\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\u001f\u0010 J/\u0010#\u001a\u00020\u0000\"\u0004\b\u0000\u0010!2\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\"2\b\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0017¢\u0006\u0004\b#\u0010$J\u0019\u0010#\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0017¢\u0006\u0004\b#\u0010%J\u0017\u0010'\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020&H\u0017¢\u0006\u0004\b'\u0010(J\u0017\u0010'\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0007H\u0017¢\u0006\u0004\b'\u0010 J\u0017\u0010'\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020)H\u0017¢\u0006\u0004\b'\u0010*R$\u0010+\u001a\u0004\u0018\u00010\u00108\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u0010\u0018\u001a\u0002018\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0018\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010\u001a\u001a\u00020\u00078\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001a\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R2\u0010=\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\"\u0012\u0004\u0012\u00020\u00010<8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010'\u001a\u0004\u0018\u00010)8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b'\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G"}, d2 = {"Lokhttp3/Request$Builder;", "", "<init>", "()V", "Lokhttp3/Request;", "p0", "(Lokhttp3/Request;)V", "", "p1", "addHeader", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;", "build", "()Lokhttp3/Request;", "Lokhttp3/CacheControl;", "cacheControl", "(Lokhttp3/CacheControl;)Lokhttp3/Request$Builder;", "Lokhttp3/RequestBody;", "delete", "(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;", "get", "()Lokhttp3/Request$Builder;", "head", "header", "Lokhttp3/Headers;", "headers", "(Lokhttp3/Headers;)Lokhttp3/Request$Builder;", FirebaseAnalytics.Param.METHOD, "(Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;", "patch", "post", "put", "removeHeader", "(Ljava/lang/String;)Lokhttp3/Request$Builder;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "tag", "(Ljava/lang/Class;Ljava/lang/Object;)Lokhttp3/Request$Builder;", "(Ljava/lang/Object;)Lokhttp3/Request$Builder;", "Ljava/net/URL;", ImagesContract.URL, "(Ljava/net/URL;)Lokhttp3/Request$Builder;", "Lokhttp3/HttpUrl;", "(Lokhttp3/HttpUrl;)Lokhttp3/Request$Builder;", "body", "Lokhttp3/RequestBody;", "getBody$okhttp", "()Lokhttp3/RequestBody;", "setBody$okhttp", "(Lokhttp3/RequestBody;)V", "Lokhttp3/Headers$Builder;", "Lokhttp3/Headers$Builder;", "getHeaders$okhttp", "()Lokhttp3/Headers$Builder;", "setHeaders$okhttp", "(Lokhttp3/Headers$Builder;)V", "Ljava/lang/String;", "getMethod$okhttp", "()Ljava/lang/String;", "setMethod$okhttp", "(Ljava/lang/String;)V", "", "tags", "Ljava/util/Map;", "getTags$okhttp", "()Ljava/util/Map;", "setTags$okhttp", "(Ljava/util/Map;)V", "Lokhttp3/HttpUrl;", "getUrl$okhttp", "()Lokhttp3/HttpUrl;", "setUrl$okhttp", "(Lokhttp3/HttpUrl;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class Builder {
        private RequestBody body;
        private Headers.Builder headers;
        private String method;
        private Map<Class<?>, Object> tags;
        private HttpUrl url;

        /* JADX INFO: renamed from: getUrl$okhttp, reason: from getter */
        public final HttpUrl getUrl() {
            return this.url;
        }

        public final void setUrl$okhttp(HttpUrl httpUrl) {
            this.url = httpUrl;
        }

        /* JADX INFO: renamed from: getMethod$okhttp, reason: from getter */
        public final String getMethod() {
            return this.method;
        }

        public final void setMethod$okhttp(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.method = str;
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
        public final RequestBody getBody() {
            return this.body;
        }

        public final void setBody$okhttp(RequestBody requestBody) {
            this.body = requestBody;
        }

        public final Map<Class<?>, Object> getTags$okhttp() {
            return this.tags;
        }

        public final void setTags$okhttp(Map<Class<?>, Object> map) {
            Intrinsics.checkNotNullParameter(map, "");
            this.tags = map;
        }

        public Builder() {
            this.tags = new LinkedHashMap();
            this.method = ShareTarget.METHOD_GET;
            this.headers = new Headers.Builder();
        }

        public Builder(Request request) {
            LinkedHashMap mutableMap;
            Intrinsics.checkNotNullParameter(request, "");
            this.tags = new LinkedHashMap();
            this.url = request.url();
            this.method = request.method();
            this.body = request.body();
            if (request.getTags$okhttp().isEmpty()) {
                mutableMap = new LinkedHashMap();
            } else {
                mutableMap = MapsKt.toMutableMap(request.getTags$okhttp());
            }
            this.tags = mutableMap;
            this.headers = request.headers().newBuilder();
        }

        public Builder url(HttpUrl p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.url = p0;
            return this;
        }

        public Builder url(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (StringsKt.startsWith(p0, "ws:", true)) {
                StringBuilder sb = new StringBuilder("http:");
                String strSubstring = p0.substring(3);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                sb.append(strSubstring);
                p0 = sb.toString();
            } else if (StringsKt.startsWith(p0, "wss:", true)) {
                StringBuilder sb2 = new StringBuilder("https:");
                String strSubstring2 = p0.substring(4);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                sb2.append(strSubstring2);
                p0 = sb2.toString();
            }
            return url(HttpUrl.INSTANCE.get(p0));
        }

        public Builder url(URL p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            HttpUrl.Companion companion = HttpUrl.INSTANCE;
            String string = p0.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            return url(companion.get(string));
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

        public Builder cacheControl(CacheControl p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            String string = p0.toString();
            return string.length() == 0 ? removeHeader("Cache-Control") : header("Cache-Control", string);
        }

        public Builder get() {
            return method(ShareTarget.METHOD_GET, null);
        }

        public Builder head() {
            return method("HEAD", null);
        }

        public Builder post(RequestBody p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return method(ShareTarget.METHOD_POST, p0);
        }

        public static /* synthetic */ Builder delete$default(Builder builder, RequestBody requestBody, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
            }
            if ((i & 1) != 0) {
                requestBody = Util.EMPTY_REQUEST;
            }
            return builder.delete(requestBody);
        }

        public Builder delete(RequestBody p0) {
            return method("DELETE", p0);
        }

        public Builder put(RequestBody p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return method("PUT", p0);
        }

        public Builder patch(RequestBody p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return method(HttpClientStack.HttpPatch.METHOD_NAME, p0);
        }

        public Builder method(String p0, RequestBody p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true".toString());
            }
            if (p1 == null) {
                if (HttpMethod.requiresRequestBody(p0)) {
                    StringBuilder sb = new StringBuilder("method ");
                    sb.append(p0);
                    sb.append(" must have a request body.");
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            } else if (!HttpMethod.permitsRequestBody(p0)) {
                StringBuilder sb2 = new StringBuilder("method ");
                sb2.append(p0);
                sb2.append(" must not have a request body.");
                throw new IllegalArgumentException(sb2.toString().toString());
            }
            this.method = p0;
            this.body = p1;
            return this;
        }

        public Builder tag(Object p0) {
            return tag(Object.class, p0);
        }

        public <T> Builder tag(Class<? super T> p0, T p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p1 == null) {
                this.tags.remove(p0);
                return this;
            }
            if (this.tags.isEmpty()) {
                this.tags = new LinkedHashMap();
            }
            Map<Class<?>, Object> map = this.tags;
            T tCast = p0.cast(p1);
            Intrinsics.checkNotNull(tCast);
            map.put(p0, tCast);
            return this;
        }

        public Request build() {
            HttpUrl httpUrl = this.url;
            if (httpUrl != null) {
                return new Request(httpUrl, this.method, this.headers.build(), this.body, Util.toImmutableMap(this.tags));
            }
            throw new IllegalStateException("url == null".toString());
        }

        public final Builder delete() {
            return delete$default(this, null, 1, null);
        }
    }
}
