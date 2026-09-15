package okhttp3.internal.http2;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.messaging.Constants;
import defpackage.RotationProvider1;
import defpackage.RotationProviderListener;
import defpackage.RotationProviderListenerWrapper;
import defpackage.SessionProcessor;
import defpackage.SurfaceViewImplementation;
import defpackage.initSession;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.platform.Platform;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u0097\u00012\u00020\u0001:\b\u0098\u0001\u0097\u0001\u0099\u0001\u009a\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ)\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\bJ\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0003\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00132\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\r\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010\u001d\u001a\u00020\u00142\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u000b\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001d\u0010\u001fJ\r\u0010 \u001a\u00020\u0013¢\u0006\u0004\b \u0010!J/\u0010$\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\"2\u0006\u0010\r\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0018H\u0000¢\u0006\u0004\b$\u0010%J-\u0010&\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00132\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\r\u001a\u00020\u0018H\u0000¢\u0006\u0004\b&\u0010'J%\u0010(\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00132\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0000¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b*\u0010+J-\u0010,\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00132\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\r\u001a\u00020\u0018H\u0007¢\u0006\u0004\b,\u0010\u001eJ\u0017\u0010-\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0013H\u0000¢\u0006\u0004\b-\u0010.J\u0019\u0010/\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0003\u001a\u00020\u0013H\u0000¢\u0006\u0004\b/\u0010\u0016J\u000f\u00100\u001a\u00020\u0006H\u0000¢\u0006\u0004\b0\u0010\bJ\u0015\u00102\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u000201¢\u0006\u0004\b2\u00103J\u0015\u00104\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b4\u00105J#\u00107\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u00182\b\b\u0002\u0010\u000b\u001a\u000206H\u0007¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0017H\u0000¢\u0006\u0004\b9\u0010:J/\u0010<\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u00182\b\u0010\r\u001a\u0004\u0018\u00010;2\u0006\u0010#\u001a\u00020\u0017¢\u0006\u0004\b<\u0010=J-\u0010>\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u00182\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0000¢\u0006\u0004\b>\u0010?J\r\u0010@\u001a\u00020\u0006¢\u0006\u0004\b@\u0010\bJ%\u0010@\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u0013¢\u0006\u0004\b@\u0010AJ\r\u0010B\u001a\u00020\u0006¢\u0006\u0004\bB\u0010\bJ\u001f\u0010C\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\bC\u0010+J\u001f\u0010D\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\bD\u0010+J\u001f\u0010E\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u0017H\u0000¢\u0006\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010I\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010HR\u001a\u0010J\u001a\u00020\u00188\u0001X\u0080\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001a\u0010O\u001a\u00020N8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00130S8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010V\u001a\u00020\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bV\u0010HR\u0016\u0010W\u001a\u00020\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bW\u0010HR\u0016\u0010X\u001a\u00020\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bX\u0010HR\u0016\u0010Y\u001a\u00020\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bY\u0010HR\u0016\u0010Z\u001a\u00020\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bZ\u0010HR\u0016\u0010[\u001a\u00020\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b[\u0010KR\"\u0010\\\u001a\u00020\u00138\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010!\"\u0004\b_\u0010`R\u001a\u0010b\u001a\u00020a8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\"\u0010f\u001a\u00020\u00138\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bf\u0010]\u001a\u0004\bg\u0010!\"\u0004\bh\u0010`R\u001a\u0010i\u001a\u0002018\u0007X\u0087\u0004¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\"\u0010m\u001a\u0002018\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bm\u0010j\u001a\u0004\bn\u0010l\"\u0004\bo\u00103R\u0014\u0010q\u001a\u00020p8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010t\u001a\u00020s8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bt\u0010uR$\u0010v\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00178\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\bv\u0010H\u001a\u0004\bw\u0010xR$\u0010y\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00178\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\by\u0010H\u001a\u0004\bz\u0010xR\u001e\u0010|\u001a\u00060{R\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007fR\u0016\u0010\u0080\u0001\u001a\u00020s8\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010uR \u0010\u0082\u0001\u001a\u00030\u0081\u00018\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R,\u0010\u0087\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0086\u00018\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0017\u0010\u008b\u0001\u001a\u0002068\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R'\u0010\u008d\u0001\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00178\u0007@BX\u0087\u000e¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010H\u001a\u0005\b\u008e\u0001\u0010xR'\u0010\u008f\u0001\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00178\u0007@BX\u0087\u000e¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010H\u001a\u0005\b\u0090\u0001\u0010xR \u0010\u0092\u0001\u001a\u00030\u0091\u00018\u0007X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0016\u0010\u0096\u0001\u001a\u00020s8\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010u"}, d2 = {"Lokhttp3/internal/http2/Http2Connection;", "Ljava/io/Closeable;", "Lokhttp3/internal/http2/Http2Connection$Builder;", "p0", "<init>", "(Lokhttp3/internal/http2/Http2Connection$Builder;)V", "", "awaitPong", "()V", "close", "Lokhttp3/internal/http2/ErrorCode;", "p1", "Ljava/io/IOException;", "p2", "close$okhttp", "(Lokhttp3/internal/http2/ErrorCode;Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)V", "failConnection", "(Ljava/io/IOException;)V", "flush", "", "Lokhttp3/internal/http2/Http2Stream;", "getStream", "(I)Lokhttp3/internal/http2/Http2Stream;", "", "", "isHealthy", "(J)Z", "", "Lokhttp3/internal/http2/Header;", "newStream", "(ILjava/util/List;Z)Lokhttp3/internal/http2/Http2Stream;", "(Ljava/util/List;Z)Lokhttp3/internal/http2/Http2Stream;", "openStreamCount", "()I", "LRotationProvider1;", "p3", "pushDataLater$okhttp", "(ILRotationProvider1;IZ)V", "pushHeadersLater$okhttp", "(ILjava/util/List;Z)V", "pushRequestLater$okhttp", "(ILjava/util/List;)V", "pushResetLater$okhttp", "(ILokhttp3/internal/http2/ErrorCode;)V", "pushStream", "pushedStream$okhttp", "(I)Z", "removeStream$okhttp", "sendDegradedPingLater$okhttp", "Lokhttp3/internal/http2/Settings;", "setSettings", "(Lokhttp3/internal/http2/Settings;)V", "shutdown", "(Lokhttp3/internal/http2/ErrorCode;)V", "Lokhttp3/internal/concurrent/TaskRunner;", "start", "(ZLokhttp3/internal/concurrent/TaskRunner;)V", "updateConnectionFlowControl$okhttp", "(J)V", "LRotationProviderListenerWrapper;", "writeData", "(IZLRotationProviderListenerWrapper;J)V", "writeHeaders$okhttp", "(IZLjava/util/List;)V", "writePing", "(ZII)V", "writePingAndAwaitPong", "writeSynReset$okhttp", "writeSynResetLater$okhttp", "writeWindowUpdateLater$okhttp", "(IJ)V", "awaitPingsSent", "J", "awaitPongsReceived", "client", "Z", "getClient$okhttp", "()Z", "", "connectionName", "Ljava/lang/String;", "getConnectionName$okhttp", "()Ljava/lang/String;", "", "currentPushRequests", "Ljava/util/Set;", "degradedPingsSent", "degradedPongDeadlineNs", "degradedPongsReceived", "intervalPingsSent", "intervalPongsReceived", "isShutdown", "lastGoodStreamId", "I", "getLastGoodStreamId$okhttp", "setLastGoodStreamId$okhttp", "(I)V", "Lokhttp3/internal/http2/Http2Connection$Listener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lokhttp3/internal/http2/Http2Connection$Listener;", "getListener$okhttp", "()Lokhttp3/internal/http2/Http2Connection$Listener;", "nextStreamId", "getNextStreamId$okhttp", "setNextStreamId$okhttp", "okHttpSettings", "Lokhttp3/internal/http2/Settings;", "getOkHttpSettings", "()Lokhttp3/internal/http2/Settings;", "peerSettings", "getPeerSettings", "setPeerSettings", "Lokhttp3/internal/http2/PushObserver;", "pushObserver", "Lokhttp3/internal/http2/PushObserver;", "Lokhttp3/internal/concurrent/TaskQueue;", "pushQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "readBytesAcknowledged", "getReadBytesAcknowledged", "()J", "readBytesTotal", "getReadBytesTotal", "Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "readerRunnable", "Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "getReaderRunnable", "()Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "settingsListenerQueue", "Ljava/net/Socket;", "socket", "Ljava/net/Socket;", "getSocket$okhttp", "()Ljava/net/Socket;", "", "streams", "Ljava/util/Map;", "getStreams$okhttp", "()Ljava/util/Map;", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "writeBytesMaximum", "getWriteBytesMaximum", "writeBytesTotal", "getWriteBytesTotal", "Lokhttp3/internal/http2/Http2Writer;", "writer", "Lokhttp3/internal/http2/Http2Writer;", "getWriter", "()Lokhttp3/internal/http2/Http2Writer;", "writerQueue", "Companion", "Builder", "Listener", "ReaderRunnable"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Http2Connection implements Closeable {
    public static final int AWAIT_PING = 3;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Settings DEFAULT_SETTINGS;
    public static final int DEGRADED_PING = 2;
    public static final int DEGRADED_PONG_TIMEOUT_NS = 1000000000;
    public static final int INTERVAL_PING = 1;
    public static final int OKHTTP_CLIENT_WINDOW_SIZE = 16777216;
    private long awaitPingsSent;
    private long awaitPongsReceived;
    private final boolean client;
    private final String connectionName;
    private final Set<Integer> currentPushRequests;
    private long degradedPingsSent;
    private long degradedPongDeadlineNs;
    private long degradedPongsReceived;
    private long intervalPingsSent;
    private long intervalPongsReceived;
    private boolean isShutdown;
    private int lastGoodStreamId;
    private final Listener listener;
    private int nextStreamId;
    private final Settings okHttpSettings;
    private Settings peerSettings;
    private final PushObserver pushObserver;
    private final TaskQueue pushQueue;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    private final ReaderRunnable readerRunnable;
    private final TaskQueue settingsListenerQueue;
    private final Socket socket;
    private final Map<Integer, Http2Stream> streams;
    private final TaskRunner taskRunner;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final Http2Writer writer;
    private final TaskQueue writerQueue;

    public final boolean pushedStream$okhttp(int p0) {
        return p0 != 0 && (p0 & 1) == 0;
    }

    public Http2Connection(Builder builder) throws Throwable {
        Intrinsics.checkNotNullParameter(builder, "");
        boolean client$okhttp = builder.getClient$okhttp();
        this.client = client$okhttp;
        this.listener = builder.getListener$okhttp();
        this.streams = new LinkedHashMap();
        String connectionName$okhttp = builder.getConnectionName$okhttp();
        this.connectionName = connectionName$okhttp;
        this.nextStreamId = builder.getClient$okhttp() ? 3 : 2;
        TaskRunner taskRunner$okhttp = builder.getTaskRunner$okhttp();
        this.taskRunner = taskRunner$okhttp;
        TaskQueue taskQueueNewQueue = taskRunner$okhttp.newQueue();
        this.writerQueue = taskQueueNewQueue;
        this.pushQueue = taskRunner$okhttp.newQueue();
        this.settingsListenerQueue = taskRunner$okhttp.newQueue();
        this.pushObserver = builder.getPushObserver$okhttp();
        Settings settings = new Settings();
        if (builder.getClient$okhttp()) {
            settings.set(7, 16777216);
        }
        this.okHttpSettings = settings;
        Settings settings2 = DEFAULT_SETTINGS;
        this.peerSettings = settings2;
        this.writeBytesMaximum = settings2.getInitialWindowSize();
        this.socket = builder.getSocket$okhttp();
        this.writer = new Http2Writer(builder.getSink$okhttp(), client$okhttp);
        this.readerRunnable = new ReaderRunnable(this, new Http2Reader(builder.getSource$okhttp(), client$okhttp));
        this.currentPushRequests = new LinkedHashSet();
        if (builder.getPingIntervalMillis$okhttp() != 0) {
            final long nanos = TimeUnit.MILLISECONDS.toNanos(builder.getPingIntervalMillis$okhttp());
            StringBuilder sb = new StringBuilder();
            sb.append(connectionName$okhttp);
            sb.append(" ping");
            final String string = sb.toString();
            taskQueueNewQueue.schedule(new Task(string) { // from class: okhttp3.internal.http2.Http2Connection$special$$inlined$schedule$1
                @Override // okhttp3.internal.concurrent.Task
                public final long runOnce() {
                    boolean z;
                    synchronized (this) {
                        if (this.intervalPongsReceived < this.intervalPingsSent) {
                            z = true;
                        } else {
                            this.intervalPingsSent++;
                            z = false;
                        }
                    }
                    if (z) {
                        this.failConnection(null);
                        return -1L;
                    }
                    this.writePing(false, 1, 0);
                    return nanos;
                }
            }, nanos);
        }
    }

    /* JADX INFO: renamed from: getClient$okhttp, reason: from getter */
    public final boolean getClient() {
        return this.client;
    }

    /* JADX INFO: renamed from: getListener$okhttp, reason: from getter */
    public final Listener getListener() {
        return this.listener;
    }

    public final Map<Integer, Http2Stream> getStreams$okhttp() {
        return this.streams;
    }

    /* JADX INFO: renamed from: getConnectionName$okhttp, reason: from getter */
    public final String getConnectionName() {
        return this.connectionName;
    }

    /* JADX INFO: renamed from: getLastGoodStreamId$okhttp, reason: from getter */
    public final int getLastGoodStreamId() {
        return this.lastGoodStreamId;
    }

    public final void setLastGoodStreamId$okhttp(int i) {
        this.lastGoodStreamId = i;
    }

    /* JADX INFO: renamed from: getNextStreamId$okhttp, reason: from getter */
    public final int getNextStreamId() {
        return this.nextStreamId;
    }

    public final void setNextStreamId$okhttp(int i) {
        this.nextStreamId = i;
    }

    public final Settings getOkHttpSettings() {
        return this.okHttpSettings;
    }

    public final Settings getPeerSettings() {
        return this.peerSettings;
    }

    public final void setPeerSettings(Settings settings) {
        Intrinsics.checkNotNullParameter(settings, "");
        this.peerSettings = settings;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b3\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J5\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00142\b\b\u0002\u0010\u0005\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\u00020\u00028\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\"\u001a\u00020\u00158\u0001@\u0001X\u0081.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010\f\u001a\u00020\u000b8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\f\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010\u000f\u001a\u00020\u000e8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010\u0012\u001a\u00020\u00118\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0012\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u00107\u001a\u00020\u00188\u0001@\u0001X\u0081.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010\u001a\u001a\u00020\u00148\u0001@\u0001X\u0081.¢\u0006\u0012\n\u0004\b\u001a\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010B\u001a\u00020\u00168\u0001@\u0001X\u0081.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001a\u0010H\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Builder;", "", "", "p0", "Lokhttp3/internal/concurrent/TaskRunner;", "p1", "<init>", "(ZLokhttp3/internal/concurrent/TaskRunner;)V", "Lokhttp3/internal/http2/Http2Connection;", "build", "()Lokhttp3/internal/http2/Http2Connection;", "Lokhttp3/internal/http2/Http2Connection$Listener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "(Lokhttp3/internal/http2/Http2Connection$Listener;)Lokhttp3/internal/http2/Http2Connection$Builder;", "", "pingIntervalMillis", "(I)Lokhttp3/internal/http2/Http2Connection$Builder;", "Lokhttp3/internal/http2/PushObserver;", "pushObserver", "(Lokhttp3/internal/http2/PushObserver;)Lokhttp3/internal/http2/Http2Connection$Builder;", "Ljava/net/Socket;", "", "LRotationProvider1;", "p2", "LRotationProviderListener;", "p3", "socket", "(Ljava/net/Socket;Ljava/lang/String;LRotationProvider1;LRotationProviderListener;)Lokhttp3/internal/http2/Http2Connection$Builder;", "client", "Z", "getClient$okhttp", "()Z", "setClient$okhttp", "(Z)V", "connectionName", "Ljava/lang/String;", "getConnectionName$okhttp", "()Ljava/lang/String;", "setConnectionName$okhttp", "(Ljava/lang/String;)V", "Lokhttp3/internal/http2/Http2Connection$Listener;", "getListener$okhttp", "()Lokhttp3/internal/http2/Http2Connection$Listener;", "setListener$okhttp", "(Lokhttp3/internal/http2/Http2Connection$Listener;)V", "I", "getPingIntervalMillis$okhttp", "()I", "setPingIntervalMillis$okhttp", "(I)V", "Lokhttp3/internal/http2/PushObserver;", "getPushObserver$okhttp", "()Lokhttp3/internal/http2/PushObserver;", "setPushObserver$okhttp", "(Lokhttp3/internal/http2/PushObserver;)V", "sink", "LRotationProviderListener;", "getSink$okhttp", "()LRotationProviderListener;", "setSink$okhttp", "(LRotationProviderListener;)V", "Ljava/net/Socket;", "getSocket$okhttp", "()Ljava/net/Socket;", "setSocket$okhttp", "(Ljava/net/Socket;)V", "source", "LRotationProvider1;", "getSource$okhttp", "()LRotationProvider1;", "setSource$okhttp", "(LRotationProvider1;)V", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "getTaskRunner$okhttp", "()Lokhttp3/internal/concurrent/TaskRunner;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private boolean client;
        public String connectionName;
        private Listener listener;
        private int pingIntervalMillis;
        private PushObserver pushObserver;
        public RotationProviderListener sink;
        public Socket socket;
        public RotationProvider1 source;
        private final TaskRunner taskRunner;
        private static final byte[] $$c = {14, 116, 92, -78};
        private static final int $$f = 53;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {68, 104, -93, -37, -2, 21, -2, 11, 6, 23, 8, -28, 46, 11, 14, 8, -24, 43, 6, -3, 4, 11, 11, -42, 56, 22, -1, 23, 6, 3, 4, 29, -12, 7, 21, 1, 22, -8, 11, 21, 12, -4, 20, 11, 6, -3, 11, 23, 9, -1, 14, 2, -26, 42, 10, 4, 29, 0, 17, -24, 43, 6, -3, 4, 11, 11, -12, 43, 6, -3, 11, 23, 9, 5, 12, 42, -3, 20, -2, 15, 8, -21, 26, 33, -3, 1, 18, 15, -37, 53, -8, 15, 15, 1, 18, 15, -9, 16, 14, -1, 14, 14, 2, -21, 46, 1, 15, -2, 28, -6, 22, -56};
        private static final int $$e = 112;
        private static final byte[] $$a = {31, -3, -46, 11, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
        private static final int $$b = 109;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        private static int b = 1;
        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -7890370909907199456L;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -981105359;
        private static char TuitionPaymentFragmentbindingInflater1 = 34097;

        private static void a(byte b2, int i, short s, Object[] objArr) {
            byte[] bArr = $$a;
            int i2 = 55 - (s * 52);
            int i3 = 98 - (i * 14);
            byte[] bArr2 = new byte[53 - b2];
            int i4 = 52 - b2;
            int i5 = -1;
            if (bArr == null) {
                i3 = (i3 + i2) - 10;
                i2 = i2;
                i5 = -1;
            }
            while (true) {
                int i6 = i5 + 1;
                bArr2[i6] = (byte) i3;
                int i7 = i2 + 1;
                if (i6 == i4) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                } else {
                    i3 = (i3 + bArr[i7]) - 10;
                    i2 = i7;
                    i5 = i6;
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void d(byte r6, byte r7, int r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = okhttp3.internal.http2.Http2Connection.Builder.$$d
                int r8 = r8 * 34
                int r8 = 72 - r8
                int r6 = r6 * 71
                int r6 = 74 - r6
                int r7 = r7 * 24
                int r7 = 108 - r7
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L17
                r7 = r6
                r3 = r8
                r4 = r2
                goto L30
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r7
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r8) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L27:
                int r6 = r6 + 1
                r4 = r0[r6]
                r5 = r7
                r7 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L30:
                int r3 = r3 + r6
                int r6 = r3 + (-9)
                r3 = r4
                r5 = r7
                r7 = r6
                r6 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.Builder.d(byte, byte, int, java.lang.Object[]):void");
        }

        private static void c(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            SessionProcessor sessionProcessor = new SessionProcessor();
            int length = cArr2.length;
            char[] cArr4 = new char[length];
            int length2 = cArr.length;
            char[] cArr5 = new char[length2];
            System.arraycopy(cArr2, 0, cArr4, 0, length);
            System.arraycopy(cArr, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr3.length;
            char[] cArr6 = new char[length3];
            sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            int i3 = $10 + 99;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
                try {
                    Object[] objArr2 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getTouchSlop() >> 8) + 8328), Color.red(0) + 1235, AndroidCharacter.getMirror('0') - '\r', -653973969, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 2;
                        byte b5 = (byte) (b4 - 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 2764 - (ViewConfiguration.getWindowTouchSlop() >> 8), Gravity.getAbsoluteGravity(0, 0) + 14, 1504416861, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - (ViewConfiguration.getFadingEdgeLength() >> 16)), (Process.myPid() >> 22) + 253, Color.red(0) + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cBlue = (char) (65200 - Color.blue(0));
                        int i5 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2890;
                        int iIndexOf = 17 - TextUtils.indexOf("", "");
                        byte b6 = (byte) ($$f & 3);
                        byte b7 = (byte) (-b6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cBlue, i5, iIndexOf, 2012627446, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = sessionProcessor.b;
                    cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ (-6377398940819159759L)))));
                    sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                    int i6 = $11 + 93;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArr6);
            int i8 = $10 + 87;
            $11 = i8 % 128;
            int i9 = i8 % 2;
        }

        public Builder(boolean z, TaskRunner taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "");
            this.client = z;
            this.taskRunner = taskRunner;
            this.listener = Listener.REFUSE_INCOMING_STREAMS;
            this.pushObserver = PushObserver.CANCEL;
        }

        public final boolean getClient$okhttp() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 + 61;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            boolean z = this.client;
            int i5 = i2 + 59;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        public final void setClient$okhttp(boolean z) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 + 21;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            this.client = z;
            if (i4 != 0) {
                int i5 = 9 / 0;
            }
            int i6 = i2 + 41;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 85 / 0;
            }
        }

        public final TaskRunner getTaskRunner$okhttp() {
            TaskRunner taskRunner;
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
            int i3 = i2 % 128;
            b = i3;
            if (i2 % 2 == 0) {
                taskRunner = this.taskRunner;
                int i4 = 98 / 0;
            } else {
                taskRunner = this.taskRunner;
            }
            int i5 = i3 + 107;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            return taskRunner;
        }

        public final Socket getSocket$okhttp() {
            int i = 2 % 2;
            Socket socket = this.socket;
            if (socket == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                return null;
            }
            int i2 = b + 101;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 91;
            b = i5 % 128;
            int i6 = i5 % 2;
            return socket;
        }

        public final void setSocket$okhttp(Socket socket) {
            int i = 2 % 2;
            int i2 = b + 21;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(socket, "");
                this.socket = socket;
            } else {
                Intrinsics.checkNotNullParameter(socket, "");
                this.socket = socket;
                throw null;
            }
        }

        /* JADX WARN: Code duplicated, block: B:26:0x026b  */
        public final String getConnectionName$okhttp() throws Throwable {
            Object[] objArr;
            Object[] objArr2;
            int i = 2 % 2;
            int i2 = b + 17;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 31533);
                int iLastIndexOf = 920 - TextUtils.lastIndexOf("", '0', 0);
                int i4 = 29 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                byte[] bArr = $$a;
                Object[] objArr3 = new Object[1];
                a((byte) 52, bArr[80], bArr[37], objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(minimumFlingVelocity, iLastIndexOf, i4, -1048449946, false, (String) objArr3[0], null);
            }
            Object obj = null;
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr4 = new Object[1];
            c(new char[]{24337, 42338, 10245, 13569}, new char[]{51808, 7301, 34294, 59577}, (char) Color.blue(0), ViewConfiguration.getKeyRepeatDelay() >> 16, new char[]{22846, 12045, 8875, 35141, 56254, 62424, 37077, 52387, 22182, 17356, 37976, 57120, 57710, 28474, 25632, 63562, 47222, 14249, 40696, 12165, 55699, 55425}, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            c(new char[]{24337, 42338, 10245, 13569}, new char[]{5550, 18081, 5976, 39628}, (char) (52247 - Color.red(0)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1481023765, new char[]{28895, 31332, 46681, 13512, '(', 56645, 40503, 22725, 54873, 36441, 37865, 1352, 19795, 60105, 10195}, objArr5);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 31533);
                int iLastIndexOf2 = 920 - TextUtils.lastIndexOf("", '0', 0);
                int iNormalizeMetaState = 28 - KeyEvent.normalizeMetaState(0);
                byte[] bArr2 = $$a;
                byte b2 = bArr2[80];
                byte b3 = bArr2[37];
                Object[] objArr6 = new Object[1];
                a(b2, b3, b3, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maximumFlingVelocity, iLastIndexOf2, iNormalizeMetaState, -778300370, false, (String) objArr6[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char minimumFlingVelocity2 = (char) (31533 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 922;
                    int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 28;
                    byte[] bArr3 = $$a;
                    Object[] objArr7 = new Object[1];
                    a(bArr3[33], bArr3[37], bArr3[80], objArr7);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(minimumFlingVelocity2, packedPositionChild, windowTouchSlop, -1142834547, false, (String) objArr7[0], null);
                }
                Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
                int iMyTid = Process.myTid();
                int i5 = ~iMyTid;
                int i6 = ((((-1104300746) + ((244014069 | i5) * (-757))) + ((~((-1362141187) | iMyTid)) * 1514)) + (((~(iMyTid | 1606155255)) | ((~(i5 | (-1530065575))) | 167924388)) * 757)) - 1968172487;
                int i7 = (i6 << 13) ^ i6;
                int i8 = i7 ^ (i7 >>> 17);
                ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
            } else {
                Object[] objArr9 = new Object[1];
                c(new char[]{24337, 42338, 10245, 13569}, new char[]{26405, 11663, 34603, 57057}, (char) (57735 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), TextUtils.indexOf((CharSequence) "", '0', 0) + 1, new char[]{16616, 32617, 65337, 42416, 20554, 20365, 20338, 'I', 60070, 12632, 52338, 33220, 221, 13581, 50742, 4335, 2248, 21874, 3596, 34636, 27022, 45713, 26240, 20269, 13358, 13982}, objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[0]);
                Object[] objArr10 = new Object[1];
                c(new char[]{24337, 42338, 10245, 13569}, new char[]{52966, 16508, 50010, 19242}, (char) (Color.green(0) + 10947), ViewConfiguration.getTouchSlop() >> 8, new char[]{54723, 61979, 62650, 37311, 2595, 54744, 2441, 2616, 18560, 1161, 40694, 21031, 14919, 16406, 18276, 4533, 43795, 20783}, objArr10);
                Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    if (applicationContext instanceof ContextWrapper) {
                        int i9 = b + 53;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
                        if (i9 % 2 != 0) {
                            ((ContextWrapper) applicationContext).getBaseContext();
                            obj.hashCode();
                            throw null;
                        }
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = applicationContext.getApplicationContext();
                            int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
                            b = i10 % 128;
                            int i11 = i10 % 2;
                        } else {
                            applicationContext = null;
                        }
                    } else {
                        applicationContext = applicationContext.getApplicationContext();
                        int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
                        b = i12 % 128;
                        int i13 = i12 % 2;
                    }
                }
                Object[] objArr11 = new Object[1];
                c(new char[]{24337, 42338, 10245, 13569}, new char[]{19001, 65086, 63202, 4013}, (char) (44534 - TextUtils.indexOf("", "")), TextUtils.getOffsetAfter("", 0), new char[]{35370, 33236, 59824, 57579, 12639, 53428, 48633, 23772, 19801, 46670, 19585, 13206, 296, 59839, 15917, 37120}, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                Object[] objArr12 = new Object[1];
                c(new char[]{24337, 42338, 10245, 13569}, new char[]{62105, 47755, 33644, 16195}, (char) (Drawable.resolveOpacity(0, 0) + 17283), TextUtils.indexOf("", ""), new char[]{46627, 53989, 45466, 58020, 48461, 7733, 20437, 58121, 24832, 27053, 27862, 9579, 7444, 16566, 57252, 5710}, objArr12);
                try {
                    Object[] objArr13 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue()), 0, -1968172487};
                    byte[] bArr4 = $$d;
                    byte b4 = bArr4[35];
                    byte b5 = bArr4[57];
                    Object[] objArr14 = new Object[1];
                    d(b4, b5, b5, objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    byte b6 = bArr4[57];
                    byte b7 = bArr4[35];
                    Object[] objArr15 = new Object[1];
                    d(b6, b7, b7, objArr15);
                    Object[] objArr16 = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c = (char) (31533 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                        int mode = 921 - View.MeasureSpec.getMode(0);
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 29;
                        byte[] bArr5 = $$a;
                        Object[] objArr17 = new Object[1];
                        a(bArr5[33], bArr5[37], bArr5[80], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, mode, iIndexOf, -1142834547, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr16);
                    try {
                        Object[] objArr18 = new Object[1];
                        c(new char[]{24337, 42338, 10245, 13569}, new char[]{51808, 7301, 34294, 59577}, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), TextUtils.getOffsetBefore("", 0), new char[]{22846, 12045, 8875, 35141, 56254, 62424, 37077, 52387, 22182, 17356, 37976, 57120, 57710, 28474, 25632, 63562, 47222, 14249, 40696, 12165, 55699, 55425}, objArr18);
                        Class<?> cls5 = Class.forName((String) objArr18[0]);
                        Object[] objArr19 = new Object[1];
                        c(new char[]{24337, 42338, 10245, 13569}, new char[]{5550, 18081, 5976, 39628}, (char) (52248 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), Drawable.resolveOpacity(0, 0) + 1481023765, new char[]{28895, 31332, 46681, 13512, '(', 56645, 40503, 22725, 54873, 36441, 37865, 1352, 19795, 60105, 10195}, objArr19);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cKeyCodeFromString = (char) (31533 - KeyEvent.keyCodeFromString(""));
                            int doubleTapTimeout = 921 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 29;
                            byte[] bArr6 = $$a;
                            byte b8 = bArr6[80];
                            byte b9 = bArr6[37];
                            Object[] objArr20 = new Object[1];
                            a(b8, b9, b9, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cKeyCodeFromString, doubleTapTimeout, bitsPerPixel, -778300370, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cIndexOf = (char) (TextUtils.indexOf("", "", 0, 0) + 31533);
                            int i14 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 920;
                            int doubleTapTimeout2 = 28 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            byte[] bArr7 = $$a;
                            Object[] objArr21 = new Object[1];
                            a((byte) 52, bArr7[80], bArr7[37], objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, i14, doubleTapTimeout2, -1048449946, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        objArr = objArr16;
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int i15 = ((int[]) objArr[1])[0];
            int i16 = ((int[]) objArr[3])[0];
            if (i16 == i15) {
                int i17 = b + 15;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17 % 128;
                int i18 = i17 % 2;
                int i19 = ((int[]) objArr[0])[0];
                objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i20 = i19 + (((1860822554 + (((-269484121) | iIdentityHashCode) * (-381))) + (((~((~iIdentityHashCode) | 1332432419)) | (-1429753436)) * 381)) - 405765384);
                int i21 = (i20 << 13) ^ i20;
                int i22 = i21 ^ (i21 >>> 17);
                ((int[]) objArr2[0])[0] = i22 ^ (i22 << 5);
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[4];
                if (strArr != null) {
                    for (String str : strArr) {
                        arrayList.add(str);
                    }
                }
                int[] iArr = new int[i16];
                int i23 = i16 - 1;
                iArr[i23] = 1;
                Toast.makeText((Context) null, iArr[((i16 * i23) % 2) - 1], 1).show();
                int i24 = ((int[]) objArr[0])[0];
                objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                int i25 = (int) Runtime.getRuntime().totalMemory();
                int i26 = ~i25;
                int i27 = i24 + 1853646832 + (((~(i26 | 1475416596)) | (-1476214424) | (~((-297865221) | i25))) * 717) + (((~(i25 | 1475416596)) | (~(i26 | (-297865221))) | (-1476214424)) * 717);
                int i28 = (i27 << 13) ^ i27;
                int i29 = i28 ^ (i28 >>> 17);
                ((int[]) objArr2[0])[0] = i29 ^ (i29 << 5);
            }
            String str2 = this.connectionName;
            if (str2 != null) {
                int i30 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
                b = i30 % 128;
                int i31 = i30 % 2;
                return str2;
            }
            int i32 = ((int[]) objArr2[0])[0];
            int i33 = i32 * i32;
            int i34 = -(1569396785 * i32);
            int i35 = (i33 ^ i34) + ((i33 & i34) << 1);
            int i36 = -(i32 * 554023505);
            int i37 = (i35 & i36) + (i36 | i35);
            int i38 = (i37 ^ 1574331009) + ((1574331009 & i37) << 1);
            int i39 = i38 >> 25;
            int i40 = (((i39 ^ (-255)) + ((i39 & (-255)) << 1)) / 128) + 1;
            int i41 = (i38 & i40) + (i40 | i38);
            int i42 = ((i38 >> 24) - 511) / 256;
            int i43 = (-(i41 ^ (((i42 | 1) << 1) - (i42 ^ 1)))) + 4;
            Intrinsics.throwUninitializedPropertyAccessException("3,7,31,3,3,connectionName".substring(87472 / ((i43 & (-((((i43 >> 20) - 8191) / 4096) + 2))) * 1988)));
            return null;
        }

        public final void setConnectionName$okhttp(String str) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
            b = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                this.connectionName = str;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(str, "");
            this.connectionName = str;
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
            b = i3 % 128;
            int i4 = i3 % 2;
        }

        public final RotationProvider1 getSource$okhttp() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i3 = i2 + 71;
            b = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            RotationProvider1 rotationProvider1 = this.source;
            if (rotationProvider1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                return null;
            }
            int i4 = i2 + 49;
            b = i4 % 128;
            int i5 = i4 % 2;
            return rotationProvider1;
        }

        public final void setSource$okhttp(RotationProvider1 rotationProvider1) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
            b = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(rotationProvider1, "");
                this.source = rotationProvider1;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(rotationProvider1, "");
            this.source = rotationProvider1;
            int i3 = b + 111;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
        }

        public final RotationProviderListener getSink$okhttp() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
            int i3 = i2 % 128;
            b = i3;
            int i4 = i2 % 2;
            RotationProviderListener rotationProviderListener = this.sink;
            Object obj = null;
            if (rotationProviderListener == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                return null;
            }
            int i5 = i3 + 95;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 == 0) {
                return rotationProviderListener;
            }
            obj.hashCode();
            throw null;
        }

        public final void setSink$okhttp(RotationProviderListener rotationProviderListener) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
            b = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(rotationProviderListener, "");
            this.sink = rotationProviderListener;
            int i4 = b + 23;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
        }

        public final Listener getListener$okhttp() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 + 63;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            Listener listener = this.listener;
            int i5 = i2 + 5;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 == 0) {
                return listener;
            }
            throw null;
        }

        public final void setListener$okhttp(Listener listener) {
            int i = 2 % 2;
            int i2 = b + 85;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(listener, "");
                this.listener = listener;
                throw null;
            }
            Intrinsics.checkNotNullParameter(listener, "");
            this.listener = listener;
            int i3 = b + 115;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }

        public final PushObserver getPushObserver$okhttp() {
            int i = 2 % 2;
            int i2 = b + 77;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 == 0) {
                return this.pushObserver;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void setPushObserver$okhttp(PushObserver pushObserver) {
            int i = 2 % 2;
            int i2 = b + 85;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(pushObserver, "");
            this.pushObserver = pushObserver;
            int i4 = b + 85;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        public final int getPingIntervalMillis$okhttp() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i3 = i2 + 41;
            b = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.pingIntervalMillis;
            int i6 = i2 + 123;
            b = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        public final void setPingIntervalMillis$okhttp(int i) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 + 117;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            this.pingIntervalMillis = i;
            if (i5 != 0) {
                throw null;
            }
            int i6 = i3 + 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
        }

        public static /* synthetic */ Builder socket$default(Builder builder, Socket socket, String str, RotationProvider1 rotationProvider1, RotationProviderListener rotationProviderListener, int i, Object obj) throws IOException {
            int i2 = 2 % 2;
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
            b = i3 % 128;
            if (i3 % 2 != 0 ? (i & 2) != 0 : (i & 2) != 0) {
                str = Util.peerName(socket);
            }
            if ((i & 4) != 0) {
                rotationProvider1 = SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault1(socket));
            }
            if ((i & 8) != 0) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
                b = i4 % 128;
                int i5 = i4 % 2;
                rotationProviderListener = SurfaceViewImplementation.TuitionPaymentFragmentbindingInflater1(SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(socket));
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
                b = i6 % 128;
                int i7 = i6 % 2;
            }
            return builder.socket(socket, str, rotationProvider1, rotationProviderListener);
        }

        public final Builder socket(Socket p0, String p1, RotationProvider1 p2, RotationProviderListener p3) throws IOException {
            String strConcat;
            int i = 2 % 2;
            int i2 = b + 49;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(p0, "");
                Intrinsics.checkNotNullParameter(p1, "");
                Intrinsics.checkNotNullParameter(p2, "");
                Intrinsics.checkNotNullParameter(p3, "");
                setSocket$okhttp(p0);
                throw null;
            }
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intrinsics.checkNotNullParameter(p2, "");
            Intrinsics.checkNotNullParameter(p3, "");
            setSocket$okhttp(p0);
            if (this.client) {
                StringBuilder sb = new StringBuilder();
                sb.append(Util.okHttpName);
                sb.append(' ');
                sb.append(p1);
                strConcat = sb.toString();
            } else {
                strConcat = "MockWebServer ".concat(String.valueOf(p1));
            }
            setConnectionName$okhttp(strConcat);
            setSource$okhttp(p2);
            setSink$okhttp(p3);
            int i3 = b + 19;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            return this;
        }

        public final Builder listener(Listener p0) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
            b = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(p0, "");
                this.listener = p0;
                throw null;
            }
            Intrinsics.checkNotNullParameter(p0, "");
            this.listener = p0;
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
            b = i3 % 128;
            if (i3 % 2 != 0) {
                return this;
            }
            obj.hashCode();
            throw null;
        }

        public final Builder pushObserver(PushObserver p0) {
            int i = 2 % 2;
            int i2 = b + 111;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(p0, "");
            this.pushObserver = p0;
            int i4 = b + 31;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        public final Builder pingIntervalMillis(int p0) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
            b = i2 % 128;
            if (i2 % 2 != 0) {
                this.pingIntervalMillis = p0;
                return this;
            }
            this.pingIntervalMillis = p0;
            throw null;
        }

        public final Http2Connection build() {
            int i = 2 % 2;
            Http2Connection http2Connection = new Http2Connection(this);
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
            b = i2 % 128;
            int i3 = i2 % 2;
            return http2Connection;
        }

        public final Builder socket(Socket socket) throws IOException {
            int i = 2 % 2;
            int i2 = b + 21;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(socket, "");
            Builder builderSocket$default = socket$default(this, socket, null, null, null, 14, null);
            int i4 = b + 61;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            if (i4 % 2 == 0) {
                return builderSocket$default;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder socket(Socket socket, String str) throws IOException {
            int i = 2 % 2;
            int i2 = b + 103;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(socket, "");
            Intrinsics.checkNotNullParameter(str, "");
            Builder builderSocket$default = i3 != 0 ? socket$default(this, socket, str, null, null, 45, null) : socket$default(this, socket, str, null, null, 12, null);
            int i4 = b + 79;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 13 / 0;
            }
            return builderSocket$default;
        }

        public final Builder socket(Socket socket, String str, RotationProvider1 rotationProvider1) throws IOException {
            Builder builderSocket$default;
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
            b = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(socket, "");
            Intrinsics.checkNotNullParameter(str, "");
            if (i3 == 0) {
                Intrinsics.checkNotNullParameter(rotationProvider1, "");
                builderSocket$default = socket$default(this, socket, str, rotationProvider1, null, 100, null);
            } else {
                Intrinsics.checkNotNullParameter(rotationProvider1, "");
                builderSocket$default = socket$default(this, socket, str, rotationProvider1, null, 8, null);
            }
            int i4 = b + 3;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            if (i4 % 2 == 0) {
                return builderSocket$default;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(int r6, byte r7, int r8) {
            /*
                int r6 = r6 + 102
                int r8 = r8 * 4
                int r8 = 1 - r8
                int r7 = r7 + 4
                byte[] r0 = okhttp3.internal.http2.Http2Connection.Builder.$$c
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L12
                r3 = r8
                r4 = r2
                goto L24
            L12:
                r3 = r2
            L13:
                int r7 = r7 + 1
                int r4 = r3 + 1
                byte r5 = (byte) r6
                r1[r3] = r5
                if (r4 != r8) goto L22
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L22:
                r3 = r0[r7]
            L24:
                int r6 = r6 + r3
                r3 = r4
                goto L13
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.Builder.$$g(int, byte, int):java.lang.String");
        }
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    /* JADX INFO: renamed from: getSocket$okhttp, reason: from getter */
    public final Socket getSocket() {
        return this.socket;
    }

    public final Http2Writer getWriter() {
        return this.writer;
    }

    public final ReaderRunnable getReaderRunnable() {
        return this.readerRunnable;
    }

    public final int openStreamCount() {
        int size;
        synchronized (this) {
            size = this.streams.size();
        }
        return size;
    }

    public final Http2Stream getStream(int p0) {
        Http2Stream http2Stream;
        synchronized (this) {
            http2Stream = this.streams.get(Integer.valueOf(p0));
        }
        return http2Stream;
    }

    public final Http2Stream removeStream$okhttp(int p0) {
        Http2Stream http2StreamRemove;
        synchronized (this) {
            http2StreamRemove = this.streams.remove(Integer.valueOf(p0));
            Intrinsics.checkNotNull(this, "");
            notifyAll();
        }
        return http2StreamRemove;
    }

    public final void updateConnectionFlowControl$okhttp(long p0) {
        synchronized (this) {
            long j = this.readBytesTotal + p0;
            this.readBytesTotal = j;
            long j2 = j - this.readBytesAcknowledged;
            if (j2 >= this.okHttpSettings.getInitialWindowSize() / 2) {
                writeWindowUpdateLater$okhttp(0, j2);
                this.readBytesAcknowledged += j2;
            }
        }
    }

    public final Http2Stream pushStream(int p0, List<Header> p1, boolean p2) throws IOException {
        Intrinsics.checkNotNullParameter(p1, "");
        if (this.client) {
            throw new IllegalStateException("Client cannot push requests.".toString());
        }
        return newStream(p0, p1, p2);
    }

    public final Http2Stream newStream(List<Header> p0, boolean p1) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        return newStream(0, p0, p1);
    }

    private final Http2Stream newStream(int p0, List<Header> p1, boolean p2) throws IOException {
        int i;
        Http2Stream http2Stream;
        boolean z;
        boolean z2 = !p2;
        synchronized (this.writer) {
            synchronized (this) {
                try {
                    if (this.nextStreamId > 1073741823) {
                        shutdown(ErrorCode.REFUSED_STREAM);
                    }
                    if (this.isShutdown) {
                        throw new ConnectionShutdownException();
                    }
                    i = this.nextStreamId;
                    this.nextStreamId = i + 2;
                    http2Stream = new Http2Stream(i, this, z2, false, null);
                    z = !p2 || this.writeBytesTotal >= this.writeBytesMaximum || http2Stream.getWriteBytesTotal() >= http2Stream.getWriteBytesMaximum();
                    if (http2Stream.isOpen()) {
                        this.streams.put(Integer.valueOf(i), http2Stream);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (p0 == 0) {
                this.writer.headers(z2, i, p1);
            } else {
                if (this.client) {
                    throw new IllegalArgumentException("client streams shouldn't have associated stream IDs".toString());
                }
                this.writer.pushPromise(p0, i, p1);
            }
            Unit unit2 = Unit.INSTANCE;
        }
        if (z) {
            this.writer.flush();
        }
        return http2Stream;
    }

    public final void writeHeaders$okhttp(int p0, boolean p1, List<Header> p2) throws IOException {
        Intrinsics.checkNotNullParameter(p2, "");
        this.writer.headers(p1, p0, p2);
    }

    public final void writeData(int p0, boolean p1, RotationProviderListenerWrapper p2, long p3) throws IOException {
        long j;
        long j2;
        int iMin;
        long j3;
        if (p3 == 0) {
            this.writer.data(p1, p0, p2, 0);
            return;
        }
        while (p3 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        j = this.writeBytesTotal;
                        j2 = this.writeBytesMaximum;
                        if (j >= j2) {
                            if (!this.streams.containsKey(Integer.valueOf(p0))) {
                                throw new IOException("stream closed");
                            }
                            Intrinsics.checkNotNull(this, "");
                            wait();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                    throw th;
                }
                iMin = Math.min((int) Math.min(p3, j2 - j), this.writer.getMaxFrameSize());
                j3 = iMin;
                this.writeBytesTotal += j3;
                Unit unit = Unit.INSTANCE;
            }
            p3 -= j3;
            this.writer.data(p1 && p3 == 0, p0, p2, iMin);
        }
    }

    public final void writeSynResetLater$okhttp(final int p0, final ErrorCode p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        TaskQueue taskQueue = this.writerQueue;
        StringBuilder sb = new StringBuilder();
        sb.append(this.connectionName);
        sb.append('[');
        sb.append(p0);
        sb.append("] writeSynReset");
        final String string = sb.toString();
        final boolean z = true;
        taskQueue.schedule(new Task(string, z) { // from class: okhttp3.internal.http2.Http2Connection$writeSynResetLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public final long runOnce() {
                try {
                    this.writeSynReset$okhttp(p0, p1);
                    return -1L;
                } catch (IOException e2) {
                    this.failConnection(e2);
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void writeSynReset$okhttp(int p0, ErrorCode p1) throws IOException {
        Intrinsics.checkNotNullParameter(p1, "");
        this.writer.rstStream(p0, p1);
    }

    public final void writeWindowUpdateLater$okhttp(final int p0, final long p1) {
        TaskQueue taskQueue = this.writerQueue;
        StringBuilder sb = new StringBuilder();
        sb.append(this.connectionName);
        sb.append('[');
        sb.append(p0);
        sb.append("] windowUpdate");
        final String string = sb.toString();
        final boolean z = true;
        taskQueue.schedule(new Task(string, z) { // from class: okhttp3.internal.http2.Http2Connection$writeWindowUpdateLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public final long runOnce() {
                try {
                    this.getWriter().windowUpdate(p0, p1);
                    return -1L;
                } catch (IOException e2) {
                    this.failConnection(e2);
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void writePing(boolean p0, int p1, int p2) {
        try {
            this.writer.ping(p0, p1, p2);
        } catch (IOException e2) {
            failConnection(e2);
        }
    }

    public final void writePingAndAwaitPong() throws InterruptedException {
        writePing();
        awaitPong();
    }

    public final void writePing() throws InterruptedException {
        synchronized (this) {
            this.awaitPingsSent++;
        }
        writePing(false, 3, 1330343787);
    }

    public final void awaitPong() throws InterruptedException {
        synchronized (this) {
            while (this.awaitPongsReceived < this.awaitPingsSent) {
                Intrinsics.checkNotNull(this, "");
                wait();
            }
        }
    }

    public final void flush() throws IOException {
        this.writer.flush();
    }

    public final void shutdown(ErrorCode p0) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        synchronized (this.writer) {
            Ref.IntRef intRef = new Ref.IntRef();
            synchronized (this) {
                if (this.isShutdown) {
                    return;
                }
                this.isShutdown = true;
                intRef.element = this.lastGoodStreamId;
                Unit unit = Unit.INSTANCE;
                this.writer.goAway(intRef.element, p0, Util.EMPTY_BYTE_ARRAY);
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        close$okhttp(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void failConnection(IOException p0) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        close$okhttp(errorCode, errorCode, p0);
    }

    public static /* synthetic */ void start$default(Http2Connection http2Connection, boolean z, TaskRunner taskRunner, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            taskRunner = TaskRunner.INSTANCE;
        }
        http2Connection.start(z, taskRunner);
    }

    public final void start(boolean p0, TaskRunner p1) throws IOException {
        Intrinsics.checkNotNullParameter(p1, "");
        if (p0) {
            this.writer.connectionPreface();
            this.writer.settings(this.okHttpSettings);
            int initialWindowSize = this.okHttpSettings.getInitialWindowSize();
            if (initialWindowSize != 65535) {
                this.writer.windowUpdate(0, initialWindowSize - 65535);
            }
        }
        p1.newQueue().schedule(new TaskQueue.AnonymousClass1(this.connectionName, true, this.readerRunnable), 0L);
    }

    public final void setSettings(Settings p0) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        synchronized (this.writer) {
            synchronized (this) {
                if (this.isShutdown) {
                    throw new ConnectionShutdownException();
                }
                this.okHttpSettings.merge(p0);
                Unit unit = Unit.INSTANCE;
            }
            this.writer.settings(p0);
            Unit unit2 = Unit.INSTANCE;
        }
    }

    public final boolean isHealthy(long p0) {
        synchronized (this) {
            if (this.isShutdown) {
                return false;
            }
            return this.degradedPongsReceived >= this.degradedPingsSent || p0 < this.degradedPongDeadlineNs;
        }
    }

    public final void sendDegradedPingLater$okhttp() {
        synchronized (this) {
            long j = this.degradedPongsReceived;
            long j2 = this.degradedPingsSent;
            if (j < j2) {
                return;
            }
            this.degradedPingsSent = j2 + 1;
            this.degradedPongDeadlineNs = System.nanoTime() + 1000000000;
            Unit unit = Unit.INSTANCE;
            TaskQueue taskQueue = this.writerQueue;
            StringBuilder sb = new StringBuilder();
            sb.append(this.connectionName);
            sb.append(" ping");
            final String string = sb.toString();
            final boolean z = true;
            taskQueue.schedule(new Task(string, z) { // from class: okhttp3.internal.http2.Http2Connection$sendDegradedPingLater$$inlined$execute$default$1
                @Override // okhttp3.internal.concurrent.Task
                public final long runOnce() {
                    this.writePing(false, 2, 0);
                    return -1L;
                }
            }, 0L);
        }
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\tJ?\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ5\u0010!\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b#\u0010\tJ'\u0010$\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b$\u0010%J/\u0010&\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0015H\u0016¢\u0006\u0004\b&\u0010'J-\u0010(\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u001cH\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b,\u0010\u0018J\u001f\u0010-\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0011H\u0016¢\u0006\u0004\b-\u0010.R\u001a\u0010/\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "Lokhttp3/internal/http2/Http2Reader$Handler;", "Lkotlin/Function0;", "", "Lokhttp3/internal/http2/Http2Reader;", "p0", "<init>", "(Lokhttp3/internal/http2/Http2Connection;Lokhttp3/internal/http2/Http2Reader;)V", "ackSettings", "()V", "", "", "p1", "Lokio/ByteString;", "p2", "p3", "p4", "", "p5", "alternateService", "(ILjava/lang/String;Lokio/ByteString;Ljava/lang/String;IJ)V", "", "Lokhttp3/internal/http2/Settings;", "applyAndAckSettings", "(ZLokhttp3/internal/http2/Settings;)V", "LRotationProvider1;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(ZILRotationProvider1;I)V", "Lokhttp3/internal/http2/ErrorCode;", "goAway", "(ILokhttp3/internal/http2/ErrorCode;Lokio/ByteString;)V", "", "Lokhttp3/internal/http2/Header;", "headers", "(ZIILjava/util/List;)V", "invoke", "ping", "(ZII)V", "priority", "(IIIZ)V", "pushPromise", "(IILjava/util/List;)V", "rstStream", "(ILokhttp3/internal/http2/ErrorCode;)V", "settings", "windowUpdate", "(IJ)V", "reader", "Lokhttp3/internal/http2/Http2Reader;", "getReader$okhttp", "()Lokhttp3/internal/http2/Http2Reader;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class ReaderRunnable implements Http2Reader.Handler, Function0<Unit> {
        private final Http2Reader reader;
        final /* synthetic */ Http2Connection this$0;

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public final void ackSettings() {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public final void priority(int p0, int p1, int p2, boolean p3) {
        }

        public ReaderRunnable(Http2Connection http2Connection, Http2Reader http2Reader) {
            Intrinsics.checkNotNullParameter(http2Reader, "");
            this.this$0 = http2Connection;
            this.reader = http2Reader;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: getReader$okhttp, reason: from getter */
        public final Http2Reader getReader() {
            return this.reader;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.internal.http2.ErrorCode] */
        /* JADX WARN: Type inference failed for: r0v7, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r0v8, types: [okhttp3.internal.http2.ErrorCode] */
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
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ErrorCode errorCode;
            Http2Reader http2Reader = ErrorCode.INTERNAL_ERROR;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            IOException e2 = null;
            try {
                try {
                    this.reader.readConnectionPreface(this);
                    while (this.reader.nextFrame(false, this)) {
                    }
                    http2Reader = ErrorCode.NO_ERROR;
                    errorCode2 = ErrorCode.CANCEL;
                    errorCode = http2Reader;
                } catch (IOException e3) {
                    e2 = e3;
                    ErrorCode errorCode3 = ErrorCode.PROTOCOL_ERROR;
                    errorCode2 = ErrorCode.PROTOCOL_ERROR;
                    errorCode = errorCode3;
                }
            } finally {
                this.this$0.close$okhttp(http2Reader, errorCode2, e2);
                Util.closeQuietly(this.reader);
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public final void data(boolean p0, int p1, RotationProvider1 p2, int p3) throws IOException {
            Intrinsics.checkNotNullParameter(p2, "");
            if (this.this$0.pushedStream$okhttp(p1)) {
                this.this$0.pushDataLater$okhttp(p1, p2, p3, p0);
                return;
            }
            Http2Stream stream = this.this$0.getStream(p1);
            if (stream == null) {
                this.this$0.writeSynResetLater$okhttp(p1, ErrorCode.PROTOCOL_ERROR);
                long j = p3;
                this.this$0.updateConnectionFlowControl$okhttp(j);
                p2.g(j);
                return;
            }
            stream.receiveData(p2, p3);
            if (p0) {
                stream.receiveHeaders(Util.EMPTY_HEADERS, true);
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public final void headers(boolean p0, int p1, int p2, List<Header> p3) {
            Intrinsics.checkNotNullParameter(p3, "");
            if (this.this$0.pushedStream$okhttp(p1)) {
                this.this$0.pushHeadersLater$okhttp(p1, p3, p0);
                return;
            }
            final Http2Connection http2Connection = this.this$0;
            synchronized (http2Connection) {
                Http2Stream stream = http2Connection.getStream(p1);
                if (stream == null) {
                    if (http2Connection.isShutdown) {
                        return;
                    }
                    if (p1 <= http2Connection.getLastGoodStreamId()) {
                        return;
                    }
                    if (p1 % 2 == http2Connection.getNextStreamId() % 2) {
                        return;
                    }
                    final Http2Stream http2Stream = new Http2Stream(p1, http2Connection, false, p0, Util.toHeaders(p3));
                    http2Connection.setLastGoodStreamId$okhttp(p1);
                    http2Connection.getStreams$okhttp().put(Integer.valueOf(p1), http2Stream);
                    TaskQueue taskQueueNewQueue = http2Connection.taskRunner.newQueue();
                    StringBuilder sb = new StringBuilder();
                    sb.append(http2Connection.getConnectionName());
                    sb.append('[');
                    sb.append(p1);
                    sb.append("] onStream");
                    final String string = sb.toString();
                    final boolean z = true;
                    taskQueueNewQueue.schedule(new Task(string, z) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$headers$lambda$2$$inlined$execute$default$1
                        @Override // okhttp3.internal.concurrent.Task
                        public final long runOnce() {
                            try {
                                http2Connection.getListener().onStream(http2Stream);
                                return -1L;
                            } catch (IOException e2) {
                                Platform platform = Platform.INSTANCE.get();
                                StringBuilder sb2 = new StringBuilder("Http2Connection.Listener failure for ");
                                sb2.append(http2Connection.getConnectionName());
                                platform.log(sb2.toString(), 4, e2);
                                try {
                                    http2Stream.close(ErrorCode.PROTOCOL_ERROR, e2);
                                    return -1L;
                                } catch (IOException unused) {
                                    return -1L;
                                }
                            }
                        }
                    }, 0L);
                    return;
                }
                Unit unit = Unit.INSTANCE;
                stream.receiveHeaders(Util.toHeaders(p3), p0);
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public final void rstStream(int p0, ErrorCode p1) {
            Intrinsics.checkNotNullParameter(p1, "");
            if (this.this$0.pushedStream$okhttp(p0)) {
                this.this$0.pushResetLater$okhttp(p0, p1);
                return;
            }
            Http2Stream http2StreamRemoveStream$okhttp = this.this$0.removeStream$okhttp(p0);
            if (http2StreamRemoveStream$okhttp != null) {
                http2StreamRemoveStream$okhttp.receiveRstStream(p1);
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public final void settings(final boolean p0, final Settings p1) {
            Intrinsics.checkNotNullParameter(p1, "");
            TaskQueue taskQueue = this.this$0.writerQueue;
            StringBuilder sb = new StringBuilder();
            sb.append(this.this$0.getConnectionName());
            sb.append(" applyAndAckSettings");
            final String string = sb.toString();
            final boolean z = true;
            taskQueue.schedule(new Task(string, z) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$settings$$inlined$execute$default$1
                @Override // okhttp3.internal.concurrent.Task
                public final long runOnce() {
                    this.applyAndAckSettings(p0, p1);
                    return -1L;
                }
            }, 0L);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void applyAndAckSettings(boolean p0, Settings p1) {
            long initialWindowSize;
            int i;
            Http2Stream[] http2StreamArr;
            Intrinsics.checkNotNullParameter(p1, "");
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Http2Writer writer = this.this$0.getWriter();
            final Http2Connection http2Connection = this.this$0;
            synchronized (writer) {
                synchronized (http2Connection) {
                    Settings peerSettings = http2Connection.getPeerSettings();
                    T t = p1;
                    if (!p0) {
                        Settings settings = new Settings();
                        settings.merge(peerSettings);
                        settings.merge(p1);
                        t = settings;
                    }
                    objectRef.element = t;
                    initialWindowSize = ((long) ((Settings) objectRef.element).getInitialWindowSize()) - ((long) peerSettings.getInitialWindowSize());
                    http2StreamArr = (initialWindowSize == 0 || http2Connection.getStreams$okhttp().isEmpty()) ? null : (Http2Stream[]) http2Connection.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                    http2Connection.setPeerSettings((Settings) objectRef.element);
                    TaskQueue taskQueue = http2Connection.settingsListenerQueue;
                    StringBuilder sb = new StringBuilder();
                    sb.append(http2Connection.getConnectionName());
                    sb.append(" onSettings");
                    final String string = sb.toString();
                    final boolean z = true;
                    taskQueue.schedule(new Task(string, z) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$lambda$7$lambda$6$$inlined$execute$default$1
                        @Override // okhttp3.internal.concurrent.Task
                        public final long runOnce() {
                            http2Connection.getListener().onSettings(http2Connection, (Settings) objectRef.element);
                            return -1L;
                        }
                    }, 0L);
                    Unit unit = Unit.INSTANCE;
                }
                try {
                    http2Connection.getWriter().applyAndAckSettings((Settings) objectRef.element);
                } catch (IOException e2) {
                    http2Connection.failConnection(e2);
                }
                Unit unit2 = Unit.INSTANCE;
            }
            if (http2StreamArr != null) {
                for (Http2Stream http2Stream : http2StreamArr) {
                    synchronized (http2Stream) {
                        http2Stream.addBytesToWriteWindow(initialWindowSize);
                        Unit unit3 = Unit.INSTANCE;
                    }
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public final void ping(boolean p0, final int p1, final int p2) {
            if (!p0) {
                TaskQueue taskQueue = this.this$0.writerQueue;
                StringBuilder sb = new StringBuilder();
                sb.append(this.this$0.getConnectionName());
                sb.append(" ping");
                final String string = sb.toString();
                final Http2Connection http2Connection = this.this$0;
                final boolean z = true;
                taskQueue.schedule(new Task(string, z) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$ping$$inlined$execute$default$1
                    @Override // okhttp3.internal.concurrent.Task
                    public final long runOnce() {
                        http2Connection.writePing(true, p1, p2);
                        return -1L;
                    }
                }, 0L);
                return;
            }
            Http2Connection http2Connection2 = this.this$0;
            synchronized (http2Connection2) {
                try {
                    if (p1 == 1) {
                        http2Connection2.intervalPongsReceived++;
                    } else if (p1 != 2) {
                        if (p1 == 3) {
                            http2Connection2.awaitPongsReceived++;
                            Intrinsics.checkNotNull(http2Connection2, "");
                            http2Connection2.notifyAll();
                        }
                        Unit unit = Unit.INSTANCE;
                    } else {
                        http2Connection2.degradedPongsReceived++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public final void windowUpdate(int p0, long p1) {
            if (p0 == 0) {
                Http2Connection http2Connection = this.this$0;
                synchronized (http2Connection) {
                    http2Connection.writeBytesMaximum = http2Connection.getWriteBytesMaximum() + p1;
                    Intrinsics.checkNotNull(http2Connection, "");
                    http2Connection.notifyAll();
                    Unit unit = Unit.INSTANCE;
                }
                return;
            }
            Http2Stream stream = this.this$0.getStream(p0);
            if (stream != null) {
                synchronized (stream) {
                    stream.addBytesToWriteWindow(p1);
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public final void pushPromise(int p0, int p1, List<Header> p2) {
            Intrinsics.checkNotNullParameter(p2, "");
            this.this$0.pushRequestLater$okhttp(p1, p2);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public final void goAway(int p0, ErrorCode p1, ByteString p2) {
            int i;
            Object[] array;
            Intrinsics.checkNotNullParameter(p1, "");
            Intrinsics.checkNotNullParameter(p2, "");
            p2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            Http2Connection http2Connection = this.this$0;
            synchronized (http2Connection) {
                array = http2Connection.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                http2Connection.isShutdown = true;
                Unit unit = Unit.INSTANCE;
            }
            for (Http2Stream http2Stream : (Http2Stream[]) array) {
                if (http2Stream.getId() > p0 && http2Stream.isLocallyInitiated()) {
                    http2Stream.receiveRstStream(ErrorCode.REFUSED_STREAM);
                    this.this$0.removeStream$okhttp(http2Stream.getId());
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public final void alternateService(int p0, String p1, ByteString p2, String p3, int p4, long p5) {
            Intrinsics.checkNotNullParameter(p1, "");
            Intrinsics.checkNotNullParameter(p2, "");
            Intrinsics.checkNotNullParameter(p3, "");
        }
    }

    public final void pushRequestLater$okhttp(final int p0, final List<Header> p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        synchronized (this) {
            if (this.currentPushRequests.contains(Integer.valueOf(p0))) {
                writeSynResetLater$okhttp(p0, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            this.currentPushRequests.add(Integer.valueOf(p0));
            TaskQueue taskQueue = this.pushQueue;
            StringBuilder sb = new StringBuilder();
            sb.append(this.connectionName);
            sb.append('[');
            sb.append(p0);
            sb.append("] onRequest");
            final String string = sb.toString();
            final boolean z = true;
            taskQueue.schedule(new Task(string, z) { // from class: okhttp3.internal.http2.Http2Connection$pushRequestLater$$inlined$execute$default$1
                @Override // okhttp3.internal.concurrent.Task
                public final long runOnce() {
                    if (!this.pushObserver.onRequest(p0, p1)) {
                        return -1L;
                    }
                    try {
                        this.getWriter().rstStream(p0, ErrorCode.CANCEL);
                        synchronized (this) {
                            try {
                                this.currentPushRequests.remove(Integer.valueOf(p0));
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }, 0L);
        }
    }

    public final void pushHeadersLater$okhttp(final int p0, final List<Header> p1, final boolean p2) {
        Intrinsics.checkNotNullParameter(p1, "");
        TaskQueue taskQueue = this.pushQueue;
        StringBuilder sb = new StringBuilder();
        sb.append(this.connectionName);
        sb.append('[');
        sb.append(p0);
        sb.append("] onHeaders");
        final String string = sb.toString();
        final boolean z = true;
        taskQueue.schedule(new Task(string, z) { // from class: okhttp3.internal.http2.Http2Connection$pushHeadersLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public final long runOnce() {
                boolean zOnHeaders = this.pushObserver.onHeaders(p0, p1, p2);
                if (zOnHeaders) {
                    try {
                        this.getWriter().rstStream(p0, ErrorCode.CANCEL);
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
                if (!zOnHeaders && !p2) {
                    return -1L;
                }
                synchronized (this) {
                    try {
                        this.currentPushRequests.remove(Integer.valueOf(p0));
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return -1L;
            }
        }, 0L);
    }

    public final void pushDataLater$okhttp(final int p0, RotationProvider1 p1, final int p2, final boolean p3) throws IOException {
        Intrinsics.checkNotNullParameter(p1, "");
        final RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
        long j = p2;
        p1.asInterface(j);
        p1.read(rotationProviderListenerWrapper, j);
        TaskQueue taskQueue = this.pushQueue;
        StringBuilder sb = new StringBuilder();
        sb.append(this.connectionName);
        sb.append('[');
        sb.append(p0);
        sb.append("] onData");
        final String string = sb.toString();
        final boolean z = true;
        taskQueue.schedule(new Task(string, z) { // from class: okhttp3.internal.http2.Http2Connection$pushDataLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public final long runOnce() {
                try {
                    boolean zOnData = this.pushObserver.onData(p0, rotationProviderListenerWrapper, p2, p3);
                    if (zOnData) {
                        this.getWriter().rstStream(p0, ErrorCode.CANCEL);
                    }
                    if (!zOnData && !p3) {
                        return -1L;
                    }
                    synchronized (this) {
                        this.currentPushRequests.remove(Integer.valueOf(p0));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void pushResetLater$okhttp(final int p0, final ErrorCode p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        TaskQueue taskQueue = this.pushQueue;
        StringBuilder sb = new StringBuilder();
        sb.append(this.connectionName);
        sb.append('[');
        sb.append(p0);
        sb.append("] onReset");
        final String string = sb.toString();
        final boolean z = true;
        taskQueue.schedule(new Task(string, z) { // from class: okhttp3.internal.http2.Http2Connection$pushResetLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public final long runOnce() {
                this.pushObserver.onReset(p0, p1);
                synchronized (this) {
                    this.currentPushRequests.remove(Integer.valueOf(p0));
                    Unit unit = Unit.INSTANCE;
                }
                return -1L;
            }
        }, 0L);
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Listener;", "", "<init>", "()V", "Lokhttp3/internal/http2/Http2Connection;", "p0", "Lokhttp3/internal/http2/Settings;", "p1", "", "onSettings", "(Lokhttp3/internal/http2/Http2Connection;Lokhttp3/internal/http2/Settings;)V", "Lokhttp3/internal/http2/Http2Stream;", "onStream", "(Lokhttp3/internal/http2/Http2Stream;)V", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Listener {
        public static final Listener REFUSE_INCOMING_STREAMS = new Listener() { // from class: okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1
            @Override // okhttp3.internal.http2.Http2Connection.Listener
            public final void onStream(Http2Stream p0) throws IOException {
                Intrinsics.checkNotNullParameter(p0, "");
                p0.close(ErrorCode.REFUSED_STREAM, null);
            }
        };

        public abstract void onStream(Http2Stream p0) throws IOException;

        public void onSettings(Http2Connection p0, Settings p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Companion;", "", "<init>", "()V", "", "AWAIT_PING", "I", "Lokhttp3/internal/http2/Settings;", "DEFAULT_SETTINGS", "Lokhttp3/internal/http2/Settings;", "getDEFAULT_SETTINGS", "()Lokhttp3/internal/http2/Settings;", "DEGRADED_PING", "DEGRADED_PONG_TIMEOUT_NS", "INTERVAL_PING", "OKHTTP_CLIENT_WINDOW_SIZE"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final Settings getDEFAULT_SETTINGS() {
            return Http2Connection.DEFAULT_SETTINGS;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Settings settings = new Settings();
        settings.set(7, 65535);
        settings.set(5, 16384);
        DEFAULT_SETTINGS = settings;
    }

    public final void close$okhttp(ErrorCode p0, ErrorCode p1, IOException p2) {
        int i;
        Object[] array;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        if (!Util.assertionsEnabled || !Thread.holdsLock(this)) {
            try {
                shutdown(p0);
            } catch (IOException unused) {
            }
            synchronized (this) {
                if (this.streams.isEmpty()) {
                    array = null;
                } else {
                    array = this.streams.values().toArray(new Http2Stream[0]);
                    this.streams.clear();
                }
                Unit unit = Unit.INSTANCE;
            }
            Http2Stream[] http2StreamArr = (Http2Stream[]) array;
            if (http2StreamArr != null) {
                for (Http2Stream http2Stream : http2StreamArr) {
                    try {
                        http2Stream.close(p1, p2);
                    } catch (IOException unused2) {
                    }
                }
            }
            try {
                this.writer.close();
            } catch (IOException unused3) {
            }
            try {
                this.socket.close();
            } catch (IOException unused4) {
            }
            this.writerQueue.shutdown();
            this.pushQueue.shutdown();
            this.settingsListenerQueue.shutdown();
            return;
        }
        StringBuilder sb = new StringBuilder("Thread ");
        sb.append(Thread.currentThread().getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    public final void start() throws IOException {
        start$default(this, false, null, 3, null);
    }

    public final void start(boolean z) throws IOException {
        start$default(this, z, null, 2, null);
    }
}
