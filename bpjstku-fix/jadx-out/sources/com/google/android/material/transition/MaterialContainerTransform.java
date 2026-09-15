package com.google.android.material.transition;

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
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ExpandableListView;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import androidx.transition.ArcMotion;
import androidx.transition.PathMotion;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class MaterialContainerTransform extends Transition {
    private static final ProgressThresholdsGroup DEFAULT_ENTER_THRESHOLDS;
    private static final ProgressThresholdsGroup DEFAULT_ENTER_THRESHOLDS_ARC;
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
    private static final String PROP_BOUNDS = "materialContainerTransition:bounds";
    private static final String PROP_SHAPE_APPEARANCE = "materialContainerTransition:shapeAppearance";
    private static final String TAG = "MaterialContainerTransform";
    public static final int TRANSITION_DIRECTION_AUTO = 0;
    public static final int TRANSITION_DIRECTION_ENTER = 1;
    public static final int TRANSITION_DIRECTION_RETURN = 2;
    private static final String[] TRANSITION_PROPS;
    private static char TuitionPaymentFragmentbindingInflater1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int asBinder;
    private static char b;
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
    private static final byte[] $$c = {39, 27, 2, 54};
    private static final int $$f = 182;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {0, -94, -62, -97, 15, 1, -60, 78, -21, 14, -8, 16, 9, -8, 13, -66, 74, -15, 18, 0, 4, -63, 74, 2, -8, 6, -59, 23, 42, 14, -4, -9, 18, -33, 38, -11, 6, -12, 34, -8, 6, 10, 15, 1, -60, 60, 11, 3, -5, 8, -4, -52, 54, 16, -7, 17, 0, -3, -2, -51, 66, -9, 22, -12, 16, -6, -5, 14, -59, 56, 15, 0, 6, 6, -65, 74, 2, -8, 6, 0, 14, -8, -1, 17, -66, 38, 39, -17, 16, 9, -8, 20, -18, 16, -24, 33, -78, 34, 50, -10, -1, 22, -12, -32, 48, 12, -16, 17, -30, 22, 17, 5, -6, 11};
    private static final int $$e = 201;
    private static final byte[] $$a = {97, 58, 103, -72, -28, 32, -47, -16, 5, -23, 2, -5, -12, -12, -28, 39, -49, -15, 0, -11, -23, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 147;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f812a = 0;
    private static int g = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;

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

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 84
            byte[] r0 = com.google.android.material.transition.MaterialContainerTransform.$$a
            int r6 = 73 - r6
            int r1 = 53 - r8
            byte[] r1 = new byte[r1]
            int r8 = 52 - r8
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r4 = r2
            r7 = r6
            goto L28
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L28:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-10)
            int r7 = r7 + 1
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transition.MaterialContainerTransform.c(int, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(byte r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 + 98
            int r6 = r6 * 2
            int r0 = 73 - r6
            int r5 = r5 * 38
            int r5 = 41 - r5
            byte[] r1 = com.google.android.material.transition.MaterialContainerTransform.$$d
            byte[] r0 = new byte[r0]
            int r6 = 72 - r6
            r2 = 0
            if (r1 != 0) goto L16
            r4 = r6
            r3 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L24:
            int r5 = r5 + 1
            int r3 = r3 + 1
            r4 = r1[r5]
        L2a:
            int r7 = r7 + r4
            int r7 = r7 + (-3)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transition.MaterialContainerTransform.e(byte, short, int, java.lang.Object[]):void");
    }

    static /* synthetic */ boolean access$300(MaterialContainerTransform materialContainerTransform) {
        int i = 2 % 2;
        int i2 = g + 99;
        int i3 = i2 % 128;
        f812a = i3;
        int i4 = i2 % 2;
        boolean z = materialContainerTransform.holdAtEndEnabled;
        int i5 = i3 + 67;
        g = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    private static void d(char[] cArr, int i, Object[] objArr) throws Throwable {
        CharSequence charSequence;
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i3 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            char c = 1;
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i4 = $10 + 69;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 58224;
            int i7 = 0;
            while (i7 < 16) {
                int i8 = $10 + 101;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                char c2 = cArr3[c];
                char c3 = cArr3[i3];
                int i10 = (c3 + i6) ^ ((c3 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 8611973335120459638L)));
                int i11 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(b);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[c] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        charSequence = "";
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf(charSequence, '0', i3) + 47774);
                        int iIndexOf = TextUtils.indexOf(charSequence, '0', i3) + 469;
                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 13;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, iIndexOf, maximumDrawingCacheSize, -2007001706, false, "o", clsArr);
                    } else {
                        charSequence = "";
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[c] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.getCapsMode(charSequence, 0, 0) + 47773), TextUtils.getTrimmedLength(charSequence) + 468, 13 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    c = 1;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] ^ cArr3[1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b2 = (byte) 0;
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 2323 - TextUtils.indexOf("", ""), TextUtils.getOffsetAfter("", 0) + 44, -1312321721, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    static {
        asBinder = 1;
        TuitionPaymentFragmentbindingInflater1();
        TRANSITION_PROPS = new String[]{PROP_BOUNDS, PROP_SHAPE_APPEARANCE};
        DEFAULT_ENTER_THRESHOLDS = new ProgressThresholdsGroup(new ProgressThresholds(0.0f, 0.25f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 0.75f));
        DEFAULT_RETURN_THRESHOLDS = new ProgressThresholdsGroup(new ProgressThresholds(0.6f, 0.9f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.3f, 0.9f));
        DEFAULT_ENTER_THRESHOLDS_ARC = new ProgressThresholdsGroup(new ProgressThresholds(0.1f, 0.4f), new ProgressThresholds(0.1f, 1.0f), new ProgressThresholds(0.1f, 1.0f), new ProgressThresholds(0.1f, 0.9f));
        DEFAULT_RETURN_THRESHOLDS_ARC = new ProgressThresholdsGroup(new ProgressThresholds(0.6f, 0.9f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.2f, 0.9f));
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    public MaterialContainerTransform() {
        boolean z = false;
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
        if (Build.VERSION.SDK_INT >= 28) {
            int i = g + 19;
            f812a = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
            z = true;
        }
        this.elevationShadowEnabled = z;
        this.startElevation = -1.0f;
        this.endElevation = -1.0f;
        int i4 = g + 53;
        f812a = i4 % 128;
        int i5 = i4 % 2;
    }

    public MaterialContainerTransform(Context context, boolean z) {
        boolean z2 = false;
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
        if (Build.VERSION.SDK_INT >= 28) {
            int i = g + 41;
            f812a = i % 128;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
            z2 = true;
        }
        this.elevationShadowEnabled = z2;
        this.startElevation = -1.0f;
        this.endElevation = -1.0f;
        maybeApplyThemeValues(context, z);
        this.appliedThemeValues = true;
        int i3 = g + 19;
        f812a = i3 % 128;
        int i4 = i3 % 2;
    }

    public final int getStartViewId() {
        int i = 2 % 2;
        int i2 = f812a + 103;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        int i5 = this.startViewId;
        int i6 = i3 + 55;
        f812a = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final void setStartViewId(int i) {
        int i2 = 2 % 2;
        int i3 = f812a + 27;
        int i4 = i3 % 128;
        g = i4;
        int i5 = i3 % 2;
        this.startViewId = i;
        int i6 = i4 + 41;
        f812a = i6 % 128;
        int i7 = i6 % 2;
    }

    public final int getEndViewId() {
        int i = 2 % 2;
        int i2 = g + 39;
        f812a = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.endViewId;
        if (i3 != 0) {
            int i5 = 82 / 0;
        }
        return i4;
    }

    public final void setEndViewId(int i) {
        int i2 = 2 % 2;
        int i3 = f812a + 49;
        int i4 = i3 % 128;
        g = i4;
        int i5 = i3 % 2;
        this.endViewId = i;
        int i6 = i4 + 83;
        f812a = i6 % 128;
        int i7 = i6 % 2;
    }

    public final View getStartView() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 25;
        f812a = i3 % 128;
        int i4 = i3 % 2;
        View view = this.startView;
        int i5 = i2 + 51;
        f812a = i5 % 128;
        int i6 = i5 % 2;
        return view;
    }

    public final void setStartView(View view) {
        int i = 2 % 2;
        int i2 = f812a + 17;
        g = i2 % 128;
        int i3 = i2 % 2;
        this.startView = view;
        if (i3 == 0) {
            throw null;
        }
    }

    public final View getEndView() {
        int i = 2 % 2;
        int i2 = f812a + 115;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return this.endView;
        }
        throw null;
    }

    public final void setEndView(View view) {
        int i = 2 % 2;
        int i2 = f812a + 3;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        this.endView = view;
        int i5 = i3 + 83;
        f812a = i5 % 128;
        int i6 = i5 % 2;
    }

    public final ShapeAppearanceModel getStartShapeAppearanceModel() {
        int i = 2 % 2;
        int i2 = g + 5;
        int i3 = i2 % 128;
        f812a = i3;
        int i4 = i2 % 2;
        ShapeAppearanceModel shapeAppearanceModel = this.startShapeAppearanceModel;
        int i5 = i3 + 87;
        g = i5 % 128;
        int i6 = i5 % 2;
        return shapeAppearanceModel;
    }

    public final void setStartShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        int i = 2 % 2;
        int i2 = g + 5;
        f812a = i2 % 128;
        int i3 = i2 % 2;
        this.startShapeAppearanceModel = shapeAppearanceModel;
        if (i3 != 0) {
            int i4 = 39 / 0;
        }
    }

    public final ShapeAppearanceModel getEndShapeAppearanceModel() {
        int i = 2 % 2;
        int i2 = f812a + 51;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        ShapeAppearanceModel shapeAppearanceModel = this.endShapeAppearanceModel;
        int i5 = i3 + 65;
        f812a = i5 % 128;
        if (i5 % 2 == 0) {
            return shapeAppearanceModel;
        }
        throw null;
    }

    public final void setEndShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        int i = 2 % 2;
        int i2 = f812a;
        int i3 = i2 + 85;
        g = i3 % 128;
        int i4 = i3 % 2;
        this.endShapeAppearanceModel = shapeAppearanceModel;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 27;
        g = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 66 / 0;
        }
    }

    public final boolean isElevationShadowEnabled() {
        int i = 2 % 2;
        int i2 = f812a + 35;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        boolean z = this.elevationShadowEnabled;
        int i5 = i3 + 73;
        f812a = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final void setElevationShadowEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = f812a;
        int i3 = i2 + 91;
        g = i3 % 128;
        int i4 = i3 % 2;
        this.elevationShadowEnabled = z;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 91;
        g = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 42 / 0;
        }
    }

    public final float getStartElevation() {
        int i = 2 % 2;
        int i2 = f812a;
        int i3 = i2 + 125;
        g = i3 % 128;
        int i4 = i3 % 2;
        float f = this.startElevation;
        int i5 = i2 + 13;
        g = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final void setStartElevation(float f) {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 97;
        f812a = i3 % 128;
        int i4 = i3 % 2;
        this.startElevation = f;
        int i5 = i2 + 19;
        f812a = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final float getEndElevation() {
        int i = 2 % 2;
        int i2 = g + 121;
        f812a = i2 % 128;
        if (i2 % 2 == 0) {
            return this.endElevation;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setEndElevation(float f) {
        int i = 2 % 2;
        int i2 = f812a + 87;
        g = i2 % 128;
        int i3 = i2 % 2;
        this.endElevation = f;
        if (i3 == 0) {
            throw null;
        }
    }

    public final int getDrawingViewId() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 83;
        f812a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.drawingViewId;
        int i6 = i2 + 73;
        f812a = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setDrawingViewId(int i) {
        int i2 = 2 % 2;
        int i3 = g + 107;
        f812a = i3 % 128;
        int i4 = i3 % 2;
        this.drawingViewId = i;
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getContainerColor() {
        int i = 2 % 2;
        int i2 = f812a + 57;
        g = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.containerColor;
        if (i3 == 0) {
            int i5 = 84 / 0;
        }
        return i4;
    }

    public final void setContainerColor(int i) {
        int i2 = 2 % 2;
        int i3 = f812a + 51;
        g = i3 % 128;
        int i4 = i3 % 2;
        this.containerColor = i;
        if (i4 == 0) {
            int i5 = 31 / 0;
        }
    }

    public final int getStartContainerColor() {
        int i = 2 % 2;
        int i2 = f812a;
        int i3 = i2 + 9;
        g = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.startContainerColor;
        int i6 = i2 + 49;
        g = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 51 / 0;
        }
        return i5;
    }

    public final void setStartContainerColor(int i) {
        int i2 = 2 % 2;
        int i3 = f812a;
        int i4 = i3 + 33;
        g = i4 % 128;
        int i5 = i4 % 2;
        this.startContainerColor = i;
        if (i5 == 0) {
            throw null;
        }
        int i6 = i3 + 73;
        g = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 30 / 0;
        }
    }

    public final int getEndContainerColor() {
        int i = 2 % 2;
        int i2 = g + 15;
        int i3 = i2 % 128;
        f812a = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.endContainerColor;
        int i5 = i3 + 107;
        g = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final void setEndContainerColor(int i) {
        int i2 = 2 % 2;
        int i3 = f812a + 23;
        int i4 = i3 % 128;
        g = i4;
        int i5 = i3 % 2;
        this.endContainerColor = i;
        int i6 = i4 + 33;
        f812a = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setAllContainerColors(int i) {
        int i2 = 2 % 2;
        int i3 = f812a;
        int i4 = i3 + 13;
        g = i4 % 128;
        int i5 = i4 % 2;
        this.containerColor = i;
        this.startContainerColor = i;
        this.endContainerColor = i;
        int i6 = i3 + 99;
        g = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 91 / 0;
        }
    }

    public final int getScrimColor() {
        int i = 2 % 2;
        int i2 = f812a + 123;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        int i5 = this.scrimColor;
        int i6 = i3 + 57;
        f812a = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final void setScrimColor(int i) {
        int i2 = 2 % 2;
        int i3 = g + 23;
        int i4 = i3 % 128;
        f812a = i4;
        int i5 = i3 % 2;
        this.scrimColor = i;
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i4 + 7;
        g = i6 % 128;
        int i7 = i6 % 2;
    }

    public final int getTransitionDirection() {
        int i = 2 % 2;
        int i2 = f812a;
        int i3 = i2 + 123;
        g = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.transitionDirection;
        int i6 = i2 + 51;
        g = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final void setTransitionDirection(int i) {
        int i2 = 2 % 2;
        int i3 = f812a;
        int i4 = i3 + 109;
        g = i4 % 128;
        int i5 = i4 % 2;
        this.transitionDirection = i;
        int i6 = i3 + 45;
        g = i6 % 128;
        int i7 = i6 % 2;
    }

    public final int getFadeMode() {
        int i = 2 % 2;
        int i2 = g + 51;
        int i3 = i2 % 128;
        f812a = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.fadeMode;
        int i5 = i3 + 81;
        g = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final void setFadeMode(int i) {
        int i2 = 2 % 2;
        int i3 = g;
        int i4 = i3 + 47;
        f812a = i4 % 128;
        int i5 = i4 % 2;
        this.fadeMode = i;
        int i6 = i3 + 63;
        f812a = i6 % 128;
        int i7 = i6 % 2;
    }

    public final int getFitMode() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 101;
        f812a = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.fitMode;
        int i5 = i2 + 121;
        f812a = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final void setFitMode(int i) {
        int i2 = 2 % 2;
        int i3 = g + 11;
        f812a = i3 % 128;
        int i4 = i3 % 2;
        this.fitMode = i;
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ProgressThresholds getFadeProgressThresholds() {
        int i = 2 % 2;
        int i2 = f812a;
        int i3 = i2 + 49;
        g = i3 % 128;
        int i4 = i3 % 2;
        ProgressThresholds progressThresholds = this.fadeProgressThresholds;
        int i5 = i2 + 21;
        g = i5 % 128;
        int i6 = i5 % 2;
        return progressThresholds;
    }

    public final void setFadeProgressThresholds(ProgressThresholds progressThresholds) {
        int i = 2 % 2;
        int i2 = f812a;
        int i3 = i2 + 29;
        g = i3 % 128;
        int i4 = i3 % 2;
        this.fadeProgressThresholds = progressThresholds;
        if (i4 == 0) {
            int i5 = 13 / 0;
        }
        int i6 = i2 + 89;
        g = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 21 / 0;
        }
    }

    public final ProgressThresholds getScaleProgressThresholds() {
        ProgressThresholds progressThresholds;
        int i = 2 % 2;
        int i2 = f812a;
        int i3 = i2 + 125;
        g = i3 % 128;
        if (i3 % 2 == 0) {
            progressThresholds = this.scaleProgressThresholds;
            int i4 = 17 / 0;
        } else {
            progressThresholds = this.scaleProgressThresholds;
        }
        int i5 = i2 + 123;
        g = i5 % 128;
        int i6 = i5 % 2;
        return progressThresholds;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0201  */
    public final void setScaleProgressThresholds(ProgressThresholds progressThresholds) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cMyPid = (char) (31533 - (Process.myPid() >> 22));
            int i2 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 920;
            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 28;
            byte b2 = (byte) 52;
            Object[] objArr2 = new Object[1];
            c(b2, (byte) 14, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyPid, i2, packedPositionType, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        d(new char[]{58893, 18358, 38595, 53600, 22264, 57982, 19423, 37512, 40615, 25909, 3880, 13908, 32010, 31989, 29540, 34761, 18670, 30838, 11186, 21600, 18423, 38353, 35358, 35957}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 21, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        d(new char[]{43757, 51044, 26621, 6189, 7438, 37632, 35319, 4783, 6693, 15667, 42247, 9244, 49011, 50753, 19670, 15967, 7739, 1717}, Color.red(0) + 15, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char keyRepeatDelay = (char) (31533 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 921;
            int i3 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28;
            byte b3 = $$a[18];
            Object[] objArr5 = new Object[1];
            c((byte) 52, b3, b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(keyRepeatDelay, maximumFlingVelocity, i3, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = f812a + 9;
            g = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 31533);
                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 921;
                int gidForName = Process.getGidForName("") + 29;
                byte[] bArr = $$a;
                byte b4 = bArr[18];
                Object[] objArr6 = new Object[1];
                c(b4, b4, (byte) (-bArr[17]), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(tapTimeout, iKeyCodeFromString, gidForName, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = (((81443043 + (((~((-1395220350) | iIdentityHashCode)) | 302010140) * 336)) + (((~(iIdentityHashCode | 378859294)) | (-1472069504)) * (-168))) + (((~((~iIdentityHashCode) | 378859294)) | (-1395220350)) * 168)) - 1713219673;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            d(new char[]{61453, 53866, 59711, 64469, 65298, 11246, 55860, 28162, 60075, 10041, 40596, 51498, 24944, 49997, 41374, 3979, 15034, 52985, 35824, 40017, 28244, 1898, 22319, 29758, 61062, 58278, 41271, 34479}, 26 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            d(new char[]{39935, 51458, 10602, 19136, 5865, 16015, 29265, 3705, 40318, 50485, 33276, 45452, 40157, 53019, 63121, 46559, 23816, 63277, 28496, 53361}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 18, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i9 = f812a + 7;
                    g = i9 % 128;
                    int i10 = i9 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                        int i11 = g + 73;
                        f812a = i11 % 128;
                        int i12 = i11 % 2;
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                    int i13 = g + 73;
                    f812a = i13 % 128;
                    int i14 = i13 % 2;
                }
            }
            Object[] objArr10 = new Object[1];
            d(new char[]{10352, 50736, 32409, 12072, 61388, 39828, 28132, 30148, 40547, 1792, 600, 19585, 34010, 60645, 20237, 40294, 21480, 28141}, (-16777200) - Color.rgb(0, 0, 0), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            d(new char[]{40579, 51240, 10185, 21383, 4475, 36523, 641, 39877, 11772, 29777, 34027, 10915, 33531, 45125, 37671, 49298, 4610, 58362}, 16 - View.resolveSize(0, 0), objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -1713219673};
                byte[] bArr2 = $$d;
                byte b5 = bArr2[0];
                Object[] objArr13 = new Object[1];
                e(b5, b5, bArr2[5], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b6 = bArr2[0];
                byte b7 = b6;
                Object[] objArr14 = new Object[1];
                e(b7, (byte) (b7 | 36), b6, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char maximumFlingVelocity2 = (char) (31533 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                    int iGreen = Color.green(0) + 921;
                    int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 28;
                    byte[] bArr3 = $$a;
                    byte b8 = bArr3[18];
                    byte b9 = (byte) (-bArr3[17]);
                    Object[] objArr16 = new Object[1];
                    c(b8, b8, b9, objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maximumFlingVelocity2, iGreen, keyRepeatTimeout, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    d(new char[]{58893, 18358, 38595, 53600, 22264, 57982, 19423, 37512, 40615, 25909, 3880, 13908, 32010, 31989, 29540, 34761, 18670, 30838, 11186, 21600, 18423, 38353, 35358, 35957}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 22, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    d(new char[]{43757, 51044, 26621, 6189, 7438, 37632, 35319, 4783, 6693, 15667, 42247, 9244, 49011, 50753, 19670, 15967, 7739, 1717}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14, objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 31533);
                        int i15 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 920;
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 28;
                        byte b10 = $$a[18];
                        Object[] objArr19 = new Object[1];
                        c((byte) 52, b10, b10, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(longPressTimeout, i15, fadingEdgeLength, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c = (char) (31533 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                        int packedPositionGroup = 921 - ExpandableListView.getPackedPositionGroup(0L);
                        int edgeSlop = 28 - (ViewConfiguration.getEdgeSlop() >> 16);
                        byte b11 = (byte) 52;
                        Object[] objArr20 = new Object[1];
                        c(b11, (byte) 14, b11, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, packedPositionGroup, edgeSlop, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr15;
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
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr == null) {
                throw null;
            }
            int i16 = g + 57;
            f812a = i16 % 128;
            int i17 = i16 % 2 == 0 ? 0 : 1;
            while (i17 < strArr.length) {
                int i18 = g + 51;
                f812a = i18 % 128;
                if (i18 % 2 != 0) {
                    arrayList.add(strArr[i17]);
                    i17 += 16;
                } else {
                    arrayList.add(strArr[i17]);
                    i17++;
                }
            }
            throw null;
        }
        int i19 = g + 83;
        f812a = i19 % 128;
        int i20 = i19 % 2;
        int i21 = ((int[]) objArr[0])[0];
        Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int i22 = ~(((int) Process.getStartUptimeMillis()) | 1262948012);
        int i23 = i21 + ((1090519040 | i22) * (-196)) + 1331106539 + ((i22 | 172428972) * 196);
        int i24 = (i23 << 13) ^ i23;
        int i25 = i24 ^ (i24 >>> 17);
        ((int[]) objArr21[0])[0] = i25 ^ (i25 << 5);
        int i26 = f812a + 79;
        g = i26 % 128;
        int i27 = i26 % 2;
        this.scaleProgressThresholds = progressThresholds;
    }

    public final ProgressThresholds getScaleMaskProgressThresholds() {
        int i = 2 % 2;
        int i2 = f812a;
        int i3 = i2 + 1;
        g = i3 % 128;
        int i4 = i3 % 2;
        ProgressThresholds progressThresholds = this.scaleMaskProgressThresholds;
        int i5 = i2 + 95;
        g = i5 % 128;
        int i6 = i5 % 2;
        return progressThresholds;
    }

    public final void setScaleMaskProgressThresholds(ProgressThresholds progressThresholds) {
        int i = 2 % 2;
        int i2 = f812a;
        int i3 = i2 + 21;
        g = i3 % 128;
        int i4 = i3 % 2;
        this.scaleMaskProgressThresholds = progressThresholds;
        int i5 = i2 + 45;
        g = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 10 / 0;
        }
    }

    public final ProgressThresholds getShapeMaskProgressThresholds() {
        int i = 2 % 2;
        int i2 = f812a + 93;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        ProgressThresholds progressThresholds = this.shapeMaskProgressThresholds;
        int i5 = i3 + 35;
        f812a = i5 % 128;
        int i6 = i5 % 2;
        return progressThresholds;
    }

    public final void setShapeMaskProgressThresholds(ProgressThresholds progressThresholds) {
        int i = 2 % 2;
        int i2 = f812a + 81;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        this.shapeMaskProgressThresholds = progressThresholds;
        int i5 = i3 + 3;
        f812a = i5 % 128;
        int i6 = i5 % 2;
    }

    public final boolean isHoldAtEndEnabled() {
        int i = 2 % 2;
        int i2 = g + 59;
        f812a = i2 % 128;
        if (i2 % 2 == 0) {
            return this.holdAtEndEnabled;
        }
        throw null;
    }

    public final void setHoldAtEndEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = g + 87;
        f812a = i2 % 128;
        int i3 = i2 % 2;
        this.holdAtEndEnabled = z;
        if (i3 != 0) {
            throw null;
        }
    }

    public final boolean isDrawDebugEnabled() {
        int i = 2 % 2;
        int i2 = f812a;
        int i3 = i2 + 111;
        g = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.drawDebugEnabled;
        int i5 = i2 + 3;
        g = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final void setDrawDebugEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = g + 107;
        int i3 = i2 % 128;
        f812a = i3;
        int i4 = i2 % 2;
        this.drawDebugEnabled = z;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 3;
        g = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // androidx.transition.Transition
    public final void setPathMotion(PathMotion pathMotion) {
        int i = 2 % 2;
        int i2 = f812a + 33;
        g = i2 % 128;
        int i3 = i2 % 2;
        super.setPathMotion(pathMotion);
        this.pathMotionCustom = true;
        int i4 = g + 67;
        f812a = i4 % 128;
        int i5 = i4 % 2;
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
            TransitionUtils.transform(canvas, getBounds(), this.currentStartBounds.left, this.currentStartBounds.top, this.fitModeResult.startScale, this.fadeModeResult.startAlpha, new CanvasCompat.CanvasOperation() { // from class: com.google.android.material.transition.MaterialContainerTransform.TransitionDrawable.1
                @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
                public void run(Canvas canvas2) {
                    TransitionDrawable.this.startView.draw(canvas2);
                }
            });
        }

        private void drawEndView(Canvas canvas) {
            maybeDrawContainerColor(canvas, this.endContainerPaint);
            TransitionUtils.transform(canvas, getBounds(), this.currentEndBounds.left, this.currentEndBounds.top, this.fitModeResult.endScale, this.fadeModeResult.endAlpha, new CanvasCompat.CanvasOperation() { // from class: com.google.android.material.transition.MaterialContainerTransform.TransitionDrawable.2
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

    @Override // androidx.transition.Transition
    public final String[] getTransitionProperties() throws Throwable {
        Object[] objArr;
        char c = 2;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
            int bitsPerPixel = 875 - ImageFormat.getBitsPerPixel(0);
            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 11;
            Object[] objArr2 = new Object[1];
            c((byte) 69, (byte) 13, (byte) 42, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(tapTimeout, bitsPerPixel, modifierMetaStateMask, -1199417970, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        d(new char[]{58893, 18358, 38595, 53600, 22264, 57982, 19423, 37512, 40615, 25909, 3880, 13908, 32010, 31989, 29540, 34761, 18670, 30838, 11186, 21600, 18423, 38353, 35358, 35957}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 21, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        d(new char[]{43757, 51044, 26621, 6189, 7438, 37632, 35319, 4783, 6693, 15667, 42247, 9244, 49011, 50753, 19670, 15967, 7739, 1717}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 15, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
            int iAxisFromString = MotionEvent.axisFromString("") + 877;
            int iArgb = Color.argb(0, 0, 0, 0) + 10;
            byte[] bArr = $$a;
            byte b2 = (byte) (bArr[1] + 1);
            byte b3 = (byte) (-bArr[7]);
            Object[] objArr5 = new Object[1];
            c(b2, b3, (byte) (b3 | 36), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveOpacity, iAxisFromString, iArgb, 254769921, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = f812a + 33;
            g = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 876;
                int i4 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 9;
                byte b4 = (byte) 13;
                Object[] objArr6 = new Object[1];
                c((byte) ($$a[1] + 1), b4, (byte) (b4 | 32), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, iCombineMeasuredStates, i4, 1324201839, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i5 = ~startUptimeMillis;
            int i6 = ((((-628917660) + (((~((-35393556) | i5)) | 75703784) * 220)) + (((~(i5 | (-56414228))) | 96724456) * (-440))) + ((startUptimeMillis | (-35393556)) * 220)) - 1140527850;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[1])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            d(new char[]{10352, 50736, 32409, 12072, 61388, 39828, 28132, 30148, 40547, 1792, 600, 19585, 34010, 60645, 20237, 40294, 21480, 28141}, 16 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            d(new char[]{40579, 51240, 10185, 21383, 4475, 36523, 641, 39877, 11772, 29777, 34027, 10915, 33531, 45125, 37671, 49298, 4610, 58362}, 17 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            int i9 = f812a + 39;
            g = i9 % 128;
            int i10 = i9 % 2;
            try {
                Object[] objArr10 = {Integer.valueOf(iIntValue), -1140527850};
                byte[] bArr2 = $$d;
                byte b5 = bArr2[5];
                Object[] objArr11 = new Object[1];
                e(b5, bArr2[55], b5, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b6 = bArr2[0];
                byte b7 = b6;
                Object[] objArr12 = new Object[1];
                e(b7, (byte) (b7 | 36), b6, objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char size = (char) View.MeasureSpec.getSize(0);
                    int absoluteGravity = 876 - Gravity.getAbsoluteGravity(0, 0);
                    int i11 = 11 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    byte b8 = (byte) 13;
                    Object[] objArr13 = new Object[1];
                    c((byte) ($$a[1] + 1), b8, (byte) (b8 | 32), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(size, absoluteGravity, i11, 1324201839, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    d(new char[]{58893, 18358, 38595, 53600, 22264, 57982, 19423, 37512, 40615, 25909, 3880, 13908, 32010, 31989, 29540, 34761, 18670, 30838, 11186, 21600, 18423, 38353, 35358, 35957}, 22 - TextUtils.indexOf("", ""), objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    d(new char[]{43757, 51044, 26621, 6189, 7438, 37632, 35319, 4783, 6693, 15667, 42247, 9244, 49011, 50753, 19670, 15967, 7739, 1717}, Drawable.resolveOpacity(0, 0) + 15, objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int iResolveSize = View.resolveSize(0, 0) + 876;
                        int iLastIndexOf = 9 - TextUtils.lastIndexOf("", '0');
                        byte[] bArr3 = $$a;
                        byte b9 = (byte) (bArr3[1] + 1);
                        byte b10 = (byte) (-bArr3[7]);
                        Object[] objArr16 = new Object[1];
                        c(b9, b10, (byte) (b10 | 36), objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarFadeDuration, iResolveSize, iLastIndexOf, 254769921, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
                        int iRed = Color.red(0) + 876;
                        int i12 = 11 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        Object[] objArr17 = new Object[1];
                        c((byte) 69, (byte) 13, (byte) 42, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cAxisFromString, iRed, i12, -1199417970, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    c = 2;
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
        if (((int[]) objArr[0])[0] != ((int[]) objArr[c])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr == null) {
                throw null;
            }
            for (String str : strArr) {
                arrayList.add(str);
            }
            throw null;
        }
        int i13 = g + 27;
        f812a = i13 % 128;
        int i14 = i13 % 2;
        int i15 = ((int[]) objArr[1])[0];
        Object[] objArr18 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i16 = (~(660421201 | startElapsedRealtime)) | 142622758;
        int i17 = ~startElapsedRealtime;
        int i18 = i15 + 1508488360 + ((i16 | (~((-102312530) | i17))) * 886) + (((~(i17 | (-660421202))) | 700731430) * (-1772)) + ((~(i17 | 700731430)) * 886);
        int i19 = (i18 << 13) ^ i18;
        int i20 = i19 ^ (i19 >>> 17);
        ((int[]) objArr18[1])[0] = i20 ^ (i20 << 5);
        return TRANSITION_PROPS;
    }

    @Override // androidx.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        int i = 2 % 2;
        int i2 = g + 111;
        f812a = i2 % 128;
        int i3 = i2 % 2;
        View view = this.startView;
        if (i3 == 0) {
            captureValues(transitionValues, view, this.startViewId, this.startShapeAppearanceModel);
        } else {
            captureValues(transitionValues, view, this.startViewId, this.startShapeAppearanceModel);
            int i4 = 65 / 0;
        }
    }

    @Override // androidx.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        int i = 2 % 2;
        int i2 = g + 1;
        f812a = i2 % 128;
        int i3 = i2 % 2;
        captureValues(transitionValues, this.endView, this.endViewId, this.endShapeAppearanceModel);
        int i4 = g + 105;
        f812a = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void captureValues(TransitionValues transitionValues, View view, int i, ShapeAppearanceModel shapeAppearanceModel) {
        int i2 = 2 % 2;
        int i3 = g;
        int i4 = i3 + 95;
        f812a = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        if (i != -1) {
            transitionValues.view = TransitionUtils.findDescendantOrAncestorById(transitionValues.view, i);
            int i6 = g + 25;
            f812a = i6 % 128;
            int i7 = i6 % 2;
        } else if (view != null) {
            int i8 = i3 + 13;
            f812a = i8 % 128;
            int i9 = i8 % 2;
            transitionValues.view = view;
        } else if (transitionValues.view.getTag(com.google.android.material.R.id.mtrl_motion_snapshot_view) instanceof View) {
            int i10 = f812a + 117;
            g = i10 % 128;
            if (i10 % 2 == 0) {
                View view2 = (View) transitionValues.view.getTag(com.google.android.material.R.id.mtrl_motion_snapshot_view);
                transitionValues.view.setTag(com.google.android.material.R.id.mtrl_motion_snapshot_view, null);
                transitionValues.view = view2;
                int i11 = 14 / 0;
            } else {
                View view3 = (View) transitionValues.view.getTag(com.google.android.material.R.id.mtrl_motion_snapshot_view);
                transitionValues.view.setTag(com.google.android.material.R.id.mtrl_motion_snapshot_view, null);
                transitionValues.view = view3;
            }
        }
        View view4 = transitionValues.view;
        if (!ViewCompat.isLaidOut(view4)) {
            int i12 = g + 95;
            f812a = i12 % 128;
            if (i12 % 2 != 0) {
                view4.getWidth();
                obj.hashCode();
                throw null;
            }
            if (view4.getWidth() == 0 && view4.getHeight() == 0) {
                return;
            }
        }
        RectF relativeBounds = view4.getParent() == null ? TransitionUtils.getRelativeBounds(view4) : TransitionUtils.getLocationOnScreen(view4);
        transitionValues.values.put(PROP_BOUNDS, relativeBounds);
        transitionValues.values.put(PROP_SHAPE_APPEARANCE, captureShapeAppearance(view4, relativeBounds, shapeAppearanceModel));
        int i13 = f812a + 109;
        g = i13 % 128;
        int i14 = i13 % 2;
    }

    private static ShapeAppearanceModel captureShapeAppearance(View view, RectF rectF, ShapeAppearanceModel shapeAppearanceModel) {
        int i = 2 % 2;
        int i2 = f812a + 41;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            TransitionUtils.convertToRelativeCornerSizes(getShapeAppearance(view, shapeAppearanceModel), rectF);
            throw null;
        }
        ShapeAppearanceModel shapeAppearanceModelConvertToRelativeCornerSizes = TransitionUtils.convertToRelativeCornerSizes(getShapeAppearance(view, shapeAppearanceModel), rectF);
        int i3 = g + 97;
        f812a = i3 % 128;
        int i4 = i3 % 2;
        return shapeAppearanceModelConvertToRelativeCornerSizes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static ShapeAppearanceModel getShapeAppearance(View view, ShapeAppearanceModel shapeAppearanceModel) {
        int i = 2 % 2;
        int i2 = g + 113;
        f812a = i2 % 128;
        int i3 = i2 % 2;
        if (shapeAppearanceModel != null) {
            return shapeAppearanceModel;
        }
        if (!(view.getTag(com.google.android.material.R.id.mtrl_motion_snapshot_view) instanceof ShapeAppearanceModel)) {
            Context context = view.getContext();
            int transitionShapeAppearanceResId = getTransitionShapeAppearanceResId(context);
            if (transitionShapeAppearanceResId != -1) {
                return ShapeAppearanceModel.builder(context, transitionShapeAppearanceResId, 0).build();
            }
            if (!(view instanceof Shapeable)) {
                return ShapeAppearanceModel.builder().build();
            }
            ShapeAppearanceModel shapeAppearanceModel2 = ((Shapeable) view).getShapeAppearanceModel();
            int i4 = g + 41;
            f812a = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 35 / 0;
            }
            return shapeAppearanceModel2;
        }
        int i6 = f812a + 13;
        g = i6 % 128;
        int i7 = i6 % 2;
        return (ShapeAppearanceModel) view.getTag(com.google.android.material.R.id.mtrl_motion_snapshot_view);
    }

    private static int getTransitionShapeAppearanceResId(Context context) {
        TypedArray typedArrayObtainStyledAttributes;
        int resourceId;
        int i = 2 % 2;
        int i2 = g + 7;
        f812a = i2 % 128;
        if (i2 % 2 != 0) {
            int[] iArr = new int[0];
            iArr[0] = com.google.android.material.R.attr.transitionShapeAppearance;
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
            resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{com.google.android.material.R.attr.transitionShapeAppearance});
            resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        }
        typedArrayObtainStyledAttributes.recycle();
        int i3 = f812a + 95;
        g = i3 % 128;
        int i4 = i3 % 2;
        return resourceId;
    }

    @Override // androidx.transition.Transition
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        View viewFindAncestorById;
        View view;
        int i = 2 % 2;
        if (transitionValues != null) {
            int i2 = g + 103;
            f812a = i2 % 128;
            int i3 = i2 % 2;
            if (transitionValues2 != null) {
                RectF rectF = (RectF) transitionValues.values.get(PROP_BOUNDS);
                ShapeAppearanceModel shapeAppearanceModel = (ShapeAppearanceModel) transitionValues.values.get(PROP_SHAPE_APPEARANCE);
                if (rectF != null) {
                    int i4 = g + 95;
                    f812a = i4 % 128;
                    int i5 = i4 % 2;
                    if (shapeAppearanceModel != null) {
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
                            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.transition.MaterialContainerTransform.1
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    transitionDrawable.setProgress(valueAnimator.getAnimatedFraction());
                                }
                            });
                            final View view5 = viewFindAncestorById;
                            addListener(new TransitionListenerAdapter() { // from class: com.google.android.material.transition.MaterialContainerTransform.2
                                @Override // com.google.android.material.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
                                public void onTransitionStart(Transition transition) {
                                    ViewUtils.getOverlay(view5).add(transitionDrawable);
                                    view2.setAlpha(0.0f);
                                    view3.setAlpha(0.0f);
                                }

                                @Override // com.google.android.material.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
                                public void onTransitionEnd(Transition transition) {
                                    MaterialContainerTransform.this.removeListener(this);
                                    if (MaterialContainerTransform.access$300(MaterialContainerTransform.this)) {
                                        return;
                                    }
                                    view2.setAlpha(1.0f);
                                    view3.setAlpha(1.0f);
                                    ViewUtils.getOverlay(view5).remove(transitionDrawable);
                                }
                            });
                            return valueAnimatorOfFloat;
                        }
                    }
                }
            }
        }
        return null;
    }

    private void maybeApplyThemeValues(Context context, boolean z) {
        int i;
        int i2 = 2 % 2;
        int i3 = g + 11;
        f812a = i3 % 128;
        int i4 = i3 % 2;
        TransitionUtils.maybeApplyThemeInterpolator(this, context, com.google.android.material.R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
        if (z) {
            int i5 = g + 111;
            f812a = i5 % 128;
            int i6 = i5 % 2;
            i = com.google.android.material.R.attr.motionDurationLong2;
        } else {
            i = com.google.android.material.R.attr.motionDurationMedium4;
        }
        TransitionUtils.maybeApplyThemeDuration(this, context, i);
        if (this.pathMotionCustom) {
            return;
        }
        TransitionUtils.maybeApplyThemePath(this, context, com.google.android.material.R.attr.motionPath);
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

    private static float getElevationOrDefault(float f, View view) {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 49;
        f812a = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (f == -1.0f) {
            return ViewCompat.getElevation(view);
        }
        int i4 = i2 + 121;
        f812a = i4 % 128;
        if (i4 % 2 == 0) {
            return f;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        return new android.graphics.RectF(0.0f, 0.0f, r3.getWidth(), r3.getHeight());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r3 = com.google.android.material.transition.TransitionUtils.getLocationOnScreen(r4);
        r3.offset(r5, r6);
        r4 = com.google.android.material.transition.MaterialContainerTransform.f812a + 57;
        com.google.android.material.transition.MaterialContainerTransform.g = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.RectF calculateDrawableBounds(android.view.View r3, android.view.View r4, float r5, float r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.material.transition.MaterialContainerTransform.g
            int r1 = r1 + 67
            int r2 = r1 % 128
            com.google.android.material.transition.MaterialContainerTransform.f812a = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L15
            r1 = 21
            int r1 = r1 / 0
            if (r4 == 0) goto L28
            goto L17
        L15:
            if (r4 == 0) goto L28
        L17:
            android.graphics.RectF r3 = com.google.android.material.transition.TransitionUtils.getLocationOnScreen(r4)
            r3.offset(r5, r6)
            int r4 = com.google.android.material.transition.MaterialContainerTransform.f812a
            int r4 = r4 + 57
            int r5 = r4 % 128
            com.google.android.material.transition.MaterialContainerTransform.g = r5
            int r4 = r4 % r0
            return r3
        L28:
            android.graphics.RectF r4 = new android.graphics.RectF
            int r5 = r3.getWidth()
            float r5 = (float) r5
            int r3 = r3.getHeight()
            float r3 = (float) r3
            r6 = 0
            r4.<init>(r6, r6, r5, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transition.MaterialContainerTransform.calculateDrawableBounds(android.view.View, android.view.View, float, float):android.graphics.RectF");
    }

    private boolean isEntering(RectF rectF, RectF rectF2) {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 115;
        f812a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.transitionDirection;
        if (i5 == 0) {
            return TransitionUtils.calculateArea(rectF2) > TransitionUtils.calculateArea(rectF);
        }
        int i6 = i2 + 123;
        f812a = i6 % 128;
        if (i6 % 2 == 0 ? i5 == 1 : i5 == 1) {
            return true;
        }
        int i7 = i2 + 89;
        f812a = i7 % 128;
        if (i7 % 2 == 0 ? i5 == 2 : i5 == 3) {
            return false;
        }
        StringBuilder sb = new StringBuilder("Invalid transition direction: ");
        sb.append(this.transitionDirection);
        throw new IllegalArgumentException(sb.toString());
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

    private ProgressThresholdsGroup buildThresholdsGroup(boolean z) {
        int i = 2 % 2;
        int i2 = g + 45;
        f812a = i2 % 128;
        int i3 = i2 % 2;
        PathMotion pathMotion = getPathMotion();
        if ((pathMotion instanceof ArcMotion) || (pathMotion instanceof MaterialArcMotion)) {
            return getThresholdsOrDefault(z, DEFAULT_ENTER_THRESHOLDS_ARC, DEFAULT_RETURN_THRESHOLDS_ARC);
        }
        int i4 = f812a + 119;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            getThresholdsOrDefault(z, DEFAULT_ENTER_THRESHOLDS, DEFAULT_RETURN_THRESHOLDS);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ProgressThresholdsGroup thresholdsOrDefault = getThresholdsOrDefault(z, DEFAULT_ENTER_THRESHOLDS, DEFAULT_RETURN_THRESHOLDS);
        int i5 = g + 27;
        f812a = i5 % 128;
        int i6 = i5 % 2;
        return thresholdsOrDefault;
    }

    private ProgressThresholdsGroup getThresholdsOrDefault(boolean z, ProgressThresholdsGroup progressThresholdsGroup, ProgressThresholdsGroup progressThresholdsGroup2) {
        int i = 2 % 2;
        int i2 = f812a;
        int i3 = i2 + 11;
        g = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (!z) {
            int i4 = i2 + 63;
            g = i4 % 128;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            progressThresholdsGroup = progressThresholdsGroup2;
        }
        return new ProgressThresholdsGroup((ProgressThresholds) TransitionUtils.defaultIfNull(this.fadeProgressThresholds, progressThresholdsGroup.fade), (ProgressThresholds) TransitionUtils.defaultIfNull(this.scaleProgressThresholds, progressThresholdsGroup.scale), (ProgressThresholds) TransitionUtils.defaultIfNull(this.scaleMaskProgressThresholds, progressThresholdsGroup.scaleMask), (ProgressThresholds) TransitionUtils.defaultIfNull(this.shapeMaskProgressThresholds, progressThresholdsGroup.shapeMask));
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        TuitionPaymentFragmentbindingInflater1 = (char) 63361;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (char) 9447;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (char) 54668;
        b = (char) 577;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, short r7, short r8) {
        /*
            int r8 = r8 * 4
            int r8 = r8 + 1
            int r7 = r7 * 4
            int r7 = 4 - r7
            byte[] r0 = com.google.android.material.transition.MaterialContainerTransform.$$c
            int r6 = r6 * 3
            int r6 = r6 + 108
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r7]
        L26:
            int r3 = -r3
            int r6 = r6 + r3
            int r7 = r7 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transition.MaterialContainerTransform.$$g(byte, short, short):java.lang.String");
    }
}
