package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.gson.internal.bind.TypeAdapters;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Random;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class tryOpenCamera extends unregisterCamera {
    private static final byte[] $$c = {48, -110, 22, 55};
    private static final int $$d = 15;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {5, 11, -122, -94, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 37;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -83722253;

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 14
            int r9 = 98 - r9
            int r8 = 53 - r8
            byte[] r0 = defpackage.tryOpenCamera.$$a
            int r7 = 144 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r9 = r7
            r3 = r8
            r5 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            int r7 = r7 + 1
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tryOpenCamera.c(short, int, short, java.lang.Object[]):void");
    }

    public static boolean b(Object obj, Object obj2) {
        int i = 2 % 2;
        if (obj == obj2) {
            return true;
        }
        int i2 = TuitionPaymentFragmentbindingInflater1 + 21;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        if (i2 % 2 != 0) {
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        if (obj == null) {
            return false;
        }
        int i4 = i3 + 71;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return obj.equals(obj2);
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object... objArr) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Arrays.hashCode(objArr);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x016b  */
    /* JADX WARN: Code duplicated, block: B:34:0x016c  */
    private static void a(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        long j;
        Throwable cause;
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (true) {
            j = 0;
            if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i2) {
                break;
            }
            int i5 = $11 + 51;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i7 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.getOffsetBefore("", 0), Color.alpha(0) + 3291, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 30, 1199271174, false, $$e(b, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), View.resolveSize(0, 0) + 651, 44 - View.MeasureSpec.getMode(0), -450685997, false, $$e(b3, b4, b4), new Class[]{Object.class, Object.class});
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
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            int i8 = $10 + 85;
            $11 = i8 % 128;
            int i9 = i8 % 2;
        }
        if (z) {
            char[] cArr4 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) - 1), TextUtils.lastIndexOf("", '0', 0) + 652, 43 - TextUtils.indexOf((CharSequence) "", '0', 0), -450685997, false, $$e(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                j = 0;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x07ec A[Catch: Exception -> 0x089c, TRY_LEAVE, TryCatch #2 {Exception -> 0x089c, blocks: (B:87:0x076f, B:92:0x07db, B:96:0x07e4, B:98:0x07ea, B:99:0x07eb, B:100:0x07ec, B:105:0x087b, B:110:0x0890, B:112:0x0896, B:113:0x0897, B:88:0x0780, B:90:0x078d, B:91:0x07d4, B:101:0x0825, B:103:0x0832, B:104:0x0874), top: B:138:0x074d, inners: #1, #7 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x0832 A[Catch: all -> 0x088f, TryCatch #7 {all -> 0x088f, blocks: (B:101:0x0825, B:103:0x0832, B:104:0x0874), top: B:146:0x0825, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0883  */
    /* JADX WARN: Code duplicated, block: B:116:0x089c A[PHI: r11
  0x089c: PHI (r11v3 int) = (r11v2 int), (r11v5 int), (r11v21 int), (r11v21 int), (r11v21 int) binds: [B:115:0x089b, B:114:0x0898, B:133:0x089c, B:107:0x0881, B:93:0x07df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:119:0x08bb  */
    /* JADX WARN: Code duplicated, block: B:120:0x08c7  */
    /* JADX WARN: Code duplicated, block: B:123:0x08e6  */
    /* JADX WARN: Code duplicated, block: B:126:0x09bb  */
    /* JADX WARN: Code duplicated, block: B:141:0x03b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0398  */
    /* JADX WARN: Code duplicated, block: B:34:0x039e  */
    /* JADX WARN: Code duplicated, block: B:36:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:41:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:43:0x03c4 A[Catch: Exception -> 0x089b, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x089b, blocks: (B:38:0x03b2, B:43:0x03c4, B:51:0x0429, B:63:0x04ca), top: B:141:0x03b2 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:50:0x0420  */
    /* JADX WARN: Code duplicated, block: B:53:0x0436  */
    /* JADX WARN: Code duplicated, block: B:58:0x046f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0489  */
    /* JADX WARN: Code duplicated, block: B:62:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:70:0x0512 A[Catch: all -> 0x05f1, TryCatch #0 {all -> 0x05f1, blocks: (B:68:0x0505, B:70:0x0512, B:71:0x054f), top: B:134:0x0505, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x05fa A[Catch: Exception -> 0x0898, TRY_LEAVE, TryCatch #5 {Exception -> 0x0898, blocks: (B:67:0x04f8, B:73:0x059d, B:75:0x05f2, B:77:0x05f8, B:78:0x05f9, B:66:0x04f3, B:54:0x0445, B:46:0x03d5, B:79:0x05fa, B:81:0x0673, B:83:0x06f0, B:68:0x0505, B:70:0x0512, B:71:0x054f), top: B:143:0x03b6, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x074f  */
    /* JADX WARN: Code duplicated, block: B:90:0x078d A[Catch: all -> 0x07e3, TryCatch #1 {all -> 0x07e3, blocks: (B:88:0x0780, B:90:0x078d, B:91:0x07d4), top: B:136:0x0780, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x07e1  */
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
        int i13;
        int i14;
        String str;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Object[] objArr;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object[] objArr2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        int i21;
        int iCombineMeasuredStates;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        char[] cArr;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        int i40 = 2 % 2;
        int i41 = TuitionPaymentFragmentbindingInflater1;
        int i42 = (i41 ^ 115) + ((i41 & 115) << 1);
        int i43 = i42 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i43;
        int i44 = i42 % 2;
        if (context != null) {
            int i45 = (i43 ^ 55) + ((i43 & 55) << 1);
            TuitionPaymentFragmentbindingInflater1 = i45 % 128;
            int i46 = i45 % 2;
            try {
                int i47 = -TextUtils.getCapsMode("", 0, 0);
                int i48 = (i47 ^ 246) + ((i47 & 246) << 1);
                int i49 = -Color.blue(0);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i50 = (i49 * (-317)) + 7337;
                int i51 = ~i49;
                int i52 = (i51 ^ (-24)) | (i51 & (-24));
                int i53 = ~((i52 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i52 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                int i54 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i55 = (i54 ^ i49) | (i54 & i49);
                int i56 = ~((i55 ^ 23) | (i55 & 23));
                int i57 = ((i53 ^ i56) | (i53 & i56)) * (-318);
                int i58 = (i50 & i57) + (i50 | i57);
                int i59 = ~(((-24) ^ i49) | ((-24) & i49));
                int i60 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
                TuitionPaymentFragmentbindingInflater1 = i60 % 128;
                int i61 = i60 % 2;
                int i62 = ~((i49 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i49 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                int i63 = (i58 - (~(-(-((-318) * ((i62 & i59) | (i59 ^ i62))))))) - 1;
                int i64 = ~((i51 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i51 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                int i65 = i63 + (((i64 & (-24)) | ((-24) ^ i64)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
                int i66 = -ExpandableListView.getPackedPositionType(0L);
                Object[] objArr3 = new Object[1];
                a(true, i48, i65, ((i66 | 13) << 1) - (i66 ^ 13), new char[]{0, 15, '\t', '\n', 65534, 65481, 65535, 4, '\n', '\r', 65535, '\t', 65532, 15, 19, 0, 15, '\t', '\n', 65502, 65481, 15, '\t'}, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                int tapTimeout = ViewConfiguration.getTapTimeout() >> 16;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i67 = tapTimeout * 1773;
                int i68 = ((i67 | (-219480)) << 1) - (i67 ^ (-219480));
                int i69 = ~tapTimeout;
                int i70 = ~((i69 & (-249)) | (i69 ^ (-249)));
                int i71 = ~(((-249) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | ((-249) & iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                int i72 = (i70 & i71) | (i70 ^ i71);
                int i73 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i74 = ~(i73 | tapTimeout | 248);
                int i75 = ((i72 & i74) | (i72 ^ i74)) * 886;
                int i76 = (i68 & i75) + (i75 | i68);
                int i77 = ~((i73 ^ 248) | (i73 & 248));
                int i78 = ((~((tapTimeout & i73) | (i73 ^ tapTimeout))) * 886) + i76 + (((i77 & tapTimeout) | (tapTimeout ^ i77)) * (-1772));
                int iMyPid = Process.myPid() >> 22;
                int i79 = (iMyPid | 18) + (iMyPid & 18);
                int i80 = -TextUtils.lastIndexOf("", '0', 0);
                int i81 = i80 * 989;
                int i82 = (i81 ^ (-9870)) + ((i81 & (-9870)) << 1);
                int i83 = ~i;
                int i84 = (i83 & (-11)) | ((-11) ^ i83);
                int i85 = ~((i84 & i80) | (i84 ^ i80));
                int i86 = i80 | 10;
                int i87 = ~((i86 ^ i) | (i86 & i));
                int i88 = i82 + (((i85 ^ i87) | (i85 & i87)) * 988);
                int i89 = -(-((i80 | (-11)) * (-988)));
                int i90 = (i88 ^ i89) + ((i89 & i88) << 1);
                int i91 = ~((~i80) | (-11));
                int i92 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i93 = (i92 & 57) + (i92 | 57);
                TuitionPaymentFragmentbindingInflater1 = i93 % 128;
                int i94 = i93 % 2;
                int i95 = ~((-11) | i);
                int i96 = (i95 & i91) | (i91 ^ i95);
                int i97 = ~i;
                int i98 = (i80 & i97) | (i97 ^ i80);
                int i99 = ~((i98 & 10) | (i98 ^ 10));
                int i100 = -(-(988 * ((i96 & i99) | (i96 ^ i99))));
                int i101 = (i90 ^ i100) + ((i100 & i90) << 1);
                Object[] objArr4 = new Object[1];
                a(false, i78, i79, i101, new char[]{2, 65532, 65530, '\r', 2, '\b', 7, 65506, 7, 65535, '\b', 0, 65534, '\r', 65498, '\t', '\t', 5}, objArr4);
                Object objInvoke = cls.getMethod((String) objArr4[0], null).invoke(context, null);
                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 244;
                int i102 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int i103 = ((i102 | 34) << 1) - (i102 ^ 34);
                int jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() >> 16;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i104 = jumpTapTimeout * (-523);
                int i105 = (i104 ^ 3945) + ((i104 & 3945) << 1);
                int i106 = ~jumpTapTimeout;
                int i107 = (i106 & 15) | (i106 ^ 15);
                int i108 = ~i107;
                int i109 = ((-16) ^ jumpTapTimeout) | ((-16) & jumpTapTimeout);
                int i110 = ~i109;
                int i111 = (i108 ^ i110) | (i110 & i108);
                int i112 = ~((-16) | iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                int i113 = i105 + (((i111 ^ i112) | (i111 & i112)) * 262);
                int i114 = (~((-16) | jumpTapTimeout)) * (-786);
                int i115 = ((i113 | i114) << 1) - (i114 ^ i113);
                int i116 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i117 = ~((i116 & (-16)) | ((-16) ^ i116));
                int i118 = ~i107;
                int i119 = ((i117 & i118) | (i117 ^ i118) | (~i109)) * 262;
                Object[] objArr5 = new Object[1];
                a(false, scrollDefaultDelay, i103, (i115 ^ i119) + ((i119 & i115) << 1), new char[]{65502, '\r', '\r', '\t', 6, 0, 65534, 17, 6, '\f', 11, 65510, 11, 3, '\f', 65534, 11, 1, 15, '\f', 6, 1, 65483, 0, '\f', 11, 17, 2, 11, 17, 65483, '\r', '\n', 65483}, objArr5);
                Class<?> cls2 = Class.forName((String) objArr5[0]);
                int iKeyCodeFromString = KeyEvent.keyCodeFromString("");
                int i120 = iKeyCodeFromString * 784;
                int i121 = (i120 & (-195500)) + (i120 | (-195500)) + 196533;
                int i122 = ~iKeyCodeFromString;
                int i123 = (~((i122 & i97) | (i122 ^ i97) | ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION)) * (-783);
                int i124 = ((i121 | i123) << 1) - (i123 ^ i121);
                int i125 = ~iKeyCodeFromString;
                int i126 = ~((i97 ^ ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION) | (i97 & ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION));
                int i127 = ((i125 & i126) | (i125 ^ i126)) * 783;
                int i128 = (i124 & i127) + (i127 | i124);
                int longPressTimeout = ViewConfiguration.getLongPressTimeout();
                int i129 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
                TuitionPaymentFragmentbindingInflater1 = i129 % 128;
                int i130 = i129 % 2;
                int i131 = 5 - (longPressTimeout >> 16);
                int i132 = -Color.argb(0, 0, 0, 0);
                Object[] objArr6 = new Object[1];
                a(true, i128, i131, (i132 ^ 1) + ((i132 & 1) << 1), new char[]{65533, '\n', 65534, 65528, 3}, objArr6);
                int i133 = cls2.getField((String) objArr6[0]).getInt(objInvoke) & 2;
                int i134 = (i133 | (-i133)) >> 31;
                i4 = (i134 & (i ^ 1)) | ((~i134) & i);
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
                char c = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 16950);
                int iAlpha = Color.alpha(0) + 2739;
                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 13;
                byte[] bArr = $$a;
                Object[] objArr7 = new Object[1];
                c((short) 141, bArr[7], bArr[132], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, iAlpha, edgeSlop, 1501733736, false, (String) objArr7[0], new Class[0]);
            }
            Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, null);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 16949);
                int gidForName = 2738 - Process.getGidForName("");
                int i135 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 12;
                byte[] bArr2 = $$a;
                Object[] objArr8 = new Object[1];
                c((short) 89, bArr2[7], bArr2[132], objArr8);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveOpacity, gidForName, i135, 47863026, false, (String) objArr8[0], null);
            }
            if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null))) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c2 = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 16949);
                    int iIndexOf = 2738 - TextUtils.indexOf((CharSequence) "", '0');
                    int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) + 13;
                    short s = (short) $$b;
                    byte[] bArr3 = $$a;
                    Object[] objArr9 = new Object[1];
                    c(s, (byte) (bArr3[33] - 1), bArr3[132], objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, iIndexOf, longPressTimeout2, 631063962, false, (String) objArr9[0], null);
                }
                if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null))) {
                    if (Build.VERSION.SDK_INT > 33) {
                        i21 = TuitionPaymentFragmentbindingInflater1 + 77;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i21 % 128;
                        if (i21 % 2 != 0) {
                            int windowTouchSlop = ViewConfiguration.getWindowTouchSlop() * 1177052;
                            iCombineMeasuredStates = View.combineMeasuredStates(0, 0);
                            i23 = windowTouchSlop;
                            i22 = 5;
                        } else {
                            int windowTouchSlop2 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 239;
                            iCombineMeasuredStates = View.combineMeasuredStates(0, 0);
                            i22 = 28;
                            i23 = windowTouchSlop2;
                        }
                        int i136 = iCombineMeasuredStates * (-1965);
                        int i137 = i22 * 984;
                        int i138 = (i136 ^ i137) + ((i136 & i137) << 1);
                        int i139 = ~i22;
                        int i140 = ((iCombineMeasuredStates ^ i139) | (iCombineMeasuredStates & i139)) * 983;
                        int i141 = (i138 ^ i140) + ((i140 & i138) << 1);
                        i24 = ~iCombineMeasuredStates;
                        i25 = ~i;
                        int i142 = ~(i139 | i25);
                        i26 = (i141 - (~(-(-(((i142 & i24) | (i24 ^ i142)) * (-983)))))) - 1;
                        int i143 = ~iCombineMeasuredStates;
                        i27 = ~((i143 & i25) | (i143 ^ i25));
                        i28 = TuitionPaymentFragmentbindingInflater1 + 33;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i28 % 128;
                        if (i28 % 2 != 0) {
                            int i144 = ~((i24 & i22) | (i24 ^ i22));
                            int i145 = i26 % (983 % ((i27 & i144) | (i27 ^ i144)));
                            i29 = -(ViewConfiguration.getKeyRepeatDelay() / 62);
                            i31 = 108;
                            i30 = i145;
                        } else {
                            int i146 = ~((i24 & i22) | (i24 ^ i22));
                            int i147 = ((i27 & i146) | (i27 ^ i146)) * 983;
                            int i148 = ((i26 | i147) << 1) - (i147 ^ i26);
                            i29 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                            i30 = i148;
                            i31 = 9;
                        }
                        int i149 = i29 * 881;
                        int i150 = i31 * 881;
                        i32 = (i149 ^ i150) + ((i149 & i150) << 1);
                        i33 = ~i29;
                        i34 = ~i31;
                        i35 = ~(i33 | i34);
                        int i151 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        i36 = ((i151 | 103) << 1) - (i151 ^ 103);
                        int i152 = i36 % 128;
                        TuitionPaymentFragmentbindingInflater1 = i152;
                        if (i36 % 2 == 0) {
                            int i153 = (~((i33 & i) | (i33 ^ i))) | i35;
                            int i154 = ~((i34 & i) | (i34 ^ i));
                            i37 = i32 >>> (((i153 & i154) | (i153 ^ i154)) * (-880));
                            i33 = ~i29;
                        } else {
                            int i155 = ~(i33 | i);
                            i37 = (i32 - (~(-(-((((i155 & i35) | (i35 ^ i155)) | (~((~i31) | i))) * (-880)))))) - 1;
                        }
                        i38 = i152 + 15;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i38 % 128;
                        if (i38 % 2 != 0) {
                            int i156 = ~i;
                            int i157 = ~((i33 & i156) | (i33 ^ i156));
                            int i158 = (i31 & i157) | (i31 ^ i157);
                            int i159 = ~((i29 & i) | (i29 ^ i));
                            int i160 = -((i158 & i159) | (i158 ^ i159));
                            i39 = (i37 >> (((-880) ^ i160) + ((i160 & (-880)) << 1))) * (879 - (~(-i159)));
                            cArr = new char[]{'\t', '\t', 3, 4, 14, 7, 65488, 20, 5, 65489, 7, 22, 5, 65489, 11, 16, 11, 22, 65489, 14, 14, '\r', 6, 65487, 6, 7, 4, 23};
                        } else {
                            int i161 = ~((i33 & i25) | (i33 ^ i25));
                            int i162 = (i31 & i161) | (i31 ^ i161);
                            int i163 = ~((i29 & i) | (i29 ^ i));
                            int i164 = -(-((-880) * ((i162 & i163) | (i162 ^ i163))));
                            int i165 = ((i37 | i164) << 1) - (i164 ^ i37);
                            int i166 = i163 * 880;
                            i39 = (i165 ^ i166) + ((i166 & i165) << 1);
                            cArr = new char[]{'\t', '\t', 3, 4, 14, 7, 65488, 20, 5, 65489, 7, 22, 5, 65489, 11, 16, 11, 22, 65489, 14, 14, '\r', 6, 65487, 6, 7, 4, 23};
                        }
                        char[] cArr2 = cArr;
                        Object[] objArr10 = new Object[1];
                        a(false, i23, i30, i39, cArr2, objArr10);
                        Object[] objArr11 = {(String) objArr10[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            int i167 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 993;
                            int i168 = 9 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                            byte b = $$a[7];
                            short s2 = b;
                            Object[] objArr12 = new Object[1];
                            c(s2, (byte) (s2 | 52), b, objArr12);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumFlingVelocity, i167, i168, 410748506, false, (String) objArr12[0], new Class[]{String.class});
                        }
                        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr11)).longValue();
                        long j = 351496629;
                        long j2 = 130;
                        long j3 = -1;
                        long j4 = jLongValue ^ j3;
                        long j5 = i;
                        long j6 = (((long) (-129)) * j) + (((long) 131) * jLongValue) + ((((j4 | (j5 ^ j3)) | j) ^ j3) * j2);
                        long j7 = j4 | j;
                        long j8 = j6 + (((long) (-260)) * (j7 ^ j3)) + (j2 * ((((j ^ j3) | jLongValue) ^ j3) | ((j7 | j5) ^ j3))) + ((long) (-552414866));
                        int i169 = (int) (j8 >> 32);
                        int i170 = ~((~new Random().nextInt(1238555631)) | 2086350550);
                        int i171 = i169 & (((605030402 | i170) * (-374)) + 122375902 + ((i170 | 1481320148) * 374));
                        int i172 = ~new Random().nextInt();
                        int i173 = ((int) j8) & ((((-804379758) + (((~(257934584 | i172)) | 1179291825) * (-933))) + (((~(i172 | 1179291825)) | 152388680) * 933)) - 309919376);
                        i8 = (i171 & i173) | (i171 ^ i173);
                        i7 = i;
                    } else {
                        int i174 = -(KeyEvent.getMaxKeyCode() >> 16);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i175 = (i174 * (-830)) + 161408;
                        int i176 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (-195));
                        int i177 = TuitionPaymentFragmentbindingInflater1;
                        int i178 = ((i177 | 1) << 1) - (i177 ^ 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i178 % 128;
                        int i179 = i178 % 2;
                        int i180 = (i174 ^ 194) | (i174 & 194);
                        int i181 = (-831) * (i176 | (~((i180 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i180 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4))));
                        int i182 = (i175 & i181) + (i175 | i181);
                        int i183 = ((-195) ^ i174) | ((-195) & i174);
                        int i184 = -(-((~((i183 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i183 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4))) * (-1662)));
                        int i185 = (i182 ^ i184) + ((i184 & i182) << 1);
                        int i186 = ~((~i174) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                        int i187 = ~((i174 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i174 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                        int i188 = (i177 & 47) + (i177 | 47);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i188 % 128;
                        int i189 = i188 % 2;
                        int i190 = (i187 & i186) | (i186 ^ i187);
                        int i191 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault4 & 194) | (194 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                        int i192 = -(-(831 * ((i190 & i191) | (i190 ^ i191))));
                        int i193 = ((i192 & i185) << 1) + (i185 ^ i192);
                        int i194 = -(-(ViewConfiguration.getPressedStateDuration() >> 16));
                        int i195 = ((i194 | 1) << 1) - (i194 ^ 1);
                        int i196 = -TextUtils.getCapsMode("", 0, 0);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i197 = TuitionPaymentFragmentbindingInflater1;
                        int i198 = (i197 & 107) + (i197 | 107);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i198 % 128;
                        int i199 = i198 % 2;
                        int i200 = (i196 * 595) - 1187;
                        int i201 = ~i196;
                        int i202 = ~((i201 & 1) | (i201 ^ 1));
                        int i203 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                        int i204 = ~(i203 | 1);
                        int i205 = ((i202 & i204) | (i202 ^ i204)) * (-1188);
                        int i206 = ((i200 | i205) << 1) - (i200 ^ i205);
                        int i207 = ~i196;
                        int i208 = (~((i207 & 1) | (i207 ^ 1))) | (~(((-2) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | ((-2) & iTuitionPaymentFragmentspecialinlinedviewModeldefault5)));
                        int i209 = ~(i203 | i196);
                        int i210 = -(-(((i208 & i209) | (i208 ^ i209)) * 594));
                        int i211 = ((i206 | i210) << 1) - (i210 ^ i206);
                        int i212 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                        int i213 = ~(((-2) ^ i212) | ((-2) & i212));
                        int i214 = ~(((-2) & i196) | ((-2) ^ i196));
                        int i215 = (i213 & i214) | (i213 ^ i214);
                        int i216 = ~(i196 | i212);
                        int i217 = -(-(((i216 & i215) | (i215 ^ i216)) * 594));
                        Object[] objArr13 = new Object[1];
                        a(false, i193, i195, (i211 & i217) + (i217 | i211), new char[]{0}, objArr13);
                        str = (String) objArr13[0];
                        i15 = 243 - (~Color.argb(0, 0, 0, 0));
                        i16 = 14 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        i17 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        i7 = i;
                        int i218 = ~i7;
                        int i219 = ~(((-6) ^ i218) | ((-6) & i218));
                        int i220 = ~(((-6) & i17) | ((-6) ^ i17));
                        i18 = ((i17 * 50) - 485) + (((i220 & i219) | (i219 ^ i220)) * 98);
                        int i221 = ~i17;
                        int i222 = ~((i218 & i221) | (i221 ^ i218));
                        i19 = (i222 & (-6)) | ((-6) ^ i222);
                        int i223 = TuitionPaymentFragmentbindingInflater1;
                        i20 = (i223 & 43) + (i223 | 43);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20 % 128;
                        if (i20 % 2 != 0) {
                            Object[] objArr14 = new Object[1];
                            a(true, i15, i16, (i18 >> (((~((i17 ^ i7) | (i17 & i7))) | i19) - 49)) >>> (49 >> ((~((i17 & 5) | (i17 ^ 5))) | (~(((-6) ^ i7) | ((-6) & i7))))), new char[]{2, 1, 65483, '\f', 15, 2, '\t', 65535, 65534, 4, 4, 18, 65535}, objArr14);
                            objArr2 = new Object[]{(String) objArr14[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char c3 = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33602);
                                int i224 = 3086 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                int iArgb = Color.argb(0, 0, 0, 0) + 26;
                                byte b2 = $$a[7];
                                short s3 = b2;
                                Object[] objArr15 = new Object[1];
                                c(s3, (byte) (s3 | 52), b2, objArr15);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c3, i224, iArgb, 1411172903, false, (String) objArr15[0], new Class[]{String.class});
                            }
                            if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr2))) {
                                int i225 = TuitionPaymentFragmentbindingInflater1 + 125;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i225 % 128;
                                int i226 = i225 % 2;
                                i8 = 1;
                            } else {
                                i8 = 0;
                            }
                        } else {
                            int i227 = -(-((i19 | (~((i17 ^ i7) | (i17 & i7)))) * (-49)));
                            int i228 = (i18 ^ i227) + ((i18 & i227) << 1);
                            int i229 = ~(((-6) ^ i7) | ((-6) & i7));
                            int i230 = ~(i17 | 5);
                            int i231 = ((i230 & i229) | (i229 ^ i230)) * 49;
                            Object[] objArr16 = new Object[1];
                            a(true, i15, i16, (i228 ^ i231) + ((i231 & i228) << 1), new char[]{2, 1, 65483, '\f', 15, 2, '\t', 65535, 65534, 4, 4, 18, 65535}, objArr16);
                            objArr = new Object[]{(String) objArr16[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char cAlpha = (char) (33602 - Color.alpha(0));
                                int packedPositionType = 3085 - ExpandableListView.getPackedPositionType(0L);
                                int offsetAfter = 26 - TextUtils.getOffsetAfter("", 0);
                                byte b3 = $$a[7];
                                short s4 = b3;
                                Object[] objArr17 = new Object[1];
                                c(s4, (byte) (s4 | 52), b3, objArr17);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAlpha, packedPositionType, offsetAfter, 1411172903, false, (String) objArr17[0], new Class[]{String.class});
                            }
                            if (!(!str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr)))) {
                                int i2210 = TuitionPaymentFragmentbindingInflater1 + 125;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2210 % 128;
                                int i2211 = i2210 % 2;
                                i8 = 1;
                            } else {
                                i8 = 0;
                            }
                        }
                    }
                    i9 = (~(i7 & 10)) & (i7 | 10);
                    int i232 = -i8;
                    i10 = ((i8 & i232) | (i8 ^ i232)) >> 31;
                    int i233 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    i11 = ((i233 | 115) << 1) - (i233 ^ 115);
                    int i234 = i11 % 128;
                    TuitionPaymentFragmentbindingInflater1 = i234;
                    if (i11 % 2 == 0) {
                        int i235 = (~i10) & i7;
                        int i236 = i10 & i9;
                        i12 = (i236 & i235) | (i235 ^ i236);
                        int i237 = 15 / 0;
                    } else {
                        int i238 = (~i10) & i7;
                        int i239 = i10 & i9;
                        i12 = (i239 & i238) | (i238 ^ i239);
                    }
                    int i240 = i2 & 32;
                    int i241 = -i240;
                    i13 = ((i240 & i241) | (i240 ^ i241)) >> 31;
                    i14 = (i234 ^ 63) + ((i234 & 63) << 1);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
                    if (i14 % 2 != 0) {
                        throw null;
                    }
                    int i242 = i12 & (~i13);
                    int i243 = i13 & i7;
                    i6 = (i242 & i243) | (i242 ^ i243);
                } else if (Build.VERSION.SDK_INT == 30) {
                    i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
                    TuitionPaymentFragmentbindingInflater1 = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i244 = 47 / 0;
                    }
                    i6 = i;
                    i7 = i6;
                } else {
                    if (Build.VERSION.SDK_INT > 33) {
                        i21 = TuitionPaymentFragmentbindingInflater1 + 77;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i21 % 128;
                        if (i21 % 2 != 0) {
                            int windowTouchSlop3 = ViewConfiguration.getWindowTouchSlop() * 1177052;
                            iCombineMeasuredStates = View.combineMeasuredStates(0, 0);
                            i23 = windowTouchSlop3;
                            i22 = 5;
                        } else {
                            int windowTouchSlop4 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 239;
                            iCombineMeasuredStates = View.combineMeasuredStates(0, 0);
                            i22 = 28;
                            i23 = windowTouchSlop4;
                        }
                        int i1310 = iCombineMeasuredStates * (-1965);
                        int i1311 = i22 * 984;
                        int i1312 = (i1310 ^ i1311) + ((i1310 & i1311) << 1);
                        int i1313 = ~i22;
                        int i1410 = ((iCombineMeasuredStates ^ i1313) | (iCombineMeasuredStates & i1313)) * 983;
                        int i1411 = (i1312 ^ i1410) + ((i1410 & i1312) << 1);
                        i24 = ~iCombineMeasuredStates;
                        i25 = ~i;
                        int i1412 = ~(i1313 | i25);
                        i26 = (i1411 - (~(-(-(((i1412 & i24) | (i24 ^ i1412)) * (-983)))))) - 1;
                        int i1413 = ~iCombineMeasuredStates;
                        i27 = ~((i1413 & i25) | (i1413 ^ i25));
                        i28 = TuitionPaymentFragmentbindingInflater1 + 33;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i28 % 128;
                        if (i28 % 2 != 0) {
                            int i1414 = ~((i24 & i22) | (i24 ^ i22));
                            int i1415 = i26 % (983 % ((i27 & i1414) | (i27 ^ i1414)));
                            i29 = -(ViewConfiguration.getKeyRepeatDelay() / 62);
                            i31 = 108;
                            i30 = i1415;
                        } else {
                            int i1416 = ~((i24 & i22) | (i24 ^ i22));
                            int i1417 = ((i27 & i1416) | (i27 ^ i1416)) * 983;
                            int i1418 = ((i26 | i1417) << 1) - (i1417 ^ i26);
                            i29 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                            i30 = i1418;
                            i31 = 9;
                        }
                        int i1419 = i29 * 881;
                        int i1510 = i31 * 881;
                        i32 = (i1419 ^ i1510) + ((i1419 & i1510) << 1);
                        i33 = ~i29;
                        i34 = ~i31;
                        i35 = ~(i33 | i34);
                        int i1511 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        i36 = ((i1511 | 103) << 1) - (i1511 ^ 103);
                        int i1512 = i36 % 128;
                        TuitionPaymentFragmentbindingInflater1 = i1512;
                        if (i36 % 2 == 0) {
                            int i1513 = (~((i33 & i) | (i33 ^ i))) | i35;
                            int i1514 = ~((i34 & i) | (i34 ^ i));
                            i37 = i32 >>> (((i1513 & i1514) | (i1513 ^ i1514)) * (-880));
                            i33 = ~i29;
                        } else {
                            int i1515 = ~(i33 | i);
                            i37 = (i32 - (~(-(-((((i1515 & i35) | (i35 ^ i1515)) | (~((~i31) | i))) * (-880)))))) - 1;
                        }
                        i38 = i1512 + 15;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i38 % 128;
                        if (i38 % 2 != 0) {
                            int i1516 = ~i;
                            int i1517 = ~((i33 & i1516) | (i33 ^ i1516));
                            int i1518 = (i31 & i1517) | (i31 ^ i1517);
                            int i1519 = ~((i29 & i) | (i29 ^ i));
                            int i1610 = -((i1518 & i1519) | (i1518 ^ i1519));
                            i39 = (i37 >> (((-880) ^ i1610) + ((i1610 & (-880)) << 1))) * (879 - (~(-i1519)));
                            cArr = new char[]{'\t', '\t', 3, 4, 14, 7, 65488, 20, 5, 65489, 7, 22, 5, 65489, 11, 16, 11, 22, 65489, 14, 14, '\r', 6, 65487, 6, 7, 4, 23};
                        } else {
                            int i1611 = ~((i33 & i25) | (i33 ^ i25));
                            int i1612 = (i31 & i1611) | (i31 ^ i1611);
                            int i1613 = ~((i29 & i) | (i29 ^ i));
                            int i1614 = -(-((-880) * ((i1612 & i1613) | (i1612 ^ i1613))));
                            int i1615 = ((i37 | i1614) << 1) - (i1614 ^ i37);
                            int i1616 = i1613 * 880;
                            i39 = (i1615 ^ i1616) + ((i1616 & i1615) << 1);
                            cArr = new char[]{'\t', '\t', 3, 4, 14, 7, 65488, 20, 5, 65489, 7, 22, 5, 65489, 11, 16, 11, 22, 65489, 14, 14, '\r', 6, 65487, 6, 7, 4, 23};
                        }
                        char[] cArr3 = cArr;
                        Object[] objArr18 = new Object[1];
                        a(false, i23, i30, i39, cArr3, objArr18);
                        Object[] objArr19 = {(String) objArr18[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char maximumFlingVelocity2 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            int i1617 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 993;
                            int i1618 = 9 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                            byte b4 = $$a[7];
                            short s5 = b4;
                            Object[] objArr110 = new Object[1];
                            c(s5, (byte) (s5 | 52), b4, objArr110);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumFlingVelocity2, i1617, i1618, 410748506, false, (String) objArr110[0], new Class[]{String.class});
                        }
                        long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr19)).longValue();
                        long j9 = 351496629;
                        long j10 = 130;
                        long j11 = -1;
                        long j12 = jLongValue2 ^ j11;
                        long j13 = i;
                        long j14 = (((long) (-129)) * j9) + (((long) 131) * jLongValue2) + ((((j12 | (j13 ^ j11)) | j9) ^ j11) * j10);
                        long j15 = j12 | j9;
                        long j16 = j14 + (((long) (-260)) * (j15 ^ j11)) + (j10 * ((((j9 ^ j11) | jLongValue2) ^ j11) | ((j15 | j13) ^ j11))) + ((long) (-552414866));
                        int i1619 = (int) (j16 >> 32);
                        int i1710 = ~((~new Random().nextInt(1238555631)) | 2086350550);
                        int i1711 = i1619 & (((605030402 | i1710) * (-374)) + 122375902 + ((i1710 | 1481320148) * 374));
                        int i1712 = ~new Random().nextInt();
                        int i1713 = ((int) j16) & ((((-804379758) + (((~(257934584 | i1712)) | 1179291825) * (-933))) + (((~(i1712 | 1179291825)) | 152388680) * 933)) - 309919376);
                        i8 = (i1711 & i1713) | (i1711 ^ i1713);
                        i7 = i;
                    } else {
                        int i1714 = -(KeyEvent.getMaxKeyCode() >> 16);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i1715 = (i1714 * (-830)) + 161408;
                        int i1716 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (-195));
                        int i1717 = TuitionPaymentFragmentbindingInflater1;
                        int i1718 = ((i1717 | 1) << 1) - (i1717 ^ 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1718 % 128;
                        int i1719 = i1718 % 2;
                        int i1810 = (i1714 ^ 194) | (i1714 & 194);
                        int i1811 = (-831) * (i1716 | (~((i1810 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i1810 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6))));
                        int i1812 = (i1715 & i1811) + (i1715 | i1811);
                        int i1813 = ((-195) ^ i1714) | ((-195) & i1714);
                        int i1814 = -(-((~((i1813 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i1813 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6))) * (-1662)));
                        int i1815 = (i1812 ^ i1814) + ((i1814 & i1812) << 1);
                        int i1816 = ~((~i1714) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                        int i1817 = ~((i1714 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i1714 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                        int i1818 = (i1717 & 47) + (i1717 | 47);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1818 % 128;
                        int i1819 = i1818 % 2;
                        int i1910 = (i1817 & i1816) | (i1816 ^ i1817);
                        int i1911 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault6 & 194) | (194 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                        int i1912 = -(-(831 * ((i1910 & i1911) | (i1910 ^ i1911))));
                        int i1913 = ((i1912 & i1815) << 1) + (i1815 ^ i1912);
                        int i1914 = -(-(ViewConfiguration.getPressedStateDuration() >> 16));
                        int i1915 = ((i1914 | 1) << 1) - (i1914 ^ 1);
                        int i1916 = -TextUtils.getCapsMode("", 0, 0);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i1917 = TuitionPaymentFragmentbindingInflater1;
                        int i1918 = (i1917 & 107) + (i1917 | 107);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1918 % 128;
                        int i1919 = i1918 % 2;
                        int i2010 = (i1916 * 595) - 1187;
                        int i2011 = ~i1916;
                        int i2012 = ~((i2011 & 1) | (i2011 ^ 1));
                        int i2013 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                        int i2014 = ~(i2013 | 1);
                        int i2015 = ((i2012 & i2014) | (i2012 ^ i2014)) * (-1188);
                        int i2016 = ((i2010 | i2015) << 1) - (i2010 ^ i2015);
                        int i2017 = ~i1916;
                        int i2018 = (~((i2017 & 1) | (i2017 ^ 1))) | (~(((-2) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | ((-2) & iTuitionPaymentFragmentspecialinlinedviewModeldefault7)));
                        int i2019 = ~(i2013 | i1916);
                        int i2110 = -(-(((i2018 & i2019) | (i2018 ^ i2019)) * 594));
                        int i2111 = ((i2016 | i2110) << 1) - (i2110 ^ i2016);
                        int i2112 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                        int i2113 = ~(((-2) ^ i2112) | ((-2) & i2112));
                        int i2114 = ~(((-2) & i1916) | ((-2) ^ i1916));
                        int i2115 = (i2113 & i2114) | (i2113 ^ i2114);
                        int i2116 = ~(i1916 | i2112);
                        int i2117 = -(-(((i2116 & i2115) | (i2115 ^ i2116)) * 594));
                        Object[] objArr111 = new Object[1];
                        a(false, i1913, i1915, (i2111 & i2117) + (i2117 | i2111), new char[]{0}, objArr111);
                        str = (String) objArr111[0];
                        i15 = 243 - (~Color.argb(0, 0, 0, 0));
                        i16 = 14 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        i17 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        i7 = i;
                        int i2118 = ~i7;
                        int i2119 = ~(((-6) ^ i2118) | ((-6) & i2118));
                        int i2212 = ~(((-6) & i17) | ((-6) ^ i17));
                        i18 = ((i17 * 50) - 485) + (((i2212 & i2119) | (i2119 ^ i2212)) * 98);
                        int i2213 = ~i17;
                        int i2214 = ~((i2118 & i2213) | (i2213 ^ i2118));
                        i19 = (i2214 & (-6)) | ((-6) ^ i2214);
                        int i2215 = TuitionPaymentFragmentbindingInflater1;
                        i20 = (i2215 & 43) + (i2215 | 43);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20 % 128;
                        if (i20 % 2 != 0) {
                            Object[] objArr112 = new Object[1];
                            a(true, i15, i16, (i18 >> (((~((i17 ^ i7) | (i17 & i7))) | i19) - 49)) >>> (49 >> ((~((i17 & 5) | (i17 ^ 5))) | (~(((-6) ^ i7) | ((-6) & i7))))), new char[]{2, 1, 65483, '\f', 15, 2, '\t', 65535, 65534, 4, 4, 18, 65535}, objArr112);
                            objArr2 = new Object[]{(String) objArr112[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char c4 = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33602);
                                int i2216 = 3086 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                int iArgb2 = Color.argb(0, 0, 0, 0) + 26;
                                byte b5 = $$a[7];
                                short s6 = b5;
                                Object[] objArr113 = new Object[1];
                                c(s6, (byte) (s6 | 52), b5, objArr113);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c4, i2216, iArgb2, 1411172903, false, (String) objArr113[0], new Class[]{String.class});
                            }
                            if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr2))) {
                                int i2217 = TuitionPaymentFragmentbindingInflater1 + 125;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2217 % 128;
                                int i2218 = i2217 % 2;
                                i8 = 1;
                            } else {
                                i8 = 0;
                            }
                        } else {
                            int i2219 = -(-((i19 | (~((i17 ^ i7) | (i17 & i7)))) * (-49)));
                            int i2220 = (i18 ^ i2219) + ((i18 & i2219) << 1);
                            int i2221 = ~(((-6) ^ i7) | ((-6) & i7));
                            int i2310 = ~(i17 | 5);
                            int i2311 = ((i2310 & i2221) | (i2221 ^ i2310)) * 49;
                            Object[] objArr114 = new Object[1];
                            a(true, i15, i16, (i2220 ^ i2311) + ((i2311 & i2220) << 1), new char[]{2, 1, 65483, '\f', 15, 2, '\t', 65535, 65534, 4, 4, 18, 65535}, objArr114);
                            objArr = new Object[]{(String) objArr114[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char cAlpha2 = (char) (33602 - Color.alpha(0));
                                int packedPositionType2 = 3085 - ExpandableListView.getPackedPositionType(0L);
                                int offsetAfter2 = 26 - TextUtils.getOffsetAfter("", 0);
                                byte b6 = $$a[7];
                                short s7 = b6;
                                Object[] objArr115 = new Object[1];
                                c(s7, (byte) (s7 | 52), b6, objArr115);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAlpha2, packedPositionType2, offsetAfter2, 1411172903, false, (String) objArr115[0], new Class[]{String.class});
                            }
                            if (!(!str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr)))) {
                                int i22110 = TuitionPaymentFragmentbindingInflater1 + 125;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i22110 % 128;
                                int i22111 = i22110 % 2;
                                i8 = 1;
                            } else {
                                i8 = 0;
                            }
                        }
                    }
                    i9 = (~(i7 & 10)) & (i7 | 10);
                    int i2312 = -i8;
                    i10 = ((i8 & i2312) | (i8 ^ i2312)) >> 31;
                    int i2313 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    i11 = ((i2313 | 115) << 1) - (i2313 ^ 115);
                    int i2314 = i11 % 128;
                    TuitionPaymentFragmentbindingInflater1 = i2314;
                    if (i11 % 2 == 0) {
                        int i2315 = (~i10) & i7;
                        int i2316 = i10 & i9;
                        i12 = (i2316 & i2315) | (i2315 ^ i2316);
                        int i2317 = 15 / 0;
                    } else {
                        int i2318 = (~i10) & i7;
                        int i2319 = i10 & i9;
                        i12 = (i2319 & i2318) | (i2318 ^ i2319);
                    }
                    int i245 = i2 & 32;
                    int i246 = -i245;
                    i13 = ((i245 & i246) | (i245 ^ i246)) >> 31;
                    i14 = (i2314 ^ 63) + ((i2314 & 63) << 1);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
                    if (i14 % 2 != 0) {
                        throw null;
                    }
                    int i247 = i12 & (~i13);
                    int i248 = i13 & i7;
                    i6 = (i247 & i248) | (i247 ^ i248);
                }
            } else if (Build.VERSION.SDK_INT == 30) {
                i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
                TuitionPaymentFragmentbindingInflater1 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i249 = 47 / 0;
                }
                i6 = i;
                i7 = i6;
            } else {
                try {
                    try {
                        if (Build.VERSION.SDK_INT > 33) {
                            i21 = TuitionPaymentFragmentbindingInflater1 + 77;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i21 % 128;
                            if (i21 % 2 != 0) {
                                int windowTouchSlop5 = ViewConfiguration.getWindowTouchSlop() * 1177052;
                                iCombineMeasuredStates = View.combineMeasuredStates(0, 0);
                                i23 = windowTouchSlop5;
                                i22 = 5;
                            } else {
                                int windowTouchSlop6 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 239;
                                iCombineMeasuredStates = View.combineMeasuredStates(0, 0);
                                i22 = 28;
                                i23 = windowTouchSlop6;
                            }
                            int i1314 = iCombineMeasuredStates * (-1965);
                            int i1315 = i22 * 984;
                            int i1316 = (i1314 ^ i1315) + ((i1314 & i1315) << 1);
                            int i1317 = ~i22;
                            int i14110 = ((iCombineMeasuredStates ^ i1317) | (iCombineMeasuredStates & i1317)) * 983;
                            int i14111 = (i1316 ^ i14110) + ((i14110 & i1316) << 1);
                            i24 = ~iCombineMeasuredStates;
                            i25 = ~i;
                            int i14112 = ~(i1317 | i25);
                            i26 = (i14111 - (~(-(-(((i14112 & i24) | (i24 ^ i14112)) * (-983)))))) - 1;
                            int i14113 = ~iCombineMeasuredStates;
                            i27 = ~((i14113 & i25) | (i14113 ^ i25));
                            i28 = TuitionPaymentFragmentbindingInflater1 + 33;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i28 % 128;
                            if (i28 % 2 != 0) {
                                int i14114 = ~((i24 & i22) | (i24 ^ i22));
                                int i14115 = i26 % (983 % ((i27 & i14114) | (i27 ^ i14114)));
                                i29 = -(ViewConfiguration.getKeyRepeatDelay() / 62);
                                i31 = 108;
                                i30 = i14115;
                            } else {
                                int i14116 = ~((i24 & i22) | (i24 ^ i22));
                                int i14117 = ((i27 & i14116) | (i27 ^ i14116)) * 983;
                                int i14118 = ((i26 | i14117) << 1) - (i14117 ^ i26);
                                i29 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                                i30 = i14118;
                                i31 = 9;
                            }
                            int i14119 = i29 * 881;
                            int i15110 = i31 * 881;
                            i32 = (i14119 ^ i15110) + ((i14119 & i15110) << 1);
                            i33 = ~i29;
                            i34 = ~i31;
                            i35 = ~(i33 | i34);
                            int i15111 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            i36 = ((i15111 | 103) << 1) - (i15111 ^ 103);
                            int i15112 = i36 % 128;
                            TuitionPaymentFragmentbindingInflater1 = i15112;
                            if (i36 % 2 == 0) {
                                int i15113 = (~((i33 & i) | (i33 ^ i))) | i35;
                                int i15114 = ~((i34 & i) | (i34 ^ i));
                                i37 = i32 >>> (((i15113 & i15114) | (i15113 ^ i15114)) * (-880));
                                i33 = ~i29;
                            } else {
                                int i15115 = ~(i33 | i);
                                i37 = (i32 - (~(-(-((((i15115 & i35) | (i35 ^ i15115)) | (~((~i31) | i))) * (-880)))))) - 1;
                            }
                            i38 = i15112 + 15;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i38 % 128;
                            if (i38 % 2 != 0) {
                                int i15116 = ~i;
                                int i15117 = ~((i33 & i15116) | (i33 ^ i15116));
                                int i15118 = (i31 & i15117) | (i31 ^ i15117);
                                int i15119 = ~((i29 & i) | (i29 ^ i));
                                int i16110 = -((i15118 & i15119) | (i15118 ^ i15119));
                                i39 = (i37 >> (((-880) ^ i16110) + ((i16110 & (-880)) << 1))) * (879 - (~(-i15119)));
                                cArr = new char[]{'\t', '\t', 3, 4, 14, 7, 65488, 20, 5, 65489, 7, 22, 5, 65489, 11, 16, 11, 22, 65489, 14, 14, '\r', 6, 65487, 6, 7, 4, 23};
                            } else {
                                int i16111 = ~((i33 & i25) | (i33 ^ i25));
                                int i16112 = (i31 & i16111) | (i31 ^ i16111);
                                int i16113 = ~((i29 & i) | (i29 ^ i));
                                int i16114 = -(-((-880) * ((i16112 & i16113) | (i16112 ^ i16113))));
                                int i16115 = ((i37 | i16114) << 1) - (i16114 ^ i37);
                                int i16116 = i16113 * 880;
                                i39 = (i16115 ^ i16116) + ((i16116 & i16115) << 1);
                                cArr = new char[]{'\t', '\t', 3, 4, 14, 7, 65488, 20, 5, 65489, 7, 22, 5, 65489, 11, 16, 11, 22, 65489, 14, 14, '\r', 6, 65487, 6, 7, 4, 23};
                            }
                            char[] cArr4 = cArr;
                            Object[] objArr116 = new Object[1];
                            a(false, i23, i30, i39, cArr4, objArr116);
                            try {
                                Object[] objArr117 = {(String) objArr116[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    char maximumFlingVelocity3 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                    int i16117 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 993;
                                    int i16118 = 9 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                    byte b7 = $$a[7];
                                    short s8 = b7;
                                    Object[] objArr118 = new Object[1];
                                    c(s8, (byte) (s8 | 52), b7, objArr118);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumFlingVelocity3, i16117, i16118, 410748506, false, (String) objArr118[0], new Class[]{String.class});
                                }
                                long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr117)).longValue();
                                long j17 = 351496629;
                                long j18 = 130;
                                long j19 = -1;
                                long j110 = jLongValue3 ^ j19;
                                long j111 = i;
                                long j112 = (((long) (-129)) * j17) + (((long) 131) * jLongValue3) + ((((j110 | (j111 ^ j19)) | j17) ^ j19) * j18);
                                long j113 = j110 | j17;
                                long j114 = j112 + (((long) (-260)) * (j113 ^ j19)) + (j18 * ((((j17 ^ j19) | jLongValue3) ^ j19) | ((j113 | j111) ^ j19))) + ((long) (-552414866));
                                int i16119 = (int) (j114 >> 32);
                                int i17110 = ~((~new Random().nextInt(1238555631)) | 2086350550);
                                int i17111 = i16119 & (((605030402 | i17110) * (-374)) + 122375902 + ((i17110 | 1481320148) * 374));
                                int i17112 = ~new Random().nextInt();
                                int i17113 = ((int) j114) & ((((-804379758) + (((~(257934584 | i17112)) | 1179291825) * (-933))) + (((~(i17112 | 1179291825)) | 152388680) * 933)) - 309919376);
                                i8 = (i17111 & i17113) | (i17111 ^ i17113);
                                i7 = i;
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 != null) {
                                    throw cause2;
                                }
                                throw th2;
                            }
                        } else {
                            int i17114 = -(KeyEvent.getMaxKeyCode() >> 16);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i17115 = (i17114 * (-830)) + 161408;
                            int i17116 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (-195));
                            int i17117 = TuitionPaymentFragmentbindingInflater1;
                            int i17118 = ((i17117 | 1) << 1) - (i17117 ^ 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17118 % 128;
                            int i17119 = i17118 % 2;
                            int i18110 = (i17114 ^ 194) | (i17114 & 194);
                            int i18111 = (-831) * (i17116 | (~((i18110 & iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (i18110 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8))));
                            int i18112 = (i17115 & i18111) + (i17115 | i18111);
                            int i18113 = ((-195) ^ i17114) | ((-195) & i17114);
                            int i18114 = -(-((~((i18113 & iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (i18113 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8))) * (-1662)));
                            int i18115 = (i18112 ^ i18114) + ((i18114 & i18112) << 1);
                            int i18116 = ~((~i17114) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                            int i18117 = ~((i17114 & iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (i17114 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                            int i18118 = (i17117 & 47) + (i17117 | 47);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18118 % 128;
                            int i18119 = i18118 % 2;
                            int i19110 = (i18117 & i18116) | (i18116 ^ i18117);
                            int i19111 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault8 & 194) | (194 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                            int i19112 = -(-(831 * ((i19110 & i19111) | (i19110 ^ i19111))));
                            int i19113 = ((i19112 & i18115) << 1) + (i18115 ^ i19112);
                            int i19114 = -(-(ViewConfiguration.getPressedStateDuration() >> 16));
                            int i19115 = ((i19114 | 1) << 1) - (i19114 ^ 1);
                            int i19116 = -TextUtils.getCapsMode("", 0, 0);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i19117 = TuitionPaymentFragmentbindingInflater1;
                            int i19118 = (i19117 & 107) + (i19117 | 107);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19118 % 128;
                            int i19119 = i19118 % 2;
                            int i20110 = (i19116 * 595) - 1187;
                            int i20111 = ~i19116;
                            int i20112 = ~((i20111 & 1) | (i20111 ^ 1));
                            int i20113 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                            int i20114 = ~(i20113 | 1);
                            int i20115 = ((i20112 & i20114) | (i20112 ^ i20114)) * (-1188);
                            int i20116 = ((i20110 | i20115) << 1) - (i20110 ^ i20115);
                            int i20117 = ~i19116;
                            int i20118 = (~((i20117 & 1) | (i20117 ^ 1))) | (~(((-2) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9) | ((-2) & iTuitionPaymentFragmentspecialinlinedviewModeldefault9)));
                            int i20119 = ~(i20113 | i19116);
                            int i21110 = -(-(((i20118 & i20119) | (i20118 ^ i20119)) * 594));
                            int i21111 = ((i20116 | i21110) << 1) - (i21110 ^ i20116);
                            int i21112 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                            int i21113 = ~(((-2) ^ i21112) | ((-2) & i21112));
                            int i21114 = ~(((-2) & i19116) | ((-2) ^ i19116));
                            int i21115 = (i21113 & i21114) | (i21113 ^ i21114);
                            int i21116 = ~(i19116 | i21112);
                            int i21117 = -(-(((i21116 & i21115) | (i21115 ^ i21116)) * 594));
                            Object[] objArr119 = new Object[1];
                            a(false, i19113, i19115, (i21111 & i21117) + (i21117 | i21111), new char[]{0}, objArr119);
                            str = (String) objArr119[0];
                            i15 = 243 - (~Color.argb(0, 0, 0, 0));
                            i16 = 14 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                            i17 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                            i7 = i;
                            int i21118 = ~i7;
                            int i21119 = ~(((-6) ^ i21118) | ((-6) & i21118));
                            int i22112 = ~(((-6) & i17) | ((-6) ^ i17));
                            i18 = ((i17 * 50) - 485) + (((i22112 & i21119) | (i21119 ^ i22112)) * 98);
                            int i22113 = ~i17;
                            int i22114 = ~((i21118 & i22113) | (i22113 ^ i21118));
                            i19 = (i22114 & (-6)) | ((-6) ^ i22114);
                            int i22115 = TuitionPaymentFragmentbindingInflater1;
                            i20 = (i22115 & 43) + (i22115 | 43);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20 % 128;
                            try {
                                if (i20 % 2 != 0) {
                                    Object[] objArr1110 = new Object[1];
                                    a(true, i15, i16, (i18 >> (((~((i17 ^ i7) | (i17 & i7))) | i19) - 49)) >>> (49 >> ((~((i17 & 5) | (i17 ^ 5))) | (~(((-6) ^ i7) | ((-6) & i7))))), new char[]{2, 1, 65483, '\f', 15, 2, '\t', 65535, 65534, 4, 4, 18, 65535}, objArr1110);
                                    try {
                                        objArr2 = new Object[]{(String) objArr1110[0]};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char c5 = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33602);
                                            int i22116 = 3086 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                            int iArgb3 = Color.argb(0, 0, 0, 0) + 26;
                                            byte b8 = $$a[7];
                                            short s9 = b8;
                                            Object[] objArr1111 = new Object[1];
                                            c(s9, (byte) (s9 | 52), b8, objArr1111);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c5, i22116, iArgb3, 1411172903, false, (String) objArr1111[0], new Class[]{String.class});
                                        }
                                        if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr2))) {
                                            int i22117 = TuitionPaymentFragmentbindingInflater1 + 125;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i22117 % 128;
                                            int i22118 = i22117 % 2;
                                            i8 = 1;
                                        } else {
                                            i8 = 0;
                                        }
                                    } catch (Throwable th3) {
                                        Throwable cause3 = th3.getCause();
                                        if (cause3 != null) {
                                            throw cause3;
                                        }
                                        throw th3;
                                    }
                                } else {
                                    int i22119 = -(-((i19 | (~((i17 ^ i7) | (i17 & i7)))) * (-49)));
                                    int i2222 = (i18 ^ i22119) + ((i18 & i22119) << 1);
                                    int i2223 = ~(((-6) ^ i7) | ((-6) & i7));
                                    int i23110 = ~(i17 | 5);
                                    int i23111 = ((i23110 & i2223) | (i2223 ^ i23110)) * 49;
                                    Object[] objArr1112 = new Object[1];
                                    a(true, i15, i16, (i2222 ^ i23111) + ((i23111 & i2222) << 1), new char[]{2, 1, 65483, '\f', 15, 2, '\t', 65535, 65534, 4, 4, 18, 65535}, objArr1112);
                                    try {
                                        objArr = new Object[]{(String) objArr1112[0]};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            char cAlpha3 = (char) (33602 - Color.alpha(0));
                                            int packedPositionType3 = 3085 - ExpandableListView.getPackedPositionType(0L);
                                            int offsetAfter3 = 26 - TextUtils.getOffsetAfter("", 0);
                                            byte b9 = $$a[7];
                                            short s10 = b9;
                                            Object[] objArr1113 = new Object[1];
                                            c(s10, (byte) (s10 | 52), b9, objArr1113);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAlpha3, packedPositionType3, offsetAfter3, 1411172903, false, (String) objArr1113[0], new Class[]{String.class});
                                        }
                                        if (!(!str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr)))) {
                                            int i221110 = TuitionPaymentFragmentbindingInflater1 + 125;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i221110 % 128;
                                            int i221111 = i221110 % 2;
                                            i8 = 1;
                                        } else {
                                            i8 = 0;
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
                        }
                    } catch (Exception unused2) {
                        i7 = i;
                        i8 = 0;
                    }
                } catch (Exception unused3) {
                    i7 = i;
                }
                i9 = (~(i7 & 10)) & (i7 | 10);
                int i23112 = -i8;
                i10 = ((i8 & i23112) | (i8 ^ i23112)) >> 31;
                int i23113 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                i11 = ((i23113 | 115) << 1) - (i23113 ^ 115);
                int i23114 = i11 % 128;
                TuitionPaymentFragmentbindingInflater1 = i23114;
                if (i11 % 2 == 0) {
                    int i23115 = (~i10) & i7;
                    int i23116 = i10 & i9;
                    i12 = (i23116 & i23115) | (i23115 ^ i23116);
                    int i23117 = 15 / 0;
                } else {
                    int i23118 = (~i10) & i7;
                    int i23119 = i10 & i9;
                    i12 = (i23119 & i23118) | (i23118 ^ i23119);
                }
                int i2410 = i2 & 32;
                int i2411 = -i2410;
                i13 = ((i2410 & i2411) | (i2410 ^ i2411)) >> 31;
                i14 = (i23114 ^ 63) + ((i23114 & 63) << 1);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
                if (i14 % 2 != 0) {
                    throw null;
                }
                int i2412 = i12 & (~i13);
                int i2413 = i13 & i7;
                i6 = (i2412 & i2413) | (i2412 ^ i2413);
            }
            int i250 = (~(i7 & i4)) & (i7 | i4);
            int i251 = -i250;
            int i252 = ((i250 & i251) | (i250 ^ i251)) >> 31;
            int i253 = i6 & (~i252);
            int i254 = i252 & i4;
            int i255 = (i253 & i254) | (i253 ^ i254);
            int i256 = (~(i7 & i255)) & (i7 | i255);
            int i257 = -i256;
            int i258 = (((i256 & i257) | (i256 ^ i257)) >> 31) & 16;
            Object[] objArr20 = {new int[]{i7}, new int[1], new int[]{i255}, null};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i259 = ~((-40443911) | elapsedCpuTime);
            int i260 = ~elapsedCpuTime;
            int i261 = 106750182 + ((i259 | (~(309297015 | i260))) * 497) + (((~(elapsedCpuTime | 309297015)) | (~((-309163335) | i260)) | 268719424) * 497);
            int i262 = i258 * 398;
            int i263 = i261 * (-396);
            int i264 = (i262 ^ i263) + ((i262 & i263) << 1);
            int i265 = ~i258;
            int i266 = ~i7;
            int i267 = ~(i265 | i266);
            int i268 = ~i258;
            int i269 = ~((i268 & i261) | (i268 ^ i261));
            int i270 = (i267 & i269) | (i267 ^ i269);
            int i271 = ~((i266 & i261) | (i266 ^ i261));
            int i272 = -(-(((i271 & i270) | (i270 ^ i271)) * (-397)));
            int i273 = ~(i265 | i261);
            int i274 = ((((i264 | i272) << 1) - (i272 ^ i264)) - (~(i273 * (-397)))) - 1;
            int i275 = (i273 & i7) | (i7 ^ i273);
            int i276 = ~i261;
            int i277 = ~((i258 & i276) | (i276 ^ i258));
            int i278 = ((i275 & i277) | (i275 ^ i277)) * 397;
            int i279 = i3 + (i274 & i278) + (i278 | i274);
            int i280 = i279 << 13;
            int i281 = (i279 | i280) & (~(i279 & i280));
            int i282 = i281 ^ (i281 >>> 17);
            int i283 = i282 << 5;
            ((int[]) objArr20[1])[0] = ((~i282) & i283) | ((~i283) & i282);
            return objArr20;
        } catch (Throwable th5) {
            Throwable cause5 = th5.getCause();
            if (cause5 != null) {
                throw cause5;
            }
            throw th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(short r7, short r8, int r9) {
        /*
            byte[] r0 = defpackage.tryOpenCamera.$$c
            int r7 = r7 * 3
            int r7 = r7 + 4
            int r9 = r9 * 2
            int r9 = 1 - r9
            int r8 = r8 + 119
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r8 = r7
            r3 = r9
            r5 = r2
            goto L29
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L29:
            int r7 = r7 + r3
            int r8 = r8 + 1
            r3 = r5
            r6 = r8
            r8 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tryOpenCamera.$$e(short, short, int):java.lang.String");
    }
}
