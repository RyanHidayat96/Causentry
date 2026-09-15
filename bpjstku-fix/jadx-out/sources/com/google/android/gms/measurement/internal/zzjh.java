package com.google.android.gms.measurement.internal;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import defpackage.attachPreviewSurface;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class zzjh {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {12, -88, 33, 118, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$e = 127;
    private static final byte[] $$a = {48, -110, 22, 55, 15, -8, 16, -1, -4, -3, -52, 55, 14, 1, 8, -13, 11, 8, -68, 68, -1, -61, 36, 19, 4, 10, -8, 8, 0, -22, 22, 15, -11, 8, 0, 15, 0, 17, -34, 19, 4, 10, -8, 8, 0, -26, 39, -6, 11};
    private static final int $$b = 153;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int b = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 5089569331927955674L;

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 32
            int r7 = r7 + 4
            int r6 = r6 * 6
            int r6 = 103 - r6
            byte[] r0 = com.google.android.gms.measurement.internal.zzjh.$$a
            int r8 = r8 * 19
            int r1 = 33 - r8
            byte[] r1 = new byte[r1]
            int r8 = 32 - r8
            r2 = 0
            if (r0 != 0) goto L19
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2e
        L19:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L1d:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            r4 = r0[r6]
            int r3 = r3 + 1
        L2e:
            int r7 = r7 + r4
            int r7 = r7 + (-2)
            int r6 = r6 + 1
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjh.a(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 52
            int r6 = 56 - r6
            int r8 = 103 - r8
            byte[] r0 = com.google.android.gms.measurement.internal.zzjh.$$d
            int r7 = r7 * 52
            int r1 = 53 - r7
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2c
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2c:
            int r6 = r6 + 1
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-11)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjh.c(byte, int, short, java.lang.Object[]):void");
    }

    public static Object zzb(Bundle bundle, String str, Class cls, Object obj) {
        int i = 2 % 2;
        Object obj2 = bundle.get(str);
        Object obj3 = null;
        if (obj2 == null) {
            int i2 = TuitionPaymentFragmentbindingInflater1 + 5;
            b = i2 % 128;
            if (i2 % 2 != 0) {
                return obj;
            }
            obj3.hashCode();
            throw null;
        }
        if (!cls.isAssignableFrom(obj2.getClass())) {
            throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", str, cls.getCanonicalName(), obj2.getClass().getCanonicalName()));
        }
        int i3 = b + 3;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 == 0) {
            return obj2;
        }
        obj3.hashCode();
        throw null;
    }

    public static void zza(Bundle bundle, Object obj) {
        int i = 2 % 2;
        if (!(!(obj instanceof Double))) {
            int i2 = b + 3;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            if (i2 % 2 == 0) {
                bundle.putDouble("value", ((Double) obj).doubleValue());
                return;
            } else {
                bundle.putDouble("value", ((Double) obj).doubleValue());
                throw null;
            }
        }
        if (!(obj instanceof Long)) {
            bundle.putString("value", obj.toString());
            return;
        }
        int i3 = TuitionPaymentFragmentbindingInflater1 + 31;
        b = i3 % 128;
        int i4 = i3 % 2;
        bundle.putLong("value", ((Long) obj).longValue());
        int i5 = b + 93;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 24 / 0;
        }
    }

    private static void d(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        int i3 = $11 + 33;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i5 = $11 + 109;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 19472), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2624, 13 - View.resolveSize(0, 0), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.getTrimmedLength("") + 39422), ImageFormat.getBitsPerPixel(0) + 482, 37 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (39422 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), View.MeasureSpec.makeMeasureSpec(0, 0) + 481, View.MeasureSpec.makeMeasureSpec(0, 0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Code duplicated, block: B:111:0x086d  */
    /* JADX WARN: Code duplicated, block: B:138:0x0523 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x064e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x064e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x064e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x064e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x064e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x034a  */
    /* JADX WARN: Code duplicated, block: B:41:0x035c A[Catch: all -> 0x0660, TRY_ENTER, TryCatch #0 {all -> 0x0660, blocks: (B:14:0x012c, B:17:0x0181, B:19:0x01c0, B:22:0x02a5, B:26:0x02c9, B:31:0x0316, B:41:0x035c, B:45:0x03e1, B:47:0x0407, B:55:0x049a, B:60:0x04c1, B:42:0x0375, B:36:0x0331, B:27:0x02e3, B:18:0x01a1), top: B:133:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0375 A[Catch: all -> 0x0660, TRY_LEAVE, TryCatch #0 {all -> 0x0660, blocks: (B:14:0x012c, B:17:0x0181, B:19:0x01c0, B:22:0x02a5, B:26:0x02c9, B:31:0x0316, B:41:0x035c, B:45:0x03e1, B:47:0x0407, B:55:0x049a, B:60:0x04c1, B:42:0x0375, B:36:0x0331, B:27:0x02e3, B:18:0x01a1), top: B:133:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0421  */
    /* JADX WARN: Code duplicated, block: B:51:0x0446  */
    /* JADX WARN: Code duplicated, block: B:54:0x0491  */
    /* JADX WARN: Code duplicated, block: B:58:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:59:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:63:0x04da A[PHI: r0 r4
  0x04da: PHI (r0v98 java.lang.Object[]) = (r0v97 java.lang.Object[]), (r0v141 java.lang.Object[]) binds: [B:62:0x04d8, B:58:0x04b3] A[DONT_GENERATE, DONT_INLINE]
  0x04da: PHI (r4v108 int) = (r4v107 int), (r4v137 int) binds: [B:62:0x04d8, B:58:0x04b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:67:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:68:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:70:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:75:0x053a  */
    /* JADX WARN: Code duplicated, block: B:78:0x058a  */
    /* JADX WARN: Code duplicated, block: B:82:0x05ec A[Catch: all -> 0x0913, TryCatch #1 {all -> 0x0913, blocks: (B:80:0x05d6, B:82:0x05ec, B:83:0x0633, B:95:0x06b8, B:97:0x06c5, B:98:0x0710, B:100:0x072e, B:101:0x077d), top: B:135:0x05d6 }] */
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3(List list) throws Throwable {
        int i;
        int i2;
        int i3;
        Method method;
        String string;
        Method[] declaredMethods;
        int length;
        Object[] objArr;
        char[] cArr;
        int iMyTid;
        int iB;
        int i4;
        Class<?> cls;
        char[] cArr2;
        int iResolveSize;
        int i5;
        char[] cArr3;
        int i6;
        int iB2;
        int i7;
        Class<?> cls2;
        char[] cArr4;
        int i8;
        int iB3;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Object[] objArr2;
        int i16;
        int i17;
        Class cls3;
        char c;
        int i18;
        Object[] objArr3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        int i19 = 2;
        int i20 = 2 % 2;
        byte[] bArr = $$a;
        byte b2 = bArr[13];
        byte b3 = bArr[28];
        Object[] objArr4 = new Object[1];
        a(b2, b3, b3, objArr4);
        int i21 = 0;
        Class<?> cls4 = Class.forName((String) objArr4[0]);
        byte b4 = bArr[28];
        byte b5 = bArr[13];
        Object[] objArr5 = new Object[1];
        a(b4, b5, b5, objArr5);
        String str = (String) objArr5[0];
        int i22 = b;
        int i23 = (i22 ^ 95) + ((i22 & 95) << 1);
        TuitionPaymentFragmentbindingInflater1 = i23 % 128;
        int i24 = i23 % 2;
        Class<?> cls5 = Class.forName("android.app.ApplicationPackageManager");
        byte b6 = bArr[28];
        byte b7 = bArr[13];
        Object[] objArr6 = new Object[1];
        a(b6, b7, b7, objArr6);
        String str2 = (String) objArr6[0];
        int i25 = TuitionPaymentFragmentbindingInflater1;
        int i26 = ((i25 | 49) << 1) - (i25 ^ 49);
        b = i26 % 128;
        int i27 = i26 % 2;
        Method[] methodArr = {cls4.getMethod(str, String.class, Integer.TYPE), cls5.getMethod(str2, String.class, Integer.TYPE)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            char trimmedLength = (char) TextUtils.getTrimmedLength("");
            int iMyTid2 = (Process.myTid() >> 22) + 2823;
            int iLastIndexOf = 21 - TextUtils.lastIndexOf("", '0');
            byte[] bArr2 = $$d;
            Object[] objArr7 = new Object[1];
            c(bArr2[5], bArr2[7], bArr2[10], objArr7);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(trimmedLength, iMyTid2, iLastIndexOf, 1814927978, false, (String) objArr7[0], null);
        }
        Class<?>[] clsArr = null;
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null) == null) {
            int i28 = TuitionPaymentFragmentbindingInflater1;
            int i29 = (i28 & 49) + (i28 | 49);
            b = i29 % 128;
            if (i29 % 2 == 0) {
                declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 2824 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 22 - TextUtils.getCapsMode("", 0, 0))).getDeclaredMethods();
                length = declaredMethods.length;
            } else {
                declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) View.MeasureSpec.getSize(0), TextUtils.indexOf((CharSequence) "", '0') + 2824, View.resolveSize(0, 0) + 22)).getDeclaredMethods();
                length = declaredMethods.length;
            }
            int i30 = 0;
            while (i30 < length) {
                Method method2 = declaredMethods[i30];
                int i31 = b + 121;
                TuitionPaymentFragmentbindingInflater1 = i31 % 128;
                int i32 = i31 % i19;
                try {
                    Object[] objArr8 = new Object[1];
                    d(new char[]{4523, 58763, 63969, 52513, 49475, 54650, 43170, 48258, 45310, 33900, 38941, 27773, 25507, 30594, 19454, 24359, 21253, 10036, 14986, 3733, 745, 5678, 59932, 65144}, 62507 - (ViewConfiguration.getTapTimeout() >> 16), objArr8);
                    Class<?> cls6 = Class.forName((String) objArr8[i21]);
                    int i33 = -(-View.MeasureSpec.getSize(i21));
                    Object[] objArr9 = new Object[1];
                    d(new char[]{4518, 64651, 52203, 54785, 42258, 45134, 40626, 28142, 30928, 18179, 21093, 8375}, (i33 & 60719) + (i33 | 60719), objArr9);
                    Integer num = (Integer) cls6.getMethod((String) objArr9[i21], clsArr).invoke(method2, clsArr);
                    int i34 = TuitionPaymentFragmentbindingInflater1;
                    int i35 = ((i34 | 81) << 1) - (i34 ^ 81);
                    b = i35 % 128;
                    if (i35 % i19 == 0) {
                        objArr = new Object[1];
                        objArr[i21] = Integer.valueOf(num.intValue());
                        cArr = new char[]{4523, 32103, 51257, 22517, 41715, 3662, 40202, 59614, 30622, 49936, 11893, 48425, 2291, 38838, 58182, 19979, 56773, 10456, 46194, 875, 28201, 65019, 18621, 54345, 8972, 36572};
                        iMyTid = Process.myTid() >> 106;
                        iB = attachPreviewSurface.b();
                        i4 = 5644;
                    } else {
                        objArr = new Object[1];
                        objArr[i21] = Integer.valueOf(num.intValue());
                        cArr = new char[]{4523, 32103, 51257, 22517, 41715, 3662, 40202, 59614, 30622, 49936, 11893, 48425, 2291, 38838, 58182, 19979, 56773, 10456, 46194, 875, 28201, 65019, 18621, 54345, 8972, 36572};
                        iMyTid = Process.myTid() >> 22;
                        iB = attachPreviewSurface.b();
                        i4 = 27847;
                    }
                    int i36 = i4;
                    int i37 = 319 * iMyTid;
                    int i38 = i36 * (-317);
                    int i39 = (i37 ^ i38) + ((i37 & i38) << 1);
                    int i40 = ~i36;
                    int i41 = ~((~iMyTid) | iB);
                    int i42 = ((i41 & i40) | (i40 ^ i41)) * (-318);
                    int i43 = (i39 & i42) + (i39 | i42);
                    int i44 = ~(i40 | iB);
                    int i45 = ~iB;
                    int i46 = ~((i45 ^ iMyTid) | (i45 & iMyTid) | i36);
                    int i47 = ((i44 ^ i46) | (i46 & i44)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                    int i48 = (i43 ^ i47) + ((i47 & i43) << 1);
                    int i49 = ~((~i36) | i45 | iMyTid);
                    int i50 = (i36 & iMyTid) | (iMyTid ^ i36);
                    int i51 = ~((i50 & iB) | (i50 ^ iB));
                    int i52 = ((i51 & i49) | (i49 ^ i51)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                    int i53 = (i48 ^ i52) + ((i52 & i48) << 1);
                    Object[] objArr10 = new Object[1];
                    d(cArr, i53, objArr10);
                    Class<?> cls7 = Class.forName((String) objArr10[0]);
                    int i54 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    int iB4 = attachPreviewSurface.b();
                    int i55 = (i54 * 50) - 934110;
                    int i56 = ~iB4;
                    int i57 = ~((i56 & (-9631)) | ((-9631) ^ i56));
                    int i58 = ~(((-9631) & i54) | ((-9631) ^ i54));
                    int i59 = ((i57 & i58) | (i57 ^ i58)) * 98;
                    int i60 = (i55 ^ i59) + ((i55 & i59) << 1);
                    int i61 = ~i54;
                    int i62 = ~iB4;
                    int i63 = ~((i61 & i62) | (i61 ^ i62));
                    int i64 = -(-(((i63 & (-9631)) | ((-9631) ^ i63) | (~((i54 ^ iB4) | (i54 & iB4)))) * (-49)));
                    int i65 = ~((iB4 & (-9631)) | ((-9631) ^ iB4));
                    int i66 = ~((i54 & 9630) | (i54 ^ 9630));
                    int i67 = ((((i60 | i64) << 1) - (i64 ^ i60)) - (~(((i66 & i65) | (i65 ^ i66)) * 49))) - 1;
                    Object[] objArr11 = new Object[1];
                    d(new char[]{4520, 13359, 23221, 24951, 34753, 44473, 61465, 5871}, i67, objArr11);
                    if (((Boolean) cls7.getMethod((String) objArr11[0], Integer.TYPE).invoke(null, objArr)).booleanValue()) {
                        Class cls8 = Long.TYPE;
                        char[] cArr5 = {4523, 58763, 63969, 52513, 49475, 54650, 43170, 48258, 45310, 33900, 38941, 27773, 25507, 30594, 19454, 24359, 21253, 10036, 14986, 3733, 745, 5678, 59932, 65144};
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0);
                        int i68 = b;
                        int i69 = (i68 & 31) + (i68 | 31);
                        TuitionPaymentFragmentbindingInflater1 = i69 % 128;
                        if (i69 % 2 != 0) {
                            int i70 = -iIndexOf;
                            Object[] objArr12 = new Object[1];
                            d(cArr5, ((i70 | 62506) << 1) - (62506 ^ i70), objArr12);
                            cls = Class.forName((String) objArr12[0]);
                            cArr2 = new char[]{4518, 64033, 50879, 54044, 49072, 34860, 38058, 24848, 19847, 22072, 8842, 3846, 7064};
                            iResolveSize = View.resolveSize(1, 0);
                        } else {
                            int i71 = -iIndexOf;
                            Object[] objArr13 = new Object[1];
                            d(cArr5, (i71 & 62506) + (62506 | i71), objArr13);
                            cls = Class.forName((String) objArr13[0]);
                            cArr2 = new char[]{4518, 64033, 50879, 54044, 49072, 34860, 38058, 24848, 19847, 22072, 8842, 3846, 7064};
                            iResolveSize = View.resolveSize(0, 0);
                        }
                        int i72 = TuitionPaymentFragmentbindingInflater1 + 73;
                        b = i72 % 128;
                        if (i72 % 2 == 0) {
                            int i73 = -iResolveSize;
                            int i74 = (60293 ^ i73) + ((i73 & 60293) << 1);
                            Object[] objArr14 = new Object[1];
                            d(cArr2, i74, objArr14);
                            if (cls8.equals(cls.getMethod((String) objArr14[0], null).invoke(method2, null))) {
                                int i75 = b;
                                i5 = (i75 ^ 95) + ((i75 & 95) << 1);
                                TuitionPaymentFragmentbindingInflater1 = i5 % 128;
                                if (i5 % 2 != 0) {
                                    cArr3 = new char[]{4523, 58763, 63969, 52513, 49475, 54650, 43170, 48258, 45310, 33900, 38941, 27773, 25507, 30594, 19454, 24359, 21253, 10036, 14986, 3733, 745, 5678, 59932, 65144};
                                    i6 = -ExpandableListView.getPackedPositionType(1L);
                                    iB2 = attachPreviewSurface.b();
                                    int i76 = -(-i6);
                                    i7 = ((i76 | (-1975)) << 1) - (i76 ^ (-1975));
                                } else {
                                    cArr3 = new char[]{4523, 58763, 63969, 52513, 49475, 54650, 43170, 48258, 45310, 33900, 38941, 27773, 25507, 30594, 19454, 24359, 21253, 10036, 14986, 3733, 745, 5678, 59932, 65144};
                                    i6 = -ExpandableListView.getPackedPositionType(0L);
                                    iB2 = attachPreviewSurface.b();
                                    i7 = i6 * (-1975);
                                }
                                int i77 = ~((~i6) | 62507);
                                int i78 = (i7 & 61819423) + (61819423 | i7) + (((i77 & iB2) | (iB2 ^ i77)) * 988);
                                int i79 = ~((-62508) | i6);
                                int i80 = ~iB2;
                                int i81 = ~((i80 & i6) | (i80 ^ i6));
                                int i82 = -(-(((i79 & i81) | (i79 ^ i81)) * (-1976)));
                                int i83 = (i78 ^ i82) + ((i82 & i78) << 1);
                                int i84 = ~i6;
                                int i85 = ~((i84 & 62507) | (i84 ^ 62507));
                                int i86 = b;
                                int i87 = (i86 ^ 23) + ((i86 & 23) << 1);
                                TuitionPaymentFragmentbindingInflater1 = i87 % 128;
                                int i88 = i87 % 2;
                                int i89 = ~((-62508) | iB2);
                                int i90 = (i85 & i89) | (i85 ^ i89);
                                int i91 = ~iB2;
                                int i92 = ~((i91 & 62507) | (i91 ^ 62507));
                                int i93 = 988 * ((i90 & i92) | (i90 ^ i92));
                                int i94 = (i83 & i93) + (i93 | i83);
                                Object[] objArr15 = new Object[1];
                                d(cArr3, i94, objArr15);
                                cls2 = Class.forName((String) objArr15[0]);
                                cArr4 = new char[]{4518, 35891, 10907, 51540, 26620, 576, 41002, 24205, 64796, 39930, 13890, 54478, 29313, 4371, 36851, 10877, 51394};
                                int doubleTapTimeout = ViewConfiguration.getDoubleTapTimeout();
                                int i95 = b + 67;
                                TuitionPaymentFragmentbindingInflater1 = i95 % 128;
                                int i96 = i95 % 2;
                                i8 = -(doubleTapTimeout >> 16);
                                iB3 = attachPreviewSurface.b();
                                i9 = (i8 * (-575)) - 23197225;
                                i10 = TuitionPaymentFragmentbindingInflater1 + 13;
                                int i97 = i10 % 128;
                                b = i97;
                                if (i10 % 2 == 0) {
                                    int i98 = ~i8;
                                    int i99 = ~((i98 ^ (-40344)) | (i98 & (-40344)));
                                    int i100 = ~(((-40344) ^ iB3) | ((-40344) & iB3));
                                    int i101 = -((i99 ^ i100) | (i99 & i100));
                                    i11 = i9 - (((i101 | 576) << 1) - (i101 ^ 576));
                                    int i102 = ~i8;
                                    i12 = (i102 & 40343) | (i102 ^ 40343);
                                } else {
                                    int i103 = ~i8;
                                    int i104 = ~((i103 ^ (-40344)) | ((-40344) & i103));
                                    int i105 = ~((-40344) | iB3);
                                    int i106 = ((i104 ^ i105) | (i104 & i105)) * 576;
                                    i11 = ((i9 & i106) << 1) + (i9 ^ i106);
                                    i12 = i103 | 40343;
                                }
                                int i107 = ~i12;
                                int i108 = ~iB3;
                                int i109 = (i108 & (-40344)) | ((-40344) ^ i108);
                                int i110 = ~((i109 & i8) | (i109 ^ i8));
                                int i111 = 576 * ((i110 & i107) | (i107 ^ i110));
                                i13 = ((i11 | i111) << 1) - (i11 ^ i111);
                                i14 = ~i8;
                                i15 = ((i97 | 25) << 1) - (i97 ^ 25);
                                TuitionPaymentFragmentbindingInflater1 = i15 % 128;
                                if (i15 % 2 != 0) {
                                    int i112 = i13 >>> (576 << (~((i14 & (-40344)) | (i14 ^ (-40344)))));
                                    Object[] objArr16 = new Object[1];
                                    d(cArr4, i112, objArr16);
                                    objArr2 = (Object[]) cls2.getMethod((String) objArr16[0], null).invoke(method2, null);
                                    if (objArr2.length == 5) {
                                        i16 = 2;
                                        int i113 = b;
                                        int i114 = (i113 & 49) + (i113 | 49);
                                        TuitionPaymentFragmentbindingInflater1 = i114 % 128;
                                        i17 = i114 % i16;
                                        cls3 = Long.TYPE;
                                        if (i17 != 0) {
                                            c = 0;
                                            if (cls3.equals(objArr2[0])) {
                                                i18 = 24;
                                                char[] cArr6 = new char[i18];
                                                // fill-array-data instruction
                                                cArr6[0] = 4523;
                                                cArr6[1] = 58763;
                                                cArr6[2] = 63969;
                                                cArr6[3] = 52513;
                                                cArr6[4] = 49475;
                                                cArr6[5] = 54650;
                                                cArr6[6] = 43170;
                                                cArr6[7] = 48258;
                                                cArr6[8] = 45310;
                                                cArr6[9] = 33900;
                                                cArr6[10] = 38941;
                                                cArr6[11] = 27773;
                                                cArr6[12] = 25507;
                                                cArr6[13] = 30594;
                                                cArr6[14] = 19454;
                                                cArr6[15] = 24359;
                                                cArr6[16] = 21253;
                                                cArr6[17] = 10036;
                                                cArr6[18] = 14986;
                                                cArr6[19] = 3733;
                                                cArr6[20] = 745;
                                                cArr6[21] = 5678;
                                                cArr6[22] = 59932;
                                                cArr6[23] = 65144;
                                                objArr3 = new Object[1];
                                                d(cArr6, 62506 - Process.getGidForName(""), objArr3);
                                                if (Class.forName((String) objArr3[c]).equals(objArr2[1])) {
                                                    int i115 = b;
                                                    int i116 = (i115 ^ 75) + ((i115 & 75) << 1);
                                                    TuitionPaymentFragmentbindingInflater1 = i116 % 128;
                                                    int i117 = i116 % 2;
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                        char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                        int i118 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2822;
                                                        int iAxisFromString = 21 - MotionEvent.axisFromString("");
                                                        byte[] bArr3 = $$d;
                                                        Object[] objArr17 = new Object[1];
                                                        c(bArr3[5], bArr3[7], bArr3[10], objArr17);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarFadeDuration, i118, iAxisFromString, 1814927978, false, (String) objArr17[0], null);
                                                    }
                                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method2);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                        char gidForName = (char) ((-1) - Process.getGidForName(""));
                                                        int i119 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2822;
                                                        int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 23;
                                                        byte[] bArr4 = $$d;
                                                        Object[] objArr18 = new Object[1];
                                                        c(bArr4[5], bArr4[7], bArr4[10], objArr18);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(gidForName, i119, iIndexOf2, 1814927978, false, (String) objArr18[0], null);
                                                    }
                                                    Object[] objArr19 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                        char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                                                        int iLastIndexOf2 = 2822 - TextUtils.lastIndexOf("", '0', 0);
                                                        int iIndexOf3 = 22 - TextUtils.indexOf("", "", 0);
                                                        byte[] bArr5 = $$d;
                                                        byte b8 = bArr5[7];
                                                        Object[] objArr20 = new Object[1];
                                                        c(b8, bArr5[5], b8, objArr20);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(pressedStateDuration, iLastIndexOf2, iIndexOf3, -2137287382, false, (String) objArr20[0], new Class[]{Long.TYPE, Method.class});
                                                    }
                                                    ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr19)).longValue();
                                                    int i120 = TuitionPaymentFragmentbindingInflater1;
                                                    int i121 = (i120 ^ 31) + ((i120 & 31) << 1);
                                                    b = i121 % 128;
                                                    int i122 = i121 % 2;
                                                    break;
                                                }
                                            } else {
                                                continue;
                                            }
                                        } else if (cls3.equals(objArr2[1])) {
                                            i18 = 24;
                                            c = 0;
                                            char[] cArr7 = new char[i18];
                                            // fill-array-data instruction
                                            cArr7[0] = 4523;
                                            cArr7[1] = 58763;
                                            cArr7[2] = 63969;
                                            cArr7[3] = 52513;
                                            cArr7[4] = 49475;
                                            cArr7[5] = 54650;
                                            cArr7[6] = 43170;
                                            cArr7[7] = 48258;
                                            cArr7[8] = 45310;
                                            cArr7[9] = 33900;
                                            cArr7[10] = 38941;
                                            cArr7[11] = 27773;
                                            cArr7[12] = 25507;
                                            cArr7[13] = 30594;
                                            cArr7[14] = 19454;
                                            cArr7[15] = 24359;
                                            cArr7[16] = 21253;
                                            cArr7[17] = 10036;
                                            cArr7[18] = 14986;
                                            cArr7[19] = 3733;
                                            cArr7[20] = 745;
                                            cArr7[21] = 5678;
                                            cArr7[22] = 59932;
                                            cArr7[23] = 65144;
                                            objArr3 = new Object[1];
                                            d(cArr7, 62506 - Process.getGidForName(""), objArr3);
                                            if (Class.forName((String) objArr3[c]).equals(objArr2[1])) {
                                                int i1110 = b;
                                                int i1111 = (i1110 ^ 75) + ((i1110 & 75) << 1);
                                                TuitionPaymentFragmentbindingInflater1 = i1111 % 128;
                                                int i1112 = i1111 % 2;
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                    char scrollBarFadeDuration2 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                    int i1113 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2822;
                                                    int iAxisFromString2 = 21 - MotionEvent.axisFromString("");
                                                    byte[] bArr6 = $$d;
                                                    Object[] objArr110 = new Object[1];
                                                    c(bArr6[5], bArr6[7], bArr6[10], objArr110);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarFadeDuration2, i1113, iAxisFromString2, 1814927978, false, (String) objArr110[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method2);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                    char gidForName2 = (char) ((-1) - Process.getGidForName(""));
                                                    int i1114 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2822;
                                                    int iIndexOf4 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 23;
                                                    byte[] bArr7 = $$d;
                                                    Object[] objArr111 = new Object[1];
                                                    c(bArr7[5], bArr7[7], bArr7[10], objArr111);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(gidForName2, i1114, iIndexOf4, 1814927978, false, (String) objArr111[0], null);
                                                }
                                                try {
                                                    Object[] objArr112 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                        char pressedStateDuration2 = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                                                        int iLastIndexOf3 = 2822 - TextUtils.lastIndexOf("", '0', 0);
                                                        int iIndexOf5 = 22 - TextUtils.indexOf("", "", 0);
                                                        byte[] bArr8 = $$d;
                                                        byte b9 = bArr8[7];
                                                        Object[] objArr21 = new Object[1];
                                                        c(b9, bArr8[5], b9, objArr21);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(pressedStateDuration2, iLastIndexOf3, iIndexOf5, -2137287382, false, (String) objArr21[0], new Class[]{Long.TYPE, Method.class});
                                                    }
                                                    ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr112)).longValue();
                                                    int i123 = TuitionPaymentFragmentbindingInflater1;
                                                    int i124 = (i123 ^ 31) + ((i123 & 31) << 1);
                                                    b = i124 % 128;
                                                    int i125 = i124 % 2;
                                                    break;
                                                } catch (Throwable th) {
                                                    Throwable cause = th.getCause();
                                                    if (cause != null) {
                                                        throw cause;
                                                    }
                                                    throw th;
                                                }
                                            }
                                        } else {
                                            continue;
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    int i126 = -(-((~((i14 & (-40344)) | (i14 ^ (-40344)))) * 576));
                                    int i127 = (i13 & i126) + (i126 | i13);
                                    Object[] objArr22 = new Object[1];
                                    d(cArr4, i127, objArr22);
                                    objArr2 = (Object[]) cls2.getMethod((String) objArr22[0], null).invoke(method2, null);
                                    i16 = 2;
                                    if (objArr2.length == 2) {
                                        int i1115 = b;
                                        int i1116 = (i1115 & 49) + (i1115 | 49);
                                        TuitionPaymentFragmentbindingInflater1 = i1116 % 128;
                                        i17 = i1116 % i16;
                                        cls3 = Long.TYPE;
                                        if (i17 != 0) {
                                            c = 0;
                                            if (cls3.equals(objArr2[0])) {
                                                i18 = 24;
                                                char[] cArr8 = new char[i18];
                                                // fill-array-data instruction
                                                cArr8[0] = 4523;
                                                cArr8[1] = 58763;
                                                cArr8[2] = 63969;
                                                cArr8[3] = 52513;
                                                cArr8[4] = 49475;
                                                cArr8[5] = 54650;
                                                cArr8[6] = 43170;
                                                cArr8[7] = 48258;
                                                cArr8[8] = 45310;
                                                cArr8[9] = 33900;
                                                cArr8[10] = 38941;
                                                cArr8[11] = 27773;
                                                cArr8[12] = 25507;
                                                cArr8[13] = 30594;
                                                cArr8[14] = 19454;
                                                cArr8[15] = 24359;
                                                cArr8[16] = 21253;
                                                cArr8[17] = 10036;
                                                cArr8[18] = 14986;
                                                cArr8[19] = 3733;
                                                cArr8[20] = 745;
                                                cArr8[21] = 5678;
                                                cArr8[22] = 59932;
                                                cArr8[23] = 65144;
                                                objArr3 = new Object[1];
                                                d(cArr8, 62506 - Process.getGidForName(""), objArr3);
                                                if (Class.forName((String) objArr3[c]).equals(objArr2[1])) {
                                                    int i1117 = b;
                                                    int i1118 = (i1117 ^ 75) + ((i1117 & 75) << 1);
                                                    TuitionPaymentFragmentbindingInflater1 = i1118 % 128;
                                                    int i1119 = i1118 % 2;
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                        char scrollBarFadeDuration3 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                        int i11110 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2822;
                                                        int iAxisFromString3 = 21 - MotionEvent.axisFromString("");
                                                        byte[] bArr9 = $$d;
                                                        Object[] objArr113 = new Object[1];
                                                        c(bArr9[5], bArr9[7], bArr9[10], objArr113);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarFadeDuration3, i11110, iAxisFromString3, 1814927978, false, (String) objArr113[0], null);
                                                    }
                                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method2);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                        char gidForName3 = (char) ((-1) - Process.getGidForName(""));
                                                        int i11111 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2822;
                                                        int iIndexOf6 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 23;
                                                        byte[] bArr10 = $$d;
                                                        Object[] objArr114 = new Object[1];
                                                        c(bArr10[5], bArr10[7], bArr10[10], objArr114);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(gidForName3, i11111, iIndexOf6, 1814927978, false, (String) objArr114[0], null);
                                                    }
                                                    Object[] objArr115 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                        char pressedStateDuration3 = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                                                        int iLastIndexOf4 = 2822 - TextUtils.lastIndexOf("", '0', 0);
                                                        int iIndexOf7 = 22 - TextUtils.indexOf("", "", 0);
                                                        byte[] bArr11 = $$d;
                                                        byte b10 = bArr11[7];
                                                        Object[] objArr23 = new Object[1];
                                                        c(b10, bArr11[5], b10, objArr23);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(pressedStateDuration3, iLastIndexOf4, iIndexOf7, -2137287382, false, (String) objArr23[0], new Class[]{Long.TYPE, Method.class});
                                                    }
                                                    ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr115)).longValue();
                                                    int i128 = TuitionPaymentFragmentbindingInflater1;
                                                    int i129 = (i128 ^ 31) + ((i128 & 31) << 1);
                                                    b = i129 % 128;
                                                    int i1210 = i129 % 2;
                                                    break;
                                                }
                                            } else {
                                                continue;
                                            }
                                        } else if (cls3.equals(objArr2[1])) {
                                            i18 = 24;
                                            c = 0;
                                            char[] cArr9 = new char[i18];
                                            // fill-array-data instruction
                                            cArr9[0] = 4523;
                                            cArr9[1] = 58763;
                                            cArr9[2] = 63969;
                                            cArr9[3] = 52513;
                                            cArr9[4] = 49475;
                                            cArr9[5] = 54650;
                                            cArr9[6] = 43170;
                                            cArr9[7] = 48258;
                                            cArr9[8] = 45310;
                                            cArr9[9] = 33900;
                                            cArr9[10] = 38941;
                                            cArr9[11] = 27773;
                                            cArr9[12] = 25507;
                                            cArr9[13] = 30594;
                                            cArr9[14] = 19454;
                                            cArr9[15] = 24359;
                                            cArr9[16] = 21253;
                                            cArr9[17] = 10036;
                                            cArr9[18] = 14986;
                                            cArr9[19] = 3733;
                                            cArr9[20] = 745;
                                            cArr9[21] = 5678;
                                            cArr9[22] = 59932;
                                            cArr9[23] = 65144;
                                            objArr3 = new Object[1];
                                            d(cArr9, 62506 - Process.getGidForName(""), objArr3);
                                            if (Class.forName((String) objArr3[c]).equals(objArr2[1])) {
                                                int i11112 = b;
                                                int i11113 = (i11112 ^ 75) + ((i11112 & 75) << 1);
                                                TuitionPaymentFragmentbindingInflater1 = i11113 % 128;
                                                int i11114 = i11113 % 2;
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                    char scrollBarFadeDuration4 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                    int i11115 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2822;
                                                    int iAxisFromString4 = 21 - MotionEvent.axisFromString("");
                                                    byte[] bArr12 = $$d;
                                                    Object[] objArr116 = new Object[1];
                                                    c(bArr12[5], bArr12[7], bArr12[10], objArr116);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarFadeDuration4, i11115, iAxisFromString4, 1814927978, false, (String) objArr116[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method2);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                    char gidForName4 = (char) ((-1) - Process.getGidForName(""));
                                                    int i11116 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2822;
                                                    int iIndexOf8 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 23;
                                                    byte[] bArr13 = $$d;
                                                    Object[] objArr117 = new Object[1];
                                                    c(bArr13[5], bArr13[7], bArr13[10], objArr117);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(gidForName4, i11116, iIndexOf8, 1814927978, false, (String) objArr117[0], null);
                                                }
                                                Object[] objArr118 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    char pressedStateDuration4 = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                                                    int iLastIndexOf5 = 2822 - TextUtils.lastIndexOf("", '0', 0);
                                                    int iIndexOf9 = 22 - TextUtils.indexOf("", "", 0);
                                                    byte[] bArr14 = $$d;
                                                    byte b11 = bArr14[7];
                                                    Object[] objArr24 = new Object[1];
                                                    c(b11, bArr14[5], b11, objArr24);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(pressedStateDuration4, iLastIndexOf5, iIndexOf9, -2137287382, false, (String) objArr24[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr118)).longValue();
                                                int i1211 = TuitionPaymentFragmentbindingInflater1;
                                                int i1212 = (i1211 ^ 31) + ((i1211 & 31) << 1);
                                                b = i1212 % 128;
                                                int i1213 = i1212 % 2;
                                                break;
                                            }
                                        } else {
                                            continue;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            } else {
                                continue;
                            }
                        } else {
                            Object[] objArr25 = new Object[1];
                            d(cArr2, 60293 - iResolveSize, objArr25);
                            if (cls8.equals(cls.getMethod((String) objArr25[0], null).invoke(method2, null))) {
                                int i710 = b;
                                i5 = (i710 ^ 95) + ((i710 & 95) << 1);
                                TuitionPaymentFragmentbindingInflater1 = i5 % 128;
                                if (i5 % 2 != 0) {
                                    cArr3 = new char[]{4523, 58763, 63969, 52513, 49475, 54650, 43170, 48258, 45310, 33900, 38941, 27773, 25507, 30594, 19454, 24359, 21253, 10036, 14986, 3733, 745, 5678, 59932, 65144};
                                    i6 = -ExpandableListView.getPackedPositionType(1L);
                                    iB2 = attachPreviewSurface.b();
                                    int i711 = -(-i6);
                                    i7 = ((i711 | (-1975)) << 1) - (i711 ^ (-1975));
                                } else {
                                    cArr3 = new char[]{4523, 58763, 63969, 52513, 49475, 54650, 43170, 48258, 45310, 33900, 38941, 27773, 25507, 30594, 19454, 24359, 21253, 10036, 14986, 3733, 745, 5678, 59932, 65144};
                                    i6 = -ExpandableListView.getPackedPositionType(0L);
                                    iB2 = attachPreviewSurface.b();
                                    i7 = i6 * (-1975);
                                }
                                int i712 = ~((~i6) | 62507);
                                int i713 = (i7 & 61819423) + (61819423 | i7) + (((i712 & iB2) | (iB2 ^ i712)) * 988);
                                int i714 = ~((-62508) | i6);
                                int i810 = ~iB2;
                                int i811 = ~((i810 & i6) | (i810 ^ i6));
                                int i812 = -(-(((i714 & i811) | (i714 ^ i811)) * (-1976)));
                                int i813 = (i713 ^ i812) + ((i812 & i713) << 1);
                                int i814 = ~i6;
                                int i815 = ~((i814 & 62507) | (i814 ^ 62507));
                                int i816 = b;
                                int i817 = (i816 ^ 23) + ((i816 & 23) << 1);
                                TuitionPaymentFragmentbindingInflater1 = i817 % 128;
                                int i818 = i817 % 2;
                                int i819 = ~((-62508) | iB2);
                                int i910 = (i815 & i819) | (i815 ^ i819);
                                int i911 = ~iB2;
                                int i912 = ~((i911 & 62507) | (i911 ^ 62507));
                                int i913 = 988 * ((i910 & i912) | (i910 ^ i912));
                                int i914 = (i813 & i913) + (i913 | i813);
                                Object[] objArr119 = new Object[1];
                                d(cArr3, i914, objArr119);
                                cls2 = Class.forName((String) objArr119[0]);
                                cArr4 = new char[]{4518, 35891, 10907, 51540, 26620, 576, 41002, 24205, 64796, 39930, 13890, 54478, 29313, 4371, 36851, 10877, 51394};
                                int doubleTapTimeout2 = ViewConfiguration.getDoubleTapTimeout();
                                int i915 = b + 67;
                                TuitionPaymentFragmentbindingInflater1 = i915 % 128;
                                int i916 = i915 % 2;
                                i8 = -(doubleTapTimeout2 >> 16);
                                iB3 = attachPreviewSurface.b();
                                i9 = (i8 * (-575)) - 23197225;
                                i10 = TuitionPaymentFragmentbindingInflater1 + 13;
                                int i917 = i10 % 128;
                                b = i917;
                                if (i10 % 2 == 0) {
                                    int i918 = ~i8;
                                    int i919 = ~((i918 ^ (-40344)) | (i918 & (-40344)));
                                    int i1010 = ~(((-40344) ^ iB3) | ((-40344) & iB3));
                                    int i1011 = -((i919 ^ i1010) | (i919 & i1010));
                                    i11 = i9 - (((i1011 | 576) << 1) - (i1011 ^ 576));
                                    int i1012 = ~i8;
                                    i12 = (i1012 & 40343) | (i1012 ^ 40343);
                                } else {
                                    int i1013 = ~i8;
                                    int i1014 = ~((i1013 ^ (-40344)) | ((-40344) & i1013));
                                    int i1015 = ~((-40344) | iB3);
                                    int i1016 = ((i1014 ^ i1015) | (i1014 & i1015)) * 576;
                                    i11 = ((i9 & i1016) << 1) + (i9 ^ i1016);
                                    i12 = i1013 | 40343;
                                }
                                int i1017 = ~i12;
                                int i1018 = ~iB3;
                                int i1019 = (i1018 & (-40344)) | ((-40344) ^ i1018);
                                int i1120 = ~((i1019 & i8) | (i1019 ^ i8));
                                int i1121 = 576 * ((i1120 & i1017) | (i1017 ^ i1120));
                                i13 = ((i11 | i1121) << 1) - (i11 ^ i1121);
                                i14 = ~i8;
                                i15 = ((i917 | 25) << 1) - (i917 ^ 25);
                                TuitionPaymentFragmentbindingInflater1 = i15 % 128;
                                if (i15 % 2 != 0) {
                                    int i1122 = i13 >>> (576 << (~((i14 & (-40344)) | (i14 ^ (-40344)))));
                                    Object[] objArr120 = new Object[1];
                                    d(cArr4, i1122, objArr120);
                                    objArr2 = (Object[]) cls2.getMethod((String) objArr120[0], null).invoke(method2, null);
                                    if (objArr2.length == 5) {
                                        i16 = 2;
                                        int i11117 = b;
                                        int i11118 = (i11117 & 49) + (i11117 | 49);
                                        TuitionPaymentFragmentbindingInflater1 = i11118 % 128;
                                        i17 = i11118 % i16;
                                        cls3 = Long.TYPE;
                                        if (i17 != 0) {
                                            c = 0;
                                            if (cls3.equals(objArr2[0])) {
                                                i18 = 24;
                                                char[] cArr10 = new char[i18];
                                                // fill-array-data instruction
                                                cArr10[0] = 4523;
                                                cArr10[1] = 58763;
                                                cArr10[2] = 63969;
                                                cArr10[3] = 52513;
                                                cArr10[4] = 49475;
                                                cArr10[5] = 54650;
                                                cArr10[6] = 43170;
                                                cArr10[7] = 48258;
                                                cArr10[8] = 45310;
                                                cArr10[9] = 33900;
                                                cArr10[10] = 38941;
                                                cArr10[11] = 27773;
                                                cArr10[12] = 25507;
                                                cArr10[13] = 30594;
                                                cArr10[14] = 19454;
                                                cArr10[15] = 24359;
                                                cArr10[16] = 21253;
                                                cArr10[17] = 10036;
                                                cArr10[18] = 14986;
                                                cArr10[19] = 3733;
                                                cArr10[20] = 745;
                                                cArr10[21] = 5678;
                                                cArr10[22] = 59932;
                                                cArr10[23] = 65144;
                                                objArr3 = new Object[1];
                                                d(cArr10, 62506 - Process.getGidForName(""), objArr3);
                                                if (Class.forName((String) objArr3[c]).equals(objArr2[1])) {
                                                    int i11119 = b;
                                                    int i111110 = (i11119 ^ 75) + ((i11119 & 75) << 1);
                                                    TuitionPaymentFragmentbindingInflater1 = i111110 % 128;
                                                    int i111111 = i111110 % 2;
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                        char scrollBarFadeDuration5 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                        int i111112 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2822;
                                                        int iAxisFromString5 = 21 - MotionEvent.axisFromString("");
                                                        byte[] bArr15 = $$d;
                                                        Object[] objArr1110 = new Object[1];
                                                        c(bArr15[5], bArr15[7], bArr15[10], objArr1110);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarFadeDuration5, i111112, iAxisFromString5, 1814927978, false, (String) objArr1110[0], null);
                                                    }
                                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method2);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                        char gidForName5 = (char) ((-1) - Process.getGidForName(""));
                                                        int i111113 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2822;
                                                        int iIndexOf10 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 23;
                                                        byte[] bArr16 = $$d;
                                                        Object[] objArr1111 = new Object[1];
                                                        c(bArr16[5], bArr16[7], bArr16[10], objArr1111);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(gidForName5, i111113, iIndexOf10, 1814927978, false, (String) objArr1111[0], null);
                                                    }
                                                    Object[] objArr1112 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                        char pressedStateDuration5 = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                                                        int iLastIndexOf6 = 2822 - TextUtils.lastIndexOf("", '0', 0);
                                                        int iIndexOf11 = 22 - TextUtils.indexOf("", "", 0);
                                                        byte[] bArr17 = $$d;
                                                        byte b12 = bArr17[7];
                                                        Object[] objArr26 = new Object[1];
                                                        c(b12, bArr17[5], b12, objArr26);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(pressedStateDuration5, iLastIndexOf6, iIndexOf11, -2137287382, false, (String) objArr26[0], new Class[]{Long.TYPE, Method.class});
                                                    }
                                                    ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr1112)).longValue();
                                                    int i1214 = TuitionPaymentFragmentbindingInflater1;
                                                    int i1215 = (i1214 ^ 31) + ((i1214 & 31) << 1);
                                                    b = i1215 % 128;
                                                    int i1216 = i1215 % 2;
                                                    break;
                                                }
                                            } else {
                                                continue;
                                            }
                                        } else if (cls3.equals(objArr2[1])) {
                                            i18 = 24;
                                            c = 0;
                                            char[] cArr11 = new char[i18];
                                            // fill-array-data instruction
                                            cArr11[0] = 4523;
                                            cArr11[1] = 58763;
                                            cArr11[2] = 63969;
                                            cArr11[3] = 52513;
                                            cArr11[4] = 49475;
                                            cArr11[5] = 54650;
                                            cArr11[6] = 43170;
                                            cArr11[7] = 48258;
                                            cArr11[8] = 45310;
                                            cArr11[9] = 33900;
                                            cArr11[10] = 38941;
                                            cArr11[11] = 27773;
                                            cArr11[12] = 25507;
                                            cArr11[13] = 30594;
                                            cArr11[14] = 19454;
                                            cArr11[15] = 24359;
                                            cArr11[16] = 21253;
                                            cArr11[17] = 10036;
                                            cArr11[18] = 14986;
                                            cArr11[19] = 3733;
                                            cArr11[20] = 745;
                                            cArr11[21] = 5678;
                                            cArr11[22] = 59932;
                                            cArr11[23] = 65144;
                                            objArr3 = new Object[1];
                                            d(cArr11, 62506 - Process.getGidForName(""), objArr3);
                                            if (Class.forName((String) objArr3[c]).equals(objArr2[1])) {
                                                int i111114 = b;
                                                int i111115 = (i111114 ^ 75) + ((i111114 & 75) << 1);
                                                TuitionPaymentFragmentbindingInflater1 = i111115 % 128;
                                                int i111116 = i111115 % 2;
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                    char scrollBarFadeDuration6 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                    int i111117 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2822;
                                                    int iAxisFromString6 = 21 - MotionEvent.axisFromString("");
                                                    byte[] bArr18 = $$d;
                                                    Object[] objArr1113 = new Object[1];
                                                    c(bArr18[5], bArr18[7], bArr18[10], objArr1113);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarFadeDuration6, i111117, iAxisFromString6, 1814927978, false, (String) objArr1113[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method2);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                    char gidForName6 = (char) ((-1) - Process.getGidForName(""));
                                                    int i111118 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2822;
                                                    int iIndexOf12 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 23;
                                                    byte[] bArr19 = $$d;
                                                    Object[] objArr1114 = new Object[1];
                                                    c(bArr19[5], bArr19[7], bArr19[10], objArr1114);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(gidForName6, i111118, iIndexOf12, 1814927978, false, (String) objArr1114[0], null);
                                                }
                                                Object[] objArr1115 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    char pressedStateDuration6 = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                                                    int iLastIndexOf7 = 2822 - TextUtils.lastIndexOf("", '0', 0);
                                                    int iIndexOf13 = 22 - TextUtils.indexOf("", "", 0);
                                                    byte[] bArr110 = $$d;
                                                    byte b13 = bArr110[7];
                                                    Object[] objArr27 = new Object[1];
                                                    c(b13, bArr110[5], b13, objArr27);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(pressedStateDuration6, iLastIndexOf7, iIndexOf13, -2137287382, false, (String) objArr27[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr1115)).longValue();
                                                int i1217 = TuitionPaymentFragmentbindingInflater1;
                                                int i1218 = (i1217 ^ 31) + ((i1217 & 31) << 1);
                                                b = i1218 % 128;
                                                int i1219 = i1218 % 2;
                                                break;
                                            }
                                        } else {
                                            continue;
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    int i1220 = -(-((~((i14 & (-40344)) | (i14 ^ (-40344)))) * 576));
                                    int i1221 = (i13 & i1220) + (i1220 | i13);
                                    Object[] objArr28 = new Object[1];
                                    d(cArr4, i1221, objArr28);
                                    objArr2 = (Object[]) cls2.getMethod((String) objArr28[0], null).invoke(method2, null);
                                    i16 = 2;
                                    if (objArr2.length == 2) {
                                        int i111119 = b;
                                        int i111120 = (i111119 & 49) + (i111119 | 49);
                                        TuitionPaymentFragmentbindingInflater1 = i111120 % 128;
                                        i17 = i111120 % i16;
                                        cls3 = Long.TYPE;
                                        if (i17 != 0) {
                                            c = 0;
                                            if (cls3.equals(objArr2[0])) {
                                                i18 = 24;
                                                char[] cArr12 = new char[i18];
                                                // fill-array-data instruction
                                                cArr12[0] = 4523;
                                                cArr12[1] = 58763;
                                                cArr12[2] = 63969;
                                                cArr12[3] = 52513;
                                                cArr12[4] = 49475;
                                                cArr12[5] = 54650;
                                                cArr12[6] = 43170;
                                                cArr12[7] = 48258;
                                                cArr12[8] = 45310;
                                                cArr12[9] = 33900;
                                                cArr12[10] = 38941;
                                                cArr12[11] = 27773;
                                                cArr12[12] = 25507;
                                                cArr12[13] = 30594;
                                                cArr12[14] = 19454;
                                                cArr12[15] = 24359;
                                                cArr12[16] = 21253;
                                                cArr12[17] = 10036;
                                                cArr12[18] = 14986;
                                                cArr12[19] = 3733;
                                                cArr12[20] = 745;
                                                cArr12[21] = 5678;
                                                cArr12[22] = 59932;
                                                cArr12[23] = 65144;
                                                objArr3 = new Object[1];
                                                d(cArr12, 62506 - Process.getGidForName(""), objArr3);
                                                if (Class.forName((String) objArr3[c]).equals(objArr2[1])) {
                                                    int i1111110 = b;
                                                    int i1111111 = (i1111110 ^ 75) + ((i1111110 & 75) << 1);
                                                    TuitionPaymentFragmentbindingInflater1 = i1111111 % 128;
                                                    int i1111112 = i1111111 % 2;
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                        char scrollBarFadeDuration7 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                        int i1111113 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2822;
                                                        int iAxisFromString7 = 21 - MotionEvent.axisFromString("");
                                                        byte[] bArr111 = $$d;
                                                        Object[] objArr1116 = new Object[1];
                                                        c(bArr111[5], bArr111[7], bArr111[10], objArr1116);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarFadeDuration7, i1111113, iAxisFromString7, 1814927978, false, (String) objArr1116[0], null);
                                                    }
                                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method2);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                        char gidForName7 = (char) ((-1) - Process.getGidForName(""));
                                                        int i1111114 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2822;
                                                        int iIndexOf14 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 23;
                                                        byte[] bArr112 = $$d;
                                                        Object[] objArr1117 = new Object[1];
                                                        c(bArr112[5], bArr112[7], bArr112[10], objArr1117);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(gidForName7, i1111114, iIndexOf14, 1814927978, false, (String) objArr1117[0], null);
                                                    }
                                                    Object[] objArr1118 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                        char pressedStateDuration7 = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                                                        int iLastIndexOf8 = 2822 - TextUtils.lastIndexOf("", '0', 0);
                                                        int iIndexOf15 = 22 - TextUtils.indexOf("", "", 0);
                                                        byte[] bArr113 = $$d;
                                                        byte b14 = bArr113[7];
                                                        Object[] objArr29 = new Object[1];
                                                        c(b14, bArr113[5], b14, objArr29);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(pressedStateDuration7, iLastIndexOf8, iIndexOf15, -2137287382, false, (String) objArr29[0], new Class[]{Long.TYPE, Method.class});
                                                    }
                                                    ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr1118)).longValue();
                                                    int i12110 = TuitionPaymentFragmentbindingInflater1;
                                                    int i12111 = (i12110 ^ 31) + ((i12110 & 31) << 1);
                                                    b = i12111 % 128;
                                                    int i12112 = i12111 % 2;
                                                    break;
                                                }
                                            } else {
                                                continue;
                                            }
                                        } else if (cls3.equals(objArr2[1])) {
                                            i18 = 24;
                                            c = 0;
                                            char[] cArr13 = new char[i18];
                                            // fill-array-data instruction
                                            cArr13[0] = 4523;
                                            cArr13[1] = 58763;
                                            cArr13[2] = 63969;
                                            cArr13[3] = 52513;
                                            cArr13[4] = 49475;
                                            cArr13[5] = 54650;
                                            cArr13[6] = 43170;
                                            cArr13[7] = 48258;
                                            cArr13[8] = 45310;
                                            cArr13[9] = 33900;
                                            cArr13[10] = 38941;
                                            cArr13[11] = 27773;
                                            cArr13[12] = 25507;
                                            cArr13[13] = 30594;
                                            cArr13[14] = 19454;
                                            cArr13[15] = 24359;
                                            cArr13[16] = 21253;
                                            cArr13[17] = 10036;
                                            cArr13[18] = 14986;
                                            cArr13[19] = 3733;
                                            cArr13[20] = 745;
                                            cArr13[21] = 5678;
                                            cArr13[22] = 59932;
                                            cArr13[23] = 65144;
                                            objArr3 = new Object[1];
                                            d(cArr13, 62506 - Process.getGidForName(""), objArr3);
                                            if (Class.forName((String) objArr3[c]).equals(objArr2[1])) {
                                                int i1111115 = b;
                                                int i1111116 = (i1111115 ^ 75) + ((i1111115 & 75) << 1);
                                                TuitionPaymentFragmentbindingInflater1 = i1111116 % 128;
                                                int i1111117 = i1111116 % 2;
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                    char scrollBarFadeDuration8 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                    int i1111118 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2822;
                                                    int iAxisFromString8 = 21 - MotionEvent.axisFromString("");
                                                    byte[] bArr114 = $$d;
                                                    Object[] objArr1119 = new Object[1];
                                                    c(bArr114[5], bArr114[7], bArr114[10], objArr1119);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarFadeDuration8, i1111118, iAxisFromString8, 1814927978, false, (String) objArr1119[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method2);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                    char gidForName8 = (char) ((-1) - Process.getGidForName(""));
                                                    int i1111119 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2822;
                                                    int iIndexOf16 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 23;
                                                    byte[] bArr115 = $$d;
                                                    Object[] objArr11110 = new Object[1];
                                                    c(bArr115[5], bArr115[7], bArr115[10], objArr11110);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(gidForName8, i1111119, iIndexOf16, 1814927978, false, (String) objArr11110[0], null);
                                                }
                                                Object[] objArr11111 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    char pressedStateDuration8 = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                                                    int iLastIndexOf9 = 2822 - TextUtils.lastIndexOf("", '0', 0);
                                                    int iIndexOf17 = 22 - TextUtils.indexOf("", "", 0);
                                                    byte[] bArr116 = $$d;
                                                    byte b15 = bArr116[7];
                                                    Object[] objArr210 = new Object[1];
                                                    c(b15, bArr116[5], b15, objArr210);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(pressedStateDuration8, iLastIndexOf9, iIndexOf17, -2137287382, false, (String) objArr210[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr11111)).longValue();
                                                int i12113 = TuitionPaymentFragmentbindingInflater1;
                                                int i12114 = (i12113 ^ 31) + ((i12113 & 31) << 1);
                                                b = i12114 % 128;
                                                int i12115 = i12114 % 2;
                                                break;
                                            }
                                        } else {
                                            continue;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    i30 = ((i30 | 1) << 1) - (i30 ^ 1);
                    i19 = 2;
                    i21 = 0;
                    clsArr = null;
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
            char c2 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int iGreen = Color.green(0) + 2823;
            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 22;
            byte[] bArr20 = $$d;
            Object[] objArr30 = new Object[1];
            c(bArr20[5], bArr20[7], bArr20[10], objArr30);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, iGreen, iResolveSizeAndState, 1814927978, false, (String) objArr30[0], null);
        }
        Object[] objArr31 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
            int i130 = 2823 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int iLastIndexOf10 = TextUtils.lastIndexOf("", '0') + 23;
            byte[] bArr21 = $$d;
            byte b16 = bArr21[7];
            byte b17 = bArr21[5];
            Object[] objArr32 = new Object[1];
            c(b16, b17, (byte) (b17 + 4), objArr32);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionChild, i130, iLastIndexOf10, 1025296417, false, (String) objArr32[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr31);
        Object[] objArr33 = {0, methodArr, null};
        int i131 = 0;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 37657);
            int mirror = AndroidCharacter.getMirror('0') + 2672;
            int offsetAfter = 19 - TextUtils.getOffsetAfter("", 0);
            byte[] bArr22 = $$d;
            byte b18 = bArr22[7];
            byte b19 = bArr22[5];
            Object[] objArr34 = new Object[1];
            c(b18, b19, (byte) (b19 + 4), objArr34);
            i131 = 0;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(deadChar, mirror, offsetAfter, -1568796068, false, (String) objArr34[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr33)).longValue();
        long j = -1787445422;
        long j2 = 530;
        long j3 = ((long) 1058) + (j2 * j) + (j2 * jLongValue);
        long j4 = 529;
        long jMaxMemory = (int) Runtime.getRuntime().maxMemory();
        long j5 = -1;
        long j6 = j3 + (((((jMaxMemory ^ j5) | j) ^ j5) | ((j | jLongValue) ^ j5)) * j4) + (j4 * ((jLongValue ^ j5) | ((j | jMaxMemory) ^ j5))) + ((long) (-22960423));
        int i132 = b;
        int i133 = ((i132 | 117) << 1) - (i132 ^ 117);
        TuitionPaymentFragmentbindingInflater1 = i133 % 128;
        int i134 = i133 % 2;
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i135 = ~startElapsedRealtime;
        int i136 = ((int) (j6 >> 32)) & ((-1453938172) + (((~(1961715007 | i135)) | (-896025878)) * 519) + (((~(i135 | (-16777217))) | (~((-879248662) | startElapsedRealtime))) * (-519)) + (((~(startElapsedRealtime | (-896025878))) | (-1961715008)) * 519));
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        int i137 = i136 | (((int) j6) & ((((-384374209) + (((~((~startUptimeMillis) | 1789811832)) | 352322182) * 446)) + (((~(startUptimeMillis | 2142134014)) | 263240) * 446)) - 1778096780));
        int i138 = i137 >>> 24;
        int i139 = i137 & ViewCompat.MEASURED_SIZE_MASK;
        int i140 = TuitionPaymentFragmentbindingInflater1;
        if (i138 != 0) {
            int i141 = (i140 & 7) + (i140 | 7);
            int i142 = i141 % 128;
            b = i142;
            int i143 = i141 % 2;
            int i144 = ((i142 | 117) << 1) - (i142 ^ 117);
            TuitionPaymentFragmentbindingInflater1 = i144 % 128;
            int i145 = i144 % 2;
            i2 = 1;
            i = 2;
        } else {
            int i146 = (i140 ^ 49) + ((i140 & 49) << 1);
            b = i146 % 128;
            i = 2;
            int i147 = i146 % 2;
            i2 = i131;
        }
        if (i2 != 0) {
            int i148 = TuitionPaymentFragmentbindingInflater1 + 53;
            b = i148 % 128;
            int i149 = i148 % i;
            i3 = 1;
        } else {
            i3 = i131;
        }
        if ((i2 ^ 1) != 0) {
            string = null;
        } else {
            int i150 = b;
            int i151 = i150 + 21;
            TuitionPaymentFragmentbindingInflater1 = i151 % 128;
            int i152 = i151 % 2;
            if (i139 >= 2 || (method = methodArr[i139]) == null) {
                string = null;
            } else {
                int i153 = (i150 & 5) + (i150 | 5);
                TuitionPaymentFragmentbindingInflater1 = i153 % 128;
                if (i153 % 2 != 0) {
                    method.toString();
                    throw null;
                }
                string = method.toString();
            }
        }
        list.add(string);
        int i154 = TuitionPaymentFragmentbindingInflater1;
        int i155 = (i154 ^ 57) + ((i154 & 57) << 1);
        b = i155 % 128;
        int i156 = i155 % 2;
        int iB5 = attachPreviewSurface.b();
        int i157 = i156 == 0 ? -745 : -4506;
        int i158 = (-751) * i138;
        int i159 = (i157 & i158) + (i157 | i158);
        int i160 = ~i138;
        int i161 = ~((i160 & (-7)) | ((-7) ^ i160));
        int i162 = ~(((-7) ^ iB5) | ((-7) & iB5));
        int i163 = ((i161 & i162) | (i161 ^ i162)) * 1504;
        int i164 = (i159 ^ i163) + ((i163 & i159) << 1);
        int i165 = TuitionPaymentFragmentbindingInflater1;
        int i166 = ((i165 | 75) << 1) - (i165 ^ 75);
        b = i166 % 128;
        int i167 = i166 % 2;
        int i168 = ((-7) & i138) | ((-7) ^ i138);
        int i169 = (-1504) * (~((iB5 & i168) | (i168 ^ iB5)));
        int i170 = (i164 ^ i169) + ((i169 & i164) << 1);
        int i171 = (i165 & 111) + (i165 | 111);
        b = i171 % 128;
        int i172 = i171 % 2;
        int i173 = ~(((-7) ^ i138) | ((-7) & i138));
        int i174 = ~((~i138) | 6);
        return ((i170 - (~(((i173 & i174) | (i173 ^ i174)) * 752))) - 1) * i3;
    }
}
