package com.google.android.libraries.places.internal;

import android.graphics.Color;
import android.graphics.ImageFormat;
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
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.work.WorkInfo;
import com.bpjstku.databinding.ActivityVideoListBinding;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbkc {
    private final zzbkb zza;
    private final ScheduledFuture zzb;
    private static final byte[] $$c = {117, -15, -81, 1};
    private static final int $$f = 207;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {74, 60, 122, -26, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$e = 12;
    private static final byte[] $$a = {68, 83, 49, -116, 15, -8, 16, -1, -4, -3, -52, 55, 14, 1, 8, -13, 11, 8, -68, 68, -1, -61, 36, 19, 4, 10, -8, 8, 0, -22, 22, 15, -11, 8, 0, 15, 0, 17, -34, 19, 4, 10, -8, 8, 0, -26, 39, -6, 11};
    private static final int $$b = 64;
    private static int b = 0;
    private static int asInterface = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {47412, 47421, 47400, 47344, 47410, 47408, 47415, 47404, 47417, 47416, 47419, 47402, 47377, 47414, 47407, 47418, 47413, 47403, 47376, 47372, 47401, 47370, 47397, 47406, 47374, 47409};
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 2047719646;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
    private static boolean TuitionPaymentFragmentbindingInflater1 = true;

    /* synthetic */ zzbkc(zzbkb zzbkbVar, ScheduledFuture scheduledFuture, byte[] bArr) {
        if (zzbkbVar == null) {
            throw new NullPointerException("runnable");
        }
        int i = asInterface + 111;
        int i2 = i % 128;
        b = i2;
        int i3 = i % 2;
        int i4 = 2 % 2;
        int i5 = i2 + 73;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        this.zza = zzbkbVar;
        if (scheduledFuture == null) {
            throw new NullPointerException("future");
        }
        this.zzb = scheduledFuture;
    }

    private static void a(byte b2, byte b3, int i, Object[] objArr) {
        int i2 = (i * 32) + 4;
        int i3 = 103 - (b2 * 6);
        byte[] bArr = $$a;
        int i4 = b3 * 19;
        byte[] bArr2 = new byte[33 - i4];
        int i5 = 32 - i4;
        int i6 = -1;
        if (bArr == null) {
            i2++;
            i3 = (i3 + i5) - 2;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                int i7 = bArr[i2];
                i2++;
                i3 = (i3 + i7) - 2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.google.android.libraries.places.internal.zzbkc.$$d
            int r7 = 103 - r7
            int r5 = r5 * 52
            int r5 = r5 + 4
            int r6 = r6 * 52
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r5
            r7 = r6
            r3 = r2
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r5]
        L27:
            int r5 = r5 + 1
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbkc.c(int, short, short, java.lang.Object[]):void");
    }

    public final boolean zzb() {
        int i = 2 % 2;
        zzbkb zzbkbVar = this.zza;
        if (!(!zzbkbVar.zzc) || zzbkbVar.zzb) {
            return false;
        }
        int i2 = asInterface;
        int i3 = i2 + 97;
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 39;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public final void zza() {
        ScheduledFuture scheduledFuture;
        int i = 2 % 2;
        int i2 = b + 17;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            this.zza.zzb = true;
            scheduledFuture = this.zzb;
        } else {
            this.zza.zzb = true;
            scheduledFuture = this.zzb;
        }
        scheduledFuture.cancel(false);
    }

    private static void d(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        char[] cArr3;
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        char c = 3;
        int i3 = 0;
        if (cArr4 != null) {
            int i4 = $11 + 47;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr4.length;
            char[] cArr5 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr4[i6]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char bitsPerPixel = (char) (31338 - ImageFormat.getBitsPerPixel(i3));
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 2995;
                        int i7 = 18 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        byte b2 = $$c[c];
                        byte b3 = (byte) (b2 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(bitsPerPixel, iIndexOf, i7, 1182129903, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr5[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i6++;
                    c = 3;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr4 = cArr5;
        }
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43325 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), View.MeasureSpec.getSize(0) + 253, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
        int i8 = 33602;
        if (!(!TuitionPaymentFragmentbindingInflater1)) {
            int i9 = $11 + 71;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                cArr3 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
            } else {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                cArr3 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            }
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr3[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr4[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + i8);
                    int keyRepeatTimeout = 3085 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int iGreen = 26 - Color.green(0);
                    byte b4 = (byte) ($$c[3] - 1);
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(offsetBefore, keyRepeatTimeout, iGreen, -2146875848, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                i8 = 33602;
            }
            objArr[0] = new String(cArr3);
            return;
        }
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i10 = $11 + 73;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            } else {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            }
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr2[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr4[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char maximumFlingVelocity = (char) (33602 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                    int iResolveSize = View.resolveSize(0, 0) + 3085;
                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 26;
                    byte b6 = (byte) ($$c[3] - 1);
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maximumFlingVelocity, iResolveSize, maximumDrawingCacheSize, -2146875848, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr2);
            return;
        }
        int i11 = 0;
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        while (true) {
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11;
            if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                objArr[0] = new String(cArr6);
                return;
            } else {
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr4[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                i11 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:80:0x070d A[PHI: r0 r1
  0x070d: PHI (r0v24 int) = (r0v23 int), (r0v43 int) binds: [B:79:0x070b, B:76:0x06fe] A[DONT_GENERATE, DONT_INLINE]
  0x070d: PHI (r1v24 int) = (r1v23 int), (r1v34 int) binds: [B:79:0x070b, B:76:0x06fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x071b A[PHI: r0 r1
  0x071b: PHI (r0v40 int) = (r0v23 int), (r0v43 int) binds: [B:79:0x070b, B:76:0x06fe] A[DONT_GENERATE, DONT_INLINE]
  0x071b: PHI (r1v33 int) = (r1v23 int), (r1v34 int) binds: [B:79:0x070b, B:76:0x06fe] A[DONT_GENERATE, DONT_INLINE]] */
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1(List list) throws Throwable {
        Method[] methodArr;
        Class<?> cls;
        String str;
        Class<?>[] clsArr;
        char c;
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        long j;
        char c2;
        Class cls2;
        int packedPositionGroup;
        int i6 = 2;
        int i7 = 2 % 2;
        int i8 = asInterface;
        int i9 = (i8 ^ 57) + ((i8 & 57) << 1);
        b = i9 % 128;
        int i10 = 0;
        if (i9 % 2 != 0) {
            methodArr = new Method[4];
            byte[] bArr = $$a;
            byte b2 = bArr[13];
            byte b3 = bArr[28];
            Object[] objArr = new Object[1];
            a(b2, b3, b3, objArr);
            cls = Class.forName((String) objArr[0]);
            byte b4 = bArr[28];
            byte b5 = bArr[13];
            Object[] objArr2 = new Object[1];
            a(b4, b5, b5, objArr2);
            str = (String) objArr2[0];
            clsArr = new Class[4];
            c = 1;
        } else {
            methodArr = new Method[2];
            byte[] bArr2 = $$a;
            byte b6 = bArr2[13];
            byte b7 = bArr2[28];
            Object[] objArr3 = new Object[1];
            a(b6, b7, b7, objArr3);
            cls = Class.forName((String) objArr3[0]);
            byte b8 = bArr2[28];
            byte b9 = bArr2[13];
            Object[] objArr4 = new Object[1];
            a(b8, b9, b9, objArr4);
            str = (String) objArr4[0];
            clsArr = new Class[2];
            c = 0;
        }
        clsArr[0] = String.class;
        clsArr[1] = Integer.TYPE;
        methodArr[c] = cls.getMethod(str, clsArr);
        int i11 = b;
        int i12 = ((i11 | 67) << 1) - (i11 ^ 67);
        asInterface = i12 % 128;
        int i13 = i12 % 2;
        Class<?> cls3 = Class.forName("android.app.ApplicationPackageManager");
        byte[] bArr3 = $$a;
        byte b10 = bArr3[28];
        byte b11 = bArr3[13];
        Object[] objArr5 = new Object[1];
        a(b10, b11, b11, objArr5);
        String str2 = (String) objArr5[0];
        int i14 = asInterface;
        int i15 = (i14 & 111) + (i14 | 111);
        b = i15 % 128;
        int i16 = i15 % 2;
        methodArr[1] = cls3.getMethod(str2, String.class, Integer.TYPE);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
            int i17 = 2824 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            int iResolveSizeAndState = 22 - View.resolveSizeAndState(0, 0, 0);
            byte[] bArr4 = $$d;
            Object[] objArr6 = new Object[1];
            c(bArr4[7], (byte) (-bArr4[5]), bArr4[54], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(tapTimeout, i17, iResolveSizeAndState, 1814927978, false, (String) objArr6[0], null);
        }
        String string = null;
        int i18 = 24;
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) == null) {
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) TextUtils.getOffsetBefore("", 0), Color.argb(0, 0, 0, 0) + 2823, (KeyEvent.getMaxKeyCode() >> 16) + 22)).getDeclaredMethods();
            int length = declaredMethods.length;
            int i19 = 0;
            while (i19 < length) {
                Method method = declaredMethods[i19];
                int i20 = b + 105;
                asInterface = i20 % 128;
                int i21 = i20 % i6;
                try {
                    int i22 = -Color.argb(i10, i10, i10, i10);
                    int iB = ActivityVideoListBinding.b();
                    int i23 = i22 * (-947);
                    int i24 = ((i23 | 120523) << 1) - (i23 ^ 120523);
                    int i25 = ~i22;
                    int i26 = -(-(((~(((-128) ^ iB) | ((-128) & iB))) | i25) * (-948)));
                    int i27 = (i24 ^ i26) + ((i24 & i26) << 1);
                    int i28 = (i25 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i25 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT);
                    int i29 = ~iB;
                    int i30 = (~((i28 & i29) | (i28 ^ i29))) * (-948);
                    int i31 = (i27 ^ i30) + ((i27 & i30) << 1);
                    int i32 = -(-(((i22 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i22 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT)) * 948));
                    int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
                    byte[] bArr5 = new byte[i18];
                    // fill-array-data instruction
                    bArr5[0] = -112;
                    bArr5[1] = -113;
                    bArr5[2] = -114;
                    bArr5[3] = -116;
                    bArr5[4] = -119;
                    bArr5[5] = -115;
                    bArr5[6] = -124;
                    bArr5[7] = -116;
                    bArr5[8] = -117;
                    bArr5[9] = -119;
                    bArr5[10] = -123;
                    bArr5[11] = -118;
                    bArr5[12] = -119;
                    bArr5[13] = -120;
                    bArr5[14] = -124;
                    bArr5[15] = -121;
                    bArr5[16] = -122;
                    bArr5[17] = -126;
                    bArr5[18] = -123;
                    bArr5[19] = -124;
                    bArr5[20] = -126;
                    bArr5[21] = -125;
                    bArr5[22] = -126;
                    bArr5[23] = -127;
                    Object[] objArr7 = new Object[1];
                    d(null, null, i33, bArr5, objArr7);
                    Class<?> cls4 = Class.forName((String) objArr7[i10]);
                    int offsetBefore = TextUtils.getOffsetBefore("", i10);
                    int iB2 = ActivityVideoListBinding.b();
                    int i34 = offsetBefore * 881;
                    int i35 = (i34 ^ 111887) + ((i34 & 111887) << 1);
                    int i36 = ~offsetBefore;
                    int i37 = ~((i36 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i36 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                    int i38 = ~((i36 ^ iB2) | (i36 & iB2));
                    int i39 = (i38 & i37) | (i37 ^ i38);
                    int i40 = ~((-128) | iB2);
                    int i41 = (i35 - (~(-(-(((i39 & i40) | (i39 ^ i40)) * (-880)))))) - 1;
                    int i42 = ~iB2;
                    int i43 = ~((i42 & i36) | (i36 ^ i42));
                    int i44 = (i43 & 127) | (i43 ^ 127);
                    int i45 = ~(offsetBefore | iB2);
                    int i46 = -(-(((i44 & i45) | (i44 ^ i45)) * (-880)));
                    int i47 = (i41 ^ i46) + ((i41 & i46) << 1);
                    int i48 = (~((offsetBefore & iB2) | (offsetBefore ^ iB2))) * 880;
                    Object[] objArr8 = new Object[1];
                    d(null, null, (i47 & i48) + (i48 | i47), new byte[]{-110, -120, -119, -111, -118, -111, -112, -113, -115, -116, -119, -121}, objArr8);
                    Object[] objArr9 = new Object[1];
                    objArr9[i10] = Integer.valueOf(((Integer) cls4.getMethod((String) objArr8[i10], null).invoke(method, null)).intValue());
                    int i49 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    int iB3 = ActivityVideoListBinding.b();
                    int i50 = ~iB3;
                    int i51 = ~((i50 & (-129)) | ((-129) ^ i50));
                    int i52 = ~i49;
                    int i53 = ~((i52 ^ iB3) | (i52 & iB3));
                    int i54 = (i49 * 371) + 47488 + (((i51 ^ i53) | (i51 & i53)) * (-370));
                    int i55 = ~((~iB3) | i52);
                    int i56 = ~(iB3 | (-129));
                    int i57 = -(-(((i56 & i55) | (i55 ^ i56) | (~((i49 ^ 128) | (i49 & 128)))) * (-370)));
                    int i58 = (i54 & i57) + (i57 | i54);
                    int i59 = -(-((~(i49 | 128)) * 370));
                    Object[] objArr10 = new Object[1];
                    d(null, null, (i58 & i59) + (i59 | i58), new byte[]{-120, -119, -111, -118, -111, -112, -113, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr10);
                    Class<?> cls5 = Class.forName((String) objArr10[i10]);
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', i10);
                    int iB4 = ActivityVideoListBinding.b();
                    int i60 = iIndexOf * (-183);
                    int i61 = ((i60 | 23680) << 1) - (i60 ^ 23680);
                    int i62 = ~iIndexOf;
                    int i63 = ~((i62 & 128) | (i62 ^ 128));
                    int i64 = ~iB4;
                    int i65 = ((~(i64 | 128)) | i63) * 184;
                    int i66 = (i61 & i65) + (i65 | i61);
                    int i67 = ~(((-129) & iIndexOf) | ((-129) ^ iIndexOf));
                    int i68 = -(-(((i67 & iB4) | (iB4 ^ i67)) * (-184)));
                    int i69 = (i66 ^ i68) + ((i68 & i66) << 1);
                    int i70 = ~iIndexOf;
                    int i71 = -(-((~((i70 & i64) | (i70 ^ i64))) * 184));
                    Object[] objArr11 = new Object[1];
                    d(null, null, ((i69 | i71) << 1) - (i71 ^ i69), new byte[]{-119, -125, -111, -116, -126, -109, -110, -111}, objArr11);
                    if (!(!((Boolean) cls5.getMethod((String) objArr11[0], Integer.TYPE).invoke(null, objArr9)).booleanValue())) {
                        int i72 = asInterface + 75;
                        b = i72 % 128;
                        if (i72 % 2 != 0) {
                            cls2 = Long.TYPE;
                            packedPositionGroup = 37 >> ExpandableListView.getPackedPositionGroup(0L);
                        } else {
                            cls2 = Long.TYPE;
                            int i73 = -(-ExpandableListView.getPackedPositionGroup(0L));
                            packedPositionGroup = ((i73 & 127) << 1) + (i73 ^ 127);
                        }
                        Object[] objArr12 = new Object[1];
                        d(null, null, packedPositionGroup, new byte[]{-112, -113, -114, -116, -119, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr12);
                        Class<?> cls6 = Class.forName((String) objArr12[0]);
                        int iAxisFromString = MotionEvent.axisFromString("");
                        int i74 = (iAxisFromString ^ 128) + ((iAxisFromString & 128) << 1);
                        c2 = '\r';
                        Object[] objArr13 = new Object[1];
                        d(null, null, i74, new byte[]{-119, -104, -105, -106, -122, -120, -107, -116, -119, -108, -116, -119, -121}, objArr13);
                        Method method2 = cls6.getMethod((String) objArr13[0], null);
                        int i75 = b + 43;
                        asInterface = i75 % 128;
                        int i76 = i75 % 2;
                        if (!(!cls2.equals(method2.invoke(method, null)))) {
                            int iMyPid = Process.myPid() >> 22;
                            Object[] objArr14 = new Object[1];
                            d(null, null, (iMyPid ^ 127) + ((iMyPid & 127) << 1), new byte[]{-112, -113, -114, -116, -119, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr14);
                            Class<?> cls7 = Class.forName((String) objArr14[0]);
                            int i77 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                            Object[] objArr15 = new Object[1];
                            d(null, null, (i77 ^ 127) + ((i77 & 127) << 1), new byte[]{-110, -119, -104, -105, -106, -120, -119, -116, -119, -102, -126, -120, -126, -103, -116, -119, -121}, objArr15);
                            Object[] objArr16 = (Object[]) cls7.getMethod((String) objArr15[0], null).invoke(method, null);
                            if (objArr16.length == 2) {
                                int i78 = b;
                                int i79 = (i78 & 23) + (i78 | 23);
                                asInterface = i79 % 128;
                                if (i79 % 2 != 0 ? Long.TYPE.equals(objArr16[0]) : Long.TYPE.equals(objArr16[0])) {
                                    int i80 = -(-TextUtils.getTrimmedLength(""));
                                    Object[] objArr17 = new Object[1];
                                    d(null, null, (i80 ^ 127) + ((i80 & 127) << 1), new byte[]{-112, -113, -114, -116, -119, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr17);
                                    if (!(!Class.forName((String) objArr17[0]).equals(objArr16[1]))) {
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char c3 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 2823;
                                            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 22;
                                            byte[] bArr6 = $$d;
                                            Object[] objArr18 = new Object[1];
                                            c(bArr6[7], (byte) (-bArr6[5]), bArr6[54], objArr18);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c3, iCombineMeasuredStates, maxKeyCode, 1814927978, false, (String) objArr18[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method);
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                            char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                                            int scrollBarSize = 2823 - (ViewConfiguration.getScrollBarSize() >> 8);
                                            int iNormalizeMetaState = 22 - KeyEvent.normalizeMetaState(0);
                                            byte[] bArr7 = $$d;
                                            Object[] objArr19 = new Object[1];
                                            c(bArr7[7], (byte) (-bArr7[5]), bArr7[54], objArr19);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cKeyCodeFromString, scrollBarSize, iNormalizeMetaState, 1814927978, false, (String) objArr19[0], null);
                                        }
                                        try {
                                            Object[] objArr20 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                char packedPositionGroup2 = (char) ExpandableListView.getPackedPositionGroup(0L);
                                                int iBlue = 2823 - Color.blue(0);
                                                int gidForName = Process.getGidForName("") + 23;
                                                byte[] bArr8 = $$d;
                                                byte b12 = (byte) (-bArr8[5]);
                                                byte b13 = bArr8[7];
                                                Object[] objArr21 = new Object[1];
                                                c(b12, b13, b13, objArr21);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionGroup2, iBlue, gidForName, -2137287382, false, (String) objArr21[0], new Class[]{Long.TYPE, Method.class});
                                            }
                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr20)).longValue();
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
                        j = 0;
                    } else {
                        j = 0;
                        c2 = '\r';
                    }
                    i19 = (i19 ^ 1) + ((i19 & 1) << 1);
                    i6 = 2;
                    i10 = 0;
                    i18 = 24;
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
            char c4 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2823;
            int maximumDrawingCacheSize = 22 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            byte[] bArr9 = $$d;
            Object[] objArr22 = new Object[1];
            c(bArr9[7], (byte) (-bArr9[5]), bArr9[54], objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c4, doubleTapTimeout, maximumDrawingCacheSize, 1814927978, false, (String) objArr22[0], null);
        }
        Object[] objArr23 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
            int absoluteGravity = 2823 - Gravity.getAbsoluteGravity(0, 0);
            int gidForName2 = 21 - Process.getGidForName("");
            byte[] bArr10 = $$d;
            byte b14 = (byte) (-bArr10[5]);
            byte b15 = bArr10[7];
            Object[] objArr24 = new Object[1];
            c(b14, b15, (byte) (b15 + 5), objArr24);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(bitsPerPixel, absoluteGravity, gidForName2, 1025296417, false, (String) objArr24[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr23);
        Object[] objArr25 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 37657);
            int defaultSize = View.getDefaultSize(0, 0) + 2720;
            int i81 = 20 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            byte[] bArr11 = $$d;
            byte b16 = (byte) (-bArr11[5]);
            byte b17 = bArr11[7];
            Object[] objArr26 = new Object[1];
            c(b16, b17, (byte) (b17 + 5), objArr26);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(pressedStateDuration, defaultSize, i81, -1568796068, false, (String) objArr26[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr25)).longValue();
        long j2 = -1035757980;
        long j3 = -1;
        long j4 = jLongValue ^ j3;
        long jUptimeMillis = (int) SystemClock.uptimeMillis();
        long j5 = jUptimeMillis ^ j3;
        long j6 = (((long) (-830)) * j2) + (((long) 832) * jLongValue) + (((long) (-831)) * (((j4 | j5) ^ j3) | (((j2 | jLongValue) | jUptimeMillis) ^ j3))) + (((long) (-1662)) * (((j4 | j2) | jUptimeMillis) ^ j3)) + (((long) 831) * (((jLongValue | jUptimeMillis) ^ j3) | ((j2 | jUptimeMillis) ^ j3) | (((j2 ^ j3) | j5) ^ j3))) + ((long) (-774647865));
        int iMyPid2 = Process.myPid();
        int i82 = ~iMyPid2;
        int i83 = ~((-2049080697) | i82);
        int i84 = ~(611854285 | iMyPid2);
        int i85 = ((int) (j6 >> 32)) & ((-334238508) + ((i83 | i84) * 1150) + (((~((-611854286) | i82)) | i84) * (-575)) + (((~(iMyPid2 | (-2049080697))) | (~(i82 | 2049080696))) * 575));
        int iMyUid = Process.myUid();
        int i86 = ((((~(1483761925 | iMyUid)) | (-1521908319)) * 398) - 850812467) + (((~((~iMyUid) | 1483761925)) | (-1521908319)) * 398);
        int i87 = b;
        int i88 = (i87 & 35) + (i87 | 35);
        int i89 = i88 % 128;
        asInterface = i89;
        int i90 = ((int) j6) & i86;
        if (i88 % 2 == 0) {
            int i91 = (i85 & i90) | (i85 ^ i90);
            i = i91 * 97;
            i2 = i91 & ViewCompat.MEASURED_SIZE_MASK;
            if (i != 0) {
                int i92 = ((i89 | 27) << 1) - (i89 ^ 27);
                b = i92 % 128;
                i3 = 2;
                int i93 = i92 % 2;
                z = true;
            } else {
                i3 = 2;
                z = false;
            }
        } else {
            int i94 = (i85 & i90) | (i85 ^ i90);
            i = i94 >>> 24;
            i2 = i94 & ViewCompat.MEASURED_SIZE_MASK;
            if (i != 0) {
                int i95 = ((i89 | 27) << 1) - (i89 ^ 27);
                b = i95 % 128;
                i3 = 2;
                int i96 = i95 % 2;
                z = true;
            } else {
                i3 = 2;
                z = false;
            }
        }
        if (z) {
            int i97 = i89 + 11;
            int i98 = i97 % 128;
            b = i98;
            int i99 = i97 % i3;
            int i100 = i98 + 55;
            asInterface = i100 % 128;
            int i101 = i100 % i3;
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (z && i2 < methodArr.length) {
            int i102 = b;
            int i103 = (i102 & 121) + (i102 | 121);
            asInterface = i103 % 128;
            int i104 = i103 % 2;
            Method method3 = methodArr[i2];
            if (method3 != null) {
                int i105 = ((i102 | 99) << 1) - (i102 ^ 99);
                asInterface = i105 % 128;
                int i106 = i105 % 2;
                string = method3.toString();
            }
        }
        list.add(string);
        int i107 = asInterface;
        int i108 = (i107 & 93) + (i107 | 93);
        b = i108 % 128;
        int i109 = i108 % 2;
        int iB5 = ActivityVideoListBinding.b();
        int i110 = -(-(i * 253));
        int i111 = (1518 ^ i110) + ((i110 & 1518) << 1);
        int i112 = ~i;
        int iB6 = ActivityVideoListBinding.b();
        int i113 = ~(((-403933094) ^ iB6) | ((-403933094) & iB6));
        int i114 = ~iB6;
        int i115 = ~((i114 & (-403933094)) | (i114 ^ (-403933094)));
        int i116 = 144221306 + (((i113 & 135267109) | (135267109 ^ i113)) * 305) + (((i115 & 157029229) | (157029229 ^ i115)) * 305);
        int iB7 = ActivityVideoListBinding.b();
        int i117 = ~iB7;
        int i118 = (-1001674771) + (((939657345 & iB7) | (iB7 ^ 939657345) | 33604978) * 614) + (((~((1180497278 & i117) | (1180497278 ^ i117))) | 939657345 | (~(i117 | (-2086549646)))) * (-1228));
        int i119 = ~((i117 & 2120154623) | (2120154623 ^ i117));
        int i120 = ~iB7;
        int i121 = (i120 & (-1180497279)) | (i120 ^ (-1180497279));
        int i122 = (i118 - (~(((~((i121 & (-2086549646)) | (i121 ^ (-2086549646)))) | i119) * 614))) - 1;
        int i123 = ~(((-7) & i112) | ((-7) ^ i112));
        int i124 = ~i;
        int i125 = ~iB5;
        if (i116 > i122) {
            i5 = i123 | (~((i124 & i125) | (i124 ^ i125)));
            int i126 = 57 / 0;
        } else {
            int i127 = ~((i124 & i125) | (i124 ^ i125));
            i5 = (i123 & i127) | (i123 ^ i127);
        }
        int i128 = (i & 6) | (6 ^ i);
        int i129 = (i111 - (~((-252) * (i5 | (~(i128 | iB5)))))) - 1;
        int i130 = i128 * (-252);
        int i131 = i112 | (~iB5);
        int i132 = ~((i131 & 6) | (i131 ^ 6));
        int i133 = (iB5 & i128) | (i128 ^ iB5);
        int i134 = asInterface;
        int i135 = (i134 & 107) + (i134 | 107);
        int i136 = i135 % 128;
        b = i136;
        int i137 = i135 % 2;
        int i138 = ~i133;
        int i139 = ((i129 ^ i130) + ((i130 & i129) << 1) + (252 * ((i138 & i132) | (i132 ^ i138)))) * i4;
        int i140 = i136 + 125;
        asInterface = i140 % 128;
        int i141 = i140 % 2;
        return i139;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r7, byte r8, int r9) {
        /*
            int r7 = r7 + 67
            byte[] r0 = com.google.android.libraries.places.internal.zzbkc.$$c
            int r9 = r9 * 2
            int r9 = 4 - r9
            int r8 = r8 * 4
            int r8 = 1 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r9
            r5 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L22:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L28:
            int r7 = -r7
            int r7 = r7 + r9
            int r9 = r3 + 1
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbkc.$$g(byte, byte, int):java.lang.String");
    }
}
