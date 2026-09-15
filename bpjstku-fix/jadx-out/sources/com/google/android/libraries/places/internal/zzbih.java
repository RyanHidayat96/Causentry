package com.google.android.libraries.places.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.work.WorkInfo;
import defpackage.generateRandomNumber;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import defpackage.setVideoStabilizationMode;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbih {
    private static final byte[] $$a = {94, -1, 37, -59};
    private static final int $$b = 241;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int g = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {59775, 59860, 59858, 59898, 59400, 59406, 59393, 59405, 59403, 59863, 59847, 59877, 59894, 59406, 59395, 59880, 59868, 59883, 59858, 59898, 59400, 59406, 59393, 59405, 59403, 59881, 59866, 59857, 59880, 59877, 59886, 59709, 59768, 59774, 59772, 59767, 59763, 59769, 59742, 59743, 59774, 59761, 59766, 59763, 59774, 59766, 59734, 59727, 59758, 59761, 59766, 59763, 59761, 59785, 59714, 59783, 59788, 59790, 59779, 59779, 59763, 59761, 59788, 59790, 59788, 59779, 59784, 59762, 59784, 59782, 59788, 59748, 59886, 59856, 59866, 59856, 59883, 59860, 59862, 59860, 59865, 59867, 59883, 59881, 59860, 59698, 59744, 59757, 59759, 59756, 59756, 59740, 59730, 59757, 59759, 59757, 59756, 59753, 59731, 59700, 59718, 59749, 59716, 59738, 59770, 59746, 59751, 59770, 59749, 59746, 59715, 59714, 59757, 59751, 59771, 59744, 59746, 59756, 59717, 59819, 59787, 59765, 59798, 59767, 59749, 59788, 59802, 59805, 59806, 59800, 59806, 59789, 59777, 59794, 59794, 59804, 59805, 59795, 59793, 59796, 59792, 59806, 59763, 59772, 59795, 59798, 59819, 59792, 59698, 59751, 59744, 59768, 59775, 59745, 59756, 59745, 59747, 59749, 59708, 59747, 59759, 59757, 59757, 59751, 59733, 59728, 59771, 59768, 59745, 59705, 59751, 59773, 59734, 59731, 59770, 59773, 59750, 59746, 59769, 59730, 59698, 59744, 59746, 59746, 59757, 59757, 59751, 59745, 59753, 59757, 59756, 59756, 59749, 59768, 59744, 59743, 59743, 59751, 59745, 59807, 59450, 59431, 59399, 59891, 59901, 59405, 59436, 59448, 59450, 59429, 59431, 59449, 59429, 59431, 59428, 59431, 59449, 59426, 59425, 59450, 59431, 59430};
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {47464, 47473, 47516, 47514, 47396, 47519, 47469, 47471, 47517, 47456, 47465, 47518, 47513, 47466, 47453, 47394, 47482, 47426, 47460, 47458, 47462, 47439, 47445, 47485, 47487, 47398, 47427, 47441, 47470, 47459, 47428, 47410, 47438, 47472, 47467, 47463, 47433, 47468, 47449, 47436, 47461};
    private static int b = 2047719698;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
    private static boolean TuitionPaymentFragmentbindingInflater1 = true;

    public abstract zzbif zzd();

    private static void c(int i, char[] cArr, int[] iArr, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr2[i4]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(i3, i3) + 31339);
                        int i5 = 2995 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        int iAlpha = Color.alpha(i3) + 17;
                        byte[] bArr2 = $$a;
                        byte b2 = (byte) (bArr2[1] + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMakeMeasureSpec, i5, iAlpha, 1182129903, false, $$c(b2, b2, bArr2[2]), new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i4++;
                    i3 = 0;
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
            Object[] objArr3 = {Integer.valueOf(b)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
            float f = 0.0f;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 43324), 252 - Process.getGidForName(""), 22 - (ViewConfiguration.getPressedStateDuration() >> 16), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
            int i6 = 33602;
            if (TuitionPaymentFragmentbindingInflater1) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                    Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char c = (char) (33602 - (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)));
                        int i7 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3084;
                        int i8 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 25;
                        byte b3 = (byte) ($$a[1] + 1);
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, i7, i8, -2146875848, false, $$c(b3, b4, (byte) (b4 | 38)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    f = 0.0f;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                int i9 = 0;
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                while (true) {
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9;
                    if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        break;
                    }
                    cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    i9 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
                }
                objArr[0] = new String(cArr5);
                int i10 = $10 + 63;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
                return;
            }
            int i11 = $11 + 33;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
            char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i13 = $11 + 103;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cRed = (char) (Color.red(0) + i6);
                    int i15 = 3085 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int offsetBefore = 26 - TextUtils.getOffsetBefore("", 0);
                    byte b5 = (byte) ($$a[1] + 1);
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cRed, i15, offsetBefore, -2146875848, false, $$c(b5, b6, (byte) (b6 | 38)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                i6 = 33602;
            }
            objArr[0] = new String(cArr6);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2;
        int i3 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i4 = 0;
        int i5 = iArr[0];
        int i6 = 1;
        int i7 = iArr[1];
        int i8 = iArr[2];
        int i9 = iArr[3];
        char[] cArr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        char c = '0';
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i10 = 0;
            while (i10 < length) {
                int i11 = $10 + 69;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    try {
                        Object[] objArr2 = new Object[i6];
                        objArr2[i4] = Integer.valueOf(cArr[i10]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cIndexOf = (char) ((-1) - TextUtils.indexOf("", c, i4, i4));
                            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 1270;
                            int iMyTid = (Process.myTid() >> 22) + 18;
                            byte b2 = (byte) ($$a[i6] + 1);
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, fadingEdgeLength, iMyTid, 407021364, false, $$c(b2, b3, (byte) (b3 + 5)), new Class[]{Integer.TYPE});
                        }
                        cArr2[i10] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr[i10])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char size = (char) View.MeasureSpec.getSize(0);
                            int iResolveSize = View.resolveSize(0, 0) + 1270;
                            int i12 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 18;
                            byte b4 = (byte) ($$a[1] + 1);
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(size, iResolveSize, i12, 407021364, false, $$c(b4, b5, (byte) (b5 + 5)), new Class[]{Integer.TYPE});
                        }
                        cArr2[i10] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        i10++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i4 = 0;
                i6 = 1;
                c = '0';
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i7];
        System.arraycopy(cArr, i5, cArr3, 0, i7);
        if (bArr != null) {
            int i13 = $11 + 121;
            $10 = i13 % 128;
            int i14 = 2;
            int i15 = i13 % 2;
            char[] cArr4 = new char[i7];
            setvideostabilizationmode.b = 0;
            int i16 = $11 + 67;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            char c2 = 0;
            while (setvideostabilizationmode.b < i7) {
                int i18 = $11 + 59;
                $10 = i18 % 128;
                int i19 = i18 % i14;
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i20 = $11 + 15;
                    $10 = i20 % 128;
                    if (i20 % i14 != 0) {
                        int i21 = setvideostabilizationmode.b;
                        char c3 = cArr3[setvideostabilizationmode.b];
                        Object[] objArr4 = new Object[i14];
                        objArr4[1] = Integer.valueOf(c2);
                        objArr4[0] = Integer.valueOf(c3);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char c4 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                            int iNormalizeMetaState = 3225 - KeyEvent.normalizeMetaState(0);
                            int defaultSize = View.getDefaultSize(0, 0) + 13;
                            byte b6 = (byte) ($$a[1] + 1);
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c4, iNormalizeMetaState, defaultSize, 2133916302, false, $$c(b6, b7, (byte) (b7 | 6)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i21] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                        throw null;
                    }
                    int i22 = setvideostabilizationmode.b;
                    Object[] objArr5 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 3225;
                        int iIndexOf = 13 - TextUtils.indexOf("", "", 0);
                        byte b8 = (byte) ($$a[1] + 1);
                        byte b9 = b8;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(threadPriority, edgeSlop, iIndexOf, 2133916302, false, $$c(b8, b9, (byte) (b9 | 6)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i22] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                } else {
                    int i23 = setvideostabilizationmode.b;
                    try {
                        Object[] objArr6 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cLastIndexOf = (char) (29943 - TextUtils.lastIndexOf("", '0', 0, 0));
                            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 1755;
                            int i24 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 23;
                            byte[] bArr2 = $$a;
                            byte b10 = (byte) (bArr2[1] + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cLastIndexOf, longPressTimeout, i24, 387247676, false, $$c(b10, b10, (byte) bArr2.length), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i23] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).charValue();
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                c2 = cArr4[setvideostabilizationmode.b];
                Object[] objArr7 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0') + 41242);
                    int defaultSize2 = 1705 - View.getDefaultSize(0, 0);
                    int capsMode = TextUtils.getCapsMode("", 0, 0) + 21;
                    byte b11 = (byte) ($$a[1] + 1);
                    byte b12 = b11;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cLastIndexOf2, defaultSize2, capsMode, -1434471773, false, $$c(b11, b12, b12), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
                i14 = 2;
            }
            cArr3 = cArr4;
        }
        if (i9 > 0) {
            int i25 = $11 + 77;
            $10 = i25 % 128;
            if (i25 % 2 != 0) {
                char[] cArr5 = new char[i7];
                i = 1;
                i2 = 0;
                System.arraycopy(cArr3, 0, cArr5, 1, i7);
                System.arraycopy(cArr5, 1, cArr3, i7 / i9, i9);
                System.arraycopy(cArr5, i9, cArr3, 1, i7 >>> i9);
            } else {
                i = 1;
                i2 = 0;
                char[] cArr6 = new char[i7];
                System.arraycopy(cArr3, 0, cArr6, 0, i7);
                int i26 = i7 - i9;
                System.arraycopy(cArr6, 0, cArr3, i26, i9);
                System.arraycopy(cArr6, i9, cArr3, 0, i26);
            }
        } else {
            i = 1;
            i2 = 0;
        }
        if (!(!z)) {
            char[] cArr7 = new char[i7];
            setvideostabilizationmode.b = i2;
            while (setvideostabilizationmode.b < i7) {
                cArr7[setvideostabilizationmode.b] = cArr3[(i7 - setvideostabilizationmode.b) - i];
                setvideostabilizationmode.b += i;
                i = 1;
            }
            cArr3 = cArr7;
        }
        if (i8 > 0) {
            int i27 = 0;
            while (true) {
                setvideostabilizationmode.b = i27;
                if (setvideostabilizationmode.b >= i7) {
                    break;
                }
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                i27 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public static Object[] b(Context context, int i, int i2) {
        int i3;
        int i4;
        Object[] objArr;
        int maximumFlingVelocity;
        int i5;
        Object obj;
        int i6;
        int i7;
        byte[] bArr;
        Method method;
        Method method2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = 2 % 2;
        char[] cArr = null;
        if (context != null) {
            try {
                Object[] objArr2 = new Object[1];
                a(new int[]{0, 31, 154, 30}, false, new byte[]{0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0}, objArr2);
                String str = (String) objArr2[0];
                int i13 = asBinder + 35;
                g = i13 % 128;
                try {
                    if (i13 % 2 == 0) {
                        objArr = new Object[]{str};
                        int maximumFlingVelocity2 = ViewConfiguration.getMaximumFlingVelocity();
                        maximumFlingVelocity = (maximumFlingVelocity2 ^ 82) + ((maximumFlingVelocity2 & 82) << 1);
                        i5 = 65;
                    } else {
                        objArr = new Object[]{str};
                        maximumFlingVelocity = ViewConfiguration.getMaximumFlingVelocity() >> 16;
                        i5 = 127;
                    }
                    int i14 = -maximumFlingVelocity;
                    Object[] objArr3 = new Object[1];
                    c(((i5 | i14) << 1) - (i5 ^ i14), null, null, new byte[]{-107, -126, -108, -117, -120, -109, -117, -118, -110, -112, -112, -113, -111, -123, -112, -112, -113, -124, -123, -114, -116, -119, -126, -123, -115, -116, -117, -118, -119, -120, -121, -122, -123, -124, -126, -125, -126, -127}, objArr3);
                    Object objNewInstance = Class.forName((String) objArr3[0]).getDeclaredConstructor(String.class).newInstance(objArr);
                    int capsMode = TextUtils.getCapsMode("", 0, 0);
                    int iB = generateRandomNumber.b();
                    int i15 = (capsMode * 980) - 124206;
                    int i16 = ~iB;
                    int i17 = (~((i16 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | ((-128) ^ i16))) * 979;
                    int i18 = (((i15 & i17) + (i15 | i17)) - (~(-(-(((capsMode ^ iB) | (capsMode & iB)) * (-979)))))) - 1;
                    int i19 = ~((-128) | iB);
                    int i20 = ~iB;
                    int i21 = (~((capsMode & i20) | (i20 ^ capsMode))) | i19;
                    int i22 = asBinder;
                    int i23 = (i22 ^ 91) + ((i22 & 91) << 1);
                    g = i23 % 128;
                    if (i23 % 2 == 0) {
                        Object[] objArr4 = new Object[1];
                        c((i18 - (~(-(979 << i21)))) - 1, null, null, new byte[]{-93, -119, -94, -121, -95, -96, -99, -117, -98, -118, -99, -109, -100, -105, -97, -106, -102, -99, -117, -98, -118, -99, -109, -100, -105, -101, -102, -103, -104, -105, -106}, objArr4);
                        obj = objArr4[0];
                    } else {
                        Object[] objArr5 = new Object[1];
                        c((i18 - (~(i21 * 979))) - 1, null, null, new byte[]{-93, -119, -94, -121, -95, -96, -99, -117, -98, -118, -99, -109, -100, -105, -97, -106, -102, -99, -117, -98, -118, -99, -109, -100, -105, -101, -102, -103, -104, -105, -106}, objArr5);
                        obj = objArr5[0];
                    }
                    try {
                        Object[] objArr6 = {(String) obj};
                        int windowTouchSlop = ViewConfiguration.getWindowTouchSlop() >> 8;
                        int iB2 = generateRandomNumber.b();
                        int i24 = windowTouchSlop * 569;
                        int i25 = (i24 ^ 72263) + ((i24 & 72263) << 1);
                        int i26 = ~windowTouchSlop;
                        int i27 = asBinder + 9;
                        int i28 = i27 % 128;
                        g = i28;
                        if (i27 % 2 == 0) {
                            throw null;
                        }
                        int i29 = ~((i26 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i26 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                        int i30 = ~iB2;
                        int i31 = ~((i26 ^ i30) | (i26 & i30));
                        int i32 = (i29 ^ i31) | (i31 & i29);
                        int i33 = ~(((-128) ^ i30) | (i30 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                        int i34 = (i25 - (~((-1136) * ((i32 & i33) | (i32 ^ i33))))) - 1;
                        int i35 = ~((i26 ^ iB2) | (i26 & iB2));
                        int i36 = ((i28 | 53) << 1) - (i28 ^ 53);
                        asBinder = i36 % 128;
                        if (i36 % 2 != 0) {
                            int i37 = i35 | (~(((-128) ^ iB2) | ((-128) & iB2)));
                            int i38 = ~iB2;
                            int i39 = (i38 & windowTouchSlop) | (i38 ^ windowTouchSlop);
                            int i40 = ~((i39 & 127) | (i39 ^ 127));
                            int i41 = -(-((i37 & i40) | (i37 ^ i40)));
                            i6 = -(-((i41 ^ (-568)) + ((i41 & (-568)) << 1)));
                        } else {
                            int i42 = ~(((-128) ^ iB2) | ((-128) & iB2));
                            int i43 = (i35 & i42) | (i35 ^ i42);
                            int i44 = ~iB2;
                            int i45 = (i44 & windowTouchSlop) | (i44 ^ windowTouchSlop);
                            int i46 = ~((i45 & 127) | (i45 ^ 127));
                            i6 = ((i43 & i46) | (i43 ^ i46)) * (-568);
                        }
                        int i47 = (i34 ^ i6) + ((i6 & i34) << 1);
                        int i48 = ~iB2;
                        int i49 = ~((i48 & windowTouchSlop) | (i48 ^ windowTouchSlop));
                        int i50 = ~iB2;
                        int i51 = i49 | (~((i50 & 127) | (i50 ^ 127)));
                        int i52 = ~windowTouchSlop;
                        int i53 = ((i28 | 75) << 1) - (i28 ^ 75);
                        asBinder = i53 % 128;
                        int i54 = i53 % 2;
                        int i55 = ~((i52 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i52 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | iB2);
                        int i56 = i47 + (568 * ((i51 & i55) | (i51 ^ i55)));
                        Object[] objArr7 = new Object[1];
                        c(i56, null, null, new byte[]{-107, -126, -108, -117, -120, -109, -117, -118, -110, -112, -112, -113, -111, -123, -112, -112, -113, -124, -123, -114, -116, -119, -126, -123, -115, -116, -117, -118, -119, -120, -121, -122, -123, -124, -126, -125, -126, -127}, objArr7);
                        Class<?> cls = Class.forName((String) objArr7[0]);
                        Class<?>[] clsArr = new Class[1];
                        int i57 = asBinder + 15;
                        g = i57 % 128;
                        int i58 = i57 % 2;
                        clsArr[0] = String.class;
                        Object objNewInstance2 = cls.getDeclaredConstructor(clsArr).newInstance(objArr6);
                        try {
                            Object[] objArr8 = new Object[1];
                            a(new int[]{31, 23, 12, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0}, objArr8);
                            Class<?> cls2 = Class.forName((String) objArr8[0]);
                            Object[] objArr9 = new Object[1];
                            a(new int[]{54, 17, 33, 0}, true, new byte[]{1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0}, objArr9);
                            Object objInvoke = cls2.getMethod((String) objArr9[0], null).invoke(context, null);
                            int i59 = asBinder;
                            int i60 = (i59 ^ 81) + ((i59 & 81) << 1);
                            g = i60 % 128;
                            if (i60 % 2 == 0) {
                                cArr.hashCode();
                                throw null;
                            }
                            try {
                                Object[] objArr10 = new Object[1];
                                a(new int[]{31, 23, 12, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0}, objArr10);
                                Class<?> cls3 = Class.forName((String) objArr10[0]);
                                Object[] objArr11 = new Object[1];
                                a(new int[]{71, 14, 121, 13}, false, new byte[]{0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0}, objArr11);
                                Method method3 = cls3.getMethod((String) objArr11[0], null);
                                int i61 = g;
                                int i62 = (i61 & 83) + (i61 | 83);
                                asBinder = i62 % 128;
                                int i63 = i62 % 2;
                                Object objInvoke2 = method3.invoke(context, null);
                                int i64 = asBinder;
                                int i65 = ((i64 | 115) << 1) - (i64 ^ 115);
                                g = i65 % 128;
                                int i66 = i65 % 2;
                                try {
                                    Object[] objArr12 = {objInvoke2, 64};
                                    Object[] objArr13 = new Object[1];
                                    a(new int[]{85, 33, 0, 0}, true, new byte[]{0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, objArr13);
                                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                                    int i67 = -Process.getGidForName("");
                                    int iB3 = generateRandomNumber.b();
                                    int i68 = g;
                                    int i69 = i68 + 7;
                                    asBinder = i69 % 128;
                                    int i70 = i69 % 2;
                                    int i71 = ((-661) * i67) - 83286;
                                    int i72 = ~iB3;
                                    int i73 = ~i67;
                                    int i74 = ((~((i73 ^ ComposerKt.defaultsKey) | (i73 & ComposerKt.defaultsKey))) | i72) * 1324;
                                    int i75 = (i71 & i74) + (i71 | i74);
                                    int i76 = ((~((i67 ^ iB3) | (i67 & iB3))) | (~((iB3 ^ 126) | (iB3 & 126)))) * (-1324);
                                    int i77 = ((i75 | i76) << 1) - (i76 ^ i75);
                                    int i78 = (i68 & 69) + (i68 | 69);
                                    int i79 = i78 % 128;
                                    asBinder = i79;
                                    if (i78 % 2 != 0) {
                                        int i80 = ~((i73 ^ 126) | (i73 & 126));
                                        int i81 = ~((i67 & ComposerKt.defaultsKey) | ((-127) ^ i67));
                                        i7 = i77 >> (662 / ((i80 & i81) | (i80 ^ i81)));
                                        bArr = new byte[14];
                                    } else {
                                        int i82 = ~((i73 ^ 126) | (i73 & 126));
                                        int i83 = ~((i67 & ComposerKt.defaultsKey) | ((-127) ^ i67));
                                        i7 = (((i82 & i83) | (i82 ^ i83)) * 662) + i77;
                                        bArr = new byte[14];
                                    }
                                    // fill-array-data instruction
                                    bArr[0] = -98;
                                    bArr[1] = -90;
                                    bArr[2] = -109;
                                    bArr[3] = -91;
                                    bArr[4] = -121;
                                    bArr[5] = -93;
                                    bArr[6] = -126;
                                    bArr[7] = -92;
                                    bArr[8] = -120;
                                    bArr[9] = -126;
                                    bArr[10] = -110;
                                    bArr[11] = -116;
                                    bArr[12] = -121;
                                    bArr[13] = -93;
                                    int i84 = i79 + 23;
                                    g = i84 % 128;
                                    if (i84 % 2 == 0) {
                                        Object[] objArr14 = new Object[1];
                                        c(i7, null, null, bArr, objArr14);
                                        method = cls4.getMethod((String) objArr14[0], Integer.TYPE, String.class);
                                    } else {
                                        Object[] objArr15 = new Object[1];
                                        c(i7, null, null, bArr, objArr15);
                                        method = cls4.getMethod((String) objArr15[0], String.class, Integer.TYPE);
                                    }
                                    Object objInvoke3 = method.invoke(objInvoke, objArr12);
                                    Object[] objArr16 = new Object[1];
                                    a(new int[]{118, 30, 47, 17}, false, new byte[]{1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1}, objArr16);
                                    Class<?> cls5 = Class.forName((String) objArr16[0]);
                                    Object[] objArr17 = new Object[1];
                                    a(new int[]{148, 10, 0, 10}, true, new byte[]{1, 0, 1, 1, 1, 1, 1, 1, 0, 0}, objArr17);
                                    Object[] objArr18 = (Object[]) cls5.getField((String) objArr17[0]).get(objInvoke3);
                                    int length = objArr18.length;
                                    int i85 = 0;
                                    while (true) {
                                        if (i85 < length) {
                                            Object obj2 = objArr18[i85];
                                            int maximumFlingVelocity3 = ViewConfiguration.getMaximumFlingVelocity() >> 16;
                                            Object[] objArr19 = new Object[1];
                                            c((maximumFlingVelocity3 ^ 127) + ((maximumFlingVelocity3 & 127) << 1), cArr, cArr, new byte[]{-89, -112, -113, -123, -111}, objArr19);
                                            try {
                                                Object[] objArr20 = {(String) objArr19[0]};
                                                int i86 = -Gravity.getAbsoluteGravity(0, 0);
                                                int iB4 = generateRandomNumber.b();
                                                int i87 = ~i86;
                                                int i88 = ~((i87 & iB4) | (i87 ^ iB4));
                                                int i89 = ((i86 * 319) - 40259) + ((((-128) ^ i88) | (i88 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT)) * (-318));
                                                int i90 = ~((-128) | iB4);
                                                int i91 = ~iB4;
                                                int i92 = (i91 ^ i86) | (i91 & i86);
                                                int i93 = ~((i92 ^ 127) | (i92 & 127));
                                                int i94 = ((i90 ^ i93) | (i93 & i90)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                                                int i95 = ((i89 | i94) << 1) - (i94 ^ i89);
                                                int i96 = ((-128) ^ i91) | (i91 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT);
                                                int i97 = ~((i96 & i86) | (i96 ^ i86));
                                                int i98 = (i86 & 127) | (i86 ^ 127);
                                                int i99 = ~((i98 & iB4) | (i98 ^ iB4));
                                                int i100 = ((i99 & i97) | (i97 ^ i99)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                                                Object[] objArr21 = new Object[1];
                                                c(((i95 | i100) << 1) - (i100 ^ i95), cArr, cArr, new byte[]{-115, -118, -98, -116, -120, -126, -88, -121, -116, -126, -120, -117, -90, -117, -116, -118, -121, -106, -123, -116, -118, -121, -120, -123, -115, -116, -117, -118, -119, -120, -121, -122, -123, -126, -125, -126, -127}, objArr21);
                                                Class<?> cls6 = Class.forName((String) objArr21[0]);
                                                int[] iArr = {158, 11, 0, 3};
                                                int i101 = g;
                                                int i102 = (i101 & 119) + (i101 | 119);
                                                asBinder = i102 % 128;
                                                if (i102 % 2 != 0) {
                                                    Object[] objArr22 = new Object[1];
                                                    a(iArr, true, new byte[]{0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1}, objArr22);
                                                    method2 = cls6.getMethod((String) objArr22[0], String.class);
                                                } else {
                                                    Object[] objArr23 = new Object[1];
                                                    a(iArr, false, new byte[]{0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1}, objArr23);
                                                    method2 = cls6.getMethod((String) objArr23[0], String.class);
                                                }
                                                Object objInvoke4 = method2.invoke(cArr, objArr20);
                                                try {
                                                    int i103 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                    int i104 = i103 * (-129);
                                                    int i105 = (i104 & 16637) + (i104 | 16637);
                                                    int i106 = ~i;
                                                    int i107 = ((-128) ^ i106) | (i106 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT);
                                                    int i108 = asBinder + 45;
                                                    int i109 = i108 % 128;
                                                    g = i109;
                                                    int i110 = i108 % 2;
                                                    int i111 = 130 * (~((i107 & i103) | (i107 ^ i103)));
                                                    int i112 = (i105 ^ i111) + ((i105 & i111) << 1);
                                                    int i113 = ((-128) ^ i103) | ((-128) & i103);
                                                    int i114 = ~i113;
                                                    int i115 = i109 + 47;
                                                    asBinder = i115 % 128;
                                                    if (i115 % 2 != 0) {
                                                        int i116 = -((-260) << i114);
                                                        i8 = ((i112 | i116) << 1) - (i116 ^ i112);
                                                    } else {
                                                        int i117 = -(-(i114 * (-260)));
                                                        i8 = (i112 ^ i117) + ((i117 & i112) << 1);
                                                    }
                                                    int i118 = ~i103;
                                                    int i119 = ~((i118 & 127) | (i118 ^ 127));
                                                    int i120 = ~((i113 ^ i) | (i113 & i));
                                                    int i121 = -(-(130 * ((i119 & i120) | (i119 ^ i120))));
                                                    int i122 = ((i8 | i121) << 1) - (i121 ^ i8);
                                                    Object[] objArr24 = new Object[1];
                                                    c(i122, null, null, new byte[]{-121, -118, -119, -116, -126, -109, -93, -117, -103, -123, -87, -108, -123, -116, -109, -121, -116, -109, -98, -120, -123, -99, -117, -98, -118, -99, -109, -126}, objArr24);
                                                    Class<?> cls7 = Class.forName((String) objArr24[0]);
                                                    Object[] objArr25 = new Object[1];
                                                    a(new int[]{169, 11, 0, 6}, true, new byte[]{1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1}, objArr25);
                                                    try {
                                                        Object[] objArr26 = {new ByteArrayInputStream((byte[]) cls7.getMethod((String) objArr25[0], null).invoke(obj2, null))};
                                                        int i123 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                        Object[] objArr27 = new Object[1];
                                                        c((i123 ^ 127) + ((i123 & 127) << 1), null, null, new byte[]{-115, -118, -98, -116, -120, -126, -88, -121, -116, -126, -120, -117, -90, -117, -116, -118, -121, -106, -123, -116, -118, -121, -120, -123, -115, -116, -117, -118, -119, -120, -121, -122, -123, -126, -125, -126, -127}, objArr27);
                                                        Class<?> cls8 = Class.forName((String) objArr27[0]);
                                                        Object[] objArr28 = new Object[1];
                                                        a(new int[]{180, 19, 0, 5}, true, new byte[]{0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1}, objArr28);
                                                        Object objInvoke5 = cls8.getMethod((String) objArr28[0], InputStream.class).invoke(objInvoke4, objArr26);
                                                        try {
                                                            int i124 = -View.resolveSizeAndState(0, 0, 0);
                                                            int i125 = asBinder;
                                                            int i126 = i125 + 67;
                                                            g = i126 % 128;
                                                            if (i126 % 2 == 0) {
                                                                i9 = (i124 * (-716)) << Integer.MIN_VALUE;
                                                            } else {
                                                                int i127 = i124 * (-716);
                                                                i9 = ((i127 & 182245) << 1) + (i127 ^ 182245);
                                                            }
                                                            int i128 = ~i124;
                                                            int i129 = -(-((-1434) * (i128 | 127)));
                                                            int i130 = ((i9 | i129) << 1) - (i9 ^ i129);
                                                            int i131 = ~i;
                                                            int i132 = ~((i131 ^ 127) | (i131 & 127));
                                                            int i133 = (i124 & 127) | (i124 ^ 127);
                                                            int i134 = ~i133;
                                                            int i135 = (i132 ^ i134) | (i132 & i134);
                                                            int i136 = i128 | WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                                                            int i137 = i130 + ((i135 | (~((i136 ^ i) | (i136 & i)))) * 717);
                                                            int i138 = (i128 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i128 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT);
                                                            int i139 = (i125 ^ 25) + ((i125 & 25) << 1);
                                                            g = i139 % 128;
                                                            if (i139 % 2 == 0) {
                                                                Object obj3 = null;
                                                                obj3.hashCode();
                                                                throw null;
                                                            }
                                                            int i140 = ~((i138 ^ i131) | (i138 & i131));
                                                            int i141 = ~i133;
                                                            int i142 = (i141 & i140) | (i140 ^ i141);
                                                            int i143 = ~((i ^ 127) | (i & 127));
                                                            int i144 = ((i142 & i143) | (i142 ^ i143)) * 717;
                                                            Object[] objArr29 = new Object[1];
                                                            c((i137 & i144) + (i144 | i137), null, null, new byte[]{-121, -116, -126, -120, -117, -90, -117, -116, -118, -121, -106, -89, -112, -113, -111, -123, -116, -118, -121, -120, -123, -115, -116, -117, -118, -119, -120, -121, -122, -123, -126, -125, -126, -127}, objArr29);
                                                            Class<?> cls9 = Class.forName((String) objArr29[0]);
                                                            Object[] objArr30 = new Object[1];
                                                            a(new int[]{199, 23, 198, 15}, false, new byte[]{1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1}, objArr30);
                                                            if (!objNewInstance.equals(cls9.getMethod((String) objArr30[0], null).invoke(objInvoke5, null))) {
                                                                int i145 = asBinder;
                                                                int i146 = ((i145 | 115) << 1) - (i145 ^ 115);
                                                                g = i146 % 128;
                                                                int i147 = i146 % 2;
                                                                try {
                                                                    Object[] objArr31 = new Object[1];
                                                                    c(125 - (~(-ExpandableListView.getPackedPositionChild(0L))), null, null, new byte[]{-121, -116, -126, -120, -117, -90, -117, -116, -118, -121, -106, -89, -112, -113, -111, -123, -116, -118, -121, -120, -123, -115, -116, -117, -118, -119, -120, -121, -122, -123, -126, -125, -126, -127}, objArr31);
                                                                    Class<?> cls10 = Class.forName((String) objArr31[0]);
                                                                    Object[] objArr32 = new Object[1];
                                                                    a(new int[]{199, 23, 198, 15}, false, new byte[]{1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1}, objArr32);
                                                                    if (!objNewInstance2.equals(cls10.getMethod((String) objArr32[0], null).invoke(objInvoke5, null))) {
                                                                        i85 = ((i85 | 1) << 1) - (i85 ^ 1);
                                                                        cArr = null;
                                                                    }
                                                                } catch (Throwable th) {
                                                                    Throwable cause = th.getCause();
                                                                    if (cause != null) {
                                                                        throw cause;
                                                                    }
                                                                    throw th;
                                                                }
                                                            }
                                                            int i148 = (i & (-2)) | (i131 & 1);
                                                            Object[] objArr33 = new Object[4];
                                                            int[] iArr2 = new int[1];
                                                            objArr33[0] = iArr2;
                                                            int[] iArr3 = new int[1];
                                                            objArr33[1] = iArr3;
                                                            int i149 = asBinder;
                                                            int i150 = ((i149 | 63) << 1) - (i149 ^ 63);
                                                            int i151 = i150 % 128;
                                                            g = i151;
                                                            if (i150 % 2 == 0) {
                                                                objArr33[2] = new int[1];
                                                            } else {
                                                                objArr33[2] = new int[1];
                                                            }
                                                            int i152 = ((i151 | 103) << 1) - (i151 ^ 103);
                                                            int i153 = i152 % 128;
                                                            asBinder = i153;
                                                            if (i152 % 2 != 0) {
                                                                iArr2[0] = i;
                                                                ((int[]) objArr33[3])[0] = i148;
                                                            } else {
                                                                iArr2[0] = i;
                                                                ((int[]) objArr33[2])[0] = i148;
                                                            }
                                                            int i154 = i153 + 21;
                                                            g = i154 % 128;
                                                            int i155 = i154 % 2;
                                                            objArr33[3] = null;
                                                            int i156 = ~(133931005 | i);
                                                            int i157 = 23959452 + ((73564576 | i156) * (-476)) + (i156 * 952) + ((~(133931005 | i131)) * 476);
                                                            int i158 = i153 + 113;
                                                            int i159 = i158 % 128;
                                                            g = i159;
                                                            int i160 = i158 % 2;
                                                            int i161 = (-31024) + (i157 * 971);
                                                            int i162 = ~i157;
                                                            int i163 = ((i159 | 111) << 1) - (i159 ^ 111);
                                                            asBinder = i163 % 128;
                                                            if (i163 % 2 != 0) {
                                                                int i164 = -(-((~((i162 ^ 16) | (i162 & 16))) | (~((i131 ^ i157) | (i131 & i157)))));
                                                                i10 = (i161 - (~(-(((i164 | (-970)) << 1) - (i164 ^ (-970)))))) - 1;
                                                                i11 = (-17) | i157;
                                                            } else {
                                                                int i165 = ~(i162 | 16);
                                                                int i166 = ~(i131 | i157);
                                                                int i167 = -(-(((i165 & i166) | (i165 ^ i166)) * (-970)));
                                                                i10 = ((i161 | i167) << 1) - (i167 ^ i161);
                                                                i11 = ((-17) & i157) | ((-17) ^ i157);
                                                            }
                                                            int i168 = 1940 * (~i11);
                                                            int i169 = (i10 & i168) + (i10 | i168);
                                                            int i170 = ~((i162 & (-17)) | ((-17) ^ i162));
                                                            int i171 = ~((i131 ^ i157) | (i157 & i131));
                                                            int i172 = -(-(i169 + (((i170 & i171) | (i170 ^ i171)) * 970)));
                                                            int i173 = (i2 ^ i172) + ((i2 & i172) << 1);
                                                            int i174 = i173 << 13;
                                                            int i175 = (i174 & (~i173)) | ((~i174) & i173);
                                                            int i176 = i175 >>> 17;
                                                            int i177 = (i175 | i176) & (~(i175 & i176));
                                                            iArr3[0] = i177 ^ (i177 << 5);
                                                            return objArr33;
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
        Object[] objArr34 = new Object[4];
        int[] iArr4 = new int[1];
        objArr34[0] = iArr4;
        int i178 = g;
        int i179 = (i178 ^ 1) + ((i178 & 1) << 1);
        int i180 = i179 % 128;
        asBinder = i180;
        if (i179 % 2 != 0) {
            objArr34[1] = new int[0];
            objArr34[3] = new int[1];
        } else {
            objArr34[1] = new int[1];
            objArr34[2] = new int[1];
        }
        iArr4[0] = i;
        ((int[]) objArr34[2])[0] = i;
        objArr34[3] = null;
        int i181 = ~i;
        int i182 = (~(146199089 | i181)) | (-197130808) | (~(186509318 | i181));
        int i183 = 1310845124 + (((~(i | (-135577601))) | i182) * 590) + (i182 * (-1180)) + (((~((-186509319) | i181)) | (~(i181 | (-146199090)))) * 590);
        int i184 = (i180 ^ 3) + ((i180 & 3) << 1);
        g = i184 % 128;
        if (i184 % 2 == 0) {
            int i185 = i2 % i183;
            int i186 = i185 / 29;
            int i187 = (i185 | i186) & (~(i185 & i186));
            i3 = i187 ^ (i187 / 44);
            i4 = (i3 ^ 5) + ((i3 & 5) << 1);
        } else {
            int i188 = (i2 ^ i183) + ((i2 & i183) << 1);
            int i189 = i188 << 13;
            int i190 = (i188 | i189) & (~(i188 & i189));
            int i191 = i190 >>> 17;
            i3 = (i190 | i191) & (~(i190 & i191));
            i4 = i3 << 5;
        }
        ((int[]) objArr34[1])[0] = ((~i3) & i4) | ((~i4) & i3);
        return objArr34;
    }

    private static String $$c(byte b2, int i, int i2) {
        int i3 = i * 2;
        byte[] bArr = $$a;
        int i4 = 3 - (b2 * 4);
        int i5 = 105 - i2;
        byte[] bArr2 = new byte[i3 + 1];
        int i6 = -1;
        if (bArr == null) {
            i5 += i3;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i5;
            if (i6 == i3) {
                return new String(bArr2, 0);
            }
            i4++;
            i5 += bArr[i4];
        }
    }
}
