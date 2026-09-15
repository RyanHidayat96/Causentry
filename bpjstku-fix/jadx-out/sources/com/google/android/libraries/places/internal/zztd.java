package com.google.android.libraries.places.internal;

import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.ViewCompat;
import com.bpjstku.presentation.membership.login.LoginActivity;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class zztd {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {29, 88, -118, 32, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$e = 65;
    private static final byte[] $$a = {31, 115, -100, -11, -2, 10, -10};
    private static final int $$b = 41;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static long TuitionPaymentFragmentbindingInflater1 = 599019855625456554L;

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 4
            int r6 = 111 - r6
            int r7 = r7 * 2
            int r0 = 4 - r7
            int r8 = r8 + 4
            byte[] r1 = com.google.android.libraries.places.internal.zztd.$$a
            byte[] r0 = new byte[r0]
            int r7 = 3 - r7
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
            int r8 = r8 + 1
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2e:
            int r8 = -r8
            int r6 = r6 + r8
            int r6 = r6 + (-1)
            r8 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zztd.a(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 52
            int r0 = r6 + 1
            int r8 = r8 + 84
            int r7 = r7 * 52
            int r7 = 55 - r7
            byte[] r1 = com.google.android.libraries.places.internal.zztd.$$d
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2e
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zztd.b(byte, int, short, java.lang.Object[]):void");
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        int i3 = $11 + 75;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i5 = $10 + 47;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), Gravity.getAbsoluteGravity(0, 0) + 2624, 13 - View.MeasureSpec.getSize(0), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() & TuitionPaymentFragmentbindingInflater1 & 9053247990562531611L;
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - TextUtils.getCapsMode("", 0, 0)), 482 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 36 - TextUtils.lastIndexOf("", '0', 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i7 = getrealtimecapturelatency.b;
                Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 19471), TextUtils.indexOf("", "", 0, 0) + 2624, 13 - (ViewConfiguration.getTapTimeout() >> 16), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (TuitionPaymentFragmentbindingInflater1 ^ 9053247990562531611L);
                Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 39422), 480 - TextUtils.indexOf((CharSequence) "", '0', 0), Process.getGidForName("") + 38, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 39421), 481 - View.resolveSize(0, 0), 37 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0800 A[PHI: r1 r5
  0x0800: PHI (r1v26 int) = (r1v25 int), (r1v42 int) binds: [B:110:0x07fe, B:107:0x07f5] A[DONT_GENERATE, DONT_INLINE]
  0x0800: PHI (r5v21 int) = (r5v20 int), (r5v24 int) binds: [B:110:0x07fe, B:107:0x07f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:112:0x080a A[PHI: r1 r5
  0x080a: PHI (r1v41 int) = (r1v25 int), (r1v42 int) binds: [B:110:0x07fe, B:107:0x07f5] A[DONT_GENERATE, DONT_INLINE]
  0x080a: PHI (r5v23 int) = (r5v20 int), (r5v24 int) binds: [B:110:0x07fe, B:107:0x07f5] A[DONT_GENERATE, DONT_INLINE]] */
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2(List list) throws Throwable {
        int i;
        int i2;
        int i3;
        String string;
        Method method;
        char[] cArr;
        int keyRepeatDelay;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i4;
        Class<?> cls;
        char[] cArr2;
        Class<?> cls2;
        String str;
        Class<?>[] clsArr;
        int i5;
        Method[] methodArr;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        String str2;
        int i11 = 2 % 2;
        int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i12 % 128;
        int i13 = i12 % 2;
        int i14 = 1;
        Method[] methodArr2 = new Method[1];
        byte b = (byte) 0;
        byte b2 = b;
        Object[] objArr = new Object[1];
        a(b, b2, (byte) (b2 - 1), objArr);
        String str3 = (String) objArr[0];
        Class[] clsArr2 = new Class[1];
        int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i16 = ((i15 | 85) << 1) - (i15 ^ 85);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i16 % 128;
        int i17 = 5;
        if (i16 % 2 != 0) {
            clsArr2[0] = String.class;
            methodArr2[0] = AssetManager.class.getMethod(str3, clsArr2);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 2823;
                int absoluteGravity = 22 - Gravity.getAbsoluteGravity(0, 0);
                byte[] bArr = $$d;
                byte b3 = bArr[5];
                Object[] objArr2 = new Object[1];
                b(b3, b3, bArr[7], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(minimumFlingVelocity, scrollBarSize, absoluteGravity, 1814927978, false, (String) objArr2[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
            throw null;
        }
        clsArr2[0] = String.class;
        methodArr2[0] = AssetManager.class.getMethod(str3, clsArr2);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
            int longPressTimeout = 2823 - (ViewConfiguration.getLongPressTimeout() >> 16);
            int scrollBarFadeDuration = 22 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            byte[] bArr2 = $$d;
            byte b4 = bArr2[5];
            Object[] objArr3 = new Object[1];
            b(b4, b4, bArr2[7], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(edgeSlop, longPressTimeout, scrollBarFadeDuration, 1814927978, false, (String) objArr3[0], null);
        }
        int i18 = 24;
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null) == null) {
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) KeyEvent.normalizeMetaState(0), 2823 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 21 - TextUtils.indexOf((CharSequence) "", '0'))).getDeclaredMethods();
            int length = declaredMethods.length;
            int i19 = 0;
            while (i19 < length) {
                Method method2 = declaredMethods[i19];
                int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 91;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i20 % 128;
                if (i20 % 2 != 0) {
                    try {
                        cArr = new char[i18];
                        // fill-array-data instruction
                        cArr[0] = 41691;
                        cArr[1] = 1907;
                        cArr[2] = 59777;
                        cArr[3] = 21049;
                        cArr[4] = 13331;
                        cArr[5] = 40690;
                        cArr[6] = 17154;
                        cArr[7] = 9642;
                        cArr[8] = 36814;
                        cArr[9] = 28708;
                        cArr[10] = 55965;
                        cArr[11] = 48341;
                        cArr[12] = 24947;
                        cArr[13] = 52122;
                        cArr[14] = 44094;
                        cArr[15] = 5727;
                        cArr[16] = 63733;
                        cArr[17] = 23884;
                        cArr[18] = 1930;
                        cArr[19] = 59853;
                        cArr[20] = 21113;
                        cArr[21] = 13446;
                        cArr[22] = 40668;
                        cArr[23] = 17264;
                        keyRepeatDelay = ViewConfiguration.getKeyRepeatDelay() >> 48;
                        iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        int i21 = -keyRepeatDelay;
                        i4 = (i21 ^ 450) + ((i21 & 450) << i14);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } else {
                    cArr = new char[i18];
                    // fill-array-data instruction
                    cArr[0] = 41691;
                    cArr[1] = 1907;
                    cArr[2] = 59777;
                    cArr[3] = 21049;
                    cArr[4] = 13331;
                    cArr[5] = 40690;
                    cArr[6] = 17154;
                    cArr[7] = 9642;
                    cArr[8] = 36814;
                    cArr[9] = 28708;
                    cArr[10] = 55965;
                    cArr[11] = 48341;
                    cArr[12] = 24947;
                    cArr[13] = 52122;
                    cArr[14] = 44094;
                    cArr[15] = 5727;
                    cArr[16] = 63733;
                    cArr[17] = 23884;
                    cArr[18] = 1930;
                    cArr[19] = 59853;
                    cArr[20] = 21113;
                    cArr[21] = 13446;
                    cArr[22] = 40668;
                    cArr[23] = 17264;
                    keyRepeatDelay = ViewConfiguration.getKeyRepeatDelay() >> 16;
                    iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    i4 = keyRepeatDelay * 450;
                }
                int i22 = i4 - 18996544;
                int i23 = ~keyRepeatDelay;
                int i24 = ((-42404) ^ keyRepeatDelay) | ((-42404) & keyRepeatDelay);
                int i25 = -(-(((~((i24 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i24 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2))) | (~((i23 ^ 42403) | (i23 & 42403)))) * 449));
                int i26 = ((i22 | i25) << i14) - (i25 ^ i22);
                int i27 = ~keyRepeatDelay;
                int i28 = -(-((~((i27 & 42403) | (i27 ^ 42403))) * (-1347)));
                int i29 = (i26 & i28) + (i28 | i26);
                int i30 = (i23 ^ 42403) | (i23 & 42403);
                int i31 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i32 = ((i31 | 5) << i14) - (i31 ^ i17);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i32 % 128;
                int i33 = i32 % 2;
                int i34 = ~i30;
                if (i33 != 0) {
                    int i35 = ~((-42404) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | keyRepeatDelay);
                    Object[] objArr4 = new Object[i14];
                    c(cArr, i29 << (449 >>> ((i34 & i35) | (i34 ^ i35))), objArr4);
                    cls = Class.forName((String) objArr4[0]);
                    cArr2 = new char[12];
                } else {
                    int i36 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i37 = ~(((-42404) ^ i36) | (i36 & (-42404)) | keyRepeatDelay);
                    int i38 = i29 + (((i34 & i37) | (i34 ^ i37)) * 449);
                    Object[] objArr5 = new Object[i14];
                    c(cArr, i38, objArr5);
                    cls = Class.forName((String) objArr5[0]);
                    cArr2 = new char[12];
                }
                // fill-array-data instruction
                cArr2[0] = 41686;
                cArr2[1] = 56781;
                cArr2[2] = 23799;
                cArr2[3] = 57271;
                cArr2[4] = 24250;
                cArr2[5] = 55720;
                cArr2[6] = 22606;
                cArr2[7] = 56184;
                cArr2[8] = 23056;
                cArr2[9] = 54581;
                cArr2[10] = 21561;
                cArr2[11] = 54481;
                int i39 = -(-TextUtils.lastIndexOf("", '0', 0, 0));
                int i40 = (i39 ^ 32538) + ((i39 & 32538) << i14);
                Object[] objArr6 = new Object[i14];
                c(cArr2, i40, objArr6);
                Integer num = (Integer) cls.getMethod((String) objArr6[0], null).invoke(method2, null);
                int i41 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i42 = (i41 ^ 7) + ((i41 & 7) << i14);
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i42 % 128;
                int i43 = i42 % 2;
                Object[] objArr7 = new Object[i14];
                objArr7[0] = Integer.valueOf(num.intValue());
                char[] cArr3 = {41691, 43367, 46505, 33269, 35907, 38990, 58522, 61662, 65390, 52208, 55269, 8713, 11843, 14998, 1750, 3435, 6581, 26040, 28706, 31819, 18585, 21723, 41837, 44969, 48124, 34332};
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0);
                int i44 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i45 = (i44 & 31) + (i44 | 31);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i45 % 128;
                if (i45 % 2 != 0) {
                    int i46 = 2998 >> iIndexOf;
                    Object[] objArr8 = new Object[i14];
                    c(cArr3, i46, objArr8);
                    cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[i14];
                    c(new char[]{41688, 9319, 44981, 12607, 47185, 993, 34073, 3159}, 34468 << (SystemClock.elapsedRealtime() > 1L ? 1 : (SystemClock.elapsedRealtime() == 1L ? 0 : -1)), objArr9);
                    str = (String) objArr9[0];
                    clsArr = new Class[i14];
                    i5 = i14;
                } else {
                    int i47 = -iIndexOf;
                    Object[] objArr10 = new Object[i14];
                    c(cArr3, ((i47 | 2998) << i14) - (2998 ^ i47), objArr10);
                    cls2 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[i14];
                    c(new char[]{41688, 9319, 44981, 12607, 47185, 993, 34073, 3159}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 34468, objArr11);
                    str = (String) objArr11[0];
                    clsArr = new Class[i14];
                    i5 = 0;
                }
                clsArr[i5] = Integer.TYPE;
                if (((((Boolean) cls2.getMethod(str, clsArr).invoke(null, objArr7)).booleanValue() ? 1 : 0) ^ i14) != 0) {
                    methodArr = declaredMethods;
                    i6 = length;
                } else {
                    Class cls3 = Long.TYPE;
                    char[] cArr4 = {41691, 1907, 59777, 21049, 13331, 40690, 17154, 9642, 36814, 28708, 55965, 48341, 24947, 52122, 44094, 5727, 63733, 23884, 1930, 59853, 21113, 13446, 40668, 17264};
                    int i48 = -View.getDefaultSize(0, 0);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    int i49 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i50 = ((i49 | 69) << i14) - (i49 ^ 69);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i50 % 128;
                    int i51 = i50 % 2;
                    int i52 = i48 * (-919);
                    int i53 = ((i52 | (-38968357)) << 1) - (i52 ^ (-38968357));
                    int i54 = ~i48;
                    int i55 = (i54 ^ (-42404)) | ((-42404) & i54);
                    int i56 = ~((i55 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i55 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                    int i57 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i58 = ((-42404) ^ i57) | ((-42404) & i57);
                    int i59 = ~((i58 ^ i48) | (i58 & i48));
                    int i60 = (i56 ^ i59) | (i59 & i56);
                    int i61 = (i49 & 47) + (i49 | 47);
                    methodArr = declaredMethods;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i61 % 128;
                    int i62 = i61 % 2;
                    int i63 = (i53 - (~(920 * i60))) - 1;
                    int i64 = ~i55;
                    int i65 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i66 = ~(i54 | i65);
                    int i67 = -(-(((i64 & i66) | (i64 ^ i66)) * 920));
                    int i68 = ((i63 | i67) << 1) - (i63 ^ i67);
                    int i69 = ~i48;
                    int i70 = (i69 ^ (-42404)) | (i69 & (-42404));
                    int i71 = i49 + 125;
                    i6 = length;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i71 % 128;
                    if (i71 % 2 == 0) {
                        int i72 = ~((i70 ^ i65) | (i65 & i70));
                        int i73 = (i54 ^ 42403) | (42403 & i54);
                        i7 = i72 | (~((i73 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i73 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3)));
                        int i74 = 79 / 0;
                    } else {
                        int i75 = ~((i65 & i70) | (i70 ^ i65));
                        int i76 = (i69 & 42403) | (i69 ^ 42403);
                        int i77 = ~((i76 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i76 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                        i7 = (i77 & i75) | (i75 ^ i77);
                    }
                    int i78 = (-42404) | i48;
                    int i79 = (i7 | (~((i78 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i78 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3)))) * 920;
                    int i80 = (i68 ^ i79) + ((i79 & i68) << 1);
                    Object[] objArr12 = new Object[1];
                    c(cArr4, i80, objArr12);
                    Class<?> cls4 = Class.forName((String) objArr12[0]);
                    char[] cArr5 = {41686, 44223, 48659, 35234, 39800, 60114, 62534, 50734, 53639, 8998, 13030, 15448, 4048};
                    int i81 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i82 = (i81 & 113) + (i81 | 113);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i82 % 128;
                    int i83 = i82 % 2;
                    Object[] objArr13 = new Object[1];
                    c(cArr5, 3690 - (~(-View.MeasureSpec.makeMeasureSpec(0, 0))), objArr13);
                    if (cls3.equals(cls4.getMethod((String) objArr13[0], null).invoke(method2, null))) {
                        char[] cArr6 = {41691, 1907, 59777, 21049, 13331, 40690, 17154, 9642, 36814, 28708, 55965, 48341, 24947, 52122, 44094, 5727, 63733, 23884, 1930, 59853, 21113, 13446, 40668, 17264};
                        int i84 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        int i85 = (i84 * 624) - 26374044;
                        int i86 = (-42403) | i84;
                        int i87 = -(-((~((i86 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i86 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4))) * 623));
                        int i88 = ((i85 | i87) << 1) - (i85 ^ i87);
                        int i89 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                        int i90 = ~i84;
                        int i91 = ~((i90 & 42402) | (i90 ^ 42402));
                        int i92 = ((i89 & i91) | (i89 ^ i91)) * (-623);
                        int i93 = ((i88 | i92) << 1) - (i92 ^ i88);
                        int i94 = ~(((-42403) ^ i84) | ((-42403) & i84));
                        int i95 = ~(((-42403) & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | ((-42403) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                        int i96 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 47;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i96 % 128;
                        int i97 = i96 % 2;
                        int i98 = (i94 & i95) | (i94 ^ i95);
                        int i99 = ~((i84 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i84 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                        int i100 = 623 * ((i99 & i98) | (i98 ^ i99));
                        Object[] objArr14 = new Object[1];
                        c(cArr6, (i93 & i100) + (i100 | i93), objArr14);
                        Class<?> cls5 = Class.forName((String) objArr14[0]);
                        char[] cArr7 = {41686, 23631, 24563, 22832, 22716, 23492, 21874, 21729, 22028, 20918, 20698, 21098, 19873, 20247, 20155, 18881, 19314};
                        int iIndexOf2 = TextUtils.indexOf("", "");
                        int i101 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i101 % 128;
                        int i102 = i101 % 2;
                        int i103 = -iIndexOf2;
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        int i104 = i103 * 483;
                        int i105 = ((i104 | 15773318) << 1) - (i104 ^ 15773318);
                        int i106 = ~i103;
                        int i107 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i107 % 128;
                        if (i107 % 2 != 0) {
                            int i108 = ~(((-65180) & i106) | (i106 ^ (-65180)));
                            int i109 = ~i103;
                            int i110 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                            int i111 = ~((i109 ^ i110) | (i109 & i110));
                            i8 = (i105 >> ((-241) / ((i108 & i111) | (i108 ^ i111)))) >> ((-482) / (i103 | 65179));
                        } else {
                            int i112 = ~((-65180) | i106);
                            int i113 = ~i103;
                            int i114 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                            int i115 = ~((i113 ^ i114) | (i113 & i114));
                            int i116 = i105 + (((i112 & i115) | (i112 ^ i115)) * (-241));
                            int i117 = -(-(((i103 ^ 65179) | (i103 & 65179)) * (-482)));
                            i8 = ((i117 & i116) << 1) + (i116 ^ i117);
                        }
                        int i118 = ~((i103 & (-65180)) | ((-65180) ^ i103));
                        int i119 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                        int i120 = (i119 & i106) | (i106 ^ i119);
                        int i121 = ~((i120 & 65179) | (i120 ^ 65179));
                        int i122 = -(-(((i118 & i121) | (i118 ^ i121)) * 241));
                        int i123 = ((i8 | i122) << 1) - (i122 ^ i8);
                        Object[] objArr15 = new Object[1];
                        c(cArr7, i123, objArr15);
                        Object[] objArr16 = (Object[]) cls5.getMethod((String) objArr15[0], null).invoke(method2, null);
                        if (objArr16.length == 2 && Long.TYPE.equals(objArr16[0])) {
                            int i124 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i124 % 128;
                            if (i124 % 2 == 0) {
                                Object[] objArr17 = new Object[1];
                                c(new char[]{41691, 1907, 59777, 21049, 13331, 40690, 17154, 9642, 36814, 28708, 55965, 48341, 24947, 52122, 44094, 5727, 63733, 23884, 1930, 59853, 21113, 13446, 40668, 17264}, 42404 << (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr17);
                                str2 = (String) objArr17[0];
                                i9 = 1;
                                i10 = 0;
                            } else {
                                int i125 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                int i126 = (i125 & 42404) + (i125 | 42404);
                                i9 = 1;
                                Object[] objArr18 = new Object[1];
                                c(new char[]{41691, 1907, 59777, 21049, 13331, 40690, 17154, 9642, 36814, 28708, 55965, 48341, 24947, 52122, 44094, 5727, 63733, 23884, 1930, 59853, 21113, 13446, 40668, 17264}, i126, objArr18);
                                i10 = 0;
                                str2 = (String) objArr18[0];
                            }
                            if (Class.forName(str2).equals(objArr16[i9])) {
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', i10) + i9);
                                    int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 2823;
                                    int pressedStateDuration = 22 - (ViewConfiguration.getPressedStateDuration() >> 16);
                                    byte[] bArr3 = $$d;
                                    byte b5 = bArr3[5];
                                    Object[] objArr19 = new Object[1];
                                    b(b5, b5, bArr3[7], objArr19);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, windowTouchSlop, pressedStateDuration, 1814927978, false, (String) objArr19[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, method2);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    char windowTouchSlop2 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                                    int absoluteGravity2 = 2823 - Gravity.getAbsoluteGravity(0, 0);
                                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 22;
                                    byte[] bArr4 = $$d;
                                    byte b6 = bArr4[5];
                                    Object[] objArr20 = new Object[1];
                                    b(b6, b6, bArr4[7], objArr20);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(windowTouchSlop2, absoluteGravity2, iMakeMeasureSpec, 1814927978, false, (String) objArr20[0], null);
                                }
                                try {
                                    Object[] objArr21 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null)};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                        char cIndexOf = (char) TextUtils.indexOf("", "");
                                        int trimmedLength = TextUtils.getTrimmedLength("") + 2823;
                                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 22;
                                        byte[] bArr5 = $$d;
                                        byte b7 = bArr5[7];
                                        Object[] objArr22 = new Object[1];
                                        b(b7, b7, bArr5[10], objArr22);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, trimmedLength, iKeyCodeFromString, -2137287382, false, (String) objArr22[0], new Class[]{Long.TYPE, Method.class});
                                    }
                                    ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr21)).longValue();
                                    break;
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 != null) {
                                        throw cause2;
                                    }
                                    throw th2;
                                }
                            }
                        }
                    } else {
                        continue;
                    }
                }
                i19++;
                length = i6;
                declaredMethods = methodArr;
                i14 = 1;
                i18 = 24;
                i17 = 5;
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
            int i127 = 2824 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            int trimmedLength2 = 22 - TextUtils.getTrimmedLength("");
            byte[] bArr6 = $$d;
            byte b8 = bArr6[5];
            Object[] objArr23 = new Object[1];
            b(b8, b8, bArr6[7], objArr23);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveOpacity, i127, trimmedLength2, 1814927978, false, (String) objArr23[0], null);
        }
        Object[] objArr24 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cArgb = (char) Color.argb(0, 0, 0, 0);
            int i128 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2823;
            int scrollDefaultDelay = 22 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            byte b9 = $$d[7];
            byte b10 = b9;
            Object[] objArr25 = new Object[1];
            b(b9, b10, (byte) (b10 | 14), objArr25);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cArgb, i128, scrollDefaultDelay, 1025296417, false, (String) objArr25[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr24);
        Object[] objArr26 = {0, methodArr2, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char c = (char) (37658 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2720;
            int i129 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 18;
            byte b11 = $$d[7];
            byte b12 = b11;
            Object[] objArr27 = new Object[1];
            b(b11, b12, (byte) (b12 | 14), objArr27);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c, maximumDrawingCacheSize, i129, -1568796068, false, (String) objArr27[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr26)).longValue();
        long j = -662495985;
        long j2 = -68;
        long j3 = -1;
        long j4 = j ^ j3;
        long j5 = jLongValue ^ j3;
        long j6 = (int) Runtime.getRuntime().totalMemory();
        long j7 = j6 ^ j3;
        long j8 = (((long) 69) * j) + (((long) (-67)) * jLongValue) + ((((j6 | jLongValue) ^ j3) | (((j4 | j5) | j7) ^ j3) | ((j | jLongValue) ^ j3)) * j2) + (j2 * (((j4 | j7) | jLongValue) ^ j3)) + (((long) 68) * (j4 | ((j5 | j7) ^ j3))) + ((long) (-1147909860));
        int i130 = ~(((int) Runtime.getRuntime().maxMemory()) | 1557373900);
        int i131 = ((int) (j8 >> 32)) & (1280985582 + ((120147489 | i130) * (-220)) + ((i130 | 52972577) * 220) + 2049819580);
        int i132 = (int) Runtime.getRuntime().totalMemory();
        int i133 = ~i132;
        int i134 = (~(694904877 | i133)) | (-763358590);
        int i135 = ~(i132 | (-673867821));
        int i136 = ((int) j8) & ((((i134 | i135) * (-252)) - 530062771) + ((i135 | (~(i133 | (-68453713)))) * 252));
        int i137 = (i131 & i136) | (i131 ^ i136);
        int i138 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i139 = i138 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i139 % 128;
        if (i139 % 2 != 0) {
            i = i137 % 23;
            i2 = i137 & ViewCompat.MEASURED_SIZE_MASK;
            if (i != 0) {
                int i140 = i138 + 55;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i140 % 128;
                int i141 = i140 % 2;
                i3 = 1;
            } else {
                i3 = 0;
            }
        } else {
            i = i137 >>> 24;
            i2 = i137 & ViewCompat.MEASURED_SIZE_MASK;
            if (i != 0) {
                int i142 = i138 + 55;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i142 % 128;
                int i143 = i142 % 2;
                i3 = 1;
            } else {
                i3 = 0;
            }
        }
        if (i3 == 0 || i2 >= 1 || (method = methodArr2[i2]) == null) {
            string = null;
        } else {
            int i144 = ((i138 | 83) << 1) - (i138 ^ 83);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i144 % 128;
            int i145 = i144 % 2;
            string = method.toString();
        }
        list.add(string);
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i146 = -(-(i * (-987)));
        int i147 = (5934 & i146) + (i146 | 5934);
        int i148 = ~i;
        int i149 = (~iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | i148;
        int i150 = ~((i149 & 6) | (i149 ^ 6));
        int i151 = ~((i ^ 6) | (i & 6) | iTuitionPaymentFragmentspecialinlinedviewModeldefault6);
        int i152 = i147 + (((i150 & i151) | (i150 ^ i151)) * 988);
        int i153 = ((i148 ^ 6) | (i148 & 6)) * (-988);
        int i154 = (i152 & i153) + (i153 | i152);
        int i155 = ~((i148 & (-7)) | ((-7) ^ i148));
        int i156 = ~i;
        int i157 = i155 | (~((i156 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i156 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6)));
        int i158 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        int i159 = ~((i158 & 6) | (i158 ^ 6) | i);
        int i160 = ((i159 & i157) | (i157 ^ i159)) * 988;
        return ((i154 & i160) + (i160 | i154)) * i3;
    }
}
