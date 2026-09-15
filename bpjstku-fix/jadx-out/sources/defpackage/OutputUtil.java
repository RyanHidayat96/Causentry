package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Lazy;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes7.dex */
public final class OutputUtil<T> extends setTargetOutputSize<T> {
    private final Map<KClass<? extends T>, videoProfileHdrFormatsToDynamicRangeEncoding<? extends T>> TuitionPaymentFragmentbindingInflater1;
    private final Map<String, videoProfileHdrFormatsToDynamicRangeEncoding<? extends T>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final KClass<T> b;
    private static final byte[] $$c = {117, 50, 102, 124};
    private static final int $$f = 67;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {14, 116, 92, -78, -14, 0, Base64.padSymbol, -59, -10, -2, 6, -7, 5, 53, -58, -5, -11, 11, 1, -1, -20, 12, 53, -55, -17, 15, -20, 9, -6, -15, 3, 9, 4, -18, 67, -61, -7, -8, 13, -15, 2, 11, -13, 60, -66, 7, -17, -5, 6, -5, 5, 59, -28, -46, -2, 2, 39, -32, -17, 32, -21, -14, -6, 14, -16, -3};
    private static final int $$e = 69;
    private static final byte[] $$a = {5, -91, 77, 46, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 59;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f193a = 0;
    private static int g = 1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 19041;
    private static char asInterface = 25792;
    private static char d = 59427;
    private static char asBinder = 44776;

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = defpackage.OutputUtil.$$a
            int r8 = 53 - r8
            int r6 = r6 * 14
            int r6 = r6 + 84
            int r7 = r7 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            int r7 = r7 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r6
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
            int r6 = r6 + (-10)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.OutputUtil.c(short, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = defpackage.OutputUtil.$$d
            int r8 = r8 + 4
            int r6 = r6 + 98
            int r7 = r7 * 62
            int r7 = r7 + 1
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r7
            r6 = r8
            r3 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L2a:
            int r4 = -r4
            int r8 = r8 + r4
            int r8 = r8 + (-2)
            r5 = r8
            r8 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.OutputUtil.f(short, short, short, java.lang.Object[]):void");
    }

    @Override // defpackage.setTargetOutputSize
    public final KClass<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = f193a;
        int i3 = i2 + 75;
        g = i3 % 128;
        int i4 = i3 % 2;
        KClass<T> kClass = this.b;
        int i5 = i2 + 89;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            return kClass;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
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
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            int i5 = $10 + 121;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 % 0];
                i2 = 1;
            } else {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                i2 = 0;
            }
            int i6 = 58224;
            while (i2 < 16) {
                int i7 = $11 + 95;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i4];
                int i9 = (c2 + i6) ^ ((c2 << 4) + ((char) (((long) d) ^ 8611973335120459638L)));
                int i10 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(asBinder);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[i4] = Integer.valueOf(c);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cAlpha = (char) (47773 - Color.alpha(i4));
                        int i11 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 467;
                        int iCombineMeasuredStates = 13 - View.combineMeasuredStates(i4, i4);
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAlpha, i11, iCombineMeasuredStates, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    int i12 = i6;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(asInterface)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47774 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 468, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 12, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i6 = i12 - 40503;
                    i2++;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b = (byte) 0;
                byte b2 = b;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Process.myPid() >> 22), 2323 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 44, -1312321721, false, $$g(b, b2, b2), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    @Override // defpackage.videoProfileHdrFormatsToDynamicRangeEncoding, defpackage.QualityAddedEncoderProfilesProvider, defpackage.isBitDepthMatched
    public final createImageAnalysis getDescriptor() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 31533);
            int i2 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 920;
            int iIndexOf = 28 - TextUtils.indexOf("", "");
            byte[] bArr = $$a;
            byte b = bArr[7];
            byte b2 = bArr[37];
            Object[] objArr2 = new Object[1];
            c(b, b2, (byte) (b2 & 52), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(jumpTapTimeout, i2, iIndexOf, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{59431, 60402, 30064, 36983, 60179, 59211, 34466, 11017, 15236, 34270, 37620, 49261, 6173, 12849, 2126, 50466, 15629, 30870, 45220, 64247, 48608, 57804, 35213, 49070}, 22 - ExpandableListView.getPackedPositionType(0L), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{34574, 58974, 64688, 12124, 23590, 34896, 20363, 20057, 11976, 10336, 843, 21598, 18175, 57331, 58573, 7572, 9965, 48838}, 15 - KeyEvent.getDeadChar(0, 0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char maximumFlingVelocity = (char) (31533 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
            int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 922;
            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 28;
            byte[] bArr2 = $$a;
            byte b3 = bArr2[80];
            Object[] objArr5 = new Object[1];
            c(b3, bArr2[37], b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maximumFlingVelocity, iIndexOf2, longPressTimeout, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (31533 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                int deadChar = KeyEvent.getDeadChar(0, 0) + 921;
                int iResolveSizeAndState = 28 - View.resolveSizeAndState(0, 0, 0);
                byte[] bArr3 = $$a;
                byte b4 = bArr3[80];
                Object[] objArr6 = new Object[1];
                c(b4, (byte) (b4 | 51), (byte) (-bArr3[33]), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, deadChar, iResolveSizeAndState, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i3 = ((int[]) objArr7[3])[0];
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{i3}, (String[]) objArr7[4]};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i4 = (((440064755 + (((-1371124060) | elapsedCpuTime) * 376)) + (((~((~elapsedCpuTime) | 473099937)) | (-1572601852)) * (-376))) + (((~(elapsedCpuTime | (-473099938))) | 1300979706) * 376)) - 1227561406;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[0])[0] = i6 ^ (i6 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{35115, 42452, 33602, 63346, 58653, 26263, 32480, 40630, 59460, 40355, 6701, 49672, 50565, 24815, 37659, 32842, 16473, 62943, 13935, 57146, 3066, 28320, 48879, 55964, 62546, 53481, 28551, 13854}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 26, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{7811, 50968, 17041, 45810, 60098, 54861, 23186, 19566, 19357, 9567, 37940, 34341, 22324, 9007, 18791, 40933, 16365, 46988, 61581, 35269}, TextUtils.indexOf("", "", 0, 0) + 18, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                    applicationContext = null;
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                    int i7 = g + 49;
                    f193a = i7 % 128;
                    int i8 = i7 % 2;
                }
            }
            Object[] objArr10 = new Object[1];
            e(new char[]{49716, 52223, 55089, 23930, 45263, 54884, 44945, 62518, 61616, 34950, 45179, 12694, 32917, 8765, 60475, 64565, 50988, 36971}, 16 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new char[]{55816, 27068, 59771, 46882, 14326, 38351, 30972, 22897, 61715, 12590, 33125, 469, 22871, 37082, 40378, 16813, 27172, 50954}, 15 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -1227561406};
                byte[] bArr4 = $$d;
                byte b5 = bArr4[18];
                Object[] objArr13 = new Object[1];
                f(b5, b5, bArr4[19], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b6 = bArr4[5];
                Object[] objArr14 = new Object[1];
                f(b6, b6, bArr4[6], objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c2 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 31532);
                    int maximumFlingVelocity2 = 921 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int packedPositionType = 28 - ExpandableListView.getPackedPositionType(0L);
                    byte[] bArr5 = $$a;
                    byte b7 = bArr5[80];
                    Object[] objArr16 = new Object[1];
                    c(b7, (byte) (b7 | 51), (byte) (-bArr5[33]), objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, maximumFlingVelocity2, packedPositionType, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    e(new char[]{59431, 60402, 30064, 36983, 60179, 59211, 34466, 11017, 15236, 34270, 37620, 49261, 6173, 12849, 2126, 50466, 15629, 30870, 45220, 64247, 48608, 57804, 35213, 49070}, 22 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    e(new char[]{34574, 58974, 64688, 12124, 23590, 34896, 20363, 20057, 11976, 10336, 843, 21598, 18175, 57331, 58573, 7572, 9965, 48838}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 14, objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 31534);
                        int i9 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 921;
                        int iIndexOf3 = TextUtils.indexOf("", "", 0, 0) + 28;
                        byte[] bArr6 = $$a;
                        byte b8 = bArr6[80];
                        Object[] objArr19 = new Object[1];
                        c(b8, bArr6[37], b8, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(bitsPerPixel, i9, iIndexOf3, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char absoluteGravity = (char) (31533 - Gravity.getAbsoluteGravity(0, 0));
                        int iKeyCodeFromString = 921 - KeyEvent.keyCodeFromString("");
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 28;
                        byte[] bArr7 = $$a;
                        byte b9 = bArr7[7];
                        byte b10 = bArr7[37];
                        Object[] objArr20 = new Object[1];
                        c(b9, b10, (byte) (b10 & 52), objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(absoluteGravity, iKeyCodeFromString, minimumFlingVelocity, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr15;
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
        int i10 = ((int[]) objArr[1])[0];
        int i11 = ((int[]) objArr[3])[0];
        if (i11 == i10) {
            int i12 = ((int[]) objArr[0])[0];
            int i13 = ((int[]) objArr[3])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i13}, (String[]) objArr[4]};
            int iMyPid = Process.myPid();
            int i14 = ~iMyPid;
            int i15 = i12 + 517002794 + (((~((-238344134) | i14)) | (-1535735511)) * (-865)) + ((~(iMyPid | 238344133)) * 865) + (((~((-1535735511) | i14)) | (~(i14 | 238344133))) * 865);
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr21[0])[0] = i17 ^ (i17 << 5);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = (String[]) objArr[4];
        if (strArr != null) {
            int i18 = 0;
            while (i18 < strArr.length) {
                int i19 = f193a + 91;
                g = i19 % 128;
                if (i19 % 2 == 0) {
                    arrayList.add(strArr[i18]);
                    i18 += 88;
                } else {
                    arrayList.add(strArr[i18]);
                    i18++;
                }
            }
        }
        int[] iArr = new int[i11];
        int i20 = i11 - 1;
        iArr[i20] = 1;
        Toast.makeText((Context) null, iArr[((i11 * i20) % 2) - 1], 1).show();
        int i21 = ((int[]) objArr[0])[0];
        int i22 = ((int[]) objArr[3])[0];
        Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i22}, (String[]) objArr[4]};
        int iMyPid2 = Process.myPid();
        int i23 = ~((-872448161) | iMyPid2);
        int i24 = ~iMyPid2;
        int i25 = i21 + 1708380563 + ((i23 | (~((-1854801) | i24))) * 920) + (((~((-899776684) | i24)) | 872448160) * 920) + (((~(iMyPid2 | (-1854801))) | (~((-872448161) | i24)) | (~((-27328524) | iMyPid2))) * 920);
        int i26 = (i25 << 13) ^ i25;
        int i27 = i26 ^ (i26 >>> 17);
        ((int[]) objArr22[0])[0] = i27 ^ (i27 << 5);
        throw null;
    }

    @Override // defpackage.setTargetOutputSize
    public final isBitDepthMatched<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1(setActiveRecording setactiverecording, String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setactiverecording, "");
        throw null;
    }

    @Override // defpackage.setTargetOutputSize
    public final QualityAddedEncoderProfilesProvider<T> TuitionPaymentFragmentbindingInflater1(startListeningToRotationEvents startlisteningtorotationevents, T t) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(startlisteningtorotationevents, "");
        Intrinsics.checkNotNullParameter(t, "");
        Reflection.getOrCreateKotlinClass(t.getClass());
        throw null;
    }

    private static String $$g(short s, int i, int i2) {
        int i3 = s * 4;
        int i4 = 108 - (i2 * 3);
        byte[] bArr = $$c;
        int i5 = 3 - (i * 3);
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        int i7 = -1;
        if (bArr == null) {
            i4 += -i6;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i4;
            i5++;
            if (i7 == i6) {
                return new String(bArr2, 0);
            }
            i4 += -bArr[i5];
        }
    }
}
