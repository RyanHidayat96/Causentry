package okhttp3.internal.connection;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
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
import com.google.android.libraries.places.api.model.PlaceTypes;
import defpackage.RotationProvider1;
import defpackage.RotationProviderListener;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.SurfaceViewImplementation;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.CertificatePinner;
import okhttp3.Connection;
import okhttp3.ConnectionSpec;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2ExchangeCodec;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u008a\u00012\u00020\u00012\u00020\u0002:\u0002\u008a\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010JE\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u001b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J7\u0010$\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0017H\u0002¢\u0006\u0004\b$\u0010%J1\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010\u0004\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020&2\u0006\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020&H\u0002¢\u0006\u0004\b)\u0010*J/\u0010+\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020!2\u0006\u0010\u0006\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0017H\u0002¢\u0006\u0004\b+\u0010,J\u0011\u0010-\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\tH\u0000¢\u0006\u0004\b/\u0010\u000bJ'\u00102\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u0002002\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u000101H\u0000¢\u0006\u0004\b2\u00103J\u0015\u00104\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u000e¢\u0006\u0004\b4\u00105J\u001f\u00108\u001a\u0002072\u0006\u0010\u0004\u001a\u00020\u001b2\u0006\u0010\u0006\u001a\u000206H\u0001¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020;2\u0006\u0010\u0004\u001a\u00020:H\u0001¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\tH\u0000¢\u0006\u0004\b>\u0010\u000bJ\u000f\u0010?\u001a\u00020\tH\u0000¢\u0006\u0004\b?\u0010\u000bJ\u001f\u0010B\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020@2\u0006\u0010\u0006\u001a\u00020AH\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020DH\u0016¢\u0006\u0004\bE\u0010FJ\u000f\u0010H\u001a\u00020GH\u0017¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u0005H\u0017¢\u0006\u0004\bJ\u0010KJ\u001d\u0010L\u001a\u00020\u000e2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u000501H\u0002¢\u0006\u0004\bL\u0010MJ\u000f\u0010O\u001a\u00020NH\u0017¢\u0006\u0004\bO\u0010PJ\u0017\u0010Q\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0011H\u0002¢\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\fH\u0002¢\u0006\u0004\bS\u0010TJ\u000f\u0010V\u001a\u00020UH\u0017¢\u0006\u0004\bV\u0010WJ!\u0010Y\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020X2\b\u0010\u0006\u001a\u0004\u0018\u00010\u001cH\u0000¢\u0006\u0004\bY\u0010ZR\u0016\u0010[\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R&\u0010_\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020X0^0]8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u001a\u0010c\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u0018\u0010-\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010gR\u0018\u0010h\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\"\u0010k\u001a\u00020j8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\u0014\u0010s\u001a\u00020\u000e8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0016\u0010t\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\"\u0010v\u001a\u00020\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bv\u0010u\u001a\u0004\bw\u0010r\"\u0004\bx\u0010yR\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bH\u0010zR\u0018\u0010{\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u0016\u0010}\u001a\u00020\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b}\u0010\\R\u0014\u0010J\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bJ\u0010~R%\u0010\u007f\u001a\u00020\u00118\u0001@\u0001X\u0081\u000e¢\u0006\u0015\n\u0004\b\u007f\u0010\\\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0005\b\u0082\u0001\u0010RR\u001c\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0083\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0018\u0010O\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bO\u0010|R\u001c\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0086\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u0089\u0001\u001a\u00020\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010\\"}, d2 = {"Lokhttp3/internal/connection/RealConnection;", "Lokhttp3/internal/http2/Http2Connection$Listener;", "Lokhttp3/Connection;", "Lokhttp3/internal/connection/RealConnectionPool;", "p0", "Lokhttp3/Route;", "p1", "<init>", "(Lokhttp3/internal/connection/RealConnectionPool;Lokhttp3/Route;)V", "", "cancel", "()V", "Lokhttp3/HttpUrl;", "Lokhttp3/Handshake;", "", "certificateSupportHost", "(Lokhttp3/HttpUrl;Lokhttp3/Handshake;)Z", "", "p2", "p3", "p4", "Lokhttp3/Call;", "p5", "Lokhttp3/EventListener;", "p6", "connect", "(IIIIZLokhttp3/Call;Lokhttp3/EventListener;)V", "Lokhttp3/OkHttpClient;", "Ljava/io/IOException;", "connectFailed$okhttp", "(Lokhttp3/OkHttpClient;Lokhttp3/Route;Ljava/io/IOException;)V", "connectSocket", "(IILokhttp3/Call;Lokhttp3/EventListener;)V", "Lokhttp3/internal/connection/ConnectionSpecSelector;", "connectTls", "(Lokhttp3/internal/connection/ConnectionSpecSelector;)V", "connectTunnel", "(IIILokhttp3/Call;Lokhttp3/EventListener;)V", "Lokhttp3/Request;", "createTunnel", "(IILokhttp3/Request;Lokhttp3/HttpUrl;)Lokhttp3/Request;", "createTunnelRequest", "()Lokhttp3/Request;", "establishProtocol", "(Lokhttp3/internal/connection/ConnectionSpecSelector;ILokhttp3/Call;Lokhttp3/EventListener;)V", "handshake", "()Lokhttp3/Handshake;", "incrementSuccessCount$okhttp", "Lokhttp3/Address;", "", "isEligible$okhttp", "(Lokhttp3/Address;Ljava/util/List;)Z", "isHealthy", "(Z)Z", "Lokhttp3/internal/http/RealInterceptorChain;", "Lokhttp3/internal/http/ExchangeCodec;", "newCodec$okhttp", "(Lokhttp3/OkHttpClient;Lokhttp3/internal/http/RealInterceptorChain;)Lokhttp3/internal/http/ExchangeCodec;", "Lokhttp3/internal/connection/Exchange;", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "newWebSocketStreams$okhttp", "(Lokhttp3/internal/connection/Exchange;)Lokhttp3/internal/ws/RealWebSocket$Streams;", "noCoalescedConnections$okhttp", "noNewExchanges$okhttp", "Lokhttp3/internal/http2/Http2Connection;", "Lokhttp3/internal/http2/Settings;", "onSettings", "(Lokhttp3/internal/http2/Http2Connection;Lokhttp3/internal/http2/Settings;)V", "Lokhttp3/internal/http2/Http2Stream;", "onStream", "(Lokhttp3/internal/http2/Http2Stream;)V", "Lokhttp3/Protocol;", "protocol", "()Lokhttp3/Protocol;", PlaceTypes.ROUTE, "()Lokhttp3/Route;", "routeMatchesAny", "(Ljava/util/List;)Z", "Ljava/net/Socket;", "socket", "()Ljava/net/Socket;", "startHttp2", "(I)V", "supportsUrl", "(Lokhttp3/HttpUrl;)Z", "", "toString", "()Ljava/lang/String;", "Lokhttp3/internal/connection/RealCall;", "trackFailure$okhttp", "(Lokhttp3/internal/connection/RealCall;Ljava/io/IOException;)V", "allocationLimit", "I", "", "Ljava/lang/ref/Reference;", "calls", "Ljava/util/List;", "getCalls", "()Ljava/util/List;", "connectionPool", "Lokhttp3/internal/connection/RealConnectionPool;", "getConnectionPool", "()Lokhttp3/internal/connection/RealConnectionPool;", "Lokhttp3/Handshake;", "http2Connection", "Lokhttp3/internal/http2/Http2Connection;", "", "idleAtNs", "J", "getIdleAtNs$okhttp", "()J", "setIdleAtNs$okhttp", "(J)V", "isMultiplexed$okhttp", "()Z", "isMultiplexed", "noCoalescedConnections", "Z", "noNewExchanges", "getNoNewExchanges", "setNoNewExchanges", "(Z)V", "Lokhttp3/Protocol;", "rawSocket", "Ljava/net/Socket;", "refusedStreamCount", "Lokhttp3/Route;", "routeFailureCount", "getRouteFailureCount$okhttp", "()I", "setRouteFailureCount$okhttp", "LRotationProviderListener;", "sink", "LRotationProviderListener;", "LRotationProvider1;", "source", "LRotationProvider1;", "successCount", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RealConnection extends Http2Connection.Listener implements Connection {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final long IDLE_CONNECTION_HEALTHY_NS = 10000000000L;
    private static final int MAX_TUNNEL_ATTEMPTS = 21;
    private static final String NPE_THROW_WITH_NULL = "throw with null exception";
    private static char TuitionPaymentFragmentbindingInflater1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static char b;
    private static int g;
    private int allocationLimit;
    private final List<Reference<RealCall>> calls;
    private final RealConnectionPool connectionPool;
    private Handshake handshake;
    private Http2Connection http2Connection;
    private long idleAtNs;
    private boolean noCoalescedConnections;
    private boolean noNewExchanges;
    private Protocol protocol;
    private Socket rawSocket;
    private int refusedStreamCount;
    private final Route route;
    private int routeFailureCount;
    private RotationProviderListener sink;
    private Socket socket;
    private RotationProvider1 source;
    private int successCount;
    private static final byte[] $$c = {102, -96, -78, -55};
    private static final int $$f = 214;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {57, -56, 23, -36, -12, 2, 63, -51, -15, 0, -3, 13, -6, -13, 20, -13, 68, -59, -5, -6, 15, -13, 4, 13, -11, 62, -19, -5, -30, 51, -68, 34, 15, -7, 39, -18, -33, 12, -11, 11, -6, 1, 30, -17, -24, 12, 8, -9, -6, 46, -44, 17, -6, -6, 8, -9, -6, 1, 3, 11, 2, -6, 8, -11, 3, -5, 2, 3, -5, 9, 1, -18, 13, 4, -18, 42, -34, 11, -1, -7, 8, -1, -1, 5, -20, 9, -8, 66};
    private static final int $$h = 76;
    private static final byte[] $$d = {111, 40, 23, -13, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$e = 226;
    private static final byte[] $$a = {6, -86, -9, -124, -3, 5, 4, -6, 73, -73, 6, 5, -10, 2, 6, -3, 5, 4, -6};
    private static final int $$b = 55;
    private static int d = 0;
    private static int asInterface = 1;
    private static int asBinder = 0;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 11
            int r6 = r6 + 4
            int r8 = r8 * 7
            int r0 = 12 - r8
            int r7 = r7 * 4
            int r7 = r7 + 99
            byte[] r1 = okhttp3.internal.connection.RealConnection.$$a
            byte[] r0 = new byte[r0]
            int r8 = 11 - r8
            r2 = 0
            if (r1 != 0) goto L19
            r7 = r6
            r3 = r8
            r4 = r2
            goto L31
        L19:
            r3 = r2
        L1a:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L2c
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2c:
            r3 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L31:
            int r3 = -r3
            int r6 = r6 + 1
            int r7 = r7 + r3
            int r7 = r7 + 2
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.e(int, byte, int, java.lang.Object[]):void");
    }

    private static void f(byte b2, byte b3, byte b4, Object[] objArr) {
        int i = b4 * 52;
        int i2 = 103 - b3;
        byte[] bArr = $$d;
        int i3 = 55 - (b2 * 52);
        byte[] bArr2 = new byte[i + 1];
        int i4 = -1;
        if (bArr == null) {
            i2 = (i3 + (-i2)) - 11;
            i3 = i3;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i2;
            int i5 = i3 + 1;
            if (i4 == i) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i2 = (i2 + (-bArr[i5])) - 11;
                i3 = i5;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void h(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 20
            int r0 = r7 + 33
            int r8 = r8 + 4
            byte[] r1 = okhttp3.internal.connection.RealConnection.$$g
            int r6 = r6 * 15
            int r6 = 99 - r6
            byte[] r0 = new byte[r0]
            int r7 = r7 + 32
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2e
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            int r8 = r8 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2e:
            int r8 = -r8
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.h(short, short, short, java.lang.Object[]):void");
    }

    public static final /* synthetic */ Handshake access$getHandshake$p(RealConnection realConnection) {
        int i = 2 % 2;
        int i2 = asInterface + 35;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        Handshake handshake = realConnection.handshake;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 83;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 39 / 0;
        }
        return handshake;
    }

    public static final /* synthetic */ void access$setSocket$p(RealConnection realConnection, Socket socket) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 35;
        d = i3 % 128;
        int i4 = i3 % 2;
        realConnection.socket = socket;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 71;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final RealConnectionPool getConnectionPool() {
        int i = 2 % 2;
        int i2 = asInterface + 105;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        RealConnectionPool realConnectionPool = this.connectionPool;
        int i5 = i3 + 55;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return realConnectionPool;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public RealConnection(RealConnectionPool realConnectionPool, Route route) {
        Intrinsics.checkNotNullParameter(realConnectionPool, "");
        Intrinsics.checkNotNullParameter(route, "");
        this.connectionPool = realConnectionPool;
        this.route = route;
        this.allocationLimit = 1;
        this.calls = new ArrayList();
        this.idleAtNs = Long.MAX_VALUE;
    }

    public final boolean getNoNewExchanges() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 89;
        d = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.noNewExchanges;
        int i5 = i2 + 47;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final void setNoNewExchanges(boolean z) {
        int i = 2 % 2;
        int i2 = d + 43;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        this.noNewExchanges = z;
        if (i3 == 0) {
            throw null;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i4 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            int i5 = $10 + 109;
            $11 = i5 % 128;
            int i6 = 58224;
            char c = 1;
            if (i5 % 2 == 0) {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                int i7 = oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                cArr3[1] = cArr[0];
                i2 = 1;
            } else {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                i2 = 0;
            }
            while (i2 < 16) {
                int i8 = $10 + 81;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                char c2 = cArr3[c];
                char c3 = cArr3[i4];
                int i10 = (c3 + i6) ^ ((c3 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 8611973335120459638L)));
                int i11 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(b);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[c] = Integer.valueOf(i10);
                    objArr2[i4] = Integer.valueOf(c2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char size = (char) (47773 - View.MeasureSpec.getSize(i4));
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 468;
                        int iIndexOf = TextUtils.indexOf("", "", i4, i4) + 13;
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(size, minimumFlingVelocity, iIndexOf, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[c] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 47772), 469 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 13 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i2++;
                    int i12 = $10 + 109;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
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
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 2323 - TextUtils.getCapsMode("", 0, 0), 44 - TextUtils.getOffsetAfter("", 0), -1312321721, false, $$i(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    public final int getRouteFailureCount$okhttp() {
        int i = 2 % 2;
        int i2 = d + 3;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return this.routeFailureCount;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setRouteFailureCount$okhttp(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 17;
        d = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        this.routeFailureCount = i;
        if (i5 != 0) {
            throw null;
        }
        int i6 = i3 + 49;
        d = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final List<Reference<RealCall>> getCalls() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 87;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<Reference<RealCall>> list = this.calls;
        int i4 = i2 + 11;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final long getIdleAtNs$okhttp() {
        int i = 2 % 2;
        int i2 = d + 33;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return this.idleAtNs;
        }
        throw null;
    }

    public final void setIdleAtNs$okhttp(long j) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 105;
        d = i3 % 128;
        int i4 = i3 % 2;
        this.idleAtNs = j;
        int i5 = i2 + 37;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 72 / 0;
        }
    }

    public final boolean isMultiplexed$okhttp() {
        int i = 2 % 2;
        if (this.http2Connection == null) {
            return false;
        }
        int i2 = asInterface;
        int i3 = i2 + 19;
        d = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 85;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void noNewExchanges$okhttp() {
        synchronized (this) {
            this.noNewExchanges = true;
        }
    }

    public final void noCoalescedConnections$okhttp() {
        synchronized (this) {
            this.noCoalescedConnections = true;
        }
    }

    private static void c(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i4 = -1870535734;
        int i5 = 1;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Color.red(0), (ViewConfiguration.getLongPressTimeout() >> 16) + 3291, 31 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1948206109, false, $$i(b2, b2, (byte) $$c.length), new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i7++;
                    i4 = -1870535734;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        char c = '0';
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i8 = 0;
            while (i8 < length3) {
                int i9 = $11 + 23;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                try {
                    Object[] objArr3 = new Object[i5];
                    objArr3[i6] = Integer.valueOf(iArr5[i8]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) i6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Color.argb(i6, i6, i6, i6), 3290 - TextUtils.indexOf("", c), 32 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1948206109, false, $$i(b3, b3, (byte) $$c.length), new Class[]{Integer.TYPE});
                    }
                    iArr6[i8] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    i8++;
                    iArr5 = iArr5;
                    i5 = 1;
                    i6 = 0;
                    c = '0';
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            i2 = i6;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            cArr[i2] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i11 = 17;
            for (int i12 = 1; i11 > i12; i12 = 1) {
                int i13 = $10 + 41;
                $11 = i13 % 128;
                if (i13 % 2 == 0) {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i11];
                    Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), (Process.myTid() >> 22) + 2559, Color.rgb(0, 0, 0) + 16777245, 683220507, false, $$i(b4, b5, b5), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                    i11 += 55;
                } else {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i11];
                    Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 2558 - TextUtils.lastIndexOf("", '0'), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 29, 683220507, false, $$i(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue2;
                    i11--;
                }
                int i14 = $11 + 119;
                $10 = i14 % 128;
                int i15 = i14 % 2;
            }
            int i16 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i17 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr6 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (Process.getGidForName("") + 28880), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 347, Color.red(0) + 25, -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
            i2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public final void incrementSuccessCount$okhttp() {
        synchronized (this) {
            this.successCount++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0119  */
    /* JADX WARN: Code duplicated, block: B:47:0x0124  */
    /* JADX WARN: Code duplicated, block: B:48:0x012c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0133  */
    /* JADX WARN: Code duplicated, block: B:54:0x0160  */
    /* JADX WARN: Code duplicated, block: B:55:0x0166  */
    /* JADX WARN: Code duplicated, block: B:57:0x016b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0176  */
    /* JADX WARN: Code duplicated, block: B:77:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x017f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:? A[LOOP:0: B:69:0x00a0->B:80:?, LOOP_END, SYNTHETIC] */
    public final void connect(int p0, int p1, int p2, int p3, boolean p4, Call p5, EventListener p6) throws Throwable {
        Socket socket;
        Socket socket2;
        int i;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(p5, "");
        Intrinsics.checkNotNullParameter(p6, "");
        if (this.protocol != null) {
            throw new IllegalStateException("already connected".toString());
        }
        List<ConnectionSpec> listConnectionSpecs = this.route.address().connectionSpecs();
        ConnectionSpecSelector connectionSpecSelector = new ConnectionSpecSelector(listConnectionSpecs);
        if (this.route.address().sslSocketFactory() == null) {
            int i4 = d + 67;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            if (!listConnectionSpecs.contains(ConnectionSpec.CLEARTEXT)) {
                throw new RouteException(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String strHost = this.route.address().url().host();
            if (!Platform.INSTANCE.get().isCleartextTrafficPermitted(strHost)) {
                StringBuilder sb = new StringBuilder("CLEARTEXT communication to ");
                sb.append(strHost);
                sb.append(" not permitted by network security policy");
                throw new RouteException(new UnknownServiceException(sb.toString()));
            }
        } else if (this.route.address().protocols().contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            throw new RouteException(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        Object obj = null;
        RouteException routeException = null;
        while (true) {
            try {
                if (this.route.requiresTunnel()) {
                    connectTunnel(p0, p1, p2, p5, p6);
                    if (this.rawSocket == null) {
                        break;
                    }
                } else {
                    try {
                        connectSocket(p0, p1, p5, p6);
                    } catch (IOException e2) {
                        e = e2;
                        socket = this.socket;
                        if (socket != null) {
                            i2 = d + 27;
                            asInterface = i2 % 128;
                            if (i2 % 2 == 0) {
                                Util.closeQuietly(socket);
                                int i6 = 79 / 0;
                            } else {
                                Util.closeQuietly(socket);
                            }
                        }
                        socket2 = this.rawSocket;
                        if (socket2 != null) {
                            Util.closeQuietly(socket2);
                        }
                        this.socket = null;
                        this.rawSocket = null;
                        this.source = null;
                        this.sink = null;
                        this.handshake = null;
                        this.protocol = null;
                        this.http2Connection = null;
                        this.allocationLimit = 1;
                        p6.connectFailed(p5, this.route.socketAddress(), this.route.proxy(), null, e);
                        if (routeException == null) {
                            routeException = new RouteException(e);
                        } else {
                            routeException.addConnectException(e);
                        }
                        if (p4) {
                            throw routeException;
                        }
                        i = d + 59;
                        asInterface = i % 128;
                        if (i % 2 != 0) {
                            connectionSpecSelector.connectionFailed(e);
                            obj.hashCode();
                            throw null;
                        }
                        if (!(!connectionSpecSelector.connectionFailed(e))) {
                            throw routeException;
                        }
                    }
                }
                try {
                    establishProtocol(connectionSpecSelector, p3, p5, p6);
                    p6.connectEnd(p5, this.route.socketAddress(), this.route.proxy(), this.protocol);
                    break;
                } catch (IOException e3) {
                    e = e3;
                    socket = this.socket;
                    if (socket != null) {
                        i2 = d + 27;
                        asInterface = i2 % 128;
                        if (i2 % 2 == 0) {
                            Util.closeQuietly(socket);
                            int i7 = 79 / 0;
                        } else {
                            Util.closeQuietly(socket);
                        }
                    }
                    socket2 = this.rawSocket;
                    if (socket2 != null) {
                        Util.closeQuietly(socket2);
                    }
                    this.socket = null;
                    this.rawSocket = null;
                    this.source = null;
                    this.sink = null;
                    this.handshake = null;
                    this.protocol = null;
                    this.http2Connection = null;
                    this.allocationLimit = 1;
                    p6.connectFailed(p5, this.route.socketAddress(), this.route.proxy(), null, e);
                    if (routeException == null) {
                        routeException = new RouteException(e);
                    } else {
                        routeException.addConnectException(e);
                    }
                    if (p4) {
                        throw routeException;
                    }
                    i = d + 59;
                    asInterface = i % 128;
                    if (i % 2 != 0) {
                        connectionSpecSelector.connectionFailed(e);
                        obj.hashCode();
                        throw null;
                    }
                    if (!(!connectionSpecSelector.connectionFailed(e))) {
                        throw routeException;
                    }
                }
            } catch (IOException e4) {
                e = e4;
            }
        }
        if (this.route.requiresTunnel()) {
            int i8 = d + 59;
            asInterface = i8 % 128;
            int i9 = i8 % 2;
            if (this.rawSocket == null) {
                throw new RouteException(new ProtocolException("Too many tunnel connections attempted: 21"));
            }
        }
        this.idleAtNs = System.nanoTime();
    }

    private final void connectTunnel(int p0, int p1, int p2, Call p3, EventListener p4) throws IOException {
        int i = 2 % 2;
        Request requestCreateTunnelRequest = createTunnelRequest();
        HttpUrl httpUrlUrl = requestCreateTunnelRequest.url();
        for (int i2 = 0; i2 < 21; i2++) {
            int i3 = asInterface + 107;
            d = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                connectSocket(p0, p1, p3, p4);
                createTunnel(p1, p2, requestCreateTunnelRequest, httpUrlUrl);
                throw null;
            }
            connectSocket(p0, p1, p3, p4);
            requestCreateTunnelRequest = createTunnel(p1, p2, requestCreateTunnelRequest, httpUrlUrl);
            if (requestCreateTunnelRequest == null) {
                return;
            }
            int i4 = d;
            int i5 = i4 + 21;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            Socket socket = this.rawSocket;
            if (socket != null) {
                int i7 = i4 + 83;
                asInterface = i7 % 128;
                if (i7 % 2 == 0) {
                    Util.closeQuietly(socket);
                    obj.hashCode();
                    throw null;
                }
                Util.closeQuietly(socket);
                int i8 = d + 43;
                asInterface = i8 % 128;
                int i9 = i8 % 2;
            }
            this.rawSocket = null;
            this.sink = null;
            this.source = null;
            p4.connectEnd(p3, this.route.socketAddress(), this.route.proxy(), null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0045  */
    private final void connectSocket(int p0, int p1, Call p2, EventListener p3) throws IOException {
        int i;
        Socket socketCreateSocket;
        int i2 = 2 % 2;
        Proxy proxy = this.route.proxy();
        Address address = this.route.address();
        Proxy.Type type = proxy.type();
        if (type == null) {
            int i3 = asInterface + 53;
            d = i3 % 128;
            int i4 = i3 % 2;
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
            int i5 = asInterface + 45;
            d = i5 % 128;
            int i6 = i5 % 2;
        }
        if (i != 1) {
            int i7 = asInterface + 81;
            d = i7 % 128;
            int i8 = i7 % 2;
            if (i != 2) {
                socketCreateSocket = new Socket(proxy);
            } else {
                socketCreateSocket = address.socketFactory().createSocket();
                Intrinsics.checkNotNull(socketCreateSocket);
            }
        } else {
            socketCreateSocket = address.socketFactory().createSocket();
            Intrinsics.checkNotNull(socketCreateSocket);
        }
        this.rawSocket = socketCreateSocket;
        p3.connectStart(p2, this.route.socketAddress(), proxy);
        socketCreateSocket.setSoTimeout(p1);
        try {
            Platform.INSTANCE.get().connectSocket(socketCreateSocket, this.route.socketAddress(), p0);
            try {
                this.source = SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault1(socketCreateSocket));
                this.sink = SurfaceViewImplementation.TuitionPaymentFragmentbindingInflater1(SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(socketCreateSocket));
            } catch (NullPointerException e2) {
                if (Intrinsics.areEqual(e2.getMessage(), NPE_THROW_WITH_NULL)) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            StringBuilder sb = new StringBuilder("Failed to connect to ");
            sb.append(this.route.socketAddress());
            ConnectException connectException = new ConnectException(sb.toString());
            connectException.initCause(e3);
            throw connectException;
        }
    }

    private final void establishProtocol(ConnectionSpecSelector p0, int p1, Call p2, EventListener p3) throws Throwable {
        int i = 2 % 2;
        if (this.route.address().sslSocketFactory() != null) {
            p3.secureConnectStart(p2);
            connectTls(p0);
            p3.secureConnectEnd(p2, this.handshake);
            if (this.protocol == Protocol.HTTP_2) {
                int i2 = asInterface + 123;
                d = i2 % 128;
                int i3 = i2 % 2;
                startHttp2(p1);
                int i4 = asInterface + 87;
                d = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 5 % 2;
                    return;
                }
                return;
            }
            return;
        }
        int i6 = d + 31;
        asInterface = i6 % 128;
        if (i6 % 2 == 0) {
            this.route.address().protocols().contains(Protocol.H2_PRIOR_KNOWLEDGE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.route.address().protocols().contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            this.socket = this.rawSocket;
            this.protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            startHttp2(p1);
        } else {
            this.socket = this.rawSocket;
            this.protocol = Protocol.HTTP_1_1;
            int i7 = asInterface + 19;
            d = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    private final void startHttp2(int p0) throws IOException {
        int i = 2 % 2;
        Socket socket = this.socket;
        Intrinsics.checkNotNull(socket);
        RotationProvider1 rotationProvider1 = this.source;
        Intrinsics.checkNotNull(rotationProvider1);
        RotationProviderListener rotationProviderListener = this.sink;
        Intrinsics.checkNotNull(rotationProviderListener);
        socket.setSoTimeout(0);
        Http2Connection http2ConnectionBuild = new Http2Connection.Builder(true, TaskRunner.INSTANCE).socket(socket, this.route.address().url().host(), rotationProvider1, rotationProviderListener).listener(this).pingIntervalMillis(p0).build();
        this.http2Connection = http2ConnectionBuild;
        this.allocationLimit = Http2Connection.INSTANCE.getDEFAULT_SETTINGS().getMaxConcurrentStreams();
        Http2Connection.start$default(http2ConnectionBuild, false, null, 3, null);
        int i2 = asInterface + 55;
        d = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:179:0x08e3  */
    /* JADX WARN: Code duplicated, block: B:181:0x08f8  */
    /* JADX WARN: Code duplicated, block: B:41:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:44:0x02e2 A[Catch: all -> 0x08db, TryCatch #5 {all -> 0x08db, blocks: (B:5:0x0033, B:7:0x00ac, B:8:0x00e3, B:12:0x00f7, B:15:0x013b, B:20:0x01e6, B:23:0x0226, B:27:0x026b, B:29:0x026f, B:34:0x0288, B:42:0x02dc, B:44:0x02e2, B:45:0x0321, B:47:0x0330, B:48:0x036e, B:56:0x03de, B:58:0x03e4, B:59:0x03e5, B:60:0x03e6, B:62:0x03ef, B:63:0x0431, B:65:0x0440, B:66:0x0481, B:74:0x04ff, B:76:0x0505, B:77:0x0506, B:37:0x02aa, B:78:0x0507, B:80:0x0510, B:82:0x0516, B:83:0x0517, B:13:0x0119, B:84:0x0518, B:86:0x0521, B:87:0x0561, B:98:0x0637, B:143:0x083e, B:147:0x0864, B:150:0x087f, B:152:0x08a0, B:154:0x08a9, B:153:0x08a7, B:148:0x0873, B:160:0x08bd, B:161:0x08c2, B:165:0x08ca, B:167:0x08d0, B:168:0x08d1, B:170:0x08d3, B:172:0x08d9, B:173:0x08da, B:88:0x0568, B:90:0x0575, B:91:0x05b5, B:93:0x05bc, B:95:0x05d3, B:96:0x0626, B:50:0x0376, B:52:0x038c, B:53:0x03cf, B:68:0x0489, B:70:0x049f, B:71:0x04e7, B:17:0x013f, B:22:0x01ea, B:26:0x022e), top: B:192:0x0033, inners: #0, #3, #6, #7, #9 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0330 A[Catch: all -> 0x08db, TryCatch #5 {all -> 0x08db, blocks: (B:5:0x0033, B:7:0x00ac, B:8:0x00e3, B:12:0x00f7, B:15:0x013b, B:20:0x01e6, B:23:0x0226, B:27:0x026b, B:29:0x026f, B:34:0x0288, B:42:0x02dc, B:44:0x02e2, B:45:0x0321, B:47:0x0330, B:48:0x036e, B:56:0x03de, B:58:0x03e4, B:59:0x03e5, B:60:0x03e6, B:62:0x03ef, B:63:0x0431, B:65:0x0440, B:66:0x0481, B:74:0x04ff, B:76:0x0505, B:77:0x0506, B:37:0x02aa, B:78:0x0507, B:80:0x0510, B:82:0x0516, B:83:0x0517, B:13:0x0119, B:84:0x0518, B:86:0x0521, B:87:0x0561, B:98:0x0637, B:143:0x083e, B:147:0x0864, B:150:0x087f, B:152:0x08a0, B:154:0x08a9, B:153:0x08a7, B:148:0x0873, B:160:0x08bd, B:161:0x08c2, B:165:0x08ca, B:167:0x08d0, B:168:0x08d1, B:170:0x08d3, B:172:0x08d9, B:173:0x08da, B:88:0x0568, B:90:0x0575, B:91:0x05b5, B:93:0x05bc, B:95:0x05d3, B:96:0x0626, B:50:0x0376, B:52:0x038c, B:53:0x03cf, B:68:0x0489, B:70:0x049f, B:71:0x04e7, B:17:0x013f, B:22:0x01ea, B:26:0x022e), top: B:192:0x0033, inners: #0, #3, #6, #7, #9 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x038c A[Catch: all -> 0x03dd, TryCatch #6 {all -> 0x03dd, blocks: (B:50:0x0376, B:52:0x038c, B:53:0x03cf), top: B:193:0x0376, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x03e6 A[Catch: all -> 0x08db, TryCatch #5 {all -> 0x08db, blocks: (B:5:0x0033, B:7:0x00ac, B:8:0x00e3, B:12:0x00f7, B:15:0x013b, B:20:0x01e6, B:23:0x0226, B:27:0x026b, B:29:0x026f, B:34:0x0288, B:42:0x02dc, B:44:0x02e2, B:45:0x0321, B:47:0x0330, B:48:0x036e, B:56:0x03de, B:58:0x03e4, B:59:0x03e5, B:60:0x03e6, B:62:0x03ef, B:63:0x0431, B:65:0x0440, B:66:0x0481, B:74:0x04ff, B:76:0x0505, B:77:0x0506, B:37:0x02aa, B:78:0x0507, B:80:0x0510, B:82:0x0516, B:83:0x0517, B:13:0x0119, B:84:0x0518, B:86:0x0521, B:87:0x0561, B:98:0x0637, B:143:0x083e, B:147:0x0864, B:150:0x087f, B:152:0x08a0, B:154:0x08a9, B:153:0x08a7, B:148:0x0873, B:160:0x08bd, B:161:0x08c2, B:165:0x08ca, B:167:0x08d0, B:168:0x08d1, B:170:0x08d3, B:172:0x08d9, B:173:0x08da, B:88:0x0568, B:90:0x0575, B:91:0x05b5, B:93:0x05bc, B:95:0x05d3, B:96:0x0626, B:50:0x0376, B:52:0x038c, B:53:0x03cf, B:68:0x0489, B:70:0x049f, B:71:0x04e7, B:17:0x013f, B:22:0x01ea, B:26:0x022e), top: B:192:0x0033, inners: #0, #3, #6, #7, #9 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x03ef A[Catch: all -> 0x08db, TryCatch #5 {all -> 0x08db, blocks: (B:5:0x0033, B:7:0x00ac, B:8:0x00e3, B:12:0x00f7, B:15:0x013b, B:20:0x01e6, B:23:0x0226, B:27:0x026b, B:29:0x026f, B:34:0x0288, B:42:0x02dc, B:44:0x02e2, B:45:0x0321, B:47:0x0330, B:48:0x036e, B:56:0x03de, B:58:0x03e4, B:59:0x03e5, B:60:0x03e6, B:62:0x03ef, B:63:0x0431, B:65:0x0440, B:66:0x0481, B:74:0x04ff, B:76:0x0505, B:77:0x0506, B:37:0x02aa, B:78:0x0507, B:80:0x0510, B:82:0x0516, B:83:0x0517, B:13:0x0119, B:84:0x0518, B:86:0x0521, B:87:0x0561, B:98:0x0637, B:143:0x083e, B:147:0x0864, B:150:0x087f, B:152:0x08a0, B:154:0x08a9, B:153:0x08a7, B:148:0x0873, B:160:0x08bd, B:161:0x08c2, B:165:0x08ca, B:167:0x08d0, B:168:0x08d1, B:170:0x08d3, B:172:0x08d9, B:173:0x08da, B:88:0x0568, B:90:0x0575, B:91:0x05b5, B:93:0x05bc, B:95:0x05d3, B:96:0x0626, B:50:0x0376, B:52:0x038c, B:53:0x03cf, B:68:0x0489, B:70:0x049f, B:71:0x04e7, B:17:0x013f, B:22:0x01ea, B:26:0x022e), top: B:192:0x0033, inners: #0, #3, #6, #7, #9 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0440 A[Catch: all -> 0x08db, TryCatch #5 {all -> 0x08db, blocks: (B:5:0x0033, B:7:0x00ac, B:8:0x00e3, B:12:0x00f7, B:15:0x013b, B:20:0x01e6, B:23:0x0226, B:27:0x026b, B:29:0x026f, B:34:0x0288, B:42:0x02dc, B:44:0x02e2, B:45:0x0321, B:47:0x0330, B:48:0x036e, B:56:0x03de, B:58:0x03e4, B:59:0x03e5, B:60:0x03e6, B:62:0x03ef, B:63:0x0431, B:65:0x0440, B:66:0x0481, B:74:0x04ff, B:76:0x0505, B:77:0x0506, B:37:0x02aa, B:78:0x0507, B:80:0x0510, B:82:0x0516, B:83:0x0517, B:13:0x0119, B:84:0x0518, B:86:0x0521, B:87:0x0561, B:98:0x0637, B:143:0x083e, B:147:0x0864, B:150:0x087f, B:152:0x08a0, B:154:0x08a9, B:153:0x08a7, B:148:0x0873, B:160:0x08bd, B:161:0x08c2, B:165:0x08ca, B:167:0x08d0, B:168:0x08d1, B:170:0x08d3, B:172:0x08d9, B:173:0x08da, B:88:0x0568, B:90:0x0575, B:91:0x05b5, B:93:0x05bc, B:95:0x05d3, B:96:0x0626, B:50:0x0376, B:52:0x038c, B:53:0x03cf, B:68:0x0489, B:70:0x049f, B:71:0x04e7, B:17:0x013f, B:22:0x01ea, B:26:0x022e), top: B:192:0x0033, inners: #0, #3, #6, #7, #9 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x049f A[Catch: all -> 0x04fe, TryCatch #7 {all -> 0x04fe, blocks: (B:68:0x0489, B:70:0x049f, B:71:0x04e7), top: B:195:0x0489, outer: #5 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v47, types: [okhttp3.internal.platform.Platform] */
    /* JADX WARN: Type inference failed for: r0v54, types: [okhttp3.internal.platform.Platform] */
    /* JADX WARN: Type inference failed for: r0v56, types: [okhttp3.internal.platform.Platform] */
    /* JADX WARN: Type inference failed for: r0v75, types: [okhttp3.internal.platform.Platform] */
    /* JADX WARN: Type inference failed for: r0v77, types: [okhttp3.internal.platform.Platform] */
    /* JADX WARN: Type inference failed for: r1v13, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6, types: [okhttp3.internal.platform.Platform] */
    /* JADX WARN: Type inference failed for: r32v0, types: [okhttp3.internal.connection.ConnectionSpecSelector] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v17, types: [int] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2, types: [javax.net.ssl.SSLSocket] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21, types: [javax.net.ssl.SSLSocket] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23, types: [javax.net.ssl.SSLSocket] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [javax.net.ssl.SSLSocket] */
    /* JADX WARN: Type inference failed for: r5v4 */
    private final void connectTls(ConnectionSpecSelector p0) throws Throwable {
        ?? r5;
        ?? r4;
        String selectedProtocol;
        Method method;
        Method[] declaredMethods;
        int length;
        int i;
        int i2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8;
        int i3 = 2 % 2;
        final Address address = this.route.address();
        SSLSocketFactory sslSocketFactory = address.sslSocketFactory();
        try {
            Intrinsics.checkNotNull(sslSocketFactory);
            Socket socketCreateSocket = sslSocketFactory.createSocket(this.rawSocket, address.url().host(), address.url().port(), true);
            Intrinsics.checkNotNull(socketCreateSocket, "");
            ?? r6 = (SSLSocket) socketCreateSocket;
            try {
                ConnectionSpec connectionSpecConfigureSecureSocket = p0.configureSecureSocket(r6);
                ArrayList arrayList = new ArrayList();
                int i4 = 0;
                Object[] objArr = new Object[1];
                a(new char[]{49194, 1292, 21692, 4381, 29859, 27912, 43808, 13367, 683, 6384, 44730, 61281, 64637, 23315, 34615, 13865, 9395, 11561}, TextUtils.getOffsetBefore("", 0) + 16, objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                Object[] objArr2 = new Object[1];
                c(new int[]{1686252168, -1054974866, 1703686468, 236560029, 1343211857, 1775641341, 2001301791, -1572471137, -1604915405, 1402472622}, 16 - TextUtils.indexOf("", ""), objArr2);
                byte b2 = (byte) 0;
                byte b3 = b2;
                Object[] objArr3 = new Object[1];
                e(b2, b3, b3, objArr3);
                Method[] methodArr = {CertificatePinner.class.getMethod((String) objArr3[0], String.class, Function0.class)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                    char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                    int iAxisFromString = 2822 - MotionEvent.axisFromString("");
                    int offsetAfter = TextUtils.getOffsetAfter("", 0) + 22;
                    byte[] bArr = $$d;
                    byte b4 = bArr[5];
                    Object[] objArr4 = new Object[1];
                    f(b4, bArr[10], b4, objArr4);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(maxKeyCode, iAxisFromString, offsetAfter, 1814927978, false, (String) objArr4[0], null);
                }
                if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).get(null) == null) {
                    int i5 = d + 15;
                    asInterface = i5 % 128;
                    if (i5 % 2 == 0) {
                        declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 2823 - Color.argb(0, 0, 0, 0), (ViewConfiguration.getEdgeSlop() >> 16) + 22)).getDeclaredMethods();
                        length = declaredMethods.length;
                        i = 1;
                    } else {
                        declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.lastIndexOf("", '0', 0) + 1), 2823 - View.combineMeasuredStates(0, 0), 22 - KeyEvent.normalizeMetaState(0))).getDeclaredMethods();
                        length = declaredMethods.length;
                        i = 0;
                    }
                    while (true) {
                        if (i < length) {
                            Method method2 = declaredMethods[i];
                            try {
                                Object[] objArr5 = new Object[1];
                                a(new char[]{36900, 37483, 24174, 38442, 31081, 63319, 10884, 41696, 35368, 21604, 34087, 22604, 20679, 58398, 52088, 41885, 34942, 43939, 38537, 3055, 24913, 20554, 49614, 15156, 29716, 10954}, KeyEvent.getDeadChar(i4, i4) + 24, objArr5);
                                Class<?> cls2 = Class.forName((String) objArr5[i4]);
                                Object[] objArr6 = new Object[1];
                                c(new int[]{-442346835, -307995645, -1705559145, 1279868138, 2125667914, -1416872285, 577570677, -1076251404}, 11 - ExpandableListView.getPackedPositionChild(0L), objArr6);
                                Object[] objArr7 = {Integer.valueOf(((Integer) cls2.getMethod((String) objArr6[0], null).invoke(method2, null)).intValue())};
                                Object[] objArr8 = new Object[1];
                                a(new char[]{56157, 30031, 28689, 57163, 57451, 61932, 47643, 20579, 57303, 41811, 1907, 1265, 45799, 55782, 63436, '-', 14514, 20793, 22850, 24967, 38360, 1832, 46097, 64202, 52380, 48684, 45453, 4112}, 26 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr8);
                                Class<?> cls3 = Class.forName((String) objArr8[0]);
                                Method[] methodArr2 = declaredMethods;
                                Object[] objArr9 = new Object[1];
                                a(new char[]{57416, 54439, 32009, 50817, 9098, 12928, 20589, 42060, 5828, 2446}, 8 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr9);
                                if (((Boolean) cls3.getMethod((String) objArr9[0], Integer.TYPE).invoke(null, objArr7)).booleanValue()) {
                                    int i6 = asInterface + 43;
                                    d = i6 % 128;
                                    int i7 = i6 % 2;
                                    Class cls4 = Long.TYPE;
                                    Object[] objArr10 = new Object[1];
                                    a(new char[]{36900, 37483, 24174, 38442, 31081, 63319, 10884, 41696, 35368, 21604, 34087, 22604, 20679, 58398, 52088, 41885, 34942, 43939, 38537, 3055, 24913, 20554, 49614, 15156, 29716, 10954}, (Process.myTid() >> 22) + 24, objArr10);
                                    Class<?> cls5 = Class.forName((String) objArr10[0]);
                                    Object[] objArr11 = new Object[1];
                                    a(new char[]{50512, 56154, 39445, 49411, 29318, 26059, 6544, 61399, 39138, 63178, 3318, 32256, 9194, 36311, 54082, 34628}, 12 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr11);
                                    if (cls4.equals(cls5.getMethod((String) objArr11[0], null).invoke(method2, null))) {
                                        Object[] objArr12 = new Object[1];
                                        a(new char[]{36900, 37483, 24174, 38442, 31081, 63319, 10884, 41696, 35368, 21604, 34087, 22604, 20679, 58398, 52088, 41885, 34942, 43939, 38537, 3055, 24913, 20554, 49614, 15156, 29716, 10954}, Color.argb(0, 0, 0, 0) + 24, objArr12);
                                        Class<?> cls6 = Class.forName((String) objArr12[0]);
                                        Object[] objArr13 = new Object[1];
                                        c(new int[]{-1180438140, 801172273, -1690616533, 929020959, -1108287303, -40404152, -1649397908, 1680207106, 575129333, -870911938, 1065889194, 244683797}, ExpandableListView.getPackedPositionType(0L) + 17, objArr13);
                                        Object[] objArr14 = (Object[]) cls6.getMethod((String) objArr13[0], null).invoke(method2, null);
                                        if (objArr14.length == 2 && Long.TYPE.equals(objArr14[0])) {
                                            int i8 = asInterface + 39;
                                            d = i8 % 128;
                                            if (i8 % 2 != 0) {
                                                Object[] objArr15 = new Object[1];
                                                a(new char[]{36900, 37483, 24174, 38442, 31081, 63319, 10884, 41696, 35368, 21604, 34087, 22604, 20679, 58398, 52088, 41885, 34942, 43939, 38537, 3055, 24913, 20554, 49614, 15156, 29716, 10954}, 2 << Drawable.resolveOpacity(1, 1), objArr15);
                                                if (Class.forName((String) objArr15[0]).equals(objArr14[0])) {
                                                    i2 = asInterface + 65;
                                                    d = i2 % 128;
                                                    if (i2 % 2 != 0) {
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                            char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                            int i9 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2823;
                                                            int iRed = Color.red(0) + 22;
                                                            byte[] bArr2 = $$d;
                                                            byte b5 = bArr2[5];
                                                            Object[] objArr16 = new Object[1];
                                                            f(b5, bArr2[10], b5, objArr16);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(keyRepeatTimeout, i9, iRed, 1814927978, false, (String) objArr16[0], null);
                                                        }
                                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, method2);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                                            char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                                                            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 2824;
                                                            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 22;
                                                            byte[] bArr3 = $$d;
                                                            byte b6 = bArr3[5];
                                                            Object[] objArr17 = new Object[1];
                                                            f(b6, bArr3[10], b6, objArr17);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionChild, iLastIndexOf, offsetBefore, 1814927978, false, (String) objArr17[0], null);
                                                        }
                                                        try {
                                                            Object[] objArr18 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                                                char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                                                                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2823;
                                                                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0') + 23;
                                                                byte b7 = $$d[7];
                                                                byte b8 = b7;
                                                                Object[] objArr19 = new Object[1];
                                                                f(b7, b8, b8, objArr19);
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMakeMeasureSpec, maximumDrawingCacheSize, iLastIndexOf2, -2137287382, false, (String) objArr19[0], new Class[]{Long.TYPE, Method.class});
                                                            }
                                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr18)).longValue();
                                                        } catch (Throwable th) {
                                                            Throwable cause = th.getCause();
                                                            if (cause == null) {
                                                                throw th;
                                                            }
                                                            throw cause;
                                                        }
                                                    } else {
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                            char c = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
                                                            int doubleTapTimeout = 2823 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                            int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 23;
                                                            byte[] bArr4 = $$d;
                                                            byte b9 = bArr4[5];
                                                            Object[] objArr20 = new Object[1];
                                                            f(b9, bArr4[10], b9, objArr20);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, doubleTapTimeout, bitsPerPixel, 1814927978, false, (String) objArr20[0], null);
                                                        }
                                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method2);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                            char packedPositionChild2 = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                                                            int iAxisFromString2 = 2822 - MotionEvent.axisFromString("");
                                                            int i10 = 22 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                            byte[] bArr5 = $$d;
                                                            byte b10 = bArr5[5];
                                                            Object[] objArr21 = new Object[1];
                                                            f(b10, bArr5[10], b10, objArr21);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionChild2, iAxisFromString2, i10, 1814927978, false, (String) objArr21[0], null);
                                                        }
                                                        try {
                                                            Object[] objArr22 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                                char c2 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                                                                int pressedStateDuration = 2823 - (ViewConfiguration.getPressedStateDuration() >> 16);
                                                                int maxKeyCode2 = (KeyEvent.getMaxKeyCode() >> 16) + 22;
                                                                byte b11 = $$d[7];
                                                                byte b12 = b11;
                                                                Object[] objArr23 = new Object[1];
                                                                f(b11, b12, b12, objArr23);
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, pressedStateDuration, maxKeyCode2, -2137287382, false, (String) objArr23[0], new Class[]{Long.TYPE, Method.class});
                                                            }
                                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr22)).longValue();
                                                        } catch (Throwable th2) {
                                                            Throwable cause2 = th2.getCause();
                                                            if (cause2 == null) {
                                                                throw th2;
                                                            }
                                                            throw cause2;
                                                        }
                                                    }
                                                    int i11 = d + 19;
                                                    asInterface = i11 % 128;
                                                    int i12 = i11 % 2;
                                                }
                                            } else {
                                                Object[] objArr24 = new Object[1];
                                                a(new char[]{36900, 37483, 24174, 38442, 31081, 63319, 10884, 41696, 35368, 21604, 34087, 22604, 20679, 58398, 52088, 41885, 34942, 43939, 38537, 3055, 24913, 20554, 49614, 15156, 29716, 10954}, Drawable.resolveOpacity(0, 0) + 24, objArr24);
                                                if (Class.forName((String) objArr24[0]).equals(objArr14[1])) {
                                                    i2 = asInterface + 65;
                                                    d = i2 % 128;
                                                    if (i2 % 2 != 0) {
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                            char keyRepeatTimeout2 = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                            int i13 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2823;
                                                            int iRed2 = Color.red(0) + 22;
                                                            byte[] bArr6 = $$d;
                                                            byte b13 = bArr6[5];
                                                            Object[] objArr110 = new Object[1];
                                                            f(b13, bArr6[10], b13, objArr110);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(keyRepeatTimeout2, i13, iRed2, 1814927978, false, (String) objArr110[0], null);
                                                        }
                                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, method2);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                                            char packedPositionChild3 = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                                                            int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0) + 2824;
                                                            int offsetBefore2 = TextUtils.getOffsetBefore("", 0) + 22;
                                                            byte[] bArr7 = $$d;
                                                            byte b14 = bArr7[5];
                                                            Object[] objArr111 = new Object[1];
                                                            f(b14, bArr7[10], b14, objArr111);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionChild3, iLastIndexOf3, offsetBefore2, 1814927978, false, (String) objArr111[0], null);
                                                        }
                                                        Object[] objArr112 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                                            char cMakeMeasureSpec2 = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                                                            int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2823;
                                                            int iLastIndexOf4 = TextUtils.lastIndexOf("", '0') + 23;
                                                            byte b15 = $$d[7];
                                                            byte b16 = b15;
                                                            Object[] objArr113 = new Object[1];
                                                            f(b15, b16, b16, objArr113);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMakeMeasureSpec2, maximumDrawingCacheSize2, iLastIndexOf4, -2137287382, false, (String) objArr113[0], new Class[]{Long.TYPE, Method.class});
                                                        }
                                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr112)).longValue();
                                                    } else {
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                            char c3 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
                                                            int doubleTapTimeout2 = 2823 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                            int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0) + 23;
                                                            byte[] bArr8 = $$d;
                                                            byte b17 = bArr8[5];
                                                            Object[] objArr25 = new Object[1];
                                                            f(b17, bArr8[10], b17, objArr25);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c3, doubleTapTimeout2, bitsPerPixel2, 1814927978, false, (String) objArr25[0], null);
                                                        }
                                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method2);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                            char packedPositionChild4 = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                                                            int iAxisFromString3 = 2822 - MotionEvent.axisFromString("");
                                                            int i14 = 22 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                            byte[] bArr9 = $$d;
                                                            byte b18 = bArr9[5];
                                                            Object[] objArr26 = new Object[1];
                                                            f(b18, bArr9[10], b18, objArr26);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionChild4, iAxisFromString3, i14, 1814927978, false, (String) objArr26[0], null);
                                                        }
                                                        Object[] objArr27 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                            char c4 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                                                            int pressedStateDuration2 = 2823 - (ViewConfiguration.getPressedStateDuration() >> 16);
                                                            int maxKeyCode3 = (KeyEvent.getMaxKeyCode() >> 16) + 22;
                                                            byte b19 = $$d[7];
                                                            byte b110 = b19;
                                                            Object[] objArr28 = new Object[1];
                                                            f(b19, b110, b110, objArr28);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c4, pressedStateDuration2, maxKeyCode3, -2137287382, false, (String) objArr28[0], new Class[]{Long.TYPE, Method.class});
                                                        }
                                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr27)).longValue();
                                                    }
                                                    int i15 = d + 19;
                                                    asInterface = i15 % 128;
                                                    int i16 = i15 % 2;
                                                }
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                                i++;
                                declaredMethods = methodArr2;
                                i4 = 0;
                            } catch (Throwable th3) {
                                Throwable cause3 = th3.getCause();
                                if (cause3 == null) {
                                    throw th3;
                                }
                                throw cause3;
                            }
                        }
                    }
                }
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                    char c5 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int iResolveSize = 2823 - View.resolveSize(0, 0);
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22;
                    byte[] bArr10 = $$d;
                    byte b20 = bArr10[5];
                    Object[] objArr29 = new Object[1];
                    f(b20, bArr10[10], b20, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c5, iResolveSize, minimumFlingVelocity, 1814927978, false, (String) objArr29[0], null);
                }
                try {
                    Object[] objArr30 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                        char c6 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int iResolveSize2 = 2823 - View.resolveSize(0, 0);
                        int capsMode = TextUtils.getCapsMode("", 0, 0) + 22;
                        byte b21 = $$d[7];
                        byte b22 = b21;
                        Object[] objArr31 = new Object[1];
                        f(b22, (byte) (b22 + 5), b21, objArr31);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c6, iResolveSize2, capsMode, 1025296417, false, (String) objArr31[0], new Class[]{Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr30);
                    try {
                        Object[] objArr32 = {0, methodArr, null};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                            char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 37657);
                            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 2720;
                            int i17 = 20 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            byte b23 = $$d[7];
                            byte b24 = b23;
                            Object[] objArr33 = new Object[1];
                            f(b24, (byte) (b24 + 5), b23, objArr33);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(keyRepeatDelay, windowTouchSlop, i17, -1568796068, false, (String) objArr33[0], new Class[]{Integer.TYPE, Method[].class, List.class});
                        }
                        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr32)).longValue();
                        long j = -1695061292;
                        long j2 = (((long) 866) * j) + (((long) (-864)) * jLongValue);
                        long j3 = -1;
                        long j4 = jLongValue ^ j3;
                        long jIdentityHashCode = System.identityHashCode(this);
                        long j5 = jIdentityHashCode ^ j3;
                        long j6 = 865;
                        long j7 = j2 + (((long) (-865)) * (j4 | (((j ^ j3) | j5) ^ j3))) + (((jIdentityHashCode | j) ^ j3) * j6) + (j6 * ((j3 ^ (j5 | j)) | ((j4 | j5) ^ j3))) + ((long) (-115344553));
                        int i18 = (int) (j7 >> 32);
                        try {
                            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                            int i19 = ~iMaxMemory;
                            int i20 = i18 & (80564881 + (((~(i19 | (-2122403527))) | 713050758 | (~(2144690126 | iMaxMemory))) * 717) + (((~(iMaxMemory | (-2122403527))) | (~(i19 | 2144690126)) | 713050758) * 717));
                            int i21 = (int) j7;
                            int iMyUid = Process.myUid();
                            int i22 = ~iMyUid;
                            int i23 = i20 | (i21 & ((-264200012) + (((~((-40513569) | i22)) | (~(2147466751 | iMyUid)) | (~((-629213206) | iMyUid))) * 765) + (((~(2106953183 | i22)) | 40513568) * 1530) + (((~(iMyUid | 2106953183)) | (~(i22 | (-629213206)))) * 765)));
                            int i24 = i23 >>> 24;
                            int i25 = i23 & ViewCompat.MEASURED_SIZE_MASK;
                            boolean z = i24 != 0;
                            if (z) {
                                r6 = 1;
                            } else {
                                int i26 = d + 79;
                                asInterface = i26 % 128;
                                if (i26 % 2 == 0) {
                                    int i27 = 5 % 4;
                                }
                                r6 = 0;
                            }
                            arrayList.add((!z || i25 >= 1 || (method = methodArr[i25]) == null) ? null : method.toString());
                            if ((i24 + 6) * r6 != 0) {
                                throw new NullPointerException();
                            }
                            try {
                                if (connectionSpecConfigureSecureSocket.supportsTlsExtensions()) {
                                    int i28 = d + 91;
                                    asInterface = i28 % 128;
                                    if (i28 % 2 == 0) {
                                        Platform.INSTANCE.get().configureTlsExtensions(r6, address.url().host(), address.protocols());
                                        Object obj = null;
                                        obj.hashCode();
                                        throw null;
                                    }
                                    try {
                                        ?? r7 = r6;
                                        Platform.INSTANCE.get().configureTlsExtensions(r7, address.url().host(), address.protocols());
                                        r4 = r7;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        r6 = r6;
                                        r5 = r6;
                                        if (r5 != 0) {
                                            int i29 = d + 115;
                                            asInterface = i29 % 128;
                                            int i30 = i29 % 2;
                                            Platform.INSTANCE.get().afterHandshake(r5);
                                        }
                                        if (r5 != 0) {
                                            Util.closeQuietly((Socket) r5);
                                        }
                                        throw th;
                                    }
                                } else {
                                    r4 = r6;
                                }
                                r4.startHandshake();
                                SSLSession session = r4.getSession();
                                Handshake.Companion companion = Handshake.INSTANCE;
                                Intrinsics.checkNotNullExpressionValue(session, "");
                                final Handshake handshake = companion.get(session);
                                HostnameVerifier hostnameVerifier = address.hostnameVerifier();
                                Intrinsics.checkNotNull(hostnameVerifier);
                                if (hostnameVerifier.verify(address.url().host(), session)) {
                                    final CertificatePinner certificatePinner = address.certificatePinner();
                                    Intrinsics.checkNotNull(certificatePinner);
                                    this.handshake = new Handshake(handshake.tlsVersion(), handshake.cipherSuite(), handshake.localCertificates(), new Function0<List<? extends Certificate>>() { // from class: okhttp3.internal.connection.RealConnection.connectTls.1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final List<? extends Certificate> invoke() {
                                            CertificateChainCleaner certificateChainCleaner$okhttp = certificatePinner.getCertificateChainCleaner$okhttp();
                                            Intrinsics.checkNotNull(certificateChainCleaner$okhttp);
                                            return certificateChainCleaner$okhttp.clean(handshake.peerCertificates(), address.url().host());
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }
                                    });
                                    certificatePinner.check$okhttp(address.url().host(), new Function0<List<? extends X509Certificate>>() { // from class: okhttp3.internal.connection.RealConnection.connectTls.2
                                        @Override // kotlin.jvm.functions.Function0
                                        public final List<? extends X509Certificate> invoke() {
                                            Handshake handshakeAccess$getHandshake$p = RealConnection.access$getHandshake$p(RealConnection.this);
                                            Intrinsics.checkNotNull(handshakeAccess$getHandshake$p);
                                            List<Certificate> listPeerCertificates = handshakeAccess$getHandshake$p.peerCertificates();
                                            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listPeerCertificates, 10));
                                            for (Certificate certificate : listPeerCertificates) {
                                                Intrinsics.checkNotNull(certificate, "");
                                                arrayList2.add((X509Certificate) certificate);
                                            }
                                            return arrayList2;
                                        }

                                        {
                                            super(0);
                                        }
                                    });
                                    if (connectionSpecConfigureSecureSocket.supportsTlsExtensions()) {
                                        int i31 = asInterface + 9;
                                        d = i31 % 128;
                                        if (i31 % 2 != 0) {
                                            selectedProtocol = Platform.INSTANCE.get().getSelectedProtocol(r4);
                                            int i32 = 40 / 0;
                                        } else {
                                            selectedProtocol = Platform.INSTANCE.get().getSelectedProtocol(r4);
                                        }
                                    } else {
                                        selectedProtocol = null;
                                    }
                                    this.socket = (Socket) r4;
                                    this.source = SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault1((Socket) r4));
                                    this.sink = SurfaceViewImplementation.TuitionPaymentFragmentbindingInflater1(SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3((Socket) r4));
                                    this.protocol = selectedProtocol != null ? Protocol.INSTANCE.get(selectedProtocol) : Protocol.HTTP_1_1;
                                    Platform.INSTANCE.get().afterHandshake(r4);
                                    return;
                                }
                                int i33 = asInterface + 77;
                                d = i33 % 128;
                                int i34 = i33 % 2;
                                List<Certificate> listPeerCertificates = handshake.peerCertificates();
                                if (listPeerCertificates.isEmpty()) {
                                    StringBuilder sb = new StringBuilder("Hostname ");
                                    sb.append(address.url().host());
                                    sb.append(" not verified (no certificates)");
                                    throw new SSLPeerUnverifiedException(sb.toString());
                                }
                                Certificate certificate = listPeerCertificates.get(0);
                                Intrinsics.checkNotNull(certificate, "");
                                X509Certificate x509Certificate = (X509Certificate) certificate;
                                StringBuilder sb2 = new StringBuilder("\n              |Hostname ");
                                sb2.append(address.url().host());
                                sb2.append(" not verified:\n              |    certificate: ");
                                sb2.append(CertificatePinner.INSTANCE.pin(x509Certificate));
                                sb2.append("\n              |    DN: ");
                                sb2.append(x509Certificate.getSubjectDN().getName());
                                sb2.append("\n              |    subjectAltNames: ");
                                sb2.append(OkHostnameVerifier.INSTANCE.allSubjectAltNames(x509Certificate));
                                sb2.append("\n              ");
                                throw new SSLPeerUnverifiedException(StringsKt.trimMargin$default(sb2.toString(), null, 1, null));
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            r6 = r6;
                        }
                    } catch (Throwable th7) {
                        Throwable cause4 = th7.getCause();
                        if (cause4 == null) {
                            throw th7;
                        }
                        throw cause4;
                    }
                } catch (Throwable th8) {
                    Throwable cause5 = th8.getCause();
                    if (cause5 == null) {
                        throw th8;
                    }
                    throw cause5;
                }
            } catch (Throwable th9) {
                th = th9;
            }
            r5 = r6;
        } catch (Throwable th10) {
            th = th10;
            r5 = 0;
        }
        if (r5 != 0) {
            int i210 = d + 115;
            asInterface = i210 % 128;
            int i35 = i210 % 2;
            Platform.INSTANCE.get().afterHandshake(r5);
        }
        if (r5 != 0) {
            Util.closeQuietly((Socket) r5);
        }
        throw th;
    }

    private final Request createTunnel(int p0, int p1, Request p2, HttpUrl p3) throws IOException {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("CONNECT ");
        sb.append(Util.toHostHeader(p3, true));
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        while (true) {
            RotationProvider1 rotationProvider1 = this.source;
            Intrinsics.checkNotNull(rotationProvider1);
            RotationProviderListener rotationProviderListener = this.sink;
            Intrinsics.checkNotNull(rotationProviderListener);
            Object obj = null;
            Http1ExchangeCodec http1ExchangeCodec = new Http1ExchangeCodec(null, this, rotationProvider1, rotationProviderListener);
            rotationProvider1.timeout().timeout(p0, TimeUnit.MILLISECONDS);
            rotationProviderListener.timeout().timeout(p1, TimeUnit.MILLISECONDS);
            http1ExchangeCodec.writeRequest(p2.headers(), string);
            http1ExchangeCodec.finishRequest();
            Response.Builder responseHeaders = http1ExchangeCodec.readResponseHeaders(false);
            Intrinsics.checkNotNull(responseHeaders);
            Response responseBuild = responseHeaders.request(p2).build();
            http1ExchangeCodec.skipConnectBody(responseBuild);
            int iCode = responseBuild.code();
            if (iCode == 200) {
                if (rotationProvider1.asInterface().size == 0) {
                    int i2 = asInterface + 117;
                    d = i2 % 128;
                    int i3 = i2 % 2;
                    if (rotationProviderListener.asInterface().size == 0) {
                        int i4 = d;
                        int i5 = i4 + 65;
                        asInterface = i5 % 128;
                        int i6 = i5 % 2;
                        int i7 = i4 + 69;
                        asInterface = i7 % 128;
                        int i8 = i7 % 2;
                        return null;
                    }
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (iCode != 407) {
                StringBuilder sb2 = new StringBuilder("Unexpected response code for CONNECT: ");
                sb2.append(responseBuild.code());
                throw new IOException(sb2.toString());
            }
            int i9 = d + 1;
            asInterface = i9 % 128;
            if (i9 % 2 == 0) {
                this.route.address().proxyAuthenticator().authenticate(this.route, responseBuild);
                obj.hashCode();
                throw null;
            }
            Request requestAuthenticate = this.route.address().proxyAuthenticator().authenticate(this.route, responseBuild);
            if (requestAuthenticate == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            int i10 = asInterface + 27;
            d = i10 % 128;
            int i11 = i10 % 2;
            if (!(!StringsKt.equals("close", Response.header$default(responseBuild, "Connection", null, 2, null), true))) {
                return requestAuthenticate;
            }
            p2 = requestAuthenticate;
        }
    }

    private final Request createTunnelRequest() throws IOException {
        int i = 2 % 2;
        Object obj = null;
        Request requestBuild = new Request.Builder().url(this.route.address().url()).method("CONNECT", null).header("Host", Util.toHostHeader(this.route.address().url(), true)).header("Proxy-Connection", "Keep-Alive").header("User-Agent", Util.userAgent).build();
        Request requestAuthenticate = this.route.address().proxyAuthenticator().authenticate(this.route, new Response.Builder().request(requestBuild).protocol(Protocol.HTTP_1_1).code(407).message("Preemptive Authenticate").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1L).receivedResponseAtMillis(-1L).header("Proxy-Authenticate", "OkHttp-Preemptive").build());
        if (requestAuthenticate != null) {
            return requestAuthenticate;
        }
        int i2 = asInterface;
        int i3 = i2 + 55;
        d = i3 % 128;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 25;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 8 / 0;
        }
        return requestBuild;
    }

    /* JADX WARN: Code duplicated, block: B:146:0x02f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x03e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:54:0x0345  */
    /* JADX WARN: Code duplicated, block: B:58:0x039a A[Catch: all -> 0x0685, TryCatch #2 {all -> 0x0685, blocks: (B:56:0x0383, B:58:0x039a, B:59:0x03da, B:71:0x0444, B:73:0x0451, B:74:0x0498, B:76:0x04b7, B:77:0x04fb), top: B:144:0x0383 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x05c3  */
    public final boolean isEligible$okhttp(Address p0, List<Route> p1) throws Throwable {
        String str;
        Method method;
        String string;
        Method[] declaredMethods;
        int length;
        int i;
        int i2;
        int i3;
        int i4;
        Object[] objArr;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder("Thread ");
            sb.append(Thread.currentThread().getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        int i6 = 0;
        if (this.calls.size() < this.allocationLimit) {
            int i7 = d + 121;
            asInterface = i7 % 128;
            Object obj = null;
            if (i7 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (!this.noNewExchanges) {
                if (!this.route.address().equalsNonHost$okhttp(p0)) {
                    return false;
                }
                ArrayList arrayList = new ArrayList();
                int i8 = 1;
                Object[] objArr2 = new Object[1];
                a(new char[]{49194, 1292, 21692, 4381, 29859, 27912, 43808, 13367, 683, 6384, 44730, 61281, 64637, 23315, 34615, 13865, 9395, 11561}, MotionEvent.axisFromString("") + 17, objArr2);
                Class<?> cls = Class.forName((String) objArr2[0]);
                Object[] objArr3 = new Object[1];
                c(new int[]{1686252168, -1054974866, 1703686468, 236560029, 1343211857, 1775641341, 2001301791, -1572471137, -1604915405, 1402472622}, 16 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr3);
                int iIntValue = ((Integer) cls.getMethod((String) objArr3[0], Object.class).invoke(null, this)).intValue();
                byte b2 = (byte) ($$b & 1);
                byte b3 = (byte) (b2 - 1);
                Object[] objArr4 = new Object[1];
                e(b2, b3, (byte) (b3 + 1), objArr4);
                Method[] methodArr = {CertificatePinner.class.getMethod((String) objArr4[0], String.class, List.class)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int iArgb = Color.argb(0, 0, 0, 0) + 2823;
                    int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 22;
                    byte[] bArr = $$d;
                    byte b4 = bArr[5];
                    Object[] objArr5 = new Object[1];
                    f(b4, bArr[10], b4, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(doubleTapTimeout, iArgb, edgeSlop, 1814927978, false, (String) objArr5[0], null);
                }
                if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null) == null) {
                    int i9 = d + 83;
                    asInterface = i9 % 128;
                    if (i9 % 2 == 0) {
                        declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) TextUtils.getOffsetBefore("", 0), 2823 - ExpandableListView.getPackedPositionType(0L), Color.blue(0) + 22)).getDeclaredMethods();
                        length = declaredMethods.length;
                        i = 1;
                    } else {
                        declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 2823 - ((Process.getThreadPriority(0) + 20) >> 6), View.MeasureSpec.makeMeasureSpec(0, 0) + 22)).getDeclaredMethods();
                        length = declaredMethods.length;
                        i = 0;
                    }
                    while (i < length) {
                        Method method2 = declaredMethods[i];
                        try {
                            Object[] objArr6 = new Object[i8];
                            a(new char[]{36900, 37483, 24174, 38442, 31081, 63319, 10884, 41696, 35368, 21604, 34087, 22604, 20679, 58398, 52088, 41885, 34942, 43939, 38537, 3055, 24913, 20554, 49614, 15156, 29716, 10954}, Gravity.getAbsoluteGravity(i6, i6) + 24, objArr6);
                            Class<?> cls2 = Class.forName((String) objArr6[i6]);
                            Object[] objArr7 = new Object[i8];
                            c(new int[]{-442346835, -307995645, -1705559145, 1279868138, 2125667914, -1416872285, 577570677, -1076251404}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12, objArr7);
                            int iIntValue2 = ((Integer) cls2.getMethod((String) objArr7[0], null).invoke(method2, null)).intValue();
                            Object[] objArr8 = new Object[i8];
                            objArr8[0] = Integer.valueOf(iIntValue2);
                            Object[] objArr9 = new Object[i8];
                            a(new char[]{56157, 30031, 28689, 57163, 57451, 61932, 47643, 20579, 57303, 41811, 1907, 1265, 45799, 55782, 63436, '-', 14514, 20793, 22850, 24967, 38360, 1832, 46097, 64202, 52380, 48684, 45453, 4112}, (ViewConfiguration.getTapTimeout() >> 16) + 26, objArr9);
                            Class<?> cls3 = Class.forName((String) objArr9[0]);
                            Object[] objArr10 = new Object[1];
                            a(new char[]{57416, 54439, 32009, 50817, 9098, 12928, 20589, 42060, 5828, 2446}, 8 - Color.green(0), objArr10);
                            if (((Boolean) cls3.getMethod((String) objArr10[0], Integer.TYPE).invoke(null, objArr8)).booleanValue()) {
                                Class cls4 = Long.TYPE;
                                Object[] objArr11 = new Object[1];
                                a(new char[]{36900, 37483, 24174, 38442, 31081, 63319, 10884, 41696, 35368, 21604, 34087, 22604, 20679, 58398, 52088, 41885, 34942, 43939, 38537, 3055, 24913, 20554, 49614, 15156, 29716, 10954}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 23, objArr11);
                                Class<?> cls5 = Class.forName((String) objArr11[0]);
                                Object[] objArr12 = new Object[1];
                                a(new char[]{50512, 56154, 39445, 49411, 29318, 26059, 6544, 61399, 39138, 63178, 3318, 32256, 9194, 36311, 54082, 34628}, 13 - (ViewConfiguration.getEdgeSlop() >> 16), objArr12);
                                if (cls4.equals(cls5.getMethod((String) objArr12[0], null).invoke(method2, null))) {
                                    Object[] objArr13 = new Object[1];
                                    a(new char[]{36900, 37483, 24174, 38442, 31081, 63319, 10884, 41696, 35368, 21604, 34087, 22604, 20679, 58398, 52088, 41885, 34942, 43939, 38537, 3055, 24913, 20554, 49614, 15156, 29716, 10954}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 24, objArr13);
                                    Class<?> cls6 = Class.forName((String) objArr13[0]);
                                    Object[] objArr14 = new Object[1];
                                    c(new int[]{-1180438140, 801172273, -1690616533, 929020959, -1108287303, -40404152, -1649397908, 1680207106, 575129333, -870911938, 1065889194, 244683797}, (Process.myTid() >> 22) + 17, objArr14);
                                    Object[] objArr15 = (Object[]) cls6.getMethod((String) objArr14[0], null).invoke(method2, null);
                                    if (objArr15.length == 2) {
                                        int i10 = asInterface + 17;
                                        d = i10 % 128;
                                        if (i10 % 2 != 0) {
                                            i2 = 1;
                                            if (Long.TYPE.equals(objArr15[1])) {
                                                i4 = 26;
                                                i3 = 0;
                                                char[] cArr = new char[i4];
                                                // fill-array-data instruction
                                                cArr[0] = 36900;
                                                cArr[1] = 37483;
                                                cArr[2] = 24174;
                                                cArr[3] = 38442;
                                                cArr[4] = 31081;
                                                cArr[5] = 63319;
                                                cArr[6] = 10884;
                                                cArr[7] = 41696;
                                                cArr[8] = 35368;
                                                cArr[9] = 21604;
                                                cArr[10] = 34087;
                                                cArr[11] = 22604;
                                                cArr[12] = 20679;
                                                cArr[13] = 58398;
                                                cArr[14] = 52088;
                                                cArr[15] = 41885;
                                                cArr[16] = 34942;
                                                cArr[17] = 43939;
                                                cArr[18] = 38537;
                                                cArr[19] = 3055;
                                                cArr[20] = 24913;
                                                cArr[21] = 20554;
                                                cArr[22] = 49614;
                                                cArr[23] = 15156;
                                                cArr[24] = 29716;
                                                cArr[25] = 10954;
                                                objArr = new Object[i2];
                                                a(cArr, Color.rgb(i3, i3, i3) + 16777240, objArr);
                                                if (Class.forName((String) objArr[i3]).equals(objArr15[i2])) {
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                        char cResolveOpacity = (char) Drawable.resolveOpacity(i3, i3);
                                                        int iCombineMeasuredStates = 2823 - View.combineMeasuredStates(i3, i3);
                                                        int i11 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21;
                                                        byte[] bArr2 = $$d;
                                                        byte b5 = bArr2[5];
                                                        Object[] objArr16 = new Object[1];
                                                        f(b5, bArr2[10], b5, objArr16);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveOpacity, iCombineMeasuredStates, i11, 1814927978, false, (String) objArr16[0], null);
                                                    }
                                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method2);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                        char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                                                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 2823;
                                                        int i12 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 21;
                                                        byte[] bArr3 = $$d;
                                                        byte b6 = bArr3[5];
                                                        Object[] objArr17 = new Object[1];
                                                        f(b6, bArr3[10], b6, objArr17);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(offsetAfter, absoluteGravity, i12, 1814927978, false, (String) objArr17[0], null);
                                                    }
                                                    try {
                                                        Object[] objArr18 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                            char c = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                                                            int iResolveSizeAndState = 2823 - View.resolveSizeAndState(0, 0, 0);
                                                            int iIndexOf = 21 - TextUtils.indexOf((CharSequence) "", '0');
                                                            byte b7 = $$d[7];
                                                            byte b8 = b7;
                                                            Object[] objArr19 = new Object[1];
                                                            f(b7, b8, b8, objArr19);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, iResolveSizeAndState, iIndexOf, -2137287382, false, (String) objArr19[0], new Class[]{Long.TYPE, Method.class});
                                                        }
                                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr18)).longValue();
                                                        break;
                                                    } catch (Throwable th) {
                                                        Throwable cause = th.getCause();
                                                        if (cause != null) {
                                                            throw cause;
                                                        }
                                                        throw th;
                                                    }
                                                }
                                            } else {
                                                continue;
                                            }
                                        } else {
                                            i2 = 1;
                                            i3 = 0;
                                            if (!(!Long.TYPE.equals(objArr15[0]))) {
                                                i4 = 26;
                                                char[] cArr2 = new char[i4];
                                                // fill-array-data instruction
                                                cArr2[0] = 36900;
                                                cArr2[1] = 37483;
                                                cArr2[2] = 24174;
                                                cArr2[3] = 38442;
                                                cArr2[4] = 31081;
                                                cArr2[5] = 63319;
                                                cArr2[6] = 10884;
                                                cArr2[7] = 41696;
                                                cArr2[8] = 35368;
                                                cArr2[9] = 21604;
                                                cArr2[10] = 34087;
                                                cArr2[11] = 22604;
                                                cArr2[12] = 20679;
                                                cArr2[13] = 58398;
                                                cArr2[14] = 52088;
                                                cArr2[15] = 41885;
                                                cArr2[16] = 34942;
                                                cArr2[17] = 43939;
                                                cArr2[18] = 38537;
                                                cArr2[19] = 3055;
                                                cArr2[20] = 24913;
                                                cArr2[21] = 20554;
                                                cArr2[22] = 49614;
                                                cArr2[23] = 15156;
                                                cArr2[24] = 29716;
                                                cArr2[25] = 10954;
                                                objArr = new Object[i2];
                                                a(cArr2, Color.rgb(i3, i3, i3) + 16777240, objArr);
                                                if (Class.forName((String) objArr[i3]).equals(objArr15[i2])) {
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                        char cResolveOpacity2 = (char) Drawable.resolveOpacity(i3, i3);
                                                        int iCombineMeasuredStates2 = 2823 - View.combineMeasuredStates(i3, i3);
                                                        int i13 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21;
                                                        byte[] bArr4 = $$d;
                                                        byte b9 = bArr4[5];
                                                        Object[] objArr110 = new Object[1];
                                                        f(b9, bArr4[10], b9, objArr110);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveOpacity2, iCombineMeasuredStates2, i13, 1814927978, false, (String) objArr110[0], null);
                                                    }
                                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method2);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                        char offsetAfter2 = (char) TextUtils.getOffsetAfter("", 0);
                                                        int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0) + 2823;
                                                        int i14 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 21;
                                                        byte[] bArr5 = $$d;
                                                        byte b10 = bArr5[5];
                                                        Object[] objArr111 = new Object[1];
                                                        f(b10, bArr5[10], b10, objArr111);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(offsetAfter2, absoluteGravity2, i14, 1814927978, false, (String) objArr111[0], null);
                                                    }
                                                    Object[] objArr112 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                        char c2 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                                                        int iResolveSizeAndState2 = 2823 - View.resolveSizeAndState(0, 0, 0);
                                                        int iIndexOf2 = 21 - TextUtils.indexOf((CharSequence) "", '0');
                                                        byte b11 = $$d[7];
                                                        byte b12 = b11;
                                                        Object[] objArr113 = new Object[1];
                                                        f(b11, b12, b12, objArr113);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, iResolveSizeAndState2, iIndexOf2, -2137287382, false, (String) objArr113[0], new Class[]{Long.TYPE, Method.class});
                                                    }
                                                    ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr112)).longValue();
                                                    break;
                                                }
                                            } else {
                                                continue;
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            }
                            i++;
                            i6 = 0;
                            i8 = 1;
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
                    char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int iMyPid = (Process.myPid() >> 22) + 2823;
                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22;
                    byte[] bArr6 = $$d;
                    byte b13 = bArr6[5];
                    Object[] objArr20 = new Object[1];
                    f(b13, bArr6[10], b13, objArr20);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maximumFlingVelocity, iMyPid, maximumDrawingCacheSize, 1814927978, false, (String) objArr20[0], null);
                }
                Object[] objArr21 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c3 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                    int capsMode = TextUtils.getCapsMode("", 0, 0) + 2823;
                    int iIndexOf3 = 21 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    byte b14 = $$d[7];
                    byte b15 = b14;
                    Object[] objArr22 = new Object[1];
                    f(b15, (byte) (b15 + 5), b14, objArr22);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, capsMode, iIndexOf3, 1025296417, false, (String) objArr22[0], new Class[]{Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr21);
                Object[] objArr23 = {0, methodArr, null};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                    char cIndexOf = (char) (37657 - TextUtils.indexOf("", ""));
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 2720;
                    int iResolveOpacity2 = Drawable.resolveOpacity(0, 0) + 19;
                    byte b16 = $$d[7];
                    byte b17 = b16;
                    Object[] objArr24 = new Object[1];
                    f(b17, (byte) (b17 + 5), b16, objArr24);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf, iResolveOpacity, iResolveOpacity2, -1568796068, false, (String) objArr24[0], new Class[]{Integer.TYPE, Method[].class, List.class});
                }
                long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr23)).longValue();
                long j = -887917968;
                long j2 = (((long) (-464)) * j) + (((long) (-929)) * jLongValue);
                long j3 = -1;
                long j4 = j ^ j3;
                long jIdentityHashCode = System.identityHashCode(this);
                long j5 = jLongValue | jIdentityHashCode;
                long j6 = j2 + (((long) (-465)) * (j4 | (j5 ^ j3))) + (((long) 930) * (((jIdentityHashCode | j4) ^ j3) | jLongValue)) + (((long) 465) * (j5 | j4)) + ((long) (-922487877));
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i15 = ((int) (j6 >> 32)) & (392431670 + (((~(1505153472 | elapsedCpuTime)) | 1352587412) * (-964)) + (((~((~elapsedCpuTime) | 1505153472)) | 526356) * (-964)));
                int i16 = ~Process.myUid();
                int i17 = i15 | (((int) j6) & ((-2009197579) + (((~(i16 | 1838432153)) | (-2111143870)) * (-160)) + (((~(i16 | (-1019308733))) | 1838432153) * 160)));
                int i18 = i17 >>> 24;
                int i19 = i17 & ViewCompat.MEASURED_SIZE_MASK;
                int i20 = i18 != 0 ? 1 : 0;
                if (i20 != 0) {
                    int i21 = asInterface;
                    int i22 = i21 + 13;
                    d = i22 % 128;
                    if (i22 % 2 != 0) {
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    if (i19 >= 1 || (method = methodArr[i19]) == null) {
                        str = null;
                    } else {
                        int i23 = i21 + 123;
                        d = i23 % 128;
                        if (i23 % 2 != 0) {
                            string = method.toString();
                            int i24 = 54 / 0;
                        } else {
                            string = method.toString();
                        }
                        str = string;
                    }
                } else {
                    str = null;
                }
                arrayList.add(str);
                if ((i18 + 6) * i20 != 0) {
                    Toast.makeText((Context) null, iIntValue / (((iIntValue - 1) * iIntValue) % 2), 0).show();
                    int i25 = asInterface + 111;
                    d = i25 % 128;
                    int i26 = i25 % 2;
                }
                if (Intrinsics.areEqual(p0.url().host(), route().address().url().host())) {
                    int i27 = asInterface + 53;
                    d = i27 % 128;
                    return i27 % 2 == 0;
                }
                if (this.http2Connection == null) {
                    int i28 = asInterface + 7;
                    d = i28 % 128;
                    int i29 = i28 % 2;
                    return false;
                }
                if (p1 == null) {
                    return false;
                }
                int i30 = d + 17;
                asInterface = i30 % 128;
                if (i30 % 2 == 0) {
                    int i31 = 0 / 0;
                    if (!routeMatchesAny(p1)) {
                        return false;
                    }
                } else if (!routeMatchesAny(p1)) {
                    return false;
                }
                if (p0.hostnameVerifier() != OkHostnameVerifier.INSTANCE) {
                    return false;
                }
                if (!supportsUrl(p0.url())) {
                    int i32 = asInterface + 85;
                    d = i32 % 128;
                    int i33 = i32 % 2;
                    return false;
                }
                try {
                    CertificatePinner certificatePinner = p0.certificatePinner();
                    Intrinsics.checkNotNull(certificatePinner);
                    String strHost = p0.url().host();
                    Handshake handshake = handshake();
                    Intrinsics.checkNotNull(handshake);
                    certificatePinner.check(strHost, handshake.peerCertificates());
                    return true;
                } catch (SSLPeerUnverifiedException unused) {
                    return false;
                }
            }
        }
        return false;
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\n8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lokhttp3/internal/connection/RealConnection$Companion;", "", "<init>", "()V", "Lokhttp3/internal/connection/RealConnectionPool;", "p0", "Lokhttp3/Route;", "p1", "Ljava/net/Socket;", "p2", "", "p3", "Lokhttp3/internal/connection/RealConnection;", "newTestConnection", "(Lokhttp3/internal/connection/RealConnectionPool;Lokhttp3/Route;Ljava/net/Socket;J)Lokhttp3/internal/connection/RealConnection;", "IDLE_CONNECTION_HEALTHY_NS", "J", "", "MAX_TUNNEL_ATTEMPTS", "I", "", "NPE_THROW_WITH_NULL", "Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final RealConnection newTestConnection(RealConnectionPool p0, Route p1, Socket p2, long p3) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intrinsics.checkNotNullParameter(p2, "");
            RealConnection realConnection = new RealConnection(p0, p1);
            RealConnection.access$setSocket$p(realConnection, p2);
            realConnection.setIdleAtNs$okhttp(p3);
            return realConnection;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final boolean routeMatchesAny(List<Route> p0) {
        int i = 2 % 2;
        List<Route> list = p0;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (Route route : list) {
            if (route.proxy().type() == Proxy.Type.DIRECT && this.route.proxy().type() == Proxy.Type.DIRECT) {
                int i2 = asInterface + 47;
                d = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.areEqual(this.route.socketAddress(), route.socketAddress());
                    throw null;
                }
                if (Intrinsics.areEqual(this.route.socketAddress(), route.socketAddress())) {
                    int i3 = asInterface + 85;
                    d = i3 % 128;
                    int i4 = i3 % 2;
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean supportsUrl(HttpUrl p0) {
        Handshake handshake;
        int i = 2 % 2;
        int i2 = asInterface + 77;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            boolean z = Util.assertionsEnabled;
            throw null;
        }
        if (!Util.assertionsEnabled || Thread.holdsLock(this)) {
            HttpUrl httpUrlUrl = this.route.address().url();
            if (p0.port() == httpUrlUrl.port()) {
                if (Intrinsics.areEqual(p0.host(), httpUrlUrl.host())) {
                    return true;
                }
                if ((!this.noCoalescedConnections) && (handshake = this.handshake) != null) {
                    Intrinsics.checkNotNull(handshake);
                    if (certificateSupportHost(p0, handshake)) {
                        return true;
                    }
                }
                return false;
            }
            int i3 = d + 9;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        StringBuilder sb = new StringBuilder("Thread ");
        sb.append(Thread.currentThread().getName());
        sb.append(" MUST hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    private final boolean certificateSupportHost(HttpUrl p0, Handshake p1) {
        int i = 2 % 2;
        List<Certificate> listPeerCertificates = p1.peerCertificates();
        if (!listPeerCertificates.isEmpty()) {
            int i2 = asInterface + 69;
            d = i2 % 128;
            int i3 = i2 % 2;
            OkHostnameVerifier okHostnameVerifier = OkHostnameVerifier.INSTANCE;
            String strHost = p0.host();
            Certificate certificate = listPeerCertificates.get(0);
            Intrinsics.checkNotNull(certificate, "");
            if (okHostnameVerifier.verify(strHost, (X509Certificate) certificate)) {
                int i4 = asInterface + 79;
                d = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
        }
        int i6 = d + 37;
        asInterface = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 5 / 0;
        }
        return false;
    }

    public final ExchangeCodec newCodec$okhttp(OkHttpClient p0, RealInterceptorChain p1) throws SocketException {
        int i = 2 % 2;
        int i2 = d + 9;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Socket socket = this.socket;
        Intrinsics.checkNotNull(socket);
        RotationProvider1 rotationProvider1 = this.source;
        Intrinsics.checkNotNull(rotationProvider1);
        RotationProviderListener rotationProviderListener = this.sink;
        Intrinsics.checkNotNull(rotationProviderListener);
        Http2Connection http2Connection = this.http2Connection;
        if (http2Connection == null) {
            socket.setSoTimeout(p1.readTimeoutMillis());
            rotationProvider1.timeout().timeout(p1.getReadTimeoutMillis$okhttp(), TimeUnit.MILLISECONDS);
            rotationProviderListener.timeout().timeout(p1.getWriteTimeoutMillis$okhttp(), TimeUnit.MILLISECONDS);
            return new Http1ExchangeCodec(p0, this, rotationProvider1, rotationProviderListener);
        }
        Http2ExchangeCodec http2ExchangeCodec = new Http2ExchangeCodec(p0, this, p1, http2Connection);
        int i4 = asInterface + 79;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 71 / 0;
        }
        return http2ExchangeCodec;
    }

    public final RealWebSocket.Streams newWebSocketStreams$okhttp(final Exchange p0) throws SocketException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Socket socket = this.socket;
        Intrinsics.checkNotNull(socket);
        final RotationProvider1 rotationProvider1 = this.source;
        Intrinsics.checkNotNull(rotationProvider1);
        final RotationProviderListener rotationProviderListener = this.sink;
        Intrinsics.checkNotNull(rotationProviderListener);
        socket.setSoTimeout(0);
        noNewExchanges$okhttp();
        RealWebSocket.Streams streams = new RealWebSocket.Streams(rotationProvider1, rotationProviderListener) { // from class: okhttp3.internal.connection.RealConnection$newWebSocketStreams$1
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                p0.bodyComplete(-1L, true, true, null);
            }
        };
        int i2 = asInterface + 3;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            return streams;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // okhttp3.Connection
    public final Route route() {
        int i = 2 % 2;
        int i2 = asInterface + 23;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        Route route = this.route;
        int i5 = i3 + 13;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return route;
    }

    public final void cancel() {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        d = i2 % 128;
        int i3 = i2 % 2;
        Socket socket = this.rawSocket;
        if (socket != null) {
            Util.closeQuietly(socket);
            int i4 = d + 23;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // okhttp3.Connection
    public final Socket socket() {
        int i = 2 % 2;
        int i2 = asInterface + 13;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNull(this.socket);
            throw null;
        }
        Socket socket = this.socket;
        Intrinsics.checkNotNull(socket);
        int i3 = d + 95;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 65 / 0;
        }
        return socket;
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public final void onStream(Http2Stream p0) throws IOException {
        int i = 2 % 2;
        int i2 = asInterface + 81;
        d = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        p0.close(ErrorCode.REFUSED_STREAM, null);
        int i4 = asInterface + 71;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public final void onSettings(Http2Connection p0, Settings p1) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            this.allocationLimit = p1.getMaxConcurrentStreams();
        }
    }

    @Override // okhttp3.Connection
    public final Handshake handshake() {
        int i = 2 % 2;
        int i2 = asInterface + 81;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        Handshake handshake = this.handshake;
        int i5 = i3 + 95;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return handshake;
    }

    public final void connectFailed$okhttp(OkHttpClient p0, Route p1, IOException p2) {
        int i = 2 % 2;
        int i2 = d + 99;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intrinsics.checkNotNullParameter(p2, "");
            p1.proxy().type();
            Proxy.Type type = Proxy.Type.DIRECT;
            throw null;
        }
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        if (p1.proxy().type() != Proxy.Type.DIRECT) {
            int i3 = d + 23;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            Address address = p1.address();
            address.proxySelector().connectFailed(address.url().uri(), p1.proxy().address(), p2);
            int i5 = asInterface + 11;
            d = i5 % 128;
            int i6 = i5 % 2;
        }
        p0.getRouteDatabase().failed(p1);
    }

    public final void trackFailure$okhttp(RealCall p0, IOException p1) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p1 instanceof StreamResetException) {
                if (((StreamResetException) p1).errorCode == ErrorCode.REFUSED_STREAM) {
                    int i = this.refusedStreamCount + 1;
                    this.refusedStreamCount = i;
                    if (i > 1) {
                        this.noNewExchanges = true;
                        this.routeFailureCount++;
                    }
                } else if (((StreamResetException) p1).errorCode != ErrorCode.CANCEL || !p0.getCanceled()) {
                    this.noNewExchanges = true;
                    this.routeFailureCount++;
                }
            } else if (!isMultiplexed$okhttp() || (p1 instanceof ConnectionShutdownException)) {
                this.noNewExchanges = true;
                if (this.successCount == 0) {
                    if (p1 != null) {
                        connectFailed$okhttp(p0.getClient(), this.route, p1);
                    }
                    this.routeFailureCount++;
                }
            }
        }
    }

    @Override // okhttp3.Connection
    public final Protocol protocol() {
        int i = 2 % 2;
        int i2 = asInterface + 77;
        d = i2 % 128;
        int i3 = i2 % 2;
        Protocol protocol = this.protocol;
        Intrinsics.checkNotNull(protocol);
        int i4 = asInterface + 121;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            return protocol;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isHealthy(boolean p0) {
        long j;
        if (!Util.assertionsEnabled || !Thread.holdsLock(this)) {
            long jNanoTime = System.nanoTime();
            Socket socket = this.rawSocket;
            Intrinsics.checkNotNull(socket);
            Socket socket2 = this.socket;
            Intrinsics.checkNotNull(socket2);
            RotationProvider1 rotationProvider1 = this.source;
            Intrinsics.checkNotNull(rotationProvider1);
            if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
                return false;
            }
            Http2Connection http2Connection = this.http2Connection;
            if (http2Connection != null) {
                return http2Connection.isHealthy(jNanoTime);
            }
            synchronized (this) {
                j = this.idleAtNs;
            }
            if (jNanoTime - j < IDLE_CONNECTION_HEALTHY_NS || !p0) {
                return true;
            }
            return Util.isHealthy(socket2, rotationProvider1);
        }
        StringBuilder sb = new StringBuilder("Thread ");
        sb.append(Thread.currentThread().getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0256  */
    /* JADX WARN: Code duplicated, block: B:26:0x0260  */
    /* JADX WARN: Code duplicated, block: B:29:0x026a  */
    /* JADX WARN: Code duplicated, block: B:30:0x026c  */
    public final String toString() throws Throwable {
        Object[] objArr;
        int i;
        Object[] objArr2;
        Object objCipherSuite;
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder("Connection{");
        sb.append(this.route.address().url().host());
        sb.append(':');
        sb.append(this.route.address().url().port());
        sb.append(", proxy=");
        sb.append(this.route.proxy());
        sb.append(" hostAddress=");
        InetSocketAddress inetSocketAddressSocketAddress = this.route.socketAddress();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
            int jumpTapTimeout = 876 - (ViewConfiguration.getJumpTapTimeout() >> 16);
            int i3 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 9;
            byte b2 = $$d[7];
            byte b3 = b2;
            Object[] objArr3 = new Object[1];
            f(b3, (byte) (b3 + 5), b2, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, jumpTapTimeout, i3, 252381699, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        a(new char[]{5449, 54481, 38042, 16951, 17425, 3591, 63402, 52149, 52986, 3647, 16668, 52789, 64788, 23851, 30148, 62199, 38935, 16434, 13558, 31910, 29999, 705, 46232, 41768}, TextUtils.indexOf("", "", 0, 0) + 22, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(new int[]{-912403950, -584637220, -1765345059, -732395836, 1547498648, -537279826, 1765068818, 1569269257, -1062701437, 2109195124}, 14 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
            int trimmedLength = 876 - TextUtils.getTrimmedLength("");
            int i4 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 10;
            byte[] bArr = $$d;
            byte b4 = bArr[5];
            Object[] objArr6 = new Object[1];
            f(b4, bArr[10], b4, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(touchSlop, trimmedLength, i4, 2009631821, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cAlpha = (char) Color.alpha(0);
                int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 876;
                int minimumFlingVelocity = 10 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                byte b5 = $$d[7];
                byte b6 = b5;
                Object[] objArr7 = new Object[1];
                f(b5, b6, b6, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cAlpha, scrollBarSize, minimumFlingVelocity, 256017550, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i5 = (-911024576) + (((~((-78060006) | iFreeMemory)) | (~((~iFreeMemory) | (-37749777)))) * (-318)) + (((~(95934949 | iFreeMemory)) | (-133684726)) * (-318)) + (((~(iFreeMemory | (-95934950))) | 55624720) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + 1789160770;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
            int i8 = asInterface + 113;
            d = i8 % 128;
            int i9 = i8 % 2;
        } else {
            Object[] objArr9 = new Object[1];
            a(new char[]{28934, 3426, 63663, 55795, 41981, 11038, 31015, 54113, 5404, 32699, 28330, 19317, 42693, 32048, 41303, 24271, 61171, 40224, 4595, 31507, 3736, 41290, 53761, 4445, 54610, 4386, 25094, 9315}, (ViewConfiguration.getEdgeSlop() >> 16) + 26, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c(new int[]{-41952700, -231693340, -1425963259, -1661848338, -393663749, -1075836366, 45600384, -52870942, 66155810, 2084961396, 1235229907, 503439763}, Gravity.getAbsoluteGravity(0, 0) + 18, objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i10 = d;
                int i11 = i10 + 111;
                asInterface = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 24 / 0;
                    if (!(!(applicationContext instanceof ContextWrapper))) {
                        i = i10 + 21;
                        asInterface = i % 128;
                        if (i % 2 != 0) {
                            ((ContextWrapper) applicationContext).getBaseContext();
                            throw null;
                        }
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = null;
                        }
                    }
                } else if (applicationContext instanceof ContextWrapper) {
                    i = i10 + 21;
                    asInterface = i % 128;
                    if (i % 2 != 0) {
                        ((ContextWrapper) applicationContext).getBaseContext();
                        throw null;
                    }
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = null;
                    }
                }
                applicationContext = applicationContext.getApplicationContext();
            }
            Object[] objArr11 = new Object[1];
            a(new char[]{49194, 1292, 21692, 4381, 29859, 27912, 43808, 13367, 683, 6384, 44730, 61281, 64637, 23315, 34615, 13865, 9395, 11561}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 16, objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            c(new int[]{1686252168, -1054974866, 1703686468, 236560029, 1343211857, 1775641341, 2001301791, -1572471137, -1604915405, 1402472622}, 16 - View.MeasureSpec.getMode(0), objArr12);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue();
            int i13 = d + 119;
            asInterface = i13 % 128;
            int i14 = i13 % 2;
            try {
                Object[] objArr13 = {applicationContext, Integer.valueOf(iIntValue), 1789160770};
                byte[] bArr2 = $$g;
                byte b7 = bArr2[9];
                Object[] objArr14 = new Object[1];
                h(b7, b7, bArr2[78], objArr14);
                Class<?> cls4 = Class.forName((String) objArr14[0]);
                byte b8 = bArr2[41];
                byte b9 = b8;
                Object[] objArr15 = new Object[1];
                h(b8, b9, (byte) (b9 | 30), objArr15);
                Object[] objArr16 = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c2 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                        int tapTimeout = 876 - (ViewConfiguration.getTapTimeout() >> 16);
                        int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 10;
                        byte b10 = $$d[7];
                        byte b11 = b10;
                        Object[] objArr17 = new Object[1];
                        f(b10, b11, b11, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, tapTimeout, tapTimeout2, 256017550, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr16);
                    try {
                        Object[] objArr18 = new Object[1];
                        a(new char[]{5449, 54481, 38042, 16951, 17425, 3591, 63402, 52149, 52986, 3647, 16668, 52789, 64788, 23851, 30148, 62199, 38935, 16434, 13558, 31910, 29999, 705, 46232, 41768}, 22 - Color.alpha(0), objArr18);
                        Class<?> cls5 = Class.forName((String) objArr18[0]);
                        Object[] objArr19 = new Object[1];
                        c(new int[]{-912403950, -584637220, -1765345059, -732395836, 1547498648, -537279826, 1765068818, 1569269257, -1062701437, 2109195124}, Color.alpha(0) + 15, objArr19);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c3 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            int maxKeyCode = 876 - (KeyEvent.getMaxKeyCode() >> 16);
                            int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 10;
                            byte[] bArr3 = $$d;
                            byte b12 = bArr3[5];
                            Object[] objArr20 = new Object[1];
                            f(b12, bArr3[10], b12, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c3, maxKeyCode, iIndexOf, 2009631821, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c4 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
                            int i15 = 877 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                            int iBlue = 10 - Color.blue(0);
                            byte b13 = $$d[7];
                            byte b14 = b13;
                            Object[] objArr21 = new Object[1];
                            f(b14, (byte) (b14 + 5), b13, objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c4, i15, iBlue, 252381699, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr16;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i16 = ((int[]) objArr[2])[0];
        int i17 = ((int[]) objArr[0])[0];
        if (i17 == i16) {
            int i18 = d + 85;
            asInterface = i18 % 128;
            int i19 = i18 % 2;
            int i20 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iMyTid = Process.myTid();
            int i21 = 112401268 + ((~(iMyTid | 746091928)) * 216);
            int i22 = ~iMyTid;
            int i23 = i20 + i21 + ((779714523 | i22) * (-216)) + (((~(i22 | 746091928)) | (-705781700)) * 216);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr2[1])[0] = i25 ^ (i25 << 5);
        } else {
            int[] iArr = new int[i17];
            int i26 = i17 - 1;
            iArr[i26] = 1;
            Toast.makeText((Context) null, iArr[((i17 * i26) % 2) - 1], 1).show();
            int i27 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i28 = (-1066142508) + (((~(401282112 | iIdentityHashCode)) | (-360971884)) * 672);
            int i29 = ~iIdentityHashCode;
            int i30 = i27 + i28 + (((~(iIdentityHashCode | (-360971884))) | (~((-401282113) | i29))) * (-672)) + (((~(360971883 | i29)) | (-401342060)) * 672);
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr2[1])[0] = i32 ^ (i32 << 5);
        }
        sb.append(inetSocketAddressSocketAddress);
        int i33 = ((int[]) objArr2[1])[0];
        int i34 = i33 * i33;
        int i35 = -(1538560815 * i33);
        int i36 = ((i34 | i35) << 1) - (i34 ^ i35);
        int i37 = -(i33 * 1432622915);
        int i38 = (i36 & i37) + (i37 | i36);
        int i39 = (i38 ^ (-2101942607)) + (((-2101942607) & i38) << 1);
        int i40 = i39 >> 23;
        int i41 = ((i40 ^ (-1023)) + ((i40 & (-1023)) << 1)) / 512;
        int i42 = (i39 - (~((i41 & 1) + (i41 | 1)))) - 1;
        int i43 = i39 >> 27;
        int i44 = ((i43 ^ (-63)) + ((i43 & (-63)) << 1)) / 32;
        int i45 = (-(i42 ^ (((i44 | 1) << 1) - (i44 ^ 1)))) + 7;
        int i46 = i45 >> 25;
        int i47 = ((i46 ^ (-255)) + ((i46 & (-255)) << 1)) / 128;
        int i48 = ((i47 | 1) << 1) - (i47 ^ 1);
        sb.append("16; cipherSuite=".substring(30009 / ((i45 & (-(((i48 | 1) << 1) - (i48 ^ 1)))) * 1429)));
        Handshake handshake = this.handshake;
        if (handshake == null || (objCipherSuite = handshake.cipherSuite()) == null) {
            objCipherSuite = "none";
        }
        sb.append(objCipherSuite);
        sb.append(" protocol=");
        sb.append(this.protocol);
        sb.append('}');
        return sb.toString();
    }

    static {
        g = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        INSTANCE = new Companion(null);
        int i = asBinder + 43;
        g = i % 128;
        int i2 = i % 2;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        TuitionPaymentFragmentbindingInflater1 = (char) 27637;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) 16002;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (char) 46780;
        b = (char) 39482;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new int[]{618424297, 2026196796, -1173314455, 929790731, 1775044756, 997805139, -781718801, 358714756, 2041765742, 246000437, -1653317187, -878261672, -950322471, 1934880996, -709443482, -68387690, -1599007080, 553505351};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r6, byte r7, byte r8) {
        /*
            int r6 = r6 * 4
            int r6 = r6 + 4
            int r8 = r8 * 14
            int r8 = 122 - r8
            int r7 = r7 * 3
            int r7 = 1 - r7
            byte[] r0 = okhttp3.internal.connection.RealConnection.$$c
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r4 = r0[r6]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r8 = -r8
            int r8 = r8 + r3
            int r6 = r6 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.$$i(byte, byte, byte):java.lang.String");
    }
}
