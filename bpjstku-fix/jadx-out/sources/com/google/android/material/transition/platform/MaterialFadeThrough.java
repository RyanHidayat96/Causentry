package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.transition.TransitionValues;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.android.material.R;
import defpackage.abortCapture;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class MaterialFadeThrough extends MaterialVisibility<FadeThroughProvider> {
    private static final float DEFAULT_START_SCALE = 0.92f;
    private static final int DEFAULT_THEMED_DURATION_ATTR;
    private static final int DEFAULT_THEMED_EASING_ATTR;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {14, 70, 6, -35};
    private static final int $$f = 21;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {21, 65, -9, -121, 13, -15, 2, 3, 9, -3, -11, 66, 4, -51, -3, 3, -15, -4, 15, -13, 68, -68, -6, 14, 9, -21, 21, 47, 4, -20, -45, 11, -21, 42, -19, -17, 14, -13, -4, 21, -1, -10, 7, -33, 12, -11, 11, -6, 1, 30, -17, -24, 12, 8, -9, -6, 46, -44, 17, -6, -6, 8, -9, -6, 18, -7, -5, 10, -5, -5, 7, 30, -37, 8, -6, 11, -19, 15, -13, 65};
    private static final int $$e = 148;
    private static final byte[] $$a = {90, 46, 113, 8, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 120;
    private static int b = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 52
            int r9 = 108 - r9
            int r8 = r8 * 4
            int r8 = 84 - r8
            byte[] r0 = com.google.android.material.transition.platform.MaterialFadeThrough.$$a
            int r7 = r7 * 15
            int r7 = 53 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r7
            r3 = r9
            r4 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2c:
            int r9 = -r9
            int r8 = r8 + r9
            int r8 = r8 + (-11)
            int r9 = r3 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transition.platform.MaterialFadeThrough.a(int, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 30
            int r7 = r7 + 84
            byte[] r0 = com.google.android.material.transition.platform.MaterialFadeThrough.$$d
            int r8 = r8 * 39
            int r8 = r8 + 4
            int r6 = r6 * 2
            int r1 = r6 + 38
            byte[] r1 = new byte[r1]
            int r6 = r6 + 37
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L2e
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L26
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
            int r8 = -r8
            int r7 = r7 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transition.platform.MaterialFadeThrough.d(int, byte, byte, java.lang.Object[]):void");
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        while (abortcapture.b < cArrB.length) {
            int i3 = $11 + 103;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i5 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (View.MeasureSpec.getSize(0) + 64838), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1356, 38 - Color.red(0), 894276454, false, $$g(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47772 - TextUtils.indexOf((CharSequence) "", '0')), 467 - ImageFormat.getBitsPerPixel(0), ExpandableListView.getPackedPositionType(0L) + 13, 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
        int i6 = $10 + 105;
        $11 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 75 / 0;
        }
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public final /* bridge */ /* synthetic */ void addAdditionalAnimatorProvider(VisibilityAnimatorProvider visibilityAnimatorProvider) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
        b = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 2267;
            int iArgb = Color.argb(0, 0, 0, 0) + 33;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            a(b2, b2, bArr[40], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iMakeMeasureSpec, iArgb, -887667012, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{61671, 61574, 14555, 6860, 50770, 11919, 33476, 18838, 31084, 46840, 2272, 57326, 58176, 11518, 40646, 21999, 27954, 55962, 9400, 11261, 55066, 20614, 43708, 40987, 16880, 51530}, -TextUtils.lastIndexOf("", '0'), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{43458, 43431, 61595, 53902, 44485, 57431, 59734, 34636, 8277, 32438, 25463, 4426, 47727, 58542, 62739, 39696, 13319, 4806, 20286}, TextUtils.getCapsMode("", 0, 0) + 1, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
            int i4 = 2268 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 33;
            byte[] bArr2 = $$a;
            byte b3 = bArr2[7];
            Object[] objArr5 = new Object[1];
            a(b3, b3, bArr2[5], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(windowTouchSlop, i4, iIndexOf, -874156483, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                int iIndexOf2 = TextUtils.indexOf("", "") + 2267;
                int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 34;
                byte[] bArr3 = $$a;
                byte b4 = bArr3[5];
                byte b5 = bArr3[7];
                Object[] objArr6 = new Object[1];
                a(b4, b5, b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cNormalizeMetaState, iIndexOf2, bitsPerPixel, -654680577, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i5 = ((int[]) objArr7[0])[0];
            int i6 = ((int[]) objArr7[3])[0];
            String[] strArr = (String[]) objArr7[1];
            int i7 = ~((~((int) Process.getStartUptimeMillis())) | 124335138);
            int i8 = ((((119616546 | i7) * (-374)) + 830875151) + ((i7 | 4718592) * 374)) - 2066464244;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[2])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{24689, 24592, 11718, 4049, 38579, 31574, 53797, 7247, 59898, 41957, 22529, 35383, 29656, 14816, 52857, 'K', 64924, 53143, 29785, 32296, 18327, 17841, 64069, 62932, 53585, 56404, 24743, 25580, 23368, 21092}, -TextUtils.indexOf((CharSequence) "", '0'), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{63745, 63842, 56661, 65369, 32580, 15667, 15300, 23082, 28800, 21354, 45542, 52285, 60089, 51560, 10130, 18025, 25806, 16157, 40366, 14413, 57086, 46398}, 1 - View.MeasureSpec.getSize(0), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
                b = i11 % 128;
                if (i11 % 2 != 0) {
                    boolean z = applicationContext instanceof ContextWrapper;
                    throw null;
                }
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{40248, 40274, 53795, 61499, 28634, 47743, 11102, 56693, 5362, 23562, 41325, 19294, 36503, 50772, 14131, 49461, 231, 12394, 36129, 48901}, TextUtils.getCapsMode("", 0, 0) + 1, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{13516, 13477, 19968, 27677, 13551, 9188, 28792, 17633, 48476, 49193, 64077, 53970, 10060, 23101, 27686, 22719, 43299, 44119, 54805, 9878}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
            b = i12 % 128;
            int i13 = i12 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -2066464244};
                byte[] bArr4 = $$d;
                byte b6 = bArr4[48];
                byte b7 = b6;
                Object[] objArr13 = new Object[1];
                d(b6, b7, (byte) (b7 - 1), objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b8 = bArr4[48];
                byte b9 = (byte) (b8 - 1);
                Object[] objArr14 = new Object[1];
                d(b9, b9, b8, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int i14 = 2268 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        int iIndexOf3 = 32 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        byte[] bArr5 = $$a;
                        byte b10 = bArr5[5];
                        byte b11 = bArr5[7];
                        Object[] objArr16 = new Object[1];
                        a(b10, b11, b11, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollDefaultDelay, i14, iIndexOf3, -654680577, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        c(new char[]{61671, 61574, 14555, 6860, 50770, 11919, 33476, 18838, 31084, 46840, 2272, 57326, 58176, 11518, 40646, 21999, 27954, 55962, 9400, 11261, 55066, 20614, 43708, 40987, 16880, 51530}, Drawable.resolveOpacity(0, 0) + 1, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        c(new char[]{43458, 43431, 61595, 53902, 44485, 57431, 59734, 34636, 8277, 32438, 25463, 4426, 47727, 58542, 62739, 39696, 13319, 4806, 20286}, '1' - AndroidCharacter.getMirror('0'), objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char bitsPerPixel2 = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
                            int iResolveSizeAndState = 2267 - View.resolveSizeAndState(0, 0, 0);
                            int scrollBarFadeDuration = 33 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            byte[] bArr6 = $$a;
                            byte b12 = bArr6[7];
                            Object[] objArr19 = new Object[1];
                            a(b12, b12, bArr6[5], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(bitsPerPixel2, iResolveSizeAndState, scrollBarFadeDuration, -874156483, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cBlue = (char) Color.blue(0);
                            int minimumFlingVelocity = 2267 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            int iResolveOpacity = 33 - Drawable.resolveOpacity(0, 0);
                            byte[] bArr7 = $$a;
                            byte b13 = bArr7[7];
                            Object[] objArr20 = new Object[1];
                            a(b13, b13, bArr7[40], objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cBlue, minimumFlingVelocity, iResolveOpacity, -887667012, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i15 = ((int[]) objArr[3])[0];
        int i16 = ((int[]) objArr[0])[0];
        if (i16 == i15) {
            int i17 = b + 9;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i17 % 128;
            int i18 = i17 % 2;
            Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i19 = ((int[]) objArr[2])[0];
            int i20 = ((int[]) objArr[0])[0];
            int i21 = ((int[]) objArr[3])[0];
            String[] strArr2 = (String[]) objArr[1];
            int iIdentityHashCode = System.identityHashCode(this);
            int i22 = i19 + 1065820892 + (((-36737426) | iIdentityHashCode) * (-627)) + (((~((-486762095) | iIdentityHashCode)) | 321951221) * (-627)) + (((~(iIdentityHashCode | 321951221)) | (~((~iIdentityHashCode) | 486762094))) * 627);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr21[2])[0] = i24 ^ (i24 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[1];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i16 / (((i16 - 1) * i16) % 2), 0).show();
            Object[] objArr22 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i25 = ((int[]) objArr[2])[0];
            int i26 = ((int[]) objArr[0])[0];
            int i27 = ((int[]) objArr[3])[0];
            String[] strArr4 = (String[]) objArr[1];
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i28 = ~startUptimeMillis;
            int i29 = (~((-872283615) | i28)) | 63439194;
            int i30 = ~(startUptimeMillis | 872414718);
            int i31 = i25 + (-1942344892) + ((i29 | i30) * (-713)) + (i30 * 1426) + ((~(63570298 | i28)) * 713);
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArr22[2])[0] = i33 ^ (i33 << 5);
        }
        super.addAdditionalAnimatorProvider(visibilityAnimatorProvider);
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public final /* bridge */ /* synthetic */ void clearAdditionalAnimatorProvider() {
        int i = 2 % 2;
        int i2 = b + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        super.clearAdditionalAnimatorProvider();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 5;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 25 / 0;
        }
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public final /* bridge */ /* synthetic */ VisibilityAnimatorProvider getPrimaryAnimatorProvider() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 27;
        b = i2 % 128;
        int i3 = i2 % 2;
        VisibilityAnimatorProvider primaryAnimatorProvider = super.getPrimaryAnimatorProvider();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
        b = i4 % 128;
        int i5 = i4 % 2;
        return primaryAnimatorProvider;
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public final /* bridge */ /* synthetic */ VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
        int i = 2 % 2;
        int i2 = b + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        VisibilityAnimatorProvider secondaryAnimatorProvider = super.getSecondaryAnimatorProvider();
        if (i3 == 0) {
            int i4 = 72 / 0;
        }
        return secondaryAnimatorProvider;
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility, android.transition.Visibility
    public final /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int i = 2 % 2;
        int i2 = b + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Animator animatorOnAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
        int i4 = b + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return animatorOnAppear;
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility, android.transition.Visibility
    public final /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 5;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
        super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public final /* bridge */ /* synthetic */ boolean removeAdditionalAnimatorProvider(VisibilityAnimatorProvider visibilityAnimatorProvider) {
        int i = 2 % 2;
        int i2 = b + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            super.removeAdditionalAnimatorProvider(visibilityAnimatorProvider);
            throw null;
        }
        boolean zRemoveAdditionalAnimatorProvider = super.removeAdditionalAnimatorProvider(visibilityAnimatorProvider);
        int i3 = b + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        return zRemoveAdditionalAnimatorProvider;
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public final /* bridge */ /* synthetic */ void setSecondaryAnimatorProvider(VisibilityAnimatorProvider visibilityAnimatorProvider) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 27;
        b = i2 % 128;
        int i3 = i2 % 2;
        super.setSecondaryAnimatorProvider(visibilityAnimatorProvider);
        if (i3 != 0) {
            int i4 = 76 / 0;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        DEFAULT_THEMED_DURATION_ATTR = R.attr.motionDurationLong1;
        DEFAULT_THEMED_EASING_ATTR = R.attr.motionEasingEmphasizedInterpolator;
        int i = TuitionPaymentFragmentbindingInflater1 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public MaterialFadeThrough() {
        super(createPrimaryAnimatorProvider(), createSecondaryAnimatorProvider());
    }

    private static FadeThroughProvider createPrimaryAnimatorProvider() {
        int i = 2 % 2;
        FadeThroughProvider fadeThroughProvider = new FadeThroughProvider();
        int i2 = b + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 84 / 0;
        }
        return fadeThroughProvider;
    }

    private static VisibilityAnimatorProvider createSecondaryAnimatorProvider() {
        int i = 2 % 2;
        ScaleProvider scaleProvider = new ScaleProvider();
        scaleProvider.setScaleOnDisappear(false);
        scaleProvider.setIncomingStartScale(DEFAULT_START_SCALE);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 57;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            return scaleProvider;
        }
        throw null;
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    final int getDurationThemeAttrResId(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
        int i3 = i2 % 128;
        b = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = DEFAULT_THEMED_DURATION_ATTR;
        int i5 = i3 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    final int getEasingThemeAttrResId(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
        int i3 = i2 % 128;
        b = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = DEFAULT_THEMED_EASING_ATTR;
        int i5 = i3 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1908567811611215903L;
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
    private static java.lang.String $$g(short r7, short r8, short r9) {
        /*
            int r7 = r7 + 4
            byte[] r0 = com.google.android.material.transition.platform.MaterialFadeThrough.$$c
            int r9 = r9 * 4
            int r9 = r9 + 107
            int r8 = r8 * 2
            int r8 = 1 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r9 = r7
            r3 = r8
            r4 = r2
            goto L2b
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            int r7 = r7 + 1
            if (r4 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transition.platform.MaterialFadeThrough.$$g(short, short, short):java.lang.String");
    }
}
