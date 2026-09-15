package com.google.android.material.elevation;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import defpackage.initSession;
import defpackage.setVideoStabilizationMode;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public enum SurfaceColors {
    SURFACE_0(R.dimen.m3_sys_elevation_level0),
    SURFACE_1(R.dimen.m3_sys_elevation_level1),
    SURFACE_2(R.dimen.m3_sys_elevation_level2),
    SURFACE_3(R.dimen.m3_sys_elevation_level3),
    SURFACE_4(R.dimen.m3_sys_elevation_level4),
    SURFACE_5(R.dimen.m3_sys_elevation_level5);

    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static char[] b;
    private final int elevationResId;
    private static final byte[] $$c = {58, -51, 54, -115};
    private static final int $$f = 17;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {46, 47, -18, 64, 20, 6, -55, 60, 22, 2, 17, 9, -1, 18, -63, 62, 5, 27, -11, 9, 15, 13, -2, 13, 13, 1, -49, 32, 52, -9, 14, 14, 0, 17, 14, -43, 58, -2, 10, -34, 42, 25, -3, 21, -9, -13, 25, 25, 10, -3, 2, 14, 15, -7, 21, 14, -41, 46, 19, -3, 25, -13, 17, 13, -3, 9, 15, -36, 51, -4, 26, 0, 0, 17, 14, -42, 47, 13, -2, 13, 13, 1, 41, -4, 19, -3, 14, 7, -22, 25, 32, -4, 0, 17, 14, -38, 52, -9, 14, 14, 0, 17, 14, 7, 5, -3, 6, 14, 0, 19, 5, 13, 6, 5, 13, -1, 7, 26, -5, 4, 26, -34, 42, -3, 9, 15, 0, 9, 9, 3, 28, -1, 16, -58};
    private static final int $$e = 236;
    private static final byte[] $$a = {83, -44, 103, 46, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 191;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 52
            int r8 = r8 + 4
            int r6 = r6 * 4
            int r6 = r6 + 84
            byte[] r0 = com.google.android.material.elevation.SurfaceColors.$$a
            int r7 = r7 * 15
            int r1 = r7 + 38
            byte[] r1 = new byte[r1]
            int r7 = r7 + 37
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L2e
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2e:
            int r6 = r6 + r8
            int r8 = r3 + 1
            int r6 = r6 + (-11)
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.elevation.SurfaceColors.a(byte, short, short, java.lang.Object[]):void");
    }

    private static void d(short s, int i, byte b2, Object[] objArr) {
        byte[] bArr = $$d;
        int i2 = (b2 * 78) + 4;
        int i3 = s * 26;
        int i4 = 99 - (i * 15);
        byte[] bArr2 = new byte[i3 + 53];
        int i5 = i3 + 52;
        int i6 = -1;
        if (bArr == null) {
            i2++;
            i4 = (i4 + i5) - 8;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i4;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                int i7 = bArr[i2];
                i2++;
                i4 = (i4 + i7) - 8;
            }
        }
    }

    public static SurfaceColors valueOf(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 115;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        SurfaceColors surfaceColors = (SurfaceColors) Enum.valueOf(SurfaceColors.class, str);
        if (i3 != 0) {
            throw null;
        }
        int i4 = TuitionPaymentFragmentbindingInflater1 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return surfaceColors;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static SurfaceColors[] valuesCustom() {
        SurfaceColors[] surfaceColorsArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            surfaceColorsArr = (SurfaceColors[]) values().clone();
            int i3 = 37 / 0;
        } else {
            surfaceColorsArr = (SurfaceColors[]) values().clone();
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 73;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return surfaceColorsArr;
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
        TuitionPaymentFragmentbindingInflater1();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i % 128;
        int i2 = i % 2;
    }

    SurfaceColors(int i) {
        this.elevationResId = i;
    }

    private static void c(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
        int i;
        int i2 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr2 = b;
        float f = 0.0f;
        if (cArr2 != null) {
            int i8 = $10 + 113;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
                i = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i = 0;
            }
            while (i < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr2[i]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) i3;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TypedValue.complexToFraction(i3, f, f) > f ? 1 : (TypedValue.complexToFraction(i3, f, f) == f ? 0 : -1)), View.getDefaultSize(i3, i3) + 1270, (KeyEvent.getMaxKeyCode() >> 16) + 18, 407021364, false, $$g(b2, b3, (byte) (b3 + 5)), new Class[]{Integer.TYPE});
                    }
                    cArr[i] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i++;
                    i3 = 0;
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr2, i4, cArr3, 0, i5);
        if (bArr != null) {
            int i9 = $10 + 1;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i5];
            setvideostabilizationmode.b = 0;
            char c = 0;
            while (setvideostabilizationmode.b < i5) {
                int i11 = $11 + 113;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i13 = $10 + 35;
                    $11 = i13 % 128;
                    if (i13 % 2 == 0) {
                        int i14 = setvideostabilizationmode.b;
                        Object[] objArr3 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 3225, 13 - ((Process.getThreadPriority(0) + 20) >> 6), 2133916302, false, $$g(b4, b5, (byte) (b5 | 6)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i14] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        throw null;
                    }
                    int i15 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 3226 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getTapTimeout() >> 16) + 13, 2133916302, false, $$g(b6, b7, (byte) (b7 | 6)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i15] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                } else {
                    int i16 = setvideostabilizationmode.b;
                    Object[] objArr5 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b8 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 29944), 1754 - TextUtils.lastIndexOf("", '0'), 23 - TextUtils.indexOf("", "", 0), 387247676, false, $$g(b8, b8, (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i16] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                }
                c = cArr4[setvideostabilizationmode.b];
                Object[] objArr6 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b9 = (byte) 0;
                    byte b10 = b9;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0') + 41242), Color.argb(0, 0, 0, 0) + 1705, 20 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -1434471773, false, $$g(b9, b10, b10), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i17 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i17, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i17);
            int i18 = $11 + 45;
            $10 = i18 % 128;
            int i19 = i18 % 2;
        }
        if (z) {
            char[] cArr6 = new char[i5];
            int i20 = 0;
            while (true) {
                setvideostabilizationmode.b = i20;
                if (setvideostabilizationmode.b >= i5) {
                    break;
                }
                cArr6[setvideostabilizationmode.b] = cArr3[(i5 - setvideostabilizationmode.b) - 1];
                i20 = setvideostabilizationmode.b + 1;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            int i21 = 0;
            while (true) {
                setvideostabilizationmode.b = i21;
                if (setvideostabilizationmode.b >= i5) {
                    break;
                }
                int i22 = $10 + 41;
                $11 = i22 % 128;
                int i23 = i22 % 2;
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                i21 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public final int getColor(Context context) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cNormalizeMetaState = (char) (43042 - KeyEvent.normalizeMetaState(0));
            int mode = 3111 - View.MeasureSpec.getMode(0);
            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 23;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            a(b2, bArr[132], b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cNormalizeMetaState, mode, packedPositionChild, -1272852037, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new int[]{0, 22, 197, 21}, false, new byte[]{1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new int[]{22, 15, 0, 0}, true, new byte[]{1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char absoluteGravity = (char) (43042 - Gravity.getAbsoluteGravity(0, 0));
            int iRgb = (-16774105) - Color.rgb(0, 0, 0);
            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22;
            byte[] bArr2 = $$a;
            byte b3 = bArr2[7];
            byte b4 = bArr2[132];
            Object[] objArr5 = new Object[1];
            a(b3, b4, b4, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(absoluteGravity, iRgb, minimumFlingVelocity, -1269618118, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char jumpTapTimeout = (char) (43042 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                int iRed = 3111 - Color.red(0);
                int i4 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 22;
                byte[] bArr3 = $$a;
                byte b5 = bArr3[7];
                Object[] objArr6 = new Object[1];
                a(b5, b5, bArr3[37], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(jumpTapTimeout, iRed, i4, 154975793, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i5 = ((int[]) objArr7[2])[0];
            int i6 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i5};
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = (((415866328 + ((~((-1083719833) | iIdentityHashCode)) * 623)) + (((~iIdentityHashCode) | 419825730) * (-623))) + (((~(iIdentityHashCode | 520568678)) | ((~((-1184462781) | iIdentityHashCode)) | 1083719832)) * 623)) - 535963435;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
            objArr = new Object[]{new int[1], new int[]{i6}, iArr, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            c(new int[]{37, 16, 181, 6}, true, null, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new int[]{53, 16, 0, 15}, true, new byte[]{0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0}, objArr9);
            try {
                Object[] objArr10 = {null, Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 0, -535963435};
                byte[] bArr4 = $$d;
                byte b6 = bArr4[25];
                byte b7 = bArr4[32];
                Object[] objArr11 = new Object[1];
                d(b6, b7, b7, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b8 = bArr4[32];
                byte b9 = bArr4[25];
                Object[] objArr12 = new Object[1];
                d(b8, b9, b9, objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c = (char) (43043 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                    int defaultSize = View.getDefaultSize(0, 0) + 3111;
                    int i10 = 23 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    byte[] bArr5 = $$a;
                    byte b10 = bArr5[7];
                    Object[] objArr14 = new Object[1];
                    a(b10, b10, bArr5[37], objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, defaultSize, i10, 154975793, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    c(new int[]{0, 22, 197, 21}, false, new byte[]{1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0}, objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    c(new int[]{22, 15, 0, 0}, true, new byte[]{1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cRgb = (char) ((-16734174) - Color.rgb(0, 0, 0));
                        int offsetBefore = 3111 - TextUtils.getOffsetBefore("", 0);
                        int mode2 = 22 - View.MeasureSpec.getMode(0);
                        byte[] bArr6 = $$a;
                        byte b11 = bArr6[7];
                        byte b12 = bArr6[132];
                        Object[] objArr17 = new Object[1];
                        a(b11, b12, b12, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cRgb, offsetBefore, mode2, -1269618118, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cLastIndexOf = (char) (43041 - TextUtils.lastIndexOf("", '0'));
                        int iIndexOf = 3110 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        int iResolveSize = 22 - View.resolveSize(0, 0);
                        byte[] bArr7 = $$a;
                        byte b13 = bArr7[7];
                        Object[] objArr18 = new Object[1];
                        a(b13, bArr7[132], b13, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cLastIndexOf, iIndexOf, iResolveSize, -1272852037, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr13;
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
        int i11 = ((int[]) objArr[1])[0];
        int i12 = ((int[]) objArr[2])[0];
        if (i12 != i11) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[3];
            if (strArr2 != null) {
                for (String str : strArr2) {
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i12));
        }
        int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 37;
        TuitionPaymentFragmentbindingInflater1 = i13 % 128;
        int i14 = i13 % 2;
        int i15 = ((int[]) objArr[0])[0];
        int i16 = ((int[]) objArr[2])[0];
        int i17 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[3];
        int[] iArr2 = {i16};
        int iMyUid = Process.myUid();
        int i18 = i15 + 1879698000 + (((~((-1019647167) | iMyUid)) | 683802660) * 345) + (((~((-1019647167) | (~iMyUid))) | 1581632) * 345) + ((~(iMyUid | (-683802661))) * 345);
        int i19 = (i18 << 13) ^ i18;
        int i20 = i19 ^ (i19 >>> 17);
        ((int[]) objArr[0])[0] = i20 ^ (i20 << 5);
        Object[] objArr19 = {new int[1], new int[]{i17}, iArr2, strArr3};
        int i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 45;
        TuitionPaymentFragmentbindingInflater1 = i21 % 128;
        int i22 = i21 % 2;
        return getColorForElevation(context, context.getResources().getDimension(this.elevationResId));
    }

    public static int getColorForElevation(Context context, float f) {
        int i = 2 % 2;
        int iCompositeOverlay = new ElevationOverlayProvider(context).compositeOverlay(MaterialColors.getColor(context, R.attr.colorSurface, 0), f);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 113;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        return iCompositeOverlay;
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        b = new char[]{59794, 59429, 59451, 59454, 59450, 59424, 59397, 59416, 59453, 59422, 59406, 59424, 59440, 59443, 59450, 59429, 59414, 59415, 59449, 59429, 59431, 59424, 59705, 59746, 59744, 59749, 59771, 59757, 59752, 59728, 59728, 59759, 59751, 59770, 59747, 59757, 59747, 59434, 59880, 59421, 59424, 59421, 59412, 59433, 59409, 59426, 59427, 59429, 59395, 59880, 59415, 59432, 59421, 59705, 59746, 59730, 59742, 59750, 59745, 59743, 59755, 59773, 59749, 59749, 59770, 59746, 59759, 59757, 59756};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r5, byte r6, short r7) {
        /*
            int r5 = r5 * 4
            int r0 = r5 + 1
            int r7 = 105 - r7
            byte[] r1 = com.google.android.material.elevation.SurfaceColors.$$c
            int r6 = r6 * 4
            int r6 = 3 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r4 = r5
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r5) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L20:
            int r3 = r3 + 1
            int r6 = r6 + 1
            r4 = r1[r6]
        L26:
            int r4 = -r4
            int r7 = r7 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.elevation.SurfaceColors.$$g(byte, byte, short):java.lang.String");
    }
}
