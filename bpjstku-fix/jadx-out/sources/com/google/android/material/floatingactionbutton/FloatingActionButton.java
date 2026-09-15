package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatImageHelper;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.TintableBackgroundView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TintableImageSourceView;
import com.google.android.material.R;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.animation.TransformationCallback;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.expandable.ExpandableTransformationWidget;
import com.google.android.material.expandable.ExpandableWidgetHelper;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shadow.ShadowViewDelegate;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.stateful.ExtendableSavedState;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import defpackage.LayoutSettings;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.initSession;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class FloatingActionButton extends VisibilityAwareImageButton implements TintableBackgroundView, TintableImageSourceView, ExpandableTransformationWidget, Shapeable, CoordinatorLayout.AttachedBehavior {
    private static final int AUTO_MINI_LARGEST_SCREEN_WIDTH = 470;
    private static final int DEF_STYLE_RES = R.style.Widget_Design_FloatingActionButton;
    private static final String EXPANDABLE_WIDGET_HELPER_KEY = "expandableWidgetHelper";
    private static final String LOG_TAG = "FloatingActionButton";
    public static final int NO_CUSTOM_SIZE = 0;
    public static final int SIZE_AUTO = -1;
    public static final int SIZE_MINI = 1;
    public static final int SIZE_NORMAL = 0;
    private ColorStateList backgroundTint;
    private PorterDuff.Mode backgroundTintMode;
    private int borderWidth;
    boolean compatPadding;
    private int customSize;
    private final ExpandableWidgetHelper expandableWidgetHelper;
    private final AppCompatImageHelper imageHelper;
    private PorterDuff.Mode imageMode;
    private int imagePadding;
    private ColorStateList imageTint;
    private FloatingActionButtonImpl impl;
    private int maxImageSize;
    private ColorStateList rippleColor;
    final Rect shadowPadding;
    private int size;
    private final Rect touchArea;

    public static abstract class OnVisibilityChangedListener {
        public void onHidden(FloatingActionButton floatingActionButton) {
        }

        public void onShown(FloatingActionButton floatingActionButton) {
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Size {
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.Behavior<T> {
        private static final boolean AUTO_HIDE_DEFAULT = true;
        private boolean autoHideEnabled;
        private OnVisibilityChangedListener internalAutoHideListener;
        private Rect tmpRect;
        private static final byte[] $$c = {80, -8, 43, 65};
        private static final int $$f = 105;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {88, 99, -94, -58, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
        private static final int $$e = 36;
        private static final byte[] $$a = {56, 94, 119, -19, 7, -23, 19, -25, 72, -55, -17, -9, 7, -6, 3, 63, -71, 1, 9, 0, 51, -39, -20, 0, -17, 11, -17, 39, -28, -22, 36, -31, 9, 0};
        private static final int $$b = 70;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
        private static int[] b = {-706710754, 180386195, -1119310874, -1252320791, -407892713, -1338651774, -1638383000, -1283877734, -1457487719, -76625426, 876595176, -560999580, -573080506, -331887150, 1396809919, 22995293, -1627942503, 208393877};

        private static void a(short s, short s2, int i, Object[] objArr) {
            int i2 = 4 - (s * 2);
            int i3 = s2 * 4;
            int i4 = (i * 4) + 106;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[i3 + 31];
            int i5 = i3 + 30;
            int i6 = -1;
            if (bArr == null) {
                i2++;
                i4 = (i4 + (-i2)) - 2;
            }
            while (true) {
                i6++;
                bArr2[i6] = (byte) i4;
                if (i6 == i5) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                } else {
                    byte b2 = bArr[i2];
                    i2++;
                    i4 = (i4 + (-b2)) - 2;
                }
            }
        }

        private static void c(byte b2, short s, int i, Object[] objArr) {
            int i2 = i * 52;
            int i3 = 55 - (b2 * 52);
            int i4 = 103 - s;
            byte[] bArr = $$d;
            byte[] bArr2 = new byte[53 - i2];
            int i5 = 52 - i2;
            int i6 = -1;
            if (bArr == null) {
                i6 = -1;
                i4 = (i5 + (-i3)) - 11;
                i3 = i3;
            }
            while (true) {
                int i7 = i6 + 1;
                int i8 = i3 + 1;
                bArr2[i7] = (byte) i4;
                if (i7 == i5) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i6 = i7;
                i4 = (i4 + (-bArr[i8])) - 11;
                i3 = i8;
            }
        }

        private static void d(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = b;
            char c = '0';
            int i4 = -1870535734;
            int i5 = 1;
            int i6 = 0;
            if (iArr2 != null) {
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i7 = 0;
                while (i7 < length) {
                    int i8 = $11 + 15;
                    $10 = i8 % 128;
                    if (i8 % i2 != 0) {
                        try {
                            Object[] objArr2 = new Object[1];
                            objArr2[i6] = Integer.valueOf(iArr2[i7]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b2 = (byte) i6;
                                byte b3 = b2;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.indexOf("", c, i6, i6) + 3292, (TypedValue.complexToFraction(i6, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i6, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31, 1948206109, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            iArr3[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                            i7 %= 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        try {
                            Object[] objArr3 = {Integer.valueOf(iArr2[i7])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Color.red(0), 3292 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 31 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1948206109, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                            }
                            iArr3[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                            i7++;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    i2 = 2;
                    c = '0';
                    i4 = -1870535734;
                    i6 = 0;
                }
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = b;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i9 = 0;
                while (i9 < length3) {
                    int i10 = $10 + 103;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    Object[] objArr4 = new Object[i5];
                    objArr4[0] = Integer.valueOf(iArr5[i9]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) KeyEvent.keyCodeFromString(""), 3291 - View.combineMeasuredStates(0, 0), TextUtils.lastIndexOf("", '0', 0, 0) + 32, 1948206109, false, $$g(b6, b7, b7), new Class[]{Integer.TYPE});
                    }
                    iArr6[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                    i9++;
                    iArr5 = iArr5;
                    i5 = 1;
                }
                iArr5 = iArr6;
            }
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            int i12 = 2;
            sessionConfigValidatingBuilder.b = 2;
            while (sessionConfigValidatingBuilder.b < iArr.length) {
                int i13 = $11 + 57;
                $10 = i13 % 128;
                int i14 = i13 % i12;
                cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
                cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
                cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
                cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
                int i15 = 17;
                for (int i16 = 1; i15 > i16; i16 = 1) {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i15];
                    try {
                        Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = b8;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((-1) - MotionEvent.axisFromString("")), (-16774657) - Color.rgb(0, 0, 0), Color.rgb(0, 0, 0) + 16777245, 683220507, false, $$g(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                        i15--;
                        int i17 = $11 + 63;
                        $10 = i17 % 128;
                        int i18 = i17 % 2;
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                int i19 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                int i20 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object[] objArr6 = {sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 28879), 348 - (ViewConfiguration.getJumpTapTimeout() >> 16), 25 - View.resolveSizeAndState(0, 0, 0), -30507727, false, "G", new Class[]{Object.class});
                }
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()];
                cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
                cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
                cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
                sessionConfigValidatingBuilder.b += 2;
                i12 = 2;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 61;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            boolean insetDodgeRect = getInsetDodgeRect(coordinatorLayout, (FloatingActionButton) view, rect);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            return insetDodgeRect;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            boolean zOnDependentViewChanged = onDependentViewChanged(coordinatorLayout, (FloatingActionButton) view, view2);
            if (i3 == 0) {
                int i4 = 9 / 0;
            }
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
            return zOnDependentViewChanged;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            int i2 = 2 % 2;
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            boolean zOnLayoutChild = onLayoutChild(coordinatorLayout, (FloatingActionButton) view, i);
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 73 / 0;
            }
            return zOnLayoutChild;
        }

        public BaseBehavior() {
            this.autoHideEnabled = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.FloatingActionButton_Behavior_Layout);
            this.autoHideEnabled = typedArrayObtainStyledAttributes.getBoolean(R.styleable.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        public void setAutoHideEnabled(boolean z) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 61;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            this.autoHideEnabled = z;
            if (i3 != 0) {
                int i4 = 91 / 0;
            }
        }

        public boolean isAutoHideEnabled() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            if (i2 % 2 != 0) {
                return this.autoHideEnabled;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onAttachedToLayoutParams(CoordinatorLayout.LayoutParams layoutParams) {
            int i = 2 % 2;
            if (layoutParams.dodgeInsetEdges == 0) {
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
                int i3 = i2 % 2;
                layoutParams.dodgeInsetEdges = 80;
            }
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            if (view instanceof AppBarLayout) {
                updateFabVisibilityForAppBarLayout(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!isBottomSheet(view)) {
                return false;
            }
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            int i7 = i6 % 2;
            updateFabVisibilityForBottomSheet(view, floatingActionButton);
            return false;
        }

        private static boolean isBottomSheet(View view) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (!(layoutParams instanceof CoordinatorLayout.LayoutParams)) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            boolean z = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof BottomSheetBehavior;
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
            if (i6 % 2 != 0) {
                return z;
            }
            throw null;
        }

        public void setInternalAutoHideListener(OnVisibilityChangedListener onVisibilityChangedListener) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i3 = i2 + 93;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            this.internalAutoHideListener = onVisibilityChangedListener;
            int i5 = i2 + 15;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
        }

        private boolean shouldUpdateVisibility(View view, FloatingActionButton floatingActionButton) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams();
            if (!this.autoHideEnabled) {
                return false;
            }
            if (layoutParams.getAnchorId() == view.getId()) {
                return floatingActionButton.getUserSetVisibility() == 0;
            }
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }

        private boolean updateFabVisibilityForAppBarLayout(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            int i = 2 % 2;
            if (!shouldUpdateVisibility(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.tmpRect == null) {
                this.tmpRect = new Rect();
            }
            Rect rect = this.tmpRect;
            DescendantOffsetUtils.getDescendantRect(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                if (i2 % 2 != 0) {
                    floatingActionButton.hide(this.internalAutoHideListener, true);
                } else {
                    floatingActionButton.hide(this.internalAutoHideListener, false);
                }
            } else {
                floatingActionButton.show(this.internalAutoHideListener, false);
            }
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            if (i3 % 2 == 0) {
                return true;
            }
            throw null;
        }

        private boolean updateFabVisibilityForBottomSheet(View view, FloatingActionButton floatingActionButton) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            if (!(!shouldUpdateVisibility(view, floatingActionButton))) {
                if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams())).topMargin) {
                    floatingActionButton.hide(this.internalAutoHideListener, false);
                } else {
                    floatingActionButton.show(this.internalAutoHideListener, false);
                }
                return true;
            }
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            int i2 = 2 % 2;
            List<View> dependencies = coordinatorLayout.getDependencies(floatingActionButton);
            int size = dependencies.size();
            for (int i3 = 0; i3 < size; i3++) {
                View view = dependencies.get(i3);
                if (!(view instanceof AppBarLayout)) {
                    if (isBottomSheet(view)) {
                        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                        if (i4 % 2 != 0) {
                            int i5 = 68 / 0;
                            if (updateFabVisibilityForBottomSheet(view, floatingActionButton)) {
                                break;
                            }
                        } else {
                            if (updateFabVisibilityForBottomSheet(view, floatingActionButton)) {
                                break;
                            }
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (updateFabVisibilityForAppBarLayout(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
                        int i7 = i6 % 2;
                        break;
                    }
                }
            }
            coordinatorLayout.onLayoutChild(floatingActionButton, i);
            offsetIfNeeded(coordinatorLayout, floatingActionButton);
            return true;
        }

        public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            Rect rect2 = floatingActionButton.shadowPadding;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }

        private void offsetIfNeeded(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            int i;
            int i2 = 2 % 2;
            Rect rect = floatingActionButton.shadowPadding;
            if (rect == null || rect.centerX() <= 0) {
                return;
            }
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            if (i3 % 2 != 0) {
                rect.centerY();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (rect.centerY() > 0) {
                CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams();
                int i4 = 0;
                if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin) {
                    i = rect.right;
                } else {
                    i = floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin ? -rect.left : 0;
                }
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) {
                    i4 = rect.bottom;
                    int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
                    int i6 = i5 % 2;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) {
                    int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 69;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
                    int i8 = i7 % 2;
                    i4 = -rect.top;
                }
                if (i4 != 0) {
                    ViewCompat.offsetTopAndBottom(floatingActionButton, i4);
                }
                if (i != 0) {
                    int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
                    int i10 = i9 % 2;
                    ViewCompat.offsetLeftAndRight(floatingActionButton, i);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:101:0x0637  */
        /* JADX WARN: Code duplicated, block: B:103:0x0640  */
        /* JADX WARN: Code duplicated, block: B:106:0x0694  */
        /* JADX WARN: Code duplicated, block: B:110:0x06f4 A[Catch: all -> 0x0a00, TryCatch #0 {all -> 0x0a00, blocks: (B:96:0x05ce, B:98:0x05e5, B:99:0x0629, B:108:0x06dd, B:110:0x06f4, B:111:0x073e, B:123:0x07bd, B:125:0x07ca, B:126:0x0809, B:128:0x0828, B:130:0x087e), top: B:161:0x00af }] */
        /* JADX WARN: Code duplicated, block: B:166:0x0526 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:168:0x074b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:44:0x02c5  */
        /* JADX WARN: Code duplicated, block: B:45:0x02d7  */
        /* JADX WARN: Code duplicated, block: B:50:0x0321 A[Catch: all -> 0x0768, TRY_ENTER, TryCatch #1 {all -> 0x0768, blocks: (B:14:0x00d2, B:17:0x0117, B:19:0x0152, B:27:0x01c7, B:31:0x0227, B:34:0x0261, B:41:0x0295, B:47:0x0308, B:50:0x0321, B:51:0x033f, B:55:0x0374, B:59:0x038e, B:63:0x03c4, B:67:0x03e9, B:74:0x044c, B:76:0x0461, B:64:0x03d1, B:52:0x0342, B:38:0x027b, B:18:0x0135), top: B:163:0x00d2 }] */
        /* JADX WARN: Code duplicated, block: B:52:0x0342 A[Catch: all -> 0x0768, TRY_LEAVE, TryCatch #1 {all -> 0x0768, blocks: (B:14:0x00d2, B:17:0x0117, B:19:0x0152, B:27:0x01c7, B:31:0x0227, B:34:0x0261, B:41:0x0295, B:47:0x0308, B:50:0x0321, B:51:0x033f, B:55:0x0374, B:59:0x038e, B:63:0x03c4, B:67:0x03e9, B:74:0x044c, B:76:0x0461, B:64:0x03d1, B:52:0x0342, B:38:0x027b, B:18:0x0135), top: B:163:0x00d2 }] */
        /* JADX WARN: Code duplicated, block: B:58:0x0382  */
        /* JADX WARN: Code duplicated, block: B:62:0x03c2  */
        /* JADX WARN: Code duplicated, block: B:64:0x03d1 A[Catch: all -> 0x0768, TRY_LEAVE, TryCatch #1 {all -> 0x0768, blocks: (B:14:0x00d2, B:17:0x0117, B:19:0x0152, B:27:0x01c7, B:31:0x0227, B:34:0x0261, B:41:0x0295, B:47:0x0308, B:50:0x0321, B:51:0x033f, B:55:0x0374, B:59:0x038e, B:63:0x03c4, B:67:0x03e9, B:74:0x044c, B:76:0x0461, B:64:0x03d1, B:52:0x0342, B:38:0x027b, B:18:0x0135), top: B:163:0x00d2 }] */
        /* JADX WARN: Code duplicated, block: B:70:0x0422  */
        /* JADX WARN: Code duplicated, block: B:72:0x0432  */
        /* JADX WARN: Code duplicated, block: B:79:0x046b  */
        /* JADX WARN: Code duplicated, block: B:81:0x047f  */
        /* JADX WARN: Code duplicated, block: B:83:0x04ca  */
        /* JADX WARN: Code duplicated, block: B:84:0x04cf  */
        /* JADX WARN: Code duplicated, block: B:89:0x0532  */
        /* JADX WARN: Code duplicated, block: B:91:0x053b  */
        /* JADX WARN: Code duplicated, block: B:94:0x058b  */
        /* JADX WARN: Code duplicated, block: B:98:0x05e5 A[Catch: all -> 0x0a00, TryCatch #0 {all -> 0x0a00, blocks: (B:96:0x05ce, B:98:0x05e5, B:99:0x0629, B:108:0x06dd, B:110:0x06f4, B:111:0x073e, B:123:0x07bd, B:125:0x07ca, B:126:0x0809, B:128:0x0828, B:130:0x087e), top: B:161:0x00af }] */
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3(List list) throws Throwable {
            Constructor[] constructorArr;
            Class<?> cls;
            Class<?>[] clsArr;
            char c;
            int i;
            int i2;
            int i3;
            String string;
            Constructor constructor;
            Object[] objArr;
            int[] iArr;
            int i4;
            int i5;
            int i6;
            Class cls2;
            int i7;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i8;
            int i9;
            int i10;
            int i11;
            String str;
            int i12;
            Class<?> cls3;
            Object obj;
            String str2;
            int i13;
            int[] iArr2;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            Object[] objArr2;
            int i20;
            int i21;
            int i22;
            int i23;
            int i24;
            Object[] objArr3;
            int i25;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8;
            int i26 = 2;
            int i27 = 2 % 2;
            int i28 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i29 = 1;
            int i30 = (i28 ^ 101) + ((i28 & 101) << 1);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i30 % 128;
            char c2 = 0;
            if (i30 % 2 == 0) {
                constructorArr = new Constructor[1];
                byte b2 = $$a[19];
                byte b3 = b2;
                Object[] objArr4 = new Object[1];
                a(b2, b3, b3, objArr4);
                cls = Class.forName((String) objArr4[0]);
                clsArr = new Class[4];
                c = 1;
            } else {
                constructorArr = new Constructor[1];
                byte b4 = $$a[19];
                byte b5 = b4;
                Object[] objArr5 = new Object[1];
                a(b4, b5, b5, objArr5);
                cls = Class.forName((String) objArr5[0]);
                clsArr = new Class[2];
                c = 0;
            }
            clsArr[0] = byte[].class;
            clsArr[1] = String.class;
            constructorArr[c] = cls.getDeclaredConstructor(clsArr);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char gidForName = (char) ((-1) - Process.getGidForName(""));
                int iLastIndexOf = 2822 - TextUtils.lastIndexOf("", '0');
                int i31 = 22 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                byte[] bArr = $$d;
                Object[] objArr6 = new Object[1];
                c(bArr[5], bArr[10], bArr[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(gidForName, iLastIndexOf, i31, 1814927978, false, (String) objArr6[0], null);
            }
            Class<?>[] clsArr2 = null;
            int i32 = 14;
            int i33 = 16;
            try {
                if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).get(null) == null) {
                    Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 2823 - TextUtils.getOffsetBefore("", 0), TextUtils.indexOf("", "") + 22)).getDeclaredMethods();
                    int length = declaredMethods.length;
                    int i34 = 0;
                    while (i34 < length) {
                        Method method = declaredMethods[i34];
                        try {
                            int[] iArr3 = new int[i32];
                            // fill-array-data instruction
                            iArr3[0] = 975348212;
                            iArr3[1] = -147359383;
                            iArr3[2] = 942563258;
                            iArr3[3] = 1279608144;
                            iArr3[4] = 349440672;
                            iArr3[5] = -1617942862;
                            iArr3[6] = -2089559236;
                            iArr3[7] = -1849168258;
                            iArr3[8] = -1955997630;
                            iArr3[9] = 817256396;
                            iArr3[10] = 122951978;
                            iArr3[11] = -839844983;
                            iArr3[12] = 857024644;
                            iArr3[13] = -1364812341;
                            Object[] objArr7 = new Object[i29];
                            d(iArr3, 24 - (ViewConfiguration.getEdgeSlop() >> i33), objArr7);
                            Class<?> cls4 = Class.forName((String) objArr7[c2]);
                            int i35 = -(ViewConfiguration.getTapTimeout() >> i33);
                            Object[] objArr8 = new Object[i29];
                            d(new int[]{-921350021, 1722983792, 1977835877, -1241582134, -1291858522, 1374401786, 344526284, -1230375127}, (i35 ^ 12) + ((i35 & 12) << i29), objArr8);
                            String str3 = (String) objArr8[c2];
                            int i36 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i37 = (i36 ^ 9) + ((i36 & 9) << i29);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i37 % 128;
                            if (i37 % i26 != 0) {
                                int iIntValue = ((Integer) cls4.getMethod(str3, clsArr2).invoke(method, clsArr2)).intValue();
                                objArr = new Object[i29];
                                objArr[c2] = Integer.valueOf(iIntValue);
                                iArr = new int[i33];
                                // fill-array-data instruction
                                iArr[0] = -525692751;
                                iArr[1] = 2145618756;
                                iArr[2] = 2036400298;
                                iArr[3] = -1758796628;
                                iArr[4] = 1871831021;
                                iArr[5] = -784742473;
                                iArr[6] = -963587731;
                                iArr[7] = 2059616529;
                                iArr[8] = -537031045;
                                iArr[9] = 464050397;
                                iArr[10] = -1003936576;
                                iArr[11] = -1872043072;
                                iArr[12] = 695264258;
                                iArr[13] = 698523554;
                                iArr[14] = -808061316;
                                iArr[15] = 769440220;
                                i4 = 57;
                            } else {
                                int iIntValue2 = ((Integer) cls4.getMethod(str3, clsArr2).invoke(method, clsArr2)).intValue();
                                objArr = new Object[i29];
                                objArr[c2] = Integer.valueOf(iIntValue2);
                                iArr = new int[i33];
                                // fill-array-data instruction
                                iArr[0] = -525692751;
                                iArr[1] = 2145618756;
                                iArr[2] = 2036400298;
                                iArr[3] = -1758796628;
                                iArr[4] = 1871831021;
                                iArr[5] = -784742473;
                                iArr[6] = -963587731;
                                iArr[7] = 2059616529;
                                iArr[8] = -537031045;
                                iArr[9] = 464050397;
                                iArr[10] = -1003936576;
                                iArr[11] = -1872043072;
                                iArr[12] = 695264258;
                                iArr[13] = 698523554;
                                iArr[14] = -808061316;
                                iArr[15] = 769440220;
                                i4 = 26;
                            }
                            int touchSlop = ViewConfiguration.getTouchSlop() >> 8;
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            int i38 = (touchSlop * 868) + (i4 * 868);
                            int i39 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i40 = i39 + 91;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i40 % 128;
                            if (i40 % i26 != 0) {
                                int i41 = ~touchSlop;
                                int i42 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                int i43 = ~((i41 ^ i42) | (i41 & i42));
                                int i44 = ~i4;
                                i5 = (-867) >>> ((~((i44 ^ i42) | (i42 & i44))) | i43);
                            } else {
                                int i45 = ~touchSlop;
                                int i46 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                int i47 = ~((i45 & i46) | (i45 ^ i46));
                                int i48 = ~i4;
                                int i49 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                int i50 = ~((i48 ^ i49) | (i48 & i49));
                                i5 = ((i47 & i50) | (i47 ^ i50)) * (-867);
                            }
                            int i51 = -(-i5);
                            int i52 = (i38 ^ i51) + ((i51 & i38) << 1);
                            int i53 = ~touchSlop;
                            int i54 = i39 + 111;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i54 % 128;
                            if (i54 % 2 != 0) {
                                int i55 = ~i4;
                                int i56 = ~((i53 ^ i55) | (i53 & i55));
                                int i57 = ~touchSlop;
                                int i58 = ~((i57 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i57 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                int i59 = (i56 ^ i58) | (i56 & i58);
                                int i60 = ~((~i4) | iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                int i61 = -((-1734) % ((i59 ^ i60) | (i59 & i60)));
                                i6 = (i52 & i61) + (i61 | i52);
                            } else {
                                int i62 = ~i4;
                                int i63 = ~((i53 ^ i62) | (i53 & i62));
                                int i64 = ~touchSlop;
                                int i65 = ~((i64 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i64 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                int i66 = (i63 ^ i65) | (i63 & i65);
                                int i67 = ~i4;
                                int i68 = -(-((-1734) * (i66 | (~((i67 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i67 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3))))));
                                i6 = ((i52 | i68) << 1) - (i68 ^ i52);
                            }
                            int i69 = ~touchSlop;
                            int i70 = ~i4;
                            int i71 = ~((i70 & i69) | (i69 ^ i70) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                            int i72 = (i69 & i4) | (i69 ^ i4);
                            int i73 = ~((i72 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i72 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                            int i74 = (i73 & i71) | (i71 ^ i73);
                            int i75 = ~i4;
                            int i76 = i39 + 125;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i76 % 128;
                            int i77 = i76 % 2;
                            int i78 = (i75 & touchSlop) | (i75 ^ touchSlop);
                            int i79 = ~((i78 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i78 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                            int i80 = 867 * ((i74 & i79) | (i74 ^ i79));
                            int i81 = (i6 ^ i80) + ((i80 & i6) << 1);
                            Object[] objArr9 = new Object[1];
                            d(iArr, i81, objArr9);
                            Class<?> cls5 = Class.forName((String) objArr9[0]);
                            int i82 = -(-((byte) KeyEvent.getModifierMetaStateMask()));
                            int i83 = (i82 ^ 9) + ((i82 & 9) << 1);
                            Object[] objArr10 = new Object[1];
                            d(new int[]{-876310439, 1336664750, -290490753, 1730943005, -1070651904, -496611385}, i83, objArr10);
                            String str4 = (String) objArr10[0];
                            Class<?>[] clsArr3 = new Class[1];
                            int i84 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 5;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i84 % 128;
                            if (i84 % 2 != 0) {
                                clsArr3[1] = Integer.TYPE;
                                if (((Boolean) cls5.getMethod(str4, clsArr3).invoke(null, objArr)).booleanValue()) {
                                    cls2 = Long.TYPE;
                                    int[] iArr4 = {975348212, -147359383, 942563258, 1279608144, 349440672, -1617942862, -2089559236, -1849168258, -1955997630, 817256396, 122951978, -839844983, 857024644, -1364812341};
                                    i7 = -TextUtils.getOffsetBefore("", 0);
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                    int i85 = i7 * 477;
                                    i8 = (i85 & (-11400)) + (i85 | (-11400));
                                    int i86 = ~i7;
                                    i9 = ~((i86 & 24) | (i86 ^ 24));
                                    int i87 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    i10 = ((i87 | 53) << 1) - (i87 ^ 53);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
                                    if (i10 % 2 != 0) {
                                        int i88 = ((-25) & i7) | ((-25) ^ i7);
                                        int i89 = ~((i88 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i88 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                                        i11 = i8 >> (((i9 & i89) | (i9 ^ i89)) - 476);
                                    } else {
                                        int i90 = ((-25) & i7) | ((-25) ^ i7);
                                        int i91 = ~((i90 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i90 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                                        i11 = (((i9 & i91) | (i9 ^ i91)) * (-476)) + i8;
                                    }
                                    int i92 = ((-25) & i7) | ((-25) ^ i7);
                                    int i93 = (i11 - (~(-(-(952 * (~((i92 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i92 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2)))))))) - 1;
                                    int i94 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int i95 = i93 + ((~(i7 | (i94 & (-25)) | ((-25) ^ i94))) * 476);
                                    Object[] objArr11 = new Object[1];
                                    d(iArr4, i95, objArr11);
                                    str = (String) objArr11[0];
                                    int i96 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    i12 = (i96 & 21) + (i96 | 21);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
                                    if (i12 % 2 != 0) {
                                        cls3 = Class.forName(str);
                                        Object[] objArr12 = new Object[1];
                                        d(new int[]{871706161, -205257048, 504268417, -676943238, -350663713, 778285977, -458918643, 311752162, -959745357, 39988192}, (ViewConfiguration.getGlobalActionKeyTimeout() > 1L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 1L ? 0 : -1)) * 104, objArr12);
                                        obj = objArr12[0];
                                    } else {
                                        cls3 = Class.forName(str);
                                        Object[] objArr13 = new Object[1];
                                        d(new int[]{871706161, -205257048, 504268417, -676943238, -350663713, 778285977, -458918643, 311752162, -959745357, 39988192}, 11 - (~(-(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))))), objArr13);
                                        obj = objArr13[0];
                                    }
                                    str2 = (String) obj;
                                    int i97 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int i98 = (i97 ^ 99) + ((i97 & 99) << 1);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i98 % 128;
                                    int i99 = i98 % 2;
                                    if (cls2.equals(cls3.getMethod(str2, null).invoke(method, null))) {
                                        int i100 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i100 % 128;
                                        int i101 = i100 % 2;
                                        int i102 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                        int i103 = ((i102 | 25) << 1) - (i102 ^ 25);
                                        Object[] objArr14 = new Object[1];
                                        d(new int[]{975348212, -147359383, 942563258, 1279608144, 349440672, -1617942862, -2089559236, -1849168258, -1955997630, 817256396, 122951978, -839844983, 857024644, -1364812341}, i103, objArr14);
                                        Class<?> cls6 = Class.forName((String) objArr14[0]);
                                        int i104 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                        i13 = ((i104 | 93) << 1) - (i104 ^ 93);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i13 % 128;
                                        if (i13 % 2 == 0) {
                                            iArr2 = new int[]{1482124034, 71067184, 875385523, 344905197, 1421398991, -289520831, 917342935, 357686173, -1514979691, -1000589066, -2139603106, -2016664454};
                                            i14 = -TextUtils.indexOf("", "");
                                            i15 = 113;
                                        } else {
                                            iArr2 = new int[]{1482124034, 71067184, 875385523, 344905197, 1421398991, -289520831, 917342935, 357686173, -1514979691, -1000589066, -2139603106, -2016664454};
                                            i14 = -TextUtils.indexOf("", "");
                                            i15 = 17;
                                        }
                                        int i105 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i105 % 128;
                                        int i106 = i105 % 2;
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                        int i107 = i14 * (-405);
                                        int i108 = -(-(i15 * 407));
                                        int i109 = ((i107 | i108) << 1) - (i107 ^ i108);
                                        int i110 = ~i15;
                                        int i111 = ~((i110 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i110 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                        int i112 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                        int i113 = (i112 ^ i14) | (i112 & i14);
                                        i16 = (i109 - (~((i111 | (~((i113 & i15) | (i113 ^ i15)))) * (-406)))) - 1;
                                        int i114 = ~i15;
                                        i17 = (i114 & i112) | (i114 ^ i112);
                                        i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 % 128;
                                        if (i18 % 2 != 0) {
                                            i19 = i16 >> ((~((i17 & i14) | (i17 ^ i14))) * (-406));
                                        } else {
                                            i19 = ((~((i17 & i14) | (i17 ^ i14))) * (-406)) + i16;
                                        }
                                        int i115 = ~i14;
                                        int i116 = ~((i115 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i115 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                        int i117 = ~(i15 | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                        int i118 = -(-(406 * ((i116 & i117) | (i116 ^ i117))));
                                        Object[] objArr15 = new Object[1];
                                        d(iArr2, (i19 & i118) + (i118 | i19), objArr15);
                                        Method method2 = cls6.getMethod((String) objArr15[0], null);
                                        LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                        LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                        objArr2 = (Object[]) method2.invoke(method, null);
                                        if (objArr2.length == 2) {
                                            int i119 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i119 % 128;
                                            int i120 = i119 % 2;
                                            if (Long.TYPE.equals(objArr2[0])) {
                                                int[] iArr5 = {975348212, -147359383, 942563258, 1279608144, 349440672, -1617942862, -2089559236, -1849168258, -1955997630, 817256396, 122951978, -839844983, 857024644, -1364812341};
                                                int i121 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                int i122 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i122 % 128;
                                                int i123 = i122 % 2;
                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                                int i124 = i121 * (-337);
                                                i20 = (i124 & 7797) + (i124 | 7797);
                                                int i125 = ~i121;
                                                int i126 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                                int i127 = ~((i126 & i125) | (i125 ^ i126));
                                                int i128 = ~(((-24) & i121) | ((-24) ^ i121));
                                                i21 = (i127 & i128) | (i127 ^ i128);
                                                int i129 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                int i130 = i129 + 89;
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i130 % 128;
                                                i22 = i130 % 2;
                                                i23 = ~((i121 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i121 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                                                if (i22 == 0) {
                                                    i24 = i20 % ((i23 | i21) - 338);
                                                } else {
                                                    i24 = (i20 - (~(((i23 & i21) | (i21 ^ i23)) * (-338)))) - 1;
                                                }
                                                int i131 = -(-(338 * (~((i125 ^ 23) | (i125 & 23)))));
                                                int i132 = ((i24 | i131) << 1) - (i131 ^ i24);
                                                int i133 = ~i121;
                                                int i134 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                                int i135 = ~((i133 & i134) | (i133 ^ i134));
                                                int i136 = i129 + 3;
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i136 % 128;
                                                int i137 = i136 % 2;
                                                int i138 = (i121 & 23) | (i121 ^ 23);
                                                int i139 = ~((i138 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i138 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                                                int i140 = 338 * ((i139 & i135) | (i135 ^ i139));
                                                int i141 = ((i132 | i140) << 1) - (i140 ^ i132);
                                                objArr3 = new Object[1];
                                                d(iArr5, i141, objArr3);
                                                if (Class.forName((String) objArr3[0]).equals(objArr2[1])) {
                                                    i25 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i25 % 128;
                                                    if (i25 % 2 != 0) {
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                            char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                                                            int mirror = 2871 - AndroidCharacter.getMirror('0');
                                                            int mode = 22 - View.MeasureSpec.getMode(0);
                                                            byte[] bArr2 = $$d;
                                                            Object[] objArr16 = new Object[1];
                                                            c(bArr2[5], bArr2[10], bArr2[7], objArr16);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionChild, mirror, mode, 1814927978, false, (String) objArr16[0], null);
                                                        }
                                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                            char c3 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
                                                            int tapTimeout = 2823 - (ViewConfiguration.getTapTimeout() >> 16);
                                                            int fadingEdgeLength = 22 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                                                            byte[] bArr3 = $$d;
                                                            Object[] objArr17 = new Object[1];
                                                            c(bArr3[5], bArr3[10], bArr3[7], objArr17);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c3, tapTimeout, fadingEdgeLength, 1814927978, false, (String) objArr17[0], null);
                                                        }
                                                        Object[] objArr18 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                                                            int mirror2 = AndroidCharacter.getMirror('0') + 2775;
                                                            int iIndexOf = TextUtils.indexOf("", "", 0) + 22;
                                                            byte[] bArr4 = $$d;
                                                            byte b6 = bArr4[7];
                                                            Object[] objArr19 = new Object[1];
                                                            c(b6, b6, bArr4[5], objArr19);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, mirror2, iIndexOf, -2137287382, false, (String) objArr19[0], new Class[]{Long.TYPE, Method.class});
                                                        }
                                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr18)).longValue();
                                                        break;
                                                    }
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                        char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                                                        int capsMode = 2823 - TextUtils.getCapsMode("", 0, 0);
                                                        int i142 = 21 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                        byte[] bArr5 = $$d;
                                                        Object[] objArr20 = new Object[1];
                                                        c(bArr5[5], bArr5[10], bArr5[7], objArr20);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveSizeAndState, capsMode, i142, 1814927978, false, (String) objArr20[0], null);
                                                    }
                                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, method);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                                        char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                        int iGreen = Color.green(0) + 2823;
                                                        int iNormalizeMetaState = 22 - KeyEvent.normalizeMetaState(0);
                                                        byte[] bArr6 = $$d;
                                                        Object[] objArr21 = new Object[1];
                                                        c(bArr6[5], bArr6[10], bArr6[7], objArr21);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maximumFlingVelocity, iGreen, iNormalizeMetaState, 1814927978, false, (String) objArr21[0], null);
                                                    }
                                                    Object[] objArr22 = {1L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                                        char c4 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                        int scrollBarSize = 2823 - (ViewConfiguration.getScrollBarSize() >> 8);
                                                        int defaultSize = 22 - View.getDefaultSize(0, 0);
                                                        byte[] bArr7 = $$d;
                                                        byte b7 = bArr7[7];
                                                        Object[] objArr23 = new Object[1];
                                                        c(b7, b7, bArr7[5], objArr23);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c4, scrollBarSize, defaultSize, -2137287382, false, (String) objArr23[0], new Class[]{Long.TYPE, Method.class});
                                                    }
                                                    ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr22)).longValue();
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                                i34++;
                                int i143 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i143 % 128;
                                int i144 = i143 % 2;
                                declaredMethods = declaredMethods;
                                i26 = 2;
                                c2 = 0;
                                i29 = 1;
                                clsArr2 = null;
                                i32 = 14;
                                i33 = 16;
                            } else {
                                clsArr3[0] = Integer.TYPE;
                                if (((Boolean) cls5.getMethod(str4, clsArr3).invoke(null, objArr)).booleanValue()) {
                                    cls2 = Long.TYPE;
                                    int[] iArr6 = {975348212, -147359383, 942563258, 1279608144, 349440672, -1617942862, -2089559236, -1849168258, -1955997630, 817256396, 122951978, -839844983, 857024644, -1364812341};
                                    i7 = -TextUtils.getOffsetBefore("", 0);
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                    int i810 = i7 * 477;
                                    i8 = (i810 & (-11400)) + (i810 | (-11400));
                                    int i811 = ~i7;
                                    i9 = ~((i811 & 24) | (i811 ^ 24));
                                    int i812 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    i10 = ((i812 | 53) << 1) - (i812 ^ 53);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
                                    if (i10 % 2 != 0) {
                                        int i813 = ((-25) & i7) | ((-25) ^ i7);
                                        int i814 = ~((i813 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i813 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                                        i11 = i8 >> (((i9 & i814) | (i9 ^ i814)) - 476);
                                    } else {
                                        int i910 = ((-25) & i7) | ((-25) ^ i7);
                                        int i911 = ~((i910 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i910 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                                        i11 = (((i9 & i911) | (i9 ^ i911)) * (-476)) + i8;
                                    }
                                    int i912 = ((-25) & i7) | ((-25) ^ i7);
                                    int i913 = (i11 - (~(-(-(952 * (~((i912 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i912 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2)))))))) - 1;
                                    int i914 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int i915 = i913 + ((~(i7 | (i914 & (-25)) | ((-25) ^ i914))) * 476);
                                    Object[] objArr110 = new Object[1];
                                    d(iArr6, i915, objArr110);
                                    str = (String) objArr110[0];
                                    int i916 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    i12 = (i916 & 21) + (i916 | 21);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
                                    if (i12 % 2 != 0) {
                                        cls3 = Class.forName(str);
                                        Object[] objArr111 = new Object[1];
                                        d(new int[]{871706161, -205257048, 504268417, -676943238, -350663713, 778285977, -458918643, 311752162, -959745357, 39988192}, (ViewConfiguration.getGlobalActionKeyTimeout() > 1L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 1L ? 0 : -1)) * 104, objArr111);
                                        obj = objArr111[0];
                                    } else {
                                        cls3 = Class.forName(str);
                                        Object[] objArr112 = new Object[1];
                                        d(new int[]{871706161, -205257048, 504268417, -676943238, -350663713, 778285977, -458918643, 311752162, -959745357, 39988192}, 11 - (~(-(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))))), objArr112);
                                        obj = objArr112[0];
                                    }
                                    str2 = (String) obj;
                                    int i917 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int i918 = (i917 ^ 99) + ((i917 & 99) << 1);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i918 % 128;
                                    int i919 = i918 % 2;
                                    if (cls2.equals(cls3.getMethod(str2, null).invoke(method, null))) {
                                        int i1010 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i1010 % 128;
                                        int i1011 = i1010 % 2;
                                        int i1012 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                        int i1013 = ((i1012 | 25) << 1) - (i1012 ^ 25);
                                        Object[] objArr113 = new Object[1];
                                        d(new int[]{975348212, -147359383, 942563258, 1279608144, 349440672, -1617942862, -2089559236, -1849168258, -1955997630, 817256396, 122951978, -839844983, 857024644, -1364812341}, i1013, objArr113);
                                        Class<?> cls7 = Class.forName((String) objArr113[0]);
                                        int i1014 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                        i13 = ((i1014 | 93) << 1) - (i1014 ^ 93);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i13 % 128;
                                        if (i13 % 2 == 0) {
                                            iArr2 = new int[]{1482124034, 71067184, 875385523, 344905197, 1421398991, -289520831, 917342935, 357686173, -1514979691, -1000589066, -2139603106, -2016664454};
                                            i14 = -TextUtils.indexOf("", "");
                                            i15 = 113;
                                        } else {
                                            iArr2 = new int[]{1482124034, 71067184, 875385523, 344905197, 1421398991, -289520831, 917342935, 357686173, -1514979691, -1000589066, -2139603106, -2016664454};
                                            i14 = -TextUtils.indexOf("", "");
                                            i15 = 17;
                                        }
                                        int i1015 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i1015 % 128;
                                        int i1016 = i1015 % 2;
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                        int i1017 = i14 * (-405);
                                        int i1018 = -(-(i15 * 407));
                                        int i1019 = ((i1017 | i1018) << 1) - (i1017 ^ i1018);
                                        int i1110 = ~i15;
                                        int i1111 = ~((i1110 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i1110 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                                        int i1112 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                        int i1113 = (i1112 ^ i14) | (i1112 & i14);
                                        i16 = (i1019 - (~((i1111 | (~((i1113 & i15) | (i1113 ^ i15)))) * (-406)))) - 1;
                                        int i1114 = ~i15;
                                        i17 = (i1114 & i1112) | (i1114 ^ i1112);
                                        i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 % 128;
                                        if (i18 % 2 != 0) {
                                            i19 = i16 >> ((~((i17 & i14) | (i17 ^ i14))) * (-406));
                                        } else {
                                            i19 = ((~((i17 & i14) | (i17 ^ i14))) * (-406)) + i16;
                                        }
                                        int i1115 = ~i14;
                                        int i1116 = ~((i1115 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i1115 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                                        int i1117 = ~(i15 | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                                        int i1118 = -(-(406 * ((i1116 & i1117) | (i1116 ^ i1117))));
                                        Object[] objArr114 = new Object[1];
                                        d(iArr2, (i19 & i1118) + (i1118 | i19), objArr114);
                                        Method method3 = cls7.getMethod((String) objArr114[0], null);
                                        LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                        LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                        objArr2 = (Object[]) method3.invoke(method, null);
                                        if (objArr2.length == 2) {
                                            int i1119 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i1119 % 128;
                                            int i1210 = i1119 % 2;
                                            if (Long.TYPE.equals(objArr2[0])) {
                                                int[] iArr7 = {975348212, -147359383, 942563258, 1279608144, 349440672, -1617942862, -2089559236, -1849168258, -1955997630, 817256396, 122951978, -839844983, 857024644, -1364812341};
                                                int i1211 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                int i1212 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1212 % 128;
                                                int i1213 = i1212 % 2;
                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                                int i1214 = i1211 * (-337);
                                                i20 = (i1214 & 7797) + (i1214 | 7797);
                                                int i1215 = ~i1211;
                                                int i1216 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                                                int i1217 = ~((i1216 & i1215) | (i1215 ^ i1216));
                                                int i1218 = ~(((-24) & i1211) | ((-24) ^ i1211));
                                                i21 = (i1217 & i1218) | (i1217 ^ i1218);
                                                int i1219 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                int i1310 = i1219 + 89;
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i1310 % 128;
                                                i22 = i1310 % 2;
                                                i23 = ~((i1211 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | (i1211 & iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
                                                if (i22 == 0) {
                                                    i24 = i20 % ((i23 | i21) - 338);
                                                } else {
                                                    i24 = (i20 - (~(((i23 & i21) | (i21 ^ i23)) * (-338)))) - 1;
                                                }
                                                int i1311 = -(-(338 * (~((i1215 ^ 23) | (i1215 & 23)))));
                                                int i1312 = ((i24 | i1311) << 1) - (i1311 ^ i24);
                                                int i1313 = ~i1211;
                                                int i1314 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                                                int i1315 = ~((i1313 & i1314) | (i1313 ^ i1314));
                                                int i1316 = i1219 + 3;
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i1316 % 128;
                                                int i1317 = i1316 % 2;
                                                int i1318 = (i1211 & 23) | (i1211 ^ 23);
                                                int i1319 = ~((i1318 & iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | (i1318 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
                                                int i145 = 338 * ((i1319 & i1315) | (i1315 ^ i1319));
                                                int i146 = ((i1312 | i145) << 1) - (i145 ^ i1312);
                                                objArr3 = new Object[1];
                                                d(iArr7, i146, objArr3);
                                                if (Class.forName((String) objArr3[0]).equals(objArr2[1])) {
                                                    i25 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i25 % 128;
                                                    if (i25 % 2 != 0) {
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                            char packedPositionChild2 = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                                                            int mirror3 = 2871 - AndroidCharacter.getMirror('0');
                                                            int mode2 = 22 - View.MeasureSpec.getMode(0);
                                                            byte[] bArr8 = $$d;
                                                            Object[] objArr115 = new Object[1];
                                                            c(bArr8[5], bArr8[10], bArr8[7], objArr115);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionChild2, mirror3, mode2, 1814927978, false, (String) objArr115[0], null);
                                                        }
                                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                            char c5 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
                                                            int tapTimeout2 = 2823 - (ViewConfiguration.getTapTimeout() >> 16);
                                                            int fadingEdgeLength2 = 22 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                                                            byte[] bArr9 = $$d;
                                                            Object[] objArr116 = new Object[1];
                                                            c(bArr9[5], bArr9[10], bArr9[7], objArr116);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c5, tapTimeout2, fadingEdgeLength2, 1814927978, false, (String) objArr116[0], null);
                                                        }
                                                        Object[] objArr117 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                            char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                                                            int mirror4 = AndroidCharacter.getMirror('0') + 2775;
                                                            int iIndexOf2 = TextUtils.indexOf("", "", 0) + 22;
                                                            byte[] bArr10 = $$d;
                                                            byte b8 = bArr10[7];
                                                            Object[] objArr118 = new Object[1];
                                                            c(b8, b8, bArr10[5], objArr118);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf2, mirror4, iIndexOf2, -2137287382, false, (String) objArr118[0], new Class[]{Long.TYPE, Method.class});
                                                        }
                                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr117)).longValue();
                                                        break;
                                                    }
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                        char cResolveSizeAndState2 = (char) View.resolveSizeAndState(0, 0, 0);
                                                        int capsMode2 = 2823 - TextUtils.getCapsMode("", 0, 0);
                                                        int i147 = 21 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                        byte[] bArr11 = $$d;
                                                        Object[] objArr24 = new Object[1];
                                                        c(bArr11[5], bArr11[10], bArr11[7], objArr24);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveSizeAndState2, capsMode2, i147, 1814927978, false, (String) objArr24[0], null);
                                                    }
                                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, method);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                                        char maximumFlingVelocity2 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                        int iGreen2 = Color.green(0) + 2823;
                                                        int iNormalizeMetaState2 = 22 - KeyEvent.normalizeMetaState(0);
                                                        byte[] bArr12 = $$d;
                                                        Object[] objArr25 = new Object[1];
                                                        c(bArr12[5], bArr12[10], bArr12[7], objArr25);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maximumFlingVelocity2, iGreen2, iNormalizeMetaState2, 1814927978, false, (String) objArr25[0], null);
                                                    }
                                                    Object[] objArr26 = {1L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                                        char c6 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                        int scrollBarSize2 = 2823 - (ViewConfiguration.getScrollBarSize() >> 8);
                                                        int defaultSize2 = 22 - View.getDefaultSize(0, 0);
                                                        byte[] bArr13 = $$d;
                                                        byte b9 = bArr13[7];
                                                        Object[] objArr27 = new Object[1];
                                                        c(b9, b9, bArr13[5], objArr27);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c6, scrollBarSize2, defaultSize2, -2137287382, false, (String) objArr27[0], new Class[]{Long.TYPE, Method.class});
                                                    }
                                                    ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr26)).longValue();
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                                i34++;
                                int i148 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i148 % 128;
                                int i149 = i148 % 2;
                                declaredMethods = declaredMethods;
                                i26 = 2;
                                c2 = 0;
                                i29 = 1;
                                clsArr2 = null;
                                i32 = 14;
                                i33 = 16;
                            }
                            i34++;
                            int i1410 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1410 % 128;
                            int i1411 = i1410 % 2;
                            declaredMethods = declaredMethods;
                            i26 = 2;
                            c2 = 0;
                            i29 = 1;
                            clsArr2 = null;
                            i32 = 14;
                            i33 = 16;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    }
                }
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                    char maximumFlingVelocity3 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2823;
                    int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 22;
                    byte[] bArr14 = $$d;
                    Object[] objArr28 = new Object[1];
                    c(bArr14[5], bArr14[10], bArr14[7], objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(maximumFlingVelocity3, scrollDefaultDelay, keyRepeatTimeout, 1814927978, false, (String) objArr28[0], null);
                }
                Object[] objArr29 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                    char mode3 = (char) View.MeasureSpec.getMode(0);
                    int iLastIndexOf2 = 2822 - TextUtils.lastIndexOf("", '0');
                    int iMyTid = 22 - (Process.myTid() >> 22);
                    byte[] bArr15 = $$d;
                    byte b10 = bArr15[7];
                    Object[] objArr30 = new Object[1];
                    c(b10, (byte) (b10 + 5), bArr15[5], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(mode3, iLastIndexOf2, iMyTid, 1025296417, false, (String) objArr30[0], new Class[]{Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr29);
                Object[] objArr31 = {0, constructorArr, null};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-687574488);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                    char c7 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 37656);
                    int iIndexOf3 = 2719 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    int i150 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 18;
                    byte[] bArr16 = $$d;
                    Object[] objArr32 = new Object[1];
                    c(bArr16[7], (byte) (-bArr16[14]), bArr16[5], objArr32);
                    i = 0;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c7, iIndexOf3, i150, 865785343, false, (String) objArr32[0], new Class[]{Integer.TYPE, Constructor[].class, List.class});
                } else {
                    i = 0;
                }
                long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr31)).longValue();
                long j = 1029687112;
                long j2 = -949;
                long j3 = (j2 * j) + (j2 * jLongValue);
                long j4 = -1;
                long j5 = jLongValue ^ j4;
                long jMyPid = Process.myPid();
                long j6 = jMyPid ^ j4;
                long j7 = j3 + (((long) 1900) * (((j5 | j6) ^ j4) | (((j ^ j4) | jMyPid) ^ j4))) + (((long) (-950)) * (((j6 | j) ^ j4) | ((jLongValue | jMyPid) ^ j4))) + (((long) 950) * (((jMyPid | j) ^ j4) | ((j6 | jLongValue) ^ j4))) + ((long) (-2053742734));
                int i151 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i151 % 128;
                if (i151 % 2 != 0) {
                    int iMyUid = Process.myUid();
                    int i152 = ~iMyUid;
                    i2 = ((int) (j7 << 22)) & ((-1776689670) + (((~((-1605833095) | i152)) | (~(168606683 | iMyUid))) * 217) + (((~(iMyUid | (-1605833095))) | 1437794308) * 217) + (((~(168606683 | i152)) | 1605833094) * 217));
                } else {
                    int iMyPid = Process.myPid();
                    int i153 = 2069024522 + ((~((-403376393) | iMyPid)) * 216);
                    int i154 = ~iMyPid;
                    i2 = ((int) (j7 >> 32)) & (i153 + (((-134285313) | i154) * (-216)) + (((~(i154 | (-403376393))) | 1840602803) * 216));
                }
                int i155 = (int) j7;
                LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                int i156 = ~(((int) Runtime.getRuntime().totalMemory()) | (-440569136));
                int i157 = i155 & ((((556090709 | i156) * (-658)) - 602605579) + ((i156 | 1285) * 658));
                int i158 = (i2 & i157) | (i2 ^ i157);
                int i159 = i158 >>> 24;
                int i160 = i158 & ViewCompat.MEASURED_SIZE_MASK;
                if (i159 != 0) {
                    int i161 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i162 = ((i161 | 111) << 1) - (i161 ^ 111);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i162 % 128;
                    int i163 = i162 % 2;
                    i3 = 1;
                } else {
                    i3 = i;
                }
                if (i3 != 0) {
                    i = 1;
                } else {
                    int i164 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i165 = (i164 ^ 111) + ((i164 & 111) << 1);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i165 % 128;
                    int i166 = i165 % 2;
                }
                if (i3 == 0 || i160 >= constructorArr.length || (constructor = constructorArr[i160]) == null) {
                    string = null;
                } else {
                    int i167 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i168 = ((i167 | 85) << 1) - (i167 ^ 85);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i168 % 128;
                    if (i168 % 2 != 0) {
                        constructor.toString();
                        throw null;
                    }
                    string = constructor.toString();
                }
                list.add(string);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                int i169 = -(-(i159 * (-375)));
                int i170 = (((-2250) | i169) << 1) - (i169 ^ (-2250));
                int i171 = ~i159;
                int i172 = (~((i171 & (-7)) | ((-7) ^ i171))) | iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                int i173 = i159 | 6;
                int i174 = ~i173;
                int i175 = -(-(((i172 & i174) | (i172 ^ i174)) * 376));
                int i176 = (i170 ^ i175) + ((i175 & i170) << 1);
                int i177 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                int i178 = ~((i177 & 6) | (i177 ^ 6));
                int i179 = ~i173;
                int i180 = i176 + (((i178 & i179) | (i178 ^ i179)) * (-376));
                int i181 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault8 & (-7)) | ((-7) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                return (i180 + (((i181 & i159) | (i159 ^ i181)) * 376)) * i;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }

        private static String $$g(short s, short s2, int i) {
            int i2 = 3 - (s * 4);
            int i3 = s2 * 4;
            int i4 = (i * 56) + 66;
            byte[] bArr = $$c;
            byte[] bArr2 = new byte[i3 + 1];
            int i5 = -1;
            if (bArr == null) {
                i5 = -1;
                i4 = (-i2) + i3;
                i2 = i2;
            }
            while (true) {
                int i6 = i5 + 1;
                bArr2[i6] = (byte) i4;
                if (i6 == i3) {
                    return new String(bArr2, 0);
                }
                int i7 = i2 + 1;
                i5 = i6;
                i4 = (-bArr[i7]) + i4;
                i2 = i7;
            }
        }
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingActionButtonStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        this.shadowPadding = new Rect();
        this.touchArea = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.FloatingActionButton, i, i2, new int[0]);
        this.backgroundTint = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, R.styleable.FloatingActionButton_backgroundTint);
        this.backgroundTintMode = ViewUtils.parseTintMode(typedArrayObtainStyledAttributes.getInt(R.styleable.FloatingActionButton_backgroundTintMode, -1), null);
        this.rippleColor = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, R.styleable.FloatingActionButton_rippleColor);
        this.size = typedArrayObtainStyledAttributes.getInt(R.styleable.FloatingActionButton_fabSize, -1);
        this.customSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FloatingActionButton_fabCustomSize, 0);
        this.borderWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FloatingActionButton_borderWidth, 0);
        float dimension = typedArrayObtainStyledAttributes.getDimension(R.styleable.FloatingActionButton_elevation, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(R.styleable.FloatingActionButton_hoveredFocusedTranslationZ, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(R.styleable.FloatingActionButton_pressedTranslationZ, 0.0f);
        this.compatPadding = typedArrayObtainStyledAttributes.getBoolean(R.styleable.FloatingActionButton_useCompatPadding, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        setMaxImageSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FloatingActionButton_maxImageSize, 0));
        MotionSpec motionSpecCreateFromAttribute = MotionSpec.createFromAttribute(context2, typedArrayObtainStyledAttributes, R.styleable.FloatingActionButton_showMotionSpec);
        MotionSpec motionSpecCreateFromAttribute2 = MotionSpec.createFromAttribute(context2, typedArrayObtainStyledAttributes, R.styleable.FloatingActionButton_hideMotionSpec);
        ShapeAppearanceModel shapeAppearanceModelBuild = ShapeAppearanceModel.builder(context2, attributeSet, i, i2, ShapeAppearanceModel.PILL).build();
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R.styleable.FloatingActionButton_ensureMinTouchTargetSize, false);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(R.styleable.FloatingActionButton_android_enabled, true));
        typedArrayObtainStyledAttributes.recycle();
        AppCompatImageHelper appCompatImageHelper = new AppCompatImageHelper(this);
        this.imageHelper = appCompatImageHelper;
        appCompatImageHelper.loadFromAttributes(attributeSet, i);
        this.expandableWidgetHelper = new ExpandableWidgetHelper(this);
        getImpl().setShapeAppearance(shapeAppearanceModelBuild);
        getImpl().initializeBackgroundDrawable(this.backgroundTint, this.backgroundTintMode, this.rippleColor, this.borderWidth);
        getImpl().setMinTouchTargetSize(dimensionPixelSize);
        getImpl().setElevation(dimension);
        getImpl().setHoveredFocusedTranslationZ(dimension2);
        getImpl().setPressedTranslationZ(dimension3);
        getImpl().setShowMotionSpec(motionSpecCreateFromAttribute);
        getImpl().setHideMotionSpec(motionSpecCreateFromAttribute2);
        getImpl().setEnsureMinTouchTargetSize(z);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.imagePadding = (sizeDimension - this.maxImageSize) / 2;
        getImpl().updatePadding();
        int iMin = Math.min(View.resolveSize(sizeDimension, i), View.resolveSize(sizeDimension, i2));
        setMeasuredDimension(this.shadowPadding.left + iMin + this.shadowPadding.right, iMin + this.shadowPadding.top + this.shadowPadding.bottom);
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.rippleColor;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.rippleColor;
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.rippleColor != colorStateList) {
            this.rippleColor = colorStateList;
            getImpl().setRippleColor(this.rippleColor);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    public CoordinatorLayout.Behavior<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.backgroundTint;
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.backgroundTint != colorStateList) {
            this.backgroundTint = colorStateList;
            getImpl().setBackgroundTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.backgroundTintMode;
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.backgroundTintMode != mode) {
            this.backgroundTintMode = mode;
            getImpl().setBackgroundTintMode(mode);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    @Override // androidx.core.view.TintableBackgroundView
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    @Override // androidx.core.view.TintableBackgroundView
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Override // androidx.core.widget.TintableImageSourceView
    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.imageTint != colorStateList) {
            this.imageTint = colorStateList;
            onApplySupportImageTint();
        }
    }

    @Override // androidx.core.widget.TintableImageSourceView
    public ColorStateList getSupportImageTintList() {
        return this.imageTint;
    }

    @Override // androidx.core.widget.TintableImageSourceView
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.imageMode != mode) {
            this.imageMode = mode;
            onApplySupportImageTint();
        }
    }

    @Override // androidx.core.widget.TintableImageSourceView
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.imageMode;
    }

    private void onApplySupportImageTint() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.imageTint;
        if (colorStateList == null) {
            DrawableCompat.clearColorFilter(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.imageMode;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(colorForState, mode));
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.imageHelper.setImageResource(i);
        onApplySupportImageTint();
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().updateImageMatrixScale();
            if (this.imageTint != null) {
                onApplySupportImageTint();
            }
        }
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        getImpl().setShapeAppearance(shapeAppearanceModel);
    }

    @Override // com.google.android.material.shape.Shapeable
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return (ShapeAppearanceModel) Preconditions.checkNotNull(getImpl().getShapeAppearance());
    }

    public boolean shouldEnsureMinTouchTargetSize() {
        return getImpl().getEnsureMinTouchTargetSize();
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().getEnsureMinTouchTargetSize()) {
            getImpl().setEnsureMinTouchTargetSize(z);
            requestLayout();
        }
    }

    @Override // com.google.android.material.internal.VisibilityAwareImageButton, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public void setMaxImageSize(int i) {
        this.maxImageSize = i;
        getImpl().setMaxImageSize(i);
    }

    public void show() {
        show(null);
    }

    public void show(OnVisibilityChangedListener onVisibilityChangedListener) {
        show(onVisibilityChangedListener, true);
    }

    void show(OnVisibilityChangedListener onVisibilityChangedListener, boolean z) {
        getImpl().show(wrapOnVisibilityChangedListener(onVisibilityChangedListener), z);
    }

    public void addOnShowAnimationListener(Animator.AnimatorListener animatorListener) {
        getImpl().addOnShowAnimationListener(animatorListener);
    }

    public void removeOnShowAnimationListener(Animator.AnimatorListener animatorListener) {
        getImpl().removeOnShowAnimationListener(animatorListener);
    }

    public void hide() {
        hide(null);
    }

    public void hide(OnVisibilityChangedListener onVisibilityChangedListener) {
        hide(onVisibilityChangedListener, true);
    }

    void hide(OnVisibilityChangedListener onVisibilityChangedListener, boolean z) {
        getImpl().hide(wrapOnVisibilityChangedListener(onVisibilityChangedListener), z);
    }

    public void addOnHideAnimationListener(Animator.AnimatorListener animatorListener) {
        getImpl().addOnHideAnimationListener(animatorListener);
    }

    public void removeOnHideAnimationListener(Animator.AnimatorListener animatorListener) {
        getImpl().removeOnHideAnimationListener(animatorListener);
    }

    @Override // com.google.android.material.expandable.ExpandableWidget
    public boolean setExpanded(boolean z) {
        return this.expandableWidgetHelper.setExpanded(z);
    }

    @Override // com.google.android.material.expandable.ExpandableWidget
    public boolean isExpanded() {
        return this.expandableWidgetHelper.isExpanded();
    }

    @Override // com.google.android.material.expandable.ExpandableTransformationWidget
    public void setExpandedComponentIdHint(int i) {
        this.expandableWidgetHelper.setExpandedComponentIdHint(i);
    }

    @Override // com.google.android.material.expandable.ExpandableTransformationWidget
    public int getExpandedComponentIdHint() {
        return this.expandableWidgetHelper.getExpandedComponentIdHint();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.compatPadding != z) {
            this.compatPadding = z;
            getImpl().onCompatShadowChanged();
        }
    }

    public boolean getUseCompatPadding() {
        return this.compatPadding;
    }

    public void setSize(int i) {
        this.customSize = 0;
        if (i != this.size) {
            this.size = i;
            requestLayout();
        }
    }

    public int getSize() {
        return this.size;
    }

    private FloatingActionButtonImpl.InternalVisibilityChangedListener wrapOnVisibilityChangedListener(final OnVisibilityChangedListener onVisibilityChangedListener) {
        if (onVisibilityChangedListener == null) {
            return null;
        }
        return new FloatingActionButtonImpl.InternalVisibilityChangedListener() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButton.1
            @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalVisibilityChangedListener
            public void onShown() {
                onVisibilityChangedListener.onShown(FloatingActionButton.this);
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalVisibilityChangedListener
            public void onHidden() {
                onVisibilityChangedListener.onHidden(FloatingActionButton.this);
            }
        };
    }

    public boolean isOrWillBeHidden() {
        return getImpl().isOrWillBeHidden();
    }

    public boolean isOrWillBeShown() {
        return getImpl().isOrWillBeShown();
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i != this.customSize) {
            this.customSize = i;
            requestLayout();
        }
    }

    public int getCustomSize() {
        return this.customSize;
    }

    public void clearCustomSize() {
        setCustomSize(0);
    }

    int getSizeDimension() {
        return getSizeDimension(this.size);
    }

    private int getSizeDimension(int i) {
        while (true) {
            int i2 = this.customSize;
            if (i2 != 0) {
                return i2;
            }
            Resources resources = getResources();
            if (i != -1) {
                if (i == 1) {
                    return resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
                }
                return resources.getDimensionPixelSize(R.dimen.design_fab_size_normal);
            }
            i = Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < AUTO_MINI_LARGEST_SCREEN_WIDTH ? 1 : 0;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().onAttachedToWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().onDetachedFromWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().onDrawableStateChanged(getDrawableState());
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().jumpDrawableToCurrentState();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(parcelableOnSaveInstanceState);
        extendableSavedState.extendableStates.put(EXPANDABLE_WIDGET_HELPER_KEY, this.expandableWidgetHelper.onSaveInstanceState());
        return extendableSavedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.getSuperState());
        this.expandableWidgetHelper.onRestoreInstanceState((Bundle) Preconditions.checkNotNull(extendableSavedState.extendableStates.get(EXPANDABLE_WIDGET_HELPER_KEY)));
    }

    @Deprecated
    public boolean getContentRect(Rect rect) {
        if (!ViewCompat.isLaidOut(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        offsetRectWithShadow(rect);
        return true;
    }

    public void getMeasuredContentRect(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        offsetRectWithShadow(rect);
    }

    private void getTouchTargetRect(Rect rect) {
        getMeasuredContentRect(rect);
        int i = -this.impl.getTouchTargetPadding();
        rect.inset(i, i);
    }

    private void offsetRectWithShadow(Rect rect) {
        rect.left += this.shadowPadding.left;
        rect.top += this.shadowPadding.top;
        rect.right -= this.shadowPadding.right;
        rect.bottom -= this.shadowPadding.bottom;
    }

    public Drawable getContentBackground() {
        return getImpl().getContentBackground();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            getTouchTargetRect(this.touchArea);
            if (!this.touchArea.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.getInsetDodgeRect(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean isAutoHideEnabled() {
            return super.isAutoHideEnabled();
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ void onAttachedToLayoutParams(CoordinatorLayout.LayoutParams layoutParams) {
            super.onAttachedToLayoutParams(layoutParams);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.onDependentViewChanged(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            return super.onLayoutChild(coordinatorLayout, floatingActionButton, i);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ void setAutoHideEnabled(boolean z) {
            super.setAutoHideEnabled(z);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ void setInternalAutoHideListener(OnVisibilityChangedListener onVisibilityChangedListener) {
            super.setInternalAutoHideListener(onVisibilityChangedListener);
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        getImpl().updateShapeElevation(f);
    }

    public float getCompatElevation() {
        return getImpl().getElevation();
    }

    public void setCompatElevation(float f) {
        getImpl().setElevation(f);
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().getHoveredFocusedTranslationZ();
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        getImpl().setHoveredFocusedTranslationZ(f);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().getPressedTranslationZ();
    }

    public void setCompatPressedTranslationZ(float f) {
        getImpl().setPressedTranslationZ(f);
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public MotionSpec getShowMotionSpec() {
        return getImpl().getShowMotionSpec();
    }

    public void setShowMotionSpec(MotionSpec motionSpec) {
        getImpl().setShowMotionSpec(motionSpec);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(MotionSpec.createFromResource(getContext(), i));
    }

    public MotionSpec getHideMotionSpec() {
        return getImpl().getHideMotionSpec();
    }

    public void setHideMotionSpec(MotionSpec motionSpec) {
        getImpl().setHideMotionSpec(motionSpec);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(MotionSpec.createFromResource(getContext(), i));
    }

    public void addTransformationCallback(TransformationCallback<? extends FloatingActionButton> transformationCallback) {
        getImpl().addTransformationCallback(new TransformationCallbackWrapper(transformationCallback));
    }

    public void removeTransformationCallback(TransformationCallback<? extends FloatingActionButton> transformationCallback) {
        getImpl().removeTransformationCallback(new TransformationCallbackWrapper(transformationCallback));
    }

    /* JADX INFO: loaded from: classes4.dex */
    class TransformationCallbackWrapper<T extends FloatingActionButton> implements FloatingActionButtonImpl.InternalTransformationCallback {
        private final TransformationCallback<T> listener;

        TransformationCallbackWrapper(TransformationCallback<T> transformationCallback) {
            this.listener = transformationCallback;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalTransformationCallback
        public void onTranslationChanged() {
            this.listener.onTranslationChanged(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalTransformationCallback
        public void onScaleChanged() {
            this.listener.onScaleChanged(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof TransformationCallbackWrapper) && ((TransformationCallbackWrapper) obj).listener.equals(this.listener);
        }

        public int hashCode() {
            return this.listener.hashCode();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().onTranslationChanged();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().onTranslationChanged();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().onTranslationChanged();
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().onScaleChanged();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().onScaleChanged();
    }

    public void setShadowPaddingEnabled(boolean z) {
        getImpl().setShadowPaddingEnabled(z);
    }

    private FloatingActionButtonImpl getImpl() {
        if (this.impl == null) {
            this.impl = createImpl();
        }
        return this.impl;
    }

    private FloatingActionButtonImpl createImpl() {
        return new FloatingActionButtonImplLollipop(this, new ShadowDelegateImpl());
    }

    class ShadowDelegateImpl implements ShadowViewDelegate {
        ShadowDelegateImpl() {
        }

        @Override // com.google.android.material.shadow.ShadowViewDelegate
        public float getRadius() {
            return FloatingActionButton.this.getSizeDimension() / 2.0f;
        }

        @Override // com.google.android.material.shadow.ShadowViewDelegate
        public void setShadowPadding(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.shadowPadding.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.imagePadding, i2 + FloatingActionButton.this.imagePadding, i3 + FloatingActionButton.this.imagePadding, i4 + FloatingActionButton.this.imagePadding);
        }

        @Override // com.google.android.material.shadow.ShadowViewDelegate
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override // com.google.android.material.shadow.ShadowViewDelegate
        public boolean isCompatPaddingEnabled() {
            return FloatingActionButton.this.compatPadding;
        }
    }
}
