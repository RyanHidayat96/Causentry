package okhttp3.internal.http1;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.tasks.zzu;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.RotationProvider1;
import defpackage.RotationProviderListener;
import defpackage.RotationProviderListenerWrapper;
import defpackage.ScreenFlashViewExternalSyntheticLambda0;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.SurfaceViewImplementationApi24Impl;
import defpackage.abortCapture;
import defpackage.cancelPreviousRequest;
import defpackage.initSession;
import defpackage.tryToComplete;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import org.koin.core.error.ScopeAlreadyCreatedException;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u0000 M2\u00020\u0001:\u0007NOPMQRSB)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u000eJ\u000f\u0010\u0018\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u000eJ\u000f\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0011H\u0002¢\u0006\u0004\b!\u0010\u001aJ\u000f\u0010\"\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020$H\u0017¢\u0006\u0004\b%\u0010&J\u0019\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010\u0003\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020$H\u0016¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020$¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0017¢\u0006\u0004\b0\u00101J\u001d\u00103\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020/2\u0006\u0010\u0005\u001a\u000202¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000fH\u0016¢\u0006\u0004\b5\u00106R\u0016\u00107\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u00109\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0011\u0010@\u001a\u00020'8G¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010B\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010G\u001a\u00020F8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b0\u0010IR\u0018\u0010J\u001a\u00020'*\u00020\u000f8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0018\u0010J\u001a\u00020'*\u00020$8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010L"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec;", "Lokhttp3/internal/http/ExchangeCodec;", "Lokhttp3/OkHttpClient;", "p0", "Lokhttp3/internal/connection/RealConnection;", "p1", "LRotationProvider1;", "p2", "LRotationProviderListener;", "p3", "<init>", "(Lokhttp3/OkHttpClient;Lokhttp3/internal/connection/RealConnection;LRotationProvider1;LRotationProviderListener;)V", "", "cancel", "()V", "Lokhttp3/Request;", "", "LSurfaceViewImplementationApi24Impl;", "createRequestBody", "(Lokhttp3/Request;J)LSurfaceViewImplementationApi24Impl;", "LScreenFlashViewExternalSyntheticLambda0;", "detachTimeout", "(LScreenFlashViewExternalSyntheticLambda0;)V", "finishRequest", "flushRequest", "newChunkedSink", "()LSurfaceViewImplementationApi24Impl;", "Lokhttp3/HttpUrl;", "LtryToComplete;", "newChunkedSource", "(Lokhttp3/HttpUrl;)LtryToComplete;", "newFixedLengthSource", "(J)LtryToComplete;", "newKnownLengthSink", "newUnknownLengthSource", "()LtryToComplete;", "Lokhttp3/Response;", "openResponseBodySource", "(Lokhttp3/Response;)LtryToComplete;", "", "Lokhttp3/Response$Builder;", "readResponseHeaders", "(Z)Lokhttp3/Response$Builder;", "reportedContentLength", "(Lokhttp3/Response;)J", "skipConnectBody", "(Lokhttp3/Response;)V", "Lokhttp3/Headers;", "trailers", "()Lokhttp3/Headers;", "", "writeRequest", "(Lokhttp3/Headers;Ljava/lang/String;)V", "writeRequestHeaders", "(Lokhttp3/Request;)V", "client", "Lokhttp3/OkHttpClient;", "connection", "Lokhttp3/internal/connection/RealConnection;", "getConnection", "()Lokhttp3/internal/connection/RealConnection;", "Lokhttp3/internal/http1/HeadersReader;", "headersReader", "Lokhttp3/internal/http1/HeadersReader;", "isClosed", "()Z", "sink", "LRotationProviderListener;", "source", "LRotationProvider1;", "", RemoteConfigConstants.ResponseFieldKey.STATE, "I", "Lokhttp3/Headers;", "isChunked", "(Lokhttp3/Request;)Z", "(Lokhttp3/Response;)Z", "Companion", "AbstractSource", "ChunkedSink", "ChunkedSource", "FixedLengthSource", "KnownLengthSink", "UnknownLengthSource"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Http1ExchangeCodec implements ExchangeCodec {
    private static final long NO_CHUNK_YET = -1;
    private static final int STATE_CLOSED = 6;
    private static final int STATE_IDLE = 0;
    private static final int STATE_OPEN_REQUEST_BODY = 1;
    private static final int STATE_OPEN_RESPONSE_BODY = 4;
    private static final int STATE_READING_RESPONSE_BODY = 5;
    private static final int STATE_READ_RESPONSE_HEADERS = 3;
    private static final int STATE_WRITING_REQUEST_BODY = 2;
    private static long TuitionPaymentFragmentbindingInflater1;
    private static int b;
    private final OkHttpClient client;
    private final RealConnection connection;
    private final HeadersReader headersReader;
    private final RotationProviderListener sink;
    private final RotationProvider1 source;
    private int state;
    private Headers trailers;
    private static final byte[] $$c = {49, 84, -120, 101};
    private static final int $$d = 96;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {106, -22, 107, 95, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
    private static final int $$b = 34;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = okhttp3.internal.http1.Http1ExchangeCodec.$$a
            int r6 = r6 * 2
            int r6 = r6 + 84
            int r8 = r8 * 15
            int r8 = r8 + 38
            int r7 = r7 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r6 = r8
            r4 = r2
            goto L27
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r0[r7]
        L27:
            int r7 = r7 + 1
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http1.Http1ExchangeCodec.a(short, int, byte, java.lang.Object[]):void");
    }

    public Http1ExchangeCodec(OkHttpClient okHttpClient, RealConnection realConnection, RotationProvider1 rotationProvider1, RotationProviderListener rotationProviderListener) {
        Intrinsics.checkNotNullParameter(realConnection, "");
        Intrinsics.checkNotNullParameter(rotationProvider1, "");
        Intrinsics.checkNotNullParameter(rotationProviderListener, "");
        this.client = okHttpClient;
        this.connection = realConnection;
        this.source = rotationProvider1;
        this.sink = rotationProviderListener;
        this.headersReader = new HeadersReader(rotationProvider1);
    }

    public static final /* synthetic */ void access$detachTimeout(Http1ExchangeCodec http1ExchangeCodec, ScreenFlashViewExternalSyntheticLambda0 screenFlashViewExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        http1ExchangeCodec.detachTimeout(screenFlashViewExternalSyntheticLambda0);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ OkHttpClient access$getClient$p(Http1ExchangeCodec http1ExchangeCodec) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        OkHttpClient okHttpClient = http1ExchangeCodec.client;
        int i5 = i2 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            return okHttpClient;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ HeadersReader access$getHeadersReader$p(Http1ExchangeCodec http1ExchangeCodec) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 103;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        HeadersReader headersReader = http1ExchangeCodec.headersReader;
        if (i4 != 0) {
            int i5 = 33 / 0;
        }
        int i6 = i3 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 68 / 0;
        }
        return headersReader;
    }

    public static final /* synthetic */ RotationProviderListener access$getSink$p(Http1ExchangeCodec http1ExchangeCodec) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        RotationProviderListener rotationProviderListener = http1ExchangeCodec.sink;
        int i5 = i2 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return rotationProviderListener;
    }

    public static final /* synthetic */ RotationProvider1 access$getSource$p(Http1ExchangeCodec http1ExchangeCodec) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 67;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        RotationProvider1 rotationProvider1 = http1ExchangeCodec.source;
        int i5 = i3 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 80 / 0;
        }
        return rotationProvider1;
    }

    public static final /* synthetic */ int access$getState$p(Http1ExchangeCodec http1ExchangeCodec) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = http1ExchangeCodec.state;
        int i6 = i2 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 73 / 0;
        }
        return i5;
    }

    public static final /* synthetic */ Headers access$getTrailers$p(Http1ExchangeCodec http1ExchangeCodec) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        Headers headers = http1ExchangeCodec.trailers;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return headers;
    }

    public static final /* synthetic */ void access$setState$p(Http1ExchangeCodec http1ExchangeCodec, int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        http1ExchangeCodec.state = i;
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access$setTrailers$p(Http1ExchangeCodec http1ExchangeCodec, Headers headers) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 51;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        Object obj = null;
        http1ExchangeCodec.trailers = headers;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentbindingInflater1 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        int i3 = $10 + 3;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (abortcapture.b < cArrB.length) {
            int i5 = $11 + 53;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i7 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentbindingInflater1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ImageFormat.getBitsPerPixel(0) + 64839), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1356, 38 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 894276454, false, $$e(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((Process.myTid() >> 22) + 47773), 468 - (ViewConfiguration.getEdgeSlop() >> 16), TextUtils.getOffsetAfter("", 0) + 13, 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
        int i8 = $11 + 37;
        $10 = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final RealConnection getConnection() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        RealConnection realConnection = this.connection;
        int i4 = i2 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            return realConnection;
        }
        obj.hashCode();
        throw null;
    }

    private final boolean isChunked(Response response) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        boolean zEquals = StringsKt.equals("chunked", i2 % 2 == 0 ? Response.header$default(response, "Transfer-Encoding", null, 3, null) : Response.header$default(response, "Transfer-Encoding", null, 2, null), true);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        return zEquals;
    }

    private final boolean isChunked(Request request) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return StringsKt.equals("chunked", request.header("Transfer-Encoding"), true);
    }

    public final boolean isClosed() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            if (this.state == 15) {
                return true;
            }
        } else if (this.state == 6) {
            return true;
        }
        int i4 = i2 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 45 / 0;
        }
        return false;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final SurfaceViewImplementationApi24Impl createRequestBody(Request p0, long p1) throws ProtocolException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        if (p0.body() != null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 93;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            if (p0.body().isDuplex()) {
                throw new ProtocolException("Duplex connections are not supported for HTTP/1");
            }
        }
        if (isChunked(p0)) {
            SurfaceViewImplementationApi24Impl surfaceViewImplementationApi24ImplNewChunkedSink = newChunkedSink();
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 45;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            return surfaceViewImplementationApi24ImplNewChunkedSink;
        }
        if (p1 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        SurfaceViewImplementationApi24Impl surfaceViewImplementationApi24ImplNewKnownLengthSink = newKnownLengthSink();
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
        if (i6 % 2 != 0) {
            return surfaceViewImplementationApi24ImplNewKnownLengthSink;
        }
        throw null;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void cancel() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        getConnection().cancel();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void writeRequestHeaders(Request p0) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(p0, "");
            RequestLine requestLine = RequestLine.INSTANCE;
            Proxy.Type type = getConnection().route().proxy().type();
            Intrinsics.checkNotNullExpressionValue(type, "");
            writeRequest(p0.headers(), requestLine.get(p0, type));
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(p0, "");
        RequestLine requestLine2 = RequestLine.INSTANCE;
        Proxy.Type type2 = getConnection().route().proxy().type();
        Intrinsics.checkNotNullExpressionValue(type2, "");
        writeRequest(p0.headers(), requestLine2.get(p0, type2));
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b¢\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0005@\u0005X\u0085\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u000e\u001a\u00020\u00178\u0005X\u0085\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "LtryToComplete;", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;)V", "LRotationProviderListenerWrapper;", "p0", "", "p1", "read", "(LRotationProviderListenerWrapper;J)J", "", "responseBodyComplete", "()V", "LcancelPreviousRequest;", "timeout", "()LcancelPreviousRequest;", "", "closed", "Z", "getClosed", "()Z", "setClosed", "(Z)V", "LScreenFlashViewExternalSyntheticLambda0;", "LScreenFlashViewExternalSyntheticLambda0;", "getTimeout", "()LScreenFlashViewExternalSyntheticLambda0;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    abstract class AbstractSource implements tryToComplete {
        private boolean closed;
        private final ScreenFlashViewExternalSyntheticLambda0 timeout;
        private static final byte[] $$c = {15, -9, 64, -81};
        private static final int $$d = 6;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {57, -56, 23, -36, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
        private static final int $$b = 51;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        private static int TuitionPaymentFragmentbindingInflater1 = 1;
        private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {-277306042, -2116128396, -1424105798, 1289420287, 1941482639, 834728028, -397312744, -974083269, -1046640176, 1703318087, 58596810, -967826259, -486666823, -1992198213, 70477349, 645204567, 2084879728, -1790621621};

        private static void a(byte b, byte b2, short s, Object[] objArr) {
            int i = (b * 2) + 84;
            byte[] bArr = $$a;
            int i2 = 92 - b2;
            int i3 = s * 15;
            byte[] bArr2 = new byte[i3 + 38];
            int i4 = i3 + 37;
            int i5 = -1;
            if (bArr == null) {
                i = (i2 + (-i)) - 11;
                i2 = i2;
                i5 = -1;
            }
            while (true) {
                int i6 = i2 + 1;
                int i7 = i5 + 1;
                bArr2[i7] = (byte) i;
                if (i7 == i4) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i = (i + (-bArr[i6])) - 11;
                i2 = i6;
                i5 = i7;
            }
        }

        private static void b(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i3 = -1870535734;
            char c = '0';
            int i4 = 1;
            int i5 = 0;
            if (iArr2 != null) {
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i6 = 0;
                while (i6 < length) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i5] = Integer.valueOf(iArr2[i6]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b = (byte) i5;
                            byte b2 = b;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - TextUtils.indexOf("", c, i5)), KeyEvent.keyCodeFromString("") + 3291, 31 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1948206109, false, $$e(b, b2, b2), new Class[]{Integer.TYPE});
                        }
                        iArr3[i6] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                        i6++;
                        i3 = -1870535734;
                        c = '0';
                        i5 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                int i7 = $11 + 21;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i9 = 0;
                while (i9 < length3) {
                    Object[] objArr3 = new Object[i4];
                    objArr3[0] = Integer.valueOf(iArr5[i9]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - Process.getGidForName("")), 3291 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 31, 1948206109, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    iArr6[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    i9++;
                    iArr5 = iArr5;
                    i4 = 1;
                }
                iArr5 = iArr6;
            }
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            sessionConfigValidatingBuilder.b = 2;
            while (sessionConfigValidatingBuilder.b < iArr.length) {
                int i10 = $11 + 75;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
                cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
                cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
                cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
                int i12 = $11 + 51;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                for (int i14 = 17; i14 > 1; i14--) {
                    int i15 = $11 + 89;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i14];
                    Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char c2 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
                        int i17 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2559;
                        int iLastIndexOf = 28 - TextUtils.lastIndexOf("", '0', 0, 0);
                        byte b5 = (byte) ($$d - 5);
                        byte b6 = (byte) (b5 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, i17, iLastIndexOf, 683220507, false, $$e(b5, b6, b6), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                }
                int i18 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                int i19 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object[] objArr5 = {sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getTapTimeout() >> 16) + 28879), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 348, 24 - TextUtils.lastIndexOf("", '0'), -30507727, false, "G", new Class[]{Object.class});
                }
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
                cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
                cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
                cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
                sessionConfigValidatingBuilder.b += 2;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        public AbstractSource() {
            this.timeout = new ScreenFlashViewExternalSyntheticLambda0(Http1ExchangeCodec.access$getSource$p(Http1ExchangeCodec.this).getTimeout());
        }

        protected final ScreenFlashViewExternalSyntheticLambda0 getTimeout() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
            int i3 = i2 % 128;
            TuitionPaymentFragmentbindingInflater1 = i3;
            int i4 = i2 % 2;
            ScreenFlashViewExternalSyntheticLambda0 screenFlashViewExternalSyntheticLambda0 = this.timeout;
            int i5 = i3 + 83;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
            return screenFlashViewExternalSyntheticLambda0;
        }

        protected final boolean getClosed() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i3 = i2 + 17;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            boolean z = this.closed;
            int i4 = i2 + 25;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            return z;
        }

        protected final void setClosed(boolean z) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1 + 57;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            this.closed = z;
            if (i3 != 0) {
                throw null;
            }
        }

        @Override // defpackage.tryToComplete
        /* JADX INFO: renamed from: timeout */
        public cancelPreviousRequest getTimeout() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 39;
            int i3 = i2 % 128;
            TuitionPaymentFragmentbindingInflater1 = i3;
            if (i2 % 2 == 0) {
                ScreenFlashViewExternalSyntheticLambda0 screenFlashViewExternalSyntheticLambda0 = this.timeout;
                throw null;
            }
            ScreenFlashViewExternalSyntheticLambda0 screenFlashViewExternalSyntheticLambda1 = this.timeout;
            int i4 = i3 + 91;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            return screenFlashViewExternalSyntheticLambda1;
        }

        @Override // defpackage.tryToComplete
        public long read(RotationProviderListenerWrapper p0, long p1) throws Throwable {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1 + 89;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            Object obj = null;
            try {
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(p0, "");
                    Http1ExchangeCodec.access$getSource$p(Http1ExchangeCodec.this).read(p0, p1);
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(p0, "");
                long j = Http1ExchangeCodec.access$getSource$p(Http1ExchangeCodec.this).read(p0, p1);
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3;
                TuitionPaymentFragmentbindingInflater1 = i3 % 128;
                if (i3 % 2 != 0) {
                    return j;
                }
                throw null;
            } catch (IOException e2) {
                Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
                throw e2;
            }
        }

        public final void responseBodyComplete() throws Throwable {
            Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cRed = (char) (Color.red(0) + 29944);
                int threadPriority = 1755 - ((Process.getThreadPriority(0) + 20) >> 6);
                int i4 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 22;
                byte b = $$a[7];
                byte b2 = b;
                Object[] objArr = new Object[1];
                a(b2, (byte) (b2 | 89), b, objArr);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRed, threadPriority, i4, 986134021, false, (String) objArr[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr2 = new Object[1];
            b(new int[]{-1685351481, 1417082402, -567783513, 1901583469, -1428925573, -2054573315, -948606788, -680065485, 1505323565, -1586849577, -1011220258, -750849109, 1651235422, 1634635562}, Color.rgb(0, 0, 0) + 16777238, objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            b(new int[]{-495093422, -1185068833, -224024479, -1856297754, -2054448234, -5008504, 2126334692, -311918250, 472735358, 1747337063}, 15 - TextUtils.getCapsMode("", 0, 0), objArr3);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cMakeMeasureSpec = (char) (29944 - View.MeasureSpec.makeMeasureSpec(0, 0));
                int trimmedLength = TextUtils.getTrimmedLength("") + 1755;
                int iLastIndexOf = 22 - TextUtils.lastIndexOf("", '0', 0, 0);
                byte[] bArr = $$a;
                byte b3 = bArr[7];
                Object[] objArr4 = new Object[1];
                a(b3, (byte) (b3 | 52), bArr[5], objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMakeMeasureSpec, trimmedLength, iLastIndexOf, 1596667560, false, (String) objArr4[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                int i5 = TuitionPaymentFragmentbindingInflater1 + 11;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
                int i6 = i5 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cMyTid = (char) ((Process.myTid() >> 22) + 29944);
                    int iBlue = 1755 - Color.blue(0);
                    int i7 = 23 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    byte[] bArr2 = $$a;
                    byte b4 = bArr2[7];
                    Object[] objArr5 = new Object[1];
                    a(b4, b4, bArr2[5], objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMyTid, iBlue, i7, 1599039318, false, (String) objArr5[0], null);
                }
                Object[] objArr6 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr6[0])[0]}, new int[]{((int[]) objArr6[1])[0]}, (Object[]) objArr6[2], new int[1], (String[]) objArr6[4]};
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i8 = 1878469249 + (((-212585922) | iUptimeMillis) * 376) + (((~((~iUptimeMillis) | 75556029)) | (-212594174)) * (-376)) + (((~(iUptimeMillis | (-75556030))) | 137046396) * 376) + 1190558513;
                int i9 = (i8 << 13) ^ i8;
                int i10 = i9 ^ (i9 >>> 17);
                ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i10 ^ (i10 << 5);
            } else {
                Object[] objArr7 = new Object[1];
                b(new int[]{447580374, -870343156, -407216659, 702537581, -1944393923, -1984583341, 414326000, -1396251886, -1238330860, -1254868598}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 16, objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                Object[] objArr8 = new Object[1];
                b(new int[]{1106621355, 109086822, 730673943, -849594304, -74604215, 2849325, -45648176, 942673558, -798119401, 1991215892}, 15 - Process.getGidForName(""), objArr8);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr9 = {955611993};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (42050 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 1725 - ((byte) KeyEvent.getModifierMetaStateMask()), 28 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
                    }
                    objArrTuitionPaymentFragmentbindingInflater1$7879113 = zzu.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr9), 1190558513, false, true);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cNormalizeMetaState = (char) (29944 - KeyEvent.normalizeMetaState(0));
                        int i11 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1754;
                        int i12 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23;
                        byte[] bArr3 = $$a;
                        byte b5 = bArr3[7];
                        Object[] objArr10 = new Object[1];
                        a(b5, b5, bArr3[5], objArr10);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cNormalizeMetaState, i11, i12, 1599039318, false, (String) objArr10[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                    try {
                        Object[] objArr11 = new Object[1];
                        b(new int[]{-1685351481, 1417082402, -567783513, 1901583469, -1428925573, -2054573315, -948606788, -680065485, 1505323565, -1586849577, -1011220258, -750849109, 1651235422, 1634635562}, 22 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr11);
                        Class<?> cls3 = Class.forName((String) objArr11[0]);
                        Object[] objArr12 = new Object[1];
                        b(new int[]{-495093422, -1185068833, -224024479, -1856297754, -2054448234, -5008504, 2126334692, -311918250, 472735358, 1747337063}, 15 - (Process.myTid() >> 22), objArr12);
                        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c = (char) (29945 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                            int iNormalizeMetaState = 1755 - KeyEvent.normalizeMetaState(0);
                            int i13 = 24 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                            byte[] bArr4 = $$a;
                            byte b6 = bArr4[7];
                            Object[] objArr13 = new Object[1];
                            a(b6, (byte) (b6 | 52), bArr4[5], objArr13);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, iNormalizeMetaState, i13, 1596667560, false, (String) objArr13[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                            char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29944);
                            int trimmedLength2 = TextUtils.getTrimmedLength("") + 1755;
                            int iRgb = Color.rgb(0, 0, 0) + 16777239;
                            byte b7 = $$a[7];
                            byte b8 = b7;
                            Object[] objArr14 = new Object[1];
                            a(b8, (byte) (b8 | 89), b7, objArr14);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(scrollBarFadeDuration, trimmedLength2, iRgb, 986134021, false, (String) objArr14[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            if (((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0] != ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
                if (strArr == null) {
                    throw null;
                }
                for (String str : strArr) {
                    arrayList.add(str);
                }
                throw null;
            }
            int i14 = TuitionPaymentFragmentbindingInflater1 + 29;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i14 % 128;
            int i15 = i14 % 2;
            int i16 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            Object[] objArr15 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i17 = i16 + 2101467443 + (((~((-269226571) | iIdentityHashCode)) | (~((~iIdentityHashCode) | (-56624145)))) * (-318)) + (((~(278911723 | iIdentityHashCode)) | (-335535868)) * (-318)) + (((~(iIdentityHashCode | (-278911724))) | 66309297) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr15[3])[0] = i19 ^ (i19 << 5);
            int iAccess$getState$p = Http1ExchangeCodec.access$getState$p(Http1ExchangeCodec.this);
            int i20 = ((int[]) objArr15[3])[0];
            int i21 = i20 * i20;
            int i22 = -(663171612 * i20);
            int i23 = (i21 & i22) + (i21 | i22);
            int i24 = -(i20 * 2024694778);
            int i25 = ((i23 & i24) + (i24 | i23)) - 1085902215;
            int i26 = i25 >> 22;
            int i27 = (((i26 | (-2047)) << 1) - (i26 ^ (-2047))) / 1024;
            int i28 = (i27 ^ 1) + ((i27 & 1) << 1);
            int i29 = (i25 ^ i28) + ((i28 & i25) << 1);
            int i30 = i25 >> 24;
            int i31 = (((i30 | (-511)) << 1) - (i30 ^ (-511))) / 256;
            int i32 = -((((i31 | 1) << 1) - (i31 ^ 1)) ^ i29);
            int i33 = ((i32 | 1) << 1) - (i32 ^ 1);
            int i34 = ((i33 >> 26) + ComposerKt.defaultsKey) / 64;
            int i35 = (i34 ^ 1) + ((i34 & 1) << 1);
            if (iAccess$getState$p == 7350 / (((-((i35 ^ 1) + ((i35 & 1) << 1))) & i33) * 1225)) {
                return;
            }
            if (Http1ExchangeCodec.access$getState$p(Http1ExchangeCodec.this) != 5) {
                StringBuilder sb = new StringBuilder("state: ");
                sb.append(Http1ExchangeCodec.access$getState$p(Http1ExchangeCodec.this));
                throw new IllegalStateException(sb.toString());
            }
            int i36 = TuitionPaymentFragmentbindingInflater1 + 83;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i36 % 128;
            if (i36 % 2 != 0) {
                Http1ExchangeCodec.access$detachTimeout(Http1ExchangeCodec.this, this.timeout);
                Http1ExchangeCodec.access$setState$p(Http1ExchangeCodec.this, 6);
            } else {
                Http1ExchangeCodec.access$detachTimeout(Http1ExchangeCodec.this, this.timeout);
                Http1ExchangeCodec.access$setState$p(Http1ExchangeCodec.this, 6);
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$e(short r7, int r8, byte r9) {
            /*
                int r7 = r7 * 56
                int r7 = r7 + 66
                byte[] r0 = okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource.$$c
                int r8 = r8 * 3
                int r8 = r8 + 4
                int r9 = r9 * 4
                int r9 = 1 - r9
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r8
                r5 = r2
                goto L29
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r7
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r9) goto L24
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L24:
                r3 = r0[r8]
                r6 = r3
                r3 = r8
                r8 = r6
            L29:
                int r7 = r7 + r8
                int r8 = r3 + 1
                r3 = r5
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource.$$e(short, int, byte):java.lang.String");
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink;", "LSurfaceViewImplementationApi24Impl;", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;)V", "", "close", "()V", "flush", "LcancelPreviousRequest;", "timeout", "()LcancelPreviousRequest;", "LRotationProviderListenerWrapper;", "p0", "", "p1", "write", "(LRotationProviderListenerWrapper;J)V", "", "closed", "Z", "LScreenFlashViewExternalSyntheticLambda0;", "LScreenFlashViewExternalSyntheticLambda0;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    final class KnownLengthSink implements SurfaceViewImplementationApi24Impl {
        private boolean closed;
        private final ScreenFlashViewExternalSyntheticLambda0 timeout;

        public KnownLengthSink() {
            this.timeout = new ScreenFlashViewExternalSyntheticLambda0(Http1ExchangeCodec.access$getSink$p(Http1ExchangeCodec.this).timeout());
        }

        @Override // defpackage.SurfaceViewImplementationApi24Impl
        public final cancelPreviousRequest timeout() {
            return this.timeout;
        }

        @Override // defpackage.SurfaceViewImplementationApi24Impl
        public final void write(RotationProviderListenerWrapper p0, long p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (this.closed) {
                throw new IllegalStateException("closed".toString());
            }
            Util.checkOffsetAndCount(p0.size, 0L, p1);
            Http1ExchangeCodec.access$getSink$p(Http1ExchangeCodec.this).write(p0, p1);
        }

        @Override // defpackage.SurfaceViewImplementationApi24Impl, java.io.Flushable
        public final void flush() throws IOException {
            if (this.closed) {
                return;
            }
            Http1ExchangeCodec.access$getSink$p(Http1ExchangeCodec.this).flush();
        }

        @Override // defpackage.SurfaceViewImplementationApi24Impl, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Http1ExchangeCodec.access$detachTimeout(Http1ExchangeCodec.this, this.timeout);
            Http1ExchangeCodec.access$setState$p(Http1ExchangeCodec.this, 3);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink;", "LSurfaceViewImplementationApi24Impl;", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;)V", "", "close", "()V", "flush", "LcancelPreviousRequest;", "timeout", "()LcancelPreviousRequest;", "LRotationProviderListenerWrapper;", "p0", "", "p1", "write", "(LRotationProviderListenerWrapper;J)V", "", "closed", "Z", "LScreenFlashViewExternalSyntheticLambda0;", "LScreenFlashViewExternalSyntheticLambda0;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    final class ChunkedSink implements SurfaceViewImplementationApi24Impl {
        private boolean closed;
        private final ScreenFlashViewExternalSyntheticLambda0 timeout;

        public ChunkedSink() {
            this.timeout = new ScreenFlashViewExternalSyntheticLambda0(Http1ExchangeCodec.access$getSink$p(Http1ExchangeCodec.this).timeout());
        }

        @Override // defpackage.SurfaceViewImplementationApi24Impl
        public final cancelPreviousRequest timeout() {
            return this.timeout;
        }

        @Override // defpackage.SurfaceViewImplementationApi24Impl
        public final void write(RotationProviderListenerWrapper p0, long p1) throws IOException {
            Intrinsics.checkNotNullParameter(p0, "");
            if (this.closed) {
                throw new IllegalStateException("closed".toString());
            }
            if (p1 == 0) {
                return;
            }
            Http1ExchangeCodec.access$getSink$p(Http1ExchangeCodec.this).notify(p1);
            Http1ExchangeCodec.access$getSink$p(Http1ExchangeCodec.this).TuitionPaymentFragmentspecialinlinedviewModeldefault1("\r\n");
            Http1ExchangeCodec.access$getSink$p(Http1ExchangeCodec.this).write(p0, p1);
            Http1ExchangeCodec.access$getSink$p(Http1ExchangeCodec.this).TuitionPaymentFragmentspecialinlinedviewModeldefault1("\r\n");
        }

        @Override // defpackage.SurfaceViewImplementationApi24Impl, java.io.Flushable
        public final void flush() {
            synchronized (this) {
                if (this.closed) {
                    return;
                }
                Http1ExchangeCodec.access$getSink$p(Http1ExchangeCodec.this).flush();
            }
        }

        @Override // defpackage.SurfaceViewImplementationApi24Impl, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            synchronized (this) {
                if (this.closed) {
                    return;
                }
                this.closed = true;
                Http1ExchangeCodec.access$getSink$p(Http1ExchangeCodec.this).TuitionPaymentFragmentspecialinlinedviewModeldefault1("0\r\n\r\n");
                Http1ExchangeCodec.access$detachTimeout(Http1ExchangeCodec.this, this.timeout);
                Http1ExchangeCodec.access$setState$p(Http1ExchangeCodec.this, 3);
            }
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0083\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$FixedLengthSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "", "p0", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;J)V", "", "close", "()V", "LRotationProviderListenerWrapper;", "p1", "read", "(LRotationProviderListenerWrapper;J)J", "bytesRemaining", "J"}, k = 1, mv = {1, 8, 0}, xi = 48)
    final class FixedLengthSource extends AbstractSource {
        private long bytesRemaining;

        public FixedLengthSource(long j) {
            super();
            this.bytesRemaining = j;
            if (j == 0) {
                responseBodyComplete();
            }
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, defpackage.tryToComplete
        public final long read(RotationProviderListenerWrapper p0, long p1) throws Throwable {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p1 < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(p1)).toString());
            }
            if (getClosed()) {
                throw new IllegalStateException("closed".toString());
            }
            long j = this.bytesRemaining;
            if (j == 0) {
                return -1L;
            }
            long j2 = super.read(p0, Math.min(j, p1));
            if (j2 == -1) {
                Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                responseBodyComplete();
                throw protocolException;
            }
            long j3 = this.bytesRemaining - j2;
            this.bytesRemaining = j3;
            if (j3 == 0) {
                responseBodyComplete();
            }
            return j2;
        }

        @Override // defpackage.tryToComplete, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (getClosed()) {
                return;
            }
            if (this.bytesRemaining != 0 && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
            }
            setClosed(true);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final long reportedContentLength(Response p0) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cMyTid = (char) ((Process.myTid() >> 22) + 29944);
            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 1755;
            int gidForName = 22 - Process.getGidForName("");
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr3 = new Object[1];
            a(b2, b3, b3, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyTid, touchSlop, gidForName, 986134021, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(new char[]{46025, 58390, 45992, 39835, 8783, 56813, 52511, 45764, 19498, 39696, 8923, 45572, 19646, 39582, 8989, 45965, 19732, 39650, 9203, 45879, 19860, 39494, 8311, 45225, 19990, 39394}, 1 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(new char[]{2807, 11858, 2706, 20957, 40676, 24899, 36885, 61388, 62728, 20824, 40565, 61298, 62858, 20680, 40945, 61088, 62522, 20664, 40780}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char offsetBefore = (char) (29944 - TextUtils.getOffsetBefore("", 0));
            int bitsPerPixel = 1754 - ImageFormat.getBitsPerPixel(0);
            int i2 = 24 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            byte[] bArr = $$a;
            byte b4 = bArr[7];
            Object[] objArr6 = new Object[1];
            a(b4, (byte) (b4 | 37), bArr[28], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(offsetBefore, bitsPerPixel, i2, 1596667560, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cRgb = (char) ((-16747272) - Color.rgb(0, 0, 0));
                int iAxisFromString = MotionEvent.axisFromString("") + 1756;
                int threadPriority = 23 - ((Process.getThreadPriority(0) + 20) >> 6);
                byte[] bArr2 = $$a;
                byte b5 = bArr2[7];
                Object[] objArr7 = new Object[1];
                a(b5, (byte) (b5 | 89), bArr2[28], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cRgb, iAxisFromString, threadPriority, 1599039318, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[1], (String[]) objArr8[4]};
            int i3 = ~(Process.myUid() | (-149271698));
            int i4 = (-178863037) + (((-361874124) | i3) * (-220)) + ((i3 | 140784656) * 220) + 1408830351;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[3])[0] = i6 ^ (i6 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            c(new char[]{30937, 11062, 30899, 21684, 27423, 38063, 46411, 51843, 34683, 21557, 27548, 51728, 34726, 21987, 27170, 52211, 34318, 21957, 27296, 52075}, View.getDefaultSize(0, 0) + 1, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c(new char[]{6218, 1773, 6179, 31082, 62238, 3261, 10134, 22609, 59314, 31211, 62363, 22746, 59162, 30839, 61968, 22847, 59053, 30725, 62131, 22974}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr11 = {992172701};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 42049), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1726, 29 - TextUtils.getOffsetBefore("", 0), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrB$7879113 = ScopeAlreadyCreatedException.b$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr11), -66853207, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char windowTouchSlop = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 29944);
                    int bitsPerPixel2 = 1754 - ImageFormat.getBitsPerPixel(0);
                    int i7 = 24 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    byte[] bArr3 = $$a;
                    byte b6 = bArr3[7];
                    Object[] objArr12 = new Object[1];
                    a(b6, (byte) (b6 | 89), bArr3[28], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(windowTouchSlop, bitsPerPixel2, i7, 1599039318, false, (String) objArr12[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrB$7879113);
                try {
                    Object[] objArr13 = new Object[1];
                    c(new char[]{46025, 58390, 45992, 39835, 8783, 56813, 52511, 45764, 19498, 39696, 8923, 45572, 19646, 39582, 8989, 45965, 19732, 39650, 9203, 45879, 19860, 39494, 8311, 45225, 19990, 39394}, KeyEvent.keyCodeFromString("") + 1, objArr13);
                    Class<?> cls3 = Class.forName((String) objArr13[0]);
                    Object[] objArr14 = new Object[1];
                    c(new char[]{2807, 11858, 2706, 20957, 40676, 24899, 36885, 61388, 62728, 20824, 40565, 61298, 62858, 20680, 40945, 61088, 62522, 20664, 40780}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1, objArr14);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr14[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 29944);
                        int iMyTid = (Process.myTid() >> 22) + 1755;
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 24;
                        byte[] bArr4 = $$a;
                        byte b7 = bArr4[7];
                        Object[] objArr15 = new Object[1];
                        a(b7, (byte) (b7 | 37), bArr4[28], objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, iMyTid, iIndexOf, 1596667560, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c2 = (char) (29944 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        int i8 = 1755 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int iMyTid2 = (Process.myTid() >> 22) + 23;
                        byte b8 = $$a[7];
                        byte b9 = b8;
                        Object[] objArr16 = new Object[1];
                        a(b8, b9, b9, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c2, i8, iMyTid2, 986134021, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                    objArr = objArrB$7879113;
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
        int i9 = ((int[]) objArr[1])[0];
        int i10 = ((int[]) objArr[0])[0];
        if (i10 == i9) {
            int i11 = ((int[]) objArr[3])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
            int iMyUid = Process.myUid();
            int i12 = ~iMyUid;
            int i13 = i11 + (-1762152459) + (((~((-127396115) | i12)) | (-85206312) | (~(127396114 | iMyUid))) * (-564)) + ((~(iMyUid | (-1062))) * 1128) + (((~((-85206312) | i12)) | (-127397176)) * 564);
            int i14 = (i13 << 13) ^ i13;
            int i15 = i14 ^ (i14 >>> 17);
            ((int[]) objArr2[3])[0] = i15 ^ (i15 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str : strArr) {
                    int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i16 % 128;
                    int i17 = i16 % 2;
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i10 / (((i10 - 1) * i10) % 2), 0).show();
            int i18 = ((int[]) objArr[3])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i19 = ~iIdentityHashCode;
            int i20 = i18 + 711695537 + (((~((-541993573) | i19)) | 541860420 | (~(329391146 | i19))) * (-1136)) + (((~((-541993573) | iIdentityHashCode)) | (~(329391146 | iIdentityHashCode)) | (~((-329257995) | i19))) * (-568)) + (((~(iIdentityHashCode | (-541860421))) | (~(i19 | (-329391147))) | (~(541993572 | i19))) * 568);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr2[3])[0] = i22 ^ (i22 << 5);
        }
        if (!HttpHeaders.promisesBody(p0)) {
            return 0L;
        }
        if (!isChunked(p0)) {
            return Util.headersContentLength(p0);
        }
        int i23 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i23 % 128;
        int i24 = i23 % 2;
        int i25 = ((int[]) objArr2[3])[0];
        int i26 = i25 * i25;
        int i27 = -(497923738 * i25);
        int i28 = (i26 & i27) + (i26 | i27);
        int i29 = -(i25 * 532389738);
        int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
        int i31 = (i30 ^ 1695263748) + ((1695263748 & i30) << 1);
        int i32 = ((i31 >> 20) - 8191) / 4096;
        int i33 = ((i32 | 1) << 1) - (i32 ^ 1);
        int i34 = ((i31 | i33) << 1) - (i33 ^ i31);
        int i35 = i31 >> 18;
        int i36 = (((i35 | (-32767)) << 1) - (i35 ^ (-32767))) / 16384;
        int i37 = -(i34 ^ ((i36 & 1) + (i36 | 1)));
        int i38 = (i37 ^ 2) + ((i37 & 2) << 1);
        int i39 = i38 >> 16;
        int i40 = (((-131071) ^ i39) + ((i39 & (-131071)) << 1)) / 65536;
        return ((long) (925452 / (((-((((i40 | 1) << 1) - (i40 ^ 1)) + 1)) & i38) * 1107))) - 419;
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0083\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\tR\u0016\u0010\u0010\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "Lokhttp3/HttpUrl;", "p0", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;Lokhttp3/HttpUrl;)V", "", "close", "()V", "LRotationProviderListenerWrapper;", "", "p1", "read", "(LRotationProviderListenerWrapper;J)J", "readChunkSize", "bytesRemainingInChunk", "J", "", "hasMoreChunks", "Z", ImagesContract.URL, "Lokhttp3/HttpUrl;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    final class ChunkedSource extends AbstractSource {
        private long bytesRemainingInChunk;
        private boolean hasMoreChunks;
        final /* synthetic */ Http1ExchangeCodec this$0;
        private final HttpUrl url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChunkedSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl) {
            super();
            Intrinsics.checkNotNullParameter(httpUrl, "");
            this.this$0 = http1ExchangeCodec;
            this.url = httpUrl;
            this.bytesRemainingInChunk = -1L;
            this.hasMoreChunks = true;
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, defpackage.tryToComplete
        public final long read(RotationProviderListenerWrapper p0, long p1) throws Throwable {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p1 < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(p1)).toString());
            }
            if (getClosed()) {
                throw new IllegalStateException("closed".toString());
            }
            if (!this.hasMoreChunks) {
                return -1L;
            }
            long j = this.bytesRemainingInChunk;
            if (j == 0 || j == -1) {
                readChunkSize();
                if (!this.hasMoreChunks) {
                    return -1L;
                }
            }
            long j2 = super.read(p0, Math.min(p1, this.bytesRemainingInChunk));
            if (j2 == -1) {
                this.this$0.getConnection().noNewExchanges$okhttp();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                responseBodyComplete();
                throw protocolException;
            }
            this.bytesRemainingInChunk -= j2;
            return j2;
        }

        private final void readChunkSize() throws IOException {
            if (this.bytesRemainingInChunk != -1) {
                Http1ExchangeCodec.access$getSource$p(this.this$0).IconCompatParcelizer();
            }
            try {
                this.bytesRemainingInChunk = Http1ExchangeCodec.access$getSource$p(this.this$0).getInterfaceDescriptor();
                String string = StringsKt.trim((CharSequence) Http1ExchangeCodec.access$getSource$p(this.this$0).IconCompatParcelizer()).toString();
                if (this.bytesRemainingInChunk < 0 || (string.length() > 0 && !StringsKt.startsWith$default(string, ";", false, 2, (Object) null))) {
                    StringBuilder sb = new StringBuilder("expected chunk size and optional extensions but was \"");
                    sb.append(this.bytesRemainingInChunk);
                    sb.append(string);
                    sb.append(Typography.quote);
                    throw new ProtocolException(sb.toString());
                }
                if (this.bytesRemainingInChunk == 0) {
                    this.hasMoreChunks = false;
                    Http1ExchangeCodec http1ExchangeCodec = this.this$0;
                    Http1ExchangeCodec.access$setTrailers$p(http1ExchangeCodec, Http1ExchangeCodec.access$getHeadersReader$p(http1ExchangeCodec).readHeaders());
                    OkHttpClient okHttpClientAccess$getClient$p = Http1ExchangeCodec.access$getClient$p(this.this$0);
                    Intrinsics.checkNotNull(okHttpClientAccess$getClient$p);
                    CookieJar cookieJar = okHttpClientAccess$getClient$p.cookieJar();
                    HttpUrl httpUrl = this.url;
                    Headers headersAccess$getTrailers$p = Http1ExchangeCodec.access$getTrailers$p(this.this$0);
                    Intrinsics.checkNotNull(headersAccess$getTrailers$p);
                    HttpHeaders.receiveHeaders(cookieJar, httpUrl, headersAccess$getTrailers$p);
                    responseBodyComplete();
                }
            } catch (NumberFormatException e2) {
                throw new ProtocolException(e2.getMessage());
            }
        }

        @Override // defpackage.tryToComplete, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (getClosed()) {
                return;
            }
            if (this.hasMoreChunks && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                this.this$0.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
            }
            setClosed(true);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final tryToComplete openResponseBodySource(Response p0) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(p0, "");
            HttpHeaders.promisesBody(p0);
            throw null;
        }
        Intrinsics.checkNotNullParameter(p0, "");
        if (!HttpHeaders.promisesBody(p0)) {
            return newFixedLengthSource(0L);
        }
        if (!isChunked(p0)) {
            long jHeadersContentLength = Util.headersContentLength(p0);
            return jHeadersContentLength != -1 ? newFixedLengthSource(jHeadersContentLength) : newUnknownLengthSource();
        }
        tryToComplete trytocompleteNewChunkedSource = newChunkedSource(p0.request().url());
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 45 / 0;
        }
        return trytocompleteNewChunkedSource;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final Headers trailers() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 57;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        if (this.state != 6) {
            throw new IllegalStateException("too early; can't read the trailers yet".toString());
        }
        Headers headers = this.trailers;
        if (headers == null) {
            int i5 = i3 + 21;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
            headers = Util.EMPTY_HEADERS;
        }
        int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
        if (i7 % 2 == 0) {
            return headers;
        }
        throw null;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void flushRequest() throws IOException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        this.sink.flush();
        if (i3 != 0) {
            int i4 = 81 / 0;
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void finishRequest() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        this.sink.flush();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void writeRequest(Headers p0, String p1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        if (this.state != 0) {
            StringBuilder sb = new StringBuilder("state: ");
            sb.append(this.state);
            throw new IllegalStateException(sb.toString().toString());
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p1).TuitionPaymentFragmentspecialinlinedviewModeldefault1("\r\n");
        int size = p0.size();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        int i6 = 0;
        while (i6 < size) {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 97;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
            if (i7 % 2 != 0) {
                this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0.name(i6)).TuitionPaymentFragmentspecialinlinedviewModeldefault1(": ").TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0.value(i6)).TuitionPaymentFragmentspecialinlinedviewModeldefault1("\r\n");
                i6 += 123;
            } else {
                this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0.name(i6)).TuitionPaymentFragmentspecialinlinedviewModeldefault1(": ").TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0.value(i6)).TuitionPaymentFragmentspecialinlinedviewModeldefault1("\r\n");
                i6++;
            }
        }
        this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault1("\r\n");
        this.state = 1;
        int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 9 / 0;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0083\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$UnknownLengthSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;)V", "", "close", "()V", "LRotationProviderListenerWrapper;", "p0", "", "p1", "read", "(LRotationProviderListenerWrapper;J)J", "", "inputExhausted", "Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
    final class UnknownLengthSource extends AbstractSource {
        private boolean inputExhausted;

        public UnknownLengthSource() {
            super();
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, defpackage.tryToComplete
        public final long read(RotationProviderListenerWrapper p0, long p1) throws Throwable {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p1 < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(p1)).toString());
            }
            if (getClosed()) {
                throw new IllegalStateException("closed".toString());
            }
            if (this.inputExhausted) {
                return -1L;
            }
            long j = super.read(p0, p1);
            if (j != -1) {
                return j;
            }
            this.inputExhausted = true;
            responseBodyComplete();
            return -1L;
        }

        @Override // defpackage.tryToComplete, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (getClosed()) {
                return;
            }
            if (!this.inputExhausted) {
                responseBodyComplete();
            }
            setClosed(true);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final Response.Builder readResponseHeaders(boolean p0) {
        int i = 2 % 2;
        int i2 = this.state;
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            StringBuilder sb = new StringBuilder("state: ");
            sb.append(this.state);
            throw new IllegalStateException(sb.toString().toString());
        }
        try {
            StatusLine statusLine = StatusLine.INSTANCE.parse(this.headersReader.readLine());
            Response.Builder builderHeaders = new Response.Builder().protocol(statusLine.protocol).code(statusLine.code).message(statusLine.message).headers(this.headersReader.readHeaders());
            if (p0) {
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
                int i4 = i3 % 2;
                if (statusLine.code == 100) {
                    return null;
                }
            }
            if (statusLine.code == 100) {
                this.state = 3;
                return builderHeaders;
            }
            int i5 = statusLine.code;
            if (102 > i5 || i5 >= 200) {
                this.state = 4;
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
                if (i6 % 2 != 0) {
                    return builderHeaders;
                }
                throw null;
            }
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
            if (i7 % 2 == 0) {
                this.state = 2;
                return builderHeaders;
            }
            this.state = 3;
            return builderHeaders;
        } catch (EOFException e2) {
            throw new IOException("unexpected end of stream on ".concat(String.valueOf(getConnection().route().address().url().redact())), e2);
        }
    }

    private final SurfaceViewImplementationApi24Impl newChunkedSink() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        if (this.state != 1) {
            StringBuilder sb = new StringBuilder("state: ");
            sb.append(this.state);
            throw new IllegalStateException(sb.toString().toString());
        }
        this.state = 2;
        ChunkedSink chunkedSink = new ChunkedSink();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return chunkedSink;
        }
        throw null;
    }

    private final SurfaceViewImplementationApi24Impl newKnownLengthSink() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        if (this.state != 1) {
            StringBuilder sb = new StringBuilder("state: ");
            sb.append(this.state);
            throw new IllegalStateException(sb.toString().toString());
        }
        this.state = 2;
        KnownLengthSink knownLengthSink = new KnownLengthSink();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return knownLengthSink;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final tryToComplete newFixedLengthSource(long p0) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0 ? this.state != 4 : this.state != 2) {
            StringBuilder sb = new StringBuilder("state: ");
            sb.append(this.state);
            throw new IllegalStateException(sb.toString().toString());
        }
        this.state = 5;
        FixedLengthSource fixedLengthSource = new FixedLengthSource(p0);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            return fixedLengthSource;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final tryToComplete newChunkedSource(HttpUrl p0) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0 ? this.state != 4 : this.state != 2) {
            StringBuilder sb = new StringBuilder("state: ");
            sb.append(this.state);
            throw new IllegalStateException(sb.toString().toString());
        }
        this.state = 5;
        ChunkedSource chunkedSource = new ChunkedSource(this, p0);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 47 / 0;
        }
        return chunkedSource;
    }

    private final tryToComplete newUnknownLengthSource() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        if (this.state != 4) {
            StringBuilder sb = new StringBuilder("state: ");
            sb.append(this.state);
            throw new IllegalStateException(sb.toString().toString());
        }
        this.state = 5;
        getConnection().noNewExchanges$okhttp();
        UnknownLengthSource unknownLengthSource = new UnknownLengthSource();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return unknownLengthSource;
    }

    private final void detachTimeout(ScreenFlashViewExternalSyntheticLambda0 p0) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            cancelPreviousRequest cancelpreviousrequest = p0.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cancelPreviousRequest cancelpreviousrequest2 = cancelPreviousRequest.NONE;
            Intrinsics.checkNotNullParameter(cancelpreviousrequest2, "");
            p0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = cancelpreviousrequest2;
            cancelpreviousrequest.clearDeadline();
            cancelpreviousrequest.clearTimeout();
            int i3 = 81 / 0;
        } else {
            cancelPreviousRequest cancelpreviousrequest3 = p0.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cancelPreviousRequest cancelpreviousrequest4 = cancelPreviousRequest.NONE;
            Intrinsics.checkNotNullParameter(cancelpreviousrequest4, "");
            p0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = cancelpreviousrequest4;
            cancelpreviousrequest3.clearDeadline();
            cancelpreviousrequest3.clearTimeout();
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void skipConnectBody(Response p0) {
        long jHeadersContentLength;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(p0, "");
            jHeadersContentLength = Util.headersContentLength(p0);
            int i3 = 68 / 0;
            if (jHeadersContentLength == -1) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(p0, "");
            jHeadersContentLength = Util.headersContentLength(p0);
            if (jHeadersContentLength == -1) {
                return;
            }
        }
        tryToComplete trytocompleteNewFixedLengthSource = newFixedLengthSource(jHeadersContentLength);
        Util.skipAll(trytocompleteNewFixedLengthSource, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        trytocompleteNewFixedLengthSource.close();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        b = 1;
        b();
        INSTANCE = new Companion(null);
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
        b = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void b() {
        TuitionPaymentFragmentbindingInflater1 = -5604084930358372987L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(int r6, byte r7, byte r8) {
        /*
            byte[] r0 = okhttp3.internal.http1.Http1ExchangeCodec.$$c
            int r8 = r8 * 2
            int r1 = 1 - r8
            int r7 = r7 * 2
            int r7 = r7 + 107
            int r6 = r6 * 4
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L19
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2e
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = -r6
            int r6 = r6 + r3
            int r7 = r7 + 1
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http1.Http1ExchangeCodec.$$e(int, byte, byte):java.lang.String");
    }
}
