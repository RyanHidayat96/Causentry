package com.datatheorem.android.trustkit.config;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bpjstku.util.custom.WrapContentLinearLayoutManager;
import defpackage.initSession;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes6.dex */
public final class ConfigurationException extends RuntimeException {
    private static final byte[] $$c = {93, -77, 2, Base64.padSymbol};
    private static final int $$d = 9;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {25, -93, -120, -48};
    private static final int $$b = 25;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static int b = -83722384;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.datatheorem.android.trustkit.config.ConfigurationException.$$a
            int r7 = r7 * 4
            int r1 = r7 + 1
            int r8 = r8 * 3
            int r8 = 98 - r8
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2e
        L15:
            r3 = r2
        L16:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datatheorem.android.trustkit.config.ConfigurationException.c(byte, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0167  */
    /* JADX WARN: Code duplicated, block: B:36:0x0168  */
    private static void a(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4;
        char[] cArr2;
        Throwable cause;
        int i5 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr3 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (true) {
            i4 = 29209604;
            if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i2) {
                break;
            }
            int i6 = $11 + 111;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i8 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i8]), Integer.valueOf(b)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.getOffsetAfter("", 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3291, 30 - ImageFormat.getBitsPerPixel(0), 1199271174, false, $$e(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getPressedStateDuration() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 651, 43 - ImageFormat.getBitsPerPixel(0), -450685997, false, $$e(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i3 > 0) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr4 = new char[i2];
            System.arraycopy(cArr3, 0, cArr4, 0, i2);
            System.arraycopy(cArr4, 0, cArr3, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr4, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr3, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            int i9 = $10 + 25;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            } else {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            }
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) TextUtils.getOffsetAfter("", 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 652, 45 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -450685997, false, $$e(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                i4 = 29209604;
            }
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0924  */
    /* JADX WARN: Code duplicated, block: B:105:0x093e  */
    /* JADX WARN: Code duplicated, block: B:106:0x094a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0971  */
    /* JADX WARN: Code duplicated, block: B:111:0x097d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0624 A[Catch: Exception -> 0x0924, TRY_LEAVE, TryCatch #6 {Exception -> 0x0924, blocks: (B:42:0x059a, B:44:0x061d, B:46:0x0624, B:55:0x0693, B:57:0x069b, B:60:0x078e, B:79:0x0894, B:93:0x090a, B:97:0x0915, B:98:0x091b, B:100:0x091d, B:101:0x0923, B:62:0x07a5, B:66:0x07ee, B:72:0x083e, B:76:0x0869, B:47:0x062e, B:51:0x065e, B:52:0x0671, B:53:0x0676), top: B:131:0x059a, inners: #3, #5 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0658  */
    /* JADX WARN: Code duplicated, block: B:53:0x0676 A[Catch: all -> 0x091c, TRY_LEAVE, TryCatch #5 {all -> 0x091c, blocks: (B:47:0x062e, B:51:0x065e, B:52:0x0671, B:53:0x0676), top: B:129:0x062e, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x069b A[Catch: Exception -> 0x0924, TryCatch #6 {Exception -> 0x0924, blocks: (B:42:0x059a, B:44:0x061d, B:46:0x0624, B:55:0x0693, B:57:0x069b, B:60:0x078e, B:79:0x0894, B:93:0x090a, B:97:0x0915, B:98:0x091b, B:100:0x091d, B:101:0x0923, B:62:0x07a5, B:66:0x07ee, B:72:0x083e, B:76:0x0869, B:47:0x062e, B:51:0x065e, B:52:0x0671, B:53:0x0676), top: B:131:0x059a, inners: #3, #5 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x078c  */
    /* JADX WARN: Code duplicated, block: B:60:0x078e A[Catch: Exception -> 0x0924, TRY_LEAVE, TryCatch #6 {Exception -> 0x0924, blocks: (B:42:0x059a, B:44:0x061d, B:46:0x0624, B:55:0x0693, B:57:0x069b, B:60:0x078e, B:79:0x0894, B:93:0x090a, B:97:0x0915, B:98:0x091b, B:100:0x091d, B:101:0x0923, B:62:0x07a5, B:66:0x07ee, B:72:0x083e, B:76:0x0869, B:47:0x062e, B:51:0x065e, B:52:0x0671, B:53:0x0676), top: B:131:0x059a, inners: #3, #5 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x07d5  */
    /* JADX WARN: Code duplicated, block: B:68:0x07f1  */
    /* JADX WARN: Code duplicated, block: B:71:0x082d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0841  */
    /* JADX WARN: Code duplicated, block: B:79:0x0894 A[Catch: Exception -> 0x0924, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x0924, blocks: (B:42:0x059a, B:44:0x061d, B:46:0x0624, B:55:0x0693, B:57:0x069b, B:60:0x078e, B:79:0x0894, B:93:0x090a, B:97:0x0915, B:98:0x091b, B:100:0x091d, B:101:0x0923, B:62:0x07a5, B:66:0x07ee, B:72:0x083e, B:76:0x0869, B:47:0x062e, B:51:0x065e, B:52:0x0671, B:53:0x0676), top: B:131:0x059a, inners: #3, #5 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x089c  */
    /* JADX WARN: Code duplicated, block: B:83:0x08ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x08ad  */
    /* JADX WARN: Code duplicated, block: B:86:0x08be  */
    /* JADX WARN: Code duplicated, block: B:87:0x08c4  */
    /* JADX WARN: Code duplicated, block: B:89:0x0902  */
    /* JADX WARN: Code duplicated, block: B:90:0x0904  */
    /* JADX WARN: Code duplicated, block: B:92:0x0909  */
    public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2) throws Throwable {
        int i3;
        String line;
        int i4;
        Object[] objArr;
        int[] iArr;
        int i5;
        char c;
        char c2;
        Object obj;
        int i6;
        int i7;
        int i8;
        int i9;
        File file;
        FileReader fileReader;
        BufferedReader bufferedReader;
        int bitsPerPixel;
        int i10;
        int edgeSlop;
        int i11;
        String str;
        boolean zEquals;
        File file2;
        FileReader fileReader2;
        BufferedReader bufferedReader2;
        int i12;
        int iTuitionPaymentFragmentbindingInflater1;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean zEquals2;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        String[] strArr;
        char c3;
        int i23;
        int i24 = 2;
        int i25 = 2 % 2;
        int i26 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i27 = (i26 ^ 91) + ((i26 & 91) << 1);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i27 % 128;
        int i28 = i27 % 2;
        try {
            int capsMode = TextUtils.getCapsMode("", 0, 0);
            int i29 = -Gravity.getAbsoluteGravity(0, 0);
            int iTuitionPaymentFragmentbindingInflater2 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
            int i30 = ((-20) & i29) | ((-20) ^ i29);
            int i31 = ((i29 * 624) - 11818) + ((~((i30 ^ iTuitionPaymentFragmentbindingInflater2) | (i30 & iTuitionPaymentFragmentbindingInflater2))) * 623);
            int i32 = ~iTuitionPaymentFragmentbindingInflater2;
            int i33 = ~((~i29) | 19);
            int i34 = -(-(((i32 ^ i33) | (i33 & i32)) * (-623)));
            int i35 = (i31 ^ i34) + ((i34 & i31) << 1);
            int i36 = ((~i30) | (~(((-20) & iTuitionPaymentFragmentbindingInflater2) | ((-20) ^ iTuitionPaymentFragmentbindingInflater2))) | (~((i29 & iTuitionPaymentFragmentbindingInflater2) | (i29 ^ iTuitionPaymentFragmentbindingInflater2)))) * 623;
            Object[] objArr2 = new Object[1];
            a(false, (capsMode | 120) + (capsMode & 120), (i35 & i36) + (i36 | i35), 16 - ((byte) KeyEvent.getModifierMetaStateMask()), new char[]{65502, 65535, 65532, 15, 1, 1, 65535, '\f', 65501, '\t', '\b', '\b', 65535, 65533, 14, 65535, 65534, 3, '\r'}, objArr2);
            int iRgb = 16777337 + Color.rgb(0, 0, 0);
            int i37 = -(Process.myPid() >> 22);
            int iTuitionPaymentFragmentbindingInflater3 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
            int i38 = (i37 * TypedValues.Custom.TYPE_DIMENSION) - 16254;
            int i39 = ~i37;
            int i40 = ~((i39 ^ iTuitionPaymentFragmentbindingInflater3) | (i39 & iTuitionPaymentFragmentbindingInflater3));
            int i41 = ~iTuitionPaymentFragmentbindingInflater3;
            int i42 = ~(i41 | 18);
            int i43 = ((i40 ^ i42) | (i42 & i40)) * (-1808);
            int i44 = (i38 & i43) + (i43 | i38);
            int i45 = (i39 ^ (-19)) | (i39 & (-19));
            int i46 = ~((i45 & iTuitionPaymentFragmentbindingInflater3) | (i45 ^ iTuitionPaymentFragmentbindingInflater3));
            int i47 = (i37 & i41) | (i41 ^ i37);
            int i48 = ~((i47 ^ 18) | (i47 & 18));
            int i49 = i44 + (((i46 & i48) | (i46 ^ i48)) * TypedValues.Custom.TYPE_BOOLEAN);
            int i50 = ~((i39 ^ 18) | (i39 & 18));
            int i51 = ~((iTuitionPaymentFragmentbindingInflater3 & (-19)) | ((-19) ^ iTuitionPaymentFragmentbindingInflater3));
            int i52 = (i50 & i51) | (i50 ^ i51);
            int i53 = ~i47;
            int i54 = i49 + (((i52 & i53) | (i52 ^ i53)) * TypedValues.Custom.TYPE_BOOLEAN);
            int i55 = -(Process.myPid() >> 22);
            int i56 = i55 * 46;
            int i57 = (i56 ^ 598) + ((i56 & 598) << 1);
            int i58 = ~i;
            int i59 = ~(((-14) ^ i58) | ((-14) & i58));
            int i60 = -(-(((i55 ^ i59) | (i59 & i55)) * (-90)));
            int i61 = ((i57 | i60) << 1) - (i57 ^ i60);
            int i62 = ~(((-14) & i) | ((-14) ^ i));
            int i63 = ~((i55 ^ 13) | (i55 & 13));
            int i64 = -(-(((i62 ^ i63) | (i62 & i63)) * (-45)));
            int i65 = ((i61 | i64) << 1) - (i61 ^ i64);
            int i66 = (~((~i55) | i)) | (-14);
            int i67 = ~(i55 | i58);
            int i68 = ((i67 & i66) | (i66 ^ i67)) * 45;
            Object[] objArr3 = new Object[1];
            a(true, iRgb, i54, ((i65 | i68) << 1) - (i68 ^ i65), new char[]{65531, 65534, 65501, 11, '\b', 65503, 0, 7, 2, '\r', 2, 65530, 16, 11, 65534, 0, 0, 14}, objArr3);
            String[] strArr2 = {(String) objArr2[0], (String) objArr3[0]};
            int i69 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i70 = ((i69 | 7) << 1) - (i69 ^ 7);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i70 % 128;
            int i71 = i70 % 2;
            int i72 = 0;
            while (true) {
                if (i72 >= i24) {
                    i3 = i;
                    break;
                }
                int i73 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i73 % 128;
                int i74 = i73 % i24;
                String str2 = strArr2[i72];
                int iKeyCodeFromString = KeyEvent.keyCodeFromString("");
                int iTuitionPaymentFragmentbindingInflater4 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                int i75 = ~iKeyCodeFromString;
                int i76 = ~((i75 ^ 114) | (i75 & 114));
                int i77 = ~iKeyCodeFromString;
                int i78 = ~((i77 ^ iTuitionPaymentFragmentbindingInflater4) | (i77 & iTuitionPaymentFragmentbindingInflater4));
                int i79 = (((iKeyCodeFromString * 141) - 15846) - (~(((i76 ^ i78) | (i78 & i76)) * (-280)))) - 1;
                int i80 = ~((i75 ^ iTuitionPaymentFragmentbindingInflater4) | (i75 & iTuitionPaymentFragmentbindingInflater4));
                int i81 = ~(((-115) ^ iTuitionPaymentFragmentbindingInflater4) | ((-115) & iTuitionPaymentFragmentbindingInflater4));
                int i82 = -(-(((i80 ^ i81) | (i80 & i81)) * 140));
                int i83 = (i79 ^ i82) + ((i82 & i79) << 1);
                int i84 = (i77 ^ (-115)) | (i77 & (-115));
                int i85 = ~((i84 & iTuitionPaymentFragmentbindingInflater4) | (i84 ^ iTuitionPaymentFragmentbindingInflater4));
                int i86 = ~iTuitionPaymentFragmentbindingInflater4;
                int i87 = ~((i86 & i75) | (i75 ^ i86) | 114);
                int i88 = ~iTuitionPaymentFragmentbindingInflater4;
                int i89 = (i88 & (-115)) | ((-115) ^ i88);
                int i90 = -(-(((i85 & i87) | (i85 ^ i87) | (~((iKeyCodeFromString & i89) | (i89 ^ iKeyCodeFromString)))) * 140));
                int i91 = (i83 ^ i90) + ((i90 & i83) << 1);
                int i92 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int i93 = (i92 * 367) + 5872 + (((i92 ^ 16) | (i92 & 16)) * (-366));
                int i94 = ~(((-17) ^ i) | ((-17) & i));
                int i95 = -(-(((i94 & i92) | (i92 ^ i94)) * (-366)));
                int i96 = (i93 & i95) + (i93 | i95);
                int i97 = ~((~i92) | 16);
                int i98 = (i92 & (-17)) | ((-17) ^ i92);
                int i99 = -(-(((~((i98 & i) | (i98 ^ i))) | i97) * 366));
                int i100 = ((i96 | i99) << 1) - (i99 ^ i96);
                int i101 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                int iTuitionPaymentFragmentbindingInflater5 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                int i102 = ~i101;
                int i103 = ~iTuitionPaymentFragmentbindingInflater5;
                int i104 = ~(((-7) & i103) | ((-7) ^ i103));
                int i105 = (i101 * (-1965)) + 5904 + (((i101 ^ (-7)) | (i101 & (-7))) * 983) + (((i104 & i102) | (i102 ^ i104)) * (-983));
                int i106 = ~i101;
                int i107 = ~((i106 & i103) | (i106 ^ i103));
                int i108 = ~(i102 | 6);
                int i109 = i107 ^ i108;
                Object[] objArr4 = new Object[1];
                a(true, i91, i100, i105 + (((i107 & i108) | i109) * 983), new char[]{4, '\t', 15, 18, 4, 14, 1, 7, 21, 2, 5, 65508, 65486, 19, 15, 65486}, objArr4);
                Class<?> cls = Class.forName((String) objArr4[0]);
                if (((Boolean) cls.getMethod(str2, new Class[0]).invoke(cls, null)).booleanValue()) {
                    i3 = i ^ 1;
                    int i110 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i111 = (i110 & 41) + (i110 | 41);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i111 % 128;
                    int i112 = i111 % 2;
                    break;
                }
                i72 = ((i72 & 1) << 1) + (i72 ^ 1);
                i24 = 2;
            }
        } catch (Exception unused) {
            i3 = (~(i & 2)) & (i | 2);
        }
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(109138771);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char size = (char) (2419 - View.MeasureSpec.getSize(0));
                int iIndexOf = 2844 - TextUtils.indexOf((CharSequence) "", '0', 0);
                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 5;
                byte b2 = (byte) (-1);
                byte b3 = (byte) (b2 + 1);
                Object[] objArr5 = new Object[1];
                c(b2, b3, b3, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(size, iIndexOf, iNormalizeMetaState, -501222268, false, (String) objArr5[0], new Class[0]);
            }
            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
            long j = 122227544;
            long j2 = -721;
            long jUptimeMillis = (int) SystemClock.uptimeMillis();
            long j3 = -1;
            long j4 = j ^ j3;
            long j5 = jLongValue ^ j3;
            long j6 = (j | jLongValue) ^ j3;
            long j7 = (j2 * j) + (j2 * jLongValue) + (((long) 1444) * ((jUptimeMillis ^ j3) | ((j4 | j5) ^ j3) | j6)) + (((long) (-1444)) * (j6 | ((j | jUptimeMillis) ^ j3) | ((jUptimeMillis | jLongValue) ^ j3))) + (((long) 722) * (((j4 | jLongValue) ^ j3) | (j3 ^ (j5 | j)))) + ((long) (-1281414230));
            int i113 = ~((int) Process.getStartElapsedRealtime());
            int i114 = ((int) (j7 >> 32)) & (((1754752898 + (((~((-1392882779) | i113)) | (-1464858107)) * (-828))) + ((i113 | (-1392882779)) * (-828))) - 2039262440);
            int i115 = ~i;
            int i116 = ((int) j7) & ((-1738041619) + (((~(1680876403 | i115)) | 176540808 | (~((-243649994) | i115))) * (-1136)) + (((~(1680876403 | i)) | (~((-243649994) | i)) | (~((-1613767219) | i115))) * (-568)) + (((~((-1680876404) | i115)) | (~(243649993 | i115)) | (~((-176540809) | i))) * 568));
            int i117 = (i114 & i116) | (i114 ^ i116);
            int i118 = (i117 & (-2)) | ((~i117) & 1);
            int i119 = (i118 | (-i118)) >> 31;
            int i120 = (i ^ 10) & (~i119);
            int i121 = i119 & i;
            int i122 = (i121 & i120) | (i120 ^ i121);
            int i123 = ((~i3) & i) | (i3 & i115);
            int i124 = -i123;
            int i125 = ((i123 & i124) | (i123 ^ i124)) >> 31;
            int i126 = (i122 & (~i125)) | (i3 & i125);
            try {
                int tapTimeout = ViewConfiguration.getTapTimeout() >> 16;
                int i127 = tapTimeout * 367;
                int i128 = (i127 ^ 42939) + ((i127 & 42939) << 1);
                int i129 = -(-(((tapTimeout ^ 117) | (tapTimeout & 117)) * (-366)));
                int i130 = (((i128 | i129) << 1) - (i129 ^ i128)) + (((~((-118) | i)) | tapTimeout) * (-366));
                int i131 = ~tapTimeout;
                int i132 = tapTimeout | (-118);
                int i133 = -(-(((~((i132 & i) | (i132 ^ i))) | (~((i131 & 117) | (i131 ^ 117)))) * 366));
                int i134 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int i135 = -(-TextUtils.getCapsMode("", 0, 0));
                Object[] objArr6 = new Object[1];
                a(true, ((i133 & i130) << 1) + (i130 ^ i133), (i134 | 40) + (i134 & 40), ((i135 | 5) << 1) - (i135 ^ 5), new char[]{65484, 16, 22, 16, 65484, 15, 2, 0, 65534, 15, 17, 65532, 17, 11, 2, 15, 15, 18, 0, 65484, 4, 11, 6, 0, 65534, 15, 17, 65484, 4, 18, 65535, 2, 1, 65484, '\t', 2, 11, 15, 2, '\b'}, objArr6);
                File file3 = new File((String) objArr6[0]);
                try {
                    if (file3.canRead()) {
                        FileReader fileReader3 = new FileReader(file3);
                        BufferedReader bufferedReader3 = new BufferedReader(fileReader3);
                        try {
                            line = bufferedReader3.readLine();
                            int i136 = -(-TextUtils.getOffsetBefore("", 0));
                            int i137 = (i136 ^ 129) + ((i136 & 129) << 1);
                            int touchSlop = ViewConfiguration.getTouchSlop() >> 8;
                            int i138 = ~touchSlop;
                            int i139 = ~((i138 ^ 3) | (i138 & 3));
                            int i140 = ~(i138 | i);
                            int i141 = ((touchSlop * 141) - 417) + (((i139 ^ i140) | (i139 & i140)) * (-280));
                            int i142 = ~touchSlop;
                            int i143 = i141 + (((~((i142 & i) | (i142 ^ i))) | (~(((-4) ^ i) | ((-4) & i)))) * 140);
                            int i144 = (i138 ^ (-4)) | (i138 & (-4));
                            int i145 = ~((i144 & i) | (i144 ^ i));
                            int i146 = (i138 & i115) | (i138 ^ i115);
                            int i147 = ~((i146 & 3) | (i146 ^ 3));
                            int i148 = (i147 & i145) | (i145 ^ i147);
                            int i149 = ((-4) & i115) | ((-4) ^ i115);
                            int i150 = ~((touchSlop & i149) | (i149 ^ touchSlop));
                            int i151 = i143 + (((i150 & i148) | (i148 ^ i150)) * 140);
                            int defaultSize = View.getDefaultSize(0, 0);
                            int i152 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i153 = (i152 & 103) + (i152 | 103);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i153 % 128;
                            int i154 = -defaultSize;
                            if (i153 % 2 != 0) {
                                i23 = ((-743) >>> i154) * (-1);
                            } else {
                                int i155 = i154 * (-743);
                                i23 = ((i155 & (-1486)) << 1) + (i155 ^ (-1486));
                            }
                            int i156 = (i152 ^ 95) + ((i152 & 95) << 1);
                            int i157 = i156 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i157;
                            int i158 = i156 % 2;
                            int i159 = ~((i154 ^ 2) | (i154 & 2));
                            int i160 = ~((i154 ^ i) | (i154 & i));
                            int i161 = (i159 ^ i160) | (i159 & i160);
                            int i162 = ~(2 | i);
                            int i163 = i23 + ((-744) * ((i161 ^ i162) | (i161 & i162)));
                            int i164 = ~i154;
                            int i165 = (i157 ^ 101) + ((i157 & 101) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i165 % 128;
                            if (i165 % 2 == 0) {
                                int i166 = -(744 >> ((~((i164 & (-3)) | (i164 ^ (-3)))) | i115));
                                Object[] objArr7 = new Object[1];
                                a(false, i137, i151, ((i163 ^ i166) + ((i166 & i163) << 1)) / (((i154 | 2) | i) * 744), new char[]{0, 1, 65535}, objArr7);
                                if (!line.equals((String) objArr7[0])) {
                                    fileReader3.close();
                                    bufferedReader3.close();
                                }
                                fileReader3.close();
                                bufferedReader3.close();
                            } else {
                                int i167 = ~((i164 & (-3)) | (i164 ^ (-3)));
                                int i168 = -(-(((i167 & i115) | (i115 ^ i167)) * 744));
                                int i169 = ((i163 | i168) << 1) - (i168 ^ i163);
                                int i170 = i154 | 2;
                                int i171 = ((i170 ^ i) | (i170 & i)) * 744;
                                Object[] objArr8 = new Object[1];
                                a(false, i137, i151, (i169 ^ i171) + ((i171 & i169) << 1), new char[]{0, 1, 65535}, objArr8);
                                if (line.equals((String) objArr8[0])) {
                                    fileReader3.close();
                                    bufferedReader3.close();
                                } else {
                                    fileReader3.close();
                                    bufferedReader3.close();
                                }
                            }
                            int i172 = -TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                            int iTuitionPaymentFragmentbindingInflater6 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                            int i173 = i172 * (-432);
                            int i174 = (i173 ^ 49910) + ((i173 & 49910) << 1);
                            int i175 = ~i172;
                            int i176 = ~iTuitionPaymentFragmentbindingInflater6;
                            int i177 = (i176 & i175) | (i175 ^ i176);
                            int i178 = i174 + ((~((i177 & 115) | (i177 ^ 115))) * 433);
                            int i179 = ~((-116) | iTuitionPaymentFragmentbindingInflater6);
                            int i180 = (i178 - (~(((i179 & i175) | (i175 ^ i179)) * (-433)))) - 1;
                            int i181 = ((~((i172 & 115) | (i172 ^ 115))) | (~((iTuitionPaymentFragmentbindingInflater6 & i175) | (i175 ^ iTuitionPaymentFragmentbindingInflater6)))) * 433;
                            Object[] objArr9 = new Object[1];
                            a(false, ((i180 | i181) << 1) - (i181 ^ i180), 30 - ExpandableListView.getPackedPositionChild(0L), 27 - (~(-((Process.getThreadPriority(0) + 20) >> 6))), new char[]{'\r', 1, 65485, 17, 23, 17, 65485, '\t', 3, 16, '\f', 3, '\n', 65485, 4, 18, 16, 65535, 1, 3, 65533, 3, '\f', 65535, 0, '\n', 3, 2, 65485, 14, 16}, objArr9);
                            file = new File((String) objArr9[0]);
                            int i182 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i183 = ((i182 | 125) << 1) - (i182 ^ 125);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i183 % 128;
                            int i184 = i183 % 2;
                            if (!(!file.canRead())) {
                                fileReader = new FileReader(file);
                                bufferedReader = new BufferedReader(fileReader);
                                try {
                                    String line2 = bufferedReader.readLine();
                                    bitsPerPixel = 66 - ImageFormat.getBitsPerPixel(0);
                                    i10 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                    edgeSlop = ViewConfiguration.getEdgeSlop();
                                    int i185 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    i11 = (i185 ^ 123) + ((i185 & 123) << 1);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                                    if (i11 % 2 != 0) {
                                        Object[] objArr10 = new Object[1];
                                        a(true, bitsPerPixel, i10, 1 << ((edgeSlop & 16) + (edgeSlop | 16)), new char[]{0}, objArr10);
                                        str = (String) objArr10[0];
                                    } else {
                                        int i186 = -(edgeSlop >> 16);
                                        Object[] objArr11 = new Object[1];
                                        a(true, bitsPerPixel, i10, ((i186 | 1) << 1) - (i186 ^ 1), new char[]{0}, objArr11);
                                        str = (String) objArr11[0];
                                    }
                                    zEquals = line2.equals(str);
                                    fileReader.close();
                                    bufferedReader.close();
                                    if (zEquals) {
                                        int maximumFlingVelocity = ViewConfiguration.getMaximumFlingVelocity() >> 16;
                                        int iTuitionPaymentFragmentbindingInflater7 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                                        int i187 = maximumFlingVelocity * 375;
                                        int i188 = (i187 & (-86652)) + (i187 | (-86652));
                                        int i189 = ~maximumFlingVelocity;
                                        int i190 = ~((i189 & 116) | (i189 ^ 116));
                                        int i191 = ~iTuitionPaymentFragmentbindingInflater7;
                                        int i192 = ~((i191 & maximumFlingVelocity) | (i191 ^ maximumFlingVelocity));
                                        int i193 = -(-(((i190 & i192) | (i190 ^ i192)) * (-374)));
                                        int i194 = ((i188 | i193) << 1) - (i193 ^ i188);
                                        int i195 = (~(((-117) & maximumFlingVelocity) | ((-117) ^ maximumFlingVelocity))) * 748;
                                        int i196 = (i194 ^ i195) + ((i195 & i194) << 1);
                                        int i197 = ~((~maximumFlingVelocity) | (-117));
                                        int i198 = -(-(((i197 & i192) | (i197 ^ i192)) * 374));
                                        int i199 = ((i196 | i198) << 1) - (i198 ^ i196);
                                        int i200 = -KeyEvent.getDeadChar(0, 0);
                                        int iTuitionPaymentFragmentbindingInflater8 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                                        int i201 = 1057 - (~(i200 * 530));
                                        int i202 = (i201 ^ 19080) + ((i201 & 19080) << 1);
                                        int i203 = ~iTuitionPaymentFragmentbindingInflater8;
                                        int i204 = i202 + (((~((i203 & i200) | (i203 ^ i200))) | (~(i200 | 36))) * 529);
                                        int i205 = ~((i200 & iTuitionPaymentFragmentbindingInflater8) | (i200 ^ iTuitionPaymentFragmentbindingInflater8));
                                        int i206 = ((i205 & (-37)) | ((-37) ^ i205)) * 529;
                                        int i207 = ((i206 & i204) << 1) + (i204 ^ i206);
                                        int defaultSize2 = View.getDefaultSize(0, 0);
                                        int i208 = ~defaultSize2;
                                        int i209 = ~((i208 ^ 1) | (i208 & 1));
                                        int i210 = ~defaultSize2;
                                        int i211 = ~((i210 ^ i) | (i210 & i));
                                        int i212 = ((defaultSize2 * 755) - 753) + (((i209 ^ i211) | (i211 & i209) | (~(i | 1))) * (-754));
                                        int i213 = ~(i208 | 1 | i);
                                        int i214 = ~i;
                                        int i215 = (i214 ^ defaultSize2) | (defaultSize2 & i214);
                                        int i216 = ~((i215 ^ 1) | (i215 & 1));
                                        int i217 = -(-(((i213 ^ i216) | (i213 & i216)) * (-754)));
                                        int i218 = ((i212 | i217) << 1) - (i217 ^ i212);
                                        int i219 = -(-((i208 | i214) * 754));
                                        Object[] objArr12 = new Object[1];
                                        a(true, i199, i207, (i218 ^ i219) + ((i219 & i218) << 1), new char[]{65485, '\f', '\r', 65533, 5, '\f', 7, 1, 65535, 16, 18, 65485, 5, '\f', 7, 1, 65535, 16, 18, 65485, 5, 19, 0, 3, 2, 65485, '\n', 3, '\f', 16, 3, '\t', 65485, 17, 23, 17}, objArr12);
                                        file2 = new File((String) objArr12[0]);
                                        if (!file2.canRead()) {
                                            fileReader2 = new FileReader(file2);
                                            bufferedReader2 = new BufferedReader(fileReader2);
                                            int i220 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                            int i221 = (i220 & 21) + (i220 | 21);
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i221 % 128;
                                            int i222 = i221 % 2;
                                            try {
                                                String line3 = bufferedReader2.readLine();
                                                int i223 = -(-Color.alpha(0));
                                                int i224 = ((i223 | 67) << 1) - (i223 ^ 67);
                                                i12 = -View.combineMeasuredStates(0, 0);
                                                iTuitionPaymentFragmentbindingInflater1 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                                                int i225 = i12 * 399;
                                                int i226 = (i225 & 399) + (i225 | 399);
                                                int i227 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                i13 = i227 + 29;
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 % 128;
                                                if (i13 % 2 == 0) {
                                                    int i228 = ~i12;
                                                    int i229 = ~((i228 & 1) | (i228 ^ 1));
                                                    int i230 = ~(((-2) ^ i12) | ((-2) & i12));
                                                    i14 = (i229 ^ i230) | (i229 & i230);
                                                    int i231 = 9 / 0;
                                                } else {
                                                    int i232 = ~i12;
                                                    i14 = (~((i232 & 1) | (i232 ^ 1))) | (~(((-2) ^ i12) | ((-2) & i12)));
                                                }
                                                int i233 = ~((-2) | iTuitionPaymentFragmentbindingInflater1);
                                                int i234 = (i226 - (~(398 * ((i14 ^ i233) | (i14 & i233))))) - 1;
                                                int i235 = -(-(((i12 ^ 1) | (i12 & 1)) * (-1194)));
                                                int i236 = ((i234 | i235) << 1) - (i234 ^ i235);
                                                i15 = i227 + 41;
                                                int i237 = i15 % 128;
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i237;
                                                if (i15 % 2 == 0) {
                                                    int i238 = ~((~iTuitionPaymentFragmentbindingInflater1) | (-2));
                                                    int i239 = ~i12;
                                                    int i240 = ~((i239 & 1) | (i239 ^ 1));
                                                    i17 = (i238 & i240) | (i238 ^ i240);
                                                    int i241 = 66 / 0;
                                                    i16 = 1;
                                                } else {
                                                    int i242 = ~((~iTuitionPaymentFragmentbindingInflater1) | (-2));
                                                    i16 = 1;
                                                    int i243 = ~((~i12) | 1);
                                                    i17 = (i242 & i243) | (i242 ^ i243);
                                                }
                                                int i244 = (i237 ^ 117) + ((i237 & 117) << i16);
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i244 % 128;
                                                int i245 = i244 % 2;
                                                int i246 = ~(((-2) ^ i12) | ((-2) & i12));
                                                int i247 = 398 * ((i246 & i17) | (i17 ^ i246));
                                                Object[] objArr13 = new Object[1];
                                                a(true, i224, (i236 & i247) + (i236 | i247), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), new char[]{0}, objArr13);
                                                zEquals2 = line3.equals((String) objArr13[0]);
                                                i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i18 % 128;
                                                if (i18 % 2 == 0) {
                                                    Object obj2 = null;
                                                    fileReader2.close();
                                                    bufferedReader2.close();
                                                    obj2.hashCode();
                                                    throw null;
                                                }
                                                fileReader2.close();
                                                bufferedReader2.close();
                                                if (zEquals2) {
                                                    i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                    i20 = (i19 & 3) + (i19 | 3);
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i20 % 128;
                                                    if (i20 % 2 == 0) {
                                                        Object obj3 = null;
                                                        obj3.hashCode();
                                                        throw null;
                                                    }
                                                    if (line != null) {
                                                        objArr = new Object[2];
                                                        objArr[0] = new int[1];
                                                        i21 = i19 + 25;
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i21 % 128;
                                                        if (i21 % 2 != 0) {
                                                            i22 = i ^ 27;
                                                            strArr = new String[0];
                                                            c3 = 1;
                                                        } else {
                                                            i22 = (i & (-21)) | (i115 & 20);
                                                            strArr = new String[1];
                                                            c3 = 0;
                                                        }
                                                        int i248 = i19 + 79;
                                                        int i249 = i248 % 128;
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i249;
                                                        int i250 = i248 % 2;
                                                        strArr[c3] = line;
                                                        int i251 = (i249 & 19) + (19 | i249);
                                                        int i252 = i251 % 128;
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i252;
                                                        int i253 = i251 % 2;
                                                        int[] iArr2 = (int[]) objArr[0];
                                                        int i254 = i252 + 7;
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i254 % 128;
                                                        int i255 = i254 % 2;
                                                        iArr2[0] = i22;
                                                        objArr[1] = strArr;
                                                        int i256 = (i252 ^ 123) + ((i252 & 123) << 1);
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i256 % 128;
                                                        int i257 = i256 % 2;
                                                        c = 0;
                                                    } else {
                                                        i4 = 2;
                                                    }
                                                }
                                                objArr = new Object[i4];
                                                iArr = new int[1];
                                                objArr[0] = iArr;
                                                String[] strArr3 = new String[0];
                                                int i258 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                i5 = (i258 & 87) + (i258 | 87);
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
                                                if (i5 % 2 != 0) {
                                                    c = 0;
                                                    ((int[]) objArr[1])[0] = i;
                                                    c2 = 0;
                                                } else {
                                                    c = 0;
                                                    iArr[0] = i;
                                                    c2 = 1;
                                                }
                                                objArr[c2] = strArr3;
                                            } catch (Throwable th) {
                                                fileReader2.close();
                                                bufferedReader2.close();
                                                throw th;
                                            }
                                        }
                                        i4 = 2;
                                        objArr = new Object[i4];
                                        iArr = new int[1];
                                        objArr[0] = iArr;
                                        String[] strArr4 = new String[0];
                                        int i259 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                        i5 = (i259 & 87) + (i259 | 87);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
                                        if (i5 % 2 != 0) {
                                            c = 0;
                                            ((int[]) objArr[1])[0] = i;
                                            c2 = 0;
                                        } else {
                                            c = 0;
                                            iArr[0] = i;
                                            c2 = 1;
                                        }
                                        objArr[c2] = strArr4;
                                    } else {
                                        i4 = 2;
                                        objArr = new Object[i4];
                                        iArr = new int[1];
                                        objArr[0] = iArr;
                                        String[] strArr5 = new String[0];
                                        int i2510 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                        i5 = (i2510 & 87) + (i2510 | 87);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
                                        if (i5 % 2 != 0) {
                                            c = 0;
                                            ((int[]) objArr[1])[0] = i;
                                            c2 = 0;
                                        } else {
                                            c = 0;
                                            iArr[0] = i;
                                            c2 = 1;
                                        }
                                        objArr[c2] = strArr5;
                                    }
                                } catch (Throwable th2) {
                                    fileReader.close();
                                    bufferedReader.close();
                                    throw th2;
                                }
                            } else {
                                i4 = 2;
                                objArr = new Object[i4];
                                iArr = new int[1];
                                objArr[0] = iArr;
                                String[] strArr6 = new String[0];
                                int i2511 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                i5 = (i2511 & 87) + (i2511 | 87);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
                                if (i5 % 2 != 0) {
                                    c = 0;
                                    ((int[]) objArr[1])[0] = i;
                                    c2 = 0;
                                } else {
                                    c = 0;
                                    iArr[0] = i;
                                    c2 = 1;
                                }
                                objArr[c2] = strArr6;
                            }
                            obj = objArr[c];
                            i6 = ((int[]) obj)[c];
                            int i260 = (~(i & i126)) & (i | i126);
                            int i261 = -i260;
                            i7 = (i260 & i261) | (i260 ^ i261);
                            int i262 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            i8 = i262 + 65;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
                            if (i8 % 2 == 0) {
                                int i263 = i7 << 31;
                                int i264 = (~i263) & i6;
                                int i265 = i126 & i263;
                                i9 = (i265 & i264) | (i264 ^ i265);
                            } else {
                                int i266 = i7 >> 31;
                                int i267 = (~i266) & i6;
                                int i268 = i266 & i126;
                                i9 = (i267 ^ i268) | (i268 & i267);
                                obj = objArr[1];
                            }
                            Object[] objArr14 = new Object[2];
                            int i269 = (i6 | i) & (~(i & i6));
                            int i270 = -i269;
                            int i271 = (((i269 & i270) | (i269 ^ i270)) >> 31) & 1;
                            int i272 = (~(((-i271) | i271) >> 31)) & 1;
                            int i273 = i262 + 9;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i273 % 128;
                            int i274 = i273 % 2;
                            objArr14[i271] = null;
                            objArr14[i272] = (String[]) obj;
                            String[] strArr7 = (String[]) objArr14[0];
                            int i275 = (i115 & i9) | ((~i9) & i);
                            int i276 = -i275;
                            Object[] objArr15 = {new int[]{i}, new int[1], new int[]{i9}, strArr7};
                            int i277 = (int) Runtime.getRuntime().totalMemory();
                            int i278 = (-110414582) + (((~((~i277) | 234768023)) | 33632320) * 529) + (((~(i277 | 234768023)) | 194457794) * 529);
                            int i279 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 43;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i279 % 128;
                            int i280 = i279 % 2;
                            int i281 = -(-((((i275 & i276) | (i275 ^ i276)) >> 31) & 16));
                            int i282 = (i2 - (~((i278 ^ i281) + ((i281 & i278) << 1)))) - 1;
                            int i283 = i282 << 13;
                            int i284 = (i282 | i283) & (~(i282 & i283));
                            int i285 = i284 ^ (i284 >>> 17);
                            int i286 = i285 << 5;
                            ((int[]) objArr15[1])[0] = ((~i285) & i286) | ((~i286) & i285);
                            return objArr15;
                        } catch (Throwable th3) {
                            fileReader3.close();
                            bufferedReader3.close();
                            throw th3;
                        }
                    }
                    int i287 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 57;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i287 % 128;
                    int i288 = i287 % 2;
                    int i1710 = -TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    int iTuitionPaymentFragmentbindingInflater9 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                    int i1711 = i1710 * (-432);
                    int i1712 = (i1711 ^ 49910) + ((i1711 & 49910) << 1);
                    int i1713 = ~i1710;
                    int i1714 = ~iTuitionPaymentFragmentbindingInflater9;
                    int i1715 = (i1714 & i1713) | (i1713 ^ i1714);
                    int i1716 = i1712 + ((~((i1715 & 115) | (i1715 ^ 115))) * 433);
                    int i1717 = ~((-116) | iTuitionPaymentFragmentbindingInflater9);
                    int i1810 = (i1716 - (~(((i1717 & i1713) | (i1713 ^ i1717)) * (-433)))) - 1;
                    int i1811 = ((~((i1710 & 115) | (i1710 ^ 115))) | (~((iTuitionPaymentFragmentbindingInflater9 & i1713) | (i1713 ^ iTuitionPaymentFragmentbindingInflater9)))) * 433;
                    Object[] objArr16 = new Object[1];
                    a(false, ((i1810 | i1811) << 1) - (i1811 ^ i1810), 30 - ExpandableListView.getPackedPositionChild(0L), 27 - (~(-((Process.getThreadPriority(0) + 20) >> 6))), new char[]{'\r', 1, 65485, 17, 23, 17, 65485, '\t', 3, 16, '\f', 3, '\n', 65485, 4, 18, 16, 65535, 1, 3, 65533, 3, '\f', 65535, 0, '\n', 3, 2, 65485, 14, 16}, objArr16);
                    file = new File((String) objArr16[0]);
                    int i1812 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i1813 = ((i1812 | 125) << 1) - (i1812 ^ 125);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1813 % 128;
                    int i1814 = i1813 % 2;
                    if (!(!file.canRead())) {
                        fileReader = new FileReader(file);
                        bufferedReader = new BufferedReader(fileReader);
                        String line4 = bufferedReader.readLine();
                        bitsPerPixel = 66 - ImageFormat.getBitsPerPixel(0);
                        i10 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        edgeSlop = ViewConfiguration.getEdgeSlop();
                        int i1815 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        i11 = (i1815 ^ 123) + ((i1815 & 123) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                        if (i11 % 2 != 0) {
                            Object[] objArr17 = new Object[1];
                            a(true, bitsPerPixel, i10, 1 << ((edgeSlop & 16) + (edgeSlop | 16)), new char[]{0}, objArr17);
                            str = (String) objArr17[0];
                        } else {
                            int i1816 = -(edgeSlop >> 16);
                            Object[] objArr18 = new Object[1];
                            a(true, bitsPerPixel, i10, ((i1816 | 1) << 1) - (i1816 ^ 1), new char[]{0}, objArr18);
                            str = (String) objArr18[0];
                        }
                        zEquals = line4.equals(str);
                        fileReader.close();
                        bufferedReader.close();
                        if (zEquals) {
                            int maximumFlingVelocity2 = ViewConfiguration.getMaximumFlingVelocity() >> 16;
                            int iTuitionPaymentFragmentbindingInflater10 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                            int i1817 = maximumFlingVelocity2 * 375;
                            int i1818 = (i1817 & (-86652)) + (i1817 | (-86652));
                            int i1819 = ~maximumFlingVelocity2;
                            int i1910 = ~((i1819 & 116) | (i1819 ^ 116));
                            int i1911 = ~iTuitionPaymentFragmentbindingInflater10;
                            int i1912 = ~((i1911 & maximumFlingVelocity2) | (i1911 ^ maximumFlingVelocity2));
                            int i1913 = -(-(((i1910 & i1912) | (i1910 ^ i1912)) * (-374)));
                            int i1914 = ((i1818 | i1913) << 1) - (i1913 ^ i1818);
                            int i1915 = (~(((-117) & maximumFlingVelocity2) | ((-117) ^ maximumFlingVelocity2))) * 748;
                            int i1916 = (i1914 ^ i1915) + ((i1915 & i1914) << 1);
                            int i1917 = ~((~maximumFlingVelocity2) | (-117));
                            int i1918 = -(-(((i1917 & i1912) | (i1917 ^ i1912)) * 374));
                            int i1919 = ((i1916 | i1918) << 1) - (i1918 ^ i1916);
                            int i2010 = -KeyEvent.getDeadChar(0, 0);
                            int iTuitionPaymentFragmentbindingInflater11 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                            int i2011 = 1057 - (~(i2010 * 530));
                            int i2012 = (i2011 ^ 19080) + ((i2011 & 19080) << 1);
                            int i2013 = ~iTuitionPaymentFragmentbindingInflater11;
                            int i2014 = i2012 + (((~((i2013 & i2010) | (i2013 ^ i2010))) | (~(i2010 | 36))) * 529);
                            int i2015 = ~((i2010 & iTuitionPaymentFragmentbindingInflater11) | (i2010 ^ iTuitionPaymentFragmentbindingInflater11));
                            int i2016 = ((i2015 & (-37)) | ((-37) ^ i2015)) * 529;
                            int i2017 = ((i2016 & i2014) << 1) + (i2014 ^ i2016);
                            int defaultSize3 = View.getDefaultSize(0, 0);
                            int i2018 = ~defaultSize3;
                            int i2019 = ~((i2018 ^ 1) | (i2018 & 1));
                            int i2110 = ~defaultSize3;
                            int i2111 = ~((i2110 ^ i) | (i2110 & i));
                            int i2112 = ((defaultSize3 * 755) - 753) + (((i2019 ^ i2111) | (i2111 & i2019) | (~(i | 1))) * (-754));
                            int i2113 = ~(i2018 | 1 | i);
                            int i2114 = ~i;
                            int i2115 = (i2114 ^ defaultSize3) | (defaultSize3 & i2114);
                            int i2116 = ~((i2115 ^ 1) | (i2115 & 1));
                            int i2117 = -(-(((i2113 ^ i2116) | (i2113 & i2116)) * (-754)));
                            int i2118 = ((i2112 | i2117) << 1) - (i2117 ^ i2112);
                            int i2119 = -(-((i2018 | i2114) * 754));
                            Object[] objArr19 = new Object[1];
                            a(true, i1919, i2017, (i2118 ^ i2119) + ((i2119 & i2118) << 1), new char[]{65485, '\f', '\r', 65533, 5, '\f', 7, 1, 65535, 16, 18, 65485, 5, '\f', 7, 1, 65535, 16, 18, 65485, 5, 19, 0, 3, 2, 65485, '\n', 3, '\f', 16, 3, '\t', 65485, 17, 23, 17}, objArr19);
                            file2 = new File((String) objArr19[0]);
                            if (!file2.canRead()) {
                                fileReader2 = new FileReader(file2);
                                bufferedReader2 = new BufferedReader(fileReader2);
                                int i2210 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                int i2211 = (i2210 & 21) + (i2210 | 21);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2211 % 128;
                                int i2212 = i2211 % 2;
                                String line5 = bufferedReader2.readLine();
                                int i2213 = -(-Color.alpha(0));
                                int i2214 = ((i2213 | 67) << 1) - (i2213 ^ 67);
                                i12 = -View.combineMeasuredStates(0, 0);
                                iTuitionPaymentFragmentbindingInflater1 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                                int i2215 = i12 * 399;
                                int i2216 = (i2215 & 399) + (i2215 | 399);
                                int i2217 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                i13 = i2217 + 29;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 % 128;
                                if (i13 % 2 == 0) {
                                    int i2218 = ~i12;
                                    int i2219 = ~((i2218 & 1) | (i2218 ^ 1));
                                    int i2310 = ~(((-2) ^ i12) | ((-2) & i12));
                                    i14 = (i2219 ^ i2310) | (i2219 & i2310);
                                    int i2311 = 9 / 0;
                                } else {
                                    int i2312 = ~i12;
                                    i14 = (~((i2312 & 1) | (i2312 ^ 1))) | (~(((-2) ^ i12) | ((-2) & i12)));
                                }
                                int i2313 = ~((-2) | iTuitionPaymentFragmentbindingInflater1);
                                int i2314 = (i2216 - (~(398 * ((i14 ^ i2313) | (i14 & i2313))))) - 1;
                                int i2315 = -(-(((i12 ^ 1) | (i12 & 1)) * (-1194)));
                                int i2316 = ((i2314 | i2315) << 1) - (i2314 ^ i2315);
                                i15 = i2217 + 41;
                                int i2317 = i15 % 128;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2317;
                                if (i15 % 2 == 0) {
                                    int i2318 = ~((~iTuitionPaymentFragmentbindingInflater1) | (-2));
                                    int i2319 = ~i12;
                                    int i2410 = ~((i2319 & 1) | (i2319 ^ 1));
                                    i17 = (i2318 & i2410) | (i2318 ^ i2410);
                                    int i2411 = 66 / 0;
                                    i16 = 1;
                                } else {
                                    int i2412 = ~((~iTuitionPaymentFragmentbindingInflater1) | (-2));
                                    i16 = 1;
                                    int i2413 = ~((~i12) | 1);
                                    i17 = (i2412 & i2413) | (i2412 ^ i2413);
                                }
                                int i2414 = (i2317 ^ 117) + ((i2317 & 117) << i16);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2414 % 128;
                                int i2415 = i2414 % 2;
                                int i2416 = ~(((-2) ^ i12) | ((-2) & i12));
                                int i2417 = 398 * ((i2416 & i17) | (i17 ^ i2416));
                                Object[] objArr110 = new Object[1];
                                a(true, i2214, (i2316 & i2417) + (i2316 | i2417), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), new char[]{0}, objArr110);
                                zEquals2 = line5.equals((String) objArr110[0]);
                                i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i18 % 128;
                                if (i18 % 2 == 0) {
                                    Object obj4 = null;
                                    fileReader2.close();
                                    bufferedReader2.close();
                                    obj4.hashCode();
                                    throw null;
                                }
                                fileReader2.close();
                                bufferedReader2.close();
                                if (zEquals2) {
                                    i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    i20 = (i19 & 3) + (i19 | 3);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i20 % 128;
                                    if (i20 % 2 == 0) {
                                        Object obj5 = null;
                                        obj5.hashCode();
                                        throw null;
                                    }
                                    if (line != null) {
                                        objArr = new Object[2];
                                        objArr[0] = new int[1];
                                        i21 = i19 + 25;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i21 % 128;
                                        if (i21 % 2 != 0) {
                                            i22 = i ^ 27;
                                            strArr = new String[0];
                                            c3 = 1;
                                        } else {
                                            i22 = (i & (-21)) | (i115 & 20);
                                            strArr = new String[1];
                                            c3 = 0;
                                        }
                                        int i2418 = i19 + 79;
                                        int i2419 = i2418 % 128;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2419;
                                        int i2512 = i2418 % 2;
                                        strArr[c3] = line;
                                        int i2513 = (i2419 & 19) + (19 | i2419);
                                        int i2514 = i2513 % 128;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2514;
                                        int i2515 = i2513 % 2;
                                        int[] iArr3 = (int[]) objArr[0];
                                        int i2516 = i2514 + 7;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2516 % 128;
                                        int i2517 = i2516 % 2;
                                        iArr3[0] = i22;
                                        objArr[1] = strArr;
                                        int i2518 = (i2514 ^ 123) + ((i2514 & 123) << 1);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2518 % 128;
                                        int i2519 = i2518 % 2;
                                        c = 0;
                                    } else {
                                        i4 = 2;
                                    }
                                }
                                objArr = new Object[i4];
                                iArr = new int[1];
                                objArr[0] = iArr;
                                String[] strArr8 = new String[0];
                                int i25110 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                i5 = (i25110 & 87) + (i25110 | 87);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
                                if (i5 % 2 != 0) {
                                    c = 0;
                                    ((int[]) objArr[1])[0] = i;
                                    c2 = 0;
                                } else {
                                    c = 0;
                                    iArr[0] = i;
                                    c2 = 1;
                                }
                                objArr[c2] = strArr8;
                            }
                            i4 = 2;
                            objArr = new Object[i4];
                            iArr = new int[1];
                            objArr[0] = iArr;
                            String[] strArr9 = new String[0];
                            int i25111 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            i5 = (i25111 & 87) + (i25111 | 87);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
                            if (i5 % 2 != 0) {
                                c = 0;
                                ((int[]) objArr[1])[0] = i;
                                c2 = 0;
                            } else {
                                c = 0;
                                iArr[0] = i;
                                c2 = 1;
                            }
                            objArr[c2] = strArr9;
                        } else {
                            i4 = 2;
                            objArr = new Object[i4];
                            iArr = new int[1];
                            objArr[0] = iArr;
                            String[] strArr10 = new String[0];
                            int i25112 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            i5 = (i25112 & 87) + (i25112 | 87);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
                            if (i5 % 2 != 0) {
                                c = 0;
                                ((int[]) objArr[1])[0] = i;
                                c2 = 0;
                            } else {
                                c = 0;
                                iArr[0] = i;
                                c2 = 1;
                            }
                            objArr[c2] = strArr10;
                        }
                    } else {
                        i4 = 2;
                        objArr = new Object[i4];
                        iArr = new int[1];
                        objArr[0] = iArr;
                        String[] strArr11 = new String[0];
                        int i25113 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        i5 = (i25113 & 87) + (i25113 | 87);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
                        if (i5 % 2 != 0) {
                            c = 0;
                            ((int[]) objArr[1])[0] = i;
                            c2 = 0;
                        } else {
                            c = 0;
                            iArr[0] = i;
                            c2 = 1;
                        }
                        objArr[c2] = strArr11;
                    }
                } catch (Exception unused2) {
                }
            } catch (Exception unused3) {
            }
            line = null;
            obj = objArr[c];
            i6 = ((int[]) obj)[c];
            int i2610 = (~(i & i126)) & (i | i126);
            int i2611 = -i2610;
            i7 = (i2610 & i2611) | (i2610 ^ i2611);
            int i2612 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            i8 = i2612 + 65;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
            if (i8 % 2 == 0) {
                int i2613 = i7 << 31;
                int i2614 = (~i2613) & i6;
                int i2615 = i126 & i2613;
                i9 = (i2615 & i2614) | (i2614 ^ i2615);
            } else {
                int i2616 = i7 >> 31;
                int i2617 = (~i2616) & i6;
                int i2618 = i2616 & i126;
                i9 = (i2617 ^ i2618) | (i2618 & i2617);
                obj = objArr[1];
            }
            Object[] objArr111 = new Object[2];
            int i2619 = (i6 | i) & (~(i & i6));
            int i2710 = -i2619;
            int i2711 = (((i2619 & i2710) | (i2619 ^ i2710)) >> 31) & 1;
            int i2712 = (~(((-i2711) | i2711) >> 31)) & 1;
            int i2713 = i2612 + 9;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2713 % 128;
            int i2714 = i2713 % 2;
            objArr111[i2711] = null;
            objArr111[i2712] = (String[]) obj;
            String[] strArr12 = (String[]) objArr111[0];
            int i2715 = (i115 & i9) | ((~i9) & i);
            int i2716 = -i2715;
            Object[] objArr112 = {new int[]{i}, new int[1], new int[]{i9}, strArr12};
            int i2717 = (int) Runtime.getRuntime().totalMemory();
            int i2718 = (-110414582) + (((~((~i2717) | 234768023)) | 33632320) * 529) + (((~(i2717 | 234768023)) | 194457794) * 529);
            int i2719 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 43;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2719 % 128;
            int i289 = i2719 % 2;
            int i2810 = -(-((((i2715 & i2716) | (i2715 ^ i2716)) >> 31) & 16));
            int i2811 = (i2 - (~((i2718 ^ i2810) + ((i2810 & i2718) << 1)))) - 1;
            int i2812 = i2811 << 13;
            int i2813 = (i2811 | i2812) & (~(i2811 & i2812));
            int i2814 = i2813 ^ (i2813 >>> 17);
            int i2815 = i2814 << 5;
            ((int[]) objArr112[1])[0] = ((~i2814) & i2815) | ((~i2815) & i2814);
            return objArr112;
        } catch (Throwable th4) {
            Throwable cause = th4.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(byte r6, byte r7, byte r8) {
        /*
            int r8 = r8 * 2
            int r8 = 3 - r8
            byte[] r0 = com.datatheorem.android.trustkit.config.ConfigurationException.$$c
            int r6 = r6 * 4
            int r1 = 1 - r6
            int r7 = r7 + 119
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L17
            r4 = r6
            r7 = r8
            r3 = r2
            goto L2c
        L17:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L1b:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L26:
            int r3 = r3 + 1
            int r7 = r7 + 1
            r4 = r0[r7]
        L2c:
            int r4 = -r4
            int r8 = r8 + r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datatheorem.android.trustkit.config.ConfigurationException.$$e(byte, byte, byte):java.lang.String");
    }
}
