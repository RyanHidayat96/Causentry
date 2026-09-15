package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.DrawableUtils;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.text.BidiFormatter;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import com.bpjstku.data.promo.model.response.ProvinceItem;
import com.bpjstku.databinding.ActivityLoginBinding;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.CollapsingTextHelper;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.CornerTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import defpackage.deInitSession;
import defpackage.initSession;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import kotlin.io.encoding.Base64;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes4.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int BOX_BACKGROUND_FILLED = 1;
    public static final int BOX_BACKGROUND_NONE = 0;
    public static final int BOX_BACKGROUND_OUTLINE = 2;
    private static final int DEFAULT_PLACEHOLDER_FADE_DURATION = 87;
    private static final int DEF_STYLE_RES;
    private static final int[][] EDIT_TEXT_BACKGROUND_RIPPLE_STATE;
    public static final int END_ICON_CLEAR_TEXT = 2;
    public static final int END_ICON_CUSTOM = -1;
    public static final int END_ICON_DROPDOWN_MENU = 3;
    public static final int END_ICON_NONE = 0;
    public static final int END_ICON_PASSWORD_TOGGLE = 1;
    private static final int INVALID_MAX_LENGTH = -1;
    private static final int LABEL_SCALE_ANIMATION_DURATION = 167;
    private static final String LOG_TAG = "TextInputLayout";
    private static final int NO_WIDTH = -1;
    private static final int PLACEHOLDER_START_DELAY = 67;
    private static char[] TuitionPaymentFragmentbindingInflater1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private ValueAnimator animator;
    private boolean areCornerRadiiRtl;
    private MaterialShapeDrawable boxBackground;
    private boolean boxBackgroundApplied;
    private int boxBackgroundColor;
    private int boxBackgroundMode;
    private int boxCollapsedPaddingTopPx;
    private final int boxLabelCutoutPaddingPx;
    private int boxStrokeColor;
    private int boxStrokeWidthDefaultPx;
    private int boxStrokeWidthFocusedPx;
    private int boxStrokeWidthPx;
    private MaterialShapeDrawable boxUnderlineDefault;
    private MaterialShapeDrawable boxUnderlineFocused;
    final CollapsingTextHelper collapsingTextHelper;
    boolean counterEnabled;
    private int counterMaxLength;
    private int counterOverflowTextAppearance;
    private ColorStateList counterOverflowTextColor;
    private boolean counterOverflowed;
    private int counterTextAppearance;
    private ColorStateList counterTextColor;
    private TextView counterView;
    private ColorStateList cursorColor;
    private ColorStateList cursorErrorColor;
    private int defaultFilledBackgroundColor;
    private ColorStateList defaultHintTextColor;
    private int defaultStrokeColor;
    private int disabledColor;
    private int disabledFilledBackgroundColor;
    EditText editText;
    private final LinkedHashSet<OnEditTextAttachedListener> editTextAttachedListeners;
    private Drawable endDummyDrawable;
    private int endDummyDrawableWidth;
    private final EndCompoundLayout endLayout;
    private boolean expandedHintEnabled;
    private StateListDrawable filledDropDownMenuBackground;
    private int focusedFilledBackgroundColor;
    private int focusedStrokeColor;
    private ColorStateList focusedTextColor;
    private boolean globalLayoutListenerAdded;
    private CharSequence hint;
    private boolean hintAnimationEnabled;
    private boolean hintEnabled;
    private boolean hintExpanded;
    private int hoveredFilledBackgroundColor;
    private int hoveredStrokeColor;
    private boolean inDrawableStateChanged;
    private final IndicatorViewController indicatorViewController;
    private final FrameLayout inputFrame;
    private boolean isProvidingHint;
    private LengthCounter lengthCounter;
    private int maxEms;
    private int maxWidth;
    private int minEms;
    private int minWidth;
    private Drawable originalEditTextEndDrawable;
    int originalEditTextMinimumHeight;
    private CharSequence originalHint;
    private MaterialShapeDrawable outlinedDropDownMenuBackground;
    private boolean placeholderEnabled;
    private Fade placeholderFadeIn;
    private Fade placeholderFadeOut;
    private CharSequence placeholderText;
    private int placeholderTextAppearance;
    private ColorStateList placeholderTextColor;
    private TextView placeholderTextView;
    private boolean restoringSavedState;
    private ShapeAppearanceModel shapeAppearanceModel;
    private Drawable startDummyDrawable;
    private int startDummyDrawableWidth;
    private final StartCompoundLayout startLayout;
    private ColorStateList strokeErrorColor;
    private final Rect tmpBoundsRect;
    private final Rect tmpRect;
    private final RectF tmpRectF;
    private Typeface typeface;
    private static final byte[] $$c = {1, 115, -83, 116};
    private static final int $$f = 22;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {58, -51, 54, -115, 14, 0, -61, 56, -1, 21, -17, 5, 13, -6, -55, 53, 15, -8, 16, -1, -4, -3, -52, 70, 5, -6, -61, 65, 4, -9, 3, 9, -60, 32, 37, 1, -5, -17, 15, 20, -6, -36, 51, -15, 11, 8, -78, 77, 1, -24, 32, -15, 15, 7, -16, 4, 19, -78, 64, 14, 0, -61, 53, 17, 2, 5, -11, 8, 15, -18, 15, -66, Base64.padSymbol, 7, 8, -13, 15, -2, -11, 13, -60, 21, 7, 33, -50, 75, -37, -13, 9, -37, 31, 7, 29, -46, 74, -36, -13, 9, 35, -10, 13, -9, 8, 1, -28, 19, 26, -10, -6, 11, 8, -44, 46, -15, 8, 8, -6, 11, 8, 1, -1, -9, 0, 8, -6, 13, -1, 7, 0, -1, 7, -7, 1, 20, -11, -2, 20, -40, 36, -9, 3, 9, -6, 3, 3, -3, 22, -7, 10, -65, 1, -25, 20, -2, 19, -13, 7, -35, 43, -1, -4, 10, -4, 1};
    private static final int $$e = 226;
    private static final byte[] $$a = {60, 80, 13, 34, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 245;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int d = 1;
    private static int b = 0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface BoxBackgroundMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface EndIconMode {
    }

    public interface LengthCounter {
        int countLength(Editable editable);
    }

    public interface OnEditTextAttachedListener {
        void onEditTextAttached(TextInputLayout textInputLayout);
    }

    public interface OnEndIconChangedListener {
        void onEndIconChanged(TextInputLayout textInputLayout, int i);
    }

    private static void a(short s, short s2, int i, Object[] objArr) {
        int i2 = 98 - (s2 * 14);
        byte[] bArr = $$a;
        int i3 = 144 - s;
        byte[] bArr2 = new byte[i + 1];
        int i4 = -1;
        if (bArr == null) {
            i2 = (i3 + i) - 11;
            i3 = i3;
        }
        while (true) {
            i4++;
            int i5 = i3 + 1;
            bArr2[i4] = (byte) i2;
            if (i4 == i) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i2 = (i2 + bArr[i5]) - 11;
                i3 = i5;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(int r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.google.android.material.textfield.TextInputLayout.$$d
            int r9 = 111 - r9
            int r8 = r8 + 4
            int r7 = r7 + 1
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r9
            r4 = r2
            r9 = r8
            goto L27
        L11:
            r3 = r2
        L12:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L21
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L21:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L27:
            int r3 = r3 + r8
            int r8 = r9 + 1
            int r9 = r3 + (-2)
            r3 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.e(int, int, byte, java.lang.Object[]):void");
    }

    static /* synthetic */ boolean access$000(TextInputLayout textInputLayout) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 103;
        d = i2 % 128;
        int i3 = i2 % 2;
        boolean z = textInputLayout.restoringSavedState;
        if (i3 == 0) {
            int i4 = 29 / 0;
        }
        return z;
    }

    static /* synthetic */ boolean access$100(TextInputLayout textInputLayout) {
        int i = 2 % 2;
        int i2 = d + 7;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        boolean z = textInputLayout.placeholderEnabled;
        if (i4 != 0) {
            int i5 = 60 / 0;
        }
        int i6 = i3 + 11;
        d = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    static /* synthetic */ void access$200(TextInputLayout textInputLayout, Editable editable) {
        int i = 2 % 2;
        int i2 = d + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        textInputLayout.updatePlaceholderText(editable);
        if (i3 != 0) {
            int i4 = 24 / 0;
        }
        int i5 = d + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
    }

    static /* synthetic */ EndCompoundLayout access$300(TextInputLayout textInputLayout) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 55;
        d = i3 % 128;
        int i4 = i3 % 2;
        EndCompoundLayout endCompoundLayout = textInputLayout.endLayout;
        int i5 = i2 + 121;
        d = i5 % 128;
        int i6 = i5 % 2;
        return endCompoundLayout;
    }

    static /* synthetic */ StartCompoundLayout access$400(TextInputLayout textInputLayout) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 45;
        d = i3 % 128;
        int i4 = i3 % 2;
        StartCompoundLayout startCompoundLayout = textInputLayout.startLayout;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 33;
        d = i5 % 128;
        int i6 = i5 % 2;
        return startCompoundLayout;
    }

    static /* synthetic */ IndicatorViewController access$500(TextInputLayout textInputLayout) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        IndicatorViewController indicatorViewController = textInputLayout.indicatorViewController;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            return indicatorViewController;
        }
        throw null;
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        DEF_STYLE_RES = R.style.Widget_Design_TextInputLayout;
        EDIT_TEXT_BACKGROUND_RIPPLE_STATE = new int[][]{new int[]{android.R.attr.state_pressed}, new int[0]};
        int i = b + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ int lambda$new$0(Editable editable) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 33;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        if (editable != null) {
            return editable.length();
        }
        int i5 = i3 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void c(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int length;
        char[] cArr2;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr3 = TuitionPaymentFragmentbindingInflater1;
        int i4 = 1770390596;
        Object obj2 = null;
        if (cArr3 != null) {
            int i5 = $11 + 91;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int doubleTapTimeout = 2267 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 33;
                        byte b3 = (byte) ($$c[0] - 1);
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, doubleTapTimeout, keyRepeatTimeout, -1927765101, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i6++;
                    i4 = 1770390596;
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
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char doubleTapTimeout2 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int iCombineMeasuredStates = 2267 - View.combineMeasuredStates(0, 0);
            int mode = View.MeasureSpec.getMode(0) + 33;
            byte b5 = (byte) ($$c[0] - 1);
            byte b6 = b5;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(doubleTapTimeout2, iCombineMeasuredStates, mode, -1927765101, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i7 = $10 + 91;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char keyRepeatTimeout2 = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 49267);
                        int size = View.MeasureSpec.getSize(0) + 3261;
                        int trimmedLength = TextUtils.getTrimmedLength("") + 30;
                        byte b7 = $$c[0];
                        byte b8 = (byte) (b7 - 1);
                        byte b9 = b7;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(keyRepeatTimeout2, size, trimmedLength, -127612708, false, $$g(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cMyPid = (char) (22878 - (Process.myPid() >> 22));
                            int i9 = 594 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 17;
                            byte b10 = (byte) ($$c[0] - 1);
                            byte b11 = (byte) (b10 + 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMyPid, i9, minimumFlingVelocity, 1570859318, false, $$g(b10, b11, (byte) (b11 - 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        int i10 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i10];
                    } else {
                        obj = null;
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i11 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i12 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i11];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i12];
                        } else {
                            int i13 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i14 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i13];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i14];
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                obj2 = obj;
            }
        }
        int i15 = 0;
        while (i15 < i) {
            int i16 = $11;
            int i17 = i16 + 73;
            $10 = i17 % 128;
            if (i17 % 2 != 0) {
                cArr4[i15] = (char) (cArr4[i15] ^ 8173);
                i15 += 39;
            } else {
                cArr4[i15] = (char) (cArr4[i15] ^ 13722);
                i15++;
            }
            int i18 = i16 + 111;
            $10 = i18 % 128;
            int i19 = i18 % 2;
        }
        objArr[0] = new String(cArr4);
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textInputStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        int i2;
        int i3 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i3), attributeSet, i);
        this.minEms = -1;
        this.maxEms = -1;
        this.minWidth = -1;
        this.maxWidth = -1;
        this.indicatorViewController = new IndicatorViewController(this);
        this.lengthCounter = new LengthCounter() { // from class: com.google.android.material.textfield.TextInputLayout$$ExternalSyntheticLambda1
            @Override // com.google.android.material.textfield.TextInputLayout.LengthCounter
            public final int countLength(Editable editable) {
                return TextInputLayout.lambda$new$0(editable);
            }
        };
        this.tmpRect = new Rect();
        this.tmpBoundsRect = new Rect();
        this.tmpRectF = new RectF();
        this.editTextAttachedListeners = new LinkedHashSet<>();
        CollapsingTextHelper collapsingTextHelper = new CollapsingTextHelper(this);
        this.collapsingTextHelper = collapsingTextHelper;
        this.globalLayoutListenerAdded = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.inputFrame = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        collapsingTextHelper.setTextSizeInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        collapsingTextHelper.setPositionInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        collapsingTextHelper.setCollapsedTextGravity(8388659);
        TintTypedArray tintTypedArrayObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, R.styleable.TextInputLayout, i, i3, R.styleable.TextInputLayout_counterTextAppearance, R.styleable.TextInputLayout_counterOverflowTextAppearance, R.styleable.TextInputLayout_errorTextAppearance, R.styleable.TextInputLayout_helperTextTextAppearance, R.styleable.TextInputLayout_hintTextAppearance);
        StartCompoundLayout startCompoundLayout = new StartCompoundLayout(this, tintTypedArrayObtainTintedStyledAttributes);
        this.startLayout = startCompoundLayout;
        this.hintEnabled = tintTypedArrayObtainTintedStyledAttributes.getBoolean(R.styleable.TextInputLayout_hintEnabled, true);
        setHint(tintTypedArrayObtainTintedStyledAttributes.getText(R.styleable.TextInputLayout_android_hint));
        this.hintAnimationEnabled = tintTypedArrayObtainTintedStyledAttributes.getBoolean(R.styleable.TextInputLayout_hintAnimationEnabled, true);
        this.expandedHintEnabled = tintTypedArrayObtainTintedStyledAttributes.getBoolean(R.styleable.TextInputLayout_expandedHintEnabled, true);
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(R.styleable.TextInputLayout_android_minEms)) {
            setMinEms(tintTypedArrayObtainTintedStyledAttributes.getInt(R.styleable.TextInputLayout_android_minEms, -1));
        } else if (tintTypedArrayObtainTintedStyledAttributes.hasValue(R.styleable.TextInputLayout_android_minWidth)) {
            setMinWidth(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(R.styleable.TextInputLayout_android_minWidth, -1));
        }
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(R.styleable.TextInputLayout_android_maxEms)) {
            setMaxEms(tintTypedArrayObtainTintedStyledAttributes.getInt(R.styleable.TextInputLayout_android_maxEms, -1));
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
            d = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        } else if (tintTypedArrayObtainTintedStyledAttributes.hasValue(R.styleable.TextInputLayout_android_maxWidth)) {
            setMaxWidth(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(R.styleable.TextInputLayout_android_maxWidth, -1));
        }
        this.shapeAppearanceModel = ShapeAppearanceModel.builder(context2, attributeSet, i, i3).build();
        this.boxLabelCutoutPaddingPx = context2.getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.boxCollapsedPaddingTopPx = tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelOffset(R.styleable.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.boxStrokeWidthDefaultPx = tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(R.styleable.TextInputLayout_boxStrokeWidth, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_default));
        this.boxStrokeWidthFocusedPx = tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(R.styleable.TextInputLayout_boxStrokeWidthFocused, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.boxStrokeWidthPx = this.boxStrokeWidthDefaultPx;
        float dimension = tintTypedArrayObtainTintedStyledAttributes.getDimension(R.styleable.TextInputLayout_boxCornerRadiusTopStart, -1.0f);
        float dimension2 = tintTypedArrayObtainTintedStyledAttributes.getDimension(R.styleable.TextInputLayout_boxCornerRadiusTopEnd, -1.0f);
        float dimension3 = tintTypedArrayObtainTintedStyledAttributes.getDimension(R.styleable.TextInputLayout_boxCornerRadiusBottomEnd, -1.0f);
        float dimension4 = tintTypedArrayObtainTintedStyledAttributes.getDimension(R.styleable.TextInputLayout_boxCornerRadiusBottomStart, -1.0f);
        ShapeAppearanceModel.Builder builder = this.shapeAppearanceModel.toBuilder();
        if (dimension >= 0.0f) {
            builder.setTopLeftCornerSize(dimension);
            int i6 = d + 57;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 % 2;
            }
        }
        if (dimension2 >= 0.0f) {
            builder.setTopRightCornerSize(dimension2);
        }
        if (dimension3 >= 0.0f) {
            builder.setBottomRightCornerSize(dimension3);
            int i8 = 2 % 2;
        }
        if (dimension4 >= 0.0f) {
            builder.setBottomLeftCornerSize(dimension4);
        }
        this.shapeAppearanceModel = builder.build();
        ColorStateList colorStateList = MaterialResources.getColorStateList(context2, tintTypedArrayObtainTintedStyledAttributes, R.styleable.TextInputLayout_boxBackgroundColor);
        Object obj = null;
        if (colorStateList != null) {
            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 103;
            d = i9 % 128;
            if (i9 % 2 == 0) {
                int defaultColor = colorStateList.getDefaultColor();
                this.defaultFilledBackgroundColor = defaultColor;
                this.boxBackgroundColor = defaultColor;
                colorStateList.isStateful();
                obj.hashCode();
                throw null;
            }
            int defaultColor2 = colorStateList.getDefaultColor();
            this.defaultFilledBackgroundColor = defaultColor2;
            this.boxBackgroundColor = defaultColor2;
            if (colorStateList.isStateful()) {
                this.disabledFilledBackgroundColor = colorStateList.getColorForState(new int[]{-16842910}, -1);
                this.focusedFilledBackgroundColor = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
                this.hoveredFilledBackgroundColor = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
            } else {
                this.focusedFilledBackgroundColor = this.defaultFilledBackgroundColor;
                ColorStateList colorStateList2 = AppCompatResources.getColorStateList(context2, R.color.mtrl_filled_background_color);
                this.disabledFilledBackgroundColor = colorStateList2.getColorForState(new int[]{-16842910}, -1);
                this.hoveredFilledBackgroundColor = colorStateList2.getColorForState(new int[]{android.R.attr.state_hovered}, -1);
            }
        } else {
            this.boxBackgroundColor = 0;
            this.defaultFilledBackgroundColor = 0;
            this.disabledFilledBackgroundColor = 0;
            this.focusedFilledBackgroundColor = 0;
            this.hoveredFilledBackgroundColor = 0;
        }
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(R.styleable.TextInputLayout_android_textColorHint)) {
            int i10 = d + 57;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
            if (i10 % 2 != 0) {
                ColorStateList colorStateList3 = tintTypedArrayObtainTintedStyledAttributes.getColorStateList(R.styleable.TextInputLayout_android_textColorHint);
                this.focusedTextColor = colorStateList3;
                this.defaultHintTextColor = colorStateList3;
                obj.hashCode();
                throw null;
            }
            ColorStateList colorStateList4 = tintTypedArrayObtainTintedStyledAttributes.getColorStateList(R.styleable.TextInputLayout_android_textColorHint);
            this.focusedTextColor = colorStateList4;
            this.defaultHintTextColor = colorStateList4;
        }
        ColorStateList colorStateList5 = MaterialResources.getColorStateList(context2, tintTypedArrayObtainTintedStyledAttributes, R.styleable.TextInputLayout_boxStrokeColor);
        this.focusedStrokeColor = tintTypedArrayObtainTintedStyledAttributes.getColor(R.styleable.TextInputLayout_boxStrokeColor, 0);
        this.defaultStrokeColor = ContextCompat.getColor(context2, R.color.mtrl_textinput_default_box_stroke_color);
        this.disabledColor = ContextCompat.getColor(context2, R.color.mtrl_textinput_disabled_color);
        this.hoveredStrokeColor = ContextCompat.getColor(context2, R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateList5 != null) {
            int i11 = d + 105;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
            if (i11 % 2 != 0) {
                setBoxStrokeColorStateList(colorStateList5);
                int i12 = 78 / 0;
            } else {
                setBoxStrokeColorStateList(colorStateList5);
            }
        }
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(R.styleable.TextInputLayout_boxStrokeErrorColor)) {
            setBoxStrokeErrorColor(MaterialResources.getColorStateList(context2, tintTypedArrayObtainTintedStyledAttributes, R.styleable.TextInputLayout_boxStrokeErrorColor));
        }
        if (tintTypedArrayObtainTintedStyledAttributes.getResourceId(R.styleable.TextInputLayout_hintTextAppearance, -1) != -1) {
            setHintTextAppearance(tintTypedArrayObtainTintedStyledAttributes.getResourceId(R.styleable.TextInputLayout_hintTextAppearance, 0));
        }
        this.cursorColor = tintTypedArrayObtainTintedStyledAttributes.getColorStateList(R.styleable.TextInputLayout_cursorColor);
        this.cursorErrorColor = tintTypedArrayObtainTintedStyledAttributes.getColorStateList(R.styleable.TextInputLayout_cursorErrorColor);
        int resourceId = tintTypedArrayObtainTintedStyledAttributes.getResourceId(R.styleable.TextInputLayout_errorTextAppearance, 0);
        CharSequence text = tintTypedArrayObtainTintedStyledAttributes.getText(R.styleable.TextInputLayout_errorContentDescription);
        int i13 = tintTypedArrayObtainTintedStyledAttributes.getInt(R.styleable.TextInputLayout_errorAccessibilityLiveRegion, 1);
        boolean z = tintTypedArrayObtainTintedStyledAttributes.getBoolean(R.styleable.TextInputLayout_errorEnabled, false);
        int resourceId2 = tintTypedArrayObtainTintedStyledAttributes.getResourceId(R.styleable.TextInputLayout_helperTextTextAppearance, 0);
        boolean z2 = tintTypedArrayObtainTintedStyledAttributes.getBoolean(R.styleable.TextInputLayout_helperTextEnabled, false);
        CharSequence text2 = tintTypedArrayObtainTintedStyledAttributes.getText(R.styleable.TextInputLayout_helperText);
        int resourceId3 = tintTypedArrayObtainTintedStyledAttributes.getResourceId(R.styleable.TextInputLayout_placeholderTextAppearance, 0);
        CharSequence text3 = tintTypedArrayObtainTintedStyledAttributes.getText(R.styleable.TextInputLayout_placeholderText);
        boolean z3 = tintTypedArrayObtainTintedStyledAttributes.getBoolean(R.styleable.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(tintTypedArrayObtainTintedStyledAttributes.getInt(R.styleable.TextInputLayout_counterMaxLength, -1));
        this.counterTextAppearance = tintTypedArrayObtainTintedStyledAttributes.getResourceId(R.styleable.TextInputLayout_counterTextAppearance, 0);
        this.counterOverflowTextAppearance = tintTypedArrayObtainTintedStyledAttributes.getResourceId(R.styleable.TextInputLayout_counterOverflowTextAppearance, 0);
        setBoxBackgroundMode(tintTypedArrayObtainTintedStyledAttributes.getInt(R.styleable.TextInputLayout_boxBackgroundMode, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i13);
        setCounterOverflowTextAppearance(this.counterOverflowTextAppearance);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.counterTextAppearance);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(R.styleable.TextInputLayout_errorTextColor)) {
            setErrorTextColor(tintTypedArrayObtainTintedStyledAttributes.getColorStateList(R.styleable.TextInputLayout_errorTextColor));
        }
        if (!(!tintTypedArrayObtainTintedStyledAttributes.hasValue(R.styleable.TextInputLayout_helperTextTextColor))) {
            setHelperTextColor(tintTypedArrayObtainTintedStyledAttributes.getColorStateList(R.styleable.TextInputLayout_helperTextTextColor));
        }
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(R.styleable.TextInputLayout_hintTextColor)) {
            setHintTextColor(tintTypedArrayObtainTintedStyledAttributes.getColorStateList(R.styleable.TextInputLayout_hintTextColor));
            i2 = 2;
            int i14 = 2 % 2;
        } else {
            i2 = 2;
        }
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(R.styleable.TextInputLayout_counterTextColor)) {
            setCounterTextColor(tintTypedArrayObtainTintedStyledAttributes.getColorStateList(R.styleable.TextInputLayout_counterTextColor));
            int i15 = i2 % i2;
        }
        if (!(!tintTypedArrayObtainTintedStyledAttributes.hasValue(R.styleable.TextInputLayout_counterOverflowTextColor))) {
            setCounterOverflowTextColor(tintTypedArrayObtainTintedStyledAttributes.getColorStateList(R.styleable.TextInputLayout_counterOverflowTextColor));
        }
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(R.styleable.TextInputLayout_placeholderTextColor)) {
            setPlaceholderTextColor(tintTypedArrayObtainTintedStyledAttributes.getColorStateList(R.styleable.TextInputLayout_placeholderTextColor));
        }
        EndCompoundLayout endCompoundLayout = new EndCompoundLayout(this, tintTypedArrayObtainTintedStyledAttributes);
        this.endLayout = endCompoundLayout;
        boolean z4 = tintTypedArrayObtainTintedStyledAttributes.getBoolean(R.styleable.TextInputLayout_android_enabled, true);
        tintTypedArrayObtainTintedStyledAttributes.recycle();
        ViewCompat.setImportantForAccessibility(this, 2);
        if (Build.VERSION.SDK_INT >= 26) {
            ViewCompat.setImportantForAutofill(this, 1);
        }
        frameLayout.addView(startCompoundLayout);
        frameLayout.addView(endCompoundLayout);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    /* JADX INFO: renamed from: lambda$onGlobalLayout$1$com-google-android-material-textfield-TextInputLayout, reason: not valid java name */
    /* synthetic */ void m7909xa47602b9() {
        int i = 2 % 2;
        int i2 = d + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.editText.requestLayout();
        int i4 = d + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 13 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003e  */
    /* JADX WARN: Code duplicated, block: B:12:0x0049 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x004a  */
    /* JADX WARN: Code duplicated, block: B:9:0x003c A[DONT_INVERT, PHI: r3
  0x003c: PHI (r3v1 boolean) = (r3v0 boolean), (r3v2 boolean) binds: [B:8:0x003a, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        boolean zUpdateDummyDrawables;
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 69;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            this.endLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.globalLayoutListenerAdded = true;
            boolean zUpdateEditTextHeightBasedOnIcon = updateEditTextHeightBasedOnIcon();
            zUpdateDummyDrawables = updateDummyDrawables();
            if (!zUpdateEditTextHeightBasedOnIcon) {
                if (!zUpdateDummyDrawables) {
                    i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
                    d = i % 128;
                    if (i % 2 != 0) {
                        throw null;
                    }
                    return;
                }
            }
        } else {
            this.endLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.globalLayoutListenerAdded = false;
            boolean zUpdateEditTextHeightBasedOnIcon2 = updateEditTextHeightBasedOnIcon();
            zUpdateDummyDrawables = updateDummyDrawables();
            if (!zUpdateEditTextHeightBasedOnIcon2) {
                if (!zUpdateDummyDrawables) {
                    i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
                    d = i % 128;
                    if (i % 2 != 0) {
                        throw null;
                    }
                    return;
                }
            }
        }
        this.editText.post(new Runnable() { // from class: com.google.android.material.textfield.TextInputLayout$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m7909xa47602b9();
            }
        });
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 45;
        d = i3 % 128;
        int i4 = i3 % 2;
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            this.inputFrame.addView(view, layoutParams2);
            this.inputFrame.setLayoutParams(layoutParams);
            updateInputLayoutMargins();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 107;
        d = i5 % 128;
        int i6 = i5 % 2;
    }

    MaterialShapeDrawable getBoxBackground() {
        int i = 2 % 2;
        int i2 = d + 101;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        int i5 = this.boxBackgroundMode;
        if (i5 != 1) {
            int i6 = i3 + 9;
            d = i6 % 128;
            if (i6 % 2 != 0 ? i5 != 2 : i5 != 4) {
                throw new IllegalStateException();
            }
        }
        return this.boxBackground;
    }

    public void setBoxBackgroundMode(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 97;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (i != this.boxBackgroundMode) {
            this.boxBackgroundMode = i;
            if (this.editText != null) {
                onApplyBoxBackgroundMode();
                int i4 = d + 39;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        int i6 = d + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
        int i7 = i6 % 2;
    }

    public int getBoxBackgroundMode() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 43;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return this.boxBackgroundMode;
        }
        throw null;
    }

    private void onApplyBoxBackgroundMode() {
        int i = 2 % 2;
        assignBoxBackgroundByMode();
        updateEditTextBoxBackgroundIfNeeded();
        updateTextInputBoxState();
        updateBoxCollapsedPaddingTop();
        adjustFilledEditTextPaddingForLargeFont();
        if (this.boxBackgroundMode != 0) {
            int i2 = d + 73;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            updateInputLayoutMargins();
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 41;
            d = i4 % 128;
            int i5 = i4 % 2;
        }
        setDropDownMenuBackgroundIfNeeded();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004f  */
    private void assignBoxBackgroundByMode() {
        int i = 2 % 2;
        int i2 = this.boxBackgroundMode;
        if (i2 == 0) {
            this.boxBackground = null;
            this.boxUnderlineDefault = null;
            this.boxUnderlineFocused = null;
            return;
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 91;
        int i4 = i3 % 128;
        d = i4;
        int i5 = i3 % 2;
        if (i2 == 1) {
            this.boxBackground = new MaterialShapeDrawable(this.shapeAppearanceModel);
            this.boxUnderlineDefault = new MaterialShapeDrawable();
            this.boxUnderlineFocused = new MaterialShapeDrawable();
            return;
        }
        if (i2 != 2) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.boxBackgroundMode);
            sb.append(" is illegal; only @BoxBackgroundMode constants are supported.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (this.hintEnabled) {
            int i6 = i4 + 111;
            int i7 = i6 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7;
            int i8 = i6 % 2;
            if (this.boxBackground instanceof CutoutDrawable) {
                this.boxBackground = new MaterialShapeDrawable(this.shapeAppearanceModel);
            } else {
                int i9 = i7 + 93;
                d = i9 % 128;
                if (i9 % 2 == 0) {
                    this.boxBackground = CutoutDrawable.create(this.shapeAppearanceModel);
                    int i10 = 62 / 0;
                } else {
                    this.boxBackground = CutoutDrawable.create(this.shapeAppearanceModel);
                }
                int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
                d = i11 % 128;
                int i12 = i11 % 2;
            }
        } else {
            this.boxBackground = new MaterialShapeDrawable(this.shapeAppearanceModel);
        }
        this.boxUnderlineDefault = null;
        this.boxUnderlineFocused = null;
    }

    void updateEditTextBoxBackgroundIfNeeded() {
        int i = 2 % 2;
        EditText editText = this.editText;
        Object obj = null;
        if (editText != null && this.boxBackground != null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 75;
            d = i2 % 128;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if ((this.boxBackgroundApplied || editText.getBackground() == null) && this.boxBackgroundMode != 0) {
                updateEditTextBoxBackground();
                this.boxBackgroundApplied = true;
            }
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 25;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    private void updateEditTextBoxBackground() {
        int i = 2 % 2;
        int i2 = d + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        ViewCompat.setBackground(this.editText, getEditTextBoxBackground());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 23;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private Drawable getEditTextBoxBackground() {
        int i = 2 % 2;
        EditText editText = this.editText;
        if (!(editText instanceof AutoCompleteTextView) || EditTextUtils.isEditable(editText)) {
            return this.boxBackground;
        }
        int color = MaterialColors.getColor(this.editText, R.attr.colorControlHighlight);
        int i2 = this.boxBackgroundMode;
        Object obj = null;
        if (i2 != 2) {
            if (i2 == 1) {
                return getFilledBoxBackgroundWithRipple(this.boxBackground, this.boxBackgroundColor, color, EDIT_TEXT_BACKGROUND_RIPPLE_STATE);
            }
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 5;
            d = i3 % 128;
            if (i3 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            getOutlinedBoxBackgroundWithRipple(getContext(), this.boxBackground, color, EDIT_TEXT_BACKGROUND_RIPPLE_STATE);
            obj.hashCode();
            throw null;
        }
        Drawable outlinedBoxBackgroundWithRipple = getOutlinedBoxBackgroundWithRipple(getContext(), this.boxBackground, color, EDIT_TEXT_BACKGROUND_RIPPLE_STATE);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 75;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return outlinedBoxBackgroundWithRipple;
        }
        throw null;
    }

    private static Drawable getOutlinedBoxBackgroundWithRipple(Context context, MaterialShapeDrawable materialShapeDrawable, int i, int[][] iArr) {
        int i2 = 2 % 2;
        int color = MaterialColors.getColor(context, R.attr.colorSurface, LOG_TAG);
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(materialShapeDrawable.getShapeAppearanceModel());
        int iLayer = MaterialColors.layer(i, color, 0.1f);
        materialShapeDrawable2.setFillColor(new ColorStateList(iArr, new int[]{iLayer, 0}));
        materialShapeDrawable2.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iLayer, color});
        MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(materialShapeDrawable.getShapeAppearanceModel());
        materialShapeDrawable3.setTint(-1);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, materialShapeDrawable2, materialShapeDrawable3), materialShapeDrawable});
        int i3 = d + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 == 0) {
            return layerDrawable;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static Drawable getFilledBoxBackgroundWithRipple(MaterialShapeDrawable materialShapeDrawable, int i, int i2, int[][] iArr) {
        int i3 = 2 % 2;
        RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(iArr, new int[]{MaterialColors.layer(i2, i, 0.1f), i}), materialShapeDrawable, materialShapeDrawable);
        int i4 = d + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            return rippleDrawable;
        }
        throw null;
    }

    private void setDropDownMenuBackgroundIfNeeded() {
        int i = 2 % 2;
        EditText editText = this.editText;
        if (!(editText instanceof AutoCompleteTextView)) {
            return;
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 107;
        d = i2 % 128;
        int i3 = i2 % 2;
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        if (autoCompleteTextView.getDropDownBackground() == null) {
            int i4 = d + 105;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = this.boxBackgroundMode;
            if (i6 != 2) {
                if (i6 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            } else {
                autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                int i7 = d + 101;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
                int i8 = i7 % 2;
            }
        }
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 93;
        d = i3 % 128;
        int i4 = i3 % 2;
        if (this.outlinedDropDownMenuBackground == null) {
            int i5 = i2 + 77;
            d = i5 % 128;
            if (i5 % 2 == 0) {
                this.outlinedDropDownMenuBackground = getDropDownMaterialShapeDrawable(false);
            } else {
                this.outlinedDropDownMenuBackground = getDropDownMaterialShapeDrawable(true);
            }
        }
        return this.outlinedDropDownMenuBackground;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 33;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.filledDropDownMenuBackground == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.filledDropDownMenuBackground = stateListDrawable;
            stateListDrawable.addState(new int[]{android.R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.filledDropDownMenuBackground.addState(new int[0], getDropDownMaterialShapeDrawable(false));
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 5;
            d = i3 % 128;
            int i4 = i3 % 2;
        }
        return this.filledDropDownMenuBackground;
    }

    private MaterialShapeDrawable getDropDownMaterialShapeDrawable(boolean z) {
        float f;
        float dimensionPixelOffset;
        int i = 2 % 2;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        if (!z) {
            f = 0.0f;
        } else {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 123;
            d = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            f = dimensionPixelOffset2;
        }
        EditText editText = this.editText;
        if (editText instanceof MaterialAutoCompleteTextView) {
            dimensionPixelOffset = ((MaterialAutoCompleteTextView) editText).getPopupElevation();
        } else {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        }
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ShapeAppearanceModel shapeAppearanceModelBuild = ShapeAppearanceModel.builder().setTopLeftCornerSize(f).setTopRightCornerSize(f).setBottomLeftCornerSize(dimensionPixelOffset2).setBottomRightCornerSize(dimensionPixelOffset2).build();
        EditText editText2 = this.editText;
        MaterialShapeDrawable materialShapeDrawableCreateWithElevationOverlay = MaterialShapeDrawable.createWithElevationOverlay(getContext(), dimensionPixelOffset, editText2 instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText2).getDropDownBackgroundTintList() : null);
        materialShapeDrawableCreateWithElevationOverlay.setShapeAppearanceModel(shapeAppearanceModelBuild);
        materialShapeDrawableCreateWithElevationOverlay.setPadding(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 113;
        d = i3 % 128;
        int i4 = i3 % 2;
        return materialShapeDrawableCreateWithElevationOverlay;
    }

    private void updateBoxCollapsedPaddingTop() {
        int i = 2 % 2;
        if (this.boxBackgroundMode == 1) {
            if (MaterialResources.isFontScaleAtLeast2_0(getContext())) {
                this.boxCollapsedPaddingTopPx = getResources().getDimensionPixelSize(R.dimen.material_font_2_0_box_collapsed_padding_top);
                return;
            } else if (MaterialResources.isFontScaleAtLeast1_3(getContext())) {
                int i2 = d + 123;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                if (i2 % 2 != 0) {
                    this.boxCollapsedPaddingTopPx = getResources().getDimensionPixelSize(R.dimen.material_font_1_3_box_collapsed_padding_top);
                    int i3 = 86 / 0;
                } else {
                    this.boxCollapsedPaddingTopPx = getResources().getDimensionPixelSize(R.dimen.material_font_1_3_box_collapsed_padding_top);
                }
            }
        }
        int i4 = d + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 6 / 0;
        }
    }

    private void adjustFilledEditTextPaddingForLargeFont() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 79;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this.editText == null || this.boxBackgroundMode != 1) {
            return;
        }
        if (!MaterialResources.isFontScaleAtLeast2_0(getContext())) {
            if (MaterialResources.isFontScaleAtLeast1_3(getContext())) {
                EditText editText = this.editText;
                ViewCompat.setPaddingRelative(editText, ViewCompat.getPaddingStart(editText), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_top), ViewCompat.getPaddingEnd(this.editText), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_bottom));
                int i3 = d + 87;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            return;
        }
        int i5 = d + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        EditText editText2 = this.editText;
        ViewCompat.setPaddingRelative(editText2, ViewCompat.getPaddingStart(editText2), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_top), ViewCompat.getPaddingEnd(this.editText), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        int i7 = d + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        int i2 = 2 % 2;
        int i3 = d + 61;
        int i4 = i3 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4;
        int i5 = i3 % 2;
        this.boxCollapsedPaddingTopPx = i;
        int i6 = i4 + 63;
        d = i6 % 128;
        int i7 = i6 % 2;
    }

    public int getBoxCollapsedPaddingTop() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 73;
        d = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.boxCollapsedPaddingTopPx;
        int i6 = i2 + 81;
        d = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public void setBoxStrokeWidthResource(int i) {
        int i2 = 2 % 2;
        int i3 = d + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 113;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public void setBoxStrokeWidth(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
        d = i3 % 128;
        if (i3 % 2 != 0) {
            this.boxStrokeWidthDefaultPx = i;
            updateTextInputBoxState();
        } else {
            this.boxStrokeWidthDefaultPx = i;
            updateTextInputBoxState();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public int getBoxStrokeWidth() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 35;
        d = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.boxStrokeWidthDefaultPx;
        int i6 = i2 + 17;
        d = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 14 / 0;
        }
        return i5;
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 105;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
            throw null;
        }
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 89;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setBoxStrokeWidthFocused(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 103;
        d = i3 % 128;
        int i4 = i3 % 2;
        this.boxStrokeWidthFocusedPx = i;
        updateTextInputBoxState();
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 125;
        d = i5 % 128;
        int i6 = i5 % 2;
    }

    public int getBoxStrokeWidthFocused() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 45;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        int i5 = this.boxStrokeWidthFocusedPx;
        int i6 = i3 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 43 / 0;
        }
        return i5;
    }

    public void setBoxStrokeColor(int i) {
        int i2 = 2 % 2;
        int i3 = d + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 91 / 0;
            if (this.focusedStrokeColor == i) {
                return;
            }
        } else if (this.focusedStrokeColor == i) {
            return;
        }
        this.focusedStrokeColor = i;
        updateTextInputBoxState();
        int i5 = d + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public int getBoxStrokeColor() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.focusedStrokeColor;
        int i6 = i2 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x007b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x007c  */
    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int i;
        int i2;
        int i3 = 2 % 2;
        if (!colorStateList.isStateful()) {
            if (this.focusedStrokeColor != colorStateList.getDefaultColor()) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 21;
                d = i4 % 128;
                if (i4 % 2 == 0) {
                    this.focusedStrokeColor = colorStateList.getDefaultColor();
                    int i5 = 79 / 0;
                } else {
                    this.focusedStrokeColor = colorStateList.getDefaultColor();
                }
                i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 51;
            }
            updateTextInputBoxState();
            i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 61;
            d = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.defaultStrokeColor = colorStateList.getDefaultColor();
        this.disabledColor = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.hoveredStrokeColor = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
        this.focusedStrokeColor = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 37;
        d = i % 128;
        int i6 = i % 2;
        updateTextInputBoxState();
        i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 61;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (this.strokeErrorColor != colorStateList) {
            int i4 = i2 + 83;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            if (i4 % 2 == 0) {
                this.strokeErrorColor = colorStateList;
                updateTextInputBoxState();
            } else {
                this.strokeErrorColor = colorStateList;
                updateTextInputBoxState();
                throw null;
            }
        }
    }

    public ColorStateList getBoxStrokeErrorColor() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
        int i3 = i2 % 128;
        d = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ColorStateList colorStateList = this.strokeErrorColor;
        int i4 = i3 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return colorStateList;
    }

    public void setBoxBackgroundColorResource(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 79;
        d = i3 % 128;
        int i4 = i3 % 2;
        setBoxBackgroundColor(ContextCompat.getColor(getContext(), i));
        int i5 = d + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public void setBoxBackgroundColor(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = i3 + 69;
        d = i4 % 128;
        int i5 = i4 % 2;
        if (this.boxBackgroundColor != i) {
            int i6 = i3 + 5;
            d = i6 % 128;
            if (i6 % 2 != 0) {
                this.boxBackgroundColor = i;
                this.defaultFilledBackgroundColor = i;
                this.focusedFilledBackgroundColor = i;
                this.hoveredFilledBackgroundColor = i;
                applyBoxAttributes();
                return;
            }
            this.boxBackgroundColor = i;
            this.defaultFilledBackgroundColor = i;
            this.focusedFilledBackgroundColor = i;
            this.hoveredFilledBackgroundColor = i;
            applyBoxAttributes();
            int i7 = 40 / 0;
        }
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 27;
        d = i2 % 128;
        int i3 = i2 % 2;
        int defaultColor = colorStateList.getDefaultColor();
        this.defaultFilledBackgroundColor = defaultColor;
        this.boxBackgroundColor = defaultColor;
        this.disabledFilledBackgroundColor = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.focusedFilledBackgroundColor = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        this.hoveredFilledBackgroundColor = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
        applyBoxAttributes();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 103;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public int getBoxBackgroundColor() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 103;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        int i5 = this.boxBackgroundColor;
        int i6 = i3 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 45;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        MaterialShapeDrawable materialShapeDrawable = this.boxBackground;
        if (materialShapeDrawable != null) {
            int i5 = i3 + 69;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
            if (materialShapeDrawable.getShapeAppearanceModel() != shapeAppearanceModel) {
                this.shapeAppearanceModel = shapeAppearanceModel;
                applyBoxAttributes();
            }
        }
    }

    public ShapeAppearanceModel getShapeAppearanceModel() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 37;
        d = i2 % 128;
        int i3 = i2 % 2;
        ShapeAppearanceModel shapeAppearanceModel = this.shapeAppearanceModel;
        if (i3 == 0) {
            int i4 = 34 / 0;
        }
        return shapeAppearanceModel;
    }

    public void setBoxCornerFamily(int i) {
        int i2 = 2 % 2;
        int i3 = d + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        this.shapeAppearanceModel = this.shapeAppearanceModel.toBuilder().setTopLeftCorner(i, this.shapeAppearanceModel.getTopLeftCornerSize()).setTopRightCorner(i, this.shapeAppearanceModel.getTopRightCornerSize()).setBottomLeftCorner(i, this.shapeAppearanceModel.getBottomLeftCornerSize()).setBottomRightCorner(i, this.shapeAppearanceModel.getBottomRightCornerSize()).build();
        applyBoxAttributes();
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 109;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public void setBoxCornerRadiiResources(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 93;
        d = i6 % 128;
        int i7 = i6 % 2;
        setBoxCornerRadii(getContext().getResources().getDimension(i), getContext().getResources().getDimension(i2), getContext().getResources().getDimension(i4), getContext().getResources().getDimension(i3));
        int i8 = d + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
        int i9 = i8 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0063  */
    /* JADX WARN: Code duplicated, block: B:30:0x006d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0080  */
    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    public void setBoxCornerRadii(float f, float f2, float f3, float f4) {
        int i;
        int i2 = 2 % 2;
        int i3 = d + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
        this.areCornerRadiiRtl = zIsLayoutRtl;
        float f5 = zIsLayoutRtl ? f2 : f;
        if (!zIsLayoutRtl) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 47;
            d = i5 % 128;
            if (i5 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            f = f2;
        }
        float f6 = zIsLayoutRtl ? f4 : f3;
        if (!zIsLayoutRtl) {
            f3 = f4;
        }
        MaterialShapeDrawable materialShapeDrawable = this.boxBackground;
        if (materialShapeDrawable != null && materialShapeDrawable.getTopLeftCornerResolvedSize() == f5) {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 73;
            d = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 23 / 0;
                if (this.boxBackground.getTopRightCornerResolvedSize() == f) {
                    if (this.boxBackground.getBottomLeftCornerResolvedSize() == f6) {
                        int i8 = d + 121;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
                        int i9 = i8 % 2;
                        if (this.boxBackground.getBottomRightCornerResolvedSize() == f3) {
                            i = d + 125;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
                            if (i % 2 != 0) {
                                int i10 = 88 / 0;
                                return;
                            }
                            return;
                        }
                    }
                }
            } else if (this.boxBackground.getTopRightCornerResolvedSize() == f) {
                if (this.boxBackground.getBottomLeftCornerResolvedSize() == f6) {
                    int i11 = d + 121;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                    int i12 = i11 % 2;
                    if (this.boxBackground.getBottomRightCornerResolvedSize() == f3) {
                        i = d + 125;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
                        if (i % 2 != 0) {
                            int i13 = 88 / 0;
                            return;
                        }
                        return;
                    }
                }
            }
        }
        this.shapeAppearanceModel = this.shapeAppearanceModel.toBuilder().setTopLeftCornerSize(f5).setTopRightCornerSize(f).setBottomLeftCornerSize(f6).setBottomRightCornerSize(f3).build();
        applyBoxAttributes();
        int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 125;
        d = i14 % 128;
        int i15 = i14 % 2;
    }

    public float getBoxCornerRadiusTopStart() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 97;
        d = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if (ViewUtils.isLayoutRtl(this)) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 99;
            d = i4 % 128;
            if (i4 % 2 != 0) {
                return this.shapeAppearanceModel.getTopRightCornerSize().getCornerSize(this.tmpRectF);
            }
            this.shapeAppearanceModel.getTopRightCornerSize().getCornerSize(this.tmpRectF);
            obj.hashCode();
            throw null;
        }
        float cornerSize = this.shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(this.tmpRectF);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 79;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return cornerSize;
        }
        obj.hashCode();
        throw null;
    }

    public float getBoxCornerRadiusTopEnd() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 105;
        d = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            ViewUtils.isLayoutRtl(this);
            obj.hashCode();
            throw null;
        }
        if (!ViewUtils.isLayoutRtl(this)) {
            return this.shapeAppearanceModel.getTopRightCornerSize().getCornerSize(this.tmpRectF);
        }
        int i3 = d + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        float cornerSize = this.shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(this.tmpRectF);
        int i5 = d + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            return cornerSize;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        return r4.shapeAppearanceModel.getBottomRightCornerSize().getCornerSize(r4.tmpRectF);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (com.google.android.material.internal.ViewUtils.isLayoutRtl(r4) != true) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (com.google.android.material.internal.ViewUtils.isLayoutRtl(r4) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        r1 = r4.shapeAppearanceModel.getBottomLeftCornerSize().getCornerSize(r4.tmpRectF);
        r2 = com.google.android.material.textfield.TextInputLayout.d + 15;
        com.google.android.material.textfield.TextInputLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r2 % 128;
        r2 = r2 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float getBoxCornerRadiusBottomEnd() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.material.textfield.TextInputLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            int r1 = r1 + 77
            int r2 = r1 % 128
            com.google.android.material.textfield.TextInputLayout.d = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1a
            boolean r1 = com.google.android.material.internal.ViewUtils.isLayoutRtl(r4)
            r2 = 38
            int r2 = r2 / 0
            r2 = 1
            if (r1 == r2) goto L20
            goto L36
        L1a:
            boolean r1 = com.google.android.material.internal.ViewUtils.isLayoutRtl(r4)
            if (r1 == 0) goto L36
        L20:
            com.google.android.material.shape.ShapeAppearanceModel r1 = r4.shapeAppearanceModel
            com.google.android.material.shape.CornerSize r1 = r1.getBottomLeftCornerSize()
            android.graphics.RectF r2 = r4.tmpRectF
            float r1 = r1.getCornerSize(r2)
            int r2 = com.google.android.material.textfield.TextInputLayout.d
            int r2 = r2 + 15
            int r3 = r2 % 128
            com.google.android.material.textfield.TextInputLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r3
            int r2 = r2 % r0
            return r1
        L36:
            com.google.android.material.shape.ShapeAppearanceModel r0 = r4.shapeAppearanceModel
            com.google.android.material.shape.CornerSize r0 = r0.getBottomRightCornerSize()
            android.graphics.RectF r1 = r4.tmpRectF
            float r0 = r0.getCornerSize(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.getBoxCornerRadiusBottomEnd():float");
    }

    public float getBoxCornerRadiusBottomStart() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            ViewUtils.isLayoutRtl(this);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!ViewUtils.isLayoutRtl(this)) {
            return this.shapeAppearanceModel.getBottomLeftCornerSize().getCornerSize(this.tmpRectF);
        }
        float cornerSize = this.shapeAppearanceModel.getBottomRightCornerSize().getCornerSize(this.tmpRectF);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 23;
        d = i3 % 128;
        int i4 = i3 % 2;
        return cornerSize;
    }

    public void setTypeface(Typeface typeface) {
        int i = 2 % 2;
        int i2 = d + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (typeface != this.typeface) {
            this.typeface = typeface;
            this.collapsingTextHelper.setTypefaces(typeface);
            this.indicatorViewController.setTypefaces(typeface);
            TextView textView = this.counterView;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 73;
        d = i3 % 128;
        int i4 = i3 % 2;
    }

    public Typeface getTypeface() {
        int i = 2 % 2;
        int i2 = d + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.typeface;
        }
        throw null;
    }

    public void setLengthCounter(LengthCounter lengthCounter) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 35;
        d = i3 % 128;
        int i4 = i3 % 2;
        this.lengthCounter = lengthCounter;
        int i5 = i2 + 71;
        d = i5 % 128;
        int i6 = i5 % 2;
    }

    public LengthCounter getLengthCounter() {
        int i = 2 % 2;
        int i2 = d + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        LengthCounter lengthCounter = this.lengthCounter;
        if (i3 != 0) {
            int i4 = 55 / 0;
        }
        return lengthCounter;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        int i2 = 2 % 2;
        EditText editText = this.editText;
        if (editText == null) {
            int i3 = d + 37;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            if (i3 % 2 == 0) {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } else {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                throw null;
            }
        }
        int i4 = 0;
        if (this.originalHint != null) {
            boolean z = this.isProvidingHint;
            this.isProvidingHint = false;
            CharSequence hint = editText.getHint();
            this.editText.setHint(this.originalHint);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.editText.setHint(hint);
                this.isProvidingHint = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        viewStructure.setChildCount(this.inputFrame.getChildCount());
        while (i4 < this.inputFrame.getChildCount()) {
            View childAt = this.inputFrame.getChildAt(i4);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i4);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.editText) {
                int i5 = d + 111;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
                int i6 = i5 % 2;
                viewStructureNewChild.setHint(getHint());
            }
            i4++;
            int i7 = d + 77;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    private void setEditText(EditText editText) {
        int i = 2 % 2;
        int i2 = d + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this.editText != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        getEndIconMode();
        this.editText = editText;
        int i3 = this.minEms;
        if (i3 != -1) {
            setMinEms(i3);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 15;
            d = i4 % 128;
            int i5 = i4 % 2;
        } else {
            setMinWidth(this.minWidth);
        }
        int i6 = this.maxEms;
        if (i6 != -1) {
            setMaxEms(i6);
            int i7 = d + 25;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
            int i8 = i7 % 2;
        } else {
            setMaxWidth(this.maxWidth);
        }
        this.boxBackgroundApplied = false;
        onApplyBoxBackgroundMode();
        setTextInputAccessibilityDelegate(new AccessibilityDelegate(this));
        this.collapsingTextHelper.setTypefaces(this.editText.getTypeface());
        this.collapsingTextHelper.setExpandedTextSize(this.editText.getTextSize());
        this.collapsingTextHelper.setExpandedLetterSpacing(this.editText.getLetterSpacing());
        int gravity = this.editText.getGravity();
        this.collapsingTextHelper.setCollapsedTextGravity((gravity & (-113)) | 48);
        this.collapsingTextHelper.setExpandedTextGravity(gravity);
        this.originalEditTextMinimumHeight = ViewCompat.getMinimumHeight(editText);
        this.editText.addTextChangedListener(new TextWatcher(editText) { // from class: com.google.android.material.textfield.TextInputLayout.1
            int previousLineCount;
            final /* synthetic */ EditText val$editText;

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
            }

            {
                this.val$editText = editText;
                this.previousLineCount = editText.getLineCount();
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                TextInputLayout textInputLayout = TextInputLayout.this;
                textInputLayout.updateLabelState(!TextInputLayout.access$000(textInputLayout));
                if (TextInputLayout.this.counterEnabled) {
                    TextInputLayout.this.updateCounter(editable);
                }
                if (TextInputLayout.access$100(TextInputLayout.this)) {
                    TextInputLayout.access$200(TextInputLayout.this, editable);
                }
                int lineCount = this.val$editText.getLineCount();
                int i9 = this.previousLineCount;
                if (lineCount != i9) {
                    if (lineCount < i9 && ViewCompat.getMinimumHeight(this.val$editText) != TextInputLayout.this.originalEditTextMinimumHeight) {
                        this.val$editText.setMinimumHeight(TextInputLayout.this.originalEditTextMinimumHeight);
                    }
                    this.previousLineCount = lineCount;
                }
            }
        });
        if (this.defaultHintTextColor == null) {
            int i9 = d + 45;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
            int i10 = i9 % 2;
            this.defaultHintTextColor = this.editText.getHintTextColors();
        }
        if (this.hintEnabled) {
            if (TextUtils.isEmpty(this.hint)) {
                CharSequence hint = this.editText.getHint();
                this.originalHint = hint;
                setHint(hint);
                this.editText.setHint((CharSequence) null);
            }
            this.isProvidingHint = true;
            int i11 = d + 97;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
            int i12 = i11 % 2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            updateCursorColor();
        }
        if (this.counterView != null) {
            int i13 = d + 67;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i13 % 128;
            if (i13 % 2 != 0) {
                updateCounter(this.editText.getText());
                throw null;
            }
            updateCounter(this.editText.getText());
        }
        updateEditTextBackground();
        this.indicatorViewController.adjustIndicatorPadding();
        this.startLayout.bringToFront();
        this.endLayout.bringToFront();
        dispatchOnEditTextAttached();
        this.endLayout.updateSuffixTextViewPadding();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        updateLabelState(false, true);
    }

    private void updateInputLayoutMargins() {
        int i = 2 % 2;
        int i2 = d + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0 ? this.boxBackgroundMode != 1 : this.boxBackgroundMode != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.inputFrame.getLayoutParams();
            int iCalculateLabelMarginTop = calculateLabelMarginTop();
            if (iCalculateLabelMarginTop != ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) {
                int i3 = d + 51;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
                if (i3 % 2 != 0) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = iCalculateLabelMarginTop;
                    this.inputFrame.requestLayout();
                    int i4 = 65 / 0;
                } else {
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = iCalculateLabelMarginTop;
                    this.inputFrame.requestLayout();
                }
            }
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 115;
        d = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        return (r1.getBaseline() + getPaddingTop()) + calculateLabelMarginTop();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        r1 = super.getBaseline();
        r2 = com.google.android.material.textfield.TextInputLayout.d + 47;
        com.google.android.material.textfield.TextInputLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        if ((r2 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        r0 = null;
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r1 != null) goto L9;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getBaseline() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.material.textfield.TextInputLayout.d
            int r1 = r1 + 119
            int r2 = r1 % 128
            com.google.android.material.textfield.TextInputLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L17
            android.widget.EditText r1 = r4.editText
            r2 = 16
            int r2 = r2 / 0
            if (r1 == 0) goto L2a
            goto L1b
        L17:
            android.widget.EditText r1 = r4.editText
            if (r1 == 0) goto L2a
        L1b:
            int r0 = r1.getBaseline()
            int r1 = r4.getPaddingTop()
            int r0 = r0 + r1
            int r1 = r4.calculateLabelMarginTop()
            int r0 = r0 + r1
            return r0
        L2a:
            int r1 = super.getBaseline()
            int r2 = com.google.android.material.textfield.TextInputLayout.d
            int r2 = r2 + 47
            int r3 = r2 % 128
            com.google.android.material.textfield.TextInputLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L3a
            return r1
        L3a:
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.getBaseline():int");
    }

    void updateLabelState(boolean z) {
        int i = 2 % 2;
        int i2 = d + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        updateLabelState(z, false);
        int i4 = d + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00c7  */
    private void updateLabelState(boolean z, boolean z2) {
        boolean z3;
        ColorStateList colorStateList;
        TextView textView;
        int colorForState;
        int i = 2 % 2;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.editText;
        if (editText == null || TextUtils.isEmpty(editText.getText())) {
            z3 = false;
        } else {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
            d = i2 % 128;
            int i3 = i2 % 2;
            z3 = true;
        }
        EditText editText2 = this.editText;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.defaultHintTextColor;
        if (colorStateList2 != null) {
            this.collapsingTextHelper.setCollapsedAndExpandedTextColor(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.defaultHintTextColor;
            if (colorStateList3 != null) {
                colorForState = colorStateList3.getColorForState(new int[]{-16842910}, this.disabledColor);
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 119;
                d = i4 % 128;
                int i5 = i4 % 2;
            } else {
                colorForState = this.disabledColor;
            }
            this.collapsingTextHelper.setCollapsedAndExpandedTextColor(ColorStateList.valueOf(colorForState));
        } else if (shouldShowError()) {
            this.collapsingTextHelper.setCollapsedAndExpandedTextColor(this.indicatorViewController.getErrorViewTextColors());
        } else if (this.counterOverflowed && (textView = this.counterView) != null) {
            this.collapsingTextHelper.setCollapsedAndExpandedTextColor(textView.getTextColors());
        } else if (z4 && (colorStateList = this.focusedTextColor) != null) {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 3;
            d = i6 % 128;
            if (i6 % 2 == 0) {
                this.collapsingTextHelper.setCollapsedTextColor(colorStateList);
                int i7 = 39 / 0;
            } else {
                this.collapsingTextHelper.setCollapsedTextColor(colorStateList);
            }
        }
        if (!z3 && this.expandedHintEnabled) {
            int i8 = d + 121;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
            int i9 = i8 % 2;
            if (isEnabled() && z4) {
                if (!z2) {
                }
                collapseHint(z);
                return;
            } else if (z2 || !this.hintExpanded) {
                expandHint(z);
                return;
            }
        } else if (!z2 || this.hintExpanded) {
            collapseHint(z);
            return;
        }
        int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
        d = i10 % 128;
        if (i10 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public EditText getEditText() {
        int i = 2 % 2;
        int i2 = d + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.editText;
        }
        throw null;
    }

    public void setMinEms(int i) {
        int i2 = 2 % 2;
        int i3 = d + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            this.minEms = i;
            throw null;
        }
        this.minEms = i;
        EditText editText = this.editText;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 29;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    public int getMinEms() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
        int i3 = i2 % 128;
        d = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.minEms;
        int i5 = i3 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public void setMaxEms(int i) {
        int i2 = 2 % 2;
        this.maxEms = i;
        EditText editText = this.editText;
        if (editText != null) {
            int i3 = d + 45;
            int i4 = i3 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4;
            if (i3 % 2 != 0) {
                int i5 = 23 / 0;
                if (i == -1) {
                    return;
                }
            } else if (i == -1) {
                return;
            }
            int i6 = i4 + 65;
            d = i6 % 128;
            int i7 = i6 % 2;
            editText.setMaxEms(i);
            if (i7 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public int getMaxEms() {
        int i = 2 % 2;
        int i2 = d + 81;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        int i5 = this.maxEms;
        int i6 = i3 + 103;
        d = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public void setMinWidth(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 59;
        int i4 = i3 % 128;
        d = i4;
        int i5 = i3 % 2;
        this.minWidth = i;
        EditText editText = this.editText;
        if (editText != null) {
            int i6 = i4 + 113;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            int i7 = i6 % 2;
            if (i != -1) {
                editText.setMinWidth(i);
                int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                d = i8 % 128;
                int i9 = i8 % 2;
            }
        }
    }

    public void setMinWidthResource(int i) {
        int i2 = 2 % 2;
        int i3 = d + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
        if (i4 != 0) {
            throw null;
        }
    }

    public int getMinWidth() {
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = i3 + 67;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            i = this.minWidth;
            int i5 = 64 / 0;
        } else {
            i = this.minWidth;
        }
        int i6 = i3 + 87;
        d = i6 % 128;
        if (i6 % 2 != 0) {
            return i;
        }
        throw null;
    }

    public void setMaxWidth(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 117;
        int i4 = i3 % 128;
        d = i4;
        int i5 = i3 % 2;
        this.maxWidth = i;
        EditText editText = this.editText;
        if (editText != null) {
            int i6 = i4 + 83;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 19 / 0;
                if (i == -1) {
                    return;
                }
            } else if (i == -1) {
                return;
            }
            editText.setMaxWidth(i);
        }
    }

    public void setMaxWidthResource(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
        d = i3 % 128;
        int i4 = i3 % 2;
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 37;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getMaxWidth() {
        int i = 2 % 2;
        int i2 = d + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.maxWidth;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setHint(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = d + 9;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        if (i2 % 2 != 0) {
            int i4 = 50 / 0;
            if (!this.hintEnabled) {
                return;
            }
        } else if (!this.hintEnabled) {
            return;
        }
        int i5 = i3 + 85;
        d = i5 % 128;
        int i6 = i5 % 2;
        setHintInternal(charSequence);
        sendAccessibilityEvent(2048);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    public void setHint(int i) {
        CharSequence text;
        int i2 = 2 % 2;
        int i3 = d + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 9 / 0;
            if (i != 0) {
                text = getResources().getText(i);
            } else {
                text = null;
            }
        } else if (i != 0) {
            text = getResources().getText(i);
        } else {
            text = null;
        }
        setHint(text);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 105;
        d = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    private void setHintInternal(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = d + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 61 / 0;
            if (!TextUtils.equals(charSequence, this.hint)) {
                this.hint = charSequence;
                this.collapsingTextHelper.setText(charSequence);
                if (!this.hintExpanded) {
                    openCutout();
                }
            }
        } else if (!TextUtils.equals(charSequence, this.hint)) {
            this.hint = charSequence;
            this.collapsingTextHelper.setText(charSequence);
            if (!this.hintExpanded) {
                openCutout();
            }
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 13;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 75 / 0;
        }
    }

    public CharSequence getHint() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        if (!this.hintEnabled) {
            return null;
        }
        int i5 = i2 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return this.hint;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    /* JADX WARN: Code duplicated, block: B:15:0x0040  */
    public void setHintEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 21;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        if (z != this.hintEnabled) {
            this.hintEnabled = z;
            Object obj = null;
            if (z) {
                CharSequence hint = this.editText.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.hint)) {
                        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 79;
                        d = i5 % 128;
                        if (i5 % 2 == 0) {
                            setHint(hint);
                            obj.hashCode();
                            throw null;
                        }
                        setHint(hint);
                    }
                    this.editText.setHint((CharSequence) null);
                }
                this.isProvidingHint = true;
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
                d = i6 % 128;
                int i7 = i6 % 2;
            } else {
                int i8 = i3 + 89;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
                if (i8 % 2 != 0) {
                    this.isProvidingHint = false;
                    if (!TextUtils.isEmpty(this.hint)) {
                        if (TextUtils.isEmpty(this.editText.getHint())) {
                            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
                            d = i9 % 128;
                            int i10 = i9 % 2;
                            this.editText.setHint(this.hint);
                        }
                    }
                } else {
                    this.isProvidingHint = false;
                    if (!TextUtils.isEmpty(this.hint)) {
                        if (TextUtils.isEmpty(this.editText.getHint())) {
                            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
                            d = i11 % 128;
                            int i12 = i11 % 2;
                            this.editText.setHint(this.hint);
                        }
                    }
                }
                setHintInternal(null);
                int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 59;
                d = i13 % 128;
                if (i13 % 2 == 0) {
                    int i14 = 3 % 4;
                }
            }
            if (this.editText != null) {
                updateInputLayoutMargins();
            }
        }
    }

    public boolean isHintEnabled() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 113;
        d = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.hintEnabled;
        int i5 = i2 + 93;
        d = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public boolean isProvidingHint() {
        boolean z;
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            z = this.isProvidingHint;
            int i4 = 96 / 0;
        } else {
            z = this.isProvidingHint;
        }
        int i5 = i2 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public void setHintTextAppearance(int i) {
        int i2 = 2 % 2;
        this.collapsingTextHelper.setCollapsedTextAppearance(i);
        this.focusedTextColor = this.collapsingTextHelper.getCollapsedTextColor();
        if (this.editText != null) {
            int i3 = d + 79;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            updateLabelState(false);
            updateInputLayoutMargins();
            int i5 = d + 43;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 / 3;
            }
        }
        int i7 = d + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
        int i8 = i7 % 2;
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 43;
        int i3 = i2 % 128;
        d = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this.focusedTextColor != colorStateList) {
            if (this.defaultHintTextColor == null) {
                int i4 = i3 + 57;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                if (i4 % 2 != 0) {
                    this.collapsingTextHelper.setCollapsedTextColor(colorStateList);
                    int i5 = 39 / 0;
                } else {
                    this.collapsingTextHelper.setCollapsedTextColor(colorStateList);
                }
            }
            this.focusedTextColor = colorStateList;
            if (this.editText != null) {
                updateLabelState(false);
                int i6 = d + 11;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
                int i7 = i6 % 2;
            }
        }
    }

    public ColorStateList getHintTextColor() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 91;
        d = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        ColorStateList colorStateList = this.focusedTextColor;
        int i4 = i2 + 49;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return colorStateList;
        }
        obj.hashCode();
        throw null;
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 55;
        d = i3 % 128;
        int i4 = i3 % 2;
        this.defaultHintTextColor = colorStateList;
        this.focusedTextColor = colorStateList;
        if (this.editText != null) {
            int i5 = i2 + 13;
            d = i5 % 128;
            int i6 = i5 % 2;
            updateLabelState(false);
        }
        int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 61;
        d = i7 % 128;
        int i8 = i7 % 2;
    }

    public ColorStateList getDefaultHintTextColor() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 101;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return this.defaultHintTextColor;
        }
        throw null;
    }

    public void setErrorEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.indicatorViewController.setErrorEnabled(z);
        if (i3 == 0) {
            int i4 = 80 / 0;
        }
    }

    public void setErrorTextAppearance(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 53;
        d = i3 % 128;
        int i4 = i3 % 2;
        this.indicatorViewController.setErrorTextAppearance(i);
        int i5 = d + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = d + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.indicatorViewController.setErrorViewTextColor(colorStateList);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getErrorCurrentTextColors() {
        int errorViewCurrentTextColor;
        int i = 2 % 2;
        int i2 = d + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            errorViewCurrentTextColor = this.indicatorViewController.getErrorViewCurrentTextColor();
            int i3 = 78 / 0;
        } else {
            errorViewCurrentTextColor = this.indicatorViewController.getErrorViewCurrentTextColor();
        }
        int i4 = d + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return errorViewCurrentTextColor;
    }

    public void setHelperTextTextAppearance(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 25;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            this.indicatorViewController.setHelperTextAppearance(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.indicatorViewController.setHelperTextAppearance(i);
        int i4 = d + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = d + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            this.indicatorViewController.setHelperTextViewTextColor(colorStateList);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.indicatorViewController.setHelperTextViewTextColor(colorStateList);
        int i3 = d + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 89 / 0;
        }
    }

    public boolean isErrorEnabled() {
        int i = 2 % 2;
        int i2 = d + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsErrorEnabled = this.indicatorViewController.isErrorEnabled();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 45;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 29 / 0;
        }
        return zIsErrorEnabled;
    }

    public void setHelperTextEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = d + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.indicatorViewController.setHelperTextEnabled(z);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 79;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setHelperText(CharSequence charSequence) {
        int i = 2 % 2;
        if (TextUtils.isEmpty(charSequence)) {
            if (isHelperTextEnabled()) {
                setHelperTextEnabled(false);
            }
            int i2 = d + 15;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        if (!isHelperTextEnabled()) {
            setHelperTextEnabled(true);
        }
        this.indicatorViewController.showHelper(charSequence);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 79;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    public boolean isHelperTextEnabled() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
        d = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsHelperTextEnabled = this.indicatorViewController.isHelperTextEnabled();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return zIsHelperTextEnabled;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getHelperTextCurrentTextColor() {
        int i = 2 % 2;
        int i2 = d + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        IndicatorViewController indicatorViewController = this.indicatorViewController;
        if (i3 == 0) {
            return indicatorViewController.getHelperTextViewCurrentTextColor();
        }
        indicatorViewController.getHelperTextViewCurrentTextColor();
        throw null;
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = d + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.indicatorViewController.setErrorContentDescription(charSequence);
            obj.hashCode();
            throw null;
        }
        this.indicatorViewController.setErrorContentDescription(charSequence);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 93;
        d = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public CharSequence getErrorContentDescription() {
        int i = 2 % 2;
        int i2 = d + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        CharSequence errorContentDescription = this.indicatorViewController.getErrorContentDescription();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 43;
        d = i4 % 128;
        int i5 = i4 % 2;
        return errorContentDescription;
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        int i2 = 2 % 2;
        int i3 = d + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        this.indicatorViewController.setErrorAccessibilityLiveRegion(i);
        int i5 = d + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public int getErrorAccessibilityLiveRegion() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
        d = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.indicatorViewController.getErrorAccessibilityLiveRegion();
            obj.hashCode();
            throw null;
        }
        int errorAccessibilityLiveRegion = this.indicatorViewController.getErrorAccessibilityLiveRegion();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 119;
        d = i3 % 128;
        if (i3 % 2 != 0) {
            return errorAccessibilityLiveRegion;
        }
        obj.hashCode();
        throw null;
    }

    public void setError(CharSequence charSequence) {
        int i = 2 % 2;
        if (!this.indicatorViewController.isErrorEnabled()) {
            int i2 = d + 61;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        Object obj = null;
        if (TextUtils.isEmpty(charSequence)) {
            this.indicatorViewController.hideError();
            int i4 = d + 109;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        int i5 = d + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            this.indicatorViewController.showError(charSequence);
        } else {
            this.indicatorViewController.showError(charSequence);
            obj.hashCode();
            throw null;
        }
    }

    public void setErrorIconDrawable(int i) {
        int i2 = 2 % 2;
        int i3 = d + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        this.endLayout.setErrorIconDrawable(i);
        if (i4 != 0) {
            int i5 = 31 / 0;
        }
    }

    public void setErrorIconDrawable(Drawable drawable) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 107;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.endLayout.setErrorIconDrawable(drawable);
        int i4 = d + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public Drawable getErrorIconDrawable() {
        int i = 2 % 2;
        int i2 = d + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        EndCompoundLayout endCompoundLayout = this.endLayout;
        if (i3 == 0) {
            return endCompoundLayout.getErrorIconDrawable();
        }
        endCompoundLayout.getErrorIconDrawable();
        throw null;
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = d + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.endLayout.setErrorIconTintList(colorStateList);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        int i = 2 % 2;
        int i2 = d + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.endLayout.setErrorIconTintMode(mode);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setCounterEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = d + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        if (this.counterEnabled != z) {
            Object obj = null;
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.counterView = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_counter);
                Typeface typeface = this.typeface;
                if (typeface != null) {
                    int i4 = d + 13;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                    if (i4 % 2 != 0) {
                        this.counterView.setTypeface(typeface);
                        obj.hashCode();
                        throw null;
                    }
                    this.counterView.setTypeface(typeface);
                }
                this.counterView.setMaxLines(1);
                this.indicatorViewController.addIndicator(this.counterView, 2);
                MarginLayoutParamsCompat.setMarginStart((ViewGroup.MarginLayoutParams) this.counterView.getLayoutParams(), getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                updateCounterTextAppearanceAndColor();
                updateCounter();
            } else {
                this.indicatorViewController.removeIndicator(this.counterView, 2);
                this.counterView = null;
            }
            this.counterEnabled = z;
        }
    }

    public void setCounterTextAppearance(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
        int i4 = i3 % 128;
        d = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.counterTextAppearance != i) {
            int i5 = i4 + 109;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
            this.counterTextAppearance = i;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        int i = 2 % 2;
        if (this.counterTextColor != colorStateList) {
            int i2 = d + 115;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            this.counterTextColor = colorStateList;
            updateCounterTextAppearanceAndColor();
        }
        int i4 = d + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 39 / 0;
        }
    }

    public ColorStateList getCounterTextColor() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 25;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        ColorStateList colorStateList = this.counterTextColor;
        int i5 = i3 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return colorStateList;
    }

    public void setCounterOverflowTextAppearance(int i) {
        int i2 = 2 % 2;
        int i3 = d + 53;
        int i4 = i3 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4;
        int i5 = i3 % 2;
        if (this.counterOverflowTextAppearance != i) {
            int i6 = i4 + 31;
            d = i6 % 128;
            int i7 = i6 % 2;
            this.counterOverflowTextAppearance = i;
            updateCounterTextAppearanceAndColor();
        }
        int i8 = d + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 28 / 0;
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        int i = 2 % 2;
        if (this.counterOverflowTextColor != colorStateList) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 51;
            d = i2 % 128;
            if (i2 % 2 == 0) {
                this.counterOverflowTextColor = colorStateList;
                updateCounterTextAppearanceAndColor();
                int i3 = 27 / 0;
            } else {
                this.counterOverflowTextColor = colorStateList;
                updateCounterTextAppearanceAndColor();
            }
            int i4 = d + 21;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 % 2;
            }
        }
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
        d = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 37 / 0;
        }
    }

    public ColorStateList getCounterOverflowTextColor() {
        ColorStateList colorStateList;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
        int i3 = i2 % 128;
        d = i3;
        if (i2 % 2 == 0) {
            colorStateList = this.counterOverflowTextColor;
            int i4 = 77 / 0;
        } else {
            colorStateList = this.counterOverflowTextColor;
        }
        int i5 = i3 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            return colorStateList;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean isCounterEnabled() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 25;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        boolean z = this.counterEnabled;
        int i5 = i3 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001b  */
    /* JADX WARN: Code duplicated, block: B:12:0x0024  */
    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:15:0x002b  */
    public void setCounterMaxLength(int i) {
        int i2;
        int i3 = 2 % 2;
        if (this.counterMaxLength != i) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i5 = i4 + 91;
            d = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 28 / 0;
                if (i > 0) {
                    i2 = i4 + 111;
                    d = i2 % 128;
                    if (i2 % 2 != 0) {
                        this.counterMaxLength = i;
                        throw null;
                    }
                    this.counterMaxLength = i;
                } else {
                    this.counterMaxLength = -1;
                }
            } else if (i > 0) {
                i2 = i4 + 111;
                d = i2 % 128;
                if (i2 % 2 != 0) {
                    this.counterMaxLength = i;
                    throw null;
                }
                this.counterMaxLength = i;
            } else {
                this.counterMaxLength = -1;
            }
            if (this.counterEnabled) {
                int i7 = i4 + 21;
                d = i7 % 128;
                int i8 = i7 % 2;
                updateCounter();
            }
        }
        int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
        d = i9 % 128;
        int i10 = i9 % 2;
    }

    private void updateCounter() {
        Editable text;
        int i = 2 % 2;
        Object obj = null;
        if (this.counterView != null) {
            EditText editText = this.editText;
            if (editText == null) {
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 47;
                d = i2 % 128;
                int i3 = i2 % 2;
                text = null;
            } else {
                text = editText.getText();
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 101;
                d = i4 % 128;
                int i5 = i4 % 2;
            }
            updateCounter(text);
        }
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 101;
        d = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    void updateCounter(Editable editable) {
        int i = 2 % 2;
        int iCountLength = this.lengthCounter.countLength(editable);
        boolean z = this.counterOverflowed;
        int i2 = this.counterMaxLength;
        if (i2 == -1) {
            int i3 = d + 71;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            this.counterView.setText(String.valueOf(iCountLength));
            this.counterView.setContentDescription(null);
            this.counterOverflowed = false;
        } else {
            this.counterOverflowed = iCountLength > i2;
            updateCounterContentDescription(getContext(), this.counterView, iCountLength, this.counterMaxLength, this.counterOverflowed);
            if (z != this.counterOverflowed) {
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 21;
                d = i5 % 128;
                int i6 = i5 % 2;
                updateCounterTextAppearanceAndColor();
                int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 5;
                d = i7 % 128;
                int i8 = i7 % 2;
            }
            this.counterView.setText(BidiFormatter.getInstance().unicodeWrap(getContext().getString(R.string.character_counter_pattern, Integer.valueOf(iCountLength), Integer.valueOf(this.counterMaxLength))));
        }
        if (this.editText != null) {
            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 25;
            d = i9 % 128;
            int i10 = i9 % 2;
            if (z != this.counterOverflowed) {
                updateLabelState(false);
                updateTextInputBoxState();
                updateEditTextBackground();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    /* JADX WARN: Code duplicated, block: B:13:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    private static void updateCounterContentDescription(Context context, TextView textView, int i, int i2, boolean z) {
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 31;
        int i7 = i6 % 128;
        d = i7;
        if (i6 % 2 == 0) {
            int i8 = 34 / 0;
            if (z) {
                i3 = i7 + 123;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i9 = R.string.character_counter_overflowed_content_description;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                i4 = R.string.character_counter_overflowed_content_description;
            } else {
                i4 = R.string.character_counter_content_description;
            }
        } else if (z) {
            i3 = i7 + 123;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            if (i3 % 2 == 0) {
                int i10 = R.string.character_counter_overflowed_content_description;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            i4 = R.string.character_counter_overflowed_content_description;
        } else {
            i4 = R.string.character_counter_content_description;
        }
        textView.setContentDescription(context.getString(i4, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public void setPlaceholderText(CharSequence charSequence) {
        int i = 2 % 2;
        if (this.placeholderTextView == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.placeholderTextView = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_placeholder);
            ViewCompat.setImportantForAccessibility(this.placeholderTextView, 2);
            Fade fadeCreatePlaceholderFadeTransition = createPlaceholderFadeTransition();
            this.placeholderFadeIn = fadeCreatePlaceholderFadeTransition;
            fadeCreatePlaceholderFadeTransition.setStartDelay(67L);
            this.placeholderFadeOut = createPlaceholderFadeTransition();
            setPlaceholderTextAppearance(this.placeholderTextAppearance);
            setPlaceholderTextColor(this.placeholderTextColor);
        }
        if (TextUtils.isEmpty(charSequence)) {
            int i2 = d + 123;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            if (i2 % 2 != 0) {
                setPlaceholderTextEnabled(false);
            } else {
                setPlaceholderTextEnabled(false);
            }
        } else {
            if (!this.placeholderEnabled) {
                setPlaceholderTextEnabled(true);
                int i3 = d + 125;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
                int i4 = i3 % 2;
            }
            this.placeholderText = charSequence;
        }
        updatePlaceholderText();
        int i5 = d + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public CharSequence getPlaceholderText() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        if (this.placeholderEnabled) {
            return this.placeholderText;
        }
        int i5 = i2 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    private void setPlaceholderTextEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        if (this.placeholderEnabled == z) {
            return;
        }
        if (!z) {
            removePlaceholderTextView();
            this.placeholderTextView = null;
            int i5 = d + 99;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 / 2;
            }
        } else {
            int i7 = i2 + 97;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
            if (i7 % 2 != 0) {
                addPlaceholderTextView();
                int i8 = 79 / 0;
            } else {
                addPlaceholderTextView();
            }
        }
        this.placeholderEnabled = z;
    }

    private Fade createPlaceholderFadeTransition() {
        int i = 2 % 2;
        Fade fade = new Fade();
        fade.setDuration(MotionUtils.resolveThemeDuration(getContext(), R.attr.motionDurationShort2, 87));
        fade.setInterpolator(MotionUtils.resolveThemeInterpolator(getContext(), R.attr.motionEasingLinearInterpolator, AnimationUtils.LINEAR_INTERPOLATOR));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 51;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return fade;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void updatePlaceholderText() {
        Editable text;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 43;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        EditText editText = this.editText;
        if (editText == null) {
            int i5 = i3 + 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
            text = null;
        } else {
            text = editText.getText();
        }
        updatePlaceholderText(text);
    }

    private void updatePlaceholderText(Editable editable) {
        int i = 2 % 2;
        int i2 = d + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        if (this.lengthCounter.countLength(editable) != 0 || this.hintExpanded) {
            hidePlaceholderText();
            return;
        }
        int i4 = d + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        showPlaceholderText();
    }

    private void showPlaceholderText() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.placeholderTextView != null) {
            int i4 = i2 + 107;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 21 / 0;
                if (!this.placeholderEnabled) {
                    return;
                }
            } else if (!this.placeholderEnabled) {
                return;
            }
            int i6 = i2 + 49;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            int i7 = i6 % 2;
            if (TextUtils.isEmpty(this.placeholderText)) {
                return;
            }
            int i8 = d + 63;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
            int i9 = i8 % 2;
            this.placeholderTextView.setText(this.placeholderText);
            TransitionManager.beginDelayedTransition(this.inputFrame, this.placeholderFadeIn);
            this.placeholderTextView.setVisibility(0);
            this.placeholderTextView.bringToFront();
            announceForAccessibility(this.placeholderText);
            int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 53;
            d = i10 % 128;
            int i11 = i10 % 2;
        }
    }

    private void hidePlaceholderText() {
        int i = 2 % 2;
        int i2 = d + 103;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        TextView textView = this.placeholderTextView;
        if (textView == null || !this.placeholderEnabled) {
            return;
        }
        int i5 = i3 + 27;
        d = i5 % 128;
        int i6 = i5 % 2;
        textView.setText((CharSequence) null);
        TransitionManager.beginDelayedTransition(this.inputFrame, this.placeholderFadeOut);
        this.placeholderTextView.setVisibility(4);
    }

    private void addPlaceholderTextView() {
        TextView textView;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            textView = this.placeholderTextView;
            int i3 = 97 / 0;
            if (textView == null) {
                return;
            }
        } else {
            textView = this.placeholderTextView;
            if (textView == null) {
                return;
            }
        }
        this.inputFrame.addView(textView);
        this.placeholderTextView.setVisibility(0);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 121;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 5 % 4;
        }
    }

    private void removePlaceholderTextView() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 125;
        d = i2 % 128;
        int i3 = i2 % 2;
        TextView textView = this.placeholderTextView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        int i4 = d + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 83 / 0;
            if (this.placeholderTextColor == colorStateList) {
                return;
            }
        } else if (this.placeholderTextColor == colorStateList) {
            return;
        }
        this.placeholderTextColor = colorStateList;
        TextView textView = this.placeholderTextView;
        if (textView != null) {
            int i5 = i2 + 51;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 25 / 0;
                if (colorStateList == null) {
                    return;
                }
            } else if (colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public ColorStateList getPlaceholderTextColor() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        ColorStateList colorStateList = this.placeholderTextColor;
        int i4 = i2 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 24 / 0;
        }
        return colorStateList;
    }

    public void setPlaceholderTextAppearance(int i) {
        int i2 = 2 % 2;
        int i3 = d;
        int i4 = i3 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        this.placeholderTextAppearance = i;
        TextView textView = this.placeholderTextView;
        if (textView != null) {
            int i6 = i3 + 123;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            int i7 = i6 % 2;
            TextViewCompat.setTextAppearance(textView, i);
        }
    }

    public int getPlaceholderTextAppearance() {
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
        int i4 = i3 % 128;
        d = i4;
        if (i3 % 2 == 0) {
            i = this.placeholderTextAppearance;
            int i5 = 60 / 0;
        } else {
            i = this.placeholderTextAppearance;
        }
        int i6 = i4 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public void setCursorColor(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 73;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this.cursorColor != colorStateList) {
            this.cursorColor = colorStateList;
            updateCursorColor();
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 89;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public ColorStateList getCursorColor() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 101;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return this.cursorColor;
        }
        throw null;
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = d + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        if (this.cursorErrorColor != colorStateList) {
            this.cursorErrorColor = colorStateList;
            if (isOnError()) {
                updateCursorColor();
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
                d = i4 % 128;
                int i5 = i4 % 2;
            }
        }
    }

    public ColorStateList getCursorErrorColor() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 7;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return this.cursorErrorColor;
        }
        throw null;
    }

    public void setPrefixText(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = d + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.startLayout.setPrefixText(charSequence);
        if (i3 != 0) {
            int i4 = 45 / 0;
        }
    }

    public CharSequence getPrefixText() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 27;
        d = i2 % 128;
        int i3 = i2 % 2;
        StartCompoundLayout startCompoundLayout = this.startLayout;
        if (i3 != 0) {
            return startCompoundLayout.getPrefixText();
        }
        startCompoundLayout.getPrefixText();
        throw null;
    }

    public TextView getPrefixTextView() {
        int i = 2 % 2;
        int i2 = d + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        TextView prefixTextView = this.startLayout.getPrefixTextView();
        if (i3 != 0) {
            int i4 = 10 / 0;
        }
        return prefixTextView;
    }

    public void setPrefixTextColor(ColorStateList colorStateList) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 29;
        d = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29944);
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1756;
            int modifierMetaStateMask = 22 - ((byte) KeyEvent.getModifierMetaStateMask());
            byte b2 = $$a[80];
            Object[] objArr = new Object[1];
            a((short) 89, b2, (byte) (b2 | 36), objArr);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iIndexOf, modifierMetaStateMask, 986134021, false, (String) objArr[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr2 = new Object[1];
        c(new char[]{15, '0', 22, Typography.amp, ')', ' ', 22, 17, ')', 25, 19, 29, '0', Typography.quote, 21, 11, '\'', 5, 11, '%', Typography.dollar, 21}, (byte) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 13), 22 - ExpandableListView.getPackedPositionType(0L), objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        c(new char[]{'\b', '\n', 19, '0', 21, '\r', 25, 27, '\r', 14, 11, 23, '!', ')', 13859}, (byte) (36 - Color.argb(0, 0, 0, 0)), 16 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr3);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char mirror = (char) (29992 - AndroidCharacter.getMirror('0'));
            int iIndexOf2 = TextUtils.indexOf("", "", 0) + 1755;
            int iKeyCodeFromString = 23 - KeyEvent.keyCodeFromString("");
            byte[] bArr = $$a;
            Object[] objArr4 = new Object[1];
            a(bArr[7], bArr[80], (byte) ($$b & 62), objArr4);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(mirror, iIndexOf2, iKeyCodeFromString, 1596667560, false, (String) objArr4[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cArgb = (char) (Color.argb(0, 0, 0, 0) + 29944);
                int i4 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1755;
                int maximumDrawingCacheSize = 23 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                Object[] objArr5 = new Object[1];
                a((short) 141, $$a[80], (byte) ($$b & 62), objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cArgb, i4, maximumDrawingCacheSize, 1599039318, false, (String) objArr5[0], null);
            }
            Object[] objArr6 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = new Object[]{new int[]{((int[]) objArr6[0])[0]}, new int[]{((int[]) objArr6[1])[0]}, (Object[]) objArr6[2], new int[1], (String[]) objArr6[4]};
            int iNextInt = new Random().nextInt();
            int i5 = ~iNextInt;
            int i6 = 1958332176 + (((~(32772715 | i5)) | 245375141) * 226) + (((~(i5 | 267662063)) | (~((-245375142) | iNextInt)) | 10485793) * (-113)) + ((~(iNextInt | 32772715)) * 113) + 1207777049;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr7 = new Object[1];
            c(new char[]{6, 17, 6, 19, 16, '\b', 15, '0', '+', 16, Typography.quote, '(', 21, 26, '\f', '#'}, (byte) (TextUtils.indexOf("", "") + 102), 16 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr7);
            Class<?> cls2 = Class.forName((String) objArr7[0]);
            Object[] objArr8 = new Object[1];
            c(new char[]{31, 27, '\b', '*', 27, ' ', 27, '\'', Typography.quote, 18, 23, 6, 11, '.', 21, '\n'}, (byte) (122 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 16 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr8);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr9 = {-808936745};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (42049 - Color.red(0)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1726, 29 - (Process.myTid() >> 22), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = ActivityLoginBinding.TuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr9), 1207777049);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 29944);
                    int i9 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1754;
                    int iRgb = (-16777193) - Color.rgb(0, 0, 0);
                    Object[] objArr10 = new Object[1];
                    a((short) 141, $$a[80], (byte) ($$b & 62), objArr10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, i9, iRgb, 1599039318, false, (String) objArr10[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da);
                try {
                    Object[] objArr11 = new Object[1];
                    c(new char[]{15, '0', 22, Typography.amp, ')', ' ', 22, 17, ')', 25, 19, 29, '0', Typography.quote, 21, 11, '\'', 5, 11, '%', Typography.dollar, 21}, (byte) (14 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), Color.green(0) + 22, objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    c(new char[]{'\b', '\n', 19, '0', 21, '\r', 25, 27, '\r', 14, 11, 23, '!', ')', 13859}, (byte) (36 - View.MeasureSpec.makeMeasureSpec(0, 0)), AndroidCharacter.getMirror('0') - '!', objArr12);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cKeyCodeFromString = (char) (29944 - KeyEvent.keyCodeFromString(""));
                        int iRed = Color.red(0) + 1755;
                        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 23;
                        byte[] bArr2 = $$a;
                        Object[] objArr13 = new Object[1];
                        a(bArr2[7], bArr2[80], (byte) ($$b & 62), objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cKeyCodeFromString, iRed, longPressTimeout, 1596667560, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 29944);
                        int iLastIndexOf = 1754 - TextUtils.lastIndexOf("", '0', 0);
                        int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 23;
                        byte b3 = $$a[80];
                        Object[] objArr14 = new Object[1];
                        a((short) 89, b3, (byte) (b3 | 36), objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(minimumFlingVelocity, iLastIndexOf, threadPriority, 986134021, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
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
        int i10 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0];
        int i11 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0];
        if (i11 != i10) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4];
            if (strArr != null) {
                int i12 = d + 81;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i12 % 128;
                int i13 = i12 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i11));
        }
        int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 101;
        d = i14 % 128;
        int i15 = i14 % 2;
        int i16 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
        Object[] objArr15 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i17 = ~iIdentityHashCode;
        int i18 = i16 + 212657565 + (((~((-899515812) | i17)) | (~(iIdentityHashCode | (-686913386)))) * 333) + (((~(iIdentityHashCode | (-899515812))) | (~(i17 | (-686913386)))) * 333);
        int i19 = (i18 << 13) ^ i18;
        int i20 = i19 ^ (i19 >>> 17);
        ((int[]) objArr15[3])[0] = i20 ^ (i20 << 5);
        this.startLayout.setPrefixTextColor(colorStateList);
    }

    public ColorStateList getPrefixTextColor() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 21;
        d = i2 % 128;
        int i3 = i2 % 2;
        ColorStateList prefixTextColor = this.startLayout.getPrefixTextColor();
        int i4 = d + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            return prefixTextColor;
        }
        throw null;
    }

    public void setPrefixTextAppearance(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
        d = i3 % 128;
        int i4 = i3 % 2;
        this.startLayout.setPrefixTextAppearance(i);
        if (i4 == 0) {
            int i5 = 25 / 0;
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = d + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.endLayout.setSuffixText(charSequence);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public CharSequence getSuffixText() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 31;
        d = i2 % 128;
        int i3 = i2 % 2;
        CharSequence suffixText = this.endLayout.getSuffixText();
        int i4 = d + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return suffixText;
    }

    public TextView getSuffixTextView() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 123;
        d = i2 % 128;
        int i3 = i2 % 2;
        TextView suffixTextView = this.endLayout.getSuffixTextView();
        int i4 = d + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return suffixTextView;
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.endLayout.setSuffixTextColor(colorStateList);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 9;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    public ColorStateList getSuffixTextColor() {
        int i = 2 % 2;
        int i2 = d + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        ColorStateList suffixTextColor = this.endLayout.getSuffixTextColor();
        if (i3 != 0) {
            int i4 = 62 / 0;
        }
        return suffixTextColor;
    }

    public void setSuffixTextAppearance(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
        d = i3 % 128;
        int i4 = i3 % 2;
        this.endLayout.setSuffixTextAppearance(i);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 3;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            recursiveSetEnabled(this, z);
            super.setEnabled(z);
        } else {
            recursiveSetEnabled(this, z);
            super.setEnabled(z);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0042 A[PHI: r4
  0x0042: PHI (r4v4 android.view.View) = (r4v3 android.view.View), (r4v6 android.view.View) binds: [B:14:0x0040, B:11:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    private static void recursiveSetEnabled(ViewGroup viewGroup, boolean z) {
        View childAt;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
        d = i2 % 128;
        int childCount = i2 % 2 == 0 ? viewGroup.getChildCount() : viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            int i4 = d + 109;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            if (i4 % 2 != 0) {
                childAt = viewGroup.getChildAt(i3);
                childAt.setEnabled(z);
                int i5 = 8 / 0;
                if (childAt instanceof ViewGroup) {
                    recursiveSetEnabled((ViewGroup) childAt, z);
                }
            } else {
                childAt = viewGroup.getChildAt(i3);
                childAt.setEnabled(z);
                if (!(!(childAt instanceof ViewGroup))) {
                    recursiveSetEnabled((ViewGroup) childAt, z);
                }
            }
        }
    }

    public int getCounterMaxLength() {
        int i = 2 % 2;
        int i2 = d + 83;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        int i5 = this.counterMaxLength;
        int i6 = i3 + 35;
        d = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    CharSequence getCounterOverflowDescription() {
        TextView textView;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 21;
        d = i2 % 128;
        int i3 = i2 % 2;
        if (!this.counterEnabled || !this.counterOverflowed || (textView = this.counterView) == null) {
            return null;
        }
        CharSequence contentDescription = textView.getContentDescription();
        int i4 = d + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return contentDescription;
    }

    private void updateCounterTextAppearanceAndColor() {
        ColorStateList colorStateList;
        int i = 2 % 2;
        TextView textView = this.counterView;
        if (textView != null) {
            int i2 = d + 107;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            setTextAppearanceCompatWithErrorFallback(textView, this.counterOverflowed ^ true ? this.counterTextAppearance : this.counterOverflowTextAppearance);
            if (!this.counterOverflowed && (colorStateList = this.counterTextColor) != null) {
                this.counterView.setTextColor(colorStateList);
            }
            if (this.counterOverflowed) {
                int i4 = d + 121;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                if (i4 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                ColorStateList colorStateList2 = this.counterOverflowTextColor;
                if (colorStateList2 != null) {
                    this.counterView.setTextColor(colorStateList2);
                    int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 57;
                    d = i5 % 128;
                    int i6 = i5 % 2;
                }
            }
        }
    }

    void setTextAppearanceCompatWithErrorFallback(TextView textView, int i) {
        int i2 = 2 % 2;
        int i3 = d + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        try {
            TextViewCompat.setTextAppearance(textView, i);
            if (textView.getTextColors().getDefaultColor() == -65281) {
                TextViewCompat.setTextAppearance(textView, R.style.TextAppearance_AppCompat_Caption);
                textView.setTextColor(ContextCompat.getColor(getContext(), R.color.design_error));
            }
        } catch (Exception unused) {
        }
        int i5 = d + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
    }

    private int calculateLabelMarginTop() {
        float collapsedTextHeight;
        int i;
        int i2 = 2 % 2;
        if (!this.hintEnabled) {
            return 0;
        }
        int i3 = this.boxBackgroundMode;
        if (i3 == 0) {
            collapsedTextHeight = this.collapsingTextHelper.getCollapsedTextHeight();
            i = d + 41;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
        } else if (i3 == 2) {
            collapsedTextHeight = this.collapsingTextHelper.getCollapsedTextHeight() / 2.0f;
            i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 7;
            d = i % 128;
        } else {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
            d = i4 % 128;
            int i5 = i4 % 2;
            return 0;
        }
        int i6 = i % 2;
        return (int) collapsedTextHeight;
    }

    private Rect calculateCollapsedTextBounds(Rect rect) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 89;
        d = i2 % 128;
        int i3 = i2 % 2;
        if (this.editText == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.tmpBoundsRect;
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
        rect2.bottom = rect.bottom;
        int i4 = this.boxBackgroundMode;
        if (i4 == 1) {
            rect2.left = getLabelLeftBoundAlignedWithPrefixAndSuffix(rect.left, zIsLayoutRtl);
            rect2.top = rect.top + this.boxCollapsedPaddingTopPx;
            rect2.right = getLabelRightBoundAlignedWithPrefixAndSuffix(rect.right, zIsLayoutRtl);
            return rect2;
        }
        if (i4 != 2) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 25;
            d = i5 % 128;
            int i6 = i5 % 2;
            rect2.left = getLabelLeftBoundAlignedWithPrefixAndSuffix(rect.left, zIsLayoutRtl);
            rect2.top = getPaddingTop();
            rect2.right = getLabelRightBoundAlignedWithPrefixAndSuffix(rect.right, zIsLayoutRtl);
            return rect2;
        }
        rect2.left = rect.left + this.editText.getPaddingLeft();
        rect2.top = rect.top - calculateLabelMarginTop();
        rect2.right = rect.right - this.editText.getPaddingRight();
        return rect2;
    }

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.textfield.TextInputLayout.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        CharSequence error;
        boolean isEndIconChecked;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.error = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.isEndIconChecked = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.error, parcel, i);
            parcel.writeInt(this.isEndIconChecked ? 1 : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("TextInputLayout.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" error=");
            sb.append((Object) this.error);
            sb.append("}");
            return sb.toString();
        }
    }

    private int getLabelLeftBoundAlignedWithPrefixAndSuffix(int i, boolean z) {
        int compoundPaddingLeft;
        int i2 = 2 % 2;
        if ((!z) && getPrefixText() != null) {
            compoundPaddingLeft = this.startLayout.getPrefixTextStartOffset();
        } else if (!z || getSuffixText() == null) {
            compoundPaddingLeft = this.editText.getCompoundPaddingLeft();
            int i3 = d + 93;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
        } else {
            int i5 = d + 99;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            if (i5 % 2 != 0) {
                compoundPaddingLeft = this.endLayout.getSuffixTextEndOffset();
                int i6 = 92 / 0;
            } else {
                compoundPaddingLeft = this.endLayout.getSuffixTextEndOffset();
            }
        }
        return i + compoundPaddingLeft;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0055  */
    /* JADX WARN: Code duplicated, block: B:22:0x0066  */
    private int getLabelRightBoundAlignedWithPrefixAndSuffix(int i, boolean z) {
        int compoundPaddingRight;
        int i2;
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 59;
        d = i4 % 128;
        int i5 = i4 % 2;
        if (!z && getSuffixText() != null) {
            int i6 = d + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            if (i6 % 2 != 0) {
                this.endLayout.getSuffixTextEndOffset();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            compoundPaddingRight = this.endLayout.getSuffixTextEndOffset();
        } else if (z) {
            int i7 = d + 53;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 34 / 0;
                if (getPrefixText() != null) {
                    compoundPaddingRight = this.startLayout.getPrefixTextStartOffset();
                } else {
                    compoundPaddingRight = this.editText.getCompoundPaddingRight();
                    i2 = d + 117;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i9 = 4 % 2;
                    }
                }
            } else if (getPrefixText() != null) {
                compoundPaddingRight = this.startLayout.getPrefixTextStartOffset();
            } else {
                compoundPaddingRight = this.editText.getCompoundPaddingRight();
                i2 = d + 117;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                if (i2 % 2 != 0) {
                    int i10 = 4 % 2;
                }
            }
        } else {
            compoundPaddingRight = this.editText.getCompoundPaddingRight();
            i2 = d + 117;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            if (i2 % 2 != 0) {
                int i11 = 4 % 2;
            }
        }
        int i12 = i - compoundPaddingRight;
        int i13 = d + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 79 / 0;
        }
        return i12;
    }

    private Rect calculateExpandedTextBounds(Rect rect) {
        int i = 2 % 2;
        int i2 = d + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.editText == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.tmpBoundsRect;
        float expandedTextHeight = this.collapsingTextHelper.getExpandedTextHeight();
        rect2.left = rect.left + this.editText.getCompoundPaddingLeft();
        rect2.top = calculateExpandedLabelTop(rect, expandedTextHeight);
        rect2.right = rect.right - this.editText.getCompoundPaddingRight();
        rect2.bottom = calculateExpandedLabelBottom(rect, rect2, expandedTextHeight);
        int i3 = d + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        return rect2;
    }

    private int calculateExpandedLabelTop(Rect rect, float f) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 9;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            isSingleLineFilledTextField();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!isSingleLineFilledTextField()) {
            return rect.top + this.editText.getCompoundPaddingTop();
        }
        int i3 = d + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        int iCenterY = (int) (rect.centerY() - (f / 2.0f));
        int i5 = d + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return iCenterY;
    }

    private int calculateExpandedLabelBottom(Rect rect, Rect rect2, float f) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 21;
        d = i2 % 128;
        int i3 = i2 % 2;
        if (!(!isSingleLineFilledTextField())) {
            int i4 = d + 123;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            return (int) (i4 % 2 != 0 ? rect2.top % f : rect2.top + f);
        }
        return rect.bottom - this.editText.getCompoundPaddingBottom();
    }

    private boolean isSingleLineFilledTextField() {
        int i = 2 % 2;
        int i2 = d + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        if (this.boxBackgroundMode != 1 || this.editText.getMinLines() > 1) {
            return false;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 41;
        int i5 = i4 % 128;
        d = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    private int calculateBoxBackgroundColor() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.boxBackgroundColor;
        if (this.boxBackgroundMode != 1) {
            return i5;
        }
        int i6 = i2 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
        int i7 = i6 % 2;
        return MaterialColors.layer(MaterialColors.getColor(this, R.attr.colorSurface, 0), this.boxBackgroundColor);
    }

    private void applyBoxAttributes() {
        int i = 2 % 2;
        MaterialShapeDrawable materialShapeDrawable = this.boxBackground;
        if (materialShapeDrawable == null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
            d = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        ShapeAppearanceModel shapeAppearanceModel = materialShapeDrawable.getShapeAppearanceModel();
        ShapeAppearanceModel shapeAppearanceModel2 = this.shapeAppearanceModel;
        if (shapeAppearanceModel != shapeAppearanceModel2) {
            int i4 = d + 47;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
            this.boxBackground.setShapeAppearanceModel(shapeAppearanceModel2);
        }
        if (!(!canDrawOutlineStroke())) {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 7;
            d = i6 % 128;
            if (i6 % 2 == 0) {
                this.boxBackground.setStroke(this.boxStrokeWidthPx, this.boxStrokeColor);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.boxBackground.setStroke(this.boxStrokeWidthPx, this.boxStrokeColor);
        }
        int iCalculateBoxBackgroundColor = calculateBoxBackgroundColor();
        this.boxBackgroundColor = iCalculateBoxBackgroundColor;
        this.boxBackground.setFillColor(ColorStateList.valueOf(iCalculateBoxBackgroundColor));
        applyBoxUnderlineAttributes();
        updateEditTextBoxBackgroundIfNeeded();
        int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
        d = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 84 / 0;
        }
    }

    private void applyBoxUnderlineAttributes() {
        ColorStateList colorStateListValueOf;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
        d = i2 % 128;
        int i3 = i2 % 2;
        if (this.boxUnderlineDefault == null || this.boxUnderlineFocused == null) {
            return;
        }
        if (canDrawStroke()) {
            int i4 = d + 59;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
            MaterialShapeDrawable materialShapeDrawable = this.boxUnderlineDefault;
            if (!(!this.editText.isFocused())) {
                colorStateListValueOf = ColorStateList.valueOf(this.defaultStrokeColor);
            } else {
                colorStateListValueOf = ColorStateList.valueOf(this.boxStrokeColor);
                int i6 = d + 21;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 4 % 2;
                }
            }
            materialShapeDrawable.setFillColor(colorStateListValueOf);
            this.boxUnderlineFocused.setFillColor(ColorStateList.valueOf(this.boxStrokeColor));
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
            d = i8 % 128;
            int i9 = i8 % 2;
        }
        invalidate();
    }

    private boolean canDrawOutlineStroke() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 105;
        int i3 = i2 % 128;
        d = i3;
        if (i2 % 2 == 0) {
            if (this.boxBackgroundMode != 4) {
                return false;
            }
        } else if (this.boxBackgroundMode != 2) {
            return false;
        }
        int i4 = i3 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        if (!canDrawStroke()) {
            return false;
        }
        int i6 = d + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    private boolean canDrawStroke() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 61;
        d = i3 % 128;
        int i4 = i3 % 2;
        if (this.boxStrokeWidthPx < 0 || this.boxStrokeColor == 0) {
            return false;
        }
        int i5 = i2 + 61;
        d = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    void updateEditTextBackground() {
        Drawable background;
        TextView textView;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 125;
        d = i3 % 128;
        int i4 = i3 % 2;
        EditText editText = this.editText;
        if (editText != null) {
            int i5 = i2 + 19;
            d = i5 % 128;
            int i6 = i5 % 2;
            if (this.boxBackgroundMode != 0 || (background = editText.getBackground()) == null) {
                return;
            }
            int i7 = d + 7;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
            int i8 = i7 % 2;
            if (DrawableUtils.canSafelyMutateDrawable(background)) {
                int i9 = d + 25;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
                if (i9 % 2 != 0) {
                    background.mutate();
                    throw null;
                }
                background = background.mutate();
            }
            if (!(!shouldShowError())) {
                background.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
                return;
            }
            if (!this.counterOverflowed || (textView = this.counterView) == null) {
                DrawableCompat.clearColorFilter(background);
                this.editText.refreshDrawableState();
            } else {
                int i10 = d + 59;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
                int i11 = i10 % 2;
                background.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    boolean shouldShowError() {
        int i = 2 % 2;
        int i2 = d + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        boolean zErrorShouldBeShown = this.indicatorViewController.errorShouldBeShown();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 61;
        d = i4 % 128;
        int i5 = i4 % 2;
        return zErrorShouldBeShown;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        int i = 2 % 2;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (shouldShowError()) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
            d = i2 % 128;
            int i3 = i2 % 2;
            savedState.error = getError();
        }
        savedState.isEndIconChecked = this.endLayout.isEndIconChecked();
        int i4 = d + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return savedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        int i = 2 % 2;
        int i2 = d + 115;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        if (!(parcelable instanceof SavedState)) {
            int i5 = i3 + 43;
            d = i5 % 128;
            if (i5 % 2 != 0) {
                super.onRestoreInstanceState(parcelable);
                return;
            } else {
                super.onRestoreInstanceState(parcelable);
                throw null;
            }
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setError(savedState.error);
        if (savedState.isEndIconChecked) {
            post(new Runnable() { // from class: com.google.android.material.textfield.TextInputLayout.2
                @Override // java.lang.Runnable
                public void run() {
                    TextInputLayout.access$300(TextInputLayout.this).checkEndIcon();
                }
            });
        }
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        int i = 2 % 2;
        int i2 = d + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            this.restoringSavedState = true;
            super.dispatchRestoreInstanceState(sparseArray);
            this.restoringSavedState = true;
        } else {
            this.restoringSavedState = true;
            super.dispatchRestoreInstanceState(sparseArray);
            this.restoringSavedState = false;
        }
        int i3 = d + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
    }

    public CharSequence getError() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 99;
        d = i2 % 128;
        int i3 = i2 % 2;
        if (!this.indicatorViewController.isErrorEnabled()) {
            return null;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
        d = i4 % 128;
        int i5 = i4 % 2;
        CharSequence errorText = this.indicatorViewController.getErrorText();
        int i6 = d + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
        int i7 = i6 % 2;
        return errorText;
    }

    public CharSequence getHelperText() {
        int i = 2 % 2;
        int i2 = d + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.indicatorViewController.isHelperTextEnabled();
            obj.hashCode();
            throw null;
        }
        if (this.indicatorViewController.isHelperTextEnabled()) {
            return this.indicatorViewController.getHelperText();
        }
        int i3 = d + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    public boolean isHintAnimationEnabled() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 95;
        d = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.hintAnimationEnabled;
        if (i3 == 0) {
            int i4 = 71 / 0;
        }
        return z;
    }

    public void setHintAnimationEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 15;
        d = i3 % 128;
        int i4 = i3 % 2;
        this.hintAnimationEnabled = z;
        int i5 = i2 + 13;
        d = i5 % 128;
        int i6 = i5 % 2;
    }

    public boolean isExpandedHintEnabled() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 123;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        boolean z = this.expandedHintEnabled;
        int i5 = i3 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public void setExpandedHintEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this.expandedHintEnabled != z) {
            this.expandedHintEnabled = z;
            updateLabelState(false);
            int i3 = d + 113;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i) {
        int i2 = 2 % 2;
        int i3 = d + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        super.onRtlPropertiesChanged(i);
        boolean z = true;
        if (i != 1) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 91;
            d = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        if (z != this.areCornerRadiiRtl) {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 125;
            d = i7 % 128;
            int i8 = i7 % 2;
            float cornerSize = this.shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(this.tmpRectF);
            float cornerSize2 = this.shapeAppearanceModel.getTopRightCornerSize().getCornerSize(this.tmpRectF);
            float cornerSize3 = this.shapeAppearanceModel.getBottomLeftCornerSize().getCornerSize(this.tmpRectF);
            float cornerSize4 = this.shapeAppearanceModel.getBottomRightCornerSize().getCornerSize(this.tmpRectF);
            CornerTreatment topLeftCorner = this.shapeAppearanceModel.getTopLeftCorner();
            CornerTreatment topRightCorner = this.shapeAppearanceModel.getTopRightCorner();
            ShapeAppearanceModel shapeAppearanceModelBuild = ShapeAppearanceModel.builder().setTopLeftCorner(topRightCorner).setTopRightCorner(topLeftCorner).setBottomLeftCorner(this.shapeAppearanceModel.getBottomRightCorner()).setBottomRightCorner(this.shapeAppearanceModel.getBottomLeftCorner()).setTopLeftCornerSize(cornerSize2).setTopRightCornerSize(cornerSize).setBottomLeftCornerSize(cornerSize4).setBottomRightCornerSize(cornerSize3).build();
            this.areCornerRadiiRtl = z;
            setShapeAppearanceModel(shapeAppearanceModelBuild);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 113;
        d = i4 % 128;
        int i5 = i4 % 2;
        super.onMeasure(i, i2);
        if (!this.globalLayoutListenerAdded) {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
            d = i6 % 128;
            if (i6 % 2 == 0) {
                this.endLayout.getViewTreeObserver().addOnGlobalLayoutListener(this);
                this.globalLayoutListenerAdded = true;
            } else {
                this.endLayout.getViewTreeObserver().addOnGlobalLayoutListener(this);
                this.globalLayoutListenerAdded = true;
            }
        }
        updatePlaceholderMeasurementsBasedOnEditText();
        this.endLayout.updateSuffixTextViewPadding();
        int i7 = d + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
        int i8 = i7 % 2;
    }

    private boolean updateEditTextHeightBasedOnIcon() {
        int iMax;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 45;
        d = i2 % 128;
        int i3 = i2 % 2;
        if (this.editText == null || this.editText.getMeasuredHeight() >= (iMax = Math.max(this.endLayout.getMeasuredHeight(), this.startLayout.getMeasuredHeight()))) {
            return false;
        }
        int i4 = d + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        this.editText.setMinimumHeight(iMax);
        return i5 == 0;
    }

    private void updatePlaceholderMeasurementsBasedOnEditText() {
        int i = 2 % 2;
        if (this.placeholderTextView != null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 69;
            int i3 = i2 % 128;
            d = i3;
            int i4 = i2 % 2;
            EditText editText = this.editText;
            if (editText != null) {
                int i5 = i3 + 41;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
                int i6 = i5 % 2;
                this.placeholderTextView.setGravity(editText.getGravity());
                this.placeholderTextView.setPadding(this.editText.getCompoundPaddingLeft(), this.editText.getCompoundPaddingTop(), this.editText.getCompoundPaddingRight(), this.editText.getCompoundPaddingBottom());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    public void setStartIconDrawable(int i) {
        Drawable drawable;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
        int i4 = i3 % 128;
        d = i4;
        if (i3 % 2 == 0) {
            int i5 = 25 / 0;
            if (i != 0) {
                int i6 = i4 + 87;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
                int i7 = i6 % 2;
                drawable = AppCompatResources.getDrawable(getContext(), i);
            } else {
                drawable = null;
            }
        } else if (i != 0) {
            int i8 = i4 + 87;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
            int i9 = i8 % 2;
            drawable = AppCompatResources.getDrawable(getContext(), i);
        } else {
            drawable = null;
        }
        setStartIconDrawable(drawable);
    }

    public void setStartIconDrawable(Drawable drawable) {
        int i = 2 % 2;
        int i2 = d + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.startLayout.setStartIconDrawable(drawable);
        int i4 = d + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 8 / 0;
        }
    }

    public Drawable getStartIconDrawable() {
        int i = 2 % 2;
        int i2 = d + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Drawable startIconDrawable = this.startLayout.getStartIconDrawable();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 25;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return startIconDrawable;
        }
        throw null;
    }

    public void setStartIconMinSize(int i) {
        int i2 = 2 % 2;
        int i3 = d + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        this.startLayout.setStartIconMinSize(i);
        if (i4 != 0) {
            throw null;
        }
    }

    public int getStartIconMinSize() {
        int startIconMinSize;
        int i = 2 % 2;
        int i2 = d + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            startIconMinSize = this.startLayout.getStartIconMinSize();
            int i3 = 12 / 0;
        } else {
            startIconMinSize = this.startLayout.getStartIconMinSize();
        }
        int i4 = d + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return startIconMinSize;
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 25;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            this.startLayout.setStartIconOnClickListener(onClickListener);
            int i3 = 87 / 0;
        } else {
            this.startLayout.setStartIconOnClickListener(onClickListener);
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 3;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 57;
        d = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 29944);
            int i4 = 1755 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int longPressTimeout = 23 - (ViewConfiguration.getLongPressTimeout() >> 16);
            byte b2 = $$a[80];
            Object[] objArr = new Object[1];
            a((short) 89, b2, (byte) (b2 | 36), objArr);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionType, i4, longPressTimeout, 986134021, false, (String) objArr[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr2 = new Object[1];
        c(new char[]{15, '0', 22, Typography.amp, ')', ' ', 22, 17, ')', 25, 19, 29, '0', Typography.quote, 21, 11, '\'', 5, 11, '%', Typography.dollar, 21}, (byte) (14 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 22 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        c(new char[]{'\b', '\n', 19, '0', 21, '\r', 25, 27, '\r', 14, 11, 23, '!', ')', 13859}, (byte) (AndroidCharacter.getMirror('0') - '\f'), 15 - (ViewConfiguration.getScrollBarSize() >> 8), objArr3);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 29944);
            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1755;
            int iLastIndexOf = 22 - TextUtils.lastIndexOf("", '0', 0, 0);
            byte[] bArr = $$a;
            Object[] objArr4 = new Object[1];
            a(bArr[7], bArr[80], (byte) ($$b & 62), objArr4);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, packedPositionGroup, iLastIndexOf, 1596667560, false, (String) objArr4[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 107;
            d = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char deadChar = (char) (29944 - KeyEvent.getDeadChar(0, 0));
                int packedPositionType2 = 1755 - ExpandableListView.getPackedPositionType(0L);
                int iLastIndexOf2 = 22 - TextUtils.lastIndexOf("", '0', 0, 0);
                Object[] objArr5 = new Object[1];
                a((short) 141, $$a[80], (byte) ($$b & 62), objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(deadChar, packedPositionType2, iLastIndexOf2, 1599039318, false, (String) objArr5[0], null);
            }
            Object[] objArr6 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = new Object[]{new int[]{((int[]) objArr6[0])[0]}, new int[]{((int[]) objArr6[1])[0]}, (Object[]) objArr6[2], new int[1], (String[]) objArr6[4]};
            int iMyUid = Process.myUid();
            int i7 = ~iMyUid;
            int i8 = ((((~(i7 | (-495190696))) | ((~((-707793122) | i7)) | 134217889)) * (-397)) - 689086463) + ((iMyUid | (-934548039)) * 397) + 1850851668;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr7 = new Object[1];
            c(new char[]{6, 17, 6, 19, 16, '\b', 15, '0', '+', 16, Typography.quote, '(', 21, 26, '\f', '#'}, (byte) (Process.getGidForName("") + 103), KeyEvent.normalizeMetaState(0) + 16, objArr7);
            Class<?> cls2 = Class.forName((String) objArr7[0]);
            Object[] objArr8 = new Object[1];
            c(new char[]{31, 27, '\b', '*', 27, ' ', 27, '\'', Typography.quote, 18, 23, 6, 11, '.', 21, '\n'}, (byte) ((Process.myTid() >> 22) + 121), 16 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr8);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr9 = {-272026566};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ExpandableListView.getPackedPositionChild(0L) + 42050), 1725 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = ProvinceItem.TuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr9), 1850851668, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char trimmedLength = (char) (29944 - TextUtils.getTrimmedLength(""));
                    int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0) + 1756;
                    int tapTimeout = 23 - (ViewConfiguration.getTapTimeout() >> 16);
                    Object[] objArr10 = new Object[1];
                    a((short) 141, $$a[80], (byte) ($$b & 62), objArr10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(trimmedLength, iLastIndexOf3, tapTimeout, 1599039318, false, (String) objArr10[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113);
                try {
                    Object[] objArr11 = new Object[1];
                    c(new char[]{15, '0', 22, Typography.amp, ')', ' ', 22, 17, ')', 25, 19, 29, '0', Typography.quote, 21, 11, '\'', 5, 11, '%', Typography.dollar, 21}, (byte) (TextUtils.lastIndexOf("", '0', 0) + 14), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 23, objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    c(new char[]{'\b', '\n', 19, '0', 21, '\r', 25, 27, '\r', 14, 11, 23, '!', ')', 13859}, (byte) (35 - TextUtils.indexOf((CharSequence) "", '0')), 15 - View.getDefaultSize(0, 0), objArr12);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char pressedStateDuration = (char) (29944 - (ViewConfiguration.getPressedStateDuration() >> 16));
                        int iGreen = 1755 - Color.green(0);
                        int trimmedLength2 = 23 - TextUtils.getTrimmedLength("");
                        byte[] bArr2 = $$a;
                        Object[] objArr13 = new Object[1];
                        a(bArr2[7], bArr2[80], (byte) ($$b & 62), objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(pressedStateDuration, iGreen, trimmedLength2, 1596667560, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cResolveSizeAndState = (char) (29944 - View.resolveSizeAndState(0, 0, 0));
                        int iIndexOf = 1755 - TextUtils.indexOf("", "");
                        int i11 = 24 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        byte b3 = $$a[80];
                        Object[] objArr14 = new Object[1];
                        a((short) 89, b3, (byte) (b3 | 36), objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cResolveSizeAndState, iIndexOf, i11, 986134021, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
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
        int i12 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0];
        int i13 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0];
        if (i13 == i12) {
            int i14 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0];
            Object[] objArr15 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i15 = i14 + ((((-768553724) + (((~((-269750533) | iIdentityHashCode)) | (~((-57148107) | iIdentityHashCode))) * 69)) + (((~(iIdentityHashCode | (-602416843))) | ((~((-815019269) | iIdentityHashCode)) | 545268736)) * (-69))) - 50006731);
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr15[3])[0] = i17 ^ (i17 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4];
            if (strArr != null) {
                for (String str : strArr) {
                    int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 9;
                    d = i18 % 128;
                    int i19 = i18 % 2;
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i13];
            int i20 = i13 - 1;
            iArr[i20] = 1;
            Toast.makeText((Context) null, iArr[((i13 * i20) % 2) - 1], 1).show();
            int i21 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0];
            Object[] objArr16 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i22 = ~iIdentityHashCode2;
            int i23 = i21 + 1353485922 + (((-357827081) | i22) * (-369)) + (((~((-573299048) | i22)) | (-360696622)) * (-369)) + (((~(iIdentityHashCode2 | 573299047)) | (-931126128) | (~(i22 | (-2869542)))) * 369);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr16[3])[0] = i25 ^ (i25 << 5);
        }
        this.startLayout.setStartIconOnLongClickListener(onLongClickListener);
    }

    public void setStartIconVisible(boolean z) {
        int i = 2 % 2;
        int i2 = d + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.startLayout.setStartIconVisible(z);
        int i4 = d + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean isStartIconVisible() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 89;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            this.startLayout.isStartIconVisible();
            throw null;
        }
        boolean zIsStartIconVisible = this.startLayout.isStartIconVisible();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
        d = i3 % 128;
        int i4 = i3 % 2;
        return zIsStartIconVisible;
    }

    public void refreshStartIconDrawableState() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 5;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.startLayout.refreshStartIconDrawableState();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 93;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setStartIconCheckable(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 29;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.startLayout.setStartIconCheckable(z);
        if (i3 == 0) {
            int i4 = 48 / 0;
        }
    }

    public boolean isStartIconCheckable() {
        int i = 2 % 2;
        int i2 = d + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsStartIconCheckable = this.startLayout.isStartIconCheckable();
        int i4 = d + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return zIsStartIconCheckable;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    public void setStartIconContentDescription(int i) {
        CharSequence text;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 69;
        int i4 = i3 % 128;
        d = i4;
        if (i3 % 2 == 0) {
            int i5 = 21 / 0;
            if (i != 0) {
                text = getResources().getText(i);
            } else {
                int i6 = i4 + 5;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
                int i7 = i6 % 2;
                text = null;
            }
        } else if (i != 0) {
            text = getResources().getText(i);
        } else {
            int i8 = i4 + 5;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
            int i9 = i8 % 2;
            text = null;
        }
        setStartIconContentDescription(text);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.startLayout.setStartIconContentDescription(charSequence);
        if (i3 == 0) {
            throw null;
        }
    }

    public CharSequence getStartIconContentDescription() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
        d = i2 % 128;
        int i3 = i2 % 2;
        CharSequence startIconContentDescription = this.startLayout.getStartIconContentDescription();
        int i4 = d + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 13 / 0;
        }
        return startIconContentDescription;
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 91;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.startLayout.setStartIconTintList(colorStateList);
        int i4 = d + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 28 / 0;
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.startLayout.setStartIconTintMode(mode);
        int i4 = d + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 79 / 0;
        }
    }

    public void setEndIconMode(int i) {
        int i2 = 2 % 2;
        int i3 = d + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            this.endLayout.setEndIconMode(i);
            throw null;
        }
        this.endLayout.setEndIconMode(i);
        int i4 = d + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public int getEndIconMode() {
        int i = 2 % 2;
        int i2 = d + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        EndCompoundLayout endCompoundLayout = this.endLayout;
        if (i3 == 0) {
            return endCompoundLayout.getEndIconMode();
        }
        endCompoundLayout.getEndIconMode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        int i = 2 % 2;
        int i2 = d + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.endLayout.setEndIconOnClickListener(onClickListener);
        int i4 = d + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 23;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.endLayout.setErrorIconOnClickListener(onClickListener);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 95;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 32 / 0;
        }
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        int i = 2 % 2;
        int i2 = d + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            this.endLayout.setEndIconOnLongClickListener(onLongClickListener);
            throw null;
        }
        this.endLayout.setEndIconOnLongClickListener(onLongClickListener);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
        d = i3 % 128;
        int i4 = i3 % 2;
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        int i = 2 % 2;
        int i2 = d + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            this.endLayout.setErrorIconOnLongClickListener(onLongClickListener);
            throw null;
        }
        this.endLayout.setErrorIconOnLongClickListener(onLongClickListener);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 99;
        d = i3 % 128;
        int i4 = i3 % 2;
    }

    public void refreshErrorIconDrawableState() {
        int i = 2 % 2;
        int i2 = d + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.endLayout.refreshErrorIconDrawableState();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 107;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setEndIconVisible(boolean z) {
        int i = 2 % 2;
        int i2 = d + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.endLayout.setEndIconVisible(z);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 7;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean isEndIconVisible() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 57;
        d = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsEndIconVisible = this.endLayout.isEndIconVisible();
        if (i3 == 0) {
            int i4 = 44 / 0;
        }
        return zIsEndIconVisible;
    }

    public void setEndIconActivated(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.endLayout.setEndIconActivated(z);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 117;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    public void refreshEndIconDrawableState() {
        int i = 2 % 2;
        int i2 = d + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.endLayout.refreshEndIconDrawableState();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 57;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public void setEndIconCheckable(boolean z) {
        int i = 2 % 2;
        int i2 = d + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            this.endLayout.setEndIconCheckable(z);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.endLayout.setEndIconCheckable(z);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
        d = i3 % 128;
        int i4 = i3 % 2;
    }

    public boolean isEndIconCheckable() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 3;
        d = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsEndIconCheckable = this.endLayout.isEndIconCheckable();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return zIsEndIconCheckable;
        }
        throw null;
    }

    public void setEndIconDrawable(int i) throws Throwable {
        Object[] objArr;
        int i2 = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 31534);
            int scrollDefaultDelay = 921 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            int iLastIndexOf = 27 - TextUtils.lastIndexOf("", '0', 0, 0);
            byte b2 = $$a[7];
            Object[] objArr2 = new Object[1];
            a((short) 141, b2, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(modifierMetaStateMask, scrollDefaultDelay, iLastIndexOf, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{15, '0', 22, Typography.amp, ')', ' ', 22, 17, ')', 25, 19, 29, '0', Typography.quote, 21, 11, '\'', 5, 11, '%', Typography.dollar, 21}, (byte) (ImageFormat.getBitsPerPixel(0) + 14), 22 - KeyEvent.getDeadChar(0, 0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{'\b', '\n', 19, '0', 21, '\r', 25, 27, '\r', 14, 11, 23, '!', ')', 13859}, (byte) (36 - View.combineMeasuredStates(0, 0)), 14 - ExpandableListView.getPackedPositionChild(0L), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char absoluteGravity = (char) (31533 - Gravity.getAbsoluteGravity(0, 0));
            int i3 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 920;
            int capsMode = 28 - TextUtils.getCapsMode("", 0, 0);
            Object[] objArr5 = new Object[1];
            a((short) 141, $$a[80], (byte) ($$b & 62), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(absoluteGravity, i3, capsMode, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = d + 73;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cRgb = (char) ((-16745683) - Color.rgb(0, 0, 0));
                int iMyPid = 921 - (Process.myPid() >> 22);
                int tapTimeout = 28 - (ViewConfiguration.getTapTimeout() >> 16);
                byte b3 = $$a[80];
                Object[] objArr6 = new Object[1];
                a((short) 89, b3, (byte) (b3 | 36), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cRgb, iMyPid, tapTimeout, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i ^ (i << 5)}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int i6 = (((((~((-951223341) | i)) | 163139139) * 262) + 1608708207) + (((~((-951223341) | (~i))) | 163139139) * 262)) - 1970823462;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{15, '0', 22, Typography.amp, ')', ' ', 22, 17, 19, '0', '+', 19, 0, '*', 27, ' ', 6, '!', 27, '\'', 23, 0, '#', '\b', 17, 27}, (byte) (55 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 26 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{'(', 7, 13804, 13804, '\b', '*', 21, '.', 13806, 13806, '\r', 30, ')', 14, 27, ' ', Typography.dollar, '.'}, (byte) (4 - View.resolveSize(0, 0)), 18 - (ViewConfiguration.getEdgeSlop() >> 16), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = (!((applicationContext instanceof ContextWrapper) ^ true) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            int i9 = d + 45;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
            int i10 = i9 % 2;
            try {
                Object[] objArr10 = {applicationContext, Integer.valueOf(i), 0, -1970823462};
                byte[] bArr = $$d;
                byte b4 = (byte) (-bArr[14]);
                short s = bArr[5];
                Object[] objArr11 = new Object[1];
                e(b4, s, (byte) (s | 12), objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                Object[] objArr12 = new Object[1];
                e(bArr[5], (short) (-bArr[14]), bArr[12], objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cBlue = (char) (31533 - Color.blue(0));
                    int iGreen = 921 - Color.green(0);
                    int i11 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 27;
                    byte b5 = $$a[80];
                    Object[] objArr14 = new Object[1];
                    a((short) 89, b5, (byte) (b5 | 36), objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cBlue, iGreen, i11, -1142834547, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    c(new char[]{15, '0', 22, Typography.amp, ')', ' ', 22, 17, ')', 25, 19, 29, '0', Typography.quote, 21, 11, '\'', 5, 11, '%', Typography.dollar, 21}, (byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 12), ExpandableListView.getPackedPositionGroup(0L) + 22, objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    c(new char[]{'\b', '\n', 19, '0', 21, '\r', 25, 27, '\r', 14, 11, 23, '!', ')', 13859}, (byte) (36 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15, objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char doubleTapTimeout = (char) (31533 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                        int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 922;
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 28;
                        Object[] objArr17 = new Object[1];
                        a((short) 141, $$a[80], (byte) ($$b & 62), objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(doubleTapTimeout, iLastIndexOf2, packedPositionType, -778300370, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cRed = (char) (Color.red(0) + 31533);
                        int i12 = 922 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 28;
                        byte b6 = $$a[7];
                        Object[] objArr18 = new Object[1];
                        a((short) 141, b6, b6, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cRed, i12, jumpTapTimeout, -1048449946, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr13;
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
        if (((int[]) objArr[3])[0] == ((int[]) objArr[1])[0]) {
            int i13 = ((int[]) objArr[0])[0];
            Object[] objArr19 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iMyPid2 = Process.myPid();
            int i14 = ~iMyPid2;
            int i15 = i13 + (-2007493469) + ((iMyPid2 | 19990019) * 988) + (((~(24610351 | i14)) | 1744848960) * (-1976)) + (((~(iMyPid2 | (-1749469293))) | 19990019 | (~(1749469292 | i14))) * 988);
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr19[0])[0] = i17 ^ (i17 << 5);
            this.endLayout.setEndIconDrawable(i);
            return;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = (String[]) objArr[4];
        if (strArr == null) {
            throw null;
        }
        int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
        d = i18 % 128;
        if (i18 % 2 == 0) {
            int i19 = 4 / 2;
        }
        for (String str : strArr) {
            arrayList.add(str);
        }
        throw null;
    }

    public static class AccessibilityDelegate extends AccessibilityDelegateCompat {
        private final TextInputLayout layout;

        public AccessibilityDelegate(TextInputLayout textInputLayout) {
            this.layout = textInputLayout;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            EditText editText = this.layout.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.layout.getHint();
            CharSequence error = this.layout.getError();
            CharSequence placeholderText = this.layout.getPlaceholderText();
            int counterMaxLength = this.layout.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.layout.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean zIsEmpty2 = TextUtils.isEmpty(hint);
            boolean zIsHintExpanded = this.layout.isHintExpanded();
            boolean zIsEmpty3 = TextUtils.isEmpty(error);
            boolean z = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
            String string = !zIsEmpty2 ? hint.toString() : "";
            TextInputLayout.access$400(this.layout).setupAccessibilityNodeInfo(accessibilityNodeInfoCompat);
            if (!zIsEmpty) {
                accessibilityNodeInfoCompat.setText(text);
            } else if (!TextUtils.isEmpty(string)) {
                accessibilityNodeInfoCompat.setText(string);
                if (!zIsHintExpanded && placeholderText != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(string);
                    sb.append(", ");
                    sb.append((Object) placeholderText);
                    accessibilityNodeInfoCompat.setText(sb.toString());
                }
            } else if (placeholderText != null) {
                accessibilityNodeInfoCompat.setText(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    accessibilityNodeInfoCompat.setHintText(string);
                } else {
                    if (!zIsEmpty) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append((Object) text);
                        sb2.append(", ");
                        sb2.append(string);
                        string = sb2.toString();
                    }
                    accessibilityNodeInfoCompat.setText(string);
                }
                accessibilityNodeInfoCompat.setShowingHintText(zIsEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            accessibilityNodeInfoCompat.setMaxTextLength(counterMaxLength);
            if (z) {
                if (zIsEmpty3) {
                    error = counterOverflowDescription;
                }
                accessibilityNodeInfoCompat.setError(error);
            }
            View helperTextView = TextInputLayout.access$500(this.layout).getHelperTextView();
            if (helperTextView != null) {
                accessibilityNodeInfoCompat.setLabelFor(helperTextView);
            }
            TextInputLayout.access$300(this.layout).getEndIconDelegate().onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            TextInputLayout.access$300(this.layout).getEndIconDelegate().onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }

    public void setEndIconDrawable(Drawable drawable) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = d + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        int i4 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 37567);
            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 625;
            int iIndexOf = 13 - TextUtils.indexOf((CharSequence) "", '0', 0);
            byte b2 = $$a[7];
            Object[] objArr2 = new Object[1];
            a((short) 141, b2, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarFadeDuration, maxKeyCode, iIndexOf, -477065106, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{15, '0', 22, Typography.amp, ')', ' ', 22, 17, ')', 25, 19, 29, '0', Typography.quote, 21, 11, '\'', 5, 11, '%', Typography.dollar, 21}, (byte) (View.MeasureSpec.makeMeasureSpec(0, 0) + 13), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 22, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{'\b', '\n', 19, '0', 21, '\r', 25, 27, '\r', 14, 11, 23, '!', ')', 13859}, (byte) (Drawable.resolveOpacity(0, 0) + 36), TextUtils.indexOf((CharSequence) "", '0') + 16, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (37567 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
            int absoluteGravity = 625 - Gravity.getAbsoluteGravity(0, 0);
            int iKeyCodeFromString = 14 - KeyEvent.keyCodeFromString("");
            int i5 = $$b;
            Object[] objArr5 = new Object[1];
            a((short) (i5 & 62), $$a[80], (byte) (i5 & 62), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, absoluteGravity, iKeyCodeFromString, -976899241, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 79;
            d = i6 % 128;
            int i7 = i6 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) (37566 - TextUtils.indexOf((CharSequence) "", '0', 0));
                int scrollBarFadeDuration2 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 625;
                int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 14;
                Object[] objArr6 = new Object[1];
                a((short) 141, $$a[80], (byte) ($$b & 62), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, scrollBarFadeDuration2, longPressTimeout, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i8 = ((int[]) objArr7[2])[0];
            int i9 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i8};
            int iMyTid = Process.myTid();
            int i10 = (-1001994936) + (((-1263269577) | iMyTid) * 376) + (((~((~iMyTid) | 331233704)) | (-1543503849)) * (-376)) + (((~(iMyTid | (-331233705))) | 1492504416) * 376) + 592921914;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[1])[0] = i12 ^ (i12 << 5);
            objArr = new Object[]{new int[]{i9}, new int[1], iArr, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{15, '0', 22, Typography.amp, ')', ' ', 22, 17, 19, '0', '+', 19, 0, '*', 27, ' ', 6, '!', 27, '\'', 23, 0, '#', '\b', 17, 27}, (byte) (55 - KeyEvent.normalizeMetaState(0)), 26 - KeyEvent.getDeadChar(0, 0), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{'(', 7, 13804, 13804, '\b', '*', 21, '.', 13806, 13806, '\r', 30, ')', 14, 27, ' ', Typography.dollar, '.'}, (byte) (4 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 18, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
                d = i13 % 128;
                int i14 = i13 % 2;
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{6, 17, 6, 19, 16, '\b', 15, '0', '+', 16, Typography.quote, '(', 21, 26, '\f', '#'}, (byte) (102 - View.getDefaultSize(0, 0)), 16 - TextUtils.indexOf("", "", 0, 0), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{31, 27, '\b', '*', 27, ' ', 27, '\'', Typography.quote, 18, 23, 6, 11, '.', 21, '\n'}, (byte) (View.resolveSize(0, 0) + 121), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 15, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr12 = new Object[1];
            c(new char[]{11, '\b', '0', 18, 17, Typography.quote, '+', ' ', ' ', '*', '-', '\'', 13824, 13824, 17, ')', 20, 6, 28, '\b', ')', '\n', '\n', Typography.quote, '\b', 7, Typography.quote, '-', 3, 21, 21, 30, Typography.quote, 14, 7, 31, 13740, 13740, 20, 14, '-', '\'', 26, 16, '*', 11, 3, '#', 17, '0', 20, 14, 26, 16, 17, Typography.amp, '!', 14, 24, 30, ' ', '-', 17, Typography.amp}, (byte) (-TextUtils.indexOf((CharSequence) "", '0')), 64 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr12);
            String str = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            c(new char[]{')', 14, 22, 31, 3, '-', Typography.quote, '\n', 11, '*', 3, Typography.amp, '\b', 11, ',', 25, 7, 3, 28, 1, ')', '\n', '+', ' ', 30, 24, ' ', 29, 7, '#', '!', 14, 29, ' ', ')', '-', 21, '\t', 17, '\r', 11, '\b', '+', ' ', '\t', 27, 13800, 13800, '#', '*', 13794, 13794, 30, 24, 3, 7, '\'', '*', '\t', 24, 17, '0', ' ', '+'}, (byte) (TextUtils.getOffsetAfter("", 0) + 63), 64 - View.combineMeasuredStates(0, 0), objArr13);
            try {
                Object[] objArr14 = {applicationContext, new String[]{str, (String) objArr13[0]}, Integer.valueOf(iIntValue), 17, 592921914};
                byte[] bArr = $$d;
                Object[] objArr15 = new Object[1];
                e((byte) 39, (short) (-bArr[14]), (byte) (bArr[12] - 1), objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                Object[] objArr16 = new Object[1];
                e((byte) (-bArr[22]), (short) 94, (byte) (bArr[106] + 1), objArr16);
                Object[] objArr17 = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                int i15 = ((int[]) objArr17[0])[0];
                int i16 = ((int[]) objArr17[2])[0];
                if (applicationContext != null) {
                    int i17 = d + 57;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i17 % 128;
                    int i18 = i17 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cIndexOf2 = (char) (37566 - TextUtils.indexOf((CharSequence) "", '0', 0));
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 626;
                        int absoluteGravity2 = 14 - Gravity.getAbsoluteGravity(0, 0);
                        Object[] objArr18 = new Object[1];
                        a((short) 141, $$a[80], (byte) ($$b & 62), objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf2, packedPositionChild, absoluteGravity2, -973632554, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr17);
                    try {
                        Object[] objArr19 = new Object[1];
                        c(new char[]{15, '0', 22, Typography.amp, ')', ' ', 22, 17, ')', 25, 19, 29, '0', Typography.quote, 21, 11, '\'', 5, 11, '%', Typography.dollar, 21}, (byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 13), 22 - TextUtils.indexOf("", "", 0), objArr19);
                        Class<?> cls5 = Class.forName((String) objArr19[0]);
                        Object[] objArr20 = new Object[1];
                        c(new char[]{'\b', '\n', 19, '0', 21, '\r', 25, 27, '\r', 14, 11, 23, '!', ')', 13859}, (byte) (36 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (ViewConfiguration.getLongPressTimeout() >> 16) + 15, objArr20);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr20[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char maxKeyCode2 = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 37567);
                            int i19 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 625;
                            int maxKeyCode3 = (KeyEvent.getMaxKeyCode() >> 16) + 14;
                            int i20 = $$b;
                            Object[] objArr21 = new Object[1];
                            a((short) (i20 & 62), $$a[80], (byte) (i20 & 62), objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maxKeyCode2, i19, maxKeyCode3, -976899241, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 37567);
                            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 625;
                            int i21 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 15;
                            byte b3 = $$a[7];
                            Object[] objArr22 = new Object[1];
                            a((short) 141, b3, b3, objArr22);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionType, doubleTapTimeout, i21, -477065106, false, (String) objArr22[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr17;
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
            String[] strArr2 = (String[]) objArr[3];
            if (strArr2 == null) {
                throw null;
            }
            while (i4 < strArr2.length) {
                arrayList.add(strArr2[i4]);
                i4++;
                int i22 = d + 7;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i22 % 128;
                int i23 = i22 % 2;
            }
            throw null;
        }
        int i24 = ((int[]) objArr[1])[0];
        int i25 = ((int[]) objArr[2])[0];
        int i26 = ((int[]) objArr[0])[0];
        String[] strArr3 = (String[]) objArr[3];
        int[] iArr2 = {i25};
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i27 = ~iMaxMemory;
        int i28 = i24 + 378411976 + (((~((-1412016468) | i27)) | 268962065) * 168) + ((~((-268962066) | iMaxMemory)) * 168) + (((~(iMaxMemory | (-1143054403))) | (~(i27 | (-411721654))) | 142759588) * 168);
        int i29 = (i28 << 13) ^ i28;
        int i30 = i29 ^ (i29 >>> 17);
        ((int[]) objArr[1])[0] = i30 ^ (i30 << 5);
        Object[] objArr23 = {new int[]{i26}, new int[1], iArr2, strArr3};
        this.endLayout.setEndIconDrawable(drawable);
    }

    public Drawable getEndIconDrawable() {
        int i = 2 % 2;
        int i2 = d + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Drawable endIconDrawable = this.endLayout.getEndIconDrawable();
        int i4 = d + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            return endIconDrawable;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setEndIconMinSize(int i) {
        int i2 = 2 % 2;
        int i3 = d + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        this.endLayout.setEndIconMinSize(i);
        int i5 = d + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public int getEndIconMinSize() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 121;
        d = i2 % 128;
        int i3 = i2 % 2;
        int endIconMinSize = this.endLayout.getEndIconMinSize();
        int i4 = d + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            return endIconMinSize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        int i = 2 % 2;
        int i2 = d + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.startLayout.setStartIconScaleType(scaleType);
        if (i3 != 0) {
            throw null;
        }
    }

    public ImageView.ScaleType getStartIconScaleType() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
        d = i2 % 128;
        int i3 = i2 % 2;
        ImageView.ScaleType startIconScaleType = this.startLayout.getStartIconScaleType();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 24 / 0;
        }
        return startIconScaleType;
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 53;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.endLayout.setEndIconScaleType(scaleType);
        if (i3 == 0) {
            int i4 = 40 / 0;
        }
    }

    public ImageView.ScaleType getEndIconScaleType() {
        ImageView.ScaleType endIconScaleType;
        int i = 2 % 2;
        int i2 = d + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            endIconScaleType = this.endLayout.getEndIconScaleType();
            int i3 = 26 / 0;
        } else {
            endIconScaleType = this.endLayout.getEndIconScaleType();
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return endIconScaleType;
        }
        throw null;
    }

    public void setEndIconContentDescription(int i) {
        int i2 = 2 % 2;
        int i3 = d + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        this.endLayout.setEndIconContentDescription(i);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 91;
        d = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 105;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.endLayout.setEndIconContentDescription(charSequence);
        int i4 = d + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public CharSequence getEndIconContentDescription() {
        int i = 2 % 2;
        int i2 = d + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        CharSequence endIconContentDescription = this.endLayout.getEndIconContentDescription();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 91;
        d = i4 % 128;
        int i5 = i4 % 2;
        return endIconContentDescription;
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 107;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.endLayout.setEndIconTintList(colorStateList);
        int i4 = d + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0235  */
    public void setEndIconTintMode(PorterDuff.Mode mode) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cRgb = (char) ((-16745683) - Color.rgb(0, 0, 0));
            int i3 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 921;
            int iMakeMeasureSpec = 28 - View.MeasureSpec.makeMeasureSpec(0, 0);
            byte b2 = $$a[7];
            Object[] objArr2 = new Object[1];
            a((short) 141, b2, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRgb, i3, iMakeMeasureSpec, -1048449946, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{15, '0', 22, Typography.amp, ')', ' ', 22, 17, ')', 25, 19, 29, '0', Typography.quote, 21, 11, '\'', 5, 11, '%', Typography.dollar, 21}, (byte) (13 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 21 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{'\b', '\n', 19, '0', 21, '\r', 25, 27, '\r', 14, 11, 23, '!', ')', 13859}, (byte) (35 - ExpandableListView.getPackedPositionChild(0L)), 14 - TextUtils.lastIndexOf("", '0', 0, 0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char offsetAfter = (char) (31533 - TextUtils.getOffsetAfter("", 0));
            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 921;
            int i4 = 29 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            Object[] objArr5 = new Object[1];
            a((short) 141, $$a[80], (byte) ($$b & 62), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(offsetAfter, scrollBarFadeDuration, i4, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 51;
            d = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (31534 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 921;
                int i7 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 28;
                byte b3 = $$a[80];
                Object[] objArr6 = new Object[1];
                a((short) 89, b3, (byte) (b3 | 36), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, jumpTapTimeout, i7, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i8 = ((int[]) objArr7[3])[0];
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{i8}, (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i9 = ~iIdentityHashCode;
            int i10 = 1072426571 + ((~(343125801 | i9)) * (-560)) + ((~(iIdentityHashCode | (-1091047507))) * (-560)) + (((~(1430953842 | i9)) | 3219465) * 560) + 1661101073;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[0])[0] = i12 ^ (i12 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{15, '0', 22, Typography.amp, ')', ' ', 22, 17, 19, '0', '+', 19, 0, '*', 27, ' ', 6, '!', 27, '\'', 23, 0, '#', '\b', 17, 27}, (byte) (54 - TextUtils.indexOf((CharSequence) "", '0', 0)), (ViewConfiguration.getTouchSlop() >> 8) + 26, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{'(', 7, 13804, 13804, '\b', '*', 21, '.', 13806, 13806, '\r', 30, ')', 14, 27, ' ', Typography.dollar, '.'}, (byte) (4 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 18 - Color.blue(0), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i13 = d + 91;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i13 % 128;
                    if (i13 % 2 != 0) {
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
            c(new char[]{6, 17, 6, 19, 16, '\b', 15, '0', '+', 16, Typography.quote, '(', 21, 26, '\f', '#'}, (byte) (102 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 15, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{31, 27, '\b', '*', 27, ' ', 27, '\'', Typography.quote, 18, 23, 6, 11, '.', 21, '\n'}, (byte) (Gravity.getAbsoluteGravity(0, 0) + 121), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 1661101073};
                byte[] bArr = $$d;
                Object[] objArr13 = new Object[1];
                e(bArr[4], (short) 146, bArr[5], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                e(bArr[5], (short) (-bArr[14]), bArr[12], objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 31533);
                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 921;
                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 28;
                    byte b4 = $$a[80];
                    Object[] objArr15 = new Object[1];
                    a((short) 89, b4, (byte) (b4 | 36), objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(touchSlop, iKeyCodeFromString, maximumFlingVelocity, -1142834547, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr16 = new Object[1];
                    c(new char[]{15, '0', 22, Typography.amp, ')', ' ', 22, 17, ')', 25, 19, 29, '0', Typography.quote, 21, 11, '\'', 5, 11, '%', Typography.dollar, 21}, (byte) (13 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 22, objArr16);
                    Class<?> cls5 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    c(new char[]{'\b', '\n', 19, '0', 21, '\r', 25, 27, '\r', 14, 11, 23, '!', ')', 13859}, (byte) (View.MeasureSpec.makeMeasureSpec(0, 0) + 36), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 15, objArr17);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char packedPositionType = (char) (31533 - ExpandableListView.getPackedPositionType(0L));
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0) + 921;
                        int iResolveOpacity = 28 - Drawable.resolveOpacity(0, 0);
                        Object[] objArr18 = new Object[1];
                        a((short) 141, $$a[80], (byte) ($$b & 62), objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionType, iMakeMeasureSpec2, iResolveOpacity, -778300370, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char fadingEdgeLength = (char) (31533 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 921;
                        int iBlue = 28 - Color.blue(0);
                        byte b5 = $$a[7];
                        Object[] objArr19 = new Object[1];
                        a((short) 141, b5, b5, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(fadingEdgeLength, scrollBarSize, iBlue, -1048449946, false, (String) objArr19[0], null);
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
        if (((int[]) objArr[3])[0] == ((int[]) objArr[1])[0]) {
            int i14 = ((int[]) objArr[0])[0];
            int i15 = ((int[]) objArr[3])[0];
            Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i15}, (String[]) objArr[4]};
            int i16 = ~System.identityHashCode(this);
            int i17 = i14 + (-1111181663) + (((-555558481) | i16) * 494) + (((~(i16 | 1184946215)) | (-1706929748)) * 494);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr20[0])[0] = i19 ^ (i19 << 5);
            this.endLayout.setEndIconTintMode(mode);
            int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 101;
            d = i20 % 128;
            int i21 = i20 % 2;
            return;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = (String[]) objArr[4];
        if (strArr == null) {
            throw null;
        }
        int i22 = d + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i22 % 128;
        int i23 = i22 % 2;
        while (i2 < strArr.length) {
            int i24 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
            d = i24 % 128;
            if (i24 % 2 == 0) {
                arrayList.add(strArr[i2]);
                i2 += 85;
            } else {
                arrayList.add(strArr[i2]);
                i2++;
            }
        }
        throw null;
    }

    public void addOnEndIconChangedListener(OnEndIconChangedListener onEndIconChangedListener) {
        int i = 2 % 2;
        int i2 = d + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.endLayout.addOnEndIconChangedListener(onEndIconChangedListener);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 53;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    public void removeOnEndIconChangedListener(OnEndIconChangedListener onEndIconChangedListener) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 61;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.endLayout.removeOnEndIconChangedListener(onEndIconChangedListener);
        if (i3 == 0) {
            throw null;
        }
    }

    public void clearOnEndIconChangedListeners() {
        int i = 2 % 2;
        int i2 = d + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.endLayout.clearOnEndIconChangedListeners();
            obj.hashCode();
            throw null;
        }
        this.endLayout.clearOnEndIconChangedListeners();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 121;
        d = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void addOnEditTextAttachedListener(OnEditTextAttachedListener onEditTextAttachedListener) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.editTextAttachedListeners.add(onEditTextAttachedListener);
        if (this.editText != null) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 51;
            d = i4 % 128;
            int i5 = i4 % 2;
            onEditTextAttachedListener.onEditTextAttached(this);
            if (i5 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public void removeOnEditTextAttachedListener(OnEditTextAttachedListener onEditTextAttachedListener) {
        int i = 2 % 2;
        int i2 = d + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.editTextAttachedListeners.remove(onEditTextAttachedListener);
        if (i3 != 0) {
            throw null;
        }
    }

    public void clearOnEditTextAttachedListeners() {
        int i = 2 % 2;
        int i2 = d + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            this.editTextAttachedListeners.clear();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.editTextAttachedListeners.clear();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 5;
        d = i3 % 128;
        int i4 = i3 % 2;
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        int i2 = 2 % 2;
        int i3 = d + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            this.endLayout.setPasswordVisibilityToggleDrawable(i);
            throw null;
        }
        this.endLayout.setPasswordVisibilityToggleDrawable(i);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 113;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        int i = 2 % 2;
        int i2 = d + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.endLayout.setPasswordVisibilityToggleDrawable(drawable);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 123;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        int i2 = 2 % 2;
        int i3 = d + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            this.endLayout.setPasswordVisibilityToggleContentDescription(i);
            int i4 = 37 / 0;
        } else {
            this.endLayout.setPasswordVisibilityToggleContentDescription(i);
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 61;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = d + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.endLayout.setPasswordVisibilityToggleContentDescription(charSequence);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 99;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        int i = 2 % 2;
        int i2 = d + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Drawable passwordVisibilityToggleDrawable = this.endLayout.getPasswordVisibilityToggleDrawable();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 43;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return passwordVisibilityToggleDrawable;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        int i = 2 % 2;
        int i2 = d + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        CharSequence passwordVisibilityToggleContentDescription = this.endLayout.getPasswordVisibilityToggleContentDescription();
        int i4 = d + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            return passwordVisibilityToggleContentDescription;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public boolean isPasswordVisibilityToggleEnabled() {
        int i = 2 % 2;
        int i2 = d + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsPasswordVisibilityToggleEnabled = this.endLayout.isPasswordVisibilityToggleEnabled();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 121;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return zIsPasswordVisibilityToggleEnabled;
        }
        throw null;
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = d + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            this.endLayout.setPasswordVisibilityToggleEnabled(z);
            int i3 = 12 / 0;
        } else {
            this.endLayout.setPasswordVisibilityToggleEnabled(z);
        }
        int i4 = d + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = d + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.endLayout.setPasswordVisibilityToggleTintList(colorStateList);
        int i4 = d + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        int i = 2 % 2;
        int i2 = d + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.endLayout.setPasswordVisibilityToggleTintMode(mode);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    @Deprecated
    public void passwordVisibilityToggleRequested(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 123;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.endLayout.togglePasswordVisibilityToggle(z);
        int i4 = d + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setTextInputAccessibilityDelegate(AccessibilityDelegate accessibilityDelegate) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 89;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        EditText editText = this.editText;
        if (editText != null) {
            ViewCompat.setAccessibilityDelegate(editText, accessibilityDelegate);
        }
        int i3 = d + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
    }

    CheckableImageButton getEndIconView() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
        d = i2 % 128;
        int i3 = i2 % 2;
        EndCompoundLayout endCompoundLayout = this.endLayout;
        if (i3 != 0) {
            return endCompoundLayout.getEndIconView();
        }
        endCompoundLayout.getEndIconView();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void dispatchOnEditTextAttached() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            this.editTextAttachedListeners.iterator();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Iterator<OnEditTextAttachedListener> it = this.editTextAttachedListeners.iterator();
        while (it.hasNext()) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 9;
            d = i3 % 128;
            int i4 = i3 % 2;
            it.next().onEditTextAttached(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    /* JADX WARN: Code duplicated, block: B:22:0x0085  */
    boolean updateDummyDrawables() {
        boolean z;
        int i = 2 % 2;
        if (this.editText == null) {
            return false;
        }
        boolean z2 = true;
        if (shouldUpdateStartDummyDrawable()) {
            int measuredWidth = this.startLayout.getMeasuredWidth() - this.editText.getPaddingLeft();
            if (this.startDummyDrawable != null) {
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 69;
                d = i2 % 128;
                int i3 = i2 % 2;
                if (this.startDummyDrawableWidth != measuredWidth) {
                    ColorDrawable colorDrawable = new ColorDrawable();
                    this.startDummyDrawable = colorDrawable;
                    this.startDummyDrawableWidth = measuredWidth;
                    colorDrawable.setBounds(0, 0, measuredWidth, 1);
                }
            } else {
                ColorDrawable colorDrawable2 = new ColorDrawable();
                this.startDummyDrawable = colorDrawable2;
                this.startDummyDrawableWidth = measuredWidth;
                colorDrawable2.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] compoundDrawablesRelative = TextViewCompat.getCompoundDrawablesRelative(this.editText);
            Drawable drawable = compoundDrawablesRelative[0];
            Drawable drawable2 = this.startDummyDrawable;
            if (drawable != drawable2) {
                int i4 = d + 25;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                if (i4 % 2 != 0) {
                    TextViewCompat.setCompoundDrawablesRelative(this.editText, drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[4]);
                } else {
                    TextViewCompat.setCompoundDrawablesRelative(this.editText, drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                }
                z = true;
            } else {
                z = false;
            }
        } else if (this.startDummyDrawable != null) {
            Drawable[] compoundDrawablesRelative2 = TextViewCompat.getCompoundDrawablesRelative(this.editText);
            TextViewCompat.setCompoundDrawablesRelative(this.editText, null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
            this.startDummyDrawable = null;
            z = true;
        } else {
            z = false;
        }
        if (shouldUpdateEndDummyDrawable()) {
            int measuredWidth2 = this.endLayout.getSuffixTextView().getMeasuredWidth() - this.editText.getPaddingRight();
            CheckableImageButton currentEndIconView = this.endLayout.getCurrentEndIconView();
            if (currentEndIconView != null) {
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 91;
                d = i5 % 128;
                int i6 = i5 % 2;
                measuredWidth2 = measuredWidth2 + currentEndIconView.getMeasuredWidth() + MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) currentEndIconView.getLayoutParams());
            }
            Drawable[] compoundDrawablesRelative3 = TextViewCompat.getCompoundDrawablesRelative(this.editText);
            Drawable drawable3 = this.endDummyDrawable;
            if (drawable3 != null && this.endDummyDrawableWidth != measuredWidth2) {
                this.endDummyDrawableWidth = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                TextViewCompat.setCompoundDrawablesRelative(this.editText, compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.endDummyDrawable, compoundDrawablesRelative3[3]);
                return true;
            }
            if (drawable3 == null) {
                ColorDrawable colorDrawable3 = new ColorDrawable();
                this.endDummyDrawable = colorDrawable3;
                this.endDummyDrawableWidth = measuredWidth2;
                colorDrawable3.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable4 = compoundDrawablesRelative3[2];
            Drawable drawable5 = this.endDummyDrawable;
            if (drawable4 != drawable5) {
                this.originalEditTextEndDrawable = drawable4;
                TextViewCompat.setCompoundDrawablesRelative(this.editText, compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], drawable5, compoundDrawablesRelative3[3]);
                return true;
            }
        } else if (this.endDummyDrawable != null) {
            Drawable[] compoundDrawablesRelative4 = TextViewCompat.getCompoundDrawablesRelative(this.editText);
            if (compoundDrawablesRelative4[2] == this.endDummyDrawable) {
                int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 125;
                d = i7 % 128;
                int i8 = i7 % 2;
                TextViewCompat.setCompoundDrawablesRelative(this.editText, compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.originalEditTextEndDrawable, compoundDrawablesRelative4[3]);
            } else {
                z2 = z;
            }
            this.endDummyDrawable = null;
            return z2;
        }
        return z;
    }

    private boolean shouldUpdateStartDummyDrawable() {
        int i = 2 % 2;
        int i2 = d + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            getStartIconDrawable();
            throw null;
        }
        if (getStartIconDrawable() == null) {
            if (getPrefixText() == null) {
                return false;
            }
            int i3 = d + 37;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            if (getPrefixTextView().getVisibility() != 0) {
                return false;
            }
        }
        if (this.startLayout.getMeasuredWidth() <= 0) {
            return false;
        }
        int i5 = d + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002d  */
    /* JADX WARN: Code duplicated, block: B:12:0x0035  */
    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    private boolean shouldUpdateEndDummyDrawable() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            this.endLayout.isErrorIconVisible();
            throw null;
        }
        if (!this.endLayout.isErrorIconVisible()) {
            if (!this.endLayout.hasEndIcon()) {
                if (this.endLayout.getSuffixText() != null) {
                    if (this.endLayout.getMeasuredWidth() > 0) {
                        int i3 = d + 39;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
                        int i4 = i3 % 2;
                        return true;
                    }
                }
            } else {
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 9;
                d = i5 % 128;
                int i6 = i5 % 2;
                if (!isEndIconVisible()) {
                    if (this.endLayout.getSuffixText() != null) {
                        if (this.endLayout.getMeasuredWidth() > 0) {
                            int i7 = d + 39;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
                            int i8 = i7 % 2;
                            return true;
                        }
                    }
                } else if (this.endLayout.getMeasuredWidth() > 0) {
                    int i9 = d + 39;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
                    int i10 = i9 % 2;
                    return true;
                }
            }
        } else if (this.endLayout.getMeasuredWidth() > 0) {
            int i11 = d + 39;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
            int i12 = i11 % 2;
            return true;
        }
        int i13 = d + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 8 / 0;
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.editText;
        if (editText != null) {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
            d = i6 % 128;
            int i7 = i6 % 2;
            Rect rect = this.tmpRect;
            DescendantOffsetUtils.getDescendantRect(this, editText, rect);
            updateBoxUnderlineBounds(rect);
            if (!this.hintEnabled) {
                return;
            }
            int i8 = d + 7;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
            int i9 = i8 % 2;
            this.collapsingTextHelper.setExpandedTextSize(this.editText.getTextSize());
            int gravity = this.editText.getGravity();
            this.collapsingTextHelper.setCollapsedTextGravity((gravity & (-113)) | 48);
            this.collapsingTextHelper.setExpandedTextGravity(gravity);
            this.collapsingTextHelper.setCollapsedBounds(calculateCollapsedTextBounds(rect));
            this.collapsingTextHelper.setExpandedBounds(calculateExpandedTextBounds(rect));
            this.collapsingTextHelper.recalculate();
            if (cutoutEnabled()) {
                int i10 = d + 57;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
                int i11 = i10 % 2;
                if (this.hintExpanded) {
                    return;
                }
                openCutout();
                int i12 = d + 121;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i12 % 128;
                int i13 = i12 % 2;
            }
        }
    }

    private void updateBoxUnderlineBounds(Rect rect) {
        int i = 2 % 2;
        int i2 = d + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this.boxUnderlineDefault != null) {
            this.boxUnderlineDefault.setBounds(rect.left, rect.bottom - this.boxStrokeWidthDefaultPx, rect.right, rect.bottom);
        }
        if (this.boxUnderlineFocused != null) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 51;
            d = i3 % 128;
            int i4 = i3 % 2;
            this.boxUnderlineFocused.setBounds(rect.left, rect.bottom - this.boxStrokeWidthFocusedPx, rect.right, rect.bottom);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i = 2 % 2;
        int i2 = d + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        super.draw(canvas);
        drawHint(canvas);
        drawBoxUnderline(canvas);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 31;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 73;
        d = i2 % 128;
        int i3 = i2 % 2;
        super.onConfigurationChanged(configuration);
        this.collapsingTextHelper.maybeUpdateFontWeightAdjustment(configuration);
        int i4 = d + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    private void drawHint(Canvas canvas) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        if (!(!this.hintEnabled)) {
            int i5 = i3 + 79;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
            this.collapsingTextHelper.draw(canvas);
        }
        int i7 = d + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
        int i8 = i7 % 2;
    }

    private void drawBoxUnderline(Canvas canvas) {
        MaterialShapeDrawable materialShapeDrawable;
        int i = 2 % 2;
        if (this.boxUnderlineFocused != null && (materialShapeDrawable = this.boxUnderlineDefault) != null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
            d = i2 % 128;
            if (i2 % 2 == 0) {
                materialShapeDrawable.draw(canvas);
                this.editText.isFocused();
                throw null;
            }
            materialShapeDrawable.draw(canvas);
            if (!(!this.editText.isFocused())) {
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 21;
                d = i3 % 128;
                int i4 = i3 % 2;
                Rect bounds = this.boxUnderlineFocused.getBounds();
                Rect bounds2 = this.boxUnderlineDefault.getBounds();
                float expansionFraction = this.collapsingTextHelper.getExpansionFraction();
                int iCenterX = bounds2.centerX();
                bounds.left = AnimationUtils.lerp(iCenterX, bounds2.left, expansionFraction);
                bounds.right = AnimationUtils.lerp(iCenterX, bounds2.right, expansionFraction);
                this.boxUnderlineFocused.draw(canvas);
            }
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 33;
        d = i5 % 128;
        int i6 = i5 % 2;
    }

    private void collapseHint(boolean z) {
        int i = 2 % 2;
        int i2 = d + 79;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            int i5 = i3 + 27;
            d = i5 % 128;
            int i6 = i5 % 2;
            if (valueAnimator.isRunning()) {
                int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 59;
                d = i7 % 128;
                if (i7 % 2 == 0) {
                    this.animator.cancel();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                this.animator.cancel();
            }
        }
        if (z && this.hintAnimationEnabled) {
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
            d = i8 % 128;
            if (i8 % 2 == 0) {
                animateToExpansionFraction(1.0f);
            } else {
                animateToExpansionFraction(1.0f);
            }
        } else {
            this.collapsingTextHelper.setExpansionFraction(1.0f);
        }
        this.hintExpanded = false;
        if (cutoutEnabled()) {
            openCutout();
        }
        updatePlaceholderText();
        this.startLayout.onHintStateChanged(false);
        this.endLayout.onHintStateChanged(false);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    /* JADX WARN: Code duplicated, block: B:13:0x0032 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    private boolean cutoutEnabled() {
        int i = 2 % 2;
        int i2 = d + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 74 / 0;
            if (this.hintEnabled) {
                if (!TextUtils.isEmpty(this.hint)) {
                    int i4 = d + 43;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                    int i5 = i4 % 2;
                    if (this.boxBackground instanceof CutoutDrawable) {
                        return true;
                    }
                }
            }
        } else if (this.hintEnabled) {
            if (!TextUtils.isEmpty(this.hint)) {
                int i6 = d + 43;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
                int i7 = i6 % 2;
                if (this.boxBackground instanceof CutoutDrawable) {
                    return true;
                }
            }
        }
        return false;
    }

    private void openCutout() {
        RectF rectF;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 23;
        d = i2 % 128;
        int i3 = i2 % 2;
        if (cutoutEnabled()) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
            d = i4 % 128;
            if (i4 % 2 == 0) {
                rectF = this.tmpRectF;
                this.collapsingTextHelper.getCollapsedTextActualBounds(rectF, this.editText.getWidth(), this.editText.getGravity());
                if (rectF.width() <= 2.0f) {
                    return;
                }
            } else {
                rectF = this.tmpRectF;
                this.collapsingTextHelper.getCollapsedTextActualBounds(rectF, this.editText.getWidth(), this.editText.getGravity());
                if (rectF.width() <= 0.0f) {
                    return;
                }
            }
            if (rectF.height() > 0.0f) {
                applyCutoutPadding(rectF);
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.boxStrokeWidthPx);
                ((CutoutDrawable) this.boxBackground).setCutout(rectF);
            }
        }
    }

    private void recalculateCutout() {
        int i = 2 % 2;
        int i2 = d + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        if (cutoutEnabled()) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i5 = i4 + 91;
            d = i5 % 128;
            int i6 = i5 % 2;
            if (!this.hintExpanded) {
                int i7 = i4 + 17;
                d = i7 % 128;
                if (i7 % 2 == 0) {
                    closeCutout();
                    openCutout();
                    int i8 = 27 / 0;
                } else {
                    closeCutout();
                    openCutout();
                }
            }
        }
        int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 27;
        d = i9 % 128;
        int i10 = i9 % 2;
    }

    private void closeCutout() {
        int i = 2 % 2;
        int i2 = d + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            cutoutEnabled();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!cutoutEnabled()) {
            return;
        }
        ((CutoutDrawable) this.boxBackground).removeCutout();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 99;
        d = i3 % 128;
        int i4 = i3 % 2;
    }

    private void applyCutoutPadding(RectF rectF) {
        int i = 2 % 2;
        int i2 = d + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        rectF.left -= this.boxLabelCutoutPaddingPx;
        rectF.right += this.boxLabelCutoutPaddingPx;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 57;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 80 / 0;
        }
    }

    boolean cutoutIsOpen() {
        int i = 2 % 2;
        int i2 = d + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        if (!cutoutEnabled()) {
            return false;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
        d = i4 % 128;
        int i5 = i4 % 2;
        return ((CutoutDrawable) this.boxBackground).hasCutout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        boolean state;
        int i = 2 % 2;
        int i2 = d + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        if (this.inDrawableStateChanged) {
            return;
        }
        this.inDrawableStateChanged = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
        if (collapsingTextHelper != null) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 97;
            d = i4 % 128;
            if (i4 % 2 == 0) {
                state = collapsingTextHelper.setState(drawableState);
                int i5 = 18 / 0;
            } else {
                state = collapsingTextHelper.setState(drawableState);
            }
        } else {
            state = false;
        }
        if (this.editText != null) {
            updateLabelState(ViewCompat.isLaidOut(this) && isEnabled());
        }
        updateEditTextBackground();
        updateTextInputBoxState();
        if (state) {
            invalidate();
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 27;
            d = i6 % 128;
            int i7 = i6 % 2;
        }
        this.inDrawableStateChanged = false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0119 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x011b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0129  */
    void updateTextInputBoxState() {
        boolean z;
        TextView textView;
        EditText editText;
        int i = 2 % 2;
        int i2 = d + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        if (this.boxBackground == null || this.boxBackgroundMode == 0) {
            return;
        }
        boolean z2 = false;
        Object obj = null;
        if (isFocused()) {
            z = true;
        } else {
            EditText editText2 = this.editText;
            if (editText2 != null) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
                d = i4 % 128;
                if (i4 % 2 == 0) {
                    editText2.hasFocus();
                    obj.hashCode();
                    throw null;
                }
                if (editText2.hasFocus()) {
                    z = true;
                }
            }
            z = false;
        }
        if (isHovered() || ((editText = this.editText) != null && editText.isHovered())) {
            z2 = true;
        }
        if (!isEnabled()) {
            this.boxStrokeColor = this.disabledColor;
        } else if (shouldShowError()) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
            int i6 = i5 % 128;
            d = i6;
            int i7 = i5 % 2;
            if (this.strokeErrorColor != null) {
                int i8 = i6 + 77;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
                if (i8 % 2 != 0) {
                    updateStrokeErrorColor(z, z2);
                    obj.hashCode();
                    throw null;
                }
                updateStrokeErrorColor(z, z2);
            } else {
                this.boxStrokeColor = getErrorCurrentTextColors();
            }
        } else if (!this.counterOverflowed || (textView = this.counterView) == null) {
            if (z) {
                this.boxStrokeColor = this.focusedStrokeColor;
            } else if (z2) {
                this.boxStrokeColor = this.hoveredStrokeColor;
            } else {
                this.boxStrokeColor = this.defaultStrokeColor;
            }
        } else if (this.strokeErrorColor != null) {
            updateStrokeErrorColor(z, z2);
        } else {
            this.boxStrokeColor = textView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            updateCursorColor();
        }
        this.endLayout.onTextInputBoxStateUpdated();
        refreshStartIconDrawableState();
        if (this.boxBackgroundMode == 2) {
            int i9 = this.boxStrokeWidthPx;
            if (z && isEnabled()) {
                int i10 = d + 9;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
                int i11 = i10 % 2;
                this.boxStrokeWidthPx = this.boxStrokeWidthFocusedPx;
            } else {
                this.boxStrokeWidthPx = this.boxStrokeWidthDefaultPx;
            }
            if (this.boxStrokeWidthPx != i9) {
                recalculateCutout();
            }
        }
        if (this.boxBackgroundMode == 1) {
            if (!isEnabled()) {
                int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 99;
                d = i12 % 128;
                int i13 = i12 % 2;
                this.boxBackgroundColor = this.disabledFilledBackgroundColor;
            } else if (z2) {
                int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i15 = i14 + 35;
                d = i15 % 128;
                int i16 = i15 % 2;
                if (!z) {
                    int i17 = i14 + 15;
                    d = i17 % 128;
                    int i18 = i17 % 2;
                    this.boxBackgroundColor = this.hoveredFilledBackgroundColor;
                } else if (z) {
                    int i19 = d + 33;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i19 % 128;
                    int i20 = i19 % 2;
                    this.boxBackgroundColor = this.focusedFilledBackgroundColor;
                } else {
                    this.boxBackgroundColor = this.defaultFilledBackgroundColor;
                }
            } else if (z) {
                int i110 = d + 33;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i110 % 128;
                int i21 = i110 % 2;
                this.boxBackgroundColor = this.focusedFilledBackgroundColor;
            } else {
                this.boxBackgroundColor = this.defaultFilledBackgroundColor;
            }
        }
        applyBoxAttributes();
    }

    private boolean isOnError() {
        int i = 2 % 2;
        if (!shouldShowError()) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 107;
            d = i2 % 128;
            int i3 = i2 % 2;
            if (this.counterView == null || !this.counterOverflowed) {
                return false;
            }
        }
        int i4 = d + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    private void updateStrokeErrorColor(boolean z, boolean z2) {
        int i = 2 % 2;
        int i2 = d + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        int defaultColor = this.strokeErrorColor.getDefaultColor();
        int colorForState = this.strokeErrorColor.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.strokeErrorColor.getColorForState(new int[]{android.R.attr.state_activated, android.R.attr.state_enabled}, defaultColor);
        if (!z) {
            if (z2) {
                this.boxStrokeColor = colorForState;
                return;
            } else {
                this.boxStrokeColor = defaultColor;
                return;
            }
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 45;
        int i5 = i4 % 128;
        d = i5;
        int i6 = i4 % 2;
        this.boxStrokeColor = colorForState2;
        int i7 = i5 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 33 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005c A[PHI: r2
  0x005c: PHI (r2v10 android.graphics.drawable.Drawable) = (r2v9 android.graphics.drawable.Drawable), (r2v15 android.graphics.drawable.Drawable) binds: [B:15:0x005a, B:12:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0060  */
    private void updateCursorColor() {
        Drawable drawableMutate;
        ColorStateList colorStateList;
        int i = 2 % 2;
        ColorStateList colorStateListOrNull = this.cursorColor;
        if (colorStateListOrNull == null) {
            colorStateListOrNull = MaterialColors.getColorStateListOrNull(getContext(), R.attr.colorControlActivated);
        }
        EditText editText = this.editText;
        if (editText != null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 13;
            d = i2 % 128;
            int i3 = i2 % 2;
            if (editText.getTextCursorDrawable() != null) {
                int i4 = d + 7;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                if (i4 % 2 != 0) {
                    drawableMutate = DrawableCompat.wrap(this.editText.getTextCursorDrawable()).mutate();
                    int i5 = 71 / 0;
                    if (isOnError()) {
                        colorStateList = this.cursorErrorColor;
                        if (colorStateList != null) {
                            colorStateListOrNull = colorStateList;
                        }
                    }
                } else {
                    drawableMutate = DrawableCompat.wrap(this.editText.getTextCursorDrawable()).mutate();
                    if (isOnError()) {
                        colorStateList = this.cursorErrorColor;
                        if (colorStateList != null) {
                            colorStateListOrNull = colorStateList;
                        }
                    }
                }
                DrawableCompat.setTintList(drawableMutate, colorStateListOrNull);
            }
        }
        int i6 = d + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0041  */
    private void expandHint(boolean z) {
        int i = 2 % 2;
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 59;
            d = i2 % 128;
            int i3 = i2 % 2;
            if (valueAnimator.isRunning()) {
                this.animator.cancel();
            }
        }
        if (z) {
            int i4 = d + 7;
            int i5 = i4 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5;
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!this.hintAnimationEnabled) {
                this.collapsingTextHelper.setExpansionFraction(0.0f);
            } else {
                int i6 = i5 + 73;
                d = i6 % 128;
                int i7 = i6 % 2;
                animateToExpansionFraction(0.0f);
            }
        } else {
            this.collapsingTextHelper.setExpansionFraction(0.0f);
        }
        if (cutoutEnabled() && ((CutoutDrawable) this.boxBackground).hasCutout()) {
            int i8 = d + 63;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
            if (i8 % 2 != 0) {
                closeCutout();
                int i9 = 76 / 0;
            } else {
                closeCutout();
            }
        }
        this.hintExpanded = true;
        hidePlaceholderText();
        this.startLayout.onHintStateChanged(true);
        this.endLayout.onHintStateChanged(true);
    }

    void animateToExpansionFraction(float f) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 33;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            this.collapsingTextHelper.getExpansionFraction();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.collapsingTextHelper.getExpansionFraction() == f) {
            return;
        }
        if (this.animator == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.animator = valueAnimator;
            valueAnimator.setInterpolator(MotionUtils.resolveThemeInterpolator(getContext(), R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
            this.animator.setDuration(MotionUtils.resolveThemeDuration(getContext(), R.attr.motionDurationMedium4, LABEL_SCALE_ANIMATION_DURATION));
            this.animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.TextInputLayout.3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    TextInputLayout.this.collapsingTextHelper.setExpansionFraction(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                }
            });
        }
        this.animator.setFloatValues(this.collapsingTextHelper.getExpansionFraction(), f);
        this.animator.start();
        int i3 = d + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
    }

    final boolean isHintExpanded() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 89;
        d = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.hintExpanded;
        int i5 = i2 + 79;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    final boolean isHelperTextDisplayed() {
        int i = 2 % 2;
        int i2 = d + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            this.indicatorViewController.helperTextIsDisplayed();
            throw null;
        }
        boolean zHelperTextIsDisplayed = this.indicatorViewController.helperTextIsDisplayed();
        int i3 = d + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 == 0) {
            return zHelperTextIsDisplayed;
        }
        throw null;
    }

    final int getHintCurrentCollapsedTextColor() {
        int i = 2 % 2;
        int i2 = d + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        int currentCollapsedTextColor = this.collapsingTextHelper.getCurrentCollapsedTextColor();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 29;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 41 / 0;
        }
        return currentCollapsedTextColor;
    }

    final float getHintCollapsedTextHeight() {
        int i = 2 % 2;
        int i2 = d + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
        if (i3 == 0) {
            return collapsingTextHelper.getCollapsedTextHeight();
        }
        collapsingTextHelper.getCollapsedTextHeight();
        throw null;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        TuitionPaymentFragmentbindingInflater1 = new char[]{60104, 60115, 60051, 60049, 60088, 60045, 60112, 60062, 60119, 60055, 60105, 60120, 60046, 60108, 60121, 60117, 60118, 60116, 60123, 60099, 60058, 60079, 60048, 60111, 60063, 60047, 60073, 60040, 60098, 60109, 60113, 60057, 60083, 60072, 60050, 60056, 60041, 60114, 60110, 60052, 60054, 60034, 60090, 60053, 60060, 60107, 60061, 60043, 60106};
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (char) 57190;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r5, byte r6, int r7) {
        /*
            int r5 = r5 * 4
            int r5 = r5 + 4
            int r7 = r7 * 3
            int r0 = 1 - r7
            byte[] r1 = com.google.android.material.textfield.TextInputLayout.$$c
            int r6 = r6 + 113
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L17
            r3 = r6
            r6 = r7
            r4 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L25:
            r3 = r1[r5]
        L27:
            int r5 = r5 + 1
            int r6 = r6 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.$$g(short, byte, int):java.lang.String");
    }
}
