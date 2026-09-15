package com.appsflyer.internal;

import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.ComposerKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.work.WorkInfo;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_CustomAttribute;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1wSDK extends AFh1rSDK {
    private static final byte[] $$c = {48, -119, -71, 110};
    private static final int $$d = 167;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {6, -86, -9, -124};
    private static final int $$b = 137;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int d = 1;
    private static char[] b = {47499, 47489, 47472, 47503, 47506, 47551, 47501, 47490, 47473, 47493, 47494, 47505, 47488, 47504, 47549, 47507, 47470, 47430, 47429, 47547, 47497, 47496, 47509, 47492, 47502, 47427};
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 2047719732;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;

    /* JADX WARN: Code duplicated, block: B:10:0x002e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002e -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 3
            int r7 = 3 - r7
            byte[] r0 = com.appsflyer.internal.AFg1wSDK.$$a
            int r8 = r8 * 2
            int r1 = 1 - r8
            int r6 = r6 * 2
            int r6 = r6 + 98
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L19
            r6 = r7
            r3 = r8
            r4 = r2
            goto L30
        L19:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L1d:
            byte r4 = (byte) r7
            int r6 = r6 + 1
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L2e
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2e:
            r3 = r0[r6]
        L30:
            int r7 = r7 + r3
            r3 = r4
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1wSDK.c(short, int, byte, java.lang.Object[]):void");
    }

    public AFg1wSDK() {
        super("Register", null, Boolean.FALSE);
    }

    @Override // com.appsflyer.internal.AFh1rSDK
    public final AFe1mSDK getCurrencyIso4217Code() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 1;
        d = i2 % 128;
        int i3 = i2 % 2;
        AFe1mSDK aFe1mSDK = AFe1mSDK.REGISTER;
        int i4 = d + 85;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return aFe1mSDK;
    }

    private static void a(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr2 = b;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (31338 - ImageFormat.getBitsPerPixel(0)), 2994 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 17, 1182129903, false, $$e(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43325 - Gravity.getAbsoluteGravity(0, 0)), 253 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
        int i4 = 1687675375;
        long j = 0;
        if (!TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            if (!TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    int i5 = $10 + 7;
                    $11 = i5 % 128;
                    if (i5 % 2 == 0) {
                        cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 + 1) * getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] << i] + iIntValue);
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >>= 1;
                    } else {
                        cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                    }
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
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (33603 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 3085 - (ViewConfiguration.getPressedStateDuration() >> 16), 26 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -2146875848, false, $$e(b4, b5, (byte) (-b5)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
            int i6 = $11 + 7;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 + 1) >> getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] * i] - iIntValue);
                try {
                    Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) + 33601), 3085 - TextUtils.getOffsetAfter("", 0), 25 - ImageFormat.getBitsPerPixel(0), -2146875848, false, $$e(b6, b7, (byte) (-b7)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } else {
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = (byte) (b8 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (33602 - (ViewConfiguration.getTapTimeout() >> 16)), 3085 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 25, -2146875848, false, $$e(b8, b9, (byte) (-b9)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            }
            i4 = 1687675375;
            j = 0;
        }
        objArr[0] = new String(cArr6);
    }

    @Override // com.appsflyer.internal.AFh1rSDK
    public final boolean getRevenue() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 3;
        d = i2 % 128;
        int i3 = i2 % 2;
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0591 A[Catch: Exception -> 0x05a1, TRY_LEAVE, TryCatch #7 {Exception -> 0x05a1, blocks: (B:56:0x0351, B:59:0x0393, B:70:0x044f, B:72:0x0457, B:75:0x0485, B:78:0x049b, B:93:0x0556, B:102:0x058a, B:103:0x0590, B:104:0x0591, B:106:0x0595, B:111:0x059a, B:112:0x05a0, B:79:0x04a5, B:83:0x04f3, B:89:0x0521, B:90:0x0533, B:91:0x0538, B:60:0x039d, B:62:0x03b8, B:66:0x03f5, B:68:0x040c, B:67:0x03f7), top: B:136:0x0351, inners: #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x037c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0393 A[Catch: Exception -> 0x05a1, TRY_ENTER, TRY_LEAVE, TryCatch #7 {Exception -> 0x05a1, blocks: (B:56:0x0351, B:59:0x0393, B:70:0x044f, B:72:0x0457, B:75:0x0485, B:78:0x049b, B:93:0x0556, B:102:0x058a, B:103:0x0590, B:104:0x0591, B:106:0x0595, B:111:0x059a, B:112:0x05a0, B:79:0x04a5, B:83:0x04f3, B:89:0x0521, B:90:0x0533, B:91:0x0538, B:60:0x039d, B:62:0x03b8, B:66:0x03f5, B:68:0x040c, B:67:0x03f7), top: B:136:0x0351, inners: #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:67:0x03f7 A[Catch: all -> 0x0599, TryCatch #5 {all -> 0x0599, blocks: (B:60:0x039d, B:62:0x03b8, B:66:0x03f5, B:68:0x040c, B:67:0x03f7), top: B:133:0x039d, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0457 A[Catch: Exception -> 0x05a1, TRY_LEAVE, TryCatch #7 {Exception -> 0x05a1, blocks: (B:56:0x0351, B:59:0x0393, B:70:0x044f, B:72:0x0457, B:75:0x0485, B:78:0x049b, B:93:0x0556, B:102:0x058a, B:103:0x0590, B:104:0x0591, B:106:0x0595, B:111:0x059a, B:112:0x05a0, B:79:0x04a5, B:83:0x04f3, B:89:0x0521, B:90:0x0533, B:91:0x0538, B:60:0x039d, B:62:0x03b8, B:66:0x03f5, B:68:0x040c, B:67:0x03f7), top: B:136:0x0351, inners: #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0485 A[Catch: Exception -> 0x05a1, TRY_ENTER, TRY_LEAVE, TryCatch #7 {Exception -> 0x05a1, blocks: (B:56:0x0351, B:59:0x0393, B:70:0x044f, B:72:0x0457, B:75:0x0485, B:78:0x049b, B:93:0x0556, B:102:0x058a, B:103:0x0590, B:104:0x0591, B:106:0x0595, B:111:0x059a, B:112:0x05a0, B:79:0x04a5, B:83:0x04f3, B:89:0x0521, B:90:0x0533, B:91:0x0538, B:60:0x039d, B:62:0x03b8, B:66:0x03f5, B:68:0x040c, B:67:0x03f7), top: B:136:0x0351, inners: #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x048b  */
    /* JADX WARN: Code duplicated, block: B:78:0x049b A[Catch: Exception -> 0x05a1, TRY_ENTER, TRY_LEAVE, TryCatch #7 {Exception -> 0x05a1, blocks: (B:56:0x0351, B:59:0x0393, B:70:0x044f, B:72:0x0457, B:75:0x0485, B:78:0x049b, B:93:0x0556, B:102:0x058a, B:103:0x0590, B:104:0x0591, B:106:0x0595, B:111:0x059a, B:112:0x05a0, B:79:0x04a5, B:83:0x04f3, B:89:0x0521, B:90:0x0533, B:91:0x0538, B:60:0x039d, B:62:0x03b8, B:66:0x03f5, B:68:0x040c, B:67:0x03f7), top: B:136:0x0351, inners: #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:85:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:88:0x051a  */
    /* JADX WARN: Code duplicated, block: B:91:0x0538 A[Catch: all -> 0x0589, TRY_LEAVE, TryCatch #4 {all -> 0x0589, blocks: (B:79:0x04a5, B:83:0x04f3, B:89:0x0521, B:90:0x0533, B:91:0x0538), top: B:131:0x04a5, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x055e  */
    /* JADX WARN: Code duplicated, block: B:97:0x056d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x056f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0587  */
    public static Object[] TuitionPaymentFragmentbindingInflater1(int i, int i2) throws Throwable {
        int i3;
        String line;
        Object[] objArr;
        char c;
        int i4;
        File file;
        FileReader fileReader;
        BufferedReader bufferedReader;
        int i5;
        int iTuitionPaymentFragmentbindingInflater1;
        int i6;
        int i7;
        int i8;
        boolean zEquals;
        File file2;
        int i9;
        FileReader fileReader2;
        BufferedReader bufferedReader2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        String str;
        boolean zEquals2;
        int i17;
        String str2;
        char c2;
        int i18 = 2 % 2;
        try {
            String[] strArr = new String[2];
            int i19 = TuitionPaymentFragmentbindingInflater1 + 69;
            d = i19 % 128;
            int i20 = i19 % 2;
            int i21 = -(-(KeyEvent.getMaxKeyCode() >> 16));
            Object[] objArr2 = new Object[1];
            a(null, null, (i21 & 127) + (i21 | 127), new byte[]{-114, -124, -115, -116, -124, -117, -117, -118, -119, -120, -124, -121, -121, -122, -123, -124, -125, -126, -127}, objArr2);
            strArr[0] = (String) objArr2[0];
            int i22 = TuitionPaymentFragmentbindingInflater1 + 69;
            d = i22 % 128;
            if (i22 % 2 == 0) {
                Object[] objArr3 = new Object[1];
                a(null, null, 61 / Gravity.getAbsoluteGravity(0, 1), new byte[]{-120, -124, -121, -121, -122, -123, -124, -125, -120, -118, -111, -121, -117, -127, -115, -127, -112, -113}, objArr3);
                str2 = (String) objArr3[0];
                c2 = 0;
            } else {
                int i23 = -(-Gravity.getAbsoluteGravity(0, 0));
                Object[] objArr4 = new Object[1];
                a(null, null, (i23 & 127) + (i23 | 127), new byte[]{-120, -124, -121, -121, -122, -123, -124, -125, -120, -118, -111, -121, -117, -127, -115, -127, -112, -113}, objArr4);
                str2 = (String) objArr4[0];
                c2 = 1;
            }
            strArr[c2] = str2;
            int i24 = 0;
            while (true) {
                if (i24 >= 2) {
                    i3 = i;
                    break;
                }
                int i25 = d;
                int i26 = (i25 & 73) + (i25 | 73);
                TuitionPaymentFragmentbindingInflater1 = i26 % 128;
                int i27 = i26 % 2;
                String str3 = strArr[i24];
                int i28 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                int i29 = d;
                int i30 = (i29 ^ 21) + ((i29 & 21) << 1);
                TuitionPaymentFragmentbindingInflater1 = i30 % 128;
                int i31 = i30 % 2;
                int iTuitionPaymentFragmentbindingInflater2 = AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1();
                int i32 = i28 * (-1939);
                int i33 = ~(((-128) ^ i28) | ((-128) & i28));
                int i34 = ~iTuitionPaymentFragmentbindingInflater2;
                int i35 = d;
                int i36 = ((i35 | 71) << 1) - (i35 ^ 71);
                TuitionPaymentFragmentbindingInflater1 = i36 % 128;
                int i37 = i36 % 2;
                int i38 = ~((i34 ^ 127) | (i34 & 127));
                int i39 = (i32 ^ 123317) + ((i32 & 123317) << 1) + ((-970) * ((i38 & i33) | (i33 ^ i38)));
                int i40 = ~i28;
                int i41 = (~((i40 & 127) | (i40 ^ 127))) * 1940;
                int i42 = (i39 ^ i41) + ((i41 & i39) << 1);
                int i43 = ~i28;
                int i44 = ~((i43 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i43 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                int i45 = ~iTuitionPaymentFragmentbindingInflater2;
                int i46 = i42 + ((i44 | (~((i45 & 127) | (i45 ^ 127)))) * 970);
                Object[] objArr5 = new Object[1];
                a(null, null, i46, new byte[]{-121, -122, -123, -124, -125, -110, -126, -118, -110, -114, -127, -118, -120, -114, -117, -112}, objArr5);
                Class<?> cls = Class.forName((String) objArr5[0]);
                int i47 = TuitionPaymentFragmentbindingInflater1;
                int i48 = (i47 ^ 119) + ((i47 & 119) << 1);
                d = i48 % 128;
                if (((Boolean) (i48 % 2 == 0 ? cls.getMethod(str3, new Class[0]).invoke(cls, null) : cls.getMethod(str3, new Class[0]).invoke(cls, null))).booleanValue()) {
                    int i49 = d;
                    int i50 = ((i49 | 109) << 1) - (i49 ^ 109);
                    int i51 = i50 % 128;
                    TuitionPaymentFragmentbindingInflater1 = i51;
                    int i52 = i50 % 2;
                    i3 = (i & (-2)) | ((~i) & 1);
                    int i53 = i51 + 67;
                    d = i53 % 128;
                    int i54 = i53 % 2;
                    break;
                }
                i24++;
            }
        } catch (Exception unused) {
            i3 = i ^ 2;
        }
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(109138771);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char keyRepeatTimeout = (char) (2419 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                int maximumDrawingCacheSize = 2845 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 5;
                byte b2 = (byte) 0;
                byte b3 = b2;
                Object[] objArr6 = new Object[1];
                c(b2, b3, b3, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatTimeout, maximumDrawingCacheSize, jumpTapTimeout, -501222268, false, (String) objArr6[0], new Class[0]);
            }
            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
            long j = 641764201;
            long j2 = -1;
            long j3 = j ^ j2;
            int i55 = i3;
            long startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            long j4 = (((long) 567) * j) + (((long) (-565)) * jLongValue) + (((long) (-566)) * (((j3 | jLongValue) ^ j2) | ((j3 | startElapsedRealtime) ^ j2)));
            long j5 = 566;
            long j6 = jLongValue ^ j2;
            long j7 = j4 + (((j | j6) ^ j2) * j5) + (j5 * (j2 ^ (startElapsedRealtime | (j3 | j6)))) + ((long) (-1800950887));
            int i56 = ~i;
            int i57 = ((int) (j7 >> 32)) & ((-2088991750) + (((-1343300933) | i) * 376) + (((~((-1026713485) | i56)) | 757219976) * (-376)) + (((~(1026713484 | i)) | (-1831027401)) * 376));
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i58 = ~iUptimeMillis;
            int i59 = ((int) j7) & ((-355721252) + (((~(i58 | (-1350294109))) | (-86932302)) * (-1042)) + (((-1350294109) | iUptimeMillis) * 521) + (((~(iUptimeMillis | 86932301)) | (-1434450782) | (~(i58 | (-2775629)))) * 521));
            int i60 = (i57 & i59) | (i57 ^ i59);
            int i61 = (~(i & 10)) & (i | 10);
            int i62 = (i60 | 1) & (~(i60 & 1));
            int i63 = -i62;
            int i64 = ((i62 & i63) | (i62 ^ i63)) >> 31;
            int i65 = (i64 & i) | (i61 & (~i64));
            int i66 = i ^ i55;
            int i67 = -i66;
            int i68 = ((i66 & i67) | (i66 ^ i67)) >> 31;
            int i69 = i65 & (~i68);
            int i70 = i55 & i68;
            int i71 = (i69 ^ i70) | (i69 & i70);
            try {
                int i72 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                int iTuitionPaymentFragmentbindingInflater3 = AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1();
                int i73 = (i72 ^ iTuitionPaymentFragmentbindingInflater3) | (i72 & iTuitionPaymentFragmentbindingInflater3);
                int i74 = ~i73;
                int i75 = (((i72 * (-1335)) - 84709) - (~(-(-(((i74 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | ((-128) ^ i74)) * (-668)))))) - 1;
                int i76 = ~((iTuitionPaymentFragmentbindingInflater3 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | ((-128) ^ iTuitionPaymentFragmentbindingInflater3));
                int i77 = (i75 - (~(((i72 & i76) | (i72 ^ i76)) * 1336))) - 1;
                int i78 = ((i73 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i73 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT)) * 668;
                Object[] objArr7 = new Object[1];
                a(null, null, (i77 ^ i78) + ((i78 & i77) << 1), new byte[]{-120, -124, -116, -112, -120, -115, -105, -115, -117, -124, -120, -120, -122, -116, -109, -121, -117, -127, -116, -112, -120, -115, -109, -121, -122, -123, -124, -114, -109, -106, -124, -117, -120, -124, -107, -109, -126, -108, -126, -109}, objArr7);
                File file3 = new File((String) objArr7[0]);
                try {
                    if (file3.canRead()) {
                        FileReader fileReader3 = new FileReader(file3);
                        BufferedReader bufferedReader3 = new BufferedReader(fileReader3);
                        try {
                            line = bufferedReader3.readLine();
                            float fComplexToFloat = TypedValue.complexToFloat(0);
                            int i79 = TuitionPaymentFragmentbindingInflater1;
                            int i80 = ((i79 | 115) << 1) - (i79 ^ 115);
                            d = i80 % 128;
                            if (i80 % 2 == 0) {
                                Object[] objArr8 = new Object[1];
                                a(null, null, 127 << (fComplexToFloat > 2.0f ? 1 : (fComplexToFloat == 2.0f ? 0 : -1)), new byte[]{-104, -118, -117}, objArr8);
                                if (!line.equals((String) objArr8[0])) {
                                    int i81 = d;
                                    int i82 = (i81 & 61) + (i81 | 61);
                                    TuitionPaymentFragmentbindingInflater1 = i82 % 128;
                                    int i83 = i82 % 2;
                                    fileReader3.close();
                                    bufferedReader3.close();
                                }
                                fileReader3.close();
                                bufferedReader3.close();
                                int i84 = d;
                                int i85 = ((i84 | 71) << 1) - (i84 ^ 71);
                                TuitionPaymentFragmentbindingInflater1 = i85 % 128;
                                int i86 = i85 % 2;
                            } else {
                                Object[] objArr9 = new Object[1];
                                a(null, null, 126 - (~(-(-(fComplexToFloat > 0.0f ? 1 : (fComplexToFloat == 0.0f ? 0 : -1))))), new byte[]{-104, -118, -117}, objArr9);
                                if (line.equals((String) objArr9[0])) {
                                    fileReader3.close();
                                    bufferedReader3.close();
                                    int i87 = d;
                                    int i88 = ((i87 | 71) << 1) - (i87 ^ 71);
                                    TuitionPaymentFragmentbindingInflater1 = i88 % 128;
                                    int i89 = i88 % 2;
                                } else {
                                    int i810 = d;
                                    int i811 = (i810 & 61) + (i810 | 61);
                                    TuitionPaymentFragmentbindingInflater1 = i811 % 128;
                                    int i812 = i811 % 2;
                                    fileReader3.close();
                                    bufferedReader3.close();
                                }
                            }
                            int i90 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
                            Object[] objArr10 = new Object[1];
                            a(null, null, (i90 ^ 127) + ((i90 & 127) << 1), new byte[]{-114, -124, -106, -123, -112, -117, -124, -105, -124, -116, -112, -120, -115, -103, -109, -106, -124, -117, -120, -124, -107, -109, -126, -108, -126, -109, -116, -118, -120, -104, -109}, objArr10);
                            file = new File((String) objArr10[0]);
                            if (!file.canRead()) {
                                fileReader = new FileReader(file);
                                bufferedReader = new BufferedReader(fileReader);
                                try {
                                    String line2 = bufferedReader.readLine();
                                    i5 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                    int i91 = TuitionPaymentFragmentbindingInflater1;
                                    int i92 = (i91 & 17) + (i91 | 17);
                                    d = i92 % 128;
                                    int i93 = i92 % 2;
                                    iTuitionPaymentFragmentbindingInflater1 = AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1();
                                    int i94 = i5 * (-209);
                                    int i95 = (i94 ^ (-26543)) + ((i94 & (-26543)) << 1);
                                    int i96 = ~i5;
                                    i6 = (i95 - (~((~((i96 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i96 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT))) * 210))) - 1;
                                    int i97 = d;
                                    i7 = ((i97 | 99) << 1) - (i97 ^ 99);
                                    TuitionPaymentFragmentbindingInflater1 = i7 % 128;
                                    if (i7 % 2 != 0) {
                                        int i98 = ~iTuitionPaymentFragmentbindingInflater1;
                                        int i99 = ~((i98 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | ((-128) ^ i98));
                                        int i100 = ~i5;
                                        int i101 = ~((i100 ^ iTuitionPaymentFragmentbindingInflater1) | (i100 & iTuitionPaymentFragmentbindingInflater1));
                                        i8 = i6 % (((i99 ^ i101) | (i99 & i101)) * 210);
                                    } else {
                                        int i102 = ~((~iTuitionPaymentFragmentbindingInflater1) | WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT);
                                        int i103 = ~i5;
                                        int i104 = -(-((i102 | (~((i103 ^ iTuitionPaymentFragmentbindingInflater1) | (i103 & iTuitionPaymentFragmentbindingInflater1)))) * 210));
                                        i8 = (i6 ^ i104) + ((i104 & i6) << 1);
                                    }
                                    int i105 = ~i5;
                                    int i106 = ~iTuitionPaymentFragmentbindingInflater1;
                                    int i107 = (i105 ^ i106) | (i105 & i106);
                                    int i108 = ~((i107 & 127) | (i107 ^ 127));
                                    int i109 = (i5 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | ((-128) ^ i5);
                                    int i110 = ~((i109 & iTuitionPaymentFragmentbindingInflater1) | (i109 ^ iTuitionPaymentFragmentbindingInflater1));
                                    Object[] objArr11 = new Object[1];
                                    a(null, null, (i8 - (~(-(-(210 * ((i110 & i108) | (i108 ^ i110))))))) - 1, new byte[]{-102}, objArr11);
                                    zEquals = line2.equals((String) objArr11[0]);
                                    int i111 = d + 89;
                                    TuitionPaymentFragmentbindingInflater1 = i111 % 128;
                                    int i112 = i111 % 2;
                                    fileReader.close();
                                    bufferedReader.close();
                                    if (zEquals) {
                                        Object[] objArr12 = new Object[1];
                                        a(null, null, 126 - (~(-(ViewConfiguration.getScrollBarFadeDuration() >> 16))), new byte[]{-117, -118, -105, -121, -117, -127, -116, -112, -120, -115, -109, -121, -117, -127, -116, -112, -120, -115, -109, -121, -122, -123, -124, -114, -109, -106, -124, -117, -120, -124, -107, -109, -126, -108, -126, -109}, objArr12);
                                        file2 = new File((String) objArr12[0]);
                                        i9 = TuitionPaymentFragmentbindingInflater1 + 71;
                                        d = i9 % 128;
                                        if (i9 % 2 != 0) {
                                            file2.canRead();
                                            throw null;
                                        }
                                        if (file2.canRead()) {
                                            fileReader2 = new FileReader(file2);
                                            bufferedReader2 = new BufferedReader(fileReader2);
                                            try {
                                                String line3 = bufferedReader2.readLine();
                                                i10 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                int i113 = i10 * (-755);
                                                int i114 = ((i113 | (-95130)) << 1) - (i113 ^ (-95130));
                                                int i115 = ~i10;
                                                int i116 = -(-((~((i115 & ComposerKt.defaultsKey) | (i115 ^ ComposerKt.defaultsKey))) * 1512));
                                                i11 = (i114 & i116) + (i116 | i114);
                                                int i117 = ~i10;
                                                i12 = ~((i117 & ComposerKt.defaultsKey) | (i117 ^ ComposerKt.defaultsKey));
                                                int i118 = d;
                                                i13 = (i118 & 27) + (i118 | 27);
                                                TuitionPaymentFragmentbindingInflater1 = i13 % 128;
                                                if (i13 % 2 != 0) {
                                                    i14 = (i10 & 126) | (i10 ^ 126);
                                                    int i119 = ~((i14 ^ i) | (i14 & i));
                                                    i15 = i11 >> ((-756) / ((i12 ^ i119) | (i12 & i119)));
                                                } else {
                                                    i14 = (i10 & 126) | (i10 ^ 126);
                                                    int i120 = ~((i14 ^ i) | (i14 & i));
                                                    i15 = (((i12 ^ i120) | (i12 & i120)) * (-756)) + i11;
                                                }
                                                i16 = (i118 ^ 5) + ((i118 & 5) << 1);
                                                TuitionPaymentFragmentbindingInflater1 = i16 % 128;
                                                if (i16 % 2 != 0) {
                                                    int i121 = ~i;
                                                    Object[] objArr13 = new Object[1];
                                                    a(null, null, i15 % (756 >> ((i14 & i121) | (i14 ^ i121))), new byte[]{-102}, objArr13);
                                                    str = (String) objArr13[0];
                                                } else {
                                                    int i122 = ~i;
                                                    int i123 = -(-(756 * ((i14 & i122) | (i14 ^ i122))));
                                                    Object[] objArr14 = new Object[1];
                                                    a(null, null, (i15 & i123) + (i123 | i15), new byte[]{-102}, objArr14);
                                                    str = (String) objArr14[0];
                                                }
                                                zEquals2 = line3.equals(str);
                                                fileReader2.close();
                                                bufferedReader2.close();
                                                if (zEquals2) {
                                                    int i124 = d;
                                                    i17 = (i124 & 15) + (i124 | 15);
                                                    TuitionPaymentFragmentbindingInflater1 = i17 % 128;
                                                    i4 = 2;
                                                    if (i17 % 2 == 0) {
                                                        throw null;
                                                    }
                                                    if (line != null) {
                                                        objArr = new Object[]{new int[]{(i & (-21)) | (i56 & 20)}, new String[]{line}};
                                                        c = 0;
                                                    }
                                                }
                                                objArr = new Object[i4];
                                                c = 0;
                                                objArr[0] = new int[]{i};
                                                objArr[1] = new String[0];
                                            } catch (Throwable th) {
                                                fileReader2.close();
                                                bufferedReader2.close();
                                                throw th;
                                            }
                                        } else {
                                            int i125 = TuitionPaymentFragmentbindingInflater1;
                                            int i126 = (i125 ^ 79) + ((i125 & 79) << 1);
                                            d = i126 % 128;
                                            int i127 = i126 % 2;
                                        }
                                    }
                                    int i128 = ((int[]) objArr[c])[c];
                                    int i129 = i ^ i71;
                                    int i130 = -i129;
                                    int i131 = ((i129 & i130) | (i129 ^ i130)) >> 31;
                                    int i132 = (~i131) & i128;
                                    int i133 = i71 & i131;
                                    int i134 = (i133 & i132) | (i132 ^ i133);
                                    String[] strArr2 = (String[]) objArr[1];
                                    Object[] objArr15 = new Object[2];
                                    int i135 = (i128 & i56) | ((~i128) & i);
                                    int i136 = ((i135 | (-i135)) >> 31) & 1;
                                    int i137 = -i136;
                                    int i138 = (~(((i137 & i136) | (i136 ^ i137)) >> 31)) & 1;
                                    objArr15[i136] = null;
                                    objArr15[i138] = strArr2;
                                    String[] strArr3 = (String[]) objArr15[0];
                                    int i139 = TuitionPaymentFragmentbindingInflater1 + 123;
                                    int i140 = i139 % 128;
                                    d = i140;
                                    int i141 = i139 % 2;
                                    int i142 = i ^ i134;
                                    int i143 = -i142;
                                    int i144 = (((i142 & i143) | (i142 ^ i143)) >> 31) & 16;
                                    int i145 = ((i140 | 107) << 1) - (i140 ^ 107);
                                    TuitionPaymentFragmentbindingInflater1 = i145 % 128;
                                    int i146 = i145 % 2;
                                    Object[] objArr16 = {new int[]{i}, new int[1], new int[]{i134}, strArr3};
                                    int i147 = ((1527527524 + (((~((-168260755) | i56)) | 127950525) * (-933))) + (((~(127950525 | i56)) | (-262635200)) * 933)) - 2142956031;
                                    int iTuitionPaymentFragmentbindingInflater4 = AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1();
                                    int i148 = ((i144 * 595) - (~(-(-(i147 * (-1187)))))) - 1;
                                    int i149 = ~i144;
                                    int i150 = ~((i149 ^ i147) | (i149 & i147));
                                    int i151 = ~iTuitionPaymentFragmentbindingInflater4;
                                    int i152 = ~((i151 ^ i147) | (i151 & i147));
                                    int i153 = ((i150 & i152) | (i150 ^ i152)) * (-1188);
                                    int i154 = (i148 & i153) + (i148 | i153);
                                    int i155 = ~(i149 | i147);
                                    int i156 = ~((~i147) | iTuitionPaymentFragmentbindingInflater4);
                                    int i157 = (i155 & i156) | (i155 ^ i156);
                                    int i158 = ~((i151 ^ i144) | (i151 & i144));
                                    int i159 = (i154 - (~(((i157 & i158) | (i157 ^ i158)) * 594))) - 1;
                                    int i160 = ~i147;
                                    int i161 = ~iTuitionPaymentFragmentbindingInflater4;
                                    int i162 = ~((i160 ^ i161) | (i160 & i161));
                                    int i163 = d;
                                    int i164 = (i163 ^ 125) + ((i163 & 125) << 1);
                                    TuitionPaymentFragmentbindingInflater1 = i164 % 128;
                                    int i165 = i164 % 2;
                                    int i166 = ((i160 & i144) | (i160 ^ i144)) ^ (-1);
                                    int i167 = -(-(594 * ((~((i161 & i144) | (i161 ^ i144))) | (i166 & i162) | (i162 ^ i166))));
                                    int i168 = (i2 - (~(-(-(((i159 | i167) << 1) - (i167 ^ i159)))))) - 1;
                                    int i169 = i168 << 13;
                                    int i170 = ((~i168) & i169) | ((~i169) & i168);
                                    int i171 = i170 >>> 17;
                                    int i172 = ((~i170) & i171) | ((~i171) & i170);
                                    int i173 = i172 << 5;
                                    ((int[]) objArr16[1])[0] = (i172 | i173) & (~(i172 & i173));
                                    return objArr16;
                                } catch (Throwable th2) {
                                    fileReader.close();
                                    bufferedReader.close();
                                    throw th2;
                                }
                            }
                            int i174 = TuitionPaymentFragmentbindingInflater1;
                            int i175 = ((i174 | 93) << 1) - (i174 ^ 93);
                            d = i175 % 128;
                            int i176 = i175 % 2;
                            int i177 = i174 + 115;
                            d = i177 % 128;
                            int i178 = i177 % 2;
                            i4 = 2;
                            objArr = new Object[i4];
                            c = 0;
                            objArr[0] = new int[]{i};
                            objArr[1] = new String[0];
                            int i1210 = ((int[]) objArr[c])[c];
                            int i1211 = i ^ i71;
                            int i1310 = -i1211;
                            int i1311 = ((i1211 & i1310) | (i1211 ^ i1310)) >> 31;
                            int i1312 = (~i1311) & i1210;
                            int i1313 = i71 & i1311;
                            int i1314 = (i1313 & i1312) | (i1312 ^ i1313);
                            String[] strArr4 = (String[]) objArr[1];
                            Object[] objArr17 = new Object[2];
                            int i1315 = (i1210 & i56) | ((~i1210) & i);
                            int i1316 = ((i1315 | (-i1315)) >> 31) & 1;
                            int i1317 = -i1316;
                            int i1318 = (~(((i1317 & i1316) | (i1316 ^ i1317)) >> 31)) & 1;
                            objArr17[i1316] = null;
                            objArr17[i1318] = strArr4;
                            String[] strArr5 = (String[]) objArr17[0];
                            int i1319 = TuitionPaymentFragmentbindingInflater1 + 123;
                            int i1410 = i1319 % 128;
                            d = i1410;
                            int i1411 = i1319 % 2;
                            int i1412 = i ^ i1314;
                            int i1413 = -i1412;
                            int i1414 = (((i1412 & i1413) | (i1412 ^ i1413)) >> 31) & 16;
                            int i1415 = ((i1410 | 107) << 1) - (i1410 ^ 107);
                            TuitionPaymentFragmentbindingInflater1 = i1415 % 128;
                            int i1416 = i1415 % 2;
                            Object[] objArr18 = {new int[]{i}, new int[1], new int[]{i1314}, strArr5};
                            int i1417 = ((1527527524 + (((~((-168260755) | i56)) | 127950525) * (-933))) + (((~(127950525 | i56)) | (-262635200)) * 933)) - 2142956031;
                            int iTuitionPaymentFragmentbindingInflater5 = AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1();
                            int i1418 = ((i1414 * 595) - (~(-(-(i1417 * (-1187)))))) - 1;
                            int i1419 = ~i1414;
                            int i1510 = ~((i1419 ^ i1417) | (i1419 & i1417));
                            int i1511 = ~iTuitionPaymentFragmentbindingInflater5;
                            int i1512 = ~((i1511 ^ i1417) | (i1511 & i1417));
                            int i1513 = ((i1510 & i1512) | (i1510 ^ i1512)) * (-1188);
                            int i1514 = (i1418 & i1513) + (i1418 | i1513);
                            int i1515 = ~(i1419 | i1417);
                            int i1516 = ~((~i1417) | iTuitionPaymentFragmentbindingInflater5);
                            int i1517 = (i1515 & i1516) | (i1515 ^ i1516);
                            int i1518 = ~((i1511 ^ i1414) | (i1511 & i1414));
                            int i1519 = (i1514 - (~(((i1517 & i1518) | (i1517 ^ i1518)) * 594))) - 1;
                            int i1610 = ~i1417;
                            int i1611 = ~iTuitionPaymentFragmentbindingInflater5;
                            int i1612 = ~((i1610 ^ i1611) | (i1610 & i1611));
                            int i1613 = d;
                            int i1614 = (i1613 ^ 125) + ((i1613 & 125) << 1);
                            TuitionPaymentFragmentbindingInflater1 = i1614 % 128;
                            int i1615 = i1614 % 2;
                            int i1616 = ((i1610 & i1414) | (i1610 ^ i1414)) ^ (-1);
                            int i1617 = -(-(594 * ((~((i1611 & i1414) | (i1611 ^ i1414))) | (i1616 & i1612) | (i1612 ^ i1616))));
                            int i1618 = (i2 - (~(-(-(((i1519 | i1617) << 1) - (i1617 ^ i1519)))))) - 1;
                            int i1619 = i1618 << 13;
                            int i179 = ((~i1618) & i1619) | ((~i1619) & i1618);
                            int i1710 = i179 >>> 17;
                            int i1711 = ((~i179) & i1710) | ((~i1710) & i179);
                            int i1712 = i1711 << 5;
                            ((int[]) objArr18[1])[0] = (i1711 | i1712) & (~(i1711 & i1712));
                            return objArr18;
                        } catch (Throwable th3) {
                            fileReader3.close();
                            bufferedReader3.close();
                            throw th3;
                        }
                    }
                    int i180 = d + 71;
                    TuitionPaymentFragmentbindingInflater1 = i180 % 128;
                    int i181 = i180 % 2;
                    int i910 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
                    Object[] objArr19 = new Object[1];
                    a(null, null, (i910 ^ 127) + ((i910 & 127) << 1), new byte[]{-114, -124, -106, -123, -112, -117, -124, -105, -124, -116, -112, -120, -115, -103, -109, -106, -124, -117, -120, -124, -107, -109, -126, -108, -126, -109, -116, -118, -120, -104, -109}, objArr19);
                    file = new File((String) objArr19[0]);
                    if (!file.canRead()) {
                        fileReader = new FileReader(file);
                        bufferedReader = new BufferedReader(fileReader);
                        String line4 = bufferedReader.readLine();
                        i5 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int i911 = TuitionPaymentFragmentbindingInflater1;
                        int i912 = (i911 & 17) + (i911 | 17);
                        d = i912 % 128;
                        int i913 = i912 % 2;
                        iTuitionPaymentFragmentbindingInflater1 = AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1();
                        int i914 = i5 * (-209);
                        int i915 = (i914 ^ (-26543)) + ((i914 & (-26543)) << 1);
                        int i916 = ~i5;
                        i6 = (i915 - (~((~((i916 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i916 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT))) * 210))) - 1;
                        int i917 = d;
                        i7 = ((i917 | 99) << 1) - (i917 ^ 99);
                        TuitionPaymentFragmentbindingInflater1 = i7 % 128;
                        if (i7 % 2 != 0) {
                            int i918 = ~iTuitionPaymentFragmentbindingInflater1;
                            int i919 = ~((i918 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | ((-128) ^ i918));
                            int i1010 = ~i5;
                            int i1011 = ~((i1010 ^ iTuitionPaymentFragmentbindingInflater1) | (i1010 & iTuitionPaymentFragmentbindingInflater1));
                            i8 = i6 % (((i919 ^ i1011) | (i919 & i1011)) * 210);
                        } else {
                            int i1012 = ~((~iTuitionPaymentFragmentbindingInflater1) | WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT);
                            int i1013 = ~i5;
                            int i1014 = -(-((i1012 | (~((i1013 ^ iTuitionPaymentFragmentbindingInflater1) | (i1013 & iTuitionPaymentFragmentbindingInflater1)))) * 210));
                            i8 = (i6 ^ i1014) + ((i1014 & i6) << 1);
                        }
                        int i1015 = ~i5;
                        int i1016 = ~iTuitionPaymentFragmentbindingInflater1;
                        int i1017 = (i1015 ^ i1016) | (i1015 & i1016);
                        int i1018 = ~((i1017 & 127) | (i1017 ^ 127));
                        int i1019 = (i5 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | ((-128) ^ i5);
                        int i1110 = ~((i1019 & iTuitionPaymentFragmentbindingInflater1) | (i1019 ^ iTuitionPaymentFragmentbindingInflater1));
                        Object[] objArr110 = new Object[1];
                        a(null, null, (i8 - (~(-(-(210 * ((i1110 & i1018) | (i1018 ^ i1110))))))) - 1, new byte[]{-102}, objArr110);
                        zEquals = line4.equals((String) objArr110[0]);
                        int i1111 = d + 89;
                        TuitionPaymentFragmentbindingInflater1 = i1111 % 128;
                        int i1112 = i1111 % 2;
                        fileReader.close();
                        bufferedReader.close();
                        if (zEquals) {
                            Object[] objArr111 = new Object[1];
                            a(null, null, 126 - (~(-(ViewConfiguration.getScrollBarFadeDuration() >> 16))), new byte[]{-117, -118, -105, -121, -117, -127, -116, -112, -120, -115, -109, -121, -117, -127, -116, -112, -120, -115, -109, -121, -122, -123, -124, -114, -109, -106, -124, -117, -120, -124, -107, -109, -126, -108, -126, -109}, objArr111);
                            file2 = new File((String) objArr111[0]);
                            i9 = TuitionPaymentFragmentbindingInflater1 + 71;
                            d = i9 % 128;
                            if (i9 % 2 != 0) {
                                file2.canRead();
                                throw null;
                            }
                            if (file2.canRead()) {
                                int i1212 = TuitionPaymentFragmentbindingInflater1;
                                int i1213 = (i1212 ^ 79) + ((i1212 & 79) << 1);
                                d = i1213 % 128;
                                int i1214 = i1213 % 2;
                            } else {
                                fileReader2 = new FileReader(file2);
                                bufferedReader2 = new BufferedReader(fileReader2);
                                String line5 = bufferedReader2.readLine();
                                i10 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                int i1113 = i10 * (-755);
                                int i1114 = ((i1113 | (-95130)) << 1) - (i1113 ^ (-95130));
                                int i1115 = ~i10;
                                int i1116 = -(-((~((i1115 & ComposerKt.defaultsKey) | (i1115 ^ ComposerKt.defaultsKey))) * 1512));
                                i11 = (i1114 & i1116) + (i1116 | i1114);
                                int i1117 = ~i10;
                                i12 = ~((i1117 & ComposerKt.defaultsKey) | (i1117 ^ ComposerKt.defaultsKey));
                                int i1118 = d;
                                i13 = (i1118 & 27) + (i1118 | 27);
                                TuitionPaymentFragmentbindingInflater1 = i13 % 128;
                                if (i13 % 2 != 0) {
                                    i14 = (i10 & 126) | (i10 ^ 126);
                                    int i1119 = ~((i14 ^ i) | (i14 & i));
                                    i15 = i11 >> ((-756) / ((i12 ^ i1119) | (i12 & i1119)));
                                } else {
                                    i14 = (i10 & 126) | (i10 ^ 126);
                                    int i1215 = ~((i14 ^ i) | (i14 & i));
                                    i15 = (((i12 ^ i1215) | (i12 & i1215)) * (-756)) + i11;
                                }
                                i16 = (i1118 ^ 5) + ((i1118 & 5) << 1);
                                TuitionPaymentFragmentbindingInflater1 = i16 % 128;
                                if (i16 % 2 != 0) {
                                    int i1216 = ~i;
                                    Object[] objArr112 = new Object[1];
                                    a(null, null, i15 % (756 >> ((i14 & i1216) | (i14 ^ i1216))), new byte[]{-102}, objArr112);
                                    str = (String) objArr112[0];
                                } else {
                                    int i1217 = ~i;
                                    int i1218 = -(-(756 * ((i14 & i1217) | (i14 ^ i1217))));
                                    Object[] objArr113 = new Object[1];
                                    a(null, null, (i15 & i1218) + (i1218 | i15), new byte[]{-102}, objArr113);
                                    str = (String) objArr113[0];
                                }
                                zEquals2 = line5.equals(str);
                                fileReader2.close();
                                bufferedReader2.close();
                                if (zEquals2) {
                                    int i1219 = d;
                                    i17 = (i1219 & 15) + (i1219 | 15);
                                    TuitionPaymentFragmentbindingInflater1 = i17 % 128;
                                    i4 = 2;
                                    if (i17 % 2 == 0) {
                                        throw null;
                                    }
                                    if (line != null) {
                                        objArr = new Object[]{new int[]{(i & (-21)) | (i56 & 20)}, new String[]{line}};
                                        c = 0;
                                    }
                                }
                                objArr = new Object[i4];
                                c = 0;
                                objArr[0] = new int[]{i};
                                objArr[1] = new String[0];
                            }
                        }
                        int i12110 = ((int[]) objArr[c])[c];
                        int i12111 = i ^ i71;
                        int i13110 = -i12111;
                        int i13111 = ((i12111 & i13110) | (i12111 ^ i13110)) >> 31;
                        int i13112 = (~i13111) & i12110;
                        int i13113 = i71 & i13111;
                        int i13114 = (i13113 & i13112) | (i13112 ^ i13113);
                        String[] strArr6 = (String[]) objArr[1];
                        Object[] objArr114 = new Object[2];
                        int i13115 = (i12110 & i56) | ((~i12110) & i);
                        int i13116 = ((i13115 | (-i13115)) >> 31) & 1;
                        int i13117 = -i13116;
                        int i13118 = (~(((i13117 & i13116) | (i13116 ^ i13117)) >> 31)) & 1;
                        objArr114[i13116] = null;
                        objArr114[i13118] = strArr6;
                        String[] strArr7 = (String[]) objArr114[0];
                        int i13119 = TuitionPaymentFragmentbindingInflater1 + 123;
                        int i14110 = i13119 % 128;
                        d = i14110;
                        int i14111 = i13119 % 2;
                        int i14112 = i ^ i13114;
                        int i14113 = -i14112;
                        int i14114 = (((i14112 & i14113) | (i14112 ^ i14113)) >> 31) & 16;
                        int i14115 = ((i14110 | 107) << 1) - (i14110 ^ 107);
                        TuitionPaymentFragmentbindingInflater1 = i14115 % 128;
                        int i14116 = i14115 % 2;
                        Object[] objArr115 = {new int[]{i}, new int[1], new int[]{i13114}, strArr7};
                        int i14117 = ((1527527524 + (((~((-168260755) | i56)) | 127950525) * (-933))) + (((~(127950525 | i56)) | (-262635200)) * 933)) - 2142956031;
                        int iTuitionPaymentFragmentbindingInflater6 = AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1();
                        int i14118 = ((i14114 * 595) - (~(-(-(i14117 * (-1187)))))) - 1;
                        int i14119 = ~i14114;
                        int i15110 = ~((i14119 ^ i14117) | (i14119 & i14117));
                        int i15111 = ~iTuitionPaymentFragmentbindingInflater6;
                        int i15112 = ~((i15111 ^ i14117) | (i15111 & i14117));
                        int i15113 = ((i15110 & i15112) | (i15110 ^ i15112)) * (-1188);
                        int i15114 = (i14118 & i15113) + (i14118 | i15113);
                        int i15115 = ~(i14119 | i14117);
                        int i15116 = ~((~i14117) | iTuitionPaymentFragmentbindingInflater6);
                        int i15117 = (i15115 & i15116) | (i15115 ^ i15116);
                        int i15118 = ~((i15111 ^ i14114) | (i15111 & i14114));
                        int i15119 = (i15114 - (~(((i15117 & i15118) | (i15117 ^ i15118)) * 594))) - 1;
                        int i16110 = ~i14117;
                        int i16111 = ~iTuitionPaymentFragmentbindingInflater6;
                        int i16112 = ~((i16110 ^ i16111) | (i16110 & i16111));
                        int i16113 = d;
                        int i16114 = (i16113 ^ 125) + ((i16113 & 125) << 1);
                        TuitionPaymentFragmentbindingInflater1 = i16114 % 128;
                        int i16115 = i16114 % 2;
                        int i16116 = ((i16110 & i14114) | (i16110 ^ i14114)) ^ (-1);
                        int i16117 = -(-(594 * ((~((i16111 & i14114) | (i16111 ^ i14114))) | (i16116 & i16112) | (i16112 ^ i16116))));
                        int i16118 = (i2 - (~(-(-(((i15119 | i16117) << 1) - (i16117 ^ i15119)))))) - 1;
                        int i16119 = i16118 << 13;
                        int i1713 = ((~i16118) & i16119) | ((~i16119) & i16118);
                        int i1714 = i1713 >>> 17;
                        int i1715 = ((~i1713) & i1714) | ((~i1714) & i1713);
                        int i1716 = i1715 << 5;
                        ((int[]) objArr115[1])[0] = (i1715 | i1716) & (~(i1715 & i1716));
                        return objArr115;
                    }
                    int i1717 = TuitionPaymentFragmentbindingInflater1;
                    int i1718 = ((i1717 | 93) << 1) - (i1717 ^ 93);
                    d = i1718 % 128;
                    int i1719 = i1718 % 2;
                    int i1720 = i1717 + 115;
                    d = i1720 % 128;
                    int i1721 = i1720 % 2;
                } catch (Exception unused2) {
                }
            } catch (Exception unused3) {
            }
            line = null;
            i4 = 2;
            objArr = new Object[i4];
            c = 0;
            objArr[0] = new int[]{i};
            objArr[1] = new String[0];
            int i12112 = ((int[]) objArr[c])[c];
            int i12113 = i ^ i71;
            int i131110 = -i12113;
            int i131111 = ((i12113 & i131110) | (i12113 ^ i131110)) >> 31;
            int i131112 = (~i131111) & i12112;
            int i131113 = i71 & i131111;
            int i131114 = (i131113 & i131112) | (i131112 ^ i131113);
            String[] strArr8 = (String[]) objArr[1];
            Object[] objArr116 = new Object[2];
            int i131115 = (i12112 & i56) | ((~i12112) & i);
            int i131116 = ((i131115 | (-i131115)) >> 31) & 1;
            int i131117 = -i131116;
            int i131118 = (~(((i131117 & i131116) | (i131116 ^ i131117)) >> 31)) & 1;
            objArr116[i131116] = null;
            objArr116[i131118] = strArr8;
            String[] strArr9 = (String[]) objArr116[0];
            int i131119 = TuitionPaymentFragmentbindingInflater1 + 123;
            int i141110 = i131119 % 128;
            d = i141110;
            int i141111 = i131119 % 2;
            int i141112 = i ^ i131114;
            int i141113 = -i141112;
            int i141114 = (((i141112 & i141113) | (i141112 ^ i141113)) >> 31) & 16;
            int i141115 = ((i141110 | 107) << 1) - (i141110 ^ 107);
            TuitionPaymentFragmentbindingInflater1 = i141115 % 128;
            int i141116 = i141115 % 2;
            Object[] objArr117 = {new int[]{i}, new int[1], new int[]{i131114}, strArr9};
            int i141117 = ((1527527524 + (((~((-168260755) | i56)) | 127950525) * (-933))) + (((~(127950525 | i56)) | (-262635200)) * 933)) - 2142956031;
            int iTuitionPaymentFragmentbindingInflater7 = AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1();
            int i141118 = ((i141114 * 595) - (~(-(-(i141117 * (-1187)))))) - 1;
            int i141119 = ~i141114;
            int i151110 = ~((i141119 ^ i141117) | (i141119 & i141117));
            int i151111 = ~iTuitionPaymentFragmentbindingInflater7;
            int i151112 = ~((i151111 ^ i141117) | (i151111 & i141117));
            int i151113 = ((i151110 & i151112) | (i151110 ^ i151112)) * (-1188);
            int i151114 = (i141118 & i151113) + (i141118 | i151113);
            int i151115 = ~(i141119 | i141117);
            int i151116 = ~((~i141117) | iTuitionPaymentFragmentbindingInflater7);
            int i151117 = (i151115 & i151116) | (i151115 ^ i151116);
            int i151118 = ~((i151111 ^ i141114) | (i151111 & i141114));
            int i151119 = (i151114 - (~(((i151117 & i151118) | (i151117 ^ i151118)) * 594))) - 1;
            int i161110 = ~i141117;
            int i161111 = ~iTuitionPaymentFragmentbindingInflater7;
            int i161112 = ~((i161110 ^ i161111) | (i161110 & i161111));
            int i161113 = d;
            int i161114 = (i161113 ^ 125) + ((i161113 & 125) << 1);
            TuitionPaymentFragmentbindingInflater1 = i161114 % 128;
            int i161115 = i161114 % 2;
            int i161116 = ((i161110 & i141114) | (i161110 ^ i141114)) ^ (-1);
            int i161117 = -(-(594 * ((~((i161111 & i141114) | (i161111 ^ i141114))) | (i161116 & i161112) | (i161112 ^ i161116))));
            int i161118 = (i2 - (~(-(-(((i151119 | i161117) << 1) - (i161117 ^ i151119)))))) - 1;
            int i161119 = i161118 << 13;
            int i17110 = ((~i161118) & i161119) | ((~i161119) & i161118);
            int i17111 = i17110 >>> 17;
            int i17112 = ((~i17110) & i17111) | ((~i17111) & i17110);
            int i17113 = i17112 << 5;
            ((int[]) objArr117[1])[0] = (i17112 | i17113) & (~(i17112 & i17113));
            return objArr117;
        } catch (Throwable th4) {
            Throwable cause = th4.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(int r6, short r7, int r8) {
        /*
            int r7 = r7 + 4
            int r6 = r6 * 3
            int r0 = 1 - r6
            byte[] r1 = com.appsflyer.internal.AFg1wSDK.$$c
            int r8 = 68 - r8
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2d
        L14:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L18:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2d:
            int r8 = -r8
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1wSDK.$$e(int, short, int):java.lang.String");
    }
}
