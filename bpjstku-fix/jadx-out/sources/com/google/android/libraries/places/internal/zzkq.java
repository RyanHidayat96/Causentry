package com.google.android.libraries.places.internal;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.core.view.ViewCompat;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zzkq implements zzbep {
    private static final byte[] $$c = {64, 73, -26, 82};
    private static final int $$f = 101;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {68, 83, 49, -116, -23, -9, 52, -68, -19, -11, -3, -16, -4, 44, -62, -24, -1, -25, -8, -5, -6, 43, -68, -17, -17, 58, -64, -20, -14, -17, 6, -20, -3, -25, -11, 7, -17, -13, -16, -4, 46, -38, -15, -35, -25, -11, 3, -20, -4, -9, -24, 36, -55, -9, -14, 4, -30, 69, -55, -45, -8, -20, -12, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$e = 57;
    private static final byte[] $$a = {46, 126, -84, 108, 23, -37, 42, 11, -10, 18, -7, 0, 7, 7, 23, -44, 44, 10, -5, 6, 18};
    private static final int $$b = 57;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {45565, 5702, 65168, 18162, 12067, 63345, 24512, 9310, 35923, 21691, 15546, 34163, 28053, 13771, 39472, 25205, 51889, 37675, 31576, 50095, 44015, 28723, 64824, 23173, 45652, 2609, 25598, 48060, 4865, 26851, 49304, 6248, 28729, 51605, 8516, 30996, 55008, 12390, 38873, 32530, 51057, 44786, 30436, 56917, 42382, 3531, 54646, 48471, 1225, 60431, 46172, 7089, 58349, 45557, 5708, 65169, 18158, 12088, 63345, 24528, 9225, 35956, 21673, 15591, 34120, 28079, 13783, 39456, 25205};
    private static long TuitionPaymentFragmentbindingInflater1 = -981751548684790232L;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 + 1
            int r7 = r7 * 10
            int r7 = r7 + 4
            int r8 = r8 * 3
            int r8 = r8 + 97
            byte[] r0 = com.google.android.libraries.places.internal.zzkq.$$a
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2b
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r3 = r3 + r7
            int r7 = r3 + (-5)
            int r8 = r8 + 1
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkq.a(short, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 59
            int r9 = r9 + 4
            int r7 = r7 * 7
            int r7 = r7 + 53
            byte[] r0 = com.google.android.libraries.places.internal.zzkq.$$d
            int r8 = r8 * 15
            int r8 = 99 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r7
            r3 = r9
            r4 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2c:
            int r9 = -r9
            int r3 = r3 + 1
            int r8 = r8 + r9
            int r8 = r8 + (-11)
            r9 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkq.c(short, short, int, java.lang.Object[]):void");
    }

    public static zzkp zza(Object obj) {
        int i = 2 % 2;
        zzkp zzkpVar = new zzkp((zzlf) obj);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return zzkpVar;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:46:0x01c0  */
    private static void b(int i, int i2, char c, Object[] objArr) throws Throwable {
        long j;
        Throwable cause;
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (true) {
            j = 0;
            if (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= i2) {
                break;
            }
            int i4 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2[i + i4])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b + 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ExpandableListView.getPackedPositionChild(0L) + 1), ((byte) KeyEvent.getModifierMetaStateMask()) + 2188, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 39, 841711447, false, $$g(b, b2, (byte) (b2 - 2)), new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(TuitionPaymentFragmentbindingInflater1), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33017 - View.resolveSize(0, 0)), KeyEvent.normalizeMetaState(0) + 3011, (ViewConfiguration.getTapTimeout() >> 16) + 26, 321985076, false, $$g(b3, b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = (byte) (b5 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36504 - TextUtils.indexOf((CharSequence) "", '0', 0)), AndroidCharacter.getMirror('0') + 3328, 17 - View.resolveSizeAndState(0, 0, 0), -968507904, false, $$g(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        int i5 = $11 + 31;
                        $10 = i5 % 128;
                        if (i5 % 2 != 0) {
                            int i6 = 3 / 5;
                        }
                    } catch (Throwable th) {
                        cause = th.getCause();
                        if (cause != null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        int i7 = $11 + 65;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                byte b7 = (byte) 0;
                byte b8 = (byte) (b7 + 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (36505 - KeyEvent.getDeadChar(0, 0)), (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 3375, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 17, -968507904, false, $$g(b7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            j = 0;
        }
        objArr[0] = new String(cArr);
    }

    @Override // com.google.android.libraries.places.internal.zzcbd
    public final /* synthetic */ Object zzb() throws Throwable {
        Object[] objArr;
        char c = 2;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cRgb = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 876;
            int offsetAfter = TextUtils.getOffsetAfter("", 0) + 10;
            byte[] bArr = $$a;
            byte b = bArr[11];
            Object[] objArr2 = new Object[1];
            a(b, b, bArr[17], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRgb, iCombineMeasuredStates, offsetAfter, -1199417970, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        b(TextUtils.getOffsetAfter("", 0), (Process.myPid() >> 22) + 22, (char) (KeyEvent.getMaxKeyCode() >> 16), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b(22 - (ViewConfiguration.getDoubleTapTimeout() >> 16), Gravity.getAbsoluteGravity(0, 0) + 15, (char) (19649 - Color.alpha(0)), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c2 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
            int longPressTimeout = 876 - (ViewConfiguration.getLongPressTimeout() >> 16);
            int iRed = 10 - Color.red(0);
            byte b2 = (byte) ($$b & 7);
            Object[] objArr5 = new Object[1];
            a(b2, b2, $$a[11], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, longPressTimeout, iRed, 254769921, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                int defaultSize = View.getDefaultSize(0, 0) + 876;
                int trimmedLength = TextUtils.getTrimmedLength("") + 10;
                byte b3 = (byte) ($$b & 7);
                byte[] bArr2 = $$a;
                byte b4 = bArr2[11];
                byte b5 = bArr2[12];
                Object[] objArr6 = new Object[1];
                a(b3, b4, b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(touchSlop, defaultSize, trimmedLength, 1324201839, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i4 = ~startElapsedRealtime;
            int i5 = ((((-634950844) + (((~(startElapsedRealtime | (-259105508))) | ((~((-277354521) | i4)) | 237044291)) * (-68))) + ((~((-22061217) | i4)) * (-68))) + (((~(259105507 | i4)) | (-299415737)) * 68)) - 659656066;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            b(KeyEvent.getDeadChar(0, 0) + 37, Process.getGidForName("") + 17, (char) (Color.rgb(0, 0, 0) + 16810384), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            b(TextUtils.indexOf("", "", 0) + 53, ExpandableListView.getPackedPositionType(0L) + 16, (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 43;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
            int i9 = i8 % 2;
            try {
                Object[] objArr10 = {Integer.valueOf(iIntValue), -659656066};
                byte[] bArr3 = $$d;
                byte b6 = bArr3[64];
                byte b7 = bArr3[66];
                Object[] objArr11 = new Object[1];
                c(b6, b7, b7, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b8 = bArr3[66];
                byte b9 = bArr3[64];
                Object[] objArr12 = new Object[1];
                c(b8, b9, b9, objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                    int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 876;
                    int i10 = 9 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    byte b10 = (byte) ($$b & 7);
                    byte[] bArr4 = $$a;
                    Object[] objArr13 = new Object[1];
                    a(b10, bArr4[11], bArr4[12], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollBarSize, fadingEdgeLength, i10, 1324201839, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    b(1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21, (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    b(22 - (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 15, (char) (MotionEvent.axisFromString("") + 19650), objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char gidForName = (char) ((-1) - Process.getGidForName(""));
                        int i11 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 875;
                        int i12 = 11 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        byte b11 = (byte) ($$b & 7);
                        Object[] objArr16 = new Object[1];
                        a(b11, b11, $$a[11], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(gidForName, i11, i12, 254769921, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c3 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                        int fadingEdgeLength2 = 876 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 11;
                        byte[] bArr5 = $$a;
                        byte b12 = bArr5[11];
                        Object[] objArr17 = new Object[1];
                        a(b12, b12, bArr5[17], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, fadingEdgeLength2, packedPositionChild, -1199417970, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    c = 2;
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
        int i13 = ((int[]) objArr[c])[0];
        int i14 = ((int[]) objArr[0])[0];
        if (i14 == i13) {
            int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i15 % 128;
            int i16 = i15 % 2;
            int i17 = ((int[]) objArr[1])[0];
            Object[] objArr18 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iMyUid = Process.myUid();
            int i18 = i17 + 1432569326 + ((~(851441277 | iMyUid)) * 623) + (((~iMyUid) | 805355528) * (-623)) + (((~(iMyUid | 848553517)) | (~(808243288 | iMyUid)) | (-851441278)) * 623);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr18[1])[0] = i20 ^ (i20 << 5);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = (String[]) objArr[3];
        if (strArr != null) {
            int i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i21 % 128;
            int i22 = i21 % 2;
            for (String str : strArr) {
                arrayList.add(str);
            }
        }
        int[] iArr = new int[i14];
        int i23 = i14 - 1;
        iArr[i23] = 1;
        Toast.makeText((Context) null, iArr[((i14 * i23) % 2) - 1], 1).show();
        int i24 = ((int[]) objArr[1])[0];
        Object[] objArr19 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i25 = ~((-513556117) | (~iIdentityHashCode));
        int i26 = i24 + (((-515718848) | i25 | (~(513556116 | iIdentityHashCode))) * (-338)) + 1820998740 + (((~(iIdentityHashCode | (-2162732))) | i25) * 338);
        int i27 = (i26 << 13) ^ i26;
        int i28 = i27 ^ (i27 >>> 17);
        ((int[]) objArr19[1])[0] = i28 ^ (i28 << 5);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r7, int r8, byte r9) {
        /*
            int r8 = r8 * 3
            int r8 = 115 - r8
            int r7 = r7 * 3
            int r7 = 1 - r7
            int r9 = r9 * 2
            int r9 = r9 + 4
            byte[] r0 = com.google.android.libraries.places.internal.zzkq.$$c
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r9
            r4 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L24:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2a:
            int r8 = r8 + r9
            int r9 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkq.$$g(int, int, byte):java.lang.String");
    }
}
