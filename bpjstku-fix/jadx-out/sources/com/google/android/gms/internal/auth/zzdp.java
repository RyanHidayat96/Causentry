package com.google.android.gms.internal.auth;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.google.android.gms.internal.auth.zzdp;
import com.google.android.gms.internal.auth.zzdq;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzdp<MessageType extends zzdq<MessageType, BuilderType>, BuilderType extends zzdp<MessageType, BuilderType>> implements zzfw {
    private static final byte[] $$c = {70, -114, 113, 8};
    private static final int $$f = 176;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {104, 27, -72, 120, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$e = 255;
    private static final byte[] $$a = {123, -2, -101, -104, 15, -8, 16, -1, -4, -3, -52, 55, 14, 1, 8, -13, 11, 8, -68, 68, -1, -61, 36, 19, 4, 10, -8, 8, 0, -22, 22, 15, -11, 8, 0, 15, 0, 17, -34, 19, 4, 10, -8, 8, 0, -26, 39, -6, 11};
    private static final int $$b = 190;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int b = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {59750, 59883, 59881, 59886, 59880, 59867, 59839, 59843, 59881, 59856, 59860, 59883, 59863, 59881, 59852, 59850, 59882, 59861, 59862, 59855, 59829, 59881, 59881, 59863, 59697, 59748, 59751, 59750, 59750, 59750, 59770, 59763, 59768, 59751, 59769, 59757, 59724, 59783, 59783, 59776, 59781, 59784, 59753, 59773, 59803, 59778, 59782, 59781, 59777, 59803, 59774, 59748, 59780, 59783, 59776, 59769, 59751, 59803, 59803, 59777, 59800, 59803, 59714, 59792, 59798, 59799, 59795, 59790, 59781, 59799, 59698, 59768, 59775, 59751, 59728, 59752, 59751, 59757, 59757, 59745, 59775, 59757, 59754, 59713, 59803, 59789, 59779, 59778, 59785, 59779, 59765, 59775, 59790, 59790, 59784, 59790, 59779, 59779, 59788, 59764};

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 32
            int r6 = r6 + 4
            int r7 = r7 * 6
            int r7 = 103 - r7
            byte[] r0 = com.google.android.gms.internal.auth.zzdp.$$a
            int r8 = r8 * 19
            int r1 = 33 - r8
            byte[] r1 = new byte[r1]
            int r8 = 32 - r8
            r2 = 0
            if (r0 != 0) goto L19
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2f
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2f:
            int r3 = r3 + r6
            int r6 = r3 + (-2)
            int r7 = r7 + 1
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzdp.a(int, short, byte, java.lang.Object[]):void");
    }

    private static void c(short s, int i, short s2, Object[] objArr) {
        byte[] bArr = $$d;
        int i2 = s + 84;
        int i3 = s2 * 52;
        int i4 = 56 - (i * 52);
        byte[] bArr2 = new byte[53 - i3];
        int i5 = 52 - i3;
        int i6 = -1;
        if (bArr == null) {
            i2 = (i5 + i4) - 11;
            i4++;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i2;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i8 = i4;
            i2 = (i2 + bArr[i4]) - 11;
            i4 = i8 + 1;
            i6 = i7;
        }
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        int i = 2 % 2;
        int i2 = b + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        zzdp zzdpVarZza = zza();
        if (i3 != 0) {
            int i4 = 88 / 0;
        }
        return zzdpVarZza;
    }

    public abstract zzdp zza();

    /* JADX WARN: Code duplicated, block: B:69:0x0279  */
    /* JADX WARN: Code duplicated, block: B:72:0x0295  */
    /* JADX WARN: Code duplicated, block: B:96:0x0285 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0285 -> B:64:0x026d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int[] r23, boolean r24, byte[] r25, java.lang.Object[] r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzdp.d(int[], boolean, byte[], java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0750 A[PHI: r0 r1
  0x0750: PHI (r0v14 int) = (r0v13 int), (r0v23 int) binds: [B:112:0x074e, B:109:0x0745] A[DONT_GENERATE, DONT_INLINE]
  0x0750: PHI (r1v17 int) = (r1v16 int), (r1v25 int) binds: [B:112:0x074e, B:109:0x0745] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:115:0x075a  */
    /* JADX WARN: Code duplicated, block: B:117:0x075f A[PHI: r0 r1
  0x075f: PHI (r0v22 int) = (r0v13 int), (r0v23 int) binds: [B:112:0x074e, B:109:0x0745] A[DONT_GENERATE, DONT_INLINE]
  0x075f: PHI (r1v24 int) = (r1v16 int), (r1v25 int) binds: [B:112:0x074e, B:109:0x0745] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x053e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0550  */
    public static int TuitionPaymentFragmentbindingInflater1(List list) throws Throwable {
        Class<?> cls;
        Object obj;
        Class<?>[] clsArr;
        Class<?> cls2;
        char c;
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        String str;
        Method method;
        Method[] declaredMethods;
        int length;
        int i6;
        Object[] objArr;
        int[] iArr;
        byte[] bArr;
        boolean z2;
        int i7;
        char c2;
        Long l;
        int i8 = 2 % 2;
        Method[] methodArr = new Method[2];
        byte[] bArr2 = $$a;
        byte b2 = bArr2[28];
        Object[] objArr2 = new Object[1];
        a(b2, bArr2[13], b2, objArr2);
        Class<?> cls3 = Class.forName((String) objArr2[0]);
        byte b3 = bArr2[13];
        Object[] objArr3 = new Object[1];
        a(b3, bArr2[28], b3, objArr3);
        String str2 = (String) objArr3[0];
        Class<?>[] clsArr2 = new Class[2];
        clsArr2[0] = String.class;
        Class<?> cls4 = Integer.TYPE;
        int i9 = b + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
        if (i9 % 2 != 0) {
            clsArr2[1] = cls4;
            methodArr[0] = cls3.getMethod(str2, clsArr2);
            cls = Class.forName("android.app.ApplicationPackageManager");
            byte b4 = bArr2[13];
            Object[] objArr4 = new Object[1];
            a(b4, bArr2[28], b4, objArr4);
            obj = objArr4[0];
        } else {
            clsArr2[1] = cls4;
            methodArr[0] = cls3.getMethod(str2, clsArr2);
            cls = Class.forName("android.app.ApplicationPackageManager");
            byte b5 = bArr2[13];
            Object[] objArr5 = new Object[1];
            a(b5, bArr2[28], b5, objArr5);
            obj = objArr5[0];
        }
        String str3 = (String) obj;
        int i10 = b;
        int i11 = (i10 & 11) + (i10 | 11);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
        if (i11 % 2 != 0) {
            clsArr = new Class[5];
            clsArr[1] = String.class;
            cls2 = Integer.TYPE;
            c = 0;
        } else {
            clsArr = new Class[2];
            clsArr[0] = String.class;
            cls2 = Integer.TYPE;
            c = 1;
        }
        int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i13 = (i12 ^ 35) + ((i12 & 35) << 1);
        b = i13 % 128;
        int i14 = i13 % 2;
        clsArr[c] = cls2;
        methodArr[1] = cls.getMethod(str3, clsArr);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        int i15 = 8;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
            int bitsPerPixel = 2822 - ImageFormat.getBitsPerPixel(0);
            int iKeyCodeFromString = 22 - KeyEvent.keyCodeFromString("");
            byte[] bArr3 = $$d;
            byte b6 = bArr3[7];
            Object[] objArr6 = new Object[1];
            c(b6, (byte) (-bArr3[5]), b6, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(touchSlop, bitsPerPixel, iKeyCodeFromString, 1814927978, false, (String) objArr6[0], null);
        }
        Object obj2 = null;
        try {
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) == null) {
                int i16 = b + 121;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i16 % 128;
                int i17 = 24;
                if (i16 % 2 != 0) {
                    declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 2823 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 22 - (ViewConfiguration.getKeyRepeatTimeout() >> 16))).getDeclaredMethods();
                    length = declaredMethods.length;
                    i6 = 1;
                } else {
                    declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getEdgeSlop() >> 16) + 2823, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 22)).getDeclaredMethods();
                    length = declaredMethods.length;
                    i6 = 0;
                }
                while (i6 < length) {
                    int i18 = b;
                    int i19 = (i18 ^ 9) + ((i18 & 9) << 1);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i19 % 128;
                    if (i19 % 2 != 0) {
                        Method method2 = declaredMethods[i6];
                        obj2.hashCode();
                        throw null;
                    }
                    Method method3 = declaredMethods[i6];
                    try {
                        byte[] bArr4 = new byte[i17];
                        // fill-array-data instruction
                        bArr4[0] = 1;
                        bArr4[1] = 1;
                        bArr4[2] = 1;
                        bArr4[3] = 0;
                        bArr4[4] = 1;
                        bArr4[5] = 0;
                        bArr4[6] = 1;
                        bArr4[7] = 0;
                        bArr4[8] = 1;
                        bArr4[9] = 0;
                        bArr4[10] = 1;
                        bArr4[11] = 0;
                        bArr4[12] = 1;
                        bArr4[13] = 1;
                        bArr4[14] = 0;
                        bArr4[15] = 1;
                        bArr4[16] = 1;
                        bArr4[17] = 1;
                        bArr4[18] = 1;
                        bArr4[19] = 0;
                        bArr4[20] = 1;
                        bArr4[21] = 1;
                        bArr4[22] = 1;
                        bArr4[23] = 1;
                        Object[] objArr7 = new Object[1];
                        d(new int[]{0, i17, 119, 0}, true, bArr4, objArr7);
                        Class<?> cls5 = Class.forName((String) objArr7[0]);
                        Object[] objArr8 = new Object[1];
                        d(new int[]{i17, 12, 6, i15}, false, new byte[]{1, 1, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1}, objArr8);
                        int iIntValue = ((Integer) cls5.getMethod((String) objArr8[0], null).invoke(method3, null)).intValue();
                        int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i21 = ((i20 | 67) << 1) - (i20 ^ 67);
                        b = i21 % 128;
                        if (i21 % 2 == 0) {
                            objArr = new Object[0];
                            objArr[0] = Integer.valueOf(iIntValue);
                            iArr = new int[]{36, 26, 37, i17};
                            bArr = new byte[]{0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1};
                            z2 = false;
                        } else {
                            objArr = new Object[]{Integer.valueOf(iIntValue)};
                            iArr = new int[]{36, 26, 37, i17};
                            bArr = new byte[]{0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1};
                            z2 = true;
                        }
                        Object[] objArr9 = new Object[1];
                        d(iArr, z2, bArr, objArr9);
                        Class<?> cls6 = Class.forName((String) objArr9[0]);
                        byte[] bArr5 = new byte[i15];
                        // fill-array-data instruction
                        bArr5[0] = 1;
                        bArr5[1] = 1;
                        bArr5[2] = 1;
                        bArr5[3] = 1;
                        bArr5[4] = 1;
                        bArr5[5] = 1;
                        bArr5[6] = 1;
                        bArr5[7] = 0;
                        Object[] objArr10 = new Object[1];
                        d(new int[]{62, i15, 46, 0}, true, bArr5, objArr10);
                        Boolean bool = (Boolean) cls6.getMethod((String) objArr10[0], Integer.TYPE).invoke(null, objArr);
                        int i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i23 = (i22 ^ 93) + ((i22 & 93) << 1);
                        b = i23 % 128;
                        int i24 = i23 % 2;
                        if (bool.booleanValue()) {
                            int i25 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
                            b = i25 % 128;
                            int i26 = i25 % 2;
                            Class cls7 = Long.TYPE;
                            Object[] objArr11 = new Object[1];
                            d(new int[]{0, 24, 119, 0}, true, new byte[]{1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr11);
                            Class<?> cls8 = Class.forName((String) objArr11[0]);
                            Object[] objArr12 = new Object[1];
                            d(new int[]{70, 13, 0, i15}, true, new byte[]{0, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 0}, objArr12);
                            String str4 = (String) objArr12[0];
                            int i27 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i28 = (i27 ^ 125) + ((i27 & 125) << 1);
                            b = i28 % 128;
                            if (i28 % 2 == 0) {
                                cls7.equals(cls8.getMethod(str4, null).invoke(method3, null));
                                obj2.hashCode();
                                throw null;
                            }
                            if (cls7.equals(cls8.getMethod(str4, null).invoke(method3, null))) {
                                Object[] objArr13 = new Object[1];
                                d(new int[]{0, 24, 119, 0}, true, new byte[]{1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr13);
                                Class<?> cls9 = Class.forName((String) objArr13[0]);
                                int i29 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                int i30 = (i29 ^ 59) + ((i29 & 59) << 1);
                                b = i30 % 128;
                                int i31 = i30 % 2;
                                c2 = 28;
                                Object[] objArr14 = new Object[1];
                                d(new int[]{83, 17, 28, 4}, false, new byte[]{1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0}, objArr14);
                                Object[] objArr15 = (Object[]) cls9.getMethod((String) objArr14[0], null).invoke(method3, null);
                                if (objArr15.length == 2) {
                                    int i32 = b + 33;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i32 % 128;
                                    if (i32 % 2 == 0 ? !Long.TYPE.equals(objArr15[0]) : !Long.TYPE.equals(objArr15[1])) {
                                        i7 = 24;
                                    } else {
                                        i7 = 24;
                                        Object[] objArr16 = new Object[1];
                                        d(new int[]{0, 24, 119, 0}, true, new byte[]{1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr16);
                                        if (Class.forName((String) objArr16[0]).equals(objArr15[1])) {
                                            int i33 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                            int i34 = ((i33 | 11) << 1) - (i33 ^ 11);
                                            b = i34 % 128;
                                            if (i34 % 2 == 0) {
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                    char c3 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
                                                    int gidForName = Process.getGidForName("") + 2824;
                                                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 22;
                                                    byte[] bArr6 = $$d;
                                                    byte b7 = bArr6[7];
                                                    Object[] objArr17 = new Object[1];
                                                    c(b7, (byte) (-bArr6[5]), b7, objArr17);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c3, gidForName, maximumFlingVelocity, 1814927978, false, (String) objArr17[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method3);
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    char c4 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                    int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2823;
                                                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 22;
                                                    byte[] bArr7 = $$d;
                                                    byte b8 = bArr7[7];
                                                    Object[] objArr18 = new Object[1];
                                                    c(b8, (byte) (-bArr7[5]), b8, objArr18);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c4, doubleTapTimeout, jumpTapTimeout, 1814927978, false, (String) objArr18[0], null);
                                                }
                                                Object[] objArr19 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                    char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                                                    int i35 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2823;
                                                    int iRed = 22 - Color.red(0);
                                                    byte[] bArr8 = $$d;
                                                    Object[] objArr20 = new Object[1];
                                                    c(bArr8[54], bArr8[7], (byte) (-bArr8[5]), objArr20);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionGroup, i35, iRed, -2137287382, false, (String) objArr20[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                l = (Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr19);
                                            } else {
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                                    char c5 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                    int iIndexOf = 2822 - TextUtils.indexOf((CharSequence) "", '0', 0);
                                                    int gidForName2 = Process.getGidForName("") + 23;
                                                    byte[] bArr9 = $$d;
                                                    byte b9 = bArr9[7];
                                                    Object[] objArr21 = new Object[1];
                                                    c(b9, (byte) (-bArr9[5]), b9, objArr21);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c5, iIndexOf, gidForName2, 1814927978, false, (String) objArr21[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, method3);
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                                    char c6 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                                                    int size = 2823 - View.MeasureSpec.getSize(0);
                                                    int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 22;
                                                    byte[] bArr10 = $$d;
                                                    byte b10 = bArr10[7];
                                                    Object[] objArr22 = new Object[1];
                                                    c(b10, (byte) (-bArr10[5]), b10, objArr22);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c6, size, iCombineMeasuredStates, 1814927978, false, (String) objArr22[0], null);
                                                }
                                                Object[] objArr23 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null)};
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                                    char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                                                    int iCombineMeasuredStates2 = 2823 - View.combineMeasuredStates(0, 0);
                                                    int i36 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 21;
                                                    byte[] bArr11 = $$d;
                                                    Object[] objArr24 = new Object[1];
                                                    c(bArr11[54], bArr11[7], (byte) (-bArr11[5]), objArr24);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf, iCombineMeasuredStates2, i36, -2137287382, false, (String) objArr24[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                l = (Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr23);
                                            }
                                            l.longValue();
                                            int i37 = b;
                                            int i38 = (i37 ^ 5) + ((i37 & 5) << 1);
                                            int i39 = i38 % 128;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i39;
                                            int i40 = i38 % 2;
                                            int i41 = ((i39 | 117) << 1) - (i39 ^ 117);
                                            b = i41 % 128;
                                            int i42 = i41 % 2;
                                            break;
                                        }
                                    }
                                } else {
                                    i7 = 24;
                                }
                            } else {
                                i7 = 24;
                                c2 = 28;
                            }
                        } else {
                            i7 = 24;
                            c2 = 28;
                        }
                        i6 = (i6 & 1) + (i6 | 1);
                        int i43 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i44 = (i43 & 125) + (i43 | 125);
                        b = i44 % 128;
                        int i45 = i44 % 2;
                        i15 = 8;
                        i17 = i7;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                int iKeyCodeFromString2 = 2823 - KeyEvent.keyCodeFromString("");
                int iIndexOf2 = 22 - TextUtils.indexOf("", "");
                byte[] bArr12 = $$d;
                byte b11 = bArr12[7];
                Object[] objArr25 = new Object[1];
                c(b11, (byte) (-bArr12[5]), b11, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(keyRepeatDelay, iKeyCodeFromString2, iIndexOf2, 1814927978, false, (String) objArr25[0], null);
            }
            Object[] objArr26 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char packedPositionGroup2 = (char) ExpandableListView.getPackedPositionGroup(0L);
                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 2823;
                int capsMode = TextUtils.getCapsMode("", 0, 0) + 22;
                byte b12 = (byte) ($$e & 14);
                byte[] bArr13 = $$d;
                Object[] objArr27 = new Object[1];
                c(b12, bArr13[7], (byte) (-bArr13[5]), objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(packedPositionGroup2, offsetAfter, capsMode, 1025296417, false, (String) objArr27[0], new Class[]{Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr26);
            Object[] objArr28 = {0, methodArr, null};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cBlue = (char) (Color.blue(0) + 37657);
                int iMyTid = (Process.myTid() >> 22) + 2720;
                int i46 = 19 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                byte b13 = (byte) ($$e & 14);
                byte[] bArr14 = $$d;
                Object[] objArr29 = new Object[1];
                c(b13, bArr14[7], (byte) (-bArr14[5]), objArr29);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cBlue, iMyTid, i46, -1568796068, false, (String) objArr29[0], new Class[]{Integer.TYPE, Method[].class, List.class});
            }
            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr28)).longValue();
            long j = -145136920;
            long j2 = -1;
            long j3 = j ^ j2;
            long jElapsedRealtime = (int) SystemClock.elapsedRealtime();
            long j4 = jElapsedRealtime ^ j2;
            long j5 = (((long) (-563)) * j) + (((long) 565) * jLongValue) + (((long) (-564)) * (j3 | (((jLongValue ^ j2) | j4) ^ j2) | ((jLongValue | jElapsedRealtime) ^ j2))) + (((long) 1128) * (((j3 | jLongValue) | jElapsedRealtime) ^ j2)) + (((long) 564) * ((j2 ^ (jLongValue | j)) | ((j3 | j4) ^ j2))) + ((long) (-1665268925));
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i47 = ~elapsedCpuTime;
            int i48 = ((int) (j5 >> 32)) & ((-581549398) + (((~(829838469 | i47)) | 67109152) * 184) + ((elapsedCpuTime | 289559680) * (-184)) + ((~((-607387942) | i47)) * 184));
            int iNextInt = new Random().nextInt();
            int i49 = ~iNextInt;
            int i50 = ((int) j5) & (1004395697 + ((iNextInt | 18972836) * 988) + (((~((-843609348) | i49)) | 268965121) * (-1976)) + (((~(iNextInt | 593617062)) | 18972836 | (~((-593617063) | i49))) * 988));
            int i51 = (i48 & i50) | (i48 ^ i50);
            int i52 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 117;
            int i53 = i52 % 128;
            b = i53;
            if (i52 % 2 == 0) {
                i = i51 - 24;
                i2 = i51 & ViewCompat.MEASURED_SIZE_MASK;
                if (i != 0) {
                    i3 = i53 + 11;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i54 = 3 % 4;
                    }
                    z = true;
                } else {
                    z = false;
                }
            } else {
                i = i51 >>> 24;
                i2 = i51 & ViewCompat.MEASURED_SIZE_MASK;
                if (i != 0) {
                    i3 = i53 + 11;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i55 = 3 % 4;
                    }
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                int i56 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i57 = (i56 ^ 47) + ((i56 & 47) << 1);
                b = i57 % 128;
                i4 = 2;
                int i58 = i57 % 2;
                i5 = 1;
            } else {
                i4 = 2;
                i5 = 0;
            }
            if (!z || i2 >= i4 || (method = methodArr[i2]) == null) {
                str = null;
            } else {
                int i59 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i60 = (i59 & 13) + (i59 | 13);
                b = i60 % 128;
                int i61 = i60 % i4;
                String string = method.toString();
                if (i61 == 0) {
                    int i62 = 48 / 0;
                }
                str = string;
            }
            list.add(str);
            int i63 = ((i & 6) + (i | 6)) * i5;
            int i64 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i65 = ((i64 | 27) << 1) - (i64 ^ 27);
            b = i65 % 128;
            int i66 = i65 % 2;
            return i63;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, int r7, int r8) {
        /*
            int r6 = r6 * 2
            int r6 = 3 - r6
            int r7 = r7 * 3
            int r0 = r7 + 1
            int r8 = r8 + 99
            byte[] r1 = com.google.android.gms.internal.auth.zzdp.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r8 = r6
            r4 = r7
            r3 = r2
            goto L2a
        L15:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r8 = r8 + 1
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L26:
            int r3 = r3 + 1
            r4 = r1[r8]
        L2a:
            int r4 = -r4
            int r6 = r6 + r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzdp.$$g(int, int, int):java.lang.String");
    }
}
