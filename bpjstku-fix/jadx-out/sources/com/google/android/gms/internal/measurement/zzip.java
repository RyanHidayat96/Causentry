package com.google.android.gms.internal.measurement;

import android.graphics.Color;
import android.graphics.ImageFormat;
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
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.work.WorkInfo;
import defpackage.ZExternalSyntheticLambda1;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes3.dex */
public final class zzip {
    private static final byte[] $$c = {106, -22, 107, 95};
    private static final int $$f = 74;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {118, 35, -100, -35, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$e = 45;
    private static final byte[] $$a = {6, -86, -9, -124, -15, 8, -16, 1, 4, 3, 52, -55, -14, -1, -8, 13, -11, -8, 68, -68, 1, Base64.padSymbol, -36, -19, -4, -10, 8, -8, 0, 22, -22, -15, 11, -8, 0, -15, 0, -17, 34, -19, -4, -10, 8, -8, 0, 26, -39, 6, -11};
    private static final int $$b = 138;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int d = 1;
    private static char[] b = {47293, 47238, 47281, 47225, 47291, 47289, 47232, 47285, 47234, 47233, 47236, 47283, 47258, 47295, 47288, 47235, 47294, 47284, 47257, 47253, 47282, 47251, 47278, 47287, 47255, 47290};
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2047719463;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
    private static boolean TuitionPaymentFragmentbindingInflater1 = true;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.google.android.gms.internal.measurement.zzip.$$a
            int r9 = r9 * 6
            int r9 = r9 + 97
            int r8 = r8 * 32
            int r8 = r8 + 4
            int r7 = r7 * 19
            int r7 = r7 + 14
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r9 = r8
            r5 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r6
        L2c:
            int r3 = -r3
            int r8 = r8 + r3
            int r8 = r8 + (-2)
            int r9 = r9 + 1
            r3 = r5
            r6 = r9
            r9 = r8
            r8 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzip.a(short, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.google.android.gms.internal.measurement.zzip.$$d
            int r9 = 103 - r9
            int r7 = r7 * 52
            int r7 = r7 + 4
            int r8 = r8 * 52
            int r8 = 53 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r9 = r7
            r3 = r8
            r5 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r6
        L2a:
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            int r9 = r9 + 1
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzip.c(int, int, byte, java.lang.Object[]):void");
    }

    private static void e(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr2;
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr3 = b;
        if (cArr3 != null) {
            int i3 = $10 + 73;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i4])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 1;
                        byte b3 = (byte) (b2 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (View.combineMeasuredStates(0, 0) + 31339), 2993 - ImageFormat.getBitsPerPixel(0), (ViewConfiguration.getPressedStateDuration() >> 16) + 17, 1182129903, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr2[i4] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        long j = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43324 - MotionEvent.axisFromString("")), 252 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
        int i5 = 33602;
        if (TuitionPaymentFragmentbindingInflater1) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i6 = $11 + 91;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 << 1) * getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] % i] % iIntValue);
                    Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (33602 - ExpandableListView.getPackedPositionGroup(j)), (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)) + 3084, 26 - TextUtils.getOffsetAfter("", 0), -2146875848, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } else {
                    cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                    Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 33602), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 3086, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 26, -2146875848, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
                j = 0;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i7 = $10 + 15;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 + 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] >> i] << iIntValue);
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >>>= 1;
                } else {
                    cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                }
            }
            objArr[0] = new String(cArr5);
            return;
        }
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
            cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
            Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (i5 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3085, 27 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -2146875848, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            i5 = 33602;
        }
        objArr[0] = new String(cArr6);
        int i8 = $11 + 55;
        $10 = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    public static int zza(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = i3 + 27;
        int i5 = i4 % 128;
        d = i5;
        Object obj = null;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            int i6 = i3 + 107;
            d = i6 % 128;
            if (i6 % 2 != 0) {
                return 3;
            }
            obj.hashCode();
            throw null;
        }
        int i7 = i5 + 35;
        int i8 = i7 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8;
        if (i7 % 2 == 0 ? i == 3 : i == 5) {
            return 4;
        }
        int i9 = i8 + 77;
        d = i9 % 128;
        int i10 = i9 % 2;
        if (i != 4) {
            return i != 5 ? 0 : 6;
        }
        return 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v39, types: [char[], int[], java.lang.Class[], java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v55 */
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1(List list) throws Throwable {
        int i;
        int i2;
        int i3;
        int i4;
        String string;
        int i5;
        Method method;
        int i6;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        char c;
        String str;
        int i13;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i14;
        int i15;
        int i16;
        Class<?>[] clsArr;
        String str2;
        Object obj;
        int i17 = 2;
        int i18 = 2 % 2;
        int i19 = d + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i19 % 128;
        int i20 = i19 % 2;
        byte[] bArr = $$a;
        byte b2 = bArr[7];
        byte b3 = bArr[28];
        Object[] objArr = new Object[1];
        a(b2, b3, b3, objArr);
        int i21 = 0;
        Class<?> cls = Class.forName((String) objArr[0]);
        byte b4 = bArr[28];
        byte b5 = bArr[7];
        Object[] objArr2 = new Object[1];
        a(b4, b5, b5, objArr2);
        Method method2 = cls.getMethod((String) objArr2[0], String.class, Integer.TYPE);
        Class<?> cls2 = Class.forName("android.app.ApplicationPackageManager");
        byte b6 = bArr[28];
        byte b7 = bArr[7];
        Object[] objArr3 = new Object[1];
        a(b6, b7, b7, objArr3);
        Method[] methodArr = {method2, cls2.getMethod((String) objArr3[0], String.class, Integer.TYPE)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
            int mode = View.MeasureSpec.getMode(0) + 2823;
            int trimmedLength = TextUtils.getTrimmedLength("") + 22;
            byte[] bArr2 = $$d;
            byte b8 = bArr2[7];
            Object[] objArr4 = new Object[1];
            c(b8, b8, bArr2[54], objArr4);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cNormalizeMetaState, mode, trimmedLength, 1814927978, false, (String) objArr4[0], null);
        }
        ?? r7 = 0;
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) == null) {
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) TextUtils.getOffsetAfter("", 0), (KeyEvent.getMaxKeyCode() >> 16) + 2823, 22 - (ViewConfiguration.getFadingEdgeLength() >> 16))).getDeclaredMethods();
            int length = declaredMethods.length;
            int i22 = 0;
            while (i22 < length) {
                int i23 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i24 = (i23 & 103) + (i23 | 103);
                d = i24 % 128;
                int i25 = i24 % i17;
                Method method3 = declaredMethods[i22];
                int i26 = (i23 & 19) + (i23 | 19);
                d = i26 % 128;
                if (i26 % i17 == 0) {
                    try {
                        i6 = -(SystemClock.elapsedRealtimeNanos() > 1L ? 1 : (SystemClock.elapsedRealtimeNanos() == 1L ? 0 : -1));
                        iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        i7 = (284 >> i6) % (-17558);
                        i8 = ~i6;
                        i9 = 17276;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } else {
                    i6 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i27 = i6 * 284;
                    i7 = (i27 ^ (-36096)) + ((i27 & (-36096)) << 1);
                    i8 = ~i6;
                    i9 = 128;
                }
                int i28 = ~(i8 | i9);
                int i29 = ~i6;
                int i30 = ~((i29 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i29 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                int i31 = -(-((-283) * ((i28 ^ i30) | (i28 & i30))));
                int i32 = (i7 ^ i31) + ((i7 & i31) << 1) + ((~((~i9) | i6)) * 283);
                int i33 = ~i6;
                int i34 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 103;
                d = i34 % 128;
                int i35 = i34 % i17;
                int i36 = ~i9;
                int i37 = (i33 & i36) | (i33 ^ i36);
                int i38 = 283 * (~((i37 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i37 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1)));
                Object[] objArr5 = new Object[1];
                e(r7, r7, (i32 & i38) + (i38 | i32), new byte[]{-112, -113, -114, -116, -119, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr5);
                Class<?> cls3 = Class.forName((String) objArr5[i21]);
                int i39 = -(-Drawable.resolveOpacity(i21, i21));
                Object[] objArr6 = new Object[1];
                e(r7, r7, ((i39 | 127) << 1) - (i39 ^ 127), new byte[]{-110, -120, -119, -111, -118, -111, -112, -113, -115, -116, -119, -121}, objArr6);
                Object[] objArr7 = new Object[1];
                objArr7[i21] = Integer.valueOf(((Integer) cls3.getMethod((String) objArr6[i21], r7).invoke(method3, r7)).intValue());
                int i40 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                Object[] objArr8 = new Object[1];
                e(r7, r7, (i40 ^ 128) + ((i40 & 128) << 1), new byte[]{-120, -119, -111, -118, -111, -112, -113, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr8);
                String str3 = (String) objArr8[i21];
                int i41 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 25;
                d = i41 % 128;
                int i42 = i41 % i17;
                Class<?> cls4 = Class.forName(str3);
                int i43 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i44 = i43 * TypedValues.PositionType.TYPE_PERCENT_WIDTH;
                int i45 = (i44 ^ 63378) + ((i44 & 63378) << 1);
                int i46 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i47 = (i46 & 29) + (i46 | 29);
                d = i47 % 128;
                if (i47 % i17 == 0) {
                    int i48 = -((-502) / ((i43 ^ 126) | (i43 & 126)));
                    i10 = (i45 ^ i48) + ((i45 & i48) << 1);
                    int i49 = ~i43;
                    int i50 = ~((i49 ^ ComposerKt.defaultsKey) | (i49 & ComposerKt.defaultsKey));
                    int i51 = ~i43;
                    int i52 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i53 = ~((i51 ^ i52) | (i52 & i51));
                    i11 = (i53 & i50) | (i50 ^ i53);
                    int i54 = i43 | 126;
                    i12 = (i54 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i54 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                } else {
                    int i55 = -(-(((i43 ^ 126) | (i43 & 126)) * (-502)));
                    i10 = (i45 & i55) + (i45 | i55);
                    int i56 = ~i43;
                    int i57 = ~((i56 & ComposerKt.defaultsKey) | (i56 ^ ComposerKt.defaultsKey));
                    int i58 = ~i43;
                    int i59 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    i11 = i57 | (~((i58 ^ i59) | (i58 & i59)));
                    i12 = i43 | 126 | iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                }
                int i60 = ((i46 | 107) << 1) - (i46 ^ 107);
                d = i60 % 128;
                if (i60 % 2 == 0) {
                    int i61 = i12 ^ (-1);
                    int i62 = i10 >> ((-502) - ((i11 & i61) | (i11 ^ i61)));
                    int i63 = ~i43;
                    int i64 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i65 = (i63 & i64) | (i63 ^ i64);
                    int i66 = ~((i65 & 126) | (i65 ^ 126));
                    int i67 = (i43 ^ 126) | (i43 & 126);
                    int i68 = ~((i67 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i67 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                    int i69 = -(-((i66 & i68) | (i66 ^ i68)));
                    Object[] objArr9 = new Object[1];
                    e(null, null, i62 * ((i69 & TypedValues.PositionType.TYPE_DRAWPATH) + (i69 | TypedValues.PositionType.TYPE_DRAWPATH)), new byte[]{-119, -125, -111, -116, -126, -109, -110, -111}, objArr9);
                    str = (String) objArr9[0];
                    c = 0;
                } else {
                    int i70 = ~i12;
                    int i71 = -(-((-502) * ((i11 & i70) | (i11 ^ i70))));
                    int i72 = (i10 & i71) + (i71 | i10);
                    int i73 = ~i43;
                    int i74 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i75 = ~((i73 & i74) | (i73 ^ i74) | 126);
                    int i76 = (i43 ^ 126) | (i43 & 126);
                    int i77 = ~((i76 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i76 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                    int i78 = i75 ^ i77;
                    Object[] objArr10 = new Object[1];
                    e(null, null, i72 + (((i75 & i77) | i78) * TypedValues.PositionType.TYPE_DRAWPATH), new byte[]{-119, -125, -111, -116, -126, -109, -110, -111}, objArr10);
                    c = 0;
                    str = (String) objArr10[0];
                }
                Class<?>[] clsArr2 = new Class[1];
                clsArr2[c] = Integer.TYPE;
                if (((Boolean) cls4.getMethod(str, clsArr2).invoke(null, objArr7)).booleanValue()) {
                    Class cls5 = Long.TYPE;
                    int bitsPerPixel = ImageFormat.getBitsPerPixel(0);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i79 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 45;
                    int i80 = i79 % 128;
                    d = i80;
                    int i81 = i79 % 2;
                    int i82 = ((-1335) * bitsPerPixel) - 85376;
                    int i83 = ~(bitsPerPixel | iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                    int i84 = ((i83 & (-129)) | ((-129) ^ i83)) * (-668);
                    int i85 = ((i80 | 115) << 1) - (i80 ^ 115);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i85 % 128;
                    if (i85 % 2 != 0) {
                        int i86 = -i84;
                        int i87 = ((i82 | i86) << 1) - (i82 ^ i86);
                        int i88 = ~((-129) | iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                        int i89 = -((i88 & bitsPerPixel) | (bitsPerPixel ^ i88));
                        i13 = i87 / (((i89 | 1336) << 1) - (i89 ^ 1336));
                    } else {
                        int i90 = i82 + i84;
                        int i91 = -(-(((~(((-129) & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | ((-129) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4))) | bitsPerPixel) * 1336));
                        i13 = (i90 ^ i91) + ((i90 & i91) << 1);
                    }
                    int i92 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault4 & bitsPerPixel) | (bitsPerPixel ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                    Object[] objArr11 = new Object[1];
                    e(null, null, (i13 - (~(668 * ((i92 & (-129)) | (i92 ^ (-129)))))) - 1, new byte[]{-112, -113, -114, -116, -119, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr11);
                    Class<?> cls6 = Class.forName((String) objArr11[0]);
                    int offsetAfter = TextUtils.getOffsetAfter("", 0);
                    int i93 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i94 = ((i93 | 35) << 1) - (i93 ^ 35);
                    d = i94 % 128;
                    if (i94 % 2 == 0) {
                        iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        i14 = ((-947) - offsetAfter) << 7;
                    } else {
                        iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i95 = offsetAfter * (-947);
                        i14 = (i95 | 120523) + (i95 & 120523);
                    }
                    int i96 = d;
                    int i97 = (i96 ^ 5) + ((i96 & 5) << 1);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i97 % 128;
                    if (i97 % 2 != 0) {
                        i15 = ~offsetAfter;
                        int i98 = ~((-128) | iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        i16 = i14 % ((-948) / ((i98 & i15) | (i15 ^ i98)));
                    } else {
                        i15 = ~offsetAfter;
                        i16 = (i14 - (~((-948) * ((~((-128) | iTuitionPaymentFragmentspecialinlinedviewModeldefault2)) | i15)))) - 1;
                    }
                    int i99 = (i15 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i15 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT);
                    int i100 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i101 = -(-((-948) * (~((i100 & i99) | (i99 ^ i100)))));
                    int i102 = ((i16 | i101) << 1) - (i101 ^ i16);
                    int i103 = -(-(((offsetAfter ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (offsetAfter & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT)) * 948));
                    Object[] objArr12 = new Object[1];
                    e(null, null, (i102 & i103) + (i103 | i102), new byte[]{-119, -104, -105, -106, -122, -120, -107, -116, -119, -108, -116, -119, -121}, objArr12);
                    String str4 = (String) objArr12[0];
                    int i104 = d + 49;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i104 % 128;
                    int i105 = i104 % 2;
                    if (!(!cls5.equals(cls6.getMethod(str4, null).invoke(method3, null)))) {
                        int i106 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        Object[] objArr13 = new Object[1];
                        e(null, null, ((i106 | 127) << 1) - (i106 ^ 127), new byte[]{-112, -113, -114, -116, -119, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr13);
                        Class<?> cls7 = Class.forName((String) objArr13[0]);
                        int i107 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 75;
                        d = i107 % 128;
                        if (i107 % 2 == 0) {
                            Object[] objArr14 = new Object[1];
                            e(null, null, 128 - (Process.getElapsedCpuTime() > 1L ? 1 : (Process.getElapsedCpuTime() == 1L ? 0 : -1)), new byte[]{-110, -119, -104, -105, -106, -120, -119, -116, -119, -102, -126, -120, -126, -103, -116, -119, -121}, objArr14);
                            str2 = (String) objArr14[0];
                            clsArr = null;
                        } else {
                            Object[] objArr15 = new Object[1];
                            clsArr = null;
                            e(null, null, 128 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), new byte[]{-110, -119, -104, -105, -106, -120, -119, -116, -119, -102, -126, -120, -126, -103, -116, -119, -121}, objArr15);
                            str2 = (String) objArr15[0];
                        }
                        Object[] objArr16 = (Object[]) cls7.getMethod(str2, clsArr).invoke(method3, clsArr);
                        int i108 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i109 = (i108 & 7) + (i108 | 7);
                        d = i109 % 128;
                        int i110 = i109 % 2;
                        if (objArr16.length == 2) {
                            int i111 = (i108 & 59) + (i108 | 59);
                            d = i111 % 128;
                            int i112 = i111 % 2;
                            if (Long.TYPE.equals(objArr16[0])) {
                                int i113 = d + 71;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i113 % 128;
                                if (i113 % 2 != 0) {
                                    int keyRepeatTimeout = ViewConfiguration.getKeyRepeatTimeout() % 23;
                                    Object[] objArr17 = new Object[1];
                                    e(null, null, ((keyRepeatTimeout | 66) << 1) - (keyRepeatTimeout ^ 66), new byte[]{-112, -113, -114, -116, -119, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr17);
                                    obj = objArr17[0];
                                } else {
                                    int keyRepeatTimeout2 = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                                    Object[] objArr18 = new Object[1];
                                    e(null, null, ((keyRepeatTimeout2 | 127) << 1) - (keyRepeatTimeout2 ^ 127), new byte[]{-112, -113, -114, -116, -119, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr18);
                                    obj = objArr18[0];
                                }
                                if (Class.forName((String) obj).equals(objArr16[1])) {
                                    int i114 = d;
                                    int i115 = (i114 & 15) + (i114 | 15);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i115 % 128;
                                    int i116 = i115 % 2;
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char cMyTid = (char) (Process.myTid() >> 22);
                                        int packedPositionType = 2823 - ExpandableListView.getPackedPositionType(0L);
                                        int i117 = 23 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                        byte[] bArr3 = $$d;
                                        byte b9 = bArr3[7];
                                        Object[] objArr19 = new Object[1];
                                        c(b9, b9, bArr3[54], objArr19);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyTid, packedPositionType, i117, 1814927978, false, (String) objArr19[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method3);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                                        int keyRepeatTimeout3 = 2823 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                        int gidForName = 21 - Process.getGidForName("");
                                        byte[] bArr4 = $$d;
                                        byte b10 = bArr4[7];
                                        Object[] objArr20 = new Object[1];
                                        c(b10, b10, bArr4[54], objArr20);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, keyRepeatTimeout3, gidForName, 1814927978, false, (String) objArr20[0], null);
                                    }
                                    try {
                                        Object[] objArr21 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                            char c2 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
                                            int packedPositionChild = 2822 - ExpandableListView.getPackedPositionChild(0L);
                                            int iGreen = 22 - Color.green(0);
                                            byte[] bArr5 = $$d;
                                            byte b11 = (byte) (-bArr5[5]);
                                            Object[] objArr22 = new Object[1];
                                            c(b11, b11, bArr5[7], objArr22);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, packedPositionChild, iGreen, -2137287382, false, (String) objArr22[0], new Class[]{Long.TYPE, Method.class});
                                        }
                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr21)).longValue();
                                        int i118 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                        int i119 = ((i118 | 43) << 1) - (i118 ^ 43);
                                        d = i119 % 128;
                                        int i120 = i119 % 2;
                                        break;
                                    } catch (Throwable th2) {
                                        Throwable cause2 = th2.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                        throw th2;
                                    }
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
                i22 = (((i22 | 34) << 1) - (i22 ^ 34)) - 33;
                i17 = 2;
                i21 = 0;
                r7 = 0;
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
            int i121 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2823;
            int iLastIndexOf = 21 - TextUtils.lastIndexOf("", '0', 0);
            byte[] bArr6 = $$d;
            byte b12 = bArr6[7];
            Object[] objArr23 = new Object[1];
            c(b12, b12, bArr6[54], objArr23);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(touchSlop, i121, iLastIndexOf, 1814927978, false, (String) objArr23[0], null);
        }
        Object[] objArr24 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char cMyPid = (char) (Process.myPid() >> 22);
            int capsMode = 2823 - TextUtils.getCapsMode("", 0, 0);
            int i122 = 22 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            byte b13 = (byte) (-$$d[5]);
            byte b14 = b13;
            Object[] objArr25 = new Object[1];
            c(b13, b14, (byte) (b14 + 4), objArr25);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMyPid, capsMode, i122, 1025296417, false, (String) objArr25[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr24);
        Object[] objArr26 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char touchSlop2 = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 37657);
            int keyRepeatTimeout4 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2720;
            int pressedStateDuration = 19 - (ViewConfiguration.getPressedStateDuration() >> 16);
            byte b15 = (byte) (-$$d[5]);
            byte b16 = b15;
            Object[] objArr27 = new Object[1];
            c(b15, b16, (byte) (b16 + 4), objArr27);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(touchSlop2, keyRepeatTimeout4, pressedStateDuration, -1568796068, false, (String) objArr27[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr26)).longValue();
        long j = -47435314;
        long j2 = -721;
        long jMyPid = Process.myPid();
        long j3 = -1;
        long j4 = j ^ j3;
        long j5 = jLongValue ^ j3;
        long j6 = (j | jLongValue) ^ j3;
        long j7 = (j2 * j) + (j2 * jLongValue) + (((long) 1444) * ((jMyPid ^ j3) | ((j4 | j5) ^ j3) | j6)) + (((long) (-1444)) * (((jMyPid | jLongValue) ^ j3) | j6 | ((j | jMyPid) ^ j3))) + (((long) 722) * (((j4 | jLongValue) ^ j3) | ((j5 | j) ^ j3))) + ((long) (-1762970531));
        int i123 = d + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i123 % 128;
        if (i123 % 2 != 0) {
            int iMyPid = Process.myPid();
            i = ((int) (j7 << 108)) & ((((-818884594) + (((~iMyPid) | 1647122097) * 1324)) + (((~(iMyPid | (-209903951))) | (~(1647130361 | iMyPid))) * (-1324))) - 985126352);
            int iMyUid = Process.myUid();
            int i124 = ~iMyUid;
            i2 = ((int) j7) & ((-501357939) + (((~(1316318619 | i124)) | (-1333128608)) * 168) + ((~(1333128607 | iMyUid)) * 168) + (((~(iMyUid | (-16809989))) | (~(i124 | 120907790)) | 1212220817) * 168));
        } else {
            int iMyTid = Process.myTid();
            int i125 = ~iMyTid;
            i = ((int) (j7 >> 32)) & ((((((~(1790537622 | i125)) | (~(1067203262 | iMyTid))) | (~(i125 | (-1067203263)))) * 959) - 594811414) + (((~(iMyTid | (-1067203263))) | (~(i125 | 1067203262)) | (~(1790537622 | iMyTid))) * 959));
            int iMyUid2 = Process.myUid();
            i2 = ((int) j7) & (((((~(260800812 | iMyUid2)) | 1075074129) * (-283)) - 2133925920) + ((~(iMyUid2 | 1335874941)) * 283));
        }
        int i126 = (i & i2) | (i ^ i2);
        int i127 = i126 >>> 24;
        int i128 = i126 & ViewCompat.MEASURED_SIZE_MASK;
        if (i127 != 0) {
            int i129 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 61;
            d = i129 % 128;
            i3 = 2;
            int i130 = i129 % 2;
            i4 = 1;
        } else {
            i3 = 2;
            i4 = 0;
        }
        if (i4 == 0 || i128 >= i3 || (method = methodArr[i128]) == null) {
            string = null;
        } else {
            int i131 = d;
            int i132 = (i131 & 69) + (i131 | 69);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i132 % 128;
            int i133 = i132 % 2;
            string = method.toString();
        }
        list.add(string);
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i134 = i127 * (-520);
        int i135 = (3132 ^ i134) + ((i134 & 3132) << 1);
        int i136 = d + 81;
        int i137 = i136 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i137;
        if (i136 % 2 != 0) {
            int i138 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
            int i139 = ~((i138 & i127) | (i138 ^ i127));
            i5 = i135 >>> (((i139 & 6) | (i139 ^ 6)) * (-1042));
        } else {
            int i140 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
            int i141 = ~((i140 & i127) | (i140 ^ i127));
            int i142 = ((i141 & 6) | (i141 ^ 6)) * (-1042);
            i5 = ((i135 | i142) << 1) - (i142 ^ i135);
        }
        int i143 = -(-((i127 | iTuitionPaymentFragmentspecialinlinedviewModeldefault5) * 521));
        int i144 = (i5 & i143) + (i5 | i143);
        int i145 = i137 + 71;
        int i146 = i145 % 128;
        d = i146;
        if (i145 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i147 = ~((~i127) | (-7));
        int i148 = ~(((-7) & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | ((-7) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
        int i149 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        int i150 = (i149 & 6) | (i149 ^ 6);
        int i151 = -(-(521 * ((~((i150 & i127) | (i150 ^ i127))) | (i147 & i148) | (i147 ^ i148))));
        int i152 = (((i144 | i151) << 1) - (i151 ^ i144)) * i4;
        int i153 = (i146 ^ 47) + ((i146 & 47) << 1);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i153 % 128;
        if (i153 % 2 != 0) {
            int i154 = 85 / 0;
        }
        return i152;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, short r7, short r8) {
        /*
            int r7 = r7 * 2
            int r0 = r7 + 1
            int r8 = r8 * 4
            int r8 = r8 + 4
            byte[] r1 = com.google.android.gms.internal.measurement.zzip.$$c
            int r6 = r6 + 67
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L20:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L28:
            int r8 = -r8
            int r6 = r6 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzip.$$g(int, short, short):java.lang.String");
    }
}
