package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.ComposerKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.work.WorkInfo;
import com.google.android.gms.common.api.internal.zaaq;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Camera2CameraControlExternalSyntheticLambda3 {
    private static final byte[] $$a = {48, -110, 22, 55};
    private static final int $$b = 232;
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f100a = 0;
    private static int asBinder = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {47397, 47450, 47403, 47399, 47482, 47428, 47478, 47481, 47487, 47368, 47396, 47427, 47430, 47475, 47425, 47420, 47449, 47443, 47445, 47431, 47418, 47429, 47476, 47472, 47448, 47485, 47483, 47440, 47411, 47416, 47407, 47486, 47474, 47477, 47471, 47426, 47394, 47480, 47484};
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 2047719656;
    private static boolean TuitionPaymentFragmentbindingInflater1 = true;
    private static boolean b = true;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 32431;
    private static char asInterface = 33864;
    private static char g = 61426;
    private static char d = 41484;

    public static final accessconfigureInstanceInternal TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        accessconfigureInstanceInternal accessconfigureinstanceinternal = new accessconfigureInstanceInternal("^[a-zA-Z0-9]+$", str);
        int i2 = asBinder + 23;
        f100a = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 31 / 0;
        }
        return accessconfigureinstanceinternal;
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i3 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            int i4 = $10 + 115;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i6 = $11 + 61;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 58224;
            int i9 = 0;
            while (i9 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i10 = (c2 + i8) ^ ((c2 << 4) + ((char) (((long) g) ^ 8611973335120459638L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(d);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cCombineMeasuredStates = (char) (47773 - View.combineMeasuredStates(i3, i3));
                        int iAlpha = Color.alpha(i3) + 468;
                        int mirror = AndroidCharacter.getMirror('0') - '#';
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cCombineMeasuredStates, iAlpha, mirror, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    int i12 = i9;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(asInterface)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (ViewConfiguration.getTapTimeout() >> 16) + 468, ExpandableListView.getPackedPositionType(0L) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9 = i12 + 1;
                    int i13 = $10 + 69;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b2 = (byte) 0;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 2323 - View.resolveSizeAndState(0, 0, 0), 45 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -1312321721, false, $$c((byte) 41, b2, (byte) (b2 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    private static void c(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        char c = '0';
        int i3 = 0;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr3[i4]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 1;
                        byte b3 = (byte) (b2 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (AndroidCharacter.getMirror(c) + 31291), 2994 - (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.getOffsetAfter("", i3) + 17, 1182129903, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr4[i4] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i4++;
                    c = '0';
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43325 - (KeyEvent.getMaxKeyCode() >> 16)), TextUtils.getOffsetBefore("", 0) + 253, 22 - TextUtils.getOffsetBefore("", 0), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
        long j = 0;
        int i5 = 1687675375;
        if (b) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ExpandableListView.getPackedPositionGroup(0L) + 33602), 3085 - TextUtils.getCapsMode("", 0, 0), 25 - TextUtils.indexOf((CharSequence) "", '0'), -2146875848, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                i5 = 1687675375;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        if (TuitionPaymentFragmentbindingInflater1) {
            int i6 = $10 + 123;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            } else {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            }
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr2[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (33603 - (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1))), 3085 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 26 - Color.blue(0), -2146875848, false, $$c(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                j = 0;
            }
            objArr[0] = new String(cArr2);
            return;
        }
        int i7 = 0;
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        while (true) {
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7;
            while (true) {
                if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    objArr[0] = new String(cArr6);
                    int i8 = $10 + 29;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    return;
                }
                int i10 = $10 + 95;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] + iIntValue);
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                }
            }
            cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
            i7 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v20 */
    public static Object[] b(Context context, int i, int i2) {
        int tapTimeout;
        byte[] bArr;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int iAlpha;
        int i10;
        int i11;
        int i12;
        int i13 = i2;
        ?? r3 = "";
        int i14 = 2 % 2;
        if (context != null) {
            int i15 = f100a;
            int i16 = (i15 & 79) + (i15 | 79);
            asBinder = i16 % 128;
            try {
                if (i16 % 2 == 0) {
                    int tapTimeout2 = ViewConfiguration.getTapTimeout();
                    tapTimeout = 73 >> ((tapTimeout2 ^ (-63)) + ((tapTimeout2 & (-63)) << 1));
                    bArr = new byte[31];
                } else {
                    tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 127;
                    bArr = new byte[31];
                }
                // fill-array-data instruction
                bArr[0] = -109;
                bArr[1] = -110;
                bArr[2] = -125;
                bArr[3] = -127;
                bArr[4] = -112;
                bArr[5] = -122;
                bArr[6] = -119;
                bArr[7] = -120;
                bArr[8] = -121;
                bArr[9] = -122;
                bArr[10] = -123;
                bArr[11] = -124;
                bArr[12] = -125;
                bArr[13] = -111;
                bArr[14] = -112;
                bArr[15] = -113;
                bArr[16] = -114;
                bArr[17] = -115;
                bArr[18] = -116;
                bArr[19] = -117;
                bArr[20] = -118;
                bArr[21] = -122;
                bArr[22] = -119;
                bArr[23] = -120;
                bArr[24] = -121;
                bArr[25] = -122;
                bArr[26] = -123;
                bArr[27] = -124;
                bArr[28] = -125;
                bArr[29] = -126;
                bArr[30] = -127;
                Object[] objArr = new Object[1];
                c(null, null, tapTimeout, bArr, objArr);
                String str = (String) objArr[0];
                int i17 = f100a;
                int i18 = (i17 ^ 35) + ((i17 & 35) << 1);
                asBinder = i18 % 128;
                int i19 = i18 % 2;
                try {
                    try {
                        int i20 = -(-ExpandableListView.getPackedPositionChild(0L));
                        int i21 = (i20 ^ 39) + ((i20 & 39) << 1);
                        Object[] objArr2 = new Object[1];
                        e(new char[]{5643, 54795, 33588, 12151, 35959, 47607, 24560, 27580, 44047, 20264, 56570, 23504, 46351, 60387, 40140, 18678, 53749, 39331, 38040, 24949, 49787, 47674, 52793, 28310, 450, 42255, 57598, 18315, 2911, 43059, 31487, 9728, 42397, 16270, 23443, 60418, 17013, 17659, 10245, 56624}, i21, objArr2);
                        Object objNewInstance = Class.forName((String) objArr2[0]).getDeclaredConstructor(String.class).newInstance(str);
                        int i22 = asBinder;
                        int i23 = (i22 & 113) + (i22 | 113);
                        f100a = i23 % 128;
                        int i24 = i23 % 2;
                        char[] cArr = {16248, 3790, 17110, 28160, 18831, 51706, 61163, 34017, 49252, 39788, 29985, 13696, 32876, 25816, 17574, 34602, 60599, 28496, 42655, 12040, 33529, 62434, 51001, 9187, 37761, 43883, 60690, 26067, 42658, 55084, 18819, 4830, 61672, 24661};
                        int i25 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int i26 = i25 * (-337);
                        int i27 = ((i26 | 10509) << 1) - (i26 ^ 10509);
                        int i28 = ~i25;
                        int i29 = ~i;
                        int i30 = ~((i28 ^ i29) | (i28 & i29));
                        int i31 = ~(((-32) ^ i25) | ((-32) & i25));
                        int i32 = (i30 ^ i31) | (i30 & i31);
                        int i33 = asBinder + 61;
                        f100a = i33 % 128;
                        int i34 = i33 % 2;
                        int i35 = -(-((-338) * (i32 | (~((i25 ^ i) | (i25 & i))))));
                        int i36 = (i27 & i35) + (i35 | i27);
                        int i37 = (~((i28 ^ 31) | (i28 & 31))) * 338;
                        int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
                        int i39 = ~i;
                        int i40 = ~((i28 ^ i39) | (i28 & i39));
                        int i41 = (i25 & 31) | (i25 ^ 31);
                        int i42 = ~((i41 & i) | (i41 ^ i));
                        int i43 = ((i40 & i42) | (i40 ^ i42)) * 338;
                        int i44 = (i38 ^ i43) + ((i43 & i38) << 1);
                        Object[] objArr3 = new Object[1];
                        e(cArr, i44, objArr3);
                        try {
                            Object[] objArr4 = {(String) objArr3[0]};
                            int iLastIndexOf = TextUtils.lastIndexOf("", '0');
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            int i45 = ~((~iLastIndexOf) | (-40));
                            int i46 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i47 = (~(((-40) ^ i46) | ((-40) & i46))) | i45;
                            int i48 = iLastIndexOf | 39;
                            int i49 = ((((iLastIndexOf * 253) + 9867) - (~(-(-((i47 | (~((i48 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i48 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2)))) * (-252)))))) - 1) + (i48 * (-252));
                            int i50 = (i46 & (-40)) | ((-40) ^ i46);
                            int i51 = ~((i50 & iLastIndexOf) | (i50 ^ iLastIndexOf));
                            int i52 = ~((iLastIndexOf ^ 39) | (iLastIndexOf & 39) | iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            int i53 = ((i51 & i52) | (i51 ^ i52)) * 252;
                            Object[] objArr5 = new Object[1];
                            e(new char[]{5643, 54795, 33588, 12151, 35959, 47607, 24560, 27580, 44047, 20264, 56570, 23504, 46351, 60387, 40140, 18678, 53749, 39331, 38040, 24949, 49787, 47674, 52793, 28310, 450, 42255, 57598, 18315, 2911, 43059, 31487, 9728, 42397, 16270, 23443, 60418, 17013, 17659, 10245, 56624}, (i49 & i53) + (i53 | i49), objArr5);
                            Object objNewInstance2 = Class.forName((String) objArr5[0]).getDeclaredConstructor(String.class).newInstance(objArr4);
                            int i54 = asBinder;
                            int i55 = ((i54 | 87) << 1) - (i54 ^ 87);
                            f100a = i55 % 128;
                            int i56 = i55 % 2;
                            try {
                                int i57 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                                Object[] objArr6 = new Object[1];
                                c(null, null, (i57 ^ 127) + ((i57 & 127) << 1), new byte[]{-105, -104, -116, -105, -123, -120, -127, -107, -105, -123, -116, -105, -123, -120, -106, -107, -122, -119, -120, -121, -122, -123, -108}, objArr6);
                                Class<?> cls = Class.forName((String) objArr6[0]);
                                int i58 = -Color.blue(0);
                                int i59 = ~i58;
                                int i60 = (i59 ^ (-18)) | (i59 & (-18));
                                int i61 = ~((i60 & i) | (i60 ^ i));
                                int i62 = ~((i58 ^ 17) | (i58 & 17) | i);
                                int i63 = ((i58 * 70) - 1156) + (((i61 & i62) | (i61 ^ i62)) * 69);
                                int i64 = ~((i59 & 17) | (i59 ^ 17));
                                int i65 = ~i58;
                                int i66 = ~((i65 & i) | (i65 ^ i));
                                int i67 = (i64 & i66) | (i64 ^ i66);
                                int i68 = ~((i ^ 17) | (i & 17));
                                int i69 = (i63 - (~(((i67 & i68) | (i67 ^ i68)) * (-69)))) - 1;
                                int i70 = (~((i58 & (-18)) | ((-18) ^ i58))) * 69;
                                int i71 = (i69 & i70) + (i70 | i69);
                                Object[] objArr7 = new Object[1];
                                e(new char[]{37948, 63715, 42927, 211, 41806, 9016, 22673, 8064, 37708, 13616, 41048, 11776, 63861, 7164, 835, 13089, 22117, 5954, 12179, 57561}, i71, objArr7);
                                Object objInvoke = cls.getMethod((String) objArr7[0], null).invoke(context, null);
                                int i72 = asBinder + 105;
                                f100a = i72 % 128;
                                int i73 = i72 % 2;
                                try {
                                    Object[] objArr8 = new Object[1];
                                    c(null, null, 127 - KeyEvent.normalizeMetaState(0), new byte[]{-105, -104, -116, -105, -123, -120, -127, -107, -105, -123, -116, -105, -123, -120, -106, -107, -122, -119, -120, -121, -122, -123, -108}, objArr8);
                                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                                    Object[] objArr9 = new Object[1];
                                    c(null, null, 126 - (~(-(ViewConfiguration.getMinimumFlingVelocity() >> 16))), new byte[]{-116, -101, -108, -126, -116, -113, -108, -102, -106, -108, -103, -105, -116, -113}, objArr9);
                                    Object objInvoke2 = cls2.getMethod((String) objArr9[0], null).invoke(context, null);
                                    int i74 = asBinder + 51;
                                    f100a = i74 % 128;
                                    int i75 = i74 % 2;
                                    try {
                                        Object[] objArr10 = {objInvoke2, 64};
                                        int i76 = -View.combineMeasuredStates(0, 0);
                                        int i77 = ((i76 | 33) << 1) - (i76 ^ 33);
                                        Object[] objArr11 = new Object[1];
                                        e(new char[]{61855, 12903, 10251, 24002, 10497, 24787, 23340, 37917, 15378, 4961, 29312, 15206, 46756, 39672, 12057, 55696, 50255, 17813, 38993, 6404, 32635, 25920, 49672, 9187, 44880, 15182, 14652, 10830, 33544, 12774, 13466, 30953, 52455, 64725, 44526, 24639}, i77, objArr11);
                                        Class<?> cls3 = Class.forName((String) objArr11[0]);
                                        int i78 = -TextUtils.lastIndexOf("", '0', 0);
                                        int i79 = (i78 * (-183)) + 2405;
                                        int i80 = ~i78;
                                        int i81 = ~((i80 & 13) | (i80 ^ 13));
                                        int i82 = ~((i29 ^ 13) | (i29 & 13));
                                        int i83 = ((i81 & i82) | (i81 ^ i82)) * 184;
                                        int i84 = (i79 & i83) + (i79 | i83);
                                        int i85 = ((~(((-14) & i78) | ((-14) ^ i78))) | i) * (-184);
                                        int i86 = (((i84 & i85) + (i85 | i84)) - (~((~((~i78) | i39)) * 184))) - 1;
                                        Object[] objArr12 = new Object[1];
                                        e(new char[]{4668, 2143, 49873, 13450, 64129, 56360, 22436, 51823, 57269, 2499, 11811, 728, 8616, 28136, 15710, 17309}, i86, objArr12);
                                        Object objInvoke3 = cls3.getMethod((String) objArr12[0], String.class, Integer.TYPE).invoke(objInvoke, objArr10);
                                        int i87 = -(-TextUtils.indexOf((CharSequence) "", '0'));
                                        int i88 = (i87 ^ 31) + ((i87 & 31) << 1);
                                        Object[] objArr13 = new Object[1];
                                        e(new char[]{34784, 30381, 3885, 55739, 29611, 11060, 49624, 40430, 56778, 16468, 20461, 54064, 55757, 6228, 29246, 47989, 27260, 14894, 619, 49494, 2205, 51301, 14413, 4250, 9862, 30931, 52763, 26237, 15929, 53384, 13859, 32581}, i88, objArr13);
                                        Class<?> cls4 = Class.forName((String) objArr13[0]);
                                        char[] cArr2 = {36763, 28426, 10700, 39167, 13805, 10390, 32492, 31930, 43069, 39453, 51423, 35001};
                                        int i89 = 9 - (~(-(-TextUtils.indexOf("", ""))));
                                        int i90 = asBinder;
                                        int i91 = (i90 ^ 21) + ((i90 & 21) << 1);
                                        f100a = i91 % 128;
                                        int i92 = i91 % 2;
                                        Object[] objArr14 = new Object[1];
                                        e(cArr2, i89, objArr14);
                                        Object[] objArr15 = (Object[]) cls4.getField((String) objArr14[0]).get(objInvoke3);
                                        int length = objArr15.length;
                                        int i93 = 0;
                                        while (true) {
                                            if (i93 < length) {
                                                Object obj = objArr15[i93];
                                                int i94 = -KeyEvent.keyCodeFromString("");
                                                int i95 = (i94 * (-947)) + 120523;
                                                int i96 = ~i94;
                                                int i97 = -(-(((~(((-128) ^ i) | ((-128) & i))) | i96) * (-948)));
                                                int i98 = (i95 ^ i97) + ((i95 & i97) << 1);
                                                int i99 = (~((i96 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i96 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | i29)) * (-948);
                                                int i100 = f100a;
                                                int i101 = (i100 ^ 117) + ((i100 & 117) << 1);
                                                asBinder = i101 % 128;
                                                if (i101 % 2 == 0) {
                                                    i4 = (i98 >>> i99) >> (((i94 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i94 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT)) * 948);
                                                    i3 = 1;
                                                } else {
                                                    int i102 = i98 - (~i99);
                                                    i3 = 1;
                                                    int i103 = i102 - 1;
                                                    int i104 = ((i94 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i94 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT)) * 948;
                                                    i4 = ((i103 & i104) << 1) + (i103 ^ i104);
                                                }
                                                Object[] objArr16 = new Object[i3];
                                                c(null, null, i4, new byte[]{-97, -98, -99, -107, -100}, objArr16);
                                                try {
                                                    Object[] objArr17 = {(String) objArr16[0]};
                                                    Object[] objArr18 = new Object[1];
                                                    c(null, null, 125 - (~(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), new byte[]{-93, -121, -120, -105, -106, -108, -91, -116, -105, -108, -106, -119, -92, -119, -105, -121, -116, -127, -107, -105, -121, -116, -106, -107, -93, -105, -119, -121, -114, -106, -116, -94, -107, -108, -95, -108, -96}, objArr18);
                                                    Class<?> cls5 = Class.forName((String) objArr18[0]);
                                                    int i105 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                    Object[] objArr19 = objArr15;
                                                    int i106 = (((i105 * 165) - 1793) - (~(-(-(((~((i29 ^ 11) | (i29 & 11))) | i105) * (-328)))))) - 1;
                                                    int i107 = -(-((i105 | i) * 164));
                                                    int i108 = (i106 & i107) + (i107 | i106);
                                                    int i109 = ~((~i105) | (-12));
                                                    int i110 = ~(((-12) ^ i) | ((-12) & i));
                                                    int i111 = (i109 ^ i110) | (i109 & i110);
                                                    int i112 = ~((i105 & i29) | (i29 ^ i105) | 11);
                                                    Object[] objArr20 = new Object[1];
                                                    e(new char[]{11345, 17203, 34715, 36824, 56574, 'k', 42721, 10933, 46953, 1964, 51275, 14295, 61798, 13486}, (i108 - (~(((i111 & i112) | (i111 ^ i112)) * 164))) - 1, objArr20);
                                                    Object objInvoke4 = cls5.getMethod((String) objArr20[0], String.class).invoke(null, objArr17);
                                                    try {
                                                        int minimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity() >> 16;
                                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                                        int i113 = f100a + 109;
                                                        asBinder = i113 % 128;
                                                        if (i113 % 2 == 0) {
                                                            int i114 = (-344) % minimumFlingVelocity;
                                                            i5 = (i114 & 90) + (i114 | 90);
                                                        } else {
                                                            int i115 = minimumFlingVelocity * (-344);
                                                            i5 = (i115 & (-43688)) + (i115 | (-43688));
                                                        }
                                                        int i116 = ~minimumFlingVelocity;
                                                        int i117 = length;
                                                        int i118 = ~((i116 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i116 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                                                        int i119 = ~((i116 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i116 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                                        int i120 = -(-(345 * ((i118 ^ i119) | (i119 & i118))));
                                                        int i121 = ((i5 | i120) << 1) - (i120 ^ i5);
                                                        int i122 = ~minimumFlingVelocity;
                                                        int i123 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                        int i124 = ~((i122 ^ i123) | (i122 & i123));
                                                        int i125 = ~(((-128) ^ minimumFlingVelocity) | (minimumFlingVelocity & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                                                        int i126 = ((i124 & i125) | (i124 ^ i125)) * 345;
                                                        int i127 = (i121 ^ i126) + ((i126 & i121) << 1);
                                                        int i128 = (~((i116 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i116 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | iTuitionPaymentFragmentspecialinlinedviewModeldefault3)) * 345;
                                                        try {
                                                            Object[] objArr21 = new Object[1];
                                                            c(null, null, (i127 & i128) + (i128 | i127), new byte[]{-116, -121, -114, -105, -108, -123, -113, -119, -109, -107, -101, -90, -107, -105, -123, -116, -105, -123, -120, -106, -107, -122, -119, -120, -121, -122, -123, -108}, objArr21);
                                                            Class<?> cls6 = Class.forName((String) objArr21[0]);
                                                            Object[] objArr22 = new Object[1];
                                                            e(new char[]{8758, 34472, 63864, 23946, 57030, 19832, 48847, 1774, 44336, 13158, 30561, 16315, 40548, 3978}, 11 - (ViewConfiguration.getScrollBarSize() >> 8), objArr22);
                                                            try {
                                                                try {
                                                                    Object[] objArr23 = {new ByteArrayInputStream((byte[]) cls6.getMethod((String) objArr22[0], null).invoke(obj, null))};
                                                                    int i129 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                                    int i130 = f100a;
                                                                    int i131 = (i130 & 101) + (i130 | 101);
                                                                    asBinder = i131 % 128;
                                                                    if (i131 % 2 == 0) {
                                                                        i6 = ((-433) >>> i129) * (-90);
                                                                        i7 = (~i129) | i39;
                                                                    } else {
                                                                        int i132 = i129 * (-433);
                                                                        i6 = ((i132 & (-27216)) << 1) + (i132 ^ (-27216));
                                                                        int i133 = ~i129;
                                                                        i7 = (i133 & i29) | (i133 ^ i29);
                                                                    }
                                                                    int i134 = ~i7;
                                                                    int i135 = ~(((-127) ^ i) | ((-127) & i));
                                                                    int i136 = -(-(217 * ((i134 & i135) | (i134 ^ i135))));
                                                                    int i137 = (i6 ^ i136) + ((i6 & i136) << 1);
                                                                    int i138 = ~i129;
                                                                    int i139 = (i137 - (~(-(-(((~((i138 & i) | (i138 ^ i))) | (~((i138 ^ ComposerKt.defaultsKey) | (i138 & ComposerKt.defaultsKey)))) * 217))))) - 1;
                                                                    int i140 = (i129 | (~(((-127) ^ i29) | ((-127) & i29)))) * 217;
                                                                    Object[] objArr24 = new Object[1];
                                                                    c(null, null, (i139 & i140) + (i140 | i139), new byte[]{-93, -121, -120, -105, -106, -108, -91, -116, -105, -108, -106, -119, -92, -119, -105, -121, -116, -127, -107, -105, -121, -116, -106, -107, -93, -105, -119, -121, -114, -106, -116, -94, -107, -108, -95, -108, -96}, objArr24);
                                                                    Class<?> cls7 = Class.forName((String) objArr24[0]);
                                                                    int mode = View.MeasureSpec.getMode(0);
                                                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                                                    int i141 = mode * 784;
                                                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                                                    int i142 = ((558923778 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault5 ^ 558923778) | (-1073542584)) * 376;
                                                                    int i143 = (2005437953 ^ i142) + ((i142 & 2005437953) << 1);
                                                                    int i144 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                                                    int i145 = ~((i144 ^ 660394118) | (i144 & 660394118));
                                                                    int i146 = -(-(((i145 ^ (-1073542584)) | (i145 & (-1073542584))) * (-376)));
                                                                    int i147 = ~(((-660394119) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault5 & (-660394119)));
                                                                    int i148 = (i143 ^ i146) + ((i143 & i146) << 1) + (((972072243 ^ i147) | (i147 & 972072243)) * 376);
                                                                    int i149 = ~((-265233391) | i29);
                                                                    int i150 = (1164004790 - (~(((80487406 ^ i149) | (i149 & 80487406)) * 184))) + (((i ^ (-802104319)) | ((-802104319) & i)) * (-184));
                                                                    int i151 = (~(((-617358335) ^ i39) | ((-617358335) & i39))) * 184;
                                                                    if (i148 <= (i150 ^ i151) + ((i151 & i150) << 1)) {
                                                                        i8 = (i141 << (-99314)) >> (-911);
                                                                        int i152 = ~mode;
                                                                        int i153 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                                                        i9 = (i152 & i153) | (i152 ^ i153) | 127;
                                                                    } else {
                                                                        int i154 = ((i141 | (-99314)) << 1) - (i141 ^ (-99314));
                                                                        i8 = ((i154 | 100224) << 1) - (100224 ^ i154);
                                                                        int i155 = ~mode;
                                                                        int i156 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                                                        int i157 = (i155 & i156) | (i155 ^ i156);
                                                                        i9 = (i157 & 127) | (i157 ^ 127);
                                                                    }
                                                                    int i158 = (-783) * (i9 ^ (-1));
                                                                    int i159 = (i8 & i158) + (i8 | i158);
                                                                    int i160 = ~mode;
                                                                    int i161 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                                                    int i162 = ~((i161 & 127) | (i161 ^ 127));
                                                                    int i163 = -(-(((i162 & i160) | (i160 ^ i162)) * 783));
                                                                    int i164 = (i159 ^ i163) + ((i163 & i159) << 1);
                                                                    Object[] objArr25 = new Object[1];
                                                                    c(null, null, i164, new byte[]{-116, -105, -108, -106, -119, -92, -119, -105, -121, -116, -127, -116, -105, -108, -121, -116, -123, -116, -113}, objArr25);
                                                                    Object objInvoke5 = cls7.getMethod((String) objArr25[0], InputStream.class).invoke(objInvoke4, objArr23);
                                                                    try {
                                                                        int i165 = -KeyEvent.normalizeMetaState(0);
                                                                        int i166 = (i165 ^ 34) + ((i165 & 34) << 1);
                                                                        Object[] objArr26 = new Object[1];
                                                                        e(new char[]{29502, 55574, 28839, 41644, 13009, 24161, 16129, 21253, 20514, 65131, 29181, 903, 45255, 27862, 63085, 32500, 43625, 44054, 1488, 23237, 12494, 62359, 4339, 9185, 47715, 60521, 61866, 50800, 9772, 44499, 19808, 51978, 39655, 44498, 24097, 3101}, i166, objArr26);
                                                                        Class<?> cls8 = Class.forName((String) objArr26[0]);
                                                                        int i167 = 1228485125 | i;
                                                                        int i168 = (-349564247) - (~(-(-(((i167 & 979428178) | (i167 ^ 979428178)) * (-381)))));
                                                                        int i169 = ~((1228485125 & i29) | (i29 ^ 1228485125));
                                                                        int i170 = (i169 & 1092161541) | (1092161541 ^ i169);
                                                                        int i171 = ((i170 & 843104594) | (i170 ^ 843104594)) * 381;
                                                                        int i172 = (i168 ^ i171) + ((i171 & i168) << 1);
                                                                        int i173 = ((i172 | 998299144) << 1) - (998299144 ^ i172);
                                                                        int i174 = ~(((-1906110077) ^ i29) | ((-1906110077) & i29));
                                                                        int i175 = ~(1854985028 | i);
                                                                        int i176 = 532865660 + (((i174 & i175) | (i174 ^ i175)) * 217);
                                                                        int i177 = ((~(((-1906110077) & i) | ((-1906110077) ^ i))) | 286010424) * 217;
                                                                        int i178 = ((i176 | i177) << 1) - (i177 ^ i176);
                                                                        int i179 = ~(1854985028 | i39);
                                                                        if (i173 <= (i178 - (~(-(-(((i179 & 1906110076) | (1906110076 ^ i179)) * 217))))) - 1) {
                                                                            iAlpha = Color.alpha(0);
                                                                            i10 = 75;
                                                                        } else {
                                                                            iAlpha = Color.alpha(0);
                                                                            i10 = 127;
                                                                        }
                                                                        int i180 = iAlpha * (-380);
                                                                        int i181 = -(-(i10 * 382));
                                                                        int i182 = (i180 ^ i181) + ((i180 & i181) << 1);
                                                                        int i183 = ~iAlpha;
                                                                        int i184 = -(-((i10 | i | i183) * (-381)));
                                                                        int i185 = ((i182 | i184) << 1) - (i184 ^ i182);
                                                                        int i186 = f100a;
                                                                        int i187 = (i186 & 105) + (i186 | 105);
                                                                        asBinder = i187 % 128;
                                                                        try {
                                                                            if (i187 % 2 == 0) {
                                                                                throw null;
                                                                            }
                                                                            int i188 = ~((~i10) | i183);
                                                                            int i189 = ~((i39 ^ i10) | (i39 & i10));
                                                                            int i190 = (i188 & i189) | (i188 ^ i189);
                                                                            int i191 = ~(iAlpha | i10);
                                                                            Object[] objArr27 = new Object[1];
                                                                            c(null, null, ((i185 + (((i190 & i191) | (i190 ^ i191)) * 381)) - (~(-(-((~((i183 ^ i10) | (i183 & i10))) * 381))))) - 1, new byte[]{-89, -108, -90, -119, -106, -123, -119, -121, -103, -98, -98, -99, -100, -105, -106, -116, -96, -115, -114, -109, -105, -116, -113}, objArr27);
                                                                            Method method = cls8.getMethod((String) objArr27[0], null);
                                                                            int i192 = asBinder;
                                                                            int i193 = (i192 & 91) + (i192 | 91);
                                                                            f100a = i193 % 128;
                                                                            if (i193 % 2 != 0) {
                                                                                objNewInstance.equals(method.invoke(objInvoke5, null));
                                                                                throw null;
                                                                            }
                                                                            if (!objNewInstance.equals(method.invoke(objInvoke5, null))) {
                                                                                int i194 = asBinder;
                                                                                int i195 = (i194 & 19) + (i194 | 19);
                                                                                f100a = i195 % 128;
                                                                                int i196 = i195 % 2;
                                                                                try {
                                                                                    int i197 = -Color.blue(0);
                                                                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                                                                    int i198 = i197 * 934;
                                                                                    int i199 = (i198 ^ (-31688)) + ((i198 & (-31688)) << 1);
                                                                                    int i200 = ~i197;
                                                                                    int i201 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                                                                    int i202 = ~(i200 | i201);
                                                                                    int i203 = (i199 - (~(((i202 & (-35)) | ((-35) ^ i202)) * (-933)))) - 1;
                                                                                    int i204 = ~(i201 | (-35));
                                                                                    int i205 = ~(((-35) & i197) | ((-35) ^ i197));
                                                                                    int i206 = ((i203 + (((i204 & i205) | (i204 ^ i205)) * 933)) - (~((~((i197 & 34) | (i197 ^ 34))) * 933))) - 1;
                                                                                    Object[] objArr28 = new Object[1];
                                                                                    e(new char[]{29502, 55574, 28839, 41644, 13009, 24161, 16129, 21253, 20514, 65131, 29181, 903, 45255, 27862, 63085, 32500, 43625, 44054, 1488, 23237, 12494, 62359, 4339, 9185, 47715, 60521, 61866, 50800, 9772, 44499, 19808, 51978, 39655, 44498, 24097, 3101}, i206, objArr28);
                                                                                    Class<?> cls9 = Class.forName((String) objArr28[0]);
                                                                                    int iIndexOf = TextUtils.indexOf("", "");
                                                                                    int i207 = iIndexOf * (-958);
                                                                                    int i208 = (i207 & (-121666)) + (i207 | (-121666));
                                                                                    int i209 = ~((-128) | i29);
                                                                                    int i210 = ~iIndexOf;
                                                                                    int i211 = ~(i210 | i);
                                                                                    int i212 = (i209 ^ i211) | (i209 & i211);
                                                                                    int i213 = ~(i29 | iIndexOf);
                                                                                    int i214 = -(-(((i212 ^ i213) | (i212 & i213)) * 959));
                                                                                    int i215 = (((i208 ^ i214) + ((i214 & i208) << 1)) - (~(-(-((~(iIndexOf | 127)) * (-959)))))) - 1;
                                                                                    int i216 = ~((i210 ^ i29) | (i210 & i29));
                                                                                    int i217 = ~(((-128) & i) | ((-128) ^ i));
                                                                                    int i218 = ((~((iIndexOf & i) | (iIndexOf ^ i))) | (i217 & i216) | (i216 ^ i217)) * 959;
                                                                                    Object[] objArr29 = new Object[1];
                                                                                    c(null, null, (i215 ^ i218) + ((i218 & i215) << 1), new byte[]{-89, -108, -90, -119, -106, -123, -119, -121, -103, -98, -98, -99, -100, -105, -106, -116, -96, -115, -114, -109, -105, -116, -113}, objArr29);
                                                                                    if (!objNewInstance2.equals(cls9.getMethod((String) objArr29[0], null).invoke(objInvoke5, null))) {
                                                                                        int i219 = (i93 & 47) + (i93 | 47);
                                                                                        i93 = (i219 ^ (-46)) + ((i219 & (-46)) << 1);
                                                                                        i13 = i2;
                                                                                        objArr15 = objArr19;
                                                                                        length = i117;
                                                                                    }
                                                                                } catch (Throwable th) {
                                                                                    Throwable cause = th.getCause();
                                                                                    if (cause != null) {
                                                                                        throw cause;
                                                                                    }
                                                                                    throw th;
                                                                                }
                                                                            }
                                                                            int i220 = (~(i & 1)) & (i | 1);
                                                                            Object[] objArr30 = new Object[4];
                                                                            int[] iArr = new int[1];
                                                                            objArr30[0] = iArr;
                                                                            objArr30[1] = new int[1];
                                                                            int[] iArr2 = new int[1];
                                                                            objArr30[2] = iArr2;
                                                                            int i221 = f100a;
                                                                            int i222 = (i221 & 11) + (i221 | 11);
                                                                            int i223 = i222 % 128;
                                                                            asBinder = i223;
                                                                            int i224 = i222 % 2;
                                                                            iArr[0] = i;
                                                                            int i225 = ((i223 | 75) << 1) - (i223 ^ 75);
                                                                            f100a = i225 % 128;
                                                                            int i226 = i225 % 2;
                                                                            iArr2[0] = i220;
                                                                            objArr30[3] = null;
                                                                            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                                                                            int i227 = ~iElapsedRealtime;
                                                                            int i228 = ~((-106022941) | i227);
                                                                            int i229 = ~(65712711 | iElapsedRealtime);
                                                                            int i230 = (-1663234392) + ((i228 | i229) * 1150) + (((~((-65712712) | i227)) | i229) * (-575)) + (((~(iElapsedRealtime | (-106022941))) | (~(i227 | 106022940))) * 575);
                                                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                                                            int i231 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                                                                            int i232 = 768582377 - (~(((i231 & (-2113238457)) | (i231 ^ (-2113238457))) * 1324));
                                                                            int i233 = ~(((-1777672617) & iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | ((-1777672617) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
                                                                            int i234 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault7 & (-1576293657)) | ((-1576293657) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
                                                                            int i235 = i232 + (((i234 & i233) | (i233 ^ i234)) * (-1324));
                                                                            int i236 = ((i235 | 2076426016) << 1) - (2076426016 ^ i235);
                                                                            int i237 = -(-((~(((-1103105668) & i) | ((-1103105668) ^ i))) * 623));
                                                                            int i238 = ((-734973538) & i237) + (i237 | (-734973538)) + (((1310728 & i29) | (i29 ^ 1310728)) * (-623));
                                                                            int i239 = ~(((-1942634168) & i) | ((-1942634168) ^ i));
                                                                            int i240 = (i239 & 1103105667) | (1103105667 ^ i239);
                                                                            int i241 = ~((840839228 & i) | (840839228 ^ i));
                                                                            if (i236 <= (i238 - (~(-(-(((i240 & i241) | (i240 ^ i241)) * 623))))) - 1) {
                                                                                int i242 = i2 << (i230 << 16);
                                                                                int i243 = (i242 & (-20)) + (i242 | (-20));
                                                                                int i244 = ((~i242) & i243) | ((~i243) & i242);
                                                                                i11 = i244 ^ (i244 << 72);
                                                                                i12 = (i11 & (-4)) + (i11 | (-4));
                                                                            } else {
                                                                                int i245 = (i2 - (~(i230 + 16))) - 1;
                                                                                int i246 = i245 << 13;
                                                                                int i247 = (i245 | i246) & (~(i245 & i246));
                                                                                int i248 = i247 >>> 17;
                                                                                i11 = (i247 | i248) & (~(i247 & i248));
                                                                                i12 = i11 << 5;
                                                                            }
                                                                            ((int[]) objArr30[1])[0] = (i11 | i12) & (~(i11 & i12));
                                                                            return objArr30;
                                                                        } catch (Throwable th2) {
                                                                            th = th2;
                                                                            Throwable cause2 = th.getCause();
                                                                            if (cause2 != null) {
                                                                                throw cause2;
                                                                            }
                                                                            throw th;
                                                                        }
                                                                    } catch (Throwable th3) {
                                                                        th = th3;
                                                                    }
                                                                } catch (Throwable th4) {
                                                                    Throwable cause3 = th4.getCause();
                                                                    if (cause3 != null) {
                                                                        throw cause3;
                                                                    }
                                                                    throw th4;
                                                                }
                                                            } catch (Throwable unused) {
                                                                r3 = i2;
                                                            }
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            Throwable cause4 = th.getCause();
                                                            if (cause4 != null) {
                                                                throw cause4;
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                    }
                                                } catch (Throwable th7) {
                                                    Throwable cause5 = th7.getCause();
                                                    if (cause5 != null) {
                                                        throw cause5;
                                                    }
                                                    throw th7;
                                                }
                                            } else {
                                                r3 = i13;
                                                int i249 = asBinder + 61;
                                                f100a = i249 % 128;
                                                int i250 = i249 % 2;
                                            }
                                        }
                                    } catch (Throwable th8) {
                                        Throwable cause6 = th8.getCause();
                                        if (cause6 != null) {
                                            throw cause6;
                                        }
                                        throw th8;
                                    }
                                } catch (Throwable th9) {
                                    Throwable cause7 = th9.getCause();
                                    if (cause7 != null) {
                                        throw cause7;
                                    }
                                    throw th9;
                                }
                            } catch (Throwable th10) {
                                Throwable cause8 = th10.getCause();
                                if (cause8 != null) {
                                    throw cause8;
                                }
                                throw th10;
                            }
                        } catch (Throwable th11) {
                            Throwable cause9 = th11.getCause();
                            if (cause9 != null) {
                                throw cause9;
                            }
                            throw th11;
                        }
                    } catch (Throwable th12) {
                        Throwable cause10 = th12.getCause();
                        if (cause10 != null) {
                            throw cause10;
                        }
                        throw th12;
                    }
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                r3 = i13;
            }
        } else {
            r3 = i13;
        }
        int i251 = asBinder;
        int i252 = i251 + 3;
        f100a = i252 % 128;
        int i253 = i252 % 2;
        int i254 = i251 + 61;
        f100a = i254 % 128;
        int i255 = i254 % 2;
        Object[] objArr31 = {new int[]{i}, new int[1], new int[]{i}, null};
        int i256 = ~i;
        int i257 = (-1643607692) + ((~((-939692043) | i256)) * (-783)) + (((~(i256 | (-983284875))) | (-1023595104)) * 783);
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i258 = (i257 * (-1529)) + (r3 * (-764));
        int i259 = asBinder;
        int i260 = (i259 ^ 93) + ((i259 & 93) << 1);
        int i261 = i260 % 128;
        f100a = i261;
        int i262 = i260 % 2;
        int i263 = ~i257;
        int i264 = (~r3) | i263;
        int i265 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
        int i266 = ~((i264 & i265) | (i264 ^ i265));
        int i267 = ~i257;
        int i268 = ((i267 ^ r3) == true ? 1 : 0) | ((i267 & r3) == true ? 1 : 0);
        int i269 = ~((i268 & iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (i268 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
        int i270 = (i266 & i269) | (i266 ^ i269);
        int i271 = ~r3;
        int i272 = (i271 ^ i257) | (i271 & i257);
        int i273 = ~((i272 & iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (i272 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
        int i274 = ((i270 & i273) | (i270 ^ i273)) * 765;
        int i275 = (i258 & i274) + (i258 | i274);
        int i276 = ~((i263 ^ i271) | (i263 & i271));
        int i277 = ~(i267 | i265);
        int i278 = i275 + (((i276 & i277) | (i276 ^ i277)) * 1530);
        int i279 = ~(iTuitionPaymentFragmentspecialinlinedviewModeldefault8 | i267);
        int i280 = ~((i271 ^ i265) | (i271 & i265) | i257);
        int i281 = -(-(((i279 & i280) | (i279 ^ i280)) * 765));
        int i282 = ((i278 | i281) << 1) - (i281 ^ i278);
        int i283 = ((i261 | 119) << 1) - (i261 ^ 119);
        int i284 = i283 % 128;
        asBinder = i284;
        int i285 = i283 % 2;
        int i286 = (i282 << 13) ^ i282;
        int i287 = i286 ^ (i286 >>> 17);
        ((int[]) objArr31[1])[0] = i287 ^ (i287 << 5);
        int i288 = i284 + 47;
        f100a = i288 % 128;
        if (i288 % 2 == 0) {
            return objArr31;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static String $$c(short s, byte b2, int i) {
        int i2 = b2 * 2;
        int i3 = i + 4;
        int i4 = s + 67;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i2 + 1];
        int i5 = -1;
        if (bArr == null) {
            i4 = i2 + (-i3);
            i3 = i3;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i4;
            if (i6 == i2) {
                return new String(bArr2, 0);
            }
            int i7 = i3 + 1;
            i4 += -bArr[i7];
            i3 = i7;
            i5 = i6;
        }
    }
}
