package com.appsflyer.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.getRealtimeCaptureLatency;
import defpackage.getSelectedTab;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class AFh1qSDK {
    public final String getCurrencyIso4217Code;
    public final String getMediationNetwork;
    public final Intent getRevenue;
    private static final byte[] $$a = {109, 7, 114, -90};
    private static final int $$b = 2;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int g = 1;
    private static char TuitionPaymentFragmentbindingInflater1 = 23736;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 9216;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 39284;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 49896;
    private static long b = 5717388634091033448L;

    public AFh1qSDK(Activity activity, AFi1kSDK aFi1kSDK) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(aFi1kSDK, "");
        this.getRevenue = activity.getIntent();
        this.getCurrencyIso4217Code = aFi1kSDK.getMonetizationNetwork(activity);
        this.getMediationNetwork = aFi1kSDK.getCurrencyIso4217Code(activity);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x024a  */
    /* JADX WARN: Code duplicated, block: B:56:0x024b  */
    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        long j;
        Throwable cause;
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (true) {
            j = 0;
            if (getrealtimecapturelatency.b >= cArr.length) {
                break;
            }
            int i3 = $11 + 53;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((Process.myTid() >> 22) + 19472), 2625 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 13 - Color.green(0), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() % (b - 9053247990562531611L);
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 39422), 481 - TextUtils.getOffsetAfter("", 0), 37 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
                int i5 = getrealtimecapturelatency.b;
                Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (19473 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 2624 - ((Process.getThreadPriority(0) + 20) >> 6), ExpandableListView.getPackedPositionGroup(0L) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (b ^ 9053247990562531611L);
                Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (39423 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 481 - Drawable.resolveOpacity(0, 0), 37 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
            int i6 = $11 + 3;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                try {
                    Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (39421 - ExpandableListView.getPackedPositionChild(j)), KeyEvent.keyCodeFromString("") + 481, 37 - Color.argb(0, 0, 0, 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                    throw null;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr7 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (39421 - TextUtils.lastIndexOf("", '0', 0, 0)), 481 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 37 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
            j = 0;
        }
        objArr[0] = new String(cArr2);
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            char c = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            int i3 = $10 + 73;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            int i5 = 1;
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i6 = $11 + 55;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 58224;
            int i9 = 0;
            while (i9 < 16) {
                int i10 = $11 + i5;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                char c2 = cArr3[i5];
                char c3 = cArr3[c];
                int i12 = i9;
                int i13 = (c3 + i8) ^ ((c3 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 8611973335120459638L)));
                int i14 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    objArr2[2] = Integer.valueOf(i14);
                    objArr2[i5] = Integer.valueOf(i13);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf("", "", 0, 0) + 47773);
                        int keyRepeatTimeout = 468 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int scrollBarFadeDuration = 13 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[i5] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, keyRepeatTimeout, scrollBarFadeDuration, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[i5] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47774 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getTouchSlop() >> 8) + 468, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 12, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9 = i12 + 1;
                    i5 = 1;
                    c = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] ^ cArr3[1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                int iMyPid = (Process.myPid() >> 22) + 2323;
                int i15 = 45 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                byte b2 = (byte) ($$b - 2);
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(threadPriority, iMyPid, i15, -1312321721, false, $$c(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v83 */
    /* JADX WARN: Type inference failed for: r4v84 */
    /* JADX WARN: Type inference failed for: r4v85 */
    /* JADX WARN: Type inference failed for: r4v86 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        Class<?> cls;
        int i7;
        int i8;
        Object objInvoke;
        int i9;
        int i10;
        Class<?> cls2;
        char[] cArr;
        int i11;
        Class<?> cls3;
        char[] cArr2;
        String str;
        Class<?> cls4;
        char[] cArr3;
        char c;
        int size;
        int i12;
        int i13;
        int i14;
        int i15;
        Class<?> cls5;
        String str2;
        ?? Invoke = 2;
        Invoke = 2;
        Invoke = 2;
        Invoke = 2;
        int i16 = 2 % 2;
        if (context != null) {
            try {
                int i17 = -(-KeyEvent.normalizeMetaState(0));
                int i18 = (i17 & 31) + (i17 | 31);
                Object[] objArr = new Object[1];
                a(new char[]{48846, 39774, 40608, 1786, 38597, 9365, 48130, 15865, 55960, 33905, 32250, 58351, 5421, 60885, 22887, 62025, 60036, 57053, 43325, 2520, 17095, 3878, 63098, 61880, 870, 15267, 26771, 32863, 51293, 6114, 7777, 38103, 2463, 21304}, i18, objArr);
                try {
                    try {
                        Object[] objArr2 = {(String) objArr[0]};
                        int iIndexOf = TextUtils.indexOf("", "", 0, 0);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getSelectedTab.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i19 = iIndexOf * 273;
                        int i20 = (i19 ^ (-10298)) + ((i19 & (-10298)) << 1);
                        int i21 = ~iIndexOf;
                        int i22 = (i21 ^ (-39)) | (i21 & (-39));
                        int i23 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i24 = ~((i22 ^ i23) | (i22 & i23));
                        int i25 = iIndexOf | 38;
                        int i26 = ~((i25 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i25 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                        int i27 = -(-(((i24 ^ i26) | (i26 & i24)) * (-272)));
                        int i28 = (i20 & i27) + (i20 | i27);
                        int i29 = ~(i21 | 38);
                        int i30 = ~((i21 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i21 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                        int i31 = -(-(((i29 & i30) | (i29 ^ i30)) * (-272)));
                        int i32 = (i28 ^ i31) + ((i31 & i28) << 1);
                        int i33 = ~((iIndexOf ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (iIndexOf & iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                        int i34 = -(-(((i33 & 38) | (i33 ^ 38)) * 272));
                        int i35 = ((i32 | i34) << 1) - (i34 ^ i32);
                        Object[] objArr3 = new Object[1];
                        a(new char[]{59133, 12437, 36754, 48554, 33789, 20199, 49608, 51282, 9048, 24275, 21328, 37516, 21511, 50009, 36176, 23620, 60904, 28595, 43166, 16379, 9560, 3024, 8636, 28522, 55787, 20720, 27345, 59086, 48380, 5313, 59924, 8275, 30958, 3481, 45942, 12255, 29322, 25253, 20254, 12396}, i35, objArr3);
                        Object objNewInstance = Class.forName((String) objArr3[0]).getDeclaredConstructor(String.class).newInstance(objArr2);
                        int i36 = -View.MeasureSpec.getSize(0);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getSelectedTab.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i37 = (i36 * (-1965)) - (-51312648);
                        int i38 = ((i36 ^ (-52148)) | (i36 & (-52148))) * 983;
                        int i39 = (i37 ^ i38) + ((i37 & i38) << 1);
                        int i40 = ~i36;
                        int i41 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i42 = ~(((-52148) ^ i41) | ((-52148) & i41));
                        int i43 = (i39 - (~(-(-(((i42 & i40) | (i40 ^ i42)) * (-983)))))) - 1;
                        int i44 = ~i36;
                        int i45 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i46 = ~((i44 & i45) | (i44 ^ i45));
                        int i47 = ~((52147 & i40) | (i40 ^ 52147));
                        int i48 = i43 + (((i46 & i47) | (i46 ^ i47)) * 983);
                        Object[] objArr4 = new Object[1];
                        c(new char[]{47664, 29181, 11584, 55609, 38035, 16451, 31868, 11223, 59269, 37724, 20223, 31405, 13950, 57856, 39317, 21837, 269, 15533, 59556, 42068, 21483, 4014, 15230, 63247, 41695, 24104, 2585, 49655, 64901, 43329, 25838}, i48, objArr4);
                        try {
                            Object[] objArr5 = {(String) objArr4[0]};
                            Object[] objArr6 = new Object[1];
                            a(new char[]{59133, 12437, 36754, 48554, 33789, 20199, 49608, 51282, 9048, 24275, 21328, 37516, 21511, 50009, 36176, 23620, 60904, 28595, 43166, 16379, 9560, 3024, 8636, 28522, 55787, 20720, 27345, 59086, 48380, 5313, 59924, 8275, 30958, 3481, 45942, 12255, 29322, 25253, 20254, 12396}, 37 - (~(ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr6);
                            Object objNewInstance2 = Class.forName((String) objArr6[0]).getDeclaredConstructor(String.class).newInstance(objArr5);
                            try {
                                char[] cArr4 = {47634, 43784, 38973, 35134, 65096, 61299, 56425, 52686, 12984, 9121, 4303, 480, 30442, 25612, 21793, 47718, 43872, 39033, 35175, 65160, 61362, 56498, 52681};
                                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                int i49 = asBinder;
                                int i50 = (i49 ^ 33) + ((i49 & 33) << 1);
                                int i51 = i50 % 128;
                                g = i51;
                                if (i50 % 2 == 0) {
                                    i4 = (399 % iIndexOf2) + 4773;
                                    int i52 = ~iIndexOf2;
                                    i5 = ~((i52 ^ 4374) | (i52 & 4374));
                                    i6 = (-4375) | iIndexOf2;
                                } else {
                                    i4 = (iIndexOf2 * 399) - (-1745226);
                                    int i53 = ~iIndexOf2;
                                    i5 = ~((i53 & 4374) | (i53 ^ 4374));
                                    i6 = ((-4375) ^ iIndexOf2) | ((-4375) & iIndexOf2);
                                }
                                int i54 = ~i6;
                                int i55 = (i5 ^ i54) | (i5 & i54);
                                int i56 = ~((-4375) | i);
                                int i57 = (i4 - (~(((i55 ^ i56) | (i55 & i56)) * 398))) - 1;
                                int i58 = -(-(((iIndexOf2 ^ 4374) | (iIndexOf2 & 4374)) * (-1194)));
                                int i59 = ((i57 | i58) << 1) - (i58 ^ i57);
                                int i60 = ~i;
                                int i61 = (i51 ^ 45) + ((i51 & 45) << 1);
                                asBinder = i61 % 128;
                                if (i61 % 2 != 0) {
                                    int i62 = ~((-4375) | i60);
                                    int i63 = ~((~iIndexOf2) | 4374);
                                    int i64 = (i62 ^ i63) | (i62 & i63);
                                    int i65 = ~(((-4375) & iIndexOf2) | ((-4375) ^ iIndexOf2));
                                    int i66 = i59 / (398 >>> ((i64 & i65) | (i64 ^ i65)));
                                    Object[] objArr7 = new Object[1];
                                    c(cArr4, i66, objArr7);
                                    cls = Class.forName((String) objArr7[0]);
                                } else {
                                    int i67 = ~(((-4375) ^ i60) | ((-4375) & i60));
                                    int i68 = ~iIndexOf2;
                                    int i69 = ~((i68 ^ 4374) | (i68 & 4374));
                                    int i70 = (i69 & i67) | (i67 ^ i69);
                                    int i71 = ~(((-4375) ^ iIndexOf2) | ((-4375) & iIndexOf2));
                                    int i72 = ((i70 & i71) | (i70 ^ i71)) * 398;
                                    int i73 = (i59 ^ i72) + ((i72 & i59) << 1);
                                    Object[] objArr8 = new Object[1];
                                    c(cArr4, i73, objArr8);
                                    cls = Class.forName((String) objArr8[0]);
                                }
                                char[] cArr5 = {47636, 29805, 9969, 53586, 33790, 45687, 27898, 8015, 51660, 63557, 43760, 25947, 6105, 50733, 61614, 41763, 23985};
                                int i74 = -TextUtils.lastIndexOf("", '0', 0, 0);
                                int i75 = i74 * 375;
                                int i76 = (i75 ^ (-39484926)) + ((i75 & (-39484926)) << 1);
                                int i77 = ~i74;
                                int i78 = ~((52858 & i77) | (i77 ^ 52858));
                                int i79 = ~i;
                                int i80 = (i79 ^ i74) | (i79 & i74);
                                int i81 = ~i80;
                                int i82 = ((i78 ^ i81) | (i81 & i78)) * (-374);
                                int i83 = asBinder;
                                int i84 = (i83 ^ 111) + ((i83 & 111) << 1);
                                g = i84 % 128;
                                if (i84 % 2 == 0) {
                                    i8 = (i76 >> i82) >>> ((~((i74 & (-52859)) | ((-52859) ^ i74))) * 748);
                                    i7 = ~((-52859) | i77);
                                } else {
                                    int i85 = ((i76 + i82) - (~(-(-((~(((-52859) ^ i74) | (i74 & (-52859)))) * 748))))) - 1;
                                    i7 = ~((-52859) | i77);
                                    i8 = i85;
                                }
                                int i86 = -(-(374 * (i7 | (~i80))));
                                int i87 = (i8 & i86) + (i86 | i8);
                                try {
                                    Object[] objArr9 = new Object[1];
                                    c(cArr5, i87, objArr9);
                                    Invoke = cls.getMethod((String) objArr9[0], null).invoke(context, null);
                                    try {
                                        int i88 = -(-ExpandableListView.getPackedPositionChild(0L));
                                        Object[] objArr10 = new Object[1];
                                        c(new char[]{47634, 43784, 38973, 35134, 65096, 61299, 56425, 52686, 12984, 9121, 4303, 480, 30442, 25612, 21793, 47718, 43872, 39033, 35175, 65160, 61362, 56498, 52681}, (i88 & 4374) + (i88 | 4374), objArr10);
                                        Class<?> cls6 = Class.forName((String) objArr10[0]);
                                        char[] cArr6 = {5475, 54971, 26010, 48206, 16343, 22680, 50284, 6612, 13999, 21452, 55480, 22903, 38307, 30284, 31657, 56189};
                                        int i89 = -Process.getGidForName("");
                                        int i90 = i89 * 284;
                                        int i91 = asBinder + 15;
                                        int i92 = i91 % 128;
                                        g = i92;
                                        int i93 = i91 % 2;
                                        int i94 = (i90 ^ (-3666)) + ((i90 & (-3666)) << 1);
                                        int i95 = ~i89;
                                        int i96 = ~((i95 ^ 13) | (i95 & 13));
                                        int i97 = ~(i95 | i);
                                        int i98 = ((i96 ^ i97) | (i96 & i97)) * (-283);
                                        int i99 = (i94 & i98) + (i94 | i98);
                                        int i100 = -(-((~((i89 & (-14)) | ((-14) ^ i89))) * 283));
                                        int i101 = (i99 & i100) + (i100 | i99);
                                        int i102 = (i92 & 83) + (i92 | 83);
                                        asBinder = i102 % 128;
                                        int i103 = i102 % 2;
                                        int i104 = (i101 - (~((~(((i95 ^ (-14)) | (i95 & (-14))) | i)) * 283))) - 1;
                                        Object[] objArr11 = new Object[1];
                                        a(cArr6, i104, objArr11);
                                        Method method = cls6.getMethod((String) objArr11[0], null);
                                        int i105 = g + 63;
                                        asBinder = i105 % 128;
                                        if (i105 % 2 != 0) {
                                            objInvoke = method.invoke(context, null);
                                            i9 = 90;
                                        } else {
                                            objInvoke = method.invoke(context, null);
                                            i9 = 64;
                                        }
                                        try {
                                            Object[] objArr12 = {objInvoke, Integer.valueOf(i9)};
                                            int i106 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getSelectedTab.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                            int i107 = i106 * 989;
                                            int i108 = (i107 & (-32571)) + (i107 | (-32571));
                                            int i109 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                            int i110 = ((-34) ^ i109) | ((-34) & i109);
                                            int i111 = (i106 ^ 33) | (i106 & 33);
                                            int i112 = -(-(((~((i111 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i111 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3))) | (~((i110 ^ i106) | (i110 & i106)))) * 988));
                                            int i113 = (i108 & i112) + (i112 | i108);
                                            int i114 = -(-(((i106 ^ (-34)) | (i106 & (-34))) * (-988)));
                                            int i115 = ((i113 | i114) << 1) - (i114 ^ i113);
                                            int i116 = ~i106;
                                            int i117 = ~((i116 & (-34)) | (i116 ^ (-34)));
                                            int i118 = ~(((-34) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & (-34)));
                                            int i119 = (i117 & i118) | (i117 ^ i118);
                                            int i120 = (i106 & i109) | (i109 ^ i106);
                                            int i121 = ~((i120 & 33) | (i120 ^ 33));
                                            int i122 = ((i119 & i121) | (i119 ^ i121)) * 988;
                                            int i123 = (i115 & i122) + (i122 | i115);
                                            Object[] objArr13 = new Object[1];
                                            a(new char[]{45398, 38245, 56303, 11503, 37753, 64845, 24779, 42347, 2079, 61171, 20693, 53869, 9240, 40680, 49780, 16010, 8764, 23998, 26452, 64563, 16875, 34803, 3197, 39841, 64743, 63417, 62570, 6567, 62142, 59002, 10673, 48917, 38561, 19483, 35201, 57010}, i123, objArr13);
                                            Class<?> cls7 = Class.forName((String) objArr13[0]);
                                            int i124 = -(-TextUtils.getCapsMode("", 0, 0));
                                            int i125 = ((i124 | 14) << 1) - (i124 ^ 14);
                                            Object[] objArr14 = new Object[1];
                                            a(new char[]{21175, 20852, 64514, 2604, 31813, 40079, 39165, 59115, 60470, 31452, 57981, 55936, 37846, 10792, 35385, 26981}, i125, objArr14);
                                            Object objInvoke2 = cls7.getMethod((String) objArr14[0], String.class, Integer.TYPE).invoke(Invoke, objArr12);
                                            try {
                                                char[] cArr7 = {35866, 37251, 14594, 62941, 63803, 28714, 5749, 59896, 12337, 40560, 34189, 33351, 47819, 12917, 20743, 11909, 33008, 37467, 64697, 57797, 4093, 16016, 19095, 29662, 52063, 21311, 39833, 55178, 42143, 17687, 19848, 33308};
                                                int i126 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                int i127 = g;
                                                int i128 = i127 + 47;
                                                asBinder = i128 % 128;
                                                if (i128 % 2 != 0) {
                                                    int i129 = ~i126;
                                                    int i130 = ~((i129 ^ 29) | (i129 & 29));
                                                    int i131 = ~((i129 & i) | (i129 ^ i));
                                                    i10 = ((284 - i126) << (-8178)) >>> (((i131 & i130) | (i130 ^ i131)) * (-283));
                                                } else {
                                                    int i132 = i126 * 284;
                                                    int i133 = (i132 ^ (-8178)) + ((i132 & (-8178)) << 1);
                                                    int i134 = ~i126;
                                                    int i135 = ~((i134 & 29) | (i134 ^ 29));
                                                    int i136 = ~i126;
                                                    int i137 = ~((i136 & i) | (i136 ^ i));
                                                    int i138 = -(-(((i135 & i137) | (i135 ^ i137)) * (-283)));
                                                    i10 = ((i133 | i138) << 1) - (i138 ^ i133);
                                                }
                                                int i139 = i127 + 15;
                                                asBinder = i139 % 128;
                                                if (i139 % 2 != 0) {
                                                    int i140 = ~(((-30) ^ i126) | ((-30) & i126));
                                                    int i141 = i10 - (((283 | i140) << 1) - (i140 ^ 283));
                                                    int i142 = ~i126;
                                                    int i143 = (i142 & (-30)) | (i142 ^ (-30));
                                                    int i144 = -(~((i143 & i) | (i143 ^ i)));
                                                    Object[] objArr15 = new Object[1];
                                                    a(cArr7, i141 << (((i144 | 283) << 1) - (i144 ^ 283)), objArr15);
                                                    cls2 = Class.forName((String) objArr15[0]);
                                                    cArr = new char[]{21436, 3803, 28885, 19609, 13652, 18793, 21912, 63594, 24453, 54751, 51010, 2067};
                                                    i11 = 20;
                                                } else {
                                                    int i145 = (~((-30) | i126)) * 283;
                                                    int i146 = ~i126;
                                                    int i147 = (i146 & (-30)) | (i146 ^ (-30));
                                                    int i148 = (i10 & i145) + (i145 | i10) + ((~((i147 & i) | (i147 ^ i))) * 283);
                                                    Object[] objArr16 = new Object[1];
                                                    a(cArr7, i148, objArr16);
                                                    cls2 = Class.forName((String) objArr16[0]);
                                                    cArr = new char[]{21436, 3803, 28885, 19609, 13652, 18793, 21912, 63594, 24453, 54751, 51010, 2067};
                                                    i11 = 10;
                                                }
                                                int scrollBarFadeDuration = ViewConfiguration.getScrollBarFadeDuration() >> 16;
                                                int i149 = (i11 & scrollBarFadeDuration) + (i11 | scrollBarFadeDuration);
                                                Object[] objArr17 = new Object[1];
                                                a(cArr, i149, objArr17);
                                                Object[] objArr18 = (Object[]) cls2.getField((String) objArr17[0]).get(objInvoke2);
                                                int length = objArr18.length;
                                                Invoke = 0;
                                                while (true) {
                                                    if (Invoke < length) {
                                                        Object obj = objArr18[Invoke];
                                                        int iMyTid = Process.myTid() >> 22;
                                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = getSelectedTab.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                        int i150 = (iMyTid * 141) - 2799877;
                                                        int i151 = ~iMyTid;
                                                        Object[] objArr19 = objArr18;
                                                        int i152 = ~((i151 & 20143) | (i151 ^ 20143));
                                                        int i153 = ~((i151 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i151 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                                        int i154 = ((i152 ^ i153) | (i152 & i153)) * (-280);
                                                        int i155 = (i150 ^ i154) + ((i154 & i150) << 1);
                                                        int i156 = ~iMyTid;
                                                        int i157 = length;
                                                        int i158 = -(-(((~((-20144) | iTuitionPaymentFragmentspecialinlinedviewModeldefault4)) | (~((i156 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i156 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4)))) * 140));
                                                        int i159 = (i155 ^ i158) + ((i158 & i155) << 1);
                                                        int i160 = (i151 ^ (-20144)) | (i151 & (-20144));
                                                        int i161 = ~((i160 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i160 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                                        int i162 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                                        int i163 = (i156 & i162) | (i156 ^ i162);
                                                        int i164 = ~((i163 & 20143) | (i163 ^ 20143));
                                                        int i165 = (i164 & i161) | (i161 ^ i164);
                                                        int i166 = (-20144) | i162;
                                                        int i167 = ~((i166 & iMyTid) | (i166 ^ iMyTid));
                                                        int i168 = (i159 - (~(((i165 & i167) | (i165 ^ i167)) * 140))) - 1;
                                                        Object[] objArr20 = new Object[1];
                                                        c(new char[]{47659, 62706, 10008, 22094, 33014}, i168, objArr20);
                                                        try {
                                                            Object[] objArr21 = {(String) objArr20[0]};
                                                            char[] cArr8 = {'B', 53107, 22858, 27876, 50985, 49535, 32650, 1134, 56485, 10539, 14094, 33437, 36993, 58687, 59893, 16902, 63379, 25476, 62218, 62800, 62465, 17648, 37300, 35524, 38385, 38736, 42524, 59169, 22605, 21197, 50937, 4108, 509, 18208, 24610, 23557, 44277, 26329, 11828, 19270};
                                                            int i169 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                            int i170 = i169 * 1773;
                                                            int i171 = g;
                                                            int i172 = (i171 ^ 91) + ((i171 & 91) << 1);
                                                            asBinder = i172 % 128;
                                                            int i173 = i172 % 2 != 0 ? i170 / (-23) : i170 - 32745;
                                                            int i174 = ~i169;
                                                            int i175 = ~((i174 & (-38)) | (i174 ^ (-38)));
                                                            int i176 = ~(((-38) & i) | ((-38) ^ i));
                                                            int i177 = (i175 & i176) | (i175 ^ i176);
                                                            int i178 = ~((i79 ^ i169) | (i79 & i169) | 37);
                                                            int i179 = 886 * ((i177 & i178) | (i177 ^ i178));
                                                            int i180 = (i173 & i179) + (i173 | i179);
                                                            int i181 = ~((i79 ^ 37) | (i79 & 37));
                                                            int i182 = (i180 - (~(((i181 & i169) | (i169 ^ i181)) * (-1772)))) - 1;
                                                            int i183 = (i171 ^ 99) + ((i171 & 99) << 1);
                                                            asBinder = i183 % 128;
                                                            int i184 = i183 % 2;
                                                            int i185 = ~((i169 & i79) | (i79 ^ i169));
                                                            if (i184 != 0) {
                                                                int i186 = -i185;
                                                                Object[] objArr22 = new Object[1];
                                                                a(cArr8, i182 << ((i186 ^ 886) + ((i186 & 886) << 1)), objArr22);
                                                                cls3 = Class.forName((String) objArr22[0]);
                                                                cArr2 = new char[]{47636, 22517, 25025, 29587, 3473, 8047, 10581, 15143, 54533, 59115, 61640};
                                                            } else {
                                                                Object[] objArr23 = new Object[1];
                                                                a(cArr8, i182 + (i185 * 886), objArr23);
                                                                cls3 = Class.forName((String) objArr23[0]);
                                                                cArr2 = new char[]{47636, 22517, 25025, 29587, 3473, 8047, 10581, 15143, 54533, 59115, 61640};
                                                            }
                                                            Object[] objArr24 = new Object[1];
                                                            c(cArr2, 60900 + TextUtils.indexOf((CharSequence) "", '0'), objArr24);
                                                            Object objInvoke3 = cls3.getMethod((String) objArr24[0], String.class).invoke(null, objArr21);
                                                            try {
                                                                Object[] objArr25 = new Object[1];
                                                                c(new char[]{47634, 52028, 22613, 59746, 32408, 36799, 7377, 44474, 13080, 16437, 53591, 26220, 63386, 1200, 38345, 6834, 43027, 14639, 19983, 57171, 27790, 64929, 715, 37861, 8479, 46655, 51035, 21613}, 28960 - (~(-TextUtils.indexOf("", "", 0))), objArr25);
                                                                Class<?> cls8 = Class.forName((String) objArr25[0]);
                                                                int i187 = -TextUtils.indexOf("", "");
                                                                int i188 = ((i187 | 11) << 1) - (i187 ^ 11);
                                                                Object[] objArr26 = new Object[1];
                                                                a(new char[]{10925, 7526, 35047, 22969, 48328, 57182, 49040, 28781, 41707, 55168, 38773, 415, 2622, 27112}, i188, objArr26);
                                                                try {
                                                                    Object[] objArr27 = {new ByteArrayInputStream((byte[]) cls8.getMethod((String) objArr26[0], null).invoke(obj, null))};
                                                                    char[] cArr9 = {'B', 53107, 22858, 27876, 50985, 49535, 32650, 1134, 56485, 10539, 14094, 33437, 36993, 58687, 59893, 16902, 63379, 25476, 62218, 62800, 62465, 17648, 37300, 35524, 38385, 38736, 42524, 59169, 22605, 21197, 50937, 4108, 509, 18208, 24610, 23557, 44277, 26329, 11828, 19270};
                                                                    int i189 = asBinder + 99;
                                                                    g = i189 % 128;
                                                                    if (i189 % 2 == 0) {
                                                                        Object[] objArr28 = new Object[1];
                                                                        a(cArr9, 1 - TextUtils.indexOf((CharSequence) "", (char) 27), objArr28);
                                                                        str = (String) objArr28[0];
                                                                    } else {
                                                                        int i190 = -TextUtils.indexOf((CharSequence) "", '0');
                                                                        int i191 = ((i190 | 36) << 1) - (i190 ^ 36);
                                                                        Object[] objArr29 = new Object[1];
                                                                        a(cArr9, i191, objArr29);
                                                                        str = (String) objArr29[0];
                                                                    }
                                                                    int i192 = g + 5;
                                                                    asBinder = i192 % 128;
                                                                    if (i192 % 2 != 0) {
                                                                        cls4 = Class.forName(str);
                                                                        cArr3 = new char[]{11931, 39594, 61329, 61105, 16000, 53714, 24868, 56631, 18863, 34423, 63407, 42410, 58075, 27032, 11022, 60969, 31140, 2750, 29071, 23990, 47352, 16671};
                                                                        size = View.MeasureSpec.getSize(0);
                                                                        i12 = 25;
                                                                        c = 0;
                                                                    } else {
                                                                        cls4 = Class.forName(str);
                                                                        cArr3 = new char[]{11931, 39594, 61329, 61105, 16000, 53714, 24868, 56631, 18863, 34423, 63407, 42410, 58075, 27032, 11022, 60969, 31140, 2750, 29071, 23990, 47352, 16671};
                                                                        c = 0;
                                                                        size = View.MeasureSpec.getSize(0);
                                                                        i12 = 19;
                                                                    }
                                                                    Object[] objArr30 = new Object[1];
                                                                    a(cArr3, i12 + size, objArr30);
                                                                    String str3 = (String) objArr30[c];
                                                                    Class<?>[] clsArr = new Class[1];
                                                                    int i193 = g + 121;
                                                                    asBinder = i193 % 128;
                                                                    if (i193 % 2 != 0) {
                                                                        try {
                                                                            clsArr[0] = InputStream.class;
                                                                            cls4.getMethod(str3, clsArr).invoke(objInvoke3, objArr27);
                                                                            Object obj2 = null;
                                                                            obj2.hashCode();
                                                                            throw null;
                                                                        } catch (Throwable th) {
                                                                            th = th;
                                                                            Throwable cause = th.getCause();
                                                                            if (cause != null) {
                                                                                throw cause;
                                                                            }
                                                                            throw th;
                                                                        }
                                                                    }
                                                                    clsArr[0] = InputStream.class;
                                                                    Object objInvoke4 = cls4.getMethod(str3, clsArr).invoke(objInvoke3, objArr27);
                                                                    int i194 = asBinder + 91;
                                                                    g = i194 % 128;
                                                                    int i195 = i194 % 2;
                                                                    try {
                                                                        Object[] objArr31 = new Object[1];
                                                                        a(new char[]{45284, 4248, 34654, 5470, 16237, 63487, 8854, 62086, 39614, 25189, 15869, 24202, 61009, 59368, 29346, 12151, 24999, 27311, 26829, 6222, 32415, 41747, 30673, 43200, 6475, 10738, 51161, 16127, 38330, 42637, 1751, 58802, 40854, 63446, 20246, 11298}, 34 - View.combineMeasuredStates(0, 0), objArr31);
                                                                        Class<?> cls9 = Class.forName((String) objArr31[0]);
                                                                        int i196 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                                        int i197 = i196 * 398;
                                                                        int i198 = (i197 ^ (-3010788)) + ((i197 & (-3010788)) << 1);
                                                                        int i199 = ~i196;
                                                                        int i200 = ~((i199 ^ i79) | (i199 & i79));
                                                                        int i201 = ~((i199 & 7603) | (i199 ^ 7603));
                                                                        int i202 = (i201 & i200) | (i200 ^ i201);
                                                                        int i203 = ~((i79 ^ 7603) | (i79 & 7603));
                                                                        int i204 = ((i202 & i203) | (i202 ^ i203)) * (-397);
                                                                        int i205 = (i198 ^ i204) + ((i204 & i198) << 1);
                                                                        int i206 = -(-((~((~i196) | 7603)) * (-397)));
                                                                        int i207 = (i205 & i206) + (i206 | i205);
                                                                        int i208 = ~(i199 | 7603);
                                                                        int i209 = ((~(i196 | (-7604))) | (i208 & i) | (i ^ i208)) * 397;
                                                                        int i210 = (i207 ^ i209) + ((i209 & i207) << 1);
                                                                        Object[] objArr32 = new Object[1];
                                                                        c(new char[]{47636, 42917, 33121, 58169, 52426, 11886, 2091, 30195, 22408, 45388, 37589, 64759, 56871, 14420, 9705, 1916, 24874, 17150, 44166, 36435, 60415, 54717, 14205}, i210, objArr32);
                                                                        if (!objNewInstance.equals(cls9.getMethod((String) objArr32[0], null).invoke(objInvoke4, null))) {
                                                                            int i211 = asBinder + 81;
                                                                            g = i211 % 128;
                                                                            int i212 = i211 % 2;
                                                                            try {
                                                                                char[] cArr10 = {45284, 4248, 34654, 5470, 16237, 63487, 8854, 62086, 39614, 25189, 15869, 24202, 61009, 59368, 29346, 12151, 24999, 27311, 26829, 6222, 32415, 41747, 30673, 43200, 6475, 10738, 51161, 16127, 38330, 42637, 1751, 58802, 40854, 63446, 20246, 11298};
                                                                                i13 = 16;
                                                                                int i213 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                                                                int i214 = g + 65;
                                                                                int i215 = i214 % 128;
                                                                                asBinder = i215;
                                                                                int i216 = i214 % 2 != 0 ? 477 % i213 : i213 * 477;
                                                                                int i217 = (i216 ^ (-16150)) + ((i216 & (-16150)) << 1);
                                                                                int i218 = ~i213;
                                                                                int i219 = ~((i218 & 34) | (i218 ^ 34));
                                                                                int i220 = ((-35) ^ i213) | ((-35) & i213);
                                                                                int i221 = ~((i220 ^ i) | (i220 & i));
                                                                                int i222 = i217 + (((i219 ^ i221) | (i219 & i221)) * (-476));
                                                                                int i223 = (i215 & 9) + (i215 | 9);
                                                                                g = i223 % 128;
                                                                                if (i223 % 2 == 0) {
                                                                                    i15 = i222 << (((i221 | 952) << 1) - (i221 ^ 952));
                                                                                } else {
                                                                                    int i224 = (-35) | i213;
                                                                                    int i225 = (~((i224 & i) | (i224 ^ i))) * 952;
                                                                                    i15 = ((i222 | i225) << 1) - (i225 ^ i222);
                                                                                }
                                                                                int i226 = ((-35) ^ i60) | ((-35) & i60);
                                                                                int i227 = -(-(476 * (~((i213 & i226) | (i226 ^ i213)))));
                                                                                int i228 = ((i15 | i227) << 1) - (i15 ^ i227);
                                                                                Object[] objArr33 = new Object[1];
                                                                                a(cArr10, i228, objArr33);
                                                                                String str4 = (String) objArr33[0];
                                                                                int i229 = g;
                                                                                int i230 = (i229 & 53) + (i229 | 53);
                                                                                asBinder = i230 % 128;
                                                                                if (i230 % 2 != 0) {
                                                                                    cls5 = Class.forName(str4);
                                                                                    Object[] objArr34 = new Object[1];
                                                                                    c(new char[]{47636, 42917, 33121, 58169, 52426, 11886, 2091, 30195, 22408, 45388, 37589, 64759, 56871, 14420, 9705, 1916, 24874, 17150, 44166, 36435, 60415, 54717, 14205}, ImageFormat.getBitsPerPixel(0) * 9537, objArr34);
                                                                                    str2 = (String) objArr34[0];
                                                                                } else {
                                                                                    cls5 = Class.forName(str4);
                                                                                    int i231 = -ImageFormat.getBitsPerPixel(0);
                                                                                    int i232 = (i231 ^ 7602) + ((i231 & 7602) << 1);
                                                                                    Object[] objArr35 = new Object[1];
                                                                                    c(new char[]{47636, 42917, 33121, 58169, 52426, 11886, 2091, 30195, 22408, 45388, 37589, 64759, 56871, 14420, 9705, 1916, 24874, 17150, 44166, 36435, 60415, 54717, 14205}, i232, objArr35);
                                                                                    str2 = (String) objArr35[0];
                                                                                }
                                                                                if (!objNewInstance2.equals(cls5.getMethod(str2, null).invoke(objInvoke4, null))) {
                                                                                    int i233 = (Invoke ^ 64) + ((Invoke & 64) << 1);
                                                                                    int i234 = (i233 & (-63)) + (i233 | (-63));
                                                                                    objArr18 = objArr19;
                                                                                    length = i157;
                                                                                    Invoke = i234;
                                                                                }
                                                                            } catch (Throwable th2) {
                                                                                Throwable cause2 = th2.getCause();
                                                                                if (cause2 != null) {
                                                                                    throw cause2;
                                                                                }
                                                                                throw th2;
                                                                            }
                                                                        } else {
                                                                            i13 = 16;
                                                                        }
                                                                        int i235 = (i & (-2)) | (i79 & 1);
                                                                        Object[] objArr36 = new Object[4];
                                                                        int[] iArr = new int[1];
                                                                        objArr36[0] = iArr;
                                                                        objArr36[1] = new int[1];
                                                                        int[] iArr2 = new int[1];
                                                                        objArr36[2] = iArr2;
                                                                        int i236 = g;
                                                                        int i237 = i236 + 71;
                                                                        asBinder = i237 % 128;
                                                                        int i238 = i237 % 2 != 0 ? 59 : i13;
                                                                        int i239 = i236 + 17;
                                                                        asBinder = i239 % 128;
                                                                        int i240 = i239 % 2;
                                                                        iArr[0] = i;
                                                                        int i241 = i236 + 123;
                                                                        int i242 = i241 % 128;
                                                                        asBinder = i242;
                                                                        if (i241 % 2 != 0) {
                                                                            ((int[]) objArr36[3])[1] = i235;
                                                                        } else {
                                                                            iArr2[0] = i235;
                                                                        }
                                                                        int i243 = ((i242 | 23) << 1) - (23 ^ i242);
                                                                        g = i243 % 128;
                                                                        if (i243 % 2 == 0) {
                                                                            objArr36[2] = null;
                                                                            int startUptimeMillis = (int) Process.getStartUptimeMillis();
                                                                            i14 = (-981816544) + (((~((-289367745) | startUptimeMillis)) | 287778304) * 345) + (((~((-289367745) | (~startUptimeMillis))) | (-536835820)) * 345) + ((~(startUptimeMillis | (-287778305))) * 345);
                                                                        } else {
                                                                            objArr36[3] = null;
                                                                            int iNextInt = new Random().nextInt();
                                                                            int i244 = ~iNextInt;
                                                                            i14 = (-948607534) + (((~(388880429 | i244)) | (-532545072)) * 98) + (((~(i244 | (-429190659))) | 388880429 | (~(429190658 | iNextInt))) * (-49)) + (((~(iNextInt | 388880429)) | 103354413) * 49);
                                                                        }
                                                                        int i245 = -(-(i14 + i238));
                                                                        int i246 = (i2 ^ i245) + ((i245 & i2) << 1);
                                                                        int i247 = i246 << 13;
                                                                        int i248 = (i247 | i246) & (~(i246 & i247));
                                                                        int i249 = i248 ^ (i248 >>> 17);
                                                                        int i250 = i249 << 5;
                                                                        int i251 = asBinder;
                                                                        int i252 = (i251 & 77) + (i251 | 77);
                                                                        g = i252 % 128;
                                                                        int i253 = i252 % 2;
                                                                        ((int[]) objArr36[1])[0] = (i249 | i250) & (~(i249 & i250));
                                                                        return objArr36;
                                                                    } catch (Throwable th3) {
                                                                        Throwable cause3 = th3.getCause();
                                                                        if (cause3 != null) {
                                                                            throw cause3;
                                                                        }
                                                                        throw th3;
                                                                    }
                                                                } catch (Throwable th4) {
                                                                    th = th4;
                                                                }
                                                            } catch (Throwable th5) {
                                                                Throwable cause4 = th5.getCause();
                                                                if (cause4 != null) {
                                                                    throw cause4;
                                                                }
                                                                throw th5;
                                                            }
                                                        } catch (Throwable th6) {
                                                            Throwable cause5 = th6.getCause();
                                                            if (cause5 != null) {
                                                                throw cause5;
                                                            }
                                                            throw th6;
                                                        }
                                                    } else {
                                                        Invoke = i2;
                                                        int i254 = asBinder + 125;
                                                        g = i254 % 128;
                                                        int i255 = i254 % 2;
                                                    }
                                                }
                                            } catch (Throwable unused) {
                                                Invoke = i2;
                                            }
                                        } catch (Throwable th7) {
                                            Throwable cause6 = th7.getCause();
                                            if (cause6 != null) {
                                                throw cause6;
                                            }
                                            throw th7;
                                        }
                                    } catch (Throwable th8) {
                                        Throwable cause7 = th8.getCause();
                                        if (cause7 != null) {
                                            throw cause7;
                                        }
                                        throw th8;
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                    Throwable cause8 = th.getCause();
                                    if (cause8 != null) {
                                        throw cause8;
                                    }
                                    throw th;
                                }
                            } catch (Throwable th10) {
                                th = th10;
                            }
                        } catch (Throwable th11) {
                            Throwable cause9 = th11.getCause();
                            if (cause9 != null) {
                                throw cause9;
                            }
                            throw th11;
                        }
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable th12) {
                    Throwable cause10 = th12.getCause();
                    if (cause10 != null) {
                        throw cause10;
                    }
                    throw th12;
                }
            } catch (Throwable unused3) {
                Invoke = i2;
            }
        } else {
            Invoke = i2;
        }
        int[] iArr3 = new int[1];
        Object[] objArr37 = {new int[]{i}, iArr3, new int[]{i}, null};
        int i256 = ~i;
        int i257 = (-842985444) + (((~(658379880 | i256)) | (-698690110) | (~((-658379881) | i))) * (-564)) + ((~((-556007465) | i)) * 1128) + (((~((-698690110) | i256)) | 102372416) * 564);
        int i258 = i257 * 965;
        int i259 = ((-964) ^ i258) + ((i258 & (-964)) << 1);
        int i260 = (i259 ^ 964) + ((i259 & 964) << 1);
        int i261 = -(-(((~(~i257)) | (~((~i257) | i256))) * (-964)));
        int i262 = (i260 ^ i261) + ((i261 & i260) << 1);
        int i263 = i262 * (-518);
        int i264 = Invoke * (-518);
        int i265 = (i263 & i264) + (i263 | i264);
        int i266 = ~i262;
        int i267 = ~(i256 | i266);
        int i268 = ((i267 & Invoke) | (Invoke ^ i267)) * 519;
        int i269 = g;
        int i270 = (i269 ^ 71) + ((i269 & 71) << 1);
        asBinder = i270 % 128;
        if (i270 % 2 != 0) {
            int i271 = i265 + i268;
            int i272 = ~i262;
            int i273 = ~i;
            int i274 = (i272 & i273) | (i272 ^ i273);
            int i275 = ~((i274 & Invoke) | ((i274 ^ Invoke) == true ? 1 : 0));
            int i276 = ((i262 ^ Invoke) == true ? 1 : 0) | ((i262 & Invoke) == true ? 1 : 0);
            i3 = i271 >>> ((-519) % (i275 | (~((i276 & i) | (i276 ^ i)))));
        } else {
            int i277 = -(-i268);
            int i278 = (i265 ^ i277) + ((i277 & i265) << 1);
            int i279 = ~i;
            int i280 = (i279 & i266) | (i266 ^ i279);
            int i281 = ~(((i280 & Invoke) == true ? 1 : 0) | ((i280 ^ Invoke) == true ? 1 : 0));
            int i282 = ~(((i262 ^ Invoke) == true ? 1 : 0) | ((i262 & Invoke) == true ? 1 : 0) | i);
            int i283 = -(-(((i281 & i282) | (i281 ^ i282)) * (-519)));
            i3 = ((i278 | i283) << 1) - (i283 ^ i278);
        }
        int i284 = ~(i | Invoke);
        int i285 = -(-(519 * ((i284 & i262) | (i262 ^ i284))));
        int i286 = (i3 & i285) + (i285 | i3);
        int i287 = i286 << 13;
        int i288 = (i287 | i286) & (~(i286 & i287));
        int i289 = i288 >>> 17;
        int i290 = ((~i288) & i289) | ((~i289) & i288);
        int i291 = i290 << 5;
        iArr3[0] = ((~i290) & i291) | ((~i291) & i290);
        return objArr37;
    }

    private static String $$c(byte b2, byte b3, short s) {
        byte[] bArr = $$a;
        int i = s * 2;
        int i2 = (b3 * 4) + 108;
        int i3 = 4 - (b2 * 4);
        byte[] bArr2 = new byte[1 - i];
        int i4 = 0 - i;
        int i5 = -1;
        if (bArr == null) {
            i2 = i3 + (-i2);
            i3++;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            int i6 = i2;
            int i7 = i3 + 1;
            i2 = i6 + (-bArr[i3]);
            i3 = i7;
        }
    }
}
