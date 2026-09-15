package com.google.android.material.button;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialButton extends AppCompatButton implements Checkable, Shapeable {
    private static final int[] CHECKABLE_STATE_SET;
    private static final int[] CHECKED_STATE_SET;
    private static final int DEF_STYLE_RES;
    public static final int ICON_GRAVITY_END = 3;
    public static final int ICON_GRAVITY_START = 1;
    public static final int ICON_GRAVITY_TEXT_END = 4;
    public static final int ICON_GRAVITY_TEXT_START = 2;
    public static final int ICON_GRAVITY_TEXT_TOP = 32;
    public static final int ICON_GRAVITY_TOP = 16;
    private static final String LOG_TAG = "MaterialButton";
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int b;
    private String accessibilityClassName;
    private boolean broadcasting;
    private boolean checked;
    private Drawable icon;
    private int iconGravity;
    private int iconLeft;
    private int iconPadding;
    private int iconSize;
    private ColorStateList iconTint;
    private PorterDuff.Mode iconTintMode;
    private int iconTop;
    private final MaterialButtonHelper materialButtonHelper;
    private final LinkedHashSet<OnCheckedChangeListener> onCheckedChangeListeners;
    private OnPressedChangeListener onPressedChangeListenerInternal;
    private static final byte[] $$c = {53, -70, 9, -72};
    private static final int $$f = 33;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {57, -50, -56, -93, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 59, -6, -10, 13, -20, 14, -12, -7, 11, -72, 63, -7, -14, -1, -1, 11, -72, 56, 2, 3, -18, 10, -7, -16, 8, -65, 73, -3, -17, 5, 30, -15, 8, -14, 3, -4, -33, 14, 21, -15, -11, 6, 3, -49, 41, -20, 3, 3, -11, 6, 3, -21, 4, 2, -13, 2, 2, -10, -33, 34, -11, 3, -14, 16, -18, 10, -68};
    private static final int $$h = 203;
    private static final byte[] $$a = {83, ByteCompanionObject.MIN_VALUE, -37, -48, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 70;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f799a = 0;
    private static int g = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;

    /* JADX INFO: loaded from: classes4.dex */
    @Retention(RetentionPolicy.SOURCE)
    public @interface IconGravity {
    }

    public interface OnCheckedChangeListener {
        void onCheckedChanged(MaterialButton materialButton, boolean z);
    }

    interface OnPressedChangeListener {
        void onPressedChanged(MaterialButton materialButton, boolean z);
    }

    private static void c(byte b2, byte b3, byte b4, Object[] objArr) {
        byte[] bArr = $$a;
        int i = b4 + 84;
        int i2 = 55 - (b2 * 52);
        byte[] bArr2 = new byte[b3 + 1];
        int i3 = -1;
        if (bArr == null) {
            i = (i + b3) - 11;
        }
        while (true) {
            i3++;
            bArr2[i3] = (byte) i;
            if (i3 == b3) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i2++;
                i = (i + bArr[i2]) - 11;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(short r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 + 4
            int r6 = r6 * 15
            int r6 = r6 + 84
            byte[] r0 = com.google.android.material.button.MaterialButton.$$g
            int r7 = r7 * 11
            int r1 = 49 - r7
            byte[] r1 = new byte[r1]
            int r7 = 48 - r7
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r7
            r3 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            int r5 = r5 + 1
            r1[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            r4 = r0[r5]
            int r3 = r3 + 1
        L2a:
            int r6 = r6 + r4
            int r6 = r6 + 3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.e(short, int, byte, java.lang.Object[]):void");
    }

    /* JADX INFO: loaded from: classes6.dex */
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<MaterialButton> {
        private int mIconPaddingId;
        private boolean mPropertiesMapped = false;

        @Override // android.view.inspector.InspectionCompanion
        public final void mapProperties(PropertyMapper propertyMapper) {
            this.mIconPaddingId = propertyMapper.mapInt("iconPadding", R.attr.iconPadding);
            this.mPropertiesMapped = true;
        }

        @Override // android.view.inspector.InspectionCompanion
        public final void readProperties(MaterialButton materialButton, PropertyReader propertyReader) {
            if (!this.mPropertiesMapped) {
                throw new android.view.inspector.InspectionCompanion.UninitializedPropertyMapException();
            }
            propertyReader.readInt(this.mIconPaddingId, materialButton.getIconPadding());
        }
    }

    private static void d(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        int i4 = 0;
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i5 = $11 + 59;
            $10 = i5 % 128;
            int i6 = i5 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', i4) + 8329);
                    int pressedStateDuration = 1235 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    int i7 = 35 - (TypedValue.complexToFraction(i4, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i4, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    byte b2 = (byte) i4;
                    byte b3 = b2;
                    String str$$i = $$i(b2, b3, (byte) (b3 + 2));
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, pressedStateDuration, i7, -653973969, false, str$$i, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) i4;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.getOffsetBefore("", i4) + 2764, 14 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1504416861, false, $$i(b4, b5, b5), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43326 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), TextUtils.getCapsMode("", 0, 0) + 253, 22 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.resolveSize(0, 0) + 65200), 2891 - KeyEvent.keyCodeFromString(""), 17 - (ViewConfiguration.getPressedStateDuration() >> 16), 2012627446, false, $$i(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                int i8 = $10 + 73;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                i2 = 2;
                i4 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    static {
        b = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        CHECKABLE_STATE_SET = new int[]{android.R.attr.state_checkable};
        CHECKED_STATE_SET = new int[]{android.R.attr.state_checked};
        DEF_STYLE_RES = R.style.Widget_MaterialComponents_Button;
        int i = TuitionPaymentFragmentbindingInflater1 + 5;
        b = i % 128;
        if (i % 2 == 0) {
            int i2 = 39 / 0;
        }
    }

    public MaterialButton(Context context) {
        this(context, null);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        this.onCheckedChangeListeners = new LinkedHashSet<>();
        boolean z = false;
        this.checked = false;
        this.broadcasting = false;
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.MaterialButton, i, i2, new int[0]);
        this.iconPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.MaterialButton_iconPadding, 0);
        this.iconTintMode = ViewUtils.parseTintMode(typedArrayObtainStyledAttributes.getInt(R.styleable.MaterialButton_iconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.iconTint = MaterialResources.getColorStateList(getContext(), typedArrayObtainStyledAttributes, R.styleable.MaterialButton_iconTint);
        this.icon = MaterialResources.getDrawable(getContext(), typedArrayObtainStyledAttributes, R.styleable.MaterialButton_icon);
        this.iconGravity = typedArrayObtainStyledAttributes.getInteger(R.styleable.MaterialButton_iconGravity, 1);
        this.iconSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.MaterialButton_iconSize, 0);
        MaterialButtonHelper materialButtonHelper = new MaterialButtonHelper(this, ShapeAppearanceModel.builder(context2, attributeSet, i, i2).build());
        this.materialButtonHelper = materialButtonHelper;
        materialButtonHelper.loadFromAttributes(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        setCompoundDrawablePadding(this.iconPadding);
        if (this.icon != null) {
            int i3 = g + 121;
            f799a = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 % 2;
            }
            z = true;
        }
        updateIcon(z);
        int i5 = f799a + 121;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    String getA11yClassName() {
        Class<Button> cls;
        int i = 2 % 2;
        if (!TextUtils.isEmpty(this.accessibilityClassName)) {
            return this.accessibilityClassName;
        }
        if (!isCheckable()) {
            cls = Button.class;
        } else {
            int i2 = f799a;
            int i3 = i2 + 101;
            g = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 19;
            g = i5 % 128;
            int i6 = i5 % 2;
            cls = CompoundButton.class;
        }
        return cls.getName();
    }

    void setA11yClassName(String str) {
        int i = 2 % 2;
        int i2 = f799a + 65;
        g = i2 % 128;
        int i3 = i2 % 2;
        this.accessibilityClassName = str;
        if (i3 == 0) {
            int i4 = 12 / 0;
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i = 2 % 2;
        int i2 = f799a + 37;
        g = i2 % 128;
        int i3 = i2 % 2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(isCheckable());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
        int i4 = g + 117;
        f799a = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int i = 2 % 2;
        int i2 = f799a + 85;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(getA11yClassName());
            accessibilityEvent.setChecked(isChecked());
            throw null;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
        int i3 = g + 7;
        f799a = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        int i = 2 % 2;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.checked = this.checked;
        int i2 = f799a + 17;
        g = i2 % 128;
        int i3 = i2 % 2;
        return savedState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i = 2 % 2;
        int i2 = f799a + 5;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            boolean z = parcelable instanceof SavedState;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setChecked(savedState.checked);
        int i3 = g + 5;
        f799a = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = f799a + 39;
        g = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            if (!(!isUsingOriginalBackground())) {
                this.materialButtonHelper.setSupportBackgroundTintList(colorStateList);
                return;
            }
            super.setSupportBackgroundTintList(colorStateList);
            int i3 = g + 79;
            f799a = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        isUsingOriginalBackground();
        throw null;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    public ColorStateList getSupportBackgroundTintList() {
        int i = 2 % 2;
        int i2 = g + 31;
        f799a = i2 % 128;
        int i3 = i2 % 2;
        if (!isUsingOriginalBackground()) {
            return super.getSupportBackgroundTintList();
        }
        int i4 = g + 77;
        f799a = i4 % 128;
        if (i4 % 2 == 0) {
            return this.materialButtonHelper.getSupportBackgroundTintList();
        }
        this.materialButtonHelper.getSupportBackgroundTintList();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        super.setSupportBackgroundTintMode(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (isUsingOriginalBackground() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (isUsingOriginalBackground() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r3.materialButtonHelper.setSupportBackgroundTintMode(r4);
        r4 = com.google.android.material.button.MaterialButton.f799a + 93;
        com.google.android.material.button.MaterialButton.g = r4 % 128;
        r4 = r4 % 2;
     */
    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.material.button.MaterialButton.g
            int r1 = r1 + 25
            int r2 = r1 % 128
            com.google.android.material.button.MaterialButton.f799a = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L19
            boolean r1 = r3.isUsingOriginalBackground()
            r2 = 97
            int r2 = r2 / 0
            if (r1 == 0) goto L2e
            goto L1f
        L19:
            boolean r1 = r3.isUsingOriginalBackground()
            if (r1 == 0) goto L2e
        L1f:
            com.google.android.material.button.MaterialButtonHelper r1 = r3.materialButtonHelper
            r1.setSupportBackgroundTintMode(r4)
            int r4 = com.google.android.material.button.MaterialButton.f799a
            int r4 = r4 + 93
            int r1 = r4 % 128
            com.google.android.material.button.MaterialButton.g = r1
            int r4 = r4 % r0
            return
        L2e:
            super.setSupportBackgroundTintMode(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.setSupportBackgroundTintMode(android.graphics.PorterDuff$Mode):void");
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        int i = 2 % 2;
        if (isUsingOriginalBackground()) {
            int i2 = g + 75;
            f799a = i2 % 128;
            int i3 = i2 % 2;
            return this.materialButtonHelper.getSupportBackgroundTintMode();
        }
        PorterDuff.Mode supportBackgroundTintMode = super.getSupportBackgroundTintMode();
        int i4 = g + 63;
        f799a = i4 % 128;
        if (i4 % 2 == 0) {
            return supportBackgroundTintMode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = f799a + 33;
        g = i2 % 128;
        int i3 = i2 % 2;
        setSupportBackgroundTintList(colorStateList);
        int i4 = g + 117;
        f799a = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 19 / 0;
        }
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        int i = 2 % 2;
        int i2 = f799a + 37;
        g = i2 % 128;
        int i3 = i2 % 2;
        ColorStateList supportBackgroundTintList = getSupportBackgroundTintList();
        int i4 = f799a + 107;
        g = i4 % 128;
        int i5 = i4 % 2;
        return supportBackgroundTintList;
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        int i = 2 % 2;
        int i2 = g + 31;
        f799a = i2 % 128;
        int i3 = i2 % 2;
        setSupportBackgroundTintMode(mode);
        int i4 = f799a + 9;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        int i = 2 % 2;
        int i2 = f799a + 37;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return getSupportBackgroundTintMode();
        }
        getSupportBackgroundTintMode();
        throw null;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        int i2 = 2 % 2;
        int i3 = f799a + 67;
        g = i3 % 128;
        if (i3 % 2 == 0) {
            isUsingOriginalBackground();
            throw null;
        }
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.setBackgroundColor(i);
            return;
        }
        super.setBackgroundColor(i);
        int i4 = f799a + 33;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 39 / 0;
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        int i = 2 % 2;
        int i2 = f799a + 1;
        g = i2 % 128;
        int i3 = i2 % 2;
        setBackgroundDrawable(drawable);
        int i4 = g + 89;
        f799a = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 99 / 0;
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i) {
        int i2 = 2 % 2;
        int i3 = f799a + 29;
        g = i3 % 128;
        Drawable drawable = null;
        if (i3 % 2 == 0) {
            drawable.hashCode();
            throw null;
        }
        if (i != 0) {
            drawable = AppCompatResources.getDrawable(getContext(), i);
            int i4 = g + 41;
            f799a = i4 % 128;
            int i5 = i4 % 2;
        }
        setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) throws Throwable {
        char c;
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cBlue = (char) Color.blue(0);
            int i2 = 651 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 44;
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            c(bArr[80], (byte) 52, bArr[7], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cBlue, i2, offsetBefore, -459846511, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        d(new char[]{56181, 36568, 35866, 9595}, new char[]{9657, 4916, 16089, 45410}, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), (-1) - TextUtils.lastIndexOf("", '0'), new char[]{7129, 31462, 45250, 39626, 38863, 56828, 52414, 462, 6045, 51462, 58415, 9385, 10512, 64036, 50597, 37892, 52325, 22293, 7428, 57222, 21900, 59366}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        d(new char[]{56181, 36568, 35866, 9595}, new char[]{48936, 23803, 35435, 38433}, (char) (8586 - Color.red(0)), 1801255871 - (KeyEvent.getMaxKeyCode() >> 16), new char[]{'w', 2880, 53363, 39635, 41146, 25100, 30215, 50072, 36544, 7927, 51310, 26017, 37836, 15432, 23974}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cGreen = (char) Color.green(0);
            int iCombineMeasuredStates = 651 - View.combineMeasuredStates(0, 0);
            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 44;
            byte[] bArr2 = $$a;
            byte b2 = bArr2[80];
            byte b3 = bArr2[7];
            Object[] objArr6 = new Object[1];
            c(b2, b3, (byte) (b3 | 14), objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cGreen, iCombineMeasuredStates, scrollDefaultDelay, -873460649, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = g + 63;
            f799a = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 651;
                int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 44;
                byte[] bArr3 = $$a;
                byte b4 = bArr3[7];
                Object[] objArr7 = new Object[1];
                c(b4, (byte) (-bArr3[2]), b4, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(edgeSlop, iMakeMeasureSpec, scrollBarSize, -1595579076, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i5 = ((int[]) objArr8[2])[0];
            int i6 = ((int[]) objArr8[0])[0];
            int iMyPid = Process.myPid();
            int i7 = ~iMyPid;
            int i8 = (~(913710167 | i7)) | (-922648056) | (~(917140977 | i7));
            int i9 = 2133013851 + (((~(iMyPid | (-908203090))) | i8) * 590) + (i8 * (-1180)) + (((~((-917140978) | i7)) | (~(i7 | (-913710168)))) * 590) + 1557823101;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[3])[0] = i11 ^ (i11 << 5);
        } else {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getPressedStateDuration() >> 16), 1611 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 26, 2145681644, false, null, new Class[0]);
                }
                Object[] objArr9 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), 1557823101, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                    int modifierMetaStateMask = 650 - ((byte) KeyEvent.getModifierMetaStateMask());
                    int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 44;
                    byte[] bArr4 = $$a;
                    byte b5 = bArr4[80];
                    byte b6 = bArr4[7];
                    Object[] objArr10 = new Object[1];
                    c(b5, b6, (byte) (b6 | 14), objArr10);
                    String str = (String) objArr10[0];
                    c = '0';
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(absoluteGravity, modifierMetaStateMask, doubleTapTimeout, 2075921419, false, str, new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (AndroidCharacter.getMirror('0') - '0'), 696 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 98 - Drawable.resolveOpacity(0, 0)), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 63406), (ViewConfiguration.getFadingEdgeLength() >> 16) + 793, TextUtils.lastIndexOf("", '0') + 84), Integer.TYPE, Integer.TYPE});
                } else {
                    c = '0';
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr9);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c2 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int jumpTapTimeout = 651 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int capsMode = 44 - TextUtils.getCapsMode("", 0, 0);
                    byte[] bArr5 = $$a;
                    byte b7 = bArr5[7];
                    Object[] objArr11 = new Object[1];
                    c(b7, (byte) (-bArr5[2]), b7, objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, jumpTapTimeout, capsMode, -1595579076, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr12 = new Object[1];
                    d(new char[]{56181, 36568, 35866, 9595}, new char[]{9657, 4916, 16089, 45410}, (char) (ViewConfiguration.getLongPressTimeout() >> 16), ViewConfiguration.getScrollDefaultDelay() >> 16, new char[]{7129, 31462, 45250, 39626, 38863, 56828, 52414, 462, 6045, 51462, 58415, 9385, 10512, 64036, 50597, 37892, 52325, 22293, 7428, 57222, 21900, 59366}, objArr12);
                    Class<?> cls2 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    d(new char[]{56181, 36568, 35866, 9595}, new char[]{48936, 23803, 35435, 38433}, (char) (8587 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), TextUtils.indexOf("", c) + 1801255872, new char[]{'w', 2880, 53363, 39635, 41146, 25100, 30215, 50072, 36544, 7927, 51310, 26017, 37836, 15432, 23974}, objArr13);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char edgeSlop2 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                        int i12 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 650;
                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 44;
                        byte[] bArr6 = $$a;
                        byte b8 = bArr6[80];
                        byte b9 = bArr6[7];
                        Object[] objArr14 = new Object[1];
                        c(b8, b9, (byte) (b9 | 14), objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(edgeSlop2, i12, maxKeyCode, -873460649, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                        int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0) + 651;
                        int trimmedLength = 44 - TextUtils.getTrimmedLength("");
                        byte[] bArr7 = $$a;
                        Object[] objArr15 = new Object[1];
                        c(bArr7[80], (byte) 52, bArr7[7], objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(bitsPerPixel, absoluteGravity2, trimmedLength, -459846511, false, (String) objArr15[0], null);
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
        int i13 = ((int[]) objArr[0])[0];
        int i14 = ((int[]) objArr[2])[0];
        if (i14 == i13) {
            objArr2 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i15 = ((int[]) objArr[3])[0];
            int i16 = ((int[]) objArr[2])[0];
            int i17 = ((int[]) objArr[0])[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i18 = i15 + ((((~(351309197 | iIdentityHashCode)) | (-30698155)) * 262) - 1266532143) + (((~((~iIdentityHashCode) | 351309197)) | (-30698155)) * 262);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr2[3])[0] = i20 ^ (i20 << 5);
            int i21 = f799a + 87;
            g = i21 % 128;
            int i22 = i21 % 2;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[1];
            if (strArr != null) {
                int i23 = f799a + 53;
                g = i23 % 128;
                int i24 = i23 % 2 == 0 ? 1 : 0;
                while (i24 < strArr.length) {
                    int i25 = g + 105;
                    f799a = i25 % 128;
                    if (i25 % 2 != 0) {
                        arrayList.add(strArr[i24]);
                        i24 += 53;
                    } else {
                        arrayList.add(strArr[i24]);
                        i24++;
                    }
                }
            }
            Toast.makeText((Context) null, i14 / (((i14 - 1) * i14) % 2), 0).show();
            objArr2 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i26 = ((int[]) objArr[3])[0];
            int i27 = ((int[]) objArr[2])[0];
            int i28 = ((int[]) objArr[0])[0];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i29 = i26 + (-572945103) + (((~(173249870 | iIdentityHashCode2)) | 8678048) * 336) + (((~(iIdentityHashCode2 | 176680680)) | 5247238) * (-168)) + (((~((~iIdentityHashCode2) | 176680680)) | 173249870) * 168);
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArr2[3])[0] = i31 ^ (i31 << 5);
        }
        if (!isUsingOriginalBackground()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        int i32 = f799a + 95;
        g = i32 % 128;
        int i33 = i32 % 2;
        int i34 = ((int[]) objArr2[3])[0];
        int i35 = i34 * i34;
        int i36 = -(389070729 * i34);
        int i37 = (i35 ^ i36) + ((i35 & i36) << 1);
        int i38 = -(i34 * (-112818253));
        int i39 = (i37 ^ i38) + ((i38 & i37) << 1);
        int i40 = (i39 & (-1285122684)) + ((-1285122684) | i39);
        int i41 = i40 >> 28;
        int i42 = ((i41 & (-31)) + (i41 | (-31))) / 16;
        int i43 = (i42 & 1) + (i42 | 1);
        int i44 = ((i40 | i43) << 1) - (i43 ^ i40);
        int i45 = i40 >> 17;
        int i46 = (((-65535) & i45) + (i45 | (-65535))) / 32768;
        int i47 = -(((i46 & 1) + (i46 | 1)) ^ i44);
        int i48 = (i47 & 8) + (i47 | 8);
        int i49 = i48 >> 29;
        int i50 = (((i49 | (-15)) << 1) - (i49 ^ (-15))) / 8;
        int i51 = 127512 / (((-((((i50 | 1) << 1) - (i50 ^ 1)) + 1)) & i48) * 1449);
        this.materialButtonHelper.setBackgroundOverwritten();
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = f799a + 59;
        g = i6 % 128;
        int i7 = i6 % 2;
        super.onLayout(z, i, i2, i3, i4);
        updateIconPosition(getMeasuredWidth(), getMeasuredHeight());
        int i8 = f799a + 121;
        g = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = f799a + 59;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            super.onTextChanged(charSequence, i, i2, i3);
            updateIconPosition(getMeasuredWidth(), getMeasuredHeight());
        } else {
            super.onTextChanged(charSequence, i, i2, i3);
            updateIconPosition(getMeasuredWidth(), getMeasuredHeight());
            throw null;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        int i = 2 % 2;
        super.onAttachedToWindow();
        if (!(!isUsingOriginalBackground())) {
            int i2 = f799a + 61;
            g = i2 % 128;
            if (i2 % 2 == 0) {
                MaterialShapeUtils.setParentAbsoluteElevation(this, this.materialButtonHelper.getMaterialShapeDrawable());
                throw null;
            }
            MaterialShapeUtils.setParentAbsoluteElevation(this, this.materialButtonHelper.getMaterialShapeDrawable());
            int i3 = f799a + 61;
            g = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        int i = 2 % 2;
        int i2 = f799a + 49;
        g = i2 % 128;
        int i3 = i2 % 2;
        super.setElevation(f);
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.getMaterialShapeDrawable().setElevation(f);
        }
        int i4 = g + 93;
        f799a = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 99 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0035  */
    @Override // android.view.View
    public void refreshDrawableState() {
        int i = 2 % 2;
        super.refreshDrawableState();
        if (this.icon != null) {
            int i2 = f799a + 23;
            g = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 38 / 0;
                if (this.icon.setState(getDrawableState())) {
                    invalidate();
                    int i4 = f799a + 17;
                    g = i4 % 128;
                    int i5 = i4 % 2;
                }
            } else {
                if (!(!this.icon.setState(getDrawableState()))) {
                    invalidate();
                    int i6 = f799a + 17;
                    g = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
        }
        int i8 = f799a + 21;
        g = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        int i2 = 2 % 2;
        int i3 = g + 123;
        f799a = i3 % 128;
        int i4 = i3 % 2;
        super.setTextAlignment(i);
        updateIconPosition(getMeasuredWidth(), getMeasuredHeight());
        int i5 = g + 45;
        f799a = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity;
        int i = 2 % 2;
        int i2 = f799a + 99;
        g = i2 % 128;
        if (i2 % 2 != 0 ? (gravity = getGravity() & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK) != 1 : (gravity = getGravity() & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK) != 1) {
            if (gravity == 5 || gravity == 8388613) {
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        int i3 = f799a + 67;
        g = i3 % 128;
        int i4 = i3 % 2;
        return alignment;
    }

    private Layout.Alignment getActualTextAlignment() {
        int i = 2 % 2;
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment != 6) {
            int i2 = g;
            int i3 = i2 + 85;
            f799a = i3 % 128;
            if (i3 % 2 == 0 ? textAlignment != 3 : textAlignment != 5) {
                int i4 = i2 + 87;
                f799a = i4 % 128;
                if (i4 % 2 == 0 ? textAlignment == 4 : textAlignment == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            }
        }
        return Layout.Alignment.ALIGN_OPPOSITE;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ab, code lost:
    
        if (r10 != android.text.Layout.Alignment.ALIGN_OPPOSITE) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void updateIconPosition(int r9, int r10) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.updateIconPosition(int, int):void");
    }

    private int getTextLayoutWidth() {
        int i = 2 % 2;
        int i2 = f799a + 99;
        g = i2 % 128;
        int i3 = i2 % 2;
        int lineCount = getLineCount();
        int i4 = g + 47;
        f799a = i4 % 128;
        int i5 = i4 % 2;
        float fMax = 0.0f;
        for (int i6 = 0; i6 < lineCount; i6++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i6));
        }
        return (int) Math.ceil(fMax);
    }

    private int getTextHeight() {
        int i = 2 % 2;
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            int i2 = g + 61;
            f799a = i2 % 128;
            if (i2 % 2 != 0) {
                getTransformationMethod().getTransformation(string, this).toString();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        int iMin = Math.min(rect.height(), getLayout().getHeight());
        int i3 = f799a + 75;
        g = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 53 / 0;
        }
        return iMin;
    }

    private boolean isLayoutRTL() {
        int i = 2 % 2;
        if (ViewCompat.getLayoutDirection(this) == 1) {
            int i2 = g + 97;
            f799a = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = g + 73;
        f799a = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        throw null;
    }

    void setInternalBackground(Drawable drawable) {
        int i = 2 % 2;
        int i2 = f799a + 35;
        g = i2 % 128;
        int i3 = i2 % 2;
        super.setBackgroundDrawable(drawable);
        int i4 = g + 77;
        f799a = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setIconPadding(int i) {
        int i2 = 2 % 2;
        int i3 = g + 111;
        int i4 = i3 % 128;
        f799a = i4;
        int i5 = i3 % 2;
        if (this.iconPadding != i) {
            int i6 = i4 + 91;
            g = i6 % 128;
            int i7 = i6 % 2;
            this.iconPadding = i;
            setCompoundDrawablePadding(i);
        }
        int i8 = f799a + 19;
        g = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getIconPadding() {
        int i = 2 % 2;
        int i2 = g + 5;
        int i3 = i2 % 128;
        f799a = i3;
        int i4 = i2 % 2;
        int i5 = this.iconPadding;
        int i6 = i3 + 47;
        g = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        r1 = r1 + 93;
        com.google.android.material.button.MaterialButton.f799a = r1 % 128;
        r1 = r1 % 2;
        r4.iconSize = r5;
        updateIcon(true);
        r5 = com.google.android.material.button.MaterialButton.g + 125;
        com.google.android.material.button.MaterialButton.f799a = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        throw new java.lang.IllegalArgumentException("iconSize cannot be less than 0");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r5 >= 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r5 >= 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r4.iconSize == r5) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setIconSize(int r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.material.button.MaterialButton.g
            int r2 = r1 + 121
            int r3 = r2 % 128
            com.google.android.material.button.MaterialButton.f799a = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L15
            r2 = 79
            int r2 = r2 / 0
            if (r5 < 0) goto L32
            goto L17
        L15:
            if (r5 < 0) goto L32
        L17:
            int r2 = r4.iconSize
            if (r2 == r5) goto L31
            int r1 = r1 + 93
            int r2 = r1 % 128
            com.google.android.material.button.MaterialButton.f799a = r2
            int r1 = r1 % r0
            r4.iconSize = r5
            r5 = 1
            r4.updateIcon(r5)
            int r5 = com.google.android.material.button.MaterialButton.g
            int r5 = r5 + 125
            int r1 = r5 % 128
            com.google.android.material.button.MaterialButton.f799a = r1
            int r5 = r5 % r0
        L31:
            return
        L32:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "iconSize cannot be less than 0"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.setIconSize(int):void");
    }

    public int getIconSize() {
        int i = 2 % 2;
        int i2 = f799a + 117;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return this.iconSize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setIcon(Drawable drawable) {
        int i = 2 % 2;
        int i2 = g + 23;
        f799a = i2 % 128;
        int i3 = i2 % 2;
        if (this.icon != drawable) {
            this.icon = drawable;
            updateIcon(true);
            updateIconPosition(getMeasuredWidth(), getMeasuredHeight());
        }
        int i4 = g + 77;
        f799a = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    public void setIconResource(int i) {
        Drawable drawable;
        int i2 = 2 % 2;
        int i3 = g;
        int i4 = i3 + 63;
        f799a = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 1 / 0;
            if (i != 0) {
                drawable = AppCompatResources.getDrawable(getContext(), i);
            } else {
                int i6 = i3 + 15;
                f799a = i6 % 128;
                int i7 = i6 % 2;
                drawable = null;
            }
        } else if (i != 0) {
            drawable = AppCompatResources.getDrawable(getContext(), i);
        } else {
            int i8 = i3 + 15;
            f799a = i8 % 128;
            int i9 = i8 % 2;
            drawable = null;
        }
        setIcon(drawable);
    }

    public Drawable getIcon() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 105;
        f799a = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Drawable drawable = this.icon;
        int i4 = i2 + 49;
        f799a = i4 % 128;
        int i5 = i4 % 2;
        return drawable;
    }

    public void setIconTint(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = g + 57;
        int i3 = i2 % 128;
        f799a = i3;
        int i4 = i2 % 2;
        if (this.iconTint != colorStateList) {
            int i5 = i3 + 1;
            g = i5 % 128;
            int i6 = i5 % 2;
            this.iconTint = colorStateList;
            updateIcon(false);
        }
        int i7 = g + 71;
        f799a = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 4 / 0;
        }
    }

    public void setIconTintResource(int i) {
        int i2 = 2 % 2;
        int i3 = f799a + 55;
        g = i3 % 128;
        int i4 = i3 % 2;
        setIconTint(AppCompatResources.getColorStateList(getContext(), i));
        int i5 = g + 45;
        f799a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 51 / 0;
        }
    }

    public ColorStateList getIconTint() {
        int i = 2 % 2;
        int i2 = f799a + 75;
        int i3 = i2 % 128;
        g = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        ColorStateList colorStateList = this.iconTint;
        int i4 = i3 + 49;
        f799a = i4 % 128;
        if (i4 % 2 == 0) {
            return colorStateList;
        }
        obj.hashCode();
        throw null;
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 1;
        f799a = i3 % 128;
        int i4 = i3 % 2;
        if (this.iconTintMode != mode) {
            int i5 = i2 + 7;
            f799a = i5 % 128;
            int i6 = i5 % 2;
            this.iconTintMode = mode;
            updateIcon(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0283  */
    /* JADX WARN: Code duplicated, block: B:28:0x0285  */
    public PorterDuff.Mode getIconTintMode() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = f799a + 9;
        g = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
            int mirror = 924 - AndroidCharacter.getMirror('0');
            int absoluteGravity = 10 - Gravity.getAbsoluteGravity(0, 0);
            byte[] bArr = $$a;
            byte b2 = bArr[80];
            byte b3 = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b2, b3, (byte) (b3 | 14), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, mirror, absoluteGravity, 252381699, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        d(new char[]{56181, 36568, 35866, 9595}, new char[]{9657, 4916, 16089, 45410}, (char) TextUtils.getTrimmedLength(""), 1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), new char[]{7129, 31462, 45250, 39626, 38863, 56828, 52414, 462, 6045, 51462, 58415, 9385, 10512, 64036, 50597, 37892, 52325, 22293, 7428, 57222, 21900, 59366}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        d(new char[]{56181, 36568, 35866, 9595}, new char[]{48936, 23803, 35435, 38433}, (char) (8586 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), Color.red(0) + 1801255871, new char[]{'w', 2880, 53363, 39635, 41146, 25100, 30215, 50072, 36544, 7927, 51310, 26017, 37836, 15432, 23974}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
            int i4 = 877 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 11;
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            c(bArr2[80], (byte) 52, bArr2[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(windowTouchSlop, i4, iLastIndexOf, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = g + 37;
            f799a = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int iRgb = Color.rgb(0, 0, 0) + 16778092;
                int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 10;
                byte[] bArr3 = $$a;
                byte b4 = bArr3[7];
                Object[] objArr6 = new Object[1];
                c(b4, b4, bArr3[54], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, iRgb, pressedStateDuration, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = (-1165199686) + (((~(465503320 | iIdentityHashCode)) | 505813549) * (-366)) + (((~(iIdentityHashCode | 532618877)) | 438697992) * 366) + 145707770;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            d(new char[]{56181, 36568, 35866, 9595}, new char[]{10306, 62045, 25663, 23660}, (char) (Process.getGidForName("") + 27749), Color.alpha(0), new char[]{34208, 3042, 58581, 61976, 37540, 456, 12252, 1745, 8010, 38392, 19936, 23231, 29611, 28594, 53953, 60266, 34819, 43665, 8277, 9025, 30838, 19356, 28315, 45847, 53757, 59566}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            d(new char[]{56181, 36568, 35866, 9595}, new char[]{51513, 43647, 38934, 27223}, (char) (Color.alpha(0) + 22424), Color.green(0), new char[]{33996, 26215, 15828, 5987, 63310, 55034, 528, 1075, 60419, 17975, 48638, 5046, 53529, 28333, 23157, 6762, 7135, 10214}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i10 = f799a + 69;
                int i11 = i10 % 128;
                g = i11;
                int i12 = i10 % 2;
                if (applicationContext instanceof ContextWrapper) {
                    int i13 = i11 + 117;
                    f799a = i13 % 128;
                    if (i13 % 2 != 0) {
                        int i14 = 22 / 0;
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
            d(new char[]{56181, 36568, 35866, 9595}, new char[]{47102, 44112, 45956, 24921}, (char) (Color.rgb(0, 0, 0) + 16800179), '0' - AndroidCharacter.getMirror('0'), new char[]{8983, 1044, 7116, 47967, 57775, 26801, 35798, 8467, 43494, 42112, 56275, 13568, 39140, 20741, 58181, 15137}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            d(new char[]{56181, 36568, 35866, 9595}, new char[]{33070, 50262, 19161, 51111}, (char) (ImageFormat.getBitsPerPixel(0) + 42827), Process.myPid() >> 22, new char[]{50337, 47095, 49462, 26088, 52689, 55910, 4413, 30941, 52480, 11189, 2228, 17211, 37199, 50972, 55229, 22572}, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i15 = g + 59;
            f799a = i15 % 128;
            int i16 = i15 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 145707770};
                byte[] bArr4 = $$g;
                byte b5 = bArr4[35];
                byte b6 = (byte) (-b5);
                Object[] objArr13 = new Object[1];
                e(b5, b6, (byte) (b6 - 1), objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b7 = (byte) (bArr4[14] - 1);
                byte b8 = bArr4[35];
                Object[] objArr14 = new Object[1];
                e(b7, (byte) (b8 + 1), (byte) (-b8), objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
                        int tapTimeout = 876 - (ViewConfiguration.getTapTimeout() >> 16);
                        int iMyTid = (Process.myTid() >> 22) + 10;
                        byte[] bArr5 = $$a;
                        byte b9 = bArr5[7];
                        Object[] objArr15 = new Object[1];
                        c(b9, b9, bArr5[54], objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cAxisFromString, tapTimeout, iMyTid, 256017550, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        d(new char[]{56181, 36568, 35866, 9595}, new char[]{9657, 4916, 16089, 45410}, (char) TextUtils.indexOf("", "", 0), ViewConfiguration.getKeyRepeatTimeout() >> 16, new char[]{7129, 31462, 45250, 39626, 38863, 56828, 52414, 462, 6045, 51462, 58415, 9385, 10512, 64036, 50597, 37892, 52325, 22293, 7428, 57222, 21900, 59366}, objArr16);
                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        d(new char[]{56181, 36568, 35866, 9595}, new char[]{48936, 23803, 35435, 38433}, (char) (8586 - TextUtils.indexOf("", "")), TextUtils.indexOf("", "", 0) + 1801255871, new char[]{'w', 2880, 53363, 39635, 41146, 25100, 30215, 50072, 36544, 7927, 51310, 26017, 37836, 15432, 23974}, objArr17);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            int windowTouchSlop2 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 876;
                            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 10;
                            byte[] bArr6 = $$a;
                            Object[] objArr18 = new Object[1];
                            c(bArr6[80], (byte) 52, bArr6[7], objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(minimumFlingVelocity, windowTouchSlop2, keyRepeatDelay, 2009631821, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c3 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                            int edgeSlop = 876 - (ViewConfiguration.getEdgeSlop() >> 16);
                            int packedPositionChild = 9 - ExpandableListView.getPackedPositionChild(0L);
                            byte[] bArr7 = $$a;
                            byte b10 = bArr7[80];
                            byte b11 = bArr7[7];
                            Object[] objArr19 = new Object[1];
                            c(b10, b11, (byte) (b11 | 14), objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, edgeSlop, packedPositionChild, 252381699, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i17 = ((int[]) objArr[2])[0];
        int i18 = ((int[]) objArr[0])[0];
        if (i18 == i17) {
            int i19 = f799a + 123;
            g = i19 % 128;
            int i20 = i19 % 2;
            int i21 = ((int[]) objArr[1])[0];
            Object[] objArr20 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i22 = ~(420212344 | iElapsedRealtime);
            int i23 = ~iElapsedRealtime;
            int i24 = i22 | (~(460522573 | i23));
            int i25 = ~((-420212345) | i23);
            int i26 = i21 + 847625916 + ((i24 | i25) * (-516)) + (((~(iElapsedRealtime | (-40894470))) | (~((-419628105) | i23))) * 516) + ((419628104 | i25) * 516);
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr20[1])[0] = i28 ^ (i28 << 5);
        } else {
            int[] iArr = new int[i18];
            int i29 = i18 - 1;
            iArr[i29] = 1;
            Toast.makeText((Context) null, iArr[((i18 * i29) % 2) - 1], 1).show();
            int i30 = ((int[]) objArr[1])[0];
            Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i31 = i30 + (-1703544620) + (((~(988966549 | startUptimeMillis)) | 84508778) * 576) + (((~((~startUptimeMillis) | 1073475327)) | 944768000) * 576) + 1432415872;
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArr21[1])[0] = i33 ^ (i33 << 5);
        }
        return this.iconTintMode;
    }

    /* JADX INFO: loaded from: classes4.dex */
    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.button.MaterialButton.SavedState.1
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
        boolean checked;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            readFromParcel(parcel);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.checked ? 1 : 0);
        }

        private void readFromParcel(Parcel parcel) {
            this.checked = parcel.readInt() == 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ac  */
    private void updateIcon(boolean z) {
        int i = 2 % 2;
        int i2 = f799a + 53;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        Drawable drawable = this.icon;
        if (drawable != null) {
            Drawable drawableMutate = DrawableCompat.wrap(drawable).mutate();
            this.icon = drawableMutate;
            DrawableCompat.setTintList(drawableMutate, this.iconTint);
            PorterDuff.Mode mode = this.iconTintMode;
            if (mode != null) {
                int i3 = f799a + 51;
                g = i3 % 128;
                int i4 = i3 % 2;
                DrawableCompat.setTintMode(this.icon, mode);
            }
            int intrinsicWidth = this.iconSize;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.icon.getIntrinsicWidth();
            }
            int intrinsicHeight = this.iconSize;
            if (intrinsicHeight == 0) {
                int i5 = f799a + 11;
                g = i5 % 128;
                if (i5 % 2 == 0) {
                    this.icon.getIntrinsicHeight();
                    throw null;
                }
                intrinsicHeight = this.icon.getIntrinsicHeight();
            }
            Drawable drawable2 = this.icon;
            int i6 = this.iconLeft;
            int i7 = this.iconTop;
            drawable2.setBounds(i6, i7, intrinsicWidth + i6, intrinsicHeight + i7);
            this.icon.setVisible(true, z);
        }
        if (z) {
            int i8 = f799a + 13;
            g = i8 % 128;
            int i9 = i8 % 2;
            resetIconDrawable();
            return;
        }
        Drawable[] compoundDrawablesRelative = TextViewCompat.getCompoundDrawablesRelative(this);
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if (isIconStart() && drawable3 != this.icon) {
            resetIconDrawable();
        } else if (isIconEnd()) {
            int i10 = g + 81;
            f799a = i10 % 128;
            int i11 = i10 % 2;
            if (drawable5 != this.icon) {
                resetIconDrawable();
            } else if (isIconTop() && drawable4 != this.icon) {
                resetIconDrawable();
            }
        } else if (isIconTop()) {
            resetIconDrawable();
        }
        int i12 = f799a + 111;
        g = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (isIconEnd() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        androidx.core.widget.TextViewCompat.setCompoundDrawablesRelative(r4, null, null, r4.icon, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        if ((!isIconTop()) == true) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        androidx.core.widget.TextViewCompat.setCompoundDrawablesRelative(r4, null, r4.icon, null, null);
        r1 = com.google.android.material.button.MaterialButton.g + 61;
        com.google.android.material.button.MaterialButton.f799a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (isIconStart() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (isIconStart() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        androidx.core.widget.TextViewCompat.setCompoundDrawablesRelative(r4, r4.icon, null, null, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void resetIconDrawable() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.material.button.MaterialButton.g
            int r1 = r1 + 61
            int r2 = r1 % 128
            com.google.android.material.button.MaterialButton.f799a = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L1a
            boolean r1 = r4.isIconStart()
            r3 = 82
            int r3 = r3 / 0
            if (r1 == 0) goto L26
            goto L20
        L1a:
            boolean r1 = r4.isIconStart()
            if (r1 == 0) goto L26
        L20:
            android.graphics.drawable.Drawable r0 = r4.icon
            androidx.core.widget.TextViewCompat.setCompoundDrawablesRelative(r4, r0, r2, r2, r2)
            return
        L26:
            boolean r1 = r4.isIconEnd()
            if (r1 == 0) goto L32
            android.graphics.drawable.Drawable r0 = r4.icon
            androidx.core.widget.TextViewCompat.setCompoundDrawablesRelative(r4, r2, r2, r0, r2)
            return
        L32:
            boolean r1 = r4.isIconTop()
            r3 = 1
            r1 = r1 ^ r3
            if (r1 == r3) goto L48
            android.graphics.drawable.Drawable r1 = r4.icon
            androidx.core.widget.TextViewCompat.setCompoundDrawablesRelative(r4, r2, r1, r2, r2)
            int r1 = com.google.android.material.button.MaterialButton.g
            int r1 = r1 + 61
            int r2 = r1 % 128
            com.google.android.material.button.MaterialButton.f799a = r2
            int r1 = r1 % r0
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.resetIconDrawable():void");
    }

    private boolean isIconStart() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 11;
        f799a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.iconGravity;
        if (i5 != 1) {
            int i6 = i2 + 3;
            f799a = i6 % 128;
            int i7 = i6 % 2;
            if (i5 != 2) {
                int i8 = i2 + 43;
                f799a = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
        }
        return true;
    }

    private boolean isIconEnd() {
        int i;
        int i2 = 2 % 2;
        int i3 = f799a + 77;
        int i4 = i3 % 128;
        g = i4;
        if (i3 % 2 == 0) {
            i = this.iconGravity;
            if (i == 4) {
                return true;
            }
        } else {
            i = this.iconGravity;
            if (i == 3) {
                return true;
            }
        }
        if (i == 4) {
            return true;
        }
        int i5 = i4 + 121;
        f799a = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    private boolean isIconTop() {
        int i;
        int i2 = 2 % 2;
        int i3 = g;
        int i4 = i3 + 113;
        f799a = i4 % 128;
        if (i4 % 2 != 0) {
            i = this.iconGravity;
            if (i == 31) {
                return true;
            }
        } else {
            i = this.iconGravity;
            if (i == 16) {
                return true;
            }
        }
        if (i == 32) {
            return true;
        }
        int i5 = i3 + 63;
        int i6 = i5 % 128;
        f799a = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 97;
        g = i8 % 128;
        if (i8 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        int i = 2 % 2;
        if (isUsingOriginalBackground()) {
            int i2 = g + 61;
            f799a = i2 % 128;
            if (i2 % 2 != 0) {
                this.materialButtonHelper.setRippleColor(colorStateList);
                int i3 = 17 / 0;
            } else {
                this.materialButtonHelper.setRippleColor(colorStateList);
            }
            int i4 = f799a + 37;
            g = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 % 2;
            }
        }
    }

    public void setRippleColorResource(int i) {
        int i2 = 2 % 2;
        int i3 = f799a + 53;
        g = i3 % 128;
        if (i3 % 2 == 0) {
            isUsingOriginalBackground();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (isUsingOriginalBackground()) {
            setRippleColor(AppCompatResources.getColorStateList(getContext(), i));
        }
        int i4 = g + 105;
        f799a = i4 % 128;
        int i5 = i4 % 2;
    }

    public ColorStateList getRippleColor() {
        int i = 2 % 2;
        int i2 = g + 109;
        f799a = i2 % 128;
        int i3 = i2 % 2;
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.getRippleColor();
        }
        int i4 = g + 37;
        f799a = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = g + 121;
        f799a = i2 % 128;
        if (i2 % 2 != 0) {
            isUsingOriginalBackground();
            throw null;
        }
        if (isUsingOriginalBackground()) {
            int i3 = f799a + 75;
            g = i3 % 128;
            int i4 = i3 % 2;
            this.materialButtonHelper.setStrokeColor(colorStateList);
            int i5 = g + 45;
            f799a = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public void setStrokeColorResource(int i) {
        int i2 = 2 % 2;
        int i3 = g + 95;
        f799a = i3 % 128;
        int i4 = i3 % 2;
        if (isUsingOriginalBackground()) {
            int i5 = f799a + 45;
            g = i5 % 128;
            if (i5 % 2 == 0) {
                setStrokeColor(AppCompatResources.getColorStateList(getContext(), i));
                int i6 = 54 / 0;
            } else {
                setStrokeColor(AppCompatResources.getColorStateList(getContext(), i));
            }
            int i7 = g + 29;
            f799a = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    public ColorStateList getStrokeColor() {
        int i = 2 % 2;
        int i2 = g + 109;
        f799a = i2 % 128;
        int i3 = i2 % 2;
        if (!isUsingOriginalBackground()) {
            return null;
        }
        int i4 = g + 15;
        f799a = i4 % 128;
        int i5 = i4 % 2;
        ColorStateList strokeColor = this.materialButtonHelper.getStrokeColor();
        if (i5 != 0) {
            int i6 = 86 / 0;
        }
        return strokeColor;
    }

    public void setStrokeWidth(int i) {
        int i2 = 2 % 2;
        int i3 = f799a + 65;
        g = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            isUsingOriginalBackground();
            obj.hashCode();
            throw null;
        }
        if (isUsingOriginalBackground()) {
            int i4 = f799a + 47;
            g = i4 % 128;
            if (i4 % 2 == 0) {
                this.materialButtonHelper.setStrokeWidth(i);
                throw null;
            }
            this.materialButtonHelper.setStrokeWidth(i);
        }
        int i5 = f799a + 83;
        g = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setStrokeWidthResource(int i) {
        int i2 = 2 % 2;
        int i3 = f799a + 17;
        g = i3 % 128;
        int i4 = i3 % 2;
        if (isUsingOriginalBackground()) {
            int i5 = f799a + 93;
            g = i5 % 128;
            int i6 = i5 % 2;
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    public int getStrokeWidth() {
        int i = 2 % 2;
        int i2 = f799a + 19;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            isUsingOriginalBackground();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!isUsingOriginalBackground()) {
            return 0;
        }
        int strokeWidth = this.materialButtonHelper.getStrokeWidth();
        int i3 = f799a + 51;
        g = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 2 / 0;
        }
        return strokeWidth;
    }

    public void setCornerRadius(int i) {
        int i2 = 2 % 2;
        int i3 = f799a + 61;
        g = i3 % 128;
        int i4 = i3 % 2;
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.setCornerRadius(i);
            int i5 = f799a + 111;
            g = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public void setCornerRadiusResource(int i) {
        int i2 = 2 % 2;
        int i3 = g + 27;
        f799a = i3 % 128;
        if (i3 % 2 != 0) {
            isUsingOriginalBackground();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!(!isUsingOriginalBackground())) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
            int i4 = g + 1;
            f799a = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public int getCornerRadius() {
        int i = 2 % 2;
        if (!isUsingOriginalBackground()) {
            int i2 = f799a + 25;
            g = i2 % 128;
            if (i2 % 2 != 0) {
                return 0;
            }
            throw null;
        }
        int cornerRadius = this.materialButtonHelper.getCornerRadius();
        int i3 = f799a + 91;
        g = i3 % 128;
        if (i3 % 2 != 0) {
            return cornerRadius;
        }
        throw null;
    }

    public int getIconGravity() {
        int i = 2 % 2;
        int i2 = g + 11;
        int i3 = i2 % 128;
        f799a = i3;
        int i4 = i2 % 2;
        int i5 = this.iconGravity;
        int i6 = i3 + 89;
        g = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public void setIconGravity(int i) {
        int i2 = 2 % 2;
        if (this.iconGravity != i) {
            int i3 = g + 39;
            f799a = i3 % 128;
            if (i3 % 2 != 0) {
                this.iconGravity = i;
                updateIconPosition(getMeasuredWidth(), getMeasuredHeight());
                throw null;
            }
            this.iconGravity = i;
            updateIconPosition(getMeasuredWidth(), getMeasuredHeight());
            int i4 = g + 81;
            f799a = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public void setInsetBottom(int i) {
        int i2 = 2 % 2;
        int i3 = g + 61;
        f799a = i3 % 128;
        int i4 = i3 % 2;
        this.materialButtonHelper.setInsetBottom(i);
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getInsetBottom() {
        int i = 2 % 2;
        int i2 = f799a + 125;
        g = i2 % 128;
        int i3 = i2 % 2;
        int insetBottom = this.materialButtonHelper.getInsetBottom();
        int i4 = g + 21;
        f799a = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 27 / 0;
        }
        return insetBottom;
    }

    public void setInsetTop(int i) {
        int i2 = 2 % 2;
        int i3 = g + 25;
        f799a = i3 % 128;
        int i4 = i3 % 2;
        this.materialButtonHelper.setInsetTop(i);
        int i5 = f799a + 121;
        g = i5 % 128;
        int i6 = i5 % 2;
    }

    public int getInsetTop() {
        int i = 2 % 2;
        int i2 = g + 87;
        f799a = i2 % 128;
        int i3 = i2 % 2;
        int insetTop = this.materialButtonHelper.getInsetTop();
        int i4 = f799a + 111;
        g = i4 % 128;
        int i5 = i4 % 2;
        return insetTop;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    /* JADX WARN: Code duplicated, block: B:12:0x0037  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026 A[PHI: r4
  0x0026: PHI (r4v3 int[]) = (r4v2 int[]), (r4v7 int[]) binds: [B:8:0x0024, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState;
        int i2;
        int i3 = 2 % 2;
        int i4 = f799a + 55;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            iArrOnCreateDrawableState = super.onCreateDrawableState(i % 3);
            if (isCheckable()) {
                i2 = f799a + 99;
                g = i2 % 128;
                if (i2 % 2 != 0) {
                    mergeDrawableStates(iArrOnCreateDrawableState, CHECKABLE_STATE_SET);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                mergeDrawableStates(iArrOnCreateDrawableState, CHECKABLE_STATE_SET);
            }
        } else {
            iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
            if (isCheckable()) {
                i2 = f799a + 99;
                g = i2 % 128;
                if (i2 % 2 != 0) {
                    mergeDrawableStates(iArrOnCreateDrawableState, CHECKABLE_STATE_SET);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                mergeDrawableStates(iArrOnCreateDrawableState, CHECKABLE_STATE_SET);
            }
        }
        if (isChecked()) {
            mergeDrawableStates(iArrOnCreateDrawableState, CHECKED_STATE_SET);
        }
        return iArrOnCreateDrawableState;
    }

    public void addOnCheckedChangeListener(OnCheckedChangeListener onCheckedChangeListener) {
        int i = 2 % 2;
        int i2 = f799a + 3;
        g = i2 % 128;
        int i3 = i2 % 2;
        this.onCheckedChangeListeners.add(onCheckedChangeListener);
        if (i3 == 0) {
            int i4 = 87 / 0;
        }
    }

    public void removeOnCheckedChangeListener(OnCheckedChangeListener onCheckedChangeListener) {
        int i = 2 % 2;
        int i2 = f799a + 49;
        g = i2 % 128;
        int i3 = i2 % 2;
        this.onCheckedChangeListeners.remove(onCheckedChangeListener);
        int i4 = f799a + 17;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void clearOnCheckedChangeListeners() {
        int i = 2 % 2;
        int i2 = f799a + 53;
        g = i2 % 128;
        int i3 = i2 % 2;
        this.onCheckedChangeListeners.clear();
        int i4 = f799a + 21;
        g = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        Iterator<OnCheckedChangeListener> it;
        int i = 2 % 2;
        int i2 = g + 59;
        f799a = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 94 / 0;
            if (!isCheckable()) {
                return;
            }
        } else if (!isCheckable()) {
            return;
        }
        int i4 = g + 11;
        f799a = i4 % 128;
        int i5 = i4 % 2;
        if (!isEnabled() || this.checked == z) {
            return;
        }
        int i6 = g + 117;
        f799a = i6 % 128;
        if (i6 % 2 != 0) {
            this.checked = z;
            refreshDrawableState();
            boolean z2 = getParent() instanceof MaterialButtonToggleGroup;
            throw null;
        }
        this.checked = z;
        refreshDrawableState();
        if (!(!(getParent() instanceof MaterialButtonToggleGroup))) {
            ((MaterialButtonToggleGroup) getParent()).onButtonCheckedStateChanged(this, this.checked);
        }
        if (this.broadcasting) {
            return;
        }
        int i7 = g + 1;
        f799a = i7 % 128;
        if (i7 % 2 != 0) {
            this.broadcasting = false;
            it = this.onCheckedChangeListeners.iterator();
        } else {
            this.broadcasting = true;
            it = this.onCheckedChangeListeners.iterator();
        }
        while (it.hasNext()) {
            it.next().onCheckedChanged(this, this.checked);
            int i8 = g + 41;
            f799a = i8 % 128;
            int i9 = i8 % 2;
        }
        this.broadcasting = false;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        int i = 2 % 2;
        int i2 = f799a;
        int i3 = i2 + 77;
        g = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.checked;
        int i5 = i2 + 21;
        g = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        int i = 2 % 2;
        int i2 = g + 73;
        f799a = i2 % 128;
        int i3 = i2 % 2;
        setChecked(!this.checked);
        int i4 = f799a + 73;
        g = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.view.View
    public boolean performClick() {
        int i = 2 % 2;
        int i2 = f799a + 29;
        g = i2 % 128;
        int i3 = i2 % 2;
        if (this.materialButtonHelper.isToggleCheckedStateOnClick()) {
            int i4 = g + 41;
            f799a = i4 % 128;
            int i5 = i4 % 2;
            toggle();
        }
        return super.performClick();
    }

    public boolean isToggleCheckedStateOnClick() {
        int i = 2 % 2;
        int i2 = f799a + 13;
        g = i2 % 128;
        int i3 = i2 % 2;
        MaterialButtonHelper materialButtonHelper = this.materialButtonHelper;
        if (i3 != 0) {
            return materialButtonHelper.isToggleCheckedStateOnClick();
        }
        materialButtonHelper.isToggleCheckedStateOnClick();
        throw null;
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        int i = 2 % 2;
        int i2 = f799a + 125;
        g = i2 % 128;
        int i3 = i2 % 2;
        this.materialButtonHelper.setToggleCheckedStateOnClick(z);
        if (i3 == 0) {
            throw null;
        }
    }

    public boolean isCheckable() {
        int i = 2 % 2;
        int i2 = g + 9;
        f799a = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        MaterialButtonHelper materialButtonHelper = this.materialButtonHelper;
        if (materialButtonHelper == null || !materialButtonHelper.isCheckable()) {
            return false;
        }
        int i3 = f799a;
        int i4 = i3 + 71;
        g = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 51;
        g = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    public void setCheckable(boolean z) {
        int i = 2 % 2;
        int i2 = g + 59;
        f799a = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if (isUsingOriginalBackground()) {
            int i4 = f799a + 3;
            g = i4 % 128;
            if (i4 % 2 == 0) {
                this.materialButtonHelper.setCheckable(z);
                obj.hashCode();
                throw null;
            }
            this.materialButtonHelper.setCheckable(z);
        }
        int i5 = g + 123;
        f799a = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if ((r4 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        r4 = null;
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        throw new java.lang.IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (isUsingOriginalBackground() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (isUsingOriginalBackground() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        r3.materialButtonHelper.setShapeAppearanceModel(r4);
        r4 = com.google.android.material.button.MaterialButton.g + 41;
        com.google.android.material.button.MaterialButton.f799a = r4 % 128;
     */
    @Override // com.google.android.material.shape.Shapeable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setShapeAppearanceModel(com.google.android.material.shape.ShapeAppearanceModel r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.material.button.MaterialButton.f799a
            int r1 = r1 + 115
            int r2 = r1 % 128
            com.google.android.material.button.MaterialButton.g = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L18
            boolean r1 = r3.isUsingOriginalBackground()
            r2 = 4
            int r2 = r2 / 0
            if (r1 == 0) goto L34
            goto L1e
        L18:
            boolean r1 = r3.isUsingOriginalBackground()
            if (r1 == 0) goto L34
        L1e:
            com.google.android.material.button.MaterialButtonHelper r1 = r3.materialButtonHelper
            r1.setShapeAppearanceModel(r4)
            int r4 = com.google.android.material.button.MaterialButton.g
            int r4 = r4 + 41
            int r1 = r4 % 128
            com.google.android.material.button.MaterialButton.f799a = r1
            int r4 = r4 % r0
            if (r4 != 0) goto L2f
            return
        L2f:
            r4 = 0
            r4.hashCode()
            throw r4
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background."
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.setShapeAppearanceModel(com.google.android.material.shape.ShapeAppearanceModel):void");
    }

    @Override // com.google.android.material.shape.Shapeable
    public ShapeAppearanceModel getShapeAppearanceModel() {
        int i = 2 % 2;
        int i2 = g + 91;
        f799a = i2 % 128;
        int i3 = i2 % 2;
        if (!isUsingOriginalBackground()) {
            throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        }
        int i4 = g + 99;
        f799a = i4 % 128;
        if (i4 % 2 == 0) {
            return this.materialButtonHelper.getShapeAppearanceModel();
        }
        this.materialButtonHelper.getShapeAppearanceModel();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    void setOnPressedChangeListenerInternal(OnPressedChangeListener onPressedChangeListener) {
        int i = 2 % 2;
        int i2 = f799a;
        int i3 = i2 + 65;
        g = i3 % 128;
        int i4 = i3 % 2;
        this.onPressedChangeListenerInternal = onPressedChangeListener;
        int i5 = i2 + 111;
        g = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        int i = 2 % 2;
        OnPressedChangeListener onPressedChangeListener = this.onPressedChangeListenerInternal;
        if (onPressedChangeListener != null) {
            int i2 = f799a + 89;
            g = i2 % 128;
            if (i2 % 2 == 0) {
                onPressedChangeListener.onPressedChanged(this, z);
                throw null;
            }
            onPressedChangeListener.onPressedChanged(this, z);
            int i3 = g + 83;
            f799a = i3 % 128;
            int i4 = i3 % 2;
        }
        super.setPressed(z);
    }

    private boolean isUsingOriginalBackground() {
        int i = 2 % 2;
        MaterialButtonHelper materialButtonHelper = this.materialButtonHelper;
        if (materialButtonHelper == null || materialButtonHelper.isBackgroundOverwritten()) {
            int i2 = g + 121;
            f799a = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = g + 77;
        f799a = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    void setShouldDrawSurfaceColorStroke(boolean z) {
        int i = 2 % 2;
        int i2 = g + 67;
        f799a = i2 % 128;
        int i3 = i2 % 2;
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.setShouldDrawSurfaceColorStroke(z);
            int i4 = g + 57;
            f799a = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -9077742369031496124L;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -981105359;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) 34097;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r7, byte r8, byte r9) {
        /*
            int r9 = 104 - r9
            int r8 = r8 * 4
            int r8 = r8 + 1
            int r7 = r7 * 4
            int r7 = 3 - r7
            byte[] r0 = com.google.android.material.button.MaterialButton.$$c
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r9 = r7
            r3 = r8
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            int r7 = r7 + 1
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r6
        L2a:
            int r7 = r7 + r3
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.$$i(byte, byte, byte):java.lang.String");
    }
}
