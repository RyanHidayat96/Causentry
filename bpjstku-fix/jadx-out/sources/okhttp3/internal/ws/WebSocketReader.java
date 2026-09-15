package okhttp3.internal.ws;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.RotationProvider1;
import defpackage.RotationProviderListenerWrapper;
import defpackage.closeSurface;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.internal.Util;
import okio.ByteString;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u00016B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ\u000f\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u000eJ\u000f\u0010\u0014\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u000eR\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0016R\u0016\u0010 \u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010\u0016R\u0016\u0010!\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010\u0016R\u0016\u0010#\u001a\u0004\u0018\u00010\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010&\u001a\u0004\u0018\u00010%8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0016R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u0010\u0016R\u0016\u00101\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b1\u0010\u0016R\u001a\u00102\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105"}, d2 = {"Lokhttp3/internal/ws/WebSocketReader;", "Ljava/io/Closeable;", "", "p0", "LRotationProvider1;", "p1", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "p2", "p3", "p4", "<init>", "(ZLRotationProvider1;Lokhttp3/internal/ws/WebSocketReader$FrameCallback;ZZ)V", "", "close", "()V", "processNextFrame", "readControlFrame", "readHeader", "readMessage", "readMessageFrame", "readUntilNonControlFrame", "closed", "Z", "LRotationProviderListenerWrapper;", "controlFrameBuffer", "LRotationProviderListenerWrapper;", "frameCallback", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "", "frameLength", "J", "isClient", "isControlFrame", "isFinalFrame", "LRotationProviderListenerWrapper$TuitionPaymentFragmentbindingInflater1;", "maskCursor", "LRotationProviderListenerWrapper$TuitionPaymentFragmentbindingInflater1;", "", "maskKey", "[B", "messageFrameBuffer", "Lokhttp3/internal/ws/MessageInflater;", "messageInflater", "Lokhttp3/internal/ws/MessageInflater;", "noContextTakeover", "", "opcode", "I", "perMessageDeflate", "readingCompressedMessage", "source", "LRotationProvider1;", "getSource", "()LRotationProvider1;", "FrameCallback"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WebSocketReader implements Closeable {
    private boolean closed;
    private final RotationProviderListenerWrapper controlFrameBuffer;
    private final FrameCallback frameCallback;
    private long frameLength;
    private final boolean isClient;
    private boolean isControlFrame;
    private boolean isFinalFrame;
    private final RotationProviderListenerWrapper.TuitionPaymentFragmentbindingInflater1 maskCursor;
    private final byte[] maskKey;
    private final RotationProviderListenerWrapper messageFrameBuffer;
    private MessageInflater messageInflater;
    private final boolean noContextTakeover;
    private int opcode;
    private final boolean perMessageDeflate;
    private boolean readingCompressedMessage;
    private final RotationProvider1 source;
    private static final byte[] $$c = {58, 66, -1, 15};
    private static final int $$f = 159;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {46, 47, -18, 64, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -59, 6, 10, -13, 20, -14, 12, 7, -11, 72, -63, 7, 14, 1, 1, -11, 72, -48, -12, 10, 62, -60, 1, 14, 2, -4, 65, -73, 3, 26, -12};
    private static final int $$e = 17;
    private static final byte[] $$a = {68, -119, -76, 97, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 172;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static char[] TuitionPaymentFragmentbindingInflater1 = {45565, 40262, 59536, 14322, 803, 28273, 48576, 35166, 54355, 9147, 3770, 23155, 43413, 62667, 49200, 12149, 31409, 17963, 38232, 57519, 53231, 6963, 19419, 26470, 4791, 52690, 63773, 37983, 18402, 29440, 11899, 55691, 62682, 41078, 21415, 3831, 14851, 45565, 40262, 59536, 14322, 803, 28273, 48576, 35166, 54365, 9144, 3812, 23054, 43437, 62683, 49200, 12153, 31402, 17921, 38208, 57529, 53208, 6960, 26262, 46549, 33053, 60524, 45567, 40285, 59526, 14322, 809, 28278, 48592, 35121, 54348, 9144, 3832, 23113, 43407, 62681, 49200, 12153, 31411, 17926, 45558, 40265, 59522, 14305, 866, 28276, 48581, 35102, 54363, 9190, 3783, 23129, 43423, 62668, 49185, 12157, 45557, 40268, 59537, 14318, 824, 28273, 48592, 35081, 54388, 9129, 3815, 23112, 43439, 62679, 49184, 12149};
    private static long b = -5568840042031506136L;

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u000bH&¢\u0006\u0004\b\t\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\f"}, d2 = {"Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "", "", "p0", "", "p1", "", "onReadClose", "(ILjava/lang/String;)V", "onReadMessage", "(Ljava/lang/String;)V", "Lokio/ByteString;", "(Lokio/ByteString;)V", "onReadPing", "onReadPong"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface FrameCallback {
        void onReadClose(int p0, String p1);

        void onReadMessage(String p0) throws IOException;

        void onReadMessage(ByteString p0) throws IOException;

        void onReadPing(ByteString p0);

        void onReadPong(ByteString p0);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = okhttp3.internal.ws.WebSocketReader.$$a
            int r7 = r7 * 52
            int r7 = 55 - r7
            int r6 = r6 * 14
            int r6 = 98 - r6
            int r1 = 53 - r8
            byte[] r1 = new byte[r1]
            int r8 = 52 - r8
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L32
        L16:
            r3 = r2
        L17:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r6 = r6 + 1
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L32:
            int r3 = r3 + r6
            int r6 = r3 + (-10)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.WebSocketReader.a(int, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 49
            int r7 = 53 - r7
            byte[] r0 = okhttp3.internal.ws.WebSocketReader.$$d
            int r8 = r8 * 49
            int r1 = r8 + 1
            int r6 = 99 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2b
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2b:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + 3
            int r7 = r3 + 1
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.WebSocketReader.d(short, short, short, java.lang.Object[]):void");
    }

    public WebSocketReader(boolean z, RotationProvider1 rotationProvider1, FrameCallback frameCallback, boolean z2, boolean z3) {
        byte[] bArr;
        Intrinsics.checkNotNullParameter(rotationProvider1, "");
        Intrinsics.checkNotNullParameter(frameCallback, "");
        this.isClient = z;
        this.source = rotationProvider1;
        this.frameCallback = frameCallback;
        this.perMessageDeflate = z2;
        this.noContextTakeover = z3;
        this.controlFrameBuffer = new RotationProviderListenerWrapper();
        this.messageFrameBuffer = new RotationProviderListenerWrapper();
        RotationProviderListenerWrapper.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = null;
        if (z) {
            bArr = null;
        } else {
            bArr = new byte[4];
            int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
            if (i % 2 == 0) {
                int i2 = 3 / 4;
            } else {
                int i3 = 2 % 2;
            }
        }
        this.maskKey = bArr;
        if (z) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } else {
            tuitionPaymentFragmentbindingInflater1 = new RotationProviderListenerWrapper.TuitionPaymentFragmentbindingInflater1();
        }
        this.maskCursor = tuitionPaymentFragmentbindingInflater1;
        int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
        int i8 = i7 % 2;
    }

    public final RotationProvider1 getSource() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        RotationProvider1 rotationProvider1 = this.source;
        int i5 = i2 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            return rotationProvider1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0212  */
    /* JADX WARN: Code duplicated, block: B:44:0x0213  */
    private static void c(int i, int i2, char c, Object[] objArr) throws Throwable {
        Object obj;
        Throwable cause;
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (true) {
            obj = null;
            if (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= i2) {
                break;
            }
            int i4 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1[i + i4])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char c2 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                    int doubleTapTimeout = 2187 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int modifierMetaStateMask = 39 - ((byte) KeyEvent.getModifierMetaStateMask());
                    byte b2 = (byte) ($$f & 2);
                    byte b3 = (byte) (b2 - 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, doubleTapTimeout, modifierMetaStateMask, 841711447, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(b), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char c3 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 33018);
                    int i5 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3011;
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 26;
                    byte b4 = (byte) ($$c[2] + 1);
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c3, i5, iMakeMeasureSpec, 321985076, false, $$g(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cResolveSize = (char) (View.resolveSize(0, 0) + 36505);
                    int iMyTid = 3376 - (Process.myTid() >> 22);
                    int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 17;
                    byte b6 = (byte) (-$$c[2]);
                    byte b7 = (byte) (b6 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSize, iMyTid, touchSlop, -968507904, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i6 = $10 + 83;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char maximumFlingVelocity = (char) (36505 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                    int mirror = 3424 - AndroidCharacter.getMirror('0');
                    int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 17;
                    byte b8 = (byte) (-$$c[2]);
                    byte b9 = (byte) (b8 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maximumFlingVelocity, mirror, fadingEdgeLength, -968507904, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                obj.hashCode();
                throw null;
            }
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr6 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 36505);
                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 3376;
                int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 18;
                byte b10 = (byte) (-$$c[2]);
                byte b11 = (byte) (b10 - 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(keyRepeatDelay, iCombineMeasuredStates, bitsPerPixel, -968507904, false, $$g(b10, b11, b11), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr);
        int i7 = $11 + 97;
        $10 = i7 % 128;
        int i8 = i7 % 2;
    }

    public final void processNextFrame() throws IOException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            readHeader();
            throw null;
        }
        readHeader();
        if (this.isControlFrame) {
            readControlFrame();
            return;
        }
        readMessageFrame();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 11 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00b8  */
    private final void readHeader() throws IOException {
        boolean z;
        boolean z2;
        boolean z3;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        if (this.closed) {
            throw new IOException("closed");
        }
        long timeoutNanos = this.source.timeout().getTimeoutNanos();
        this.source.timeout().clearTimeout();
        try {
            int iAnd = Util.and(this.source.cancel(), 255);
            this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
            int i4 = iAnd & 15;
            this.opcode = i4;
            boolean z4 = (iAnd & 128) != 0;
            this.isFinalFrame = z4;
            if ((iAnd & 8) != 0) {
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 125;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                int i6 = i5 % 2;
                z = true;
            } else {
                z = false;
            }
            this.isControlFrame = z;
            if (z && !z4) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z5 = (iAnd & 64) != 0;
            if (i4 == 1 || i4 == 2) {
                if (!z5) {
                    z2 = false;
                } else {
                    if (!this.perMessageDeflate) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z2 = true;
                }
                this.readingCompressedMessage = z2;
            } else {
                int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
                int i8 = i7 % 2;
                if (z5) {
                    throw new ProtocolException("Unexpected rsv1 flag");
                }
            }
            if ((iAnd & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((iAnd & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            int iAnd2 = Util.and(this.source.cancel(), 255);
            if ((iAnd2 & 128) != 0) {
                int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
                z3 = i9 % 2 == 0;
            }
            boolean z6 = this.isClient;
            if (z3 == z6) {
                throw new ProtocolException(z6 ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j = iAnd2 & 127;
            this.frameLength = j;
            if (j == 126) {
                int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
                if (i10 % 2 == 0) {
                    this.frameLength = Util.and(this.source.MediaBrowserCompat(), 65535);
                    int i11 = 5 / 0;
                } else {
                    this.frameLength = Util.and(this.source.MediaBrowserCompat(), 65535);
                }
            } else if (j == 127) {
                int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 53;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
                int i13 = i12 % 2;
                long jINotificationSideChannelDefault = this.source.INotificationSideChannelDefault();
                this.frameLength = jINotificationSideChannelDefault;
                if (jINotificationSideChannelDefault < 0) {
                    StringBuilder sb = new StringBuilder("Frame length 0x");
                    sb.append(Util.toHexString(this.frameLength));
                    sb.append(" > 0x7FFFFFFFFFFFFFFF");
                    throw new ProtocolException(sb.toString());
                }
            }
            if (this.isControlFrame && this.frameLength > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z3) {
                int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 75;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
                if (i14 % 2 == 0) {
                    RotationProvider1 rotationProvider1 = this.source;
                    byte[] bArr = this.maskKey;
                    Intrinsics.checkNotNull(bArr);
                    rotationProvider1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bArr);
                    return;
                }
                RotationProvider1 rotationProvider2 = this.source;
                byte[] bArr2 = this.maskKey;
                Intrinsics.checkNotNull(bArr2);
                rotationProvider2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bArr2);
                throw null;
            }
        } catch (Throwable th) {
            this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    private final void readControlFrame() throws IOException {
        short sMediaBrowserCompat;
        int i = 2 % 2;
        long j = this.frameLength;
        String strB = "";
        if (j > 0) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 119;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            this.source.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.controlFrameBuffer, j);
            if (!this.isClient) {
                RotationProviderListenerWrapper rotationProviderListenerWrapper = this.controlFrameBuffer;
                RotationProviderListenerWrapper.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.maskCursor;
                Intrinsics.checkNotNull(tuitionPaymentFragmentbindingInflater1);
                Intrinsics.checkNotNullParameter(tuitionPaymentFragmentbindingInflater1, "");
                closeSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(rotationProviderListenerWrapper, tuitionPaymentFragmentbindingInflater1);
                this.maskCursor.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0L);
                WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
                RotationProviderListenerWrapper.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater2 = this.maskCursor;
                byte[] bArr = this.maskKey;
                Intrinsics.checkNotNull(bArr);
                webSocketProtocol.toggleMask(tuitionPaymentFragmentbindingInflater2, bArr);
                this.maskCursor.close();
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 77;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        switch (this.opcode) {
            case 8:
                long j2 = this.controlFrameBuffer.size;
                if (j2 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 53;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
                if (i6 % 2 == 0 ? j2 == 0 : j2 == 1) {
                    sMediaBrowserCompat = 1005;
                } else {
                    sMediaBrowserCompat = this.controlFrameBuffer.MediaBrowserCompat();
                    RotationProviderListenerWrapper rotationProviderListenerWrapper2 = this.controlFrameBuffer;
                    strB = rotationProviderListenerWrapper2.b(rotationProviderListenerWrapper2.size, Charsets.UTF_8);
                    String strCloseCodeExceptionMessage = WebSocketProtocol.INSTANCE.closeCodeExceptionMessage(sMediaBrowserCompat);
                    if (strCloseCodeExceptionMessage != null) {
                        throw new ProtocolException(strCloseCodeExceptionMessage);
                    }
                }
                this.frameCallback.onReadClose(sMediaBrowserCompat, strB);
                this.closed = true;
                return;
            case 9:
                FrameCallback frameCallback = this.frameCallback;
                RotationProviderListenerWrapper rotationProviderListenerWrapper3 = this.controlFrameBuffer;
                frameCallback.onReadPing(rotationProviderListenerWrapper3.TuitionPaymentFragmentbindingInflater1(rotationProviderListenerWrapper3.size));
                return;
            case 10:
                FrameCallback frameCallback2 = this.frameCallback;
                RotationProviderListenerWrapper rotationProviderListenerWrapper4 = this.controlFrameBuffer;
                frameCallback2.onReadPong(rotationProviderListenerWrapper4.TuitionPaymentFragmentbindingInflater1(rotationProviderListenerWrapper4.size));
                return;
            default:
                StringBuilder sb = new StringBuilder("Unknown control opcode: ");
                sb.append(Util.toHexString(this.opcode));
                throw new ProtocolException(sb.toString());
        }
    }

    private final void readMessageFrame() throws IOException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.opcode;
        if (i4 != 1 && i4 != 2) {
            StringBuilder sb = new StringBuilder("Unknown opcode: ");
            sb.append(Util.toHexString(i4));
            throw new ProtocolException(sb.toString());
        }
        readMessage();
        if (this.readingCompressedMessage) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
            MessageInflater messageInflater = this.messageInflater;
            if (messageInflater == null) {
                messageInflater = new MessageInflater(this.noContextTakeover);
                this.messageInflater = messageInflater;
            }
            messageInflater.inflate(this.messageFrameBuffer);
        }
        if (i4 != 1) {
            FrameCallback frameCallback = this.frameCallback;
            RotationProviderListenerWrapper rotationProviderListenerWrapper = this.messageFrameBuffer;
            frameCallback.onReadMessage(rotationProviderListenerWrapper.TuitionPaymentFragmentbindingInflater1(rotationProviderListenerWrapper.size));
        } else {
            FrameCallback frameCallback2 = this.frameCallback;
            RotationProviderListenerWrapper rotationProviderListenerWrapper2 = this.messageFrameBuffer;
            frameCallback2.onReadMessage(rotationProviderListenerWrapper2.b(rotationProviderListenerWrapper2.size, Charsets.UTF_8));
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 33;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    private final void readUntilNonControlFrame() throws IOException {
        int i = 2 % 2;
        while (!this.closed) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            readHeader();
            if (!this.isControlFrame) {
                return;
            }
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 123;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            readControlFrame();
            if (i5 != 0) {
                int i6 = 30 / 0;
            }
        }
    }

    private final void readMessage() throws IOException {
        int i = 2 % 2;
        while (!this.closed) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            long j = this.frameLength;
            if (j > 0) {
                this.source.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.messageFrameBuffer, j);
                if (!this.isClient) {
                    int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 125;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                    int i5 = i4 % 2;
                    RotationProviderListenerWrapper rotationProviderListenerWrapper = this.messageFrameBuffer;
                    RotationProviderListenerWrapper.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.maskCursor;
                    Intrinsics.checkNotNull(tuitionPaymentFragmentbindingInflater1);
                    Intrinsics.checkNotNullParameter(tuitionPaymentFragmentbindingInflater1, "");
                    closeSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(rotationProviderListenerWrapper, tuitionPaymentFragmentbindingInflater1);
                    this.maskCursor.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.messageFrameBuffer.size - this.frameLength);
                    WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
                    RotationProviderListenerWrapper.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater2 = this.maskCursor;
                    byte[] bArr = this.maskKey;
                    Intrinsics.checkNotNull(bArr);
                    webSocketProtocol.toggleMask(tuitionPaymentFragmentbindingInflater2, bArr);
                    this.maskCursor.close();
                }
            }
            if (!(!this.isFinalFrame)) {
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 101;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 86 / 0;
                    return;
                }
                return;
            }
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 105;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
            if (i8 % 2 != 0) {
                readUntilNonControlFrame();
                int i9 = 86 / 0;
                if (this.opcode != 0) {
                    StringBuilder sb = new StringBuilder("Expected continuation opcode. Got: ");
                    sb.append(Util.toHexString(this.opcode));
                    throw new ProtocolException(sb.toString());
                }
            } else {
                readUntilNonControlFrame();
                if (this.opcode != 0) {
                    StringBuilder sb2 = new StringBuilder("Expected continuation opcode. Got: ");
                    sb2.append(Util.toHexString(this.opcode));
                    throw new ProtocolException(sb2.toString());
                }
            }
        }
        throw new IOException("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (31534 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
            int edgeSlop = 921 - (ViewConfiguration.getEdgeSlop() >> 16);
            int iIndexOf = 27 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[80], bArr[37], (byte) 52, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, edgeSlop, iIndexOf, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 22, (char) (Color.rgb(0, 0, 0) + 16777216), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(22 - (KeyEvent.getMaxKeyCode() >> 16), Process.getGidForName("") + 16, (char) (64034 - (ViewConfiguration.getTapTimeout() >> 16)), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char capsMode = (char) (31533 - TextUtils.getCapsMode("", 0, 0));
            int threadPriority = 921 - ((Process.getThreadPriority(0) + 20) >> 6);
            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 28;
            byte[] bArr2 = $$a;
            byte b2 = bArr2[37];
            Object[] objArr5 = new Object[1];
            a(b2, b2, bArr2[80], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(capsMode, threadPriority, keyRepeatDelay, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cGreen = (char) (Color.green(0) + 31533);
                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 921;
                int i6 = 29 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                byte[] bArr3 = $$a;
                Object[] objArr6 = new Object[1];
                a(bArr3[37], bArr3[80], bArr3[33], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cGreen, absoluteGravity, i6, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = ~iIdentityHashCode;
            int i8 = ((((-1992129140) + (((~((-568985810) | i7)) | (~((-1205093835) | i7))) * (-867))) + ((((~((-568985810) | iIdentityHashCode)) | 29360320) | (~((-1205093835) | iIdentityHashCode))) * (-1734))) + (((~(iIdentityHashCode | (-1175733515))) | ((~(i7 | (-29360321))) | (~((-539625490) | iIdentityHashCode)))) * 867)) - 1575273132;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(KeyEvent.keyCodeFromString("") + 37, TextUtils.getOffsetAfter("", 0) + 26, (char) KeyEvent.normalizeMetaState(0), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(ExpandableListView.getPackedPositionGroup(0L) + 63, 18 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) View.MeasureSpec.getSize(0), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(81 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 16, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(97 - (ViewConfiguration.getEdgeSlop() >> 16), 16 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -1575273132};
                byte[] bArr4 = $$d;
                byte b3 = bArr4[35];
                byte b4 = (byte) (b3 - 1);
                byte b5 = b3;
                Object[] objArr13 = new Object[1];
                d(b4, b5, b5, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b6 = bArr4[35];
                byte b7 = (byte) (b6 - 1);
                Object[] objArr14 = new Object[1];
                d(b6, b7, b7, objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c2 = (char) (31533 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                    int offsetAfter = 921 - TextUtils.getOffsetAfter("", 0);
                    int iArgb = Color.argb(0, 0, 0, 0) + 28;
                    byte[] bArr5 = $$a;
                    Object[] objArr15 = new Object[1];
                    a(bArr5[37], bArr5[80], bArr5[33], objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, offsetAfter, iArgb, -1142834547, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr16 = new Object[1];
                    c(TextUtils.indexOf("", "", 0, 0), TextUtils.getOffsetAfter("", 0) + 22, (char) (ViewConfiguration.getScrollBarSize() >> 8), objArr16);
                    Class<?> cls5 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    c(ImageFormat.getBitsPerPixel(0) + 23, ExpandableListView.getPackedPositionType(0L) + 15, (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 64034), objArr17);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char mode = (char) (31533 - View.MeasureSpec.getMode(0));
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 921;
                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 28;
                        byte[] bArr6 = $$a;
                        byte b8 = bArr6[37];
                        Object[] objArr18 = new Object[1];
                        a(b8, b8, bArr6[80], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(mode, windowTouchSlop, maxKeyCode, -778300370, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char mirror = (char) (31581 - AndroidCharacter.getMirror('0'));
                        int i11 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 920;
                        int iResolveSize = 28 - View.resolveSize(0, 0);
                        byte[] bArr7 = $$a;
                        Object[] objArr19 = new Object[1];
                        a(bArr7[80], bArr7[37], (byte) 52, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mirror, i11, iResolveSize, -1048449946, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
        int i12 = ((int[]) objArr[1])[0];
        int i13 = ((int[]) objArr[3])[0];
        if (i13 == i12) {
            int i14 = ((int[]) objArr[0])[0];
            Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i15 = ~((-1536733744) | iIdentityHashCode2);
            int i16 = ~iIdentityHashCode2;
            int i17 = i14 + 1044566493 + ((i15 | (~(1606270575 | i16))) * (-406)) + ((~((-1368924676) | i16)) * (-406)) + (((~(iIdentityHashCode2 | (-237345901))) | (~(1536733743 | i16))) * 406);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr20[0])[0] = i19 ^ (i19 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i20 % 128;
                int i21 = 2;
                int i22 = i20 % 2;
                int i23 = 0;
                while (i23 < strArr.length) {
                    int i24 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i24 % 128;
                    int i25 = i24 % i21;
                    arrayList.add(strArr[i23]);
                    i23++;
                    i21 = 2;
                }
            }
            Toast.makeText((Context) null, i13 / (((i13 - 1) * i13) % 2), 0).show();
            int i26 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int i27 = ~System.identityHashCode(this);
            int i28 = i26 + (((1833208815 + (((~(1069370879 | i27)) | 704708764) * (-828))) + ((i27 | 1069370879) * (-828))) - 675825664);
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr21[0])[0] = i30 ^ (i30 << 5);
        }
        MessageInflater messageInflater = this.messageInflater;
        if (messageInflater != null) {
            messageInflater.close();
        }
    }

    private static String $$g(byte b2, int i, short s) {
        int i2 = 4 - (i * 4);
        byte[] bArr = $$c;
        int i3 = s * 3;
        int i4 = 115 - (b2 * 3);
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i4 = i3 + i4;
            i2++;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i4;
            if (i5 == i3) {
                return new String(bArr2, 0);
            }
            i4 += bArr[i2];
            i2++;
        }
    }
}
