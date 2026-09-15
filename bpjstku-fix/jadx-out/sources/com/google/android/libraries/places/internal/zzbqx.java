package com.google.android.libraries.places.internal;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import defpackage.setAspectRatio;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import javax.net.ssl.KeyManager;
import javax.net.ssl.TrustManager;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbqx {
    volatile zzbvk zza;
    final /* synthetic */ zzbrx zzb;
    private static final byte[] $$c = {8, -36, 87, -65};
    private static final int $$f = 11;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {49, 84, -120, 101, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$e = 240;
    private static final byte[] $$a = {27, -8, 5, 78, -6, 24, -18, 26, -71, 67, -6, 18, -67, 72, 3, -4, -59, 40, 3, -4, -6, 47, 2, 9, -12, 22, -1, 8, -2, 14, -6, 24, -18, -48, 72, -11, 1, 21, 0, -6, 14, 8, -72, 40, 21, 1, 21, 0, -10, -16, 18, 16, -7, 14, 1};
    private static final int $$b = 195;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static char[] b = {45558, 4829, 63402, 22685, 15666, 40528, 25405, 50194, 43259, 3474, 61102, 45977, 5242, 63824, 23097, 16159, 33768, 25746, 51601, 43673, 3944, 53332, 46387, 5656, 57065, 32203, 39098, 14243, 21089, 61770, 3111, 43784, 51175, 25291, 33212, 56477, 17176, 57395, 1348, 43635, 53212, 27838, 37331, 14076, 23061, 65404, 7232, 16759, 59028, 3006, 43223, 52721, 28934, 38524, 15231, 22653, 64918, 8891, 18388, 58619, 2071, 44320, 8109, 48279, 22986, 63173, 37680, 12301, 52594, 27201, 45563, 4825, 63400, 22702, 15737, 40520, 25385, 50190, 43250, 3560, 61093, 45964, 5241, 45563, 4825, 63400, 22700, 15741, 40526, 25405, 50193, 43257, 3528, 61113, 45966, 5192, 63813, 23084, 16153, 33775};
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2193531488617501372L;

    /* synthetic */ zzbqx(zzbrx zzbrxVar, byte[] bArr) {
        Objects.requireNonNull(zzbrxVar);
        this.zzb = zzbrxVar;
    }

    private static void a(short s, short s2, byte b2, Object[] objArr) {
        int i = b2 + 4;
        int i2 = s * 2;
        int i3 = s2 + 105;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i2 + 4];
        int i4 = i2 + 3;
        int i5 = -1;
        if (bArr == null) {
            i3 = (i4 + i3) - 3;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i++;
                i3 = (i3 + bArr[i]) - 3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.android.libraries.places.internal.zzbqx.$$d
            int r8 = r8 * 52
            int r1 = r8 + 1
            int r7 = r7 * 52
            int r7 = 55 - r7
            int r6 = 103 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2b
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            int r7 = r7 + 1
            r3 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L2b:
            int r6 = r6 + r7
            int r6 = r6 + (-11)
            r7 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbqx.c(byte, short, short, java.lang.Object[]):void");
    }

    private static void d(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i4 = $10 + 103;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(b[i << i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 2187 - View.MeasureSpec.getMode(0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 39, 841711447, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = (byte) (b4 + 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33017 - (ViewConfiguration.getFadingEdgeLength() >> 16)), Color.blue(0) + 3011, 26 - (ViewConfiguration.getFadingEdgeLength() >> 16), 321985076, false, $$g(b4, b5, (byte) (b5 - 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                        try {
                            Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = (byte) (b6 + 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 36506), ExpandableListView.getPackedPositionChild(0L) + 3377, Color.blue(0) + 17, -968507904, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
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
            } else {
                int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr5 = {Integer.valueOf(b[i + i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((Process.getThreadPriority(0) + 20) >> 6), 2187 - TextUtils.getOffsetAfter("", 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 41, 841711447, false, $$g(b8, b9, b9), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        byte b10 = (byte) 0;
                        byte b11 = (byte) (b10 + 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((-16744199) - Color.rgb(0, 0, 0)), 3011 - Color.red(0), 26 - TextUtils.getCapsMode("", 0, 0), 321985076, false, $$g(b10, b11, (byte) (b11 - 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                    Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        byte b12 = (byte) 0;
                        byte b13 = (byte) (b12 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (36505 - TextUtils.indexOf("", "", 0, 0)), 3377 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 17 - TextUtils.getCapsMode("", 0, 0), -968507904, false, $$g(b12, b13, (byte) (b13 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i7 = $11 + 103;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                byte b14 = (byte) 0;
                byte b15 = (byte) (b14 + 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) (36506 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 3377 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), TextUtils.indexOf("", "") + 17, -968507904, false, $$g(b14, b15, (byte) (b15 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Code duplicated, block: B:112:0x05d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:47:0x062d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0684 A[Catch: all -> 0x099f, TryCatch #1 {all -> 0x099f, blocks: (B:49:0x066d, B:51:0x0684, B:52:0x06cf, B:67:0x075a, B:69:0x0767, B:70:0x07a6, B:72:0x07c5, B:74:0x0815), top: B:109:0x066d }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0946  */
    public static int TuitionPaymentFragmentbindingInflater1(List list) throws Throwable {
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        String string;
        Method method;
        int i5;
        Object[] objArr;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        int i6 = 2;
        int i7 = 2 % 2;
        int i8 = 1;
        byte[] bArr = $$a;
        Object[] objArr2 = new Object[1];
        a((byte) (-bArr[48]), bArr[36], bArr[26], objArr2);
        int i9 = 0;
        Class<?> cls = Class.forName((String) objArr2[0]);
        byte b2 = bArr[38];
        Object[] objArr3 = new Object[1];
        a(b2, b2, bArr[25], objArr3);
        String str = (String) objArr3[0];
        int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i11 = ((i10 | 1) << 1) - (i10 ^ 1);
        TuitionPaymentFragmentbindingInflater1 = i11 % 128;
        int i12 = i11 % 2;
        byte b3 = (byte) (-bArr[35]);
        byte b4 = bArr[36];
        Object[] objArr4 = new Object[1];
        a(b3, b4, (byte) (b4 | 24), objArr4);
        Method[] methodArr = {cls.getMethod(str, KeyManager[].class, TrustManager[].class, Class.forName((String) objArr4[0]))};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 2823;
            int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 23;
            byte[] bArr2 = $$d;
            byte b5 = bArr2[54];
            byte b6 = (byte) (-bArr2[5]);
            Object[] objArr5 = new Object[1];
            c(b5, b6, b6, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cAxisFromString, iResolveOpacity, bitsPerPixel, 1814927978, false, (String) objArr5[0], null);
        }
        long j = 0;
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null) == null) {
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2823, TextUtils.indexOf((CharSequence) "", '0', 0) + 23)).getDeclaredMethods();
            int length = declaredMethods.length;
            int i13 = 0;
            while (i13 < length) {
                int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i15 = (i14 & 51) + (i14 | 51);
                TuitionPaymentFragmentbindingInflater1 = i15 % 128;
                int i16 = i15 % i6;
                Method method2 = declaredMethods[i13];
                setAspectRatio.AnonymousClass6.b();
                setAspectRatio.AnonymousClass6.b();
                try {
                    int longPressTimeout = ViewConfiguration.getLongPressTimeout() >> 16;
                    int i17 = -(-((byte) KeyEvent.getModifierMetaStateMask()));
                    Object[] objArr6 = new Object[i8];
                    d(longPressTimeout, (i17 & 25) + (i17 | 25), (char) Drawable.resolveOpacity(i9, i9), objArr6);
                    Class<?> cls2 = Class.forName((String) objArr6[i9]);
                    int i18 = 23 - (~(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                    int i19 = -(SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1));
                    int i20 = (i19 ^ 13) + ((i19 & 13) << i8);
                    int i21 = -ExpandableListView.getPackedPositionType(j);
                    int iB = setAspectRatio.AnonymousClass6.b();
                    int i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i23 = ((i22 | 77) << 1) - (i22 ^ 77);
                    TuitionPaymentFragmentbindingInflater1 = i23 % 128;
                    int i24 = i23 % i6;
                    int i25 = ~i21;
                    int i26 = (i25 & (-28435)) | (i25 ^ (-28435));
                    int i27 = ~iB;
                    int i28 = ((i21 * 491) - 13904226) + ((-490) * ((i26 ^ i27) | (i26 & i27)));
                    int i29 = ((~((-28435) | iB)) | (~(((-28435) & i21) | ((-28435) ^ i21)))) * 490;
                    Object[] objArr7 = new Object[i8];
                    d(i18, i20, (char) ((i28 & i29) + (i29 | i28) + ((~i21) * 490)), objArr7);
                    int iIntValue = ((Integer) cls2.getMethod((String) objArr7[0], null).invoke(method2, null)).intValue();
                    Object[] objArr8 = new Object[i8];
                    Integer numValueOf = Integer.valueOf(iIntValue);
                    int i30 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
                    TuitionPaymentFragmentbindingInflater1 = i30 % 128;
                    int i31 = i30 % 2;
                    objArr8[0] = numValueOf;
                    int i32 = -(-(ViewConfiguration.getScrollBarSize() >> 8));
                    int i33 = ((i32 | 36) << i8) - (i32 ^ 36);
                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("");
                    int iB2 = setAspectRatio.AnonymousClass6.b();
                    int i34 = iKeyCodeFromString * (-716);
                    int i35 = ((i34 | 37310) << i8) - (i34 ^ 37310);
                    int i36 = ~iKeyCodeFromString;
                    int i37 = ((i36 ^ 26) | (i36 & 26)) * (-1434);
                    int i38 = (i35 & i37) + (i37 | i35);
                    int i39 = ~iB2;
                    int i40 = ~((i39 & 26) | (i39 ^ 26));
                    int i41 = ~((iKeyCodeFromString ^ 26) | (iKeyCodeFromString & 26));
                    int i42 = (i40 ^ i41) | (i40 & i41);
                    int i43 = i36 | (-27);
                    int i44 = ~(i43 | iB2);
                    int i45 = i38 + (((i42 ^ i44) | (i42 & i44)) * 717);
                    int i46 = ~iB2;
                    int i47 = ~((i43 & i46) | (i43 ^ i46));
                    int i48 = ~(iKeyCodeFromString | 26);
                    int i49 = (i48 & i47) | (i47 ^ i48);
                    int i50 = ~(iB2 | 26);
                    int i51 = (i45 - (~(((i49 & i50) | (i49 ^ i50)) * 717))) - i8;
                    int i52 = -(Process.myPid() >> 22);
                    int iB3 = setAspectRatio.AnonymousClass6.b();
                    int i53 = TuitionPaymentFragmentbindingInflater1 + 73;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i53 % 128;
                    int i54 = i53 % 2;
                    int i55 = ~(((-62191) ^ i52) | ((-62191) & i52));
                    int i56 = ~i52;
                    int i57 = (i56 ^ 62190) | (i56 & 62190);
                    int i58 = ~((i57 ^ iB3) | (i57 & iB3));
                    int i59 = ((i52 * (-500)) - 31095000) + (((i55 ^ i58) | (i58 & i55)) * TypedValues.PositionType.TYPE_TRANSITION_EASING);
                    int i60 = ~i52;
                    int i61 = i59 + ((~(i60 | (-62191))) * 1002);
                    int i62 = -(-((~(i60 | (~iB3) | 62190)) * TypedValues.PositionType.TYPE_TRANSITION_EASING));
                    Object[] objArr9 = new Object[i8];
                    d(i33, i51, (char) ((i61 ^ i62) + ((i62 & i61) << i8)), objArr9);
                    Class<?> cls3 = Class.forName((String) objArr9[0]);
                    int offsetAfter = TextUtils.getOffsetAfter("", 0);
                    int i63 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i64 = ((i63 | 113) << i8) - (i63 ^ 113);
                    TuitionPaymentFragmentbindingInflater1 = i64 % 128;
                    int i65 = i64 % 2;
                    int iB4 = setAspectRatio.AnonymousClass6.b();
                    int i66 = offsetAfter * 253;
                    int i67 = ((i66 | 15686) << i8) - (i66 ^ 15686);
                    int i68 = ~((~offsetAfter) | (-63));
                    int i69 = ~iB4;
                    int i70 = i68 | (~((i69 & (-63)) | ((-63) ^ i69)));
                    int i71 = offsetAfter | 62;
                    int i72 = ~((i71 & iB4) | (i71 ^ iB4));
                    int i73 = ((i70 & i72) | (i70 ^ i72)) * (-252);
                    int i74 = (i67 & i73) + (i73 | i67);
                    int i75 = (offsetAfter ^ 62) | (offsetAfter & 62);
                    int i76 = -(-(i75 * (-252)));
                    int i77 = ((i74 | i76) << i8) - (i76 ^ i74);
                    int i78 = (~iB4) | (-63);
                    int i79 = ((~((iB4 & i75) | (i75 ^ iB4))) | (~((offsetAfter & i78) | (i78 ^ offsetAfter)))) * 252;
                    int i80 = ((i77 | i79) << i8) - (i79 ^ i77);
                    int i81 = 7 - (~(-(ViewConfiguration.getDoubleTapTimeout() >> 16)));
                    int i82 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int iB5 = setAspectRatio.AnonymousClass6.b();
                    int i83 = (i82 * (-244)) - (-10979226);
                    int i84 = ~iB5;
                    int i85 = ~(((-44632) ^ i84) | (i84 & (-44632)));
                    int i86 = ~((-44632) | i82);
                    int i87 = ((i85 ^ i86) | (i86 & i85)) * (-245);
                    int i88 = (i83 ^ i87) + ((i87 & i83) << 1);
                    int i89 = ((-44632) ^ iB5) | (iB5 & (-44632));
                    int i90 = -(-((~i89) * (-245)));
                    int i91 = ~i89;
                    char c = (char) ((i88 ^ i90) + ((i90 & i88) << 1) + (((i82 & i91) | (i82 ^ i91)) * 245));
                    Object[] objArr10 = new Object[1];
                    d(i80, i81, c, objArr10);
                    if (((Boolean) cls3.getMethod((String) objArr10[0], Integer.TYPE).invoke(null, objArr8)).booleanValue()) {
                        Class cls4 = Long.TYPE;
                        int fadingEdgeLength = ViewConfiguration.getFadingEdgeLength() >> 16;
                        int i92 = -ExpandableListView.getPackedPositionChild(0L);
                        int iB6 = setAspectRatio.AnonymousClass6.b();
                        int i93 = i92 * (-665);
                        int i94 = (i93 ^ 7682) + ((i93 & 7682) << 1);
                        int i95 = ~i92;
                        int i96 = i95 * (-333);
                        int i97 = ((i94 | i96) << 1) - (i96 ^ i94);
                        int i98 = ~iB6;
                        int i99 = ((~(i95 | i98)) | (~((iB6 ^ 23) | (iB6 & 23)))) * 333;
                        int i100 = (i97 & i99) + (i99 | i97);
                        int i101 = -(-(((~(i95 | iB6)) | (~((i98 ^ 23) | (i98 & 23)))) * 333));
                        Object[] objArr11 = new Object[1];
                        d(fadingEdgeLength, (i100 & i101) + (i101 | i100), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr11);
                        Class<?> cls5 = Class.forName((String) objArr11[0]);
                        int i102 = -AndroidCharacter.getMirror('0');
                        int i103 = ((i102 | 118) << 1) - (i102 ^ 118);
                        int i104 = -(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                        Object[] objArr12 = new Object[1];
                        d(i103, ((i104 | 12) << 1) - (i104 ^ 12), (char) View.resolveSize(0, 0), objArr12);
                        if (cls4.equals(cls5.getMethod((String) objArr12[0], null).invoke(method2, null))) {
                            int i105 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                            int iB7 = setAspectRatio.AnonymousClass6.b();
                            int i106 = i105 * 371;
                            int i107 = (i106 ^ (-371)) + ((i106 & (-371)) << 1);
                            int i108 = ~iB7;
                            int i109 = ~i108;
                            int i110 = ~i105;
                            int i111 = (i109 | (~(i110 | iB7))) * (-370);
                            int i112 = (i107 ^ i111) + ((i107 & i111) << 1);
                            int i113 = ((~iB7) | (~(i108 | i110))) * (-370);
                            int i114 = (i112 & i113) + (i113 | i112);
                            int i115 = (~(i105 | i110)) * 370;
                            int i116 = (i114 ^ i115) + ((i115 & i114) << 1);
                            int scrollDefaultDelay = ViewConfiguration.getScrollDefaultDelay() >> 16;
                            int iB8 = setAspectRatio.AnonymousClass6.b();
                            int i117 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 - (-25);
                            TuitionPaymentFragmentbindingInflater1 = i117 % 128;
                            int i118 = i117 % 2;
                            int i119 = ~scrollDefaultDelay;
                            int i120 = (((-496) * scrollDefaultDelay) - 11904) + ((~((i119 ^ (-25)) | (i119 & (-25)))) * 497);
                            int i121 = i119 | (-25);
                            int i122 = ~((i121 & iB8) | (i121 ^ iB8));
                            int i123 = ~iB8;
                            int i124 = (-25) | i123;
                            int i125 = ~((i124 & scrollDefaultDelay) | (i124 ^ scrollDefaultDelay));
                            int i126 = ((i122 & i125) | (i122 ^ i125)) * 497;
                            int i127 = (i120 ^ i126) + ((i120 & i126) << 1);
                            int i128 = ~scrollDefaultDelay;
                            int i129 = ~((i128 & i123) | (i128 ^ i123));
                            int i130 = ~((i119 & 24) | (i119 ^ 24));
                            int i131 = (i129 & i130) | (i129 ^ i130);
                            int i132 = (scrollDefaultDelay & (-25)) | ((-25) ^ scrollDefaultDelay);
                            int i133 = ~((i132 & iB8) | (i132 ^ iB8));
                            int i134 = ((i133 & i131) | (i131 ^ i133)) * 497;
                            int i135 = (i127 ^ i134) + ((i134 & i127) << 1);
                            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0');
                            int iB9 = setAspectRatio.AnonymousClass6.b();
                            int i136 = TuitionPaymentFragmentbindingInflater1;
                            int i137 = ((i136 | 37) << 1) - (i136 ^ 37);
                            int i138 = i137 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i138;
                            int i139 = i137 % 2;
                            int i140 = (iIndexOf * (-167)) - 167;
                            int i141 = ~iIndexOf;
                            int i142 = ~((i141 & (-2)) | (i141 ^ (-2)));
                            int i143 = ~((-2) | iB9);
                            int i144 = -(-(((i142 & i143) | (i142 ^ i143)) * 336));
                            int i145 = (i140 ^ i144) + ((i140 & i144) << 1);
                            int i146 = -(-(((~((iIndexOf ^ 1) | (iIndexOf & 1))) | (~((iIndexOf ^ iB9) | (iIndexOf & iB9)))) * (-168)));
                            int i147 = (i145 & i146) + (i146 | i145);
                            int i148 = ~iB9;
                            int i149 = (i138 ^ 117) + ((i138 & 117) << 1);
                            TuitionPaymentFragmentbindingInflater1 = i149 % 128;
                            int i150 = i149 % 2;
                            int i151 = ~((i148 & iIndexOf) | (i148 ^ iIndexOf));
                            Object[] objArr13 = new Object[1];
                            d(i116, i135, (char) ((i147 - (~(-(-(((i151 & (-2)) | ((-2) ^ i151)) * 168))))) - 1), objArr13);
                            Class<?> cls6 = Class.forName((String) objArr13[0]);
                            int i152 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                            int i153 = ((i152 | 82) << 1) - (i152 ^ 82);
                            int offsetBefore = TextUtils.getOffsetBefore("", 0);
                            int iB10 = setAspectRatio.AnonymousClass6.b();
                            int i154 = offsetBefore * 141;
                            int i155 = (i154 ^ (-2363)) + ((i154 & (-2363)) << 1);
                            int i156 = ~offsetBefore;
                            int i157 = ~((i156 ^ 17) | (i156 & 17));
                            int i158 = ~((i156 ^ iB10) | (i156 & iB10));
                            int i159 = i155 + (((i157 & i158) | (i157 ^ i158)) * (-280));
                            int i160 = -(-(((~((i156 ^ iB10) | (i156 & iB10))) | (~(((-18) ^ iB10) | ((-18) & iB10)))) * 140));
                            int i161 = (i159 & i160) + (i159 | i160);
                            int i162 = (i156 ^ (-18)) | (i156 & (-18));
                            int i163 = ~((i162 & iB10) | (i162 ^ iB10));
                            int i164 = ~iB10;
                            int i165 = (i156 & i164) | (i156 ^ i164);
                            int i166 = (~((i165 & 17) | (i165 ^ 17))) | i163;
                            int i167 = ~((~iB10) | (-18) | offsetBefore);
                            int i168 = -(-(((i167 & i166) | (i166 ^ i167)) * 140));
                            Object[] objArr14 = new Object[1];
                            d(i153, ((i161 | i168) << 1) - (i168 ^ i161), (char) KeyEvent.normalizeMetaState(0), objArr14);
                            Object[] objArr15 = (Object[]) cls6.getMethod((String) objArr14[0], null).invoke(method2, null);
                            if (objArr15.length == 2) {
                                int i169 = TuitionPaymentFragmentbindingInflater1;
                                int i170 = ((i169 | 99) << 1) - (i169 ^ 99);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i170 % 128;
                                int i171 = i170 % 2;
                                Class cls7 = Long.TYPE;
                                if (i171 != 0) {
                                    i5 = 0;
                                    if (cls7.equals(objArr15[0])) {
                                        int jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() >> 16;
                                        int i172 = -(-View.MeasureSpec.getMode(i5));
                                        objArr = new Object[1];
                                        d(jumpTapTimeout, (i172 & 24) + (i172 | 24), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(i5) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i5) == 0.0d ? 0 : -1)), objArr);
                                        if (Class.forName((String) objArr[i5]).equals(objArr15[1])) {
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                char jumpTapTimeout2 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                                                int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2823;
                                                int iLastIndexOf = 21 - TextUtils.lastIndexOf("", '0', 0, 0);
                                                byte[] bArr3 = $$d;
                                                byte b7 = bArr3[54];
                                                byte b8 = (byte) (-bArr3[5]);
                                                Object[] objArr16 = new Object[1];
                                                c(b7, b8, b8, objArr16);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(jumpTapTimeout2, keyRepeatDelay, iLastIndexOf, 1814927978, false, (String) objArr16[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method2);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                int iCombineMeasuredStates = 2823 - View.combineMeasuredStates(0, 0);
                                                int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) + 22;
                                                byte[] bArr4 = $$d;
                                                byte b9 = bArr4[54];
                                                byte b10 = (byte) (-bArr4[5]);
                                                Object[] objArr17 = new Object[1];
                                                c(b9, b10, b10, objArr17);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollBarFadeDuration, iCombineMeasuredStates, longPressTimeout2, 1814927978, false, (String) objArr17[0], null);
                                            }
                                            Object[] objArr18 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char c2 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                                                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0) + 2824;
                                                int doubleTapTimeout = 22 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                byte b11 = $$d[7];
                                                byte b12 = b11;
                                                Object[] objArr19 = new Object[1];
                                                c(b11, b12, b12, objArr19);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, iIndexOf2, doubleTapTimeout, -2137287382, false, (String) objArr19[0], new Class[]{Long.TYPE, Method.class});
                                            }
                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr18)).longValue();
                                            int i173 = TuitionPaymentFragmentbindingInflater1 + 91;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i173 % 128;
                                            int i174 = i173 % 2;
                                            break;
                                        }
                                    }
                                } else if (!(!cls7.equals(objArr15[1]))) {
                                    i5 = 0;
                                    int jumpTapTimeout3 = ViewConfiguration.getJumpTapTimeout() >> 16;
                                    int i175 = -(-View.MeasureSpec.getMode(i5));
                                    objArr = new Object[1];
                                    d(jumpTapTimeout3, (i175 & 24) + (i175 | 24), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(i5) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i5) == 0.0d ? 0 : -1)), objArr);
                                    if (Class.forName((String) objArr[i5]).equals(objArr15[1])) {
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            char jumpTapTimeout4 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                                            int keyRepeatDelay2 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2823;
                                            int iLastIndexOf2 = 21 - TextUtils.lastIndexOf("", '0', 0, 0);
                                            byte[] bArr5 = $$d;
                                            byte b13 = bArr5[54];
                                            byte b14 = (byte) (-bArr5[5]);
                                            Object[] objArr110 = new Object[1];
                                            c(b13, b14, b14, objArr110);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(jumpTapTimeout4, keyRepeatDelay2, iLastIndexOf2, 1814927978, false, (String) objArr110[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method2);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char scrollBarFadeDuration2 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                            int iCombineMeasuredStates2 = 2823 - View.combineMeasuredStates(0, 0);
                                            int longPressTimeout3 = (ViewConfiguration.getLongPressTimeout() >> 16) + 22;
                                            byte[] bArr6 = $$d;
                                            byte b15 = bArr6[54];
                                            byte b16 = (byte) (-bArr6[5]);
                                            Object[] objArr111 = new Object[1];
                                            c(b15, b16, b16, objArr111);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollBarFadeDuration2, iCombineMeasuredStates2, longPressTimeout3, 1814927978, false, (String) objArr111[0], null);
                                        }
                                        try {
                                            Object[] objArr112 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char c3 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                                                int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0', 0) + 2824;
                                                int doubleTapTimeout2 = 22 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                byte b17 = $$d[7];
                                                byte b18 = b17;
                                                Object[] objArr113 = new Object[1];
                                                c(b17, b18, b18, objArr113);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c3, iIndexOf3, doubleTapTimeout2, -2137287382, false, (String) objArr113[0], new Class[]{Long.TYPE, Method.class});
                                            }
                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr112)).longValue();
                                            int i176 = TuitionPaymentFragmentbindingInflater1 + 91;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i176 % 128;
                                            int i177 = i176 % 2;
                                            break;
                                        } catch (Throwable th) {
                                            Throwable cause = th.getCause();
                                            if (cause != null) {
                                                throw cause;
                                            }
                                            throw th;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    int i178 = (i13 << 1) - i13;
                    i13 = ((i178 | 1) << 1) - (i178 ^ 1);
                    int i179 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
                    TuitionPaymentFragmentbindingInflater1 = i179 % 128;
                    if (i179 % 2 != 0) {
                        int i180 = 4 / 2;
                    }
                    i6 = 2;
                    i8 = 1;
                    i9 = 0;
                    j = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char jumpTapTimeout5 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 2823;
            int iIndexOf4 = TextUtils.indexOf("", "", 0) + 22;
            byte[] bArr7 = $$d;
            byte b19 = bArr7[54];
            byte b20 = (byte) (-bArr7[5]);
            Object[] objArr20 = new Object[1];
            c(b19, b20, b20, objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(jumpTapTimeout5, absoluteGravity, iIndexOf4, 1814927978, false, (String) objArr20[0], null);
        }
        Object[] objArr21 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2823;
            int windowTouchSlop = 22 - (ViewConfiguration.getWindowTouchSlop() >> 8);
            byte[] bArr8 = $$d;
            byte b21 = (byte) (bArr8[51] - 1);
            byte b22 = bArr8[7];
            Object[] objArr22 = new Object[1];
            c(b21, b22, b22, objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(edgeSlop, maximumFlingVelocity, windowTouchSlop, 1025296417, false, (String) objArr22[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr21);
        Object[] objArr23 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char jumpTapTimeout6 = (char) (37657 - (ViewConfiguration.getJumpTapTimeout() >> 16));
            int i181 = 2721 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            int defaultSize = View.getDefaultSize(0, 0) + 19;
            byte[] bArr9 = $$d;
            byte b23 = (byte) (bArr9[51] - 1);
            byte b24 = bArr9[7];
            Object[] objArr24 = new Object[1];
            c(b23, b24, b24, objArr24);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(jumpTapTimeout6, i181, defaultSize, -1568796068, false, (String) objArr24[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr23)).longValue();
        long j2 = -670094860;
        long j3 = -495;
        long j4 = -1;
        long j5 = j2 ^ j4;
        long jNextInt = new Random().nextInt();
        long j6 = ((j5 | (jLongValue ^ j4)) ^ j4) | ((j5 | jNextInt) ^ j4);
        long j7 = (j3 * j2) + (j3 * jLongValue) + (((long) 992) * j6) + (((long) (-496)) * (j6 | (j4 ^ (((jNextInt ^ j4) | j2) | jLongValue)))) + (((long) 496) * (jLongValue | jNextInt)) + ((long) (-1140310985));
        int i182 = TuitionPaymentFragmentbindingInflater1 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i182 % 128;
        if (i182 % 2 == 0) {
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i183 = ~iFreeMemory;
            i = ((int) (j7 >> 98)) & ((-1058880186) + (((~((-98992996) | i183)) | (-1338233416)) * (-865)) + ((~(iFreeMemory | 98992995)) * 865) + (((~((-1338233416) | i183)) | (~(i183 | 98992995))) * 865));
            i2 = (int) j7;
            int iNextInt = new Random().nextInt(749095122);
            int i184 = ~iNextInt;
            i3 = (-501357939) + (((~(1938810343 | i184)) | 207622168) * 168) + ((~((-207622169) | iNextInt)) * 168) + (((~(iNextInt | 2146432511)) | (~(i184 | (-501583934))) | 293961765) * 168);
        } else {
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i185 = ~elapsedCpuTime;
            int i186 = (~(80272207 | i185)) | 1513300144;
            int i187 = ~(elapsedCpuTime | (-76073734));
            i = ((int) (j7 >> 32)) & (904687306 + ((i186 | i187) * (-502)) + ((i187 | (~(i185 | 1593572351))) * TypedValues.PositionType.TYPE_DRAWPATH));
            i2 = (int) j7;
            int iNextInt2 = new Random().nextInt(661059943);
            i3 = 1320243365 + (((~(80159671 | iNextInt2)) | (-1424438264)) * 1504) + ((~(iNextInt2 | (-1344278593))) * (-1504)) + 703965872;
        }
        int i188 = i2 & i3;
        int i189 = (i & i188) | (i ^ i188);
        int i190 = i189 >>> 24;
        int i191 = i189 & ViewCompat.MEASURED_SIZE_MASK;
        if (i190 != 0) {
            int i192 = TuitionPaymentFragmentbindingInflater1 + 3;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i192 % 128;
            if (i192 % 2 == 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (z) {
            int i193 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i194 = (i193 & 5) + (i193 | 5);
            TuitionPaymentFragmentbindingInflater1 = i194 % 128;
            int i195 = i194 % 2;
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (!z || i191 >= 1 || (method = methodArr[i191]) == null) {
            string = null;
        } else {
            int i196 = TuitionPaymentFragmentbindingInflater1;
            int i197 = ((i196 | 21) << 1) - (i196 ^ 21);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i197 % 128;
            if (i197 % 2 == 0) {
                method.toString();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            string = method.toString();
        }
        list.add(string);
        int i198 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i199 = (i198 & 15) + (i198 | 15);
        TuitionPaymentFragmentbindingInflater1 = i199 % 128;
        int i200 = i199 % 2;
        int i201 = (i190 + 6) * i4;
        int i202 = i198 + 53;
        TuitionPaymentFragmentbindingInflater1 = i202 % 128;
        int i203 = i202 % 2;
        return i201;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r5, short r6, byte r7) {
        /*
            byte[] r0 = com.google.android.libraries.places.internal.zzbqx.$$c
            int r6 = r6 * 3
            int r6 = r6 + 109
            int r7 = r7 * 3
            int r7 = 3 - r7
            int r5 = r5 * 4
            int r1 = 1 - r5
            byte[] r1 = new byte[r1]
            r2 = 0
            int r5 = 0 - r5
            if (r0 != 0) goto L19
            r4 = r6
            r3 = r2
            r6 = r5
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r7 = r7 + 1
            if (r3 != r5) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L27:
            int r3 = r3 + 1
            r4 = r0[r7]
        L2b:
            int r6 = r6 + r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbqx.$$g(int, short, byte):java.lang.String");
    }
}
