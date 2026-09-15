package com.google.android.material.badge;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import com.bpjstku.databinding.ActivityLoginBinding;
import com.google.android.material.R;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import defpackage.initSession;
import defpackage.setOrVerifyExpectFrameRateRange;
import defpackage.setVideoStabilizationMode;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes3.dex */
public final class BadgeState {
    private static final String BADGE_RESOURCE_TAG = "badge";
    final float badgeHeight;
    final float badgeRadius;
    final float badgeWidth;
    final float badgeWithTextHeight;
    final float badgeWithTextRadius;
    final float badgeWithTextWidth;
    private final State currentState;
    final int horizontalInset;
    final int horizontalInsetWithText;
    int offsetAlignmentMode;
    private final State overridingState;
    private static final byte[] $$c = {49, -45, -112, 57};
    private static final int $$f = 71;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {91, -17, 90, 37, 17, -12, 39, -31, 16, -14, 16, 7, -15, 40, -16, -11, 7, 6, -6, 4, 14, -3, 4, 30, -15, -4, 10, 5, -14, 8, 0, -30, 15, -8, 14, -3, 4, 33, -14, -21, 15, 11, -6, -3, 49, -41, 20, -3, -3, 11, -6, -3, 4, 6, 14, 5, -3, 11, -8, 6, -2, 5, 6, -2, 12, 4, -15, 16, 7, -15, 45, -31, 14, 2, -4, 11, 2, 2, 8, -17, 12, -5, 70, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -54, -3, -3, 72, -56, -2, -3, 18, -10, 7, 16, -8, 65, -48, -17, 4, 15, Base64.padSymbol, -73, 3, 22, -7, -30, 15, -8, 14, -3, 4, 33, -14, -21, 15, 11, -6, -3, 49, -41, 20, -3, -3, 11, -6, -3, 4, 6, 14, 5, -3, 11, -8, 6, -2, 5, 6, -2, 12, 4, -15, 16, 7, -15, 45, -31, 14, 2, -4, 11, 2, 2, 8, -17, 12, -5, 69};
    private static final int $$e = 195;
    private static final byte[] $$a = {29, -5, -24, -13, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 26;
    private static int b = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -83722398;

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = 145 - r8
            int r7 = r7 * 14
            int r7 = r7 + 84
            int r0 = r6 + 1
            byte[] r1 = com.google.android.material.badge.BadgeState.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r6
            goto L29
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            r3 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L29:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r3 + 1
            int r8 = r8 + (-11)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.badge.BadgeState.a(short, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = 115 - r6
            int r0 = r8 + 28
            byte[] r1 = com.google.android.material.badge.BadgeState.$$d
            int r7 = 123 - r7
            byte[] r0 = new byte[r0]
            int r8 = r8 + 27
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L28
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L22:
            r3 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L28:
            int r6 = -r6
            int r7 = r7 + r6
            int r6 = r7 + 3
            int r7 = r3 + 1
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.badge.BadgeState.d(short, int, short, java.lang.Object[]):void");
    }

    BadgeState(Context context, int i, int i2, int i3, State state) {
        int iAccess$100;
        int iAccess$600;
        int iAccess$900;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        int iIntValue5;
        int iIntValue6;
        int iIntValue7;
        boolean zBooleanValue;
        State state2 = new State();
        this.currentState = state2;
        state = state == null ? new State() : state;
        if (i != 0) {
            State.access$002(state, i);
        }
        TypedArray typedArrayGenerateTypedArray = generateTypedArray(context, State.access$000(state), i2, i3);
        Resources resources = context.getResources();
        this.badgeRadius = typedArrayGenerateTypedArray.getDimensionPixelSize(R.styleable.Badge_badgeRadius, -1);
        this.horizontalInset = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.horizontalInsetWithText = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.badgeWithTextRadius = typedArrayGenerateTypedArray.getDimensionPixelSize(R.styleable.Badge_badgeWithTextRadius, -1);
        this.badgeWidth = typedArrayGenerateTypedArray.getDimension(R.styleable.Badge_badgeWidth, resources.getDimension(R.dimen.m3_badge_size));
        this.badgeWithTextWidth = typedArrayGenerateTypedArray.getDimension(R.styleable.Badge_badgeWithTextWidth, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.badgeHeight = typedArrayGenerateTypedArray.getDimension(R.styleable.Badge_badgeHeight, resources.getDimension(R.dimen.m3_badge_size));
        this.badgeWithTextHeight = typedArrayGenerateTypedArray.getDimension(R.styleable.Badge_badgeWithTextHeight, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.offsetAlignmentMode = typedArrayGenerateTypedArray.getInt(R.styleable.Badge_offsetAlignmentMode, 1);
        if (State.access$100(state) == -2) {
            int i4 = 2 % 2;
            iAccess$100 = 255;
        } else {
            iAccess$100 = State.access$100(state);
        }
        State.access$102(state2, iAccess$100);
        if (State.access$200(state) != -2) {
            State.access$202(state2, State.access$200(state));
        } else if (typedArrayGenerateTypedArray.hasValue(R.styleable.Badge_number)) {
            State.access$202(state2, typedArrayGenerateTypedArray.getInt(R.styleable.Badge_number, 0));
        } else {
            State.access$202(state2, -1);
        }
        if (State.access$300(state) != null) {
            int i5 = b + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 == 0) {
                State.access$302(state2, State.access$300(state));
                int i6 = 8 / 0;
            } else {
                State.access$302(state2, State.access$300(state));
            }
        } else if (typedArrayGenerateTypedArray.hasValue(R.styleable.Badge_badgeText)) {
            State.access$302(state2, typedArrayGenerateTypedArray.getString(R.styleable.Badge_badgeText));
        }
        State.access$402(state2, State.access$400(state));
        State.access$502(state2, State.access$500(state) == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : State.access$500(state));
        if (State.access$600(state) == 0) {
            int i7 = b + 101;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = R.plurals.mtrl_badge_content_description;
                throw null;
            }
            iAccess$600 = R.plurals.mtrl_badge_content_description;
        } else {
            iAccess$600 = State.access$600(state);
            int i9 = 2 % 2;
        }
        State.access$602(state2, iAccess$600);
        State.access$702(state2, State.access$700(state) == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : State.access$700(state));
        State.access$802(state2, Boolean.valueOf(State.access$800(state) == null || State.access$800(state).booleanValue()));
        if (State.access$900(state) == -2) {
            int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
            b = i10 % 128;
            iAccess$900 = i10 % 2 != 0 ? typedArrayGenerateTypedArray.getInt(R.styleable.Badge_maxCharacterCount, 103) : typedArrayGenerateTypedArray.getInt(R.styleable.Badge_maxCharacterCount, -2);
        } else {
            iAccess$900 = State.access$900(state);
        }
        State.access$902(state2, iAccess$900);
        State.access$1002(state2, State.access$1000(state) == -2 ? typedArrayGenerateTypedArray.getInt(R.styleable.Badge_maxNumber, -2) : State.access$1000(state));
        State.access$1102(state2, Integer.valueOf(State.access$1100(state) == null ? typedArrayGenerateTypedArray.getResourceId(R.styleable.Badge_badgeShapeAppearance, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : State.access$1100(state).intValue()));
        State.access$1202(state2, Integer.valueOf(State.access$1200(state) == null ? typedArrayGenerateTypedArray.getResourceId(R.styleable.Badge_badgeShapeAppearanceOverlay, 0) : State.access$1200(state).intValue()));
        if (State.access$1300(state) == null) {
            int i11 = b + 39;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
            if (i11 % 2 == 0) {
                iIntValue = typedArrayGenerateTypedArray.getResourceId(R.styleable.Badge_badgeWithTextShapeAppearance, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full);
                int i12 = 64 / 0;
            } else {
                iIntValue = typedArrayGenerateTypedArray.getResourceId(R.styleable.Badge_badgeWithTextShapeAppearance, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full);
            }
        } else {
            iIntValue = State.access$1300(state).intValue();
        }
        State.access$1302(state2, Integer.valueOf(iIntValue));
        State.access$1402(state2, Integer.valueOf(State.access$1400(state) == null ? typedArrayGenerateTypedArray.getResourceId(R.styleable.Badge_badgeWithTextShapeAppearanceOverlay, 0) : State.access$1400(state).intValue()));
        State.access$1502(state2, Integer.valueOf(State.access$1500(state) == null ? readColorFromAttributes(context, typedArrayGenerateTypedArray, R.styleable.Badge_backgroundColor) : State.access$1500(state).intValue()));
        if (State.access$1600(state) == null) {
            int i13 = b + 107;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 % 128;
            int i14 = i13 % 2;
            iIntValue2 = typedArrayGenerateTypedArray.getResourceId(R.styleable.Badge_badgeTextAppearance, R.style.TextAppearance_MaterialComponents_Badge);
        } else {
            iIntValue2 = State.access$1600(state).intValue();
        }
        State.access$1602(state2, Integer.valueOf(iIntValue2));
        if (State.access$1700(state) != null) {
            int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
            b = i15 % 128;
            if (i15 % 2 != 0) {
                State.access$1702(state2, State.access$1700(state));
                int i16 = 23 / 0;
            } else {
                State.access$1702(state2, State.access$1700(state));
            }
        } else if (!typedArrayGenerateTypedArray.hasValue(R.styleable.Badge_badgeTextColor)) {
            State.access$1702(state2, Integer.valueOf(new TextAppearance(context, State.access$1600(state2).intValue()).getTextColor().getDefaultColor()));
        } else {
            State.access$1702(state2, Integer.valueOf(readColorFromAttributes(context, typedArrayGenerateTypedArray, R.styleable.Badge_badgeTextColor)));
            int i17 = 2 % 2;
        }
        State.access$1802(state2, Integer.valueOf(State.access$1800(state) == null ? typedArrayGenerateTypedArray.getInt(R.styleable.Badge_badgeGravity, 8388661) : State.access$1800(state).intValue()));
        if (State.access$1900(state) == null) {
            int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
            b = i18 % 128;
            if (i18 % 2 != 0) {
                typedArrayGenerateTypedArray.getDimensionPixelSize(R.styleable.Badge_badgeWidePadding, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding));
                throw null;
            }
            iIntValue3 = typedArrayGenerateTypedArray.getDimensionPixelSize(R.styleable.Badge_badgeWidePadding, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding));
        } else {
            iIntValue3 = State.access$1900(state).intValue();
        }
        State.access$1902(state2, Integer.valueOf(iIntValue3));
        State.access$2002(state2, Integer.valueOf(State.access$2000(state) == null ? typedArrayGenerateTypedArray.getDimensionPixelSize(R.styleable.Badge_badgeVerticalPadding, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding)) : State.access$2000(state).intValue()));
        if (State.access$2100(state) == null) {
            iIntValue4 = typedArrayGenerateTypedArray.getDimensionPixelOffset(R.styleable.Badge_horizontalOffset, 0);
        } else {
            iIntValue4 = State.access$2100(state).intValue();
            int i19 = 2 % 2;
        }
        State.access$2102(state2, Integer.valueOf(iIntValue4));
        if (State.access$2200(state) == null) {
            iIntValue5 = typedArrayGenerateTypedArray.getDimensionPixelOffset(R.styleable.Badge_verticalOffset, 0);
            int i20 = 2 % 2;
        } else {
            iIntValue5 = State.access$2200(state).intValue();
        }
        State.access$2202(state2, Integer.valueOf(iIntValue5));
        if (State.access$2300(state) == null) {
            int i21 = b + 47;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i21 % 128;
            if (i21 % 2 == 0) {
                iIntValue6 = typedArrayGenerateTypedArray.getDimensionPixelOffset(R.styleable.Badge_horizontalOffsetWithText, State.access$2100(state2).intValue());
                int i22 = 77 / 0;
            } else {
                iIntValue6 = typedArrayGenerateTypedArray.getDimensionPixelOffset(R.styleable.Badge_horizontalOffsetWithText, State.access$2100(state2).intValue());
            }
        } else {
            iIntValue6 = State.access$2300(state).intValue();
        }
        State.access$2302(state2, Integer.valueOf(iIntValue6));
        if (State.access$2400(state) == null) {
            int i23 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
            b = i23 % 128;
            int i24 = i23 % 2;
            iIntValue7 = typedArrayGenerateTypedArray.getDimensionPixelOffset(R.styleable.Badge_verticalOffsetWithText, State.access$2200(state2).intValue());
        } else {
            iIntValue7 = State.access$2400(state).intValue();
        }
        State.access$2402(state2, Integer.valueOf(iIntValue7));
        State.access$2502(state2, Integer.valueOf(State.access$2500(state) == null ? typedArrayGenerateTypedArray.getDimensionPixelOffset(R.styleable.Badge_largeFontVerticalOffsetAdjustment, 0) : State.access$2500(state).intValue()));
        State.access$2602(state2, Integer.valueOf(State.access$2600(state) == null ? 0 : State.access$2600(state).intValue()));
        State.access$2702(state2, Integer.valueOf(State.access$2700(state) == null ? 0 : State.access$2700(state).intValue()));
        if (State.access$2800(state) == null) {
            int i25 = b + 39;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i25 % 128;
            zBooleanValue = i25 % 2 == 0 ? typedArrayGenerateTypedArray.getBoolean(R.styleable.Badge_autoAdjustToWithinGrandparentBounds, false) : typedArrayGenerateTypedArray.getBoolean(R.styleable.Badge_autoAdjustToWithinGrandparentBounds, false);
        } else {
            zBooleanValue = State.access$2800(state).booleanValue();
        }
        State.access$2802(state2, Boolean.valueOf(zBooleanValue));
        typedArrayGenerateTypedArray.recycle();
        if (State.access$2900(state) == null) {
            State.access$2902(state2, Locale.getDefault(Locale.Category.FORMAT));
        } else {
            State.access$2902(state2, State.access$2900(state));
        }
        this.overridingState = state;
    }

    private static void c(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
            int i5 = $11 + 27;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i7 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char modifierMetaStateMask = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                    int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 3291;
                    int iLastIndexOf = 30 - TextUtils.lastIndexOf("", '0', 0);
                    byte b2 = (byte) ($$f & 1);
                    byte b3 = (byte) (b2 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(modifierMetaStateMask, keyRepeatDelay, iLastIndexOf, 1199271174, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) View.resolveSize(0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 651, (ViewConfiguration.getScrollBarSize() >> 8) + 44, -450685997, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i3 > 0) {
            int i8 = $11 + 39;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i10 = $10 + 119;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), KeyEvent.normalizeMetaState(0) + 651, KeyEvent.getDeadChar(0, 0) + 44, -450685997, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    public static final class State implements Parcelable {
        private static final int BADGE_NUMBER_NONE = -1;
        public static final Parcelable.Creator<State> CREATOR;
        private static final int NOT_SET = -2;
        private static char[] TuitionPaymentFragmentbindingInflater1;
        private static int b;
        private Integer additionalHorizontalOffset;
        private Integer additionalVerticalOffset;
        private int alpha;
        private Boolean autoAdjustToWithinGrandparentBounds;
        private Integer backgroundColor;
        private Integer badgeGravity;
        private Integer badgeHorizontalPadding;
        private int badgeResId;
        private Integer badgeShapeAppearanceOverlayResId;
        private Integer badgeShapeAppearanceResId;
        private Integer badgeTextAppearanceResId;
        private Integer badgeTextColor;
        private Integer badgeVerticalPadding;
        private Integer badgeWithTextShapeAppearanceOverlayResId;
        private Integer badgeWithTextShapeAppearanceResId;
        private int contentDescriptionExceedsMaxBadgeNumberRes;
        private CharSequence contentDescriptionForText;
        private CharSequence contentDescriptionNumberless;
        private int contentDescriptionQuantityStrings;
        private Integer horizontalOffsetWithText;
        private Integer horizontalOffsetWithoutText;
        private Boolean isVisible;
        private Integer largeFontVerticalOffsetAdjustment;
        private int maxCharacterCount;
        private int maxNumber;
        private int number;
        private Locale numberLocale;
        private String text;
        private Integer verticalOffsetWithText;
        private Integer verticalOffsetWithoutText;
        private static final byte[] $$c = {99, -43, -44, -62};
        private static final int $$f = 107;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {119, -102, -34, -3, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -54, -3, -3, 72, -56, -2, -3, 18, -10, 7, 16, -8, 65, -60, 4, 4, 5, -8, 24, -20, 16, -7, 13, -3, 4, 18, -1, -9, 5, 3, 1, 4, 67, -73, 3, 18, 1, -30, 15, -8, 14, -3, 4, 33, -14, -21, 15, 11, -6, -3, 49, -41, 20, -3, -3, 11, -6, -3, 21, -4, -2, 13, -2, -2, 10, 33, -34, 11, -3, 14, -16, 18, -10, 68};
        private static final int $$e = 88;
        private static final byte[] $$a = {31, -3, -46, 11, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
        private static final int $$b = 130;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;

        private static void a(byte b2, int i, short s, Object[] objArr) {
            int i2 = (b2 * 52) + 4;
            int i3 = 98 - (s * 14);
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[53 - i];
            int i4 = 52 - i;
            int i5 = -1;
            if (bArr == null) {
                i3 = (i4 + i3) - 10;
                i2++;
            }
            while (true) {
                i5++;
                bArr2[i5] = (byte) i3;
                if (i5 == i4) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                } else {
                    i3 = (i3 + bArr[i2]) - 10;
                    i2++;
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0029  */
        /* JADX WARN: Code duplicated, block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0034). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void d(int r6, int r7, int r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 * 55
                int r7 = 58 - r7
                byte[] r0 = com.google.android.material.badge.BadgeState.State.$$d
                int r6 = r6 * 15
                int r6 = 99 - r6
                int r8 = r8 * 18
                int r1 = r8 + 38
                byte[] r1 = new byte[r1]
                int r8 = r8 + 37
                r2 = 0
                if (r0 != 0) goto L18
                r3 = r7
                r4 = r2
                goto L34
            L18:
                r3 = r2
            L19:
                r5 = r7
                r7 = r6
                r6 = r5
                byte r4 = (byte) r7
                r1[r3] = r4
                if (r3 != r8) goto L29
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L29:
                int r3 = r3 + 1
                int r6 = r6 + 1
                r4 = r0[r6]
                r5 = r7
                r7 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L34:
                int r6 = -r6
                int r3 = r3 + r6
                int r6 = r3 + 3
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.badge.BadgeState.State.d(int, int, int, java.lang.Object[]):void");
        }

        private static void c(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            char[] cArr;
            char[] cArr2;
            int i = 2 % 2;
            setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
            int i2 = 0;
            int i3 = iArr[0];
            int i4 = 1;
            int i5 = iArr[1];
            int i6 = iArr[2];
            int i7 = iArr[3];
            char[] cArr3 = TuitionPaymentFragmentbindingInflater1;
            long j = 0;
            if (cArr3 != null) {
                int length = cArr3.length;
                char[] cArr4 = new char[length];
                int i8 = $10 + 37;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                int i10 = 0;
                while (i10 < length) {
                    try {
                        Object[] objArr2 = new Object[i4];
                        objArr2[i2] = Integer.valueOf(cArr3[i10]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cIndexOf = (char) TextUtils.indexOf("", "", i2, i2);
                            int bitsPerPixel = 1269 - ImageFormat.getBitsPerPixel(i2);
                            int packedPositionType = ExpandableListView.getPackedPositionType(j) + 18;
                            byte b2 = (byte) ($$f & 5);
                            byte b3 = (byte) (b2 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, bitsPerPixel, packedPositionType, 407021364, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr4[i10] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i10++;
                        i2 = 0;
                        i4 = 1;
                        j = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                int i11 = $11 + 5;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                cArr3 = cArr4;
            }
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr3, i3, cArr5, 0, i5);
            if (bArr != null) {
                int i13 = $11 + 73;
                $10 = i13 % 128;
                if (i13 % 2 != 0) {
                    cArr2 = new char[i5];
                    setvideostabilizationmode.b = 1;
                } else {
                    cArr2 = new char[i5];
                    setvideostabilizationmode.b = 0;
                }
                char c = 0;
                while (setvideostabilizationmode.b < i5) {
                    if (bArr[setvideostabilizationmode.b] == 1) {
                        int i14 = setvideostabilizationmode.b;
                        Object[] objArr3 = {Integer.valueOf(cArr5[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3225, 14 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 2133916302, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr2[i14] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    } else {
                        int i15 = setvideostabilizationmode.b;
                        Object[] objArr4 = {Integer.valueOf(cArr5[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 29945);
                            int iMyTid = (Process.myTid() >> 22) + 1755;
                            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 23;
                            byte b6 = (byte) ($$f & 6);
                            byte b7 = (byte) (b6 - 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, iMyTid, minimumFlingVelocity, 387247676, false, $$g(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr2[i15] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                    }
                    c = cArr2[setvideostabilizationmode.b];
                    Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b8 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 41241), 1704 - TextUtils.lastIndexOf("", '0', 0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 20, -1434471773, false, $$g((byte) 6, b8, b8), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
                cArr5 = cArr2;
            }
            if (i7 > 0) {
                int i16 = $10 + 21;
                $11 = i16 % 128;
                int i17 = i16 % 2;
                char[] cArr6 = new char[i5];
                System.arraycopy(cArr5, 0, cArr6, 0, i5);
                int i18 = i5 - i7;
                System.arraycopy(cArr6, 0, cArr5, i18, i7);
                System.arraycopy(cArr6, i7, cArr5, 0, i18);
            }
            if (z) {
                int i19 = $10 + 69;
                $11 = i19 % 128;
                if (i19 % 2 == 0) {
                    cArr = new char[i5];
                    setvideostabilizationmode.b = 1;
                } else {
                    cArr = new char[i5];
                    setvideostabilizationmode.b = 0;
                }
                while (setvideostabilizationmode.b < i5) {
                    int i20 = $11 + 91;
                    $10 = i20 % 128;
                    int i21 = i20 % 2;
                    cArr[setvideostabilizationmode.b] = cArr5[(i5 - setvideostabilizationmode.b) - 1];
                    setvideostabilizationmode.b++;
                }
                cArr5 = cArr;
            }
            if (i6 > 0) {
                int i22 = 0;
                loop3: while (true) {
                    setvideostabilizationmode.b = i22;
                    while (true) {
                        if (setvideostabilizationmode.b >= i5) {
                            break loop3;
                        }
                        int i23 = $11 + 69;
                        $10 = i23 % 128;
                        if (i23 % 2 != 0) {
                            cArr5[setvideostabilizationmode.b] = (char) (cArr5[setvideostabilizationmode.b] * iArr[5]);
                            setvideostabilizationmode.b >>>= 1;
                        }
                    }
                    cArr5[setvideostabilizationmode.b] = (char) (cArr5[setvideostabilizationmode.b] - iArr[2]);
                    i22 = setvideostabilizationmode.b + 1;
                }
            }
            objArr[0] = new String(cArr5);
        }

        static /* synthetic */ int access$000(State state) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
            int i4 = i2 % 2;
            int i5 = state.badgeResId;
            int i6 = i3 + 31;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            if (i6 % 2 != 0) {
                return i5;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static /* synthetic */ int access$002(State state, int i) {
            int i2 = 2 % 2;
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 75;
            int i4 = i3 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4;
            int i5 = i3 % 2;
            state.badgeResId = i;
            int i6 = i4 + 17;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            if (i6 % 2 == 0) {
                return i;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static /* synthetic */ int access$100(State state) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 97;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
            int i4 = i2 % 2;
            int i5 = state.alpha;
            int i6 = i3 + 53;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        static /* synthetic */ int access$1000(State state) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
            int i4 = i2 % 2;
            int i5 = state.maxNumber;
            int i6 = i3 + 69;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        static /* synthetic */ int access$1002(State state, int i) {
            int i2 = 2 % 2;
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i4 = i3 + 105;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
            state.maxNumber = i;
            if (i5 != 0) {
                throw null;
            }
            int i6 = i3 + 111;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            if (i6 % 2 == 0) {
                return i;
            }
            throw null;
        }

        static /* synthetic */ int access$102(State state, int i) {
            int i2 = 2 % 2;
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i4 = i3 + 83;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            state.alpha = i;
            int i6 = i3 + 119;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            if (i6 % 2 != 0) {
                return i;
            }
            throw null;
        }

        static /* synthetic */ Integer access$1100(State state) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
            int i4 = i2 % 2;
            Integer num = state.badgeShapeAppearanceResId;
            int i5 = i3 + 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            return num;
        }

        static /* synthetic */ Integer access$1102(State state, Integer num) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
            int i4 = i2 % 2;
            state.badgeShapeAppearanceResId = num;
            int i5 = i3 + 71;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            return num;
        }

        static /* synthetic */ Integer access$1200(State state) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 91;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
            int i4 = i2 % 2;
            Integer num = state.badgeShapeAppearanceOverlayResId;
            int i5 = i3 + 13;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            if (i5 % 2 == 0) {
                return num;
            }
            throw null;
        }

        static /* synthetic */ Integer access$1202(State state, Integer num) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            state.badgeShapeAppearanceOverlayResId = num;
            if (i3 == 0) {
                return num;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static /* synthetic */ Integer access$1300(State state) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 75;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
            int i4 = i2 % 2;
            Integer num = state.badgeWithTextShapeAppearanceResId;
            if (i4 != 0) {
                throw null;
            }
            int i5 = i3 + 107;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            return num;
        }

        static /* synthetic */ Integer access$1302(State state, Integer num) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
            int i4 = i2 % 2;
            state.badgeWithTextShapeAppearanceResId = num;
            int i5 = i3 + 43;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 != 0) {
                return num;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static /* synthetic */ Integer access$1400(State state) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 97;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            Integer num = state.badgeWithTextShapeAppearanceOverlayResId;
            if (i3 != 0) {
                return num;
            }
            throw null;
        }

        static /* synthetic */ Integer access$1402(State state, Integer num) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
            int i4 = i2 % 2;
            state.badgeWithTextShapeAppearanceOverlayResId = num;
            if (i4 == 0) {
                throw null;
            }
            int i5 = i3 + 91;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
            return num;
        }

        static /* synthetic */ Integer access$1500(State state) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 75;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
            int i4 = i2 % 2;
            Object obj = null;
            Integer num = state.backgroundColor;
            if (i4 != 0) {
                throw null;
            }
            int i5 = i3 + 17;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 != 0) {
                return num;
            }
            obj.hashCode();
            throw null;
        }

        static /* synthetic */ Integer access$1502(State state, Integer num) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
            int i4 = i2 % 2;
            state.backgroundColor = num;
            int i5 = i3 + 101;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 != 0) {
                return num;
            }
            throw null;
        }

        static /* synthetic */ Integer access$1600(State state) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i3 = i2 + 101;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            Integer num = state.badgeTextAppearanceResId;
            if (i4 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i2 + 77;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 18 / 0;
            }
            return num;
        }

        static /* synthetic */ Integer access$1602(State state, Integer num) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
            int i4 = i2 % 2;
            state.badgeTextAppearanceResId = num;
            int i5 = i3 + 93;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 != 0) {
                return num;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static /* synthetic */ Integer access$1700(State state) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 5;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            Integer num = state.badgeTextColor;
            if (i3 != 0) {
                return num;
            }
            throw null;
        }

        static /* synthetic */ Integer access$1702(State state, Integer num) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 93;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            state.badgeTextColor = num;
            if (i3 != 0) {
                return num;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static /* synthetic */ Integer access$1800(State state) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
            int i4 = i2 % 2;
            Integer num = state.badgeGravity;
            int i5 = i3 + 117;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            return num;
        }

        static /* synthetic */ Integer access$1802(State state, Integer num) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i3 = i2 + 85;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            state.badgeGravity = num;
            int i5 = i2 + 113;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 != 0) {
                return num;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static /* synthetic */ Integer access$1900(State state) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i3 = i2 + 17;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            Integer num = state.badgeHorizontalPadding;
            int i5 = i2 + 119;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
            return num;
        }

        static /* synthetic */ Integer access$1902(State state, Integer num) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 117;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
            int i4 = i2 % 2;
            state.badgeHorizontalPadding = num;
            if (i4 == 0) {
                int i5 = 96 / 0;
            }
            int i6 = i3 + 13;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            int i7 = i6 % 2;
            return num;
        }

        static /* synthetic */ int access$200(State state) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 115;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
            int i4 = i2 % 2;
            int i5 = state.number;
            if (i4 == 0) {
                int i6 = 23 / 0;
            }
            int i7 = i3 + 99;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
            int i8 = i7 % 2;
            return i5;
        }

        static /* synthetic */ Integer access$2000(State state) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
            int i4 = i2 % 2;
            Integer num = state.badgeVerticalPadding;
            int i5 = i3 + 61;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            return num;
        }

        static /* synthetic */ Integer access$2002(State state, Integer num) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i3 = i2 + 89;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            state.badgeVerticalPadding = num;
            int i5 = i2 + 23;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
            return num;
        }

        static /* synthetic */ int access$202(State state, int i) {
            int i2 = 2 % 2;
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            state.number = i;
            if (i4 != 0) {
                return i;
            }
            throw null;
        }

        static /* synthetic */ Integer access$2100(State state) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i3 = i2 + 105;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            Integer num = state.horizontalOffsetWithoutText;
            int i5 = i2 + 125;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 31 / 0;
            }
            return num;
        }

        static /* synthetic */ Integer access$2102(State state, Integer num) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            state.horizontalOffsetWithoutText = num;
            if (i3 != 0) {
                int i4 = 31 / 0;
            }
            return num;
        }

        static /* synthetic */ Integer access$2200(State state) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i3 = i2 + 45;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            Integer num = state.verticalOffsetWithoutText;
            if (i4 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i2 + 25;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
            return num;
        }

        static /* synthetic */ Integer access$2202(State state, Integer num) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 21;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
            int i4 = i2 % 2;
            state.verticalOffsetWithoutText = num;
            int i5 = i3 + 69;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
            return num;
        }

        static /* synthetic */ Integer access$2300(State state) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i3 = i2 + 15;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            Integer num = state.horizontalOffsetWithText;
            if (i4 == 0) {
                throw null;
            }
            int i5 = i2 + 5;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            return num;
        }

        static /* synthetic */ Integer access$2302(State state, Integer num) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i3 = i2 + 63;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            state.horizontalOffsetWithText = num;
            int i5 = i2 + 27;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 29 / 0;
            }
            return num;
        }

        static /* synthetic */ Integer access$2400(State state) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 115;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            Integer num = state.verticalOffsetWithText;
            if (i3 != 0) {
                return num;
            }
            throw null;
        }

        static /* synthetic */ Integer access$2402(State state, Integer num) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            state.verticalOffsetWithText = num;
            if (i3 != 0) {
                return num;
            }
            throw null;
        }

        static /* synthetic */ Integer access$2500(State state) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i3 = i2 + 103;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            Integer num = state.largeFontVerticalOffsetAdjustment;
            int i5 = i2 + 43;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            return num;
        }

        static /* synthetic */ Integer access$2502(State state, Integer num) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            state.largeFontVerticalOffsetAdjustment = num;
            if (i3 != 0) {
                int i4 = 45 / 0;
            }
            return num;
        }

        static /* synthetic */ Integer access$2600(State state) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            Integer num = state.additionalHorizontalOffset;
            if (i3 == 0) {
                int i4 = 6 / 0;
            }
            return num;
        }

        static /* synthetic */ Integer access$2602(State state, Integer num) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
            int i4 = i2 % 2;
            state.additionalHorizontalOffset = num;
            int i5 = i3 + 63;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 != 0) {
                return num;
            }
            throw null;
        }

        static /* synthetic */ Integer access$2700(State state) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 69;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
            int i4 = i2 % 2;
            Integer num = state.additionalVerticalOffset;
            int i5 = i3 + 15;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 != 0) {
                return num;
            }
            throw null;
        }

        static /* synthetic */ Integer access$2702(State state, Integer num) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
            int i4 = i2 % 2;
            state.additionalVerticalOffset = num;
            if (i4 == 0) {
                throw null;
            }
            int i5 = i3 + 63;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
            return num;
        }

        static /* synthetic */ Boolean access$2800(State state) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i3 = i2 + 61;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            Boolean bool = state.autoAdjustToWithinGrandparentBounds;
            if (i4 == 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = i2 + 53;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 != 0) {
                return bool;
            }
            obj.hashCode();
            throw null;
        }

        static /* synthetic */ Boolean access$2802(State state, Boolean bool) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 71;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
            int i4 = i2 % 2;
            state.autoAdjustToWithinGrandparentBounds = bool;
            if (i4 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 63;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 56 / 0;
            }
            return bool;
        }

        static /* synthetic */ Locale access$2900(State state) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
            int i4 = i2 % 2;
            Locale locale = state.numberLocale;
            int i5 = i3 + 125;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            return locale;
        }

        static /* synthetic */ Locale access$2902(State state, Locale locale) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
            int i4 = i2 % 2;
            state.numberLocale = locale;
            int i5 = i3 + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            return locale;
        }

        static /* synthetic */ String access$300(State state) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 109;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
            int i4 = i2 % 2;
            String str = state.text;
            if (i4 == 0) {
                throw null;
            }
            int i5 = i3 + 121;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        static /* synthetic */ String access$302(State state, String str) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i3 = i2 + 39;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            state.text = str;
            if (i4 != 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = i2 + 87;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            obj.hashCode();
            throw null;
        }

        static /* synthetic */ CharSequence access$400(State state) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i3 = i2 + 107;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            CharSequence charSequence = state.contentDescriptionForText;
            if (i4 == 0) {
                throw null;
            }
            int i5 = i2 + 123;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 54 / 0;
            }
            return charSequence;
        }

        static /* synthetic */ CharSequence access$402(State state, CharSequence charSequence) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i3 = i2 + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            state.contentDescriptionForText = charSequence;
            int i5 = i2 + 119;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            return charSequence;
        }

        static /* synthetic */ CharSequence access$500(State state) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 21;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
            int i4 = i2 % 2;
            CharSequence charSequence = state.contentDescriptionNumberless;
            int i5 = i3 + 31;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 != 0) {
                return charSequence;
            }
            throw null;
        }

        static /* synthetic */ CharSequence access$502(State state, CharSequence charSequence) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i3 = i2 + 53;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            state.contentDescriptionNumberless = charSequence;
            int i5 = i2 + 9;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
            return charSequence;
        }

        static /* synthetic */ int access$600(State state) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
            int i4 = i2 % 2;
            int i5 = state.contentDescriptionQuantityStrings;
            int i6 = i3 + 67;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            if (i6 % 2 != 0) {
                return i5;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static /* synthetic */ int access$602(State state, int i) {
            int i2 = 2 % 2;
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
            int i4 = i3 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4;
            int i5 = i3 % 2;
            Object obj = null;
            state.contentDescriptionQuantityStrings = i;
            if (i5 == 0) {
                throw null;
            }
            int i6 = i4 + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            if (i6 % 2 == 0) {
                return i;
            }
            obj.hashCode();
            throw null;
        }

        static /* synthetic */ int access$700(State state) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
            int i4 = i2 % 2;
            int i5 = state.contentDescriptionExceedsMaxBadgeNumberRes;
            int i6 = i3 + 107;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            if (i6 % 2 != 0) {
                return i5;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static /* synthetic */ int access$702(State state, int i) {
            int i2 = 2 % 2;
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
            int i4 = i3 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4;
            int i5 = i3 % 2;
            state.contentDescriptionExceedsMaxBadgeNumberRes = i;
            if (i5 != 0) {
                throw null;
            }
            int i6 = i4 + 109;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            int i7 = i6 % 2;
            return i;
        }

        static /* synthetic */ Boolean access$800(State state) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i3 = i2 + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            Boolean bool = state.isVisible;
            int i5 = i2 + 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 40 / 0;
            }
            return bool;
        }

        static /* synthetic */ Boolean access$802(State state, Boolean bool) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            state.isVisible = bool;
            if (i3 == 0) {
                return bool;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static /* synthetic */ int access$900(State state) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 23;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            int i4 = state.maxCharacterCount;
            if (i3 != 0) {
                return i4;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static /* synthetic */ int access$902(State state, int i) {
            int i2 = 2 % 2;
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            state.maxCharacterCount = i;
            if (i4 == 0) {
                return i;
            }
            throw null;
        }

        public State() {
            this.alpha = 255;
            this.number = -2;
            this.maxCharacterCount = -2;
            this.maxNumber = -2;
            this.isVisible = Boolean.TRUE;
        }

        State(Parcel parcel) {
            this.alpha = 255;
            this.number = -2;
            this.maxCharacterCount = -2;
            this.maxNumber = -2;
            this.isVisible = Boolean.TRUE;
            this.badgeResId = parcel.readInt();
            this.backgroundColor = (Integer) parcel.readSerializable();
            this.badgeTextColor = (Integer) parcel.readSerializable();
            this.badgeTextAppearanceResId = (Integer) parcel.readSerializable();
            this.badgeShapeAppearanceResId = (Integer) parcel.readSerializable();
            this.badgeShapeAppearanceOverlayResId = (Integer) parcel.readSerializable();
            this.badgeWithTextShapeAppearanceResId = (Integer) parcel.readSerializable();
            this.badgeWithTextShapeAppearanceOverlayResId = (Integer) parcel.readSerializable();
            this.alpha = parcel.readInt();
            this.text = parcel.readString();
            this.number = parcel.readInt();
            this.maxCharacterCount = parcel.readInt();
            this.maxNumber = parcel.readInt();
            this.contentDescriptionForText = parcel.readString();
            this.contentDescriptionNumberless = parcel.readString();
            this.contentDescriptionQuantityStrings = parcel.readInt();
            this.badgeGravity = (Integer) parcel.readSerializable();
            this.badgeHorizontalPadding = (Integer) parcel.readSerializable();
            this.badgeVerticalPadding = (Integer) parcel.readSerializable();
            this.horizontalOffsetWithoutText = (Integer) parcel.readSerializable();
            this.verticalOffsetWithoutText = (Integer) parcel.readSerializable();
            this.horizontalOffsetWithText = (Integer) parcel.readSerializable();
            this.verticalOffsetWithText = (Integer) parcel.readSerializable();
            this.largeFontVerticalOffsetAdjustment = (Integer) parcel.readSerializable();
            this.additionalHorizontalOffset = (Integer) parcel.readSerializable();
            this.additionalVerticalOffset = (Integer) parcel.readSerializable();
            this.isVisible = (Boolean) parcel.readSerializable();
            this.numberLocale = (Locale) parcel.readSerializable();
            this.autoAdjustToWithinGrandparentBounds = (Boolean) parcel.readSerializable();
        }

        static {
            b = 0;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            CREATOR = new Parcelable.Creator<State>() { // from class: com.google.android.material.badge.BadgeState.State.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public State createFromParcel(Parcel parcel) {
                    return new State(parcel);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public State[] newArray(int i) {
                    return new State[i];
                }
            };
            int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
            b = i % 128;
            if (i % 2 != 0) {
                int i2 = 41 / 0;
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            String string;
            int i2 = 2 % 2;
            parcel.writeInt(this.badgeResId);
            parcel.writeSerializable(this.backgroundColor);
            parcel.writeSerializable(this.badgeTextColor);
            parcel.writeSerializable(this.badgeTextAppearanceResId);
            parcel.writeSerializable(this.badgeShapeAppearanceResId);
            parcel.writeSerializable(this.badgeShapeAppearanceOverlayResId);
            parcel.writeSerializable(this.badgeWithTextShapeAppearanceResId);
            parcel.writeSerializable(this.badgeWithTextShapeAppearanceOverlayResId);
            parcel.writeInt(this.alpha);
            parcel.writeString(this.text);
            parcel.writeInt(this.number);
            parcel.writeInt(this.maxCharacterCount);
            parcel.writeInt(this.maxNumber);
            CharSequence charSequence = this.contentDescriptionForText;
            String string2 = null;
            if (charSequence != null) {
                string = charSequence.toString();
            } else {
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
                int i4 = i3 % 2;
                string = null;
            }
            parcel.writeString(string);
            CharSequence charSequence2 = this.contentDescriptionNumberless;
            if (charSequence2 != null) {
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 67;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                int i6 = i5 % 2;
                string2 = charSequence2.toString();
            }
            parcel.writeString(string2);
            parcel.writeInt(this.contentDescriptionQuantityStrings);
            parcel.writeSerializable(this.badgeGravity);
            parcel.writeSerializable(this.badgeHorizontalPadding);
            parcel.writeSerializable(this.badgeVerticalPadding);
            parcel.writeSerializable(this.horizontalOffsetWithoutText);
            parcel.writeSerializable(this.verticalOffsetWithoutText);
            parcel.writeSerializable(this.horizontalOffsetWithText);
            parcel.writeSerializable(this.verticalOffsetWithText);
            parcel.writeSerializable(this.largeFontVerticalOffsetAdjustment);
            parcel.writeSerializable(this.additionalHorizontalOffset);
            parcel.writeSerializable(this.additionalVerticalOffset);
            parcel.writeSerializable(this.isVisible);
            parcel.writeSerializable(this.numberLocale);
            parcel.writeSerializable(this.autoAdjustToWithinGrandparentBounds);
        }

        @Override // android.os.Parcelable
        public final int describeContents() throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 73;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char threadPriority = (char) (31533 - ((Process.getThreadPriority(0) + 20) >> 6));
                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 921;
                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 28;
                byte b2 = $$a[80];
                byte b3 = b2;
                Object[] objArr2 = new Object[1];
                a(b3, (byte) (b3 | 52), b2, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(threadPriority, iResolveSizeAndState, edgeSlop, -1048449946, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(new int[]{0, 22, 0, 8}, true, new byte[]{0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0}, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(new int[]{22, 15, 0, 15}, false, new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char absoluteGravity = (char) (Gravity.getAbsoluteGravity(0, 0) + 31533);
                int scrollBarSize = 921 - (ViewConfiguration.getScrollBarSize() >> 8);
                int i4 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 27;
                byte[] bArr = $$a;
                byte b4 = bArr[80];
                Object[] objArr5 = new Object[1];
                a(b4, b4, bArr[37], objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(absoluteGravity, scrollBarSize, i4, -778300370, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 31533);
                    int iLastIndexOf = 920 - TextUtils.lastIndexOf("", '0', 0, 0);
                    int i5 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 28;
                    byte[] bArr2 = $$a;
                    byte b5 = bArr2[37];
                    Object[] objArr6 = new Object[1];
                    a(b5, bArr2[33], b5, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(jumpTapTimeout, iLastIndexOf, i5, -1142834547, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
                int iMyUid = Process.myUid();
                int i6 = 1953390499 + (((~((-739416713) | iMyUid)) | 738365440) * 104) + ((~((~iMyUid) | 1035714203)) * (-104)) + ((iMyUid | 1034662931) * 104) + 1241758635;
                int i7 = (i6 << 13) ^ i6;
                int i8 = i7 ^ (i7 >>> 17);
                ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                c(new int[]{37, 26, 0, 1}, true, new byte[]{1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0}, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(new int[]{63, 18, 0, 6}, true, new byte[]{0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1}, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 45;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
                    if (i9 % 2 == 0) {
                        boolean z = applicationContext instanceof ContextWrapper;
                        throw null;
                    }
                    applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                }
                Object[] objArr10 = new Object[1];
                c(new int[]{81, 16, 0, 0}, false, new byte[]{0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0}, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                c(new int[]{97, 16, 186, 0}, false, new byte[]{1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1}, objArr11);
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 1241758635};
                    byte[] bArr3 = $$d;
                    byte b6 = bArr3[52];
                    byte b7 = (byte) (b6 - 1);
                    byte b8 = b6;
                    Object[] objArr13 = new Object[1];
                    d(b7, b8, b8, objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b9 = bArr3[52];
                    byte b10 = (byte) (b9 - 1);
                    Object[] objArr14 = new Object[1];
                    d(b9, b10, b10, objArr14);
                    Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char jumpTapTimeout2 = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 31533);
                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 921;
                        int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 29;
                        byte[] bArr4 = $$a;
                        byte b11 = bArr4[37];
                        Object[] objArr16 = new Object[1];
                        a(b11, bArr4[33], b11, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(jumpTapTimeout2, touchSlop, bitsPerPixel, -1142834547, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        c(new int[]{0, 22, 0, 8}, true, new byte[]{0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0}, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        c(new int[]{22, 15, 0, 15}, false, new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char trimmedLength = (char) (31533 - TextUtils.getTrimmedLength(""));
                            int keyRepeatTimeout = 921 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                            int iMakeMeasureSpec = 28 - View.MeasureSpec.makeMeasureSpec(0, 0);
                            byte[] bArr5 = $$a;
                            byte b12 = bArr5[80];
                            byte b13 = bArr5[37];
                            Object[] objArr19 = new Object[1];
                            a(b12, b12, b13, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(trimmedLength, keyRepeatTimeout, iMakeMeasureSpec, -778300370, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cRgb = (char) (Color.rgb(0, 0, 0) + 16808749);
                            int fadingEdgeLength = 921 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                            int fadingEdgeLength2 = 28 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                            byte b14 = $$a[80];
                            byte b15 = b14;
                            Object[] objArr20 = new Object[1];
                            a(b15, (byte) (b15 | 52), b14, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cRgb, fadingEdgeLength, fadingEdgeLength2, -1048449946, false, (String) objArr20[0], null);
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
            int i10 = ((int[]) objArr[1])[0];
            int i11 = ((int[]) objArr[3])[0];
            if (i11 != i10) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[4];
                if (strArr != null) {
                    for (String str : strArr) {
                        int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i12 % 128;
                        int i13 = i12 % 2;
                        arrayList.add(str);
                    }
                }
                throw new RuntimeException(String.valueOf(i11));
            }
            int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i14 % 128;
            int i15 = i14 % 2;
            int i16 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int i17 = ~((int) Runtime.getRuntime().totalMemory());
            int i18 = i16 + 1262922715 + (((~(i17 | 1034286374)) | (-1035861368)) * (-160)) + (((~(i17 | (-739793270))) | 1034286374) * 160);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            Object obj = objArr21[0];
            ((int[]) obj)[0] = i20 ^ (i20 << 5);
            int i21 = ((int[]) obj)[0];
            int i22 = ((i21 * i21) - (~(-(248782953 * i21)))) - 1;
            int i23 = -(i21 * (-1415003921));
            int i24 = ((i22 & i23) + (i23 | i22)) - 1125715056;
            int i25 = i24 >> 24;
            int i26 = (((i25 ^ (-511)) + ((i25 & (-511)) << 1)) / 256) + 1;
            int i27 = (i24 & i26) + (i26 | i24);
            int i28 = ((i24 >> 15) - 262143) / 131072;
            int i29 = -(i27 ^ (((i28 | 1) << 1) - (i28 ^ 1)));
            int i30 = (i29 ^ 1) + ((i29 & 1) << 1);
            int i31 = i30 >> 28;
            int i32 = ((i31 & (-31)) + (i31 | (-31))) / 16;
            return 0 / (((-((((i32 | 1) << 1) - (i32 ^ 1)) + 1)) & i30) * TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE);
        }

        static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            TuitionPaymentFragmentbindingInflater1 = new char[]{59676, 59714, 59757, 59751, 59771, 59744, 59746, 59756, 59757, 59756, 59746, 59750, 59740, 59731, 59746, 59751, 59768, 59773, 59757, 59723, 59739, 59770, 59705, 59747, 59757, 59747, 59770, 59751, 59759, 59728, 59728, 59752, 59757, 59771, 59749, 59744, 59746, 59707, 59753, 59753, 59752, 59744, 59750, 59733, 59757, 59773, 59749, 59748, 59748, 59749, 59744, 59737, 59708, 59716, 59771, 59747, 59724, 59714, 59757, 59751, 59771, 59744, 59746, 59708, 59746, 59744, 59769, 59768, 59751, 59747, 59749, 59751, 59749, 59745, 59753, 59757, 59745, 59749, 59771, 59731, 59729, 59710, 59758, 59744, 59744, 59724, 59718, 59757, 59756, 59745, 59713, 59723, 59757, 59773, 59768, 59751, 59746, 59802, 59435, 59413, 59432, 59424, 59427, 59427, 59451, 59409, 59397, 59439, 59436, 59396, 59416, 59432, 59413};
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(short r6, short r7, byte r8) {
            /*
                int r8 = r8 * 4
                int r8 = 4 - r8
                int r6 = r6 + 99
                byte[] r0 = com.google.android.material.badge.BadgeState.State.$$c
                int r7 = r7 * 4
                int r1 = 1 - r7
                byte[] r1 = new byte[r1]
                r2 = 0
                int r7 = 0 - r7
                if (r0 != 0) goto L16
                r3 = r8
                r4 = r2
                goto L2d
            L16:
                r3 = r2
                r5 = r8
                r8 = r6
                r6 = r5
            L1a:
                byte r4 = (byte) r8
                r1[r3] = r4
                if (r3 != r7) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L25:
                int r3 = r3 + 1
                r4 = r0[r6]
                r5 = r3
                r3 = r6
                r6 = r4
                r4 = r5
            L2d:
                int r8 = r8 + r6
                int r6 = r3 + 1
                r3 = r4
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.badge.BadgeState.State.$$g(short, short, byte):java.lang.String");
        }
    }

    private TypedArray generateTypedArray(Context context, int i, int i2, int i3) {
        int styleAttribute;
        int i4;
        int i5 = 2 % 2;
        int i6 = b + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        AttributeSet drawableXml = null;
        if (i6 % 2 == 0) {
            throw null;
        }
        if (i != 0) {
            drawableXml = DrawableUtils.parseDrawableXml(context, i, BADGE_RESOURCE_TAG);
            styleAttribute = drawableXml.getStyleAttribute();
        } else {
            styleAttribute = 0;
        }
        AttributeSet attributeSet = drawableXml;
        if (styleAttribute != 0) {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
            b = i7 % 128;
            int i8 = i7 % 2;
            i4 = styleAttribute;
        } else {
            i4 = i3;
        }
        return ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R.styleable.Badge, i2, i4, new int[0]);
    }

    final State getOverridingState() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            return this.overridingState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final boolean isVisible() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
        b = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = State.access$800(this.currentState).booleanValue();
        int i4 = b + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    final void setVisible(boolean z) {
        int i = 2 % 2;
        int i2 = b + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        State.access$802(this.overridingState, Boolean.valueOf(z));
        State.access$802(this.currentState, Boolean.valueOf(z));
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 43;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    final boolean hasNumber() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
        b = i2 % 128;
        int i3 = i2 % 2;
        if (State.access$200(this.currentState) == -1) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
            b = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 28 / 0;
            }
            return false;
        }
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
        if (i9 % 2 != 0) {
            return true;
        }
        throw null;
    }

    final int getNumber() {
        int i = 2 % 2;
        int i2 = b + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        State state = this.currentState;
        if (i3 != 0) {
            return State.access$200(state);
        }
        State.access$200(state);
        throw null;
    }

    final void setNumber(int i) {
        int i2 = 2 % 2;
        int i3 = b + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            State.access$202(this.overridingState, i);
            State.access$202(this.currentState, i);
        } else {
            State.access$202(this.overridingState, i);
            State.access$202(this.currentState, i);
            throw null;
        }
    }

    final void clearNumber() {
        int i = 2 % 2;
        int i2 = b + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        setNumber(-1);
        int i4 = b + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r2v58, types: [boolean, int] */
    final boolean hasText() throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
        b = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (29944 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
            int capsMode = TextUtils.getCapsMode("", 0, 0) + 1755;
            int iRed = Color.red(0) + 23;
            byte b2 = $$a[7];
            Object[] objArr = new Object[1];
            a((byte) 37, b2, (short) (b2 | 37), objArr);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, capsMode, iRed, 986134021, false, (String) objArr[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr2 = new Object[1];
        c(true, View.resolveSizeAndState(0, 0, 0) + 99, 21 - TextUtils.lastIndexOf("", '0'), 20 - Process.getGidForName(""), new char[]{0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b'}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        c(false, 103 - TextUtils.getOffsetAfter("", 0), 15 - Color.blue(0), 2 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), new char[]{6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2}, objArr3);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cMyTid = (char) (29944 - (Process.myTid() >> 22));
            int keyRepeatDelay = 1755 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
            int i4 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 22;
            byte b3 = (byte) ($$b << 1);
            byte b4 = $$a[7];
            Object[] objArr4 = new Object[1];
            a(b3, b4, b4, objArr4);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyTid, keyRepeatDelay, i4, 1596667560, false, (String) objArr4[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 29943);
                int longPressTimeout = 1755 - (ViewConfiguration.getLongPressTimeout() >> 16);
                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 24;
                byte b5 = (byte) ($$b << 1);
                byte b6 = $$a[7];
                Object[] objArr5 = new Object[1];
                a(b5, b6, (short) (b6 | 89), objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, longPressTimeout, modifierMetaStateMask, 1599039318, false, (String) objArr5[0], null);
            }
            Object[] objArr6 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = new Object[]{new int[]{((int[]) objArr6[0])[0]}, new int[]{((int[]) objArr6[1])[0]}, (Object[]) objArr6[2], new int[1], (String[]) objArr6[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = (((-750631223) + (((~((-533871577) | iIdentityHashCode)) | 214962752) * 1504)) + ((~(iIdentityHashCode | (-318908825))) * (-1504))) - 1873022126;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr7 = new Object[1];
            c(false, 97 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 16 - KeyEvent.normalizeMetaState(0), 8 - TextUtils.getTrimmedLength(""), new char[]{5, 65484, 65521, 23, 17, 18, 3, 11, '\b', 65535, 20, 65535, 65484, '\n', 65535, '\f'}, objArr7);
            Class<?> cls2 = Class.forName((String) objArr7[0]);
            Object[] objArr8 = new Object[1];
            c(false, ExpandableListView.getPackedPositionGroup(0L) + 102, 15 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 15 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), new char[]{65535, '\b', 14, 3, 14, 19, 65506, 65531, '\r', 2, 65501, '\t', 65534, 65535, 3, 65534}, objArr8);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr9 = {2076320413};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (42049 - View.MeasureSpec.makeMeasureSpec(0, 0)), 1726 - View.resolveSizeAndState(0, 0, 0), 29 - TextUtils.indexOf("", "", 0), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = ActivityLoginBinding.TuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr9), -1654823966);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 29944);
                    int i8 = 1756 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    int iAlpha = Color.alpha(0) + 23;
                    byte b7 = (byte) ($$b << 1);
                    byte b8 = $$a[7];
                    Object[] objArr10 = new Object[1];
                    a(b7, b8, (short) (b8 | 89), objArr10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(jumpTapTimeout, i8, iAlpha, 1599039318, false, (String) objArr10[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da);
                try {
                    Object[] objArr11 = new Object[1];
                    c(true, (ViewConfiguration.getTouchSlop() >> 8) + 99, TextUtils.indexOf("", "", 0) + 22, ((byte) KeyEvent.getModifierMetaStateMask()) + 22, new char[]{0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b'}, objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    c(false, (Process.myPid() >> 22) + 103, TextUtils.getOffsetBefore("", 0) + 15, 3 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), new char[]{6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2}, objArr12);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 29944);
                        int i9 = 1755 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int modifierMetaStateMask2 = 22 - ((byte) KeyEvent.getModifierMetaStateMask());
                        byte b9 = (byte) ($$b << 1);
                        byte b10 = $$a[7];
                        Object[] objArr13 = new Object[1];
                        a(b9, b10, b10, objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(pressedStateDuration, i9, modifierMetaStateMask2, 1596667560, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 29944);
                        int iLastIndexOf = 1754 - TextUtils.lastIndexOf("", '0');
                        int i10 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 22;
                        byte b11 = $$a[7];
                        Object[] objArr14 = new Object[1];
                        a((byte) 37, b11, (short) (b11 | 37), objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cCombineMeasuredStates, iLastIndexOf, i10, 986134021, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
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
        if (((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0] != ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4];
            if (strArr == null) {
                throw null;
            }
            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
            b = i11 % 128;
            int i12 = i11 % 2;
            for (String str : strArr) {
                int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
                b = i13 % 128;
                int i14 = i13 % 2;
                arrayList.add(str);
            }
            throw null;
        }
        int i15 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
        Object[] objArr15 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i16 = ~iIdentityHashCode2;
        int i17 = i15 + (-815075906) + (((~(687671493 | i16)) | (~((-139724801) | iIdentityHashCode2))) * (-831)) + ((~(1039998719 | iIdentityHashCode2)) * (-1662)) + (((~(iIdentityHashCode2 | (-687671494))) | (~(i16 | (-900273920))) | (~(900273919 | iIdentityHashCode2))) * 831);
        int i18 = (i17 << 13) ^ i17;
        int i19 = i18 ^ (i18 >>> 17);
        ((int[]) objArr15[3])[0] = i19 ^ (i19 << 5);
        int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 31;
        b = i20 % 128;
        if (i20 % 2 != 0) {
            State.access$300(this.currentState);
            throw null;
        }
        if (State.access$300(this.currentState) == null) {
            return false;
        }
        int i21 = ((int[]) objArr15[3])[0];
        int i22 = i21 * i21;
        int i23 = -(657506366 * i21);
        int i24 = (((i22 ^ i23) + ((i22 & i23) << 1)) - (~(-(i21 * 1228273990)))) - 1;
        int i25 = ((i24 | (-152567036)) << 1) - ((-152567036) ^ i24);
        int i26 = i25 >> 24;
        int i27 = (((i26 & (-511)) + (i26 | (-511))) / 256) + 1;
        int i28 = -(((i25 & i27) + (i27 | i25)) ^ ((((i25 >> 17) - 65535) / 32768) + 1));
        int i29 = (i28 ^ 6) + ((i28 & 6) << 1);
        int i30 = ((i29 >> 20) - 8191) / 4096;
        int i31 = (i30 ^ 1) + ((i30 & 1) << 1);
        ?? r2 = 528 / (((-((i31 & 1) + (i31 | 1))) & i29) * 88);
        int i32 = b + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i32 % 128;
        if (i32 % 2 == 0) {
            int i33 = 68 / 0;
        }
        return r2;
    }

    final String getText() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
        b = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            State.access$300(this.currentState);
            obj.hashCode();
            throw null;
        }
        String strAccess$300 = State.access$300(this.currentState);
        int i3 = b + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            return strAccess$300;
        }
        obj.hashCode();
        throw null;
    }

    final void setText(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
        b = i2 % 128;
        int i3 = i2 % 2;
        State.access$302(this.overridingState, str);
        State.access$302(this.currentState, str);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    final void clearText() {
        int i = 2 % 2;
        int i2 = b + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        setText(null);
        int i4 = b + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    final int getAlpha() {
        int i = 2 % 2;
        int i2 = b + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return State.access$100(this.currentState);
        }
        int i3 = 2 / 0;
        return State.access$100(this.currentState);
    }

    final void setAlpha(int i) {
        int i2 = 2 % 2;
        int i3 = b + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        State.access$102(this.overridingState, i);
        State.access$102(this.currentState, i);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final int getMaxCharacterCount() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
        b = i2 % 128;
        int i3 = i2 % 2;
        State state = this.currentState;
        if (i3 == 0) {
            return State.access$900(state);
        }
        State.access$900(state);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final void setMaxCharacterCount(int i) {
        int i2 = 2 % 2;
        int i3 = b + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        State.access$902(this.overridingState, i);
        State.access$902(this.currentState, i);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 69;
        b = i5 % 128;
        int i6 = i5 % 2;
    }

    final int getMaxNumber() {
        int i = 2 % 2;
        int i2 = b + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            State.access$1000(this.currentState);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iAccess$1000 = State.access$1000(this.currentState);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
        b = i3 % 128;
        int i4 = i3 % 2;
        return iAccess$1000;
    }

    final void setMaxNumber(int i) {
        int i2 = 2 % 2;
        int i3 = b + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        State.access$1002(this.overridingState, i);
        State.access$1002(this.currentState, i);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 27 / 0;
        }
    }

    final int getBackgroundColor() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
        b = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = State.access$1500(this.currentState).intValue();
        int i4 = b + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return iIntValue;
    }

    final void setBackgroundColor(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            State.access$1502(this.overridingState, Integer.valueOf(i));
            State.access$1502(this.currentState, Integer.valueOf(i));
            int i4 = 41 / 0;
        } else {
            State.access$1502(this.overridingState, Integer.valueOf(i));
            State.access$1502(this.currentState, Integer.valueOf(i));
        }
        int i5 = b + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
    }

    final int getBadgeTextColor() {
        int i = 2 % 2;
        int i2 = b + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            State.access$1700(this.currentState).intValue();
            obj.hashCode();
            throw null;
        }
        int iIntValue = State.access$1700(this.currentState).intValue();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            return iIntValue;
        }
        obj.hashCode();
        throw null;
    }

    final void setBadgeTextColor(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            State.access$1702(this.overridingState, Integer.valueOf(i));
            State.access$1702(this.currentState, Integer.valueOf(i));
        } else {
            State.access$1702(this.overridingState, Integer.valueOf(i));
            State.access$1702(this.currentState, Integer.valueOf(i));
            int i4 = 90 / 0;
        }
    }

    final int getTextAppearanceResId() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            State.access$1600(this.currentState).intValue();
            throw null;
        }
        int iIntValue = State.access$1600(this.currentState).intValue();
        int i3 = b + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        return iIntValue;
    }

    final void setTextAppearanceResId(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            State.access$1602(this.overridingState, Integer.valueOf(i));
            State.access$1602(this.currentState, Integer.valueOf(i));
        } else {
            State.access$1602(this.overridingState, Integer.valueOf(i));
            State.access$1602(this.currentState, Integer.valueOf(i));
            int i4 = 77 / 0;
        }
    }

    final int getBadgeShapeAppearanceResId() {
        int iIntValue;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            iIntValue = State.access$1100(this.currentState).intValue();
            int i3 = 72 / 0;
        } else {
            iIntValue = State.access$1100(this.currentState).intValue();
        }
        int i4 = b + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return iIntValue;
        }
        throw null;
    }

    final void setBadgeShapeAppearanceResId(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            State.access$1102(this.overridingState, Integer.valueOf(i));
            State.access$1102(this.currentState, Integer.valueOf(i));
        } else {
            State.access$1102(this.overridingState, Integer.valueOf(i));
            State.access$1102(this.currentState, Integer.valueOf(i));
            throw null;
        }
    }

    final int getBadgeShapeAppearanceOverlayResId() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
        b = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = State.access$1200(this.currentState).intValue();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
        b = i4 % 128;
        int i5 = i4 % 2;
        return iIntValue;
    }

    final void setBadgeShapeAppearanceOverlayResId(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
        b = i3 % 128;
        int i4 = i3 % 2;
        State.access$1202(this.overridingState, Integer.valueOf(i));
        State.access$1202(this.currentState, Integer.valueOf(i));
        int i5 = b + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 43 / 0;
        }
    }

    final int getBadgeWithTextShapeAppearanceResId() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
        b = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = State.access$1300(this.currentState).intValue();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return iIntValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x024b  */
    final void setBadgeWithTextShapeAppearanceResId(int i) {
        Object[] objArr;
        int i2 = 2 % 2;
        State.access$1302(this.overridingState, Integer.valueOf(i));
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
            int scrollDefaultDelay = 876 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            int iAxisFromString = MotionEvent.axisFromString("") + 11;
            byte b2 = $$a[7];
            Object[] objArr2 = new Object[1];
            a((byte) 37, b2, (short) (b2 | 37), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMakeMeasureSpec, scrollDefaultDelay, iAxisFromString, -1650998592, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(true, (Process.myPid() >> 22) + 99, TextUtils.indexOf((CharSequence) "", '0') + 23, ((byte) KeyEvent.getModifierMetaStateMask()) + 22, new char[]{0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b'}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(false, 103 - TextUtils.getCapsMode("", 0, 0), 15 - TextUtils.getOffsetAfter("", 0), 2 - Drawable.resolveOpacity(0, 0), new char[]{6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 876;
            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 10;
            byte b3 = (byte) ($$b << 1);
            byte b4 = $$a[7];
            Object[] objArr5 = new Object[1];
            a(b3, b4, (short) (b4 | 89), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveOpacity, fadingEdgeLength, iResolveOpacity, 2012020043, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                int bitsPerPixel = 875 - ImageFormat.getBitsPerPixel(0);
                int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 10;
                byte b5 = (byte) ($$b << 1);
                byte b6 = $$a[7];
                Object[] objArr6 = new Object[1];
                a(b5, b6, (short) (b6 | 141), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cCombineMeasuredStates, bitsPerPixel, longPressTimeout, 2012931276, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[]{i ^ (i << 5)}, new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int i3 = ~(268130159 | i);
            int i4 = (((79070740 + ((174080256 | i3) * (-476))) + (i3 * 952)) + ((~((~i) | 268130159)) * 476)) - 1805183548;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
            b = i7 % 128;
            int i8 = i7 % 2;
        } else {
            Object[] objArr8 = new Object[1];
            c(true, 98 - TextUtils.indexOf((CharSequence) "", '0', 0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 25, 18 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), new char[]{6, 19, 6, 17, 0, 65502, 65483, '\r', '\r', 65534, 65483, 1, 6, '\f', 15, 1, 11, 65534, 1, 65534, 2, 15, 5, 65521, 22, 17}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(false, ExpandableListView.getPackedPositionChild(0L) + 107, 17 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 17 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{11, '\b', '\b', 65531, 4, '\n', 65495, 6, 6, 2, 65535, 65529, 65527, '\n', 65535, 5, 4, 65529}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
                    b = i9 % 128;
                    if (i9 % 2 != 0) {
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
            int i10 = b + 43;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
            int i11 = i10 % 2;
            try {
                Object[] objArr10 = {applicationContext, Integer.valueOf(i), 0, -1805183548};
                byte[] bArr = $$d;
                Object[] objArr11 = new Object[1];
                d(bArr[8], bArr[13], bArr[95], objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b7 = (byte) (-bArr[7]);
                byte b8 = bArr[30];
                Object[] objArr12 = new Object[1];
                d(b7, b8, (byte) (b8 | 25), objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                if (applicationContext != null) {
                    int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
                    b = i12 % 128;
                    int i13 = i12 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int iGreen = 876 - Color.green(0);
                        int i14 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 9;
                        byte b9 = (byte) ($$b << 1);
                        byte b10 = $$a[7];
                        Object[] objArr13 = new Object[1];
                        a(b9, b10, (short) (b10 | 141), objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(windowTouchSlop, iGreen, i14, 2012931276, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr14 = new Object[1];
                        c(true, 99 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getEdgeSlop() >> 16) + 22, TextUtils.lastIndexOf("", '0', 0) + 22, new char[]{0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b'}, objArr14);
                        Class<?> cls4 = Class.forName((String) objArr14[0]);
                        Object[] objArr15 = new Object[1];
                        c(false, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 103, Color.blue(0) + 15, 2 - (ViewConfiguration.getTapTimeout() >> 16), new char[]{6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2}, objArr15);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                            int doubleTapTimeout = 876 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            int iAxisFromString2 = 9 - MotionEvent.axisFromString("");
                            byte b11 = (byte) ($$b << 1);
                            byte b12 = $$a[7];
                            Object[] objArr16 = new Object[1];
                            a(b11, b12, (short) (b12 | 89), objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cLastIndexOf, doubleTapTimeout, iAxisFromString2, 2012020043, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            int scrollBarSize = 876 - (ViewConfiguration.getScrollBarSize() >> 8);
                            int iIndexOf = 10 - TextUtils.indexOf("", "", 0, 0);
                            byte b13 = $$a[7];
                            Object[] objArr17 = new Object[1];
                            a((byte) 37, b13, (short) (b13 | 37), objArr17);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, scrollBarSize, iIndexOf, -1650998592, false, (String) objArr17[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        int i15 = b + 109;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15 % 128;
                        int i16 = i15 % 2;
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i17 = ((int[]) objArr[2])[0];
        int i18 = ((int[]) objArr[0])[0];
        if (i18 != i17) {
            throw new RuntimeException(String.valueOf(i18));
        }
        int i19 = b + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19 % 128;
        int i20 = i19 % 2;
        int i21 = ((int[]) objArr[1])[0];
        Object[] objArr18 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int i22 = ~System.identityHashCode(this);
        int i23 = ~(738661252 | i22);
        int i24 = i21 + (-629701052) + ((i23 | (-698351024)) * 764) + (((~(i22 | (-698351024))) | 671551876) * (-1528)) + (((-93908524) | i23) * 764);
        int i25 = (i24 << 13) ^ i24;
        int i26 = i25 ^ (i25 >>> 17);
        ((int[]) objArr18[1])[0] = i26 ^ (i26 << 5);
        State.access$1302(this.currentState, Integer.valueOf(i));
    }

    final int getBadgeWithTextShapeAppearanceOverlayResId() {
        int i = 2 % 2;
        int i2 = b + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = State.access$1400(this.currentState).intValue();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
        b = i4 % 128;
        int i5 = i4 % 2;
        return iIntValue;
    }

    final void setBadgeWithTextShapeAppearanceOverlayResId(int i) {
        int i2 = 2 % 2;
        int i3 = b + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            State.access$1402(this.overridingState, Integer.valueOf(i));
            State.access$1402(this.currentState, Integer.valueOf(i));
            throw null;
        }
        State.access$1402(this.overridingState, Integer.valueOf(i));
        State.access$1402(this.currentState, Integer.valueOf(i));
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    final int getBadgeGravity() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
        b = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = State.access$1800(this.currentState).intValue();
        int i4 = b + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return iIntValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final void setBadgeGravity(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            State.access$1802(this.overridingState, Integer.valueOf(i));
            State.access$1802(this.currentState, Integer.valueOf(i));
        } else {
            State.access$1802(this.overridingState, Integer.valueOf(i));
            State.access$1802(this.currentState, Integer.valueOf(i));
            throw null;
        }
    }

    final int getBadgeHorizontalPadding() {
        int iIntValue;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            iIntValue = State.access$1900(this.currentState).intValue();
            int i3 = 37 / 0;
        } else {
            iIntValue = State.access$1900(this.currentState).intValue();
        }
        int i4 = b + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return iIntValue;
        }
        throw null;
    }

    final void setBadgeHorizontalPadding(int i) {
        int i2 = 2 % 2;
        int i3 = b + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            State.access$1902(this.overridingState, Integer.valueOf(i));
            State.access$1902(this.currentState, Integer.valueOf(i));
        } else {
            State.access$1902(this.overridingState, Integer.valueOf(i));
            State.access$1902(this.currentState, Integer.valueOf(i));
            throw null;
        }
    }

    final int getBadgeVerticalPadding() {
        int i = 2 % 2;
        int i2 = b + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = State.access$2000(this.currentState).intValue();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return iIntValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final void setBadgeVerticalPadding(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            State.access$2002(this.overridingState, Integer.valueOf(i));
            State.access$2002(this.currentState, Integer.valueOf(i));
            throw null;
        }
        State.access$2002(this.overridingState, Integer.valueOf(i));
        State.access$2002(this.currentState, Integer.valueOf(i));
        int i4 = b + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    final int getHorizontalOffsetWithoutText() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            State.access$2100(this.currentState).intValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iIntValue = State.access$2100(this.currentState).intValue();
        int i3 = b + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        return iIntValue;
    }

    final void setHorizontalOffsetWithoutText(int i) {
        int i2 = 2 % 2;
        int i3 = b + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            State.access$2102(this.overridingState, Integer.valueOf(i));
            State.access$2102(this.currentState, Integer.valueOf(i));
        } else {
            State.access$2102(this.overridingState, Integer.valueOf(i));
            State.access$2102(this.currentState, Integer.valueOf(i));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    final int getVerticalOffsetWithoutText() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
        b = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = State.access$2200(this.currentState).intValue();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return iIntValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final void setVerticalOffsetWithoutText(int i) {
        int i2 = 2 % 2;
        int i3 = b + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        State.access$2202(this.overridingState, Integer.valueOf(i));
        State.access$2202(this.currentState, Integer.valueOf(i));
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
        b = i5 % 128;
        int i6 = i5 % 2;
    }

    final int getHorizontalOffsetWithText() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
        b = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = State.access$2300(this.currentState).intValue();
        int i4 = b + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return iIntValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final void setHorizontalOffsetWithText(int i) {
        int i2 = 2 % 2;
        int i3 = b + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            State.access$2302(this.overridingState, Integer.valueOf(i));
            State.access$2302(this.currentState, Integer.valueOf(i));
        } else {
            State.access$2302(this.overridingState, Integer.valueOf(i));
            State.access$2302(this.currentState, Integer.valueOf(i));
            throw null;
        }
    }

    final int getVerticalOffsetWithText() {
        int i = 2 % 2;
        int i2 = b + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Integer numAccess$2400 = State.access$2400(this.currentState);
        if (i3 != 0) {
            return numAccess$2400.intValue();
        }
        numAccess$2400.intValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final void setVerticalOffsetWithText(int i) {
        int i2 = 2 % 2;
        int i3 = b + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            State.access$2402(this.overridingState, Integer.valueOf(i));
            State.access$2402(this.currentState, Integer.valueOf(i));
        } else {
            State.access$2402(this.overridingState, Integer.valueOf(i));
            State.access$2402(this.currentState, Integer.valueOf(i));
            throw null;
        }
    }

    final int getLargeFontVerticalOffsetAdjustment() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
        b = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = State.access$2500(this.currentState).intValue();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 46 / 0;
        }
        return iIntValue;
    }

    final void setLargeFontVerticalOffsetAdjustment(int i) {
        int i2 = 2 % 2;
        int i3 = b + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        State.access$2502(this.overridingState, Integer.valueOf(i));
        State.access$2502(this.currentState, Integer.valueOf(i));
        int i5 = b + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 25 / 0;
        }
    }

    final int getAdditionalHorizontalOffset() {
        int i = 2 % 2;
        int i2 = b + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = State.access$2600(this.currentState).intValue();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
        b = i4 % 128;
        int i5 = i4 % 2;
        return iIntValue;
    }

    final void setAdditionalHorizontalOffset(int i) {
        int i2 = 2 % 2;
        int i3 = b + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            State.access$2602(this.overridingState, Integer.valueOf(i));
            State.access$2602(this.currentState, Integer.valueOf(i));
        } else {
            State.access$2602(this.overridingState, Integer.valueOf(i));
            State.access$2602(this.currentState, Integer.valueOf(i));
            throw null;
        }
    }

    final int getAdditionalVerticalOffset() {
        int i = 2 % 2;
        int i2 = b + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            State.access$2700(this.currentState).intValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iIntValue = State.access$2700(this.currentState).intValue();
        int i3 = b + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        return iIntValue;
    }

    final void setAdditionalVerticalOffset(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            State.access$2702(this.overridingState, Integer.valueOf(i));
            State.access$2702(this.currentState, Integer.valueOf(i));
        } else {
            State.access$2702(this.overridingState, Integer.valueOf(i));
            State.access$2702(this.currentState, Integer.valueOf(i));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    final CharSequence getContentDescriptionForText() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
        b = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequenceAccess$400 = State.access$400(this.currentState);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return charSequenceAccess$400;
        }
        throw null;
    }

    final void setContentDescriptionForText(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = b + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            State.access$402(this.overridingState, charSequence);
            State.access$402(this.currentState, charSequence);
            int i3 = 27 / 0;
        } else {
            State.access$402(this.overridingState, charSequence);
            State.access$402(this.currentState, charSequence);
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
    }

    final CharSequence getContentDescriptionNumberless() {
        int i = 2 % 2;
        int i2 = b + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            State.access$500(this.currentState);
            throw null;
        }
        CharSequence charSequenceAccess$500 = State.access$500(this.currentState);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 21;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            return charSequenceAccess$500;
        }
        obj.hashCode();
        throw null;
    }

    final void setContentDescriptionNumberless(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
        b = i2 % 128;
        int i3 = i2 % 2;
        State.access$502(this.overridingState, charSequence);
        State.access$502(this.currentState, charSequence);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 75;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    final int getContentDescriptionQuantityStrings() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 37567);
            int offsetAfter = 625 - TextUtils.getOffsetAfter("", 0);
            int iMyPid = (Process.myPid() >> 22) + 14;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            byte b3 = bArr[5];
            Object[] objArr2 = new Object[1];
            a(b2, b3, (short) (b3 | 140), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveSizeAndState, offsetAfter, iMyPid, -477065106, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(true, 99 - Color.argb(0, 0, 0, 0), KeyEvent.normalizeMetaState(0) + 22, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 20, new char[]{0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b'}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(false, 103 - Gravity.getAbsoluteGravity(0, 0), 15 - (ViewConfiguration.getTapTimeout() >> 16), TextUtils.getTrimmedLength("") + 2, new char[]{6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (37568 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
            int doubleTapTimeout = 625 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int i2 = 15 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            byte b4 = (byte) ($$b << 1);
            byte b5 = $$a[7];
            Object[] objArr5 = new Object[1];
            a(b4, b5, (short) (b5 | 141), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, doubleTapTimeout, i2, -976899241, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
            b = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cBlue = (char) (Color.blue(0) + 37567);
                int maximumDrawingCacheSize = 625 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int maxKeyCode = 14 - (KeyEvent.getMaxKeyCode() >> 16);
                byte b6 = (byte) ($$b << 1);
                byte b7 = $$a[7];
                Object[] objArr6 = new Object[1];
                a(b6, b7, (short) (b7 | 89), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cBlue, maximumDrawingCacheSize, maxKeyCode, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i5 = ((int[]) objArr7[2])[0];
            int i6 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i6};
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = ~iIdentityHashCode;
            int i8 = ((((-1323490124) + ((((~((-218106381) | i7)) | (~((-45188305) | iIdentityHashCode))) | (~((-1342337057) | iIdentityHashCode))) * 765)) + (((~((-263294685) | i7)) | 218106380) * 1530)) + (((~(iIdentityHashCode | (-263294685))) | (~(i7 | (-1342337057)))) * 765)) - 1119748957;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[1])[0] = i10 ^ (i10 << 5);
            objArr = new Object[]{iArr, new int[1], new int[]{i5}, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            c(true, Gravity.getAbsoluteGravity(0, 0) + 99, TextUtils.getOffsetAfter("", 0) + 26, (ViewConfiguration.getTapTimeout() >> 16) + 18, new char[]{6, 19, 6, 17, 0, 65502, 65483, '\r', '\r', 65534, 65483, 1, 6, '\f', 15, 1, 11, 65534, 1, 65534, 2, 15, 5, 65521, 22, 17}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(false, 106 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 18 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 17 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), new char[]{11, '\b', '\b', 65531, 4, '\n', 65495, 6, 6, 2, 65535, 65529, 65527, '\n', 65535, 5, 4, 65529}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i11 = b + 59;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
                int i12 = i11 % 2;
                applicationContext = (!((applicationContext instanceof ContextWrapper) ^ true) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(false, Gravity.getAbsoluteGravity(0, 0) + 98, 16 - View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 8, new char[]{5, 65484, 65521, 23, 17, 18, 3, 11, '\b', 65535, 20, 65535, 65484, '\n', 65535, '\f'}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(false, 103 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 16 - (ViewConfiguration.getDoubleTapTimeout() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 14, new char[]{65535, '\b', 14, 3, 14, 19, 65506, 65531, '\r', 2, 65501, '\t', 65534, 65535, 3, 65534}, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr12 = new Object[1];
            c(false, 73 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), Color.alpha(0) + 64, 55 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), new char[]{65520, 29, 29, 65516, 28, 28, 24, 65516, 65518, 65512, 65517, 28, 65516, 65518, 65518, 25, 28, 65518, 25, 65512, 65514, 27, 65515, 65520, 65520, 24, 65513, 65520, 65512, 65512, 65519, 24, 29, 65516, 65515, 65519, 29, 28, 65514, 65516, 24, 65511, 65519, 24, 65515, 65519, 65513, 25, 65520, 65519, 65515, 25, 25, 29, 65513, 25, 65513, 28, 29, 24, 24, 25, 29, 65517}, objArr12);
            String str = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            c(true, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 69, 64 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 6 - (ViewConfiguration.getJumpTapTimeout() >> 16), new char[]{65520, 65515, 65521, 31, 28, 30, '!', 65521, 65515, 28, 65519, 65517, '!', 30, 65517, 65518, 65519, 29, 65524, 65524, 30, 65524, 65518, 65518, 65519, 65522, 65521, '!', ' ', 65517, 65517, 28, ' ', 65519, 65516, 65520, 29, 65524, 65523, 65524, 65524, 65518, 65524, 29, 65519, 29, 65521, '!', 65522, 65520, 65518, 65521, 65518, 65517, 65519, '!', 65517, ' ', 29, 65515, '!', ' ', 65522, 29}, objArr13);
            try {
                Object[] objArr14 = {applicationContext, new String[]{str, (String) objArr13[0]}, Integer.valueOf(iIntValue), 17, -1119748957};
                byte[] bArr2 = $$d;
                byte b8 = bArr2[30];
                byte b9 = b8;
                Object[] objArr15 = new Object[1];
                d(b9, (byte) (b9 | 119), b8, objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                Object[] objArr16 = new Object[1];
                d((byte) (-bArr2[7]), (byte) (bArr2[0] + 1), (byte) 25, objArr16);
                Object[] objArr17 = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                int i13 = ((int[]) objArr17[0])[0];
                int i14 = ((int[]) objArr17[2])[0];
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char packedPositionGroup = (char) (37567 - ExpandableListView.getPackedPositionGroup(0L));
                        int i15 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 624;
                        int i16 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 13;
                        byte b10 = (byte) ($$b << 1);
                        byte b11 = $$a[7];
                        Object[] objArr18 = new Object[1];
                        a(b10, b11, (short) (b11 | 89), objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionGroup, i15, i16, -973632554, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr17);
                    try {
                        Object[] objArr19 = new Object[1];
                        c(true, 99 - View.combineMeasuredStates(0, 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 21, new char[]{0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b'}, objArr19);
                        Class<?> cls5 = Class.forName((String) objArr19[0]);
                        Object[] objArr20 = new Object[1];
                        c(false, 103 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 14 - TextUtils.lastIndexOf("", '0', 0), 2 - View.MeasureSpec.getMode(0), new char[]{6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2}, objArr20);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr20[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c2 = (char) (37566 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                            int iIndexOf = 624 - TextUtils.indexOf((CharSequence) "", '0');
                            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 14;
                            byte b12 = (byte) ($$b << 1);
                            byte b13 = $$a[7];
                            Object[] objArr21 = new Object[1];
                            a(b12, b13, (short) (b13 | 141), objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, iIndexOf, keyRepeatDelay, -976899241, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 37568);
                            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 625;
                            int maxKeyCode2 = (KeyEvent.getMaxKeyCode() >> 16) + 14;
                            byte[] bArr3 = $$a;
                            byte b14 = bArr3[7];
                            byte b15 = bArr3[5];
                            Object[] objArr22 = new Object[1];
                            a(b14, b15, (short) (b15 | 140), objArr22);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cLastIndexOf, jumpTapTimeout, maxKeyCode2, -477065106, false, (String) objArr22[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
                        b = i17 % 128;
                        int i18 = i17 % 2;
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
        int i19 = ((int[]) objArr[0])[0];
        int i20 = ((int[]) objArr[2])[0];
        if (i20 != i19) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[3];
            if (strArr2 != null) {
                int i21 = b + 47;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i21 % 128;
                int i22 = i21 % 2;
                for (String str2 : strArr2) {
                    arrayList.add(str2);
                }
            }
            throw new RuntimeException(String.valueOf(i20));
        }
        int i23 = ((int[]) objArr[1])[0];
        int i24 = ((int[]) objArr[2])[0];
        int i25 = ((int[]) objArr[0])[0];
        String[] strArr3 = (String[]) objArr[3];
        int[] iArr2 = {i24};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i26 = i23 + (-300688064) + (((~((-112204695) | iIdentityHashCode2)) | 100665618) * 345) + (((~((-112204695) | (~iIdentityHashCode2))) | 1610867808) * 345) + ((~(iIdentityHashCode2 | (-100665619))) * 345);
        int i27 = (i26 << 13) ^ i26;
        int i28 = i27 ^ (i27 >>> 17);
        ((int[]) objArr[1])[0] = i28 ^ (i28 << 5);
        Object[] objArr23 = {new int[]{i25}, new int[1], iArr2, strArr3};
        int i29 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
        b = i29 % 128;
        if (i29 % 2 == 0) {
            return State.access$600(this.currentState);
        }
        int i30 = 84 / 0;
        return State.access$600(this.currentState);
    }

    final void setContentDescriptionQuantityStringsResource(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
        b = i3 % 128;
        int i4 = i3 % 2;
        State.access$602(this.overridingState, i);
        State.access$602(this.currentState, i);
        int i5 = b + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    final int getContentDescriptionExceedsMaxBadgeNumberStringResource() {
        int i = 2 % 2;
        int i2 = b + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        State state = this.currentState;
        if (i3 != 0) {
            return State.access$700(state);
        }
        State.access$700(state);
        throw null;
    }

    final void setContentDescriptionExceedsMaxBadgeNumberStringResource(int i) {
        int i2 = 2 % 2;
        int i3 = b + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            State.access$702(this.overridingState, i);
            State.access$702(this.currentState, i);
            throw null;
        }
        State.access$702(this.overridingState, i);
        State.access$702(this.currentState, i);
        int i4 = b + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    final Locale getNumberLocale() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
        b = i2 % 128;
        int i3 = i2 % 2;
        Locale localeAccess$2900 = State.access$2900(this.currentState);
        if (i3 != 0) {
            int i4 = 94 / 0;
        }
        return localeAccess$2900;
    }

    final void setNumberLocale(Locale locale) {
        int i = 2 % 2;
        int i2 = b + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        State.access$2902(this.overridingState, locale);
        State.access$2902(this.currentState, locale);
        int i4 = b + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 95 / 0;
        }
    }

    final boolean isAutoAdjustedToGrandparentBounds() {
        int i = 2 % 2;
        int i2 = b + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = State.access$2800(this.currentState).booleanValue();
        int i4 = b + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    final void setAutoAdjustToGrandparentBounds(boolean z) {
        int i = 2 % 2;
        int i2 = b + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            State.access$2802(this.overridingState, Boolean.valueOf(z));
            State.access$2802(this.currentState, Boolean.valueOf(z));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        State.access$2802(this.overridingState, Boolean.valueOf(z));
        State.access$2802(this.currentState, Boolean.valueOf(z));
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 21 / 0;
        }
    }

    private static int readColorFromAttributes(Context context, TypedArray typedArray, int i) {
        int i2 = 2 % 2;
        int i3 = b + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        int defaultColor = MaterialResources.getColorStateList(context, typedArray, i).getDefaultColor();
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
        b = i5 % 128;
        int i6 = i5 % 2;
        return defaultColor;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, byte r7, byte r8) {
        /*
            int r8 = r8 * 3
            int r0 = r8 + 1
            int r6 = r6 + 119
            int r7 = r7 * 4
            int r7 = r7 + 4
            byte[] r1 = com.google.android.material.badge.BadgeState.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r6 = r7
            r3 = r8
            r4 = r2
            goto L28
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            r3 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L28:
            int r3 = -r3
            int r7 = r7 + r3
            int r6 = r6 + 1
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.badge.BadgeState.$$g(short, byte, byte):java.lang.String");
    }
}
