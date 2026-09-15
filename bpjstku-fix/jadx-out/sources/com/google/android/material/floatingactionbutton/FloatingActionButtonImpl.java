package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Property;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import android.widget.ExpandableListView;
import androidx.compose.runtime.ComposerKt;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.work.WorkInfo;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.animation.ImageMatrixProperty;
import com.google.android.material.animation.MatrixEvaluator;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.internal.StateListAnimator;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.ripple.RippleDrawableCompat;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shadow.ShadowViewDelegate;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import defpackage.onBackCompletedFallback;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class FloatingActionButtonImpl {
    static final int ANIM_STATE_HIDING = 1;
    static final int ANIM_STATE_NONE = 0;
    static final int ANIM_STATE_SHOWING = 2;
    static final long ELEVATION_ANIM_DELAY = 100;
    static final long ELEVATION_ANIM_DURATION = 100;
    private static final float HIDE_ICON_SCALE = 0.4f;
    private static final float HIDE_OPACITY = 0.0f;
    private static final float HIDE_SCALE = 0.4f;
    static final float SHADOW_MULTIPLIER = 1.5f;
    private static final float SHOW_ICON_SCALE = 1.0f;
    private static final float SHOW_OPACITY = 1.0f;
    private static final float SHOW_SCALE = 1.0f;
    private static final float SPEC_HIDE_ICON_SCALE = 0.0f;
    private static final float SPEC_HIDE_SCALE = 0.0f;
    BorderDrawable borderDrawable;
    Drawable contentBackground;
    private Animator currentAnimator;
    float elevation;
    boolean ensureMinTouchTargetSize;
    private ArrayList<Animator.AnimatorListener> hideListeners;
    private MotionSpec hideMotionSpec;
    float hoveredFocusedTranslationZ;
    private int maxImageSize;
    int minTouchTargetSize;
    private ViewTreeObserver.OnPreDrawListener preDrawListener;
    float pressedTranslationZ;
    Drawable rippleDrawable;
    private float rotation;
    final ShadowViewDelegate shadowViewDelegate;
    ShapeAppearanceModel shapeAppearance;
    MaterialShapeDrawable shapeDrawable;
    private ArrayList<Animator.AnimatorListener> showListeners;
    private MotionSpec showMotionSpec;
    private final StateListAnimator stateListAnimator;
    private ArrayList<InternalTransformationCallback> transformationCallbacks;
    final FloatingActionButton view;
    static final TimeInterpolator ELEVATION_ANIM_INTERPOLATOR = AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR;
    private static final int SHOW_ANIM_DURATION_ATTR = R.attr.motionDurationLong2;
    private static final int SHOW_ANIM_EASING_ATTR = R.attr.motionEasingEmphasizedInterpolator;
    private static final int HIDE_ANIM_DURATION_ATTR = R.attr.motionDurationMedium1;
    private static final int HIDE_ANIM_EASING_ATTR = R.attr.motionEasingEmphasizedAccelerateInterpolator;
    static final int[] PRESSED_ENABLED_STATE_SET = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    static final int[] HOVERED_FOCUSED_ENABLED_STATE_SET = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};
    static final int[] FOCUSED_ENABLED_STATE_SET = {android.R.attr.state_focused, android.R.attr.state_enabled};
    static final int[] HOVERED_ENABLED_STATE_SET = {android.R.attr.state_hovered, android.R.attr.state_enabled};
    static final int[] ENABLED_STATE_SET = {android.R.attr.state_enabled};
    static final int[] EMPTY_STATE_SET = new int[0];
    boolean shadowPaddingEnabled = true;
    private float imageMatrixScale = 1.0f;
    private int animState = 0;
    private final Rect tmpRect = new Rect();
    private final RectF tmpRectF1 = new RectF();
    private final RectF tmpRectF2 = new RectF();
    private final Matrix tmpMatrix = new Matrix();

    interface InternalTransformationCallback {
        void onScaleChanged();

        void onTranslationChanged();
    }

    interface InternalVisibilityChangedListener {
        void onHidden();

        void onShown();
    }

    void onCompatShadowChanged() {
    }

    boolean requirePreDrawListener() {
        return true;
    }

    boolean shouldAddPadding() {
        return true;
    }

    FloatingActionButtonImpl(FloatingActionButton floatingActionButton, ShadowViewDelegate shadowViewDelegate) {
        this.view = floatingActionButton;
        this.shadowViewDelegate = shadowViewDelegate;
        StateListAnimator stateListAnimator = new StateListAnimator();
        this.stateListAnimator = stateListAnimator;
        stateListAnimator.addState(PRESSED_ENABLED_STATE_SET, createElevationAnimator(new ElevateToPressedTranslationZAnimation()));
        stateListAnimator.addState(HOVERED_FOCUSED_ENABLED_STATE_SET, createElevationAnimator(new ElevateToHoveredFocusedTranslationZAnimation()));
        stateListAnimator.addState(FOCUSED_ENABLED_STATE_SET, createElevationAnimator(new ElevateToHoveredFocusedTranslationZAnimation()));
        stateListAnimator.addState(HOVERED_ENABLED_STATE_SET, createElevationAnimator(new ElevateToHoveredFocusedTranslationZAnimation()));
        stateListAnimator.addState(ENABLED_STATE_SET, createElevationAnimator(new ResetElevationAnimation()));
        stateListAnimator.addState(EMPTY_STATE_SET, createElevationAnimator(new DisabledElevationAnimation()));
        this.rotation = floatingActionButton.getRotation();
    }

    void initializeBackgroundDrawable(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        MaterialShapeDrawable materialShapeDrawableCreateShapeDrawable = createShapeDrawable();
        this.shapeDrawable = materialShapeDrawableCreateShapeDrawable;
        materialShapeDrawableCreateShapeDrawable.setTintList(colorStateList);
        if (mode != null) {
            this.shapeDrawable.setTintMode(mode);
        }
        this.shapeDrawable.setShadowColor(-12303292);
        this.shapeDrawable.initializeElevationOverlay(this.view.getContext());
        RippleDrawableCompat rippleDrawableCompat = new RippleDrawableCompat(this.shapeDrawable.getShapeAppearanceModel());
        rippleDrawableCompat.setTintList(RippleUtils.sanitizeRippleDrawableColor(colorStateList2));
        this.rippleDrawable = rippleDrawableCompat;
        this.contentBackground = new LayerDrawable(new Drawable[]{(Drawable) Preconditions.checkNotNull(this.shapeDrawable), rippleDrawableCompat});
    }

    void setBackgroundTintList(ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = this.shapeDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setTintList(colorStateList);
        }
        BorderDrawable borderDrawable = this.borderDrawable;
        if (borderDrawable != null) {
            borderDrawable.setBorderTint(colorStateList);
        }
    }

    void setBackgroundTintMode(PorterDuff.Mode mode) {
        MaterialShapeDrawable materialShapeDrawable = this.shapeDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setTintMode(mode);
        }
    }

    void setMinTouchTargetSize(int i) {
        this.minTouchTargetSize = i;
    }

    void setRippleColor(ColorStateList colorStateList) {
        Drawable drawable = this.rippleDrawable;
        if (drawable != null) {
            DrawableCompat.setTintList(drawable, RippleUtils.sanitizeRippleDrawableColor(colorStateList));
        }
    }

    final void setElevation(float f) {
        if (this.elevation != f) {
            this.elevation = f;
            onElevationsChanged(f, this.hoveredFocusedTranslationZ, this.pressedTranslationZ);
        }
    }

    float getElevation() {
        return this.elevation;
    }

    float getHoveredFocusedTranslationZ() {
        return this.hoveredFocusedTranslationZ;
    }

    float getPressedTranslationZ() {
        return this.pressedTranslationZ;
    }

    final void setHoveredFocusedTranslationZ(float f) {
        if (this.hoveredFocusedTranslationZ != f) {
            this.hoveredFocusedTranslationZ = f;
            onElevationsChanged(this.elevation, f, this.pressedTranslationZ);
        }
    }

    final void setPressedTranslationZ(float f) {
        if (this.pressedTranslationZ != f) {
            this.pressedTranslationZ = f;
            onElevationsChanged(this.elevation, this.hoveredFocusedTranslationZ, f);
        }
    }

    final void setMaxImageSize(int i) {
        if (this.maxImageSize != i) {
            this.maxImageSize = i;
            updateImageMatrixScale();
        }
    }

    final void updateImageMatrixScale() {
        setImageMatrixScale(this.imageMatrixScale);
    }

    final void setImageMatrixScale(float f) {
        this.imageMatrixScale = f;
        Matrix matrix = this.tmpMatrix;
        calculateImageMatrixFromScale(f, matrix);
        this.view.setImageMatrix(matrix);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void calculateImageMatrixFromScale(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.view.getDrawable();
        if (drawable == null || this.maxImageSize == 0) {
            return;
        }
        RectF rectF = this.tmpRectF1;
        RectF rectF2 = this.tmpRectF2;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        float f2 = this.maxImageSize;
        rectF2.set(0.0f, 0.0f, f2, f2);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f3 = this.maxImageSize / 2.0f;
        matrix.postScale(f, f, f3, f3);
    }

    final void setShapeAppearance(ShapeAppearanceModel shapeAppearanceModel) {
        this.shapeAppearance = shapeAppearanceModel;
        MaterialShapeDrawable materialShapeDrawable = this.shapeDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
        Object obj = this.rippleDrawable;
        if (obj instanceof Shapeable) {
            ((Shapeable) obj).setShapeAppearanceModel(shapeAppearanceModel);
        }
        BorderDrawable borderDrawable = this.borderDrawable;
        if (borderDrawable != null) {
            borderDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
    }

    final ShapeAppearanceModel getShapeAppearance() {
        return this.shapeAppearance;
    }

    final MotionSpec getShowMotionSpec() {
        return this.showMotionSpec;
    }

    final void setShowMotionSpec(MotionSpec motionSpec) {
        this.showMotionSpec = motionSpec;
    }

    final MotionSpec getHideMotionSpec() {
        return this.hideMotionSpec;
    }

    final void setHideMotionSpec(MotionSpec motionSpec) {
        this.hideMotionSpec = motionSpec;
    }

    final boolean shouldExpandBoundsForA11y() {
        return !this.ensureMinTouchTargetSize || this.view.getSizeDimension() >= this.minTouchTargetSize;
    }

    boolean getEnsureMinTouchTargetSize() {
        return this.ensureMinTouchTargetSize;
    }

    void setEnsureMinTouchTargetSize(boolean z) {
        this.ensureMinTouchTargetSize = z;
    }

    void setShadowPaddingEnabled(boolean z) {
        this.shadowPaddingEnabled = z;
        updatePadding();
    }

    void onElevationsChanged(float f, float f2, float f3) {
        jumpDrawableToCurrentState();
        updatePadding();
        updateShapeElevation(f);
    }

    void updateShapeElevation(float f) {
        MaterialShapeDrawable materialShapeDrawable = this.shapeDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setElevation(f);
        }
    }

    void onDrawableStateChanged(int[] iArr) {
        this.stateListAnimator.setState(iArr);
    }

    void jumpDrawableToCurrentState() {
        this.stateListAnimator.jumpToCurrentState();
    }

    void addOnShowAnimationListener(Animator.AnimatorListener animatorListener) {
        if (this.showListeners == null) {
            this.showListeners = new ArrayList<>();
        }
        this.showListeners.add(animatorListener);
    }

    void removeOnShowAnimationListener(Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.showListeners;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    public void addOnHideAnimationListener(Animator.AnimatorListener animatorListener) {
        if (this.hideListeners == null) {
            this.hideListeners = new ArrayList<>();
        }
        this.hideListeners.add(animatorListener);
    }

    public void removeOnHideAnimationListener(Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.hideListeners;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    void hide(final InternalVisibilityChangedListener internalVisibilityChangedListener, final boolean z) {
        AnimatorSet animatorSetCreateDefaultAnimator;
        if (isOrWillBeHidden()) {
            return;
        }
        Animator animator = this.currentAnimator;
        if (animator != null) {
            animator.cancel();
        }
        if (shouldAnimateVisibilityChange()) {
            MotionSpec motionSpec = this.hideMotionSpec;
            if (motionSpec != null) {
                animatorSetCreateDefaultAnimator = createAnimator(motionSpec, 0.0f, 0.0f, 0.0f);
            } else {
                animatorSetCreateDefaultAnimator = createDefaultAnimator(0.0f, 0.4f, 0.4f, HIDE_ANIM_DURATION_ATTR, HIDE_ANIM_EASING_ATTR);
            }
            animatorSetCreateDefaultAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.1
                private boolean cancelled;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator2) {
                    FloatingActionButtonImpl.this.view.internalSetVisibility(0, z);
                    FloatingActionButtonImpl.this.animState = 1;
                    FloatingActionButtonImpl.this.currentAnimator = animator2;
                    this.cancelled = false;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator2) {
                    this.cancelled = true;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator2) {
                    FloatingActionButtonImpl.this.animState = 0;
                    FloatingActionButtonImpl.this.currentAnimator = null;
                    if (this.cancelled) {
                        return;
                    }
                    FloatingActionButton floatingActionButton = FloatingActionButtonImpl.this.view;
                    boolean z2 = z;
                    floatingActionButton.internalSetVisibility(z2 ? 8 : 4, z2);
                    InternalVisibilityChangedListener internalVisibilityChangedListener2 = internalVisibilityChangedListener;
                    if (internalVisibilityChangedListener2 != null) {
                        internalVisibilityChangedListener2.onHidden();
                    }
                }
            });
            ArrayList<Animator.AnimatorListener> arrayList = this.hideListeners;
            if (arrayList != null) {
                Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    animatorSetCreateDefaultAnimator.addListener(it.next());
                }
            }
            animatorSetCreateDefaultAnimator.start();
            return;
        }
        this.view.internalSetVisibility(z ? 8 : 4, z);
        if (internalVisibilityChangedListener != null) {
            internalVisibilityChangedListener.onHidden();
        }
    }

    void show(final InternalVisibilityChangedListener internalVisibilityChangedListener, final boolean z) {
        AnimatorSet animatorSetCreateDefaultAnimator;
        if (isOrWillBeShown()) {
            return;
        }
        Animator animator = this.currentAnimator;
        if (animator != null) {
            animator.cancel();
        }
        boolean z2 = this.showMotionSpec == null;
        if (shouldAnimateVisibilityChange()) {
            if (this.view.getVisibility() != 0) {
                this.view.setAlpha(0.0f);
                this.view.setScaleY(z2 ? 0.4f : 0.0f);
                this.view.setScaleX(z2 ? 0.4f : 0.0f);
                setImageMatrixScale(z2 ? 0.4f : 0.0f);
            }
            MotionSpec motionSpec = this.showMotionSpec;
            if (motionSpec != null) {
                animatorSetCreateDefaultAnimator = createAnimator(motionSpec, 1.0f, 1.0f, 1.0f);
            } else {
                animatorSetCreateDefaultAnimator = createDefaultAnimator(1.0f, 1.0f, 1.0f, SHOW_ANIM_DURATION_ATTR, SHOW_ANIM_EASING_ATTR);
            }
            animatorSetCreateDefaultAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator2) {
                    FloatingActionButtonImpl.this.view.internalSetVisibility(0, z);
                    FloatingActionButtonImpl.this.animState = 2;
                    FloatingActionButtonImpl.this.currentAnimator = animator2;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator2) {
                    FloatingActionButtonImpl.this.animState = 0;
                    FloatingActionButtonImpl.this.currentAnimator = null;
                    InternalVisibilityChangedListener internalVisibilityChangedListener2 = internalVisibilityChangedListener;
                    if (internalVisibilityChangedListener2 != null) {
                        internalVisibilityChangedListener2.onShown();
                    }
                }
            });
            ArrayList<Animator.AnimatorListener> arrayList = this.showListeners;
            if (arrayList != null) {
                Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    animatorSetCreateDefaultAnimator.addListener(it.next());
                }
            }
            animatorSetCreateDefaultAnimator.start();
            return;
        }
        this.view.internalSetVisibility(0, z);
        this.view.setAlpha(1.0f);
        this.view.setScaleY(1.0f);
        this.view.setScaleX(1.0f);
        setImageMatrixScale(1.0f);
        if (internalVisibilityChangedListener != null) {
            internalVisibilityChangedListener.onShown();
        }
    }

    private AnimatorSet createAnimator(MotionSpec motionSpec, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.view, (Property<FloatingActionButton, Float>) View.ALPHA, f);
        motionSpec.getTiming("opacity").apply(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.view, (Property<FloatingActionButton, Float>) View.SCALE_X, f2);
        motionSpec.getTiming("scale").apply(objectAnimatorOfFloat2);
        workAroundOreoBug(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.view, (Property<FloatingActionButton, Float>) View.SCALE_Y, f2);
        motionSpec.getTiming("scale").apply(objectAnimatorOfFloat3);
        workAroundOreoBug(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat3);
        calculateImageMatrixFromScale(f3, this.tmpMatrix);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.view, new ImageMatrixProperty(), new MatrixEvaluator() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.3
            @Override // com.google.android.material.animation.MatrixEvaluator, android.animation.TypeEvaluator
            public /* bridge */ /* synthetic */ Matrix evaluate(float f4, Matrix matrix, Matrix matrix2) {
                return evaluate(f4, matrix, matrix2);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.animation.MatrixEvaluator
            public Matrix evaluate(float f4, Matrix matrix, Matrix matrix2) {
                FloatingActionButtonImpl.this.imageMatrixScale = f4;
                return super.evaluate(f4, matrix, matrix2);
            }
        }, new Matrix(this.tmpMatrix));
        motionSpec.getTiming("iconScale").apply(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSetCompat.playTogether(animatorSet, arrayList);
        return animatorSet;
    }

    private AnimatorSet createDefaultAnimator(final float f, final float f2, final float f3, int i, int i2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float alpha = this.view.getAlpha();
        final float scaleX = this.view.getScaleX();
        final float scaleY = this.view.getScaleY();
        final float f4 = this.imageMatrixScale;
        final Matrix matrix = new Matrix(this.tmpMatrix);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FloatingActionButtonImpl.this.view.setAlpha(AnimationUtils.lerp(alpha, f, 0.0f, 0.2f, fFloatValue));
                FloatingActionButtonImpl.this.view.setScaleX(AnimationUtils.lerp(scaleX, f2, fFloatValue));
                FloatingActionButtonImpl.this.view.setScaleY(AnimationUtils.lerp(scaleY, f2, fFloatValue));
                FloatingActionButtonImpl.this.imageMatrixScale = AnimationUtils.lerp(f4, f3, fFloatValue);
                FloatingActionButtonImpl.this.calculateImageMatrixFromScale(AnimationUtils.lerp(f4, f3, fFloatValue), matrix);
                FloatingActionButtonImpl.this.view.setImageMatrix(matrix);
            }
        });
        arrayList.add(valueAnimatorOfFloat);
        AnimatorSetCompat.playTogether(animatorSet, arrayList);
        animatorSet.setDuration(MotionUtils.resolveThemeDuration(this.view.getContext(), i, this.view.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(MotionUtils.resolveThemeInterpolator(this.view.getContext(), i2, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return animatorSet;
    }

    private void workAroundOreoBug(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new TypeEvaluator<Float>() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.5
            FloatEvaluator floatEvaluator = new FloatEvaluator();

            @Override // android.animation.TypeEvaluator
            public Float evaluate(float f, Float f2, Float f3) {
                float fFloatValue = this.floatEvaluator.evaluate(f, (Number) f2, (Number) f3).floatValue();
                if (fFloatValue < 0.1f) {
                    fFloatValue = 0.0f;
                }
                return Float.valueOf(fFloatValue);
            }
        });
    }

    void addTransformationCallback(InternalTransformationCallback internalTransformationCallback) {
        if (this.transformationCallbacks == null) {
            this.transformationCallbacks = new ArrayList<>();
        }
        this.transformationCallbacks.add(internalTransformationCallback);
    }

    void removeTransformationCallback(InternalTransformationCallback internalTransformationCallback) {
        ArrayList<InternalTransformationCallback> arrayList = this.transformationCallbacks;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(internalTransformationCallback);
    }

    void onTranslationChanged() {
        ArrayList<InternalTransformationCallback> arrayList = this.transformationCallbacks;
        if (arrayList != null) {
            Iterator<InternalTransformationCallback> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onTranslationChanged();
            }
        }
    }

    void onScaleChanged() {
        ArrayList<InternalTransformationCallback> arrayList = this.transformationCallbacks;
        if (arrayList != null) {
            Iterator<InternalTransformationCallback> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onScaleChanged();
            }
        }
    }

    final Drawable getContentBackground() {
        return this.contentBackground;
    }

    final void updatePadding() {
        Rect rect = this.tmpRect;
        getPadding(rect);
        onPaddingUpdated(rect);
        this.shadowViewDelegate.setShadowPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    void getPadding(Rect rect) {
        int touchTargetPadding = getTouchTargetPadding();
        float elevation = this.shadowPaddingEnabled ? getElevation() + this.pressedTranslationZ : 0.0f;
        int iMax = Math.max(touchTargetPadding, (int) Math.ceil(elevation));
        int iMax2 = Math.max(touchTargetPadding, (int) Math.ceil(elevation * SHADOW_MULTIPLIER));
        rect.set(iMax, iMax2, iMax, iMax2);
    }

    int getTouchTargetPadding() {
        if (this.ensureMinTouchTargetSize) {
            return Math.max((this.minTouchTargetSize - this.view.getSizeDimension()) / 2, 0);
        }
        return 0;
    }

    void onPaddingUpdated(Rect rect) {
        Preconditions.checkNotNull(this.contentBackground, "Didn't initialize content background");
        if (shouldAddPadding()) {
            this.shadowViewDelegate.setBackgroundDrawable(new InsetDrawable(this.contentBackground, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            this.shadowViewDelegate.setBackgroundDrawable(this.contentBackground);
        }
    }

    void onAttachedToWindow() {
        MaterialShapeDrawable materialShapeDrawable = this.shapeDrawable;
        if (materialShapeDrawable != null) {
            MaterialShapeUtils.setParentAbsoluteElevation(this.view, materialShapeDrawable);
        }
        if (requirePreDrawListener()) {
            this.view.getViewTreeObserver().addOnPreDrawListener(getOrCreatePreDrawListener());
        }
    }

    void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver = this.view.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.preDrawListener;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.preDrawListener = null;
        }
    }

    void onPreDraw() {
        float rotation = this.view.getRotation();
        if (this.rotation != rotation) {
            this.rotation = rotation;
            updateFromViewRotation();
        }
    }

    private ViewTreeObserver.OnPreDrawListener getOrCreatePreDrawListener() {
        if (this.preDrawListener == null) {
            this.preDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.6
                private static final byte[] $$c = {27, -8, 5, 78};
                private static final int $$d = 186;
                private static int $10 = 0;
                private static int $11 = 1;
                private static final byte[] $$a = {31, 115, -100, -11};
                private static final int $$b = 165;
                private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                private static int d = 1;
                private static char[] b = {47277, 47267, 47250, 47281, 47284, 47265, 47279, 47268, 47251, 47271, 47272, 47283, 47266, 47282, 47327, 47285, 47248, 47208, 47207, 47325, 47275, 47274, 47287, 47270, 47280, 47205};
                private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2047719510;
                private static boolean TuitionPaymentFragmentbindingInflater1 = true;
                private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;

                private static void c(int i, byte b2, byte b3, Object[] objArr) {
                    int i2 = (i * 4) + 98;
                    int i3 = 4 - (b2 * 2);
                    byte[] bArr = $$a;
                    int i4 = b3 * 2;
                    byte[] bArr2 = new byte[i4 + 1];
                    int i5 = -1;
                    if (bArr == null) {
                        i3++;
                        i2 = i3 + i4;
                    }
                    while (true) {
                        i5++;
                        bArr2[i5] = (byte) i2;
                        if (i5 == i4) {
                            objArr[0] = new String(bArr2, 0);
                            return;
                        } else {
                            int i6 = bArr[i3];
                            i3++;
                            i2 += i6;
                        }
                    }
                }

                private static void a(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
                    int length;
                    char[] cArr2;
                    int i2;
                    int i3 = 2;
                    int i4 = 2 % 2;
                    getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
                    char[] cArr3 = b;
                    if (cArr3 != null) {
                        int i5 = $11 + 89;
                        $10 = i5 % 128;
                        if (i5 % 2 != 0) {
                            length = cArr3.length;
                            cArr2 = new char[length];
                            i2 = 1;
                        } else {
                            length = cArr3.length;
                            cArr2 = new char[length];
                            i2 = 0;
                        }
                        while (i2 < length) {
                            int i6 = $10 + 65;
                            $11 = i6 % 128;
                            int i7 = i6 % i3;
                            try {
                                Object[] objArr2 = {Integer.valueOf(cArr3[i2])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    byte b2 = (byte) 0;
                                    byte b3 = b2;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 31339), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2994, View.MeasureSpec.getSize(0) + 17, 1182129903, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                                }
                                cArr2[i2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                                i2++;
                                i3 = 2;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        cArr3 = cArr2;
                    }
                    try {
                        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
                        long j = 0;
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.MeasureSpec.getMode(0) + 43325), 252 - TextUtils.lastIndexOf("", '0'), 23 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                        int i8 = 33603;
                        if (TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            int i9 = $10 + 123;
                            $11 = i9 % 128;
                            int i10 = i9 % 2;
                            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                            char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                                cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                                Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    byte b4 = (byte) 1;
                                    byte b5 = (byte) (b4 - 1);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (i8 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1))), 3085 - TextUtils.getCapsMode("", 0, 0), 27 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)), -2146875848, false, $$e(b4, b5, b5), new Class[]{Object.class, Object.class});
                                }
                                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                                j = 0;
                                i8 = 33603;
                            }
                            objArr[0] = new String(cArr4);
                            return;
                        }
                        if (!TuitionPaymentFragmentbindingInflater1) {
                            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                                cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                            }
                            objArr[0] = new String(cArr5);
                            return;
                        }
                        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                        while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                            cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                            Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b6 = (byte) 1;
                                byte b7 = (byte) (b6 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ExpandableListView.getPackedPositionChild(0L) + 33603), (ViewConfiguration.getFadingEdgeLength() >> 16) + 3085, 26 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -2146875848, false, $$e(b6, b7, b7), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                        }
                        objArr[0] = new String(cArr6);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }

                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    int i = 2 % 2;
                    int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 29;
                    d = i2 % 128;
                    int i3 = i2 % 2;
                    FloatingActionButtonImpl.this.onPreDraw();
                    int i4 = d + 39;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 3 / 0;
                    }
                    return true;
                }

                /* JADX WARN: Code duplicated, block: B:113:0x05c8 A[Catch: Exception -> 0x05e4, TRY_LEAVE, TryCatch #9 {Exception -> 0x05e4, blocks: (B:67:0x0380, B:70:0x03e9, B:74:0x03fe, B:76:0x046c, B:78:0x0474, B:81:0x04a2, B:87:0x04b9, B:101:0x057a, B:111:0x05c1, B:112:0x05c7, B:113:0x05c8, B:115:0x05cc, B:116:0x05cf, B:120:0x05d3, B:121:0x05d9, B:122:0x05da, B:124:0x05de, B:125:0x05e1, B:89:0x04cc, B:93:0x04ec, B:98:0x0523, B:100:0x0541, B:99:0x052f, B:75:0x0408), top: B:163:0x0380, inners: #1, #5 }] */
                /* JADX WARN: Code duplicated, block: B:122:0x05da A[Catch: Exception -> 0x05e4, TRY_LEAVE, TryCatch #9 {Exception -> 0x05e4, blocks: (B:67:0x0380, B:70:0x03e9, B:74:0x03fe, B:76:0x046c, B:78:0x0474, B:81:0x04a2, B:87:0x04b9, B:101:0x057a, B:111:0x05c1, B:112:0x05c7, B:113:0x05c8, B:115:0x05cc, B:116:0x05cf, B:120:0x05d3, B:121:0x05d9, B:122:0x05da, B:124:0x05de, B:125:0x05e1, B:89:0x04cc, B:93:0x04ec, B:98:0x0523, B:100:0x0541, B:99:0x052f, B:75:0x0408), top: B:163:0x0380, inners: #1, #5 }] */
                /* JADX WARN: Code duplicated, block: B:131:0x061a  */
                /* JADX WARN: Code duplicated, block: B:132:0x062b  */
                /* JADX WARN: Code duplicated, block: B:135:0x0644  */
                /* JADX WARN: Code duplicated, block: B:136:0x065c  */
                /* JADX WARN: Code duplicated, block: B:70:0x03e9 A[Catch: Exception -> 0x05e4, TRY_ENTER, TRY_LEAVE, TryCatch #9 {Exception -> 0x05e4, blocks: (B:67:0x0380, B:70:0x03e9, B:74:0x03fe, B:76:0x046c, B:78:0x0474, B:81:0x04a2, B:87:0x04b9, B:101:0x057a, B:111:0x05c1, B:112:0x05c7, B:113:0x05c8, B:115:0x05cc, B:116:0x05cf, B:120:0x05d3, B:121:0x05d9, B:122:0x05da, B:124:0x05de, B:125:0x05e1, B:89:0x04cc, B:93:0x04ec, B:98:0x0523, B:100:0x0541, B:99:0x052f, B:75:0x0408), top: B:163:0x0380, inners: #1, #5 }] */
                /* JADX WARN: Code duplicated, block: B:73:0x03f0  */
                /* JADX WARN: Code duplicated, block: B:74:0x03fe A[Catch: Exception -> 0x05e4, TRY_ENTER, TRY_LEAVE, TryCatch #9 {Exception -> 0x05e4, blocks: (B:67:0x0380, B:70:0x03e9, B:74:0x03fe, B:76:0x046c, B:78:0x0474, B:81:0x04a2, B:87:0x04b9, B:101:0x057a, B:111:0x05c1, B:112:0x05c7, B:113:0x05c8, B:115:0x05cc, B:116:0x05cf, B:120:0x05d3, B:121:0x05d9, B:122:0x05da, B:124:0x05de, B:125:0x05e1, B:89:0x04cc, B:93:0x04ec, B:98:0x0523, B:100:0x0541, B:99:0x052f, B:75:0x0408), top: B:163:0x0380, inners: #1, #5 }] */
                /* JADX WARN: Code duplicated, block: B:78:0x0474 A[Catch: Exception -> 0x05e4, TRY_LEAVE, TryCatch #9 {Exception -> 0x05e4, blocks: (B:67:0x0380, B:70:0x03e9, B:74:0x03fe, B:76:0x046c, B:78:0x0474, B:81:0x04a2, B:87:0x04b9, B:101:0x057a, B:111:0x05c1, B:112:0x05c7, B:113:0x05c8, B:115:0x05cc, B:116:0x05cf, B:120:0x05d3, B:121:0x05d9, B:122:0x05da, B:124:0x05de, B:125:0x05e1, B:89:0x04cc, B:93:0x04ec, B:98:0x0523, B:100:0x0541, B:99:0x052f, B:75:0x0408), top: B:163:0x0380, inners: #1, #5 }] */
                /* JADX WARN: Code duplicated, block: B:81:0x04a2 A[Catch: Exception -> 0x05e4, TRY_ENTER, TRY_LEAVE, TryCatch #9 {Exception -> 0x05e4, blocks: (B:67:0x0380, B:70:0x03e9, B:74:0x03fe, B:76:0x046c, B:78:0x0474, B:81:0x04a2, B:87:0x04b9, B:101:0x057a, B:111:0x05c1, B:112:0x05c7, B:113:0x05c8, B:115:0x05cc, B:116:0x05cf, B:120:0x05d3, B:121:0x05d9, B:122:0x05da, B:124:0x05de, B:125:0x05e1, B:89:0x04cc, B:93:0x04ec, B:98:0x0523, B:100:0x0541, B:99:0x052f, B:75:0x0408), top: B:163:0x0380, inners: #1, #5 }] */
                /* JADX WARN: Code duplicated, block: B:83:0x04a8  */
                /* JADX WARN: Code duplicated, block: B:85:0x04b3  */
                /* JADX WARN: Code duplicated, block: B:86:0x04b6  */
                /* JADX WARN: Code duplicated, block: B:87:0x04b9 A[Catch: Exception -> 0x05e4, TRY_ENTER, TRY_LEAVE, TryCatch #9 {Exception -> 0x05e4, blocks: (B:67:0x0380, B:70:0x03e9, B:74:0x03fe, B:76:0x046c, B:78:0x0474, B:81:0x04a2, B:87:0x04b9, B:101:0x057a, B:111:0x05c1, B:112:0x05c7, B:113:0x05c8, B:115:0x05cc, B:116:0x05cf, B:120:0x05d3, B:121:0x05d9, B:122:0x05da, B:124:0x05de, B:125:0x05e1, B:89:0x04cc, B:93:0x04ec, B:98:0x0523, B:100:0x0541, B:99:0x052f, B:75:0x0408), top: B:163:0x0380, inners: #1, #5 }] */
                /* JADX WARN: Code duplicated, block: B:92:0x04ea  */
                /* JADX WARN: Code duplicated, block: B:95:0x04f2  */
                /* JADX WARN: Code duplicated, block: B:98:0x0523 A[Catch: all -> 0x05c0, TRY_ENTER, TryCatch #1 {all -> 0x05c0, blocks: (B:89:0x04cc, B:93:0x04ec, B:98:0x0523, B:100:0x0541, B:99:0x052f), top: B:148:0x04cc, outer: #9 }] */
                /* JADX WARN: Code duplicated, block: B:99:0x052f A[Catch: all -> 0x05c0, TryCatch #1 {all -> 0x05c0, blocks: (B:89:0x04cc, B:93:0x04ec, B:98:0x0523, B:100:0x0541, B:99:0x052f), top: B:148:0x04cc, outer: #9 }] */
                public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2) throws Throwable {
                    int i3;
                    int i4;
                    int i5;
                    int i6;
                    int i7;
                    int i8;
                    String line;
                    Object[] objArr;
                    int i9;
                    int i10;
                    int i11;
                    int i12;
                    int i13;
                    String[] strArr;
                    Object[] objArr2;
                    int i14;
                    int i15;
                    int i16;
                    int i17;
                    File file;
                    int i18;
                    FileReader fileReader;
                    BufferedReader bufferedReader;
                    boolean zEquals;
                    File file2;
                    int i19;
                    FileReader fileReader2;
                    BufferedReader bufferedReader2;
                    int scrollBarFadeDuration;
                    int i20;
                    int i21;
                    int i22;
                    int i23;
                    int i24;
                    boolean z;
                    char c;
                    int i25;
                    int i26 = 2 % 2;
                    int i27 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
                    d = i27 % 128;
                    int i28 = i27 % 2;
                    try {
                        int i29 = -TextUtils.indexOf("", "", 0);
                        int i30 = i29 * 784;
                        int i31 = ((i30 | (-99314)) << 1) - (i30 ^ (-99314));
                        int i32 = ((i31 | 100224) << 1) - (100224 ^ i31);
                        int i33 = ~i29;
                        int i34 = ~i;
                        int i35 = (i33 & i34) | (i33 ^ i34);
                        int i36 = (~((i35 & 127) | (i35 ^ 127))) * (-783);
                        int i37 = ((i32 | i36) << 1) - (i36 ^ i32);
                        int i38 = ~i29;
                        int i39 = ~i;
                        int i40 = ~((i39 & 127) | (i39 ^ 127));
                        int i41 = -(-(((i38 & i40) | (i38 ^ i40)) * 783));
                        Object[] objArr3 = new Object[1];
                        a(null, null, (i37 & i41) + (i41 | i37), new byte[]{-114, -124, -115, -116, -124, -117, -117, -118, -119, -120, -124, -121, -121, -122, -123, -124, -125, -126, -127}, objArr3);
                        int i42 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        Object[] objArr4 = new Object[1];
                        a(null, null, (i42 ^ 128) + ((i42 & 128) << 1), new byte[]{-120, -124, -121, -121, -122, -123, -124, -125, -120, -118, -111, -121, -117, -127, -115, -127, -112, -113}, objArr4);
                        String[] strArr2 = {(String) objArr3[0], (String) objArr4[0]};
                        int i43 = 0;
                        while (true) {
                            if (i43 >= 2) {
                                i5 = i;
                                break;
                            }
                            int i44 = d;
                            int i45 = (i44 & 47) + (i44 | 47);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i45 % 128;
                            int i46 = i45 % 2;
                            String str = strArr2[i43];
                            int i47 = -TextUtils.lastIndexOf("", '0');
                            int iB = onBackCompletedFallback.b();
                            int i48 = i47 * (-183);
                            int i49 = d;
                            int i50 = i49 + 49;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i50 % 128;
                            int i51 = i50 % 2;
                            int i52 = ((i48 | 23310) << 1) - (i48 ^ 23310);
                            int i53 = ~i47;
                            int i54 = ((126 ^ i53) | (126 & i53)) * (-368);
                            int i55 = (i52 & i54) + (i52 | i54);
                            int i56 = (i47 ^ ComposerKt.defaultsKey) | (i47 & ComposerKt.defaultsKey);
                            int i57 = ~iB;
                            int i58 = (i55 - (~(-(-(((i56 ^ i57) | (i56 & i57)) * 184))))) - 1;
                            int i59 = ~((i53 & ComposerKt.defaultsKey) | (i53 ^ ComposerKt.defaultsKey));
                            int i60 = ~iB;
                            int i61 = ~((i60 & i47) | (i60 ^ i47));
                            int i62 = (i49 & 125) + (i49 | 125);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i62 % 128;
                            int i63 = i62 % 2;
                            int i64 = (i61 & i59) | (i59 ^ i61);
                            int i65 = ~((i47 & 126) | (i47 ^ 126));
                            Object[] objArr5 = new Object[1];
                            a(null, null, (i58 - (~(-(-(184 * ((i65 & i64) | (i64 ^ i65))))))) - 1, new byte[]{-121, -122, -123, -124, -125, -110, -126, -118, -110, -114, -127, -118, -120, -114, -117, -112}, objArr5);
                            Class<?> cls = Class.forName((String) objArr5[0]);
                            int i66 = d + 111;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i66 % 128;
                            if (((Boolean) (i66 % 2 != 0 ? cls.getMethod(str, new Class[1]) : cls.getMethod(str, new Class[0])).invoke(cls, null)).booleanValue()) {
                                int i67 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 105;
                                d = i67 % 128;
                                if (i67 % 2 != 0) {
                                    i3 = i & (-2);
                                    i4 = i34 & 1;
                                    i5 = i3 | i4;
                                    break;
                                }
                                i5 = (~(i & 1)) & (i | 1);
                                break;
                            }
                            i43++;
                        }
                    } catch (Exception unused) {
                        i3 = i & (-3);
                        i4 = (~i) & 2;
                    }
                    try {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(109138771);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char defaultSize = (char) (2419 - View.getDefaultSize(0, 0));
                            int iBlue = Color.blue(0) + 2845;
                            int bitsPerPixel = 4 - ImageFormat.getBitsPerPixel(0);
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            Object[] objArr6 = new Object[1];
                            c(b2, b3, b3, objArr6);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(defaultSize, iBlue, bitsPerPixel, -501222268, false, (String) objArr6[0], new Class[0]);
                        }
                        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
                        long j = -1011077377;
                        long j2 = 569;
                        long j3 = -1;
                        long j4 = j ^ j3;
                        long j5 = jLongValue ^ j3;
                        long j6 = j4 | j5;
                        long jElapsedRealtime = (int) SystemClock.elapsedRealtime();
                        long j7 = jElapsedRealtime ^ j3;
                        long j8 = j7 | j;
                        long j9 = (j2 * j) + (j2 * jLongValue) + (((long) (-1136)) * ((j6 ^ j3) | ((j4 | j7) ^ j3) | ((j5 | j7) ^ j3))) + (((long) (-568)) * (((j4 | jElapsedRealtime) ^ j3) | ((j5 | jElapsedRealtime) ^ j3) | ((j8 | jLongValue) ^ j3))) + (((long) 568) * ((j3 ^ (j6 | jElapsedRealtime)) | (j8 ^ j3) | ((j7 | jLongValue) ^ j3))) + ((long) (-148109309));
                        int i68 = ~i;
                        int i69 = (~(4953455 | i68)) | (-1442840448);
                        int i70 = ~((-4292875) | i);
                        int i71 = 423318864 + ((i69 | i70) * (-713)) + (i70 * 1426) + ((~((-1442179867) | i68)) * 713);
                        int i72 = d + 27;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i72 % 128;
                        int i73 = ((int) (j9 >> 32)) & i71;
                        if (i72 % 2 != 0) {
                            int i74 = 1239234965 + (((~(676316135 | i68)) | (-2113919992)) * (-1188));
                            int i75 = (-2113919992) | (~((-676316136) | i));
                            int i76 = ~((-2113542546) | i68);
                            int i77 = ((int) j9) & (i74 + ((i75 | i76) * 594) + (((~((-676316136) | i68)) | 675938689 | i76) * 594));
                            i6 = (i73 & i77) | (i73 ^ i77);
                            i7 = (~(i & 68)) & (i | 68);
                        } else {
                            int iMyPid = Process.myPid();
                            int i78 = ((int) j9) & (2088992125 + (((-709514630) | iMyPid) * 376) + (((~((~iMyPid) | (-532168856))) | 363855890) * (-376)) + (((~(iMyPid | 532168855)) | (-905057555)) * 376));
                            i6 = (i73 & i78) | (i73 ^ i78);
                            i7 = i ^ 10;
                        }
                        int i79 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i80 = (i79 & 49) + (i79 | 49);
                        d = i80 % 128;
                        if (i80 % 2 == 0) {
                            int i81 = -i6;
                            i8 = ((i6 & i81) | (i6 ^ i81)) + 34;
                        } else {
                            int i82 = (i6 | 1) & (~(i6 & 1));
                            int i83 = -i82;
                            i8 = ((i82 & i83) | (i82 ^ i83)) >> 31;
                        }
                        int i84 = (i8 & i) | (i7 & (i8 ^ (-1)));
                        int i85 = ((~i5) & i) | (i5 & i68);
                        int i86 = (i85 | (-i85)) >> 31;
                        int i87 = i84 & (~i86);
                        int i88 = i5 & i86;
                        int i89 = (i87 ^ i88) | (i88 & i87);
                        try {
                            int i90 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                            Object[] objArr7 = new Object[1];
                            a(null, null, ((i90 | 127) << 1) - (i90 ^ 127), new byte[]{-120, -124, -116, -112, -120, -115, -105, -115, -117, -124, -120, -120, -122, -116, -109, -121, -117, -127, -116, -112, -120, -115, -109, -121, -122, -123, -124, -114, -109, -106, -124, -117, -120, -124, -107, -109, -126, -108, -126, -109}, objArr7);
                            File file3 = new File((String) objArr7[0]);
                            int i91 = d + 55;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i91 % 128;
                            int i92 = i91 % 2;
                            try {
                                if (file3.canRead()) {
                                    FileReader fileReader3 = new FileReader(file3);
                                    BufferedReader bufferedReader3 = new BufferedReader(fileReader3);
                                    try {
                                        line = bufferedReader3.readLine();
                                        Object[] objArr8 = new Object[1];
                                        a(null, null, 126 - (~(-View.resolveSize(0, 0))), new byte[]{-104, -118, -117}, objArr8);
                                        if (line.equals((String) objArr8[0])) {
                                            fileReader3.close();
                                            bufferedReader3.close();
                                        } else {
                                            int i93 = d;
                                            int i94 = (i93 & 115) + (i93 | 115);
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i94 % 128;
                                            if (i94 % 2 != 0) {
                                                fileReader3.close();
                                                bufferedReader3.close();
                                                throw null;
                                            }
                                            fileReader3.close();
                                            bufferedReader3.close();
                                        }
                                        int i95 = -TextUtils.indexOf("", "", 0);
                                        int i96 = i95 * (-665);
                                        int i97 = (i96 ^ 42418) + ((i96 & 42418) << 1) + ((~i95) * (-333));
                                        int i98 = ~i95;
                                        int i99 = ~((i98 ^ i68) | (i98 & i68));
                                        int i100 = ~((i ^ 127) | (i & 127));
                                        int i101 = -(-(((i99 & i100) | (i99 ^ i100)) * 333));
                                        int i102 = ((i97 | i101) << 1) - (i101 ^ i97);
                                        int i103 = ~((i98 & i) | (i98 ^ i));
                                        int i104 = ~i;
                                        int i105 = ~((i104 & 127) | (i104 ^ 127));
                                        int i106 = -(-(((i103 & i105) | (i103 ^ i105)) * 333));
                                        Object[] objArr9 = new Object[1];
                                        a(null, null, (i102 & i106) + (i106 | i102), new byte[]{-114, -124, -106, -123, -112, -117, -124, -105, -124, -116, -112, -120, -115, -103, -109, -106, -124, -117, -120, -124, -107, -109, -126, -108, -126, -109, -116, -118, -120, -104, -109}, objArr9);
                                        file = new File((String) objArr9[0]);
                                        i18 = d + 125;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i18 % 128;
                                        if (i18 % 2 == 0) {
                                            file.canRead();
                                            Object obj = null;
                                            obj.hashCode();
                                            throw null;
                                        }
                                        if (!file.canRead()) {
                                            fileReader = new FileReader(file);
                                            bufferedReader = new BufferedReader(fileReader);
                                            try {
                                                String line2 = bufferedReader.readLine();
                                                int i107 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                int i108 = i107 * 567;
                                                int i109 = (i108 & (-71190)) + (i108 | (-71190));
                                                int i110 = ~i107;
                                                int i111 = ~((i110 & 126) | (i110 ^ 126));
                                                int i112 = ~i107;
                                                int i113 = ~((i112 ^ i) | (i112 & i));
                                                int i114 = ((i111 & i113) | (i111 ^ i113)) * (-566);
                                                int i115 = ((((i109 | i114) << 1) - (i114 ^ i109)) - (~(-(-((~((i107 & ComposerKt.defaultsKey) | ((-127) ^ i107))) * 566))))) - 1;
                                                int i116 = (i112 ^ ComposerKt.defaultsKey) | ((-127) & i112);
                                                int i117 = (~((i116 & i) | (i116 ^ i))) * 566;
                                                Object[] objArr10 = new Object[1];
                                                a(null, null, (i115 ^ i117) + ((i117 & i115) << 1), new byte[]{-102}, objArr10);
                                                zEquals = line2.equals((String) objArr10[0]);
                                                fileReader.close();
                                                bufferedReader.close();
                                                if (zEquals) {
                                                    Object[] objArr11 = new Object[1];
                                                    a(null, null, 127 - (~(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))), new byte[]{-117, -118, -105, -121, -117, -127, -116, -112, -120, -115, -109, -121, -117, -127, -116, -112, -120, -115, -109, -121, -122, -123, -124, -114, -109, -106, -124, -117, -120, -124, -107, -109, -126, -108, -126, -109}, objArr11);
                                                    file2 = new File((String) objArr11[0]);
                                                    i19 = d + 101;
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i19 % 128;
                                                    if (i19 % 2 == 0) {
                                                        file2.canRead();
                                                        Object obj2 = null;
                                                        obj2.hashCode();
                                                        throw null;
                                                    }
                                                    if (file2.canRead()) {
                                                        fileReader2 = new FileReader(file2);
                                                        bufferedReader2 = new BufferedReader(fileReader2);
                                                        int i118 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 29;
                                                        d = i118 % 128;
                                                        int i119 = i118 % 2;
                                                        try {
                                                            String line3 = bufferedReader2.readLine();
                                                            scrollBarFadeDuration = ViewConfiguration.getScrollBarFadeDuration() >> 16;
                                                            int iB2 = onBackCompletedFallback.b();
                                                            int i120 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                            i20 = ((i120 | 37) << 1) - (i120 ^ 37);
                                                            d = i20 % 128;
                                                            if (i20 % 2 == 0) {
                                                                i21 = (989 / scrollBarFadeDuration) >>> (-125349);
                                                            } else {
                                                                int i121 = scrollBarFadeDuration * 989;
                                                                i21 = ((i121 | (-125349)) << 1) - (i121 ^ (-125349));
                                                            }
                                                            int i122 = (-128) | (~iB2);
                                                            int i123 = ~((i122 & scrollBarFadeDuration) | (i122 ^ scrollBarFadeDuration));
                                                            int i124 = scrollBarFadeDuration | 127;
                                                            int i125 = ~((i124 & iB2) | (i124 ^ iB2));
                                                            i22 = 988 * ((i123 & i125) | (i123 ^ i125));
                                                            i23 = (i120 ^ 77) + ((i120 & 77) << 1);
                                                            d = i23 % 128;
                                                            if (i23 % 2 == 0) {
                                                                i24 = (i21 / i22) / ((-988) >> ((scrollBarFadeDuration ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (scrollBarFadeDuration & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT)));
                                                            } else {
                                                                int i126 = -(-i22);
                                                                int i127 = (i21 & i126) + (i126 | i21);
                                                                int i128 = -(-((scrollBarFadeDuration | WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) * (-988)));
                                                                i24 = (i127 ^ i128) + ((i128 & i127) << 1);
                                                            }
                                                            int i129 = ~scrollBarFadeDuration;
                                                            int i130 = ~((i129 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i129 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                                                            int i131 = ~(((-128) ^ iB2) | ((-128) & iB2));
                                                            int i132 = (i130 & i131) | (i130 ^ i131);
                                                            int i133 = ~(scrollBarFadeDuration | (~iB2) | 127);
                                                            int i134 = -(-(988 * ((i133 & i132) | (i132 ^ i133))));
                                                            Object[] objArr12 = new Object[1];
                                                            a(null, null, (i24 & i134) + (i134 | i24), new byte[]{-102}, objArr12);
                                                            boolean zEquals2 = line3.equals((String) objArr12[0]);
                                                            fileReader2.close();
                                                            bufferedReader2.close();
                                                            z = zEquals2;
                                                        } catch (Throwable th) {
                                                            fileReader2.close();
                                                            bufferedReader2.close();
                                                            throw th;
                                                        }
                                                    } else {
                                                        i25 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 109;
                                                        d = i25 % 128;
                                                        if (i25 % 2 == 0) {
                                                            z = true;
                                                        } else {
                                                            z = false;
                                                        }
                                                    }
                                                    if (!z && line != null) {
                                                        int i135 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 99;
                                                        int i136 = i135 % 128;
                                                        d = i136;
                                                        if (i135 % 2 == 0) {
                                                            objArr = new Object[4];
                                                            objArr[1] = new int[1];
                                                            c = 0;
                                                        } else {
                                                            objArr = new Object[2];
                                                            c = 0;
                                                            objArr[0] = new int[1];
                                                        }
                                                        ((int[]) objArr[c])[c] = (i & (-21)) | (i68 & 20);
                                                        int i137 = (i136 ^ 125) + ((i136 & 125) << 1);
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i137 % 128;
                                                        int i138 = i137 % 2;
                                                        objArr[1] = new String[]{line};
                                                    }
                                                }
                                                i9 = ((int[]) objArr[0])[0];
                                                int i139 = ((~i89) & i) | (i89 & i68);
                                                i10 = i139 | (-i139);
                                                int i140 = d;
                                                i11 = i140 + 63;
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                                                if (i11 % 2 != 0) {
                                                    int i141 = i10 >>> 31;
                                                    int i142 = (~i141) & i9;
                                                    int i143 = i89 & i141;
                                                    i13 = (i143 & i142) | (i142 ^ i143);
                                                    i12 = 1;
                                                    strArr = (String[]) objArr[1];
                                                    objArr2 = new Object[5];
                                                } else {
                                                    i12 = 1;
                                                    int i144 = i10 >> 31;
                                                    i13 = (i89 & i144) | ((~i144) & i9);
                                                    strArr = (String[]) objArr[1];
                                                    objArr2 = new Object[2];
                                                }
                                                i14 = ((i140 | 107) << i12) - (i140 ^ 107);
                                                int i145 = i14 % 128;
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i145;
                                                if (i14 % 2 != 0) {
                                                    int i146 = (i9 & i68) | ((~i9) & i);
                                                    int i147 = -i146;
                                                    int i148 = ((i146 & i147) | (i146 ^ i147)) >> 102;
                                                    i15 = 1;
                                                    i16 = (i148 & 1) | ((~i148) & 1);
                                                    int i149 = -i16;
                                                    i17 = ((i149 & i16) | (i16 ^ i149)) % 86;
                                                } else {
                                                    i15 = 1;
                                                    int i150 = i9 ^ i;
                                                    i16 = ((i150 | (-i150)) >> 31) & 1;
                                                    i17 = ((-i16) | i16) >> 31;
                                                }
                                                int i151 = (~i17) & i15;
                                                objArr2[i16] = null;
                                                objArr2[i151] = strArr;
                                                String[] strArr3 = (String[]) objArr2[0];
                                                Object[] objArr13 = new Object[4];
                                                int[] iArr = new int[i15];
                                                int i152 = i145 + 45;
                                                d = i152 % 128;
                                                int i153 = i152 % 2;
                                                objArr13[0] = iArr;
                                                int[] iArr2 = new int[i15];
                                                objArr13[i15] = iArr2;
                                                int[] iArr3 = new int[i15];
                                                objArr13[2] = iArr3;
                                                int i154 = (~(i & i13)) & (i | i13);
                                                int i155 = -i154;
                                                iArr[0] = i;
                                                iArr3[0] = i13;
                                                objArr13[3] = strArr3;
                                                int i156 = (~(894572019 | i68)) | (-939212796) | (~(934882248 | i68));
                                                int i157 = (-1300916596) + (((~(i | (-890241473))) | i156) * 590) + (i156 * (-1180)) + (((~((-934882249) | i68)) | (~((-894572020) | i68))) * 590);
                                                int i158 = -(-((((i154 & i155) | (i154 ^ i155)) >> 31) & 16));
                                                int i159 = i2 + (i157 & i158) + (i158 | i157);
                                                int i160 = i159 ^ (i159 << 13);
                                                int i161 = i160 ^ (i160 >>> 17);
                                                int i162 = i161 << 5;
                                                iArr2[0] = (i161 | i162) & (~(i161 & i162));
                                                return objArr13;
                                            } catch (Throwable th2) {
                                                fileReader.close();
                                                bufferedReader.close();
                                                throw th2;
                                            }
                                        }
                                        int i163 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                        int i164 = (i163 & 33) + (i163 | 33);
                                        d = i164 % 128;
                                        int i165 = i164 % 2;
                                        int i166 = d;
                                        int i167 = (i166 & 41) + (i166 | 41);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i167 % 128;
                                        int i168 = i167 % 2;
                                        objArr = new Object[]{new int[]{i}, new String[0]};
                                        i9 = ((int[]) objArr[0])[0];
                                        int i1310 = ((~i89) & i) | (i89 & i68);
                                        i10 = i1310 | (-i1310);
                                        int i1410 = d;
                                        i11 = i1410 + 63;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                                        if (i11 % 2 != 0) {
                                            int i1411 = i10 >>> 31;
                                            int i1412 = (~i1411) & i9;
                                            int i1413 = i89 & i1411;
                                            i13 = (i1413 & i1412) | (i1412 ^ i1413);
                                            i12 = 1;
                                            strArr = (String[]) objArr[1];
                                            objArr2 = new Object[5];
                                        } else {
                                            i12 = 1;
                                            int i1414 = i10 >> 31;
                                            i13 = (i89 & i1414) | ((~i1414) & i9);
                                            strArr = (String[]) objArr[1];
                                            objArr2 = new Object[2];
                                        }
                                        i14 = ((i1410 | 107) << i12) - (i1410 ^ 107);
                                        int i1415 = i14 % 128;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1415;
                                        if (i14 % 2 != 0) {
                                            int i1416 = (i9 & i68) | ((~i9) & i);
                                            int i1417 = -i1416;
                                            int i1418 = ((i1416 & i1417) | (i1416 ^ i1417)) >> 102;
                                            i15 = 1;
                                            i16 = (i1418 & 1) | ((~i1418) & 1);
                                            int i1419 = -i16;
                                            i17 = ((i1419 & i16) | (i16 ^ i1419)) % 86;
                                        } else {
                                            i15 = 1;
                                            int i1510 = i9 ^ i;
                                            i16 = ((i1510 | (-i1510)) >> 31) & 1;
                                            i17 = ((-i16) | i16) >> 31;
                                        }
                                        int i1511 = (~i17) & i15;
                                        objArr2[i16] = null;
                                        objArr2[i1511] = strArr;
                                        String[] strArr4 = (String[]) objArr2[0];
                                        Object[] objArr14 = new Object[4];
                                        int[] iArr4 = new int[i15];
                                        int i1512 = i1415 + 45;
                                        d = i1512 % 128;
                                        int i1513 = i1512 % 2;
                                        objArr14[0] = iArr4;
                                        int[] iArr5 = new int[i15];
                                        objArr14[i15] = iArr5;
                                        int[] iArr6 = new int[i15];
                                        objArr14[2] = iArr6;
                                        int i1514 = (~(i & i13)) & (i | i13);
                                        int i1515 = -i1514;
                                        iArr4[0] = i;
                                        iArr6[0] = i13;
                                        objArr14[3] = strArr4;
                                        int i1516 = (~(894572019 | i68)) | (-939212796) | (~(934882248 | i68));
                                        int i1517 = (-1300916596) + (((~(i | (-890241473))) | i1516) * 590) + (i1516 * (-1180)) + (((~((-934882249) | i68)) | (~((-894572020) | i68))) * 590);
                                        int i1518 = -(-((((i1514 & i1515) | (i1514 ^ i1515)) >> 31) & 16));
                                        int i1519 = i2 + (i1517 & i1518) + (i1518 | i1517);
                                        int i169 = i1519 ^ (i1519 << 13);
                                        int i1610 = i169 ^ (i169 >>> 17);
                                        int i1611 = i1610 << 5;
                                        iArr5[0] = (i1610 | i1611) & (~(i1610 & i1611));
                                        return objArr14;
                                    } catch (Throwable th3) {
                                        fileReader3.close();
                                        bufferedReader3.close();
                                        throw th3;
                                    }
                                }
                                int i170 = d;
                                int i171 = ((i170 | 7) << 1) - (i170 ^ 7);
                                int i172 = i171 % 128;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i172;
                                if (i171 % 2 != 0) {
                                    throw null;
                                }
                                int i173 = (i172 ^ 73) + ((i172 & 73) << 1);
                                d = i173 % 128;
                                if (i173 % 2 == 0) {
                                    int i174 = 5 / 5;
                                }
                                int i910 = -TextUtils.indexOf("", "", 0);
                                int i911 = i910 * (-665);
                                int i912 = (i911 ^ 42418) + ((i911 & 42418) << 1) + ((~i910) * (-333));
                                int i913 = ~i910;
                                int i914 = ~((i913 ^ i68) | (i913 & i68));
                                int i1010 = ~((i ^ 127) | (i & 127));
                                int i1011 = -(-(((i914 & i1010) | (i914 ^ i1010)) * 333));
                                int i1012 = ((i912 | i1011) << 1) - (i1011 ^ i912);
                                int i1013 = ~((i913 & i) | (i913 ^ i));
                                int i1014 = ~i;
                                int i1015 = ~((i1014 & 127) | (i1014 ^ 127));
                                int i1016 = -(-(((i1013 & i1015) | (i1013 ^ i1015)) * 333));
                                Object[] objArr15 = new Object[1];
                                a(null, null, (i1012 & i1016) + (i1016 | i1012), new byte[]{-114, -124, -106, -123, -112, -117, -124, -105, -124, -116, -112, -120, -115, -103, -109, -106, -124, -117, -120, -124, -107, -109, -126, -108, -126, -109, -116, -118, -120, -104, -109}, objArr15);
                                file = new File((String) objArr15[0]);
                                i18 = d + 125;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i18 % 128;
                                if (i18 % 2 == 0) {
                                    file.canRead();
                                    Object obj3 = null;
                                    obj3.hashCode();
                                    throw null;
                                }
                                if (!file.canRead()) {
                                    fileReader = new FileReader(file);
                                    bufferedReader = new BufferedReader(fileReader);
                                    String line4 = bufferedReader.readLine();
                                    int i1017 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                    int i1018 = i1017 * 567;
                                    int i1019 = (i1018 & (-71190)) + (i1018 | (-71190));
                                    int i1110 = ~i1017;
                                    int i1111 = ~((i1110 & 126) | (i1110 ^ 126));
                                    int i1112 = ~i1017;
                                    int i1113 = ~((i1112 ^ i) | (i1112 & i));
                                    int i1114 = ((i1111 & i1113) | (i1111 ^ i1113)) * (-566);
                                    int i1115 = ((((i1019 | i1114) << 1) - (i1114 ^ i1019)) - (~(-(-((~((i1017 & ComposerKt.defaultsKey) | ((-127) ^ i1017))) * 566))))) - 1;
                                    int i1116 = (i1112 ^ ComposerKt.defaultsKey) | ((-127) & i1112);
                                    int i1117 = (~((i1116 & i) | (i1116 ^ i))) * 566;
                                    Object[] objArr16 = new Object[1];
                                    a(null, null, (i1115 ^ i1117) + ((i1117 & i1115) << 1), new byte[]{-102}, objArr16);
                                    zEquals = line4.equals((String) objArr16[0]);
                                    fileReader.close();
                                    bufferedReader.close();
                                    if (zEquals) {
                                        Object[] objArr17 = new Object[1];
                                        a(null, null, 127 - (~(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))), new byte[]{-117, -118, -105, -121, -117, -127, -116, -112, -120, -115, -109, -121, -117, -127, -116, -112, -120, -115, -109, -121, -122, -123, -124, -114, -109, -106, -124, -117, -120, -124, -107, -109, -126, -108, -126, -109}, objArr17);
                                        file2 = new File((String) objArr17[0]);
                                        i19 = d + 101;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i19 % 128;
                                        if (i19 % 2 == 0) {
                                            file2.canRead();
                                            Object obj4 = null;
                                            obj4.hashCode();
                                            throw null;
                                        }
                                        if (file2.canRead()) {
                                            i25 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 109;
                                            d = i25 % 128;
                                            if (i25 % 2 == 0) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                        } else {
                                            fileReader2 = new FileReader(file2);
                                            bufferedReader2 = new BufferedReader(fileReader2);
                                            int i1118 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 29;
                                            d = i1118 % 128;
                                            int i1119 = i1118 % 2;
                                            String line5 = bufferedReader2.readLine();
                                            scrollBarFadeDuration = ViewConfiguration.getScrollBarFadeDuration() >> 16;
                                            int iB3 = onBackCompletedFallback.b();
                                            int i1210 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                            i20 = ((i1210 | 37) << 1) - (i1210 ^ 37);
                                            d = i20 % 128;
                                            if (i20 % 2 == 0) {
                                                i21 = (989 / scrollBarFadeDuration) >>> (-125349);
                                            } else {
                                                int i1211 = scrollBarFadeDuration * 989;
                                                i21 = ((i1211 | (-125349)) << 1) - (i1211 ^ (-125349));
                                            }
                                            int i1212 = (-128) | (~iB3);
                                            int i1213 = ~((i1212 & scrollBarFadeDuration) | (i1212 ^ scrollBarFadeDuration));
                                            int i1214 = scrollBarFadeDuration | 127;
                                            int i1215 = ~((i1214 & iB3) | (i1214 ^ iB3));
                                            i22 = 988 * ((i1213 & i1215) | (i1213 ^ i1215));
                                            i23 = (i1210 ^ 77) + ((i1210 & 77) << 1);
                                            d = i23 % 128;
                                            if (i23 % 2 == 0) {
                                                i24 = (i21 / i22) / ((-988) >> ((scrollBarFadeDuration ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (scrollBarFadeDuration & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT)));
                                            } else {
                                                int i1216 = -(-i22);
                                                int i1217 = (i21 & i1216) + (i1216 | i21);
                                                int i1218 = -(-((scrollBarFadeDuration | WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) * (-988)));
                                                i24 = (i1217 ^ i1218) + ((i1218 & i1217) << 1);
                                            }
                                            int i1219 = ~scrollBarFadeDuration;
                                            int i1311 = ~((i1219 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i1219 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                                            int i1312 = ~(((-128) ^ iB3) | ((-128) & iB3));
                                            int i1313 = (i1311 & i1312) | (i1311 ^ i1312);
                                            int i1314 = ~(scrollBarFadeDuration | (~iB3) | 127);
                                            int i1315 = -(-(988 * ((i1314 & i1313) | (i1313 ^ i1314))));
                                            Object[] objArr18 = new Object[1];
                                            a(null, null, (i24 & i1315) + (i1315 | i24), new byte[]{-102}, objArr18);
                                            boolean zEquals3 = line5.equals((String) objArr18[0]);
                                            fileReader2.close();
                                            bufferedReader2.close();
                                            z = zEquals3;
                                        }
                                        if (!z) {
                                        }
                                    }
                                    i9 = ((int[]) objArr[0])[0];
                                    int i1316 = ((~i89) & i) | (i89 & i68);
                                    i10 = i1316 | (-i1316);
                                    int i14110 = d;
                                    i11 = i14110 + 63;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                                    if (i11 % 2 != 0) {
                                        int i14111 = i10 >>> 31;
                                        int i14112 = (~i14111) & i9;
                                        int i14113 = i89 & i14111;
                                        i13 = (i14113 & i14112) | (i14112 ^ i14113);
                                        i12 = 1;
                                        strArr = (String[]) objArr[1];
                                        objArr2 = new Object[5];
                                    } else {
                                        i12 = 1;
                                        int i14114 = i10 >> 31;
                                        i13 = (i89 & i14114) | ((~i14114) & i9);
                                        strArr = (String[]) objArr[1];
                                        objArr2 = new Object[2];
                                    }
                                    i14 = ((i14110 | 107) << i12) - (i14110 ^ 107);
                                    int i14115 = i14 % 128;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i14115;
                                    if (i14 % 2 != 0) {
                                        int i14116 = (i9 & i68) | ((~i9) & i);
                                        int i14117 = -i14116;
                                        int i14118 = ((i14116 & i14117) | (i14116 ^ i14117)) >> 102;
                                        i15 = 1;
                                        i16 = (i14118 & 1) | ((~i14118) & 1);
                                        int i14119 = -i16;
                                        i17 = ((i14119 & i16) | (i16 ^ i14119)) % 86;
                                    } else {
                                        i15 = 1;
                                        int i15110 = i9 ^ i;
                                        i16 = ((i15110 | (-i15110)) >> 31) & 1;
                                        i17 = ((-i16) | i16) >> 31;
                                    }
                                    int i15111 = (~i17) & i15;
                                    objArr2[i16] = null;
                                    objArr2[i15111] = strArr;
                                    String[] strArr5 = (String[]) objArr2[0];
                                    Object[] objArr19 = new Object[4];
                                    int[] iArr7 = new int[i15];
                                    int i15112 = i14115 + 45;
                                    d = i15112 % 128;
                                    int i15113 = i15112 % 2;
                                    objArr19[0] = iArr7;
                                    int[] iArr8 = new int[i15];
                                    objArr19[i15] = iArr8;
                                    int[] iArr9 = new int[i15];
                                    objArr19[2] = iArr9;
                                    int i15114 = (~(i & i13)) & (i | i13);
                                    int i15115 = -i15114;
                                    iArr7[0] = i;
                                    iArr9[0] = i13;
                                    objArr19[3] = strArr5;
                                    int i15116 = (~(894572019 | i68)) | (-939212796) | (~(934882248 | i68));
                                    int i15117 = (-1300916596) + (((~(i | (-890241473))) | i15116) * 590) + (i15116 * (-1180)) + (((~((-934882249) | i68)) | (~((-894572020) | i68))) * 590);
                                    int i15118 = -(-((((i15114 & i15115) | (i15114 ^ i15115)) >> 31) & 16));
                                    int i15119 = i2 + (i15117 & i15118) + (i15118 | i15117);
                                    int i1612 = i15119 ^ (i15119 << 13);
                                    int i1613 = i1612 ^ (i1612 >>> 17);
                                    int i1614 = i1613 << 5;
                                    iArr8[0] = (i1613 | i1614) & (~(i1613 & i1614));
                                    return objArr19;
                                }
                                int i1615 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i1616 = (i1615 & 33) + (i1615 | 33);
                                d = i1616 % 128;
                                int i1617 = i1616 % 2;
                            } catch (Exception unused2) {
                            }
                        } catch (Exception unused3) {
                        }
                        line = null;
                        int i1618 = d;
                        int i1619 = (i1618 & 41) + (i1618 | 41);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1619 % 128;
                        int i1620 = i1619 % 2;
                        objArr = new Object[]{new int[]{i}, new String[0]};
                        i9 = ((int[]) objArr[0])[0];
                        int i1317 = ((~i89) & i) | (i89 & i68);
                        i10 = i1317 | (-i1317);
                        int i141110 = d;
                        i11 = i141110 + 63;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                        if (i11 % 2 != 0) {
                            int i141111 = i10 >>> 31;
                            int i141112 = (~i141111) & i9;
                            int i141113 = i89 & i141111;
                            i13 = (i141113 & i141112) | (i141112 ^ i141113);
                            i12 = 1;
                            strArr = (String[]) objArr[1];
                            objArr2 = new Object[5];
                        } else {
                            i12 = 1;
                            int i141114 = i10 >> 31;
                            i13 = (i89 & i141114) | ((~i141114) & i9);
                            strArr = (String[]) objArr[1];
                            objArr2 = new Object[2];
                        }
                        i14 = ((i141110 | 107) << i12) - (i141110 ^ 107);
                        int i141115 = i14 % 128;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i141115;
                        if (i14 % 2 != 0) {
                            int i141116 = (i9 & i68) | ((~i9) & i);
                            int i141117 = -i141116;
                            int i141118 = ((i141116 & i141117) | (i141116 ^ i141117)) >> 102;
                            i15 = 1;
                            i16 = (i141118 & 1) | ((~i141118) & 1);
                            int i141119 = -i16;
                            i17 = ((i141119 & i16) | (i16 ^ i141119)) % 86;
                        } else {
                            i15 = 1;
                            int i151110 = i9 ^ i;
                            i16 = ((i151110 | (-i151110)) >> 31) & 1;
                            i17 = ((-i16) | i16) >> 31;
                        }
                        int i151111 = (~i17) & i15;
                        objArr2[i16] = null;
                        objArr2[i151111] = strArr;
                        String[] strArr6 = (String[]) objArr2[0];
                        Object[] objArr110 = new Object[4];
                        int[] iArr10 = new int[i15];
                        int i151112 = i141115 + 45;
                        d = i151112 % 128;
                        int i151113 = i151112 % 2;
                        objArr110[0] = iArr10;
                        int[] iArr11 = new int[i15];
                        objArr110[i15] = iArr11;
                        int[] iArr12 = new int[i15];
                        objArr110[2] = iArr12;
                        int i151114 = (~(i & i13)) & (i | i13);
                        int i151115 = -i151114;
                        iArr10[0] = i;
                        iArr12[0] = i13;
                        objArr110[3] = strArr6;
                        int i151116 = (~(894572019 | i68)) | (-939212796) | (~(934882248 | i68));
                        int i151117 = (-1300916596) + (((~(i | (-890241473))) | i151116) * 590) + (i151116 * (-1180)) + (((~((-934882249) | i68)) | (~((-894572020) | i68))) * 590);
                        int i151118 = -(-((((i151114 & i151115) | (i151114 ^ i151115)) >> 31) & 16));
                        int i151119 = i2 + (i151117 & i151118) + (i151118 | i151117);
                        int i16110 = i151119 ^ (i151119 << 13);
                        int i16111 = i16110 ^ (i16110 >>> 17);
                        int i16112 = i16111 << 5;
                        iArr11[0] = (i16111 | i16112) & (~(i16111 & i16112));
                        return objArr110;
                    } catch (Throwable th4) {
                        Throwable cause = th4.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th4;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:10:0x0025  */
                /* JADX WARN: Code duplicated, block: B:8:0x001f  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static java.lang.String $$e(short r6, int r7, short r8) {
                    /*
                        int r7 = r7 * 3
                        int r7 = r7 + 4
                        int r6 = 68 - r6
                        int r8 = r8 * 4
                        int r0 = 1 - r8
                        byte[] r1 = com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.AnonymousClass6.$$c
                        byte[] r0 = new byte[r0]
                        r2 = 0
                        int r8 = 0 - r8
                        if (r1 != 0) goto L16
                        r3 = r7
                        r4 = r2
                        goto L2d
                    L16:
                        r3 = r2
                        r5 = r7
                        r7 = r6
                        r6 = r5
                    L1a:
                        byte r4 = (byte) r7
                        r0[r3] = r4
                        if (r3 != r8) goto L25
                        java.lang.String r6 = new java.lang.String
                        r6.<init>(r0, r2)
                        return r6
                    L25:
                        int r3 = r3 + 1
                        r4 = r1[r6]
                        r5 = r3
                        r3 = r6
                        r6 = r4
                        r4 = r5
                    L2d:
                        int r7 = r7 + r6
                        int r6 = r3 + 1
                        r3 = r4
                        goto L1a
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.AnonymousClass6.$$e(short, int, short):java.lang.String");
                }
            };
        }
        return this.preDrawListener;
    }

    MaterialShapeDrawable createShapeDrawable() {
        return new MaterialShapeDrawable((ShapeAppearanceModel) Preconditions.checkNotNull(this.shapeAppearance));
    }

    boolean isOrWillBeShown() {
        if (this.view.getVisibility() != 0) {
            return this.animState == 2;
        }
        return this.animState != 1;
    }

    boolean isOrWillBeHidden() {
        if (this.view.getVisibility() == 0) {
            return this.animState == 1;
        }
        return this.animState != 2;
    }

    private ValueAnimator createElevationAnimator(ShadowAnimatorImpl shadowAnimatorImpl) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(ELEVATION_ANIM_INTERPOLATOR);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(shadowAnimatorImpl);
        valueAnimator.addUpdateListener(shadowAnimatorImpl);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    abstract class ShadowAnimatorImpl extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        private float shadowSizeEnd;
        private float shadowSizeStart;
        private boolean validValues;

        protected abstract float getTargetShadowSize();

        private ShadowAnimatorImpl() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.validValues) {
                this.shadowSizeStart = FloatingActionButtonImpl.this.shapeDrawable == null ? 0.0f : FloatingActionButtonImpl.this.shapeDrawable.getElevation();
                this.shadowSizeEnd = getTargetShadowSize();
                this.validValues = true;
            }
            FloatingActionButtonImpl floatingActionButtonImpl = FloatingActionButtonImpl.this;
            float f = this.shadowSizeStart;
            floatingActionButtonImpl.updateShapeElevation((int) (f + ((this.shadowSizeEnd - f) * valueAnimator.getAnimatedFraction())));
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            FloatingActionButtonImpl.this.updateShapeElevation((int) this.shadowSizeEnd);
            this.validValues = false;
        }
    }

    class ResetElevationAnimation extends ShadowAnimatorImpl {
        ResetElevationAnimation() {
            super();
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl
        protected float getTargetShadowSize() {
            return FloatingActionButtonImpl.this.elevation;
        }
    }

    class ElevateToHoveredFocusedTranslationZAnimation extends ShadowAnimatorImpl {
        ElevateToHoveredFocusedTranslationZAnimation() {
            super();
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl
        protected float getTargetShadowSize() {
            return FloatingActionButtonImpl.this.elevation + FloatingActionButtonImpl.this.hoveredFocusedTranslationZ;
        }
    }

    class ElevateToPressedTranslationZAnimation extends ShadowAnimatorImpl {
        ElevateToPressedTranslationZAnimation() {
            super();
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl
        protected float getTargetShadowSize() {
            return FloatingActionButtonImpl.this.elevation + FloatingActionButtonImpl.this.pressedTranslationZ;
        }
    }

    class DisabledElevationAnimation extends ShadowAnimatorImpl {
        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl
        protected float getTargetShadowSize() {
            return 0.0f;
        }

        DisabledElevationAnimation() {
            super();
        }
    }

    private boolean shouldAnimateVisibilityChange() {
        return ViewCompat.isLaidOut(this.view) && !this.view.isInEditMode();
    }

    void updateFromViewRotation() {
        MaterialShapeDrawable materialShapeDrawable = this.shapeDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShadowCompatRotation((int) this.rotation);
        }
    }
}
