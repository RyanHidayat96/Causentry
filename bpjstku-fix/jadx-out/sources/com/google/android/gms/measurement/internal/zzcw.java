package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzcw implements zzbn {
    private static int TuitionPaymentFragmentbindingInflater1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static char b;
    static final /* synthetic */ zzcw zza;
    private static final byte[] $$c = {107, 48, 57, 107};
    private static final int $$f = 172;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {42, -104, -68, 105, 11, -60, 73, -8, 1, 7, 22, -6, 18, -12, 24, -69, 64, 10, 11, -10, 18, 1, -8, 16, -57, Base64.padSymbol, 20, -2, -6, 22, -6, 11, 4, 10, -64, 29, 52, -2, -6, 22, -6, 11, 4, 10, -74, 72, 3, 20, -28, 23, 19, 5, -5, 11, 4, -21, 32, 1, -1, 14, 38, -7, 16, -6, 11, 4, -25, 22, 29, -7, -3, 14, 11, -41, 49, -12, 11, 11, -3, 14, 11, 4, 2, -6, 3, 11, -3, 16, 2, 10, 3, 2, 10, -4, 4, 23, -8, 1, 23, -37, 39, -6, 6, 12, -3, 6, 6, 0, 25, -4, 13, -60};
    private static final int $$e = 137;
    private static final byte[] $$a = {91, -17, 90, 37, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$b = 163;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f783a = 0;
    private static int asInterface = 1;
    private static int g = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 14
            int r6 = r6 + 84
            byte[] r0 = com.google.android.gms.measurement.internal.zzcw.$$a
            int r7 = r7 * 52
            int r7 = r7 + 4
            int r8 = r8 * 52
            int r1 = 53 - r8
            byte[] r1 = new byte[r1]
            int r8 = 52 - r8
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2f
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2f:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + (-11)
            int r7 = r3 + 1
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzcw.c(short, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 56
            int r8 = 59 - r8
            int r6 = r6 * 21
            int r6 = 105 - r6
            byte[] r0 = com.google.android.gms.measurement.internal.zzcw.$$d
            int r7 = r7 * 4
            int r7 = 57 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r6
            r6 = r7
            r4 = r2
            goto L2b
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r0[r8]
        L2b:
            int r6 = r6 + r3
            int r6 = r6 + (-5)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzcw.e(short, byte, byte, java.lang.Object[]):void");
    }

    private static void d(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        int i3 = $10 + 123;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (true) {
            int i5 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            int i6 = $10 + 57;
            $11 = i6 % 128;
            int i7 = 58224;
            char c = 1;
            if (i6 % 2 == 0) {
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 / 0];
            } else {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            }
            int i8 = 0;
            while (i8 < 16) {
                char c2 = cArr3[c];
                char c3 = cArr3[i5];
                int i9 = (c3 + i7) ^ ((c3 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 8611973335120459638L)));
                int i10 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[c] = Integer.valueOf(i9);
                    objArr2[i5] = Integer.valueOf(c2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 47773);
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 468;
                        int offsetBefore = TextUtils.getOffsetBefore("", i5) + 13;
                        Class[] clsArr = new Class[4];
                        clsArr[i5] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(tapTimeout, windowTouchSlop, offsetBefore, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[c] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i5]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(b)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 47772), 467 - ImageFormat.getBitsPerPixel(0), 13 - (ViewConfiguration.getWindowTouchSlop() >> 8), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i8++;
                    i5 = 0;
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
                byte b3 = (byte) (b2 - 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.lastIndexOf("", '0') + 1), 2324 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 44, -1312321721, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0210  */
    @Override // com.google.android.gms.measurement.internal.zzbn
    public final /* synthetic */ Object zza() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        zzfx zzfxVar = zzfy.zza;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 37567);
            int iIndexOf = 624 - TextUtils.indexOf((CharSequence) "", '0');
            int maximumDrawingCacheSize = 14 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            byte[] bArr = $$a;
            byte b2 = bArr[5];
            Object[] objArr2 = new Object[1];
            c(b2, bArr[7], b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMakeMeasureSpec, iIndexOf, maximumDrawingCacheSize, -477065106, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        d(new char[]{63763, 18033, 64178, 422, 1709, 42788, 12382, 55276, 16392, 56690, 2258, 54675, 40606, 953, 10332, 56446, 54043, 27337, 5301, 52717, 62053, 7553, 25042, 53510}, View.MeasureSpec.getMode(0) + 22, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        d(new char[]{28318, 2435, 11598, 31393, 3746, 44340, 31121, 18872, 19408, 32767, 30771, 6867, 39240, 18133, 43253, 49518, 20117, 9863}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 15, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char scrollBarFadeDuration = (char) (37567 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
            int scrollBarFadeDuration2 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 625;
            int i3 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14;
            byte b3 = $$a[7];
            byte b4 = b3;
            Object[] objArr5 = new Object[1];
            c(b3, b4, b4, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollBarFadeDuration, scrollBarFadeDuration2, i3, -976899241, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = f783a + 107;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cAlpha = (char) (37567 - Color.alpha(0));
                int scrollBarFadeDuration3 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 625;
                int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 14;
                byte[] bArr2 = $$a;
                byte b5 = bArr2[7];
                Object[] objArr6 = new Object[1];
                c(b5, bArr2[5], b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cAlpha, scrollBarFadeDuration3, touchSlop, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i6 = ((int[]) objArr7[2])[0];
            int i7 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i7};
            int iIdentityHashCode = System.identityHashCode(this);
            int i8 = ~iIdentityHashCode;
            int i9 = 144344408 + (((~((-1803813008) | i8)) | (~((-19925114) | iIdentityHashCode))) * 1900) + (((~(i8 | 19925113)) | (~(iIdentityHashCode | 1803813007))) * (-950)) + (((~(iIdentityHashCode | 19925113)) | (~(i8 | 1803813007))) * 950) + 1264066718;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[1])[0] = i11 ^ (i11 << 5);
            objArr = new Object[]{iArr, new int[1], new int[]{i6}, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            d(new char[]{55560, 23791, 25633, 4894, 49656, 12039, 38614, 16474, 30650, 45111, 23918, 62389, 34582, 34370, 17606, 50407, 41689, 15738, 29931, 30132, 39426, 13947, 1038, 29659, 30372, 48992, 18996, 35311}, 26 - (ViewConfiguration.getEdgeSlop() >> 16), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            d(new char[]{33262, 9570, 25051, 22393, 2546, 45934, 20410, 26124, 29625, 20228, 23352, 23665, 41887, 62048, 53791, 34364, 27175, 28883, 14841, 57244}, 17 - TextUtils.lastIndexOf("", '0'), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i12 = asInterface + 103;
                    f783a = i12 % 128;
                    int i13 = i12 % 2;
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
            d(new char[]{62859, 25083, 64045, 61918, 63170, 9044, 8114, 56153, 19649, 38789, 65529, 51667, 41329, 9530, 24251, 2713, 25780, 42239}, 15 - TextUtils.lastIndexOf("", '0', 0, 0), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            d(new char[]{25252, 55227, 23959, 27916, 57943, 31815, 21405, 36276, 33796, 8132, 26050, 33889, 9173, 15611, 34389, 562, 54372, 55968}, 16 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr12 = new Object[1];
            d(new char[]{34982, 48872, 48597, 60353, 64742, 60509, 54557, 34704, 56090, 47164, 49668, 53828, 51127, 53225, 55180, 40120, 61117, 63451, 50945, 34911, 26710, 33572, 59102, 51061, 8830, 48152, 18167, 52606, 32326, 61663, 43419, 56554, 45342, 45957, 13328, 30859, 26542, 43290, 29224, 6768, 14781, 64062, 52752, 6691, 44330, 24259, 14423, 1678, 46056, 43916, 23716, 15158, 21451, 34079, 27524, 54707, 51584, 32395, 54706, 42422, 65234, 34234, 63722, 63395, 61511, 18159}, 63 - ImageFormat.getBitsPerPixel(0), objArr12);
            String str = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            d(new char[]{18346, 29555, 27421, 20170, 27949, 25067, 10891, 21314, 26372, 1224, 27850, 43008, 20325, 33953, 49731, 46155, 39651, 64543, 39906, 45901, 28336, 22221, 4143, 57602, 36333, 14077, 16015, 25214, 60323, 1049, 26769, 39584, 49336, 9803, 36817, 40371, 28113, 56163, 59663, 1663, 21807, 8730, 23460, 23899, 34772, 18262, 24504, 37225, 6023, 13155, 28678, 4539, 33247, 54865, 35305, 1109, 5278, 15795, 40912, 52555, 17623, 39665, 34744, 13052, 11159, 60462}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 65, objArr13);
            String[] strArr2 = {str, (String) objArr13[0]};
            int i14 = f783a + 57;
            asInterface = i14 % 128;
            int i15 = i14 % 2;
            try {
                Object[] objArr14 = {applicationContext, strArr2, Integer.valueOf(iIntValue), 17, 1264066718};
                byte[] bArr3 = $$d;
                byte b6 = bArr3[107];
                Object[] objArr15 = new Object[1];
                e(b6, b6, bArr3[8], objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                byte b7 = bArr3[8];
                Object[] objArr16 = new Object[1];
                e(b7, b7, bArr3[107], objArr16);
                objArr = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                int i16 = ((int[]) objArr[0])[0];
                int i17 = ((int[]) objArr[2])[0];
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char packedPositionGroup = (char) (37567 - ExpandableListView.getPackedPositionGroup(0L));
                        int iKeyCodeFromString = 625 - KeyEvent.keyCodeFromString("");
                        int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0) + 15;
                        byte[] bArr4 = $$a;
                        byte b8 = bArr4[7];
                        Object[] objArr17 = new Object[1];
                        c(b8, bArr4[5], b8, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionGroup, iKeyCodeFromString, iIndexOf2, -973632554, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr18 = new Object[1];
                        d(new char[]{63763, 18033, 64178, 422, 1709, 42788, 12382, 55276, 16392, 56690, 2258, 54675, 40606, 953, 10332, 56446, 54043, 27337, 5301, 52717, 62053, 7553, 25042, 53510}, (ViewConfiguration.getLongPressTimeout() >> 16) + 22, objArr18);
                        Class<?> cls5 = Class.forName((String) objArr18[0]);
                        Object[] objArr19 = new Object[1];
                        d(new char[]{28318, 2435, 11598, 31393, 3746, 44340, 31121, 18872, 19408, 32767, 30771, 6867, 39240, 18133, 43253, 49518, 20117, 9863}, 14 - TextUtils.lastIndexOf("", '0'), objArr19);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char bitsPerPixel = (char) (37566 - ImageFormat.getBitsPerPixel(0));
                            int size = View.MeasureSpec.getSize(0) + 625;
                            int iRgb = (-16777202) - Color.rgb(0, 0, 0);
                            byte b9 = $$a[7];
                            byte b10 = b9;
                            Object[] objArr20 = new Object[1];
                            c(b9, b10, b10, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(bitsPerPixel, size, iRgb, -976899241, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 37567);
                            int absoluteGravity = 625 - Gravity.getAbsoluteGravity(0, 0);
                            int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 14;
                            byte[] bArr5 = $$a;
                            byte b11 = bArr5[5];
                            Object[] objArr21 = new Object[1];
                            c(b11, bArr5[7], b11, objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, absoluteGravity, maximumDrawingCacheSize2, -477065106, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        int i18 = f783a + 21;
                        asInterface = i18 % 128;
                        int i19 = i18 % 2;
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
        int i20 = ((int[]) objArr[0])[0];
        int i21 = ((int[]) objArr[2])[0];
        if (i21 != i20) {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                while (i2 < strArr3.length) {
                    int i22 = asInterface + 17;
                    f783a = i22 % 128;
                    if (i22 % 2 != 0) {
                        arrayList.add(strArr3[i2]);
                        i2 += 70;
                    } else {
                        arrayList.add(strArr3[i2]);
                        i2++;
                    }
                }
            }
            throw new RuntimeException(String.valueOf(i21));
        }
        int i23 = ((int[]) objArr[1])[0];
        int i24 = ((int[]) objArr[2])[0];
        int i25 = ((int[]) objArr[0])[0];
        String[] strArr4 = (String[]) objArr[3];
        int[] iArr2 = {i24};
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i26 = ~iElapsedRealtime;
        int i27 = (~((-851958058) | i26)) | 818153737;
        int i28 = ~(iElapsedRealtime | 1005584383);
        int i29 = i23 + ((i27 | i28) * (-252)) + 1840049636 + ((i28 | (~(i26 | (-33804321)))) * 252);
        int i30 = (i29 << 13) ^ i29;
        int i31 = i30 ^ (i30 >>> 17);
        ((int[]) objArr[1])[0] = i31 ^ (i31 << 5);
        Object[] objArr22 = {new int[]{i25}, new int[1], iArr2, strArr4};
        return Long.valueOf(com.google.android.gms.internal.measurement.zzpc.zzz());
    }

    static {
        TuitionPaymentFragmentbindingInflater1 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        zza = new zzcw();
        int i = g + 97;
        TuitionPaymentFragmentbindingInflater1 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private /* synthetic */ zzcw() {
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (char) 4129;
        b = (char) 46252;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) 18282;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (char) 56357;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r7, int r8, short r9) {
        /*
            byte[] r0 = com.google.android.gms.measurement.internal.zzcw.$$c
            int r8 = r8 + 4
            int r7 = r7 * 4
            int r7 = 1 - r7
            int r9 = r9 * 4
            int r9 = r9 + 108
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r9 = r8
            r4 = r2
            goto L2a
        L15:
            r3 = r2
            r6 = r9
            r9 = r8
            r8 = r6
        L19:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            int r9 = r9 + 1
            if (r4 != r7) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L28:
            r3 = r0[r9]
        L2a:
            int r8 = r8 + r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzcw.$$g(short, int, short):java.lang.String");
    }
}
