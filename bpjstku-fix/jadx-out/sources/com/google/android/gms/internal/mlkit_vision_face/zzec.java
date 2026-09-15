package com.google.android.gms.internal.mlkit_vision_face;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.ComposerKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.work.WorkInfo;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_CustomAttribute;
import defpackage.deInitSession;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes6.dex */
public final class zzec {
    private static final byte[] $$a = {60, 80, 13, 34};
    private static final int $$b = 58;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {60054, 60110, 60041, 59744, 59751, 60085, 60117, 60057, 59752, 60059, 60095, 60050, 60084, 60063, 59745, 60052, 60067, 60055, 60053, 60047, 60090, 59748, 60098, 60093, 60048, 60102, 60049, 60060, 60088, 59753, 60123, 60040, 60046, 60107, 59750, 60078, 59746, 60075, 60062, 60056, 59749, 60034, 60119, 60072, 59747, 60043, 60045, 60061, 60058};
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 57190;
    private static char[] b = {47501, 47510, 47489, 47551, 47433, 47492, 47506, 47508, 47490, 47493, 47502, 47491, 47550, 47503, 47426, 47431, 47519, 47463, 47497, 47495, 47499, 47476, 47482, 47458, 47460, 47435, 47464, 47478, 47507, 47496, 47465, 47447, 47475, 47509, 47504, 47500, 47466, 47498, 47470, 47505, 47486, 47477};
    private static int TuitionPaymentFragmentbindingInflater1 = 2047719735;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
    private static boolean d = true;

    private static void c(int i, char[] cArr, int[] iArr, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr2 = b;
        long j = 0;
        if (cArr2 != null) {
            int i4 = $11 + 1;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 25;
                $11 = i7 % 128;
                int i8 = i7 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (31339 - ExpandableListView.getPackedPositionGroup(j)), (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 2995, View.MeasureSpec.getMode(0) + 17, 1182129903, false, $$c((byte) ($$b & 244), b2, b2), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i6++;
                    int i9 = $11 + 111;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    i2 = 2;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i11 = $11 + 111;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 43325), 253 - ExpandableListView.getPackedPositionGroup(0L), View.MeasureSpec.getSize(0) + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
        int i13 = 49;
        int i14 = 33602;
        int i15 = 1687675375;
        if (!d) {
            if (!TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i15);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b3 = (byte) 0;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (33602 - ExpandableListView.getPackedPositionType(0L)), 3085 - (ViewConfiguration.getEdgeSlop() >> 16), 26 - KeyEvent.keyCodeFromString(""), -2146875848, false, $$c((byte) 49, b3, b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                i15 = 1687675375;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i16 = $11 + 83;
        $10 = i16 % 128;
        int i17 = i16 % 2;
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
            int i18 = $10 + 23;
            $11 = i18 % 128;
            if (i18 % 2 == 0) {
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 >>> getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] * i] - iIntValue);
                Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b4 = (byte) i13;
                    byte b5 = (byte) 0;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (KeyEvent.keyCodeFromString("") + i14), 3084 - TextUtils.lastIndexOf("", '0', 0), TextUtils.lastIndexOf("", '0', 0) + 27, -2146875848, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            } else {
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b6 = (byte) 0;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (TextUtils.getTrimmedLength("") + 33602), 3085 - KeyEvent.normalizeMetaState(0), 26 - (Process.myTid() >> 22), -2146875848, false, $$c((byte) 49, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            }
            i13 = 49;
            i14 = 33602;
        }
        objArr[0] = new String(cArr6);
    }

    private static void a(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Object obj2 = null;
        int i4 = 8;
        int i5 = 3;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b3 = (byte) i5;
                        byte b4 = (byte) (b3 - 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getTouchSlop() >> i4), KeyEvent.normalizeMetaState(0) + 2267, Gravity.getAbsoluteGravity(0, 0) + 33, -1927765101, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i6++;
                    i4 = 8;
                    i5 = 3;
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
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            byte b5 = (byte) 3;
            byte b6 = (byte) (b5 - 3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getEdgeSlop() >> 16) + 2267, (ViewConfiguration.getFadingEdgeLength() >> 16) + 33, -1927765101, false, $$c(b5, b6, b6), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i7 = $10 + 95;
            $11 = i7 % 128;
            int i8 = i7 % 2;
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
                    int i9 = $10 + 69;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    obj = obj2;
                } else {
                    Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char packedPositionChild = (char) (49266 - ExpandableListView.getPackedPositionChild(0L));
                        int iLastIndexOf = 3260 - TextUtils.lastIndexOf("", '0');
                        int i11 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 30;
                        byte b7 = (byte) ($$b & 7);
                        byte b8 = (byte) (b7 - 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionChild, iLastIndexOf, i11, -127612708, false, $$c(b7, b8, b8), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                        int i12 = $10 + 31;
                        $11 = i12 % 128;
                        int i13 = i12 % 2;
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = b9;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (22878 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 594 - ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 17, 1570859318, false, $$c(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        int i14 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i14];
                    } else {
                        obj = null;
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i15 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i16 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i15];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i16];
                        } else {
                            int i17 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i18 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i17];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i18];
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                obj2 = obj;
            }
        }
        for (int i19 = 0; i19 < i; i19++) {
            cArr4[i19] = (char) (cArr4[i19] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        Class<?> cls;
        char[] cArr;
        byte b2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 2 % 2;
        Object obj = null;
        int i15 = 0;
        int i16 = 1;
        if (context != null) {
            try {
                char[] cArr2 = {'!', 0, 27, 18, 20, 11, 1, 16, '\f', 7, 31, '\t', '#', '\n', Typography.quote, 25, '/', 7, 27, 18, 20, 11, 1, 16, '\f', 7, 0, '#', 21, '\'', 13879};
                byte bMyTid = (byte) ((Process.myTid() >> 22) + 110);
                int i17 = asInterface;
                int i18 = (i17 ^ 3) + ((i17 & 3) << 1);
                asBinder = i18 % 128;
                int i19 = i18 % 2;
                Object[] objArr = new Object[1];
                a(cArr2, bMyTid, 31 - KeyEvent.getDeadChar(0, 0), objArr);
                try {
                    Object[] objArr2 = {(String) objArr[0]};
                    int threadPriority = Process.getThreadPriority(0);
                    int iTuitionPaymentFragmentbindingInflater1 = AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1();
                    int i20 = ~(((-21) ^ threadPriority) | ((-21) & threadPriority));
                    int i21 = ~(((-21) & iTuitionPaymentFragmentbindingInflater1) | ((-21) ^ iTuitionPaymentFragmentbindingInflater1));
                    int i22 = ((5680 + (threadPriority * (-282))) - (~(((i21 & i20) | (i20 ^ i21)) * (-283)))) - 1;
                    int i23 = (~((~threadPriority) | 20)) * 283;
                    int i24 = (i22 & i23) + (i23 | i22);
                    int i25 = ~threadPriority;
                    int i26 = (i25 & (-21)) | ((-21) ^ i25);
                    int i27 = asBinder + 99;
                    asInterface = i27 % 128;
                    int i28 = i27 % 2;
                    int i29 = 283 * (~((i26 & iTuitionPaymentFragmentbindingInflater1) | (i26 ^ iTuitionPaymentFragmentbindingInflater1)));
                    int i30 = -(((i24 ^ i29) + ((i29 & i24) << 1)) >> 6);
                    int iTuitionPaymentFragmentbindingInflater2 = AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1();
                    int i31 = i30 * (-405);
                    int i32 = asInterface;
                    int i33 = ((i32 | 97) << 1) - (i32 ^ 97);
                    asBinder = i33 % 128;
                    int i34 = i33 % 2;
                    int i35 = (i31 & 51689) + (i31 | 51689);
                    int i36 = ~(((-128) ^ iTuitionPaymentFragmentbindingInflater2) | ((-128) & iTuitionPaymentFragmentbindingInflater2));
                    int i37 = ~iTuitionPaymentFragmentbindingInflater2;
                    int i38 = ~((i37 ^ i30) | (i37 & i30) | 127);
                    int i39 = ((i36 & i38) | (i36 ^ i38)) * (-406);
                    int i40 = (i35 ^ i39) + ((i39 & i35) << 1);
                    int i41 = -(-((~((~iTuitionPaymentFragmentbindingInflater2) | WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT | i30)) * (-406)));
                    int i42 = (i40 & i41) + (i41 | i40);
                    int i43 = ~i30;
                    int i44 = ((~((i43 & iTuitionPaymentFragmentbindingInflater2) | (i43 ^ iTuitionPaymentFragmentbindingInflater2))) | (~((i37 ^ 127) | (i37 & 127)))) * 406;
                    Object[] objArr3 = new Object[1];
                    c((i42 ^ i44) + ((i44 & i42) << 1), null, null, new byte[]{-107, -126, -108, -117, -120, -109, -117, -118, -110, -112, -112, -113, -111, -123, -112, -112, -113, -124, -123, -114, -116, -119, -126, -123, -115, -116, -117, -118, -119, -120, -121, -122, -123, -124, -126, -125, -126, -127}, objArr3);
                    Object objNewInstance = Class.forName((String) objArr3[0]).getDeclaredConstructor(String.class).newInstance(objArr2);
                    Object[] objArr4 = new Object[1];
                    c(126 - (~KeyEvent.normalizeMetaState(0)), null, null, new byte[]{-93, -119, -94, -121, -95, -96, -99, -117, -98, -118, -99, -109, -100, -105, -97, -106, -102, -99, -117, -98, -118, -99, -109, -100, -105, -101, -102, -103, -104, -105, -106}, objArr4);
                    try {
                        Object[] objArr5 = {(String) objArr4[0]};
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L);
                        int iTuitionPaymentFragmentbindingInflater3 = AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1();
                        int i45 = packedPositionType * 495;
                        int i46 = (((i45 ^ (-62611)) + ((i45 & (-62611)) << 1)) - (~(-(-(((packedPositionType ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (packedPositionType & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT)) * (-988)))))) - 1;
                        int i47 = ~packedPositionType;
                        int i48 = ~iTuitionPaymentFragmentbindingInflater3;
                        int i49 = (i47 | 127 | i48) * 494;
                        int i50 = ~(i47 | WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT);
                        int i51 = ~((i48 & 127) | (i48 ^ 127));
                        int i52 = (i51 & i50) | (i50 ^ i51);
                        int i53 = ~(packedPositionType | 127);
                        int i54 = i52 ^ i53;
                        Object[] objArr6 = new Object[1];
                        c((((i46 | i49) << 1) - (i49 ^ i46)) + (((i53 & i52) | i54) * 494), null, null, new byte[]{-107, -126, -108, -117, -120, -109, -117, -118, -110, -112, -112, -113, -111, -123, -112, -112, -113, -124, -123, -114, -116, -119, -126, -123, -115, -116, -117, -118, -119, -120, -121, -122, -123, -124, -126, -125, -126, -127}, objArr6);
                        Object objNewInstance2 = Class.forName((String) objArr6[0]).getDeclaredConstructor(String.class).newInstance(objArr5);
                        int i55 = asBinder;
                        int i56 = ((i55 | 35) << 1) - (i55 ^ 35);
                        asInterface = i56 % 128;
                        int i57 = i56 % 2;
                        try {
                            Object[] objArr7 = new Object[1];
                            c(126 - (~(-ExpandableListView.getPackedPositionType(0L))), null, null, new byte[]{-116, -124, -121, -116, -109, -98, -106, -123, -116, -109, -121, -116, -109, -98, -120, -123, -99, -117, -98, -118, -99, -109, -126}, objArr7);
                            Class<?> cls2 = Class.forName((String) objArr7[0]);
                            int i58 = -Drawable.resolveOpacity(0, 0);
                            int iTuitionPaymentFragmentbindingInflater4 = AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1();
                            int i59 = (i58 * 70) - 8636;
                            int i60 = ~i58;
                            int i61 = asBinder + 113;
                            asInterface = i61 % 128;
                            if (i61 % 2 == 0) {
                                obj.hashCode();
                                throw null;
                            }
                            int i62 = (i60 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i60 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT);
                            int i63 = ~((i62 & iTuitionPaymentFragmentbindingInflater4) | (i62 ^ iTuitionPaymentFragmentbindingInflater4));
                            int i64 = (i58 ^ 127) | (i58 & 127);
                            int i65 = ~((i64 ^ iTuitionPaymentFragmentbindingInflater4) | (i64 & iTuitionPaymentFragmentbindingInflater4));
                            int i66 = i59 + (((i63 ^ i65) | (i63 & i65)) * 69);
                            int i67 = ~i58;
                            int i68 = ~((i67 & 127) | (i67 ^ 127));
                            int i69 = ~((i60 & iTuitionPaymentFragmentbindingInflater4) | (i60 ^ iTuitionPaymentFragmentbindingInflater4));
                            int i70 = (i68 & i69) | (i68 ^ i69);
                            int i71 = ~(iTuitionPaymentFragmentbindingInflater4 | 127);
                            int i72 = ((i70 & i71) | (i70 ^ i71)) * (-69);
                            int i73 = (i66 ^ i72) + ((i72 & i66) << 1);
                            int i74 = -(-((~(((-128) ^ i58) | (i58 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT))) * 69));
                            int i75 = (i73 & i74) + (i74 | i73);
                            Object[] objArr8 = new Object[1];
                            c(i75, null, null, new byte[]{-118, -121, -93, -126, -109, -126, -91, -121, -93, -126, -92, -120, -126, -110, -116, -121, -93}, objArr8);
                            Object objInvoke = cls2.getMethod((String) objArr8[0], null).invoke(context, null);
                            try {
                                Object[] objArr9 = new Object[1];
                                c(127 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), null, null, new byte[]{-116, -124, -121, -116, -109, -98, -106, -123, -116, -109, -121, -116, -109, -98, -120, -123, -99, -117, -98, -118, -99, -109, -126}, objArr9);
                                Class<?> cls3 = Class.forName((String) objArr9[0]);
                                int iResolveOpacity = Drawable.resolveOpacity(0, 0);
                                int i76 = (iResolveOpacity * 784) - 25024;
                                int i77 = (i76 ^ 25839) + ((i76 & 25839) << 1);
                                int i78 = ~iResolveOpacity;
                                int i79 = ~i;
                                int i80 = (i78 ^ i79) | (i78 & i79);
                                int i81 = (~((i80 ^ 32) | (i80 & 32))) * (-783);
                                int i82 = (i77 ^ i81) + ((i81 & i77) << 1);
                                int i83 = ~iResolveOpacity;
                                int i84 = ~(i79 | 32);
                                int i85 = ((i83 & i84) | (i83 ^ i84)) * 783;
                                int minimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity() >> 16;
                                int i86 = (minimumFlingVelocity ^ 14) + ((minimumFlingVelocity & 14) << 1);
                                Object[] objArr10 = new Object[1];
                                a(new char[]{24, ')', 16, '(', '.', ')', 27, '-', 24, ')', 6, '/', 3, '#'}, (byte) ((i82 & i85) + (i82 | i85)), i86, objArr10);
                                try {
                                    Object[] objArr11 = {cls3.getMethod((String) objArr10[0], null).invoke(context, null), 64};
                                    Object[] objArr12 = new Object[1];
                                    c(127 - (~(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))), null, null, new byte[]{-118, -121, -93, -126, -109, -126, -91, -121, -93, -126, -92, -120, -126, -110, -123, -90, -108, -123, -116, -109, -121, -116, -109, -98, -120, -123, -99, -117, -98, -118, -99, -109, -126}, objArr12);
                                    Class<?> cls4 = Class.forName((String) objArr12[0]);
                                    Object[] objArr13 = new Object[1];
                                    c(126 - (~(-(ViewConfiguration.getDoubleTapTimeout() >> 16))), null, null, new byte[]{-98, -88, -109, -89, -121, -93, -126, -92, -120, -126, -110, -116, -121, -93}, objArr13);
                                    Object objInvoke2 = cls4.getMethod((String) objArr13[0], String.class, Integer.TYPE).invoke(objInvoke, objArr11);
                                    int i87 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                    int i88 = i87 * (-830);
                                    int i89 = (i88 & 104832) + (i88 | 104832);
                                    int i90 = ~(((-127) ^ i79) | ((-127) & i79));
                                    int i91 = asBinder;
                                    int i92 = ((i91 | 115) << 1) - (i91 ^ 115);
                                    asInterface = i92 % 128;
                                    if (i92 % 2 == 0) {
                                        int i93 = i87 | 126;
                                        int i94 = ~((i93 & i) | (i93 ^ i));
                                        int i95 = i89 + ((-831) / ((i94 & i90) | (i90 ^ i94)));
                                        int i96 = (-127) | i87;
                                        i3 = i95 << ((~((i96 & i) | (i96 ^ i))) * (-1662));
                                    } else {
                                        int i97 = i87 | 126;
                                        int i98 = (i90 | (~((i97 ^ i) | (i97 & i)))) * (-831);
                                        int i99 = (-127) | i87;
                                        i3 = ((~((i99 & i) | (i99 ^ i))) * (-1662)) + (((i89 | i98) << 1) - (i98 ^ i89));
                                    }
                                    int i100 = ~i87;
                                    int i101 = ~((i100 & i79) | (i100 ^ i79));
                                    int i102 = ~(i87 | i);
                                    int i103 = (i102 & i101) | (i101 ^ i102);
                                    int i104 = ~((i ^ 126) | (i & 126));
                                    int i105 = i103 ^ i104;
                                    Object[] objArr14 = new Object[1];
                                    c((i3 - (~(831 * ((i103 & i104) | i105)))) - 1, null, null, new byte[]{-98, -88, -109, -89, -121, -93, -126, -92, -120, -126, -110, -123, -90, -108, -123, -116, -109, -121, -116, -109, -98, -120, -123, -99, -117, -98, -118, -99, -109, -126}, objArr14);
                                    Class<?> cls5 = Class.forName((String) objArr14[0]);
                                    char[] cArr3 = {' ', '\n', 25, 20, '/', 20, 30, 4, '-', Typography.amp};
                                    int iResolveSize = View.resolveSize(0, 0);
                                    int iTuitionPaymentFragmentbindingInflater5 = AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1();
                                    int i106 = (iResolveSize * 221) - 1095;
                                    int i107 = ~iResolveSize;
                                    int i108 = ~((i107 ^ (-6)) | (i107 & (-6)));
                                    int i109 = ~iTuitionPaymentFragmentbindingInflater5;
                                    int i110 = (i109 ^ iResolveSize) | (i109 & iResolveSize);
                                    int i111 = 5;
                                    int i112 = ~((i110 ^ 5) | (i110 & 5));
                                    int i113 = ((i108 ^ i112) | (i112 & i108)) * 220;
                                    int i114 = ((i106 | i113) << 1) - (i113 ^ i106);
                                    int i115 = ~((i109 ^ 5) | (i109 & 5));
                                    int i116 = i114 + (((i115 & iResolveSize) | (iResolveSize ^ i115)) * (-440));
                                    int i117 = (iResolveSize ^ 5) | (iResolveSize & 5);
                                    int i118 = -(-(((i117 & iTuitionPaymentFragmentbindingInflater5) | (i117 ^ iTuitionPaymentFragmentbindingInflater5)) * 220));
                                    int i119 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                                    int i120 = (i119 & 10) + (i119 | 10);
                                    Object[] objArr15 = new Object[1];
                                    a(cArr3, (byte) ((i116 & i118) + (i118 | i116)), i120, objArr15);
                                    Object[] objArr16 = (Object[]) cls5.getField((String) objArr15[0]).get(objInvoke2);
                                    int length = objArr16.length;
                                    int i121 = 0;
                                    while (true) {
                                        if (i121 < length) {
                                            Object obj2 = objArr16[i121];
                                            int i122 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                                            int i123 = (i122 & 127) + (i122 | 127);
                                            byte[] bArr = new byte[i111];
                                            // fill-array-data instruction
                                            bArr[0] = -87;
                                            bArr[1] = -112;
                                            bArr[2] = -113;
                                            bArr[3] = -123;
                                            bArr[4] = -111;
                                            Object[] objArr17 = new Object[i16];
                                            c(i123, null, null, bArr, objArr17);
                                            try {
                                                Object[] objArr18 = {(String) objArr17[i15]};
                                                char[] cArr4 = {27, '/', '/', '*', 3, Typography.quote, '\'', '(', 30, 4, '\f', 18, '0', '\r', '(', '\'', 5, 16, 0, Typography.quote, '%', 3, 18, '\f', '.', '\f', ')', '.', 17, '(', 27, ',', '(', 18, 16, 1, 13910};
                                                int iIndexOf = TextUtils.indexOf("", "", i15, i15);
                                                int iAlpha = Color.alpha(i15);
                                                int i124 = iAlpha * 758;
                                                int i125 = (i124 ^ (-27972)) + ((i124 & (-27972)) << i16);
                                                int i126 = (iAlpha | i79) * (-757);
                                                int i127 = ((i125 | i126) << 1) - (i125 ^ i126);
                                                int i128 = ((-38) ^ iAlpha) | ((-38) & iAlpha);
                                                int i129 = (~((i128 ^ i) | (i128 & i))) * 1514;
                                                int i130 = (i127 & i129) + (i127 | i129);
                                                int i131 = ~iAlpha;
                                                int i132 = ~((i131 ^ (-38)) | ((-38) & i131));
                                                int i133 = ~i;
                                                int i134 = i132 | (~(((-38) ^ i133) | ((-38) & i133)));
                                                int i135 = iAlpha | 37;
                                                int i136 = ~((i135 & i) | (i135 ^ i));
                                                int i137 = -(-(((i134 & i136) | (i134 ^ i136)) * 757));
                                                int i138 = (i130 & i137) + (i130 | i137);
                                                Object[] objArr19 = new Object[i16];
                                                a(cArr4, (byte) (((iIndexOf | 115) << i16) - (iIndexOf ^ 115)), i138, objArr19);
                                                Class<?> cls6 = Class.forName((String) objArr19[0]);
                                                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0);
                                                int i139 = (absoluteGravity * 46) + 5842;
                                                int i140 = asInterface + 47;
                                                asBinder = i140 % 128;
                                                if (i140 % 2 != 0) {
                                                    int i141 = ~(((-128) ^ i133) | ((-128) & i133));
                                                    i4 = i139 * ((-90) >>> ((absoluteGravity ^ i141) | (i141 & absoluteGravity)));
                                                    i5 = ~(((-128) & i) | ((-128) ^ i));
                                                    i6 = ~((absoluteGravity ^ 127) | (absoluteGravity & 127));
                                                } else {
                                                    int i142 = ~((-128) | i79);
                                                    int i143 = ((i142 & absoluteGravity) | (absoluteGravity ^ i142)) * (-90);
                                                    i4 = ((i139 | i143) << 1) - (i139 ^ i143);
                                                    i5 = ~(((-128) ^ i) | ((-128) & i));
                                                    i6 = ~((absoluteGravity ^ 127) | (absoluteGravity & 127));
                                                }
                                                int i144 = (-45) * ((i5 ^ i6) | (i5 & i6));
                                                int i145 = (i4 ^ i144) + ((i4 & i144) << 1);
                                                int i146 = ~absoluteGravity;
                                                int i147 = (~((i146 & i) | (i146 ^ i))) | WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                                                int i148 = ~((absoluteGravity & i79) | (i79 ^ absoluteGravity));
                                                int i149 = -(-(((i147 & i148) | (i147 ^ i148)) * 45));
                                                int i150 = ((i145 | i149) << 1) - (i149 ^ i145);
                                                Object[] objArr20 = new Object[1];
                                                c(i150, null, null, new byte[]{-121, -120, -109, -126, -116, -122, -109, -89, -116, -121, -93}, objArr20);
                                                Object objInvoke3 = cls6.getMethod((String) objArr20[0], String.class).invoke(null, objArr18);
                                                try {
                                                    int i151 = -TextUtils.indexOf((CharSequence) "", '0');
                                                    int iTuitionPaymentFragmentbindingInflater6 = AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1();
                                                    int i152 = i151 * (-1335);
                                                    int i153 = ((i152 | (-84042)) << 1) - (i152 ^ (-84042));
                                                    int i154 = ~(i151 | iTuitionPaymentFragmentbindingInflater6);
                                                    int i155 = (i153 - (~((((-127) ^ i154) | (i154 & ComposerKt.defaultsKey)) * (-668)))) - 1;
                                                    int i156 = ~(((-127) ^ iTuitionPaymentFragmentbindingInflater6) | ((-127) & iTuitionPaymentFragmentbindingInflater6));
                                                    int i157 = -(-(((i151 ^ i156) | (i156 & i151)) * 1336));
                                                    int i158 = ((i155 | i157) << 1) - (i157 ^ i155);
                                                    int i159 = (i151 & iTuitionPaymentFragmentbindingInflater6) | (i151 ^ iTuitionPaymentFragmentbindingInflater6);
                                                    int i160 = ((i159 & ComposerKt.defaultsKey) | (i159 ^ ComposerKt.defaultsKey)) * 668;
                                                    int i161 = (i158 & i160) + (i158 | i160);
                                                    byte[] bArr2 = {-121, -118, -119, -116, -126, -109, -93, -117, -103, -123, -90, -108, -123, -116, -109, -121, -116, -109, -98, -120, -123, -99, -117, -98, -118, -99, -109, -126};
                                                    int i162 = asBinder;
                                                    int i163 = ((i162 | 101) << 1) - (i162 ^ 101);
                                                    asInterface = i163 % 128;
                                                    int i164 = i163 % 2;
                                                    Object[] objArr21 = new Object[1];
                                                    c(i161, null, null, bArr2, objArr21);
                                                    Class<?> cls7 = Class.forName((String) objArr21[0]);
                                                    int i165 = -Color.blue(0);
                                                    int iTuitionPaymentFragmentbindingInflater7 = AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1();
                                                    int i166 = i165 * 253;
                                                    int i167 = (i166 & 32131) + (i166 | 32131);
                                                    int i168 = ~i165;
                                                    int i169 = ~((i168 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i168 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                                                    int i170 = asBinder;
                                                    Object[] objArr22 = objArr16;
                                                    int i171 = i170 + 99;
                                                    int i172 = length;
                                                    asInterface = i171 % 128;
                                                    int i173 = i171 % 2;
                                                    int i174 = ~((~iTuitionPaymentFragmentbindingInflater7) | WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT);
                                                    int i175 = (i169 ^ i174) | (i174 & i169);
                                                    int i176 = (i165 ^ 127) | (i165 & 127);
                                                    int i177 = (i176 ^ iTuitionPaymentFragmentbindingInflater7) | (i176 & iTuitionPaymentFragmentbindingInflater7);
                                                    int i178 = i121;
                                                    int i179 = ~i177;
                                                    int i180 = (-252) * ((i175 ^ i179) | (i175 & i179));
                                                    int i181 = (((i167 & i180) + (i180 | i167)) - (~(-(-(i176 * (-252)))))) - 1;
                                                    int i182 = (i170 ^ 105) + ((i170 & 105) << 1);
                                                    asInterface = i182 % 128;
                                                    if (i182 % 2 == 0) {
                                                        Object obj3 = null;
                                                        obj3.hashCode();
                                                        throw null;
                                                    }
                                                    int i183 = ~(i165 | (~iTuitionPaymentFragmentbindingInflater7) | WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT);
                                                    int i184 = ~i177;
                                                    int i185 = 252 * ((i184 & i183) | (i183 ^ i184));
                                                    Object[] objArr23 = new Object[1];
                                                    c((i181 ^ i185) + ((i181 & i185) << 1), null, null, new byte[]{-115, -126, -118, -118, -100, -121, -116, -115, -86, -98, -116}, objArr23);
                                                    try {
                                                        Object[] objArr24 = {new ByteArrayInputStream((byte[]) cls7.getMethod((String) objArr23[0], null).invoke(obj2, null))};
                                                        char[] cArr5 = {27, '/', '/', '*', 3, Typography.quote, '\'', '(', 30, 4, '\f', 18, '0', '\r', '(', '\'', 5, 16, 0, Typography.quote, '%', 3, 18, '\f', '.', '\f', ')', '.', 17, '(', 27, ',', '(', 18, 16, 1, 13910};
                                                        int windowTouchSlop = ViewConfiguration.getWindowTouchSlop() >> 8;
                                                        int i186 = (windowTouchSlop * (-519)) - (-59915);
                                                        int i187 = (~windowTouchSlop) | (-116);
                                                        int i188 = -(-(((~((i187 & i79) | (i187 ^ i79))) | (~((i ^ 115) | (i & 115)))) * 520));
                                                        int i189 = ((i186 | i188) << 1) - (i186 ^ i188);
                                                        int i190 = ~((-116) | i133);
                                                        int i191 = asBinder + 83;
                                                        asInterface = i191 % 128;
                                                        int i192 = i191 % 2;
                                                        int i193 = ~((windowTouchSlop ^ i) | (windowTouchSlop & i));
                                                        int i194 = (-1040) * ((i190 & i193) | (i190 ^ i193));
                                                        int i195 = (i189 ^ i194) + ((i194 & i189) << 1);
                                                        int i196 = ~((~windowTouchSlop) | i133);
                                                        int i197 = ~(((-116) & windowTouchSlop) | ((-116) ^ windowTouchSlop));
                                                        int i198 = (i196 & i197) | (i196 ^ i197);
                                                        int i199 = ~(windowTouchSlop | i);
                                                        int i200 = -(-(((i199 & i198) | (i198 ^ i199)) * 520));
                                                        byte b3 = (byte) ((i195 & i200) + (i200 | i195));
                                                        int i201 = -TextUtils.indexOf("", "", 0);
                                                        int i202 = (i201 * (-751)) - 27787;
                                                        int i203 = ~i201;
                                                        int i204 = ~(i203 | (-38));
                                                        int i205 = ~i201;
                                                        int i206 = ~((i205 & i) | (i205 ^ i));
                                                        int i207 = ((i204 & i206) | (i204 ^ i206)) * 1504;
                                                        int i208 = ((i202 | i207) << 1) - (i202 ^ i207);
                                                        int i209 = (i203 ^ 37) | (i203 & 37);
                                                        int i210 = (~(i209 | i)) * (-1504);
                                                        int i211 = (i208 & i210) + (i210 | i208);
                                                        int i212 = ~i209;
                                                        int i213 = asBinder;
                                                        int i214 = (i213 ^ 5) + ((i213 & 5) << 1);
                                                        asInterface = i214 % 128;
                                                        int i215 = i214 % 2;
                                                        int i216 = ~((i201 & (-38)) | ((-38) ^ i201));
                                                        if (i215 == 0) {
                                                            int i217 = -(-(752 << ((i216 & i212) | (i212 ^ i216))));
                                                            Object[] objArr25 = new Object[1];
                                                            a(cArr5, b3, (i211 & i217) + (i217 | i211), objArr25);
                                                            cls = Class.forName((String) objArr25[0]);
                                                            cArr = new char[]{24, ')', 17, '\'', 6, ',', 17, '(', 31, '#', 5, 16, '\f', '.', 18, '.', '/', 20, 13849};
                                                            b2 = (byte) (83 / (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                                                            i7 = -(Process.myTid() + 20);
                                                            i8 = 86;
                                                        } else {
                                                            int i218 = i211 + (((i216 & i212) | (i212 ^ i216)) * 752);
                                                            Object[] objArr26 = new Object[1];
                                                            a(cArr5, b3, i218, objArr26);
                                                            cls = Class.forName((String) objArr26[0]);
                                                            cArr = new char[]{24, ')', 17, '\'', 6, ',', 17, '(', 31, '#', 5, 16, '\f', '.', 18, '.', '/', 20, 13849};
                                                            int i219 = -(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                                                            b2 = (byte) (((i219 | 25) << 1) - (i219 ^ 25));
                                                            i7 = -(Process.myTid() >> 22);
                                                            i8 = 19;
                                                        }
                                                        int i220 = 367 * i7;
                                                        int i221 = i8 * 367;
                                                        int i222 = (i220 ^ i221) + ((i220 & i221) << 1) + ((i7 | i8) * (-366));
                                                        int i223 = ~((~i8) | i);
                                                        int i224 = i222 + (((i223 & i7) | (i7 ^ i223)) * (-366));
                                                        int i225 = ~i7;
                                                        int i226 = asBinder;
                                                        int i227 = (i226 ^ 35) + ((i226 & 35) << 1);
                                                        asInterface = i227 % 128;
                                                        int i228 = i227 % 2;
                                                        int i229 = ~((i225 & i8) | (i225 ^ i8));
                                                        int i230 = ~i8;
                                                        int i231 = ~((i7 & i230) | (i230 ^ i7) | i);
                                                        Object[] objArr27 = new Object[1];
                                                        a(cArr, b2, (i224 - (~(366 * ((i231 & i229) | (i229 ^ i231))))) - 1, objArr27);
                                                        Object objInvoke4 = cls.getMethod((String) objArr27[0], InputStream.class).invoke(objInvoke3, objArr24);
                                                        AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1();
                                                        try {
                                                            char[] cArr6 = {27, '/', '/', '*', 3, Typography.quote, '\'', '(', 30, 4, '\f', 18, '0', '\r', '(', '\'', 5, 16, 2, 20, 5, 29, 21, 29, '%', 3, 18, '\f', '.', '\f', ')', '.', 17, '('};
                                                            int i232 = -Color.green(0);
                                                            int i233 = i232 * (-112);
                                                            int i234 = ((i233 | (-1680)) << 1) - (i233 ^ (-1680));
                                                            int i235 = asBinder;
                                                            int i236 = (i235 & 7) + (i235 | 7);
                                                            asInterface = i236 % 128;
                                                            int i237 = i236 % 2;
                                                            int i238 = ((-16) & i133) | ((-16) ^ i133);
                                                            int i239 = -(-(226 * ((~i238) | i232)));
                                                            int i240 = ((i234 | i239) << 1) - (i234 ^ i239);
                                                            int i241 = ~i232;
                                                            int i242 = ~((i241 & 15) | (i241 ^ 15));
                                                            int i243 = ~i232;
                                                            int i244 = ~((i243 & i) | (i243 ^ i));
                                                            int i245 = i235 + 5;
                                                            asInterface = i245 % 128;
                                                            int i246 = i245 % 2;
                                                            int i247 = -(-((-113) * ((~((i232 & i238) | (i238 ^ i232))) | (i242 & i244) | (i242 ^ i244))));
                                                            byte b4 = (byte) (((((i240 | i247) << 1) - (i247 ^ i240)) - (~(-(-((~((-16) | i)) * 113))))) - 1);
                                                            int i248 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                            int iTuitionPaymentFragmentbindingInflater8 = AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1();
                                                            int i249 = asInterface;
                                                            int i250 = (i249 ^ 105) + ((i249 & 105) << 1);
                                                            asBinder = i250 % 128;
                                                            if (i250 % 2 != 0) {
                                                                int i251 = -(-i248);
                                                                int i252 = ((i251 & 866) + (i251 | 866)) * (-29376);
                                                                int i253 = ~i248;
                                                                int i254 = ~iTuitionPaymentFragmentbindingInflater8;
                                                                i9 = (i252 >>> (((~((i253 & i254) | (i253 ^ i254))) | (-35)) * (-865))) % (865 / (~(i248 | iTuitionPaymentFragmentbindingInflater8)));
                                                            } else {
                                                                int i255 = i248 * 866;
                                                                int i256 = ((i255 | (-29376)) << 1) - (i255 ^ (-29376));
                                                                int i257 = ~i248;
                                                                int i258 = ~iTuitionPaymentFragmentbindingInflater8;
                                                                int i259 = ((~((i257 & i258) | (i257 ^ i258))) | (-35)) * (-865);
                                                                int i260 = (i256 ^ i259) + ((i259 & i256) << 1);
                                                                int i261 = (~(i248 | iTuitionPaymentFragmentbindingInflater8)) * 865;
                                                                i9 = (i261 | i260) + (i260 & i261);
                                                            }
                                                            int i262 = ~iTuitionPaymentFragmentbindingInflater8;
                                                            int i263 = ~((i262 & (-35)) | ((-35) ^ i262));
                                                            int i264 = ~iTuitionPaymentFragmentbindingInflater8;
                                                            int i265 = ~((i248 & i264) | (i264 ^ i248));
                                                            int i266 = -(-(((i265 & i263) | (i263 ^ i265)) * 865));
                                                            int i267 = (i9 ^ i266) + ((i266 & i9) << 1);
                                                            Object[] objArr28 = new Object[1];
                                                            a(cArr6, b4, i267, objArr28);
                                                            Class<?> cls8 = Class.forName((String) objArr28[0]);
                                                            char[] cArr7 = {24, ')', 15, '/', 28, 11, 24, '(', '(', 18, 15, 2, 13779, 13779, ',', '\t', 18, 25, '.', 18, '.', '*', 13855};
                                                            int i268 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                            byte b5 = (byte) ((i268 & 41) + (i268 | 41));
                                                            int iLastIndexOf = TextUtils.lastIndexOf("", '0');
                                                            int i269 = iLastIndexOf * 371;
                                                            int i270 = (i269 & 8904) + (i269 | 8904);
                                                            int i271 = asInterface;
                                                            int i272 = (i271 & 49) + (i271 | 49);
                                                            asBinder = i272 % 128;
                                                            if (i272 % 2 != 0) {
                                                                int i273 = ~((-25) | i79);
                                                                int i274 = ~iLastIndexOf;
                                                                int i275 = ~((i274 ^ i) | (i274 & i));
                                                                int i276 = -((i273 & i275) | (i273 ^ i275));
                                                                i10 = i270 * ((i276 & (-370)) + (i276 | (-370)));
                                                                i11 = i274 | i79;
                                                            } else {
                                                                int i277 = ~(((-25) & i133) | ((-25) ^ i133));
                                                                int i278 = ~iLastIndexOf;
                                                                int i279 = ~((i278 ^ i) | (i278 & i));
                                                                int i280 = -(-(((i277 & i279) | (i277 ^ i279)) * (-370)));
                                                                i10 = (i270 & i280) + (i280 | i270);
                                                                i11 = (i278 ^ i133) | (i278 & i133);
                                                            }
                                                            int i281 = ~i11;
                                                            int i282 = ~((-25) | i);
                                                            int i283 = (i281 & i282) | (i281 ^ i282);
                                                            int i284 = ~((iLastIndexOf & 24) | (iLastIndexOf ^ 24));
                                                            int i285 = (i10 - (~(-(-((-370) * ((i283 & i284) | (i283 ^ i284))))))) - 1;
                                                            int i286 = -(-(i284 * 370));
                                                            int i287 = (i285 ^ i286) + ((i286 & i285) << 1);
                                                            Object[] objArr29 = new Object[1];
                                                            a(cArr7, b5, i287, objArr29);
                                                            if (!(!objNewInstance.equals(cls8.getMethod((String) objArr29[0], null).invoke(objInvoke4, null)))) {
                                                                i12 = 1;
                                                                break;
                                                            }
                                                            try {
                                                                char[] cArr8 = {27, '/', '/', '*', 3, Typography.quote, '\'', '(', 30, 4, '\f', 18, '0', '\r', '(', '\'', 5, 16, 2, 20, 5, 29, 21, 29, '%', 3, 18, '\f', '.', '\f', ')', '.', 17, '('};
                                                                int i288 = -TextUtils.indexOf((CharSequence) "", '0');
                                                                int i289 = i288 * (-167);
                                                                int i290 = asInterface + 69;
                                                                asBinder = i290 % 128;
                                                                if (i290 % 2 != 0) {
                                                                    int i291 = ~i288;
                                                                    int i292 = ~((i291 & (-15)) | (i291 ^ (-15)));
                                                                    int i293 = ~(((-15) & i) | ((-15) ^ i));
                                                                    int i294 = (i292 & i293) | (i292 ^ i293);
                                                                    i13 = 456933376 * i288 * (((i294 | 336) << 1) - (i294 ^ 336));
                                                                } else {
                                                                    int i295 = i289 - 2338;
                                                                    int i296 = ~i288;
                                                                    int i297 = ~((i296 & (-15)) | (i296 ^ (-15)));
                                                                    int i298 = ~(((-15) & i) | ((-15) ^ i));
                                                                    int i299 = -(-(((i297 & i298) | (i297 ^ i298)) * 336));
                                                                    i13 = (i295 | i299) + (i295 & i299);
                                                                }
                                                                AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1();
                                                                AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1();
                                                                int i300 = ~((i288 ^ 14) | (i288 & 14));
                                                                int i301 = ~(i288 | i);
                                                                int i302 = (i13 - (~(-(-((-168) * ((i300 & i301) | (i300 ^ i301))))))) - 1;
                                                                int i303 = ~((i288 & i133) | (i133 ^ i288));
                                                                int i304 = -(-(((i303 & (-15)) | ((-15) ^ i303)) * 168));
                                                                byte b6 = (byte) ((i302 ^ i304) + ((i304 & i302) << 1));
                                                                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0);
                                                                int i305 = (iLastIndexOf2 * (-958)) - 33530;
                                                                int i306 = ~((-36) | i79);
                                                                int i307 = ~iLastIndexOf2;
                                                                int i308 = i306 | (~((i307 ^ i) | (i307 & i)));
                                                                int i309 = asInterface + 51;
                                                                asBinder = i309 % 128;
                                                                int i310 = i309 % 2;
                                                                int i311 = ~((i79 ^ iLastIndexOf2) | (i79 & iLastIndexOf2));
                                                                int i312 = -(-(959 * ((i308 & i311) | (i308 ^ i311))));
                                                                int i313 = ((((i305 | i312) << 1) - (i305 ^ i312)) - (~((~((iLastIndexOf2 ^ 35) | (iLastIndexOf2 & 35))) * (-959)))) - 1;
                                                                int i314 = (~((i307 ^ i133) | (i307 & i133))) | (~(((-36) & i) | ((-36) ^ i)));
                                                                int i315 = ~((iLastIndexOf2 & i) | (iLastIndexOf2 ^ i));
                                                                int i316 = (i313 - (~(-(-(((i315 & i314) | (i314 ^ i315)) * 959))))) - 1;
                                                                Object[] objArr30 = new Object[1];
                                                                a(cArr8, b6, i316, objArr30);
                                                                Class<?> cls9 = Class.forName((String) objArr30[0]);
                                                                char[] cArr9 = {24, ')', 15, '/', 28, 11, 24, '(', '(', 18, 15, 2, 13779, 13779, ',', '\t', 18, 25, '.', 18, '.', '*', 13855};
                                                                byte modifierMetaStateMask = (byte) KeyEvent.getModifierMetaStateMask();
                                                                int i317 = asInterface;
                                                                int i318 = ((i317 | 21) << 1) - (i317 ^ 21);
                                                                asBinder = i318 % 128;
                                                                if (i318 % 2 != 0) {
                                                                    byte b7 = (byte) (modifierMetaStateMask * 42);
                                                                    int i319 = -(ViewConfiguration.getJumpTapTimeout() / 106);
                                                                    int i320 = ((i319 | 77) << 1) - (i319 ^ 77);
                                                                    Object[] objArr31 = new Object[1];
                                                                    a(cArr9, b7, i320, objArr31);
                                                                    if (objNewInstance2.equals(cls9.getMethod((String) objArr31[0], null).invoke(objInvoke4, null))) {
                                                                        i12 = 1;
                                                                        break;
                                                                    }
                                                                    i121 = i178 + 1;
                                                                    objArr16 = objArr22;
                                                                    length = i172;
                                                                    i111 = 5;
                                                                    i15 = 0;
                                                                    i16 = 1;
                                                                } else {
                                                                    byte b8 = (byte) (((modifierMetaStateMask | 42) << 1) - (modifierMetaStateMask ^ 42));
                                                                    int i321 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                                                    int i322 = ((i321 | 23) << 1) - (i321 ^ 23);
                                                                    Object[] objArr32 = new Object[1];
                                                                    a(cArr9, b8, i322, objArr32);
                                                                    i12 = 1;
                                                                    if (!(!objNewInstance2.equals(cls9.getMethod((String) objArr32[0], null).invoke(objInvoke4, null)))) {
                                                                        break;
                                                                    }
                                                                    i121 = i178 + 1;
                                                                    objArr16 = objArr22;
                                                                    length = i172;
                                                                    i111 = 5;
                                                                    i15 = 0;
                                                                    i16 = 1;
                                                                }
                                                            } catch (Throwable th) {
                                                                Throwable cause = th.getCause();
                                                                if (cause != null) {
                                                                    throw cause;
                                                                }
                                                                throw th;
                                                            }
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
                                    }
                                    Object[] objArr33 = new Object[4];
                                    int[] iArr = new int[i12];
                                    objArr33[0] = iArr;
                                    int[] iArr2 = new int[i12];
                                    objArr33[i12] = iArr2;
                                    int[] iArr3 = new int[i12];
                                    objArr33[2] = iArr3;
                                    iArr[0] = i;
                                    iArr3[0] = (i & (-2)) | (i79 & 1);
                                    objArr33[3] = null;
                                    int i323 = (((~((-823082997) | i)) | 537405972) * (-283)) + 1802344944 + ((~((-285677025) | i)) * 283);
                                    int i324 = (i2 - (~((i323 & 16) + (i323 | 16)))) - 1;
                                    int i325 = i324 << 13;
                                    int i326 = ((~i324) & i325) | ((~i325) & i324);
                                    int i327 = i326 >>> 17;
                                    int i328 = (i326 | i327) & (~(i326 & i327));
                                    int i329 = i328 << 5;
                                    iArr2[0] = ((~i328) & i329) | ((~i329) & i328);
                                    int iTuitionPaymentFragmentbindingInflater9 = AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1();
                                    int i330 = ~(((-1125114602) & iTuitionPaymentFragmentbindingInflater9) | ((-1125114602) ^ iTuitionPaymentFragmentbindingInflater9));
                                    int i331 = (i330 & 811104) | (811104 ^ i330);
                                    int i332 = ~iTuitionPaymentFragmentbindingInflater9;
                                    int i333 = (i332 & (-1399036828)) | (i332 ^ (-1399036828));
                                    int i334 = ~((i333 & 1125114601) | (i333 ^ 1125114601));
                                    int i335 = (-1590175466) - (~(((i331 & i334) | (i331 ^ i334)) * 886));
                                    int i336 = ~iTuitionPaymentFragmentbindingInflater9;
                                    int i337 = ~((i336 ^ 1125114601) | (1125114601 & i336));
                                    int i338 = (i335 - (~(-(-(((i337 & (-1399036828)) | ((-1399036828) ^ i337)) * (-1772)))))) - 1;
                                    int i339 = -(-((~((i336 & (-1399036828)) | (i336 ^ (-1399036828)))) * 886));
                                    int i340 = ((i338 | i339) << 1) - (i339 ^ i338);
                                    int iTuitionPaymentFragmentbindingInflater10 = AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1();
                                    int i341 = ~(((-545294081) & iTuitionPaymentFragmentbindingInflater10) | ((-545294081) ^ iTuitionPaymentFragmentbindingInflater10));
                                    int i342 = (-1291193400) + (((i341 & 423104520) | (423104520 ^ i341)) * (-476)) + ((~(((-545294081) & iTuitionPaymentFragmentbindingInflater10) | ((-545294081) ^ iTuitionPaymentFragmentbindingInflater10))) * 952);
                                    int i343 = (~iTuitionPaymentFragmentbindingInflater10) | 1568157711;
                                    int i344 = (~((i343 & (-1690347272)) | (i343 ^ (-1690347272)))) * 476;
                                    if (i340 <= (i342 & i344) + (i344 | i342)) {
                                        return objArr33;
                                    }
                                    Object obj4 = null;
                                    obj4.hashCode();
                                    throw null;
                                } catch (Throwable th6) {
                                    Throwable cause6 = th6.getCause();
                                    if (cause6 != null) {
                                        throw cause6;
                                    }
                                    throw th6;
                                }
                            } catch (Throwable th7) {
                                Throwable cause7 = th7.getCause();
                                if (cause7 != null) {
                                    throw cause7;
                                }
                                throw th7;
                            }
                        } catch (Throwable th8) {
                            Throwable cause8 = th8.getCause();
                            if (cause8 != null) {
                                throw cause8;
                            }
                            throw th8;
                        }
                    } catch (Throwable th9) {
                        Throwable cause9 = th9.getCause();
                        if (cause9 != null) {
                            throw cause9;
                        }
                        throw th9;
                    }
                } catch (Throwable th10) {
                    Throwable cause10 = th10.getCause();
                    if (cause10 != null) {
                        throw cause10;
                    }
                    throw th10;
                }
            } catch (Throwable unused) {
            }
        }
        int i345 = asBinder + 89;
        int i346 = i345 % 128;
        asInterface = i346;
        int i347 = i345 % 2;
        int i348 = (i346 ^ 51) + ((i346 & 51) << 1);
        asBinder = i348 % 128;
        int i349 = i348 % 2;
        Object[] objArr34 = {new int[]{i}, new int[1], new int[]{i}, null};
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i350 = (~(293415354 | iMaxMemory)) | 41948677;
        int i351 = ~((~iMaxMemory) | (-1638449));
        int i352 = (i2 - (~(((-1718648062) + ((i350 | i351) * (-470))) + (((~(iMaxMemory | 335364031)) | i351) * 470)))) - 1;
        int i353 = i352 << 13;
        int i354 = (i352 | i353) & (~(i352 & i353));
        int i355 = i354 >>> 17;
        int i356 = ((~i354) & i355) | ((~i355) & i354);
        int i357 = i356 << 5;
        ((int[]) objArr34[1])[0] = ((~i356) & i357) | ((~i357) & i356);
        return objArr34;
    }

    private static String $$c(int i, byte b2, short s) {
        int i2 = b2 * 2;
        int i3 = 4 - (s * 4);
        int i4 = 116 - i;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        int i6 = -1;
        if (bArr == null) {
            i3++;
            i4 = (-i4) + i3;
            i6 = -1;
        }
        while (true) {
            int i7 = i3;
            int i8 = i4;
            int i9 = i6 + 1;
            bArr2[i9] = (byte) i8;
            if (i9 == i5) {
                return new String(bArr2, 0);
            }
            i3 = i7 + 1;
            i4 = (-bArr[i7]) + i8;
            i6 = i9;
        }
    }
}
