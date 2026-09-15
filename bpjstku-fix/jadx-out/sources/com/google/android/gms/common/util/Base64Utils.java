package com.google.android.gms.common.util;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.initSession;
import java.lang.reflect.Method;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes3.dex */
public final class Base64Utils {
    private static short[] TuitionPaymentFragmentbindingInflater1;
    private static final byte[] $$c = {58, -103, 118, 14};
    private static final int $$d = 93;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {119, -102, -34, -3, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 225;
    private static int d = 0;
    private static int asBinder = 1;
    private static int b = -1820802690;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1934795538;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -72913544;
    private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {-23, 26, -11, 23, -32, 25, -54, -13, 92, -32, -17, 23, -32, 25, -22, -45, 44, 29, 28, 27, -24, 16, -21, -20, -17, 30, -61, Base64.padSymbol, 25, -32, 19, -11, 24, 28, 27, 26, -26, -55, 43, -23, 24, -4, -17, 30, -61, Base64.padSymbol, 25, -32, 19, -11, 24, 28, 27, 26, -26, -55, -11, 39, 27, -92, 92, -32, -17, 23, -32, 25, -22, -45, 44, 29, 28, 27, -24, 16, -21, 27, -22, -32, 19, -32, -14, 23, -94, 47, 31, -20, -25, 28, -26, 20, -11, 27, -25, -47, 47, 31, 25, -26, -37, 93, -19, 29, -29, -36, 42, 9, -23, -48, 31, -29, 31, -20, -25, 28, -26, 20, -11, 27, -25, -48, 89, 27};

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            byte[] r0 = com.google.android.gms.common.util.Base64Utils.$$a
            int r6 = 53 - r6
            int r7 = r7 * 14
            int r7 = r7 + 84
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r4 = r2
            r7 = r6
            goto L25
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r3 = r0[r8]
        L25:
            int r8 = r8 + 1
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.Base64Utils.c(short, byte, int, java.lang.Object[]):void");
    }

    public static byte[] decode(String str) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 37;
        d = i3 % 128;
        int i4 = i3 % 2;
        if (str == null) {
            int i5 = i2 + 63;
            d = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }
        byte[] bArrDecode = android.util.Base64.decode(str, 0);
        int i7 = d + 17;
        asBinder = i7 % 128;
        if (i7 % 2 != 0) {
            return bArrDecode;
        }
        throw null;
    }

    public static byte[] decodeUrlSafe(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 125;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        Object obj = null;
        if (str == null) {
            int i5 = i3 + 53;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                return null;
            }
            throw null;
        }
        byte[] bArrDecode = android.util.Base64.decode(str, 10);
        int i6 = asBinder + 89;
        d = i6 % 128;
        if (i6 % 2 == 0) {
            return bArrDecode;
        }
        obj.hashCode();
        throw null;
    }

    public static byte[] decodeUrlSafeNoPadding(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 9;
        d = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (str == null) {
            return null;
        }
        byte[] bArrDecode = android.util.Base64.decode(str, 11);
        int i3 = d + 109;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return bArrDecode;
        }
        obj.hashCode();
        throw null;
    }

    public static String encode(byte[] bArr) {
        int i = 2 % 2;
        if (bArr != null) {
            String strEncodeToString = android.util.Base64.encodeToString(bArr, 0);
            int i2 = asBinder + 9;
            d = i2 % 128;
            int i3 = i2 % 2;
            return strEncodeToString;
        }
        int i4 = d + 5;
        asBinder = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static String encodeUrlSafe(byte[] bArr) {
        int i = 2 % 2;
        int i2 = d + 63;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        if (bArr != null) {
            return android.util.Base64.encodeToString(bArr, 10);
        }
        int i5 = i3 + 23;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 4 / 0;
        }
        int i7 = i3 + 99;
        d = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 34 / 0;
        }
        return null;
    }

    public static String encodeUrlSafeNoPadding(byte[] bArr) {
        int i = 2 % 2;
        if (bArr != null) {
            return android.util.Base64.encodeToString(bArr, 11);
        }
        int i2 = asBinder;
        int i3 = i2 + 101;
        d = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = i2 + 69;
        d = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x007a  */
    private static void a(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5 = 2;
        int i6 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char modifierMetaStateMask = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                int iAlpha = 2267 - Color.alpha(0);
                int windowTouchSlop = 33 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                byte length = (byte) $$c.length;
                byte b3 = (byte) (length - 4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(modifierMetaStateMask, iAlpha, windowTouchSlop, 1387473586, false, $$e(length, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i7 = $10 + 85;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    i4 = 0;
                } else {
                    i4 = 1;
                }
            } else {
                i4 = 0;
            }
            if (i4 != 0) {
                byte[] bArr = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (bArr != null) {
                    int i8 = $10 + 55;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    int length2 = bArr.length;
                    byte[] bArr2 = new byte[length2];
                    int i10 = 0;
                    while (i10 < length2) {
                        int i11 = $10 + 103;
                        $11 = i11 % 128;
                        int i12 = i11 % i5;
                        Object[] objArr3 = {Integer.valueOf(bArr[i10])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Process.myTid() >> 22), (ViewConfiguration.getPressedStateDuration() >> 16) + 3358, Process.getGidForName("") + 19, -1054011043, false, $$e(b4, b5, b5), new Class[]{Integer.TYPE});
                        }
                        bArr2[i10] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        i10++;
                        i5 = 2;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(b)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char modifierMetaStateMask2 = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                        int scrollBarFadeDuration = 2267 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int iIndexOf = TextUtils.indexOf("", "") + 33;
                        byte length3 = (byte) $$c.length;
                        byte b6 = (byte) (length3 - 4);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(modifierMetaStateMask2, scrollBarFadeDuration, iIndexOf, 1387473586, false, $$e(length3, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L)));
                } else {
                    iIntValue = (short) (((short) (((long) TuitionPaymentFragmentbindingInflater1[i3 + ((int) (((long) b) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) b) ^ 3046761265686732006L)) + i4;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) 3;
                    byte b8 = (byte) (b7 - 3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (55905 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 2855 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 14 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -1529949196, false, $$e(b7, b8, b8), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (bArr4 != null) {
                    int i13 = $11 + 73;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    int length4 = bArr4.length;
                    byte[] bArr5 = new byte[length4];
                    for (int i15 = 0; i15 < length4; i15++) {
                        bArr5[i15] = (byte) (((long) bArr4[i15]) ^ 3046761265686732006L);
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    int i16 = $11 + 109;
                    $10 = i16 % 128;
                    if (i16 % 2 != 0) {
                        throw null;
                    }
                    if (z) {
                        byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i17 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i17 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i17]) ^ 3046761265686732006L)) + s)) ^ b2));
                    } else {
                        short[] sArr = TuitionPaymentFragmentbindingInflater1;
                        int i18 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i18 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i18]) ^ 3046761265686732006L)) + s)) ^ b2));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
        	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(android.content.Context r31, int r32, int r33, int r34) {
        /*
            Method dump skipped, instruction units count: 2762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.Base64Utils.TuitionPaymentFragmentspecialinlinedviewModeldefault2(android.content.Context, int, int, int):java.lang.Object[]");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(byte r6, short r7, byte r8) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 4
            byte[] r0 = com.google.android.gms.common.util.Base64Utils.$$c
            int r8 = r8 * 4
            int r8 = r8 + 1
            int r6 = 121 - r6
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2b
        L14:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r4 = r0[r6]
            r5 = r3
            r3 = r6
            r6 = r4
            r4 = r5
        L2b:
            int r7 = r7 + r6
            int r6 = r3 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.Base64Utils.$$e(byte, short, byte):java.lang.String");
    }
}
