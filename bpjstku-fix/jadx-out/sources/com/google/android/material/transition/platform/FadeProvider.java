package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class FadeProvider implements VisibilityAnimatorProvider {
    private float incomingEndThreshold = 1.0f;

    public final float getIncomingEndThreshold() {
        return this.incomingEndThreshold;
    }

    public final void setIncomingEndThreshold(float f) {
        this.incomingEndThreshold = f;
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    public final Animator createAppear(ViewGroup viewGroup, View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return createFadeAnimator(view, 0.0f, alpha, 0.0f, this.incomingEndThreshold, alpha);
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    public final Animator createDisappear(ViewGroup viewGroup, View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return createFadeAnimator(view, alpha, 0.0f, 0.0f, 1.0f, alpha);
    }

    private static Animator createFadeAnimator(final View view, final float f, final float f2, final float f3, final float f4, final float f5) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.transition.platform.FadeProvider.1
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {29, -5, -24, -13, -20, -6, 55, -69, -12, -14, -6, 3, -9, -10, -1, -25, -7, -8, 11, 43, -59, -26, -14, 3, 3, 45, -27, -58, -14, 3, 3, 8, -26, -21, -12, 9, -21, 70, -25, 9, -25, -41, 4, -19, 3, -14, -7, 22, -25, -32, 4, 0, -17, -14, 38, -52, 9, -14, -14, 0, -17, -14, -7, -5, 3, -6, -14, 0, -19, -5, -13, -6, -5, -13, 1, -7, -26, 5, -4, -26, 34, -42, 3, -9, -15, 0, -9, -9, -3, -28, 1, -16, 58};
            private static final int $$e = 76;
            private static final byte[] $$a = {5, 11, -122, -94, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
            private static final int $$b = 144;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            private static int TuitionPaymentFragmentbindingInflater1 = 1;
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 6183764452922659654L;

            /* JADX WARN: Code duplicated, block: B:10:0x0024  */
            /* JADX WARN: Code duplicated, block: B:8:0x001c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002d). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(byte r6, int r7, short r8, java.lang.Object[] r9) {
                /*
                    byte[] r0 = com.google.android.material.transition.platform.FadeProvider.AnonymousClass1.$$a
                    int r6 = r6 * 14
                    int r6 = r6 + 84
                    int r8 = r8 + 4
                    int r1 = 53 - r7
                    byte[] r1 = new byte[r1]
                    int r7 = 52 - r7
                    r2 = 0
                    if (r0 != 0) goto L14
                    r3 = r8
                    r4 = r2
                    goto L2d
                L14:
                    r3 = r2
                L15:
                    int r8 = r8 + 1
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    if (r3 != r7) goto L24
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L24:
                    int r3 = r3 + 1
                    r4 = r0[r8]
                    r5 = r8
                    r8 = r6
                    r6 = r4
                    r4 = r3
                    r3 = r5
                L2d:
                    int r8 = r8 + r6
                    int r6 = r8 + (-10)
                    r8 = r3
                    r3 = r4
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transition.platform.FadeProvider.AnonymousClass1.a(byte, int, short, java.lang.Object[]):void");
            }

            private static void c(int i, short s, int i2, Object[] objArr) {
                int i3 = (i2 * 15) + 84;
                int i4 = i * 15;
                byte[] bArr = $$d;
                int i5 = 41 - (s * 37);
                byte[] bArr2 = new byte[53 - i4];
                int i6 = 52 - i4;
                int i7 = -1;
                if (bArr == null) {
                    i7 = -1;
                    i3 = (i6 + (-i5)) - 8;
                    i5++;
                }
                while (true) {
                    int i8 = i7 + 1;
                    bArr2[i8] = (byte) i3;
                    if (i8 == i6) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    }
                    int i9 = i3;
                    i7 = i8;
                    i3 = (i9 + (-bArr[i5])) - 8;
                    i5++;
                }
            }

            private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
                getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
                int length = cArr.length;
                long[] jArr = new long[length];
                getrealtimecapturelatency.b = 0;
                while (getrealtimecapturelatency.b < cArr.length) {
                    int i3 = $10 + 89;
                    $11 = i3 % 128;
                    int i4 = i3 % 2;
                    int i5 = getrealtimecapturelatency.b;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - Drawable.resolveOpacity(0, 0)), ExpandableListView.getPackedPositionGroup(0L) + 2624, TextUtils.indexOf("", "", 0, 0) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ 9053247990562531611L);
                        Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39423 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 481 - Drawable.resolveOpacity(0, 0), TextUtils.indexOf((CharSequence) "", '0') + 38, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                        int i6 = $11 + 51;
                        $10 = i6 % 128;
                        int i7 = i6 % 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                char[] cArr2 = new char[length];
                getrealtimecapturelatency.b = 0;
                while (getrealtimecapturelatency.b < cArr.length) {
                    cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                    Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (39422 - Color.alpha(0)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 481, 37 - TextUtils.getTrimmedLength(""), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr2);
            }

            /* JADX WARN: Code duplicated, block: B:22:0x0213  */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) throws Throwable {
                Object[] objArr;
                int i = 2 % 2;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char defaultSize = (char) (31533 - View.getDefaultSize(0, 0));
                    int tapTimeout = 921 - (ViewConfiguration.getTapTimeout() >> 16);
                    int packedPositionGroup = 28 - ExpandableListView.getPackedPositionGroup(0L);
                    byte[] bArr = $$a;
                    Object[] objArr2 = new Object[1];
                    a(bArr[37], (byte) 52, bArr[7], objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(defaultSize, tapTimeout, packedPositionGroup, -1048449946, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                b(new char[]{14908, 6184, 32271, 23678, 45662, 37043, 63131, 54478, 10986, 2269, 28541, 19751, 41824, 33137, 59219, 50605, 7040, 31189, 24535, 45619, 36898, 62977}, Process.getGidForName("") + 8732, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                b(new char[]{14904, 14274, 8666, 5108, 3554, 32647, 27019, 23466, 21920, 18359, 45391, 41816, 40272, 36711, 63858}, 3571 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char maximumFlingVelocity = (char) (31533 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 922;
                    int i2 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 28;
                    byte[] bArr2 = $$a;
                    byte b = bArr2[80];
                    Object[] objArr5 = new Object[1];
                    a(b, b, bArr2[7], objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maximumFlingVelocity, iLastIndexOf, i2, -778300370, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 31533);
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 921;
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 28;
                        byte[] bArr3 = $$a;
                        Object[] objArr6 = new Object[1];
                        a(bArr3[80], bArr3[33], (byte) 51, objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maxKeyCode, iKeyCodeFromString, keyRepeatTimeout, -1142834547, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
                    int iUptimeMillis = (int) SystemClock.uptimeMillis();
                    int i3 = ~iUptimeMillis;
                    int i4 = (((((~(i3 | 1401438543)) | ((~((-372641101) | i3)) | 70650880)) * (-397)) - 915207692) + ((iUptimeMillis | 1170099203) * 397)) - 1404931768;
                    int i5 = (i4 << 13) ^ i4;
                    int i6 = i5 ^ (i5 >>> 17);
                    ((int[]) objArr[0])[0] = i6 ^ (i6 << 5);
                } else {
                    Object[] objArr8 = new Object[1];
                    b(new char[]{14908, 'P', 20223, 38150, 54206, 6619, 25707, 41670, 59684, 14166, 32243, 47154, 34488, 52537, 2883, 20985, 39963, 55975, 8415, 28541, 46517, 61482, 16045, 1245, 17268, 35218}, (ViewConfiguration.getPressedStateDuration() >> 16) + 14947, objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    b(new char[]{14910, 25453, 34981, 12768, 24364, 33898, 11703, 19199, 61445, 6464, 18051, 61379, 5378, 45757, 56303, 319, 44642, 55206}, 22901 - AndroidCharacter.getMirror('0'), objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        if (applicationContext instanceof ContextWrapper) {
                            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
                            TuitionPaymentFragmentbindingInflater1 = i7 % 128;
                            int i8 = i7 % 2;
                            if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                applicationContext = applicationContext.getApplicationContext();
                            } else {
                                applicationContext = null;
                            }
                        } else {
                            applicationContext = applicationContext.getApplicationContext();
                        }
                    }
                    Object[] objArr10 = new Object[1];
                    b(new char[]{14903, 38911, 25005, 13173, 36223, 24318, 10414, 64102, 21538, 8616, 62352, 19781, 7946, 59598, 47762, 5213}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 44483, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    b(new char[]{14900, 46342, 9286, 38798, 1749, 62991, 24915, 53405, 17389, 13067, 41560, 7552, 36074, 31745, 61259, 24201}, MotionEvent.axisFromString("") + 36672, objArr11);
                    int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                    int i9 = TuitionPaymentFragmentbindingInflater1 + 97;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
                    int i10 = i9 % 2;
                    try {
                        Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -1404931768};
                        byte[] bArr4 = $$d;
                        byte b2 = bArr4[74];
                        byte b3 = b2;
                        Object[] objArr13 = new Object[1];
                        c(b2, b3, b3, objArr13);
                        Class<?> cls4 = Class.forName((String) objArr13[0]);
                        byte b4 = bArr4[51];
                        byte b5 = b4;
                        Object[] objArr14 = new Object[1];
                        c(b4, b5, b5, objArr14);
                        objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 31533);
                            int pressedStateDuration = 921 - (ViewConfiguration.getPressedStateDuration() >> 16);
                            int maxKeyCode2 = 28 - (KeyEvent.getMaxKeyCode() >> 16);
                            byte[] bArr5 = $$a;
                            Object[] objArr15 = new Object[1];
                            a(bArr5[80], bArr5[33], (byte) 51, objArr15);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(offsetBefore, pressedStateDuration, maxKeyCode2, -1142834547, false, (String) objArr15[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                        try {
                            Object[] objArr16 = new Object[1];
                            b(new char[]{14908, 6184, 32271, 23678, 45662, 37043, 63131, 54478, 10986, 2269, 28541, 19751, 41824, 33137, 59219, 50605, 7040, 31189, 24535, 45619, 36898, 62977}, (-16768485) - Color.rgb(0, 0, 0), objArr16);
                            Class<?> cls5 = Class.forName((String) objArr16[0]);
                            Object[] objArr17 = new Object[1];
                            b(new char[]{14904, 14274, 8666, 5108, 3554, 32647, 27019, 23466, 21920, 18359, 45391, 41816, 40272, 36711, 63858}, (KeyEvent.getMaxKeyCode() >> 16) + 3571, objArr17);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char mirror = (char) (AndroidCharacter.getMirror('0') + 31485);
                                int iLastIndexOf2 = 920 - TextUtils.lastIndexOf("", '0', 0);
                                int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 28;
                                byte[] bArr6 = $$a;
                                byte b6 = bArr6[80];
                                Object[] objArr18 = new Object[1];
                                a(b6, b6, bArr6[7], objArr18);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(mirror, iLastIndexOf2, windowTouchSlop, -778300370, false, (String) objArr18[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char offsetAfter = (char) (TextUtils.getOffsetAfter("", 0) + 31533);
                                int iIndexOf = 920 - TextUtils.indexOf((CharSequence) "", '0');
                                int maximumDrawingCacheSize = 28 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                byte[] bArr7 = $$a;
                                Object[] objArr19 = new Object[1];
                                a(bArr7[37], (byte) 52, bArr7[7], objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(offsetAfter, iIndexOf, maximumDrawingCacheSize, -1048449946, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
                int i11 = ((int[]) objArr[1])[0];
                int i12 = ((int[]) objArr[3])[0];
                if (i12 != i11) {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr[4];
                    if (strArr != null) {
                        for (String str : strArr) {
                            arrayList.add(str);
                        }
                    }
                    throw new RuntimeException(String.valueOf(i12));
                }
                int i13 = ((int[]) objArr[0])[0];
                Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
                int i14 = i13 + 2106421723 + (((~((-1447117623) | iUptimeMillis2)) | 306250532) * 576) + (((~((~iUptimeMillis2) | (-1140867091))) | 20711489) * 576) + 306647296;
                int i15 = (i14 << 13) ^ i14;
                int i16 = i15 ^ (i15 >>> 17);
                ((int[]) objArr20[0])[0] = i16 ^ (i16 << 5);
                int i17 = TuitionPaymentFragmentbindingInflater1 + 55;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i17 % 128;
                if (i17 % 2 != 0) {
                    int i18 = 4 / 5;
                }
                view.setAlpha(TransitionUtils.lerp(f, f2, f3, f4, fFloatValue));
            }
        });
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transition.platform.FadeProvider.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                view.setAlpha(f5);
            }
        });
        return valueAnimatorOfFloat;
    }
}
