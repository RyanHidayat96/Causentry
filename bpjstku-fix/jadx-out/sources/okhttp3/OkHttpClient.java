package okhttp3;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import defpackage.AutoValue_Bitmap2JpegBytes_In;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.getVideoProfiles;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.proxy.NullProxySelector;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000 \u008f\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0090\u0001\u008f\u0001B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0015\u0010\u0011J\u000f\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0007¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0007¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020)H\u0007¢\u0006\u0004\b,\u0010+J\u000f\u0010.\u001a\u00020-H\u0007¢\u0006\u0004\b.\u0010/J\u0015\u00101\u001a\b\u0012\u0004\u0012\u0002000\u0019H\u0007¢\u0006\u0004\b1\u0010\u001cJ\u0015\u00102\u001a\b\u0012\u0004\u0012\u0002000\u0019H\u0007¢\u0006\u0004\b2\u0010\u001cJ\u000f\u00103\u001a\u00020\u0006H\u0017¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u0002062\u0006\u0010\u0007\u001a\u000205H\u0017¢\u0006\u0004\b7\u00108J\u001f\u0010<\u001a\u00020;2\u0006\u0010\u0007\u001a\u0002052\u0006\u0010:\u001a\u000209H\u0017¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u000fH\u0007¢\u0006\u0004\b>\u0010\u0011J\u0015\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u0019H\u0007¢\u0006\u0004\b@\u0010\u001cJ\u0011\u0010B\u001a\u0004\u0018\u00010AH\u0007¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\tH\u0007¢\u0006\u0004\bD\u0010\u000bJ\u000f\u0010F\u001a\u00020EH\u0007¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u000fH\u0007¢\u0006\u0004\bH\u0010\u0011J\u000f\u0010I\u001a\u00020)H\u0007¢\u0006\u0004\bI\u0010+J\u000f\u0010K\u001a\u00020JH\u0007¢\u0006\u0004\bK\u0010LJ\u000f\u0010N\u001a\u00020MH\u0007¢\u0006\u0004\bN\u0010OJ\u000f\u0010Q\u001a\u00020PH\u0002¢\u0006\u0004\bQ\u0010\u0005J\u000f\u0010R\u001a\u00020\u000fH\u0007¢\u0006\u0004\bR\u0010\u0011R\u001a\u0010S\u001a\u00020\t8GX\u0087\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bS\u0010\u000bR\u001c\u0010U\u001a\u0004\u0018\u00010\f8GX\u0087\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bU\u0010\u000eR\u001a\u0010W\u001a\u00020\u000f8GX\u0087\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bW\u0010\u0011R\u001c\u0010Z\u001a\u0004\u0018\u00010Y8GX\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\bZ\u0010\\R\u001a\u0010]\u001a\u00020\u00128GX\u0087\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b]\u0010\u0014R\u001a\u0010_\u001a\u00020\u000f8GX\u0087\u0004¢\u0006\f\n\u0004\b_\u0010X\u001a\u0004\b_\u0010\u0011R\u001a\u0010`\u001a\u00020\u00168GX\u0087\u0004¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\b`\u0010\u0018R \u0010b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198GX\u0087\u0004¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bb\u0010\u001cR\u001a\u0010d\u001a\u00020\u001d8GX\u0087\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bd\u0010\u001fR\u001a\u0010f\u001a\u00020 8GX\u0087\u0004¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bf\u0010\"R\u001a\u0010h\u001a\u00020#8GX\u0087\u0004¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bh\u0010%R\u001a\u0010j\u001a\u00020&8GX\u0087\u0004¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bj\u0010(R\u001a\u0010l\u001a\u00020)8GX\u0087\u0004¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bl\u0010+R\u001a\u0010n\u001a\u00020)8GX\u0087\u0004¢\u0006\f\n\u0004\bn\u0010m\u001a\u0004\bn\u0010+R\u001a\u0010o\u001a\u00020-8GX\u0087\u0004¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bo\u0010/R \u0010q\u001a\b\u0012\u0004\u0012\u0002000\u00198GX\u0087\u0004¢\u0006\f\n\u0004\bq\u0010c\u001a\u0004\bq\u0010\u001cR\u001a\u0010s\u001a\u00020r8GX\u0087\u0004¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bs\u0010uR \u0010v\u001a\b\u0012\u0004\u0012\u0002000\u00198GX\u0087\u0004¢\u0006\f\n\u0004\bv\u0010c\u001a\u0004\bv\u0010\u001cR\u001a\u0010w\u001a\u00020\u000f8GX\u0087\u0004¢\u0006\f\n\u0004\bw\u0010X\u001a\u0004\bw\u0010\u0011R \u0010x\u001a\b\u0012\u0004\u0012\u00020?0\u00198GX\u0087\u0004¢\u0006\f\n\u0004\bx\u0010c\u001a\u0004\bx\u0010\u001cR\u001c\u0010y\u001a\u0004\u0018\u00010A8GX\u0087\u0004¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\by\u0010CR\u001a\u0010{\u001a\u00020\t8GX\u0087\u0004¢\u0006\f\n\u0004\b{\u0010T\u001a\u0004\b{\u0010\u000bR\u001a\u0010|\u001a\u00020E8GX\u0087\u0004¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b|\u0010GR\u001a\u0010~\u001a\u00020\u000f8GX\u0087\u0004¢\u0006\f\n\u0004\b~\u0010X\u001a\u0004\b~\u0010\u0011R\u001a\u0010\u007f\u001a\u00020)8GX\u0087\u0004¢\u0006\f\n\u0004\b\u007f\u0010m\u001a\u0004\b\u007f\u0010+R \u0010\u0081\u0001\u001a\u00030\u0080\u00018\u0007X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001e\u0010\u0085\u0001\u001a\u00020J8GX\u0087\u0004¢\u0006\u000f\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0005\b\u0085\u0001\u0010LR\u0013\u0010\u0087\u0001\u001a\u00020M8G¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010OR\u0019\u0010\u0088\u0001\u001a\u0004\u0018\u00010M8\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001d\u0010\u008a\u0001\u001a\u00020\u000f8GX\u0087\u0004¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010X\u001a\u0005\b\u008a\u0001\u0010\u0011R\"\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008b\u00018GX\u0087\u0004¢\u0006\u0010\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008c\u0001\u0010\u008e\u0001"}, d2 = {"Lokhttp3/OkHttpClient;", "", "Lokhttp3/Call$Factory;", "Lokhttp3/WebSocket$Factory;", "<init>", "()V", "Lokhttp3/OkHttpClient$Builder;", "p0", "(Lokhttp3/OkHttpClient$Builder;)V", "Lokhttp3/Authenticator;", "-deprecated_authenticator", "()Lokhttp3/Authenticator;", "Lokhttp3/Cache;", "-deprecated_cache", "()Lokhttp3/Cache;", "", "-deprecated_callTimeoutMillis", "()I", "Lokhttp3/CertificatePinner;", "-deprecated_certificatePinner", "()Lokhttp3/CertificatePinner;", "-deprecated_connectTimeoutMillis", "Lokhttp3/ConnectionPool;", "-deprecated_connectionPool", "()Lokhttp3/ConnectionPool;", "", "Lokhttp3/ConnectionSpec;", "-deprecated_connectionSpecs", "()Ljava/util/List;", "Lokhttp3/CookieJar;", "-deprecated_cookieJar", "()Lokhttp3/CookieJar;", "Lokhttp3/Dispatcher;", "-deprecated_dispatcher", "()Lokhttp3/Dispatcher;", "Lokhttp3/Dns;", "-deprecated_dns", "()Lokhttp3/Dns;", "Lokhttp3/EventListener$Factory;", "-deprecated_eventListenerFactory", "()Lokhttp3/EventListener$Factory;", "", "-deprecated_followRedirects", "()Z", "-deprecated_followSslRedirects", "Ljavax/net/ssl/HostnameVerifier;", "-deprecated_hostnameVerifier", "()Ljavax/net/ssl/HostnameVerifier;", "Lokhttp3/Interceptor;", "-deprecated_interceptors", "-deprecated_networkInterceptors", "newBuilder", "()Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/Request;", "Lokhttp3/Call;", "newCall", "(Lokhttp3/Request;)Lokhttp3/Call;", "Lokhttp3/WebSocketListener;", "p1", "Lokhttp3/WebSocket;", "newWebSocket", "(Lokhttp3/Request;Lokhttp3/WebSocketListener;)Lokhttp3/WebSocket;", "-deprecated_pingIntervalMillis", "Lokhttp3/Protocol;", "-deprecated_protocols", "Ljava/net/Proxy;", "-deprecated_proxy", "()Ljava/net/Proxy;", "-deprecated_proxyAuthenticator", "Ljava/net/ProxySelector;", "-deprecated_proxySelector", "()Ljava/net/ProxySelector;", "-deprecated_readTimeoutMillis", "-deprecated_retryOnConnectionFailure", "Ljavax/net/SocketFactory;", "-deprecated_socketFactory", "()Ljavax/net/SocketFactory;", "Ljavax/net/ssl/SSLSocketFactory;", "-deprecated_sslSocketFactory", "()Ljavax/net/ssl/SSLSocketFactory;", "", "verifyClientState", "-deprecated_writeTimeoutMillis", "authenticator", "Lokhttp3/Authenticator;", "cache", "Lokhttp3/Cache;", "callTimeoutMillis", "I", "Lokhttp3/internal/tls/CertificateChainCleaner;", "certificateChainCleaner", "Lokhttp3/internal/tls/CertificateChainCleaner;", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "certificatePinner", "Lokhttp3/CertificatePinner;", "connectTimeoutMillis", "connectionPool", "Lokhttp3/ConnectionPool;", "connectionSpecs", "Ljava/util/List;", "cookieJar", "Lokhttp3/CookieJar;", "dispatcher", "Lokhttp3/Dispatcher;", "dns", "Lokhttp3/Dns;", "eventListenerFactory", "Lokhttp3/EventListener$Factory;", "followRedirects", "Z", "followSslRedirects", "hostnameVerifier", "Ljavax/net/ssl/HostnameVerifier;", "interceptors", "", "minWebSocketMessageToCompress", "J", "()J", "networkInterceptors", "pingIntervalMillis", "protocols", "proxy", "Ljava/net/Proxy;", "proxyAuthenticator", "proxySelector", "Ljava/net/ProxySelector;", "readTimeoutMillis", "retryOnConnectionFailure", "Lokhttp3/internal/connection/RouteDatabase;", "routeDatabase", "Lokhttp3/internal/connection/RouteDatabase;", "getRouteDatabase", "()Lokhttp3/internal/connection/RouteDatabase;", "socketFactory", "Ljavax/net/SocketFactory;", "sslSocketFactory", "sslSocketFactoryOrNull", "Ljavax/net/ssl/SSLSocketFactory;", "writeTimeoutMillis", "Ljavax/net/ssl/X509TrustManager;", "x509TrustManager", "Ljavax/net/ssl/X509TrustManager;", "()Ljavax/net/ssl/X509TrustManager;", "Companion", "Builder"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class OkHttpClient implements Cloneable, Call.Factory, WebSocket.Factory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final List<ConnectionSpec> DEFAULT_CONNECTION_SPECS;
    private static final List<Protocol> DEFAULT_PROTOCOLS;
    private static char TuitionPaymentFragmentbindingInflater1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f1285a;
    private static int asBinder;
    private static int b;
    private static int cancel;
    private static byte[] d;
    private static short[] g;
    private final Authenticator authenticator;
    private final Cache cache;
    private final int callTimeoutMillis;
    private final CertificateChainCleaner certificateChainCleaner;
    private final CertificatePinner certificatePinner;
    private final int connectTimeoutMillis;
    private final ConnectionPool connectionPool;
    private final List<ConnectionSpec> connectionSpecs;
    private final CookieJar cookieJar;
    private final Dispatcher dispatcher;
    private final Dns dns;
    private final EventListener.Factory eventListenerFactory;
    private final boolean followRedirects;
    private final boolean followSslRedirects;
    private final HostnameVerifier hostnameVerifier;
    private final List<Interceptor> interceptors;
    private final long minWebSocketMessageToCompress;
    private final List<Interceptor> networkInterceptors;
    private final int pingIntervalMillis;
    private final List<Protocol> protocols;
    private final Proxy proxy;
    private final Authenticator proxyAuthenticator;
    private final ProxySelector proxySelector;
    private final int readTimeoutMillis;
    private final boolean retryOnConnectionFailure;
    private final RouteDatabase routeDatabase;
    private final SocketFactory socketFactory;
    private final SSLSocketFactory sslSocketFactoryOrNull;
    private final int writeTimeoutMillis;
    private final X509TrustManager x509TrustManager;
    private static final byte[] $$c = {107, 48, 57, 107};
    private static final int $$f = 35;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {46, 126, -84, 108, -38, 7, 0, 21, -13, 10, 38, -14, 9, -2, 14, 20, -21, 23, -9, 6, 17, -7};
    private static final int $$e = 120;
    private static final byte[] $$a = {115, 25, -47, -94, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 174;
    private static int INotificationSideChannel = 0;
    private static int notify = 1;
    private static int asInterface = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 84
            byte[] r0 = okhttp3.OkHttpClient.$$a
            int r7 = r7 + 4
            int r8 = r8 * 52
            int r8 = 53 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            int r7 = r7 + 1
            r1[r3] = r5
            if (r4 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r3 = r0[r7]
        L26:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.OkHttpClient.c(byte, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void h(byte r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 31
            int r8 = 98 - r8
            int r9 = r9 * 18
            int r9 = 19 - r9
            byte[] r0 = okhttp3.OkHttpClient.$$d
            int r7 = r7 + 4
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r9
            r4 = r2
            goto L2b
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            int r7 = r7 + 1
            r1[r3] = r5
            if (r4 != r9) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r7]
            r6 = r3
            r3 = r8
            r8 = r6
        L2b:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + 6
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.OkHttpClient.h(byte, short, byte, java.lang.Object[]):void");
    }

    public OkHttpClient(Builder builder) throws NoSuchAlgorithmException, KeyStoreException {
        NullProxySelector proxySelector$okhttp;
        AutoValue_Bitmap2JpegBytes_In.TuitionPaymentFragmentbindingInflater1(builder);
        Intrinsics.checkNotNullParameter(builder, "");
        this.dispatcher = builder.getDispatcher$okhttp();
        this.connectionPool = builder.getConnectionPool$okhttp();
        this.interceptors = Util.toImmutableList(builder.getInterceptors$okhttp());
        this.networkInterceptors = Util.toImmutableList(builder.getNetworkInterceptors$okhttp());
        this.eventListenerFactory = builder.getEventListenerFactory$okhttp();
        this.retryOnConnectionFailure = builder.getRetryOnConnectionFailure$okhttp();
        this.authenticator = builder.getAuthenticator$okhttp();
        this.followRedirects = builder.getFollowRedirects$okhttp();
        this.followSslRedirects = builder.getFollowSslRedirects$okhttp();
        this.cookieJar = builder.getCookieJar$okhttp();
        this.cache = builder.getCache$okhttp();
        this.dns = builder.getDns$okhttp();
        this.proxy = builder.getProxy$okhttp();
        if (builder.getProxy$okhttp() != null) {
            proxySelector$okhttp = NullProxySelector.INSTANCE;
        } else {
            proxySelector$okhttp = builder.getProxySelector$okhttp();
            if (proxySelector$okhttp == null) {
                proxySelector$okhttp = ProxySelector.getDefault();
                int i = 2 % 2;
            }
            if (proxySelector$okhttp == null) {
                int i2 = INotificationSideChannel + 63;
                notify = i2 % 128;
                int i3 = i2 % 2;
                proxySelector$okhttp = NullProxySelector.INSTANCE;
                int i4 = notify + 53;
                INotificationSideChannel = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 % 2;
                }
            }
        }
        this.proxySelector = proxySelector$okhttp;
        this.proxyAuthenticator = builder.getProxyAuthenticator$okhttp();
        this.socketFactory = builder.getSocketFactory$okhttp();
        List<ConnectionSpec> connectionSpecs$okhttp = builder.getConnectionSpecs$okhttp();
        this.connectionSpecs = connectionSpecs$okhttp;
        this.protocols = builder.getProtocols$okhttp();
        this.hostnameVerifier = builder.getHostnameVerifier$okhttp();
        this.callTimeoutMillis = builder.getCallTimeout$okhttp();
        this.connectTimeoutMillis = builder.getConnectTimeout$okhttp();
        this.readTimeoutMillis = builder.getReadTimeout$okhttp();
        this.writeTimeoutMillis = builder.getWriteTimeout$okhttp();
        this.pingIntervalMillis = builder.getPingInterval$okhttp();
        this.minWebSocketMessageToCompress = builder.getMinWebSocketMessageToCompress$okhttp();
        RouteDatabase routeDatabase$okhttp = builder.getRouteDatabase$okhttp();
        this.routeDatabase = routeDatabase$okhttp == null ? new RouteDatabase() : routeDatabase$okhttp;
        List<ConnectionSpec> list = connectionSpecs$okhttp;
        if ((list instanceof Collection) && list.isEmpty()) {
            this.sslSocketFactoryOrNull = null;
            this.certificateChainCleaner = null;
            this.x509TrustManager = null;
            this.certificatePinner = CertificatePinner.DEFAULT;
            int i6 = notify + 15;
            INotificationSideChannel = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        } else {
            Iterator<T> it = list.iterator();
            int i9 = notify + 49;
            INotificationSideChannel = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 2 % 2;
            }
            while (it.hasNext()) {
                if (((ConnectionSpec) it.next()).getIsTls()) {
                    if (builder.getSslSocketFactoryOrNull$okhttp() != null) {
                        this.sslSocketFactoryOrNull = builder.getSslSocketFactoryOrNull$okhttp();
                        CertificateChainCleaner certificateChainCleaner$okhttp = builder.getCertificateChainCleaner$okhttp();
                        Intrinsics.checkNotNull(certificateChainCleaner$okhttp);
                        this.certificateChainCleaner = certificateChainCleaner$okhttp;
                        X509TrustManager x509TrustManagerOrNull$okhttp = builder.getX509TrustManagerOrNull$okhttp();
                        Intrinsics.checkNotNull(x509TrustManagerOrNull$okhttp);
                        this.x509TrustManager = x509TrustManagerOrNull$okhttp;
                        CertificatePinner certificatePinner$okhttp = builder.getCertificatePinner$okhttp();
                        Intrinsics.checkNotNull(certificateChainCleaner$okhttp);
                        this.certificatePinner = certificatePinner$okhttp.withCertificateChainCleaner$okhttp(certificateChainCleaner$okhttp);
                    } else {
                        X509TrustManager x509TrustManagerPlatformTrustManager = Platform.INSTANCE.get().platformTrustManager();
                        this.x509TrustManager = x509TrustManagerPlatformTrustManager;
                        Platform platform = Platform.INSTANCE.get();
                        Intrinsics.checkNotNull(x509TrustManagerPlatformTrustManager);
                        this.sslSocketFactoryOrNull = platform.newSslSocketFactory(x509TrustManagerPlatformTrustManager);
                        CertificateChainCleaner.Companion companion = CertificateChainCleaner.INSTANCE;
                        Intrinsics.checkNotNull(x509TrustManagerPlatformTrustManager);
                        CertificateChainCleaner certificateChainCleaner = companion.get(x509TrustManagerPlatformTrustManager);
                        this.certificateChainCleaner = certificateChainCleaner;
                        CertificatePinner certificatePinner$okhttp2 = builder.getCertificatePinner$okhttp();
                        Intrinsics.checkNotNull(certificateChainCleaner);
                        this.certificatePinner = certificatePinner$okhttp2.withCertificateChainCleaner$okhttp(certificateChainCleaner);
                    }
                }
            }
            this.sslSocketFactoryOrNull = null;
            this.certificateChainCleaner = null;
            this.x509TrustManager = null;
            this.certificatePinner = CertificatePinner.DEFAULT;
            int i11 = notify + 15;
            INotificationSideChannel = i11 % 128;
            int i12 = i11 % 2;
            int i13 = 2 % 2;
        }
        verifyClientState();
    }

    public static final /* synthetic */ List access$getDEFAULT_CONNECTION_SPECS$cp() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel;
        int i3 = i2 + 5;
        notify = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        List<ConnectionSpec> list = DEFAULT_CONNECTION_SPECS;
        int i4 = i2 + 31;
        notify = i4 % 128;
        if (i4 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public static final /* synthetic */ List access$getDEFAULT_PROTOCOLS$cp() {
        List<Protocol> list;
        int i = 2 % 2;
        int i2 = notify + 19;
        int i3 = i2 % 128;
        INotificationSideChannel = i3;
        if (i2 % 2 != 0) {
            list = DEFAULT_PROTOCOLS;
            int i4 = 90 / 0;
        } else {
            list = DEFAULT_PROTOCOLS;
        }
        int i5 = i3 + 45;
        notify = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public static final /* synthetic */ SSLSocketFactory access$getSslSocketFactoryOrNull$p(OkHttpClient okHttpClient) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 113;
        notify = i2 % 128;
        int i3 = i2 % 2;
        SSLSocketFactory sSLSocketFactory = okHttpClient.sslSocketFactoryOrNull;
        if (i3 == 0) {
            int i4 = 51 / 0;
        }
        return sSLSocketFactory;
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i4 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                break;
            }
            int i5 = $11 + 111;
            $10 = i5 % 128;
            int i6 = 58224;
            char c = 1;
            if (i5 % 2 != 0) {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                i2 = 1;
            } else {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                i2 = 0;
            }
            while (i2 < 16) {
                char c2 = cArr3[c];
                char c3 = cArr3[i4];
                int i7 = (c3 + i6) ^ ((c3 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 8611973335120459638L)));
                int i8 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    objArr2[2] = Integer.valueOf(i8);
                    objArr2[c] = Integer.valueOf(i7);
                    objArr2[i4] = Integer.valueOf(c2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cResolveSizeAndState = (char) (47773 - View.resolveSizeAndState(i4, i4, i4));
                        int bitsPerPixel = 467 - ImageFormat.getBitsPerPixel(i4);
                        int i9 = (ExpandableListView.getPackedPositionForGroup(i4) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i4) == 0L ? 0 : -1)) + 13;
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveSizeAndState, bitsPerPixel, i9, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[c] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - TextUtils.indexOf("", "", 0)), 467 - TextUtils.indexOf((CharSequence) "", '0'), 13 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i2++;
                    int i10 = $11 + 7;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    i4 = 0;
                    c = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] ^ cArr3[1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b2 = (byte) 0;
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) Color.red(0), Color.alpha(0) + 2323, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 43, -1312321721, false, $$g(b2, b3, (byte) (b3 | 13)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i);
        int i12 = $10 + 65;
        $11 = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 15 / 0;
        }
    }

    public Object clone() throws CloneNotSupportedException {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 51;
        notify = i2 % 128;
        int i3 = i2 % 2;
        Object objClone = super.clone();
        if (i3 == 0) {
            int i4 = 44 / 0;
        }
        return objClone;
    }

    public final Dispatcher dispatcher() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 119;
        int i3 = i2 % 128;
        notify = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        Dispatcher dispatcher = this.dispatcher;
        int i4 = i3 + 3;
        INotificationSideChannel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 73 / 0;
        }
        return dispatcher;
    }

    public final ConnectionPool connectionPool() {
        int i = 2 % 2;
        int i2 = notify + 61;
        int i3 = i2 % 128;
        INotificationSideChannel = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ConnectionPool connectionPool = this.connectionPool;
        int i4 = i3 + 49;
        notify = i4 % 128;
        int i5 = i4 % 2;
        return connectionPool;
    }

    public final List<Interceptor> interceptors() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 15;
        int i3 = i2 % 128;
        notify = i3;
        int i4 = i2 % 2;
        List<Interceptor> list = this.interceptors;
        int i5 = i3 + 101;
        INotificationSideChannel = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final List<Interceptor> networkInterceptors() {
        int i = 2 % 2;
        int i2 = notify + 33;
        int i3 = i2 % 128;
        INotificationSideChannel = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<Interceptor> list = this.networkInterceptors;
        int i4 = i3 + 101;
        notify = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final EventListener.Factory eventListenerFactory() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel;
        int i3 = i2 + 19;
        notify = i3 % 128;
        int i4 = i3 % 2;
        EventListener.Factory factory = this.eventListenerFactory;
        int i5 = i2 + 65;
        notify = i5 % 128;
        int i6 = i5 % 2;
        return factory;
    }

    public final boolean retryOnConnectionFailure() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 105;
        int i3 = i2 % 128;
        notify = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = this.retryOnConnectionFailure;
        int i4 = i3 + 57;
        INotificationSideChannel = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    public final Authenticator authenticator() {
        Authenticator authenticator;
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 23;
        int i3 = i2 % 128;
        notify = i3;
        if (i2 % 2 == 0) {
            authenticator = this.authenticator;
            int i4 = 11 / 0;
        } else {
            authenticator = this.authenticator;
        }
        int i5 = i3 + 7;
        INotificationSideChannel = i5 % 128;
        int i6 = i5 % 2;
        return authenticator;
    }

    public final boolean followRedirects() {
        int i = 2 % 2;
        int i2 = notify + 67;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 == 0) {
            return this.followRedirects;
        }
        throw null;
    }

    public final boolean followSslRedirects() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel;
        int i3 = i2 + 45;
        notify = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.followSslRedirects;
        int i5 = i2 + 121;
        notify = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final CookieJar cookieJar() {
        int i = 2 % 2;
        int i2 = notify + 91;
        int i3 = i2 % 128;
        INotificationSideChannel = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        CookieJar cookieJar = this.cookieJar;
        int i4 = i3 + 111;
        notify = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 17 / 0;
        }
        return cookieJar;
    }

    public final Cache cache() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel;
        int i3 = i2 + 59;
        notify = i3 % 128;
        int i4 = i3 % 2;
        Cache cache = this.cache;
        int i5 = i2 + 71;
        notify = i5 % 128;
        int i6 = i5 % 2;
        return cache;
    }

    public final Dns dns() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel;
        int i3 = i2 + 29;
        notify = i3 % 128;
        int i4 = i3 % 2;
        Dns dns = this.dns;
        int i5 = i2 + 7;
        notify = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 24 / 0;
        }
        return dns;
    }

    public final Proxy proxy() {
        int i = 2 % 2;
        int i2 = notify + 19;
        int i3 = i2 % 128;
        INotificationSideChannel = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Proxy proxy = this.proxy;
        int i4 = i3 + 83;
        notify = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 17 / 0;
        }
        return proxy;
    }

    public final ProxySelector proxySelector() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 41;
        int i3 = i2 % 128;
        notify = i3;
        int i4 = i2 % 2;
        ProxySelector proxySelector = this.proxySelector;
        int i5 = i3 + 61;
        INotificationSideChannel = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 32 / 0;
        }
        return proxySelector;
    }

    public final Authenticator proxyAuthenticator() {
        Authenticator authenticator;
        int i = 2 % 2;
        int i2 = notify + 89;
        int i3 = i2 % 128;
        INotificationSideChannel = i3;
        if (i2 % 2 != 0) {
            authenticator = this.proxyAuthenticator;
            int i4 = 23 / 0;
        } else {
            authenticator = this.proxyAuthenticator;
        }
        int i5 = i3 + 7;
        notify = i5 % 128;
        if (i5 % 2 != 0) {
            return authenticator;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final SocketFactory socketFactory() {
        int i = 2 % 2;
        int i2 = notify;
        int i3 = i2 + 123;
        INotificationSideChannel = i3 % 128;
        int i4 = i3 % 2;
        SocketFactory socketFactory = this.socketFactory;
        int i5 = i2 + 17;
        INotificationSideChannel = i5 % 128;
        int i6 = i5 % 2;
        return socketFactory;
    }

    public final SSLSocketFactory sslSocketFactory() {
        int i = 2 % 2;
        SSLSocketFactory sSLSocketFactory = this.sslSocketFactoryOrNull;
        if (sSLSocketFactory == null) {
            throw new IllegalStateException("CLEARTEXT-only client");
        }
        int i2 = INotificationSideChannel + 1;
        int i3 = i2 % 128;
        notify = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 19;
        INotificationSideChannel = i4 % 128;
        if (i4 % 2 == 0) {
            return sSLSocketFactory;
        }
        obj.hashCode();
        throw null;
    }

    public final X509TrustManager x509TrustManager() {
        int i = 2 % 2;
        int i2 = notify + 71;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 == 0) {
            return this.x509TrustManager;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<ConnectionSpec> connectionSpecs() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 91;
        int i3 = i2 % 128;
        notify = i3;
        int i4 = i2 % 2;
        List<ConnectionSpec> list = this.connectionSpecs;
        int i5 = i3 + 7;
        INotificationSideChannel = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final List<Protocol> protocols() {
        int i = 2 % 2;
        int i2 = notify;
        int i3 = i2 + 35;
        INotificationSideChannel = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        List<Protocol> list = this.protocols;
        int i4 = i2 + 75;
        INotificationSideChannel = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final HostnameVerifier hostnameVerifier() {
        int i = 2 % 2;
        int i2 = notify;
        int i3 = i2 + 63;
        INotificationSideChannel = i3 % 128;
        int i4 = i3 % 2;
        HostnameVerifier hostnameVerifier = this.hostnameVerifier;
        int i5 = i2 + 47;
        INotificationSideChannel = i5 % 128;
        if (i5 % 2 == 0) {
            return hostnameVerifier;
        }
        throw null;
    }

    public final CertificatePinner certificatePinner() {
        int i = 2 % 2;
        int i2 = notify + 67;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        CertificatePinner certificatePinner = this.certificatePinner;
        if (i3 != 0) {
            int i4 = 70 / 0;
        }
        return certificatePinner;
    }

    public final CertificateChainCleaner certificateChainCleaner() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 101;
        int i3 = i2 % 128;
        notify = i3;
        int i4 = i2 % 2;
        CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
        int i5 = i3 + 101;
        INotificationSideChannel = i5 % 128;
        if (i5 % 2 == 0) {
            return certificateChainCleaner;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int callTimeoutMillis() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel;
        int i3 = i2 + 115;
        notify = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.callTimeoutMillis;
        int i6 = i2 + 105;
        notify = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public final int connectTimeoutMillis() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 63;
        int i3 = i2 % 128;
        notify = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = this.connectTimeoutMillis;
        int i5 = i3 + 109;
        INotificationSideChannel = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\bQ\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0007¢\u0006\u0004\b\u0004\u0010\u0006J8\u0010\r\u001a\u00020\u00002#\b\u0004\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007H\u0087\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002#\b\u0004\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b\u001d\u0010\"J\u0017\u0010$\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020#H\u0007¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u001cH\u0007¢\u0006\u0004\b&\u0010\u001eJ\u001f\u0010&\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b&\u0010\"J\u0017\u0010(\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020'H\u0007¢\u0006\u0004\b(\u0010)J\u001d\u0010,\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020+0*H\u0007¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020.H\u0007¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u000201H\u0007¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u000204H\u0007¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u000207H\u0007¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020:H\u0007¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020=H\u0007¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020=H\u0007¢\u0006\u0004\b@\u0010?J\u0017\u0010B\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020AH\u0007¢\u0006\u0004\bB\u0010CJ\u0015\u0010E\u001a\b\u0012\u0004\u0012\u00020\u000f0DH\u0007¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u001fH\u0007¢\u0006\u0004\bG\u0010HJ\u0015\u0010I\u001a\b\u0012\u0004\u0012\u00020\u000f0DH\u0007¢\u0006\u0004\bI\u0010FJ\u0017\u0010J\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u001cH\u0007¢\u0006\u0004\bJ\u0010\u001eJ\u001f\u0010J\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\bJ\u0010\"J\u001d\u0010L\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020K0*H\u0007¢\u0006\u0004\bL\u0010-J\u0019\u0010N\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010MH\u0007¢\u0006\u0004\bN\u0010OJ\u0017\u0010P\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0014H\u0007¢\u0006\u0004\bP\u0010\u0016J\u0017\u0010R\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020QH\u0007¢\u0006\u0004\bR\u0010SJ\u0017\u0010T\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u001cH\u0007¢\u0006\u0004\bT\u0010\u001eJ\u001f\u0010T\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\bT\u0010\"J\u0017\u0010U\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020=H\u0007¢\u0006\u0004\bU\u0010?J\u0017\u0010W\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020VH\u0007¢\u0006\u0004\bW\u0010XJ\u0017\u0010Z\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020YH\u0007¢\u0006\u0004\bZ\u0010[J\u001f\u0010Z\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020Y2\u0006\u0010!\u001a\u00020\\H\u0007¢\u0006\u0004\bZ\u0010]J\u0017\u0010^\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u001cH\u0007¢\u0006\u0004\b^\u0010\u001eJ\u001f\u0010^\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b^\u0010\"R\"\u0010\u0015\u001a\u00020\u00148\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010\u001d\u001a\u00020i8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR$\u0010p\u001a\u0004\u0018\u00010o8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\"\u0010$\u001a\u00020#8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b$\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\"\u0010&\u001a\u00020i8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b&\u0010j\u001a\u0004\b{\u0010l\"\u0004\b|\u0010nR$\u0010(\u001a\u00020'8\u0001@\u0001X\u0081\u000e¢\u0006\u0014\n\u0004\b(\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R,\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*8\u0001@\u0001X\u0081\u000e¢\u0006\u0016\n\u0005\b,\u0010\u0082\u0001\u001a\u0005\b\u0083\u0001\u0010F\"\u0006\b\u0084\u0001\u0010\u0085\u0001R'\u0010/\u001a\u00020.8\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\b/\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R'\u00102\u001a\u0002018\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\b2\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R'\u00105\u001a\u0002048\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\b5\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R'\u0010;\u001a\u00020:8\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\b;\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R'\u0010>\u001a\u00020=8\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\b>\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R'\u0010@\u001a\u00020=8\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\b@\u0010\u009a\u0001\u001a\u0006\b\u009f\u0001\u0010\u009c\u0001\"\u0006\b \u0001\u0010\u009e\u0001R'\u0010B\u001a\u00020A8\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\bB\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001R\"\u0010E\u001a\b\u0012\u0004\u0012\u00020\u000f0D8\u0001X\u0081\u0004¢\u0006\u000e\n\u0005\bE\u0010\u0082\u0001\u001a\u0005\b¦\u0001\u0010FR'\u0010G\u001a\u00020\u001f8\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\bG\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001R\"\u0010I\u001a\b\u0012\u0004\u0012\u00020\u000f0D8\u0001X\u0081\u0004¢\u0006\u000e\n\u0005\bI\u0010\u0082\u0001\u001a\u0005\b¬\u0001\u0010FR$\u0010J\u001a\u00020i8\u0001@\u0001X\u0081\u000e¢\u0006\u0014\n\u0004\bJ\u0010j\u001a\u0005\b\u00ad\u0001\u0010l\"\u0005\b®\u0001\u0010nR,\u0010L\u001a\b\u0012\u0004\u0012\u00020K0*8\u0001@\u0001X\u0081\u000e¢\u0006\u0016\n\u0005\bL\u0010\u0082\u0001\u001a\u0005\b¯\u0001\u0010F\"\u0006\b°\u0001\u0010\u0085\u0001R)\u0010N\u001a\u0004\u0018\u00010M8\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\bN\u0010±\u0001\u001a\u0006\b²\u0001\u0010³\u0001\"\u0006\b´\u0001\u0010µ\u0001R$\u0010P\u001a\u00020\u00148\u0001@\u0001X\u0081\u000e¢\u0006\u0014\n\u0004\bP\u0010_\u001a\u0005\b¶\u0001\u0010a\"\u0005\b·\u0001\u0010cR)\u0010R\u001a\u0004\u0018\u00010Q8\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\bR\u0010¸\u0001\u001a\u0006\b¹\u0001\u0010º\u0001\"\u0006\b»\u0001\u0010¼\u0001R$\u0010T\u001a\u00020i8\u0001@\u0001X\u0081\u000e¢\u0006\u0014\n\u0004\bT\u0010j\u001a\u0005\b½\u0001\u0010l\"\u0005\b¾\u0001\u0010nR'\u0010U\u001a\u00020=8\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\bU\u0010\u009a\u0001\u001a\u0006\b¿\u0001\u0010\u009c\u0001\"\u0006\bÀ\u0001\u0010\u009e\u0001R,\u0010Â\u0001\u001a\u0005\u0018\u00010Á\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\bÂ\u0001\u0010Ã\u0001\u001a\u0006\bÄ\u0001\u0010Å\u0001\"\u0006\bÆ\u0001\u0010Ç\u0001R'\u0010W\u001a\u00020V8\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\bW\u0010È\u0001\u001a\u0006\bÉ\u0001\u0010Ê\u0001\"\u0006\bË\u0001\u0010Ì\u0001R+\u0010Í\u0001\u001a\u0004\u0018\u00010Y8\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\bÍ\u0001\u0010Î\u0001\u001a\u0006\bÏ\u0001\u0010Ð\u0001\"\u0006\bÑ\u0001\u0010Ò\u0001R$\u0010^\u001a\u00020i8\u0001@\u0001X\u0081\u000e¢\u0006\u0014\n\u0004\b^\u0010j\u001a\u0005\bÓ\u0001\u0010l\"\u0005\bÔ\u0001\u0010nR+\u0010Õ\u0001\u001a\u0004\u0018\u00010\\8\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\bÕ\u0001\u0010Ö\u0001\u001a\u0006\b×\u0001\u0010Ø\u0001\"\u0006\bÙ\u0001\u0010Ú\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lokhttp3/OkHttpClient$Builder;", "", "Lokhttp3/OkHttpClient;", "p0", "<init>", "(Lokhttp3/OkHttpClient;)V", "()V", "Lkotlin/Function1;", "Lokhttp3/Interceptor$Chain;", "Lkotlin/ParameterName;", "name", "chain", "Lokhttp3/Response;", "-addInterceptor", "(Lkotlin/jvm/functions/Function1;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/Interceptor;", "addInterceptor", "(Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;", "-addNetworkInterceptor", "addNetworkInterceptor", "Lokhttp3/Authenticator;", "authenticator", "(Lokhttp3/Authenticator;)Lokhttp3/OkHttpClient$Builder;", "build", "()Lokhttp3/OkHttpClient;", "Lokhttp3/Cache;", "cache", "(Lokhttp3/Cache;)Lokhttp3/OkHttpClient$Builder;", "Ljava/time/Duration;", "callTimeout", "(Ljava/time/Duration;)Lokhttp3/OkHttpClient$Builder;", "", "Ljava/util/concurrent/TimeUnit;", "p1", "(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/CertificatePinner;", "certificatePinner", "(Lokhttp3/CertificatePinner;)Lokhttp3/OkHttpClient$Builder;", "connectTimeout", "Lokhttp3/ConnectionPool;", "connectionPool", "(Lokhttp3/ConnectionPool;)Lokhttp3/OkHttpClient$Builder;", "", "Lokhttp3/ConnectionSpec;", "connectionSpecs", "(Ljava/util/List;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/CookieJar;", "cookieJar", "(Lokhttp3/CookieJar;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/Dispatcher;", "dispatcher", "(Lokhttp3/Dispatcher;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/Dns;", "dns", "(Lokhttp3/Dns;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/EventListener;", "eventListener", "(Lokhttp3/EventListener;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/EventListener$Factory;", "eventListenerFactory", "(Lokhttp3/EventListener$Factory;)Lokhttp3/OkHttpClient$Builder;", "", "followRedirects", "(Z)Lokhttp3/OkHttpClient$Builder;", "followSslRedirects", "Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "(Ljavax/net/ssl/HostnameVerifier;)Lokhttp3/OkHttpClient$Builder;", "", "interceptors", "()Ljava/util/List;", "minWebSocketMessageToCompress", "(J)Lokhttp3/OkHttpClient$Builder;", "networkInterceptors", "pingInterval", "Lokhttp3/Protocol;", "protocols", "Ljava/net/Proxy;", "proxy", "(Ljava/net/Proxy;)Lokhttp3/OkHttpClient$Builder;", "proxyAuthenticator", "Ljava/net/ProxySelector;", "proxySelector", "(Ljava/net/ProxySelector;)Lokhttp3/OkHttpClient$Builder;", "readTimeout", "retryOnConnectionFailure", "Ljavax/net/SocketFactory;", "socketFactory", "(Ljavax/net/SocketFactory;)Lokhttp3/OkHttpClient$Builder;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "(Ljavax/net/ssl/SSLSocketFactory;)Lokhttp3/OkHttpClient$Builder;", "Ljavax/net/ssl/X509TrustManager;", "(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)Lokhttp3/OkHttpClient$Builder;", "writeTimeout", "Lokhttp3/Authenticator;", "getAuthenticator$okhttp", "()Lokhttp3/Authenticator;", "setAuthenticator$okhttp", "(Lokhttp3/Authenticator;)V", "Lokhttp3/Cache;", "getCache$okhttp", "()Lokhttp3/Cache;", "setCache$okhttp", "(Lokhttp3/Cache;)V", "", "I", "getCallTimeout$okhttp", "()I", "setCallTimeout$okhttp", "(I)V", "Lokhttp3/internal/tls/CertificateChainCleaner;", "certificateChainCleaner", "Lokhttp3/internal/tls/CertificateChainCleaner;", "getCertificateChainCleaner$okhttp", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "setCertificateChainCleaner$okhttp", "(Lokhttp3/internal/tls/CertificateChainCleaner;)V", "Lokhttp3/CertificatePinner;", "getCertificatePinner$okhttp", "()Lokhttp3/CertificatePinner;", "setCertificatePinner$okhttp", "(Lokhttp3/CertificatePinner;)V", "getConnectTimeout$okhttp", "setConnectTimeout$okhttp", "Lokhttp3/ConnectionPool;", "getConnectionPool$okhttp", "()Lokhttp3/ConnectionPool;", "setConnectionPool$okhttp", "(Lokhttp3/ConnectionPool;)V", "Ljava/util/List;", "getConnectionSpecs$okhttp", "setConnectionSpecs$okhttp", "(Ljava/util/List;)V", "Lokhttp3/CookieJar;", "getCookieJar$okhttp", "()Lokhttp3/CookieJar;", "setCookieJar$okhttp", "(Lokhttp3/CookieJar;)V", "Lokhttp3/Dispatcher;", "getDispatcher$okhttp", "()Lokhttp3/Dispatcher;", "setDispatcher$okhttp", "(Lokhttp3/Dispatcher;)V", "Lokhttp3/Dns;", "getDns$okhttp", "()Lokhttp3/Dns;", "setDns$okhttp", "(Lokhttp3/Dns;)V", "Lokhttp3/EventListener$Factory;", "getEventListenerFactory$okhttp", "()Lokhttp3/EventListener$Factory;", "setEventListenerFactory$okhttp", "(Lokhttp3/EventListener$Factory;)V", "Z", "getFollowRedirects$okhttp", "()Z", "setFollowRedirects$okhttp", "(Z)V", "getFollowSslRedirects$okhttp", "setFollowSslRedirects$okhttp", "Ljavax/net/ssl/HostnameVerifier;", "getHostnameVerifier$okhttp", "()Ljavax/net/ssl/HostnameVerifier;", "setHostnameVerifier$okhttp", "(Ljavax/net/ssl/HostnameVerifier;)V", "getInterceptors$okhttp", "J", "getMinWebSocketMessageToCompress$okhttp", "()J", "setMinWebSocketMessageToCompress$okhttp", "(J)V", "getNetworkInterceptors$okhttp", "getPingInterval$okhttp", "setPingInterval$okhttp", "getProtocols$okhttp", "setProtocols$okhttp", "Ljava/net/Proxy;", "getProxy$okhttp", "()Ljava/net/Proxy;", "setProxy$okhttp", "(Ljava/net/Proxy;)V", "getProxyAuthenticator$okhttp", "setProxyAuthenticator$okhttp", "Ljava/net/ProxySelector;", "getProxySelector$okhttp", "()Ljava/net/ProxySelector;", "setProxySelector$okhttp", "(Ljava/net/ProxySelector;)V", "getReadTimeout$okhttp", "setReadTimeout$okhttp", "getRetryOnConnectionFailure$okhttp", "setRetryOnConnectionFailure$okhttp", "Lokhttp3/internal/connection/RouteDatabase;", "routeDatabase", "Lokhttp3/internal/connection/RouteDatabase;", "getRouteDatabase$okhttp", "()Lokhttp3/internal/connection/RouteDatabase;", "setRouteDatabase$okhttp", "(Lokhttp3/internal/connection/RouteDatabase;)V", "Ljavax/net/SocketFactory;", "getSocketFactory$okhttp", "()Ljavax/net/SocketFactory;", "setSocketFactory$okhttp", "(Ljavax/net/SocketFactory;)V", "sslSocketFactoryOrNull", "Ljavax/net/ssl/SSLSocketFactory;", "getSslSocketFactoryOrNull$okhttp", "()Ljavax/net/ssl/SSLSocketFactory;", "setSslSocketFactoryOrNull$okhttp", "(Ljavax/net/ssl/SSLSocketFactory;)V", "getWriteTimeout$okhttp", "setWriteTimeout$okhttp", "x509TrustManagerOrNull", "Ljavax/net/ssl/X509TrustManager;", "getX509TrustManagerOrNull$okhttp", "()Ljavax/net/ssl/X509TrustManager;", "setX509TrustManagerOrNull$okhttp", "(Ljavax/net/ssl/X509TrustManager;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private static short[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private Authenticator authenticator;
        private Cache cache;
        private int callTimeout;
        private CertificateChainCleaner certificateChainCleaner;
        private CertificatePinner certificatePinner;
        private int connectTimeout;
        private ConnectionPool connectionPool;
        private List<ConnectionSpec> connectionSpecs;
        private CookieJar cookieJar;
        private Dispatcher dispatcher;
        private Dns dns;
        private EventListener.Factory eventListenerFactory;
        private boolean followRedirects;
        private boolean followSslRedirects;
        private HostnameVerifier hostnameVerifier;
        private final List<Interceptor> interceptors;
        private long minWebSocketMessageToCompress;
        private final List<Interceptor> networkInterceptors;
        private int pingInterval;
        private List<? extends Protocol> protocols;
        private Proxy proxy;
        private Authenticator proxyAuthenticator;
        private ProxySelector proxySelector;
        private int readTimeout;
        private boolean retryOnConnectionFailure;
        private RouteDatabase routeDatabase;
        private SocketFactory socketFactory;
        private SSLSocketFactory sslSocketFactoryOrNull;
        private int writeTimeout;
        private X509TrustManager x509TrustManagerOrNull;
        private static final byte[] $$c = {81, 125, 2, 46};
        private static final int $$f = 61;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {80, -8, 43, 65, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
        private static final int $$e = 58;
        private static final byte[] $$a = {90, 46, 113, 8, 2, 5, 32, -32, -1, 20, -8, 20, 3, -6, 1, 10, 2};
        private static final int $$b = 87;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f1286a = 0;
        private static int g = 1;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1630581318;
        private static int TuitionPaymentFragmentbindingInflater1 = -1934795602;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -22391756;
        private static byte[] b = {-90, -76, -39, -68, -123, -116, -29, -70, -81, -94, -73, -86, -40, 105, -12, -94, -66, -90, 111, -2, -48, -122, -92, -56, -36, -49, -42, -52, -44, -60, -87, -32, -38, -51, 77, 124, 71, 125, 69, 117, 38, 91, -66, 73, 122, 113, 66, 121, 119, 4, -125, 113, 77, 117, 58, -115, 111, 85, 115, 23, -23, 17, -13, -13, 59, -22, -126, ByteCompanionObject.MIN_VALUE, 114, -77, -115, -118, -106, -104, 100, -85, -104, -117, -64, -21, -23, -37, 28, -61, -17, -63, -10, -62, -31, -49, -49, 18, -63, -16, -26, -26, -26, -26, -26, -26};

        /* JADX WARN: Code duplicated, block: B:10:0x002a  */
        /* JADX WARN: Code duplicated, block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(byte r6, byte r7, int r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = okhttp3.OkHttpClient.Builder.$$a
                int r7 = r7 + 4
                int r6 = r6 * 4
                int r1 = 14 - r6
                int r8 = r8 * 4
                int r8 = r8 + 97
                byte[] r1 = new byte[r1]
                int r6 = 13 - r6
                r2 = 0
                if (r0 != 0) goto L17
                r4 = r6
                r8 = r7
                r3 = r2
                goto L2e
            L17:
                r3 = r2
                r5 = r8
                r8 = r7
                r7 = r5
            L1b:
                byte r4 = (byte) r7
                int r8 = r8 + 1
                r1[r3] = r4
                if (r3 != r6) goto L2a
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L2a:
                int r3 = r3 + 1
                r4 = r0[r8]
            L2e:
                int r4 = -r4
                int r7 = r7 + r4
                int r7 = r7 + 5
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.OkHttpClient.Builder.c(byte, byte, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0028  */
        /* JADX WARN: Code duplicated, block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void d(short r7, short r8, byte r9, java.lang.Object[] r10) {
            /*
                byte[] r0 = okhttp3.OkHttpClient.Builder.$$d
                int r8 = r8 * 52
                int r8 = 56 - r8
                int r9 = r9 * 52
                int r9 = 53 - r9
                int r7 = r7 + 84
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L15
                r7 = r8
                r3 = r9
                r4 = r2
                goto L2d
            L15:
                r3 = r2
            L16:
                r6 = r8
                r8 = r7
                r7 = r6
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r9) goto L28
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L28:
                r3 = r0[r7]
                r6 = r8
                r8 = r7
                r7 = r6
            L2d:
                int r8 = r8 + 1
                int r3 = -r3
                int r7 = r7 + r3
                int r7 = r7 + (-11)
                r3 = r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.OkHttpClient.Builder.d(short, short, byte, java.lang.Object[]):void");
        }

        private static void e(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
            int i4;
            long j;
            int i5 = 2;
            int i6 = 2 % 2;
            SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                char c = '0';
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                    int iLastIndexOf = 2266 - TextUtils.lastIndexOf("", '0');
                    int iArgb = Color.argb(0, 0, 0, 0) + 33;
                    byte length = (byte) $$c.length;
                    byte b3 = (byte) (length - 4);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iLastIndexOf, iArgb, 1387473586, false, $$g(length, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                if (iIntValue == -1) {
                    int i7 = $10 + 77;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                if ((i4 ^ 1) != 1) {
                    int i9 = $11 + 119;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    byte[] bArr = b;
                    if (bArr != null) {
                        int length2 = bArr.length;
                        byte[] bArr2 = new byte[length2];
                        int i11 = 0;
                        while (i11 < length2) {
                            int i12 = $10 + 65;
                            $11 = i12 % 128;
                            int i13 = i12 % i5;
                            try {
                                Object[] objArr3 = {Integer.valueOf(bArr[i11])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b4 = (byte) 0;
                                    byte b5 = b4;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf("", c, 0, 0) + 1), 3358 - ExpandableListView.getPackedPositionGroup(0L), Color.green(0) + 18, -1054011043, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                                }
                                bArr2[i11] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                                i11++;
                                i5 = 2;
                                c = '0';
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        byte[] bArr3 = b;
                        Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                            int doubleTapTimeout = 2267 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 33;
                            byte length3 = (byte) $$c.length;
                            byte b6 = (byte) (length3 - 4);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(offsetBefore, doubleTapTimeout, doubleTapTimeout2, 1387473586, false, $$g(length3, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)));
                        j = 3046761265686732006L;
                    } else {
                        j = 3046761265686732006L;
                        iIntValue = (short) (((short) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3[i3 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)));
                    }
                } else {
                    j = 3046761265686732006L;
                }
                if (iIntValue > 0) {
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ j)) + i4;
                    Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), sb};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 55904);
                        int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 2855;
                        int i14 = 14 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        byte b7 = (byte) ($$c[2] + 1);
                        byte b8 = (byte) (b7 - 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(capsMode, iResolveOpacity, i14, -1529949196, false, $$g(b7, b8, b8), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    byte[] bArr4 = b;
                    if (bArr4 != null) {
                        int length4 = bArr4.length;
                        byte[] bArr5 = new byte[length4];
                        for (int i15 = 0; i15 < length4; i15++) {
                            int i16 = $10 + 73;
                            $11 = i16 % 128;
                            int i17 = i16 % 2;
                            bArr5[i15] = (byte) (((long) bArr4[i15]) ^ 3046761265686732006L);
                        }
                        bArr4 = bArr5;
                    }
                    boolean z = bArr4 != null;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                    int i18 = $10 + 99;
                    $11 = i18 % 128;
                    int i19 = 2;
                    int i20 = i18 % 2;
                    while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                        int i21 = $11 + 29;
                        int i22 = i21 % 128;
                        $10 = i22;
                        int i23 = i21 % i19;
                        if (z) {
                            int i24 = i22 + 79;
                            $11 = i24 % 128;
                            int i25 = i24 % i19;
                            byte[] bArr6 = b;
                            int i26 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i26 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i26]) ^ 3046761265686732006L)) + s)) ^ b2));
                            int i27 = $11 + 87;
                            $10 = i27 % 128;
                            i19 = 2;
                            if (i27 % 2 != 0) {
                                int i28 = 3 / 4;
                            }
                        } else {
                            short[] sArr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i29 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i29 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i29]) ^ 3046761265686732006L)) + s)) ^ b2));
                        }
                        sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }

        public Builder() {
            this.dispatcher = new Dispatcher();
            this.connectionPool = new ConnectionPool();
            this.interceptors = new ArrayList();
            this.networkInterceptors = new ArrayList();
            this.eventListenerFactory = Util.asFactory(EventListener.NONE);
            this.retryOnConnectionFailure = true;
            this.authenticator = Authenticator.NONE;
            this.followRedirects = true;
            this.followSslRedirects = true;
            this.cookieJar = CookieJar.NO_COOKIES;
            this.dns = Dns.SYSTEM;
            this.proxyAuthenticator = Authenticator.NONE;
            SocketFactory socketFactory = SocketFactory.getDefault();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "");
            this.socketFactory = socketFactory;
            this.connectionSpecs = OkHttpClient.INSTANCE.getDEFAULT_CONNECTION_SPECS$okhttp();
            this.protocols = OkHttpClient.INSTANCE.getDEFAULT_PROTOCOLS$okhttp();
            this.hostnameVerifier = OkHostnameVerifier.INSTANCE;
            this.certificatePinner = CertificatePinner.DEFAULT;
            this.connectTimeout = 10000;
            this.readTimeout = 10000;
            this.writeTimeout = 10000;
            this.minWebSocketMessageToCompress = 1024L;
        }

        public final Dispatcher getDispatcher$okhttp() {
            int i = 2 % 2;
            int i2 = f1286a + 109;
            g = i2 % 128;
            int i3 = i2 % 2;
            Dispatcher dispatcher = this.dispatcher;
            if (i3 == 0) {
                int i4 = 84 / 0;
            }
            return dispatcher;
        }

        public final void setDispatcher$okhttp(Dispatcher dispatcher) {
            int i = 2 % 2;
            int i2 = f1286a + 35;
            g = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(dispatcher, "");
                this.dispatcher = dispatcher;
                throw null;
            }
            Intrinsics.checkNotNullParameter(dispatcher, "");
            this.dispatcher = dispatcher;
            int i3 = f1286a + 27;
            g = i3 % 128;
            int i4 = i3 % 2;
        }

        public final ConnectionPool getConnectionPool$okhttp() {
            int i = 2 % 2;
            int i2 = g;
            int i3 = i2 + 7;
            f1286a = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ConnectionPool connectionPool = this.connectionPool;
            int i4 = i2 + 65;
            f1286a = i4 % 128;
            int i5 = i4 % 2;
            return connectionPool;
        }

        public final void setConnectionPool$okhttp(ConnectionPool connectionPool) {
            int i = 2 % 2;
            int i2 = f1286a + 45;
            g = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(connectionPool, "");
                this.connectionPool = connectionPool;
                throw null;
            }
            Intrinsics.checkNotNullParameter(connectionPool, "");
            this.connectionPool = connectionPool;
            int i3 = f1286a + 13;
            g = i3 % 128;
            int i4 = i3 % 2;
        }

        public final List<Interceptor> getInterceptors$okhttp() {
            int i = 2 % 2;
            int i2 = g + 49;
            f1286a = i2 % 128;
            if (i2 % 2 == 0) {
                return this.interceptors;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final List<Interceptor> getNetworkInterceptors$okhttp() {
            int i = 2 % 2;
            int i2 = g + 33;
            int i3 = i2 % 128;
            f1286a = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            List<Interceptor> list = this.networkInterceptors;
            int i4 = i3 + 65;
            g = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 96 / 0;
            }
            return list;
        }

        public final EventListener.Factory getEventListenerFactory$okhttp() {
            int i = 2 % 2;
            int i2 = f1286a;
            int i3 = i2 + 67;
            g = i3 % 128;
            int i4 = i3 % 2;
            EventListener.Factory factory = this.eventListenerFactory;
            int i5 = i2 + 37;
            g = i5 % 128;
            if (i5 % 2 != 0) {
                return factory;
            }
            throw null;
        }

        public final void setEventListenerFactory$okhttp(EventListener.Factory factory) {
            int i = 2 % 2;
            int i2 = f1286a + 89;
            g = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(factory, "");
                this.eventListenerFactory = factory;
                int i3 = 85 / 0;
            } else {
                Intrinsics.checkNotNullParameter(factory, "");
                this.eventListenerFactory = factory;
            }
            int i4 = g + 51;
            f1286a = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 28 / 0;
            }
        }

        public final boolean getRetryOnConnectionFailure$okhttp() {
            int i = 2 % 2;
            int i2 = f1286a + 9;
            int i3 = i2 % 128;
            g = i3;
            int i4 = i2 % 2;
            boolean z = this.retryOnConnectionFailure;
            int i5 = i3 + 105;
            f1286a = i5 % 128;
            if (i5 % 2 == 0) {
                return z;
            }
            throw null;
        }

        public final void setRetryOnConnectionFailure$okhttp(boolean z) {
            int i = 2 % 2;
            int i2 = g;
            int i3 = i2 + 3;
            f1286a = i3 % 128;
            int i4 = i3 % 2;
            this.retryOnConnectionFailure = z;
            int i5 = i2 + 123;
            f1286a = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Authenticator getAuthenticator$okhttp() {
            int i = 2 % 2;
            int i2 = f1286a;
            int i3 = i2 + 27;
            g = i3 % 128;
            int i4 = i3 % 2;
            Authenticator authenticator = this.authenticator;
            int i5 = i2 + 13;
            g = i5 % 128;
            int i6 = i5 % 2;
            return authenticator;
        }

        public final void setAuthenticator$okhttp(Authenticator authenticator) {
            int i = 2 % 2;
            int i2 = g + 85;
            f1286a = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(authenticator, "");
            this.authenticator = authenticator;
            int i4 = f1286a + 97;
            g = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 15 / 0;
            }
        }

        public final boolean getFollowRedirects$okhttp() {
            int i = 2 % 2;
            int i2 = g;
            int i3 = i2 + 73;
            f1286a = i3 % 128;
            int i4 = i3 % 2;
            boolean z = this.followRedirects;
            int i5 = i2 + 125;
            f1286a = i5 % 128;
            if (i5 % 2 == 0) {
                return z;
            }
            throw null;
        }

        public final void setFollowRedirects$okhttp(boolean z) {
            int i = 2 % 2;
            int i2 = g;
            int i3 = i2 + 33;
            f1286a = i3 % 128;
            int i4 = i3 % 2;
            this.followRedirects = z;
            int i5 = i2 + 111;
            f1286a = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        public final boolean getFollowSslRedirects$okhttp() {
            boolean z;
            int i = 2 % 2;
            int i2 = f1286a + 111;
            int i3 = i2 % 128;
            g = i3;
            if (i2 % 2 == 0) {
                z = this.followSslRedirects;
                int i4 = 7 / 0;
            } else {
                z = this.followSslRedirects;
            }
            int i5 = i3 + 119;
            f1286a = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        public final void setFollowSslRedirects$okhttp(boolean z) {
            int i = 2 % 2;
            int i2 = g + 69;
            f1286a = i2 % 128;
            int i3 = i2 % 2;
            this.followSslRedirects = z;
            if (i3 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final CookieJar getCookieJar$okhttp() {
            int i = 2 % 2;
            int i2 = f1286a;
            int i3 = i2 + 75;
            g = i3 % 128;
            int i4 = i3 % 2;
            CookieJar cookieJar = this.cookieJar;
            int i5 = i2 + 47;
            g = i5 % 128;
            int i6 = i5 % 2;
            return cookieJar;
        }

        public final void setCookieJar$okhttp(CookieJar cookieJar) {
            int i = 2 % 2;
            int i2 = f1286a + 113;
            g = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(cookieJar, "");
                this.cookieJar = cookieJar;
            } else {
                Intrinsics.checkNotNullParameter(cookieJar, "");
                this.cookieJar = cookieJar;
                int i3 = 76 / 0;
            }
        }

        public final Cache getCache$okhttp() {
            int i = 2 % 2;
            int i2 = g + 119;
            f1286a = i2 % 128;
            if (i2 % 2 == 0) {
                return this.cache;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void setCache$okhttp(Cache cache) {
            int i = 2 % 2;
            int i2 = f1286a + 105;
            g = i2 % 128;
            int i3 = i2 % 2;
            this.cache = cache;
            if (i3 == 0) {
                int i4 = 62 / 0;
            }
        }

        public final Dns getDns$okhttp() {
            int i = 2 % 2;
            int i2 = g + 77;
            f1286a = i2 % 128;
            if (i2 % 2 == 0) {
                return this.dns;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void setDns$okhttp(Dns dns) {
            int i = 2 % 2;
            int i2 = f1286a + 11;
            g = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(dns, "");
                this.dns = dns;
            } else {
                Intrinsics.checkNotNullParameter(dns, "");
                this.dns = dns;
                throw null;
            }
        }

        public final Proxy getProxy$okhttp() {
            int i = 2 % 2;
            int i2 = g + 103;
            int i3 = i2 % 128;
            f1286a = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Proxy proxy = this.proxy;
            int i4 = i3 + 19;
            g = i4 % 128;
            int i5 = i4 % 2;
            return proxy;
        }

        public final void setProxy$okhttp(Proxy proxy) {
            int i = 2 % 2;
            int i2 = g + 37;
            int i3 = i2 % 128;
            f1286a = i3;
            int i4 = i2 % 2;
            this.proxy = proxy;
            int i5 = i3 + 11;
            g = i5 % 128;
            int i6 = i5 % 2;
        }

        public final ProxySelector getProxySelector$okhttp() {
            ProxySelector proxySelector;
            int i = 2 % 2;
            int i2 = f1286a;
            int i3 = i2 + 53;
            g = i3 % 128;
            if (i3 % 2 == 0) {
                proxySelector = this.proxySelector;
                int i4 = 54 / 0;
            } else {
                proxySelector = this.proxySelector;
            }
            int i5 = i2 + 81;
            g = i5 % 128;
            int i6 = i5 % 2;
            return proxySelector;
        }

        public final void setProxySelector$okhttp(ProxySelector proxySelector) {
            int i = 2 % 2;
            int i2 = g + 59;
            int i3 = i2 % 128;
            f1286a = i3;
            int i4 = i2 % 2;
            this.proxySelector = proxySelector;
            int i5 = i3 + 35;
            g = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Authenticator getProxyAuthenticator$okhttp() {
            int i = 2 % 2;
            int i2 = f1286a + 41;
            g = i2 % 128;
            if (i2 % 2 != 0) {
                return this.proxyAuthenticator;
            }
            throw null;
        }

        public final void setProxyAuthenticator$okhttp(Authenticator authenticator) {
            int i = 2 % 2;
            int i2 = f1286a + 77;
            g = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(authenticator, "");
                this.proxyAuthenticator = authenticator;
            } else {
                Intrinsics.checkNotNullParameter(authenticator, "");
                this.proxyAuthenticator = authenticator;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public final SocketFactory getSocketFactory$okhttp() {
            int i = 2 % 2;
            int i2 = g;
            int i3 = i2 + 53;
            f1286a = i3 % 128;
            int i4 = i3 % 2;
            SocketFactory socketFactory = this.socketFactory;
            int i5 = i2 + 31;
            f1286a = i5 % 128;
            int i6 = i5 % 2;
            return socketFactory;
        }

        public final void setSocketFactory$okhttp(SocketFactory socketFactory) {
            int i = 2 % 2;
            int i2 = f1286a + 51;
            g = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(socketFactory, "");
                this.socketFactory = socketFactory;
            } else {
                Intrinsics.checkNotNullParameter(socketFactory, "");
                this.socketFactory = socketFactory;
                int i3 = 1 / 0;
            }
        }

        public final SSLSocketFactory getSslSocketFactoryOrNull$okhttp() {
            int i = 2 % 2;
            int i2 = g;
            int i3 = i2 + 97;
            f1286a = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            SSLSocketFactory sSLSocketFactory = this.sslSocketFactoryOrNull;
            int i4 = i2 + 49;
            f1286a = i4 % 128;
            int i5 = i4 % 2;
            return sSLSocketFactory;
        }

        public final void setSslSocketFactoryOrNull$okhttp(SSLSocketFactory sSLSocketFactory) {
            int i = 2 % 2;
            int i2 = f1286a + 69;
            int i3 = i2 % 128;
            g = i3;
            int i4 = i2 % 2;
            this.sslSocketFactoryOrNull = sSLSocketFactory;
            int i5 = i3 + 27;
            f1286a = i5 % 128;
            int i6 = i5 % 2;
        }

        public final X509TrustManager getX509TrustManagerOrNull$okhttp() {
            int i = 2 % 2;
            int i2 = f1286a;
            int i3 = i2 + 37;
            g = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            X509TrustManager x509TrustManager = this.x509TrustManagerOrNull;
            int i4 = i2 + 111;
            g = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 71 / 0;
            }
            return x509TrustManager;
        }

        public final void setX509TrustManagerOrNull$okhttp(X509TrustManager x509TrustManager) {
            int i = 2 % 2;
            int i2 = f1286a + 65;
            int i3 = i2 % 128;
            g = i3;
            int i4 = i2 % 2;
            this.x509TrustManagerOrNull = x509TrustManager;
            if (i4 == 0) {
                int i5 = 56 / 0;
            }
            int i6 = i3 + 21;
            f1286a = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
        }

        public final List<ConnectionSpec> getConnectionSpecs$okhttp() {
            int i = 2 % 2;
            int i2 = f1286a + 61;
            g = i2 % 128;
            int i3 = i2 % 2;
            List<ConnectionSpec> list = this.connectionSpecs;
            if (i3 == 0) {
                int i4 = 42 / 0;
            }
            return list;
        }

        public final void setConnectionSpecs$okhttp(List<ConnectionSpec> list) {
            int i = 2 % 2;
            int i2 = f1286a + 5;
            g = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(list, "");
            this.connectionSpecs = list;
            int i4 = f1286a + 89;
            g = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        public final List<Protocol> getProtocols$okhttp() {
            int i = 2 % 2;
            int i2 = g;
            int i3 = i2 + 31;
            f1286a = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            List list = this.protocols;
            int i4 = i2 + 109;
            f1286a = i4 % 128;
            if (i4 % 2 == 0) {
                return list;
            }
            obj.hashCode();
            throw null;
        }

        public final void setProtocols$okhttp(List<? extends Protocol> list) {
            int i = 2 % 2;
            int i2 = g + 67;
            f1286a = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(list, "");
                this.protocols = list;
            } else {
                Intrinsics.checkNotNullParameter(list, "");
                this.protocols = list;
                throw null;
            }
        }

        public final HostnameVerifier getHostnameVerifier$okhttp() {
            int i = 2 % 2;
            int i2 = g + 79;
            f1286a = i2 % 128;
            if (i2 % 2 == 0) {
                return this.hostnameVerifier;
            }
            throw null;
        }

        public final void setHostnameVerifier$okhttp(HostnameVerifier hostnameVerifier) {
            int i = 2 % 2;
            int i2 = f1286a + 71;
            g = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(hostnameVerifier, "");
                this.hostnameVerifier = hostnameVerifier;
                int i3 = 43 / 0;
            } else {
                Intrinsics.checkNotNullParameter(hostnameVerifier, "");
                this.hostnameVerifier = hostnameVerifier;
            }
            int i4 = f1286a + 77;
            g = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 39 / 0;
            }
        }

        public final CertificatePinner getCertificatePinner$okhttp() {
            int i = 2 % 2;
            int i2 = f1286a;
            int i3 = i2 + 57;
            g = i3 % 128;
            int i4 = i3 % 2;
            CertificatePinner certificatePinner = this.certificatePinner;
            int i5 = i2 + 21;
            g = i5 % 128;
            int i6 = i5 % 2;
            return certificatePinner;
        }

        public final void setCertificatePinner$okhttp(CertificatePinner certificatePinner) {
            int i = 2 % 2;
            int i2 = g + 19;
            f1286a = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(certificatePinner, "");
                this.certificatePinner = certificatePinner;
                int i3 = 32 / 0;
            } else {
                Intrinsics.checkNotNullParameter(certificatePinner, "");
                this.certificatePinner = certificatePinner;
            }
            int i4 = g + 11;
            f1286a = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
            int i = 2 % 2;
            int i2 = g + 77;
            int i3 = i2 % 128;
            f1286a = i3;
            int i4 = i2 % 2;
            CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
            int i5 = i3 + 115;
            g = i5 % 128;
            if (i5 % 2 != 0) {
                return certificateChainCleaner;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void setCertificateChainCleaner$okhttp(CertificateChainCleaner certificateChainCleaner) {
            int i = 2 % 2;
            int i2 = g + 31;
            f1286a = i2 % 128;
            int i3 = i2 % 2;
            this.certificateChainCleaner = certificateChainCleaner;
            if (i3 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int getCallTimeout$okhttp() {
            int i = 2 % 2;
            int i2 = f1286a + 91;
            int i3 = i2 % 128;
            g = i3;
            int i4 = i2 % 2;
            int i5 = this.callTimeout;
            int i6 = i3 + 99;
            f1286a = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        public final void setCallTimeout$okhttp(int i) {
            int i2 = 2 % 2;
            int i3 = g;
            int i4 = i3 + 93;
            f1286a = i4 % 128;
            int i5 = i4 % 2;
            this.callTimeout = i;
            int i6 = i3 + 79;
            f1286a = i6 % 128;
            int i7 = i6 % 2;
        }

        public final int getConnectTimeout$okhttp() {
            int i = 2 % 2;
            int i2 = g + 119;
            f1286a = i2 % 128;
            int i3 = i2 % 2;
            int i4 = this.connectTimeout;
            if (i3 != 0) {
                int i5 = 90 / 0;
            }
            return i4;
        }

        public final void setConnectTimeout$okhttp(int i) {
            int i2 = 2 % 2;
            int i3 = f1286a;
            int i4 = i3 + 107;
            g = i4 % 128;
            int i5 = i4 % 2;
            this.connectTimeout = i;
            int i6 = i3 + 21;
            g = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int getReadTimeout$okhttp() {
            int i = 2 % 2;
            int i2 = f1286a;
            int i3 = i2 + 29;
            g = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i4 = this.readTimeout;
            int i5 = i2 + 59;
            g = i5 % 128;
            if (i5 % 2 != 0) {
                return i4;
            }
            obj.hashCode();
            throw null;
        }

        public final void setReadTimeout$okhttp(int i) {
            int i2 = 2 % 2;
            int i3 = f1286a;
            int i4 = i3 + 55;
            g = i4 % 128;
            int i5 = i4 % 2;
            this.readTimeout = i;
            if (i5 == 0) {
                int i6 = 90 / 0;
            }
            int i7 = i3 + 21;
            g = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
        }

        public final int getWriteTimeout$okhttp() {
            int i = 2 % 2;
            int i2 = g + 71;
            int i3 = i2 % 128;
            f1286a = i3;
            int i4 = i2 % 2;
            int i5 = this.writeTimeout;
            int i6 = i3 + 103;
            g = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        public final void setWriteTimeout$okhttp(int i) {
            int i2 = 2 % 2;
            int i3 = f1286a + 111;
            g = i3 % 128;
            int i4 = i3 % 2;
            this.writeTimeout = i;
            if (i4 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int getPingInterval$okhttp() {
            int i;
            int i2 = 2 % 2;
            int i3 = f1286a;
            int i4 = i3 + 59;
            g = i4 % 128;
            if (i4 % 2 == 0) {
                i = this.pingInterval;
                int i5 = 30 / 0;
            } else {
                i = this.pingInterval;
            }
            int i6 = i3 + 79;
            g = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 73 / 0;
            }
            return i;
        }

        public final void setPingInterval$okhttp(int i) {
            int i2 = 2 % 2;
            int i3 = f1286a + 23;
            int i4 = i3 % 128;
            g = i4;
            int i5 = i3 % 2;
            this.pingInterval = i;
            if (i5 == 0) {
                throw null;
            }
            int i6 = i4 + 89;
            f1286a = i6 % 128;
            int i7 = i6 % 2;
        }

        public final long getMinWebSocketMessageToCompress$okhttp() {
            int i = 2 % 2;
            int i2 = g;
            int i3 = i2 + 49;
            f1286a = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            long j = this.minWebSocketMessageToCompress;
            int i4 = i2 + 29;
            f1286a = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 74 / 0;
            }
            return j;
        }

        public final void setMinWebSocketMessageToCompress$okhttp(long j) {
            int i = 2 % 2;
            int i2 = g + 39;
            int i3 = i2 % 128;
            f1286a = i3;
            int i4 = i2 % 2;
            this.minWebSocketMessageToCompress = j;
            int i5 = i3 + 27;
            g = i5 % 128;
            int i6 = i5 % 2;
        }

        public final RouteDatabase getRouteDatabase$okhttp() {
            int i = 2 % 2;
            int i2 = g + 27;
            f1286a = i2 % 128;
            if (i2 % 2 == 0) {
                return this.routeDatabase;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void setRouteDatabase$okhttp(RouteDatabase routeDatabase) {
            int i = 2 % 2;
            int i2 = f1286a + 7;
            g = i2 % 128;
            int i3 = i2 % 2;
            this.routeDatabase = routeDatabase;
            if (i3 == 0) {
                int i4 = 51 / 0;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(OkHttpClient okHttpClient) {
            this();
            Intrinsics.checkNotNullParameter(okHttpClient, "");
            this.dispatcher = okHttpClient.dispatcher();
            this.connectionPool = okHttpClient.connectionPool();
            CollectionsKt.addAll(this.interceptors, okHttpClient.interceptors());
            CollectionsKt.addAll(this.networkInterceptors, okHttpClient.networkInterceptors());
            this.eventListenerFactory = okHttpClient.eventListenerFactory();
            this.retryOnConnectionFailure = okHttpClient.retryOnConnectionFailure();
            this.authenticator = okHttpClient.authenticator();
            this.followRedirects = okHttpClient.followRedirects();
            this.followSslRedirects = okHttpClient.followSslRedirects();
            this.cookieJar = okHttpClient.cookieJar();
            this.cache = okHttpClient.cache();
            this.dns = okHttpClient.dns();
            this.proxy = okHttpClient.proxy();
            this.proxySelector = okHttpClient.proxySelector();
            this.proxyAuthenticator = okHttpClient.proxyAuthenticator();
            this.socketFactory = okHttpClient.socketFactory();
            this.sslSocketFactoryOrNull = OkHttpClient.access$getSslSocketFactoryOrNull$p(okHttpClient);
            this.x509TrustManagerOrNull = okHttpClient.x509TrustManager();
            this.connectionSpecs = okHttpClient.connectionSpecs();
            this.protocols = okHttpClient.protocols();
            this.hostnameVerifier = okHttpClient.hostnameVerifier();
            this.certificatePinner = okHttpClient.certificatePinner();
            this.certificateChainCleaner = okHttpClient.certificateChainCleaner();
            this.callTimeout = okHttpClient.callTimeoutMillis();
            this.connectTimeout = okHttpClient.connectTimeoutMillis();
            this.readTimeout = okHttpClient.readTimeoutMillis();
            this.writeTimeout = okHttpClient.writeTimeoutMillis();
            this.pingInterval = okHttpClient.pingIntervalMillis();
            this.minWebSocketMessageToCompress = okHttpClient.minWebSocketMessageToCompress();
            this.routeDatabase = okHttpClient.getRouteDatabase();
        }

        public final Builder dispatcher(Dispatcher p0) {
            int i = 2 % 2;
            int i2 = f1286a + 51;
            g = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(p0, "");
            this.dispatcher = p0;
            int i4 = f1286a + 37;
            g = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        public final Builder connectionPool(ConnectionPool p0) {
            int i = 2 % 2;
            int i2 = g + 57;
            f1286a = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(p0, "");
            this.connectionPool = p0;
            int i4 = f1286a + 71;
            g = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        public final List<Interceptor> interceptors() {
            List<Interceptor> list;
            int i = 2 % 2;
            int i2 = g + 119;
            int i3 = i2 % 128;
            f1286a = i3;
            if (i2 % 2 != 0) {
                list = this.interceptors;
                int i4 = 11 / 0;
            } else {
                list = this.interceptors;
            }
            int i5 = i3 + 15;
            g = i5 % 128;
            int i6 = i5 % 2;
            return list;
        }

        public final Builder addInterceptor(Interceptor p0) {
            int i = 2 % 2;
            int i2 = g + 91;
            f1286a = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(p0, "");
                this.interceptors.add(p0);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(p0, "");
            this.interceptors.add(p0);
            int i3 = g + 109;
            f1286a = i3 % 128;
            int i4 = i3 % 2;
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:62:0x065c  */
        /* JADX WARN: Code duplicated, block: B:69:0x0675  */
        /* JADX INFO: renamed from: -addInterceptor, reason: not valid java name */
        public final Builder m9626addInterceptor(final Function1<? super Interceptor.Chain, Response> p0) throws Throwable {
            int i;
            boolean z;
            int i2;
            String string;
            Method method;
            int i3 = 2;
            int i4 = 2 % 2;
            Intrinsics.checkNotNullParameter(p0, "");
            ArrayList arrayList = new ArrayList();
            int iIntValue = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
            byte[] bArr = $$a;
            byte b2 = (byte) (bArr[14] - 1);
            byte b3 = bArr[8];
            Object[] objArr = new Object[1];
            c(b2, b3, (byte) (b3 + 1), objArr);
            Method[] methodArr = {Builder.class.getMethod((String) objArr[0], Interceptor.class)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                int iIndexOf = 2823 - TextUtils.indexOf("", "", 0, 0);
                int iKeyCodeFromString = 22 - KeyEvent.keyCodeFromString("");
                byte[] bArr2 = $$d;
                byte b4 = bArr2[7];
                Object[] objArr2 = new Object[1];
                d(b4, bArr2[5], b4, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatDelay, iIndexOf, iKeyCodeFromString, 1814927978, false, (String) objArr2[0], null);
            }
            long j = 0;
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) == null) {
                int i5 = g + 51;
                f1286a = i5 % 128;
                int i6 = i5 % 2;
                Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) View.resolveSize(0, 0), 2823 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 22 - TextUtils.getTrimmedLength(""))).getDeclaredMethods();
                int length = declaredMethods.length;
                int i7 = 0;
                while (i7 < length) {
                    int i8 = g + 65;
                    int i9 = i8 % 128;
                    f1286a = i9;
                    int i10 = i8 % i3;
                    Method method2 = declaredMethods[i7];
                    int i11 = i9 + 95;
                    g = i11 % 128;
                    int i12 = i11 % i3;
                    try {
                        Object[] objArr3 = new Object[1];
                        e((ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) - 1913063528, (-48) - ((Process.getThreadPriority(0) + 20) >> 6), (short) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 74), (byte) (TextUtils.lastIndexOf("", '0') + 1), 308416864 - View.MeasureSpec.getSize(0), objArr3);
                        Class<?> cls = Class.forName((String) objArr3[0]);
                        Object[] objArr4 = new Object[1];
                        e((-1913063531) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), Color.rgb(0, 0, 0) + 16777156, (short) (Color.red(0) - 45), (byte) Color.red(0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 308416887, objArr4);
                        Object[] objArr5 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr4[0], null).invoke(method2, null)).intValue())};
                        Object[] objArr6 = new Object[1];
                        e((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 1913063528, (-45) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (short) (98 - TextUtils.getOffsetAfter("", 0)), (byte) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), Gravity.getAbsoluteGravity(0, 0) + 308416898, objArr6);
                        Class<?> cls2 = Class.forName((String) objArr6[0]);
                        Object[] objArr7 = new Object[1];
                        e((-1913063529) - (ViewConfiguration.getLongPressTimeout() >> 16), (-64) - (ViewConfiguration.getWindowTouchSlop() >> 8), (short) ((-2) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (byte) (TextUtils.lastIndexOf("", '0', 0) + 1), 308416923 - (Process.myTid() >> 22), objArr7);
                        if (!(!((Boolean) cls2.getMethod((String) objArr7[0], Integer.TYPE).invoke(null, objArr5)).booleanValue())) {
                            Class cls3 = Long.TYPE;
                            Object[] objArr8 = new Object[1];
                            e(((Process.getThreadPriority(0) + 20) >> 6) - 1913063528, (KeyEvent.getMaxKeyCode() >> 16) - 48, (short) ((-76) - TextUtils.lastIndexOf("", '0', 0)), (byte) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 308416864 - TextUtils.getTrimmedLength(""), objArr8);
                            Class<?> cls4 = Class.forName((String) objArr8[0]);
                            Object[] objArr9 = new Object[1];
                            e((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1913063532, (-60) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (short) ((ViewConfiguration.getPressedStateDuration() >> 16) - 111), (byte) (ViewConfiguration.getEdgeSlop() >> 16), 308416930 - TextUtils.getCapsMode("", 0, 0), objArr9);
                            if (cls3.equals(cls4.getMethod((String) objArr9[0], null).invoke(method2, null))) {
                                Object[] objArr10 = new Object[1];
                                e((-1913063527) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0) - 48, (short) ((-74) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (byte) (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 308416864, objArr10);
                                Class<?> cls5 = Class.forName((String) objArr10[0]);
                                Object[] objArr11 = new Object[1];
                                e(View.combineMeasuredStates(0, 0) - 1913063531, (-55) - TextUtils.indexOf("", "", 0), (short) ((-24) - Color.green(0)), (byte) ExpandableListView.getPackedPositionGroup(0L), Color.alpha(0) + 308416942, objArr11);
                                Object[] objArr12 = (Object[]) cls5.getMethod((String) objArr11[0], null).invoke(method2, null);
                                if (objArr12.length == 2 && Long.TYPE.equals(objArr12[0])) {
                                    int i13 = g + 53;
                                    f1286a = i13 % 128;
                                    int i14 = i13 % 2;
                                    Object[] objArr13 = new Object[1];
                                    e((ViewConfiguration.getLongPressTimeout() >> 16) - 1913063528, (ViewConfiguration.getJumpTapTimeout() >> 16) - 48, (short) ((-75) - TextUtils.getOffsetBefore("", 0)), (byte) (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.indexOf((CharSequence) "", '0') + 308416865, objArr13);
                                    if (Class.forName((String) objArr13[0]).equals(objArr12[1])) {
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                                            int i15 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2823;
                                            int i16 = 22 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                            byte[] bArr3 = $$d;
                                            byte b5 = bArr3[7];
                                            Object[] objArr14 = new Object[1];
                                            d(b5, bArr3[5], b5, objArr14);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cNormalizeMetaState, i15, i16, 1814927978, false, (String) objArr14[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method2);
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                            char c = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                            int i17 = 2823 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 22;
                                            byte[] bArr4 = $$d;
                                            byte b6 = bArr4[7];
                                            Object[] objArr15 = new Object[1];
                                            d(b6, bArr4[5], b6, objArr15);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, i17, pressedStateDuration, 1814927978, false, (String) objArr15[0], null);
                                        }
                                        try {
                                            Object[] objArr16 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                int iAlpha = 2823 - Color.alpha(0);
                                                int jumpTapTimeout = 22 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                                                byte[] bArr5 = $$d;
                                                Object[] objArr17 = new Object[1];
                                                d(bArr5[10], bArr5[7], bArr5[5], objArr17);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollDefaultDelay, iAlpha, jumpTapTimeout, -2137287382, false, (String) objArr17[0], new Class[]{Long.TYPE, Method.class});
                                            }
                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr16)).longValue();
                                            int i18 = f1286a + 101;
                                            g = i18 % 128;
                                            int i19 = i18 % 2;
                                            break;
                                        } catch (Throwable th) {
                                            Throwable cause = th.getCause();
                                            if (cause != null) {
                                                throw cause;
                                            }
                                            throw th;
                                        }
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                        i7++;
                        i3 = 2;
                        j = 0;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                }
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                char c2 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 2823;
                int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 22;
                byte[] bArr6 = $$d;
                byte b7 = bArr6[7];
                Object[] objArr18 = new Object[1];
                d(b7, bArr6[5], b7, objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, tapTimeout, maximumFlingVelocity, 1814927978, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char c3 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 2823;
                int touchSlop = 22 - (ViewConfiguration.getTouchSlop() >> 8);
                byte b8 = (byte) ($$e >>> 2);
                byte[] bArr7 = $$d;
                Object[] objArr20 = new Object[1];
                d(b8, bArr7[7], bArr7[5], objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, iResolveSizeAndState, touchSlop, 1025296417, false, (String) objArr20[0], new Class[]{Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr19);
            Object[] objArr21 = {0, methodArr, null};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char cGreen = (char) (Color.green(0) + 37657);
                int pressedStateDuration2 = 2720 - (ViewConfiguration.getPressedStateDuration() >> 16);
                int tapTimeout2 = 19 - (ViewConfiguration.getTapTimeout() >> 16);
                byte b9 = (byte) ($$e >>> 2);
                byte[] bArr8 = $$d;
                Object[] objArr22 = new Object[1];
                d(b9, bArr8[7], bArr8[5], objArr22);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cGreen, pressedStateDuration2, tapTimeout2, -1568796068, false, (String) objArr22[0], new Class[]{Integer.TYPE, Method[].class, List.class});
            }
            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr21)).longValue();
            long j2 = -906717689;
            long j3 = -445;
            long j4 = (j3 * j2) + (j3 * jLongValue);
            long j5 = 446;
            long j6 = -1;
            long j7 = j2 ^ j6;
            long j8 = jLongValue ^ j6;
            long j9 = (j7 | j8) ^ j6;
            long jIdentityHashCode = System.identityHashCode(this);
            long j10 = j4 + ((j9 | ((j8 | (jIdentityHashCode ^ j6)) ^ j6)) * j5) + ((((j7 | jLongValue) ^ j6) | (j6 ^ ((j8 | j2) | jIdentityHashCode))) * j5) + (j5 * j9) + ((long) (-903688156));
            int i20 = ~System.identityHashCode(this);
            int i21 = ~(906313123 | i20);
            int i22 = ((int) (j10 >> 32)) & ((-1410933162) + ((530913287 | i21) * 764) + (((~(i20 | 530913287)) | 536880544) * (-1528)) + ((698361252 | i21) * 764));
            int iMyTid = Process.myTid();
            int i23 = ~iMyTid;
            int i24 = i22 | (((int) j10) & ((-382936411) + (((~(i23 | 1332814383)) | (~((-1524926503) | i23)) | 277121024) * 464) + (((-1247805479) | iMyTid) * (-464)) + (((~(iMyTid | 1332814383)) | 277121024) * 464)));
            int i25 = i24 >>> 24;
            int i26 = i24 & ViewCompat.MEASURED_SIZE_MASK;
            if (i25 != 0) {
                int i27 = f1286a + 117;
                g = i27 % 128;
                i = 2;
                int i28 = i27 % 2;
                z = true;
            } else {
                i = 2;
                z = false;
            }
            if (z) {
                int i29 = f1286a + 91;
                g = i29 % 128;
                if (i29 % i == 0) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
            } else {
                i2 = 0;
            }
            if (z) {
                int i30 = f1286a + 31;
                g = i30 % 128;
                int i31 = i30 % 2;
                if (i26 >= 1 || (method = methodArr[i26]) == null) {
                    string = null;
                } else {
                    string = method.toString();
                }
            } else {
                string = null;
            }
            arrayList.add(string);
            if ((i25 + 6) * i2 != 0) {
                Toast.makeText((Context) null, iIntValue / (((iIntValue - 1) * iIntValue) % 2), 0).show();
            }
            Builder builderAddInterceptor = addInterceptor(new Interceptor() { // from class: okhttp3.OkHttpClient$Builder$addInterceptor$2
                @Override // okhttp3.Interceptor
                public final Response intercept(Interceptor.Chain chain) {
                    Intrinsics.checkNotNullParameter(chain, "");
                    return p0.invoke(chain);
                }
            });
            int i32 = g + 1;
            f1286a = i32 % 128;
            int i33 = i32 % 2;
            return builderAddInterceptor;
        }

        public final List<Interceptor> networkInterceptors() {
            int i = 2 % 2;
            int i2 = g + 61;
            int i3 = i2 % 128;
            f1286a = i3;
            int i4 = i2 % 2;
            List<Interceptor> list = this.networkInterceptors;
            int i5 = i3 + 63;
            g = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 78 / 0;
            }
            return list;
        }

        public final Builder addNetworkInterceptor(Interceptor p0) {
            int i = 2 % 2;
            int i2 = f1286a + 77;
            g = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(p0, "");
            this.networkInterceptors.add(p0);
            int i4 = f1286a + 87;
            g = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        /* JADX INFO: renamed from: -addNetworkInterceptor, reason: not valid java name */
        public final Builder m9627addNetworkInterceptor(final Function1<? super Interceptor.Chain, Response> p0) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(p0, "");
            Builder builderAddNetworkInterceptor = addNetworkInterceptor(new Interceptor() { // from class: okhttp3.OkHttpClient$Builder$addNetworkInterceptor$2
                @Override // okhttp3.Interceptor
                public final Response intercept(Interceptor.Chain chain) {
                    Intrinsics.checkNotNullParameter(chain, "");
                    return p0.invoke(chain);
                }
            });
            int i2 = f1286a + 91;
            g = i2 % 128;
            int i3 = i2 % 2;
            return builderAddNetworkInterceptor;
        }

        public final Builder eventListener(EventListener p0) {
            int i = 2 % 2;
            int i2 = f1286a + 21;
            g = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(p0, "");
            this.eventListenerFactory = Util.asFactory(p0);
            int i4 = g + 27;
            f1286a = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 / 0;
            }
            return this;
        }

        public final Builder eventListenerFactory(EventListener.Factory p0) {
            int i = 2 % 2;
            int i2 = g + 109;
            f1286a = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(p0, "");
                this.eventListenerFactory = p0;
                return this;
            }
            Intrinsics.checkNotNullParameter(p0, "");
            this.eventListenerFactory = p0;
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder retryOnConnectionFailure(boolean p0) {
            int i = 2 % 2;
            int i2 = g + 45;
            f1286a = i2 % 128;
            if (i2 % 2 != 0) {
                this.retryOnConnectionFailure = p0;
                int i3 = 66 / 0;
            } else {
                this.retryOnConnectionFailure = p0;
            }
            return this;
        }

        public final Builder authenticator(Authenticator p0) {
            int i = 2 % 2;
            int i2 = f1286a + 51;
            g = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(p0, "");
            this.authenticator = p0;
            int i4 = g + 85;
            f1286a = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        public final Builder followRedirects(boolean p0) {
            int i = 2 % 2;
            int i2 = f1286a + 51;
            g = i2 % 128;
            if (i2 % 2 == 0) {
                this.followRedirects = p0;
                int i3 = 83 / 0;
            } else {
                this.followRedirects = p0;
            }
            return this;
        }

        public final Builder followSslRedirects(boolean p0) {
            int i = 2 % 2;
            int i2 = g + 115;
            int i3 = i2 % 128;
            f1286a = i3;
            int i4 = i2 % 2;
            this.followSslRedirects = p0;
            int i5 = i3 + 47;
            g = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final Builder cookieJar(CookieJar p0) {
            int i = 2 % 2;
            int i2 = g + 79;
            f1286a = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(p0, "");
                this.cookieJar = p0;
                return this;
            }
            Intrinsics.checkNotNullParameter(p0, "");
            this.cookieJar = p0;
            throw null;
        }

        public final Builder cache(Cache p0) {
            int i = 2 % 2;
            int i2 = f1286a;
            int i3 = i2 + 109;
            g = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                this.cache = p0;
                obj.hashCode();
                throw null;
            }
            this.cache = p0;
            int i4 = i2 + 113;
            g = i4 % 128;
            if (i4 % 2 != 0) {
                return this;
            }
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0031  */
        public final Builder dns(Dns p0) {
            int i = 2 % 2;
            int i2 = f1286a + 5;
            g = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(p0, "");
                int i3 = 37 / 0;
                if (!Intrinsics.areEqual(p0, this.dns)) {
                    this.routeDatabase = null;
                }
            } else {
                Intrinsics.checkNotNullParameter(p0, "");
                if (!Intrinsics.areEqual(p0, this.dns)) {
                    this.routeDatabase = null;
                }
            }
            this.dns = p0;
            int i4 = g + 81;
            f1286a = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 14 / 0;
            }
            return this;
        }

        public final Builder proxy(Proxy p0) {
            int i = 2 % 2;
            int i2 = g + 19;
            f1286a = i2 % 128;
            int i3 = i2 % 2;
            if (!Intrinsics.areEqual(p0, this.proxy)) {
                int i4 = g;
                int i5 = i4 + 83;
                f1286a = i5 % 128;
                int i6 = i5 % 2;
                this.routeDatabase = null;
                int i7 = i4 + 63;
                f1286a = i7 % 128;
                int i8 = i7 % 2;
            }
            this.proxy = p0;
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0031  */
        public final Builder proxySelector(ProxySelector p0) {
            int i = 2 % 2;
            int i2 = g + 115;
            f1286a = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(p0, "");
                int i3 = 31 / 0;
                if (!Intrinsics.areEqual(p0, this.proxySelector)) {
                    this.routeDatabase = null;
                    int i4 = g + 53;
                    f1286a = i4 % 128;
                    int i5 = i4 % 2;
                }
            } else {
                Intrinsics.checkNotNullParameter(p0, "");
                if (!Intrinsics.areEqual(p0, this.proxySelector)) {
                    this.routeDatabase = null;
                    int i6 = g + 53;
                    f1286a = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
            this.proxySelector = p0;
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0031  */
        public final Builder proxyAuthenticator(Authenticator p0) {
            int i = 2 % 2;
            int i2 = f1286a + 115;
            g = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(p0, "");
                int i3 = 98 / 0;
                if (!Intrinsics.areEqual(p0, this.proxyAuthenticator)) {
                    this.routeDatabase = null;
                    int i4 = g + 41;
                    f1286a = i4 % 128;
                    int i5 = i4 % 2;
                }
            } else {
                Intrinsics.checkNotNullParameter(p0, "");
                if (!Intrinsics.areEqual(p0, this.proxyAuthenticator)) {
                    this.routeDatabase = null;
                    int i6 = g + 41;
                    f1286a = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
            this.proxyAuthenticator = p0;
            return this;
        }

        public final Builder socketFactory(SocketFactory p0) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0 instanceof SSLSocketFactory) {
                throw new IllegalArgumentException("socketFactory instanceof SSLSocketFactory".toString());
            }
            if (!Intrinsics.areEqual(p0, this.socketFactory)) {
                int i2 = f1286a + 23;
                g = i2 % 128;
                if (i2 % 2 == 0) {
                    this.routeDatabase = null;
                    throw null;
                }
                this.routeDatabase = null;
            }
            this.socketFactory = p0;
            int i3 = g + 99;
            f1286a = i3 % 128;
            int i4 = i3 % 2;
            return this;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Use the sslSocketFactory overload that accepts a X509TrustManager.")
        public final Builder sslSocketFactory(SSLSocketFactory p0) {
            int i = 2 % 2;
            int i2 = f1286a + 115;
            g = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(p0, "");
            if (!Intrinsics.areEqual(p0, this.sslSocketFactoryOrNull)) {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = p0;
            X509TrustManager x509TrustManagerTrustManager = Platform.INSTANCE.get().trustManager(p0);
            if (x509TrustManagerTrustManager == null) {
                StringBuilder sb = new StringBuilder("Unable to extract the trust manager on ");
                sb.append(Platform.INSTANCE.get());
                sb.append(", sslSocketFactory is ");
                sb.append(p0.getClass());
                throw new IllegalStateException(sb.toString());
            }
            int i4 = g + 31;
            f1286a = i4 % 128;
            int i5 = i4 % 2;
            this.x509TrustManagerOrNull = x509TrustManagerTrustManager;
            Platform platform = Platform.INSTANCE.get();
            X509TrustManager x509TrustManager = this.x509TrustManagerOrNull;
            Intrinsics.checkNotNull(x509TrustManager);
            this.certificateChainCleaner = platform.buildCertificateChainCleaner(x509TrustManager);
            int i6 = f1286a + 13;
            g = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0031  */
        public final Builder sslSocketFactory(SSLSocketFactory p0, X509TrustManager p1) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            if (Intrinsics.areEqual(p0, this.sslSocketFactoryOrNull)) {
                int i2 = g + 25;
                f1286a = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.areEqual(p1, this.x509TrustManagerOrNull);
                    throw null;
                }
                if (!Intrinsics.areEqual(p1, this.x509TrustManagerOrNull)) {
                    this.routeDatabase = null;
                }
            } else {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = p0;
            this.certificateChainCleaner = CertificateChainCleaner.INSTANCE.get(p1);
            this.x509TrustManagerOrNull = p1;
            int i3 = f1286a + 85;
            g = i3 % 128;
            if (i3 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public final Builder connectionSpecs(List<ConnectionSpec> p0) {
            int i = 2 % 2;
            int i2 = f1286a + 101;
            g = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(p0, "");
            if (!Intrinsics.areEqual(p0, this.connectionSpecs)) {
                this.routeDatabase = null;
                int i4 = g + 125;
                f1286a = i4 % 128;
                int i5 = i4 % 2;
            }
            this.connectionSpecs = Util.toImmutableList(p0);
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0048  */
        /* JADX WARN: Code duplicated, block: B:9:0x003f A[PHI: r6
  0x003f: PHI (r6v3 java.util.List) = (r6v2 java.util.List), (r6v17 java.util.List) binds: [B:8:0x003d, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
        public final Builder protocols(List<? extends Protocol> p0) {
            List mutableList;
            int i = 2 % 2;
            int i2 = f1286a + 65;
            g = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(p0, "");
                mutableList = CollectionsKt.toMutableList((Collection) p0);
                int i3 = 16 / 0;
                if (!mutableList.contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
                    if (!mutableList.contains(Protocol.HTTP_1_1)) {
                        throw new IllegalArgumentException("protocols must contain h2_prior_knowledge or http/1.1: ".concat(String.valueOf(mutableList)).toString());
                    }
                }
            } else {
                Intrinsics.checkNotNullParameter(p0, "");
                mutableList = CollectionsKt.toMutableList((Collection) p0);
                if (!mutableList.contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
                    if (!mutableList.contains(Protocol.HTTP_1_1)) {
                        throw new IllegalArgumentException("protocols must contain h2_prior_knowledge or http/1.1: ".concat(String.valueOf(mutableList)).toString());
                    }
                }
            }
            if (mutableList.contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
                int i4 = f1286a + 39;
                g = i4 % 128;
                int i5 = i4 % 2;
                if (mutableList.size() > 1) {
                    throw new IllegalArgumentException("protocols containing h2_prior_knowledge cannot use other protocols: ".concat(String.valueOf(mutableList)).toString());
                }
            }
            if (mutableList.contains(Protocol.HTTP_1_0)) {
                throw new IllegalArgumentException("protocols must not contain http/1.0: ".concat(String.valueOf(mutableList)).toString());
            }
            int i6 = f1286a + 3;
            g = i6 % 128;
            if (i6 % 2 == 0) {
                Intrinsics.checkNotNull(mutableList, "");
                mutableList.contains(null);
                throw null;
            }
            Intrinsics.checkNotNull(mutableList, "");
            if (mutableList.contains(null)) {
                throw new IllegalArgumentException("protocols must not contain null".toString());
            }
            mutableList.remove(Protocol.SPDY_3);
            if (!Intrinsics.areEqual(mutableList, this.protocols)) {
                this.routeDatabase = null;
            }
            List<? extends Protocol> listUnmodifiableList = Collections.unmodifiableList(mutableList);
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "");
            this.protocols = listUnmodifiableList;
            return this;
        }

        public final Builder hostnameVerifier(HostnameVerifier p0) {
            int i = 2 % 2;
            int i2 = f1286a + 55;
            g = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(p0, "");
            if (!Intrinsics.areEqual(p0, this.hostnameVerifier)) {
                int i4 = g + 51;
                f1286a = i4 % 128;
                if (i4 % 2 != 0) {
                    this.routeDatabase = null;
                    int i5 = 33 / 0;
                } else {
                    this.routeDatabase = null;
                }
            }
            this.hostnameVerifier = p0;
            return this;
        }

        public final Builder certificatePinner(CertificatePinner p0) {
            int i = 2 % 2;
            int i2 = g + 109;
            f1286a = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(p0, "");
            if (!Intrinsics.areEqual(p0, this.certificatePinner)) {
                int i4 = f1286a + 85;
                g = i4 % 128;
                if (i4 % 2 == 0) {
                    this.routeDatabase = null;
                    throw null;
                }
                this.routeDatabase = null;
            }
            this.certificatePinner = p0;
            return this;
        }

        public final Builder callTimeout(long p0, TimeUnit p1) {
            int i = 2 % 2;
            int i2 = f1286a + 17;
            g = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(p1, "");
            this.callTimeout = Util.checkDuration("timeout", p0, p1);
            int i4 = g + 77;
            f1286a = i4 % 128;
            if (i4 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public final Builder callTimeout(Duration p0) {
            int i = 2 % 2;
            int i2 = f1286a + 13;
            g = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(p0, "");
                callTimeout(p0.toMillis(), TimeUnit.MILLISECONDS);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(p0, "");
            callTimeout(p0.toMillis(), TimeUnit.MILLISECONDS);
            int i3 = g + 51;
            f1286a = i3 % 128;
            int i4 = i3 % 2;
            return this;
        }

        public final Builder connectTimeout(long p0, TimeUnit p1) {
            int i = 2 % 2;
            int i2 = f1286a + 27;
            g = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(p1, "");
                this.connectTimeout = Util.checkDuration("timeout", p0, p1);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(p1, "");
            this.connectTimeout = Util.checkDuration("timeout", p0, p1);
            int i3 = g + 107;
            f1286a = i3 % 128;
            int i4 = i3 % 2;
            return this;
        }

        public final Builder connectTimeout(Duration p0) {
            int i = 2 % 2;
            int i2 = g + 23;
            f1286a = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(p0, "");
            connectTimeout(p0.toMillis(), TimeUnit.MILLISECONDS);
            int i4 = g + 49;
            f1286a = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        public final Builder readTimeout(long p0, TimeUnit p1) {
            int i = 2 % 2;
            int i2 = g + 45;
            f1286a = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(p1, "");
            this.readTimeout = Util.checkDuration("timeout", p0, p1);
            int i4 = g + 27;
            f1286a = i4 % 128;
            if (i4 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public final Builder readTimeout(Duration p0) {
            int i = 2 % 2;
            int i2 = g + 41;
            f1286a = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(p0, "");
                readTimeout(p0.toMillis(), TimeUnit.MILLISECONDS);
                throw null;
            }
            Intrinsics.checkNotNullParameter(p0, "");
            readTimeout(p0.toMillis(), TimeUnit.MILLISECONDS);
            int i3 = g + 53;
            f1286a = i3 % 128;
            if (i3 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public final Builder writeTimeout(long p0, TimeUnit p1) {
            int i = 2 % 2;
            int i2 = g + 11;
            f1286a = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(p1, "");
            this.writeTimeout = Util.checkDuration("timeout", p0, p1);
            int i4 = g + 21;
            f1286a = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        public final Builder writeTimeout(Duration p0) {
            int i = 2 % 2;
            int i2 = f1286a + 69;
            g = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(p0, "");
                writeTimeout(p0.toMillis(), TimeUnit.MILLISECONDS);
                int i3 = 18 / 0;
            } else {
                Intrinsics.checkNotNullParameter(p0, "");
                writeTimeout(p0.toMillis(), TimeUnit.MILLISECONDS);
            }
            int i4 = f1286a + 109;
            g = i4 % 128;
            if (i4 % 2 != 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder pingInterval(long p0, TimeUnit p1) {
            int i = 2 % 2;
            int i2 = g + 89;
            f1286a = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(p1, "");
                this.pingInterval = Util.checkDuration("interval", p0, p1);
                return this;
            }
            Intrinsics.checkNotNullParameter(p1, "");
            this.pingInterval = Util.checkDuration("interval", p0, p1);
            throw null;
        }

        public final Builder pingInterval(Duration p0) {
            int i = 2 % 2;
            int i2 = f1286a + 75;
            g = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(p0, "");
                pingInterval(p0.toMillis(), TimeUnit.MILLISECONDS);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(p0, "");
            pingInterval(p0.toMillis(), TimeUnit.MILLISECONDS);
            int i3 = g + 81;
            f1286a = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 49 / 0;
            }
            return this;
        }

        public final Builder minWebSocketMessageToCompress(long p0) {
            int i = 2 % 2;
            int i2 = f1286a;
            int i3 = i2 + 23;
            g = i3 % 128;
            if (i3 % 2 != 0 ? p0 < 0 : p0 < 1) {
                throw new IllegalArgumentException("minWebSocketMessageToCompress must be positive: ".concat(String.valueOf(p0)).toString());
            }
            this.minWebSocketMessageToCompress = p0;
            int i4 = i2 + 125;
            g = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 8 / 0;
            }
            return this;
        }

        public final OkHttpClient build() {
            int i = 2 % 2;
            if (getVideoProfiles.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new ArrayList()) != 0) {
                throw null;
            }
            OkHttpClient okHttpClient = new OkHttpClient(this);
            int i2 = g + 57;
            f1286a = i2 % 128;
            if (i2 % 2 == 0) {
                return okHttpClient;
            }
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(short r5, byte r6, byte r7) {
            /*
                byte[] r0 = okhttp3.OkHttpClient.Builder.$$c
                int r6 = r6 * 3
                int r6 = 1 - r6
                int r7 = r7 * 4
                int r7 = 3 - r7
                int r5 = 121 - r5
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L15
                r4 = r5
                r5 = r6
                r3 = r2
                goto L27
            L15:
                r3 = r2
            L16:
                int r7 = r7 + 1
                byte r4 = (byte) r5
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r6) goto L25
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                return r5
            L25:
                r4 = r0[r7]
            L27:
                int r5 = r5 + r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.OkHttpClient.Builder.$$g(short, byte, byte):java.lang.String");
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x01a7 A[PHI: r0
  0x01a7: PHI (r0v35 int) = (r0v8 int), (r0v38 int) binds: [B:38:0x01a5, B:35:0x0193] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x01a9 A[PHI: r0
  0x01a9: PHI (r0v9 int) = (r0v8 int), (r0v38 int) binds: [B:38:0x01a5, B:35:0x0193] A[DONT_GENERATE, DONT_INLINE]] */
    private static void f(int i, int i2, short s, int i3, byte b2, Object[] objArr) throws Throwable {
        int i4;
        int i5;
        boolean z;
        int i6 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(f1285a)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b3 = (byte) 0;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 2267 - View.MeasureSpec.getMode(0), 33 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 1387473586, false, $$g(b3, b3, (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            if (z2) {
                byte[] bArr = d;
                if (bArr != null) {
                    int i7 = $11 + 69;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i9 = 0; i9 < length; i9++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 3358, TextUtils.indexOf("", "") + 18, -1054011043, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                        }
                        bArr2[i9] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = d;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(b)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((Process.getThreadPriority(0) + 20) >> 6), 2266 - TextUtils.lastIndexOf("", '0', 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 34, 1387473586, false, $$g(b6, b6, (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) f1285a) ^ 3046761265686732006L)));
                } else {
                    iIntValue = (short) (((short) (((long) g[i + ((int) (((long) b) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) f1285a) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                int i10 = $11 + 89;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    i4 = ((i - iIntValue) << 2) << ((int) (((long) b) & 3046761265686732006L));
                    if (!z2) {
                        i5 = 0;
                    } else {
                        i5 = 1;
                    }
                } else {
                    i4 = ((i + iIntValue) - 2) + ((int) (((long) b) ^ 3046761265686732006L));
                    if (z2) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i4 + i5;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(asBinder), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (55905 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 2855 - (ViewConfiguration.getPressedStateDuration() >> 16), 12 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -1529949196, false, $$g(b7, b8, (byte) (b8 + 3)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = d;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i11 = 0; i11 < length2; i11++) {
                        int i12 = $10 + 13;
                        $11 = i12 % 128;
                        int i13 = i12 % 2;
                        bArr5[i11] = (byte) (((long) bArr4[i11]) ^ 3046761265686732006L);
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i14 = $10 + 111;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    z = true;
                } else {
                    z = false;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    if (z) {
                        int i16 = $10 + 71;
                        $11 = i16 % 128;
                        int i17 = i16 % 2;
                        byte[] bArr6 = d;
                        int i18 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i18 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i18]) ^ 3046761265686732006L)) + s)) ^ b2));
                        int i19 = $10 + 107;
                        $11 = i19 % 128;
                        if (i19 % 2 == 0) {
                            int i20 = 4 % 4;
                        }
                    } else {
                        short[] sArr = g;
                        int i21 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i21 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i21]) ^ 3046761265686732006L)) + s)) ^ b2));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x021f  */
    public final int readTimeoutMillis() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 89;
        notify = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cMyTid = (char) (Process.myTid() >> 22);
            int iIndexOf = TextUtils.indexOf("", "") + 876;
            int bitsPerPixel = 9 - ImageFormat.getBitsPerPixel(0);
            Object[] objArr2 = new Object[1];
            c((byte) ($$b & 31), (byte) 51, $$a[5], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyTid, iIndexOf, bitsPerPixel, 252381699, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{64292, 8136, 30552, 64948, 64539, 52481, 52526, 58632, 44720, 56833, 24957, 51320, 2872, 44247, 57067, 25762, 2898, 31745, 39496, 62596, 33938, 5298, 38568, 11827}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{46223, 4798, 'E', 62663, 12023, 50268, 22761, 41426, 31203, 23145, 7626, 7013, 31681, 35109, 63655, 15117, 9440, 6329}, (ViewConfiguration.getLongPressTimeout() >> 16) + 15, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int defaultSize = View.getDefaultSize(0, 0) + 876;
            int i4 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 10;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr5 = new Object[1];
            c(b2, (byte) (-bArr[5]), b2, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, defaultSize, i4, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = notify + 81;
            INotificationSideChannel = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cRgb = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
                int i7 = 876 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int i8 = 10 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                byte[] bArr2 = $$a;
                byte b3 = bArr2[10];
                Object[] objArr6 = new Object[1];
                c(b3, (byte) (b3 | 32), bArr2[5], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cRgb, i7, i8, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i9 = (((((~((-539250897) | iIdentityHashCode)) | (-582843136)) * TypedValues.PositionType.TYPE_TRANSITION_EASING) + 405185988) + ((~((~iIdentityHashCode) | (-539250897))) * TypedValues.PositionType.TYPE_TRANSITION_EASING)) - 1726214433;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[1])[0] = i11 ^ (i11 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{19361, 43281, 29532, 46606, 45231, 33810, 51193, 49473, 23813, 36930, 44999, 6192, 15834, 43224, 15069, 30645, 20424, 64459, 61483, 43473, 45353, 30642, 20302, 54829, 60309, 52100, 2780, 19428}, 26 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            f((-625987606) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (-974717836) - KeyEvent.keyCodeFromString(""), (short) View.MeasureSpec.makeMeasureSpec(0, 0), View.combineMeasuredStates(0, 0) - 101, (byte) ((Process.myPid() >> 22) - 60), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i12 = notify;
                int i13 = i12 + 125;
                INotificationSideChannel = i13 % 128;
                int i14 = i13 % 2;
                if (applicationContext instanceof ContextWrapper) {
                    int i15 = i12 + 15;
                    INotificationSideChannel = i15 % 128;
                    int i16 = i15 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            f((Process.myTid() >> 22) - 625987588, TextUtils.indexOf("", "", 0, 0) - 974717829, (short) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (-103) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (byte) (13 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new char[]{31587, 9243, 62351, 17871, 26372, 56067, 48886, 51613, 30658, 57752, 61258, 26945, 29217, 24140, 49745, 29374, 15553, 22989}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 17, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i17 = notify + 57;
            INotificationSideChannel = i17 % 128;
            int i18 = i17 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), -1726214433};
                byte[] bArr3 = $$d;
                byte b4 = bArr3[6];
                byte b5 = (byte) (b4 - 1);
                Object[] objArr13 = new Object[1];
                h(b5, (byte) (-b5), b4, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b6 = bArr3[20];
                byte b7 = bArr3[6];
                Object[] objArr14 = new Object[1];
                h(b6, b7, (byte) (b7 + 1), objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                        int packedPositionChild = 875 - ExpandableListView.getPackedPositionChild(0L);
                        int modifierMetaStateMask = 9 - ((byte) KeyEvent.getModifierMetaStateMask());
                        byte[] bArr4 = $$a;
                        byte b8 = bArr4[10];
                        Object[] objArr15 = new Object[1];
                        c(b8, (byte) (b8 | 32), bArr4[5], objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf, packedPositionChild, modifierMetaStateMask, 256017550, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        e(new char[]{64292, 8136, 30552, 64948, 64539, 52481, 52526, 58632, 44720, 56833, 24957, 51320, 2872, 44247, 57067, 25762, 2898, 31745, 39496, 62596, 33938, 5298, 38568, 11827}, 22 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr16);
                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        e(new char[]{46223, 4798, 'E', 62663, 12023, 50268, 22761, 41426, 31203, 23145, 7626, 7013, 31681, 35109, 63655, 15117, 9440, 6329}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 15, objArr17);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c2 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            int mirror = AndroidCharacter.getMirror('0') + 828;
                            int iMakeMeasureSpec = 10 - View.MeasureSpec.makeMeasureSpec(0, 0);
                            byte[] bArr5 = $$a;
                            byte b9 = bArr5[7];
                            Object[] objArr18 = new Object[1];
                            c(b9, (byte) (-bArr5[5]), b9, objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, mirror, iMakeMeasureSpec, 2009631821, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c3 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                            int iNormalizeMetaState = 876 - KeyEvent.normalizeMetaState(0);
                            int iIndexOf2 = 9 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                            Object[] objArr19 = new Object[1];
                            c((byte) ($$b & 31), (byte) 51, $$a[5], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, iNormalizeMetaState, iIndexOf2, 252381699, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (((int[]) objArr[0])[0] != ((int[]) objArr[2])[0]) {
            throw null;
        }
        int i19 = ((int[]) objArr[1])[0];
        Object[] objArr20 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i20 = (-317441676) + (((~(663697627 | iUptimeMillis)) | (-623387399)) * 672);
        int i21 = ~iUptimeMillis;
        int i22 = i19 + i20 + (((~(iUptimeMillis | (-623387399))) | (~((-663697628) | i21))) * (-672)) + (((~(623387398 | i21)) | (-665795552)) * 672);
        int i23 = (i22 << 13) ^ i22;
        int i24 = i23 ^ (i23 >>> 17);
        ((int[]) objArr20[1])[0] = i24 ^ (i24 << 5);
        return this.readTimeoutMillis;
    }

    public final int writeTimeoutMillis() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel;
        int i3 = i2 + 91;
        notify = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.writeTimeoutMillis;
        int i6 = i2 + 45;
        notify = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int pingIntervalMillis() {
        int i = 2 % 2;
        int i2 = notify + 79;
        int i3 = i2 % 128;
        INotificationSideChannel = i3;
        int i4 = i2 % 2;
        int i5 = this.pingIntervalMillis;
        int i6 = i3 + 75;
        notify = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final long minWebSocketMessageToCompress() {
        long j;
        int i = 2 % 2;
        int i2 = notify;
        int i3 = i2 + 81;
        INotificationSideChannel = i3 % 128;
        if (i3 % 2 != 0) {
            j = this.minWebSocketMessageToCompress;
            int i4 = 86 / 0;
        } else {
            j = this.minWebSocketMessageToCompress;
        }
        int i5 = i2 + 41;
        INotificationSideChannel = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final RouteDatabase getRouteDatabase() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel;
        int i3 = i2 + 85;
        notify = i3 % 128;
        int i4 = i3 % 2;
        RouteDatabase routeDatabase = this.routeDatabase;
        int i5 = i2 + 83;
        notify = i5 % 128;
        int i6 = i5 % 2;
        return routeDatabase;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0514  */
    /* JADX WARN: Code duplicated, block: B:71:0x0519  */
    /* JADX WARN: Code duplicated, block: B:74:0x0525  */
    /* JADX WARN: Code duplicated, block: B:77:0x052a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:81:0x0541  */
    /* JADX WARN: Code duplicated, block: B:84:0x054a  */
    public OkHttpClient() throws Throwable {
        int i;
        boolean z;
        int i2;
        int i3;
        String string;
        Constructor constructor;
        Method[] declaredMethods;
        int length;
        int i4;
        ArrayList arrayList = new ArrayList();
        Constructor[] constructorArr = {OkHttpClient.class.getDeclaredConstructor(Builder.class)};
        int i5 = -2001519171;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        long j = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int i6 = 2824 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            int iResolveSize = View.resolveSize(0, 0) + 22;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr = new Object[1];
            c(b2, (byte) (-bArr[5]), b2, objArr);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumFlingVelocity, i6, iResolveSize, 1814927978, false, (String) objArr[0], null);
        }
        int i7 = 2;
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) == null) {
            int i8 = notify + 85;
            INotificationSideChannel = i8 % 128;
            if (i8 % 2 != 0) {
                declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 2823 - (ViewConfiguration.getScrollDefaultDelay() >> 16), View.resolveSizeAndState(0, 0, 0) + 22)).getDeclaredMethods();
                length = declaredMethods.length;
                i4 = 1;
            } else {
                declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) Color.blue(0), View.resolveSize(0, 0) + 2823, TextUtils.lastIndexOf("", '0') + 23)).getDeclaredMethods();
                length = declaredMethods.length;
                i4 = 0;
            }
            int i9 = 2 % 2;
            while (i4 < length) {
                int i10 = notify + 93;
                INotificationSideChannel = i10 % 128;
                int i11 = i10 % i7;
                Method method = declaredMethods[i4];
                try {
                    Object[] objArr2 = new Object[1];
                    e(new char[]{62514, 3149, 63812, 40945, 29051, 50797, 54805, 64082, 7134, 16810, 32742, 28834, 1870, 17861, 3999, 58831, 7135, 17783, 55262, 7105, 48740, 5831, 39030, 37187, 4544, 46431}, MotionEvent.axisFromString("") + 25, objArr2);
                    Class<?> cls = Class.forName((String) objArr2[0]);
                    Object[] objArr3 = new Object[1];
                    e(new char[]{31808, 29430, 33216, 65060, 38228, 55821, 38693, 44131, 41697, 33066, 30866, 41644, 17833, 57690}, (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 11, objArr3);
                    Object[] objArr4 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr3[0], null).invoke(method, null)).intValue())};
                    Object[] objArr5 = new Object[1];
                    f(TextUtils.indexOf("", "") - 625987642, TextUtils.indexOf("", "") - 974717829, (short) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) - 94, (byte) ((Process.myPid() >> 22) - 91), objArr5);
                    Class<?> cls2 = Class.forName((String) objArr5[0]);
                    Object[] objArr6 = new Object[1];
                    e(new char[]{40378, 3741, 63839, 60649, 24553, 65502, 11103, 43379, 699, 46349}, 8 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr6);
                    if (((Boolean) cls2.getMethod((String) objArr6[0], Integer.TYPE).invoke(null, objArr4)).booleanValue()) {
                        Class cls3 = Long.TYPE;
                        Object[] objArr7 = new Object[1];
                        e(new char[]{62514, 3149, 63812, 40945, 29051, 50797, 54805, 64082, 7134, 16810, 32742, 28834, 1870, 17861, 3999, 58831, 7135, 17783, 55262, 7105, 48740, 5831, 39030, 37187, 4544, 46431}, 24 - (Process.myTid() >> 22), objArr7);
                        Class<?> cls4 = Class.forName((String) objArr7[0]);
                        Object[] objArr8 = new Object[1];
                        f((ViewConfiguration.getFadingEdgeLength() >> 16) - 625987617, (-974717833) - ((byte) KeyEvent.getModifierMetaStateMask()), (short) (ViewConfiguration.getWindowTouchSlop() >> 8), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 106, (byte) (93 - (ViewConfiguration.getEdgeSlop() >> 16)), objArr8);
                        if (cls3.equals(cls4.getMethod((String) objArr8[0], null).invoke(method, null))) {
                            int i12 = notify + 109;
                            INotificationSideChannel = i12 % 128;
                            int i13 = i12 % 2;
                            Object[] objArr9 = new Object[1];
                            e(new char[]{62514, 3149, 63812, 40945, 29051, 50797, 54805, 64082, 7134, 16810, 32742, 28834, 1870, 17861, 3999, 58831, 7135, 17783, 55262, 7105, 48740, 5831, 39030, 37187, 4544, 46431}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 24, objArr9);
                            Class<?> cls5 = Class.forName((String) objArr9[0]);
                            Object[] objArr10 = new Object[1];
                            e(new char[]{16111, 32615, 18855, 61325, 49633, 23923, 15761, 60461, 14497, 40629, 2553, 54744, 28589, 5317, 40163, 43938, 64203, 14177, 49149, 45703}, 17 - KeyEvent.normalizeMetaState(0), objArr10);
                            Object[] objArr11 = (Object[]) cls5.getMethod((String) objArr10[0], null).invoke(method, null);
                            if (objArr11.length == 2 && Long.TYPE.equals(objArr11[0])) {
                                Object[] objArr12 = new Object[1];
                                e(new char[]{62514, 3149, 63812, 40945, 29051, 50797, 54805, 64082, 7134, 16810, 32742, 28834, 1870, 17861, 3999, 58831, 7135, 17783, 55262, 7105, 48740, 5831, 39030, 37187, 4544, 46431}, TextUtils.indexOf("", "", 0, 0) + 24, objArr12);
                                if (Class.forName((String) objArr12[0]).equals(objArr11[1])) {
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
                                        int mirror = AndroidCharacter.getMirror('0') + 2775;
                                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 22;
                                        byte[] bArr2 = $$a;
                                        byte b3 = bArr2[7];
                                        Object[] objArr13 = new Object[1];
                                        c(b3, (byte) (-bArr2[5]), b3, objArr13);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRgb, mirror, iCombineMeasuredStates, 1814927978, false, (String) objArr13[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                        int iResolveSize2 = View.resolveSize(0, 0) + 2823;
                                        int iMyPid = (Process.myPid() >> 22) + 22;
                                        byte[] bArr3 = $$a;
                                        byte b4 = bArr3[7];
                                        Object[] objArr14 = new Object[1];
                                        c(b4, (byte) (-bArr3[5]), b4, objArr14);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(keyRepeatTimeout, iResolveSize2, iMyPid, 1814927978, false, (String) objArr14[0], null);
                                    }
                                    try {
                                        Object[] objArr15 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                            char trimmedLength = (char) TextUtils.getTrimmedLength("");
                                            int packedPositionGroup = 2823 - ExpandableListView.getPackedPositionGroup(0L);
                                            int gidForName = Process.getGidForName("") + 23;
                                            byte[] bArr4 = $$a;
                                            byte b5 = bArr4[10];
                                            Object[] objArr16 = new Object[1];
                                            c(b5, (byte) (b5 | 32), bArr4[5], objArr16);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(trimmedLength, packedPositionGroup, gidForName, -2137287382, false, (String) objArr16[0], new Class[]{Long.TYPE, Method.class});
                                        }
                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr15)).longValue();
                                        i5 = -2001519171;
                                        break;
                                    } catch (Throwable th) {
                                        Throwable cause = th.getCause();
                                        if (cause == null) {
                                            throw th;
                                        }
                                        throw cause;
                                    }
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                    i4++;
                    i5 = -2001519171;
                    j = 0;
                    i7 = 2;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
            int i14 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2823;
            int i15 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 22;
            byte[] bArr5 = $$a;
            byte b6 = bArr5[7];
            Object[] objArr17 = new Object[1];
            c(b6, (byte) (-bArr5[5]), b6, objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cKeyCodeFromString, i14, i15, 1814927978, false, (String) objArr17[0], null);
        }
        Object[] objArr18 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
            int iGreen = 2823 - Color.green(0);
            int scrollBarFadeDuration = 22 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            Object[] objArr19 = new Object[1];
            c((byte) ($$b & 31), (byte) 51, $$a[5], objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionChild, iGreen, scrollBarFadeDuration, 1025296417, false, (String) objArr19[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr18);
        Object[] objArr20 = {0, constructorArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-687574488);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char capsMode = (char) (37657 - TextUtils.getCapsMode("", 0, 0));
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 2721;
            int iMakeMeasureSpec = 19 - View.MeasureSpec.makeMeasureSpec(0, 0);
            byte[] bArr6 = $$a;
            byte b7 = (byte) (-bArr6[33]);
            Object[] objArr21 = new Object[1];
            c(b7, (byte) (b7 | 35), bArr6[5], objArr21);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(capsMode, iLastIndexOf, iMakeMeasureSpec, 865785343, false, (String) objArr21[0], new Class[]{Integer.TYPE, Constructor[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr20)).longValue();
        long j2 = 1089666819;
        long jMaxMemory = (int) Runtime.getRuntime().maxMemory();
        long j3 = (((long) 51) * j2) + (((long) (-49)) * jLongValue) + (((long) (-50)) * (j2 | jMaxMemory));
        long j4 = 50;
        long j5 = -1;
        long j6 = jLongValue ^ j5;
        long j7 = (((j2 ^ j5) | j6) | jMaxMemory) ^ j5;
        long j8 = jMaxMemory ^ j5;
        long j9 = j6 | j8;
        long j10 = j3 + ((j7 | ((j9 | j2) ^ j5)) * j4) + (j4 * ((j9 ^ j5) | ((j6 | j2) ^ j5) | ((j2 | j8) ^ j5))) + ((long) (-2113722441));
        int i16 = ~Process.myUid();
        int i17 = ((int) (j10 >> 32)) & ((((~(1356381351 | i16)) | (-1509752240)) * (-241)) + 636514584 + (((~(i16 | (-153370889))) | 8392706) * 241));
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i18 = i17 | (((int) j10) & ((-1502314927) + (((~(1471522293 | iFreeMemory)) | 1386218592) * (-756)) + (((~iFreeMemory) | 1471522293) * 756)));
        int i19 = i18 >>> 24;
        int i20 = i18 & ViewCompat.MEASURED_SIZE_MASK;
        if (i19 != 0) {
            int i21 = INotificationSideChannel + 33;
            notify = i21 % 128;
            i = 2;
            if (i21 % 2 != 0) {
                z = true;
            }
            if (!z) {
                i2 = INotificationSideChannel + 47;
                notify = i2 % 128;
                if (i2 % i == 0) {
                    i3 = 1;
                }
                if (z || i20 >= 1 || (constructor = constructorArr[i20]) == null) {
                    string = null;
                } else {
                    string = constructor.toString();
                    int i22 = INotificationSideChannel + 87;
                    notify = i22 % 128;
                    int i23 = i22 % 2;
                    int i24 = 2 % 2;
                }
                arrayList.add(string);
                if ((i19 + 6) * i3 != 0) {
                    new int[0][-1] = 1;
                    int i25 = 0 % 2;
                    Toast.makeText((Context) null, 1, 1).show();
                }
                this(new Builder());
            }
            int i26 = i % i;
            i3 = 0;
            if (z) {
                string = null;
            } else {
                string = constructor.toString();
                int i27 = INotificationSideChannel + 87;
                notify = i27 % 128;
                int i28 = i27 % 2;
                int i29 = 2 % 2;
            }
            arrayList.add(string);
            if ((i19 + 6) * i3 != 0) {
                new int[0][-1] = 1;
                int i210 = 0 % 2;
                Toast.makeText((Context) null, 1, 1).show();
            }
            this(new Builder());
        }
        i = 2;
        int i30 = 2 % 2;
        z = false;
        if (!z) {
            i2 = INotificationSideChannel + 47;
            notify = i2 % 128;
            if (i2 % i == 0) {
                i3 = 1;
            }
            if (z) {
                string = null;
            } else {
                string = constructor.toString();
                int i211 = INotificationSideChannel + 87;
                notify = i211 % 128;
                int i212 = i211 % 2;
                int i213 = 2 % 2;
            }
            arrayList.add(string);
            if ((i19 + 6) * i3 != 0) {
                new int[0][-1] = 1;
                int i214 = 0 % 2;
                Toast.makeText((Context) null, 1, 1).show();
            }
            this(new Builder());
        }
        int i215 = i % i;
        i3 = 0;
        if (z) {
            string = null;
        } else {
            string = constructor.toString();
            int i216 = INotificationSideChannel + 87;
            notify = i216 % 128;
            int i217 = i216 % 2;
            int i218 = 2 % 2;
        }
        arrayList.add(string);
        if ((i19 + 6) * i3 != 0) {
            new int[0][-1] = 1;
            int i219 = 0 % 2;
            Toast.makeText((Context) null, 1, 1).show();
        }
        this(new Builder());
    }

    private final void verifyClientState() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 117;
        notify = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            List<Interceptor> list = this.interceptors;
            Intrinsics.checkNotNull(list, "");
            list.contains(null);
            obj.hashCode();
            throw null;
        }
        List<Interceptor> list2 = this.interceptors;
        Intrinsics.checkNotNull(list2, "");
        if (list2.contains(null)) {
            StringBuilder sb = new StringBuilder("Null interceptor: ");
            sb.append(this.interceptors);
            throw new IllegalStateException(sb.toString().toString());
        }
        List<Interceptor> list3 = this.networkInterceptors;
        Intrinsics.checkNotNull(list3, "");
        if (list3.contains(null)) {
            StringBuilder sb2 = new StringBuilder("Null network interceptor: ");
            sb2.append(this.networkInterceptors);
            throw new IllegalStateException(sb2.toString().toString());
        }
        List<ConnectionSpec> list4 = this.connectionSpecs;
        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
            Iterator<T> it = list4.iterator();
            while (it.hasNext()) {
                int i3 = notify + 97;
                INotificationSideChannel = i3 % 128;
                int i4 = i3 % 2;
                if (!(!((ConnectionSpec) it.next()).getIsTls())) {
                    if (this.sslSocketFactoryOrNull == null) {
                        throw new IllegalStateException("sslSocketFactory == null".toString());
                    }
                    if (this.certificateChainCleaner == null) {
                        throw new IllegalStateException("certificateChainCleaner == null".toString());
                    }
                    if (this.x509TrustManager == null) {
                        throw new IllegalStateException("x509TrustManager == null".toString());
                    }
                    return;
                }
            }
        }
        if (this.sslSocketFactoryOrNull != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (this.certificateChainCleaner != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (this.x509TrustManager != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!Intrinsics.areEqual(this.certificatePinner, CertificatePinner.DEFAULT)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    @Override // okhttp3.Call.Factory
    public Call newCall(Request p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        RealCall realCall = new RealCall(this, p0, false);
        int i2 = INotificationSideChannel + 19;
        notify = i2 % 128;
        if (i2 % 2 != 0) {
            return realCall;
        }
        throw null;
    }

    @Override // okhttp3.WebSocket.Factory
    public WebSocket newWebSocket(Request p0, WebSocketListener p1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        RealWebSocket realWebSocket = new RealWebSocket(TaskRunner.INSTANCE, p0, p1, new Random(), this.pingIntervalMillis, null, this.minWebSocketMessageToCompress);
        realWebSocket.connect(this);
        RealWebSocket realWebSocket2 = realWebSocket;
        int i2 = INotificationSideChannel + 7;
        notify = i2 % 128;
        if (i2 % 2 != 0) {
            return realWebSocket2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Builder newBuilder() {
        int i = 2 % 2;
        Builder builder = new Builder(this);
        int i2 = INotificationSideChannel + 97;
        notify = i2 % 128;
        int i3 = i2 % 2;
        return builder;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "dispatcher", imports = {}))
    /* JADX INFO: renamed from: -deprecated_dispatcher, reason: not valid java name */
    public final Dispatcher m9608deprecated_dispatcher() {
        int i = 2 % 2;
        int i2 = notify + 77;
        int i3 = i2 % 128;
        INotificationSideChannel = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Dispatcher dispatcher = this.dispatcher;
        int i4 = i3 + 5;
        notify = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 4 / 0;
        }
        return dispatcher;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "connectionPool", imports = {}))
    /* JADX INFO: renamed from: -deprecated_connectionPool, reason: not valid java name */
    public final ConnectionPool m9605deprecated_connectionPool() {
        int i = 2 % 2;
        int i2 = notify + 11;
        int i3 = i2 % 128;
        INotificationSideChannel = i3;
        int i4 = i2 % 2;
        ConnectionPool connectionPool = this.connectionPool;
        int i5 = i3 + 119;
        notify = i5 % 128;
        if (i5 % 2 != 0) {
            return connectionPool;
        }
        throw null;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "interceptors", imports = {}))
    /* JADX INFO: renamed from: -deprecated_interceptors, reason: not valid java name */
    public final List<Interceptor> m9614deprecated_interceptors() {
        int i = 2 % 2;
        int i2 = notify;
        int i3 = i2 + 71;
        INotificationSideChannel = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        List<Interceptor> list = this.interceptors;
        int i4 = i2 + 91;
        INotificationSideChannel = i4 % 128;
        if (i4 % 2 == 0) {
            return list;
        }
        obj.hashCode();
        throw null;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "networkInterceptors", imports = {}))
    /* JADX INFO: renamed from: -deprecated_networkInterceptors, reason: not valid java name */
    public final List<Interceptor> m9615deprecated_networkInterceptors() {
        int i = 2 % 2;
        int i2 = notify + 41;
        int i3 = i2 % 128;
        INotificationSideChannel = i3;
        int i4 = i2 % 2;
        List<Interceptor> list = this.networkInterceptors;
        int i5 = i3 + 81;
        notify = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "eventListenerFactory", imports = {}))
    /* JADX INFO: renamed from: -deprecated_eventListenerFactory, reason: not valid java name */
    public final EventListener.Factory m9610deprecated_eventListenerFactory() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 29;
        notify = i2 % 128;
        if (i2 % 2 != 0) {
            return this.eventListenerFactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "retryOnConnectionFailure", imports = {}))
    /* JADX INFO: renamed from: -deprecated_retryOnConnectionFailure, reason: not valid java name */
    public final boolean m9622deprecated_retryOnConnectionFailure() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 17;
        int i3 = i2 % 128;
        notify = i3;
        int i4 = i2 % 2;
        boolean z = this.retryOnConnectionFailure;
        int i5 = i3 + 117;
        INotificationSideChannel = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "authenticator", imports = {}))
    /* JADX INFO: renamed from: -deprecated_authenticator, reason: not valid java name */
    public final Authenticator m9600deprecated_authenticator() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel;
        int i3 = i2 + 109;
        notify = i3 % 128;
        int i4 = i3 % 2;
        Authenticator authenticator = this.authenticator;
        int i5 = i2 + 41;
        notify = i5 % 128;
        if (i5 % 2 != 0) {
            return authenticator;
        }
        throw null;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "followRedirects", imports = {}))
    /* JADX INFO: renamed from: -deprecated_followRedirects, reason: not valid java name */
    public final boolean m9611deprecated_followRedirects() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel;
        int i3 = i2 + 77;
        notify = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.followRedirects;
        int i5 = i2 + 123;
        notify = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 21 / 0;
        }
        return z;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "followSslRedirects", imports = {}))
    /* JADX INFO: renamed from: -deprecated_followSslRedirects, reason: not valid java name */
    public final boolean m9612deprecated_followSslRedirects() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel;
        int i3 = i2 + 13;
        notify = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        boolean z = this.followSslRedirects;
        int i4 = i2 + 35;
        notify = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "cookieJar", imports = {}))
    /* JADX INFO: renamed from: -deprecated_cookieJar, reason: not valid java name */
    public final CookieJar m9607deprecated_cookieJar() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel;
        int i3 = i2 + 117;
        notify = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        CookieJar cookieJar = this.cookieJar;
        int i4 = i2 + 19;
        notify = i4 % 128;
        int i5 = i4 % 2;
        return cookieJar;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "cache", imports = {}))
    /* JADX INFO: renamed from: -deprecated_cache, reason: not valid java name */
    public final Cache m9601deprecated_cache() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel;
        int i3 = i2 + 107;
        notify = i3 % 128;
        int i4 = i3 % 2;
        Cache cache = this.cache;
        int i5 = i2 + 69;
        notify = i5 % 128;
        int i6 = i5 % 2;
        return cache;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "dns", imports = {}))
    /* JADX INFO: renamed from: -deprecated_dns, reason: not valid java name */
    public final Dns m9609deprecated_dns() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 19;
        int i3 = i2 % 128;
        notify = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        Dns dns = this.dns;
        int i4 = i3 + 109;
        INotificationSideChannel = i4 % 128;
        int i5 = i4 % 2;
        return dns;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "proxy", imports = {}))
    /* JADX INFO: renamed from: -deprecated_proxy, reason: not valid java name */
    public final Proxy m9618deprecated_proxy() {
        int i = 2 % 2;
        int i2 = notify + 35;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 == 0) {
            return this.proxy;
        }
        throw null;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "proxySelector", imports = {}))
    /* JADX INFO: renamed from: -deprecated_proxySelector, reason: not valid java name */
    public final ProxySelector m9620deprecated_proxySelector() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 85;
        int i3 = i2 % 128;
        notify = i3;
        int i4 = i2 % 2;
        ProxySelector proxySelector = this.proxySelector;
        int i5 = i3 + 89;
        INotificationSideChannel = i5 % 128;
        int i6 = i5 % 2;
        return proxySelector;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "proxyAuthenticator", imports = {}))
    /* JADX INFO: renamed from: -deprecated_proxyAuthenticator, reason: not valid java name */
    public final Authenticator m9619deprecated_proxyAuthenticator() {
        int i = 2 % 2;
        int i2 = notify + 115;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        Authenticator authenticator = this.proxyAuthenticator;
        if (i3 != 0) {
            int i4 = 44 / 0;
        }
        return authenticator;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "socketFactory", imports = {}))
    /* JADX INFO: renamed from: -deprecated_socketFactory, reason: not valid java name */
    public final SocketFactory m9623deprecated_socketFactory() {
        int i = 2 % 2;
        int i2 = notify;
        int i3 = i2 + 5;
        INotificationSideChannel = i3 % 128;
        int i4 = i3 % 2;
        SocketFactory socketFactory = this.socketFactory;
        int i5 = i2 + 115;
        INotificationSideChannel = i5 % 128;
        int i6 = i5 % 2;
        return socketFactory;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "sslSocketFactory", imports = {}))
    /* JADX INFO: renamed from: -deprecated_sslSocketFactory, reason: not valid java name */
    public final SSLSocketFactory m9624deprecated_sslSocketFactory() {
        int i = 2 % 2;
        int i2 = notify + 1;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        SSLSocketFactory sslSocketFactory = sslSocketFactory();
        int i4 = notify + 123;
        INotificationSideChannel = i4 % 128;
        int i5 = i4 % 2;
        return sslSocketFactory;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "connectionSpecs", imports = {}))
    /* JADX INFO: renamed from: -deprecated_connectionSpecs, reason: not valid java name */
    public final List<ConnectionSpec> m9606deprecated_connectionSpecs() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 95;
        notify = i2 % 128;
        if (i2 % 2 != 0) {
            return this.connectionSpecs;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "protocols", imports = {}))
    /* JADX INFO: renamed from: -deprecated_protocols, reason: not valid java name */
    public final List<Protocol> m9617deprecated_protocols() {
        int i = 2 % 2;
        int i2 = notify + 27;
        int i3 = i2 % 128;
        INotificationSideChannel = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<Protocol> list = this.protocols;
        int i4 = i3 + 29;
        notify = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "hostnameVerifier", imports = {}))
    /* JADX INFO: renamed from: -deprecated_hostnameVerifier, reason: not valid java name */
    public final HostnameVerifier m9613deprecated_hostnameVerifier() {
        int i = 2 % 2;
        int i2 = notify;
        int i3 = i2 + 63;
        INotificationSideChannel = i3 % 128;
        int i4 = i3 % 2;
        HostnameVerifier hostnameVerifier = this.hostnameVerifier;
        int i5 = i2 + 105;
        INotificationSideChannel = i5 % 128;
        int i6 = i5 % 2;
        return hostnameVerifier;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "certificatePinner", imports = {}))
    /* JADX INFO: renamed from: -deprecated_certificatePinner, reason: not valid java name */
    public final CertificatePinner m9603deprecated_certificatePinner() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 83;
        int i3 = i2 % 128;
        notify = i3;
        int i4 = i2 % 2;
        CertificatePinner certificatePinner = this.certificatePinner;
        int i5 = i3 + 111;
        INotificationSideChannel = i5 % 128;
        if (i5 % 2 == 0) {
            return certificatePinner;
        }
        throw null;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "callTimeoutMillis", imports = {}))
    /* JADX INFO: renamed from: -deprecated_callTimeoutMillis, reason: not valid java name */
    public final int m9602deprecated_callTimeoutMillis() {
        int i = 2 % 2;
        int i2 = notify + 57;
        int i3 = i2 % 128;
        INotificationSideChannel = i3;
        int i4 = i2 % 2;
        int i5 = this.callTimeoutMillis;
        int i6 = i3 + 71;
        notify = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "connectTimeoutMillis", imports = {}))
    /* JADX INFO: renamed from: -deprecated_connectTimeoutMillis, reason: not valid java name */
    public final int m9604deprecated_connectTimeoutMillis() {
        int i = 2 % 2;
        int i2 = notify + 23;
        int i3 = i2 % 128;
        INotificationSideChannel = i3;
        int i4 = i2 % 2;
        int i5 = this.connectTimeoutMillis;
        int i6 = i3 + 27;
        notify = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "readTimeoutMillis", imports = {}))
    /* JADX INFO: renamed from: -deprecated_readTimeoutMillis, reason: not valid java name */
    public final int m9621deprecated_readTimeoutMillis() {
        int i = 2 % 2;
        int i2 = notify + 91;
        int i3 = i2 % 128;
        INotificationSideChannel = i3;
        int i4 = i2 % 2;
        int i5 = this.readTimeoutMillis;
        int i6 = i3 + 107;
        notify = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 47 / 0;
        }
        return i5;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "writeTimeoutMillis", imports = {}))
    /* JADX INFO: renamed from: -deprecated_writeTimeoutMillis, reason: not valid java name */
    public final int m9625deprecated_writeTimeoutMillis() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 5;
        notify = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.writeTimeoutMillis;
        if (i3 == 0) {
            int i5 = 19 / 0;
        }
        return i4;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "pingIntervalMillis", imports = {}))
    /* JADX INFO: renamed from: -deprecated_pingIntervalMillis, reason: not valid java name */
    public final int m9616deprecated_pingIntervalMillis() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 85;
        notify = i2 % 128;
        if (i2 % 2 != 0) {
            return this.pingIntervalMillis;
        }
        throw null;
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\t"}, d2 = {"Lokhttp3/OkHttpClient$Companion;", "", "<init>", "()V", "", "Lokhttp3/ConnectionSpec;", "DEFAULT_CONNECTION_SPECS", "Ljava/util/List;", "getDEFAULT_CONNECTION_SPECS$okhttp", "()Ljava/util/List;", "Lokhttp3/Protocol;", "DEFAULT_PROTOCOLS", "getDEFAULT_PROTOCOLS$okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final List<Protocol> getDEFAULT_PROTOCOLS$okhttp() {
            return OkHttpClient.access$getDEFAULT_PROTOCOLS$cp();
        }

        public final List<ConnectionSpec> getDEFAULT_CONNECTION_SPECS$okhttp() {
            return OkHttpClient.access$getDEFAULT_CONNECTION_SPECS$cp();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        cancel = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        INSTANCE = new Companion(null);
        DEFAULT_PROTOCOLS = Util.immutableListOf(Protocol.HTTP_2, Protocol.HTTP_1_1);
        DEFAULT_CONNECTION_SPECS = Util.immutableListOf(ConnectionSpec.MODERN_TLS, ConnectionSpec.CLEARTEXT);
        int i = asInterface + 121;
        cancel = i % 128;
        int i2 = i % 2;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        TuitionPaymentFragmentbindingInflater1 = (char) 12307;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (char) 49684;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) 40722;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (char) 50649;
        b = -1444770596;
        f1285a = -1934795631;
        asBinder = -1229693175;
        d = new byte[]{78, -65, 64, -66, 70, -74, 97, 92, -7, 82, -67, -70, 69, 66, -80, 7, -124, -70, 78, -74, 125, -114, -88, 86, -76, 78, 76, -98, 93, 71, 70, -70, -76, -88, 101, -76, 69, -35, 36, -41, 49, -36, -40, -33, -34, 34, 13, -17, 36, 43, -47, 34, -33, 48, -32, 25, -23, 18, -50, -51, 47, 17, -27, 29, -42, 37, 3, -3, 31, -26, -26, -26, -26};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, int r7, int r8) {
        /*
            int r8 = 121 - r8
            byte[] r0 = okhttp3.OkHttpClient.$$c
            int r7 = r7 * 2
            int r1 = r7 + 1
            int r6 = r6 * 3
            int r6 = 3 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2b
        L15:
            r3 = r2
        L16:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2b:
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.OkHttpClient.$$g(short, int, int):java.lang.String");
    }
}
