package okhttp3.internal.http2;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u0010\u0010\n\u001a\u00020\u0007HÇ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0007HÇ\u0003¢\u0006\u0004\b\f\u0010\u000bJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u0007HÇ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001a"}, d2 = {"Lokhttp3/internal/http2/Header;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Lokio/ByteString;", "(Lokio/ByteString;Ljava/lang/String;)V", "(Lokio/ByteString;Lokio/ByteString;)V", "component1", "()Lokio/ByteString;", "component2", "copy", "(Lokio/ByteString;Lokio/ByteString;)Lokhttp3/internal/http2/Header;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "hpackSize", "I", "name", "Lokio/ByteString;", "value", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Header {
    public static final ByteString PSEUDO_PREFIX;
    public static final ByteString RESPONSE_STATUS;
    public static final String RESPONSE_STATUS_UTF8 = ":status";
    public static final ByteString TARGET_AUTHORITY;
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";
    public static final ByteString TARGET_METHOD;
    public static final String TARGET_METHOD_UTF8 = ":method";
    public static final ByteString TARGET_PATH;
    public static final String TARGET_PATH_UTF8 = ":path";
    public static final ByteString TARGET_SCHEME;
    public static final String TARGET_SCHEME_UTF8 = ":scheme";
    private static char[] TuitionPaymentFragmentbindingInflater1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final int hpackSize;
    public final ByteString name;
    public final ByteString value;
    private static final byte[] $$c = {58, 66, -14, -31};
    private static final int $$f = 38;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {57, -56, 23, -36, 39, -36, 39, 10, 16, -19, 42, -5, 22, 8, -6, 7, -25, 38, 19, 8, -2, 7, 10, 16, -20, 39, -36, 39, 10, 16, -19, 42, -5, 22, 8, -6, 7, -23, 57, -9, 17, 14, -36, 33, 21, -2, 16, 1, 21, 41, -4, 19, -3, 14, 7, -22, 25, 32, -4, 0, 17, 14, -38, 52, -9, 14, 14, 0, 17, 14, -10, 15, 13, -2, 13, 13, 1, -22, 45, 0, 14, -3, 27, -7, 21, -57};
    private static final int $$e = 128;
    private static final byte[] $$a = {58, 66, -14, -31, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 9;
    private static int b = 0;
    private static int asBinder = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 52
            int r7 = r7 + 4
            byte[] r0 = okhttp3.internal.http2.Header.$$a
            int r9 = r9 * 3
            int r9 = r9 + 84
            int r8 = r8 * 15
            int r8 = 53 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r9 = r7
            r3 = r8
            r4 = r2
            goto L2c
        L17:
            r3 = r2
            r6 = r9
            r9 = r7
            r7 = r6
        L1b:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2a:
            r3 = r0[r9]
        L2c:
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            int r9 = r9 + 1
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Header.a(byte, byte, byte, java.lang.Object[]):void");
    }

    private static void d(byte b2, byte b3, short s, Object[] objArr) {
        int i = 84 - (b2 * 5);
        int i2 = (s * 45) + 4;
        int i3 = b3 * 8;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[46 - i3];
        int i4 = 45 - i3;
        int i5 = -1;
        if (bArr == null) {
            i = (i + i4) - 8;
            i2++;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i = (i + bArr[i2]) - 8;
                i2++;
            }
        }
    }

    public Header(ByteString byteString, ByteString byteString2) {
        Intrinsics.checkNotNullParameter(byteString, "");
        Intrinsics.checkNotNullParameter(byteString2, "");
        this.name = byteString;
        this.value = byteString2;
        this.hpackSize = byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3() + 32 + byteString2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Header(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        ByteString.Companion companion = ByteString.INSTANCE;
        ByteString byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ByteString.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str);
        ByteString.Companion companion2 = ByteString.INSTANCE;
        this(byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault1, ByteString.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str2));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(ByteString byteString, String str) {
        this(byteString, ByteString.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str));
        Intrinsics.checkNotNullParameter(byteString, "");
        Intrinsics.checkNotNullParameter(str, "");
        ByteString.Companion companion = ByteString.INSTANCE;
    }

    private static void c(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i4 = $11 + 69;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1[i + i6])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 2187 - Color.blue(0), TextUtils.indexOf("", "") + 40, 841711447, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 33017), KeyEvent.normalizeMetaState(0) + 3011, ((byte) KeyEvent.getModifierMetaStateMask()) + 27, 321985076, false, $$g(b4, b5, (byte) (b5 - 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 36505), (Process.myTid() >> 22) + 3376, Color.alpha(0) + 17, -968507904, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                int i7 = $10 + 69;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 5 % 3;
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i9 = $10 + 105;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                byte b8 = (byte) 0;
                byte b9 = (byte) (b8 + 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (36504 - TextUtils.lastIndexOf("", '0', 0)), (Process.myPid() >> 22) + 3376, (ViewConfiguration.getTapTimeout() >> 16) + 17, -968507904, false, $$g(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    public final String toString() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = asBinder + 113;
        b = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char windowTouchSlop = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 43042);
            int size = 3111 - View.MeasureSpec.getSize(0);
            int i4 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21;
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            a(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(windowTouchSlop, size, i4, -1272852037, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 23 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) TextUtils.getOffsetBefore("", 0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(22 - View.MeasureSpec.getMode(0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 15, (char) Drawable.resolveOpacity(0, 0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cCombineMeasuredStates = (char) (43042 - View.combineMeasuredStates(0, 0));
            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 3111;
            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 22;
            byte[] bArr = $$a;
            byte b4 = bArr[5];
            byte b5 = bArr[7];
            Object[] objArr5 = new Object[1];
            a(b4, b5, b5, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cCombineMeasuredStates, edgeSlop, threadPriority, -1269618118, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char packedPositionChild = (char) (43041 - ExpandableListView.getPackedPositionChild(0L));
                int absoluteGravity = 3111 - Gravity.getAbsoluteGravity(0, 0);
                int packedPositionChild2 = 21 - ExpandableListView.getPackedPositionChild(0L);
                byte[] bArr2 = $$a;
                Object[] objArr6 = new Object[1];
                a(bArr2[40], bArr2[5], bArr2[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionChild, absoluteGravity, packedPositionChild2, 154975793, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i5 = ((int[]) objArr7[2])[0];
            int i6 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[3];
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = ~iIdentityHashCode;
            int i8 = 275061798 + (((~((-518315579) | i7)) | (~((-1186715881) | iIdentityHashCode))) * 217) + (((~(iIdentityHashCode | (-518315579))) | 111204392) * 217) + (((~((-1186715881) | i7)) | 518315578) * 217) + 1041852903;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
            objArr = new Object[]{new int[1], new int[]{i6}, new int[]{i5}, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            c(Color.green(0) + 37, 15 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (19763 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 52, Color.green(0) + 16, (char) (20118 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), objArr9);
            try {
                Object[] objArr10 = {null, Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 0, 1041852903};
                byte[] bArr3 = $$d;
                byte b6 = bArr3[47];
                byte b7 = bArr3[59];
                Object[] objArr11 = new Object[1];
                d(b6, b7, b7, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b8 = bArr3[59];
                byte b9 = bArr3[47];
                Object[] objArr12 = new Object[1];
                d(b8, b9, b9, objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 43042);
                    int iGreen = Color.green(0) + 3111;
                    int i11 = 23 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    byte[] bArr4 = $$a;
                    Object[] objArr13 = new Object[1];
                    a(bArr4[40], bArr4[5], bArr4[7], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveSizeAndState, iGreen, i11, 154975793, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    c((-1) - TextUtils.lastIndexOf("", '0'), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 22, (char) KeyEvent.keyCodeFromString(""), objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    c(21 - ExpandableListView.getPackedPositionChild(0L), 16 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) ((-1) - TextUtils.lastIndexOf("", '0')), objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 43042);
                        int i12 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3110;
                        int i13 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22;
                        byte[] bArr5 = $$a;
                        byte b10 = bArr5[5];
                        byte b11 = bArr5[7];
                        Object[] objArr16 = new Object[1];
                        a(b10, b11, b11, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cKeyCodeFromString, i12, i13, -1269618118, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 43043);
                        int iIndexOf = 3111 - TextUtils.indexOf("", "");
                        int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 23;
                        byte b12 = $$a[7];
                        byte b13 = b12;
                        Object[] objArr17 = new Object[1];
                        a(b12, b13, b13, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, iIndexOf, iIndexOf2, -1272852037, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
        int i14 = ((int[]) objArr[1])[0];
        int i15 = ((int[]) objArr[2])[0];
        if (i15 != i14) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[3];
            if (strArr2 != null) {
                for (String str : strArr2) {
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i15));
        }
        int i16 = b + 45;
        asBinder = i16 % 128;
        int i17 = i16 % 2;
        int i18 = ((int[]) objArr[0])[0];
        int i19 = ((int[]) objArr[2])[0];
        int i20 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[3];
        int[] iArr = {i19};
        int i21 = ~((~((int) SystemClock.uptimeMillis())) | 567266857);
        int i22 = i18 + (((537855488 | i21) * (-374)) - 1410396356) + ((i21 | 29411369) * 374);
        int i23 = (i22 << 13) ^ i22;
        int i24 = i23 ^ (i23 >>> 17);
        ((int[]) objArr[0])[0] = i24 ^ (i24 << 5);
        Object[] objArr18 = {new int[1], new int[]{i20}, iArr, strArr3};
        StringBuilder sb = new StringBuilder();
        ByteString byteString = this.name;
        String str2 = byteString.utf8;
        if (str2 == null) {
            byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            Intrinsics.checkNotNullParameter(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1, "");
            String str3 = new String(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1, Charsets.UTF_8);
            byteString.utf8 = str3;
            int i25 = b + 23;
            asBinder = i25 % 128;
            int i26 = i25 % 2;
            str2 = str3;
        }
        sb.append(str2);
        int i27 = ((int[]) objArr18[0])[0];
        int i28 = i27 * i27;
        int i29 = -(300358668 * i27);
        int i30 = (i28 & i29) + (i28 | i29);
        int i31 = -(i27 * 289074920);
        int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
        int i33 = (i32 & 1750203940) + (1750203940 | i32);
        int i34 = i33 >> 23;
        int i35 = (((i34 | (-1023)) << 1) - (i34 ^ (-1023))) / 512;
        int i36 = (i35 ^ 1) + ((i35 & 1) << 1);
        int i37 = (i33 ^ i36) + ((i36 & i33) << 1);
        int i38 = ((i33 >> 19) - 16383) / 8192;
        int i39 = -(i37 ^ ((i38 ^ 1) + ((i38 & 1) << 1)));
        int i40 = (i39 ^ 7) + ((i39 & 7) << 1);
        int i41 = (((i40 >> 27) - 63) / 32) + 1;
        sb.append("11/20/29/21/25/: ".substring(153720 / (((-((i41 & 1) + (i41 | 1))) & i40) * 1464)));
        ByteString byteString2 = this.value;
        String str4 = byteString2.utf8;
        if (str4 == null) {
            byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = byteString2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            Intrinsics.checkNotNullParameter(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2, "");
            String str5 = new String(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2, Charsets.UTF_8);
            byteString2.utf8 = str5;
            str4 = str5;
        }
        sb.append(str4);
        return sb.toString();
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        INSTANCE = new Companion(null);
        ByteString.Companion companion = ByteString.INSTANCE;
        PSEUDO_PREFIX = ByteString.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(":");
        ByteString.Companion companion2 = ByteString.INSTANCE;
        RESPONSE_STATUS = ByteString.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(RESPONSE_STATUS_UTF8);
        ByteString.Companion companion3 = ByteString.INSTANCE;
        TARGET_METHOD = ByteString.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(TARGET_METHOD_UTF8);
        ByteString.Companion companion4 = ByteString.INSTANCE;
        TARGET_PATH = ByteString.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(TARGET_PATH_UTF8);
        ByteString.Companion companion5 = ByteString.INSTANCE;
        TARGET_SCHEME = ByteString.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(TARGET_SCHEME_UTF8);
        ByteString.Companion companion6 = ByteString.INSTANCE;
        TARGET_AUTHORITY = ByteString.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(TARGET_AUTHORITY_UTF8);
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Header copy$default(Header header, ByteString byteString, ByteString byteString2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            byteString = header.name;
        }
        if ((i & 2) != 0) {
            int i3 = asBinder + 55;
            b = i3 % 128;
            if (i3 % 2 != 0) {
                ByteString byteString3 = header.value;
                throw null;
            }
            byteString2 = header.value;
        }
        Header headerCopy = header.copy(byteString, byteString2);
        int i4 = asBinder + 111;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return headerCopy;
        }
        throw null;
    }

    public final ByteString component1() {
        int i = 2 % 2;
        int i2 = asBinder + 45;
        b = i2 % 128;
        int i3 = i2 % 2;
        ByteString byteString = this.name;
        if (i3 != 0) {
            int i4 = 72 / 0;
        }
        return byteString;
    }

    public final ByteString component2() {
        int i = 2 % 2;
        int i2 = b + 17;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        ByteString byteString = this.value;
        int i5 = i3 + 65;
        b = i5 % 128;
        int i6 = i5 % 2;
        return byteString;
    }

    public final Header copy(ByteString p0, ByteString p1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Header header = new Header(p0, p1);
        int i2 = asBinder + 121;
        b = i2 % 128;
        int i3 = i2 % 2;
        return header;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            int i2 = b + 39;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 90 / 0;
            }
            return true;
        }
        if (!(p0 instanceof Header)) {
            int i4 = b + 95;
            int i5 = i4 % 128;
            asBinder = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 83;
            b = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        Header header = (Header) p0;
        if (Intrinsics.areEqual(this.name, header.name)) {
            return Intrinsics.areEqual(this.value, header.value);
        }
        int i9 = b + 7;
        int i10 = i9 % 128;
        asBinder = i10;
        int i11 = i9 % 2;
        int i12 = i10 + 29;
        b = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = asBinder + 93;
        b = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (this.name.hashCode() * 65) - this.value.hashCode() : (this.name.hashCode() * 31) + this.value.hashCode();
        int i3 = b + 35;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        TuitionPaymentFragmentbindingInflater1 = new char[]{45565, 18528, 17116, 23896, 22459, 28207, 26772, 25420, 32099, 30669, 3590, 2185, 829, 7557, 5140, 11895, 10449, 9069, 15796, 13349, 52887, 51469, 45561, 18530, 17113, 23898, 22439, 28195, 26772, 25392, 32105, 30687, 3652, 2222, 813, 7579, 5125, 64708, 1373, 4092, 4217, 6856, 8984, 9635, 11838, 12377, 15010, 17225, 17809, 19973, 20656, 22839, 25421, 65376, 1791, 3144, 5073, 6453, 8378, 9745, 11662, 13265, 14666, 16590, 17959, 19858, 21260, 23185, 24802};
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 7098196805659936782L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r7, byte r8, short r9) {
        /*
            byte[] r0 = okhttp3.internal.http2.Header.$$c
            int r7 = r7 * 2
            int r7 = r7 + 1
            int r9 = r9 * 4
            int r9 = 4 - r9
            int r8 = r8 * 3
            int r8 = r8 + 109
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r7
            r3 = r9
            r4 = r2
            goto L2a
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2a:
            int r9 = -r9
            int r8 = r8 + r9
            int r9 = r3 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Header.$$g(byte, byte, short):java.lang.String");
    }
}
