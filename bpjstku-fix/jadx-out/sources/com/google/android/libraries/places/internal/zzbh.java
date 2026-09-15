package com.google.android.libraries.places.internal;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bpjstku.databinding.ItemProgramChosenBinding;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class zzbh extends zzbae implements zzbbm {
    private static char TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static char b;
    private static final zzbh zzi;
    private static volatile zzbbt zzj;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private static final byte[] $$c = {88, 99, -94, -58};
    private static final int $$d = 165;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {92, 126, -38, -95, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
    private static final int $$b = 49;
    private static int g = 0;
    private static int d = 1;
    private static int asBinder = 1;

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        zzbh zzbhVar = new zzbh();
        zzi = zzbhVar;
        zzbae.zzbn(zzbh.class, zzbhVar);
        int i = asBinder + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
        int i2 = i % 2;
    }

    private zzbh() {
    }

    private static void a(byte b2, byte b3, short s, Object[] objArr) {
        int i = 84 - (b2 * 3);
        byte[] bArr = $$a;
        int i2 = s * 15;
        int i3 = b3 + 4;
        byte[] bArr2 = new byte[i2 + 38];
        int i4 = i2 + 37;
        int i5 = -1;
        if (bArr == null) {
            i = (i4 + i) - 11;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i;
            i3++;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i = (i + bArr[i3]) - 11;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) throws Throwable {
        Object[] objArrB$5f1425da;
        zzbbt zzazzVar;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 29944);
            int iAlpha = Color.alpha(0) + 1755;
            int iGreen = 23 - Color.green(0);
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr = new Object[1];
            a(b2, bArr[5], b2, objArr);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollDefaultDelay, iAlpha, iGreen, 986134021, false, (String) objArr[0], null);
        }
        byte[] bArr2 = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr2 = new Object[1];
        c(new char[]{22861, 14305, 43756, 34065, 27282, 40206, 23578, 13888, 11572, 54014, 13174, 1009, 55059, 40633, 5087, 42817, 26007, 58154, 49364, 27213, 19731, 37834, 14420, 36157}, 22 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        c(new char[]{44571, 41135, 31864, 25278, 10371, 16740, 50417, 24142, 56379, 47575, 39631, 18041, 10796, 30724, 65176, 29338, 25160, 62224}, 15 - Gravity.getAbsoluteGravity(0, 0), objArr3);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cCombineMeasuredStates = (char) (29944 - View.combineMeasuredStates(0, 0));
            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1755;
            int iCombineMeasuredStates = 23 - View.combineMeasuredStates(0, 0);
            byte[] bArr3 = $$a;
            byte b3 = bArr3[7];
            Object[] objArr4 = new Object[1];
            a(b3, (byte) (b3 | 36), bArr3[28], objArr4);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cCombineMeasuredStates, maximumDrawingCacheSize, iCombineMeasuredStates, 1596667560, false, (String) objArr4[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cNormalizeMetaState = (char) (29944 - KeyEvent.normalizeMetaState(0));
                int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 1755;
                int scrollBarFadeDuration = 23 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                byte[] bArr4 = $$a;
                byte b4 = bArr4[7];
                Object[] objArr5 = new Object[1];
                a(b4, (byte) (b4 | 88), bArr4[28], objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cNormalizeMetaState, fadingEdgeLength, scrollBarFadeDuration, 1599039318, false, (String) objArr5[0], null);
            }
            Object[] objArr6 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArrB$5f1425da = new Object[]{new int[]{((int[]) objArr6[0])[0]}, new int[]{((int[]) objArr6[1])[0]}, (Object[]) objArr6[2], new int[]{i ^ (i << 5)}, (String[]) objArr6[4]};
            int i2 = ~((-553555331) | i);
            int i3 = ~i;
            int i4 = (((1394195217 + ((i2 | (~((-340952905) | i3))) * (-1808))) + (((~((-548147331) | i)) | (~(i3 | (-335544905)))) * TypedValues.Custom.TYPE_BOOLEAN)) + ((((~(340952904 | i)) | 5408000) | (~(553555330 | i3))) * TypedValues.Custom.TYPE_BOOLEAN)) - 1347652772;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
        } else {
            try {
                Object[] objArr7 = {1104512090};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (((Process.getThreadPriority(0) + 20) >> 6) + 42049), TextUtils.indexOf("", "") + 1726, (Process.myTid() >> 22) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrB$5f1425da = ItemProgramChosenBinding.b$5f1425da(i, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr7), -1347652772);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 29944);
                    int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 1756;
                    int iAlpha2 = 23 - Color.alpha(0);
                    byte[] bArr5 = $$a;
                    byte b5 = bArr5[7];
                    Object[] objArr8 = new Object[1];
                    a(b5, (byte) (b5 | 88), bArr5[28], objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, bitsPerPixel, iAlpha2, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrB$5f1425da);
                try {
                    Object[] objArr9 = new Object[1];
                    c(new char[]{22861, 14305, 43756, 34065, 27282, 40206, 23578, 13888, 11572, 54014, 13174, 1009, 55059, 40633, 5087, 42817, 26007, 58154, 49364, 27213, 19731, 37834, 14420, 36157}, 21 - TextUtils.indexOf((CharSequence) "", '0'), objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    c(new char[]{44571, 41135, 31864, 25278, 10371, 16740, 50417, 24142, 56379, 47575, 39631, 18041, 10796, 30724, 65176, 29338, 25160, 62224}, 15 - KeyEvent.keyCodeFromString(""), objArr10);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char size = (char) (View.MeasureSpec.getSize(0) + 29944);
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 1755;
                        int mirror = AndroidCharacter.getMirror('0') - 25;
                        byte[] bArr6 = $$a;
                        byte b6 = bArr6[7];
                        Object[] objArr11 = new Object[1];
                        a(b6, (byte) (b6 | 36), bArr6[28], objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(size, iResolveSizeAndState, mirror, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 29944);
                        int iResolveSize = View.resolveSize(0, 0) + 1755;
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 23;
                        byte[] bArr7 = $$a;
                        byte b7 = bArr7[7];
                        Object[] objArr12 = new Object[1];
                        a(b7, bArr7[5], b7, objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(doubleTapTimeout, iResolveSize, absoluteGravity, 986134021, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
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
        if (((int[]) objArrB$5f1425da[0])[0] == ((int[]) objArrB$5f1425da[1])[0]) {
            int i7 = ((int[]) objArrB$5f1425da[3])[0];
            Object[] objArr13 = {new int[]{((int[]) objArrB$5f1425da[0])[0]}, new int[]{((int[]) objArrB$5f1425da[1])[0]}, (Object[]) objArrB$5f1425da[2], new int[1], (String[]) objArrB$5f1425da[4]};
            int iNextInt = new Random().nextInt();
            int i8 = i7 + 950188177 + (((~(777893219 | iNextInt)) | 27263496 | (~((-565290794) | iNextInt))) * (-744)) + (((~iNextInt) | 239865922) * 744) + ((iNextInt | (-27263497)) * 744);
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            Object obj3 = objArr13[3];
            ((int[]) obj3)[0] = i10 ^ (i10 << 5);
            int i11 = i - 1;
            if (i11 == 0) {
                return (byte) 1;
            }
            if (i11 != 2) {
                if (i11 == 3) {
                    return new zzbh();
                }
                if (i11 == 4) {
                    return new zzbg(bArr2);
                }
                if (i11 == 5) {
                    return zzi;
                }
                if (i11 == 6) {
                    zzbbt zzbbtVar = zzj;
                    if (zzbbtVar != null) {
                        return zzbbtVar;
                    }
                    synchronized (zzbh.class) {
                        zzazzVar = zzj;
                        if (zzazzVar == null) {
                            zzazzVar = new zzazz(zzi);
                            zzj = zzazzVar;
                        }
                    }
                    return zzazzVar;
                }
                throw null;
            }
            Object[] objArr14 = new Object[5];
            int i12 = ((int[]) obj3)[0];
            int i13 = i12 * i12;
            int i14 = -(293027330 * i12);
            int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
            int i16 = -(i12 * 1942329686);
            int i17 = (i15 & i16) + (i16 | i15);
            int i18 = ((i17 | (-979813488)) << 1) - ((-979813488) ^ i17);
            int i19 = ((i18 >> 24) - 511) / 256;
            int i20 = (i18 - (~((i19 ^ 1) + ((i19 & 1) << 1)))) - 1;
            int i21 = i18 >> 28;
            int i22 = (((i21 | (-31)) << 1) - (i21 ^ (-31))) / 16;
            int i23 = (-(i20 ^ (((i22 | 1) << 1) - (i22 ^ 1)))) + 1;
            int i24 = i23 >> 20;
            int i25 = ((i24 ^ (-8191)) + ((i24 & (-8191)) << 1)) / 4096;
            objArr14[0 / ((i23 & (-(((i25 & 1) + (i25 | 1)) + 1))) * 638)] = "zzb";
            objArr14[1] = "zze";
            objArr14[2] = "zzf";
            objArr14[3] = "zzg";
            objArr14[4] = "zzh";
            return zzbo(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", objArr14);
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = (String[]) objArrB$5f1425da[4];
        if (strArr != null) {
            for (String str : strArr) {
                arrayList.add(str);
            }
            throw null;
        }
        throw null;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            char c = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                break;
            }
            int i3 = $11 + 69;
            $10 = i3 % 128;
            int i4 = 58224;
            char c2 = 1;
            if (i3 % 2 != 0) {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            } else {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            }
            int i5 = 0;
            while (i5 < 16) {
                char c3 = cArr3[c2];
                char c4 = cArr3[c];
                try {
                    Object[] objArr2 = {Integer.valueOf(c3), Integer.valueOf((c4 + i4) ^ ((c4 << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)))), Integer.valueOf(c4 >>> 5), Integer.valueOf(b)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (((Process.getThreadPriority(0) + 20) >> 6) + 47773), 468 - KeyEvent.keyCodeFromString(""), 14 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 468 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 13 - View.resolveSizeAndState(0, 0, 0), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5++;
                    c = 0;
                    c2 = 1;
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
                byte b2 = (byte) 0;
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) View.resolveSize(0, 0), 2323 - View.resolveSize(0, 0), TextUtils.lastIndexOf("", '0', 0, 0) + 45, -1312321721, false, $$e(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i);
        int i6 = $10 + 9;
        $11 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 45 / 0;
        }
    }

    static /* synthetic */ zzbh zza() {
        int i = 2 % 2;
        int i2 = g + 13;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return zzi;
        }
        throw null;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (char) 30637;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (char) 61497;
        TuitionPaymentFragmentbindingInflater1 = (char) 54811;
        b = (char) 41420;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(int r6, int r7, byte r8) {
        /*
            int r8 = r8 * 3
            int r8 = 1 - r8
            int r6 = r6 * 2
            int r6 = r6 + 108
            byte[] r0 = com.google.android.libraries.places.internal.zzbh.$$c
            int r7 = r7 * 3
            int r7 = r7 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r6
            r6 = r8
            r4 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r7]
        L27:
            int r6 = r6 + r3
            int r7 = r7 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbh.$$e(int, int, byte):java.lang.String");
    }
}
