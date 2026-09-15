package com.google.android.material.navigation;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView;
import androidx.core.util.Pools;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import com.bpjstku.databinding.ItemProgramChosenBinding;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.TextScale;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import defpackage.ViewPortBuilder;
import defpackage.deInitSession;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import kotlin.text.Typography;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes4.dex */
public abstract class NavigationBarMenuView extends ViewGroup implements MenuView {
    private static final int[] CHECKED_STATE_SET;
    private static final int[] DISABLED_STATE_SET;
    private static final int ITEM_POOL_SIZE = 5;
    private static final int NO_PADDING = -1;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static char[] b;
    private final SparseArray<BadgeDrawable> badgeDrawables;
    private NavigationBarItemView[] buttons;
    private ColorStateList itemActiveIndicatorColor;
    private boolean itemActiveIndicatorEnabled;
    private int itemActiveIndicatorHeight;
    private int itemActiveIndicatorLabelPadding;
    private int itemActiveIndicatorMarginHorizontal;
    private boolean itemActiveIndicatorResizeable;
    private ShapeAppearanceModel itemActiveIndicatorShapeAppearance;
    private int itemActiveIndicatorWidth;
    private Drawable itemBackground;
    private int itemBackgroundRes;
    private int itemIconSize;
    private ColorStateList itemIconTint;
    private int itemPaddingBottom;
    private int itemPaddingTop;
    private final Pools.Pool<NavigationBarItemView> itemPool;
    private ColorStateList itemRippleColor;
    private int itemTextAppearanceActive;
    private boolean itemTextAppearanceActiveBoldEnabled;
    private int itemTextAppearanceInactive;
    private final ColorStateList itemTextColorDefault;
    private ColorStateList itemTextColorFromUser;
    private int labelVisibilityMode;
    private MenuBuilder menu;
    private final View.OnClickListener onClickListener;
    private final SparseArray<View.OnTouchListener> onTouchListeners;
    private NavigationBarPresenter presenter;
    private int selectedItemId;
    private int selectedItemPosition;
    private final TransitionSet set;
    private static final byte[] $$c = {1, -81, 2, 79};
    private static final int $$f = 171;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {49, 84, -120, 101, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -59, 6, 10, -13, 20, -14, 12, 7, -11, 72, -63, 7, 14, 1, 1, -11, 72, -48, -12, 10, 62, -60, 1, 14, 2, -4, 65, -73, 3, 26, -12};
    private static final int $$h = 145;
    private static final byte[] $$a = {30, 17, -35, 104, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
    private static final int $$b = 110;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int asBinder = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r0 = 53 - r8
            byte[] r1 = com.google.android.material.navigation.NavigationBarMenuView.$$a
            int r6 = r6 + 4
            int r7 = r7 * 14
            int r7 = r7 + 84
            byte[] r0 = new byte[r0]
            int r8 = 52 - r8
            r2 = 0
            if (r1 != 0) goto L15
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            int r7 = r7 + 1
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationBarMenuView.a(int, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 49
            int r7 = 53 - r7
            byte[] r0 = com.google.android.material.navigation.NavigationBarMenuView.$$g
            int r6 = r6 * 49
            int r1 = r6 + 1
            int r8 = r8 + 98
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2b
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L2b:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r8 + 1
            int r8 = r3 + 3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationBarMenuView.d(short, short, byte, java.lang.Object[]):void");
    }

    protected abstract NavigationBarItemView createNavigationBarItemView(Context context);

    static /* synthetic */ NavigationBarPresenter access$000(NavigationBarMenuView navigationBarMenuView) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 75;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        NavigationBarPresenter navigationBarPresenter = navigationBarMenuView.presenter;
        int i5 = i2 + 75;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return navigationBarPresenter;
    }

    static /* synthetic */ MenuBuilder access$100(NavigationBarMenuView navigationBarMenuView) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        MenuBuilder menuBuilder = navigationBarMenuView.menu;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return menuBuilder;
        }
        obj.hashCode();
        throw null;
    }

    static {
        TuitionPaymentFragmentbindingInflater1 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        CHECKED_STATE_SET = new int[]{R.attr.state_checked};
        DISABLED_STATE_SET = new int[]{-16842910};
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 97;
        TuitionPaymentFragmentbindingInflater1 = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x00a0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x00a1  */
    public NavigationBarMenuView(Context context) {
        int i;
        super(context);
        this.itemPool = new Pools.SynchronizedPool(5);
        this.onTouchListeners = new SparseArray<>(5);
        this.selectedItemId = 0;
        this.selectedItemPosition = 0;
        this.badgeDrawables = new SparseArray<>(5);
        this.itemPaddingTop = -1;
        this.itemPaddingBottom = -1;
        this.itemActiveIndicatorLabelPadding = -1;
        this.itemActiveIndicatorResizeable = false;
        this.itemTextColorDefault = createDefaultColorStateList(R.attr.textColorSecondary);
        if (isInEditMode()) {
            this.set = null;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
            }
            this.onClickListener = new View.OnClickListener() { // from class: com.google.android.material.navigation.NavigationBarMenuView.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                    try {
                        MenuItemImpl itemData = ((NavigationBarItemView) view).getItemData();
                        if (!NavigationBarMenuView.access$100(NavigationBarMenuView.this).performItemAction(itemData, NavigationBarMenuView.access$000(NavigationBarMenuView.this), 0)) {
                            itemData.setChecked(true);
                        }
                    } finally {
                        ViewPortBuilder.b();
                    }
                }
            };
            ViewCompat.setImportantForAccessibility(this, 1);
            i = asBinder + 25;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
        AutoTransition autoTransition = new AutoTransition();
        this.set = autoTransition;
        autoTransition.setOrdering(0);
        autoTransition.setDuration(MotionUtils.resolveThemeDuration(getContext(), com.google.android.material.R.attr.motionDurationMedium4, getResources().getInteger(com.google.android.material.R.integer.material_motion_duration_long_1)));
        autoTransition.setInterpolator(MotionUtils.resolveThemeInterpolator(getContext(), com.google.android.material.R.attr.motionEasingStandard, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        autoTransition.addTransition(new TextScale());
        int i3 = asBinder + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = 2 % 2;
        this.onClickListener = new View.OnClickListener() { // from class: com.google.android.material.navigation.NavigationBarMenuView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    MenuItemImpl itemData = ((NavigationBarItemView) view).getItemData();
                    if (!NavigationBarMenuView.access$100(NavigationBarMenuView.this).performItemAction(itemData, NavigationBarMenuView.access$000(NavigationBarMenuView.this), 0)) {
                        itemData.setChecked(true);
                    }
                } finally {
                    ViewPortBuilder.b();
                }
            }
        };
        ViewCompat.setImportantForAccessibility(this, 1);
        i = asBinder + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public void initialize(MenuBuilder menuBuilder) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        this.menu = menuBuilder;
        int i5 = i2 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i = 2 % 2;
        int i2 = asBinder + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(1, this.menu.getVisibleItems().size(), false, 1));
        int i4 = asBinder + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 31;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            this.itemIconTint = colorStateList;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.itemIconTint = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            int i4 = i2 + 51;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 105;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
                navigationBarItemView.setIconTintList(colorStateList);
            }
        }
    }

    public ColorStateList getIconTintList() {
        int i = 2 % 2;
        int i2 = asBinder + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.itemIconTint;
        }
        throw null;
    }

    public void setItemIconSize(int i) {
        int i2 = 2 % 2;
        this.itemIconSize = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            int length = navigationBarItemViewArr.length;
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 0;
            while (i5 < length) {
                int i6 = asBinder + 95;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
                if (i6 % 2 != 0) {
                    navigationBarItemViewArr[i5].setIconSize(i);
                    i5 += 83;
                } else {
                    navigationBarItemViewArr[i5].setIconSize(i);
                    i5++;
                }
            }
        }
    }

    public int getItemIconSize() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        int i5 = this.itemIconSize;
        int i6 = i3 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        int i = 2 % 2;
        this.itemTextColorFromUser = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 77;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 79;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                navigationBarItemView.setTextColor(colorStateList);
            }
        }
    }

    public ColorStateList getItemTextColor() {
        int i = 2 % 2;
        int i2 = asBinder + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        ColorStateList colorStateList = this.itemTextColorFromUser;
        if (i3 != 0) {
            int i4 = 35 / 0;
        }
        return colorStateList;
    }

    public void setItemTextAppearanceInactive(int i) {
        int i2 = 2 % 2;
        this.itemTextAppearanceInactive = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            int i3 = asBinder + 15;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                navigationBarItemView.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.itemTextColorFromUser;
                if (colorStateList != null) {
                    navigationBarItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public int getItemTextAppearanceInactive() {
        int i = 2 % 2;
        int i2 = asBinder + 103;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = this.itemTextAppearanceInactive;
        int i5 = i3 + 125;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    private static void c(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = b;
        int i4 = 1770390596;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 2267;
                        int threadPriority = 33 - ((Process.getThreadPriority(0) + 20) >> 6);
                        byte b3 = (byte) ($$c[0] - 1);
                        byte b4 = (byte) (b3 + 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cNormalizeMetaState, iNormalizeMetaState, threadPriority, -1927765101, false, $$i(b3, b4, (byte) (b4 - 3)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i5++;
                    i4 = 1770390596;
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
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
            int windowTouchSlop = 2267 - (ViewConfiguration.getWindowTouchSlop() >> 8);
            int iIndexOf = 33 - TextUtils.indexOf("", "", 0, 0);
            byte b5 = (byte) ($$c[0] - 1);
            byte b6 = (byte) (b5 + 3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, windowTouchSlop, iIndexOf, -1927765101, false, $$i(b5, b6, (byte) (b6 - 3)), new Class[]{Integer.TYPE});
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
            int i6 = $11 + 13;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            } else {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            }
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    int i7 = $10 + 79;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b << b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 >>> b2);
                    } else {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                    }
                    obj = obj2;
                } else {
                    Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char c = (char) (49267 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                        int doubleTapTimeout = 3261 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 30;
                        byte[] bArr = $$c;
                        byte b7 = (byte) (bArr[0] - 1);
                        byte b8 = bArr[2];
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, doubleTapTimeout, iCombineMeasuredStates, -127612708, false, $$i(b7, b8, (byte) (b8 - 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char mirror = (char) (22926 - AndroidCharacter.getMirror('0'));
                            int i8 = 594 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            int i9 = 18 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            byte b9 = (byte) ($$c[0] - 1);
                            byte b10 = b9;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(mirror, i8, i9, 1570859318, false, $$i(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        int i10 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i10];
                        int i11 = $11 + 37;
                        $10 = i11 % 128;
                        if (i11 % 2 != 0) {
                            int i12 = 5 / 2;
                        }
                    } else {
                        obj = null;
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            int i13 = $11 + 23;
                            $10 = i13 % 128;
                            int i14 = i13 % 2;
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i15 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i16 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i15];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i16];
                        } else {
                            int i17 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i18 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i17];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i18];
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                obj2 = obj;
            }
        }
        int i19 = 0;
        while (i19 < i) {
            int i20 = $10 + 43;
            $11 = i20 % 128;
            if (i20 % 2 == 0) {
                cArr4[i19] = (char) (cArr4[i19] ^ 26587);
                i19 += 41;
            } else {
                cArr4[i19] = (char) (cArr4[i19] ^ 13722);
                i19++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    public void setItemTextAppearanceActive(int i) {
        int i2 = 2 % 2;
        this.itemTextAppearanceActive = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
            asBinder = i3 % 128;
            int i4 = 0;
            int length = i3 % 2 == 0 ? navigationBarItemViewArr.length : navigationBarItemViewArr.length;
            while (i4 < length) {
                NavigationBarItemView navigationBarItemView = navigationBarItemViewArr[i4];
                navigationBarItemView.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.itemTextColorFromUser;
                if (colorStateList != null) {
                    int i5 = asBinder + 113;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
                    int i6 = i5 % 2;
                    navigationBarItemView.setTextColor(colorStateList);
                    if (i6 != 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                }
                i4++;
                int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 79;
                asBinder = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 2 / 3;
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            this.itemTextAppearanceActiveBoldEnabled = z;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.itemTextAppearanceActiveBoldEnabled = z;
        NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            int length = navigationBarItemViewArr.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = asBinder + 87;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                if (i4 % 2 != 0) {
                    navigationBarItemViewArr[i3].setTextAppearanceActiveBoldEnabled(z);
                    i3 += 62;
                } else {
                    navigationBarItemViewArr[i3].setTextAppearanceActiveBoldEnabled(z);
                    i3++;
                }
            }
        }
    }

    public int getItemTextAppearanceActive() {
        int i = 2 % 2;
        int i2 = asBinder + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.itemTextAppearanceActive;
        }
        throw null;
    }

    public void setItemBackgroundRes(int i) {
        int i2 = 2 % 2;
        this.itemBackgroundRes = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i4 = i3 + 63;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 71;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemBackground(i);
            }
        }
        int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
        asBinder = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 69 / 0;
        }
    }

    public int getItemPaddingTop() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 19;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = this.itemPaddingTop;
        int i5 = i2 + 75;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public void setItemPaddingTop(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 33;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        this.itemPaddingTop = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            int length = navigationBarItemViewArr.length;
            int i5 = 0;
            while (i5 < length) {
                navigationBarItemViewArr[i5].setItemPaddingTop(i);
                i5++;
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
            }
        }
    }

    public int getItemPaddingBottom() {
        int i = 2 % 2;
        int i2 = asBinder + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.itemPaddingBottom;
        if (i3 != 0) {
            int i5 = 56 / 0;
        }
        return i4;
    }

    public void setItemPaddingBottom(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            this.itemPaddingBottom = i;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.itemPaddingBottom = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            int length = navigationBarItemViewArr.length;
            int i4 = 0;
            while (i4 < length) {
                int i5 = asBinder + 35;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
                if (i5 % 2 != 0) {
                    navigationBarItemViewArr[i4].setItemPaddingBottom(i);
                    i4 += 52;
                } else {
                    navigationBarItemViewArr[i4].setItemPaddingBottom(i);
                    i4++;
                }
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
            }
        }
    }

    public int getActiveIndicatorLabelPadding() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        int i5 = this.itemActiveIndicatorLabelPadding;
        int i6 = i3 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public void setActiveIndicatorLabelPadding(int i) {
        int i2 = 2 % 2;
        this.itemActiveIndicatorLabelPadding = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            int length = navigationBarItemViewArr.length;
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 0;
            while (i5 < length) {
                int i6 = asBinder + 59;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
                if (i6 % 2 != 0) {
                    navigationBarItemViewArr[i5].setActiveIndicatorLabelPadding(i);
                    i5 += 66;
                } else {
                    navigationBarItemViewArr[i5].setActiveIndicatorLabelPadding(i);
                    i5++;
                }
            }
        }
    }

    public boolean getItemActiveIndicatorEnabled() {
        boolean z;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 9;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            z = this.itemActiveIndicatorEnabled;
            int i4 = 64 / 0;
        } else {
            z = this.itemActiveIndicatorEnabled;
        }
        int i5 = i2 + 85;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        this.itemActiveIndicatorEnabled = z;
        NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            int i5 = i3 + 109;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorEnabled(z);
            }
        }
    }

    public int getItemActiveIndicatorWidth() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        int i5 = this.itemActiveIndicatorWidth;
        int i6 = i3 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 93 / 0;
        }
        return i5;
    }

    public void setItemActiveIndicatorWidth(int i) {
        NavigationBarItemView[] navigationBarItemViewArr;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 117;
        int i4 = i3 % 128;
        asBinder = i4;
        if (i3 % 2 == 0) {
            this.itemActiveIndicatorWidth = i;
            navigationBarItemViewArr = this.buttons;
            int i5 = 69 / 0;
            if (navigationBarItemViewArr == null) {
                return;
            }
        } else {
            this.itemActiveIndicatorWidth = i;
            navigationBarItemViewArr = this.buttons;
            if (navigationBarItemViewArr == null) {
                return;
            }
        }
        int i6 = i4 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
        int i7 = i6 % 2;
        for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
            navigationBarItemView.setActiveIndicatorWidth(i);
        }
    }

    public int getItemActiveIndicatorHeight() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        int i5 = this.itemActiveIndicatorHeight;
        int i6 = i3 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setItemActiveIndicatorHeight(int i) {
        int length;
        int i2;
        int i3 = 2 % 2;
        this.itemActiveIndicatorHeight = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                length = navigationBarItemViewArr.length;
                i2 = 1;
            } else {
                length = navigationBarItemViewArr.length;
                i2 = 0;
            }
            while (i2 < length) {
                int i5 = asBinder + 103;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
                if (i5 % 2 != 0) {
                    navigationBarItemViewArr[i2].setActiveIndicatorHeight(i);
                    i2 += 106;
                } else {
                    navigationBarItemViewArr[i2].setActiveIndicatorHeight(i);
                    i2++;
                }
            }
        }
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        int i = 2 % 2;
        int i2 = asBinder + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.itemActiveIndicatorMarginHorizontal;
        if (i3 != 0) {
            int i5 = 15 / 0;
        }
        return i4;
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        int i2 = 2 % 2;
        this.itemActiveIndicatorMarginHorizontal = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i4 = i3 + 31;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 103;
            asBinder = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 5 / 4;
            }
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorMarginHorizontal(i);
            }
        }
    }

    public ShapeAppearanceModel getItemActiveIndicatorShapeAppearance() {
        int i = 2 % 2;
        int i2 = asBinder + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.itemActiveIndicatorShapeAppearance;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0244  */
    public void setItemActiveIndicatorShapeAppearance(ShapeAppearanceModel shapeAppearanceModel) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (31533 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 921;
            int touchSlop = 28 - (ViewConfiguration.getTouchSlop() >> 8);
            Object[] objArr3 = new Object[1];
            a((short) 141, $$a[28], (byte) 52, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, minimumFlingVelocity, touchSlop, -1048449946, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(new char[]{21, 18, 24, '\t', 17, 1, 26, '\t', 14, 16, 14, 2, '\t', 17, '\r', 30, 18, 1, 17, 14, 3, '\b'}, (byte) (55 - TextUtils.lastIndexOf("", '0')), 22 - TextUtils.getTrimmedLength(""), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(new char[]{Typography.quote, '\r', 18, ' ', '\r', '!', 25, 3, ' ', 19, 17, '\r', 1, 23, 13854}, (byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 30), (ViewConfiguration.getScrollBarSize() >> 8) + 15, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 31533);
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 921;
            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 28;
            byte b2 = $$a[7];
            Object[] objArr6 = new Object[1];
            a((short) 89, b2, b2, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveOpacity, maximumFlingVelocity, iResolveOpacity, -778300370, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = asBinder + 25;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char windowTouchSlop = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 31533);
                int keyRepeatTimeout = 921 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int i4 = 29 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                short s = $$a[7];
                byte b3 = (byte) s;
                Object[] objArr7 = new Object[1];
                a(s, b3, (byte) (b3 | 15), objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(windowTouchSlop, keyRepeatTimeout, i4, -1142834547, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i5 = ~iMaxMemory;
            int i6 = (-1200012581) + ((536971393 | i5) * (-192)) + (((~((-1188984091) | i5)) | 48124160) * (-384)) + (((~(iMaxMemory | 1725955483)) | (~(i5 | (-1140859931))) | (~((-48124161) | iMaxMemory))) * DerHeader.TAG_CLASS_PRIVATE) + 275912474;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            c(new char[]{21, 18, 24, '\t', 17, 1, 26, '\t', 18, ' ', ' ', 6, '\b', 4, 17, 0, 5, 0, 17, 6, 21, Typography.quote, 7, 30, 21, 26}, (byte) (57 - KeyEvent.keyCodeFromString("")), 25 - ImageFormat.getBitsPerPixel(0), objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c(new char[]{0, 20, 13857, 13857, '#', 19, 16, 6, 13859, 13859, 17, 4, '\b', 26, 17, 0, 17, 19}, (byte) ('i' - AndroidCharacter.getMirror('0')), 18 - TextUtils.getTrimmedLength(""), objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i9 = asBinder;
                int i10 = i9 + 45;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i10 % 128;
                int i11 = i10 % 2;
                if (applicationContext instanceof ContextWrapper) {
                    int i12 = i9 + 109;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i12 % 128;
                    if (i12 % 2 != 0) {
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
            Object[] objArr11 = new Object[1];
            c(new char[]{26, 22, 2, 22, '\n', 14, 21, 18, 2, '\t', '#', '\b', 16, '\r', 1, 25}, (byte) (View.MeasureSpec.getMode(0) + 15), TextUtils.lastIndexOf("", '0', 0, 0) + 17, objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            c(new char[]{3, 29, '#', 19, 17, 0, 17, 6, ' ', 22, 21, 3, 1, '\f', 25, '!'}, (byte) (108 - ExpandableListView.getPackedPositionGroup(0L)), 16 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr12);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue();
            int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
            asBinder = i13 % 128;
            int i14 = i13 % 2;
            try {
                Object[] objArr13 = {applicationContext, Integer.valueOf(iIntValue), 0, 275912474};
                byte[] bArr = $$g;
                byte b4 = bArr[35];
                byte b5 = b4;
                Object[] objArr14 = new Object[1];
                d(b4, b5, b5, objArr14);
                Class<?> cls4 = Class.forName((String) objArr14[0]);
                byte b6 = (byte) (bArr[35] - 1);
                byte b7 = b6;
                Object[] objArr15 = new Object[1];
                d(b6, b7, b7, objArr15);
                objArr = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char packedPositionGroup = (char) (31533 - ExpandableListView.getPackedPositionGroup(0L));
                    int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 921;
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 29;
                    short s2 = $$a[7];
                    byte b8 = (byte) s2;
                    Object[] objArr16 = new Object[1];
                    a(s2, b8, (byte) (b8 | 15), objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionGroup, touchSlop2, iIndexOf, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr17 = new Object[1];
                    c(new char[]{21, 18, 24, '\t', 17, 1, 26, '\t', 14, 16, 14, 2, '\t', 17, '\r', 30, 18, 1, 17, 14, 3, '\b'}, (byte) (55 - TextUtils.lastIndexOf("", '0', 0)), TextUtils.indexOf((CharSequence) "", '0') + 23, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    c(new char[]{Typography.quote, '\r', 18, ' ', '\r', '!', 25, 3, ' ', 19, 17, '\r', 1, 23, 13854}, (byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 31), 14 - ExpandableListView.getPackedPositionChild(0L), objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char capsMode = (char) (31533 - TextUtils.getCapsMode("", 0, 0));
                        int iLastIndexOf = 920 - TextUtils.lastIndexOf("", '0', 0);
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 28;
                        byte b9 = $$a[7];
                        Object[] objArr19 = new Object[1];
                        a((short) 89, b9, b9, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(capsMode, iLastIndexOf, iKeyCodeFromString, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 31533);
                        int i15 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 921;
                        int absoluteGravity = 28 - Gravity.getAbsoluteGravity(0, 0);
                        Object[] objArr20 = new Object[1];
                        a((short) 141, $$a[28], (byte) 52, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cNormalizeMetaState, i15, absoluteGravity, -1048449946, false, (String) objArr20[0], null);
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
        int i16 = ((int[]) objArr[1])[0];
        int i17 = ((int[]) objArr[3])[0];
        if (i17 == i16) {
            int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
            asBinder = i18 % 128;
            int i19 = i18 % 2;
            int i20 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iNextInt = new Random().nextInt(305959388);
            int i21 = i20 + 2050693311 + (((~((-1077469077) | iNextInt)) | (-696610568)) * (-948)) + ((~((~iNextInt) | (-20229))) * (-948)) + 780707596;
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr2[0])[0] = i23 ^ (i23 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str : strArr) {
                    int i24 = asBinder + 101;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i24 % 128;
                    int i25 = i24 % 2;
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i17 / (((i17 - 1) * i17) % 2), 0).show();
            int i26 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i27 = i26 + (((~((-696255490) | startElapsedRealtime)) * 521) - 1276988544) + (((~((~startElapsedRealtime) | (-696255490))) | 1073752322) * 521);
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr2[0])[0] = i29 ^ (i29 << 5);
        }
        this.itemActiveIndicatorShapeAppearance = shapeAppearanceModel;
        NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            int length = navigationBarItemViewArr.length;
            int i30 = ((int[]) objArr2[0])[0];
            int i31 = i30 * i30;
            int i32 = -(336791862 * i30);
            int i33 = (i31 ^ i32) + ((i31 & i32) << 1);
            int i34 = -(i30 * 1958962296);
            int i35 = ((i33 & i34) + (i34 | i33)) - (-460941457);
            int i36 = ((i35 >> 21) - 4095) / 2048;
            int i37 = ((i36 | 1) << 1) - (i36 ^ 1);
            int i38 = (i35 & i37) + (i37 | i35);
            int i39 = i35 >> 20;
            int i40 = ((i39 ^ (-8191)) + ((i39 & (-8191)) << 1)) / 4096;
            int i41 = (-(i38 ^ ((i40 & 1) + (i40 | 1)))) + 9;
            int i42 = i41 >> 27;
            int i43 = (((i42 ^ (-63)) + ((i42 & (-63)) << 1)) / 32) + 1;
            for (int i44 = 0 / ((i41 & (-((i43 ^ 1) + ((i43 & 1) << 1)))) * 1047); i44 < length; i44++) {
                navigationBarItemViewArr[i44].setActiveIndicatorDrawable(createItemActiveIndicatorDrawable());
            }
        }
    }

    protected boolean isItemActiveIndicatorResizeable() {
        boolean z;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 == 0) {
            z = this.itemActiveIndicatorResizeable;
            int i4 = 55 / 0;
        } else {
            z = this.itemActiveIndicatorResizeable;
        }
        int i5 = i3 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    protected void setItemActiveIndicatorResizeable(boolean z) {
        int i = 2 % 2;
        this.itemActiveIndicatorResizeable = z;
        NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 105;
            int i3 = i2 % 128;
            asBinder = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 15;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorResizeable(z);
            }
        }
    }

    public ColorStateList getItemActiveIndicatorColor() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ColorStateList colorStateList = this.itemActiveIndicatorColor;
        int i4 = i3 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 38 / 0;
        }
        return colorStateList;
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = asBinder + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            this.itemActiveIndicatorColor = colorStateList;
            throw null;
        }
        this.itemActiveIndicatorColor = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            int length = navigationBarItemViewArr.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = asBinder + 35;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                if (i4 % 2 != 0) {
                    navigationBarItemViewArr[i3].setActiveIndicatorDrawable(createItemActiveIndicatorDrawable());
                    i3 += 115;
                } else {
                    navigationBarItemViewArr[i3].setActiveIndicatorDrawable(createItemActiveIndicatorDrawable());
                    i3++;
                }
            }
        }
    }

    private Drawable createItemActiveIndicatorDrawable() {
        int i = 2 % 2;
        if (this.itemActiveIndicatorShapeAppearance != null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 117;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            if (this.itemActiveIndicatorColor != null) {
                MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.itemActiveIndicatorShapeAppearance);
                materialShapeDrawable.setFillColor(this.itemActiveIndicatorColor);
                return materialShapeDrawable;
            }
        }
        int i4 = asBinder + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    @Deprecated
    public int getItemBackgroundRes() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 89;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.itemBackgroundRes;
        int i6 = i2 + 71;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public void setItemBackground(Drawable drawable) {
        NavigationBarItemView[] navigationBarItemViewArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 13;
        asBinder = i2 % 128;
        int i3 = 0;
        if (i2 % 2 == 0) {
            this.itemBackground = drawable;
            navigationBarItemViewArr = this.buttons;
            int i4 = 30 / 0;
            if (navigationBarItemViewArr == null) {
                return;
            }
        } else {
            this.itemBackground = drawable;
            navigationBarItemViewArr = this.buttons;
            if (navigationBarItemViewArr == null) {
                return;
            }
        }
        int length = navigationBarItemViewArr.length;
        while (i3 < length) {
            int i5 = asBinder + 105;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            if (i5 % 2 != 0) {
                navigationBarItemViewArr[i3].setItemBackground(drawable);
                i3 += 8;
            } else {
                navigationBarItemViewArr[i3].setItemBackground(drawable);
                i3++;
            }
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        int i = 2 % 2;
        this.itemRippleColor = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i3 = i2 + 87;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            int length = navigationBarItemViewArr.length;
            int i5 = i2 + 3;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 0;
            while (i7 < length) {
                int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 105;
                asBinder = i8 % 128;
                if (i8 % 2 == 0) {
                    navigationBarItemViewArr[i7].setItemRippleColor(colorStateList);
                    i7 += 124;
                } else {
                    navigationBarItemViewArr[i7].setItemRippleColor(colorStateList);
                    i7++;
                }
            }
        }
        int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
        asBinder = i9 % 128;
        int i10 = i9 % 2;
    }

    public ColorStateList getItemRippleColor() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 117;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        ColorStateList colorStateList = this.itemRippleColor;
        int i5 = i3 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 99 / 0;
        }
        return colorStateList;
    }

    public Drawable getItemBackground() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 53;
        int i4 = i3 % 128;
        asBinder = i4;
        int i5 = i3 % 2;
        NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr == null || navigationBarItemViewArr.length <= 0) {
            Drawable drawable = this.itemBackground;
            int i6 = i2 + 15;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            return drawable;
        }
        int i8 = i4 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
        int i9 = i8 % 2;
        return navigationBarItemViewArr[0].getBackground();
    }

    public void setLabelVisibilityMode(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 25;
        int i4 = i3 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4;
        int i5 = i3 % 2;
        this.labelVisibilityMode = i;
        int i6 = i4 + 1;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
    }

    public int getLabelVisibilityMode() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return this.labelVisibilityMode;
        }
        throw null;
    }

    public void setItemOnTouchListener(int i, View.OnTouchListener onTouchListener) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 91;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (onTouchListener == null) {
            this.onTouchListeners.remove(i);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        } else {
            this.onTouchListeners.put(i, onTouchListener);
        }
        NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                int i6 = asBinder + 67;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
                int i7 = i6 % 2;
                if (navigationBarItemView.getItemData().getItemId() == i) {
                    navigationBarItemView.setOnTouchListener(onTouchListener);
                }
            }
        }
    }

    public ColorStateList createDefaultColorStateList(int i) {
        int i2 = 2 % 2;
        TypedValue typedValue = new TypedValue();
        Object obj = null;
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            int i3 = asBinder + 79;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            if (i3 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        ColorStateList colorStateList = AppCompatResources.getColorStateList(getContext(), typedValue.resourceId);
        if (getContext().getTheme().resolveAttribute(androidx.appcompat.R.attr.colorPrimary, typedValue, true)) {
            int i4 = typedValue.data;
            int defaultColor = colorStateList.getDefaultColor();
            int[] iArr = DISABLED_STATE_SET;
            return new ColorStateList(new int[][]{iArr, CHECKED_STATE_SET, EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i4, defaultColor});
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 61;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public void setPresenter(NavigationBarPresenter navigationBarPresenter) {
        int i = 2 % 2;
        int i2 = asBinder + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        this.presenter = navigationBarPresenter;
        if (i3 != 0) {
            int i4 = 60 / 0;
        }
    }

    public void buildMenuView() throws Throwable {
        int i = 2 % 2;
        removeAllViews();
        NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            int i2 = asBinder + 57;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int length = i2 % 2 != 0 ? navigationBarItemViewArr.length : navigationBarItemViewArr.length;
            for (int i3 = 0; i3 < length; i3++) {
                NavigationBarItemView navigationBarItemView = navigationBarItemViewArr[i3];
                if (navigationBarItemView != null) {
                    this.itemPool.release(navigationBarItemView);
                    navigationBarItemView.clear();
                }
            }
        }
        if (this.menu.size() == 0) {
            int i4 = asBinder + 49;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            this.selectedItemId = 0;
            this.selectedItemPosition = 0;
            this.buttons = null;
            return;
        }
        removeUnusedBadges();
        this.buttons = new NavigationBarItemView[this.menu.size()];
        boolean zIsShifting = isShifting(this.labelVisibilityMode, this.menu.getVisibleItems().size());
        for (int i6 = 0; i6 < this.menu.size(); i6++) {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            this.presenter.setUpdateSuspended(true);
            this.menu.getItem(i6).setCheckable(true);
            this.presenter.setUpdateSuspended(false);
            NavigationBarItemView newItem = getNewItem();
            this.buttons[i6] = newItem;
            newItem.setIconTintList(this.itemIconTint);
            newItem.setIconSize(this.itemIconSize);
            newItem.setTextColor(this.itemTextColorDefault);
            newItem.setTextAppearanceInactive(this.itemTextAppearanceInactive);
            newItem.setTextAppearanceActive(this.itemTextAppearanceActive);
            newItem.setTextAppearanceActiveBoldEnabled(this.itemTextAppearanceActiveBoldEnabled);
            newItem.setTextColor(this.itemTextColorFromUser);
            int i9 = this.itemPaddingTop;
            if (i9 != -1) {
                newItem.setItemPaddingTop(i9);
            }
            int i10 = this.itemPaddingBottom;
            if (i10 != -1) {
                int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
                asBinder = i11 % 128;
                int i12 = i11 % 2;
                newItem.setItemPaddingBottom(i10);
            }
            int i13 = this.itemActiveIndicatorLabelPadding;
            if (i13 != -1) {
                newItem.setActiveIndicatorLabelPadding(i13);
            }
            newItem.setActiveIndicatorWidth(this.itemActiveIndicatorWidth);
            newItem.setActiveIndicatorHeight(this.itemActiveIndicatorHeight);
            newItem.setActiveIndicatorMarginHorizontal(this.itemActiveIndicatorMarginHorizontal);
            newItem.setActiveIndicatorDrawable(createItemActiveIndicatorDrawable());
            newItem.setActiveIndicatorResizeable(this.itemActiveIndicatorResizeable);
            newItem.setActiveIndicatorEnabled(this.itemActiveIndicatorEnabled);
            Drawable drawable = this.itemBackground;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.itemBackgroundRes);
            }
            newItem.setItemRippleColor(this.itemRippleColor);
            newItem.setShifting(zIsShifting);
            newItem.setLabelVisibilityMode(this.labelVisibilityMode);
            MenuItemImpl menuItemImpl = (MenuItemImpl) this.menu.getItem(i6);
            newItem.initialize(menuItemImpl, 0);
            newItem.setItemPosition(i6);
            int itemId = menuItemImpl.getItemId();
            newItem.setOnTouchListener(this.onTouchListeners.get(itemId));
            newItem.setOnClickListener(this.onClickListener);
            int i14 = this.selectedItemId;
            if (i14 != 0) {
                int i15 = asBinder + 43;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i15 % 128;
                int i16 = i15 % 2;
                if (itemId == i14) {
                    this.selectedItemPosition = i6;
                }
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int iMin = Math.min(this.menu.size() - 1, this.selectedItemPosition);
        this.selectedItemPosition = iMin;
        this.menu.getItem(iMin).setChecked(true);
    }

    public void updateMenuView() throws Throwable {
        TransitionSet transitionSet;
        int i = 2 % 2;
        MenuBuilder menuBuilder = this.menu;
        Object obj = null;
        if (menuBuilder != null && this.buttons != null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                menuBuilder.size();
                int length = this.buttons.length;
                obj.hashCode();
                throw null;
            }
            int size = menuBuilder.size();
            if (size != this.buttons.length) {
                buildMenuView();
                return;
            }
            int i3 = this.selectedItemId;
            for (int i4 = 0; i4 < size; i4++) {
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
                asBinder = i5 % 128;
                if (i5 % 2 == 0) {
                    this.menu.getItem(i4).isChecked();
                    obj.hashCode();
                    throw null;
                }
                MenuItem item = this.menu.getItem(i4);
                if (item.isChecked()) {
                    this.selectedItemId = item.getItemId();
                    this.selectedItemPosition = i4;
                }
            }
            if (i3 != this.selectedItemId && (transitionSet = this.set) != null) {
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
                TransitionManager.beginDelayedTransition(this, transitionSet);
                int i8 = asBinder + 33;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
                int i9 = i8 % 2;
            }
            boolean zIsShifting = isShifting(this.labelVisibilityMode, this.menu.getVisibleItems().size());
            for (int i10 = 0; i10 < size; i10++) {
                int i11 = asBinder + 29;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
                int i12 = i11 % 2;
                this.presenter.setUpdateSuspended(true);
                this.buttons[i10].setLabelVisibilityMode(this.labelVisibilityMode);
                this.buttons[i10].setShifting(zIsShifting);
                this.buttons[i10].initialize((MenuItemImpl) this.menu.getItem(i10), 0);
                this.presenter.setUpdateSuspended(false);
            }
        }
        int i13 = asBinder + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i13 % 128;
        if (i13 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    private NavigationBarItemView getNewItem() {
        NavigationBarItemView navigationBarItemViewAcquire;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            navigationBarItemViewAcquire = this.itemPool.acquire();
            int i3 = 59 / 0;
            if (navigationBarItemViewAcquire == null) {
                navigationBarItemViewAcquire = createNavigationBarItemView(getContext());
            }
        } else {
            navigationBarItemViewAcquire = this.itemPool.acquire();
            if (navigationBarItemViewAcquire == null) {
                navigationBarItemViewAcquire = createNavigationBarItemView(getContext());
            }
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return navigationBarItemViewAcquire;
        }
        throw null;
    }

    public int getSelectedItemId() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 117;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return this.selectedItemId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    void tryRestoreSelectedItemId(int i) {
        int i2 = 2 % 2;
        int size = this.menu.size();
        int i3 = 0;
        while (i3 < size) {
            int i4 = asBinder + 79;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            MenuItem item = this.menu.getItem(i3);
            if (i == item.getItemId()) {
                this.selectedItemId = i;
                this.selectedItemPosition = i3;
                item.setChecked(true);
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 57;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
                return;
            }
            i3++;
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 33;
            asBinder = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    SparseArray<BadgeDrawable> getBadgeDrawables() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        SparseArray<BadgeDrawable> sparseArray = this.badgeDrawables;
        int i5 = i2 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return sparseArray;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    void restoreBadgeDrawables(SparseArray<BadgeDrawable> sparseArray) {
        int i = 2 % 2;
        int i2 = asBinder + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        for (int i4 = 0; i4 < sparseArray.size(); i4++) {
            int iKeyAt = sparseArray.keyAt(i4);
            if (this.badgeDrawables.indexOfKey(iKeyAt) < 0) {
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 41;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                this.badgeDrawables.append(iKeyAt, sparseArray.get(iKeyAt));
            }
        }
        NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                BadgeDrawable badgeDrawable = this.badgeDrawables.get(navigationBarItemView.getId());
                if (badgeDrawable != null) {
                    int i7 = asBinder + 117;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
                    int i8 = i7 % 2;
                    navigationBarItemView.setBadge(badgeDrawable);
                    if (i8 != 0) {
                        int i9 = 0 / 0;
                    }
                }
            }
        }
    }

    public BadgeDrawable getBadge(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        BadgeDrawable badgeDrawable = this.badgeDrawables.get(i);
        int i5 = asBinder + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return badgeDrawable;
        }
        throw null;
    }

    BadgeDrawable getOrCreateBadge(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            validateMenuItemId(i);
            this.badgeDrawables.get(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        validateMenuItemId(i);
        BadgeDrawable badgeDrawableCreate = this.badgeDrawables.get(i);
        if (badgeDrawableCreate == null) {
            int i4 = asBinder + 31;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            badgeDrawableCreate = BadgeDrawable.create(getContext());
            this.badgeDrawables.put(i, badgeDrawableCreate);
        }
        NavigationBarItemView navigationBarItemViewFindItemView = findItemView(i);
        if (navigationBarItemViewFindItemView != null) {
            navigationBarItemViewFindItemView.setBadge(badgeDrawableCreate);
        }
        return badgeDrawableCreate;
    }

    void removeBadge(int i) {
        int i2 = 2 % 2;
        validateMenuItemId(i);
        NavigationBarItemView navigationBarItemViewFindItemView = findItemView(i);
        if (navigationBarItemViewFindItemView != null) {
            navigationBarItemViewFindItemView.removeBadge();
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 27;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 % 3;
            }
        }
        this.badgeDrawables.put(i, null);
        int i5 = asBinder + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
    }

    private void setBadgeIfNeeded(NavigationBarItemView navigationBarItemView) {
        int i = 2 % 2;
        int i2 = asBinder + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        int id2 = navigationBarItemView.getId();
        if (!isValidId(id2)) {
            return;
        }
        int i4 = asBinder + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        BadgeDrawable badgeDrawable = this.badgeDrawables.get(id2);
        if (badgeDrawable != null) {
            navigationBarItemView.setBadge(badgeDrawable);
        }
    }

    private void removeUnusedBadges() {
        int i = 2 % 2;
        HashSet hashSet = new HashSet();
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        while (i4 < this.menu.size()) {
            hashSet.add(Integer.valueOf(this.menu.getItem(i4).getItemId()));
            i4++;
            int i5 = asBinder + 69;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
        }
        for (int i7 = 0; i7 < this.badgeDrawables.size(); i7++) {
            int i8 = asBinder + 45;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
            int i9 = i8 % 2;
            int iKeyAt = this.badgeDrawables.keyAt(i7);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
                asBinder = i10 % 128;
                if (i10 % 2 == 0) {
                    this.badgeDrawables.delete(iKeyAt);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                this.badgeDrawables.delete(iKeyAt);
            }
        }
    }

    public NavigationBarItemView findItemView(int i) {
        int i2 = 2 % 2;
        validateMenuItemId(i);
        NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr == null) {
            return null;
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
            if (navigationBarItemView.getId() == i) {
                int i5 = asBinder + 63;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
                int i6 = i5 % 2;
                return navigationBarItemView;
            }
        }
        return null;
    }

    protected int getSelectedItemPosition() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 13;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return this.selectedItemPosition;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected MenuBuilder getMenu() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = asBinder + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cMyTid = (char) ((Process.myTid() >> 22) + 29944);
            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 1755;
            int iMyPid = (Process.myPid() >> 22) + 23;
            short s = $$a[7];
            byte b2 = (byte) s;
            Object[] objArr2 = new Object[1];
            a(s, b2, (byte) (b2 | 15), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyTid, longPressTimeout, iMyPid, 986134021, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{21, 18, 24, '\t', 17, 1, 26, '\t', 14, 16, 14, 2, '\t', 17, '\r', 30, 18, 1, 17, 14, 3, '\b'}, (byte) (55 - TextUtils.lastIndexOf("", '0', 0)), 22 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{Typography.quote, '\r', 18, ' ', '\r', '!', 25, 3, ' ', 19, 17, '\r', 1, 23, 13854}, (byte) (31 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), AndroidCharacter.getMirror('0') - '!', objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (29944 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
            int iIndexOf = TextUtils.indexOf("", "", 0) + 1755;
            int i4 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23;
            byte b3 = $$a[7];
            Object[] objArr5 = new Object[1];
            a((short) 37, b3, b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iIndexOf, i4, 1596667560, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 29944);
                int size = 1755 - View.MeasureSpec.getSize(0);
                int iMyPid2 = 23 - (Process.myPid() >> 22);
                byte b4 = $$a[7];
                Object[] objArr6 = new Object[1];
                a((short) 89, b4, b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionGroup, size, iMyPid2, 1599039318, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i7 = ((int[]) objArr7[0])[0];
            objArr = new Object[]{new int[]{i7}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[1], (String[]) objArr7[4]};
            int i8 = ~((~System.identityHashCode(this)) | (-495709656));
            int i9 = (((((-1069546968) | i8) * (-970)) - 437282359) + ((i8 | 573837312) * 970)) - 418458888;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[3])[0] = i11 ^ (i11 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{26, 22, 2, 22, '\n', 14, 21, 18, 2, '\t', '#', '\b', 16, '\r', 1, 25}, (byte) (ExpandableListView.getPackedPositionChild(0L) + 16), 16 - Color.green(0), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{3, 29, '#', 19, 17, 0, 17, 6, ' ', 22, 21, 3, 1, '\f', 25, '!'}, (byte) (108 - (ViewConfiguration.getWindowTouchSlop() >> 8)), (ViewConfiguration.getPressedStateDuration() >> 16) + 16, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-1559902212};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (42049 - View.resolveSizeAndState(0, 0, 0)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1727, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 28, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrB$5f1425da = ItemProgramChosenBinding.b$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), -418458888);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29944);
                    int trimmedLength = 1755 - TextUtils.getTrimmedLength("");
                    int i12 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23;
                    byte b5 = $$a[7];
                    Object[] objArr11 = new Object[1];
                    a((short) 89, b5, b5, objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarFadeDuration, trimmedLength, i12, 1599039318, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrB$5f1425da);
                try {
                    Object[] objArr12 = new Object[1];
                    c(new char[]{21, 18, 24, '\t', 17, 1, 26, '\t', 14, 16, 14, 2, '\t', 17, '\r', 30, 18, 1, 17, 14, 3, '\b'}, (byte) (Color.blue(0) + 56), 22 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr12);
                    Class<?> cls3 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    c(new char[]{Typography.quote, '\r', 18, ' ', '\r', '!', 25, 3, ' ', 19, 17, '\r', 1, 23, 13854}, (byte) (30 - TextUtils.indexOf((CharSequence) "", '0')), 16 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr13);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 29944);
                        int scrollBarFadeDuration2 = 1755 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int deadChar = 23 - KeyEvent.getDeadChar(0, 0);
                        byte b6 = $$a[7];
                        Object[] objArr14 = new Object[1];
                        a((short) 37, b6, b6, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollBarSize, scrollBarFadeDuration2, deadChar, 1596667560, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char capsMode = (char) (29944 - TextUtils.getCapsMode("", 0, 0));
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 1755;
                        int iIndexOf2 = 22 - TextUtils.indexOf((CharSequence) "", '0');
                        short s2 = $$a[7];
                        byte b7 = (byte) s2;
                        Object[] objArr15 = new Object[1];
                        a(s2, b7, (byte) (b7 | 15), objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(capsMode, iResolveSizeAndState, iIndexOf2, 986134021, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                    objArr = objArrB$5f1425da;
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
        int i14 = ((int[]) objArr[0])[0];
        if (i14 == i13) {
            int i15 = asBinder + 65;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i15 % 128;
            int i16 = i15 % 2;
            int i17 = ((int[]) objArr[3])[0];
            int i18 = ((int[]) objArr[0])[0];
            Object[] objArr16 = {new int[]{i18}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i19 = i17 + (-1028961863) + (((~(390246158 | iIdentityHashCode)) | 602848584) * (-366)) + (((~(iIdentityHashCode | 938393422)) | 54701320) * 366);
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr16[3])[0] = i21 ^ (i21 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i22 = asBinder + 119;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i22 % 128;
                int i23 = i22 % 2;
                int i24 = 0;
                while (i24 < strArr.length) {
                    arrayList.add(strArr[i24]);
                    i24++;
                    int i25 = asBinder + 79;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i25 % 128;
                    int i26 = i25 % 2;
                }
            }
            Toast.makeText((Context) null, i14 / (((i14 - 1) * i14) % 2), 0).show();
            int i27 = ((int[]) objArr[3])[0];
            int i28 = ((int[]) objArr[0])[0];
            Object[] objArr17 = {new int[]{i28}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i29 = i27 + (-501642194) + (((~((-621809669) | iUptimeMillis)) | (~((-409207243) | iUptimeMillis))) * 69) + (((~(iUptimeMillis | (-417613276))) | (~((-630215702) | iUptimeMillis)) | 8406033) * (-69)) + 1294260896;
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArr17[3])[0] = i31 ^ (i31 << 5);
        }
        return this.menu;
    }

    private void validateMenuItemId(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            isValidId(i);
            throw null;
        }
        if (isValidId(i)) {
            int i4 = asBinder + 13;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append(" is not a valid view id");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private boolean isValidId(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i4 = i3 + 73;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 24 / 0;
            if (i != -1) {
                return true;
            }
        } else if (i != -1) {
            return true;
        }
        int i6 = i3 + 117;
        asBinder = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 5 / 0;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public int getWindowAnimations() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    protected boolean isShifting(int i, int i2) {
        int i3 = 2 % 2;
        if (i != -1) {
            if (i == 0) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
                asBinder = i4 % 128;
                return i4 % 2 != 0;
            }
            int i5 = asBinder + 125;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (i2 > 3) {
            int i7 = asBinder + 111;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
            int i8 = i7 % 2;
            return true;
        }
        int i9 = asBinder + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        b = new char[]{60088, 60073, 60056, 60060, 60045, 60050, 60041, 60035, 60117, 60048, 60090, 60034, 60047, 60052, 60033, 60040, 60055, 60092, 60046, 60054, 60058, 60037, 60079, 60053, 60032, 60094, 60093, 60063, 60049, 60091, 60043, 60062, 60072, 60051, 60083, 60095};
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (char) 57191;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r6, short r7, byte r8) {
        /*
            int r8 = r8 * 4
            int r8 = 4 - r8
            int r7 = 116 - r7
            int r6 = r6 * 2
            int r0 = 1 - r6
            byte[] r1 = com.google.android.material.navigation.NavigationBarMenuView.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L17
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2a
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            r3 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2a:
            int r8 = -r8
            int r7 = r7 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationBarMenuView.$$i(int, short, byte):java.lang.String");
    }
}
