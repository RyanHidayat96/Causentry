package com.google.android.material.slider;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.android.material.R;
import com.google.android.material.internal.ThemeEnforcement;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes6.dex */
public class RangeSlider extends BaseSlider<RangeSlider, OnChangeListener, OnSliderTouchListener> {
    private float minSeparation;
    private int separationUnit;
    private static final byte[] $$l = {67, -127, -109, 9};
    private static final int $$m = 47;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {115, 98, 19, 9, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 54, 3, 3, -72, 48, 17, -4, -15, -61, 48, 12, -10, -62, 66, -13, -5, 4, -8, 2, -67, 33, 16, 14, -10, -15, -5, 16, -14, 3, -4, -47, 42, 3, -10, -13, -20, 15, 10, 1, -16, -9, -1, 30, -15, 8, -14, 3, -4, -33, 14, 21, -15, -11, 6, 3, -49, 41, -20, 3, 3, -11, 6, 3, -4, -6, -14, -5, 3, -11, 8, -6, 2, -5, -6, 2, -12, -4, 15, -16, -7, 15, -45, 31, -14, -2, 4, -11, -2, -2, -8, 17, -12, 5, -70, 9, -5, -66, 72, -27, 8, -14, 10, 3, -14, 7, -72, 68, -21, 12, -6, -2, -69, 68, -4, -14, 0, -65, 17, 36, 8, -10, -15, 12, -39, 32, -17, 0, -18, 28, -14, 0, 4, 9, -5, -66, 48, 12, -3, 0, -16, 3, 10, -23, 10, -71, 56, 2, 3, -18, 10, -7, -16, 8, -65, 16, 2, 28, -55, 70, -42, -18, 4, -42, 26, 2, 24, -51, 69, -41, -18, 4};
    private static final int $$k = 108;
    private static final byte[] $$d = {82, Base64.padSymbol, -66, -42, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 29, -31, 48, 17, -4, 24, -1, 6, 13, 13, 29, -38, 50, 16, 1, 12, 24};
    private static final int $$e = 8;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {45565, 52152, 17772, 57136, 22747, 53895, 27716, 59828, 25507, 64885, 30550, 61665, 2717, 33837, 484, 39855, 5457, 44853, 10436, 41613, 15415, 47589, 45561, 52154, 17769, 57138, 22727, 53899, 27716, 59848, 25513, 64871, 30484, 61638, 2701, 33843, 501, 45565, 52152, 17772, 57136, 22747, 53895, 27716, 59828, 25517, 64886, 30472, 61596, 2725, 33853, 484, 39843, 5450, 44831, 10460, 41627, 15360, 47590, 13234, 19807, 50957, 16578, 45567, 52131, 17786, 57136, 22737, 53888, 27732, 59867, 25532, 64886, 30484, 61659, 2695, 33855, 484, 39843, 5459, 44824, 45558, 52151, 17790, 57123, 22682, 53890, 27713, 59892, 25515, 64808, 30507, 61643, 2711, 33834, 501, 39847, 45557, 52146, 17773, 57132, 22720, 53895, 27732, 59875, 25476, 64871, 30475, 61658, 2727, 33841, 500, 39855, 45486, 52147, 17774, 57123, 22741, 53900, 27718, 59820, 25589, 64864, 30494, 61575, 2689, 33851, 497, 39935, 5387, 44871, 10398, 41607, 15457, 47545, 13303, 19800, 50953, 16529, 55930, 21603, 53687, 27546, 58628, 32595, 63717, 29303, 35962, 2491, 33733, 7455, 38744, 4283, 43626, 9331, 41356, 15306, 46402, 52987, 18659, 49727, 23581, 55686, 21456, 60739, 26272, 57590, 31282, 62488, 29077, 35806, 1388, 40688, 6310, 37464, 11330, 43464, 45567, 52151, 17772, 57204, 22660, 53979, 27714, 59821, 25513, 64864, 30536, 61648, 2689, 33900, 502, 39934, 5390, 44869, 10398, 41681, 15457, 47545, 13222, 19724, 50958, 16530, 55930, 21611, 53687, 27591, 58633, 32594, 63717, 29300, 35965, 2483, 33728, 7499, 38657, 4328, 43582, 9251, 41438, 15300, 46355, 52906, 18659, 49721, 23621, 55765, 21457, 60699, 26358, 57594, 31283, 62536, 29135, 35712, 1386, 40614, 6309, 37390, 11334, 43468};
    private static long TuitionPaymentFragmentbindingInflater1 = 3500600562330160086L;

    public interface OnChangeListener extends BaseOnChangeListener<RangeSlider> {
        @Override // com.google.android.material.slider.BaseOnChangeListener
        void onValueChange(RangeSlider rangeSlider, float f, boolean z);
    }

    public interface OnSliderTouchListener extends BaseOnSliderTouchListener<RangeSlider> {
        @Override // com.google.android.material.slider.BaseOnSliderTouchListener
        void onStartTrackingTouch(RangeSlider rangeSlider);

        @Override // com.google.android.material.slider.BaseOnSliderTouchListener
        void onStopTrackingTouch(RangeSlider rangeSlider);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0022). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 + 84
            byte[] r0 = com.google.android.material.slider.RangeSlider.$$d
            int r5 = 53 - r5
            int r6 = 155 - r6
            byte[] r1 = new byte[r5]
            r2 = 0
            if (r0 != 0) goto L10
            r4 = r6
            r3 = r2
            goto L22
        L10:
            r3 = r2
        L11:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r5) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L20:
            r4 = r0[r6]
        L22:
            int r6 = r6 + 1
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.RangeSlider.a(short, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void g(short r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 2
            int r7 = 154 - r7
            byte[] r0 = com.google.android.material.slider.RangeSlider.$$j
            int r6 = 99 - r6
            int r1 = 61 - r5
            byte[] r1 = new byte[r1]
            int r5 = 60 - r5
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r6
            r3 = r2
            r6 = r5
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r5) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r7]
        L27:
            int r6 = r6 + r4
            int r6 = r6 + 3
            int r7 = r7 + 1
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.RangeSlider.g(short, short, byte, java.lang.Object[]):void");
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void addOnChangeListener(BaseOnChangeListener baseOnChangeListener) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        super.addOnChangeListener(baseOnChangeListener);
        if (i3 != 0) {
            throw null;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void addOnSliderTouchListener(BaseOnSliderTouchListener baseOnSliderTouchListener) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        super.addOnSliderTouchListener(baseOnSliderTouchListener);
        if (i3 == 0) {
            int i4 = 11 / 0;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void clearOnChangeListeners() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        super.clearOnChangeListeners();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void clearOnSliderTouchListeners() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.clearOnSliderTouchListeners();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public /* bridge */ /* synthetic */ boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return super.dispatchHoverEvent(motionEvent);
        }
        super.dispatchHoverEvent(motionEvent);
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public /* bridge */ /* synthetic */ boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        boolean zDispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return zDispatchKeyEvent;
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public /* bridge */ /* synthetic */ CharSequence getAccessibilityClassName() {
        CharSequence accessibilityClassName;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            accessibilityClassName = super.getAccessibilityClassName();
            int i3 = 36 / 0;
        } else {
            accessibilityClassName = super.getAccessibilityClassName();
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return accessibilityClassName;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getActiveThumbIndex() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            return super.getActiveThumbIndex();
        }
        super.getActiveThumbIndex();
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getFocusedThumbIndex() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        int focusedThumbIndex = super.getFocusedThumbIndex();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return focusedThumbIndex;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getHaloRadius() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        int haloRadius = super.getHaloRadius();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return haloRadius;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ ColorStateList getHaloTintList() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return super.getHaloTintList();
        }
        super.getHaloTintList();
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getLabelBehavior() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        int labelBehavior = super.getLabelBehavior();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 85 / 0;
        }
        return labelBehavior;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ float getStepSize() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        float stepSize = super.getStepSize();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 61 / 0;
        }
        return stepSize;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ float getThumbElevation() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        float thumbElevation = super.getThumbElevation();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return thumbElevation;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getThumbHeight() {
        int thumbHeight;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            thumbHeight = super.getThumbHeight();
            int i3 = 66 / 0;
        } else {
            thumbHeight = super.getThumbHeight();
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return thumbHeight;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getThumbRadius() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        int thumbRadius = super.getThumbRadius();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 24 / 0;
        }
        return thumbRadius;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ ColorStateList getThumbStrokeColor() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            return super.getThumbStrokeColor();
        }
        super.getThumbStrokeColor();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ float getThumbStrokeWidth() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            super.getThumbStrokeWidth();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float thumbStrokeWidth = super.getThumbStrokeWidth();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        return thumbStrokeWidth;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ ColorStateList getThumbTintList() {
        ColorStateList thumbTintList;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            thumbTintList = super.getThumbTintList();
            int i3 = 87 / 0;
        } else {
            thumbTintList = super.getThumbTintList();
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            return thumbTintList;
        }
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getThumbTrackGapSize() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return super.getThumbTrackGapSize();
        }
        super.getThumbTrackGapSize();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getThumbWidth() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            super.getThumbWidth();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int thumbWidth = super.getThumbWidth();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        return thumbWidth;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getTickActiveRadius() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        int tickActiveRadius = super.getTickActiveRadius();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return tickActiveRadius;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ ColorStateList getTickActiveTintList() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        ColorStateList tickActiveTintList = super.getTickActiveTintList();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            return tickActiveTintList;
        }
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getTickInactiveRadius() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            super.getTickInactiveRadius();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int tickInactiveRadius = super.getTickInactiveRadius();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        return tickInactiveRadius;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ ColorStateList getTickInactiveTintList() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        ColorStateList tickInactiveTintList = super.getTickInactiveTintList();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            return tickInactiveTintList;
        }
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ ColorStateList getTickTintList() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        ColorStateList tickTintList = super.getTickTintList();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 29 / 0;
        }
        return tickTintList;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ ColorStateList getTrackActiveTintList() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        ColorStateList trackActiveTintList = super.getTrackActiveTintList();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return trackActiveTintList;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getTrackHeight() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        int trackHeight = super.getTrackHeight();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            return trackHeight;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ ColorStateList getTrackInactiveTintList() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            super.getTrackInactiveTintList();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ColorStateList trackInactiveTintList = super.getTrackInactiveTintList();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        return trackInactiveTintList;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getTrackInsideCornerSize() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            super.getTrackInsideCornerSize();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int trackInsideCornerSize = super.getTrackInsideCornerSize();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 50 / 0;
        }
        return trackInsideCornerSize;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getTrackSidePadding() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        int trackSidePadding = super.getTrackSidePadding();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return trackSidePadding;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getTrackStopIndicatorSize() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            return super.getTrackStopIndicatorSize();
        }
        super.getTrackStopIndicatorSize();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ ColorStateList getTrackTintList() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        ColorStateList trackTintList = super.getTrackTintList();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return trackTintList;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getTrackWidth() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            super.getTrackWidth();
            throw null;
        }
        int trackWidth = super.getTrackWidth();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 15 / 0;
        }
        return trackWidth;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ float getValueFrom() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        float valueFrom = super.getValueFrom();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            return valueFrom;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ float getValueTo() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        float valueTo = super.getValueTo();
        if (i3 == 0) {
            int i4 = 29 / 0;
        }
        return valueTo;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ boolean hasLabelFormatter() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            super.hasLabelFormatter();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zHasLabelFormatter = super.hasLabelFormatter();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        return zHasLabelFormatter;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ boolean isTickVisible() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsTickVisible = super.isTickVisible();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            return zIsTickVisible;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyDown(int i, KeyEvent keyEvent) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            return super.onKeyDown(i, keyEvent);
        }
        super.onKeyDown(i, keyEvent);
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyUp(int i, KeyEvent keyEvent) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            return super.onKeyUp(i, keyEvent);
        }
        super.onKeyUp(i, keyEvent);
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            return super.onTouchEvent(motionEvent);
        }
        super.onTouchEvent(motionEvent);
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void removeOnChangeListener(BaseOnChangeListener baseOnChangeListener) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        super.removeOnChangeListener(baseOnChangeListener);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:54:0x02d9  */
    private static void f(char c, int i, int i2, Object[] objArr) throws Throwable {
        Object obj;
        Throwable cause;
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (true) {
            obj = null;
            if (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= i2) {
                break;
            }
            int i4 = $10 + 17;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2[i / i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Process.getGidForName("") + 1), View.MeasureSpec.getSize(0) + 2187, 40 - ((Process.getThreadPriority(0) + 20) >> 6), 841711447, false, $$n(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(TuitionPaymentFragmentbindingInflater1), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33017 - View.MeasureSpec.getSize(0)), Drawable.resolveOpacity(0, 0) + 3011, 26 - Color.green(0), 321985076, false, $$n(b3, b4, (byte) (b4 + 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (View.combineMeasuredStates(0, 0) + 36505), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 3377, 17 - (ViewConfiguration.getTapTimeout() >> 16), -968507904, false, $$n(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                Object[] objArr5 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2[i + i6])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), ((byte) KeyEvent.getModifierMetaStateMask()) + 2188, 39 - TextUtils.lastIndexOf("", '0'), 841711447, false, $$n(b7, b8, b8), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(TuitionPaymentFragmentbindingInflater1), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b9 = (byte) 0;
                    byte b10 = b9;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (33018 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3011, 27 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 321985076, false, $$n(b9, b10, (byte) (b10 + 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    byte b11 = (byte) 0;
                    byte b12 = b11;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 36505), ExpandableListView.getPackedPositionGroup(0L) + 3376, 17 - Gravity.getAbsoluteGravity(0, 0), -968507904, false, $$n(b11, b12, (byte) (b12 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i7 = $11 + 109;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                byte b13 = (byte) 0;
                byte b14 = b13;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 36505), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3376, 17 - ExpandableListView.getPackedPositionGroup(0L), -968507904, false, $$n(b13, b14, (byte) (b14 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
        }
        objArr[0] = new String(cArr);
        int i9 = $11 + 109;
        $10 = i9 % 128;
        if (i9 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static class RangeSliderState extends AbsSavedState {
        public static final Parcelable.Creator<RangeSliderState> CREATOR = new Parcelable.Creator<RangeSliderState>() { // from class: com.google.android.material.slider.RangeSlider.RangeSliderState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public RangeSliderState createFromParcel(Parcel parcel) {
                return new RangeSliderState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public RangeSliderState[] newArray(int i) {
                return new RangeSliderState[i];
            }
        };
        private float minSeparation;
        private int separationUnit;

        RangeSliderState(Parcelable parcelable) {
            super(parcelable);
        }

        private RangeSliderState(Parcel parcel) {
            super(parcel.readParcelable(RangeSliderState.class.getClassLoader()));
            this.minSeparation = parcel.readFloat();
            this.separationUnit = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.minSeparation);
            parcel.writeInt(this.separationUnit);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0224  */
    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void removeOnSliderTouchListener(BaseOnSliderTouchListener baseOnSliderTouchListener) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char threadPriority = (char) (31533 - ((Process.getThreadPriority(0) + 20) >> 6));
            int gidForName = 920 - Process.getGidForName("");
            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 29;
            Object[] objArr2 = new Object[1];
            a((byte) 52, (short) 151, (byte) ($$e | 6), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(threadPriority, gidForName, packedPositionChild, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        f((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), KeyEvent.getDeadChar(0, 0), 22 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        f((char) (TextUtils.lastIndexOf("", '0', 0) + 1), Color.red(0) + 22, 15 - (ViewConfiguration.getTapTimeout() >> 16), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 31533);
            int i3 = 921 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int iAxisFromString = 27 - MotionEvent.axisFromString("");
            byte b = $$d[7];
            byte b2 = b;
            Object[] objArr5 = new Object[1];
            a(b2, (short) (b2 | 151), b, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(pressedStateDuration, i3, iAxisFromString, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char trimmedLength = (char) (31533 - TextUtils.getTrimmedLength(""));
                int maximumFlingVelocity = 921 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int packedPositionChild2 = 27 - ExpandableListView.getPackedPositionChild(0L);
                Object[] objArr6 = new Object[1];
                a((byte) ($$e | 7), (short) 99, $$d[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(trimmedLength, maximumFlingVelocity, packedPositionChild2, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i4 = ((int[]) objArr7[3])[0];
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{i4}, (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = ~iIdentityHashCode;
            int i6 = ((1053551265 + (((~((-984388337) | i5)) | (~((-789691308) | iIdentityHashCode))) * (-370))) + ((((~(iIdentityHashCode | (-984388337))) | (~(i5 | (-789691308)))) | (-1069399036)) * (-370))) - 1417269088;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
            int i10 = i9 % 2;
        } else {
            Object[] objArr8 = new Object[1];
            f((char) Color.alpha(0), 37 - View.resolveSizeAndState(0, 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 27, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            f((char) (TextUtils.lastIndexOf("", '0', 0) + 1), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 63, 18 - (KeyEvent.getMaxKeyCode() >> 16), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 77;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
                    if (i11 % 2 != 0) {
                        ((ContextWrapper) applicationContext).getBaseContext();
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
            f((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 81 - View.combineMeasuredStates(0, 0), 16 - TextUtils.getCapsMode("", 0, 0), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            f((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 96 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 15 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 95;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
            int i13 = i12 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -876617000};
                byte[] bArr = $$j;
                byte b3 = bArr[137];
                byte b4 = b3;
                Object[] objArr13 = new Object[1];
                g(b3, b4, (byte) (b4 | 75), objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                g(bArr[66], bArr[58], (byte) (-bArr[103]), objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 31534);
                    int iIndexOf = 920 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 28;
                    Object[] objArr16 = new Object[1];
                    a((byte) ($$e | 7), (short) 99, $$d[7], objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, iIndexOf, pressedStateDuration2, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    f((char) View.resolveSizeAndState(0, 0, 0), Gravity.getAbsoluteGravity(0, 0), 22 - (Process.myPid() >> 22), objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    f((char) TextUtils.getOffsetBefore("", 0), 23 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), TextUtils.getOffsetAfter("", 0) + 15, objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char pressedStateDuration3 = (char) (31533 - (ViewConfiguration.getPressedStateDuration() >> 16));
                        int i14 = 922 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        int iRgb = Color.rgb(0, 0, 0) + 16777244;
                        byte b5 = $$d[7];
                        byte b6 = b5;
                        Object[] objArr19 = new Object[1];
                        a(b6, (short) (b6 | 151), b5, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(pressedStateDuration3, i14, iRgb, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 31533);
                        int i15 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 921;
                        int i16 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 27;
                        Object[] objArr20 = new Object[1];
                        a((byte) 52, (short) 151, (byte) ($$e | 6), objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollBarSize, i15, i16, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17 % 128;
                    int i18 = i17 % 2;
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
        int i19 = ((int[]) objArr[1])[0];
        int i20 = ((int[]) objArr[3])[0];
        if (i20 == i19) {
            int i21 = ((int[]) objArr[0])[0];
            int i22 = ((int[]) objArr[3])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i22}, (String[]) objArr[4]};
            int iMyUid = Process.myUid();
            int i23 = ~(1010885526 | iMyUid);
            int i24 = i21 + 634375322 + ((20776961 | i23) * (-814)) + ((i23 | (~((~iMyUid) | (-763194118))) | 268468370) * 407) + (((~(iMyUid | 763194117)) | (~((-1010885527) | iMyUid)) | 268468370) * 407);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr21[0])[0] = i26 ^ (i26 << 5);
            super.removeOnSliderTouchListener(baseOnSliderTouchListener);
            return;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = (String[]) objArr[4];
        if (strArr != null) {
            int i27 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 69;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i27 % 128;
            if (i27 % 2 == 0) {
                int i28 = 2 / 5;
            }
            while (i2 < strArr.length) {
                int i29 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i29 % 128;
                if (i29 % 2 == 0) {
                    arrayList.add(strArr[i2]);
                    i2 += 70;
                } else {
                    arrayList.add(strArr[i2]);
                    i2++;
                }
            }
        }
        throw new RuntimeException(String.valueOf(i20));
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public /* bridge */ /* synthetic */ void setEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        super.setEnabled(z);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setFocusedThumbIndex(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        super.setFocusedThumbIndex(i);
        if (i4 != 0) {
            int i5 = 81 / 0;
        }
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setHaloRadius(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        super.setHaloRadius(i);
        if (i4 == 0) {
            int i5 = 28 / 0;
        }
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setHaloRadiusResource(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        super.setHaloRadiusResource(i);
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setHaloTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        super.setHaloTintList(colorStateList);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setLabelBehavior(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        super.setLabelBehavior(i);
        if (i4 == 0) {
            int i5 = 62 / 0;
        }
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 75 / 0;
        }
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setLabelFormatter(LabelFormatter labelFormatter) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
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
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        super.setStepSize(f);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbElevation(float f) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        super.setThumbElevation(f);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbElevationResource(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        super.setThumbElevationResource(i);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbHeight(int i) throws Throwable {
        Object[] objArr;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
            int iMyTid = (Process.myTid() >> 22) + 876;
            int iCombineMeasuredStates = 10 - View.combineMeasuredStates(0, 0);
            byte[] bArr = $$d;
            Object[] objArr2 = new Object[1];
            a((byte) (-bArr[3]), bArr[9], bArr[153], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iMyTid, iCombineMeasuredStates, -1199417970, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        f((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), ViewConfiguration.getScrollBarSize() >> 8, (-16777194) - Color.rgb(0, 0, 0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        f((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 22 - TextUtils.getTrimmedLength(""), 15 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char gidForName = (char) ((-1) - Process.getGidForName(""));
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 877;
            int i5 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 9;
            byte[] bArr2 = $$d;
            Object[] objArr5 = new Object[1];
            a((byte) 52, bArr2[7], bArr2[33], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(gidForName, iIndexOf, i5, 254769921, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                int maxKeyCode = 876 - (KeyEvent.getMaxKeyCode() >> 16);
                int trimmedLength = 10 - TextUtils.getTrimmedLength("");
                byte[] bArr3 = $$d;
                Object[] objArr6 = new Object[1];
                a(bArr3[44], bArr3[7], bArr3[153], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(threadPriority, maxKeyCode, trimmedLength, 1324201839, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int i6 = ~System.identityHashCode(this);
            int i7 = (((-942559356) + (((~((-111735438) | i6)) | 152045666) * (-828))) + ((i6 | (-111735438)) * (-828))) - 511140850;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
        } else {
            int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
            int i11 = i10 % 2;
            try {
                Object[] objArr8 = {Integer.valueOf(i), 1461197826};
                byte[] bArr4 = $$j;
                Object[] objArr9 = new Object[1];
                g((byte) (bArr4[72] + 1), bArr4[137], bArr4[2], objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[0]);
                Object[] objArr10 = new Object[1];
                g((byte) 60, bArr4[60], bArr4[137], objArr10);
                objArr = (Object[]) cls2.getMethod((String) objArr10[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char defaultSize = (char) View.getDefaultSize(0, 0);
                    int i12 = 877 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    int mode = 10 - View.MeasureSpec.getMode(0);
                    byte[] bArr5 = $$d;
                    Object[] objArr11 = new Object[1];
                    a(bArr5[44], bArr5[7], bArr5[153], objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(defaultSize, i12, mode, 1324201839, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr12 = new Object[1];
                    f((char) (TextUtils.lastIndexOf("", '0', 0) + 1), ViewConfiguration.getTapTimeout() >> 16, 22 - TextUtils.getTrimmedLength(""), objArr12);
                    Class<?> cls3 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    f((char) ('0' - AndroidCharacter.getMirror('0')), 22 - TextUtils.indexOf("", "", 0), TextUtils.indexOf((CharSequence) "", '0') + 16, objArr13);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char mirror = (char) (AndroidCharacter.getMirror('0') - '0');
                        int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 876;
                        int longPressTimeout = 10 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        byte[] bArr6 = $$d;
                        Object[] objArr14 = new Object[1];
                        a((byte) 52, bArr6[7], bArr6[33], objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(mirror, iIndexOf2, longPressTimeout, 254769921, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int offsetAfter = 876 - TextUtils.getOffsetAfter("", 0);
                        int modifierMetaStateMask = 9 - ((byte) KeyEvent.getModifierMetaStateMask());
                        byte[] bArr7 = $$d;
                        Object[] objArr15 = new Object[1];
                        a((byte) (-bArr7[3]), bArr7[9], bArr7[153], objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(minimumFlingVelocity, offsetAfter, modifierMetaStateMask, -1199417970, false, (String) objArr15[0], null);
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
        int i13 = ((int[]) objArr[2])[0];
        int i14 = ((int[]) objArr[0])[0];
        if (i14 == i13) {
            int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15 % 128;
            int i16 = i15 % 2;
            int i17 = ((int[]) objArr[1])[0];
            int i18 = ((int[]) objArr[0])[0];
            int i19 = ((int[]) objArr[2])[0];
            new int[1][0] = i18;
            new int[1][0] = i19;
            int i20 = (-631978700) + ((~(i | 774194988)) * 216);
            int i21 = ~i;
            int i22 = i17 + i20 + ((801077119 | i21) * (-216)) + (((~(774194988 | i21)) | (-733884760)) * 216);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            int[] iArr = {i24 ^ (i24 << 5)};
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr != null) {
                int i25 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 119;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i25 % 128;
                int i26 = 2;
                int i27 = i25 % 2;
                int i28 = 0;
                while (i28 < strArr.length) {
                    int i29 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 55;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i29 % 128;
                    int i30 = i29 % i26;
                    arrayList.add(strArr[i28]);
                    i28++;
                    i26 = 2;
                }
            }
            int[] iArr2 = new int[i14];
            int i31 = i14 - 1;
            iArr2[i31] = 1;
            Toast.makeText((Context) null, iArr2[((i14 * i31) % 2) - 1], 1).show();
            int i32 = ((int[]) objArr[1])[0];
            Object[] objArr16 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i33 = ~iElapsedRealtime;
            int i34 = (-868597916) + (((~((-857542412) | i33)) | 50857481 | (~(817232182 | i33)) | (~((-10547253) | iElapsedRealtime))) * (-84));
            int i35 = (~(iElapsedRealtime | 817232182)) | 857542411;
            int i36 = ~(i33 | (-817232183));
            int i37 = i32 + i34 + ((i35 | i36) * (-84)) + ((10547252 | i36) * 84);
            int i38 = (i37 << 13) ^ i37;
            int i39 = i38 ^ (i38 >>> 17);
            ((int[]) objArr16[1])[0] = i39 ^ (i39 << 5);
        }
        super.setThumbHeight(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbHeightResource(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        super.setThumbHeightResource(i);
        if (i4 == 0) {
            int i5 = 86 / 0;
        }
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbRadius(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        super.setThumbRadius(i);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbRadiusResource(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        super.setThumbRadiusResource(i);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 59 / 0;
        }
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbStrokeColor(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        super.setThumbStrokeColor(colorStateList);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbStrokeColorResource(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        super.setThumbStrokeColorResource(i);
        if (i4 == 0) {
            throw null;
        }
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbStrokeWidth(float f) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        super.setThumbStrokeWidth(f);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbStrokeWidthResource(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        super.setThumbStrokeWidthResource(i);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        super.setThumbTintList(colorStateList);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0217  */
    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbTrackGapSize(int i) throws Throwable {
        Object[] objArr;
        int i2 = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char packedPositionChild = (char) (37566 - ExpandableListView.getPackedPositionChild(0L));
            int offsetAfter = TextUtils.getOffsetAfter("", 0) + 625;
            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 14;
            Object[] objArr2 = new Object[1];
            a((byte) 52, (short) 151, (byte) ($$e | 6), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionChild, offsetAfter, packedPositionGroup, -477065106, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        f((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), Color.alpha(0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 22, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        f((char) Color.green(0), 23 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), AndroidCharacter.getMirror('0') - '!', objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 37567);
            int iIndexOf = 625 - TextUtils.indexOf("", "");
            int i3 = 14 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            byte b = $$d[7];
            byte b2 = b;
            byte b3 = b;
            Object[] objArr5 = new Object[1];
            a(b2, (short) (b2 | 62), b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cNormalizeMetaState, iIndexOf, i3, -976899241, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char packedPositionGroup2 = (char) (ExpandableListView.getPackedPositionGroup(0L) + 37567);
                int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 625;
                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 14;
                byte b4 = $$d[7];
                byte b5 = b4;
                Object[] objArr6 = new Object[1];
                a(b5, (short) (b5 | 151), b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionGroup2, windowTouchSlop, threadPriority, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i6 = ((int[]) objArr7[2])[0];
            int i7 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i7};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i8 = ~startUptimeMillis;
            int i9 = (-443387352) + (((~(1010748354 | i8)) | 4273156) * 184) + ((startUptimeMillis | 202031744) * (-184)) + ((~((-812989767) | i8)) * 184) + 450767033;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[1])[0] = i11 ^ (i11 << 5);
            objArr = new Object[]{iArr, new int[1], new int[]{i6}, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            f((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 36, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 25, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            f((char) Drawable.resolveOpacity(0, 0), 63 - View.combineMeasuredStates(0, 0), 17 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 37;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
                    int i13 = i12 % 2;
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
            f((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), Color.argb(0, 0, 0, 0) + 113, 64 - TextUtils.getOffsetAfter("", 0), objArr10);
            String str = (String) objArr10[0];
            Object[] objArr11 = new Object[1];
            f((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), KeyEvent.getDeadChar(0, 0) + 177, 65 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr11);
            try {
                Object[] objArr12 = {applicationContext, new String[]{str, (String) objArr11[0]}, Integer.valueOf(i), 17, 450767033};
                byte[] bArr = $$j;
                byte b6 = bArr[72];
                byte b7 = bArr[137];
                Object[] objArr13 = new Object[1];
                g(b6, b7, b7, objArr13);
                Class<?> cls3 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                g(bArr[66], bArr[58], (byte) (-bArr[103]), objArr14);
                Object[] objArr15 = (Object[]) cls3.getMethod((String) objArr14[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                int i14 = ((int[]) objArr15[0])[0];
                int i15 = ((int[]) objArr15[2])[0];
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 37567);
                        int i16 = 625 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int capsMode = 14 - TextUtils.getCapsMode("", 0, 0);
                        byte b8 = $$d[7];
                        byte b9 = b8;
                        Object[] objArr16 = new Object[1];
                        a(b9, (short) (b9 | 151), b8, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maximumFlingVelocity, i16, capsMode, -973632554, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        f((char) Color.red(0), ViewConfiguration.getScrollBarSize() >> 8, TextUtils.lastIndexOf("", '0') + 23, objArr17);
                        Class<?> cls4 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        f((char) Color.alpha(0), 22 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15, objArr18);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cBlue = (char) (Color.blue(0) + 37567);
                            int i17 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 625;
                            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 14;
                            byte b10 = $$d[7];
                            byte b11 = b10;
                            Object[] objArr19 = new Object[1];
                            a(b11, (short) (b11 | 62), b10, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cBlue, i17, absoluteGravity, -976899241, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 37567);
                            int iGreen = 625 - Color.green(0);
                            int iBlue = 14 - Color.blue(0);
                            Object[] objArr20 = new Object[1];
                            a((byte) 52, (short) 151, (byte) ($$e | 6), objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, iGreen, iBlue, -477065106, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i18 = ((int[]) objArr[0])[0];
        int i19 = ((int[]) objArr[2])[0];
        if (i19 != i18) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[3];
            if (strArr2 != null) {
                for (String str2 : strArr2) {
                    arrayList.add(str2);
                }
            }
            throw new RuntimeException(String.valueOf(i19));
        }
        int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20 % 128;
        int i21 = i20 % 2;
        int i22 = ((int[]) objArr[1])[0];
        int i23 = ((int[]) objArr[2])[0];
        int i24 = ((int[]) objArr[0])[0];
        String[] strArr3 = (String[]) objArr[3];
        int i25 = (~System.identityHashCode(this)) | 652594645;
        int i26 = i22 + 900104984 + (i25 * 495) + (((~i25) | 79956241) * 495);
        int i27 = (i26 << 13) ^ i26;
        int i28 = i27 ^ (i27 >>> 17);
        ((int[]) objArr[1])[0] = i28 ^ (i28 << 5);
        Object[] objArr21 = {new int[]{i24}, new int[1], new int[]{i23}, strArr3};
        int i29 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i29 % 128;
        int i30 = i29 % 2;
        super.setThumbTrackGapSize(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbWidth(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        super.setThumbWidth(i);
        if (i4 == 0) {
            throw null;
        }
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbWidthResource(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        super.setThumbWidthResource(i);
        if (i4 == 0) {
            throw null;
        }
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickActiveRadius(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        super.setTickActiveRadius(i);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickActiveTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.setTickActiveTintList(colorStateList);
        if (i3 == 0) {
            throw null;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickInactiveRadius(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        super.setTickInactiveRadius(i);
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickInactiveTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        super.setTickInactiveTintList(colorStateList);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        super.setTickTintList(colorStateList);
        if (i3 == 0) {
            throw null;
        }
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickVisible(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        super.setTickVisible(z);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackActiveTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        super.setTrackActiveTintList(colorStateList);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackHeight(int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        super.setTrackHeight(i);
        if (i4 == 0) {
            int i5 = 88 / 0;
        }
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackInactiveTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        super.setTrackInactiveTintList(colorStateList);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackInsideCornerSize(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        super.setTrackInsideCornerSize(i);
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackStopIndicatorSize(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        super.setTrackStopIndicatorSize(i);
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        super.setTrackTintList(colorStateList);
        if (i3 != 0) {
            throw null;
        }
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setValueFrom(float f) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        super.setValueFrom(f);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setValueTo(float f) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        super.setValueTo(f);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    public RangeSlider(Context context) {
        this(context, null);
    }

    public RangeSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.sliderStyle);
    }

    public RangeSlider(Context context, AttributeSet attributeSet, int i) throws Throwable {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R.styleable.RangeSlider, i, DEF_STYLE_RES, new int[0]);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.RangeSlider_values)) {
            setValues(convertToFloat(typedArrayObtainStyledAttributes.getResources().obtainTypedArray(typedArrayObtainStyledAttributes.getResourceId(R.styleable.RangeSlider_values, 0))));
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
        }
        this.minSeparation = typedArrayObtainStyledAttributes.getDimension(R.styleable.RangeSlider_minSeparation, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setValues(Float... fArr) throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        super.setValues(fArr);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setValues(List<Float> list) throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        super.setValues(list);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 37 / 0;
        }
    }

    @Override // com.google.android.material.slider.BaseSlider
    public List<Float> getValues() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        List<Float> values = super.getValues();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            return values;
        }
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setCustomThumbDrawable(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        super.setCustomThumbDrawable(i);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 77 / 0;
        }
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setCustomThumbDrawable(Drawable drawable) throws Throwable {
        int iIntValue;
        int i;
        long j;
        int i2 = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 46400), 39 - TextUtils.indexOf((CharSequence) "", '0', 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 18, -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
        }
        int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object[] objArr = new Object[1];
        f((char) TextUtils.indexOf("", ""), ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getTapTimeout() >> 16) + 22, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        f((char) (ViewConfiguration.getPressedStateDuration() >> 16), 22 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), AndroidCharacter.getMirror('0') - '!', objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j2 = -783;
        long j3 = -1;
        long j4 = j3 ^ 1966781058436534007L;
        long jIdentityHashCode = ((long) System.identityHashCode(this)) ^ j3;
        long j5 = (((long) 784) * 1966781058436534007L) + (((long) (-782)) * 130476116305424980L) + ((j3 ^ 130476116305424980L) * j2) + (j2 * (((j4 | jIdentityHashCode) | 130476116305424980L) ^ j3)) + (((long) 783) * (j4 | ((jIdentityHashCode | 130476116305424980L) ^ j3)));
        int i4 = 0;
        try {
            while (i4 != 10) {
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
                if (i5 % 2 == 0) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37837 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 58, 18 - ExpandableListView.getPackedPositionGroup(0L), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                    }
                    i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
                } else {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 37836), 59 - View.resolveSizeAndState(0, 0, 0), 17 - TextUtils.indexOf((CharSequence) "", '0'), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                    }
                    i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
                }
                int i6 = 0;
                while (true) {
                    int i7 = 0;
                    while (i7 != 8) {
                        i = (((((int) (jLongValue >> i7)) & 255) + (i << 6)) + (i << 16)) - i;
                        i7++;
                        j5 = j5;
                    }
                    j = j5;
                    if (i6 != 0) {
                        break;
                    }
                    i6++;
                    jLongValue = j;
                    j5 = jLongValue;
                }
                if (i == i3) {
                    super.setCustomThumbDrawable(drawable);
                    return;
                }
                int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
                if (i8 % 2 == 0) {
                    jLongValue |= 1024;
                    i4 += 17;
                } else {
                    jLongValue -= 1024;
                    i4++;
                }
                j5 = j;
            }
            Object[] objArr3 = {-18998375};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46038 - ((Process.getThreadPriority(0) + 20) >> 6)), TextUtils.getCapsMode("", 0, 0) + 1134, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr4 = {Integer.valueOf(iIntValue), 0, -432394135, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr3), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                char cIndexOf = (char) TextUtils.indexOf("", "");
                int scrollDefaultDelay = 1031 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 15;
                byte b = $$d[7];
                byte b2 = b;
                Object[] objArr5 = new Object[1];
                a(b2, (short) (b2 | 62), b, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, scrollDefaultDelay, iResolveOpacity, 1298546779, false, (String) objArr5[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Color.blue(0) + 45993), 1117 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 17 - (ViewConfiguration.getEdgeSlop() >> 16)), Boolean.TYPE});
            }
            Object[] objArr6 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr4);
            int i9 = ((int[]) objArr6[1])[0];
            int i10 = ((int[]) objArr6[3])[0];
            if (i10 != i9) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr6[0];
                if (strArr != null) {
                    for (String str : strArr) {
                        int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 89;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
                        int i12 = i11 % 2;
                        arrayList.add(str);
                    }
                }
                int[] iArr = new int[i10];
                int i13 = i10 - 1;
                iArr[i13] = 1;
                Toast.makeText((Context) null, iArr[((i10 * i13) % 2) - 1], 1).show();
            }
            super.setCustomThumbDrawable(drawable);
            return;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
        Object[] objArr7 = new Object[1];
        f((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), ExpandableListView.getPackedPositionChild(0L) + 82, 17 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr7);
        Class<?> cls2 = Class.forName((String) objArr7[0]);
        Object[] objArr8 = new Object[1];
        f((char) View.resolveSize(0, 0), 97 - Gravity.getAbsoluteGravity(0, 0), Color.alpha(0) + 16, objArr8);
        iIntValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setCustomThumbDrawablesForValues(int... iArr) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        super.setCustomThumbDrawablesForValues(iArr);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setCustomThumbDrawablesForValues(Drawable... drawableArr) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        super.setCustomThumbDrawablesForValues(drawableArr);
        if (i3 == 0) {
            throw null;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static List<Float> convertToFloat(TypedArray typedArray) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        while (i4 < typedArray.length()) {
            arrayList.add(Float.valueOf(typedArray.getFloat(i4, -1.0f)));
            i4++;
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
        }
        return arrayList;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public float getMinSeparation() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 123;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        float f = this.minSeparation;
        int i5 = i3 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 42 / 0;
        }
        return f;
    }

    public void setMinSeparation(float f) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            this.minSeparation = f;
            this.separationUnit = 0;
        } else {
            this.minSeparation = f;
            this.separationUnit = 0;
        }
        setSeparationUnit(0);
    }

    public void setMinSeparationValue(float f) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            this.minSeparation = f;
            this.separationUnit = 0;
        } else {
            this.minSeparation = f;
            this.separationUnit = 1;
        }
        setSeparationUnit(1);
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public Parcelable onSaveInstanceState() {
        int i = 2 % 2;
        RangeSliderState rangeSliderState = new RangeSliderState(super.onSaveInstanceState());
        rangeSliderState.minSeparation = this.minSeparation;
        rangeSliderState.separationUnit = this.separationUnit;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return rangeSliderState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        RangeSliderState rangeSliderState = (RangeSliderState) parcelable;
        super.onRestoreInstanceState(rangeSliderState.getSuperState());
        this.minSeparation = rangeSliderState.minSeparation;
        int i4 = rangeSliderState.separationUnit;
        this.separationUnit = i4;
        setSeparationUnit(i4);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$n(int r7, short r8, byte r9) {
        /*
            int r8 = r8 * 2
            int r8 = r8 + 1
            int r7 = r7 * 4
            int r7 = 4 - r7
            byte[] r0 = com.google.android.material.slider.RangeSlider.$$l
            int r9 = r9 * 3
            int r9 = r9 + 109
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r9 = r7
            r3 = r8
            r4 = r2
            goto L2b
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r7 = -r7
            int r7 = r7 + r3
            int r9 = r9 + 1
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.RangeSlider.$$n(int, short, byte):java.lang.String");
    }
}
