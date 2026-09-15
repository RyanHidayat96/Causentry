package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.initSession;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class DayViewDecorator implements Parcelable {
    private static final byte[] $$c = {21, ByteCompanionObject.MAX_VALUE, 49, -115};
    private static final int $$f = 53;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {5, -91, 77, 46, -20, -6, 55, -60, -22, -2, -17, -9, 1, -18, 63, -62, -5, -27, 11, -9, -15, -13, 2, -13, -13, -1, 49, -32, -52, 9, -14, -14, 0, -17, -14, 43, -58, 2, -10, 34, -42, -25, 3, -21, 9, 13, -25, -25, -10, 3, -2, -14, -15, 7, -21, -14, 41, -46, -19, 3, -25, 13, -17, -13, 3, -9, -15, 36, -51, 4, -26, 0, 0, -17, -14, 42, -47, -13, 2, -13, -13, -1, -41, 4, -19, 3, -14, -7, 22, -25, -32, 4, 0, -17, -14, 38, -52, 9, -14, -14, 0, -17, -14, -7, -5, 3, -6, -14, 0, -19, -5, -13, -6, -5, -13, 1, -7, -26, 5, -4, -26, 34, -42, 3, -9, -15, 0, -9, -9, -3, -28, 1, -16, 58};
    private static final int $$e = 27;
    private static final byte[] $$a = {110, -73, -111, 99, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 219;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int b = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -83722258;

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 2
            int r7 = 84 - r7
            int r8 = r8 + 4
            byte[] r0 = com.google.android.material.datepicker.DayViewDecorator.$$a
            int r6 = r6 * 15
            int r1 = r6 + 38
            byte[] r1 = new byte[r1]
            int r6 = r6 + 37
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2d
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            int r8 = r8 + 1
            r3 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2d:
            int r7 = r7 + r8
            int r7 = r7 + (-11)
            r8 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.DayViewDecorator.a(byte, byte, byte, java.lang.Object[]):void");
    }

    private static void d(short s, int i, byte b2, Object[] objArr) {
        int i2 = 99 - (i * 15);
        int i3 = s * 26;
        byte[] bArr = $$d;
        int i4 = b2 + 4;
        byte[] bArr2 = new byte[79 - i3];
        int i5 = 78 - i3;
        int i6 = -1;
        if (bArr == null) {
            i2 = (i5 + (-i2)) - 8;
            i4 = i4;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i2;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i8 = i4 + 1;
            i2 = (i2 + (-bArr[i8])) - 8;
            i4 = i8;
            i6 = i7;
        }
    }

    private static void c(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr3 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
            int i5 = $11 + 25;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i7 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i7]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (ViewConfiguration.getTapTimeout() >> 16) + 3291, (KeyEvent.getMaxKeyCode() >> 16) + 31, 1199271174, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 651;
                    int size = View.MeasureSpec.getSize(0) + 44;
                    byte b4 = (byte) ($$f & 3);
                    byte b5 = (byte) (b4 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionType, iKeyCodeFromString, size, -450685997, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i8 = $10 + 33;
                $11 = i8 % 128;
                int i9 = i8 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i3 > 0) {
            int i10 = $10 + 95;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr4 = new char[i2];
            System.arraycopy(cArr3, 0, cArr4, 0, i2);
            System.arraycopy(cArr4, 0, cArr3, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr4, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr3, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            int i12 = $11 + 115;
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            } else {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            }
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                    int deadChar = KeyEvent.getDeadChar(0, 0) + 651;
                    int iIndexOf = 44 - TextUtils.indexOf("", "", 0);
                    byte b6 = (byte) ($$f & 3);
                    byte b7 = (byte) (b6 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cCombineMeasuredStates, deadChar, iIndexOf, -450685997, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
    }

    public ColorStateList getBackgroundColor(Context context, int i, int i2, int i3, boolean z, boolean z2) throws Throwable {
        Object[] objArr;
        int i4 = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char maximumDrawingCacheSize = (char) (43042 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
            int iCombineMeasuredStates = 3111 - View.combineMeasuredStates(0, 0);
            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 22;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[132], bArr[7], bArr[5], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumDrawingCacheSize, iCombineMeasuredStates, longPressTimeout, -1272852037, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(false, (-16776977) - Color.rgb(0, 0, 0), 22 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 7, new char[]{2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(true, 243 - (ViewConfiguration.getScrollBarSize() >> 8), 15 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 9 - TextUtils.lastIndexOf("", '0', 0, 0), new char[]{65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) (TextUtils.indexOf("", "") + 43042);
            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 3111;
            int bitsPerPixel = 21 - ImageFormat.getBitsPerPixel(0);
            byte[] bArr2 = $$a;
            byte b2 = bArr2[132];
            byte b3 = bArr2[7];
            Object[] objArr5 = new Object[1];
            a(b2, b3, (byte) (b3 | 51), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, absoluteGravity, bitsPerPixel, -1269618118, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = TuitionPaymentFragmentbindingInflater1 + 53;
            b = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char gidForName = (char) (43041 - Process.getGidForName(""));
                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 3111;
                int fadingEdgeLength = 22 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                byte b4 = $$a[7];
                byte b5 = b4;
                Object[] objArr6 = new Object[1];
                a(b4, b5, (byte) (b5 | 103), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(gidForName, threadPriority, fadingEdgeLength, 154975793, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i7 = ((int[]) objArr7[2])[0];
            int i8 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i8};
            int iIdentityHashCode = System.identityHashCode(this);
            int i9 = ~iIdentityHashCode;
            int i10 = ((((-1105216912) + (((~((-1592494891) | i9)) | (~(1593814010 | iIdentityHashCode))) * (-831))) + ((~((-1481277443) | iIdentityHashCode)) * (-1662))) + (((~(iIdentityHashCode | 1592494890)) | ((~(i9 | (-112536569))) | (~(112536568 | iIdentityHashCode)))) * 831)) - 2114360135;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[0])[0] = i12 ^ (i12 << 5);
            objArr = new Object[]{new int[1], iArr, new int[]{i7}, strArr};
        } else {
            try {
                Object[] objArr8 = {null, Integer.valueOf(i), 0, -2114360135};
                byte[] bArr3 = $$d;
                byte b6 = bArr3[32];
                Object[] objArr9 = new Object[1];
                d(b6, b6, bArr3[25], objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[0]);
                byte b7 = bArr3[12];
                Object[] objArr10 = new Object[1];
                d(b7, b7, bArr3[2], objArr10);
                Object[] objArr11 = (Object[]) cls2.getMethod((String) objArr10[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c = (char) (43043 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                    int doubleTapTimeout = 3111 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 23;
                    byte b8 = $$a[7];
                    byte b9 = b8;
                    Object[] objArr12 = new Object[1];
                    a(b8, b9, (byte) (b9 | 103), objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, doubleTapTimeout, modifierMetaStateMask, 154975793, false, (String) objArr12[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr11);
                try {
                    Object[] objArr13 = new Object[1];
                    c(false, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 239, TextUtils.indexOf("", "") + 22, 7 - TextUtils.indexOf("", ""), new char[]{2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17}, objArr13);
                    Class<?> cls3 = Class.forName((String) objArr13[0]);
                    Object[] objArr14 = new Object[1];
                    c(true, 243 - Gravity.getAbsoluteGravity(0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14, TextUtils.getOffsetAfter("", 0) + 10, new char[]{65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5}, objArr14);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr14[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char modifierMetaStateMask2 = (char) (43041 - ((byte) KeyEvent.getModifierMetaStateMask()));
                        int i13 = 3111 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 22;
                        byte[] bArr4 = $$a;
                        byte b10 = bArr4[132];
                        byte b11 = bArr4[7];
                        Object[] objArr15 = new Object[1];
                        a(b10, b11, (byte) (b11 | 51), objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(modifierMetaStateMask2, i13, iMakeMeasureSpec, -1269618118, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cIndexOf2 = (char) (43041 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                        int iIndexOf = TextUtils.indexOf("", "", 0) + 3111;
                        int maxKeyCode = 22 - (KeyEvent.getMaxKeyCode() >> 16);
                        byte[] bArr5 = $$a;
                        Object[] objArr16 = new Object[1];
                        a(bArr5[132], bArr5[7], bArr5[5], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf2, iIndexOf, maxKeyCode, -1272852037, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr11;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i14 = ((int[]) objArr[1])[0];
        int i15 = ((int[]) objArr[2])[0];
        if (i15 != i14) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[3];
            if (strArr2 != null) {
                for (String str : strArr2) {
                    int i16 = TuitionPaymentFragmentbindingInflater1 + 115;
                    b = i16 % 128;
                    int i17 = i16 % 2;
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i15));
        }
        int i18 = TuitionPaymentFragmentbindingInflater1 + 47;
        b = i18 % 128;
        int i19 = i18 % 2;
        int i20 = ((int[]) objArr[0])[0];
        int i21 = ((int[]) objArr[2])[0];
        int i22 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[3];
        int[] iArr2 = {i21};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i23 = ~iIdentityHashCode2;
        int i24 = i20 + 79823242 + (((~(1677244158 | i23)) | 27787300) * 220) + (((~(i23 | 1676157686)) | 28873772) * (-440)) + ((iIdentityHashCode2 | 1677244158) * 220);
        int i25 = (i24 << 13) ^ i24;
        int i26 = i25 ^ (i25 >>> 17);
        ((int[]) objArr[0])[0] = i26 ^ (i26 << 5);
        Object[] objArr17 = {new int[1], new int[]{i22}, iArr2, strArr3};
        int i27 = b + 105;
        TuitionPaymentFragmentbindingInflater1 = i27 % 128;
        if (i27 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public Drawable getCompoundDrawableBottom(Context context, int i, int i2, int i3, boolean z, boolean z2) {
        int i4 = 2 % 2;
        int i5 = b + 57;
        int i6 = i5 % 128;
        TuitionPaymentFragmentbindingInflater1 = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 25;
        b = i8 % 128;
        int i9 = i8 % 2;
        return null;
    }

    public Drawable getCompoundDrawableLeft(Context context, int i, int i2, int i3, boolean z, boolean z2) {
        int i4 = 2 % 2;
        int i5 = b + 33;
        int i6 = i5 % 128;
        TuitionPaymentFragmentbindingInflater1 = i6;
        if (i5 % 2 != 0) {
            throw null;
        }
        int i7 = i6 + 65;
        b = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    public Drawable getCompoundDrawableRight(Context context, int i, int i2, int i3, boolean z, boolean z2) {
        int i4 = 2 % 2;
        int i5 = b + 21;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public Drawable getCompoundDrawableTop(Context context, int i, int i2, int i3, boolean z, boolean z2) {
        int i4 = 2 % 2;
        int i5 = TuitionPaymentFragmentbindingInflater1 + 99;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public CharSequence getContentDescription(Context context, int i, int i2, int i3, boolean z, boolean z2, CharSequence charSequence) {
        int i4 = 2 % 2;
        int i5 = TuitionPaymentFragmentbindingInflater1;
        int i6 = i5 + 103;
        b = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i5 + 17;
        b = i8 % 128;
        int i9 = i8 % 2;
        return charSequence;
    }

    public ColorStateList getTextColor(Context context, int i, int i2, int i3, boolean z, boolean z2) {
        int i4 = 2 % 2;
        int i5 = TuitionPaymentFragmentbindingInflater1;
        int i6 = i5 + 95;
        b = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i7 = i5 + 105;
        b = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    public void initialize(Context context) {
        int i = 2 % 2;
        int i2 = b + 87;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r5, short r6, short r7) {
        /*
            byte[] r0 = com.google.android.material.datepicker.DayViewDecorator.$$c
            int r6 = r6 * 3
            int r6 = 3 - r6
            int r5 = 120 - r5
            int r7 = r7 * 4
            int r1 = 1 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L16
            r4 = r7
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L22:
            int r6 = r6 + 1
            r4 = r0[r6]
            int r3 = r3 + 1
        L28:
            int r5 = r5 + r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.DayViewDecorator.$$g(byte, short, short):java.lang.String");
    }
}
