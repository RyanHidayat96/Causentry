package okhttp3.logging;

import com.android.volley.toolbox.HttpHeaderParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.RotationProvider1;
import defpackage.RotationProviderListenerWrapper;
import defpackage.getVisibilityRampUpAnimationDurationMillis;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0002$%B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\rH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00160\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR*\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\f\"\u0004\b\u001e\u0010!R\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "p0", "<init>", "(Lokhttp3/logging/HttpLoggingInterceptor$Logger;)V", "Lokhttp3/Headers;", "", "bodyHasUnknownEncoding", "(Lokhttp3/Headers;)Z", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "-deprecated_level", "()Lokhttp3/logging/HttpLoggingInterceptor$Level;", "Lokhttp3/Interceptor$Chain;", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "", "p1", "", "logHeader", "(Lokhttp3/Headers;I)V", "", "redactHeader", "(Ljava/lang/String;)V", "setLevel", "(Lokhttp3/logging/HttpLoggingInterceptor$Level;)Lokhttp3/logging/HttpLoggingInterceptor;", "", "headersToRedact", "Ljava/util/Set;", FirebaseAnalytics.Param.LEVEL, "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "getLevel", "(Lokhttp3/logging/HttpLoggingInterceptor$Level;)V", "logger", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "Level", "Logger"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class HttpLoggingInterceptor implements Interceptor {
    private volatile Set<String> headersToRedact;
    private volatile Level level;
    private final Logger logger;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Level;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "BASIC", "HEADERS", "BODY"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    public HttpLoggingInterceptor(Logger logger) {
        Intrinsics.checkNotNullParameter(logger, "");
        this.logger = logger;
        this.headersToRedact = SetsKt.emptySet();
        this.level = Level.NONE;
    }

    public /* synthetic */ HttpLoggingInterceptor(Logger logger, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Logger.DEFAULT : logger);
    }

    public final Level getLevel() {
        return this.level;
    }

    public final void level(Level level) {
        Intrinsics.checkNotNullParameter(level, "");
        this.level = level;
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "", "", "p0", "", "log", "(Ljava/lang/String;)V", "Companion"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface Logger {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final Logger DEFAULT = new Companion.DefaultLogger();

        void log(String p0);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger$Companion;", "", "<init>", "()V", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "DEFAULT", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "DefaultLogger"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger$Companion$DefaultLogger;", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "<init>", "()V", "", "p0", "", "log", "(Ljava/lang/String;)V"}, k = 1, mv = {1, 6, 0}, xi = 48)
            static final class DefaultLogger implements Logger {
                @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
                public final void log(String p0) {
                    Intrinsics.checkNotNullParameter(p0, "");
                    Platform.log$default(Platform.INSTANCE.get(), p0, 0, null, 6, null);
                }
            }
        }
    }

    public final void redactHeader(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        TreeSet treeSet = new TreeSet(StringsKt.getCASE_INSENSITIVE_ORDER(StringCompanionObject.INSTANCE));
        TreeSet treeSet2 = treeSet;
        CollectionsKt.addAll(treeSet2, this.headersToRedact);
        treeSet2.add(p0);
        this.headersToRedact = treeSet;
    }

    public final HttpLoggingInterceptor setLevel(Level p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        level(p0);
        return this;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to var", replaceWith = @ReplaceWith(expression = FirebaseAnalytics.Param.LEVEL, imports = {}))
    /* JADX INFO: renamed from: -deprecated_level, reason: not valid java name and from getter */
    public final Level getLevel() {
        return this.level;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain p0) throws Exception {
        String string;
        String string2;
        Charset charset;
        Long lValueOf;
        Intrinsics.checkNotNullParameter(p0, "");
        Level level = this.level;
        Request request = p0.request();
        if (level == Level.NONE) {
            return p0.proceed(request);
        }
        boolean z = level == Level.BODY;
        boolean z2 = z || level == Level.HEADERS;
        RequestBody requestBodyBody = request.body();
        Connection connection = p0.connection();
        StringBuilder sb = new StringBuilder("--> ");
        sb.append(request.method());
        sb.append(' ');
        sb.append(request.url());
        sb.append(connection != null ? Intrinsics.stringPlus(" ", connection.protocol()) : "");
        String string3 = sb.toString();
        if (!z2 && requestBodyBody != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string3);
            sb2.append(" (");
            sb2.append(requestBodyBody.contentLength());
            sb2.append("-byte body)");
            string3 = sb2.toString();
        }
        this.logger.log(string3);
        if (z2) {
            Headers headers = request.headers();
            if (requestBodyBody != null) {
                MediaType mediaType = requestBodyBody.get$contentType();
                if (mediaType != null && headers.get(HttpHeaderParser.HEADER_CONTENT_TYPE) == null) {
                    this.logger.log(Intrinsics.stringPlus("Content-Type: ", mediaType));
                }
                if (requestBodyBody.contentLength() != -1 && headers.get("Content-Length") == null) {
                    this.logger.log(Intrinsics.stringPlus("Content-Length: ", Long.valueOf(requestBodyBody.contentLength())));
                }
            }
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                logHeader(headers, i);
            }
            if (!z || requestBodyBody == null) {
                this.logger.log(Intrinsics.stringPlus("--> END ", request.method()));
            } else if (bodyHasUnknownEncoding(request.headers())) {
                Logger logger = this.logger;
                StringBuilder sb3 = new StringBuilder("--> END ");
                sb3.append(request.method());
                sb3.append(" (encoded body omitted)");
                logger.log(sb3.toString());
            } else if (requestBodyBody.isDuplex()) {
                Logger logger2 = this.logger;
                StringBuilder sb4 = new StringBuilder("--> END ");
                sb4.append(request.method());
                sb4.append(" (duplex request body omitted)");
                logger2.log(sb4.toString());
            } else if (requestBodyBody.isOneShot()) {
                Logger logger3 = this.logger;
                StringBuilder sb5 = new StringBuilder("--> END ");
                sb5.append(request.method());
                sb5.append(" (one-shot body omitted)");
                logger3.log(sb5.toString());
            } else {
                RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
                requestBodyBody.writeTo(rotationProviderListenerWrapper);
                MediaType mediaType2 = requestBodyBody.get$contentType();
                Charset charset2 = mediaType2 == null ? null : mediaType2.charset(StandardCharsets.UTF_8);
                if (charset2 == null) {
                    charset2 = StandardCharsets.UTF_8;
                    Intrinsics.checkNotNullExpressionValue(charset2, "");
                }
                this.logger.log("");
                if (Utf8Kt.isProbablyUtf8(rotationProviderListenerWrapper)) {
                    Logger logger4 = this.logger;
                    Intrinsics.checkNotNullParameter(charset2, "");
                    logger4.log(rotationProviderListenerWrapper.b(rotationProviderListenerWrapper.size, charset2));
                    Logger logger5 = this.logger;
                    StringBuilder sb6 = new StringBuilder("--> END ");
                    sb6.append(request.method());
                    sb6.append(" (");
                    sb6.append(requestBodyBody.contentLength());
                    sb6.append("-byte body)");
                    logger5.log(sb6.toString());
                } else {
                    Logger logger6 = this.logger;
                    StringBuilder sb7 = new StringBuilder("--> END ");
                    sb7.append(request.method());
                    sb7.append(" (binary ");
                    sb7.append(requestBodyBody.contentLength());
                    sb7.append("-byte body omitted)");
                    logger6.log(sb7.toString());
                }
            }
        }
        long jNanoTime = System.nanoTime();
        try {
            Response responseProceed = p0.proceed(request);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            ResponseBody responseBodyBody = responseProceed.body();
            Intrinsics.checkNotNull(responseBodyBody);
            long contentLength = responseBodyBody.getContentLength();
            if (contentLength != -1) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(contentLength);
                sb8.append("-byte");
                string = sb8.toString();
            } else {
                string = "unknown-length";
            }
            Logger logger7 = this.logger;
            StringBuilder sb9 = new StringBuilder("<-- ");
            sb9.append(responseProceed.code());
            sb9.append(responseProceed.message().length() == 0 ? "" : " ".concat(String.valueOf(responseProceed.message())));
            sb9.append(' ');
            sb9.append(responseProceed.request().url());
            sb9.append(" (");
            sb9.append(millis);
            sb9.append("ms");
            if (z2) {
                string2 = "";
            } else {
                StringBuilder sb10 = new StringBuilder(", ");
                sb10.append(string);
                sb10.append(" body");
                string2 = sb10.toString();
            }
            sb9.append(string2);
            sb9.append(')');
            logger7.log(sb9.toString());
            if (z2) {
                Headers headers2 = responseProceed.headers();
                int size2 = headers2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    logHeader(headers2, i2);
                }
                if (!z || !HttpHeaders.promisesBody(responseProceed)) {
                    this.logger.log("<-- END HTTP");
                } else {
                    if (bodyHasUnknownEncoding(responseProceed.headers())) {
                        this.logger.log("<-- END HTTP (encoded body omitted)");
                        return responseProceed;
                    }
                    RotationProvider1 source = responseBodyBody.getSource();
                    source.asBinder(Long.MAX_VALUE);
                    RotationProviderListenerWrapper rotationProviderListenerWrapperAsInterface = source.asInterface();
                    if (StringsKt.equals("gzip", headers2.get("Content-Encoding"), true)) {
                        lValueOf = Long.valueOf(rotationProviderListenerWrapperAsInterface.size);
                        getVisibilityRampUpAnimationDurationMillis getvisibilityrampupanimationdurationmillis = new getVisibilityRampUpAnimationDurationMillis(rotationProviderListenerWrapperAsInterface.clone());
                        try {
                            RotationProviderListenerWrapper rotationProviderListenerWrapper2 = new RotationProviderListenerWrapper();
                            rotationProviderListenerWrapper2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getvisibilityrampupanimationdurationmillis);
                            charset = null;
                            CloseableKt.closeFinally(getvisibilityrampupanimationdurationmillis, null);
                            rotationProviderListenerWrapperAsInterface = rotationProviderListenerWrapper2;
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                CloseableKt.closeFinally(getvisibilityrampupanimationdurationmillis, th);
                                throw th2;
                            }
                        }
                    } else {
                        charset = null;
                        lValueOf = null;
                    }
                    MediaType mediaType3 = responseBodyBody.get$contentType();
                    Charset charset3 = mediaType3 != null ? mediaType3.charset(StandardCharsets.UTF_8) : charset;
                    if (charset3 == null) {
                        charset3 = StandardCharsets.UTF_8;
                        Intrinsics.checkNotNullExpressionValue(charset3, "");
                    }
                    if (!Utf8Kt.isProbablyUtf8(rotationProviderListenerWrapperAsInterface)) {
                        this.logger.log("");
                        Logger logger8 = this.logger;
                        StringBuilder sb11 = new StringBuilder("<-- END HTTP (binary ");
                        sb11.append(rotationProviderListenerWrapperAsInterface.size);
                        sb11.append("-byte body omitted)");
                        logger8.log(sb11.toString());
                        return responseProceed;
                    }
                    if (contentLength != 0) {
                        this.logger.log("");
                        Logger logger9 = this.logger;
                        RotationProviderListenerWrapper rotationProviderListenerWrapperClone = rotationProviderListenerWrapperAsInterface.clone();
                        Intrinsics.checkNotNullParameter(charset3, "");
                        logger9.log(rotationProviderListenerWrapperClone.b(rotationProviderListenerWrapperClone.size, charset3));
                    }
                    if (lValueOf != null) {
                        Logger logger10 = this.logger;
                        StringBuilder sb12 = new StringBuilder("<-- END HTTP (");
                        sb12.append(rotationProviderListenerWrapperAsInterface.size);
                        sb12.append("-byte, ");
                        sb12.append(lValueOf);
                        sb12.append("-gzipped-byte body)");
                        logger10.log(sb12.toString());
                        return responseProceed;
                    }
                    Logger logger11 = this.logger;
                    StringBuilder sb13 = new StringBuilder("<-- END HTTP (");
                    sb13.append(rotationProviderListenerWrapperAsInterface.size);
                    sb13.append("-byte body)");
                    logger11.log(sb13.toString());
                    return responseProceed;
                }
            }
            return responseProceed;
        } catch (Exception e2) {
            this.logger.log(Intrinsics.stringPlus("<-- HTTP FAILED: ", e2));
            throw e2;
        }
    }

    private final void logHeader(Headers p0, int p1) {
        String strValue = this.headersToRedact.contains(p0.name(p1)) ? "██" : p0.value(p1);
        Logger logger = this.logger;
        StringBuilder sb = new StringBuilder();
        sb.append(p0.name(p1));
        sb.append(": ");
        sb.append(strValue);
        logger.log(sb.toString());
    }

    private final boolean bodyHasUnknownEncoding(Headers p0) {
        String str = p0.get("Content-Encoding");
        return (str == null || StringsKt.equals(str, "identity", true) || StringsKt.equals(str, "gzip", true)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpLoggingInterceptor() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
