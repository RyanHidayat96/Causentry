package id.vida.algos.luma;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.initSession;
import defpackage.onCameraAvailable;
import defpackage.setVideoStabilizationMode;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes7.dex */
public class LuminanceResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1007a = 60;
    public final int b;
    public final int c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1008e;
    public final int f;
    private static final byte[] $$c = {117, -15, -81, 1};
    private static final int $$d = 249;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {68, 104, -93, -37};
    private static final int $$b = 222;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {59705, 59759, 59751, 59744, 59759, 59746, 59749, 59749, 59730, 59729, 59744, 59757, 59756, 59749, 59744, 59752, 59743, 59728, 59749, 59716, 59800, 59783, 59806, 59806, 59801, 59802, 59766, 59786, 59804, 59785, 59760, 59777, 59801, 59806, 59781, 59782, 59801, 59704, 59749, 59744, 59752, 59743, 59698, 59739, 59770, 59717, 59714, 59757, 59751, 59771, 59744, 59746, 59756, 59759, 59815, 59833, 59871, 59841, 59848, 59852, 59847, 59840, 59815, 59809, 59846, 59871, 59864, 59847, 59841, 59865, 59841, 59841, 59871, 59841, 59848, 59854, 59847, 59834, 59833, 59868, 59868, 59833, 59813, 59842, 59847, 59866, 59841, 59842, 59813, 59809, 59854, 59855, 59847, 59807, 59426, 59425, 59706, 59759, 59753, 59753, 59746, 59756, 59754, 59756, 59747, 59759, 59714, 59716, 59770, 59771, 59746, 59714, 59738, 59773, 59773, 59738, 59718, 59747, 59744, 59771, 59746, 59747, 59718, 59713, 59750, 59768, 59746, 59667, 59708, 59749, 59756, 59752, 59745, 59744, 59757, 59753, 59746, 59768, 59738, 59712, 59745, 59744, 59757, 59753, 59746, 59768, 59738, 59712, 59749, 59744, 59752, 59759, 59714, 59718, 59747, 59746, 59771, 59744, 59747, 59718, 59738, 59773, 59773, 59738};

    public LuminanceResult(int i, int i2, int i3, int i4, int i5) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.f1008e = i4;
        this.f = i5;
    }

    private static void h(int i, int i2, int i3, Object[] objArr) {
        byte[] bArr = $$a;
        int i4 = 4 - (i3 * 2);
        int i5 = i2 * 3;
        int i6 = (i * 2) + 98;
        byte[] bArr2 = new byte[i5 + 1];
        int i7 = -1;
        if (bArr == null) {
            i6 += i5;
            i4++;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i6;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i6 += bArr[i4];
                i4++;
            }
        }
    }

    public void setDarkThreshold(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 7;
        int i4 = i3 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4;
        int i5 = i3 % 2;
        this.f1007a = i;
        if (i5 != 0) {
            throw null;
        }
        int i6 = i4 + 119;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        int i7 = i6 % 2;
    }

    public int getDarkPixels(int i) {
        int i2 = 2 % 2;
        if (i == 0) {
            return this.c;
        }
        int i3 = TuitionPaymentFragmentbindingInflater1;
        int i4 = i3 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        if (i == 1) {
            return this.d;
        }
        if (i == 2) {
            return this.f1008e;
        }
        int i6 = i3 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
        int i7 = i6 % 2;
        if (i != 3) {
            return -1;
        }
        return this.f;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    public int isDark() {
        int i;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = this.b;
        if (i5 == 0) {
            int i6 = TuitionPaymentFragmentbindingInflater1 + 17;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            int i7 = i6 % 2;
            return -1;
        }
        int i8 = (i5 * this.f1007a) / 100;
        if (this.c > i8) {
            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 109;
            TuitionPaymentFragmentbindingInflater1 = i9 % 128;
            if (i9 % 2 == 0) {
                i = 0;
            } else {
                i = 1;
            }
        } else {
            i = 0;
        }
        if (this.d > i8) {
            int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 47;
            TuitionPaymentFragmentbindingInflater1 = i10 % 128;
            int i11 = i10 % 2;
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i12 = this.f1008e > i8 ? 1 : 0;
        if (this.f > i8) {
            int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 71;
            TuitionPaymentFragmentbindingInflater1 = i13 % 128;
            int i14 = i13 % 2;
            i3 = 1;
        } else {
            i3 = 0;
        }
        return ((i + i2) + i12) + i3 < 2 ? 0 : 1;
    }

    private static void g(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        char c;
        int i = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i2 = 0;
        int i3 = iArr[0];
        int i4 = 1;
        int i5 = iArr[1];
        int i6 = iArr[2];
        char c2 = 3;
        int i7 = iArr[3];
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = new Object[i4];
                    objArr2[i2] = Integer.valueOf(cArr2[i8]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(i2);
                        int iIndexOf = 1270 - TextUtils.indexOf("", "");
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 18;
                        byte b = $$c[c2];
                        byte b2 = (byte) (b - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cNormalizeMetaState, iIndexOf, pressedStateDuration, 407021364, false, $$e(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i8++;
                    i2 = 0;
                    i4 = 1;
                    c2 = 3;
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
        char[] cArr4 = new char[i5];
        System.arraycopy(cArr2, i3, cArr4, 0, i5);
        if (bArr != null) {
            int i9 = $11 + 11;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                cArr = new char[i5];
                setvideostabilizationmode.b = 1;
                c = 1;
            } else {
                cArr = new char[i5];
                setvideostabilizationmode.b = 0;
                c = 0;
            }
            while (setvideostabilizationmode.b < i5) {
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i10 = $11 + 101;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    int i12 = setvideostabilizationmode.b;
                    Object[] objArr3 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char mode = (char) View.MeasureSpec.getMode(0);
                        int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 3225;
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 14;
                        byte b3 = (byte) ($$c[3] - 1);
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(mode, doubleTapTimeout, packedPositionChild, 2133916302, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i12] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                } else {
                    int i13 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cBlue = (char) (Color.blue(0) + 29944);
                        int jumpTapTimeout = 1755 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int i14 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 22;
                        byte b5 = (byte) ($$c[3] + 1);
                        byte b6 = (byte) (b5 - 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cBlue, jumpTapTimeout, i14, 387247676, false, $$e(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i13] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                }
                c = cArr[setvideostabilizationmode.b];
                Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char windowTouchSlop = (char) (41241 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 1705;
                    int mirror = 'E' - AndroidCharacter.getMirror('0');
                    byte b7 = (byte) ($$c[3] - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(windowTouchSlop, iMakeMeasureSpec, mirror, -1434471773, false, $$e((byte) 6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            cArr4 = cArr;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr4, 0, cArr5, 0, i5);
            int i15 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr4, i15, i7);
            System.arraycopy(cArr5, i7, cArr4, 0, i15);
        }
        if (z) {
            int i16 = $10 + 41;
            $11 = i16 % 128;
            int i17 = i16 % 2;
            char[] cArr6 = new char[i5];
            setvideostabilizationmode.b = 0;
            while (setvideostabilizationmode.b < i5) {
                cArr6[setvideostabilizationmode.b] = cArr4[(i5 - setvideostabilizationmode.b) - 1];
                setvideostabilizationmode.b++;
                int i18 = $11 + 47;
                $10 = i18 % 128;
                int i19 = i18 % 2;
            }
            cArr4 = cArr6;
        }
        if (i6 > 0) {
            int i20 = 0;
            while (true) {
                setvideostabilizationmode.b = i20;
                if (setvideostabilizationmode.b >= i5) {
                    break;
                }
                cArr4[setvideostabilizationmode.b] = (char) (cArr4[setvideostabilizationmode.b] - iArr[2]);
                i20 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:55:0x02d5 A[Catch: Exception -> 0x03b2, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x03b2, blocks: (B:49:0x029f, B:60:0x030b, B:63:0x0330, B:65:0x0355, B:72:0x03a3, B:73:0x03a9, B:55:0x02d5, B:57:0x02fa, B:75:0x03ab, B:76:0x03b1, B:64:0x033a, B:56:0x02df), top: B:101:0x029f, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x030b A[Catch: Exception -> 0x03b2, TRY_ENTER, TryCatch #6 {Exception -> 0x03b2, blocks: (B:49:0x029f, B:60:0x030b, B:63:0x0330, B:65:0x0355, B:72:0x03a3, B:73:0x03a9, B:55:0x02d5, B:57:0x02fa, B:75:0x03ab, B:76:0x03b1, B:64:0x033a, B:56:0x02df), top: B:101:0x029f, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x032e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0330 A[Catch: Exception -> 0x03b2, TRY_LEAVE, TryCatch #6 {Exception -> 0x03b2, blocks: (B:49:0x029f, B:60:0x030b, B:63:0x0330, B:65:0x0355, B:72:0x03a3, B:73:0x03a9, B:55:0x02d5, B:57:0x02fa, B:75:0x03ab, B:76:0x03b1, B:64:0x033a, B:56:0x02df), top: B:101:0x029f, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0366  */
    /* JADX WARN: Code duplicated, block: B:70:0x0374  */
    /* JADX WARN: Code duplicated, block: B:80:0x04be  */
    /* JADX WARN: Code duplicated, block: B:81:0x04ea  */
    public static Object[] b(int i, int i2) throws Throwable {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        String line;
        Object[] objArr;
        int i8;
        Object[] objArr2;
        int i9;
        int i10;
        int i11;
        int i12;
        File file;
        FileReader fileReader;
        BufferedReader bufferedReader;
        boolean zEquals;
        File file2;
        FileReader fileReader2;
        BufferedReader bufferedReader2;
        boolean zEquals2;
        int i13;
        int i14;
        int i15;
        char c;
        int[] iArr;
        byte[] bArr;
        boolean z;
        int i16 = 2 % 2;
        int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 95;
        int i18 = i17 % 128;
        TuitionPaymentFragmentbindingInflater1 = i18;
        try {
            String[] strArr = i17 % 2 == 0 ? new String[5] : new String[2];
            int i19 = (i18 & 27) + (i18 | 27);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i19 % 128;
            int i20 = i19 % 2;
            Object[] objArr3 = new Object[1];
            g(new int[]{0, 19, 0, 0}, true, new byte[]{0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, objArr3);
            strArr[0] = (String) objArr3[0];
            Object[] objArr4 = new Object[1];
            g(new int[]{19, 18, 39, 0}, false, new byte[]{0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1}, objArr4);
            strArr[1] = (String) objArr4[0];
            int i21 = 0;
            while (true) {
                if (i21 >= 2) {
                    int i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
                    TuitionPaymentFragmentbindingInflater1 = i22 % 128;
                    int i23 = i22 % 2;
                    i5 = i;
                    break;
                }
                String str = strArr[i21];
                Object[] objArr5 = new Object[1];
                g(new int[]{37, 16, 0, 0}, true, new byte[]{1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, objArr5);
                Class<?> cls = Class.forName((String) objArr5[0]);
                if (((Boolean) cls.getMethod(str, new Class[0]).invoke(cls, null)).booleanValue()) {
                    i3 = i & (-2);
                    i4 = (~i) & 1;
                    i5 = i3 | i4;
                    break;
                }
                i21 = ((i21 & 1) << 1) + (i21 ^ 1);
                int i24 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
                TuitionPaymentFragmentbindingInflater1 = i24 % 128;
                int i25 = i24 % 2;
            }
        } catch (Exception unused) {
            i3 = i & (-3);
            i4 = (~i) & 2;
        }
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(109138771);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cAlpha = (char) (2419 - Color.alpha(0));
                int i26 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2844;
                int iRed = Color.red(0) + 5;
                byte b = (byte) 0;
                byte b2 = b;
                Object[] objArr6 = new Object[1];
                h(b, b2, b2, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAlpha, i26, iRed, -501222268, false, (String) objArr6[0], new Class[0]);
            }
            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
            long j = 590524249;
            long j2 = -574;
            long j3 = -1;
            long j4 = j ^ j3;
            long startUptimeMillis = (int) Process.getStartUptimeMillis();
            long j5 = startUptimeMillis ^ j3;
            long j6 = ((jLongValue ^ j3) | startUptimeMillis) ^ j3;
            long j7 = (j2 * j) + (j2 * jLongValue) + (((long) 1150) * (((j4 | j5) ^ j3) | j6)) + (((long) (-575)) * (j6 | ((j5 | jLongValue) ^ j3))) + (((long) 575) * (((j4 | startUptimeMillis) ^ j3) | (j3 ^ (j5 | j)))) + ((long) (-1749710935));
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i27 = ~(648625052 | iElapsedRealtime);
            int i28 = ~iElapsedRealtime;
            int i29 = i27 | (~(2085851463 | i28));
            int i30 = ~((-648625053) | i28);
            int i31 = ((int) (j7 >> 32)) & ((-803382758) + ((i29 | i30) * (-516)) + (((~(iElapsedRealtime | (-1481801796))) | (~((-604049669) | i28))) * 516) + ((604049668 | i30) * 516));
            int i32 = ((int) j7) & (1995548417 + (((~((-220608220) | i)) | (-1657834630)) * (-366)) + (((~((-1154) | i)) | (-1878441696)) * 366));
            int i33 = (i31 & i32) | (i31 ^ i32);
            int i34 = (~(i & 10)) & (i | 10);
            int i35 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i36 = ((i35 | 91) << 1) - (i35 ^ 91);
            int i37 = i36 % 128;
            TuitionPaymentFragmentbindingInflater1 = i37;
            int i38 = i36 % 2;
            int i39 = i33 ^ 1;
            int i40 = -i39;
            int i41 = ((i39 & i40) | (i39 ^ i40)) >> 31;
            int i42 = (i37 & 1) + (i37 | 1);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i42 % 128;
            if (i42 % 2 != 0) {
                int i43 = i34 & (~i41);
                int i44 = i41 & i;
                i6 = (i44 & i43) | (i43 ^ i44);
                int i45 = 38 / 0;
            } else {
                int i46 = i34 & (~i41);
                int i47 = i41 & i;
                i6 = (i47 & i46) | (i46 ^ i47);
            }
            int i48 = i37 + 69;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i48 % 128;
            if (i48 % 2 != 0) {
                i7 = (~(i & i5)) & (i | i5);
                int i49 = 81 / 0;
            } else {
                i7 = ((~i5) & i) | ((~i) & i5);
            }
            int i50 = -i7;
            int i51 = ((i7 & i50) | (i7 ^ i50)) >> 31;
            int i52 = i6 & (~i51);
            int i53 = i5 & i51;
            int i54 = (i52 ^ i53) | (i53 & i52);
            try {
                Object[] objArr7 = new Object[1];
                g(new int[]{53, 40, 97, 24}, false, new byte[]{0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1}, objArr7);
                File file3 = new File((String) objArr7[0]);
                try {
                    if (file3.canRead()) {
                        FileReader fileReader3 = new FileReader(file3);
                        BufferedReader bufferedReader3 = new BufferedReader(fileReader3);
                        int i55 = TuitionPaymentFragmentbindingInflater1;
                        int i56 = (i55 & 113) + (i55 | 113);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i56 % 128;
                        try {
                            if (i56 % 2 != 0) {
                                line = bufferedReader3.readLine();
                                iArr = new int[]{93, 3, 187, 0};
                                bArr = new byte[]{1, 1, 1};
                                c = 0;
                                z = true;
                            } else {
                                line = bufferedReader3.readLine();
                                c = 0;
                                iArr = new int[]{93, 3, 187, 0};
                                bArr = new byte[]{1, 1, 1};
                                z = false;
                            }
                            Object[] objArr8 = new Object[1];
                            g(iArr, z, bArr, objArr8);
                            if (line.equals((String) objArr8[c])) {
                                fileReader3.close();
                                bufferedReader3.close();
                                int i57 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i58 = ((i57 | 63) << 1) - (i57 ^ 63);
                                TuitionPaymentFragmentbindingInflater1 = i58 % 128;
                                if (i58 % 2 == 0) {
                                    int i59 = 3 / 2;
                                }
                            } else {
                                fileReader3.close();
                                bufferedReader3.close();
                            }
                            Object[] objArr9 = new Object[1];
                            g(new int[]{96, 31, 0, 10}, false, new byte[]{1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1}, objArr9);
                            file = new File((String) objArr9[0]);
                            if (!file.canRead()) {
                                int i60 = TuitionPaymentFragmentbindingInflater1;
                                i15 = (i60 ^ 103) + ((i60 & 103) << 1);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i15 % 128;
                                if (i15 % 2 != 0) {
                                    Object[] objArr10 = new Object[1];
                                    g(new int[]{128, 36, 0, 0}, true, new byte[]{0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0}, objArr10);
                                    file2 = new File((String) objArr10[0]);
                                    if (!file2.canRead()) {
                                        fileReader2 = new FileReader(file2);
                                        bufferedReader2 = new BufferedReader(fileReader2);
                                        try {
                                            String line2 = bufferedReader2.readLine();
                                            Object[] objArr11 = new Object[1];
                                            g(new int[]{127, 1, 0, 0}, false, new byte[]{1}, objArr11);
                                            zEquals2 = line2.equals((String) objArr11[0]);
                                            fileReader2.close();
                                            bufferedReader2.close();
                                            int i61 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
                                            i13 = i61 % 128;
                                            TuitionPaymentFragmentbindingInflater1 = i13;
                                            int i62 = i61 % 2;
                                            if (zEquals2) {
                                                int i63 = (i13 ^ 35) + ((i13 & 35) << 1);
                                                i14 = i63 % 128;
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i14;
                                                int i64 = i63 % 2;
                                                if (line != null) {
                                                    int i65 = (i14 & 83) + (i14 | 83);
                                                    TuitionPaymentFragmentbindingInflater1 = i65 % 128;
                                                    int i66 = i65 % 2;
                                                    int i67 = (i & (-21)) | ((~i) & 20);
                                                    int i68 = i14 + 31;
                                                    TuitionPaymentFragmentbindingInflater1 = i68 % 128;
                                                    int i69 = i68 % 2;
                                                    ((int[]) objArr[0])[0] = i67;
                                                    objArr = new Object[]{new int[1], new String[]{line}};
                                                }
                                            }
                                        } catch (Throwable th) {
                                            fileReader2.close();
                                            bufferedReader2.close();
                                            throw th;
                                        }
                                    }
                                }
                                int i70 = ((int[]) objArr[0])[0];
                                int i71 = (~i54) & i;
                                i8 = ~i;
                                int i72 = i71 | (i54 & i8);
                                int i73 = -i72;
                                int i74 = ((i72 & i73) | (i72 ^ i73)) >> 31;
                                int i75 = (~i74) & i70;
                                int i76 = i54 & i74;
                                int i77 = (i76 & i75) | (i75 ^ i76);
                                String[] strArr2 = (String[]) objArr[1];
                                Object[] objArr12 = new Object[2];
                                int i78 = (i70 | i) & (~(i & i70));
                                int i79 = ((i78 | (-i78)) >> 31) & 1;
                                int i80 = -i79;
                                int i81 = (~(((i80 & i79) | (i79 ^ i80)) >> 31)) & 1;
                                objArr12[i79] = null;
                                objArr12[i81] = strArr2;
                                String[] strArr3 = (String[]) objArr12[0];
                                onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                int i82 = (~(i & i77)) & (i | i77);
                                int i83 = -i82;
                                ((int[]) objArr2[0])[0] = i;
                                objArr2 = new Object[]{new int[1], new int[1], new int[]{i77}, strArr3};
                                int i84 = 1358105862 + (((~((-979215908) | i8)) | 938905678) * (-865)) + ((~(i | 979215907)) * 865) + (((~(979215907 | i8)) | (~(938905678 | i8))) * 865);
                                int i85 = -(-((((i82 & i83) | (i82 ^ i83)) >> 31) & 16));
                                int i86 = ((i84 | i85) << 1) - (i85 ^ i84);
                                int i87 = (i86 * (-589)) + (i2 * 591);
                                int i88 = ~i2;
                                i9 = ~i;
                                int i89 = ~((i88 ^ i9) | (i88 & i9));
                                int i90 = ~((i88 ^ i86) | (i88 & i86));
                                int i91 = (i89 & i90) | (i89 ^ i90);
                                int i92 = ~((i9 ^ i86) | (i9 & i86));
                                int i93 = (i91 & i92) | (i91 ^ i92);
                                int i94 = ~i86;
                                int i95 = (i94 & i2) | (i94 ^ i2);
                                int i96 = -(-(((~((i & i95) | (i95 ^ i))) | i93) * 590));
                                int i97 = ((i87 | i96) << 1) - (i87 ^ i96);
                                int i98 = (~(i88 | i8)) | (~((i88 ^ i86) | (i88 & i86)));
                                int i99 = ~((i8 ^ i86) | (i8 & i86));
                                i10 = (i97 - (~(-(-(((i98 & i99) | (i98 ^ i99)) * (-1180)))))) - 1;
                                int i100 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i101 = (i100 & 25) + (i100 | 25);
                                TuitionPaymentFragmentbindingInflater1 = i101 % 128;
                                i11 = i101 % 2;
                                i12 = ~i86;
                                if (i11 == 0) {
                                    int i102 = i10 >> (590 / ((~((i12 & i9) | (i12 ^ i9))) | (~((i8 ^ i2) | (i2 & i8)))));
                                    int i103 = i102 >>> 116;
                                    int i104 = ((~i102) & i103) | ((~i103) & i102);
                                    int i105 = (i104 ^ (-23)) + ((i104 & (-23)) << 1);
                                    int i106 = (i104 | i105) & (~(i104 & i105));
                                    ((int[]) objArr2[1])[0] = i106 ^ (i106 % 3);
                                } else {
                                    int i107 = i10 + (((~((i12 & i9) | (i12 ^ i9))) | (~((i8 ^ i2) | (i2 & i8)))) * 590);
                                    int i108 = i107 << 13;
                                    int i109 = (i108 | i107) & (~(i107 & i108));
                                    int i110 = i109 ^ (i109 >>> 17);
                                    ((int[]) objArr2[1])[0] = i110 ^ (i110 << 5);
                                }
                                return objArr2;
                            }
                            fileReader = new FileReader(file);
                            bufferedReader = new BufferedReader(fileReader);
                            try {
                                String line3 = bufferedReader.readLine();
                                Object[] objArr13 = new Object[1];
                                g(new int[]{127, 1, 0, 0}, false, new byte[]{1}, objArr13);
                                zEquals = line3.equals((String) objArr13[0]);
                                fileReader.close();
                                bufferedReader.close();
                                int i111 = TuitionPaymentFragmentbindingInflater1 + 103;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i111 % 128;
                                int i112 = i111 % 2;
                                if (zEquals) {
                                    Object[] objArr14 = new Object[1];
                                    g(new int[]{128, 36, 0, 0}, true, new byte[]{0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0}, objArr14);
                                    file2 = new File((String) objArr14[0]);
                                    if (!file2.canRead()) {
                                        fileReader2 = new FileReader(file2);
                                        bufferedReader2 = new BufferedReader(fileReader2);
                                        String line4 = bufferedReader2.readLine();
                                        Object[] objArr15 = new Object[1];
                                        g(new int[]{127, 1, 0, 0}, false, new byte[]{1}, objArr15);
                                        zEquals2 = line4.equals((String) objArr15[0]);
                                        fileReader2.close();
                                        bufferedReader2.close();
                                        int i610 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
                                        i13 = i610 % 128;
                                        TuitionPaymentFragmentbindingInflater1 = i13;
                                        int i611 = i610 % 2;
                                        if (zEquals2) {
                                            int i612 = (i13 ^ 35) + ((i13 & 35) << 1);
                                            i14 = i612 % 128;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i14;
                                            int i613 = i612 % 2;
                                            if (line != null) {
                                                int i614 = (i14 & 83) + (i14 | 83);
                                                TuitionPaymentFragmentbindingInflater1 = i614 % 128;
                                                int i615 = i614 % 2;
                                                int i616 = (i & (-21)) | ((~i) & 20);
                                                int i617 = i14 + 31;
                                                TuitionPaymentFragmentbindingInflater1 = i617 % 128;
                                                int i618 = i617 % 2;
                                                ((int[]) objArr[0])[0] = i616;
                                                objArr = new Object[]{new int[1], new String[]{line}};
                                            }
                                        }
                                    }
                                }
                                int i710 = ((int[]) objArr[0])[0];
                                int i711 = (~i54) & i;
                                i8 = ~i;
                                int i712 = i711 | (i54 & i8);
                                int i713 = -i712;
                                int i714 = ((i712 & i713) | (i712 ^ i713)) >> 31;
                                int i715 = (~i714) & i710;
                                int i716 = i54 & i714;
                                int i717 = (i716 & i715) | (i715 ^ i716);
                                String[] strArr4 = (String[]) objArr[1];
                                Object[] objArr16 = new Object[2];
                                int i718 = (i710 | i) & (~(i & i710));
                                int i719 = ((i718 | (-i718)) >> 31) & 1;
                                int i810 = -i719;
                                int i811 = (~(((i810 & i719) | (i719 ^ i810)) >> 31)) & 1;
                                objArr16[i719] = null;
                                objArr16[i811] = strArr4;
                                String[] strArr5 = (String[]) objArr16[0];
                                onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                int i812 = (~(i & i717)) & (i | i717);
                                int i813 = -i812;
                                ((int[]) objArr2[0])[0] = i;
                                objArr2 = new Object[]{new int[1], new int[1], new int[]{i717}, strArr5};
                                int i814 = 1358105862 + (((~((-979215908) | i8)) | 938905678) * (-865)) + ((~(i | 979215907)) * 865) + (((~(979215907 | i8)) | (~(938905678 | i8))) * 865);
                                int i815 = -(-((((i812 & i813) | (i812 ^ i813)) >> 31) & 16));
                                int i816 = ((i814 | i815) << 1) - (i815 ^ i814);
                                int i817 = (i816 * (-589)) + (i2 * 591);
                                int i818 = ~i2;
                                i9 = ~i;
                                int i819 = ~((i818 ^ i9) | (i818 & i9));
                                int i910 = ~((i818 ^ i816) | (i818 & i816));
                                int i911 = (i819 & i910) | (i819 ^ i910);
                                int i912 = ~((i9 ^ i816) | (i9 & i816));
                                int i913 = (i911 & i912) | (i911 ^ i912);
                                int i914 = ~i816;
                                int i915 = (i914 & i2) | (i914 ^ i2);
                                int i916 = -(-(((~((i & i915) | (i915 ^ i))) | i913) * 590));
                                int i917 = ((i817 | i916) << 1) - (i817 ^ i916);
                                int i918 = (~(i818 | i8)) | (~((i818 ^ i816) | (i818 & i816)));
                                int i919 = ~((i8 ^ i816) | (i8 & i816));
                                i10 = (i917 - (~(-(-(((i918 & i919) | (i918 ^ i919)) * (-1180)))))) - 1;
                                int i1010 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i1011 = (i1010 & 25) + (i1010 | 25);
                                TuitionPaymentFragmentbindingInflater1 = i1011 % 128;
                                i11 = i1011 % 2;
                                i12 = ~i816;
                                if (i11 == 0) {
                                    int i1012 = i10 >> (590 / ((~((i12 & i9) | (i12 ^ i9))) | (~((i8 ^ i2) | (i2 & i8)))));
                                    int i1013 = i1012 >>> 116;
                                    int i1014 = ((~i1012) & i1013) | ((~i1013) & i1012);
                                    int i1015 = (i1014 ^ (-23)) + ((i1014 & (-23)) << 1);
                                    int i1016 = (i1014 | i1015) & (~(i1014 & i1015));
                                    ((int[]) objArr2[1])[0] = i1016 ^ (i1016 % 3);
                                } else {
                                    int i1017 = i10 + (((~((i12 & i9) | (i12 ^ i9))) | (~((i8 ^ i2) | (i2 & i8)))) * 590);
                                    int i1018 = i1017 << 13;
                                    int i1019 = (i1018 | i1017) & (~(i1017 & i1018));
                                    int i113 = i1019 ^ (i1019 >>> 17);
                                    ((int[]) objArr2[1])[0] = i113 ^ (i113 << 5);
                                }
                                return objArr2;
                            } catch (Throwable th2) {
                                fileReader.close();
                                bufferedReader.close();
                                throw th2;
                            }
                            objArr = new Object[]{new int[]{i}, new String[0]};
                            int i114 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 123;
                            TuitionPaymentFragmentbindingInflater1 = i114 % 128;
                            int i115 = i114 % 2;
                            int i7110 = ((int[]) objArr[0])[0];
                            int i7111 = (~i54) & i;
                            i8 = ~i;
                            int i7112 = i7111 | (i54 & i8);
                            int i7113 = -i7112;
                            int i7114 = ((i7112 & i7113) | (i7112 ^ i7113)) >> 31;
                            int i7115 = (~i7114) & i7110;
                            int i7116 = i54 & i7114;
                            int i7117 = (i7116 & i7115) | (i7115 ^ i7116);
                            String[] strArr6 = (String[]) objArr[1];
                            Object[] objArr17 = new Object[2];
                            int i7118 = (i7110 | i) & (~(i & i7110));
                            int i7119 = ((i7118 | (-i7118)) >> 31) & 1;
                            int i8110 = -i7119;
                            int i8111 = (~(((i8110 & i7119) | (i7119 ^ i8110)) >> 31)) & 1;
                            objArr17[i7119] = null;
                            objArr17[i8111] = strArr6;
                            String[] strArr7 = (String[]) objArr17[0];
                            onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i8112 = (~(i & i7117)) & (i | i7117);
                            int i8113 = -i8112;
                            ((int[]) objArr2[0])[0] = i;
                            objArr2 = new Object[]{new int[1], new int[1], new int[]{i7117}, strArr7};
                            int i8114 = 1358105862 + (((~((-979215908) | i8)) | 938905678) * (-865)) + ((~(i | 979215907)) * 865) + (((~(979215907 | i8)) | (~(938905678 | i8))) * 865);
                            int i8115 = -(-((((i8112 & i8113) | (i8112 ^ i8113)) >> 31) & 16));
                            int i8116 = ((i8114 | i8115) << 1) - (i8115 ^ i8114);
                            int i8117 = (i8116 * (-589)) + (i2 * 591);
                            int i8118 = ~i2;
                            i9 = ~i;
                            int i8119 = ~((i8118 ^ i9) | (i8118 & i9));
                            int i9110 = ~((i8118 ^ i8116) | (i8118 & i8116));
                            int i9111 = (i8119 & i9110) | (i8119 ^ i9110);
                            int i9112 = ~((i9 ^ i8116) | (i9 & i8116));
                            int i9113 = (i9111 & i9112) | (i9111 ^ i9112);
                            int i9114 = ~i8116;
                            int i9115 = (i9114 & i2) | (i9114 ^ i2);
                            int i9116 = -(-(((~((i & i9115) | (i9115 ^ i))) | i9113) * 590));
                            int i9117 = ((i8117 | i9116) << 1) - (i8117 ^ i9116);
                            int i9118 = (~(i8118 | i8)) | (~((i8118 ^ i8116) | (i8118 & i8116)));
                            int i9119 = ~((i8 ^ i8116) | (i8 & i8116));
                            i10 = (i9117 - (~(-(-(((i9118 & i9119) | (i9118 ^ i9119)) * (-1180)))))) - 1;
                            int i10110 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i10111 = (i10110 & 25) + (i10110 | 25);
                            TuitionPaymentFragmentbindingInflater1 = i10111 % 128;
                            i11 = i10111 % 2;
                            i12 = ~i8116;
                            if (i11 == 0) {
                                int i10112 = i10 >> (590 / ((~((i12 & i9) | (i12 ^ i9))) | (~((i8 ^ i2) | (i2 & i8)))));
                                int i10113 = i10112 >>> 116;
                                int i10114 = ((~i10112) & i10113) | ((~i10113) & i10112);
                                int i10115 = (i10114 ^ (-23)) + ((i10114 & (-23)) << 1);
                                int i10116 = (i10114 | i10115) & (~(i10114 & i10115));
                                ((int[]) objArr2[1])[0] = i10116 ^ (i10116 % 3);
                            } else {
                                int i10117 = i10 + (((~((i12 & i9) | (i12 ^ i9))) | (~((i8 ^ i2) | (i2 & i8)))) * 590);
                                int i10118 = i10117 << 13;
                                int i10119 = (i10118 | i10117) & (~(i10117 & i10118));
                                int i116 = i10119 ^ (i10119 >>> 17);
                                ((int[]) objArr2[1])[0] = i116 ^ (i116 << 5);
                            }
                            return objArr2;
                        } catch (Throwable th3) {
                            fileReader3.close();
                            bufferedReader3.close();
                            throw th3;
                        }
                    }
                    int i117 = TuitionPaymentFragmentbindingInflater1;
                    int i118 = (i117 & 43) + (i117 | 43);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i118 % 128;
                    int i119 = i118 % 2;
                    int i120 = i117 + 55;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i120 % 128;
                    int i121 = i120 % 2;
                    Object[] objArr18 = new Object[1];
                    g(new int[]{96, 31, 0, 10}, false, new byte[]{1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1}, objArr18);
                    file = new File((String) objArr18[0]);
                    if (!file.canRead()) {
                        int i619 = TuitionPaymentFragmentbindingInflater1;
                        i15 = (i619 ^ 103) + ((i619 & 103) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i15 % 128;
                        if (i15 % 2 != 0) {
                            Object[] objArr19 = new Object[1];
                            g(new int[]{128, 36, 0, 0}, true, new byte[]{0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0}, objArr19);
                            file2 = new File((String) objArr19[0]);
                            if (!file2.canRead()) {
                                fileReader2 = new FileReader(file2);
                                bufferedReader2 = new BufferedReader(fileReader2);
                                String line5 = bufferedReader2.readLine();
                                Object[] objArr110 = new Object[1];
                                g(new int[]{127, 1, 0, 0}, false, new byte[]{1}, objArr110);
                                zEquals2 = line5.equals((String) objArr110[0]);
                                fileReader2.close();
                                bufferedReader2.close();
                                int i6110 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
                                i13 = i6110 % 128;
                                TuitionPaymentFragmentbindingInflater1 = i13;
                                int i6111 = i6110 % 2;
                                if (zEquals2) {
                                    int i6112 = (i13 ^ 35) + ((i13 & 35) << 1);
                                    i14 = i6112 % 128;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i14;
                                    int i6113 = i6112 % 2;
                                    if (line != null) {
                                        int i6114 = (i14 & 83) + (i14 | 83);
                                        TuitionPaymentFragmentbindingInflater1 = i6114 % 128;
                                        int i6115 = i6114 % 2;
                                        int i6116 = (i & (-21)) | ((~i) & 20);
                                        int i6117 = i14 + 31;
                                        TuitionPaymentFragmentbindingInflater1 = i6117 % 128;
                                        int i6118 = i6117 % 2;
                                        ((int[]) objArr[0])[0] = i6116;
                                        objArr = new Object[]{new int[1], new String[]{line}};
                                    }
                                }
                            }
                        }
                        int i71110 = ((int[]) objArr[0])[0];
                        int i71111 = (~i54) & i;
                        i8 = ~i;
                        int i71112 = i71111 | (i54 & i8);
                        int i71113 = -i71112;
                        int i71114 = ((i71112 & i71113) | (i71112 ^ i71113)) >> 31;
                        int i71115 = (~i71114) & i71110;
                        int i71116 = i54 & i71114;
                        int i71117 = (i71116 & i71115) | (i71115 ^ i71116);
                        String[] strArr8 = (String[]) objArr[1];
                        Object[] objArr111 = new Object[2];
                        int i71118 = (i71110 | i) & (~(i & i71110));
                        int i71119 = ((i71118 | (-i71118)) >> 31) & 1;
                        int i81110 = -i71119;
                        int i81111 = (~(((i81110 & i71119) | (i71119 ^ i81110)) >> 31)) & 1;
                        objArr111[i71119] = null;
                        objArr111[i81111] = strArr8;
                        String[] strArr9 = (String[]) objArr111[0];
                        onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i81112 = (~(i & i71117)) & (i | i71117);
                        int i81113 = -i81112;
                        ((int[]) objArr2[0])[0] = i;
                        objArr2 = new Object[]{new int[1], new int[1], new int[]{i71117}, strArr9};
                        int i81114 = 1358105862 + (((~((-979215908) | i8)) | 938905678) * (-865)) + ((~(i | 979215907)) * 865) + (((~(979215907 | i8)) | (~(938905678 | i8))) * 865);
                        int i81115 = -(-((((i81112 & i81113) | (i81112 ^ i81113)) >> 31) & 16));
                        int i81116 = ((i81114 | i81115) << 1) - (i81115 ^ i81114);
                        int i81117 = (i81116 * (-589)) + (i2 * 591);
                        int i81118 = ~i2;
                        i9 = ~i;
                        int i81119 = ~((i81118 ^ i9) | (i81118 & i9));
                        int i91110 = ~((i81118 ^ i81116) | (i81118 & i81116));
                        int i91111 = (i81119 & i91110) | (i81119 ^ i91110);
                        int i91112 = ~((i9 ^ i81116) | (i9 & i81116));
                        int i91113 = (i91111 & i91112) | (i91111 ^ i91112);
                        int i91114 = ~i81116;
                        int i91115 = (i91114 & i2) | (i91114 ^ i2);
                        int i91116 = -(-(((~((i & i91115) | (i91115 ^ i))) | i91113) * 590));
                        int i91117 = ((i81117 | i91116) << 1) - (i81117 ^ i91116);
                        int i91118 = (~(i81118 | i8)) | (~((i81118 ^ i81116) | (i81118 & i81116)));
                        int i91119 = ~((i8 ^ i81116) | (i8 & i81116));
                        i10 = (i91117 - (~(-(-(((i91118 & i91119) | (i91118 ^ i91119)) * (-1180)))))) - 1;
                        int i101110 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i101111 = (i101110 & 25) + (i101110 | 25);
                        TuitionPaymentFragmentbindingInflater1 = i101111 % 128;
                        i11 = i101111 % 2;
                        i12 = ~i81116;
                        if (i11 == 0) {
                            int i101112 = i10 >> (590 / ((~((i12 & i9) | (i12 ^ i9))) | (~((i8 ^ i2) | (i2 & i8)))));
                            int i101113 = i101112 >>> 116;
                            int i101114 = ((~i101112) & i101113) | ((~i101113) & i101112);
                            int i101115 = (i101114 ^ (-23)) + ((i101114 & (-23)) << 1);
                            int i101116 = (i101114 | i101115) & (~(i101114 & i101115));
                            ((int[]) objArr2[1])[0] = i101116 ^ (i101116 % 3);
                        } else {
                            int i101117 = i10 + (((~((i12 & i9) | (i12 ^ i9))) | (~((i8 ^ i2) | (i2 & i8)))) * 590);
                            int i101118 = i101117 << 13;
                            int i101119 = (i101118 | i101117) & (~(i101117 & i101118));
                            int i1110 = i101119 ^ (i101119 >>> 17);
                            ((int[]) objArr2[1])[0] = i1110 ^ (i1110 << 5);
                        }
                        return objArr2;
                    }
                    fileReader = new FileReader(file);
                    bufferedReader = new BufferedReader(fileReader);
                    String line6 = bufferedReader.readLine();
                    Object[] objArr112 = new Object[1];
                    g(new int[]{127, 1, 0, 0}, false, new byte[]{1}, objArr112);
                    zEquals = line6.equals((String) objArr112[0]);
                    fileReader.close();
                    bufferedReader.close();
                    int i1111 = TuitionPaymentFragmentbindingInflater1 + 103;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1111 % 128;
                    int i1112 = i1111 % 2;
                    if (zEquals) {
                        Object[] objArr113 = new Object[1];
                        g(new int[]{128, 36, 0, 0}, true, new byte[]{0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0}, objArr113);
                        file2 = new File((String) objArr113[0]);
                        if (!file2.canRead()) {
                            fileReader2 = new FileReader(file2);
                            bufferedReader2 = new BufferedReader(fileReader2);
                            String line7 = bufferedReader2.readLine();
                            Object[] objArr114 = new Object[1];
                            g(new int[]{127, 1, 0, 0}, false, new byte[]{1}, objArr114);
                            zEquals2 = line7.equals((String) objArr114[0]);
                            fileReader2.close();
                            bufferedReader2.close();
                            int i6119 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
                            i13 = i6119 % 128;
                            TuitionPaymentFragmentbindingInflater1 = i13;
                            int i61110 = i6119 % 2;
                            if (zEquals2) {
                                int i61111 = (i13 ^ 35) + ((i13 & 35) << 1);
                                i14 = i61111 % 128;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i14;
                                int i61112 = i61111 % 2;
                                if (line != null) {
                                    int i61113 = (i14 & 83) + (i14 | 83);
                                    TuitionPaymentFragmentbindingInflater1 = i61113 % 128;
                                    int i61114 = i61113 % 2;
                                    int i61115 = (i & (-21)) | ((~i) & 20);
                                    int i61116 = i14 + 31;
                                    TuitionPaymentFragmentbindingInflater1 = i61116 % 128;
                                    int i61117 = i61116 % 2;
                                    ((int[]) objArr[0])[0] = i61115;
                                    objArr = new Object[]{new int[1], new String[]{line}};
                                }
                            }
                        }
                    }
                    int i711110 = ((int[]) objArr[0])[0];
                    int i711111 = (~i54) & i;
                    i8 = ~i;
                    int i711112 = i711111 | (i54 & i8);
                    int i711113 = -i711112;
                    int i711114 = ((i711112 & i711113) | (i711112 ^ i711113)) >> 31;
                    int i711115 = (~i711114) & i711110;
                    int i711116 = i54 & i711114;
                    int i711117 = (i711116 & i711115) | (i711115 ^ i711116);
                    String[] strArr10 = (String[]) objArr[1];
                    Object[] objArr115 = new Object[2];
                    int i711118 = (i711110 | i) & (~(i & i711110));
                    int i711119 = ((i711118 | (-i711118)) >> 31) & 1;
                    int i811110 = -i711119;
                    int i811111 = (~(((i811110 & i711119) | (i711119 ^ i811110)) >> 31)) & 1;
                    objArr115[i711119] = null;
                    objArr115[i811111] = strArr10;
                    String[] strArr11 = (String[]) objArr115[0];
                    onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i811112 = (~(i & i711117)) & (i | i711117);
                    int i811113 = -i811112;
                    ((int[]) objArr2[0])[0] = i;
                    objArr2 = new Object[]{new int[1], new int[1], new int[]{i711117}, strArr11};
                    int i811114 = 1358105862 + (((~((-979215908) | i8)) | 938905678) * (-865)) + ((~(i | 979215907)) * 865) + (((~(979215907 | i8)) | (~(938905678 | i8))) * 865);
                    int i811115 = -(-((((i811112 & i811113) | (i811112 ^ i811113)) >> 31) & 16));
                    int i811116 = ((i811114 | i811115) << 1) - (i811115 ^ i811114);
                    int i811117 = (i811116 * (-589)) + (i2 * 591);
                    int i811118 = ~i2;
                    i9 = ~i;
                    int i811119 = ~((i811118 ^ i9) | (i811118 & i9));
                    int i911110 = ~((i811118 ^ i811116) | (i811118 & i811116));
                    int i911111 = (i811119 & i911110) | (i811119 ^ i911110);
                    int i911112 = ~((i9 ^ i811116) | (i9 & i811116));
                    int i911113 = (i911111 & i911112) | (i911111 ^ i911112);
                    int i911114 = ~i811116;
                    int i911115 = (i911114 & i2) | (i911114 ^ i2);
                    int i911116 = -(-(((~((i & i911115) | (i911115 ^ i))) | i911113) * 590));
                    int i911117 = ((i811117 | i911116) << 1) - (i811117 ^ i911116);
                    int i911118 = (~(i811118 | i8)) | (~((i811118 ^ i811116) | (i811118 & i811116)));
                    int i911119 = ~((i8 ^ i811116) | (i8 & i811116));
                    i10 = (i911117 - (~(-(-(((i911118 & i911119) | (i911118 ^ i911119)) * (-1180)))))) - 1;
                    int i1011110 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i1011111 = (i1011110 & 25) + (i1011110 | 25);
                    TuitionPaymentFragmentbindingInflater1 = i1011111 % 128;
                    i11 = i1011111 % 2;
                    i12 = ~i811116;
                    if (i11 == 0) {
                        int i1011112 = i10 >> (590 / ((~((i12 & i9) | (i12 ^ i9))) | (~((i8 ^ i2) | (i2 & i8)))));
                        int i1011113 = i1011112 >>> 116;
                        int i1011114 = ((~i1011112) & i1011113) | ((~i1011113) & i1011112);
                        int i1011115 = (i1011114 ^ (-23)) + ((i1011114 & (-23)) << 1);
                        int i1011116 = (i1011114 | i1011115) & (~(i1011114 & i1011115));
                        ((int[]) objArr2[1])[0] = i1011116 ^ (i1011116 % 3);
                    } else {
                        int i1011117 = i10 + (((~((i12 & i9) | (i12 ^ i9))) | (~((i8 ^ i2) | (i2 & i8)))) * 590);
                        int i1011118 = i1011117 << 13;
                        int i1011119 = (i1011118 | i1011117) & (~(i1011117 & i1011118));
                        int i1113 = i1011119 ^ (i1011119 >>> 17);
                        ((int[]) objArr2[1])[0] = i1113 ^ (i1113 << 5);
                    }
                    return objArr2;
                } catch (Exception unused2) {
                }
            } catch (Exception unused3) {
            }
            line = null;
            objArr = new Object[]{new int[]{i}, new String[0]};
            int i1114 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 123;
            TuitionPaymentFragmentbindingInflater1 = i1114 % 128;
            int i1115 = i1114 % 2;
            int i7111110 = ((int[]) objArr[0])[0];
            int i7111111 = (~i54) & i;
            i8 = ~i;
            int i7111112 = i7111111 | (i54 & i8);
            int i7111113 = -i7111112;
            int i7111114 = ((i7111112 & i7111113) | (i7111112 ^ i7111113)) >> 31;
            int i7111115 = (~i7111114) & i7111110;
            int i7111116 = i54 & i7111114;
            int i7111117 = (i7111116 & i7111115) | (i7111115 ^ i7111116);
            String[] strArr12 = (String[]) objArr[1];
            Object[] objArr116 = new Object[2];
            int i7111118 = (i7111110 | i) & (~(i & i7111110));
            int i7111119 = ((i7111118 | (-i7111118)) >> 31) & 1;
            int i8111110 = -i7111119;
            int i8111111 = (~(((i8111110 & i7111119) | (i7111119 ^ i8111110)) >> 31)) & 1;
            objArr116[i7111119] = null;
            objArr116[i8111111] = strArr12;
            String[] strArr13 = (String[]) objArr116[0];
            onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int i8111112 = (~(i & i7111117)) & (i | i7111117);
            int i8111113 = -i8111112;
            ((int[]) objArr2[0])[0] = i;
            objArr2 = new Object[]{new int[1], new int[1], new int[]{i7111117}, strArr13};
            int i8111114 = 1358105862 + (((~((-979215908) | i8)) | 938905678) * (-865)) + ((~(i | 979215907)) * 865) + (((~(979215907 | i8)) | (~(938905678 | i8))) * 865);
            int i8111115 = -(-((((i8111112 & i8111113) | (i8111112 ^ i8111113)) >> 31) & 16));
            int i8111116 = ((i8111114 | i8111115) << 1) - (i8111115 ^ i8111114);
            int i8111117 = (i8111116 * (-589)) + (i2 * 591);
            int i8111118 = ~i2;
            i9 = ~i;
            int i8111119 = ~((i8111118 ^ i9) | (i8111118 & i9));
            int i9111110 = ~((i8111118 ^ i8111116) | (i8111118 & i8111116));
            int i9111111 = (i8111119 & i9111110) | (i8111119 ^ i9111110);
            int i9111112 = ~((i9 ^ i8111116) | (i9 & i8111116));
            int i9111113 = (i9111111 & i9111112) | (i9111111 ^ i9111112);
            int i9111114 = ~i8111116;
            int i9111115 = (i9111114 & i2) | (i9111114 ^ i2);
            int i9111116 = -(-(((~((i & i9111115) | (i9111115 ^ i))) | i9111113) * 590));
            int i9111117 = ((i8111117 | i9111116) << 1) - (i8111117 ^ i9111116);
            int i9111118 = (~(i8111118 | i8)) | (~((i8111118 ^ i8111116) | (i8111118 & i8111116)));
            int i9111119 = ~((i8 ^ i8111116) | (i8 & i8111116));
            i10 = (i9111117 - (~(-(-(((i9111118 & i9111119) | (i9111118 ^ i9111119)) * (-1180)))))) - 1;
            int i10111110 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i10111111 = (i10111110 & 25) + (i10111110 | 25);
            TuitionPaymentFragmentbindingInflater1 = i10111111 % 128;
            i11 = i10111111 % 2;
            i12 = ~i8111116;
            if (i11 == 0) {
                int i10111112 = i10 >> (590 / ((~((i12 & i9) | (i12 ^ i9))) | (~((i8 ^ i2) | (i2 & i8)))));
                int i10111113 = i10111112 >>> 116;
                int i10111114 = ((~i10111112) & i10111113) | ((~i10111113) & i10111112);
                int i10111115 = (i10111114 ^ (-23)) + ((i10111114 & (-23)) << 1);
                int i10111116 = (i10111114 | i10111115) & (~(i10111114 & i10111115));
                ((int[]) objArr2[1])[0] = i10111116 ^ (i10111116 % 3);
            } else {
                int i10111117 = i10 + (((~((i12 & i9) | (i12 ^ i9))) | (~((i8 ^ i2) | (i2 & i8)))) * 590);
                int i10111118 = i10111117 << 13;
                int i10111119 = (i10111118 | i10111117) & (~(i10111117 & i10111118));
                int i1116 = i10111119 ^ (i10111119 >>> 17);
                ((int[]) objArr2[1])[0] = i1116 ^ (i1116 << 5);
            }
            return objArr2;
        } catch (Throwable th4) {
            Throwable cause = th4.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(short r6, byte r7, byte r8) {
        /*
            byte[] r0 = id.vida.algos.luma.LuminanceResult.$$c
            int r7 = r7 * 2
            int r7 = 3 - r7
            int r6 = r6 + 99
            int r8 = r8 * 4
            int r8 = 1 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2e
        L14:
            r3 = r2
        L15:
            r5 = r7
            r7 = r6
            r6 = r5
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = r6 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: id.vida.algos.luma.LuminanceResult.$$e(short, byte, byte):java.lang.String");
    }
}
