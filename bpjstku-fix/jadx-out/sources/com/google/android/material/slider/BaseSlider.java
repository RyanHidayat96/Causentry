package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.widget.ExpandableListView;
import android.widget.SeekBar;
import android.widget.Toast;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewOverlayImpl;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.slider.BaseOnChangeListener;
import com.google.android.material.slider.BaseOnSliderTouchListener;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.android.material.tooltip.TooltipDrawable;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.initSession;
import defpackage.setVideoStabilizationMode;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends BaseOnChangeListener<S>, T extends BaseOnSliderTouchListener<S>> extends View {
    private static final int DEFAULT_LABEL_ANIMATION_ENTER_DURATION = 83;
    private static final int DEFAULT_LABEL_ANIMATION_EXIT_DURATION = 117;
    static final int DEF_STYLE_RES;
    private static final String EXCEPTION_ILLEGAL_DISCRETE_VALUE = "Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)";
    private static final String EXCEPTION_ILLEGAL_MIN_SEPARATION = "minSeparation(%s) must be greater or equal to 0";
    private static final String EXCEPTION_ILLEGAL_MIN_SEPARATION_STEP_SIZE = "minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)";
    private static final String EXCEPTION_ILLEGAL_MIN_SEPARATION_STEP_SIZE_UNIT = "minSeparation(%s) cannot be set as a dimension when using stepSize(%s)";
    private static final String EXCEPTION_ILLEGAL_STEP_SIZE = "The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range";
    private static final String EXCEPTION_ILLEGAL_VALUE = "Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)";
    private static final String EXCEPTION_ILLEGAL_VALUE_FROM = "valueFrom(%s) must be smaller than valueTo(%s)";
    private static final String EXCEPTION_ILLEGAL_VALUE_TO = "valueTo(%s) must be greater than valueFrom(%s)";
    private static final int HALO_ALPHA = 63;
    private static final int LABEL_ANIMATION_ENTER_DURATION_ATTR;
    private static final int LABEL_ANIMATION_ENTER_EASING_ATTR;
    private static final int LABEL_ANIMATION_EXIT_DURATION_ATTR;
    private static final int LABEL_ANIMATION_EXIT_EASING_ATTR;
    private static final int MIN_TOUCH_TARGET_DP = 48;
    private static final String TAG = "BaseSlider";
    private static final double THRESHOLD = 1.0E-4d;
    private static final float THUMB_WIDTH_PRESSED_RATIO = 0.5f;
    private static final int TIMEOUT_SEND_ACCESSIBILITY_EVENT = 200;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
    static final int UNIT_PX = 0;
    static final int UNIT_VALUE = 1;
    private static final String WARNING_FLOATING_POINT_ERROR = "Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.";
    private static int b;
    private BaseSlider<S, L, T>.AccessibilityEventSender accessibilityEventSender;
    private final AccessibilityHelper accessibilityHelper;
    private final AccessibilityManager accessibilityManager;
    private int activeThumbIdx;
    private final Paint activeTicksPaint;
    private final Paint activeTrackPaint;
    private final List<L> changeListeners;
    private final RectF cornerRect;
    private Drawable customThumbDrawable;
    private List<Drawable> customThumbDrawablesForValues;
    private final MaterialShapeDrawable defaultThumbDrawable;
    private int defaultThumbRadius;
    private int defaultThumbTrackGapSize;
    private int defaultThumbWidth;
    private int defaultTickActiveRadius;
    private int defaultTickInactiveRadius;
    private int defaultTrackHeight;
    private boolean dirtyConfig;
    private int focusedThumbIdx;
    private boolean forceDrawCompatHalo;
    private LabelFormatter formatter;
    private ColorStateList haloColor;
    private final Paint haloPaint;
    private int haloRadius;
    private final Paint inactiveTicksPaint;
    private final Paint inactiveTrackPaint;
    private boolean isLongPress;
    private int labelBehavior;
    private int labelPadding;
    private int labelStyle;
    private final List<TooltipDrawable> labels;
    private boolean labelsAreAnimatedIn;
    private ValueAnimator labelsInAnimator;
    private ValueAnimator labelsOutAnimator;
    private MotionEvent lastEvent;
    private int minTickSpacing;
    private int minTouchTargetSize;
    private int minTrackSidePadding;
    private int minWidgetHeight;
    private final ViewTreeObserver.OnScrollChangedListener onScrollChangedListener;
    private final int scaledTouchSlop;
    private int separationUnit;
    private float stepSize;
    private final Paint stopIndicatorPaint;
    private int thumbHeight;
    private boolean thumbIsPressed;
    private final Paint thumbPaint;
    private int thumbTrackGapSize;
    private int thumbWidth;
    private int tickActiveRadius;
    private ColorStateList tickColorActive;
    private ColorStateList tickColorInactive;
    private int tickInactiveRadius;
    private boolean tickVisible;
    private float[] ticksCoordinates;
    private float touchDownX;
    private final List<T> touchListeners;
    private float touchPosition;
    private ColorStateList trackColorActive;
    private ColorStateList trackColorInactive;
    private int trackHeight;
    private int trackInsideCornerSize;
    private final Path trackPath;
    private final RectF trackRect;
    private int trackSidePadding;
    private int trackStopIndicatorSize;
    private int trackWidth;
    private float valueFrom;
    private float valueTo;
    private ArrayList<Float> values;
    private int widgetHeight;
    private static final byte[] $$c = {55, -47, -47, 67};
    private static final int $$f = 85;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {115, 98, 19, 9, -11, -12, 1, -4, -12, -17, 67, -60, -19, -10, -4, -13, -6, 4, -12, 2, -21, 62, -63, -13, -10, -15, 66, -66, -12, -13, 8, -20, -3, 6, -18, 55, -28, -44, 0, -20, -7, 2, -14, 31, -45, -10, -15, 28, -37, 10, -20, -12, 6, -16, -10, -2, 26, -28, -26, 8, -21, -8, 73, -73, -13, -10, -15, 45, -51, -4, -7, 0, -5, -24, 73, -22, 8, -20, 6, -72, -15, -3, -18, 73, -20, -19, -5, 56, -64, -15, -7, 1, -12, 0, 48, -58, -20, 3, -21, -4, -1, -2, 47, -64, -13, -13, 62, -70, 5, -22, -10, 62, -70, -9, 4, -8, -14, 55, -41, -38, -4, -20, 11, -15, -6, -40, 5, -18, 4, -13, -6, 23, -24, -31, 5, 1, -16, -13, 39, -51, 10, -13, -13, 1, -16, -13, 11, -14, -12, 3, -12, -12, 0, 23, -44, 1, -13, 4, -26, 8, -20, 58};
    private static final int $$h = 245;
    private static final byte[] $$a = {114, -59, 10, 31, 28, -32, 47, 16, -5, 23, -2, 5, 12, 12, 28, -39, 49, 15, 0, 11, 23, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 150;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;

    enum FullCornerDirection {
        BOTH,
        LEFT,
        RIGHT,
        NONE
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 + 84
            int r7 = r7 + 4
            byte[] r0 = com.google.android.material.slider.BaseSlider.$$a
            int r1 = 53 - r5
            byte[] r1 = new byte[r1]
            int r5 = 52 - r5
            r2 = 0
            if (r0 != 0) goto L12
            r4 = r5
            r3 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r5) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L20:
            int r3 = r3 + 1
            r4 = r0[r7]
        L24:
            int r6 = r6 + r4
            int r7 = r7 + 1
            int r6 = r6 + (-10)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.c(int, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001f -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x001f
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r0 = r7 + 1
            byte[] r1 = com.google.android.material.slider.BaseSlider.$$g
            int r8 = 107 - r8
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L11
            r3 = r8
            r4 = r2
            r8 = r6
            goto L28
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L1f
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L1f:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L28:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r8 + 1
            int r8 = r3 + (-7)
            r3 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.e(int, byte, short, java.lang.Object[]):void");
    }

    static /* synthetic */ List access$000(BaseSlider baseSlider) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        List<TooltipDrawable> list = baseSlider.labels;
        if (i3 == 0) {
            return list;
        }
        throw null;
    }

    static /* synthetic */ AccessibilityHelper access$200(BaseSlider baseSlider) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 91;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        AccessibilityHelper accessibilityHelper = baseSlider.accessibilityHelper;
        if (i3 != 0) {
            return accessibilityHelper;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ String access$400(BaseSlider baseSlider, float f) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        String value = baseSlider.formatValue(f);
        if (i3 != 0) {
            int i4 = 94 / 0;
        }
        return value;
    }

    static /* synthetic */ boolean access$500(BaseSlider baseSlider, int i, float f) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            baseSlider.snapThumbToValue(i, f);
            throw null;
        }
        boolean zSnapThumbToValue = baseSlider.snapThumbToValue(i, f);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 33;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 80 / 0;
        }
        return zSnapThumbToValue;
    }

    static /* synthetic */ void access$600(BaseSlider baseSlider) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        baseSlider.updateHaloHotspot();
        if (i3 != 0) {
            throw null;
        }
    }

    static /* synthetic */ float access$700(BaseSlider baseSlider, int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 125;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        float fCalculateStepIncrement = baseSlider.calculateStepIncrement(i);
        if (i4 == 0) {
            int i5 = 11 / 0;
        }
        return fCalculateStepIncrement;
    }

    private static void d(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int length;
        char[] cArr;
        int i2 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (cArr2 != null) {
            int i8 = $10 + 49;
            int i9 = i8 % 128;
            $11 = i9;
            if (i8 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            int i10 = i9 + 117;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 0;
            while (i12 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr2[i12]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) i3;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.lastIndexOf("", '0') + 1), 1270 - ((Process.getThreadPriority(i3) + 20) >> 6), 18 - KeyEvent.normalizeMetaState(i3), 407021364, false, $$i(b2, b3, (byte) (b3 + 5)), new Class[]{Integer.TYPE});
                    }
                    cArr[i12] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i12++;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr2, i4, cArr3, 0, i5);
        if (bArr != null) {
            char[] cArr4 = new char[i5];
            setvideostabilizationmode.b = 0;
            int i13 = $10 + 125;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            char c = 0;
            while (setvideostabilizationmode.b < i5) {
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i15 = setvideostabilizationmode.b;
                    Object[] objArr3 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3225, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 13, 2133916302, false, $$i(b4, b5, (byte) (b5 | 6)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i15] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                } else {
                    int i16 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (29943 - ExpandableListView.getPackedPositionChild(0L)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1754, 23 - (ViewConfiguration.getPressedStateDuration() >> 16), 387247676, false, $$i(b6, b6, (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i16] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                }
                c = cArr4[setvideostabilizationmode.b];
                Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (41241 - ExpandableListView.getPackedPositionType(0L)), View.MeasureSpec.getSize(0) + 1705, 22 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1434471773, false, $$i(b7, b8, b8), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            i = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i17 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i17, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i17);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i5];
            while (true) {
                setvideostabilizationmode.b = i;
                if (setvideostabilizationmode.b >= i5) {
                    break;
                }
                cArr6[setvideostabilizationmode.b] = cArr3[(i5 - setvideostabilizationmode.b) - 1];
                i = setvideostabilizationmode.b + 1;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            int i18 = $10 + 53;
            $11 = i18 % 128;
            int i19 = i18 % 2;
            int i20 = 0;
            while (true) {
                setvideostabilizationmode.b = i20;
                if (setvideostabilizationmode.b >= i5) {
                    break;
                }
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                i20 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static {
        b = 1;
        b();
        DEF_STYLE_RES = R.style.Widget_MaterialComponents_Slider;
        LABEL_ANIMATION_ENTER_DURATION_ATTR = R.attr.motionDurationMedium4;
        LABEL_ANIMATION_EXIT_DURATION_ATTR = R.attr.motionDurationShort3;
        LABEL_ANIMATION_ENTER_EASING_ATTR = R.attr.motionEasingEmphasizedInterpolator;
        LABEL_ANIMATION_EXIT_EASING_ATTR = R.attr.motionEasingEmphasizedAccelerateInterpolator;
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
        b = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public BaseSlider(Context context) {
        this(context, null);
    }

    public BaseSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.sliderStyle);
    }

    public BaseSlider(Context context, AttributeSet attributeSet, int i) throws Throwable {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, DEF_STYLE_RES), attributeSet, i);
        this.labels = new ArrayList();
        this.changeListeners = new ArrayList();
        this.touchListeners = new ArrayList();
        this.labelsAreAnimatedIn = false;
        this.defaultThumbWidth = -1;
        this.defaultThumbTrackGapSize = -1;
        this.thumbIsPressed = false;
        this.values = new ArrayList<>();
        this.activeThumbIdx = -1;
        this.focusedThumbIdx = -1;
        this.stepSize = 0.0f;
        this.tickVisible = true;
        this.isLongPress = false;
        this.trackPath = new Path();
        this.trackRect = new RectF();
        this.cornerRect = new RectF();
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.defaultThumbDrawable = materialShapeDrawable;
        this.customThumbDrawablesForValues = Collections.emptyList();
        this.separationUnit = 0;
        this.onScrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.material.slider.BaseSlider$$ExternalSyntheticLambda0
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() throws Throwable {
                BaseSlider.$r8$lambda$WXiNVeXFM7RTh57Z9Tr5jBbN9l4(this.f$0);
            }
        };
        Context context2 = getContext();
        this.inactiveTrackPaint = new Paint();
        this.activeTrackPaint = new Paint();
        Paint paint = new Paint(1);
        this.thumbPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        this.haloPaint = paint2;
        paint2.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint();
        this.inactiveTicksPaint = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        Paint paint4 = new Paint();
        this.activeTicksPaint = paint4;
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setStrokeCap(Paint.Cap.ROUND);
        Paint paint5 = new Paint();
        this.stopIndicatorPaint = paint5;
        paint5.setStyle(Paint.Style.FILL);
        paint5.setStrokeCap(Paint.Cap.ROUND);
        loadResources(context2.getResources());
        processAttributes(context2, attributeSet, i);
        setFocusable(true);
        setClickable(true);
        materialShapeDrawable.setShadowCompatibilityMode(2);
        this.scaledTouchSlop = ViewConfiguration.get(context2).getScaledTouchSlop();
        AccessibilityHelper accessibilityHelper = new AccessibilityHelper(this);
        this.accessibilityHelper = accessibilityHelper;
        ViewCompat.setAccessibilityDelegate(this, accessibilityHelper);
        this.accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    private void loadResources(Resources resources) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 103;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.minWidgetHeight = resources.getDimensionPixelSize(R.dimen.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_slider_track_side_padding);
        this.minTrackSidePadding = dimensionPixelOffset;
        this.trackSidePadding = dimensionPixelOffset;
        this.defaultThumbRadius = resources.getDimensionPixelSize(R.dimen.mtrl_slider_thumb_radius);
        this.defaultTrackHeight = resources.getDimensionPixelSize(R.dimen.mtrl_slider_track_height);
        this.defaultTickActiveRadius = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.defaultTickInactiveRadius = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.minTickSpacing = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_min_spacing);
        this.labelPadding = resources.getDimensionPixelSize(R.dimen.mtrl_slider_label_padding);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    private void processAttributes(Context context, AttributeSet attributeSet, int i) throws Throwable {
        int i2;
        int i3;
        int i4 = 2 % 2;
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R.styleable.Slider, i, DEF_STYLE_RES, new int[0]);
        this.labelStyle = typedArrayObtainStyledAttributes.getResourceId(R.styleable.Slider_labelStyle, R.style.Widget_MaterialComponents_Tooltip);
        this.valueFrom = typedArrayObtainStyledAttributes.getFloat(R.styleable.Slider_android_valueFrom, 0.0f);
        this.valueTo = typedArrayObtainStyledAttributes.getFloat(R.styleable.Slider_android_valueTo, 1.0f);
        setValues(Float.valueOf(this.valueFrom));
        this.stepSize = typedArrayObtainStyledAttributes.getFloat(R.styleable.Slider_android_stepSize, 0.0f);
        this.minTouchTargetSize = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(R.styleable.Slider_minTouchTargetSize, (float) Math.ceil(ViewUtils.dpToPx(getContext(), 48))));
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(R.styleable.Slider_trackColor);
        int i5 = zHasValue ? R.styleable.Slider_trackColor : R.styleable.Slider_trackColorInactive;
        if (!zHasValue) {
            i2 = R.styleable.Slider_trackColorActive;
        } else {
            int i6 = TuitionPaymentFragmentbindingInflater1 + 27;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            int i7 = i6 % 2;
            i2 = R.styleable.Slider_trackColor;
        }
        ColorStateList colorStateList = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i5);
        if (colorStateList == null) {
            colorStateList = AppCompatResources.getColorStateList(context, R.color.material_slider_inactive_track_color);
        }
        setTrackInactiveTintList(colorStateList);
        ColorStateList colorStateList2 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i2);
        if (colorStateList2 == null) {
            colorStateList2 = AppCompatResources.getColorStateList(context, R.color.material_slider_active_track_color);
        }
        setTrackActiveTintList(colorStateList2);
        this.defaultThumbDrawable.setFillColor(MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.Slider_thumbColor));
        if (!(!typedArrayObtainStyledAttributes.hasValue(R.styleable.Slider_thumbStrokeColor))) {
            setThumbStrokeColor(MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.Slider_thumbStrokeColor));
        }
        setThumbStrokeWidth(typedArrayObtainStyledAttributes.getDimension(R.styleable.Slider_thumbStrokeWidth, 0.0f));
        ColorStateList colorStateList3 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.Slider_haloColor);
        if (colorStateList3 == null) {
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 13;
            TuitionPaymentFragmentbindingInflater1 = i8 % 128;
            if (i8 % 2 == 0) {
                colorStateList3 = AppCompatResources.getColorStateList(context, R.color.material_slider_halo_color);
                int i9 = 83 / 0;
            } else {
                colorStateList3 = AppCompatResources.getColorStateList(context, R.color.material_slider_halo_color);
            }
        }
        setHaloTintList(colorStateList3);
        this.tickVisible = typedArrayObtainStyledAttributes.getBoolean(R.styleable.Slider_tickVisible, true);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(R.styleable.Slider_tickColor);
        if (zHasValue2) {
            int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 53;
            TuitionPaymentFragmentbindingInflater1 = i10 % 128;
            if (i10 % 2 == 0) {
                i3 = R.styleable.Slider_tickColor;
                int i11 = 76 / 0;
            } else {
                i3 = R.styleable.Slider_tickColor;
            }
        } else {
            i3 = R.styleable.Slider_tickColorInactive;
        }
        int i12 = !zHasValue2 ? R.styleable.Slider_tickColorActive : R.styleable.Slider_tickColor;
        ColorStateList colorStateList4 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i3);
        if (colorStateList4 == null) {
            int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 95;
            TuitionPaymentFragmentbindingInflater1 = i13 % 128;
            int i14 = i13 % 2;
            colorStateList4 = AppCompatResources.getColorStateList(context, R.color.material_slider_inactive_tick_marks_color);
        }
        setTickInactiveTintList(colorStateList4);
        ColorStateList colorStateList5 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i12);
        if (colorStateList5 == null) {
            colorStateList5 = AppCompatResources.getColorStateList(context, R.color.material_slider_active_tick_marks_color);
        }
        setTickActiveTintList(colorStateList5);
        setThumbTrackGapSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_thumbTrackGapSize, 0));
        setTrackStopIndicatorSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_trackStopIndicatorSize, 0));
        setTrackInsideCornerSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_trackInsideCornerSize, 0));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_thumbRadius, 0) * 2;
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_thumbWidth, dimensionPixelSize);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_thumbHeight, dimensionPixelSize);
        setThumbWidth(dimensionPixelSize2);
        setThumbHeight(dimensionPixelSize3);
        setHaloRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_haloRadius, 0));
        setThumbElevation(typedArrayObtainStyledAttributes.getDimension(R.styleable.Slider_thumbElevation, 0.0f));
        setTrackHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_trackHeight, 0));
        setTickActiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_tickRadiusActive, this.trackStopIndicatorSize / 2));
        setTickInactiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_tickRadiusInactive, this.trackStopIndicatorSize / 2));
        setLabelBehavior(typedArrayObtainStyledAttributes.getInt(R.styleable.Slider_labelBehavior, 0));
        if (!typedArrayObtainStyledAttributes.getBoolean(R.styleable.Slider_android_enabled, true)) {
            setEnabled(false);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private boolean maybeIncreaseTrackSidePadding() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 91;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        int iMax = this.minTrackSidePadding + Math.max(Math.max(Math.max((this.thumbWidth / 2) - this.defaultThumbRadius, 0), Math.max((this.trackHeight - this.defaultTrackHeight) / 2, 0)), Math.max(Math.max(this.tickActiveRadius - this.defaultTickActiveRadius, 0), Math.max(this.tickInactiveRadius - this.defaultTickInactiveRadius, 0)));
        if (this.trackSidePadding == iMax) {
            return false;
        }
        this.trackSidePadding = iMax;
        if (!ViewCompat.isLaidOut(this)) {
            return true;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 21;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        updateTrackWidth(getWidth());
        return true;
    }

    private void validateValueFrom() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 95;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        float f = this.valueFrom;
        float f2 = this.valueTo;
        if (f >= f2) {
            throw new IllegalStateException(String.format(EXCEPTION_ILLEGAL_VALUE_FROM, Float.valueOf(f), Float.valueOf(f2)));
        }
        int i5 = i3 + 45;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
    }

    private void validateValueTo() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 63;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        float f = this.valueTo;
        float f2 = this.valueFrom;
        if (f <= f2) {
            throw new IllegalStateException(String.format(EXCEPTION_ILLEGAL_VALUE_TO, Float.valueOf(f), Float.valueOf(f2)));
        }
        int i5 = i2 + 45;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private boolean valueLandsOnTick(float f) {
        int i = 2 % 2;
        boolean zIsMultipleOfStepSize = isMultipleOfStepSize(new BigDecimal(Float.toString(f)).subtract(new BigDecimal(Float.toString(this.valueFrom)), MathContext.DECIMAL64).doubleValue());
        int i2 = TuitionPaymentFragmentbindingInflater1 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        return zIsMultipleOfStepSize;
    }

    private boolean isMultipleOfStepSize(double d) {
        int i = 2 % 2;
        double dDoubleValue = new BigDecimal(Double.toString(d)).divide(new BigDecimal(Float.toString(this.stepSize)), MathContext.DECIMAL64).doubleValue();
        if (Math.abs(Math.round(dDoubleValue) - dDoubleValue) >= THRESHOLD) {
            return false;
        }
        int i2 = TuitionPaymentFragmentbindingInflater1 + 33;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 83;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void validateStepSize() {
        int i = 2 % 2;
        if (this.stepSize > 0.0f) {
            int i2 = TuitionPaymentFragmentbindingInflater1 + 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            if (!valueLandsOnTick(this.valueTo)) {
                throw new IllegalStateException(String.format(EXCEPTION_ILLEGAL_STEP_SIZE, Float.valueOf(this.stepSize), Float.valueOf(this.valueFrom), Float.valueOf(this.valueTo)));
            }
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 103;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
    }

    private void validateValues() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 4 % 5;
        }
        for (Float f : this.values) {
            if (f.floatValue() < this.valueFrom || f.floatValue() > this.valueTo) {
                throw new IllegalStateException(String.format(EXCEPTION_ILLEGAL_VALUE, f, Float.valueOf(this.valueFrom), Float.valueOf(this.valueTo)));
            }
            if (this.stepSize > 0.0f) {
                int i4 = TuitionPaymentFragmentbindingInflater1 + 83;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 97 / 0;
                    if (!valueLandsOnTick(f.floatValue())) {
                        float f2 = this.valueFrom;
                        float f3 = this.stepSize;
                        throw new IllegalStateException(String.format(EXCEPTION_ILLEGAL_DISCRETE_VALUE, f, Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f3)));
                    }
                } else if (!valueLandsOnTick(f.floatValue())) {
                    float f4 = this.valueFrom;
                    float f5 = this.stepSize;
                    throw new IllegalStateException(String.format(EXCEPTION_ILLEGAL_DISCRETE_VALUE, f, Float.valueOf(f4), Float.valueOf(f5), Float.valueOf(f5)));
                }
            }
        }
    }

    private void validateMinSeparation() {
        float f;
        int i = 2 % 2;
        float minSeparation = getMinSeparation();
        if (minSeparation < 0.0f) {
            throw new IllegalStateException(String.format(EXCEPTION_ILLEGAL_MIN_SEPARATION, Float.valueOf(minSeparation)));
        }
        int i2 = TuitionPaymentFragmentbindingInflater1 + 15;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        if (i2 % 2 != 0) {
            f = this.stepSize;
            if (f <= 2.0f) {
                return;
            }
        } else {
            f = this.stepSize;
            if (f <= 0.0f) {
                return;
            }
        }
        if (minSeparation > 0.0f) {
            if (this.separationUnit != 1) {
                throw new IllegalStateException(String.format(EXCEPTION_ILLEGAL_MIN_SEPARATION_STEP_SIZE_UNIT, Float.valueOf(minSeparation), Float.valueOf(this.stepSize)));
            }
            int i4 = i3 + 55;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            if (i4 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (minSeparation < f || !isMultipleOfStepSize(minSeparation)) {
                float f2 = this.stepSize;
                throw new IllegalStateException(String.format(EXCEPTION_ILLEGAL_MIN_SEPARATION_STEP_SIZE, Float.valueOf(minSeparation), Float.valueOf(f2), Float.valueOf(f2)));
            }
        }
    }

    private void warnAboutFloatingPointError() {
        int i = 2 % 2;
        float f = this.stepSize;
        if (f != 0.0f) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 37;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            if (((int) f) != f) {
                new Object[]{"stepSize", Float.valueOf(f)};
            }
            float f2 = this.valueFrom;
            if (((int) f2) != f2) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                if (i4 % 2 == 0) {
                    Float.valueOf(f2);
                } else {
                    new Object[]{"valueFrom", Float.valueOf(f2)};
                }
            }
            float f3 = this.valueTo;
            if (((int) f3) != f3) {
                new Object[]{"valueTo", Float.valueOf(f3)};
            }
        }
    }

    private void validateConfigurationIfDirty() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 91;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        if (this.dirtyConfig) {
            validateValueFrom();
            validateValueTo();
            validateStepSize();
            validateValues();
            validateMinSeparation();
            warnAboutFloatingPointError();
            this.dirtyConfig = false;
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public float getValueFrom() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 7;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        float f = this.valueFrom;
        int i4 = i3 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 57 / 0;
        }
        return f;
    }

    public void setValueFrom(float f) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 79;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            this.valueFrom = f;
            this.dirtyConfig = false;
        } else {
            this.valueFrom = f;
            this.dirtyConfig = true;
        }
        postInvalidate();
    }

    public float getValueTo() {
        float f;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 93;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        if (i2 % 2 != 0) {
            f = this.valueTo;
            int i4 = 66 / 0;
        } else {
            f = this.valueTo;
        }
        int i5 = i3 + 77;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setValueTo(float f) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.valueTo = f;
        this.dirtyConfig = true;
        postInvalidate();
        int i4 = TuitionPaymentFragmentbindingInflater1 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 13 / 0;
        }
    }

    List<Float> getValues() {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList(this.values);
        int i2 = TuitionPaymentFragmentbindingInflater1 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        return arrayList;
    }

    void setValues(Float... fArr) throws Throwable {
        int i = 2 % 2;
        ArrayList<Float> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, fArr);
        setValuesInternal(arrayList);
        int i2 = TuitionPaymentFragmentbindingInflater1 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 66 / 0;
        }
    }

    void setValues(List<Float> list) throws Throwable {
        int i = 2 % 2;
        setValuesInternal(new ArrayList<>(list));
        int i2 = TuitionPaymentFragmentbindingInflater1 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0037  */
    /* JADX WARN: Code duplicated, block: B:13:0x003f A[RETURN] */
    private void setValuesInternal(ArrayList<Float> arrayList) throws Throwable {
        int i = 2 % 2;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("At least one value must be set");
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 59;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            Collections.sort(arrayList);
            int i3 = 40 / 0;
            if (this.values.size() == arrayList.size()) {
                if (this.values.equals(arrayList)) {
                    return;
                }
            }
        } else {
            Collections.sort(arrayList);
            if (this.values.size() == arrayList.size()) {
                if (this.values.equals(arrayList)) {
                    return;
                }
            }
        }
        this.values = arrayList;
        this.dirtyConfig = true;
        this.focusedThumbIdx = 0;
        updateHaloHotspot();
        createLabelPool();
        dispatchOnChangedProgrammatically();
        postInvalidate();
        int i4 = TuitionPaymentFragmentbindingInflater1 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void createLabelPool() throws Throwable {
        int i = 2 % 2;
        if (this.labels.size() > this.values.size()) {
            List<TooltipDrawable> listSubList = this.labels.subList(this.values.size(), this.labels.size());
            for (TooltipDrawable tooltipDrawable : listSubList) {
                if (ViewCompat.isAttachedToWindow(this)) {
                    detachLabelFromContentView(tooltipDrawable);
                }
            }
            listSubList.clear();
        }
        while (true) {
            int i2 = 0;
            Object obj = null;
            if (this.labels.size() >= this.values.size()) {
                if (this.labels.size() != 1) {
                    int i3 = TuitionPaymentFragmentbindingInflater1 + 95;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
                    if (i3 % 2 == 0) {
                        i2 = 1;
                    }
                }
                Iterator<TooltipDrawable> it = this.labels.iterator();
                while (it.hasNext()) {
                    int i4 = TuitionPaymentFragmentbindingInflater1 + 91;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                    if (i4 % 2 != 0) {
                        it.next().setStrokeWidth(i2);
                        obj.hashCode();
                        throw null;
                    }
                    it.next().setStrokeWidth(i2);
                }
                return;
            }
            TooltipDrawable tooltipDrawableCreateFromAttributes = TooltipDrawable.createFromAttributes(getContext(), null, 0, this.labelStyle);
            this.labels.add(tooltipDrawableCreateFromAttributes);
            if (ViewCompat.isAttachedToWindow(this)) {
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 27;
                TuitionPaymentFragmentbindingInflater1 = i5 % 128;
                if (i5 % 2 == 0) {
                    attachLabelToContentView(tooltipDrawableCreateFromAttributes);
                    obj.hashCode();
                    throw null;
                }
                attachLabelToContentView(tooltipDrawableCreateFromAttributes);
            }
        }
    }

    public float getStepSize() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 45;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        float f = this.stepSize;
        int i5 = i2 + 31;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 74 / 0;
        }
        return f;
    }

    public void setStepSize(float f) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        if (f < 0.0f) {
            throw new IllegalArgumentException(String.format(EXCEPTION_ILLEGAL_STEP_SIZE, Float.valueOf(f), Float.valueOf(this.valueFrom), Float.valueOf(this.valueTo)));
        }
        if (this.stepSize != f) {
            int i5 = i2 + 11;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
            this.stepSize = f;
            this.dirtyConfig = true;
            postInvalidate();
        }
        int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
        TuitionPaymentFragmentbindingInflater1 = i7 % 128;
        int i8 = i7 % 2;
    }

    void setCustomThumbDrawable(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 103;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        setCustomThumbDrawable(getResources().getDrawable(i));
        int i5 = TuitionPaymentFragmentbindingInflater1 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    void setCustomThumbDrawable(Drawable drawable) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 73;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            this.customThumbDrawable = initializeCustomThumbDrawable(drawable);
            this.customThumbDrawablesForValues.clear();
            postInvalidate();
        } else {
            this.customThumbDrawable = initializeCustomThumbDrawable(drawable);
            this.customThumbDrawablesForValues.clear();
            postInvalidate();
            int i3 = 85 / 0;
        }
    }

    void setCustomThumbDrawablesForValues(int... iArr) {
        int i = 2 % 2;
        Drawable[] drawableArr = new Drawable[iArr.length];
        int i2 = 0;
        while (i2 < iArr.length) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            if (i3 % 2 == 0) {
                drawableArr[i2] = getResources().getDrawable(iArr[i2]);
                i2 += 67;
            } else {
                drawableArr[i2] = getResources().getDrawable(iArr[i2]);
                i2++;
            }
        }
        setCustomThumbDrawablesForValues(drawableArr);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    void setCustomThumbDrawablesForValues(Drawable... drawableArr) {
        int i = 2 % 2;
        this.customThumbDrawable = null;
        this.customThumbDrawablesForValues = new ArrayList();
        for (Drawable drawable : drawableArr) {
            int i2 = TuitionPaymentFragmentbindingInflater1 + 123;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            this.customThumbDrawablesForValues.add(initializeCustomThumbDrawable(drawable));
        }
        postInvalidate();
        int i4 = TuitionPaymentFragmentbindingInflater1 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    private Drawable initializeCustomThumbDrawable(Drawable drawable) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
        adjustCustomThumbDrawableBounds(drawableNewDrawable);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return drawableNewDrawable;
    }

    private void adjustCustomThumbDrawableBounds(Drawable drawable) {
        int i = 2 % 2;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth != -1 || intrinsicHeight != -1) {
            float fMax = Math.max(this.thumbWidth, this.thumbHeight) / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * fMax), (int) (intrinsicHeight * fMax));
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 53;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 / 0;
                return;
            }
            return;
        }
        int i4 = TuitionPaymentFragmentbindingInflater1 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        drawable.setBounds(0, 0, this.thumbWidth, this.thumbHeight);
    }

    public int getFocusedThumbIndex() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 27;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.focusedThumbIdx;
        int i6 = i2 + 73;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public void setFocusedThumbIndex(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = i3 + 25;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        if (i >= 0) {
            int i6 = i3 + 25;
            TuitionPaymentFragmentbindingInflater1 = i6 % 128;
            int i7 = i6 % 2;
            if (i < this.values.size()) {
                int i8 = TuitionPaymentFragmentbindingInflater1 + 73;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
                int i9 = i8 % 2;
                this.focusedThumbIdx = i;
                this.accessibilityHelper.requestKeyboardFocusForVirtualView(i);
                postInvalidate();
                int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
                TuitionPaymentFragmentbindingInflater1 = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
                return;
            }
        }
        throw new IllegalArgumentException("index out of range");
    }

    protected void setActiveThumbIndex(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 23;
        int i4 = i3 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4;
        int i5 = i3 % 2;
        this.activeThumbIdx = i;
        if (i5 != 0) {
            throw null;
        }
        int i6 = i4 + 63;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 72 / 0;
        }
    }

    public int getActiveThumbIndex() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 59;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = this.activeThumbIdx;
        int i5 = i2 + 71;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public void addOnChangeListener(L l) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.changeListeners.add(l);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 97;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void removeOnChangeListener(L l) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 101;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.changeListeners.remove(l);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void clearOnChangeListeners() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.changeListeners.clear();
            throw null;
        }
        this.changeListeners.clear();
        int i3 = TuitionPaymentFragmentbindingInflater1 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void addOnSliderTouchListener(T t) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.touchListeners.add(t);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void removeOnSliderTouchListener(T t) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.touchListeners.remove(t);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 66 / 0;
        }
    }

    public void clearOnSliderTouchListeners() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.touchListeners.clear();
        int i4 = TuitionPaymentFragmentbindingInflater1 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public boolean hasLabelFormatter() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 105;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        if (this.formatter == null) {
            return false;
        }
        int i5 = i3 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public void setLabelFormatter(LabelFormatter labelFormatter) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 17;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        this.formatter = labelFormatter;
        int i5 = i2 + 9;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public float getThumbElevation() {
        float elevation;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            elevation = this.defaultThumbDrawable.getElevation();
            int i3 = 39 / 0;
        } else {
            elevation = this.defaultThumbDrawable.getElevation();
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 57;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            return elevation;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setThumbElevation(float f) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.defaultThumbDrawable.setElevation(f);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setThumbElevationResource(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 71;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        setThumbElevation(getResources().getDimension(i));
        if (i4 == 0) {
            throw null;
        }
    }

    public int getThumbRadius() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 121;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2 == 0 ? this.thumbWidth << 2 : this.thumbWidth / 2;
        int i5 = i3 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public void setThumbRadius(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i * 2;
        setThumbWidth(i5);
        setThumbHeight(i5);
        int i6 = TuitionPaymentFragmentbindingInflater1 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 83 / 0;
        }
    }

    public void setThumbRadiusResource(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 101;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        setThumbRadius(getResources().getDimensionPixelSize(i));
        int i5 = TuitionPaymentFragmentbindingInflater1 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public int getThumbWidth() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.thumbWidth;
        if (i3 == 0) {
            int i5 = 59 / 0;
        }
        return i4;
    }

    public void setThumbWidth(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        if (i == this.thumbWidth) {
            return;
        }
        this.thumbWidth = i;
        this.defaultThumbDrawable.setShapeAppearanceModel(ShapeAppearanceModel.builder().setAllCorners(0, this.thumbWidth / 2.0f).build());
        this.defaultThumbDrawable.setBounds(0, 0, this.thumbWidth, this.thumbHeight);
        Drawable drawable = this.customThumbDrawable;
        if (drawable != null) {
            adjustCustomThumbDrawableBounds(drawable);
        }
        Iterator<Drawable> it = this.customThumbDrawablesForValues.iterator();
        while (it.hasNext()) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
            adjustCustomThumbDrawableBounds(it.next());
        }
        updateWidgetLayout();
    }

    public void setThumbWidthResource(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        setThumbWidth(getResources().getDimensionPixelSize(i));
        int i5 = TuitionPaymentFragmentbindingInflater1 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public int getThumbHeight() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 45;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        int i5 = this.thumbHeight;
        int i6 = i3 + 15;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public void setThumbHeight(int i) {
        int i2 = 2 % 2;
        if (i == this.thumbHeight) {
            return;
        }
        this.thumbHeight = i;
        this.defaultThumbDrawable.setBounds(0, 0, this.thumbWidth, i);
        Drawable drawable = this.customThumbDrawable;
        if (drawable != null) {
            adjustCustomThumbDrawableBounds(drawable);
            int i3 = TuitionPaymentFragmentbindingInflater1 + 51;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
        }
        Iterator<Drawable> it = this.customThumbDrawablesForValues.iterator();
        while (it.hasNext()) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 95;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
            adjustCustomThumbDrawableBounds(it.next());
        }
        updateWidgetLayout();
    }

    public void setThumbHeightResource(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 29;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        setThumbHeight(getResources().getDimensionPixelSize(i));
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 101;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setThumbStrokeColor(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.defaultThumbDrawable.setStrokeColor(colorStateList);
        postInvalidate();
        int i4 = TuitionPaymentFragmentbindingInflater1 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public void setThumbStrokeColorResource(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 73;
        int i4 = i3 % 128;
        TuitionPaymentFragmentbindingInflater1 = i4;
        int i5 = i3 % 2;
        if (i != 0) {
            int i6 = i4 + 115;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            if (i6 % 2 != 0) {
                setThumbStrokeColor(AppCompatResources.getColorStateList(getContext(), i));
                int i7 = 74 / 0;
            } else {
                setThumbStrokeColor(AppCompatResources.getColorStateList(getContext(), i));
            }
        }
        int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 7;
        TuitionPaymentFragmentbindingInflater1 = i8 % 128;
        int i9 = i8 % 2;
    }

    public ColorStateList getThumbStrokeColor() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        MaterialShapeDrawable materialShapeDrawable = this.defaultThumbDrawable;
        if (i3 == 0) {
            return materialShapeDrawable.getStrokeColor();
        }
        materialShapeDrawable.getStrokeColor();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setThumbStrokeWidth(float f) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.defaultThumbDrawable.setStrokeWidth(f);
        postInvalidate();
        int i4 = TuitionPaymentFragmentbindingInflater1 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setThumbStrokeWidthResource(int i) {
        int i2 = 2 % 2;
        if (i != 0) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 51;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            int i4 = i3 % 2;
            setThumbStrokeWidth(getResources().getDimension(i));
            int i5 = TuitionPaymentFragmentbindingInflater1 + 75;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public float getThumbStrokeWidth() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            this.defaultThumbDrawable.getStrokeWidth();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float strokeWidth = this.defaultThumbDrawable.getStrokeWidth();
        int i3 = TuitionPaymentFragmentbindingInflater1 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        return strokeWidth;
    }

    public int getHaloRadius() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.haloRadius;
        int i6 = i2 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 46 / 0;
        }
        return i5;
    }

    public void setHaloRadius(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 97 / 0;
            if (i == this.haloRadius) {
                return;
            }
        } else if (i == this.haloRadius) {
            return;
        }
        this.haloRadius = i;
        Drawable background = getBackground();
        if (!shouldDrawCompatHalo()) {
            int i5 = TuitionPaymentFragmentbindingInflater1 + 19;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
            if (background instanceof RippleDrawable) {
                DrawableUtils.setRippleDrawableRadius((RippleDrawable) background, this.haloRadius);
                int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
                TuitionPaymentFragmentbindingInflater1 = i7 % 128;
                int i8 = i7 % 2;
                return;
            }
        }
        postInvalidate();
    }

    public void setHaloRadiusResource(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        setHaloRadius(getResources().getDimensionPixelSize(i));
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 93 / 0;
        }
    }

    public int getLabelBehavior() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 83;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.labelBehavior;
        int i6 = i2 + 37;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public void setLabelBehavior(int i) {
        int i2 = 2 % 2;
        if (this.labelBehavior != i) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 31;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            int i4 = i3 % 2;
            this.labelBehavior = i;
            requestLayout();
        }
        int i5 = TuitionPaymentFragmentbindingInflater1 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private boolean shouldAlwaysShowLabel() {
        int i = 2 % 2;
        if (this.labelBehavior != 3) {
            return false;
        }
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public int getTrackSidePadding() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 55;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        int i5 = this.trackSidePadding;
        int i6 = i3 + 33;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public int getTrackWidth() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.trackWidth;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getTrackHeight() {
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = i3 + 25;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            i = this.trackHeight;
            int i5 = 47 / 0;
        } else {
            i = this.trackHeight;
        }
        int i6 = i3 + 15;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public void setTrackHeight(int i) throws Throwable {
        int i2 = 2 % 2;
        if (this.trackHeight != i) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 47;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            int i4 = i3 % 2;
            this.trackHeight = i;
            invalidateTrack();
            updateWidgetLayout();
            int i5 = TuitionPaymentFragmentbindingInflater1 + 119;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public int getTickActiveRadius() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 123;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.tickActiveRadius;
        int i6 = i2 + 111;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public void setTickActiveRadius(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
        int i4 = i3 % 128;
        TuitionPaymentFragmentbindingInflater1 = i4;
        if (i3 % 2 == 0) {
            int i5 = 49 / 0;
            if (this.tickActiveRadius == i) {
                return;
            }
        } else if (this.tickActiveRadius == i) {
            return;
        }
        int i6 = i4 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
        if (i6 % 2 != 0) {
            this.tickActiveRadius = i;
            this.activeTicksPaint.setStrokeWidth(i >> 5);
        } else {
            this.tickActiveRadius = i;
            this.activeTicksPaint.setStrokeWidth(i * 2);
        }
        updateWidgetLayout();
    }

    public int getTickInactiveRadius() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 89;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        int i5 = this.tickInactiveRadius;
        int i6 = i3 + 41;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public void setTickInactiveRadius(int i) {
        int i2 = 2 % 2;
        if (this.tickInactiveRadius != i) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 51;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            int i4 = i3 % 2;
            this.tickInactiveRadius = i;
            this.inactiveTicksPaint.setStrokeWidth(i * 2);
            updateWidgetLayout();
            int i5 = TuitionPaymentFragmentbindingInflater1 + 73;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    private void updateWidgetLayout() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        boolean zMaybeIncreaseWidgetHeight = maybeIncreaseWidgetHeight();
        boolean zMaybeIncreaseTrackSidePadding = maybeIncreaseTrackSidePadding();
        if (!zMaybeIncreaseWidgetHeight) {
            if (zMaybeIncreaseTrackSidePadding) {
                postInvalidate();
            }
        } else {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 67;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            requestLayout();
        }
    }

    private boolean maybeIncreaseWidgetHeight() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i4 = this.trackHeight;
        int i5 = this.thumbHeight;
        int paddingTop2 = getPaddingTop();
        int iMax = Math.max(this.minWidgetHeight, Math.max(i4 + paddingTop + paddingBottom, i5 + paddingTop2 + getPaddingBottom()));
        if (iMax != this.widgetHeight) {
            this.widgetHeight = iMax;
            return true;
        }
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 47;
        int i7 = i6 % 128;
        TuitionPaymentFragmentbindingInflater1 = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
        if (i9 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ColorStateList getHaloTintList() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        ColorStateList colorStateList = this.haloColor;
        int i5 = i2 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 98 / 0;
        }
        return colorStateList;
    }

    public void setHaloTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            colorStateList.equals(this.haloColor);
            obj.hashCode();
            throw null;
        }
        if (colorStateList.equals(this.haloColor)) {
            return;
        }
        this.haloColor = colorStateList;
        Drawable background = getBackground();
        if (shouldDrawCompatHalo() || !(background instanceof RippleDrawable)) {
            this.haloPaint.setColor(getColorForState(colorStateList));
            this.haloPaint.setAlpha(63);
            invalidate();
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 13;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            ((RippleDrawable) background).setColor(colorStateList);
        } else {
            ((RippleDrawable) background).setColor(colorStateList);
            throw null;
        }
    }

    public ColorStateList getThumbTintList() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        ColorStateList fillColor = this.defaultThumbDrawable.getFillColor();
        int i4 = TuitionPaymentFragmentbindingInflater1 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            return fillColor;
        }
        throw null;
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            colorStateList.equals(this.defaultThumbDrawable.getFillColor());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!colorStateList.equals(this.defaultThumbDrawable.getFillColor())) {
            this.defaultThumbDrawable.setFillColor(colorStateList);
            invalidate();
            return;
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 95;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 68 / 0;
        }
    }

    public ColorStateList getTickTintList() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 57;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        if (!this.tickColorInactive.equals(this.tickColorActive)) {
            throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i5 = i4 + 53;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        ColorStateList colorStateList = this.tickColorActive;
        int i7 = i4 + 59;
        TuitionPaymentFragmentbindingInflater1 = i7 % 128;
        int i8 = i7 % 2;
        return colorStateList;
    }

    public void setTickTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            setTickInactiveTintList(colorStateList);
            setTickActiveTintList(colorStateList);
        } else {
            setTickInactiveTintList(colorStateList);
            setTickActiveTintList(colorStateList);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public ColorStateList getTickActiveTintList() {
        ColorStateList colorStateList;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 29;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        if (i2 % 2 != 0) {
            colorStateList = this.tickColorActive;
            int i4 = 26 / 0;
        } else {
            colorStateList = this.tickColorActive;
        }
        int i5 = i3 + 57;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            return colorStateList;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setTickActiveTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        if (!colorStateList.equals(this.tickColorActive)) {
            this.tickColorActive = colorStateList;
            this.activeTicksPaint.setColor(getColorForState(colorStateList));
            invalidate();
        } else {
            int i4 = TuitionPaymentFragmentbindingInflater1 + 67;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public ColorStateList getTickInactiveTintList() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        ColorStateList colorStateList = this.tickColorInactive;
        int i5 = i2 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return colorStateList;
    }

    public void setTickInactiveTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 45 / 0;
            if (colorStateList.equals(this.tickColorInactive)) {
                return;
            }
        } else if (colorStateList.equals(this.tickColorInactive)) {
            return;
        }
        this.tickColorInactive = colorStateList;
        this.inactiveTicksPaint.setColor(getColorForState(colorStateList));
        invalidate();
        int i4 = TuitionPaymentFragmentbindingInflater1 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public boolean isTickVisible() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 67;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        boolean z = this.tickVisible;
        int i5 = i3 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 37 / 0;
        }
        return z;
    }

    public void setTickVisible(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        if (this.tickVisible != z) {
            int i5 = i2 + 111;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
            this.tickVisible = z;
            postInvalidate();
        }
        int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 15;
        TuitionPaymentFragmentbindingInflater1 = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 15 / 0;
        }
    }

    public ColorStateList getTrackTintList() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 125;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            this.trackColorInactive.equals(this.trackColorActive);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!this.trackColorInactive.equals(this.trackColorActive)) {
            throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
        }
        ColorStateList colorStateList = this.trackColorActive;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 99;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        return colorStateList;
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ColorStateList getTrackActiveTintList() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 55;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        ColorStateList colorStateList = this.trackColorActive;
        int i4 = i2 + 27;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return colorStateList;
    }

    public void setTrackActiveTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 91;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            colorStateList.equals(this.trackColorActive);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!colorStateList.equals(this.trackColorActive)) {
            this.trackColorActive = colorStateList;
            this.activeTrackPaint.setColor(getColorForState(colorStateList));
            this.stopIndicatorPaint.setColor(getColorForState(this.trackColorActive));
            invalidate();
            return;
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 43;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
    }

    public ColorStateList getTrackInactiveTintList() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        ColorStateList colorStateList = this.trackColorInactive;
        int i5 = i2 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 31 / 0;
        }
        return colorStateList;
    }

    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 5;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        if (!colorStateList.equals(this.trackColorInactive)) {
            this.trackColorInactive = colorStateList;
            this.inactiveTrackPaint.setColor(getColorForState(colorStateList));
            invalidate();
        } else {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 53;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public int getThumbTrackGapSize() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.thumbTrackGapSize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        r4.thumbTrackGapSize = r5;
        invalidate();
        r5 = com.google.android.material.slider.BaseSlider.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
        com.google.android.material.slider.BaseSlider.TuitionPaymentFragmentbindingInflater1 = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r4.thumbTrackGapSize == r5) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r4.thumbTrackGapSize == r5) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1 = r1 + 99;
        com.google.android.material.slider.BaseSlider.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setThumbTrackGapSize(int r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.material.slider.BaseSlider.TuitionPaymentFragmentbindingInflater1
            int r2 = r1 + 55
            int r3 = r2 % 128
            com.google.android.material.slider.BaseSlider.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L17
            int r2 = r4.thumbTrackGapSize
            r3 = 67
            int r3 = r3 / 0
            if (r2 != r5) goto L23
            goto L1b
        L17:
            int r2 = r4.thumbTrackGapSize
            if (r2 != r5) goto L23
        L1b:
            int r1 = r1 + 99
            int r5 = r1 % 128
            com.google.android.material.slider.BaseSlider.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r5
            int r1 = r1 % r0
            return
        L23:
            r4.thumbTrackGapSize = r5
            r4.invalidate()
            int r5 = com.google.android.material.slider.BaseSlider.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            int r5 = r5 + 83
            int r1 = r5 % 128
            com.google.android.material.slider.BaseSlider.TuitionPaymentFragmentbindingInflater1 = r1
            int r5 = r5 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.setThumbTrackGapSize(int):void");
    }

    public int getTrackStopIndicatorSize() {
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1;
        int i4 = i3 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            i = this.trackStopIndicatorSize;
            int i5 = 75 / 0;
        } else {
            i = this.trackStopIndicatorSize;
        }
        int i6 = i3 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
        if (i6 % 2 == 0) {
            return i;
        }
        throw null;
    }

    public void setTrackStopIndicatorSize(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
        int i4 = i3 % 128;
        TuitionPaymentFragmentbindingInflater1 = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.trackStopIndicatorSize != i) {
            this.trackStopIndicatorSize = i;
            this.stopIndicatorPaint.setStrokeWidth(i);
            invalidate();
        } else {
            int i5 = i4 + 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public int getTrackInsideCornerSize() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 39;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        int i5 = this.trackInsideCornerSize;
        int i6 = i3 + 45;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 7 / 0;
        }
        return i5;
    }

    public void setTrackInsideCornerSize(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 43;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        if (this.trackInsideCornerSize == i) {
            return;
        }
        this.trackInsideCornerSize = i;
        invalidate();
        int i5 = TuitionPaymentFragmentbindingInflater1 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        ViewOverlayImpl contentViewOverlay;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 23;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 == 0) {
            super.onVisibilityChanged(view, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        super.onVisibilityChanged(view, i);
        if (i == 0 || (contentViewOverlay = ViewUtils.getContentViewOverlay(this)) == null) {
            return;
        }
        int i4 = TuitionPaymentFragmentbindingInflater1 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        Iterator<TooltipDrawable> it = this.labels.iterator();
        while (it.hasNext()) {
            contentViewOverlay.remove(it.next());
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 45;
            TuitionPaymentFragmentbindingInflater1 = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 == 0) {
            super.setEnabled(z);
            throw null;
        }
        super.setEnabled(z);
        if (z) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 43;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            i = 0;
        }
        setLayerType(i, null);
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 93;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.onScrollChangedListener);
        Iterator<TooltipDrawable> it = this.labels.iterator();
        while (it.hasNext()) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 7;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            attachLabelToContentView(it.next());
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 61;
            TuitionPaymentFragmentbindingInflater1 = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    private void attachLabelToContentView(TooltipDrawable tooltipDrawable) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            tooltipDrawable.setRelativeToView(ViewUtils.getContentView(this));
            obj.hashCode();
            throw null;
        }
        tooltipDrawable.setRelativeToView(ViewUtils.getContentView(this));
        int i3 = TuitionPaymentFragmentbindingInflater1 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        BaseSlider<S, L, T>.AccessibilityEventSender accessibilityEventSender = this.accessibilityEventSender;
        if (accessibilityEventSender != null) {
            removeCallbacks(accessibilityEventSender);
            int i3 = TuitionPaymentFragmentbindingInflater1 + 113;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
        }
        this.labelsAreAnimatedIn = false;
        Iterator<TooltipDrawable> it = this.labels.iterator();
        while (it.hasNext()) {
            detachLabelFromContentView(it.next());
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.onScrollChangedListener);
        super.onDetachedFromWindow();
    }

    private void detachLabelFromContentView(TooltipDrawable tooltipDrawable) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 59;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            ViewUtils.getContentViewOverlay(this);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ViewOverlayImpl contentViewOverlay = ViewUtils.getContentViewOverlay(this);
        if (contentViewOverlay != null) {
            contentViewOverlay.remove(tooltipDrawable);
            tooltipDrawable.detachView(ViewUtils.getContentView(this));
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 15;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 4 % 5;
            }
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 109;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0021  */
    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int intrinsicHeight;
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentbindingInflater1;
        int i5 = i4 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = this.widgetHeight;
        if (this.labelBehavior != 1) {
            int i8 = i4 + 103;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
            int i9 = i8 % 2;
            intrinsicHeight = shouldAlwaysShowLabel() ? this.labels.get(0).getIntrinsicHeight() : 0;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i7 + intrinsicHeight, BasicMeasure.EXACTLY));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = TuitionPaymentFragmentbindingInflater1 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
        if (i6 % 2 == 0) {
            updateTrackWidth(i);
            updateHaloHotspot();
        } else {
            updateTrackWidth(i);
            updateHaloHotspot();
            int i7 = 26 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003e  */
    private void maybeCalculateTicksCoordinates() {
        int i = 2 % 2;
        if (this.stepSize > 0.0f) {
            validateConfigurationIfDirty();
            int iMin = Math.min((int) (((this.valueTo - this.valueFrom) / this.stepSize) + 1.0f), (this.trackWidth / this.minTickSpacing) + 1);
            float[] fArr = this.ticksCoordinates;
            if (fArr != null) {
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 9;
                TuitionPaymentFragmentbindingInflater1 = i2 % 128;
                if (i2 % 2 != 0 ? fArr.length != iMin * 2 : fArr.length != iMin / 2) {
                    this.ticksCoordinates = new float[iMin * 2];
                    int i3 = TuitionPaymentFragmentbindingInflater1 + 65;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
                    int i4 = i3 % 2;
                }
            } else {
                this.ticksCoordinates = new float[iMin * 2];
                int i5 = TuitionPaymentFragmentbindingInflater1 + 65;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
                int i6 = i5 % 2;
            }
            float f = this.trackWidth / (iMin - 1);
            for (int i7 = 0; i7 < iMin * 2; i7 += 2) {
                float[] fArr2 = this.ticksCoordinates;
                fArr2[i7] = this.trackSidePadding + ((i7 / 2.0f) * f);
                fArr2[i7 + 1] = calculateTrackCenter();
            }
        }
    }

    private void updateTrackWidth(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 45;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        this.trackWidth = Math.max(i - (this.trackSidePadding * 2), 0);
        maybeCalculateTicksCoordinates();
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 29;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 57 / 0;
        }
    }

    private void updateHaloHotspot() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            shouldDrawCompatHalo();
            throw null;
        }
        if (shouldDrawCompatHalo() || getMeasuredWidth() <= 0) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 109;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            int i4 = i3 % 2;
            int iNormalizeValue = (int) ((normalizeValue(this.values.get(this.focusedThumbIdx).floatValue()) * this.trackWidth) + this.trackSidePadding);
            int iCalculateTrackCenter = calculateTrackCenter();
            int i5 = this.haloRadius;
            DrawableCompat.setHotspotBounds(background, iNormalizeValue - i5, iCalculateTrackCenter - i5, iNormalizeValue + i5, iCalculateTrackCenter + i5);
        }
    }

    private int calculateTrackCenter() {
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 45;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int intrinsicHeight = 1;
        if (i3 % 2 == 0) {
            i = this.widgetHeight * 4;
            if (this.labelBehavior != 0) {
                if (shouldAlwaysShowLabel()) {
                }
            }
            return i + intrinsicHeight;
        }
        i = this.widgetHeight / 2;
        if (this.labelBehavior != 1) {
            intrinsicHeight = 0;
            if (shouldAlwaysShowLabel()) {
            }
        }
        return i + intrinsicHeight;
        intrinsicHeight = this.labels.get(0).getIntrinsicHeight();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 5;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return i + intrinsicHeight;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005b  */
    @Override // android.view.View
    protected void onDraw(Canvas canvas) throws Throwable {
        int i = 2 % 2;
        if (this.dirtyConfig) {
            validateConfigurationIfDirty();
            maybeCalculateTicksCoordinates();
        }
        super.onDraw(canvas);
        int iCalculateTrackCenter = calculateTrackCenter();
        float fFloatValue = this.values.get(0).floatValue();
        ArrayList<Float> arrayList = this.values;
        float fFloatValue2 = arrayList.get(arrayList.size() - 1).floatValue();
        if (fFloatValue2 >= this.valueTo) {
            int i2 = TuitionPaymentFragmentbindingInflater1 + 15;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            if (i2 % 2 == 0 ? this.values.size() > 1 : this.values.size() > 0) {
                if (fFloatValue > this.valueFrom) {
                    drawInactiveTrack(canvas, this.trackWidth, iCalculateTrackCenter);
                }
            }
        } else {
            drawInactiveTrack(canvas, this.trackWidth, iCalculateTrackCenter);
        }
        if (fFloatValue2 > this.valueFrom) {
            drawActiveTrack(canvas, this.trackWidth, iCalculateTrackCenter);
        }
        maybeDrawTicks(canvas);
        maybeDrawStopIndicator(canvas, iCalculateTrackCenter);
        if ((this.thumbIsPressed || isFocused()) && isEnabled()) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            if (i3 % 2 == 0) {
                maybeDrawCompatHalo(canvas, this.trackWidth, iCalculateTrackCenter);
                throw null;
            }
            maybeDrawCompatHalo(canvas, this.trackWidth, iCalculateTrackCenter);
        }
        updateLabels();
        drawThumbs(canvas, this.trackWidth, iCalculateTrackCenter);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    private float[] getActiveRange() {
        int i = 2 % 2;
        float fFloatValue = this.values.get(0).floatValue();
        ArrayList<Float> arrayList = this.values;
        float fFloatValue2 = arrayList.get(arrayList.size() - 1).floatValue();
        if (this.values.size() == 1) {
            fFloatValue = this.valueFrom;
        }
        float fNormalizeValue = normalizeValue(fFloatValue);
        float fNormalizeValue2 = normalizeValue(fFloatValue2);
        if (!isRtl()) {
            return new float[]{fNormalizeValue, fNormalizeValue2};
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 47;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        float[] fArr = {fNormalizeValue2, fNormalizeValue};
        int i5 = i2 + 69;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            return fArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0078, code lost:
    
        if (hasGapBetweenThumbAndTrack() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007f, code lost:
    
        if (hasGapBetweenThumbAndTrack() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0081, code lost:
    
        r14 = com.google.android.material.slider.BaseSlider.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 29;
        com.google.android.material.slider.BaseSlider.TuitionPaymentFragmentbindingInflater1 = r14 % 128;
        r14 = r14 % 2;
        r14 = r12.trackRect;
        r0 = r12.trackSidePadding;
        r1 = r12.trackHeight / 2.0f;
        r15 = r15;
        r14.set(r0 - r1, r15 - r1, r7 - r12.thumbTrackGapSize, r15 + r1);
        updateTrack(r13, r12.inactiveTrackPaint, r12.trackRect, com.google.android.material.slider.BaseSlider.FullCornerDirection.LEFT);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a9, code lost:
    
        r12.inactiveTrackPaint.setStyle(android.graphics.Paint.Style.STROKE);
        r12.inactiveTrackPaint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        r8 = r15;
        r13.drawLine(r12.trackSidePadding, r8, r7, r8, r12.inactiveTrackPaint);
        r13 = com.google.android.material.slider.BaseSlider.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 103;
        com.google.android.material.slider.BaseSlider.TuitionPaymentFragmentbindingInflater1 = r13 % 128;
        r13 = r13 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00cb, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void drawInactiveTrack(android.graphics.Canvas r13, int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.drawInactiveTrack(android.graphics.Canvas, int, int):void");
    }

    private float normalizeValue(float f) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        float f2 = this.valueFrom;
        float f3 = (f - f2) / (this.valueTo - f2);
        if (isRtl()) {
            return 1.0f - f3;
        }
        int i4 = TuitionPaymentFragmentbindingInflater1 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return f3;
    }

    /* JADX INFO: renamed from: com.google.android.material.slider.BaseSlider$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$material$slider$BaseSlider$FullCornerDirection;

        static {
            int[] iArr = new int[FullCornerDirection.values().length];
            $SwitchMap$com$google$android$material$slider$BaseSlider$FullCornerDirection = iArr;
            try {
                iArr[FullCornerDirection.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$android$material$slider$BaseSlider$FullCornerDirection[FullCornerDirection.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$android$material$slider$BaseSlider$FullCornerDirection[FullCornerDirection.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$android$material$slider$BaseSlider$FullCornerDirection[FullCornerDirection.BOTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f4 A[SYNTHETIC] */
    private void drawActiveTrack(Canvas canvas, int i, int i2) {
        int i3;
        int i4 = 2 % 2;
        float[] activeRange = getActiveRange();
        float f = this.trackSidePadding;
        float f2 = i;
        float f3 = f + (activeRange[1] * f2);
        float fValueToX = f + (activeRange[0] * f2);
        if (!hasGapBetweenThumbAndTrack()) {
            this.activeTrackPaint.setStyle(Paint.Style.STROKE);
            this.activeTrackPaint.setStrokeCap(Paint.Cap.ROUND);
            float f4 = i2;
            canvas.drawLine(fValueToX, f4, f3, f4, this.activeTrackPaint);
            return;
        }
        FullCornerDirection fullCornerDirection = FullCornerDirection.NONE;
        if (this.values.size() == 1) {
            if (isRtl()) {
                int i5 = TuitionPaymentFragmentbindingInflater1 + 71;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
                int i6 = i5 % 2;
                fullCornerDirection = FullCornerDirection.RIGHT;
            } else {
                fullCornerDirection = FullCornerDirection.LEFT;
            }
        }
        for (int i7 = 0; i7 < this.values.size(); i7++) {
            if (this.values.size() > 1) {
                if (i7 > 0) {
                    int i8 = TuitionPaymentFragmentbindingInflater1 + 39;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
                    int i9 = i8 % 2;
                    fValueToX = valueToX(this.values.get(i7 - 1).floatValue());
                }
                float fValueToX2 = valueToX(this.values.get(i7).floatValue());
                if (!(!isRtl())) {
                    int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 71;
                    TuitionPaymentFragmentbindingInflater1 = i10 % 128;
                    int i11 = i10 % 2;
                    f3 = fValueToX;
                    fValueToX = fValueToX2;
                } else {
                    f3 = fValueToX2;
                }
            }
            int i12 = AnonymousClass3.$SwitchMap$com$google$android$material$slider$BaseSlider$FullCornerDirection[fullCornerDirection.ordinal()];
            if (i12 != 1) {
                int i13 = TuitionPaymentFragmentbindingInflater1 + 57;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i13 % 128;
                if (i13 % 2 == 0 ? i12 == 2 : i12 == 5) {
                    fValueToX -= this.trackHeight / 2.0f;
                    i3 = this.thumbTrackGapSize;
                } else if (i12 == 3) {
                    fValueToX += this.thumbTrackGapSize;
                    f3 += this.trackHeight / 2.0f;
                }
                if (fValueToX < f3) {
                    RectF rectF = this.trackRect;
                    float f5 = i2;
                    float f6 = this.trackHeight / 2.0f;
                    rectF.set(fValueToX, f5 - f6, f3, f5 + f6);
                    updateTrack(canvas, this.activeTrackPaint, this.trackRect, fullCornerDirection);
                }
            } else {
                i3 = this.thumbTrackGapSize;
                fValueToX += i3;
            }
            f3 -= i3;
            if (fValueToX < f3) {
                RectF rectF2 = this.trackRect;
                float f7 = i2;
                float f8 = this.trackHeight / 2.0f;
                rectF2.set(fValueToX, f7 - f8, f3, f7 + f8);
                updateTrack(canvas, this.activeTrackPaint, this.trackRect, fullCornerDirection);
            }
        }
    }

    private boolean hasGapBetweenThumbAndTrack() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 89;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (this.thumbTrackGapSize <= 0) {
            return false;
        }
        int i4 = i3 + 1;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            return true;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0058  */
    /* JADX WARN: Code duplicated, block: B:19:0x0069  */
    /* JADX WARN: Code duplicated, block: B:21:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x008c  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:29:? A[RETURN, SYNTHETIC] */
    private void updateTrack(Canvas canvas, Paint paint, RectF rectF, FullCornerDirection fullCornerDirection) {
        int i;
        float f;
        float fMax;
        int i2;
        int i3;
        float f2;
        int i4 = 2 % 2;
        float f3 = this.trackHeight / 2.0f;
        int i5 = AnonymousClass3.$SwitchMap$com$google$android$material$slider$BaseSlider$FullCornerDirection[fullCornerDirection.ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                i = this.trackInsideCornerSize;
            } else if (i5 == 3) {
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
                TuitionPaymentFragmentbindingInflater1 = i6 % 128;
                if (i6 % 2 == 0) {
                    f2 = this.trackInsideCornerSize;
                    int i7 = 99 / 0;
                } else {
                    f2 = this.trackInsideCornerSize;
                }
                float f4 = f2;
                f = f3;
                f3 = f4;
            } else {
                f = f3;
            }
            paint.setStyle(Paint.Style.FILL);
            paint.setStrokeCap(Paint.Cap.BUTT);
            paint.setAntiAlias(true);
            this.trackPath.reset();
            if (rectF.width() >= f3 + f) {
                this.trackPath.addRoundRect(rectF, getCornerRadii(f3, f), Path.Direction.CW);
                canvas.drawPath(this.trackPath, paint);
                return;
            }
            float fMin = Math.min(f3, f);
            fMax = Math.max(f3, f);
            canvas.save();
            this.trackPath.addRoundRect(rectF, fMin, fMin, Path.Direction.CW);
            canvas.clipPath(this.trackPath);
            i2 = AnonymousClass3.$SwitchMap$com$google$android$material$slider$BaseSlider$FullCornerDirection[fullCornerDirection.ordinal()];
            if (i2 != 2) {
                this.cornerRect.set(rectF.left, rectF.top, rectF.left + (2.0f * fMax), rectF.bottom);
                int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 93;
                TuitionPaymentFragmentbindingInflater1 = i8 % 128;
                int i9 = i8 % 2;
            } else if (i2 != 3) {
                int i10 = TuitionPaymentFragmentbindingInflater1 + 75;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
                int i11 = i10 % 2;
                this.cornerRect.set(rectF.centerX() - fMax, rectF.top, rectF.centerX() + fMax, rectF.bottom);
            } else {
                this.cornerRect.set(rectF.right - (2.0f * fMax), rectF.top, rectF.right, rectF.bottom);
            }
            canvas.drawRoundRect(this.cornerRect, fMax, fMax, paint);
            canvas.restore();
            i3 = TuitionPaymentFragmentbindingInflater1 + 31;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            if (i3 % 2 != 0) {
                int i12 = 29 / 0;
            }
        }
        i = this.trackInsideCornerSize;
        f3 = i;
        f = i;
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        this.trackPath.reset();
        if (rectF.width() >= f3 + f) {
            this.trackPath.addRoundRect(rectF, getCornerRadii(f3, f), Path.Direction.CW);
            canvas.drawPath(this.trackPath, paint);
            return;
        }
        float fMin2 = Math.min(f3, f);
        fMax = Math.max(f3, f);
        canvas.save();
        this.trackPath.addRoundRect(rectF, fMin2, fMin2, Path.Direction.CW);
        canvas.clipPath(this.trackPath);
        i2 = AnonymousClass3.$SwitchMap$com$google$android$material$slider$BaseSlider$FullCornerDirection[fullCornerDirection.ordinal()];
        if (i2 != 2) {
            this.cornerRect.set(rectF.left, rectF.top, rectF.left + (2.0f * fMax), rectF.bottom);
            int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 93;
            TuitionPaymentFragmentbindingInflater1 = i13 % 128;
            int i14 = i13 % 2;
        } else if (i2 != 3) {
            int i15 = TuitionPaymentFragmentbindingInflater1 + 75;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i15 % 128;
            int i16 = i15 % 2;
            this.cornerRect.set(rectF.centerX() - fMax, rectF.top, rectF.centerX() + fMax, rectF.bottom);
        } else {
            this.cornerRect.set(rectF.right - (2.0f * fMax), rectF.top, rectF.right, rectF.bottom);
        }
        canvas.drawRoundRect(this.cornerRect, fMax, fMax, paint);
        canvas.restore();
        i3 = TuitionPaymentFragmentbindingInflater1 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            int i17 = 29 / 0;
        }
    }

    private float[] getCornerRadii(float f, float f2) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        float[] fArr = {f, f, f2, f2, f2, f2, f, f};
        int i5 = i3 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 79 / 0;
        }
        return fArr;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x007a A[PHI: r1 r2
  0x007a: PHI (r1v10 int) = (r1v9 int), (r1v17 int) binds: [B:17:0x0078, B:14:0x0052] A[DONT_GENERATE, DONT_INLINE]
  0x007a: PHI (r2v8 int) = (r2v7 int), (r2v17 int) binds: [B:17:0x0078, B:14:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0085  */
    /* JADX WARN: Code duplicated, block: B:21:0x008f  */
    private void maybeDrawTicks(Canvas canvas) {
        int iFloor;
        int iCeil;
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = i3 + 55;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 88 / 0;
            if (!this.tickVisible) {
                return;
            }
        } else if (!this.tickVisible) {
            return;
        }
        if (this.stepSize > 0.0f) {
            int i6 = i3 + 121;
            TuitionPaymentFragmentbindingInflater1 = i6 % 128;
            if (i6 % 2 == 0) {
                float[] activeRange = getActiveRange();
                iCeil = (int) Math.ceil(activeRange[1] + ((this.ticksCoordinates.length * 0.0f) / 2.0f));
                iFloor = (int) Math.floor(activeRange[0] * ((this.ticksCoordinates.length / 1.0f) + 1.0f));
                if (iCeil > 0) {
                    i = TuitionPaymentFragmentbindingInflater1 + 11;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
                    if (i % 2 != 0) {
                        canvas.drawPoints(this.ticksCoordinates, 0, iCeil >>> 3, this.inactiveTicksPaint);
                    } else {
                        canvas.drawPoints(this.ticksCoordinates, 0, iCeil * 2, this.inactiveTicksPaint);
                    }
                }
            } else {
                float[] activeRange2 = getActiveRange();
                int iCeil2 = (int) Math.ceil(activeRange2[0] * ((this.ticksCoordinates.length / 2.0f) - 1.0f));
                iFloor = (int) Math.floor(activeRange2[1] * ((this.ticksCoordinates.length / 2.0f) - 1.0f));
                iCeil = iCeil2;
                if (iCeil2 > 0) {
                    i = TuitionPaymentFragmentbindingInflater1 + 11;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
                    if (i % 2 != 0) {
                        canvas.drawPoints(this.ticksCoordinates, 0, iCeil >>> 3, this.inactiveTicksPaint);
                    } else {
                        canvas.drawPoints(this.ticksCoordinates, 0, iCeil * 2, this.inactiveTicksPaint);
                    }
                }
            }
            if (iCeil <= iFloor) {
                int i7 = TuitionPaymentFragmentbindingInflater1 + 99;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
                if (i7 % 2 != 0) {
                    canvas.drawPoints(this.ticksCoordinates, iCeil >>> 5, ((iFloor - iCeil) >> 1) + 5, this.activeTicksPaint);
                } else {
                    canvas.drawPoints(this.ticksCoordinates, iCeil * 2, ((iFloor - iCeil) + 1) * 2, this.activeTicksPaint);
                }
            }
            int i8 = (iFloor + 1) * 2;
            float[] fArr = this.ticksCoordinates;
            if (i8 < fArr.length) {
                int i9 = TuitionPaymentFragmentbindingInflater1 + 81;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
                int i10 = i9 % 2;
                int length = fArr.length;
                canvas.drawPoints(fArr, i8, i10 != 0 ? length + i8 : length - i8, this.inactiveTicksPaint);
            }
        }
    }

    private void maybeDrawStopIndicator(Canvas canvas, int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 23;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        if (this.trackStopIndicatorSize > 0) {
            if (this.values.size() > 0) {
                ArrayList<Float> arrayList = this.values;
                float fFloatValue = arrayList.get(arrayList.size() - 1).floatValue();
                float f = this.valueTo;
                if (fFloatValue < f) {
                    canvas.drawPoint(valueToX(f), i, this.stopIndicatorPaint);
                }
            }
            if (this.values.size() > 1) {
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 9;
                TuitionPaymentFragmentbindingInflater1 = i5 % 128;
                int i6 = i5 % 2;
                float fFloatValue2 = this.values.get(0).floatValue();
                float f2 = this.valueFrom;
                if (fFloatValue2 > f2) {
                    canvas.drawPoint(valueToX(f2), i, this.stopIndicatorPaint);
                    int i7 = TuitionPaymentFragmentbindingInflater1 + 3;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
                    int i8 = i7 % 2;
                }
            }
        }
        int i9 = TuitionPaymentFragmentbindingInflater1 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
        if (i9 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void drawThumbs(Canvas canvas, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = 0;
        while (i4 < this.values.size()) {
            int i5 = TuitionPaymentFragmentbindingInflater1 + 119;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            if (i5 % 2 != 0) {
                this.values.get(i4).floatValue();
                throw null;
            }
            float fFloatValue = this.values.get(i4).floatValue();
            Drawable drawable = this.customThumbDrawable;
            if (drawable != null) {
                drawThumbDrawable(canvas, i, i2, fFloatValue, drawable);
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 9;
                TuitionPaymentFragmentbindingInflater1 = i6 % 128;
                int i7 = i6 % 2;
            } else if (i4 < this.customThumbDrawablesForValues.size()) {
                drawThumbDrawable(canvas, i, i2, fFloatValue, this.customThumbDrawablesForValues.get(i4));
            } else {
                if (!isEnabled()) {
                    canvas.drawCircle(this.trackSidePadding + (normalizeValue(fFloatValue) * i), i2, getThumbRadius(), this.thumbPaint);
                }
                drawThumbDrawable(canvas, i, i2, fFloatValue, this.defaultThumbDrawable);
            }
            i4++;
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
            TuitionPaymentFragmentbindingInflater1 = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 5 / 5;
            }
        }
    }

    private void drawThumbDrawable(Canvas canvas, int i, int i2, float f, Drawable drawable) {
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 29;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        canvas.save();
        canvas.translate((this.trackSidePadding + ((int) (normalizeValue(f) * i))) - (drawable.getBounds().width() / 2.0f), i2 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 79;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 62 / 0;
        }
    }

    private void maybeDrawCompatHalo(Canvas canvas, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 115;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        if (shouldDrawCompatHalo()) {
            int iNormalizeValue = (int) (this.trackSidePadding + (normalizeValue(this.values.get(this.focusedThumbIdx).floatValue()) * i));
            if (Build.VERSION.SDK_INT < 28) {
                int i6 = TuitionPaymentFragmentbindingInflater1 + 97;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
                int i7 = i6 % 2;
                int i8 = this.haloRadius;
                canvas.clipRect(iNormalizeValue - i8, i2 - i8, iNormalizeValue + i8, i8 + i2, Region.Op.UNION);
            }
            canvas.drawCircle(iNormalizeValue, i2, this.haloRadius, this.haloPaint);
        }
    }

    private boolean shouldDrawCompatHalo() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 5;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        if (this.forceDrawCompatHalo || (!(getBackground() instanceof RippleDrawable))) {
            return true;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        return i4 % 2 == 0;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0090  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:47:0x0103  */
    /* JADX WARN: Code duplicated, block: B:61:0x0156  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        int i;
        int i2;
        int i3 = 2 % 2;
        if (!isEnabled()) {
            int i4 = TuitionPaymentFragmentbindingInflater1 + 17;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        float x = motionEvent.getX();
        float f = (x - this.trackSidePadding) / this.trackWidth;
        this.touchPosition = f;
        float fMax = Math.max(0.0f, f);
        this.touchPosition = fMax;
        this.touchPosition = Math.min(1.0f, fMax);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.touchDownX = x;
            if (!isPotentialVerticalScroll(motionEvent)) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (pickActiveThumb()) {
                    int i6 = TuitionPaymentFragmentbindingInflater1 + 11;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
                    if (i6 % 2 != 0) {
                        requestFocus();
                        this.thumbIsPressed = false;
                        snapTouchPosition();
                        updateHaloHotspot();
                        if (hasGapBetweenThumbAndTrack()) {
                            int i7 = this.thumbWidth;
                            this.defaultThumbWidth = i7;
                            this.defaultThumbTrackGapSize = this.thumbTrackGapSize;
                            int iRound = Math.round(i7 * 0.5f);
                            int i8 = this.thumbWidth;
                            setThumbWidth(iRound);
                            setThumbTrackGapSize(this.thumbTrackGapSize - ((i8 - iRound) / 2));
                        }
                    } else {
                        requestFocus();
                        this.thumbIsPressed = true;
                        snapTouchPosition();
                        updateHaloHotspot();
                        if (!(!hasGapBetweenThumbAndTrack())) {
                            int i9 = this.thumbWidth;
                            this.defaultThumbWidth = i9;
                            this.defaultThumbTrackGapSize = this.thumbTrackGapSize;
                            int iRound2 = Math.round(i9 * 0.5f);
                            int i10 = this.thumbWidth;
                            setThumbWidth(iRound2);
                            setThumbTrackGapSize(this.thumbTrackGapSize - ((i10 - iRound2) / 2));
                        }
                    }
                    invalidate();
                    onStartTrackingTouch();
                }
            }
        } else if (actionMasked != 1) {
            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 57;
            int i12 = i11 % 128;
            TuitionPaymentFragmentbindingInflater1 = i12;
            int i13 = i11 % 2;
            if (actionMasked == 2) {
                if (!this.thumbIsPressed) {
                    if (isPotentialVerticalScroll(motionEvent)) {
                        int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 25;
                        TuitionPaymentFragmentbindingInflater1 = i14 % 128;
                        int i15 = i14 % 2;
                        if (Math.abs(x - this.touchDownX) < this.scaledTouchSlop) {
                            int i16 = TuitionPaymentFragmentbindingInflater1 + 99;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i16 % 128;
                            int i17 = i16 % 2;
                            return false;
                        }
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    onStartTrackingTouch();
                }
                if (pickActiveThumb()) {
                    this.thumbIsPressed = true;
                    snapTouchPosition();
                    updateHaloHotspot();
                    invalidate();
                }
            } else if (actionMasked != 3) {
                int i18 = i12 + 3;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i18 % 128;
                int i19 = i18 % 2;
            } else {
                this.thumbIsPressed = false;
                motionEvent2 = this.lastEvent;
                if (motionEvent2 != null && motionEvent2.getActionMasked() == 0 && Math.abs(this.lastEvent.getX() - motionEvent.getX()) <= this.scaledTouchSlop && Math.abs(this.lastEvent.getY() - motionEvent.getY()) <= this.scaledTouchSlop && pickActiveThumb()) {
                    onStartTrackingTouch();
                }
                if (this.activeThumbIdx != -1) {
                    i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 31;
                    TuitionPaymentFragmentbindingInflater1 = i % 128;
                    if (i % 2 != 0) {
                        snapTouchPosition();
                        updateHaloHotspot();
                        hasGapBetweenThumbAndTrack();
                        throw null;
                    }
                    snapTouchPosition();
                    updateHaloHotspot();
                    if (hasGapBetweenThumbAndTrack() && (i2 = this.defaultThumbWidth) != -1 && this.defaultThumbTrackGapSize != -1) {
                        setThumbWidth(i2);
                        setThumbTrackGapSize(this.defaultThumbTrackGapSize);
                    }
                    this.activeThumbIdx = -1;
                    onStopTrackingTouch();
                }
                invalidate();
            }
        } else {
            this.thumbIsPressed = false;
            motionEvent2 = this.lastEvent;
            if (motionEvent2 != null) {
                onStartTrackingTouch();
            }
            if (this.activeThumbIdx != -1) {
                i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 31;
                TuitionPaymentFragmentbindingInflater1 = i % 128;
                if (i % 2 != 0) {
                    snapTouchPosition();
                    updateHaloHotspot();
                    hasGapBetweenThumbAndTrack();
                    throw null;
                }
                snapTouchPosition();
                updateHaloHotspot();
                if (hasGapBetweenThumbAndTrack()) {
                    setThumbWidth(i2);
                    setThumbTrackGapSize(this.defaultThumbTrackGapSize);
                }
                this.activeThumbIdx = -1;
                onStopTrackingTouch();
            }
            invalidate();
        }
        setPressed(this.thumbIsPressed);
        this.lastEvent = MotionEvent.obtain(motionEvent);
        return true;
    }

    private double snapPosition(float f) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 5;
        int i4 = i3 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4;
        int i5 = i3 % 2;
        float f2 = this.stepSize;
        if (f2 <= 0.0f) {
            double d = f;
            int i6 = i4 + 49;
            TuitionPaymentFragmentbindingInflater1 = i6 % 128;
            int i7 = i6 % 2;
            return d;
        }
        int i8 = i2 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = (int) ((this.valueTo * this.valueFrom) + f2);
            return ((double) Math.round(f / i9)) + ((double) i9);
        }
        int i10 = (int) ((this.valueTo - this.valueFrom) / f2);
        return ((double) Math.round(f * i10)) / ((double) i10);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0080  */
    protected boolean pickActiveThumb() throws Throwable {
        boolean z;
        int i = 2 % 2;
        if (this.activeThumbIdx != -1) {
            int i2 = TuitionPaymentFragmentbindingInflater1 + 21;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        float valueOfTouchPositionAbsolute = getValueOfTouchPositionAbsolute();
        float fValueToX = valueToX(valueOfTouchPositionAbsolute);
        this.activeThumbIdx = 0;
        float fAbs = Math.abs(this.values.get(0).floatValue() - valueOfTouchPositionAbsolute);
        for (int i4 = 1; i4 < this.values.size(); i4++) {
            float fAbs2 = Math.abs(this.values.get(i4).floatValue() - valueOfTouchPositionAbsolute);
            float fValueToX2 = valueToX(this.values.get(i4).floatValue());
            if (Float.compare(fAbs2, fAbs) > 0) {
                break;
            }
            if (!(!isRtl())) {
                if (fValueToX2 - fValueToX > 0.0f) {
                    int i5 = TuitionPaymentFragmentbindingInflater1 + 71;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
                    int i6 = i5 % 2;
                    z = true;
                } else {
                    z = false;
                }
            } else if (fValueToX2 - fValueToX < 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (Float.compare(fAbs2, fAbs) < 0) {
                int i7 = TuitionPaymentFragmentbindingInflater1 + 59;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
                int i8 = i7 % 2;
                this.activeThumbIdx = i4;
            } else {
                if (Float.compare(fAbs2, fAbs) != 0) {
                    continue;
                } else {
                    if (Math.abs(fValueToX2 - fValueToX) < this.scaledTouchSlop) {
                        this.activeThumbIdx = -1;
                        int i9 = TuitionPaymentFragmentbindingInflater1 + 5;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
                        if (i9 % 2 == 0) {
                            return false;
                        }
                        throw null;
                    }
                    if (z) {
                        int i10 = TuitionPaymentFragmentbindingInflater1;
                        int i11 = i10 + 89;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                        int i12 = i11 % 2;
                        this.activeThumbIdx = i4;
                        int i13 = i10 + 85;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i13 % 128;
                        int i14 = i13 % 2;
                    }
                }
            }
            fAbs = fAbs2;
        }
        if (this.activeThumbIdx == -1) {
            return false;
        }
        int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
        TuitionPaymentFragmentbindingInflater1 = i15 % 128;
        int i16 = i15 % 2;
        return true;
    }

    private float getValueOfTouchPositionAbsolute() throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int i4 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 875;
            int keyRepeatDelay = 10 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            c((byte) (bArr[21] - 1), (byte) (bArr[12] + 1), bArr[18], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i4, keyRepeatDelay, -1199417970, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        d(new int[]{0, 22, 0, 0}, true, new byte[]{1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        d(new int[]{22, 15, 178, 13}, false, new byte[]{1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
            int maximumFlingVelocity = 876 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int iLastIndexOf = 9 - TextUtils.lastIndexOf("", '0');
            byte[] bArr2 = $$a;
            Object[] objArr6 = new Object[1];
            c((byte) 52, bArr2[7], bArr2[2], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionType, maximumFlingVelocity, iLastIndexOf, 254769921, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                int iResolveSize = 876 - View.resolveSize(0, 0);
                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 10;
                byte[] bArr3 = $$a;
                byte b2 = (byte) (bArr3[61] + 1);
                Object[] objArr7 = new Object[1];
                c(b2, (byte) (b2 & 31), bArr3[2], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, iResolveSize, offsetAfter, 1324201839, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
            int i5 = (~Process.myUid()) | 611178619;
            int i6 = 2066809772 + (i5 * 495) + (((~i5) | 73996377) * 495) + 2045466041;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[1])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            d(new int[]{37, 16, 164, 2}, false, new byte[]{1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1}, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            d(new int[]{53, 16, 0, 0}, false, new byte[]{1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1}, objArr10);
            try {
                Object[] objArr11 = {Integer.valueOf(((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue()), 2045466041};
                byte[] bArr4 = $$g;
                byte b3 = bArr4[38];
                byte b4 = b3;
                Object[] objArr12 = new Object[1];
                e(b4, (byte) (b4 | 81), b3, objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                Object[] objArr13 = new Object[1];
                e((byte) ($$h & 347), bArr4[38], bArr4[3], objArr13);
                Object[] objArr14 = (Object[]) cls3.getMethod((String) objArr13[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                    int iIndexOf = 875 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 10;
                    byte[] bArr5 = $$a;
                    byte b5 = (byte) (bArr5[61] + 1);
                    Object[] objArr15 = new Object[1];
                    c(b5, (byte) (b5 & 31), bArr5[2], objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf, iIndexOf, touchSlop, 1324201839, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr14);
                try {
                    Object[] objArr16 = new Object[1];
                    d(new int[]{0, 22, 0, 0}, true, new byte[]{1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, objArr16);
                    Class<?> cls4 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    d(new int[]{22, 15, 178, 13}, false, new byte[]{1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1}, objArr17);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char gidForName = (char) (Process.getGidForName("") + 1);
                        int iNormalizeMetaState = 876 - KeyEvent.normalizeMetaState(0);
                        int iIndexOf2 = 10 - TextUtils.indexOf("", "", 0, 0);
                        byte[] bArr6 = $$a;
                        Object[] objArr18 = new Object[1];
                        c((byte) 52, bArr6[7], bArr6[2], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(gidForName, iNormalizeMetaState, iIndexOf2, 254769921, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char trimmedLength = (char) TextUtils.getTrimmedLength("");
                        int i9 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 876;
                        int i10 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 9;
                        byte[] bArr7 = $$a;
                        Object[] objArr19 = new Object[1];
                        c((byte) (bArr7[21] - 1), (byte) (bArr7[12] + 1), bArr7[18], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(trimmedLength, i9, i10, -1199417970, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr14;
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
        int i11 = ((int[]) objArr[2])[0];
        int i12 = ((int[]) objArr[0])[0];
        if (i12 == i11) {
            int i13 = TuitionPaymentFragmentbindingInflater1 + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i13 % 128;
            int i14 = i13 % 2;
            int i15 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i16 = (~(494450491 | iIdentityHashCode)) | 42420224;
            int i17 = ~((~iIdentityHashCode) | (-2109996));
            int i18 = i15 + (-1497020972) + ((i16 | i17) * (-470)) + (((~(iIdentityHashCode | 536870715)) | i17) * 470);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr2[1])[0] = i20 ^ (i20 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr != null) {
                int i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 25;
                TuitionPaymentFragmentbindingInflater1 = i21 % 128;
                int i22 = 2;
                int i23 = i21 % 2;
                int i24 = 0;
                while (i24 < strArr.length) {
                    int i25 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 105;
                    TuitionPaymentFragmentbindingInflater1 = i25 % 128;
                    if (i25 % i22 == 0) {
                        arrayList.add(strArr[i24]);
                        i24 += 61;
                    } else {
                        arrayList.add(strArr[i24]);
                        i24++;
                    }
                    i22 = 2;
                }
            }
            Toast.makeText((Context) null, i12 / (((i12 - 1) * i12) % 2), 0).show();
            int i26 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iMyTid = Process.myTid();
            int i27 = 343461940 + (((~((-756718931) | iMyTid)) | 716408701) * (-318));
            int i28 = ~(716408701 | iMyTid);
            int i29 = ~iMyTid;
            int i30 = i26 + i27 + ((i28 | (~((-44106286) | i29))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(iMyTid | (-44106286))) | (~(800825215 | i29))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr2[1])[0] = i32 ^ (i32 << 5);
        }
        float f = this.touchPosition;
        if (isRtl()) {
            int i33 = TuitionPaymentFragmentbindingInflater1 + 87;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i33 % 128;
            int i34 = i33 % 2;
            int i35 = ((int[]) objArr2[1])[0];
            int i36 = ((i35 * i35) - (~(-(238835567 * i35)))) - 1;
            int i37 = -(i35 * (-814635329));
            int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
            int i39 = (i38 ^ 1017304081) + ((1017304081 & i38) << 1);
            int i40 = ((i39 >> 16) - 131071) / 65536;
            int i41 = (i40 ^ 1) + ((i40 & 1) << 1);
            int i42 = ((i39 | i41) << 1) - (i41 ^ i39);
            int i43 = i39 >> 24;
            int i44 = ((i43 & (-511)) + (i43 | (-511))) / 256;
            int i45 = (-(i42 ^ (((i44 | 1) << 1) - (i44 ^ 1)))) + 2;
            int i46 = i45 >> 20;
            int i47 = ((i46 & (-8191)) + (i46 | (-8191))) / 4096;
            int i48 = (i47 ^ 1) + ((i47 & 1) << 1);
            f = ((2300 / ((i45 & (-((i48 & 1) + (i48 | 1)))) * 1150)) + 0.0f) - f;
        }
        float f2 = this.valueTo;
        float f3 = this.valueFrom;
        return (f * (f2 - f3)) + f3;
    }

    private boolean snapTouchPosition() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        boolean zSnapActiveThumbToValue = snapActiveThumbToValue(getValueOfTouchPosition());
        int i4 = TuitionPaymentFragmentbindingInflater1 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            return zSnapActiveThumbToValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private boolean snapActiveThumbToValue(float f) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 47;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            snapThumbToValue(this.activeThumbIdx, f);
            throw null;
        }
        boolean zSnapThumbToValue = snapThumbToValue(this.activeThumbIdx, f);
        int i3 = TuitionPaymentFragmentbindingInflater1 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 == 0) {
            return zSnapThumbToValue;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0050, code lost:
    
        r6.values.set(r7, java.lang.Float.valueOf(getClampedValue(r7, r8)));
        dispatchOnChangedFromUser(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0061, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:
    
        if (java.lang.Math.abs(r6.values.get(r7).floatValue() * r8) < com.google.android.material.slider.BaseSlider.THRESHOLD) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0043, code lost:
    
        if (java.lang.Math.abs(r8 - r6.values.get(r7).floatValue()) < com.google.android.material.slider.BaseSlider.THRESHOLD) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0045, code lost:
    
        r7 = com.google.android.material.slider.BaseSlider.TuitionPaymentFragmentbindingInflater1 + 15;
        com.google.android.material.slider.BaseSlider.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r7 % 128;
        r7 = r7 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean snapThumbToValue(int r7, float r8) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.material.slider.BaseSlider.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            int r1 = r1 + 61
            int r2 = r1 % 128
            com.google.android.material.slider.BaseSlider.TuitionPaymentFragmentbindingInflater1 = r2
            int r1 = r1 % r0
            r2 = 4547007122018943789(0x3f1a36e2eb1c432d, double:1.0E-4)
            if (r1 != 0) goto L2c
            r6.focusedThumbIdx = r7
            java.util.ArrayList<java.lang.Float> r1 = r6.values
            java.lang.Object r1 = r1.get(r7)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            float r1 = r1 * r8
            float r1 = java.lang.Math.abs(r1)
            double r4 = (double) r1
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 >= 0) goto L50
            goto L45
        L2c:
            r6.focusedThumbIdx = r7
            java.util.ArrayList<java.lang.Float> r1 = r6.values
            java.lang.Object r1 = r1.get(r7)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            float r1 = r8 - r1
            float r1 = java.lang.Math.abs(r1)
            double r4 = (double) r1
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 >= 0) goto L50
        L45:
            int r7 = com.google.android.material.slider.BaseSlider.TuitionPaymentFragmentbindingInflater1
            int r7 = r7 + 15
            int r8 = r7 % 128
            com.google.android.material.slider.BaseSlider.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r8
            int r7 = r7 % r0
            r7 = 0
            return r7
        L50:
            float r8 = r6.getClampedValue(r7, r8)
            java.util.ArrayList<java.lang.Float> r0 = r6.values
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            r0.set(r7, r8)
            r6.dispatchOnChangedFromUser(r7)
            r7 = 1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.snapThumbToValue(int, float):boolean");
    }

    private float getClampedValue(int i, float f) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        float minSeparation = getMinSeparation();
        if (this.separationUnit == 0) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 31;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
            minSeparation = dimenToValue(minSeparation);
        }
        if (isRtl()) {
            int i7 = TuitionPaymentFragmentbindingInflater1 + 39;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
            if (i7 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            minSeparation = -minSeparation;
        }
        int i8 = i + 1;
        int i9 = i - 1;
        return MathUtils.clamp(f, i9 < 0 ? this.valueFrom : this.values.get(i9).floatValue() + minSeparation, i8 >= this.values.size() ? this.valueTo : this.values.get(i8).floatValue() - minSeparation);
    }

    private float dimenToValue(float f) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 95;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        if (i2 % 2 == 0 ? f == 0.0f : f == 0.0f) {
            return 0.0f;
        }
        float f2 = (f - this.trackSidePadding) / this.trackWidth;
        float f3 = this.valueFrom;
        float f4 = (f2 * (f3 - this.valueTo)) + f3;
        int i4 = i3 + 107;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return f4;
    }

    protected void setSeparationUnit(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 == 0) {
            this.separationUnit = i;
            this.dirtyConfig = true;
        } else {
            this.separationUnit = i;
            this.dirtyConfig = true;
        }
        postInvalidate();
    }

    private float getValueOfTouchPosition() {
        int i = 2 % 2;
        double dSnapPosition = snapPosition(this.touchPosition);
        if (isRtl()) {
            dSnapPosition = 1.0d - dSnapPosition;
            int i2 = TuitionPaymentFragmentbindingInflater1 + 65;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
        }
        float f = this.valueTo;
        float f2 = this.valueFrom;
        float f3 = (float) ((dSnapPosition * ((double) (f - f2))) + ((double) f2));
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 101;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 0 / 0;
        }
        return f3;
    }

    private float valueToX(float f) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        float fNormalizeValue = normalizeValue(f);
        int i4 = this.trackWidth;
        return i3 == 0 ? (fNormalizeValue * i4) % this.trackSidePadding : (fNormalizeValue * i4) + this.trackSidePadding;
    }

    private static float getAnimatorCurrentValueOrDefault(ValueAnimator valueAnimator, float f) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 51;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 % 4;
            }
        }
        return f;
    }

    private ValueAnimator createLabelAnimator(boolean z) {
        ValueAnimator valueAnimator;
        int iResolveThemeDuration;
        TimeInterpolator timeInterpolatorResolveThemeInterpolator;
        int i = 2 % 2;
        float f = !(z ^ true) ? 0.0f : 1.0f;
        if (z) {
            int i2 = TuitionPaymentFragmentbindingInflater1 + 91;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            if (i2 % 2 != 0) {
                valueAnimator = this.labelsOutAnimator;
                int i3 = 68 / 0;
            } else {
                valueAnimator = this.labelsOutAnimator;
            }
        } else {
            valueAnimator = this.labelsInAnimator;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(getAnimatorCurrentValueOrDefault(valueAnimator, f), z ^ true ? 0.0f : 1.0f);
        if (z) {
            iResolveThemeDuration = MotionUtils.resolveThemeDuration(getContext(), LABEL_ANIMATION_ENTER_DURATION_ATTR, 83);
            timeInterpolatorResolveThemeInterpolator = MotionUtils.resolveThemeInterpolator(getContext(), LABEL_ANIMATION_ENTER_EASING_ATTR, AnimationUtils.DECELERATE_INTERPOLATOR);
        } else {
            iResolveThemeDuration = MotionUtils.resolveThemeDuration(getContext(), LABEL_ANIMATION_EXIT_DURATION_ATTR, 117);
            timeInterpolatorResolveThemeInterpolator = MotionUtils.resolveThemeInterpolator(getContext(), LABEL_ANIMATION_EXIT_EASING_ATTR, AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR);
        }
        valueAnimatorOfFloat.setDuration(iResolveThemeDuration);
        valueAnimatorOfFloat.setInterpolator(timeInterpolatorResolveThemeInterpolator);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.slider.BaseSlider.1
            private static final byte[] $$c = {31, -3, -46, 11};
            private static final int $$f = 144;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {31, 115, -100, -11, 4, 20, 6, -6, 26, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
            private static final int $$e = 90;
            private static final byte[] $$a = {31, 115, -100, -11, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
            private static final int $$b = ModuleDescriptor.MODULE_VERSION;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            private static int b = 1;
            private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {-1633803821, 387659964, -1346673282, -2024559710, 1527920927, 376887142, -1599652434, -1112699822, 2110913295, -1564746860, 1982262132, -1147604665, -1543613010, -2110905889, 283692275, -60799561, -1157918768, 1446732619};

            private static void a(byte b2, byte b3, short s, Object[] objArr) {
                int i4 = 56 - (s * 52);
                byte[] bArr = $$a;
                int i5 = 98 - (b3 * 14);
                byte[] bArr2 = new byte[53 - b2];
                int i6 = 52 - b2;
                int i7 = -1;
                if (bArr == null) {
                    i4++;
                    i5 = (i4 + i6) - 10;
                }
                while (true) {
                    int i8 = i4;
                    int i9 = i5;
                    i7++;
                    bArr2[i7] = (byte) i9;
                    if (i7 == i6) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    } else {
                        i4 = i8 + 1;
                        i5 = (i9 + bArr[i8]) - 10;
                    }
                }
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0029  */
            /* JADX WARN: Code duplicated, block: B:8:0x0021  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0032). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(byte r6, int r7, byte r8, java.lang.Object[] r9) {
                /*
                    int r8 = r8 * 33
                    int r8 = 117 - r8
                    byte[] r0 = com.google.android.material.slider.BaseSlider.AnonymousClass1.$$d
                    int r7 = r7 * 47
                    int r1 = r7 + 6
                    int r6 = r6 * 5
                    int r6 = 8 - r6
                    byte[] r1 = new byte[r1]
                    int r7 = r7 + 5
                    r2 = 0
                    if (r0 != 0) goto L19
                    r3 = r8
                    r4 = r2
                    r8 = r6
                    goto L32
                L19:
                    r3 = r2
                L1a:
                    int r6 = r6 + 1
                    byte r4 = (byte) r8
                    r1[r3] = r4
                    if (r3 != r7) goto L29
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L29:
                    int r3 = r3 + 1
                    r4 = r0[r6]
                    r5 = r8
                    r8 = r6
                    r6 = r4
                    r4 = r3
                    r3 = r5
                L32:
                    int r3 = r3 + r6
                    int r6 = r3 + (-11)
                    r3 = r4
                    r5 = r8
                    r8 = r6
                    r6 = r5
                    goto L1a
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.AnonymousClass1.d(byte, int, byte, java.lang.Object[]):void");
            }

            private static void c(int[] iArr, int i4, Object[] objArr) throws Throwable {
                int i5;
                int length;
                int[] iArr2;
                int i6;
                int i7 = 2 % 2;
                SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i8 = -1870535734;
                int i9 = 1;
                int i10 = 0;
                if (iArr3 != null) {
                    int length2 = iArr3.length;
                    int[] iArr4 = new int[length2];
                    int i11 = 0;
                    while (i11 < length2) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(iArr3[i11])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i8);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getWindowTouchSlop() >> 8) + 3291, ExpandableListView.getPackedPositionGroup(0L) + 31, 1948206109, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            iArr4[i11] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                            i11++;
                            i8 = -1870535734;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    iArr3 = iArr4;
                }
                int length3 = iArr3.length;
                int[] iArr5 = new int[length3];
                int[] iArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                char c = '0';
                if (iArr6 != null) {
                    int i12 = $11 + 47;
                    $10 = i12 % 128;
                    if (i12 % 2 != 0) {
                        length = iArr6.length;
                        iArr2 = new int[length];
                        i6 = 1;
                    } else {
                        length = iArr6.length;
                        iArr2 = new int[length];
                        i6 = 0;
                    }
                    while (i6 < length) {
                        Object[] objArr3 = new Object[i9];
                        objArr3[i10] = Integer.valueOf(iArr6[i6]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) i10;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf("", c, i10) + 1), 3291 - (ViewConfiguration.getTouchSlop() >> 8), 31 - TextUtils.getTrimmedLength(""), 1948206109, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                        }
                        iArr2[i6] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                        i6++;
                        iArr6 = iArr6;
                        c = '0';
                        i9 = 1;
                        i10 = 0;
                    }
                    i5 = i10;
                    iArr6 = iArr2;
                } else {
                    i5 = 0;
                }
                System.arraycopy(iArr6, i5, iArr5, i5, length3);
                sessionConfigValidatingBuilder.b = 2;
                int i13 = $11 + 101;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                while (sessionConfigValidatingBuilder.b < iArr.length) {
                    cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
                    cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
                    cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
                    cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
                    int i15 = 17;
                    for (int i16 = 1; i15 > i16; i16 = 1) {
                        int i17 = $10 + 55;
                        $11 = i17 % 128;
                        if (i17 % 2 == 0) {
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[i15];
                            Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b6 = (byte) 1;
                                byte b7 = (byte) (b6 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-1) - MotionEvent.axisFromString("")), Drawable.resolveOpacity(0, 0) + 2559, TextUtils.lastIndexOf("", '0', 0) + 30, 683220507, false, $$g(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                            i15 += 63;
                        } else {
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[i15];
                            Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b8 = (byte) 1;
                                byte b9 = (byte) (b8 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) TextUtils.indexOf("", ""), TextUtils.indexOf("", "", 0) + 2559, 29 - (ViewConfiguration.getEdgeSlop() >> 16), 683220507, false, $$g(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                            }
                            int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue2;
                            i15--;
                        }
                    }
                    int i18 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr5[1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[0];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                    int i19 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    Object[] objArr6 = {sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (28880 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0) + 349, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 24, -30507727, false, "G", new Class[]{Object.class});
                    }
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()];
                    cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
                    cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                    cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
                    cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
                    sessionConfigValidatingBuilder.b += 2;
                }
                objArr[0] = new String(cArr2, 0, i4);
            }

            /* JADX WARN: Code duplicated, block: B:26:0x0235  */
            /* JADX WARN: Code duplicated, block: B:27:0x0237  */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) throws Throwable {
                Object[] objArr;
                int i4 = 2 % 2;
                float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                int i5 = 0;
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char c = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 31532);
                    int iIndexOf = TextUtils.indexOf("", "", 0) + 921;
                    int doubleTapTimeout = 28 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    byte[] bArr = $$a;
                    Object[] objArr2 = new Object[1];
                    a((byte) 52, bArr[80], bArr[37], objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iIndexOf, doubleTapTimeout, -1048449946, false, (String) objArr2[0], null);
                }
                Object obj = null;
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(new int[]{907645235, 1834886627, 1491035178, -2121797888, 1553704960, -1103264675, -112796700, 738661096, 1806994508, -2075928503, -600526778, 1315647329, -1987278925, -1671256864}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 21, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new int[]{1425050486, -2042294820, -349391149, -27784719, -747523785, -1957119591, 1912278094, -382589219, 737837708, -322547636}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 15, objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cLastIndexOf = (char) (31532 - TextUtils.lastIndexOf("", '0', 0, 0));
                    int iCombineMeasuredStates = 921 - View.combineMeasuredStates(0, 0);
                    int i6 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 27;
                    byte[] bArr2 = $$a;
                    byte b2 = bArr2[80];
                    byte b3 = bArr2[37];
                    Object[] objArr5 = new Object[1];
                    a(b2, b3, b3, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, iCombineMeasuredStates, i6, -778300370, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char tapTimeout = (char) (31533 - (ViewConfiguration.getTapTimeout() >> 16));
                        int iIndexOf2 = TextUtils.indexOf("", "", 0) + 921;
                        int i7 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 27;
                        byte[] bArr3 = $$a;
                        Object[] objArr6 = new Object[1];
                        a(bArr3[33], bArr3[37], bArr3[80], objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(tapTimeout, iIndexOf2, i7, -1142834547, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    int i8 = ((int[]) objArr7[3])[0];
                    objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{i8}, (String[]) objArr7[4]};
                    int iNextInt = new Random().nextInt();
                    int i9 = (-910110255) + (((~((-153485329) | iNextInt)) | (-1620594316)) * (-318));
                    int i10 = ~((-1620594316) | iNextInt);
                    int i11 = ~iNextInt;
                    int i12 = i9 + ((i10 | (~(1774079643 | i11))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(iNextInt | 1774079643)) | (~((-1620594316) | i11))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + 166154272;
                    int i13 = (i12 << 13) ^ i12;
                    int i14 = i13 ^ (i13 >>> 17);
                    ((int[]) objArr[0])[0] = i14 ^ (i14 << 5);
                } else {
                    Object[] objArr8 = new Object[1];
                    c(new int[]{-353820698, 728318321, 1541483000, -209048898, -1218054804, 1480388427, -1946967763, 74956093, 772043361, -844764715, 1178688464, 1980611120, -903141182, 1174059949, 1798552174, 1766359700}, 26 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(new int[]{136038878, 1918518416, -1251176055, -176007865, 1779485240, -1185104984, -230269111, -1572209446, 882637608, 1629058345, -655923004, -1805273839}, 18 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        if (applicationContext instanceof ContextWrapper) {
                            int i15 = b + 1;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15 % 128;
                            if (i15 % 2 != 0) {
                                int i16 = 46 / 0;
                                if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                    applicationContext = applicationContext.getApplicationContext();
                                } else {
                                    applicationContext = null;
                                }
                            } else if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                applicationContext = applicationContext.getApplicationContext();
                            } else {
                                applicationContext = null;
                            }
                        } else {
                            applicationContext = applicationContext.getApplicationContext();
                        }
                    }
                    Object[] objArr10 = new Object[1];
                    c(new int[]{690856822, -1084311587, 1624334278, 1063365328, -268058421, 36938730, -1320271603, -1927104289, 176267460, 96408916}, (ViewConfiguration.getTouchSlop() >> 8) + 16, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    c(new int[]{-1417880582, 1261255336, 1301315215, 781513797, -427038198, 1874722114, -1791497059, -1210549677, 645787403, -257718343}, 16 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr11);
                    int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                    int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
                    b = i17 % 128;
                    int i18 = i17 % 2;
                    try {
                        Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 166154272};
                        byte[] bArr4 = $$d;
                        byte b4 = (byte) (-bArr4[10]);
                        byte b5 = bArr4[12];
                        Object[] objArr13 = new Object[1];
                        d(b4, b5, b5, objArr13);
                        Class<?> cls4 = Class.forName((String) objArr13[0]);
                        byte b6 = bArr4[12];
                        byte b7 = (byte) (-bArr4[10]);
                        Object[] objArr14 = new Object[1];
                        d(b6, b7, b7, objArr14);
                        Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cIndexOf = (char) (TextUtils.indexOf("", "", 0, 0) + 31533);
                            int i19 = 922 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            int iIndexOf3 = 27 - TextUtils.indexOf((CharSequence) "", '0', 0);
                            byte[] bArr5 = $$a;
                            Object[] objArr16 = new Object[1];
                            a(bArr5[33], bArr5[37], bArr5[80], objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, i19, iIndexOf3, -1142834547, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                        try {
                            Object[] objArr17 = new Object[1];
                            c(new int[]{907645235, 1834886627, 1491035178, -2121797888, 1553704960, -1103264675, -112796700, 738661096, 1806994508, -2075928503, -600526778, 1315647329, -1987278925, -1671256864}, 22 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr17);
                            Class<?> cls5 = Class.forName((String) objArr17[0]);
                            Object[] objArr18 = new Object[1];
                            c(new int[]{1425050486, -2042294820, -349391149, -27784719, -747523785, -1957119591, 1912278094, -382589219, 737837708, -322547636}, TextUtils.getCapsMode("", 0, 0) + 15, objArr18);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char cIndexOf2 = (char) (31533 - TextUtils.indexOf("", "", 0));
                                int i20 = 922 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 28;
                                byte[] bArr6 = $$a;
                                byte b8 = bArr6[80];
                                byte b9 = bArr6[37];
                                Object[] objArr19 = new Object[1];
                                a(b8, b9, b9, objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf2, i20, iKeyCodeFromString, -778300370, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char gidForName = (char) (31532 - Process.getGidForName(""));
                                int i21 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 921;
                                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 29;
                                byte[] bArr7 = $$a;
                                Object[] objArr20 = new Object[1];
                                a((byte) 52, bArr7[80], bArr7[37], objArr20);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(gidForName, i21, iLastIndexOf, -1048449946, false, (String) objArr20[0], null);
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
                int i22 = ((int[]) objArr[1])[0];
                int i23 = ((int[]) objArr[3])[0];
                if (i23 != i22) {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr[4];
                    if (strArr != null) {
                        while (i5 < strArr.length) {
                            int i24 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
                            b = i24 % 128;
                            if (i24 % 2 == 0) {
                                arrayList.add(strArr[i5]);
                                i5 += 85;
                            } else {
                                arrayList.add(strArr[i5]);
                                i5++;
                            }
                        }
                    }
                    throw new RuntimeException(String.valueOf(i23));
                }
                int i25 = ((int[]) objArr[0])[0];
                int i26 = ((int[]) objArr[3])[0];
                Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i26}, (String[]) objArr[4]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i27 = ~((-1142170883) | iIdentityHashCode);
                int i28 = i25 + (-1401890881) + ((296355905 | i27) * (-476)) + (i27 * 952) + ((~((~iIdentityHashCode) | (-1142170883))) * 476);
                int i29 = (i28 << 13) ^ i28;
                int i30 = i29 ^ (i29 >>> 17);
                ((int[]) objArr21[0])[0] = i30 ^ (i30 << 5);
                Iterator it = BaseSlider.access$000(BaseSlider.this).iterator();
                while (it.hasNext()) {
                    int i31 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
                    b = i31 % 128;
                    if (i31 % 2 == 0) {
                        ((TooltipDrawable) it.next()).setRevealFraction(fFloatValue);
                        obj.hashCode();
                        throw null;
                    }
                    ((TooltipDrawable) it.next()).setRevealFraction(fFloatValue);
                }
                ViewCompat.postInvalidateOnAnimation(BaseSlider.this);
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
            private static java.lang.String $$g(int r6, short r7, int r8) {
                /*
                    int r7 = r7 * 2
                    int r7 = r7 + 4
                    int r8 = r8 * 3
                    int r8 = 1 - r8
                    byte[] r0 = com.google.android.material.slider.BaseSlider.AnonymousClass1.$$c
                    int r6 = r6 * 56
                    int r6 = r6 + 66
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L16
                    r3 = r8
                    r5 = r2
                    goto L26
                L16:
                    r3 = r2
                L17:
                    byte r4 = (byte) r6
                    int r5 = r3 + 1
                    r1[r3] = r4
                    if (r5 != r8) goto L24
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L24:
                    r3 = r0[r7]
                L26:
                    int r3 = -r3
                    int r6 = r6 + r3
                    int r7 = r7 + 1
                    r3 = r5
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.AnonymousClass1.$$g(int, short, int):java.lang.String");
            }
        });
        int i4 = TuitionPaymentFragmentbindingInflater1 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            return valueAnimatorOfFloat;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void updateLabels() throws Throwable {
        int i = 2 % 2;
        int i2 = this.labelBehavior;
        if (i2 == 0 || i2 == 1) {
            if (this.activeThumbIdx == -1 || !isEnabled()) {
                ensureLabelsRemoved();
                return;
            }
            int i3 = TuitionPaymentFragmentbindingInflater1 + 97;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            ensureLabelsAdded();
            return;
        }
        if (i2 == 2) {
            ensureLabelsRemoved();
            return;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 75;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0 ? i2 != 3 : i2 != 5) {
            StringBuilder sb = new StringBuilder("Unexpected labelBehavior: ");
            sb.append(this.labelBehavior);
            throw new IllegalArgumentException(sb.toString());
        }
        if (isEnabled()) {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
            TuitionPaymentFragmentbindingInflater1 = i6 % 128;
            int i7 = i6 % 2;
            if (isSliderVisibleOnScreen()) {
                int i8 = TuitionPaymentFragmentbindingInflater1 + 119;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
                int i9 = i8 % 2;
                ensureLabelsAdded();
                return;
            }
        }
        ensureLabelsRemoved();
    }

    private boolean isSliderVisibleOnScreen() {
        int i = 2 % 2;
        Rect rect = new Rect();
        ViewUtils.getContentView(this).getHitRect(rect);
        boolean localVisibleRect = getLocalVisibleRect(rect);
        int i2 = TuitionPaymentFragmentbindingInflater1 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        return localVisibleRect;
    }

    private void ensureLabelsRemoved() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 25;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if (this.labelsAreAnimatedIn) {
            this.labelsAreAnimatedIn = false;
            ValueAnimator valueAnimatorCreateLabelAnimator = createLabelAnimator(false);
            this.labelsOutAnimator = valueAnimatorCreateLabelAnimator;
            this.labelsInAnimator = null;
            valueAnimatorCreateLabelAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.slider.BaseSlider.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    ViewOverlayImpl contentViewOverlay = ViewUtils.getContentViewOverlay(BaseSlider.this);
                    Iterator it = BaseSlider.access$000(BaseSlider.this).iterator();
                    while (it.hasNext()) {
                        contentViewOverlay.remove((TooltipDrawable) it.next());
                    }
                }
            });
            this.labelsOutAnimator.start();
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 45;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private void ensureLabelsAdded() throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (!this.labelsAreAnimatedIn) {
            this.labelsAreAnimatedIn = true;
            ValueAnimator valueAnimatorCreateLabelAnimator = createLabelAnimator(true);
            this.labelsInAnimator = valueAnimatorCreateLabelAnimator;
            this.labelsOutAnimator = null;
            valueAnimatorCreateLabelAnimator.start();
        }
        Iterator<TooltipDrawable> it = this.labels.iterator();
        int i3 = 0;
        while (i3 < this.values.size()) {
            int i4 = TuitionPaymentFragmentbindingInflater1 + 113;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            if (i4 % 2 != 0) {
                it.hasNext();
                obj.hashCode();
                throw null;
            }
            if (!it.hasNext()) {
                break;
            }
            if (i3 != this.focusedThumbIdx) {
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 119;
                TuitionPaymentFragmentbindingInflater1 = i5 % 128;
                if (i5 % 2 == 0) {
                    setValueForLabel(it.next(), this.values.get(i3).floatValue());
                    obj.hashCode();
                    throw null;
                }
                setValueForLabel(it.next(), this.values.get(i3).floatValue());
            }
            i3++;
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
            TuitionPaymentFragmentbindingInflater1 = i6 % 128;
            int i7 = i6 % 2;
        }
        if (!it.hasNext()) {
            throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(this.labels.size()), Integer.valueOf(this.values.size())));
        }
        int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 41;
        TuitionPaymentFragmentbindingInflater1 = i8 % 128;
        if (i8 % 2 != 0) {
            setValueForLabel(it.next(), this.values.get(this.focusedThumbIdx).floatValue());
        } else {
            setValueForLabel(it.next(), this.values.get(this.focusedThumbIdx).floatValue());
            obj.hashCode();
            throw null;
        }
    }

    private String formatValue(float f) {
        String str;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        if (hasLabelFormatter()) {
            String formattedValue = this.formatter.getFormattedValue(f);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 93;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            return formattedValue;
        }
        if (((int) f) == f) {
            int i6 = TuitionPaymentFragmentbindingInflater1 + 29;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            str = "%.0f";
            if (i6 % 2 != 0) {
                int i7 = 69 / 0;
            }
        } else {
            str = "%.2f";
        }
        return String.format(str, Float.valueOf(f));
    }

    private void setValueForLabel(TooltipDrawable tooltipDrawable, float f) throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 53;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        tooltipDrawable.setText(formatValue(f));
        positionLabel(tooltipDrawable, f);
        ViewUtils.getContentViewOverlay(this).add(tooltipDrawable);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    private void positionLabel(TooltipDrawable tooltipDrawable, float f) {
        int i = 2 % 2;
        int iNormalizeValue = (this.trackSidePadding + ((int) (normalizeValue(f) * this.trackWidth))) - (tooltipDrawable.getIntrinsicWidth() / 2);
        int iCalculateTrackCenter = calculateTrackCenter() - (this.labelPadding + (this.thumbHeight / 2));
        tooltipDrawable.setBounds(iNormalizeValue, iCalculateTrackCenter - tooltipDrawable.getIntrinsicHeight(), tooltipDrawable.getIntrinsicWidth() + iNormalizeValue, iCalculateTrackCenter);
        Rect rect = new Rect(tooltipDrawable.getBounds());
        DescendantOffsetUtils.offsetDescendantRect(ViewUtils.getContentView(this), this, rect);
        tooltipDrawable.setBounds(rect);
        int i2 = TuitionPaymentFragmentbindingInflater1 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    class AccessibilityEventSender implements Runnable {
        int virtualViewId;

        private AccessibilityEventSender() {
            this.virtualViewId = -1;
        }

        void setVirtualViewId(int i) {
            this.virtualViewId = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseSlider.access$200(BaseSlider.this).sendEventForVirtualView(this.virtualViewId, 4);
        }
    }

    static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new Parcelable.Creator<SliderState>() { // from class: com.google.android.material.slider.BaseSlider.SliderState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SliderState createFromParcel(Parcel parcel) {
                return new SliderState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SliderState[] newArray(int i) {
                return new SliderState[i];
            }
        };
        boolean hasFocus;
        float stepSize;
        float valueFrom;
        float valueTo;
        ArrayList<Float> values;

        SliderState(Parcelable parcelable) {
            super(parcelable);
        }

        private SliderState(Parcel parcel) {
            super(parcel);
            this.valueFrom = parcel.readFloat();
            this.valueTo = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.values = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.stepSize = parcel.readFloat();
            this.hasFocus = parcel.createBooleanArray()[0];
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.valueFrom);
            parcel.writeFloat(this.valueTo);
            parcel.writeList(this.values);
            parcel.writeFloat(this.stepSize);
            parcel.writeBooleanArray(new boolean[]{this.hasFocus});
        }
    }

    private void invalidateTrack() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.inactiveTrackPaint.setStrokeWidth(this.trackHeight);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        int i4 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cRgb = (char) (Color.rgb(0, 0, 0) + 16808749);
            int bitsPerPixel = 920 - ImageFormat.getBitsPerPixel(0);
            int iRed = 28 - Color.red(0);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c((byte) 52, (byte) (bArr[17] - 1), bArr[64], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRgb, bitsPerPixel, iRed, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        d(new int[]{0, 22, 0, 0}, true, new byte[]{1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        d(new int[]{22, 15, 178, 13}, false, new byte[]{1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cCombineMeasuredStates = (char) (31533 - View.combineMeasuredStates(0, 0));
            int i5 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 920;
            int i6 = 28 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            byte[] bArr2 = $$a;
            byte b2 = bArr2[18];
            Object[] objArr5 = new Object[1];
            c(b2, b2, bArr2[64], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cCombineMeasuredStates, i5, i6, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 31533);
                int iRed2 = 921 - Color.red(0);
                int iBlue = Color.blue(0) + 28;
                byte[] bArr3 = $$a;
                byte b3 = bArr3[17];
                byte b4 = bArr3[18];
                Object[] objArr6 = new Object[1];
                c(b3, b4, (byte) (b4 | 69), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(keyRepeatDelay, iRed2, iBlue, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int i7 = ~System.identityHashCode(this);
            int i8 = (-2143306697) + ((~(1568492399 | i7)) * 52) + (((~(222645036 | i7)) | (~((-1551434608) | i7)) | 1345847363) * (-52)) + (((~(i7 | (-222645037))) | 17057792) * 52) + 1781757021;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            d(new int[]{69, 26, 0, 6}, false, new byte[]{0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            d(new int[]{95, 18, 0, 10}, true, new byte[]{0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            d(new int[]{37, 16, 164, 2}, false, new byte[]{1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            d(new int[]{53, 16, 0, 0}, false, new byte[]{1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1}, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 31;
            TuitionPaymentFragmentbindingInflater1 = i11 % 128;
            int i12 = i11 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 1781757021};
                byte b5 = (byte) ($$h & 347);
                byte[] bArr4 = $$g;
                Object[] objArr13 = new Object[1];
                e(b5, (byte) (-bArr4[125]), bArr4[30], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                e((byte) 121, (byte) (-bArr4[48]), bArr4[131], objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cKeyCodeFromString = (char) (31533 - KeyEvent.keyCodeFromString(""));
                    int iMyTid = (Process.myTid() >> 22) + 921;
                    int i13 = 29 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    byte[] bArr5 = $$a;
                    byte b6 = bArr5[17];
                    byte b7 = bArr5[18];
                    Object[] objArr16 = new Object[1];
                    c(b6, b7, (byte) (b7 | 69), objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cKeyCodeFromString, iMyTid, i13, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    d(new int[]{0, 22, 0, 0}, true, new byte[]{1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    d(new int[]{22, 15, 178, 13}, false, new byte[]{1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1}, objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 31534);
                        int iKeyCodeFromString = 921 - KeyEvent.keyCodeFromString("");
                        int trimmedLength = TextUtils.getTrimmedLength("") + 28;
                        byte[] bArr6 = $$a;
                        byte b8 = bArr6[18];
                        Object[] objArr19 = new Object[1];
                        c(b8, b8, bArr6[64], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cLastIndexOf, iKeyCodeFromString, trimmedLength, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cMyPid = (char) (31533 - (Process.myPid() >> 22));
                        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 921;
                        int i14 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 27;
                        byte[] bArr7 = $$a;
                        Object[] objArr20 = new Object[1];
                        c((byte) 52, (byte) (bArr7[17] - 1), bArr7[64], objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMyPid, longPressTimeout, i14, -1048449946, false, (String) objArr20[0], null);
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
            int i15 = TuitionPaymentFragmentbindingInflater1 + 41;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i15 % 128;
            int i16 = i15 % 2;
            while (i4 < strArr.length) {
                int i17 = TuitionPaymentFragmentbindingInflater1 + 61;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i17 % 128;
                if (i17 % 2 != 0) {
                    arrayList.add(strArr[i4]);
                    i4 += 9;
                } else {
                    arrayList.add(strArr[i4]);
                    i4++;
                }
            }
            throw null;
        }
        int i18 = ((int[]) objArr[0])[0];
        Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i19 = ~iIdentityHashCode;
        int i20 = i18 + (-720528378) + ((1740521071 | i19) * (-369)) + (((~((-102764590) | i19)) | 1671315054) * (-369)) + (((~(iIdentityHashCode | 102764589)) | 1637756482 | (~(i19 | (-69206018)))) * 369);
        int i21 = (i20 << 13) ^ i20;
        int i22 = i21 ^ (i21 >>> 17);
        ((int[]) objArr21[0])[0] = i22 ^ (i22 << 5);
        int i23 = TuitionPaymentFragmentbindingInflater1 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i23 % 128;
        if (i23 % 2 == 0) {
            this.activeTrackPaint.setStrokeWidth(this.trackHeight);
        } else {
            this.activeTrackPaint.setStrokeWidth(this.trackHeight);
            throw null;
        }
    }

    private boolean isInVerticalScrollingContainer() {
        int i = 2 % 2;
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            int i2 = TuitionPaymentFragmentbindingInflater1 + 29;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                int i4 = TuitionPaymentFragmentbindingInflater1 + 79;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
        }
        return false;
    }

    private static boolean isMouseEvent(MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 21;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        if (motionEvent.getToolType(0) != 3) {
            return false;
        }
        int i4 = TuitionPaymentFragmentbindingInflater1 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    static class AccessibilityHelper extends ExploreByTouchHelper {
        private final BaseSlider<?, ?, ?> slider;
        final Rect virtualViewBounds;

        AccessibilityHelper(BaseSlider<?, ?, ?> baseSlider) {
            super(baseSlider);
            this.virtualViewBounds = new Rect();
            this.slider = baseSlider;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public int getVirtualViewAt(float f, float f2) {
            for (int i = 0; i < this.slider.getValues().size(); i++) {
                this.slider.updateBoundsForVirtualViewId(i, this.virtualViewBounds);
                if (this.virtualViewBounds.contains((int) f, (int) f2)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void getVisibleVirtualViews(List<Integer> list) {
            for (int i = 0; i < this.slider.getValues().size(); i++) {
                list.add(Integer.valueOf(i));
            }
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void onPopulateNodeForVirtualView(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SET_PROGRESS);
            List<Float> values = this.slider.getValues();
            float fFloatValue = values.get(i).floatValue();
            float valueFrom = this.slider.getValueFrom();
            float valueTo = this.slider.getValueTo();
            if (this.slider.isEnabled()) {
                if (fFloatValue > valueFrom) {
                    accessibilityNodeInfoCompat.addAction(8192);
                }
                if (fFloatValue < valueTo) {
                    accessibilityNodeInfoCompat.addAction(4096);
                }
            }
            accessibilityNodeInfoCompat.setRangeInfo(AccessibilityNodeInfoCompat.RangeInfoCompat.obtain(1, valueFrom, valueTo, fFloatValue));
            accessibilityNodeInfoCompat.setClassName(SeekBar.class.getName());
            StringBuilder sb = new StringBuilder();
            if (this.slider.getContentDescription() != null) {
                sb.append(this.slider.getContentDescription());
                sb.append(",");
            }
            String strAccess$400 = BaseSlider.access$400(this.slider, fFloatValue);
            String string = this.slider.getContext().getString(R.string.material_slider_value);
            if (values.size() > 1) {
                string = startOrEndDescription(i);
            }
            sb.append(String.format(Locale.US, "%s, %s", string, strAccess$400));
            accessibilityNodeInfoCompat.setContentDescription(sb.toString());
            this.slider.updateBoundsForVirtualViewId(i, this.virtualViewBounds);
            accessibilityNodeInfoCompat.setBoundsInParent(this.virtualViewBounds);
        }

        private String startOrEndDescription(int i) {
            if (i == this.slider.getValues().size() - 1) {
                return this.slider.getContext().getString(R.string.material_slider_range_end);
            }
            if (i == 0) {
                return this.slider.getContext().getString(R.string.material_slider_range_start);
            }
            return "";
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            if (!this.slider.isEnabled()) {
                return false;
            }
            if (i2 != 4096 && i2 != 8192) {
                if (i2 == 16908349 && bundle != null && bundle.containsKey(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE)) {
                    if (BaseSlider.access$500(this.slider, i, bundle.getFloat(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE))) {
                        BaseSlider.access$600(this.slider);
                        this.slider.postInvalidate();
                        invalidateVirtualView(i);
                        return true;
                    }
                }
                return false;
            }
            float fAccess$700 = BaseSlider.access$700(this.slider, 20);
            if (i2 == 8192) {
                fAccess$700 = -fAccess$700;
            }
            if (this.slider.isRtl()) {
                fAccess$700 = -fAccess$700;
            }
            if (!BaseSlider.access$500(this.slider, i, MathUtils.clamp(this.slider.getValues().get(i).floatValue() + fAccess$700, this.slider.getValueFrom(), this.slider.getValueTo()))) {
                return false;
            }
            BaseSlider.access$600(this.slider);
            this.slider.postInvalidate();
            invalidateVirtualView(i);
            return true;
        }
    }

    private boolean isPotentialVerticalScroll(MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            isMouseEvent(motionEvent);
            throw null;
        }
        if (!isMouseEvent(motionEvent) && isInVerticalScrollingContainer()) {
            return true;
        }
        int i3 = TuitionPaymentFragmentbindingInflater1 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 == 0) {
            return false;
        }
        throw null;
    }

    private void dispatchOnChangedProgrammatically() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 4 % 5;
        }
        for (L l : this.changeListeners) {
            int i4 = TuitionPaymentFragmentbindingInflater1 + 125;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
            Iterator<Float> it = this.values.iterator();
            while (it.hasNext()) {
                l.onValueChange(this, it.next().floatValue(), false);
            }
        }
    }

    private void dispatchOnChangedFromUser(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        Iterator<L> it = this.changeListeners.iterator();
        while (it.hasNext()) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 125;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
            it.next().onValueChange(this, this.values.get(i).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        scheduleAccessibilityEventSender(i);
    }

    private void onStartTrackingTouch() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 25;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Iterator<T> it = this.touchListeners.iterator();
        while (it.hasNext()) {
            it.next().onStartTrackingTouch(this);
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 9;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void onStopTrackingTouch() {
        Iterator<T> it;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            it = this.touchListeners.iterator();
            int i3 = 58 / 0;
        } else {
            it = this.touchListeners.iterator();
        }
        while (!(!it.hasNext())) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            it.next().onStopTrackingTouch(this);
        }
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 91;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        int i = 2 % 2;
        super.drawableStateChanged();
        this.inactiveTrackPaint.setColor(getColorForState(this.trackColorInactive));
        this.activeTrackPaint.setColor(getColorForState(this.trackColorActive));
        this.inactiveTicksPaint.setColor(getColorForState(this.tickColorInactive));
        this.activeTicksPaint.setColor(getColorForState(this.tickColorActive));
        this.stopIndicatorPaint.setColor(getColorForState(this.trackColorActive));
        Iterator<TooltipDrawable> it = this.labels.iterator();
        while (!(!it.hasNext())) {
            TooltipDrawable next = it.next();
            if (next.isStateful()) {
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 77;
                TuitionPaymentFragmentbindingInflater1 = i2 % 128;
                int i3 = i2 % 2;
                next.setState(getDrawableState());
            }
        }
        if (this.defaultThumbDrawable.isStateful()) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            if (i4 % 2 == 0) {
                this.defaultThumbDrawable.setState(getDrawableState());
                throw null;
            }
            this.defaultThumbDrawable.setState(getDrawableState());
        }
        this.haloPaint.setColor(getColorForState(this.haloColor));
        this.haloPaint.setAlpha(63);
    }

    private int getColorForState(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 101;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        int colorForState = colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
        int i4 = TuitionPaymentFragmentbindingInflater1 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return colorForState;
    }

    void forceDrawCompatHalo(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.forceDrawCompatHalo = z;
        if (i3 != 0) {
            int i4 = 57 / 0;
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 23;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            isEnabled();
            throw null;
        }
        if (!isEnabled()) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.values.size() == 1) {
            this.activeThumbIdx = 0;
        }
        if (this.activeThumbIdx == -1) {
            int i4 = TuitionPaymentFragmentbindingInflater1 + 31;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            if (i4 % 2 != 0) {
                onKeyDownNoActiveThumb(i, keyEvent);
                obj.hashCode();
                throw null;
            }
            Boolean boolOnKeyDownNoActiveThumb = onKeyDownNoActiveThumb(i, keyEvent);
            if (boolOnKeyDownNoActiveThumb == null) {
                return super.onKeyDown(i, keyEvent);
            }
            int i5 = TuitionPaymentFragmentbindingInflater1 + 71;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            if (i5 % 2 == 0) {
                return boolOnKeyDownNoActiveThumb.booleanValue();
            }
            boolOnKeyDownNoActiveThumb.booleanValue();
            throw null;
        }
        this.isLongPress |= keyEvent.isLongPress();
        Float fCalculateIncrementForKey = calculateIncrementForKey(i);
        if (fCalculateIncrementForKey != null) {
            if (snapActiveThumbToValue(this.values.get(this.activeThumbIdx).floatValue() + fCalculateIncrementForKey.floatValue())) {
                updateHaloHotspot();
                postInvalidate();
            }
            return true;
        }
        if (i != 23) {
            if (i == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return moveFocus(1);
                }
                if (!keyEvent.isShiftPressed()) {
                    return false;
                }
                boolean zMoveFocus = moveFocus(-1);
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 93;
                TuitionPaymentFragmentbindingInflater1 = i6 % 128;
                if (i6 % 2 != 0) {
                    return zMoveFocus;
                }
                throw null;
            }
            if (i != 66) {
                int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 69;
                TuitionPaymentFragmentbindingInflater1 = i7 % 128;
                if (i7 % 2 != 0) {
                    return super.onKeyDown(i, keyEvent);
                }
                boolean zOnKeyDown = super.onKeyDown(i, keyEvent);
                int i8 = 5 / 0;
                return zOnKeyDown;
            }
        }
        this.activeThumbIdx = -1;
        postInvalidate();
        return true;
    }

    private Boolean onKeyDownNoActiveThumb(int i, KeyEvent keyEvent) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = i3 + 23;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        if (i == 61) {
            if (keyEvent.hasNoModifiers()) {
                int i6 = TuitionPaymentFragmentbindingInflater1 + 117;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
                int i7 = i6 % 2;
                return Boolean.valueOf(moveFocus(1));
            }
            if (!keyEvent.isShiftPressed()) {
                return Boolean.FALSE;
            }
            Boolean boolValueOf = Boolean.valueOf(moveFocus(-1));
            int i8 = TuitionPaymentFragmentbindingInflater1 + 47;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
            if (i8 % 2 == 0) {
                return boolValueOf;
            }
            obj.hashCode();
            throw null;
        }
        if (i != 66) {
            if (i != 81) {
                if (i == 69) {
                    moveFocus(-1);
                    return Boolean.TRUE;
                }
                int i9 = i3 + 23;
                TuitionPaymentFragmentbindingInflater1 = i9 % 128;
                if (i9 % 2 != 0 ? i != 70 : i != 49) {
                    switch (i) {
                        case 21:
                            moveFocusInAbsoluteDirection(-1);
                            return Boolean.TRUE;
                        case 22:
                            moveFocusInAbsoluteDirection(1);
                            Boolean bool = Boolean.TRUE;
                            int i10 = TuitionPaymentFragmentbindingInflater1 + 31;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
                            int i11 = i10 % 2;
                            return bool;
                        case 23:
                            break;
                        default:
                            return null;
                    }
                }
            }
            moveFocus(1);
            return Boolean.TRUE;
        }
        this.activeThumbIdx = this.focusedThumbIdx;
        postInvalidate();
        return Boolean.TRUE;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            this.isLongPress = true;
        } else {
            this.isLongPress = false;
        }
        return super.onKeyUp(i, keyEvent);
    }

    final boolean isRtl() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        if (ViewCompat.getLayoutDirection(this) != 1) {
            int i4 = TuitionPaymentFragmentbindingInflater1 + 21;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            if (i4 % 2 == 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i6 = i5 + 123;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        boolean z = i6 % 2 != 0;
        int i7 = i5 + 37;
        TuitionPaymentFragmentbindingInflater1 = i7 % 128;
        int i8 = i7 % 2;
        return z;
    }

    private boolean moveFocus(int i) {
        int i2 = 2 % 2;
        int i3 = this.focusedThumbIdx;
        int iClamp = (int) MathUtils.clamp(((long) i3) + ((long) i), 0L, this.values.size() - 1);
        this.focusedThumbIdx = iClamp;
        if (iClamp != i3) {
            if (this.activeThumbIdx != -1) {
                this.activeThumbIdx = iClamp;
            }
            updateHaloHotspot();
            postInvalidate();
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 115;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = TuitionPaymentFragmentbindingInflater1 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    private boolean moveFocusInAbsoluteDirection(int i) {
        int i2 = 2 % 2;
        Object obj = null;
        if (isRtl()) {
            int i3 = TuitionPaymentFragmentbindingInflater1 + 69;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            i = i == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i;
        }
        boolean zMoveFocus = moveFocus(i);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 91;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            return zMoveFocus;
        }
        obj.hashCode();
        throw null;
    }

    private Float calculateIncrementForKey(int i) {
        float fCalculateStepIncrement;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 115;
        int i4 = i3 % 128;
        TuitionPaymentFragmentbindingInflater1 = i4;
        int i5 = i3 % 2;
        if (this.isLongPress) {
            int i6 = i4 + 37;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            int i7 = i6 % 2;
            fCalculateStepIncrement = calculateStepIncrement(20);
        } else {
            fCalculateStepIncrement = calculateStepIncrement();
        }
        if (i == 21) {
            if (!isRtl()) {
                fCalculateStepIncrement = -fCalculateStepIncrement;
            }
            return Float.valueOf(fCalculateStepIncrement);
        }
        if (i == 22) {
            if (isRtl()) {
                fCalculateStepIncrement = -fCalculateStepIncrement;
            }
            return Float.valueOf(fCalculateStepIncrement);
        }
        int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 45;
        int i9 = i8 % 128;
        TuitionPaymentFragmentbindingInflater1 = i9;
        if (i8 % 2 != 0 ? i == 69 : i == 37) {
            return Float.valueOf(-fCalculateStepIncrement);
        }
        int i10 = i9 + 27;
        int i11 = i10 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11;
        if (i10 % 2 == 0 ? i != 70 : i != 112) {
            if (i != 81) {
                int i12 = i11 + 71;
                TuitionPaymentFragmentbindingInflater1 = i12 % 128;
                if (i12 % 2 != 0) {
                    return null;
                }
                int i13 = 10 / 0;
                return null;
            }
        }
        return Float.valueOf(fCalculateStepIncrement);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    private float calculateStepIncrement() {
        float f;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 85;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        if (i2 % 2 != 0) {
            f = this.stepSize;
            if (f == 0.0f) {
                f = 1.0f;
            }
        } else {
            f = this.stepSize;
            if (f == 0.0f) {
                f = 1.0f;
            }
        }
        int i4 = i3 + 97;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        r5 = java.lang.Math.round(r2 / r5) * r1;
        r1 = com.google.android.material.slider.BaseSlider.TuitionPaymentFragmentbindingInflater1 + 115;
        com.google.android.material.slider.BaseSlider.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (r2 <= r5) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r2 <= r5) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private float calculateStepIncrement(int r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.material.slider.BaseSlider.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            int r1 = r1 + 61
            int r2 = r1 % 128
            com.google.android.material.slider.BaseSlider.TuitionPaymentFragmentbindingInflater1 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1e
            float r1 = r4.calculateStepIncrement()
            float r2 = r4.valueTo
            float r3 = r4.valueFrom
            float r2 = r2 % r3
            float r2 = r2 * r1
            float r5 = (float) r5
            int r3 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r3 > 0) goto L2e
            goto L2d
        L1e:
            float r1 = r4.calculateStepIncrement()
            float r2 = r4.valueTo
            float r3 = r4.valueFrom
            float r2 = r2 - r3
            float r2 = r2 / r1
            float r5 = (float) r5
            int r3 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r3 > 0) goto L2e
        L2d:
            return r1
        L2e:
            float r2 = r2 / r5
            int r5 = java.lang.Math.round(r2)
            float r5 = (float) r5
            float r5 = r5 * r1
            int r1 = com.google.android.material.slider.BaseSlider.TuitionPaymentFragmentbindingInflater1
            int r1 = r1 + 115
            int r2 = r1 % 128
            com.google.android.material.slider.BaseSlider.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r2
            int r1 = r1 % r0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.calculateStepIncrement(int):float");
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 23;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        super.onFocusChanged(z, i, rect);
        if (!z) {
            this.activeThumbIdx = -1;
            this.accessibilityHelper.clearKeyboardFocusForVirtualView(this.focusedThumbIdx);
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 71;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        focusThumbOnFocusGained(i);
        this.accessibilityHelper.requestKeyboardFocusForVirtualView(this.focusedThumbIdx);
    }

    private void focusThumbOnFocusGained(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        if (i == 1) {
            moveFocus(Integer.MAX_VALUE);
            return;
        }
        if (i == 2) {
            moveFocus(Integer.MIN_VALUE);
            return;
        }
        if (i != 17) {
            if (i != 66) {
                return;
            }
            moveFocusInAbsoluteDirection(Integer.MIN_VALUE);
            return;
        }
        moveFocusInAbsoluteDirection(Integer.MAX_VALUE);
        int i5 = TuitionPaymentFragmentbindingInflater1 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final int getAccessibilityFocusedVirtualViewId() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        int accessibilityFocusedVirtualViewId = this.accessibilityHelper.getAccessibilityFocusedVirtualViewId();
        int i4 = TuitionPaymentFragmentbindingInflater1 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            return accessibilityFocusedVirtualViewId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        String name = SeekBar.class.getName();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 93;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return name;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:12:0x002c  */
    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 90 / 0;
            if (!this.accessibilityHelper.dispatchHoverEvent(motionEvent)) {
                if (!super.dispatchHoverEvent(motionEvent)) {
                    int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i6 = i5 + 5;
                    TuitionPaymentFragmentbindingInflater1 = i6 % 128;
                    int i7 = i6 % 2;
                    i = i5 + 1;
                    TuitionPaymentFragmentbindingInflater1 = i % 128;
                    if (i % 2 == 0) {
                        int i8 = 60 / 0;
                    }
                    return false;
                }
            }
        } else if (!this.accessibilityHelper.dispatchHoverEvent(motionEvent)) {
            if (!super.dispatchHoverEvent(motionEvent)) {
                int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i10 = i9 + 5;
                TuitionPaymentFragmentbindingInflater1 = i10 % 128;
                int i11 = i10 % 2;
                i = i9 + 1;
                TuitionPaymentFragmentbindingInflater1 = i % 128;
                if (i % 2 == 0) {
                    int i12 = 60 / 0;
                }
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 105;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        boolean zDispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        if (i3 == 0) {
            int i4 = 83 / 0;
        }
        int i5 = TuitionPaymentFragmentbindingInflater1 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return zDispatchKeyEvent;
    }

    private void scheduleAccessibilityEventSender(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 59;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        BaseSlider<S, L, T>.AccessibilityEventSender accessibilityEventSender = this.accessibilityEventSender;
        if (accessibilityEventSender == null) {
            this.accessibilityEventSender = new AccessibilityEventSender();
        } else {
            removeCallbacks(accessibilityEventSender);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 25;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
        }
        this.accessibilityEventSender.setVirtualViewId(i);
        postDelayed(this.accessibilityEventSender, 200L);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        int i = 2 % 2;
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.valueFrom = this.valueFrom;
        sliderState.valueTo = this.valueTo;
        sliderState.values = new ArrayList<>(this.values);
        sliderState.stepSize = this.stepSize;
        sliderState.hasFocus = hasFocus();
        int i2 = TuitionPaymentFragmentbindingInflater1 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        return sliderState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 77;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.valueFrom = sliderState.valueFrom;
        this.valueTo = sliderState.valueTo;
        setValuesInternal(sliderState.values);
        this.stepSize = sliderState.stepSize;
        if (sliderState.hasFocus) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 79;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            requestFocus();
            if (i5 == 0) {
                throw null;
            }
        }
    }

    void updateBoundsForVirtualViewId(int i, Rect rect) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        int iNormalizeValue = this.trackSidePadding + ((int) (normalizeValue(getValues().get(i).floatValue()) * this.trackWidth));
        int iCalculateTrackCenter = calculateTrackCenter();
        int iMax = Math.max(this.thumbWidth / 2, this.minTouchTargetSize / 2);
        int iMax2 = Math.max(this.thumbHeight / 2, this.minTouchTargetSize / 2);
        rect.set(iNormalizeValue - iMax, iCalculateTrackCenter - iMax2, iNormalizeValue + iMax, iCalculateTrackCenter + iMax2);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void $r8$lambda$WXiNVeXFM7RTh57Z9Tr5jBbN9l4(BaseSlider baseSlider) throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 51;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        baseSlider.updateLabels();
        if (i3 == 0) {
            throw null;
        }
    }

    protected float getMinSeparation() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 13;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            return 0.0f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void b() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new char[]{59710, 59756, 59746, 59750, 59740, 59731, 59746, 59751, 59768, 59773, 59757, 59723, 59739, 59770, 59717, 59714, 59757, 59751, 59771, 59744, 59746, 59756, 59778, 59409, 59432, 59413, 59421, 59398, 59398, 59422, 59411, 59433, 59435, 59414, 59408, 59420, 59409, 59791, 59398, 59396, 59394, 59396, 59396, 59872, 59898, 59393, 59392, 59397, 59877, 59887, 59393, 59409, 59420, 59711, 59757, 59759, 59746, 59770, 59749, 59749, 59773, 59755, 59743, 59745, 59750, 59742, 59730, 59746, 59759, 59681, 59733, 59750, 59744, 59752, 59753, 59753, 59756, 59746, 59744, 59771, 59751, 59757, 59714, 59724, 59747, 59771, 59716, 59708, 59737, 59744, 59749, 59748, 59748, 59749, 59773, 59699, 59771, 59731, 59729, 59770, 59746, 59744, 59769, 59768, 59751, 59747, 59749, 59751, 59749, 59745, 59753, 59757, 59745};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(short r6, byte r7, short r8) {
        /*
            int r6 = r6 * 4
            int r0 = r6 + 1
            byte[] r1 = com.google.android.material.slider.BaseSlider.$$c
            int r7 = r7 * 2
            int r7 = 4 - r7
            int r8 = 105 - r8
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2b
        L15:
            r3 = r2
        L16:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L26:
            r3 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r5
        L2b:
            int r7 = r7 + 1
            int r3 = -r3
            int r8 = r8 + r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.$$i(short, byte, short):java.lang.String");
    }
}
