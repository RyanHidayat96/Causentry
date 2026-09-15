package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
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
import androidx.exifinterface.media.ExifInterface;
import androidx.work.WorkInfo;
import com.bpjstku.data.report.ReportDataStore$$ExternalSyntheticLambda9;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Set;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes6.dex */
public final class zznb {
    private static zzna zza;
    private static final byte[] $$c = {97, 58, 103, -72};
    private static final int $$d = 85;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {81, 125, 2, 46, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 75;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f778a = 1;
    private static char[] TuitionPaymentFragmentbindingInflater1 = {47316, 47303, 47313, 47299, 47302, 47308, 47239, 47314, 47297, 47312, 47282, 47357, 47310, 47284, 47301, 47305, 47276, 47311, 47304, 47298, 47238, 47306, 47240, 47315, 47296, 47236};
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 2047719541;
    private static boolean b = true;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r5 = 145 - r5
            int r7 = r7 * 14
            int r7 = 98 - r7
            byte[] r0 = com.google.android.gms.internal.mlkit_common.zznb.$$a
            int r1 = 53 - r6
            byte[] r1 = new byte[r1]
            int r6 = 52 - r6
            r2 = -1
            if (r0 != 0) goto L14
            r7 = r5
            r3 = r6
            goto L29
        L14:
            r4 = r7
            r7 = r5
            r5 = r4
        L17:
            int r2 = r2 + 1
            byte r3 = (byte) r5
            r1[r2] = r3
            if (r2 != r6) goto L27
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            r8[r6] = r5
            return
        L27:
            r3 = r0[r7]
        L29:
            int r3 = -r3
            int r5 = r5 + r3
            int r7 = r7 + 1
            int r5 = r5 + (-11)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_common.zznb.d(short, short, int, java.lang.Object[]):void");
    }

    public static zzmq zza(zzmj zzmjVar) {
        zzmq zzmqVar;
        synchronized (zznb.class) {
            if (zza == null) {
                zza = new zzna(null);
            }
            zzmqVar = (zzmq) zza.get(zzmjVar);
        }
        return zzmqVar;
    }

    public static zzmq zzb(String str) {
        zzmq zzmqVarZza;
        synchronized (zznb.class) {
            zzmqVarZza = zza(zzmj.zzd("common").zzd());
        }
        return zzmqVarZza;
    }

    private static void c(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr2 = TuitionPaymentFragmentbindingInflater1;
        float f = 0.0f;
        int i4 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = $11 + 69;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 109;
                $10 = i8 % 128;
                if (i8 % i2 != 0) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i4] = Integer.valueOf(cArr2[i7]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) i4;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (31339 - Color.red(i4)), (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)) + 2994, 17 - View.MeasureSpec.getSize(i4), 1182129903, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i7])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (31339 - Color.red(0)), 2994 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 16 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1182129903, false, $$e(b4, b5, b5), new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i7++;
                }
                i2 = 2;
                f = 0.0f;
                i4 = 0;
            }
            int i9 = $11 + 117;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 43326), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 253, 22 - TextUtils.getTrimmedLength(""), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
        long j = 0;
        int i11 = 33602;
        int i12 = 1687675375;
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char defaultSize = (char) (33602 - View.getDefaultSize(0, 0));
                    int i13 = (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 3084;
                    int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 26;
                    byte b6 = (byte) ($$d & 3);
                    byte b7 = (byte) (b6 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(defaultSize, i13, keyRepeatTimeout, -2146875848, false, $$e(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                j = 0;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        int i14 = 0;
        if (b) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            int i15 = $11 + 81;
            $10 = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 3 / 4;
            }
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i17 = $10 + 65;
                $11 = i17 % 128;
                if (i17 % 2 == 0) {
                    cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 << 1) / getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] % i] % iIntValue);
                    Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i12);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char defaultSize2 = (char) (View.getDefaultSize(0, 0) + i11);
                        int iMyTid = (Process.myTid() >> 22) + 3085;
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 27;
                        byte b8 = (byte) ($$d & 3);
                        byte b9 = (byte) (b8 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(defaultSize2, iMyTid, iIndexOf, -2146875848, false, $$e(b8, b9, b9), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                } else {
                    cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    Object[] objArr7 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i12);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char packedPositionType = (char) (i11 - ExpandableListView.getPackedPositionType(0L));
                        int mode = View.MeasureSpec.getMode(0) + 3085;
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 26;
                        byte b10 = (byte) ($$d & 3);
                        byte b11 = (byte) (b10 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionType, mode, scrollDefaultDelay, -2146875848, false, $$e(b10, b11, b11), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
                    i11 = 33602;
                    i12 = 1687675375;
                }
            }
            objArr[0] = new String(cArr5);
            return;
        }
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        while (true) {
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i14;
            while (true) {
                if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    objArr[0] = new String(cArr6);
                    return;
                }
                int i18 = $10 + 35;
                $11 = i18 % 128;
                if (i18 % 2 == 0) {
                    cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 / 0) * getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] >> i] << iIntValue);
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                }
            }
            cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
            i14 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0638  */
    /* JADX WARN: Code duplicated, block: B:109:0x0645 A[PHI: r18
  0x0645: PHI (r18v3 int) = (r18v2 int), (r18v6 int), (r18v6 int), (r18v6 int) binds: [B:108:0x0643, B:143:0x0645, B:101:0x0636, B:88:0x05c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:112:0x065c  */
    /* JADX WARN: Code duplicated, block: B:114:0x067e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0686  */
    /* JADX WARN: Code duplicated, block: B:132:0x07c8  */
    /* JADX WARN: Code duplicated, block: B:153:0x0366 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x034a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0350  */
    /* JADX WARN: Code duplicated, block: B:45:0x035c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0361  */
    /* JADX WARN: Code duplicated, block: B:51:0x036e  */
    /* JADX WARN: Code duplicated, block: B:55:0x03af  */
    /* JADX WARN: Code duplicated, block: B:58:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:65:0x042b A[Catch: all -> 0x050d, TryCatch #4 {all -> 0x050d, blocks: (B:63:0x041e, B:65:0x042b, B:66:0x0462), top: B:151:0x041e, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0518 A[Catch: Exception -> 0x0645, TRY_LEAVE, TryCatch #3 {Exception -> 0x0645, blocks: (B:68:0x04b5, B:72:0x0510, B:74:0x0516, B:75:0x0517, B:76:0x0518, B:78:0x0536, B:82:0x055d, B:87:0x05bd, B:91:0x05c5, B:93:0x05cb, B:94:0x05cc, B:95:0x05cd, B:100:0x0632, B:104:0x063b, B:106:0x0641, B:107:0x0642, B:83:0x056d, B:85:0x057a, B:86:0x05b6, B:96:0x05e4, B:98:0x05f1, B:99:0x062b, B:63:0x041e, B:65:0x042b, B:66:0x0462), top: B:150:0x036c, inners: #0, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0559  */
    /* JADX WARN: Code duplicated, block: B:85:0x057a A[Catch: all -> 0x05c4, TryCatch #0 {all -> 0x05c4, blocks: (B:83:0x056d, B:85:0x057a, B:86:0x05b6), top: B:144:0x056d, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:95:0x05cd A[Catch: Exception -> 0x0645, TRY_LEAVE, TryCatch #3 {Exception -> 0x0645, blocks: (B:68:0x04b5, B:72:0x0510, B:74:0x0516, B:75:0x0517, B:76:0x0518, B:78:0x0536, B:82:0x055d, B:87:0x05bd, B:91:0x05c5, B:93:0x05cb, B:94:0x05cc, B:95:0x05cd, B:100:0x0632, B:104:0x063b, B:106:0x0641, B:107:0x0642, B:83:0x056d, B:85:0x057a, B:86:0x05b6, B:96:0x05e4, B:98:0x05f1, B:99:0x062b, B:63:0x041e, B:65:0x042b, B:66:0x0462), top: B:150:0x036c, inners: #0, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x05f1 A[Catch: all -> 0x063a, TryCatch #2 {all -> 0x063a, blocks: (B:96:0x05e4, B:98:0x05f1, B:99:0x062b), top: B:148:0x05e4, outer: #3 }] */
    public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, int i, int i2, int i3) throws Throwable {
        Class<?> cls;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Object[] objArr;
        Object obj;
        char c;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        String str;
        int i20;
        int i21;
        Object[] objArr2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object[] objArr3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        int bitsPerPixel;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i22;
        int i23;
        int i24;
        int i25;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        int i26 = 2 % 2;
        int i27 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i28 = (i27 & 27) + (i27 | 27);
        f778a = i28 % 128;
        Object obj2 = null;
        if (i28 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (context != null) {
            try {
                int i29 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int i30 = ~i29;
                int i31 = ~i;
                int i32 = i30 | i31;
                int i33 = ((-128) & i31) | ((-128) ^ i31);
                int i34 = ((i29 * (-183)) - 23241) + (((~((i32 & 127) | (i32 ^ 127))) | (~((i33 & i29) | (i33 ^ i29)))) * (-184));
                int i35 = ~i29;
                int i36 = ~((i35 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i35 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                int i37 = f778a;
                int i38 = (i37 ^ 115) + ((i37 & 115) << 1);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i38 % 128;
                if (i38 % 2 != 0) {
                    int i39 = ~(i35 | (~i));
                    int i40 = i34 * (184 << (((i39 & i36) | (i36 ^ i39)) | (~(((-128) & i31) | ((-128) ^ i31)))));
                    int i41 = -(-((i29 & 127) | (i29 ^ 127)));
                    Object[] objArr4 = new Object[1];
                    c(null, null, i40 >> ((i41 ^ 184) + ((i41 & 184) << 1)), new byte[]{-119, -116, -118, -119, -126, -123, -117, -121, -119, -126, -118, -119, -126, -123, -120, -121, -125, -122, -123, -124, -125, -126, -127}, objArr4);
                    cls = Class.forName((String) objArr4[0]);
                    i4 = 42;
                } else {
                    int i42 = (~(i35 | i31)) | i36;
                    int i43 = ~(((-128) & i31) | ((-128) ^ i31));
                    int i44 = ((i42 & i43) | (i42 ^ i43)) * 184;
                    Object[] objArr5 = new Object[1];
                    c(null, null, (i34 ^ i44) + ((i34 & i44) << 1) + (((i29 & 127) | (i29 ^ 127)) * 184), new byte[]{-119, -116, -118, -119, -126, -123, -117, -121, -119, -126, -118, -119, -126, -123, -120, -121, -125, -122, -123, -124, -125, -126, -127}, objArr5);
                    cls = Class.forName((String) objArr5[0]);
                    i4 = 127;
                }
                int iGreen = Color.green(0);
                Object[] objArr6 = new Object[1];
                c(null, null, ((i4 | iGreen) << 1) - (i4 ^ iGreen), new byte[]{-123, -110, -126, -111, -126, -123, -122, -119, -127, -120, -122, -112, -113, -113, -114, -119, -118, -115}, objArr6);
                Object objInvoke = cls.getMethod((String) objArr6[0], null).invoke(context, null);
                int minimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity() >> 16;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                int i45 = minimumFlingVelocity * 371;
                int i46 = (i45 ^ 47117) + ((i45 & 47117) << 1);
                int i47 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                int i48 = ~(((-128) & i47) | ((-128) ^ i47));
                int i49 = ~minimumFlingVelocity;
                int i50 = ~((i49 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i49 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                int i51 = i46 + (((i48 & i50) | (i48 ^ i50)) * (-370));
                int i52 = ~minimumFlingVelocity;
                int i53 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                int i54 = ~((i52 & i53) | (i52 ^ i53));
                int i55 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault4 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | ((-128) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                int i56 = (minimumFlingVelocity & 127) | (minimumFlingVelocity ^ 127);
                int i57 = -(-(((i55 & i54) | (i54 ^ i55) | (~i56)) * (-370)));
                Object[] objArr7 = new Object[1];
                c(null, null, ((((i51 | i57) << 1) - (i57 ^ i51)) - (~(-(-((~i56) * 370))))) - 1, new byte[]{-123, -110, -126, -111, -126, -123, -122, -119, -127, -120, -122, -112, -113, -113, -114, -121, -109, -113, -121, -119, -126, -118, -119, -126, -123, -120, -121, -125, -122, -123, -124, -125, -126, -127}, objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                int i58 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
                f778a = i58 % 128;
                int i59 = i58 % 2;
                int i60 = -(-KeyEvent.keyCodeFromString(""));
                Object[] objArr8 = new Object[1];
                c(null, null, (i60 ^ 127) + ((i60 & 127) << 1), new byte[]{-108, -115, -127, -112, -110}, objArr8);
                int i61 = cls2.getField((String) objArr8[0]).getInt(objInvoke) & 2;
                int i62 = (~(i & 1)) & (i | 1);
                int i63 = -i61;
                int i64 = ((i61 & i63) | (i61 ^ i63)) >> 31;
                int i65 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
                int i66 = i65 % 128;
                f778a = i66;
                if (i65 % 2 == 0) {
                    i5 = (i64 & i62) | ((~i64) & i);
                } else {
                    int i67 = (~i64) & i;
                    int i68 = i64 & i62;
                    i5 = (i68 & i67) | (i67 ^ i68);
                }
                int i69 = (i66 & 111) + (i66 | 111);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i69 % 128;
                int i70 = i69 % 2;
                i6 = i5;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } else {
            i6 = i;
        }
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1122237249);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char scrollBarSize = (char) (16949 - (ViewConfiguration.getScrollBarSize() >> 8));
                int iRgb = (-16774477) - Color.rgb(0, 0, 0);
                int iIndexOf = 12 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                byte[] bArr = $$a;
                Object[] objArr9 = new Object[1];
                d((short) 141, bArr[7], bArr[5], objArr9);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollBarSize, iRgb, iIndexOf, 1501733736, false, (String) objArr9[0], new Class[0]);
            }
            Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, null);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                char scrollBarFadeDuration = (char) (16949 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 2739;
                int i71 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 12;
                byte[] bArr2 = $$a;
                Object[] objArr10 = new Object[1];
                d((short) 89, bArr2[7], bArr2[5], objArr10);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarFadeDuration, offsetBefore, i71, 47863026, false, (String) objArr10[0], null);
            }
            Object obj3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null);
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i72 = ~(((-261611248) & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | ((-261611248) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
            int i73 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
            int i74 = (i73 ^ 529228165) | (i73 & 529228165);
            int i75 = ~((i74 & 261611247) | (i74 ^ 261611247));
            int i76 = ((i72 & i75) | (i72 ^ i75)) * (-406);
            int i77 = (((-487446896) | i76) << 1) - (i76 ^ (-487446896));
            int i78 = ((-261611248) & i73) | ((-261611248) ^ i73);
            int i79 = -(-((~((i78 & 529228165) | (i78 ^ 529228165))) * (-406)));
            int i80 = (i77 ^ i79) + ((i79 & i77) << 1);
            int i81 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault5 & (-529228166)) | ((-529228166) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
            int i82 = ~((i73 ^ 261611247) | (i73 & 261611247));
            int i83 = (i80 - (~(-(-(((i81 & i82) | (i81 ^ i82)) * 406))))) - 1;
            int i84 = ~i;
            int i85 = ~((1584033611 & i84) | (1584033611 ^ i84));
            int i86 = ~(((-1067005676) & i) | ((-1067005676) ^ i));
            int i87 = -(-(((i85 & i86) | (i85 ^ i86)) * 1150));
            int i88 = (421292414 ^ i87) + ((i87 & 421292414) << 1);
            int i89 = ~((-1067005676) | i);
            int i90 = ~((1067005675 & i84) | (i84 ^ 1067005675));
            int i91 = -(-(((i89 & i90) | (i89 ^ i90)) * (-575)));
            int i92 = (i88 ^ i91) + ((i91 & i88) << 1);
            int i93 = ~((1584033611 & i) | (1584033611 ^ i));
            int i94 = ~((-1584033612) | i84);
            if (i83 <= i92 + (((i93 & i94) | (i93 ^ i94)) * 575)) {
                set.contains(obj3);
                throw null;
            }
            if (!set.contains(obj3)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c2 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 16948);
                    int capsMode = TextUtils.getCapsMode("", 0, 0) + 2739;
                    int keyRepeatTimeout = 13 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    Object[] objArr11 = new Object[1];
                    d((short) ($$b >>> 1), (byte) 15, $$a[5], objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, capsMode, keyRepeatTimeout, 631063962, false, (String) objArr11[0], null);
                }
                if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null))) {
                    if (Build.VERSION.SDK_INT > 33) {
                        int i95 = f778a;
                        int i96 = (i95 ^ 61) + ((i95 & 61) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i96 % 128;
                        int i97 = i96 % 2;
                        bitsPerPixel = ImageFormat.getBitsPerPixel(0);
                        iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        int i98 = bitsPerPixel * 477;
                        i22 = (i98 & (-60800)) + (i98 | (-60800));
                        int i99 = f778a;
                        int i100 = ((i99 | 73) << 1) - (i99 ^ 73);
                        int i101 = i100 % 128;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i101;
                        int i102 = i100 % 2;
                        i23 = ~(128 | (~bitsPerPixel));
                        i24 = (i101 & 69) + (i101 | 69);
                        int i103 = i24 % 128;
                        f778a = i103;
                        if (i24 % 2 == 0) {
                            int i104 = ((-129) ^ bitsPerPixel) | ((-129) & bitsPerPixel);
                            int i105 = ~((i104 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i104 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                            i25 = i22 >> ((-476) / ((i23 & i105) | (i23 ^ i105)));
                        } else {
                            int i106 = (i23 | (~(((-129) ^ bitsPerPixel) | ((-129) & bitsPerPixel) | iTuitionPaymentFragmentspecialinlinedviewModeldefault3))) * (-476);
                            i25 = ((i106 & i22) << 1) + (i22 ^ i106);
                        }
                        int i107 = (i103 & 91) + (i103 | 91);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i107 % 128;
                        int i108 = i107 % 2;
                        int i109 = -(-(952 * (~(((-129) & bitsPerPixel) | ((-129) ^ bitsPerPixel) | iTuitionPaymentFragmentspecialinlinedviewModeldefault3))));
                        int i110 = ((i25 | i109) << 1) - (i25 ^ i109);
                        int i111 = i103 + 77;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i111 % 128;
                        int i112 = i111 % 2;
                        int i113 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i114 = (i113 & (-129)) | ((-129) ^ i113);
                        int i115 = 476 * (~((bitsPerPixel & i114) | (i114 ^ bitsPerPixel)));
                        int i116 = (i110 & i115) + (i115 | i110);
                        byte[] bArr3 = {-120, -124, -121, -118, -112, -104, -127, -115, -115, -103, -104, -118, -125, -105, -125, -106, -112, -112, -107, -119, -122, -126, -122, -107, -120, -119, -118, -107};
                        int i117 = i103 + 67;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i117 % 128;
                        int i118 = i117 % 2;
                        Object[] objArr12 = new Object[1];
                        c(null, null, i116, bArr3, objArr12);
                        Object[] objArr13 = {(String) objArr12[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char capsMode2 = (char) TextUtils.getCapsMode("", 0, 0);
                            int defaultSize = View.getDefaultSize(0, 0) + 993;
                            int scrollBarSize2 = 8 - (ViewConfiguration.getScrollBarSize() >> 8);
                            byte b2 = $$a[7];
                            short s = b2;
                            Object[] objArr14 = new Object[1];
                            d(s, (byte) (s | 52), b2, objArr14);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(capsMode2, defaultSize, scrollBarSize2, 410748506, false, (String) objArr14[0], new Class[]{String.class});
                        }
                        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr13)).longValue();
                        long j = 1249091319;
                        i9 = i6;
                        long j2 = -1;
                        long j3 = j ^ j2;
                        long j4 = 191;
                        long j5 = i;
                        long j6 = (((long) (-381)) * j) + (((long) DerHeader.TAG_CLASS_PRIVATE) * jLongValue) + (((long) (-191)) * j3) + ((j | ((jLongValue | j5) ^ j2)) * j4) + (j4 * ((((j5 ^ j2) | jLongValue) ^ j2) | ((j3 | jLongValue) ^ j2))) + ((long) (-1450009556));
                        int i119 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i120 = ((i119 | 73) << 1) - (i119 ^ 73);
                        f778a = i120 % 128;
                        int i121 = i120 % 2;
                        int i122 = (int) (j6 >> 32);
                        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                        int i123 = i122 & (1632429706 + (((~((-1480852909) | (~elapsedCpuTime))) | (~((-43626498) | elapsedCpuTime))) * (-272)) + (((~(62648851 | elapsedCpuTime)) | (-1543501760)) * (-272)) + (((~(elapsedCpuTime | (-62648852))) | 1499875262) * 272));
                        int i124 = ((int) j6) & (1324122586 + (((~((-203034913) | i84)) | 1640261322) * (-591)) + (((-203034913) | i) * 591));
                        i12 = (i123 & i124) | (i123 ^ i124);
                        int i125 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
                        f778a = i125 % 128;
                        int i126 = i125 % 2;
                    } else {
                        i9 = i6;
                        int iRgb2 = Color.rgb(0, 0, 0) + 16777343;
                        byte[] bArr4 = {-102};
                        int i127 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i128 = (i127 & 7) + (i127 | 7);
                        f778a = i128 % 128;
                        int i129 = i128 % 2;
                        Object[] objArr15 = new Object[1];
                        c(null, null, iRgb2, bArr4, objArr15);
                        str = (String) objArr15[0];
                        i20 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        int i130 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        i21 = ((i130 | 21) << 1) - (i130 ^ 21);
                        f778a = i21 % 128;
                        if (i21 % 2 == 0) {
                            Object[] objArr16 = new Object[1];
                            c(null, null, 128 << i20, new byte[]{-118, -112, -104, -127, -115, -115, -103, -104, -118, -125, -121, -123, -124}, objArr16);
                            objArr3 = new Object[]{(String) objArr16[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 33602);
                                int i131 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3084;
                                int mode = View.MeasureSpec.getMode(0) + 26;
                                byte b3 = $$a[7];
                                short s2 = b3;
                                Object[] objArr17 = new Object[1];
                                d(s2, (byte) (s2 | 52), b3, objArr17);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMakeMeasureSpec, i131, mode, 1411172903, false, (String) objArr17[0], new Class[]{String.class});
                            }
                            if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3))) {
                                i12 = 1;
                            } else {
                                i12 = 0;
                            }
                        } else {
                            int i132 = -i20;
                            Object[] objArr18 = new Object[1];
                            c(null, null, (i132 & 128) + (i132 | 128), new byte[]{-118, -112, -104, -127, -115, -115, -103, -104, -118, -125, -121, -123, -124}, objArr18);
                            objArr2 = new Object[]{(String) objArr18[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char cResolveOpacity = (char) (33602 - Drawable.resolveOpacity(0, 0));
                                int iResolveSizeAndState = 3085 - View.resolveSizeAndState(0, 0, 0);
                                int packedPositionType = 26 - ExpandableListView.getPackedPositionType(0L);
                                byte b4 = $$a[7];
                                short s3 = b4;
                                Object[] objArr19 = new Object[1];
                                d(s3, (byte) (s3 | 52), b4, objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveOpacity, iResolveSizeAndState, packedPositionType, 1411172903, false, (String) objArr19[0], new Class[]{String.class});
                            }
                            if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2))) {
                                i12 = 1;
                            } else {
                                i12 = 0;
                            }
                        }
                    }
                    i13 = (~(i & 10)) & (i | 10);
                    i14 = (i12 | (-i12)) >> 31;
                    i15 = f778a + 53;
                    i16 = i15 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16;
                    if (i15 % 2 != 0) {
                        throw null;
                    }
                    int i133 = (~i14) & i;
                    int i134 = i14 & i13;
                    int i135 = (i134 & i133) | (i133 ^ i134);
                    int i136 = ((i16 | 93) << 1) - (i16 ^ 93);
                    f778a = i136 % 128;
                    int i137 = i136 % 2;
                    i17 = i2 & 32;
                    i18 = (i16 & 63) + (i16 | 63);
                    f778a = i18 % 128;
                    if (i18 % 2 == 0) {
                        int i138 = -i17;
                        i19 = ((i17 & i138) | (i17 ^ i138)) / 38;
                    } else {
                        int i139 = -i17;
                        i19 = ((i17 & i139) | (i17 ^ i139)) >> 31;
                    }
                    int i140 = i135 & (~i19);
                    int i141 = i19 & i;
                    i8 = (i140 & i141) | (i140 ^ i141);
                } else if (Build.VERSION.SDK_INT == 30) {
                    i7 = f778a + 99;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                    if (i7 % 2 == 0) {
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                    i8 = i;
                    i9 = i6;
                } else {
                    if (Build.VERSION.SDK_INT > 33) {
                        int i910 = f778a;
                        int i911 = (i910 ^ 61) + ((i910 & 61) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i911 % 128;
                        int i912 = i911 % 2;
                        bitsPerPixel = ImageFormat.getBitsPerPixel(0);
                        iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        int i913 = bitsPerPixel * 477;
                        i22 = (i913 & (-60800)) + (i913 | (-60800));
                        int i914 = f778a;
                        int i1010 = ((i914 | 73) << 1) - (i914 ^ 73);
                        int i1011 = i1010 % 128;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1011;
                        int i1012 = i1010 % 2;
                        i23 = ~(128 | (~bitsPerPixel));
                        i24 = (i1011 & 69) + (i1011 | 69);
                        int i1013 = i24 % 128;
                        f778a = i1013;
                        if (i24 % 2 == 0) {
                            int i1014 = ((-129) ^ bitsPerPixel) | ((-129) & bitsPerPixel);
                            int i1015 = ~((i1014 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i1014 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                            i25 = i22 >> ((-476) / ((i23 & i1015) | (i23 ^ i1015)));
                        } else {
                            int i1016 = (i23 | (~(((-129) ^ bitsPerPixel) | ((-129) & bitsPerPixel) | iTuitionPaymentFragmentspecialinlinedviewModeldefault3))) * (-476);
                            i25 = ((i1016 & i22) << 1) + (i22 ^ i1016);
                        }
                        int i1017 = (i1013 & 91) + (i1013 | 91);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1017 % 128;
                        int i1018 = i1017 % 2;
                        int i1019 = -(-(952 * (~(((-129) & bitsPerPixel) | ((-129) ^ bitsPerPixel) | iTuitionPaymentFragmentspecialinlinedviewModeldefault3))));
                        int i1110 = ((i25 | i1019) << 1) - (i25 ^ i1019);
                        int i1111 = i1013 + 77;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1111 % 128;
                        int i1112 = i1111 % 2;
                        int i1113 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i1114 = (i1113 & (-129)) | ((-129) ^ i1113);
                        int i1115 = 476 * (~((bitsPerPixel & i1114) | (i1114 ^ bitsPerPixel)));
                        int i1116 = (i1110 & i1115) + (i1115 | i1110);
                        byte[] bArr5 = {-120, -124, -121, -118, -112, -104, -127, -115, -115, -103, -104, -118, -125, -105, -125, -106, -112, -112, -107, -119, -122, -126, -122, -107, -120, -119, -118, -107};
                        int i1117 = i1013 + 67;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1117 % 128;
                        int i1118 = i1117 % 2;
                        Object[] objArr110 = new Object[1];
                        c(null, null, i1116, bArr5, objArr110);
                        Object[] objArr111 = {(String) objArr110[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char capsMode3 = (char) TextUtils.getCapsMode("", 0, 0);
                            int defaultSize2 = View.getDefaultSize(0, 0) + 993;
                            int scrollBarSize3 = 8 - (ViewConfiguration.getScrollBarSize() >> 8);
                            byte b5 = $$a[7];
                            short s4 = b5;
                            Object[] objArr112 = new Object[1];
                            d(s4, (byte) (s4 | 52), b5, objArr112);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(capsMode3, defaultSize2, scrollBarSize3, 410748506, false, (String) objArr112[0], new Class[]{String.class});
                        }
                        long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr111)).longValue();
                        long j7 = 1249091319;
                        i9 = i6;
                        long j8 = -1;
                        long j9 = j7 ^ j8;
                        long j10 = 191;
                        long j11 = i;
                        long j12 = (((long) (-381)) * j7) + (((long) DerHeader.TAG_CLASS_PRIVATE) * jLongValue2) + (((long) (-191)) * j9) + ((j7 | ((jLongValue2 | j11) ^ j8)) * j10) + (j10 * ((((j11 ^ j8) | jLongValue2) ^ j8) | ((j9 | jLongValue2) ^ j8))) + ((long) (-1450009556));
                        int i1119 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i1210 = ((i1119 | 73) << 1) - (i1119 ^ 73);
                        f778a = i1210 % 128;
                        int i1211 = i1210 % 2;
                        int i1212 = (int) (j12 >> 32);
                        int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                        int i1213 = i1212 & (1632429706 + (((~((-1480852909) | (~elapsedCpuTime2))) | (~((-43626498) | elapsedCpuTime2))) * (-272)) + (((~(62648851 | elapsedCpuTime2)) | (-1543501760)) * (-272)) + (((~(elapsedCpuTime2 | (-62648852))) | 1499875262) * 272));
                        int i1214 = ((int) j12) & (1324122586 + (((~((-203034913) | i84)) | 1640261322) * (-591)) + (((-203034913) | i) * 591));
                        i12 = (i1213 & i1214) | (i1213 ^ i1214);
                        int i1215 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
                        f778a = i1215 % 128;
                        int i1216 = i1215 % 2;
                    } else {
                        i9 = i6;
                        int iRgb3 = Color.rgb(0, 0, 0) + 16777343;
                        byte[] bArr6 = {-102};
                        int i1217 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i1218 = (i1217 & 7) + (i1217 | 7);
                        f778a = i1218 % 128;
                        int i1219 = i1218 % 2;
                        Object[] objArr113 = new Object[1];
                        c(null, null, iRgb3, bArr6, objArr113);
                        str = (String) objArr113[0];
                        i20 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        int i1310 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        i21 = ((i1310 | 21) << 1) - (i1310 ^ 21);
                        f778a = i21 % 128;
                        if (i21 % 2 == 0) {
                            Object[] objArr114 = new Object[1];
                            c(null, null, 128 << i20, new byte[]{-118, -112, -104, -127, -115, -115, -103, -104, -118, -125, -121, -123, -124}, objArr114);
                            objArr3 = new Object[]{(String) objArr114[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char cMakeMeasureSpec2 = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 33602);
                                int i1311 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3084;
                                int mode2 = View.MeasureSpec.getMode(0) + 26;
                                byte b6 = $$a[7];
                                short s5 = b6;
                                Object[] objArr115 = new Object[1];
                                d(s5, (byte) (s5 | 52), b6, objArr115);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMakeMeasureSpec2, i1311, mode2, 1411172903, false, (String) objArr115[0], new Class[]{String.class});
                            }
                            if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3))) {
                                i12 = 1;
                            } else {
                                i12 = 0;
                            }
                        } else {
                            int i1312 = -i20;
                            Object[] objArr116 = new Object[1];
                            c(null, null, (i1312 & 128) + (i1312 | 128), new byte[]{-118, -112, -104, -127, -115, -115, -103, -104, -118, -125, -121, -123, -124}, objArr116);
                            objArr2 = new Object[]{(String) objArr116[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char cResolveOpacity2 = (char) (33602 - Drawable.resolveOpacity(0, 0));
                                int iResolveSizeAndState2 = 3085 - View.resolveSizeAndState(0, 0, 0);
                                int packedPositionType2 = 26 - ExpandableListView.getPackedPositionType(0L);
                                byte b7 = $$a[7];
                                short s6 = b7;
                                Object[] objArr117 = new Object[1];
                                d(s6, (byte) (s6 | 52), b7, objArr117);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveOpacity2, iResolveSizeAndState2, packedPositionType2, 1411172903, false, (String) objArr117[0], new Class[]{String.class});
                            }
                            if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2))) {
                                i12 = 1;
                            } else {
                                i12 = 0;
                            }
                        }
                    }
                    i13 = (~(i & 10)) & (i | 10);
                    i14 = (i12 | (-i12)) >> 31;
                    i15 = f778a + 53;
                    i16 = i15 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16;
                    if (i15 % 2 != 0) {
                        throw null;
                    }
                    int i1313 = (~i14) & i;
                    int i1314 = i14 & i13;
                    int i1315 = (i1314 & i1313) | (i1313 ^ i1314);
                    int i1316 = ((i16 | 93) << 1) - (i16 ^ 93);
                    f778a = i1316 % 128;
                    int i1317 = i1316 % 2;
                    i17 = i2 & 32;
                    i18 = (i16 & 63) + (i16 | 63);
                    f778a = i18 % 128;
                    if (i18 % 2 == 0) {
                        int i1318 = -i17;
                        i19 = ((i17 & i1318) | (i17 ^ i1318)) / 38;
                    } else {
                        int i1319 = -i17;
                        i19 = ((i17 & i1319) | (i17 ^ i1319)) >> 31;
                    }
                    int i142 = i1315 & (~i19);
                    int i143 = i19 & i;
                    i8 = (i142 & i143) | (i142 ^ i143);
                }
            } else if (Build.VERSION.SDK_INT == 30) {
                i7 = f778a + 99;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                if (i7 % 2 == 0) {
                    Object obj5 = null;
                    obj5.hashCode();
                    throw null;
                }
                i8 = i;
                i9 = i6;
            } else {
                try {
                    try {
                        if (Build.VERSION.SDK_INT > 33) {
                            int i915 = f778a;
                            int i916 = (i915 ^ 61) + ((i915 & 61) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i916 % 128;
                            int i917 = i916 % 2;
                            bitsPerPixel = ImageFormat.getBitsPerPixel(0);
                            iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ReportDataStore$$ExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            int i918 = bitsPerPixel * 477;
                            i22 = (i918 & (-60800)) + (i918 | (-60800));
                            int i919 = f778a;
                            int i10110 = ((i919 | 73) << 1) - (i919 ^ 73);
                            int i10111 = i10110 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10111;
                            int i10112 = i10110 % 2;
                            i23 = ~(128 | (~bitsPerPixel));
                            i24 = (i10111 & 69) + (i10111 | 69);
                            int i10113 = i24 % 128;
                            f778a = i10113;
                            if (i24 % 2 == 0) {
                                int i10114 = ((-129) ^ bitsPerPixel) | ((-129) & bitsPerPixel);
                                int i10115 = ~((i10114 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i10114 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                i25 = i22 >> ((-476) / ((i23 & i10115) | (i23 ^ i10115)));
                            } else {
                                int i10116 = (i23 | (~(((-129) ^ bitsPerPixel) | ((-129) & bitsPerPixel) | iTuitionPaymentFragmentspecialinlinedviewModeldefault3))) * (-476);
                                i25 = ((i10116 & i22) << 1) + (i22 ^ i10116);
                            }
                            int i10117 = (i10113 & 91) + (i10113 | 91);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10117 % 128;
                            int i10118 = i10117 % 2;
                            int i10119 = -(-(952 * (~(((-129) & bitsPerPixel) | ((-129) ^ bitsPerPixel) | iTuitionPaymentFragmentspecialinlinedviewModeldefault3))));
                            int i11110 = ((i25 | i10119) << 1) - (i25 ^ i10119);
                            int i11111 = i10113 + 77;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11111 % 128;
                            int i11112 = i11111 % 2;
                            int i11113 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i11114 = (i11113 & (-129)) | ((-129) ^ i11113);
                            int i11115 = 476 * (~((bitsPerPixel & i11114) | (i11114 ^ bitsPerPixel)));
                            int i11116 = (i11110 & i11115) + (i11115 | i11110);
                            byte[] bArr7 = {-120, -124, -121, -118, -112, -104, -127, -115, -115, -103, -104, -118, -125, -105, -125, -106, -112, -112, -107, -119, -122, -126, -122, -107, -120, -119, -118, -107};
                            int i11117 = i10113 + 67;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11117 % 128;
                            int i11118 = i11117 % 2;
                            Object[] objArr118 = new Object[1];
                            c(null, null, i11116, bArr7, objArr118);
                            try {
                                Object[] objArr119 = {(String) objArr118[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    char capsMode4 = (char) TextUtils.getCapsMode("", 0, 0);
                                    int defaultSize3 = View.getDefaultSize(0, 0) + 993;
                                    int scrollBarSize4 = 8 - (ViewConfiguration.getScrollBarSize() >> 8);
                                    byte b8 = $$a[7];
                                    short s7 = b8;
                                    Object[] objArr1110 = new Object[1];
                                    d(s7, (byte) (s7 | 52), b8, objArr1110);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(capsMode4, defaultSize3, scrollBarSize4, 410748506, false, (String) objArr1110[0], new Class[]{String.class});
                                }
                                long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr119)).longValue();
                                long j13 = 1249091319;
                                i9 = i6;
                                long j14 = -1;
                                long j15 = j13 ^ j14;
                                long j16 = 191;
                                long j17 = i;
                                long j18 = (((long) (-381)) * j13) + (((long) DerHeader.TAG_CLASS_PRIVATE) * jLongValue3) + (((long) (-191)) * j15) + ((j13 | ((jLongValue3 | j17) ^ j14)) * j16) + (j16 * ((((j17 ^ j14) | jLongValue3) ^ j14) | ((j15 | jLongValue3) ^ j14))) + ((long) (-1450009556));
                                int i11119 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                int i12110 = ((i11119 | 73) << 1) - (i11119 ^ 73);
                                f778a = i12110 % 128;
                                int i12111 = i12110 % 2;
                                int i12112 = (int) (j18 >> 32);
                                int elapsedCpuTime3 = (int) Process.getElapsedCpuTime();
                                int i12113 = i12112 & (1632429706 + (((~((-1480852909) | (~elapsedCpuTime3))) | (~((-43626498) | elapsedCpuTime3))) * (-272)) + (((~(62648851 | elapsedCpuTime3)) | (-1543501760)) * (-272)) + (((~(elapsedCpuTime3 | (-62648852))) | 1499875262) * 272));
                                int i12114 = ((int) j18) & (1324122586 + (((~((-203034913) | i84)) | 1640261322) * (-591)) + (((-203034913) | i) * 591));
                                i12 = (i12113 & i12114) | (i12113 ^ i12114);
                                int i12115 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
                                f778a = i12115 % 128;
                                int i12116 = i12115 % 2;
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 != null) {
                                    throw cause2;
                                }
                                throw th2;
                            }
                        } else {
                            i9 = i6;
                            int iRgb4 = Color.rgb(0, 0, 0) + 16777343;
                            byte[] bArr8 = {-102};
                            int i12117 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i12118 = (i12117 & 7) + (i12117 | 7);
                            f778a = i12118 % 128;
                            int i12119 = i12118 % 2;
                            Object[] objArr1111 = new Object[1];
                            c(null, null, iRgb4, bArr8, objArr1111);
                            str = (String) objArr1111[0];
                            i20 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            int i13110 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            i21 = ((i13110 | 21) << 1) - (i13110 ^ 21);
                            f778a = i21 % 128;
                            if (i21 % 2 == 0) {
                                Object[] objArr1112 = new Object[1];
                                c(null, null, 128 << i20, new byte[]{-118, -112, -104, -127, -115, -115, -103, -104, -118, -125, -121, -123, -124}, objArr1112);
                                try {
                                    objArr3 = new Object[]{(String) objArr1112[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char cMakeMeasureSpec3 = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 33602);
                                        int i13111 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3084;
                                        int mode3 = View.MeasureSpec.getMode(0) + 26;
                                        byte b9 = $$a[7];
                                        short s8 = b9;
                                        Object[] objArr1113 = new Object[1];
                                        d(s8, (byte) (s8 | 52), b9, objArr1113);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMakeMeasureSpec3, i13111, mode3, 1411172903, false, (String) objArr1113[0], new Class[]{String.class});
                                    }
                                    if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3))) {
                                        i12 = 1;
                                    } else {
                                        i12 = 0;
                                    }
                                } catch (Throwable th3) {
                                    Throwable cause3 = th3.getCause();
                                    if (cause3 != null) {
                                        throw cause3;
                                    }
                                    throw th3;
                                }
                            } else {
                                int i13112 = -i20;
                                Object[] objArr1114 = new Object[1];
                                c(null, null, (i13112 & 128) + (i13112 | 128), new byte[]{-118, -112, -104, -127, -115, -115, -103, -104, -118, -125, -121, -123, -124}, objArr1114);
                                try {
                                    objArr2 = new Object[]{(String) objArr1114[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        char cResolveOpacity3 = (char) (33602 - Drawable.resolveOpacity(0, 0));
                                        int iResolveSizeAndState3 = 3085 - View.resolveSizeAndState(0, 0, 0);
                                        int packedPositionType3 = 26 - ExpandableListView.getPackedPositionType(0L);
                                        byte b10 = $$a[7];
                                        short s9 = b10;
                                        Object[] objArr1115 = new Object[1];
                                        d(s9, (byte) (s9 | 52), b10, objArr1115);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveOpacity3, iResolveSizeAndState3, packedPositionType3, 1411172903, false, (String) objArr1115[0], new Class[]{String.class});
                                    }
                                    if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2))) {
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
                        }
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    i9 = i6;
                }
                i13 = (~(i & 10)) & (i | 10);
                i14 = (i12 | (-i12)) >> 31;
                i15 = f778a + 53;
                i16 = i15 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16;
                if (i15 % 2 != 0) {
                    throw null;
                }
                int i13113 = (~i14) & i;
                int i13114 = i14 & i13;
                int i13115 = (i13114 & i13113) | (i13113 ^ i13114);
                int i13116 = ((i16 | 93) << 1) - (i16 ^ 93);
                f778a = i13116 % 128;
                int i13117 = i13116 % 2;
                i17 = i2 & 32;
                i18 = (i16 & 63) + (i16 | 63);
                f778a = i18 % 128;
                if (i18 % 2 == 0) {
                    int i13118 = -i17;
                    i19 = ((i17 & i13118) | (i17 ^ i13118)) / 38;
                } else {
                    int i13119 = -i17;
                    i19 = ((i17 & i13119) | (i17 ^ i13119)) >> 31;
                }
                int i144 = i13115 & (~i19);
                int i145 = i19 & i;
                i8 = (i144 & i145) | (i144 ^ i145);
            }
            int i146 = i ^ i9;
            int i147 = (i146 | (-i146)) >> 31;
            int i148 = f778a;
            int i149 = (i148 ^ 39) + ((i148 & 39) << 1);
            int i150 = i149 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i150;
            if (i149 % 2 != 0) {
                int i151 = i8 & (~i147);
                int i152 = i9 & i147;
                i10 = (i151 & i152) | (i151 ^ i152);
                objArr = new Object[]{new int[1], new int[1]};
                obj = new int[0];
            } else {
                int i153 = i8 & (~i147);
                int i154 = i9 & i147;
                i10 = (i153 & i154) | (i153 ^ i154);
                objArr = new Object[4];
                objArr[0] = new int[1];
                objArr[1] = new int[1];
                obj = new int[1];
            }
            objArr[2] = obj;
            int i155 = ((~i10) & i) | (i10 & i84);
            int i156 = -i155;
            int i157 = (((i155 & i156) | (i155 ^ i156)) >> 31) & 16;
            int i158 = i150 + 105;
            f778a = i158 % 128;
            if (i158 % 2 == 0) {
                c = 0;
                ((int[]) objArr[1])[0] = i;
                obj = objArr[3];
            } else {
                c = 0;
                ((int[]) objArr[0])[0] = i;
            }
            int[] iArr = (int[]) obj;
            int i159 = i150 + 55;
            f778a = i159 % 128;
            if (i159 % 2 == 0) {
                iArr[c] = i10;
                objArr[5] = null;
                i11 = (((((~(406373423 | i84)) | (~(i | 446683652))) * 959) + 2078260831) + (((~(406373423 | i)) | (~(446683652 | i84))) * 959)) >>> i157;
            } else {
                iArr[c] = i10;
                objArr[3] = null;
                int iMyTid = Process.myTid();
                int i160 = ~iMyTid;
                int i161 = 835769736 + ((~(651476883 | i160)) * 979) + ((iMyTid | 691787112) * (-979)) + (((~(iMyTid | 651476883)) | (~(i160 | 691787112))) * 979);
                int i162 = -(-i157);
                i11 = ((i161 | i162) << 1) - (i162 ^ i161);
            }
            int i163 = (i11 * (-665)) + (i3 * 334);
            int i164 = ~i11;
            int i165 = i163 + (i164 * (-333));
            int i166 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i167 = i166 + 43;
            f778a = i167 % 128;
            int i168 = i167 % 2;
            int i169 = ~i;
            int i170 = ~((i169 & i164) | (i164 ^ i169));
            int i171 = ~((i3 ^ i) | (i3 & i));
            int i172 = -(-(333 * ((i170 & i171) | (i170 ^ i171))));
            int i173 = ((i165 | i172) << 1) - (i165 ^ i172);
            int i174 = ~((i164 & i) | (i164 ^ i));
            int i175 = ~((i84 ^ i3) | (i84 & i3));
            int i176 = i166 + 91;
            f778a = i176 % 128;
            int i177 = i176 % 2;
            int i178 = 333 * ((i174 & i175) | (i174 ^ i175));
            int i179 = (i173 & i178) + (i178 | i173);
            int i180 = i179 << 13;
            int i181 = (i179 | i180) & (~(i179 & i180));
            int i182 = i181 >>> 17;
            int i183 = ((~i181) & i182) | ((~i182) & i181);
            ((int[]) objArr[1])[0] = i183 ^ (i183 << 5);
            return objArr;
        } catch (Throwable th5) {
            Throwable cause5 = th5.getCause();
            if (cause5 != null) {
                throw cause5;
            }
            throw th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(short r5, short r6, int r7) {
        /*
            int r5 = 68 - r5
            byte[] r0 = com.google.android.gms.internal.mlkit_common.zznb.$$c
            int r7 = r7 * 2
            int r7 = 4 - r7
            int r6 = r6 * 2
            int r1 = 1 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L16
            r3 = r6
            r4 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L24:
            r3 = r0[r7]
        L26:
            int r3 = -r3
            int r5 = r5 + r3
            int r7 = r7 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_common.zznb.$$e(short, short, int):java.lang.String");
    }
}
