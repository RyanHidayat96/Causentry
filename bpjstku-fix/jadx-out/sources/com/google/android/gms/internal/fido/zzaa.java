package com.google.android.gms.internal.fido;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.abortCapture;
import defpackage.deInitSession;
import defpackage.getServiceInfo;
import defpackage.initSession;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Random;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes6.dex */
public final class zzaa {
    private static final byte[] $$a = {81, 125, 2, 46};
    private static final int $$b = 181;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static char[] b = {60053, 60054, 60082, 60119, 60061, 59750, 60059, 60102, 60110, 60058, 60050, 60117, 60123, 59745, 60043, 60047, 59744, 60063, 59749, 60049, 60088, 60052, 60072, 60045, 60057, 60034, 60040, 60078, 60048, 60085, 60090, 60093, 60075, 59748, 60041, 60062, 60060, 60084, 59746, 60107, 60046, 59751, 60056, 60055, 59747, 60098, 60086, 60095, 60067};
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 57190;
    private static long TuitionPaymentFragmentbindingInflater1 = 5697904720741265620L;

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentbindingInflater1 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        int i3 = $11 + 95;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (true) {
            obj = null;
            if (abortcapture.b >= cArrB.length) {
                break;
            }
            int i5 = $11 + 91;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i7 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentbindingInflater1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64837 - MotionEvent.axisFromString("")), (Process.myPid() >> 22) + 1356, 38 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 894276454, false, $$c(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {abortcapture, abortcapture};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((KeyEvent.getMaxKeyCode() >> 16) + 47773), KeyEvent.normalizeMetaState(0) + 468, 13 - View.resolveSizeAndState(0, 0, 0), 896083767, false, "n", new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
        int i8 = $10 + 9;
        $11 = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        char c;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = b;
        int i4 = 1770390596;
        long j = 0;
        int i5 = 6;
        char c2 = '\b';
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = $11 + 123;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b3 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 2267 - (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) + 32, -1927765101, false, $$c((byte) i5, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i8++;
                    i4 = 1770390596;
                    j = 0;
                    i5 = 6;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                byte b4 = (byte) 0;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 2266 - ImageFormat.getBitsPerPixel(0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 32, -1927765101, false, $$c((byte) 6, b4, b4), new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i9 = $10 + 53;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b2);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        int i11 = $10 + 13;
                        $11 = i11 % 128;
                        int i12 = i11 % 2;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                        c = c2;
                    } else {
                        Object[] objArr4 = new Object[13];
                        objArr4[12] = deinitsession;
                        objArr4[11] = Integer.valueOf(cCharValue);
                        objArr4[10] = deinitsession;
                        objArr4[9] = deinitsession;
                        objArr4[c2] = Integer.valueOf(cCharValue);
                        objArr4[7] = deinitsession;
                        objArr4[6] = deinitsession;
                        objArr4[5] = Integer.valueOf(cCharValue);
                        objArr4[4] = deinitsession;
                        objArr4[3] = deinitsession;
                        objArr4[2] = Integer.valueOf(cCharValue);
                        objArr4[1] = deinitsession;
                        objArr4[0] = deinitsession;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b5 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 49266), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3261, 31 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -127612708, false, $$c((byte) 7, b5, b5), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                            Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b6 = (byte) 0;
                                c = '\b';
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 22878), 595 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 17 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1570859318, false, $$c((byte) 9, b6, b6), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            } else {
                                c = '\b';
                            }
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                            int i13 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i13];
                        } else {
                            c = '\b';
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                int i14 = $11 + 119;
                                $10 = i14 % 128;
                                int i15 = i14 % 2;
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i16 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i16];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i17];
                            } else {
                                int i18 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i19 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i18];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i19];
                            }
                        }
                    }
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                    c2 = c;
                }
            }
            int i20 = 0;
            while (i20 < i) {
                int i21 = $11;
                int i22 = i21 + 119;
                $10 = i22 % 128;
                int i23 = i22 % 2;
                cArr4[i20] = (char) (cArr4[i20] ^ 13722);
                i20++;
                int i24 = i21 + 7;
                $10 = i24 % 128;
                int i25 = i24 % 2;
            }
            objArr[0] = new String(cArr4);
            int i26 = $11 + 111;
            $10 = i26 % 128;
            int i27 = i26 % 2;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v147, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v164, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v181 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v204 */
    /* JADX WARN: Type inference failed for: r5v205 */
    /* JADX WARN: Type inference failed for: r5v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v71 */
    /* JADX WARN: Type inference failed for: r5v72 */
    /* JADX WARN: Type inference failed for: r6v73, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r9v1 */
    public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context context, int i, int i2) {
        int i3;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4;
        Object[] objArr;
        char[] cArr;
        int maximumDrawingCacheSize;
        int i5;
        Class<?> cls;
        char[] cArr2;
        Class<?> cls2;
        char[] cArr3;
        int i6;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i7;
        int i8;
        int i9;
        char c;
        int iMakeMeasureSpec;
        byte b2;
        int i10;
        Object[] objArr2;
        char[] cArr4;
        int i11;
        int threadPriority;
        Class<?> cls3;
        char[] cArr5;
        int i12;
        int i13;
        char c2;
        int i14 = i2;
        ?? Invoke = 2 % 2;
        if (context != null) {
            try {
                char[] cArr6 = {15, Typography.quote, '\t', 28, 3, 14, 28, 27, 17, 24, 19, 5, Typography.amp, 21, ')', '%', 2, Typography.amp, '\t', 28, 3, 14, 28, 27, 17, 24, 6, 17, '\r', 21, 13886};
                int bitsPerPixel = ImageFormat.getBitsPerPixel(0);
                int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 9;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15 % 128;
                int i16 = i15 % 2;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i17 = bitsPerPixel * (-947);
                int i18 = (i17 ^ 111982) + ((i17 & 111982) << 1);
                int i19 = ~bitsPerPixel;
                int i20 = ((~(((-119) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | ((-119) & iTuitionPaymentFragmentspecialinlinedviewModeldefault3))) | i19) * (-948);
                int i21 = (i18 & i20) + (i18 | i20);
                int i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 123;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i22 % 128;
                try {
                    if (i22 % 2 == 0) {
                        throw null;
                    }
                    int i23 = (i19 & (-119)) | (i19 ^ (-119));
                    int i24 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i25 = (~((i24 & i23) | (i23 ^ i24))) * (-948);
                    int i26 = (i21 ^ i25) + ((i21 & i25) << 1);
                    int i27 = -(-(((bitsPerPixel & (-119)) | (bitsPerPixel ^ (-119))) * 948));
                    byte b3 = (byte) ((i26 ^ i27) + ((i27 & i26) << 1));
                    int i28 = -View.MeasureSpec.getSize(0);
                    int i29 = (i28 ^ 31) + ((i28 & 31) << 1);
                    Object[] objArr3 = new Object[1];
                    a(cArr6, b3, i29, objArr3);
                    try {
                        Object[] objArr4 = {(String) objArr3[0]};
                        char[] cArr7 = {639, 533, 17401, 15127, 22826, 3589, 21499, 908, 26831, 50861, 39752, 59712, 55180, 46030, 12689, 30260, 16979, 6282, 20101, 50164, 43306, 34399, 56315, 43235, 6127, 29526, 28779, 13877, 33505, 55491, 36150, 33549, 59703, 17795, 7097, 26652, 21585, 13160, 45274, 62941, 49942, 38959};
                        int gidForName = (-1) - Process.getGidForName("");
                        int i30 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i31 = (i30 ^ 111) + ((i30 & 111) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i31 % 128;
                        int i32 = i31 % 2;
                        Object[] objArr5 = new Object[1];
                        c(cArr7, gidForName, objArr5);
                        Object objNewInstance = Class.forName((String) objArr5[0]).getDeclaredConstructor(String.class).newInstance(objArr4);
                        char[] cArr8 = {52374, 52437, 25642, 47764, 32421, 36773, 39115, 51342, 42610, 57631, 6789, 8788, 6504, 37900, 45074, 48386, 36007, 16196, 52996, 2278, 26616, 41413, 23121, 25491, 55578, 21698, 61879, 64860, 19522, 65384, 3268, 18536, 10124, 25205, 39471};
                        int i33 = -TextUtils.lastIndexOf("", '0');
                        int i34 = i33 * (-432);
                        int i35 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i35 % 128;
                        int i36 = i35 % 2 == 0 ? i34 / 0 : i34 - 434;
                        int i37 = ~i33;
                        int i38 = ~i;
                        int i39 = (i37 ^ i38) | (i37 & i38);
                        int i40 = i36 + (433 * (~(i39 | (i39 ^ (-1)))));
                        int i41 = ~i33;
                        int i42 = (i40 - (~(-(-(((~i) | i41) * (-433)))))) - 1;
                        int i43 = ~i33;
                        int i44 = ~((i43 ^ i) | (i43 & i));
                        int i45 = ~(i33 | i41);
                        int i46 = ((i45 & i44) | (i44 ^ i45)) * 433;
                        int i47 = (i42 & i46) + (i46 | i42);
                        Object[] objArr6 = new Object[1];
                        c(cArr8, i47, objArr6);
                        String str = (String) objArr6[0];
                        int i48 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i48 % 128;
                        try {
                            if (i48 % 2 != 0) {
                                objArr = new Object[1];
                                objArr[1] = str;
                                cArr = new char[]{639, 533, 17401, 15127, 22826, 3589, 21499, 908, 26831, 50861, 39752, 59712, 55180, 46030, 12689, 30260, 16979, 6282, 20101, 50164, 43306, 34399, 56315, 43235, 6127, 29526, 28779, 13877, 33505, 55491, 36150, 33549, 59703, 17795, 7097, 26652, 21585, 13160, 45274, 62941, 49942, 38959};
                                maximumDrawingCacheSize = ViewConfiguration.getMaximumDrawingCacheSize();
                                i5 = 126;
                            } else {
                                objArr = new Object[]{str};
                                cArr = new char[]{639, 533, 17401, 15127, 22826, 3589, 21499, 908, 26831, 50861, 39752, 59712, 55180, 46030, 12689, 30260, 16979, 6282, 20101, 50164, 43306, 34399, 56315, 43235, 6127, 29526, 28779, 13877, 33505, 55491, 36150, 33549, 59703, 17795, 7097, 26652, 21585, 13160, 45274, 62941, 49942, 38959};
                                maximumDrawingCacheSize = ViewConfiguration.getMaximumDrawingCacheSize();
                                i5 = 24;
                            }
                            int i49 = maximumDrawingCacheSize >> i5;
                            Object[] objArr7 = new Object[1];
                            c(cArr, i49, objArr7);
                            Object objNewInstance2 = Class.forName((String) objArr7[0]).getDeclaredConstructor(String.class).newInstance(objArr);
                            int i50 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i51 = (i50 & 77) + (i50 | 77);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i51 % 128;
                            int i52 = i51 % 2;
                            try {
                                Object[] objArr8 = new Object[1];
                                c(new char[]{16969, 16936, 24966, 33176, 31578, 46232, 49116, 61368, 10478, 58517, 8656, 1324, 38842, 37291, 35586, 39438, 628, 15074, 62544, 12188, 59690, 42043, 24946, 17566, 22468, 20836, 51872}, Color.green(0), objArr8);
                                Class<?> cls4 = Class.forName((String) objArr8[0]);
                                char[] cArr9 = {'%', Typography.dollar, 18, 29, 7, ',', 30, 7, '%', Typography.dollar, ',', 11, 2, 7, '%', Typography.dollar, 13918};
                                int keyRepeatTimeout = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                                int i53 = keyRepeatTimeout * 273;
                                int i54 = ((i53 | (-31978)) << 1) - (i53 ^ (-31978));
                                int i55 = ~keyRepeatTimeout;
                                int i56 = i55 | (-119);
                                int i57 = ~i;
                                int i58 = ~((i56 ^ i57) | (i56 & i57));
                                int i59 = (keyRepeatTimeout ^ 118) | (keyRepeatTimeout & 118);
                                int i60 = ~((i59 ^ i) | (i59 & i));
                                int i61 = i54 + (((i58 ^ i60) | (i58 & i60)) * (-272));
                                int i62 = ~keyRepeatTimeout;
                                int i63 = ((~((i62 & 118) | (i62 ^ 118))) | (~((i55 ^ i) | (i55 & i)))) * (-272);
                                int i64 = (i61 & i63) + (i61 | i63);
                                int i65 = ~((keyRepeatTimeout ^ i) | (keyRepeatTimeout & i));
                                int i66 = -(-(((i65 & 118) | (i65 ^ 118)) * 272));
                                byte b4 = (byte) ((i64 ^ i66) + ((i66 & i64) << 1));
                                int i67 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                int i68 = ((i67 | 17) << 1) - (i67 ^ 17);
                                Object[] objArr9 = new Object[1];
                                a(cArr9, b4, i68, objArr9);
                                Invoke = cls4.getMethod((String) objArr9[0], null).invoke(context, null);
                                int i69 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i70 = ((i69 | 45) << 1) - (i69 ^ 45);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i70 % 128;
                                try {
                                    if (i70 % 2 == 0) {
                                        Object[] objArr10 = new Object[1];
                                        c(new char[]{16969, 16936, 24966, 33176, 31578, 46232, 49116, 61368, 10478, 58517, 8656, 1324, 38842, 37291, 35586, 39438, 628, 15074, 62544, 12188, 59690, 42043, 24946, 17566, 22468, 20836, 51872}, View.combineMeasuredStates(1, 0), objArr10);
                                        cls = Class.forName((String) objArr10[0]);
                                        cArr2 = new char[]{'%', Typography.dollar, 18, 29, 7, ',', 30, 7, '%', Typography.dollar, 30, '\b', 0, Typography.dollar};
                                    } else {
                                        Object[] objArr11 = new Object[1];
                                        c(new char[]{16969, 16936, 24966, 33176, 31578, 46232, 49116, 61368, 10478, 58517, 8656, 1324, 38842, 37291, 35586, 39438, 628, 15074, 62544, 12188, 59690, 42043, 24946, 17566, 22468, 20836, 51872}, View.combineMeasuredStates(0, 0), objArr11);
                                        cls = Class.forName((String) objArr11[0]);
                                        cArr2 = new char[]{'%', Typography.dollar, 18, 29, 7, ',', 30, 7, '%', Typography.dollar, 30, '\b', 0, Typography.dollar};
                                    }
                                    byte bIndexOf = (byte) TextUtils.indexOf("", "");
                                    int i71 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                    int i72 = i71 * (-755);
                                    int i73 = (i72 ^ (-10570)) + ((i72 & (-10570)) << 1);
                                    int i74 = ~i71;
                                    int i75 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 21;
                                    int i76 = i75 % 128;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i76;
                                    int i77 = i75 % 2;
                                    int i78 = -(-(1512 * (~((i74 ^ (-15)) | (i74 & (-15))))));
                                    int i79 = (i73 ^ i78) + ((i78 & i73) << 1);
                                    int i80 = ~i71;
                                    int i81 = ~((i80 & (-15)) | (i80 ^ (-15)));
                                    int i82 = (i76 ^ 55) + ((i76 & 55) << 1);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i82 % 128;
                                    int i83 = i82 % 2;
                                    int i84 = (i71 ^ 14) | (i71 & 14);
                                    int i85 = ~(i84 | i);
                                    int i86 = (-756) * ((i81 & i85) | (i81 ^ i85));
                                    int i87 = (i79 & i86) + (i86 | i79);
                                    int i88 = ~i;
                                    Object[] objArr12 = new Object[1];
                                    a(cArr2, bIndexOf, i87 + (((i84 & i88) | (i84 ^ i88)) * 756), objArr12);
                                    Method method = cls.getMethod((String) objArr12[0], null);
                                    int i89 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i89 % 128;
                                    int i90 = i89 % 2;
                                    Object objInvoke = method.invoke(context, null);
                                    int i91 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    int i92 = (i91 & 107) + (i91 | 107);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i92 % 128;
                                    int i93 = i92 % 2;
                                    try {
                                        Object[] objArr13 = new Object[1];
                                        c(new char[]{11879, 11782, 30703, 58085, 27955, 55269, 41825, 62213, 17600, 62204, 17069, 6545, 64404, 34754, 59519, 34483, 28250, 11403, 38701, 13089, 34103, 45648, 591, 22535, 15342, 18198, 43458, 50942, 44720, 60648, 21692, 29638, 50545, 29092, 49758, 39050, 30805}, View.resolveSize(0, 0), objArr13);
                                        Class<?> cls5 = Class.forName((String) objArr13[0]);
                                        Object[] objArr14 = new Object[1];
                                        c(new char[]{52329, 52238, 18905, 38398, 21262, 41198, 33734, 54144, 42688, 52416, 13753, 14713, 6558, 47614, 40771, 42510, 35927, 4796}, ExpandableListView.getPackedPositionGroup(0L), objArr14);
                                        Invoke = cls5.getMethod((String) objArr14[0], String.class, Integer.TYPE).invoke(Invoke, objInvoke, 64);
                                        char[] cArr10 = {7, 2, 20, 31, 24, 7, 18, '\n', 0, 28, 1, 14, '*', 7, 18, '\b', 15, 0, 18, '\'', 7, ',', 30, 7, '%', Typography.dollar, 3, 1, 0, 25};
                                        byte mirror = (byte) (146 - AndroidCharacter.getMirror('0'));
                                        int i94 = -(ViewConfiguration.getTapTimeout() >> 16);
                                        int i95 = ((i94 | 30) << 1) - (i94 ^ 30);
                                        Object[] objArr15 = new Object[1];
                                        a(cArr10, mirror, i95, objArr15);
                                        Class<?> cls6 = Class.forName((String) objArr15[0]);
                                        int i96 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                        int i97 = ~(~i96);
                                        int i98 = ~i96;
                                        int i99 = (((i96 * (-751)) + 751) - (~(-(-(((~(i98 | iTuitionPaymentFragmentspecialinlinedviewModeldefault4)) | i97) * 1504))))) - 1;
                                        int i100 = (~i98) | i98;
                                        int i101 = i99 + ((~((i100 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault4 & i100))) * (-1504));
                                        int i102 = ~i100;
                                        int i103 = ~i96;
                                        int i104 = (i101 - (~(-(-(((i102 & i103) | (i102 ^ i103)) * 752))))) - 1;
                                        Object[] objArr16 = new Object[1];
                                        c(new char[]{41371, 41448, 56498, 12619, 50793, 1096, 27120, 14728, 52018, 22972, 37138, 54108, 29806, 11395}, i104, objArr16);
                                        Object[] objArr17 = (Object[]) cls6.getField((String) objArr16[0]).get(Invoke);
                                        int length = objArr17.length;
                                        int i105 = 0;
                                        while (true) {
                                            if (i105 < length) {
                                                Object obj = objArr17[i105];
                                                char[] cArr11 = {'.', '\r', 11, Typography.dollar, 13759};
                                                int i106 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                int i107 = (i106 * 284) - 7614;
                                                int i108 = ~i106;
                                                Object[] objArr18 = objArr17;
                                                int i109 = ~((i108 ^ 27) | (i108 & 27));
                                                int i110 = length;
                                                int i111 = ~i106;
                                                int i112 = ~((i111 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i111 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                                                int i113 = ((i109 ^ i112) | (i109 & i112)) * (-283);
                                                int i114 = ((((i107 | i113) << 1) - (i113 ^ i107)) - (~(-(-((~(((-28) & i106) | ((-28) ^ i106))) * 283))))) - 1;
                                                int i115 = i108 | (-28);
                                                int i116 = -(-((~((i115 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i115 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5))) * 283));
                                                byte b5 = (byte) ((i114 & i116) + (i116 | i114));
                                                int i117 = -MotionEvent.axisFromString("");
                                                int i118 = (i117 ^ 4) + ((i117 & 4) << 1);
                                                Object[] objArr19 = new Object[1];
                                                a(cArr11, b5, i118, objArr19);
                                                String str2 = (String) objArr19[0];
                                                int i119 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 57;
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i119 % 128;
                                                int i120 = i119 % 2;
                                                try {
                                                    Object[] objArr20 = {str2};
                                                    char[] cArr12 = {16, '\f', 30, 16, '\f', 25, '*', 0, ')', '!', '\b', 17, ' ', 18, 0, '*', 29, 20, '\r', 18, ')', 28, 17, '\b', 3, 11, ',', 7, 14, Typography.dollar, 30, '\n', '+', 14, 27, 28, 13913};
                                                    byte b6 = (byte) (117 - (~(-(ViewConfiguration.getTouchSlop() >> 8))));
                                                    int i121 = -Color.green(0);
                                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                    int i122 = (i121 * 868) + 32116;
                                                    int i123 = ~i121;
                                                    int i124 = i88;
                                                    int i125 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                                    int i126 = ~((i123 ^ i125) | (i123 & i125));
                                                    int i127 = i105;
                                                    int i128 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                                    int i129 = ~(((-38) ^ i128) | ((-38) & i128));
                                                    int i130 = ((i126 ^ i129) | (i126 & i129)) * (-867);
                                                    int i131 = ((i122 | i130) << 1) - (i130 ^ i122);
                                                    int i132 = ~i121;
                                                    int i133 = ~((i132 ^ (-38)) | (i132 & (-38)));
                                                    int i134 = ~((i132 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i132 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                                                    int i135 = (i133 ^ i134) | (i134 & i133);
                                                    int i136 = ~(((-38) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | ((-38) & iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                                                    int i137 = (i131 - (~(((i135 ^ i136) | (i135 & i136)) * (-1734)))) - 1;
                                                    int i138 = i123 | (-38);
                                                    int i139 = ~((i138 & i125) | (i138 ^ i125));
                                                    int i140 = (i123 ^ 37) | (i123 & 37);
                                                    int i141 = ~((i140 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i140 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                                                    int i142 = (i139 & i141) | (i139 ^ i141);
                                                    int i143 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i143 % 128;
                                                    if (i143 % 2 != 0) {
                                                        int i144 = ((-38) ^ i121) | ((-38) & i121);
                                                        int i145 = ~((i144 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i144 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                                                        int i146 = i137 * (867 >>> ((i142 & i145) | (i142 ^ i145)));
                                                        try {
                                                            Object[] objArr21 = new Object[1];
                                                            a(cArr12, b6, i146, objArr21);
                                                            cls2 = Class.forName((String) objArr21[0]);
                                                            cArr3 = new char[]{'%', Typography.dollar, 16, 1, 5, 21, 16, '\b', 7, 0, 13860};
                                                            i6 = -TextUtils.getCapsMode("", 0, 0);
                                                            iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                            i7 = 33;
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            Throwable cause = th.getCause();
                                                            if (cause != null) {
                                                                throw cause;
                                                            }
                                                            throw th;
                                                        }
                                                    } else {
                                                        int i147 = ((-38) ^ i121) | ((-38) & i121);
                                                        int i148 = ~((i147 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i147 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                                                        int i149 = ((i142 & i148) | (i142 ^ i148)) * 867;
                                                        int i150 = (i137 & i149) + (i149 | i137);
                                                        Object[] objArr22 = new Object[1];
                                                        a(cArr12, b6, i150, objArr22);
                                                        cls2 = Class.forName((String) objArr22[0]);
                                                        cArr3 = new char[]{'%', Typography.dollar, 16, 1, 5, 21, 16, '\b', 7, 0, 13860};
                                                        i6 = -TextUtils.getCapsMode("", 0, 0);
                                                        iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                        i7 = 37;
                                                    }
                                                    int i151 = (((i6 * (-963)) - 964) - (~(i7 * 965))) - 1;
                                                    int i152 = ~i6;
                                                    int i153 = ~i7;
                                                    int i154 = ~((i153 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i153 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                                                    int i155 = -(-(((i152 ^ i154) | (i152 & i154)) * (-964)));
                                                    int i156 = (i151 & i155) + (i151 | i155);
                                                    int i157 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | i153);
                                                    int i158 = ~((i6 & i153) | (i153 ^ i6));
                                                    int i159 = ((i158 & i157) | (i157 ^ i158)) * (-964);
                                                    int i160 = -TextUtils.getTrimmedLength("");
                                                    Object[] objArr23 = new Object[1];
                                                    a(cArr3, (byte) ((i156 & i159) + (i159 | i156)), (i160 & 11) + (i160 | 11), objArr23);
                                                    Object objInvoke2 = cls2.getMethod((String) objArr23[0], String.class).invoke(null, objArr20);
                                                    try {
                                                        Invoke = 28;
                                                        Invoke = 28;
                                                        try {
                                                            char[] cArr13 = {7, 2, 20, 31, 24, 7, 18, '\n', 0, 28, 1, 14, '*', 7, 18, '\b', 15, 0, '\b', 25, '\b', Typography.amp, 2, 7, 19, Typography.dollar, 28, ')'};
                                                            int i161 = -KeyEvent.getDeadChar(0, 0);
                                                            int i162 = i161 * 141;
                                                            int i163 = ((i162 | (-24552)) << 1) - (i162 ^ (-24552));
                                                            int i164 = (-1909872605) - (~(((~((i57 ^ (-1125819750)) | (i57 & (-1125819750)))) | 1091608928) * 529));
                                                            int i165 = ~(((-1125819750) & i) | ((-1125819750) ^ i));
                                                            int i166 = ((i165 & (-571163808)) | ((-571163808) ^ i165)) * 529;
                                                            int i167 = ((i164 | i166) << 1) - (i166 ^ i164);
                                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                            int i168 = ~(((-42012860) & iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | ((-42012860) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
                                                            int i169 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                                                            int i170 = 944693316 | i169;
                                                            int i171 = ~((i170 ^ 449671359) | (i170 & 449671359));
                                                            int i172 = -(-(((i168 ^ i171) | (i171 & i168)) * 920));
                                                            int i173 = (((-341353974) | i172) << 1) - (i172 ^ (-341353974));
                                                            int i174 = ((~(((-449671360) & i169) | ((-449671360) ^ i169))) | 42012859) * 920;
                                                            int i175 = ((i173 | i174) << 1) - (i173 ^ i174);
                                                            int i176 = ~(((-42012860) ^ i169) | ((-42012860) & i169));
                                                            int i177 = ~(((-407658501) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | ((-407658501) & iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
                                                            int i178 = (i176 ^ i177) | (i176 & i177);
                                                            int i179 = ~((986706175 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault7 & 986706175));
                                                            int i180 = -(-(((i178 & i179) | (i178 ^ i179)) * 920));
                                                            int i181 = ((i175 | i180) << 1) - (i180 ^ i175);
                                                            int i182 = i ^ 88;
                                                            if (i167 > i181) {
                                                                int i183 = -(-(139 - (~(-(-(i182 | (i & 88)))))));
                                                                i8 = ((i163 | i183) << 1) - (i183 ^ i163);
                                                                i9 = (~i161) | 88;
                                                            } else {
                                                                i8 = i163 + ((i182 | (i & 88)) * 140);
                                                                int i184 = ~i161;
                                                                i9 = (i184 & 88) | (i184 ^ 88);
                                                            }
                                                            int i185 = (i8 - (~((-280) * ((~i9) | (~((i57 ^ 88) | (i57 & 88))))))) - 1;
                                                            int i186 = ~(((-89) & i161) | ((-89) ^ i161));
                                                            int i187 = ~((i57 ^ i161) | (i57 & i161));
                                                            int i188 = (i186 & i187) | (i186 ^ i187);
                                                            int i189 = ~i161;
                                                            int i190 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                            int i191 = (i190 ^ 67) + ((i190 & 67) << 1);
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i191 % 128;
                                                            int i192 = i191 % 2;
                                                            int i193 = (i189 & 88) | (i189 ^ 88);
                                                            int i194 = ~((i193 & i) | (i193 ^ i));
                                                            int i195 = (i188 & i194) | (i188 ^ i194);
                                                            if (i192 == 0) {
                                                                int i196 = -i195;
                                                                byte b7 = (byte) (i185 << ((i196 ^ 140) + ((i196 & 140) << 1)));
                                                                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                                                                b2 = b7;
                                                                i10 = 110;
                                                                c = 0;
                                                            } else {
                                                                c = 0;
                                                                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                                                                b2 = (byte) (i185 + (i195 * 140));
                                                                i10 = 28;
                                                            }
                                                            int i197 = (i10 ^ iMakeMeasureSpec) + ((i10 & iMakeMeasureSpec) << 1);
                                                            Object[] objArr24 = new Object[1];
                                                            a(cArr13, b2, i197, objArr24);
                                                            Class<?> cls7 = Class.forName((String) objArr24[c]);
                                                            Object[] objArr25 = new Object[1];
                                                            c(new char[]{40344, 40428, 51517, 1192, 54240, 12686, 60226, 47917, 63268, 19490, 42181, 20974, 18554, 14622, 3621}, ExpandableListView.getPackedPositionType(0L), objArr25);
                                                            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[]) cls7.getMethod((String) objArr25[0], null).invoke(obj, null));
                                                            int i198 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                            int i199 = (i198 & 75) + (i198 | 75);
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i199 % 128;
                                                            if (i199 % 2 == 0) {
                                                                Invoke = 1;
                                                                try {
                                                                    objArr2 = new Object[1];
                                                                    objArr2[1] = byteArrayInputStream;
                                                                    cArr4 = new char[]{16, '\f', 30, 16, '\f', 25, '*', 0, ')', '!', '\b', 17, ' ', 18, 0, '*', 29, 20, '\r', 18, ')', 28, 17, '\b', 3, 11, ',', 7, 14, Typography.dollar, 30, '\n', '+', 14, 27, 28, 13913};
                                                                    threadPriority = Process.getThreadPriority(1);
                                                                    i11 = 98;
                                                                    Invoke = 98;
                                                                } catch (Throwable th2) {
                                                                    Throwable cause2 = th2.getCause();
                                                                    if (cause2 != null) {
                                                                        throw cause2;
                                                                    }
                                                                    throw th2;
                                                                }
                                                            } else {
                                                                objArr2 = new Object[]{byteArrayInputStream};
                                                                cArr4 = new char[]{16, '\f', 30, 16, '\f', 25, '*', 0, ')', '!', '\b', 17, ' ', 18, 0, '*', 29, 20, '\r', 18, ')', 28, 17, '\b', 3, 11, ',', 7, 14, Typography.dollar, 30, '\n', '+', 14, 27, 28, 13913};
                                                                i11 = 118;
                                                                threadPriority = Process.getThreadPriority(0);
                                                            }
                                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                            int i200 = -(-(threadPriority * 242));
                                                            int i201 = (9660 ^ i200) + ((i200 & 9660) << 1);
                                                            int i202 = ~threadPriority;
                                                            int i203 = ~((i202 & (-21)) | ((-21) ^ i202));
                                                            int i204 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                                                            int i205 = ~((i204 & (-21)) | ((-21) ^ i204));
                                                            int i206 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                            int i207 = ((i206 | 105) << 1) - (i206 ^ 105);
                                                            int i208 = i57;
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i207 % 128;
                                                            int i209 = i207 % 2;
                                                            int i210 = (-241) * ((i203 ^ i205) | (i203 & i205));
                                                            int i211 = (i201 ^ i210) + ((i210 & i201) << 1) + (((20 ^ threadPriority) | (20 & threadPriority)) * (-482));
                                                            int i212 = ~threadPriority;
                                                            int i213 = ~((20 & i212) | (i212 ^ 20));
                                                            int i214 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                                                            int i215 = ~(threadPriority | (i214 & (-21)) | ((-21) ^ i214));
                                                            int i216 = i211 + (((i215 & i213) | (i213 ^ i215)) * 241);
                                                            int i217 = (i206 ^ 101) + ((i206 & 101) << 1);
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i217 % 128;
                                                            if (i217 % 2 != 0) {
                                                                Object[] objArr26 = new Object[1];
                                                                a(cArr4, (byte) (i11 * (i216 + 6)), 30 / ExpandableListView.getPackedPositionType(1L), objArr26);
                                                                cls3 = Class.forName((String) objArr26[0]);
                                                                cArr5 = new char[]{'%', Typography.dollar, 7, '*', 30, '\r', 14, Typography.dollar, 14, ')', 29, 20, 11, 3, 7, '-', '\b', 16, 13856};
                                                                i12 = 89;
                                                                i13 = 1;
                                                            } else {
                                                                int i218 = -(-(i216 >> 6));
                                                                byte b8 = (byte) (((i11 | i218) << 1) - (i218 ^ i11));
                                                                int i219 = -ExpandableListView.getPackedPositionType(0L);
                                                                int i220 = (i219 ^ 37) + ((i219 & 37) << 1);
                                                                Object[] objArr27 = new Object[1];
                                                                a(cArr4, b8, i220, objArr27);
                                                                cls3 = Class.forName((String) objArr27[0]);
                                                                cArr5 = new char[]{'%', Typography.dollar, 7, '*', 30, '\r', 14, Typography.dollar, 14, ')', 29, 20, 11, 3, 7, '-', '\b', 16, 13856};
                                                                i12 = 33;
                                                                i13 = 0;
                                                            }
                                                            Object[] objArr28 = new Object[1];
                                                            a(cArr5, (byte) (i12 + (ExpandableListView.getPackedPositionForGroup(i13) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i13) == 0L ? 0 : -1))), (ViewConfiguration.getPressedStateDuration() >> 16) + 19, objArr28);
                                                            Invoke = (String) objArr28[0];
                                                            Object objInvoke3 = cls3.getMethod(Invoke, InputStream.class).invoke(objInvoke2, objArr2);
                                                            int i221 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i221 % 128;
                                                            if (i221 % 2 != 0) {
                                                                int i222 = 5 % 2;
                                                            }
                                                            try {
                                                                Object[] objArr29 = new Object[1];
                                                                c(new char[]{9942, 9916, 62105, 31689, 59466, 20187, 12563, 24932, 19504, 30608, 56192, 35758, 62259, 681, 29012, 5313, 26359, 43453, 3606, 41240, 36228, 14143, 39779, 51837, 13067, 49715, 12476, 21678, 42499, 27017, 52649, 57788, 52680, 62682, 23414, 2812, 28898, 33294}, ViewConfiguration.getScrollBarSize() >> 8, objArr29);
                                                                Class<?> cls8 = Class.forName((String) objArr29[0]);
                                                                char[] cArr14 = {'%', Typography.dollar, 22, 29, Typography.amp, 26, 14, '(', '+', 14, '+', '\r', 13770, 13770, '!', 28, 7, 3, '-', 7, 16, 7, 13846};
                                                                int i223 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                int i224 = i223 * 868;
                                                                int i225 = (i224 ^ 27776) + ((i224 & 27776) << 1);
                                                                int i226 = ~i223;
                                                                int i227 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                                                                int i228 = ~((i227 & i226) | (i226 ^ i227));
                                                                int i229 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                                                                int i230 = ~(((-33) ^ i229) | ((-33) & i229));
                                                                int i231 = ((i228 ^ i230) | (i230 & i228)) * (-867);
                                                                int i232 = (i225 ^ i231) + ((i231 & i225) << 1);
                                                                int i233 = ~((i226 ^ (-33)) | (i226 & (-33)));
                                                                int i234 = ~((i226 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9) | (i226 & iTuitionPaymentFragmentspecialinlinedviewModeldefault9));
                                                                int i235 = (i233 ^ i234) | (i233 & i234);
                                                                int i236 = ~(((-33) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9) | ((-33) & iTuitionPaymentFragmentspecialinlinedviewModeldefault9));
                                                                int i237 = -(-(((i235 ^ i236) | (i235 & i236)) * (-1734)));
                                                                int i238 = ((i232 | i237) << 1) - (i237 ^ i232);
                                                                int i239 = i226 | (-33);
                                                                int i240 = i226 | 32;
                                                                int i241 = (~((i240 & iTuitionPaymentFragmentspecialinlinedviewModeldefault9) | (i240 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9))) | (~((i239 & i229) | (i239 ^ i229)));
                                                                int i242 = (i223 & (-33)) | ((-33) ^ i223);
                                                                int i243 = ~((i242 & iTuitionPaymentFragmentspecialinlinedviewModeldefault9) | (i242 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9));
                                                                int i244 = ((i243 & i241) | (i241 ^ i243)) * 867;
                                                                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L);
                                                                int i245 = ((packedPositionGroup | 23) << 1) - (packedPositionGroup ^ 23);
                                                                Object[] objArr30 = new Object[1];
                                                                a(cArr14, (byte) ((i238 & i244) + (i244 | i238)), i245, objArr30);
                                                                Invoke = (String) objArr30[0];
                                                                if (!objNewInstance.equals(cls8.getMethod(Invoke, null).invoke(objInvoke3, null))) {
                                                                    int i246 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                                    int i247 = (i246 & 55) + (i246 | 55);
                                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i247 % 128;
                                                                    int i248 = i247 % 2;
                                                                    try {
                                                                        int i249 = -AndroidCharacter.getMirror('0');
                                                                        int i250 = ((i249 | 48) << 1) - (i249 ^ 48);
                                                                        Object[] objArr31 = new Object[1];
                                                                        c(new char[]{9942, 9916, 62105, 31689, 59466, 20187, 12563, 24932, 19504, 30608, 56192, 35758, 62259, 681, 29012, 5313, 26359, 43453, 3606, 41240, 36228, 14143, 39779, 51837, 13067, 49715, 12476, 21678, 42499, 27017, 52649, 57788, 52680, 62682, 23414, 2812, 28898, 33294}, i250, objArr31);
                                                                        Class<?> cls9 = Class.forName((String) objArr31[0]);
                                                                        char[] cArr15 = {'%', Typography.dollar, 22, 29, Typography.amp, 26, 14, '(', '+', 14, '+', '\r', 13770, 13770, '!', 28, 7, 3, '-', 7, 16, 7, 13846};
                                                                        int iIndexOf = TextUtils.indexOf("", "", 0);
                                                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault10 = getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                        int i251 = iIndexOf * (-405);
                                                                        int i252 = (i251 ^ 13024) + ((i251 & 13024) << 1);
                                                                        int i253 = ~(((-33) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault10) | ((-33) & iTuitionPaymentFragmentspecialinlinedviewModeldefault10));
                                                                        int i254 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                                                                        int i255 = (i254 ^ iIndexOf) | (i254 & iIndexOf);
                                                                        int i256 = ~((i255 & 32) | (i255 ^ 32));
                                                                        int i257 = i252 + (((i253 & i256) | (i253 ^ i256)) * (-406));
                                                                        int i258 = (~(((-33) ^ i254) | ((-33) & i254) | iIndexOf)) * (-406);
                                                                        int i259 = ~iIndexOf;
                                                                        byte b9 = (byte) ((((i257 & i258) + (i258 | i257)) - (~(((~((iTuitionPaymentFragmentspecialinlinedviewModeldefault10 & i259) | (i259 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault10))) | (~(i254 | 32))) * 406))) - 1);
                                                                        int i260 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 91;
                                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i260 % 128;
                                                                        int i261 = i260 % 2;
                                                                        int i262 = -View.resolveSize(0, 0);
                                                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault11 = getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                        int i263 = i262 * 70;
                                                                        int i264 = ((i263 | (-1564)) << 1) - (i263 ^ (-1564));
                                                                        int i265 = ~i262;
                                                                        int i266 = ~((i265 ^ (-24)) | (i265 & (-24)) | iTuitionPaymentFragmentspecialinlinedviewModeldefault11);
                                                                        int i267 = ~((i262 ^ 23) | (i262 & 23) | iTuitionPaymentFragmentspecialinlinedviewModeldefault11);
                                                                        int i268 = -(-(((i266 & i267) | (i266 ^ i267)) * 69));
                                                                        int i269 = (i264 ^ i268) + ((i264 & i268) << 1);
                                                                        int i270 = ~((i265 & 23) | (i265 ^ 23));
                                                                        int i271 = ~i262;
                                                                        int i272 = ~((i271 & iTuitionPaymentFragmentspecialinlinedviewModeldefault11) | (i271 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault11));
                                                                        int i273 = (i270 & i272) | (i270 ^ i272);
                                                                        int i274 = ~(iTuitionPaymentFragmentspecialinlinedviewModeldefault11 | 23);
                                                                        int i275 = i269 + (((i274 & i273) | (i273 ^ i274)) * (-69));
                                                                        int i276 = -(-((~((i262 & (-24)) | ((-24) ^ i262))) * 69));
                                                                        int i277 = (i275 ^ i276) + ((i276 & i275) << 1);
                                                                        Object[] objArr32 = new Object[1];
                                                                        a(cArr15, b9, i277, objArr32);
                                                                        if (!objNewInstance2.equals(cls9.getMethod((String) objArr32[0], null).invoke(objInvoke3, null))) {
                                                                            i105 = ((i127 | 1) << 1) - (i127 ^ 1);
                                                                            i14 = i2;
                                                                            length = i110;
                                                                            i88 = i124;
                                                                            objArr17 = objArr18;
                                                                            i57 = i208;
                                                                        }
                                                                    } catch (Throwable th3) {
                                                                        Throwable cause3 = th3.getCause();
                                                                        if (cause3 != null) {
                                                                            throw cause3;
                                                                        }
                                                                        throw th3;
                                                                    }
                                                                }
                                                                int i278 = (~(i & 1)) & (i | 1);
                                                                Object[] objArr33 = new Object[4];
                                                                int[] iArr = new int[1];
                                                                objArr33[0] = iArr;
                                                                objArr33[1] = new int[1];
                                                                int[] iArr2 = new int[1];
                                                                objArr33[2] = iArr2;
                                                                int i279 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
                                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i279 % 128;
                                                                if (i279 % 2 != 0) {
                                                                    iArr[0] = i;
                                                                    ((int[]) objArr33[5])[0] = i278;
                                                                    c2 = 5;
                                                                } else {
                                                                    iArr[0] = i;
                                                                    iArr2[0] = i278;
                                                                    c2 = 3;
                                                                }
                                                                objArr33[c2] = null;
                                                                int iNextInt = new Random().nextInt(287528409);
                                                                int i280 = (-1172545316) + (((~((-44564519) | (~iNextInt))) | 4254289) * (-591)) + ((iNextInt | (-44564519)) * 591);
                                                                int i281 = (i280 ^ 16) + ((i280 & 16) << 1);
                                                                int i282 = i281 * (-711);
                                                                int i283 = -(-(i2 * 713));
                                                                int i284 = (i282 ^ i283) + ((i282 & i283) << 1);
                                                                int i285 = ~i2;
                                                                int i286 = ~((i285 ^ i281) | (i285 & i281));
                                                                int i287 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                                int i288 = i287 + 27;
                                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i288 % 128;
                                                                int i289 = i288 % 2;
                                                                int i290 = (i124 ^ i281) | (i124 & i281);
                                                                int i291 = ~i290;
                                                                int i292 = (-712) * ((i286 & i291) | (i286 ^ i291));
                                                                int i293 = (i284 & i292) + (i284 | i292);
                                                                int i294 = (i285 & i208) | (i285 ^ i208);
                                                                int i295 = ~((i294 & i281) | (i294 ^ i281));
                                                                int i296 = (i281 & i2) | (i281 ^ i2);
                                                                int i297 = ~((i296 & i) | (i296 ^ i));
                                                                int i298 = -(-(((i297 & i295) | (i295 ^ i297)) * (-712)));
                                                                int i299 = (i293 ^ i298) + ((i298 & i293) << 1);
                                                                int i300 = ~i2;
                                                                int i301 = ~i290;
                                                                int i302 = i287 + 41;
                                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i302 % 128;
                                                                int i303 = i302 % 2;
                                                                int i304 = -(-(((i300 & i301) | (i300 ^ i301)) * 712));
                                                                int i305 = ((i299 | i304) << 1) - (i304 ^ i299);
                                                                int i306 = i305 << 13;
                                                                int i307 = (i306 | i305) & (~(i305 & i306));
                                                                int i308 = i307 >>> 17;
                                                                int i309 = ((~i307) & i308) | ((~i308) & i307);
                                                                int i310 = i309 << 5;
                                                                ((int[]) objArr33[1])[0] = (i309 | i310) & (~(i309 & i310));
                                                                return objArr33;
                                                            } catch (Throwable th4) {
                                                                Throwable cause4 = th4.getCause();
                                                                if (cause4 != null) {
                                                                    throw cause4;
                                                                }
                                                                throw th4;
                                                            }
                                                        } catch (Throwable th5) {
                                                            Throwable cause5 = th5.getCause();
                                                            if (cause5 != null) {
                                                                throw cause5;
                                                            }
                                                            throw th5;
                                                        }
                                                    } catch (Throwable unused) {
                                                        Invoke = i2;
                                                    }
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                }
                                            } else {
                                                Invoke = i14;
                                            }
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
                                Throwable cause8 = th9.getCause();
                                if (cause8 != null) {
                                    throw cause8;
                                }
                                throw th9;
                            }
                        } catch (Throwable th10) {
                            Throwable cause9 = th10.getCause();
                            if (cause9 != null) {
                                throw cause9;
                            }
                            throw th10;
                        }
                    } catch (Throwable th11) {
                        Throwable cause10 = th11.getCause();
                        if (cause10 != null) {
                            throw cause10;
                        }
                        throw th11;
                    }
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
            }
        } else {
            Invoke = i14;
        }
        Object[] objArr34 = {new int[]{i}, new int[1], new int[]{i}, null};
        int i311 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i311 % 128;
        if (i311 % 2 != 0) {
            int i312 = ~i;
            i3 = 543099401 + ((~((-469795873) | i312)) * (-783)) + (((~(i312 | (-470462118))) | (-510772347)) * 783);
            iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            i4 = (-751) << ((-751) / i3);
        } else {
            int i313 = ~i;
            i3 = (-769295020) + ((i | 664678954) * (-859)) + (((~(i | (-42476075))) | (~(664678954 | i313))) * 859) + (((~(624368725 | i313)) | (-666844800)) * 859);
            iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            i4 = i3 * (-751);
        }
        int i314 = (((i4 << 1) - i4) - (~((~(iTuitionPaymentFragmentspecialinlinedviewModeldefault1 | ((-1) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1))) * (-1504)))) - 1;
        int i315 = ~(((-1) ^ i3) | i3);
        int i316 = ~(~i3);
        int i317 = -(-(((i315 & i316) | (i315 ^ i316)) * 752));
        int i318 = ((i314 | i317) << 1) - (i317 ^ i314);
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault12 = getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i319 = i318 * (-1529);
        int i320 = -(-(Invoke * (-764)));
        int i321 = ((i319 | i320) << 1) - (i319 ^ i320);
        int i322 = ~i318;
        int i323 = ~Invoke;
        int i324 = i322 | i323;
        int i325 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault12;
        int i326 = ~((i324 & i325) | (i324 ^ i325));
        int i327 = ((i322 ^ Invoke) == true ? 1 : 0) | ((i322 & Invoke) == true ? 1 : 0);
        int i328 = i326 | (~((i327 & iTuitionPaymentFragmentspecialinlinedviewModeldefault12) | (i327 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault12)));
        int i329 = ~((i323 ^ i318) | (i323 & i318) | iTuitionPaymentFragmentspecialinlinedviewModeldefault12);
        int i330 = (i321 - (~(-(-(((i328 & i329) | (i328 ^ i329)) * 765))))) - 1;
        int i331 = ~Invoke;
        int i332 = ~((i331 & i322) | (i322 ^ i331));
        int i333 = ~((i322 & i325) | (i322 ^ i325));
        int i334 = -(-(((i333 & i332) | (i332 ^ i333)) * 1530));
        int i335 = (i330 & i334) + (i334 | i330);
        int i336 = ~i318;
        int i337 = ~((i336 & iTuitionPaymentFragmentspecialinlinedviewModeldefault12) | (i336 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault12));
        int i338 = (~iTuitionPaymentFragmentspecialinlinedviewModeldefault12) | i323;
        int i339 = (i335 - (~(-(-(((~((i338 & i318) | (i338 ^ i318))) | i337) * 765))))) - 1;
        int i340 = i339 << 13;
        int i341 = (i340 | i339) & (~(i339 & i340));
        int i342 = i341 >>> 17;
        int i343 = ((~i341) & i342) | ((~i342) & i341);
        int i344 = i343 << 5;
        ((int[]) objArr34[1])[0] = ((~i343) & i344) | ((~i344) & i343);
        return objArr34;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$c(short r5, byte r6, int r7) {
        /*
            byte[] r0 = com.google.android.gms.internal.fido.zzaa.$$a
            int r6 = r6 * 4
            int r6 = 4 - r6
            int r5 = r5 + 107
            int r7 = r7 * 2
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r5
            r5 = r7
            r3 = r2
            goto L25
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L21:
            r4 = r0[r6]
            int r3 = r3 + 1
        L25:
            int r5 = r5 + r4
            int r6 = r6 + 1
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fido.zzaa.$$c(short, byte, int):java.lang.String");
    }
}
