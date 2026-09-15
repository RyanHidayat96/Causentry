package com.google.android.material.navigationrail;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import androidx.appcompat.widget.TintTypedArray;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.resources.MaterialResources;
import defpackage.initSession;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes6.dex */
public class NavigationRailView extends NavigationBarView {
    private static final int DEFAULT_HEADER_GRAVITY = 49;
    static final int DEFAULT_MENU_GRAVITY = 49;
    static final int MAX_ITEM_COUNT = 7;
    static final int NO_ITEM_MINIMUM_HEIGHT = -1;
    private View headerView;
    private Boolean paddingBottomSystemWindowInsets;
    private Boolean paddingStartSystemWindowInsets;
    private Boolean paddingTopSystemWindowInsets;
    private final int topMargin;
    private static final byte[] $$l = {86, -48, ByteCompanionObject.MIN_VALUE, 88};
    private static final int $$m = 14;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {87, -91, 60, 112, -4, 11, 11, 19, 10, -6, 22, -38, 39, 21, 1, 22, -8, -52, 57, 42, -3, 20, -2, 15, 8, -21, 26, 33, -3, 1, 18, 15, -37, 53, -8, 15, 15, 1, 18, 15, -9, 16, 14, -1, 14, 14, 2, -21, 46, 1, 15, -2, 28, -6, 22, -56, 42, -3, 20, -2, 15, 8, -21, 26, 33, -3, 1, 18, 15, -37, 53, -8, 15, 15, 1, 18, 15, 8, 6, -2, 7, 15, 1, 20, 6, 14, 7, 6, 14, 0, 8, 27, -4, 5, 27, -33, 43, -2, 10, 16, 1, 10, 10, 4, 29, 0, 17, -57};
    private static final int $$k = 201;
    private static final byte[] $$d = {110, -73, -111, 99, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$e = 109;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -83722491;

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void g(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.android.material.navigationrail.NavigationRailView.$$d
            int r8 = r8 * 14
            int r8 = 98 - r8
            int r1 = r6 + 1
            int r7 = r7 * 52
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r7 = r7 + 1
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-10)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigationrail.NavigationRailView.g(byte, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void i(int r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 52
            int r6 = 55 - r6
            int r7 = r7 * 2
            int r7 = 53 - r7
            int r5 = r5 * 30
            int r5 = r5 + 84
            byte[] r0 = com.google.android.material.navigationrail.NavigationRailView.$$j
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r5
            r5 = r7
            r3 = r2
            goto L2b
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r5
            int r6 = r6 + 1
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L29
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L29:
            r4 = r0[r6]
        L2b:
            int r5 = r5 + r4
            int r5 = r5 + (-9)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigationrail.NavigationRailView.i(int, byte, int, java.lang.Object[]):void");
    }

    static /* synthetic */ Boolean access$000(NavigationRailView navigationRailView) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        Boolean bool = navigationRailView.paddingTopSystemWindowInsets;
        int i5 = i3 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return bool;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ boolean access$100(NavigationRailView navigationRailView, Boolean bool) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        boolean zShouldApplyWindowInsetPadding = navigationRailView.shouldApplyWindowInsetPadding(bool);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return zShouldApplyWindowInsetPadding;
    }

    static /* synthetic */ Boolean access$200(NavigationRailView navigationRailView) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 117;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        Boolean bool = navigationRailView.paddingBottomSystemWindowInsets;
        int i5 = i3 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    static /* synthetic */ Boolean access$300(NavigationRailView navigationRailView) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        Boolean bool = navigationRailView.paddingStartSystemWindowInsets;
        int i5 = i3 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public /* bridge */ /* synthetic */ NavigationBarMenuView createNavigationBarMenuView(Context context) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return createNavigationBarMenuView(context);
        }
        createNavigationBarMenuView(context);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public NavigationRailView(Context context) {
        this(context, null);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.navigationRailStyle);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R.style.Widget_MaterialComponents_NavigationRailView);
    }

    private static void h(char[] cArr, boolean z, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i) {
            int i5 = $11 + 105;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i2 + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i7 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 3291 - Color.argb(0, 0, 0, 0), View.resolveSize(0, 0) + 31, 1199271174, false, $$n(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), TextUtils.getOffsetAfter("", 0) + 651, View.getDefaultSize(0, 0) + 44, -450685997, false, $$n(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
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
            int i8 = $11 + 29;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            char[] cArr4 = new char[i];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i) {
                int i10 = $11 + 5;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i >>> setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) Color.argb(0, 0, 0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 651, TextUtils.getOffsetBefore("", 0) + 44, -450685997, false, $$n(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } else {
                    cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                    Object[] objArr5 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = (byte) (b7 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getEdgeSlop() >> 16), 651 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), TextUtils.indexOf("", "") + 44, -450685997, false, $$n(b7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object obj = null;
        this.paddingTopSystemWindowInsets = null;
        this.paddingBottomSystemWindowInsets = null;
        this.paddingStartSystemWindowInsets = null;
        this.topMargin = getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_rail_margin);
        Context context2 = getContext();
        TintTypedArray tintTypedArrayObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, R.styleable.NavigationRailView, i, i2, new int[0]);
        int resourceId = tintTypedArrayObtainTintedStyledAttributes.getResourceId(R.styleable.NavigationRailView_headerLayout, 0);
        if (resourceId != 0) {
            addHeaderView(resourceId);
        }
        setMenuGravity(tintTypedArrayObtainTintedStyledAttributes.getInt(R.styleable.NavigationRailView_menuGravity, 49));
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(R.styleable.NavigationRailView_itemMinHeight)) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            if (i3 % 2 != 0) {
                setItemMinimumHeight(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(R.styleable.NavigationRailView_itemMinHeight, -1));
                obj.hashCode();
                throw null;
            }
            setItemMinimumHeight(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(R.styleable.NavigationRailView_itemMinHeight, -1));
        }
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(R.styleable.NavigationRailView_paddingTopSystemWindowInsets)) {
            this.paddingTopSystemWindowInsets = Boolean.valueOf(tintTypedArrayObtainTintedStyledAttributes.getBoolean(R.styleable.NavigationRailView_paddingTopSystemWindowInsets, false));
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(R.styleable.NavigationRailView_paddingBottomSystemWindowInsets)) {
            this.paddingBottomSystemWindowInsets = Boolean.valueOf(tintTypedArrayObtainTintedStyledAttributes.getBoolean(R.styleable.NavigationRailView_paddingBottomSystemWindowInsets, false));
        }
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(R.styleable.NavigationRailView_paddingStartSystemWindowInsets)) {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
            if (i7 % 2 == 0) {
                this.paddingStartSystemWindowInsets = Boolean.valueOf(tintTypedArrayObtainTintedStyledAttributes.getBoolean(R.styleable.NavigationRailView_paddingStartSystemWindowInsets, true));
            } else {
                this.paddingStartSystemWindowInsets = Boolean.valueOf(tintTypedArrayObtainTintedStyledAttributes.getBoolean(R.styleable.NavigationRailView_paddingStartSystemWindowInsets, false));
            }
        }
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_navigation_rail_item_padding_top_with_large_font);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.m3_navigation_rail_item_padding_bottom_with_large_font);
        float fLerp = AnimationUtils.lerp(0.0f, 1.0f, 0.3f, 1.0f, MaterialResources.getFontScale(context2) - 1.0f);
        float fLerp2 = AnimationUtils.lerp(getItemPaddingTop(), dimensionPixelOffset, fLerp);
        float fLerp3 = AnimationUtils.lerp(getItemPaddingBottom(), dimensionPixelOffset2, fLerp);
        setItemPaddingTop(Math.round(fLerp2));
        setItemPaddingBottom(Math.round(fLerp3));
        tintTypedArrayObtainTintedStyledAttributes.recycle();
        applyWindowInsets();
    }

    private void applyWindowInsets() {
        int i = 2 % 2;
        ViewUtils.doOnApplyWindowInsets(this, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.navigationrail.NavigationRailView.1
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat, ViewUtils.RelativePadding relativePadding) {
                Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
                NavigationRailView navigationRailView = NavigationRailView.this;
                if (NavigationRailView.access$100(navigationRailView, NavigationRailView.access$000(navigationRailView))) {
                    relativePadding.top += insets.top;
                }
                NavigationRailView navigationRailView2 = NavigationRailView.this;
                if (NavigationRailView.access$100(navigationRailView2, NavigationRailView.access$200(navigationRailView2))) {
                    relativePadding.bottom += insets.bottom;
                }
                NavigationRailView navigationRailView3 = NavigationRailView.this;
                if (NavigationRailView.access$100(navigationRailView3, NavigationRailView.access$300(navigationRailView3))) {
                    relativePadding.start += ViewUtils.isLayoutRtl(view) ? insets.right : insets.left;
                }
                relativePadding.applyToView(view);
                return windowInsetsCompat;
            }
        });
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
    }

    private boolean shouldApplyWindowInsetPadding(Boolean bool) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        if (bool == null) {
            return ViewCompat.getFitsSystemWindows(this);
        }
        int i5 = i2 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        boolean zBooleanValue = bool.booleanValue();
        if (i6 == 0) {
            int i7 = 60 / 0;
        }
        return zBooleanValue;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) throws Throwable {
        Object[] objArr;
        int i3;
        int i4 = 2 % 2;
        int iMakeMinWidthSpec = makeMinWidthSpec(i);
        super.onMeasure(iMakeMinWidthSpec, i2);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 31533);
            int i5 = 921 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int keyRepeatDelay = 28 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
            byte b = $$d[80];
            byte b2 = b;
            Object[] objArr2 = new Object[1];
            g(b, b2, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i5, keyRepeatDelay, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        h(new char[]{11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1}, true, 23 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), TextUtils.indexOf("", "") + 202, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        h(new char[]{65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5}, true, TextUtils.indexOf("", "", 0) + 15, 206 - Color.red(0), 10 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 31533);
            int iMakeMeasureSpec = 921 - View.MeasureSpec.makeMeasureSpec(0, 0);
            int edgeSlop = 28 - (ViewConfiguration.getEdgeSlop() >> 16);
            byte[] bArr = $$d;
            Object[] objArr5 = new Object[1];
            g((byte) 52, bArr[80], bArr[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollDefaultDelay, iMakeMeasureSpec, edgeSlop, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 31533);
                int iRed = Color.red(0) + 921;
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 29;
                byte b3 = (byte) ($$e & 183);
                byte b4 = $$d[7];
                Object[] objArr6 = new Object[1];
                g(b3, b4, b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(minimumFlingVelocity, iRed, iIndexOf, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i6 = ~iUptimeMillis;
            int i7 = 134002307 + (((~((-287160350) | i6)) | 268472348 | (~((-1486919295) | i6))) * (-1136)) + (((~((-287160350) | iUptimeMillis)) | (~((-1486919295) | iUptimeMillis)) | (~(1505607295 | i6))) * (-568)) + (((~(iUptimeMillis | (-268472349))) | (~(i6 | 1486919294)) | (~(287160349 | i6))) * 568) + 1585986251;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            h(new char[]{65521, 5, 15, 2, 65534, 1, 65534, 11, 1, 15, '\f', 6, 1, 65483, 65534, '\r', '\r', 65483, 65502, 0, 17, 6, 19, 6, 17, 22}, false, 26 - KeyEvent.getDeadChar(0, 0), 202 - TextUtils.getCapsMode("", 0, 0), 6 - (ViewConfiguration.getTouchSlop() >> 8), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            h(new char[]{4, 65529, 11, '\b', '\b', 65531, 4, '\n', 65495, 6, 6, 2, 65535, 65529, 65527, '\n', 65535, 5}, false, (ViewConfiguration.getWindowTouchSlop() >> 8) + 18, 209 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            try {
                Object[] objArr10 = {applicationContext, Integer.valueOf(i), 0, 1585986251};
                byte[] bArr2 = $$j;
                byte b5 = bArr2[14];
                Object[] objArr11 = new Object[1];
                i(b5, b5, bArr2[89], objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b6 = bArr2[89];
                byte b7 = b6;
                Object[] objArr12 = new Object[1];
                i(b6, b7, b7, objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char capsMode = (char) (31533 - TextUtils.getCapsMode("", 0, 0));
                    int offsetBefore = 921 - TextUtils.getOffsetBefore("", 0);
                    int tapTimeout = 28 - (ViewConfiguration.getTapTimeout() >> 16);
                    byte b8 = (byte) ($$e & 183);
                    byte b9 = $$d[7];
                    Object[] objArr14 = new Object[1];
                    g(b8, b9, b9, objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(capsMode, offsetBefore, tapTimeout, -1142834547, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    h(new char[]{11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1}, true, 22 - View.resolveSize(0, 0), ExpandableListView.getPackedPositionGroup(0L) + 202, 2 - Drawable.resolveOpacity(0, 0), objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    h(new char[]{65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5}, true, ExpandableListView.getPackedPositionChild(0L) + 16, 207 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) + 10, objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char fadingEdgeLength = (char) (31533 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                        int iResolveSize = 921 - View.resolveSize(0, 0);
                        int doubleTapTimeout = 28 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        byte[] bArr3 = $$d;
                        Object[] objArr17 = new Object[1];
                        g((byte) 52, bArr3[80], bArr3[7], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(fadingEdgeLength, iResolveSize, doubleTapTimeout, -778300370, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 31534);
                        int windowTouchSlop = 921 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int keyRepeatDelay2 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 28;
                        byte b10 = $$d[80];
                        byte b11 = b10;
                        Object[] objArr18 = new Object[1];
                        g(b10, b11, b11, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cLastIndexOf, windowTouchSlop, keyRepeatDelay2, -1048449946, false, (String) objArr18[0], null);
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
        int i10 = ((int[]) objArr[1])[0];
        int i11 = ((int[]) objArr[3])[0];
        if (i11 != i10) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
                int i13 = i12 % 2;
                for (String str : strArr) {
                    int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
                    int i15 = i14 % 2;
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i11));
        }
        int i16 = ((int[]) objArr[0])[0];
        Object[] objArr19 = {new int[]{i ^ (i << 5)}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int i17 = ~i;
        int i18 = i16 + 134002307 + (((~((-675997073) | i17)) | 4350208 | (~((-1098082572) | i17))) * (-1136)) + (((~((-675997073) | i)) | (~((-1098082572) | i)) | (~(1769729435 | i17))) * (-568)) + (((~(i | (-4350209))) | (~(i17 | 1098082571)) | (~(675997072 | i17))) * 568);
        int i19 = (i18 << 13) ^ i18;
        int i20 = i19 ^ (i19 >>> 17);
        if (isHeaderViewVisible()) {
            int measuredHeight = (getMeasuredHeight() - this.headerView.getMeasuredHeight()) - this.topMargin;
            int i21 = ((int[]) objArr19[0])[0];
            int i22 = ((i21 * i21) - (~(-(45761990 * i21)))) - 1;
            int i23 = -(i21 * 1605007470);
            int i24 = (i22 & i23) + (i23 | i22);
            int i25 = ((i24 | 1031556772) << 1) - (1031556772 ^ i24);
            int i26 = i25 >> 27;
            int i27 = ((i26 ^ (-63)) + ((i26 & (-63)) << 1)) / 32;
            int i28 = (i27 & 1) + (i27 | 1);
            int i29 = -(((((i25 >> 15) - 262143) / 131072) + 1) ^ ((i25 ^ i28) + ((i28 & i25) << 1)));
            int i30 = (i29 ^ 2) + ((i29 & 2) << 1);
            int i31 = i30 >> 20;
            int i32 = (((i31 | (-8191)) << 1) - (i31 ^ (-8191))) / 4096;
            int i33 = (i32 & 1) + (i32 | 1);
            measureChild(getNavigationRailMenuView(), iMakeMinWidthSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, ((-617670052) / (((-((i33 ^ 1) + ((i33 & 1) << 1))) & i30) * 2)) - 1993066135));
            int i34 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i34 % 128;
            i3 = 2;
            int i35 = i34 % 2;
        } else {
            i3 = 2;
        }
        int i36 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i36 % 128;
        if (i36 % i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0055  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int bottom;
        int top;
        int i6 = 2 % 2;
        super.onLayout(z, i, i2, i3, i4);
        NavigationRailMenuView navigationRailMenuView = getNavigationRailMenuView();
        if (isHeaderViewVisible()) {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 117;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
            if (i7 % 2 != 0 ? (top = navigationRailMenuView.getTop()) >= (bottom = this.headerView.getBottom() + this.topMargin) : (top = navigationRailMenuView.getTop()) >= (bottom = this.headerView.getBottom() + this.topMargin)) {
                i5 = 0;
            } else {
                i5 = bottom - top;
            }
        } else if (navigationRailMenuView.isTopGravity()) {
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
            int i9 = i8 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9;
            int i10 = i8 % 2;
            i5 = this.topMargin;
            int i11 = i9 + 23;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
            int i12 = i11 % 2;
        } else {
            i5 = 0;
        }
        if (i5 > 0) {
            navigationRailMenuView.layout(navigationRailMenuView.getLeft(), navigationRailMenuView.getTop() + i5, navigationRailMenuView.getRight(), navigationRailMenuView.getBottom() + i5);
        }
    }

    public void addHeaderView(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        addHeaderView(LayoutInflater.from(getContext()).inflate(i, this, i3 % 2 == 0));
    }

    public void addHeaderView(View view) {
        int i = 2 % 2;
        removeHeaderView();
        this.headerView = view;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = this.topMargin;
        addView(view, 0, layoutParams);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public View getHeaderView() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        View view = this.headerView;
        int i5 = i3 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 9 / 0;
        }
        return view;
    }

    public void removeHeaderView() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        View view = this.headerView;
        if (view != null) {
            int i5 = i3 + 107;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            removeView(view);
            this.headerView = null;
        }
    }

    public void setMenuGravity(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            getNavigationRailMenuView().setMenuGravity(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getNavigationRailMenuView().setMenuGravity(i);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 67 / 0;
        }
    }

    public int getMenuGravity() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        NavigationRailMenuView navigationRailMenuView = getNavigationRailMenuView();
        if (i3 == 0) {
            return navigationRailMenuView.getMenuGravity();
        }
        navigationRailMenuView.getMenuGravity();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getItemMinimumHeight() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        int itemMinimumHeight = ((NavigationRailMenuView) getMenuView()).getItemMinimumHeight();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return itemMinimumHeight;
        }
        throw null;
    }

    public void setItemMinimumHeight(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 == 0) {
            ((NavigationRailMenuView) getMenuView()).setItemMinimumHeight(i);
            return;
        }
        ((NavigationRailMenuView) getMenuView()).setItemMinimumHeight(i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private NavigationRailMenuView getNavigationRailMenuView() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        NavigationRailMenuView navigationRailMenuView = (NavigationRailMenuView) getMenuView();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return navigationRailMenuView;
        }
        throw null;
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    protected NavigationRailMenuView createNavigationBarMenuView(Context context) {
        int i = 2 % 2;
        NavigationRailMenuView navigationRailMenuView = new NavigationRailMenuView(context);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 42 / 0;
        }
        return navigationRailMenuView;
    }

    private int makeMinWidthSpec(int i) {
        int i2 = 2 % 2;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            return i;
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i4 = i3 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        if (suggestedMinimumWidth <= 0) {
            return i;
        }
        int i6 = i3 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
        int i7 = i6 % 2;
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), suggestedMinimumWidth + getPaddingLeft() + getPaddingRight()), BasicMeasure.EXACTLY);
    }

    private boolean isHeaderViewVisible() {
        int i = 2 % 2;
        View view = this.headerView;
        if (view == null) {
            return false;
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        int visibility = view.getVisibility();
        if (i3 == 0) {
            if (visibility == 112) {
                return false;
            }
        } else if (visibility == 8) {
            return false;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return 7;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$n(byte r6, short r7, short r8) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 4
            int r8 = r8 * 4
            int r0 = 1 - r8
            int r7 = 120 - r7
            byte[] r1 = com.google.android.material.navigationrail.NavigationRailView.$$l
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L17
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r7 = r7 + 1
            int r6 = r6 + r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigationrail.NavigationRailView.$$n(byte, short, short):java.lang.String");
    }
}
