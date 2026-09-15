package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.google.android.material.R;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes4.dex */
public final class IndeterminateDrawable<S extends BaseProgressIndicatorSpec> extends DrawableWithAnimatedVisibilityChange {
    private IndeterminateAnimatorDelegate<ObjectAnimator> animatorDelegate;
    private DrawingDelegate<S> drawingDelegate;
    private Drawable staticDummyDrawable;
    private static final byte[] $$c = {46, 126, -84, 108};
    private static final int $$f = 45;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {59, -124, -78, 46, -2, 21, -2, 11, 6, 11, 24, -4, 5, 28, -6, -9, 43, 6, -3, 4, 11, 11, -10, 28, 21, 13, -7, 23, 10, -59, 58, 22, -1, 23, 6, 3, 4, 29, -12, 7, 21, 1, 22, -8, 11, 21, 12, -4, 20, 11, 6, -3, 11, 23, 9, -1, 14, 2, -11, 43, 6, -3, 4, 11, 11, -23, 40, 12, 7, -56, 22, 42, -3, 20, -2, 15, 8, -21, 26, 33, -3, 1, 18, 15, -37, 53, -8, 15, 15, 1, 18, 15, -9, 16, 14, -1, 14, 14, 2, -21, 46, 1, 15, -2, 28, -6, 22, -56};
    private static final int $$e = 113;
    private static final byte[] $$a = {93, -77, 2, Base64.padSymbol, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 93;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int b = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {17899, 5013, 59660, 18091, 7201, 62934, 17224, 6323, 63085, 19456, 9678, 62210, 18623, 9796, 65488, 21872, 8951, 63560, 22036, 12166, 34109, 21156, 45561, 59265, 7455, 45759, 59435, 460, 46942, 60633, 625, 47108, 53658, 1843, 48313, 53836, 3031, 45565, 59267, 7450, 45757, 59447, 448, 46942, 60581, 629, 47125, 53638, 1897, 48273, 53826, 3014, 41322, 55034, 3188, 41498, 56198, 28956, 42673, 56408, 30174, 43877, 49393, 46559, 58296, 6444, 46749, 60445, 1511, 45934, 59626, 1604, 48181, 54714, 782, 47251, 54880, 4070, 42314, 53955, 2131, 45558, 59276, 7432, 45742, 59510, 453, 46939, 60645, 627, 47179, 53669, 1854, 48291, 53845, 3031, 41326, 45557, 59273, 7451, 45729, 59436, 448, 46926, 60658, 604, 47108, 53637, 1839, 48275, 53838, 3030, 41318};
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -5975169122098223123L;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 52
            int r5 = r5 + 4
            int r0 = 53 - r7
            byte[] r1 = com.google.android.material.progressindicator.IndeterminateDrawable.$$a
            int r6 = r6 * 14
            int r6 = 98 - r6
            byte[] r0 = new byte[r0]
            int r7 = 52 - r7
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r6
            r6 = r7
            r3 = r2
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L25:
            int r3 = r3 + 1
            r4 = r1[r5]
        L29:
            int r6 = r6 + r4
            int r5 = r5 + 1
            int r6 = r6 + (-10)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.progressindicator.IndeterminateDrawable.a(byte, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.android.material.progressindicator.IndeterminateDrawable.$$d
            int r7 = r7 * 67
            int r7 = 71 - r7
            int r6 = r6 * 30
            int r1 = 68 - r6
            int r8 = r8 * 24
            int r8 = 108 - r8
            byte[] r1 = new byte[r1]
            int r6 = 67 - r6
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r6
            r8 = r7
            r4 = r2
            goto L30
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L30:
            int r3 = r3 + r7
            int r7 = r3 + (-9)
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.progressindicator.IndeterminateDrawable.d(byte, short, int, java.lang.Object[]):void");
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public final /* bridge */ /* synthetic */ void clearAnimationCallbacks() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
        b = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.clearAnimationCallbacks();
        if (i3 == 0) {
            throw null;
        }
        int i4 = b + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getAlpha() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
        b = i2 % 128;
        int i3 = i2 % 2;
        int alpha = super.getAlpha();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
        b = i4 % 128;
        int i5 = i4 % 2;
        return alpha;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getOpacity() {
        int i = 2 % 2;
        int i2 = b + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        int opacity = super.getOpacity();
        int i4 = b + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return opacity;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public final /* bridge */ /* synthetic */ boolean hideNow() {
        int i = 2 % 2;
        int i2 = b + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        boolean zHideNow = super.hideNow();
        int i4 = b + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 3 / 0;
        }
        return zHideNow;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public final /* bridge */ /* synthetic */ boolean isHiding() {
        int i = 2 % 2;
        int i2 = b + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsHiding = super.isHiding();
        int i4 = b + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return zIsHiding;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public final /* bridge */ /* synthetic */ boolean isRunning() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
        b = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.isRunning();
            throw null;
        }
        boolean zIsRunning = super.isRunning();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            return zIsRunning;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public final /* bridge */ /* synthetic */ boolean isShowing() {
        int i = 2 % 2;
        int i2 = b + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsShowing = super.isShowing();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 107;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return zIsShowing;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public final /* bridge */ /* synthetic */ void registerAnimationCallback(Animatable2Compat.AnimationCallback animationCallback) {
        int i = 2 % 2;
        int i2 = b + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        super.registerAnimationCallback(animationCallback);
        if (i3 != 0) {
            throw null;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 57;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ void setAlpha(int i) {
        int i2 = 2 % 2;
        int i3 = b + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        super.setAlpha(i);
        if (i4 != 0) {
            int i5 = 20 / 0;
        }
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
        b = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
        b = i2 % 128;
        int i3 = i2 % 2;
        super.setColorFilter(colorFilter);
        int i4 = b + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 23;
        b = i2 % 128;
        int i3 = i2 % 2;
        boolean visible = super.setVisible(z, z2);
        int i4 = b + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
        return visible;
    }

    private static void c(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i4 = $11 + 35;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1[i + i6])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 2187 - View.getDefaultSize(0, 0), 40 - View.MeasureSpec.getSize(0), 841711447, false, $$g(b2, b3, (byte) (b3 + 2)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33017 - Color.green(0)), 3011 - View.resolveSizeAndState(0, 0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 26, 321985076, false, $$g(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((Process.myTid() >> 22) + 36505), 3376 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (-16777199) - Color.rgb(0, 0, 0), -968507904, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ExpandableListView.getPackedPositionGroup(0L) + 36505), 3376 - (ViewConfiguration.getFadingEdgeLength() >> 16), 17 - Color.green(0), -968507904, false, $$g(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
        int i7 = $11 + 1;
        $10 = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 30 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x023e  */
    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public final /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2, boolean z3) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 31533);
            int i2 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 920;
            int iMyPid = (Process.myPid() >> 22) + 28;
            byte b2 = $$a[80];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            a(b2, b3, (byte) (b3 | 52), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarFadeDuration, i2, iMyPid, -1048449946, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(ViewConfiguration.getFadingEdgeLength() >> 16, View.MeasureSpec.makeMeasureSpec(0, 0) + 22, (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 62486), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c((Process.myTid() >> 22) + 22, 15 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) TextUtils.getOffsetAfter("", 0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (31534 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 921;
            int i3 = 28 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            byte[] bArr = $$a;
            byte b4 = bArr[80];
            Object[] objArr5 = new Object[1];
            a(b4, bArr[37], b4, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, maximumDrawingCacheSize, i3, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cAxisFromString = (char) (31532 - MotionEvent.axisFromString(""));
                int i4 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 921;
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 29;
                byte[] bArr2 = $$a;
                byte b5 = bArr2[37];
                Object[] objArr6 = new Object[1];
                a(b5, b5, bArr2[33], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cAxisFromString, i4, iIndexOf, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i5 = ~startUptimeMillis;
            int i6 = (-1161269589) + ((startUptimeMillis | 1089202213) * 140) + (((~(1089202213 | i5)) | 672138834) * (-280)) + (((~(startUptimeMillis | (-672138835))) | (~(684877430 | i5)) | 1076463617) * 140) + 193178254;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c((ViewConfiguration.getPressedStateDuration() >> 16) + 37, 26 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(View.MeasureSpec.makeMeasureSpec(0, 0) + 63, (KeyEvent.getMaxKeyCode() >> 16) + 18, (char) (1056 - (Process.myTid() >> 22)), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
                int i10 = i9 % 128;
                b = i10;
                if (i9 % 2 == 0) {
                    boolean z4 = applicationContext instanceof ContextWrapper;
                    throw null;
                }
                if (applicationContext instanceof ContextWrapper) {
                    int i11 = i10 + 15;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
                    if (i11 % 2 != 0) {
                        ((ContextWrapper) applicationContext).getBaseContext();
                        obj.hashCode();
                        throw null;
                    }
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
            c(KeyEvent.keyCodeFromString("") + 81, 15 - ImageFormat.getBitsPerPixel(0), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(Gravity.getAbsoluteGravity(0, 0) + 97, 17 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
            b = i12 % 128;
            int i13 = i12 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 193178254};
                byte[] bArr3 = $$d;
                byte b6 = bArr3[41];
                byte b7 = (byte) (b6 - 1);
                byte b8 = b6;
                Object[] objArr13 = new Object[1];
                d(b7, b8, (byte) (b8 - 1), objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b9 = bArr3[41];
                byte b10 = b9;
                Object[] objArr14 = new Object[1];
                d(b10, (byte) (b10 - 1), b9, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c2 = (char) (31534 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                    int maximumDrawingCacheSize2 = 921 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int i14 = 29 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    byte[] bArr4 = $$a;
                    byte b11 = bArr4[37];
                    Object[] objArr16 = new Object[1];
                    a(b11, b11, bArr4[33], objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, maximumDrawingCacheSize2, i14, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    c((-1) - ImageFormat.getBitsPerPixel(0), 22 - KeyEvent.keyCodeFromString(""), (char) (62486 - KeyEvent.keyCodeFromString("")), objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    c(22 - Color.red(0), KeyEvent.normalizeMetaState(0) + 15, (char) ('0' - AndroidCharacter.getMirror('0')), objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char deadChar = (char) (31533 - KeyEvent.getDeadChar(0, 0));
                        int i15 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 920;
                        int iMyTid = 28 - (Process.myTid() >> 22);
                        byte[] bArr5 = $$a;
                        byte b12 = bArr5[80];
                        Object[] objArr19 = new Object[1];
                        a(b12, bArr5[37], b12, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(deadChar, i15, iMyTid, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char mode = (char) (31533 - View.MeasureSpec.getMode(0));
                        int defaultSize = 921 - View.getDefaultSize(0, 0);
                        int iGreen = Color.green(0) + 28;
                        byte b13 = $$a[80];
                        byte b14 = b13;
                        Object[] objArr20 = new Object[1];
                        a(b13, b14, (byte) (b14 | 52), objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mode, defaultSize, iGreen, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr15;
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
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr == null) {
                throw null;
            }
            for (String str : strArr) {
                arrayList.add(str);
            }
            throw null;
        }
        int i16 = b + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i16 % 128;
        int i17 = i16 % 2;
        int i18 = ((int[]) objArr[0])[0];
        Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i19 = ~((-1520433171) | iIdentityHashCode);
        int i20 = ~iIdentityHashCode;
        int i21 = i18 + 693403105 + ((i19 | (~(1604320923 | i20))) * (-406)) + ((~((-1350674451) | i20)) * (-406)) + (((~(iIdentityHashCode | (-253646474))) | (~(1520433170 | i20))) * 406);
        int i22 = (i21 << 13) ^ i21;
        int i23 = i22 ^ (i22 >>> 17);
        ((int[]) objArr21[0])[0] = i23 ^ (i23 << 5);
        int i24 = b + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i24 % 128;
        int i25 = i24 % 2;
        return super.setVisible(z, z2, z3);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public final /* bridge */ /* synthetic */ void start() {
        int i = 2 % 2;
        int i2 = b + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        super.start();
        if (i3 != 0) {
            throw null;
        }
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public final /* bridge */ /* synthetic */ void stop() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
        b = i2 % 128;
        int i3 = i2 % 2;
        super.stop();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public final /* bridge */ /* synthetic */ boolean unregisterAnimationCallback(Animatable2Compat.AnimationCallback animationCallback) {
        int i = 2 % 2;
        int i2 = b + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        boolean zUnregisterAnimationCallback = super.unregisterAnimationCallback(animationCallback);
        int i4 = b + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return zUnregisterAnimationCallback;
    }

    IndeterminateDrawable(Context context, BaseProgressIndicatorSpec baseProgressIndicatorSpec, DrawingDelegate<S> drawingDelegate, IndeterminateAnimatorDelegate<ObjectAnimator> indeterminateAnimatorDelegate) {
        super(context, baseProgressIndicatorSpec);
        setDrawingDelegate(drawingDelegate);
        setAnimatorDelegate(indeterminateAnimatorDelegate);
    }

    public static IndeterminateDrawable<LinearProgressIndicatorSpec> createLinearDrawable(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        int i = 2 % 2;
        IndeterminateDrawable<LinearProgressIndicatorSpec> indeterminateDrawableCreateLinearDrawable = createLinearDrawable(context, linearProgressIndicatorSpec, new LinearDrawingDelegate(linearProgressIndicatorSpec));
        int i2 = b + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return indeterminateDrawableCreateLinearDrawable;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static IndeterminateDrawable<LinearProgressIndicatorSpec> createLinearDrawable(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec, LinearDrawingDelegate linearDrawingDelegate) {
        IndeterminateAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate;
        int i = 2 % 2;
        int i2 = b + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        if (linearProgressIndicatorSpec.indeterminateAnimationType == 0) {
            linearIndeterminateContiguousAnimatorDelegate = new LinearIndeterminateContiguousAnimatorDelegate(linearProgressIndicatorSpec);
        } else {
            LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate = new LinearIndeterminateDisjointAnimatorDelegate(context, linearProgressIndicatorSpec);
            int i4 = b + 75;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            linearIndeterminateContiguousAnimatorDelegate = linearIndeterminateDisjointAnimatorDelegate;
        }
        return new IndeterminateDrawable<>(context, linearProgressIndicatorSpec, linearDrawingDelegate, linearIndeterminateContiguousAnimatorDelegate);
    }

    public static IndeterminateDrawable<CircularProgressIndicatorSpec> createCircularDrawable(Context context, CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        int i = 2 % 2;
        IndeterminateDrawable<CircularProgressIndicatorSpec> indeterminateDrawableCreateCircularDrawable = createCircularDrawable(context, circularProgressIndicatorSpec, new CircularDrawingDelegate(circularProgressIndicatorSpec));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 107;
        b = i2 % 128;
        int i3 = i2 % 2;
        return indeterminateDrawableCreateCircularDrawable;
    }

    static IndeterminateDrawable<CircularProgressIndicatorSpec> createCircularDrawable(Context context, CircularProgressIndicatorSpec circularProgressIndicatorSpec, CircularDrawingDelegate circularDrawingDelegate) {
        int i = 2 % 2;
        IndeterminateDrawable<CircularProgressIndicatorSpec> indeterminateDrawable = new IndeterminateDrawable<>(context, circularProgressIndicatorSpec, circularDrawingDelegate, new CircularIndeterminateAnimatorDelegate(circularProgressIndicatorSpec));
        indeterminateDrawable.setStaticDummyDrawable(VectorDrawableCompat.create(context.getResources(), R.drawable.indeterminate_static, null));
        int i2 = b + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return indeterminateDrawable;
        }
        throw null;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    final boolean setVisibleInternal(boolean z, boolean z2, boolean z3) {
        Drawable drawable;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
        b = i2 % 128;
        int i3 = i2 % 2;
        boolean visibleInternal = super.setVisibleInternal(z, z2, z3);
        if (isSystemAnimatorDisabled() && (drawable = this.staticDummyDrawable) != null) {
            return drawable.setVisible(z, z2);
        }
        if (!isRunning()) {
            this.animatorDelegate.cancelAnimatorImmediately();
        }
        if (z) {
            if (!z3) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
                b = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 / 0;
                }
                return visibleInternal;
            }
            this.animatorDelegate.startAnimator();
        }
        return visibleInternal;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i = 2 % 2;
        int i2 = b + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.drawingDelegate.getPreferredWidth();
            obj.hashCode();
            throw null;
        }
        int preferredWidth = this.drawingDelegate.getPreferredWidth();
        int i3 = b + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 == 0) {
            return preferredWidth;
        }
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
        b = i2 % 128;
        int i3 = i2 % 2;
        int preferredHeight = this.drawingDelegate.getPreferredHeight();
        int i4 = b + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return preferredHeight;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0040  */
    /* JADX WARN: Code duplicated, block: B:34:0x0110  */
    /* JADX WARN: Code duplicated, block: B:36:0x011b  */
    /* JADX WARN: Code duplicated, block: B:46:0x015f A[SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        Drawable drawable;
        int i3 = 2 % 2;
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
            b = i4 % 128;
            int i5 = 0;
            if (i4 % 2 == 0) {
                if (isSystemAnimatorDisabled()) {
                    i = 1;
                    drawable = this.staticDummyDrawable;
                    if (drawable != null) {
                        drawable.setBounds(getBounds());
                        DrawableCompat.setTint(this.staticDummyDrawable, this.baseSpec.indicatorColors[0]);
                        this.staticDummyDrawable.draw(canvas);
                        return;
                    }
                } else {
                    i = 1;
                }
            } else if (isSystemAnimatorDisabled()) {
                i = 0;
                drawable = this.staticDummyDrawable;
                if (drawable != null) {
                    drawable.setBounds(getBounds());
                    DrawableCompat.setTint(this.staticDummyDrawable, this.baseSpec.indicatorColors[0]);
                    this.staticDummyDrawable.draw(canvas);
                    return;
                }
            } else {
                i = 0;
            }
            canvas.save();
            this.drawingDelegate.validateSpecAndAdjustCanvas(canvas, getBounds(), getGrowFraction(), isShowing(), isHiding());
            int i6 = this.baseSpec.indicatorTrackGapSize;
            int alpha = getAlpha();
            if (i6 != 0) {
                DrawingDelegate.ActiveIndicator activeIndicator = this.animatorDelegate.activeIndicators.get(0);
                DrawingDelegate.ActiveIndicator activeIndicator2 = this.animatorDelegate.activeIndicators.get(this.animatorDelegate.activeIndicators.size() - 1);
                DrawingDelegate<S> drawingDelegate = this.drawingDelegate;
                if (drawingDelegate instanceof LinearDrawingDelegate) {
                    drawingDelegate.fillTrack(canvas, this.paint, 0.0f, activeIndicator.startFraction, this.baseSpec.trackColor, alpha, i6);
                    this.drawingDelegate.fillTrack(canvas, this.paint, activeIndicator2.endFraction, 1.0f, this.baseSpec.trackColor, alpha, i6);
                } else {
                    drawingDelegate.fillTrack(canvas, this.paint, activeIndicator2.endFraction, activeIndicator.startFraction + 1.0f, this.baseSpec.trackColor, 0, i6);
                    int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
                    b = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 2 / 5;
                    }
                }
                while (i < this.animatorDelegate.activeIndicators.size()) {
                    i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
                    b = i2 % 128;
                    if (i2 % 2 != 0) {
                        this.drawingDelegate.fillIndicator(canvas, this.paint, this.animatorDelegate.activeIndicators.get(i), getAlpha());
                        throw null;
                    }
                    DrawingDelegate.ActiveIndicator activeIndicator3 = this.animatorDelegate.activeIndicators.get(i);
                    this.drawingDelegate.fillIndicator(canvas, this.paint, activeIndicator3, getAlpha());
                    if (i <= 0 && i6 > 0) {
                        this.drawingDelegate.fillTrack(canvas, this.paint, this.animatorDelegate.activeIndicators.get(i - 1).endFraction, activeIndicator3.startFraction, this.baseSpec.trackColor, i5, i6);
                        int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
                        b = i9 % 128;
                        int i10 = i9 % 2;
                    }
                    i++;
                }
                canvas.restore();
            }
            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
            b = i11 % 128;
            int i12 = i11 % 2;
            this.drawingDelegate.fillTrack(canvas, this.paint, 0.0f, 1.0f, this.baseSpec.trackColor, alpha, 0);
            int i13 = b + 47;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i13 % 128;
            int i14 = i13 % 2;
            i5 = alpha;
            while (i < this.animatorDelegate.activeIndicators.size()) {
                i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
                b = i2 % 128;
                if (i2 % 2 != 0) {
                    this.drawingDelegate.fillIndicator(canvas, this.paint, this.animatorDelegate.activeIndicators.get(i), getAlpha());
                    throw null;
                }
                DrawingDelegate.ActiveIndicator activeIndicator4 = this.animatorDelegate.activeIndicators.get(i);
                this.drawingDelegate.fillIndicator(canvas, this.paint, activeIndicator4, getAlpha());
                if (i <= 0) {
                }
                i++;
            }
            canvas.restore();
        }
    }

    private boolean isSystemAnimatorDisabled() {
        int i = 2 % 2;
        if (this.animatorDurationScaleProvider != null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
            b = i2 % 128;
            int i3 = i2 % 2;
            if (this.animatorDurationScaleProvider.getSystemAnimatorDurationScale(this.context.getContentResolver()) == 0.0f) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
                b = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
        }
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
        b = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public final Drawable getStaticDummyDrawable() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
        b = i2 % 128;
        int i3 = i2 % 2;
        Drawable drawable = this.staticDummyDrawable;
        if (i3 == 0) {
            int i4 = 99 / 0;
        }
        return drawable;
    }

    public final void setStaticDummyDrawable(Drawable drawable) {
        int i = 2 % 2;
        int i2 = b + 89;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        this.staticDummyDrawable = drawable;
        if (i4 != 0) {
            int i5 = 99 / 0;
        }
        int i6 = i3 + 89;
        b = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    final IndeterminateAnimatorDelegate<ObjectAnimator> getAnimatorDelegate() {
        IndeterminateAnimatorDelegate<ObjectAnimator> indeterminateAnimatorDelegate;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 97;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            indeterminateAnimatorDelegate = this.animatorDelegate;
            int i4 = 5 / 0;
        } else {
            indeterminateAnimatorDelegate = this.animatorDelegate;
        }
        int i5 = i2 + 103;
        b = i5 % 128;
        int i6 = i5 % 2;
        return indeterminateAnimatorDelegate;
    }

    final void setAnimatorDelegate(IndeterminateAnimatorDelegate<ObjectAnimator> indeterminateAnimatorDelegate) {
        int i = 2 % 2;
        int i2 = b + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        this.animatorDelegate = indeterminateAnimatorDelegate;
        indeterminateAnimatorDelegate.registerDrawable(this);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 11 / 0;
        }
    }

    final DrawingDelegate<S> getDrawingDelegate() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
        int i3 = i2 % 128;
        b = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        DrawingDelegate<S> drawingDelegate = this.drawingDelegate;
        int i4 = i3 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return drawingDelegate;
    }

    final void setDrawingDelegate(DrawingDelegate<S> drawingDelegate) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        this.drawingDelegate = drawingDelegate;
        int i5 = i3 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r7, int r8, byte r9) {
        /*
            int r9 = r9 * 3
            int r9 = 115 - r9
            int r8 = r8 * 3
            int r8 = r8 + 4
            byte[] r0 = com.google.android.material.progressindicator.IndeterminateDrawable.$$c
            int r7 = r7 * 2
            int r7 = r7 + 1
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L29
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L24:
            r3 = r0[r8]
            r6 = r3
            r3 = r9
            r9 = r6
        L29:
            int r9 = -r9
            int r9 = r9 + r3
            int r8 = r8 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.progressindicator.IndeterminateDrawable.$$g(int, int, byte):java.lang.String");
    }
}
