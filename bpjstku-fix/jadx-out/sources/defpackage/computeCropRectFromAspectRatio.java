package defpackage;

import androidx.core.view.PointerIconCompat;
import java.lang.reflect.Array;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class computeCropRectFromAspectRatio {
    private static final int TuitionPaymentFragmentbindingInflater1 = 152;
    private static final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r0 = r6 + 2
            int r7 = 332 - r7
            byte[] r1 = defpackage.computeCropRectFromAspectRatio.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r8 = 116 - r8
            byte[] r0 = new byte[r0]
            int r6 = r6 + 1
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2d
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            java.lang.String r6 = r6.intern()
            r9[r2] = r6
            return
        L27:
            r3 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L2d:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-1)
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.computeCropRectFromAspectRatio.a(int, short, byte, java.lang.Object[]):void");
    }

    static {
        byte[] bArr = {25, -93, -120, -48, -14, 9, -15, 2, 5, 4, 53, -66, -5, 68, -21, -52, 11, -4, 7, 63, -51, 16, -14, -2, 9, -7, 0, 14, -8, -21, 21, -6, -7, -14, 9, -15, 2, 5, 4, 53, -52, -16, -1, 65, -20, -48, -1, 3, 2, 5, 1, -20, 10, -7, 0, 1, -16, 35, -35, 2, 11, -3, -15, -1, 36, -20, -13, 7, 8, -22, 20, 50, -63, 10, -14, 6, 56, -34, -20, -9, 4, 1, -18, 8, -22, 20, 50, -63, 10, -14, 6, 56, -69, 12, -2, -7, 6, 1, -18, 69, -32, -25, -16, 11, -8, 10, -6, -9, 6, 3, 5, 14, -31, 8, -22, 20, 50, -63, 10, -14, 6, 56, -34, -20, -9, 4, 1, -18, 56, -14, 9, -15, 2, 5, 4, 53, -52, -16, -1, 65, -20, -35, -18, 10, -14, 12, -12, -6, 36, -21, -11, 12, 3, -4, -19, 2, -1, 12, -10, -7, 35, -35, 2, 11, -3, -15, -1, 36, -20, -13, 7, -14, 9, -15, 2, 5, 4, 53, -66, -5, 68, -35, -35, 2, 11, -3, -15, -1, -13, 40, -26, 4, 8, -22, 20, 50, -63, 10, -14, 6, 56, -38, -34, 1, 8, -6, 6, 36, -52, 11, -4, 7, -2, -14, -66, -3, 2, 11, 51, -16, -1, 10, -10, 9, 8, -22, 20, 50, -63, 10, -14, 6, 56, -38, -34, 1, 8, -6, 6, -53, -11, 8, -9, 2, -6, 8, 4, 27, -34, 1, 8, -6, 6, 8, -22, 20, 50, -60, -7, 64, -25, -36, -4, 6, 18, -20, 3, -4, -2, -14, 12, 3, -4, -10, -4, -5, 13, -41, -13, 0, -7, 18, -9, -6, -6, 8, -22, 20, 50, -63, 10, -14, 6, 56, -22, -38, 6, -18, 30, -19, -13, -5, 15, -10, 10, -3, -13, 1, 62, -53, -15, 5, -10, -2, 8, -11, 21, -28, 0, 17, -9, -6, 14, -43, -4, 15, -15, 2, 11, -20, 3, -19, -43, -4, 15, -15, 2, 11, -20, 3, -19, 23, -28};
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = bArr;
        byte b = bArr[68];
        byte b2 = bArr[5];
        byte b3 = bArr[52];
        byte b4 = bArr[26];
    }

    private static String b() throws Throwable {
        byte[] bArr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object[] objArr = new Object[1];
        a((byte) (-bArr[69]), (short) 328, (byte) (-bArr[154]), objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        a(bArr[8], (short) 305, (byte) 33, objArr2);
        if (cls.getField((String) objArr2[0]).getInt(null) >= 28) {
            try {
                Object[] objArr3 = new Object[1];
                a(bArr[30], (short) 299, (byte) (-bArr[154]), objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                a(bArr[93], (short) 277, bArr[276], objArr4);
                Method declaredMethod = cls2.getDeclaredMethod((String) objArr4[0], new Class[0]);
                Object[] objArr5 = new Object[1];
                a(bArr[27], (short) 264, bArr[52], objArr5);
                try {
                    Object[] objArr6 = {null, Array.newInstance(Class.forName((String) objArr5[0]), 0)};
                    Object[] objArr7 = new Object[1];
                    a((byte) (-bArr[69]), (short) (TuitionPaymentFragmentbindingInflater1 | 97), bArr[52], objArr7);
                    Class<?> cls3 = Class.forName((String) objArr7[0]);
                    Object[] objArr8 = new Object[1];
                    a(bArr[9], (short) 226, bArr[16], objArr8);
                    String str = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    a(bArr[27], (short) 264, bArr[52], objArr9);
                    byte b = bArr[319];
                    Object[] objArr10 = new Object[1];
                    a(b, (short) (b | 204), bArr[0], objArr10);
                    return (String) cls3.getMethod(str, Class.forName((String) objArr9[0]), Class.forName((String) objArr10[0])).invoke(declaredMethod, objArr6);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } catch (Exception unused) {
            }
        }
        try {
            int i = TuitionPaymentFragmentbindingInflater1;
            byte[] bArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr11 = new Object[1];
            a((byte) (i & 126), (short) 203, (byte) (-bArr2[154]), objArr11);
            Class<?> cls4 = Class.forName((String) objArr11[0]);
            byte b2 = bArr2[21];
            Object[] objArr12 = new Object[1];
            a(b2, (short) (b2 | 162), bArr2[319], objArr12);
            Method declaredMethod2 = cls4.getDeclaredMethod((String) objArr12[0], new Class[0]);
            Object[] objArr13 = new Object[1];
            a(bArr2[27], (short) 264, bArr2[52], objArr13);
            try {
                Object[] objArr14 = {null, Array.newInstance(Class.forName((String) objArr13[0]), 0)};
                Object[] objArr15 = new Object[1];
                a((byte) (-bArr2[69]), (short) (i | 97), bArr2[52], objArr15);
                Class<?> cls5 = Class.forName((String) objArr15[0]);
                Object[] objArr16 = new Object[1];
                a(bArr2[9], (short) 226, bArr2[16], objArr16);
                String str2 = (String) objArr16[0];
                Object[] objArr17 = new Object[1];
                a(bArr2[27], (short) 264, bArr2[52], objArr17);
                byte b3 = bArr2[319];
                Object[] objArr18 = new Object[1];
                a(b3, (short) (b3 | 204), bArr2[0], objArr18);
                return (String) cls5.getMethod(str2, Class.forName((String) objArr17[0]), Class.forName((String) objArr18[0])).invoke(declaredMethod2, objArr14);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    private static String TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws Throwable {
        try {
            char[] cArr = new char[76];
            try {
                try {
                    byte[] bArr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    Object[] objArr = new Object[1];
                    a(bArr[21], (short) 161, (byte) (-bArr[154]), objArr);
                    Class<?> cls = Class.forName((String) objArr[0]);
                    Object[] objArr2 = new Object[1];
                    a(bArr[47], (short) (TuitionPaymentFragmentbindingInflater1 & PointerIconCompat.TYPE_NO_DROP), bArr[18], objArr2);
                    int iIntValue = ((Integer) cls.getMethod((String) objArr2[0], null).invoke(null, null)).intValue();
                    try {
                        Object[] objArr3 = new Object[1];
                        a(bArr[30], (short) 140, bArr[52], objArr3);
                        Object objNewInstance = Class.forName((String) objArr3[0]).getDeclaredConstructor(null).newInstance(null);
                        byte b = bArr[9];
                        Object[] objArr4 = new Object[1];
                        a(b, (short) (b | 114), bArr[99], objArr4);
                        try {
                            Object[] objArr5 = {(String) objArr4[0]};
                            Object[] objArr6 = new Object[1];
                            a(bArr[30], (short) 140, bArr[52], objArr6);
                            Class<?> cls2 = Class.forName((String) objArr6[0]);
                            Object[] objArr7 = new Object[1];
                            a(bArr[9], (short) 113, (byte) (-bArr[154]), objArr7);
                            String str = (String) objArr7[0];
                            Object[] objArr8 = new Object[1];
                            a(bArr[27], (short) 108, bArr[52], objArr8);
                            Object objInvoke = cls2.getMethod(str, Class.forName((String) objArr8[0])).invoke(objNewInstance, objArr5);
                            try {
                                Object[] objArr9 = {Integer.valueOf(iIntValue)};
                                Object[] objArr10 = new Object[1];
                                a(bArr[30], (short) 140, bArr[52], objArr10);
                                Class<?> cls3 = Class.forName((String) objArr10[0]);
                                Object[] objArr11 = new Object[1];
                                a(bArr[9], (short) 113, (byte) (-bArr[154]), objArr11);
                                Object objInvoke2 = cls3.getMethod((String) objArr11[0], Integer.TYPE).invoke(objInvoke, objArr9);
                                Object[] objArr12 = new Object[1];
                                a(bArr[75], (short) (-bArr[1]), bArr[99], objArr12);
                                try {
                                    Object[] objArr13 = {(String) objArr12[0]};
                                    Object[] objArr14 = new Object[1];
                                    a(bArr[30], (short) 140, bArr[52], objArr14);
                                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                                    Object[] objArr15 = new Object[1];
                                    a(bArr[9], (short) 113, (byte) (-bArr[154]), objArr15);
                                    String str2 = (String) objArr15[0];
                                    Object[] objArr16 = new Object[1];
                                    a(bArr[27], (short) 108, bArr[52], objArr16);
                                    Object objInvoke3 = cls4.getMethod(str2, Class.forName((String) objArr16[0])).invoke(objInvoke2, objArr13);
                                    try {
                                        Object[] objArr17 = new Object[1];
                                        a(bArr[30], (short) 140, bArr[52], objArr17);
                                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                                        byte b2 = bArr[75];
                                        Object[] objArr18 = new Object[1];
                                        a(b2, (short) (b2 | 80), bArr[26], objArr18);
                                        try {
                                            Object[] objArr19 = {cls5.getMethod((String) objArr18[0], null).invoke(objInvoke3, null)};
                                            Object[] objArr20 = new Object[1];
                                            a(bArr[21], (short) 79, bArr[52], objArr20);
                                            Class<?> cls6 = Class.forName((String) objArr20[0]);
                                            Object[] objArr21 = new Object[1];
                                            a(bArr[27], (short) 108, bArr[52], objArr21);
                                            Object objNewInstance2 = cls6.getDeclaredConstructor(Class.forName((String) objArr21[0])).newInstance(objArr19);
                                            try {
                                                Object[] objArr22 = new Object[1];
                                                a(bArr[21], (short) 79, bArr[52], objArr22);
                                                Class<?> cls7 = Class.forName((String) objArr22[0]);
                                                byte b3 = bArr[7];
                                                Object[] objArr23 = new Object[1];
                                                a(b3, bArr[308], b3, objArr23);
                                                int iIntValue2 = ((Integer) cls7.getMethod((String) objArr23[0], char[].class).invoke(objNewInstance2, cArr)).intValue();
                                                try {
                                                    Object[] objArr24 = new Object[1];
                                                    a(bArr[21], (short) 79, bArr[52], objArr24);
                                                    Class<?> cls8 = Class.forName((String) objArr24[0]);
                                                    byte b4 = bArr[47];
                                                    Object[] objArr25 = new Object[1];
                                                    a(b4, (short) (b4 | 56), bArr[319], objArr25);
                                                    cls8.getMethod((String) objArr25[0], null).invoke(objNewInstance2, null);
                                                    try {
                                                        Object[] objArr26 = {cArr, 0, Integer.valueOf(iIntValue2)};
                                                        Object[] objArr27 = new Object[1];
                                                        a(bArr[27], (short) 108, bArr[52], objArr27);
                                                        return (String) Class.forName((String) objArr27[0]).getDeclaredConstructor(char[].class, Integer.TYPE, Integer.TYPE).newInstance(objArr26);
                                                    } catch (Throwable th) {
                                                        Throwable cause = th.getCause();
                                                        if (cause != null) {
                                                            throw cause;
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Throwable th2) {
                                                    Throwable cause2 = th2.getCause();
                                                    if (cause2 != null) {
                                                        throw cause2;
                                                    }
                                                    throw th2;
                                                }
                                            } catch (Throwable th3) {
                                                Throwable cause3 = th3.getCause();
                                                if (cause3 != null) {
                                                    throw cause3;
                                                }
                                                throw th3;
                                            }
                                        } catch (Throwable th4) {
                                            Throwable cause4 = th4.getCause();
                                            if (cause4 != null) {
                                                throw cause4;
                                            }
                                            throw th4;
                                        }
                                    } catch (Throwable th5) {
                                        Throwable cause5 = th5.getCause();
                                        if (cause5 != null) {
                                            throw cause5;
                                        }
                                        throw th5;
                                    }
                                } catch (Throwable th6) {
                                    Throwable cause6 = th6.getCause();
                                    if (cause6 != null) {
                                        throw cause6;
                                    }
                                    throw th6;
                                }
                            } catch (Throwable th7) {
                                Throwable cause7 = th7.getCause();
                                if (cause7 != null) {
                                    throw cause7;
                                }
                                throw th7;
                            }
                        } catch (Throwable th8) {
                            Throwable cause8 = th8.getCause();
                            if (cause8 != null) {
                                throw cause8;
                            }
                            throw th8;
                        }
                    } catch (Throwable th9) {
                        Throwable cause9 = th9.getCause();
                        if (cause9 != null) {
                            throw cause9;
                        }
                        throw th9;
                    }
                } catch (Throwable th10) {
                    Throwable cause10 = th10.getCause();
                    if (cause10 != null) {
                        throw cause10;
                    }
                    throw th10;
                }
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x00ee  */
    public static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3() throws Throwable {
        boolean z;
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String strB = b();
        boolean z2 = true;
        if (strB != null) {
            byte[] bArr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            byte b = bArr[26];
            short s = (short) (b | 55);
            Object[] objArr = new Object[1];
            a(b, s, (byte) (s + 3), objArr);
            try {
                Object[] objArr2 = {(String) objArr[0]};
                Object[] objArr3 = new Object[1];
                a(bArr[27], (short) 108, bArr[52], objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                byte b2 = bArr[75];
                Object[] objArr4 = new Object[1];
                a(b2, (short) (b2 | 48), bArr[319], objArr4);
                String str = (String) objArr4[0];
                Object[] objArr5 = new Object[1];
                a(bArr[70], (short) 47, bArr[52], objArr5);
                if (!((Boolean) cls.getMethod(str, Class.forName((String) objArr5[0])).invoke(strB, objArr2)).booleanValue()) {
                    Object[] objArr6 = new Object[1];
                    a(bArr[21], (short) (-bArr[190]), bArr[319], objArr6);
                    Object[] objArr7 = {(String) objArr6[0]};
                    Object[] objArr8 = new Object[1];
                    a(bArr[27], (short) 108, bArr[52], objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    byte b3 = bArr[75];
                    Object[] objArr9 = new Object[1];
                    a(b3, (short) (b3 | 48), bArr[319], objArr9);
                    String str2 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    a(bArr[70], (short) 47, bArr[52], objArr10);
                    if (!((Boolean) cls2.getMethod(str2, Class.forName((String) objArr10[0])).invoke(strB, objArr7)).booleanValue()) {
                        z = false;
                    }
                }
                z = true;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } else {
            z = false;
        }
        if (z || (strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2()) == null) {
            return z;
        }
        byte[] bArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        byte b4 = bArr2[26];
        short s2 = (short) (b4 | 55);
        Object[] objArr11 = new Object[1];
        a(b4, s2, (byte) (s2 + 3), objArr11);
        Object[] objArr12 = {(String) objArr11[0]};
        Object[] objArr13 = new Object[1];
        a(bArr2[27], (short) 108, bArr2[52], objArr13);
        Class<?> cls3 = Class.forName((String) objArr13[0]);
        byte b5 = bArr2[75];
        Object[] objArr14 = new Object[1];
        a(b5, (short) (b5 | 48), bArr2[319], objArr14);
        String str3 = (String) objArr14[0];
        Object[] objArr15 = new Object[1];
        a(bArr2[70], (short) 47, bArr2[52], objArr15);
        if (!((Boolean) cls3.getMethod(str3, Class.forName((String) objArr15[0])).invoke(strTuitionPaymentFragmentspecialinlinedviewModeldefault2, objArr12)).booleanValue()) {
            Object[] objArr16 = new Object[1];
            a(bArr2[21], (short) (-bArr2[190]), bArr2[319], objArr16);
            Object[] objArr17 = {(String) objArr16[0]};
            Object[] objArr18 = new Object[1];
            a(bArr2[27], (short) 108, bArr2[52], objArr18);
            Class<?> cls4 = Class.forName((String) objArr18[0]);
            byte b6 = bArr2[75];
            Object[] objArr19 = new Object[1];
            a(b6, (short) (b6 | 48), bArr2[319], objArr19);
            String str4 = (String) objArr19[0];
            Object[] objArr20 = new Object[1];
            a(bArr2[70], (short) 47, bArr2[52], objArr20);
            if (!((Boolean) cls4.getMethod(str4, Class.forName((String) objArr20[0])).invoke(strTuitionPaymentFragmentspecialinlinedviewModeldefault2, objArr17)).booleanValue()) {
                z2 = false;
            }
        }
        return z2;
    }
}
