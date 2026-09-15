package com.google.firebase.platforminfo;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
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
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_CustomAttribute;
import defpackage.deInitSession;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import kotlin.KotlinVersion;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes6.dex */
public final class KotlinDetector {
    private static final byte[] $$a = {84, 10, 24, -102};
    private static final int $$b = 234;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int b = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {60049, 60045, 59747, 60088, 60075, 60102, 59744, 60089, 60040, 60061, 60059, 60041, 60119, 60062, 60084, 60043, 60052, 60063, 60082, 60095, 60035, 60123, 60090, 60050, 60067, 60046, 60117, 59746, 60086, 60072, 60047, 60110, 60048, 60056, 60055, 60051, 60107, 60034, 60098, 60058, 59745, 59748, 60053, 60054, 60060, 60085, 60057, 59749, 60078};
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 57190;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 4824715420305770756L;

    private KotlinDetector() {
    }

    public static String detectVersion() {
        int i = 2 % 2;
        int i2 = b + 123;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                KotlinVersion.CURRENT.toString();
                throw null;
            }
            String string = KotlinVersion.CURRENT.toString();
            int i3 = b + 57;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            int i4 = i3 % 2;
            return string;
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        int i3 = $11 + 45;
        $10 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 3 % 2;
        }
        while (getrealtimecapturelatency.b < cArr.length) {
            int i5 = $10 + 19;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - Color.blue(0)), TextUtils.getOffsetBefore("", 0) + 2624, 13 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.lastIndexOf("", '0') + 39423), 481 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 36 - ExpandableListView.getPackedPositionChild(0L), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i8 = $10 + 59;
                $11 = i8 % 128;
                int i9 = i8 % 2;
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
        int i10 = $11 + 89;
        $10 = i10 % 128;
        int i11 = i10 % 2;
        while (getrealtimecapturelatency.b < cArr.length) {
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (39421 - ExpandableListView.getPackedPositionChild(0L)), 480 - TextUtils.lastIndexOf("", '0', 0, 0), 38 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    private static void a(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = 1770390596;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) KeyEvent.keyCodeFromString(""), 2266 - Process.getGidForName(""), Color.red(0) + 33, -1927765101, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i5++;
                    i4 = 1770390596;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i6 = $10 + 77;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr2 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Drawable.resolveOpacity(0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 2267, 33 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -1927765101, false, $$c(b5, b6, b6), new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i8 = $11 + 107;
                $10 = i8 % 128;
                int i9 = i8 % 2;
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
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b7 = (byte) 0;
                            byte b8 = b7;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (49267 - (ViewConfiguration.getEdgeSlop() >> 16)), KeyEvent.keyCodeFromString("") + 3261, KeyEvent.normalizeMetaState(0) + 30, -127612708, false, $$c(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                            int i10 = $11 + 15;
                            $10 = i10 % 128;
                            int i11 = i10 % 2;
                            Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b9 = (byte) 0;
                                byte b10 = b9;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (22878 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), KeyEvent.getDeadChar(0, 0) + 594, ImageFormat.getBitsPerPixel(0) + 18, 1570859318, false, $$c(b9, b10, (byte) (b10 + 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                            int i12 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i12];
                            int i13 = $11 + 21;
                            $10 = i13 % 128;
                            int i14 = i13 % 2;
                        } else {
                            obj = null;
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i15 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i16 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i15];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i16];
                                int i17 = $11 + 55;
                                $10 = i17 % 128;
                                int i18 = i17 % 2;
                            } else {
                                int i19 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i20 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i19];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i20];
                            }
                        }
                    }
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                    obj2 = obj;
                }
            }
            for (int i21 = 0; i21 < i; i21++) {
                cArr4[i21] = (char) (cArr4[i21] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r21v8 */
    /* JADX WARN: Type inference failed for: r21v9 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v124 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v69, types: [int] */
    /* JADX WARN: Type inference failed for: r5v71, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v72 */
    /* JADX WARN: Type inference failed for: r5v98 */
    /* JADX WARN: Type inference failed for: r5v99 */
    /* JADX WARN: Type inference failed for: r6v141, types: [java.lang.Object] */
    public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context context, int i, int i2) {
        int i3;
        int i4;
        int i5;
        Object[] objArr;
        char[] cArr;
        byte bMyPid;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Class<?> cls;
        char[] cArr2;
        ?? NewInstance = 2 % 2;
        if (context != null) {
            try {
                char[] cArr3 = {'\n', 3, 1, 26, '-', 14, '\t', 18, 24, 16, 26, 14, 11, '0', 23, '.', 7, 19, 1, 26, '-', 14, '\t', 18, 24, 16, '\n', 5, 6, '/', 13849};
                int pressedStateDuration = ViewConfiguration.getPressedStateDuration() >> 16;
                int iTuitionPaymentFragmentbindingInflater1 = AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1();
                int i12 = pressedStateDuration * (-1939);
                int i13 = (i12 ^ 77680) + ((i12 & 77680) << 1);
                int i14 = ~((-81) | pressedStateDuration);
                int i15 = ~iTuitionPaymentFragmentbindingInflater1;
                int i16 = ~(i15 | 80);
                int i17 = -(-(((i14 ^ i16) | (i14 & i16)) * (-970)));
                int i18 = (i13 ^ i17) + ((i17 & i13) << 1);
                int i19 = ~pressedStateDuration;
                int i20 = (i18 - (~(-(-((~((i19 & 80) | (i19 ^ 80))) * 1940))))) - 1;
                int i21 = ~pressedStateDuration;
                int i22 = ~((i21 & (-81)) | (i21 ^ (-81)));
                int i23 = b + 39;
                TuitionPaymentFragmentbindingInflater1 = i23 % 128;
                int i24 = i23 % 2;
                int i25 = ~((i15 & 80) | (i15 ^ 80));
                int i26 = -(-(970 * ((i22 & i25) | (i22 ^ i25))));
                byte b2 = (byte) ((i20 & i26) + (i26 | i20));
                Object[] objArr2 = new Object[1];
                a(cArr3, b2, 30 - (~(-(ViewConfiguration.getKeyRepeatTimeout() >> 16))), objArr2);
                String str = (String) objArr2[0];
                int i27 = TuitionPaymentFragmentbindingInflater1 + 107;
                b = i27 % 128;
                try {
                    try {
                        if (i27 % 2 != 0) {
                            objArr = new Object[]{str};
                            cArr = new char[]{4, '#', 4, Typography.dollar, 19, 27, '\t', 7, ' ', 26, '\t', 25, '%', ',', 25, '(', 23, ' ', '(', 21, 17, Typography.quote, 13815, 13815, 27, 25, 29, Typography.amp, '\'', 1, '\t', 25, '/', 28, 22, 16, ')', ' '};
                            bMyPid = (byte) (92 >> (Process.myPid() >>> 119));
                        } else {
                            objArr = new Object[]{str};
                            cArr = new char[]{4, '#', 4, Typography.dollar, 19, 27, '\t', 7, ' ', 26, '\t', 25, '%', ',', 25, '(', 23, ' ', '(', 21, 17, Typography.quote, 13815, 13815, 27, 25, 29, Typography.amp, '\'', 1, '\t', 25, '/', 28, 22, 16, ')', ' '};
                            int i28 = -(-(Process.myPid() >> 22));
                            bMyPid = (byte) ((i28 ^ 77) + ((i28 & 77) << 1));
                        }
                        int scrollBarSize = ViewConfiguration.getScrollBarSize() >> 8;
                        Object[] objArr3 = new Object[1];
                        a(cArr, bMyPid, (scrollBarSize ^ 38) + ((scrollBarSize & 38) << 1), objArr3);
                        Object objNewInstance = Class.forName((String) objArr3[0]).getDeclaredConstructor(String.class).newInstance(objArr);
                        char[] cArr4 = {4, 6, '+', Typography.quote, 7, 19, 1, 26, '-', 14, '\t', 18, 24, 16, '\n', 5, '/', 3, 21, '+', 18, '\n', 23, 30, 14, 24, 20, '\f', 4, ' ', 13914};
                        int i29 = -TextUtils.getOffsetBefore("", 0);
                        int i30 = i29 * (-743);
                        int i31 = b + 3;
                        int i32 = i31 % 128;
                        TuitionPaymentFragmentbindingInflater1 = i32;
                        if (i31 % 2 == 0) {
                            i6 = i30 - 69099;
                            i7 = ~((i29 ^ 93) | (i29 & 93));
                            i8 = (i29 ^ i) | (i29 & i);
                        } else {
                            i6 = ((i30 | (-69099)) << 1) - ((-69099) ^ i30);
                            i7 = ~((i29 ^ 93) | (i29 & 93));
                            i8 = i29 | i;
                        }
                        int i33 = ~i8;
                        int i34 = (i7 ^ i33) | (i33 & i7);
                        int i35 = ~((i ^ 93) | (i & 93));
                        int i36 = (-744) * ((i34 ^ i35) | (i34 & i35));
                        int i37 = (i6 & i36) + (i6 | i36);
                        int i38 = ~i;
                        int i39 = ~i29;
                        int i40 = ~((i39 ^ (-94)) | (i39 & (-94)));
                        int i41 = (i37 - (~(((i38 ^ i40) | (i40 & i38)) * 744))) - 1;
                        int i42 = (i29 & 93) | (i29 ^ 93);
                        int i43 = (i32 & 101) + (i32 | 101);
                        b = i43 % 128;
                        int i44 = i43 % 2;
                        int i45 = 744 * ((i42 & i) | (i42 ^ i));
                        byte b3 = (byte) ((i41 & i45) + (i41 | i45));
                        Object[] objArr4 = new Object[1];
                        a(cArr4, b3, 31 - (~TextUtils.indexOf((CharSequence) "", '0')), objArr4);
                        NewInstance = (String) objArr4[0];
                        try {
                            Object[] objArr5 = {NewInstance};
                            char[] cArr5 = {4, '#', 4, Typography.dollar, 19, 27, '\t', 7, ' ', 26, '\t', 25, '%', ',', 25, '(', 23, ' ', '(', 21, 17, Typography.quote, 13815, 13815, 27, 25, 29, Typography.amp, '\'', 1, '\t', 25, '/', 28, 22, 16, ')', ' '};
                            int scrollBarFadeDuration = ViewConfiguration.getScrollBarFadeDuration();
                            int i46 = TuitionPaymentFragmentbindingInflater1;
                            int i47 = (i46 & 117) + (i46 | 117);
                            b = i47 % 128;
                            int i48 = i47 % 2;
                            int i49 = -(scrollBarFadeDuration >> 16);
                            int iTuitionPaymentFragmentbindingInflater2 = AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1();
                            int i50 = (i49 * 530) + 1058;
                            int i51 = ((i50 | 40810) << 1) - (i50 ^ 40810);
                            int i52 = ~iTuitionPaymentFragmentbindingInflater2;
                            int i53 = ~((i52 & i49) | (i52 ^ i49));
                            int i54 = ~((i49 ^ 77) | (i49 & 77));
                            int i55 = i51 + (((i53 ^ i54) | (i53 & i54)) * 529);
                            int i56 = (i49 & iTuitionPaymentFragmentbindingInflater2) | (i49 ^ iTuitionPaymentFragmentbindingInflater2);
                            int i57 = b;
                            int i58 = ((i57 | 61) << 1) - (i57 ^ 61);
                            TuitionPaymentFragmentbindingInflater1 = i58 % 128;
                            int i59 = i58 % 2;
                            Object[] objArr6 = new Object[1];
                            a(cArr5, (byte) ((i55 - (~(529 * ((~i56) | (-78))))) - 1), (-16777178) - Color.rgb(0, 0, 0), objArr6);
                            NewInstance = Class.forName((String) objArr6[0]).getDeclaredConstructor(String.class).newInstance(objArr5);
                            int i60 = b;
                            int i61 = (i60 ^ 55) + ((i60 & 55) << 1);
                            TuitionPaymentFragmentbindingInflater1 = i61 % 128;
                            int i62 = i61 % 2;
                            try {
                                int maxKeyCode = KeyEvent.getMaxKeyCode() >> 16;
                                int i63 = (maxKeyCode * 829) + 17643607;
                                int i64 = ~((~maxKeyCode) | (-21284));
                                int i65 = (i38 ^ maxKeyCode) | (i38 & maxKeyCode);
                                int i66 = ~((i65 & 21283) | (i65 ^ 21283));
                                int i67 = ((i66 & i64) | (i64 ^ i66)) * (-828);
                                int i68 = (i63 & i67) + (i67 | i63);
                                int i69 = (maxKeyCode ^ 21283) | (maxKeyCode & 21283);
                                int i70 = i68 + (((i69 ^ i38) | (i69 & i38)) * (-828)) + ((~i69) * 828);
                                Object[] objArr7 = new Object[1];
                                c(new char[]{24702, 13138, 50749, 39172, 11516, 65497, 37545, 9668, 63844, 35915, 24367, 62186, 34270, 22710, 60289, 48956, 21100, 58659, 47111, 19442, 7878, 45496, 17769}, i70, objArr7);
                                Class<?> cls2 = Class.forName((String) objArr7[0]);
                                int i71 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                Object[] objArr8 = new Object[1];
                                a(new char[]{'0', '\t', ' ', 2, '(', ' ', '\'', '.', '0', '\t', ' ', '#', '.', '#', '0', '\t', 13877}, (byte) ((i71 & 78) + (i71 | 78)), 16 - (~(-Color.green(0))), objArr8);
                                Object objInvoke = cls2.getMethod((String) objArr8[0], null).invoke(context, null);
                                try {
                                    int i72 = -(-KeyEvent.getDeadChar(0, 0));
                                    int i73 = ((i72 | 21283) << 1) - (i72 ^ 21283);
                                    Object[] objArr9 = new Object[1];
                                    c(new char[]{24702, 13138, 50749, 39172, 11516, 65497, 37545, 9668, 63844, 35915, 24367, 62186, 34270, 22710, 60289, 48956, 21100, 58659, 47111, 19442, 7878, 45496, 17769}, i73, objArr9);
                                    Class<?> cls3 = Class.forName((String) objArr9[0]);
                                    char[] cArr6 = {'0', '\t', ' ', 2, '(', ' ', '\'', '.', '0', '\t', '.', Typography.amp, '0', '\b'};
                                    int i74 = -TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                    int i75 = (i74 * 868) + 5208;
                                    int i76 = ~i74;
                                    int i77 = ~((i76 ^ i38) | (i76 & i38));
                                    int i78 = ~i;
                                    int i79 = ~(((-7) ^ i78) | ((-7) & i78));
                                    int i80 = ((i77 ^ i79) | (i79 & i77)) * (-867);
                                    int i81 = (i75 & i80) + (i80 | i75);
                                    int i82 = ~((i76 ^ (-7)) | (i76 & (-7)));
                                    int i83 = ~i74;
                                    int i84 = ~((i83 ^ i) | (i83 & i));
                                    int i85 = (i82 ^ i84) | (i84 & i82);
                                    ?? r21 = NewInstance;
                                    int i86 = ~((-7) | i);
                                    int i87 = TuitionPaymentFragmentbindingInflater1 + 39;
                                    Object obj = objNewInstance;
                                    int i88 = i87 % 128;
                                    b = i88;
                                    int i89 = i87 % 2;
                                    int i90 = (i81 - (~((-1734) * ((i85 & i86) | (i85 ^ i86))))) - 1;
                                    int i91 = (-7) | i83;
                                    int i92 = ~((i91 & i38) | (i91 ^ i38));
                                    int i93 = (i76 ^ 6) | (i76 & 6);
                                    int i94 = ~((i93 & i) | (i93 ^ i));
                                    int i95 = (i92 & i94) | (i92 ^ i94);
                                    int i96 = (i88 ^ 125) + ((i88 & 125) << 1);
                                    TuitionPaymentFragmentbindingInflater1 = i96 % 128;
                                    int i97 = i96 % 2;
                                    int i98 = ~(((-7) & i74) | ((-7) ^ i74) | i);
                                    byte b4 = (byte) (i90 + (867 * ((i95 & i98) | (i95 ^ i98))));
                                    try {
                                        int iMyTid = Process.myTid() >> 22;
                                        int i99 = ~iMyTid;
                                        int i100 = (((iMyTid * (-496)) - 6944) - (~((~((i99 ^ (-15)) | (i99 & (-15)))) * 497))) - 1;
                                        int i101 = ~iMyTid;
                                        int i102 = ~((i101 & (-15)) | (i101 ^ (-15)) | i);
                                        int i103 = ((-15) ^ i78) | ((-15) & i78);
                                        int i104 = ~((i103 & iMyTid) | (i103 ^ iMyTid));
                                        int i105 = ((i102 & i104) | (i102 ^ i104)) * 497;
                                        int i106 = (i100 & i105) + (i100 | i105);
                                        int i107 = ~((i99 ^ i38) | (i99 & i38));
                                        int i108 = ~((i99 & 14) | (i99 ^ 14));
                                        int i109 = (i107 & i108) | (i107 ^ i108);
                                        int i110 = iMyTid | (-15);
                                        int i111 = ~((i110 & i) | (i110 ^ i));
                                        int i112 = ((i111 & i109) | (i109 ^ i111)) * 497;
                                        int i113 = (i106 ^ i112) + ((i112 & i106) << 1);
                                        Object[] objArr10 = new Object[1];
                                        a(cArr6, b4, i113, objArr10);
                                        Object objInvoke2 = cls3.getMethod((String) objArr10[0], null).invoke(context, null);
                                        int i114 = b;
                                        int i115 = (i114 & 75) + (i114 | 75);
                                        TuitionPaymentFragmentbindingInflater1 = i115 % 128;
                                        NewInstance = i115 % 2;
                                        try {
                                            NewInstance = new Object[]{objInvoke2, 64};
                                            int i116 = -(-TextUtils.indexOf((CharSequence) "", '0'));
                                            int i117 = (i116 ^ 29328) + ((i116 & 29328) << 1);
                                            Object[] objArr11 = new Object[1];
                                            c(new char[]{24702, 4862, 34149, 14272, 43596, 23741, 53025, 16856, 62468, 26487, 6631, 35918, 16078, 45362, 9145, 54864, 18591, 64269, 28223, 57554, 37714, 1479, 47166, 10919, 56592, 20365, 49876, 30059, 59349, 39501, 3258, 48939, 12685}, i117, objArr11);
                                            Class<?> cls4 = Class.forName((String) objArr11[0]);
                                            int i118 = -TextUtils.lastIndexOf("", '0');
                                            int i119 = i118 * 370;
                                            int i120 = (i119 ^ 13852800) + ((i119 & 13852800) << 1);
                                            int i121 = i118 | 37440;
                                            int i122 = -(-(((i121 & i38) | (i121 ^ i38)) * (-369)));
                                            int i123 = ((i120 | i122) << 1) - (i122 ^ i120);
                                            int i124 = ~i118;
                                            int i125 = ~((i124 ^ i78) | (i124 & i78));
                                            int i126 = i123 + (((i125 & 37440) | (i125 ^ 37440)) * (-369));
                                            int i127 = ~(((-37441) & i118) | ((-37441) ^ i118));
                                            int i128 = ~((i118 & i) | (i118 ^ i));
                                            int i129 = (i128 & i127) | (i127 ^ i128);
                                            int i130 = i124 | i78;
                                            int i131 = ~((37440 & i130) | (i130 ^ 37440));
                                            int i132 = -(-(((i129 & i131) | (i129 ^ i131)) * 369));
                                            int i133 = ((i126 | i132) << 1) - (i132 ^ i126);
                                            Object[] objArr12 = new Object[1];
                                            c(new char[]{24696, 62011, 17641, 54924, 10618, 47929, 3570, 40889, 62064, 17459, 55004, 10426, 47989, 3389}, i133, objArr12);
                                            Object objInvoke3 = cls4.getMethod((String) objArr12[0], String.class, Integer.TYPE).invoke(objInvoke, NewInstance);
                                            try {
                                                char[] cArr7 = {'#', '.', 18, '\n', 23, 30, 19, 24, 30, 19, ',', 28, 7, '0', '!', 23, 22, 1, 25, 5, '(', ' ', '\'', '.', '0', '\t', 14, '.', 16, 23};
                                                int i134 = -TextUtils.indexOf("", "", 0, 0);
                                                int i135 = TuitionPaymentFragmentbindingInflater1;
                                                int i136 = ((i135 | 123) << 1) - (i135 ^ 123);
                                                b = i136 % 128;
                                                int i137 = i136 % 2;
                                                int i138 = ((-71) & i38) | ((-71) ^ i38);
                                                int i139 = ~i138;
                                                int i140 = ((i134 * (-112)) - 7840) + (((i139 & i134) | (i134 ^ i139)) * 226);
                                                int i141 = ~i134;
                                                int i142 = ~((i141 ^ 70) | (i141 & 70));
                                                int i143 = ~((i141 & i) | (i141 ^ i));
                                                int i144 = (i143 & i142) | (i142 ^ i143);
                                                int i145 = ~((i134 & i138) | (i138 ^ i134));
                                                byte b5 = (byte) (((i140 - (~(-(-(((i145 & i144) | (i144 ^ i145)) * (-113)))))) - 1) + ((~(((-71) & i) | ((-71) ^ i))) * 113));
                                                int i146 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                int iTuitionPaymentFragmentbindingInflater3 = AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1();
                                                int i147 = ~((i146 ^ iTuitionPaymentFragmentbindingInflater3) | (i146 & iTuitionPaymentFragmentbindingInflater3));
                                                int i148 = ((i146 * (-1335)) - 20010) + (((i147 & (-31)) | ((-31) ^ i147)) * (-668));
                                                int i149 = ~(((-31) ^ iTuitionPaymentFragmentbindingInflater3) | ((-31) & iTuitionPaymentFragmentbindingInflater3));
                                                int i150 = (i148 - (~(-(-(((i149 & i146) | (i146 ^ i149)) * 1336))))) - 1;
                                                int i151 = i146 | iTuitionPaymentFragmentbindingInflater3;
                                                int i152 = -(-(((i151 & (-31)) | (i151 ^ (-31))) * 668));
                                                int i153 = (i150 & i152) + (i152 | i150);
                                                Object[] objArr13 = new Object[1];
                                                a(cArr7, b5, i153, objArr13);
                                                Class<?> cls5 = Class.forName((String) objArr13[0]);
                                                int i154 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                int i155 = ~i154;
                                                int i156 = ~((i155 & 97) | (i155 ^ 97));
                                                int i157 = ~(((-98) ^ i154) | ((-98) & i154));
                                                int i158 = (i156 & i157) | (i156 ^ i157);
                                                int i159 = (i154 ^ i) | (i154 & i);
                                                int i160 = ~i159;
                                                int i161 = ((i154 * 659) - 63729) + (((i158 & i160) | (i158 ^ i160)) * (-658));
                                                int i162 = (~((-98) | i154)) * 658;
                                                int i163 = ((i161 | i162) << 1) - (i161 ^ i162);
                                                int i164 = ~(i154 | (-98));
                                                int i165 = ~i159;
                                                int i166 = -(-(((i164 & i165) | (i164 ^ i165)) * 658));
                                                int i167 = -TextUtils.getOffsetAfter("", 0);
                                                Object[] objArr14 = new Object[1];
                                                a(new char[]{'\t', 22, '-', '+', '%', ' ', ' ', 18, 7, '\t'}, (byte) (((i163 | i166) << 1) - (i166 ^ i163)), (i167 & 10) + (i167 | 10), objArr14);
                                                Object[] objArr15 = (Object[]) cls5.getField((String) objArr14[0]).get(objInvoke3);
                                                int length = objArr15.length;
                                                NewInstance = 0;
                                                while (true) {
                                                    if (NewInstance < length) {
                                                        Object obj2 = objArr15[NewInstance];
                                                        Object[] objArr16 = new Object[1];
                                                        a(new char[]{25, 27, 29, Typography.amp, 13842}, (byte) (View.combineMeasuredStates(0, 0) + 111), 5 - (ViewConfiguration.getScrollBarSize() >> 8), objArr16);
                                                        String str2 = (String) objArr16[0];
                                                        int i168 = b;
                                                        int i169 = (i168 ^ 25) + ((i168 & 25) << 1);
                                                        TuitionPaymentFragmentbindingInflater1 = i169 % 128;
                                                        int i170 = i169 % 2;
                                                        try {
                                                            Object[] objArr17 = {str2};
                                                            Object[] objArr18 = new Object[1];
                                                            c(new char[]{24693, 25097, 25735, 26395, 27117, 27711, 28336, 28989, 29650, 30274, 30928, 31606, 32242, 16442, 17150, 17539, 18205, 18828, 19567, 20105, 20790, 21422, 22097, 22727, 23377, 24041, 8298, 8947, 9583, 9985, 10667, 11287, 11932, 12604, 13246, 13864, 14554}, 631 - (~(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))), objArr18);
                                                            Class<?> cls6 = Class.forName((String) objArr18[0]);
                                                            char[] cArr8 = {'0', '\t', ' ', 16, '+', 7, ' ', '%', '/', 28, 13839};
                                                            int i171 = b;
                                                            int i172 = (i171 ^ 99) + ((i171 & 99) << 1);
                                                            TuitionPaymentFragmentbindingInflater1 = i172 % 128;
                                                            int i173 = i172 % 2;
                                                            byte bIndexOf = (byte) (15 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                                                            int i174 = b + 33;
                                                            TuitionPaymentFragmentbindingInflater1 = i174 % 128;
                                                            int i175 = i174 % 2;
                                                            Object[] objArr19 = new Object[1];
                                                            a(cArr8, bIndexOf, 10 - (~(-(-(ViewConfiguration.getKeyRepeatTimeout() >> 16)))), objArr19);
                                                            Object objInvoke4 = cls6.getMethod((String) objArr19[0], String.class).invoke(null, objArr17);
                                                            try {
                                                                char[] cArr9 = {'#', '.', 18, '\n', 23, 30, 19, 24, 30, 19, ',', 28, 7, '0', '!', 23, 22, 1, 22, '!', 30, 2, '.', '#', ' ', 23, '\f', 7};
                                                                int i176 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                                int iTuitionPaymentFragmentbindingInflater4 = AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1();
                                                                int i177 = i176 * 960;
                                                                int i178 = b;
                                                                int i179 = i178 + 89;
                                                                Object[] objArr20 = objArr15;
                                                                TuitionPaymentFragmentbindingInflater1 = i179 % 128;
                                                                if (i179 % 2 == 0) {
                                                                    int i180 = i177 << (-1993);
                                                                    int i181 = ~iTuitionPaymentFragmentbindingInflater4;
                                                                    int i182 = ~(((-77) ^ i181) | (i181 & (-77)));
                                                                    int i183 = ~(i176 | iTuitionPaymentFragmentbindingInflater4);
                                                                    int i184 = (i182 ^ i183) | (i182 & i183);
                                                                    i9 = i180 >>> ((i184 ^ 959) + ((i184 & 959) << 1));
                                                                } else {
                                                                    int i185 = ~((-77) | (~iTuitionPaymentFragmentbindingInflater4));
                                                                    int i186 = ~(i176 | iTuitionPaymentFragmentbindingInflater4);
                                                                    i9 = (((i185 ^ i186) | (i185 & i186)) * 959) + (i177 - 145692);
                                                                }
                                                                int i187 = ((i9 | 73843) << 1) - (i9 ^ 73843);
                                                                int i188 = ~((-77) | iTuitionPaymentFragmentbindingInflater4);
                                                                int i189 = ~iTuitionPaymentFragmentbindingInflater4;
                                                                int i190 = ~((i189 & i176) | (i189 ^ i176));
                                                                byte b6 = (byte) (i187 + (((i188 & i190) | (i188 ^ i190)) * 959));
                                                                int i191 = i178 + 57;
                                                                TuitionPaymentFragmentbindingInflater1 = i191 % 128;
                                                                int i192 = i191 % 2;
                                                                int threadPriority = Process.getThreadPriority(0);
                                                                int iTuitionPaymentFragmentbindingInflater5 = AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1();
                                                                int i193 = 1419 - (~(threadPriority * (-69)));
                                                                int i194 = ~((-21) | threadPriority);
                                                                int i195 = ~((threadPriority ^ iTuitionPaymentFragmentbindingInflater5) | (threadPriority & iTuitionPaymentFragmentbindingInflater5));
                                                                int i196 = (i193 - (~(((i194 ^ i195) | (i195 & i194)) * (-140)))) - 1;
                                                                int i197 = (threadPriority ^ 20) | (threadPriority & 20);
                                                                int i198 = (~((i197 & iTuitionPaymentFragmentbindingInflater5) | (i197 ^ iTuitionPaymentFragmentbindingInflater5))) * 70;
                                                                int i199 = (i196 & i198) + (i196 | i198);
                                                                int i200 = ~(((-21) ^ threadPriority) | ((-21) & threadPriority));
                                                                int i201 = ~threadPriority;
                                                                int i202 = ~((i201 & 20) | (i201 ^ 20));
                                                                int i203 = (i202 & i200) | (i200 ^ i202);
                                                                int i204 = ~((iTuitionPaymentFragmentbindingInflater5 & 20) | (iTuitionPaymentFragmentbindingInflater5 ^ 20));
                                                                int i205 = -((i199 + (((i204 & i203) | (i203 ^ i204)) * 70)) >> 6);
                                                                Object[] objArr21 = new Object[1];
                                                                a(cArr9, b6, (i205 & 28) + (i205 | 28), objArr21);
                                                                Class<?> cls7 = Class.forName((String) objArr21[0]);
                                                                char[] cArr10 = {'%', 23, '\t', '#', Typography.quote, '\t', 25, '\b', 18, '.', 13880};
                                                                int offsetAfter = TextUtils.getOffsetAfter("", 0);
                                                                byte b7 = (byte) (((offsetAfter | 85) << 1) - (offsetAfter ^ 85));
                                                                int i206 = -(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                                                Object[] objArr22 = new Object[1];
                                                                a(cArr10, b7, (i206 & 10) + (i206 | 10), objArr22);
                                                                try {
                                                                    Object[] objArr23 = {new ByteArrayInputStream((byte[]) cls7.getMethod((String) objArr22[0], null).invoke(obj2, null))};
                                                                    char[] cArr11 = {24693, 25097, 25735, 26395, 27117, 27711, 28336, 28989, 29650, 30274, 30928, 31606, 32242, 16442, 17150, 17539, 18205, 18828, 19567, 20105, 20790, 21422, 22097, 22727, 23377, 24041, 8298, 8947, 9583, 9985, 10667, 11287, 11932, 12604, 13246, 13864, 14554};
                                                                    int threadPriority2 = Process.getThreadPriority(0);
                                                                    int i207 = -(-(threadPriority2 * (-864)));
                                                                    int i208 = ((17320 | i207) << 1) - (i207 ^ 17320);
                                                                    int i209 = ~threadPriority2;
                                                                    int i210 = -(-(((~(((-21) & i38) | ((-21) ^ i38))) | i209) * (-865)));
                                                                    int i211 = (i208 & i210) + (i210 | i208);
                                                                    int i212 = TuitionPaymentFragmentbindingInflater1 + 11;
                                                                    b = i212 % 128;
                                                                    if (i212 % 2 != 0) {
                                                                        i11 = i211 >> (865 % (~((i ^ 20) | (i & 20))));
                                                                        int i213 = -((~((~threadPriority2) | i38)) | (~(i38 | 20)));
                                                                        i10 = (i213 & 865) + (i213 | 865);
                                                                    } else {
                                                                        int i214 = (~((i ^ 20) | (i & 20))) * 865;
                                                                        i10 = ((~((i209 & i38) | (i209 ^ i38))) | (~((i38 ^ 20) | (i38 & 20)))) * 865;
                                                                        i11 = (i214 | i211) + (i211 & i214);
                                                                    }
                                                                    int i215 = -(-i10);
                                                                    int i216 = -(((i11 & i215) + (i11 | i215)) >> 6);
                                                                    int i217 = ((i216 | 631) << 1) - (i216 ^ 631);
                                                                    Object[] objArr24 = new Object[1];
                                                                    c(cArr11, i217, objArr24);
                                                                    Class<?> cls8 = Class.forName((String) objArr24[0]);
                                                                    char[] cArr12 = {'0', '\t', '0', 7, 18, '.', Typography.quote, '\t', 6, '\n', '\t', ' ', 30, 16, 26, 30, '%', ' ', 13833};
                                                                    int i218 = -Gravity.getAbsoluteGravity(0, 0);
                                                                    int i219 = -ExpandableListView.getPackedPositionChild(0L);
                                                                    int i220 = i219 * (-523);
                                                                    int i221 = (i220 ^ 4734) + ((i220 & 4734) << 1);
                                                                    int i222 = ~i219;
                                                                    int i223 = (~(((-19) ^ i219) | ((-19) & i219))) | (~((i222 & 18) | (i222 ^ 18)));
                                                                    int i224 = ~((-19) | i);
                                                                    int i225 = -(-(((i223 ^ i224) | (i223 & i224)) * 262));
                                                                    int i226 = ((i221 | i225) << 1) - (i225 ^ i221);
                                                                    int i227 = ((-19) & i219) | ((-19) ^ i219);
                                                                    int i228 = (~i227) * (-786);
                                                                    int i229 = (i226 ^ i228) + ((i226 & i228) << 1);
                                                                    int i230 = ~(((-19) ^ i38) | ((-19) & i38));
                                                                    int i231 = ~i219;
                                                                    int i232 = ~((i231 & 18) | (i231 ^ 18));
                                                                    int i233 = (i232 & i230) | (i230 ^ i232);
                                                                    int i234 = ~i227;
                                                                    Object[] objArr25 = new Object[1];
                                                                    a(cArr12, (byte) ((i218 ^ 10) + ((i218 & 10) << 1)), (i229 - (~(((i233 & i234) | (i233 ^ i234)) * 262))) - 1, objArr25);
                                                                    Object objInvoke5 = cls8.getMethod((String) objArr25[0], InputStream.class).invoke(objInvoke4, objArr23);
                                                                    int i235 = TuitionPaymentFragmentbindingInflater1;
                                                                    int i236 = (i235 ^ 75) + ((i235 & 75) << 1);
                                                                    int i237 = i236 % 128;
                                                                    b = i237;
                                                                    if (i236 % 2 != 0) {
                                                                        int i238 = 5 % 3;
                                                                    }
                                                                    int i239 = (i237 ^ 121) + ((i237 & 121) << 1);
                                                                    TuitionPaymentFragmentbindingInflater1 = i239 % 128;
                                                                    int i240 = i239 % 2;
                                                                    try {
                                                                        char[] cArr13 = {24693, 37841, 34615, 47987, 44685, 41479, 54880, 51637, 64786, 61770, 58528, 6382, 3154, 16338, 13294, 10043, 23197, 20212, 17023, 30138, 27014, 40308, 37164, 34021, 47122, 44154, 57261, 54019, 51037, 64165, 61182, 57935, 5515, 2549};
                                                                        int iAxisFromString = MotionEvent.axisFromString("");
                                                                        int i241 = (iAxisFromString * 714) - 44417408;
                                                                        int i242 = ~((~iAxisFromString) | i38);
                                                                        int i243 = ~iAxisFromString;
                                                                        int i244 = ~((i243 & 62384) | (i243 ^ 62384));
                                                                        int i245 = (i242 & i244) | (i242 ^ i244);
                                                                        int i246 = ((-62385) & iAxisFromString) | ((-62385) ^ iAxisFromString);
                                                                        int i247 = ~((i246 & i) | (i246 ^ i));
                                                                        int i248 = -(-((i245 | i247) * (-713)));
                                                                        int i249 = (i241 ^ i248) + ((i241 & i248) << 1);
                                                                        int i250 = b + 7;
                                                                        TuitionPaymentFragmentbindingInflater1 = i250 % 128;
                                                                        if (i250 % 2 == 0) {
                                                                            int i251 = (iAxisFromString & (-62385)) | ((-62385) ^ iAxisFromString);
                                                                            int i252 = -((~((i251 & i) | (i251 ^ i))) * 1426);
                                                                            int i253 = ((i249 | i252) << 1) - (i252 ^ i249);
                                                                            int i254 = 713 >>> (~((-62385) | i38));
                                                                            int i255 = (i253 & i254) + (i254 | i253);
                                                                            Object[] objArr26 = new Object[1];
                                                                            c(cArr13, i255, objArr26);
                                                                            cls = Class.forName((String) objArr26[0]);
                                                                            cArr2 = new char[]{'0', '\t', 31, 30, ' ', 4, 6, 7, Typography.quote, 31, 31, Typography.amp, 13803, 13803, 11, 18, 21, ',', 30, 26, 18, Typography.dollar, 13879};
                                                                        } else {
                                                                            int i256 = -(-(i247 * 1426));
                                                                            int i257 = (i249 & i256) + (i256 | i249);
                                                                            int i258 = -(-((~(((-62385) & i38) | ((-62385) ^ i38))) * 713));
                                                                            int i259 = ((i257 | i258) << 1) - (i258 ^ i257);
                                                                            Object[] objArr27 = new Object[1];
                                                                            c(cArr13, i259, objArr27);
                                                                            cls = Class.forName((String) objArr27[0]);
                                                                            cArr2 = new char[]{'0', '\t', 31, 30, ' ', 4, 6, 7, Typography.quote, 31, 31, Typography.amp, 13803, 13803, 11, 18, 21, ',', 30, 26, 18, Typography.dollar, 13879};
                                                                        }
                                                                        byte maximumFlingVelocity = (byte) (65 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                                                                        int i260 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                                        int i261 = i260 * 569;
                                                                        int i262 = ((i261 | 13656) << 1) - (i261 ^ 13656);
                                                                        int i263 = ~i260;
                                                                        int i264 = ~((i263 & (-25)) | (i263 ^ (-25)));
                                                                        int i265 = ~i260;
                                                                        int i266 = i264 | (~(i265 | i78));
                                                                        int i267 = ~(((-25) ^ i38) | ((-25) & i38));
                                                                        int i268 = ((i266 ^ i267) | (i267 & i266)) * (-1136);
                                                                        int i269 = (i262 ^ i268) + ((i268 & i262) << 1);
                                                                        int i270 = ~(i265 | i);
                                                                        int i271 = ~((-25) | i);
                                                                        int i272 = (i270 & i271) | (i270 ^ i271);
                                                                        int i273 = (i78 ^ i260) | (i78 & i260);
                                                                        int i274 = ~((i273 & 24) | (i273 ^ 24));
                                                                        int i275 = -(-(((i272 & i274) | (i272 ^ i274)) * (-568)));
                                                                        int i276 = ((i269 | i275) << 1) - (i275 ^ i269);
                                                                        int i277 = ~(i78 | i260);
                                                                        int i278 = ~((i38 ^ 24) | (i38 & 24));
                                                                        int i279 = (i277 & i278) | (i277 ^ i278);
                                                                        int i280 = (i265 ^ (-25)) | (i265 & (-25));
                                                                        int i281 = ~((i280 & i) | (i280 ^ i));
                                                                        int i282 = (i276 - (~(-(-(((i279 & i281) | (i279 ^ i281)) * 568))))) - 1;
                                                                        Object[] objArr28 = new Object[1];
                                                                        a(cArr2, maximumFlingVelocity, i282, objArr28);
                                                                        Object obj3 = obj;
                                                                        if (!obj3.equals(cls.getMethod((String) objArr28[0], null).invoke(objInvoke5, null))) {
                                                                            try {
                                                                                int i283 = -(-MotionEvent.axisFromString(""));
                                                                                int i284 = ((i283 | 62384) << 1) - (i283 ^ 62384);
                                                                                Object[] objArr29 = new Object[1];
                                                                                c(new char[]{24693, 37841, 34615, 47987, 44685, 41479, 54880, 51637, 64786, 61770, 58528, 6382, 3154, 16338, 13294, 10043, 23197, 20212, 17023, 30138, 27014, 40308, 37164, 34021, 47122, 44154, 57261, 54019, 51037, 64165, 61182, 57935, 5515, 2549}, i284, objArr29);
                                                                                Class<?> cls9 = Class.forName((String) objArr29[0]);
                                                                                char[] cArr14 = {'0', '\t', 31, 30, ' ', 4, 6, 7, Typography.quote, 31, 31, Typography.amp, 13803, 13803, 11, 18, 21, ',', 30, 26, 18, Typography.dollar, 13879};
                                                                                byte b8 = (byte) (64 - (~(-(-View.resolveSizeAndState(0, 0, 0)))));
                                                                                int i285 = b + 7;
                                                                                TuitionPaymentFragmentbindingInflater1 = i285 % 128;
                                                                                int i286 = i285 % 2;
                                                                                int i287 = -View.combineMeasuredStates(0, 0);
                                                                                Object[] objArr30 = new Object[1];
                                                                                a(cArr14, b8, (i287 & 23) + (i287 | 23), objArr30);
                                                                                ?? r6 = r21;
                                                                                if (!r6.equals(cls9.getMethod((String) objArr30[0], null).invoke(objInvoke5, null))) {
                                                                                    obj = obj3;
                                                                                    r21 = r6;
                                                                                    objArr15 = objArr20;
                                                                                    NewInstance = (NewInstance | 1) + (NewInstance & 1);
                                                                                }
                                                                            } catch (Throwable th) {
                                                                                Throwable cause = th.getCause();
                                                                                if (cause != null) {
                                                                                    throw cause;
                                                                                }
                                                                                throw th;
                                                                            }
                                                                        }
                                                                        Object[] objArr31 = {new int[]{i}, new int[1], new int[]{(~(i & 1)) & (i | 1)}, null};
                                                                        int i288 = (-549971510) + (((~(i | 11358369)) | (-29218228)) * 305) + (((~(11358369 | i38)) | (-28951860)) * 305);
                                                                        int iTuitionPaymentFragmentbindingInflater6 = AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1();
                                                                        int i289 = -(-(i288 * (-219)));
                                                                        int i290 = (3536 & i289) + (i289 | 3536);
                                                                        int i291 = ~i288;
                                                                        int i292 = ~((i291 & (-17)) | ((-17) ^ i291));
                                                                        int i293 = ~iTuitionPaymentFragmentbindingInflater6;
                                                                        int i294 = (i293 & 16) | (i293 ^ 16);
                                                                        int i295 = ~((i294 & i288) | (i294 ^ i288));
                                                                        int i296 = i290 + (((i292 & i295) | (i292 ^ i295)) * 220);
                                                                        int i297 = ~((~iTuitionPaymentFragmentbindingInflater6) | i288);
                                                                        int i298 = -(-(((i297 & 16) | (i297 ^ 16)) * (-440)));
                                                                        int i299 = ((i296 | i298) << 1) - (i298 ^ i296);
                                                                        int i300 = (i288 ^ 16) | (i288 & 16);
                                                                        int i301 = ((iTuitionPaymentFragmentbindingInflater6 & i300) | (i300 ^ iTuitionPaymentFragmentbindingInflater6)) * 220;
                                                                        int i302 = ((i299 | i301) << 1) - (i301 ^ i299);
                                                                        int i303 = (i2 ^ i302) + ((i302 & i2) << 1);
                                                                        int i304 = i303 ^ (i303 << 13);
                                                                        int i305 = i304 >>> 17;
                                                                        int i306 = ((~i304) & i305) | ((~i305) & i304);
                                                                        int i307 = i306 << 5;
                                                                        ((int[]) objArr31[1])[0] = (i306 | i307) & (~(i306 & i307));
                                                                        return objArr31;
                                                                    } catch (Throwable th2) {
                                                                        Throwable cause2 = th2.getCause();
                                                                        if (cause2 != null) {
                                                                            throw cause2;
                                                                        }
                                                                        throw th2;
                                                                    }
                                                                } catch (Throwable th3) {
                                                                    Throwable cause3 = th3.getCause();
                                                                    if (cause3 != null) {
                                                                        throw cause3;
                                                                    }
                                                                    throw th3;
                                                                }
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
                                                    }
                                                    NewInstance = i2;
                                                }
                                            } catch (Throwable unused) {
                                            }
                                        } catch (Throwable th6) {
                                            Throwable cause6 = th6.getCause();
                                            if (cause6 != null) {
                                                throw cause6;
                                            }
                                            throw th6;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        Throwable cause7 = th.getCause();
                                        if (cause7 != null) {
                                            throw cause7;
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
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
                NewInstance = i2;
            }
        } else {
            NewInstance = i2;
        }
        int i308 = b;
        int i309 = (i308 & 123) + (i308 | 123);
        int i310 = i309 % 128;
        TuitionPaymentFragmentbindingInflater1 = i310;
        int i311 = i309 % 2;
        Object[] objArr32 = {new int[]{i}, new int[1], new int[]{i}, null};
        int i312 = ~i;
        int i313 = 2063533684 + ((502218283 | i) * 376) + (((~(271280788 | i312)) | 230954027) * (-376)) + (((~((-271280789) | i)) | (-230970560)) * 376);
        int i314 = i310 + 41;
        b = i314 % 128;
        if (i314 % 2 != 0) {
            i3 = (0 % ((-49) / i313)) >> ((-50) >> i);
            int i315 = ~i313;
            i5 = ~(i | ((-1) ^ i));
            i4 = i315 | i312;
        } else {
            int i316 = i313 * (-49);
            int i317 = -(-(i * (-50)));
            i3 = ((i316 | i317) << 1) - (i316 ^ i317);
            int i318 = ~i313;
            int i319 = i318 | ((-1) ^ i318);
            int i320 = ~((i319 & i) | (i319 ^ i));
            int i321 = ~i313;
            int i322 = ~i;
            i4 = (i322 & i321) | (i321 ^ i322);
            i5 = i320;
        }
        int i323 = ~i4;
        int i324 = -(-(50 * ((i5 & i323) | (i5 ^ i323))));
        int i325 = (i3 & i324) + (i324 | i3);
        int i326 = ~i313;
        int i327 = ~((i326 & i312) | (i326 ^ i312));
        int i328 = ~(~i313);
        int i329 = i325 + (((i327 & i328) | (i327 ^ i328) | (~i312)) * 50);
        int iTuitionPaymentFragmentbindingInflater7 = AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1();
        int i330 = ((i329 * 677) - (~(NewInstance * (-675)))) - 1;
        int i331 = (i329 ^ iTuitionPaymentFragmentbindingInflater7) | (i329 & iTuitionPaymentFragmentbindingInflater7);
        int i332 = ~NewInstance;
        int i333 = -(-(((i331 & i332) | (i331 ^ i332)) * (-676)));
        int i334 = ((i330 | i333) << 1) - (i330 ^ i333);
        int i335 = b;
        int i336 = ((i335 | 21) << 1) - (i335 ^ 21);
        int i337 = i336 % 128;
        TuitionPaymentFragmentbindingInflater1 = i337;
        int i338 = i336 % 2;
        int i339 = ~((i332 ^ i329) | (i332 & i329));
        int i340 = ~iTuitionPaymentFragmentbindingInflater7;
        int i341 = (i334 - (~(676 * (i339 | (~(i340 | i329)))))) - 1;
        int i342 = ~i329;
        int i343 = ~((i342 & i332) | (i342 ^ i332));
        int i344 = ~((i332 & i340) | (i332 ^ i340));
        int i345 = (i337 & 67) + (i337 | 67);
        b = i345 % 128;
        int i346 = i345 % 2;
        int i347 = i343 | i344;
        int i348 = (i329 ^ NewInstance) | (NewInstance & i329);
        int i349 = ~((iTuitionPaymentFragmentbindingInflater7 & i348) | (i348 ^ iTuitionPaymentFragmentbindingInflater7));
        int i350 = (i349 & i347) | (i347 ^ i349);
        if (i346 != 0) {
            int i351 = i341 * (676 >> i350);
            int i352 = i351 - 82;
            int i353 = (i352 | i351) & (~(i351 & i352));
            int i354 = i353 >> 78;
            int i355 = (i353 | i354) & (~(i353 & i354));
            int i356 = (i355 & (-3)) + (i355 | (-3));
            ((int[]) objArr32[0])[0] = (i355 | i356) & (~(i355 & i356));
        } else {
            int i357 = i350 * 676;
            int i358 = ((i341 | i357) << 1) - (i357 ^ i341);
            int i359 = i358 << 13;
            int i360 = (i359 & (~i358)) | ((~i359) & i358);
            int i361 = i360 >>> 17;
            int i362 = (i360 | i361) & (~(i360 & i361));
            int i363 = i362 << 5;
            ((int[]) objArr32[1])[0] = (i362 | i363) & (~(i362 & i363));
        }
        return objArr32;
    }

    private static String $$c(byte b2, int i, short s) {
        byte[] bArr = $$a;
        int i2 = s + 113;
        int i3 = b2 * 2;
        int i4 = 3 - (i * 2);
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        int i6 = -1;
        if (bArr == null) {
            i6 = -1;
            i2 = (-i4) + i5;
            i4 = i4;
        }
        while (true) {
            int i7 = i4 + 1;
            int i8 = i6 + 1;
            bArr2[i8] = (byte) i2;
            if (i8 == i5) {
                return new String(bArr2, 0);
            }
            i6 = i8;
            i2 = (-bArr[i7]) + i2;
            i4 = i7;
        }
    }
}
