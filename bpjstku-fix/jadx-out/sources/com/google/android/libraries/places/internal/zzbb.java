package com.google.android.libraries.places.internal;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public final class zzbb extends zzbae implements zzbbm {
    private static short[] TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int asBinder;
    private static byte[] b;
    private static final zzbb zzk;
    private static volatile zzbbt zzl;
    private int zzb;
    private float zze;
    private float zzf;
    private float zzg;
    private int zzh;
    private long zzi;
    private float zzj;
    private static final byte[] $$c = {36, -74, -79, -21};
    private static final int $$f = 12;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {6, 51, 46, 31, 12, -2, -63, 52, 14, -6, 9, 1, -9, 10, -71, 66, 2, -13, 14, -14, 9, 6, -19, 19, -11, 6, -1, -64, 51, 18, -10, 2, -61, 51, 2, 17, -11, 13, -17, -55, 19, 50, -10, 2, -42, 34, 17, -11, 13, -17, -21, 17, 17, 2, -11, -6, 6, 7, -15, 13, 6, -39, 24, 8, -11, 3, 13, 1, -11, 1, 7, -44, 29, 19, -19, -27, 44, -17, 6, 6, -8, 9, 6, -80, 79, -3, -11, -2, 6, -8, 11, -72, 0, 69, 5, -2, -3, 5, -9, -1, -64, 69, 5, -4, -5, -2, 17, -80, 64, 1, 1, -5, 20, -9, 8, -80, 14};
    private static final int $$e = 162;
    private static final byte[] $$a = {70, -114, 113, 8, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 37;
    private static int g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f788a = 1;
    private static int d = 1;

    static {
        asBinder = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        zzbb zzbbVar = new zzbb();
        zzk = zzbbVar;
        zzbae.zzbn(zzbb.class, zzbbVar);
        int i = d + 117;
        asBinder = i % 128;
        if (i % 2 != 0) {
            int i2 = 46 / 0;
        }
    }

    private zzbb() {
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r6 = r6 * 52
            int r6 = r6 + 1
            byte[] r0 = com.google.android.libraries.places.internal.zzbb.$$a
            int r8 = 103 - r8
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r6
            r4 = r2
            goto L2a
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            int r7 = r7 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-11)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbb.c(byte, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 113
            int r6 = 117 - r6
            int r8 = r8 + 98
            int r7 = r7 * 113
            int r7 = 114 - r7
            byte[] r0 = com.google.android.libraries.places.internal.zzbb.$$d
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r8
            r3 = r2
            r8 = r6
            goto L2a
        L15:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L19:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            r4 = r0[r8]
        L2a:
            int r6 = r6 + r4
            int r8 = r8 + 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbb.f(int, byte, int, java.lang.Object[]):void");
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) throws Throwable {
        Object[] objArr;
        char c;
        Object[] objArr2;
        zzbbt zzazzVar;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cResolveSize = (char) View.resolveSize(0, 0);
            int iAxisFromString = MotionEvent.axisFromString("") + 877;
            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 10;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            byte b3 = (byte) (-bArr[5]);
            Object[] objArr3 = new Object[1];
            c(b2, b3, (byte) (b3 & 5), objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveSize, iAxisFromString, tapTimeout, 252381699, false, (String) objArr3[0], null);
        }
        byte[] bArr2 = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e((Process.myPid() >> 22) + 905462643, (-6) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (short) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 101), (byte) (ViewConfiguration.getPressedStateDuration() >> 16), View.resolveSizeAndState(0, 0, 0) - 1322694682, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e((ViewConfiguration.getEdgeSlop() >> 16) + 905462647, (-14) - View.getDefaultSize(0, 0), (short) ((-96) - ExpandableListView.getPackedPositionGroup(0L)), (byte) Color.blue(0), (-1322694660) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
            int iGreen = 876 - Color.green(0);
            int i2 = 10 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            byte[] bArr3 = $$a;
            byte b4 = bArr3[5];
            Object[] objArr6 = new Object[1];
            c(b4, (byte) (-b4), bArr3[10], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cNormalizeMetaState, iGreen, i2, 2009631821, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int iRed = 876 - Color.red(0);
                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 10;
                byte b5 = $$a[7];
                byte b6 = b5;
                Object[] objArr7 = new Object[1];
                c(b6, (byte) (b6 | 51), b5, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(doubleTapTimeout, iRed, absoluteGravity, 256017550, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
            int i3 = ~((int) Runtime.getRuntime().totalMemory());
            int i4 = (-355416892) + ((1055469375 | i3) * 184) + (((~(i3 | 1051206930)) | 48835119) * 184) + 216562926;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[1])[0] = i6 ^ (i6 << 5);
            c = 2;
        } else {
            Object[] objArr9 = new Object[1];
            e((ViewConfiguration.getJumpTapTimeout() >> 16) + 905462643, View.MeasureSpec.getMode(0) - 3, (short) ((-25) - Drawable.resolveOpacity(0, 0)), (byte) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (-1322694647) - View.MeasureSpec.getMode(0), objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            e(905462645 - TextUtils.getCapsMode("", 0, 0), TextUtils.getCapsMode("", 0, 0) - 11, (short) ((-34) - (ViewConfiguration.getTouchSlop() >> 8)), (byte) (Process.myTid() >> 22), TextUtils.lastIndexOf("", '0', 0, 0) - 1322694621, objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            try {
                Object[] objArr11 = {applicationContext, Integer.valueOf(i), 216562926};
                byte[] bArr4 = $$d;
                byte b7 = bArr4[11];
                Object[] objArr12 = new Object[1];
                f(b7, bArr4[92], b7, objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                byte b8 = bArr4[92];
                Object[] objArr13 = new Object[1];
                f(b8, bArr4[11], b8, objArr13);
                Object[] objArr14 = (Object[]) cls3.getMethod((String) objArr13[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                        int i7 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 876;
                        int iGreen2 = Color.green(0) + 10;
                        byte b9 = $$a[7];
                        byte b10 = b9;
                        Object[] objArr15 = new Object[1];
                        c(b10, (byte) (b10 | 51), b9, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionGroup, i7, iGreen2, 256017550, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr14);
                    try {
                        Object[] objArr16 = new Object[1];
                        e(Color.blue(0) + 905462643, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 8, (short) (View.MeasureSpec.makeMeasureSpec(0, 0) - 100), (byte) (ViewConfiguration.getPressedStateDuration() >> 16), (-1322694681) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr16);
                        Class<?> cls4 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        e(905462647 - Color.blue(0), ImageFormat.getBitsPerPixel(0) - 13, (short) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 97), (byte) View.getDefaultSize(0, 0), (-1322694661) - TextUtils.indexOf("", "", 0), objArr17);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cArgb = (char) Color.argb(0, 0, 0, 0);
                            int i8 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 875;
                            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 10;
                            byte[] bArr5 = $$a;
                            byte b11 = bArr5[5];
                            Object[] objArr18 = new Object[1];
                            c(b11, (byte) (-b11), bArr5[10], objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cArgb, i8, pressedStateDuration, 2009631821, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                            int iIndexOf = TextUtils.indexOf("", "") + 876;
                            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 10;
                            byte[] bArr6 = $$a;
                            byte b12 = bArr6[7];
                            byte b13 = (byte) (-bArr6[5]);
                            Object[] objArr19 = new Object[1];
                            c(b12, b13, (byte) (b13 & 5), objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(offsetBefore, iIndexOf, maxKeyCode, 252381699, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr14;
                c = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i9 = ((int[]) objArr[c])[0];
        int i10 = ((int[]) objArr[0])[0];
        if (i10 == i9) {
            int i11 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iMyTid = Process.myTid();
            int i12 = i11 + 1303632328 + ((~((-44634676) | iMyTid)) * (-301)) + (((~(49091315 | iMyTid)) | (~((~iMyTid) | 89401544))) * (-301)) + (((~(iMyTid | (-89401545))) | 49091315) * 301);
            int i13 = (i12 << 13) ^ i12;
            int i14 = i13 ^ (i13 >>> 17);
            ((int[]) objArr2[1])[0] = i14 ^ (i14 << 5);
        } else {
            int[] iArr = new int[i10];
            int i15 = i10 - 1;
            iArr[i15] = 1;
            Toast.makeText((Context) null, iArr[((i10 * i15) % 2) - 1], 1).show();
            int i16 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iMyPid = Process.myPid();
            int i17 = i16 + ((((-208210156) + (((~((-75705927) | iMyPid)) | 75703814) * 1504)) + ((~(iMyPid | (-2113))) * (-1504))) - 1940866176);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr2[1])[0] = i19 ^ (i19 << 5);
        }
        int i20 = i - 1;
        if (i20 == 0) {
            return (byte) 1;
        }
        if (i20 == 2) {
            int i21 = ((int[]) objArr2[1])[0];
            int i22 = i21 * i21;
            int i23 = -(1646624589 * i21);
            int i24 = (((i22 & i23) + (i22 | i23)) - (~(-(i21 * 1607309959)))) - 1;
            int i25 = (i24 & (-322648604)) + ((-322648604) | i24);
            int i26 = i25 >> 18;
            int i27 = ((i26 & (-32767)) + (i26 | (-32767))) / 16384;
            int i28 = (i25 - (~(((i27 | 1) << 1) - (i27 ^ 1)))) - 1;
            int i29 = i25 >> 23;
            int i30 = ((i29 & (-1023)) + (i29 | (-1023))) / 512;
            int i31 = -(i28 ^ ((i30 & 1) + (i30 | 1)));
            int i32 = ((i31 | 7) << 1) - (i31 ^ 7);
            int i33 = ((i32 >> 15) - 262143) / 131072;
            return zzbo(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004င\u0003\u0005ဂ\u0004\u0006ခ\u0005", new Object[]{"24\\29\\zzb".substring(34272 / (((-(((i33 & 1) + (i33 | 1)) + 1)) & i32) * 816)), "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i20 == 3) {
            return new zzbb();
        }
        if (i20 == 4) {
            return new zzba(bArr2);
        }
        if (i20 == 5) {
            return zzk;
        }
        if (i20 == 6) {
            zzbbt zzbbtVar = zzl;
            if (zzbbtVar != null) {
                return zzbbtVar;
            }
            synchronized (zzbb.class) {
                zzazzVar = zzl;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzk);
                    zzl = zzazzVar;
                }
            }
            return zzazzVar;
        }
        throw null;
    }

    private static void e(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            int i5 = -1;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b3 = (byte) (-1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Color.red(0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2266, 34 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1387473586, false, $$g(b3, (byte) (b3 + 1), (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            int i6 = iIntValue == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = b;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i7 = 0;
                    while (i7 < length) {
                        int i8 = $10 + 57;
                        $11 = i8 % 128;
                        int i9 = i8 % 2;
                        Object[] objArr3 = {Integer.valueOf(bArr[i7])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) i5;
                            byte b5 = (byte) (b4 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 3358 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 18 - (Process.myTid() >> 22), -1054011043, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                        }
                        bArr2[i7] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        i7++;
                        i5 = -1;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = b;
                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) (-1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) TextUtils.getOffsetBefore("", 0), 2267 - ExpandableListView.getPackedPositionGroup(0L), 33 - View.resolveSize(0, 0), 1387473586, false, $$g(b6, (byte) (b6 + 1), (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)));
                } else {
                    iIntValue = (short) (((short) (((long) TuitionPaymentFragmentbindingInflater1[i3 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L)) + i6;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) (-1);
                    byte b8 = (byte) (b7 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (55904 - ExpandableListView.getPackedPositionType(0L)), 2856 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), Drawable.resolveOpacity(0, 0) + 13, -1529949196, false, $$g(b7, b8, (byte) (b8 + 3)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = b;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i10 = 0; i10 < length2; i10++) {
                        bArr5[i10] = (byte) (((long) bArr4[i10]) ^ 3046761265686732006L);
                    }
                    int i11 = $11 + 67;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    int i13 = $10 + 17;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    if (z) {
                        byte[] bArr6 = b;
                        int i15 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i15 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i15]) ^ 3046761265686732006L)) + s)) ^ b2));
                    } else {
                        short[] sArr = TuitionPaymentFragmentbindingInflater1;
                        int i16 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i16 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i16]) ^ 3046761265686732006L)) + s)) ^ b2));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static /* synthetic */ zzbb zza() {
        int i = 2 % 2;
        int i2 = f788a;
        int i3 = i2 + 41;
        g = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        zzbb zzbbVar = zzk;
        int i4 = i2 + 13;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            return zzbbVar;
        }
        obj.hashCode();
        throw null;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1032067844;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1934795525;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1185603592;
        b = new byte[]{-118, -66, -127, 107, -36, -118, -77, -125, -72, 108, 111, -7, -114, 67, -56, -71, -72, -121, -108, -68, -105, -66, -126, -77, -114, -115, -70, -107, -88, -71, -76, -123, -119, -77, -127, -6, -13, -22, -59, -53, 18, -8, -62, -22, -64, -24, -52, -35, -54, 49, -1, -50, -86, 5, -14, -11, -16, -63, -23, -64, -57, -50, -15, -45, -58, -6, -7, -8, -60, -73, 9, -50, -51, -13, -60, -7, -46, -26, -26, -26, -26};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, int r7, short r8) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 1
            int r8 = 121 - r8
            int r6 = r6 + 4
            byte[] r0 = com.google.android.libraries.places.internal.zzbb.$$c
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r5 = r2
            r8 = r7
            goto L25
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            int r6 = r6 + 1
            if (r5 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r3 = r0[r6]
        L25:
            int r8 = r8 + r3
            r3 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbb.$$g(short, int, short):java.lang.String");
    }
}
