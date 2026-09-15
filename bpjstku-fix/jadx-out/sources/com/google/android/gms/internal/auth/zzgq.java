package com.google.android.gms.internal.auth;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import defpackage.getSupportedPostviewSize;
import defpackage.getTextOn;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Random;
import java.util.Set;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zzgq {
    private static final byte[] $$c = {86, -48, ByteCompanionObject.MIN_VALUE, 88};
    private static final int $$d = 211;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {82, Base64.padSymbol, -66, -42, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 178;
    private static int b = 0;
    private static int g = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {47516, 47503, 47513, 47499, 47502, 47508, 47439, 47514, 47497, 47512, 47482, 47493, 47510, 47484, 47501, 47505, 47476, 47511, 47504, 47498, 47438, 47506, 47440, 47515, 47496, 47436};
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2047719741;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
    private static boolean TuitionPaymentFragmentbindingInflater1 = true;

    private static void c(short s, int i, short s2, Object[] objArr) {
        int i2 = 144 - s2;
        int i3 = (s * 14) + 84;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i + 1];
        int i4 = -1;
        if (bArr == null) {
            int i5 = (i2 + i) - 11;
            i2 = i2;
            i3 = i5;
        }
        while (true) {
            i4++;
            int i6 = i2 + 1;
            bArr2[i4] = (byte) i3;
            if (i4 == i) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i2 = i6;
            i3 = (i3 + bArr[i6]) - 11;
        }
    }

    private static void a(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr2;
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        long j = 0;
        if (cArr3 != null) {
            int i3 = $11 + 53;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i4])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) + 31338), 2994 - (ViewConfiguration.getScrollBarSize() >> 8), 17 - View.resolveSize(0, 0), 1182129903, false, $$e(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i4] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i4++;
                    int i5 = $11 + 105;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 43326), TextUtils.lastIndexOf("", '0', 0) + 254, View.MeasureSpec.getMode(0) + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
        int i7 = 1687675375;
        if (TuitionPaymentFragmentbindingInflater1) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i7);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 33601), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 3084, 26 - Drawable.resolveOpacity(0, 0), -2146875848, false, $$e(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                i7 = 1687675375;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i8 = $10 + 53;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 << getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] % i] / iIntValue);
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 /= 0;
                } else {
                    cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                }
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i9 = $11 + 51;
        $10 = i9 % 128;
        int i10 = i9 % 2;
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
            int i11 = $10 + 47;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
            Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (33602 - TextUtils.getOffsetAfter("", 0)), 3086 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), ImageFormat.getBitsPerPixel(0) + 27, -2146875848, false, $$e(b6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:108:0x05db A[PHI: r16
  0x05db: PHI (r16v1 int) = (r16v0 int), (r16v3 int), (r16v4 int) binds: [B:107:0x05d9, B:131:0x05db, B:100:0x05b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:141:0x020f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:36:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:40:0x0215  */
    /* JADX WARN: Code duplicated, block: B:42:0x0221 A[Catch: Exception -> 0x05d9, TRY_ENTER, TryCatch #5 {Exception -> 0x05d9, blocks: (B:37:0x020f, B:42:0x0221, B:50:0x0296, B:43:0x0228), top: B:141:0x020f }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0228 A[Catch: Exception -> 0x05d9, TRY_LEAVE, TryCatch #5 {Exception -> 0x05d9, blocks: (B:37:0x020f, B:42:0x0221, B:50:0x0296, B:43:0x0228), top: B:141:0x020f }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0245  */
    /* JADX WARN: Code duplicated, block: B:49:0x028e  */
    /* JADX WARN: Code duplicated, block: B:53:0x02b4 A[Catch: all -> 0x034b, TryCatch #8 {all -> 0x034b, blocks: (B:51:0x02a7, B:53:0x02b4, B:54:0x02f5), top: B:147:0x02a7, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0356 A[Catch: Exception -> 0x05db, TRY_LEAVE, TryCatch #1 {Exception -> 0x05db, blocks: (B:71:0x0440, B:72:0x046b, B:78:0x04d4, B:73:0x046e, B:58:0x034e, B:60:0x0354, B:61:0x0355, B:62:0x0356, B:84:0x04db, B:86:0x04e1, B:87:0x04e2, B:89:0x04e6, B:94:0x04ec, B:99:0x05b2, B:103:0x05d1, B:105:0x05d7, B:106:0x05d8, B:95:0x055c, B:97:0x0569, B:98:0x05ab, B:63:0x0378, B:65:0x0385, B:66:0x03c4, B:51:0x02a7, B:53:0x02b4, B:54:0x02f5), top: B:134:0x0213, inners: #0, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0385 A[Catch: all -> 0x04da, TryCatch #7 {all -> 0x04da, blocks: (B:63:0x0378, B:65:0x0385, B:66:0x03c4), top: B:145:0x0378, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x041b  */
    /* JADX WARN: Code duplicated, block: B:73:0x046e A[Catch: Exception -> 0x05db, TRY_LEAVE, TryCatch #1 {Exception -> 0x05db, blocks: (B:71:0x0440, B:72:0x046b, B:78:0x04d4, B:73:0x046e, B:58:0x034e, B:60:0x0354, B:61:0x0355, B:62:0x0356, B:84:0x04db, B:86:0x04e1, B:87:0x04e2, B:89:0x04e6, B:94:0x04ec, B:99:0x05b2, B:103:0x05d1, B:105:0x05d7, B:106:0x05d8, B:95:0x055c, B:97:0x0569, B:98:0x05ab, B:63:0x0378, B:65:0x0385, B:66:0x03c4, B:51:0x02a7, B:53:0x02b4, B:54:0x02f5), top: B:134:0x0213, inners: #0, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:88:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:93:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:97:0x0569 A[Catch: all -> 0x05d0, TryCatch #0 {all -> 0x05d0, blocks: (B:95:0x055c, B:97:0x0569, B:98:0x05ab), top: B:132:0x055c, outer: #1 }] */
    public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context context, int i, int i2, int i3) throws Throwable {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        String str;
        Object[] objArr;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i13;
        int mode;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        long j;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        int i28 = 2 % 2;
        int i29 = g;
        int i30 = ((i29 | 81) << 1) - (i29 ^ 81);
        int i31 = i30 % 128;
        b = i31;
        int i32 = i30 % 2;
        int i33 = i31 + 87;
        int i34 = i33 % 128;
        g = i34;
        Object obj = null;
        if (i33 % 2 == 0) {
            throw null;
        }
        if (context != null) {
            int i35 = i34 + 47;
            b = i35 % 128;
            if (i35 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            try {
                int i36 = -(-ExpandableListView.getPackedPositionType(0L));
                Object[] objArr2 = new Object[1];
                a(null, null, (i36 & 127) + (i36 | 127), new byte[]{-119, -116, -118, -119, -126, -123, -117, -121, -119, -126, -118, -119, -126, -123, -120, -121, -125, -122, -123, -124, -125, -126, -127}, objArr2);
                Class<?> cls = Class.forName((String) objArr2[0]);
                int i37 = -(-View.MeasureSpec.makeMeasureSpec(0, 0));
                Object[] objArr3 = new Object[1];
                a(null, null, ((i37 | 127) << 1) - (i37 ^ 127), new byte[]{-123, -110, -126, -111, -126, -123, -122, -119, -127, -120, -122, -112, -113, -113, -114, -119, -118, -115}, objArr3);
                Object objInvoke = cls.getMethod((String) objArr3[0], null).invoke(context, null);
                int i38 = -(Process.myTid() >> 22);
                Object[] objArr4 = new Object[1];
                a(null, null, ((i38 | 127) << 1) - (i38 ^ 127), new byte[]{-123, -110, -126, -111, -126, -123, -122, -119, -127, -120, -122, -112, -113, -113, -114, -121, -109, -113, -121, -119, -126, -118, -119, -126, -123, -120, -121, -125, -122, -123, -124, -125, -126, -127}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                int i39 = -TextUtils.lastIndexOf("", '0');
                int i40 = ~i;
                int i41 = (((i39 * 980) - 123228) - (~(-(-((~((i40 & ComposerKt.defaultsKey) | ((-127) ^ i40))) * 979))))) - 1;
                int i42 = ((i39 ^ i) | (i39 & i)) * (-979);
                int i43 = (i41 ^ i42) + ((i41 & i42) << 1);
                int i44 = ~(((-127) ^ i) | ((-127) & i));
                int i45 = ~(i39 | (~i));
                int i46 = i44 ^ i45;
                Object[] objArr5 = new Object[1];
                a(null, null, (i43 - (~(((i45 & i44) | i46) * 979))) - 1, new byte[]{-108, -115, -127, -112, -110}, objArr5);
                int i47 = cls2.getField((String) objArr5[0]).getInt(objInvoke) & 2;
                int i48 = -i47;
                int i49 = ((i47 & i48) | (i47 ^ i48)) >> 31;
                int i50 = (i49 & (~(i & 1)) & (i | 1)) | ((~i49) & i);
                int i51 = b;
                int i52 = ((i51 | 111) << 1) - (i51 ^ 111);
                g = i52 % 128;
                int i53 = i52 % 2;
                i4 = i50;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } else {
            i4 = i;
        }
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1122237249);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char c = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 16948);
                int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 2739;
                int size = View.MeasureSpec.getSize(0) + 13;
                byte b2 = $$a[7];
                Object[] objArr6 = new Object[1];
                c(b2, (byte) (b2 | 52), (short) 141, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, pressedStateDuration, size, 1501733736, false, (String) objArr6[0], new Class[0]);
            }
            Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, null);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                char cBlue = (char) (Color.blue(0) + 16949);
                int i54 = 2739 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int iArgb = Color.argb(0, 0, 0, 0) + 13;
                byte b3 = $$a[7];
                Object[] objArr7 = new Object[1];
                c(b3, (byte) (b3 | 52), (short) ($$b >>> 1), objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cBlue, i54, iArgb, 47863026, false, (String) objArr7[0], null);
            }
            if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null))) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c2 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16949);
                    int tapTimeout = 2739 - (ViewConfiguration.getTapTimeout() >> 16);
                    int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 13;
                    byte b4 = $$a[7];
                    byte b5 = (byte) (b4 | 37);
                    Object[] objArr8 = new Object[1];
                    c(b4, b5, b5, objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, tapTimeout, edgeSlop, 631063962, false, (String) objArr8[0], null);
                }
                if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null))) {
                    if (Build.VERSION.SDK_INT > 33) {
                        i13 = b + 79;
                        g = i13 % 128;
                        if (i13 % 2 == 0) {
                            mode = View.MeasureSpec.getMode(1);
                            i14 = 78;
                        } else {
                            mode = View.MeasureSpec.getMode(0);
                            i14 = 127;
                        }
                        i15 = ((mode * (-501)) - (~(i14 * TypedValues.PositionType.TYPE_PERCENT_WIDTH))) - 1;
                        i16 = g;
                        i17 = (i16 ^ 115) + ((i16 & 115) << 1);
                        b = i17 % 128;
                        if (i17 % 2 != 0) {
                            throw null;
                        }
                        int i55 = ~i14;
                        int i56 = -(-((-502) * ((~((i55 & i) | (i55 ^ i))) | (~((mode ^ i14) | (mode & i14))))));
                        int i57 = (i15 & i56) + (i15 | i56);
                        int i58 = ~i14;
                        int i59 = ~i;
                        int i60 = (i58 & i59) | (i58 ^ i59);
                        int i61 = (i16 ^ 9) + ((i16 & 9) << 1);
                        int i62 = i61 % 128;
                        b = i62;
                        int i63 = i61 % 2;
                        int i64 = -(-((-502) * (~((i60 & mode) | (i60 ^ mode)))));
                        i18 = (i57 ^ i64) + ((i64 & i57) << 1);
                        i19 = ~i14;
                        i20 = ~mode;
                        i21 = ((i62 | 101) << 1) - (i62 ^ 101);
                        g = i21 % 128;
                        if (i21 % 2 == 0) {
                            Object[] objArr9 = new Object[1];
                            a(null, null, i18 / (TypedValues.PositionType.TYPE_DRAWPATH >>> ((~((i20 & i) | (i20 ^ i))) | i19)), new byte[]{-120, -124, -121, -118, -112, -104, -127, -115, -115, -103, -104, -118, -125, -105, -125, -106, -112, -112, -107, -119, -122, -126, -122, -107, -120, -119, -118, -107}, objArr9);
                            Object[] objArr10 = {(String) objArr9[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                                int iLastIndexOf = 992 - TextUtils.lastIndexOf("", '0', 0);
                                int threadPriority2 = 8 - ((Process.getThreadPriority(0) + 20) >> 6);
                                byte[] bArr = $$a;
                                byte b6 = bArr[132];
                                byte b7 = bArr[7];
                                Object[] objArr11 = new Object[1];
                                c(b6, b7, b7, objArr11);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(threadPriority, iLastIndexOf, threadPriority2, 410748506, false, (String) objArr11[0], new Class[]{String.class});
                            }
                            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr10)).longValue();
                            long j2 = 62721089;
                            long j3 = -272;
                            i11 = i4;
                            long j4 = -1;
                            long j5 = j2 ^ j4;
                            long j6 = i;
                            j = (((long) 273) * j2) + (((long) (-271)) * jLongValue) + (((((j5 | (jLongValue ^ j4)) | (j6 ^ j4)) ^ j4) | (((j2 | jLongValue) | j6) ^ j4)) * j3) + (j3 * (((j5 | jLongValue) ^ j4) | ((j5 | j6) ^ j4))) + (((long) 272) * (((j6 | j2) ^ j4) | jLongValue)) + ((long) (-263639326));
                        } else {
                            i11 = i4;
                            int i65 = ~(i20 | i);
                            int i66 = -(-(((i65 & i19) | (i19 ^ i65)) * TypedValues.PositionType.TYPE_DRAWPATH));
                            Object[] objArr12 = new Object[1];
                            a(null, null, (i18 & i66) + (i66 | i18), new byte[]{-120, -124, -121, -118, -112, -104, -127, -115, -115, -103, -104, -118, -125, -105, -125, -106, -112, -112, -107, -119, -122, -126, -122, -107, -120, -119, -118, -107}, objArr12);
                            Object[] objArr13 = {(String) objArr12[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char threadPriority3 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                                int iIndexOf = 993 - TextUtils.indexOf("", "");
                                int iRed = 8 - Color.red(0);
                                byte[] bArr2 = $$a;
                                byte b8 = bArr2[132];
                                byte b9 = bArr2[7];
                                Object[] objArr14 = new Object[1];
                                c(b8, b9, b9, objArr14);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(threadPriority3, iIndexOf, iRed, 410748506, false, (String) objArr14[0], new Class[]{String.class});
                            }
                            long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr13)).longValue();
                            long j7 = 1173846585;
                            long j8 = -209;
                            long j9 = (j8 * j7) + (j8 * jLongValue2);
                            long j10 = 210;
                            long j11 = -1;
                            long j12 = j7 ^ j11;
                            long j13 = jLongValue2 ^ j11;
                            long j14 = i;
                            long j15 = j14 ^ j11;
                            j = j9 + (((j12 | j13) ^ j11) * j10) + ((((j13 | j15) ^ j11) | ((j12 | j14) ^ j11)) * j10) + (j10 * (((jLongValue2 | (j12 | j15)) ^ j11) | (((j13 | j7) | j14) ^ j11))) + ((long) (-1374764822));
                        }
                        i22 = g + 27;
                        b = i22 % 128;
                        if (i22 % 2 != 0) {
                            i23 = ((int) (j >>> 70)) & (787552030 + (((~(1566029602 | i)) | 128803191) * (-465)) + ((1566029602 | (~(128803191 | i))) * 930) + ((1610610551 | i) * 465));
                            i24 = (int) j;
                            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                            i25 = (-1612773461) + (((~(1430124350 | iFreeMemory)) | 131073) * (-140)) + ((~(1430255423 | iFreeMemory)) * 70);
                            i26 = ((~(iFreeMemory | 1427616535)) | 2769961) * 70;
                        } else {
                            i23 = ((int) (j >> 32)) & ((-428863841) + (((~(1236131953 | i)) | (-201094458)) * (-465)) + ((1236131953 | (~((-201094458) | i))) * 930) + (((-38802697) | i) * 465));
                            i24 = (int) j;
                            int iNextInt = new Random().nextInt();
                            i25 = 1153123995 + (((~iNextInt) | (-1431676234)) * 1444) + (((~(iNextInt | (-1363041330))) | (~((-74185081) | iNextInt)) | 2775088) * (-1444));
                            i26 = -1416878110;
                        }
                        int i67 = i24 & (i25 + i26);
                        int i68 = g;
                        i27 = (i68 ^ 67) + ((i68 & 67) << 1);
                        b = i27 % 128;
                        i12 = (i23 & i67) | (i23 ^ i67);
                        if (i27 % 2 != 0) {
                            int i69 = 4 / 0;
                        }
                        i12 = 0;
                    } else {
                        i11 = i4;
                        Object[] objArr15 = new Object[1];
                        a(null, null, 125 - (~(-(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))))), new byte[]{-102}, objArr15);
                        str = (String) objArr15[0];
                        byte modifierMetaStateMask = (byte) KeyEvent.getModifierMetaStateMask();
                        int iTuitionPaymentFragmentbindingInflater1 = getTextOn.TuitionPaymentFragmentbindingInflater1();
                        int i70 = (iTuitionPaymentFragmentbindingInflater1 ^ 128) | (iTuitionPaymentFragmentbindingInflater1 & 128);
                        int i71 = ~modifierMetaStateMask;
                        int i72 = (modifierMetaStateMask * 628) + 80384 + (((i70 & i71) | (i70 ^ i71)) * (-627));
                        int i73 = ~(((-129) & iTuitionPaymentFragmentbindingInflater1) | ((-129) ^ iTuitionPaymentFragmentbindingInflater1));
                        int i74 = i72 + (((i73 & modifierMetaStateMask) | (modifierMetaStateMask ^ i73)) * (-627));
                        int i75 = ~iTuitionPaymentFragmentbindingInflater1;
                        int i76 = ~((i75 & 128) | (i75 ^ 128));
                        int i77 = ~(modifierMetaStateMask | iTuitionPaymentFragmentbindingInflater1);
                        int i78 = -(-(((i77 & i76) | (i76 ^ i77)) * 627));
                        Object[] objArr16 = new Object[1];
                        a(null, null, (i74 ^ i78) + ((i78 & i74) << 1), new byte[]{-118, -112, -104, -127, -115, -115, -103, -104, -118, -125, -121, -123, -124}, objArr16);
                        objArr = new Object[]{(String) objArr16[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cIndexOf = (char) (33601 - TextUtils.indexOf((CharSequence) "", '0', 0));
                            int iNormalizeMetaState = 3085 - KeyEvent.normalizeMetaState(0);
                            int iMyTid = (Process.myTid() >> 22) + 26;
                            byte[] bArr3 = $$a;
                            byte b10 = bArr3[132];
                            byte b11 = bArr3[7];
                            Object[] objArr17 = new Object[1];
                            c(b10, b11, b11, objArr17);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iNormalizeMetaState, iMyTid, 1411172903, false, (String) objArr17[0], new Class[]{String.class});
                        }
                        if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                            int i79 = b;
                            int i80 = (i79 ^ 19) + ((i79 & 19) << 1);
                            int i81 = i80 % 128;
                            g = i81;
                            int i82 = i80 % 2;
                            int i83 = i81 + 45;
                            b = i83 % 128;
                            int i84 = i83 % 2;
                            i12 = 1;
                        } else {
                            i12 = 0;
                        }
                    }
                    int i85 = (~(i & 10)) & (i | 10);
                    int i86 = -i12;
                    int i87 = ((i12 & i86) | (i12 ^ i86)) >> 31;
                    getTextOn.TuitionPaymentFragmentbindingInflater1();
                    getTextOn.TuitionPaymentFragmentbindingInflater1();
                    int i88 = (~i87) & i;
                    int i89 = i87 & i85;
                    int i90 = (i89 & i88) | (i88 ^ i89);
                    int i91 = b;
                    int i92 = ((i91 | 43) << 1) - (i91 ^ 43);
                    int i93 = i92 % 128;
                    g = i93;
                    int i94 = i92 % 2;
                    int i95 = i2 & 32;
                    int i96 = -i95;
                    int i97 = ((i95 & i96) | (i95 ^ i96)) >> 31;
                    int i98 = ((i93 | 73) << 1) - (i93 ^ 73);
                    b = i98 % 128;
                    int i99 = i98 % 2;
                    int i100 = i90 & (~i97);
                    int i101 = i & i97;
                    i5 = (i100 & i101) | (i100 ^ i101);
                    i6 = i11;
                } else if (Build.VERSION.SDK_INT == 30) {
                    int i102 = b;
                    int i103 = ((i102 | 113) << 1) - (i102 ^ 113);
                    g = i103 % 128;
                    int i104 = i103 % 2;
                    i5 = i;
                    i6 = i4;
                } else {
                    if (Build.VERSION.SDK_INT > 33) {
                        i13 = b + 79;
                        g = i13 % 128;
                        if (i13 % 2 == 0) {
                            mode = View.MeasureSpec.getMode(1);
                            i14 = 78;
                        } else {
                            mode = View.MeasureSpec.getMode(0);
                            i14 = 127;
                        }
                        i15 = ((mode * (-501)) - (~(i14 * TypedValues.PositionType.TYPE_PERCENT_WIDTH))) - 1;
                        i16 = g;
                        i17 = (i16 ^ 115) + ((i16 & 115) << 1);
                        b = i17 % 128;
                        if (i17 % 2 != 0) {
                            throw null;
                        }
                        int i510 = ~i14;
                        int i511 = -(-((-502) * ((~((i510 & i) | (i510 ^ i))) | (~((mode ^ i14) | (mode & i14))))));
                        int i512 = (i15 & i511) + (i15 | i511);
                        int i513 = ~i14;
                        int i514 = ~i;
                        int i610 = (i513 & i514) | (i513 ^ i514);
                        int i611 = (i16 ^ 9) + ((i16 & 9) << 1);
                        int i612 = i611 % 128;
                        b = i612;
                        int i613 = i611 % 2;
                        int i614 = -(-((-502) * (~((i610 & mode) | (i610 ^ mode)))));
                        i18 = (i512 ^ i614) + ((i614 & i512) << 1);
                        i19 = ~i14;
                        i20 = ~mode;
                        i21 = ((i612 | 101) << 1) - (i612 ^ 101);
                        g = i21 % 128;
                        if (i21 % 2 == 0) {
                            Object[] objArr18 = new Object[1];
                            a(null, null, i18 / (TypedValues.PositionType.TYPE_DRAWPATH >>> ((~((i20 & i) | (i20 ^ i))) | i19)), new byte[]{-120, -124, -121, -118, -112, -104, -127, -115, -115, -103, -104, -118, -125, -105, -125, -106, -112, -112, -107, -119, -122, -126, -122, -107, -120, -119, -118, -107}, objArr18);
                            Object[] objArr19 = {(String) objArr18[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char threadPriority4 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                                int iLastIndexOf2 = 992 - TextUtils.lastIndexOf("", '0', 0);
                                int threadPriority5 = 8 - ((Process.getThreadPriority(0) + 20) >> 6);
                                byte[] bArr4 = $$a;
                                byte b12 = bArr4[132];
                                byte b13 = bArr4[7];
                                Object[] objArr110 = new Object[1];
                                c(b12, b13, b13, objArr110);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(threadPriority4, iLastIndexOf2, threadPriority5, 410748506, false, (String) objArr110[0], new Class[]{String.class});
                            }
                            long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr19)).longValue();
                            long j16 = 62721089;
                            long j17 = -272;
                            i11 = i4;
                            long j18 = -1;
                            long j19 = j16 ^ j18;
                            long j20 = i;
                            j = (((long) 273) * j16) + (((long) (-271)) * jLongValue3) + (((((j19 | (jLongValue3 ^ j18)) | (j20 ^ j18)) ^ j18) | (((j16 | jLongValue3) | j20) ^ j18)) * j17) + (j17 * (((j19 | jLongValue3) ^ j18) | ((j19 | j20) ^ j18))) + (((long) 272) * (((j20 | j16) ^ j18) | jLongValue3)) + ((long) (-263639326));
                        } else {
                            i11 = i4;
                            int i615 = ~(i20 | i);
                            int i616 = -(-(((i615 & i19) | (i19 ^ i615)) * TypedValues.PositionType.TYPE_DRAWPATH));
                            Object[] objArr111 = new Object[1];
                            a(null, null, (i18 & i616) + (i616 | i18), new byte[]{-120, -124, -121, -118, -112, -104, -127, -115, -115, -103, -104, -118, -125, -105, -125, -106, -112, -112, -107, -119, -122, -126, -122, -107, -120, -119, -118, -107}, objArr111);
                            Object[] objArr112 = {(String) objArr111[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char threadPriority6 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                                int iIndexOf2 = 993 - TextUtils.indexOf("", "");
                                int iRed2 = 8 - Color.red(0);
                                byte[] bArr5 = $$a;
                                byte b14 = bArr5[132];
                                byte b15 = bArr5[7];
                                Object[] objArr113 = new Object[1];
                                c(b14, b15, b15, objArr113);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(threadPriority6, iIndexOf2, iRed2, 410748506, false, (String) objArr113[0], new Class[]{String.class});
                            }
                            long jLongValue4 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr112)).longValue();
                            long j21 = 1173846585;
                            long j22 = -209;
                            long j23 = (j22 * j21) + (j22 * jLongValue4);
                            long j110 = 210;
                            long j111 = -1;
                            long j112 = j21 ^ j111;
                            long j113 = jLongValue4 ^ j111;
                            long j114 = i;
                            long j115 = j114 ^ j111;
                            j = j23 + (((j112 | j113) ^ j111) * j110) + ((((j113 | j115) ^ j111) | ((j112 | j114) ^ j111)) * j110) + (j110 * (((jLongValue4 | (j112 | j115)) ^ j111) | (((j113 | j21) | j114) ^ j111))) + ((long) (-1374764822));
                        }
                        i22 = g + 27;
                        b = i22 % 128;
                        if (i22 % 2 != 0) {
                            i23 = ((int) (j >>> 70)) & (787552030 + (((~(1566029602 | i)) | 128803191) * (-465)) + ((1566029602 | (~(128803191 | i))) * 930) + ((1610610551 | i) * 465));
                            i24 = (int) j;
                            int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
                            i25 = (-1612773461) + (((~(1430124350 | iFreeMemory2)) | 131073) * (-140)) + ((~(1430255423 | iFreeMemory2)) * 70);
                            i26 = ((~(iFreeMemory2 | 1427616535)) | 2769961) * 70;
                        } else {
                            i23 = ((int) (j >> 32)) & ((-428863841) + (((~(1236131953 | i)) | (-201094458)) * (-465)) + ((1236131953 | (~((-201094458) | i))) * 930) + (((-38802697) | i) * 465));
                            i24 = (int) j;
                            int iNextInt2 = new Random().nextInt();
                            i25 = 1153123995 + (((~iNextInt2) | (-1431676234)) * 1444) + (((~(iNextInt2 | (-1363041330))) | (~((-74185081) | iNextInt2)) | 2775088) * (-1444));
                            i26 = -1416878110;
                        }
                        int i617 = i24 & (i25 + i26);
                        int i618 = g;
                        i27 = (i618 ^ 67) + ((i618 & 67) << 1);
                        b = i27 % 128;
                        i12 = (i23 & i617) | (i23 ^ i617);
                        if (i27 % 2 != 0) {
                            int i619 = 4 / 0;
                        }
                        i12 = 0;
                    } else {
                        i11 = i4;
                        Object[] objArr114 = new Object[1];
                        a(null, null, 125 - (~(-(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))))), new byte[]{-102}, objArr114);
                        str = (String) objArr114[0];
                        byte modifierMetaStateMask2 = (byte) KeyEvent.getModifierMetaStateMask();
                        int iTuitionPaymentFragmentbindingInflater2 = getTextOn.TuitionPaymentFragmentbindingInflater1();
                        int i710 = (iTuitionPaymentFragmentbindingInflater2 ^ 128) | (iTuitionPaymentFragmentbindingInflater2 & 128);
                        int i711 = ~modifierMetaStateMask2;
                        int i712 = (modifierMetaStateMask2 * 628) + 80384 + (((i710 & i711) | (i710 ^ i711)) * (-627));
                        int i713 = ~(((-129) & iTuitionPaymentFragmentbindingInflater2) | ((-129) ^ iTuitionPaymentFragmentbindingInflater2));
                        int i714 = i712 + (((i713 & modifierMetaStateMask2) | (modifierMetaStateMask2 ^ i713)) * (-627));
                        int i715 = ~iTuitionPaymentFragmentbindingInflater2;
                        int i716 = ~((i715 & 128) | (i715 ^ 128));
                        int i717 = ~(modifierMetaStateMask2 | iTuitionPaymentFragmentbindingInflater2);
                        int i718 = -(-(((i717 & i716) | (i716 ^ i717)) * 627));
                        Object[] objArr115 = new Object[1];
                        a(null, null, (i714 ^ i718) + ((i718 & i714) << 1), new byte[]{-118, -112, -104, -127, -115, -115, -103, -104, -118, -125, -121, -123, -124}, objArr115);
                        objArr = new Object[]{(String) objArr115[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cIndexOf2 = (char) (33601 - TextUtils.indexOf((CharSequence) "", '0', 0));
                            int iNormalizeMetaState2 = 3085 - KeyEvent.normalizeMetaState(0);
                            int iMyTid2 = (Process.myTid() >> 22) + 26;
                            byte[] bArr6 = $$a;
                            byte b16 = bArr6[132];
                            byte b17 = bArr6[7];
                            Object[] objArr116 = new Object[1];
                            c(b16, b17, b17, objArr116);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf2, iNormalizeMetaState2, iMyTid2, 1411172903, false, (String) objArr116[0], new Class[]{String.class});
                        }
                        if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                            int i719 = b;
                            int i810 = (i719 ^ 19) + ((i719 & 19) << 1);
                            int i811 = i810 % 128;
                            g = i811;
                            int i812 = i810 % 2;
                            int i813 = i811 + 45;
                            b = i813 % 128;
                            int i814 = i813 % 2;
                            i12 = 1;
                        } else {
                            i12 = 0;
                        }
                    }
                    int i815 = (~(i & 10)) & (i | 10);
                    int i816 = -i12;
                    int i817 = ((i12 & i816) | (i12 ^ i816)) >> 31;
                    getTextOn.TuitionPaymentFragmentbindingInflater1();
                    getTextOn.TuitionPaymentFragmentbindingInflater1();
                    int i818 = (~i817) & i;
                    int i819 = i817 & i815;
                    int i910 = (i819 & i818) | (i818 ^ i819);
                    int i911 = b;
                    int i912 = ((i911 | 43) << 1) - (i911 ^ 43);
                    int i913 = i912 % 128;
                    g = i913;
                    int i914 = i912 % 2;
                    int i915 = i2 & 32;
                    int i916 = -i915;
                    int i917 = ((i915 & i916) | (i915 ^ i916)) >> 31;
                    int i918 = ((i913 | 73) << 1) - (i913 ^ 73);
                    b = i918 % 128;
                    int i919 = i918 % 2;
                    int i105 = i910 & (~i917);
                    int i106 = i & i917;
                    i5 = (i105 & i106) | (i105 ^ i106);
                    i6 = i11;
                }
            } else if (Build.VERSION.SDK_INT == 30) {
                int i107 = b;
                int i108 = ((i107 | 113) << 1) - (i107 ^ 113);
                g = i108 % 128;
                int i109 = i108 % 2;
                i5 = i;
                i6 = i4;
            } else {
                try {
                    try {
                        if (Build.VERSION.SDK_INT > 33) {
                            i13 = b + 79;
                            g = i13 % 128;
                            if (i13 % 2 == 0) {
                                mode = View.MeasureSpec.getMode(1);
                                i14 = 78;
                            } else {
                                mode = View.MeasureSpec.getMode(0);
                                i14 = 127;
                            }
                            i15 = ((mode * (-501)) - (~(i14 * TypedValues.PositionType.TYPE_PERCENT_WIDTH))) - 1;
                            i16 = g;
                            i17 = (i16 ^ 115) + ((i16 & 115) << 1);
                            b = i17 % 128;
                            if (i17 % 2 != 0) {
                                throw null;
                            }
                            int i515 = ~i14;
                            int i516 = -(-((-502) * ((~((i515 & i) | (i515 ^ i))) | (~((mode ^ i14) | (mode & i14))))));
                            int i517 = (i15 & i516) + (i15 | i516);
                            int i518 = ~i14;
                            int i519 = ~i;
                            int i6110 = (i518 & i519) | (i518 ^ i519);
                            int i6111 = (i16 ^ 9) + ((i16 & 9) << 1);
                            int i6112 = i6111 % 128;
                            b = i6112;
                            int i6113 = i6111 % 2;
                            int i6114 = -(-((-502) * (~((i6110 & mode) | (i6110 ^ mode)))));
                            i18 = (i517 ^ i6114) + ((i6114 & i517) << 1);
                            i19 = ~i14;
                            i20 = ~mode;
                            i21 = ((i6112 | 101) << 1) - (i6112 ^ 101);
                            g = i21 % 128;
                            if (i21 % 2 == 0) {
                                Object[] objArr117 = new Object[1];
                                a(null, null, i18 / (TypedValues.PositionType.TYPE_DRAWPATH >>> ((~((i20 & i) | (i20 ^ i))) | i19)), new byte[]{-120, -124, -121, -118, -112, -104, -127, -115, -115, -103, -104, -118, -125, -105, -125, -106, -112, -112, -107, -119, -122, -126, -122, -107, -120, -119, -118, -107}, objArr117);
                                try {
                                    Object[] objArr118 = {(String) objArr117[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char threadPriority7 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                                        int iLastIndexOf3 = 992 - TextUtils.lastIndexOf("", '0', 0);
                                        int threadPriority8 = 8 - ((Process.getThreadPriority(0) + 20) >> 6);
                                        byte[] bArr7 = $$a;
                                        byte b18 = bArr7[132];
                                        byte b19 = bArr7[7];
                                        Object[] objArr119 = new Object[1];
                                        c(b18, b19, b19, objArr119);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(threadPriority7, iLastIndexOf3, threadPriority8, 410748506, false, (String) objArr119[0], new Class[]{String.class});
                                    }
                                    long jLongValue5 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr118)).longValue();
                                    long j116 = 62721089;
                                    long j117 = -272;
                                    i11 = i4;
                                    long j118 = -1;
                                    long j119 = j116 ^ j118;
                                    long j24 = i;
                                    j = (((long) 273) * j116) + (((long) (-271)) * jLongValue5) + (((((j119 | (jLongValue5 ^ j118)) | (j24 ^ j118)) ^ j118) | (((j116 | jLongValue5) | j24) ^ j118)) * j117) + (j117 * (((j119 | jLongValue5) ^ j118) | ((j119 | j24) ^ j118))) + (((long) 272) * (((j24 | j116) ^ j118) | jLongValue5)) + ((long) (-263639326));
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 != null) {
                                        throw cause2;
                                    }
                                    throw th2;
                                }
                            } else {
                                i11 = i4;
                                int i6115 = ~(i20 | i);
                                int i6116 = -(-(((i6115 & i19) | (i19 ^ i6115)) * TypedValues.PositionType.TYPE_DRAWPATH));
                                Object[] objArr1110 = new Object[1];
                                a(null, null, (i18 & i6116) + (i6116 | i18), new byte[]{-120, -124, -121, -118, -112, -104, -127, -115, -115, -103, -104, -118, -125, -105, -125, -106, -112, -112, -107, -119, -122, -126, -122, -107, -120, -119, -118, -107}, objArr1110);
                                try {
                                    Object[] objArr1111 = {(String) objArr1110[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char threadPriority9 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                                        int iIndexOf3 = 993 - TextUtils.indexOf("", "");
                                        int iRed3 = 8 - Color.red(0);
                                        byte[] bArr8 = $$a;
                                        byte b110 = bArr8[132];
                                        byte b111 = bArr8[7];
                                        Object[] objArr1112 = new Object[1];
                                        c(b110, b111, b111, objArr1112);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(threadPriority9, iIndexOf3, iRed3, 410748506, false, (String) objArr1112[0], new Class[]{String.class});
                                    }
                                    long jLongValue6 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr1111)).longValue();
                                    long j25 = 1173846585;
                                    long j26 = -209;
                                    long j27 = (j26 * j25) + (j26 * jLongValue6);
                                    long j1110 = 210;
                                    long j1111 = -1;
                                    long j1112 = j25 ^ j1111;
                                    long j1113 = jLongValue6 ^ j1111;
                                    long j1114 = i;
                                    long j1115 = j1114 ^ j1111;
                                    j = j27 + (((j1112 | j1113) ^ j1111) * j1110) + ((((j1113 | j1115) ^ j1111) | ((j1112 | j1114) ^ j1111)) * j1110) + (j1110 * (((jLongValue6 | (j1112 | j1115)) ^ j1111) | (((j1113 | j25) | j1114) ^ j1111))) + ((long) (-1374764822));
                                } catch (Throwable th3) {
                                    Throwable cause3 = th3.getCause();
                                    if (cause3 != null) {
                                        throw cause3;
                                    }
                                    throw th3;
                                }
                            }
                            i22 = g + 27;
                            b = i22 % 128;
                            if (i22 % 2 != 0) {
                                i23 = ((int) (j >>> 70)) & (787552030 + (((~(1566029602 | i)) | 128803191) * (-465)) + ((1566029602 | (~(128803191 | i))) * 930) + ((1610610551 | i) * 465));
                                i24 = (int) j;
                                int iFreeMemory3 = (int) Runtime.getRuntime().freeMemory();
                                i25 = (-1612773461) + (((~(1430124350 | iFreeMemory3)) | 131073) * (-140)) + ((~(1430255423 | iFreeMemory3)) * 70);
                                i26 = ((~(iFreeMemory3 | 1427616535)) | 2769961) * 70;
                            } else {
                                i23 = ((int) (j >> 32)) & ((-428863841) + (((~(1236131953 | i)) | (-201094458)) * (-465)) + ((1236131953 | (~((-201094458) | i))) * 930) + (((-38802697) | i) * 465));
                                i24 = (int) j;
                                int iNextInt3 = new Random().nextInt();
                                i25 = 1153123995 + (((~iNextInt3) | (-1431676234)) * 1444) + (((~(iNextInt3 | (-1363041330))) | (~((-74185081) | iNextInt3)) | 2775088) * (-1444));
                                i26 = -1416878110;
                            }
                            int i6117 = i24 & (i25 + i26);
                            int i6118 = g;
                            i27 = (i6118 ^ 67) + ((i6118 & 67) << 1);
                            b = i27 % 128;
                            i12 = (i23 & i6117) | (i23 ^ i6117);
                            if (i27 % 2 != 0) {
                                int i6119 = 4 / 0;
                            }
                            i12 = 0;
                        } else {
                            i11 = i4;
                            Object[] objArr1113 = new Object[1];
                            a(null, null, 125 - (~(-(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))))), new byte[]{-102}, objArr1113);
                            str = (String) objArr1113[0];
                            byte modifierMetaStateMask3 = (byte) KeyEvent.getModifierMetaStateMask();
                            int iTuitionPaymentFragmentbindingInflater3 = getTextOn.TuitionPaymentFragmentbindingInflater1();
                            int i7110 = (iTuitionPaymentFragmentbindingInflater3 ^ 128) | (iTuitionPaymentFragmentbindingInflater3 & 128);
                            int i7111 = ~modifierMetaStateMask3;
                            int i7112 = (modifierMetaStateMask3 * 628) + 80384 + (((i7110 & i7111) | (i7110 ^ i7111)) * (-627));
                            int i7113 = ~(((-129) & iTuitionPaymentFragmentbindingInflater3) | ((-129) ^ iTuitionPaymentFragmentbindingInflater3));
                            int i7114 = i7112 + (((i7113 & modifierMetaStateMask3) | (modifierMetaStateMask3 ^ i7113)) * (-627));
                            int i7115 = ~iTuitionPaymentFragmentbindingInflater3;
                            int i7116 = ~((i7115 & 128) | (i7115 ^ 128));
                            int i7117 = ~(modifierMetaStateMask3 | iTuitionPaymentFragmentbindingInflater3);
                            int i7118 = -(-(((i7117 & i7116) | (i7116 ^ i7117)) * 627));
                            Object[] objArr1114 = new Object[1];
                            a(null, null, (i7114 ^ i7118) + ((i7118 & i7114) << 1), new byte[]{-118, -112, -104, -127, -115, -115, -103, -104, -118, -125, -121, -123, -124}, objArr1114);
                            try {
                                objArr = new Object[]{(String) objArr1114[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char cIndexOf3 = (char) (33601 - TextUtils.indexOf((CharSequence) "", '0', 0));
                                    int iNormalizeMetaState3 = 3085 - KeyEvent.normalizeMetaState(0);
                                    int iMyTid3 = (Process.myTid() >> 22) + 26;
                                    byte[] bArr9 = $$a;
                                    byte b112 = bArr9[132];
                                    byte b113 = bArr9[7];
                                    Object[] objArr1115 = new Object[1];
                                    c(b112, b113, b113, objArr1115);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf3, iNormalizeMetaState3, iMyTid3, 1411172903, false, (String) objArr1115[0], new Class[]{String.class});
                                }
                                if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                    int i7119 = b;
                                    int i8110 = (i7119 ^ 19) + ((i7119 & 19) << 1);
                                    int i8111 = i8110 % 128;
                                    g = i8111;
                                    int i8112 = i8110 % 2;
                                    int i8113 = i8111 + 45;
                                    b = i8113 % 128;
                                    int i8114 = i8113 % 2;
                                    i12 = 1;
                                } else {
                                    i12 = 0;
                                }
                            } catch (Throwable th4) {
                                Throwable cause4 = th4.getCause();
                                if (cause4 != null) {
                                    throw cause4;
                                }
                                throw th4;
                            }
                        }
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    i11 = i4;
                }
                int i8115 = (~(i & 10)) & (i | 10);
                int i8116 = -i12;
                int i8117 = ((i12 & i8116) | (i12 ^ i8116)) >> 31;
                getTextOn.TuitionPaymentFragmentbindingInflater1();
                getTextOn.TuitionPaymentFragmentbindingInflater1();
                int i8118 = (~i8117) & i;
                int i8119 = i8117 & i8115;
                int i9110 = (i8119 & i8118) | (i8118 ^ i8119);
                int i9111 = b;
                int i9112 = ((i9111 | 43) << 1) - (i9111 ^ 43);
                int i9113 = i9112 % 128;
                g = i9113;
                int i9114 = i9112 % 2;
                int i9115 = i2 & 32;
                int i9116 = -i9115;
                int i9117 = ((i9115 & i9116) | (i9115 ^ i9116)) >> 31;
                int i9118 = ((i9113 | 73) << 1) - (i9113 ^ 73);
                b = i9118 % 128;
                int i9119 = i9118 % 2;
                int i1010 = i9110 & (~i9117);
                int i1011 = i & i9117;
                i5 = (i1010 & i1011) | (i1010 ^ i1011);
                i6 = i11;
            }
            int i110 = (~i6) & i;
            int i111 = ~i;
            int i112 = i110 | (i6 & i111);
            int i113 = -i112;
            int i114 = ((i112 & i113) | (i112 ^ i113)) >> 31;
            int i115 = b + 111;
            int i116 = i115 % 128;
            g = i116;
            int i117 = i115 % 2;
            int i118 = (i5 & (~i114)) | (i6 & i114);
            Object[] objArr20 = new Object[4];
            int[] iArr = new int[1];
            objArr20[0] = iArr;
            objArr20[1] = new int[1];
            int i119 = i116 + 47;
            int i120 = i119 % 128;
            b = i120;
            if (i119 % 2 != 0) {
                objArr20[5] = new int[0];
                int i121 = i ^ i118;
                int i122 = -i121;
                int i123 = ((i121 & i122) | (i121 ^ i122)) * 107;
                i7 = (i123 & 88) | ((~i123) & 1);
            } else {
                objArr20[2] = new int[1];
                int i124 = i ^ i118;
                int i125 = -i124;
                i7 = (((i124 & i125) | (i124 ^ i125)) >> 31) & 16;
            }
            int i126 = ((i120 | 25) << 1) - (i120 ^ 25);
            int i127 = i126 % 128;
            g = i127;
            int i128 = i126 % 2;
            iArr[0] = i;
            int i129 = i127 + 57;
            b = i129 % 128;
            if (i129 % 2 != 0) {
                ((int[]) objArr20[4])[1] = i118;
                objArr20[5] = null;
                i8 = (-1184976848) + ((i | (-249524835)) * 140) + (((~((-249524835) | i111)) | 4587554) * (-280)) + (((~(289835063 | i111)) | (-534772344) | (~(i | (-4587555)))) * 140);
            } else {
                ((int[]) objArr20[2])[0] = i118;
                objArr20[3] = null;
                int iNextInt4 = new Random().nextInt(1592942194);
                i8 = (((-875256932) + (((~iNextInt4) | 271155233) * 1324)) + (((~(iNextInt4 | (-802319951))) | (~(842630179 | iNextInt4))) * (-1324))) - 1611675764;
            }
            int i130 = b;
            int i131 = (i130 ^ 101) + ((i130 & 101) << 1);
            g = i131 % 128;
            int i132 = i131 % 2;
            int iTuitionPaymentFragmentbindingInflater4 = getTextOn.TuitionPaymentFragmentbindingInflater1();
            if (i132 == 0) {
                i9 = (217 << i7) - ((-215) - i8);
                i10 = 216 << (~((i7 ^ iTuitionPaymentFragmentbindingInflater4) | (i7 & iTuitionPaymentFragmentbindingInflater4)));
            } else {
                int i133 = i7 * 217;
                int i134 = -(-(i8 * (-215)));
                i9 = ((i133 | i134) << 1) - (i133 ^ i134);
                i10 = (~((i7 ^ iTuitionPaymentFragmentbindingInflater4) | (i7 & iTuitionPaymentFragmentbindingInflater4))) * 216;
            }
            int i135 = -(-i10);
            int i136 = ((i9 | i135) << 1) - (i9 ^ i135);
            int i137 = ~i8;
            int i138 = (i137 & i7) | (i7 ^ i137);
            int i139 = ~iTuitionPaymentFragmentbindingInflater4;
            int i140 = (i136 - (~(((i138 & i139) | (i138 ^ i139)) * (-216)))) - 1;
            int i141 = ~((i139 & i7) | (i139 ^ i7));
            int i142 = ((i141 & i8) | (i8 ^ i141)) * 216;
            int i143 = (i3 - (~(-(-((i140 & i142) + (i142 | i140)))))) - 1;
            int i144 = i143 << 13;
            int i145 = (i143 | i144) & (~(i143 & i144));
            int i146 = i145 >>> 17;
            int i147 = ((~i145) & i146) | ((~i146) & i145);
            int i148 = i147 << 5;
            ((int[]) objArr20[1])[0] = ((~i147) & i148) | ((~i148) & i147);
            return objArr20;
        } catch (Throwable th5) {
            Throwable cause5 = th5.getCause();
            if (cause5 != null) {
                throw cause5;
            }
            throw th5;
        }
    }

    private static String $$e(short s, short s2, int i) {
        int i2 = s2 * 2;
        int i3 = i + 67;
        int i4 = 3 - (s * 3);
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        int i6 = -1;
        if (bArr == null) {
            i3 = (-i3) + i5;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i3;
            if (i7 == i5) {
                return new String(bArr2, 0);
            }
            i4++;
            i3 = (-bArr[i4]) + i3;
            i6 = i7;
        }
    }
}
