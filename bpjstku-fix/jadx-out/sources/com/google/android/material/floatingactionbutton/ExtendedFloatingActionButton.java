package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.initSession;
import defpackage.setVideoStabilizationMode;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes6.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.AttachedBehavior {
    private static final int ANIM_STATE_HIDING = 1;
    private static final int ANIM_STATE_NONE = 0;
    private static final int ANIM_STATE_SHOWING = 2;
    private static final int DEF_STYLE_RES;
    private static final int EXTEND = 3;
    private static final int EXTEND_STRATEGY_AUTO = 0;
    private static final int EXTEND_STRATEGY_MATCH_PARENT = 2;
    private static final int EXTEND_STRATEGY_WRAP_CONTENT = 1;
    static final Property<View, Float> HEIGHT;
    private static final int HIDE = 1;
    static final Property<View, Float> PADDING_END;
    static final Property<View, Float> PADDING_START;
    private static final int SHOW = 0;
    private static final int SHRINK = 2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    static final Property<View, Float> WIDTH;
    private static char[] b;
    private int animState;
    private boolean animateShowBeforeLayout;
    private final CoordinatorLayout.Behavior<ExtendedFloatingActionButton> behavior;
    private final AnimatorTracker changeVisibilityTracker;
    private final int collapsedSize;
    private final MotionStrategy extendStrategy;
    private final int extendStrategyType;
    private int extendedPaddingEnd;
    private int extendedPaddingStart;
    private final MotionStrategy hideStrategy;
    private boolean isExtended;
    private boolean isTransforming;
    private int originalHeight;
    protected ColorStateList originalTextCsl;
    private int originalWidth;
    private final MotionStrategy showStrategy;
    private final MotionStrategy shrinkStrategy;
    private static final byte[] $$l = {57, -50, -56, -93};
    private static final int $$m = 200;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {57, -50, -56, -93, -14, 0, Base64.padSymbol, -54, -16, 4, -11, -3, 7, -12, 69, -56, 1, -21, 17, 49, -68, -4, 1, 0, -4, 63, -36, -36, 1, 0, -4, 41, -31, -21, 17, 12, -35, 3, -5, 11, 63, -2, -35, -53, 2, 13, -15, 2, 11, -13, 23, -40, 9, -8, 10, 1, -17, 9, 4, 21, -23, -14, 9, -4, 1, 46, -1};
    private static final int $$k = 220;
    private static final byte[] $$d = {48, -119, -71, 110, -23, 37, -42, -11, 10, -18, 7, 0, -7, -7, -23, 44, -44, -10, 5, -6, -18};
    private static final int $$e = 163;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;

    public static abstract class OnChangedCallback {
        public void onExtended(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void onHidden(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void onShown(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void onShrunken(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }
    }

    interface Size {
        int getHeight();

        ViewGroup.LayoutParams getLayoutParams();

        int getPaddingEnd();

        int getPaddingStart();

        int getWidth();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(byte r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            int r0 = r6 + 1
            byte[] r1 = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.$$d
            int r5 = r5 * 10
            int r5 = 14 - r5
            int r7 = r7 * 3
            int r7 = 100 - r7
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
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L22:
            int r3 = r3 + 1
            r4 = r1[r5]
        L26:
            int r5 = r5 + 1
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-5)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.f(byte, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void i(byte r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 + 4
            int r5 = 99 - r5
            int r6 = r6 * 63
            int r0 = 64 - r6
            byte[] r1 = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.$$j
            byte[] r0 = new byte[r0]
            int r6 = 63 - r6
            r2 = -1
            if (r1 != 0) goto L14
            r3 = r6
            r5 = r7
            goto L2b
        L14:
            r4 = r7
            r7 = r5
            r5 = r4
        L17:
            int r2 = r2 + 1
            byte r3 = (byte) r7
            int r5 = r5 + 1
            r0[r2] = r3
            if (r2 != r6) goto L29
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            r8[r6] = r5
            return
        L29:
            r3 = r1[r5]
        L2b:
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-2)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.i(byte, short, int, java.lang.Object[]):void");
    }

    static /* synthetic */ int access$000(ExtendedFloatingActionButton extendedFloatingActionButton) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = extendedFloatingActionButton.extendedPaddingStart;
        if (i3 != 0) {
            return i4;
        }
        throw null;
    }

    static /* synthetic */ int access$100(ExtendedFloatingActionButton extendedFloatingActionButton) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = extendedFloatingActionButton.extendedPaddingEnd;
        if (i3 == 0) {
            return i4;
        }
        throw null;
    }

    static /* synthetic */ int access$200(ExtendedFloatingActionButton extendedFloatingActionButton) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = extendedFloatingActionButton.originalHeight;
        if (i3 != 0) {
            int i5 = 41 / 0;
        }
        return i4;
    }

    static /* synthetic */ int access$202(ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 41;
        int i4 = i3 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4;
        int i5 = i3 % 2;
        Object obj = null;
        extendedFloatingActionButton.originalHeight = i;
        if (i5 != 0) {
            obj.hashCode();
            throw null;
        }
        int i6 = i4 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
        if (i6 % 2 != 0) {
            return i;
        }
        throw null;
    }

    static /* synthetic */ int access$300(ExtendedFloatingActionButton extendedFloatingActionButton) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        int i5 = extendedFloatingActionButton.originalWidth;
        int i6 = i3 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    static /* synthetic */ int access$302(ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
        int i4 = i3 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4;
        int i5 = i3 % 2;
        extendedFloatingActionButton.originalWidth = i;
        if (i5 == 0) {
            int i6 = 60 / 0;
        }
        int i7 = i4 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
        int i8 = i7 % 2;
        return i;
    }

    static /* synthetic */ void access$400(ExtendedFloatingActionButton extendedFloatingActionButton, int i, OnChangedCallback onChangedCallback) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        extendedFloatingActionButton.performMotion(i, onChangedCallback);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    static /* synthetic */ boolean access$500(ExtendedFloatingActionButton extendedFloatingActionButton) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        boolean z = extendedFloatingActionButton.isExtended;
        int i5 = i3 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 85 / 0;
        }
        return z;
    }

    static /* synthetic */ boolean access$502(ExtendedFloatingActionButton extendedFloatingActionButton, boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        extendedFloatingActionButton.isExtended = z;
        if (i4 == 0) {
            int i5 = 21 / 0;
        }
        int i6 = i3 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        if (i6 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ boolean access$602(ExtendedFloatingActionButton extendedFloatingActionButton, boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        extendedFloatingActionButton.isTransforming = z;
        int i5 = i3 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    static /* synthetic */ int access$702(ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3;
        int i4 = i3 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4;
        int i5 = i3 % 2;
        extendedFloatingActionButton.animState = i;
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i4 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    static /* synthetic */ boolean access$800(ExtendedFloatingActionButton extendedFloatingActionButton) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsOrWillBeShown = extendedFloatingActionButton.isOrWillBeShown();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return zIsOrWillBeShown;
    }

    static /* synthetic */ boolean access$900(ExtendedFloatingActionButton extendedFloatingActionButton) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsOrWillBeHidden = extendedFloatingActionButton.isOrWillBeHidden();
        if (i3 == 0) {
            int i4 = 69 / 0;
        }
        return zIsOrWillBeHidden;
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        TuitionPaymentFragmentbindingInflater1();
        DEF_STYLE_RES = R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;
        WIDTH = new Property<View, Float>(Float.class, "width") { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.6
            @Override // android.util.Property
            public void set(View view, Float f) {
                view.getLayoutParams().width = f.intValue();
                view.requestLayout();
            }

            @Override // android.util.Property
            public Float get(View view) {
                return Float.valueOf(view.getLayoutParams().width);
            }
        };
        HEIGHT = new Property<View, Float>(Float.class, "height") { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.7
            @Override // android.util.Property
            public void set(View view, Float f) {
                view.getLayoutParams().height = f.intValue();
                view.requestLayout();
            }

            @Override // android.util.Property
            public Float get(View view) {
                return Float.valueOf(view.getLayoutParams().height);
            }
        };
        PADDING_START = new Property<View, Float>(Float.class, "paddingStart") { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.8
            @Override // android.util.Property
            public void set(View view, Float f) {
                ViewCompat.setPaddingRelative(view, f.intValue(), view.getPaddingTop(), ViewCompat.getPaddingEnd(view), view.getPaddingBottom());
            }

            @Override // android.util.Property
            public Float get(View view) {
                return Float.valueOf(ViewCompat.getPaddingStart(view));
            }
        };
        PADDING_END = new Property<View, Float>(Float.class, "paddingEnd") { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.9
            @Override // android.util.Property
            public void set(View view, Float f) {
                ViewCompat.setPaddingRelative(view, ViewCompat.getPaddingStart(view), view.getPaddingTop(), f.intValue(), view.getPaddingBottom());
            }

            @Override // android.util.Property
            public Float get(View view) {
                return Float.valueOf(ViewCompat.getPaddingEnd(view));
            }
        };
        int i = TuitionPaymentFragmentbindingInflater1 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
        if (i % 2 != 0) {
            int i2 = 56 / 0;
        }
    }

    public ExtendedFloatingActionButton(Context context) {
        this(context, null);
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.extendedFloatingActionButtonStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        this.animState = 0;
        AnimatorTracker animatorTracker = new AnimatorTracker();
        this.changeVisibilityTracker = animatorTracker;
        ShowStrategy showStrategy = new ShowStrategy(animatorTracker);
        this.showStrategy = showStrategy;
        HideStrategy hideStrategy = new HideStrategy(animatorTracker);
        this.hideStrategy = hideStrategy;
        this.isExtended = true;
        this.isTransforming = false;
        this.animateShowBeforeLayout = false;
        Context context2 = getContext();
        this.behavior = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.ExtendedFloatingActionButton, i, i2, new int[0]);
        MotionSpec motionSpecCreateFromAttribute = MotionSpec.createFromAttribute(context2, typedArrayObtainStyledAttributes, R.styleable.ExtendedFloatingActionButton_showMotionSpec);
        MotionSpec motionSpecCreateFromAttribute2 = MotionSpec.createFromAttribute(context2, typedArrayObtainStyledAttributes, R.styleable.ExtendedFloatingActionButton_hideMotionSpec);
        MotionSpec motionSpecCreateFromAttribute3 = MotionSpec.createFromAttribute(context2, typedArrayObtainStyledAttributes, R.styleable.ExtendedFloatingActionButton_extendMotionSpec);
        MotionSpec motionSpecCreateFromAttribute4 = MotionSpec.createFromAttribute(context2, typedArrayObtainStyledAttributes, R.styleable.ExtendedFloatingActionButton_shrinkMotionSpec);
        this.collapsedSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ExtendedFloatingActionButton_collapsedSize, -1);
        int i3 = typedArrayObtainStyledAttributes.getInt(R.styleable.ExtendedFloatingActionButton_extendStrategy, 1);
        this.extendStrategyType = i3;
        this.extendedPaddingStart = ViewCompat.getPaddingStart(this);
        this.extendedPaddingEnd = ViewCompat.getPaddingEnd(this);
        AnimatorTracker animatorTracker2 = new AnimatorTracker();
        ChangeSizeStrategy changeSizeStrategy = new ChangeSizeStrategy(animatorTracker2, getSizeFromExtendStrategyType(i3), true);
        this.extendStrategy = changeSizeStrategy;
        ChangeSizeStrategy changeSizeStrategy2 = new ChangeSizeStrategy(animatorTracker2, new Size() { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.1
            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getWidth() {
                return ExtendedFloatingActionButton.this.getCollapsedSize();
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getHeight() {
                return ExtendedFloatingActionButton.this.getCollapsedSize();
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getPaddingStart() {
                return ExtendedFloatingActionButton.this.getCollapsedPadding();
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getPaddingEnd() {
                return ExtendedFloatingActionButton.this.getCollapsedPadding();
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public ViewGroup.LayoutParams getLayoutParams() {
                return new ViewGroup.LayoutParams(getWidth(), getHeight());
            }
        }, false);
        this.shrinkStrategy = changeSizeStrategy2;
        showStrategy.setMotionSpec(motionSpecCreateFromAttribute);
        hideStrategy.setMotionSpec(motionSpecCreateFromAttribute2);
        changeSizeStrategy.setMotionSpec(motionSpecCreateFromAttribute3);
        changeSizeStrategy2.setMotionSpec(motionSpecCreateFromAttribute4);
        typedArrayObtainStyledAttributes.recycle();
        setShapeAppearanceModel(ShapeAppearanceModel.builder(context2, attributeSet, i, i2, ShapeAppearanceModel.PILL).build());
        saveOriginalTextCsl();
    }

    private static void h(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        char c = 0;
        int i2 = iArr[0];
        int i3 = 1;
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = b;
        char c2 = '0';
        long j = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = new Object[i3];
                    objArr2[c] = Integer.valueOf(cArr[i7]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ExpandableListView.getPackedPositionGroup(j), 1269 - TextUtils.lastIndexOf("", c2), ExpandableListView.getPackedPositionType(j) + 18, 407021364, false, $$n(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i7++;
                    c = 0;
                    i3 = 1;
                    c2 = '0';
                    j = 0;
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
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i2, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            setvideostabilizationmode.b = 0;
            char c3 = 0;
            while (setvideostabilizationmode.b < i4) {
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i8 = setvideostabilizationmode.b;
                    Object[] objArr3 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c3)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), TextUtils.getCapsMode("", 0, 0) + 3225, 12 - TextUtils.lastIndexOf("", '0', 0), 2133916302, false, $$n(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                } else {
                    int i9 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c3)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ExpandableListView.getPackedPositionChild(0L) + 29945), TextUtils.getOffsetBefore("", 0) + 1755, 24 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 387247676, false, $$n(b6, b7, (byte) (b7 + 2)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i9] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                }
                c3 = cArr4[setvideostabilizationmode.b];
                Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (41240 - TextUtils.lastIndexOf("", '0', 0)), TextUtils.getOffsetBefore("", 0) + 1705, 21 - (ViewConfiguration.getEdgeSlop() >> 16), -1434471773, false, $$n(b8, b9, (byte) (b9 | 6)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            int i10 = $11 + 61;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr3, 1, cArr5, 1, i4);
                System.arraycopy(cArr5, 1, cArr3, i4 >>> i6, i6);
                System.arraycopy(cArr5, i6, cArr3, 1, i4 << i6);
            } else {
                char[] cArr6 = new char[i4];
                System.arraycopy(cArr3, 0, cArr6, 0, i4);
                int i11 = i4 - i6;
                System.arraycopy(cArr6, 0, cArr3, i11, i6);
                System.arraycopy(cArr6, i6, cArr3, 0, i11);
            }
        }
        if (z) {
            int i12 = $11 + 3;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            char[] cArr7 = new char[i4];
            setvideostabilizationmode.b = 0;
            while (setvideostabilizationmode.b < i4) {
                cArr7[setvideostabilizationmode.b] = cArr3[(i4 - setvideostabilizationmode.b) - 1];
                setvideostabilizationmode.b++;
                int i14 = $11 + 11;
                $10 = i14 % 128;
                int i15 = i14 % 2;
            }
            cArr3 = cArr7;
        }
        if (i5 > 0) {
            int i16 = 0;
            while (true) {
                setvideostabilizationmode.b = i16;
                if (setvideostabilizationmode.b >= i4) {
                    break;
                }
                int i17 = $10 + 121;
                $11 = i17 % 128;
                int i18 = i17 % 2;
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                i16 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private Size getSizeFromExtendStrategyType(int i) {
        int i2 = 2 % 2;
        final Size size = new Size() { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.2
            private static short[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            private static final byte[] $$c = {91, -17, 90, 37};
            private static final int $$f = 14;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {91, -17, 90, 37, -20, -6, 55, -69, -12, -14, -6, 3, -9, -10, -1, -25, -7, -8, 11, 43, -59, -26, -14, 3, 3, 45, -27, -58, -14, 3, 3, 8, -26, -21, -12, 9, -21, 70, -21, -41, 4, -19, 3, -14, -7, 22, -25, -32, 4, 0, -17, -14, 38, -52, 9, -14, -14, 0, -17, -14, -7, -5, 3, -6, -14, 0, -19, -5, -13, -6, -5, -13, 1, -7, -26, 5, -4, -26, 34, -42, 3, -9, -15, 0, -9, -9, -3, -28, 1, -16, 58};
            private static final int $$e = 131;
            private static final byte[] $$a = {118, 35, -100, -35, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
            private static final int $$b = 219;
            private static int asInterface = 0;
            private static int g = 1;
            private static int b = 2099985814;
            private static int TuitionPaymentFragmentbindingInflater1 = -1934795538;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 992615824;
            private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {30, 2, 21, -1, 32, 30, 7, 23, 12, -16, -13, 77, 18, -41, 92, 13, 12, 11, 24, 0, 27, -40, -84, -35, -88, -73, -92, -65, -46, -93, -34, -81, -77, -35, -85, 93, 82, 77, 36, 42, 117, 91, 37, 77, 35, 75, 47, 60, 45, -112, 94, 33, 13, 100, 85, 84, 83, 32, 72, 35, 62, 57, 40, 10, 49, 53, 48, 51, 63, -18, 64, 57, 4, 42, 63, 48, 13, -50, -9, -57, -4, -96, -93, 1, -1, -53, -13, -72, 11, -19, -45, -15, -101, -105, 78, -79, -105, 104, 115, -83, 103, 97, -105, 100, 99, -101, -111, -26, -26, -26, -26, -26, -26};

            /* JADX WARN: Code duplicated, block: B:10:0x0025  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(int r6, byte r7, short r8, java.lang.Object[] r9) {
                /*
                    byte[] r0 = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.AnonymousClass2.$$a
                    int r6 = r6 * 14
                    int r6 = r6 + 84
                    int r8 = r8 * 52
                    int r8 = 55 - r8
                    int r1 = r7 + 1
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    if (r0 != 0) goto L15
                    r4 = r7
                    r6 = r8
                    r3 = r2
                    goto L2c
                L15:
                    r3 = r2
                L16:
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    int r8 = r8 + 1
                    if (r3 != r7) goto L25
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L25:
                    int r3 = r3 + 1
                    r4 = r0[r8]
                    r5 = r8
                    r8 = r6
                    r6 = r5
                L2c:
                    int r8 = r8 + r4
                    int r8 = r8 + (-10)
                    r5 = r8
                    r8 = r6
                    r6 = r5
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.AnonymousClass2.a(int, byte, short, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0026  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(int r5, short r6, int r7, java.lang.Object[] r8) {
                /*
                    int r7 = r7 * 15
                    int r7 = r7 + 84
                    int r6 = r6 * 17
                    int r0 = 53 - r6
                    int r5 = r5 * 35
                    int r5 = 39 - r5
                    byte[] r1 = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.AnonymousClass2.$$d
                    byte[] r0 = new byte[r0]
                    int r6 = 52 - r6
                    r2 = 0
                    if (r1 != 0) goto L18
                    r4 = r6
                    r3 = r2
                    goto L2a
                L18:
                    r3 = r2
                L19:
                    byte r4 = (byte) r7
                    r0[r3] = r4
                    if (r3 != r6) goto L26
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r0, r2)
                    r8[r2] = r5
                    return
                L26:
                    int r3 = r3 + 1
                    r4 = r1[r5]
                L2a:
                    int r4 = -r4
                    int r7 = r7 + r4
                    int r7 = r7 + (-8)
                    int r5 = r5 + 1
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.AnonymousClass2.d(int, short, int, java.lang.Object[]):void");
            }

            private static void c(int i3, int i4, short s, byte b2, int i5, Object[] objArr) throws Throwable {
                long j;
                boolean z;
                int i6 = 2 % 2;
                SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
                StringBuilder sb = new StringBuilder();
                try {
                    Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    char c = '0';
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Color.green(0), 2266 - TextUtils.lastIndexOf("", '0'), 33 - View.combineMeasuredStates(0, 0), 1387473586, false, $$g(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    boolean z2 = iIntValue == -1;
                    if (z2) {
                        int i7 = $10 + 49;
                        $11 = i7 % 128;
                        int i8 = i7 % 2;
                        byte[] bArr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        if (bArr != null) {
                            int length = bArr.length;
                            byte[] bArr2 = new byte[length];
                            int i9 = 0;
                            while (i9 < length) {
                                Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", c, 0) + 1);
                                    int trimmedLength = TextUtils.getTrimmedLength("") + 3358;
                                    int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 18;
                                    byte length2 = (byte) $$c.length;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, trimmedLength, windowTouchSlop, -1054011043, false, $$g((byte) 0, length2, (byte) (length2 - 5)), new Class[]{Integer.TYPE});
                                }
                                bArr2[i9] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                                i9++;
                                c = '0';
                            }
                            bArr = bArr2;
                        }
                        if (bArr != null) {
                            byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            Object[] objArr4 = {Integer.valueOf(i5), Integer.valueOf(b)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = b5;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) KeyEvent.keyCodeFromString(""), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2266, TextUtils.getCapsMode("", 0, 0) + 33, 1387473586, false, $$g(b5, b6, (byte) (b6 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)));
                            j = 3046761265686732006L;
                        } else {
                            j = 3046761265686732006L;
                            iIntValue = (short) (((short) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2[i5 + ((int) (((long) b) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)));
                        }
                    } else {
                        j = 3046761265686732006L;
                    }
                    if (iIntValue > 0) {
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i5 + iIntValue) - 2) + ((int) (((long) b) ^ j)) + (!z2 ? 0 : 1);
                        try {
                            Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), sb};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b7 = (byte) 0;
                                byte b8 = (byte) (b7 + 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.indexOf("", "") + 55904), Color.green(0) + 2855, 13 - (ViewConfiguration.getLongPressTimeout() >> 16), -1529949196, false, $$g(b7, b8, (byte) (-b8)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                            }
                            ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            if (bArr4 != null) {
                                int length3 = bArr4.length;
                                byte[] bArr5 = new byte[length3];
                                for (int i10 = 0; i10 < length3; i10++) {
                                    bArr5[i10] = (byte) (((long) bArr4[i10]) ^ 3046761265686732006L);
                                }
                                bArr4 = bArr5;
                            }
                            if (bArr4 != null) {
                                int i11 = $11 + 13;
                                $10 = i11 % 128;
                                int i12 = i11 % 2;
                                z = true;
                            } else {
                                z = false;
                            }
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                            while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                                if (z) {
                                    byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i13 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i13 - 1;
                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i13]) ^ 3046761265686732006L)) + s)) ^ b2));
                                } else {
                                    short[] sArr = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int i14 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i14 - 1;
                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i14]) ^ 3046761265686732006L)) + s)) ^ b2));
                                }
                                sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                            }
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    objArr[0] = sb.toString();
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getWidth() {
                int i3 = 2 % 2;
                int i4 = asInterface + 103;
                g = i4 % 128;
                int i5 = i4 % 2;
                int measuredWidth = ExtendedFloatingActionButton.this.getMeasuredWidth();
                int collapsedPadding = ExtendedFloatingActionButton.this.getCollapsedPadding();
                int iAccess$000 = (measuredWidth - (collapsedPadding * 2)) + ExtendedFloatingActionButton.access$000(ExtendedFloatingActionButton.this) + ExtendedFloatingActionButton.access$100(ExtendedFloatingActionButton.this);
                int i6 = asInterface + 113;
                g = i6 % 128;
                int i7 = i6 % 2;
                return iAccess$000;
            }

            /* JADX WARN: Code duplicated, block: B:22:0x0293  */
            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getHeight() throws Throwable {
                Object[] objArr;
                int i3 = 2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char doubleTapTimeout = (char) (31533 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                    int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 921;
                    int iIndexOf = 28 - TextUtils.indexOf("", "", 0);
                    byte[] bArr = $$a;
                    byte b2 = bArr[37];
                    Object[] objArr2 = new Object[1];
                    a(b2, bArr[80], b2, objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(doubleTapTimeout, tapTimeout, iIndexOf, -1048449946, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(TextUtils.getTrimmedLength("") + 1215872747, (ViewConfiguration.getFadingEdgeLength() >> 16) + 14, (short) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 16), (byte) Color.red(0), 242851472 - KeyEvent.keyCodeFromString(""), objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1215872751, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 6, (short) (Color.argb(0, 0, 0, 0) - 70), (byte) (ViewConfiguration.getPressedStateDuration() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 242851493, objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 31534);
                    int tapTimeout2 = 921 - (ViewConfiguration.getTapTimeout() >> 16);
                    int i4 = 29 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    byte[] bArr2 = $$a;
                    byte b3 = bArr2[80];
                    Object[] objArr5 = new Object[1];
                    a(b3, (byte) (b3 | 52), bArr2[37], objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, tapTimeout2, i4, -778300370, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cLastIndexOf = (char) (31532 - TextUtils.lastIndexOf("", '0'));
                        int longPressTimeout = 921 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 28;
                        byte b4 = $$a[80];
                        byte b5 = b4;
                        Object[] objArr6 = new Object[1];
                        a(b5, (byte) (b5 | 37), b4, objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, longPressTimeout, threadPriority, -1142834547, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i5 = ~iIdentityHashCode;
                    int i6 = ((((-1992129140) + (((~((-57411198) | i5)) | (~((-1716668447) | i5))) * (-867))) + ((((~((-57411198) | iIdentityHashCode)) | 37748764) | (~((-1716668447) | iIdentityHashCode))) * (-1734))) + (((~(iIdentityHashCode | (-1678919683))) | ((~(i5 | (-37748765))) | (~((-19662434) | iIdentityHashCode)))) * 867)) - 510063763;
                    int i7 = (i6 << 13) ^ i6;
                    int i8 = i7 ^ (i7 >>> 17);
                    ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
                } else {
                    Object[] objArr8 = new Object[1];
                    c((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1215872747, Color.rgb(0, 0, 0) + 16777234, (short) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 72), (byte) TextUtils.getOffsetAfter("", 0), 242851506 - TextUtils.indexOf((CharSequence) "", '0'), objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(1215872749 - Drawable.resolveOpacity(0, 0), 10 - (KeyEvent.getMaxKeyCode() >> 16), (short) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 39), (byte) TextUtils.getTrimmedLength(""), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 242851532, objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        if (applicationContext instanceof ContextWrapper) {
                            int i9 = g + 73;
                            asInterface = i9 % 128;
                            int i10 = i9 % 2;
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
                    c(View.MeasureSpec.makeMeasureSpec(0, 0) + 1215872756, 8 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (short) ((-32) - KeyEvent.keyCodeFromString("")), (byte) Color.argb(0, 0, 0, 0), 242851549 - TextUtils.getOffsetBefore("", 0), objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    c(1215872755 - Color.alpha(0), 9 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (short) (ExpandableListView.getPackedPositionType(0L) - 124), (byte) (ViewConfiguration.getDoubleTapTimeout() >> 16), AndroidCharacter.getMirror('0') + 40636, objArr11);
                    try {
                        Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -510063763};
                        byte[] bArr3 = $$d;
                        byte b6 = bArr3[72];
                        byte b7 = b6;
                        Object[] objArr13 = new Object[1];
                        d(b6, b7, b7, objArr13);
                        Class<?> cls4 = Class.forName((String) objArr13[0]);
                        byte b8 = bArr3[49];
                        byte b9 = b8;
                        Object[] objArr14 = new Object[1];
                        d(b8, b9, b9, objArr14);
                        Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char c = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 31532);
                            int iRed = 921 - Color.red(0);
                            int doubleTapTimeout2 = 28 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            byte b10 = $$a[80];
                            byte b11 = b10;
                            Object[] objArr16 = new Object[1];
                            a(b11, (byte) (b11 | 37), b10, objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, iRed, doubleTapTimeout2, -1142834547, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                        try {
                            Object[] objArr17 = new Object[1];
                            c(Color.blue(0) + 1215872747, (ViewConfiguration.getTouchSlop() >> 8) + 14, (short) (16 - ExpandableListView.getPackedPositionType(0L)), (byte) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 242851472 - Color.red(0), objArr17);
                            Class<?> cls5 = Class.forName((String) objArr17[0]);
                            Object[] objArr18 = new Object[1];
                            c(1215872750 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), View.combineMeasuredStates(0, 0) + 7, (short) (Color.alpha(0) - 70), (byte) ('0' - AndroidCharacter.getMirror('0')), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 242851493, objArr18);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char cArgb = (char) (Color.argb(0, 0, 0, 0) + 31533);
                                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 921;
                                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 29;
                                byte[] bArr4 = $$a;
                                byte b12 = bArr4[80];
                                Object[] objArr19 = new Object[1];
                                a(b12, (byte) (b12 | 52), bArr4[37], objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cArgb, edgeSlop, modifierMetaStateMask, -778300370, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char maximumFlingVelocity = (char) (31533 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                                int edgeSlop2 = (ViewConfiguration.getEdgeSlop() >> 16) + 921;
                                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0) + 29;
                                byte[] bArr5 = $$a;
                                byte b13 = bArr5[37];
                                byte b14 = b13;
                                byte b15 = bArr5[80];
                                byte b16 = b13;
                                Object[] objArr20 = new Object[1];
                                a(b14, b15, b16, objArr20);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maximumFlingVelocity, edgeSlop2, iIndexOf2, -1048449946, false, (String) objArr20[0], null);
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
                int i11 = ((int[]) objArr[1])[0];
                int i12 = ((int[]) objArr[3])[0];
                if (i12 == i11) {
                    int i13 = asInterface + 13;
                    g = i13 % 128;
                    int i14 = i13 % 2;
                    int i15 = ((int[]) objArr[0])[0];
                    Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                    int iMyPid = Process.myPid();
                    int i16 = ~iMyPid;
                    int i17 = i15 + (-934202310) + ((iMyPid | 880463444) * (-859)) + (((~(iMyPid | (-876773445))) | (~(880463444 | i16))) * 859) + (((~((-893616200) | i16)) | android.R.attr.name) * 859);
                    int i18 = (i17 << 13) ^ i17;
                    int i19 = i18 ^ (i18 >>> 17);
                    ((int[]) objArr21[0])[0] = i19 ^ (i19 << 5);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr[4];
                    if (strArr != null) {
                        int i20 = asInterface + 115;
                        int i21 = i20 % 128;
                        g = i21;
                        int i22 = i20 % 2;
                        int i23 = i21 + 111;
                        asInterface = i23 % 128;
                        int i24 = i23 % 2;
                        for (String str : strArr) {
                            arrayList.add(str);
                        }
                    }
                    int[] iArr = new int[i12];
                    int i25 = i12 - 1;
                    iArr[i25] = 1;
                    Toast.makeText((Context) null, iArr[((i12 * i25) % 2) - 1], 1).show();
                    int i26 = ((int[]) objArr[0])[0];
                    Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                    int iNextInt = new Random().nextInt(446106933);
                    int i27 = ~iNextInt;
                    int i28 = i26 + (-120588619) + (((~((-1158084834) | i27)) | (~((-615994811) | iNextInt))) * 210) + (((~(iNextInt | (-1090562114))) | (~(i27 | (-548472091)))) * 210);
                    int i29 = (i28 << 13) ^ i28;
                    int i30 = i29 ^ (i29 >>> 17);
                    ((int[]) objArr22[0])[0] = i30 ^ (i30 << 5);
                }
                return ExtendedFloatingActionButton.this.getMeasuredHeight();
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getPaddingStart() {
                int i3 = 2 % 2;
                int i4 = asInterface + 113;
                g = i4 % 128;
                int i5 = i4 % 2;
                int iAccess$000 = ExtendedFloatingActionButton.access$000(ExtendedFloatingActionButton.this);
                int i6 = g + 119;
                asInterface = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 62 / 0;
                }
                return iAccess$000;
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getPaddingEnd() {
                int i3 = 2 % 2;
                int i4 = g + 81;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                int iAccess$100 = ExtendedFloatingActionButton.access$100(ExtendedFloatingActionButton.this);
                int i6 = asInterface + 47;
                g = i6 % 128;
                if (i6 % 2 != 0) {
                    return iAccess$100;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public ViewGroup.LayoutParams getLayoutParams() {
                int i3 = 2 % 2;
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
                int i4 = g + 97;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                return layoutParams;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0022  */
            /* JADX WARN: Code duplicated, block: B:8:0x001c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0029). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(int r6, int r7, int r8) {
                /*
                    int r6 = r6 * 4
                    int r0 = 1 - r6
                    int r8 = r8 + 4
                    int r7 = r7 + 117
                    byte[] r1 = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.AnonymousClass2.$$c
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    int r6 = 0 - r6
                    if (r1 != 0) goto L14
                    r3 = r8
                    r4 = r2
                    goto L29
                L14:
                    r3 = r2
                L15:
                    byte r4 = (byte) r7
                    r0[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r6) goto L22
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    return r6
                L22:
                    int r8 = r8 + 1
                    r3 = r1[r8]
                    r5 = r3
                    r3 = r8
                    r8 = r5
                L29:
                    int r8 = -r8
                    int r7 = r7 + r8
                    r8 = r3
                    r3 = r4
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.AnonymousClass2.$$g(int, int, int):java.lang.String");
            }
        };
        final Size size2 = new Size() { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.3
            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getWidth() {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                if (!(ExtendedFloatingActionButton.this.getParent() instanceof View)) {
                    return size.getWidth();
                }
                View view = (View) ExtendedFloatingActionButton.this.getParent();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null && layoutParams.width == -2) {
                    return size.getWidth();
                }
                return (view.getWidth() - ((!(ExtendedFloatingActionButton.this.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) ExtendedFloatingActionButton.this.getLayoutParams()) == null) ? 0 : marginLayoutParams.leftMargin + marginLayoutParams.rightMargin)) - (view.getPaddingLeft() + view.getPaddingRight());
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getHeight() {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                if (ExtendedFloatingActionButton.access$200(ExtendedFloatingActionButton.this) == -1) {
                    if (!(ExtendedFloatingActionButton.this.getParent() instanceof View)) {
                        return size.getHeight();
                    }
                    View view = (View) ExtendedFloatingActionButton.this.getParent();
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null && layoutParams.height == -2) {
                        return size.getHeight();
                    }
                    return (view.getHeight() - ((!(ExtendedFloatingActionButton.this.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) ExtendedFloatingActionButton.this.getLayoutParams()) == null) ? 0 : marginLayoutParams.topMargin + marginLayoutParams.bottomMargin)) - (view.getPaddingTop() + view.getPaddingBottom());
                }
                if (ExtendedFloatingActionButton.access$200(ExtendedFloatingActionButton.this) == 0 || ExtendedFloatingActionButton.access$200(ExtendedFloatingActionButton.this) == -2) {
                    return size.getHeight();
                }
                return ExtendedFloatingActionButton.access$200(ExtendedFloatingActionButton.this);
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getPaddingStart() {
                return ExtendedFloatingActionButton.access$000(ExtendedFloatingActionButton.this);
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getPaddingEnd() {
                return ExtendedFloatingActionButton.access$100(ExtendedFloatingActionButton.this);
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public ViewGroup.LayoutParams getLayoutParams() {
                return new ViewGroup.LayoutParams(-1, ExtendedFloatingActionButton.access$200(ExtendedFloatingActionButton.this) == 0 ? -2 : ExtendedFloatingActionButton.access$200(ExtendedFloatingActionButton.this));
            }
        };
        Size size3 = new Size() { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.4
            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getWidth() {
                if (ExtendedFloatingActionButton.access$300(ExtendedFloatingActionButton.this) == -1) {
                    return size2.getWidth();
                }
                if (ExtendedFloatingActionButton.access$300(ExtendedFloatingActionButton.this) == 0 || ExtendedFloatingActionButton.access$300(ExtendedFloatingActionButton.this) == -2) {
                    return size.getWidth();
                }
                return ExtendedFloatingActionButton.access$300(ExtendedFloatingActionButton.this);
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getHeight() {
                if (ExtendedFloatingActionButton.access$200(ExtendedFloatingActionButton.this) == -1) {
                    return size2.getHeight();
                }
                if (ExtendedFloatingActionButton.access$200(ExtendedFloatingActionButton.this) == 0 || ExtendedFloatingActionButton.access$200(ExtendedFloatingActionButton.this) == -2) {
                    return size.getHeight();
                }
                return ExtendedFloatingActionButton.access$200(ExtendedFloatingActionButton.this);
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getPaddingStart() {
                return ExtendedFloatingActionButton.access$000(ExtendedFloatingActionButton.this);
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getPaddingEnd() {
                return ExtendedFloatingActionButton.access$100(ExtendedFloatingActionButton.this);
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public ViewGroup.LayoutParams getLayoutParams() {
                return new ViewGroup.LayoutParams(ExtendedFloatingActionButton.access$300(ExtendedFloatingActionButton.this) == 0 ? -2 : ExtendedFloatingActionButton.access$300(ExtendedFloatingActionButton.this), ExtendedFloatingActionButton.access$200(ExtendedFloatingActionButton.this) != 0 ? ExtendedFloatingActionButton.access$200(ExtendedFloatingActionButton.this) : -2);
            }
        };
        if (i == 1) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            return size;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
        int i6 = i5 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6;
        int i7 = i5 % 2;
        if (i == 2) {
            int i8 = i6 + 23;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
            int i9 = i8 % 2;
            return size2;
        }
        int i10 = i6 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i10 % 128;
        if (i10 % 2 != 0) {
            return size3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            super.setTextColor(i);
            saveOriginalTextCsl();
        } else {
            super.setTextColor(i);
            saveOriginalTextCsl();
            int i4 = 13 / 0;
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            super.setTextColor(colorStateList);
            saveOriginalTextCsl();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        super.setTextColor(colorStateList);
        saveOriginalTextCsl();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
    }

    private void saveOriginalTextCsl() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        this.originalTextCsl = getTextColors();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
    }

    protected void silentlyUpdateTextColor(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        super.setTextColor(colorStateList);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        int i = 2 % 2;
        super.onAttachedToWindow();
        Object obj = null;
        if (this.isExtended) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 != 0) {
                TextUtils.isEmpty(getText());
                obj.hashCode();
                throw null;
            }
            if (!(!TextUtils.isEmpty(getText())) && getIcon() != null) {
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
                if (i3 % 2 != 0) {
                    this.isExtended = false;
                } else {
                    this.isExtended = false;
                }
                this.shrinkStrategy.performNow();
            }
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    public CoordinatorLayout.Behavior<ExtendedFloatingActionButton> getBehavior() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        CoordinatorLayout.Behavior<ExtendedFloatingActionButton> behavior = this.behavior;
        int i5 = i2 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return behavior;
    }

    public void setExtended(boolean z) {
        MotionStrategy motionStrategy;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        if (i2 % 2 == 0) {
            int i4 = 66 / 0;
            if (this.isExtended == z) {
                return;
            }
        } else if (this.isExtended == z) {
            return;
        }
        if (z) {
            motionStrategy = this.extendStrategy;
        } else {
            motionStrategy = this.shrinkStrategy;
            int i5 = i3 + 57;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
        }
        if (motionStrategy.shouldCancel()) {
            return;
        }
        motionStrategy.performNow();
    }

    public final boolean isExtended() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.isExtended;
        int i5 = i2 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        this.animateShowBeforeLayout = z;
        if (i4 != 0) {
            int i5 = 2 / 0;
        }
        int i6 = i2 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
        if (i6 % 2 == 0) {
            super.setPaddingRelative(i, i2, i3, i4);
            int i7 = 96 / 0;
            if (!this.isExtended) {
                return;
            }
        } else {
            super.setPaddingRelative(i, i2, i3, i4);
            if (!this.isExtended) {
                return;
            }
        }
        int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
        if (this.isTransforming) {
            return;
        }
        this.extendedPaddingStart = i;
        this.extendedPaddingEnd = i3;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        super.setPadding(i, i2, i3, i4);
        if (this.isExtended && !this.isTransforming) {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            if (i6 % 2 != 0) {
                this.extendedPaddingStart = ViewCompat.getPaddingStart(this);
                this.extendedPaddingEnd = ViewCompat.getPaddingEnd(this);
                throw null;
            }
            this.extendedPaddingStart = ViewCompat.getPaddingStart(this);
            this.extendedPaddingEnd = ViewCompat.getPaddingEnd(this);
        }
        int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
        int i8 = i7 % 2;
    }

    public void addOnShowAnimationListener(Animator.AnimatorListener animatorListener) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        this.showStrategy.addAnimationListener(animatorListener);
        if (i3 != 0) {
            throw null;
        }
    }

    public void removeOnShowAnimationListener(Animator.AnimatorListener animatorListener) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            this.showStrategy.removeAnimationListener(animatorListener);
            throw null;
        }
        this.showStrategy.removeAnimationListener(animatorListener);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 70 / 0;
        }
    }

    public void addOnHideAnimationListener(Animator.AnimatorListener animatorListener) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        this.hideStrategy.addAnimationListener(animatorListener);
        if (i3 != 0) {
            int i4 = 85 / 0;
        }
    }

    public void removeOnHideAnimationListener(Animator.AnimatorListener animatorListener) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        this.hideStrategy.removeAnimationListener(animatorListener);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public void addOnShrinkAnimationListener(Animator.AnimatorListener animatorListener) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            this.shrinkStrategy.addAnimationListener(animatorListener);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.shrinkStrategy.addAnimationListener(animatorListener);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
    }

    public void removeOnShrinkAnimationListener(Animator.AnimatorListener animatorListener) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.shrinkStrategy.removeAnimationListener(animatorListener);
            obj.hashCode();
            throw null;
        }
        this.shrinkStrategy.removeAnimationListener(animatorListener);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public void addOnExtendAnimationListener(Animator.AnimatorListener animatorListener) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        this.extendStrategy.addAnimationListener(animatorListener);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void removeOnExtendAnimationListener(Animator.AnimatorListener animatorListener) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        this.extendStrategy.removeAnimationListener(animatorListener);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void hide() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        performMotion(1, null);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
    }

    public void hide(OnChangedCallback onChangedCallback) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        performMotion(i2 % 2 != 0 ? 0 : 1, onChangedCallback);
    }

    public void show() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        performMotion(0, null);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    public void show(OnChangedCallback onChangedCallback) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        performMotion(0, onChangedCallback);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
    }

    public void extend() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        performMotion(3, null);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void extend(OnChangedCallback onChangedCallback) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        performMotion(3, onChangedCallback);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    public void shrink() throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
            int doubleTapTimeout = 876 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 10;
            int i4 = $$e;
            Object[] objArr3 = new Object[1];
            f((byte) (i4 & 5), $$d[8], (byte) (i4 & 5), objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(tapTimeout, doubleTapTimeout, touchSlop, -1199417970, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        h(new byte[]{0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, new int[]{0, 22, 143, 0}, false, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        h(new byte[]{1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, new int[]{22, 15, 0, 0}, true, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
            int threadPriority = 876 - ((Process.getThreadPriority(0) + 20) >> 6);
            int iAxisFromString = 9 - MotionEvent.axisFromString("");
            byte b2 = $$d[11];
            byte b3 = b2;
            Object[] objArr6 = new Object[1];
            f(b2, b3, b3, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(jumpTapTimeout, threadPriority, iAxisFromString, 254769921, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                int edgeSlop = 876 - (ViewConfiguration.getEdgeSlop() >> 16);
                int deadChar = 10 - KeyEvent.getDeadChar(0, 0);
                byte[] bArr = $$d;
                byte b4 = bArr[11];
                byte b5 = bArr[10];
                Object[] objArr7 = new Object[1];
                f(b4, b5, (byte) (b5 >>> 2), objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMakeMeasureSpec, edgeSlop, deadChar, 1324201839, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
            int iNextInt = new Random().nextInt();
            int i5 = ~iNextInt;
            int i6 = (((581462612 + (((~((-795351838) | i5)) | 558370832) * 184)) + ((iNextInt | (-1072643072)) * (-184))) + ((~((-835662067) | i5)) * 184)) - 422040498;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[1])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            h(new byte[]{0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0}, new int[]{37, 16, 10, 0}, false, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            h(new byte[]{1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1}, new int[]{53, 16, 156, 0}, true, objArr10);
            try {
                Object[] objArr11 = {Integer.valueOf(((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue()), -422040498};
                byte[] bArr2 = $$j;
                byte b6 = bArr2[5];
                Object[] objArr12 = new Object[1];
                i(b6, b6, bArr2[66], objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                byte b7 = bArr2[16];
                Object[] objArr13 = new Object[1];
                i(b7, b7, (byte) (bArr2[25] - 1), objArr13);
                Object[] objArr14 = (Object[]) cls3.getMethod((String) objArr13[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                    int iBlue = Color.blue(0) + 876;
                    int iMyTid = 10 - (Process.myTid() >> 22);
                    byte[] bArr3 = $$d;
                    byte b8 = bArr3[11];
                    byte b9 = bArr3[10];
                    Object[] objArr15 = new Object[1];
                    f(b8, b9, (byte) (b9 >>> 2), objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(pressedStateDuration, iBlue, iMyTid, 1324201839, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr14);
                try {
                    Object[] objArr16 = new Object[1];
                    h(new byte[]{0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, new int[]{0, 22, 143, 0}, false, objArr16);
                    Class<?> cls4 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    h(new byte[]{1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, new int[]{22, 15, 0, 0}, true, objArr17);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0));
                        int i9 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 876;
                        int iLastIndexOf = 9 - TextUtils.lastIndexOf("", '0');
                        byte b10 = $$d[11];
                        byte b11 = b10;
                        Object[] objArr18 = new Object[1];
                        f(b10, b11, b11, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cLastIndexOf, i9, iLastIndexOf, 254769921, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                        int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 876;
                        int iLastIndexOf2 = 9 - TextUtils.lastIndexOf("", '0', 0);
                        int i10 = $$e;
                        Object[] objArr19 = new Object[1];
                        f((byte) (i10 & 5), $$d[8], (byte) (i10 & 5), objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, threadPriority2, iLastIndexOf2, -1199417970, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr14;
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
        int i11 = ((int[]) objArr[2])[0];
        int i12 = ((int[]) objArr[0])[0];
        if (i12 == i11) {
            int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 117;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 % 128;
            int i14 = i13 % 2;
            int i15 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i16 = i15 + (-549971510) + (((~(iElapsedRealtime | 91943095)) | 33622592) * 305) + (((~((~iElapsedRealtime) | 91943095)) | 51632866) * 305);
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr2[1])[0] = i18 ^ (i18 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr != null) {
                int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 43;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i19 % 128;
                int i20 = i19 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i12 / (((i12 - 1) * i12) % 2), 0).show();
            int i21 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int i22 = ~(System.identityHashCode(this) | (-718788547));
            int i23 = i21 + (((-805306328) | i22) * (-196)) + 1336444000 + ((i22 | 86517781) * 196);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr2[1])[0] = i25 ^ (i25 << 5);
        }
        int i26 = ((int[]) objArr2[1])[0];
        int i27 = i26 * i26;
        int i28 = -(1482387571 * i26);
        int i29 = (i27 ^ i28) + ((i27 & i28) << 1);
        int i30 = -(i26 * (-1971144037));
        int i31 = (i29 & i30) + (i30 | i29);
        int i32 = ((i31 | (-622760655)) << 1) - ((-622760655) ^ i31);
        int i33 = i32 >> 22;
        int i34 = ((i33 ^ (-2047)) + ((i33 & (-2047)) << 1)) / 1024;
        int i35 = (i32 - (~((i34 & 1) + (i34 | 1)))) - 1;
        int i36 = i32 >> 24;
        int i37 = ((i36 ^ (-511)) + ((i36 & (-511)) << 1)) / 256;
        int i38 = (-(i35 ^ ((i37 ^ 1) + ((i37 & 1) << 1)))) + 3;
        int i39 = i38 >> 15;
        int i40 = (((-262143) & i39) + (i39 | (-262143))) / 131072;
        int i41 = (i40 ^ 1) + ((i40 & 1) << 1);
        performMotion(8712 / ((i38 & (-((i41 & 1) + (i41 | 1)))) * 1452), null);
    }

    public void shrink(OnChangedCallback onChangedCallback) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        performMotion(2, onChangedCallback);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    public MotionSpec getShowMotionSpec() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        MotionSpec motionSpec = this.showStrategy.getMotionSpec();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return motionSpec;
    }

    public void setShowMotionSpec(MotionSpec motionSpec) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        this.showStrategy.setMotionSpec(motionSpec);
        if (i3 != 0) {
            int i4 = 32 / 0;
        }
    }

    public void setShowMotionSpecResource(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        setShowMotionSpec(MotionSpec.createFromResource(getContext(), i));
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public MotionSpec getHideMotionSpec() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        MotionSpec motionSpec = this.hideStrategy.getMotionSpec();
        if (i3 != 0) {
            int i4 = 87 / 0;
        }
        return motionSpec;
    }

    public void setHideMotionSpec(MotionSpec motionSpec) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            this.hideStrategy.setMotionSpec(motionSpec);
            throw null;
        }
        this.hideStrategy.setMotionSpec(motionSpec);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
    }

    public void setHideMotionSpecResource(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            setHideMotionSpec(MotionSpec.createFromResource(getContext(), i));
            obj.hashCode();
            throw null;
        }
        setHideMotionSpec(MotionSpec.createFromResource(getContext(), i));
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public MotionSpec getExtendMotionSpec() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        MotionStrategy motionStrategy = this.extendStrategy;
        if (i3 != 0) {
            return motionStrategy.getMotionSpec();
        }
        motionStrategy.getMotionSpec();
        throw null;
    }

    public void setExtendMotionSpec(MotionSpec motionSpec) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        this.extendStrategy.setMotionSpec(motionSpec);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setExtendMotionSpecResource(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        MotionSpec motionSpecCreateFromResource = MotionSpec.createFromResource(getContext(), i);
        if (i4 == 0) {
            setExtendMotionSpec(motionSpecCreateFromResource);
            return;
        }
        setExtendMotionSpec(motionSpecCreateFromResource);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public MotionSpec getShrinkMotionSpec() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        MotionSpec motionSpec = this.shrinkStrategy.getMotionSpec();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return motionSpec;
    }

    public void setShrinkMotionSpec(MotionSpec motionSpec) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            this.shrinkStrategy.setMotionSpec(motionSpec);
            throw null;
        }
        this.shrinkStrategy.setMotionSpec(motionSpec);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 66 / 0;
        }
    }

    public void setShrinkMotionSpecResource(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            setShrinkMotionSpec(MotionSpec.createFromResource(getContext(), i));
            obj.hashCode();
            throw null;
        }
        setShrinkMotionSpec(MotionSpec.createFromResource(getContext(), i));
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.Behavior<T> {
        private static final boolean AUTO_HIDE_DEFAULT = false;
        private static final boolean AUTO_SHRINK_DEFAULT = true;
        private boolean autoHideEnabled;
        private boolean autoShrinkEnabled;
        private OnChangedCallback internalAutoHideCallback;
        private OnChangedCallback internalAutoShrinkCallback;
        private Rect tmpRect;

        public ExtendedFloatingActionButtonBehavior() {
            this.autoHideEnabled = false;
            this.autoShrinkEnabled = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ExtendedFloatingActionButton_Behavior_Layout);
            this.autoHideEnabled = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.autoShrinkEnabled = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        public void setAutoHideEnabled(boolean z) {
            this.autoHideEnabled = z;
        }

        public boolean isAutoHideEnabled() {
            return this.autoHideEnabled;
        }

        public void setAutoShrinkEnabled(boolean z) {
            this.autoShrinkEnabled = z;
        }

        public boolean isAutoShrinkEnabled() {
            return this.autoShrinkEnabled;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.getInsetDodgeRect(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onAttachedToLayoutParams(CoordinatorLayout.LayoutParams layoutParams) {
            if (layoutParams.dodgeInsetEdges == 0) {
                layoutParams.dodgeInsetEdges = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                updateFabVisibilityForAppBarLayout(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            }
            if (!isBottomSheet(view)) {
                return false;
            }
            updateFabVisibilityForBottomSheet(view, extendedFloatingActionButton);
            return false;
        }

        private static boolean isBottomSheet(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                return ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof BottomSheetBehavior;
            }
            return false;
        }

        void setInternalAutoHideCallback(OnChangedCallback onChangedCallback) {
            this.internalAutoHideCallback = onChangedCallback;
        }

        void setInternalAutoShrinkCallback(OnChangedCallback onChangedCallback) {
            this.internalAutoShrinkCallback = onChangedCallback;
        }

        private boolean shouldUpdateVisibility(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.autoHideEnabled || this.autoShrinkEnabled) && ((CoordinatorLayout.LayoutParams) extendedFloatingActionButton.getLayoutParams()).getAnchorId() == view.getId();
        }

        private boolean updateFabVisibilityForAppBarLayout(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!shouldUpdateVisibility(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.tmpRect == null) {
                this.tmpRect = new Rect();
            }
            Rect rect = this.tmpRect;
            DescendantOffsetUtils.getDescendantRect(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                shrinkOrHide(extendedFloatingActionButton);
                return true;
            }
            extendOrShow(extendedFloatingActionButton);
            return true;
        }

        private boolean updateFabVisibilityForBottomSheet(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!shouldUpdateVisibility(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                shrinkOrHide(extendedFloatingActionButton);
                return true;
            }
            extendOrShow(extendedFloatingActionButton);
            return true;
        }

        protected void shrinkOrHide(ExtendedFloatingActionButton extendedFloatingActionButton) {
            OnChangedCallback onChangedCallback;
            boolean z = this.autoShrinkEnabled;
            if (z) {
                onChangedCallback = this.internalAutoShrinkCallback;
            } else {
                onChangedCallback = this.internalAutoHideCallback;
            }
            ExtendedFloatingActionButton.access$400(extendedFloatingActionButton, z ? 2 : 1, onChangedCallback);
        }

        protected void extendOrShow(ExtendedFloatingActionButton extendedFloatingActionButton) {
            OnChangedCallback onChangedCallback;
            boolean z = this.autoShrinkEnabled;
            if (z) {
                onChangedCallback = this.internalAutoShrinkCallback;
            } else {
                onChangedCallback = this.internalAutoHideCallback;
            }
            ExtendedFloatingActionButton.access$400(extendedFloatingActionButton, z ? 3 : 0, onChangedCallback);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            List<View> dependencies = coordinatorLayout.getDependencies(extendedFloatingActionButton);
            int size = dependencies.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = dependencies.get(i2);
                if (view instanceof AppBarLayout) {
                    if (updateFabVisibilityForAppBarLayout(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (isBottomSheet(view) && updateFabVisibilityForBottomSheet(view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.onLayoutChild(extendedFloatingActionButton, i);
            return true;
        }
    }

    private void performMotion(int i, final OnChangedCallback onChangedCallback) {
        final MotionStrategy motionStrategy;
        int i2 = 2 % 2;
        if (i == 0) {
            motionStrategy = this.showStrategy;
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
        } else if (i != 1) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i6 = i5 + 103;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
            if (i6 % 2 != 0 ? i == 2 : i == 5) {
                motionStrategy = this.shrinkStrategy;
            } else {
                if (i != 3) {
                    throw new IllegalStateException("Unknown strategy type: ".concat(String.valueOf(i)));
                }
                int i7 = i5 + 93;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
                if (i7 % 2 == 0) {
                    motionStrategy = this.extendStrategy;
                    int i8 = 49 / 0;
                } else {
                    motionStrategy = this.extendStrategy;
                }
            }
        } else {
            motionStrategy = this.hideStrategy;
        }
        if (motionStrategy.shouldCancel()) {
            return;
        }
        Object obj = null;
        if (!shouldAnimateVisibilityChange()) {
            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
            if (i9 % 2 != 0) {
                motionStrategy.performNow();
                motionStrategy.onChange(onChangedCallback);
                return;
            } else {
                motionStrategy.performNow();
                motionStrategy.onChange(onChangedCallback);
                throw null;
            }
        }
        if (i == 2) {
            int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i10 % 128;
            if (i10 % 2 == 0) {
                getLayoutParams();
                obj.hashCode();
                throw null;
            }
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                this.originalWidth = layoutParams.width;
                this.originalHeight = layoutParams.height;
            } else {
                this.originalWidth = getWidth();
                this.originalHeight = getHeight();
            }
        }
        measure(0, 0);
        AnimatorSet animatorSetCreateAnimator = motionStrategy.createAnimator();
        animatorSetCreateAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.5
            private boolean cancelled;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                motionStrategy.onAnimationStart(animator);
                this.cancelled = false;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                this.cancelled = true;
                motionStrategy.onAnimationCancel();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                motionStrategy.onAnimationEnd();
                if (this.cancelled) {
                    return;
                }
                motionStrategy.onChange(onChangedCallback);
            }
        });
        Iterator<Animator.AnimatorListener> it = motionStrategy.getListeners().iterator();
        while (it.hasNext()) {
            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
            if (i11 % 2 == 0) {
                animatorSetCreateAnimator.addListener(it.next());
                obj.hashCode();
                throw null;
            }
            animatorSetCreateAnimator.addListener(it.next());
        }
        animatorSetCreateAnimator.start();
    }

    private boolean isOrWillBeShown() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            getVisibility();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (getVisibility() == 0) {
            if (this.animState == 1) {
                return false;
            }
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i6 = i5 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        int i7 = i6 % 2;
        if (this.animState != 2) {
            return false;
        }
        int i8 = i5 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    private boolean isOrWillBeHidden() {
        int i = 2 % 2;
        if (getVisibility() != 0) {
            return this.animState != 2;
        }
        if (this.animState == 1) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            return i2 % 2 == 0;
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    private boolean shouldAnimateVisibilityChange() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            ViewCompat.isLaidOut(this);
            obj.hashCode();
            throw null;
        }
        if (!ViewCompat.isLaidOut(this)) {
            if (isOrWillBeShown()) {
                return false;
            }
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            if (i3 % 2 != 0) {
                if (!this.animateShowBeforeLayout) {
                    return false;
                }
            } else {
                obj.hashCode();
                throw null;
            }
        }
        return !isInEditMode();
    }

    int getCollapsedSize() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        int iMin = this.collapsedSize;
        if (iMin < 0) {
            int i5 = i3 + 5;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            int paddingStart = ViewCompat.getPaddingStart(this);
            iMin = i6 != 0 ? (Math.min(paddingStart, ViewCompat.getPaddingEnd(this)) % 4) * getIconSize() : (Math.min(paddingStart, ViewCompat.getPaddingEnd(this)) * 2) + getIconSize();
        }
        int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
        int i8 = i7 % 2;
        return iMin;
    }

    int getCollapsedPadding() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int collapsedSize = i2 % 2 != 0 ? (getCollapsedSize() << getIconSize()) << 3 : (getCollapsedSize() - getIconSize()) / 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            return collapsedSize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        b = new char[]{59763, 59901, 59891, 59889, 59892, 59888, 59902, 59859, 59862, 59403, 59860, 59844, 59902, 59406, 59401, 59888, 59891, 59884, 59885, 59895, 59891, 59901, 59705, 59746, 59744, 59749, 59771, 59757, 59752, 59728, 59728, 59759, 59751, 59770, 59747, 59757, 59747, 59697, 59748, 59774, 59774, 59738, 59740, 59771, 59770, 59775, 59743, 59713, 59771, 59787, 59766, 59773, 59768, 59787, 59403, 59406, 59902, 59898, 59394, 59405, 59899, 59895, 59417, 59393, 59393, 59398, 59406, 59403, 59401};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$n(short r7, int r8, short r9) {
        /*
            byte[] r0 = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.$$l
            int r9 = r9 + 99
            int r8 = r8 * 4
            int r8 = r8 + 4
            int r7 = r7 * 2
            int r7 = 1 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r4 = r2
            r9 = r8
            goto L29
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L29:
            int r8 = r8 + r3
            int r9 = r9 + 1
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.$$n(short, int, short):java.lang.String");
    }

    class ChangeSizeStrategy extends BaseMotionStrategy {
        private final boolean extending;
        private final Size size;

        ChangeSizeStrategy(AnimatorTracker animatorTracker, Size size, boolean z) {
            super(ExtendedFloatingActionButton.this, animatorTracker);
            this.size = size;
            this.extending = z;
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void performNow() {
            ExtendedFloatingActionButton.access$502(ExtendedFloatingActionButton.this, this.extending);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            if (!this.extending) {
                ExtendedFloatingActionButton.access$302(ExtendedFloatingActionButton.this, layoutParams.width);
                ExtendedFloatingActionButton.access$202(ExtendedFloatingActionButton.this, layoutParams.height);
            }
            layoutParams.width = this.size.getLayoutParams().width;
            layoutParams.height = this.size.getLayoutParams().height;
            ViewCompat.setPaddingRelative(ExtendedFloatingActionButton.this, this.size.getPaddingStart(), ExtendedFloatingActionButton.this.getPaddingTop(), this.size.getPaddingEnd(), ExtendedFloatingActionButton.this.getPaddingBottom());
            ExtendedFloatingActionButton.this.requestLayout();
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void onChange(OnChangedCallback onChangedCallback) {
            if (onChangedCallback == null) {
                return;
            }
            if (this.extending) {
                onChangedCallback.onExtended(ExtendedFloatingActionButton.this);
            } else {
                onChangedCallback.onShrunken(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public int getDefaultMotionSpecResource() {
            if (this.extending) {
                return R.animator.mtrl_extended_fab_change_size_expand_motion_spec;
            }
            return R.animator.mtrl_extended_fab_change_size_collapse_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public AnimatorSet createAnimator() {
            MotionSpec currentMotionSpec = getCurrentMotionSpec();
            if (currentMotionSpec.hasPropertyValues("width")) {
                PropertyValuesHolder[] propertyValues = currentMotionSpec.getPropertyValues("width");
                propertyValues[0].setFloatValues(ExtendedFloatingActionButton.this.getWidth(), this.size.getWidth());
                currentMotionSpec.setPropertyValues("width", propertyValues);
            }
            if (currentMotionSpec.hasPropertyValues("height")) {
                PropertyValuesHolder[] propertyValues2 = currentMotionSpec.getPropertyValues("height");
                propertyValues2[0].setFloatValues(ExtendedFloatingActionButton.this.getHeight(), this.size.getHeight());
                currentMotionSpec.setPropertyValues("height", propertyValues2);
            }
            if (currentMotionSpec.hasPropertyValues("paddingStart")) {
                PropertyValuesHolder[] propertyValues3 = currentMotionSpec.getPropertyValues("paddingStart");
                propertyValues3[0].setFloatValues(ViewCompat.getPaddingStart(ExtendedFloatingActionButton.this), this.size.getPaddingStart());
                currentMotionSpec.setPropertyValues("paddingStart", propertyValues3);
            }
            if (currentMotionSpec.hasPropertyValues("paddingEnd")) {
                PropertyValuesHolder[] propertyValues4 = currentMotionSpec.getPropertyValues("paddingEnd");
                propertyValues4[0].setFloatValues(ViewCompat.getPaddingEnd(ExtendedFloatingActionButton.this), this.size.getPaddingEnd());
                currentMotionSpec.setPropertyValues("paddingEnd", propertyValues4);
            }
            if (currentMotionSpec.hasPropertyValues("labelOpacity")) {
                PropertyValuesHolder[] propertyValues5 = currentMotionSpec.getPropertyValues("labelOpacity");
                boolean z = this.extending;
                propertyValues5[0].setFloatValues(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
                currentMotionSpec.setPropertyValues("labelOpacity", propertyValues5);
            }
            return super.createAnimator(currentMotionSpec);
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.access$502(ExtendedFloatingActionButton.this, this.extending);
            ExtendedFloatingActionButton.access$602(ExtendedFloatingActionButton.this, true);
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(true);
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationEnd() {
            super.onAnimationEnd();
            ExtendedFloatingActionButton.access$602(ExtendedFloatingActionButton.this, false);
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.size.getLayoutParams().width;
            layoutParams.height = this.size.getLayoutParams().height;
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public boolean shouldCancel() {
            return this.extending == ExtendedFloatingActionButton.access$500(ExtendedFloatingActionButton.this) || ExtendedFloatingActionButton.this.getIcon() == null || TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText());
        }
    }

    class ShowStrategy extends BaseMotionStrategy {
        public ShowStrategy(AnimatorTracker animatorTracker) {
            super(ExtendedFloatingActionButton.this, animatorTracker);
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void performNow() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void onChange(OnChangedCallback onChangedCallback) {
            if (onChangedCallback != null) {
                onChangedCallback.onShown(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public int getDefaultMotionSpecResource() {
            return R.animator.mtrl_extended_fab_show_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.access$702(ExtendedFloatingActionButton.this, 2);
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationEnd() {
            super.onAnimationEnd();
            ExtendedFloatingActionButton.access$702(ExtendedFloatingActionButton.this, 0);
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public boolean shouldCancel() {
            return ExtendedFloatingActionButton.access$800(ExtendedFloatingActionButton.this);
        }
    }

    class HideStrategy extends BaseMotionStrategy {
        private boolean isCancelled;

        public HideStrategy(AnimatorTracker animatorTracker) {
            super(ExtendedFloatingActionButton.this, animatorTracker);
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void performNow() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void onChange(OnChangedCallback onChangedCallback) {
            if (onChangedCallback != null) {
                onChangedCallback.onHidden(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public boolean shouldCancel() {
            return ExtendedFloatingActionButton.access$900(ExtendedFloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public int getDefaultMotionSpecResource() {
            return R.animator.mtrl_extended_fab_hide_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.isCancelled = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.access$702(ExtendedFloatingActionButton.this, 1);
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationCancel() {
            super.onAnimationCancel();
            this.isCancelled = true;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationEnd() {
            super.onAnimationEnd();
            ExtendedFloatingActionButton.access$702(ExtendedFloatingActionButton.this, 0);
            if (this.isCancelled) {
                return;
            }
            ExtendedFloatingActionButton.this.setVisibility(8);
        }
    }
}
