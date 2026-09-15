package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MotionUtils;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes6.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    private static final int DEFAULT_ENTER_ANIMATION_DURATION_MS = 225;
    private static final int DEFAULT_EXIT_ANIMATION_DURATION_MS = 175;
    public static final int STATE_SCROLLED_DOWN = 1;
    public static final int STATE_SCROLLED_UP = 2;
    private int additionalHiddenOffsetY;
    private ViewPropertyAnimator currentAnimator;
    private int currentState;
    private int enterAnimDuration;
    private TimeInterpolator enterAnimInterpolator;
    private int exitAnimDuration;
    private TimeInterpolator exitAnimInterpolator;
    private int height;
    private final LinkedHashSet<OnScrollStateChangedListener> onScrollStateChangedListeners;
    private static final int ENTER_ANIM_DURATION_ATTR = R.attr.motionDurationLong2;
    private static final int EXIT_ANIM_DURATION_ATTR = R.attr.motionDurationMedium4;
    private static final int ENTER_EXIT_ANIM_EASING_ATTR = R.attr.motionEasingEmphasizedInterpolator;

    public interface OnScrollStateChangedListener {
        void onStateChanged(View view, int i);
    }

    /* JADX INFO: loaded from: classes5.dex */
    public @interface ScrollState {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior() {
        this.onScrollStateChangedListeners = new LinkedHashSet<>();
        this.height = 0;
        this.currentState = 2;
        this.additionalHiddenOffsetY = 0;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.onScrollStateChangedListeners = new LinkedHashSet<>();
        this.height = 0;
        this.currentState = 2;
        this.additionalHiddenOffsetY = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.height = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        this.enterAnimDuration = MotionUtils.resolveThemeDuration(v.getContext(), ENTER_ANIM_DURATION_ATTR, DEFAULT_ENTER_ANIMATION_DURATION_MS);
        this.exitAnimDuration = MotionUtils.resolveThemeDuration(v.getContext(), EXIT_ANIM_DURATION_ATTR, DEFAULT_EXIT_ANIMATION_DURATION_MS);
        Context context = v.getContext();
        int i2 = ENTER_EXIT_ANIM_EASING_ATTR;
        this.enterAnimInterpolator = MotionUtils.resolveThemeInterpolator(context, i2, AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        this.exitAnimInterpolator = MotionUtils.resolveThemeInterpolator(v.getContext(), i2, AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR);
        return super.onLayoutChild(coordinatorLayout, v, i);
    }

    public void setAdditionalHiddenOffsetY(V v, int i) {
        this.additionalHiddenOffsetY = i;
        if (this.currentState == 1) {
            v.setTranslationY(this.height + i);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            slideDown(v);
        } else if (i2 < 0) {
            slideUp(v);
        }
    }

    public boolean isScrolledUp() {
        return this.currentState == 2;
    }

    public void slideUp(V v) {
        slideUp(v, true);
    }

    public void slideUp(V v, boolean z) {
        if (isScrolledUp()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.currentAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        updateCurrentState(v, 2);
        if (z) {
            animateChildTo(v, 0, this.enterAnimDuration, this.enterAnimInterpolator);
        } else {
            v.setTranslationY(0.0f);
        }
    }

    public boolean isScrolledDown() {
        return this.currentState == 1;
    }

    public void slideDown(V v) {
        slideDown(v, true);
    }

    public void slideDown(V v, boolean z) {
        if (isScrolledDown()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.currentAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        updateCurrentState(v, 1);
        int i = this.height + this.additionalHiddenOffsetY;
        if (z) {
            animateChildTo(v, i, this.exitAnimDuration, this.exitAnimInterpolator);
        } else {
            v.setTranslationY(i);
        }
    }

    private void updateCurrentState(V v, int i) {
        this.currentState = i;
        Iterator<OnScrollStateChangedListener> it = this.onScrollStateChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().onStateChanged(v, this.currentState);
        }
    }

    private void animateChildTo(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.currentAnimator = v.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.behavior.HideBottomViewOnScrollBehavior.1
            private static final byte[] $$c = {117, 50, 102, 124};
            private static final int $$f = 21;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {14, 70, 6, -35, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 54, 3, 3, -72, 60, -11, -7, 15, -1, -6, -16, 5, -11, 6, 3, -73, 56, 2, 3, -18, 10, -7, -16, 8, -65, 73, -3, -27, 1};
            private static final int $$e = 147;
            private static final byte[] $$a = {87, -91, 60, 112, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
            private static final int $$b = 191;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            private static int b = 1;
            private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {6906, 2172, 16365, 11634, 20688, 18015, 30153, 39690, 36540, 48185, 41967, 53547, 50318, 59933, 6545, 3321, 12902, 8641, 22357, 31455, 26700, 40909, 16, 4752, 9478, 14238, 18978, 23741, 28455, 33176, 37976, 42693, 47427, 52194, 56944, 61677, 878, 60745, 65483, 51271, 56025, 42793, 45538, 33396, 27890, 30988, 19420, 21546, 9913, 13116, 7586, 60984, 64329, 39929, 35197, 48871, 44133, 53696, 51028, 62674, 6742, 3984, 15648, 8889, 20507, 17855, 27402, 39050, 36338};
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 7737324957269533461L;

            /* JADX WARN: Code duplicated, block: B:10:0x002a  */
            /* JADX WARN: Code duplicated, block: B:8:0x0022  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(byte r7, short r8, short r9, java.lang.Object[] r10) {
                /*
                    int r7 = r7 * 15
                    int r7 = 53 - r7
                    byte[] r0 = com.google.android.material.behavior.HideBottomViewOnScrollBehavior.AnonymousClass1.$$a
                    int r8 = r8 * 52
                    int r8 = 108 - r8
                    int r9 = r9 * 4
                    int r9 = 84 - r9
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r3 = r7
                    r9 = r8
                    r4 = r2
                    goto L2c
                L17:
                    r3 = r2
                    r6 = r9
                    r9 = r8
                    r8 = r6
                L1b:
                    int r4 = r3 + 1
                    byte r5 = (byte) r8
                    r1[r3] = r5
                    if (r4 != r7) goto L2a
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L2a:
                    r3 = r0[r9]
                L2c:
                    int r3 = -r3
                    int r8 = r8 + r3
                    int r8 = r8 + (-11)
                    int r9 = r9 + 1
                    r3 = r4
                    goto L1b
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.HideBottomViewOnScrollBehavior.AnonymousClass1.a(byte, short, short, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0023  */
            /* JADX WARN: Code duplicated, block: B:8:0x001b  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(int r7, byte r8, byte r9, java.lang.Object[] r10) {
                /*
                    int r8 = r8 + 98
                    int r7 = r7 + 4
                    byte[] r0 = com.google.android.material.behavior.HideBottomViewOnScrollBehavior.AnonymousClass1.$$d
                    int r9 = r9 * 47
                    int r9 = 48 - r9
                    byte[] r1 = new byte[r9]
                    r2 = 0
                    if (r0 != 0) goto L13
                    r8 = r7
                    r3 = r9
                    r4 = r2
                    goto L2a
                L13:
                    r3 = r2
                L14:
                    int r4 = r3 + 1
                    byte r5 = (byte) r8
                    r1[r3] = r5
                    if (r4 != r9) goto L23
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L23:
                    int r7 = r7 + 1
                    r3 = r0[r7]
                    r6 = r8
                    r8 = r7
                    r7 = r6
                L2a:
                    int r7 = r7 + r3
                    int r7 = r7 + 3
                    r3 = r4
                    r6 = r8
                    r8 = r7
                    r7 = r6
                    goto L14
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.HideBottomViewOnScrollBehavior.AnonymousClass1.d(int, byte, byte, java.lang.Object[]):void");
            }

            private static void c(int i2, int i3, char c, Object[] objArr) throws Throwable {
                int i4 = 2;
                int i5 = 2 % 2;
                lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
                long[] jArr = new long[i3];
                lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i3) {
                    int i6 = $11 + 19;
                    $10 = i6 % 128;
                    if (i6 % i4 == 0) {
                        int i7 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1[i2 + i7])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), (-16775029) - Color.rgb(0, 0, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 39, 841711447, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33017 - (ViewConfiguration.getScrollBarSize() >> 8)), TextUtils.indexOf("", "", 0) + 3011, 25 - Process.getGidForName(""), 321985076, false, $$g(b4, b5, (byte) (b5 + 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                        Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36506 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 3376, 16 - ImageFormat.getBitsPerPixel(0), -968507904, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    } else {
                        int i8 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        try {
                            Object[] objArr5 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1[i2 >> i8])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b8 = (byte) 0;
                                byte b9 = b8;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2187, 40 - View.MeasureSpec.getMode(0), 841711447, false, $$g(b8, b9, b9), new Class[]{Integer.TYPE});
                            }
                            Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i8), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), Integer.valueOf(c)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                byte b10 = (byte) 0;
                                byte b11 = b10;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (33018 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3011, 26 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 321985076, false, $$g(b10, b11, (byte) (b11 + 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                            }
                            jArr[i8] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                            Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                byte b12 = (byte) 0;
                                byte b13 = b12;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (36553 - AndroidCharacter.getMirror('0')), 3376 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 16 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -968507904, false, $$g(b12, b13, (byte) (b13 + 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    i4 = 2;
                }
                char[] cArr = new char[i3];
                lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i3) {
                    cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                    Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        byte b14 = (byte) 0;
                        byte b15 = b14;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) (36505 - (ViewConfiguration.getWindowTouchSlop() >> 8)), View.MeasureSpec.makeMeasureSpec(0, 0) + 3376, View.combineMeasuredStates(0, 0) + 17, -968507904, false, $$g(b14, b15, (byte) (b15 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
                }
                objArr[0] = new String(cArr);
                int i9 = $10 + 93;
                $11 = i9 % 128;
                int i10 = i9 % 2;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) throws Throwable {
                Object[] objArr;
                int i2 = 2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 43042);
                    int deadChar = KeyEvent.getDeadChar(0, 0) + 3111;
                    int capsMode = 22 - TextUtils.getCapsMode("", 0, 0);
                    byte[] bArr = $$a;
                    byte b2 = bArr[7];
                    Object[] objArr2 = new Object[1];
                    a(b2, bArr[40], b2, objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cNormalizeMetaState, deadChar, capsMode, -1272852037, false, (String) objArr2[0], null);
                }
                long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 22 - Color.red(0), (char) (43783 - Color.argb(0, 0, 0, 0)), objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(22 - TextUtils.getOffsetBefore("", 0), 15 - (ViewConfiguration.getTouchSlop() >> 8), (char) (45545 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char absoluteGravity = (char) (43042 - Gravity.getAbsoluteGravity(0, 0));
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3111;
                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 22;
                    byte[] bArr2 = $$a;
                    byte b3 = bArr2[7];
                    Object[] objArr5 = new Object[1];
                    a(b3, bArr2[5], b3, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(absoluteGravity, scrollBarFadeDuration, maxKeyCode, -1269618118, false, (String) objArr5[0], null);
                }
                if (j2 == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char c = (char) (43043 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                        int iAxisFromString = MotionEvent.axisFromString("") + 3112;
                        int mirror = AndroidCharacter.getMirror('0') - 26;
                        byte[] bArr3 = $$a;
                        byte b4 = bArr3[5];
                        byte b5 = bArr3[7];
                        Object[] objArr6 = new Object[1];
                        a(b4, b5, b5, objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, iAxisFromString, mirror, 154975793, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    int i3 = ((int[]) objArr7[2])[0];
                    int i4 = ((int[]) objArr7[1])[0];
                    String[] strArr = (String[]) objArr7[3];
                    int[] iArr = {i3};
                    int i5 = ~((int) Process.getStartUptimeMillis());
                    int i6 = 426838298 + (((~(1537191650 | i5)) | 167839808) * (-828)) + ((i5 | 1537191650) * (-828)) + 629764702;
                    int i7 = (i6 << 13) ^ i6;
                    int i8 = i7 ^ (i7 >>> 17);
                    ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
                    objArr = new Object[]{new int[1], new int[]{i4}, iArr, strArr};
                } else {
                    Object[] objArr8 = new Object[1];
                    c((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 36, 15 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (23743 - Color.green(0)), objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(53 - TextUtils.indexOf("", "", 0), 16 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10764), objArr9);
                    int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
                    int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
                    b = i9 % 128;
                    int i10 = i9 % 2;
                    try {
                        Object[] objArr10 = {null, Integer.valueOf(iIntValue), 0, 2114132114};
                        byte[] bArr4 = $$d;
                        byte b6 = bArr4[30];
                        byte b7 = bArr4[50];
                        Object[] objArr11 = new Object[1];
                        d(b6, b7, (byte) (b7 - 1), objArr11);
                        Class<?> cls3 = Class.forName((String) objArr11[0]);
                        byte b8 = bArr4[50];
                        Object[] objArr12 = new Object[1];
                        d((byte) 46, (byte) (b8 - 1), b8, objArr12);
                        objArr = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cIndexOf = (char) (43042 - TextUtils.indexOf("", "", 0));
                            int iResolveSize = View.resolveSize(0, 0) + 3111;
                            int iKeyCodeFromString = 22 - KeyEvent.keyCodeFromString("");
                            byte[] bArr5 = $$a;
                            byte b9 = bArr5[5];
                            byte b10 = bArr5[7];
                            Object[] objArr13 = new Object[1];
                            a(b9, b10, b10, objArr13);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, iResolveSize, iKeyCodeFromString, 154975793, false, (String) objArr13[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                        try {
                            Object[] objArr14 = new Object[1];
                            c(View.resolveSize(0, 0), 22 - KeyEvent.getDeadChar(0, 0), (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 43783), objArr14);
                            Class<?> cls4 = Class.forName((String) objArr14[0]);
                            Object[] objArr15 = new Object[1];
                            c((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 16, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 45544), objArr15);
                            long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char cAlpha = (char) (Color.alpha(0) + 43042);
                                int iAxisFromString2 = 3110 - MotionEvent.axisFromString("");
                                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22;
                                byte[] bArr6 = $$a;
                                byte b11 = bArr6[7];
                                Object[] objArr16 = new Object[1];
                                a(b11, bArr6[5], b11, objArr16);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cAlpha, iAxisFromString2, maximumDrawingCacheSize, -1269618118, false, (String) objArr16[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char c2 = (char) (43043 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                                int keyRepeatDelay = 3111 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                int iIndexOf = 22 - TextUtils.indexOf("", "", 0, 0);
                                byte[] bArr7 = $$a;
                                byte b12 = bArr7[7];
                                Object[] objArr17 = new Object[1];
                                a(b12, bArr7[40], b12, objArr17);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, keyRepeatDelay, iIndexOf, -1272852037, false, (String) objArr17[0], null);
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
                int i12 = ((int[]) objArr[2])[0];
                if (i12 == i11) {
                    int i13 = ((int[]) objArr[0])[0];
                    int i14 = ((int[]) objArr[2])[0];
                    int i15 = ((int[]) objArr[1])[0];
                    String[] strArr2 = (String[]) objArr[3];
                    int[] iArr2 = {i14};
                    int i16 = ~(Process.myUid() | 241628594);
                    int i17 = i13 + (((1499411650 | i16) * (-658)) - 1441551034) + ((i16 | 1360592960) * 658);
                    int i18 = (i17 << 13) ^ i17;
                    int i19 = i18 ^ (i18 >>> 17);
                    ((int[]) objArr[0])[0] = i19 ^ (i19 << 5);
                    Object[] objArr18 = {new int[1], new int[]{i15}, iArr2, strArr2};
                } else {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr3 = (String[]) objArr[3];
                    if (strArr3 != null) {
                        int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
                        b = i20 % 128;
                        int i21 = i20 % 2;
                        for (String str : strArr3) {
                            arrayList.add(str);
                        }
                    }
                    int[] iArr3 = new int[i12];
                    int i22 = i12 - 1;
                    iArr3[i22] = 1;
                    Toast.makeText((Context) null, iArr3[((i12 * i22) % 2) - 1], 1).show();
                    int i23 = ((int[]) objArr[0])[0];
                    int i24 = ((int[]) objArr[2])[0];
                    int i25 = ((int[]) objArr[1])[0];
                    String[] strArr4 = (String[]) objArr[3];
                    int[] iArr4 = {i24};
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i26 = ~((-1109263385) | iIdentityHashCode);
                    int i27 = i23 + 924587578 + ((268481026 | i26) * (-476)) + (i26 * 952) + ((~((~iIdentityHashCode) | (-1109263385))) * 476);
                    int i28 = (i27 << 13) ^ i27;
                    int i29 = i28 ^ (i28 >>> 17);
                    ((int[]) objArr[0])[0] = i29 ^ (i29 << 5);
                    Object[] objArr19 = {new int[1], new int[]{i25}, iArr4, strArr4};
                }
                HideBottomViewOnScrollBehavior.this.currentAnimator = null;
                int i30 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
                b = i30 % 128;
                if (i30 % 2 == 0) {
                    int i31 = 30 / 0;
                }
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0022  */
            /* JADX WARN: Code duplicated, block: B:8:0x001c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(byte r6, byte r7, int r8) {
                /*
                    int r8 = r8 * 3
                    int r8 = r8 + 109
                    byte[] r0 = com.google.android.material.behavior.HideBottomViewOnScrollBehavior.AnonymousClass1.$$c
                    int r6 = r6 * 4
                    int r1 = r6 + 1
                    int r7 = r7 * 2
                    int r7 = r7 + 4
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    if (r0 != 0) goto L16
                    r3 = r6
                    r4 = r2
                    goto L2a
                L16:
                    r3 = r2
                L17:
                    byte r4 = (byte) r8
                    r1[r3] = r4
                    if (r3 != r6) goto L22
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L22:
                    int r3 = r3 + 1
                    r4 = r0[r7]
                    r5 = r3
                    r3 = r8
                    r8 = r4
                    r4 = r5
                L2a:
                    int r8 = -r8
                    int r8 = r8 + r3
                    int r7 = r7 + 1
                    r3 = r4
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.HideBottomViewOnScrollBehavior.AnonymousClass1.$$g(byte, byte, int):java.lang.String");
            }
        });
    }

    public void addOnScrollStateChangedListener(OnScrollStateChangedListener onScrollStateChangedListener) {
        this.onScrollStateChangedListeners.add(onScrollStateChangedListener);
    }

    public void removeOnScrollStateChangedListener(OnScrollStateChangedListener onScrollStateChangedListener) {
        this.onScrollStateChangedListeners.remove(onScrollStateChangedListener);
    }

    public void clearOnScrollStateChangedListeners() {
        this.onScrollStateChangedListeners.clear();
    }
}
