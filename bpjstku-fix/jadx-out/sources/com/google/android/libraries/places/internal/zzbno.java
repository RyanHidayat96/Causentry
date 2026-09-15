package com.google.android.libraries.places.internal;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Objects;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
final class zzbno implements Runnable {
    private static int $10 = 0;
    private static int $11 = 1;
    final /* synthetic */ zzbgg zza;
    final /* synthetic */ zzbnz zzb;
    private static final byte[] $$a = {30, 17, -35, 104, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 183;
    private static int b = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -5587001294938987617L;

    zzbno(zzbnz zzbnzVar, zzbgg zzbggVar) {
        this.zza = zzbggVar;
        Objects.requireNonNull(zzbnzVar);
        this.zzb = zzbnzVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.google.android.libraries.places.internal.zzbno.$$a
            int r9 = r9 * 4
            int r9 = 3 - r9
            int r8 = r8 * 3
            int r8 = 53 - r8
            int r7 = r7 * 3
            int r7 = r7 + 84
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r7 = r9
            r4 = r2
            goto L2e
        L17:
            r3 = r2
            r6 = r9
            r9 = r7
            r7 = r6
        L1b:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            int r7 = r7 + 1
            if (r4 != r8) goto L2c
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2c:
            r3 = r0[r7]
        L2e:
            int r3 = -r3
            int r9 = r9 + r3
            int r9 = r9 + (-11)
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbno.c(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:43:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:44:0x01fa  */
    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        Throwable cause;
        int i3 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        int i4 = $11 + 101;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 % 4;
        }
        while (true) {
            i2 = 39422;
            if (getrealtimecapturelatency.b >= cArr.length) {
                break;
            }
            int i6 = $11 + 121;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 19472), 2624 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 13 - (ViewConfiguration.getWindowTouchSlop() >> 8), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() | (TuitionPaymentFragmentspecialinlinedviewModeldefault1 / 9053247990562531611L);
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - (ViewConfiguration.getTapTimeout() >> 16)), 481 - ExpandableListView.getPackedPositionGroup(0L), View.getDefaultSize(0, 0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i8 = getrealtimecapturelatency.b;
                Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 19472), TextUtils.getOffsetAfter("", 0) + 2624, 13 - (ViewConfiguration.getWindowTouchSlop() >> 8), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i8] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ 9053247990562531611L);
                Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (39421 - TextUtils.lastIndexOf("", '0', 0)), TextUtils.indexOf("", "") + 481, 38 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (i2 - View.getDefaultSize(0, 0)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 481, 36 - TextUtils.lastIndexOf("", '0', 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            int i9 = $10 + 3;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            i2 = 39422;
        }
        objArr[0] = new String(cArr2);
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 107;
        b = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), View.resolveSize(0, 0) + 40, 19 - (ViewConfiguration.getWindowTouchSlop() >> 8), -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
        }
        int i4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object[] objArr = new Object[1];
        a(new char[]{2789, 63325, 61838, 62419, 64567, 65150, 63658, 64171, 59219, 57752, 58252, 60426, 61033, 59580, 60146, 55128, 53657, 54240, 56374, 56958, 55467, 56044}, MotionEvent.axisFromString("") + 64952, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        a(new char[]{2785, 28461, 49519, 15291, 40419, 63032, 26750, 49845, 9417, 39176, 62298, 21895, 53201, 8680, 39463}, 26053 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j = -1;
        long j2 = j ^ 2386115827352739880L;
        long j3 = 191;
        long jFreeMemory = (int) Runtime.getRuntime().freeMemory();
        long j4 = (((long) (-381)) * 2386115827352739880L) + (((long) DerHeader.TAG_CLASS_PRIVATE) * (-288858652610780893L)) + (((long) (-191)) * j2) + ((((jFreeMemory | (-288858652610780893L)) ^ j) | 2386115827352739880L) * j3) + (j3 * ((j ^ ((jFreeMemory ^ j) | (-288858652610780893L))) | ((j2 | (-288858652610780893L)) ^ j)));
        int i5 = 0;
        while (true) {
            if (i5 == 10) {
                Object[] objArr3 = new Object[1];
                a(new char[]{2798, 8030, 8580, 19412, 23622, 26191, 34951, 37623, 42811, 51513, 54169, 58868, 3635, 4239, 15067, 20252}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 5562, objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                a(new char[]{2797, 31443, 60039, 23155, 51772, 14866, 43970, 7064, 35668, 64302, 27401, 55517, 18595, 47228, 10282, 38940}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28723, objArr4);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr5 = {612153783};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (46038 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), TextUtils.indexOf((CharSequence) "", '0') + 1135, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Integer.valueOf(iIntValue), 0, 1581992462, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr5), false};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cRed = (char) Color.red(0);
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 1031;
                        int jumpTapTimeout = 15 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        byte b2 = $$a[7];
                        byte b3 = b2;
                        Object[] objArr7 = new Object[1];
                        c(b2, b3, b3, objArr7);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cRed, tapTimeout, jumpTapTimeout, 1298546779, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getTapTimeout() >> 16) + 45993), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1118, View.resolveSizeAndState(0, 0, 0) + 17), Boolean.TYPE});
                    }
                    Object[] objArr8 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr6);
                    if (((int[]) objArr8[3])[0] == ((int[]) objArr8[1])[0]) {
                        break;
                    }
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr8[0];
                    if (strArr != null) {
                        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
                        b = i6 % 128;
                        for (int i7 = i6 % 2 != 0 ? 1 : 0; i7 < strArr.length; i7++) {
                            arrayList.add(strArr[i7]);
                        }
                    }
                    throw null;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (37836 - View.combineMeasuredStates(0, 0)), 59 - KeyEvent.normalizeMetaState(0), 18 - Color.argb(0, 0, 0, 0), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
            }
            int i8 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).getInt(null);
            int i9 = 0;
            long j5 = jLongValue;
            while (true) {
                int i10 = 0;
                while (i10 != 8) {
                    i8 = (((((int) (j5 >> i10)) & 255) + (i8 << 6)) + (i8 << 16)) - i8;
                    i10++;
                    int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
                    b = i11 % 128;
                    int i12 = i11 % 2;
                }
                if (i9 != 0) {
                    break;
                }
                i9++;
                j5 = j4;
            }
            if (i8 == i4) {
                break;
            }
            jLongValue -= 1024;
            i5++;
        }
        this.zzb.zzq().zza(this.zza);
        int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
        b = i13 % 128;
        int i14 = i13 % 2;
    }
}
