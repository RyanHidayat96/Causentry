package com.google.android.material.transition.platform;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ImageFormat;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.transition.ArcMotion;
import android.transition.PathMotion;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.initSession;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class MaterialContainerTransform extends Transition {
    private static final ProgressThresholdsGroup DEFAULT_RETURN_THRESHOLDS;
    private static final ProgressThresholdsGroup DEFAULT_RETURN_THRESHOLDS_ARC;
    private static final float ELEVATION_NOT_SET = -1.0f;
    public static final int FADE_MODE_CROSS = 2;
    public static final int FADE_MODE_IN = 0;
    public static final int FADE_MODE_OUT = 1;
    public static final int FADE_MODE_THROUGH = 3;
    public static final int FIT_MODE_AUTO = 0;
    public static final int FIT_MODE_HEIGHT = 2;
    public static final int FIT_MODE_WIDTH = 1;
    private static final String TAG = "MaterialContainerTransform";
    public static final int TRANSITION_DIRECTION_AUTO = 0;
    public static final int TRANSITION_DIRECTION_ENTER = 1;
    public static final int TRANSITION_DIRECTION_RETURN = 2;
    private boolean appliedThemeValues;
    private int containerColor;
    private boolean drawDebugEnabled;
    private int drawingViewId;
    private boolean elevationShadowEnabled;
    private int endContainerColor;
    private float endElevation;
    private ShapeAppearanceModel endShapeAppearanceModel;
    private View endView;
    private int endViewId;
    private int fadeMode;
    private ProgressThresholds fadeProgressThresholds;
    private int fitMode;
    private boolean holdAtEndEnabled;
    private boolean pathMotionCustom;
    private ProgressThresholds scaleMaskProgressThresholds;
    private ProgressThresholds scaleProgressThresholds;
    private int scrimColor;
    private ProgressThresholds shapeMaskProgressThresholds;
    private int startContainerColor;
    private float startElevation;
    private ShapeAppearanceModel startShapeAppearanceModel;
    private View startView;
    private int startViewId;
    private int transitionDirection;
    private static final String PROP_BOUNDS = "materialContainerTransition:bounds";
    private static final String PROP_SHAPE_APPEARANCE = "materialContainerTransition:shapeAppearance";
    private static final String[] TRANSITION_PROPS = {PROP_BOUNDS, PROP_SHAPE_APPEARANCE};
    private static final ProgressThresholdsGroup DEFAULT_ENTER_THRESHOLDS = new ProgressThresholdsGroup(new ProgressThresholds(0.0f, 0.25f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 0.75f));
    private static final ProgressThresholdsGroup DEFAULT_ENTER_THRESHOLDS_ARC = new ProgressThresholdsGroup(new ProgressThresholds(0.1f, 0.4f), new ProgressThresholds(0.1f, 1.0f), new ProgressThresholds(0.1f, 1.0f), new ProgressThresholds(0.1f, 0.9f));

    /* JADX INFO: loaded from: classes5.dex */
    @Retention(RetentionPolicy.SOURCE)
    public @interface FadeMode {
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Retention(RetentionPolicy.SOURCE)
    public @interface FitMode {
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Retention(RetentionPolicy.SOURCE)
    public @interface TransitionDirection {
    }

    static {
        DEFAULT_RETURN_THRESHOLDS = new ProgressThresholdsGroup(new ProgressThresholds(0.6f, 0.9f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.3f, 0.9f));
        DEFAULT_RETURN_THRESHOLDS_ARC = new ProgressThresholdsGroup(new ProgressThresholds(0.6f, 0.9f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.2f, 0.9f));
    }

    public MaterialContainerTransform() {
        this.drawDebugEnabled = false;
        this.holdAtEndEnabled = false;
        this.pathMotionCustom = false;
        this.appliedThemeValues = false;
        this.drawingViewId = R.id.content;
        this.startViewId = -1;
        this.endViewId = -1;
        this.containerColor = 0;
        this.startContainerColor = 0;
        this.endContainerColor = 0;
        this.scrimColor = 1375731712;
        this.transitionDirection = 0;
        this.fadeMode = 0;
        this.fitMode = 0;
        this.elevationShadowEnabled = Build.VERSION.SDK_INT >= 28;
        this.startElevation = -1.0f;
        this.endElevation = -1.0f;
    }

    public MaterialContainerTransform(Context context, boolean z) {
        this.drawDebugEnabled = false;
        this.holdAtEndEnabled = false;
        this.pathMotionCustom = false;
        this.appliedThemeValues = false;
        this.drawingViewId = R.id.content;
        this.startViewId = -1;
        this.endViewId = -1;
        this.containerColor = 0;
        this.startContainerColor = 0;
        this.endContainerColor = 0;
        this.scrimColor = 1375731712;
        this.transitionDirection = 0;
        this.fadeMode = 0;
        this.fitMode = 0;
        this.elevationShadowEnabled = Build.VERSION.SDK_INT >= 28;
        this.startElevation = -1.0f;
        this.endElevation = -1.0f;
        maybeApplyThemeValues(context, z);
        this.appliedThemeValues = true;
    }

    public final int getStartViewId() {
        return this.startViewId;
    }

    public final void setStartViewId(int i) {
        this.startViewId = i;
    }

    public final int getEndViewId() {
        return this.endViewId;
    }

    public final void setEndViewId(int i) {
        this.endViewId = i;
    }

    public final View getStartView() {
        return this.startView;
    }

    public final void setStartView(View view) {
        this.startView = view;
    }

    public final View getEndView() {
        return this.endView;
    }

    public final void setEndView(View view) {
        this.endView = view;
    }

    public final ShapeAppearanceModel getStartShapeAppearanceModel() {
        return this.startShapeAppearanceModel;
    }

    public final void setStartShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        this.startShapeAppearanceModel = shapeAppearanceModel;
    }

    public final ShapeAppearanceModel getEndShapeAppearanceModel() {
        return this.endShapeAppearanceModel;
    }

    public final void setEndShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        this.endShapeAppearanceModel = shapeAppearanceModel;
    }

    public final boolean isElevationShadowEnabled() {
        return this.elevationShadowEnabled;
    }

    public final void setElevationShadowEnabled(boolean z) {
        this.elevationShadowEnabled = z;
    }

    public final float getStartElevation() {
        return this.startElevation;
    }

    public final void setStartElevation(float f) {
        this.startElevation = f;
    }

    public final float getEndElevation() {
        return this.endElevation;
    }

    public final void setEndElevation(float f) {
        this.endElevation = f;
    }

    public final int getDrawingViewId() {
        return this.drawingViewId;
    }

    public final void setDrawingViewId(int i) {
        this.drawingViewId = i;
    }

    public final int getContainerColor() {
        return this.containerColor;
    }

    public final void setContainerColor(int i) {
        this.containerColor = i;
    }

    public final int getStartContainerColor() {
        return this.startContainerColor;
    }

    public final void setStartContainerColor(int i) {
        this.startContainerColor = i;
    }

    public final int getEndContainerColor() {
        return this.endContainerColor;
    }

    public final void setEndContainerColor(int i) {
        this.endContainerColor = i;
    }

    public final void setAllContainerColors(int i) {
        this.containerColor = i;
        this.startContainerColor = i;
        this.endContainerColor = i;
    }

    public final int getScrimColor() {
        return this.scrimColor;
    }

    public final void setScrimColor(int i) {
        this.scrimColor = i;
    }

    public final int getTransitionDirection() {
        return this.transitionDirection;
    }

    public final void setTransitionDirection(int i) {
        this.transitionDirection = i;
    }

    public final int getFadeMode() {
        return this.fadeMode;
    }

    public final void setFadeMode(int i) {
        this.fadeMode = i;
    }

    public final int getFitMode() {
        return this.fitMode;
    }

    public final void setFitMode(int i) {
        this.fitMode = i;
    }

    public final ProgressThresholds getFadeProgressThresholds() {
        return this.fadeProgressThresholds;
    }

    public final void setFadeProgressThresholds(ProgressThresholds progressThresholds) {
        this.fadeProgressThresholds = progressThresholds;
    }

    public final ProgressThresholds getScaleProgressThresholds() {
        return this.scaleProgressThresholds;
    }

    public final void setScaleProgressThresholds(ProgressThresholds progressThresholds) {
        this.scaleProgressThresholds = progressThresholds;
    }

    public final ProgressThresholds getScaleMaskProgressThresholds() {
        return this.scaleMaskProgressThresholds;
    }

    public final void setScaleMaskProgressThresholds(ProgressThresholds progressThresholds) {
        this.scaleMaskProgressThresholds = progressThresholds;
    }

    public final ProgressThresholds getShapeMaskProgressThresholds() {
        return this.shapeMaskProgressThresholds;
    }

    public final void setShapeMaskProgressThresholds(ProgressThresholds progressThresholds) {
        this.shapeMaskProgressThresholds = progressThresholds;
    }

    public final boolean isHoldAtEndEnabled() {
        return this.holdAtEndEnabled;
    }

    public final void setHoldAtEndEnabled(boolean z) {
        this.holdAtEndEnabled = z;
    }

    public final boolean isDrawDebugEnabled() {
        return this.drawDebugEnabled;
    }

    public final void setDrawDebugEnabled(boolean z) {
        this.drawDebugEnabled = z;
    }

    @Override // android.transition.Transition
    public final void setPathMotion(PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.pathMotionCustom = true;
    }

    @Override // android.transition.Transition
    public final String[] getTransitionProperties() {
        return TRANSITION_PROPS;
    }

    @Override // android.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        captureValues(transitionValues, this.startView, this.startViewId, this.startShapeAppearanceModel);
    }

    @Override // android.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        captureValues(transitionValues, this.endView, this.endViewId, this.endShapeAppearanceModel);
    }

    private static void captureValues(TransitionValues transitionValues, View view, int i, ShapeAppearanceModel shapeAppearanceModel) {
        if (i != -1) {
            transitionValues.view = TransitionUtils.findDescendantOrAncestorById(transitionValues.view, i);
        } else if (view != null) {
            transitionValues.view = view;
        } else if (transitionValues.view.getTag(com.google.android.material.R.id.mtrl_motion_snapshot_view) instanceof View) {
            View view2 = (View) transitionValues.view.getTag(com.google.android.material.R.id.mtrl_motion_snapshot_view);
            transitionValues.view.setTag(com.google.android.material.R.id.mtrl_motion_snapshot_view, null);
            transitionValues.view = view2;
        }
        View view3 = transitionValues.view;
        if (!ViewCompat.isLaidOut(view3) && view3.getWidth() == 0 && view3.getHeight() == 0) {
            return;
        }
        RectF relativeBounds = view3.getParent() == null ? TransitionUtils.getRelativeBounds(view3) : TransitionUtils.getLocationOnScreen(view3);
        transitionValues.values.put(PROP_BOUNDS, relativeBounds);
        transitionValues.values.put(PROP_SHAPE_APPEARANCE, captureShapeAppearance(view3, relativeBounds, shapeAppearanceModel));
    }

    private static ShapeAppearanceModel captureShapeAppearance(View view, RectF rectF, ShapeAppearanceModel shapeAppearanceModel) {
        return TransitionUtils.convertToRelativeCornerSizes(getShapeAppearance(view, shapeAppearanceModel), rectF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static ShapeAppearanceModel getShapeAppearance(View view, ShapeAppearanceModel shapeAppearanceModel) {
        if (shapeAppearanceModel != null) {
            return shapeAppearanceModel;
        }
        if (view.getTag(com.google.android.material.R.id.mtrl_motion_snapshot_view) instanceof ShapeAppearanceModel) {
            return (ShapeAppearanceModel) view.getTag(com.google.android.material.R.id.mtrl_motion_snapshot_view);
        }
        Context context = view.getContext();
        int transitionShapeAppearanceResId = getTransitionShapeAppearanceResId(context);
        if (transitionShapeAppearanceResId != -1) {
            return ShapeAppearanceModel.builder(context, transitionShapeAppearanceResId, 0).build();
        }
        if (view instanceof Shapeable) {
            return ((Shapeable) view).getShapeAppearanceModel();
        }
        return ShapeAppearanceModel.builder().build();
    }

    private static int getTransitionShapeAppearanceResId(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{com.google.android.material.R.attr.transitionShapeAppearance});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    @Override // android.transition.Transition
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        final View viewFindAncestorById;
        View view;
        if (transitionValues != null && transitionValues2 != null) {
            RectF rectF = (RectF) transitionValues.values.get(PROP_BOUNDS);
            ShapeAppearanceModel shapeAppearanceModel = (ShapeAppearanceModel) transitionValues.values.get(PROP_SHAPE_APPEARANCE);
            if (rectF != null && shapeAppearanceModel != null) {
                RectF rectF2 = (RectF) transitionValues2.values.get(PROP_BOUNDS);
                ShapeAppearanceModel shapeAppearanceModel2 = (ShapeAppearanceModel) transitionValues2.values.get(PROP_SHAPE_APPEARANCE);
                if (rectF2 != null && shapeAppearanceModel2 != null) {
                    final View view2 = transitionValues.view;
                    final View view3 = transitionValues2.view;
                    View view4 = view3.getParent() != null ? view3 : view2;
                    if (this.drawingViewId == view4.getId()) {
                        viewFindAncestorById = (View) view4.getParent();
                        view = view4;
                    } else {
                        viewFindAncestorById = TransitionUtils.findAncestorById(view4, this.drawingViewId);
                        view = null;
                    }
                    RectF locationOnScreen = TransitionUtils.getLocationOnScreen(viewFindAncestorById);
                    float f = -locationOnScreen.left;
                    float f2 = -locationOnScreen.top;
                    RectF rectFCalculateDrawableBounds = calculateDrawableBounds(viewFindAncestorById, view, f, f2);
                    rectF.offset(f, f2);
                    rectF2.offset(f, f2);
                    boolean zIsEntering = isEntering(rectF, rectF2);
                    if (!this.appliedThemeValues) {
                        maybeApplyThemeValues(view4.getContext(), zIsEntering);
                    }
                    final TransitionDrawable transitionDrawable = new TransitionDrawable(getPathMotion(), view2, rectF, shapeAppearanceModel, getElevationOrDefault(this.startElevation, view2), view3, rectF2, shapeAppearanceModel2, getElevationOrDefault(this.endElevation, view3), this.containerColor, this.startContainerColor, this.endContainerColor, this.scrimColor, zIsEntering, this.elevationShadowEnabled, FadeModeEvaluators.get(this.fadeMode, zIsEntering), FitModeEvaluators.get(this.fitMode, zIsEntering, rectF, rectF2), buildThresholdsGroup(zIsEntering), this.drawDebugEnabled);
                    transitionDrawable.setBounds(Math.round(rectFCalculateDrawableBounds.left), Math.round(rectFCalculateDrawableBounds.top), Math.round(rectFCalculateDrawableBounds.right), Math.round(rectFCalculateDrawableBounds.bottom));
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.transition.platform.MaterialContainerTransform.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            transitionDrawable.setProgress(valueAnimator.getAnimatedFraction());
                        }
                    });
                    addListener(new TransitionListenerAdapter() { // from class: com.google.android.material.transition.platform.MaterialContainerTransform.2
                        @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
                        public void onTransitionStart(Transition transition) {
                            ViewUtils.getOverlay(viewFindAncestorById).add(transitionDrawable);
                            view2.setAlpha(0.0f);
                            view3.setAlpha(0.0f);
                        }

                        @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
                        public void onTransitionEnd(Transition transition) {
                            MaterialContainerTransform.this.removeListener(this);
                            if (MaterialContainerTransform.this.holdAtEndEnabled) {
                                return;
                            }
                            view2.setAlpha(1.0f);
                            view3.setAlpha(1.0f);
                            ViewUtils.getOverlay(viewFindAncestorById).remove(transitionDrawable);
                        }
                    });
                    return valueAnimatorOfFloat;
                }
            }
        }
        return null;
    }

    private void maybeApplyThemeValues(Context context, boolean z) {
        TransitionUtils.maybeApplyThemeInterpolator(this, context, com.google.android.material.R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
        TransitionUtils.maybeApplyThemeDuration(this, context, z ? com.google.android.material.R.attr.motionDurationLong2 : com.google.android.material.R.attr.motionDurationMedium4);
        if (this.pathMotionCustom) {
            return;
        }
        TransitionUtils.maybeApplyThemePath(this, context, com.google.android.material.R.attr.motionPath);
    }

    private static float getElevationOrDefault(float f, View view) {
        return f != -1.0f ? f : ViewCompat.getElevation(view);
    }

    private static RectF calculateDrawableBounds(View view, View view2, float f, float f2) {
        if (view2 != null) {
            RectF locationOnScreen = TransitionUtils.getLocationOnScreen(view2);
            locationOnScreen.offset(f, f2);
            return locationOnScreen;
        }
        return new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
    }

    private boolean isEntering(RectF rectF, RectF rectF2) {
        int i = this.transitionDirection;
        if (i == 0) {
            return TransitionUtils.calculateArea(rectF2) > TransitionUtils.calculateArea(rectF);
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        StringBuilder sb = new StringBuilder("Invalid transition direction: ");
        sb.append(this.transitionDirection);
        throw new IllegalArgumentException(sb.toString());
    }

    private ProgressThresholdsGroup buildThresholdsGroup(boolean z) {
        PathMotion pathMotion = getPathMotion();
        if ((pathMotion instanceof ArcMotion) || (pathMotion instanceof MaterialArcMotion)) {
            return getThresholdsOrDefault(z, DEFAULT_ENTER_THRESHOLDS_ARC, DEFAULT_RETURN_THRESHOLDS_ARC);
        }
        return getThresholdsOrDefault(z, DEFAULT_ENTER_THRESHOLDS, DEFAULT_RETURN_THRESHOLDS);
    }

    private ProgressThresholdsGroup getThresholdsOrDefault(boolean z, ProgressThresholdsGroup progressThresholdsGroup, ProgressThresholdsGroup progressThresholdsGroup2) {
        if (!z) {
            progressThresholdsGroup = progressThresholdsGroup2;
        }
        return new ProgressThresholdsGroup((ProgressThresholds) TransitionUtils.defaultIfNull(this.fadeProgressThresholds, progressThresholdsGroup.fade), (ProgressThresholds) TransitionUtils.defaultIfNull(this.scaleProgressThresholds, progressThresholdsGroup.scale), (ProgressThresholds) TransitionUtils.defaultIfNull(this.scaleMaskProgressThresholds, progressThresholdsGroup.scaleMask), (ProgressThresholds) TransitionUtils.defaultIfNull(this.shapeMaskProgressThresholds, progressThresholdsGroup.shapeMask));
    }

    static final class TransitionDrawable extends Drawable {
        private static final int COMPAT_SHADOW_COLOR = -7829368;
        private static final int SHADOW_COLOR = 754974720;
        private static final float SHADOW_DX_MULTIPLIER_ADJUSTMENT = 0.3f;
        private static final float SHADOW_DY_MULTIPLIER_ADJUSTMENT = 1.5f;
        private final MaterialShapeDrawable compatShadowDrawable;
        private final Paint containerPaint;
        private float currentElevation;
        private float currentElevationDy;
        private final RectF currentEndBounds;
        private final RectF currentEndBoundsMasked;
        private RectF currentMaskBounds;
        private final RectF currentStartBounds;
        private final RectF currentStartBoundsMasked;
        private final Paint debugPaint;
        private final Path debugPath;
        private final float displayHeight;
        private final float displayWidth;
        private final boolean drawDebugEnabled;
        private final boolean elevationShadowEnabled;
        private final RectF endBounds;
        private final Paint endContainerPaint;
        private final float endElevation;
        private final ShapeAppearanceModel endShapeAppearanceModel;
        private final View endView;
        private final boolean entering;
        private final FadeModeEvaluator fadeModeEvaluator;
        private FadeModeResult fadeModeResult;
        private final FitModeEvaluator fitModeEvaluator;
        private FitModeResult fitModeResult;
        private final MaskEvaluator maskEvaluator;
        private final float motionPathLength;
        private final PathMeasure motionPathMeasure;
        private final float[] motionPathPosition;
        private float progress;
        private final ProgressThresholdsGroup progressThresholds;
        private final Paint scrimPaint;
        private final Paint shadowPaint;
        private final RectF startBounds;
        private final Paint startContainerPaint;
        private final float startElevation;
        private final ShapeAppearanceModel startShapeAppearanceModel;
        private final View startView;

        @Override // android.graphics.drawable.Drawable
        public final int getOpacity() {
            return -3;
        }

        private TransitionDrawable(PathMotion pathMotion, View view, RectF rectF, ShapeAppearanceModel shapeAppearanceModel, float f, View view2, RectF rectF2, ShapeAppearanceModel shapeAppearanceModel2, float f2, int i, int i2, int i3, int i4, boolean z, boolean z2, FadeModeEvaluator fadeModeEvaluator, FitModeEvaluator fitModeEvaluator, ProgressThresholdsGroup progressThresholdsGroup, boolean z3) {
            Paint paint = new Paint();
            this.containerPaint = paint;
            Paint paint2 = new Paint();
            this.startContainerPaint = paint2;
            Paint paint3 = new Paint();
            this.endContainerPaint = paint3;
            this.shadowPaint = new Paint();
            Paint paint4 = new Paint();
            this.scrimPaint = paint4;
            this.maskEvaluator = new MaskEvaluator();
            this.motionPathPosition = new float[]{rectF.centerX(), rectF.top};
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            this.compatShadowDrawable = materialShapeDrawable;
            Paint paint5 = new Paint();
            this.debugPaint = paint5;
            this.debugPath = new Path();
            this.startView = view;
            this.startBounds = rectF;
            this.startShapeAppearanceModel = shapeAppearanceModel;
            this.startElevation = f;
            this.endView = view2;
            this.endBounds = rectF2;
            this.endShapeAppearanceModel = shapeAppearanceModel2;
            this.endElevation = f2;
            this.entering = z;
            this.elevationShadowEnabled = z2;
            this.fadeModeEvaluator = fadeModeEvaluator;
            this.fitModeEvaluator = fitModeEvaluator;
            this.progressThresholds = progressThresholdsGroup;
            this.drawDebugEnabled = z3;
            WindowManager windowManager = (WindowManager) view.getContext().getSystemService("window");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            this.displayWidth = displayMetrics.widthPixels;
            this.displayHeight = displayMetrics.heightPixels;
            paint.setColor(i);
            paint2.setColor(i2);
            paint3.setColor(i3);
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(0));
            materialShapeDrawable.setShadowCompatibilityMode(2);
            materialShapeDrawable.setShadowBitmapDrawingEnable(false);
            materialShapeDrawable.setShadowColor(COMPAT_SHADOW_COLOR);
            RectF rectF3 = new RectF(rectF);
            this.currentStartBounds = rectF3;
            this.currentStartBoundsMasked = new RectF(rectF3);
            RectF rectF4 = new RectF(rectF3);
            this.currentEndBounds = rectF4;
            this.currentEndBoundsMasked = new RectF(rectF4);
            PointF motionPathPoint = getMotionPathPoint(rectF);
            PointF motionPathPoint2 = getMotionPathPoint(rectF2);
            PathMeasure pathMeasure = new PathMeasure(pathMotion.getPath(motionPathPoint.x, motionPathPoint.y, motionPathPoint2.x, motionPathPoint2.y), false);
            this.motionPathMeasure = pathMeasure;
            this.motionPathLength = pathMeasure.getLength();
            paint4.setStyle(Paint.Style.FILL);
            paint4.setShader(TransitionUtils.createColorShader(i4));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            updateProgress(0.0f);
        }

        @Override // android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            if (this.scrimPaint.getAlpha() > 0) {
                canvas.drawRect(getBounds(), this.scrimPaint);
            }
            int iSave = this.drawDebugEnabled ? canvas.save() : -1;
            if (this.elevationShadowEnabled && this.currentElevation > 0.0f) {
                drawElevationShadow(canvas);
            }
            this.maskEvaluator.clip(canvas);
            maybeDrawContainerColor(canvas, this.containerPaint);
            if (this.fadeModeResult.endOnTop) {
                drawStartView(canvas);
                drawEndView(canvas);
            } else {
                drawEndView(canvas);
                drawStartView(canvas);
            }
            if (this.drawDebugEnabled) {
                canvas.restoreToCount(iSave);
                drawDebugCumulativePath(canvas, this.currentStartBounds, this.debugPath, -65281);
                drawDebugRect(canvas, this.currentStartBoundsMasked, -256);
                drawDebugRect(canvas, this.currentStartBounds, -16711936);
                drawDebugRect(canvas, this.currentEndBoundsMasked, -16711681);
                drawDebugRect(canvas, this.currentEndBounds, -16776961);
            }
        }

        private void drawElevationShadow(Canvas canvas) {
            canvas.save();
            canvas.clipPath(this.maskEvaluator.getPath(), Region.Op.DIFFERENCE);
            if (Build.VERSION.SDK_INT > 28) {
                drawElevationShadowWithPaintShadowLayer(canvas);
            } else {
                drawElevationShadowWithMaterialShapeDrawable(canvas);
            }
            canvas.restore();
        }

        private void drawElevationShadowWithPaintShadowLayer(Canvas canvas) {
            ShapeAppearanceModel currentShapeAppearanceModel = this.maskEvaluator.getCurrentShapeAppearanceModel();
            if (currentShapeAppearanceModel.isRoundRect(this.currentMaskBounds)) {
                float cornerSize = currentShapeAppearanceModel.getTopLeftCornerSize().getCornerSize(this.currentMaskBounds);
                canvas.drawRoundRect(this.currentMaskBounds, cornerSize, cornerSize, this.shadowPaint);
            } else {
                canvas.drawPath(this.maskEvaluator.getPath(), this.shadowPaint);
            }
        }

        private void drawElevationShadowWithMaterialShapeDrawable(Canvas canvas) {
            this.compatShadowDrawable.setBounds((int) this.currentMaskBounds.left, (int) this.currentMaskBounds.top, (int) this.currentMaskBounds.right, (int) this.currentMaskBounds.bottom);
            this.compatShadowDrawable.setElevation(this.currentElevation);
            this.compatShadowDrawable.setShadowVerticalOffset((int) this.currentElevationDy);
            this.compatShadowDrawable.setShapeAppearanceModel(this.maskEvaluator.getCurrentShapeAppearanceModel());
            this.compatShadowDrawable.draw(canvas);
        }

        private void drawStartView(Canvas canvas) {
            maybeDrawContainerColor(canvas, this.startContainerPaint);
            TransitionUtils.transform(canvas, getBounds(), this.currentStartBounds.left, this.currentStartBounds.top, this.fitModeResult.startScale, this.fadeModeResult.startAlpha, new CanvasCompat.CanvasOperation() { // from class: com.google.android.material.transition.platform.MaterialContainerTransform.TransitionDrawable.1
                private static final byte[] $$c = {99, -43, -44, -62};
                private static final int $$f = 64;
                private static int $10 = 0;
                private static int $11 = 1;
                private static final byte[] $$d = {49, -45, -112, 57, 3, -26, 37, -48, -21, -8, -7, 0, -35, 33, -45, 0, -12, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
                private static final int $$e = 11;
                private static final byte[] $$a = {117, 50, 102, 124, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
                private static final int $$b = 196;
                private static int b = 0;
                private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                private static int[] TuitionPaymentFragmentbindingInflater1 = {-89027906, 522206951, 1448219522, 305318464, 1226988967, 330111563, -1551504315, -872910227, -617754342, -271609493, -1938688887, -1132496069, 666323871, -1763145601, -1480607603, 693662743, 309214442, -316278461};

                /* JADX WARN: Code duplicated, block: B:10:0x0026  */
                /* JADX WARN: Code duplicated, block: B:8:0x001e  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static void a(byte r5, int r6, byte r7, java.lang.Object[] r8) {
                    /*
                        int r7 = r7 * 52
                        int r7 = 108 - r7
                        int r5 = r5 * 15
                        int r0 = r5 + 38
                        int r6 = r6 * 2
                        int r6 = 84 - r6
                        byte[] r1 = com.google.android.material.transition.platform.MaterialContainerTransform.TransitionDrawable.AnonymousClass1.$$a
                        byte[] r0 = new byte[r0]
                        int r5 = r5 + 37
                        r2 = 0
                        if (r1 != 0) goto L18
                        r4 = r5
                        r3 = r2
                        goto L2a
                    L18:
                        r3 = r2
                    L19:
                        byte r4 = (byte) r6
                        r0[r3] = r4
                        if (r3 != r5) goto L26
                        java.lang.String r5 = new java.lang.String
                        r5.<init>(r0, r2)
                        r8[r2] = r5
                        return
                    L26:
                        int r3 = r3 + 1
                        r4 = r1[r7]
                    L2a:
                        int r6 = r6 + r4
                        int r7 = r7 + 1
                        int r6 = r6 + (-11)
                        goto L19
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transition.platform.MaterialContainerTransform.TransitionDrawable.AnonymousClass1.a(byte, int, byte, java.lang.Object[]):void");
                }

                /* JADX WARN: Code duplicated, block: B:10:0x002b  */
                /* JADX WARN: Code duplicated, block: B:8:0x0022  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0031). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static void d(byte r5, short r6, byte r7, java.lang.Object[] r8) {
                    /*
                        int r7 = r7 * 13
                        int r7 = r7 + 4
                        int r5 = r5 * 39
                        int r0 = 53 - r5
                        byte[] r1 = com.google.android.material.transition.platform.MaterialContainerTransform.TransitionDrawable.AnonymousClass1.$$d
                        int r6 = r6 * 31
                        int r6 = r6 + 84
                        byte[] r0 = new byte[r0]
                        int r5 = 52 - r5
                        r2 = -1
                        if (r1 != 0) goto L18
                        r3 = r2
                        r2 = r7
                        goto L31
                    L18:
                        r4 = r7
                        r7 = r6
                        r6 = r4
                    L1b:
                        int r2 = r2 + 1
                        byte r3 = (byte) r7
                        r0[r2] = r3
                        if (r2 != r5) goto L2b
                        java.lang.String r5 = new java.lang.String
                        r6 = 0
                        r5.<init>(r0, r6)
                        r8[r6] = r5
                        return
                    L2b:
                        r3 = r1[r6]
                        r4 = r2
                        r2 = r6
                        r6 = r3
                        r3 = r4
                    L31:
                        int r6 = -r6
                        int r7 = r7 + r6
                        int r6 = r2 + 1
                        int r7 = r7 + (-11)
                        r2 = r3
                        goto L1b
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transition.platform.MaterialContainerTransform.TransitionDrawable.AnonymousClass1.d(byte, short, byte, java.lang.Object[]):void");
                }

                private static void c(int[] iArr, int i, Object[] objArr) throws Throwable {
                    int length;
                    int[] iArr2;
                    int i2;
                    int i3 = 2 % 2;
                    SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length * 2];
                    int[] iArr3 = TuitionPaymentFragmentbindingInflater1;
                    int i4 = -1870535734;
                    int i5 = 1;
                    int i6 = 0;
                    if (iArr3 != null) {
                        int i7 = $11 + 109;
                        $10 = i7 % 128;
                        if (i7 % 2 != 0) {
                            length = iArr3.length;
                            iArr2 = new int[length];
                            i2 = 1;
                        } else {
                            length = iArr3.length;
                            iArr2 = new int[length];
                            i2 = 0;
                        }
                        while (i2 < length) {
                            try {
                                Object[] objArr2 = new Object[1];
                                objArr2[i6] = Integer.valueOf(iArr3[i2]);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    byte b2 = (byte) 1;
                                    byte b3 = (byte) (b2 - 1);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), View.MeasureSpec.getMode(i6) + 3291, TextUtils.getOffsetAfter("", i6) + 31, 1948206109, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                                }
                                iArr2[i2] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                                i2++;
                                i4 = -1870535734;
                                i6 = 0;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        iArr3 = iArr2;
                    }
                    int length2 = iArr3.length;
                    int[] iArr4 = new int[length2];
                    int[] iArr5 = TuitionPaymentFragmentbindingInflater1;
                    if (iArr5 != null) {
                        int length3 = iArr5.length;
                        int[] iArr6 = new int[length3];
                        int i8 = 0;
                        while (i8 < length3) {
                            Object[] objArr3 = new Object[i5];
                            objArr3[0] = Integer.valueOf(iArr5[i8]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b4 = (byte) i5;
                                byte b5 = (byte) (b4 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) KeyEvent.getDeadChar(0, 0), 3291 - (ViewConfiguration.getEdgeSlop() >> 16), TextUtils.lastIndexOf("", '0') + 32, 1948206109, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                            }
                            iArr6[i8] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                            i8++;
                            iArr5 = iArr5;
                            i5 = 1;
                        }
                        iArr5 = iArr6;
                    }
                    char c = 0;
                    System.arraycopy(iArr5, 0, iArr4, 0, length2);
                    sessionConfigValidatingBuilder.b = 2;
                    while (sessionConfigValidatingBuilder.b < iArr.length) {
                        cArr[c] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
                        cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
                        cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
                        cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
                        for (int i9 = 17; i9 > 1; i9--) {
                            int i10 = $11 + 9;
                            $10 = i10 % 128;
                            int i11 = i10 % 2;
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i9];
                            Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = b6;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), 2559 - ExpandableListView.getPackedPositionGroup(0L), TextUtils.getOffsetAfter("", 0) + 29, 683220507, false, $$g(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                        }
                        int i12 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12;
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                        int i13 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        Object[] objArr5 = {sessionConfigValidatingBuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (28879 - (ViewConfiguration.getFadingEdgeLength() >> 16)), ExpandableListView.getPackedPositionType(0L) + 348, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 24, -30507727, false, "G", new Class[]{Object.class});
                        }
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
                        cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
                        cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                        cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
                        cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
                        cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
                        cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
                        cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
                        sessionConfigValidatingBuilder.b += 2;
                        int i14 = $10 + 61;
                        $11 = i14 % 128;
                        int i15 = i14 % 2;
                        c = 0;
                    }
                    objArr[0] = new String(cArr2, 0, i);
                }

                @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
                public void run(Canvas canvas2) throws Throwable {
                    Object[] objArr;
                    char c;
                    int i = 2 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 2268;
                        int fadingEdgeLength = 33 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        byte[] bArr = $$a;
                        Object[] objArr2 = new Object[1];
                        a(bArr[132], bArr[7], bArr[37], objArr2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, modifierMetaStateMask, fadingEdgeLength, -887667012, false, (String) objArr2[0], null);
                    }
                    long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                    Object[] objArr3 = new Object[1];
                    c(new int[]{440488818, -946494476, 1266450357, 378191637, 51701461, 1508414371, -1497750203, 10903141, -1072257485, 307241158, -1318223569, 1155827395, -852041671, 1365500406}, TextUtils.indexOf("", "") + 22, objArr3);
                    Class<?> cls = Class.forName((String) objArr3[0]);
                    Object[] objArr4 = new Object[1];
                    c(new int[]{-785113758, -2050182619, 1879200775, -392393562, 1378681225, -2019858193, -311530171, -792558173, -1184724979, 1822184147}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 14, objArr4);
                    long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 2267;
                        int offsetAfter = TextUtils.getOffsetAfter("", 0) + 33;
                        byte[] bArr2 = $$a;
                        byte b2 = bArr2[132];
                        Object[] objArr5 = new Object[1];
                        a(b2, bArr2[7], b2, objArr5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maximumFlingVelocity, scrollBarSize, offsetAfter, -874156483, false, (String) objArr5[0], null);
                    }
                    if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                            int offsetAfter2 = TextUtils.getOffsetAfter("", 0) + 2267;
                            int iAxisFromString = 32 - MotionEvent.axisFromString("");
                            byte b3 = $$a[7];
                            byte b4 = b3;
                            Object[] objArr6 = new Object[1];
                            a(b3, b4, b4, objArr6);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveOpacity, offsetAfter2, iAxisFromString, -654680577, false, (String) objArr6[0], null);
                        }
                        Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                        objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                        int i2 = ((int[]) objArr7[0])[0];
                        int i3 = ((int[]) objArr7[3])[0];
                        String[] strArr = (String[]) objArr7[1];
                        int i4 = ~System.identityHashCode(this);
                        int i5 = (-1965648581) + (((~(i4 | (-35844))) | (~((-134443025) | i4))) * (-184)) + ((337117224 | (~((-471560249) | i4)) | (~((-337153068) | i4))) * 184) + 1645479209;
                        int i6 = (i5 << 13) ^ i5;
                        int i7 = i6 ^ (i6 >>> 17);
                        ((int[]) objArr[2])[0] = i7 ^ (i7 << 5);
                        int i8 = b + 123;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
                        int i9 = i8 % 2;
                        c = 3;
                    } else {
                        Object[] objArr8 = new Object[1];
                        c(new int[]{-345637158, -2074300510, -543123918, -1133595720, 871360336, 1589855481, 488630112, -1359301850, 194437126, 1222343590, -1525145857, -1906267891, -680699776, 707410315, 673514965, 144607919}, (ViewConfiguration.getPressedStateDuration() >> 16) + 26, objArr8);
                        Class<?> cls2 = Class.forName((String) objArr8[0]);
                        Object[] objArr9 = new Object[1];
                        c(new int[]{1565160082, -1429261326, -1578201464, 1821287400, 1983963926, 1122674943, -1122496816, -1349313452, 164271860, 401637454, 260483255, -541556615}, ImageFormat.getBitsPerPixel(0) + 19, objArr9);
                        Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                        if (applicationContext != null) {
                            int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
                            b = i10 % 128;
                            int i11 = i10 % 2;
                            if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                                applicationContext = null;
                            } else {
                                applicationContext = applicationContext.getApplicationContext();
                                int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
                                b = i12 % 128;
                                int i13 = i12 % 2;
                            }
                        }
                        Object[] objArr10 = new Object[1];
                        c(new int[]{13302845, 1333766683, -733485438, -611876527, -1647996132, 1570439636, 1057786492, 1848536366, -143500970, -1881090821}, 16 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr10);
                        Class<?> cls3 = Class.forName((String) objArr10[0]);
                        Object[] objArr11 = new Object[1];
                        c(new int[]{-533687319, -468472455, -447785944, -686539412, 1853474923, 355229975, 987002562, 1676496047, 819638572, -1480905779}, 16 - TextUtils.getCapsMode("", 0, 0), objArr11);
                        try {
                            Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 771144385};
                            byte[] bArr3 = $$d;
                            byte b5 = bArr3[18];
                            Object[] objArr13 = new Object[1];
                            d(b5, b5, bArr3[11], objArr13);
                            Class<?> cls4 = Class.forName((String) objArr13[0]);
                            byte b6 = bArr3[11];
                            Object[] objArr14 = new Object[1];
                            d(b6, b6, bArr3[18], objArr14);
                            Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                            if (applicationContext != null) {
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    char c2 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                    int iMyPid = (Process.myPid() >> 22) + 2267;
                                    int i14 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33;
                                    byte b7 = $$a[7];
                                    byte b8 = b7;
                                    Object[] objArr16 = new Object[1];
                                    a(b7, b8, b8, objArr16);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, iMyPid, i14, -654680577, false, (String) objArr16[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                                try {
                                    Object[] objArr17 = new Object[1];
                                    c(new int[]{440488818, -946494476, 1266450357, 378191637, 51701461, 1508414371, -1497750203, 10903141, -1072257485, 307241158, -1318223569, 1155827395, -852041671, 1365500406}, 22 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr17);
                                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                                    Object[] objArr18 = new Object[1];
                                    c(new int[]{-785113758, -2050182619, 1879200775, -392393562, 1378681225, -2019858193, -311530171, -792558173, -1184724979, 1822184147}, 15 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr18);
                                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                    Long lValueOf = Long.valueOf(jLongValue2);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                        char cResolveSize = (char) View.resolveSize(0, 0);
                                        int size = 2267 - View.MeasureSpec.getSize(0);
                                        int minimumFlingVelocity = 33 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                        byte[] bArr4 = $$a;
                                        byte b9 = bArr4[132];
                                        Object[] objArr19 = new Object[1];
                                        a(b9, bArr4[7], b9, objArr19);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveSize, size, minimumFlingVelocity, -874156483, false, (String) objArr19[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                        char c3 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
                                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 2268;
                                        int i15 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 33;
                                        byte[] bArr5 = $$a;
                                        Object[] objArr20 = new Object[1];
                                        a(bArr5[132], bArr5[7], bArr5[37], objArr20);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, iLastIndexOf, i15, -887667012, false, (String) objArr20[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                                } catch (Exception unused) {
                                    throw new RuntimeException();
                                }
                            }
                            objArr = objArr15;
                            c = 3;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    int i16 = ((int[]) objArr[c])[0];
                    int i17 = ((int[]) objArr[0])[0];
                    if (i17 == i16) {
                        Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
                        int i18 = ((int[]) objArr[2])[0];
                        int i19 = ((int[]) objArr[0])[0];
                        int i20 = ((int[]) objArr[3])[0];
                        String[] strArr2 = (String[]) objArr[1];
                        int iMyUid = Process.myUid();
                        int i21 = ~iMyUid;
                        int i22 = i18 + 1086459611 + (((~((-589073786) | i21)) | 570982673) * 98) + (((~(i21 | (-219639531))) | (-589073786) | (~(219639530 | iMyUid))) * (-49)) + (((~(iMyUid | (-589073786))) | (-790622204)) * 49);
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
                        Toast.makeText((Context) null, i17 / (((i17 - 1) * i17) % 2), 0).show();
                        Object[] objArr22 = {new int[]{i}, strArr, new int[1], new int[]{i}};
                        int i25 = ((int[]) objArr[2])[0];
                        int i26 = ((int[]) objArr[0])[0];
                        int i27 = ((int[]) objArr[3])[0];
                        String[] strArr4 = (String[]) objArr[1];
                        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                        int i28 = i25 + 986123104 + (((~((~iElapsedRealtime) | (-867336976))) | (-58623660)) * (-235)) + (((~((-867336976) | iElapsedRealtime)) | (-58623660)) * (-470)) + (((~(iElapsedRealtime | (-53641740))) | (-872318896)) * 235);
                        int i29 = (i28 << 13) ^ i28;
                        int i30 = i29 ^ (i29 >>> 17);
                        ((int[]) objArr22[2])[0] = i30 ^ (i30 << 5);
                        int i31 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
                        b = i31 % 128;
                        int i32 = i31 % 2;
                    }
                    TransitionDrawable.this.startView.draw(canvas2);
                }

                /* JADX WARN: Code duplicated, block: B:10:0x0028  */
                /* JADX WARN: Code duplicated, block: B:8:0x0022  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static java.lang.String $$g(short r6, byte r7, byte r8) {
                    /*
                        int r8 = r8 * 3
                        int r8 = 4 - r8
                        int r7 = r7 * 2
                        int r0 = r7 + 1
                        byte[] r1 = com.google.android.material.transition.platform.MaterialContainerTransform.TransitionDrawable.AnonymousClass1.$$c
                        int r6 = r6 * 56
                        int r6 = 122 - r6
                        byte[] r0 = new byte[r0]
                        r2 = 0
                        if (r1 != 0) goto L17
                        r3 = r7
                        r6 = r8
                        r4 = r2
                        goto L2a
                    L17:
                        r3 = r2
                        r5 = r8
                        r8 = r6
                        r6 = r5
                    L1b:
                        byte r4 = (byte) r8
                        r0[r3] = r4
                        int r4 = r3 + 1
                        if (r3 != r7) goto L28
                        java.lang.String r6 = new java.lang.String
                        r6.<init>(r0, r2)
                        return r6
                    L28:
                        r3 = r1[r6]
                    L2a:
                        int r3 = -r3
                        int r8 = r8 + r3
                        int r6 = r6 + 1
                        r3 = r4
                        goto L1b
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transition.platform.MaterialContainerTransform.TransitionDrawable.AnonymousClass1.$$g(short, byte, byte):java.lang.String");
                }
            });
        }

        private void drawEndView(Canvas canvas) {
            maybeDrawContainerColor(canvas, this.endContainerPaint);
            TransitionUtils.transform(canvas, getBounds(), this.currentEndBounds.left, this.currentEndBounds.top, this.fitModeResult.endScale, this.fadeModeResult.endAlpha, new CanvasCompat.CanvasOperation() { // from class: com.google.android.material.transition.platform.MaterialContainerTransform.TransitionDrawable.2
                @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
                public void run(Canvas canvas2) {
                    TransitionDrawable.this.endView.draw(canvas2);
                }
            });
        }

        private void maybeDrawContainerColor(Canvas canvas, Paint paint) {
            if (paint.getColor() == 0 || paint.getAlpha() <= 0) {
                return;
            }
            canvas.drawRect(getBounds(), paint);
        }

        @Override // android.graphics.drawable.Drawable
        public final void setAlpha(int i) {
            throw new UnsupportedOperationException("Setting alpha on is not supported");
        }

        @Override // android.graphics.drawable.Drawable
        public final void setColorFilter(ColorFilter colorFilter) {
            throw new UnsupportedOperationException("Setting a color filter is not supported");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProgress(float f) {
            if (this.progress != f) {
                updateProgress(f);
            }
        }

        private void updateProgress(float f) {
            float f2;
            float f3;
            this.progress = f;
            this.scrimPaint.setAlpha((int) (this.entering ? TransitionUtils.lerp(0.0f, 255.0f, f) : TransitionUtils.lerp(255.0f, 0.0f, f)));
            this.motionPathMeasure.getPosTan(this.motionPathLength * f, this.motionPathPosition, null);
            float[] fArr = this.motionPathPosition;
            float f4 = fArr[0];
            float f5 = fArr[1];
            if (f > 1.0f || f < 0.0f) {
                if (f > 1.0f) {
                    f3 = (f - 1.0f) / 0.00999999f;
                    f2 = 0.99f;
                } else {
                    f2 = 0.01f;
                    f3 = (f / 0.01f) * (-1.0f);
                }
                this.motionPathMeasure.getPosTan(this.motionPathLength * f2, fArr, null);
                float[] fArr2 = this.motionPathPosition;
                f4 += (f4 - fArr2[0]) * f3;
                f5 += (f5 - fArr2[1]) * f3;
            }
            float f6 = f4;
            float f7 = f5;
            FitModeResult fitModeResultEvaluate = this.fitModeEvaluator.evaluate(f, ((Float) Preconditions.checkNotNull(Float.valueOf(this.progressThresholds.scale.start))).floatValue(), ((Float) Preconditions.checkNotNull(Float.valueOf(this.progressThresholds.scale.end))).floatValue(), this.startBounds.width(), this.startBounds.height(), this.endBounds.width(), this.endBounds.height());
            this.fitModeResult = fitModeResultEvaluate;
            this.currentStartBounds.set(f6 - (fitModeResultEvaluate.currentStartWidth / 2.0f), f7, (this.fitModeResult.currentStartWidth / 2.0f) + f6, this.fitModeResult.currentStartHeight + f7);
            this.currentEndBounds.set(f6 - (this.fitModeResult.currentEndWidth / 2.0f), f7, f6 + (this.fitModeResult.currentEndWidth / 2.0f), this.fitModeResult.currentEndHeight + f7);
            this.currentStartBoundsMasked.set(this.currentStartBounds);
            this.currentEndBoundsMasked.set(this.currentEndBounds);
            float fFloatValue = ((Float) Preconditions.checkNotNull(Float.valueOf(this.progressThresholds.scaleMask.start))).floatValue();
            float fFloatValue2 = ((Float) Preconditions.checkNotNull(Float.valueOf(this.progressThresholds.scaleMask.end))).floatValue();
            boolean zShouldMaskStartBounds = this.fitModeEvaluator.shouldMaskStartBounds(this.fitModeResult);
            RectF rectF = zShouldMaskStartBounds ? this.currentStartBoundsMasked : this.currentEndBoundsMasked;
            float fLerp = TransitionUtils.lerp(0.0f, 1.0f, fFloatValue, fFloatValue2, f);
            if (!zShouldMaskStartBounds) {
                fLerp = 1.0f - fLerp;
            }
            this.fitModeEvaluator.applyMask(rectF, fLerp, this.fitModeResult);
            this.currentMaskBounds = new RectF(Math.min(this.currentStartBoundsMasked.left, this.currentEndBoundsMasked.left), Math.min(this.currentStartBoundsMasked.top, this.currentEndBoundsMasked.top), Math.max(this.currentStartBoundsMasked.right, this.currentEndBoundsMasked.right), Math.max(this.currentStartBoundsMasked.bottom, this.currentEndBoundsMasked.bottom));
            this.maskEvaluator.evaluate(f, this.startShapeAppearanceModel, this.endShapeAppearanceModel, this.currentStartBounds, this.currentStartBoundsMasked, this.currentEndBoundsMasked, this.progressThresholds.shapeMask);
            this.currentElevation = TransitionUtils.lerp(this.startElevation, this.endElevation, f);
            float fCalculateElevationDxMultiplier = calculateElevationDxMultiplier(this.currentMaskBounds, this.displayWidth);
            float fCalculateElevationDyMultiplier = calculateElevationDyMultiplier(this.currentMaskBounds, this.displayHeight);
            float f8 = this.currentElevation;
            float f9 = (int) (fCalculateElevationDyMultiplier * f8);
            this.currentElevationDy = f9;
            this.shadowPaint.setShadowLayer(f8, (int) (fCalculateElevationDxMultiplier * f8), f9, SHADOW_COLOR);
            this.fadeModeResult = this.fadeModeEvaluator.evaluate(f, ((Float) Preconditions.checkNotNull(Float.valueOf(this.progressThresholds.fade.start))).floatValue(), ((Float) Preconditions.checkNotNull(Float.valueOf(this.progressThresholds.fade.end))).floatValue(), 0.35f);
            if (this.startContainerPaint.getColor() != 0) {
                this.startContainerPaint.setAlpha(this.fadeModeResult.startAlpha);
            }
            if (this.endContainerPaint.getColor() != 0) {
                this.endContainerPaint.setAlpha(this.fadeModeResult.endAlpha);
            }
            invalidateSelf();
        }

        private static PointF getMotionPathPoint(RectF rectF) {
            return new PointF(rectF.centerX(), rectF.top);
        }

        private static float calculateElevationDxMultiplier(RectF rectF, float f) {
            return ((rectF.centerX() / (f / 2.0f)) - 1.0f) * SHADOW_DX_MULTIPLIER_ADJUSTMENT;
        }

        private static float calculateElevationDyMultiplier(RectF rectF, float f) {
            return (rectF.centerY() / f) * SHADOW_DY_MULTIPLIER_ADJUSTMENT;
        }

        private void drawDebugCumulativePath(Canvas canvas, RectF rectF, Path path, int i) {
            PointF motionPathPoint = getMotionPathPoint(rectF);
            if (this.progress == 0.0f) {
                path.reset();
                path.moveTo(motionPathPoint.x, motionPathPoint.y);
            } else {
                path.lineTo(motionPathPoint.x, motionPathPoint.y);
                this.debugPaint.setColor(i);
                canvas.drawPath(path, this.debugPaint);
            }
        }

        private void drawDebugRect(Canvas canvas, RectF rectF, int i) {
            this.debugPaint.setColor(i);
            canvas.drawRect(rectF, this.debugPaint);
        }
    }

    public static class ProgressThresholds {
        private final float end;
        private final float start;

        public ProgressThresholds(float f, float f2) {
            this.start = f;
            this.end = f2;
        }

        public float getStart() {
            return this.start;
        }

        public float getEnd() {
            return this.end;
        }
    }

    static class ProgressThresholdsGroup {
        private final ProgressThresholds fade;
        private final ProgressThresholds scale;
        private final ProgressThresholds scaleMask;
        private final ProgressThresholds shapeMask;

        private ProgressThresholdsGroup(ProgressThresholds progressThresholds, ProgressThresholds progressThresholds2, ProgressThresholds progressThresholds3, ProgressThresholds progressThresholds4) {
            this.fade = progressThresholds;
            this.scale = progressThresholds2;
            this.scaleMask = progressThresholds3;
            this.shapeMask = progressThresholds4;
        }
    }
}
