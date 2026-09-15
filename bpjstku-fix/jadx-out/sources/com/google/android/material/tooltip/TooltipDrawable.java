package com.google.android.material.tooltip;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.graphics.ColorUtils;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.MarkerEdgeTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.OffsetEdgeTreatment;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class TooltipDrawable extends MaterialShapeDrawable implements TextDrawableHelper.TextDrawableDelegate {
    private static final int DEFAULT_STYLE;
    private static final int DEFAULT_THEME_ATTR;
    private static char[] TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int asInterface;
    private static boolean b;
    private int arrowSize;
    private final View.OnLayoutChangeListener attachedViewLayoutChangeListener;
    private final Context context;
    private final Rect displayFrame;
    private final Paint.FontMetrics fontMetrics;
    private float labelOpacity;
    private int layoutMargin;
    private int locationOnScreenX;
    private int minHeight;
    private int minWidth;
    private int padding;
    private boolean showMarker;
    private CharSequence text;
    private final TextDrawableHelper textDrawableHelper;
    private final float tooltipPivotX;
    private float tooltipPivotY;
    private float tooltipScaleX;
    private float tooltipScaleY;
    private static final byte[] $$c = {32, 1, 70, -122};
    private static final int $$f = 108;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {112, 19, -59, 97, 13, -1, -62, 53, 15, -5, 10, 2, -8, 11, -70, 55, -2, 20, -18, -50, 67, -14, 25, -11, -7, 10, 7, -69, 64, 3, -10, 2, 8, -61, 69, -12, 13, 5, -15, 15, 2, -69, 28, 38, -9, 6, 14, -12, -4, 18, -19, 12, -39, 34, 16, -18, 9, 4, -40, 51, -1, 2, -4, -1, -7, 14, -34, 20, 9, -4, -1, 18, 34, -11, 12, -10, 7, 0, -29, 18, 25, -11, -7, 10, 7, -45, 45, -16, 7, 7, -7, 10, 7, -17, 8, 6, -9, 6, 6, -6, -29, 38, -7, 7, -10, 20, -14, 14, -64};
    private static final int $$e = 25;
    private static final byte[] $$a = {27, -8, 5, 78, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 147;
    private static int asBinder = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f811a = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.android.material.tooltip.TooltipDrawable.$$a
            int r8 = r8 * 14
            int r8 = r8 + 84
            int r7 = r7 + 1
            int r6 = r6 * 52
            int r6 = r6 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L27
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r0[r6]
        L27:
            int r8 = r8 + r3
            int r8 = r8 + (-10)
            int r6 = r6 + 1
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tooltip.TooltipDrawable.c(short, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(byte r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 31
            int r8 = r8 + 38
            int r9 = r9 + 4
            int r7 = r7 * 15
            int r7 = 99 - r7
            byte[] r0 = com.google.android.material.tooltip.TooltipDrawable.$$d
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r9
            r4 = r2
            goto L2c
        L14:
            r3 = r2
        L15:
            int r9 = r9 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2c:
            int r9 = r9 + r7
            int r7 = r9 + (-1)
            r9 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tooltip.TooltipDrawable.e(byte, short, int, java.lang.Object[]):void");
    }

    static /* synthetic */ void access$000(TooltipDrawable tooltipDrawable, View view) {
        int i = 2 % 2;
        int i2 = f811a + 35;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        tooltipDrawable.updateLocationOnScreen(view);
        int i4 = f811a + 51;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static {
        asInterface = 1;
        TuitionPaymentFragmentbindingInflater1();
        DEFAULT_STYLE = R.style.Widget_MaterialComponents_Tooltip;
        DEFAULT_THEME_ATTR = R.attr.tooltipStyle;
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
        asInterface = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static TooltipDrawable createFromAttributes(Context context, AttributeSet attributeSet, int i, int i2) throws Throwable {
        int i3 = 2 % 2;
        TooltipDrawable tooltipDrawable = new TooltipDrawable(context, attributeSet, i, i2);
        tooltipDrawable.loadFromAttributes(attributeSet, i, i2);
        int i4 = f811a + 21;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return tooltipDrawable;
        }
        throw null;
    }

    public static TooltipDrawable createFromAttributes(Context context, AttributeSet attributeSet) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 57;
        f811a = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            createFromAttributes(context, attributeSet, DEFAULT_THEME_ATTR, DEFAULT_STYLE);
            obj.hashCode();
            throw null;
        }
        TooltipDrawable tooltipDrawableCreateFromAttributes = createFromAttributes(context, attributeSet, DEFAULT_THEME_ATTR, DEFAULT_STYLE);
        int i3 = f811a + 53;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            return tooltipDrawableCreateFromAttributes;
        }
        throw null;
    }

    public static TooltipDrawable create(Context context) throws Throwable {
        int i = 2 % 2;
        int i2 = f811a + 61;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        TooltipDrawable tooltipDrawableCreateFromAttributes = createFromAttributes(context, null, DEFAULT_THEME_ATTR, DEFAULT_STYLE);
        int i4 = f811a + 39;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 68 / 0;
        }
        return tooltipDrawableCreateFromAttributes;
    }

    private TooltipDrawable(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.fontMetrics = new Paint.FontMetrics();
        TextDrawableHelper textDrawableHelper = new TextDrawableHelper(this);
        this.textDrawableHelper = textDrawableHelper;
        this.attachedViewLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.google.android.material.tooltip.TooltipDrawable.1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                TooltipDrawable.access$000(TooltipDrawable.this, view);
            }
        };
        this.displayFrame = new Rect();
        this.tooltipScaleX = 1.0f;
        this.tooltipScaleY = 1.0f;
        this.tooltipPivotX = 0.5f;
        this.tooltipPivotY = 0.5f;
        this.labelOpacity = 1.0f;
        this.context = context;
        textDrawableHelper.getTextPaint().density = context.getResources().getDisplayMetrics().density;
        textDrawableHelper.getTextPaint().setTextAlign(Paint.Align.CENTER);
    }

    private static void d(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr2[i4]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cIndexOf = (char) (31339 - TextUtils.indexOf("", "", i3));
                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 2994;
                        int i5 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 16;
                        byte b2 = $$c[1];
                        byte b3 = (byte) (b2 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, touchSlop, i5, 1182129903, false, $$g(b3, b3, b2), new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i4++;
                    int i6 = $11 + 73;
                    $10 = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 4 % 5;
                    }
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43325 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 253 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) + 23, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
        int i8 = 33602;
        if (b) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + i8);
                    int i9 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 3085;
                    int touchSlop2 = 26 - (ViewConfiguration.getTouchSlop() >> 8);
                    byte b4 = (byte) ($$c[1] - 1);
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(longPressTimeout, i9, touchSlop2, -2146875848, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                i8 = 33602;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        int i10 = 0;
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char scrollBarFadeDuration = (char) (33602 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                    int iAlpha = 3085 - Color.alpha(0);
                    int scrollBarFadeDuration2 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 26;
                    byte b6 = (byte) ($$c[1] - 1);
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollBarFadeDuration, iAlpha, scrollBarFadeDuration2, -2146875848, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        while (true) {
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10;
            while (true) {
                if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    objArr[0] = new String(cArr6);
                    return;
                }
                int i11 = $11 + 51;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 % 1) >> getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] % i] >>> iIntValue);
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >>= 1;
                }
            }
            cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
            i10 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
        }
    }

    private void loadFromAttributes(AttributeSet attributeSet, int i, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = f811a + 67;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(this.context, attributeSet, R.styleable.Tooltip, i, i2, new int[0]);
        this.arrowSize = this.context.getResources().getDimensionPixelSize(R.dimen.mtrl_tooltip_arrowSize);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R.styleable.Tooltip_showMarker, true);
        this.showMarker = z;
        if (z) {
            int i6 = asBinder + 61;
            f811a = i6 % 128;
            if (i6 % 2 == 0) {
                setShapeAppearanceModel(getShapeAppearanceModel().toBuilder().setBottomEdge(createMarkerEdge()).build());
                int i7 = 6 / 0;
            } else {
                setShapeAppearanceModel(getShapeAppearanceModel().toBuilder().setBottomEdge(createMarkerEdge()).build());
            }
        } else {
            this.arrowSize = 0;
        }
        setText(typedArrayObtainStyledAttributes.getText(R.styleable.Tooltip_android_text));
        TextAppearance textAppearance = MaterialResources.getTextAppearance(this.context, typedArrayObtainStyledAttributes, R.styleable.Tooltip_android_textAppearance);
        if (textAppearance != null) {
            int i8 = f811a + 17;
            asBinder = i8 % 128;
            if (i8 % 2 != 0) {
                typedArrayObtainStyledAttributes.hasValue(R.styleable.Tooltip_android_textColor);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (typedArrayObtainStyledAttributes.hasValue(R.styleable.Tooltip_android_textColor)) {
                int i9 = f811a + 109;
                asBinder = i9 % 128;
                int i10 = i9 % 2;
                textAppearance.setTextColor(MaterialResources.getColorStateList(this.context, typedArrayObtainStyledAttributes, R.styleable.Tooltip_android_textColor));
            }
        }
        setTextAppearance(textAppearance);
        setFillColor(ColorStateList.valueOf(typedArrayObtainStyledAttributes.getColor(R.styleable.Tooltip_backgroundTint, MaterialColors.layer(ColorUtils.setAlphaComponent(MaterialColors.getColor(this.context, android.R.attr.colorBackground, TooltipDrawable.class.getCanonicalName()), 229), ColorUtils.setAlphaComponent(MaterialColors.getColor(this.context, R.attr.colorOnBackground, TooltipDrawable.class.getCanonicalName()), 153)))));
        setStrokeColor(ColorStateList.valueOf(MaterialColors.getColor(this.context, R.attr.colorSurface, TooltipDrawable.class.getCanonicalName())));
        this.padding = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Tooltip_android_padding, 0);
        this.minWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Tooltip_android_minWidth, 0);
        this.minHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Tooltip_android_minHeight, 0);
        this.layoutMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Tooltip_android_layout_margin, 0);
        typedArrayObtainStyledAttributes.recycle();
        int i11 = asBinder + 79;
        f811a = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 52 / 0;
        }
    }

    public CharSequence getText() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 19;
        f811a = i3 % 128;
        int i4 = i3 % 2;
        CharSequence charSequence = this.text;
        int i5 = i2 + 85;
        f811a = i5 % 128;
        int i6 = i5 % 2;
        return charSequence;
    }

    public void setTextResource(int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asBinder + 101;
        f811a = i3 % 128;
        int i4 = i3 % 2;
        setText(this.context.getResources().getString(i));
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v47, types: [boolean, int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void setText(CharSequence charSequence) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = asBinder + 17;
        f811a = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char windowTouchSlop = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 31533);
            int scrollBarSize = 921 - (ViewConfiguration.getScrollBarSize() >> 8);
            int windowTouchSlop2 = 28 - (ViewConfiguration.getWindowTouchSlop() >> 8);
            byte[] bArr = $$a;
            byte b2 = bArr[80];
            Object[] objArr3 = new Object[1];
            c(b2, b2, bArr[37], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(windowTouchSlop, scrollBarSize, windowTouchSlop2, -1048449946, false, (String) objArr3[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        d(null, null, 127 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        d(null, null, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char scrollBarFadeDuration = (char) (31533 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
            int i4 = 921 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int packedPositionChild = 27 - ExpandableListView.getPackedPositionChild(0L);
            byte b3 = $$a[80];
            byte b4 = b3;
            Object[] objArr6 = new Object[1];
            c(b4, (byte) (b4 | 52), b3, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollBarFadeDuration, i4, packedPositionChild, -778300370, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 31533);
                int iResolveOpacity = 921 - Drawable.resolveOpacity(0, 0);
                int i5 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28;
                byte[] bArr2 = $$a;
                byte b5 = bArr2[37];
                Object[] objArr7 = new Object[1];
                c(b5, (byte) (b5 | 36), bArr2[80], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, iResolveOpacity, i5, -1142834547, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
            int iMyPid = Process.myPid();
            int i6 = ~iMyPid;
            int i7 = (-1128424400) + (((~((-1477447029) | i6)) | 296632615) * 226) + (((~(i6 | (-1209011281))) | (~((-296632616) | iMyPid)) | 28196867) * (-113)) + ((~(iMyPid | (-1477447029))) * 113) + 1859914667;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            d(null, null, 127 - View.MeasureSpec.getMode(0), new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            d(null, null, (ViewConfiguration.getLongPressTimeout() >> 16) + 127, new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i10 = f811a + 107;
                asBinder = i10 % 128;
                if (i10 % 2 != 0) {
                    boolean z = applicationContext instanceof ContextWrapper;
                    obj.hashCode();
                    throw null;
                }
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr11 = new Object[1];
            d(null, null, TextUtils.lastIndexOf("", '0') + 128, new byte[]{-115, -116, -117, -120, -118, -119, -121, -102, -126, -127, -113, -121, -127, -107, -127, -103}, objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            d(null, null, 126 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), new byte[]{-116, -125, -123, -114, -105, -120, -127, -101, -118, -117, -122, -117, -126, -116, -125, -122}, objArr12);
            try {
                Object[] objArr13 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue()), 0, 1859914667};
                byte[] bArr3 = $$d;
                byte b6 = bArr3[77];
                byte b7 = bArr3[5];
                Object[] objArr14 = new Object[1];
                e(b6, (byte) (-b7), b7, objArr14);
                Class<?> cls4 = Class.forName((String) objArr14[0]);
                Object[] objArr15 = new Object[1];
                e((byte) (-bArr3[5]), bArr3[77], bArr3[20], objArr15);
                Object[] objArr16 = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 31532);
                    int i11 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 920;
                    int i12 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 27;
                    byte[] bArr4 = $$a;
                    byte b8 = bArr4[37];
                    Object[] objArr17 = new Object[1];
                    c(b8, (byte) (b8 | 36), bArr4[80], objArr17);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, i11, i12, -1142834547, false, (String) objArr17[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr16);
                try {
                    Object[] objArr18 = new Object[1];
                    d(null, null, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 126, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr18);
                    Class<?> cls5 = Class.forName((String) objArr18[0]);
                    Object[] objArr19 = new Object[1];
                    d(null, null, (ViewConfiguration.getTouchSlop() >> 8) + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr19);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char jumpTapTimeout = (char) (31533 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 922;
                        int i13 = 28 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        byte b9 = $$a[80];
                        byte b10 = b9;
                        Object[] objArr20 = new Object[1];
                        c(b10, (byte) (b10 | 52), b9, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(jumpTapTimeout, iLastIndexOf, i13, -778300370, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char mirror = (char) (31581 - AndroidCharacter.getMirror('0'));
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 922;
                        int i14 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 27;
                        byte[] bArr5 = $$a;
                        byte b11 = bArr5[80];
                        Object[] objArr21 = new Object[1];
                        c(b11, b11, bArr5[37], objArr21);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mirror, iIndexOf, i14, -1048449946, false, (String) objArr21[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr16;
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
        int i15 = ((int[]) objArr[1])[0];
        int i16 = ((int[]) objArr[3])[0];
        if (i16 == i15) {
            int i17 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i18 = ~iIdentityHashCode;
            int i19 = i17 + (-209051281) + (((~(922627479 | i18)) | 851452164) * 220) + (((~(i18 | 852501780)) | 921577863) * (-440)) + ((iIdentityHashCode | 922627479) * 220);
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr2[0])[0] = i21 ^ (i21 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i22 = f811a + 37;
                asBinder = i22 % 128;
                int i23 = i22 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i16 / (((i16 - 1) * i16) % 2), 0).show();
            int i24 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i25 = ~iIdentityHashCode2;
            int i26 = i24 + 149746270 + (((~((-1012603721) | i25)) | 761475923) * 519) + (((~(i25 | (-270010377))) | (~(1031486299 | iIdentityHashCode2))) * (-519)) + (((~(iIdentityHashCode2 | 761475923)) | 1012603720) * 519);
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr2[0])[0] = i28 ^ (i28 << 5);
        }
        if (TextUtils.equals(this.text, charSequence)) {
            return;
        }
        this.text = charSequence;
        TextDrawableHelper textDrawableHelper = this.textDrawableHelper;
        int i29 = ((int[]) objArr2[0])[0];
        int i30 = i29 * i29;
        int i31 = -(592304919 * i29);
        int i32 = (i30 ^ i31) + ((i30 & i31) << 1);
        int i33 = -(i29 * 1241352887);
        int i34 = (((i32 | i33) << 1) - (i33 ^ i32)) - 1899230095;
        int i35 = i34 >> 18;
        int i36 = (((i35 | (-32767)) << 1) - (i35 ^ (-32767))) / 16384;
        int i37 = (i36 ^ 1) + ((i36 & 1) << 1);
        int i38 = ((i34 | i37) << 1) - (i37 ^ i34);
        int i39 = i34 >> 29;
        int i40 = ((i39 & (-15)) + (i39 | (-15))) / 8;
        int i41 = -(((i40 & 1) + (i40 | 1)) ^ i38);
        int i42 = (i41 ^ 3) + ((i41 & 3) << 1);
        int i43 = ((i42 >> 20) - 8191) / 4096;
        textDrawableHelper.setTextWidthDirty(2712 / (((-(((i43 & 1) + (i43 | 1)) + 1)) & i42) * TypedValues.Custom.TYPE_BOOLEAN));
        invalidateSelf();
    }

    public TextAppearance getTextAppearance() {
        int i = 2 % 2;
        int i2 = f811a + 29;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            this.textDrawableHelper.getTextAppearance();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TextAppearance textAppearance = this.textDrawableHelper.getTextAppearance();
        int i3 = f811a + 99;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return textAppearance;
    }

    public void setTextAppearanceResource(int i) {
        int i2 = 2 % 2;
        setTextAppearance(new TextAppearance(this.context, i));
        int i3 = f811a + 59;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
    }

    public void setTextAppearance(TextAppearance textAppearance) {
        int i = 2 % 2;
        int i2 = f811a + 59;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        this.textDrawableHelper.setTextAppearance(textAppearance, this.context);
        int i4 = asBinder + 75;
        f811a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 39 / 0;
        }
    }

    public int getMinWidth() {
        int i = 2 % 2;
        int i2 = asBinder + 83;
        f811a = i2 % 128;
        if (i2 % 2 != 0) {
            return this.minWidth;
        }
        throw null;
    }

    public void setMinWidth(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 87;
        f811a = i3 % 128;
        int i4 = i3 % 2;
        this.minWidth = i;
        invalidateSelf();
        int i5 = f811a + 97;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    public int getMinHeight() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 121;
        f811a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.minHeight;
        int i6 = i2 + 1;
        f811a = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public void setMinHeight(int i) {
        int i2 = 2 % 2;
        int i3 = f811a + 121;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        this.minHeight = i;
        invalidateSelf();
        int i5 = f811a + 39;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 86 / 0;
        }
    }

    public int getTextPadding() {
        int i;
        int i2 = 2 % 2;
        int i3 = asBinder;
        int i4 = i3 + 81;
        f811a = i4 % 128;
        if (i4 % 2 == 0) {
            i = this.padding;
            int i5 = 26 / 0;
        } else {
            i = this.padding;
        }
        int i6 = i3 + 1;
        f811a = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public void setTextPadding(int i) {
        int i2 = 2 % 2;
        int i3 = f811a + 59;
        asBinder = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.padding = i;
            invalidateSelf();
            obj.hashCode();
            throw null;
        }
        this.padding = i;
        invalidateSelf();
        int i4 = f811a + 65;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public int getLayoutMargin() {
        int i = 2 % 2;
        int i2 = f811a;
        int i3 = i2 + 77;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.layoutMargin;
        int i6 = i2 + 43;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 53 / 0;
        }
        return i5;
    }

    public void setLayoutMargin(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 29;
        f811a = i3 % 128;
        if (i3 % 2 != 0) {
            this.layoutMargin = i;
            invalidateSelf();
        } else {
            this.layoutMargin = i;
            invalidateSelf();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public void setRevealFraction(float f) {
        int i = 2 % 2;
        int i2 = asBinder + 21;
        f811a = i2 % 128;
        int i3 = i2 % 2;
        this.tooltipPivotY = 1.2f;
        this.tooltipScaleX = f;
        this.tooltipScaleY = f;
        this.labelOpacity = AnimationUtils.lerp(0.0f, 1.0f, 0.19f, 1.0f, f);
        invalidateSelf();
        int i4 = f811a + 55;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setRelativeToView(View view) {
        int i = 2 % 2;
        int i2 = f811a + 89;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (view == null) {
            return;
        }
        updateLocationOnScreen(view);
        view.addOnLayoutChangeListener(this.attachedViewLayoutChangeListener);
        int i4 = asBinder + 87;
        f811a = i4 % 128;
        int i5 = i4 % 2;
    }

    public void detachView(View view) {
        int i = 2 % 2;
        int i2 = asBinder + 21;
        f811a = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (view == null) {
            return;
        }
        view.removeOnLayoutChangeListener(this.attachedViewLayoutChangeListener);
        int i3 = f811a + 115;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i = 2 % 2;
        int i2 = f811a + 5;
        asBinder = i2 % 128;
        return (int) Math.max(i2 % 2 != 0 ? this.padding * 5 * getTextWidth() : (this.padding * 2) + getTextWidth(), this.minWidth);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i = 2 % 2;
        int i2 = asBinder + 87;
        f811a = i2 % 128;
        int i3 = i2 % 2;
        int iMax = (int) Math.max(this.textDrawableHelper.getTextPaint().getTextSize(), this.minHeight);
        int i4 = f811a + 35;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
        return iMax;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i = 2 % 2;
        int i2 = asBinder + 39;
        f811a = i2 % 128;
        int i3 = i2 % 2;
        canvas.save();
        float fCalculatePointerOffset = calculatePointerOffset();
        float f = (float) (-((((double) this.arrowSize) * Math.sqrt(2.0d)) - ((double) this.arrowSize)));
        canvas.scale(this.tooltipScaleX, this.tooltipScaleY, getBounds().left + (getBounds().width() * 0.5f), getBounds().top + (getBounds().height() * this.tooltipPivotY));
        canvas.translate(fCalculatePointerOffset, f);
        super.draw(canvas);
        drawText(canvas);
        canvas.restore();
        int i4 = asBinder + 89;
        f811a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 24 / 0;
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        int i = 2 % 2;
        int i2 = f811a + 99;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onBoundsChange(rect);
        if (this.showMarker) {
            int i4 = f811a + 97;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                setShapeAppearanceModel(getShapeAppearanceModel().toBuilder().setBottomEdge(createMarkerEdge()).build());
            } else {
                setShapeAppearanceModel(getShapeAppearanceModel().toBuilder().setBottomEdge(createMarkerEdge()).build());
                int i5 = 59 / 0;
            }
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(int[] iArr) {
        int i = 2 % 2;
        int i2 = f811a + 39;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnStateChange = super.onStateChange(iArr);
        int i4 = f811a + 17;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return zOnStateChange;
    }

    @Override // com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public void onTextSizeChange() {
        int i = 2 % 2;
        int i2 = f811a + 7;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        invalidateSelf();
        int i4 = f811a + 27;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    private void updateLocationOnScreen(View view) {
        int i = 2 % 2;
        int i2 = f811a + 19;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int[] iArr = new int[4];
            view.getLocationOnScreen(iArr);
            this.locationOnScreenX = iArr[0];
        } else {
            int[] iArr2 = new int[2];
            view.getLocationOnScreen(iArr2);
            this.locationOnScreenX = iArr2[0];
        }
        view.getWindowVisibleDisplayFrame(this.displayFrame);
    }

    private float calculatePointerOffset() {
        int i;
        int i2 = 2 % 2;
        int i3 = asBinder + 19;
        f811a = i3 % 128;
        int i4 = i3 % 2;
        if (((this.displayFrame.right - getBounds().right) - this.locationOnScreenX) - this.layoutMargin < 0) {
            i = ((this.displayFrame.right - getBounds().right) - this.locationOnScreenX) - this.layoutMargin;
        } else {
            if (((this.displayFrame.left - getBounds().left) - this.locationOnScreenX) + this.layoutMargin <= 0) {
                int i5 = asBinder + 23;
                f811a = i5 % 128;
                int i6 = i5 % 2;
                return 0.0f;
            }
            int i7 = f811a + 11;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            i = ((this.displayFrame.left - getBounds().left) - this.locationOnScreenX) + this.layoutMargin;
        }
        return i;
    }

    private EdgeTreatment createMarkerEdge() {
        int i = 2 % 2;
        float f = -calculatePointerOffset();
        float fWidth = ((float) (((double) getBounds().width()) - (((double) this.arrowSize) * Math.sqrt(2.0d)))) / 2.0f;
        OffsetEdgeTreatment offsetEdgeTreatment = new OffsetEdgeTreatment(new MarkerEdgeTreatment(this.arrowSize), Math.min(Math.max(f, -fWidth), fWidth));
        int i2 = f811a + 21;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return offsetEdgeTreatment;
    }

    private void drawText(Canvas canvas) {
        int i = 2 % 2;
        if (this.text == null) {
            int i2 = f811a + 21;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Rect bounds = getBounds();
        int iCalculateTextOriginAndAlignment = (int) calculateTextOriginAndAlignment(bounds);
        if (this.textDrawableHelper.getTextAppearance() != null) {
            int i3 = f811a + 85;
            asBinder = i3 % 128;
            if (i3 % 2 != 0) {
                this.textDrawableHelper.getTextPaint().drawableState = getState();
                this.textDrawableHelper.updateTextPaintDrawState(this.context);
                this.textDrawableHelper.getTextPaint().setAlpha((int) (this.labelOpacity % 255.0f));
            } else {
                this.textDrawableHelper.getTextPaint().drawableState = getState();
                this.textDrawableHelper.updateTextPaintDrawState(this.context);
                this.textDrawableHelper.getTextPaint().setAlpha((int) (this.labelOpacity * 255.0f));
            }
        }
        CharSequence charSequence = this.text;
        canvas.drawText(charSequence, 0, charSequence.length(), bounds.centerX(), iCalculateTextOriginAndAlignment, this.textDrawableHelper.getTextPaint());
    }

    private float getTextWidth() {
        int i = 2 % 2;
        int i2 = asBinder + 7;
        int i3 = i2 % 128;
        f811a = i3;
        int i4 = i2 % 2;
        CharSequence charSequence = this.text;
        if (charSequence != null) {
            return this.textDrawableHelper.getTextWidth(charSequence.toString());
        }
        int i5 = i3 + 119;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return 0.0f;
    }

    private float calculateTextOriginAndAlignment(Rect rect) {
        int i = 2 % 2;
        int i2 = asBinder + 117;
        f811a = i2 % 128;
        int i3 = i2 % 2;
        float fCenterY = rect.centerY() - calculateTextCenterFromBaseline();
        int i4 = asBinder + 7;
        f811a = i4 % 128;
        int i5 = i4 % 2;
        return fCenterY;
    }

    private float calculateTextCenterFromBaseline() {
        float f;
        int i = 2 % 2;
        int i2 = f811a + 19;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            this.textDrawableHelper.getTextPaint().getFontMetrics(this.fontMetrics);
            f = (this.fontMetrics.descent / this.fontMetrics.ascent) - 2.0f;
        } else {
            this.textDrawableHelper.getTextPaint().getFontMetrics(this.fontMetrics);
            f = (this.fontMetrics.descent + this.fontMetrics.ascent) / 2.0f;
        }
        int i3 = asBinder + 31;
        f811a = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 50 / 0;
        }
        return f;
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        TuitionPaymentFragmentbindingInflater1 = new char[]{47205, 47256, 47202, 47252, 47255, 47261, 47192, 47251, 47219, 47245, 47250, 47201, 47257, 47171, 47258, 47203, 47259, 47254, 47220, 47173, 47248, 47218, 47262, 47249, 47260, 47263, 47230};
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 2047719430;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
        b = true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, short r7, int r8) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 4
            int r8 = r8 + 67
            int r7 = r7 * 2
            int r0 = r7 + 1
            byte[] r1 = com.google.android.material.tooltip.TooltipDrawable.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L21:
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = r6 + r3
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tooltip.TooltipDrawable.$$g(byte, short, int):java.lang.String");
    }
}
