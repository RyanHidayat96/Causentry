package com.midtrans.sdk.uikit;

import android.graphics.Color;
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
import com.bpjstku.databinding.ActivityVideoListBinding;
import defpackage.initSession;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Random;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes6.dex */
public final class BuildConfig {
    public static final String BUILD_TYPE = "release";
    public static final boolean DEBUG = false;
    public static final String FLAVOR = "production";
    public static final String LIBRARY_PACKAGE_NAME = "com.midtrans.sdk.uikit";
    public static final String VERSION_NAME = "1.29.3";
    private static final byte[] $$c = {113, 29, -123, -97};
    private static final int $$d = 224;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {88, 99, -94, -58};
    private static final int $$b = 225;
    private static int b = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -83722474;

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.midtrans.sdk.uikit.BuildConfig.$$a
            int r5 = r5 * 2
            int r5 = 3 - r5
            int r7 = r7 * 2
            int r7 = r7 + 98
            int r6 = r6 * 2
            int r1 = 1 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L18
            r4 = r6
            r3 = r2
            goto L2c
        L18:
            r3 = r2
        L19:
            int r5 = r5 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L28
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L28:
            r4 = r0[r5]
            int r3 = r3 + 1
        L2c:
            int r4 = -r4
            int r7 = r7 + r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.BuildConfig.c(short, int, short, java.lang.Object[]):void");
    }

    private static void a(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr3 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i5 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i5]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) View.combineMeasuredStates(0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 3291, (ViewConfiguration.getWindowTouchSlop() >> 8) + 31, 1199271174, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Gravity.getAbsoluteGravity(0, 0), 651 - TextUtils.indexOf("", "", 0), 44 - ((Process.getThreadPriority(0) + 20) >> 6), -450685997, false, $$e(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i3 > 0) {
            int i6 = $10 + 55;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr4 = new char[i2];
            System.arraycopy(cArr3, 0, cArr4, 0, i2);
            System.arraycopy(cArr4, 0, cArr3, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr4, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr3, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            int i8 = $10 + 57;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            } else {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            }
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i9 = $11 + 93;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                try {
                    Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 651 - (ViewConfiguration.getLongPressTimeout() >> 16), 44 - TextUtils.indexOf("", "", 0, 0), -450685997, false, $$e(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:51:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:52:0x05d1 A[Catch: Exception -> 0x08ac, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x08ac, blocks: (B:47:0x04ed, B:52:0x05d1, B:54:0x06b8, B:56:0x06c0, B:61:0x07ad, B:66:0x086a, B:71:0x089d, B:72:0x08a3, B:74:0x08a5, B:75:0x08ab, B:53:0x05db, B:63:0x07c6, B:65:0x083b), top: B:98:0x04ed, inners: #1, #5 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x06c0 A[Catch: Exception -> 0x08ac, TRY_LEAVE, TryCatch #2 {Exception -> 0x08ac, blocks: (B:47:0x04ed, B:52:0x05d1, B:54:0x06b8, B:56:0x06c0, B:61:0x07ad, B:66:0x086a, B:71:0x089d, B:72:0x08a3, B:74:0x08a5, B:75:0x08ab, B:53:0x05db, B:63:0x07c6, B:65:0x083b), top: B:98:0x04ed, inners: #1, #5 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x079c  */
    /* JADX WARN: Code duplicated, block: B:61:0x07ad A[Catch: Exception -> 0x08ac, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x08ac, blocks: (B:47:0x04ed, B:52:0x05d1, B:54:0x06b8, B:56:0x06c0, B:61:0x07ad, B:66:0x086a, B:71:0x089d, B:72:0x08a3, B:74:0x08a5, B:75:0x08ab, B:53:0x05db, B:63:0x07c6, B:65:0x083b), top: B:98:0x04ed, inners: #1, #5 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0872 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x0874  */
    /* JADX WARN: Code duplicated, block: B:78:0x08c0  */
    /* JADX WARN: Code duplicated, block: B:79:0x08c5  */
    /* JADX WARN: Code duplicated, block: B:83:0x0909  */
    /* JADX WARN: Code duplicated, block: B:84:0x0923  */
    public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2) throws Throwable {
        int i3;
        int i4;
        int i5;
        String str;
        char c;
        Object[] objArr;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        String[] strArr;
        File file;
        FileReader fileReader;
        BufferedReader bufferedReader;
        boolean zEquals;
        File file2;
        FileReader fileReader2;
        BufferedReader bufferedReader2;
        boolean zEquals2;
        int i12;
        int i13;
        int i14;
        boolean z;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = 2 % 2;
        int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i21 = (i20 ^ 29) + ((i20 & 29) << 1);
        b = i21 % 128;
        int i22 = i21 % 2;
        try {
            int jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() >> 16;
            int i23 = jumpTapTimeout * 1773;
            int i24 = ((i23 | (-192930)) << 1) - (i23 ^ (-192930));
            int i25 = ~jumpTapTimeout;
            int i26 = ~((i25 & (-219)) | (i25 ^ (-219)));
            int i27 = ~((-219) | i);
            int i28 = (i26 & i27) | (i26 ^ i27);
            int i29 = ~i;
            int i30 = (i29 ^ jumpTapTimeout) | (i29 & jumpTapTimeout);
            int i31 = ~((i30 ^ 218) | (i30 & 218));
            int i32 = -(-(((i31 & i28) | (i28 ^ i31)) * 886));
            int i33 = (i24 & i32) + (i32 | i24);
            int i34 = ~i;
            int i35 = ~((i34 ^ 218) | (i34 & 218));
            int i36 = ((~((jumpTapTimeout & i34) | (i34 ^ jumpTapTimeout))) * 886) + ((i33 - (~(-(-(((i35 & jumpTapTimeout) | (jumpTapTimeout ^ i35)) * (-1772)))))) - 1);
            int maxKeyCode = KeyEvent.getMaxKeyCode() >> 16;
            int i37 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            Object[] objArr2 = new Object[1];
            a(false, i36, ((maxKeyCode | 19) << 1) - (maxKeyCode ^ 19), (i37 & 6) + (i37 | 6), new char[]{'\b', 65535, 65533, 14, 65535, 65534, 3, '\r', 65502, 65535, 65532, 15, 1, 1, 65535, '\f', 65501, '\t', '\b'}, objArr2);
            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L);
            int i38 = packedPositionChild * 141;
            int i39 = ((i38 | (-30580)) << 1) - (i38 ^ (-30580));
            int i40 = ~packedPositionChild;
            int i41 = ~((i40 ^ 220) | (i40 & 220));
            int i42 = ~packedPositionChild;
            int i43 = ~((i42 ^ i) | (i42 & i));
            int i44 = ((i41 ^ i43) | (i41 & i43)) * (-280);
            int i45 = (i39 & i44) + (i39 | i44);
            int i46 = ~(i42 | i);
            int i47 = ~(((-221) ^ i) | ((-221) & i));
            int i48 = i45 + (((i46 ^ i47) | (i46 & i47)) * 140);
            int i49 = ~((i42 ^ (-221)) | (i42 & (-221)) | i);
            int i50 = (i40 & i34) | (i40 ^ i34);
            int i51 = ~((i50 & 220) | (i50 ^ 220));
            int i52 = (i51 & i49) | (i49 ^ i51);
            int i53 = ((-221) & i34) | ((-221) ^ i34);
            int i54 = ((~((packedPositionChild & i53) | (i53 ^ packedPositionChild))) | i52) * 140;
            int i55 = (i48 ^ i54) + ((i54 & i48) << 1);
            int i56 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int i57 = i56 * (-563);
            int i58 = (i57 ^ 10735) + ((i57 & 10735) << 1);
            int i59 = ~i56;
            int i60 = ~(((-20) & i34) | ((-20) ^ i34));
            int i61 = (i60 & i59) | (i59 ^ i60);
            int i62 = ~((i ^ 19) | (i & 19));
            int i63 = -(-(((i61 ^ i62) | (i61 & i62)) * (-564)));
            int i64 = (i58 & i63) + (i58 | i63);
            int i65 = ~i56;
            int i66 = (i65 & 19) | (i65 ^ 19);
            int i67 = -(-((~((i66 & i) | (i66 ^ i))) * 1128));
            int i68 = ~((i59 & i29) | (i59 ^ i29));
            int i69 = ~(i56 | 19);
            int i70 = (((i64 & i67) + (i67 | i64)) - (~(((i69 & i68) | (i68 ^ i69)) * 564))) - 1;
            int i71 = -TextUtils.indexOf("", "", 0);
            int i72 = i71 * (-433);
            int i73 = ((i72 | (-1728)) << 1) - (i72 ^ (-1728));
            int i74 = ~i71;
            int i75 = ~((i74 & i29) | (i74 ^ i29));
            int i76 = ~(((-9) ^ i) | ((-9) & i));
            int i77 = (i73 - (~(((i75 ^ i76) | (i75 & i76)) * 217))) - 1;
            int i78 = ~i71;
            int i79 = ~((i78 ^ (-9)) | (i78 & (-9)));
            int i80 = ~((i78 ^ i) | (i78 & i));
            int i81 = (i77 - (~(((i79 ^ i80) | (i80 & i79)) * 217))) - 1;
            int i82 = ~((i29 & (-9)) | ((-9) ^ i29));
            int i83 = ((i82 & i71) | (i71 ^ i82)) * 217;
            Object[] objArr3 = new Object[1];
            a(true, i55, i70, (i81 ^ i83) + ((i83 & i81) << 1), new char[]{65503, 0, 7, 2, '\r', 2, 65530, 16, 11, 65534, 0, 0, 14, 65531, 65534, 65501, 11, '\b'}, objArr3);
            String[] strArr2 = {(String) objArr2[0], (String) objArr3[0]};
            int i84 = 0;
            while (true) {
                if (i84 >= 2) {
                    i5 = i;
                    break;
                }
                int i85 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i86 = (i85 & 123) + (i85 | 123);
                b = i86 % 128;
                int i87 = i86 % 2;
                String str2 = strArr2[i84];
                int i88 = -View.MeasureSpec.getMode(0);
                int i89 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                Object[] objArr4 = new Object[1];
                a(false, ((i88 | 212) << 1) - (i88 ^ 212), (i89 | 17) + (i89 & 17), ExpandableListView.getPackedPositionChild(0L) + 13, new char[]{15, '\t', 4, 65486, 15, 19, 65486, 65508, 5, 2, 21, 7, 1, 14, 4, 18}, objArr4);
                Class<?> cls = Class.forName((String) objArr4[0]);
                if (((Boolean) cls.getMethod(str2, new Class[0]).invoke(cls, null)).booleanValue()) {
                    int i90 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i91 = ((i90 | 117) << 1) - (i90 ^ 117);
                    b = i91 % 128;
                    int i92 = i91 % 2;
                    i3 = i & (-2);
                    i4 = i34 & 1;
                    i5 = i3 | i4;
                    break;
                }
                i84++;
            }
        } catch (Exception unused) {
            i3 = i & (-3);
            i4 = (~i) & 2;
        }
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(109138771);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 2419);
                int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L) + 2846;
                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 5;
                byte b2 = (byte) 0;
                byte b3 = b2;
                Object[] objArr5 = new Object[1];
                c(b2, b3, b3, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cCombineMeasuredStates, packedPositionChild2, iResolveSizeAndState, -501222268, false, (String) objArr5[0], new Class[0]);
            }
            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
            long j = -426340939;
            long j2 = 614;
            long jNextInt = new Random().nextInt();
            long j3 = -1;
            long j4 = j ^ j3;
            long j5 = (j4 | jLongValue) ^ j3;
            long j6 = jLongValue ^ j3;
            long j7 = jNextInt ^ j3;
            long j8 = (((long) 615) * j) + (((long) (-613)) * jLongValue) + ((jNextInt | j5 | ((j6 | j) ^ j3)) * j2) + (((long) (-1228)) * (((j4 | j7) ^ j3) | j5 | ((j7 | jLongValue) ^ j3))) + (j2 * ((j3 ^ ((j7 | j) | jLongValue)) | (((j4 | j6) | j7) ^ j3))) + ((long) (-732845747));
            int iNextInt = new Random().nextInt(40041061);
            int i93 = ((int) (j8 >> 32)) & ((-872043168) + ((~((-75500290) | iNextInt)) * (-301)) + (((~(633642755 | iNextInt)) | (~((~iNextInt) | 2070869166))) * (-301)) + (((~(iNextInt | (-2070869167))) | 633642755) * 301));
            int i94 = ~((-174074647) | i);
            int i95 = ~i;
            int i96 = ((int) j8) & (515481862 + ((i94 | (~(2053828575 | i95))) * 497) + (((~((-442527520) | i95)) | 268452873 | (~(2053828575 | i))) * 497));
            int i97 = (i93 & i96) | (i93 ^ i96);
            int i98 = (~(i & 10)) & (i | 10);
            int i99 = (i97 | 1) & (~(i97 & 1));
            int i100 = (i99 | (-i99)) >> 31;
            int i101 = i98 & (~i100);
            int i102 = i100 & i;
            int i103 = (i102 & i101) | (i101 ^ i102);
            int i104 = (~(i & i5)) & (i | i5);
            int i105 = (i104 | (-i104)) >> 31;
            int i106 = i103 & (~i105);
            int i107 = i5 & i105;
            int i108 = (i106 ^ i107) | (i107 & i106);
            try {
                try {
                    int i109 = -KeyEvent.getDeadChar(0, 0);
                    int iB = ActivityVideoListBinding.b();
                    int i110 = ~iB;
                    int i111 = ~(((-216) & i110) | ((-216) ^ i110));
                    int i112 = ~((i109 ^ iB) | (i109 & iB));
                    int i113 = (((i109 * 960) - 412155) - (~(-(-(((i111 & i112) | (i111 ^ i112)) * 959))))) - (-207143);
                    int i114 = ((~((i109 & i110) | (i110 ^ i109))) | (~((iB & (-216)) | ((-216) ^ iB)))) * 959;
                    Object[] objArr6 = new Object[1];
                    a(true, (i114 | i113) + (i113 & i114), 39 - (~(-View.MeasureSpec.getSize(0))), 9 - (~(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), new char[]{2, 11, 15, 2, '\b', 65484, 16, 22, 16, 65484, 15, 2, 0, 65534, 15, 17, 65532, 17, 11, 2, 15, 15, 18, 0, 65484, 4, 11, 6, 0, 65534, 15, 17, 65484, 4, 18, 65535, 2, 1, 65484, '\t'}, objArr6);
                    File file3 = new File((String) objArr6[0]);
                    if (file3.canRead()) {
                        FileReader fileReader3 = new FileReader(file3);
                        BufferedReader bufferedReader3 = new BufferedReader(fileReader3);
                        int i115 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i116 = (i115 & 95) + (i115 | 95);
                        b = i116 % 128;
                        try {
                            if (i116 % 2 != 0) {
                                String line = bufferedReader3.readLine();
                                int i117 = -(-Color.rgb(1, 0, 0));
                                i15 = ((i117 | 16777443) << 1) - (i117 ^ 16777443);
                                i14 = 0;
                                z = true;
                                str = line;
                                i16 = 5;
                            } else {
                                String line2 = bufferedReader3.readLine();
                                i14 = 0;
                                int i118 = -(-Color.rgb(0, 0, 0));
                                z = false;
                                i15 = ((i118 | 16777443) << 1) - (i118 ^ 16777443);
                                str = line2;
                                i16 = 3;
                            }
                            int iArgb = Color.argb(i14, i14, i14, i14);
                            int i119 = b;
                            int i120 = i119 + 17;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i120 % 128;
                            int i121 = i120 % 2;
                            int i122 = (860 * iArgb) + (i16 * (-858)) + (((iArgb ^ i) | (iArgb & i)) * (-859));
                            int i123 = i119 + 65;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i123 % 128;
                            int i124 = i123 % 2;
                            int i125 = ~((i95 ^ iArgb) | (i95 & iArgb));
                            int i126 = ~iArgb;
                            int i127 = ~i16;
                            int i128 = i119 + 65;
                            int i129 = i128 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i129;
                            if (i128 % 2 == 0) {
                                int i130 = (i126 ^ i127) | (i126 & i127);
                                i17 = (i122 - (~(-(-(859 / ((~((i130 & i) | (i130 ^ i))) | i125)))))) - 1;
                                i18 = ~i16;
                            } else {
                                int i131 = ~(i126 | i127 | i);
                                int i132 = -(-(((i131 & i125) | (i125 ^ i131)) * 859));
                                i17 = (i122 & i132) + (i132 | i122);
                                i18 = i127;
                            }
                            int i133 = ~((i18 & i95) | (i18 ^ i95));
                            int i134 = ~(i127 | iArgb);
                            int i135 = i17 + (859 * ((i133 & i134) | (i133 ^ i134)));
                            int i136 = (i129 ^ 81) + ((i129 & 81) << 1);
                            b = i136 % 128;
                            int i137 = i136 % 2;
                            Object[] objArr7 = new Object[1];
                            a(z, i15, i135, -TextUtils.indexOf((CharSequence) "", '0', 0, 0), new char[]{1, 65535, 0}, objArr7);
                            if (str.equals((String) objArr7[0])) {
                                fileReader3.close();
                                bufferedReader3.close();
                            } else {
                                int i138 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
                                b = i138 % 128;
                                int i139 = i138 % 2;
                                fileReader3.close();
                                bufferedReader3.close();
                                int i140 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                int i141 = ((i140 | 61) << 1) - (i140 ^ 61);
                                b = i141 % 128;
                                int i142 = i141 % 2;
                            }
                            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0);
                            int iB2 = ActivityVideoListBinding.b();
                            int i143 = iLastIndexOf * (-743);
                            int i144 = (i143 & (-159745)) + (i143 | (-159745));
                            int i145 = (iLastIndexOf ^ 215) | (iLastIndexOf & 215);
                            int i146 = ~i145;
                            int i147 = ~(iLastIndexOf | iB2);
                            int i148 = (i146 & i147) | (i146 ^ i147);
                            int i149 = ~((iB2 ^ 215) | (iB2 & 215));
                            int i150 = -(-(((i148 & i149) | (i148 ^ i149)) * (-744)));
                            int i151 = (i144 ^ i150) + ((i150 & i144) << 1);
                            int i152 = ~iB2;
                            int i153 = ~iLastIndexOf;
                            int i154 = ~((i153 & (-216)) | (i153 ^ (-216)));
                            int i155 = ((i151 + (((i154 & i152) | (i152 ^ i154)) * 744)) - (~(-(-(((i145 ^ iB2) | (iB2 & i145)) * 744))))) - 1;
                            int i156 = -(-View.MeasureSpec.getMode(0));
                            int i157 = ((i156 | 31) << 1) - (i156 ^ 31);
                            int iRgb = Color.rgb(0, 0, 0);
                            int iB3 = ActivityVideoListBinding.b();
                            int i158 = iRgb * 758;
                            int i159 = (i158 & 201321300) + (i158 | 201321300);
                            int i160 = ~iB3;
                            int i161 = i159 + (((iRgb ^ i160) | (iRgb & i160)) * (-757));
                            int i162 = -(-((~(((-16777224) ^ iRgb) | ((-16777224) & iRgb) | iB3)) * 1514));
                            int i163 = (i161 & i162) + (i161 | i162);
                            int i164 = ~iRgb;
                            int i165 = ~((i164 & (-16777224)) | (i164 ^ (-16777224)));
                            int i166 = ~((i160 & (-16777224)) | ((-16777224) ^ i160));
                            int i167 = (i166 & i165) | (i165 ^ i166);
                            int i168 = ~((iRgb & 16777223) | (iRgb ^ 16777223) | iB3);
                            int i169 = ((i168 & i167) | (i167 ^ i168)) * 757;
                            Object[] objArr8 = new Object[1];
                            a(false, i155, i157, (i163 & i169) + (i169 | i163), new char[]{3, '\f', 65535, 0, '\n', 3, 2, 65485, 14, 16, '\r', 1, 65485, 17, 23, 17, 65485, '\t', 3, 16, '\f', 3, '\n', 65485, 4, 18, 16, 65535, 1, 3, 65533}, objArr8);
                            file = new File((String) objArr8[0]);
                            if (!file.canRead()) {
                                fileReader = new FileReader(file);
                                bufferedReader = new BufferedReader(fileReader);
                                try {
                                    String line3 = bufferedReader.readLine();
                                    int i170 = -View.resolveSize(0, 0);
                                    int i171 = i170 * 370;
                                    int i172 = ~i;
                                    int i173 = (((i171 | 61050) << 1) - (i171 ^ 61050)) + ((i170 | 165 | i172) * (-369));
                                    int i174 = ~i170;
                                    int i175 = ~((i174 & i172) | (i174 ^ i172));
                                    int i176 = (i173 - (~(-(-(((i175 & 165) | (i175 ^ 165)) * (-369)))))) - 1;
                                    int i177 = ~(((-166) & i170) | ((-166) ^ i170));
                                    int i178 = ~((i170 ^ i) | (i170 & i));
                                    int i179 = (i177 & i178) | (i177 ^ i178);
                                    int i180 = ~i170;
                                    int i181 = ~((i180 & i95) | (i180 ^ i95) | 165);
                                    int i182 = i176 + (((i181 & i179) | (i179 ^ i181)) * 369);
                                    int windowTouchSlop = ViewConfiguration.getWindowTouchSlop() >> 8;
                                    int i183 = (windowTouchSlop * (-919)) - 919;
                                    int i184 = ~windowTouchSlop;
                                    int i185 = (i184 ^ (-2)) | (i184 & (-2));
                                    int i186 = ~((i185 & i) | (i185 ^ i));
                                    int i187 = ~(((-2) ^ i95) | ((-2) & i95) | windowTouchSlop);
                                    int i188 = -(-(((i186 & i187) | (i186 ^ i187)) * 920));
                                    int i189 = ((i183 | i188) << 1) - (i183 ^ i188);
                                    int i190 = ~windowTouchSlop;
                                    int i191 = (i189 - (~(((~((i184 & i95) | (i184 ^ i95))) | (~((i190 ^ (-2)) | (i190 & (-2))))) * 920))) - 1;
                                    int i192 = i190 | (-2);
                                    int i193 = ~((i192 & i95) | (i192 ^ i95));
                                    int i194 = (i190 & 1) | (i190 ^ 1);
                                    int i195 = ~((i194 & i) | (i194 ^ i));
                                    int i196 = (i195 & i193) | (i193 ^ i195);
                                    int i197 = (windowTouchSlop & (-2)) | ((-2) ^ windowTouchSlop);
                                    int i198 = ~((i197 & i) | (i197 ^ i));
                                    int i199 = -(-(((i198 & i196) | (i196 ^ i198)) * 920));
                                    Object[] objArr9 = new Object[1];
                                    a(true, i182, ((i191 | i199) << 1) - (i199 ^ i191), 1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{0}, objArr9);
                                    zEquals = line3.equals((String) objArr9[0]);
                                    fileReader.close();
                                    bufferedReader.close();
                                    if (zEquals) {
                                        int i200 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        int i201 = ~i;
                                        int i202 = ~((~i200) | 214);
                                        int i203 = (i200 * 193) + 41302 + (((i202 & i201) | (i201 ^ i202)) * (-192));
                                        int i204 = ~i200;
                                        int i205 = ~((i204 ^ (-215)) | (i204 & (-215)));
                                        int i206 = ~(((-215) ^ i95) | ((-215) & i95));
                                        int i207 = -(-(((i205 & i206) | (i205 ^ i206)) * (-384)));
                                        int i208 = ((i203 | i207) << 1) - (i203 ^ i207);
                                        int i209 = (i204 ^ (-215)) | (i204 & (-215));
                                        int i210 = ~((i209 & i) | (i209 ^ i));
                                        int i211 = ~(((-215) ^ i95) | ((-215) & i95) | i200);
                                        int i212 = (i210 & i211) | (i210 ^ i211);
                                        int i213 = i200 | 214;
                                        int i214 = ~((i213 & i) | (i213 ^ i));
                                        int i215 = ((i214 & i212) | (i212 ^ i214)) * DerHeader.TAG_CLASS_PRIVATE;
                                        int i216 = ((i208 | i215) << 1) - (i215 ^ i208);
                                        int defaultSize = View.getDefaultSize(0, 0);
                                        int i217 = defaultSize * 370;
                                        int i218 = (i217 & 13320) + (i217 | 13320);
                                        int i219 = defaultSize | 36;
                                        int i220 = ((i219 & i201) | (i219 ^ i201)) * (-369);
                                        int i221 = (i218 & i220) + (i220 | i218);
                                        int i222 = ~defaultSize;
                                        int i223 = ~((i222 ^ i95) | (i222 & i95));
                                        int i224 = i221 + (((i223 & 36) | (i223 ^ 36)) * (-369));
                                        int i225 = ~((-37) | defaultSize);
                                        int i226 = ~((defaultSize & i) | (defaultSize ^ i));
                                        int i227 = (i226 & i225) | (i225 ^ i226);
                                        int i228 = (i222 & i95) | (i222 ^ i95);
                                        int i229 = ~((i228 & 36) | (i228 ^ 36));
                                        int i230 = (i224 - (~(-(-(((i229 & i227) | (i227 ^ i229)) * 369))))) - 1;
                                        int i231 = -(-ExpandableListView.getPackedPositionChild(0L));
                                        Object[] objArr10 = new Object[1];
                                        a(true, i216, i230, (i231 ^ 9) + ((i231 & 9) << 1), new char[]{16, 3, '\t', 65485, 17, 23, 17, 65485, '\f', '\r', 65533, 5, '\f', 7, 1, 65535, 16, 18, 65485, 5, '\f', 7, 1, 65535, 16, 18, 65485, 5, 19, 0, 3, 2, 65485, '\n', 3, '\f'}, objArr10);
                                        file2 = new File((String) objArr10[0]);
                                        if (file2.canRead()) {
                                            fileReader2 = new FileReader(file2);
                                            bufferedReader2 = new BufferedReader(fileReader2);
                                            int i232 = b;
                                            int i233 = ((i232 | 65) << 1) - (i232 ^ 65);
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i233 % 128;
                                            int i234 = i233 % 2;
                                            try {
                                                String line4 = bufferedReader2.readLine();
                                                int i235 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                int iB4 = ActivityVideoListBinding.b();
                                                int i236 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                int i237 = (i236 & 35) + (i236 | 35);
                                                b = i237 % 128;
                                                int i238 = i237 % 2;
                                                int i239 = i235 * (-563);
                                                int i240 = (i239 ^ 92660) + ((i239 & 92660) << 1);
                                                int i241 = ~i235;
                                                int i242 = ~iB4;
                                                int i243 = ~(((-165) ^ i242) | (i242 & (-165)));
                                                int i244 = (i243 & i241) | (i241 ^ i243);
                                                int i245 = ~((iB4 & 164) | (iB4 ^ 164));
                                                int i246 = ((i245 & i244) | (i244 ^ i245)) * (-564);
                                                int i247 = (i240 & i246) + (i246 | i240);
                                                int i248 = (i236 ^ 73) + ((i236 & 73) << 1);
                                                b = i248 % 128;
                                                int i249 = i248 % 2;
                                                int i250 = (i241 ^ 164) | (i241 & 164);
                                                int i251 = i247 + (1128 * (~((i250 & iB4) | (i250 ^ iB4))));
                                                int i252 = ~iB4;
                                                int i253 = i251 + (((~((i252 & i241) | (i241 ^ i252))) | (~((i235 & 164) | (i235 ^ 164)))) * 564);
                                                int i254 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                int i255 = -TextUtils.getOffsetBefore("", 0);
                                                Object[] objArr11 = new Object[1];
                                                a(true, i253, i254, ((i255 | 1) << 1) - (i255 ^ 1), new char[]{0}, objArr11);
                                                zEquals2 = line4.equals((String) objArr11[0]);
                                                fileReader2.close();
                                                bufferedReader2.close();
                                                if (zEquals2) {
                                                    if (str != null) {
                                                        int i256 = b;
                                                        int i257 = (i256 & 63) + (i256 | 63);
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i257 % 128;
                                                        int i258 = i257 % 2;
                                                        objArr = new Object[]{new int[]{(~(i & 20)) & (i | 20)}, new String[]{str}};
                                                        c = 0;
                                                    }
                                                }
                                            } catch (Throwable th) {
                                                fileReader2.close();
                                                bufferedReader2.close();
                                                throw th;
                                            }
                                        } else {
                                            int i259 = b;
                                            i12 = (i259 & 83) + (i259 | 83);
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
                                            if (i12 % 2 == 0) {
                                                if (str != null) {
                                                    int i2510 = b;
                                                    int i2511 = (i2510 & 63) + (i2510 | 63);
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2511 % 128;
                                                    int i2512 = i2511 % 2;
                                                    objArr = new Object[]{new int[]{(~(i & 20)) & (i | 20)}, new String[]{str}};
                                                    c = 0;
                                                }
                                            }
                                        }
                                    }
                                    i6 = ((int[]) objArr[c])[c];
                                    int i260 = (~(i & i108)) & (i | i108);
                                    int i261 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i262 = i261 + 87;
                                    b = i262 % 128;
                                    int i263 = i262 % 2;
                                    int i264 = (i260 | (-i260)) >> 31;
                                    int i265 = (~i264) & i6;
                                    int i266 = i108 & i264;
                                    int i267 = (i266 & i265) | (i265 ^ i266);
                                    String[] strArr3 = (String[]) objArr[1];
                                    Object[] objArr12 = new Object[2];
                                    i7 = i261 + 87;
                                    b = i7 % 128;
                                    if (i7 % 2 != 0) {
                                        int i268 = (i6 | i) & (~(i & i6));
                                        int i269 = -i268;
                                        int i270 = ((i268 & i269) | (i268 ^ i269)) * 57;
                                        i8 = 1;
                                        int i271 = (~i270) & 1;
                                        int i272 = i270 & 1;
                                        i9 = (i272 & i271) | (i271 ^ i272);
                                        i10 = ~(((-i9) | i9) / 54);
                                    } else {
                                        i8 = 1;
                                        int i273 = (i6 | i) & (~(i & i6));
                                        int i274 = -i273;
                                        i9 = (((i273 & i274) | (i273 ^ i274)) >> 31) & 1;
                                        int i275 = -i9;
                                        i10 = ~(((i275 & i9) | (i9 ^ i275)) >> 31);
                                    }
                                    objArr12[i9] = null;
                                    objArr12[i10 & i8] = strArr3;
                                    String[] strArr4 = (String[]) objArr12[0];
                                    Object[] objArr13 = new Object[4];
                                    int[] iArr = new int[i8];
                                    objArr13[0] = iArr;
                                    objArr13[i8] = new int[i8];
                                    int[] iArr2 = new int[i8];
                                    objArr13[2] = iArr2;
                                    int i276 = (i95 & i267) | ((~i267) & i);
                                    int i277 = -i276;
                                    iArr[0] = i;
                                    int i278 = (i261 ^ 5) + ((5 & i261) << 1);
                                    b = i278 % 128;
                                    int i279 = i278 % 2;
                                    iArr2[0] = i267;
                                    objArr13[3] = strArr4;
                                    int i280 = (~((int) Runtime.getRuntime().maxMemory())) | 547326674;
                                    int i281 = 475217381 + (i280 * 495) + (((~i280) | 545753602) * 495) + ((((i276 & i277) | (i276 ^ i277)) >> 31) & 16);
                                    int i282 = (i2 ^ i281) + ((i2 & i281) << 1);
                                    int i283 = i282 << 13;
                                    int i284 = ((~i282) & i283) | ((~i283) & i282);
                                    int i285 = i284 >>> 17;
                                    int i286 = (i284 | i285) & (~(i284 & i285));
                                    int i287 = i286 << 5;
                                    ((int[]) objArr13[1])[0] = ((~i286) & i287) | ((~i287) & i286);
                                    return objArr13;
                                } catch (Throwable th2) {
                                    fileReader.close();
                                    bufferedReader.close();
                                    throw th2;
                                }
                            }
                            i13 = b + 65;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 % 128;
                            if (i13 % 2 == 0) {
                                int i288 = 3 / 4;
                            }
                            objArr = new Object[2];
                            int[] iArr3 = new int[1];
                            objArr[0] = iArr3;
                            int i289 = b;
                            i11 = i289 + 101;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
                            if (i11 % 2 == 0) {
                                strArr = new String[1];
                                c = 0;
                            } else {
                                c = 0;
                                strArr = new String[0];
                            }
                            iArr3[c] = i;
                            int i290 = i289 + 83;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i290 % 128;
                            int i291 = i290 % 2;
                            objArr[1] = strArr;
                            i6 = ((int[]) objArr[c])[c];
                            int i2610 = (~(i & i108)) & (i | i108);
                            int i2611 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i2612 = i2611 + 87;
                            b = i2612 % 128;
                            int i2613 = i2612 % 2;
                            int i2614 = (i2610 | (-i2610)) >> 31;
                            int i2615 = (~i2614) & i6;
                            int i2616 = i108 & i2614;
                            int i2617 = (i2616 & i2615) | (i2615 ^ i2616);
                            String[] strArr5 = (String[]) objArr[1];
                            Object[] objArr14 = new Object[2];
                            i7 = i2611 + 87;
                            b = i7 % 128;
                            if (i7 % 2 != 0) {
                                int i2618 = (i6 | i) & (~(i & i6));
                                int i2619 = -i2618;
                                int i2710 = ((i2618 & i2619) | (i2618 ^ i2619)) * 57;
                                i8 = 1;
                                int i2711 = (~i2710) & 1;
                                int i2712 = i2710 & 1;
                                i9 = (i2712 & i2711) | (i2711 ^ i2712);
                                i10 = ~(((-i9) | i9) / 54);
                            } else {
                                i8 = 1;
                                int i2713 = (i6 | i) & (~(i & i6));
                                int i2714 = -i2713;
                                i9 = (((i2713 & i2714) | (i2713 ^ i2714)) >> 31) & 1;
                                int i2715 = -i9;
                                i10 = ~(((i2715 & i9) | (i9 ^ i2715)) >> 31);
                            }
                            objArr14[i9] = null;
                            objArr14[i10 & i8] = strArr5;
                            String[] strArr6 = (String[]) objArr14[0];
                            Object[] objArr15 = new Object[4];
                            int[] iArr4 = new int[i8];
                            objArr15[0] = iArr4;
                            objArr15[i8] = new int[i8];
                            int[] iArr5 = new int[i8];
                            objArr15[2] = iArr5;
                            int i2716 = (i95 & i2617) | ((~i2617) & i);
                            int i2717 = -i2716;
                            iArr4[0] = i;
                            int i2718 = (i2611 ^ 5) + ((5 & i2611) << 1);
                            b = i2718 % 128;
                            int i2719 = i2718 % 2;
                            iArr5[0] = i2617;
                            objArr15[3] = strArr6;
                            int i2810 = (~((int) Runtime.getRuntime().maxMemory())) | 547326674;
                            int i2811 = 475217381 + (i2810 * 495) + (((~i2810) | 545753602) * 495) + ((((i2716 & i2717) | (i2716 ^ i2717)) >> 31) & 16);
                            int i2812 = (i2 ^ i2811) + ((i2 & i2811) << 1);
                            int i2813 = i2812 << 13;
                            int i2814 = ((~i2812) & i2813) | ((~i2813) & i2812);
                            int i2815 = i2814 >>> 17;
                            int i2816 = (i2814 | i2815) & (~(i2814 & i2815));
                            int i2817 = i2816 << 5;
                            ((int[]) objArr15[1])[0] = ((~i2816) & i2817) | ((~i2817) & i2816);
                            return objArr15;
                        } catch (Throwable th3) {
                            fileReader3.close();
                            bufferedReader3.close();
                            throw th3;
                        }
                    }
                } catch (Exception unused2) {
                }
                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0);
                int iB5 = ActivityVideoListBinding.b();
                int i1410 = iLastIndexOf2 * (-743);
                int i1411 = (i1410 & (-159745)) + (i1410 | (-159745));
                int i1412 = (iLastIndexOf2 ^ 215) | (iLastIndexOf2 & 215);
                int i1413 = ~i1412;
                int i1414 = ~(iLastIndexOf2 | iB5);
                int i1415 = (i1413 & i1414) | (i1413 ^ i1414);
                int i1416 = ~((iB5 ^ 215) | (iB5 & 215));
                int i1510 = -(-(((i1415 & i1416) | (i1415 ^ i1416)) * (-744)));
                int i1511 = (i1411 ^ i1510) + ((i1510 & i1411) << 1);
                int i1512 = ~iB5;
                int i1513 = ~iLastIndexOf2;
                int i1514 = ~((i1513 & (-216)) | (i1513 ^ (-216)));
                int i1515 = ((i1511 + (((i1514 & i1512) | (i1512 ^ i1514)) * 744)) - (~(-(-(((i1412 ^ iB5) | (iB5 & i1412)) * 744))))) - 1;
                int i1516 = -(-View.MeasureSpec.getMode(0));
                int i1517 = ((i1516 | 31) << 1) - (i1516 ^ 31);
                int iRgb2 = Color.rgb(0, 0, 0);
                int iB6 = ActivityVideoListBinding.b();
                int i1518 = iRgb2 * 758;
                int i1519 = (i1518 & 201321300) + (i1518 | 201321300);
                int i1610 = ~iB6;
                int i1611 = i1519 + (((iRgb2 ^ i1610) | (iRgb2 & i1610)) * (-757));
                int i1612 = -(-((~(((-16777224) ^ iRgb2) | ((-16777224) & iRgb2) | iB6)) * 1514));
                int i1613 = (i1611 & i1612) + (i1611 | i1612);
                int i1614 = ~iRgb2;
                int i1615 = ~((i1614 & (-16777224)) | (i1614 ^ (-16777224)));
                int i1616 = ~((i1610 & (-16777224)) | ((-16777224) ^ i1610));
                int i1617 = (i1616 & i1615) | (i1615 ^ i1616);
                int i1618 = ~((iRgb2 & 16777223) | (iRgb2 ^ 16777223) | iB6);
                int i1619 = ((i1618 & i1617) | (i1617 ^ i1618)) * 757;
                Object[] objArr16 = new Object[1];
                a(false, i1515, i1517, (i1613 & i1619) + (i1619 | i1613), new char[]{3, '\f', 65535, 0, '\n', 3, 2, 65485, 14, 16, '\r', 1, 65485, 17, 23, 17, 65485, '\t', 3, 16, '\f', 3, '\n', 65485, 4, 18, 16, 65535, 1, 3, 65533}, objArr16);
                file = new File((String) objArr16[0]);
                if (!file.canRead()) {
                    fileReader = new FileReader(file);
                    bufferedReader = new BufferedReader(fileReader);
                    String line5 = bufferedReader.readLine();
                    int i1710 = -View.resolveSize(0, 0);
                    int i1711 = i1710 * 370;
                    int i1712 = ~i;
                    int i1713 = (((i1711 | 61050) << 1) - (i1711 ^ 61050)) + ((i1710 | 165 | i1712) * (-369));
                    int i1714 = ~i1710;
                    int i1715 = ~((i1714 & i1712) | (i1714 ^ i1712));
                    int i1716 = (i1713 - (~(-(-(((i1715 & 165) | (i1715 ^ 165)) * (-369)))))) - 1;
                    int i1717 = ~(((-166) & i1710) | ((-166) ^ i1710));
                    int i1718 = ~((i1710 ^ i) | (i1710 & i));
                    int i1719 = (i1717 & i1718) | (i1717 ^ i1718);
                    int i1810 = ~i1710;
                    int i1811 = ~((i1810 & i95) | (i1810 ^ i95) | 165);
                    int i1812 = i1716 + (((i1811 & i1719) | (i1719 ^ i1811)) * 369);
                    int windowTouchSlop2 = ViewConfiguration.getWindowTouchSlop() >> 8;
                    int i1813 = (windowTouchSlop2 * (-919)) - 919;
                    int i1814 = ~windowTouchSlop2;
                    int i1815 = (i1814 ^ (-2)) | (i1814 & (-2));
                    int i1816 = ~((i1815 & i) | (i1815 ^ i));
                    int i1817 = ~(((-2) ^ i95) | ((-2) & i95) | windowTouchSlop2);
                    int i1818 = -(-(((i1816 & i1817) | (i1816 ^ i1817)) * 920));
                    int i1819 = ((i1813 | i1818) << 1) - (i1813 ^ i1818);
                    int i1910 = ~windowTouchSlop2;
                    int i1911 = (i1819 - (~(((~((i1814 & i95) | (i1814 ^ i95))) | (~((i1910 ^ (-2)) | (i1910 & (-2))))) * 920))) - 1;
                    int i1912 = i1910 | (-2);
                    int i1913 = ~((i1912 & i95) | (i1912 ^ i95));
                    int i1914 = (i1910 & 1) | (i1910 ^ 1);
                    int i1915 = ~((i1914 & i) | (i1914 ^ i));
                    int i1916 = (i1915 & i1913) | (i1913 ^ i1915);
                    int i1917 = (windowTouchSlop2 & (-2)) | ((-2) ^ windowTouchSlop2);
                    int i1918 = ~((i1917 & i) | (i1917 ^ i));
                    int i1919 = -(-(((i1918 & i1916) | (i1916 ^ i1918)) * 920));
                    Object[] objArr17 = new Object[1];
                    a(true, i1812, ((i1911 | i1919) << 1) - (i1919 ^ i1911), 1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{0}, objArr17);
                    zEquals = line5.equals((String) objArr17[0]);
                    fileReader.close();
                    bufferedReader.close();
                    if (zEquals) {
                        int i2010 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int i2011 = ~i;
                        int i2012 = ~((~i2010) | 214);
                        int i2013 = (i2010 * 193) + 41302 + (((i2012 & i2011) | (i2011 ^ i2012)) * (-192));
                        int i2014 = ~i2010;
                        int i2015 = ~((i2014 ^ (-215)) | (i2014 & (-215)));
                        int i2016 = ~(((-215) ^ i95) | ((-215) & i95));
                        int i2017 = -(-(((i2015 & i2016) | (i2015 ^ i2016)) * (-384)));
                        int i2018 = ((i2013 | i2017) << 1) - (i2013 ^ i2017);
                        int i2019 = (i2014 ^ (-215)) | (i2014 & (-215));
                        int i2110 = ~((i2019 & i) | (i2019 ^ i));
                        int i2111 = ~(((-215) ^ i95) | ((-215) & i95) | i2010);
                        int i2112 = (i2110 & i2111) | (i2110 ^ i2111);
                        int i2113 = i2010 | 214;
                        int i2114 = ~((i2113 & i) | (i2113 ^ i));
                        int i2115 = ((i2114 & i2112) | (i2112 ^ i2114)) * DerHeader.TAG_CLASS_PRIVATE;
                        int i2116 = ((i2018 | i2115) << 1) - (i2115 ^ i2018);
                        int defaultSize2 = View.getDefaultSize(0, 0);
                        int i2117 = defaultSize2 * 370;
                        int i2118 = (i2117 & 13320) + (i2117 | 13320);
                        int i2119 = defaultSize2 | 36;
                        int i2210 = ((i2119 & i2011) | (i2119 ^ i2011)) * (-369);
                        int i2211 = (i2118 & i2210) + (i2210 | i2118);
                        int i2212 = ~defaultSize2;
                        int i2213 = ~((i2212 ^ i95) | (i2212 & i95));
                        int i2214 = i2211 + (((i2213 & 36) | (i2213 ^ 36)) * (-369));
                        int i2215 = ~((-37) | defaultSize2);
                        int i2216 = ~((defaultSize2 & i) | (defaultSize2 ^ i));
                        int i2217 = (i2216 & i2215) | (i2215 ^ i2216);
                        int i2218 = (i2212 & i95) | (i2212 ^ i95);
                        int i2219 = ~((i2218 & 36) | (i2218 ^ 36));
                        int i2310 = (i2214 - (~(-(-(((i2219 & i2217) | (i2217 ^ i2219)) * 369))))) - 1;
                        int i2311 = -(-ExpandableListView.getPackedPositionChild(0L));
                        Object[] objArr18 = new Object[1];
                        a(true, i2116, i2310, (i2311 ^ 9) + ((i2311 & 9) << 1), new char[]{16, 3, '\t', 65485, 17, 23, 17, 65485, '\f', '\r', 65533, 5, '\f', 7, 1, 65535, 16, 18, 65485, 5, '\f', 7, 1, 65535, 16, 18, 65485, 5, 19, 0, 3, 2, 65485, '\n', 3, '\f'}, objArr18);
                        file2 = new File((String) objArr18[0]);
                        if (file2.canRead()) {
                            int i2513 = b;
                            i12 = (i2513 & 83) + (i2513 | 83);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
                            if (i12 % 2 == 0) {
                                if (str != null) {
                                    int i2514 = b;
                                    int i2515 = (i2514 & 63) + (i2514 | 63);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2515 % 128;
                                    int i2516 = i2515 % 2;
                                    objArr = new Object[]{new int[]{(~(i & 20)) & (i | 20)}, new String[]{str}};
                                    c = 0;
                                }
                            }
                        } else {
                            fileReader2 = new FileReader(file2);
                            bufferedReader2 = new BufferedReader(fileReader2);
                            int i2312 = b;
                            int i2313 = ((i2312 | 65) << 1) - (i2312 ^ 65);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2313 % 128;
                            int i2314 = i2313 % 2;
                            String line6 = bufferedReader2.readLine();
                            int i2315 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                            int iB7 = ActivityVideoListBinding.b();
                            int i2316 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i2317 = (i2316 & 35) + (i2316 | 35);
                            b = i2317 % 128;
                            int i2318 = i2317 % 2;
                            int i2319 = i2315 * (-563);
                            int i2410 = (i2319 ^ 92660) + ((i2319 & 92660) << 1);
                            int i2411 = ~i2315;
                            int i2412 = ~iB7;
                            int i2413 = ~(((-165) ^ i2412) | (i2412 & (-165)));
                            int i2414 = (i2413 & i2411) | (i2411 ^ i2413);
                            int i2415 = ~((iB7 & 164) | (iB7 ^ 164));
                            int i2416 = ((i2415 & i2414) | (i2414 ^ i2415)) * (-564);
                            int i2417 = (i2410 & i2416) + (i2416 | i2410);
                            int i2418 = (i2316 ^ 73) + ((i2316 & 73) << 1);
                            b = i2418 % 128;
                            int i2419 = i2418 % 2;
                            int i2517 = (i2411 ^ 164) | (i2411 & 164);
                            int i2518 = i2417 + (1128 * (~((i2517 & iB7) | (i2517 ^ iB7))));
                            int i2519 = ~iB7;
                            int i2520 = i2518 + (((~((i2519 & i2411) | (i2411 ^ i2519))) | (~((i2315 & 164) | (i2315 ^ 164)))) * 564);
                            int i2521 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                            int i2522 = -TextUtils.getOffsetBefore("", 0);
                            Object[] objArr19 = new Object[1];
                            a(true, i2520, i2521, ((i2522 | 1) << 1) - (i2522 ^ 1), new char[]{0}, objArr19);
                            zEquals2 = line6.equals((String) objArr19[0]);
                            fileReader2.close();
                            bufferedReader2.close();
                            if (zEquals2) {
                                if (str != null) {
                                    int i25110 = b;
                                    int i25111 = (i25110 & 63) + (i25110 | 63);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i25111 % 128;
                                    int i25112 = i25111 % 2;
                                    objArr = new Object[]{new int[]{(~(i & 20)) & (i | 20)}, new String[]{str}};
                                    c = 0;
                                }
                            }
                        }
                    }
                    i6 = ((int[]) objArr[c])[c];
                    int i26110 = (~(i & i108)) & (i | i108);
                    int i26111 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i26112 = i26111 + 87;
                    b = i26112 % 128;
                    int i26113 = i26112 % 2;
                    int i26114 = (i26110 | (-i26110)) >> 31;
                    int i26115 = (~i26114) & i6;
                    int i26116 = i108 & i26114;
                    int i26117 = (i26116 & i26115) | (i26115 ^ i26116);
                    String[] strArr7 = (String[]) objArr[1];
                    Object[] objArr110 = new Object[2];
                    i7 = i26111 + 87;
                    b = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i26118 = (i6 | i) & (~(i & i6));
                        int i26119 = -i26118;
                        int i27110 = ((i26118 & i26119) | (i26118 ^ i26119)) * 57;
                        i8 = 1;
                        int i27111 = (~i27110) & 1;
                        int i27112 = i27110 & 1;
                        i9 = (i27112 & i27111) | (i27111 ^ i27112);
                        i10 = ~(((-i9) | i9) / 54);
                    } else {
                        i8 = 1;
                        int i27113 = (i6 | i) & (~(i & i6));
                        int i27114 = -i27113;
                        i9 = (((i27113 & i27114) | (i27113 ^ i27114)) >> 31) & 1;
                        int i27115 = -i9;
                        i10 = ~(((i27115 & i9) | (i9 ^ i27115)) >> 31);
                    }
                    objArr110[i9] = null;
                    objArr110[i10 & i8] = strArr7;
                    String[] strArr8 = (String[]) objArr110[0];
                    Object[] objArr111 = new Object[4];
                    int[] iArr6 = new int[i8];
                    objArr111[0] = iArr6;
                    objArr111[i8] = new int[i8];
                    int[] iArr7 = new int[i8];
                    objArr111[2] = iArr7;
                    int i27116 = (i95 & i26117) | ((~i26117) & i);
                    int i27117 = -i27116;
                    iArr6[0] = i;
                    int i27118 = (i26111 ^ 5) + ((5 & i26111) << 1);
                    b = i27118 % 128;
                    int i27119 = i27118 % 2;
                    iArr7[0] = i26117;
                    objArr111[3] = strArr8;
                    int i2818 = (~((int) Runtime.getRuntime().maxMemory())) | 547326674;
                    int i2819 = 475217381 + (i2818 * 495) + (((~i2818) | 545753602) * 495) + ((((i27116 & i27117) | (i27116 ^ i27117)) >> 31) & 16);
                    int i28110 = (i2 ^ i2819) + ((i2 & i2819) << 1);
                    int i28111 = i28110 << 13;
                    int i28112 = ((~i28110) & i28111) | ((~i28111) & i28110);
                    int i28113 = i28112 >>> 17;
                    int i28114 = (i28112 | i28113) & (~(i28112 & i28113));
                    int i28115 = i28114 << 5;
                    ((int[]) objArr111[1])[0] = ((~i28114) & i28115) | ((~i28115) & i28114);
                    return objArr111;
                }
                i13 = b + 65;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 % 128;
                if (i13 % 2 == 0) {
                    int i2820 = 3 / 4;
                }
            } catch (Exception unused3) {
            }
            str = null;
            objArr = new Object[2];
            int[] iArr8 = new int[1];
            objArr[0] = iArr8;
            int i2821 = b;
            i11 = i2821 + 101;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
            if (i11 % 2 == 0) {
                strArr = new String[1];
                c = 0;
            } else {
                c = 0;
                strArr = new String[0];
            }
            iArr8[c] = i;
            int i292 = i2821 + 83;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i292 % 128;
            int i293 = i292 % 2;
            objArr[1] = strArr;
            i6 = ((int[]) objArr[c])[c];
            int i261110 = (~(i & i108)) & (i | i108);
            int i261111 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i261112 = i261111 + 87;
            b = i261112 % 128;
            int i261113 = i261112 % 2;
            int i261114 = (i261110 | (-i261110)) >> 31;
            int i261115 = (~i261114) & i6;
            int i261116 = i108 & i261114;
            int i261117 = (i261116 & i261115) | (i261115 ^ i261116);
            String[] strArr9 = (String[]) objArr[1];
            Object[] objArr112 = new Object[2];
            i7 = i261111 + 87;
            b = i7 % 128;
            if (i7 % 2 != 0) {
                int i261118 = (i6 | i) & (~(i & i6));
                int i261119 = -i261118;
                int i271110 = ((i261118 & i261119) | (i261118 ^ i261119)) * 57;
                i8 = 1;
                int i271111 = (~i271110) & 1;
                int i271112 = i271110 & 1;
                i9 = (i271112 & i271111) | (i271111 ^ i271112);
                i10 = ~(((-i9) | i9) / 54);
            } else {
                i8 = 1;
                int i271113 = (i6 | i) & (~(i & i6));
                int i271114 = -i271113;
                i9 = (((i271113 & i271114) | (i271113 ^ i271114)) >> 31) & 1;
                int i271115 = -i9;
                i10 = ~(((i271115 & i9) | (i9 ^ i271115)) >> 31);
            }
            objArr112[i9] = null;
            objArr112[i10 & i8] = strArr9;
            String[] strArr10 = (String[]) objArr112[0];
            Object[] objArr113 = new Object[4];
            int[] iArr9 = new int[i8];
            objArr113[0] = iArr9;
            objArr113[i8] = new int[i8];
            int[] iArr10 = new int[i8];
            objArr113[2] = iArr10;
            int i271116 = (i95 & i261117) | ((~i261117) & i);
            int i271117 = -i271116;
            iArr9[0] = i;
            int i271118 = (i261111 ^ 5) + ((5 & i261111) << 1);
            b = i271118 % 128;
            int i271119 = i271118 % 2;
            iArr10[0] = i261117;
            objArr113[3] = strArr10;
            int i28116 = (~((int) Runtime.getRuntime().maxMemory())) | 547326674;
            int i28117 = 475217381 + (i28116 * 495) + (((~i28116) | 545753602) * 495) + ((((i271116 & i271117) | (i271116 ^ i271117)) >> 31) & 16);
            int i28118 = (i2 ^ i28117) + ((i2 & i28117) << 1);
            int i28119 = i28118 << 13;
            int i281110 = ((~i28118) & i28119) | ((~i28119) & i28118);
            int i281111 = i281110 >>> 17;
            int i281112 = (i281110 | i281111) & (~(i281110 & i281111));
            int i281113 = i281112 << 5;
            ((int[]) objArr113[1])[0] = ((~i281112) & i281113) | ((~i281113) & i281112);
            return objArr113;
        } catch (Throwable th4) {
            Throwable cause = th4.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th4;
        }
    }

    private static String $$e(byte b2, int i, short s) {
        int i2 = (b2 * 3) + 4;
        int i3 = 120 - i;
        byte[] bArr = $$c;
        int i4 = s * 2;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            i3 = i4 + i3;
            i2++;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            i3 += bArr[i2];
            i2++;
        }
    }
}
