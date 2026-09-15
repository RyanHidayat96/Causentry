package com.google.android.gms.internal.measurement;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class zzfd extends zzmf implements zznn {
    private static long TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final zzfd zzi;
    private int zzb;
    private int zzd;
    private zzmo zze = zzcv();
    private zzmo zzf = zzcv();
    private boolean zzg;
    private boolean zzh;
    private static final byte[] $$c = {27, 65, -33, 120};
    private static final int $$f = 216;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {46, 47, -18, 64, -39, 36, -39, -10, -16, 19, -42, 5, -22, -8, 6, -7, 25, -38, -19, -8, 2, -7, -10, -16, 20, -39, 36, -39, -10, -16, 19, -42, 5, -22, -8, 6, -7, 23, -57, 9, -17, -14, 36, -33, -21, 2, -16, -1, -21, -41, 4, -19, 3, -14, -7, 22, -25, -32, 4, 0, -17, -14, 38, -52, 9, -14, -14, 0, -17, -14, 10, -15, -13, 2, -13, -13, -1, 22, -45, 0, -14, 3, -27, 7, -21, 57};
    private static final int $$e = 199;
    private static final byte[] $$a = {101, 89, 94, -73, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 121;
    private static int b = 0;
    private static int d = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
        TuitionPaymentFragmentbindingInflater1();
        zzfd zzfdVar = new zzfd();
        zzi = zzfdVar;
        zzmf.zzcp(zzfd.class, zzfdVar);
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
        int i2 = i % 2;
    }

    private zzfd() {
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
    private static void a(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.android.gms.internal.measurement.zzfd.$$a
            int r8 = r8 * 15
            int r1 = r8 + 38
            int r7 = r7 + 4
            int r6 = r6 * 4
            int r6 = 84 - r6
            byte[] r1 = new byte[r1]
            int r8 = r8 + 37
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2e
        L16:
            r3 = r2
        L17:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2e:
            int r6 = r6 + r7
            int r6 = r6 + (-11)
            r7 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzfd.a(int, int, byte, java.lang.Object[]):void");
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
    private static void e(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 5
            int r6 = 84 - r6
            byte[] r0 = com.google.android.gms.internal.measurement.zzfd.$$d
            int r7 = r7 * 45
            int r7 = r7 + 4
            int r8 = r8 * 8
            int r1 = r8 + 38
            byte[] r1 = new byte[r1]
            int r8 = r8 + 37
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L2e
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r6
            r6 = r4
            r4 = r5
        L2e:
            int r7 = r7 + 1
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-8)
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzfd.e(int, byte, int, java.lang.Object[]):void");
    }

    public final int zzd() {
        int i = 2 % 2;
        int i2 = b + 123;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            this.zze.size();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int size = this.zze.size();
        int i3 = b + 13;
        d = i3 % 128;
        int i4 = i3 % 2;
        return size;
    }

    public final zzfn zze(int i) {
        zzfn zzfnVar;
        int i2 = 2 % 2;
        int i3 = d + 55;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            zzfnVar = (zzfn) this.zze.get(i);
            int i4 = 81 / 0;
        } else {
            zzfnVar = (zzfn) this.zze.get(i);
        }
        int i5 = b + 51;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 26 / 0;
        }
        return zzfnVar;
    }

    private static void c(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i4 = $11 + 99;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3[i + i6])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2186, 40 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 841711447, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(TuitionPaymentFragmentbindingInflater1), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 2;
                    byte b5 = (byte) (b4 - 3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33016 - TextUtils.indexOf((CharSequence) "", '0')), View.resolveSizeAndState(0, 0, 0) + 3011, ((Process.getThreadPriority(0) + 20) >> 6) + 26, 321985076, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 1;
                    byte b7 = (byte) (-b6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 36505), 3376 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), MotionEvent.axisFromString("") + 18, -968507904, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
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
            int i7 = $10 + 47;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                byte b8 = (byte) 1;
                byte b9 = (byte) (-b8);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.getDefaultSize(0, 0) + 36505), KeyEvent.keyCodeFromString("") + 3376, (ViewConfiguration.getFadingEdgeLength() >> 16) + 17, -968507904, false, $$g(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            int i9 = $11 + 73;
            $10 = i9 % 128;
            int i10 = i9 % 2;
        }
        objArr[0] = new String(cArr);
    }

    public final int zzg() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 43041);
            int iMyTid = 3111 - (Process.myTid() >> 22);
            int i2 = 22 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[7], bArr[5], bArr[132], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iMyTid, i2, -1272852037, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(View.MeasureSpec.getMode(0), 21 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(22 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 15 - KeyEvent.normalizeMetaState(0), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 4516), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char mode = (char) (43042 - View.MeasureSpec.getMode(0));
            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 3111;
            int packedPositionChild = 21 - ExpandableListView.getPackedPositionChild(0L);
            byte[] bArr2 = $$a;
            byte b2 = bArr2[7];
            Object[] objArr5 = new Object[1];
            a(b2, (byte) (b2 | 51), bArr2[132], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(mode, maxKeyCode, packedPositionChild, -1269618118, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 43042);
                int longPressTimeout = 3111 - (ViewConfiguration.getLongPressTimeout() >> 16);
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 23;
                byte b3 = $$a[7];
                byte b4 = b3;
                Object[] objArr6 = new Object[1];
                a(b4, (byte) (b4 | 103), b3, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSizeAndState, longPressTimeout, iIndexOf, 154975793, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i3 = ((int[]) objArr7[2])[0];
            int i4 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i3};
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = (((1414470840 + ((~((-1095761929) | iIdentityHashCode)) * 623)) + (((~iIdentityHashCode) | 536880850) * (-623))) + (((~(iIdentityHashCode | 573075190)) | ((~((-1131956269) | iIdentityHashCode)) | 1095761928)) * 623)) - 150195222;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[0])[0] = i7 ^ (i7 << 5);
            objArr = new Object[]{new int[1], new int[]{i4}, iArr, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            c(Color.blue(0) + 37, (Process.myTid() >> 22) + 16, (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 22575), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 53, TextUtils.indexOf("", "", 0, 0) + 16, (char) (View.combineMeasuredStates(0, 0) + 749), objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            int i8 = b + 109;
            d = i8 % 128;
            int i9 = i8 % 2;
            try {
                Object[] objArr10 = {null, Integer.valueOf(iIntValue), 0, -150195222};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[47];
                Object[] objArr11 = new Object[1];
                e((byte) (-b5), bArr3[59], (byte) (-b5), objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b6 = bArr3[59];
                Object[] objArr12 = new Object[1];
                e(b6, (byte) (-bArr3[47]), b6, objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 43042);
                    int pressedStateDuration = 3111 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 22;
                    byte b7 = $$a[7];
                    byte b8 = b7;
                    Object[] objArr14 = new Object[1];
                    a(b8, (byte) (b8 | 103), b7, objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(deadChar, pressedStateDuration, threadPriority, 154975793, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    c(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1, (ViewConfiguration.getLongPressTimeout() >> 16) + 22, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    c(23 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 15 - Drawable.resolveOpacity(0, 0), (char) (4518 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c2 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 43041);
                        int i10 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3110;
                        int iMyTid2 = 22 - (Process.myTid() >> 22);
                        byte[] bArr4 = $$a;
                        byte b9 = bArr4[7];
                        Object[] objArr17 = new Object[1];
                        a(b9, (byte) (b9 | 51), bArr4[132], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, i10, iMyTid2, -1269618118, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cMakeMeasureSpec = (char) (43042 - View.MeasureSpec.makeMeasureSpec(0, 0));
                        int i11 = 3111 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int i12 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 21;
                        byte[] bArr5 = $$a;
                        Object[] objArr18 = new Object[1];
                        a(bArr5[7], bArr5[5], bArr5[132], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMakeMeasureSpec, i11, i12, -1272852037, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr13;
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
        int i14 = ((int[]) objArr[2])[0];
        if (i14 != i13) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[3];
            if (strArr2 != null) {
                int i15 = d + 75;
                b = i15 % 128;
                int i16 = i15 % 2;
                for (String str : strArr2) {
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i14));
        }
        int i17 = ((int[]) objArr[0])[0];
        int i18 = ((int[]) objArr[2])[0];
        int i19 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[3];
        int[] iArr2 = {i18};
        int[] iArr3 = {i19};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i20 = ~iIdentityHashCode2;
        int i21 = (-1095648238) + (((~(1411073486 | i20)) | 25440272) * (-1188));
        int i22 = (~(iIdentityHashCode2 | (-1411073487))) | 25440272;
        int i23 = ~(293957972 | i20);
        int i24 = i17 + i21 + ((i22 | i23) * 594) + (((~((-1411073487) | i20)) | 1142555786 | i23) * 594);
        int i25 = (i24 << 13) ^ i24;
        int i26 = i25 ^ (i25 >>> 17);
        ((int[]) objArr[0])[0] = i26 ^ (i26 << 5);
        Object[] objArr19 = {new int[1], iArr3, iArr2, strArr3};
        return this.zzf.size();
    }

    public final zzff zzh(int i) {
        int i2 = 2 % 2;
        int i3 = d + 51;
        b = i3 % 128;
        int i4 = i3 % 2;
        zzff zzffVar = (zzff) this.zzf.get(i);
        int i5 = d + 87;
        b = i5 % 128;
        int i6 = i5 % 2;
        return zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    protected final Object zzl(int i, Object obj, Object obj2) {
        int i2;
        int i3 = 2 % 2;
        int i4 = b + 91;
        int i5 = i4 % 128;
        d = i5;
        if (i4 % 2 != 0 ? (i2 = i - 1) == 0 : (i2 = i + 93) == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zzd", "zze", zzfn.class, "zzf", zzff.class, "zzg", "zzh"});
        }
        int i6 = i5 + 19;
        b = i6 % 128;
        int i7 = i6 % 2;
        if (i2 == 3) {
            return new zzfd();
        }
        int i8 = i5 + 21;
        int i9 = i8 % 128;
        b = i9;
        int i10 = i8 % 2;
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzfc(bArr);
        }
        int i11 = i9 + 9;
        d = i11 % 128;
        if (i11 % 2 == 0) {
            if (i2 != 5) {
                throw null;
            }
        } else if (i2 != 5) {
            throw null;
        }
        return zzi;
    }

    final /* synthetic */ void zzi(int i, zzfn zzfnVar) {
        int i2 = 2 % 2;
        zzfnVar.getClass();
        zzmo zzmoVar = this.zze;
        if (!zzmoVar.zza()) {
            int i3 = d + 117;
            b = i3 % 128;
            if (i3 % 2 != 0) {
                this.zze = zzmf.zzcw(zzmoVar);
                int i4 = 17 / 0;
            } else {
                this.zze = zzmf.zzcw(zzmoVar);
            }
            int i5 = b + 85;
            d = i5 % 128;
            int i6 = i5 % 2;
        }
        this.zze.set(i, zzfnVar);
    }

    final /* synthetic */ void zzj(int i, zzff zzffVar) {
        int i2 = 2 % 2;
        int i3 = d + 123;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            zzffVar.getClass();
            this.zzf.zza();
            throw null;
        }
        zzffVar.getClass();
        zzmo zzmoVar = this.zzf;
        if (!zzmoVar.zza()) {
            int i4 = b + 63;
            d = i4 % 128;
            int i5 = i4 % 2;
            this.zzf = zzmf.zzcw(zzmoVar);
        }
        this.zzf.set(i, zzffVar);
        int i6 = d + 101;
        b = i6 % 128;
        int i7 = i6 % 2;
    }

    static /* synthetic */ zzfd zzk() {
        int i = 2 % 2;
        int i2 = d + 25;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            return zzi;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean zza() {
        int i = 2 % 2;
        int i2 = b + 93;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        if ((this.zzb & 1) == 0) {
            return false;
        }
        int i5 = i3 + 47;
        b = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i3 + 27;
        b = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    public final int zzb() {
        int i = 2 % 2;
        int i2 = d + 11;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        int i5 = this.zzd;
        int i6 = i3 + 87;
        d = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final List zzc() {
        int i = 2 % 2;
        int i2 = b + 9;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        zzmo zzmoVar = this.zze;
        int i5 = i3 + 27;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return zzmoVar;
        }
        throw null;
    }

    public final List zzf() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 23;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        zzmo zzmoVar = this.zzf;
        int i4 = i2 + 91;
        b = i4 % 128;
        int i5 = i4 % 2;
        return zzmoVar;
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new char[]{45565, 42530, 40536, 63134, 61107, 50917, 16152, 5890, 3955, 26559, 24466, 46143, 44069, 33919, 64648, 54473, 52465, 9487, 7504, 30083, 28095, 17895, 41052, 46981, 36856, 59193, 65290, 55116, 11965, 1755, 7900, 30216, 20085, 42429, 48528, 38340, 60732, 59865, 65026, 50789, 44706, 46813, 40655, 26418, 20333, 22356, 16333, 1984, 60474, 62464, 56407, 42166, 36078, 45848, 42181, 40116, 62575, 60485, 50184, 15845, 5560, 3513, 25920, 23842, 46825, 44786, 34446, 65141, 54820};
        TuitionPaymentFragmentbindingInflater1 = 628254909380863564L;
    }

    private static String $$g(byte b2, short s, byte b3) {
        int i = (b2 * 3) + 109;
        int i2 = b3 * 3;
        int i3 = s + 4;
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[1 - i2];
        int i4 = 0 - i2;
        int i5 = -1;
        if (bArr == null) {
            i = i4 + i;
        }
        while (true) {
            i5++;
            i3++;
            bArr2[i5] = (byte) i;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            i += bArr[i3];
        }
    }
}
