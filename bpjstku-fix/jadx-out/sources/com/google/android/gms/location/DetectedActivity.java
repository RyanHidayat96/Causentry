package com.google.android.gms.location;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import defpackage.initSession;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public class DetectedActivity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DetectedActivity> CREATOR;
    public static final int IN_VEHICLE = 0;
    public static final int ON_BICYCLE = 1;
    public static final int ON_FOOT = 2;
    public static final int RUNNING = 8;
    public static final int STILL = 3;
    public static final int TILTING = 5;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    public static final int UNKNOWN = 4;
    public static final int WALKING = 7;
    public static final Comparator zza;
    final int zzb;
    final int zzc;
    private static final byte[] $$c = {88, 99, -94, -58};
    private static final int $$f = 56;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {114, -59, 10, 31, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 54, 3, 3, -72, 56, 2, 3, -18, 10, -7, -16, 8, -65, 60, -11, -7, 15, -1, -6, -16, 5, -11, 6, 3, -73, 73, -3, -16, 1, 30, -15, 8, -14, 3, -4, -33, 14, 21, -15, -11, 6, 3, -49, 41, -20, 3, 3, -11, 6, 3, -4, -6, -14, -5, 3, -11, 8, -6, 2, -5, -6, 2, -12, -4, 15, -16, -7, 15, -45, 31, -14, -2, 4, -11, -2, -2, -8, 17, -12, 5, -69};
    private static final int $$e = 25;
    private static final byte[] $$a = {30, 17, -35, 104, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 139;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static int b = 1;

    public DetectedActivity(int i, int i2) {
        this.zzb = i;
        this.zzc = i2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 14
            int r7 = 98 - r7
            int r8 = r8 + 1
            byte[] r0 = com.google.android.gms.location.DetectedActivity.$$a
            int r9 = r9 * 52
            int r9 = 56 - r9
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r9
            r5 = r2
            goto L29
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L24:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L29:
            int r9 = -r9
            int r3 = r3 + 1
            int r7 = r7 + r9
            int r7 = r7 + (-10)
            r9 = r3
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.DetectedActivity.a(short, short, byte, java.lang.Object[]):void");
    }

    private static void d(int i, short s, int i2, Object[] objArr) {
        int i3 = i2 + 4;
        int i4 = 99 - (s * 15);
        byte[] bArr = $$d;
        int i5 = i * 5;
        byte[] bArr2 = new byte[53 - i5];
        int i6 = 52 - i5;
        int i7 = -1;
        if (bArr == null) {
            i4 = i6 + i4 + 3;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i4;
            if (i7 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i3++;
                i4 = i4 + bArr[i3] + 3;
            }
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.zzb;
        if (i3 != 0) {
            return Objects.hashCode(Integer.valueOf(i4), Integer.valueOf(this.zzc));
        }
        int i5 = this.zzc;
        Object[] objArr = new Object[4];
        objArr[1] = Integer.valueOf(i4);
        objArr[0] = Integer.valueOf(i5);
        return Objects.hashCode(objArr);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 9;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 == 0) {
            boolean z = obj instanceof DetectedActivity;
            throw null;
        }
        if (!(obj instanceof DetectedActivity)) {
            return false;
        }
        DetectedActivity detectedActivity = (DetectedActivity) obj;
        if (this.zzb != detectedActivity.zzb) {
            return false;
        }
        int i4 = i2 + 11;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return this.zzc == detectedActivity.zzc;
    }

    private static void c(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
            int i5 = $11 + 53;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i7 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), KeyEvent.keyCodeFromString("") + 3291, 31 - TextUtils.getCapsMode("", 0, 0), 1199271174, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.getOffsetBefore("", 0), 651 - View.MeasureSpec.getMode(0), 44 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -450685997, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    int i8 = $11 + 15;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
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
        }
        if (i3 > 0) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getJumpTapTimeout() >> 16), Color.green(0) + 651, 43 - TextUtils.lastIndexOf("", '0'), -450685997, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    public String toString() throws Throwable {
        String string;
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        int type = getType();
        if (type == 0) {
            string = "IN_VEHICLE";
        } else if (type == 1) {
            string = "ON_BICYCLE";
        } else if (type == 2) {
            string = "ON_FOOT";
        } else if (type == 3) {
            string = "STILL";
        } else if (type != 4) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
            int i3 = i2 % 128;
            TuitionPaymentFragmentbindingInflater1 = i3;
            int i4 = i2 % 2;
            if (type != 5) {
                int i5 = i3 + 21;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
                int i6 = i5 % 2;
                if (type == 7) {
                    string = "WALKING";
                } else if (type == 8) {
                    string = "RUNNING";
                } else if (type != 16) {
                    string = type != 17 ? Integer.toString(type) : "IN_RAIL_VEHICLE";
                } else {
                    int i7 = i3 + 87;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
                    int i8 = i7 % 2;
                    string = "IN_ROAD_VEHICLE";
                }
            } else {
                string = "TILTING";
            }
        } else {
            string = "UNKNOWN";
        }
        int i9 = this.zzc;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 31533);
            int trimmedLength = 921 - TextUtils.getTrimmedLength("");
            int iKeyCodeFromString = 28 - KeyEvent.keyCodeFromString("");
            byte[] bArr = $$a;
            byte b2 = bArr[80];
            Object[] objArr3 = new Object[1];
            a(b2, b2, bArr[7], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarFadeDuration, trimmedLength, iKeyCodeFromString, -1048449946, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(false, 127 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), ImageFormat.getBitsPerPixel(0) + 23, Color.blue(0) + 16, new char[]{1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(false, 131 - (ViewConfiguration.getJumpTapTimeout() >> 16), 15 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 12 - Color.blue(0), new char[]{'\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (31534 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
            int i10 = 922 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 28;
            byte b3 = $$a[7];
            Object[] objArr6 = new Object[1];
            a(b3, (byte) 52, b3, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, i10, scrollBarSize, -778300370, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char absoluteGravity = (char) (Gravity.getAbsoluteGravity(0, 0) + 31533);
                int iBlue = 921 - Color.blue(0);
                int windowTouchSlop = 28 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                byte[] bArr2 = $$a;
                byte b4 = bArr2[7];
                Object[] objArr7 = new Object[1];
                a(b4, (byte) (b4 | 36), bArr2[80], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(absoluteGravity, iBlue, windowTouchSlop, -1142834547, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i11 = 2106421723 + (((~((-1072730942) | iIdentityHashCode)) | 700486428) * 576) + (((~((~iIdentityHashCode) | (-372244514))) | 862274) * 576) + 1831716655;
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArr[0])[0] = i13 ^ (i13 << 5);
            int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
            TuitionPaymentFragmentbindingInflater1 = i14 % 128;
            int i15 = i14 % 2;
        } else {
            Object[] objArr9 = new Object[1];
            c(false, TextUtils.getOffsetAfter("", 0) + 127, 26 - (ViewConfiguration.getTapTimeout() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 15, new char[]{'\r', 65483, 65502, 0, 17, 6, 19, 6, 17, 22, 65521, 5, 15, 2, 65534, 1, 65534, 11, 1, 15, '\f', 6, 1, 65483, 65534, '\r'}, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c(false, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 134, TextUtils.lastIndexOf("", '0', 0, 0) + 19, 16777223 + Color.rgb(0, 0, 0), new char[]{65535, 65529, 65527, '\n', 65535, 5, 4, 65529, 11, '\b', '\b', 65531, 4, '\n', 65495, 6, 6, 2}, objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
                TuitionPaymentFragmentbindingInflater1 = i16 % 128;
                int i17 = i16 % 2;
                applicationContext = (!((applicationContext instanceof ContextWrapper) ^ true) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr11 = new Object[1];
            c(true, TextUtils.getTrimmedLength("") + 126, TextUtils.indexOf((CharSequence) "", '0') + 17, 6 - (ViewConfiguration.getTouchSlop() >> 8), new char[]{'\n', 65484, 65535, 20, 65535, '\b', 11, 3, 18, 17, 23, 65521, 65484, 5, '\f', 65535}, objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            c(false, (ViewConfiguration.getScrollBarSize() >> 8) + 130, (ViewConfiguration.getWindowTouchSlop() >> 8) + 16, TextUtils.indexOf("", "") + 14, new char[]{65535, '\b', 14, 3, 14, 19, 65506, 65531, '\r', 2, 65501, '\t', 65534, 65535, 3, 65534}, objArr12);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue();
            int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 33;
            TuitionPaymentFragmentbindingInflater1 = i18 % 128;
            int i19 = i18 % 2;
            try {
                Object[] objArr13 = {applicationContext, Integer.valueOf(iIntValue), 0, 2078459951};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[50];
                Object[] objArr14 = new Object[1];
                d(b5, (byte) (b5 - 1), bArr3[39], objArr14);
                Class<?> cls4 = Class.forName((String) objArr14[0]);
                byte b6 = bArr3[50];
                Object[] objArr15 = new Object[1];
                d((byte) (b6 - 1), b6, (byte) 46, objArr15);
                objArr = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c2 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 31532);
                    int i20 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 920;
                    int iIndexOf = TextUtils.indexOf("", "") + 28;
                    byte[] bArr4 = $$a;
                    byte b7 = bArr4[7];
                    Object[] objArr16 = new Object[1];
                    a(b7, (byte) (b7 | 36), bArr4[80], objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, i20, iIndexOf, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr17 = new Object[1];
                    c(false, (ViewConfiguration.getLongPressTimeout() >> 16) + 127, TextUtils.getTrimmedLength("") + 22, 16 - (ViewConfiguration.getLongPressTimeout() >> 16), new char[]{1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6}, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    c(false, Color.argb(0, 0, 0, 0) + 131, 15 - TextUtils.getOffsetAfter("", 0), View.getDefaultSize(0, 0) + 12, new char[]{'\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530}, objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 31533);
                        int iIndexOf2 = 920 - TextUtils.indexOf((CharSequence) "", '0');
                        int i21 = 29 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        byte b8 = $$a[7];
                        Object[] objArr19 = new Object[1];
                        a(b8, (byte) 52, b8, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(pressedStateDuration, iIndexOf2, i21, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char longPressTimeout = (char) (31533 - (ViewConfiguration.getLongPressTimeout() >> 16));
                        int iBlue2 = 921 - Color.blue(0);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 28;
                        byte[] bArr5 = $$a;
                        byte b9 = bArr5[80];
                        Object[] objArr20 = new Object[1];
                        a(b9, b9, bArr5[7], objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(longPressTimeout, iBlue2, iMakeMeasureSpec, -1048449946, false, (String) objArr20[0], null);
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
        int i22 = ((int[]) objArr[1])[0];
        int i23 = ((int[]) objArr[3])[0];
        if (i23 == i22) {
            int i24 = TuitionPaymentFragmentbindingInflater1 + 3;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i24 % 128;
            int i25 = i24 % 2;
            int i26 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i27 = ~iIdentityHashCode2;
            int i28 = i26 + 2137526735 + ((iIdentityHashCode2 | 8458496) * 988) + (((~(42049472 | i27)) | 1698439195) * (-1976)) + (((~(iIdentityHashCode2 | (-1732030172))) | 8458496 | (~(1732030171 | i27))) * 988);
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr2[0])[0] = i30 ^ (i30 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i31 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
                TuitionPaymentFragmentbindingInflater1 = i31 % 128;
                int i32 = i31 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i23 / (((i23 - 1) * i23) % 2), 0).show();
            int i33 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i34 = i33 + 2106421723 + (((~((-1593230105) | startElapsedRealtime)) | 180781824) * 576) + (((~((~startElapsedRealtime) | (-1412448281))) | 67715) * 576) + 1051115520;
            int i35 = (i34 << 13) ^ i34;
            int i36 = i35 ^ (i35 >>> 17);
            ((int[]) objArr2[0])[0] = i36 ^ (i36 << 5);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 36 + String.valueOf(i9).length() + 1);
        sb.append("DetectedActivity [type=");
        sb.append(string);
        int i37 = ((int[]) objArr2[0])[0];
        int i38 = i37 * i37;
        int i39 = -(1015547507 * i37);
        int i40 = (((i38 ^ i39) + ((i38 & i39) << 1)) - (~(-(i37 * (-2032739615))))) - 1;
        int i41 = ((i40 | 234959076) << 1) - (234959076 ^ i40);
        int i42 = ((i41 >> 27) - 63) / 32;
        int i43 = ((i42 | 1) << 1) - (i42 ^ 1);
        int i44 = (i41 & i43) + (i43 | i41);
        int i45 = ((i41 >> 25) - 255) / 128;
        int i46 = -(i44 ^ ((i45 & 1) + (i45 | 1)));
        int i47 = ((i46 | 6) << 1) - (i46 ^ 6);
        int i48 = i47 >> 15;
        int i49 = (((-262143) ^ i48) + ((i48 & (-262143)) << 1)) / 131072;
        int i50 = (i49 & 1) + (i49 | 1);
        sb.append("0\\21\\13\\2\\15\\, confidence=".substring(139386 / (((-((i50 & 1) + (i50 | 1))) & i47) * 1787)));
        sb.append(i9);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        Preconditions.checkNotNull(parcel);
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzb);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 84 / 0;
        }
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        TuitionPaymentFragmentbindingInflater1();
        zza = new zzk();
        CREATOR = new zzl();
        int i = b + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public int getConfidence() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        int i5 = this.zzc;
        int i6 = i3 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public int getType() {
        int i = 2 % 2;
        int i2 = this.zzb;
        if (i2 > 22 || i2 < 0) {
            return 4;
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i4 = i3 + 59;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 10 / 0;
        }
        int i6 = i3 + 123;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        if (i6 % 2 != 0) {
            return i2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -83722370;
    }

    private static String $$g(byte b2, short s, int i) {
        int i2 = s * 4;
        int i3 = (b2 * 2) + 4;
        int i4 = 120 - i;
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        int i6 = -1;
        if (bArr == null) {
            i3++;
            i4 = i3 + (-i4);
        }
        while (true) {
            int i7 = i4;
            int i8 = i3;
            i6++;
            bArr2[i6] = (byte) i7;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i3 = i8 + 1;
            i4 = i7 + (-bArr[i8]);
        }
    }
}
