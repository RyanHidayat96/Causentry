package com.google.android.material.color.utilities;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import defpackage.abortCapture;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class PointProviderLab implements PointProvider {
    private static final byte[] $$c = {6, 51, 46, 31};
    private static final int $$f = 228;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {25, -93, -120, -48, -53, -3, -23, -12, 39, -54, -9, -16, -8, -7, -7, -10, -3, -23, 39, -53, -3, -23, -12, 26, -27, -27, 7, -22, -16, 54, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$e = 253;
    private static final byte[] $$a = {39, -79, 42, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 123;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 8382404907649360574L;

    private static void a(short s, int i, int i2, Object[] objArr) {
        int i3 = (i * 52) + 3;
        byte[] bArr = $$a;
        int i4 = (i2 * 14) + 84;
        byte[] bArr2 = new byte[s + 1];
        int i5 = -1;
        if (bArr == null) {
            i5 = -1;
            i4 = (i4 + i3) - 10;
            i3++;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i4;
            if (i6 == s) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i7 = i4;
            int i8 = i3 + 1;
            i5 = i6;
            i4 = (i7 + bArr[i3]) - 10;
            i3 = i8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            int r7 = r7 * 19
            int r7 = 84 - r7
            int r6 = r6 * 11
            int r0 = r6 + 27
            byte[] r1 = com.google.android.material.color.utilities.PointProviderLab.$$d
            byte[] r0 = new byte[r0]
            int r6 = r6 + 26
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2e
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r8 = r8 + 1
            if (r3 != r6) goto L26
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
            int r7 = r7 + r8
            int r7 = r7 + (-10)
            r8 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.color.utilities.PointProviderLab.c(short, byte, short, java.lang.Object[]):void");
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        int i3 = $11 + 87;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (abortcapture.b < cArrB.length) {
            int i5 = $10 + 59;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i7 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 64838), 1356 - (ViewConfiguration.getWindowTouchSlop() >> 8), View.MeasureSpec.getMode(0) + 38, 894276454, false, $$g(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (ViewConfiguration.getPressedStateDuration() >> 16) + 468, 13 - Color.red(0), 896083767, false, "n", new Class[]{Object.class, Object.class});
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

    /* JADX WARN: Code duplicated, block: B:24:0x0207  */
    /* JADX WARN: Code duplicated, block: B:27:0x021d  */
    @Override // com.google.android.material.color.utilities.PointProvider
    public final double[] fromInt(int i) throws Throwable {
        Object[] objArr;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) (31532 - TextUtils.indexOf((CharSequence) "", '0', 0));
            int i5 = 922 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            int i6 = 29 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            byte[] bArr = $$a;
            byte b = bArr[79];
            Object[] objArr2 = new Object[1];
            a(b, b, bArr[36], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, i5, i6, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        b(new char[]{54540, 39962, 59994, 54637, 5292, 10980, 64398, 45086, 62979, 12363, 57134, 38690, 37795, 21489, 45572, 52223, 48981, 28305, 37374, 11817, 22753, 35329, 29958, 643, 25999, 42441}, TextUtils.getTrimmedLength(""), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b(new char[]{59434, 34700, 65221, 59471, 3896, 1277, 61204, 40453, 52025, 11217, 52145, 47431, 44687, 18549, 42713, 58817, 33379, 29977, 34160}, Color.blue(0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cRgb = (char) ((-16745683) - Color.rgb(0, 0, 0));
            int iMyPid = 921 - (Process.myPid() >> 22);
            int iAlpha = 28 - Color.alpha(0);
            byte b2 = $$a[79];
            Object[] objArr5 = new Object[1];
            a((byte) 52, b2, b2, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRgb, iMyPid, iAlpha, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cNormalizeMetaState = (char) (31533 - KeyEvent.normalizeMetaState(0));
                int maximumDrawingCacheSize = 921 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int i7 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28;
                byte[] bArr2 = $$a;
                Object[] objArr6 = new Object[1];
                a((byte) 37, bArr2[36], bArr2[79], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cNormalizeMetaState, maximumDrawingCacheSize, i7, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i ^ (i << 5)}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int i8 = ~i;
            int i9 = (((1943482795 + ((i | 154741265) * 988)) + (((~(423213589 | i8)) | 1082393730) * (-1976))) + (((154741265 | (~((-1350866055) | i))) | (~(i8 | 1350866054))) * 988)) - 147058105;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
        } else {
            Object[] objArr8 = new Object[1];
            b(new char[]{63105, 54505, 15213, 63200, 23647, 7797, 10937, 33935, 54670, 30904, 3609, 41907, 45088, 6913, 25453, 65299, 40160, 9842, 16585, 6836, 31607, 49880, 42025, 13828, 17973, 60729, 63887, 21880, 8864, 35221}, ViewConfiguration.getScrollDefaultDelay() >> 16, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            b(new char[]{41103, 36014, 34669, 41196, 1027, 19320, 38575, 53634, 33674, 8440, 45577, 63185, 58943, 17222, 57201, 43609, 51916, 32311, 64713, 20409, 11616, 39576}, ViewConfiguration.getPressedStateDuration() >> 16, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 27;
                int i13 = i12 % 128;
                TuitionPaymentFragmentbindingInflater1 = i13;
                if (i12 % 2 != 0) {
                    int i14 = 63 / 0;
                    if (applicationContext instanceof ContextWrapper) {
                        int i15 = i13 + 23;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i15 % 128;
                        int i16 = i15 % 2;
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = null;
                        }
                    }
                } else if (applicationContext instanceof ContextWrapper) {
                    int i17 = i13 + 23;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i17 % 128;
                    int i18 = i17 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = null;
                    }
                }
                applicationContext = applicationContext.getApplicationContext();
            }
            try {
                Object[] objArr10 = {applicationContext, Integer.valueOf(i), 0, -147058105};
                byte[] bArr3 = $$d;
                byte b3 = bArr3[54];
                byte b4 = bArr3[33];
                Object[] objArr11 = new Object[1];
                c(b3, b4, (byte) (-b4), objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                Object[] objArr12 = new Object[1];
                c(bArr3[33], bArr3[54], bArr3[0], objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char absoluteGravity = (char) (Gravity.getAbsoluteGravity(0, 0) + 31533);
                    int iIndexOf = 920 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 28;
                    byte[] bArr4 = $$a;
                    Object[] objArr13 = new Object[1];
                    a((byte) 37, bArr4[36], bArr4[79], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(absoluteGravity, iIndexOf, jumpTapTimeout, -1142834547, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    b(new char[]{54540, 39962, 59994, 54637, 5292, 10980, 64398, 45086, 62979, 12363, 57134, 38690, 37795, 21489, 45572, 52223, 48981, 28305, 37374, 11817, 22753, 35329, 29958, 643, 25999, 42441}, TextUtils.indexOf("", ""), objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    b(new char[]{59434, 34700, 65221, 59471, 3896, 1277, 61204, 40453, 52025, 11217, 52145, 47431, 44687, 18549, 42713, 58817, 33379, 29977, 34160}, (Process.getThreadPriority(0) + 20) >> 6, objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 31533);
                        int gidForName = Process.getGidForName("") + 922;
                        int offsetBefore = TextUtils.getOffsetBefore("", 0) + 28;
                        byte b5 = $$a[79];
                        Object[] objArr16 = new Object[1];
                        a((byte) 52, b5, b5, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(touchSlop, gidForName, offsetBefore, -778300370, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char edgeSlop = (char) (31533 - (ViewConfiguration.getEdgeSlop() >> 16));
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 921;
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 28;
                        byte[] bArr5 = $$a;
                        byte b6 = bArr5[79];
                        Object[] objArr17 = new Object[1];
                        a(b6, b6, bArr5[36], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(edgeSlop, scrollBarSize, keyRepeatDelay, -1048449946, false, (String) objArr17[0], null);
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
        int i19 = ((int[]) objArr[1])[0];
        int i20 = ((int[]) objArr[3])[0];
        if (i20 != i19) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i20));
        }
        int i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 115;
        int i22 = i21 % 128;
        TuitionPaymentFragmentbindingInflater1 = i22;
        int i23 = i21 % 2;
        int i24 = ((int[]) objArr[0])[0];
        Object[] objArr18 = {new int[]{i ^ (i << 5)}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int i25 = ~i;
        int i26 = i24 + 1904735925 + (((~((-1394801851) | i25)) | (~((-379277794) | i))) * 210) + (((~(i25 | (-77136194))) | (~((-1092660251) | i))) * 210);
        int i27 = (i26 << 13) ^ i26;
        int i28 = i27 ^ (i27 >>> 17);
        int i29 = i22 + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i29 % 128;
        int i30 = i29 % 2;
        double[] dArrLabFromArgb = ColorUtils.labFromArgb(i);
        double d = dArrLabFromArgb[0];
        int i31 = ((int[]) objArr18[0])[0];
        int i32 = i31 * i31;
        int i33 = -(1634647640 * i31);
        int i34 = ((i32 | i33) << 1) - (i32 ^ i33);
        int i35 = -(i31 * (-1318060394));
        int i36 = (i34 & i35) + (i35 | i34);
        int i37 = ((i36 | 1812831057) << 1) - (1812831057 ^ i36);
        int i38 = i37 >> 23;
        int i39 = ((i38 & (-1023)) + (i38 | (-1023))) / 512;
        int i40 = (i39 ^ 1) + ((i39 & 1) << 1);
        int i41 = (i37 & i40) + (i40 | i37);
        int i42 = ((i37 >> 22) - 2047) / 1024;
        int i43 = -(i41 ^ ((i42 ^ 1) + ((i42 & 1) << 1)));
        int i44 = (i43 ^ 5) + ((i43 & 5) << 1);
        int i45 = i44 >> 16;
        int i46 = (((-131071) & i45) + (i45 | (-131071))) / 65536;
        int i47 = (i46 & 1) + (i46 | 1);
        return new double[]{d, dArrLabFromArgb[9505 / (((-(((i47 | 1) << 1) - (i47 ^ 1))) & i44) * 1901)], dArrLabFromArgb[2]};
    }

    @Override // com.google.android.material.color.utilities.PointProvider
    public final int toInt(double[] dArr) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int iArgbFromLab = i2 % 2 != 0 ? ColorUtils.argbFromLab(dArr[0], dArr[1], dArr[3]) : ColorUtils.argbFromLab(dArr[0], dArr[1], dArr[2]);
        int i3 = TuitionPaymentFragmentbindingInflater1 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            return iArgbFromLab;
        }
        throw null;
    }

    @Override // com.google.android.material.color.utilities.PointProvider
    public final double distance(double[] dArr, double[] dArr2) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 95;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            double d = dArr[0] - dArr2[0];
            double d2 = dArr[1] - dArr2[1];
            double d3 = dArr[2] - dArr2[2];
            return (d * d) + (d2 * d2) + (d3 * d3);
        }
        double d4 = dArr[0];
        double d5 = dArr2[0];
        double d6 = d4 + d5;
        double d7 = dArr[1] - d5;
        double d8 = dArr[5] % dArr2[5];
        return ((d6 - d6) * (d7 * d7)) % (d8 / d8);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r7, byte r8, byte r9) {
        /*
            int r7 = r7 + 4
            int r9 = r9 * 4
            int r9 = r9 + 107
            int r8 = r8 * 3
            int r8 = r8 + 1
            byte[] r0 = com.google.android.material.color.utilities.PointProviderLab.$$c
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r9 = r7
            r3 = r8
            r5 = r2
            goto L2b
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.color.utilities.PointProviderLab.$$g(short, byte, byte):java.lang.String");
    }
}
