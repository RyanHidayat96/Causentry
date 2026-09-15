package com.google.android.material.navigation;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
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
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.bpjstku.presentation.membership.login.LoginActivity;
import com.google.android.material.R;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import defpackage.setVideoStabilizationMode;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public abstract class NavigationBarView extends FrameLayout {
    public static final int LABEL_VISIBILITY_AUTO = -1;
    public static final int LABEL_VISIBILITY_LABELED = 1;
    public static final int LABEL_VISIBILITY_SELECTED = 0;
    public static final int LABEL_VISIBILITY_UNLABELED = 2;
    private static final int MENU_PRESENTER_ID = 1;
    private final NavigationBarMenu menu;
    private MenuInflater menuInflater;
    private final NavigationBarMenuView menuView;
    private final NavigationBarPresenter presenter;
    private OnItemReselectedListener reselectedListener;
    private OnItemSelectedListener selectedListener;
    private static final byte[] $$c = {17, 104, 102, -28};
    private static final int $$f = 231;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {58, 66, -1, 15, -10, 6, 3, -14, 24, -28, 28, -19, -15, -1, 9, -7, 0};
    private static final int $$h = 176;
    private static final byte[] $$a = {58, -51, 54, -115, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 215;
    private static int asBinder = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f805a = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {59703, 59773, 59771, 59736, 59731, 59760, 59729, 59713, 59771, 59787, 59766, 59773, 59768, 59753, 59754, 59772, 59768, 59770, 59771, 59770, 59768, 59774, 59780, 59433, 59435, 59433, 59424, 59437, 59413, 59422, 59422, 59414, 59435, 59425, 59427, 59438, 59432, 59754, 59851, 59850, 59842, 59840, 59831, 59855, 59871, 59847, 59846, 59846, 59847, 59842, 59835, 59806, 59814, 59845, 59853, 59822, 59820, 59855, 59841, 59845, 59842, 59852, 59854, 59691, 59729, 59770, 59746, 59744, 59769, 59768, 59751, 59747, 59749, 59751, 59749, 59745, 59753, 59757, 59745, 59749, 59771, 59798, 59803, 59792, 59734, 59803, 59822, 59803, 59794, 59799, 59807, 59816, 59817, 59811, 59785, 59734, 59805, 59722, 59791, 59762, 59771, 59756, 59763, 59805, 59799, 59819, 59792, 59794, 59788, 59748, 59773, 59750, 59762, 59797, 59792, 59800, 59791, 59753, 59769, 59805, 59799, 59819, 59792, 59794, 59788, 59748, 59774, 59763, 59690, 59723, 59714, 59743, 59700, 59702, 59725, 59700, 59740, 59746, 59744, 59771, 59751, 59757, 59715, 59708, 59715, 59726, 59700, 59740, 59746, 59744, 59771, 59751, 59757, 59721, 59705, 59743, 59752, 59744, 59749, 59725, 59770, 59769, 59780, 59806, 59794, 59807, 59801, 59803, 59800, 59796, 59804, 59806, 59793, 59804, 59785, 59754, 59761, 59793, 59801, 59806, 59793, 59804, 59704, 59757, 59751, 59753, 59731, 59753, 59756, 59757, 59759, 59757, 59730, 59740, 59756, 59746, 59707, 59759, 59757, 59740, 59728, 59745, 59745, 59744, 59757, 59751, 59753, 59731, 59753, 59756, 59728, 59812, 59813, 59837, 59836, 59814, 59809, 59814, 59808, 59834, 59697, 59768, 59771, 59728, 59733, 59751, 59757, 59757, 59759, 59747, 59756, 59703, 59750, 59746, 59769, 59730, 59736, 59751, 59773, 59734, 59731, 59770, 59705, 59751, 59745, 59753, 59757, 59756, 59756, 59749, 59768, 59744, 59743, 59701, 59711, 59705, 59725, 59720, 59738, 59768, 59744, 59759, 59715, 59736, 59773, 59749, 59750, 59768, 59751, 59759, 59751, 59739, 59724, 59744, 59744, 59758, 59709, 59757, 59747, 59751, 59757, 59747, 59744, 59750, 59754, 59723, 59707, 59705, 59725, 59757, 59744, 59759, 59756, 59757, 59744, 59759, 59752, 59751, 59757};
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 3706;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 37612;
    private static char b = 46244;
    private static char TuitionPaymentFragmentbindingInflater1 = 17387;

    @Retention(RetentionPolicy.SOURCE)
    public @interface LabelVisibility {
    }

    public interface OnItemReselectedListener {
        void onNavigationItemReselected(MenuItem menuItem);
    }

    public interface OnItemSelectedListener {
        boolean onNavigationItemSelected(MenuItem menuItem);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 52
            int r0 = 53 - r6
            int r8 = r8 + 84
            int r7 = r7 * 52
            int r7 = 55 - r7
            byte[] r1 = com.google.android.material.navigation.NavigationBarView.$$a
            byte[] r0 = new byte[r0]
            int r6 = 52 - r6
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r7 = r7 + 1
            r3 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2e:
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationBarView.c(int, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 13
            int r7 = 14 - r7
            byte[] r0 = com.google.android.material.navigation.NavigationBarView.$$g
            int r6 = r6 + 4
            int r8 = 99 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r8 = r6
            r4 = r7
            r3 = r2
            goto L2a
        L13:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r8 = r8 + 1
            int r3 = r3 + 1
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            r4 = r0[r8]
        L2a:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-1)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationBarView.f(int, byte, short, java.lang.Object[]):void");
    }

    protected abstract NavigationBarMenuView createNavigationBarMenuView(Context context);

    public abstract int getMaxItemCount();

    static /* synthetic */ OnItemReselectedListener access$000(NavigationBarView navigationBarView) {
        int i = 2 % 2;
        int i2 = asBinder + 15;
        f805a = i2 % 128;
        int i3 = i2 % 2;
        OnItemReselectedListener onItemReselectedListener = navigationBarView.reselectedListener;
        if (i3 != 0) {
            return onItemReselectedListener;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ OnItemSelectedListener access$100(NavigationBarView navigationBarView) {
        int i = 2 % 2;
        int i2 = f805a + 51;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        OnItemSelectedListener onItemSelectedListener = navigationBarView.selectedListener;
        int i5 = i3 + 97;
        f805a = i5 % 128;
        if (i5 % 2 != 0) {
            return onItemSelectedListener;
        }
        throw null;
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < cArr.length) {
            int i3 = $10 + 23;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i5 = $10 + 15;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 58224;
            for (int i8 = 0; i8 < 16; i8++) {
                char c = cArr3[1];
                char c2 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c), Integer.valueOf((c2 + i7) ^ ((c2 << 4) + ((char) (((long) b) ^ 8611973335120459638L)))), Integer.valueOf(c2 >>> 5), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (47773 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 468 - KeyEvent.normalizeMetaState(0), (Process.myPid() >> 22) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 469 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 14 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr3[0] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b2 = (byte) (-1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2324, Color.argb(0, 0, 0, 0) + 44, -1312321721, false, $$i((byte) 9, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public NavigationBarView(Context context, AttributeSet attributeSet, int i, int i2) throws Throwable {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        NavigationBarPresenter navigationBarPresenter = new NavigationBarPresenter();
        this.presenter = navigationBarPresenter;
        Context context2 = getContext();
        TintTypedArray tintTypedArrayObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, R.styleable.NavigationBarView, i, i2, R.styleable.NavigationBarView_itemTextAppearanceInactive, R.styleable.NavigationBarView_itemTextAppearanceActive);
        NavigationBarMenu navigationBarMenu = new NavigationBarMenu(context2, getClass(), getMaxItemCount());
        this.menu = navigationBarMenu;
        NavigationBarMenuView navigationBarMenuViewCreateNavigationBarMenuView = createNavigationBarMenuView(context2);
        this.menuView = navigationBarMenuViewCreateNavigationBarMenuView;
        navigationBarPresenter.setMenuView(navigationBarMenuViewCreateNavigationBarMenuView);
        navigationBarPresenter.setId(1);
        navigationBarMenuViewCreateNavigationBarMenuView.setPresenter(navigationBarPresenter);
        navigationBarMenu.addMenuPresenter(navigationBarPresenter);
        navigationBarPresenter.initForMenu(getContext(), navigationBarMenu);
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(R.styleable.NavigationBarView_itemIconTint)) {
            navigationBarMenuViewCreateNavigationBarMenuView.setIconTintList(tintTypedArrayObtainTintedStyledAttributes.getColorStateList(R.styleable.NavigationBarView_itemIconTint));
        } else {
            navigationBarMenuViewCreateNavigationBarMenuView.setIconTintList(navigationBarMenuViewCreateNavigationBarMenuView.createDefaultColorStateList(android.R.attr.textColorSecondary));
        }
        setItemIconSize(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(R.styleable.NavigationBarView_itemIconSize, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(R.styleable.NavigationBarView_itemTextAppearanceInactive)) {
            setItemTextAppearanceInactive(tintTypedArrayObtainTintedStyledAttributes.getResourceId(R.styleable.NavigationBarView_itemTextAppearanceInactive, 0));
            int i3 = 2 % 2;
        }
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(R.styleable.NavigationBarView_itemTextAppearanceActive)) {
            int i4 = asBinder + 5;
            f805a = i4 % 128;
            int i5 = i4 % 2;
            setItemTextAppearanceActive(tintTypedArrayObtainTintedStyledAttributes.getResourceId(R.styleable.NavigationBarView_itemTextAppearanceActive, 0));
        }
        setItemTextAppearanceActiveBoldEnabled(tintTypedArrayObtainTintedStyledAttributes.getBoolean(R.styleable.NavigationBarView_itemTextAppearanceActiveBoldEnabled, true));
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(R.styleable.NavigationBarView_itemTextColor)) {
            setItemTextColor(tintTypedArrayObtainTintedStyledAttributes.getColorStateList(R.styleable.NavigationBarView_itemTextColor));
        }
        Drawable background = getBackground();
        ColorStateList colorStateListOrNull = DrawableUtils.getColorStateListOrNull(background);
        if (background == null || colorStateListOrNull != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(context2, attributeSet, i, i2).build());
            if (colorStateListOrNull != null) {
                int i6 = asBinder + 109;
                f805a = i6 % 128;
                int i7 = i6 % 2;
                materialShapeDrawable.setFillColor(colorStateListOrNull);
                int i8 = 2 % 2;
            }
            materialShapeDrawable.initializeElevationOverlay(context2);
            ViewCompat.setBackground(this, materialShapeDrawable);
        }
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(R.styleable.NavigationBarView_itemPaddingTop)) {
            setItemPaddingTop(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(R.styleable.NavigationBarView_itemPaddingTop, 0));
        }
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(R.styleable.NavigationBarView_itemPaddingBottom)) {
            int i9 = f805a + 109;
            asBinder = i9 % 128;
            if (i9 % 2 != 0) {
                setItemPaddingBottom(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(R.styleable.NavigationBarView_itemPaddingBottom, 1));
            } else {
                setItemPaddingBottom(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(R.styleable.NavigationBarView_itemPaddingBottom, 0));
            }
            int i10 = 2 % 2;
        }
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(R.styleable.NavigationBarView_activeIndicatorLabelPadding)) {
            int i11 = asBinder + 27;
            f805a = i11 % 128;
            int i12 = i11 % 2;
            setActiveIndicatorLabelPadding(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(R.styleable.NavigationBarView_activeIndicatorLabelPadding, 0));
        }
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(R.styleable.NavigationBarView_elevation)) {
            int i13 = f805a + 113;
            asBinder = i13 % 128;
            if (i13 % 2 != 0) {
                setElevation(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(R.styleable.NavigationBarView_elevation, 0));
            } else {
                setElevation(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(R.styleable.NavigationBarView_elevation, 0));
            }
        }
        DrawableCompat.setTintList(getBackground().mutate(), MaterialResources.getColorStateList(context2, tintTypedArrayObtainTintedStyledAttributes, R.styleable.NavigationBarView_backgroundTint));
        setLabelVisibilityMode(tintTypedArrayObtainTintedStyledAttributes.getInteger(R.styleable.NavigationBarView_labelVisibilityMode, -1));
        int resourceId = tintTypedArrayObtainTintedStyledAttributes.getResourceId(R.styleable.NavigationBarView_itemBackground, 0);
        if (resourceId != 0) {
            navigationBarMenuViewCreateNavigationBarMenuView.setItemBackgroundRes(resourceId);
            int i14 = asBinder + 37;
            f805a = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 3 % 5;
            } else {
                int i16 = 2 % 2;
            }
        } else {
            setItemRippleColor(MaterialResources.getColorStateList(context2, tintTypedArrayObtainTintedStyledAttributes, R.styleable.NavigationBarView_itemRippleColor));
        }
        int resourceId2 = tintTypedArrayObtainTintedStyledAttributes.getResourceId(R.styleable.NavigationBarView_itemActiveIndicatorStyle, 0);
        if (resourceId2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId2, R.styleable.NavigationBarActiveIndicator);
            setItemActiveIndicatorWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.NavigationBarActiveIndicator_android_width, 0));
            setItemActiveIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.NavigationBarActiveIndicator_android_height, 0));
            setItemActiveIndicatorMarginHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.NavigationBarActiveIndicator_marginHorizontal, 0));
            setItemActiveIndicatorColor(MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, R.styleable.NavigationBarActiveIndicator_android_color));
            setItemActiveIndicatorShapeAppearance(ShapeAppearanceModel.builder(context2, typedArrayObtainStyledAttributes.getResourceId(R.styleable.NavigationBarActiveIndicator_shapeAppearance, 0), 0).build());
            typedArrayObtainStyledAttributes.recycle();
        }
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(R.styleable.NavigationBarView_menu)) {
            int i17 = asBinder + 111;
            f805a = i17 % 128;
            int i18 = i17 % 2;
            inflateMenu(tintTypedArrayObtainTintedStyledAttributes.getResourceId(R.styleable.NavigationBarView_menu, 0));
        }
        tintTypedArrayObtainTintedStyledAttributes.recycle();
        addView(navigationBarMenuViewCreateNavigationBarMenuView);
        navigationBarMenu.setCallback(new MenuBuilder.Callback() { // from class: com.google.android.material.navigation.NavigationBarView.1
            @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
            public void onMenuModeChange(MenuBuilder menuBuilder) {
            }

            @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
            public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
                if (NavigationBarView.access$000(NavigationBarView.this) == null || menuItem.getItemId() != NavigationBarView.this.getSelectedItemId()) {
                    return (NavigationBarView.access$100(NavigationBarView.this) == null || NavigationBarView.access$100(NavigationBarView.this).onNavigationItemSelected(menuItem)) ? false : true;
                }
                NavigationBarView.access$000(NavigationBarView.this).onNavigationItemReselected(menuItem);
                return true;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:44:0x014b A[Catch: all -> 0x008e, TryCatch #1 {all -> 0x008e, blocks: (B:9:0x002f, B:11:0x003d, B:12:0x007b, B:42:0x0133, B:44:0x014b, B:45:0x018c, B:54:0x021c, B:56:0x0229, B:57:0x026d, B:48:0x01a4, B:50:0x01bd, B:51:0x01ff), top: B:89:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:47:0x019d  */
    /* JADX WARN: Code duplicated, block: B:50:0x01bd A[Catch: all -> 0x008e, TryCatch #1 {all -> 0x008e, blocks: (B:9:0x002f, B:11:0x003d, B:12:0x007b, B:42:0x0133, B:44:0x014b, B:45:0x018c, B:54:0x021c, B:56:0x0229, B:57:0x026d, B:48:0x01a4, B:50:0x01bd, B:51:0x01ff), top: B:89:0x002f }] */
    private static void d(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char c;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        int i = 2;
        int i2 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        char c2 = 0;
        int i3 = iArr[0];
        int i4 = 1;
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $11 + 31;
                $10 = i9 % 128;
                if (i9 % i != 0) {
                    try {
                        Object[] objArr2 = new Object[i4];
                        objArr2[c2] = Integer.valueOf(cArr[i8]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            int pressedStateDuration = 1270 - (ViewConfiguration.getPressedStateDuration() >> 16);
                            int i10 = 19 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                            byte b2 = (byte) ($$f & 1);
                            byte b3 = (byte) (-b2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollBarFadeDuration, pressedStateDuration, i10, 407021364, false, $$i(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                        }
                        cArr2[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr2)).charValue();
                        i8 >>>= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr[i8])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
                            int scrollDefaultDelay = 1270 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 18;
                            byte b4 = (byte) ($$f & 1);
                            byte b5 = (byte) (-b4);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf, scrollDefaultDelay, iResolveOpacity, 407021364, false, $$i(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                        }
                        cArr2[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr3)).charValue();
                        i8++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i = 2;
                c2 = 0;
                i4 = 1;
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i3, cArr3, 0, i5);
        if (bArr != null) {
            char[] cArr4 = new char[i5];
            setvideostabilizationmode.b = 0;
            char c3 = 0;
            while (setvideostabilizationmode.b < i5) {
                int i11 = $11 + 55;
                $10 = i11 % 128;
                if (i11 % 2 == 0) {
                    c = 1;
                    if (bArr[setvideostabilizationmode.b] == 1) {
                        int i12 = setvideostabilizationmode.b;
                        char c4 = cArr3[setvideostabilizationmode.b];
                        Object[] objArr4 = new Object[2];
                        objArr4[c] = Integer.valueOf(c3);
                        objArr4[0] = Integer.valueOf(c4);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = (byte) (b6 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getWindowTouchSlop() >> 8) + 3225, 13 - (ViewConfiguration.getEdgeSlop() >> 16), 2133916302, false, $$i(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i12] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr4)).charValue();
                    } else {
                        int i13 = setvideostabilizationmode.b;
                        Object[] objArr5 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c3)};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char c5 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29944);
                            int defaultSize = View.getDefaultSize(0, 0) + 1755;
                            int mode = 23 - View.MeasureSpec.getMode(0);
                            byte b8 = (byte) ($$f & 10);
                            byte b9 = (byte) (b8 - 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c5, defaultSize, mode, 387247676, false, $$i(b8, b9, (byte) (b9 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i13] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr5)).charValue();
                        int i14 = $11 + 107;
                        $10 = i14 % 128;
                        int i15 = i14 % 2;
                    }
                } else if (bArr[setvideostabilizationmode.b] == 0) {
                    c = 1;
                    int i16 = setvideostabilizationmode.b;
                    char c6 = cArr3[setvideostabilizationmode.b];
                    Object[] objArr6 = new Object[2];
                    objArr6[c] = Integer.valueOf(c3);
                    objArr6[0] = Integer.valueOf(c6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b10 = (byte) 0;
                        byte b11 = (byte) (b10 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getWindowTouchSlop() >> 8) + 3225, 13 - (ViewConfiguration.getEdgeSlop() >> 16), 2133916302, false, $$i(b10, b11, (byte) (b11 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i16] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr6)).charValue();
                } else {
                    int i17 = setvideostabilizationmode.b;
                    Object[] objArr7 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c3)};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c7 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29944);
                        int defaultSize2 = View.getDefaultSize(0, 0) + 1755;
                        int mode2 = 23 - View.MeasureSpec.getMode(0);
                        byte b12 = (byte) ($$f & 10);
                        byte b13 = (byte) (b12 - 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c7, defaultSize2, mode2, 387247676, false, $$i(b12, b13, (byte) (b13 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i17] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr7)).charValue();
                    int i18 = $11 + 107;
                    $10 = i18 % 128;
                    int i19 = i18 % 2;
                }
                c3 = cArr4[setvideostabilizationmode.b];
                Object[] objArr8 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b14 = (byte) (-1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (41240 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), KeyEvent.normalizeMetaState(0) + 1705, TextUtils.indexOf("", "") + 21, -1434471773, false, $$i((byte) ($$f & 30), b14, (byte) (b14 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                int i20 = $10 + 59;
                $11 = i20 % 128;
                int i21 = i20 % 2;
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            int i22 = $11 + 121;
            $10 = i22 % 128;
            if (i22 % 2 != 0) {
                char[] cArr5 = new char[i5];
                System.arraycopy(cArr3, 0, cArr5, 1, i5);
                System.arraycopy(cArr5, 1, cArr3, i5 / i7, i7);
                System.arraycopy(cArr5, i7, cArr3, 1, i5 >>> i7);
            } else {
                char[] cArr6 = new char[i5];
                System.arraycopy(cArr3, 0, cArr6, 0, i5);
                int i23 = i5 - i7;
                System.arraycopy(cArr6, 0, cArr3, i23, i7);
                System.arraycopy(cArr6, i7, cArr3, 0, i23);
            }
            int i24 = $10 + 89;
            $11 = i24 % 128;
            int i25 = i24 % 2;
        }
        if (z) {
            char[] cArr7 = new char[i5];
            int i26 = 0;
            while (true) {
                setvideostabilizationmode.b = i26;
                if (setvideostabilizationmode.b >= i5) {
                    break;
                }
                cArr7[setvideostabilizationmode.b] = cArr3[(i5 - setvideostabilizationmode.b) - 1];
                i26 = setvideostabilizationmode.b + 1;
            }
            cArr3 = cArr7;
        }
        if (i6 > 0) {
            int i27 = $11 + 53;
            $10 = i27 % 128;
            if (i27 % 2 != 0) {
                setvideostabilizationmode.b = 1;
            } else {
                setvideostabilizationmode.b = 0;
            }
            while (setvideostabilizationmode.b < i5) {
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                setvideostabilizationmode.b++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        int i = 2 % 2;
        int i2 = f805a + 7;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
        int i4 = asBinder + 15;
        f805a = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        int i = 2 % 2;
        int i2 = f805a + 45;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.setElevation(f);
        MaterialShapeUtils.setElevation(this, f);
        int i4 = asBinder + 39;
        f805a = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public void setOnItemSelectedListener(OnItemSelectedListener onItemSelectedListener) {
        int i = 2 % 2;
        int i2 = asBinder + 51;
        f805a = i2 % 128;
        int i3 = i2 % 2;
        this.selectedListener = onItemSelectedListener;
        if (i3 == 0) {
            throw null;
        }
    }

    public void setOnItemReselectedListener(OnItemReselectedListener onItemReselectedListener) {
        int i = 2 % 2;
        int i2 = f805a + 49;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        this.reselectedListener = onItemReselectedListener;
        int i5 = i3 + 109;
        f805a = i5 % 128;
        int i6 = i5 % 2;
    }

    public Menu getMenu() {
        int i = 2 % 2;
        int i2 = asBinder + 39;
        int i3 = i2 % 128;
        f805a = i3;
        int i4 = i2 % 2;
        NavigationBarMenu navigationBarMenu = this.menu;
        int i5 = i3 + 121;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 17 / 0;
        }
        return navigationBarMenu;
    }

    public MenuView getMenuView() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 73;
        f805a = i3 % 128;
        int i4 = i3 % 2;
        NavigationBarMenuView navigationBarMenuView = this.menuView;
        int i5 = i2 + 61;
        f805a = i5 % 128;
        if (i5 % 2 != 0) {
            return navigationBarMenuView;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void inflateMenu(int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asBinder + 55;
        f805a = i3 % 128;
        int i4 = i3 % 2;
        this.presenter.setUpdateSuspended(true);
        getMenuInflater().inflate(i, this.menu);
        this.presenter.setUpdateSuspended(false);
        this.presenter.updateMenuView(true);
        int i5 = f805a + 17;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public ColorStateList getItemIconTintList() {
        int i = 2 % 2;
        int i2 = asBinder + 117;
        f805a = i2 % 128;
        int i3 = i2 % 2;
        ColorStateList iconTintList = this.menuView.getIconTintList();
        int i4 = asBinder + 59;
        f805a = i4 % 128;
        int i5 = i4 % 2;
        return iconTintList;
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = f805a + 117;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        this.menuView.setIconTintList(colorStateList);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setItemIconSize(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 43;
        f805a = i3 % 128;
        int i4 = i3 % 2;
        this.menuView.setItemIconSize(i);
        int i5 = asBinder + 1;
        f805a = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setItemIconSizeRes(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 45;
        f805a = i3 % 128;
        if (i3 % 2 == 0) {
            setItemIconSize(getResources().getDimensionPixelSize(i));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        setItemIconSize(getResources().getDimensionPixelSize(i));
        int i4 = asBinder + 43;
        f805a = i4 % 128;
        int i5 = i4 % 2;
    }

    public int getItemIconSize() {
        int i = 2 % 2;
        int i2 = asBinder + 89;
        f805a = i2 % 128;
        int i3 = i2 % 2;
        NavigationBarMenuView navigationBarMenuView = this.menuView;
        if (i3 != 0) {
            return navigationBarMenuView.getItemIconSize();
        }
        navigationBarMenuView.getItemIconSize();
        throw null;
    }

    public ColorStateList getItemTextColor() {
        int i = 2 % 2;
        int i2 = f805a + 79;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ColorStateList itemTextColor = this.menuView.getItemTextColor();
        int i4 = f805a + 57;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return itemTextColor;
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = asBinder + 17;
        f805a = i2 % 128;
        int i3 = i2 % 2;
        this.menuView.setItemTextColor(colorStateList);
        int i4 = f805a + 9;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Deprecated
    public int getItemBackgroundResource() {
        int i = 2 % 2;
        int i2 = asBinder + 7;
        f805a = i2 % 128;
        int i3 = i2 % 2;
        int itemBackgroundRes = this.menuView.getItemBackgroundRes();
        int i4 = asBinder + 31;
        f805a = i4 % 128;
        int i5 = i4 % 2;
        return itemBackgroundRes;
    }

    public void setItemBackgroundResource(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 123;
        f805a = i3 % 128;
        int i4 = i3 % 2;
        this.menuView.setItemBackgroundRes(i);
        if (i4 == 0) {
            int i5 = 20 / 0;
        }
    }

    public Drawable getItemBackground() {
        int i = 2 % 2;
        int i2 = f805a + 67;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Drawable itemBackground = this.menuView.getItemBackground();
        if (i3 != 0) {
            int i4 = 65 / 0;
        }
        return itemBackground;
    }

    public void setItemBackground(Drawable drawable) {
        int i = 2 % 2;
        int i2 = asBinder + 51;
        f805a = i2 % 128;
        int i3 = i2 % 2;
        this.menuView.setItemBackground(drawable);
        int i4 = f805a + 7;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ColorStateList getItemRippleColor() {
        int i = 2 % 2;
        int i2 = f805a + 103;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        NavigationBarMenuView navigationBarMenuView = this.menuView;
        if (i3 == 0) {
            return navigationBarMenuView.getItemRippleColor();
        }
        navigationBarMenuView.getItemRippleColor();
        throw null;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = asBinder + 91;
        f805a = i2 % 128;
        int i3 = i2 % 2;
        this.menuView.setItemRippleColor(colorStateList);
        if (i3 == 0) {
            throw null;
        }
    }

    public int getItemPaddingTop() {
        int i = 2 % 2;
        int i2 = asBinder + 103;
        f805a = i2 % 128;
        int i3 = i2 % 2;
        int itemPaddingTop = this.menuView.getItemPaddingTop();
        if (i3 == 0) {
            int i4 = 53 / 0;
        }
        return itemPaddingTop;
    }

    public void setItemPaddingTop(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 19;
        f805a = i3 % 128;
        int i4 = i3 % 2;
        this.menuView.setItemPaddingTop(i);
        int i5 = asBinder + 79;
        f805a = i5 % 128;
        int i6 = i5 % 2;
    }

    public int getItemPaddingBottom() {
        int itemPaddingBottom;
        int i = 2 % 2;
        int i2 = f805a + 87;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            itemPaddingBottom = this.menuView.getItemPaddingBottom();
            int i3 = 6 / 0;
        } else {
            itemPaddingBottom = this.menuView.getItemPaddingBottom();
        }
        int i4 = f805a + 31;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return itemPaddingBottom;
    }

    public void setItemPaddingBottom(int i) {
        int i2 = 2 % 2;
        int i3 = f805a + 109;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        this.menuView.setItemPaddingBottom(i);
        int i5 = asBinder + 33;
        f805a = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setActiveIndicatorLabelPadding(int i) {
        int i2 = 2 % 2;
        int i3 = f805a + 111;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        this.menuView.setActiveIndicatorLabelPadding(i);
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getActiveIndicatorLabelPadding() {
        int i = 2 % 2;
        int i2 = asBinder + 81;
        f805a = i2 % 128;
        if (i2 % 2 == 0) {
            this.menuView.getActiveIndicatorLabelPadding();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int activeIndicatorLabelPadding = this.menuView.getActiveIndicatorLabelPadding();
        int i3 = f805a + 31;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return activeIndicatorLabelPadding;
    }

    public boolean isItemActiveIndicatorEnabled() {
        int i = 2 % 2;
        int i2 = f805a + 67;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        boolean itemActiveIndicatorEnabled = this.menuView.getItemActiveIndicatorEnabled();
        int i4 = f805a + 55;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return itemActiveIndicatorEnabled;
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = f805a + 13;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        this.menuView.setItemActiveIndicatorEnabled(z);
        int i4 = asBinder + 79;
        f805a = i4 % 128;
        int i5 = i4 % 2;
    }

    public int getItemActiveIndicatorWidth() {
        int i = 2 % 2;
        int i2 = f805a + 17;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int itemActiveIndicatorWidth = this.menuView.getItemActiveIndicatorWidth();
        int i4 = f805a + 27;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return itemActiveIndicatorWidth;
    }

    public void setItemActiveIndicatorWidth(int i) {
        int i2 = 2 % 2;
        int i3 = f805a + 117;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            this.menuView.setItemActiveIndicatorWidth(i);
            throw null;
        }
        this.menuView.setItemActiveIndicatorWidth(i);
        int i4 = f805a + 85;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 67 / 0;
        }
    }

    public int getItemActiveIndicatorHeight() {
        int i = 2 % 2;
        int i2 = asBinder + 1;
        f805a = i2 % 128;
        int i3 = i2 % 2;
        int itemActiveIndicatorHeight = this.menuView.getItemActiveIndicatorHeight();
        int i4 = f805a + 19;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return itemActiveIndicatorHeight;
    }

    public void setItemActiveIndicatorHeight(int i) {
        int i2 = 2 % 2;
        int i3 = f805a + 63;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            this.menuView.setItemActiveIndicatorHeight(i);
            throw null;
        }
        this.menuView.setItemActiveIndicatorHeight(i);
        int i4 = asBinder + 25;
        f805a = i4 % 128;
        int i5 = i4 % 2;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        int i = 2 % 2;
        int i2 = asBinder + 119;
        f805a = i2 % 128;
        int i3 = i2 % 2;
        int itemActiveIndicatorMarginHorizontal = this.menuView.getItemActiveIndicatorMarginHorizontal();
        int i4 = f805a + 121;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return itemActiveIndicatorMarginHorizontal;
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 109;
        f805a = i3 % 128;
        int i4 = i3 % 2;
        this.menuView.setItemActiveIndicatorMarginHorizontal(i);
        int i5 = f805a + 77;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ShapeAppearanceModel getItemActiveIndicatorShapeAppearance() {
        int i = 2 % 2;
        int i2 = f805a + 87;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            this.menuView.getItemActiveIndicatorShapeAppearance();
            throw null;
        }
        ShapeAppearanceModel itemActiveIndicatorShapeAppearance = this.menuView.getItemActiveIndicatorShapeAppearance();
        int i3 = asBinder + 121;
        f805a = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 63 / 0;
        }
        return itemActiveIndicatorShapeAppearance;
    }

    public void setItemActiveIndicatorShapeAppearance(ShapeAppearanceModel shapeAppearanceModel) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 15;
        f805a = i2 % 128;
        int i3 = i2 % 2;
        this.menuView.setItemActiveIndicatorShapeAppearance(shapeAppearanceModel);
        int i4 = f805a + 29;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 60 / 0;
        }
    }

    public ColorStateList getItemActiveIndicatorColor() {
        int i = 2 % 2;
        int i2 = f805a + 35;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ColorStateList itemActiveIndicatorColor = this.menuView.getItemActiveIndicatorColor();
        int i4 = f805a + 7;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return itemActiveIndicatorColor;
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = asBinder + 35;
        f805a = i2 % 128;
        if (i2 % 2 == 0) {
            this.menuView.setItemActiveIndicatorColor(colorStateList);
            throw null;
        }
        this.menuView.setItemActiveIndicatorColor(colorStateList);
        int i3 = f805a + 13;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
    }

    public int getSelectedItemId() {
        int i = 2 % 2;
        int i2 = asBinder + 101;
        f805a = i2 % 128;
        if (i2 % 2 == 0) {
            this.menuView.getSelectedItemId();
            throw null;
        }
        int selectedItemId = this.menuView.getSelectedItemId();
        int i3 = f805a + 3;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            return selectedItemId;
        }
        throw null;
    }

    public void setSelectedItemId(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 13;
        f805a = i3 % 128;
        if (i3 % 2 == 0) {
            this.menu.findItem(i);
            throw null;
        }
        MenuItem menuItemFindItem = this.menu.findItem(i);
        if (menuItemFindItem != null) {
            int i4 = asBinder + 51;
            f805a = i4 % 128;
            int i5 = i4 % 2;
            if (this.menu.performItemAction(menuItemFindItem, this.presenter, 0)) {
                return;
            }
            int i6 = f805a + 33;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            menuItemFindItem.setChecked(true);
        }
    }

    public void setLabelVisibilityMode(int i) {
        int i2 = 2 % 2;
        if (this.menuView.getLabelVisibilityMode() != i) {
            int i3 = f805a + 45;
            asBinder = i3 % 128;
            if (i3 % 2 != 0) {
                this.menuView.setLabelVisibilityMode(i);
            } else {
                this.menuView.setLabelVisibilityMode(i);
            }
            this.presenter.updateMenuView(false);
        }
        int i4 = asBinder + 107;
        f805a = i4 % 128;
        int i5 = i4 % 2;
    }

    public int getLabelVisibilityMode() {
        int i = 2 % 2;
        int i2 = asBinder + 27;
        f805a = i2 % 128;
        int i3 = i2 % 2;
        int labelVisibilityMode = this.menuView.getLabelVisibilityMode();
        int i4 = asBinder + 37;
        f805a = i4 % 128;
        if (i4 % 2 != 0) {
            return labelVisibilityMode;
        }
        throw null;
    }

    public void setItemTextAppearanceInactive(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 45;
        f805a = i3 % 128;
        if (i3 % 2 == 0) {
            this.menuView.setItemTextAppearanceInactive(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.menuView.setItemTextAppearanceInactive(i);
        int i4 = f805a + 47;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public int getItemTextAppearanceInactive() {
        int i = 2 % 2;
        int i2 = f805a + 33;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int itemTextAppearanceInactive = this.menuView.getItemTextAppearanceInactive();
        int i4 = asBinder + 41;
        f805a = i4 % 128;
        if (i4 % 2 != 0) {
            return itemTextAppearanceInactive;
        }
        throw null;
    }

    public void setItemTextAppearanceActive(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 25;
        f805a = i3 % 128;
        int i4 = i3 % 2;
        this.menuView.setItemTextAppearanceActive(i);
        int i5 = f805a + 21;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = f805a + 1;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        this.menuView.setItemTextAppearanceActiveBoldEnabled(z);
        int i4 = f805a + 41;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getItemTextAppearanceActive() {
        int i = 2 % 2;
        int i2 = f805a + 65;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int itemTextAppearanceActive = this.menuView.getItemTextAppearanceActive();
        int i4 = asBinder + 1;
        f805a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 92 / 0;
        }
        return itemTextAppearanceActive;
    }

    public void setItemOnTouchListener(int i, View.OnTouchListener onTouchListener) {
        int i2 = 2 % 2;
        int i3 = asBinder + 59;
        f805a = i3 % 128;
        int i4 = i3 % 2;
        this.menuView.setItemOnTouchListener(i, onTouchListener);
        int i5 = asBinder + 87;
        f805a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 3 / 0;
        }
    }

    public BadgeDrawable getBadge(int i) {
        int i2 = 2 % 2;
        int i3 = f805a + 83;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            this.menuView.getBadge(i);
            throw null;
        }
        BadgeDrawable badge = this.menuView.getBadge(i);
        int i4 = f805a + 69;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 11 / 0;
        }
        return badge;
    }

    public BadgeDrawable getOrCreateBadge(int i) {
        int i2 = 2 % 2;
        int i3 = f805a + 67;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        BadgeDrawable orCreateBadge = this.menuView.getOrCreateBadge(i);
        int i5 = asBinder + 43;
        f805a = i5 % 128;
        if (i5 % 2 != 0) {
            return orCreateBadge;
        }
        throw null;
    }

    public void removeBadge(int i) {
        int i2 = 2 % 2;
        int i3 = f805a + 45;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        this.menuView.removeBadge(i);
        int i5 = f805a + 93;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.navigation.NavigationBarView.SavedState.1
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
        Bundle menuPresenterState;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            readFromParcel(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.menuPresenterState);
        }

        private void readFromParcel(Parcel parcel, ClassLoader classLoader) {
            this.menuPresenterState = parcel.readBundle(classLoader);
        }
    }

    private MenuInflater getMenuInflater() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        if (this.menuInflater == null) {
            this.menuInflater = new SupportMenuInflater(getContext());
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
            int iIndexOf = 875 - TextUtils.indexOf((CharSequence) "", '0', 0);
            int iAlpha = Color.alpha(0) + 10;
            byte b2 = (byte) (-$$a[5]);
            Object[] objArr2 = new Object[1];
            c(b2, b2, (byte) 14, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iIndexOf, iAlpha, 252381699, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        d(new int[]{0, 22, 10, 18}, false, new byte[]{1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        d(new int[]{22, 15, 186, 0}, false, new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
            int iAxisFromString = 875 - MotionEvent.axisFromString("");
            int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0) + 11;
            byte[] bArr = $$a;
            byte b3 = bArr[7];
            Object[] objArr5 = new Object[1];
            c(b3, (byte) (-bArr[5]), b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(modifierMetaStateMask, iAxisFromString, iIndexOf2, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char defaultSize = (char) View.getDefaultSize(0, 0);
                int iResolveSizeAndState = 876 - View.resolveSizeAndState(0, 0, 0);
                int deadChar = 10 - KeyEvent.getDeadChar(0, 0);
                byte[] bArr2 = $$a;
                Object[] objArr6 = new Object[1];
                c((byte) (-bArr2[5]), bArr2[7], bArr2[54], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(defaultSize, iResolveSizeAndState, deadChar, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i2 = (((((~((-508746137) | iIdentityHashCode)) | 440582528) * (-566)) + 301917908) + ((~(iIdentityHashCode | (-68163609))) * 566)) - 990370984;
            int i3 = (i2 << 13) ^ i2;
            int i4 = i3 ^ (i3 >>> 17);
            ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            d(new int[]{37, 26, 94, 0}, true, new byte[]{0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            d(new int[]{63, 18, 0, 8}, true, new byte[]{1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = (!((applicationContext instanceof ContextWrapper) ^ true) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            d(new int[]{81, 16, 47, 8}, true, null, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new char[]{26101, 38616, 64174, 19552, 59224, 43659, 41632, 60749, 31001, 12677, 44012, 28151, 17694, 32169, 12703, 701, 26709, 60427}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 15, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i5 = asBinder + 9;
            f805a = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), -990370984};
                byte[] bArr3 = $$g;
                byte b4 = bArr3[2];
                byte b5 = bArr3[16];
                Object[] objArr13 = new Object[1];
                f(b4, b5, b5, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b6 = (byte) (-bArr3[2]);
                Object[] objArr14 = new Object[1];
                f((byte) 12, b6, b6, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    int i7 = f805a + 67;
                    asBinder = i7 % 128;
                    int i8 = i7 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                        int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 876;
                        int offsetAfter = 10 - TextUtils.getOffsetAfter("", 0);
                        byte[] bArr4 = $$a;
                        Object[] objArr16 = new Object[1];
                        c((byte) (-bArr4[5]), bArr4[7], bArr4[54], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf, threadPriority, offsetAfter, 256017550, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        d(new int[]{0, 22, 10, 18}, false, new byte[]{1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0}, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        d(new int[]{22, 15, 186, 0}, false, new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char defaultSize2 = (char) View.getDefaultSize(0, 0);
                            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 877;
                            int i9 = 10 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            byte[] bArr5 = $$a;
                            byte b7 = bArr5[7];
                            Object[] objArr19 = new Object[1];
                            c(b7, (byte) (-bArr5[5]), b7, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(defaultSize2, iLastIndexOf, i9, 2009631821, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                            int i10 = 876 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int i11 = 10 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            byte b8 = (byte) (-$$a[5]);
                            Object[] objArr20 = new Object[1];
                            c(b8, b8, (byte) 14, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionGroup, i10, i11, 252381699, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (((int[]) objArr[0])[0] != ((int[]) objArr[2])[0]) {
            throw null;
        }
        int i12 = ((int[]) objArr[1])[0];
        Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i13 = ~((-700589123) | (~iIdentityHashCode2));
        int i14 = i12 + (((((-802893424) | i13) | (~(700589122 | iIdentityHashCode2))) * (-338)) - 754727436) + (((~(iIdentityHashCode2 | (-102304302))) | i13) * 338);
        int i15 = (i14 << 13) ^ i14;
        int i16 = i15 ^ (i15 >>> 17);
        ((int[]) objArr21[1])[0] = i16 ^ (i16 << 5);
        return this.menuInflater;
    }

    public NavigationBarPresenter getPresenter() {
        int i = 2 % 2;
        int i2 = f805a + 79;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        NavigationBarPresenter navigationBarPresenter = this.presenter;
        int i5 = i3 + 93;
        f805a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 59 / 0;
        }
        return navigationBarPresenter;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        int i = 2 % 2;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.menuPresenterState = new Bundle();
        this.menu.savePresenterStates(savedState.menuPresenterState);
        int i2 = f805a + 17;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 50 / 0;
        }
        return savedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        int i = 2 % 2;
        int i2 = f805a;
        int i3 = i2 + 69;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            this.menu.restorePresenterStates(savedState.menuPresenterState);
        } else {
            int i5 = i2 + 5;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                super.onRestoreInstanceState(parcelable);
            } else {
                super.onRestoreInstanceState(parcelable);
                throw null;
            }
        }
    }

    public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context, int i, int i2) {
        Object[] objArr;
        char[] cArr;
        int i3;
        int i4;
        float f;
        float f2;
        int i5;
        int i6;
        int i7;
        char c;
        Class<?> cls;
        Class<?>[] clsArr;
        int i8;
        int i9;
        Object obj;
        Object obj2;
        Object[] objArr2;
        char[] cArr2;
        int i10;
        int i11 = 2;
        int i12 = 2 % 2;
        int i13 = f805a + 1;
        asBinder = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
        if (context != null) {
            try {
                Object[] objArr3 = new Object[1];
                d(new int[]{97, 31, 48, 0}, true, new byte[]{1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1}, objArr3);
                String str = (String) objArr3[0];
                int i14 = f805a;
                int i15 = (i14 & 7) + (i14 | 7);
                int i16 = i15 % 128;
                asBinder = i16;
                int i17 = i15 % 2;
                try {
                    Object[] objArr4 = {str};
                    char[] cArr3 = {30442, 43499, 22967, 42794, 3132, 13450, 48373, 6548, 54433, 38933, 767, 64255, 44538, 43393, 20658, 59887, 38910, 56078, 272, 50467, 18654, 65231, 53914, 48360, 18581, 56404, 63035, 1082, 21977, 10025, 3222, 21098, 2463, 62724, 12503, 41740, 25404, 11007, 16660, 37936};
                    int i18 = i16 + 105;
                    f805a = i18 % 128;
                    int i19 = i18 % 2;
                    int i20 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int i21 = (i20 ^ 38) + ((i20 & 38) << 1);
                    Object[] objArr5 = new Object[1];
                    e(cArr3, i21, objArr5);
                    Class<?> cls2 = Class.forName((String) objArr5[0]);
                    Class<?>[] clsArr2 = new Class[1];
                    LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    int i22 = ~i;
                    clsArr2[0] = String.class;
                    Object objNewInstance = cls2.getDeclaredConstructor(clsArr2).newInstance(objArr4);
                    int[] iArr = {128, 31, 0, 0};
                    int i23 = asBinder;
                    int i24 = (i23 ^ 47) + ((i23 & 47) << 1);
                    f805a = i24 % 128;
                    int i25 = i24 % 2;
                    Object[] objArr6 = new Object[1];
                    d(iArr, false, new byte[]{1, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0}, objArr6);
                    String str2 = (String) objArr6[0];
                    int i26 = asBinder;
                    int i27 = (i26 ^ 7) + ((i26 & 7) << 1);
                    f805a = i27 % 128;
                    try {
                        if (i27 % 2 == 0) {
                            objArr = new Object[0];
                            objArr[1] = str2;
                            cArr = new char[]{30442, 43499, 22967, 42794, 3132, 13450, 48373, 6548, 54433, 38933, 767, 64255, 44538, 43393, 20658, 59887, 38910, 56078, 272, 50467, 18654, 65231, 53914, 48360, 18581, 56404, 63035, 1082, 21977, 10025, 3222, 21098, 2463, 62724, 12503, 41740, 25404, 11007, 16660, 37936};
                            i3 = 25;
                            i4 = 1;
                            f2 = 1.0f;
                            f = 2.0f;
                        } else {
                            objArr = new Object[]{str2};
                            cArr = new char[]{30442, 43499, 22967, 42794, 3132, 13450, 48373, 6548, 54433, 38933, 767, 64255, 44538, 43393, 20658, 59887, 38910, 56078, 272, 50467, 18654, 65231, 53914, 48360, 18581, 56404, 63035, 1082, 21977, 10025, 3222, 21098, 2463, 62724, 12503, 41740, 25404, 11007, 16660, 37936};
                            i3 = 38;
                            i4 = 0;
                            f = 0.0f;
                            f2 = 0.0f;
                        }
                        int i28 = -(TypedValue.complexToFraction(i4, f2, f) > 0.0f ? 1 : (TypedValue.complexToFraction(i4, f2, f) == 0.0f ? 0 : -1));
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        int i29 = asBinder + 99;
                        int i30 = i29 % 128;
                        f805a = i30;
                        if (i29 % 2 == 0) {
                            int i31 = ((i28 | (-518)) << 1) - (i28 ^ (-518));
                            int i32 = -(-i3);
                            int i33 = -(-((i32 & (-518)) + (i32 | (-518))));
                            i5 = (i31 & i33) + (i33 | i31);
                        } else {
                            i5 = ((i28 * (-518)) - (~(-(-(i3 * (-518)))))) - 1;
                        }
                        int i34 = (i30 ^ 65) + ((i30 & 65) << 1);
                        int i35 = i34 % 128;
                        asBinder = i35;
                        if (i34 % 2 != 0) {
                            int i36 = ~i28;
                            int i37 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i38 = ~((i36 ^ i37) | (i36 & i37));
                            int i39 = -(519 % ((i38 & i3) | (i3 ^ i38)));
                            i6 = ((i5 | i39) << 1) - (i39 ^ i5);
                        } else {
                            int i40 = ~i28;
                            int i41 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i42 = ~((i40 ^ i41) | (i40 & i41));
                            int i43 = 519 * ((i42 & i3) | (i3 ^ i42));
                            i6 = ((i5 & i43) << 1) + (i5 ^ i43);
                        }
                        int i44 = ~i28;
                        int i45 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i46 = (i44 & i45) | (i44 ^ i45);
                        int i47 = ~((i46 & i3) | (i46 ^ i3));
                        int i48 = (i28 ^ i3) | (i28 & i3);
                        int i49 = ((i35 | 115) << 1) - (i35 ^ 115);
                        int i50 = i49 % 128;
                        f805a = i50;
                        if (i49 % 2 == 0) {
                            int i51 = ~((i48 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i48 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                            i7 = i6 >>> ((-519) % ((i47 & i51) | (i47 ^ i51)));
                        } else {
                            int i52 = ~((i48 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i48 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                            int i53 = (-519) * ((i47 & i52) | (i47 ^ i52));
                            i7 = (i6 & i53) + (i6 | i53);
                        }
                        int i54 = (i50 ^ 9) + ((i50 & 9) << 1);
                        asBinder = i54 % 128;
                        if (i54 % 2 != 0) {
                            int i55 = i7 + (519 % (i28 | (~((iTuitionPaymentFragmentspecialinlinedviewModeldefault2 & i3) | (i3 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2)))));
                            Object[] objArr7 = new Object[1];
                            e(cArr, i55, objArr7);
                            cls = Class.forName((String) objArr7[0]);
                            clsArr = new Class[1];
                            c = 0;
                        } else {
                            int i56 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault2 & i3) | (i3 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                            int i57 = -(-(519 * ((i28 & i56) | (i28 ^ i56))));
                            int i58 = (i7 & i57) + (i57 | i7);
                            Object[] objArr8 = new Object[1];
                            e(cArr, i58, objArr8);
                            c = 0;
                            cls = Class.forName((String) objArr8[0]);
                            clsArr = new Class[1];
                        }
                        clsArr[c] = String.class;
                        Object objNewInstance2 = cls.getDeclaredConstructor(clsArr).newInstance(objArr);
                        int i59 = f805a;
                        int i60 = (i59 & 105) + (i59 | 105);
                        asBinder = i60 % 128;
                        int i61 = i60 % 2;
                        try {
                            Object[] objArr9 = new Object[1];
                            d(new int[]{159, 23, 41, 9}, true, new byte[]{0, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1}, objArr9);
                            Class<?> cls3 = Class.forName((String) objArr9[0]);
                            int i62 = -Color.green(0);
                            int i63 = (i62 ^ 17) + ((i62 & 17) << 1);
                            Object[] objArr10 = new Object[1];
                            e(new char[]{24213, 63979, 10664, 22089, 34139, 14000, 20511, 6552, 50095, 13571, 22377, 26086, 34270, 33581, 1662, 41758, 'u', 31496, 58058, 31488}, i63, objArr10);
                            Object objInvoke = cls3.getMethod((String) objArr10[0], null).invoke(context, null);
                            int i64 = asBinder + 13;
                            f805a = i64 % 128;
                            int i65 = i64 % 2;
                            try {
                                Object[] objArr11 = new Object[1];
                                d(new int[]{159, 23, 41, 9}, true, new byte[]{0, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1}, objArr11);
                                Class<?> cls4 = Class.forName((String) objArr11[0]);
                                Object[] objArr12 = new Object[1];
                                d(new int[]{182, 14, 0, 0}, false, new byte[]{1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0}, objArr12);
                                try {
                                    Object[] objArr13 = {cls4.getMethod((String) objArr12[0], null).invoke(context, null), 64};
                                    int i66 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                    int i67 = i66 * (-919);
                                    int i68 = ((i67 | (-30327)) << 1) - (i67 ^ (-30327));
                                    int i69 = ~i66;
                                    int i70 = (i69 ^ (-34)) | (i69 & (-34));
                                    int i71 = ~((i70 ^ i) | (i70 & i));
                                    int i72 = ((-34) ^ i22) | ((-34) & i22);
                                    int i73 = ~((i72 ^ i66) | (i72 & i66));
                                    int i74 = i68 + (((i71 ^ i73) | (i73 & i71)) * 920);
                                    int i75 = ~((i69 ^ (-34)) | (i69 & (-34)));
                                    int i76 = ~i66;
                                    int i77 = ~((i76 ^ i22) | (i76 & i22));
                                    int i78 = -(-(((i75 ^ i77) | (i75 & i77)) * 920));
                                    int i79 = (i74 & i78) + (i78 | i74);
                                    int i80 = i76 | (-34);
                                    int i81 = ~i;
                                    int i82 = ~((i80 & i81) | (i80 ^ i81));
                                    int i83 = ~((i69 & 33) | (i69 ^ 33) | i);
                                    int i84 = (i82 & i83) | (i82 ^ i83);
                                    int i85 = i66 | (-34);
                                    int i86 = ~((i85 & i) | (i85 ^ i));
                                    int i87 = ((i84 & i86) | (i84 ^ i86)) * 920;
                                    int i88 = ((i79 | i87) << 1) - (i87 ^ i79);
                                    Object[] objArr14 = new Object[1];
                                    e(new char[]{24715, 58716, 48627, 57103, 44652, 33319, 21447, 50762, 27901, 11372, 43540, 52475, 47632, 28950, 27394, 229, 25869, 19822, 19668, 45217, 9683, 6331, 42255, 12196, 15383, 44404, 17660, 26006, 7301, 13956, 28394, 30752, 29743, 41641, 13927, 13460}, i88, objArr14);
                                    Class<?> cls5 = Class.forName((String) objArr14[0]);
                                    Object[] objArr15 = new Object[1];
                                    d(new int[]{196, 14, 0, 7}, false, new byte[]{1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0}, objArr15);
                                    String str3 = (String) objArr15[0];
                                    Class<?>[] clsArr3 = new Class[2];
                                    int i89 = asBinder;
                                    int i90 = (i89 & 103) + (i89 | 103);
                                    f805a = i90 % 128;
                                    int i91 = i90 % 2;
                                    clsArr3[0] = String.class;
                                    clsArr3[1] = Integer.TYPE;
                                    Object objInvoke2 = cls5.getMethod(str3, clsArr3).invoke(objInvoke, objArr13);
                                    char[] cArr4 = {4969, 13246, 48483, 61529, 47539, 39581, 12073, 785, 4019, 5742, 5194, 1010, 51585, 240, 10447, 10955, 38404, 1814, 41059, 28673, 34326, 7618, 28443, 16752, 24729, 2512, 48222, 1480, 2006, 12480, 55961, 59644};
                                    int pressedStateDuration = ViewConfiguration.getPressedStateDuration() >> 16;
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                    int i92 = pressedStateDuration * 85;
                                    int i93 = (i92 ^ 2550) + ((i92 & 2550) << 1);
                                    int i94 = ~pressedStateDuration;
                                    int i95 = ~((i94 & (-31)) | (i94 ^ (-31)));
                                    int i96 = ~pressedStateDuration;
                                    int i97 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i98 = i95 | (~((i96 & i97) | (i96 ^ i97)));
                                    int i99 = ~((-31) | i97);
                                    int i100 = (i98 ^ i99) | (i98 & i99);
                                    int i101 = (pressedStateDuration ^ 30) | (pressedStateDuration & 30);
                                    int i102 = i101 | iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i103 = f805a;
                                    int i104 = (i103 & 83) + (i103 | 83);
                                    Object obj3 = objNewInstance2;
                                    asBinder = i104 % 128;
                                    if (i104 % 2 != 0) {
                                        int i105 = ~i102;
                                        int i106 = i93 >>> ((-84) / ((i105 & i100) | (i100 ^ i105)));
                                        int i107 = pressedStateDuration | (~(((-31) & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | ((-31) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3)));
                                        int i108 = ~((i97 ^ 30) | (i97 & 30));
                                        i8 = i106 / ((-84) << ((i107 & i108) | (i107 ^ i108)));
                                        i9 = (~iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | 30;
                                    } else {
                                        int i109 = i93 + (((~i102) | i100) * (-84));
                                        int i110 = ~(((-31) & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | ((-31) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                        int i111 = (i110 & pressedStateDuration) | (pressedStateDuration ^ i110);
                                        int i112 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                        int i113 = ~((i112 & 30) | (i112 ^ 30));
                                        int i114 = ((i111 & i113) | (i111 ^ i113)) * (-84);
                                        i8 = ((i109 | i114) << 1) - (i114 ^ i109);
                                        i9 = (i97 ^ 30) | (i97 & 30);
                                    }
                                    int i115 = ~i9;
                                    int i116 = i103 + 37;
                                    asBinder = i116 % 128;
                                    int i117 = i116 % 2;
                                    int i118 = ~i101;
                                    int i119 = i8 + (84 * ((i115 & i118) | (i115 ^ i118)));
                                    Object[] objArr16 = new Object[1];
                                    e(cArr4, i119, objArr16);
                                    Class<?> cls6 = Class.forName((String) objArr16[0]);
                                    Object[] objArr17 = new Object[1];
                                    d(new int[]{210, 10, 67, 0}, true, new byte[]{0, 0, 1, 1, 1, 1, 1, 1, 0, 0}, objArr17);
                                    Object[] objArr18 = (Object[]) cls6.getField((String) objArr17[0]).get(objInvoke2);
                                    int length = objArr18.length;
                                    int i120 = f805a + 43;
                                    asBinder = i120 % 128;
                                    int i121 = i120 % 2;
                                    int i122 = 0;
                                    while (true) {
                                        if (i122 < length) {
                                            int i123 = asBinder;
                                            int i124 = (i123 ^ 9) + ((i123 & 9) << 1);
                                            f805a = i124 % 128;
                                            if (i124 % i11 == 0) {
                                                obj = objArr18[i122];
                                                Object[] objArr19 = new Object[1];
                                                e(new char[]{11659, 23068, 27271, 21676, 39753, 58639, 57423, 29527}, 3 << Drawable.resolveOpacity(0, 1), objArr19);
                                                obj2 = objArr19[0];
                                            } else {
                                                obj = objArr18[i122];
                                                Object[] objArr20 = new Object[1];
                                                e(new char[]{11659, 23068, 27271, 21676, 39753, 58639, 57423, 29527}, 4 - (~(-Drawable.resolveOpacity(0, 0))), objArr20);
                                                obj2 = objArr20[0];
                                            }
                                            String str4 = (String) obj2;
                                            int i125 = f805a;
                                            int i126 = ((i125 | 79) << 1) - (i125 ^ 79);
                                            asBinder = i126 % 128;
                                            if (i126 % i11 != 0) {
                                                try {
                                                    objArr2 = new Object[]{str4};
                                                    cArr2 = new char[]{2469, 13701, 38889, 19001, 48964, 42487, 43899, 41537, 57354, 18796, 12992, 9092, 4305, 5507, 46925, 8492, 23682, 36079, 43502, 55797, 44150, 57819, 26409, 35078, 29500, 63796, 13413, 37285, 38707, 33296, 50785, 60729, 17890, 25313, 22291, 49129, 36529, 41342, 22510, 19660};
                                                    i10 = 1;
                                                } catch (Throwable th) {
                                                    Throwable cause = th.getCause();
                                                    if (cause != null) {
                                                        throw cause;
                                                    }
                                                    throw th;
                                                }
                                            } else {
                                                objArr2 = new Object[]{str4};
                                                cArr2 = new char[]{2469, 13701, 38889, 19001, 48964, 42487, 43899, 41537, 57354, 18796, 12992, 9092, 4305, 5507, 46925, 8492, 23682, 36079, 43502, 55797, 44150, 57819, 26409, 35078, 29500, 63796, 13413, 37285, 38707, 33296, 50785, 60729, 17890, 25313, 22291, 49129, 36529, 41342, 22510, 19660};
                                                i10 = 0;
                                            }
                                            int iRgb = Color.rgb(i10, i10, i10);
                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                            int i127 = iRgb * 371;
                                            int i128 = asBinder;
                                            int i129 = ((i128 | 37) << 1) - (i128 ^ 37);
                                            int i130 = i129 % 128;
                                            f805a = i130;
                                            int i131 = i129 % i11;
                                            int i132 = ((i127 | 1929393567) << 1) - (i127 ^ 1929393567);
                                            int i133 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (-16777254));
                                            int i134 = ~iRgb;
                                            int i135 = i132 + ((i133 | (~((i134 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i134 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4)))) * (-370));
                                            int i136 = ~iRgb;
                                            int i137 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                            int i138 = (i136 ^ i137) | (i136 & i137);
                                            int i139 = (i130 & 109) + (i130 | 109);
                                            asBinder = i139 % 128;
                                            if (i139 % i11 != 0) {
                                                throw null;
                                            }
                                            int i140 = (~i138) | (~((iTuitionPaymentFragmentspecialinlinedviewModeldefault4 & (-16777254)) | ((-16777254) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4)));
                                            int i141 = ~(iRgb | 16777253);
                                            int i142 = -(-((-370) * ((i140 & i141) | (i140 ^ i141))));
                                            int i143 = (i135 & i142) + (i135 | i142);
                                            int i144 = -(-((~((iRgb ^ 16777253) | (16777253 & iRgb))) * 370));
                                            Object[] objArr21 = new Object[1];
                                            e(cArr2, (i143 & i144) + (i144 | i143), objArr21);
                                            Class<?> cls7 = Class.forName((String) objArr21[0]);
                                            Object[] objArr22 = new Object[1];
                                            d(new int[]{220, 11, 0, 7}, true, new byte[]{0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1}, objArr22);
                                            Object objInvoke3 = cls7.getMethod((String) objArr22[0], String.class).invoke(null, objArr2);
                                            try {
                                                int i145 = -TextUtils.indexOf("", "");
                                                int i146 = i145 * 659;
                                                int i147 = (i146 & (-18396)) + (i146 | (-18396));
                                                int i148 = ~((~i145) | 28);
                                                int i149 = ((-29) ^ i145) | ((-29) & i145);
                                                int i150 = ~i149;
                                                int i151 = (i148 ^ i150) | (i150 & i148);
                                                int i152 = ~((i145 ^ i) | (i145 & i));
                                                int i153 = -(-(((i151 ^ i152) | (i151 & i152)) * (-658)));
                                                int i154 = (i147 & i153) + (i153 | i147);
                                                int i155 = (~((i145 & (-29)) | ((-29) ^ i145))) * 658;
                                                int i156 = (i154 ^ i155) + ((i154 & i155) << 1);
                                                int i157 = ((~i149) | i152) * 658;
                                                int i158 = ((i156 | i157) << 1) - (i157 ^ i156);
                                                Object[] objArr23 = new Object[1];
                                                e(new char[]{45340, 58098, 20047, 10281, 39712, 11512, 18283, 35439, 63192, 11479, 50852, 53143, 52937, 26745, 40680, 16349, 23509, 2797, 3987, 59131, 25920, 38126, 17943, 55393, 18896, 65007, 36602, 60922, 15055, 2997}, i158, objArr23);
                                                Class<?> cls8 = Class.forName((String) objArr23[0]);
                                                Object[] objArr24 = new Object[1];
                                                d(new int[]{231, 11, 0, 0}, true, new byte[]{1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1}, objArr24);
                                                try {
                                                    Object[] objArr25 = {new ByteArrayInputStream((byte[]) cls8.getMethod((String) objArr24[0], null).invoke(obj, null))};
                                                    int i159 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                    int i160 = i159 * 765;
                                                    int i161 = (i160 ^ (-56499)) + ((i160 & (-56499)) << 1);
                                                    int i162 = ~((i22 ^ i159) | (i22 & i159));
                                                    int i163 = i161 + (((i162 & 37) | (i162 ^ 37)) * 764);
                                                    int i164 = ~i159;
                                                    int i165 = ~((i164 & 37) | (i164 ^ 37));
                                                    int i166 = ~((i81 ^ 37) | (i81 & 37));
                                                    int i167 = -(-(((i165 ^ i166) | (i165 & i166)) * (-1528)));
                                                    int i168 = (i163 & i167) + (i167 | i163);
                                                    int i169 = ~i159;
                                                    int i170 = ~((i169 & 37) | (i169 ^ 37));
                                                    int i171 = ~((-38) | i159);
                                                    int i172 = (i170 ^ i171) | (i170 & i171);
                                                    int i173 = ~((i159 & i81) | (i81 ^ i159));
                                                    int i174 = -(-(((i173 & i172) | (i172 ^ i173)) * 764));
                                                    int i175 = (i168 ^ i174) + ((i174 & i168) << 1);
                                                    Object[] objArr26 = new Object[1];
                                                    e(new char[]{2469, 13701, 38889, 19001, 48964, 42487, 43899, 41537, 57354, 18796, 12992, 9092, 4305, 5507, 46925, 8492, 23682, 36079, 43502, 55797, 44150, 57819, 26409, 35078, 29500, 63796, 13413, 37285, 38707, 33296, 50785, 60729, 17890, 25313, 22291, 49129, 36529, 41342, 22510, 19660}, i175, objArr26);
                                                    Class<?> cls9 = Class.forName((String) objArr26[0]);
                                                    Object[] objArr27 = new Object[1];
                                                    e(new char[]{14250, 37529, 57119, 27132, 22061, 27878, 37187, 32283, 47127, 48150, 1876, 29102, 44767, 43512, 62351, 57847, 55940, 43823, 62159, 7546, 11363, 29602}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 19, objArr27);
                                                    Object objInvoke4 = cls9.getMethod((String) objArr27[0], InputStream.class).invoke(objInvoke3, objArr25);
                                                    int i176 = f805a + 99;
                                                    asBinder = i176 % 128;
                                                    int i177 = i176 % 2;
                                                    try {
                                                        Object[] objArr28 = new Object[1];
                                                        d(new int[]{242, 34, 0, 0}, true, new byte[]{1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1}, objArr28);
                                                        Class<?> cls10 = Class.forName((String) objArr28[0]);
                                                        int[] iArr2 = {276, 23, 0, 0};
                                                        int i178 = f805a;
                                                        int i179 = (i178 & 99) + (i178 | 99);
                                                        asBinder = i179 % 128;
                                                        int i180 = i179 % 2;
                                                        Object[] objArr29 = new Object[1];
                                                        d(iArr2, true, new byte[]{0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0}, objArr29);
                                                        if (objNewInstance.equals(cls10.getMethod((String) objArr29[0], null).invoke(objInvoke4, null))) {
                                                            break;
                                                        }
                                                        try {
                                                            Object[] objArr30 = new Object[1];
                                                            d(new int[]{242, 34, 0, 0}, true, new byte[]{1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1}, objArr30);
                                                            Class<?> cls11 = Class.forName((String) objArr30[0]);
                                                            Object[] objArr31 = new Object[1];
                                                            d(new int[]{276, 23, 0, 0}, true, new byte[]{0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0}, objArr31);
                                                            Object objInvoke5 = cls11.getMethod((String) objArr31[0], null).invoke(objInvoke4, null);
                                                            Object obj4 = obj3;
                                                            if (obj4.equals(objInvoke5)) {
                                                                break;
                                                            }
                                                            i122 = (i122 | 1) + (i122 & 1);
                                                            int i181 = asBinder;
                                                            int i182 = (i181 & 117) + (i181 | 117);
                                                            f805a = i182 % 128;
                                                            int i183 = i182 % 2;
                                                            obj3 = obj4;
                                                            i11 = 2;
                                                        } catch (Throwable th2) {
                                                            Throwable cause2 = th2.getCause();
                                                            if (cause2 != null) {
                                                                throw cause2;
                                                            }
                                                            throw th2;
                                                        }
                                                    } catch (Throwable th3) {
                                                        Throwable cause3 = th3.getCause();
                                                        if (cause3 != null) {
                                                            throw cause3;
                                                        }
                                                        throw th3;
                                                    }
                                                } catch (Throwable th4) {
                                                    Throwable cause4 = th4.getCause();
                                                    if (cause4 != null) {
                                                        throw cause4;
                                                    }
                                                    throw th4;
                                                }
                                            } catch (Throwable th5) {
                                                Throwable cause5 = th5.getCause();
                                                if (cause5 != null) {
                                                    throw cause5;
                                                }
                                                throw th5;
                                            }
                                        }
                                    }
                                    int i184 = (i & (-2)) | (i22 & 1);
                                    Object[] objArr32 = new Object[4];
                                    int[] iArr3 = new int[1];
                                    objArr32[0] = iArr3;
                                    objArr32[1] = new int[1];
                                    int[] iArr4 = new int[1];
                                    objArr32[2] = iArr4;
                                    int i185 = f805a;
                                    int i186 = ((i185 | 11) << 1) - (i185 ^ 11);
                                    asBinder = i186 % 128;
                                    int i187 = i186 % 2 != 0 ? 127 : 16;
                                    iArr3[0] = i;
                                    int i188 = i185 + 49;
                                    asBinder = i188 % 128;
                                    int i189 = i188 % 2;
                                    iArr4[0] = i184;
                                    objArr32[3] = null;
                                    int startUptimeMillis = (int) Process.getStartUptimeMillis();
                                    int i190 = ~(261867033 | startUptimeMillis);
                                    int i191 = ~startUptimeMillis;
                                    int i192 = i190 | (~(302177262 | i191));
                                    int i193 = ~((-261867034) | i191);
                                    int i194 = 1051229620 + ((i192 | i193) * (-516)) + (((~(startUptimeMillis | (-268442087))) | (~((-33735177) | i191))) * 516) + ((33735176 | i193) * 516);
                                    int i195 = -(-i187);
                                    int i196 = -(-((i194 ^ i195) + ((i195 & i194) << 1)));
                                    int i197 = ((i2 | i196) << 1) - (i2 ^ i196);
                                    int i198 = (i197 << 13) ^ i197;
                                    int i199 = i198 >>> 17;
                                    int i200 = ((~i198) & i199) | ((~i199) & i198);
                                    ((int[]) objArr32[1])[0] = i200 ^ (i200 << 5);
                                    return objArr32;
                                } catch (Throwable th6) {
                                    Throwable cause6 = th6.getCause();
                                    if (cause6 != null) {
                                        throw cause6;
                                    }
                                    throw th6;
                                }
                            } catch (Throwable th7) {
                                Throwable cause7 = th7.getCause();
                                if (cause7 != null) {
                                    throw cause7;
                                }
                                throw th7;
                            }
                        } catch (Throwable th8) {
                            Throwable cause8 = th8.getCause();
                            if (cause8 != null) {
                                throw cause8;
                            }
                            throw th8;
                        }
                    } catch (Throwable th9) {
                        Throwable cause9 = th9.getCause();
                        if (cause9 != null) {
                            throw cause9;
                        }
                        throw th9;
                    }
                } catch (Throwable th10) {
                    Throwable cause10 = th10.getCause();
                    if (cause10 != null) {
                        throw cause10;
                    }
                    throw th10;
                }
            } catch (Throwable unused) {
            }
        }
        Object[] objArr33 = {new int[]{i}, new int[1], new int[]{i}, null};
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i201 = ~iElapsedRealtime;
        int i202 = (~(149019785 | i201)) | 50864726;
        int i203 = ~(iElapsedRealtime | (-10554498));
        int i204 = (((i202 | i203) * (-252)) - 26680708) + ((i203 | (~(i201 | 199884511))) * 252);
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i205 = i204 * TypedValues.PositionType.TYPE_PERCENT_WIDTH;
        int i206 = -(-(i204 * (-502)));
        int i207 = (i205 ^ i206) + ((i205 & i206) << 1);
        int i208 = ~i204;
        int i209 = ~(i208 | ((-1) ^ i208));
        int i210 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        int i211 = ~((i204 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i204 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
        int i212 = (i207 - (~(((i209 & i211) | (i209 ^ i211)) * (-502)))) - 1;
        int i213 = ~(((-1) ^ i210) | i210 | i204);
        int i214 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault5 & i204) | (i204 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
        int i215 = ((i214 & i213) | (i213 ^ i214)) * TypedValues.PositionType.TYPE_DRAWPATH;
        int i216 = -(-((i212 ^ i215) + ((i215 & i212) << 1)));
        int i217 = ((i2 | i216) << 1) - (i2 ^ i216);
        int i218 = (i217 << 13) ^ i217;
        int i219 = i218 >>> 17;
        int i220 = ((~i218) & i219) | ((~i219) & i218);
        int i221 = i220 << 5;
        ((int[]) objArr33[1])[0] = (i220 | i221) & (~(i220 & i221));
        return objArr33;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(short r6, byte r7, int r8) {
        /*
            int r7 = r7 + 4
            int r6 = r6 + 99
            byte[] r0 = com.google.android.material.navigation.NavigationBarView.$$c
            int r8 = r8 * 4
            int r8 = 1 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r6 = r7
            r4 = r8
            r3 = r2
            goto L28
        L13:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L17:
            byte r4 = (byte) r7
            int r6 = r6 + 1
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L26:
            r4 = r0[r6]
        L28:
            int r7 = r7 + r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationBarView.$$i(short, byte, int):java.lang.String");
    }
}
