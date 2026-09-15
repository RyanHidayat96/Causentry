package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ImageFormat;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.core.internal.view.SupportMenu;
import androidx.core.text.BidiFormatter;
import androidx.core.view.ViewCompat;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
public class ChipDrawable extends MaterialShapeDrawable implements TintAwareDrawable, Drawable.Callback, TextDrawableHelper.TextDrawableDelegate {
    private static final boolean DEBUG = false;
    private static final int[] DEFAULT_STATE;
    private static final int MAX_CHIP_ICON_HEIGHT = 24;
    private static final String NAMESPACE_APP = "http://schemas.android.com/apk/res-auto";
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static char b;
    private static final ShapeDrawable closeIconRippleMask;
    private int alpha;
    private boolean checkable;
    private Drawable checkedIcon;
    private ColorStateList checkedIconTint;
    private boolean checkedIconVisible;
    private ColorStateList chipBackgroundColor;
    private float chipCornerRadius;
    private float chipEndPadding;
    private Drawable chipIcon;
    private float chipIconSize;
    private ColorStateList chipIconTint;
    private boolean chipIconVisible;
    private float chipMinHeight;
    private final Paint chipPaint;
    private float chipStartPadding;
    private ColorStateList chipStrokeColor;
    private float chipStrokeWidth;
    private ColorStateList chipSurfaceColor;
    private Drawable closeIcon;
    private CharSequence closeIconContentDescription;
    private float closeIconEndPadding;
    private Drawable closeIconRipple;
    private float closeIconSize;
    private float closeIconStartPadding;
    private int[] closeIconStateSet;
    private ColorStateList closeIconTint;
    private boolean closeIconVisible;
    private ColorFilter colorFilter;
    private ColorStateList compatRippleColor;
    private final Context context;
    private boolean currentChecked;
    private int currentChipBackgroundColor;
    private int currentChipStrokeColor;
    private int currentChipSurfaceColor;
    private int currentCompatRippleColor;
    private int currentCompositeSurfaceBackgroundColor;
    private int currentTextColor;
    private int currentTint;
    private final Paint debugPaint;
    private WeakReference<Delegate> delegate;
    private final Paint.FontMetrics fontMetrics;
    private boolean hasChipIconTint;
    private MotionSpec hideMotionSpec;
    private float iconEndPadding;
    private float iconStartPadding;
    private boolean isShapeThemingEnabled;
    private int maxWidth;
    private final PointF pointF;
    private final RectF rectF;
    private ColorStateList rippleColor;
    private final Path shapePath;
    private boolean shouldDrawText;
    private MotionSpec showMotionSpec;
    private CharSequence text;
    private final TextDrawableHelper textDrawableHelper;
    private float textEndPadding;
    private float textStartPadding;
    private ColorStateList tint;
    private PorterDuffColorFilter tintFilter;
    private PorterDuff.Mode tintMode;
    private TextUtils.TruncateAt truncateAt;
    private boolean useCompatRipple;
    private static final byte[] $$c = {43, 23, 22, -14};
    private static final int $$f = 99;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {99, -43, -44, -62, -17, 6, -18, -1, 2, 1, 50, -73, -6, 1, -4, -3, -7, -6, 66, -76, 62, 2, -67, 4, -3, -9, 4, 47, -40, -19, -23, 7, -9, 3, 32, -48, -2, -7, 11, -23, 76, -17, -37, 8, -15, 7, -10, -3, 26, -21, -28, 8, 4, -13, -10, 42, -48, 13, -10, -10, 4, -13, -10, -3, -1, 7, -2, -10, 4, -15, -1, -9, -2, -1, -9, 5, -3, -22, 9, 0, -22, 38, -38, 7, -5, -11, 4, -5, -5, 1, -24, 5, -12, 62, -16, -2, 59, -61, -12, -4, 4, -9, 3, 51, -60, -7, -13, 9, -1, -3, -22, 10, 51, -57, -19, 13, -22, 7, -8, -17, 1, 7, 2, -20, 65, -63, -9, -10, 11, -17, 0, 9, -15, 58, -68, 5, -19, -7, 4, -7, 3, 57, -30, -48, -4, 0, 37, -34, -19, 30, -23, -16, -8, 12, -18, -5};
    private static final int $$e = DerHeader.TAG_CLASS_PRIVATE;
    private static final byte[] $$a = {22, 102, 43, -6, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 183;
    private static int asInterface = 0;
    private static int d = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;

    public interface Delegate {
        void onChipDrawableSizeChange();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.android.material.chip.ChipDrawable.$$a
            int r6 = r6 + 4
            int r8 = r8 * 14
            int r8 = 98 - r8
            int r1 = 53 - r7
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L2f
        L14:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L18:
            byte r4 = (byte) r6
            int r8 = r8 + 1
            r1[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2f:
            int r6 = r6 + r8
            int r6 = r6 + (-10)
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipDrawable.a(byte, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(byte r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 1
            byte[] r0 = com.google.android.material.chip.ChipDrawable.$$d
            int r8 = r8 + 84
            int r9 = r9 * 2
            int r9 = 155 - r9
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r4 = r2
            r9 = r7
            goto L2d
        L15:
            r3 = r2
        L16:
            int r9 = r9 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2d:
            int r8 = -r8
            int r9 = r9 + r8
            int r8 = r9 + (-4)
            r9 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipDrawable.e(byte, byte, int, java.lang.Object[]):void");
    }

    private static void c(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        int i4 = $11 + 23;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i6 = $11 + 93;
            $10 = i6 % 128;
            int i7 = i6 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 8328), View.resolveSize(0, 0) + 1235, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 34, -653973969, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) KeyEvent.normalizeMetaState(0), 2764 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 14, 1504416861, false, $$g(b4, b5, (byte) (b5 - 3)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43373 - AndroidCharacter.getMirror('0')), 253 - (ViewConfiguration.getEdgeSlop() >> 16), TextUtils.lastIndexOf("", '0', 0) + 23, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = (byte) (b6 + 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 65199), (ViewConfiguration.getFadingEdgeLength() >> 16) + 2891, 16 - TextUtils.indexOf((CharSequence) "", '0', 0), 2012627446, false, $$g(b6, b7, (byte) (-b7)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = sessionProcessor.b;
                            cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) ((((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ (-6377398940819159759L)))) ^ (((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-6377398940819159759L)))) ^ ((long) ((char) (((long) b) ^ (-6377398940819159759L)))));
                            sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                            i2 = 2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr6);
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        DEFAULT_STATE = new int[]{R.attr.state_enabled};
        closeIconRippleMask = new ShapeDrawable(new OvalShape());
        int i = TuitionPaymentFragmentbindingInflater1 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
        int i2 = i % 2;
    }

    public static ChipDrawable createFromAttributes(Context context, AttributeSet attributeSet, int i, int i2) {
        int i3 = 2 % 2;
        ChipDrawable chipDrawable = new ChipDrawable(context, attributeSet, i, i2);
        chipDrawable.loadFromAttributes(attributeSet, i, i2);
        int i4 = d + 111;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return chipDrawable;
        }
        throw null;
    }

    public static ChipDrawable createFromResource(Context context, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 67;
        d = i3 % 128;
        int i4 = i3 % 2;
        AttributeSet drawableXml = DrawableUtils.parseDrawableXml(context, i, "chip");
        int styleAttribute = drawableXml.getStyleAttribute();
        if (styleAttribute == 0) {
            int i5 = asInterface + 5;
            d = i5 % 128;
            if (i5 % 2 == 0) {
                styleAttribute = com.google.android.material.R.style.Widget_MaterialComponents_Chip_Entry;
                int i6 = 13 / 0;
            } else {
                styleAttribute = com.google.android.material.R.style.Widget_MaterialComponents_Chip_Entry;
            }
        }
        ChipDrawable chipDrawableCreateFromAttributes = createFromAttributes(context, drawableXml, com.google.android.material.R.attr.chipStandaloneStyle, styleAttribute);
        int i7 = d + 61;
        asInterface = i7 % 128;
        if (i7 % 2 == 0) {
            return chipDrawableCreateFromAttributes;
        }
        throw null;
    }

    private ChipDrawable(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.chipCornerRadius = -1.0f;
        this.chipPaint = new Paint(1);
        this.fontMetrics = new Paint.FontMetrics();
        this.rectF = new RectF();
        this.pointF = new PointF();
        this.shapePath = new Path();
        this.alpha = 255;
        this.tintMode = PorterDuff.Mode.SRC_IN;
        this.delegate = new WeakReference<>(null);
        initializeElevationOverlay(context);
        this.context = context;
        TextDrawableHelper textDrawableHelper = new TextDrawableHelper(this);
        this.textDrawableHelper = textDrawableHelper;
        this.text = "";
        textDrawableHelper.getTextPaint().density = context.getResources().getDisplayMetrics().density;
        this.debugPaint = null;
        int[] iArr = DEFAULT_STATE;
        setState(iArr);
        setCloseIconState(iArr);
        this.shouldDrawText = true;
        if (RippleUtils.USE_FRAMEWORK_RIPPLE) {
            closeIconRippleMask.setTint(-1);
            int i3 = d + 103;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 % 2;
            }
        }
        int i5 = d + 15;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
    }

    private void loadFromAttributes(AttributeSet attributeSet, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = d + 77;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(this.context, attributeSet, com.google.android.material.R.styleable.Chip, i, i2, new int[0]);
        this.isShapeThemingEnabled = typedArrayObtainStyledAttributes.hasValue(com.google.android.material.R.styleable.Chip_shapeAppearance);
        setChipSurfaceColor(MaterialResources.getColorStateList(this.context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_chipSurfaceColor));
        setChipBackgroundColor(MaterialResources.getColorStateList(this.context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_chipBackgroundColor));
        setChipMinHeight(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_chipMinHeight, 0.0f));
        if (typedArrayObtainStyledAttributes.hasValue(com.google.android.material.R.styleable.Chip_chipCornerRadius)) {
            int i6 = d + 29;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            setChipCornerRadius(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_chipCornerRadius, 0.0f));
        }
        setChipStrokeColor(MaterialResources.getColorStateList(this.context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_chipStrokeColor));
        setChipStrokeWidth(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_chipStrokeWidth, 0.0f));
        setRippleColor(MaterialResources.getColorStateList(this.context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_rippleColor));
        setText(typedArrayObtainStyledAttributes.getText(com.google.android.material.R.styleable.Chip_android_text));
        TextAppearance textAppearance = MaterialResources.getTextAppearance(this.context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_android_textAppearance);
        textAppearance.setTextSize(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_android_textSize, textAppearance.getTextSize()));
        setTextAppearance(textAppearance);
        int i8 = typedArrayObtainStyledAttributes.getInt(com.google.android.material.R.styleable.Chip_android_ellipsize, 0);
        if (i8 != 1) {
            int i9 = d + 37;
            int i10 = i9 % 128;
            asInterface = i10;
            int i11 = i9 % 2;
            if (i8 != 2) {
                int i12 = i10 + 67;
                int i13 = i12 % 128;
                d = i13;
                if (i12 % 2 != 0 ? i8 == 3 : i8 == 4) {
                    int i14 = i13 + 17;
                    asInterface = i14 % 128;
                    int i15 = i14 % 2;
                    setEllipsize(TextUtils.TruncateAt.END);
                }
            } else {
                setEllipsize(TextUtils.TruncateAt.MIDDLE);
                int i16 = d + 101;
                asInterface = i16 % 128;
                int i17 = i16 % 2;
            }
        } else {
            setEllipsize(TextUtils.TruncateAt.START);
        }
        setChipIconVisible(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_chipIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue(NAMESPACE_APP, "chipIconEnabled") != null && attributeSet.getAttributeValue(NAMESPACE_APP, "chipIconVisible") == null) {
            int i18 = d + 75;
            asInterface = i18 % 128;
            int i19 = i18 % 2;
            setChipIconVisible(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_chipIconEnabled, false));
        }
        setChipIcon(MaterialResources.getDrawable(this.context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_chipIcon));
        if (typedArrayObtainStyledAttributes.hasValue(com.google.android.material.R.styleable.Chip_chipIconTint)) {
            setChipIconTint(MaterialResources.getColorStateList(this.context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_chipIconTint));
        }
        setChipIconSize(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_chipIconSize, -1.0f));
        setCloseIconVisible(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_closeIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue(NAMESPACE_APP, "closeIconEnabled") != null) {
            int i20 = asInterface + 83;
            d = i20 % 128;
            int i21 = i20 % 2;
            if (attributeSet.getAttributeValue(NAMESPACE_APP, "closeIconVisible") == null) {
                setCloseIconVisible(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_closeIconEnabled, false));
            }
        }
        setCloseIcon(MaterialResources.getDrawable(this.context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_closeIcon));
        setCloseIconTint(MaterialResources.getColorStateList(this.context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_closeIconTint));
        setCloseIconSize(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_closeIconSize, 0.0f));
        setCheckable(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_android_checkable, false));
        setCheckedIconVisible(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_checkedIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue(NAMESPACE_APP, "checkedIconEnabled") != null && attributeSet.getAttributeValue(NAMESPACE_APP, "checkedIconVisible") == null) {
            setCheckedIconVisible(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_checkedIconEnabled, false));
        }
        setCheckedIcon(MaterialResources.getDrawable(this.context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_checkedIcon));
        if (typedArrayObtainStyledAttributes.hasValue(com.google.android.material.R.styleable.Chip_checkedIconTint)) {
            int i22 = asInterface + 109;
            d = i22 % 128;
            int i23 = i22 % 2;
            setCheckedIconTint(MaterialResources.getColorStateList(this.context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_checkedIconTint));
        }
        setShowMotionSpec(MotionSpec.createFromAttribute(this.context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_showMotionSpec));
        setHideMotionSpec(MotionSpec.createFromAttribute(this.context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_hideMotionSpec));
        setChipStartPadding(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_chipStartPadding, 0.0f));
        setIconStartPadding(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_iconStartPadding, 0.0f));
        setIconEndPadding(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_iconEndPadding, 0.0f));
        setTextStartPadding(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_textStartPadding, 0.0f));
        setTextEndPadding(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_textEndPadding, 0.0f));
        setCloseIconStartPadding(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_closeIconStartPadding, 0.0f));
        setCloseIconEndPadding(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_closeIconEndPadding, 0.0f));
        setChipEndPadding(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_chipEndPadding, 0.0f));
        setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.Chip_android_maxWidth, Integer.MAX_VALUE));
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setUseCompatRipple(boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 91;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        if (this.useCompatRipple != z) {
            int i5 = i3 + 109;
            asInterface = i5 % 128;
            if (i5 % 2 != 0) {
                this.useCompatRipple = z;
                updateCompatRippleColor();
                onStateChange(getState());
                throw null;
            }
            this.useCompatRipple = z;
            updateCompatRippleColor();
            onStateChange(getState());
        }
        int i6 = d + 89;
        asInterface = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public boolean getUseCompatRipple() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 97;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.useCompatRipple;
        int i5 = i2 + 111;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public void setDelegate(Delegate delegate) {
        int i = 2 % 2;
        this.delegate = new WeakReference<>(delegate);
        int i2 = d + 63;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected void onSizeChange() {
        int i = 2 % 2;
        int i2 = asInterface + 55;
        d = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.delegate.get();
            obj.hashCode();
            throw null;
        }
        Delegate delegate = this.delegate.get();
        if (delegate != null) {
            delegate.onChipDrawableSizeChange();
        }
        int i3 = asInterface + 53;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public void getChipTouchBounds(RectF rectF) {
        int i = 2 % 2;
        int i2 = d + 59;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        calculateChipTouchBounds(getBounds(), rectF);
        int i4 = d + 103;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public void getCloseIconTouchBounds(RectF rectF) {
        int i = 2 % 2;
        int i2 = d + 47;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            calculateCloseIconTouchBounds(getBounds(), rectF);
            throw null;
        }
        calculateCloseIconTouchBounds(getBounds(), rectF);
        int i3 = asInterface + 45;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 69 / 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i = 2 % 2;
        int i2 = asInterface + 119;
        d = i2 % 128;
        int i3 = i2 % 2;
        float f = this.chipStartPadding;
        float fCalculateChipIconWidth = calculateChipIconWidth();
        float f2 = this.textStartPadding;
        float textWidth = this.textDrawableHelper.getTextWidth(getText().toString());
        float f3 = this.textEndPadding;
        int iMin = Math.min(Math.round(f + fCalculateChipIconWidth + f2 + textWidth + f3 + calculateCloseIconWidth() + this.chipEndPadding), this.maxWidth);
        int i4 = d + 17;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return iMin;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i = 2 % 2;
        int i2 = asInterface + 57;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        int i5 = (int) this.chipMinHeight;
        int i6 = i3 + 117;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    private boolean showsChipIcon() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 73;
        int i4 = i3 % 128;
        asInterface = i4;
        int i5 = i3 % 2;
        if (!this.chipIconVisible || this.chipIcon == null) {
            int i6 = i2 + 91;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = i4 + 37;
        d = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    private boolean showsCheckedIcon() {
        int i = 2 % 2;
        if (!this.checkedIconVisible || this.checkedIcon == null) {
            return false;
        }
        int i2 = asInterface + 55;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        if (!this.currentChecked) {
            return false;
        }
        int i5 = i3 + 49;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (r5.closeIcon != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        r3 = r3 + 109;
        r1 = r3 % 128;
        com.google.android.material.chip.ChipDrawable.asInterface = r1;
        r3 = r3 % 2;
        r1 = r1 + 41;
        com.google.android.material.chip.ChipDrawable.d = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if ((r1 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        r0 = null;
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if (r5.closeIcon != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean showsCloseIcon() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r5.closeIconVisible
            r2 = 0
            if (r1 == 0) goto L36
            int r1 = com.google.android.material.chip.ChipDrawable.asInterface
            int r1 = r1 + 29
            int r3 = r1 % 128
            com.google.android.material.chip.ChipDrawable.d = r3
            int r1 = r1 % r0
            if (r1 != 0) goto L1b
            android.graphics.drawable.Drawable r1 = r5.closeIcon
            r4 = 97
            int r4 = r4 / r2
            if (r1 == 0) goto L36
            goto L1f
        L1b:
            android.graphics.drawable.Drawable r1 = r5.closeIcon
            if (r1 == 0) goto L36
        L1f:
            int r3 = r3 + 109
            int r1 = r3 % 128
            com.google.android.material.chip.ChipDrawable.asInterface = r1
            int r3 = r3 % r0
            int r1 = r1 + 41
            int r2 = r1 % 128
            com.google.android.material.chip.ChipDrawable.d = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L31
            r0 = 1
            return r0
        L31:
            r0 = 0
            r0.hashCode()
            throw r0
        L36:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipDrawable.showsCloseIcon():boolean");
    }

    private boolean canShowCheckedIcon() {
        int i = 2 % 2;
        int i2 = asInterface + 25;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        if (!this.checkedIconVisible) {
            return false;
        }
        int i5 = i3 + 53;
        int i6 = i5 % 128;
        asInterface = i6;
        int i7 = i5 % 2;
        if (this.checkedIcon == null) {
            return false;
        }
        int i8 = i6 + 3;
        int i9 = i8 % 128;
        d = i9;
        int i10 = i8 % 2;
        if (!this.checkable) {
            return false;
        }
        int i11 = i9 + 41;
        asInterface = i11 % 128;
        if (i11 % 2 == 0) {
            return true;
        }
        throw null;
    }

    float calculateChipIconWidth() {
        int i = 2 % 2;
        if (!showsChipIcon()) {
            int i2 = d + 65;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            if (!showsCheckedIcon()) {
                int i4 = d + 103;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                return 0.0f;
            }
        }
        float currentChipIconWidth = this.iconStartPadding + getCurrentChipIconWidth() + this.iconEndPadding;
        int i6 = d + 89;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return currentChipIconWidth;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if (r1 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        if (r1 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
    
        return r1.getIntrinsicWidth();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private float getCurrentChipIconWidth() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.material.chip.ChipDrawable.asInterface
            int r1 = r1 + 107
            int r2 = r1 % 128
            com.google.android.material.chip.ChipDrawable.d = r2
            int r1 = r1 % r0
            boolean r1 = r5.currentChecked
            if (r1 == 0) goto L1e
            int r1 = r2 + 47
            int r3 = r1 % 128
            com.google.android.material.chip.ChipDrawable.asInterface = r3
            int r1 = r1 % r0
            if (r1 != 0) goto L1c
            android.graphics.drawable.Drawable r1 = r5.checkedIcon
            goto L20
        L1c:
            r0 = 0
            throw r0
        L1e:
            android.graphics.drawable.Drawable r1 = r5.chipIcon
        L20:
            float r3 = r5.chipIconSize
            r4 = 0
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 > 0) goto L3f
            int r2 = r2 + 43
            int r4 = r2 % 128
            com.google.android.material.chip.ChipDrawable.asInterface = r4
            int r2 = r2 % r0
            if (r2 == 0) goto L37
            r0 = 21
            int r0 = r0 / 0
            if (r1 == 0) goto L3f
            goto L39
        L37:
            if (r1 == 0) goto L3f
        L39:
            int r0 = r1.getIntrinsicWidth()
            float r0 = (float) r0
            return r0
        L3f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipDrawable.getCurrentChipIconWidth():float");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x027c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0286  */
    private float getCurrentChipIconHeight() throws Throwable {
        Drawable drawable;
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        Object obj = null;
        if (this.currentChecked) {
            int i2 = d + 77;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            drawable = this.checkedIcon;
        } else {
            drawable = this.chipIcon;
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 31533);
            int iBlue = 921 - Color.blue(0);
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 28;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr3 = new Object[1];
            a(b2, (byte) (b2 & 52), bArr[80], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(doubleTapTimeout, iBlue, iCombineMeasuredStates, -1048449946, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(new char[]{0, 0, 0, 0}, new char[]{63892, 53577, 51659, 34831}, (char) View.MeasureSpec.getMode(0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, new char[]{18100, 46893, 3250, 49544, 53294, 33428, 11116, 22707, 57628, 13160, 64698, 10146, 63029, 32523, 50702, 33718, 6546, 52767, 37234, 13909, 2786, 8570}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(new char[]{0, 0, 0, 0}, new char[]{33389, 29451, 19419, 48229}, (char) (25931 - KeyEvent.normalizeMetaState(0)), (-613217406) + TextUtils.getCapsMode("", 0, 0), new char[]{41597, 25695, 45946, 4343, 11642, 21262, 51706, 54978, 36284, 29865, 35384, 22720, 46110, 41824, 25059}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char maximumFlingVelocity = (char) (31533 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 921;
            int trimmedLength = 28 - TextUtils.getTrimmedLength("");
            byte[] bArr2 = $$a;
            Object[] objArr6 = new Object[1];
            a(bArr2[7], bArr2[80], bArr2[37], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maximumFlingVelocity, iMakeMeasureSpec, trimmedLength, -778300370, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 31533);
                int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 921;
                int i3 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28;
                byte b3 = (byte) ($$b & 123);
                byte[] bArr3 = $$a;
                Object[] objArr7 = new Object[1];
                a(b3, bArr3[33], bArr3[37], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(capsMode, touchSlop, i3, -1142834547, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = ~iIdentityHashCode;
            int i5 = (~((-1680748338) | i4)) | 67112736;
            int i6 = ~(iIdentityHashCode | 1706966907);
            int i7 = ((((i5 | i6) * (-252)) + 1506619931) + ((i6 | (~(i4 | (-1613635602)))) * 252)) - 106758392;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            c(new char[]{0, 0, 0, 0}, new char[]{48121, 61875, 46353, 52746}, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2742), (-1) - ImageFormat.getBitsPerPixel(0), new char[]{19630, 53656, 11927, 36833, 58409, 30171, 3175, 40643, 24813, 17380, 56874, 44355, 35584, 57685, 49814, 6231, 61185, 58245, 60417, 16411, 18432, 61236, 6503, 40600, 36739, 60272}, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c(new char[]{0, 0, 0, 0}, new char[]{57195, 23683, 61438, 14846}, (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 65263), TextUtils.getOffsetBefore("", 0), new char[]{32756, 17053, 21497, 526, 27675, 58115, 51550, 59286, 44430, 27205, 1109, 41288, 36361, 45450, 44851, 9788, 47447, 36497}, objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i10 = asInterface + 51;
                d = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 60 / 0;
                    if (applicationContext instanceof ContextWrapper) {
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = null;
                        }
                    }
                } else if (applicationContext instanceof ContextWrapper) {
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = null;
                    }
                }
                applicationContext = applicationContext.getApplicationContext();
            }
            Object[] objArr11 = new Object[1];
            c(new char[]{0, 0, 0, 0}, new char[]{41709, 40486, 8997, 38579}, (char) (45859 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), ViewConfiguration.getLongPressTimeout() >> 16, new char[]{30121, 19905, 17958, 49803, 16840, 19084, 49467, 46372, 12944, 57695, 49563, 22557, 24805, 63301, 29540, 3817}, objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            c(new char[]{0, 0, 0, 0}, new char[]{15118, 64915, 52399, 31801}, (char) (Process.getGidForName("") + 14797), (-1) - Process.getGidForName(""), new char[]{35953, 20198, 5728, 40717, 49412, 11834, 30834, 49284, 35976, 20084, 40774, 58439, 29539, 44790, 13966, 9173}, objArr12);
            try {
                Object[] objArr13 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue()), 0, -106758392};
                byte[] bArr4 = $$d;
                Object[] objArr14 = new Object[1];
                e((byte) (-bArr4[29]), bArr4[57], bArr4[40], objArr14);
                Class<?> cls4 = Class.forName((String) objArr14[0]);
                Object[] objArr15 = new Object[1];
                e(bArr4[48], bArr4[79], bArr4[141], objArr15);
                Object[] objArr16 = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char packedPositionType = (char) (31533 - ExpandableListView.getPackedPositionType(0L));
                    int i12 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 921;
                    int iIndexOf = TextUtils.indexOf("", "") + 28;
                    byte b4 = (byte) ($$b & 123);
                    byte[] bArr5 = $$a;
                    Object[] objArr17 = new Object[1];
                    a(b4, bArr5[33], bArr5[37], objArr17);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionType, i12, iIndexOf, -1142834547, false, (String) objArr17[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr16);
                try {
                    Object[] objArr18 = new Object[1];
                    c(new char[]{0, 0, 0, 0}, new char[]{63892, 53577, 51659, 34831}, (char) ExpandableListView.getPackedPositionType(0L), ExpandableListView.getPackedPositionGroup(0L), new char[]{18100, 46893, 3250, 49544, 53294, 33428, 11116, 22707, 57628, 13160, 64698, 10146, 63029, 32523, 50702, 33718, 6546, 52767, 37234, 13909, 2786, 8570}, objArr18);
                    Class<?> cls5 = Class.forName((String) objArr18[0]);
                    Object[] objArr19 = new Object[1];
                    c(new char[]{0, 0, 0, 0}, new char[]{33389, 29451, 19419, 48229}, (char) (View.MeasureSpec.getSize(0) + 25931), KeyEvent.getDeadChar(0, 0) - 613217406, new char[]{41597, 25695, 45946, 4343, 11642, 21262, 51706, 54978, 36284, 29865, 35384, 22720, 46110, 41824, 25059}, objArr19);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char packedPositionType2 = (char) (ExpandableListView.getPackedPositionType(0L) + 31533);
                        int iRgb = Color.rgb(0, 0, 0) + 16778137;
                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 29;
                        byte[] bArr6 = $$a;
                        Object[] objArr20 = new Object[1];
                        a(bArr6[7], bArr6[80], bArr6[37], objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionType2, iRgb, modifierMetaStateMask, -778300370, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 31533);
                        int modifierMetaStateMask2 = 920 - ((byte) KeyEvent.getModifierMetaStateMask());
                        int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0) + 29;
                        byte[] bArr7 = $$a;
                        byte b5 = bArr7[7];
                        Object[] objArr21 = new Object[1];
                        a(b5, (byte) (b5 & 52), bArr7[80], objArr21);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cNormalizeMetaState, modifierMetaStateMask2, iIndexOf2, -1048449946, false, (String) objArr21[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr16;
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
        int i13 = ((int[]) objArr[1])[0];
        int i14 = ((int[]) objArr[3])[0];
        if (i14 == i13) {
            int i15 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i16 = i15 + 2106421723 + (((~((-1351858911) | iIdentityHashCode2)) | 268604060) * 576) + (((~((~iIdentityHashCode2) | (-1083254851))) | 153616673) * 576) + 97115904;
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr2[0])[0] = i18 ^ (i18 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i14];
            int i19 = i14 - 1;
            iArr[i19] = 1;
            Toast.makeText((Context) null, iArr[((i14 * i19) % 2) - 1], 1).show();
            int i20 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i21 = i20 + 1399899639 + (((~((-1172267512) | iIdentityHashCode3)) | (-601812133)) * (-948)) + ((~((~iIdentityHashCode3) | (-31350949))) * (-948)) + 742855920;
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr2[0])[0] = i23 ^ (i23 << 5);
        }
        float fCeil = this.chipIconSize;
        int i24 = ((int[]) objArr2[0])[0];
        int i25 = i24 * i24;
        int i26 = -(173671162 * i24);
        int i27 = (i25 & i26) + (i25 | i26);
        int i28 = -(i24 * (-626978960));
        int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
        int i30 = (i29 ^ 2068563193) + ((2068563193 & i29) << 1);
        int i31 = i30 >> 22;
        int i32 = (((i31 & (-2047)) + (i31 | (-2047))) / 1024) + 1;
        int i33 = ((i30 | i32) << 1) - (i32 ^ i30);
        int i34 = i30 >> 28;
        int i35 = ((i34 & (-31)) + (i34 | (-31))) / 16;
        int i36 = (-(i33 ^ (((i35 | 1) << 1) - (i35 ^ 1)))) + 3;
        int i37 = i36 >> 17;
        int i38 = (((-65535) & i37) + (i37 | (-65535))) / 32768;
        int i39 = (i38 ^ 1) + ((i38 & 1) << 1);
        if (fCeil <= (568487496 / ((i36 & (-((i39 & 1) + (i39 | 1)))) * 2)) - 94747916 && drawable != null) {
            fCeil = (float) Math.ceil(ViewUtils.dpToPx(this.context, 24));
            if (drawable.getIntrinsicHeight() <= fCeil) {
                return drawable.getIntrinsicHeight();
            }
        }
        return fCeil;
    }

    float calculateCloseIconWidth() {
        int i = 2 % 2;
        int i2 = asInterface + 71;
        d = i2 % 128;
        int i3 = i2 % 2;
        if (!showsCloseIcon()) {
            return 0.0f;
        }
        int i4 = d + 99;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        float f = this.closeIconStartPadding;
        return i5 != 0 ? f * this.closeIconSize * this.closeIconEndPadding : f + this.closeIconSize + this.closeIconEndPadding;
    }

    boolean isShapeThemingEnabled() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 85;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.isShapeThemingEnabled;
        int i5 = i2 + 115;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) throws Throwable {
        int iSaveLayerAlpha;
        int i = 2 % 2;
        int i2 = asInterface + 77;
        d = i2 % 128;
        int i3 = i2 % 2;
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            return;
        }
        int i4 = d + 7;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        if (getAlpha() != 0) {
            if (this.alpha < 255) {
                int i6 = d + 31;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
                iSaveLayerAlpha = CanvasCompat.saveLayerAlpha(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, this.alpha);
                int i8 = d + 21;
                asInterface = i8 % 128;
                int i9 = i8 % 2;
            } else {
                iSaveLayerAlpha = 0;
            }
            drawChipSurface(canvas, bounds);
            drawChipBackground(canvas, bounds);
            if (this.isShapeThemingEnabled) {
                super.draw(canvas);
            }
            drawChipStroke(canvas, bounds);
            drawCompatRipple(canvas, bounds);
            drawChipIcon(canvas, bounds);
            drawCheckedIcon(canvas, bounds);
            if (this.shouldDrawText) {
                drawText(canvas, bounds);
            }
            drawCloseIcon(canvas, bounds);
            drawDebug(canvas, bounds);
            if (this.alpha < 255) {
                int i10 = asInterface + 101;
                d = i10 % 128;
                int i11 = i10 % 2;
                canvas.restoreToCount(iSaveLayerAlpha);
                if (i11 == 0) {
                    throw null;
                }
            }
        }
    }

    private void drawChipSurface(Canvas canvas, Rect rect) {
        int i = 2 % 2;
        int i2 = asInterface + 57;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (!this.isShapeThemingEnabled) {
            this.chipPaint.setColor(this.currentChipSurfaceColor);
            this.chipPaint.setStyle(Paint.Style.FILL);
            this.rectF.set(rect);
            canvas.drawRoundRect(this.rectF, getChipCornerRadius(), getChipCornerRadius(), this.chipPaint);
            int i3 = d + 9;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = asInterface + 27;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 65 / 0;
        }
    }

    private void drawChipBackground(Canvas canvas, Rect rect) {
        int i = 2 % 2;
        int i2 = asInterface + 21;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        if (!this.isShapeThemingEnabled) {
            int i5 = i3 + 73;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            this.chipPaint.setColor(this.currentChipBackgroundColor);
            this.chipPaint.setStyle(Paint.Style.FILL);
            this.chipPaint.setColorFilter(getTintColorFilter());
            this.rectF.set(rect);
            canvas.drawRoundRect(this.rectF, getChipCornerRadius(), getChipCornerRadius(), this.chipPaint);
        }
        int i7 = d + 101;
        asInterface = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 81 / 0;
        }
    }

    private void drawChipStroke(Canvas canvas, Rect rect) {
        int i = 2 % 2;
        Object obj = null;
        if (this.chipStrokeWidth > 0.0f && !this.isShapeThemingEnabled) {
            int i2 = asInterface + 101;
            d = i2 % 128;
            int i3 = i2 % 2;
            this.chipPaint.setColor(this.currentChipStrokeColor);
            this.chipPaint.setStyle(Paint.Style.STROKE);
            if (!this.isShapeThemingEnabled) {
                int i4 = d + 45;
                asInterface = i4 % 128;
                if (i4 % 2 != 0) {
                    this.chipPaint.setColorFilter(getTintColorFilter());
                    obj.hashCode();
                    throw null;
                }
                this.chipPaint.setColorFilter(getTintColorFilter());
            }
            this.rectF.set(rect.left + (this.chipStrokeWidth / 2.0f), rect.top + (this.chipStrokeWidth / 2.0f), rect.right - (this.chipStrokeWidth / 2.0f), rect.bottom - (this.chipStrokeWidth / 2.0f));
            float f = this.chipCornerRadius - (this.chipStrokeWidth / 2.0f);
            canvas.drawRoundRect(this.rectF, f, f, this.chipPaint);
        }
        int i5 = asInterface + 99;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private void drawCompatRipple(Canvas canvas, Rect rect) {
        int i = 2 % 2;
        this.chipPaint.setColor(this.currentCompatRippleColor);
        this.chipPaint.setStyle(Paint.Style.FILL);
        this.rectF.set(rect);
        if (this.isShapeThemingEnabled) {
            calculatePathForSize(new RectF(rect), this.shapePath);
            super.drawShape(canvas, this.chipPaint, this.shapePath, getBoundsAsRectF());
            int i2 = asInterface + 55;
            d = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        int i4 = d + 25;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            canvas.drawRoundRect(this.rectF, getChipCornerRadius(), getChipCornerRadius(), this.chipPaint);
        } else {
            canvas.drawRoundRect(this.rectF, getChipCornerRadius(), getChipCornerRadius(), this.chipPaint);
            throw null;
        }
    }

    private void drawChipIcon(Canvas canvas, Rect rect) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 45;
        d = i2 % 128;
        int i3 = i2 % 2;
        if (!showsChipIcon()) {
            return;
        }
        calculateChipIconBounds(rect, this.rectF);
        float f = this.rectF.left;
        float f2 = this.rectF.top;
        canvas.translate(f, f2);
        this.chipIcon.setBounds(0, 0, (int) this.rectF.width(), (int) this.rectF.height());
        this.chipIcon.draw(canvas);
        canvas.translate(-f, -f2);
        int i4 = d + 119;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 % 3;
        }
    }

    private void drawCheckedIcon(Canvas canvas, Rect rect) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 113;
        d = i2 % 128;
        int i3 = i2 % 2;
        if (!showsCheckedIcon()) {
            return;
        }
        calculateChipIconBounds(rect, this.rectF);
        float f = this.rectF.left;
        float f2 = this.rectF.top;
        canvas.translate(f, f2);
        this.checkedIcon.setBounds(0, 0, (int) this.rectF.width(), (int) this.rectF.height());
        this.checkedIcon.draw(canvas);
        canvas.translate(-f, -f2);
        int i4 = d + 95;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    private void drawText(Canvas canvas, Rect rect) {
        int i = 2 % 2;
        if (this.text != null) {
            Paint.Align alignCalculateTextOriginAndAlignment = calculateTextOriginAndAlignment(rect, this.pointF);
            calculateTextBounds(rect, this.rectF);
            if (this.textDrawableHelper.getTextAppearance() != null) {
                int i2 = d + 121;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                this.textDrawableHelper.getTextPaint().drawableState = getState();
                this.textDrawableHelper.updateTextPaintDrawState(this.context);
                int i4 = asInterface + 9;
                d = i4 % 128;
                int i5 = i4 % 2;
            }
            this.textDrawableHelper.getTextPaint().setTextAlign(alignCalculateTextOriginAndAlignment);
            int iSave = 0;
            boolean z = Math.round(this.textDrawableHelper.getTextWidth(getText().toString())) > Math.round(this.rectF.width());
            if (z) {
                iSave = canvas.save();
                canvas.clipRect(this.rectF);
                int i6 = d + 49;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
            }
            CharSequence charSequenceEllipsize = this.text;
            if (z) {
                int i8 = d + 83;
                asInterface = i8 % 128;
                if (i8 % 2 != 0) {
                    throw null;
                }
                if (this.truncateAt != null) {
                    charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.textDrawableHelper.getTextPaint(), this.rectF.width(), this.truncateAt);
                }
            }
            CharSequence charSequence = charSequenceEllipsize;
            canvas.drawText(charSequence, 0, charSequence.length(), this.pointF.x, this.pointF.y, this.textDrawableHelper.getTextPaint());
            if (!(!z)) {
                canvas.restoreToCount(iSave);
            }
        }
    }

    private void drawCloseIcon(Canvas canvas, Rect rect) {
        int i = 2 % 2;
        if (showsCloseIcon()) {
            calculateCloseIconBounds(rect, this.rectF);
            float f = this.rectF.left;
            float f2 = this.rectF.top;
            canvas.translate(f, f2);
            this.closeIcon.setBounds(0, 0, (int) this.rectF.width(), (int) this.rectF.height());
            if (!RippleUtils.USE_FRAMEWORK_RIPPLE) {
                this.closeIcon.draw(canvas);
            } else {
                int i2 = d + 103;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                this.closeIconRipple.setBounds(this.closeIcon.getBounds());
                this.closeIconRipple.jumpToCurrentState();
                this.closeIconRipple.draw(canvas);
            }
            canvas.translate(-f, -f2);
            int i4 = asInterface + 59;
            d = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = asInterface + 29;
        d = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0055  */
    /* JADX WARN: Code duplicated, block: B:19:0x0078  */
    private void drawDebug(Canvas canvas, Rect rect) throws Throwable {
        int i = 2 % 2;
        Paint paint = this.debugPaint;
        if (paint != null) {
            int i2 = asInterface + 57;
            d = i2 % 128;
            if (i2 % 2 == 0) {
                paint.setColor(ColorUtils.setAlphaComponent(ViewCompat.MEASURED_STATE_MASK, 25));
                canvas.drawRect(rect, this.debugPaint);
                if (!showsChipIcon()) {
                    if (showsCheckedIcon()) {
                    }
                }
                if (this.text != null) {
                    int i3 = d + 103;
                    asInterface = i3 % 128;
                    int i4 = i3 % 2;
                    canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.debugPaint);
                }
                if (showsCloseIcon()) {
                    int i5 = d + 125;
                    asInterface = i5 % 128;
                    int i6 = i5 % 2;
                    calculateCloseIconBounds(rect, this.rectF);
                    canvas.drawRect(this.rectF, this.debugPaint);
                }
                this.debugPaint.setColor(ColorUtils.setAlphaComponent(SupportMenu.CATEGORY_MASK, 127));
                calculateChipTouchBounds(rect, this.rectF);
                canvas.drawRect(this.rectF, this.debugPaint);
                this.debugPaint.setColor(ColorUtils.setAlphaComponent(-16711936, 127));
                calculateCloseIconTouchBounds(rect, this.rectF);
                canvas.drawRect(this.rectF, this.debugPaint);
            }
            paint.setColor(ColorUtils.setAlphaComponent(ViewCompat.MEASURED_STATE_MASK, 127));
            canvas.drawRect(rect, this.debugPaint);
            if (!showsChipIcon()) {
                if (showsCheckedIcon()) {
                }
            }
            if (this.text != null) {
                int i7 = d + 103;
                asInterface = i7 % 128;
                int i8 = i7 % 2;
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.debugPaint);
            }
            if (showsCloseIcon()) {
                int i9 = d + 125;
                asInterface = i9 % 128;
                int i10 = i9 % 2;
                calculateCloseIconBounds(rect, this.rectF);
                canvas.drawRect(this.rectF, this.debugPaint);
            }
            this.debugPaint.setColor(ColorUtils.setAlphaComponent(SupportMenu.CATEGORY_MASK, 127));
            calculateChipTouchBounds(rect, this.rectF);
            canvas.drawRect(this.rectF, this.debugPaint);
            this.debugPaint.setColor(ColorUtils.setAlphaComponent(-16711936, 127));
            calculateCloseIconTouchBounds(rect, this.rectF);
            canvas.drawRect(this.rectF, this.debugPaint);
            calculateChipIconBounds(rect, this.rectF);
            canvas.drawRect(this.rectF, this.debugPaint);
            if (this.text != null) {
                int i11 = d + 103;
                asInterface = i11 % 128;
                int i12 = i11 % 2;
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.debugPaint);
            }
            if (showsCloseIcon()) {
                int i13 = d + 125;
                asInterface = i13 % 128;
                int i14 = i13 % 2;
                calculateCloseIconBounds(rect, this.rectF);
                canvas.drawRect(this.rectF, this.debugPaint);
            }
            this.debugPaint.setColor(ColorUtils.setAlphaComponent(SupportMenu.CATEGORY_MASK, 127));
            calculateChipTouchBounds(rect, this.rectF);
            canvas.drawRect(this.rectF, this.debugPaint);
            this.debugPaint.setColor(ColorUtils.setAlphaComponent(-16711936, 127));
            calculateCloseIconTouchBounds(rect, this.rectF);
            canvas.drawRect(this.rectF, this.debugPaint);
        }
    }

    private void calculateChipIconBounds(Rect rect, RectF rectF) throws Throwable {
        int i = 2 % 2;
        int i2 = d + 75;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            rectF.setEmpty();
            showsChipIcon();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        rectF.setEmpty();
        if (showsChipIcon() || showsCheckedIcon()) {
            float f = this.chipStartPadding + this.iconStartPadding;
            float currentChipIconWidth = getCurrentChipIconWidth();
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                rectF.left = rect.left + f;
                rectF.right = rectF.left + currentChipIconWidth;
            } else {
                rectF.right = rect.right - f;
                rectF.left = rectF.right - currentChipIconWidth;
                int i3 = d + 1;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
            }
            float currentChipIconHeight = getCurrentChipIconHeight();
            rectF.top = rect.exactCenterY() - (currentChipIconHeight / 2.0f);
            rectF.bottom = rectF.top + currentChipIconHeight;
        }
    }

    Paint.Align calculateTextOriginAndAlignment(Rect rect, PointF pointF) {
        int i = 2 % 2;
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.text != null) {
            int i2 = d + 123;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            float fCalculateChipIconWidth = this.chipStartPadding + calculateChipIconWidth() + this.textStartPadding;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                pointF.x = rect.left + fCalculateChipIconWidth;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = rect.right - fCalculateChipIconWidth;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - calculateTextCenterFromBaseline();
        }
        int i4 = asInterface + 11;
        d = i4 % 128;
        int i5 = i4 % 2;
        return align;
    }

    private float calculateTextCenterFromBaseline() {
        int i = 2 % 2;
        int i2 = asInterface + 13;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.textDrawableHelper.getTextPaint().getFontMetrics(this.fontMetrics);
        float f = (this.fontMetrics.descent + this.fontMetrics.ascent) / 2.0f;
        int i4 = d + 77;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return f;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0047  */
    /* JADX WARN: Code duplicated, block: B:16:0x0061 A[PHI: r1 r2
  0x0061: PHI (r1v11 float) = (r1v10 float), (r1v20 float) binds: [B:15:0x005f, B:12:0x0044] A[DONT_GENERATE, DONT_INLINE]
  0x0061: PHI (r2v7 float) = (r2v6 float), (r2v16 float) binds: [B:15:0x005f, B:12:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x006e A[PHI: r1 r2
  0x006e: PHI (r1v17 float) = (r1v10 float), (r1v20 float) binds: [B:15:0x005f, B:12:0x0044] A[DONT_GENERATE, DONT_INLINE]
  0x006e: PHI (r2v8 float) = (r2v6 float), (r2v16 float) binds: [B:15:0x005f, B:12:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    private void calculateTextBounds(Rect rect, RectF rectF) {
        int i;
        float fCalculateChipIconWidth;
        float fCalculateCloseIconWidth;
        int i2 = 2 % 2;
        int i3 = d + 31;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            rectF.setEmpty();
            int i4 = 95 / 0;
            if (this.text != null) {
                i = d + 65;
                asInterface = i % 128;
                if (i % 2 != 0) {
                    fCalculateChipIconWidth = (this.chipStartPadding / calculateChipIconWidth()) - this.textStartPadding;
                    fCalculateCloseIconWidth = (this.chipEndPadding + calculateCloseIconWidth()) * this.textEndPadding;
                    if (DrawableCompat.getLayoutDirection(this) == 0) {
                        rectF.left = rect.left + fCalculateChipIconWidth;
                        rectF.right = rect.right - fCalculateCloseIconWidth;
                    } else {
                        rectF.left = rect.left + fCalculateCloseIconWidth;
                        rectF.right = rect.right - fCalculateChipIconWidth;
                    }
                } else {
                    fCalculateChipIconWidth = this.chipStartPadding + calculateChipIconWidth() + this.textStartPadding;
                    fCalculateCloseIconWidth = this.chipEndPadding + calculateCloseIconWidth() + this.textEndPadding;
                    if (DrawableCompat.getLayoutDirection(this) == 0) {
                        rectF.left = rect.left + fCalculateChipIconWidth;
                        rectF.right = rect.right - fCalculateCloseIconWidth;
                    } else {
                        rectF.left = rect.left + fCalculateCloseIconWidth;
                        rectF.right = rect.right - fCalculateChipIconWidth;
                    }
                }
                rectF.top = rect.top;
                rectF.bottom = rect.bottom;
            }
        } else {
            rectF.setEmpty();
            if (this.text != null) {
                i = d + 65;
                asInterface = i % 128;
                if (i % 2 != 0) {
                    fCalculateChipIconWidth = (this.chipStartPadding / calculateChipIconWidth()) - this.textStartPadding;
                    fCalculateCloseIconWidth = (this.chipEndPadding + calculateCloseIconWidth()) * this.textEndPadding;
                    if (DrawableCompat.getLayoutDirection(this) == 0) {
                        rectF.left = rect.left + fCalculateChipIconWidth;
                        rectF.right = rect.right - fCalculateCloseIconWidth;
                    } else {
                        rectF.left = rect.left + fCalculateCloseIconWidth;
                        rectF.right = rect.right - fCalculateChipIconWidth;
                    }
                } else {
                    fCalculateChipIconWidth = this.chipStartPadding + calculateChipIconWidth() + this.textStartPadding;
                    fCalculateCloseIconWidth = this.chipEndPadding + calculateCloseIconWidth() + this.textEndPadding;
                    if (DrawableCompat.getLayoutDirection(this) == 0) {
                        rectF.left = rect.left + fCalculateChipIconWidth;
                        rectF.right = rect.right - fCalculateCloseIconWidth;
                    } else {
                        rectF.left = rect.left + fCalculateCloseIconWidth;
                        rectF.right = rect.right - fCalculateChipIconWidth;
                    }
                }
                rectF.top = rect.top;
                rectF.bottom = rect.bottom;
            }
        }
        int i5 = asInterface + 65;
        d = i5 % 128;
        int i6 = i5 % 2;
    }

    private void calculateCloseIconBounds(Rect rect, RectF rectF) {
        int i = 2 % 2;
        rectF.setEmpty();
        if (!showsCloseIcon()) {
            return;
        }
        int i2 = asInterface + 59;
        d = i2 % 128;
        int i3 = i2 % 2;
        float f = this.chipEndPadding + this.closeIconEndPadding;
        if (DrawableCompat.getLayoutDirection(this) == 0) {
            int i4 = asInterface + 33;
            d = i4 % 128;
            if (i4 % 2 == 0) {
                rectF.right = rect.right + f;
                rectF.left = rectF.right % this.closeIconSize;
            } else {
                rectF.right = rect.right - f;
                rectF.left = rectF.right - this.closeIconSize;
            }
        } else {
            rectF.left = rect.left + f;
            rectF.right = rectF.left + this.closeIconSize;
        }
        rectF.top = rect.exactCenterY() - (this.closeIconSize / 2.0f);
        rectF.bottom = rectF.top + this.closeIconSize;
    }

    private void calculateChipTouchBounds(Rect rect, RectF rectF) {
        int i = 2 % 2;
        int i2 = asInterface + 75;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            rectF.set(rect);
            int i3 = 81 / 0;
            if (!showsCloseIcon()) {
                return;
            }
        } else {
            rectF.set(rect);
            if (!showsCloseIcon()) {
                return;
            }
        }
        int i4 = d + 51;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        float f = this.chipEndPadding + this.closeIconEndPadding + this.closeIconSize + this.closeIconStartPadding + this.textEndPadding;
        if (DrawableCompat.getLayoutDirection(this) == 0) {
            rectF.right = rect.right - f;
        } else {
            rectF.left = rect.left + f;
        }
    }

    private void calculateCloseIconTouchBounds(Rect rect, RectF rectF) {
        int i = 2 % 2;
        int i2 = d + 69;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            rectF.setEmpty();
            showsCloseIcon();
            obj.hashCode();
            throw null;
        }
        rectF.setEmpty();
        if (showsCloseIcon()) {
            float f = this.chipEndPadding + this.closeIconEndPadding + this.closeIconSize + this.closeIconStartPadding + this.textEndPadding;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                rectF.right = rect.right;
                rectF.left = rectF.right - f;
            } else {
                rectF.left = rect.left;
                rectF.right = rect.left + f;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
        int i3 = d + 107;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public boolean isStateful() {
        int i = 2 % 2;
        int i2 = asInterface + 1;
        d = i2 % 128;
        int i3 = i2 % 2;
        if (!isStateful(this.chipSurfaceColor)) {
            int i4 = asInterface + 37;
            d = i4 % 128;
            int i5 = i4 % 2;
            if (!isStateful(this.chipBackgroundColor) && !isStateful(this.chipStrokeColor) && ((!this.useCompatRipple || !isStateful(this.compatRippleColor)) && !isStateful(this.textDrawableHelper.getTextAppearance()) && !canShowCheckedIcon())) {
                int i6 = asInterface + 21;
                d = i6 % 128;
                int i7 = i6 % 2;
                if (!isStateful(this.chipIcon) && !isStateful(this.checkedIcon)) {
                    int i8 = d + 19;
                    asInterface = i8 % 128;
                    int i9 = i8 % 2;
                    if (!isStateful(this.tint)) {
                        int i10 = d + 65;
                        int i11 = i10 % 128;
                        asInterface = i11;
                        int i12 = i10 % 2;
                        int i13 = i11 + 31;
                        d = i13 % 128;
                        if (i13 % 2 != 0) {
                            return false;
                        }
                        throw null;
                    }
                }
            }
        }
        return true;
    }

    public boolean isCloseIconStateful() {
        int i = 2 % 2;
        int i2 = d + 5;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsStateful = isStateful(this.closeIcon);
        int i4 = asInterface + 19;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return zIsStateful;
        }
        throw null;
    }

    public boolean setCloseIconState(int[] iArr) {
        int i = 2 % 2;
        if (!Arrays.equals(this.closeIconStateSet, iArr)) {
            int i2 = asInterface + 91;
            d = i2 % 128;
            int i3 = i2 % 2;
            this.closeIconStateSet = iArr;
            if (!(!showsCloseIcon())) {
                int i4 = d + 49;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                int[] state = getState();
                if (i5 == 0) {
                    return onStateChange(state, iArr);
                }
                onStateChange(state, iArr);
                throw null;
            }
        }
        int i6 = d + 69;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int[] getCloseIconState() {
        int[] iArr;
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 75;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            iArr = this.closeIconStateSet;
            int i4 = 9 / 0;
        } else {
            iArr = this.closeIconStateSet;
        }
        int i5 = i2 + 41;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return iArr;
    }

    @Override // com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public void onTextSizeChange() {
        int i = 2 % 2;
        int i2 = d + 111;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onSizeChange();
        invalidateSelf();
        int i4 = asInterface + 71;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(int[] iArr) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 7;
        d = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        if (this.isShapeThemingEnabled) {
            int i5 = i2 + 57;
            d = i5 % 128;
            if (i5 % 2 != 0) {
                super.onStateChange(iArr);
            } else {
                super.onStateChange(iArr);
                throw null;
            }
        }
        boolean zOnStateChange = onStateChange(iArr, getCloseIconState());
        int i6 = d + 105;
        asInterface = i6 % 128;
        if (i6 % 2 == 0) {
            return zOnStateChange;
        }
        obj.hashCode();
        throw null;
    }

    private boolean onStateChange(int[] iArr, int[] iArr2) {
        boolean z;
        int colorForState;
        boolean z2;
        int colorForState2;
        boolean state;
        int i = 2 % 2;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.chipSurfaceColor;
        int iCompositeElevationOverlayIfNeeded = compositeElevationOverlayIfNeeded(colorStateList != null ? colorStateList.getColorForState(iArr, this.currentChipSurfaceColor) : 0);
        if (this.currentChipSurfaceColor != iCompositeElevationOverlayIfNeeded) {
            this.currentChipSurfaceColor = iCompositeElevationOverlayIfNeeded;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.chipBackgroundColor;
        int iCompositeElevationOverlayIfNeeded2 = compositeElevationOverlayIfNeeded(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.currentChipBackgroundColor) : 0);
        if (this.currentChipBackgroundColor != iCompositeElevationOverlayIfNeeded2) {
            this.currentChipBackgroundColor = iCompositeElevationOverlayIfNeeded2;
            zOnStateChange = true;
        }
        int iLayer = MaterialColors.layer(iCompositeElevationOverlayIfNeeded, iCompositeElevationOverlayIfNeeded2);
        if (this.currentCompositeSurfaceBackgroundColor != iLayer) {
            z = true;
        } else {
            int i2 = d + 31;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            z = false;
        }
        if (z | (getFillColor() == null)) {
            this.currentCompositeSurfaceBackgroundColor = iLayer;
            setFillColor(ColorStateList.valueOf(iLayer));
            int i4 = d + 121;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.chipStrokeColor;
        int colorForState3 = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.currentChipStrokeColor) : 0;
        if (this.currentChipStrokeColor != colorForState3) {
            this.currentChipStrokeColor = colorForState3;
            zOnStateChange = true;
        }
        if (this.compatRippleColor == null || !RippleUtils.shouldDrawRippleCompat(iArr)) {
            colorForState = 0;
        } else {
            int i6 = d + 49;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            colorForState = this.compatRippleColor.getColorForState(iArr, this.currentCompatRippleColor);
        }
        if (this.currentCompatRippleColor != colorForState) {
            this.currentCompatRippleColor = colorForState;
            if (this.useCompatRipple) {
                zOnStateChange = true;
            }
        }
        int colorForState4 = (this.textDrawableHelper.getTextAppearance() == null || this.textDrawableHelper.getTextAppearance().getTextColor() == null) ? 0 : this.textDrawableHelper.getTextAppearance().getTextColor().getColorForState(iArr, this.currentTextColor);
        if (this.currentTextColor != colorForState4) {
            this.currentTextColor = colorForState4;
            zOnStateChange = true;
        }
        boolean z3 = hasState(getState(), R.attr.state_checked) && !(this.checkable ^ true);
        if (this.currentChecked == z3 || this.checkedIcon == null) {
            z2 = false;
        } else {
            int i8 = asInterface + 93;
            d = i8 % 128;
            int i9 = i8 % 2;
            float fCalculateChipIconWidth = calculateChipIconWidth();
            this.currentChecked = z3;
            if (fCalculateChipIconWidth != calculateChipIconWidth()) {
                int i10 = asInterface + 101;
                d = i10 % 128;
                int i11 = i10 % 2;
                zOnStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.tint;
        if (colorStateList4 != null) {
            int i12 = d + 91;
            asInterface = i12 % 128;
            if (i12 % 2 != 0) {
                colorForState2 = colorStateList4.getColorForState(iArr, this.currentTint);
                int i13 = 45 / 0;
            } else {
                colorForState2 = colorStateList4.getColorForState(iArr, this.currentTint);
            }
        } else {
            colorForState2 = 0;
        }
        if (this.currentTint != colorForState2) {
            int i14 = d + 17;
            asInterface = i14 % 128;
            if (i14 % 2 != 0) {
                this.currentTint = colorForState2;
                this.tintFilter = DrawableUtils.updateTintFilter(this, this.tint, this.tintMode);
                int i15 = 61 / 0;
            } else {
                this.currentTint = colorForState2;
                this.tintFilter = DrawableUtils.updateTintFilter(this, this.tint, this.tintMode);
            }
            zOnStateChange = true;
        }
        if (isStateful(this.chipIcon)) {
            zOnStateChange |= this.chipIcon.setState(iArr);
        }
        if (isStateful(this.checkedIcon)) {
            zOnStateChange |= this.checkedIcon.setState(iArr);
        }
        if (isStateful(this.closeIcon)) {
            int i16 = asInterface + 31;
            d = i16 % 128;
            if (i16 % 2 == 0) {
                int[] iArr3 = new int[iArr.length << iArr2.length];
                System.arraycopy(iArr, 1, iArr3, 1, iArr.length);
                System.arraycopy(iArr2, 1, iArr3, iArr.length, iArr2.length);
                state = this.closeIcon.setState(iArr3);
            } else {
                int[] iArr4 = new int[iArr.length + iArr2.length];
                System.arraycopy(iArr, 0, iArr4, 0, iArr.length);
                System.arraycopy(iArr2, 0, iArr4, iArr.length, iArr2.length);
                state = this.closeIcon.setState(iArr4);
            }
            zOnStateChange |= state;
        }
        if (RippleUtils.USE_FRAMEWORK_RIPPLE && isStateful(this.closeIconRipple)) {
            int i17 = d + 93;
            asInterface = i17 % 128;
            int i18 = i17 % 2;
            zOnStateChange |= this.closeIconRipple.setState(iArr2);
        }
        if (zOnStateChange) {
            invalidateSelf();
        }
        if (z2) {
            onSizeChange();
        }
        return zOnStateChange;
    }

    private static boolean isStateful(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = asInterface + 49;
        d = i2 % 128;
        int i3 = i2 % 2;
        if (colorStateList == null || (!colorStateList.isStateful())) {
            return false;
        }
        int i4 = d;
        int i5 = i4 + 9;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 37;
        asInterface = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:12:0x0027 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    private static boolean isStateful(Drawable drawable) {
        int i;
        int i2 = 2 % 2;
        int i3 = asInterface + 35;
        int i4 = i3 % 128;
        d = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            int i5 = 85 / 0;
            if (drawable != null) {
                i = i4 + 27;
                asInterface = i % 128;
                if (i % 2 == 0) {
                    drawable.isStateful();
                    obj.hashCode();
                    throw null;
                }
                if (drawable.isStateful()) {
                    return true;
                }
            }
        } else if (drawable != null) {
            i = i4 + 27;
            asInterface = i % 128;
            if (i % 2 == 0) {
                drawable.isStateful();
                obj.hashCode();
                throw null;
            }
            if (drawable.isStateful()) {
                return true;
            }
        }
        int i6 = d + 65;
        asInterface = i6 % 128;
        if (i6 % 2 == 0) {
            return false;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d  */
    /* JADX WARN: Code duplicated, block: B:12:0x0032  */
    /* JADX WARN: Code duplicated, block: B:14:0x003d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x003e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    private static boolean isStateful(TextAppearance textAppearance) {
        int i;
        int i2 = 2 % 2;
        int i3 = asInterface + 9;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 64 / 0;
            if (textAppearance != null) {
                if (textAppearance.getTextColor() != null) {
                    int i5 = asInterface + 69;
                    d = i5 % 128;
                    int i6 = i5 % 2;
                    if (!(!textAppearance.getTextColor().isStateful())) {
                        i = asInterface + 85;
                        d = i % 128;
                        if (i % 2 != 0) {
                            return true;
                        }
                        throw null;
                    }
                }
            }
        } else if (textAppearance != null) {
            if (textAppearance.getTextColor() != null) {
                int i7 = asInterface + 69;
                d = i7 % 128;
                int i8 = i7 % 2;
                if (!(!textAppearance.getTextColor().isStateful())) {
                    i = asInterface + 85;
                    d = i % 128;
                    if (i % 2 != 0) {
                        return true;
                    }
                    throw null;
                }
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        boolean layoutDirection;
        int i2 = 2 % 2;
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (showsChipIcon()) {
            zOnLayoutDirectionChanged |= DrawableCompat.setLayoutDirection(this.chipIcon, i);
        }
        if (showsCheckedIcon()) {
            zOnLayoutDirectionChanged |= DrawableCompat.setLayoutDirection(this.checkedIcon, i);
            int i3 = asInterface + 109;
            d = i3 % 128;
            int i4 = i3 % 2;
        }
        if (showsCloseIcon()) {
            int i5 = d + 103;
            asInterface = i5 % 128;
            if (i5 % 2 != 0) {
                layoutDirection = DrawableCompat.setLayoutDirection(this.closeIcon, i) | zOnLayoutDirectionChanged;
                int i6 = 38 / 0;
            } else {
                layoutDirection = DrawableCompat.setLayoutDirection(this.closeIcon, i) | zOnLayoutDirectionChanged;
            }
            zOnLayoutDirectionChanged = layoutDirection;
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        int i7 = asInterface + 29;
        d = i7 % 128;
        int i8 = i7 % 2;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 69;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            super.onLevelChange(i);
            showsChipIcon();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zOnLevelChange = super.onLevelChange(i);
        if (showsChipIcon()) {
            zOnLevelChange |= this.chipIcon.setLevel(i);
        }
        if (showsCheckedIcon()) {
            zOnLevelChange |= this.checkedIcon.setLevel(i);
        }
        if (showsCloseIcon()) {
            zOnLevelChange |= this.closeIcon.setLevel(i);
            int i4 = d + 19;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }
        if (!(!zOnLevelChange)) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0027 A[PHI: r1
  0x0027: PHI (r1v5 boolean) = (r1v4 boolean), (r1v12 boolean) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible;
        int i = 2 % 2;
        int i2 = asInterface + 43;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            visible = super.setVisible(z, z2);
            int i3 = 82 / 0;
            if (showsChipIcon()) {
                int i4 = asInterface + 115;
                d = i4 % 128;
                int i5 = i4 % 2;
                visible |= this.chipIcon.setVisible(z, z2);
            }
        } else {
            visible = super.setVisible(z, z2);
            if (showsChipIcon()) {
                int i6 = asInterface + 115;
                d = i6 % 128;
                int i7 = i6 % 2;
                visible |= this.chipIcon.setVisible(z, z2);
            }
        }
        if (showsCheckedIcon()) {
            visible |= this.checkedIcon.setVisible(z, z2);
        }
        if (showsCloseIcon()) {
            int i8 = d + 121;
            asInterface = i8 % 128;
            int i9 = i8 % 2;
            visible |= this.closeIcon.setVisible(z, z2);
        }
        if (visible) {
            int i10 = d + 99;
            asInterface = i10 % 128;
            int i11 = i10 % 2;
            invalidateSelf();
            if (i11 != 0) {
                int i12 = 10 / 0;
            }
        }
        return visible;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 19;
        d = i3 % 128;
        int i4 = i3 % 2;
        if (this.alpha != i) {
            this.alpha = i;
            invalidateSelf();
            int i5 = d + 9;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public int getAlpha() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 71;
        d = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.alpha;
        int i6 = i2 + 7;
        d = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        int i = 2 % 2;
        if (this.colorFilter != colorFilter) {
            int i2 = d + 5;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            this.colorFilter = colorFilter;
            invalidateSelf();
            int i4 = asInterface + 3;
            d = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        int i = 2 % 2;
        int i2 = d + 71;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        ColorFilter colorFilter = this.colorFilter;
        int i5 = i3 + 93;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return colorFilter;
        }
        throw null;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = d + 1;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this.tint != colorStateList) {
            this.tint = colorStateList;
            onStateChange(getState());
        }
        int i3 = asInterface + 103;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 37 / 0;
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(PorterDuff.Mode mode) {
        int i = 2 % 2;
        int i2 = asInterface + 99;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        if (this.tintMode != mode) {
            int i5 = i3 + 113;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            this.tintMode = mode;
            this.tintFilter = DrawableUtils.updateTintFilter(this, this.tint, mode);
            invalidateSelf();
            int i7 = asInterface + 49;
            d = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        int i = 2 % 2;
        Object obj = null;
        if (this.isShapeThemingEnabled) {
            int i2 = d + 59;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            super.getOutline(outline);
            int i4 = asInterface + 115;
            d = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.chipCornerRadius);
        } else {
            outline.setRoundRect(bounds, this.chipCornerRadius);
        }
        outline.setAlpha(getAlpha() / 255.0f);
        int i5 = d + 49;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        int i = 2 % 2;
        int i2 = d + 91;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            getCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
            int i3 = d + 33;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        int i = 2 % 2;
        int i2 = asInterface + 111;
        d = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            getCallback();
            obj.hashCode();
            throw null;
        }
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            int i3 = d + 79;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            callback.scheduleDrawable(this, runnable, j);
            int i5 = d + 41;
            asInterface = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 % 3;
            }
        }
        int i7 = d + 91;
        asInterface = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        int i = 2 % 2;
        int i2 = asInterface + 119;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            getCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
        int i3 = asInterface + 123;
        d = i3 % 128;
        int i4 = i3 % 2;
    }

    private void unapplyChildDrawable(Drawable drawable) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 113;
        d = i3 % 128;
        int i4 = i3 % 2;
        if (drawable != null) {
            int i5 = i2 + 89;
            d = i5 % 128;
            int i6 = i5 % 2;
            drawable.setCallback(null);
        }
        int i7 = asInterface + 115;
        d = i7 % 128;
        int i8 = i7 % 2;
    }

    private void applyChildDrawable(Drawable drawable) {
        int i = 2 % 2;
        if (drawable != null) {
            drawable.setCallback(this);
            DrawableCompat.setLayoutDirection(drawable, DrawableCompat.getLayoutDirection(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.closeIcon) {
                int i2 = d + 51;
                asInterface = i2 % 128;
                if (i2 % 2 != 0) {
                    drawable.isStateful();
                    throw null;
                }
                if (drawable.isStateful()) {
                    drawable.setState(getCloseIconState());
                }
                DrawableCompat.setTintList(drawable, this.closeIconTint);
                return;
            }
            Drawable drawable2 = this.chipIcon;
            if (drawable == drawable2 && this.hasChipIconTint) {
                int i3 = d + 9;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                DrawableCompat.setTintList(drawable2, this.chipIconTint);
                int i5 = d + 113;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
            }
            if (!drawable.isStateful()) {
                return;
            }
            int i7 = asInterface + 9;
            d = i7 % 128;
            int i8 = i7 % 2;
            drawable.setState(getState());
        }
    }

    private ColorFilter getTintColorFilter() {
        int i = 2 % 2;
        ColorFilter colorFilter = this.colorFilter;
        if (colorFilter != null) {
            int i2 = d + 85;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return colorFilter;
        }
        PorterDuffColorFilter porterDuffColorFilter = this.tintFilter;
        int i4 = asInterface + 117;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return porterDuffColorFilter;
        }
        throw null;
    }

    private void updateCompatRippleColor() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 63;
        int i4 = i3 % 128;
        asInterface = i4;
        ColorStateList colorStateListSanitizeRippleDrawableColor = null;
        if (i3 % 2 != 0) {
            colorStateListSanitizeRippleDrawableColor.hashCode();
            throw null;
        }
        if (this.useCompatRipple) {
            int i5 = i4 + 81;
            d = i5 % 128;
            int i6 = i5 % 2;
            ColorStateList colorStateList = this.rippleColor;
            if (i6 == 0) {
                RippleUtils.sanitizeRippleDrawableColor(colorStateList);
                throw null;
            }
            colorStateListSanitizeRippleDrawableColor = RippleUtils.sanitizeRippleDrawableColor(colorStateList);
        } else {
            int i7 = i2 + 107;
            asInterface = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 2 % 4;
            }
        }
        this.compatRippleColor = colorStateListSanitizeRippleDrawableColor;
    }

    private void setChipSurfaceColor(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 73;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this.chipSurfaceColor != colorStateList) {
            int i4 = i2 + 9;
            d = i4 % 128;
            int i5 = i4 % 2;
            this.chipSurfaceColor = colorStateList;
            onStateChange(getState());
            int i6 = d + 25;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    private static boolean hasState(int[] iArr, int i) {
        int i2 = 2 % 2;
        int i3 = d + 23;
        int i4 = i3 % 128;
        asInterface = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (iArr == null) {
            return false;
        }
        int length = iArr.length;
        int i5 = i4 + 31;
        d = i5 % 128;
        int i6 = i5 % 2;
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = asInterface + 75;
            int i9 = i8 % 128;
            d = i9;
            if (i8 % 2 == 0) {
                int i10 = 0 / 0;
                if (iArr[i7] == i) {
                    int i11 = i9 + 37;
                    asInterface = i11 % 128;
                    int i12 = i11 % 2;
                    return true;
                }
            } else {
                if (iArr[i7] == i) {
                    int i13 = i9 + 37;
                    asInterface = i13 % 128;
                    int i14 = i13 % 2;
                    return true;
                }
            }
        }
        return false;
    }

    public void setTextSize(float f) {
        int i = 2 % 2;
        int i2 = d + 55;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        TextAppearance textAppearance = getTextAppearance();
        if (textAppearance != null) {
            int i4 = d + 81;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            textAppearance.setTextSize(f);
            this.textDrawableHelper.getTextPaint().setTextSize(f);
            onTextSizeChange();
        }
        int i6 = asInterface + 123;
        d = i6 % 128;
        int i7 = i6 % 2;
    }

    public void setTextColor(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 55;
        d = i3 % 128;
        int i4 = i3 % 2;
        setTextColor(ColorStateList.valueOf(i));
        if (i4 == 0) {
            int i5 = 4 / 0;
        }
        int i6 = d + 13;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
    }

    public void setTextColor(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = d + 89;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            getTextAppearance();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TextAppearance textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.setTextColor(colorStateList);
            invalidateSelf();
        }
        int i3 = d + 17;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
    }

    public ColorStateList getChipBackgroundColor() {
        int i = 2 % 2;
        int i2 = d + 25;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        ColorStateList colorStateList = this.chipBackgroundColor;
        int i5 = i3 + 79;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return colorStateList;
        }
        throw null;
    }

    public void setChipBackgroundColorResource(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 61;
        d = i3 % 128;
        int i4 = i3 % 2;
        setChipBackgroundColor(AppCompatResources.getColorStateList(this.context, i));
        int i5 = d + 77;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = asInterface + 29;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this.chipBackgroundColor != colorStateList) {
            this.chipBackgroundColor = colorStateList;
            onStateChange(getState());
            int i3 = d + 3;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = asInterface + 99;
        d = i5 % 128;
        int i6 = i5 % 2;
    }

    public float getChipMinHeight() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 39;
        asInterface = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        float f = this.chipMinHeight;
        int i4 = i2 + 99;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return f;
        }
        throw null;
    }

    public void setChipMinHeightResource(int i) {
        int i2 = 2 % 2;
        int i3 = d + 65;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            setChipMinHeight(this.context.getResources().getDimension(i));
            throw null;
        }
        setChipMinHeight(this.context.getResources().getDimension(i));
        int i4 = asInterface + 123;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setChipMinHeight(float f) {
        int i = 2 % 2;
        int i2 = asInterface + 23;
        d = i2 % 128;
        int i3 = i2 % 2;
        if (this.chipMinHeight != f) {
            this.chipMinHeight = f;
            invalidateSelf();
            onSizeChange();
        }
        int i4 = d + 51;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public float getChipCornerRadius() {
        int i = 2 % 2;
        int i2 = asInterface + 17;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (!this.isShapeThemingEnabled) {
            return this.chipCornerRadius;
        }
        float topLeftCornerResolvedSize = getTopLeftCornerResolvedSize();
        int i3 = d + 13;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return topLeftCornerResolvedSize;
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        int i2 = 2 % 2;
        int i3 = d + 87;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        setChipCornerRadius(this.context.getResources().getDimension(i));
        int i5 = asInterface + 119;
        d = i5 % 128;
        int i6 = i5 % 2;
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 19;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        if (this.chipCornerRadius != f) {
            int i5 = i2 + 47;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            this.chipCornerRadius = f;
            setShapeAppearanceModel(getShapeAppearanceModel().withCornerSize(f));
            int i7 = asInterface + 41;
            d = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    public ColorStateList getChipStrokeColor() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 35;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        ColorStateList colorStateList = this.chipStrokeColor;
        int i5 = i2 + 107;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return colorStateList;
    }

    public void setChipStrokeColorResource(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 97;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            setChipStrokeColor(AppCompatResources.getColorStateList(this.context, i));
            throw null;
        }
        setChipStrokeColor(AppCompatResources.getColorStateList(this.context, i));
        int i4 = d + 31;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        int i = 2 % 2;
        if (this.chipStrokeColor != colorStateList) {
            int i2 = d + 105;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            this.chipStrokeColor = colorStateList;
            if (this.isShapeThemingEnabled) {
                setStrokeColor(colorStateList);
                int i4 = d + 113;
                asInterface = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 3 / 5;
                }
            }
            onStateChange(getState());
        }
    }

    public float getChipStrokeWidth() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 93;
        d = i3 % 128;
        int i4 = i3 % 2;
        float f = this.chipStrokeWidth;
        int i5 = i2 + 5;
        d = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public void setChipStrokeWidthResource(int i) {
        int i2 = 2 % 2;
        int i3 = d + 113;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        setChipStrokeWidth(this.context.getResources().getDimension(i));
        int i5 = d + 103;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public void setChipStrokeWidth(float f) {
        int i = 2 % 2;
        int i2 = asInterface + 23;
        d = i2 % 128;
        int i3 = i2 % 2;
        if (this.chipStrokeWidth != f) {
            this.chipStrokeWidth = f;
            this.chipPaint.setStrokeWidth(f);
            if (this.isShapeThemingEnabled) {
                super.setStrokeWidth(f);
            }
            invalidateSelf();
        }
        int i4 = d + 123;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public ColorStateList getRippleColor() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 37;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        ColorStateList colorStateList = this.rippleColor;
        int i5 = i2 + 19;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return colorStateList;
    }

    public void setRippleColorResource(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 73;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            setRippleColor(AppCompatResources.getColorStateList(this.context, i));
            throw null;
        }
        setRippleColor(AppCompatResources.getColorStateList(this.context, i));
        int i4 = d + 111;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = asInterface + 1;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        if (this.rippleColor != colorStateList) {
            int i5 = i3 + 45;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            this.rippleColor = colorStateList;
            updateCompatRippleColor();
            onStateChange(getState());
            int i7 = d + 35;
            asInterface = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 5 % 3;
            }
        }
    }

    public CharSequence getText() {
        int i = 2 % 2;
        int i2 = d + 15;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        CharSequence charSequence = this.text;
        int i4 = i3 + 123;
        d = i4 % 128;
        int i5 = i4 % 2;
        return charSequence;
    }

    public void setTextResource(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 55;
        d = i3 % 128;
        int i4 = i3 % 2;
        setText(this.context.getResources().getString(i));
        int i5 = asInterface + 47;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 19 / 0;
        }
    }

    public void setText(CharSequence charSequence) {
        int i = 2 % 2;
        if (charSequence == null) {
            int i2 = d + 105;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                charSequence = "";
            } else {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        if (TextUtils.equals(this.text, charSequence)) {
            return;
        }
        this.text = charSequence;
        this.textDrawableHelper.setTextWidthDirty(true);
        invalidateSelf();
        onSizeChange();
        int i3 = d + 19;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
    }

    public TextAppearance getTextAppearance() {
        int i = 2 % 2;
        int i2 = d + 93;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        TextDrawableHelper textDrawableHelper = this.textDrawableHelper;
        if (i3 == 0) {
            return textDrawableHelper.getTextAppearance();
        }
        textDrawableHelper.getTextAppearance();
        throw null;
    }

    public void setTextAppearanceResource(int i) {
        int i2 = 2 % 2;
        setTextAppearance(new TextAppearance(this.context, i));
        int i3 = asInterface + 33;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public void setTextAppearance(TextAppearance textAppearance) {
        int i = 2 % 2;
        int i2 = asInterface + 61;
        d = i2 % 128;
        int i3 = i2 % 2;
        TextDrawableHelper textDrawableHelper = this.textDrawableHelper;
        if (i3 != 0) {
            textDrawableHelper.setTextAppearance(textAppearance, this.context);
            return;
        }
        textDrawableHelper.setTextAppearance(textAppearance, this.context);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 101;
        d = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        TextUtils.TruncateAt truncateAt = this.truncateAt;
        int i4 = i2 + 35;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return truncateAt;
        }
        throw null;
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        int i = 2 % 2;
        int i2 = d + 25;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        this.truncateAt = truncateAt;
        if (i3 != 0) {
            throw null;
        }
    }

    public boolean isChipIconVisible() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char doubleTapTimeout = (char) (31533 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
            int iArgb = Color.argb(0, 0, 0, 0) + 921;
            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 28;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            a(b2, (byte) (b2 & 52), bArr[80], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(doubleTapTimeout, iArgb, maxKeyCode, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{0, 0, 0, 0}, new char[]{63892, 53577, 51659, 34831}, (char) Color.red(0), ViewConfiguration.getKeyRepeatDelay() >> 16, new char[]{18100, 46893, 3250, 49544, 53294, 33428, 11116, 22707, 57628, 13160, 64698, 10146, 63029, 32523, 50702, 33718, 6546, 52767, 37234, 13909, 2786, 8570}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{0, 0, 0, 0}, new char[]{33389, 29451, 19419, 48229}, (char) (25931 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 613217406, new char[]{41597, 25695, 45946, 4343, 11642, 21262, 51706, 54978, 36284, 29865, 35384, 22720, 46110, 41824, 25059}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 31533);
            int i2 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 921;
            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 28;
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            a(bArr2[7], bArr2[80], bArr2[37], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSizeAndState, i2, packedPositionType, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char packedPositionType2 = (char) (31533 - ExpandableListView.getPackedPositionType(0L));
                int mirror = AndroidCharacter.getMirror('0') + 873;
                int defaultSize = View.getDefaultSize(0, 0) + 28;
                byte b3 = (byte) ($$b & 123);
                byte[] bArr3 = $$a;
                Object[] objArr6 = new Object[1];
                a(b3, bArr3[33], bArr3[37], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionType2, mirror, defaultSize, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int i3 = ~((int) Process.getStartUptimeMillis());
            int i4 = 45280219 + (((~(i3 | 176241218)) | (-1606237788)) * (-160)) + (((~(i3 | (-1597838426))) | 176241218) * 160) + 175670785;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[0])[0] = i6 ^ (i6 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{0, 0, 0, 0}, new char[]{48121, 61875, 46353, 52746}, (char) (ImageFormat.getBitsPerPixel(0) + 2742), KeyEvent.getDeadChar(0, 0), new char[]{19630, 53656, 11927, 36833, 58409, 30171, 3175, 40643, 24813, 17380, 56874, 44355, 35584, 57685, 49814, 6231, 61185, 58245, 60417, 16411, 18432, 61236, 6503, 40600, 36739, 60272}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{0, 0, 0, 0}, new char[]{57195, 23683, 61438, 14846}, (char) (TextUtils.lastIndexOf("", '0', 0) + 65264), KeyEvent.keyCodeFromString(""), new char[]{32756, 17053, 21497, 526, 27675, 58115, 51550, 59286, 44430, 27205, 1109, 41288, 36361, 45450, 44851, 9788, 47447, 36497}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i7 = asInterface + 65;
                d = i7 % 128;
                int i8 = i7 % 2;
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{0, 0, 0, 0}, new char[]{41709, 40486, 8997, 38579}, (char) (45858 - Process.getGidForName("")), KeyEvent.getDeadChar(0, 0), new char[]{30121, 19905, 17958, 49803, 16840, 19084, 49467, 46372, 12944, 57695, 49563, 22557, 24805, 63301, 29540, 3817}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{0, 0, 0, 0}, new char[]{15118, 64915, 52399, 31801}, (char) (Color.rgb(0, 0, 0) + 16792012), KeyEvent.normalizeMetaState(0), new char[]{35953, 20198, 5728, 40717, 49412, 11834, 30834, 49284, 35976, 20084, 40774, 58439, 29539, 44790, 13966, 9173}, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 175670785};
                byte[] bArr4 = $$d;
                byte b4 = (byte) (bArr4[34] - 1);
                byte b5 = (byte) (-bArr4[44]);
                Object[] objArr13 = new Object[1];
                e(b4, b5, (byte) (b5 | 16), objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b6 = bArr4[79];
                byte b7 = b6;
                Object[] objArr14 = new Object[1];
                e(b7, (byte) (b7 | 14), b6, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 31533);
                    int iRgb = Color.rgb(0, 0, 0) + 16778137;
                    int iMakeMeasureSpec = 28 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    byte b8 = (byte) ($$b & 123);
                    byte[] bArr5 = $$a;
                    Object[] objArr16 = new Object[1];
                    a(b8, bArr5[33], bArr5[37], objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cCombineMeasuredStates, iRgb, iMakeMeasureSpec, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    c(new char[]{0, 0, 0, 0}, new char[]{63892, 53577, 51659, 34831}, (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), ViewConfiguration.getScrollDefaultDelay() >> 16, new char[]{18100, 46893, 3250, 49544, 53294, 33428, 11116, 22707, 57628, 13160, 64698, 10146, 63029, 32523, 50702, 33718, 6546, 52767, 37234, 13909, 2786, 8570}, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    c(new char[]{0, 0, 0, 0}, new char[]{33389, 29451, 19419, 48229}, (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 25931), TextUtils.indexOf((CharSequence) "", '0') - 613217405, new char[]{41597, 25695, 45946, 4343, 11642, 21262, 51706, 54978, 36284, 29865, 35384, 22720, 46110, 41824, 25059}, objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 31534);
                        int modifierMetaStateMask = 920 - ((byte) KeyEvent.getModifierMetaStateMask());
                        int offsetBefore = 28 - TextUtils.getOffsetBefore("", 0);
                        byte[] bArr6 = $$a;
                        byte b9 = bArr6[7];
                        byte b10 = bArr6[80];
                        byte b11 = bArr6[37];
                        Object[] objArr19 = new Object[1];
                        a(b9, b10, b11, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cLastIndexOf, modifierMetaStateMask, offsetBefore, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char maximumDrawingCacheSize = (char) (31533 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                        int packedPositionType3 = 921 - ExpandableListView.getPackedPositionType(0L);
                        int threadPriority = 28 - ((Process.getThreadPriority(0) + 20) >> 6);
                        byte[] bArr7 = $$a;
                        byte b12 = bArr7[7];
                        Object[] objArr20 = new Object[1];
                        a(b12, (byte) (b12 & 52), bArr7[80], objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maximumDrawingCacheSize, packedPositionType3, threadPriority, -1048449946, false, (String) objArr20[0], null);
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
        int i9 = ((int[]) objArr[1])[0];
        int i10 = ((int[]) objArr[3])[0];
        if (i10 != i9) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i11 = asInterface + 43;
                d = i11 % 128;
                int i12 = i11 % 2;
                for (String str : strArr) {
                    int i13 = asInterface + 109;
                    d = i13 % 128;
                    int i14 = i13 % 2;
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i10));
        }
        int i15 = d + 13;
        asInterface = i15 % 128;
        int i16 = i15 % 2;
        int i17 = ((int[]) objArr[0])[0];
        Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i18 = 1323313709 + (((~((-881044663) | iFreeMemory)) | 8457234 | (~(893034981 | iFreeMemory))) * (-754));
        int i19 = ~((-8457235) | iFreeMemory);
        int i20 = ~iFreeMemory;
        int i21 = i17 + i18 + ((i19 | (~(901492215 | i20))) * (-754)) + ((i20 | (-881044663)) * 754);
        int i22 = (i21 << 13) ^ i21;
        int i23 = i22 ^ (i22 >>> 17);
        ((int[]) objArr21[0])[0] = i23 ^ (i23 << 5);
        int i24 = asInterface + 121;
        d = i24 % 128;
        int i25 = i24 % 2;
        return this.chipIconVisible;
    }

    @Deprecated
    public boolean isChipIconEnabled() throws Throwable {
        int i = 2 % 2;
        int i2 = d + 75;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsChipIconVisible = isChipIconVisible();
        int i4 = d + 25;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return zIsChipIconVisible;
    }

    public void setChipIconVisible(int i) {
        int i2 = 2 % 2;
        int i3 = d + 21;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        setChipIconVisible(this.context.getResources().getBoolean(i));
        int i5 = asInterface + 35;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public void setChipIconVisible(boolean z) {
        int i;
        int i2 = 2 % 2;
        int i3 = d + 47;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        if (this.chipIconVisible != z) {
            boolean zShowsChipIcon = showsChipIcon();
            this.chipIconVisible = z;
            boolean zShowsChipIcon2 = showsChipIcon();
            if (zShowsChipIcon != zShowsChipIcon2) {
                if (!zShowsChipIcon2) {
                    unapplyChildDrawable(this.chipIcon);
                    i = asInterface + 37;
                } else {
                    applyChildDrawable(this.chipIcon);
                    i = asInterface + 39;
                }
                d = i % 128;
                int i5 = i % 2;
                invalidateSelf();
                onSizeChange();
            }
        }
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        int i2 = 2 % 2;
        int i3 = d + 47;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        setChipIconVisible(i);
        int i5 = d + 87;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 105;
        d = i2 % 128;
        int i3 = i2 % 2;
        setChipIconVisible(z);
        int i4 = d + 17;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public Drawable getChipIcon() {
        int i = 2 % 2;
        int i2 = d + 55;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Drawable drawable = this.chipIcon;
        if (drawable != null) {
            return DrawableCompat.unwrap(drawable);
        }
        int i4 = i3 + 59;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 3 / 0;
        }
        return null;
    }

    public void setChipIconResource(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 109;
        d = i3 % 128;
        int i4 = i3 % 2;
        setChipIcon(AppCompatResources.getDrawable(this.context, i));
        int i5 = asInterface + 25;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public void setChipIcon(Drawable drawable) {
        int i = 2 % 2;
        int i2 = asInterface + 11;
        d = i2 % 128;
        Drawable drawableMutate = null;
        if (i2 % 2 == 0) {
            getChipIcon();
            throw null;
        }
        Drawable chipIcon = getChipIcon();
        if (chipIcon != drawable) {
            float fCalculateChipIconWidth = calculateChipIconWidth();
            if (drawable != null) {
                int i3 = d + 59;
                asInterface = i3 % 128;
                if (i3 % 2 != 0) {
                    DrawableCompat.wrap(drawable).mutate();
                    throw null;
                }
                drawableMutate = DrawableCompat.wrap(drawable).mutate();
            }
            this.chipIcon = drawableMutate;
            float fCalculateChipIconWidth2 = calculateChipIconWidth();
            unapplyChildDrawable(chipIcon);
            if (showsChipIcon()) {
                int i4 = asInterface + 3;
                d = i4 % 128;
                int i5 = i4 % 2;
                applyChildDrawable(this.chipIcon);
            }
            invalidateSelf();
            if (fCalculateChipIconWidth != fCalculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    public ColorStateList getChipIconTint() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 67;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        ColorStateList colorStateList = this.chipIconTint;
        int i5 = i2 + 61;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return colorStateList;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setChipIconTintResource(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 49;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            setChipIconTint(AppCompatResources.getColorStateList(this.context, i));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        setChipIconTint(AppCompatResources.getColorStateList(this.context, i));
        int i4 = asInterface + 119;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 67 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003a  */
    public void setChipIconTint(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = d + 111;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 != 0) {
            this.hasChipIconTint = true;
            if (this.chipIconTint == colorStateList) {
                return;
            }
        } else {
            this.hasChipIconTint = true;
            if (this.chipIconTint == colorStateList) {
                return;
            }
        }
        int i4 = i3 + 33;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            this.chipIconTint = colorStateList;
            int i5 = 19 / 0;
            if (showsChipIcon()) {
                DrawableCompat.setTintList(this.chipIcon, colorStateList);
            }
        } else {
            this.chipIconTint = colorStateList;
            if (showsChipIcon()) {
                DrawableCompat.setTintList(this.chipIcon, colorStateList);
            }
        }
        onStateChange(getState());
        int i6 = d + 31;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
    }

    public float getChipIconSize() {
        int i = 2 % 2;
        int i2 = d + 69;
        int i3 = i2 % 128;
        asInterface = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        float f = this.chipIconSize;
        int i4 = i3 + 39;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return f;
        }
        throw null;
    }

    public void setChipIconSizeResource(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 29;
        d = i3 % 128;
        int i4 = i3 % 2;
        setChipIconSize(this.context.getResources().getDimension(i));
        int i5 = d + 113;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setChipIconSize(float f) {
        int i = 2 % 2;
        int i2 = asInterface + 57;
        d = i2 % 128;
        int i3 = i2 % 2;
        if (this.chipIconSize != f) {
            float fCalculateChipIconWidth = calculateChipIconWidth();
            this.chipIconSize = f;
            float fCalculateChipIconWidth2 = calculateChipIconWidth();
            invalidateSelf();
            if (fCalculateChipIconWidth != fCalculateChipIconWidth2) {
                onSizeChange();
                int i4 = d + 103;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        int i6 = asInterface + 83;
        d = i6 % 128;
        int i7 = i6 % 2;
    }

    public boolean isCloseIconVisible() {
        boolean z;
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 3;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            z = this.closeIconVisible;
            int i4 = 70 / 0;
        } else {
            z = this.closeIconVisible;
        }
        int i5 = i2 + 107;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    @Deprecated
    public boolean isCloseIconEnabled() {
        int i = 2 % 2;
        int i2 = d + 113;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsCloseIconVisible = isCloseIconVisible();
        if (i3 != 0) {
            int i4 = 65 / 0;
        }
        return zIsCloseIconVisible;
    }

    public void setCloseIconVisible(int i) {
        int i2 = 2 % 2;
        int i3 = d + 121;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        setCloseIconVisible(this.context.getResources().getBoolean(i));
        if (i4 != 0) {
            int i5 = 14 / 0;
        }
    }

    public void setCloseIconVisible(boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 35;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        if (this.closeIconVisible != z) {
            int i5 = i3 + 101;
            asInterface = i5 % 128;
            if (i5 % 2 != 0) {
                showsCloseIcon();
                this.closeIconVisible = z;
                showsCloseIcon();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            boolean zShowsCloseIcon = showsCloseIcon();
            this.closeIconVisible = z;
            boolean zShowsCloseIcon2 = showsCloseIcon();
            if (zShowsCloseIcon != zShowsCloseIcon2) {
                if (zShowsCloseIcon2) {
                    applyChildDrawable(this.closeIcon);
                } else {
                    unapplyChildDrawable(this.closeIcon);
                }
                invalidateSelf();
                onSizeChange();
            }
        }
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 125;
        d = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        setCloseIconVisible(i);
        if (i4 == 0) {
            throw null;
        }
        int i5 = asInterface + 83;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = d + 7;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        setCloseIconVisible(z);
        if (i3 != 0) {
            int i4 = 73 / 0;
        }
        int i5 = asInterface + 15;
        d = i5 % 128;
        int i6 = i5 % 2;
    }

    public Drawable getCloseIcon() {
        int i = 2 % 2;
        int i2 = d + 59;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Drawable drawable = this.closeIcon;
        if (drawable == null) {
            return null;
        }
        Drawable drawableUnwrap = DrawableCompat.unwrap(drawable);
        int i3 = asInterface + 53;
        d = i3 % 128;
        int i4 = i3 % 2;
        return drawableUnwrap;
    }

    public void setCloseIconResource(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 61;
        d = i3 % 128;
        int i4 = i3 % 2;
        setCloseIcon(AppCompatResources.getDrawable(this.context, i));
        int i5 = asInterface + 117;
        d = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setCloseIcon(Drawable drawable) {
        Drawable drawableMutate;
        int i = 2 % 2;
        int i2 = asInterface + 57;
        d = i2 % 128;
        int i3 = i2 % 2;
        Drawable closeIcon = getCloseIcon();
        if (closeIcon != drawable) {
            int i4 = d + 125;
            asInterface = i4 % 128;
            Object obj = null;
            if (i4 % 2 != 0) {
                calculateCloseIconWidth();
                throw null;
            }
            float fCalculateCloseIconWidth = calculateCloseIconWidth();
            if (drawable != null) {
                int i5 = d + 87;
                asInterface = i5 % 128;
                if (i5 % 2 != 0) {
                    drawableMutate = DrawableCompat.wrap(drawable).mutate();
                    int i6 = 37 / 0;
                } else {
                    drawableMutate = DrawableCompat.wrap(drawable).mutate();
                }
            } else {
                drawableMutate = null;
            }
            this.closeIcon = drawableMutate;
            if (RippleUtils.USE_FRAMEWORK_RIPPLE) {
                int i7 = d + 109;
                asInterface = i7 % 128;
                int i8 = i7 % 2;
                updateFrameworkCloseIconRipple();
            }
            float fCalculateCloseIconWidth2 = calculateCloseIconWidth();
            unapplyChildDrawable(closeIcon);
            if (showsCloseIcon()) {
                int i9 = d + 47;
                asInterface = i9 % 128;
                int i10 = i9 % 2;
                applyChildDrawable(this.closeIcon);
            }
            invalidateSelf();
            if (fCalculateCloseIconWidth != fCalculateCloseIconWidth2) {
                int i11 = asInterface + 39;
                d = i11 % 128;
                int i12 = i11 % 2;
                onSizeChange();
                if (i12 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        }
    }

    private void updateFrameworkCloseIconRipple() {
        int i = 2 % 2;
        this.closeIconRipple = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(getRippleColor()), this.closeIcon, closeIconRippleMask);
        int i2 = d + 63;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    public ColorStateList getCloseIconTint() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 121;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        ColorStateList colorStateList = this.closeIconTint;
        int i5 = i2 + 17;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return colorStateList;
    }

    public void setCloseIconTintResource(int i) {
        int i2 = 2 % 2;
        int i3 = d + 69;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        setCloseIconTint(AppCompatResources.getColorStateList(this.context, i));
        int i5 = d + 87;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        int i = 2 % 2;
        if (this.closeIconTint != colorStateList) {
            this.closeIconTint = colorStateList;
            if (showsCloseIcon()) {
                int i2 = d + 19;
                asInterface = i2 % 128;
                if (i2 % 2 != 0) {
                    DrawableCompat.setTintList(this.closeIcon, colorStateList);
                    int i3 = 57 / 0;
                } else {
                    DrawableCompat.setTintList(this.closeIcon, colorStateList);
                }
            }
            onStateChange(getState());
            int i4 = d + 79;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 / 5;
            }
        }
    }

    public float getCloseIconSize() {
        int i = 2 % 2;
        int i2 = asInterface + 27;
        int i3 = i2 % 128;
        d = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        float f = this.closeIconSize;
        int i4 = i3 + 17;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return f;
    }

    public void setCloseIconSizeResource(int i) {
        int i2 = 2 % 2;
        int i3 = d + 119;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        setCloseIconSize(this.context.getResources().getDimension(i));
        if (i4 != 0) {
            int i5 = 62 / 0;
        }
    }

    public void setCloseIconSize(float f) {
        int i = 2 % 2;
        int i2 = d + 35;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.closeIconSize != f) {
            this.closeIconSize = f;
            invalidateSelf();
            if (showsCloseIcon()) {
                onSizeChange();
            }
        }
        int i3 = d + 7;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 90 / 0;
        }
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = asInterface + 49;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this.closeIconContentDescription != charSequence) {
            this.closeIconContentDescription = BidiFormatter.getInstance().unicodeWrap(charSequence);
            invalidateSelf();
        }
        int i3 = d + 99;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
    }

    public CharSequence getCloseIconContentDescription() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 99;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        CharSequence charSequence = this.closeIconContentDescription;
        int i5 = i2 + 117;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return charSequence;
    }

    public boolean isCheckable() {
        int i = 2 % 2;
        int i2 = d + 37;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        boolean z = this.checkable;
        int i5 = i3 + 105;
        d = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public void setCheckableResource(int i) {
        int i2 = 2 % 2;
        int i3 = d + 81;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Resources resources = this.context.getResources();
        if (i4 == 0) {
            setCheckable(resources.getBoolean(i));
            return;
        }
        setCheckable(resources.getBoolean(i));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setCheckable(boolean z) {
        int i = 2 % 2;
        if (this.checkable != z) {
            int i2 = d + 121;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                this.checkable = z;
                calculateChipIconWidth();
                throw null;
            }
            this.checkable = z;
            float fCalculateChipIconWidth = calculateChipIconWidth();
            if (!z && this.currentChecked) {
                int i3 = d + 75;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                this.currentChecked = false;
            }
            float fCalculateChipIconWidth2 = calculateChipIconWidth();
            invalidateSelf();
            if (fCalculateChipIconWidth != fCalculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    public boolean isCheckedIconVisible() {
        boolean z;
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 25;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            z = this.checkedIconVisible;
            int i4 = 25 / 0;
        } else {
            z = this.checkedIconVisible;
        }
        int i5 = i2 + 99;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public boolean isCheckedIconEnabled() {
        int i = 2 % 2;
        int i2 = d + 61;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsCheckedIconVisible = isCheckedIconVisible();
        int i4 = asInterface + 97;
        d = i4 % 128;
        int i5 = i4 % 2;
        return zIsCheckedIconVisible;
    }

    public void setCheckedIconVisible(int i) {
        int i2 = 2 % 2;
        int i3 = d + 23;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        setCheckedIconVisible(this.context.getResources().getBoolean(i));
        int i5 = asInterface + 13;
        d = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setCheckedIconVisible(boolean z) {
        int i = 2 % 2;
        if (this.checkedIconVisible != z) {
            boolean zShowsCheckedIcon = showsCheckedIcon();
            this.checkedIconVisible = z;
            boolean zShowsCheckedIcon2 = showsCheckedIcon();
            if (zShowsCheckedIcon != zShowsCheckedIcon2) {
                int i2 = asInterface;
                int i3 = i2 + 71;
                d = i3 % 128;
                int i4 = i3 % 2;
                if (zShowsCheckedIcon2) {
                    int i5 = i2 + 3;
                    d = i5 % 128;
                    if (i5 % 2 == 0) {
                        applyChildDrawable(this.checkedIcon);
                        throw null;
                    }
                    applyChildDrawable(this.checkedIcon);
                } else {
                    unapplyChildDrawable(this.checkedIcon);
                }
                invalidateSelf();
                onSizeChange();
            }
        }
        int i6 = d + 45;
        asInterface = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        int i2 = 2 % 2;
        int i3 = d + 103;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Resources resources = this.context.getResources();
        if (i4 == 0) {
            setCheckedIconVisible(resources.getBoolean(i));
            return;
        }
        setCheckedIconVisible(resources.getBoolean(i));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = d + 45;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        setCheckedIconVisible(z);
        int i4 = asInterface + 45;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    public Drawable getCheckedIcon() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 41;
        d = i3 % 128;
        int i4 = i3 % 2;
        Drawable drawable = this.checkedIcon;
        int i5 = i2 + 75;
        d = i5 % 128;
        int i6 = i5 % 2;
        return drawable;
    }

    public void setCheckedIconResource(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 43;
        d = i3 % 128;
        int i4 = i3 % 2;
        setCheckedIcon(AppCompatResources.getDrawable(this.context, i));
        if (i4 == 0) {
            throw null;
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        int i = 2 % 2;
        int i2 = asInterface + 61;
        int i3 = i2 % 128;
        d = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this.checkedIcon != drawable) {
            int i4 = i3 + 7;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                calculateChipIconWidth();
                this.checkedIcon = drawable;
                calculateChipIconWidth();
                unapplyChildDrawable(this.checkedIcon);
                applyChildDrawable(this.checkedIcon);
                invalidateSelf();
                obj.hashCode();
                throw null;
            }
            float fCalculateChipIconWidth = calculateChipIconWidth();
            this.checkedIcon = drawable;
            float fCalculateChipIconWidth2 = calculateChipIconWidth();
            unapplyChildDrawable(this.checkedIcon);
            applyChildDrawable(this.checkedIcon);
            invalidateSelf();
            if (fCalculateChipIconWidth != fCalculateChipIconWidth2) {
                onSizeChange();
                int i5 = d + 99;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
            }
        }
    }

    public ColorStateList getCheckedIconTint() {
        int i = 2 % 2;
        int i2 = asInterface + 27;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        ColorStateList colorStateList = this.checkedIconTint;
        int i5 = i3 + 7;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return colorStateList;
    }

    public void setCheckedIconTintResource(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 121;
        d = i3 % 128;
        int i4 = i3 % 2;
        setCheckedIconTint(AppCompatResources.getColorStateList(this.context, i));
        int i5 = asInterface + 1;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 21 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0022  */
    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    /* JADX WARN: Code duplicated, block: B:14:0x003c  */
    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    public void setCheckedIconTint(ColorStateList colorStateList) {
        int i;
        int i2 = 2 % 2;
        int i3 = asInterface + 25;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 25 / 0;
            if (this.checkedIconTint != colorStateList) {
                this.checkedIconTint = colorStateList;
                if (canShowCheckedIcon()) {
                    i = asInterface + 7;
                    d = i % 128;
                    if (i % 2 != 0) {
                        DrawableCompat.setTintList(this.checkedIcon, colorStateList);
                        throw null;
                    }
                    DrawableCompat.setTintList(this.checkedIcon, colorStateList);
                    int i5 = asInterface + 123;
                    d = i5 % 128;
                    int i6 = i5 % 2;
                }
                onStateChange(getState());
            }
        } else if (this.checkedIconTint != colorStateList) {
            this.checkedIconTint = colorStateList;
            if (canShowCheckedIcon()) {
                i = asInterface + 7;
                d = i % 128;
                if (i % 2 != 0) {
                    DrawableCompat.setTintList(this.checkedIcon, colorStateList);
                    throw null;
                }
                DrawableCompat.setTintList(this.checkedIcon, colorStateList);
                int i7 = asInterface + 123;
                d = i7 % 128;
                int i8 = i7 % 2;
            }
            onStateChange(getState());
        }
        int i9 = asInterface + 69;
        d = i9 % 128;
        int i10 = i9 % 2;
    }

    public MotionSpec getShowMotionSpec() {
        int i = 2 % 2;
        int i2 = asInterface + 99;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        MotionSpec motionSpec = this.showMotionSpec;
        int i5 = i3 + 105;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 46 / 0;
        }
        return motionSpec;
    }

    public void setShowMotionSpecResource(int i) {
        int i2 = 2 % 2;
        int i3 = d + 67;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        setShowMotionSpec(MotionSpec.createFromResource(this.context, i));
        int i5 = asInterface + 11;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public void setShowMotionSpec(MotionSpec motionSpec) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 59;
        d = i3 % 128;
        int i4 = i3 % 2;
        this.showMotionSpec = motionSpec;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 85;
        d = i5 % 128;
        int i6 = i5 % 2;
    }

    public MotionSpec getHideMotionSpec() {
        int i = 2 % 2;
        int i2 = asInterface + 35;
        d = i2 % 128;
        int i3 = i2 % 2;
        MotionSpec motionSpec = this.hideMotionSpec;
        if (i3 == 0) {
            int i4 = 48 / 0;
        }
        return motionSpec;
    }

    public void setHideMotionSpecResource(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 69;
        d = i3 % 128;
        int i4 = i3 % 2;
        setHideMotionSpec(MotionSpec.createFromResource(this.context, i));
        int i5 = asInterface + 85;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setHideMotionSpec(MotionSpec motionSpec) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 75;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        this.hideMotionSpec = motionSpec;
        int i5 = i2 + 65;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public float getChipStartPadding() {
        int i = 2 % 2;
        int i2 = asInterface + 75;
        int i3 = i2 % 128;
        d = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float f = this.chipStartPadding;
        int i4 = i3 + 39;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return f;
    }

    public void setChipStartPaddingResource(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 9;
        d = i3 % 128;
        int i4 = i3 % 2;
        setChipStartPadding(this.context.getResources().getDimension(i));
        int i5 = asInterface + 77;
        d = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setChipStartPadding(float f) {
        int i = 2 % 2;
        int i2 = asInterface + 113;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 18 / 0;
            if (this.chipStartPadding == f) {
                return;
            }
        } else if (this.chipStartPadding == f) {
            return;
        }
        this.chipStartPadding = f;
        invalidateSelf();
        onSizeChange();
        int i4 = d + 7;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public float getIconStartPadding() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 101;
        d = i3 % 128;
        int i4 = i3 % 2;
        float f = this.iconStartPadding;
        int i5 = i2 + 99;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setIconStartPaddingResource(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 3;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            setIconStartPadding(this.context.getResources().getDimension(i));
            throw null;
        }
        setIconStartPadding(this.context.getResources().getDimension(i));
        int i4 = asInterface + 85;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setIconStartPadding(float f) {
        int i = 2 % 2;
        int i2 = asInterface + 59;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        if (this.iconStartPadding != f) {
            int i5 = i3 + 115;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            float fCalculateChipIconWidth = calculateChipIconWidth();
            this.iconStartPadding = f;
            float fCalculateChipIconWidth2 = calculateChipIconWidth();
            invalidateSelf();
            if (fCalculateChipIconWidth != fCalculateChipIconWidth2) {
                onSizeChange();
                int i7 = asInterface + 77;
                d = i7 % 128;
                int i8 = i7 % 2;
            }
        }
    }

    public float getIconEndPadding() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 119;
        d = i3 % 128;
        int i4 = i3 % 2;
        float f = this.iconEndPadding;
        int i5 = i2 + 27;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setIconEndPaddingResource(int i) {
        int i2 = 2 % 2;
        int i3 = d + 117;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        setIconEndPadding(this.context.getResources().getDimension(i));
        int i5 = d + 123;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setIconEndPadding(float f) {
        int i = 2 % 2;
        int i2 = d + 19;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        if (this.iconEndPadding != f) {
            float fCalculateChipIconWidth = calculateChipIconWidth();
            this.iconEndPadding = f;
            float fCalculateChipIconWidth2 = calculateChipIconWidth();
            invalidateSelf();
            if (fCalculateChipIconWidth != fCalculateChipIconWidth2) {
                int i4 = asInterface + 123;
                d = i4 % 128;
                int i5 = i4 % 2;
                onSizeChange();
            }
        }
        int i6 = asInterface + 77;
        d = i6 % 128;
        int i7 = i6 % 2;
    }

    public float getTextStartPadding() {
        int i = 2 % 2;
        int i2 = d + 81;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        float f = this.textStartPadding;
        int i4 = i3 + 41;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
        return f;
    }

    public void setTextStartPaddingResource(int i) {
        int i2 = 2 % 2;
        int i3 = d + 19;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            setTextStartPadding(this.context.getResources().getDimension(i));
            int i4 = 38 / 0;
        } else {
            setTextStartPadding(this.context.getResources().getDimension(i));
        }
        int i5 = asInterface + 121;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setTextStartPadding(float f) {
        int i = 2 % 2;
        if (this.textStartPadding != f) {
            int i2 = asInterface + 81;
            d = i2 % 128;
            if (i2 % 2 == 0) {
                this.textStartPadding = f;
                invalidateSelf();
                onSizeChange();
                int i3 = 31 / 0;
            } else {
                this.textStartPadding = f;
                invalidateSelf();
                onSizeChange();
            }
        }
        int i4 = asInterface + 71;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    public float getTextEndPadding() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 47;
        d = i3 % 128;
        int i4 = i3 % 2;
        float f = this.textEndPadding;
        int i5 = i2 + 93;
        d = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public void setTextEndPaddingResource(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 5;
        d = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            setTextEndPadding(this.context.getResources().getDimension(i));
            obj.hashCode();
            throw null;
        }
        setTextEndPadding(this.context.getResources().getDimension(i));
        int i4 = asInterface + 111;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public void setTextEndPadding(float f) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 9;
        d = i3 % 128;
        int i4 = i3 % 2;
        if (this.textEndPadding != f) {
            int i5 = i2 + 11;
            d = i5 % 128;
            if (i5 % 2 != 0) {
                this.textEndPadding = f;
                invalidateSelf();
                onSizeChange();
            } else {
                this.textEndPadding = f;
                invalidateSelf();
                onSizeChange();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    public float getCloseIconStartPadding() {
        int i = 2 % 2;
        int i2 = asInterface + 25;
        int i3 = i2 % 128;
        d = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        float f = this.closeIconStartPadding;
        int i4 = i3 + 57;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return f;
        }
        obj.hashCode();
        throw null;
    }

    public void setCloseIconStartPaddingResource(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 41;
        d = i3 % 128;
        int i4 = i3 % 2;
        setCloseIconStartPadding(this.context.getResources().getDimension(i));
        if (i4 == 0) {
            throw null;
        }
    }

    public void setCloseIconStartPadding(float f) {
        int i = 2 % 2;
        if (this.closeIconStartPadding != f) {
            int i2 = asInterface + 43;
            d = i2 % 128;
            int i3 = i2 % 2;
            this.closeIconStartPadding = f;
            invalidateSelf();
            if (!showsCloseIcon()) {
                return;
            }
            int i4 = d + 17;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            onSizeChange();
            if (i5 != 0) {
                throw null;
            }
        }
    }

    public float getCloseIconEndPadding() {
        int i = 2 % 2;
        int i2 = d + 39;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return this.closeIconEndPadding;
        }
        throw null;
    }

    public void setCloseIconEndPaddingResource(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 99;
        d = i3 % 128;
        int i4 = i3 % 2;
        setCloseIconEndPadding(this.context.getResources().getDimension(i));
        int i5 = d + 99;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public void setCloseIconEndPadding(float f) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 113;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.closeIconEndPadding != f) {
            int i4 = i2 + 15;
            d = i4 % 128;
            int i5 = i4 % 2;
            this.closeIconEndPadding = f;
            invalidateSelf();
            if (showsCloseIcon()) {
                onSizeChange();
                int i6 = d + 37;
                asInterface = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 5 / 4;
                }
            }
        }
    }

    public float getChipEndPadding() {
        int i = 2 % 2;
        int i2 = d + 67;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return this.chipEndPadding;
        }
        throw null;
    }

    public void setChipEndPaddingResource(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 69;
        d = i3 % 128;
        int i4 = i3 % 2;
        setChipEndPadding(this.context.getResources().getDimension(i));
        int i5 = asInterface + 109;
        d = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setChipEndPadding(float f) {
        int i = 2 % 2;
        int i2 = d + 115;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        if (this.chipEndPadding != f) {
            int i5 = i3 + 29;
            d = i5 % 128;
            if (i5 % 2 == 0) {
                this.chipEndPadding = f;
                invalidateSelf();
                onSizeChange();
                throw null;
            }
            this.chipEndPadding = f;
            invalidateSelf();
            onSizeChange();
            int i6 = asInterface + 113;
            d = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public int getMaxWidth() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 61;
        d = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.maxWidth;
        int i6 = i2 + 17;
        d = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public void setMaxWidth(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 31;
        d = i4 % 128;
        int i5 = i4 % 2;
        this.maxWidth = i;
        int i6 = i3 + 9;
        d = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 72 / 0;
        }
    }

    boolean shouldDrawText() {
        int i = 2 % 2;
        int i2 = d + 73;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        boolean z = this.shouldDrawText;
        int i5 = i3 + 47;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 27 / 0;
        }
        return z;
    }

    void setShouldDrawText(boolean z) {
        int i = 2 % 2;
        int i2 = d + 41;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        this.shouldDrawText = z;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 27;
        d = i3 % 128;
        int i4 = i3 % 2 == 0 ? 25 : -3;
        int i5 = i2 + 9;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -6377398940819159759L;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -981105359;
        b = (char) 32341;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r7, short r8, int r9) {
        /*
            byte[] r0 = com.google.android.material.chip.ChipDrawable.$$c
            int r8 = r8 + 102
            int r7 = r7 * 3
            int r7 = r7 + 1
            int r9 = r9 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r8 = r9
            r4 = r2
            goto L28
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L21
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L21:
            int r9 = r9 + 1
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r6
        L28:
            int r9 = r9 + r3
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipDrawable.$$g(int, short, int):java.lang.String");
    }
}
