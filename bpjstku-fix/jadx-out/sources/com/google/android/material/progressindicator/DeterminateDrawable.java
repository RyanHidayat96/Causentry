package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ImageFormat;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.runtime.ComposerKt;
import androidx.core.math.MathUtils;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import defpackage.abortCapture;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes6.dex */
public final class DeterminateDrawable<S extends BaseProgressIndicatorSpec> extends DrawableWithAnimatedVisibilityChange {
    static final float GAP_RAMP_DOWN_THRESHOLD = 0.01f;
    private static final FloatPropertyCompat<DeterminateDrawable<?>> INDICATOR_LENGTH_IN_LEVEL;
    private static final int MAX_DRAWABLE_LEVEL = 10000;
    private static final float SPRING_FORCE_STIFFNESS = 50.0f;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static long b;
    private final DrawingDelegate.ActiveIndicator activeIndicator;
    private DrawingDelegate<S> drawingDelegate;
    private boolean skipAnimationOnLevelChange;
    private final SpringAnimation springAnimation;
    private final SpringForce springForce;
    private static final byte[] $$c = {17, 104, 102, -28};
    private static final int $$f = 64;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {17, 104, 102, -28, -12, -13, 0, -5, -13, 56, -61, -20, -5, -8, -1, -6, -25, 3, -14, -7, -13, Base64.padSymbol, -60, -27, 4, -11, 0, -9, -21, -9, Base64.padSymbol, -39, -28, -23, 38, -59, 4, -11, 0, -9, -21, 37, -49, -14, -6, 1, -4, -22, -41, 4, -19, 3, -14, -7, 22, -25, -32, 4, 0, -17, -14, 38, -52, 9, -14, -14, 0, -17, -14, -7, -5, 3, -6, -14, 0, -19, -5, -13, -6, -5, -13, 1, -7, -26, 5, -4, -26, 34, -42, 3, -9, -15, 0, -9, -9, -3, -28, 1, -16, 58};
    private static final int $$e = 45;
    private static final byte[] $$a = {107, 48, 57, 107, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 179;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;

    private static void a(byte b2, byte b3, int i, Object[] objArr) {
        int i2 = b3 * 52;
        byte[] bArr = $$a;
        int i3 = b2 + 84;
        int i4 = i + 4;
        byte[] bArr2 = new byte[i2 + 1];
        int i5 = -1;
        if (bArr == null) {
            int i6 = (i4 + (-i2)) - 11;
            i4 = i4;
            i3 = i6;
        }
        while (true) {
            int i7 = i4 + 1;
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i2) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i4 = i7;
            i3 = (i3 + (-bArr[i7])) - 11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 8
            int r0 = r7 + 45
            byte[] r1 = com.google.android.material.progressindicator.DeterminateDrawable.$$d
            int r8 = r8 * 44
            int r8 = r8 + 4
            int r6 = r6 * 23
            int r6 = 107 - r6
            byte[] r0 = new byte[r0]
            int r7 = r7 + 44
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L2d
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2d:
            int r8 = -r8
            int r6 = r6 + r8
            int r6 = r6 + (-8)
            int r8 = r3 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.progressindicator.DeterminateDrawable.d(int, int, int, java.lang.Object[]):void");
    }

    static /* synthetic */ float access$000(DeterminateDrawable determinateDrawable) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return determinateDrawable.getIndicatorFraction();
        }
        determinateDrawable.getIndicatorFraction();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ void access$100(DeterminateDrawable determinateDrawable, float f) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        determinateDrawable.setIndicatorFraction(f);
        if (i3 != 0) {
            throw null;
        }
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public final /* bridge */ /* synthetic */ void clearAnimationCallbacks() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        super.clearAnimationCallbacks();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getAlpha() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return super.getAlpha();
        }
        super.getAlpha();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getOpacity() {
        int opacity;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 31;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            opacity = super.getOpacity();
            int i3 = 85 / 0;
        } else {
            opacity = super.getOpacity();
        }
        int i4 = TuitionPaymentFragmentbindingInflater1 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return opacity;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public final /* bridge */ /* synthetic */ boolean hideNow() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return super.hideNow();
        }
        super.hideNow();
        throw null;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public final /* bridge */ /* synthetic */ boolean isHiding() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsHiding = super.isHiding();
        int i4 = TuitionPaymentFragmentbindingInflater1 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return zIsHiding;
        }
        throw null;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public final /* bridge */ /* synthetic */ boolean isRunning() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsRunning = super.isRunning();
        int i4 = TuitionPaymentFragmentbindingInflater1 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return zIsRunning;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public final /* bridge */ /* synthetic */ boolean isShowing() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            super.isShowing();
            throw null;
        }
        boolean zIsShowing = super.isShowing();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 41 / 0;
        }
        return zIsShowing;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public final /* bridge */ /* synthetic */ void registerAnimationCallback(Animatable2Compat.AnimationCallback animationCallback) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        super.registerAnimationCallback(animationCallback);
        if (i3 == 0) {
            int i4 = 40 / 0;
        }
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ void setAlpha(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        super.setAlpha(i);
        int i5 = TuitionPaymentFragmentbindingInflater1 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        super.setColorFilter(colorFilter);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.setVisible(z, z2);
            obj.hashCode();
            throw null;
        }
        boolean visible = super.setVisible(z, z2);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 == 0) {
            return visible;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public final /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2, boolean z3) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            super.setVisible(z, z2, z3);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean visible = super.setVisible(z, z2, z3);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        return visible;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public final /* bridge */ /* synthetic */ void start() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        super.start();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public final /* bridge */ /* synthetic */ void stop() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        super.stop();
        if (i3 == 0) {
            int i4 = 17 / 0;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public final /* bridge */ /* synthetic */ boolean unregisterAnimationCallback(Animatable2Compat.AnimationCallback animationCallback) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        boolean zUnregisterAnimationCallback = super.unregisterAnimationCallback(animationCallback);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return zUnregisterAnimationCallback;
        }
        throw null;
    }

    DeterminateDrawable(Context context, BaseProgressIndicatorSpec baseProgressIndicatorSpec, DrawingDelegate<S> drawingDelegate) {
        super(context, baseProgressIndicatorSpec);
        this.skipAnimationOnLevelChange = false;
        setDrawingDelegate(drawingDelegate);
        this.activeIndicator = new DrawingDelegate.ActiveIndicator();
        SpringForce springForce = new SpringForce();
        this.springForce = springForce;
        springForce.setDampingRatio(1.0f);
        springForce.setStiffness(50.0f);
        SpringAnimation springAnimation = new SpringAnimation(this, INDICATOR_LENGTH_IN_LEVEL);
        this.springAnimation = springAnimation;
        springAnimation.setSpring(springForce);
        setGrowFraction(1.0f);
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(b ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        int i3 = $11 + 63;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (abortcapture.b < cArrB.length) {
            int i5 = $10 + 7;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i7 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(b)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64838 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 1356 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 39 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 894276454, false, $$g(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 47773), (ViewConfiguration.getWindowTouchSlop() >> 8) + 468, (ViewConfiguration.getScrollBarSize() >> 8) + 13, 896083767, false, "n", new Class[]{Object.class, Object.class});
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
    }

    public static DeterminateDrawable<LinearProgressIndicatorSpec> createLinearDrawable(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        int i = 2 % 2;
        DeterminateDrawable<LinearProgressIndicatorSpec> determinateDrawableCreateLinearDrawable = createLinearDrawable(context, linearProgressIndicatorSpec, new LinearDrawingDelegate(linearProgressIndicatorSpec));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        return determinateDrawableCreateLinearDrawable;
    }

    static DeterminateDrawable<LinearProgressIndicatorSpec> createLinearDrawable(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec, LinearDrawingDelegate linearDrawingDelegate) {
        int i = 2 % 2;
        DeterminateDrawable<LinearProgressIndicatorSpec> determinateDrawable = new DeterminateDrawable<>(context, linearProgressIndicatorSpec, linearDrawingDelegate);
        int i2 = TuitionPaymentFragmentbindingInflater1 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 35 / 0;
        }
        return determinateDrawable;
    }

    public static DeterminateDrawable<CircularProgressIndicatorSpec> createCircularDrawable(Context context, CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        int i = 2 % 2;
        DeterminateDrawable<CircularProgressIndicatorSpec> determinateDrawableCreateCircularDrawable = createCircularDrawable(context, circularProgressIndicatorSpec, new CircularDrawingDelegate(circularProgressIndicatorSpec));
        int i2 = TuitionPaymentFragmentbindingInflater1 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 30 / 0;
        }
        return determinateDrawableCreateCircularDrawable;
    }

    static DeterminateDrawable<CircularProgressIndicatorSpec> createCircularDrawable(Context context, CircularProgressIndicatorSpec circularProgressIndicatorSpec, CircularDrawingDelegate circularDrawingDelegate) {
        int i = 2 % 2;
        DeterminateDrawable<CircularProgressIndicatorSpec> determinateDrawable = new DeterminateDrawable<>(context, circularProgressIndicatorSpec, circularDrawingDelegate);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        return determinateDrawable;
    }

    public final void addSpringAnimationEndListener(DynamicAnimation.OnAnimationEndListener onAnimationEndListener) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            this.springAnimation.addEndListener(onAnimationEndListener);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.springAnimation.addEndListener(onAnimationEndListener);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void removeSpringAnimationEndListener(DynamicAnimation.OnAnimationEndListener onAnimationEndListener) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        this.springAnimation.removeEndListener(onAnimationEndListener);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    final boolean setVisibleInternal(boolean z, boolean z2, boolean z3) {
        int i = 2 % 2;
        boolean visibleInternal = super.setVisibleInternal(z, z2, z3);
        float systemAnimatorDurationScale = this.animatorDurationScaleProvider.getSystemAnimatorDurationScale(this.context.getContentResolver());
        if (systemAnimatorDurationScale != 0.0f) {
            this.skipAnimationOnLevelChange = false;
            this.springForce.setStiffness(50.0f / systemAnimatorDurationScale);
            int i2 = TuitionPaymentFragmentbindingInflater1 + 37;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 54 / 0;
            }
            return visibleInternal;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        this.skipAnimationOnLevelChange = true;
        return visibleInternal;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        float level;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            this.springAnimation.skipToEnd();
            level = getLevel() + 10000.0f;
        } else {
            this.springAnimation.skipToEnd();
            level = getLevel() / 10000.0f;
        }
        setIndicatorFraction(level);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 75;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0222  */
    /* JADX WARN: Type inference failed for: r2v27, types: [boolean, int] */
    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) throws Throwable {
        Object[] objArr;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
            int gidForName = 875 - Process.getGidForName("");
            int i5 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 9;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a((byte) 14, bArr[7], (byte) (-bArr[5]), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, gidForName, i5, 252381699, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{60462, 60495, 1888, 3351, 30045, 24843, 12100, 50213, 16131, 12669, 18863, 30716, 48265, 22405, 4489, 24125, 38267, 36385, 63607, 42607, 19923, 42749, 49395, 36553, 9657, 55665}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{53778, 53879, 42160, 44741, 26990, 32061, 45424, 64005, 40157, 44875, 21916, 59830, 33471, 62533, 3576, 49196, 43863, 11757, 58453}, 1 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
            int keyRepeatDelay = 876 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 10;
            byte[] bArr2 = $$a;
            byte b2 = bArr2[7];
            byte b3 = bArr2[5];
            Object[] objArr5 = new Object[1];
            a(b2, b3, (byte) (-b3), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(capsMode, keyRepeatDelay, iCombineMeasuredStates, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char mirror = (char) (AndroidCharacter.getMirror('0') - '0');
                int iMyTid = (Process.myTid() >> 22) + 876;
                int keyRepeatDelay2 = 10 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                byte[] bArr3 = $$a;
                byte b4 = bArr3[10];
                byte b5 = bArr3[7];
                Object[] objArr6 = new Object[1];
                a(b4, b5, (byte) (b5 | 51), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mirror, iMyTid, keyRepeatDelay2, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[]{i ^ (i << 5)}, new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int i6 = ~i;
            int i7 = (((2062025968 + (((~((-697821) | i6)) | (~(39776252 | i))) * (-831))) + ((~((-163845) | i)) * (-1662))) + ((((~(i6 | (-39612409))) | (~(39612408 | i))) | (~(697820 | i))) * 831)) - 372878042;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{6258, 6163, 58727, 61200, 13119, 10089, 2461, 12409, 56580, 6052, 4045, 20773, 18651, 46465, 22453, 30873, 24863, 27702, 48661, 32954, 47508, 17616, 34441, 43014, 53714, 15221, 60779, 65534, 59979, 4869}, Color.argb(0, 0, 0, 0) + 1, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{9166, 9133, 'l', 2560, 40667, 35483, 3475, 3023, 14355, 5034, 41529, 21828, 29558, 20625, 64077, 31952, 23169, 35108, 5105, 33972, 33329, 41415}, 1 - (ViewConfiguration.getTapTimeout() >> 16), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i10 = TuitionPaymentFragmentbindingInflater1 + 57;
                int i11 = i10 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11;
                int i12 = i10 % 2;
                if (!(!(applicationContext instanceof ContextWrapper))) {
                    int i13 = i11 + 7;
                    TuitionPaymentFragmentbindingInflater1 = i13 % 128;
                    if (i13 % 2 != 0) {
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
            int i14 = TuitionPaymentFragmentbindingInflater1 + 37;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 4 % 3;
            }
            try {
                Object[] objArr10 = {applicationContext, Integer.valueOf(i), -372878042};
                byte[] bArr4 = $$d;
                byte b6 = bArr4[6];
                byte b7 = b6;
                Object[] objArr11 = new Object[1];
                d(b6, b7, b7, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b8 = bArr4[45];
                byte b9 = b8;
                Object[] objArr12 = new Object[1];
                d(b8, b9, b9, objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cArgb = (char) Color.argb(0, 0, 0, 0);
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 876;
                        int i16 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10;
                        byte[] bArr5 = $$a;
                        byte b10 = bArr5[10];
                        byte b11 = bArr5[7];
                        Object[] objArr14 = new Object[1];
                        a(b10, b11, (byte) (b11 | 51), objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cArgb, minimumFlingVelocity, i16, 256017550, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                    try {
                        Object[] objArr15 = new Object[1];
                        c(new char[]{60462, 60495, 1888, 3351, 30045, 24843, 12100, 50213, 16131, 12669, 18863, 30716, 48265, 22405, 4489, 24125, 38267, 36385, 63607, 42607, 19923, 42749, 49395, 36553, 9657, 55665}, View.combineMeasuredStates(0, 0) + 1, objArr15);
                        Class<?> cls4 = Class.forName((String) objArr15[0]);
                        Object[] objArr16 = new Object[1];
                        c(new char[]{53778, 53879, 42160, 44741, 26990, 32061, 45424, 64005, 40157, 44875, 21916, 59830, 33471, 62533, 3576, 49196, 43863, 11757, 58453}, 1 - (Process.myTid() >> 22), objArr16);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c2 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                            int mode = View.MeasureSpec.getMode(0) + 876;
                            int scrollBarFadeDuration = 10 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            byte[] bArr6 = $$a;
                            byte b12 = bArr6[7];
                            byte b13 = bArr6[5];
                            Object[] objArr17 = new Object[1];
                            a(b12, b13, (byte) (-b13), objArr17);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, mode, scrollBarFadeDuration, 2009631821, false, (String) objArr17[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c3 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                            int iAxisFromString = 875 - MotionEvent.axisFromString("");
                            int jumpTapTimeout = 10 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                            byte[] bArr7 = $$a;
                            Object[] objArr18 = new Object[1];
                            a((byte) 14, bArr7[7], (byte) (-bArr7[5]), objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, iAxisFromString, jumpTapTimeout, 252381699, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr13;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i17 = ((int[]) objArr[2])[0];
        int i18 = ((int[]) objArr[0])[0];
        if (i18 != i17) {
            throw new RuntimeException(String.valueOf(i18));
        }
        int i19 = ((int[]) objArr[1])[0];
        Object[] objArr19 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int i20 = ~Process.myTid();
        int i21 = i19 + 1053706508 + (((~((-448813911) | i20)) | 408503681) * (-933)) + (((~(i20 | 408503681)) | (-450453464)) * 933) + 1529702949;
        int i22 = (i21 << 13) ^ i21;
        int i23 = i22 ^ (i22 >>> 17);
        ((int[]) objArr19[1])[0] = i23 ^ (i23 << 5);
        if (!(!this.skipAnimationOnLevelChange)) {
            this.springAnimation.skipToEnd();
            setIndicatorFraction(i / 10000.0f);
            int i24 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
            TuitionPaymentFragmentbindingInflater1 = i24 % 128;
            int i25 = i24 % 2;
        } else {
            this.springAnimation.setStartValue(getIndicatorFraction() * 10000.0f);
            this.springAnimation.animateToFinalPosition(i);
        }
        int i26 = ((int[]) objArr19[1])[0];
        int i27 = i26 * i26;
        int i28 = -(1637064507 * i26);
        int i29 = ((i27 | i28) << 1) - (i27 ^ i28);
        int i30 = -(i26 * 1313875599);
        int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
        int i32 = (i31 ^ (-1572658983)) + (((-1572658983) & i31) << 1);
        int i33 = ((i32 >> 16) - 131071) / 65536;
        int i34 = (i33 & 1) + (i33 | 1);
        int i35 = ((i32 | i34) << 1) - (i34 ^ i32);
        int i36 = i32 >> 29;
        int i37 = (((i36 | (-15)) << 1) - (i36 ^ (-15))) / 8;
        int i38 = -(i35 ^ ((i37 & 1) + (i37 | 1)));
        int i39 = ((i38 | 8) << 1) - (i38 ^ 8);
        int i40 = i39 >> 26;
        int i41 = ((i40 ^ ComposerKt.defaultsKey) + ((i40 & ComposerKt.defaultsKey) << 1)) / 64;
        int i42 = (i41 ^ 1) + ((i41 & 1) << 1);
        return 11976 / (((-((i42 ^ 1) + ((i42 & 1) << 1))) & i39) * 1497);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 21;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        int preferredWidth = this.drawingDelegate.getPreferredWidth();
        if (i3 != 0) {
            int i4 = 28 / 0;
        }
        return preferredWidth;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 69;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        int preferredHeight = this.drawingDelegate.getPreferredHeight();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            return preferredHeight;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final void setLevelByFraction(float f) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        setLevel((int) (f * 10000.0f));
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) throws IllegalAccessException {
        int i = 2 % 2;
        Rect rect = new Rect();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - Color.blue(0)), Color.argb(0, 0, 0, 0) + 40, 19 - TextUtils.getTrimmedLength(""), 1513912262, false, "b", null);
        }
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37835 - TextUtils.indexOf((CharSequence) "", '0', 0)), TextUtils.indexOf("", "", 0) + 59, 19 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
        }
        int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
        long j = i3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (37837 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 59 - View.MeasureSpec.getSize(0), TextUtils.lastIndexOf("", '0', 0) + 19, 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        int i4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
        long j2 = -1;
        long j3 = j2 ^ 2092936280947221806L;
        long j4 = 333;
        long jIdentityHashCode = System.identityHashCode(this);
        long j5 = jIdentityHashCode ^ j2;
        long j6 = (((long) (-665)) * 2092936280947221806L) + (((long) 334) * 3426317216212564433L) + (((long) (-333)) * j3) + ((((j3 | j5) ^ j2) | ((jIdentityHashCode | 3426317216212564433L) ^ j2)) * j4) + (j4 * (((j3 | jIdentityHashCode) ^ j2) | ((j5 | 3426317216212564433L) ^ j2)));
        long j7 = j;
        int i5 = 0;
        while (true) {
            int i6 = 0;
            while (i6 != 8) {
                int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
                TuitionPaymentFragmentbindingInflater1 = i7 % 128;
                if (i7 % 2 != 0) {
                    i4 = (((((int) (j7 >>> i6)) & 4692) >> (i4 + 93)) >> (i4 * 102)) % i4;
                    i6 += 120;
                } else {
                    i4 = (((((int) (j7 >> i6)) & 255) + (i4 << 6)) + (i4 << 16)) - i4;
                    i6++;
                }
            }
            if (i5 != 0) {
                break;
            }
            i5++;
            j7 = j6;
        }
        if (i4 != i2) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 46400), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 40, 18 - ImageFormat.getBitsPerPixel(0), -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
            throw new RuntimeException(String.valueOf(i3));
        }
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
            TuitionPaymentFragmentbindingInflater1 = i8 % 128;
            int i9 = i8 % 2;
            canvas.save();
            this.drawingDelegate.validateSpecAndAdjustCanvas(canvas, getBounds(), getGrowFraction(), isShowing(), isHiding());
            this.paint.setStyle(Paint.Style.FILL);
            this.paint.setAntiAlias(true);
            this.activeIndicator.color = this.baseSpec.indicatorColors[0];
            if (this.baseSpec.indicatorTrackGapSize > 0) {
                int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 43;
                TuitionPaymentFragmentbindingInflater1 = i10 % 128;
                int i11 = i10 % 2;
                this.drawingDelegate.fillTrack(canvas, this.paint, getIndicatorFraction(), 1.0f, this.baseSpec.trackColor, getAlpha(), this.drawingDelegate instanceof LinearDrawingDelegate ? this.baseSpec.indicatorTrackGapSize : (int) ((this.baseSpec.indicatorTrackGapSize * MathUtils.clamp(getIndicatorFraction(), 0.0f, 0.01f)) / 0.01f));
            } else {
                this.drawingDelegate.fillTrack(canvas, this.paint, 0.0f, 1.0f, this.baseSpec.trackColor, getAlpha(), 0);
            }
            this.drawingDelegate.fillIndicator(canvas, this.paint, this.activeIndicator, getAlpha());
            this.drawingDelegate.drawStopIndicator(canvas, this.paint, this.baseSpec.indicatorColors[0], getAlpha());
            canvas.restore();
        }
        int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
        TuitionPaymentFragmentbindingInflater1 = i12 % 128;
        int i13 = i12 % 2;
    }

    private float getIndicatorFraction() {
        float f;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            f = this.activeIndicator.endFraction;
            int i3 = 92 / 0;
        } else {
            f = this.activeIndicator.endFraction;
        }
        int i4 = TuitionPaymentFragmentbindingInflater1 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return f;
        }
        throw null;
    }

    private void setIndicatorFraction(float f) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            this.activeIndicator.endFraction = f;
            invalidateSelf();
            throw null;
        }
        this.activeIndicator.endFraction = f;
        invalidateSelf();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 83 / 0;
        }
    }

    final DrawingDelegate<S> getDrawingDelegate() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        DrawingDelegate<S> drawingDelegate = this.drawingDelegate;
        int i4 = i2 + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return drawingDelegate;
    }

    final void setDrawingDelegate(DrawingDelegate<S> drawingDelegate) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.drawingDelegate = drawingDelegate;
        if (i3 != 0) {
            throw null;
        }
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        INDICATOR_LENGTH_IN_LEVEL = new FloatPropertyCompat<DeterminateDrawable<?>>("indicatorLevel") { // from class: com.google.android.material.progressindicator.DeterminateDrawable.1
            @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
            public float getValue(DeterminateDrawable<?> determinateDrawable) {
                return DeterminateDrawable.access$000((DeterminateDrawable) determinateDrawable) * 10000.0f;
            }

            @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
            public void setValue(DeterminateDrawable<?> determinateDrawable, float f) {
                DeterminateDrawable.access$100(determinateDrawable, f / 10000.0f);
            }
        };
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
        if (i % 2 == 0) {
            int i2 = 8 / 0;
        }
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        b = -5499669705293373313L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, short r7, int r8) {
        /*
            int r6 = r6 * 4
            int r0 = r6 + 1
            int r7 = r7 * 3
            int r7 = 3 - r7
            int r8 = r8 * 4
            int r8 = 107 - r8
            byte[] r1 = com.google.android.material.progressindicator.DeterminateDrawable.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r6
            r4 = r2
            goto L2c
        L16:
            r3 = r2
        L17:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            r4 = r1[r7]
            int r3 = r3 + 1
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2c:
            int r8 = -r8
            int r8 = r8 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.progressindicator.DeterminateDrawable.$$g(byte, short, int):java.lang.String");
    }
}
