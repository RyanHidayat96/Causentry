package com.google.android.gms.internal.fido;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.abortCapture;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
final class zzbb {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean zzh;
    private static final byte[] $$c = {12, 11, -9, -106};
    private static final int $$f = 213;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {22, 102, 43, -6, -38, -20, 0, -21, 9, 39, -25, -38, -20, 0, -21, 9, 22, -52, -7, -14, -6, -5, -5, 31, -59, -4, 7, -21, -4, 5, -19, 17, -46, 3, -14, 4, -5, -23, 3, -2, 15, -29, -20, 3, -10, -5, 36, 9, -56, -41, 4, -19, 3, -14, -7, 22, -25, -32, 4, 0, -17, -14, 38, -52, 9, -14, -14, 0, -17, -14, -7, -5, 3, -6, -14, 0, -19, -5, -13, -6, -5, -13, 1, -7, -26, 5, -4, -26, 34, -42, 3, -9, -15, 0, -9, -9, -3, -28, 1, -16, 58, -41, 4, -19, 3, -14, -7, 22, -25, -32, 4, 0, -17, -14, 38, -52, 9, -14, -14, 0, -17, -14, -7, -5, 3, -6, -14, 0, -19, -5, -13, -6, -5, -13, 1, -7, -26, 5, -4, -26, 34, -42, 3, -9, -15, 0, -9, -9, -3, -28, 1, -16, 59};
    private static final int $$e = 24;
    private static final byte[] $$a = {32, 1, 70, -122, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 242;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 8617734892018825444L;

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    /* JADX WARN: Illegal instructions before constructor call */
    zzbb(String str, char[] cArr) {
        char c;
        boolean z;
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
            boolean z2 = true;
            if (i2 % 2 == 0) {
                c = cArr[i];
                if (c < 8946) {
                    z = false;
                    int i4 = i3 + 15;
                    int i5 = i4 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5;
                    z2 = i4 % 2 == 0;
                    int i6 = i5 + 11;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
                    int i7 = i6 % 2;
                    int i8 = 2 % 2;
                } else {
                    z2 = false;
                    z = z2;
                    z2 = false;
                }
            } else {
                c = cArr[i];
                if (c < 128) {
                    z = true;
                    int i9 = i3 + 15;
                    int i10 = i9 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10;
                    if (i9 % 2 == 0) {
                    }
                    int i11 = i10 + 11;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                    int i12 = i11 % 2;
                    int i13 = 2 % 2;
                } else {
                    z = z2;
                    z2 = false;
                }
            }
            zzam.zzd(z2, "Non-ASCII character: %s", c);
            if (bArr[c] != -1) {
                int i14 = 2 % 2;
                z = false;
            }
            zzam.zzd(z, "Duplicate character: %s", c);
            bArr[c] = (byte) i;
        }
        this(str, cArr, bArr, false);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = 93 - r8
            int r7 = r7 * 4
            int r7 = 84 - r7
            int r6 = r6 * 15
            int r6 = 53 - r6
            byte[] r0 = com.google.android.gms.internal.fido.zzbb.$$a
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r8 + (-11)
            int r8 = r3 + 1
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fido.zzbb.a(byte, int, int, java.lang.Object[]):void");
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
    private static void c(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 17
            int r7 = 84 - r7
            int r8 = r8 * 45
            int r0 = 98 - r8
            int r6 = r6 * 97
            int r6 = r6 + 4
            byte[] r1 = com.google.android.gms.internal.fido.zzbb.$$d
            byte[] r0 = new byte[r0]
            int r8 = 97 - r8
            r2 = 0
            if (r1 != 0) goto L19
            r3 = r7
            r4 = r2
            r7 = r6
            goto L30
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-8)
            int r7 = r7 + 1
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fido.zzbb.c(int, short, byte, java.lang.Object[]):void");
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        char[] cArr = this.zzf;
        return i3 != 0 ? Arrays.hashCode(cArr) / 19181 : Arrays.hashCode(cArr) + 1237;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 == 0) {
            boolean z = obj instanceof zzbb;
            throw null;
        }
        if (obj instanceof zzbb) {
            int i4 = i2 + 9;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
            zzbb zzbbVar = (zzbb) obj;
            boolean z2 = zzbbVar.zzh;
            if (Arrays.equals(this.zzf, zzbbVar.zzf)) {
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
                int i7 = i6 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7;
                int i8 = i6 % 2;
                int i9 = i7 + 25;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 3 / 0;
                }
                return true;
            }
        }
        return false;
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        int i3 = $10 + 47;
        $11 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 5 / 3;
        }
        while (abortcapture.b < cArrB.length) {
            int i5 = $11 + 41;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i7 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 64838), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1355, 38 - KeyEvent.normalizeMetaState(0), 894276454, false, $$g(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.argb(0, 0, 0, 0) + 47773), 468 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), ImageFormat.getBitsPerPixel(0) + 14, 896083767, false, "n", new Class[]{Object.class, Object.class});
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

    final char zza(int i) throws Throwable {
        Object[] objArr;
        int i2 = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
            int iAlpha = 876 - Color.alpha(0);
            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 10;
            byte[] bArr = $$a;
            byte b = bArr[1];
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            a(b, b2, (byte) (b2 | 89), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionChild, iAlpha, threadPriority, -1650998592, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        b(new char[]{19617, 19648, 23857, 14355, 40807, 53213, 7539, 10387, 1734, 33234, 22395, 40647, 55518, 31696, 33065, 54434, 37568, 11736, 15227, 2716, 25836, 59344, 30043, 16558, 16106, 23024}, TextUtils.getOffsetAfter("", 0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b(new char[]{48577, 48548, 56138, 33711, 31316, 18852, 42698, 52642, 63418, 1957, 60615, 31624, 10676, 64953, 15063, 12726, 25520, 43965, 32982}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char modifierMetaStateMask = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
            int doubleTapTimeout = 876 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 10;
            byte b3 = $$a[7];
            byte b4 = b3;
            Object[] objArr5 = new Object[1];
            a(b3, b4, (byte) (b4 | 52), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(modifierMetaStateMask, doubleTapTimeout, windowTouchSlop, 2012020043, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cGreen = (char) Color.green(0);
                int threadPriority2 = 876 - ((Process.getThreadPriority(0) + 20) >> 6);
                int scrollBarSize = 10 - (ViewConfiguration.getScrollBarSize() >> 8);
                byte b5 = $$a[7];
                byte b6 = b5;
                Object[] objArr6 = new Object[1];
                a(b5, b6, b6, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cGreen, threadPriority2, scrollBarSize, 2012931276, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int i5 = ~((~System.identityHashCode(this)) | (-470224240));
            int i6 = ((((-510603120) | i5) * (-970)) - 1836285068) + ((i5 | 40378880) * 970) + 891096972;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[1])[0] = i8 ^ (i8 << 5);
            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 89;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
            int i10 = i9 % 2;
        } else {
            Object[] objArr8 = new Object[1];
            b(new char[]{12224, 12193, 18921, 62107, 10368, 56069, 55291, 40820, 26023, 38154, 40435, 10528, 48049, 28427, 19455, 25400, 61849, 14608, 61939, 48503, 1942, 62242, 49099, 63327, 23996, 19755, 26053, 331, 37777, 1855}, Process.myPid() >> 22, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            b(new char[]{59163, 59256, 7704, 48900, 55975, 36079, 39538, 27987, 44406, 49916, 53372, 56168, 29563, 14586, 1660, 37208, 14688, 28387, 48236, 20304, 53076, 42196}, Color.argb(0, 0, 0, 0), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                    int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 29;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
                    int i12 = i11 % 2;
                    applicationContext = null;
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                    int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 113;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 % 128;
                    if (i13 % 2 != 0) {
                        int i14 = 5 % 3;
                    }
                }
            }
            try {
                Object[] objArr10 = {applicationContext, Integer.valueOf(i), 0, 891096972};
                byte[] bArr2 = $$d;
                byte b7 = bArr2[6];
                Object[] objArr11 = new Object[1];
                c(b7, bArr2[82], b7, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b8 = bArr2[82];
                Object[] objArr12 = new Object[1];
                c(b8, bArr2[6], b8, objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 876;
                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 10;
                        byte b9 = $$a[7];
                        byte b10 = b9;
                        Object[] objArr14 = new Object[1];
                        a(b9, b10, b10, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, iCombineMeasuredStates, edgeSlop, 2012931276, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                    try {
                        Object[] objArr15 = new Object[1];
                        b(new char[]{19617, 19648, 23857, 14355, 40807, 53213, 7539, 10387, 1734, 33234, 22395, 40647, 55518, 31696, 33065, 54434, 37568, 11736, 15227, 2716, 25836, 59344, 30043, 16558, 16106, 23024}, ViewConfiguration.getKeyRepeatDelay() >> 16, objArr15);
                        Class<?> cls4 = Class.forName((String) objArr15[0]);
                        Object[] objArr16 = new Object[1];
                        b(new char[]{48577, 48548, 56138, 33711, 31316, 18852, 42698, 52642, 63418, 1957, 60615, 31624, 10676, 64953, 15063, 12726, 25520, 43965, 32982}, ViewConfiguration.getWindowTouchSlop() >> 8, objArr16);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                            int i15 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 875;
                            int capsMode = 10 - TextUtils.getCapsMode("", 0, 0);
                            byte b11 = $$a[7];
                            byte b12 = b11;
                            Object[] objArr17 = new Object[1];
                            a(b11, b12, (byte) (b12 | 52), objArr17);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveOpacity, i15, capsMode, 2012020043, false, (String) objArr17[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char threadPriority3 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                            int trimmedLength = 876 - TextUtils.getTrimmedLength("");
                            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 10;
                            byte[] bArr3 = $$a;
                            byte b13 = bArr3[1];
                            byte b14 = bArr3[7];
                            Object[] objArr18 = new Object[1];
                            a(b13, b14, (byte) (b14 | 89), objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(threadPriority3, trimmedLength, packedPositionGroup, -1650998592, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr13;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i16 = ((int[]) objArr[2])[0];
        int i17 = ((int[]) objArr[0])[0];
        if (i17 == i16) {
            int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i18 % 128;
            int i19 = i18 % 2;
            int i20 = ((int[]) objArr[1])[0];
            int i21 = ((int[]) objArr[0])[0];
            int i22 = ((int[]) objArr[2])[0];
            new int[1][0] = i21;
            new int[1][0] = i22;
            int i23 = i20 + (-1703544620) + (((~(756061779 | i)) | 40314920) * 576) + (((~((~i) | 796376699)) | 756057088) * 576) + 1746557440;
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            int[] iArr = {i25 ^ (i25 << 5)};
        } else {
            int[] iArr2 = new int[i17];
            int i26 = i17 - 1;
            iArr2[i26] = 1;
            Toast.makeText((Context) null, iArr2[((i17 * i26) % 2) - 1], 1).show();
            int i27 = ((int[]) objArr[1])[0];
            Object[] objArr19 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i28 = i27 + (-208210156) + (((~((-444837716) | iIdentityHashCode)) | 42149377) * 1504) + ((~(iIdentityHashCode | (-402688339))) * (-1504)) + 1280366816;
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr19[1])[0] = i30 ^ (i30 << 5);
        }
        return this.zzf[i];
    }

    private zzbb(String str, char[] cArr, byte[] bArr, boolean z) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int iZzb = zzbh.zzb(length, RoundingMode.UNNECESSARY);
            this.zzb = iZzb;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iZzb);
            int i = 1 << (3 - iNumberOfTrailingZeros);
            this.zzc = i;
            this.zzd = iZzb >> iNumberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i];
            int i2 = 2 % 2;
            int i3 = 0;
            while (i3 < this.zzd) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                if (i4 % 2 == 0) {
                    zArr[zzbh.zza(i3 / 48, this.zzb, RoundingMode.CEILING)] = false;
                    i3 += 118;
                } else {
                    zArr[zzbh.zza(i3 * 8, this.zzb, RoundingMode.CEILING)] = true;
                    i3++;
                }
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 119;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                int i6 = i5 % 2;
            }
            this.zzh = false;
        } catch (ArithmeticException e2) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e2);
        }
    }

    static /* synthetic */ char[] zzc(zzbb zzbbVar) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        char[] cArr = zzbbVar.zzf;
        if (i3 != 0) {
            return cArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.zze;
        int i4 = i2 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean zzb(char c) {
        int i = 2 % 2;
        if (this.zzg[61] != -1) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 37;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, int r7, short r8) {
        /*
            byte[] r0 = com.google.android.gms.internal.fido.zzbb.$$c
            int r8 = r8 * 3
            int r8 = 4 - r8
            int r6 = r6 * 2
            int r1 = 1 - r6
            int r7 = r7 * 2
            int r7 = r7 + 107
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L19
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2c
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r3 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2c:
            int r8 = -r8
            int r7 = r7 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fido.zzbb.$$g(int, int, short):java.lang.String");
    }
}
