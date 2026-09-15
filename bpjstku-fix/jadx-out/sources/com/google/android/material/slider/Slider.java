package com.google.android.material.slider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.material.R;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class Slider extends BaseSlider<Slider, OnChangeListener, OnSliderTouchListener> {
    private static final byte[] $$j = {51, -5, 77, 89};
    private static final int $$k = 88;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {5, 11, -122, -94, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$e = 96;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f807a = 1;
    private static char[] b = {47239, 47290, 47236, 47286, 47289, 47295, 47226, 47285, 47253, 47279, 47284, 47235, 47291, 47205, 47292, 47237, 47293, 47288, 47254, 47294, 47282, 47233, 47200, 47232};
    private static int TuitionPaymentFragmentbindingInflater1 = 2047719464;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;

    public interface OnChangeListener extends BaseOnChangeListener<Slider> {
        @Override // com.google.android.material.slider.BaseOnChangeListener
        void onValueChange(Slider slider, float f, boolean z);
    }

    public interface OnSliderTouchListener extends BaseOnSliderTouchListener<Slider> {
        @Override // com.google.android.material.slider.BaseOnSliderTouchListener
        void onStartTrackingTouch(Slider slider);

        @Override // com.google.android.material.slider.BaseOnSliderTouchListener
        void onStopTrackingTouch(Slider slider);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void g(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 4
            int r6 = r6 * 3
            int r6 = r6 + 53
            int r8 = r8 * 3
            int r8 = 84 - r8
            byte[] r0 = com.google.android.material.slider.Slider.$$d
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r6
            r4 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r7]
        L28:
            int r3 = -r3
            int r7 = r7 + 1
            int r8 = r8 + r3
            int r8 = r8 + (-11)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.Slider.g(short, byte, int, java.lang.Object[]):void");
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void addOnChangeListener(BaseOnChangeListener baseOnChangeListener) {
        int i = 2 % 2;
        int i2 = f807a + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        super.addOnChangeListener(baseOnChangeListener);
        if (i3 != 0) {
            int i4 = 46 / 0;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
        f807a = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void addOnSliderTouchListener(BaseOnSliderTouchListener baseOnSliderTouchListener) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
        f807a = i2 % 128;
        int i3 = i2 % 2;
        super.addOnSliderTouchListener(baseOnSliderTouchListener);
        int i4 = f807a + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void clearOnChangeListeners() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 121;
        f807a = i2 % 128;
        int i3 = i2 % 2;
        super.clearOnChangeListeners();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
        f807a = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void clearOnSliderTouchListeners() {
        int i = 2 % 2;
        int i2 = f807a + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.clearOnSliderTouchListeners();
        if (i3 != 0) {
            throw null;
        }
        int i4 = f807a + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public /* bridge */ /* synthetic */ boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 9;
        f807a = i2 % 128;
        int i3 = i2 % 2;
        boolean zDispatchHoverEvent = super.dispatchHoverEvent(motionEvent);
        int i4 = f807a + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return zDispatchHoverEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public /* bridge */ /* synthetic */ boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 5;
        f807a = i2 % 128;
        int i3 = i2 % 2;
        boolean zDispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
        f807a = i4 % 128;
        if (i4 % 2 != 0) {
            return zDispatchKeyEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public /* bridge */ /* synthetic */ CharSequence getAccessibilityClassName() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
        f807a = i2 % 128;
        int i3 = i2 % 2;
        CharSequence accessibilityClassName = super.getAccessibilityClassName();
        int i4 = f807a + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 38 / 0;
        }
        return accessibilityClassName;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getActiveThumbIndex() {
        int i = 2 % 2;
        int i2 = f807a + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        int activeThumbIndex = super.getActiveThumbIndex();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
        f807a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 46 / 0;
        }
        return activeThumbIndex;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getFocusedThumbIndex() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 57;
        f807a = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.getFocusedThumbIndex();
            throw null;
        }
        int focusedThumbIndex = super.getFocusedThumbIndex();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
        f807a = i3 % 128;
        if (i3 % 2 != 0) {
            return focusedThumbIndex;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getHaloRadius() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
        f807a = i2 % 128;
        int i3 = i2 % 2;
        int haloRadius = super.getHaloRadius();
        if (i3 == 0) {
            int i4 = 55 / 0;
        }
        return haloRadius;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ ColorStateList getHaloTintList() {
        ColorStateList haloTintList;
        int i = 2 % 2;
        int i2 = f807a + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            haloTintList = super.getHaloTintList();
            int i3 = 5 / 0;
        } else {
            haloTintList = super.getHaloTintList();
        }
        int i4 = f807a + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return haloTintList;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getLabelBehavior() {
        int labelBehavior;
        int i = 2 % 2;
        int i2 = f807a + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            labelBehavior = super.getLabelBehavior();
            int i3 = 78 / 0;
        } else {
            labelBehavior = super.getLabelBehavior();
        }
        int i4 = f807a + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return labelBehavior;
        }
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ float getStepSize() {
        int i = 2 % 2;
        int i2 = f807a + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return super.getStepSize();
        }
        super.getStepSize();
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ float getThumbElevation() {
        int i = 2 % 2;
        int i2 = f807a + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        float thumbElevation = super.getThumbElevation();
        if (i3 != 0) {
            int i4 = 94 / 0;
        }
        return thumbElevation;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getThumbHeight() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
        f807a = i2 % 128;
        int i3 = i2 % 2;
        int thumbHeight = super.getThumbHeight();
        int i4 = f807a + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return thumbHeight;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getThumbRadius() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
        f807a = i2 % 128;
        int i3 = i2 % 2;
        int thumbRadius = super.getThumbRadius();
        if (i3 == 0) {
            int i4 = 23 / 0;
        }
        return thumbRadius;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ ColorStateList getThumbStrokeColor() {
        int i = 2 % 2;
        int i2 = f807a + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        ColorStateList thumbStrokeColor = super.getThumbStrokeColor();
        int i4 = f807a + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return thumbStrokeColor;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ float getThumbStrokeWidth() {
        int i = 2 % 2;
        int i2 = f807a + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        float thumbStrokeWidth = super.getThumbStrokeWidth();
        if (i3 != 0) {
            int i4 = 72 / 0;
        }
        return thumbStrokeWidth;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ ColorStateList getThumbTintList() {
        ColorStateList thumbTintList;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 39;
        f807a = i2 % 128;
        if (i2 % 2 == 0) {
            thumbTintList = super.getThumbTintList();
            int i3 = 51 / 0;
        } else {
            thumbTintList = super.getThumbTintList();
        }
        int i4 = f807a + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return thumbTintList;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getThumbTrackGapSize() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
        f807a = i2 % 128;
        int i3 = i2 % 2;
        int thumbTrackGapSize = super.getThumbTrackGapSize();
        int i4 = f807a + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return thumbTrackGapSize;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getThumbWidth() {
        int i = 2 % 2;
        int i2 = f807a + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return super.getThumbWidth();
        }
        super.getThumbWidth();
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getTickActiveRadius() {
        int i = 2 % 2;
        int i2 = f807a + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        int tickActiveRadius = super.getTickActiveRadius();
        int i4 = f807a + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return tickActiveRadius;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ ColorStateList getTickActiveTintList() {
        int i = 2 % 2;
        int i2 = f807a + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        ColorStateList tickActiveTintList = super.getTickActiveTintList();
        if (i3 != 0) {
            int i4 = 14 / 0;
        }
        return tickActiveTintList;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getTickInactiveRadius() {
        int i = 2 % 2;
        int i2 = f807a + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        int tickInactiveRadius = super.getTickInactiveRadius();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
        f807a = i4 % 128;
        if (i4 % 2 != 0) {
            return tickInactiveRadius;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ ColorStateList getTickInactiveTintList() {
        int i = 2 % 2;
        int i2 = f807a + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        ColorStateList tickInactiveTintList = super.getTickInactiveTintList();
        int i4 = f807a + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return tickInactiveTintList;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ ColorStateList getTickTintList() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 23;
        f807a = i2 % 128;
        int i3 = i2 % 2;
        ColorStateList tickTintList = super.getTickTintList();
        int i4 = f807a + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return tickTintList;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ ColorStateList getTrackActiveTintList() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
        f807a = i2 % 128;
        if (i2 % 2 == 0) {
            super.getTrackActiveTintList();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ColorStateList trackActiveTintList = super.getTrackActiveTintList();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
        f807a = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 40 / 0;
        }
        return trackActiveTintList;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getTrackHeight() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 41;
        f807a = i2 % 128;
        if (i2 % 2 == 0) {
            super.getTrackHeight();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int trackHeight = super.getTrackHeight();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
        f807a = i3 % 128;
        int i4 = i3 % 2;
        return trackHeight;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ ColorStateList getTrackInactiveTintList() {
        int i = 2 % 2;
        int i2 = f807a + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            super.getTrackInactiveTintList();
            throw null;
        }
        ColorStateList trackInactiveTintList = super.getTrackInactiveTintList();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
        f807a = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 22 / 0;
        }
        return trackInactiveTintList;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getTrackInsideCornerSize() {
        int i = 2 % 2;
        int i2 = f807a + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        int trackInsideCornerSize = super.getTrackInsideCornerSize();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
        f807a = i4 % 128;
        int i5 = i4 % 2;
        return trackInsideCornerSize;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getTrackSidePadding() {
        int i = 2 % 2;
        int i2 = f807a + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        int trackSidePadding = super.getTrackSidePadding();
        int i4 = f807a + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return trackSidePadding;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getTrackStopIndicatorSize() {
        int i = 2 % 2;
        int i2 = f807a + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        int trackStopIndicatorSize = super.getTrackStopIndicatorSize();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
        f807a = i4 % 128;
        if (i4 % 2 != 0) {
            return trackStopIndicatorSize;
        }
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ ColorStateList getTrackTintList() {
        int i = 2 % 2;
        int i2 = f807a + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        ColorStateList trackTintList = super.getTrackTintList();
        int i4 = f807a + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return trackTintList;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getTrackWidth() {
        int i = 2 % 2;
        int i2 = f807a + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        int trackWidth = super.getTrackWidth();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
        f807a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 70 / 0;
        }
        return trackWidth;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ float getValueFrom() {
        int i = 2 % 2;
        int i2 = f807a + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            super.getValueFrom();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float valueFrom = super.getValueFrom();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
        f807a = i3 % 128;
        int i4 = i3 % 2;
        return valueFrom;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ float getValueTo() {
        int i = 2 % 2;
        int i2 = f807a + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return super.getValueTo();
        }
        super.getValueTo();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ boolean hasLabelFormatter() {
        boolean zHasLabelFormatter;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 121;
        f807a = i2 % 128;
        if (i2 % 2 == 0) {
            zHasLabelFormatter = super.hasLabelFormatter();
            int i3 = 56 / 0;
        } else {
            zHasLabelFormatter = super.hasLabelFormatter();
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 107;
        f807a = i4 % 128;
        if (i4 % 2 != 0) {
            return zHasLabelFormatter;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ boolean isTickVisible() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
        f807a = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsTickVisible = super.isTickVisible();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
        f807a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 23 / 0;
        }
        return zIsTickVisible;
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyDown(int i, KeyEvent keyEvent) {
        int i2 = 2 % 2;
        int i3 = f807a + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            super.onKeyDown(i, keyEvent);
            throw null;
        }
        boolean zOnKeyDown = super.onKeyDown(i, keyEvent);
        int i4 = f807a + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnKeyDown;
        }
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyUp(int i, KeyEvent keyEvent) {
        int i2 = 2 % 2;
        int i3 = f807a + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        boolean zOnKeyUp = super.onKeyUp(i, keyEvent);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 117;
        f807a = i5 % 128;
        int i6 = i5 % 2;
        return zOnKeyUp;
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = f807a + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return super.onTouchEvent(motionEvent);
        }
        super.onTouchEvent(motionEvent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void removeOnChangeListener(BaseOnChangeListener baseOnChangeListener) {
        int i = 2 % 2;
        int i2 = f807a + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        super.removeOnChangeListener(baseOnChangeListener);
        if (i3 != 0) {
            throw null;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
        f807a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 43 / 0;
        }
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void removeOnSliderTouchListener(BaseOnSliderTouchListener baseOnSliderTouchListener) {
        int i = 2 % 2;
        int i2 = f807a + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        super.removeOnSliderTouchListener(baseOnSliderTouchListener);
        int i4 = f807a + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public /* bridge */ /* synthetic */ void setEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
        f807a = i2 % 128;
        int i3 = i2 % 2;
        super.setEnabled(z);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
        f807a = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setFocusedThumbIndex(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
        f807a = i3 % 128;
        int i4 = i3 % 2;
        super.setFocusedThumbIndex(i);
        int i5 = f807a + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setHaloRadius(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 79;
        f807a = i3 % 128;
        int i4 = i3 % 2;
        super.setHaloRadius(i);
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = f807a + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 22 / 0;
        }
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setHaloRadiusResource(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 107;
        f807a = i3 % 128;
        int i4 = i3 % 2;
        super.setHaloRadiusResource(i);
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
        f807a = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setHaloTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = f807a + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        super.setHaloTintList(colorStateList);
        if (i3 != 0) {
            int i4 = 13 / 0;
        }
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setLabelBehavior(int i) {
        int i2 = 2 % 2;
        int i3 = f807a + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        super.setLabelBehavior(i);
        int i5 = f807a + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setLabelFormatter(LabelFormatter labelFormatter) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
        f807a = i2 % 128;
        int i3 = i2 % 2;
        super.setLabelFormatter(labelFormatter);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setStepSize(float f) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
        f807a = i2 % 128;
        int i3 = i2 % 2;
        super.setStepSize(f);
        if (i3 == 0) {
            throw null;
        }
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbElevation(float f) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
        f807a = i2 % 128;
        int i3 = i2 % 2;
        super.setThumbElevation(f);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
        f807a = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbElevationResource(int i) {
        int i2 = 2 % 2;
        int i3 = f807a + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        super.setThumbElevationResource(i);
        if (i4 != 0) {
            int i5 = 60 / 0;
        }
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
        f807a = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 42 / 0;
        }
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbHeight(int i) {
        int i2 = 2 % 2;
        int i3 = f807a + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        super.setThumbHeight(i);
        if (i4 != 0) {
            int i5 = 95 / 0;
        }
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbHeightResource(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
        f807a = i3 % 128;
        int i4 = i3 % 2;
        super.setThumbHeightResource(i);
        if (i4 == 0) {
            int i5 = 27 / 0;
        }
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbRadius(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
        f807a = i3 % 128;
        int i4 = i3 % 2;
        super.setThumbRadius(i);
        int i5 = f807a + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbRadiusResource(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
        f807a = i3 % 128;
        int i4 = i3 % 2;
        super.setThumbRadiusResource(i);
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
        f807a = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbStrokeColor(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = f807a + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        super.setThumbStrokeColor(colorStateList);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
        f807a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 42 / 0;
        }
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbStrokeColorResource(int i) {
        int i2 = 2 % 2;
        int i3 = f807a + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        super.setThumbStrokeColorResource(i);
        if (i4 != 0) {
            throw null;
        }
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbStrokeWidth(float f) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
        f807a = i2 % 128;
        int i3 = i2 % 2;
        super.setThumbStrokeWidth(f);
        if (i3 == 0) {
            int i4 = 68 / 0;
        }
        int i5 = f807a + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbStrokeWidthResource(int i) {
        int i2 = 2 % 2;
        int i3 = f807a + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        super.setThumbStrokeWidthResource(i);
        if (i4 != 0) {
            int i5 = 3 / 0;
        }
    }

    private static void f(int i, char[] cArr, int[] iArr, byte[] bArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr2;
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr3 = b;
        if (cArr3 != null) {
            int i3 = $11 + 113;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i4])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 31339), 2995 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 17 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1182129903, false, $$l(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i4] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
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
            Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43325 - Color.alpha(0)), 253 - (ViewConfiguration.getWindowTouchSlop() >> 8), 22 - Gravity.getAbsoluteGravity(0, 0), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
            int i5 = 1687675375;
            if (!(!TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
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
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (33602 - (ViewConfiguration.getTapTimeout() >> 16)), 3085 - View.resolveSize(0, 0), 26 - View.resolveSizeAndState(0, 0, 0), -2146875848, false, $$l(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr4);
                int i6 = $11 + 119;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                return;
            }
            if (!TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    int i8 = $10 + 19;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
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
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 1;
                    byte b7 = (byte) (b6 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (33603 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), TextUtils.getCapsMode("", 0, 0) + 3085, 26 - (Process.myTid() >> 22), -2146875848, false, $$l(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                i5 = 1687675375;
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

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbTintList(ColorStateList colorStateList) throws Throwable {
        int iIntValue;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Color.argb(0, 0, 0, 0) + 46400), (ViewConfiguration.getTapTimeout() >> 16) + 40, ((Process.getThreadPriority(0) + 20) >> 6) + 19, -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
        }
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object[] objArr = new Object[1];
        f(127 - View.resolveSizeAndState(0, 0, 0), null, null, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        f(127 - Color.alpha(0), null, null, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j = 614;
        long jIdentityHashCode = System.identityHashCode(this);
        long j2 = -1;
        long j3 = j2 ^ 79262972304350364L;
        long j4 = (j3 | 2017994202437608623L) ^ j2;
        long j5 = j2 ^ 2017994202437608623L;
        long j6 = (((long) 615) * 79262972304350364L) + (((long) (-613)) * 2017994202437608623L) + ((jIdentityHashCode | j4 | ((j5 | 79262972304350364L) ^ j2)) * j);
        long j7 = jIdentityHashCode ^ j2;
        long j8 = j6 + (((long) (-1228)) * (((j3 | j7) ^ j2) | j4 | ((2017994202437608623L | j7) ^ j2))) + (j * ((j2 ^ (j7 | 2096948211840187583L)) | (((j3 | j5) | j7) ^ j2)));
        try {
            for (int i3 = 0; i3 != 10; i3++) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
                f807a = i4 % 128;
                int i5 = i4 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Gravity.getAbsoluteGravity(0, 0) + 37836), (ViewConfiguration.getEdgeSlop() >> 16) + 59, 18 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                }
                int i6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
                long j9 = jLongValue;
                int i7 = 0;
                while (true) {
                    for (int i8 = 0; i8 != 8; i8++) {
                        i6 = (((((int) (j9 >> i8)) & 255) + (i6 << 6)) + (i6 << 16)) - i6;
                    }
                    if (i7 != 0) {
                        break;
                    }
                    int i9 = f807a + 17;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
                    int i10 = i9 % 2;
                    i7++;
                    j9 = j8;
                }
                if (i6 == i2) {
                    super.setThumbTintList(colorStateList);
                    return;
                }
                jLongValue -= 1024;
            }
            Object[] objArr3 = {73874572};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (46038 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 1134 - TextUtils.indexOf("", "", 0, 0), Process.getGidForName("") + 19, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr4 = {Integer.valueOf(iIntValue), 0, -1556364366, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr3), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                int scrollBarSize = 1031 - (ViewConfiguration.getScrollBarSize() >> 8);
                int iAlpha = Color.alpha(0) + 15;
                byte b2 = $$d[7];
                byte b3 = b2;
                Object[] objArr5 = new Object[1];
                g(b2, b3, b3, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveOpacity, scrollBarSize, iAlpha, 1298546779, false, (String) objArr5[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 45993), Color.alpha(0) + 1117, 17 - TextUtils.indexOf("", "", 0)), Boolean.TYPE});
            }
            Object[] objArr6 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4);
            int i11 = 0;
            int i12 = ((int[]) objArr6[1])[0];
            int i13 = ((int[]) objArr6[3])[0];
            if (i13 != i12) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr6[0];
                if (strArr != null) {
                    int i14 = f807a + 117;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i14 % 128;
                    int i15 = i14 % 2;
                    while (i11 < strArr.length) {
                        int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
                        f807a = i16 % 128;
                        if (i16 % 2 == 0) {
                            arrayList.add(strArr[i11]);
                            i11 += 45;
                        } else {
                            arrayList.add(strArr[i11]);
                            i11++;
                        }
                    }
                }
                int[] iArr = new int[i13];
                int i17 = i13 - 1;
                iArr[i17] = 1;
                Toast.makeText((Context) null, iArr[((i13 * i17) % 2) - 1], 1).show();
                int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
                f807a = i18 % 128;
                int i19 = i18 % 2;
            }
            super.setThumbTintList(colorStateList);
            return;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
        Object[] objArr7 = new Object[1];
        f(127 - Color.argb(0, 0, 0, 0), null, null, new byte[]{-115, -116, -117, -120, -118, -119, -121, -106, -126, -127, -113, -121, -127, -107, -127, -108}, objArr7);
        Class<?> cls2 = Class.forName((String) objArr7[0]);
        Object[] objArr8 = new Object[1];
        f((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 127, null, null, new byte[]{-116, -125, -123, -114, -104, -120, -127, -105, -118, -117, -122, -117, -126, -116, -125, -122}, objArr8);
        iIntValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbTrackGapSize(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
        f807a = i3 % 128;
        int i4 = i3 % 2;
        super.setThumbTrackGapSize(i);
        int i5 = f807a + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 34 / 0;
        }
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbWidth(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
        f807a = i3 % 128;
        int i4 = i3 % 2;
        super.setThumbWidth(i);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 13;
        f807a = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbWidthResource(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
        f807a = i3 % 128;
        int i4 = i3 % 2;
        super.setThumbWidthResource(i);
        int i5 = f807a + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickActiveRadius(int i) {
        int i2 = 2 % 2;
        int i3 = f807a + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        super.setTickActiveRadius(i);
        if (i4 != 0) {
            throw null;
        }
        int i5 = f807a + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickActiveTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = f807a + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        super.setTickActiveTintList(colorStateList);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
        f807a = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickInactiveRadius(int i) {
        int i2 = 2 % 2;
        int i3 = f807a + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        super.setTickInactiveRadius(i);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
        f807a = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickInactiveTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
        f807a = i2 % 128;
        int i3 = i2 % 2;
        super.setTickInactiveTintList(colorStateList);
        if (i3 == 0) {
            int i4 = 17 / 0;
        }
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
        f807a = i2 % 128;
        int i3 = i2 % 2;
        super.setTickTintList(colorStateList);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
        f807a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 91 / 0;
        }
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickVisible(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
        f807a = i2 % 128;
        int i3 = i2 % 2;
        super.setTickVisible(z);
        int i4 = f807a + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackActiveTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
        f807a = i2 % 128;
        int i3 = i2 % 2;
        super.setTrackActiveTintList(colorStateList);
        int i4 = f807a + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackHeight(int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 121;
        f807a = i3 % 128;
        int i4 = i3 % 2;
        super.setTrackHeight(i);
        if (i4 == 0) {
            throw null;
        }
        int i5 = f807a + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackInactiveTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = f807a + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        super.setTrackInactiveTintList(colorStateList);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
        f807a = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackInsideCornerSize(int i) {
        int i2 = 2 % 2;
        int i3 = f807a + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        super.setTrackInsideCornerSize(i);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
        f807a = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackStopIndicatorSize(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
        f807a = i3 % 128;
        int i4 = i3 % 2;
        super.setTrackStopIndicatorSize(i);
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
        f807a = i2 % 128;
        int i3 = i2 % 2;
        super.setTrackTintList(colorStateList);
        if (i3 == 0) {
            int i4 = 71 / 0;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
        f807a = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setValueFrom(float f) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 39;
        f807a = i2 % 128;
        int i3 = i2 % 2;
        super.setValueFrom(f);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
        f807a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 41 / 0;
        }
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setValueTo(float f) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
        f807a = i2 % 128;
        int i3 = i2 % 2;
        super.setValueTo(f);
        if (i3 == 0) {
            throw null;
        }
        int i4 = f807a + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
    }

    public Slider(Context context) {
        this(context, null);
    }

    public Slider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.sliderStyle);
    }

    public Slider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{android.R.attr.value});
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            setValue(typedArrayObtainStyledAttributes.getFloat(0, 0.0f));
            int i2 = f807a + 13;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 3 % 4;
            } else {
                int i4 = 2 % 2;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 27;
        f807a = i5 % 128;
        int i6 = i5 % 2;
    }

    public float getValue() {
        int i = 2 % 2;
        int i2 = f807a + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        float fFloatValue = getValues().get(0).floatValue();
        int i4 = f807a + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return fFloatValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setValue(float f) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
        f807a = i2 % 128;
        int i3 = i2 % 2;
        Float[] fArr = {Float.valueOf(f)};
        if (i3 == 0) {
            setValues(fArr);
        } else {
            setValues(fArr);
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 91;
        f807a = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setCustomThumbDrawable(int i) {
        int i2 = 2 % 2;
        int i3 = f807a + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        super.setCustomThumbDrawable(i);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 9;
        f807a = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setCustomThumbDrawable(Drawable drawable) {
        int i = 2 % 2;
        int i2 = f807a + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        super.setCustomThumbDrawable(drawable);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
        f807a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 38 / 0;
        }
    }

    @Override // com.google.android.material.slider.BaseSlider
    protected boolean pickActiveThumb() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
        f807a = i2 % 128;
        int i3 = i2 % 2;
        if (getActiveThumbIndex() != -1) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
            f807a = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        setActiveThumbIndex(0);
        int i6 = f807a + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$l(int r6, int r7, byte r8) {
        /*
            int r8 = r8 + 4
            int r6 = 68 - r6
            int r7 = r7 * 4
            int r0 = 1 - r7
            byte[] r1 = com.google.android.material.slider.Slider.$$j
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2e
        L14:
            r3 = r2
        L15:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            int r3 = r3 + 1
            int r6 = r6 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = r6 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.Slider.$$l(int, int, byte):java.lang.String");
    }
}
