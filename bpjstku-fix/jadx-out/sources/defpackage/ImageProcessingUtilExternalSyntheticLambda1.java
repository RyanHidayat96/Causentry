package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.abortCapture;
import defpackage.initSession;
import defpackage.trySetFlashModeToCameraControl;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001b\u0010\n\u001a\u00020\u00068WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t"}, d2 = {"LImageProcessingUtilExternalSyntheticLambda1;", "LImageProcessor;", "LisSupportedRotationDegrees;", "p0", "<init>", "(LisSupportedRotationDegrees;)V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lkotlin/Lazy;", "()J", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class ImageProcessingUtilExternalSyntheticLambda1 implements ImageProcessor {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    private ImageProcessingUtilExternalSyntheticLambda1(final isSupportedRotationDegrees issupportedrotationdegrees) {
        Intrinsics.checkNotNullParameter(issupportedrotationdegrees, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Function0<Long>() { // from class: com.datadog.android.core.internal.time.DefaultAppStartTimeProvider$appStartTimeNs$2
            private static final byte[] $$c = {63, 56, -36, -117};
            private static final int $$f = 235;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {115, 25, -47, -94, 12, -2, -63, 57, 8, 0, -8, 5, -7, -55, 51, 13, -10, 14, -3, -6, -5, -54, 57, 6, 6, -69, 51, 20, -1, -12, -58, 51, 15, -7, -59, 69, -10, -2, 7, -5, 5, -64, 36, 19, 17, -7, -12, -2, 19, -11, 6, -1, -44, 45, 6, -7, -10, -17, 18, 13, 4, -13, -6, 2, 33, -12, 11, -11, 6, -1, -30, 17, 24, -12, -8, 9, 6, -46, 44, -17, 6, 6, -8, 9, 6, -1, -3, -11, -2, 6, -8, 11, -3, 5, -2, -3, 5, -9, -1, 18, -13, -4, 18, -42, 34, -11, 1, 7, -8, 1, 1, -5, 20, -9, 8, -67};
            private static final int $$e = 113;
            private static final byte[] $$a = {14, 70, 6, -35, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
            private static final int $$b = 111;
            private static int $b = 0;
            private static int $TuitionPaymentFragmentbindingInflater1 = 1;
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -7544832898310183422L;

            /* JADX WARN: Code duplicated, block: B:10:0x0029  */
            /* JADX WARN: Code duplicated, block: B:8:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(short r5, short r6, byte r7, java.lang.Object[] r8) {
                /*
                    int r6 = r6 + 4
                    int r5 = r5 * 14
                    int r5 = r5 + 84
                    int r0 = 53 - r7
                    byte[] r1 = com.datadog.android.core.internal.time.DefaultAppStartTimeProvider$appStartTimeNs$2.$$a
                    byte[] r0 = new byte[r0]
                    int r7 = 52 - r7
                    r2 = -1
                    if (r1 != 0) goto L14
                    r5 = r6
                    r3 = r7
                    goto L2b
                L14:
                    r4 = r6
                    r6 = r5
                    r5 = r4
                L17:
                    int r2 = r2 + 1
                    byte r3 = (byte) r6
                    r0[r2] = r3
                    int r5 = r5 + 1
                    if (r2 != r7) goto L29
                    java.lang.String r5 = new java.lang.String
                    r6 = 0
                    r5.<init>(r0, r6)
                    r8[r6] = r5
                    return
                L29:
                    r3 = r1[r5]
                L2b:
                    int r6 = r6 + r3
                    int r6 = r6 + (-10)
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.core.internal.time.DefaultAppStartTimeProvider$appStartTimeNs$2.a(short, short, byte, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0028  */
            /* JADX WARN: Code duplicated, block: B:8:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(byte r5, int r6, int r7, java.lang.Object[] r8) {
                /*
                    byte[] r0 = com.datadog.android.core.internal.time.DefaultAppStartTimeProvider$appStartTimeNs$2.$$d
                    int r6 = r6 * 60
                    int r6 = 63 - r6
                    int r5 = r5 * 15
                    int r5 = 99 - r5
                    int r7 = r7 * 8
                    int r1 = 61 - r7
                    byte[] r1 = new byte[r1]
                    int r7 = 60 - r7
                    r2 = 0
                    if (r0 != 0) goto L18
                    r4 = r7
                    r3 = r2
                    goto L2c
                L18:
                    r3 = r2
                L19:
                    byte r4 = (byte) r5
                    int r6 = r6 + 1
                    r1[r3] = r4
                    if (r3 != r7) goto L28
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    r8[r2] = r5
                    return
                L28:
                    int r3 = r3 + 1
                    r4 = r0[r6]
                L2c:
                    int r5 = r5 + r4
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.core.internal.time.DefaultAppStartTimeProvider$appStartTimeNs$2.d(byte, int, int, java.lang.Object[]):void");
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Long invoke() throws Throwable {
                int i = 2 % 2;
                int i2 = $b + 51;
                $TuitionPaymentFragmentbindingInflater1 = i2 % 128;
                if (i2 % 2 == 0) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Long lTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                int i3 = $b + 55;
                $TuitionPaymentFragmentbindingInflater1 = i3 % 128;
                int i4 = i3 % 2;
                return lTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }

            private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                abortCapture abortcapture = new abortCapture();
                char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-2687588926731523482L), cArr, i);
                abortcapture.b = 4;
                int i3 = $10 + 9;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                while (abortcapture.b < cArrB.length) {
                    int i5 = $11 + 47;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
                    abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
                    int i7 = abortcapture.b;
                    try {
                        Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64839 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 1355 - TextUtils.lastIndexOf("", '0'), 39 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 894276454, false, $$g(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                        }
                        cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {abortcapture, abortcapture};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 47772), (-16776748) - Color.rgb(0, 0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 13, 896083767, false, "n", new Class[]{Object.class, Object.class});
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
            }

            public final Long TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws Throwable {
                Object[] objArr;
                Object[] objArr2;
                long jTuitionPaymentFragmentbindingInflater1;
                int i = 2 % 2;
                int i2 = $TuitionPaymentFragmentbindingInflater1 + 103;
                $b = i2 % 128;
                int i3 = i2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 31533);
                    int iRed = Color.red(0) + 921;
                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 28;
                    byte[] bArr = $$a;
                    byte b = bArr[37];
                    byte b2 = bArr[7];
                    Object[] objArr3 = new Object[1];
                    a(b, b2, (byte) (b2 & 52), objArr3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(touchSlop, iRed, longPressTimeout, -1048449946, false, (String) objArr3[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr4 = new Object[1];
                c(new char[]{37802, 15546, 37835, 50066, 19282, 45232, 56126, 60940, 41557, 33063, 35246, 40384, 61669, 54093, 47188, 17229, 1891, 7645, 28318, 29419, 21895, 28253, 7414, 8273, 25625, 47333}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, objArr4);
                Class<?> cls = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                c(new char[]{28533, 29856, 28432, 23391, 51186, 63656, 17398, 25262, 24214, 51505, 4451, 4380, 3120, 39749, 8411, 53194, 64428, 21977, 63042}, ViewConfiguration.getMaximumDrawingCacheSize() >> 24, objArr5);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cAlpha = (char) (31533 - Color.alpha(0));
                    int iGreen = Color.green(0) + 921;
                    int mirror = AndroidCharacter.getMirror('0') - 20;
                    byte[] bArr2 = $$a;
                    byte b3 = bArr2[80];
                    Object[] objArr6 = new Object[1];
                    a(b3, bArr2[7], b3, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cAlpha, iGreen, mirror, -778300370, false, (String) objArr6[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char c = (char) (31534 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                        int scrollBarFadeDuration = 921 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int absoluteGravity = 28 - Gravity.getAbsoluteGravity(0, 0);
                        byte[] bArr3 = $$a;
                        byte b4 = bArr3[80];
                        Object[] objArr7 = new Object[1];
                        a(b4, (byte) (b4 | 51), bArr3[33], objArr7);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, scrollBarFadeDuration, absoluteGravity, -1142834547, false, (String) objArr7[0], null);
                    }
                    Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i4 = ~iIdentityHashCode;
                    int i5 = 472914295 + (((~((-970355553) | i4)) | 700863264 | (~((-803724092) | i4)) | (~(1073216379 | iIdentityHashCode))) * (-84));
                    int i6 = (~(iIdentityHashCode | (-803724092))) | 970355552;
                    int i7 = ~(i4 | 803724091);
                    int i8 = ((i5 + ((i6 | i7) * (-84))) + (((-1073216380) | i7) * 84)) - 2146646228;
                    int i9 = (i8 << 13) ^ i8;
                    int i10 = i9 ^ (i9 >>> 17);
                    ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
                } else {
                    Object[] objArr9 = new Object[1];
                    c(new char[]{65081, 60127, 65112, 65348, 26682, 26325, 59368, 52580, 53190, 22338, 46456, 48808, 40312, 1323, 34012, 24664, 27336, 52136, 21064, 20879, 14351, 47122, 8248, 815, 2493, 28291, 61358, 62627, 55096, 24447}, ViewConfiguration.getEdgeSlop() >> 16, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    c(new char[]{59429, 32750, 59462, 54117, 41469, 62463, 52191, 1187, 55760, 49780, 39241, 30464, 35701, 36890, 43233, 43480, 31990, 24219, 32361, 38984, 11786, 11556}, View.combineMeasuredStates(0, 0), objArr10);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                    }
                    Object[] objArr11 = new Object[1];
                    c(new char[]{16823, 63164, 16861, 7960, 28505, 31417, 1958, 51732, 28681, 19236, 21793, 47499, 8944, 6422, 25763, 26476, 54644, 55260, 45573, 22248}, TextUtils.getOffsetBefore("", 0), objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    c(new char[]{20792, 65007, 20817, 21890, 5194, 29167, 19759, 45320, 24796, 16498, 8110, 49807, 12880, 4618, 11801, 7278, 50635, 56468, 63646, 11763}, 1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr12);
                    try {
                        Object[] objArr13 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue()), 0, -2146646228};
                        byte[] bArr4 = $$d;
                        byte b5 = bArr4[9];
                        Object[] objArr14 = new Object[1];
                        d(b5, bArr4[106], b5, objArr14);
                        Class<?> cls4 = Class.forName((String) objArr14[0]);
                        byte b6 = bArr4[106];
                        Object[] objArr15 = new Object[1];
                        d(b6, bArr4[9], b6, objArr15);
                        Object[] objArr16 = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char c2 = (char) (31533 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 921;
                            int i11 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 27;
                            byte[] bArr5 = $$a;
                            byte b7 = bArr5[80];
                            Object[] objArr17 = new Object[1];
                            a(b7, (byte) (b7 | 51), bArr5[33], objArr17);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, iResolveOpacity, i11, -1142834547, false, (String) objArr17[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr16);
                        try {
                            Object[] objArr18 = new Object[1];
                            c(new char[]{37802, 15546, 37835, 50066, 19282, 45232, 56126, 60940, 41557, 33063, 35246, 40384, 61669, 54093, 47188, 17229, 1891, 7645, 28318, 29419, 21895, 28253, 7414, 8273, 25625, 47333}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr18);
                            Class<?> cls5 = Class.forName((String) objArr18[0]);
                            Object[] objArr19 = new Object[1];
                            c(new char[]{28533, 29856, 28432, 23391, 51186, 63656, 17398, 25262, 24214, 51505, 4451, 4380, 3120, 39749, 8411, 53194, 64428, 21977, 63042}, ViewConfiguration.getTapTimeout() >> 16, objArr19);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char c3 = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31533);
                                int absoluteGravity2 = 921 - Gravity.getAbsoluteGravity(0, 0);
                                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 29;
                                byte[] bArr6 = $$a;
                                byte b8 = bArr6[80];
                                Object[] objArr20 = new Object[1];
                                a(b8, bArr6[7], b8, objArr20);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c3, absoluteGravity2, iIndexOf, -778300370, false, (String) objArr20[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char windowTouchSlop = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 31533);
                                int iCombineMeasuredStates = 921 - View.combineMeasuredStates(0, 0);
                                int i12 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 27;
                                byte[] bArr7 = $$a;
                                byte b9 = bArr7[37];
                                byte b10 = bArr7[7];
                                Object[] objArr21 = new Object[1];
                                a(b9, b10, (byte) (b10 & 52), objArr21);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(windowTouchSlop, iCombineMeasuredStates, i12, -1048449946, false, (String) objArr21[0], null);
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
                int i13 = ((int[]) objArr[1])[0];
                int i14 = ((int[]) objArr[3])[0];
                if (i14 == i13) {
                    int i15 = $b + 101;
                    $TuitionPaymentFragmentbindingInflater1 = i15 % 128;
                    int i16 = i15 % 2;
                    int i17 = ((int[]) objArr[0])[0];
                    objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                    int iIdentityHashCode2 = System.identityHashCode(this);
                    int i18 = (~((-266582949) | iIdentityHashCode2)) | 163746468;
                    int i19 = i17 + (-1996094901) + (i18 * 992) + ((i18 | (~((~iIdentityHashCode2) | 1610333175))) * (-496)) + ((iIdentityHashCode2 | 1507496695) * 496);
                    int i20 = (i19 << 13) ^ i19;
                    int i21 = i20 ^ (i20 >>> 17);
                    ((int[]) objArr2[0])[0] = i21 ^ (i21 << 5);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr[4];
                    if (strArr != null) {
                        for (String str : strArr) {
                            int i22 = $b + 121;
                            $TuitionPaymentFragmentbindingInflater1 = i22 % 128;
                            int i23 = i22 % 2;
                            arrayList.add(str);
                        }
                    }
                    int[] iArr = new int[i14];
                    int i24 = i14 - 1;
                    iArr[i24] = 1;
                    Toast.makeText((Context) null, iArr[((i14 * i24) % 2) - 1], 1).show();
                    int i25 = ((int[]) objArr[0])[0];
                    objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                    int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                    int i26 = ~iElapsedRealtime;
                    int i27 = i25 + (-1837510560) + (((~((-656549313) | i26)) | (-1117530332)) * (-865)) + ((~(iElapsedRealtime | 656549312)) * 865) + (((~((-1117530332) | i26)) | (~(i26 | 656549312))) * 865);
                    int i28 = (i27 << 13) ^ i27;
                    int i29 = i28 ^ (i28 >>> 17);
                    ((int[]) objArr2[0])[0] = i29 ^ (i29 << 5);
                    int i30 = $TuitionPaymentFragmentbindingInflater1 + 23;
                    $b = i30 % 128;
                    int i31 = i30 % 2;
                }
                int iB = issupportedrotationdegrees.b();
                int i32 = ((int[]) objArr2[0])[0];
                int i33 = i32 * i32;
                int i34 = -(1021209172 * i32);
                int i35 = ((i33 | i34) << 1) - (i33 ^ i34);
                int i36 = -(i32 * 552499688);
                int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
                int i38 = (i37 & 147241860) + (147241860 | i37);
                int i39 = i38 >> 22;
                int i40 = ((i39 & (-2047)) + (i39 | (-2047))) / 1024;
                int i41 = (i40 ^ 1) + ((i40 & 1) << 1);
                int i42 = (i38 & i41) + (i41 | i38);
                int i43 = ((i38 >> 27) - 63) / 32;
                int i44 = -(i42 ^ ((i43 ^ 1) + ((i43 & 1) << 1)));
                int i45 = (i44 ^ 6) + ((i44 & 6) << 1);
                int i46 = ((i45 >> 23) - 1023) / 512;
                int i47 = ((i46 | 1) << 1) - (i46 ^ 1);
                if (iB >= 54720 / (((-((i47 ^ 1) + ((i47 & 1) << 1))) & i45) * 380)) {
                    int i48 = $TuitionPaymentFragmentbindingInflater1 + 67;
                    $b = i48 % 128;
                    int i49 = i48 % 2;
                    jTuitionPaymentFragmentbindingInflater1 = System.nanoTime() - TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime() - Process.getStartElapsedRealtime());
                } else {
                    trySetFlashModeToCameraControl.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = trySetFlashModeToCameraControl.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    jTuitionPaymentFragmentbindingInflater1 = trySetFlashModeToCameraControl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1();
                }
                return Long.valueOf(jTuitionPaymentFragmentbindingInflater1);
            }

            {
                super(0);
            }

            private static String $$g(byte b, byte b2, short s) {
                byte[] bArr = $$c;
                int i = s * 3;
                int i2 = 107 - (b2 * 4);
                int i3 = (b * 3) + 4;
                byte[] bArr2 = new byte[1 - i];
                int i4 = 0 - i;
                int i5 = -1;
                if (bArr == null) {
                    i5 = -1;
                    i2 = (-i3) + i2;
                    i3++;
                }
                while (true) {
                    int i6 = i5 + 1;
                    bArr2[i6] = (byte) i2;
                    if (i6 == i4) {
                        return new String(bArr2, 0);
                    }
                    int i7 = i2;
                    i5 = i6;
                    i2 = (-bArr[i3]) + i7;
                    i3++;
                }
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ImageProcessingUtilExternalSyntheticLambda1(isSupportedRotationDegrees issupportedrotationdegrees, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            isSupportedRotationDegrees.Companion companion = isSupportedRotationDegrees.INSTANCE;
            issupportedrotationdegrees = isSupportedRotationDegrees.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
        this(issupportedrotationdegrees);
    }

    @Override // defpackage.ImageProcessor
    public final long TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return ((Number) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ImageProcessingUtilExternalSyntheticLambda1() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
