package com.google.android.material.chip;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.google.android.material.R;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.internal.MaterialCheckable;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TextAppearanceFontCallback;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import defpackage.initSession;
import defpackage.setVideoStabilizationMode;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes3.dex */
public class Chip extends AppCompatCheckBox implements ChipDrawable.Delegate, Shapeable, MaterialCheckable<Chip> {
    private static final String BUTTON_ACCESSIBILITY_CLASS_NAME = "android.widget.Button";
    private static final int[] CHECKABLE_STATE_SET;
    private static final int CHIP_BODY_VIRTUAL_ID = 0;
    private static final int CLOSE_ICON_VIRTUAL_ID = 1;
    private static final int DEF_STYLE_RES;
    private static final Rect EMPTY_BOUNDS;
    private static final String GENERIC_VIEW_ACCESSIBILITY_CLASS_NAME = "android.view.View";
    private static final int MIN_TOUCH_TARGET_DP = 48;
    private static final String NAMESPACE_ANDROID = "http://schemas.android.com/apk/res/android";
    private static final String RADIO_BUTTON_ACCESSIBILITY_CLASS_NAME = "android.widget.RadioButton";
    private static final int[] SELECTED_STATE;
    private static final String TAG = "Chip";
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private CharSequence accessibilityClassName;
    private ChipDrawable chipDrawable;
    private boolean closeIconFocused;
    private boolean closeIconHovered;
    private boolean closeIconPressed;
    private boolean deferredCheckedValue;
    private boolean ensureMinTouchTargetSize;
    private final TextAppearanceFontCallback fontCallback;
    private InsetDrawable insetBackgroundDrawable;
    private int lastLayoutDirection;
    private int minTouchTargetSize;
    private CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
    private MaterialCheckable.OnCheckedChangeListener<Chip> onCheckedChangeListenerInternal;
    private View.OnClickListener onCloseIconClickListener;
    private final Rect rect;
    private final RectF rectF;
    private RippleDrawable ripple;
    private final ChipTouchHelper touchHelper;
    private boolean touchHelperEnabled;
    private static final byte[] $$c = {27, 65, -33, 120};
    private static final int $$f = 152;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {90, 46, 113, 8, -15, -1, 60, -55, -17, 3, -12, -4, 6, -13, 68, -69, -5, 10, -17, 11, -12, -9, 16, -22, 8, -9, -2, Base64.padSymbol, -69, -5, 0, 5, -14, 14, -15, 60, -63, -1, -15, 67, -68, 0, 5, -3, 0, -27, 3, 11, -1, -21, 0, 6, -14, -8, 72, -36, -32, 5, 29, -32, -27, 35, -21, -1, -21, 0, 6, -14, -8, 53, -37, -20, 8, -16, 10, -14, -8, 82, -82, 0, 8, -1, -9, 5, -14, 69, -3, -72, -8, -1, 0, -8, 6, -2, Base64.padSymbol, -72, -8, 1, 2, -1, -20, 77, -67, -4, -4, 2, -23, 6, -11, 77, -16, -36, 9, -14, 8, -9, -2, 27, -20, -27, 9, 5, -12, -9, 43, -47, 14, -9, -9, 5, -12, -9, -2, 0, 8, -1, -9, 5, -14, 0, -8, -1, 0, -8, 6, -2, -21, 10, 1, -21, 39, -37, 8, -4, -10, 5, -4, -4, 2, -23, 6, -11, 63, -15, -1, 60, -60, -11, -3, 5, -8, 4, 52, -54, -16, 7, -17, 0, 3, 2, 51, -65, 0, 4, -19, 14, -20, 6, 1, -17, 66, -69, 1, 8, -5, -5, -17, 66, -62, -8, -9, 12, -16, 1, 10, -14, 59, -79, -3, 21, -26, 15, -36, 9, -14, 8, -9, -2, 27, -20, -27, 9, 5, -12, -9, 43, -47, 14, -9, -9, 5, -12, -9, -2, 0, 8, -1, -9, 5, -14, 0, -8, -1, 0, -8, 6, -2, -21, 10, 1, -21, 39, -37, 8, -4, -10, 5, -4, -4, 2, -23, 6, -11, 64};
    private static final int $$e = 175;
    private static final byte[] $$a = {33, -59, 107, -108, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -29, 31, -48, -17, 4, -24, 1, -6, -13, -13, -29, 38, -50, -16, -1, -12, -24, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 65;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int b = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r0 = 53 - r8
            int r6 = 100 - r6
            int r7 = r7 + 4
            byte[] r1 = com.google.android.material.chip.Chip.$$a
            byte[] r0 = new byte[r0]
            int r8 = 52 - r8
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r7 = r7 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2b:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + (-11)
            r7 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.a(int, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.google.android.material.chip.Chip.$$d
            int r1 = r5 + 50
            int r6 = 211 - r6
            int r7 = r7 * 15
            int r7 = r7 + 84
            byte[] r1 = new byte[r1]
            int r5 = r5 + 49
            r2 = -1
            if (r0 != 0) goto L14
            r3 = r2
            r2 = r6
            goto L2f
        L14:
            r4 = r7
            r7 = r6
            r6 = r4
        L17:
            int r2 = r2 + 1
            byte r3 = (byte) r6
            int r7 = r7 + 1
            r1[r2] = r3
            if (r2 != r5) goto L29
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            r8[r6] = r5
            return
        L29:
            r3 = r0[r7]
            r4 = r2
            r2 = r7
            r7 = r3
            r3 = r4
        L2f:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + (-3)
            r7 = r2
            r2 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.d(byte, short, short, java.lang.Object[]):void");
    }

    static /* synthetic */ ChipDrawable access$000(Chip chip) {
        int i = 2 % 2;
        int i2 = b + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        ChipDrawable chipDrawable = chip.chipDrawable;
        if (i3 != 0) {
            int i4 = 74 / 0;
        }
        return chipDrawable;
    }

    static /* synthetic */ boolean access$100(Chip chip) {
        int i = 2 % 2;
        int i2 = b + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        boolean zHasCloseIcon = chip.hasCloseIcon();
        int i4 = b + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return zHasCloseIcon;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ RectF access$200(Chip chip) {
        int i = 2 % 2;
        int i2 = b + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        RectF closeIconTouchBounds = chip.getCloseIconTouchBounds();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
        b = i4 % 128;
        int i5 = i4 % 2;
        return closeIconTouchBounds;
    }

    static /* synthetic */ View.OnClickListener access$300(Chip chip) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
        b = i2 % 128;
        int i3 = i2 % 2;
        View.OnClickListener onClickListener = chip.onCloseIconClickListener;
        if (i3 != 0) {
            return onClickListener;
        }
        throw null;
    }

    static /* synthetic */ boolean access$402(Chip chip, boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        chip.closeIconFocused = z;
        int i5 = i3 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    static /* synthetic */ Rect access$500(Chip chip) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 43;
        b = i2 % 128;
        int i3 = i2 % 2;
        Rect closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
        b = i4 % 128;
        int i5 = i4 % 2;
        return closeIconTouchBoundsInt;
    }

    static /* synthetic */ Rect access$600() {
        int i = 2 % 2;
        int i2 = b + 71;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        Rect rect = EMPTY_BOUNDS;
        int i5 = i3 + 87;
        b = i5 % 128;
        int i6 = i5 % 2;
        return rect;
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        DEF_STYLE_RES = R.style.Widget_MaterialComponents_Chip_Action;
        EMPTY_BOUNDS = new Rect();
        SELECTED_STATE = new int[]{android.R.attr.state_selected};
        CHECKABLE_STATE_SET = new int[]{android.R.attr.state_checkable};
        int i = TuitionPaymentFragmentbindingInflater1 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
        int i2 = i % 2;
    }

    public Chip(Context context) {
        this(context, null);
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        this.rect = new Rect();
        this.rectF = new RectF();
        this.fontCallback = new TextAppearanceFontCallback() { // from class: com.google.android.material.chip.Chip.1
            @Override // com.google.android.material.resources.TextAppearanceFontCallback
            public void onFontRetrievalFailed(int i3) {
            }

            @Override // com.google.android.material.resources.TextAppearanceFontCallback
            public void onFontRetrieved(Typeface typeface, boolean z) {
                Chip chip = Chip.this;
                chip.setText(Chip.access$000(chip).shouldDrawText() ? Chip.access$000(Chip.this).getText() : Chip.this.getText());
                Chip.this.requestLayout();
                Chip.this.invalidate();
            }
        };
        Context context2 = getContext();
        validateAttributes(attributeSet);
        ChipDrawable chipDrawableCreateFromAttributes = ChipDrawable.createFromAttributes(context2, attributeSet, i, i2);
        initMinTouchTarget(context2, attributeSet, i);
        setChipDrawable(chipDrawableCreateFromAttributes);
        chipDrawableCreateFromAttributes.setElevation(ViewCompat.getElevation(this));
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.Chip, i, i2, new int[0]);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(R.styleable.Chip_shapeAppearance);
        typedArrayObtainStyledAttributes.recycle();
        this.touchHelper = new ChipTouchHelper(this);
        updateAccessibilityDelegate();
        if (!zHasValue) {
            initOutlineProvider();
        }
        setChecked(this.deferredCheckedValue);
        setText(chipDrawableCreateFromAttributes.getText());
        setEllipsize(chipDrawableCreateFromAttributes.getEllipsize());
        updateTextPaintDrawState();
        if (!this.chipDrawable.shouldDrawText()) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
            b = i3 % 128;
            if (i3 % 2 == 0) {
                setLines(0);
                setHorizontallyScrolling(true);
            } else {
                setLines(1);
                setHorizontallyScrolling(true);
            }
        }
        setGravity(8388627);
        updatePaddingInternal();
        if (shouldEnsureMinTouchTargetSize()) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 69;
            b = i4 % 128;
            if (i4 % 2 == 0) {
                setMinHeight(this.minTouchTargetSize);
                int i5 = 50 / 0;
            } else {
                setMinHeight(this.minTouchTargetSize);
            }
            int i6 = 2 % 2;
        }
        this.lastLayoutDirection = ViewCompat.getLayoutDirection(this);
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.google.android.material.chip.Chip$$ExternalSyntheticLambda0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f$0.m7825lambda$new$0$comgoogleandroidmaterialchipChip(compoundButton, z);
            }
        });
    }

    private static void c(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (cArr != null) {
            int i8 = $11 + 123;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i10 = 0;
            while (i10 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr[i10]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) i3;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1270, 17 - TextUtils.indexOf((CharSequence) "", '0', i3), 407021364, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i10] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i10++;
                    i3 = 0;
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
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i4, cArr3, 0, i5);
        if (bArr != null) {
            char[] cArr4 = new char[i5];
            setvideostabilizationmode.b = 0;
            char c = 0;
            while (setvideostabilizationmode.b < i5) {
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i11 = $10 + 109;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    int i13 = setvideostabilizationmode.b;
                    Object[] objArr3 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), View.combineMeasuredStates(0, 0) + 3225, 13 - ((Process.getThreadPriority(0) + 20) >> 6), 2133916302, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                } else {
                    int i14 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 29944), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1754, 23 - ((Process.getThreadPriority(0) + 20) >> 6), 387247676, false, $$g(b6, b7, (byte) (b7 + 2)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                }
                c = cArr4[setvideostabilizationmode.b];
                Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ExpandableListView.getPackedPositionChild(0L) + 41242), 1705 - Color.alpha(0), ((byte) KeyEvent.getModifierMetaStateMask()) + 22, -1434471773, false, $$g(b8, b9, (byte) (b9 | 6)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            int i15 = $11 + 23;
            $10 = i15 % 128;
            if (i15 % 2 != 0) {
                char[] cArr5 = new char[i5];
                i = 0;
                System.arraycopy(cArr3, 1, cArr5, 0, i5);
                System.arraycopy(cArr5, 1, cArr3, i5 / i7, i7);
                System.arraycopy(cArr5, i7, cArr3, 0, i5 >>> i7);
            } else {
                i = 0;
                char[] cArr6 = new char[i5];
                System.arraycopy(cArr3, 0, cArr6, 0, i5);
                int i16 = i5 - i7;
                System.arraycopy(cArr6, 0, cArr3, i16, i7);
                System.arraycopy(cArr6, i7, cArr3, 0, i16);
            }
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr7 = new char[i5];
            loop2: while (true) {
                setvideostabilizationmode.b = i;
                while (true) {
                    if (setvideostabilizationmode.b >= i5) {
                        break loop2;
                    }
                    int i17 = $11 + 29;
                    $10 = i17 % 128;
                    if (i17 % 2 != 0) {
                        cArr7[setvideostabilizationmode.b] = cArr3[(i5 % setvideostabilizationmode.b) - 1];
                        setvideostabilizationmode.b = setvideostabilizationmode.b;
                    } else {
                        cArr7[setvideostabilizationmode.b] = cArr3[(i5 - setvideostabilizationmode.b) - 1];
                        i = setvideostabilizationmode.b + 1;
                    }
                }
            }
            cArr3 = cArr7;
        }
        if (i6 > 0) {
            int i18 = $11 + 1;
            $10 = i18 % 128;
            if (i18 % 2 != 0) {
                setvideostabilizationmode.b = 1;
            } else {
                setvideostabilizationmode.b = 0;
            }
            while (setvideostabilizationmode.b < i5) {
                int i19 = $10 + 15;
                $11 = i19 % 128;
                if (i19 % 2 == 0) {
                    cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] << iArr[2]);
                    int i20 = setvideostabilizationmode.b;
                    setvideostabilizationmode.b = 0;
                } else {
                    cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                    setvideostabilizationmode.b++;
                }
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX INFO: renamed from: lambda$new$0$com-google-android-material-chip-Chip, reason: not valid java name */
    /* synthetic */ void m7825lambda$new$0$comgoogleandroidmaterialchipChip(CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 17;
        b = i3 % 128;
        int i4 = i3 % 2;
        MaterialCheckable.OnCheckedChangeListener<Chip> onCheckedChangeListener = this.onCheckedChangeListenerInternal;
        if (onCheckedChangeListener != null) {
            int i5 = i2 + 31;
            b = i5 % 128;
            int i6 = i5 % 2;
            onCheckedChangeListener.onCheckedChanged(this, z);
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
            b = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 4 / 3;
            }
        }
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener2 = this.onCheckedChangeListener;
        if (onCheckedChangeListener2 != null) {
            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
            b = i9 % 128;
            int i10 = i9 % 2;
            onCheckedChangeListener2.onCheckedChanged(compoundButton, z);
            if (i10 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i11 = b + 9;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
            int i12 = i11 % 2;
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        int i = 2 % 2;
        int i2 = b + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this, this.chipDrawable);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 63 / 0;
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        int i = 2 % 2;
        super.setElevation(f);
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            int i2 = b + 119;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            chipDrawable.setElevation(f);
            if (i3 != 0) {
                throw null;
            }
        }
        int i4 = b + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int indexOfChip;
        int i = 2 % 2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(isCheckable());
        accessibilityNodeInfo.setClickable(isClickable());
        if (!(getParent() instanceof ChipGroup)) {
            return;
        }
        ChipGroup chipGroup = (ChipGroup) getParent();
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatWrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
        if (chipGroup.isSingleLine()) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
            b = i2 % 128;
            if (i2 % 2 == 0) {
                chipGroup.getIndexOfChip(this);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            indexOfChip = chipGroup.getIndexOfChip(this);
        } else {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
            b = i3 % 128;
            int i4 = i3 % 2;
            indexOfChip = -1;
        }
        accessibilityNodeInfoCompatWrap.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(chipGroup.getRowIndex(this), 1, indexOfChip, 1, false, isChecked()));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:12:0x0029  */
    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    private void updateAccessibilityDelegate() {
        int i;
        int i2 = 2 % 2;
        int i3 = b + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 20 / 0;
            if (!(!hasCloseIcon())) {
                if (isCloseIconVisible()) {
                    i = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i5 = i + 9;
                    b = i5 % 128;
                    int i6 = i5 % 2;
                    if (this.onCloseIconClickListener != null) {
                        int i7 = i + 69;
                        b = i7 % 128;
                        int i8 = i7 % 2;
                        ViewCompat.setAccessibilityDelegate(this, this.touchHelper);
                        this.touchHelperEnabled = true;
                        return;
                    }
                }
            }
        } else if (!(!hasCloseIcon())) {
            if (isCloseIconVisible()) {
                i = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i9 = i + 9;
                b = i9 % 128;
                int i10 = i9 % 2;
                if (this.onCloseIconClickListener != null) {
                    int i11 = i + 69;
                    b = i11 % 128;
                    int i12 = i11 % 2;
                    ViewCompat.setAccessibilityDelegate(this, this.touchHelper);
                    this.touchHelperEnabled = true;
                    return;
                }
            }
        }
        ViewCompat.setAccessibilityDelegate(this, null);
        this.touchHelperEnabled = false;
    }

    private void initMinTouchTarget(Context context, AttributeSet attributeSet, int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
        b = i3 % 128;
        int i4 = i3 % 2;
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R.styleable.Chip, i, DEF_STYLE_RES, new int[0]);
        this.ensureMinTouchTargetSize = typedArrayObtainStyledAttributes.getBoolean(R.styleable.Chip_ensureMinTouchTargetSize, false);
        this.minTouchTargetSize = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(R.styleable.Chip_chipMinTouchTargetSize, (float) Math.ceil(ViewUtils.dpToPx(getContext(), 48))));
        typedArrayObtainStyledAttributes.recycle();
        int i5 = b + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
    }

    private void updatePaddingInternal() {
        int i = 2 % 2;
        if (TextUtils.isEmpty(getText())) {
            return;
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            int chipEndPadding = (int) (chipDrawable.getChipEndPadding() + this.chipDrawable.getTextEndPadding() + this.chipDrawable.calculateCloseIconWidth());
            int chipStartPadding = (int) (this.chipDrawable.getChipStartPadding() + this.chipDrawable.getTextStartPadding() + this.chipDrawable.calculateChipIconWidth());
            if (this.insetBackgroundDrawable != null) {
                Rect rect = new Rect();
                this.insetBackgroundDrawable.getPadding(rect);
                chipStartPadding += rect.left;
                chipEndPadding += rect.right;
            }
            ViewCompat.setPaddingRelative(this, chipStartPadding, getPaddingTop(), chipEndPadding, getPaddingBottom());
            int i3 = b + 21;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.chip.Chip$2, reason: invalid class name */
    public class AnonymousClass2 extends ViewOutlineProvider {
        public static int TuitionPaymentFragmentbindingInflater1;
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        AnonymousClass2() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (Chip.access$000(Chip.this) != null) {
                Chip.access$000(Chip.this).getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }

        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i2 = i % 8829557;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i + 1;
            if (i2 != 0) {
                return TuitionPaymentFragmentbindingInflater1;
            }
            int iMyTid = Process.myTid();
            TuitionPaymentFragmentbindingInflater1 = iMyTid;
            return iMyTid;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onRtlPropertiesChanged(int i) throws Throwable {
        Object[] objArr;
        int i2 = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        int i3 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char gidForName = (char) (Process.getGidForName("") + 1);
            int i4 = 877 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int iResolveSize = 10 - View.resolveSize(0, 0);
            byte b2 = (byte) (-$$a[14]);
            Object[] objArr2 = new Object[1];
            a(b2, (short) (b2 | 100), (byte) 42, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(gidForName, i4, iResolveSize, -1199417970, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new int[]{0, 22, 162, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new int[]{22, 15, 102, 0}, false, new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
            int maxKeyCode = 876 - (KeyEvent.getMaxKeyCode() >> 16);
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 10;
            byte b3 = $$a[7];
            Object[] objArr5 = new Object[1];
            a(b3, (short) (b3 | 113), (byte) 52, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cNormalizeMetaState, maxKeyCode, iCombineMeasuredStates, 254769921, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = b + 23;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 876;
                int i7 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 9;
                byte[] bArr = $$a;
                Object[] objArr6 = new Object[1];
                a((byte) (-bArr[14]), (short) ($$b | 48), (byte) (-bArr[44]), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionType, jumpTapTimeout, i7, 1324201839, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[]{i ^ (i << 5)}, new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int i8 = ~i;
            int i9 = (-87241040) + (((~((-25054798) | i8)) | 23348224) * (-1188));
            int i10 = 23348224 | (~(25054797 | i));
            int i11 = ~(65365026 | i8);
            int i12 = i9 + ((i10 | i11) * 594) + (((~(i8 | 25054797)) | (-67071600) | i11) * 594) + 516065237;
            int i13 = (i12 << 13) ^ i12;
            int i14 = i13 ^ (i13 >>> 17);
        } else {
            try {
                Object[] objArr8 = {Integer.valueOf(i), 516065237};
                byte[] bArr2 = $$d;
                byte b4 = bArr2[30];
                Object[] objArr9 = new Object[1];
                d(b4, (short) (b4 | 49), bArr2[97], objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[0]);
                byte b5 = bArr2[9];
                short s = bArr2[30];
                Object[] objArr10 = new Object[1];
                d(b5, s, (byte) s, objArr10);
                objArr = (Object[]) cls2.getMethod((String) objArr10[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                    int mode = 876 - View.MeasureSpec.getMode(0);
                    int minimumFlingVelocity = 10 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    byte[] bArr3 = $$a;
                    Object[] objArr11 = new Object[1];
                    a((byte) (-bArr3[14]), (short) ($$b | 48), (byte) (-bArr3[44]), objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(tapTimeout, mode, minimumFlingVelocity, 1324201839, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr12 = new Object[1];
                    c(new int[]{0, 22, 162, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr12);
                    Class<?> cls3 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    c(new int[]{22, 15, 102, 0}, false, new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr13);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 876;
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 10;
                        byte b6 = $$a[7];
                        Object[] objArr14 = new Object[1];
                        a(b6, (short) (b6 | 113), (byte) 52, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cCombineMeasuredStates, iKeyCodeFromString, iMakeMeasureSpec, 254769921, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 876;
                        int iIndexOf = TextUtils.indexOf("", "", 0) + 10;
                        byte b7 = (byte) (-$$a[14]);
                        Object[] objArr15 = new Object[1];
                        a(b7, (short) (b7 | 100), (byte) 42, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(fadingEdgeLength, pressedStateDuration, iIndexOf, -1199417970, false, (String) objArr15[0], null);
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
        if (((int[]) objArr[0])[0] != ((int[]) objArr[2])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr == null) {
                throw null;
            }
            while (i3 < strArr.length) {
                int i15 = b + 121;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15 % 128;
                if (i15 % 2 != 0) {
                    arrayList.add(strArr[i3]);
                    i3 += 64;
                } else {
                    arrayList.add(strArr[i3]);
                    i3++;
                }
            }
            throw null;
        }
        int i16 = ((int[]) objArr[1])[0];
        Object[] objArr16 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int i17 = (int) Runtime.getRuntime().totalMemory();
        int i18 = i16 + ((((~((-709411667) | i17)) | 574652752) * (-283)) - 541718204) + ((~(i17 | (-134758915))) * 283);
        int i19 = (i18 << 13) ^ i18;
        int i20 = i19 ^ (i19 >>> 17);
        ((int[]) objArr16[1])[0] = i20 ^ (i20 << 5);
        super.onRtlPropertiesChanged(i);
        if (this.lastLayoutDirection != i) {
            int i21 = b + 77;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i21 % 128;
            int i22 = i21 % 2;
            this.lastLayoutDirection = i;
            updatePaddingInternal();
        }
        int i23 = b + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i23 % 128;
        if (i23 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private void validateAttributes(AttributeSet attributeSet) {
        int i = 2 % 2;
        if (attributeSet != null) {
            attributeSet.getAttributeValue(NAMESPACE_ANDROID, "background");
            if (attributeSet.getAttributeValue(NAMESPACE_ANDROID, "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue(NAMESPACE_ANDROID, "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue(NAMESPACE_ANDROID, "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue(NAMESPACE_ANDROID, "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            int i2 = b + 67;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 == 0 ? attributeSet.getAttributeBooleanValue(NAMESPACE_ANDROID, "singleLine", true) : attributeSet.getAttributeBooleanValue(NAMESPACE_ANDROID, "singleLine", true)) {
                if (attributeSet.getAttributeIntValue(NAMESPACE_ANDROID, "lines", 1) == 1 && attributeSet.getAttributeIntValue(NAMESPACE_ANDROID, "minLines", 1) == 1 && attributeSet.getAttributeIntValue(NAMESPACE_ANDROID, "maxLines", 1) == 1) {
                    int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
                    b = i3 % 128;
                    int i4 = i3 % 2;
                    attributeSet.getAttributeIntValue(NAMESPACE_ANDROID, "gravity", 8388627);
                    return;
                }
            }
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
    }

    private void initOutlineProvider() {
        int i = 2 % 2;
        setOutlineProvider(new AnonymousClass2());
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 69;
        b = i2 % 128;
        int i3 = i2 % 2;
    }

    public Drawable getChipDrawable() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
        b = i2 % 128;
        int i3 = i2 % 2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (i3 == 0) {
            int i4 = 50 / 0;
        }
        return chipDrawable;
    }

    public void setChipDrawable(ChipDrawable chipDrawable) {
        ChipDrawable chipDrawable2;
        int i = 2 % 2;
        int i2 = b + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            chipDrawable2 = this.chipDrawable;
            int i3 = 10 / 0;
            if (chipDrawable2 == chipDrawable) {
                return;
            }
        } else {
            chipDrawable2 = this.chipDrawable;
            if (chipDrawable2 == chipDrawable) {
                return;
            }
        }
        unapplyChipDrawable(chipDrawable2);
        this.chipDrawable = chipDrawable;
        chipDrawable.setShouldDrawText(false);
        applyChipDrawable(this.chipDrawable);
        ensureAccessibleTouchTarget(this.minTouchTargetSize);
        int i4 = b + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    private void updateBackgroundDrawable() {
        int i = 2 % 2;
        if (!RippleUtils.USE_FRAMEWORK_RIPPLE) {
            this.chipDrawable.setUseCompatRipple(true);
            ViewCompat.setBackground(this, getBackgroundDrawable());
            updatePaddingInternal();
            ensureChipDrawableHasCallback();
            return;
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            updateFrameworkRippleBackground();
            int i3 = 6 / 0;
        } else {
            updateFrameworkRippleBackground();
        }
        int i4 = b + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    private void ensureChipDrawableHasCallback() {
        int i = 2 % 2;
        Object obj = null;
        if (getBackgroundDrawable() == this.insetBackgroundDrawable) {
            int i2 = b + 75;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 != 0) {
                this.chipDrawable.getCallback();
                obj.hashCode();
                throw null;
            }
            if (this.chipDrawable.getCallback() == null) {
                this.chipDrawable.setCallback(this.insetBackgroundDrawable);
            }
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public Drawable getBackgroundDrawable() {
        int i = 2 % 2;
        Drawable drawable = this.insetBackgroundDrawable;
        if (drawable == null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
            b = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            drawable = this.chipDrawable;
        }
        int i3 = b + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 75 / 0;
        }
        return drawable;
    }

    private void updateFrameworkRippleBackground() {
        int i = 2 % 2;
        this.ripple = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(this.chipDrawable.getRippleColor()), getBackgroundDrawable(), null);
        this.chipDrawable.setUseCompatRipple(false);
        ViewCompat.setBackground(this, this.ripple);
        updatePaddingInternal();
        int i2 = b + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
    }

    private void unapplyChipDrawable(ChipDrawable chipDrawable) {
        int i = 2 % 2;
        int i2 = b + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (chipDrawable != null) {
            chipDrawable.setDelegate(null);
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
            b = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    private void applyChipDrawable(ChipDrawable chipDrawable) {
        int i = 2 % 2;
        int i2 = b + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        chipDrawable.setDelegate(this);
        if (i3 != 0) {
            throw null;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int i2 = 2 % 2;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (!(!isChecked())) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
            b = i3 % 128;
            if (i3 % 2 == 0) {
                mergeDrawableStates(iArrOnCreateDrawableState, SELECTED_STATE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            mergeDrawableStates(iArrOnCreateDrawableState, SELECTED_STATE);
        }
        if (isCheckable()) {
            int i4 = b + 109;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            mergeDrawableStates(iArrOnCreateDrawableState, CHECKABLE_STATE_SET);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        int i2 = 2 % 2;
        int i3 = b + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        if (i != 8388627) {
            return;
        }
        super.setGravity(i);
        int i5 = b + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
        b = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        int i = 2 % 2;
        int i2 = b + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        int i2 = 2 % 2;
        int i3 = b + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i) {
        int i2 = 2 % 2;
        int i3 = b + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        int i = 2 % 2;
        if (drawable != getBackgroundDrawable()) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i3 = i2 + 3;
            b = i3 % 128;
            int i4 = i3 % 2;
            if (drawable != this.ripple) {
                int i5 = i2 + 67;
                b = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        super.setBackground(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 21;
        b = i2 % 128;
        int i3 = i2 % 2;
        if (drawable != getBackgroundDrawable()) {
            int i4 = b + 73;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            if (drawable != this.ripple) {
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
        b = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        int i = 2 % 2;
        int i2 = b + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        int i3 = b + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        super.setCompoundDrawablesWithIntrinsicBounds(r4, r5, r6, r7);
        r4 = com.google.android.material.chip.Chip.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
        com.google.android.material.chip.Chip.b = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        throw new java.lang.UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r6 == 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if (r6 == 0) goto L10;
     */
    @Override // android.widget.TextView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setCompoundDrawablesWithIntrinsicBounds(int r4, int r5, int r6, int r7) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.material.chip.Chip.b
            int r1 = r1 + 65
            int r2 = r1 % 128
            com.google.android.material.chip.Chip.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r2
            int r1 = r1 % r0
            if (r4 != 0) goto L35
            int r2 = r2 + 65
            int r1 = r2 % 128
            com.google.android.material.chip.Chip.b = r1
            int r2 = r2 % r0
            if (r2 != 0) goto L1e
            r1 = 28
            int r1 = r1 / 0
            if (r6 != 0) goto L2d
            goto L20
        L1e:
            if (r6 != 0) goto L2d
        L20:
            super.setCompoundDrawablesWithIntrinsicBounds(r4, r5, r6, r7)
            int r4 = com.google.android.material.chip.Chip.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r4 = r4 + 3
            int r5 = r4 % 128
            com.google.android.material.chip.Chip.b = r5
            int r4 = r4 % r0
            return
        L2d:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.String r5 = "Please set end drawable using R.attr#closeIcon."
            r4.<init>(r5)
            throw r4
        L35:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.String r5 = "Please set start drawable using R.attr#chipIcon."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.setCompoundDrawablesWithIntrinsicBounds(int, int, int, int):void");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 43;
        b = i3 % 128;
        int i4 = i3 % 2;
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        int i5 = i2 + 35;
        b = i5 % 128;
        int i6 = i5 % 2;
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
        b = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        int i5 = i3 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        int i9 = i7 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
        if (i9 % 2 != 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
        b = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        int i = 2 % 2;
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        int i2 = b + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        int i3 = b + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        int i = 2 % 2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            TextUtils.TruncateAt ellipsize = chipDrawable.getEllipsize();
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 31;
            b = i2 % 128;
            int i3 = i2 % 2;
            return ellipsize;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        int i = 2 % 2;
        int i2 = b + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 25 / 0;
            if (this.chipDrawable == null) {
                return;
            }
        } else if (this.chipDrawable == null) {
            return;
        }
        if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
            int i4 = b + 117;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            super.setEllipsize(truncateAt);
            ChipDrawable chipDrawable = this.chipDrawable;
            if (chipDrawable != null) {
                chipDrawable.setEllipsize(truncateAt);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        int i = 2 % 2;
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
        b = i2 % 128;
        int i3 = i2 % 2;
        super.setSingleLine(z);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        int i2 = 2 % 2;
        int i3 = b + 69;
        int i4 = i3 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4;
        if (i3 % 2 == 0 ? i > 1 : i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        int i5 = i4 + 113;
        b = i5 % 128;
        int i6 = i5 % 2;
        super.setLines(i);
        int i7 = b + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        int i2 = 2 % 2;
        int i3 = b + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
        int i5 = b + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 97 / 0;
        }
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0 ? i > 1 : i > 0) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        int i5 = i3 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            super.setMaxLines(i);
        } else {
            super.setMaxLines(i);
            int i6 = 16 / 0;
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        int i2 = 2 % 2;
        super.setMaxWidth(i);
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
            b = i3 % 128;
            int i4 = i3 % 2;
            chipDrawable.setMaxWidth(i);
        }
        int i5 = b + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.google.android.material.chip.ChipDrawable.Delegate
    public void onChipDrawableSizeChange() {
        int i = 2 % 2;
        int i2 = b + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            ensureAccessibleTouchTarget(this.minTouchTargetSize);
            requestLayout();
            invalidateOutline();
            throw null;
        }
        ensureAccessibleTouchTarget(this.minTouchTargetSize);
        requestLayout();
        invalidateOutline();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        int i = 2 % 2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable == null) {
            this.deferredCheckedValue = z;
            int i2 = b + 61;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        if (chipDrawable.isCheckable()) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
            b = i4 % 128;
            int i5 = i4 % 2;
            super.setChecked(z);
            if (i5 == 0) {
                int i6 = 5 / 0;
            }
        }
        int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 69;
        b = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        int i = 2 % 2;
        int i2 = b + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        this.onCheckedChangeListener = onCheckedChangeListener;
        if (i3 != 0) {
            throw null;
        }
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        int i = 2 % 2;
        int i2 = b + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            this.onCloseIconClickListener = onClickListener;
            updateAccessibilityDelegate();
        } else {
            this.onCloseIconClickListener = onClickListener;
            updateAccessibilityDelegate();
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001f A[PHI: r1
  0x001f: PHI (r1v5 android.view.View$OnClickListener) = (r1v4 android.view.View$OnClickListener), (r1v11 android.view.View$OnClickListener) binds: [B:8:0x001d, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    public boolean performCloseIconClick() {
        View.OnClickListener onClickListener;
        int i = 2 % 2;
        int i2 = b + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        boolean z = false;
        if (i2 % 2 != 0) {
            playSoundEffect(1);
            onClickListener = this.onCloseIconClickListener;
            if (onClickListener != null) {
                onClickListener.onClick(this);
                z = true;
            }
        } else {
            playSoundEffect(0);
            onClickListener = this.onCloseIconClickListener;
            if (onClickListener != null) {
                onClickListener.onClick(this);
                z = true;
            }
        }
        if (this.touchHelperEnabled) {
            this.touchHelper.sendEventForVirtualView(1, 1);
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
        b = i3 % 128;
        int i4 = i3 % 2;
        return z;
    }

    class ChipTouchHelper extends ExploreByTouchHelper {
        ChipTouchHelper(Chip chip) {
            super(chip);
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public int getVirtualViewAt(float f, float f2) {
            return (Chip.access$100(Chip.this) && Chip.access$200(Chip.this).contains(f, f2)) ? 1 : 0;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void getVisibleVirtualViews(List<Integer> list) {
            list.add(0);
            if (Chip.access$100(Chip.this) && Chip.this.isCloseIconVisible() && Chip.access$300(Chip.this) != null) {
                list.add(1);
            }
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void onVirtualViewKeyboardFocusChanged(int i, boolean z) {
            if (i == 1) {
                Chip.access$402(Chip.this, z);
                Chip.this.refreshDrawableState();
            }
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void onPopulateNodeForVirtualView(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (i == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    accessibilityNodeInfoCompat.setContentDescription(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    accessibilityNodeInfoCompat.setContentDescription(Chip.this.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
                }
                accessibilityNodeInfoCompat.setBoundsInParent(Chip.access$500(Chip.this));
                accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
                accessibilityNodeInfoCompat.setEnabled(Chip.this.isEnabled());
                return;
            }
            accessibilityNodeInfoCompat.setContentDescription("");
            accessibilityNodeInfoCompat.setBoundsInParent(Chip.access$600());
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void onPopulateNodeForHost(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            accessibilityNodeInfoCompat.setCheckable(Chip.this.isCheckable());
            accessibilityNodeInfoCompat.setClickable(Chip.this.isClickable());
            accessibilityNodeInfoCompat.setClassName(Chip.this.getAccessibilityClassName());
            accessibilityNodeInfoCompat.setText(Chip.this.getText());
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            if (i2 != 16) {
                return false;
            }
            if (i == 0) {
                return Chip.this.performClick();
            }
            if (i == 1) {
                return Chip.this.performCloseIconClick();
            }
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0065  */
    /* JADX WARN: Code duplicated, block: B:34:0x006b A[RETURN] */
    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int i = 2 % 2;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                int i2 = b + 59;
                int i3 = i2 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
                int i4 = i2 % 2;
                if (actionMasked != 2) {
                    int i5 = i3 + 51;
                    b = i5 % 128;
                    if (i5 % 2 != 0 ? actionMasked == 3 : actionMasked == 2) {
                    }
                } else if (this.closeIconPressed) {
                    int i6 = i3 + 71;
                    b = i6 % 128;
                    if (i6 % 2 == 0) {
                        throw null;
                    }
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                }
                if (!super.onTouchEvent(motionEvent)) {
                    return false;
                }
            } else {
                if (this.closeIconPressed) {
                    performCloseIconClick();
                    z = true;
                }
                setCloseIconPressed(false);
                if (!z) {
                    if (!super.onTouchEvent(motionEvent)) {
                        return false;
                    }
                }
            }
            z = false;
            setCloseIconPressed(false);
            if (!z) {
                if (!super.onTouchEvent(motionEvent)) {
                    return false;
                }
            }
        } else if (!(!zContains)) {
            setCloseIconPressed(true);
        } else if (!super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
        b = i2 % 128;
        int i3 = i2 % 2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
            int i4 = b + 13;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
        } else if (actionMasked == 10) {
            int i6 = b + 55;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            if (i6 % 2 != 0) {
                setCloseIconHovered(false);
            } else {
                setCloseIconHovered(false);
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        boolean zDispatchHoverEvent;
        int i = 2 % 2;
        if (this.touchHelperEnabled) {
            if (this.touchHelper.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent)) {
                return true;
            }
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 75;
            b = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = b + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            zDispatchHoverEvent = super.dispatchHoverEvent(motionEvent);
            int i5 = 90 / 0;
        } else {
            zDispatchHoverEvent = super.dispatchHoverEvent(motionEvent);
        }
        int i6 = b + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        int i7 = i6 % 2;
        return zDispatchHoverEvent;
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
        b = i2 % 128;
        int i3 = i2 % 2;
        if (!this.touchHelperEnabled) {
            boolean zDispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
            b = i4 % 128;
            int i5 = i4 % 2;
            return zDispatchKeyEvent;
        }
        if (this.touchHelper.dispatchKeyEvent(keyEvent)) {
            int i6 = b + 107;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            int i7 = i6 % 2;
            if (this.touchHelper.getKeyboardFocusedVirtualViewId() != Integer.MIN_VALUE) {
                int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
                b = i8 % 128;
                int i9 = i8 % 2;
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            super.onFocusChanged(z, i, rect);
            int i4 = 77 / 0;
            if (this.touchHelperEnabled) {
                this.touchHelper.onFocusChanged(z, i, rect);
            }
        } else {
            super.onFocusChanged(z, i, rect);
            if (this.touchHelperEnabled) {
                this.touchHelper.onFocusChanged(z, i, rect);
            }
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
        b = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        int i = 2 % 2;
        if (this.touchHelperEnabled) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
            b = i2 % 128;
            int i3 = i2 % 2;
            if (this.touchHelper.getKeyboardFocusedVirtualViewId() != 1) {
                int i4 = b + 25;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                if (i4 % 2 == 0) {
                }
            }
            rect.set(getCloseIconTouchBoundsInt());
            return;
        }
        super.getFocusedRect(rect);
    }

    private void setCloseIconPressed(boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 4 / 0;
            if (this.closeIconPressed == z) {
                return;
            }
        } else if (this.closeIconPressed == z) {
            return;
        }
        int i5 = i2 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        this.closeIconPressed = z;
        refreshDrawableState();
    }

    private void setCloseIconHovered(boolean z) {
        int i = 2 % 2;
        if (this.closeIconHovered != z) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
            b = i2 % 128;
            int i3 = i2 % 2;
            this.closeIconHovered = z;
            refreshDrawableState();
        }
        int i4 = b + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        boolean closeIconState;
        int i = 2 % 2;
        int i2 = b + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        super.drawableStateChanged();
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            int i4 = b + 101;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            if (i4 % 2 != 0) {
                chipDrawable.isCloseIconStateful();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (chipDrawable.isCloseIconStateful()) {
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
                b = i5 % 128;
                if (i5 % 2 == 0) {
                    closeIconState = this.chipDrawable.setCloseIconState(createCloseIconDrawableState());
                    int i6 = 68 / 0;
                } else {
                    closeIconState = this.chipDrawable.setCloseIconState(createCloseIconDrawableState());
                }
                if (closeIconState) {
                    int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
                    b = i7 % 128;
                    int i8 = i7 % 2;
                    invalidate();
                    if (i8 == 0) {
                        int i9 = 9 / 0;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    private int[] createCloseIconDrawableState() {
        int i;
        int i2 = 2 % 2;
        int i3 = b + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            isEnabled();
            throw null;
        }
        ?? IsEnabled = isEnabled();
        if (this.closeIconFocused) {
            i = IsEnabled;
            int i4 = b + 65;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            i = IsEnabled + 1;
        }
        i = IsEnabled;
        int i6 = i;
        if (this.closeIconHovered) {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
            b = i7 % 128;
            i6 = i7 % 2 == 0 ? i - 1 : i + 1;
        }
        int i8 = i6;
        if (this.closeIconPressed) {
            i8 = i6 + 1;
        }
        int i9 = i8;
        if (isChecked()) {
            int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
            b = i10 % 128;
            i9 = i10 % 2 == 0 ? i8 - 1 : i8 + 1;
        }
        int[] iArr = new int[i9];
        int i11 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i11 = 1;
        }
        if (this.closeIconFocused) {
            iArr[i11] = 16842908;
            i11++;
        }
        if (this.closeIconHovered) {
            iArr[i11] = 16843623;
            i11++;
        }
        if (!(!this.closeIconPressed)) {
            iArr[i11] = 16842919;
            i11++;
        }
        if (isChecked()) {
            iArr[i11] = 16842913;
        }
        return iArr;
    }

    private boolean hasCloseIcon() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 81;
        b = i3 % 128;
        int i4 = i3 % 2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable == null) {
            return false;
        }
        int i5 = i2 + 1;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return chipDrawable.getCloseIcon() != null;
        }
        chipDrawable.getCloseIcon();
        throw null;
    }

    private RectF getCloseIconTouchBounds() {
        int i = 2 % 2;
        int i2 = b + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.rectF.setEmpty();
            hasCloseIcon();
            throw null;
        }
        this.rectF.setEmpty();
        if (!(!hasCloseIcon()) && this.onCloseIconClickListener != null) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
            b = i3 % 128;
            if (i3 % 2 != 0) {
                this.chipDrawable.getCloseIconTouchBounds(this.rectF);
            } else {
                this.chipDrawable.getCloseIconTouchBounds(this.rectF);
                obj.hashCode();
                throw null;
            }
        }
        return this.rectF;
    }

    private Rect getCloseIconTouchBoundsInt() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            RectF closeIconTouchBounds = getCloseIconTouchBounds();
            this.rect.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
            return this.rect;
        }
        RectF closeIconTouchBounds2 = getCloseIconTouchBounds();
        this.rect.set((int) closeIconTouchBounds2.left, (int) closeIconTouchBounds2.top, (int) closeIconTouchBounds2.right, (int) closeIconTouchBounds2.bottom);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
            obj.hashCode();
            throw null;
        }
        if ((!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY())) || !isEnabled()) {
            return super.onResolvePointerIcon(motionEvent, i);
        }
        PointerIcon systemIcon = PointerIcon.getSystemIcon(getContext(), 1002);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return systemIcon;
        }
        throw null;
    }

    @Override // com.google.android.material.internal.MaterialCheckable
    public void setInternalOnCheckedChangeListener(MaterialCheckable.OnCheckedChangeListener<Chip> onCheckedChangeListener) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
        b = i2 % 128;
        int i3 = i2 % 2;
        this.onCheckedChangeListenerInternal = onCheckedChangeListener;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ColorStateList getChipBackgroundColor() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
        b = i2 % 128;
        int i3 = i2 % 2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable == null) {
            return null;
        }
        ColorStateList chipBackgroundColor = chipDrawable.getChipBackgroundColor();
        int i4 = b + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return chipBackgroundColor;
    }

    public void setChipBackgroundColorResource(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            int i6 = i4 + 91;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            int i7 = i6 % 2;
            chipDrawable.setChipBackgroundColorResource(i);
        }
        int i8 = b + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
        int i9 = i8 % 2;
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = b + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipBackgroundColor(colorStateList);
            int i3 = b + 55;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public float getChipMinHeight() {
        ChipDrawable chipDrawable;
        int i = 2 % 2;
        int i2 = b + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            chipDrawable = this.chipDrawable;
            int i3 = 3 / 0;
            if (chipDrawable == null) {
                return 0.0f;
            }
        } else {
            chipDrawable = this.chipDrawable;
            if (chipDrawable == null) {
                return 0.0f;
            }
        }
        float chipMinHeight = chipDrawable.getChipMinHeight();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
        b = i4 % 128;
        int i5 = i4 % 2;
        return chipMinHeight;
    }

    public void setChipMinHeightResource(int i) {
        int i2 = 2 % 2;
        int i3 = b + 61;
        int i4 = i3 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4;
        int i5 = i3 % 2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            int i6 = i4 + 51;
            b = i6 % 128;
            int i7 = i6 % 2;
            chipDrawable.setChipMinHeightResource(i);
            if (i7 == 0) {
                int i8 = 75 / 0;
            }
            int i9 = b + 21;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
            int i10 = i9 % 2;
        }
    }

    public void setChipMinHeight(float f) {
        int i = 2 % 2;
        int i2 = b + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipMinHeight(f);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
            b = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public float getChipCornerRadius() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
        int i3 = i2 % 128;
        b = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return Math.max(0.0f, chipDrawable.getChipCornerRadius());
        }
        int i4 = i3 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return 0.0f;
        }
        throw null;
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i4 = i3 + 111;
        b = i4 % 128;
        int i5 = i4 % 2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            int i6 = i3 + 123;
            b = i6 % 128;
            int i7 = i6 % 2;
            chipDrawable.setChipCornerRadiusResource(i);
            if (i7 == 0) {
                int i8 = 74 / 0;
            }
        }
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            this.chipDrawable.setShapeAppearanceModel(shapeAppearanceModel);
            int i3 = 4 / 0;
        } else {
            this.chipDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.material.shape.Shapeable
    public ShapeAppearanceModel getShapeAppearanceModel() {
        int i = 2 % 2;
        int i2 = b + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        ShapeAppearanceModel shapeAppearanceModel = this.chipDrawable.getShapeAppearanceModel();
        int i4 = b + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return shapeAppearanceModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        int i = 2 % 2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            int i2 = b + 57;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            chipDrawable.setChipCornerRadius(f);
        }
        int i4 = b + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ColorStateList getChipStrokeColor() {
        int i = 2 % 2;
        int i2 = b + 117;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable == null) {
            return null;
        }
        int i4 = i3 + 15;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return chipDrawable.getChipStrokeColor();
        }
        chipDrawable.getChipStrokeColor();
        obj.hashCode();
        throw null;
    }

    public void setChipStrokeColorResource(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            int i6 = i4 + 19;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            int i7 = i6 % 2;
            chipDrawable.setChipStrokeColorResource(i);
            if (i7 != 0) {
                int i8 = 85 / 0;
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = b + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipStrokeColor(colorStateList);
            int i3 = b + 63;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public float getChipStrokeWidth() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
        b = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable == null) {
            return 0.0f;
        }
        float chipStrokeWidth = chipDrawable.getChipStrokeWidth();
        int i3 = b + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            return chipStrokeWidth;
        }
        throw null;
    }

    public void setChipStrokeWidthResource(int i) {
        int i2 = 2 % 2;
        int i3 = b + 3;
        int i4 = i3 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            int i5 = i4 + 5;
            b = i5 % 128;
            int i6 = i5 % 2;
            chipDrawable.setChipStrokeWidthResource(i);
            if (i6 == 0) {
                int i7 = 28 / 0;
            }
            int i8 = b + 107;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    public void setChipStrokeWidth(float f) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            int i5 = i2 + 85;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            chipDrawable.setChipStrokeWidth(f);
            if (i6 != 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        return r2.getRippleColor();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r1 = r1 + 121;
        com.google.android.material.chip.Chip.b = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r2 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.content.res.ColorStateList getRippleColor() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.material.chip.Chip.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r2 = r1 + 23
            int r3 = r2 % 128
            com.google.android.material.chip.Chip.b = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L17
            com.google.android.material.chip.ChipDrawable r2 = r4.chipDrawable
            r3 = 56
            int r3 = r3 / 0
            if (r2 == 0) goto L20
            goto L1b
        L17:
            com.google.android.material.chip.ChipDrawable r2 = r4.chipDrawable
            if (r2 == 0) goto L20
        L1b:
            android.content.res.ColorStateList r0 = r2.getRippleColor()
            return r0
        L20:
            int r1 = r1 + 121
            int r2 = r1 % 128
            com.google.android.material.chip.Chip.b = r2
            int r1 = r1 % r0
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.getRippleColor():android.content.res.ColorStateList");
    }

    public void setRippleColorResource(int i) {
        int i2 = 2 % 2;
        int i3 = b + 53;
        int i4 = i3 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            int i5 = i4 + 113;
            b = i5 % 128;
            int i6 = i5 % 2;
            chipDrawable.setRippleColorResource(i);
            if (!this.chipDrawable.getUseCompatRipple()) {
                int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
                b = i7 % 128;
                int i8 = i7 % 2;
                updateFrameworkRippleBackground();
            }
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        int i = 2 % 2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setRippleColor(colorStateList);
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
            b = i2 % 128;
            int i3 = i2 % 2;
        }
        if (!this.chipDrawable.getUseCompatRipple()) {
            int i4 = b + 51;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            updateFrameworkRippleBackground();
            if (i5 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        int i6 = b + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        int i7 = i6 % 2;
    }

    @Deprecated
    public CharSequence getChipText() {
        CharSequence text;
        int i = 2 % 2;
        int i2 = b + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            text = getText();
            int i3 = 10 / 0;
        } else {
            text = getText();
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 43;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 70 / 0;
        }
        return text;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 68 / 0;
            if (this.chipDrawable == null) {
                return;
            }
        } else if (this.chipDrawable == null) {
            return;
        }
        super.setLayoutDirection(i);
        int i5 = b + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        int i = 2 % 2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
            b = i2 % 128;
            int i3 = i2 % 2;
            if (charSequence == null) {
                charSequence = "";
            }
            super.setText(chipDrawable.shouldDrawText() ? null : charSequence, bufferType);
            ChipDrawable chipDrawable2 = this.chipDrawable;
            if (chipDrawable2 != null) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
                b = i4 % 128;
                int i5 = i4 % 2;
                chipDrawable2.setText(charSequence);
            }
        }
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
        b = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 9 / 0;
        }
    }

    @Deprecated
    public void setChipTextResource(int i) {
        int i2 = 2 % 2;
        int i3 = b + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        setText(getResources().getString(i));
        int i5 = b + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = b + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        setText(charSequence);
        if (i3 != 0) {
            throw null;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setTextAppearanceResource(int i) {
        int i2 = 2 % 2;
        int i3 = b + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        setTextAppearance(getContext(), i);
        int i5 = b + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 87 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    /* JADX WARN: Code duplicated, block: B:12:0x002c  */
    /* JADX WARN: Code duplicated, block: B:9:0x001b A[PHI: r2
  0x001b: PHI (r2v3 com.google.android.material.chip.ChipDrawable) = (r2v2 com.google.android.material.chip.ChipDrawable), (r2v4 com.google.android.material.chip.ChipDrawable) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    public void setTextAppearance(TextAppearance textAppearance) {
        ChipDrawable chipDrawable;
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            chipDrawable = this.chipDrawable;
            int i5 = 23 / 0;
            if (chipDrawable != null) {
                i = i3 + 53;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i % 128;
                if (i % 2 != 0) {
                    chipDrawable.setTextAppearance(textAppearance);
                    int i6 = 54 / 0;
                } else {
                    chipDrawable.setTextAppearance(textAppearance);
                }
            }
        } else {
            chipDrawable = this.chipDrawable;
            if (chipDrawable != null) {
                i = i3 + 53;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i % 128;
                if (i % 2 != 0) {
                    chipDrawable.setTextAppearance(textAppearance);
                    int i7 = 54 / 0;
                } else {
                    chipDrawable.setTextAppearance(textAppearance);
                }
            }
        }
        updateTextPaintDrawState();
        int i8 = b + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        int i2 = 2 % 2;
        super.setTextAppearance(context, i);
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            int i3 = b + 67;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            if (i3 % 2 != 0) {
                chipDrawable.setTextAppearanceResource(i);
                int i4 = 26 / 0;
            } else {
                chipDrawable.setTextAppearanceResource(i);
            }
        }
        updateTextPaintDrawState();
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 94 / 0;
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        int i2 = 2 % 2;
        int i3 = b + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        super.setTextAppearance(i);
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            int i5 = b + 55;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 != 0) {
                chipDrawable.setTextAppearanceResource(i);
                throw null;
            }
            chipDrawable.setTextAppearanceResource(i);
            int i6 = b + 77;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            int i7 = i6 % 2;
        }
        updateTextPaintDrawState();
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        int i2 = 2 % 2;
        int i3 = b + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            super.setTextSize(i, f);
            throw null;
        }
        super.setTextSize(i, f);
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setTextSize(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics()));
        }
        updateTextPaintDrawState();
        int i4 = b + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private void updateTextPaintDrawState() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
        b = i2 % 128;
        int i3 = i2 % 2;
        TextPaint paint = getPaint();
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            paint.drawableState = chipDrawable.getState();
        }
        TextAppearance textAppearance = getTextAppearance();
        if (textAppearance != null) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
            b = i4 % 128;
            int i5 = i4 % 2;
            textAppearance.updateDrawState(getContext(), paint, this.fontCallback);
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
            b = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    private TextAppearance getTextAppearance() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
        int i3 = i2 % 128;
        b = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getTextAppearance();
        }
        int i4 = i3 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 / 0;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    /* JADX WARN: Code duplicated, block: B:9:0x001b A[PHI: r1
  0x001b: PHI (r1v5 com.google.android.material.chip.ChipDrawable) = (r1v4 com.google.android.material.chip.ChipDrawable), (r1v10 com.google.android.material.chip.ChipDrawable) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    public boolean isChipIconVisible() {
        ChipDrawable chipDrawable;
        int i = 2 % 2;
        int i2 = b + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            chipDrawable = this.chipDrawable;
            int i3 = 89 / 0;
            if (chipDrawable != null) {
                if (chipDrawable.isChipIconVisible()) {
                    int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
                    b = i4 % 128;
                    int i5 = i4 % 2;
                    return true;
                }
            }
        } else {
            chipDrawable = this.chipDrawable;
            if (chipDrawable != null) {
                if (chipDrawable.isChipIconVisible()) {
                    int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
                    b = i6 % 128;
                    int i7 = i6 % 2;
                    return true;
                }
            }
        }
        return false;
    }

    @Deprecated
    public boolean isChipIconEnabled() {
        int i = 2 % 2;
        int i2 = b + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsChipIconVisible = isChipIconVisible();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return zIsChipIconVisible;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setChipIconVisible(int i) throws Throwable {
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
        int i6 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 46400), 40 - TextUtils.getCapsMode("", 0, 0), 18 - ((byte) KeyEvent.getModifierMetaStateMask()), -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
        }
        int i7 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object[] objArr = new Object[1];
        c(new int[]{0, 22, 162, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        c(new int[]{22, 15, 102, 0}, false, new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j = -1;
        long j2 = j ^ 475548628013165266L;
        long j3 = (int) Runtime.getRuntime().totalMemory();
        long j4 = (((long) 236) * 475548628013165266L) + (((long) 471) * 1621708546728793721L) + (((long) (-235)) * (((j2 | (j3 ^ j)) ^ j) | 1621708546728793721L)) + (((long) (-470)) * (((j2 | j3) ^ j) | 1621708546728793721L)) + (((long) 235) * (((j3 | (j2 | 1621708546728793721L)) ^ j) | ((475548628013165266L | (j ^ 1621708546728793721L)) ^ j)));
        int i8 = 0;
        long j5 = jLongValue;
        while (true) {
            if (i8 == 10) {
                try {
                    Object[] objArr3 = {1978858711};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (46038 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 1133 - TextUtils.indexOf((CharSequence) "", '0'), Color.alpha(0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr4 = {Integer.valueOf(i), 0, 1890152196, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr3), false};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1031;
                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 15;
                        byte[] bArr = $$a;
                        Object[] objArr5 = new Object[1];
                        a((byte) (-bArr[33]), bArr[122], bArr[7], objArr5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cNormalizeMetaState, scrollBarFadeDuration, maximumFlingVelocity, 1298546779, false, (String) objArr5[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45992 - Process.getGidForName("")), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1116, TextUtils.getOffsetAfter("", 0) + 17), Boolean.TYPE});
                    }
                    Object[] objArr6 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    int i9 = ((int[]) objArr6[1])[0];
                    int i10 = ((int[]) objArr6[3])[0];
                    if (i10 == i9) {
                        break;
                    }
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr6[0];
                    if (strArr != null) {
                        for (String str : strArr) {
                            arrayList.add(str);
                        }
                    }
                    Toast.makeText((Context) null, i10 / (((i10 - 1) * i10) % 2), 0).show();
                    break;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
            b = i11 % 128;
            if (i11 % 2 == 0) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (37836 - Color.argb(i6, i6, i6, i6)), 59 - Color.red(i6), 18 - (ViewConfiguration.getEdgeSlop() >> 16), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                }
                i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).getInt(null);
                i3 = 1;
            } else {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (37836 - (ViewConfiguration.getScrollBarSize() >> 8)), TextUtils.lastIndexOf("", '0') + 60, 18 - (ViewConfiguration.getTouchSlop() >> 8), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                }
                i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).getInt(null);
                i3 = i6;
            }
            while (true) {
                int i12 = i6;
                while (i12 != 8) {
                    i2 = (((((int) (j5 >> i12)) & 255) + (i2 << 6)) + (i2 << 16)) - i2;
                    i12++;
                    i8 = i8;
                }
                i4 = i8;
                if (i3 != 0) {
                    break;
                }
                int i13 = b + 113;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 % 128;
                i3 = i13 % 2 != 0 ? i3 + 22 : i3 + 1;
                j5 = j4;
                i8 = i4;
                i6 = 0;
            }
            if (i2 == i7) {
                break;
            }
            int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
            b = i14 % 128;
            int i15 = i14 % 2;
            j5 -= 1024;
            i8 = i4 + 1;
            i6 = 0;
        }
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            int i16 = b + 71;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16 % 128;
            int i17 = i16 % 2;
            chipDrawable.setChipIconVisible(i);
        }
    }

    public void setChipIconVisible(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipIconVisible(z);
        }
        int i3 = b + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 26 / 0;
        }
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = b + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        setChipIconVisible(i);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
        b = i5 % 128;
        int i6 = i5 % 2;
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
        b = i2 % 128;
        int i3 = i2 % 2;
        setChipIconVisible(z);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    public Drawable getChipIcon() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
        int i3 = i2 % 128;
        b = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getChipIcon();
        }
        int i4 = i3 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public void setChipIconResource(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            int i5 = i3 + 109;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            chipDrawable.setChipIconResource(i);
            int i7 = b + 115;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    public void setChipIcon(Drawable drawable) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            int i5 = i3 + 97;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            chipDrawable.setChipIcon(drawable);
            int i7 = b + 43;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    public ColorStateList getChipIconTint() {
        ChipDrawable chipDrawable;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            chipDrawable = this.chipDrawable;
            int i4 = 61 / 0;
            if (chipDrawable == null) {
                return null;
            }
        } else {
            chipDrawable = this.chipDrawable;
            if (chipDrawable == null) {
                return null;
            }
        }
        int i5 = i2 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return chipDrawable.getChipIconTint();
    }

    public void setChipIconTintResource(int i) {
        int i2 = 2 % 2;
        int i3 = b + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipIconTintResource(i);
        }
        int i4 = b + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            int i4 = i2 + 111;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            chipDrawable.setChipIconTint(colorStateList);
            if (i5 != 0) {
                throw null;
            }
        }
    }

    public float getChipIconSize() {
        ChipDrawable chipDrawable;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            chipDrawable = this.chipDrawable;
            int i3 = 30 / 0;
            if (chipDrawable == null) {
                return 0.0f;
            }
        } else {
            chipDrawable = this.chipDrawable;
            if (chipDrawable == null) {
                return 0.0f;
            }
        }
        float chipIconSize = chipDrawable.getChipIconSize();
        int i4 = b + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return chipIconSize;
    }

    public void setChipIconSizeResource(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipIconSizeResource(i);
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public void setChipIconSize(float f) {
        int i = 2 % 2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
            b = i2 % 128;
            int i3 = i2 % 2;
            chipDrawable.setChipIconSize(f);
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    public boolean isCloseIconVisible() {
        int i = 2 % 2;
        int i2 = b + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable == null || !chipDrawable.isCloseIconVisible()) {
            int i3 = b + 41;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
        b = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    @Deprecated
    public boolean isCloseIconEnabled() {
        boolean zIsCloseIconVisible;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            zIsCloseIconVisible = isCloseIconVisible();
            int i3 = 29 / 0;
        } else {
            zIsCloseIconVisible = isCloseIconVisible();
        }
        int i4 = b + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return zIsCloseIconVisible;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setCloseIconVisible(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
        b = i3 % 128;
        int i4 = i3 % 2;
        setCloseIconVisible(getResources().getBoolean(i));
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
        b = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setCloseIconVisible(boolean z) {
        int i = 2 % 2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 31;
            b = i2 % 128;
            if (i2 % 2 != 0) {
                chipDrawable.setCloseIconVisible(z);
            } else {
                chipDrawable.setCloseIconVisible(z);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        updateAccessibilityDelegate();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
        b = i3 % 128;
        int i4 = i3 % 2;
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
        b = i3 % 128;
        int i4 = i3 % 2;
        setCloseIconVisible(i);
        if (i4 == 0) {
            throw null;
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = b + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        setCloseIconVisible(z);
        if (i3 != 0) {
            int i4 = 71 / 0;
        }
    }

    public Drawable getCloseIcon() {
        int i = 2 % 2;
        int i2 = b + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable == null) {
            return null;
        }
        Drawable closeIcon = chipDrawable.getCloseIcon();
        int i3 = b + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        return closeIcon;
    }

    public void setCloseIconResource(int i) {
        int i2 = 2 % 2;
        int i3 = b + 103;
        int i4 = i3 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4;
        int i5 = i3 % 2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            int i6 = i4 + 79;
            b = i6 % 128;
            if (i6 % 2 != 0) {
                chipDrawable.setCloseIconResource(i);
            } else {
                chipDrawable.setCloseIconResource(i);
                throw null;
            }
        }
        updateAccessibilityDelegate();
        int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
        b = i7 % 128;
        int i8 = i7 % 2;
    }

    public void setCloseIcon(Drawable drawable) {
        int i = 2 % 2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            int i2 = b + 17;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            chipDrawable.setCloseIcon(drawable);
            int i4 = b + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
        }
        updateAccessibilityDelegate();
    }

    public ColorStateList getCloseIconTint() {
        int i = 2 % 2;
        int i2 = b + 77;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getCloseIconTint();
        }
        int i4 = i3 + 105;
        b = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public void setCloseIconTintResource(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconTintResource(i);
            int i4 = b + 103;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 % 2;
            }
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        ChipDrawable chipDrawable;
        int i = 2 % 2;
        int i2 = b + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            chipDrawable = this.chipDrawable;
            int i3 = 26 / 0;
            if (chipDrawable == null) {
                return;
            }
        } else {
            chipDrawable = this.chipDrawable;
            if (chipDrawable == null) {
                return;
            }
        }
        chipDrawable.setCloseIconTint(colorStateList);
        int i4 = b + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    public float getCloseIconSize() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable == null) {
            return 0.0f;
        }
        int i5 = i2 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return chipDrawable.getCloseIconSize();
    }

    public void setCloseIconSizeResource(int i) {
        int i2 = 2 % 2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconSizeResource(i);
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
            b = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setCloseIconSize(float f) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 75;
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            int i4 = i2 + 77;
            b = i4 % 128;
            int i5 = i4 % 2;
            chipDrawable.setCloseIconSize(f);
            if (i5 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        ChipDrawable chipDrawable;
        int i = 2 % 2;
        int i2 = b + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            chipDrawable = this.chipDrawable;
            int i3 = 74 / 0;
            if (chipDrawable == null) {
                return;
            }
        } else {
            chipDrawable = this.chipDrawable;
            if (chipDrawable == null) {
                return;
            }
        }
        chipDrawable.setCloseIconContentDescription(charSequence);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 5 / 3;
        }
    }

    public CharSequence getCloseIconContentDescription() {
        int i = 2 % 2;
        int i2 = b + 119;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getCloseIconContentDescription();
        }
        int i4 = i3 + 9;
        b = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public boolean isCheckable() {
        int i = 2 % 2;
        ChipDrawable chipDrawable = this.chipDrawable;
        boolean z = false;
        if (chipDrawable != null && chipDrawable.isCheckable()) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i3 = i2 + 71;
            b = i3 % 128;
            z = i3 % 2 != 0;
            int i4 = i2 + 21;
            b = i4 % 128;
            int i5 = i4 % 2;
        }
        return z;
    }

    public void setCheckableResource(int i) {
        int i2 = 2 % 2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
            b = i3 % 128;
            int i4 = i3 % 2;
            chipDrawable.setCheckableResource(i);
            int i5 = b + 111;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
        }
        int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
        b = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 68 / 0;
        }
    }

    public void setCheckable(boolean z) {
        int i = 2 % 2;
        int i2 = b + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCheckable(z);
            int i3 = b + 17;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
    
        if ((!r1) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (r1 != true) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean isCheckedIconVisible() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            com.google.android.material.chip.ChipDrawable r1 = r5.chipDrawable
            r2 = 0
            if (r1 == 0) goto L23
            int r3 = com.google.android.material.chip.Chip.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r3 = r3 + 119
            int r4 = r3 % 128
            com.google.android.material.chip.Chip.b = r4
            int r3 = r3 % r0
            r4 = 1
            boolean r1 = r1.isCheckedIconVisible()
            if (r3 != 0) goto L1f
            r3 = 31
            int r3 = r3 / r2
            r1 = r1 ^ r4
            if (r1 == 0) goto L22
            goto L23
        L1f:
            if (r1 == r4) goto L22
            goto L23
        L22:
            return r4
        L23:
            int r1 = com.google.android.material.chip.Chip.b
            int r1 = r1 + 13
            int r3 = r1 % 128
            com.google.android.material.chip.Chip.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r3
            int r1 = r1 % r0
            if (r1 != 0) goto L2f
            return r2
        L2f:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.isCheckedIconVisible():boolean");
    }

    @Deprecated
    public boolean isCheckedIconEnabled() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
        b = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsCheckedIconVisible = isCheckedIconVisible();
        int i4 = b + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return zIsCheckedIconVisible;
    }

    public void setCheckedIconVisible(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCheckedIconVisible(i);
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setCheckedIconVisible(boolean z) {
        int i = 2 % 2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            int i2 = b + 103;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            chipDrawable.setCheckedIconVisible(z);
            if (i3 != 0) {
                throw null;
            }
            int i4 = b + 51;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        int i2 = 2 % 2;
        int i3 = b + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        setCheckedIconVisible(i);
        int i5 = b + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = b + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        setCheckedIconVisible(z);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 62 / 0;
        }
    }

    public Drawable getCheckedIcon() {
        int i = 2 % 2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable == null) {
            return null;
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
        b = i2 % 128;
        int i3 = i2 % 2;
        Drawable checkedIcon = chipDrawable.getCheckedIcon();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 19 / 0;
        }
        return checkedIcon;
    }

    public void setCheckedIconResource(int i) {
        int i2 = 2 % 2;
        int i3 = b + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCheckedIconResource(i);
            int i4 = b + 85;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 / 2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b A[PHI: r1
  0x001b: PHI (r1v5 com.google.android.material.chip.ChipDrawable) = (r1v4 com.google.android.material.chip.ChipDrawable), (r1v7 com.google.android.material.chip.ChipDrawable) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    public void setCheckedIcon(Drawable drawable) {
        ChipDrawable chipDrawable;
        int i = 2 % 2;
        int i2 = b + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            chipDrawable = this.chipDrawable;
            int i3 = 45 / 0;
            if (chipDrawable != null) {
                chipDrawable.setCheckedIcon(drawable);
            }
        } else {
            chipDrawable = this.chipDrawable;
            if (chipDrawable != null) {
                chipDrawable.setCheckedIcon(drawable);
            }
        }
        int i4 = b + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public ColorStateList getCheckedIconTint() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 51;
        int i4 = i3 % 128;
        b = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            int i5 = i2 + 51;
            b = i5 % 128;
            int i6 = i5 % 2;
            return chipDrawable.getCheckedIconTint();
        }
        int i7 = i4 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 90 / 0;
        }
        return null;
    }

    public void setCheckedIconTintResource(int i) {
        int i2 = 2 % 2;
        int i3 = b + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCheckedIconTintResource(i);
        }
        int i4 = b + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            int i5 = i3 + 29;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            chipDrawable.setCheckedIconTint(colorStateList);
            if (i6 != 0) {
                int i7 = 3 / 0;
            }
        }
    }

    public MotionSpec getShowMotionSpec() {
        int i = 2 % 2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
            b = i2 % 128;
            int i3 = i2 % 2;
            MotionSpec showMotionSpec = chipDrawable.getShowMotionSpec();
            if (i3 == 0) {
                int i4 = 55 / 0;
            }
            return showMotionSpec;
        }
        int i5 = b + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public void setShowMotionSpecResource(int i) {
        int i2 = 2 % 2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
            b = i3 % 128;
            int i4 = i3 % 2;
            chipDrawable.setShowMotionSpecResource(i);
            if (i4 == 0) {
                int i5 = 29 / 0;
            }
        }
        int i6 = b + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        int i7 = i6 % 2;
    }

    public void setShowMotionSpec(MotionSpec motionSpec) {
        int i = 2 % 2;
        int i2 = b + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setShowMotionSpec(motionSpec);
        }
        int i3 = b + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
    }

    public MotionSpec getHideMotionSpec() {
        int i = 2 % 2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable == null) {
            return null;
        }
        int i2 = b + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        MotionSpec hideMotionSpec = chipDrawable.getHideMotionSpec();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return hideMotionSpec;
        }
        throw null;
    }

    public void setHideMotionSpecResource(int i) {
        int i2 = 2 % 2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            int i3 = b + 107;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            chipDrawable.setHideMotionSpecResource(i);
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
            b = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public void setHideMotionSpec(MotionSpec motionSpec) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            int i5 = i3 + 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            chipDrawable.setHideMotionSpec(motionSpec);
        }
    }

    public float getChipStartPadding() {
        int i = 2 % 2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            int i2 = b + 29;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            return chipDrawable.getChipStartPadding();
        }
        int i4 = b + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return 0.0f;
    }

    public void setChipStartPaddingResource(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipStartPaddingResource(i);
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public void setChipStartPadding(float f) {
        int i = 2 % 2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            int i2 = b + 89;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            chipDrawable.setChipStartPadding(f);
        }
        int i4 = b + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    public float getIconStartPadding() {
        int i = 2 % 2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable == null) {
            return 0.0f;
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 31;
        b = i2 % 128;
        int i3 = i2 % 2;
        float iconStartPadding = chipDrawable.getIconStartPadding();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return iconStartPadding;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setIconStartPaddingResource(int i) {
        int i2 = 2 % 2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
            b = i3 % 128;
            int i4 = i3 % 2;
            chipDrawable.setIconStartPaddingResource(i);
        }
        int i5 = b + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public void setIconStartPadding(float f) {
        int i = 2 % 2;
        ChipDrawable chipDrawable = this.chipDrawable;
        Object obj = null;
        if (chipDrawable != null) {
            int i2 = b + 83;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            chipDrawable.setIconStartPadding(f);
            if (i3 != 0) {
                throw null;
            }
        }
        int i4 = b + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        return r2.getIconEndPadding();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        r1 = r1 + 15;
        com.google.android.material.chip.Chip.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if ((r1 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        return 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r3 = r3 + 79;
        com.google.android.material.chip.Chip.b = r3 % 128;
        r3 = r3 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float getIconEndPadding() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.material.chip.Chip.b
            int r2 = r1 + 103
            int r3 = r2 % 128
            com.google.android.material.chip.Chip.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L17
            com.google.android.material.chip.ChipDrawable r2 = r5.chipDrawable
            r4 = 37
            int r4 = r4 / 0
            if (r2 == 0) goto L27
            goto L1b
        L17:
            com.google.android.material.chip.ChipDrawable r2 = r5.chipDrawable
            if (r2 == 0) goto L27
        L1b:
            int r3 = r3 + 79
            int r1 = r3 % 128
            com.google.android.material.chip.Chip.b = r1
            int r3 = r3 % r0
            float r0 = r2.getIconEndPadding()
            return r0
        L27:
            int r1 = r1 + 15
            int r2 = r1 % 128
            com.google.android.material.chip.Chip.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L32
            r0 = 0
            return r0
        L32:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.getIconEndPadding():float");
    }

    public void setIconEndPaddingResource(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            int i6 = i4 + 97;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            int i7 = i6 % 2;
            chipDrawable.setIconEndPaddingResource(i);
        }
    }

    public void setIconEndPadding(float f) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            int i5 = i2 + 3;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            chipDrawable.setIconEndPadding(f);
            if (i6 != 0) {
                throw null;
            }
        }
    }

    public float getTextStartPadding() {
        int i = 2 % 2;
        int i2 = b + 91;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable == null) {
            return 0.0f;
        }
        int i5 = i3 + 15;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            chipDrawable.getTextStartPadding();
            throw null;
        }
        float textStartPadding = chipDrawable.getTextStartPadding();
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
        b = i6 % 128;
        int i7 = i6 % 2;
        return textStartPadding;
    }

    public void setTextStartPaddingResource(int i) {
        int i2 = 2 % 2;
        int i3 = b + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setTextStartPaddingResource(i);
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
        b = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setTextStartPadding(float f) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setTextStartPadding(f);
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
        b = i3 % 128;
        int i4 = i3 % 2;
    }

    public float getTextEndPadding() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 89;
        int i4 = i3 % 128;
        b = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            int i5 = i2 + 109;
            b = i5 % 128;
            int i6 = i5 % 2;
            return chipDrawable.getTextEndPadding();
        }
        int i7 = i4 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
        if (i7 % 2 == 0) {
            return 0.0f;
        }
        throw null;
    }

    public void setTextEndPaddingResource(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 69;
        b = i3 % 128;
        int i4 = i3 % 2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setTextEndPaddingResource(i);
            int i5 = b + 85;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public void setTextEndPadding(float f) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            int i5 = i2 + 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            chipDrawable.setTextEndPadding(f);
            int i7 = b + 25;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0221  */
    public float getCloseIconStartPadding() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = b + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char fadingEdgeLength = (char) (37567 - (ViewConfiguration.getFadingEdgeLength() >> 16));
            int iRgb = Color.rgb(0, 0, 0) + 16777841;
            int i4 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 13;
            byte[] bArr = $$a;
            byte b2 = bArr[40];
            short s = bArr[122];
            Object[] objArr2 = new Object[1];
            a(b2, s, (byte) (s & 52), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(fadingEdgeLength, iRgb, i4, -477065106, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new int[]{0, 22, 162, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new int[]{22, 15, 102, 0}, false, new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (37567 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
            int mirror = AndroidCharacter.getMirror('0') + 577;
            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 14;
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            a((byte) (-bArr2[33]), bArr2[122], bArr2[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, mirror, keyRepeatDelay, -976899241, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
            b = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char touchSlop = (char) (37567 - (ViewConfiguration.getTouchSlop() >> 8));
                int i7 = 626 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                int fadingEdgeLength2 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 14;
                byte[] bArr3 = $$a;
                byte b3 = (byte) (-bArr3[33]);
                Object[] objArr6 = new Object[1];
                a(b3, (short) (b3 | 35), bArr3[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(touchSlop, i7, fadingEdgeLength2, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i8 = ((int[]) objArr7[2])[0];
            int i9 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i10 = ~iMaxMemory;
            int i11 = (((929821946 + ((~((-1125099778) | i10)) * 979)) + ((iMaxMemory | 698638343) * (-979))) + (((~(iMaxMemory | (-1125099778))) | (~(i10 | 698638343))) * 979)) - 1600332542;
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArr[1])[0] = i13 ^ (i13 << 5);
            objArr = new Object[]{new int[]{i9}, new int[1], new int[]{i8}, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            c(new int[]{37, 26, 172, 0}, true, new byte[]{0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new int[]{63, 18, 0, 0}, false, new byte[]{1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i14 = b + 49;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
                    if (i14 % 2 != 0) {
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
            Object[] objArr10 = new Object[1];
            c(new int[]{81, 16, 169, 5}, false, new byte[]{0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new int[]{97, 16, 151, 0}, false, new byte[]{0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1}, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr12 = new Object[1];
            c(new int[]{113, 64, 126, 22}, true, new byte[]{1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1}, objArr12);
            String str = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            c(new int[]{177, 64, 25, 57}, true, null, objArr13);
            String[] strArr2 = {str, (String) objArr13[0]};
            int i15 = b + 41;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15 % 128;
            int i16 = i15 % 2;
            try {
                Object[] objArr14 = {applicationContext, strArr2, Integer.valueOf(iIntValue), 17, -1600332542};
                byte[] bArr4 = $$d;
                Object[] objArr15 = new Object[1];
                d((byte) (bArr4[206] - 1), (short) 208, bArr4[97], objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                Object[] objArr16 = new Object[1];
                d(bArr4[9], (short) 101, bArr4[30], objArr16);
                Object[] objArr17 = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                int i17 = ((int[]) objArr17[0])[0];
                int i18 = ((int[]) objArr17[2])[0];
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 37568);
                        int deadChar = 625 - KeyEvent.getDeadChar(0, 0);
                        int iArgb = 14 - Color.argb(0, 0, 0, 0);
                        byte[] bArr5 = $$a;
                        byte b4 = (byte) (-bArr5[33]);
                        Object[] objArr18 = new Object[1];
                        a(b4, (short) (b4 | 35), bArr5[7], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(modifierMetaStateMask, deadChar, iArgb, -973632554, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr17);
                    try {
                        Object[] objArr19 = new Object[1];
                        c(new int[]{0, 22, 162, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr19);
                        Class<?> cls5 = Class.forName((String) objArr19[0]);
                        Object[] objArr20 = new Object[1];
                        c(new int[]{22, 15, 102, 0}, false, new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr20);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr20[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char mirror2 = (char) (AndroidCharacter.getMirror('0') + 37519);
                            int i19 = 626 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                            int iMyPid = (Process.myPid() >> 22) + 14;
                            byte[] bArr6 = $$a;
                            Object[] objArr21 = new Object[1];
                            a((byte) (-bArr6[33]), bArr6[122], bArr6[7], objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(mirror2, i19, iMyPid, -976899241, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char deadChar2 = (char) (KeyEvent.getDeadChar(0, 0) + 37567);
                            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 625;
                            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 14;
                            byte[] bArr7 = $$a;
                            byte b5 = bArr7[40];
                            short s2 = bArr7[122];
                            Object[] objArr22 = new Object[1];
                            a(b5, s2, (byte) (s2 & 52), objArr22);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(deadChar2, scrollBarSize, keyRepeatTimeout, -477065106, false, (String) objArr22[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr17;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (((int[]) objArr[2])[0] != ((int[]) objArr[0])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 == null) {
                throw null;
            }
            int i20 = b + 59;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20 % 128;
            int i21 = i20 % 2;
            for (String str2 : strArr3) {
                int i22 = b + 69;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i22 % 128;
                int i23 = i22 % 2;
                arrayList.add(str2);
            }
            throw null;
        }
        int i24 = ((int[]) objArr[1])[0];
        int i25 = ((int[]) objArr[2])[0];
        int i26 = ((int[]) objArr[0])[0];
        String[] strArr4 = (String[]) objArr[3];
        int iNextInt = new Random().nextInt(1113233723);
        int i27 = (~((-481521212) | iNextInt)) | 268438025;
        int i28 = i24 + (-807237240) + (i27 * 992) + ((i27 | (~((~iNextInt) | 1555300095))) * (-496)) + ((iNextInt | 1342216909) * 496);
        int i29 = (i28 << 13) ^ i28;
        int i30 = i29 ^ (i29 >>> 17);
        Object obj2 = new Object[]{new int[]{i26}, new int[1], new int[]{i25}, strArr4}[1];
        ((int[]) obj2)[0] = i30 ^ (i30 << 5);
        int i31 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
        b = i31 % 128;
        int i32 = i31 % 2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getCloseIconStartPadding();
        }
        int i33 = ((int[]) obj2)[0];
        int i34 = i33 * i33;
        int i35 = -(957545274 * i33);
        int i36 = (i34 & i35) + (i34 | i35);
        int i37 = -(i33 * (-1677984766));
        int i38 = (i36 & i37) + (i37 | i36);
        int i39 = (i38 ^ 1951741316) + ((1951741316 & i38) << 1);
        int i40 = i39 >> 29;
        int i41 = (i39 - (~((((i40 ^ (-15)) + ((i40 & (-15)) << 1)) / 8) + 1))) - 1;
        int i42 = i39 >> 23;
        int i43 = (((i42 | (-1023)) << 1) - (i42 ^ (-1023))) / 512;
        int i44 = (-(i41 ^ (((i43 | 1) << 1) - (i43 ^ 1)))) + 5;
        int i45 = i44 >> 23;
        int i46 = (((i45 | (-1023)) << 1) - (i45 ^ (-1023))) / 512;
        int i47 = (i46 ^ 1) + ((i46 & 1) << 1);
        return (2129082600 / ((i44 & (-((i47 & 1) + (i47 | 1)))) * 2)) - 212908260;
    }

    public void setCloseIconStartPaddingResource(int i) throws Throwable {
        Object[] objArr;
        ChipDrawable chipDrawable;
        int i2 = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
            int defaultSize = 651 - View.getDefaultSize(0, 0);
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 45;
            byte[] bArr = $$a;
            byte b2 = (byte) (-bArr[33]);
            Object[] objArr2 = new Object[1];
            a(b2, (short) (b2 | 104), bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveSizeAndState, defaultSize, iIndexOf, -459846511, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new int[]{0, 22, 162, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new int[]{22, 15, 102, 0}, false, new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cBlue = (char) Color.blue(0);
            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 651;
            int trimmedLength = 44 - TextUtils.getTrimmedLength("");
            byte[] bArr2 = $$a;
            byte b3 = bArr2[40];
            short s = bArr2[122];
            Object[] objArr5 = new Object[1];
            a(b3, s, (byte) (s & 52), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cBlue, absoluteGravity, trimmedLength, -873460649, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 651;
                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 45;
                Object[] objArr6 = new Object[1];
                a((byte) (-$$a[33]), (short) 172, (byte) 15, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(longPressTimeout, iIndexOf2, modifierMetaStateMask, -1595579076, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[]{i ^ (i << 5)}};
            int i3 = ((int[]) objArr7[2])[0];
            int i4 = ((int[]) objArr7[0])[0];
            int i5 = ~i;
            int i6 = 1568775878 + (((~(374638313 | i5)) | (~((-5506665) | i))) * (-831)) + ((~(383575787 | i)) * (-1662)) + (((~(i5 | (-378069124))) | (~(378069123 | i)) | (~((-374638314) | i))) * 831) + 468571418;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
        } else {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), View.MeasureSpec.getMode(0) + 1610, 25 - TextUtils.lastIndexOf("", '0'), 2145681644, false, null, new Class[0]);
                }
                Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), 468571418, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char defaultSize2 = (char) View.getDefaultSize(0, 0);
                    int iLastIndexOf = 650 - TextUtils.lastIndexOf("", '0', 0);
                    int offsetBefore = TextUtils.getOffsetBefore("", 0) + 44;
                    byte[] bArr3 = $$a;
                    byte b4 = bArr3[40];
                    short s2 = bArr3[122];
                    Object[] objArr9 = new Object[1];
                    a(b4, s2, (byte) (s2 & 52), objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(defaultSize2, iLastIndexOf, offsetBefore, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 695 - ((Process.getThreadPriority(0) + 20) >> 6), 98 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63406 - (ViewConfiguration.getJumpTapTimeout() >> 16)), Color.blue(0) + 793, 84 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), Integer.TYPE, Integer.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int capsMode = TextUtils.getCapsMode("", 0, 0) + 651;
                    int scrollDefaultDelay = 44 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    Object[] objArr10 = new Object[1];
                    a((byte) (-$$a[33]), (short) 172, (byte) 15, objArr10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, capsMode, scrollDefaultDelay, -1595579076, false, (String) objArr10[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr11 = new Object[1];
                    c(new int[]{0, 22, 162, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr11);
                    Class<?> cls2 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    c(new int[]{22, 15, 102, 0}, false, new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr12);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cArgb = (char) Color.argb(0, 0, 0, 0);
                        int iGreen = 651 - Color.green(0);
                        int i9 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 44;
                        byte[] bArr4 = $$a;
                        byte b5 = bArr4[40];
                        short s3 = bArr4[122];
                        Object[] objArr13 = new Object[1];
                        a(b5, s3, (byte) (s3 & 52), objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cArgb, iGreen, i9, -873460649, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char c2 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int iAxisFromString = MotionEvent.axisFromString("") + 652;
                        int iAxisFromString2 = MotionEvent.axisFromString("") + 45;
                        byte[] bArr5 = $$a;
                        byte b6 = (byte) (-bArr5[33]);
                        Object[] objArr14 = new Object[1];
                        a(b6, (short) (b6 | 104), bArr5[7], objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c2, iAxisFromString, iAxisFromString2, -459846511, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
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
        if (((int[]) objArr[2])[0] != ((int[]) objArr[0])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[1];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw null;
        }
        int i10 = b + 27;
        int i11 = i10 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11;
        int i12 = i10 % 2;
        int i13 = ((int[]) objArr[3])[0];
        int i14 = ((int[]) objArr[2])[0];
        int i15 = ((int[]) objArr[0])[0];
        new int[1][0] = i14;
        new int[1][0] = i15;
        int i16 = ~i;
        int i17 = i13 + 1952130321 + (((~((-864463883) | i16)) | 8694794 | (~(861033072 | i16))) * (-1136)) + (((~((-864463883) | i)) | (~(861033072 | i)) | (~((-5263985) | i16))) * (-568)) + (((~(i16 | (-861033073))) | (~(864463882 | i16)) | (~((-8694795) | i))) * 568);
        int i18 = (i17 << 13) ^ i17;
        int i19 = i18 ^ (i18 >>> 17);
        int[] iArr = {i19 ^ (i19 << 5)};
        int i20 = i11 + 93;
        b = i20 % 128;
        if (i20 % 2 == 0) {
            chipDrawable = this.chipDrawable;
            int i21 = 75 / 0;
            if (chipDrawable == null) {
                return;
            }
        } else {
            chipDrawable = this.chipDrawable;
            if (chipDrawable == null) {
                return;
            }
        }
        chipDrawable.setCloseIconStartPaddingResource(i);
    }

    public void setCloseIconStartPadding(float f) {
        int i = 2 % 2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
            b = i2 % 128;
            int i3 = i2 % 2;
            chipDrawable.setCloseIconStartPadding(f);
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public float getCloseIconEndPadding() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getCloseIconEndPadding();
        }
        int i4 = i2 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return 0.0f;
        }
        obj.hashCode();
        throw null;
    }

    public void setCloseIconEndPaddingResource(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i4 = i3 + 57;
        b = i4 % 128;
        int i5 = i4 % 2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            int i6 = i3 + 55;
            b = i6 % 128;
            int i7 = i6 % 2;
            chipDrawable.setCloseIconEndPaddingResource(i);
        }
    }

    public void setCloseIconEndPadding(float f) {
        int i = 2 % 2;
        int i2 = b + 37;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            int i5 = i3 + 25;
            b = i5 % 128;
            int i6 = i5 % 2;
            chipDrawable.setCloseIconEndPadding(f);
            if (i6 == 0) {
                int i7 = 55 / 0;
            }
        }
    }

    public float getChipEndPadding() {
        ChipDrawable chipDrawable;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 21;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            chipDrawable = this.chipDrawable;
            int i3 = 24 / 0;
            if (chipDrawable == null) {
                return 0.0f;
            }
        } else {
            chipDrawable = this.chipDrawable;
            if (chipDrawable == null) {
                return 0.0f;
            }
        }
        float chipEndPadding = chipDrawable.getChipEndPadding();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 33 / 0;
        }
        return chipEndPadding;
    }

    public void setChipEndPaddingResource(int i) {
        int i2 = 2 % 2;
        int i3 = b + 125;
        int i4 = i3 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4;
        int i5 = i3 % 2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            int i6 = i4 + 95;
            b = i6 % 128;
            int i7 = i6 % 2;
            chipDrawable.setChipEndPaddingResource(i);
            int i8 = b + 53;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    public void setChipEndPadding(float f) {
        int i = 2 % 2;
        int i2 = b + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipEndPadding(f);
        }
        int i4 = b + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean shouldEnsureMinTouchTargetSize() {
        boolean z;
        int i = 2 % 2;
        int i2 = b + 21;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        if (i2 % 2 != 0) {
            z = this.ensureMinTouchTargetSize;
            int i4 = 70 / 0;
        } else {
            z = this.ensureMinTouchTargetSize;
        }
        int i5 = i3 + 103;
        b = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            this.ensureMinTouchTargetSize = z;
            ensureAccessibleTouchTarget(this.minTouchTargetSize);
        } else {
            this.ensureMinTouchTargetSize = z;
            ensureAccessibleTouchTarget(this.minTouchTargetSize);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        if (r1 <= 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r1 <= 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        r5 = r5 + 123;
        com.google.android.material.chip.Chip.b = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if ((r5 % 2) != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        r0 = 89 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if (r7.insetBackgroundDrawable == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        if (r7.insetBackgroundDrawable == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        removeBackgroundInset();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        updateBackgroundDrawable();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean ensureAccessibleTouchTarget(int r8) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.ensureAccessibleTouchTarget(int):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = b + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        this.accessibilityClassName = charSequence;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        int i = 2 % 2;
        int i2 = b + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        if (!TextUtils.isEmpty(this.accessibilityClassName)) {
            int i4 = b + 49;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            return this.accessibilityClassName;
        }
        if (isCheckable()) {
            ViewParent parent = getParent();
            return ((parent instanceof ChipGroup) && ((ChipGroup) parent).isSingleSelection()) ? RADIO_BUTTON_ACCESSIBILITY_CLASS_NAME : BUTTON_ACCESSIBILITY_CLASS_NAME;
        }
        if (!isClickable()) {
            return "android.view.View";
        }
        int i6 = b + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 11 / 0;
        }
        return BUTTON_ACCESSIBILITY_CLASS_NAME;
    }

    private void removeBackgroundInset() {
        int i = 2 % 2;
        int i2 = b + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (this.insetBackgroundDrawable != null) {
            this.insetBackgroundDrawable = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            updateBackgroundDrawable();
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
            b = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    private void insetChipBackgroundDrawable(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        this.insetBackgroundDrawable = new InsetDrawable((Drawable) this.chipDrawable, i, i2, i3, i4);
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
        b = i6 % 128;
        int i7 = i6 % 2;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new char[]{59786, 59394, 59392, 59398, 59417, 59397, 59395, 59872, 59899, 59416, 59897, 59881, 59395, 59411, 59422, 59397, 59392, 59889, 59890, 59396, 59392, 59394, 59758, 59845, 59847, 59845, 59868, 59865, 59841, 59850, 59850, 59842, 59847, 59869, 59871, 59866, 59844, 59779, 59397, 59396, 59420, 59410, 59393, 59417, 59433, 59409, 59408, 59408, 59409, 59420, 59893, 59880, 59888, 59415, 59423, 59896, 59902, 59417, 59411, 59415, 59420, 59422, 59416, 59706, 59751, 59768, 59769, 59744, 59746, 59770, 59729, 59731, 59771, 59749, 59745, 59757, 59753, 59745, 59749, 59751, 59749, 59802, 59412, 59415, 59422, 59417, 59423, 59397, 59423, 59423, 59899, 59901, 59396, 59419, 59416, 59896, 59874, 59787, 59894, 59888, 59403, 59395, 59406, 59406, 59398, 59900, 59872, 59402, 59407, 59879, 59899, 59403, 59888, 59729, 59839, 59840, 59840, 59834, 59833, 59839, 59842, 59882, 59880, 59840, 59840, 59887, 59846, 59838, 59847, 59881, 59860, 59860, 59882, 59880, 59842, 59843, 59843, 59841, 59881, 59883, 59842, 59839, 59837, 59840, 59843, 59832, 59839, 59843, 59841, 59833, 59853, 59842, 59833, 59841, 59880, 59846, 59839, 59833, 59840, 59882, 59841, 59833, 59812, 59832, 59832, 59852, 59840, 59836, 59839, 59841, 59842, 59835, 59852, 59841, 59847, 59882, 59841, 59767, 59712, 59719, 59718, 59760, 59737, 59737, 59767, 59737, 59719, 59719, 59718, 59739, 59716, 59764, 59765, 59712, 59712, 59761, 59765, 59718, 59713, 59717, 59760, 59737, 59738, 59737, 59737, 59719, 59737, 59760, 59718, 59760, 59716, 59764, 59739, 59717, 59719, 59716, 59719, 59712, 59718, 59764, 59712, 59765, 59760, 59714, 59764, 59765, 59739, 59760, 59717, 59714, 59716, 59766, 59761, 59767, 59764, 59716, 59714, 59761, 59718, 59712, 59764};
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
    private static java.lang.String $$g(byte r6, int r7, int r8) {
        /*
            int r6 = r6 * 4
            int r0 = r6 + 1
            int r8 = r8 + 99
            int r7 = r7 * 4
            int r7 = r7 + 4
            byte[] r1 = com.google.android.material.chip.Chip.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L29
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            r3 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L29:
            int r7 = -r7
            int r7 = r7 + r3
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.$$g(byte, int, int):java.lang.String");
    }
}
