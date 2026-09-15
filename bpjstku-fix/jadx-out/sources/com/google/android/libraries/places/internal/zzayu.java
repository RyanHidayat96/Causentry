package com.google.android.libraries.places.internal;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import defpackage.initSession;
import defpackage.setVideoStabilizationMode;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzayu implements zzayw {
    private static final byte[] $$c = {123, -2, -101, -104};
    private static final int $$f = 91;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {104, 27, -72, 120, -14, 0, Base64.padSymbol, -59, -10, -2, 6, -7, 5, 53, -53, -15, 8, -16, 1, 4, 3, 52, -65, 10, -21, 13, -15, 7, 6, -13, 60, -53, -17, -2, 12, -1, -19, 66, -28, -31, 2, -5, -3, -15, 46, -37, -5, 5, -23, 11, -8, -5};
    private static final int $$e = 23;
    private static final byte[] $$a = {109, 84, -87, -114, 23, -37, 42, 11, -10, 18, -7, 0, 7, 7, 23, -44, 44, 10, -5, 6, 18};
    private static final int $$b = 119;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int b = 1;
    private static char[] TuitionPaymentFragmentbindingInflater1 = {59731, 59848, 59874, 59890, 59901, 59876, 59879, 59856, 59857, 59899, 59879, 59873, 59874, 59873, 59879, 59877, 59896, 59876, 59874, 59847, 59866, 59903, 59705, 59746, 59744, 59749, 59771, 59757, 59752, 59728, 59728, 59759, 59751, 59770, 59747, 59757, 59747, 59757, 59852, 59846, 59846, 59810, 59812, 59843, 59842, 59847, 59815, 59817, 59843, 59859, 59870, 59845, 59840, 59727, 59801, 59806, 59766, 59786, 59802, 59783, 59780, 59781, 59783, 59802, 59794, 59805, 59805, 59797, 59779};

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.google.android.libraries.places.internal.zzayu.$$a
            int r9 = r9 + 1
            int r7 = r7 * 3
            int r7 = r7 + 97
            int r8 = r8 * 10
            int r8 = 13 - r8
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r7 = r9
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r9) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L2c:
            int r7 = r7 + r8
            int r7 = r7 + (-5)
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzayu.a(int, byte, byte, java.lang.Object[]):void");
    }

    private static void d(short s, short s2, int i, Object[] objArr) {
        int i2 = 99 - s2;
        int i3 = i + 4;
        byte[] bArr = $$d;
        int i4 = s * 48;
        byte[] bArr2 = new byte[49 - i4];
        int i5 = 48 - i4;
        int i6 = -1;
        if (bArr == null) {
            i2 = (i5 + (-i3)) - 2;
            i3 = i3;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            int i8 = i3 + 1;
            bArr2[i7] = (byte) i2;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i2 = (i2 + (-bArr[i8])) - 2;
                i3 = i8;
                i6 = i7;
            }
        }
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 69;
        b = i2 % 128;
        int i3 = i2 % 2;
        Byte bValueOf = Byte.valueOf(zza());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return bValueOf;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void c(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = TuitionPaymentFragmentbindingInflater1;
        if (cArr != null) {
            int i8 = $11 + 115;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i10 = 0;
            while (i10 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr[i10]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(i3, i3) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i3, i3) == 0L ? 0 : -1)));
                        int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1270;
                        int jumpTapTimeout = 18 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        byte b2 = (byte) ($$f & 5);
                        byte b3 = (byte) (b2 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, doubleTapTimeout, jumpTapTimeout, 407021364, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr2[i10] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i10++;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i4, cArr3, 0, i5);
        if (bArr != null) {
            int i11 = $11 + 67;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            char[] cArr4 = new char[i5];
            setvideostabilizationmode.b = 0;
            char c2 = 0;
            while (setvideostabilizationmode.b < i5) {
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i13 = $11 + 69;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    int i15 = setvideostabilizationmode.b;
                    Object[] objArr3 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - MotionEvent.axisFromString("")), TextUtils.indexOf((CharSequence) "", '0', 0) + 3226, 13 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 2133916302, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i15] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                } else {
                    int i16 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cAxisFromString = (char) (MotionEvent.axisFromString("") + 29945);
                        int iGreen = 1755 - Color.green(0);
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 24;
                        byte b6 = (byte) (-$$c[1]);
                        byte b7 = (byte) (b6 - 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cAxisFromString, iGreen, iIndexOf, 387247676, false, $$g(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i16] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[setvideostabilizationmode.b];
                try {
                    Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b8 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Gravity.getAbsoluteGravity(0, 0) + 41241), KeyEvent.getDeadChar(0, 0) + 1705, 21 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -1434471773, false, $$g((byte) 6, b8, b8), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            int i17 = $10 + 63;
            $11 = i17 % 128;
            int i18 = i17 % 2;
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            i = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i19 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i19, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i19);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i5];
            while (true) {
                setvideostabilizationmode.b = i;
                if (setvideostabilizationmode.b >= i5) {
                    break;
                }
                int i20 = $11 + 33;
                $10 = i20 % 128;
                int i21 = i20 % 2;
                cArr6[setvideostabilizationmode.b] = cArr3[(i5 - setvideostabilizationmode.b) - 1];
                i = setvideostabilizationmode.b + 1;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            int i22 = $10 + 11;
            $11 = i22 % 128;
            if (i22 % 2 == 0) {
                setvideostabilizationmode.b = 1;
            } else {
                setvideostabilizationmode.b = 0;
            }
            while (setvideostabilizationmode.b < i5) {
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                setvideostabilizationmode.b++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    @Override // java.util.Iterator
    public final void remove() throws Throwable {
        Object[] objArr;
        char c = 2;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 877;
            int iLastIndexOf2 = 9 - TextUtils.lastIndexOf("", '0', 0);
            byte[] bArr = $$a;
            byte b2 = bArr[11];
            Object[] objArr2 = new Object[1];
            a(b2, (byte) (b2 + 1), bArr[17], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, iLastIndexOf, iLastIndexOf2, -1199417970, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new int[]{0, 22, 131, 12}, false, new byte[]{1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new int[]{22, 15, 0, 0}, true, new byte[]{1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
            int iNormalizeMetaState = 876 - KeyEvent.normalizeMetaState(0);
            int i3 = 11 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            byte b3 = (byte) ($$b & 1);
            byte b4 = $$a[11];
            Object[] objArr5 = new Object[1];
            a(b3, b4, b4, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(touchSlop, iNormalizeMetaState, i3, 254769921, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = b + 23;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int scrollBarFadeDuration = 876 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int doubleTapTimeout = 10 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                byte[] bArr2 = $$a;
                byte b5 = bArr2[11];
                Object[] objArr6 = new Object[1];
                a(b5, b5, bArr2[12], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumFlingVelocity, scrollBarFadeDuration, doubleTapTimeout, 1324201839, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = (((-208210156) + (((~((-719185853) | iIdentityHashCode)) | 42542616) * 1504)) + ((~(iIdentityHashCode | (-676643237))) * (-1504))) - 1847926668;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[1])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new int[]{37, 16, 98, 0}, false, new byte[]{0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new int[]{53, 16, 40, 7}, false, new byte[]{1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1}, objArr9);
            try {
                Object[] objArr10 = {Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 1758105268};
                byte[] bArr3 = $$d;
                byte b6 = bArr3[5];
                Object[] objArr11 = new Object[1];
                d(b6, b6, bArr3[35], objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b7 = bArr3[18];
                byte b8 = b7;
                Object[] objArr12 = new Object[1];
                d(b7, b8, (byte) (b8 | 46), objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                    int jumpTapTimeout = 876 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int i9 = 10 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    byte[] bArr4 = $$a;
                    byte b9 = bArr4[11];
                    Object[] objArr14 = new Object[1];
                    a(b9, b9, bArr4[12], objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveSizeAndState, jumpTapTimeout, i9, 1324201839, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    c(new int[]{0, 22, 131, 12}, false, new byte[]{1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0}, objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    c(new int[]{22, 15, 0, 0}, true, new byte[]{1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char touchSlop2 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                        int packedPositionType = 876 - ExpandableListView.getPackedPositionType(0L);
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 10;
                        byte b10 = (byte) ($$b & 1);
                        byte b11 = $$a[11];
                        Object[] objArr17 = new Object[1];
                        a(b10, b11, b11, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(touchSlop2, packedPositionType, fadingEdgeLength, 254769921, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int bitsPerPixel = 875 - ImageFormat.getBitsPerPixel(0);
                        int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 10;
                        byte[] bArr5 = $$a;
                        byte b12 = bArr5[11];
                        Object[] objArr18 = new Object[1];
                        a(b12, (byte) (b12 + 1), bArr5[17], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollDefaultDelay, bitsPerPixel, jumpTapTimeout2, -1199417970, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr13;
                    c = 2;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (((int[]) objArr[0])[0] == ((int[]) objArr[c])[0]) {
            int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
            b = i10 % 128;
            int i11 = i10 % 2;
            int i12 = ((int[]) objArr[1])[0];
            Object[] objArr19 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i13 = i12 + ((~(iIdentityHashCode2 | (-56995441))) * TypedValues.CycleType.TYPE_EASING) + 777696 + (((~((~iIdentityHashCode2) | (-56995441))) | 76038149) * TypedValues.CycleType.TYPE_EASING);
            int i14 = (i13 << 13) ^ i13;
            int i15 = i14 ^ (i14 >>> 17);
            ((int[]) objArr19[1])[0] = i15 ^ (i15 << 5);
            throw new UnsupportedOperationException();
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = (String[]) objArr[3];
        if (strArr == null) {
            throw null;
        }
        int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
        b = i16 % 128;
        int i17 = 2;
        int i18 = i16 % 2;
        while (i2 < strArr.length) {
            int i19 = b + 55;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19 % 128;
            if (i19 % i17 != 0) {
                arrayList.add(strArr[i2]);
                i2 += 106;
            } else {
                arrayList.add(strArr[i2]);
                i2++;
            }
            i17 = 2;
        }
        throw null;
    }

    zzayu() {
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, byte r7, byte r8) {
        /*
            byte[] r0 = com.google.android.libraries.places.internal.zzayu.$$c
            int r6 = r6 + 99
            int r7 = r7 * 3
            int r7 = 4 - r7
            int r8 = r8 * 3
            int r1 = 1 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L17
            r3 = r7
            r7 = r8
            r4 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r3 = r3 + 1
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzayu.$$g(short, byte, byte):java.lang.String");
    }
}
