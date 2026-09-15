package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import defpackage.abortCapture;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes6.dex */
public class FadeThroughDrawable extends Drawable {
    private final float[] alphas;
    private final Drawable fadeInDrawable;
    private final Drawable fadeOutDrawable;
    private float progress;
    private static final byte[] $$c = {46, 126, -84, 108};
    private static final int $$d = 156;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {83, ByteCompanionObject.MIN_VALUE, -37, -48, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 70;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -8644373229695728926L;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r0 = 53 - r6
            int r7 = r7 * 14
            int r7 = 98 - r7
            int r5 = r5 * 52
            int r5 = r5 + 4
            byte[] r1 = com.google.android.material.internal.FadeThroughDrawable.$$a
            byte[] r0 = new byte[r0]
            int r6 = 52 - r6
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r5
            r7 = r6
            r3 = r2
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L25:
            int r3 = r3 + 1
            r4 = r1[r5]
        L29:
            int r5 = r5 + 1
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.FadeThroughDrawable.a(byte, byte, short, java.lang.Object[]):void");
    }

    public FadeThroughDrawable(Drawable drawable, Drawable drawable2) {
        this.fadeOutDrawable = drawable.getConstantState().newDrawable().mutate();
        Drawable drawableMutate = drawable2.getConstantState().newDrawable().mutate();
        this.fadeInDrawable = drawableMutate;
        drawableMutate.setAlpha(0);
        this.alphas = new float[2];
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 15;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.fadeOutDrawable.draw(canvas);
        this.fadeInDrawable.draw(canvas);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        while (abortcapture.b < cArrB.length) {
            int i3 = $11 + 79;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i5 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 64838), TextUtils.lastIndexOf("", '0', 0, 0) + 1357, 38 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 894276454, false, $$e(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 47772), 467 - TextUtils.lastIndexOf("", '0'), 13 - TextUtils.getOffsetBefore("", 0), 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i6 = $10 + 9;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) throws Throwable {
        Object[] objArr;
        int i5 = 2 % 2;
        int i6 = TuitionPaymentFragmentbindingInflater1 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
        int i7 = i6 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
            int iRed = Color.red(0) + 651;
            int iArgb = 44 - Color.argb(0, 0, 0, 0);
            byte[] bArr = $$a;
            byte b = bArr[7];
            Object[] objArr2 = new Object[1];
            a(b, b, bArr[80], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iRed, iArgb, -459846511, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        b(new char[]{40562, 63756, 40467, 60331, 50743, 4582, 15047, 32713, 15373, 29681, 39127, 40325, 55869, 54747, 65197, 15304, 30779, 14283, 23783, 23022, 5727, 35211, 45711, 34708, 46145, 60339}, ViewConfiguration.getScrollBarSize() >> 8, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b(new char[]{4386, 29472, 4423, 18831, 19108, 39880, 39142, 62296, 45889, 63953, 15091, 4458, 21863, 24549, 23755, 46972, 63355, 48633, 65234}, Process.getGidForName("") + 1, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cRgb = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
            int i8 = 652 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int defaultSize = View.getDefaultSize(0, 0) + 44;
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            a(bArr2[80], (byte) 52, bArr2[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRgb, i8, defaultSize, -873460649, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                int i9 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 651;
                int touchSlop = 44 - (ViewConfiguration.getTouchSlop() >> 8);
                byte b2 = $$a[80];
                byte b3 = b2;
                Object[] objArr6 = new Object[1];
                a(b3, (byte) (b3 | 14), b2, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, i9, touchSlop, -1595579076, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i10 = ((int[]) objArr7[2])[0];
            int i11 = ((int[]) objArr7[0])[0];
            int iMyTid = Process.myTid();
            int i12 = (-1764597761) + (((~((-336590148) | iMyTid)) | 333159337) * (-318));
            int i13 = ~(333159337 | iMyTid);
            int i14 = ~iMyTid;
            int i15 = i12 + ((i13 | (~((-63965865) | i14))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(iMyTid | (-63965865))) | (~(400556011 | i14))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + 2003946494;
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr[3])[0] = i17 ^ (i17 << 5);
        } else {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) TextUtils.getTrimmedLength(""), 1610 - (ViewConfiguration.getTapTimeout() >> 16), 26 - TextUtils.indexOf("", "", 0), 2145681644, false, null, new Class[0]);
                }
                Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), 2003946494, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 651;
                    int mode = 44 - View.MeasureSpec.getMode(0);
                    byte[] bArr3 = $$a;
                    Object[] objArr9 = new Object[1];
                    a(bArr3[80], (byte) 52, bArr3[7], objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveOpacity, packedPositionGroup, mode, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) View.resolveSizeAndState(0, 0, 0), 695 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (KeyEvent.getMaxKeyCode() >> 16) + 98), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.indexOf((CharSequence) "", '0') + 63407), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 793, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 83), Integer.TYPE, Integer.TYPE});
                }
                Object[] objArr10 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 651;
                    int iArgb2 = 44 - Color.argb(0, 0, 0, 0);
                    byte b4 = $$a[80];
                    byte b5 = b4;
                    Object[] objArr11 = new Object[1];
                    a(b5, (byte) (b5 | 14), b4, objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, maximumDrawingCacheSize, iArgb2, -1595579076, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr10);
                try {
                    Object[] objArr12 = new Object[1];
                    b(new char[]{40562, 63756, 40467, 60331, 50743, 4582, 15047, 32713, 15373, 29681, 39127, 40325, 55869, 54747, 65197, 15304, 30779, 14283, 23783, 23022, 5727, 35211, 45711, 34708, 46145, 60339}, TextUtils.lastIndexOf("", '0', 0) + 1, objArr12);
                    Class<?> cls2 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    b(new char[]{4386, 29472, 4423, 18831, 19108, 39880, 39142, 62296, 45889, 63953, 15091, 4458, 21863, 24549, 23755, 46972, 63355, 48633, 65234}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr13);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char gidForName = (char) ((-1) - Process.getGidForName(""));
                        int maximumDrawingCacheSize2 = 651 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int iGreen = 44 - Color.green(0);
                        byte[] bArr4 = $$a;
                        Object[] objArr14 = new Object[1];
                        a(bArr4[80], (byte) 52, bArr4[7], objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(gidForName, maximumDrawingCacheSize2, iGreen, -873460649, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int iRgb = Color.rgb(0, 0, 0) + 16777867;
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 45;
                        byte[] bArr5 = $$a;
                        byte b6 = bArr5[7];
                        Object[] objArr15 = new Object[1];
                        a(b6, b6, bArr5[80], objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(jumpTapTimeout, iRgb, iLastIndexOf, -459846511, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    objArr = objArr10;
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
        int i18 = ((int[]) objArr[0])[0];
        int i19 = ((int[]) objArr[2])[0];
        if (i19 != i18) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[1];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i19 / (((i19 - 1) * i19) % 2), 0).show();
            Object[] objArr16 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i20 = ((int[]) objArr[3])[0];
            int i21 = ((int[]) objArr[2])[0];
            int i22 = ((int[]) objArr[0])[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i23 = i20 + 1872714389 + (((~((-2361481) | iIdentityHashCode)) | 5792290) * (-756)) + (((~iIdentityHashCode) | (-2361481)) * 756);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr16[3])[0] = i25 ^ (i25 << 5);
        } else {
            int i26 = TuitionPaymentFragmentbindingInflater1 + 71;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i26 % 128;
            int i27 = i26 % 2;
            Object[] objArr17 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i28 = ((int[]) objArr[3])[0];
            int i29 = ((int[]) objArr[2])[0];
            int i30 = ((int[]) objArr[0])[0];
            int iMyUid = Process.myUid();
            int i31 = ~iMyUid;
            int i32 = i28 + (-1666153953) + (((~((-294422783) | i31)) | (~(iMyUid | (-290991973)))) * 333) + (((~(iMyUid | (-294422783))) | (~(i31 | (-290991973)))) * 333);
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArr17[3])[0] = i34 ^ (i34 << 5);
        }
        super.setBounds(i, i2, i3, i4);
        this.fadeOutDrawable.setBounds(i, i2, i3, i4);
        this.fadeInDrawable.setBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int iMax;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            iMax = Math.max(this.fadeOutDrawable.getIntrinsicWidth(), this.fadeInDrawable.getIntrinsicWidth());
            int i3 = 73 / 0;
        } else {
            iMax = Math.max(this.fadeOutDrawable.getIntrinsicWidth(), this.fadeInDrawable.getIntrinsicWidth());
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 93;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            return iMax;
        }
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        int intrinsicHeight = this.fadeOutDrawable.getIntrinsicHeight();
        if (i3 == 0) {
            return Math.max(intrinsicHeight, this.fadeInDrawable.getIntrinsicHeight());
        }
        int i4 = 72 / 0;
        return Math.max(intrinsicHeight, this.fadeInDrawable.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 75;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        int iMax = Math.max(this.fadeOutDrawable.getMinimumWidth(), this.fadeInDrawable.getMinimumWidth());
        int i4 = TuitionPaymentFragmentbindingInflater1 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return iMax;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 67;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            Math.max(this.fadeOutDrawable.getMinimumHeight(), this.fadeInDrawable.getMinimumHeight());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iMax = Math.max(this.fadeOutDrawable.getMinimumHeight(), this.fadeInDrawable.getMinimumHeight());
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 121;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 17 / 0;
        }
        return iMax;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        int i2 = 2 % 2;
        if (this.progress > 0.5f) {
            this.fadeOutDrawable.setAlpha(0);
            this.fadeInDrawable.setAlpha(i);
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 91;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            int i4 = i3 % 2;
        } else {
            int i5 = TuitionPaymentFragmentbindingInflater1 + 27;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
            this.fadeOutDrawable.setAlpha(i);
            this.fadeInDrawable.setAlpha(0);
        }
        invalidateSelf();
        int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 3;
        TuitionPaymentFragmentbindingInflater1 = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 95;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            this.fadeOutDrawable.setColorFilter(colorFilter);
            this.fadeInDrawable.setColorFilter(colorFilter);
            invalidateSelf();
            int i3 = 64 / 0;
        } else {
            this.fadeOutDrawable.setColorFilter(colorFilter);
            this.fadeInDrawable.setColorFilter(colorFilter);
            invalidateSelf();
        }
        int i4 = TuitionPaymentFragmentbindingInflater1 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 81 / 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 79;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            this.fadeOutDrawable.isStateful();
            throw null;
        }
        if (this.fadeOutDrawable.isStateful()) {
            return true;
        }
        int i3 = TuitionPaymentFragmentbindingInflater1 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        return this.fadeInDrawable.isStateful();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0031 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:9:0x002f A[DONT_INVERT, PHI: r5
  0x002f: PHI (r5v2 boolean) = (r5v1 boolean), (r5v8 boolean) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        boolean state;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            boolean state2 = this.fadeOutDrawable.setState(iArr);
            state = this.fadeInDrawable.setState(iArr);
            int i3 = 23 / 0;
            if (!state2) {
                if (!state) {
                    return false;
                }
            }
        } else {
            boolean state3 = this.fadeOutDrawable.setState(iArr);
            state = this.fadeInDrawable.setState(iArr);
            if (!state3) {
                if (!state) {
                    return false;
                }
            }
        }
        int i4 = TuitionPaymentFragmentbindingInflater1 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public void setProgress(float f) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 23;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this.progress != f) {
            this.progress = f;
            FadeThroughUtils.calculateFadeOutAndInAlphas(f, this.alphas);
            this.fadeOutDrawable.setAlpha((int) (this.alphas[0] * 255.0f));
            this.fadeInDrawable.setAlpha((int) (this.alphas[1] * 255.0f));
            invalidateSelf();
            int i3 = TuitionPaymentFragmentbindingInflater1 + 103;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 13;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 79;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2 != 0 ? 82 : -3;
        int i5 = i3 + 125;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(int r6, int r7, byte r8) {
        /*
            int r8 = r8 * 2
            int r8 = r8 + 107
            int r6 = r6 * 2
            int r6 = 4 - r6
            byte[] r0 = com.google.android.material.internal.FadeThroughDrawable.$$c
            int r7 = r7 * 3
            int r7 = r7 + 1
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r6
            goto L27
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r6]
        L27:
            int r6 = r6 + 1
            int r8 = r8 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.FadeThroughDrawable.$$e(int, int, byte):java.lang.String");
    }
}
