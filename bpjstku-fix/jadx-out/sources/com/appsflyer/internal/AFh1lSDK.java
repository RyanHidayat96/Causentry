package com.appsflyer.internal;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AFAdRevenueData;
import defpackage.CaptureBundle;
import defpackage.deInitSession;
import defpackage.initSession;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.text.Typography;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
public final class AFh1lSDK extends AFh1rSDK {
    public final Map<String, Object> copy;
    public final AFAdRevenueData equals;
    private static final byte[] $$c = {83, -4, -55, -17};
    private static final int $$d = 81;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {14, 116, 92, -78};
    private static final int $$b = 10;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {60052, 60061, 60093, 60048, 60046, 60117, 60053, 60041, 59751, 60056, 59746, 60058, 60054, 60059, 60116, 60047, 59747, 59745, 60095, 59750, 60034, 60050, 60043, 59744, 60057, 59749, 60060, 60068, 60055, 59748, 60088, 60063, 60062, 60040, 60044, 60106};
    private static char b = 57191;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            int r7 = r7 * 2
            int r7 = r7 + 98
            byte[] r0 = com.appsflyer.internal.AFh1lSDK.$$a
            int r6 = r6 * 4
            int r6 = r6 + 1
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2d
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            int r8 = r8 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2d:
            int r8 = -r8
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFh1lSDK.c(int, byte, short, java.lang.Object[]):void");
    }

    public AFh1lSDK(AFAdRevenueData aFAdRevenueData, Map<String, Object> map) {
        super("adrevenue_generic", null, Boolean.TRUE);
        this.equals = aFAdRevenueData;
        this.copy = map;
    }

    @Override // com.appsflyer.internal.AFh1rSDK
    public final AFe1mSDK getCurrencyIso4217Code() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 47;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            AFe1mSDK aFe1mSDK = AFe1mSDK.ADREVENUE;
            throw null;
        }
        AFe1mSDK aFe1mSDK2 = AFe1mSDK.ADREVENUE;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 84 / 0;
        }
        return aFe1mSDK2;
    }

    private static void a(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2;
        int i4 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object obj2 = null;
        int i5 = 8;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 83;
                $11 = i7 % 128;
                int i8 = i7 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Color.green(0), 2267 - (ViewConfiguration.getJumpTapTimeout() >> 16), 33 - (ViewConfiguration.getTouchSlop() >> i5), -1927765101, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i6++;
                    i3 = 2;
                    i5 = 8;
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
        Object[] objArr3 = {Integer.valueOf(b)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            byte b5 = (byte) 0;
            byte b6 = b5;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), ExpandableListView.getPackedPositionType(0L) + 2267, 32 - MotionEvent.axisFromString(""), -1927765101, false, $$e(b5, b6, b6), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
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
                    obj = obj2;
                } else {
                    Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (49266 - ((byte) KeyEvent.getModifierMetaStateMask())), Drawable.resolveOpacity(0, 0) + 3261, 31 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -127612708, false, $$e(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = b9;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 22878), AndroidCharacter.getMirror('0') + 546, 16 - ((byte) KeyEvent.getModifierMetaStateMask()), 1570859318, false, $$e(b9, b10, (byte) (b10 + 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        int i9 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i9];
                        int i10 = $11 + 65;
                        $10 = i10 % 128;
                        int i11 = i10 % 2;
                    } else {
                        obj = null;
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            int i12 = $10 + 89;
                            $11 = i12 % 128;
                            int i13 = i12 % 2;
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i14 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i14];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i15];
                        } else {
                            int i16 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i16];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i17];
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                obj2 = obj;
            }
        }
        for (int i18 = 0; i18 < i; i18++) {
            cArr4[i18] = (char) (cArr4[i18] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:121:0x05be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:66:0x0502 A[Catch: Exception -> 0x06f6, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x06f6, blocks: (B:63:0x044f, B:66:0x0502, B:73:0x05ab, B:75:0x05b6, B:103:0x06ef, B:104:0x06f5, B:68:0x0516, B:70:0x0591), top: B:126:0x044f, inners: #8 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x05ab A[Catch: Exception -> 0x06f6, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x06f6, blocks: (B:63:0x044f, B:66:0x0502, B:73:0x05ab, B:75:0x05b6, B:103:0x06ef, B:104:0x06f5, B:68:0x0516, B:70:0x0591), top: B:126:0x044f, inners: #8 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x05b6 A[Catch: Exception -> 0x06f6, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x06f6, blocks: (B:63:0x044f, B:66:0x0502, B:73:0x05ab, B:75:0x05b6, B:103:0x06ef, B:104:0x06f5, B:68:0x0516, B:70:0x0591), top: B:126:0x044f, inners: #8 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:80:0x0604 A[Catch: Exception -> 0x06ad, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x06ad, blocks: (B:77:0x05be, B:80:0x0604, B:90:0x069f, B:91:0x06a6, B:92:0x06ac, B:83:0x061e, B:89:0x0653, B:86:0x0635), top: B:121:0x05be, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x061e A[Catch: all -> 0x0633, TRY_ENTER, TryCatch #2 {all -> 0x0633, blocks: (B:83:0x061e, B:89:0x0653, B:86:0x0635), top: B:119:0x061c, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0635 A[Catch: all -> 0x0633, TRY_LEAVE, TryCatch #2 {all -> 0x0633, blocks: (B:83:0x061e, B:89:0x0653, B:86:0x0635), top: B:119:0x061c, outer: #3 }] */
    public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2) throws Throwable {
        int i3;
        int i4;
        int i5;
        String str;
        Object[] objArr;
        File file;
        FileReader fileReader;
        BufferedReader bufferedReader;
        boolean zEquals;
        int i6;
        boolean zEquals2;
        File file2;
        FileReader fileReader2;
        BufferedReader bufferedReader2;
        int i7;
        String line;
        char[] cArr;
        int i8;
        int i9;
        int i10;
        int i11;
        String[] strArr;
        char[] cArr2;
        byte mode;
        int i12;
        float f;
        float f2;
        int i13;
        String str2;
        char[] cArr3;
        byte scrollDefaultDelay;
        String str3;
        int i14;
        int i15 = 2 % 2;
        int i16 = TuitionPaymentFragmentbindingInflater1;
        int i17 = ((i16 | 7) << 1) - (i16 ^ 7);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i17 % 128;
        try {
            if (i17 % 2 != 0) {
                strArr = new String[4];
                cArr2 = new char[]{27, 3, 20, 30, 28, 0, 13923, 13923, 31, '\b', 0, 6, 13914, 13914, '!', '\b', 14, '!', 13924};
                mode = (byte) (64 % View.MeasureSpec.getMode(1));
                i12 = 14;
                f = 2.0f;
                f2 = 2.0f;
                i13 = 1;
            } else {
                strArr = new String[2];
                cArr2 = new char[]{27, 3, 20, 30, 28, 0, 13923, 13923, 31, '\b', 0, 6, 13914, 13914, '!', '\b', 14, '!', 13924};
                int mode2 = View.MeasureSpec.getMode(0);
                mode = (byte) (((mode2 | 102) << 1) - (mode2 ^ 102));
                i12 = 19;
                f = 0.0f;
                f2 = 0.0f;
                i13 = 0;
            }
            int i18 = -(TypedValue.complexToFraction(i13, f, f2) > 0.0f ? 1 : (TypedValue.complexToFraction(i13, f, f2) == 0.0f ? 0 : -1));
            int iTuitionPaymentFragmentbindingInflater1 = CaptureBundle.TuitionPaymentFragmentbindingInflater1();
            int i19 = ~i18;
            int i20 = ~iTuitionPaymentFragmentbindingInflater1;
            int i21 = (i19 & i20) | (i19 ^ i20);
            int i22 = (((i18 * (-432)) + (i12 * 434)) - (~((~((i21 & i12) | (i21 ^ i12))) * 433))) - 1;
            int i23 = ~i18;
            int i24 = ~i12;
            int i25 = -(-(((~((i24 & iTuitionPaymentFragmentbindingInflater1) | (i24 ^ iTuitionPaymentFragmentbindingInflater1))) | i23) * (-433)));
            int i26 = ~((iTuitionPaymentFragmentbindingInflater1 & i23) | (i23 ^ iTuitionPaymentFragmentbindingInflater1));
            int i27 = ~((i12 & i18) | (i18 ^ i12));
            int i28 = (((i22 & i25) + (i22 | i25)) - (~(-(-(((i27 & i26) | (i26 ^ i27)) * 433))))) - 1;
            Object[] objArr2 = new Object[1];
            a(cArr2, mode, i28, objArr2);
            strArr[0] = (String) objArr2[0];
            char[] cArr4 = {'#', '\n', 27, 21, 18, '\t', ' ', '\b', 1, 6, 20, 30, 28, 0, 13924, 13924, 31, '\b'};
            int minimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity() >> 16;
            int iTuitionPaymentFragmentbindingInflater2 = CaptureBundle.TuitionPaymentFragmentbindingInflater1();
            int i29 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i30 = (i29 ^ 77) + ((i29 & 77) << 1);
            TuitionPaymentFragmentbindingInflater1 = i30 % 128;
            int i31 = i30 % 2;
            int i32 = (-964) + ((-963) * minimumFlingVelocity);
            int i33 = (i32 & 99395) + (99395 | i32);
            int i34 = ~minimumFlingVelocity;
            int i35 = ~((-104) | iTuitionPaymentFragmentbindingInflater2);
            int i36 = -(-(((i34 & i35) | (i34 ^ i35)) * (-964)));
            int i37 = (i33 ^ i36) + ((i36 & i33) << 1);
            int i38 = (i29 & 39) + (i29 | 39);
            TuitionPaymentFragmentbindingInflater1 = i38 % 128;
            int i39 = i38 % 2;
            int i40 = ~iTuitionPaymentFragmentbindingInflater2;
            int i41 = ~((i40 & (-104)) | ((-104) ^ i40));
            int i42 = ~(minimumFlingVelocity | (-104));
            byte b2 = (byte) (i37 + ((-964) * ((i42 & i41) | (i41 ^ i42))));
            int i43 = -(-(ViewConfiguration.getKeyRepeatTimeout() >> 16));
            Object[] objArr3 = new Object[1];
            a(cArr4, b2, (i43 & 18) + (18 | i43), objArr3);
            strArr[1] = (String) objArr3[0];
            int i44 = 0;
            while (true) {
                if (i44 >= 2) {
                    i5 = i;
                    break;
                }
                int i45 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
                TuitionPaymentFragmentbindingInflater1 = i45 % 128;
                if (i45 % 2 == 0) {
                    str2 = strArr[i44];
                    cArr3 = new char[]{6, 7, 1, '\r', 3, 18, '#', 1, 3, 30, 0, 23, 30, 26, 2, 28};
                    scrollDefaultDelay = (byte) (9 % (ViewConfiguration.getScrollDefaultDelay() - 101));
                    str3 = "";
                    i14 = 105;
                } else {
                    str2 = strArr[i44];
                    cArr3 = new char[]{6, 7, 1, '\r', 3, 18, '#', 1, 3, 30, 0, 23, 30, 26, 2, 28};
                    int i46 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                    scrollDefaultDelay = (byte) (((i46 | 53) << 1) - (i46 ^ 53));
                    str3 = "";
                    i14 = 16;
                }
                int i47 = -TextUtils.indexOf(str3, "", 0, 0);
                int i48 = (i47 * (-51)) + (i14 * 53);
                int i49 = ~CaptureBundle.TuitionPaymentFragmentbindingInflater1();
                int i50 = -(-((~((i49 ^ i47) | (i49 & i47) | i14)) * 52));
                int i51 = ((i48 | i50) << 1) - (i48 ^ i50);
                int i52 = ~i14;
                int i53 = ~((i52 & i49) | (i52 ^ i49));
                int i54 = ~((~i14) | i47);
                int i55 = (i51 - (~((((i53 ^ i54) | (i53 & i54)) | (~(i49 | i47))) * (-52)))) - 1;
                int i56 = ~i47;
                int i57 = -(-(((~((i56 & i14) | (i56 ^ i14))) | (~(i49 | i56))) * 52));
                int i58 = ((i55 | i57) << 1) - (i55 ^ i57);
                Object[] objArr4 = new Object[1];
                a(cArr3, scrollDefaultDelay, i58, objArr4);
                Class<?> cls = Class.forName((String) objArr4[0]);
                int i59 = TuitionPaymentFragmentbindingInflater1;
                int i60 = ((i59 | 111) << 1) - (i59 ^ 111);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i60 % 128;
                int i61 = i60 % 2;
                if (((Boolean) cls.getMethod(str2, new Class[0]).invoke(cls, null)).booleanValue()) {
                    i3 = i & (-2);
                    i4 = (~i) & 1;
                    i5 = i3 | i4;
                    break;
                }
                i44++;
            }
        } catch (Exception unused) {
            i3 = i & (-3);
            i4 = (~i) & 2;
        }
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(109138771);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char c = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2418);
                int packedPositionType = 2845 - ExpandableListView.getPackedPositionType(0L);
                int i62 = 6 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                byte b3 = (byte) 0;
                byte b4 = b3;
                Object[] objArr5 = new Object[1];
                c(b3, b4, (byte) (b4 - 1), objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, packedPositionType, i62, -501222268, false, (String) objArr5[0], new Class[0]);
            }
            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
            long j = 531958540;
            long j2 = 193;
            long jElapsedRealtime = (int) SystemClock.elapsedRealtime();
            long j3 = -1;
            long j4 = jElapsedRealtime ^ j3;
            long j5 = j ^ j3;
            long j6 = (j2 * j) + (j2 * jLongValue) + (((long) (-192)) * (j4 | ((j5 | jLongValue) ^ j3)));
            long j7 = jLongValue ^ j3;
            long j8 = j5 | j7;
            long j9 = j7 | j4;
            long j10 = j6 + (((long) (-384)) * ((j8 ^ j3) | (j9 ^ j3))) + (((long) DerHeader.TAG_CLASS_PRIVATE) * (((j8 | jElapsedRealtime) ^ j3) | ((j9 | j) ^ j3) | (j3 ^ (jElapsedRealtime | (jLongValue | j))))) + ((long) (-1691145226));
            int i63 = ~i;
            int i64 = (~(1049968537 | i63)) | (-2144698300);
            int i65 = ~((-713042586) | i);
            int i66 = ((int) (j10 >> 32)) & (((i64 | i65) * (-252)) + 2139134106 + ((i65 | (~((-1094729763) | i63))) * 252));
            int i67 = ((int) j10) & ((-1518461539) + ((~((-688975088) | i)) * 216) + (((-16811078) | i63) * (-216)) + (((~((-688975088) | i63)) | (-748251323)) * 216));
            int i68 = (i66 & i67) | (i66 ^ i67);
            int i69 = TuitionPaymentFragmentbindingInflater1;
            int i70 = (i69 ^ 11) + ((i69 & 11) << 1);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i70 % 128;
            int i71 = i70 % 2;
            int i72 = (~(i & 10)) & (i | 10);
            int i73 = (i68 | 1) & (~(i68 & 1));
            int i74 = -i73;
            int i75 = ((i73 & i74) | (i73 ^ i74)) >> 31;
            int i76 = (i75 & i) | (i72 & (~i75));
            int i77 = ((~i5) & i) | (i5 & i63);
            int i78 = (i77 | (-i77)) >> 31;
            int i79 = i76 & (~i78);
            int i80 = i5 & i78;
            int i81 = (i79 ^ i80) | (i80 & i79);
            try {
                byte bAlpha = (byte) (50 - Color.alpha(0));
                int scrollBarSize = ViewConfiguration.getScrollBarSize() >> 8;
                int iTuitionPaymentFragmentbindingInflater3 = CaptureBundle.TuitionPaymentFragmentbindingInflater1();
                int i82 = scrollBarSize * (-405);
                int i83 = ((i82 | 16280) << 1) - (i82 ^ 16280);
                int i84 = ~(((-41) & iTuitionPaymentFragmentbindingInflater3) | ((-41) ^ iTuitionPaymentFragmentbindingInflater3));
                int i85 = ~iTuitionPaymentFragmentbindingInflater3;
                int i86 = i85 | scrollBarSize;
                int i87 = ~((i86 ^ 40) | (i86 & 40));
                int i88 = i83 + (((i84 ^ i87) | (i84 & i87)) * (-406));
                int i89 = ~iTuitionPaymentFragmentbindingInflater3;
                int i90 = (i88 - (~((~((((-41) ^ i89) | (i89 & (-41))) | scrollBarSize)) * (-406)))) - 1;
                int i91 = ~scrollBarSize;
                int i92 = ~((i91 & iTuitionPaymentFragmentbindingInflater3) | (i91 ^ iTuitionPaymentFragmentbindingInflater3));
                int i93 = ~((i85 ^ 40) | (i85 & 40));
                int i94 = -(-(((i92 & i93) | (i92 ^ i93)) * 406));
                int i95 = (i90 & i94) + (i94 | i90);
                Object[] objArr6 = new Object[1];
                a(new char[]{15, ' ', 21, ' ', 15, 2, 31, '\b', '\b', 30, 26, 16, ' ', '!', 28, 0, ' ', 20, '\r', '\t', 6, '\n', 18, '\t', ' ', 20, '\n', 3, 13850, 13850, 30, '\b', 21, '!', '\r', '\t', 6, '\n', 31, '\b'}, bAlpha, i95, objArr6);
                File file3 = new File((String) objArr6[0]);
                try {
                    if (file3.canRead()) {
                        FileReader fileReader3 = new FileReader(file3);
                        BufferedReader bufferedReader3 = new BufferedReader(fileReader3);
                        try {
                            String line2 = bufferedReader3.readLine();
                            char[] cArr5 = {'\f', 6, 13904};
                            int scrollDefaultDelay2 = ViewConfiguration.getScrollDefaultDelay();
                            int i96 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i97 = ((i96 | 87) << 1) - (i96 ^ 87);
                            TuitionPaymentFragmentbindingInflater1 = i97 % 128;
                            int i98 = i97 % 2;
                            byte b5 = (byte) (101 - (~(scrollDefaultDelay2 >> 16)));
                            int pressedStateDuration = ViewConfiguration.getPressedStateDuration() >> 16;
                            int i99 = (pressedStateDuration * 628) + 1884;
                            int i100 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i101 = i100 + 45;
                            TuitionPaymentFragmentbindingInflater1 = i101 % 128;
                            int i102 = i ^ 3;
                            if (i101 % 2 == 0) {
                                i10 = (i99 - (~(-((-627) << ((i102 | (i & 3)) | (~pressedStateDuration)))))) - 1;
                            } else {
                                int i103 = i102 | (i & 3);
                                int i104 = ~pressedStateDuration;
                                int i105 = ((i103 ^ i104) | (i103 & i104)) * (-627);
                                i10 = (i99 & i105) + (i105 | i99);
                            }
                            int i106 = ((i100 | 51) << 1) - (i100 ^ 51);
                            TuitionPaymentFragmentbindingInflater1 = i106 % 128;
                            if (i106 % 2 == 0) {
                                int i107 = -((~(((-4) & i) | ((-4) ^ i))) | pressedStateDuration);
                                i11 = (i10 - (~(-(-(((-627) ^ i107) + ((i107 & (-627)) << 1)))))) - 1;
                            } else {
                                int i108 = ~(((-4) & i) | ((-4) ^ i));
                                i11 = i10 + ((-627) * ((i108 & pressedStateDuration) | (pressedStateDuration ^ i108)));
                            }
                            int i109 = ~((i63 ^ 3) | (i63 & 3));
                            int i110 = ~((pressedStateDuration & i) | (pressedStateDuration ^ i));
                            int i111 = -(-(627 * ((i109 & i110) | (i109 ^ i110))));
                            int i112 = ((i11 | i111) << 1) - (i111 ^ i11);
                            Object[] objArr7 = new Object[1];
                            a(cArr5, b5, i112, objArr7);
                            if (line2.equals((String) objArr7[0])) {
                                fileReader3.close();
                                bufferedReader3.close();
                            } else {
                                int i113 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
                                TuitionPaymentFragmentbindingInflater1 = i113 % 128;
                                int i114 = i113 % 2;
                                fileReader3.close();
                                bufferedReader3.close();
                                str = line2;
                            }
                            char[] cArr6 = {16, 20, 6, 1, '\b', 15, ' ', 21, ' ', 15, 2, '!', '\b', 7, Typography.quote, 26, '\r', 2, '\r', '\t', 6, '\n', '!', 26, 30, '\b', 6, 29, 26, Typography.quote, 13920};
                            char mirror = AndroidCharacter.getMirror('0');
                            int iTuitionPaymentFragmentbindingInflater4 = CaptureBundle.TuitionPaymentFragmentbindingInflater1();
                            int i115 = ~mirror;
                            int i116 = ~(iTuitionPaymentFragmentbindingInflater4 | 50);
                            int i117 = (((mirror * 65427) + 5550) - (~(-(-(((i115 & i116) | (i115 ^ i116)) * (-220)))))) - 1;
                            int i118 = ~((mirror ^ '2') | (mirror & '2'));
                            int i119 = ~((iTuitionPaymentFragmentbindingInflater4 & 50) | (iTuitionPaymentFragmentbindingInflater4 ^ 50));
                            int i120 = (i117 - (~(-(-(((i119 & i118) | (i118 ^ i119)) * 220))))) - 1;
                            int i121 = ~mirror;
                            int i122 = ~((i121 & 50) | (i121 ^ 50));
                            int i123 = ~((mirror & (-51)) | ((-51) ^ mirror));
                            byte b6 = (byte) ((i120 - (~(((i123 & i122) | (i122 ^ i123)) * 110))) - 1);
                            int trimmedLength = TextUtils.getTrimmedLength("");
                            int i124 = trimmedLength * 829;
                            int i125 = ((i124 | 25699) << 1) - (i124 ^ 25699);
                            int i126 = ~((~trimmedLength) | (-32));
                            int i127 = ~i;
                            int i128 = ~((i127 & trimmedLength) | (i127 ^ trimmedLength) | 31);
                            int i129 = ((i126 & i128) | (i126 ^ i128)) * (-828);
                            int i130 = ((i125 | i129) << 1) - (i129 ^ i125);
                            int i131 = (trimmedLength & 31) | (trimmedLength ^ 31);
                            int i132 = ((i131 ^ i63) | (i131 & i63)) * (-828);
                            int i133 = (i130 & i132) + (i132 | i130) + ((~i131) * 828);
                            Object[] objArr8 = new Object[1];
                            a(cArr6, b6, i133, objArr8);
                            file = new File((String) objArr8[0]);
                            if (!file.canRead()) {
                                fileReader = new FileReader(file);
                                bufferedReader = new BufferedReader(fileReader);
                                int i134 = TuitionPaymentFragmentbindingInflater1 + 13;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i134 % 128;
                                int i135 = i134 % 2;
                                try {
                                    String line3 = bufferedReader.readLine();
                                    char[] cArr7 = {13793};
                                    int iBlue = Color.blue(0);
                                    byte b7 = (byte) (((iBlue | 54) << 1) - (iBlue ^ 54));
                                    int iMyTid = Process.myTid();
                                    int i136 = TuitionPaymentFragmentbindingInflater1;
                                    int i137 = (i136 ^ 45) + ((i136 & 45) << 1);
                                    int i138 = i137 % 128;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i138;
                                    int i139 = i137 % 2;
                                    int i140 = iMyTid >> 22;
                                    int i141 = i140 * 624;
                                    int i142 = (i141 ^ (-622)) + ((i141 & (-622)) << 1);
                                    int i143 = ((-2) ^ i140) | ((-2) & i140);
                                    int i144 = (~((i143 ^ i) | (i143 & i))) * 623;
                                    int i145 = (i142 & i144) + (i144 | i142);
                                    int i146 = ~((~i140) | 1);
                                    int i147 = ((i146 & i63) | (i63 ^ i146)) * (-623);
                                    int i148 = (i145 & i147) + (i145 | i147);
                                    int i149 = ~((-2) | i140);
                                    int i150 = ((i138 | 121) << 1) - (i138 ^ 121);
                                    TuitionPaymentFragmentbindingInflater1 = i150 % 128;
                                    int i151 = i150 % 2;
                                    int i152 = ((-2) | i) ^ (-1);
                                    int i153 = -(-(623 * ((i149 & i152) | (i149 ^ i152) | (~((i140 ^ i) | (i140 & i))))));
                                    int i154 = (i148 ^ i153) + ((i153 & i148) << 1);
                                    Object[] objArr9 = new Object[1];
                                    a(cArr7, b7, i154, objArr9);
                                    zEquals = line3.equals((String) objArr9[0]);
                                    i6 = TuitionPaymentFragmentbindingInflater1 + 77;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
                                    if (i6 % 2 != 0) {
                                        fileReader.close();
                                        bufferedReader.close();
                                        int i155 = 25 / 0;
                                    } else {
                                        fileReader.close();
                                        bufferedReader.close();
                                    }
                                    if (zEquals) {
                                        try {
                                            byte windowTouchSlop = (byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 74);
                                            int i156 = -(-TextUtils.indexOf((CharSequence) "", '0', 0));
                                            int i157 = (i156 ^ 37) + ((i156 & 37) << 1);
                                            Object[] objArr10 = new Object[1];
                                            a(new char[]{15, ' ', 21, ' ', 15, 2, 31, '\b', '\b', 30, 26, 16, ' ', '!', 28, 0, ' ', 20, '\r', '\t', 6, '\n', 18, '\t', ' ', 20, '\r', '\t', 6, '\n', 18, '\t', 27, 28, 6, '\f'}, windowTouchSlop, i157, objArr10);
                                            file2 = new File((String) objArr10[0]);
                                            if (file2.canRead()) {
                                                fileReader2 = new FileReader(file2);
                                                bufferedReader2 = new BufferedReader(fileReader2);
                                                int i158 = TuitionPaymentFragmentbindingInflater1;
                                                i7 = ((i158 | 79) << 1) - (i158 ^ 79);
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
                                                try {
                                                    if (i7 % 2 != 0) {
                                                        line = bufferedReader2.readLine();
                                                        cArr = new char[]{13793};
                                                        i8 = -(Process.myTid() << 119);
                                                        i9 = 46;
                                                    } else {
                                                        line = bufferedReader2.readLine();
                                                        cArr = new char[]{13793};
                                                        i8 = -(Process.myTid() >> 22);
                                                        i9 = 54;
                                                    }
                                                    int i159 = TuitionPaymentFragmentbindingInflater1 + 81;
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i159 % 128;
                                                    int i160 = i159 % 2;
                                                    int iTuitionPaymentFragmentbindingInflater5 = CaptureBundle.TuitionPaymentFragmentbindingInflater1();
                                                    int i161 = (i8 * 866) + ((-864) * i9);
                                                    int i162 = ~i9;
                                                    int i163 = i161 + (((~((~i8) | (~iTuitionPaymentFragmentbindingInflater5))) | i162) * (-865)) + ((~((i8 ^ iTuitionPaymentFragmentbindingInflater5) | (i8 & iTuitionPaymentFragmentbindingInflater5))) * 865);
                                                    int i164 = ~iTuitionPaymentFragmentbindingInflater5;
                                                    int i165 = ~((i162 & i164) | (i162 ^ i164));
                                                    int i166 = ~((i8 & i164) | (i164 ^ i8));
                                                    byte b8 = (byte) ((i163 - (~(-(-(((i166 & i165) | (i165 ^ i166)) * 865))))) - 1);
                                                    int i167 = -Color.alpha(0);
                                                    int i168 = (i167 ^ 1) + ((i167 & 1) << 1);
                                                    Object[] objArr11 = new Object[1];
                                                    a(cArr, b8, i168, objArr11);
                                                    zEquals2 = line.equals((String) objArr11[0]);
                                                    fileReader2.close();
                                                    bufferedReader2.close();
                                                } catch (Throwable th) {
                                                    fileReader2.close();
                                                    bufferedReader2.close();
                                                    throw th;
                                                }
                                            } else {
                                                int i169 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                int i170 = ((i169 | 115) << 1) - (i169 ^ 115);
                                                TuitionPaymentFragmentbindingInflater1 = i170 % 128;
                                                int i171 = i170 % 2;
                                                zEquals2 = false;
                                            }
                                        } catch (Exception unused2) {
                                            zEquals2 = false;
                                        }
                                        if ((!zEquals2) && str != null) {
                                            objArr = new Object[2];
                                            int[] iArr = new int[1];
                                            objArr[0] = iArr;
                                            int i172 = (i & (-21)) | (i63 & 20);
                                            String[] strArr2 = {str};
                                            int i173 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
                                            int i174 = i173 % 128;
                                            TuitionPaymentFragmentbindingInflater1 = i174;
                                            if (i173 % 2 == 0) {
                                                ((int[]) objArr[1])[1] = i172;
                                            } else {
                                                iArr[0] = i172;
                                            }
                                            int i175 = i174 + 67;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i175 % 128;
                                            int i176 = i175 % 2;
                                            objArr[1] = strArr2;
                                            int i177 = i174 + 91;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i177 % 128;
                                            int i178 = i177 % 2;
                                        }
                                    }
                                    int i179 = ((int[]) objArr[0])[0];
                                    int i180 = (i63 & i81) | ((~i81) & i);
                                    int i181 = -i180;
                                    int i182 = ((i180 & i181) | (i180 ^ i181)) >> 31;
                                    int i183 = (~i182) & i179;
                                    int i184 = i81 & i182;
                                    int i185 = (i184 & i183) | (i183 ^ i184);
                                    String[] strArr3 = (String[]) objArr[1];
                                    Object[] objArr12 = new Object[2];
                                    int i186 = (~(i & i179)) & (i179 | i);
                                    int i187 = -i186;
                                    int i188 = (((i186 & i187) | (i186 ^ i187)) >> 31) & 1;
                                    int i189 = -i188;
                                    int i190 = (~(((i189 & i188) | (i188 ^ i189)) >> 31)) & 1;
                                    objArr12[i188] = null;
                                    objArr12[i190] = strArr3;
                                    String[] strArr4 = (String[]) objArr12[0];
                                    int i191 = (~(i & i185)) & (i | i185);
                                    int i192 = ((i191 | (-i191)) >> 31) & 16;
                                    Object[] objArr13 = {new int[]{i}, new int[1], new int[]{i185}, strArr4};
                                    int i193 = ~Process.myPid();
                                    int i194 = 1944672820 + (((~(i193 | 52336124)) | 10551299) * (-160)) + (((~(i193 | 12025895)) | 52336124) * 160);
                                    int iTuitionPaymentFragmentbindingInflater6 = CaptureBundle.TuitionPaymentFragmentbindingInflater1();
                                    int i195 = ((i192 * (-464)) - (~(-(-(i194 * (-929)))))) - 1;
                                    int i196 = ~i192;
                                    int i197 = (i194 ^ iTuitionPaymentFragmentbindingInflater6) | (i194 & iTuitionPaymentFragmentbindingInflater6);
                                    int i198 = ~i197;
                                    int i199 = ((i198 & i196) | (i196 ^ i198)) * (-465);
                                    int i200 = ((i195 | i199) << 1) - (i195 ^ i199);
                                    int i201 = ~i192;
                                    int i202 = ~((iTuitionPaymentFragmentbindingInflater6 & i201) | (i201 ^ iTuitionPaymentFragmentbindingInflater6));
                                    int i203 = (i200 - (~(((i202 & i194) | (i194 ^ i202)) * 930))) - 1;
                                    int i204 = -(-(((i197 ^ i196) | (i197 & i196)) * 465));
                                    int i205 = i2 + (i203 & i204) + (i204 | i203);
                                    int i206 = i205 << 13;
                                    int i207 = (i205 | i206) & (~(i205 & i206));
                                    int i208 = i207 >>> 17;
                                    int i209 = ((~i207) & i208) | ((~i208) & i207);
                                    int i210 = i209 << 5;
                                    ((int[]) objArr13[1])[0] = (i209 | i210) & (~(i209 & i210));
                                    int i211 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 51;
                                    TuitionPaymentFragmentbindingInflater1 = i211 % 128;
                                    int i212 = i211 % 2;
                                    return objArr13;
                                } catch (Throwable th2) {
                                    fileReader.close();
                                    bufferedReader.close();
                                    throw th2;
                                }
                            }
                            int i213 = TuitionPaymentFragmentbindingInflater1;
                            int i214 = (i213 ^ 89) + ((i213 & 89) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i214 % 128;
                            int i215 = i214 % 2;
                            int i216 = i213 + 45;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i216 % 128;
                            int i217 = i216 % 2;
                            objArr = new Object[]{new int[]{i}, new String[0]};
                            int i218 = TuitionPaymentFragmentbindingInflater1 + 107;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i218 % 128;
                            int i219 = i218 % 2;
                            int i1710 = ((int[]) objArr[0])[0];
                            int i1810 = (i63 & i81) | ((~i81) & i);
                            int i1811 = -i1810;
                            int i1812 = ((i1810 & i1811) | (i1810 ^ i1811)) >> 31;
                            int i1813 = (~i1812) & i1710;
                            int i1814 = i81 & i1812;
                            int i1815 = (i1814 & i1813) | (i1813 ^ i1814);
                            String[] strArr5 = (String[]) objArr[1];
                            Object[] objArr14 = new Object[2];
                            int i1816 = (~(i & i1710)) & (i1710 | i);
                            int i1817 = -i1816;
                            int i1818 = (((i1816 & i1817) | (i1816 ^ i1817)) >> 31) & 1;
                            int i1819 = -i1818;
                            int i1910 = (~(((i1819 & i1818) | (i1818 ^ i1819)) >> 31)) & 1;
                            objArr14[i1818] = null;
                            objArr14[i1910] = strArr5;
                            String[] strArr6 = (String[]) objArr14[0];
                            int i1911 = (~(i & i1815)) & (i | i1815);
                            int i1912 = ((i1911 | (-i1911)) >> 31) & 16;
                            Object[] objArr15 = {new int[]{i}, new int[1], new int[]{i1815}, strArr6};
                            int i1913 = ~Process.myPid();
                            int i1914 = 1944672820 + (((~(i1913 | 52336124)) | 10551299) * (-160)) + (((~(i1913 | 12025895)) | 52336124) * 160);
                            int iTuitionPaymentFragmentbindingInflater7 = CaptureBundle.TuitionPaymentFragmentbindingInflater1();
                            int i1915 = ((i1912 * (-464)) - (~(-(-(i1914 * (-929)))))) - 1;
                            int i1916 = ~i1912;
                            int i1917 = (i1914 ^ iTuitionPaymentFragmentbindingInflater7) | (i1914 & iTuitionPaymentFragmentbindingInflater7);
                            int i1918 = ~i1917;
                            int i1919 = ((i1918 & i1916) | (i1916 ^ i1918)) * (-465);
                            int i2010 = ((i1915 | i1919) << 1) - (i1915 ^ i1919);
                            int i2011 = ~i1912;
                            int i2012 = ~((iTuitionPaymentFragmentbindingInflater7 & i2011) | (i2011 ^ iTuitionPaymentFragmentbindingInflater7));
                            int i2013 = (i2010 - (~(((i2012 & i1914) | (i1914 ^ i2012)) * 930))) - 1;
                            int i2014 = -(-(((i1917 ^ i1916) | (i1917 & i1916)) * 465));
                            int i2015 = i2 + (i2013 & i2014) + (i2014 | i2013);
                            int i2016 = i2015 << 13;
                            int i2017 = (i2015 | i2016) & (~(i2015 & i2016));
                            int i2018 = i2017 >>> 17;
                            int i2019 = ((~i2017) & i2018) | ((~i2018) & i2017);
                            int i2110 = i2019 << 5;
                            ((int[]) objArr15[1])[0] = (i2019 | i2110) & (~(i2019 & i2110));
                            int i2111 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 51;
                            TuitionPaymentFragmentbindingInflater1 = i2111 % 128;
                            int i2112 = i2111 % 2;
                            return objArr15;
                        } catch (Throwable th3) {
                            fileReader3.close();
                            bufferedReader3.close();
                            throw th3;
                        }
                    }
                    int i220 = TuitionPaymentFragmentbindingInflater1;
                    int i221 = (i220 & 49) + (i220 | 49);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i221 % 128;
                    if (i221 % 2 != 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    char[] cArr8 = {16, 20, 6, 1, '\b', 15, ' ', 21, ' ', 15, 2, '!', '\b', 7, Typography.quote, 26, '\r', 2, '\r', '\t', 6, '\n', '!', 26, 30, '\b', 6, 29, 26, Typography.quote, 13920};
                    char mirror2 = AndroidCharacter.getMirror('0');
                    int iTuitionPaymentFragmentbindingInflater8 = CaptureBundle.TuitionPaymentFragmentbindingInflater1();
                    int i1110 = ~mirror2;
                    int i1111 = ~(iTuitionPaymentFragmentbindingInflater8 | 50);
                    int i1112 = (((mirror2 * 65427) + 5550) - (~(-(-(((i1110 & i1111) | (i1110 ^ i1111)) * (-220)))))) - 1;
                    int i1113 = ~((mirror2 ^ '2') | (mirror2 & '2'));
                    int i1114 = ~((iTuitionPaymentFragmentbindingInflater8 & 50) | (iTuitionPaymentFragmentbindingInflater8 ^ 50));
                    int i1210 = (i1112 - (~(-(-(((i1114 & i1113) | (i1113 ^ i1114)) * 220))))) - 1;
                    int i1211 = ~mirror2;
                    int i1212 = ~((i1211 & 50) | (i1211 ^ 50));
                    int i1213 = ~((mirror2 & (-51)) | ((-51) ^ mirror2));
                    byte b9 = (byte) ((i1210 - (~(((i1213 & i1212) | (i1212 ^ i1213)) * 110))) - 1);
                    int trimmedLength2 = TextUtils.getTrimmedLength("");
                    int i1214 = trimmedLength2 * 829;
                    int i1215 = ((i1214 | 25699) << 1) - (i1214 ^ 25699);
                    int i1216 = ~((~trimmedLength2) | (-32));
                    int i1217 = ~i;
                    int i1218 = ~((i1217 & trimmedLength2) | (i1217 ^ trimmedLength2) | 31);
                    int i1219 = ((i1216 & i1218) | (i1216 ^ i1218)) * (-828);
                    int i1310 = ((i1215 | i1219) << 1) - (i1219 ^ i1215);
                    int i1311 = (trimmedLength2 & 31) | (trimmedLength2 ^ 31);
                    int i1312 = ((i1311 ^ i63) | (i1311 & i63)) * (-828);
                    int i1313 = (i1310 & i1312) + (i1312 | i1310) + ((~i1311) * 828);
                    Object[] objArr16 = new Object[1];
                    a(cArr8, b9, i1313, objArr16);
                    file = new File((String) objArr16[0]);
                    if (!file.canRead()) {
                        fileReader = new FileReader(file);
                        bufferedReader = new BufferedReader(fileReader);
                        int i1314 = TuitionPaymentFragmentbindingInflater1 + 13;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1314 % 128;
                        int i1315 = i1314 % 2;
                        String line4 = bufferedReader.readLine();
                        char[] cArr9 = {13793};
                        int iBlue2 = Color.blue(0);
                        byte b10 = (byte) (((iBlue2 | 54) << 1) - (iBlue2 ^ 54));
                        int iMyTid2 = Process.myTid();
                        int i1316 = TuitionPaymentFragmentbindingInflater1;
                        int i1317 = (i1316 ^ 45) + ((i1316 & 45) << 1);
                        int i1318 = i1317 % 128;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1318;
                        int i1319 = i1317 % 2;
                        int i1410 = iMyTid2 >> 22;
                        int i1411 = i1410 * 624;
                        int i1412 = (i1411 ^ (-622)) + ((i1411 & (-622)) << 1);
                        int i1413 = ((-2) ^ i1410) | ((-2) & i1410);
                        int i1414 = (~((i1413 ^ i) | (i1413 & i))) * 623;
                        int i1415 = (i1412 & i1414) + (i1414 | i1412);
                        int i1416 = ~((~i1410) | 1);
                        int i1417 = ((i1416 & i63) | (i63 ^ i1416)) * (-623);
                        int i1418 = (i1415 & i1417) + (i1415 | i1417);
                        int i1419 = ~((-2) | i1410);
                        int i1510 = ((i1318 | 121) << 1) - (i1318 ^ 121);
                        TuitionPaymentFragmentbindingInflater1 = i1510 % 128;
                        int i1511 = i1510 % 2;
                        int i1512 = ((-2) | i) ^ (-1);
                        int i1513 = -(-(623 * ((i1419 & i1512) | (i1419 ^ i1512) | (~((i1410 ^ i) | (i1410 & i))))));
                        int i1514 = (i1418 ^ i1513) + ((i1513 & i1418) << 1);
                        Object[] objArr17 = new Object[1];
                        a(cArr9, b10, i1514, objArr17);
                        zEquals = line4.equals((String) objArr17[0]);
                        i6 = TuitionPaymentFragmentbindingInflater1 + 77;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
                        if (i6 % 2 != 0) {
                            fileReader.close();
                            bufferedReader.close();
                            int i1515 = 25 / 0;
                        } else {
                            fileReader.close();
                            bufferedReader.close();
                        }
                        if (zEquals) {
                            byte windowTouchSlop2 = (byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 74);
                            int i1516 = -(-TextUtils.indexOf((CharSequence) "", '0', 0));
                            int i1517 = (i1516 ^ 37) + ((i1516 & 37) << 1);
                            Object[] objArr18 = new Object[1];
                            a(new char[]{15, ' ', 21, ' ', 15, 2, 31, '\b', '\b', 30, 26, 16, ' ', '!', 28, 0, ' ', 20, '\r', '\t', 6, '\n', 18, '\t', ' ', 20, '\r', '\t', 6, '\n', 18, '\t', 27, 28, 6, '\f'}, windowTouchSlop2, i1517, objArr18);
                            file2 = new File((String) objArr18[0]);
                            if (file2.canRead()) {
                                int i1610 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i1711 = ((i1610 | 115) << 1) - (i1610 ^ 115);
                                TuitionPaymentFragmentbindingInflater1 = i1711 % 128;
                                int i1712 = i1711 % 2;
                                zEquals2 = false;
                            } else {
                                fileReader2 = new FileReader(file2);
                                bufferedReader2 = new BufferedReader(fileReader2);
                                int i1518 = TuitionPaymentFragmentbindingInflater1;
                                i7 = ((i1518 | 79) << 1) - (i1518 ^ 79);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
                                if (i7 % 2 != 0) {
                                    line = bufferedReader2.readLine();
                                    cArr = new char[]{13793};
                                    i8 = -(Process.myTid() << 119);
                                    i9 = 46;
                                } else {
                                    line = bufferedReader2.readLine();
                                    cArr = new char[]{13793};
                                    i8 = -(Process.myTid() >> 22);
                                    i9 = 54;
                                }
                                int i1519 = TuitionPaymentFragmentbindingInflater1 + 81;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1519 % 128;
                                int i1611 = i1519 % 2;
                                int iTuitionPaymentFragmentbindingInflater9 = CaptureBundle.TuitionPaymentFragmentbindingInflater1();
                                int i1612 = (i8 * 866) + ((-864) * i9);
                                int i1613 = ~i9;
                                int i1614 = i1612 + (((~((~i8) | (~iTuitionPaymentFragmentbindingInflater9))) | i1613) * (-865)) + ((~((i8 ^ iTuitionPaymentFragmentbindingInflater9) | (i8 & iTuitionPaymentFragmentbindingInflater9))) * 865);
                                int i1615 = ~iTuitionPaymentFragmentbindingInflater9;
                                int i1616 = ~((i1613 & i1615) | (i1613 ^ i1615));
                                int i1617 = ~((i8 & i1615) | (i1615 ^ i8));
                                byte b11 = (byte) ((i1614 - (~(-(-(((i1617 & i1616) | (i1616 ^ i1617)) * 865))))) - 1);
                                int i1618 = -Color.alpha(0);
                                int i1619 = (i1618 ^ 1) + ((i1618 & 1) << 1);
                                Object[] objArr19 = new Object[1];
                                a(cArr, b11, i1619, objArr19);
                                zEquals2 = line.equals((String) objArr19[0]);
                                fileReader2.close();
                                bufferedReader2.close();
                            }
                            if (!zEquals2) {
                            }
                        }
                        int i1713 = ((int[]) objArr[0])[0];
                        int i18110 = (i63 & i81) | ((~i81) & i);
                        int i18111 = -i18110;
                        int i18112 = ((i18110 & i18111) | (i18110 ^ i18111)) >> 31;
                        int i18113 = (~i18112) & i1713;
                        int i18114 = i81 & i18112;
                        int i18115 = (i18114 & i18113) | (i18113 ^ i18114);
                        String[] strArr7 = (String[]) objArr[1];
                        Object[] objArr110 = new Object[2];
                        int i18116 = (~(i & i1713)) & (i1713 | i);
                        int i18117 = -i18116;
                        int i18118 = (((i18116 & i18117) | (i18116 ^ i18117)) >> 31) & 1;
                        int i18119 = -i18118;
                        int i19110 = (~(((i18119 & i18118) | (i18118 ^ i18119)) >> 31)) & 1;
                        objArr110[i18118] = null;
                        objArr110[i19110] = strArr7;
                        String[] strArr8 = (String[]) objArr110[0];
                        int i19111 = (~(i & i18115)) & (i | i18115);
                        int i19112 = ((i19111 | (-i19111)) >> 31) & 16;
                        Object[] objArr111 = {new int[]{i}, new int[1], new int[]{i18115}, strArr8};
                        int i19113 = ~Process.myPid();
                        int i19114 = 1944672820 + (((~(i19113 | 52336124)) | 10551299) * (-160)) + (((~(i19113 | 12025895)) | 52336124) * 160);
                        int iTuitionPaymentFragmentbindingInflater10 = CaptureBundle.TuitionPaymentFragmentbindingInflater1();
                        int i19115 = ((i19112 * (-464)) - (~(-(-(i19114 * (-929)))))) - 1;
                        int i19116 = ~i19112;
                        int i19117 = (i19114 ^ iTuitionPaymentFragmentbindingInflater10) | (i19114 & iTuitionPaymentFragmentbindingInflater10);
                        int i19118 = ~i19117;
                        int i19119 = ((i19118 & i19116) | (i19116 ^ i19118)) * (-465);
                        int i20110 = ((i19115 | i19119) << 1) - (i19115 ^ i19119);
                        int i20111 = ~i19112;
                        int i20112 = ~((iTuitionPaymentFragmentbindingInflater10 & i20111) | (i20111 ^ iTuitionPaymentFragmentbindingInflater10));
                        int i20113 = (i20110 - (~(((i20112 & i19114) | (i19114 ^ i20112)) * 930))) - 1;
                        int i20114 = -(-(((i19117 ^ i19116) | (i19117 & i19116)) * 465));
                        int i20115 = i2 + (i20113 & i20114) + (i20114 | i20113);
                        int i20116 = i20115 << 13;
                        int i20117 = (i20115 | i20116) & (~(i20115 & i20116));
                        int i20118 = i20117 >>> 17;
                        int i20119 = ((~i20117) & i20118) | ((~i20118) & i20117);
                        int i2113 = i20119 << 5;
                        ((int[]) objArr111[1])[0] = (i20119 | i2113) & (~(i20119 & i2113));
                        int i2114 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 51;
                        TuitionPaymentFragmentbindingInflater1 = i2114 % 128;
                        int i2115 = i2114 % 2;
                        return objArr111;
                    }
                    int i2116 = TuitionPaymentFragmentbindingInflater1;
                    int i2117 = (i2116 ^ 89) + ((i2116 & 89) << 1);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2117 % 128;
                    int i2118 = i2117 % 2;
                    int i2119 = i2116 + 45;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2119 % 128;
                    int i2120 = i2119 % 2;
                } catch (Exception unused3) {
                }
            } catch (Exception unused4) {
            }
            str = null;
            objArr = new Object[]{new int[]{i}, new String[0]};
            int i2121 = TuitionPaymentFragmentbindingInflater1 + 107;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2121 % 128;
            int i2122 = i2121 % 2;
            int i1714 = ((int[]) objArr[0])[0];
            int i181110 = (i63 & i81) | ((~i81) & i);
            int i181111 = -i181110;
            int i181112 = ((i181110 & i181111) | (i181110 ^ i181111)) >> 31;
            int i181113 = (~i181112) & i1714;
            int i181114 = i81 & i181112;
            int i181115 = (i181114 & i181113) | (i181113 ^ i181114);
            String[] strArr9 = (String[]) objArr[1];
            Object[] objArr112 = new Object[2];
            int i181116 = (~(i & i1714)) & (i1714 | i);
            int i181117 = -i181116;
            int i181118 = (((i181116 & i181117) | (i181116 ^ i181117)) >> 31) & 1;
            int i181119 = -i181118;
            int i191110 = (~(((i181119 & i181118) | (i181118 ^ i181119)) >> 31)) & 1;
            objArr112[i181118] = null;
            objArr112[i191110] = strArr9;
            String[] strArr10 = (String[]) objArr112[0];
            int i191111 = (~(i & i181115)) & (i | i181115);
            int i191112 = ((i191111 | (-i191111)) >> 31) & 16;
            Object[] objArr113 = {new int[]{i}, new int[1], new int[]{i181115}, strArr10};
            int i191113 = ~Process.myPid();
            int i191114 = 1944672820 + (((~(i191113 | 52336124)) | 10551299) * (-160)) + (((~(i191113 | 12025895)) | 52336124) * 160);
            int iTuitionPaymentFragmentbindingInflater11 = CaptureBundle.TuitionPaymentFragmentbindingInflater1();
            int i191115 = ((i191112 * (-464)) - (~(-(-(i191114 * (-929)))))) - 1;
            int i191116 = ~i191112;
            int i191117 = (i191114 ^ iTuitionPaymentFragmentbindingInflater11) | (i191114 & iTuitionPaymentFragmentbindingInflater11);
            int i191118 = ~i191117;
            int i191119 = ((i191118 & i191116) | (i191116 ^ i191118)) * (-465);
            int i201110 = ((i191115 | i191119) << 1) - (i191115 ^ i191119);
            int i201111 = ~i191112;
            int i201112 = ~((iTuitionPaymentFragmentbindingInflater11 & i201111) | (i201111 ^ iTuitionPaymentFragmentbindingInflater11));
            int i201113 = (i201110 - (~(((i201112 & i191114) | (i191114 ^ i201112)) * 930))) - 1;
            int i201114 = -(-(((i191117 ^ i191116) | (i191117 & i191116)) * 465));
            int i201115 = i2 + (i201113 & i201114) + (i201114 | i201113);
            int i201116 = i201115 << 13;
            int i201117 = (i201115 | i201116) & (~(i201115 & i201116));
            int i201118 = i201117 >>> 17;
            int i201119 = ((~i201117) & i201118) | ((~i201118) & i201117);
            int i21110 = i201119 << 5;
            ((int[]) objArr113[1])[0] = (i201119 | i21110) & (~(i201119 & i21110));
            int i21111 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 51;
            TuitionPaymentFragmentbindingInflater1 = i21111 % 128;
            int i21112 = i21111 % 2;
            return objArr113;
        } catch (Throwable th4) {
            Throwable cause = th4.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(int r6, int r7, byte r8) {
        /*
            int r7 = r7 * 4
            int r7 = r7 + 1
            int r6 = r6 * 2
            int r6 = r6 + 4
            byte[] r0 = com.appsflyer.internal.AFh1lSDK.$$c
            int r8 = r8 + 113
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r5 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r3 = r0[r6]
        L24:
            int r8 = r8 + r3
            int r6 = r6 + 1
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFh1lSDK.$$e(int, int, byte):java.lang.String");
    }
}
