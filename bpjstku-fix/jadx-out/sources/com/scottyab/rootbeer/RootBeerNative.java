package com.scottyab.rootbeer;

import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import defpackage.initSession;
import defpackage.setContentResolver;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
public class RootBeerNative {
    private static final byte[] $$a;
    private static final byte[] $$d;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3 = false;
    private static final int $$e = 227;
    private static final int $$b = 191;

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = 105 - r7
            int r8 = r8 + 6
            int r6 = r6 + 99
            byte[] r0 = com.scottyab.rootbeer.RootBeerNative.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r8
            r5 = r2
            goto L24
        L10:
            r3 = r2
        L11:
            byte r4 = (byte) r6
            int r7 = r7 + 1
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            r3 = r0[r7]
        L24:
            int r6 = r6 + r3
            int r6 = r6 + (-5)
            r3 = r5
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scottyab.rootbeer.RootBeerNative.a(int, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 3
            int r6 = 3 - r6
            int r8 = r8 * 3
            int r8 = 84 - r8
            byte[] r0 = com.scottyab.rootbeer.RootBeerNative.$$d
            int r7 = r7 * 2
            int r7 = 53 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2b
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            int r6 = r6 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r0[r6]
        L2b:
            int r8 = r8 + r3
            int r8 = r8 + (-10)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scottyab.rootbeer.RootBeerNative.c(int, short, short, java.lang.Object[]):void");
    }

    public native int checkForRoot(Object[] objArr);

    public native int setLogDebugMessages(boolean z);

    /* JADX WARN: Type inference failed for: r1v28, types: [boolean, int] */
    static {
        Object[] objArr;
        byte[] bArr = {91, -9, 99, 11, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55};
        $$d = bArr;
        byte[] bArr2 = {113, 29, -123, -97, -38, 1, 2, 8, 50, -4, 26, -16, -46, 67, -6, 18, -2, -52, 41, 40, -2, 11, -6, 9, -3, -4, 26, -16, -46, 67, -6, 18, -2, -52, 26, 46, -6, 23, 5, -34, 40, -9, 8, 6, 18, -4, 26, -16, -46, 67, -6, 18, -2, -52, 42, 38, 3, -4, 10, -2, 3, 20, -29, 40, -2, 11, -6, 9, -3, -4, 26, -16, -46, 67, -6, 18, -2, -52, 26, 46, -6, 23, 5, 3, 20, -44, 46, -6, 23, 5, -34, 40, -9, 8, 6, 18, 8, -9, 8, -19, 34, -2, 21, -12, 22, 12, 8, -9, 8, -19, 34, -2, 21, -12, 22, 12, -68};
        $$a = bArr2;
        try {
            byte b = bArr2[5];
            byte b2 = (byte) (b - 1);
            Object[] objArr2 = new Object[1];
            a(b2, (byte) (b2 | 102), (byte) (b - 1), objArr2);
            String str = (String) objArr2[0];
            ClassLoader classLoader = RootBeerNative.class.getClassLoader();
            try {
                Object[] objArr3 = {1257092341};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3414 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), KeyEvent.keyCodeFromString("") + 1559, ExpandableListView.getPackedPositionGroup(0L) + 24, -86093833, false, null, new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr4 = {str, classLoader, false, -31763657, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr3), -31763657};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char cResolveOpacity = (char) (43042 - Drawable.resolveOpacity(0, 0));
                        int bitsPerPixel = 3110 - ImageFormat.getBitsPerPixel(0);
                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 22;
                        byte b3 = (byte) (bArr[37] - 1);
                        byte b4 = b3;
                        Object[] objArr5 = new Object[1];
                        c(b3, b4, b4, objArr5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveOpacity, bitsPerPixel, maximumFlingVelocity, -675216362, false, (String) objArr5[0], new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) TextUtils.getTrimmedLength(""), 518 - (ViewConfiguration.getWindowTouchSlop() >> 8), 76 - View.MeasureSpec.makeMeasureSpec(0, 0)), Integer.TYPE});
                    }
                    Object[] objArr6 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr4);
                    int i = ((int[]) objArr6[1])[0];
                    int i2 = ((int[]) objArr6[2])[0];
                    if (i2 == i) {
                        int i3 = ((int[]) objArr6[0])[0];
                        int i4 = ((int[]) objArr6[2])[0];
                        int i5 = ((int[]) objArr6[1])[0];
                        String[] strArr = (String[]) objArr6[3];
                        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                        int i6 = ~iMaxMemory;
                        int i7 = i3 + (-1678072196) + (((~(i6 | 997713894)) | (-998240255) | (~((-706791205) | iMaxMemory))) * 717) + (((~(iMaxMemory | 997713894)) | (~(i6 | (-706791205))) | (-998240255)) * 717);
                        int i8 = (i7 << 13) ^ i7;
                        int i9 = i8 ^ (i8 >>> 17);
                        ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
                        objArr = new Object[]{new int[1], new int[]{i5}, new int[]{i4}, strArr};
                    } else {
                        ArrayList arrayList = new ArrayList();
                        String[] strArr2 = (String[]) objArr6[3];
                        if (strArr2 != null) {
                            for (String str2 : strArr2) {
                                arrayList.add(str2);
                            }
                        }
                        Toast.makeText((Context) null, i2 / (((i2 - 1) * i2) % 2), 0).show();
                        int i10 = ((int[]) objArr6[0])[0];
                        int i11 = ((int[]) objArr6[2])[0];
                        int i12 = ((int[]) objArr6[1])[0];
                        String[] strArr3 = (String[]) objArr6[3];
                        int iNextInt = new Random().nextInt(983163509);
                        int i13 = i10 + 1675158114 + (((~((-1579721474) | iNextInt)) | (-1601746722)) * (-502)) + ((~((~iNextInt) | (-1476436737))) * (-502)) + (((~(iNextInt | (-125309986))) | (-1579721474)) * TypedValues.PositionType.TYPE_DRAWPATH);
                        int i14 = (i13 << 13) ^ i13;
                        int i15 = i14 ^ (i14 >>> 17);
                        ((int[]) objArr[0])[0] = i15 ^ (i15 << 5);
                        objArr = new Object[]{new int[1], new int[]{i12}, new int[]{i11}, strArr3};
                    }
                    try {
                        int i16 = $$b;
                        byte[] bArr3 = $$a;
                        Object[] objArr7 = new Object[1];
                        a((byte) (i16 & 7), (byte) (-bArr3[3]), bArr3[21], objArr7);
                        Class<?> cls = Class.forName((String) objArr7[0]);
                        Object[] objArr8 = new Object[1];
                        a((byte) (i16 & 7), (byte) 81, (byte) (i16 & 15), objArr8);
                        Class<?> cls2 = Class.forName((String) objArr8[0]);
                        Object[] objArr9 = new Object[1];
                        a((byte) (i16 & 7), (byte) (i16 & 125), bArr3[58], objArr9);
                        Class<?> cls3 = Class.forName((String) objArr9[0]);
                        byte b5 = bArr3[9];
                        Object[] objArr10 = new Object[1];
                        a((byte) (-b5), bArr3[35], (byte) (-b5), objArr10);
                        Object objInvoke = cls.getMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0]);
                        Object[] objArr11 = new Object[1];
                        a((byte) (i16 & 7), (byte) (i16 & 101), bArr3[23], objArr11);
                        Class<?> cls4 = Class.forName((String) objArr11[0]);
                        Object[] objArr12 = new Object[1];
                        a((byte) (-bArr3[9]), bArr3[37], bArr3[7], objArr12);
                        Object objInvoke2 = cls4.getMethod((String) objArr12[0], new Class[0]).invoke(RootBeerNative.class, new Object[0]);
                        if (Build.VERSION.SDK_INT <= 24) {
                            Object[] objArr13 = new Object[1];
                            a(bArr3[23], bArr3[58], bArr3[38], objArr13);
                            Method declaredMethod = cls.getDeclaredMethod((String) objArr13[0], cls3, cls2);
                            declaredMethod.setAccessible(true);
                            declaredMethod.invoke(objInvoke, str, objInvoke2);
                        } else {
                            Object[] objArr14 = new Object[1];
                            a(bArr3[23], (byte) (bArr3[5] - 1), bArr3[43], objArr14);
                            Method declaredMethod2 = cls.getDeclaredMethod((String) objArr14[0], cls2, cls3);
                            declaredMethod2.setAccessible(true);
                            declaredMethod2.invoke(objInvoke, objInvoke2, str);
                        }
                        int i17 = ((int[]) objArr[0])[0];
                        int i18 = i17 * i17;
                        int i19 = -(423520070 * i17);
                        int i20 = ((((i18 | i19) << 1) - (i18 ^ i19)) - (~(-(i17 * (-1936476258))))) - 1;
                        int i21 = (i20 & 645041860) + (645041860 | i20);
                        int i22 = i21 >> 29;
                        int i23 = (i21 - (~((((i22 ^ (-15)) + ((i22 & (-15)) << 1)) / 8) + 1))) - 1;
                        int i24 = i21 >> 27;
                        int i25 = ((i24 ^ (-63)) + ((i24 & (-63)) << 1)) / 32;
                        int i26 = (-(i23 ^ ((i25 & 1) + (i25 | 1)))) + 9;
                        int i27 = i26 >> 27;
                        int i28 = ((i27 & (-63)) + (i27 | (-63))) / 32;
                        int i29 = (i28 ^ 1) + ((i28 & 1) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2547 / ((i26 & (-((i29 ^ 1) + ((i29 & 1) << 1)))) * 283);
                    } catch (InvocationTargetException e2) {
                        Throwable cause = e2.getCause();
                        if (cause == null) {
                            throw e2;
                        }
                        throw cause;
                    }
                } catch (Throwable th) {
                    Throwable cause2 = th.getCause();
                    if (cause2 == null) {
                        throw th;
                    }
                    throw cause2;
                }
            } catch (Throwable th2) {
                Throwable cause3 = th2.getCause();
                if (cause3 == null) {
                    throw th2;
                }
                throw cause3;
            }
        } catch (UnsatisfiedLinkError e3) {
            setContentResolver.TuitionPaymentFragmentspecialinlinedviewModeldefault3(e3);
        }
    }

    public static boolean b() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }
}
