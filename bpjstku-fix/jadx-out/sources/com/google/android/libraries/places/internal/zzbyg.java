package com.google.android.libraries.places.internal;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import defpackage.initSession;
import defpackage.setVideoStabilizationMode;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Random;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbyg {
    int zza;
    private static final byte[] $$c = {48, -110, 22, 55};
    private static final int $$d = 242;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {88, ByteCompanionObject.MAX_VALUE, -112, -47};
    private static final int $$b = 3;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static char[] b = {59704, 59749, 59744, 59752, 59743, 59728, 59749, 59757, 59759, 59751, 59744, 59759, 59746, 59749, 59749, 59730, 59729, 59744, 59757, 59703, 59750, 59757, 59748, 59748, 59751, 59744, 59740, 59728, 59770, 59735, 59742, 59759, 59751, 59748, 59747, 59756, 59751, 59707, 59756, 59746, 59744, 59771, 59751, 59757, 59714, 59717, 59770, 59739, 59698, 59743, 59752, 59744, 59749, 59750, 59894, 59433, 59433, 59894, 59890, 59423, 59420, 59415, 59422, 59423, 59890, 59902, 59419, 59396, 59420, 59409, 59900, 59894, 59412, 59422, 59397, 59417, 59420, 59421, 59900, 59902, 59411, 59412, 59413, 59420, 59422, 59414, 59422, 59422, 59412, 59422, 59397, 59419, 59420, 59708, 59748, 59748, 59705, 59759, 59747, 59756, 59754, 59756, 59746, 59753, 59753, 59759, 59753, 59746, 59768, 59750, 59713, 59718, 59747, 59746, 59771, 59744, 59747, 59718, 59738, 59773, 59773, 59738, 59714, 59746, 59771, 59770, 59716, 59667, 59721, 59821, 59840, 59840, 59821, 59817, 59830, 59851, 59854, 59829, 59830, 59817, 59797, 59826, 59827, 59851, 59848, 59819, 59821, 59843, 59829, 59836, 59824, 59851, 59828, 59819, 59821, 59843, 59829, 59836, 59824, 59851, 59828, 59827, 59831, 59848};

    private static void c(int i, byte b2, short s, Object[] objArr) {
        int i2 = s + 4;
        int i3 = i * 2;
        int i4 = 98 - (b2 * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        int i6 = -1;
        if (bArr == null) {
            i4 += -i5;
        }
        while (true) {
            i6++;
            i2++;
            bArr2[i6] = (byte) i4;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i4 += -bArr[i2];
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        char[] cArr;
        char c;
        int i2 = 2;
        int i3 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i4 = 0;
        int i5 = iArr[0];
        int i6 = 1;
        int i7 = iArr[1];
        int i8 = iArr[2];
        int i9 = iArr[3];
        char[] cArr2 = b;
        int i10 = -1;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i11 = 0;
            while (i11 < length) {
                int i12 = $10 + 125;
                $11 = i12 % 128;
                int i13 = i12 % i2;
                try {
                    Object[] objArr2 = new Object[i6];
                    objArr2[i4] = Integer.valueOf(cArr2[i11]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char mode = (char) View.MeasureSpec.getMode(i4);
                        int iRed = 1270 - Color.red(i4);
                        int iIndexOf = 17 - TextUtils.indexOf((CharSequence) "", '0', i4, i4);
                        byte b2 = (byte) i10;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(mode, iRed, iIndexOf, 407021364, false, $$e((byte) 5, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i11] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i11++;
                    i2 = 2;
                    i4 = 0;
                    i6 = 1;
                    i10 = -1;
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
        char[] cArr4 = new char[i7];
        System.arraycopy(cArr2, i5, cArr4, 0, i7);
        if (bArr != null) {
            int i14 = $11 + 39;
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                cArr = new char[i7];
                c = 0;
                setvideostabilizationmode.b = 0;
            } else {
                cArr = new char[i7];
                setvideostabilizationmode.b = 0;
                c = 0;
            }
            while (setvideostabilizationmode.b < i7) {
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i15 = setvideostabilizationmode.b;
                    Object[] objArr3 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) (-1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.getCapsMode("", 0, 0), 3225 - View.combineMeasuredStates(0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 13, 2133916302, false, $$e((byte) 6, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i15] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    int i16 = $11 + 29;
                    $10 = i16 % 128;
                    int i17 = i16 % 2;
                } else {
                    int i18 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 29944);
                        int pressedStateDuration = 1755 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        int maximumFlingVelocity = 23 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        byte length2 = (byte) $$c.length;
                        byte b4 = (byte) (length2 - 5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSizeAndState, pressedStateDuration, maximumFlingVelocity, 387247676, false, $$e(length2, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i18] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                }
                c = cArr[setvideostabilizationmode.b];
                Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (41241 - Gravity.getAbsoluteGravity(0, 0)), 1705 - (ViewConfiguration.getTapTimeout() >> 16), 21 - (Process.myPid() >> 22), -1434471773, false, $$e(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            cArr4 = cArr;
        }
        if (i9 > 0) {
            int i19 = $10 + 91;
            $11 = i19 % 128;
            int i20 = i19 % 2;
            char[] cArr5 = new char[i7];
            i = 0;
            System.arraycopy(cArr4, 0, cArr5, 0, i7);
            int i21 = i7 - i9;
            System.arraycopy(cArr5, 0, cArr4, i21, i9);
            System.arraycopy(cArr5, i9, cArr4, 0, i21);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i7];
            while (true) {
                setvideostabilizationmode.b = i;
                if (setvideostabilizationmode.b >= i7) {
                    break;
                }
                cArr6[setvideostabilizationmode.b] = cArr4[(i7 - setvideostabilizationmode.b) - 1];
                i = setvideostabilizationmode.b + 1;
            }
            cArr4 = cArr6;
        }
        if (i8 > 0) {
            int i22 = $10 + 93;
            $11 = i22 % 128;
            int i23 = i22 % 2;
            int i24 = 0;
            while (true) {
                setvideostabilizationmode.b = i24;
                if (setvideostabilizationmode.b >= i7) {
                    break;
                }
                cArr4[setvideostabilizationmode.b] = (char) (cArr4[setvideostabilizationmode.b] - iArr[2]);
                i24 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr4);
    }

    private zzbyg() {
        throw null;
    }

    /* synthetic */ zzbyg(byte[] bArr) {
    }

    final boolean zza() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 115;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.zza <= 0) {
            return false;
        }
        int i4 = i2 + 9;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:18:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:21:0x0101  */
    /* JADX WARN: Code duplicated, block: B:65:0x036b A[Catch: Exception -> 0x0428, TryCatch #5 {Exception -> 0x0428, blocks: (B:50:0x02e7, B:65:0x036b, B:67:0x038e, B:69:0x03b3, B:83:0x0402, B:84:0x0408, B:55:0x0313, B:60:0x0353, B:63:0x0366, B:86:0x0418, B:90:0x0421, B:91:0x0427, B:57:0x032b, B:59:0x034f, B:68:0x0398), top: B:116:0x02e7, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x038e A[Catch: Exception -> 0x0428, TRY_LEAVE, TryCatch #5 {Exception -> 0x0428, blocks: (B:50:0x02e7, B:65:0x036b, B:67:0x038e, B:69:0x03b3, B:83:0x0402, B:84:0x0408, B:55:0x0313, B:60:0x0353, B:63:0x0366, B:86:0x0418, B:90:0x0421, B:91:0x0427, B:57:0x032b, B:59:0x034f, B:68:0x0398), top: B:116:0x02e7, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:73:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:75:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:76:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:79:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:80:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:81:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:85:0x0409  */
    /* JADX WARN: Code duplicated, block: B:96:0x0487  */
    /* JADX WARN: Code duplicated, block: B:97:0x04a7  */
    public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2) throws Throwable {
        int i3;
        String line;
        Object[] objArr;
        int i4;
        Object[] objArr2;
        int i5;
        int i6;
        int i7;
        File file;
        FileReader fileReader;
        BufferedReader bufferedReader;
        boolean zEquals;
        int i8;
        int i9;
        int i10;
        String[] strArr;
        int[] iArr;
        int i11;
        int[] iArr2;
        byte[] bArr;
        boolean z;
        String[] strArr2;
        int i12;
        int i13;
        int i14 = 2 % 2;
        int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3;
        TuitionPaymentFragmentbindingInflater1 = i15 % 128;
        try {
            if (i15 % 2 != 0) {
                strArr2 = new String[3];
                Object[] objArr3 = new Object[1];
                a(new int[]{0, 19, 0, 7}, true, new byte[]{1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0}, objArr3);
                strArr2[0] = (String) objArr3[0];
                Object[] objArr4 = new Object[1];
                a(new int[]{19, 18, 1, 0}, false, new byte[]{0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1}, objArr4);
                strArr2[0] = (String) objArr4[0];
            } else {
                Object[] objArr5 = new Object[1];
                a(new int[]{0, 19, 0, 7}, true, new byte[]{1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0}, objArr5);
                Object[] objArr6 = new Object[1];
                a(new int[]{19, 18, 1, 0}, false, new byte[]{0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1}, objArr6);
                strArr2 = new String[]{(String) objArr5[0], (String) objArr6[0]};
            }
            int i16 = 0;
            while (true) {
                if (i16 < 2) {
                    int i17 = TuitionPaymentFragmentbindingInflater1;
                    int i18 = ((i17 | 69) << 1) - (i17 ^ 69);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i18 % 128;
                    if (i18 % 2 == 0) {
                        String str = strArr2[i16];
                        Object[] objArr7 = new Object[1];
                        a(new int[]{37, 16, 0, 0}, true, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0}, objArr7);
                        Class<?> cls = Class.forName((String) objArr7[0]);
                        if (((Boolean) cls.getMethod(str, new Class[0]).invoke(cls, null)).booleanValue()) {
                            int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            i12 = (i19 ^ 37) + ((i19 & 37) << 1);
                            int i20 = i12 % 128;
                            TuitionPaymentFragmentbindingInflater1 = i20;
                            if (i12 % 2 != 0) {
                                i3 = (i & (-2)) | ((~i) & 1);
                            } else {
                                i3 = (~(i & 1)) & (i | 1);
                            }
                            i13 = (i20 & 43) + (i20 | 43);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i13 % 128;
                            if (i13 % 2 == 0) {
                                int i21 = 5 % 2;
                            }
                        } else {
                            int i22 = (i16 & (-110)) + (i16 | (-110));
                            i16 = ((i22 | 111) << 1) - (i22 ^ 111);
                        }
                    } else {
                        String str2 = strArr2[i16];
                        Object[] objArr8 = new Object[1];
                        a(new int[]{37, 16, 0, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0}, objArr8);
                        Class<?> cls2 = Class.forName((String) objArr8[0]);
                        if (((Boolean) cls2.getMethod(str2, new Class[0]).invoke(cls2, null)).booleanValue()) {
                            int i110 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            i12 = (i110 ^ 37) + ((i110 & 37) << 1);
                            int i23 = i12 % 128;
                            TuitionPaymentFragmentbindingInflater1 = i23;
                            if (i12 % 2 != 0) {
                                i3 = (i & (-2)) | ((~i) & 1);
                            } else {
                                i3 = (~(i & 1)) & (i | 1);
                            }
                            i13 = (i23 & 43) + (i23 | 43);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i13 % 128;
                            if (i13 % 2 == 0) {
                                int i24 = 5 % 2;
                            }
                        } else {
                            int i25 = (i16 & (-110)) + (i16 | (-110));
                            i16 = ((i25 | 111) << 1) - (i25 ^ 111);
                        }
                    }
                } else {
                    i3 = i;
                }
                try {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(109138771);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2418);
                        int offsetBefore = TextUtils.getOffsetBefore("", 0) + 2845;
                        int i26 = 6 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        byte b2 = (byte) ($$b - 3);
                        byte b3 = b2;
                        Object[] objArr9 = new Object[1];
                        c(b2, b3, (byte) (b3 - 1), objArr9);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, offsetBefore, i26, -501222268, false, (String) objArr9[0], new Class[0]);
                    }
                    long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
                    long j = 750225471;
                    long j2 = 628;
                    long j3 = (j2 * j) + (j2 * jLongValue);
                    long j4 = -627;
                    long jMaxMemory = (int) Runtime.getRuntime().maxMemory();
                    int i27 = i3;
                    long j5 = -1;
                    long j6 = j3 + ((jLongValue | jMaxMemory | (j ^ j5)) * j4) + (j4 * (j | (((jLongValue ^ j5) | jMaxMemory) ^ j5))) + (((long) 627) * ((j5 ^ (jMaxMemory | j)) | (((jMaxMemory ^ j5) | jLongValue) ^ j5))) + ((long) (-1909412157));
                    int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                    int i28 = ~iFreeMemory;
                    int i29 = ((int) (j6 >> 32)) & (1888326865 + (((~((-1003715890) | i28)) | 433510521) * (-602)) + (((~(iFreeMemory | (-1003715890))) | 433215537 | (~(1004010873 | i28))) * (-301)) + ((~(i28 | 433510521)) * 301));
                    int i30 = ~i;
                    int i31 = i29 | (((int) j6) & ((-742427639) + (((~(i30 | (-1774343699))) | 337117288) * 220) + (((~(373072109 | i30)) | (-1810298520)) * (-440)) + (((-1774343699) | i) * 220)));
                    int i32 = (i31 | 1) & (~(i31 & 1));
                    int i33 = (i32 | (-i32)) >> 31;
                    int i34 = ((i & (-11)) | (i30 & 10)) & (~i33);
                    int i35 = i33 & i;
                    int i36 = ((~i27) & i) | (i27 & i30);
                    int i37 = -i36;
                    int i38 = ((i36 & i37) | (i36 ^ i37)) >> 31;
                    int i39 = ((i35 & i34) | (i34 ^ i35)) & (~i38);
                    int i40 = i27 & i38;
                    int i41 = (i39 ^ i40) | (i39 & i40);
                    try {
                        Object[] objArr10 = new Object[1];
                        a(new int[]{53, 40, 172, 0}, false, new byte[]{1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1}, objArr10);
                        File file2 = new File((String) objArr10[0]);
                        if (file2.canRead()) {
                            FileReader fileReader2 = new FileReader(file2);
                            BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
                            int i42 = TuitionPaymentFragmentbindingInflater1;
                            int i43 = ((i42 | 91) << 1) - (i42 ^ 91);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i43 % 128;
                            try {
                                if (i43 % 2 == 0) {
                                    line = bufferedReader2.readLine();
                                    iArr2 = new int[]{93, 3, 0, 2};
                                    bArr = new byte[]{1, 1, 0};
                                    z = true;
                                } else {
                                    line = bufferedReader2.readLine();
                                    iArr2 = new int[]{93, 3, 0, 2};
                                    bArr = new byte[]{1, 1, 0};
                                    z = false;
                                }
                                Object[] objArr11 = new Object[1];
                                a(iArr2, z, bArr, objArr11);
                                if (!line.equals((String) objArr11[0])) {
                                    int i44 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int i45 = (i44 & 39) + (i44 | 39);
                                    TuitionPaymentFragmentbindingInflater1 = i45 % 128;
                                    int i46 = i45 % 2;
                                    fileReader2.close();
                                    bufferedReader2.close();
                                } else {
                                    fileReader2.close();
                                    bufferedReader2.close();
                                    int i47 = TuitionPaymentFragmentbindingInflater1 + 19;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i47 % 128;
                                    int i48 = i47 % 2;
                                    int i49 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int i50 = (i49 & 47) + (i49 | 47);
                                    TuitionPaymentFragmentbindingInflater1 = i50 % 128;
                                    int i51 = i50 % 2;
                                    line = null;
                                }
                            } catch (Throwable th) {
                                fileReader2.close();
                                bufferedReader2.close();
                                throw th;
                            }
                        } else {
                            line = null;
                        }
                    } catch (Exception unused) {
                    }
                    try {
                        Object[] objArr12 = new Object[1];
                        a(new int[]{96, 31, 0, 0}, true, new byte[]{0, 1, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1}, objArr12);
                        File file3 = new File((String) objArr12[0]);
                        if (!file3.canRead()) {
                            int i52 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 5;
                            TuitionPaymentFragmentbindingInflater1 = i52 % 128;
                            if (i52 % 2 != 0) {
                                Object[] objArr13 = new Object[1];
                                a(new int[]{128, 36, 85, 0}, false, new byte[]{0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1}, objArr13);
                                file = new File((String) objArr13[0]);
                                if (file.canRead()) {
                                    fileReader = new FileReader(file);
                                    bufferedReader = new BufferedReader(fileReader);
                                    try {
                                        String line2 = bufferedReader.readLine();
                                        Object[] objArr14 = new Object[1];
                                        a(new int[]{127, 1, 0, 0}, false, new byte[]{1}, objArr14);
                                        zEquals = line2.equals((String) objArr14[0]);
                                        fileReader.close();
                                        bufferedReader.close();
                                        if (zEquals) {
                                            i8 = TuitionPaymentFragmentbindingInflater1;
                                            int i53 = i8 + 1;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i53 % 128;
                                            int i54 = i53 % 2;
                                            if (line != null) {
                                                i9 = i8 + 119;
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
                                                if (i9 % 2 == 0) {
                                                    objArr = new Object[3];
                                                    objArr[0] = new int[1];
                                                } else {
                                                    objArr = new Object[2];
                                                    objArr[0] = new int[1];
                                                }
                                                i10 = (i & (-21)) | (i30 & 20);
                                                strArr = new String[]{line};
                                                iArr = (int[]) objArr[0];
                                                i11 = i8 + 71;
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
                                                if (i11 % 2 == 0) {
                                                    iArr[0] = i10;
                                                    objArr[1] = strArr;
                                                } else {
                                                    iArr[0] = i10;
                                                    objArr[1] = strArr;
                                                }
                                            } else {
                                                i7 = 2;
                                            }
                                        }
                                        objArr = new Object[i7];
                                        objArr[0] = new int[]{i};
                                        objArr[1] = new String[0];
                                    } catch (Throwable th2) {
                                        fileReader.close();
                                        bufferedReader.close();
                                        throw th2;
                                    }
                                } else {
                                    int i55 = TuitionPaymentFragmentbindingInflater1;
                                    int i56 = ((i55 | 5) << 1) - (i55 ^ 5);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i56 % 128;
                                    int i57 = i56 % 2;
                                }
                            }
                            int i58 = ((int[]) objArr[0])[0];
                            int i59 = (~(i & i41)) & (i | i41);
                            int i60 = (i59 | (-i59)) >> 31;
                            int i61 = (~i60) & i58;
                            int i62 = TuitionPaymentFragmentbindingInflater1;
                            int i63 = i62 + 9;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i63 % 128;
                            int i64 = i63 % 2;
                            int i65 = i41 & i60;
                            i4 = (i65 & i61) | (i61 ^ i65);
                            String[] strArr3 = (String[]) objArr[1];
                            Object[] objArr15 = new Object[2];
                            int i66 = i58 ^ i;
                            int i67 = -i66;
                            int i68 = (((i66 & i67) | (i66 ^ i67)) >> 31) & 1;
                            int i69 = -i68;
                            int i70 = (~(((i69 & i68) | (i68 ^ i69)) >> 31)) & 1;
                            objArr15[i68] = null;
                            objArr15[i70] = strArr3;
                            String[] strArr4 = (String[]) objArr15[0];
                            objArr2 = new Object[4];
                            i5 = (i62 ^ 71) + ((i62 & 71) << 1);
                            int i71 = i5 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i71;
                            if (i5 % 2 == 0) {
                                objArr2[0] = new int[1];
                                objArr2[1] = new int[0];
                                objArr2[4] = new int[1];
                                int i72 = (i30 & i4) | ((~i4) & i);
                                int i73 = -i72;
                                int i74 = ((i72 & i73) | (i72 ^ i73)) * 79;
                                int i75 = (~i74) & 1;
                                int i76 = i74 & 75;
                                i6 = (i76 & i75) | (i75 ^ i76);
                            } else {
                                objArr2[0] = new int[1];
                                objArr2[1] = new int[1];
                                objArr2[2] = new int[1];
                                int i77 = (~(i & i4)) & (i | i4);
                                int i78 = -i77;
                                i6 = (((i77 & i78) | (i77 ^ i78)) >> 31) & 16;
                            }
                            ((int[]) objArr2[0])[0] = i;
                            ((int[]) objArr2[2])[0] = i4;
                            objArr2[3] = strArr4;
                            int i79 = (i71 ^ 101) + ((i71 & 101) << 1);
                            TuitionPaymentFragmentbindingInflater1 = i79 % 128;
                            int i80 = i79 % 2;
                            int iNextInt = new Random().nextInt();
                            int i81 = ~iNextInt;
                            int i82 = ((((1035895876 + (((~(iNextInt | (-713520132))) | ((~((-73959897) | i81)) | 33649667)) * (-68))) + ((~((-679870465) | i81)) * (-68))) + (((~(713520131 | i81)) | (-753830361)) * 68)) - (~i6)) - 1;
                            int i83 = (i82 * 398) + (i2 * (-396));
                            int i84 = ~i82;
                            int i85 = ~i;
                            int i86 = ~((i84 ^ i85) | (i84 & i85));
                            int i87 = ~((i84 ^ i2) | (i84 & i2));
                            int i88 = ((~((i85 & i2) | (i85 ^ i2))) | (i86 & i87) | (i86 ^ i87)) * (-397);
                            int i89 = (i83 & i88) + (i83 | i88) + ((~((i84 ^ i2) | (i84 & i2))) * (-397));
                            int i90 = (~(i84 | i2)) | i;
                            int i91 = ~((~i2) | i82);
                            int i92 = (i89 - (~(((i90 & i91) | (i90 ^ i91)) * 397))) - 1;
                            int i93 = i92 << 13;
                            int i94 = (i93 | i92) & (~(i92 & i93));
                            int i95 = i94 ^ (i94 >>> 17);
                            ((int[]) objArr2[1])[0] = i95 ^ (i95 << 5);
                            return objArr2;
                        }
                        FileReader fileReader3 = new FileReader(file3);
                        BufferedReader bufferedReader3 = new BufferedReader(fileReader3);
                        int i96 = TuitionPaymentFragmentbindingInflater1;
                        int i97 = (i96 ^ 115) + ((i96 & 115) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i97 % 128;
                        int i98 = i97 % 2;
                        try {
                            String line3 = bufferedReader3.readLine();
                            Object[] objArr16 = new Object[1];
                            a(new int[]{127, 1, 0, 0}, false, new byte[]{1}, objArr16);
                            String str3 = (String) objArr16[0];
                            int i99 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i100 = (i99 & 49) + (i99 | 49);
                            TuitionPaymentFragmentbindingInflater1 = i100 % 128;
                            int i101 = i100 % 2;
                            boolean zEquals2 = line3.equals(str3);
                            fileReader3.close();
                            int i102 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i103 = (i102 ^ 11) + ((i102 & 11) << 1);
                            TuitionPaymentFragmentbindingInflater1 = i103 % 128;
                            if (i103 % 2 != 0) {
                                bufferedReader3.close();
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            bufferedReader3.close();
                            if (zEquals2) {
                                Object[] objArr17 = new Object[1];
                                a(new int[]{128, 36, 85, 0}, false, new byte[]{0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1}, objArr17);
                                file = new File((String) objArr17[0]);
                                if (file.canRead()) {
                                    fileReader = new FileReader(file);
                                    bufferedReader = new BufferedReader(fileReader);
                                    String line4 = bufferedReader.readLine();
                                    Object[] objArr18 = new Object[1];
                                    a(new int[]{127, 1, 0, 0}, false, new byte[]{1}, objArr18);
                                    zEquals = line4.equals((String) objArr18[0]);
                                    fileReader.close();
                                    bufferedReader.close();
                                    if (zEquals) {
                                        i8 = TuitionPaymentFragmentbindingInflater1;
                                        int i510 = i8 + 1;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i510 % 128;
                                        int i511 = i510 % 2;
                                        if (line != null) {
                                            i9 = i8 + 119;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
                                            if (i9 % 2 == 0) {
                                                objArr = new Object[3];
                                                objArr[0] = new int[1];
                                            } else {
                                                objArr = new Object[2];
                                                objArr[0] = new int[1];
                                            }
                                            i10 = (i & (-21)) | (i30 & 20);
                                            strArr = new String[]{line};
                                            iArr = (int[]) objArr[0];
                                            i11 = i8 + 71;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
                                            if (i11 % 2 == 0) {
                                                iArr[0] = i10;
                                                objArr[1] = strArr;
                                            } else {
                                                iArr[0] = i10;
                                                objArr[1] = strArr;
                                            }
                                        } else {
                                            i7 = 2;
                                        }
                                    }
                                    objArr = new Object[i7];
                                    objArr[0] = new int[]{i};
                                    objArr[1] = new String[0];
                                } else {
                                    int i512 = TuitionPaymentFragmentbindingInflater1;
                                    int i513 = ((i512 | 5) << 1) - (i512 ^ 5);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i513 % 128;
                                    int i514 = i513 % 2;
                                }
                            }
                            int i515 = ((int[]) objArr[0])[0];
                            int i516 = (~(i & i41)) & (i | i41);
                            int i610 = (i516 | (-i516)) >> 31;
                            int i611 = (~i610) & i515;
                            int i612 = TuitionPaymentFragmentbindingInflater1;
                            int i613 = i612 + 9;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i613 % 128;
                            int i614 = i613 % 2;
                            int i615 = i41 & i610;
                            i4 = (i615 & i611) | (i611 ^ i615);
                            String[] strArr5 = (String[]) objArr[1];
                            Object[] objArr19 = new Object[2];
                            int i616 = i515 ^ i;
                            int i617 = -i616;
                            int i618 = (((i616 & i617) | (i616 ^ i617)) >> 31) & 1;
                            int i619 = -i618;
                            int i710 = (~(((i619 & i618) | (i618 ^ i619)) >> 31)) & 1;
                            objArr19[i618] = null;
                            objArr19[i710] = strArr5;
                            String[] strArr6 = (String[]) objArr19[0];
                            objArr2 = new Object[4];
                            i5 = (i612 ^ 71) + ((i612 & 71) << 1);
                            int i711 = i5 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i711;
                            if (i5 % 2 == 0) {
                                objArr2[0] = new int[1];
                                objArr2[1] = new int[0];
                                objArr2[4] = new int[1];
                                int i712 = (i30 & i4) | ((~i4) & i);
                                int i713 = -i712;
                                int i714 = ((i712 & i713) | (i712 ^ i713)) * 79;
                                int i715 = (~i714) & 1;
                                int i716 = i714 & 75;
                                i6 = (i716 & i715) | (i715 ^ i716);
                            } else {
                                objArr2[0] = new int[1];
                                objArr2[1] = new int[1];
                                objArr2[2] = new int[1];
                                int i717 = (~(i & i4)) & (i | i4);
                                int i718 = -i717;
                                i6 = (((i717 & i718) | (i717 ^ i718)) >> 31) & 16;
                            }
                            ((int[]) objArr2[0])[0] = i;
                            ((int[]) objArr2[2])[0] = i4;
                            objArr2[3] = strArr6;
                            int i719 = (i711 ^ 101) + ((i711 & 101) << 1);
                            TuitionPaymentFragmentbindingInflater1 = i719 % 128;
                            int i810 = i719 % 2;
                            int iNextInt2 = new Random().nextInt();
                            int i811 = ~iNextInt2;
                            int i812 = ((((1035895876 + (((~(iNextInt2 | (-713520132))) | ((~((-73959897) | i811)) | 33649667)) * (-68))) + ((~((-679870465) | i811)) * (-68))) + (((~(713520131 | i811)) | (-753830361)) * 68)) - (~i6)) - 1;
                            int i813 = (i812 * 398) + (i2 * (-396));
                            int i814 = ~i812;
                            int i815 = ~i;
                            int i816 = ~((i814 ^ i815) | (i814 & i815));
                            int i817 = ~((i814 ^ i2) | (i814 & i2));
                            int i818 = ((~((i815 & i2) | (i815 ^ i2))) | (i816 & i817) | (i816 ^ i817)) * (-397);
                            int i819 = (i813 & i818) + (i813 | i818) + ((~((i814 ^ i2) | (i814 & i2))) * (-397));
                            int i910 = (~(i814 | i2)) | i;
                            int i911 = ~((~i2) | i812);
                            int i912 = (i819 - (~(((i910 & i911) | (i910 ^ i911)) * 397))) - 1;
                            int i913 = i912 << 13;
                            int i914 = (i913 | i912) & (~(i912 & i913));
                            int i915 = i914 ^ (i914 >>> 17);
                            ((int[]) objArr2[1])[0] = i915 ^ (i915 << 5);
                            return objArr2;
                        } catch (Throwable th3) {
                            fileReader3.close();
                            bufferedReader3.close();
                            throw th3;
                        }
                    } catch (Exception unused2) {
                    }
                    i7 = 2;
                    objArr = new Object[i7];
                    objArr[0] = new int[]{i};
                    objArr[1] = new String[0];
                    int i517 = ((int[]) objArr[0])[0];
                    int i518 = (~(i & i41)) & (i | i41);
                    int i6110 = (i518 | (-i518)) >> 31;
                    int i6111 = (~i6110) & i517;
                    int i6112 = TuitionPaymentFragmentbindingInflater1;
                    int i6113 = i6112 + 9;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6113 % 128;
                    int i6114 = i6113 % 2;
                    int i6115 = i41 & i6110;
                    i4 = (i6115 & i6111) | (i6111 ^ i6115);
                    String[] strArr7 = (String[]) objArr[1];
                    Object[] objArr110 = new Object[2];
                    int i6116 = i517 ^ i;
                    int i6117 = -i6116;
                    int i6118 = (((i6116 & i6117) | (i6116 ^ i6117)) >> 31) & 1;
                    int i6119 = -i6118;
                    int i7110 = (~(((i6119 & i6118) | (i6118 ^ i6119)) >> 31)) & 1;
                    objArr110[i6118] = null;
                    objArr110[i7110] = strArr7;
                    String[] strArr8 = (String[]) objArr110[0];
                    objArr2 = new Object[4];
                    i5 = (i6112 ^ 71) + ((i6112 & 71) << 1);
                    int i7111 = i5 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7111;
                    if (i5 % 2 == 0) {
                        objArr2[0] = new int[1];
                        objArr2[1] = new int[0];
                        objArr2[4] = new int[1];
                        int i7112 = (i30 & i4) | ((~i4) & i);
                        int i7113 = -i7112;
                        int i7114 = ((i7112 & i7113) | (i7112 ^ i7113)) * 79;
                        int i7115 = (~i7114) & 1;
                        int i7116 = i7114 & 75;
                        i6 = (i7116 & i7115) | (i7115 ^ i7116);
                    } else {
                        objArr2[0] = new int[1];
                        objArr2[1] = new int[1];
                        objArr2[2] = new int[1];
                        int i7117 = (~(i & i4)) & (i | i4);
                        int i7118 = -i7117;
                        i6 = (((i7117 & i7118) | (i7117 ^ i7118)) >> 31) & 16;
                    }
                    ((int[]) objArr2[0])[0] = i;
                    ((int[]) objArr2[2])[0] = i4;
                    objArr2[3] = strArr8;
                    int i7119 = (i7111 ^ 101) + ((i7111 & 101) << 1);
                    TuitionPaymentFragmentbindingInflater1 = i7119 % 128;
                    int i8110 = i7119 % 2;
                    int iNextInt3 = new Random().nextInt();
                    int i8111 = ~iNextInt3;
                    int i8112 = ((((1035895876 + (((~(iNextInt3 | (-713520132))) | ((~((-73959897) | i8111)) | 33649667)) * (-68))) + ((~((-679870465) | i8111)) * (-68))) + (((~(713520131 | i8111)) | (-753830361)) * 68)) - (~i6)) - 1;
                    int i8113 = (i8112 * 398) + (i2 * (-396));
                    int i8114 = ~i8112;
                    int i8115 = ~i;
                    int i8116 = ~((i8114 ^ i8115) | (i8114 & i8115));
                    int i8117 = ~((i8114 ^ i2) | (i8114 & i2));
                    int i8118 = ((~((i8115 & i2) | (i8115 ^ i2))) | (i8116 & i8117) | (i8116 ^ i8117)) * (-397);
                    int i8119 = (i8113 & i8118) + (i8113 | i8118) + ((~((i8114 ^ i2) | (i8114 & i2))) * (-397));
                    int i916 = (~(i8114 | i2)) | i;
                    int i917 = ~((~i2) | i8112);
                    int i918 = (i8119 - (~(((i916 & i917) | (i916 ^ i917)) * 397))) - 1;
                    int i919 = i918 << 13;
                    int i9110 = (i919 | i918) & (~(i918 & i919));
                    int i9111 = i9110 ^ (i9110 >>> 17);
                    ((int[]) objArr2[1])[0] = i9111 ^ (i9111 << 5);
                    return objArr2;
                } catch (Throwable th4) {
                    Throwable cause = th4.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th4;
                }
            }
        } catch (Exception unused3) {
            i3 = (i | 2) & (~(i & 2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(byte r6, short r7, int r8) {
        /*
            byte[] r0 = com.google.android.libraries.places.internal.zzbyg.$$c
            int r6 = 105 - r6
            int r8 = r8 * 4
            int r1 = r8 + 1
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L28
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L20:
            int r7 = r7 + 1
            r3 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L28:
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbyg.$$e(byte, short, int):java.lang.String");
    }
}
