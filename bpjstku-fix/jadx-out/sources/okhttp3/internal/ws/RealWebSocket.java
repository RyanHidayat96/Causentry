package okhttp3.internal.ws;

import android.content.Context;
import android.widget.Toast;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.core.app.NotificationCompat;
import androidx.core.view.PointerIconCompat;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.messaging.Constants;
import com.midtrans.sdk.corekit.models.snap.TransactionResult;
import defpackage.RotationProvider1;
import defpackage.RotationProviderListener;
import defpackage.getDropDownHorizontalOffset;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okio.ByteString;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 w2\u00020\u00012\u00020\u0002:\u0005xwyz{BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00182\b\u0010\u0006\u001a\u0004\u0018\u00010\u0019H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0004\u001a\u00020\u001c2\b\u0010\u0006\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0004\u001a\u00020\u001c2\b\u0010\u0006\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\b\u001a\u00020\u000b¢\u0006\u0004\b\u001f\u0010!J\u0015\u0010#\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\"¢\u0006\u0004\b#\u0010$J#\u0010'\u001a\u00020\u00132\n\u0010\u0004\u001a\u00060%j\u0002`&2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b'\u0010(J\u001d\u0010*\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020)¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u0013¢\u0006\u0004\b,\u0010\u0017J\u001f\u0010-\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\u001dH\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u001dH\u0016¢\u0006\u0004\b/\u00100J\u0017\u0010/\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u000201H\u0016¢\u0006\u0004\b/\u00102J\u0017\u00103\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u000201H\u0016¢\u0006\u0004\b3\u00102J\u0017\u00104\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u000201H\u0016¢\u0006\u0004\b4\u00102J\u0015\u00105\u001a\u00020\u001e2\u0006\u0010\u0004\u001a\u000201¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u001e¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u000bH\u0016¢\u0006\u0004\b9\u0010:J\r\u0010;\u001a\u00020\u001c¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020\u001c¢\u0006\u0004\b=\u0010<J\u000f\u0010>\u001a\u00020\u0005H\u0017¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0013H\u0002¢\u0006\u0004\b@\u0010\u0017J\u0017\u0010A\u001a\u00020\u001e2\u0006\u0010\u0004\u001a\u00020\u001dH\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010A\u001a\u00020\u001e2\u0006\u0010\u0004\u001a\u000201H\u0016¢\u0006\u0004\bA\u00106J\u001f\u0010A\u001a\u00020\u001e2\u0006\u0010\u0004\u001a\u0002012\u0006\u0010\u0006\u001a\u00020\u001cH\u0002¢\u0006\u0004\bA\u0010CJ\r\u0010D\u001a\u00020\u001c¢\u0006\u0004\bD\u0010<J\r\u0010E\u001a\u00020\u0013¢\u0006\u0004\bE\u0010\u0017J\u000f\u0010F\u001a\u00020\u001eH\u0000¢\u0006\u0004\bF\u00108J\u000f\u0010G\u001a\u00020\u0013H\u0000¢\u0006\u0004\bG\u0010\u0017J\u0013\u0010H\u001a\u00020\u001e*\u00020\rH\u0002¢\u0006\u0004\bH\u0010IR\u0016\u0010J\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010M\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010O\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010KR\u0018\u0010P\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010R\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010KR\u0014\u0010S\u001a\u00020\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u001a\u0010U\u001a\u00020\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020Z0Y8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010]\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010_\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b_\u0010TR\u0014\u0010`\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010b\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bb\u0010^R\u001a\u0010c\u001a\b\u0012\u0004\u0012\u0002010Y8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bc\u0010\\R\u0016\u00109\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b9\u0010^R\u0014\u0010d\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010g\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010i\u001a\u00020\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0018\u0010k\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bk\u0010TR\u0016\u0010;\u001a\u00020\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b;\u0010jR\u0016\u0010=\u001a\u00020\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b=\u0010jR\u0016\u0010D\u001a\u00020\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bD\u0010jR\u0018\u0010l\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0016\u0010o\u001a\u00020n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u0018\u0010r\u001a\u0004\u0018\u00010q8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0018\u0010u\u001a\u0004\u0018\u00010t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bu\u0010v"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket;", "Lokhttp3/WebSocket;", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "Lokhttp3/internal/concurrent/TaskRunner;", "p0", "Lokhttp3/Request;", "p1", "Lokhttp3/WebSocketListener;", "p2", "Ljava/util/Random;", "p3", "", "p4", "Lokhttp3/internal/ws/WebSocketExtensions;", "p5", "p6", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/Request;Lokhttp3/WebSocketListener;Ljava/util/Random;JLokhttp3/internal/ws/WebSocketExtensions;J)V", "Ljava/util/concurrent/TimeUnit;", "", "awaitTermination", "(JLjava/util/concurrent/TimeUnit;)V", "cancel", "()V", "Lokhttp3/Response;", "Lokhttp3/internal/connection/Exchange;", "checkUpgradeSuccess$okhttp", "(Lokhttp3/Response;Lokhttp3/internal/connection/Exchange;)V", "", "", "", "close", "(ILjava/lang/String;)Z", "(ILjava/lang/String;J)Z", "Lokhttp3/OkHttpClient;", "connect", "(Lokhttp3/OkHttpClient;)V", "Ljava/lang/Exception;", "Lkotlin/TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "failWebSocket", "(Ljava/lang/Exception;Lokhttp3/Response;)V", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "initReaderAndWriter", "(Ljava/lang/String;Lokhttp3/internal/ws/RealWebSocket$Streams;)V", "loopReader", "onReadClose", "(ILjava/lang/String;)V", "onReadMessage", "(Ljava/lang/String;)V", "Lokio/ByteString;", "(Lokio/ByteString;)V", "onReadPing", "onReadPong", "pong", "(Lokio/ByteString;)Z", "processNextFrame", "()Z", "queueSize", "()J", "receivedPingCount", "()I", "receivedPongCount", "request", "()Lokhttp3/Request;", "runWriter", "send", "(Ljava/lang/String;)Z", "(Lokio/ByteString;I)Z", "sentPingCount", "tearDown", "writeOneFrame$okhttp", "writePingFrame$okhttp", "isValid", "(Lokhttp3/internal/ws/WebSocketExtensions;)Z", "awaitingPong", "Z", "Lokhttp3/Call;", NotificationCompat.CATEGORY_CALL, "Lokhttp3/Call;", "enqueuedClose", "extensions", "Lokhttp3/internal/ws/WebSocketExtensions;", TransactionResult.STATUS_FAILED, "key", "Ljava/lang/String;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lokhttp3/WebSocketListener;", "getListener$okhttp", "()Lokhttp3/WebSocketListener;", "Ljava/util/ArrayDeque;", "", "messageAndCloseQueue", "Ljava/util/ArrayDeque;", "minimumDeflateSize", "J", "name", "originalRequest", "Lokhttp3/Request;", "pingIntervalMillis", "pongQueue", "random", "Ljava/util/Random;", "Lokhttp3/internal/ws/WebSocketReader;", "reader", "Lokhttp3/internal/ws/WebSocketReader;", "receivedCloseCode", "I", "receivedCloseReason", "streams", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "Lokhttp3/internal/concurrent/TaskQueue;", "taskQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "Lokhttp3/internal/ws/WebSocketWriter;", "writer", "Lokhttp3/internal/ws/WebSocketWriter;", "Lokhttp3/internal/concurrent/Task;", "writerTask", "Lokhttp3/internal/concurrent/Task;", "Companion", "Close", "Message", "Streams", "WriterTask"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {
    private static final long CANCEL_AFTER_CLOSE_MILLIS = 60000;
    public static final long DEFAULT_MINIMUM_DEFLATE_SIZE = 1024;
    private static final long MAX_QUEUE_SIZE = 16777216;
    private boolean awaitingPong;
    private Call call;
    private boolean enqueuedClose;
    private WebSocketExtensions extensions;
    private boolean failed;
    private final String key;
    private final WebSocketListener listener;
    private final ArrayDeque<Object> messageAndCloseQueue;
    private long minimumDeflateSize;
    private String name;
    private final Request originalRequest;
    private final long pingIntervalMillis;
    private final ArrayDeque<ByteString> pongQueue;
    private long queueSize;
    private final Random random;
    private WebSocketReader reader;
    private int receivedCloseCode;
    private String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;
    private Streams streams;
    private TaskQueue taskQueue;
    private WebSocketWriter writer;
    private Task writerTask;
    private static final List<Protocol> ONLY_HTTP1 = CollectionsKt.listOf(Protocol.HTTP_1_1);

    public RealWebSocket(TaskRunner taskRunner, Request request, WebSocketListener webSocketListener, Random random, long j, WebSocketExtensions webSocketExtensions, long j2) {
        Intrinsics.checkNotNullParameter(taskRunner, "");
        Intrinsics.checkNotNullParameter(request, "");
        Intrinsics.checkNotNullParameter(webSocketListener, "");
        Intrinsics.checkNotNullParameter(random, "");
        this.originalRequest = request;
        this.listener = webSocketListener;
        this.random = random;
        this.pingIntervalMillis = j;
        this.extensions = webSocketExtensions;
        this.minimumDeflateSize = j2;
        this.taskQueue = taskRunner.newQueue();
        this.pongQueue = new ArrayDeque<>();
        this.messageAndCloseQueue = new ArrayDeque<>();
        this.receivedCloseCode = -1;
        if (!Intrinsics.areEqual(ShareTarget.METHOD_GET, request.method())) {
            StringBuilder sb = new StringBuilder("Request must be GET: ");
            sb.append(request.method());
            throw new IllegalArgumentException(sb.toString().toString());
        }
        ByteString.Companion companion = ByteString.INSTANCE;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        Unit unit = Unit.INSTANCE;
        this.key = ByteString.Companion.b(bArr).b();
    }

    /* JADX INFO: renamed from: getListener$okhttp, reason: from getter */
    public final WebSocketListener getListener() {
        return this.listener;
    }

    @Override // okhttp3.WebSocket
    /* JADX INFO: renamed from: request, reason: from getter */
    public final Request getOriginalRequest() {
        return this.originalRequest;
    }

    @Override // okhttp3.WebSocket
    public final long queueSize() {
        long j;
        synchronized (this) {
            j = this.queueSize;
        }
        return j;
    }

    @Override // okhttp3.WebSocket
    public final void cancel() {
        Call call = this.call;
        Intrinsics.checkNotNull(call);
        call.cancel();
    }

    public final void connect(OkHttpClient p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (this.originalRequest.header("Sec-WebSocket-Extensions") != null) {
            failWebSocket(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
            return;
        }
        OkHttpClient.Builder builderProtocols = p0.newBuilder().eventListener(EventListener.NONE).protocols(ONLY_HTTP1);
        int iIntValue = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
        if (getDropDownHorizontalOffset.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new ArrayList()) != 0) {
            Toast.makeText((Context) null, iIntValue / (((iIntValue - 1) * iIntValue) % 2), 0).show();
        }
        OkHttpClient okHttpClientBuild = builderProtocols.build();
        final Request requestBuild = this.originalRequest.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", this.key).header("Sec-WebSocket-Version", "13").header("Sec-WebSocket-Extensions", "permessage-deflate").build();
        RealCall realCall = new RealCall(okHttpClientBuild, requestBuild, true);
        this.call = realCall;
        Intrinsics.checkNotNull(realCall);
        realCall.enqueue(new Callback() { // from class: okhttp3.internal.ws.RealWebSocket.connect.1
            @Override // okhttp3.Callback
            public final void onResponse(Call p1, Response p2) throws IOException {
                Intrinsics.checkNotNullParameter(p1, "");
                Intrinsics.checkNotNullParameter(p2, "");
                Exchange exchange = p2.getExchange();
                try {
                    RealWebSocket.this.checkUpgradeSuccess$okhttp(p2, exchange);
                    Intrinsics.checkNotNull(exchange);
                    Streams streamsNewWebSocketStreams = exchange.newWebSocketStreams();
                    WebSocketExtensions webSocketExtensions = WebSocketExtensions.INSTANCE.parse(p2.headers());
                    RealWebSocket.this.extensions = webSocketExtensions;
                    if (!RealWebSocket.this.isValid(webSocketExtensions)) {
                        RealWebSocket realWebSocket = RealWebSocket.this;
                        synchronized (realWebSocket) {
                            realWebSocket.messageAndCloseQueue.clear();
                            realWebSocket.close(PointerIconCompat.TYPE_ALIAS, "unexpected Sec-WebSocket-Extensions in response header");
                        }
                    }
                    try {
                        StringBuilder sb = new StringBuilder();
                        sb.append(Util.okHttpName);
                        sb.append(" WebSocket ");
                        sb.append(requestBuild.url().redact());
                        RealWebSocket.this.initReaderAndWriter(sb.toString(), streamsNewWebSocketStreams);
                        RealWebSocket.this.getListener().onOpen(RealWebSocket.this, p2);
                        RealWebSocket.this.loopReader();
                    } catch (Exception e2) {
                        RealWebSocket.this.failWebSocket(e2, null);
                    }
                } catch (IOException e3) {
                    RealWebSocket.this.failWebSocket(e3, p2);
                    Util.closeQuietly(p2);
                    if (exchange != null) {
                        exchange.webSocketUpgradeFailed();
                    }
                }
            }

            @Override // okhttp3.Callback
            public final void onFailure(Call p1, IOException p2) {
                Intrinsics.checkNotNullParameter(p1, "");
                Intrinsics.checkNotNullParameter(p2, "");
                RealWebSocket.this.failWebSocket(p2, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isValid(WebSocketExtensions webSocketExtensions) {
        if (!webSocketExtensions.unknownValues && webSocketExtensions.clientMaxWindowBits == null) {
            return webSocketExtensions.serverMaxWindowBits == null || new IntRange(8, 15).contains(webSocketExtensions.serverMaxWindowBits.intValue());
        }
        return false;
    }

    public final void checkUpgradeSuccess$okhttp(Response p0, Exchange p1) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        if (p0.code() != 101) {
            StringBuilder sb = new StringBuilder("Expected HTTP 101 response but was '");
            sb.append(p0.code());
            sb.append(' ');
            sb.append(p0.message());
            sb.append('\'');
            throw new ProtocolException(sb.toString());
        }
        String strHeader$default = Response.header$default(p0, "Connection", null, 2, null);
        if (!StringsKt.equals("Upgrade", strHeader$default, true)) {
            StringBuilder sb2 = new StringBuilder("Expected 'Connection' header value 'Upgrade' but was '");
            sb2.append(strHeader$default);
            sb2.append('\'');
            throw new ProtocolException(sb2.toString());
        }
        String strHeader$default2 = Response.header$default(p0, "Upgrade", null, 2, null);
        if (!StringsKt.equals("websocket", strHeader$default2, true)) {
            StringBuilder sb3 = new StringBuilder("Expected 'Upgrade' header value 'websocket' but was '");
            sb3.append(strHeader$default2);
            sb3.append('\'');
            throw new ProtocolException(sb3.toString());
        }
        String strHeader$default3 = Response.header$default(p0, "Sec-WebSocket-Accept", null, 2, null);
        ByteString.Companion companion = ByteString.INSTANCE;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.key);
        sb4.append(WebSocketProtocol.ACCEPT_MAGIC);
        String strB = ByteString.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb4.toString()).b("SHA-1").b();
        if (Intrinsics.areEqual(strB, strHeader$default3)) {
            if (p1 == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        StringBuilder sb5 = new StringBuilder("Expected 'Sec-WebSocket-Accept' header value '");
        sb5.append(strB);
        sb5.append("' but was '");
        sb5.append(strHeader$default3);
        sb5.append('\'');
        throw new ProtocolException(sb5.toString());
    }

    public final void initReaderAndWriter(String p0, Streams p1) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        WebSocketExtensions webSocketExtensions = this.extensions;
        Intrinsics.checkNotNull(webSocketExtensions);
        synchronized (this) {
            this.name = p0;
            this.streams = p1;
            this.writer = new WebSocketWriter(p1.getClient(), p1.getSink(), this.random, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(p1.getClient()), this.minimumDeflateSize);
            this.writerTask = new WriterTask();
            if (this.pingIntervalMillis != 0) {
                final long nanos = TimeUnit.MILLISECONDS.toNanos(this.pingIntervalMillis);
                TaskQueue taskQueue = this.taskQueue;
                StringBuilder sb = new StringBuilder();
                sb.append(p0);
                sb.append(" ping");
                final String string = sb.toString();
                taskQueue.schedule(new Task(string) { // from class: okhttp3.internal.ws.RealWebSocket$initReaderAndWriter$lambda$3$$inlined$schedule$1
                    @Override // okhttp3.internal.concurrent.Task
                    public final long runOnce() {
                        this.writePingFrame$okhttp();
                        return nanos;
                    }
                }, nanos);
            }
            if (!this.messageAndCloseQueue.isEmpty()) {
                runWriter();
            }
            Unit unit = Unit.INSTANCE;
        }
        this.reader = new WebSocketReader(p1.getClient(), p1.getSource(), this, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(!p1.getClient()));
    }

    public final void loopReader() throws IOException {
        while (this.receivedCloseCode == -1) {
            WebSocketReader webSocketReader = this.reader;
            Intrinsics.checkNotNull(webSocketReader);
            webSocketReader.processNextFrame();
        }
    }

    public final boolean processNextFrame() throws IOException {
        try {
            WebSocketReader webSocketReader = this.reader;
            Intrinsics.checkNotNull(webSocketReader);
            webSocketReader.processNextFrame();
            return this.receivedCloseCode == -1;
        } catch (Exception e2) {
            failWebSocket(e2, null);
            return false;
        }
    }

    public final void awaitTermination(long p0, TimeUnit p1) throws InterruptedException {
        Intrinsics.checkNotNullParameter(p1, "");
        this.taskQueue.idleLatch().await(p0, p1);
    }

    public final void tearDown() throws InterruptedException {
        this.taskQueue.shutdown();
        this.taskQueue.idleLatch().await(10L, TimeUnit.SECONDS);
    }

    public final int sentPingCount() {
        int i;
        synchronized (this) {
            i = this.sentPingCount;
        }
        return i;
    }

    public final int receivedPingCount() {
        int i;
        synchronized (this) {
            i = this.receivedPingCount;
        }
        return i;
    }

    public final int receivedPongCount() {
        int i;
        synchronized (this) {
            i = this.receivedPongCount;
        }
        return i;
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final void onReadMessage(String p0) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        this.listener.onMessage(this, p0);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final void onReadMessage(ByteString p0) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        this.listener.onMessage(this, p0);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final void onReadPing(ByteString p0) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
                this.pongQueue.add(p0);
                runWriter();
                this.receivedPingCount++;
            }
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final void onReadPong(ByteString p0) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.receivedPongCount++;
            this.awaitingPong = false;
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final void onReadClose(int p0, String p1) {
        Streams streams;
        WebSocketReader webSocketReader;
        WebSocketWriter webSocketWriter;
        Intrinsics.checkNotNullParameter(p1, "");
        if (p0 == -1) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        synchronized (this) {
            if (this.receivedCloseCode != -1) {
                throw new IllegalStateException("already closed".toString());
            }
            this.receivedCloseCode = p0;
            this.receivedCloseReason = p1;
            streams = null;
            if (this.enqueuedClose && this.messageAndCloseQueue.isEmpty()) {
                Streams streams2 = this.streams;
                this.streams = null;
                webSocketReader = this.reader;
                this.reader = null;
                webSocketWriter = this.writer;
                this.writer = null;
                this.taskQueue.shutdown();
                streams = streams2;
            } else {
                webSocketReader = null;
                webSocketWriter = null;
            }
            Unit unit = Unit.INSTANCE;
        }
        try {
            this.listener.onClosing(this, p0, p1);
            if (streams != null) {
                this.listener.onClosed(this, p0, p1);
            }
            if (streams != null) {
                Util.closeQuietly(streams);
            }
            if (webSocketReader != null) {
                Util.closeQuietly(webSocketReader);
            }
        } finally {
            if (streams != null) {
                Util.closeQuietly(streams);
            }
            if (webSocketReader != null) {
                Util.closeQuietly(webSocketReader);
            }
            if (webSocketWriter != null) {
                Util.closeQuietly(webSocketWriter);
            }
        }
    }

    @Override // okhttp3.WebSocket
    public final boolean send(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        ByteString.Companion companion = ByteString.INSTANCE;
        return send(ByteString.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0), 1);
    }

    @Override // okhttp3.WebSocket
    public final boolean send(ByteString p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return send(p0, 2);
    }

    private final boolean send(ByteString p0, int p1) {
        synchronized (this) {
            if (!this.failed && !this.enqueuedClose) {
                if (this.queueSize + ((long) p0.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) > MAX_QUEUE_SIZE) {
                    close(1001, null);
                    return false;
                }
                this.queueSize += (long) p0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                this.messageAndCloseQueue.add(new Message(p1, p0));
                runWriter();
                return true;
            }
            return false;
        }
    }

    public final boolean pong(ByteString p0) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
                this.pongQueue.add(p0);
                runWriter();
                return true;
            }
            return false;
        }
    }

    @Override // okhttp3.WebSocket
    public final boolean close(int p0, String p1) {
        return close(p0, p1, CANCEL_AFTER_CLOSE_MILLIS);
    }

    public final boolean close(int p0, String p1, long p2) {
        ByteString byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        synchronized (this) {
            WebSocketProtocol.INSTANCE.validateCloseCode(p0);
            if (p1 != null) {
                ByteString.Companion companion = ByteString.INSTANCE;
                byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ByteString.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p1);
                if (byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3() > 123) {
                    StringBuilder sb = new StringBuilder("reason.size() > 123: ");
                    sb.append(p1);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            } else {
                byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
            }
            if (!this.failed && !this.enqueuedClose) {
                this.enqueuedClose = true;
                this.messageAndCloseQueue.add(new Close(p0, byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault1, p2));
                runWriter();
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Message;", "", "", "p0", "Lokio/ByteString;", "p1", "<init>", "(ILokio/ByteString;)V", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lokio/ByteString;", "getData", "()Lokio/ByteString;", "formatOpcode", "I", "getFormatOpcode", "()I"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Message {
        private final ByteString data;
        private final int formatOpcode;

        public Message(int i, ByteString byteString) {
            Intrinsics.checkNotNullParameter(byteString, "");
            this.formatOpcode = i;
            this.data = byteString;
        }

        public final int getFormatOpcode() {
            return this.formatOpcode;
        }

        public final ByteString getData() {
            return this.data;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Close;", "", "", "p0", "Lokio/ByteString;", "p1", "", "p2", "<init>", "(ILokio/ByteString;J)V", "cancelAfterCloseMillis", "J", "getCancelAfterCloseMillis", "()J", "code", "I", "getCode", "()I", "reason", "Lokio/ByteString;", "getReason", "()Lokio/ByteString;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Close {
        private final long cancelAfterCloseMillis;
        private final int code;
        private final ByteString reason;

        public Close(int i, ByteString byteString, long j) {
            this.code = i;
            this.reason = byteString;
            this.cancelAfterCloseMillis = j;
        }

        public final int getCode() {
            return this.code;
        }

        public final ByteString getReason() {
            return this.reason;
        }

        public final long getCancelAfterCloseMillis() {
            return this.cancelAfterCloseMillis;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b&\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Streams;", "Ljava/io/Closeable;", "", "p0", "LRotationProvider1;", "p1", "LRotationProviderListener;", "p2", "<init>", "(ZLRotationProvider1;LRotationProviderListener;)V", "client", "Z", "getClient", "()Z", "sink", "LRotationProviderListener;", "getSink", "()LRotationProviderListener;", "source", "LRotationProvider1;", "getSource", "()LRotationProvider1;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Streams implements Closeable {
        private final boolean client;
        private final RotationProviderListener sink;
        private final RotationProvider1 source;

        public Streams(boolean z, RotationProvider1 rotationProvider1, RotationProviderListener rotationProviderListener) {
            Intrinsics.checkNotNullParameter(rotationProvider1, "");
            Intrinsics.checkNotNullParameter(rotationProviderListener, "");
            this.client = z;
            this.source = rotationProvider1;
            this.sink = rotationProviderListener;
        }

        public final boolean getClient() {
            return this.client;
        }

        public final RotationProvider1 getSource() {
            return this.source;
        }

        public final RotationProviderListener getSink() {
            return this.sink;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$WriterTask;", "Lokhttp3/internal/concurrent/Task;", "<init>", "(Lokhttp3/internal/ws/RealWebSocket;)V", "", "runOnce", "()J"}, k = 1, mv = {1, 8, 0}, xi = 48)
    final class WriterTask extends Task {
        public WriterTask() {
            StringBuilder sb = new StringBuilder();
            sb.append(RealWebSocket.this.name);
            sb.append(" writer");
            super(sb.toString(), false, 2, null);
        }

        @Override // okhttp3.internal.concurrent.Task
        public final long runOnce() {
            try {
                return RealWebSocket.this.writeOneFrame$okhttp() ? 0L : -1L;
            } catch (IOException e2) {
                RealWebSocket.this.failWebSocket(e2, null);
                return -1L;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean writeOneFrame$okhttp() throws IOException {
        String str;
        Streams streams;
        Closeable closeable;
        Closeable closeable2;
        int i;
        ?? r0;
        ?? r1;
        synchronized (this) {
            boolean z = this.failed;
            if (z) {
                return false;
            }
            WebSocketWriter webSocketWriter = this.writer;
            ByteString byteStringPoll = this.pongQueue.poll();
            final boolean z2 = true;
            Object obj = null;
            if (byteStringPoll == null) {
                Object objPoll = this.messageAndCloseQueue.poll();
                if (objPoll instanceof Close) {
                    int i2 = this.receivedCloseCode;
                    str = this.receivedCloseReason;
                    if (i2 != -1) {
                        streams = this.streams;
                        this.streams = null;
                        closeable = this.reader;
                        this.reader = null;
                        closeable2 = this.writer;
                        this.writer = null;
                        this.taskQueue.shutdown();
                        r1 = i2;
                    } else {
                        long cancelAfterCloseMillis = ((Close) objPoll).getCancelAfterCloseMillis();
                        TaskQueue taskQueue = this.taskQueue;
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.name);
                        sb.append(" cancel");
                        final String string = sb.toString();
                        taskQueue.schedule(new Task(string, z2) { // from class: okhttp3.internal.ws.RealWebSocket$writeOneFrame$lambda$8$$inlined$execute$default$1
                            @Override // okhttp3.internal.concurrent.Task
                            public final long runOnce() {
                                this.cancel();
                                return -1L;
                            }
                        }, TimeUnit.MILLISECONDS.toNanos(cancelAfterCloseMillis));
                        streams = null;
                        r0 = i2;
                    }
                    obj = objPoll;
                    i = r1;
                } else {
                    if (objPoll == null) {
                        return false;
                    }
                    str = null;
                    streams = null;
                    r0 = z;
                }
                closeable = streams;
                closeable2 = closeable;
                r1 = r0;
                obj = objPoll;
                i = r1;
            } else {
                str = null;
                streams = null;
                closeable = null;
                closeable2 = null;
                i = z;
            }
            Unit unit = Unit.INSTANCE;
            try {
                if (byteStringPoll != null) {
                    Intrinsics.checkNotNull(webSocketWriter);
                    webSocketWriter.writePong(byteStringPoll);
                } else if (obj instanceof Message) {
                    Message message = (Message) obj;
                    Intrinsics.checkNotNull(webSocketWriter);
                    webSocketWriter.writeMessageFrame(message.getFormatOpcode(), message.getData());
                    synchronized (this) {
                        this.queueSize -= (long) message.getData().TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        Unit unit2 = Unit.INSTANCE;
                    }
                } else if (obj instanceof Close) {
                    Close close = (Close) obj;
                    Intrinsics.checkNotNull(webSocketWriter);
                    webSocketWriter.writeClose(close.getCode(), close.getReason());
                    if (streams != null) {
                        Intrinsics.checkNotNull(str);
                        this.listener.onClosed(this, i, str);
                    }
                } else {
                    throw new AssertionError();
                }
                if (streams != null) {
                    Util.closeQuietly(streams);
                }
                if (closeable != null) {
                    Util.closeQuietly(closeable);
                }
                if (closeable2 != null) {
                    Util.closeQuietly(closeable2);
                }
                return true;
            } catch (Throwable th) {
                if (streams != null) {
                    Util.closeQuietly(streams);
                }
                if (closeable != null) {
                    Util.closeQuietly(closeable);
                }
                if (closeable2 != null) {
                    Util.closeQuietly(closeable2);
                }
                throw th;
            }
        }
    }

    public final void writePingFrame$okhttp() {
        synchronized (this) {
            if (this.failed) {
                return;
            }
            WebSocketWriter webSocketWriter = this.writer;
            if (webSocketWriter == null) {
                return;
            }
            int i = this.awaitingPong ? this.sentPingCount : -1;
            this.sentPingCount++;
            this.awaitingPong = true;
            Unit unit = Unit.INSTANCE;
            if (i != -1) {
                StringBuilder sb = new StringBuilder("sent ping but didn't receive pong within ");
                sb.append(this.pingIntervalMillis);
                sb.append("ms (after ");
                sb.append(i - 1);
                sb.append(" successful ping/pongs)");
                failWebSocket(new SocketTimeoutException(sb.toString()), null);
                return;
            }
            try {
                webSocketWriter.writePing(ByteString.EMPTY);
            } catch (IOException e2) {
                failWebSocket(e2, null);
            }
        }
    }

    public final void failWebSocket(Exception p0, Response p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        synchronized (this) {
            if (this.failed) {
                return;
            }
            this.failed = true;
            Streams streams = this.streams;
            this.streams = null;
            WebSocketReader webSocketReader = this.reader;
            this.reader = null;
            WebSocketWriter webSocketWriter = this.writer;
            this.writer = null;
            this.taskQueue.shutdown();
            Unit unit = Unit.INSTANCE;
            try {
                this.listener.onFailure(this, p0, p1);
                if (streams != null) {
                    Util.closeQuietly(streams);
                }
                if (webSocketReader != null) {
                    Util.closeQuietly(webSocketReader);
                }
            } finally {
                if (streams != null) {
                    Util.closeQuietly(streams);
                }
                if (webSocketReader != null) {
                    Util.closeQuietly(webSocketReader);
                }
                if (webSocketWriter != null) {
                    Util.closeQuietly(webSocketWriter);
                }
            }
        }
    }

    private final void runWriter() {
        if (!Util.assertionsEnabled || Thread.holdsLock(this)) {
            Task task = this.writerTask;
            if (task != null) {
                TaskQueue.schedule$default(this.taskQueue, task, 0L, 2, null);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("Thread ");
        sb.append(Thread.currentThread().getName());
        sb.append(" MUST hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }
}
