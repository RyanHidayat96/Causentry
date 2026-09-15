package com.google.android.material.elevation;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialAttributes;
import defpackage.initSession;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public class ElevationOverlayProvider {
    private static final float FORMULA_MULTIPLIER = 4.5f;
    private static final float FORMULA_OFFSET = 2.0f;
    private static final int OVERLAY_ACCENT_COLOR_ALPHA;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final int colorSurface;
    private final float displayDensity;
    private final int elevationOverlayAccentColor;
    private final int elevationOverlayColor;
    private final boolean elevationOverlayEnabled;
    private static final byte[] $$c = {21, -108, 100, 114};
    private static final int $$f = 34;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {83, ByteCompanionObject.MIN_VALUE, -37, -48, -20, -6, 55, -60, -22, -2, -17, -9, 1, -18, 63, -62, -5, -27, 11, 43, -62, -9, -25, 5, -2, -10, -5, -15, -13, 2, -13, -13, -1, 49, -30, -41, -25, 5, -2, -10, 27, -47, -13, 2, -13, -13, -1, 27, -37, -27, 11, 6, -41, -3, -11, 5, 57, -8, -41, -59, -4, 7, -21, -4, 5, -19, 17, -46, 3, -14, 4, -5, -23, 3, -2, 15, -29, -20, 3, -10, -5, 39, -41, 4, -19, 3, -14, -7, 22, -25, -32, 4, 0, -17, -14, 38, -52, 9, -14, -14, 0, -17, -14, 10, -15, -13, 2, -13, -13, -1, 22, -45, 0, -14, 3, -27, 7, -21, 57};
    private static final int $$e = 14;
    private static final byte[] $$a = {29, -5, -24, -13, -23, 37, -42, -11, 10, -18, 7, 0, -7, -7, -23, 44, -44, -10, 5, -6, -18};
    private static final int $$b = 84;
    private static int b = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.android.material.elevation.ElevationOverlayProvider.$$a
            int r8 = r8 + 1
            int r7 = r7 * 3
            int r7 = r7 + 97
            int r6 = r6 * 10
            int r6 = 14 - r6
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r4 = r2
            r7 = r6
            goto L27
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r0[r6]
        L27:
            int r3 = -r3
            int r6 = r6 + 1
            int r7 = r7 + r3
            int r7 = r7 + (-5)
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.elevation.ElevationOverlayProvider.a(byte, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.google.android.material.elevation.ElevationOverlayProvider.$$d
            int r7 = r7 * 15
            int r7 = 99 - r7
            int r5 = r5 * 78
            int r5 = r5 + 4
            int r6 = r6 * 41
            int r1 = r6 + 38
            byte[] r1 = new byte[r1]
            int r6 = r6 + 37
            r2 = 0
            if (r0 != 0) goto L19
            r7 = r5
            r4 = r6
            r3 = r2
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r5]
        L2b:
            int r5 = r5 + 1
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-8)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.elevation.ElevationOverlayProvider.d(int, short, short, java.lang.Object[]):void");
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        b();
        OVERLAY_ACCENT_COLOR_ALPHA = (int) Math.round(5.1000000000000005d);
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
        int i2 = i % 2;
    }

    public ElevationOverlayProvider(Context context) {
        this(MaterialAttributes.resolveBoolean(context, R.attr.elevationOverlayEnabled, false), MaterialColors.getColor(context, R.attr.elevationOverlayColor, 0), MaterialColors.getColor(context, R.attr.elevationOverlayAccentColor, 0), MaterialColors.getColor(context, R.attr.colorSurface, 0), context.getResources().getDisplayMetrics().density);
    }

    public ElevationOverlayProvider(boolean z, int i, int i2, int i3, float f) {
        this.elevationOverlayEnabled = z;
        this.elevationOverlayColor = i;
        this.elevationOverlayAccentColor = i2;
        this.colorSurface = i3;
        this.displayDensity = f;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x016d  */
    /* JADX WARN: Code duplicated, block: B:33:0x016e  */
    private static void c(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (true) {
            i4 = 29209604;
            if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i2) {
                break;
            }
            int i6 = $11 + 123;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i8 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.indexOf("", "", 0), 3291 - Gravity.getAbsoluteGravity(0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31, 1199271174, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getTouchSlop() >> 8) + 651, 44 - ((Process.getThreadPriority(0) + 20) >> 6), -450685997, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i9 = $10 + 63;
                $11 = i9 % 128;
                int i10 = i9 % 2;
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
            int i11 = $11 + 67;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 651, Process.getGidForName("") + 45, -450685997, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                i4 = 29209604;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f, View view) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        float parentAbsoluteElevation = getParentAbsoluteElevation(view);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
            int iIndexOf = 875 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            int i2 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 10;
            byte[] bArr = $$a;
            byte b2 = bArr[11];
            Object[] objArr2 = new Object[1];
            a((byte) (b2 + 1), b2, bArr[8], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetAfter, iIndexOf, i2, -1199417970, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(false, 290 - Color.red(0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 22, 17 - View.combineMeasuredStates(0, 0), new char[]{6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f'}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(false, 293 - TextUtils.lastIndexOf("", '0'), (ViewConfiguration.getLongPressTimeout() >> 16) + 15, (ViewConfiguration.getEdgeSlop() >> 16) + 11, new char[]{'\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t'}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char modifierMetaStateMask = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
            int iRed = Color.red(0) + 876;
            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 10;
            byte b3 = $$a[11];
            byte b4 = b3;
            Object[] objArr5 = new Object[1];
            a(b4, (byte) (b4 + 1), b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(modifierMetaStateMask, iRed, maximumDrawingCacheSize, 254769921, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 876;
                int i3 = 10 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                byte[] bArr2 = $$a;
                byte b5 = bArr2[11];
                Object[] objArr6 = new Object[1];
                a(b5, b5, bArr2[10], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(pressedStateDuration, edgeSlop, i3, 1324201839, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int i4 = ~((int) Runtime.getRuntime().maxMemory());
            int i5 = ~(323580203 | i4);
            int i6 = (((1487274352 + ((i5 | (-283269975)) * 764)) + (((~(i4 | (-283269975))) | 272650498) * (-1528))) + (((-61549182) | i5) * 764)) - 1479951203;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[1])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(false, 289 - (Process.myPid() >> 22), 16 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 11 - ExpandableListView.getPackedPositionType(0L), new char[]{'\n', 65535, '\f', 5, 65484, 65521, 23, 17, 18, 3, 11, '\b', 65535, 20, 65535, 65484}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(false, Color.alpha(0) + 293, 16 - (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.getOffsetBefore("", 0) + 6, new char[]{'\r', 2, 65501, '\t', 65534, 65535, 3, 65534, 65535, '\b', 14, 3, 14, 19, 65506, 65531}, objArr9);
            try {
                Object[] objArr10 = {Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), -1479951203};
                byte[] bArr3 = $$d;
                byte b6 = bArr3[92];
                Object[] objArr11 = new Object[1];
                d(b6, bArr3[12], b6, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b7 = bArr3[12];
                Object[] objArr12 = new Object[1];
                d(b7, bArr3[92], b7, objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cArgb = (char) Color.argb(0, 0, 0, 0);
                    int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 877;
                    int iIndexOf3 = 10 - TextUtils.indexOf("", "", 0, 0);
                    byte[] bArr4 = $$a;
                    byte b8 = bArr4[11];
                    Object[] objArr14 = new Object[1];
                    a(b8, b8, bArr4[10], objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cArgb, iIndexOf2, iIndexOf3, 1324201839, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    c(false, 290 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 22 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 18 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), new char[]{6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f'}, objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    c(false, TextUtils.indexOf((CharSequence) "", '0') + 295, TextUtils.indexOf("", "") + 15, 11 - ExpandableListView.getPackedPositionType(0L), new char[]{'\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t'}, objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int longPressTimeout = 876 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        int iGreen = Color.green(0) + 10;
                        byte b9 = $$a[11];
                        byte b10 = b9;
                        Object[] objArr17 = new Object[1];
                        a(b10, (byte) (b10 + 1), b9, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, longPressTimeout, iGreen, 254769921, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cMyPid = (char) (Process.myPid() >> 22);
                        int i9 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 876;
                        int iAlpha = Color.alpha(0) + 10;
                        byte[] bArr5 = $$a;
                        byte b11 = bArr5[11];
                        Object[] objArr18 = new Object[1];
                        a((byte) (b11 + 1), b11, bArr5[8], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMyPid, i9, iAlpha, -1199417970, false, (String) objArr18[0], null);
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
        int i10 = ((int[]) objArr[2])[0];
        int i11 = ((int[]) objArr[0])[0];
        if (i11 == i10) {
            int i12 = ((int[]) objArr[1])[0];
            Object[] objArr19 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iNextInt = new Random().nextInt(1043832622);
            int i13 = ~iNextInt;
            int i14 = i12 + (-1138902774) + (((~((-748136335) | i13)) | 748070146) * (-108)) + (((~(i13 | 788446563)) | (~((-788446564) | iNextInt)) | (-788512752)) * 54) + ((iNextInt | (-788512752)) * 54);
            int i15 = (i14 << 13) ^ i14;
            int i16 = i15 ^ (i15 >>> 17);
            ((int[]) objArr19[1])[0] = i16 ^ (i16 << 5);
            int i17 = TuitionPaymentFragmentbindingInflater1 + 33;
            b = i17 % 128;
            int i18 = i17 % 2;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr != null) {
                int i19 = b + 123;
                TuitionPaymentFragmentbindingInflater1 = i19 % 128;
                int i20 = i19 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i11 / (((i11 - 1) * i11) % 2), 0).show();
            int i21 = ((int[]) objArr[1])[0];
            Object[] objArr20 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int i22 = ~Process.myTid();
            int i23 = i21 + (-1887494584) + (((-147733) | i22) * 494) + (((~(i22 | (-516641184))) | 1073297131) * 494);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr20[1])[0] = i25 ^ (i25 << 5);
        }
        int iCompositeOverlayWithThemeSurfaceColorIfNeeded = compositeOverlayWithThemeSurfaceColorIfNeeded(f + parentAbsoluteElevation);
        int i26 = TuitionPaymentFragmentbindingInflater1 + 95;
        b = i26 % 128;
        int i27 = i26 % 2;
        return iCompositeOverlayWithThemeSurfaceColorIfNeeded;
    }

    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 105;
        b = i2 % 128;
        int i3 = i2 % 2;
        int iCompositeOverlayIfNeeded = compositeOverlayIfNeeded(this.colorSurface, f);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 61;
        b = i4 % 128;
        int i5 = i4 % 2;
        return iCompositeOverlayIfNeeded;
    }

    public int compositeOverlayIfNeeded(int i, float f, View view) {
        int i2 = 2 % 2;
        int i3 = b + 61;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        return compositeOverlayIfNeeded(i, f + (i3 % 2 == 0 ? getParentAbsoluteElevation(view) : getParentAbsoluteElevation(view)));
    }

    public int compositeOverlayIfNeeded(int i, float f) {
        int i2 = 2 % 2;
        if (!this.elevationOverlayEnabled) {
            return i;
        }
        int i3 = TuitionPaymentFragmentbindingInflater1 + 31;
        b = i3 % 128;
        int i4 = i3 % 2;
        if (!isThemeSurfaceColor(i)) {
            return i;
        }
        int i5 = TuitionPaymentFragmentbindingInflater1 + 117;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return compositeOverlay(i, f);
        }
        compositeOverlay(i, f);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int compositeOverlay(int i, float f, View view) {
        int i2 = 2 % 2;
        int i3 = b + 63;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        int iCompositeOverlay = compositeOverlay(i, f + getParentAbsoluteElevation(view));
        int i5 = TuitionPaymentFragmentbindingInflater1 + 25;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return iCompositeOverlay;
        }
        throw null;
    }

    public int compositeOverlay(int i, float f) {
        int i2 = 2 % 2;
        float fCalculateOverlayAlphaFraction = calculateOverlayAlphaFraction(f);
        int iAlpha = Color.alpha(i);
        int iLayer = MaterialColors.layer(ColorUtils.setAlphaComponent(i, 255), this.elevationOverlayColor, fCalculateOverlayAlphaFraction);
        if (fCalculateOverlayAlphaFraction > 0.0f) {
            int i3 = TuitionPaymentFragmentbindingInflater1 + 23;
            b = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = this.elevationOverlayAccentColor;
                if (i4 != 0) {
                    iLayer = MaterialColors.layer(iLayer, ColorUtils.setAlphaComponent(i4, OVERLAY_ACCENT_COLOR_ALPHA));
                }
            } else {
                throw null;
            }
        }
        int alphaComponent = ColorUtils.setAlphaComponent(iLayer, iAlpha);
        int i5 = b + 95;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return alphaComponent;
    }

    public int calculateOverlayAlpha(float f) {
        int i = 2 % 2;
        int i2 = b + 51;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        float fCalculateOverlayAlphaFraction = calculateOverlayAlphaFraction(f);
        int iRound = Math.round(i3 == 0 ? fCalculateOverlayAlphaFraction - 255.0f : fCalculateOverlayAlphaFraction * 255.0f);
        int i4 = b + 123;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 65 / 0;
        }
        return iRound;
    }

    public float calculateOverlayAlphaFraction(float f) {
        int i = 2 % 2;
        int i2 = b + 1;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        float f2 = this.displayDensity;
        if (f2 <= 0.0f || f <= 0.0f) {
            return 0.0f;
        }
        float fMin = Math.min(((((float) Math.log1p(f / f2)) * FORMULA_MULTIPLIER) + 2.0f) / 100.0f, 1.0f);
        int i4 = b + 55;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return fMin;
    }

    public boolean isThemeElevationOverlayEnabled() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 117;
        b = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.elevationOverlayEnabled;
        int i5 = i2 + 105;
        b = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public int getThemeElevationOverlayColor() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 53;
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.elevationOverlayColor;
        int i6 = i2 + 71;
        b = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public int getThemeSurfaceColor() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 115;
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.colorSurface;
        int i6 = i2 + 111;
        b = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public float getParentAbsoluteElevation(View view) {
        int i = 2 % 2;
        int i2 = b + 33;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            ViewUtils.getParentAbsoluteElevation(view);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float parentAbsoluteElevation = ViewUtils.getParentAbsoluteElevation(view);
        int i3 = TuitionPaymentFragmentbindingInflater1 + 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        return parentAbsoluteElevation;
    }

    private boolean isThemeSurfaceColor(int i) {
        int i2 = 2 % 2;
        int i3 = b + 71;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        if (ColorUtils.setAlphaComponent(i, 255) != this.colorSurface) {
            return false;
        }
        int i5 = TuitionPaymentFragmentbindingInflater1 + 99;
        b = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    static void b() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -83722275;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r7, short r8, int r9) {
        /*
            int r9 = r9 * 4
            int r9 = 4 - r9
            int r7 = r7 * 2
            int r7 = r7 + 1
            int r8 = 120 - r8
            byte[] r0 = com.google.android.material.elevation.ElevationOverlayProvider.$$c
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r9
            r4 = r2
            goto L2a
        L14:
            r3 = r2
            r6 = r9
            r9 = r8
            r8 = r6
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L2a:
            int r8 = -r8
            int r9 = r9 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.elevation.ElevationOverlayProvider.$$g(short, short, int):java.lang.String");
    }
}
