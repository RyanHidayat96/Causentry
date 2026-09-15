package okhttp3.internal.connection;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
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
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import com.android.volley.toolbox.HttpHeaderParser;
import defpackage.RotationProviderListenerWrapper;
import defpackage.RotationProviderListenerWrapperExternalSyntheticLambda0;
import defpackage.SurfaceViewImplementation;
import defpackage.SurfaceViewImplementationApi24Impl;
import defpackage.deInitSession;
import defpackage.getBrightness;
import defpackage.initSession;
import defpackage.tryToComplete;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.ProtocolException;
import java.net.SocketException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0002NOB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\u0010\u001a\u00028\u0000\"\n\b\u0000\u0010\r*\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u0014J\r\u0010\u001a\u001a\u00020\u0012¢\u0006\u0004\b\u001a\u0010\u0014J\r\u0010\u001b\u001a\u00020\u0012¢\u0006\u0004\b\u001b\u0010\u0014J\u000f\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0012¢\u0006\u0004\b\u001f\u0010\u0014J\r\u0010 \u001a\u00020\u0012¢\u0006\u0004\b \u0010\u0014J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020!H\u0007¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\u0003\u001a\u00020\u000f¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020!¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0012¢\u0006\u0004\b*\u0010\u0014J\u0017\u0010+\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\fH\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0007¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u0012¢\u0006\u0004\b0\u0010\u0014J\u0015\u00101\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0015¢\u0006\u0004\b1\u00102R\u001a\u00103\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0014\u00107\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010:\u001a\u0002098\u0001X\u0081\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010>\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010B\u001a\u00020\u00068\u0001X\u0081\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER$\u0010F\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020\u000f8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010IR$\u0010L\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\bL\u0010G\u001a\u0004\bM\u0010I"}, d2 = {"Lokhttp3/internal/connection/Exchange;", "", "Lokhttp3/internal/connection/RealCall;", "p0", "Lokhttp3/EventListener;", "p1", "Lokhttp3/internal/connection/ExchangeFinder;", "p2", "Lokhttp3/internal/http/ExchangeCodec;", "p3", "<init>", "(Lokhttp3/internal/connection/RealCall;Lokhttp3/EventListener;Lokhttp3/internal/connection/ExchangeFinder;Lokhttp3/internal/http/ExchangeCodec;)V", "Ljava/io/IOException;", ExifInterface.LONGITUDE_EAST, "", "", "bodyComplete", "(JZZLjava/io/IOException;)Ljava/io/IOException;", "", "cancel", "()V", "Lokhttp3/Request;", "LSurfaceViewImplementationApi24Impl;", "createRequestBody", "(Lokhttp3/Request;Z)LSurfaceViewImplementationApi24Impl;", "detachWithViolence", "finishRequest", "flushRequest", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "newWebSocketStreams", "()Lokhttp3/internal/ws/RealWebSocket$Streams;", "noNewExchangesOnConnection", "noRequestBody", "Lokhttp3/Response;", "Lokhttp3/ResponseBody;", "openResponseBody", "(Lokhttp3/Response;)Lokhttp3/ResponseBody;", "Lokhttp3/Response$Builder;", "readResponseHeaders", "(Z)Lokhttp3/Response$Builder;", "responseHeadersEnd", "(Lokhttp3/Response;)V", "responseHeadersStart", "trackFailure", "(Ljava/io/IOException;)V", "Lokhttp3/Headers;", "trailers", "()Lokhttp3/Headers;", "webSocketUpgradeFailed", "writeRequestHeaders", "(Lokhttp3/Request;)V", NotificationCompat.CATEGORY_CALL, "Lokhttp3/internal/connection/RealCall;", "getCall$okhttp", "()Lokhttp3/internal/connection/RealCall;", "codec", "Lokhttp3/internal/http/ExchangeCodec;", "Lokhttp3/internal/connection/RealConnection;", "connection", "Lokhttp3/internal/connection/RealConnection;", "getConnection$okhttp", "()Lokhttp3/internal/connection/RealConnection;", "eventListener", "Lokhttp3/EventListener;", "getEventListener$okhttp", "()Lokhttp3/EventListener;", "finder", "Lokhttp3/internal/connection/ExchangeFinder;", "getFinder$okhttp", "()Lokhttp3/internal/connection/ExchangeFinder;", "hasFailure", "Z", "getHasFailure$okhttp", "()Z", "isCoalescedConnection$okhttp", "isCoalescedConnection", "isDuplex", "isDuplex$okhttp", "RequestBodySink", "ResponseBodySource"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Exchange {
    private final RealCall call;
    private final ExchangeCodec codec;
    private final RealConnection connection;
    private final EventListener eventListener;
    private final ExchangeFinder finder;
    private boolean hasFailure;
    private boolean isDuplex;
    private static final byte[] $$c = {36, -74, -79, -21};
    private static final int $$f = 230;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {91, -9, 99, 11, -2, 21, -2, 11, 6, 23, 8, -28, 46, 11, 14, 8, -24, 43, 6, -3, 4, 11, 11, -42, 56, 22, -1, 23, 6, 3, 4, 29, -12, 7, 21, 1, 22, -8, 11, 21, 12, -4, 20, 11, 6, -3, 11, 23, 9, -1, 14, 2, -26, 42, 10, 4, 29, 0, 17, -24, 43, 6, -3, 4, 11, 11, -12, 43, 6, -3, 11, 23, 9, 5, 12, 42, -3, 20, -2, 15, 8, -21, 26, 33, -3, 1, 18, 15, -37, 53, -8, 15, 15, 1, 18, 15, -9, 16, 14, -1, 14, 14, 2, -21, 46, 1, 15, -2, 28, -6, 22, -56};
    private static final int $$e = 24;
    private static final byte[] $$a = {83, -4, -55, -17, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 38;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static char[] TuitionPaymentFragmentbindingInflater1 = {60056, 60050, 60083, 60060, 60055, 60062, 60041, 60117, 60040, 60043, 60058, 60053, 59747, 60049, 59744, 60072, 60059, 59745, 60046, 60063, 60090, 60045, 59746, 60073, 60061, 59748, 60047, 60051, 60048, 59749, 60088, 60052, 60054, 60079, 59751, 60034};
    private static char b = 57191;

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = okhttp3.internal.connection.Exchange.$$a
            int r7 = r7 * 52
            int r7 = r7 + 4
            int r6 = r6 * 14
            int r6 = r6 + 84
            int r8 = r8 + 1
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2d
        L15:
            r3 = r2
        L16:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2d:
            int r7 = r7 + 1
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-10)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.Exchange.a(int, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = okhttp3.internal.connection.Exchange.$$d
            int r6 = r6 + 4
            int r7 = r7 * 34
            int r1 = r7 + 38
            int r5 = r5 * 24
            int r5 = r5 + 84
            byte[] r1 = new byte[r1]
            int r7 = r7 + 37
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r5
            r5 = r7
            r3 = r2
            goto L2b
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r6]
        L2b:
            int r5 = r5 + r4
            int r5 = r5 + (-9)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.Exchange.d(byte, short, short, java.lang.Object[]):void");
    }

    public Exchange(RealCall realCall, EventListener eventListener, ExchangeFinder exchangeFinder, ExchangeCodec exchangeCodec) {
        Intrinsics.checkNotNullParameter(realCall, "");
        Intrinsics.checkNotNullParameter(eventListener, "");
        Intrinsics.checkNotNullParameter(exchangeFinder, "");
        Intrinsics.checkNotNullParameter(exchangeCodec, "");
        this.call = realCall;
        this.eventListener = eventListener;
        this.finder = exchangeFinder;
        this.codec = exchangeCodec;
        this.connection = exchangeCodec.getConnection();
    }

    public final RealCall getCall$okhttp() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        RealCall realCall = this.call;
        int i5 = i2 + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            return realCall;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final EventListener getEventListener$okhttp() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        EventListener eventListener = this.eventListener;
        int i4 = i2 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            return eventListener;
        }
        throw null;
    }

    public final ExchangeFinder getFinder$okhttp() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.finder;
        }
        throw null;
    }

    public final boolean isDuplex$okhttp() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 5;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        boolean z = this.isDuplex;
        int i5 = i3 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean getHasFailure$okhttp() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.hasFailure;
        int i5 = i2 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final RealConnection getConnection$okhttp() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        RealConnection realConnection = this.connection;
        if (i3 != 0) {
            int i4 = 43 / 0;
        }
        return realConnection;
    }

    public final boolean isCoalescedConnection$okhttp() {
        String strHost;
        String strHost2;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            strHost = this.finder.getAddress().url().host();
            strHost2 = this.connection.route().address().url().host();
        } else {
            strHost = this.finder.getAddress().url().host();
            strHost2 = this.connection.route().address().url().host();
        }
        boolean z = !Intrinsics.areEqual(strHost, strHost2);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        return z;
    }

    public final void writeRequestHeaders(Request p0) throws IOException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(p0, "");
                this.eventListener.requestHeadersStart(this.call);
                this.codec.writeRequestHeaders(p0);
                this.eventListener.requestHeadersEnd(this.call, p0);
                throw null;
            }
            Intrinsics.checkNotNullParameter(p0, "");
            this.eventListener.requestHeadersStart(this.call);
            this.codec.writeRequestHeaders(p0);
            this.eventListener.requestHeadersEnd(this.call, p0);
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        } catch (IOException e2) {
            this.eventListener.requestFailed(this.call, e2);
            trackFailure(e2);
            throw e2;
        }
    }

    public final SurfaceViewImplementationApi24Impl createRequestBody(Request p0, boolean p1) throws IOException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        this.isDuplex = p1;
        RequestBody requestBodyBody = p0.body();
        Intrinsics.checkNotNull(requestBodyBody);
        long jContentLength = requestBodyBody.contentLength();
        this.eventListener.requestBodyStart(this.call);
        RequestBodySink requestBodySink = new RequestBodySink(this, this.codec.createRequestBody(p0, jContentLength), jContentLength);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return requestBodySink;
    }

    public final void flushRequest() throws IOException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.codec.flushRequest();
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
        } catch (IOException e2) {
            this.eventListener.requestFailed(this.call, e2);
            trackFailure(e2);
            throw e2;
        }
    }

    public final void finishRequest() throws IOException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.codec.finishRequest();
                return;
            }
            this.codec.finishRequest();
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (IOException e2) {
            this.eventListener.requestFailed(this.call, e2);
            trackFailure(e2);
            throw e2;
        }
    }

    public final void responseHeadersStart() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.eventListener.responseHeadersStart(this.call);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final Response.Builder readResponseHeaders(boolean p0) throws IOException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        try {
            Response.Builder responseHeaders = this.codec.readResponseHeaders(p0);
            if (responseHeaders != null) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 75;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                if (i4 % 2 != 0) {
                    responseHeaders.initExchange$okhttp(this);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                responseHeaders.initExchange$okhttp(this);
            }
            return responseHeaders;
        } catch (IOException e2) {
            this.eventListener.responseFailed(this.call, e2);
            trackFailure(e2);
            throw e2;
        }
    }

    public final void responseHeadersEnd(Response p0) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.eventListener.responseHeadersEnd(this.call, p0);
            throw null;
        }
        Intrinsics.checkNotNullParameter(p0, "");
        this.eventListener.responseHeadersEnd(this.call, p0);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public final ResponseBody openResponseBody(Response p0) throws IOException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        try {
            String strHeader$default = Response.header$default(p0, HttpHeaderParser.HEADER_CONTENT_TYPE, null, 2, null);
            long jReportedContentLength = this.codec.reportedContentLength(p0);
            RealResponseBody realResponseBody = new RealResponseBody(strHeader$default, jReportedContentLength, SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new ResponseBodySource(this, this.codec.openResponseBodySource(p0), jReportedContentLength)));
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 5;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            if (i2 % 2 == 0) {
                return realResponseBody;
            }
            throw null;
        } catch (IOException e2) {
            this.eventListener.responseFailed(this.call, e2);
            trackFailure(e2);
            throw e2;
        }
    }

    public final Headers trailers() throws IOException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Headers headersTrailers = this.codec.trailers();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
        }
        return headersTrailers;
    }

    public final RealWebSocket.Streams newWebSocketStreams() throws SocketException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.call.timeoutEarlyExit();
        RealWebSocket.Streams streamsNewWebSocketStreams$okhttp = this.codec.getConnection().newWebSocketStreams$okhttp(this);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return streamsNewWebSocketStreams$okhttp;
    }

    public final void webSocketUpgradeFailed() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            bodyComplete(-1L, false, false, null);
        } else {
            bodyComplete(-1L, true, true, null);
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void noNewExchangesOnConnection() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        this.codec.getConnection().noNewExchanges$okhttp();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void cancel() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        this.codec.cancel();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void detachWithViolence() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.codec.cancel();
        Object obj = null;
        this.call.messageDone$okhttp(this, true, true, null);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final void trackFailure(IOException p0) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        this.hasFailure = true;
        this.finder.trackFailure(p0);
        this.codec.getConnection().trackFailure$okhttp(this.call, p0);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final <E extends IOException> E bodyComplete(long p0, boolean p1, boolean p2, E p3) {
        int i;
        int i2 = 2 % 2;
        if (p3 != null) {
            trackFailure(p3);
        }
        if (!(!p2)) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 79;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            if (p3 != null) {
                this.eventListener.requestFailed(this.call, p3);
                i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
            } else {
                this.eventListener.requestBodyEnd(this.call, p0);
                i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 31;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
            }
            int i5 = i % 2;
        }
        if (p1) {
            if (p3 != null) {
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 27;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
                if (i6 % 2 != 0) {
                    this.eventListener.responseFailed(this.call, p3);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                this.eventListener.responseFailed(this.call, p3);
            } else {
                this.eventListener.responseBodyEnd(this.call, p0);
            }
        }
        return (E) this.call.messageDone$okhttp(this, p2, p1, p3);
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0083\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u00028\u0000\"\n\b\u0000\u0010\f*\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\nJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014"}, d2 = {"Lokhttp3/internal/connection/Exchange$RequestBodySink;", "LgetBrightness;", "LSurfaceViewImplementationApi24Impl;", "p0", "", "p1", "<init>", "(Lokhttp3/internal/connection/Exchange;LSurfaceViewImplementationApi24Impl;J)V", "", "close", "()V", "Ljava/io/IOException;", ExifInterface.LONGITUDE_EAST, "complete", "(Ljava/io/IOException;)Ljava/io/IOException;", "flush", "LRotationProviderListenerWrapper;", "write", "(LRotationProviderListenerWrapper;J)V", "bytesReceived", "J", "", "closed", "Z", "completed", "contentLength"}, k = 1, mv = {1, 8, 0}, xi = 48)
    final class RequestBodySink extends getBrightness {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;
        final /* synthetic */ Exchange this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestBodySink(Exchange exchange, SurfaceViewImplementationApi24Impl surfaceViewImplementationApi24Impl, long j) {
            super(surfaceViewImplementationApi24Impl);
            Intrinsics.checkNotNullParameter(surfaceViewImplementationApi24Impl, "");
            this.this$0 = exchange;
            this.contentLength = j;
        }

        @Override // defpackage.getBrightness, defpackage.SurfaceViewImplementationApi24Impl
        public final void write(RotationProviderListenerWrapper p0, long p1) throws IOException {
            Intrinsics.checkNotNullParameter(p0, "");
            if (this.closed) {
                throw new IllegalStateException("closed".toString());
            }
            long j = this.contentLength;
            if (j != -1 && this.bytesReceived + p1 > j) {
                StringBuilder sb = new StringBuilder("expected ");
                sb.append(this.contentLength);
                sb.append(" bytes but received ");
                sb.append(this.bytesReceived + p1);
                throw new ProtocolException(sb.toString());
            }
            try {
                super.write(p0, p1);
                this.bytesReceived += p1;
            } catch (IOException e2) {
                throw complete(e2);
            }
        }

        @Override // defpackage.getBrightness, defpackage.SurfaceViewImplementationApi24Impl, java.io.Flushable
        public final void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e2) {
                throw complete(e2);
            }
        }

        @Override // defpackage.getBrightness, defpackage.SurfaceViewImplementationApi24Impl, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            long j = this.contentLength;
            if (j != -1 && this.bytesReceived != j) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                complete(null);
            } catch (IOException e2) {
                throw complete(e2);
            }
        }

        private final <E extends IOException> E complete(E p0) {
            if (this.completed) {
                return p0;
            }
            this.completed = true;
            return (E) this.this$0.bodyComplete(this.bytesReceived, false, true, p0);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00028\u0000\"\n\b\u0000\u0010\f*\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u0016\u0010\u0019\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016"}, d2 = {"Lokhttp3/internal/connection/Exchange$ResponseBodySource;", "LRotationProviderListenerWrapperExternalSyntheticLambda0;", "LtryToComplete;", "p0", "", "p1", "<init>", "(Lokhttp3/internal/connection/Exchange;LtryToComplete;J)V", "", "close", "()V", "Ljava/io/IOException;", ExifInterface.LONGITUDE_EAST, "complete", "(Ljava/io/IOException;)Ljava/io/IOException;", "LRotationProviderListenerWrapper;", "read", "(LRotationProviderListenerWrapper;J)J", "bytesReceived", "J", "", "closed", "Z", "completed", "contentLength", "invokeStartEvent"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class ResponseBodySource extends RotationProviderListenerWrapperExternalSyntheticLambda0 {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;
        private boolean invokeStartEvent;
        final /* synthetic */ Exchange this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResponseBodySource(Exchange exchange, tryToComplete trytocomplete, long j) {
            super(trytocomplete);
            Intrinsics.checkNotNullParameter(trytocomplete, "");
            this.this$0 = exchange;
            this.contentLength = j;
            this.invokeStartEvent = true;
            if (j == 0) {
                complete(null);
            }
        }

        @Override // defpackage.RotationProviderListenerWrapperExternalSyntheticLambda0, defpackage.tryToComplete
        public final long read(RotationProviderListenerWrapper p0, long p1) throws IOException {
            Intrinsics.checkNotNullParameter(p0, "");
            if (this.closed) {
                throw new IllegalStateException("closed".toString());
            }
            try {
                long j = delegate().read(p0, p1);
                if (this.invokeStartEvent) {
                    this.invokeStartEvent = false;
                    this.this$0.getEventListener$okhttp().responseBodyStart(this.this$0.getCall$okhttp());
                }
                if (j == -1) {
                    complete(null);
                    return -1L;
                }
                long j2 = this.bytesReceived + j;
                long j3 = this.contentLength;
                if (j3 != -1 && j2 > j3) {
                    StringBuilder sb = new StringBuilder("expected ");
                    sb.append(this.contentLength);
                    sb.append(" bytes but received ");
                    sb.append(j2);
                    throw new ProtocolException(sb.toString());
                }
                this.bytesReceived = j2;
                if (j2 == j3) {
                    complete(null);
                }
                return j;
            } catch (IOException e2) {
                throw complete(e2);
            }
        }

        @Override // defpackage.RotationProviderListenerWrapperExternalSyntheticLambda0, defpackage.tryToComplete, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            try {
                super.close();
                complete(null);
            } catch (IOException e2) {
                throw complete(e2);
            }
        }

        public final <E extends IOException> E complete(E p0) {
            if (this.completed) {
                return p0;
            }
            this.completed = true;
            if (p0 == null && this.invokeStartEvent) {
                this.invokeStartEvent = false;
                this.this$0.getEventListener$okhttp().responseBodyStart(this.this$0.getCall$okhttp());
            }
            return (E) this.this$0.bodyComplete(this.bytesReceived, true, false, p0);
        }
    }

    private static void c(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        int length;
        char[] cArr2;
        int i3 = 2;
        int i4 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr3 = TuitionPaymentFragmentbindingInflater1;
        int i5 = 1770390596;
        int i6 = 13;
        float f = 0.0f;
        if (cArr3 != null) {
            int i7 = $11 + 65;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i8 = 0;
            while (i8 < length) {
                int i9 = $11 + i6;
                $10 = i9 % 128;
                int i10 = i9 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i8])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 2267;
                        int i11 = 33 - (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1));
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarFadeDuration, jumpTapTimeout, i11, -1927765101, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i8++;
                    int i12 = $10 + 111;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    i3 = 2;
                    i5 = 1770390596;
                    i6 = 13;
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(b)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            byte b5 = (byte) 0;
            byte b6 = b5;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.indexOf("", "", 0, 0), TextUtils.lastIndexOf("", '0', 0) + 2268, 32 - MotionEvent.axisFromString(""), -1927765101, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                } else {
                    try {
                        Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b7 = (byte) 1;
                            byte b8 = (byte) (b7 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (49267 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 3261 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 30 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -127612708, false, $$g(b7, b8, b8), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                            Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b9 = (byte) 3;
                                byte b10 = (byte) (b9 - 3);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ExpandableListView.getPackedPositionChild(0L) + 22879), 594 - ExpandableListView.getPackedPositionType(0L), 17 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1570859318, false, $$g(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                            int i14 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[iIntValue];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i14];
                        } else if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i15 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i16 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i15];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i16];
                        } else {
                            int i17 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i18 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i17];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i18];
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                int i19 = $10 + 63;
                $11 = i19 % 128;
                int i20 = i19 % 2;
            }
        }
        for (int i21 = 0; i21 < i; i21++) {
            cArr4[i21] = (char) (cArr4[i21] ^ 13722);
        }
        objArr[0] = new String(cArr4);
        int i22 = $11 + 103;
        $10 = i22 % 128;
        int i23 = i22 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0244  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v40, types: [boolean, int] */
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
    public final void noRequestBody() throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char absoluteGravity = (char) (31533 - Gravity.getAbsoluteGravity(0, 0));
            int trimmedLength = 921 - TextUtils.getTrimmedLength("");
            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 28;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            byte b3 = bArr[80];
            Object[] objArr3 = new Object[1];
            a(b2, b3, b3, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(absoluteGravity, trimmedLength, doubleTapTimeout, -1048449946, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(new char[]{11, 6, 18, 7, 1, 7, 25, '\r', ' ', 7, '\t', '\r', ' ', 11, 29, 2, '!', 31, 1, Typography.quote, 4, 24}, (byte) (116 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 21, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(new char[]{0, 5, 11, '\n', 11, 2, 20, 18, 4, 11, 2, 28, 2, 31, 13824}, (byte) (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 15, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cCombineMeasuredStates = (char) (31533 - View.combineMeasuredStates(0, 0));
            int iAlpha = 921 - Color.alpha(0);
            int size = 28 - View.MeasureSpec.getSize(0);
            byte b4 = $$a[80];
            byte b5 = b4;
            Object[] objArr6 = new Object[1];
            a(b4, b5, (byte) (b5 | 52), objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cCombineMeasuredStates, iAlpha, size, -778300370, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cLastIndexOf = (char) (31532 - TextUtils.lastIndexOf("", '0'));
                int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 921;
                int iKeyCodeFromString = 28 - KeyEvent.keyCodeFromString("");
                byte[] bArr2 = $$a;
                byte b6 = bArr2[80];
                byte b7 = bArr2[7];
                Object[] objArr7 = new Object[1];
                a(b6, b7, (byte) (b7 | 36), objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, pressedStateDuration, iKeyCodeFromString, -1142834547, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = ~iIdentityHashCode;
            int i7 = (-1768680027) + (((~(1714088586 | i6)) | 26280977) * (-1188));
            int i8 = (~(iIdentityHashCode | (-1714088587))) | 26280977;
            int i9 = ~(59991057 | i6);
            int i10 = i7 + ((i8 | i9) * 594) + (((~((-1714088587) | i6)) | 1680378506 | i9) * 594) + 1954048138;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[0])[0] = i12 ^ (i12 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            c(new char[]{11, 6, 18, 7, 1, 7, 25, '\r', 11, '\n', '\n', '\b', 18, 2, 25, 2, 19, 3, 29, ' ', 3, '!', 11, 0, 7, 22}, (byte) (ExpandableListView.getPackedPositionChild(0L) + 65), ExpandableListView.getPackedPositionType(0L) + 26, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c(new char[]{6, 24, 13874, 13874, 11, 17, ' ', 26, 13876, 13876, 5, 2, 4, 6, 25, 2, '#', 7}, (byte) (KeyEvent.normalizeMetaState(0) + 74), Process.getGidForName("") + 19, objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 27;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i13 % 128;
                    int i14 = i13 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i15 % 128;
                        if (i15 % 2 != 0) {
                            int i16 = 2 / 4;
                        }
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr11 = new Object[1];
            c(new char[]{16, 7, 22, '\t', '\n', 1, 11, 6, 1, '\t', 17, '!', 14, ' ', 2, '#'}, (byte) (TextUtils.lastIndexOf("", '0') + 4), MotionEvent.axisFromString("") + 17, objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            c(new char[]{7, 25, 11, 17, 25, 2, 29, ' ', 4, '\b', '\t', 26, 31, ' ', 23, 1}, (byte) (66 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), Color.alpha(0) + 16, objArr12);
            try {
                Object[] objArr13 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue()), 0, 1954048138};
                byte[] bArr3 = $$d;
                byte b8 = bArr3[35];
                Object[] objArr14 = new Object[1];
                d(b8, bArr3[26], b8, objArr14);
                Class<?> cls4 = Class.forName((String) objArr14[0]);
                byte b9 = bArr3[57];
                byte b10 = b9;
                Object[] objArr15 = new Object[1];
                d(b10, (byte) (b10 | 70), b9, objArr15);
                Object[] objArr16 = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cAxisFromString = (char) (MotionEvent.axisFromString("") + 31534);
                    int iMyTid = (Process.myTid() >> 22) + 921;
                    int maxKeyCode = 28 - (KeyEvent.getMaxKeyCode() >> 16);
                    byte[] bArr4 = $$a;
                    byte b11 = bArr4[80];
                    byte b12 = bArr4[7];
                    Object[] objArr17 = new Object[1];
                    a(b11, b12, (byte) (b12 | 36), objArr17);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cAxisFromString, iMyTid, maxKeyCode, -1142834547, false, (String) objArr17[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr16);
                try {
                    Object[] objArr18 = new Object[1];
                    c(new char[]{11, 6, 18, 7, 1, 7, 25, '\r', ' ', 7, '\t', '\r', ' ', 11, 29, 2, '!', 31, 1, Typography.quote, 4, 24}, (byte) (View.resolveSizeAndState(0, 0, 0) + 115), 22 - View.MeasureSpec.getSize(0), objArr18);
                    Class<?> cls5 = Class.forName((String) objArr18[0]);
                    Object[] objArr19 = new Object[1];
                    c(new char[]{0, 5, 11, '\n', 11, 2, 20, 18, 4, 11, 2, 28, 2, 31, 13824}, (byte) (1 - (ViewConfiguration.getLongPressTimeout() >> 16)), 15 - View.MeasureSpec.getSize(0), objArr19);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c = (char) (31533 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                        int tapTimeout = 921 - (ViewConfiguration.getTapTimeout() >> 16);
                        int iGreen = 28 - Color.green(0);
                        byte b13 = $$a[80];
                        byte b14 = b13;
                        Object[] objArr20 = new Object[1];
                        a(b13, b14, (byte) (b14 | 52), objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, tapTimeout, iGreen, -778300370, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cRed = (char) (Color.red(0) + 31533);
                        int iMakeMeasureSpec = 921 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 28;
                        byte[] bArr5 = $$a;
                        byte b15 = bArr5[7];
                        byte b16 = bArr5[80];
                        Object[] objArr21 = new Object[1];
                        a(b15, b16, b16, objArr21);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cRed, iMakeMeasureSpec, scrollBarSize, -1048449946, false, (String) objArr21[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr16;
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
        int i17 = ((int[]) objArr[1])[0];
        int i18 = ((int[]) objArr[3])[0];
        if (i18 == i17) {
            int i19 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i20 = i19 + (((~((-1060021396) | iIdentityHashCode2)) | 362876571) * 262) + 421308759 + (((~((~iIdentityHashCode2) | (-1060021396))) | 362876571) * 262);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr2[0])[0] = i22 ^ (i22 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i23 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i23 % 128;
                int i24 = i23 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i18 / (((i18 - 1) * i18) % 2), 0).show();
            int i25 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i26 = (-1332262189) + ((~(iIdentityHashCode3 | 800312784)) * 216);
            int i27 = ~iIdentityHashCode3;
            int i28 = i25 + i26 + (((-268959756) | i27) * (-216)) + (((~(i27 | 800312784)) | 973766859) * 216);
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr2[0])[0] = i30 ^ (i30 << 5);
            int i31 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 45;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i31 % 128;
            int i32 = i31 % 2;
        }
        RealCall realCall = this.call;
        int i33 = ((int[]) objArr2[0])[0];
        int i34 = i33 * i33;
        int i35 = -(1915567412 * i33);
        int i36 = (i34 ^ i35) + ((i34 & i35) << 1);
        int i37 = -(i33 * (-1607678728));
        int i38 = ((i36 ^ i37) + ((i37 & i36) << 1)) - 306369052;
        int i39 = ((i38 >> 25) - 255) / 128;
        int i40 = (i38 - (~((i39 & 1) + (i39 | 1)))) - 1;
        int i41 = i38 >> 21;
        int i42 = (((i41 | (-4095)) << 1) - (i41 ^ (-4095))) / 2048;
        int i43 = (-(i40 ^ ((i42 & 1) + (i42 | 1)))) + 3;
        int i44 = i43 >> 21;
        int i45 = ((((i44 | (-4095)) << 1) - (i44 ^ (-4095))) / 2048) + 1;
        realCall.messageDone$okhttp(this, 390 / ((i43 & (-((i45 & 1) + (i45 | 1)))) * 130), false, null);
    }

    private static String $$g(short s, short s2, byte b2) {
        int i = s + 113;
        int i2 = s2 * 2;
        byte[] bArr = $$c;
        int i3 = 3 - (b2 * 2);
        byte[] bArr2 = new byte[1 - i2];
        int i4 = 0 - i2;
        int i5 = -1;
        if (bArr == null) {
            i += i3;
            i3 = i3;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            int i7 = i3 + 1;
            bArr2[i6] = (byte) i;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            i = bArr[i7] + i;
            i3 = i7;
            i5 = i6;
        }
    }
}
