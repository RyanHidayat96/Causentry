package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.io.encoding.Base64;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes5.dex */
public final class zzgn {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static long b;
    protected static final AtomicReference zza;
    protected static final AtomicReference zzb;
    protected static final AtomicReference zzc;
    private final zzgm zzd;
    private static final byte[] $$d = {109, 48, -62, 38, -14, 0, Base64.padSymbol, -59, -10, -2, 6, -7, 5, 53, -53, -15, 8, -16, 1, 4, 3, 52, -65, 10, -21, 13, -15, 7, 6, -13, 60, -61, -7, -8, 13, -15, 2, 11, -13, 60, -38, -21, -19, 15, -15, -3, 16, -3, -12, 5, 34, -47, 3, -6, 10, -21, 13, -1, 12, -13, -13, -11, 14, 26, -39, -8, 13, -15, 0, -1, 1, 9, -21, 3, -5, -35, 10, -13, 9, -8, -1, 28, -19, -26, 10, 6, -11, -8, 44, -46, 15, -8, -8, 6, -11, -8, -1, 1, 9, 0, -8, 6, -13, 1, -7, 0, 1, -7, 7, -1, -20, 11, 2, -20, 40, -36, 9, -3, -9, 6, -3, -3, 3, -22, 7, -10, 65};
    private static final int $$e = 167;
    private static final byte[] $$a = {89, 92, -72, 43, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 231;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        zza = new AtomicReference();
        zzb = new AtomicReference();
        zzc = new AtomicReference();
        int i = TuitionPaymentFragmentbindingInflater1 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 4
            int r8 = 84 - r8
            int r6 = r6 * 52
            int r6 = 107 - r6
            byte[] r0 = com.google.android.gms.measurement.internal.zzgn.$$a
            int r7 = r7 * 15
            int r1 = r7 + 38
            byte[] r1 = new byte[r1]
            int r7 = r7 + 37
            r2 = 0
            if (r0 != 0) goto L19
            r8 = r6
            r4 = r7
            r3 = r2
            goto L30
        L19:
            r3 = r2
        L1a:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L30:
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            r5 = r8
            r8 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgn.a(short, byte, byte, java.lang.Object[]):void");
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
    private static void d(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 71
            int r7 = r7 + 4
            byte[] r0 = com.google.android.gms.measurement.internal.zzgn.$$d
            int r6 = r6 * 15
            int r6 = r6 + 84
            int r8 = r8 * 19
            int r1 = r8 + 53
            byte[] r1 = new byte[r1]
            int r8 = r8 + 52
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
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2e:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + (-2)
            int r7 = r3 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgn.d(short, short, short, java.lang.Object[]):void");
    }

    private static final String zzg(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        Preconditions.checkNotNull(atomicReference);
        Preconditions.checkArgument(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (Objects.equals(str, strArr[i])) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i];
                    if (str2 == null) {
                        str2 = strArr2[i] + "(" + strArr[i] + ")";
                        strArr3[i] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    protected final String zza(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (str == null) {
            return null;
        }
        if (this.zzd.zza()) {
            return zzg(str, zzjm.zzc, zzjm.zza, zza);
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        throw null;
    }

    protected final String zzb(String str) {
        int i = 2 % 2;
        if (str != null) {
            if (this.zzd.zza()) {
                return zzg(str, zzjn.zzb, zzjn.zza, zzb);
            }
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 10 / 0;
            }
            return str;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 61;
        int i5 = i4 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5;
        if (i4 % 2 != 0) {
            throw null;
        }
        int i6 = i5 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    protected final String zzc(String str) {
        int i = 2 % 2;
        Object obj = null;
        if (str == null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i3 = i2 + 89;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }
        if (!this.zzd.zza()) {
            return str;
        }
        if (str.startsWith("_exp_")) {
            return "experiment_id(" + str + ")";
        }
        String strZzg = zzg(str, zzjo.zzb, zzjo.zza, zzc);
        int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
        if (i7 % 2 == 0) {
            return strZzg;
        }
        obj.hashCode();
        throw null;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ImageFormat.getBitsPerPixel(0) + 19473), 2625 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0') + 14, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (b ^ 9053247990562531611L);
                try {
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 39422), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 480, 37 - ExpandableListView.getPackedPositionGroup(0L), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
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
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        int i4 = $10 + 63;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (getrealtimecapturelatency.b < cArr.length) {
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (39421 - TextUtils.indexOf((CharSequence) "", '0', 0)), 481 - Color.argb(0, 0, 0, 0), (ViewConfiguration.getEdgeSlop() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
        int i6 = $11 + 105;
        $10 = i6 % 128;
        int i7 = i6 % 2;
    }

    protected final String zzf(Object[] objArr) {
        String strValueOf;
        int i = 2 % 2;
        if (objArr == null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 51;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        for (Object obj : objArr) {
            if (obj instanceof Bundle) {
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
                int i7 = i6 % 2;
                strValueOf = zze((Bundle) obj);
                int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 89;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
                int i9 = i8 % 2;
            } else {
                strValueOf = String.valueOf(obj);
            }
            if (strValueOf != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(strValueOf);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    protected final String zzd(zzbg zzbgVar) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cArgb = (char) (Color.argb(0, 0, 0, 0) + 43042);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 3112;
            int windowTouchSlop = 22 - (ViewConfiguration.getWindowTouchSlop() >> 8);
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a(bArr[37], bArr[132], bArr[7], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cArgb, iLastIndexOf, windowTouchSlop, -1272852037, false, (String) objArr3[0], null);
        }
        String string = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(new char[]{60297, 27065, 61426, 27943, 58235, 24762, 59126, 25727, 64127, 32684, 64944, 29454, 61797, 30376, 62702, 19004, 51317, 19844, 50154, 16682, 51047, 17576}, 33343 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(new char[]{60301, 4953, 6707, 271, 2287, 14300, 16034, 9649, 11621, 21580, 21286, 23267, 16861, 18620, 30619}, MotionEvent.axisFromString("") + 63710, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cCombineMeasuredStates = (char) (43042 - View.combineMeasuredStates(0, 0));
            int offsetAfter = TextUtils.getOffsetAfter("", 0) + 3111;
            int iMyTid = 22 - (Process.myTid() >> 22);
            byte[] bArr2 = $$a;
            byte b2 = bArr2[132];
            Object[] objArr6 = new Object[1];
            a(b2, b2, bArr2[7], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cCombineMeasuredStates, offsetAfter, iMyTid, -1269618118, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char offsetAfter2 = (char) (TextUtils.getOffsetAfter("", 0) + 43042);
                int keyRepeatTimeout = 3111 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int iGreen = 22 - Color.green(0);
                byte b3 = $$a[7];
                byte b4 = b3;
                Object[] objArr7 = new Object[1];
                a(b3, b4, b4, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(offsetAfter2, keyRepeatTimeout, iGreen, 154975793, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i2 = ((int[]) objArr8[2])[0];
            int i3 = ((int[]) objArr8[1])[0];
            String[] strArr = (String[]) objArr8[3];
            int[] iArr = {i3};
            int iMyTid2 = Process.myTid();
            int i4 = ~iMyTid2;
            int i5 = ((((-990150312) + (((~((-1171336887) | i4)) | (~(1608494846 | iMyTid2))) * (-831))) + ((~((-1074800275) | iMyTid2)) * (-1662))) + (((~(iMyTid2 | 1171336886)) | ((~(i4 | (-533694573))) | (~(533694572 | iMyTid2)))) * 831)) - 2001984621;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[0])[0] = i7 ^ (i7 << 5);
            objArr = new Object[]{new int[1], iArr, new int[]{i2}, strArr};
        } else {
            Object[] objArr9 = new Object[1];
            c(new char[]{60290, 52262, 42176, 40068, 30074, 11759, 1427, 65103, 55031, 36577, 26477, 24340, 14255, 59519, 49183, 47300}, 10159 - ExpandableListView.getPackedPositionType(0L), objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c(new char[]{60289, 1363, 13875, 10011, 20704, 16858, 29350, 25480, 40280, 36446, 48941, 43029, 55775, 51924, 64446, 5276}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 61150, objArr10);
            try {
                Object[] objArr11 = {null, Integer.valueOf(((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue()), 0, -2001984621};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[18];
                byte b6 = b5;
                Object[] objArr12 = new Object[1];
                d(b5, bArr3[5], b6, objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                byte b7 = bArr3[5];
                Object[] objArr13 = new Object[1];
                d(b7, bArr3[18], b7, objArr13);
                Object[] objArr14 = (Object[]) cls3.getMethod((String) objArr13[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cAxisFromString = (char) (43041 - MotionEvent.axisFromString(""));
                    int longPressTimeout = 3111 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    int iAlpha = Color.alpha(0) + 22;
                    byte b8 = $$a[7];
                    byte b9 = b8;
                    Object[] objArr15 = new Object[1];
                    a(b8, b9, b9, objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cAxisFromString, longPressTimeout, iAlpha, 154975793, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr14);
                try {
                    Object[] objArr16 = new Object[1];
                    c(new char[]{60297, 27065, 61426, 27943, 58235, 24762, 59126, 25727, 64127, 32684, 64944, 29454, 61797, 30376, 62702, 19004, 51317, 19844, 50154, 16682, 51047, 17576}, 33343 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr16);
                    Class<?> cls4 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    c(new char[]{60301, 4953, 6707, 271, 2287, 14300, 16034, 9649, 11621, 21580, 21286, 23267, 16861, 18620, 30619}, 63708 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr17);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 43042);
                        int i8 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3110;
                        int iAlpha2 = Color.alpha(0) + 22;
                        byte[] bArr4 = $$a;
                        byte b10 = bArr4[132];
                        Object[] objArr18 = new Object[1];
                        a(b10, b10, bArr4[7], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(doubleTapTimeout, i8, iAlpha2, -1269618118, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c = (char) (43043 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 3111;
                        int packedPositionType = 22 - ExpandableListView.getPackedPositionType(0L);
                        byte[] bArr5 = $$a;
                        Object[] objArr19 = new Object[1];
                        a(bArr5[37], bArr5[132], bArr5[7], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, jumpTapTimeout, packedPositionType, -1272852037, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr14;
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
        int i9 = ((int[]) objArr[1])[0];
        int i10 = ((int[]) objArr[2])[0];
        if (i10 == i9) {
            int i11 = ((int[]) objArr[0])[0];
            int i12 = ((int[]) objArr[2])[0];
            int i13 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[3];
            int[] iArr2 = {i12};
            int[] iArr3 = {i13};
            int iIdentityHashCode = System.identityHashCode(this);
            int i14 = (-2127445502) + (((~(943046997 | iIdentityHashCode)) | 761984461) * 672);
            int i15 = ~iIdentityHashCode;
            int i16 = i11 + i14 + (((~(iIdentityHashCode | 761984461)) | (~((-943046998) | i15))) * (-672)) + (((~((-761984462) | i15)) | 88749192) * 672);
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr2[0])[0] = i18 ^ (i18 << 5);
            objArr2 = new Object[]{new int[1], iArr3, iArr2, strArr2};
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                int i19 = 0;
                while (i19 < strArr3.length) {
                    int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 97;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i20 % 128;
                    if (i20 % 2 != 0) {
                        arrayList.add(strArr3[i19]);
                        i19 += 19;
                    } else {
                        arrayList.add(strArr3[i19]);
                        i19++;
                    }
                }
            }
            Toast.makeText((Context) null, i10 / (((i10 - 1) * i10) % 2), 0).show();
            int i21 = ((int[]) objArr[0])[0];
            int i22 = ((int[]) objArr[2])[0];
            int i23 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[3];
            int[] iArr4 = {i22};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i24 = ~((-272886885) | iIdentityHashCode2);
            int i25 = ~iIdentityHashCode2;
            int i26 = i21 + 1708099922 + ((i24 | (~(1432144574 | i25))) * (-1808)) + (((~((-272680997) | iIdentityHashCode2)) | (~(i25 | 1432350462))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(iIdentityHashCode2 | (-1432144575))) | 205888 | (~(272886884 | i25))) * TypedValues.Custom.TYPE_BOOLEAN);
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr2[0])[0] = i28 ^ (i28 << 5);
            objArr2 = new Object[]{new int[1], new int[]{i23}, iArr4, strArr4};
        }
        zzgm zzgmVar = this.zzd;
        if (!zzgmVar.zza()) {
            return zzbgVar.toString();
        }
        String strConcat = "16;7;6;".concat("origin=");
        int i29 = ((int[]) objArr2[0])[0];
        int i30 = i29 * i29;
        int i31 = -(281203569 * i29);
        int i32 = ((i30 | i31) << 1) - (i30 ^ i31);
        int i33 = -(i29 * (-1253231205));
        int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
        int i35 = (i34 ^ (-327911900)) + (((-327911900) & i34) << 1);
        int i36 = (((i35 >> 17) - 65535) / 32768) + 1;
        int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
        int i38 = i35 >> 24;
        int i39 = ((i38 ^ (-511)) + ((i38 & (-511)) << 1)) / 256;
        int i40 = -(((i39 ^ 1) + ((i39 & 1) << 1)) ^ i37);
        int i41 = (i40 & 5) + (i40 | 5);
        int i42 = ((i41 >> 27) - 63) / 32;
        StringBuilder sb = new StringBuilder(strConcat.substring(44205 / (((-((((i42 | 1) << 1) - (i42 ^ 1)) + 1)) & i41) * 1263)));
        sb.append(zzbgVar.zzc);
        sb.append(",name=");
        sb.append(zza(zzbgVar.zza));
        sb.append(",params=");
        zzbe zzbeVar = zzbgVar.zzb;
        if (zzbeVar == null) {
            int i43 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 55;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i43 % 128;
            if (i43 % 2 != 0) {
                int i44 = 91 / 0;
            }
        } else if (zzgmVar.zza()) {
            string = zze(zzbeVar.zzf());
        } else {
            int i45 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i45 % 128;
            if (i45 % 2 == 0) {
                zzbeVar.toString();
                string.hashCode();
                throw null;
            }
            string = zzbeVar.toString();
        }
        sb.append(string);
        return sb.toString();
    }

    protected final String zze(Bundle bundle) {
        String strZzf;
        int i = 2 % 2;
        if (bundle == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                if (i2 % 2 == 0) {
                    sb.append(", ");
                    throw null;
                }
                sb.append(", ");
            }
            sb.append(zzb(str));
            sb.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
                int i4 = i3 % 2;
                strZzf = zzf(new Object[]{obj});
            } else if (!(!(obj instanceof Object[]))) {
                strZzf = zzf((Object[]) obj);
            } else {
                strZzf = obj instanceof ArrayList ? zzf(((ArrayList) obj).toArray()) : String.valueOf(obj);
            }
            sb.append(strZzf);
        }
        sb.append("}]");
        String string = sb.toString();
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public zzgn(zzgm zzgmVar) {
        this.zzd = zzgmVar;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        b = 1583223811484566259L;
    }
}
